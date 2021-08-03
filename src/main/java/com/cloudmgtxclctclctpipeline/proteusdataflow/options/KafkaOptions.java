package com.cloudmgtxclctclctpipeline.proteusdataflow.options;

import org.apache.beam.sdk.options.Default;
import org.apache.beam.sdk.options.Description;
import org.apache.beam.sdk.options.PipelineOptions;

public interface KafkaOptions extends PipelineOptions {

    @Description("Kafka Security Protocol")
    String getKafkaSecurityProtocol();
    void setKafkaSecurityProtocol(String kafkaSecurityProtocol);

    @Description("Is Kafka Krb5 File Local")
    @Default.Boolean(true)
    boolean isKafkaKrb5FileLocal();
    void setKafkaKrb5FileLocal(boolean iskrb5FileLocal);

    @Description("Kafka Krb5 File Remote URI")
    String getKafkaKrb5FileRemoteUri();
    void setKafkaKrb5FileRemoteUri(String krb5FileRemoteUri);

    @Description("Kafka Krb5 File Local Path")
    String getKafkaKrb5FileLocalPath();
    void setKafkaKrb5FileLocalPath(String krb5FileLocalPath);

    @Description("Is Kafka Trust Store File Local")
    @Default.Boolean(true)
    boolean isKafkaTrustStoreFileLocal();
    void setKafkaTrustStoreFileLocal(boolean isTrustStoreFileLocal);

    @Description("Kafka Trust Store File Remote URI")
    String getKafkaTrustStoreFileRemoteUri();
    void setKafkaTrustStoreFileRemoteUri(String trustStoreFileRemoteUri);

    @Description("Kafka Trust Store Local Path")
    String getKafkaTrustStoreFileLocalPath();
    void setKafkaTrustStoreFileLocalPath(String trustStoreFileLocalPath);

    @Description("Kafka Trust Store File Password")
    String getKafkaTrustStoreFilePassword();
    void setKafkaTrustStoreFilePassword(String trustStoreFilePassword);

    @Description("Kafka Trust Store File Type")
    String getKafkaTrustStoreFileType();
    void setKafkaTrustStoreFileType(String trustStoreFileType);
}
