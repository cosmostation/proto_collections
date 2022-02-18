// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/query.proto

package io.provenance.metadata.v1;

/**
 * <pre>
 * ContractSpecificationRequest is the request type for the Query/ContractSpecification RPC method.
 * </pre>
 *
 * Protobuf type {@code provenance.metadata.v1.ContractSpecificationRequest}
 */
public final class ContractSpecificationRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.metadata.v1.ContractSpecificationRequest)
    ContractSpecificationRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ContractSpecificationRequest.newBuilder() to construct.
  private ContractSpecificationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ContractSpecificationRequest() {
    specificationId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ContractSpecificationRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ContractSpecificationRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            specificationId_ = s;
            break;
          }
          case 80: {

            includeRecordSpecs_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.provenance.metadata.v1.QueryOuterClass.internal_static_provenance_metadata_v1_ContractSpecificationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.provenance.metadata.v1.QueryOuterClass.internal_static_provenance_metadata_v1_ContractSpecificationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.provenance.metadata.v1.ContractSpecificationRequest.class, io.provenance.metadata.v1.ContractSpecificationRequest.Builder.class);
  }

  public static final int SPECIFICATION_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object specificationId_;
  /**
   * <pre>
   * specification_id can either be a uuid, e.g. def6bc0a-c9dd-4874-948f-5206e6060a84 or a bech32 contract specification
   * address, e.g. contractspec1q000d0q2e8w5say53afqdesxp2zqzkr4fn.
   * It can also be a record specification address, e.g.
   * recspec1qh00d0q2e8w5say53afqdesxp2zw42dq2jdvmdazuwzcaddhh8gmuqhez44.
   * </pre>
   *
   * <code>string specification_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"specification_id&#92;""];</code>
   * @return The specificationId.
   */
  @java.lang.Override
  public java.lang.String getSpecificationId() {
    java.lang.Object ref = specificationId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      specificationId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * specification_id can either be a uuid, e.g. def6bc0a-c9dd-4874-948f-5206e6060a84 or a bech32 contract specification
   * address, e.g. contractspec1q000d0q2e8w5say53afqdesxp2zqzkr4fn.
   * It can also be a record specification address, e.g.
   * recspec1qh00d0q2e8w5say53afqdesxp2zw42dq2jdvmdazuwzcaddhh8gmuqhez44.
   * </pre>
   *
   * <code>string specification_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"specification_id&#92;""];</code>
   * @return The bytes for specificationId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSpecificationIdBytes() {
    java.lang.Object ref = specificationId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      specificationId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INCLUDE_RECORD_SPECS_FIELD_NUMBER = 10;
  private boolean includeRecordSpecs_;
  /**
   * <pre>
   * include_record_specs is a flag for whether or not the record specifications in this contract specification should
   * be included in the result.
   * </pre>
   *
   * <code>bool include_record_specs = 10 [(.gogoproto.moretags) = "yaml:&#92;"include_record_specs&#92;""];</code>
   * @return The includeRecordSpecs.
   */
  @java.lang.Override
  public boolean getIncludeRecordSpecs() {
    return includeRecordSpecs_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getSpecificationIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, specificationId_);
    }
    if (includeRecordSpecs_ != false) {
      output.writeBool(10, includeRecordSpecs_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSpecificationIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, specificationId_);
    }
    if (includeRecordSpecs_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(10, includeRecordSpecs_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.provenance.metadata.v1.ContractSpecificationRequest)) {
      return super.equals(obj);
    }
    io.provenance.metadata.v1.ContractSpecificationRequest other = (io.provenance.metadata.v1.ContractSpecificationRequest) obj;

    if (!getSpecificationId()
        .equals(other.getSpecificationId())) return false;
    if (getIncludeRecordSpecs()
        != other.getIncludeRecordSpecs()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SPECIFICATION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSpecificationId().hashCode();
    hash = (37 * hash) + INCLUDE_RECORD_SPECS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIncludeRecordSpecs());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.provenance.metadata.v1.ContractSpecificationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.ContractSpecificationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.ContractSpecificationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.ContractSpecificationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.ContractSpecificationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.ContractSpecificationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.ContractSpecificationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.ContractSpecificationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.metadata.v1.ContractSpecificationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.ContractSpecificationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.metadata.v1.ContractSpecificationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.ContractSpecificationRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.provenance.metadata.v1.ContractSpecificationRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * ContractSpecificationRequest is the request type for the Query/ContractSpecification RPC method.
   * </pre>
   *
   * Protobuf type {@code provenance.metadata.v1.ContractSpecificationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.metadata.v1.ContractSpecificationRequest)
      io.provenance.metadata.v1.ContractSpecificationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.provenance.metadata.v1.QueryOuterClass.internal_static_provenance_metadata_v1_ContractSpecificationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.provenance.metadata.v1.QueryOuterClass.internal_static_provenance_metadata_v1_ContractSpecificationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.provenance.metadata.v1.ContractSpecificationRequest.class, io.provenance.metadata.v1.ContractSpecificationRequest.Builder.class);
    }

    // Construct using io.provenance.metadata.v1.ContractSpecificationRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      specificationId_ = "";

      includeRecordSpecs_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.provenance.metadata.v1.QueryOuterClass.internal_static_provenance_metadata_v1_ContractSpecificationRequest_descriptor;
    }

    @java.lang.Override
    public io.provenance.metadata.v1.ContractSpecificationRequest getDefaultInstanceForType() {
      return io.provenance.metadata.v1.ContractSpecificationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.provenance.metadata.v1.ContractSpecificationRequest build() {
      io.provenance.metadata.v1.ContractSpecificationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.provenance.metadata.v1.ContractSpecificationRequest buildPartial() {
      io.provenance.metadata.v1.ContractSpecificationRequest result = new io.provenance.metadata.v1.ContractSpecificationRequest(this);
      result.specificationId_ = specificationId_;
      result.includeRecordSpecs_ = includeRecordSpecs_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.provenance.metadata.v1.ContractSpecificationRequest) {
        return mergeFrom((io.provenance.metadata.v1.ContractSpecificationRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.provenance.metadata.v1.ContractSpecificationRequest other) {
      if (other == io.provenance.metadata.v1.ContractSpecificationRequest.getDefaultInstance()) return this;
      if (!other.getSpecificationId().isEmpty()) {
        specificationId_ = other.specificationId_;
        onChanged();
      }
      if (other.getIncludeRecordSpecs() != false) {
        setIncludeRecordSpecs(other.getIncludeRecordSpecs());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.provenance.metadata.v1.ContractSpecificationRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.provenance.metadata.v1.ContractSpecificationRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object specificationId_ = "";
    /**
     * <pre>
     * specification_id can either be a uuid, e.g. def6bc0a-c9dd-4874-948f-5206e6060a84 or a bech32 contract specification
     * address, e.g. contractspec1q000d0q2e8w5say53afqdesxp2zqzkr4fn.
     * It can also be a record specification address, e.g.
     * recspec1qh00d0q2e8w5say53afqdesxp2zw42dq2jdvmdazuwzcaddhh8gmuqhez44.
     * </pre>
     *
     * <code>string specification_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"specification_id&#92;""];</code>
     * @return The specificationId.
     */
    public java.lang.String getSpecificationId() {
      java.lang.Object ref = specificationId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        specificationId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * specification_id can either be a uuid, e.g. def6bc0a-c9dd-4874-948f-5206e6060a84 or a bech32 contract specification
     * address, e.g. contractspec1q000d0q2e8w5say53afqdesxp2zqzkr4fn.
     * It can also be a record specification address, e.g.
     * recspec1qh00d0q2e8w5say53afqdesxp2zw42dq2jdvmdazuwzcaddhh8gmuqhez44.
     * </pre>
     *
     * <code>string specification_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"specification_id&#92;""];</code>
     * @return The bytes for specificationId.
     */
    public com.google.protobuf.ByteString
        getSpecificationIdBytes() {
      java.lang.Object ref = specificationId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        specificationId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * specification_id can either be a uuid, e.g. def6bc0a-c9dd-4874-948f-5206e6060a84 or a bech32 contract specification
     * address, e.g. contractspec1q000d0q2e8w5say53afqdesxp2zqzkr4fn.
     * It can also be a record specification address, e.g.
     * recspec1qh00d0q2e8w5say53afqdesxp2zw42dq2jdvmdazuwzcaddhh8gmuqhez44.
     * </pre>
     *
     * <code>string specification_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"specification_id&#92;""];</code>
     * @param value The specificationId to set.
     * @return This builder for chaining.
     */
    public Builder setSpecificationId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      specificationId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * specification_id can either be a uuid, e.g. def6bc0a-c9dd-4874-948f-5206e6060a84 or a bech32 contract specification
     * address, e.g. contractspec1q000d0q2e8w5say53afqdesxp2zqzkr4fn.
     * It can also be a record specification address, e.g.
     * recspec1qh00d0q2e8w5say53afqdesxp2zw42dq2jdvmdazuwzcaddhh8gmuqhez44.
     * </pre>
     *
     * <code>string specification_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"specification_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearSpecificationId() {
      
      specificationId_ = getDefaultInstance().getSpecificationId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * specification_id can either be a uuid, e.g. def6bc0a-c9dd-4874-948f-5206e6060a84 or a bech32 contract specification
     * address, e.g. contractspec1q000d0q2e8w5say53afqdesxp2zqzkr4fn.
     * It can also be a record specification address, e.g.
     * recspec1qh00d0q2e8w5say53afqdesxp2zw42dq2jdvmdazuwzcaddhh8gmuqhez44.
     * </pre>
     *
     * <code>string specification_id = 1 [(.gogoproto.moretags) = "yaml:&#92;"specification_id&#92;""];</code>
     * @param value The bytes for specificationId to set.
     * @return This builder for chaining.
     */
    public Builder setSpecificationIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      specificationId_ = value;
      onChanged();
      return this;
    }

    private boolean includeRecordSpecs_ ;
    /**
     * <pre>
     * include_record_specs is a flag for whether or not the record specifications in this contract specification should
     * be included in the result.
     * </pre>
     *
     * <code>bool include_record_specs = 10 [(.gogoproto.moretags) = "yaml:&#92;"include_record_specs&#92;""];</code>
     * @return The includeRecordSpecs.
     */
    @java.lang.Override
    public boolean getIncludeRecordSpecs() {
      return includeRecordSpecs_;
    }
    /**
     * <pre>
     * include_record_specs is a flag for whether or not the record specifications in this contract specification should
     * be included in the result.
     * </pre>
     *
     * <code>bool include_record_specs = 10 [(.gogoproto.moretags) = "yaml:&#92;"include_record_specs&#92;""];</code>
     * @param value The includeRecordSpecs to set.
     * @return This builder for chaining.
     */
    public Builder setIncludeRecordSpecs(boolean value) {
      
      includeRecordSpecs_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * include_record_specs is a flag for whether or not the record specifications in this contract specification should
     * be included in the result.
     * </pre>
     *
     * <code>bool include_record_specs = 10 [(.gogoproto.moretags) = "yaml:&#92;"include_record_specs&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearIncludeRecordSpecs() {
      
      includeRecordSpecs_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:provenance.metadata.v1.ContractSpecificationRequest)
  }

  // @@protoc_insertion_point(class_scope:provenance.metadata.v1.ContractSpecificationRequest)
  private static final io.provenance.metadata.v1.ContractSpecificationRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.provenance.metadata.v1.ContractSpecificationRequest();
  }

  public static io.provenance.metadata.v1.ContractSpecificationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ContractSpecificationRequest>
      PARSER = new com.google.protobuf.AbstractParser<ContractSpecificationRequest>() {
    @java.lang.Override
    public ContractSpecificationRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ContractSpecificationRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ContractSpecificationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ContractSpecificationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.provenance.metadata.v1.ContractSpecificationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

