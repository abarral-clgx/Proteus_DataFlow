package com.cloudmgtxclctclctpipeline.proteusdataflow.domain;

import org.apache.avro.AvroMissingFieldException;
import org.apache.avro.AvroRuntimeException;
import org.apache.avro.Schema;
import org.apache.avro.Schema.Field;
import org.apache.avro.Schema.Parser;
import org.apache.avro.data.RecordBuilder;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.Encoder;
import org.apache.avro.io.ResolvingDecoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.*;
import org.apache.avro.util.Utf8;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.nio.ByteBuffer;

@AvroGenerated
public class Orders extends SpecificRecordBase implements SpecificRecord {
    private static final long serialVersionUID = 7361883096597355228L;
    public static final Schema SCHEMA$ = (new Parser()).parse("{\"type\":\"record\",\"name\":\"Orders\",\"namespace\":\"com.corelogic.clp.orders.dto\",\"doc\":\"orders\",\"fields\":[{\"name\":\"sourceId\",\"type\":\"string\"},{\"name\":\"eventId\",\"type\":\"string\"},{\"name\":\"correlationId\",\"type\":\"string\"},{\"name\":\"ClientId\",\"type\":\"string\"},{\"name\":\"SourceClientId\",\"type\":\"string\"},{\"name\":\"FolderId\",\"type\":\"string\"},{\"name\":\"LoanNumber\",\"type\":\"string\"},{\"name\":\"LoanPurposeId\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"LoanPurposeDescription\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"LoanClassification\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"ChannelId\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"ChannelDescription\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"Customer\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"PropertyTypeId\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"PropertyTypeDescription\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"StreetNumber\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"Street\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"UnitNumber\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"City\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"State\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"County\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"ZipCode\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"DocumentId\",\"type\":\"string\"},{\"name\":\"ServiceId\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"ServiceName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"ServiceProviderLoginId\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"ServiceProviderId\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"ServiceProviderName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"ServiceProviderFee\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"Reviewer\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"Processor\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"LoanOfficer\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"AppraisedValue\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"AppraisalScore\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"CURiskScore\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"ComplexityScore\",\"type\":[\"null\",\"int\"],\"default\":null}]}");
    private static SpecificData MODEL$ = new SpecificData();
    private static final BinaryMessageEncoder<Orders> ENCODER;
    private static final BinaryMessageDecoder<Orders> DECODER;
    private CharSequence sourceId;
    private CharSequence eventId;
    private CharSequence correlationId;
    private CharSequence ClientId;
    private CharSequence SourceClientId;
    private CharSequence FolderId;
    private CharSequence LoanNumber;
    private CharSequence LoanPurposeId;
    private CharSequence LoanPurposeDescription;
    private CharSequence LoanClassification;
    private CharSequence ChannelId;
    private CharSequence ChannelDescription;
    private CharSequence Customer;
    private CharSequence PropertyTypeId;
    private CharSequence PropertyTypeDescription;
    private CharSequence StreetNumber;
    private CharSequence Street;
    private CharSequence UnitNumber;
    private CharSequence City;
    private CharSequence State;
    private CharSequence County;
    private CharSequence ZipCode;
    private CharSequence DocumentId;
    private CharSequence ServiceId;
    private CharSequence ServiceName;
    private CharSequence ServiceProviderLoginId;
    private CharSequence ServiceProviderId;
    private CharSequence ServiceProviderName;
    private Double ServiceProviderFee;
    private CharSequence Reviewer;
    private CharSequence Processor;
    private CharSequence LoanOfficer;
    private Double AppraisedValue;
    private Integer AppraisalScore;
    private Integer CURiskScore;
    private Integer ComplexityScore;
    private static final DatumWriter<Orders> WRITER$;
    private static final DatumReader<Orders> READER$;

    public static Schema getClassSchema() {
        return SCHEMA$;
    }

    public static BinaryMessageEncoder<Orders> getEncoder() {
        return ENCODER;
    }

    public static BinaryMessageDecoder<Orders> getDecoder() {
        return DECODER;
    }

    public static BinaryMessageDecoder<Orders> createDecoder(SchemaStore resolver) {
        return new BinaryMessageDecoder(MODEL$, SCHEMA$, resolver);
    }

    public ByteBuffer toByteBuffer() throws IOException {
        return ENCODER.encode(this);
    }

    public static Orders fromByteBuffer(ByteBuffer b) throws IOException {
        return (Orders)DECODER.decode(b);
    }

    public Orders() {
    }

    public Orders(CharSequence sourceId, CharSequence eventId, CharSequence correlationId, CharSequence ClientId, CharSequence SourceClientId, CharSequence FolderId, CharSequence LoanNumber, CharSequence LoanPurposeId, CharSequence LoanPurposeDescription, CharSequence LoanClassification, CharSequence ChannelId, CharSequence ChannelDescription, CharSequence Customer, CharSequence PropertyTypeId, CharSequence PropertyTypeDescription, CharSequence StreetNumber, CharSequence Street, CharSequence UnitNumber, CharSequence City, CharSequence State, CharSequence County, CharSequence ZipCode, CharSequence DocumentId, CharSequence ServiceId, CharSequence ServiceName, CharSequence ServiceProviderLoginId, CharSequence ServiceProviderId, CharSequence ServiceProviderName, Double ServiceProviderFee, CharSequence Reviewer, CharSequence Processor, CharSequence LoanOfficer, Double AppraisedValue, Integer AppraisalScore, Integer CURiskScore, Integer ComplexityScore) {
        this.sourceId = sourceId;
        this.eventId = eventId;
        this.correlationId = correlationId;
        this.ClientId = ClientId;
        this.SourceClientId = SourceClientId;
        this.FolderId = FolderId;
        this.LoanNumber = LoanNumber;
        this.LoanPurposeId = LoanPurposeId;
        this.LoanPurposeDescription = LoanPurposeDescription;
        this.LoanClassification = LoanClassification;
        this.ChannelId = ChannelId;
        this.ChannelDescription = ChannelDescription;
        this.Customer = Customer;
        this.PropertyTypeId = PropertyTypeId;
        this.PropertyTypeDescription = PropertyTypeDescription;
        this.StreetNumber = StreetNumber;
        this.Street = Street;
        this.UnitNumber = UnitNumber;
        this.City = City;
        this.State = State;
        this.County = County;
        this.ZipCode = ZipCode;
        this.DocumentId = DocumentId;
        this.ServiceId = ServiceId;
        this.ServiceName = ServiceName;
        this.ServiceProviderLoginId = ServiceProviderLoginId;
        this.ServiceProviderId = ServiceProviderId;
        this.ServiceProviderName = ServiceProviderName;
        this.ServiceProviderFee = ServiceProviderFee;
        this.Reviewer = Reviewer;
        this.Processor = Processor;
        this.LoanOfficer = LoanOfficer;
        this.AppraisedValue = AppraisedValue;
        this.AppraisalScore = AppraisalScore;
        this.CURiskScore = CURiskScore;
        this.ComplexityScore = ComplexityScore;
    }

    public SpecificData getSpecificData() {
        return MODEL$;
    }

    public Schema getSchema() {
        return SCHEMA$;
    }

    public Object get(int field$) {
        switch(field$) {
            case 0:
                return this.sourceId;
            case 1:
                return this.eventId;
            case 2:
                return this.correlationId;
            case 3:
                return this.ClientId;
            case 4:
                return this.SourceClientId;
            case 5:
                return this.FolderId;
            case 6:
                return this.LoanNumber;
            case 7:
                return this.LoanPurposeId;
            case 8:
                return this.LoanPurposeDescription;
            case 9:
                return this.LoanClassification;
            case 10:
                return this.ChannelId;
            case 11:
                return this.ChannelDescription;
            case 12:
                return this.Customer;
            case 13:
                return this.PropertyTypeId;
            case 14:
                return this.PropertyTypeDescription;
            case 15:
                return this.StreetNumber;
            case 16:
                return this.Street;
            case 17:
                return this.UnitNumber;
            case 18:
                return this.City;
            case 19:
                return this.State;
            case 20:
                return this.County;
            case 21:
                return this.ZipCode;
            case 22:
                return this.DocumentId;
            case 23:
                return this.ServiceId;
            case 24:
                return this.ServiceName;
            case 25:
                return this.ServiceProviderLoginId;
            case 26:
                return this.ServiceProviderId;
            case 27:
                return this.ServiceProviderName;
            case 28:
                return this.ServiceProviderFee;
            case 29:
                return this.Reviewer;
            case 30:
                return this.Processor;
            case 31:
                return this.LoanOfficer;
            case 32:
                return this.AppraisedValue;
            case 33:
                return this.AppraisalScore;
            case 34:
                return this.CURiskScore;
            case 35:
                return this.ComplexityScore;
            default:
                throw new AvroRuntimeException("Bad index");
        }
    }

    public void put(int field$, Object value$) {
        switch(field$) {
            case 0:
                this.sourceId = (CharSequence)value$;
                break;
            case 1:
                this.eventId = (CharSequence)value$;
                break;
            case 2:
                this.correlationId = (CharSequence)value$;
                break;
            case 3:
                this.ClientId = (CharSequence)value$;
                break;
            case 4:
                this.SourceClientId = (CharSequence)value$;
                break;
            case 5:
                this.FolderId = (CharSequence)value$;
                break;
            case 6:
                this.LoanNumber = (CharSequence)value$;
                break;
            case 7:
                this.LoanPurposeId = (CharSequence)value$;
                break;
            case 8:
                this.LoanPurposeDescription = (CharSequence)value$;
                break;
            case 9:
                this.LoanClassification = (CharSequence)value$;
                break;
            case 10:
                this.ChannelId = (CharSequence)value$;
                break;
            case 11:
                this.ChannelDescription = (CharSequence)value$;
                break;
            case 12:
                this.Customer = (CharSequence)value$;
                break;
            case 13:
                this.PropertyTypeId = (CharSequence)value$;
                break;
            case 14:
                this.PropertyTypeDescription = (CharSequence)value$;
                break;
            case 15:
                this.StreetNumber = (CharSequence)value$;
                break;
            case 16:
                this.Street = (CharSequence)value$;
                break;
            case 17:
                this.UnitNumber = (CharSequence)value$;
                break;
            case 18:
                this.City = (CharSequence)value$;
                break;
            case 19:
                this.State = (CharSequence)value$;
                break;
            case 20:
                this.County = (CharSequence)value$;
                break;
            case 21:
                this.ZipCode = (CharSequence)value$;
                break;
            case 22:
                this.DocumentId = (CharSequence)value$;
                break;
            case 23:
                this.ServiceId = (CharSequence)value$;
                break;
            case 24:
                this.ServiceName = (CharSequence)value$;
                break;
            case 25:
                this.ServiceProviderLoginId = (CharSequence)value$;
                break;
            case 26:
                this.ServiceProviderId = (CharSequence)value$;
                break;
            case 27:
                this.ServiceProviderName = (CharSequence)value$;
                break;
            case 28:
                this.ServiceProviderFee = (Double)value$;
                break;
            case 29:
                this.Reviewer = (CharSequence)value$;
                break;
            case 30:
                this.Processor = (CharSequence)value$;
                break;
            case 31:
                this.LoanOfficer = (CharSequence)value$;
                break;
            case 32:
                this.AppraisedValue = (Double)value$;
                break;
            case 33:
                this.AppraisalScore = (Integer)value$;
                break;
            case 34:
                this.CURiskScore = (Integer)value$;
                break;
            case 35:
                this.ComplexityScore = (Integer)value$;
                break;
            default:
                throw new AvroRuntimeException("Bad index");
        }

    }

    public CharSequence getSourceId() {
        return this.sourceId;
    }

    public void setSourceId(CharSequence value) {
        this.sourceId = value;
    }

    public CharSequence getEventId() {
        return this.eventId;
    }

    public void setEventId(CharSequence value) {
        this.eventId = value;
    }

    public CharSequence getCorrelationId() {
        return this.correlationId;
    }

    public void setCorrelationId(CharSequence value) {
        this.correlationId = value;
    }

    public CharSequence getClientId() {
        return this.ClientId;
    }

    public void setClientId(CharSequence value) {
        this.ClientId = value;
    }

    public CharSequence getSourceClientId() {
        return this.SourceClientId;
    }

    public void setSourceClientId(CharSequence value) {
        this.SourceClientId = value;
    }

    public CharSequence getFolderId() {
        return this.FolderId;
    }

    public void setFolderId(CharSequence value) {
        this.FolderId = value;
    }

    public CharSequence getLoanNumber() {
        return this.LoanNumber;
    }

    public void setLoanNumber(CharSequence value) {
        this.LoanNumber = value;
    }

    public CharSequence getLoanPurposeId() {
        return this.LoanPurposeId;
    }

    public void setLoanPurposeId(CharSequence value) {
        this.LoanPurposeId = value;
    }

    public CharSequence getLoanPurposeDescription() {
        return this.LoanPurposeDescription;
    }

    public void setLoanPurposeDescription(CharSequence value) {
        this.LoanPurposeDescription = value;
    }

    public CharSequence getLoanClassification() {
        return this.LoanClassification;
    }

    public void setLoanClassification(CharSequence value) {
        this.LoanClassification = value;
    }

    public CharSequence getChannelId() {
        return this.ChannelId;
    }

    public void setChannelId(CharSequence value) {
        this.ChannelId = value;
    }

    public CharSequence getChannelDescription() {
        return this.ChannelDescription;
    }

    public void setChannelDescription(CharSequence value) {
        this.ChannelDescription = value;
    }

    public CharSequence getCustomer() {
        return this.Customer;
    }

    public void setCustomer(CharSequence value) {
        this.Customer = value;
    }

    public CharSequence getPropertyTypeId() {
        return this.PropertyTypeId;
    }

    public void setPropertyTypeId(CharSequence value) {
        this.PropertyTypeId = value;
    }

    public CharSequence getPropertyTypeDescription() {
        return this.PropertyTypeDescription;
    }

    public void setPropertyTypeDescription(CharSequence value) {
        this.PropertyTypeDescription = value;
    }

    public CharSequence getStreetNumber() {
        return this.StreetNumber;
    }

    public void setStreetNumber(CharSequence value) {
        this.StreetNumber = value;
    }

    public CharSequence getStreet() {
        return this.Street;
    }

    public void setStreet(CharSequence value) {
        this.Street = value;
    }

    public CharSequence getUnitNumber() {
        return this.UnitNumber;
    }

    public void setUnitNumber(CharSequence value) {
        this.UnitNumber = value;
    }

    public CharSequence getCity() {
        return this.City;
    }

    public void setCity(CharSequence value) {
        this.City = value;
    }

    public CharSequence getState() {
        return this.State;
    }

    public void setState(CharSequence value) {
        this.State = value;
    }

    public CharSequence getCounty() {
        return this.County;
    }

    public void setCounty(CharSequence value) {
        this.County = value;
    }

    public CharSequence getZipCode() {
        return this.ZipCode;
    }

    public void setZipCode(CharSequence value) {
        this.ZipCode = value;
    }

    public CharSequence getDocumentId() {
        return this.DocumentId;
    }

    public void setDocumentId(CharSequence value) {
        this.DocumentId = value;
    }

    public CharSequence getServiceId() {
        return this.ServiceId;
    }

    public void setServiceId(CharSequence value) {
        this.ServiceId = value;
    }

    public CharSequence getServiceName() {
        return this.ServiceName;
    }

    public void setServiceName(CharSequence value) {
        this.ServiceName = value;
    }

    public CharSequence getServiceProviderLoginId() {
        return this.ServiceProviderLoginId;
    }

    public void setServiceProviderLoginId(CharSequence value) {
        this.ServiceProviderLoginId = value;
    }

    public CharSequence getServiceProviderId() {
        return this.ServiceProviderId;
    }

    public void setServiceProviderId(CharSequence value) {
        this.ServiceProviderId = value;
    }

    public CharSequence getServiceProviderName() {
        return this.ServiceProviderName;
    }

    public void setServiceProviderName(CharSequence value) {
        this.ServiceProviderName = value;
    }

    public Double getServiceProviderFee() {
        return this.ServiceProviderFee;
    }

    public void setServiceProviderFee(Double value) {
        this.ServiceProviderFee = value;
    }

    public CharSequence getReviewer() {
        return this.Reviewer;
    }

    public void setReviewer(CharSequence value) {
        this.Reviewer = value;
    }

    public CharSequence getProcessor() {
        return this.Processor;
    }

    public void setProcessor(CharSequence value) {
        this.Processor = value;
    }

    public CharSequence getLoanOfficer() {
        return this.LoanOfficer;
    }

    public void setLoanOfficer(CharSequence value) {
        this.LoanOfficer = value;
    }

    public Double getAppraisedValue() {
        return this.AppraisedValue;
    }

    public void setAppraisedValue(Double value) {
        this.AppraisedValue = value;
    }

    public Integer getAppraisalScore() {
        return this.AppraisalScore;
    }

    public void setAppraisalScore(Integer value) {
        this.AppraisalScore = value;
    }

    public Integer getCURiskScore() {
        return this.CURiskScore;
    }

    public void setCURiskScore(Integer value) {
        this.CURiskScore = value;
    }

    public Integer getComplexityScore() {
        return this.ComplexityScore;
    }

    public void setComplexityScore(Integer value) {
        this.ComplexityScore = value;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(Builder other) {
        return other == null ? new Builder() : new Builder(other);
    }

    public static Builder newBuilder(Orders other) {
        return other == null ? new Builder() : new Builder(other);
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        WRITER$.write(this, SpecificData.getEncoder(out));
    }

    public void readExternal(ObjectInput in) throws IOException {
        READER$.read(this, SpecificData.getDecoder(in));
    }

    protected boolean hasCustomCoders() {
        return true;
    }

    public void customEncode(Encoder out) throws IOException {
        out.writeString(this.sourceId);
        out.writeString(this.eventId);
        out.writeString(this.correlationId);
        out.writeString(this.ClientId);
        out.writeString(this.SourceClientId);
        out.writeString(this.FolderId);
        out.writeString(this.LoanNumber);
        if (this.LoanPurposeId == null) {
            out.writeIndex(0);
            out.writeNull();
        } else {
            out.writeIndex(1);
            out.writeString(this.LoanPurposeId);
        }

        if (this.LoanPurposeDescription == null) {
            out.writeIndex(0);
            out.writeNull();
        } else {
            out.writeIndex(1);
            out.writeString(this.LoanPurposeDescription);
        }

        if (this.LoanClassification == null) {
            out.writeIndex(0);
            out.writeNull();
        } else {
            out.writeIndex(1);
            out.writeString(this.LoanClassification);
        }

        if (this.ChannelId == null) {
            out.writeIndex(0);
            out.writeNull();
        } else {
            out.writeIndex(1);
            out.writeString(this.ChannelId);
        }

        if (this.ChannelDescription == null) {
            out.writeIndex(0);
            out.writeNull();
        } else {
            out.writeIndex(1);
            out.writeString(this.ChannelDescription);
        }

        if (this.Customer == null) {
            out.writeIndex(0);
            out.writeNull();
        } else {
            out.writeIndex(1);
            out.writeString(this.Customer);
        }

        if (this.PropertyTypeId == null) {
            out.writeIndex(0);
            out.writeNull();
        } else {
            out.writeIndex(1);
            out.writeString(this.PropertyTypeId);
        }

        if (this.PropertyTypeDescription == null) {
            out.writeIndex(0);
            out.writeNull();
        } else {
            out.writeIndex(1);
            out.writeString(this.PropertyTypeDescription);
        }

        if (this.StreetNumber == null) {
            out.writeIndex(0);
            out.writeNull();
        } else {
            out.writeIndex(1);
            out.writeString(this.StreetNumber);
        }

        if (this.Street == null) {
            out.writeIndex(0);
            out.writeNull();
        } else {
            out.writeIndex(1);
            out.writeString(this.Street);
        }

        if (this.UnitNumber == null) {
            out.writeIndex(0);
            out.writeNull();
        } else {
            out.writeIndex(1);
            out.writeString(this.UnitNumber);
        }

        if (this.City == null) {
            out.writeIndex(0);
            out.writeNull();
        } else {
            out.writeIndex(1);
            out.writeString(this.City);
        }

        if (this.State == null) {
            out.writeIndex(0);
            out.writeNull();
        } else {
            out.writeIndex(1);
            out.writeString(this.State);
        }

        if (this.County == null) {
            out.writeIndex(0);
            out.writeNull();
        } else {
            out.writeIndex(1);
            out.writeString(this.County);
        }

        if (this.ZipCode == null) {
            out.writeIndex(0);
            out.writeNull();
        } else {
            out.writeIndex(1);
            out.writeString(this.ZipCode);
        }

        out.writeString(this.DocumentId);
        if (this.ServiceId == null) {
            out.writeIndex(0);
            out.writeNull();
        } else {
            out.writeIndex(1);
            out.writeString(this.ServiceId);
        }

        if (this.ServiceName == null) {
            out.writeIndex(0);
            out.writeNull();
        } else {
            out.writeIndex(1);
            out.writeString(this.ServiceName);
        }

        if (this.ServiceProviderLoginId == null) {
            out.writeIndex(0);
            out.writeNull();
        } else {
            out.writeIndex(1);
            out.writeString(this.ServiceProviderLoginId);
        }

        if (this.ServiceProviderId == null) {
            out.writeIndex(0);
            out.writeNull();
        } else {
            out.writeIndex(1);
            out.writeString(this.ServiceProviderId);
        }

        if (this.ServiceProviderName == null) {
            out.writeIndex(0);
            out.writeNull();
        } else {
            out.writeIndex(1);
            out.writeString(this.ServiceProviderName);
        }

        if (this.ServiceProviderFee == null) {
            out.writeIndex(0);
            out.writeNull();
        } else {
            out.writeIndex(1);
            out.writeDouble(this.ServiceProviderFee);
        }

        if (this.Reviewer == null) {
            out.writeIndex(0);
            out.writeNull();
        } else {
            out.writeIndex(1);
            out.writeString(this.Reviewer);
        }

        if (this.Processor == null) {
            out.writeIndex(0);
            out.writeNull();
        } else {
            out.writeIndex(1);
            out.writeString(this.Processor);
        }

        if (this.LoanOfficer == null) {
            out.writeIndex(0);
            out.writeNull();
        } else {
            out.writeIndex(1);
            out.writeString(this.LoanOfficer);
        }

        if (this.AppraisedValue == null) {
            out.writeIndex(0);
            out.writeNull();
        } else {
            out.writeIndex(1);
            out.writeDouble(this.AppraisedValue);
        }

        if (this.AppraisalScore == null) {
            out.writeIndex(0);
            out.writeNull();
        } else {
            out.writeIndex(1);
            out.writeInt(this.AppraisalScore);
        }

        if (this.CURiskScore == null) {
            out.writeIndex(0);
            out.writeNull();
        } else {
            out.writeIndex(1);
            out.writeInt(this.CURiskScore);
        }

        if (this.ComplexityScore == null) {
            out.writeIndex(0);
            out.writeNull();
        } else {
            out.writeIndex(1);
            out.writeInt(this.ComplexityScore);
        }

    }

    public void customDecode(ResolvingDecoder in) throws IOException {
        Field[] fieldOrder = in.readFieldOrderIfDiff();
        if (fieldOrder == null) {
            this.sourceId = in.readString(this.sourceId instanceof Utf8 ? (Utf8)this.sourceId : null);
            this.eventId = in.readString(this.eventId instanceof Utf8 ? (Utf8)this.eventId : null);
            this.correlationId = in.readString(this.correlationId instanceof Utf8 ? (Utf8)this.correlationId : null);
            this.ClientId = in.readString(this.ClientId instanceof Utf8 ? (Utf8)this.ClientId : null);
            this.SourceClientId = in.readString(this.SourceClientId instanceof Utf8 ? (Utf8)this.SourceClientId : null);
            this.FolderId = in.readString(this.FolderId instanceof Utf8 ? (Utf8)this.FolderId : null);
            this.LoanNumber = in.readString(this.LoanNumber instanceof Utf8 ? (Utf8)this.LoanNumber : null);
            if (in.readIndex() != 1) {
                in.readNull();
                this.LoanPurposeId = null;
            } else {
                this.LoanPurposeId = in.readString(this.LoanPurposeId instanceof Utf8 ? (Utf8)this.LoanPurposeId : null);
            }

            if (in.readIndex() != 1) {
                in.readNull();
                this.LoanPurposeDescription = null;
            } else {
                this.LoanPurposeDescription = in.readString(this.LoanPurposeDescription instanceof Utf8 ? (Utf8)this.LoanPurposeDescription : null);
            }

            if (in.readIndex() != 1) {
                in.readNull();
                this.LoanClassification = null;
            } else {
                this.LoanClassification = in.readString(this.LoanClassification instanceof Utf8 ? (Utf8)this.LoanClassification : null);
            }

            if (in.readIndex() != 1) {
                in.readNull();
                this.ChannelId = null;
            } else {
                this.ChannelId = in.readString(this.ChannelId instanceof Utf8 ? (Utf8)this.ChannelId : null);
            }

            if (in.readIndex() != 1) {
                in.readNull();
                this.ChannelDescription = null;
            } else {
                this.ChannelDescription = in.readString(this.ChannelDescription instanceof Utf8 ? (Utf8)this.ChannelDescription : null);
            }

            if (in.readIndex() != 1) {
                in.readNull();
                this.Customer = null;
            } else {
                this.Customer = in.readString(this.Customer instanceof Utf8 ? (Utf8)this.Customer : null);
            }

            if (in.readIndex() != 1) {
                in.readNull();
                this.PropertyTypeId = null;
            } else {
                this.PropertyTypeId = in.readString(this.PropertyTypeId instanceof Utf8 ? (Utf8)this.PropertyTypeId : null);
            }

            if (in.readIndex() != 1) {
                in.readNull();
                this.PropertyTypeDescription = null;
            } else {
                this.PropertyTypeDescription = in.readString(this.PropertyTypeDescription instanceof Utf8 ? (Utf8)this.PropertyTypeDescription : null);
            }

            if (in.readIndex() != 1) {
                in.readNull();
                this.StreetNumber = null;
            } else {
                this.StreetNumber = in.readString(this.StreetNumber instanceof Utf8 ? (Utf8)this.StreetNumber : null);
            }

            if (in.readIndex() != 1) {
                in.readNull();
                this.Street = null;
            } else {
                this.Street = in.readString(this.Street instanceof Utf8 ? (Utf8)this.Street : null);
            }

            if (in.readIndex() != 1) {
                in.readNull();
                this.UnitNumber = null;
            } else {
                this.UnitNumber = in.readString(this.UnitNumber instanceof Utf8 ? (Utf8)this.UnitNumber : null);
            }

            if (in.readIndex() != 1) {
                in.readNull();
                this.City = null;
            } else {
                this.City = in.readString(this.City instanceof Utf8 ? (Utf8)this.City : null);
            }

            if (in.readIndex() != 1) {
                in.readNull();
                this.State = null;
            } else {
                this.State = in.readString(this.State instanceof Utf8 ? (Utf8)this.State : null);
            }

            if (in.readIndex() != 1) {
                in.readNull();
                this.County = null;
            } else {
                this.County = in.readString(this.County instanceof Utf8 ? (Utf8)this.County : null);
            }

            if (in.readIndex() != 1) {
                in.readNull();
                this.ZipCode = null;
            } else {
                this.ZipCode = in.readString(this.ZipCode instanceof Utf8 ? (Utf8)this.ZipCode : null);
            }

            this.DocumentId = in.readString(this.DocumentId instanceof Utf8 ? (Utf8)this.DocumentId : null);
            if (in.readIndex() != 1) {
                in.readNull();
                this.ServiceId = null;
            } else {
                this.ServiceId = in.readString(this.ServiceId instanceof Utf8 ? (Utf8)this.ServiceId : null);
            }

            if (in.readIndex() != 1) {
                in.readNull();
                this.ServiceName = null;
            } else {
                this.ServiceName = in.readString(this.ServiceName instanceof Utf8 ? (Utf8)this.ServiceName : null);
            }

            if (in.readIndex() != 1) {
                in.readNull();
                this.ServiceProviderLoginId = null;
            } else {
                this.ServiceProviderLoginId = in.readString(this.ServiceProviderLoginId instanceof Utf8 ? (Utf8)this.ServiceProviderLoginId : null);
            }

            if (in.readIndex() != 1) {
                in.readNull();
                this.ServiceProviderId = null;
            } else {
                this.ServiceProviderId = in.readString(this.ServiceProviderId instanceof Utf8 ? (Utf8)this.ServiceProviderId : null);
            }

            if (in.readIndex() != 1) {
                in.readNull();
                this.ServiceProviderName = null;
            } else {
                this.ServiceProviderName = in.readString(this.ServiceProviderName instanceof Utf8 ? (Utf8)this.ServiceProviderName : null);
            }

            if (in.readIndex() != 1) {
                in.readNull();
                this.ServiceProviderFee = null;
            } else {
                this.ServiceProviderFee = in.readDouble();
            }

            if (in.readIndex() != 1) {
                in.readNull();
                this.Reviewer = null;
            } else {
                this.Reviewer = in.readString(this.Reviewer instanceof Utf8 ? (Utf8)this.Reviewer : null);
            }

            if (in.readIndex() != 1) {
                in.readNull();
                this.Processor = null;
            } else {
                this.Processor = in.readString(this.Processor instanceof Utf8 ? (Utf8)this.Processor : null);
            }

            if (in.readIndex() != 1) {
                in.readNull();
                this.LoanOfficer = null;
            } else {
                this.LoanOfficer = in.readString(this.LoanOfficer instanceof Utf8 ? (Utf8)this.LoanOfficer : null);
            }

            if (in.readIndex() != 1) {
                in.readNull();
                this.AppraisedValue = null;
            } else {
                this.AppraisedValue = in.readDouble();
            }

            if (in.readIndex() != 1) {
                in.readNull();
                this.AppraisalScore = null;
            } else {
                this.AppraisalScore = in.readInt();
            }

            if (in.readIndex() != 1) {
                in.readNull();
                this.CURiskScore = null;
            } else {
                this.CURiskScore = in.readInt();
            }

            if (in.readIndex() != 1) {
                in.readNull();
                this.ComplexityScore = null;
            } else {
                this.ComplexityScore = in.readInt();
            }
        } else {
            for(int i = 0; i < 36; ++i) {
                switch(fieldOrder[i].pos()) {
                    case 0:
                        this.sourceId = in.readString(this.sourceId instanceof Utf8 ? (Utf8)this.sourceId : null);
                        break;
                    case 1:
                        this.eventId = in.readString(this.eventId instanceof Utf8 ? (Utf8)this.eventId : null);
                        break;
                    case 2:
                        this.correlationId = in.readString(this.correlationId instanceof Utf8 ? (Utf8)this.correlationId : null);
                        break;
                    case 3:
                        this.ClientId = in.readString(this.ClientId instanceof Utf8 ? (Utf8)this.ClientId : null);
                        break;
                    case 4:
                        this.SourceClientId = in.readString(this.SourceClientId instanceof Utf8 ? (Utf8)this.SourceClientId : null);
                        break;
                    case 5:
                        this.FolderId = in.readString(this.FolderId instanceof Utf8 ? (Utf8)this.FolderId : null);
                        break;
                    case 6:
                        this.LoanNumber = in.readString(this.LoanNumber instanceof Utf8 ? (Utf8)this.LoanNumber : null);
                        break;
                    case 7:
                        if (in.readIndex() != 1) {
                            in.readNull();
                            this.LoanPurposeId = null;
                        } else {
                            this.LoanPurposeId = in.readString(this.LoanPurposeId instanceof Utf8 ? (Utf8)this.LoanPurposeId : null);
                        }
                        break;
                    case 8:
                        if (in.readIndex() != 1) {
                            in.readNull();
                            this.LoanPurposeDescription = null;
                        } else {
                            this.LoanPurposeDescription = in.readString(this.LoanPurposeDescription instanceof Utf8 ? (Utf8)this.LoanPurposeDescription : null);
                        }
                        break;
                    case 9:
                        if (in.readIndex() != 1) {
                            in.readNull();
                            this.LoanClassification = null;
                        } else {
                            this.LoanClassification = in.readString(this.LoanClassification instanceof Utf8 ? (Utf8)this.LoanClassification : null);
                        }
                        break;
                    case 10:
                        if (in.readIndex() != 1) {
                            in.readNull();
                            this.ChannelId = null;
                        } else {
                            this.ChannelId = in.readString(this.ChannelId instanceof Utf8 ? (Utf8)this.ChannelId : null);
                        }
                        break;
                    case 11:
                        if (in.readIndex() != 1) {
                            in.readNull();
                            this.ChannelDescription = null;
                        } else {
                            this.ChannelDescription = in.readString(this.ChannelDescription instanceof Utf8 ? (Utf8)this.ChannelDescription : null);
                        }
                        break;
                    case 12:
                        if (in.readIndex() != 1) {
                            in.readNull();
                            this.Customer = null;
                        } else {
                            this.Customer = in.readString(this.Customer instanceof Utf8 ? (Utf8)this.Customer : null);
                        }
                        break;
                    case 13:
                        if (in.readIndex() != 1) {
                            in.readNull();
                            this.PropertyTypeId = null;
                        } else {
                            this.PropertyTypeId = in.readString(this.PropertyTypeId instanceof Utf8 ? (Utf8)this.PropertyTypeId : null);
                        }
                        break;
                    case 14:
                        if (in.readIndex() != 1) {
                            in.readNull();
                            this.PropertyTypeDescription = null;
                        } else {
                            this.PropertyTypeDescription = in.readString(this.PropertyTypeDescription instanceof Utf8 ? (Utf8)this.PropertyTypeDescription : null);
                        }
                        break;
                    case 15:
                        if (in.readIndex() != 1) {
                            in.readNull();
                            this.StreetNumber = null;
                        } else {
                            this.StreetNumber = in.readString(this.StreetNumber instanceof Utf8 ? (Utf8)this.StreetNumber : null);
                        }
                        break;
                    case 16:
                        if (in.readIndex() != 1) {
                            in.readNull();
                            this.Street = null;
                        } else {
                            this.Street = in.readString(this.Street instanceof Utf8 ? (Utf8)this.Street : null);
                        }
                        break;
                    case 17:
                        if (in.readIndex() != 1) {
                            in.readNull();
                            this.UnitNumber = null;
                        } else {
                            this.UnitNumber = in.readString(this.UnitNumber instanceof Utf8 ? (Utf8)this.UnitNumber : null);
                        }
                        break;
                    case 18:
                        if (in.readIndex() != 1) {
                            in.readNull();
                            this.City = null;
                        } else {
                            this.City = in.readString(this.City instanceof Utf8 ? (Utf8)this.City : null);
                        }
                        break;
                    case 19:
                        if (in.readIndex() != 1) {
                            in.readNull();
                            this.State = null;
                        } else {
                            this.State = in.readString(this.State instanceof Utf8 ? (Utf8)this.State : null);
                        }
                        break;
                    case 20:
                        if (in.readIndex() != 1) {
                            in.readNull();
                            this.County = null;
                        } else {
                            this.County = in.readString(this.County instanceof Utf8 ? (Utf8)this.County : null);
                        }
                        break;
                    case 21:
                        if (in.readIndex() != 1) {
                            in.readNull();
                            this.ZipCode = null;
                        } else {
                            this.ZipCode = in.readString(this.ZipCode instanceof Utf8 ? (Utf8)this.ZipCode : null);
                        }
                        break;
                    case 22:
                        this.DocumentId = in.readString(this.DocumentId instanceof Utf8 ? (Utf8)this.DocumentId : null);
                        break;
                    case 23:
                        if (in.readIndex() != 1) {
                            in.readNull();
                            this.ServiceId = null;
                        } else {
                            this.ServiceId = in.readString(this.ServiceId instanceof Utf8 ? (Utf8)this.ServiceId : null);
                        }
                        break;
                    case 24:
                        if (in.readIndex() != 1) {
                            in.readNull();
                            this.ServiceName = null;
                        } else {
                            this.ServiceName = in.readString(this.ServiceName instanceof Utf8 ? (Utf8)this.ServiceName : null);
                        }
                        break;
                    case 25:
                        if (in.readIndex() != 1) {
                            in.readNull();
                            this.ServiceProviderLoginId = null;
                        } else {
                            this.ServiceProviderLoginId = in.readString(this.ServiceProviderLoginId instanceof Utf8 ? (Utf8)this.ServiceProviderLoginId : null);
                        }
                        break;
                    case 26:
                        if (in.readIndex() != 1) {
                            in.readNull();
                            this.ServiceProviderId = null;
                        } else {
                            this.ServiceProviderId = in.readString(this.ServiceProviderId instanceof Utf8 ? (Utf8)this.ServiceProviderId : null);
                        }
                        break;
                    case 27:
                        if (in.readIndex() != 1) {
                            in.readNull();
                            this.ServiceProviderName = null;
                        } else {
                            this.ServiceProviderName = in.readString(this.ServiceProviderName instanceof Utf8 ? (Utf8)this.ServiceProviderName : null);
                        }
                        break;
                    case 28:
                        if (in.readIndex() != 1) {
                            in.readNull();
                            this.ServiceProviderFee = null;
                        } else {
                            this.ServiceProviderFee = in.readDouble();
                        }
                        break;
                    case 29:
                        if (in.readIndex() != 1) {
                            in.readNull();
                            this.Reviewer = null;
                        } else {
                            this.Reviewer = in.readString(this.Reviewer instanceof Utf8 ? (Utf8)this.Reviewer : null);
                        }
                        break;
                    case 30:
                        if (in.readIndex() != 1) {
                            in.readNull();
                            this.Processor = null;
                        } else {
                            this.Processor = in.readString(this.Processor instanceof Utf8 ? (Utf8)this.Processor : null);
                        }
                        break;
                    case 31:
                        if (in.readIndex() != 1) {
                            in.readNull();
                            this.LoanOfficer = null;
                        } else {
                            this.LoanOfficer = in.readString(this.LoanOfficer instanceof Utf8 ? (Utf8)this.LoanOfficer : null);
                        }
                        break;
                    case 32:
                        if (in.readIndex() != 1) {
                            in.readNull();
                            this.AppraisedValue = null;
                        } else {
                            this.AppraisedValue = in.readDouble();
                        }
                        break;
                    case 33:
                        if (in.readIndex() != 1) {
                            in.readNull();
                            this.AppraisalScore = null;
                        } else {
                            this.AppraisalScore = in.readInt();
                        }
                        break;
                    case 34:
                        if (in.readIndex() != 1) {
                            in.readNull();
                            this.CURiskScore = null;
                        } else {
                            this.CURiskScore = in.readInt();
                        }
                        break;
                    case 35:
                        if (in.readIndex() != 1) {
                            in.readNull();
                            this.ComplexityScore = null;
                        } else {
                            this.ComplexityScore = in.readInt();
                        }
                        break;
                    default:
                        throw new IOException("Corrupt ResolvingDecoder.");
                }
            }
        }

    }

    static {
        ENCODER = new BinaryMessageEncoder(MODEL$, SCHEMA$);
        DECODER = new BinaryMessageDecoder(MODEL$, SCHEMA$);
        WRITER$ = MODEL$.createDatumWriter(SCHEMA$);
        READER$ = MODEL$.createDatumReader(SCHEMA$);
    }

    public static class Builder extends SpecificRecordBuilderBase<Orders> implements RecordBuilder<Orders> {
        private CharSequence sourceId;
        private CharSequence eventId;
        private CharSequence correlationId;
        private CharSequence ClientId;
        private CharSequence SourceClientId;
        private CharSequence FolderId;
        private CharSequence LoanNumber;
        private CharSequence LoanPurposeId;
        private CharSequence LoanPurposeDescription;
        private CharSequence LoanClassification;
        private CharSequence ChannelId;
        private CharSequence ChannelDescription;
        private CharSequence Customer;
        private CharSequence PropertyTypeId;
        private CharSequence PropertyTypeDescription;
        private CharSequence StreetNumber;
        private CharSequence Street;
        private CharSequence UnitNumber;
        private CharSequence City;
        private CharSequence State;
        private CharSequence County;
        private CharSequence ZipCode;
        private CharSequence DocumentId;
        private CharSequence ServiceId;
        private CharSequence ServiceName;
        private CharSequence ServiceProviderLoginId;
        private CharSequence ServiceProviderId;
        private CharSequence ServiceProviderName;
        private Double ServiceProviderFee;
        private CharSequence Reviewer;
        private CharSequence Processor;
        private CharSequence LoanOfficer;
        private Double AppraisedValue;
        private Integer AppraisalScore;
        private Integer CURiskScore;
        private Integer ComplexityScore;

        private Builder() {
            super(Orders.SCHEMA$);
        }

        private Builder(Builder other) {
            super(other);
            if (isValidValue(this.fields()[0], other.sourceId)) {
                this.sourceId = (CharSequence)this.data().deepCopy(this.fields()[0].schema(), other.sourceId);
                this.fieldSetFlags()[0] = other.fieldSetFlags()[0];
            }

            if (isValidValue(this.fields()[1], other.eventId)) {
                this.eventId = (CharSequence)this.data().deepCopy(this.fields()[1].schema(), other.eventId);
                this.fieldSetFlags()[1] = other.fieldSetFlags()[1];
            }

            if (isValidValue(this.fields()[2], other.correlationId)) {
                this.correlationId = (CharSequence)this.data().deepCopy(this.fields()[2].schema(), other.correlationId);
                this.fieldSetFlags()[2] = other.fieldSetFlags()[2];
            }

            if (isValidValue(this.fields()[3], other.ClientId)) {
                this.ClientId = (CharSequence)this.data().deepCopy(this.fields()[3].schema(), other.ClientId);
                this.fieldSetFlags()[3] = other.fieldSetFlags()[3];
            }

            if (isValidValue(this.fields()[4], other.SourceClientId)) {
                this.SourceClientId = (CharSequence)this.data().deepCopy(this.fields()[4].schema(), other.SourceClientId);
                this.fieldSetFlags()[4] = other.fieldSetFlags()[4];
            }

            if (isValidValue(this.fields()[5], other.FolderId)) {
                this.FolderId = (CharSequence)this.data().deepCopy(this.fields()[5].schema(), other.FolderId);
                this.fieldSetFlags()[5] = other.fieldSetFlags()[5];
            }

            if (isValidValue(this.fields()[6], other.LoanNumber)) {
                this.LoanNumber = (CharSequence)this.data().deepCopy(this.fields()[6].schema(), other.LoanNumber);
                this.fieldSetFlags()[6] = other.fieldSetFlags()[6];
            }

            if (isValidValue(this.fields()[7], other.LoanPurposeId)) {
                this.LoanPurposeId = (CharSequence)this.data().deepCopy(this.fields()[7].schema(), other.LoanPurposeId);
                this.fieldSetFlags()[7] = other.fieldSetFlags()[7];
            }

            if (isValidValue(this.fields()[8], other.LoanPurposeDescription)) {
                this.LoanPurposeDescription = (CharSequence)this.data().deepCopy(this.fields()[8].schema(), other.LoanPurposeDescription);
                this.fieldSetFlags()[8] = other.fieldSetFlags()[8];
            }

            if (isValidValue(this.fields()[9], other.LoanClassification)) {
                this.LoanClassification = (CharSequence)this.data().deepCopy(this.fields()[9].schema(), other.LoanClassification);
                this.fieldSetFlags()[9] = other.fieldSetFlags()[9];
            }

            if (isValidValue(this.fields()[10], other.ChannelId)) {
                this.ChannelId = (CharSequence)this.data().deepCopy(this.fields()[10].schema(), other.ChannelId);
                this.fieldSetFlags()[10] = other.fieldSetFlags()[10];
            }

            if (isValidValue(this.fields()[11], other.ChannelDescription)) {
                this.ChannelDescription = (CharSequence)this.data().deepCopy(this.fields()[11].schema(), other.ChannelDescription);
                this.fieldSetFlags()[11] = other.fieldSetFlags()[11];
            }

            if (isValidValue(this.fields()[12], other.Customer)) {
                this.Customer = (CharSequence)this.data().deepCopy(this.fields()[12].schema(), other.Customer);
                this.fieldSetFlags()[12] = other.fieldSetFlags()[12];
            }

            if (isValidValue(this.fields()[13], other.PropertyTypeId)) {
                this.PropertyTypeId = (CharSequence)this.data().deepCopy(this.fields()[13].schema(), other.PropertyTypeId);
                this.fieldSetFlags()[13] = other.fieldSetFlags()[13];
            }

            if (isValidValue(this.fields()[14], other.PropertyTypeDescription)) {
                this.PropertyTypeDescription = (CharSequence)this.data().deepCopy(this.fields()[14].schema(), other.PropertyTypeDescription);
                this.fieldSetFlags()[14] = other.fieldSetFlags()[14];
            }

            if (isValidValue(this.fields()[15], other.StreetNumber)) {
                this.StreetNumber = (CharSequence)this.data().deepCopy(this.fields()[15].schema(), other.StreetNumber);
                this.fieldSetFlags()[15] = other.fieldSetFlags()[15];
            }

            if (isValidValue(this.fields()[16], other.Street)) {
                this.Street = (CharSequence)this.data().deepCopy(this.fields()[16].schema(), other.Street);
                this.fieldSetFlags()[16] = other.fieldSetFlags()[16];
            }

            if (isValidValue(this.fields()[17], other.UnitNumber)) {
                this.UnitNumber = (CharSequence)this.data().deepCopy(this.fields()[17].schema(), other.UnitNumber);
                this.fieldSetFlags()[17] = other.fieldSetFlags()[17];
            }

            if (isValidValue(this.fields()[18], other.City)) {
                this.City = (CharSequence)this.data().deepCopy(this.fields()[18].schema(), other.City);
                this.fieldSetFlags()[18] = other.fieldSetFlags()[18];
            }

            if (isValidValue(this.fields()[19], other.State)) {
                this.State = (CharSequence)this.data().deepCopy(this.fields()[19].schema(), other.State);
                this.fieldSetFlags()[19] = other.fieldSetFlags()[19];
            }

            if (isValidValue(this.fields()[20], other.County)) {
                this.County = (CharSequence)this.data().deepCopy(this.fields()[20].schema(), other.County);
                this.fieldSetFlags()[20] = other.fieldSetFlags()[20];
            }

            if (isValidValue(this.fields()[21], other.ZipCode)) {
                this.ZipCode = (CharSequence)this.data().deepCopy(this.fields()[21].schema(), other.ZipCode);
                this.fieldSetFlags()[21] = other.fieldSetFlags()[21];
            }

            if (isValidValue(this.fields()[22], other.DocumentId)) {
                this.DocumentId = (CharSequence)this.data().deepCopy(this.fields()[22].schema(), other.DocumentId);
                this.fieldSetFlags()[22] = other.fieldSetFlags()[22];
            }

            if (isValidValue(this.fields()[23], other.ServiceId)) {
                this.ServiceId = (CharSequence)this.data().deepCopy(this.fields()[23].schema(), other.ServiceId);
                this.fieldSetFlags()[23] = other.fieldSetFlags()[23];
            }

            if (isValidValue(this.fields()[24], other.ServiceName)) {
                this.ServiceName = (CharSequence)this.data().deepCopy(this.fields()[24].schema(), other.ServiceName);
                this.fieldSetFlags()[24] = other.fieldSetFlags()[24];
            }

            if (isValidValue(this.fields()[25], other.ServiceProviderLoginId)) {
                this.ServiceProviderLoginId = (CharSequence)this.data().deepCopy(this.fields()[25].schema(), other.ServiceProviderLoginId);
                this.fieldSetFlags()[25] = other.fieldSetFlags()[25];
            }

            if (isValidValue(this.fields()[26], other.ServiceProviderId)) {
                this.ServiceProviderId = (CharSequence)this.data().deepCopy(this.fields()[26].schema(), other.ServiceProviderId);
                this.fieldSetFlags()[26] = other.fieldSetFlags()[26];
            }

            if (isValidValue(this.fields()[27], other.ServiceProviderName)) {
                this.ServiceProviderName = (CharSequence)this.data().deepCopy(this.fields()[27].schema(), other.ServiceProviderName);
                this.fieldSetFlags()[27] = other.fieldSetFlags()[27];
            }

            if (isValidValue(this.fields()[28], other.ServiceProviderFee)) {
                this.ServiceProviderFee = (Double)this.data().deepCopy(this.fields()[28].schema(), other.ServiceProviderFee);
                this.fieldSetFlags()[28] = other.fieldSetFlags()[28];
            }

            if (isValidValue(this.fields()[29], other.Reviewer)) {
                this.Reviewer = (CharSequence)this.data().deepCopy(this.fields()[29].schema(), other.Reviewer);
                this.fieldSetFlags()[29] = other.fieldSetFlags()[29];
            }

            if (isValidValue(this.fields()[30], other.Processor)) {
                this.Processor = (CharSequence)this.data().deepCopy(this.fields()[30].schema(), other.Processor);
                this.fieldSetFlags()[30] = other.fieldSetFlags()[30];
            }

            if (isValidValue(this.fields()[31], other.LoanOfficer)) {
                this.LoanOfficer = (CharSequence)this.data().deepCopy(this.fields()[31].schema(), other.LoanOfficer);
                this.fieldSetFlags()[31] = other.fieldSetFlags()[31];
            }

            if (isValidValue(this.fields()[32], other.AppraisedValue)) {
                this.AppraisedValue = (Double)this.data().deepCopy(this.fields()[32].schema(), other.AppraisedValue);
                this.fieldSetFlags()[32] = other.fieldSetFlags()[32];
            }

            if (isValidValue(this.fields()[33], other.AppraisalScore)) {
                this.AppraisalScore = (Integer)this.data().deepCopy(this.fields()[33].schema(), other.AppraisalScore);
                this.fieldSetFlags()[33] = other.fieldSetFlags()[33];
            }

            if (isValidValue(this.fields()[34], other.CURiskScore)) {
                this.CURiskScore = (Integer)this.data().deepCopy(this.fields()[34].schema(), other.CURiskScore);
                this.fieldSetFlags()[34] = other.fieldSetFlags()[34];
            }

            if (isValidValue(this.fields()[35], other.ComplexityScore)) {
                this.ComplexityScore = (Integer)this.data().deepCopy(this.fields()[35].schema(), other.ComplexityScore);
                this.fieldSetFlags()[35] = other.fieldSetFlags()[35];
            }

        }

        private Builder(Orders other) {
            super(Orders.SCHEMA$);
            if (isValidValue(this.fields()[0], other.sourceId)) {
                this.sourceId = (CharSequence)this.data().deepCopy(this.fields()[0].schema(), other.sourceId);
                this.fieldSetFlags()[0] = true;
            }

            if (isValidValue(this.fields()[1], other.eventId)) {
                this.eventId = (CharSequence)this.data().deepCopy(this.fields()[1].schema(), other.eventId);
                this.fieldSetFlags()[1] = true;
            }

            if (isValidValue(this.fields()[2], other.correlationId)) {
                this.correlationId = (CharSequence)this.data().deepCopy(this.fields()[2].schema(), other.correlationId);
                this.fieldSetFlags()[2] = true;
            }

            if (isValidValue(this.fields()[3], other.ClientId)) {
                this.ClientId = (CharSequence)this.data().deepCopy(this.fields()[3].schema(), other.ClientId);
                this.fieldSetFlags()[3] = true;
            }

            if (isValidValue(this.fields()[4], other.SourceClientId)) {
                this.SourceClientId = (CharSequence)this.data().deepCopy(this.fields()[4].schema(), other.SourceClientId);
                this.fieldSetFlags()[4] = true;
            }

            if (isValidValue(this.fields()[5], other.FolderId)) {
                this.FolderId = (CharSequence)this.data().deepCopy(this.fields()[5].schema(), other.FolderId);
                this.fieldSetFlags()[5] = true;
            }

            if (isValidValue(this.fields()[6], other.LoanNumber)) {
                this.LoanNumber = (CharSequence)this.data().deepCopy(this.fields()[6].schema(), other.LoanNumber);
                this.fieldSetFlags()[6] = true;
            }

            if (isValidValue(this.fields()[7], other.LoanPurposeId)) {
                this.LoanPurposeId = (CharSequence)this.data().deepCopy(this.fields()[7].schema(), other.LoanPurposeId);
                this.fieldSetFlags()[7] = true;
            }

            if (isValidValue(this.fields()[8], other.LoanPurposeDescription)) {
                this.LoanPurposeDescription = (CharSequence)this.data().deepCopy(this.fields()[8].schema(), other.LoanPurposeDescription);
                this.fieldSetFlags()[8] = true;
            }

            if (isValidValue(this.fields()[9], other.LoanClassification)) {
                this.LoanClassification = (CharSequence)this.data().deepCopy(this.fields()[9].schema(), other.LoanClassification);
                this.fieldSetFlags()[9] = true;
            }

            if (isValidValue(this.fields()[10], other.ChannelId)) {
                this.ChannelId = (CharSequence)this.data().deepCopy(this.fields()[10].schema(), other.ChannelId);
                this.fieldSetFlags()[10] = true;
            }

            if (isValidValue(this.fields()[11], other.ChannelDescription)) {
                this.ChannelDescription = (CharSequence)this.data().deepCopy(this.fields()[11].schema(), other.ChannelDescription);
                this.fieldSetFlags()[11] = true;
            }

            if (isValidValue(this.fields()[12], other.Customer)) {
                this.Customer = (CharSequence)this.data().deepCopy(this.fields()[12].schema(), other.Customer);
                this.fieldSetFlags()[12] = true;
            }

            if (isValidValue(this.fields()[13], other.PropertyTypeId)) {
                this.PropertyTypeId = (CharSequence)this.data().deepCopy(this.fields()[13].schema(), other.PropertyTypeId);
                this.fieldSetFlags()[13] = true;
            }

            if (isValidValue(this.fields()[14], other.PropertyTypeDescription)) {
                this.PropertyTypeDescription = (CharSequence)this.data().deepCopy(this.fields()[14].schema(), other.PropertyTypeDescription);
                this.fieldSetFlags()[14] = true;
            }

            if (isValidValue(this.fields()[15], other.StreetNumber)) {
                this.StreetNumber = (CharSequence)this.data().deepCopy(this.fields()[15].schema(), other.StreetNumber);
                this.fieldSetFlags()[15] = true;
            }

            if (isValidValue(this.fields()[16], other.Street)) {
                this.Street = (CharSequence)this.data().deepCopy(this.fields()[16].schema(), other.Street);
                this.fieldSetFlags()[16] = true;
            }

            if (isValidValue(this.fields()[17], other.UnitNumber)) {
                this.UnitNumber = (CharSequence)this.data().deepCopy(this.fields()[17].schema(), other.UnitNumber);
                this.fieldSetFlags()[17] = true;
            }

            if (isValidValue(this.fields()[18], other.City)) {
                this.City = (CharSequence)this.data().deepCopy(this.fields()[18].schema(), other.City);
                this.fieldSetFlags()[18] = true;
            }

            if (isValidValue(this.fields()[19], other.State)) {
                this.State = (CharSequence)this.data().deepCopy(this.fields()[19].schema(), other.State);
                this.fieldSetFlags()[19] = true;
            }

            if (isValidValue(this.fields()[20], other.County)) {
                this.County = (CharSequence)this.data().deepCopy(this.fields()[20].schema(), other.County);
                this.fieldSetFlags()[20] = true;
            }

            if (isValidValue(this.fields()[21], other.ZipCode)) {
                this.ZipCode = (CharSequence)this.data().deepCopy(this.fields()[21].schema(), other.ZipCode);
                this.fieldSetFlags()[21] = true;
            }

            if (isValidValue(this.fields()[22], other.DocumentId)) {
                this.DocumentId = (CharSequence)this.data().deepCopy(this.fields()[22].schema(), other.DocumentId);
                this.fieldSetFlags()[22] = true;
            }

            if (isValidValue(this.fields()[23], other.ServiceId)) {
                this.ServiceId = (CharSequence)this.data().deepCopy(this.fields()[23].schema(), other.ServiceId);
                this.fieldSetFlags()[23] = true;
            }

            if (isValidValue(this.fields()[24], other.ServiceName)) {
                this.ServiceName = (CharSequence)this.data().deepCopy(this.fields()[24].schema(), other.ServiceName);
                this.fieldSetFlags()[24] = true;
            }

            if (isValidValue(this.fields()[25], other.ServiceProviderLoginId)) {
                this.ServiceProviderLoginId = (CharSequence)this.data().deepCopy(this.fields()[25].schema(), other.ServiceProviderLoginId);
                this.fieldSetFlags()[25] = true;
            }

            if (isValidValue(this.fields()[26], other.ServiceProviderId)) {
                this.ServiceProviderId = (CharSequence)this.data().deepCopy(this.fields()[26].schema(), other.ServiceProviderId);
                this.fieldSetFlags()[26] = true;
            }

            if (isValidValue(this.fields()[27], other.ServiceProviderName)) {
                this.ServiceProviderName = (CharSequence)this.data().deepCopy(this.fields()[27].schema(), other.ServiceProviderName);
                this.fieldSetFlags()[27] = true;
            }

            if (isValidValue(this.fields()[28], other.ServiceProviderFee)) {
                this.ServiceProviderFee = (Double)this.data().deepCopy(this.fields()[28].schema(), other.ServiceProviderFee);
                this.fieldSetFlags()[28] = true;
            }

            if (isValidValue(this.fields()[29], other.Reviewer)) {
                this.Reviewer = (CharSequence)this.data().deepCopy(this.fields()[29].schema(), other.Reviewer);
                this.fieldSetFlags()[29] = true;
            }

            if (isValidValue(this.fields()[30], other.Processor)) {
                this.Processor = (CharSequence)this.data().deepCopy(this.fields()[30].schema(), other.Processor);
                this.fieldSetFlags()[30] = true;
            }

            if (isValidValue(this.fields()[31], other.LoanOfficer)) {
                this.LoanOfficer = (CharSequence)this.data().deepCopy(this.fields()[31].schema(), other.LoanOfficer);
                this.fieldSetFlags()[31] = true;
            }

            if (isValidValue(this.fields()[32], other.AppraisedValue)) {
                this.AppraisedValue = (Double)this.data().deepCopy(this.fields()[32].schema(), other.AppraisedValue);
                this.fieldSetFlags()[32] = true;
            }

            if (isValidValue(this.fields()[33], other.AppraisalScore)) {
                this.AppraisalScore = (Integer)this.data().deepCopy(this.fields()[33].schema(), other.AppraisalScore);
                this.fieldSetFlags()[33] = true;
            }

            if (isValidValue(this.fields()[34], other.CURiskScore)) {
                this.CURiskScore = (Integer)this.data().deepCopy(this.fields()[34].schema(), other.CURiskScore);
                this.fieldSetFlags()[34] = true;
            }

            if (isValidValue(this.fields()[35], other.ComplexityScore)) {
                this.ComplexityScore = (Integer)this.data().deepCopy(this.fields()[35].schema(), other.ComplexityScore);
                this.fieldSetFlags()[35] = true;
            }

        }

        public CharSequence getSourceId() {
            return this.sourceId;
        }

        public Builder setSourceId(CharSequence value) {
            this.validate(this.fields()[0], value);
            this.sourceId = value;
            this.fieldSetFlags()[0] = true;
            return this;
        }

        public boolean hasSourceId() {
            return this.fieldSetFlags()[0];
        }

        public Builder clearSourceId() {
            this.sourceId = null;
            this.fieldSetFlags()[0] = false;
            return this;
        }

        public CharSequence getEventId() {
            return this.eventId;
        }

        public Builder setEventId(CharSequence value) {
            this.validate(this.fields()[1], value);
            this.eventId = value;
            this.fieldSetFlags()[1] = true;
            return this;
        }

        public boolean hasEventId() {
            return this.fieldSetFlags()[1];
        }

        public Builder clearEventId() {
            this.eventId = null;
            this.fieldSetFlags()[1] = false;
            return this;
        }

        public CharSequence getCorrelationId() {
            return this.correlationId;
        }

        public Builder setCorrelationId(CharSequence value) {
            this.validate(this.fields()[2], value);
            this.correlationId = value;
            this.fieldSetFlags()[2] = true;
            return this;
        }

        public boolean hasCorrelationId() {
            return this.fieldSetFlags()[2];
        }

        public Builder clearCorrelationId() {
            this.correlationId = null;
            this.fieldSetFlags()[2] = false;
            return this;
        }

        public CharSequence getClientId() {
            return this.ClientId;
        }

        public Builder setClientId(CharSequence value) {
            this.validate(this.fields()[3], value);
            this.ClientId = value;
            this.fieldSetFlags()[3] = true;
            return this;
        }

        public boolean hasClientId() {
            return this.fieldSetFlags()[3];
        }

        public Builder clearClientId() {
            this.ClientId = null;
            this.fieldSetFlags()[3] = false;
            return this;
        }

        public CharSequence getSourceClientId() {
            return this.SourceClientId;
        }

        public Builder setSourceClientId(CharSequence value) {
            this.validate(this.fields()[4], value);
            this.SourceClientId = value;
            this.fieldSetFlags()[4] = true;
            return this;
        }

        public boolean hasSourceClientId() {
            return this.fieldSetFlags()[4];
        }

        public Builder clearSourceClientId() {
            this.SourceClientId = null;
            this.fieldSetFlags()[4] = false;
            return this;
        }

        public CharSequence getFolderId() {
            return this.FolderId;
        }

        public Builder setFolderId(CharSequence value) {
            this.validate(this.fields()[5], value);
            this.FolderId = value;
            this.fieldSetFlags()[5] = true;
            return this;
        }

        public boolean hasFolderId() {
            return this.fieldSetFlags()[5];
        }

        public Builder clearFolderId() {
            this.FolderId = null;
            this.fieldSetFlags()[5] = false;
            return this;
        }

        public CharSequence getLoanNumber() {
            return this.LoanNumber;
        }

        public Builder setLoanNumber(CharSequence value) {
            this.validate(this.fields()[6], value);
            this.LoanNumber = value;
            this.fieldSetFlags()[6] = true;
            return this;
        }

        public boolean hasLoanNumber() {
            return this.fieldSetFlags()[6];
        }

        public Builder clearLoanNumber() {
            this.LoanNumber = null;
            this.fieldSetFlags()[6] = false;
            return this;
        }

        public CharSequence getLoanPurposeId() {
            return this.LoanPurposeId;
        }

        public Builder setLoanPurposeId(CharSequence value) {
            this.validate(this.fields()[7], value);
            this.LoanPurposeId = value;
            this.fieldSetFlags()[7] = true;
            return this;
        }

        public boolean hasLoanPurposeId() {
            return this.fieldSetFlags()[7];
        }

        public Builder clearLoanPurposeId() {
            this.LoanPurposeId = null;
            this.fieldSetFlags()[7] = false;
            return this;
        }

        public CharSequence getLoanPurposeDescription() {
            return this.LoanPurposeDescription;
        }

        public Builder setLoanPurposeDescription(CharSequence value) {
            this.validate(this.fields()[8], value);
            this.LoanPurposeDescription = value;
            this.fieldSetFlags()[8] = true;
            return this;
        }

        public boolean hasLoanPurposeDescription() {
            return this.fieldSetFlags()[8];
        }

        public Builder clearLoanPurposeDescription() {
            this.LoanPurposeDescription = null;
            this.fieldSetFlags()[8] = false;
            return this;
        }

        public CharSequence getLoanClassification() {
            return this.LoanClassification;
        }

        public Builder setLoanClassification(CharSequence value) {
            this.validate(this.fields()[9], value);
            this.LoanClassification = value;
            this.fieldSetFlags()[9] = true;
            return this;
        }

        public boolean hasLoanClassification() {
            return this.fieldSetFlags()[9];
        }

        public Builder clearLoanClassification() {
            this.LoanClassification = null;
            this.fieldSetFlags()[9] = false;
            return this;
        }

        public CharSequence getChannelId() {
            return this.ChannelId;
        }

        public Builder setChannelId(CharSequence value) {
            this.validate(this.fields()[10], value);
            this.ChannelId = value;
            this.fieldSetFlags()[10] = true;
            return this;
        }

        public boolean hasChannelId() {
            return this.fieldSetFlags()[10];
        }

        public Builder clearChannelId() {
            this.ChannelId = null;
            this.fieldSetFlags()[10] = false;
            return this;
        }

        public CharSequence getChannelDescription() {
            return this.ChannelDescription;
        }

        public Builder setChannelDescription(CharSequence value) {
            this.validate(this.fields()[11], value);
            this.ChannelDescription = value;
            this.fieldSetFlags()[11] = true;
            return this;
        }

        public boolean hasChannelDescription() {
            return this.fieldSetFlags()[11];
        }

        public Builder clearChannelDescription() {
            this.ChannelDescription = null;
            this.fieldSetFlags()[11] = false;
            return this;
        }

        public CharSequence getCustomer() {
            return this.Customer;
        }

        public Builder setCustomer(CharSequence value) {
            this.validate(this.fields()[12], value);
            this.Customer = value;
            this.fieldSetFlags()[12] = true;
            return this;
        }

        public boolean hasCustomer() {
            return this.fieldSetFlags()[12];
        }

        public Builder clearCustomer() {
            this.Customer = null;
            this.fieldSetFlags()[12] = false;
            return this;
        }

        public CharSequence getPropertyTypeId() {
            return this.PropertyTypeId;
        }

        public Builder setPropertyTypeId(CharSequence value) {
            this.validate(this.fields()[13], value);
            this.PropertyTypeId = value;
            this.fieldSetFlags()[13] = true;
            return this;
        }

        public boolean hasPropertyTypeId() {
            return this.fieldSetFlags()[13];
        }

        public Builder clearPropertyTypeId() {
            this.PropertyTypeId = null;
            this.fieldSetFlags()[13] = false;
            return this;
        }

        public CharSequence getPropertyTypeDescription() {
            return this.PropertyTypeDescription;
        }

        public Builder setPropertyTypeDescription(CharSequence value) {
            this.validate(this.fields()[14], value);
            this.PropertyTypeDescription = value;
            this.fieldSetFlags()[14] = true;
            return this;
        }

        public boolean hasPropertyTypeDescription() {
            return this.fieldSetFlags()[14];
        }

        public Builder clearPropertyTypeDescription() {
            this.PropertyTypeDescription = null;
            this.fieldSetFlags()[14] = false;
            return this;
        }

        public CharSequence getStreetNumber() {
            return this.StreetNumber;
        }

        public Builder setStreetNumber(CharSequence value) {
            this.validate(this.fields()[15], value);
            this.StreetNumber = value;
            this.fieldSetFlags()[15] = true;
            return this;
        }

        public boolean hasStreetNumber() {
            return this.fieldSetFlags()[15];
        }

        public Builder clearStreetNumber() {
            this.StreetNumber = null;
            this.fieldSetFlags()[15] = false;
            return this;
        }

        public CharSequence getStreet() {
            return this.Street;
        }

        public Builder setStreet(CharSequence value) {
            this.validate(this.fields()[16], value);
            this.Street = value;
            this.fieldSetFlags()[16] = true;
            return this;
        }

        public boolean hasStreet() {
            return this.fieldSetFlags()[16];
        }

        public Builder clearStreet() {
            this.Street = null;
            this.fieldSetFlags()[16] = false;
            return this;
        }

        public CharSequence getUnitNumber() {
            return this.UnitNumber;
        }

        public Builder setUnitNumber(CharSequence value) {
            this.validate(this.fields()[17], value);
            this.UnitNumber = value;
            this.fieldSetFlags()[17] = true;
            return this;
        }

        public boolean hasUnitNumber() {
            return this.fieldSetFlags()[17];
        }

        public Builder clearUnitNumber() {
            this.UnitNumber = null;
            this.fieldSetFlags()[17] = false;
            return this;
        }

        public CharSequence getCity() {
            return this.City;
        }

        public Builder setCity(CharSequence value) {
            this.validate(this.fields()[18], value);
            this.City = value;
            this.fieldSetFlags()[18] = true;
            return this;
        }

        public boolean hasCity() {
            return this.fieldSetFlags()[18];
        }

        public Builder clearCity() {
            this.City = null;
            this.fieldSetFlags()[18] = false;
            return this;
        }

        public CharSequence getState() {
            return this.State;
        }

        public Builder setState(CharSequence value) {
            this.validate(this.fields()[19], value);
            this.State = value;
            this.fieldSetFlags()[19] = true;
            return this;
        }

        public boolean hasState() {
            return this.fieldSetFlags()[19];
        }

        public Builder clearState() {
            this.State = null;
            this.fieldSetFlags()[19] = false;
            return this;
        }

        public CharSequence getCounty() {
            return this.County;
        }

        public Builder setCounty(CharSequence value) {
            this.validate(this.fields()[20], value);
            this.County = value;
            this.fieldSetFlags()[20] = true;
            return this;
        }

        public boolean hasCounty() {
            return this.fieldSetFlags()[20];
        }

        public Builder clearCounty() {
            this.County = null;
            this.fieldSetFlags()[20] = false;
            return this;
        }

        public CharSequence getZipCode() {
            return this.ZipCode;
        }

        public Builder setZipCode(CharSequence value) {
            this.validate(this.fields()[21], value);
            this.ZipCode = value;
            this.fieldSetFlags()[21] = true;
            return this;
        }

        public boolean hasZipCode() {
            return this.fieldSetFlags()[21];
        }

        public Builder clearZipCode() {
            this.ZipCode = null;
            this.fieldSetFlags()[21] = false;
            return this;
        }

        public CharSequence getDocumentId() {
            return this.DocumentId;
        }

        public Builder setDocumentId(CharSequence value) {
            this.validate(this.fields()[22], value);
            this.DocumentId = value;
            this.fieldSetFlags()[22] = true;
            return this;
        }

        public boolean hasDocumentId() {
            return this.fieldSetFlags()[22];
        }

        public Builder clearDocumentId() {
            this.DocumentId = null;
            this.fieldSetFlags()[22] = false;
            return this;
        }

        public CharSequence getServiceId() {
            return this.ServiceId;
        }

        public Builder setServiceId(CharSequence value) {
            this.validate(this.fields()[23], value);
            this.ServiceId = value;
            this.fieldSetFlags()[23] = true;
            return this;
        }

        public boolean hasServiceId() {
            return this.fieldSetFlags()[23];
        }

        public Builder clearServiceId() {
            this.ServiceId = null;
            this.fieldSetFlags()[23] = false;
            return this;
        }

        public CharSequence getServiceName() {
            return this.ServiceName;
        }

        public Builder setServiceName(CharSequence value) {
            this.validate(this.fields()[24], value);
            this.ServiceName = value;
            this.fieldSetFlags()[24] = true;
            return this;
        }

        public boolean hasServiceName() {
            return this.fieldSetFlags()[24];
        }

        public Builder clearServiceName() {
            this.ServiceName = null;
            this.fieldSetFlags()[24] = false;
            return this;
        }

        public CharSequence getServiceProviderLoginId() {
            return this.ServiceProviderLoginId;
        }

        public Builder setServiceProviderLoginId(CharSequence value) {
            this.validate(this.fields()[25], value);
            this.ServiceProviderLoginId = value;
            this.fieldSetFlags()[25] = true;
            return this;
        }

        public boolean hasServiceProviderLoginId() {
            return this.fieldSetFlags()[25];
        }

        public Builder clearServiceProviderLoginId() {
            this.ServiceProviderLoginId = null;
            this.fieldSetFlags()[25] = false;
            return this;
        }

        public CharSequence getServiceProviderId() {
            return this.ServiceProviderId;
        }

        public Builder setServiceProviderId(CharSequence value) {
            this.validate(this.fields()[26], value);
            this.ServiceProviderId = value;
            this.fieldSetFlags()[26] = true;
            return this;
        }

        public boolean hasServiceProviderId() {
            return this.fieldSetFlags()[26];
        }

        public Builder clearServiceProviderId() {
            this.ServiceProviderId = null;
            this.fieldSetFlags()[26] = false;
            return this;
        }

        public CharSequence getServiceProviderName() {
            return this.ServiceProviderName;
        }

        public Builder setServiceProviderName(CharSequence value) {
            this.validate(this.fields()[27], value);
            this.ServiceProviderName = value;
            this.fieldSetFlags()[27] = true;
            return this;
        }

        public boolean hasServiceProviderName() {
            return this.fieldSetFlags()[27];
        }

        public Builder clearServiceProviderName() {
            this.ServiceProviderName = null;
            this.fieldSetFlags()[27] = false;
            return this;
        }

        public Double getServiceProviderFee() {
            return this.ServiceProviderFee;
        }

        public Builder setServiceProviderFee(Double value) {
            this.validate(this.fields()[28], value);
            this.ServiceProviderFee = value;
            this.fieldSetFlags()[28] = true;
            return this;
        }

        public boolean hasServiceProviderFee() {
            return this.fieldSetFlags()[28];
        }

        public Builder clearServiceProviderFee() {
            this.ServiceProviderFee = null;
            this.fieldSetFlags()[28] = false;
            return this;
        }

        public CharSequence getReviewer() {
            return this.Reviewer;
        }

        public Builder setReviewer(CharSequence value) {
            this.validate(this.fields()[29], value);
            this.Reviewer = value;
            this.fieldSetFlags()[29] = true;
            return this;
        }

        public boolean hasReviewer() {
            return this.fieldSetFlags()[29];
        }

        public Builder clearReviewer() {
            this.Reviewer = null;
            this.fieldSetFlags()[29] = false;
            return this;
        }

        public CharSequence getProcessor() {
            return this.Processor;
        }

        public Builder setProcessor(CharSequence value) {
            this.validate(this.fields()[30], value);
            this.Processor = value;
            this.fieldSetFlags()[30] = true;
            return this;
        }

        public boolean hasProcessor() {
            return this.fieldSetFlags()[30];
        }

        public Builder clearProcessor() {
            this.Processor = null;
            this.fieldSetFlags()[30] = false;
            return this;
        }

        public CharSequence getLoanOfficer() {
            return this.LoanOfficer;
        }

        public Builder setLoanOfficer(CharSequence value) {
            this.validate(this.fields()[31], value);
            this.LoanOfficer = value;
            this.fieldSetFlags()[31] = true;
            return this;
        }

        public boolean hasLoanOfficer() {
            return this.fieldSetFlags()[31];
        }

        public Builder clearLoanOfficer() {
            this.LoanOfficer = null;
            this.fieldSetFlags()[31] = false;
            return this;
        }

        public Double getAppraisedValue() {
            return this.AppraisedValue;
        }

        public Builder setAppraisedValue(Double value) {
            this.validate(this.fields()[32], value);
            this.AppraisedValue = value;
            this.fieldSetFlags()[32] = true;
            return this;
        }

        public boolean hasAppraisedValue() {
            return this.fieldSetFlags()[32];
        }

        public Builder clearAppraisedValue() {
            this.AppraisedValue = null;
            this.fieldSetFlags()[32] = false;
            return this;
        }

        public Integer getAppraisalScore() {
            return this.AppraisalScore;
        }

        public Builder setAppraisalScore(Integer value) {
            this.validate(this.fields()[33], value);
            this.AppraisalScore = value;
            this.fieldSetFlags()[33] = true;
            return this;
        }

        public boolean hasAppraisalScore() {
            return this.fieldSetFlags()[33];
        }

        public Builder clearAppraisalScore() {
            this.AppraisalScore = null;
            this.fieldSetFlags()[33] = false;
            return this;
        }

        public Integer getCURiskScore() {
            return this.CURiskScore;
        }

        public Builder setCURiskScore(Integer value) {
            this.validate(this.fields()[34], value);
            this.CURiskScore = value;
            this.fieldSetFlags()[34] = true;
            return this;
        }

        public boolean hasCURiskScore() {
            return this.fieldSetFlags()[34];
        }

        public Builder clearCURiskScore() {
            this.CURiskScore = null;
            this.fieldSetFlags()[34] = false;
            return this;
        }

        public Integer getComplexityScore() {
            return this.ComplexityScore;
        }

        public Builder setComplexityScore(Integer value) {
            this.validate(this.fields()[35], value);
            this.ComplexityScore = value;
            this.fieldSetFlags()[35] = true;
            return this;
        }

        public boolean hasComplexityScore() {
            return this.fieldSetFlags()[35];
        }

        public Builder clearComplexityScore() {
            this.ComplexityScore = null;
            this.fieldSetFlags()[35] = false;
            return this;
        }

        public Orders build() {
            try {
                Orders record = new Orders();
                record.sourceId = this.fieldSetFlags()[0] ? this.sourceId : (CharSequence)this.defaultValue(this.fields()[0]);
                record.eventId = this.fieldSetFlags()[1] ? this.eventId : (CharSequence)this.defaultValue(this.fields()[1]);
                record.correlationId = this.fieldSetFlags()[2] ? this.correlationId : (CharSequence)this.defaultValue(this.fields()[2]);
                record.ClientId = this.fieldSetFlags()[3] ? this.ClientId : (CharSequence)this.defaultValue(this.fields()[3]);
                record.SourceClientId = this.fieldSetFlags()[4] ? this.SourceClientId : (CharSequence)this.defaultValue(this.fields()[4]);
                record.FolderId = this.fieldSetFlags()[5] ? this.FolderId : (CharSequence)this.defaultValue(this.fields()[5]);
                record.LoanNumber = this.fieldSetFlags()[6] ? this.LoanNumber : (CharSequence)this.defaultValue(this.fields()[6]);
                record.LoanPurposeId = this.fieldSetFlags()[7] ? this.LoanPurposeId : (CharSequence)this.defaultValue(this.fields()[7]);
                record.LoanPurposeDescription = this.fieldSetFlags()[8] ? this.LoanPurposeDescription : (CharSequence)this.defaultValue(this.fields()[8]);
                record.LoanClassification = this.fieldSetFlags()[9] ? this.LoanClassification : (CharSequence)this.defaultValue(this.fields()[9]);
                record.ChannelId = this.fieldSetFlags()[10] ? this.ChannelId : (CharSequence)this.defaultValue(this.fields()[10]);
                record.ChannelDescription = this.fieldSetFlags()[11] ? this.ChannelDescription : (CharSequence)this.defaultValue(this.fields()[11]);
                record.Customer = this.fieldSetFlags()[12] ? this.Customer : (CharSequence)this.defaultValue(this.fields()[12]);
                record.PropertyTypeId = this.fieldSetFlags()[13] ? this.PropertyTypeId : (CharSequence)this.defaultValue(this.fields()[13]);
                record.PropertyTypeDescription = this.fieldSetFlags()[14] ? this.PropertyTypeDescription : (CharSequence)this.defaultValue(this.fields()[14]);
                record.StreetNumber = this.fieldSetFlags()[15] ? this.StreetNumber : (CharSequence)this.defaultValue(this.fields()[15]);
                record.Street = this.fieldSetFlags()[16] ? this.Street : (CharSequence)this.defaultValue(this.fields()[16]);
                record.UnitNumber = this.fieldSetFlags()[17] ? this.UnitNumber : (CharSequence)this.defaultValue(this.fields()[17]);
                record.City = this.fieldSetFlags()[18] ? this.City : (CharSequence)this.defaultValue(this.fields()[18]);
                record.State = this.fieldSetFlags()[19] ? this.State : (CharSequence)this.defaultValue(this.fields()[19]);
                record.County = this.fieldSetFlags()[20] ? this.County : (CharSequence)this.defaultValue(this.fields()[20]);
                record.ZipCode = this.fieldSetFlags()[21] ? this.ZipCode : (CharSequence)this.defaultValue(this.fields()[21]);
                record.DocumentId = this.fieldSetFlags()[22] ? this.DocumentId : (CharSequence)this.defaultValue(this.fields()[22]);
                record.ServiceId = this.fieldSetFlags()[23] ? this.ServiceId : (CharSequence)this.defaultValue(this.fields()[23]);
                record.ServiceName = this.fieldSetFlags()[24] ? this.ServiceName : (CharSequence)this.defaultValue(this.fields()[24]);
                record.ServiceProviderLoginId = this.fieldSetFlags()[25] ? this.ServiceProviderLoginId : (CharSequence)this.defaultValue(this.fields()[25]);
                record.ServiceProviderId = this.fieldSetFlags()[26] ? this.ServiceProviderId : (CharSequence)this.defaultValue(this.fields()[26]);
                record.ServiceProviderName = this.fieldSetFlags()[27] ? this.ServiceProviderName : (CharSequence)this.defaultValue(this.fields()[27]);
                record.ServiceProviderFee = this.fieldSetFlags()[28] ? this.ServiceProviderFee : (Double)this.defaultValue(this.fields()[28]);
                record.Reviewer = this.fieldSetFlags()[29] ? this.Reviewer : (CharSequence)this.defaultValue(this.fields()[29]);
                record.Processor = this.fieldSetFlags()[30] ? this.Processor : (CharSequence)this.defaultValue(this.fields()[30]);
                record.LoanOfficer = this.fieldSetFlags()[31] ? this.LoanOfficer : (CharSequence)this.defaultValue(this.fields()[31]);
                record.AppraisedValue = this.fieldSetFlags()[32] ? this.AppraisedValue : (Double)this.defaultValue(this.fields()[32]);
                record.AppraisalScore = this.fieldSetFlags()[33] ? this.AppraisalScore : (Integer)this.defaultValue(this.fields()[33]);
                record.CURiskScore = this.fieldSetFlags()[34] ? this.CURiskScore : (Integer)this.defaultValue(this.fields()[34]);
                record.ComplexityScore = this.fieldSetFlags()[35] ? this.ComplexityScore : (Integer)this.defaultValue(this.fields()[35]);
                return record;
            } catch (AvroMissingFieldException var2) {
                throw var2;
            } catch (Exception var3) {
                throw new AvroRuntimeException(var3);
            }
        }
    }
}