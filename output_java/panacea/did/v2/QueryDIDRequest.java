// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/did/v2/query.proto

package panacea.did.v2;

/**
 * <pre>
 * QueryDIDRequest is the request type for the Query/DIDDocumentWithSeq RPC method.
 * </pre>
 *
 * Protobuf type {@code panacea.did.v2.QueryDIDRequest}
 */
public final class QueryDIDRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:panacea.did.v2.QueryDIDRequest)
    QueryDIDRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryDIDRequest.newBuilder() to construct.
  private QueryDIDRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryDIDRequest() {
    didBase64_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryDIDRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueryDIDRequest(
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

            didBase64_ = s;
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
    return panacea.did.v2.QueryOuterClass.internal_static_panacea_did_v2_QueryDIDRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return panacea.did.v2.QueryOuterClass.internal_static_panacea_did_v2_QueryDIDRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            panacea.did.v2.QueryDIDRequest.class, panacea.did.v2.QueryDIDRequest.Builder.class);
  }

  public static final int DID_BASE64_FIELD_NUMBER = 1;
  private volatile java.lang.Object didBase64_;
  /**
   * <pre>
   * NOTE: Using base64 due to the URI path cannot contain colons.
   * </pre>
   *
   * <code>string did_base64 = 1;</code>
   * @return The didBase64.
   */
  @java.lang.Override
  public java.lang.String getDidBase64() {
    java.lang.Object ref = didBase64_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      didBase64_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * NOTE: Using base64 due to the URI path cannot contain colons.
   * </pre>
   *
   * <code>string did_base64 = 1;</code>
   * @return The bytes for didBase64.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDidBase64Bytes() {
    java.lang.Object ref = didBase64_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      didBase64_ = b;
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
    if (!getDidBase64Bytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, didBase64_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDidBase64Bytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, didBase64_);
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
    if (!(obj instanceof panacea.did.v2.QueryDIDRequest)) {
      return super.equals(obj);
    }
    panacea.did.v2.QueryDIDRequest other = (panacea.did.v2.QueryDIDRequest) obj;

    if (!getDidBase64()
        .equals(other.getDidBase64())) return false;
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
    hash = (37 * hash) + DID_BASE64_FIELD_NUMBER;
    hash = (53 * hash) + getDidBase64().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static panacea.did.v2.QueryDIDRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static panacea.did.v2.QueryDIDRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static panacea.did.v2.QueryDIDRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static panacea.did.v2.QueryDIDRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static panacea.did.v2.QueryDIDRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static panacea.did.v2.QueryDIDRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static panacea.did.v2.QueryDIDRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static panacea.did.v2.QueryDIDRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static panacea.did.v2.QueryDIDRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static panacea.did.v2.QueryDIDRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static panacea.did.v2.QueryDIDRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static panacea.did.v2.QueryDIDRequest parseFrom(
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
  public static Builder newBuilder(panacea.did.v2.QueryDIDRequest prototype) {
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
   * QueryDIDRequest is the request type for the Query/DIDDocumentWithSeq RPC method.
   * </pre>
   *
   * Protobuf type {@code panacea.did.v2.QueryDIDRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:panacea.did.v2.QueryDIDRequest)
      panacea.did.v2.QueryDIDRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return panacea.did.v2.QueryOuterClass.internal_static_panacea_did_v2_QueryDIDRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return panacea.did.v2.QueryOuterClass.internal_static_panacea_did_v2_QueryDIDRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              panacea.did.v2.QueryDIDRequest.class, panacea.did.v2.QueryDIDRequest.Builder.class);
    }

    // Construct using panacea.did.v2.QueryDIDRequest.newBuilder()
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
      didBase64_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return panacea.did.v2.QueryOuterClass.internal_static_panacea_did_v2_QueryDIDRequest_descriptor;
    }

    @java.lang.Override
    public panacea.did.v2.QueryDIDRequest getDefaultInstanceForType() {
      return panacea.did.v2.QueryDIDRequest.getDefaultInstance();
    }

    @java.lang.Override
    public panacea.did.v2.QueryDIDRequest build() {
      panacea.did.v2.QueryDIDRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public panacea.did.v2.QueryDIDRequest buildPartial() {
      panacea.did.v2.QueryDIDRequest result = new panacea.did.v2.QueryDIDRequest(this);
      result.didBase64_ = didBase64_;
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
      if (other instanceof panacea.did.v2.QueryDIDRequest) {
        return mergeFrom((panacea.did.v2.QueryDIDRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(panacea.did.v2.QueryDIDRequest other) {
      if (other == panacea.did.v2.QueryDIDRequest.getDefaultInstance()) return this;
      if (!other.getDidBase64().isEmpty()) {
        didBase64_ = other.didBase64_;
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
      panacea.did.v2.QueryDIDRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (panacea.did.v2.QueryDIDRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object didBase64_ = "";
    /**
     * <pre>
     * NOTE: Using base64 due to the URI path cannot contain colons.
     * </pre>
     *
     * <code>string did_base64 = 1;</code>
     * @return The didBase64.
     */
    public java.lang.String getDidBase64() {
      java.lang.Object ref = didBase64_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        didBase64_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * NOTE: Using base64 due to the URI path cannot contain colons.
     * </pre>
     *
     * <code>string did_base64 = 1;</code>
     * @return The bytes for didBase64.
     */
    public com.google.protobuf.ByteString
        getDidBase64Bytes() {
      java.lang.Object ref = didBase64_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        didBase64_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * NOTE: Using base64 due to the URI path cannot contain colons.
     * </pre>
     *
     * <code>string did_base64 = 1;</code>
     * @param value The didBase64 to set.
     * @return This builder for chaining.
     */
    public Builder setDidBase64(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      didBase64_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * NOTE: Using base64 due to the URI path cannot contain colons.
     * </pre>
     *
     * <code>string did_base64 = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDidBase64() {
      
      didBase64_ = getDefaultInstance().getDidBase64();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * NOTE: Using base64 due to the URI path cannot contain colons.
     * </pre>
     *
     * <code>string did_base64 = 1;</code>
     * @param value The bytes for didBase64 to set.
     * @return This builder for chaining.
     */
    public Builder setDidBase64Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      didBase64_ = value;
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


    // @@protoc_insertion_point(builder_scope:panacea.did.v2.QueryDIDRequest)
  }

  // @@protoc_insertion_point(class_scope:panacea.did.v2.QueryDIDRequest)
  private static final panacea.did.v2.QueryDIDRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new panacea.did.v2.QueryDIDRequest();
  }

  public static panacea.did.v2.QueryDIDRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryDIDRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryDIDRequest>() {
    @java.lang.Override
    public QueryDIDRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueryDIDRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryDIDRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryDIDRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public panacea.did.v2.QueryDIDRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

