// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/specification.proto

package io.provenance.metadata.v1;

/**
 * <pre>
 * InputSpecification defines a name, type_name, and source reference (either on or off chain) to define an input
 * parameter
 * </pre>
 *
 * Protobuf type {@code provenance.metadata.v1.InputSpecification}
 */
public final class InputSpecification extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.metadata.v1.InputSpecification)
    InputSpecificationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InputSpecification.newBuilder() to construct.
  private InputSpecification(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InputSpecification() {
    name_ = "";
    typeName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InputSpecification();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InputSpecification(
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
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            typeName_ = s;
            break;
          }
          case 26: {
            sourceCase_ = 3;
            source_ = input.readBytes();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();
            sourceCase_ = 4;
            source_ = s;
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
    return io.provenance.metadata.v1.Specification.internal_static_provenance_metadata_v1_InputSpecification_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.provenance.metadata.v1.Specification.internal_static_provenance_metadata_v1_InputSpecification_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.provenance.metadata.v1.InputSpecification.class, io.provenance.metadata.v1.InputSpecification.Builder.class);
  }

  private int sourceCase_ = 0;
  private java.lang.Object source_;
  public enum SourceCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    RECORD_ID(3),
    HASH(4),
    SOURCE_NOT_SET(0);
    private final int value;
    private SourceCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SourceCase valueOf(int value) {
      return forNumber(value);
    }

    public static SourceCase forNumber(int value) {
      switch (value) {
        case 3: return RECORD_ID;
        case 4: return HASH;
        case 0: return SOURCE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public SourceCase
  getSourceCase() {
    return SourceCase.forNumber(
        sourceCase_);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * name for this input
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
   * name for this input
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

  public static final int TYPE_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object typeName_;
  /**
   * <pre>
   * a type_name (typically a proto name or class_name)
   * </pre>
   *
   * <code>string type_name = 2 [(.gogoproto.moretags) = "yaml:&#92;"type_name&#92;""];</code>
   * @return The typeName.
   */
  @java.lang.Override
  public java.lang.String getTypeName() {
    java.lang.Object ref = typeName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      typeName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * a type_name (typically a proto name or class_name)
   * </pre>
   *
   * <code>string type_name = 2 [(.gogoproto.moretags) = "yaml:&#92;"type_name&#92;""];</code>
   * @return The bytes for typeName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTypeNameBytes() {
    java.lang.Object ref = typeName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      typeName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RECORD_ID_FIELD_NUMBER = 3;
  /**
   * <pre>
   * the address of a record on chain (For Established Records)
   * </pre>
   *
   * <code>bytes record_id = 3 [(.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"record_id&#92;""];</code>
   * @return Whether the recordId field is set.
   */
  @java.lang.Override
  public boolean hasRecordId() {
    return sourceCase_ == 3;
  }
  /**
   * <pre>
   * the address of a record on chain (For Established Records)
   * </pre>
   *
   * <code>bytes record_id = 3 [(.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"record_id&#92;""];</code>
   * @return The recordId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRecordId() {
    if (sourceCase_ == 3) {
      return (com.google.protobuf.ByteString) source_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int HASH_FIELD_NUMBER = 4;
  /**
   * <pre>
   * the hash of an off-chain piece of information (For Proposed Records)
   * </pre>
   *
   * <code>string hash = 4;</code>
   * @return Whether the hash field is set.
   */
  public boolean hasHash() {
    return sourceCase_ == 4;
  }
  /**
   * <pre>
   * the hash of an off-chain piece of information (For Proposed Records)
   * </pre>
   *
   * <code>string hash = 4;</code>
   * @return The hash.
   */
  public java.lang.String getHash() {
    java.lang.Object ref = "";
    if (sourceCase_ == 4) {
      ref = source_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (sourceCase_ == 4) {
        source_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * the hash of an off-chain piece of information (For Proposed Records)
   * </pre>
   *
   * <code>string hash = 4;</code>
   * @return The bytes for hash.
   */
  public com.google.protobuf.ByteString
      getHashBytes() {
    java.lang.Object ref = "";
    if (sourceCase_ == 4) {
      ref = source_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (sourceCase_ == 4) {
        source_ = b;
      }
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
    if (!getTypeNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, typeName_);
    }
    if (sourceCase_ == 3) {
      output.writeBytes(
          3, (com.google.protobuf.ByteString) source_);
    }
    if (sourceCase_ == 4) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, source_);
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
    if (!getTypeNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, typeName_);
    }
    if (sourceCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            3, (com.google.protobuf.ByteString) source_);
    }
    if (sourceCase_ == 4) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, source_);
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
    if (!(obj instanceof io.provenance.metadata.v1.InputSpecification)) {
      return super.equals(obj);
    }
    io.provenance.metadata.v1.InputSpecification other = (io.provenance.metadata.v1.InputSpecification) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getTypeName()
        .equals(other.getTypeName())) return false;
    if (!getSourceCase().equals(other.getSourceCase())) return false;
    switch (sourceCase_) {
      case 3:
        if (!getRecordId()
            .equals(other.getRecordId())) return false;
        break;
      case 4:
        if (!getHash()
            .equals(other.getHash())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + TYPE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getTypeName().hashCode();
    switch (sourceCase_) {
      case 3:
        hash = (37 * hash) + RECORD_ID_FIELD_NUMBER;
        hash = (53 * hash) + getRecordId().hashCode();
        break;
      case 4:
        hash = (37 * hash) + HASH_FIELD_NUMBER;
        hash = (53 * hash) + getHash().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.provenance.metadata.v1.InputSpecification parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.InputSpecification parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.InputSpecification parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.InputSpecification parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.InputSpecification parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.InputSpecification parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.InputSpecification parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.InputSpecification parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.metadata.v1.InputSpecification parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.InputSpecification parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.metadata.v1.InputSpecification parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.InputSpecification parseFrom(
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
  public static Builder newBuilder(io.provenance.metadata.v1.InputSpecification prototype) {
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
   * InputSpecification defines a name, type_name, and source reference (either on or off chain) to define an input
   * parameter
   * </pre>
   *
   * Protobuf type {@code provenance.metadata.v1.InputSpecification}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.metadata.v1.InputSpecification)
      io.provenance.metadata.v1.InputSpecificationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.provenance.metadata.v1.Specification.internal_static_provenance_metadata_v1_InputSpecification_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.provenance.metadata.v1.Specification.internal_static_provenance_metadata_v1_InputSpecification_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.provenance.metadata.v1.InputSpecification.class, io.provenance.metadata.v1.InputSpecification.Builder.class);
    }

    // Construct using io.provenance.metadata.v1.InputSpecification.newBuilder()
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

      typeName_ = "";

      sourceCase_ = 0;
      source_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.provenance.metadata.v1.Specification.internal_static_provenance_metadata_v1_InputSpecification_descriptor;
    }

    @java.lang.Override
    public io.provenance.metadata.v1.InputSpecification getDefaultInstanceForType() {
      return io.provenance.metadata.v1.InputSpecification.getDefaultInstance();
    }

    @java.lang.Override
    public io.provenance.metadata.v1.InputSpecification build() {
      io.provenance.metadata.v1.InputSpecification result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.provenance.metadata.v1.InputSpecification buildPartial() {
      io.provenance.metadata.v1.InputSpecification result = new io.provenance.metadata.v1.InputSpecification(this);
      result.name_ = name_;
      result.typeName_ = typeName_;
      if (sourceCase_ == 3) {
        result.source_ = source_;
      }
      if (sourceCase_ == 4) {
        result.source_ = source_;
      }
      result.sourceCase_ = sourceCase_;
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
      if (other instanceof io.provenance.metadata.v1.InputSpecification) {
        return mergeFrom((io.provenance.metadata.v1.InputSpecification)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.provenance.metadata.v1.InputSpecification other) {
      if (other == io.provenance.metadata.v1.InputSpecification.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getTypeName().isEmpty()) {
        typeName_ = other.typeName_;
        onChanged();
      }
      switch (other.getSourceCase()) {
        case RECORD_ID: {
          setRecordId(other.getRecordId());
          break;
        }
        case HASH: {
          sourceCase_ = 4;
          source_ = other.source_;
          onChanged();
          break;
        }
        case SOURCE_NOT_SET: {
          break;
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
      io.provenance.metadata.v1.InputSpecification parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.provenance.metadata.v1.InputSpecification) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int sourceCase_ = 0;
    private java.lang.Object source_;
    public SourceCase
        getSourceCase() {
      return SourceCase.forNumber(
          sourceCase_);
    }

    public Builder clearSource() {
      sourceCase_ = 0;
      source_ = null;
      onChanged();
      return this;
    }


    private java.lang.Object name_ = "";
    /**
     * <pre>
     * name for this input
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
     * name for this input
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
     * name for this input
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
     * name for this input
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
     * name for this input
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

    private java.lang.Object typeName_ = "";
    /**
     * <pre>
     * a type_name (typically a proto name or class_name)
     * </pre>
     *
     * <code>string type_name = 2 [(.gogoproto.moretags) = "yaml:&#92;"type_name&#92;""];</code>
     * @return The typeName.
     */
    public java.lang.String getTypeName() {
      java.lang.Object ref = typeName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        typeName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * a type_name (typically a proto name or class_name)
     * </pre>
     *
     * <code>string type_name = 2 [(.gogoproto.moretags) = "yaml:&#92;"type_name&#92;""];</code>
     * @return The bytes for typeName.
     */
    public com.google.protobuf.ByteString
        getTypeNameBytes() {
      java.lang.Object ref = typeName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        typeName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * a type_name (typically a proto name or class_name)
     * </pre>
     *
     * <code>string type_name = 2 [(.gogoproto.moretags) = "yaml:&#92;"type_name&#92;""];</code>
     * @param value The typeName to set.
     * @return This builder for chaining.
     */
    public Builder setTypeName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      typeName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * a type_name (typically a proto name or class_name)
     * </pre>
     *
     * <code>string type_name = 2 [(.gogoproto.moretags) = "yaml:&#92;"type_name&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearTypeName() {
      
      typeName_ = getDefaultInstance().getTypeName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * a type_name (typically a proto name or class_name)
     * </pre>
     *
     * <code>string type_name = 2 [(.gogoproto.moretags) = "yaml:&#92;"type_name&#92;""];</code>
     * @param value The bytes for typeName to set.
     * @return This builder for chaining.
     */
    public Builder setTypeNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      typeName_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * the address of a record on chain (For Established Records)
     * </pre>
     *
     * <code>bytes record_id = 3 [(.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"record_id&#92;""];</code>
     * @return Whether the recordId field is set.
     */
    public boolean hasRecordId() {
      return sourceCase_ == 3;
    }
    /**
     * <pre>
     * the address of a record on chain (For Established Records)
     * </pre>
     *
     * <code>bytes record_id = 3 [(.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"record_id&#92;""];</code>
     * @return The recordId.
     */
    public com.google.protobuf.ByteString getRecordId() {
      if (sourceCase_ == 3) {
        return (com.google.protobuf.ByteString) source_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <pre>
     * the address of a record on chain (For Established Records)
     * </pre>
     *
     * <code>bytes record_id = 3 [(.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"record_id&#92;""];</code>
     * @param value The recordId to set.
     * @return This builder for chaining.
     */
    public Builder setRecordId(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  sourceCase_ = 3;
      source_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the address of a record on chain (For Established Records)
     * </pre>
     *
     * <code>bytes record_id = 3 [(.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"record_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearRecordId() {
      if (sourceCase_ == 3) {
        sourceCase_ = 0;
        source_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <pre>
     * the hash of an off-chain piece of information (For Proposed Records)
     * </pre>
     *
     * <code>string hash = 4;</code>
     * @return Whether the hash field is set.
     */
    @java.lang.Override
    public boolean hasHash() {
      return sourceCase_ == 4;
    }
    /**
     * <pre>
     * the hash of an off-chain piece of information (For Proposed Records)
     * </pre>
     *
     * <code>string hash = 4;</code>
     * @return The hash.
     */
    @java.lang.Override
    public java.lang.String getHash() {
      java.lang.Object ref = "";
      if (sourceCase_ == 4) {
        ref = source_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (sourceCase_ == 4) {
          source_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * the hash of an off-chain piece of information (For Proposed Records)
     * </pre>
     *
     * <code>string hash = 4;</code>
     * @return The bytes for hash.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getHashBytes() {
      java.lang.Object ref = "";
      if (sourceCase_ == 4) {
        ref = source_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (sourceCase_ == 4) {
          source_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * the hash of an off-chain piece of information (For Proposed Records)
     * </pre>
     *
     * <code>string hash = 4;</code>
     * @param value The hash to set.
     * @return This builder for chaining.
     */
    public Builder setHash(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  sourceCase_ = 4;
      source_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the hash of an off-chain piece of information (For Proposed Records)
     * </pre>
     *
     * <code>string hash = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearHash() {
      if (sourceCase_ == 4) {
        sourceCase_ = 0;
        source_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * the hash of an off-chain piece of information (For Proposed Records)
     * </pre>
     *
     * <code>string hash = 4;</code>
     * @param value The bytes for hash to set.
     * @return This builder for chaining.
     */
    public Builder setHashBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      sourceCase_ = 4;
      source_ = value;
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


    // @@protoc_insertion_point(builder_scope:provenance.metadata.v1.InputSpecification)
  }

  // @@protoc_insertion_point(class_scope:provenance.metadata.v1.InputSpecification)
  private static final io.provenance.metadata.v1.InputSpecification DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.provenance.metadata.v1.InputSpecification();
  }

  public static io.provenance.metadata.v1.InputSpecification getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InputSpecification>
      PARSER = new com.google.protobuf.AbstractParser<InputSpecification>() {
    @java.lang.Override
    public InputSpecification parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InputSpecification(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InputSpecification> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InputSpecification> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.provenance.metadata.v1.InputSpecification getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

