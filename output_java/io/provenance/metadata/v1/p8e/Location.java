// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/p8e/p8e.proto

package io.provenance.metadata.v1.p8e;

/**
 * Protobuf type {@code provenance.metadata.v1.p8e.Location}
 */
public final class Location extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.metadata.v1.p8e.Location)
    LocationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Location.newBuilder() to construct.
  private Location(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Location() {
    classname_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Location();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Location(
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
            io.provenance.metadata.v1.p8e.ProvenanceReference.Builder subBuilder = null;
            if (ref_ != null) {
              subBuilder = ref_.toBuilder();
            }
            ref_ = input.readMessage(io.provenance.metadata.v1.p8e.ProvenanceReference.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(ref_);
              ref_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            classname_ = s;
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
    return io.provenance.metadata.v1.p8e.P8E.internal_static_provenance_metadata_v1_p8e_Location_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.provenance.metadata.v1.p8e.P8E.internal_static_provenance_metadata_v1_p8e_Location_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.provenance.metadata.v1.p8e.Location.class, io.provenance.metadata.v1.p8e.Location.Builder.class);
  }

  public static final int REF_FIELD_NUMBER = 1;
  private io.provenance.metadata.v1.p8e.ProvenanceReference ref_;
  /**
   * <code>.provenance.metadata.v1.p8e.ProvenanceReference ref = 1;</code>
   * @return Whether the ref field is set.
   */
  @java.lang.Override
  public boolean hasRef() {
    return ref_ != null;
  }
  /**
   * <code>.provenance.metadata.v1.p8e.ProvenanceReference ref = 1;</code>
   * @return The ref.
   */
  @java.lang.Override
  public io.provenance.metadata.v1.p8e.ProvenanceReference getRef() {
    return ref_ == null ? io.provenance.metadata.v1.p8e.ProvenanceReference.getDefaultInstance() : ref_;
  }
  /**
   * <code>.provenance.metadata.v1.p8e.ProvenanceReference ref = 1;</code>
   */
  @java.lang.Override
  public io.provenance.metadata.v1.p8e.ProvenanceReferenceOrBuilder getRefOrBuilder() {
    return getRef();
  }

  public static final int CLASSNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object classname_;
  /**
   * <code>string classname = 2;</code>
   * @return The classname.
   */
  @java.lang.Override
  public java.lang.String getClassname() {
    java.lang.Object ref = classname_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      classname_ = s;
      return s;
    }
  }
  /**
   * <code>string classname = 2;</code>
   * @return The bytes for classname.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClassnameBytes() {
    java.lang.Object ref = classname_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      classname_ = b;
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
    if (ref_ != null) {
      output.writeMessage(1, getRef());
    }
    if (!getClassnameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, classname_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ref_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRef());
    }
    if (!getClassnameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, classname_);
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
    if (!(obj instanceof io.provenance.metadata.v1.p8e.Location)) {
      return super.equals(obj);
    }
    io.provenance.metadata.v1.p8e.Location other = (io.provenance.metadata.v1.p8e.Location) obj;

    if (hasRef() != other.hasRef()) return false;
    if (hasRef()) {
      if (!getRef()
          .equals(other.getRef())) return false;
    }
    if (!getClassname()
        .equals(other.getClassname())) return false;
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
    if (hasRef()) {
      hash = (37 * hash) + REF_FIELD_NUMBER;
      hash = (53 * hash) + getRef().hashCode();
    }
    hash = (37 * hash) + CLASSNAME_FIELD_NUMBER;
    hash = (53 * hash) + getClassname().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.provenance.metadata.v1.p8e.Location parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.p8e.Location parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.p8e.Location parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.p8e.Location parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.p8e.Location parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.p8e.Location parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.p8e.Location parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.p8e.Location parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.metadata.v1.p8e.Location parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.p8e.Location parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.metadata.v1.p8e.Location parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.p8e.Location parseFrom(
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
  public static Builder newBuilder(io.provenance.metadata.v1.p8e.Location prototype) {
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
   * Protobuf type {@code provenance.metadata.v1.p8e.Location}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.metadata.v1.p8e.Location)
      io.provenance.metadata.v1.p8e.LocationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.provenance.metadata.v1.p8e.P8E.internal_static_provenance_metadata_v1_p8e_Location_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.provenance.metadata.v1.p8e.P8E.internal_static_provenance_metadata_v1_p8e_Location_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.provenance.metadata.v1.p8e.Location.class, io.provenance.metadata.v1.p8e.Location.Builder.class);
    }

    // Construct using io.provenance.metadata.v1.p8e.Location.newBuilder()
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
      if (refBuilder_ == null) {
        ref_ = null;
      } else {
        ref_ = null;
        refBuilder_ = null;
      }
      classname_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.provenance.metadata.v1.p8e.P8E.internal_static_provenance_metadata_v1_p8e_Location_descriptor;
    }

    @java.lang.Override
    public io.provenance.metadata.v1.p8e.Location getDefaultInstanceForType() {
      return io.provenance.metadata.v1.p8e.Location.getDefaultInstance();
    }

    @java.lang.Override
    public io.provenance.metadata.v1.p8e.Location build() {
      io.provenance.metadata.v1.p8e.Location result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.provenance.metadata.v1.p8e.Location buildPartial() {
      io.provenance.metadata.v1.p8e.Location result = new io.provenance.metadata.v1.p8e.Location(this);
      if (refBuilder_ == null) {
        result.ref_ = ref_;
      } else {
        result.ref_ = refBuilder_.build();
      }
      result.classname_ = classname_;
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
      if (other instanceof io.provenance.metadata.v1.p8e.Location) {
        return mergeFrom((io.provenance.metadata.v1.p8e.Location)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.provenance.metadata.v1.p8e.Location other) {
      if (other == io.provenance.metadata.v1.p8e.Location.getDefaultInstance()) return this;
      if (other.hasRef()) {
        mergeRef(other.getRef());
      }
      if (!other.getClassname().isEmpty()) {
        classname_ = other.classname_;
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
      io.provenance.metadata.v1.p8e.Location parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.provenance.metadata.v1.p8e.Location) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.provenance.metadata.v1.p8e.ProvenanceReference ref_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.provenance.metadata.v1.p8e.ProvenanceReference, io.provenance.metadata.v1.p8e.ProvenanceReference.Builder, io.provenance.metadata.v1.p8e.ProvenanceReferenceOrBuilder> refBuilder_;
    /**
     * <code>.provenance.metadata.v1.p8e.ProvenanceReference ref = 1;</code>
     * @return Whether the ref field is set.
     */
    public boolean hasRef() {
      return refBuilder_ != null || ref_ != null;
    }
    /**
     * <code>.provenance.metadata.v1.p8e.ProvenanceReference ref = 1;</code>
     * @return The ref.
     */
    public io.provenance.metadata.v1.p8e.ProvenanceReference getRef() {
      if (refBuilder_ == null) {
        return ref_ == null ? io.provenance.metadata.v1.p8e.ProvenanceReference.getDefaultInstance() : ref_;
      } else {
        return refBuilder_.getMessage();
      }
    }
    /**
     * <code>.provenance.metadata.v1.p8e.ProvenanceReference ref = 1;</code>
     */
    public Builder setRef(io.provenance.metadata.v1.p8e.ProvenanceReference value) {
      if (refBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ref_ = value;
        onChanged();
      } else {
        refBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.provenance.metadata.v1.p8e.ProvenanceReference ref = 1;</code>
     */
    public Builder setRef(
        io.provenance.metadata.v1.p8e.ProvenanceReference.Builder builderForValue) {
      if (refBuilder_ == null) {
        ref_ = builderForValue.build();
        onChanged();
      } else {
        refBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.provenance.metadata.v1.p8e.ProvenanceReference ref = 1;</code>
     */
    public Builder mergeRef(io.provenance.metadata.v1.p8e.ProvenanceReference value) {
      if (refBuilder_ == null) {
        if (ref_ != null) {
          ref_ =
            io.provenance.metadata.v1.p8e.ProvenanceReference.newBuilder(ref_).mergeFrom(value).buildPartial();
        } else {
          ref_ = value;
        }
        onChanged();
      } else {
        refBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.provenance.metadata.v1.p8e.ProvenanceReference ref = 1;</code>
     */
    public Builder clearRef() {
      if (refBuilder_ == null) {
        ref_ = null;
        onChanged();
      } else {
        ref_ = null;
        refBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.provenance.metadata.v1.p8e.ProvenanceReference ref = 1;</code>
     */
    public io.provenance.metadata.v1.p8e.ProvenanceReference.Builder getRefBuilder() {
      
      onChanged();
      return getRefFieldBuilder().getBuilder();
    }
    /**
     * <code>.provenance.metadata.v1.p8e.ProvenanceReference ref = 1;</code>
     */
    public io.provenance.metadata.v1.p8e.ProvenanceReferenceOrBuilder getRefOrBuilder() {
      if (refBuilder_ != null) {
        return refBuilder_.getMessageOrBuilder();
      } else {
        return ref_ == null ?
            io.provenance.metadata.v1.p8e.ProvenanceReference.getDefaultInstance() : ref_;
      }
    }
    /**
     * <code>.provenance.metadata.v1.p8e.ProvenanceReference ref = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.provenance.metadata.v1.p8e.ProvenanceReference, io.provenance.metadata.v1.p8e.ProvenanceReference.Builder, io.provenance.metadata.v1.p8e.ProvenanceReferenceOrBuilder> 
        getRefFieldBuilder() {
      if (refBuilder_ == null) {
        refBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.provenance.metadata.v1.p8e.ProvenanceReference, io.provenance.metadata.v1.p8e.ProvenanceReference.Builder, io.provenance.metadata.v1.p8e.ProvenanceReferenceOrBuilder>(
                getRef(),
                getParentForChildren(),
                isClean());
        ref_ = null;
      }
      return refBuilder_;
    }

    private java.lang.Object classname_ = "";
    /**
     * <code>string classname = 2;</code>
     * @return The classname.
     */
    public java.lang.String getClassname() {
      java.lang.Object ref = classname_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        classname_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string classname = 2;</code>
     * @return The bytes for classname.
     */
    public com.google.protobuf.ByteString
        getClassnameBytes() {
      java.lang.Object ref = classname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        classname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string classname = 2;</code>
     * @param value The classname to set.
     * @return This builder for chaining.
     */
    public Builder setClassname(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      classname_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string classname = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearClassname() {
      
      classname_ = getDefaultInstance().getClassname();
      onChanged();
      return this;
    }
    /**
     * <code>string classname = 2;</code>
     * @param value The bytes for classname to set.
     * @return This builder for chaining.
     */
    public Builder setClassnameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      classname_ = value;
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


    // @@protoc_insertion_point(builder_scope:provenance.metadata.v1.p8e.Location)
  }

  // @@protoc_insertion_point(class_scope:provenance.metadata.v1.p8e.Location)
  private static final io.provenance.metadata.v1.p8e.Location DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.provenance.metadata.v1.p8e.Location();
  }

  public static io.provenance.metadata.v1.p8e.Location getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Location>
      PARSER = new com.google.protobuf.AbstractParser<Location>() {
    @java.lang.Override
    public Location parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Location(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Location> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Location> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.provenance.metadata.v1.p8e.Location getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

