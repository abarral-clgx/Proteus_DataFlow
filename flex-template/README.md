#### Flex template
1. Dockerfile
2. metadata file
3. gcloud auth login
3. gcloud auth application-default login
4. gcloud config set project clgx-idap-clct-app-dev-d20c
5. gcloud builds submit --tag "gcr.io/clgx-idap-clct-app-dev-d20c/idap-dataflow-proteus"
6. gcloud dataflow flex-template build "gs://proteus-dataflow-dev/idap-dataflow-proteus" \
   --image "us.gcr.io/clgx-jenkins-glb-prd-8ea3/dataflow/idap-dataflow-proteus" \
   --sdk-language "JAVA" \
   --metadata-file "proteus-dataflow_metadata"

7. gcloud beta dataflow flex-template run proteus-dataflow-poc 

8 .POST https://dataflow.googleapis.com/v1b3/projects/clgx-idap-clct-app-dev-d20c/locations/us-west1/flexTemplates:launch
{
"launchParameter": {
"containerSpecGcsPath": "gs://proteus-dataflow-dev/flex-templates/idap-dataflow-proteus",
"jobName": "idap-dataflow-proteus-called-by-postman",
"parameters": {
   "KafkaSecurityProtocol": "SASL_SSL"
   "KafkaKrb5FileLocal": "true"
   "KafkaKrb5FileRemoteUri": 
   "KafkaKrb5FileLocalPath": "gs://proteus-dataflow-dev/secrets/krb5.conf"
   "KafkaTrustStoreFileLocal": "true"
   "KafkaTrustStoreFileRemoteUri": 
   "KafkaTrustStoreFileLocalPath": "gs://proteus-dataflow-dev/secrets/dev-client.truststore.jks"
   "KafkaTrustStoreFilePassword": "{cipher}AQAapRoWBQZkwpMUSNX+Vypw9rYqrXIH3pO58b/3Exu7CWGQJccQfxKmLgYfEAB1p9uMGzyvmhlPYeAvzLPh8xH7wcPd4GtKxYlens5g4YT4rvTKVLEmKbQliwdEUfyJ1y8IXSpxBnlFcnL0o1zLdmz8IK0UBrYmkcaPrXBuN62IAG6OYPw7U7fj3bIiMILOaRhEVknNZZX8Q0NMH9bZq5XqVS9wFxIbKXHpfQRDJy0V6xiHMhw+nfi/HGz3T8W/jgSG10PO4/kRq7n2w8+kyid61iwFfPdlGtaKtUw6zto7u7UYr7MDU3lBiLpajVYrUQCmaMsJ7afP9ykkhLPoNZ/iy/krv+JTdFczITuWgsRTCdWef7e2wKyR2Sj5TzjT79YvfbpbGt+WLwOopi6rh5n2"
   "KafkaTrustStoreFileType": "JKS"
   "KafkaSourceTopic": "orders"
   "KafkaSourceBrokers": "dev-kafka-blue-broker-1.kafka.dev.cloud.clgxdata.com:9093,dev-kafka-blue-broker-2.kafka.dev.cloud.clgxdata.com:9093,dev-kafka-blue-broker-3.kafka.dev.cloud.clgxdata.com:9093,dev-kafka-blue-broker-4.kafka.dev.cloud.clgxdata.com:9093,dev-kafka-blue-broker-5.kafka.dev.cloud.clgxdata.com:9093,dev-kafka-blue-broker-6.kafka.dev.cloud.clgxdata.com:9093"
   "KafkaSourceSchemaRegistryUri": https://dev-kafka-blue-registry.kafka.dev.cloud.clgxdata.com:8081
   "KafkaSourceGroup": "proteus-dataflow"
   "KafkaSourceBrokerSecure": 
   "KafkaSourceSaslMechanism": "GSSAPI"
   "tKafkaSourceSaslKerberosFileServiceName": "kafka"
   "KafkaSourceSaslKerberosFileLocal": "true"
   "KafkaSourceSaslKerberosFileRemoteUri": 
   "KafkaSourceSaslKerberosFileLocalPath": "gs://proteus-dataflow-dev/secrets/dev-app-aiq-ppln-svc.keytab"
   "KafkaSourceSaslKerberosFilePrincipal": "dev-app-aiq-ppln-svc@IDAP.CORELOGIC.COM"
   "BigQuerySinkTempLocation": "gs://proteus-dataflow-dev/DataFlowTempLocation/"
   "BigQuerySinkProject": "clgx-idap-clct-app-dev-d20c"
   "BigQuerySinkDatasetName": "proteus"
   "BigQuerySinkTableName": "orders"
      },
   "environment": {
   "machineType": "n1-standard-2",
   "maxWorkers": 4,
   "numWorkers": 1,
   "serviceAccountEmail": "dataflow-service-account@clgx-idap-clct-app-dev-d20c.iam.gserviceaccount.com",
   "subnetwork": "https://www.googleapis.com/compute/v1/projects/clgx-network-nonprd-4dd3/regions/us-west1/subnetworks/clgx-idap-us-w1-app-dev-subnet",
   "tempLocation": "gs://proteus-dataflow-dev/DataFlowTempLocation/",
   "workerRegion": "us-west1"
      }
   }
}