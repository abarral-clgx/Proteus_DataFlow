package com.cloudmgtxclctclctpipeline.proteusdataflow.services;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.Security;

import com.cloudmgtxclctclctpipeline.proteusdataflow.options.KafkaSourceOptions;
import org.apache.beam.sdk.harness.JvmInitializer;
import org.apache.beam.sdk.options.PipelineOptions;

import com.google.auto.service.AutoService;
import com.google.cloud.storage.Blob;
import com.google.cloud.storage.BlobId;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;

@AutoService(JvmInitializer.class)
public class PipelineInitializer implements JvmInitializer {

    private Storage storage;

    public PipelineInitializer() {}

    public PipelineInitializer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void onStartup() {
        Security.setProperty("jdk.tls.disabledAlgorithms", "");
    }

	@Override
    final public void beforeProcessing(PipelineOptions options) {
		
		initializeKafka(options);
		
    }

	private void initializeKafka(PipelineOptions options) {
		KafkaSourceOptions kafkaSourceOptions = options.as(KafkaSourceOptions.class);
		if (kafkaSourceOptions.isKafkaSourceBrokerSecure()) {
	        if (!kafkaSourceOptions.isKafkaKrb5FileLocal()) {
	            downloadSecureFile(
	            		kafkaSourceOptions.getKafkaKrb5FileRemoteUri(),
	            		kafkaSourceOptions.getKafkaKrb5FileLocalPath());
	        }
	        System.setProperty("java.security.krb5.conf", kafkaSourceOptions.getKafkaKrb5FileLocalPath());
	        if (!kafkaSourceOptions.isKafkaTrustStoreFileLocal()) {
	            downloadSecureFile(
	            		kafkaSourceOptions.getKafkaTrustStoreFileRemoteUri(),
	            		kafkaSourceOptions.getKafkaTrustStoreFileLocalPath());
	        }
	        if (!kafkaSourceOptions.isKafkaSourceSaslKerberosFileLocal()) {
	            downloadSecureFile(
	            		kafkaSourceOptions.getKafkaSourceSaslKerberosFileRemoteUri(),
	            		kafkaSourceOptions.getKafkaSourceSaslKerberosFileLocalPath());
	        }
		}
	}

    protected void downloadSecureFile(String filePath, String downloadPath) {
        final Path path = Paths.get(downloadPath);
        if (!path.toFile().exists()) {
            if (storage == null) {
                this.storage = StorageOptions.getDefaultInstance().getService();
            }
            try {
                final URI uri = URI.create(filePath);
                final Blob blob = storage.get(getBlobId(uri));

                blob.downloadTo(path);
            } catch (Exception e) {
                System.err.println("Downloading file failed: " + filePath);
                throw e;
            }
        }
    }

    protected BlobId getBlobId(URI uri) {
        return BlobId.of(
                uri.getAuthority(),
                uri.getPath().startsWith("/") ? uri.getPath().substring(1) : uri.getPath());
    }

}
