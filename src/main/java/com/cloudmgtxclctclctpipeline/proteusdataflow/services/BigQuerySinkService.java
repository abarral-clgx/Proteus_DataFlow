package com.cloudmgtxclctclctpipeline.proteusdataflow.services;

import static com.cloudmgtxclctclctpipeline.proteusdataflow.utils.BigQueryAvroUtils.convertGenericRecordToTableRow;
import static com.cloudmgtxclctclctpipeline.proteusdataflow.utils.KafkaUtils.getRecordSchema;
import static org.apache.beam.sdk.io.gcp.bigquery.BigQueryUtils.toTableSchema;
import static org.apache.beam.sdk.schemas.utils.AvroUtils.toBeamSchema;

import java.io.Serializable;

import com.cloudmgtxclctclctpipeline.proteusdataflow.options.BigQuerySinkOptions;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericRecord;
import org.apache.beam.sdk.io.gcp.bigquery.BigQueryIO;
import org.apache.beam.sdk.options.ValueProvider.StaticValueProvider;
import org.apache.beam.sdk.transforms.MapElements;
import org.apache.beam.sdk.values.PCollection;
import org.apache.beam.sdk.values.TypeDescriptor;

import com.google.api.services.bigquery.model.TableReference;
import com.google.api.services.bigquery.model.TableRow;
import com.google.api.services.bigquery.model.TableSchema;
import com.google.cloud.bigquery.BigQuery;
import com.google.cloud.bigquery.DatasetInfo;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BigQuerySinkService implements com.cloudmgtxclctclctpipeline.proteusdataflow.services.SinkService<GenericRecord>, Serializable {

	private static final long serialVersionUID = 1L;
	public static final String CONVERT_AVRO_TO_TABLE_ROWS_DESCRIPTION = "Convert Avro records to TableRows";
	public static final String BIGQUERY_WRITE_DESCRIPTION = "Write to BigQuery";

    @NonNull
	private final BigQuerySinkOptions bigQueryOptions;
	private BigQueryIO.Write<TableRow> writer;

	public void write(PCollection<GenericRecord> stream) {
		PCollection<TableRow> tableRows = convertToTableRow(stream);

		TableReference tableReference = new TableReference()
				.setProjectId(bigQueryOptions.getBigQuerySinkProject())
				.setDatasetId(bigQueryOptions.getBigQuerySinkDatasetName())
				.setTableId(bigQueryOptions.getBigQuerySinkTableName());

		writeToBigQuery(tableRows, bigQueryOptions.getTempLocation(), tableReference);
	}

	public PCollection<TableRow> convertToTableRow(PCollection<GenericRecord> records) {
		return records.apply(CONVERT_AVRO_TO_TABLE_ROWS_DESCRIPTION,
				MapElements.into(TypeDescriptor.of(TableRow.class))
						.via((GenericRecord genericRecord) -> convertGenericRecordToTableRow(genericRecord,
								convertToTableSchema(getRecordSchema()))));
	}

	public void writeToBigQuery(PCollection<TableRow> tableRows, String gcpTempLocation,
			TableReference tableReference) {

		tableRows.apply(BIGQUERY_WRITE_DESCRIPTION,
				getWriter().withCustomGcsTempLocation(StaticValueProvider.of(gcpTempLocation)).to(tableReference)
						.withSchema(convertToTableSchema(getRecordSchema()))
						.withCreateDisposition(BigQueryIO.Write.CreateDisposition.CREATE_IF_NEEDED)
						.withWriteDisposition(BigQueryIO.Write.WriteDisposition.WRITE_APPEND));
	}

	private BigQueryIO.Write<TableRow> getWriter() {
		if (writer == null) {
			writer = BigQueryIO.writeTableRows();
		}

		return writer;
	}

	public static TableSchema convertToTableSchema(Schema avroSchema) {
		return toTableSchema(toBeamSchema(avroSchema));
	}

	public static void createDataset(BigQuery bigQuery, String datasetName) {
		if (bigQuery.getDataset(datasetName) == null) {
			bigQuery.create(DatasetInfo.newBuilder(datasetName).build());
		}
	}
}
