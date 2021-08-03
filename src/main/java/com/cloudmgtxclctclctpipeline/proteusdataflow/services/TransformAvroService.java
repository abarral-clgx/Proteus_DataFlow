package com.cloudmgtxclctclctpipeline.proteusdataflow.services;

import java.io.Serializable;

import org.apache.avro.generic.GenericRecord;
import org.apache.beam.sdk.io.kafka.KafkaRecord;
import org.apache.beam.sdk.options.PipelineOptions;
import org.apache.beam.sdk.transforms.DoFn;
import org.apache.beam.sdk.transforms.ParDo;
import org.apache.beam.sdk.values.PCollection;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TransformAvroService implements Serializable {

    private static final long serialVersionUID = 1L;

    @NonNull
    private final PipelineOptions options;

    public PCollection<GenericRecord> transform(
            PCollection<KafkaRecord<Long, GenericRecord>> records,
            String fnDescription,
            DoFn<KafkaRecord<Long, GenericRecord>, GenericRecord> doFn) {
        return records.apply(fnDescription, ParDo.of(doFn));
    }
}
