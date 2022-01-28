// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/nexus/v1beta1/params.proto

package axelar.nexus.v1beta1;

public final class ParamsOuterClass {
  private ParamsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:axelar.nexus.v1beta1.Params)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.axelar.utils.v1beta1.Threshold chain_activation_threshold = 1 [(.gogoproto.nullable) = false];</code>
     * @return Whether the chainActivationThreshold field is set.
     */
    boolean hasChainActivationThreshold();
    /**
     * <code>.axelar.utils.v1beta1.Threshold chain_activation_threshold = 1 [(.gogoproto.nullable) = false];</code>
     * @return The chainActivationThreshold.
     */
    axelar.utils.v1beta1.ThresholdOuterClass.Threshold getChainActivationThreshold();
    /**
     * <code>.axelar.utils.v1beta1.Threshold chain_activation_threshold = 1 [(.gogoproto.nullable) = false];</code>
     */
    axelar.utils.v1beta1.ThresholdOuterClass.ThresholdOrBuilder getChainActivationThresholdOrBuilder();
  }
  /**
   * <pre>
   * Params represent the genesis parameters for the module
   * </pre>
   *
   * Protobuf type {@code axelar.nexus.v1beta1.Params}
   */
  public static final class Params extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:axelar.nexus.v1beta1.Params)
      ParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Params.newBuilder() to construct.
    private Params(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Params() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Params();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Params(
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
              axelar.utils.v1beta1.ThresholdOuterClass.Threshold.Builder subBuilder = null;
              if (chainActivationThreshold_ != null) {
                subBuilder = chainActivationThreshold_.toBuilder();
              }
              chainActivationThreshold_ = input.readMessage(axelar.utils.v1beta1.ThresholdOuterClass.Threshold.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(chainActivationThreshold_);
                chainActivationThreshold_ = subBuilder.buildPartial();
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
      return axelar.nexus.v1beta1.ParamsOuterClass.internal_static_axelar_nexus_v1beta1_Params_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return axelar.nexus.v1beta1.ParamsOuterClass.internal_static_axelar_nexus_v1beta1_Params_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              axelar.nexus.v1beta1.ParamsOuterClass.Params.class, axelar.nexus.v1beta1.ParamsOuterClass.Params.Builder.class);
    }

    public static final int CHAIN_ACTIVATION_THRESHOLD_FIELD_NUMBER = 1;
    private axelar.utils.v1beta1.ThresholdOuterClass.Threshold chainActivationThreshold_;
    /**
     * <code>.axelar.utils.v1beta1.Threshold chain_activation_threshold = 1 [(.gogoproto.nullable) = false];</code>
     * @return Whether the chainActivationThreshold field is set.
     */
    @java.lang.Override
    public boolean hasChainActivationThreshold() {
      return chainActivationThreshold_ != null;
    }
    /**
     * <code>.axelar.utils.v1beta1.Threshold chain_activation_threshold = 1 [(.gogoproto.nullable) = false];</code>
     * @return The chainActivationThreshold.
     */
    @java.lang.Override
    public axelar.utils.v1beta1.ThresholdOuterClass.Threshold getChainActivationThreshold() {
      return chainActivationThreshold_ == null ? axelar.utils.v1beta1.ThresholdOuterClass.Threshold.getDefaultInstance() : chainActivationThreshold_;
    }
    /**
     * <code>.axelar.utils.v1beta1.Threshold chain_activation_threshold = 1 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public axelar.utils.v1beta1.ThresholdOuterClass.ThresholdOrBuilder getChainActivationThresholdOrBuilder() {
      return getChainActivationThreshold();
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
      if (chainActivationThreshold_ != null) {
        output.writeMessage(1, getChainActivationThreshold());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (chainActivationThreshold_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getChainActivationThreshold());
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
      if (!(obj instanceof axelar.nexus.v1beta1.ParamsOuterClass.Params)) {
        return super.equals(obj);
      }
      axelar.nexus.v1beta1.ParamsOuterClass.Params other = (axelar.nexus.v1beta1.ParamsOuterClass.Params) obj;

      if (hasChainActivationThreshold() != other.hasChainActivationThreshold()) return false;
      if (hasChainActivationThreshold()) {
        if (!getChainActivationThreshold()
            .equals(other.getChainActivationThreshold())) return false;
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
      if (hasChainActivationThreshold()) {
        hash = (37 * hash) + CHAIN_ACTIVATION_THRESHOLD_FIELD_NUMBER;
        hash = (53 * hash) + getChainActivationThreshold().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static axelar.nexus.v1beta1.ParamsOuterClass.Params parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static axelar.nexus.v1beta1.ParamsOuterClass.Params parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static axelar.nexus.v1beta1.ParamsOuterClass.Params parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static axelar.nexus.v1beta1.ParamsOuterClass.Params parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static axelar.nexus.v1beta1.ParamsOuterClass.Params parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static axelar.nexus.v1beta1.ParamsOuterClass.Params parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static axelar.nexus.v1beta1.ParamsOuterClass.Params parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static axelar.nexus.v1beta1.ParamsOuterClass.Params parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static axelar.nexus.v1beta1.ParamsOuterClass.Params parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static axelar.nexus.v1beta1.ParamsOuterClass.Params parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static axelar.nexus.v1beta1.ParamsOuterClass.Params parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static axelar.nexus.v1beta1.ParamsOuterClass.Params parseFrom(
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
    public static Builder newBuilder(axelar.nexus.v1beta1.ParamsOuterClass.Params prototype) {
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
     * Params represent the genesis parameters for the module
     * </pre>
     *
     * Protobuf type {@code axelar.nexus.v1beta1.Params}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:axelar.nexus.v1beta1.Params)
        axelar.nexus.v1beta1.ParamsOuterClass.ParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return axelar.nexus.v1beta1.ParamsOuterClass.internal_static_axelar_nexus_v1beta1_Params_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return axelar.nexus.v1beta1.ParamsOuterClass.internal_static_axelar_nexus_v1beta1_Params_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                axelar.nexus.v1beta1.ParamsOuterClass.Params.class, axelar.nexus.v1beta1.ParamsOuterClass.Params.Builder.class);
      }

      // Construct using axelar.nexus.v1beta1.ParamsOuterClass.Params.newBuilder()
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
        if (chainActivationThresholdBuilder_ == null) {
          chainActivationThreshold_ = null;
        } else {
          chainActivationThreshold_ = null;
          chainActivationThresholdBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return axelar.nexus.v1beta1.ParamsOuterClass.internal_static_axelar_nexus_v1beta1_Params_descriptor;
      }

      @java.lang.Override
      public axelar.nexus.v1beta1.ParamsOuterClass.Params getDefaultInstanceForType() {
        return axelar.nexus.v1beta1.ParamsOuterClass.Params.getDefaultInstance();
      }

      @java.lang.Override
      public axelar.nexus.v1beta1.ParamsOuterClass.Params build() {
        axelar.nexus.v1beta1.ParamsOuterClass.Params result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public axelar.nexus.v1beta1.ParamsOuterClass.Params buildPartial() {
        axelar.nexus.v1beta1.ParamsOuterClass.Params result = new axelar.nexus.v1beta1.ParamsOuterClass.Params(this);
        if (chainActivationThresholdBuilder_ == null) {
          result.chainActivationThreshold_ = chainActivationThreshold_;
        } else {
          result.chainActivationThreshold_ = chainActivationThresholdBuilder_.build();
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
        if (other instanceof axelar.nexus.v1beta1.ParamsOuterClass.Params) {
          return mergeFrom((axelar.nexus.v1beta1.ParamsOuterClass.Params)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(axelar.nexus.v1beta1.ParamsOuterClass.Params other) {
        if (other == axelar.nexus.v1beta1.ParamsOuterClass.Params.getDefaultInstance()) return this;
        if (other.hasChainActivationThreshold()) {
          mergeChainActivationThreshold(other.getChainActivationThreshold());
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
        axelar.nexus.v1beta1.ParamsOuterClass.Params parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (axelar.nexus.v1beta1.ParamsOuterClass.Params) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private axelar.utils.v1beta1.ThresholdOuterClass.Threshold chainActivationThreshold_;
      private com.google.protobuf.SingleFieldBuilderV3<
          axelar.utils.v1beta1.ThresholdOuterClass.Threshold, axelar.utils.v1beta1.ThresholdOuterClass.Threshold.Builder, axelar.utils.v1beta1.ThresholdOuterClass.ThresholdOrBuilder> chainActivationThresholdBuilder_;
      /**
       * <code>.axelar.utils.v1beta1.Threshold chain_activation_threshold = 1 [(.gogoproto.nullable) = false];</code>
       * @return Whether the chainActivationThreshold field is set.
       */
      public boolean hasChainActivationThreshold() {
        return chainActivationThresholdBuilder_ != null || chainActivationThreshold_ != null;
      }
      /**
       * <code>.axelar.utils.v1beta1.Threshold chain_activation_threshold = 1 [(.gogoproto.nullable) = false];</code>
       * @return The chainActivationThreshold.
       */
      public axelar.utils.v1beta1.ThresholdOuterClass.Threshold getChainActivationThreshold() {
        if (chainActivationThresholdBuilder_ == null) {
          return chainActivationThreshold_ == null ? axelar.utils.v1beta1.ThresholdOuterClass.Threshold.getDefaultInstance() : chainActivationThreshold_;
        } else {
          return chainActivationThresholdBuilder_.getMessage();
        }
      }
      /**
       * <code>.axelar.utils.v1beta1.Threshold chain_activation_threshold = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setChainActivationThreshold(axelar.utils.v1beta1.ThresholdOuterClass.Threshold value) {
        if (chainActivationThresholdBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          chainActivationThreshold_ = value;
          onChanged();
        } else {
          chainActivationThresholdBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.axelar.utils.v1beta1.Threshold chain_activation_threshold = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setChainActivationThreshold(
          axelar.utils.v1beta1.ThresholdOuterClass.Threshold.Builder builderForValue) {
        if (chainActivationThresholdBuilder_ == null) {
          chainActivationThreshold_ = builderForValue.build();
          onChanged();
        } else {
          chainActivationThresholdBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.axelar.utils.v1beta1.Threshold chain_activation_threshold = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder mergeChainActivationThreshold(axelar.utils.v1beta1.ThresholdOuterClass.Threshold value) {
        if (chainActivationThresholdBuilder_ == null) {
          if (chainActivationThreshold_ != null) {
            chainActivationThreshold_ =
              axelar.utils.v1beta1.ThresholdOuterClass.Threshold.newBuilder(chainActivationThreshold_).mergeFrom(value).buildPartial();
          } else {
            chainActivationThreshold_ = value;
          }
          onChanged();
        } else {
          chainActivationThresholdBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.axelar.utils.v1beta1.Threshold chain_activation_threshold = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder clearChainActivationThreshold() {
        if (chainActivationThresholdBuilder_ == null) {
          chainActivationThreshold_ = null;
          onChanged();
        } else {
          chainActivationThreshold_ = null;
          chainActivationThresholdBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.axelar.utils.v1beta1.Threshold chain_activation_threshold = 1 [(.gogoproto.nullable) = false];</code>
       */
      public axelar.utils.v1beta1.ThresholdOuterClass.Threshold.Builder getChainActivationThresholdBuilder() {
        
        onChanged();
        return getChainActivationThresholdFieldBuilder().getBuilder();
      }
      /**
       * <code>.axelar.utils.v1beta1.Threshold chain_activation_threshold = 1 [(.gogoproto.nullable) = false];</code>
       */
      public axelar.utils.v1beta1.ThresholdOuterClass.ThresholdOrBuilder getChainActivationThresholdOrBuilder() {
        if (chainActivationThresholdBuilder_ != null) {
          return chainActivationThresholdBuilder_.getMessageOrBuilder();
        } else {
          return chainActivationThreshold_ == null ?
              axelar.utils.v1beta1.ThresholdOuterClass.Threshold.getDefaultInstance() : chainActivationThreshold_;
        }
      }
      /**
       * <code>.axelar.utils.v1beta1.Threshold chain_activation_threshold = 1 [(.gogoproto.nullable) = false];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          axelar.utils.v1beta1.ThresholdOuterClass.Threshold, axelar.utils.v1beta1.ThresholdOuterClass.Threshold.Builder, axelar.utils.v1beta1.ThresholdOuterClass.ThresholdOrBuilder> 
          getChainActivationThresholdFieldBuilder() {
        if (chainActivationThresholdBuilder_ == null) {
          chainActivationThresholdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              axelar.utils.v1beta1.ThresholdOuterClass.Threshold, axelar.utils.v1beta1.ThresholdOuterClass.Threshold.Builder, axelar.utils.v1beta1.ThresholdOuterClass.ThresholdOrBuilder>(
                  getChainActivationThreshold(),
                  getParentForChildren(),
                  isClean());
          chainActivationThreshold_ = null;
        }
        return chainActivationThresholdBuilder_;
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


      // @@protoc_insertion_point(builder_scope:axelar.nexus.v1beta1.Params)
    }

    // @@protoc_insertion_point(class_scope:axelar.nexus.v1beta1.Params)
    private static final axelar.nexus.v1beta1.ParamsOuterClass.Params DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new axelar.nexus.v1beta1.ParamsOuterClass.Params();
    }

    public static axelar.nexus.v1beta1.ParamsOuterClass.Params getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Params>
        PARSER = new com.google.protobuf.AbstractParser<Params>() {
      @java.lang.Override
      public Params parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Params(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Params> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Params> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public axelar.nexus.v1beta1.ParamsOuterClass.Params getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_axelar_nexus_v1beta1_Params_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_axelar_nexus_v1beta1_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!axelar/nexus/v1beta1/params.proto\022\024axe" +
      "lar.nexus.v1beta1\032\024gogoproto/gogo.proto\032" +
      "$axelar/utils/v1beta1/threshold.proto\"S\n" +
      "\006Params\022I\n\032chain_activation_threshold\030\001 " +
      "\001(\0132\037.axelar.utils.v1beta1.ThresholdB\004\310\336" +
      "\037\000B8Z2github.com/axelarnetwork/axelar-co" +
      "re/x/nexus/types\310\341\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf2.GoGoProtos.getDescriptor(),
          axelar.utils.v1beta1.ThresholdOuterClass.getDescriptor(),
        });
    internal_static_axelar_nexus_v1beta1_Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_axelar_nexus_v1beta1_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_axelar_nexus_v1beta1_Params_descriptor,
        new java.lang.String[] { "ChainActivationThreshold", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf2.GoGoProtos.goprotoGettersAll);
    registry.add(com.google.protobuf2.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf2.GoGoProtos.getDescriptor();
    axelar.utils.v1beta1.ThresholdOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
