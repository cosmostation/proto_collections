// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/metadata.proto

package io.provenance.metadata.v1;

/**
 * <pre>
 * ScopeSpecIdInfo contains various info regarding a scope specification id.
 * </pre>
 *
 * Protobuf type {@code provenance.metadata.v1.ScopeSpecIdInfo}
 */
public final class ScopeSpecIdInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.metadata.v1.ScopeSpecIdInfo)
    ScopeSpecIdInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ScopeSpecIdInfo.newBuilder() to construct.
  private ScopeSpecIdInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ScopeSpecIdInfo() {
    scopeSpecId_ = com.google.protobuf.ByteString.EMPTY;
    scopeSpecIdPrefix_ = com.google.protobuf.ByteString.EMPTY;
    scopeSpecIdScopeSpecUuid_ = com.google.protobuf.ByteString.EMPTY;
    scopeSpecAddr_ = "";
    scopeSpecUuid_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ScopeSpecIdInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ScopeSpecIdInfo(
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

            scopeSpecId_ = input.readBytes();
            break;
          }
          case 18: {

            scopeSpecIdPrefix_ = input.readBytes();
            break;
          }
          case 26: {

            scopeSpecIdScopeSpecUuid_ = input.readBytes();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            scopeSpecAddr_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            scopeSpecUuid_ = s;
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
    return io.provenance.metadata.v1.Metadata.internal_static_provenance_metadata_v1_ScopeSpecIdInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.provenance.metadata.v1.Metadata.internal_static_provenance_metadata_v1_ScopeSpecIdInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.provenance.metadata.v1.ScopeSpecIdInfo.class, io.provenance.metadata.v1.ScopeSpecIdInfo.Builder.class);
  }

  public static final int SCOPE_SPEC_ID_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString scopeSpecId_;
  /**
   * <pre>
   * scope_spec_id is the raw bytes of the scope specification address.
   * </pre>
   *
   * <code>bytes scope_spec_id = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"scope_spec_id&#92;""];</code>
   * @return The scopeSpecId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getScopeSpecId() {
    return scopeSpecId_;
  }

  public static final int SCOPE_SPEC_ID_PREFIX_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString scopeSpecIdPrefix_;
  /**
   * <pre>
   * scope_spec_id_prefix is the prefix portion of the scope_spec_id.
   * </pre>
   *
   * <code>bytes scope_spec_id_prefix = 2 [(.gogoproto.moretags) = "yaml:&#92;"scope_spec_id_prefix&#92;""];</code>
   * @return The scopeSpecIdPrefix.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getScopeSpecIdPrefix() {
    return scopeSpecIdPrefix_;
  }

  public static final int SCOPE_SPEC_ID_SCOPE_SPEC_UUID_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString scopeSpecIdScopeSpecUuid_;
  /**
   * <pre>
   * scope_spec_id_scope_spec_uuid is the scope_spec_uuid portion of the scope_spec_id.
   * </pre>
   *
   * <code>bytes scope_spec_id_scope_spec_uuid = 3 [(.gogoproto.moretags) = "yaml:&#92;"scope_spec_id_scope_spec_uuid&#92;""];</code>
   * @return The scopeSpecIdScopeSpecUuid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getScopeSpecIdScopeSpecUuid() {
    return scopeSpecIdScopeSpecUuid_;
  }

  public static final int SCOPE_SPEC_ADDR_FIELD_NUMBER = 4;
  private volatile java.lang.Object scopeSpecAddr_;
  /**
   * <pre>
   * scope_spec_addr is the bech32 string version of the scope_spec_id.
   * </pre>
   *
   * <code>string scope_spec_addr = 4 [(.gogoproto.moretags) = "yaml:&#92;"scope_spec_addr&#92;""];</code>
   * @return The scopeSpecAddr.
   */
  @java.lang.Override
  public java.lang.String getScopeSpecAddr() {
    java.lang.Object ref = scopeSpecAddr_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      scopeSpecAddr_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * scope_spec_addr is the bech32 string version of the scope_spec_id.
   * </pre>
   *
   * <code>string scope_spec_addr = 4 [(.gogoproto.moretags) = "yaml:&#92;"scope_spec_addr&#92;""];</code>
   * @return The bytes for scopeSpecAddr.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getScopeSpecAddrBytes() {
    java.lang.Object ref = scopeSpecAddr_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      scopeSpecAddr_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SCOPE_SPEC_UUID_FIELD_NUMBER = 5;
  private volatile java.lang.Object scopeSpecUuid_;
  /**
   * <pre>
   * scope_spec_uuid is the uuid hex string of the scope_spec_id_scope_spec_uuid.
   * </pre>
   *
   * <code>string scope_spec_uuid = 5 [(.gogoproto.moretags) = "yaml:&#92;"scope_spec_uuid&#92;""];</code>
   * @return The scopeSpecUuid.
   */
  @java.lang.Override
  public java.lang.String getScopeSpecUuid() {
    java.lang.Object ref = scopeSpecUuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      scopeSpecUuid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * scope_spec_uuid is the uuid hex string of the scope_spec_id_scope_spec_uuid.
   * </pre>
   *
   * <code>string scope_spec_uuid = 5 [(.gogoproto.moretags) = "yaml:&#92;"scope_spec_uuid&#92;""];</code>
   * @return The bytes for scopeSpecUuid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getScopeSpecUuidBytes() {
    java.lang.Object ref = scopeSpecUuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      scopeSpecUuid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!scopeSpecId_.isEmpty()) {
      output.writeBytes(1, scopeSpecId_);
    }
    if (!scopeSpecIdPrefix_.isEmpty()) {
      output.writeBytes(2, scopeSpecIdPrefix_);
    }
    if (!scopeSpecIdScopeSpecUuid_.isEmpty()) {
      output.writeBytes(3, scopeSpecIdScopeSpecUuid_);
    }
    if (!getScopeSpecAddrBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, scopeSpecAddr_);
    }
    if (!getScopeSpecUuidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, scopeSpecUuid_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!scopeSpecId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, scopeSpecId_);
    }
    if (!scopeSpecIdPrefix_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, scopeSpecIdPrefix_);
    }
    if (!scopeSpecIdScopeSpecUuid_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, scopeSpecIdScopeSpecUuid_);
    }
    if (!getScopeSpecAddrBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, scopeSpecAddr_);
    }
    if (!getScopeSpecUuidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, scopeSpecUuid_);
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
    if (!(obj instanceof io.provenance.metadata.v1.ScopeSpecIdInfo)) {
      return super.equals(obj);
    }
    io.provenance.metadata.v1.ScopeSpecIdInfo other = (io.provenance.metadata.v1.ScopeSpecIdInfo) obj;

    if (!getScopeSpecId()
        .equals(other.getScopeSpecId())) return false;
    if (!getScopeSpecIdPrefix()
        .equals(other.getScopeSpecIdPrefix())) return false;
    if (!getScopeSpecIdScopeSpecUuid()
        .equals(other.getScopeSpecIdScopeSpecUuid())) return false;
    if (!getScopeSpecAddr()
        .equals(other.getScopeSpecAddr())) return false;
    if (!getScopeSpecUuid()
        .equals(other.getScopeSpecUuid())) return false;
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
    hash = (37 * hash) + SCOPE_SPEC_ID_FIELD_NUMBER;
    hash = (53 * hash) + getScopeSpecId().hashCode();
    hash = (37 * hash) + SCOPE_SPEC_ID_PREFIX_FIELD_NUMBER;
    hash = (53 * hash) + getScopeSpecIdPrefix().hashCode();
    hash = (37 * hash) + SCOPE_SPEC_ID_SCOPE_SPEC_UUID_FIELD_NUMBER;
    hash = (53 * hash) + getScopeSpecIdScopeSpecUuid().hashCode();
    hash = (37 * hash) + SCOPE_SPEC_ADDR_FIELD_NUMBER;
    hash = (53 * hash) + getScopeSpecAddr().hashCode();
    hash = (37 * hash) + SCOPE_SPEC_UUID_FIELD_NUMBER;
    hash = (53 * hash) + getScopeSpecUuid().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.provenance.metadata.v1.ScopeSpecIdInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.ScopeSpecIdInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.ScopeSpecIdInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.ScopeSpecIdInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.ScopeSpecIdInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.ScopeSpecIdInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.ScopeSpecIdInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.ScopeSpecIdInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.metadata.v1.ScopeSpecIdInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.ScopeSpecIdInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.metadata.v1.ScopeSpecIdInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.ScopeSpecIdInfo parseFrom(
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
  public static Builder newBuilder(io.provenance.metadata.v1.ScopeSpecIdInfo prototype) {
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
   * ScopeSpecIdInfo contains various info regarding a scope specification id.
   * </pre>
   *
   * Protobuf type {@code provenance.metadata.v1.ScopeSpecIdInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.metadata.v1.ScopeSpecIdInfo)
      io.provenance.metadata.v1.ScopeSpecIdInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.provenance.metadata.v1.Metadata.internal_static_provenance_metadata_v1_ScopeSpecIdInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.provenance.metadata.v1.Metadata.internal_static_provenance_metadata_v1_ScopeSpecIdInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.provenance.metadata.v1.ScopeSpecIdInfo.class, io.provenance.metadata.v1.ScopeSpecIdInfo.Builder.class);
    }

    // Construct using io.provenance.metadata.v1.ScopeSpecIdInfo.newBuilder()
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
      scopeSpecId_ = com.google.protobuf.ByteString.EMPTY;

      scopeSpecIdPrefix_ = com.google.protobuf.ByteString.EMPTY;

      scopeSpecIdScopeSpecUuid_ = com.google.protobuf.ByteString.EMPTY;

      scopeSpecAddr_ = "";

      scopeSpecUuid_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.provenance.metadata.v1.Metadata.internal_static_provenance_metadata_v1_ScopeSpecIdInfo_descriptor;
    }

    @java.lang.Override
    public io.provenance.metadata.v1.ScopeSpecIdInfo getDefaultInstanceForType() {
      return io.provenance.metadata.v1.ScopeSpecIdInfo.getDefaultInstance();
    }

    @java.lang.Override
    public io.provenance.metadata.v1.ScopeSpecIdInfo build() {
      io.provenance.metadata.v1.ScopeSpecIdInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.provenance.metadata.v1.ScopeSpecIdInfo buildPartial() {
      io.provenance.metadata.v1.ScopeSpecIdInfo result = new io.provenance.metadata.v1.ScopeSpecIdInfo(this);
      result.scopeSpecId_ = scopeSpecId_;
      result.scopeSpecIdPrefix_ = scopeSpecIdPrefix_;
      result.scopeSpecIdScopeSpecUuid_ = scopeSpecIdScopeSpecUuid_;
      result.scopeSpecAddr_ = scopeSpecAddr_;
      result.scopeSpecUuid_ = scopeSpecUuid_;
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
      if (other instanceof io.provenance.metadata.v1.ScopeSpecIdInfo) {
        return mergeFrom((io.provenance.metadata.v1.ScopeSpecIdInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.provenance.metadata.v1.ScopeSpecIdInfo other) {
      if (other == io.provenance.metadata.v1.ScopeSpecIdInfo.getDefaultInstance()) return this;
      if (other.getScopeSpecId() != com.google.protobuf.ByteString.EMPTY) {
        setScopeSpecId(other.getScopeSpecId());
      }
      if (other.getScopeSpecIdPrefix() != com.google.protobuf.ByteString.EMPTY) {
        setScopeSpecIdPrefix(other.getScopeSpecIdPrefix());
      }
      if (other.getScopeSpecIdScopeSpecUuid() != com.google.protobuf.ByteString.EMPTY) {
        setScopeSpecIdScopeSpecUuid(other.getScopeSpecIdScopeSpecUuid());
      }
      if (!other.getScopeSpecAddr().isEmpty()) {
        scopeSpecAddr_ = other.scopeSpecAddr_;
        onChanged();
      }
      if (!other.getScopeSpecUuid().isEmpty()) {
        scopeSpecUuid_ = other.scopeSpecUuid_;
        onChanged();
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
      io.provenance.metadata.v1.ScopeSpecIdInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.provenance.metadata.v1.ScopeSpecIdInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString scopeSpecId_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * scope_spec_id is the raw bytes of the scope specification address.
     * </pre>
     *
     * <code>bytes scope_spec_id = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"scope_spec_id&#92;""];</code>
     * @return The scopeSpecId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getScopeSpecId() {
      return scopeSpecId_;
    }
    /**
     * <pre>
     * scope_spec_id is the raw bytes of the scope specification address.
     * </pre>
     *
     * <code>bytes scope_spec_id = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"scope_spec_id&#92;""];</code>
     * @param value The scopeSpecId to set.
     * @return This builder for chaining.
     */
    public Builder setScopeSpecId(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      scopeSpecId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * scope_spec_id is the raw bytes of the scope specification address.
     * </pre>
     *
     * <code>bytes scope_spec_id = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"scope_spec_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearScopeSpecId() {
      
      scopeSpecId_ = getDefaultInstance().getScopeSpecId();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString scopeSpecIdPrefix_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * scope_spec_id_prefix is the prefix portion of the scope_spec_id.
     * </pre>
     *
     * <code>bytes scope_spec_id_prefix = 2 [(.gogoproto.moretags) = "yaml:&#92;"scope_spec_id_prefix&#92;""];</code>
     * @return The scopeSpecIdPrefix.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getScopeSpecIdPrefix() {
      return scopeSpecIdPrefix_;
    }
    /**
     * <pre>
     * scope_spec_id_prefix is the prefix portion of the scope_spec_id.
     * </pre>
     *
     * <code>bytes scope_spec_id_prefix = 2 [(.gogoproto.moretags) = "yaml:&#92;"scope_spec_id_prefix&#92;""];</code>
     * @param value The scopeSpecIdPrefix to set.
     * @return This builder for chaining.
     */
    public Builder setScopeSpecIdPrefix(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      scopeSpecIdPrefix_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * scope_spec_id_prefix is the prefix portion of the scope_spec_id.
     * </pre>
     *
     * <code>bytes scope_spec_id_prefix = 2 [(.gogoproto.moretags) = "yaml:&#92;"scope_spec_id_prefix&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearScopeSpecIdPrefix() {
      
      scopeSpecIdPrefix_ = getDefaultInstance().getScopeSpecIdPrefix();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString scopeSpecIdScopeSpecUuid_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * scope_spec_id_scope_spec_uuid is the scope_spec_uuid portion of the scope_spec_id.
     * </pre>
     *
     * <code>bytes scope_spec_id_scope_spec_uuid = 3 [(.gogoproto.moretags) = "yaml:&#92;"scope_spec_id_scope_spec_uuid&#92;""];</code>
     * @return The scopeSpecIdScopeSpecUuid.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getScopeSpecIdScopeSpecUuid() {
      return scopeSpecIdScopeSpecUuid_;
    }
    /**
     * <pre>
     * scope_spec_id_scope_spec_uuid is the scope_spec_uuid portion of the scope_spec_id.
     * </pre>
     *
     * <code>bytes scope_spec_id_scope_spec_uuid = 3 [(.gogoproto.moretags) = "yaml:&#92;"scope_spec_id_scope_spec_uuid&#92;""];</code>
     * @param value The scopeSpecIdScopeSpecUuid to set.
     * @return This builder for chaining.
     */
    public Builder setScopeSpecIdScopeSpecUuid(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      scopeSpecIdScopeSpecUuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * scope_spec_id_scope_spec_uuid is the scope_spec_uuid portion of the scope_spec_id.
     * </pre>
     *
     * <code>bytes scope_spec_id_scope_spec_uuid = 3 [(.gogoproto.moretags) = "yaml:&#92;"scope_spec_id_scope_spec_uuid&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearScopeSpecIdScopeSpecUuid() {
      
      scopeSpecIdScopeSpecUuid_ = getDefaultInstance().getScopeSpecIdScopeSpecUuid();
      onChanged();
      return this;
    }

    private java.lang.Object scopeSpecAddr_ = "";
    /**
     * <pre>
     * scope_spec_addr is the bech32 string version of the scope_spec_id.
     * </pre>
     *
     * <code>string scope_spec_addr = 4 [(.gogoproto.moretags) = "yaml:&#92;"scope_spec_addr&#92;""];</code>
     * @return The scopeSpecAddr.
     */
    public java.lang.String getScopeSpecAddr() {
      java.lang.Object ref = scopeSpecAddr_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        scopeSpecAddr_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * scope_spec_addr is the bech32 string version of the scope_spec_id.
     * </pre>
     *
     * <code>string scope_spec_addr = 4 [(.gogoproto.moretags) = "yaml:&#92;"scope_spec_addr&#92;""];</code>
     * @return The bytes for scopeSpecAddr.
     */
    public com.google.protobuf.ByteString
        getScopeSpecAddrBytes() {
      java.lang.Object ref = scopeSpecAddr_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        scopeSpecAddr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * scope_spec_addr is the bech32 string version of the scope_spec_id.
     * </pre>
     *
     * <code>string scope_spec_addr = 4 [(.gogoproto.moretags) = "yaml:&#92;"scope_spec_addr&#92;""];</code>
     * @param value The scopeSpecAddr to set.
     * @return This builder for chaining.
     */
    public Builder setScopeSpecAddr(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      scopeSpecAddr_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * scope_spec_addr is the bech32 string version of the scope_spec_id.
     * </pre>
     *
     * <code>string scope_spec_addr = 4 [(.gogoproto.moretags) = "yaml:&#92;"scope_spec_addr&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearScopeSpecAddr() {
      
      scopeSpecAddr_ = getDefaultInstance().getScopeSpecAddr();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * scope_spec_addr is the bech32 string version of the scope_spec_id.
     * </pre>
     *
     * <code>string scope_spec_addr = 4 [(.gogoproto.moretags) = "yaml:&#92;"scope_spec_addr&#92;""];</code>
     * @param value The bytes for scopeSpecAddr to set.
     * @return This builder for chaining.
     */
    public Builder setScopeSpecAddrBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      scopeSpecAddr_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object scopeSpecUuid_ = "";
    /**
     * <pre>
     * scope_spec_uuid is the uuid hex string of the scope_spec_id_scope_spec_uuid.
     * </pre>
     *
     * <code>string scope_spec_uuid = 5 [(.gogoproto.moretags) = "yaml:&#92;"scope_spec_uuid&#92;""];</code>
     * @return The scopeSpecUuid.
     */
    public java.lang.String getScopeSpecUuid() {
      java.lang.Object ref = scopeSpecUuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        scopeSpecUuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * scope_spec_uuid is the uuid hex string of the scope_spec_id_scope_spec_uuid.
     * </pre>
     *
     * <code>string scope_spec_uuid = 5 [(.gogoproto.moretags) = "yaml:&#92;"scope_spec_uuid&#92;""];</code>
     * @return The bytes for scopeSpecUuid.
     */
    public com.google.protobuf.ByteString
        getScopeSpecUuidBytes() {
      java.lang.Object ref = scopeSpecUuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        scopeSpecUuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * scope_spec_uuid is the uuid hex string of the scope_spec_id_scope_spec_uuid.
     * </pre>
     *
     * <code>string scope_spec_uuid = 5 [(.gogoproto.moretags) = "yaml:&#92;"scope_spec_uuid&#92;""];</code>
     * @param value The scopeSpecUuid to set.
     * @return This builder for chaining.
     */
    public Builder setScopeSpecUuid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      scopeSpecUuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * scope_spec_uuid is the uuid hex string of the scope_spec_id_scope_spec_uuid.
     * </pre>
     *
     * <code>string scope_spec_uuid = 5 [(.gogoproto.moretags) = "yaml:&#92;"scope_spec_uuid&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearScopeSpecUuid() {
      
      scopeSpecUuid_ = getDefaultInstance().getScopeSpecUuid();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * scope_spec_uuid is the uuid hex string of the scope_spec_id_scope_spec_uuid.
     * </pre>
     *
     * <code>string scope_spec_uuid = 5 [(.gogoproto.moretags) = "yaml:&#92;"scope_spec_uuid&#92;""];</code>
     * @param value The bytes for scopeSpecUuid to set.
     * @return This builder for chaining.
     */
    public Builder setScopeSpecUuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      scopeSpecUuid_ = value;
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


    // @@protoc_insertion_point(builder_scope:provenance.metadata.v1.ScopeSpecIdInfo)
  }

  // @@protoc_insertion_point(class_scope:provenance.metadata.v1.ScopeSpecIdInfo)
  private static final io.provenance.metadata.v1.ScopeSpecIdInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.provenance.metadata.v1.ScopeSpecIdInfo();
  }

  public static io.provenance.metadata.v1.ScopeSpecIdInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ScopeSpecIdInfo>
      PARSER = new com.google.protobuf.AbstractParser<ScopeSpecIdInfo>() {
    @java.lang.Override
    public ScopeSpecIdInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ScopeSpecIdInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ScopeSpecIdInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ScopeSpecIdInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.provenance.metadata.v1.ScopeSpecIdInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

