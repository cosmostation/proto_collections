// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/specification.proto

package io.provenance.metadata.v1;

/**
 * <pre>
 * Description holds general information that is handy to associate with a structure.
 * </pre>
 *
 * Protobuf type {@code provenance.metadata.v1.Description}
 */
public final class Description extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.metadata.v1.Description)
    DescriptionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Description.newBuilder() to construct.
  private Description(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Description() {
    name_ = "";
    description_ = "";
    websiteUrl_ = "";
    iconUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Description();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Description(
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

            name_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            description_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            websiteUrl_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            iconUrl_ = s;
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
    return io.provenance.metadata.v1.Specification.internal_static_provenance_metadata_v1_Description_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.provenance.metadata.v1.Specification.internal_static_provenance_metadata_v1_Description_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.provenance.metadata.v1.Description.class, io.provenance.metadata.v1.Description.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * A Name for this thing.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A Name for this thing.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 3;
  private volatile java.lang.Object description_;
  /**
   * <pre>
   * A description of this thing.
   * </pre>
   *
   * <code>string description = 3;</code>
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
   * <pre>
   * A description of this thing.
   * </pre>
   *
   * <code>string description = 3;</code>
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

  public static final int WEBSITE_URL_FIELD_NUMBER = 4;
  private volatile java.lang.Object websiteUrl_;
  /**
   * <pre>
   * URL to find even more info.
   * </pre>
   *
   * <code>string website_url = 4 [(.gogoproto.moretags) = "yaml:&#92;"website_url&#92;""];</code>
   * @return The websiteUrl.
   */
  @java.lang.Override
  public java.lang.String getWebsiteUrl() {
    java.lang.Object ref = websiteUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      websiteUrl_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * URL to find even more info.
   * </pre>
   *
   * <code>string website_url = 4 [(.gogoproto.moretags) = "yaml:&#92;"website_url&#92;""];</code>
   * @return The bytes for websiteUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getWebsiteUrlBytes() {
    java.lang.Object ref = websiteUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      websiteUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ICON_URL_FIELD_NUMBER = 5;
  private volatile java.lang.Object iconUrl_;
  /**
   * <pre>
   * URL of an icon.
   * </pre>
   *
   * <code>string icon_url = 5 [(.gogoproto.moretags) = "yaml:&#92;"icon_url&#92;""];</code>
   * @return The iconUrl.
   */
  @java.lang.Override
  public java.lang.String getIconUrl() {
    java.lang.Object ref = iconUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      iconUrl_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * URL of an icon.
   * </pre>
   *
   * <code>string icon_url = 5 [(.gogoproto.moretags) = "yaml:&#92;"icon_url&#92;""];</code>
   * @return The bytes for iconUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIconUrlBytes() {
    java.lang.Object ref = iconUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      iconUrl_ = b;
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, description_);
    }
    if (!getWebsiteUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, websiteUrl_);
    }
    if (!getIconUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, iconUrl_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, description_);
    }
    if (!getWebsiteUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, websiteUrl_);
    }
    if (!getIconUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, iconUrl_);
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
    if (!(obj instanceof io.provenance.metadata.v1.Description)) {
      return super.equals(obj);
    }
    io.provenance.metadata.v1.Description other = (io.provenance.metadata.v1.Description) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (!getWebsiteUrl()
        .equals(other.getWebsiteUrl())) return false;
    if (!getIconUrl()
        .equals(other.getIconUrl())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + WEBSITE_URL_FIELD_NUMBER;
    hash = (53 * hash) + getWebsiteUrl().hashCode();
    hash = (37 * hash) + ICON_URL_FIELD_NUMBER;
    hash = (53 * hash) + getIconUrl().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.provenance.metadata.v1.Description parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.Description parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.Description parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.Description parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.Description parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.Description parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.Description parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.Description parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.metadata.v1.Description parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.Description parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.metadata.v1.Description parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.Description parseFrom(
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
  public static Builder newBuilder(io.provenance.metadata.v1.Description prototype) {
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
   * Description holds general information that is handy to associate with a structure.
   * </pre>
   *
   * Protobuf type {@code provenance.metadata.v1.Description}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.metadata.v1.Description)
      io.provenance.metadata.v1.DescriptionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.provenance.metadata.v1.Specification.internal_static_provenance_metadata_v1_Description_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.provenance.metadata.v1.Specification.internal_static_provenance_metadata_v1_Description_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.provenance.metadata.v1.Description.class, io.provenance.metadata.v1.Description.Builder.class);
    }

    // Construct using io.provenance.metadata.v1.Description.newBuilder()
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
      name_ = "";

      description_ = "";

      websiteUrl_ = "";

      iconUrl_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.provenance.metadata.v1.Specification.internal_static_provenance_metadata_v1_Description_descriptor;
    }

    @java.lang.Override
    public io.provenance.metadata.v1.Description getDefaultInstanceForType() {
      return io.provenance.metadata.v1.Description.getDefaultInstance();
    }

    @java.lang.Override
    public io.provenance.metadata.v1.Description build() {
      io.provenance.metadata.v1.Description result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.provenance.metadata.v1.Description buildPartial() {
      io.provenance.metadata.v1.Description result = new io.provenance.metadata.v1.Description(this);
      result.name_ = name_;
      result.description_ = description_;
      result.websiteUrl_ = websiteUrl_;
      result.iconUrl_ = iconUrl_;
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
      if (other instanceof io.provenance.metadata.v1.Description) {
        return mergeFrom((io.provenance.metadata.v1.Description)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.provenance.metadata.v1.Description other) {
      if (other == io.provenance.metadata.v1.Description.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      if (!other.getWebsiteUrl().isEmpty()) {
        websiteUrl_ = other.websiteUrl_;
        onChanged();
      }
      if (!other.getIconUrl().isEmpty()) {
        iconUrl_ = other.iconUrl_;
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
      io.provenance.metadata.v1.Description parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.provenance.metadata.v1.Description) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * A Name for this thing.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A Name for this thing.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A Name for this thing.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A Name for this thing.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A Name for this thing.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <pre>
     * A description of this thing.
     * </pre>
     *
     * <code>string description = 3;</code>
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
     * <pre>
     * A description of this thing.
     * </pre>
     *
     * <code>string description = 3;</code>
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
     * <pre>
     * A description of this thing.
     * </pre>
     *
     * <code>string description = 3;</code>
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
     * <pre>
     * A description of this thing.
     * </pre>
     *
     * <code>string description = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A description of this thing.
     * </pre>
     *
     * <code>string description = 3;</code>
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

    private java.lang.Object websiteUrl_ = "";
    /**
     * <pre>
     * URL to find even more info.
     * </pre>
     *
     * <code>string website_url = 4 [(.gogoproto.moretags) = "yaml:&#92;"website_url&#92;""];</code>
     * @return The websiteUrl.
     */
    public java.lang.String getWebsiteUrl() {
      java.lang.Object ref = websiteUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        websiteUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * URL to find even more info.
     * </pre>
     *
     * <code>string website_url = 4 [(.gogoproto.moretags) = "yaml:&#92;"website_url&#92;""];</code>
     * @return The bytes for websiteUrl.
     */
    public com.google.protobuf.ByteString
        getWebsiteUrlBytes() {
      java.lang.Object ref = websiteUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        websiteUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * URL to find even more info.
     * </pre>
     *
     * <code>string website_url = 4 [(.gogoproto.moretags) = "yaml:&#92;"website_url&#92;""];</code>
     * @param value The websiteUrl to set.
     * @return This builder for chaining.
     */
    public Builder setWebsiteUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      websiteUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * URL to find even more info.
     * </pre>
     *
     * <code>string website_url = 4 [(.gogoproto.moretags) = "yaml:&#92;"website_url&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearWebsiteUrl() {
      
      websiteUrl_ = getDefaultInstance().getWebsiteUrl();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * URL to find even more info.
     * </pre>
     *
     * <code>string website_url = 4 [(.gogoproto.moretags) = "yaml:&#92;"website_url&#92;""];</code>
     * @param value The bytes for websiteUrl to set.
     * @return This builder for chaining.
     */
    public Builder setWebsiteUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      websiteUrl_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object iconUrl_ = "";
    /**
     * <pre>
     * URL of an icon.
     * </pre>
     *
     * <code>string icon_url = 5 [(.gogoproto.moretags) = "yaml:&#92;"icon_url&#92;""];</code>
     * @return The iconUrl.
     */
    public java.lang.String getIconUrl() {
      java.lang.Object ref = iconUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        iconUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * URL of an icon.
     * </pre>
     *
     * <code>string icon_url = 5 [(.gogoproto.moretags) = "yaml:&#92;"icon_url&#92;""];</code>
     * @return The bytes for iconUrl.
     */
    public com.google.protobuf.ByteString
        getIconUrlBytes() {
      java.lang.Object ref = iconUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        iconUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * URL of an icon.
     * </pre>
     *
     * <code>string icon_url = 5 [(.gogoproto.moretags) = "yaml:&#92;"icon_url&#92;""];</code>
     * @param value The iconUrl to set.
     * @return This builder for chaining.
     */
    public Builder setIconUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      iconUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * URL of an icon.
     * </pre>
     *
     * <code>string icon_url = 5 [(.gogoproto.moretags) = "yaml:&#92;"icon_url&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearIconUrl() {
      
      iconUrl_ = getDefaultInstance().getIconUrl();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * URL of an icon.
     * </pre>
     *
     * <code>string icon_url = 5 [(.gogoproto.moretags) = "yaml:&#92;"icon_url&#92;""];</code>
     * @param value The bytes for iconUrl to set.
     * @return This builder for chaining.
     */
    public Builder setIconUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      iconUrl_ = value;
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


    // @@protoc_insertion_point(builder_scope:provenance.metadata.v1.Description)
  }

  // @@protoc_insertion_point(class_scope:provenance.metadata.v1.Description)
  private static final io.provenance.metadata.v1.Description DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.provenance.metadata.v1.Description();
  }

  public static io.provenance.metadata.v1.Description getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Description>
      PARSER = new com.google.protobuf.AbstractParser<Description>() {
    @java.lang.Override
    public Description parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Description(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Description> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Description> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.provenance.metadata.v1.Description getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

