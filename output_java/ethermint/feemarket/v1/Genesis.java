// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ethermint/feemarket/v1/genesis.proto

package ethermint.feemarket.v1;

public final class Genesis {
  private Genesis() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GenesisStateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ethermint.feemarket.v1.GenesisState)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * params defines all the paramaters of the module.
     * </pre>
     *
     * <code>.ethermint.feemarket.v1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     * @return Whether the params field is set.
     */
    boolean hasParams();
    /**
     * <pre>
     * params defines all the paramaters of the module.
     * </pre>
     *
     * <code>.ethermint.feemarket.v1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     * @return The params.
     */
    ethermint.feemarket.v1.Feemarket.Params getParams();
    /**
     * <pre>
     * params defines all the paramaters of the module.
     * </pre>
     *
     * <code>.ethermint.feemarket.v1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     */
    ethermint.feemarket.v1.Feemarket.ParamsOrBuilder getParamsOrBuilder();

    /**
     * <pre>
     * base fee is the exported value from previous software version.
     * Zero by default.
     * </pre>
     *
     * <code>string base_fee = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The baseFee.
     */
    java.lang.String getBaseFee();
    /**
     * <pre>
     * base fee is the exported value from previous software version.
     * Zero by default.
     * </pre>
     *
     * <code>string base_fee = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The bytes for baseFee.
     */
    com.google.protobuf.ByteString
        getBaseFeeBytes();

    /**
     * <pre>
     * block gas is the amount of gas used on the last block before the upgrade.
     * Zero by default.
     * </pre>
     *
     * <code>uint64 block_gas = 3;</code>
     * @return The blockGas.
     */
    long getBlockGas();
  }
  /**
   * <pre>
   * GenesisState defines the feemarket module's genesis state.
   * </pre>
   *
   * Protobuf type {@code ethermint.feemarket.v1.GenesisState}
   */
  public static final class GenesisState extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ethermint.feemarket.v1.GenesisState)
      GenesisStateOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GenesisState.newBuilder() to construct.
    private GenesisState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GenesisState() {
      baseFee_ = "";
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
              ethermint.feemarket.v1.Feemarket.Params.Builder subBuilder = null;
              if (params_ != null) {
                subBuilder = params_.toBuilder();
              }
              params_ = input.readMessage(ethermint.feemarket.v1.Feemarket.Params.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(params_);
                params_ = subBuilder.buildPartial();
              }

              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              baseFee_ = s;
              break;
            }
            case 24: {

              blockGas_ = input.readUInt64();
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
      return ethermint.feemarket.v1.Genesis.internal_static_ethermint_feemarket_v1_GenesisState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ethermint.feemarket.v1.Genesis.internal_static_ethermint_feemarket_v1_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ethermint.feemarket.v1.Genesis.GenesisState.class, ethermint.feemarket.v1.Genesis.GenesisState.Builder.class);
    }

    public static final int PARAMS_FIELD_NUMBER = 1;
    private ethermint.feemarket.v1.Feemarket.Params params_;
    /**
     * <pre>
     * params defines all the paramaters of the module.
     * </pre>
     *
     * <code>.ethermint.feemarket.v1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     * @return Whether the params field is set.
     */
    @java.lang.Override
    public boolean hasParams() {
      return params_ != null;
    }
    /**
     * <pre>
     * params defines all the paramaters of the module.
     * </pre>
     *
     * <code>.ethermint.feemarket.v1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     * @return The params.
     */
    @java.lang.Override
    public ethermint.feemarket.v1.Feemarket.Params getParams() {
      return params_ == null ? ethermint.feemarket.v1.Feemarket.Params.getDefaultInstance() : params_;
    }
    /**
     * <pre>
     * params defines all the paramaters of the module.
     * </pre>
     *
     * <code>.ethermint.feemarket.v1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public ethermint.feemarket.v1.Feemarket.ParamsOrBuilder getParamsOrBuilder() {
      return getParams();
    }

    public static final int BASE_FEE_FIELD_NUMBER = 2;
    private volatile java.lang.Object baseFee_;
    /**
     * <pre>
     * base fee is the exported value from previous software version.
     * Zero by default.
     * </pre>
     *
     * <code>string base_fee = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The baseFee.
     */
    @java.lang.Override
    public java.lang.String getBaseFee() {
      java.lang.Object ref = baseFee_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        baseFee_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * base fee is the exported value from previous software version.
     * Zero by default.
     * </pre>
     *
     * <code>string base_fee = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The bytes for baseFee.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getBaseFeeBytes() {
      java.lang.Object ref = baseFee_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        baseFee_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int BLOCK_GAS_FIELD_NUMBER = 3;
    private long blockGas_;
    /**
     * <pre>
     * block gas is the amount of gas used on the last block before the upgrade.
     * Zero by default.
     * </pre>
     *
     * <code>uint64 block_gas = 3;</code>
     * @return The blockGas.
     */
    @java.lang.Override
    public long getBlockGas() {
      return blockGas_;
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
      if (!getBaseFeeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, baseFee_);
      }
      if (blockGas_ != 0L) {
        output.writeUInt64(3, blockGas_);
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
      if (!getBaseFeeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, baseFee_);
      }
      if (blockGas_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, blockGas_);
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
      if (!(obj instanceof ethermint.feemarket.v1.Genesis.GenesisState)) {
        return super.equals(obj);
      }
      ethermint.feemarket.v1.Genesis.GenesisState other = (ethermint.feemarket.v1.Genesis.GenesisState) obj;

      if (hasParams() != other.hasParams()) return false;
      if (hasParams()) {
        if (!getParams()
            .equals(other.getParams())) return false;
      }
      if (!getBaseFee()
          .equals(other.getBaseFee())) return false;
      if (getBlockGas()
          != other.getBlockGas()) return false;
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
      hash = (37 * hash) + BASE_FEE_FIELD_NUMBER;
      hash = (53 * hash) + getBaseFee().hashCode();
      hash = (37 * hash) + BLOCK_GAS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getBlockGas());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ethermint.feemarket.v1.Genesis.GenesisState parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ethermint.feemarket.v1.Genesis.GenesisState parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ethermint.feemarket.v1.Genesis.GenesisState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ethermint.feemarket.v1.Genesis.GenesisState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ethermint.feemarket.v1.Genesis.GenesisState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ethermint.feemarket.v1.Genesis.GenesisState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ethermint.feemarket.v1.Genesis.GenesisState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ethermint.feemarket.v1.Genesis.GenesisState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ethermint.feemarket.v1.Genesis.GenesisState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ethermint.feemarket.v1.Genesis.GenesisState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ethermint.feemarket.v1.Genesis.GenesisState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ethermint.feemarket.v1.Genesis.GenesisState parseFrom(
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
    public static Builder newBuilder(ethermint.feemarket.v1.Genesis.GenesisState prototype) {
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
     * GenesisState defines the feemarket module's genesis state.
     * </pre>
     *
     * Protobuf type {@code ethermint.feemarket.v1.GenesisState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ethermint.feemarket.v1.GenesisState)
        ethermint.feemarket.v1.Genesis.GenesisStateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ethermint.feemarket.v1.Genesis.internal_static_ethermint_feemarket_v1_GenesisState_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ethermint.feemarket.v1.Genesis.internal_static_ethermint_feemarket_v1_GenesisState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ethermint.feemarket.v1.Genesis.GenesisState.class, ethermint.feemarket.v1.Genesis.GenesisState.Builder.class);
      }

      // Construct using ethermint.feemarket.v1.Genesis.GenesisState.newBuilder()
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
        if (paramsBuilder_ == null) {
          params_ = null;
        } else {
          params_ = null;
          paramsBuilder_ = null;
        }
        baseFee_ = "";

        blockGas_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ethermint.feemarket.v1.Genesis.internal_static_ethermint_feemarket_v1_GenesisState_descriptor;
      }

      @java.lang.Override
      public ethermint.feemarket.v1.Genesis.GenesisState getDefaultInstanceForType() {
        return ethermint.feemarket.v1.Genesis.GenesisState.getDefaultInstance();
      }

      @java.lang.Override
      public ethermint.feemarket.v1.Genesis.GenesisState build() {
        ethermint.feemarket.v1.Genesis.GenesisState result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ethermint.feemarket.v1.Genesis.GenesisState buildPartial() {
        ethermint.feemarket.v1.Genesis.GenesisState result = new ethermint.feemarket.v1.Genesis.GenesisState(this);
        if (paramsBuilder_ == null) {
          result.params_ = params_;
        } else {
          result.params_ = paramsBuilder_.build();
        }
        result.baseFee_ = baseFee_;
        result.blockGas_ = blockGas_;
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
        if (other instanceof ethermint.feemarket.v1.Genesis.GenesisState) {
          return mergeFrom((ethermint.feemarket.v1.Genesis.GenesisState)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ethermint.feemarket.v1.Genesis.GenesisState other) {
        if (other == ethermint.feemarket.v1.Genesis.GenesisState.getDefaultInstance()) return this;
        if (other.hasParams()) {
          mergeParams(other.getParams());
        }
        if (!other.getBaseFee().isEmpty()) {
          baseFee_ = other.baseFee_;
          onChanged();
        }
        if (other.getBlockGas() != 0L) {
          setBlockGas(other.getBlockGas());
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
        ethermint.feemarket.v1.Genesis.GenesisState parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ethermint.feemarket.v1.Genesis.GenesisState) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private ethermint.feemarket.v1.Feemarket.Params params_;
      private com.google.protobuf.SingleFieldBuilderV3<
          ethermint.feemarket.v1.Feemarket.Params, ethermint.feemarket.v1.Feemarket.Params.Builder, ethermint.feemarket.v1.Feemarket.ParamsOrBuilder> paramsBuilder_;
      /**
       * <pre>
       * params defines all the paramaters of the module.
       * </pre>
       *
       * <code>.ethermint.feemarket.v1.Params params = 1 [(.gogoproto.nullable) = false];</code>
       * @return Whether the params field is set.
       */
      public boolean hasParams() {
        return paramsBuilder_ != null || params_ != null;
      }
      /**
       * <pre>
       * params defines all the paramaters of the module.
       * </pre>
       *
       * <code>.ethermint.feemarket.v1.Params params = 1 [(.gogoproto.nullable) = false];</code>
       * @return The params.
       */
      public ethermint.feemarket.v1.Feemarket.Params getParams() {
        if (paramsBuilder_ == null) {
          return params_ == null ? ethermint.feemarket.v1.Feemarket.Params.getDefaultInstance() : params_;
        } else {
          return paramsBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * params defines all the paramaters of the module.
       * </pre>
       *
       * <code>.ethermint.feemarket.v1.Params params = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setParams(ethermint.feemarket.v1.Feemarket.Params value) {
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
       * params defines all the paramaters of the module.
       * </pre>
       *
       * <code>.ethermint.feemarket.v1.Params params = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setParams(
          ethermint.feemarket.v1.Feemarket.Params.Builder builderForValue) {
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
       * params defines all the paramaters of the module.
       * </pre>
       *
       * <code>.ethermint.feemarket.v1.Params params = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder mergeParams(ethermint.feemarket.v1.Feemarket.Params value) {
        if (paramsBuilder_ == null) {
          if (params_ != null) {
            params_ =
              ethermint.feemarket.v1.Feemarket.Params.newBuilder(params_).mergeFrom(value).buildPartial();
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
       * params defines all the paramaters of the module.
       * </pre>
       *
       * <code>.ethermint.feemarket.v1.Params params = 1 [(.gogoproto.nullable) = false];</code>
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
       * params defines all the paramaters of the module.
       * </pre>
       *
       * <code>.ethermint.feemarket.v1.Params params = 1 [(.gogoproto.nullable) = false];</code>
       */
      public ethermint.feemarket.v1.Feemarket.Params.Builder getParamsBuilder() {
        
        onChanged();
        return getParamsFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * params defines all the paramaters of the module.
       * </pre>
       *
       * <code>.ethermint.feemarket.v1.Params params = 1 [(.gogoproto.nullable) = false];</code>
       */
      public ethermint.feemarket.v1.Feemarket.ParamsOrBuilder getParamsOrBuilder() {
        if (paramsBuilder_ != null) {
          return paramsBuilder_.getMessageOrBuilder();
        } else {
          return params_ == null ?
              ethermint.feemarket.v1.Feemarket.Params.getDefaultInstance() : params_;
        }
      }
      /**
       * <pre>
       * params defines all the paramaters of the module.
       * </pre>
       *
       * <code>.ethermint.feemarket.v1.Params params = 1 [(.gogoproto.nullable) = false];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ethermint.feemarket.v1.Feemarket.Params, ethermint.feemarket.v1.Feemarket.Params.Builder, ethermint.feemarket.v1.Feemarket.ParamsOrBuilder> 
          getParamsFieldBuilder() {
        if (paramsBuilder_ == null) {
          paramsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ethermint.feemarket.v1.Feemarket.Params, ethermint.feemarket.v1.Feemarket.Params.Builder, ethermint.feemarket.v1.Feemarket.ParamsOrBuilder>(
                  getParams(),
                  getParentForChildren(),
                  isClean());
          params_ = null;
        }
        return paramsBuilder_;
      }

      private java.lang.Object baseFee_ = "";
      /**
       * <pre>
       * base fee is the exported value from previous software version.
       * Zero by default.
       * </pre>
       *
       * <code>string base_fee = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @return The baseFee.
       */
      public java.lang.String getBaseFee() {
        java.lang.Object ref = baseFee_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          baseFee_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * base fee is the exported value from previous software version.
       * Zero by default.
       * </pre>
       *
       * <code>string base_fee = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @return The bytes for baseFee.
       */
      public com.google.protobuf.ByteString
          getBaseFeeBytes() {
        java.lang.Object ref = baseFee_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          baseFee_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * base fee is the exported value from previous software version.
       * Zero by default.
       * </pre>
       *
       * <code>string base_fee = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @param value The baseFee to set.
       * @return This builder for chaining.
       */
      public Builder setBaseFee(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        baseFee_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * base fee is the exported value from previous software version.
       * Zero by default.
       * </pre>
       *
       * <code>string base_fee = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @return This builder for chaining.
       */
      public Builder clearBaseFee() {
        
        baseFee_ = getDefaultInstance().getBaseFee();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * base fee is the exported value from previous software version.
       * Zero by default.
       * </pre>
       *
       * <code>string base_fee = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @param value The bytes for baseFee to set.
       * @return This builder for chaining.
       */
      public Builder setBaseFeeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        baseFee_ = value;
        onChanged();
        return this;
      }

      private long blockGas_ ;
      /**
       * <pre>
       * block gas is the amount of gas used on the last block before the upgrade.
       * Zero by default.
       * </pre>
       *
       * <code>uint64 block_gas = 3;</code>
       * @return The blockGas.
       */
      @java.lang.Override
      public long getBlockGas() {
        return blockGas_;
      }
      /**
       * <pre>
       * block gas is the amount of gas used on the last block before the upgrade.
       * Zero by default.
       * </pre>
       *
       * <code>uint64 block_gas = 3;</code>
       * @param value The blockGas to set.
       * @return This builder for chaining.
       */
      public Builder setBlockGas(long value) {
        
        blockGas_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * block gas is the amount of gas used on the last block before the upgrade.
       * Zero by default.
       * </pre>
       *
       * <code>uint64 block_gas = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearBlockGas() {
        
        blockGas_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:ethermint.feemarket.v1.GenesisState)
    }

    // @@protoc_insertion_point(class_scope:ethermint.feemarket.v1.GenesisState)
    private static final ethermint.feemarket.v1.Genesis.GenesisState DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ethermint.feemarket.v1.Genesis.GenesisState();
    }

    public static ethermint.feemarket.v1.Genesis.GenesisState getDefaultInstance() {
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
    public ethermint.feemarket.v1.Genesis.GenesisState getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ethermint_feemarket_v1_GenesisState_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ethermint_feemarket_v1_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$ethermint/feemarket/v1/genesis.proto\022\026" +
      "ethermint.feemarket.v1\032\024gogoproto/gogo.p" +
      "roto\032&ethermint/feemarket/v1/feemarket.p" +
      "roto\"\231\001\n\014GenesisState\0224\n\006params\030\001 \001(\0132\036." +
      "ethermint.feemarket.v1.ParamsB\004\310\336\037\000\022@\n\010b" +
      "ase_fee\030\002 \001(\tB.\332\336\037&github.com/cosmos/cos" +
      "mos-sdk/types.Int\310\336\037\000\022\021\n\tblock_gas\030\003 \001(\004" +
      "B0Z.github.com/tharsis/ethermint/x/feema" +
      "rket/typesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf2.GoGoProtos.getDescriptor(),
          ethermint.feemarket.v1.Feemarket.getDescriptor(),
        });
    internal_static_ethermint_feemarket_v1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ethermint_feemarket_v1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ethermint_feemarket_v1_GenesisState_descriptor,
        new java.lang.String[] { "Params", "BaseFee", "BlockGas", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf2.GoGoProtos.customtype);
    registry.add(com.google.protobuf2.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf2.GoGoProtos.getDescriptor();
    ethermint.feemarket.v1.Feemarket.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
