package com.cloudmgtxclctclctpipeline.proteusdataflow.runner;

import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.options.PipelineOptions;

class PipelineFactory {

    public static Pipeline newPipeline(PipelineOptions options) {
        return Pipeline.create(options);
    }
}
