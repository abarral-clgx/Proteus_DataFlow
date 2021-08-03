package com.cloudmgtxclctclctpipeline.proteusdataflow.runner;

import com.cloudmgtxclctclctpipeline.proteusdataflow.options.ProteusDataFlowPipelinesOptions;
import com.cloudmgtxclctclctpipeline.proteusdataflow.services.BigQuerySinkService;
import com.cloudmgtxclctclctpipeline.proteusdataflow.services.KafkaSourceService;
import com.cloudmgtxclctclctpipeline.proteusdataflow.services.TransformAvroService;
import com.cloudmgtxclctclctpipeline.proteusdataflow.utils.KafkaRecordToStandardRecordFn;

import lombok.extern.slf4j.Slf4j;
import org.apache.avro.generic.GenericRecord;
import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.kafka.KafkaRecord;
import org.apache.beam.sdk.values.PCollection;
import org.apache.beam.runners.dataflow.options.DataflowPipelineOptions;

import java.io.IOException;
import java.io.Serializable;

import static com.cloudmgtxclctclctpipeline.proteusdataflow.utils.KafkaRecordToStandardRecordFn.MAP_SCHEMA_DESCRIPTION;

@Slf4j
public class ProteusDataFlowRunner implements Serializable {

    private static final long serialVersionUID = 1L;

    private final ProteusDataFlowPipelinesOptions options;
    private com.cloudmgtxclctclctpipeline.proteusdataflow.services.KafkaSourceService kafkaSourceService;
    private com.cloudmgtxclctclctpipeline.proteusdataflow.services.TransformAvroService transformAvroService;
    private BigQuerySinkService bigQuerySinkService;

    public ProteusDataFlowRunner(ProteusDataFlowPipelinesOptions options) {
        this.options = options;
    }

    public static ProteusDataFlowRunner withOptions(ProteusDataFlowPipelinesOptions options) {
        return new ProteusDataFlowRunner(options);
    }

    private com.cloudmgtxclctclctpipeline.proteusdataflow.services.KafkaSourceService getKafkaSourceService() {
        if (kafkaSourceService == null) {
            kafkaSourceService = new KafkaSourceService(options);
        }
        return kafkaSourceService;
    }

    private TransformAvroService getTransformAvroService() {
        if (transformAvroService == null) {
            transformAvroService = new TransformAvroService(options);
        }
        return transformAvroService;
    }

    private BigQuerySinkService getBigQuerySinkService() {
        if (bigQuerySinkService == null) {
            bigQuerySinkService = new BigQuerySinkService(options);
        }

        return bigQuerySinkService;
    }

    public void runPipeLine() throws IOException {
        Pipeline pipeline = PipelineFactory.newPipeline(options);

        PCollection<KafkaRecord<Long, GenericRecord>> kafkaStream = getKafkaSourceService().read( pipeline );
        PCollection<GenericRecord> transformedStream = getTransformAvroService().transform(
                kafkaStream,
                MAP_SCHEMA_DESCRIPTION,
                new KafkaRecordToStandardRecordFn()
        );

        getBigQuerySinkService().write(transformedStream);

        pipeline.run();
    }
}

