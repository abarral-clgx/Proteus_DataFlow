package com.cloudmgtxclctclctpipeline.proteusdataflow.utils;

import com.cloudmgtxclctclctpipeline.proteusdataflow.domain.Orders;
import com.cloudmgtxclctclctpipeline.proteusdataflow.options.KafkaSourceOptions;
import com.google.common.collect.ImmutableMap;
import org.apache.avro.LogicalType;
import org.apache.avro.LogicalTypes;
import org.apache.avro.Schema;
import org.apache.kafka.clients.CommonClientConfigs;
import org.apache.kafka.common.config.SaslConfigs;
import org.apache.kafka.common.config.SslConfigs;

import java.util.HashMap;
import java.util.Map;

public class KafkaUtils {

	private static final String Sasl_CONFIG_STRING = "com.sun.security.auth.module.Krb5LoginModule required doNotPrompt=true useKeyTab=true debug=true storeKey=true keyTab=\"%s\" principal=\"%s\";";

	public static ImmutableMap<String, Object> getKafkaSourceConfiguration(KafkaSourceOptions options) {
		Map<String, Object> config = new HashMap<>();
		config.put("group.id", options.getKafkaSourceGroup());
		if (options.isKafkaSourceBrokerSecure()) {
            config.put(CommonClientConfigs.SECURITY_PROTOCOL_CONFIG, options.getKafkaSecurityProtocol());
            config.put(SaslConfigs.SASL_MECHANISM, options.getKafkaSourceSaslMechanism());
            config.put(SaslConfigs.SASL_KERBEROS_SERVICE_NAME, options.getKafkaSourceSaslKerberosFileServiceName());
            config.put(SaslConfigs.SASL_JAAS_CONFIG, String.format(Sasl_CONFIG_STRING, options.getKafkaSourceSaslKerberosFileLocalPath(), options.getKafkaSourceSaslKerberosFilePrincipal()));
            config.put(SslConfigs.SSL_TRUSTSTORE_LOCATION_CONFIG, options.getKafkaTrustStoreFileLocalPath());
            config.put(SslConfigs.SSL_TRUSTSTORE_PASSWORD_CONFIG, options.getKafkaTrustStoreFilePassword());
            config.put(SslConfigs.SSL_TRUSTSTORE_TYPE_CONFIG, options.getKafkaTrustStoreFileType());
		}
		return ImmutableMap.copyOf(config);
	}

    public static Schema getRecordSchema() {
        return Orders.getClassSchema();
    }
    
	public static boolean isLogicalTypeTimestampMillis(LogicalType type) {
		return type != null && type == LogicalTypes.timestampMillis();
	}
}
