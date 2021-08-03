package com.cloudmgtxclctclctpipeline.proteusdataflow.services;

import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.values.PCollection;

public interface SourceService<T> {

    public PCollection<T> read(Pipeline pipeline);
	
}
