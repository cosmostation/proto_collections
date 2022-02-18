// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/tx.proto

package io.provenance.metadata.v1;

/**
 * <pre>
 * MsgModifyOSLocatorRequest is the request type for the Msg/ModifyOSLocator RPC method.
 * </pre>
 *
 * Protobuf type {@code provenance.metadata.v1.MsgModifyOSLocatorRequest}
 */
public final class MsgModifyOSLocatorRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.metadata.v1.MsgModifyOSLocatorRequest)
    MsgModifyOSLocatorRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgModifyOSLocatorRequest.newBuilder() to construct.
  private MsgModifyOSLocatorRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgModifyOSLocatorRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgModifyOSLocatorRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MsgModifyOSLocatorRequest(
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
            io.provenance.metadata.v1.ObjectStoreLocator.Builder subBuilder = null;
            if (locator_ != null) {
              subBuilder = locator_.toBuilder();
            }
            locator_ = input.readMessage(io.provenance.metadata.v1.ObjectStoreLocator.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(locator_);
              locator_ = subBuilder.buildPartial();
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
    return io.provenance.metadata.v1.Tx.internal_static_provenance_metadata_v1_MsgModifyOSLocatorRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.provenance.metadata.v1.Tx.internal_static_provenance_metadata_v1_MsgModifyOSLocatorRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.provenance.metadata.v1.MsgModifyOSLocatorRequest.class, io.provenance.metadata.v1.MsgModifyOSLocatorRequest.Builder.class);
  }

  public static final int LOCATOR_FIELD_NUMBER = 1;
  private io.provenance.metadata.v1.ObjectStoreLocator locator_;
  /**
   * <pre>
   * The object locator to bind the address to bind to the URI.
   * </pre>
   *
   * <code>.provenance.metadata.v1.ObjectStoreLocator locator = 1 [(.gogoproto.nullable) = false];</code>
   * @return Whether the locator field is set.
   */
  @java.lang.Override
  public boolean hasLocator() {
    return locator_ != null;
  }
  /**
   * <pre>
   * The object locator to bind the address to bind to the URI.
   * </pre>
   *
   * <code>.provenance.metadata.v1.ObjectStoreLocator locator = 1 [(.gogoproto.nullable) = false];</code>
   * @return The locator.
   */
  @java.lang.Override
  public io.provenance.metadata.v1.ObjectStoreLocator getLocator() {
    return locator_ == null ? io.provenance.metadata.v1.ObjectStoreLocator.getDefaultInstance() : locator_;
  }
  /**
   * <pre>
   * The object locator to bind the address to bind to the URI.
   * </pre>
   *
   * <code>.provenance.metadata.v1.ObjectStoreLocator locator = 1 [(.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public io.provenance.metadata.v1.ObjectStoreLocatorOrBuilder getLocatorOrBuilder() {
    return getLocator();
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
    if (locator_ != null) {
      output.writeMessage(1, getLocator());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (locator_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLocator());
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
    if (!(obj instanceof io.provenance.metadata.v1.MsgModifyOSLocatorRequest)) {
      return super.equals(obj);
    }
    io.provenance.metadata.v1.MsgModifyOSLocatorRequest other = (io.provenance.metadata.v1.MsgModifyOSLocatorRequest) obj;

    if (hasLocator() != other.hasLocator()) return false;
    if (hasLocator()) {
      if (!getLocator()
          .equals(other.getLocator())) return false;
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
    if (hasLocator()) {
      hash = (37 * hash) + LOCATOR_FIELD_NUMBER;
      hash = (53 * hash) + getLocator().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.provenance.metadata.v1.MsgModifyOSLocatorRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.MsgModifyOSLocatorRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.MsgModifyOSLocatorRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.MsgModifyOSLocatorRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.MsgModifyOSLocatorRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.MsgModifyOSLocatorRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.MsgModifyOSLocatorRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.MsgModifyOSLocatorRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.metadata.v1.MsgModifyOSLocatorRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.MsgModifyOSLocatorRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.metadata.v1.MsgModifyOSLocatorRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.MsgModifyOSLocatorRequest parseFrom(
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
  public static Builder newBuilder(io.provenance.metadata.v1.MsgModifyOSLocatorRequest prototype) {
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
   * MsgModifyOSLocatorRequest is the request type for the Msg/ModifyOSLocator RPC method.
   * </pre>
   *
   * Protobuf type {@code provenance.metadata.v1.MsgModifyOSLocatorRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.metadata.v1.MsgModifyOSLocatorRequest)
      io.provenance.metadata.v1.MsgModifyOSLocatorRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.provenance.metadata.v1.Tx.internal_static_provenance_metadata_v1_MsgModifyOSLocatorRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.provenance.metadata.v1.Tx.internal_static_provenance_metadata_v1_MsgModifyOSLocatorRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.provenance.metadata.v1.MsgModifyOSLocatorRequest.class, io.provenance.metadata.v1.MsgModifyOSLocatorRequest.Builder.class);
    }

    // Construct using io.provenance.metadata.v1.MsgModifyOSLocatorRequest.newBuilder()
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
      if (locatorBuilder_ == null) {
        locator_ = null;
      } else {
        locator_ = null;
        locatorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.provenance.metadata.v1.Tx.internal_static_provenance_metadata_v1_MsgModifyOSLocatorRequest_descriptor;
    }

    @java.lang.Override
    public io.provenance.metadata.v1.MsgModifyOSLocatorRequest getDefaultInstanceForType() {
      return io.provenance.metadata.v1.MsgModifyOSLocatorRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.provenance.metadata.v1.MsgModifyOSLocatorRequest build() {
      io.provenance.metadata.v1.MsgModifyOSLocatorRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.provenance.metadata.v1.MsgModifyOSLocatorRequest buildPartial() {
      io.provenance.metadata.v1.MsgModifyOSLocatorRequest result = new io.provenance.metadata.v1.MsgModifyOSLocatorRequest(this);
      if (locatorBuilder_ == null) {
        result.locator_ = locator_;
      } else {
        result.locator_ = locatorBuilder_.build();
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
      if (other instanceof io.provenance.metadata.v1.MsgModifyOSLocatorRequest) {
        return mergeFrom((io.provenance.metadata.v1.MsgModifyOSLocatorRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.provenance.metadata.v1.MsgModifyOSLocatorRequest other) {
      if (other == io.provenance.metadata.v1.MsgModifyOSLocatorRequest.getDefaultInstance()) return this;
      if (other.hasLocator()) {
        mergeLocator(other.getLocator());
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
      io.provenance.metadata.v1.MsgModifyOSLocatorRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.provenance.metadata.v1.MsgModifyOSLocatorRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.provenance.metadata.v1.ObjectStoreLocator locator_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.provenance.metadata.v1.ObjectStoreLocator, io.provenance.metadata.v1.ObjectStoreLocator.Builder, io.provenance.metadata.v1.ObjectStoreLocatorOrBuilder> locatorBuilder_;
    /**
     * <pre>
     * The object locator to bind the address to bind to the URI.
     * </pre>
     *
     * <code>.provenance.metadata.v1.ObjectStoreLocator locator = 1 [(.gogoproto.nullable) = false];</code>
     * @return Whether the locator field is set.
     */
    public boolean hasLocator() {
      return locatorBuilder_ != null || locator_ != null;
    }
    /**
     * <pre>
     * The object locator to bind the address to bind to the URI.
     * </pre>
     *
     * <code>.provenance.metadata.v1.ObjectStoreLocator locator = 1 [(.gogoproto.nullable) = false];</code>
     * @return The locator.
     */
    public io.provenance.metadata.v1.ObjectStoreLocator getLocator() {
      if (locatorBuilder_ == null) {
        return locator_ == null ? io.provenance.metadata.v1.ObjectStoreLocator.getDefaultInstance() : locator_;
      } else {
        return locatorBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The object locator to bind the address to bind to the URI.
     * </pre>
     *
     * <code>.provenance.metadata.v1.ObjectStoreLocator locator = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setLocator(io.provenance.metadata.v1.ObjectStoreLocator value) {
      if (locatorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        locator_ = value;
        onChanged();
      } else {
        locatorBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The object locator to bind the address to bind to the URI.
     * </pre>
     *
     * <code>.provenance.metadata.v1.ObjectStoreLocator locator = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setLocator(
        io.provenance.metadata.v1.ObjectStoreLocator.Builder builderForValue) {
      if (locatorBuilder_ == null) {
        locator_ = builderForValue.build();
        onChanged();
      } else {
        locatorBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The object locator to bind the address to bind to the URI.
     * </pre>
     *
     * <code>.provenance.metadata.v1.ObjectStoreLocator locator = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder mergeLocator(io.provenance.metadata.v1.ObjectStoreLocator value) {
      if (locatorBuilder_ == null) {
        if (locator_ != null) {
          locator_ =
            io.provenance.metadata.v1.ObjectStoreLocator.newBuilder(locator_).mergeFrom(value).buildPartial();
        } else {
          locator_ = value;
        }
        onChanged();
      } else {
        locatorBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The object locator to bind the address to bind to the URI.
     * </pre>
     *
     * <code>.provenance.metadata.v1.ObjectStoreLocator locator = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder clearLocator() {
      if (locatorBuilder_ == null) {
        locator_ = null;
        onChanged();
      } else {
        locator_ = null;
        locatorBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The object locator to bind the address to bind to the URI.
     * </pre>
     *
     * <code>.provenance.metadata.v1.ObjectStoreLocator locator = 1 [(.gogoproto.nullable) = false];</code>
     */
    public io.provenance.metadata.v1.ObjectStoreLocator.Builder getLocatorBuilder() {
      
      onChanged();
      return getLocatorFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The object locator to bind the address to bind to the URI.
     * </pre>
     *
     * <code>.provenance.metadata.v1.ObjectStoreLocator locator = 1 [(.gogoproto.nullable) = false];</code>
     */
    public io.provenance.metadata.v1.ObjectStoreLocatorOrBuilder getLocatorOrBuilder() {
      if (locatorBuilder_ != null) {
        return locatorBuilder_.getMessageOrBuilder();
      } else {
        return locator_ == null ?
            io.provenance.metadata.v1.ObjectStoreLocator.getDefaultInstance() : locator_;
      }
    }
    /**
     * <pre>
     * The object locator to bind the address to bind to the URI.
     * </pre>
     *
     * <code>.provenance.metadata.v1.ObjectStoreLocator locator = 1 [(.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.provenance.metadata.v1.ObjectStoreLocator, io.provenance.metadata.v1.ObjectStoreLocator.Builder, io.provenance.metadata.v1.ObjectStoreLocatorOrBuilder> 
        getLocatorFieldBuilder() {
      if (locatorBuilder_ == null) {
        locatorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.provenance.metadata.v1.ObjectStoreLocator, io.provenance.metadata.v1.ObjectStoreLocator.Builder, io.provenance.metadata.v1.ObjectStoreLocatorOrBuilder>(
                getLocator(),
                getParentForChildren(),
                isClean());
        locator_ = null;
      }
      return locatorBuilder_;
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


    // @@protoc_insertion_point(builder_scope:provenance.metadata.v1.MsgModifyOSLocatorRequest)
  }

  // @@protoc_insertion_point(class_scope:provenance.metadata.v1.MsgModifyOSLocatorRequest)
  private static final io.provenance.metadata.v1.MsgModifyOSLocatorRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.provenance.metadata.v1.MsgModifyOSLocatorRequest();
  }

  public static io.provenance.metadata.v1.MsgModifyOSLocatorRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgModifyOSLocatorRequest>
      PARSER = new com.google.protobuf.AbstractParser<MsgModifyOSLocatorRequest>() {
    @java.lang.Override
    public MsgModifyOSLocatorRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MsgModifyOSLocatorRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MsgModifyOSLocatorRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgModifyOSLocatorRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.provenance.metadata.v1.MsgModifyOSLocatorRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

