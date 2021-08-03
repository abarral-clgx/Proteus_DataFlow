package com.cloudmgtxclctclctpipeline.proteusdataflow;

import org.apache.beam.sdk.options.PipelineOptionsFactory;
import com.cloudmgtxclctclctpipeline.proteusdataflow.services.*;

import java.io.IOException;

public class ProteusDataFlowMain {
    public static void main(String[] args) throws IOException {

        com.cloudmgtxclctclctpipeline.proteusdataflow.options.ProteusDataFlowPipelinesOptions proteusDataFlowPipelinesOptions = PipelineOptionsFactory
                .fromArgs(args)
                .withValidation()
                .as(com.cloudmgtxclctclctpipeline.proteusdataflow.options.ProteusDataFlowPipelinesOptions.class);

        com.cloudmgtxclctclctpipeline.proteusdataflow.runner.ProteusDataFlowRunner
                .withOptions(proteusDataFlowPipelinesOptions).runPipeLine();
    }
}
