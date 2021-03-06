// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/tx.proto

package io.provenance.metadata.v1;

/**
 * <pre>
 * MsgWriteRecordSpecificationResponse is the response type for the Msg/WriteRecordSpecification RPC method.
 * </pre>
 *
 * Protobuf type {@code provenance.metadata.v1.MsgWriteRecordSpecificationResponse}
 */
public final class MsgWriteRecordSpecificationResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.metadata.v1.MsgWriteRecordSpecificationResponse)
    MsgWriteRecordSpecificationResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgWriteRecordSpecificationResponse.newBuilder() to construct.
  private MsgWriteRecordSpecificationResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgWriteRecordSpecificationResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgWriteRecordSpecificationResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MsgWriteRecordSpecificationResponse(
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
            io.provenance.metadata.v1.RecordSpecIdInfo.Builder subBuilder = null;
            if (recordSpecIdInfo_ != null) {
              subBuilder = recordSpecIdInfo_.toBuilder();
            }
            recordSpecIdInfo_ = input.readMessage(io.provenance.metadata.v1.RecordSpecIdInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(recordSpecIdInfo_);
              recordSpecIdInfo_ = subBuilder.buildPartial();
            }

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
    return io.provenance.metadata.v1.Tx.internal_static_provenance_metadata_v1_MsgWriteRecordSpecificationResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.provenance.metadata.v1.Tx.internal_static_provenance_metadata_v1_MsgWriteRecordSpecificationResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse.class, io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse.Builder.class);
  }

  public static final int RECORD_SPEC_ID_INFO_FIELD_NUMBER = 1;
  private io.provenance.metadata.v1.RecordSpecIdInfo recordSpecIdInfo_;
  /**
   * <pre>
   * record_spec_id_info contains information about the id/address of the record specification that was added or
   * updated.
   * </pre>
   *
   * <code>.provenance.metadata.v1.RecordSpecIdInfo record_spec_id_info = 1 [(.gogoproto.moretags) = "yaml:&#92;"record_spec_id_info&#92;""];</code>
   * @return Whether the recordSpecIdInfo field is set.
   */
  @java.lang.Override
  public boolean hasRecordSpecIdInfo() {
    return recordSpecIdInfo_ != null;
  }
  /**
   * <pre>
   * record_spec_id_info contains information about the id/address of the record specification that was added or
   * updated.
   * </pre>
   *
   * <code>.provenance.metadata.v1.RecordSpecIdInfo record_spec_id_info = 1 [(.gogoproto.moretags) = "yaml:&#92;"record_spec_id_info&#92;""];</code>
   * @return The recordSpecIdInfo.
   */
  @java.lang.Override
  public io.provenance.metadata.v1.RecordSpecIdInfo getRecordSpecIdInfo() {
    return recordSpecIdInfo_ == null ? io.provenance.metadata.v1.RecordSpecIdInfo.getDefaultInstance() : recordSpecIdInfo_;
  }
  /**
   * <pre>
   * record_spec_id_info contains information about the id/address of the record specification that was added or
   * updated.
   * </pre>
   *
   * <code>.provenance.metadata.v1.RecordSpecIdInfo record_spec_id_info = 1 [(.gogoproto.moretags) = "yaml:&#92;"record_spec_id_info&#92;""];</code>
   */
  @java.lang.Override
  public io.provenance.metadata.v1.RecordSpecIdInfoOrBuilder getRecordSpecIdInfoOrBuilder() {
    return getRecordSpecIdInfo();
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
    if (recordSpecIdInfo_ != null) {
      output.writeMessage(1, getRecordSpecIdInfo());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (recordSpecIdInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRecordSpecIdInfo());
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
    if (!(obj instanceof io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse)) {
      return super.equals(obj);
    }
    io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse other = (io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse) obj;

    if (hasRecordSpecIdInfo() != other.hasRecordSpecIdInfo()) return false;
    if (hasRecordSpecIdInfo()) {
      if (!getRecordSpecIdInfo()
          .equals(other.getRecordSpecIdInfo())) return false;
    }
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
    if (hasRecordSpecIdInfo()) {
      hash = (37 * hash) + RECORD_SPEC_ID_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getRecordSpecIdInfo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse parseFrom(
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
  public static Builder newBuilder(io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse prototype) {
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
   * MsgWriteRecordSpecificationResponse is the response type for the Msg/WriteRecordSpecification RPC method.
   * </pre>
   *
   * Protobuf type {@code provenance.metadata.v1.MsgWriteRecordSpecificationResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.metadata.v1.MsgWriteRecordSpecificationResponse)
      io.provenance.metadata.v1.MsgWriteRecordSpecificationResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.provenance.metadata.v1.Tx.internal_static_provenance_metadata_v1_MsgWriteRecordSpecificationResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.provenance.metadata.v1.Tx.internal_static_provenance_metadata_v1_MsgWriteRecordSpecificationResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse.class, io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse.Builder.class);
    }

    // Construct using io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse.newBuilder()
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
      if (recordSpecIdInfoBuilder_ == null) {
        recordSpecIdInfo_ = null;
      } else {
        recordSpecIdInfo_ = null;
        recordSpecIdInfoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.provenance.metadata.v1.Tx.internal_static_provenance_metadata_v1_MsgWriteRecordSpecificationResponse_descriptor;
    }

    @java.lang.Override
    public io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse getDefaultInstanceForType() {
      return io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse.getDefaultInstance();
    }

    @java.lang.Override
    public io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse build() {
      io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse buildPartial() {
      io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse result = new io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse(this);
      if (recordSpecIdInfoBuilder_ == null) {
        result.recordSpecIdInfo_ = recordSpecIdInfo_;
      } else {
        result.recordSpecIdInfo_ = recordSpecIdInfoBuilder_.build();
      }
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
      if (other instanceof io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse) {
        return mergeFrom((io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse other) {
      if (other == io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse.getDefaultInstance()) return this;
      if (other.hasRecordSpecIdInfo()) {
        mergeRecordSpecIdInfo(other.getRecordSpecIdInfo());
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
      io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.provenance.metadata.v1.RecordSpecIdInfo recordSpecIdInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.provenance.metadata.v1.RecordSpecIdInfo, io.provenance.metadata.v1.RecordSpecIdInfo.Builder, io.provenance.metadata.v1.RecordSpecIdInfoOrBuilder> recordSpecIdInfoBuilder_;
    /**
     * <pre>
     * record_spec_id_info contains information about the id/address of the record specification that was added or
     * updated.
     * </pre>
     *
     * <code>.provenance.metadata.v1.RecordSpecIdInfo record_spec_id_info = 1 [(.gogoproto.moretags) = "yaml:&#92;"record_spec_id_info&#92;""];</code>
     * @return Whether the recordSpecIdInfo field is set.
     */
    public boolean hasRecordSpecIdInfo() {
      return recordSpecIdInfoBuilder_ != null || recordSpecIdInfo_ != null;
    }
    /**
     * <pre>
     * record_spec_id_info contains information about the id/address of the record specification that was added or
     * updated.
     * </pre>
     *
     * <code>.provenance.metadata.v1.RecordSpecIdInfo record_spec_id_info = 1 [(.gogoproto.moretags) = "yaml:&#92;"record_spec_id_info&#92;""];</code>
     * @return The recordSpecIdInfo.
     */
    public io.provenance.metadata.v1.RecordSpecIdInfo getRecordSpecIdInfo() {
      if (recordSpecIdInfoBuilder_ == null) {
        return recordSpecIdInfo_ == null ? io.provenance.metadata.v1.RecordSpecIdInfo.getDefaultInstance() : recordSpecIdInfo_;
      } else {
        return recordSpecIdInfoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * record_spec_id_info contains information about the id/address of the record specification that was added or
     * updated.
     * </pre>
     *
     * <code>.provenance.metadata.v1.RecordSpecIdInfo record_spec_id_info = 1 [(.gogoproto.moretags) = "yaml:&#92;"record_spec_id_info&#92;""];</code>
     */
    public Builder setRecordSpecIdInfo(io.provenance.metadata.v1.RecordSpecIdInfo value) {
      if (recordSpecIdInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        recordSpecIdInfo_ = value;
        onChanged();
      } else {
        recordSpecIdInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * record_spec_id_info contains information about the id/address of the record specification that was added or
     * updated.
     * </pre>
     *
     * <code>.provenance.metadata.v1.RecordSpecIdInfo record_spec_id_info = 1 [(.gogoproto.moretags) = "yaml:&#92;"record_spec_id_info&#92;""];</code>
     */
    public Builder setRecordSpecIdInfo(
        io.provenance.metadata.v1.RecordSpecIdInfo.Builder builderForValue) {
      if (recordSpecIdInfoBuilder_ == null) {
        recordSpecIdInfo_ = builderForValue.build();
        onChanged();
      } else {
        recordSpecIdInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * record_spec_id_info contains information about the id/address of the record specification that was added or
     * updated.
     * </pre>
     *
     * <code>.provenance.metadata.v1.RecordSpecIdInfo record_spec_id_info = 1 [(.gogoproto.moretags) = "yaml:&#92;"record_spec_id_info&#92;""];</code>
     */
    public Builder mergeRecordSpecIdInfo(io.provenance.metadata.v1.RecordSpecIdInfo value) {
      if (recordSpecIdInfoBuilder_ == null) {
        if (recordSpecIdInfo_ != null) {
          recordSpecIdInfo_ =
            io.provenance.metadata.v1.RecordSpecIdInfo.newBuilder(recordSpecIdInfo_).mergeFrom(value).buildPartial();
        } else {
          recordSpecIdInfo_ = value;
        }
        onChanged();
      } else {
        recordSpecIdInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * record_spec_id_info contains information about the id/address of the record specification that was added or
     * updated.
     * </pre>
     *
     * <code>.provenance.metadata.v1.RecordSpecIdInfo record_spec_id_info = 1 [(.gogoproto.moretags) = "yaml:&#92;"record_spec_id_info&#92;""];</code>
     */
    public Builder clearRecordSpecIdInfo() {
      if (recordSpecIdInfoBuilder_ == null) {
        recordSpecIdInfo_ = null;
        onChanged();
      } else {
        recordSpecIdInfo_ = null;
        recordSpecIdInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * record_spec_id_info contains information about the id/address of the record specification that was added or
     * updated.
     * </pre>
     *
     * <code>.provenance.metadata.v1.RecordSpecIdInfo record_spec_id_info = 1 [(.gogoproto.moretags) = "yaml:&#92;"record_spec_id_info&#92;""];</code>
     */
    public io.provenance.metadata.v1.RecordSpecIdInfo.Builder getRecordSpecIdInfoBuilder() {
      
      onChanged();
      return getRecordSpecIdInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * record_spec_id_info contains information about the id/address of the record specification that was added or
     * updated.
     * </pre>
     *
     * <code>.provenance.metadata.v1.RecordSpecIdInfo record_spec_id_info = 1 [(.gogoproto.moretags) = "yaml:&#92;"record_spec_id_info&#92;""];</code>
     */
    public io.provenance.metadata.v1.RecordSpecIdInfoOrBuilder getRecordSpecIdInfoOrBuilder() {
      if (recordSpecIdInfoBuilder_ != null) {
        return recordSpecIdInfoBuilder_.getMessageOrBuilder();
      } else {
        return recordSpecIdInfo_ == null ?
            io.provenance.metadata.v1.RecordSpecIdInfo.getDefaultInstance() : recordSpecIdInfo_;
      }
    }
    /**
     * <pre>
     * record_spec_id_info contains information about the id/address of the record specification that was added or
     * updated.
     * </pre>
     *
     * <code>.provenance.metadata.v1.RecordSpecIdInfo record_spec_id_info = 1 [(.gogoproto.moretags) = "yaml:&#92;"record_spec_id_info&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.provenance.metadata.v1.RecordSpecIdInfo, io.provenance.metadata.v1.RecordSpecIdInfo.Builder, io.provenance.metadata.v1.RecordSpecIdInfoOrBuilder> 
        getRecordSpecIdInfoFieldBuilder() {
      if (recordSpecIdInfoBuilder_ == null) {
        recordSpecIdInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.provenance.metadata.v1.RecordSpecIdInfo, io.provenance.metadata.v1.RecordSpecIdInfo.Builder, io.provenance.metadata.v1.RecordSpecIdInfoOrBuilder>(
                getRecordSpecIdInfo(),
                getParentForChildren(),
                isClean());
        recordSpecIdInfo_ = null;
      }
      return recordSpecIdInfoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:provenance.metadata.v1.MsgWriteRecordSpecificationResponse)
  }

  // @@protoc_insertion_point(class_scope:provenance.metadata.v1.MsgWriteRecordSpecificationResponse)
  private static final io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse();
  }

  public static io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgWriteRecordSpecificationResponse>
      PARSER = new com.google.protobuf.AbstractParser<MsgWriteRecordSpecificationResponse>() {
    @java.lang.Override
    public MsgWriteRecordSpecificationResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MsgWriteRecordSpecificationResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MsgWriteRecordSpecificationResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgWriteRecordSpecificationResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.provenance.metadata.v1.MsgWriteRecordSpecificationResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

