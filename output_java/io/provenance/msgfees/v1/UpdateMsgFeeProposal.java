// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/msgfees/v1/proposals.proto

package io.provenance.msgfees.v1;

/**
 * <pre>
 * UpdateMsgFeeProposal defines a governance proposal to update a current msg based fee
 * </pre>
 *
 * Protobuf type {@code provenance.msgfees.v1.UpdateMsgFeeProposal}
 */
public final class UpdateMsgFeeProposal extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.msgfees.v1.UpdateMsgFeeProposal)
    UpdateMsgFeeProposalOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateMsgFeeProposal.newBuilder() to construct.
  private UpdateMsgFeeProposal(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateMsgFeeProposal() {
    title_ = "";
    description_ = "";
    msgTypeUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateMsgFeeProposal();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateMsgFeeProposal(
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

            title_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            description_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            msgTypeUrl_ = s;
            break;
          }
          case 34: {
            cosmos.base.v1beta1.CoinOuterClass.Coin.Builder subBuilder = null;
            if (additionalFee_ != null) {
              subBuilder = additionalFee_.toBuilder();
            }
            additionalFee_ = input.readMessage(cosmos.base.v1beta1.CoinOuterClass.Coin.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(additionalFee_);
              additionalFee_ = subBuilder.buildPartial();
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
    return io.provenance.msgfees.v1.Proposals.internal_static_provenance_msgfees_v1_UpdateMsgFeeProposal_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.provenance.msgfees.v1.Proposals.internal_static_provenance_msgfees_v1_UpdateMsgFeeProposal_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.provenance.msgfees.v1.UpdateMsgFeeProposal.class, io.provenance.msgfees.v1.UpdateMsgFeeProposal.Builder.class);
  }

  public static final int TITLE_FIELD_NUMBER = 1;
  private volatile java.lang.Object title_;
  /**
   * <code>string title = 1;</code>
   * @return The title.
   */
  @java.lang.Override
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   * <code>string title = 1;</code>
   * @return The bytes for title.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 2;
  private volatile java.lang.Object description_;
  /**
   * <code>string description = 2;</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <code>string description = 2;</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MSG_TYPE_URL_FIELD_NUMBER = 3;
  private volatile java.lang.Object msgTypeUrl_;
  /**
   * <code>string msg_type_url = 3;</code>
   * @return The msgTypeUrl.
   */
  @java.lang.Override
  public java.lang.String getMsgTypeUrl() {
    java.lang.Object ref = msgTypeUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      msgTypeUrl_ = s;
      return s;
    }
  }
  /**
   * <code>string msg_type_url = 3;</code>
   * @return The bytes for msgTypeUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMsgTypeUrlBytes() {
    java.lang.Object ref = msgTypeUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      msgTypeUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ADDITIONAL_FEE_FIELD_NUMBER = 4;
  private cosmos.base.v1beta1.CoinOuterClass.Coin additionalFee_;
  /**
   * <code>.cosmos.base.v1beta1.Coin additional_fee = 4 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"additional_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   * @return Whether the additionalFee field is set.
   */
  @java.lang.Override
  public boolean hasAdditionalFee() {
    return additionalFee_ != null;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin additional_fee = 4 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"additional_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   * @return The additionalFee.
   */
  @java.lang.Override
  public cosmos.base.v1beta1.CoinOuterClass.Coin getAdditionalFee() {
    return additionalFee_ == null ? cosmos.base.v1beta1.CoinOuterClass.Coin.getDefaultInstance() : additionalFee_;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin additional_fee = 4 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"additional_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder getAdditionalFeeOrBuilder() {
    return getAdditionalFee();
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
    if (!getTitleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, title_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, description_);
    }
    if (!getMsgTypeUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, msgTypeUrl_);
    }
    if (additionalFee_ != null) {
      output.writeMessage(4, getAdditionalFee());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTitleBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, title_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, description_);
    }
    if (!getMsgTypeUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, msgTypeUrl_);
    }
    if (additionalFee_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getAdditionalFee());
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
    if (!(obj instanceof io.provenance.msgfees.v1.UpdateMsgFeeProposal)) {
      return super.equals(obj);
    }
    io.provenance.msgfees.v1.UpdateMsgFeeProposal other = (io.provenance.msgfees.v1.UpdateMsgFeeProposal) obj;

    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (!getMsgTypeUrl()
        .equals(other.getMsgTypeUrl())) return false;
    if (hasAdditionalFee() != other.hasAdditionalFee()) return false;
    if (hasAdditionalFee()) {
      if (!getAdditionalFee()
          .equals(other.getAdditionalFee())) return false;
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
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + MSG_TYPE_URL_FIELD_NUMBER;
    hash = (53 * hash) + getMsgTypeUrl().hashCode();
    if (hasAdditionalFee()) {
      hash = (37 * hash) + ADDITIONAL_FEE_FIELD_NUMBER;
      hash = (53 * hash) + getAdditionalFee().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.provenance.msgfees.v1.UpdateMsgFeeProposal parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.msgfees.v1.UpdateMsgFeeProposal parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.msgfees.v1.UpdateMsgFeeProposal parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.msgfees.v1.UpdateMsgFeeProposal parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.msgfees.v1.UpdateMsgFeeProposal parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.msgfees.v1.UpdateMsgFeeProposal parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.msgfees.v1.UpdateMsgFeeProposal parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.msgfees.v1.UpdateMsgFeeProposal parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.msgfees.v1.UpdateMsgFeeProposal parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.provenance.msgfees.v1.UpdateMsgFeeProposal parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.msgfees.v1.UpdateMsgFeeProposal parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.msgfees.v1.UpdateMsgFeeProposal parseFrom(
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
  public static Builder newBuilder(io.provenance.msgfees.v1.UpdateMsgFeeProposal prototype) {
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
   * UpdateMsgFeeProposal defines a governance proposal to update a current msg based fee
   * </pre>
   *
   * Protobuf type {@code provenance.msgfees.v1.UpdateMsgFeeProposal}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.msgfees.v1.UpdateMsgFeeProposal)
      io.provenance.msgfees.v1.UpdateMsgFeeProposalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.provenance.msgfees.v1.Proposals.internal_static_provenance_msgfees_v1_UpdateMsgFeeProposal_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.provenance.msgfees.v1.Proposals.internal_static_provenance_msgfees_v1_UpdateMsgFeeProposal_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.provenance.msgfees.v1.UpdateMsgFeeProposal.class, io.provenance.msgfees.v1.UpdateMsgFeeProposal.Builder.class);
    }

    // Construct using io.provenance.msgfees.v1.UpdateMsgFeeProposal.newBuilder()
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
      title_ = "";

      description_ = "";

      msgTypeUrl_ = "";

      if (additionalFeeBuilder_ == null) {
        additionalFee_ = null;
      } else {
        additionalFee_ = null;
        additionalFeeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.provenance.msgfees.v1.Proposals.internal_static_provenance_msgfees_v1_UpdateMsgFeeProposal_descriptor;
    }

    @java.lang.Override
    public io.provenance.msgfees.v1.UpdateMsgFeeProposal getDefaultInstanceForType() {
      return io.provenance.msgfees.v1.UpdateMsgFeeProposal.getDefaultInstance();
    }

    @java.lang.Override
    public io.provenance.msgfees.v1.UpdateMsgFeeProposal build() {
      io.provenance.msgfees.v1.UpdateMsgFeeProposal result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.provenance.msgfees.v1.UpdateMsgFeeProposal buildPartial() {
      io.provenance.msgfees.v1.UpdateMsgFeeProposal result = new io.provenance.msgfees.v1.UpdateMsgFeeProposal(this);
      result.title_ = title_;
      result.description_ = description_;
      result.msgTypeUrl_ = msgTypeUrl_;
      if (additionalFeeBuilder_ == null) {
        result.additionalFee_ = additionalFee_;
      } else {
        result.additionalFee_ = additionalFeeBuilder_.build();
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
      if (other instanceof io.provenance.msgfees.v1.UpdateMsgFeeProposal) {
        return mergeFrom((io.provenance.msgfees.v1.UpdateMsgFeeProposal)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.provenance.msgfees.v1.UpdateMsgFeeProposal other) {
      if (other == io.provenance.msgfees.v1.UpdateMsgFeeProposal.getDefaultInstance()) return this;
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      if (!other.getMsgTypeUrl().isEmpty()) {
        msgTypeUrl_ = other.msgTypeUrl_;
        onChanged();
      }
      if (other.hasAdditionalFee()) {
        mergeAdditionalFee(other.getAdditionalFee());
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
      io.provenance.msgfees.v1.UpdateMsgFeeProposal parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.provenance.msgfees.v1.UpdateMsgFeeProposal) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object title_ = "";
    /**
     * <code>string title = 1;</code>
     * @return The title.
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string title = 1;</code>
     * @return The bytes for title.
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string title = 1;</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      title_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string title = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      
      title_ = getDefaultInstance().getTitle();
      onChanged();
      return this;
    }
    /**
     * <code>string title = 1;</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      title_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <code>string description = 2;</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string description = 2;</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string description = 2;</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string description = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <code>string description = 2;</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object msgTypeUrl_ = "";
    /**
     * <code>string msg_type_url = 3;</code>
     * @return The msgTypeUrl.
     */
    public java.lang.String getMsgTypeUrl() {
      java.lang.Object ref = msgTypeUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        msgTypeUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string msg_type_url = 3;</code>
     * @return The bytes for msgTypeUrl.
     */
    public com.google.protobuf.ByteString
        getMsgTypeUrlBytes() {
      java.lang.Object ref = msgTypeUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msgTypeUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string msg_type_url = 3;</code>
     * @param value The msgTypeUrl to set.
     * @return This builder for chaining.
     */
    public Builder setMsgTypeUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      msgTypeUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string msg_type_url = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMsgTypeUrl() {
      
      msgTypeUrl_ = getDefaultInstance().getMsgTypeUrl();
      onChanged();
      return this;
    }
    /**
     * <code>string msg_type_url = 3;</code>
     * @param value The bytes for msgTypeUrl to set.
     * @return This builder for chaining.
     */
    public Builder setMsgTypeUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      msgTypeUrl_ = value;
      onChanged();
      return this;
    }

    private cosmos.base.v1beta1.CoinOuterClass.Coin additionalFee_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.base.v1beta1.CoinOuterClass.Coin, cosmos.base.v1beta1.CoinOuterClass.Coin.Builder, cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder> additionalFeeBuilder_;
    /**
     * <code>.cosmos.base.v1beta1.Coin additional_fee = 4 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"additional_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @return Whether the additionalFee field is set.
     */
    public boolean hasAdditionalFee() {
      return additionalFeeBuilder_ != null || additionalFee_ != null;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin additional_fee = 4 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"additional_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @return The additionalFee.
     */
    public cosmos.base.v1beta1.CoinOuterClass.Coin getAdditionalFee() {
      if (additionalFeeBuilder_ == null) {
        return additionalFee_ == null ? cosmos.base.v1beta1.CoinOuterClass.Coin.getDefaultInstance() : additionalFee_;
      } else {
        return additionalFeeBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin additional_fee = 4 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"additional_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder setAdditionalFee(cosmos.base.v1beta1.CoinOuterClass.Coin value) {
      if (additionalFeeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        additionalFee_ = value;
        onChanged();
      } else {
        additionalFeeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin additional_fee = 4 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"additional_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder setAdditionalFee(
        cosmos.base.v1beta1.CoinOuterClass.Coin.Builder builderForValue) {
      if (additionalFeeBuilder_ == null) {
        additionalFee_ = builderForValue.build();
        onChanged();
      } else {
        additionalFeeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin additional_fee = 4 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"additional_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder mergeAdditionalFee(cosmos.base.v1beta1.CoinOuterClass.Coin value) {
      if (additionalFeeBuilder_ == null) {
        if (additionalFee_ != null) {
          additionalFee_ =
            cosmos.base.v1beta1.CoinOuterClass.Coin.newBuilder(additionalFee_).mergeFrom(value).buildPartial();
        } else {
          additionalFee_ = value;
        }
        onChanged();
      } else {
        additionalFeeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin additional_fee = 4 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"additional_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder clearAdditionalFee() {
      if (additionalFeeBuilder_ == null) {
        additionalFee_ = null;
        onChanged();
      } else {
        additionalFee_ = null;
        additionalFeeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin additional_fee = 4 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"additional_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public cosmos.base.v1beta1.CoinOuterClass.Coin.Builder getAdditionalFeeBuilder() {
      
      onChanged();
      return getAdditionalFeeFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin additional_fee = 4 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"additional_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder getAdditionalFeeOrBuilder() {
      if (additionalFeeBuilder_ != null) {
        return additionalFeeBuilder_.getMessageOrBuilder();
      } else {
        return additionalFee_ == null ?
            cosmos.base.v1beta1.CoinOuterClass.Coin.getDefaultInstance() : additionalFee_;
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin additional_fee = 4 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"additional_fee&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.base.v1beta1.CoinOuterClass.Coin, cosmos.base.v1beta1.CoinOuterClass.Coin.Builder, cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder> 
        getAdditionalFeeFieldBuilder() {
      if (additionalFeeBuilder_ == null) {
        additionalFeeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cosmos.base.v1beta1.CoinOuterClass.Coin, cosmos.base.v1beta1.CoinOuterClass.Coin.Builder, cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder>(
                getAdditionalFee(),
                getParentForChildren(),
                isClean());
        additionalFee_ = null;
      }
      return additionalFeeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:provenance.msgfees.v1.UpdateMsgFeeProposal)
  }

  // @@protoc_insertion_point(class_scope:provenance.msgfees.v1.UpdateMsgFeeProposal)
  private static final io.provenance.msgfees.v1.UpdateMsgFeeProposal DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.provenance.msgfees.v1.UpdateMsgFeeProposal();
  }

  public static io.provenance.msgfees.v1.UpdateMsgFeeProposal getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateMsgFeeProposal>
      PARSER = new com.google.protobuf.AbstractParser<UpdateMsgFeeProposal>() {
    @java.lang.Override
    public UpdateMsgFeeProposal parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateMsgFeeProposal(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateMsgFeeProposal> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateMsgFeeProposal> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.provenance.msgfees.v1.UpdateMsgFeeProposal getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

