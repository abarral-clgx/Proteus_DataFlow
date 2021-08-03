package com.cloudmgtxclctclctpipeline.proteusdataflow.services;

import org.apache.beam.sdk.values.PCollection;

import java.io.IOException;

public interface SinkService<T> {

	void write(PCollection<T> stream) throws IOException;
	
}
