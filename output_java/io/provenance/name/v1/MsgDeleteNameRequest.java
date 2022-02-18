// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/name/v1/tx.proto

package io.provenance.name.v1;

/**
 * <pre>
 * MsgDeleteNameRequest defines an sdk.Msg type that is used to remove an existing address/name binding.  The binding
 * may not have any child names currently bound for this request to be successful.
 * </pre>
 *
 * Protobuf type {@code provenance.name.v1.MsgDeleteNameRequest}
 */
public final class MsgDeleteNameRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.name.v1.MsgDeleteNameRequest)
    MsgDeleteNameRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgDeleteNameRequest.newBuilder() to construct.
  private MsgDeleteNameRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgDeleteNameRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgDeleteNameRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MsgDeleteNameRequest(
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
            io.provenance.name.v1.NameRecord.Builder subBuilder = null;
            if (record_ != null) {
              subBuilder = record_.toBuilder();
            }
            record_ = input.readMessage(io.provenance.name.v1.NameRecord.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(record_);
              record_ = subBuilder.buildPartial();
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
    return io.provenance.name.v1.Tx.internal_static_provenance_name_v1_MsgDeleteNameRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.provenance.name.v1.Tx.internal_static_provenance_name_v1_MsgDeleteNameRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.provenance.name.v1.MsgDeleteNameRequest.class, io.provenance.name.v1.MsgDeleteNameRequest.Builder.class);
  }

  public static final int RECORD_FIELD_NUMBER = 1;
  private io.provenance.name.v1.NameRecord record_;
  /**
   * <pre>
   * The record being removed
   * </pre>
   *
   * <code>.provenance.name.v1.NameRecord record = 1 [(.gogoproto.nullable) = false];</code>
   * @return Whether the record field is set.
   */
  @java.lang.Override
  public boolean hasRecord() {
    return record_ != null;
  }
  /**
   * <pre>
   * The record being removed
   * </pre>
   *
   * <code>.provenance.name.v1.NameRecord record = 1 [(.gogoproto.nullable) = false];</code>
   * @return The record.
   */
  @java.lang.Override
  public io.provenance.name.v1.NameRecord getRecord() {
    return record_ == null ? io.provenance.name.v1.NameRecord.getDefaultInstance() : record_;
  }
  /**
   * <pre>
   * The record being removed
   * </pre>
   *
   * <code>.provenance.name.v1.NameRecord record = 1 [(.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public io.provenance.name.v1.NameRecordOrBuilder getRecordOrBuilder() {
    return getRecord();
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
    if (record_ != null) {
      output.writeMessage(1, getRecord());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (record_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRecord());
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
    if (!(obj instanceof io.provenance.name.v1.MsgDeleteNameRequest)) {
      return super.equals(obj);
    }
    io.provenance.name.v1.MsgDeleteNameRequest other = (io.provenance.name.v1.MsgDeleteNameRequest) obj;

    if (hasRecord() != other.hasRecord()) return false;
    if (hasRecord()) {
      if (!getRecord()
          .equals(other.getRecord())) return false;
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
    if (hasRecord()) {
      hash = (37 * hash) + RECORD_FIELD_NUMBER;
      hash = (53 * hash) + getRecord().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.provenance.name.v1.MsgDeleteNameRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.name.v1.MsgDeleteNameRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.name.v1.MsgDeleteNameRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.name.v1.MsgDeleteNameRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.name.v1.MsgDeleteNameRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.name.v1.MsgDeleteNameRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.name.v1.MsgDeleteNameRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.name.v1.MsgDeleteNameRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.name.v1.MsgDeleteNameRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.provenance.name.v1.MsgDeleteNameRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.name.v1.MsgDeleteNameRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.name.v1.MsgDeleteNameRequest parseFrom(
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
  public static Builder newBuilder(io.provenance.name.v1.MsgDeleteNameRequest prototype) {
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
   * MsgDeleteNameRequest defines an sdk.Msg type that is used to remove an existing address/name binding.  The binding
   * may not have any child names currently bound for this request to be successful.
   * </pre>
   *
   * Protobuf type {@code provenance.name.v1.MsgDeleteNameRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.name.v1.MsgDeleteNameRequest)
      io.provenance.name.v1.MsgDeleteNameRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.provenance.name.v1.Tx.internal_static_provenance_name_v1_MsgDeleteNameRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.provenance.name.v1.Tx.internal_static_provenance_name_v1_MsgDeleteNameRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.provenance.name.v1.MsgDeleteNameRequest.class, io.provenance.name.v1.MsgDeleteNameRequest.Builder.class);
    }

    // Construct using io.provenance.name.v1.MsgDeleteNameRequest.newBuilder()
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
      if (recordBuilder_ == null) {
        record_ = null;
      } else {
        record_ = null;
        recordBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.provenance.name.v1.Tx.internal_static_provenance_name_v1_MsgDeleteNameRequest_descriptor;
    }

    @java.lang.Override
    public io.provenance.name.v1.MsgDeleteNameRequest getDefaultInstanceForType() {
      return io.provenance.name.v1.MsgDeleteNameRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.provenance.name.v1.MsgDeleteNameRequest build() {
      io.provenance.name.v1.MsgDeleteNameRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.provenance.name.v1.MsgDeleteNameRequest buildPartial() {
      io.provenance.name.v1.MsgDeleteNameRequest result = new io.provenance.name.v1.MsgDeleteNameRequest(this);
      if (recordBuilder_ == null) {
        result.record_ = record_;
      } else {
        result.record_ = recordBuilder_.build();
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
      if (other instanceof io.provenance.name.v1.MsgDeleteNameRequest) {
        return mergeFrom((io.provenance.name.v1.MsgDeleteNameRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.provenance.name.v1.MsgDeleteNameRequest other) {
      if (other == io.provenance.name.v1.MsgDeleteNameRequest.getDefaultInstance()) return this;
      if (other.hasRecord()) {
        mergeRecord(other.getRecord());
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
      io.provenance.name.v1.MsgDeleteNameRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.provenance.name.v1.MsgDeleteNameRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.provenance.name.v1.NameRecord record_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.provenance.name.v1.NameRecord, io.provenance.name.v1.NameRecord.Builder, io.provenance.name.v1.NameRecordOrBuilder> recordBuilder_;
    /**
     * <pre>
     * The record being removed
     * </pre>
     *
     * <code>.provenance.name.v1.NameRecord record = 1 [(.gogoproto.nullable) = false];</code>
     * @return Whether the record field is set.
     */
    public boolean hasRecord() {
      return recordBuilder_ != null || record_ != null;
    }
    /**
     * <pre>
     * The record being removed
     * </pre>
     *
     * <code>.provenance.name.v1.NameRecord record = 1 [(.gogoproto.nullable) = false];</code>
     * @return The record.
     */
    public io.provenance.name.v1.NameRecord getRecord() {
      if (recordBuilder_ == null) {
        return record_ == null ? io.provenance.name.v1.NameRecord.getDefaultInstance() : record_;
      } else {
        return recordBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The record being removed
     * </pre>
     *
     * <code>.provenance.name.v1.NameRecord record = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setRecord(io.provenance.name.v1.NameRecord value) {
      if (recordBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        record_ = value;
        onChanged();
      } else {
        recordBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The record being removed
     * </pre>
     *
     * <code>.provenance.name.v1.NameRecord record = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setRecord(
        io.provenance.name.v1.NameRecord.Builder builderForValue) {
      if (recordBuilder_ == null) {
        record_ = builderForValue.build();
        onChanged();
      } else {
        recordBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The record being removed
     * </pre>
     *
     * <code>.provenance.name.v1.NameRecord record = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder mergeRecord(io.provenance.name.v1.NameRecord value) {
      if (recordBuilder_ == null) {
        if (record_ != null) {
          record_ =
            io.provenance.name.v1.NameRecord.newBuilder(record_).mergeFrom(value).buildPartial();
        } else {
          record_ = value;
        }
        onChanged();
      } else {
        recordBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The record being removed
     * </pre>
     *
     * <code>.provenance.name.v1.NameRecord record = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder clearRecord() {
      if (recordBuilder_ == null) {
        record_ = null;
        onChanged();
      } else {
        record_ = null;
        recordBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The record being removed
     * </pre>
     *
     * <code>.provenance.name.v1.NameRecord record = 1 [(.gogoproto.nullable) = false];</code>
     */
    public io.provenance.name.v1.NameRecord.Builder getRecordBuilder() {
      
      onChanged();
      return getRecordFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The record being removed
     * </pre>
     *
     * <code>.provenance.name.v1.NameRecord record = 1 [(.gogoproto.nullable) = false];</code>
     */
    public io.provenance.name.v1.NameRecordOrBuilder getRecordOrBuilder() {
      if (recordBuilder_ != null) {
        return recordBuilder_.getMessageOrBuilder();
      } else {
        return record_ == null ?
            io.provenance.name.v1.NameRecord.getDefaultInstance() : record_;
      }
    }
    /**
     * <pre>
     * The record being removed
     * </pre>
     *
     * <code>.provenance.name.v1.NameRecord record = 1 [(.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.provenance.name.v1.NameRecord, io.provenance.name.v1.NameRecord.Builder, io.provenance.name.v1.NameRecordOrBuilder> 
        getRecordFieldBuilder() {
      if (recordBuilder_ == null) {
        recordBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.provenance.name.v1.NameRecord, io.provenance.name.v1.NameRecord.Builder, io.provenance.name.v1.NameRecordOrBuilder>(
                getRecord(),
                getParentForChildren(),
                isClean());
        record_ = null;
      }
      return recordBuilder_;
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


    // @@protoc_insertion_point(builder_scope:provenance.name.v1.MsgDeleteNameRequest)
  }

  // @@protoc_insertion_point(class_scope:provenance.name.v1.MsgDeleteNameRequest)
  private static final io.provenance.name.v1.MsgDeleteNameRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.provenance.name.v1.MsgDeleteNameRequest();
  }

  public static io.provenance.name.v1.MsgDeleteNameRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgDeleteNameRequest>
      PARSER = new com.google.protobuf.AbstractParser<MsgDeleteNameRequest>() {
    @java.lang.Override
    public MsgDeleteNameRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MsgDeleteNameRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MsgDeleteNameRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgDeleteNameRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.provenance.name.v1.MsgDeleteNameRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

