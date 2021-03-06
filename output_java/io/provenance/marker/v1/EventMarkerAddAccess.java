// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/marker/v1/marker.proto

package io.provenance.marker.v1;

/**
 * <pre>
 * EventMarkerAddAccess event emitted when marker access is added
 * </pre>
 *
 * Protobuf type {@code provenance.marker.v1.EventMarkerAddAccess}
 */
public final class EventMarkerAddAccess extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.marker.v1.EventMarkerAddAccess)
    EventMarkerAddAccessOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventMarkerAddAccess.newBuilder() to construct.
  private EventMarkerAddAccess(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventMarkerAddAccess() {
    denom_ = "";
    administrator_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EventMarkerAddAccess();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EventMarkerAddAccess(
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
            io.provenance.marker.v1.EventMarkerAccess.Builder subBuilder = null;
            if (access_ != null) {
              subBuilder = access_.toBuilder();
            }
            access_ = input.readMessage(io.provenance.marker.v1.EventMarkerAccess.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(access_);
              access_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            denom_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            administrator_ = s;
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
    return io.provenance.marker.v1.Marker.internal_static_provenance_marker_v1_EventMarkerAddAccess_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.provenance.marker.v1.Marker.internal_static_provenance_marker_v1_EventMarkerAddAccess_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.provenance.marker.v1.EventMarkerAddAccess.class, io.provenance.marker.v1.EventMarkerAddAccess.Builder.class);
  }

  public static final int ACCESS_FIELD_NUMBER = 1;
  private io.provenance.marker.v1.EventMarkerAccess access_;
  /**
   * <code>.provenance.marker.v1.EventMarkerAccess access = 1 [(.gogoproto.nullable) = false];</code>
   * @return Whether the access field is set.
   */
  @java.lang.Override
  public boolean hasAccess() {
    return access_ != null;
  }
  /**
   * <code>.provenance.marker.v1.EventMarkerAccess access = 1 [(.gogoproto.nullable) = false];</code>
   * @return The access.
   */
  @java.lang.Override
  public io.provenance.marker.v1.EventMarkerAccess getAccess() {
    return access_ == null ? io.provenance.marker.v1.EventMarkerAccess.getDefaultInstance() : access_;
  }
  /**
   * <code>.provenance.marker.v1.EventMarkerAccess access = 1 [(.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public io.provenance.marker.v1.EventMarkerAccessOrBuilder getAccessOrBuilder() {
    return getAccess();
  }

  public static final int DENOM_FIELD_NUMBER = 2;
  private volatile java.lang.Object denom_;
  /**
   * <code>string denom = 2;</code>
   * @return The denom.
   */
  @java.lang.Override
  public java.lang.String getDenom() {
    java.lang.Object ref = denom_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      denom_ = s;
      return s;
    }
  }
  /**
   * <code>string denom = 2;</code>
   * @return The bytes for denom.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDenomBytes() {
    java.lang.Object ref = denom_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      denom_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ADMINISTRATOR_FIELD_NUMBER = 3;
  private volatile java.lang.Object administrator_;
  /**
   * <code>string administrator = 3;</code>
   * @return The administrator.
   */
  @java.lang.Override
  public java.lang.String getAdministrator() {
    java.lang.Object ref = administrator_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      administrator_ = s;
      return s;
    }
  }
  /**
   * <code>string administrator = 3;</code>
   * @return The bytes for administrator.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAdministratorBytes() {
    java.lang.Object ref = administrator_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      administrator_ = b;
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
    if (access_ != null) {
      output.writeMessage(1, getAccess());
    }
    if (!getDenomBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, denom_);
    }
    if (!getAdministratorBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, administrator_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (access_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAccess());
    }
    if (!getDenomBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, denom_);
    }
    if (!getAdministratorBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, administrator_);
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
    if (!(obj instanceof io.provenance.marker.v1.EventMarkerAddAccess)) {
      return super.equals(obj);
    }
    io.provenance.marker.v1.EventMarkerAddAccess other = (io.provenance.marker.v1.EventMarkerAddAccess) obj;

    if (hasAccess() != other.hasAccess()) return false;
    if (hasAccess()) {
      if (!getAccess()
          .equals(other.getAccess())) return false;
    }
    if (!getDenom()
        .equals(other.getDenom())) return false;
    if (!getAdministrator()
        .equals(other.getAdministrator())) return false;
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
    if (hasAccess()) {
      hash = (37 * hash) + ACCESS_FIELD_NUMBER;
      hash = (53 * hash) + getAccess().hashCode();
    }
    hash = (37 * hash) + DENOM_FIELD_NUMBER;
    hash = (53 * hash) + getDenom().hashCode();
    hash = (37 * hash) + ADMINISTRATOR_FIELD_NUMBER;
    hash = (53 * hash) + getAdministrator().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.provenance.marker.v1.EventMarkerAddAccess parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.marker.v1.EventMarkerAddAccess parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.marker.v1.EventMarkerAddAccess parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.marker.v1.EventMarkerAddAccess parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.marker.v1.EventMarkerAddAccess parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.marker.v1.EventMarkerAddAccess parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.marker.v1.EventMarkerAddAccess parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.marker.v1.EventMarkerAddAccess parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.marker.v1.EventMarkerAddAccess parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.provenance.marker.v1.EventMarkerAddAccess parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.marker.v1.EventMarkerAddAccess parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.marker.v1.EventMarkerAddAccess parseFrom(
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
  public static Builder newBuilder(io.provenance.marker.v1.EventMarkerAddAccess prototype) {
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
   * EventMarkerAddAccess event emitted when marker access is added
   * </pre>
   *
   * Protobuf type {@code provenance.marker.v1.EventMarkerAddAccess}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.marker.v1.EventMarkerAddAccess)
      io.provenance.marker.v1.EventMarkerAddAccessOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.provenance.marker.v1.Marker.internal_static_provenance_marker_v1_EventMarkerAddAccess_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.provenance.marker.v1.Marker.internal_static_provenance_marker_v1_EventMarkerAddAccess_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.provenance.marker.v1.EventMarkerAddAccess.class, io.provenance.marker.v1.EventMarkerAddAccess.Builder.class);
    }

    // Construct using io.provenance.marker.v1.EventMarkerAddAccess.newBuilder()
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
      if (accessBuilder_ == null) {
        access_ = null;
      } else {
        access_ = null;
        accessBuilder_ = null;
      }
      denom_ = "";

      administrator_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.provenance.marker.v1.Marker.internal_static_provenance_marker_v1_EventMarkerAddAccess_descriptor;
    }

    @java.lang.Override
    public io.provenance.marker.v1.EventMarkerAddAccess getDefaultInstanceForType() {
      return io.provenance.marker.v1.EventMarkerAddAccess.getDefaultInstance();
    }

    @java.lang.Override
    public io.provenance.marker.v1.EventMarkerAddAccess build() {
      io.provenance.marker.v1.EventMarkerAddAccess result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.provenance.marker.v1.EventMarkerAddAccess buildPartial() {
      io.provenance.marker.v1.EventMarkerAddAccess result = new io.provenance.marker.v1.EventMarkerAddAccess(this);
      if (accessBuilder_ == null) {
        result.access_ = access_;
      } else {
        result.access_ = accessBuilder_.build();
      }
      result.denom_ = denom_;
      result.administrator_ = administrator_;
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
      if (other instanceof io.provenance.marker.v1.EventMarkerAddAccess) {
        return mergeFrom((io.provenance.marker.v1.EventMarkerAddAccess)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.provenance.marker.v1.EventMarkerAddAccess other) {
      if (other == io.provenance.marker.v1.EventMarkerAddAccess.getDefaultInstance()) return this;
      if (other.hasAccess()) {
        mergeAccess(other.getAccess());
      }
      if (!other.getDenom().isEmpty()) {
        denom_ = other.denom_;
        onChanged();
      }
      if (!other.getAdministrator().isEmpty()) {
        administrator_ = other.administrator_;
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
      io.provenance.marker.v1.EventMarkerAddAccess parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.provenance.marker.v1.EventMarkerAddAccess) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.provenance.marker.v1.EventMarkerAccess access_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.provenance.marker.v1.EventMarkerAccess, io.provenance.marker.v1.EventMarkerAccess.Builder, io.provenance.marker.v1.EventMarkerAccessOrBuilder> accessBuilder_;
    /**
     * <code>.provenance.marker.v1.EventMarkerAccess access = 1 [(.gogoproto.nullable) = false];</code>
     * @return Whether the access field is set.
     */
    public boolean hasAccess() {
      return accessBuilder_ != null || access_ != null;
    }
    /**
     * <code>.provenance.marker.v1.EventMarkerAccess access = 1 [(.gogoproto.nullable) = false];</code>
     * @return The access.
     */
    public io.provenance.marker.v1.EventMarkerAccess getAccess() {
      if (accessBuilder_ == null) {
        return access_ == null ? io.provenance.marker.v1.EventMarkerAccess.getDefaultInstance() : access_;
      } else {
        return accessBuilder_.getMessage();
      }
    }
    /**
     * <code>.provenance.marker.v1.EventMarkerAccess access = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setAccess(io.provenance.marker.v1.EventMarkerAccess value) {
      if (accessBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        access_ = value;
        onChanged();
      } else {
        accessBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.provenance.marker.v1.EventMarkerAccess access = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setAccess(
        io.provenance.marker.v1.EventMarkerAccess.Builder builderForValue) {
      if (accessBuilder_ == null) {
        access_ = builderForValue.build();
        onChanged();
      } else {
        accessBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.provenance.marker.v1.EventMarkerAccess access = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder mergeAccess(io.provenance.marker.v1.EventMarkerAccess value) {
      if (accessBuilder_ == null) {
        if (access_ != null) {
          access_ =
            io.provenance.marker.v1.EventMarkerAccess.newBuilder(access_).mergeFrom(value).buildPartial();
        } else {
          access_ = value;
        }
        onChanged();
      } else {
        accessBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.provenance.marker.v1.EventMarkerAccess access = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder clearAccess() {
      if (accessBuilder_ == null) {
        access_ = null;
        onChanged();
      } else {
        access_ = null;
        accessBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.provenance.marker.v1.EventMarkerAccess access = 1 [(.gogoproto.nullable) = false];</code>
     */
    public io.provenance.marker.v1.EventMarkerAccess.Builder getAccessBuilder() {
      
      onChanged();
      return getAccessFieldBuilder().getBuilder();
    }
    /**
     * <code>.provenance.marker.v1.EventMarkerAccess access = 1 [(.gogoproto.nullable) = false];</code>
     */
    public io.provenance.marker.v1.EventMarkerAccessOrBuilder getAccessOrBuilder() {
      if (accessBuilder_ != null) {
        return accessBuilder_.getMessageOrBuilder();
      } else {
        return access_ == null ?
            io.provenance.marker.v1.EventMarkerAccess.getDefaultInstance() : access_;
      }
    }
    /**
     * <code>.provenance.marker.v1.EventMarkerAccess access = 1 [(.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.provenance.marker.v1.EventMarkerAccess, io.provenance.marker.v1.EventMarkerAccess.Builder, io.provenance.marker.v1.EventMarkerAccessOrBuilder> 
        getAccessFieldBuilder() {
      if (accessBuilder_ == null) {
        accessBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.provenance.marker.v1.EventMarkerAccess, io.provenance.marker.v1.EventMarkerAccess.Builder, io.provenance.marker.v1.EventMarkerAccessOrBuilder>(
                getAccess(),
                getParentForChildren(),
                isClean());
        access_ = null;
      }
      return accessBuilder_;
    }

    private java.lang.Object denom_ = "";
    /**
     * <code>string denom = 2;</code>
     * @return The denom.
     */
    public java.lang.String getDenom() {
      java.lang.Object ref = denom_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        denom_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string denom = 2;</code>
     * @return The bytes for denom.
     */
    public com.google.protobuf.ByteString
        getDenomBytes() {
      java.lang.Object ref = denom_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        denom_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string denom = 2;</code>
     * @param value The denom to set.
     * @return This builder for chaining.
     */
    public Builder setDenom(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      denom_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string denom = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDenom() {
      
      denom_ = getDefaultInstance().getDenom();
      onChanged();
      return this;
    }
    /**
     * <code>string denom = 2;</code>
     * @param value The bytes for denom to set.
     * @return This builder for chaining.
     */
    public Builder setDenomBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      denom_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object administrator_ = "";
    /**
     * <code>string administrator = 3;</code>
     * @return The administrator.
     */
    public java.lang.String getAdministrator() {
      java.lang.Object ref = administrator_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        administrator_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string administrator = 3;</code>
     * @return The bytes for administrator.
     */
    public com.google.protobuf.ByteString
        getAdministratorBytes() {
      java.lang.Object ref = administrator_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        administrator_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string administrator = 3;</code>
     * @param value The administrator to set.
     * @return This builder for chaining.
     */
    public Builder setAdministrator(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      administrator_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string administrator = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAdministrator() {
      
      administrator_ = getDefaultInstance().getAdministrator();
      onChanged();
      return this;
    }
    /**
     * <code>string administrator = 3;</code>
     * @param value The bytes for administrator to set.
     * @return This builder for chaining.
     */
    public Builder setAdministratorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      administrator_ = value;
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


    // @@protoc_insertion_point(builder_scope:provenance.marker.v1.EventMarkerAddAccess)
  }

  // @@protoc_insertion_point(class_scope:provenance.marker.v1.EventMarkerAddAccess)
  private static final io.provenance.marker.v1.EventMarkerAddAccess DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.provenance.marker.v1.EventMarkerAddAccess();
  }

  public static io.provenance.marker.v1.EventMarkerAddAccess getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventMarkerAddAccess>
      PARSER = new com.google.protobuf.AbstractParser<EventMarkerAddAccess>() {
    @java.lang.Override
    public EventMarkerAddAccess parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EventMarkerAddAccess(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EventMarkerAddAccess> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventMarkerAddAccess> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.provenance.marker.v1.EventMarkerAddAccess getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

