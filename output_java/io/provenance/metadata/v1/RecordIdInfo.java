// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/metadata.proto

package io.provenance.metadata.v1;

/**
 * <pre>
 * RecordIdInfo contains various info regarding a record id.
 * </pre>
 *
 * Protobuf type {@code provenance.metadata.v1.RecordIdInfo}
 */
public final class RecordIdInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.metadata.v1.RecordIdInfo)
    RecordIdInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RecordIdInfo.newBuilder() to construct.
  private RecordIdInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RecordIdInfo() {
    recordId_ = com.google.protobuf.ByteString.EMPTY;
    recordIdPrefix_ = com.google.protobuf.ByteString.EMPTY;
    recordIdScopeUuid_ = com.google.protobuf.ByteString.EMPTY;
    recordIdHashedName_ = com.google.protobuf.ByteString.EMPTY;
    recordAddr_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RecordIdInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RecordIdInfo(
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

            recordId_ = input.readBytes();
            break;
          }
          case 18: {

            recordIdPrefix_ = input.readBytes();
            break;
          }
          case 26: {

            recordIdScopeUuid_ = input.readBytes();
            break;
          }
          case 34: {

            recordIdHashedName_ = input.readBytes();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            recordAddr_ = s;
            break;
          }
          case 50: {
            io.provenance.metadata.v1.ScopeIdInfo.Builder subBuilder = null;
            if (scopeIdInfo_ != null) {
              subBuilder = scopeIdInfo_.toBuilder();
            }
            scopeIdInfo_ = input.readMessage(io.provenance.metadata.v1.ScopeIdInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(scopeIdInfo_);
              scopeIdInfo_ = subBuilder.buildPartial();
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
    return io.provenance.metadata.v1.Metadata.internal_static_provenance_metadata_v1_RecordIdInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.provenance.metadata.v1.Metadata.internal_static_provenance_metadata_v1_RecordIdInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.provenance.metadata.v1.RecordIdInfo.class, io.provenance.metadata.v1.RecordIdInfo.Builder.class);
  }

  public static final int RECORD_ID_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString recordId_;
  /**
   * <pre>
   * record_id is the raw bytes of the record address.
   * </pre>
   *
   * <code>bytes record_id = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"record_id&#92;""];</code>
   * @return The recordId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRecordId() {
    return recordId_;
  }

  public static final int RECORD_ID_PREFIX_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString recordIdPrefix_;
  /**
   * <pre>
   * record_id_prefix is the prefix portion of the record_id.
   * </pre>
   *
   * <code>bytes record_id_prefix = 2 [(.gogoproto.moretags) = "yaml:&#92;"record_id_prefix&#92;""];</code>
   * @return The recordIdPrefix.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRecordIdPrefix() {
    return recordIdPrefix_;
  }

  public static final int RECORD_ID_SCOPE_UUID_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString recordIdScopeUuid_;
  /**
   * <pre>
   * record_id_scope_uuid is the scope_uuid portion of the record_id.
   * </pre>
   *
   * <code>bytes record_id_scope_uuid = 3 [(.gogoproto.moretags) = "yaml:&#92;"record_id_scope_uuid&#92;""];</code>
   * @return The recordIdScopeUuid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRecordIdScopeUuid() {
    return recordIdScopeUuid_;
  }

  public static final int RECORD_ID_HASHED_NAME_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString recordIdHashedName_;
  /**
   * <pre>
   * record_id_hashed_name is the hashed name portion of the record_id.
   * </pre>
   *
   * <code>bytes record_id_hashed_name = 4 [(.gogoproto.moretags) = "yaml:&#92;"record_id_hashed_name&#92;""];</code>
   * @return The recordIdHashedName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRecordIdHashedName() {
    return recordIdHashedName_;
  }

  public static final int RECORD_ADDR_FIELD_NUMBER = 5;
  private volatile java.lang.Object recordAddr_;
  /**
   * <pre>
   * record_addr is the bech32 string version of the record_id.
   * </pre>
   *
   * <code>string record_addr = 5 [(.gogoproto.moretags) = "yaml:&#92;"record_addr&#92;""];</code>
   * @return The recordAddr.
   */
  @java.lang.Override
  public java.lang.String getRecordAddr() {
    java.lang.Object ref = recordAddr_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      recordAddr_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * record_addr is the bech32 string version of the record_id.
   * </pre>
   *
   * <code>string record_addr = 5 [(.gogoproto.moretags) = "yaml:&#92;"record_addr&#92;""];</code>
   * @return The bytes for recordAddr.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRecordAddrBytes() {
    java.lang.Object ref = recordAddr_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      recordAddr_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SCOPE_ID_INFO_FIELD_NUMBER = 6;
  private io.provenance.metadata.v1.ScopeIdInfo scopeIdInfo_;
  /**
   * <pre>
   * scope_id_info is information about the scope id referenced in the record_id.
   * </pre>
   *
   * <code>.provenance.metadata.v1.ScopeIdInfo scope_id_info = 6 [(.gogoproto.moretags) = "yaml:&#92;"scope_id_info&#92;""];</code>
   * @return Whether the scopeIdInfo field is set.
   */
  @java.lang.Override
  public boolean hasScopeIdInfo() {
    return scopeIdInfo_ != null;
  }
  /**
   * <pre>
   * scope_id_info is information about the scope id referenced in the record_id.
   * </pre>
   *
   * <code>.provenance.metadata.v1.ScopeIdInfo scope_id_info = 6 [(.gogoproto.moretags) = "yaml:&#92;"scope_id_info&#92;""];</code>
   * @return The scopeIdInfo.
   */
  @java.lang.Override
  public io.provenance.metadata.v1.ScopeIdInfo getScopeIdInfo() {
    return scopeIdInfo_ == null ? io.provenance.metadata.v1.ScopeIdInfo.getDefaultInstance() : scopeIdInfo_;
  }
  /**
   * <pre>
   * scope_id_info is information about the scope id referenced in the record_id.
   * </pre>
   *
   * <code>.provenance.metadata.v1.ScopeIdInfo scope_id_info = 6 [(.gogoproto.moretags) = "yaml:&#92;"scope_id_info&#92;""];</code>
   */
  @java.lang.Override
  public io.provenance.metadata.v1.ScopeIdInfoOrBuilder getScopeIdInfoOrBuilder() {
    return getScopeIdInfo();
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
    if (!recordId_.isEmpty()) {
      output.writeBytes(1, recordId_);
    }
    if (!recordIdPrefix_.isEmpty()) {
      output.writeBytes(2, recordIdPrefix_);
    }
    if (!recordIdScopeUuid_.isEmpty()) {
      output.writeBytes(3, recordIdScopeUuid_);
    }
    if (!recordIdHashedName_.isEmpty()) {
      output.writeBytes(4, recordIdHashedName_);
    }
    if (!getRecordAddrBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, recordAddr_);
    }
    if (scopeIdInfo_ != null) {
      output.writeMessage(6, getScopeIdInfo());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!recordId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, recordId_);
    }
    if (!recordIdPrefix_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, recordIdPrefix_);
    }
    if (!recordIdScopeUuid_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, recordIdScopeUuid_);
    }
    if (!recordIdHashedName_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, recordIdHashedName_);
    }
    if (!getRecordAddrBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, recordAddr_);
    }
    if (scopeIdInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, getScopeIdInfo());
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
    if (!(obj instanceof io.provenance.metadata.v1.RecordIdInfo)) {
      return super.equals(obj);
    }
    io.provenance.metadata.v1.RecordIdInfo other = (io.provenance.metadata.v1.RecordIdInfo) obj;

    if (!getRecordId()
        .equals(other.getRecordId())) return false;
    if (!getRecordIdPrefix()
        .equals(other.getRecordIdPrefix())) return false;
    if (!getRecordIdScopeUuid()
        .equals(other.getRecordIdScopeUuid())) return false;
    if (!getRecordIdHashedName()
        .equals(other.getRecordIdHashedName())) return false;
    if (!getRecordAddr()
        .equals(other.getRecordAddr())) return false;
    if (hasScopeIdInfo() != other.hasScopeIdInfo()) return false;
    if (hasScopeIdInfo()) {
      if (!getScopeIdInfo()
          .equals(other.getScopeIdInfo())) return false;
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
    hash = (37 * hash) + RECORD_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRecordId().hashCode();
    hash = (37 * hash) + RECORD_ID_PREFIX_FIELD_NUMBER;
    hash = (53 * hash) + getRecordIdPrefix().hashCode();
    hash = (37 * hash) + RECORD_ID_SCOPE_UUID_FIELD_NUMBER;
    hash = (53 * hash) + getRecordIdScopeUuid().hashCode();
    hash = (37 * hash) + RECORD_ID_HASHED_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getRecordIdHashedName().hashCode();
    hash = (37 * hash) + RECORD_ADDR_FIELD_NUMBER;
    hash = (53 * hash) + getRecordAddr().hashCode();
    if (hasScopeIdInfo()) {
      hash = (37 * hash) + SCOPE_ID_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getScopeIdInfo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.provenance.metadata.v1.RecordIdInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.RecordIdInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.RecordIdInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.RecordIdInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.RecordIdInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.RecordIdInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.RecordIdInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.RecordIdInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.metadata.v1.RecordIdInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.RecordIdInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.metadata.v1.RecordIdInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.RecordIdInfo parseFrom(
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
  public static Builder newBuilder(io.provenance.metadata.v1.RecordIdInfo prototype) {
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
   * RecordIdInfo contains various info regarding a record id.
   * </pre>
   *
   * Protobuf type {@code provenance.metadata.v1.RecordIdInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.metadata.v1.RecordIdInfo)
      io.provenance.metadata.v1.RecordIdInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.provenance.metadata.v1.Metadata.internal_static_provenance_metadata_v1_RecordIdInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.provenance.metadata.v1.Metadata.internal_static_provenance_metadata_v1_RecordIdInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.provenance.metadata.v1.RecordIdInfo.class, io.provenance.metadata.v1.RecordIdInfo.Builder.class);
    }

    // Construct using io.provenance.metadata.v1.RecordIdInfo.newBuilder()
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
      recordId_ = com.google.protobuf.ByteString.EMPTY;

      recordIdPrefix_ = com.google.protobuf.ByteString.EMPTY;

      recordIdScopeUuid_ = com.google.protobuf.ByteString.EMPTY;

      recordIdHashedName_ = com.google.protobuf.ByteString.EMPTY;

      recordAddr_ = "";

      if (scopeIdInfoBuilder_ == null) {
        scopeIdInfo_ = null;
      } else {
        scopeIdInfo_ = null;
        scopeIdInfoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.provenance.metadata.v1.Metadata.internal_static_provenance_metadata_v1_RecordIdInfo_descriptor;
    }

    @java.lang.Override
    public io.provenance.metadata.v1.RecordIdInfo getDefaultInstanceForType() {
      return io.provenance.metadata.v1.RecordIdInfo.getDefaultInstance();
    }

    @java.lang.Override
    public io.provenance.metadata.v1.RecordIdInfo build() {
      io.provenance.metadata.v1.RecordIdInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.provenance.metadata.v1.RecordIdInfo buildPartial() {
      io.provenance.metadata.v1.RecordIdInfo result = new io.provenance.metadata.v1.RecordIdInfo(this);
      result.recordId_ = recordId_;
      result.recordIdPrefix_ = recordIdPrefix_;
      result.recordIdScopeUuid_ = recordIdScopeUuid_;
      result.recordIdHashedName_ = recordIdHashedName_;
      result.recordAddr_ = recordAddr_;
      if (scopeIdInfoBuilder_ == null) {
        result.scopeIdInfo_ = scopeIdInfo_;
      } else {
        result.scopeIdInfo_ = scopeIdInfoBuilder_.build();
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
      if (other instanceof io.provenance.metadata.v1.RecordIdInfo) {
        return mergeFrom((io.provenance.metadata.v1.RecordIdInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.provenance.metadata.v1.RecordIdInfo other) {
      if (other == io.provenance.metadata.v1.RecordIdInfo.getDefaultInstance()) return this;
      if (other.getRecordId() != com.google.protobuf.ByteString.EMPTY) {
        setRecordId(other.getRecordId());
      }
      if (other.getRecordIdPrefix() != com.google.protobuf.ByteString.EMPTY) {
        setRecordIdPrefix(other.getRecordIdPrefix());
      }
      if (other.getRecordIdScopeUuid() != com.google.protobuf.ByteString.EMPTY) {
        setRecordIdScopeUuid(other.getRecordIdScopeUuid());
      }
      if (other.getRecordIdHashedName() != com.google.protobuf.ByteString.EMPTY) {
        setRecordIdHashedName(other.getRecordIdHashedName());
      }
      if (!other.getRecordAddr().isEmpty()) {
        recordAddr_ = other.recordAddr_;
        onChanged();
      }
      if (other.hasScopeIdInfo()) {
        mergeScopeIdInfo(other.getScopeIdInfo());
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
      io.provenance.metadata.v1.RecordIdInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.provenance.metadata.v1.RecordIdInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString recordId_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * record_id is the raw bytes of the record address.
     * </pre>
     *
     * <code>bytes record_id = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"record_id&#92;""];</code>
     * @return The recordId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getRecordId() {
      return recordId_;
    }
    /**
     * <pre>
     * record_id is the raw bytes of the record address.
     * </pre>
     *
     * <code>bytes record_id = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"record_id&#92;""];</code>
     * @param value The recordId to set.
     * @return This builder for chaining.
     */
    public Builder setRecordId(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      recordId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * record_id is the raw bytes of the record address.
     * </pre>
     *
     * <code>bytes record_id = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"record_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearRecordId() {
      
      recordId_ = getDefaultInstance().getRecordId();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString recordIdPrefix_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * record_id_prefix is the prefix portion of the record_id.
     * </pre>
     *
     * <code>bytes record_id_prefix = 2 [(.gogoproto.moretags) = "yaml:&#92;"record_id_prefix&#92;""];</code>
     * @return The recordIdPrefix.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getRecordIdPrefix() {
      return recordIdPrefix_;
    }
    /**
     * <pre>
     * record_id_prefix is the prefix portion of the record_id.
     * </pre>
     *
     * <code>bytes record_id_prefix = 2 [(.gogoproto.moretags) = "yaml:&#92;"record_id_prefix&#92;""];</code>
     * @param value The recordIdPrefix to set.
     * @return This builder for chaining.
     */
    public Builder setRecordIdPrefix(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      recordIdPrefix_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * record_id_prefix is the prefix portion of the record_id.
     * </pre>
     *
     * <code>bytes record_id_prefix = 2 [(.gogoproto.moretags) = "yaml:&#92;"record_id_prefix&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearRecordIdPrefix() {
      
      recordIdPrefix_ = getDefaultInstance().getRecordIdPrefix();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString recordIdScopeUuid_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * record_id_scope_uuid is the scope_uuid portion of the record_id.
     * </pre>
     *
     * <code>bytes record_id_scope_uuid = 3 [(.gogoproto.moretags) = "yaml:&#92;"record_id_scope_uuid&#92;""];</code>
     * @return The recordIdScopeUuid.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getRecordIdScopeUuid() {
      return recordIdScopeUuid_;
    }
    /**
     * <pre>
     * record_id_scope_uuid is the scope_uuid portion of the record_id.
     * </pre>
     *
     * <code>bytes record_id_scope_uuid = 3 [(.gogoproto.moretags) = "yaml:&#92;"record_id_scope_uuid&#92;""];</code>
     * @param value The recordIdScopeUuid to set.
     * @return This builder for chaining.
     */
    public Builder setRecordIdScopeUuid(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      recordIdScopeUuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * record_id_scope_uuid is the scope_uuid portion of the record_id.
     * </pre>
     *
     * <code>bytes record_id_scope_uuid = 3 [(.gogoproto.moretags) = "yaml:&#92;"record_id_scope_uuid&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearRecordIdScopeUuid() {
      
      recordIdScopeUuid_ = getDefaultInstance().getRecordIdScopeUuid();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString recordIdHashedName_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * record_id_hashed_name is the hashed name portion of the record_id.
     * </pre>
     *
     * <code>bytes record_id_hashed_name = 4 [(.gogoproto.moretags) = "yaml:&#92;"record_id_hashed_name&#92;""];</code>
     * @return The recordIdHashedName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getRecordIdHashedName() {
      return recordIdHashedName_;
    }
    /**
     * <pre>
     * record_id_hashed_name is the hashed name portion of the record_id.
     * </pre>
     *
     * <code>bytes record_id_hashed_name = 4 [(.gogoproto.moretags) = "yaml:&#92;"record_id_hashed_name&#92;""];</code>
     * @param value The recordIdHashedName to set.
     * @return This builder for chaining.
     */
    public Builder setRecordIdHashedName(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      recordIdHashedName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * record_id_hashed_name is the hashed name portion of the record_id.
     * </pre>
     *
     * <code>bytes record_id_hashed_name = 4 [(.gogoproto.moretags) = "yaml:&#92;"record_id_hashed_name&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearRecordIdHashedName() {
      
      recordIdHashedName_ = getDefaultInstance().getRecordIdHashedName();
      onChanged();
      return this;
    }

    private java.lang.Object recordAddr_ = "";
    /**
     * <pre>
     * record_addr is the bech32 string version of the record_id.
     * </pre>
     *
     * <code>string record_addr = 5 [(.gogoproto.moretags) = "yaml:&#92;"record_addr&#92;""];</code>
     * @return The recordAddr.
     */
    public java.lang.String getRecordAddr() {
      java.lang.Object ref = recordAddr_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        recordAddr_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * record_addr is the bech32 string version of the record_id.
     * </pre>
     *
     * <code>string record_addr = 5 [(.gogoproto.moretags) = "yaml:&#92;"record_addr&#92;""];</code>
     * @return The bytes for recordAddr.
     */
    public com.google.protobuf.ByteString
        getRecordAddrBytes() {
      java.lang.Object ref = recordAddr_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        recordAddr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * record_addr is the bech32 string version of the record_id.
     * </pre>
     *
     * <code>string record_addr = 5 [(.gogoproto.moretags) = "yaml:&#92;"record_addr&#92;""];</code>
     * @param value The recordAddr to set.
     * @return This builder for chaining.
     */
    public Builder setRecordAddr(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      recordAddr_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * record_addr is the bech32 string version of the record_id.
     * </pre>
     *
     * <code>string record_addr = 5 [(.gogoproto.moretags) = "yaml:&#92;"record_addr&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearRecordAddr() {
      
      recordAddr_ = getDefaultInstance().getRecordAddr();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * record_addr is the bech32 string version of the record_id.
     * </pre>
     *
     * <code>string record_addr = 5 [(.gogoproto.moretags) = "yaml:&#92;"record_addr&#92;""];</code>
     * @param value The bytes for recordAddr to set.
     * @return This builder for chaining.
     */
    public Builder setRecordAddrBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      recordAddr_ = value;
      onChanged();
      return this;
    }

    private io.provenance.metadata.v1.ScopeIdInfo scopeIdInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.provenance.metadata.v1.ScopeIdInfo, io.provenance.metadata.v1.ScopeIdInfo.Builder, io.provenance.metadata.v1.ScopeIdInfoOrBuilder> scopeIdInfoBuilder_;
    /**
     * <pre>
     * scope_id_info is information about the scope id referenced in the record_id.
     * </pre>
     *
     * <code>.provenance.metadata.v1.ScopeIdInfo scope_id_info = 6 [(.gogoproto.moretags) = "yaml:&#92;"scope_id_info&#92;""];</code>
     * @return Whether the scopeIdInfo field is set.
     */
    public boolean hasScopeIdInfo() {
      return scopeIdInfoBuilder_ != null || scopeIdInfo_ != null;
    }
    /**
     * <pre>
     * scope_id_info is information about the scope id referenced in the record_id.
     * </pre>
     *
     * <code>.provenance.metadata.v1.ScopeIdInfo scope_id_info = 6 [(.gogoproto.moretags) = "yaml:&#92;"scope_id_info&#92;""];</code>
     * @return The scopeIdInfo.
     */
    public io.provenance.metadata.v1.ScopeIdInfo getScopeIdInfo() {
      if (scopeIdInfoBuilder_ == null) {
        return scopeIdInfo_ == null ? io.provenance.metadata.v1.ScopeIdInfo.getDefaultInstance() : scopeIdInfo_;
      } else {
        return scopeIdInfoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * scope_id_info is information about the scope id referenced in the record_id.
     * </pre>
     *
     * <code>.provenance.metadata.v1.ScopeIdInfo scope_id_info = 6 [(.gogoproto.moretags) = "yaml:&#92;"scope_id_info&#92;""];</code>
     */
    public Builder setScopeIdInfo(io.provenance.metadata.v1.ScopeIdInfo value) {
      if (scopeIdInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        scopeIdInfo_ = value;
        onChanged();
      } else {
        scopeIdInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * scope_id_info is information about the scope id referenced in the record_id.
     * </pre>
     *
     * <code>.provenance.metadata.v1.ScopeIdInfo scope_id_info = 6 [(.gogoproto.moretags) = "yaml:&#92;"scope_id_info&#92;""];</code>
     */
    public Builder setScopeIdInfo(
        io.provenance.metadata.v1.ScopeIdInfo.Builder builderForValue) {
      if (scopeIdInfoBuilder_ == null) {
        scopeIdInfo_ = builderForValue.build();
        onChanged();
      } else {
        scopeIdInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * scope_id_info is information about the scope id referenced in the record_id.
     * </pre>
     *
     * <code>.provenance.metadata.v1.ScopeIdInfo scope_id_info = 6 [(.gogoproto.moretags) = "yaml:&#92;"scope_id_info&#92;""];</code>
     */
    public Builder mergeScopeIdInfo(io.provenance.metadata.v1.ScopeIdInfo value) {
      if (scopeIdInfoBuilder_ == null) {
        if (scopeIdInfo_ != null) {
          scopeIdInfo_ =
            io.provenance.metadata.v1.ScopeIdInfo.newBuilder(scopeIdInfo_).mergeFrom(value).buildPartial();
        } else {
          scopeIdInfo_ = value;
        }
        onChanged();
      } else {
        scopeIdInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * scope_id_info is information about the scope id referenced in the record_id.
     * </pre>
     *
     * <code>.provenance.metadata.v1.ScopeIdInfo scope_id_info = 6 [(.gogoproto.moretags) = "yaml:&#92;"scope_id_info&#92;""];</code>
     */
    public Builder clearScopeIdInfo() {
      if (scopeIdInfoBuilder_ == null) {
        scopeIdInfo_ = null;
        onChanged();
      } else {
        scopeIdInfo_ = null;
        scopeIdInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * scope_id_info is information about the scope id referenced in the record_id.
     * </pre>
     *
     * <code>.provenance.metadata.v1.ScopeIdInfo scope_id_info = 6 [(.gogoproto.moretags) = "yaml:&#92;"scope_id_info&#92;""];</code>
     */
    public io.provenance.metadata.v1.ScopeIdInfo.Builder getScopeIdInfoBuilder() {
      
      onChanged();
      return getScopeIdInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * scope_id_info is information about the scope id referenced in the record_id.
     * </pre>
     *
     * <code>.provenance.metadata.v1.ScopeIdInfo scope_id_info = 6 [(.gogoproto.moretags) = "yaml:&#92;"scope_id_info&#92;""];</code>
     */
    public io.provenance.metadata.v1.ScopeIdInfoOrBuilder getScopeIdInfoOrBuilder() {
      if (scopeIdInfoBuilder_ != null) {
        return scopeIdInfoBuilder_.getMessageOrBuilder();
      } else {
        return scopeIdInfo_ == null ?
            io.provenance.metadata.v1.ScopeIdInfo.getDefaultInstance() : scopeIdInfo_;
      }
    }
    /**
     * <pre>
     * scope_id_info is information about the scope id referenced in the record_id.
     * </pre>
     *
     * <code>.provenance.metadata.v1.ScopeIdInfo scope_id_info = 6 [(.gogoproto.moretags) = "yaml:&#92;"scope_id_info&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.provenance.metadata.v1.ScopeIdInfo, io.provenance.metadata.v1.ScopeIdInfo.Builder, io.provenance.metadata.v1.ScopeIdInfoOrBuilder> 
        getScopeIdInfoFieldBuilder() {
      if (scopeIdInfoBuilder_ == null) {
        scopeIdInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.provenance.metadata.v1.ScopeIdInfo, io.provenance.metadata.v1.ScopeIdInfo.Builder, io.provenance.metadata.v1.ScopeIdInfoOrBuilder>(
                getScopeIdInfo(),
                getParentForChildren(),
                isClean());
        scopeIdInfo_ = null;
      }
      return scopeIdInfoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:provenance.metadata.v1.RecordIdInfo)
  }

  // @@protoc_insertion_point(class_scope:provenance.metadata.v1.RecordIdInfo)
  private static final io.provenance.metadata.v1.RecordIdInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.provenance.metadata.v1.RecordIdInfo();
  }

  public static io.provenance.metadata.v1.RecordIdInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecordIdInfo>
      PARSER = new com.google.protobuf.AbstractParser<RecordIdInfo>() {
    @java.lang.Override
    public RecordIdInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RecordIdInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RecordIdInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecordIdInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.provenance.metadata.v1.RecordIdInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

