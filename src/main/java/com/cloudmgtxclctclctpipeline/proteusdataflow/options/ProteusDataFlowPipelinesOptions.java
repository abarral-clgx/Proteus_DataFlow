package com.cloudmgtxclctclctpipeline.proteusdataflow.options;

import org.apache.beam.runners.dataflow.options.DataflowPipelineWorkerPoolOptions;
import org.apache.beam.sdk.annotations.Experimental;
import org.apache.beam.sdk.extensions.gcp.options.GcpOptions;
import org.apache.beam.sdk.extensions.gcp.options.GcsOptions;
import org.apache.beam.sdk.options.*;

public interface ProteusDataFlowPipelinesOptions extends PipelineOptions,
                                                         StreamingOptions,
                                                         GcpOptions,
                                                         GcsOptions,
                                                         DataflowPipelineWorkerPoolOptions,
                                                         KafkaSourceOptions,
                                                         BigQuerySinkOptions {
        @Hidden
        @Experimental
        @Description("Run the job as a specific service account, instead of the default GCE robot.")
        String getServiceAccount();
        void setServiceAccount(String value);

        @Description(
                "The Google Compute Engine region for creating Dataflow jobs. See "
                        + "https://cloud.google.com/compute/docs/regions-zones/regions-zones for a list of valid "
                        + "options.")
        @Default.InstanceFactory(org.apache.beam.runners.dataflow.options.DefaultGcpRegionFactory.class)
        String getRegion();
        void setRegion(String region);
}
