// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/tx.proto

package io.provenance.metadata.v1;

/**
 * <pre>
 * MsgWriteP8eContractSpecRequest is the request type for the Msg/WriteP8eContractSpec RPC method.
 * </pre>
 *
 * Protobuf type {@code provenance.metadata.v1.MsgWriteP8eContractSpecRequest}
 */
public final class MsgWriteP8eContractSpecRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.metadata.v1.MsgWriteP8eContractSpecRequest)
    MsgWriteP8eContractSpecRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgWriteP8eContractSpecRequest.newBuilder() to construct.
  private MsgWriteP8eContractSpecRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgWriteP8eContractSpecRequest() {
    signers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgWriteP8eContractSpecRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MsgWriteP8eContractSpecRequest(
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
            io.provenance.metadata.v1.p8e.ContractSpec.Builder subBuilder = null;
            if (contractspec_ != null) {
              subBuilder = contractspec_.toBuilder();
            }
            contractspec_ = input.readMessage(io.provenance.metadata.v1.p8e.ContractSpec.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(contractspec_);
              contractspec_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
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
    return io.provenance.metadata.v1.Tx.internal_static_provenance_metadata_v1_MsgWriteP8eContractSpecRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.provenance.metadata.v1.Tx.internal_static_provenance_metadata_v1_MsgWriteP8eContractSpecRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest.class, io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest.Builder.class);
  }

  public static final int CONTRACTSPEC_FIELD_NUMBER = 1;
  private io.provenance.metadata.v1.p8e.ContractSpec contractspec_;
  /**
   * <pre>
   * ContractSpec v39 p8e ContractSpect to be converted into a v40
   * </pre>
   *
   * <code>.provenance.metadata.v1.p8e.ContractSpec contractspec = 1 [(.gogoproto.nullable) = false];</code>
   * @return Whether the contractspec field is set.
   */
  @java.lang.Override
  public boolean hasContractspec() {
    return contractspec_ != null;
  }
  /**
   * <pre>
   * ContractSpec v39 p8e ContractSpect to be converted into a v40
   * </pre>
   *
   * <code>.provenance.metadata.v1.p8e.ContractSpec contractspec = 1 [(.gogoproto.nullable) = false];</code>
   * @return The contractspec.
   */
  @java.lang.Override
  public io.provenance.metadata.v1.p8e.ContractSpec getContractspec() {
    return contractspec_ == null ? io.provenance.metadata.v1.p8e.ContractSpec.getDefaultInstance() : contractspec_;
  }
  /**
   * <pre>
   * ContractSpec v39 p8e ContractSpect to be converted into a v40
   * </pre>
   *
   * <code>.provenance.metadata.v1.p8e.ContractSpec contractspec = 1 [(.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public io.provenance.metadata.v1.p8e.ContractSpecOrBuilder getContractspecOrBuilder() {
    return getContractspec();
  }

  public static final int SIGNERS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList signers_;
  /**
   * <code>repeated string signers = 2;</code>
   * @return A list containing the signers.
   */
  public com.google.protobuf.ProtocolStringList
      getSignersList() {
    return signers_;
  }
  /**
   * <code>repeated string signers = 2;</code>
   * @return The count of signers.
   */
  public int getSignersCount() {
    return signers_.size();
  }
  /**
   * <code>repeated string signers = 2;</code>
   * @param index The index of the element to return.
   * @return The signers at the given index.
   */
  public java.lang.String getSigners(int index) {
    return signers_.get(index);
  }
  /**
   * <code>repeated string signers = 2;</code>
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
    if (contractspec_ != null) {
      output.writeMessage(1, getContractspec());
    }
    for (int i = 0; i < signers_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, signers_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (contractspec_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getContractspec());
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
    if (!(obj instanceof io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest)) {
      return super.equals(obj);
    }
    io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest other = (io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest) obj;

    if (hasContractspec() != other.hasContractspec()) return false;
    if (hasContractspec()) {
      if (!getContractspec()
          .equals(other.getContractspec())) return false;
    }
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
    if (hasContractspec()) {
      hash = (37 * hash) + CONTRACTSPEC_FIELD_NUMBER;
      hash = (53 * hash) + getContractspec().hashCode();
    }
    if (getSignersCount() > 0) {
      hash = (37 * hash) + SIGNERS_FIELD_NUMBER;
      hash = (53 * hash) + getSignersList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest parseFrom(
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
  public static Builder newBuilder(io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest prototype) {
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
   * MsgWriteP8eContractSpecRequest is the request type for the Msg/WriteP8eContractSpec RPC method.
   * </pre>
   *
   * Protobuf type {@code provenance.metadata.v1.MsgWriteP8eContractSpecRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.metadata.v1.MsgWriteP8eContractSpecRequest)
      io.provenance.metadata.v1.MsgWriteP8eContractSpecRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.provenance.metadata.v1.Tx.internal_static_provenance_metadata_v1_MsgWriteP8eContractSpecRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.provenance.metadata.v1.Tx.internal_static_provenance_metadata_v1_MsgWriteP8eContractSpecRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest.class, io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest.Builder.class);
    }

    // Construct using io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest.newBuilder()
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
      if (contractspecBuilder_ == null) {
        contractspec_ = null;
      } else {
        contractspec_ = null;
        contractspecBuilder_ = null;
      }
      signers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.provenance.metadata.v1.Tx.internal_static_provenance_metadata_v1_MsgWriteP8eContractSpecRequest_descriptor;
    }

    @java.lang.Override
    public io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest getDefaultInstanceForType() {
      return io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest build() {
      io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest buildPartial() {
      io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest result = new io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest(this);
      int from_bitField0_ = bitField0_;
      if (contractspecBuilder_ == null) {
        result.contractspec_ = contractspec_;
      } else {
        result.contractspec_ = contractspecBuilder_.build();
      }
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
      if (other instanceof io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest) {
        return mergeFrom((io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest other) {
      if (other == io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest.getDefaultInstance()) return this;
      if (other.hasContractspec()) {
        mergeContractspec(other.getContractspec());
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
      io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private io.provenance.metadata.v1.p8e.ContractSpec contractspec_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.provenance.metadata.v1.p8e.ContractSpec, io.provenance.metadata.v1.p8e.ContractSpec.Builder, io.provenance.metadata.v1.p8e.ContractSpecOrBuilder> contractspecBuilder_;
    /**
     * <pre>
     * ContractSpec v39 p8e ContractSpect to be converted into a v40
     * </pre>
     *
     * <code>.provenance.metadata.v1.p8e.ContractSpec contractspec = 1 [(.gogoproto.nullable) = false];</code>
     * @return Whether the contractspec field is set.
     */
    public boolean hasContractspec() {
      return contractspecBuilder_ != null || contractspec_ != null;
    }
    /**
     * <pre>
     * ContractSpec v39 p8e ContractSpect to be converted into a v40
     * </pre>
     *
     * <code>.provenance.metadata.v1.p8e.ContractSpec contractspec = 1 [(.gogoproto.nullable) = false];</code>
     * @return The contractspec.
     */
    public io.provenance.metadata.v1.p8e.ContractSpec getContractspec() {
      if (contractspecBuilder_ == null) {
        return contractspec_ == null ? io.provenance.metadata.v1.p8e.ContractSpec.getDefaultInstance() : contractspec_;
      } else {
        return contractspecBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * ContractSpec v39 p8e ContractSpect to be converted into a v40
     * </pre>
     *
     * <code>.provenance.metadata.v1.p8e.ContractSpec contractspec = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setContractspec(io.provenance.metadata.v1.p8e.ContractSpec value) {
      if (contractspecBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        contractspec_ = value;
        onChanged();
      } else {
        contractspecBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * ContractSpec v39 p8e ContractSpect to be converted into a v40
     * </pre>
     *
     * <code>.provenance.metadata.v1.p8e.ContractSpec contractspec = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setContractspec(
        io.provenance.metadata.v1.p8e.ContractSpec.Builder builderForValue) {
      if (contractspecBuilder_ == null) {
        contractspec_ = builderForValue.build();
        onChanged();
      } else {
        contractspecBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * ContractSpec v39 p8e ContractSpect to be converted into a v40
     * </pre>
     *
     * <code>.provenance.metadata.v1.p8e.ContractSpec contractspec = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder mergeContractspec(io.provenance.metadata.v1.p8e.ContractSpec value) {
      if (contractspecBuilder_ == null) {
        if (contractspec_ != null) {
          contractspec_ =
            io.provenance.metadata.v1.p8e.ContractSpec.newBuilder(contractspec_).mergeFrom(value).buildPartial();
        } else {
          contractspec_ = value;
        }
        onChanged();
      } else {
        contractspecBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * ContractSpec v39 p8e ContractSpect to be converted into a v40
     * </pre>
     *
     * <code>.provenance.metadata.v1.p8e.ContractSpec contractspec = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder clearContractspec() {
      if (contractspecBuilder_ == null) {
        contractspec_ = null;
        onChanged();
      } else {
        contractspec_ = null;
        contractspecBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * ContractSpec v39 p8e ContractSpect to be converted into a v40
     * </pre>
     *
     * <code>.provenance.metadata.v1.p8e.ContractSpec contractspec = 1 [(.gogoproto.nullable) = false];</code>
     */
    public io.provenance.metadata.v1.p8e.ContractSpec.Builder getContractspecBuilder() {
      
      onChanged();
      return getContractspecFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * ContractSpec v39 p8e ContractSpect to be converted into a v40
     * </pre>
     *
     * <code>.provenance.metadata.v1.p8e.ContractSpec contractspec = 1 [(.gogoproto.nullable) = false];</code>
     */
    public io.provenance.metadata.v1.p8e.ContractSpecOrBuilder getContractspecOrBuilder() {
      if (contractspecBuilder_ != null) {
        return contractspecBuilder_.getMessageOrBuilder();
      } else {
        return contractspec_ == null ?
            io.provenance.metadata.v1.p8e.ContractSpec.getDefaultInstance() : contractspec_;
      }
    }
    /**
     * <pre>
     * ContractSpec v39 p8e ContractSpect to be converted into a v40
     * </pre>
     *
     * <code>.provenance.metadata.v1.p8e.ContractSpec contractspec = 1 [(.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.provenance.metadata.v1.p8e.ContractSpec, io.provenance.metadata.v1.p8e.ContractSpec.Builder, io.provenance.metadata.v1.p8e.ContractSpecOrBuilder> 
        getContractspecFieldBuilder() {
      if (contractspecBuilder_ == null) {
        contractspecBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.provenance.metadata.v1.p8e.ContractSpec, io.provenance.metadata.v1.p8e.ContractSpec.Builder, io.provenance.metadata.v1.p8e.ContractSpecOrBuilder>(
                getContractspec(),
                getParentForChildren(),
                isClean());
        contractspec_ = null;
      }
      return contractspecBuilder_;
    }

    private com.google.protobuf.LazyStringList signers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureSignersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        signers_ = new com.google.protobuf.LazyStringArrayList(signers_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string signers = 2;</code>
     * @return A list containing the signers.
     */
    public com.google.protobuf.ProtocolStringList
        getSignersList() {
      return signers_.getUnmodifiableView();
    }
    /**
     * <code>repeated string signers = 2;</code>
     * @return The count of signers.
     */
    public int getSignersCount() {
      return signers_.size();
    }
    /**
     * <code>repeated string signers = 2;</code>
     * @param index The index of the element to return.
     * @return The signers at the given index.
     */
    public java.lang.String getSigners(int index) {
      return signers_.get(index);
    }
    /**
     * <code>repeated string signers = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the signers at the given index.
     */
    public com.google.protobuf.ByteString
        getSignersBytes(int index) {
      return signers_.getByteString(index);
    }
    /**
     * <code>repeated string signers = 2;</code>
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
     * <code>repeated string signers = 2;</code>
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
     * <code>repeated string signers = 2;</code>
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
     * <code>repeated string signers = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSigners() {
      signers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string signers = 2;</code>
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


    // @@protoc_insertion_point(builder_scope:provenance.metadata.v1.MsgWriteP8eContractSpecRequest)
  }

  // @@protoc_insertion_point(class_scope:provenance.metadata.v1.MsgWriteP8eContractSpecRequest)
  private static final io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest();
  }

  public static io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgWriteP8eContractSpecRequest>
      PARSER = new com.google.protobuf.AbstractParser<MsgWriteP8eContractSpecRequest>() {
    @java.lang.Override
    public MsgWriteP8eContractSpecRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MsgWriteP8eContractSpecRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MsgWriteP8eContractSpecRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgWriteP8eContractSpecRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.provenance.metadata.v1.MsgWriteP8eContractSpecRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

