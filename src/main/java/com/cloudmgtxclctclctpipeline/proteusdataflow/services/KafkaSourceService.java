package com.cloudmgtxclctclctpipeline.proteusdataflow.services;

import java.io.Serializable;
import com.cloudmgtxclctclctpipeline.proteusdataflow.options.KafkaSourceOptions;
import com.cloudmgtxclctclctpipeline.proteusdataflow.utils.KafkaUtils;
import io.confluent.kafka.serializers.subject.TopicNameStrategy;
import org.apache.avro.generic.GenericRecord;
import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.kafka.ConfluentSchemaRegistryDeserializerProvider;
import org.apache.beam.sdk.io.kafka.KafkaIO;
import org.apache.beam.sdk.io.kafka.KafkaRecord;
import org.apache.beam.sdk.values.PCollection;
import org.apache.kafka.common.serialization.LongDeserializer;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class KafkaSourceService implements SourceService<KafkaRecord<Long, GenericRecord>>, Serializable {

    private static final long serialVersionUID = 1L;
    private static final String KAFKA_READ_DESCRIPTION = "Read from Kafka";

    @NonNull
    private final KafkaSourceOptions kafkaOptions;
    private KafkaIO.Read<Long, GenericRecord> reader;

    @Override
    public PCollection<KafkaRecord<Long, GenericRecord>> read(Pipeline pipeline) {
        return pipeline.apply(KAFKA_READ_DESCRIPTION, consume());
    }

    private KafkaIO.Read<Long, GenericRecord> consume() {

        return getReader()
                .withBootstrapServers(kafkaOptions.getKafkaSourceBrokers())
                .withTopic(kafkaOptions.getKafkaSourceTopic())
                .withConsumerConfigUpdates(KafkaUtils.getKafkaSourceConfiguration(kafkaOptions))
                .withKeyDeserializer(LongDeserializer.class)
                .withValueDeserializer(getValueDeserializer())
                .withReadCommitted()
                .commitOffsetsInFinalize();
    }

    private ConfluentSchemaRegistryDeserializerProvider<GenericRecord> getValueDeserializer() {
        return ConfluentSchemaRegistryDeserializerProvider.of(
                kafkaOptions.getKafkaSourceSchemaRegistryUri(),
                getSubjectName("orders", false)
        );
    }

    private String getSubjectName(String topic, boolean isKey) {
        return new TopicNameStrategy().subjectName(topic, isKey, null);
    }

    private KafkaIO.Read<Long, GenericRecord> getReader() {
        if (reader == null) {
            reader = KafkaIO.read();
        }
        return reader;
    }
}
