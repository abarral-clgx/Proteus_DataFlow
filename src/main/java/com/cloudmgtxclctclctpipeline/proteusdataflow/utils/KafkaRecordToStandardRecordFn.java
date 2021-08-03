package com.cloudmgtxclctclctpipeline.proteusdataflow.utils;

import org.apache.avro.generic.GenericRecord;
import org.apache.beam.sdk.io.kafka.KafkaRecord;
import org.apache.beam.sdk.transforms.DoFn;

import java.util.Objects;

public class KafkaRecordToStandardRecordFn extends DoFn<KafkaRecord<Long, GenericRecord>, GenericRecord>{

    private static final long serialVersionUID = 1L;

    public static final String MAP_SCHEMA_DESCRIPTION = "Kafka Record To Generic Record Transform";

    @ProcessElement
    public void map(ProcessContext c) {
        c.output(Objects.requireNonNull(c.element()).getKV().getValue());
    }

}
