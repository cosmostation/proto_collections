// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/tx.proto

package io.provenance.metadata.v1;

/**
 * <pre>
 * MsgWriteSessionResponse is the response type for the Msg/WriteSession RPC method.
 * </pre>
 *
 * Protobuf type {@code provenance.metadata.v1.MsgWriteSessionResponse}
 */
public final class MsgWriteSessionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.metadata.v1.MsgWriteSessionResponse)
    MsgWriteSessionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgWriteSessionResponse.newBuilder() to construct.
  private MsgWriteSessionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgWriteSessionResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgWriteSessionResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MsgWriteSessionResponse(
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
            io.provenance.metadata.v1.SessionIdInfo.Builder subBuilder = null;
            if (sessionIdInfo_ != null) {
              subBuilder = sessionIdInfo_.toBuilder();
            }
            sessionIdInfo_ = input.readMessage(io.provenance.metadata.v1.SessionIdInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(sessionIdInfo_);
              sessionIdInfo_ = subBuilder.buildPartial();
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
    return io.provenance.metadata.v1.Tx.internal_static_provenance_metadata_v1_MsgWriteSessionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.provenance.metadata.v1.Tx.internal_static_provenance_metadata_v1_MsgWriteSessionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.provenance.metadata.v1.MsgWriteSessionResponse.class, io.provenance.metadata.v1.MsgWriteSessionResponse.Builder.class);
  }

  public static final int SESSION_ID_INFO_FIELD_NUMBER = 1;
  private io.provenance.metadata.v1.SessionIdInfo sessionIdInfo_;
  /**
   * <pre>
   * session_id_info contains information about the id/address of the session that was added or updated.
   * </pre>
   *
   * <code>.provenance.metadata.v1.SessionIdInfo session_id_info = 1 [(.gogoproto.moretags) = "yaml:&#92;"session_id_info&#92;""];</code>
   * @return Whether the sessionIdInfo field is set.
   */
  @java.lang.Override
  public boolean hasSessionIdInfo() {
    return sessionIdInfo_ != null;
  }
  /**
   * <pre>
   * session_id_info contains information about the id/address of the session that was added or updated.
   * </pre>
   *
   * <code>.provenance.metadata.v1.SessionIdInfo session_id_info = 1 [(.gogoproto.moretags) = "yaml:&#92;"session_id_info&#92;""];</code>
   * @return The sessionIdInfo.
   */
  @java.lang.Override
  public io.provenance.metadata.v1.SessionIdInfo getSessionIdInfo() {
    return sessionIdInfo_ == null ? io.provenance.metadata.v1.SessionIdInfo.getDefaultInstance() : sessionIdInfo_;
  }
  /**
   * <pre>
   * session_id_info contains information about the id/address of the session that was added or updated.
   * </pre>
   *
   * <code>.provenance.metadata.v1.SessionIdInfo session_id_info = 1 [(.gogoproto.moretags) = "yaml:&#92;"session_id_info&#92;""];</code>
   */
  @java.lang.Override
  public io.provenance.metadata.v1.SessionIdInfoOrBuilder getSessionIdInfoOrBuilder() {
    return getSessionIdInfo();
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
    if (sessionIdInfo_ != null) {
      output.writeMessage(1, getSessionIdInfo());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sessionIdInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSessionIdInfo());
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
    if (!(obj instanceof io.provenance.metadata.v1.MsgWriteSessionResponse)) {
      return super.equals(obj);
    }
    io.provenance.metadata.v1.MsgWriteSessionResponse other = (io.provenance.metadata.v1.MsgWriteSessionResponse) obj;

    if (hasSessionIdInfo() != other.hasSessionIdInfo()) return false;
    if (hasSessionIdInfo()) {
      if (!getSessionIdInfo()
          .equals(other.getSessionIdInfo())) return false;
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
    if (hasSessionIdInfo()) {
      hash = (37 * hash) + SESSION_ID_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getSessionIdInfo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.provenance.metadata.v1.MsgWriteSessionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.MsgWriteSessionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.MsgWriteSessionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.MsgWriteSessionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.MsgWriteSessionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.MsgWriteSessionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.MsgWriteSessionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.MsgWriteSessionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.metadata.v1.MsgWriteSessionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.MsgWriteSessionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.metadata.v1.MsgWriteSessionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.MsgWriteSessionResponse parseFrom(
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
  public static Builder newBuilder(io.provenance.metadata.v1.MsgWriteSessionResponse prototype) {
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
   * MsgWriteSessionResponse is the response type for the Msg/WriteSession RPC method.
   * </pre>
   *
   * Protobuf type {@code provenance.metadata.v1.MsgWriteSessionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.metadata.v1.MsgWriteSessionResponse)
      io.provenance.metadata.v1.MsgWriteSessionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.provenance.metadata.v1.Tx.internal_static_provenance_metadata_v1_MsgWriteSessionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.provenance.metadata.v1.Tx.internal_static_provenance_metadata_v1_MsgWriteSessionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.provenance.metadata.v1.MsgWriteSessionResponse.class, io.provenance.metadata.v1.MsgWriteSessionResponse.Builder.class);
    }

    // Construct using io.provenance.metadata.v1.MsgWriteSessionResponse.newBuilder()
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
      if (sessionIdInfoBuilder_ == null) {
        sessionIdInfo_ = null;
      } else {
        sessionIdInfo_ = null;
        sessionIdInfoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.provenance.metadata.v1.Tx.internal_static_provenance_metadata_v1_MsgWriteSessionResponse_descriptor;
    }

    @java.lang.Override
    public io.provenance.metadata.v1.MsgWriteSessionResponse getDefaultInstanceForType() {
      return io.provenance.metadata.v1.MsgWriteSessionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public io.provenance.metadata.v1.MsgWriteSessionResponse build() {
      io.provenance.metadata.v1.MsgWriteSessionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.provenance.metadata.v1.MsgWriteSessionResponse buildPartial() {
      io.provenance.metadata.v1.MsgWriteSessionResponse result = new io.provenance.metadata.v1.MsgWriteSessionResponse(this);
      if (sessionIdInfoBuilder_ == null) {
        result.sessionIdInfo_ = sessionIdInfo_;
      } else {
        result.sessionIdInfo_ = sessionIdInfoBuilder_.build();
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
      if (other instanceof io.provenance.metadata.v1.MsgWriteSessionResponse) {
        return mergeFrom((io.provenance.metadata.v1.MsgWriteSessionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.provenance.metadata.v1.MsgWriteSessionResponse other) {
      if (other == io.provenance.metadata.v1.MsgWriteSessionResponse.getDefaultInstance()) return this;
      if (other.hasSessionIdInfo()) {
        mergeSessionIdInfo(other.getSessionIdInfo());
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
      io.provenance.metadata.v1.MsgWriteSessionResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.provenance.metadata.v1.MsgWriteSessionResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.provenance.metadata.v1.SessionIdInfo sessionIdInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.provenance.metadata.v1.SessionIdInfo, io.provenance.metadata.v1.SessionIdInfo.Builder, io.provenance.metadata.v1.SessionIdInfoOrBuilder> sessionIdInfoBuilder_;
    /**
     * <pre>
     * session_id_info contains information about the id/address of the session that was added or updated.
     * </pre>
     *
     * <code>.provenance.metadata.v1.SessionIdInfo session_id_info = 1 [(.gogoproto.moretags) = "yaml:&#92;"session_id_info&#92;""];</code>
     * @return Whether the sessionIdInfo field is set.
     */
    public boolean hasSessionIdInfo() {
      return sessionIdInfoBuilder_ != null || sessionIdInfo_ != null;
    }
    /**
     * <pre>
     * session_id_info contains information about the id/address of the session that was added or updated.
     * </pre>
     *
     * <code>.provenance.metadata.v1.SessionIdInfo session_id_info = 1 [(.gogoproto.moretags) = "yaml:&#92;"session_id_info&#92;""];</code>
     * @return The sessionIdInfo.
     */
    public io.provenance.metadata.v1.SessionIdInfo getSessionIdInfo() {
      if (sessionIdInfoBuilder_ == null) {
        return sessionIdInfo_ == null ? io.provenance.metadata.v1.SessionIdInfo.getDefaultInstance() : sessionIdInfo_;
      } else {
        return sessionIdInfoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * session_id_info contains information about the id/address of the session that was added or updated.
     * </pre>
     *
     * <code>.provenance.metadata.v1.SessionIdInfo session_id_info = 1 [(.gogoproto.moretags) = "yaml:&#92;"session_id_info&#92;""];</code>
     */
    public Builder setSessionIdInfo(io.provenance.metadata.v1.SessionIdInfo value) {
      if (sessionIdInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sessionIdInfo_ = value;
        onChanged();
      } else {
        sessionIdInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * session_id_info contains information about the id/address of the session that was added or updated.
     * </pre>
     *
     * <code>.provenance.metadata.v1.SessionIdInfo session_id_info = 1 [(.gogoproto.moretags) = "yaml:&#92;"session_id_info&#92;""];</code>
     */
    public Builder setSessionIdInfo(
        io.provenance.metadata.v1.SessionIdInfo.Builder builderForValue) {
      if (sessionIdInfoBuilder_ == null) {
        sessionIdInfo_ = builderForValue.build();
        onChanged();
      } else {
        sessionIdInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * session_id_info contains information about the id/address of the session that was added or updated.
     * </pre>
     *
     * <code>.provenance.metadata.v1.SessionIdInfo session_id_info = 1 [(.gogoproto.moretags) = "yaml:&#92;"session_id_info&#92;""];</code>
     */
    public Builder mergeSessionIdInfo(io.provenance.metadata.v1.SessionIdInfo value) {
      if (sessionIdInfoBuilder_ == null) {
        if (sessionIdInfo_ != null) {
          sessionIdInfo_ =
            io.provenance.metadata.v1.SessionIdInfo.newBuilder(sessionIdInfo_).mergeFrom(value).buildPartial();
        } else {
          sessionIdInfo_ = value;
        }
        onChanged();
      } else {
        sessionIdInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * session_id_info contains information about the id/address of the session that was added or updated.
     * </pre>
     *
     * <code>.provenance.metadata.v1.SessionIdInfo session_id_info = 1 [(.gogoproto.moretags) = "yaml:&#92;"session_id_info&#92;""];</code>
     */
    public Builder clearSessionIdInfo() {
      if (sessionIdInfoBuilder_ == null) {
        sessionIdInfo_ = null;
        onChanged();
      } else {
        sessionIdInfo_ = null;
        sessionIdInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * session_id_info contains information about the id/address of the session that was added or updated.
     * </pre>
     *
     * <code>.provenance.metadata.v1.SessionIdInfo session_id_info = 1 [(.gogoproto.moretags) = "yaml:&#92;"session_id_info&#92;""];</code>
     */
    public io.provenance.metadata.v1.SessionIdInfo.Builder getSessionIdInfoBuilder() {
      
      onChanged();
      return getSessionIdInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * session_id_info contains information about the id/address of the session that was added or updated.
     * </pre>
     *
     * <code>.provenance.metadata.v1.SessionIdInfo session_id_info = 1 [(.gogoproto.moretags) = "yaml:&#92;"session_id_info&#92;""];</code>
     */
    public io.provenance.metadata.v1.SessionIdInfoOrBuilder getSessionIdInfoOrBuilder() {
      if (sessionIdInfoBuilder_ != null) {
        return sessionIdInfoBuilder_.getMessageOrBuilder();
      } else {
        return sessionIdInfo_ == null ?
            io.provenance.metadata.v1.SessionIdInfo.getDefaultInstance() : sessionIdInfo_;
      }
    }
    /**
     * <pre>
     * session_id_info contains information about the id/address of the session that was added or updated.
     * </pre>
     *
     * <code>.provenance.metadata.v1.SessionIdInfo session_id_info = 1 [(.gogoproto.moretags) = "yaml:&#92;"session_id_info&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.provenance.metadata.v1.SessionIdInfo, io.provenance.metadata.v1.SessionIdInfo.Builder, io.provenance.metadata.v1.SessionIdInfoOrBuilder> 
        getSessionIdInfoFieldBuilder() {
      if (sessionIdInfoBuilder_ == null) {
        sessionIdInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.provenance.metadata.v1.SessionIdInfo, io.provenance.metadata.v1.SessionIdInfo.Builder, io.provenance.metadata.v1.SessionIdInfoOrBuilder>(
                getSessionIdInfo(),
                getParentForChildren(),
                isClean());
        sessionIdInfo_ = null;
      }
      return sessionIdInfoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:provenance.metadata.v1.MsgWriteSessionResponse)
  }

  // @@protoc_insertion_point(class_scope:provenance.metadata.v1.MsgWriteSessionResponse)
  private static final io.provenance.metadata.v1.MsgWriteSessionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.provenance.metadata.v1.MsgWriteSessionResponse();
  }

  public static io.provenance.metadata.v1.MsgWriteSessionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgWriteSessionResponse>
      PARSER = new com.google.protobuf.AbstractParser<MsgWriteSessionResponse>() {
    @java.lang.Override
    public MsgWriteSessionResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MsgWriteSessionResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MsgWriteSessionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgWriteSessionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.provenance.metadata.v1.MsgWriteSessionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

