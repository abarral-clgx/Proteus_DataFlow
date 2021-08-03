package com.cloudmgtxclctclctpipeline.proteusdataflow.options;

import org.apache.beam.sdk.options.Default;
import org.apache.beam.sdk.options.Description;
import org.apache.beam.sdk.options.Validation.Required;

public interface KafkaSourceOptions extends KafkaOptions {

    @Description("Kafka Source Topic")
    @Required
    String getKafkaSourceTopic();
    void setKafkaSourceTopic(String topic);

    @Description("Kafka	Source Brokers")
    @Required
    String getKafkaSourceBrokers();
    void setKafkaSourceBrokers(String brokers);

    @Description("Kafka Source Schema Registry")
    @Required
    String getKafkaSourceSchemaRegistryUri();
    void setKafkaSourceSchemaRegistryUri(String registryUri);
        
    @Description("Kafka Source Group")
    @Required
    String getKafkaSourceGroup();
    void setKafkaSourceGroup(String group);
        
    @Description("Is Kafka Source Broker Secure")
    @Default.Boolean(true)
    boolean isKafkaSourceBrokerSecure();
    void setKafkaSourceBrokerSecure(boolean kafkaSecure);
        
    @Description("Kafka Source Sasl Mechanism")
    String getKafkaSourceSaslMechanism();
    void setKafkaSourceSaslMechanism(String mechanism);
        
    @Description("Kafka Source Sasl Kerberos File Service Name")
    String getKafkaSourceSaslKerberosFileServiceName();
    void setKafkaSourceSaslKerberosFileServiceName(String name);
        
    @Description("Is Kafka Source Sasl Kerberos File Local")
    @Default.Boolean(false)
    boolean isKafkaSourceSaslKerberosFileLocal();
    void setKafkaSourceSaslKerberosFileLocal(boolean saslKerberosFileLocal);
        
    @Description("Kafka Source Sasl Kerberos File Remote Uri")
    String getKafkaSourceSaslKerberosFileRemoteUri();
    void setKafkaSourceSaslKerberosFileRemoteUri(String keyTabRemoteUri);
        
    @Description("Kafka Source Sasl Kerberos File Local Path")
    String getKafkaSourceSaslKerberosFileLocalPath();
    void setKafkaSourceSaslKerberosFileLocalPath(String keyTabLocalPath);
        
    @Description("Kafka Source Sasl Kerberos File Principal")
    String getKafkaSourceSaslKerberosFilePrincipal();
    void setKafkaSourceSaslKerberosFilePrincipal(String principal);

}
