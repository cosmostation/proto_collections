// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/marker/v1/tx.proto

package io.provenance.marker.v1;

/**
 * <pre>
 * MsgAddAccessRequest defines the Msg/AddAccess request type
 * </pre>
 *
 * Protobuf type {@code provenance.marker.v1.MsgAddAccessRequest}
 */
public final class MsgAddAccessRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.marker.v1.MsgAddAccessRequest)
    MsgAddAccessRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgAddAccessRequest.newBuilder() to construct.
  private MsgAddAccessRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgAddAccessRequest() {
    denom_ = "";
    administrator_ = "";
    access_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgAddAccessRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MsgAddAccessRequest(
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
            java.lang.String s = input.readStringRequireUtf8();

            denom_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            administrator_ = s;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              access_ = new java.util.ArrayList<io.provenance.marker.v1.AccessGrant>();
              mutable_bitField0_ |= 0x00000001;
            }
            access_.add(
                input.readMessage(io.provenance.marker.v1.AccessGrant.parser(), extensionRegistry));
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
        access_ = java.util.Collections.unmodifiableList(access_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.provenance.marker.v1.Tx.internal_static_provenance_marker_v1_MsgAddAccessRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.provenance.marker.v1.Tx.internal_static_provenance_marker_v1_MsgAddAccessRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.provenance.marker.v1.MsgAddAccessRequest.class, io.provenance.marker.v1.MsgAddAccessRequest.Builder.class);
  }

  public static final int DENOM_FIELD_NUMBER = 1;
  private volatile java.lang.Object denom_;
  /**
   * <code>string denom = 1;</code>
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
   * <code>string denom = 1;</code>
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

  public static final int ADMINISTRATOR_FIELD_NUMBER = 2;
  private volatile java.lang.Object administrator_;
  /**
   * <code>string administrator = 2;</code>
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
   * <code>string administrator = 2;</code>
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

  public static final int ACCESS_FIELD_NUMBER = 3;
  private java.util.List<io.provenance.marker.v1.AccessGrant> access_;
  /**
   * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [(.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<io.provenance.marker.v1.AccessGrant> getAccessList() {
    return access_;
  }
  /**
   * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [(.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.provenance.marker.v1.AccessGrantOrBuilder> 
      getAccessOrBuilderList() {
    return access_;
  }
  /**
   * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [(.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getAccessCount() {
    return access_.size();
  }
  /**
   * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [(.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public io.provenance.marker.v1.AccessGrant getAccess(int index) {
    return access_.get(index);
  }
  /**
   * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [(.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public io.provenance.marker.v1.AccessGrantOrBuilder getAccessOrBuilder(
      int index) {
    return access_.get(index);
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
    if (!getDenomBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, denom_);
    }
    if (!getAdministratorBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, administrator_);
    }
    for (int i = 0; i < access_.size(); i++) {
      output.writeMessage(3, access_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDenomBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, denom_);
    }
    if (!getAdministratorBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, administrator_);
    }
    for (int i = 0; i < access_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, access_.get(i));
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
    if (!(obj instanceof io.provenance.marker.v1.MsgAddAccessRequest)) {
      return super.equals(obj);
    }
    io.provenance.marker.v1.MsgAddAccessRequest other = (io.provenance.marker.v1.MsgAddAccessRequest) obj;

    if (!getDenom()
        .equals(other.getDenom())) return false;
    if (!getAdministrator()
        .equals(other.getAdministrator())) return false;
    if (!getAccessList()
        .equals(other.getAccessList())) return false;
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
    hash = (37 * hash) + DENOM_FIELD_NUMBER;
    hash = (53 * hash) + getDenom().hashCode();
    hash = (37 * hash) + ADMINISTRATOR_FIELD_NUMBER;
    hash = (53 * hash) + getAdministrator().hashCode();
    if (getAccessCount() > 0) {
      hash = (37 * hash) + ACCESS_FIELD_NUMBER;
      hash = (53 * hash) + getAccessList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.provenance.marker.v1.MsgAddAccessRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.marker.v1.MsgAddAccessRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.marker.v1.MsgAddAccessRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.marker.v1.MsgAddAccessRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.marker.v1.MsgAddAccessRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.marker.v1.MsgAddAccessRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.marker.v1.MsgAddAccessRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.marker.v1.MsgAddAccessRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.marker.v1.MsgAddAccessRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.provenance.marker.v1.MsgAddAccessRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.marker.v1.MsgAddAccessRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.marker.v1.MsgAddAccessRequest parseFrom(
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
  public static Builder newBuilder(io.provenance.marker.v1.MsgAddAccessRequest prototype) {
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
   * MsgAddAccessRequest defines the Msg/AddAccess request type
   * </pre>
   *
   * Protobuf type {@code provenance.marker.v1.MsgAddAccessRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.marker.v1.MsgAddAccessRequest)
      io.provenance.marker.v1.MsgAddAccessRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.provenance.marker.v1.Tx.internal_static_provenance_marker_v1_MsgAddAccessRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.provenance.marker.v1.Tx.internal_static_provenance_marker_v1_MsgAddAccessRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.provenance.marker.v1.MsgAddAccessRequest.class, io.provenance.marker.v1.MsgAddAccessRequest.Builder.class);
    }

    // Construct using io.provenance.marker.v1.MsgAddAccessRequest.newBuilder()
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
        getAccessFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      denom_ = "";

      administrator_ = "";

      if (accessBuilder_ == null) {
        access_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        accessBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.provenance.marker.v1.Tx.internal_static_provenance_marker_v1_MsgAddAccessRequest_descriptor;
    }

    @java.lang.Override
    public io.provenance.marker.v1.MsgAddAccessRequest getDefaultInstanceForType() {
      return io.provenance.marker.v1.MsgAddAccessRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.provenance.marker.v1.MsgAddAccessRequest build() {
      io.provenance.marker.v1.MsgAddAccessRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.provenance.marker.v1.MsgAddAccessRequest buildPartial() {
      io.provenance.marker.v1.MsgAddAccessRequest result = new io.provenance.marker.v1.MsgAddAccessRequest(this);
      int from_bitField0_ = bitField0_;
      result.denom_ = denom_;
      result.administrator_ = administrator_;
      if (accessBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          access_ = java.util.Collections.unmodifiableList(access_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.access_ = access_;
      } else {
        result.access_ = accessBuilder_.build();
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
      if (other instanceof io.provenance.marker.v1.MsgAddAccessRequest) {
        return mergeFrom((io.provenance.marker.v1.MsgAddAccessRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.provenance.marker.v1.MsgAddAccessRequest other) {
      if (other == io.provenance.marker.v1.MsgAddAccessRequest.getDefaultInstance()) return this;
      if (!other.getDenom().isEmpty()) {
        denom_ = other.denom_;
        onChanged();
      }
      if (!other.getAdministrator().isEmpty()) {
        administrator_ = other.administrator_;
        onChanged();
      }
      if (accessBuilder_ == null) {
        if (!other.access_.isEmpty()) {
          if (access_.isEmpty()) {
            access_ = other.access_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAccessIsMutable();
            access_.addAll(other.access_);
          }
          onChanged();
        }
      } else {
        if (!other.access_.isEmpty()) {
          if (accessBuilder_.isEmpty()) {
            accessBuilder_.dispose();
            accessBuilder_ = null;
            access_ = other.access_;
            bitField0_ = (bitField0_ & ~0x00000001);
            accessBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAccessFieldBuilder() : null;
          } else {
            accessBuilder_.addAllMessages(other.access_);
          }
        }
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
      io.provenance.marker.v1.MsgAddAccessRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.provenance.marker.v1.MsgAddAccessRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object denom_ = "";
    /**
     * <code>string denom = 1;</code>
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
     * <code>string denom = 1;</code>
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
     * <code>string denom = 1;</code>
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
     * <code>string denom = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDenom() {
      
      denom_ = getDefaultInstance().getDenom();
      onChanged();
      return this;
    }
    /**
     * <code>string denom = 1;</code>
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
     * <code>string administrator = 2;</code>
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
     * <code>string administrator = 2;</code>
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
     * <code>string administrator = 2;</code>
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
     * <code>string administrator = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAdministrator() {
      
      administrator_ = getDefaultInstance().getAdministrator();
      onChanged();
      return this;
    }
    /**
     * <code>string administrator = 2;</code>
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

    private java.util.List<io.provenance.marker.v1.AccessGrant> access_ =
      java.util.Collections.emptyList();
    private void ensureAccessIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        access_ = new java.util.ArrayList<io.provenance.marker.v1.AccessGrant>(access_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.provenance.marker.v1.AccessGrant, io.provenance.marker.v1.AccessGrant.Builder, io.provenance.marker.v1.AccessGrantOrBuilder> accessBuilder_;

    /**
     * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [(.gogoproto.nullable) = false];</code>
     */
    public java.util.List<io.provenance.marker.v1.AccessGrant> getAccessList() {
      if (accessBuilder_ == null) {
        return java.util.Collections.unmodifiableList(access_);
      } else {
        return accessBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [(.gogoproto.nullable) = false];</code>
     */
    public int getAccessCount() {
      if (accessBuilder_ == null) {
        return access_.size();
      } else {
        return accessBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [(.gogoproto.nullable) = false];</code>
     */
    public io.provenance.marker.v1.AccessGrant getAccess(int index) {
      if (accessBuilder_ == null) {
        return access_.get(index);
      } else {
        return accessBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setAccess(
        int index, io.provenance.marker.v1.AccessGrant value) {
      if (accessBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccessIsMutable();
        access_.set(index, value);
        onChanged();
      } else {
        accessBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setAccess(
        int index, io.provenance.marker.v1.AccessGrant.Builder builderForValue) {
      if (accessBuilder_ == null) {
        ensureAccessIsMutable();
        access_.set(index, builderForValue.build());
        onChanged();
      } else {
        accessBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addAccess(io.provenance.marker.v1.AccessGrant value) {
      if (accessBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccessIsMutable();
        access_.add(value);
        onChanged();
      } else {
        accessBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addAccess(
        int index, io.provenance.marker.v1.AccessGrant value) {
      if (accessBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccessIsMutable();
        access_.add(index, value);
        onChanged();
      } else {
        accessBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addAccess(
        io.provenance.marker.v1.AccessGrant.Builder builderForValue) {
      if (accessBuilder_ == null) {
        ensureAccessIsMutable();
        access_.add(builderForValue.build());
        onChanged();
      } else {
        accessBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addAccess(
        int index, io.provenance.marker.v1.AccessGrant.Builder builderForValue) {
      if (accessBuilder_ == null) {
        ensureAccessIsMutable();
        access_.add(index, builderForValue.build());
        onChanged();
      } else {
        accessBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addAllAccess(
        java.lang.Iterable<? extends io.provenance.marker.v1.AccessGrant> values) {
      if (accessBuilder_ == null) {
        ensureAccessIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, access_);
        onChanged();
      } else {
        accessBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [(.gogoproto.nullable) = false];</code>
     */
    public Builder clearAccess() {
      if (accessBuilder_ == null) {
        access_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        accessBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [(.gogoproto.nullable) = false];</code>
     */
    public Builder removeAccess(int index) {
      if (accessBuilder_ == null) {
        ensureAccessIsMutable();
        access_.remove(index);
        onChanged();
      } else {
        accessBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [(.gogoproto.nullable) = false];</code>
     */
    public io.provenance.marker.v1.AccessGrant.Builder getAccessBuilder(
        int index) {
      return getAccessFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [(.gogoproto.nullable) = false];</code>
     */
    public io.provenance.marker.v1.AccessGrantOrBuilder getAccessOrBuilder(
        int index) {
      if (accessBuilder_ == null) {
        return access_.get(index);  } else {
        return accessBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [(.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends io.provenance.marker.v1.AccessGrantOrBuilder> 
         getAccessOrBuilderList() {
      if (accessBuilder_ != null) {
        return accessBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(access_);
      }
    }
    /**
     * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [(.gogoproto.nullable) = false];</code>
     */
    public io.provenance.marker.v1.AccessGrant.Builder addAccessBuilder() {
      return getAccessFieldBuilder().addBuilder(
          io.provenance.marker.v1.AccessGrant.getDefaultInstance());
    }
    /**
     * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [(.gogoproto.nullable) = false];</code>
     */
    public io.provenance.marker.v1.AccessGrant.Builder addAccessBuilder(
        int index) {
      return getAccessFieldBuilder().addBuilder(
          index, io.provenance.marker.v1.AccessGrant.getDefaultInstance());
    }
    /**
     * <code>repeated .provenance.marker.v1.AccessGrant access = 3 [(.gogoproto.nullable) = false];</code>
     */
    public java.util.List<io.provenance.marker.v1.AccessGrant.Builder> 
         getAccessBuilderList() {
      return getAccessFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.provenance.marker.v1.AccessGrant, io.provenance.marker.v1.AccessGrant.Builder, io.provenance.marker.v1.AccessGrantOrBuilder> 
        getAccessFieldBuilder() {
      if (accessBuilder_ == null) {
        accessBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.provenance.marker.v1.AccessGrant, io.provenance.marker.v1.AccessGrant.Builder, io.provenance.marker.v1.AccessGrantOrBuilder>(
                access_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        access_ = null;
      }
      return accessBuilder_;
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


    // @@protoc_insertion_point(builder_scope:provenance.marker.v1.MsgAddAccessRequest)
  }

  // @@protoc_insertion_point(class_scope:provenance.marker.v1.MsgAddAccessRequest)
  private static final io.provenance.marker.v1.MsgAddAccessRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.provenance.marker.v1.MsgAddAccessRequest();
  }

  public static io.provenance.marker.v1.MsgAddAccessRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgAddAccessRequest>
      PARSER = new com.google.protobuf.AbstractParser<MsgAddAccessRequest>() {
    @java.lang.Override
    public MsgAddAccessRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MsgAddAccessRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MsgAddAccessRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgAddAccessRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.provenance.marker.v1.MsgAddAccessRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

