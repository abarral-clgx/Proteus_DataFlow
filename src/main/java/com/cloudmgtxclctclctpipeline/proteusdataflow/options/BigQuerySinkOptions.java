package com.cloudmgtxclctclctpipeline.proteusdataflow.options;

import org.apache.beam.sdk.options.Description;
import org.apache.beam.sdk.options.PipelineOptions;
import org.apache.beam.sdk.options.Validation.Required;

public interface BigQuerySinkOptions extends PipelineOptions {

    @Description("BigQuery Sink Temp Location")
    @Required
    String getBigQuerySinkTempLocation();
    void setBigQuerySinkTempLocation(String location);

    @Description("BigQuery Sink Project")
    @Required
    String getBigQuerySinkProject();
    void setBigQuerySinkProject(String project);

    @Description("BigQuery Sink Dataset Name")
    @Required
    String getBigQuerySinkDatasetName();
    void setBigQuerySinkDatasetName(String datasetName);

    @Description("BigQuery Sink Table Name")
    @Required
    String getBigQuerySinkTableName();
    void setBigQuerySinkTableName(String tableName);
}
