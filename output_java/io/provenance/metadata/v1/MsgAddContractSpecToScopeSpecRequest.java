// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/tx.proto

package io.provenance.metadata.v1;

/**
 * <pre>
 * MsgAddContractSpecToScopeSpecRequest is the request type for the Msg/AddContractSpecToScopeSpec RPC method.
 * </pre>
 *
 * Protobuf type {@code provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest}
 */
public final class MsgAddContractSpecToScopeSpecRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest)
    MsgAddContractSpecToScopeSpecRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgAddContractSpecToScopeSpecRequest.newBuilder() to construct.
  private MsgAddContractSpecToScopeSpecRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgAddContractSpecToScopeSpecRequest() {
    contractSpecificationId_ = com.google.protobuf.ByteString.EMPTY;
    scopeSpecificationId_ = com.google.protobuf.ByteString.EMPTY;
    signers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgAddContractSpecToScopeSpecRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MsgAddContractSpecToScopeSpecRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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

            contractSpecificationId_ = input.readBytes();
            break;
          }
          case 18: {

            scopeSpecificationId_ = input.readBytes();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              signers_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            signers_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        signers_ = signers_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.provenance.metadata.v1.Tx.internal_static_provenance_metadata_v1_MsgAddContractSpecToScopeSpecRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.provenance.metadata.v1.Tx.internal_static_provenance_metadata_v1_MsgAddContractSpecToScopeSpecRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest.class, io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest.Builder.class);
  }

  public static final int CONTRACT_SPECIFICATION_ID_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString contractSpecificationId_;
  /**
   * <pre>
   * MetadataAddress for the contract specification to add.
   * </pre>
   *
   * <code>bytes contract_specification_id = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"specification_id&#92;""];</code>
   * @return The contractSpecificationId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getContractSpecificationId() {
    return contractSpecificationId_;
  }

  public static final int SCOPE_SPECIFICATION_ID_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString scopeSpecificationId_;
  /**
   * <pre>
   * MetadataAddress for the scope specification to add contract specification to.
   * </pre>
   *
   * <code>bytes scope_specification_id = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"specification_id&#92;""];</code>
   * @return The scopeSpecificationId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getScopeSpecificationId() {
    return scopeSpecificationId_;
  }

  public static final int SIGNERS_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList signers_;
  /**
   * <code>repeated string signers = 3;</code>
   * @return A list containing the signers.
   */
  public com.google.protobuf.ProtocolStringList
      getSignersList() {
    return signers_;
  }
  /**
   * <code>repeated string signers = 3;</code>
   * @return The count of signers.
   */
  public int getSignersCount() {
    return signers_.size();
  }
  /**
   * <code>repeated string signers = 3;</code>
   * @param index The index of the element to return.
   * @return The signers at the given index.
   */
  public java.lang.String getSigners(int index) {
    return signers_.get(index);
  }
  /**
   * <code>repeated string signers = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the signers at the given index.
   */
  public com.google.protobuf.ByteString
      getSignersBytes(int index) {
    return signers_.getByteString(index);
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
    if (!contractSpecificationId_.isEmpty()) {
      output.writeBytes(1, contractSpecificationId_);
    }
    if (!scopeSpecificationId_.isEmpty()) {
      output.writeBytes(2, scopeSpecificationId_);
    }
    for (int i = 0; i < signers_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, signers_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!contractSpecificationId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, contractSpecificationId_);
    }
    if (!scopeSpecificationId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, scopeSpecificationId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < signers_.size(); i++) {
        dataSize += computeStringSizeNoTag(signers_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getSignersList().size();
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
    if (!(obj instanceof io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest)) {
      return super.equals(obj);
    }
    io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest other = (io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest) obj;

    if (!getContractSpecificationId()
        .equals(other.getContractSpecificationId())) return false;
    if (!getScopeSpecificationId()
        .equals(other.getScopeSpecificationId())) return false;
    if (!getSignersList()
        .equals(other.getSignersList())) return false;
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
    hash = (37 * hash) + CONTRACT_SPECIFICATION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getContractSpecificationId().hashCode();
    hash = (37 * hash) + SCOPE_SPECIFICATION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getScopeSpecificationId().hashCode();
    if (getSignersCount() > 0) {
      hash = (37 * hash) + SIGNERS_FIELD_NUMBER;
      hash = (53 * hash) + getSignersList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest parseFrom(
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
  public static Builder newBuilder(io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest prototype) {
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
   * MsgAddContractSpecToScopeSpecRequest is the request type for the Msg/AddContractSpecToScopeSpec RPC method.
   * </pre>
   *
   * Protobuf type {@code provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest)
      io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.provenance.metadata.v1.Tx.internal_static_provenance_metadata_v1_MsgAddContractSpecToScopeSpecRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.provenance.metadata.v1.Tx.internal_static_provenance_metadata_v1_MsgAddContractSpecToScopeSpecRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest.class, io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest.Builder.class);
    }

    // Construct using io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest.newBuilder()
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
      contractSpecificationId_ = com.google.protobuf.ByteString.EMPTY;

      scopeSpecificationId_ = com.google.protobuf.ByteString.EMPTY;

      signers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.provenance.metadata.v1.Tx.internal_static_provenance_metadata_v1_MsgAddContractSpecToScopeSpecRequest_descriptor;
    }

    @java.lang.Override
    public io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest getDefaultInstanceForType() {
      return io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest build() {
      io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest buildPartial() {
      io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest result = new io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest(this);
      int from_bitField0_ = bitField0_;
      result.contractSpecificationId_ = contractSpecificationId_;
      result.scopeSpecificationId_ = scopeSpecificationId_;
      if (((bitField0_ & 0x00000001) != 0)) {
        signers_ = signers_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.signers_ = signers_;
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
      if (other instanceof io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest) {
        return mergeFrom((io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest other) {
      if (other == io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest.getDefaultInstance()) return this;
      if (other.getContractSpecificationId() != com.google.protobuf.ByteString.EMPTY) {
        setContractSpecificationId(other.getContractSpecificationId());
      }
      if (other.getScopeSpecificationId() != com.google.protobuf.ByteString.EMPTY) {
        setScopeSpecificationId(other.getScopeSpecificationId());
      }
      if (!other.signers_.isEmpty()) {
        if (signers_.isEmpty()) {
          signers_ = other.signers_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureSignersIsMutable();
          signers_.addAll(other.signers_);
        }
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
      io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.ByteString contractSpecificationId_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * MetadataAddress for the contract specification to add.
     * </pre>
     *
     * <code>bytes contract_specification_id = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"specification_id&#92;""];</code>
     * @return The contractSpecificationId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getContractSpecificationId() {
      return contractSpecificationId_;
    }
    /**
     * <pre>
     * MetadataAddress for the contract specification to add.
     * </pre>
     *
     * <code>bytes contract_specification_id = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"specification_id&#92;""];</code>
     * @param value The contractSpecificationId to set.
     * @return This builder for chaining.
     */
    public Builder setContractSpecificationId(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      contractSpecificationId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * MetadataAddress for the contract specification to add.
     * </pre>
     *
     * <code>bytes contract_specification_id = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"specification_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearContractSpecificationId() {
      
      contractSpecificationId_ = getDefaultInstance().getContractSpecificationId();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString scopeSpecificationId_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * MetadataAddress for the scope specification to add contract specification to.
     * </pre>
     *
     * <code>bytes scope_specification_id = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"specification_id&#92;""];</code>
     * @return The scopeSpecificationId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getScopeSpecificationId() {
      return scopeSpecificationId_;
    }
    /**
     * <pre>
     * MetadataAddress for the scope specification to add contract specification to.
     * </pre>
     *
     * <code>bytes scope_specification_id = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"specification_id&#92;""];</code>
     * @param value The scopeSpecificationId to set.
     * @return This builder for chaining.
     */
    public Builder setScopeSpecificationId(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      scopeSpecificationId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * MetadataAddress for the scope specification to add contract specification to.
     * </pre>
     *
     * <code>bytes scope_specification_id = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"specification_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearScopeSpecificationId() {
      
      scopeSpecificationId_ = getDefaultInstance().getScopeSpecificationId();
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList signers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureSignersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        signers_ = new com.google.protobuf.LazyStringArrayList(signers_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string signers = 3;</code>
     * @return A list containing the signers.
     */
    public com.google.protobuf.ProtocolStringList
        getSignersList() {
      return signers_.getUnmodifiableView();
    }
    /**
     * <code>repeated string signers = 3;</code>
     * @return The count of signers.
     */
    public int getSignersCount() {
      return signers_.size();
    }
    /**
     * <code>repeated string signers = 3;</code>
     * @param index The index of the element to return.
     * @return The signers at the given index.
     */
    public java.lang.String getSigners(int index) {
      return signers_.get(index);
    }
    /**
     * <code>repeated string signers = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the signers at the given index.
     */
    public com.google.protobuf.ByteString
        getSignersBytes(int index) {
      return signers_.getByteString(index);
    }
    /**
     * <code>repeated string signers = 3;</code>
     * @param index The index to set the value at.
     * @param value The signers to set.
     * @return This builder for chaining.
     */
    public Builder setSigners(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureSignersIsMutable();
      signers_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string signers = 3;</code>
     * @param value The signers to add.
     * @return This builder for chaining.
     */
    public Builder addSigners(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureSignersIsMutable();
      signers_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string signers = 3;</code>
     * @param values The signers to add.
     * @return This builder for chaining.
     */
    public Builder addAllSigners(
        java.lang.Iterable<java.lang.String> values) {
      ensureSignersIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, signers_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string signers = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSigners() {
      signers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string signers = 3;</code>
     * @param value The bytes of the signers to add.
     * @return This builder for chaining.
     */
    public Builder addSignersBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureSignersIsMutable();
      signers_.add(value);
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


    // @@protoc_insertion_point(builder_scope:provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest)
  }

  // @@protoc_insertion_point(class_scope:provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest)
  private static final io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest();
  }

  public static io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgAddContractSpecToScopeSpecRequest>
      PARSER = new com.google.protobuf.AbstractParser<MsgAddContractSpecToScopeSpecRequest>() {
    @java.lang.Override
    public MsgAddContractSpecToScopeSpecRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MsgAddContractSpecToScopeSpecRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MsgAddContractSpecToScopeSpecRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgAddContractSpecToScopeSpecRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

