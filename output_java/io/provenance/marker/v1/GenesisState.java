// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/marker/v1/genesis.proto

package io.provenance.marker.v1;

/**
 * <pre>
 * GenesisState defines the account module's genesis state.
 * </pre>
 *
 * Protobuf type {@code provenance.marker.v1.GenesisState}
 */
public final class GenesisState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.marker.v1.GenesisState)
    GenesisStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenesisState.newBuilder() to construct.
  private GenesisState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenesisState() {
    markers_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenesisState();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GenesisState(
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
            io.provenance.marker.v1.Params.Builder subBuilder = null;
            if (params_ != null) {
              subBuilder = params_.toBuilder();
            }
            params_ = input.readMessage(io.provenance.marker.v1.Params.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(params_);
              params_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              markers_ = new java.util.ArrayList<io.provenance.marker.v1.MarkerAccount>();
              mutable_bitField0_ |= 0x00000001;
            }
            markers_.add(
                input.readMessage(io.provenance.marker.v1.MarkerAccount.parser(), extensionRegistry));
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
        markers_ = java.util.Collections.unmodifiableList(markers_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.provenance.marker.v1.Genesis.internal_static_provenance_marker_v1_GenesisState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.provenance.marker.v1.Genesis.internal_static_provenance_marker_v1_GenesisState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.provenance.marker.v1.GenesisState.class, io.provenance.marker.v1.GenesisState.Builder.class);
  }

  public static final int PARAMS_FIELD_NUMBER = 1;
  private io.provenance.marker.v1.Params params_;
  /**
   * <pre>
   * params defines all the parameters of the module.
   * </pre>
   *
   * <code>.provenance.marker.v1.Params params = 1 [(.gogoproto.nullable) = false];</code>
   * @return Whether the params field is set.
   */
  @java.lang.Override
  public boolean hasParams() {
    return params_ != null;
  }
  /**
   * <pre>
   * params defines all the parameters of the module.
   * </pre>
   *
   * <code>.provenance.marker.v1.Params params = 1 [(.gogoproto.nullable) = false];</code>
   * @return The params.
   */
  @java.lang.Override
  public io.provenance.marker.v1.Params getParams() {
    return params_ == null ? io.provenance.marker.v1.Params.getDefaultInstance() : params_;
  }
  /**
   * <pre>
   * params defines all the parameters of the module.
   * </pre>
   *
   * <code>.provenance.marker.v1.Params params = 1 [(.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public io.provenance.marker.v1.ParamsOrBuilder getParamsOrBuilder() {
    return getParams();
  }

  public static final int MARKERS_FIELD_NUMBER = 2;
  private java.util.List<io.provenance.marker.v1.MarkerAccount> markers_;
  /**
   * <pre>
   * A collection of marker accounts to create on start
   * </pre>
   *
   * <code>repeated .provenance.marker.v1.MarkerAccount markers = 2 [(.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<io.provenance.marker.v1.MarkerAccount> getMarkersList() {
    return markers_;
  }
  /**
   * <pre>
   * A collection of marker accounts to create on start
   * </pre>
   *
   * <code>repeated .provenance.marker.v1.MarkerAccount markers = 2 [(.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.provenance.marker.v1.MarkerAccountOrBuilder> 
      getMarkersOrBuilderList() {
    return markers_;
  }
  /**
   * <pre>
   * A collection of marker accounts to create on start
   * </pre>
   *
   * <code>repeated .provenance.marker.v1.MarkerAccount markers = 2 [(.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getMarkersCount() {
    return markers_.size();
  }
  /**
   * <pre>
   * A collection of marker accounts to create on start
   * </pre>
   *
   * <code>repeated .provenance.marker.v1.MarkerAccount markers = 2 [(.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public io.provenance.marker.v1.MarkerAccount getMarkers(int index) {
    return markers_.get(index);
  }
  /**
   * <pre>
   * A collection of marker accounts to create on start
   * </pre>
   *
   * <code>repeated .provenance.marker.v1.MarkerAccount markers = 2 [(.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public io.provenance.marker.v1.MarkerAccountOrBuilder getMarkersOrBuilder(
      int index) {
    return markers_.get(index);
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
    if (params_ != null) {
      output.writeMessage(1, getParams());
    }
    for (int i = 0; i < markers_.size(); i++) {
      output.writeMessage(2, markers_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (params_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getParams());
    }
    for (int i = 0; i < markers_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, markers_.get(i));
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
    if (!(obj instanceof io.provenance.marker.v1.GenesisState)) {
      return super.equals(obj);
    }
    io.provenance.marker.v1.GenesisState other = (io.provenance.marker.v1.GenesisState) obj;

    if (hasParams() != other.hasParams()) return false;
    if (hasParams()) {
      if (!getParams()
          .equals(other.getParams())) return false;
    }
    if (!getMarkersList()
        .equals(other.getMarkersList())) return false;
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
    if (hasParams()) {
      hash = (37 * hash) + PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getParams().hashCode();
    }
    if (getMarkersCount() > 0) {
      hash = (37 * hash) + MARKERS_FIELD_NUMBER;
      hash = (53 * hash) + getMarkersList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.provenance.marker.v1.GenesisState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.marker.v1.GenesisState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.marker.v1.GenesisState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.marker.v1.GenesisState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.marker.v1.GenesisState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.marker.v1.GenesisState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.marker.v1.GenesisState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.marker.v1.GenesisState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.marker.v1.GenesisState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.provenance.marker.v1.GenesisState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.marker.v1.GenesisState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.marker.v1.GenesisState parseFrom(
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
  public static Builder newBuilder(io.provenance.marker.v1.GenesisState prototype) {
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
   * GenesisState defines the account module's genesis state.
   * </pre>
   *
   * Protobuf type {@code provenance.marker.v1.GenesisState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.marker.v1.GenesisState)
      io.provenance.marker.v1.GenesisStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.provenance.marker.v1.Genesis.internal_static_provenance_marker_v1_GenesisState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.provenance.marker.v1.Genesis.internal_static_provenance_marker_v1_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.provenance.marker.v1.GenesisState.class, io.provenance.marker.v1.GenesisState.Builder.class);
    }

    // Construct using io.provenance.marker.v1.GenesisState.newBuilder()
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
        getMarkersFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (paramsBuilder_ == null) {
        params_ = null;
      } else {
        params_ = null;
        paramsBuilder_ = null;
      }
      if (markersBuilder_ == null) {
        markers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        markersBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.provenance.marker.v1.Genesis.internal_static_provenance_marker_v1_GenesisState_descriptor;
    }

    @java.lang.Override
    public io.provenance.marker.v1.GenesisState getDefaultInstanceForType() {
      return io.provenance.marker.v1.GenesisState.getDefaultInstance();
    }

    @java.lang.Override
    public io.provenance.marker.v1.GenesisState build() {
      io.provenance.marker.v1.GenesisState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.provenance.marker.v1.GenesisState buildPartial() {
      io.provenance.marker.v1.GenesisState result = new io.provenance.marker.v1.GenesisState(this);
      int from_bitField0_ = bitField0_;
      if (paramsBuilder_ == null) {
        result.params_ = params_;
      } else {
        result.params_ = paramsBuilder_.build();
      }
      if (markersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          markers_ = java.util.Collections.unmodifiableList(markers_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.markers_ = markers_;
      } else {
        result.markers_ = markersBuilder_.build();
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
      if (other instanceof io.provenance.marker.v1.GenesisState) {
        return mergeFrom((io.provenance.marker.v1.GenesisState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.provenance.marker.v1.GenesisState other) {
      if (other == io.provenance.marker.v1.GenesisState.getDefaultInstance()) return this;
      if (other.hasParams()) {
        mergeParams(other.getParams());
      }
      if (markersBuilder_ == null) {
        if (!other.markers_.isEmpty()) {
          if (markers_.isEmpty()) {
            markers_ = other.markers_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMarkersIsMutable();
            markers_.addAll(other.markers_);
          }
          onChanged();
        }
      } else {
        if (!other.markers_.isEmpty()) {
          if (markersBuilder_.isEmpty()) {
            markersBuilder_.dispose();
            markersBuilder_ = null;
            markers_ = other.markers_;
            bitField0_ = (bitField0_ & ~0x00000001);
            markersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMarkersFieldBuilder() : null;
          } else {
            markersBuilder_.addAllMessages(other.markers_);
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
      io.provenance.marker.v1.GenesisState parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.provenance.marker.v1.GenesisState) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private io.provenance.marker.v1.Params params_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.provenance.marker.v1.Params, io.provenance.marker.v1.Params.Builder, io.provenance.marker.v1.ParamsOrBuilder> paramsBuilder_;
    /**
     * <pre>
     * params defines all the parameters of the module.
     * </pre>
     *
     * <code>.provenance.marker.v1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     * @return Whether the params field is set.
     */
    public boolean hasParams() {
      return paramsBuilder_ != null || params_ != null;
    }
    /**
     * <pre>
     * params defines all the parameters of the module.
     * </pre>
     *
     * <code>.provenance.marker.v1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     * @return The params.
     */
    public io.provenance.marker.v1.Params getParams() {
      if (paramsBuilder_ == null) {
        return params_ == null ? io.provenance.marker.v1.Params.getDefaultInstance() : params_;
      } else {
        return paramsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * params defines all the parameters of the module.
     * </pre>
     *
     * <code>.provenance.marker.v1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setParams(io.provenance.marker.v1.Params value) {
      if (paramsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        params_ = value;
        onChanged();
      } else {
        paramsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * params defines all the parameters of the module.
     * </pre>
     *
     * <code>.provenance.marker.v1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setParams(
        io.provenance.marker.v1.Params.Builder builderForValue) {
      if (paramsBuilder_ == null) {
        params_ = builderForValue.build();
        onChanged();
      } else {
        paramsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * params defines all the parameters of the module.
     * </pre>
     *
     * <code>.provenance.marker.v1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder mergeParams(io.provenance.marker.v1.Params value) {
      if (paramsBuilder_ == null) {
        if (params_ != null) {
          params_ =
            io.provenance.marker.v1.Params.newBuilder(params_).mergeFrom(value).buildPartial();
        } else {
          params_ = value;
        }
        onChanged();
      } else {
        paramsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * params defines all the parameters of the module.
     * </pre>
     *
     * <code>.provenance.marker.v1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     */
    public Builder clearParams() {
      if (paramsBuilder_ == null) {
        params_ = null;
        onChanged();
      } else {
        params_ = null;
        paramsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * params defines all the parameters of the module.
     * </pre>
     *
     * <code>.provenance.marker.v1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     */
    public io.provenance.marker.v1.Params.Builder getParamsBuilder() {
      
      onChanged();
      return getParamsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * params defines all the parameters of the module.
     * </pre>
     *
     * <code>.provenance.marker.v1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     */
    public io.provenance.marker.v1.ParamsOrBuilder getParamsOrBuilder() {
      if (paramsBuilder_ != null) {
        return paramsBuilder_.getMessageOrBuilder();
      } else {
        return params_ == null ?
            io.provenance.marker.v1.Params.getDefaultInstance() : params_;
      }
    }
    /**
     * <pre>
     * params defines all the parameters of the module.
     * </pre>
     *
     * <code>.provenance.marker.v1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.provenance.marker.v1.Params, io.provenance.marker.v1.Params.Builder, io.provenance.marker.v1.ParamsOrBuilder> 
        getParamsFieldBuilder() {
      if (paramsBuilder_ == null) {
        paramsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.provenance.marker.v1.Params, io.provenance.marker.v1.Params.Builder, io.provenance.marker.v1.ParamsOrBuilder>(
                getParams(),
                getParentForChildren(),
                isClean());
        params_ = null;
      }
      return paramsBuilder_;
    }

    private java.util.List<io.provenance.marker.v1.MarkerAccount> markers_ =
      java.util.Collections.emptyList();
    private void ensureMarkersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        markers_ = new java.util.ArrayList<io.provenance.marker.v1.MarkerAccount>(markers_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.provenance.marker.v1.MarkerAccount, io.provenance.marker.v1.MarkerAccount.Builder, io.provenance.marker.v1.MarkerAccountOrBuilder> markersBuilder_;

    /**
     * <pre>
     * A collection of marker accounts to create on start
     * </pre>
     *
     * <code>repeated .provenance.marker.v1.MarkerAccount markers = 2 [(.gogoproto.nullable) = false];</code>
     */
    public java.util.List<io.provenance.marker.v1.MarkerAccount> getMarkersList() {
      if (markersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(markers_);
      } else {
        return markersBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A collection of marker accounts to create on start
     * </pre>
     *
     * <code>repeated .provenance.marker.v1.MarkerAccount markers = 2 [(.gogoproto.nullable) = false];</code>
     */
    public int getMarkersCount() {
      if (markersBuilder_ == null) {
        return markers_.size();
      } else {
        return markersBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A collection of marker accounts to create on start
     * </pre>
     *
     * <code>repeated .provenance.marker.v1.MarkerAccount markers = 2 [(.gogoproto.nullable) = false];</code>
     */
    public io.provenance.marker.v1.MarkerAccount getMarkers(int index) {
      if (markersBuilder_ == null) {
        return markers_.get(index);
      } else {
        return markersBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A collection of marker accounts to create on start
     * </pre>
     *
     * <code>repeated .provenance.marker.v1.MarkerAccount markers = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setMarkers(
        int index, io.provenance.marker.v1.MarkerAccount value) {
      if (markersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMarkersIsMutable();
        markers_.set(index, value);
        onChanged();
      } else {
        markersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A collection of marker accounts to create on start
     * </pre>
     *
     * <code>repeated .provenance.marker.v1.MarkerAccount markers = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setMarkers(
        int index, io.provenance.marker.v1.MarkerAccount.Builder builderForValue) {
      if (markersBuilder_ == null) {
        ensureMarkersIsMutable();
        markers_.set(index, builderForValue.build());
        onChanged();
      } else {
        markersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A collection of marker accounts to create on start
     * </pre>
     *
     * <code>repeated .provenance.marker.v1.MarkerAccount markers = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addMarkers(io.provenance.marker.v1.MarkerAccount value) {
      if (markersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMarkersIsMutable();
        markers_.add(value);
        onChanged();
      } else {
        markersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A collection of marker accounts to create on start
     * </pre>
     *
     * <code>repeated .provenance.marker.v1.MarkerAccount markers = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addMarkers(
        int index, io.provenance.marker.v1.MarkerAccount value) {
      if (markersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMarkersIsMutable();
        markers_.add(index, value);
        onChanged();
      } else {
        markersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A collection of marker accounts to create on start
     * </pre>
     *
     * <code>repeated .provenance.marker.v1.MarkerAccount markers = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addMarkers(
        io.provenance.marker.v1.MarkerAccount.Builder builderForValue) {
      if (markersBuilder_ == null) {
        ensureMarkersIsMutable();
        markers_.add(builderForValue.build());
        onChanged();
      } else {
        markersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A collection of marker accounts to create on start
     * </pre>
     *
     * <code>repeated .provenance.marker.v1.MarkerAccount markers = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addMarkers(
        int index, io.provenance.marker.v1.MarkerAccount.Builder builderForValue) {
      if (markersBuilder_ == null) {
        ensureMarkersIsMutable();
        markers_.add(index, builderForValue.build());
        onChanged();
      } else {
        markersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A collection of marker accounts to create on start
     * </pre>
     *
     * <code>repeated .provenance.marker.v1.MarkerAccount markers = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder addAllMarkers(
        java.lang.Iterable<? extends io.provenance.marker.v1.MarkerAccount> values) {
      if (markersBuilder_ == null) {
        ensureMarkersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, markers_);
        onChanged();
      } else {
        markersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A collection of marker accounts to create on start
     * </pre>
     *
     * <code>repeated .provenance.marker.v1.MarkerAccount markers = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder clearMarkers() {
      if (markersBuilder_ == null) {
        markers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        markersBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A collection of marker accounts to create on start
     * </pre>
     *
     * <code>repeated .provenance.marker.v1.MarkerAccount markers = 2 [(.gogoproto.nullable) = false];</code>
     */
    public Builder removeMarkers(int index) {
      if (markersBuilder_ == null) {
        ensureMarkersIsMutable();
        markers_.remove(index);
        onChanged();
      } else {
        markersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A collection of marker accounts to create on start
     * </pre>
     *
     * <code>repeated .provenance.marker.v1.MarkerAccount markers = 2 [(.gogoproto.nullable) = false];</code>
     */
    public io.provenance.marker.v1.MarkerAccount.Builder getMarkersBuilder(
        int index) {
      return getMarkersFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A collection of marker accounts to create on start
     * </pre>
     *
     * <code>repeated .provenance.marker.v1.MarkerAccount markers = 2 [(.gogoproto.nullable) = false];</code>
     */
    public io.provenance.marker.v1.MarkerAccountOrBuilder getMarkersOrBuilder(
        int index) {
      if (markersBuilder_ == null) {
        return markers_.get(index);  } else {
        return markersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A collection of marker accounts to create on start
     * </pre>
     *
     * <code>repeated .provenance.marker.v1.MarkerAccount markers = 2 [(.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends io.provenance.marker.v1.MarkerAccountOrBuilder> 
         getMarkersOrBuilderList() {
      if (markersBuilder_ != null) {
        return markersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(markers_);
      }
    }
    /**
     * <pre>
     * A collection of marker accounts to create on start
     * </pre>
     *
     * <code>repeated .provenance.marker.v1.MarkerAccount markers = 2 [(.gogoproto.nullable) = false];</code>
     */
    public io.provenance.marker.v1.MarkerAccount.Builder addMarkersBuilder() {
      return getMarkersFieldBuilder().addBuilder(
          io.provenance.marker.v1.MarkerAccount.getDefaultInstance());
    }
    /**
     * <pre>
     * A collection of marker accounts to create on start
     * </pre>
     *
     * <code>repeated .provenance.marker.v1.MarkerAccount markers = 2 [(.gogoproto.nullable) = false];</code>
     */
    public io.provenance.marker.v1.MarkerAccount.Builder addMarkersBuilder(
        int index) {
      return getMarkersFieldBuilder().addBuilder(
          index, io.provenance.marker.v1.MarkerAccount.getDefaultInstance());
    }
    /**
     * <pre>
     * A collection of marker accounts to create on start
     * </pre>
     *
     * <code>repeated .provenance.marker.v1.MarkerAccount markers = 2 [(.gogoproto.nullable) = false];</code>
     */
    public java.util.List<io.provenance.marker.v1.MarkerAccount.Builder> 
         getMarkersBuilderList() {
      return getMarkersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.provenance.marker.v1.MarkerAccount, io.provenance.marker.v1.MarkerAccount.Builder, io.provenance.marker.v1.MarkerAccountOrBuilder> 
        getMarkersFieldBuilder() {
      if (markersBuilder_ == null) {
        markersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.provenance.marker.v1.MarkerAccount, io.provenance.marker.v1.MarkerAccount.Builder, io.provenance.marker.v1.MarkerAccountOrBuilder>(
                markers_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        markers_ = null;
      }
      return markersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:provenance.marker.v1.GenesisState)
  }

  // @@protoc_insertion_point(class_scope:provenance.marker.v1.GenesisState)
  private static final io.provenance.marker.v1.GenesisState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.provenance.marker.v1.GenesisState();
  }

  public static io.provenance.marker.v1.GenesisState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenesisState>
      PARSER = new com.google.protobuf.AbstractParser<GenesisState>() {
    @java.lang.Override
    public GenesisState parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GenesisState(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GenesisState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenesisState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.provenance.marker.v1.GenesisState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

