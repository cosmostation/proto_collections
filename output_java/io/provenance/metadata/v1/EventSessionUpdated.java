// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/events.proto

package io.provenance.metadata.v1;

/**
 * <pre>
 * EventSessionUpdated is an event message indicating a session has been updated.
 * </pre>
 *
 * Protobuf type {@code provenance.metadata.v1.EventSessionUpdated}
 */
public final class EventSessionUpdated extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.metadata.v1.EventSessionUpdated)
    EventSessionUpdatedOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventSessionUpdated.newBuilder() to construct.
  private EventSessionUpdated(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventSessionUpdated() {
    sessionAddr_ = "";
    scopeAddr_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EventSessionUpdated();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EventSessionUpdated(
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

            sessionAddr_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            scopeAddr_ = s;
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
    return io.provenance.metadata.v1.Events.internal_static_provenance_metadata_v1_EventSessionUpdated_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.provenance.metadata.v1.Events.internal_static_provenance_metadata_v1_EventSessionUpdated_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.provenance.metadata.v1.EventSessionUpdated.class, io.provenance.metadata.v1.EventSessionUpdated.Builder.class);
  }

  public static final int SESSION_ADDR_FIELD_NUMBER = 1;
  private volatile java.lang.Object sessionAddr_;
  /**
   * <pre>
   * session_addr is the bech32 address string of the session id that was updated.
   * </pre>
   *
   * <code>string session_addr = 1;</code>
   * @return The sessionAddr.
   */
  @java.lang.Override
  public java.lang.String getSessionAddr() {
    java.lang.Object ref = sessionAddr_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sessionAddr_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * session_addr is the bech32 address string of the session id that was updated.
   * </pre>
   *
   * <code>string session_addr = 1;</code>
   * @return The bytes for sessionAddr.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSessionAddrBytes() {
    java.lang.Object ref = sessionAddr_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sessionAddr_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SCOPE_ADDR_FIELD_NUMBER = 2;
  private volatile java.lang.Object scopeAddr_;
  /**
   * <pre>
   * scope_addr is the bech32 address string of the scope id this session belongs to.
   * </pre>
   *
   * <code>string scope_addr = 2;</code>
   * @return The scopeAddr.
   */
  @java.lang.Override
  public java.lang.String getScopeAddr() {
    java.lang.Object ref = scopeAddr_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      scopeAddr_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * scope_addr is the bech32 address string of the scope id this session belongs to.
   * </pre>
   *
   * <code>string scope_addr = 2;</code>
   * @return The bytes for scopeAddr.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getScopeAddrBytes() {
    java.lang.Object ref = scopeAddr_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      scopeAddr_ = b;
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
    if (!getSessionAddrBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sessionAddr_);
    }
    if (!getScopeAddrBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, scopeAddr_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSessionAddrBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sessionAddr_);
    }
    if (!getScopeAddrBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, scopeAddr_);
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
    if (!(obj instanceof io.provenance.metadata.v1.EventSessionUpdated)) {
      return super.equals(obj);
    }
    io.provenance.metadata.v1.EventSessionUpdated other = (io.provenance.metadata.v1.EventSessionUpdated) obj;

    if (!getSessionAddr()
        .equals(other.getSessionAddr())) return false;
    if (!getScopeAddr()
        .equals(other.getScopeAddr())) return false;
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
    hash = (37 * hash) + SESSION_ADDR_FIELD_NUMBER;
    hash = (53 * hash) + getSessionAddr().hashCode();
    hash = (37 * hash) + SCOPE_ADDR_FIELD_NUMBER;
    hash = (53 * hash) + getScopeAddr().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.provenance.metadata.v1.EventSessionUpdated parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.EventSessionUpdated parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.EventSessionUpdated parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.EventSessionUpdated parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.EventSessionUpdated parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.EventSessionUpdated parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.EventSessionUpdated parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.EventSessionUpdated parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.metadata.v1.EventSessionUpdated parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.EventSessionUpdated parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.metadata.v1.EventSessionUpdated parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.EventSessionUpdated parseFrom(
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
  public static Builder newBuilder(io.provenance.metadata.v1.EventSessionUpdated prototype) {
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
   * EventSessionUpdated is an event message indicating a session has been updated.
   * </pre>
   *
   * Protobuf type {@code provenance.metadata.v1.EventSessionUpdated}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.metadata.v1.EventSessionUpdated)
      io.provenance.metadata.v1.EventSessionUpdatedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.provenance.metadata.v1.Events.internal_static_provenance_metadata_v1_EventSessionUpdated_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.provenance.metadata.v1.Events.internal_static_provenance_metadata_v1_EventSessionUpdated_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.provenance.metadata.v1.EventSessionUpdated.class, io.provenance.metadata.v1.EventSessionUpdated.Builder.class);
    }

    // Construct using io.provenance.metadata.v1.EventSessionUpdated.newBuilder()
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
      sessionAddr_ = "";

      scopeAddr_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.provenance.metadata.v1.Events.internal_static_provenance_metadata_v1_EventSessionUpdated_descriptor;
    }

    @java.lang.Override
    public io.provenance.metadata.v1.EventSessionUpdated getDefaultInstanceForType() {
      return io.provenance.metadata.v1.EventSessionUpdated.getDefaultInstance();
    }

    @java.lang.Override
    public io.provenance.metadata.v1.EventSessionUpdated build() {
      io.provenance.metadata.v1.EventSessionUpdated result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.provenance.metadata.v1.EventSessionUpdated buildPartial() {
      io.provenance.metadata.v1.EventSessionUpdated result = new io.provenance.metadata.v1.EventSessionUpdated(this);
      result.sessionAddr_ = sessionAddr_;
      result.scopeAddr_ = scopeAddr_;
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
      if (other instanceof io.provenance.metadata.v1.EventSessionUpdated) {
        return mergeFrom((io.provenance.metadata.v1.EventSessionUpdated)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.provenance.metadata.v1.EventSessionUpdated other) {
      if (other == io.provenance.metadata.v1.EventSessionUpdated.getDefaultInstance()) return this;
      if (!other.getSessionAddr().isEmpty()) {
        sessionAddr_ = other.sessionAddr_;
        onChanged();
      }
      if (!other.getScopeAddr().isEmpty()) {
        scopeAddr_ = other.scopeAddr_;
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
      io.provenance.metadata.v1.EventSessionUpdated parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.provenance.metadata.v1.EventSessionUpdated) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object sessionAddr_ = "";
    /**
     * <pre>
     * session_addr is the bech32 address string of the session id that was updated.
     * </pre>
     *
     * <code>string session_addr = 1;</code>
     * @return The sessionAddr.
     */
    public java.lang.String getSessionAddr() {
      java.lang.Object ref = sessionAddr_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sessionAddr_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * session_addr is the bech32 address string of the session id that was updated.
     * </pre>
     *
     * <code>string session_addr = 1;</code>
     * @return The bytes for sessionAddr.
     */
    public com.google.protobuf.ByteString
        getSessionAddrBytes() {
      java.lang.Object ref = sessionAddr_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sessionAddr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * session_addr is the bech32 address string of the session id that was updated.
     * </pre>
     *
     * <code>string session_addr = 1;</code>
     * @param value The sessionAddr to set.
     * @return This builder for chaining.
     */
    public Builder setSessionAddr(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sessionAddr_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * session_addr is the bech32 address string of the session id that was updated.
     * </pre>
     *
     * <code>string session_addr = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSessionAddr() {
      
      sessionAddr_ = getDefaultInstance().getSessionAddr();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * session_addr is the bech32 address string of the session id that was updated.
     * </pre>
     *
     * <code>string session_addr = 1;</code>
     * @param value The bytes for sessionAddr to set.
     * @return This builder for chaining.
     */
    public Builder setSessionAddrBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sessionAddr_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object scopeAddr_ = "";
    /**
     * <pre>
     * scope_addr is the bech32 address string of the scope id this session belongs to.
     * </pre>
     *
     * <code>string scope_addr = 2;</code>
     * @return The scopeAddr.
     */
    public java.lang.String getScopeAddr() {
      java.lang.Object ref = scopeAddr_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        scopeAddr_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * scope_addr is the bech32 address string of the scope id this session belongs to.
     * </pre>
     *
     * <code>string scope_addr = 2;</code>
     * @return The bytes for scopeAddr.
     */
    public com.google.protobuf.ByteString
        getScopeAddrBytes() {
      java.lang.Object ref = scopeAddr_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        scopeAddr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * scope_addr is the bech32 address string of the scope id this session belongs to.
     * </pre>
     *
     * <code>string scope_addr = 2;</code>
     * @param value The scopeAddr to set.
     * @return This builder for chaining.
     */
    public Builder setScopeAddr(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      scopeAddr_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * scope_addr is the bech32 address string of the scope id this session belongs to.
     * </pre>
     *
     * <code>string scope_addr = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearScopeAddr() {
      
      scopeAddr_ = getDefaultInstance().getScopeAddr();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * scope_addr is the bech32 address string of the scope id this session belongs to.
     * </pre>
     *
     * <code>string scope_addr = 2;</code>
     * @param value The bytes for scopeAddr to set.
     * @return This builder for chaining.
     */
    public Builder setScopeAddrBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      scopeAddr_ = value;
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


    // @@protoc_insertion_point(builder_scope:provenance.metadata.v1.EventSessionUpdated)
  }

  // @@protoc_insertion_point(class_scope:provenance.metadata.v1.EventSessionUpdated)
  private static final io.provenance.metadata.v1.EventSessionUpdated DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.provenance.metadata.v1.EventSessionUpdated();
  }

  public static io.provenance.metadata.v1.EventSessionUpdated getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventSessionUpdated>
      PARSER = new com.google.protobuf.AbstractParser<EventSessionUpdated>() {
    @java.lang.Override
    public EventSessionUpdated parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EventSessionUpdated(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EventSessionUpdated> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventSessionUpdated> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.provenance.metadata.v1.EventSessionUpdated getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

