// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/posts/v1beta1/params.proto

package desmos.posts.v1beta1;

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
      // @@protoc_insertion_point(interface_extends:desmos.posts.v1beta1.Params)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes max_post_message_length = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"max_post_message_length&#92;""];</code>
     * @return The maxPostMessageLength.
     */
    com.google.protobuf.ByteString getMaxPostMessageLength();

    /**
     * <code>bytes max_additional_attributes_fields_number = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"max_additional_attributes_fields_number&#92;""];</code>
     * @return The maxAdditionalAttributesFieldsNumber.
     */
    com.google.protobuf.ByteString getMaxAdditionalAttributesFieldsNumber();

    /**
     * <code>bytes max_additional_attributes_field_value_length = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"max_additional_attributes_field_value_length&#92;""];</code>
     * @return The maxAdditionalAttributesFieldValueLength.
     */
    com.google.protobuf.ByteString getMaxAdditionalAttributesFieldValueLength();

    /**
     * <code>bytes max_additional_attributes_field_key_length = 4 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"max_additional_attributes_field_key_length&#92;""];</code>
     * @return The maxAdditionalAttributesFieldKeyLength.
     */
    com.google.protobuf.ByteString getMaxAdditionalAttributesFieldKeyLength();
  }
  /**
   * <pre>
   * Params contains the parameters for the posts module
   * </pre>
   *
   * Protobuf type {@code desmos.posts.v1beta1.Params}
   */
  public static final class Params extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:desmos.posts.v1beta1.Params)
      ParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Params.newBuilder() to construct.
    private Params(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Params() {
      maxPostMessageLength_ = com.google.protobuf.ByteString.EMPTY;
      maxAdditionalAttributesFieldsNumber_ = com.google.protobuf.ByteString.EMPTY;
      maxAdditionalAttributesFieldValueLength_ = com.google.protobuf.ByteString.EMPTY;
      maxAdditionalAttributesFieldKeyLength_ = com.google.protobuf.ByteString.EMPTY;
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

              maxPostMessageLength_ = input.readBytes();
              break;
            }
            case 18: {

              maxAdditionalAttributesFieldsNumber_ = input.readBytes();
              break;
            }
            case 26: {

              maxAdditionalAttributesFieldValueLength_ = input.readBytes();
              break;
            }
            case 34: {

              maxAdditionalAttributesFieldKeyLength_ = input.readBytes();
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
      return desmos.posts.v1beta1.ParamsOuterClass.internal_static_desmos_posts_v1beta1_Params_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return desmos.posts.v1beta1.ParamsOuterClass.internal_static_desmos_posts_v1beta1_Params_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              desmos.posts.v1beta1.ParamsOuterClass.Params.class, desmos.posts.v1beta1.ParamsOuterClass.Params.Builder.class);
    }

    public static final int MAX_POST_MESSAGE_LENGTH_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString maxPostMessageLength_;
    /**
     * <code>bytes max_post_message_length = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"max_post_message_length&#92;""];</code>
     * @return The maxPostMessageLength.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getMaxPostMessageLength() {
      return maxPostMessageLength_;
    }

    public static final int MAX_ADDITIONAL_ATTRIBUTES_FIELDS_NUMBER_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString maxAdditionalAttributesFieldsNumber_;
    /**
     * <code>bytes max_additional_attributes_fields_number = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"max_additional_attributes_fields_number&#92;""];</code>
     * @return The maxAdditionalAttributesFieldsNumber.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getMaxAdditionalAttributesFieldsNumber() {
      return maxAdditionalAttributesFieldsNumber_;
    }

    public static final int MAX_ADDITIONAL_ATTRIBUTES_FIELD_VALUE_LENGTH_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString maxAdditionalAttributesFieldValueLength_;
    /**
     * <code>bytes max_additional_attributes_field_value_length = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"max_additional_attributes_field_value_length&#92;""];</code>
     * @return The maxAdditionalAttributesFieldValueLength.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getMaxAdditionalAttributesFieldValueLength() {
      return maxAdditionalAttributesFieldValueLength_;
    }

    public static final int MAX_ADDITIONAL_ATTRIBUTES_FIELD_KEY_LENGTH_FIELD_NUMBER = 4;
    private com.google.protobuf.ByteString maxAdditionalAttributesFieldKeyLength_;
    /**
     * <code>bytes max_additional_attributes_field_key_length = 4 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"max_additional_attributes_field_key_length&#92;""];</code>
     * @return The maxAdditionalAttributesFieldKeyLength.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getMaxAdditionalAttributesFieldKeyLength() {
      return maxAdditionalAttributesFieldKeyLength_;
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
      if (!maxPostMessageLength_.isEmpty()) {
        output.writeBytes(1, maxPostMessageLength_);
      }
      if (!maxAdditionalAttributesFieldsNumber_.isEmpty()) {
        output.writeBytes(2, maxAdditionalAttributesFieldsNumber_);
      }
      if (!maxAdditionalAttributesFieldValueLength_.isEmpty()) {
        output.writeBytes(3, maxAdditionalAttributesFieldValueLength_);
      }
      if (!maxAdditionalAttributesFieldKeyLength_.isEmpty()) {
        output.writeBytes(4, maxAdditionalAttributesFieldKeyLength_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!maxPostMessageLength_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, maxPostMessageLength_);
      }
      if (!maxAdditionalAttributesFieldsNumber_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, maxAdditionalAttributesFieldsNumber_);
      }
      if (!maxAdditionalAttributesFieldValueLength_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, maxAdditionalAttributesFieldValueLength_);
      }
      if (!maxAdditionalAttributesFieldKeyLength_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, maxAdditionalAttributesFieldKeyLength_);
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
      if (!(obj instanceof desmos.posts.v1beta1.ParamsOuterClass.Params)) {
        return super.equals(obj);
      }
      desmos.posts.v1beta1.ParamsOuterClass.Params other = (desmos.posts.v1beta1.ParamsOuterClass.Params) obj;

      if (!getMaxPostMessageLength()
          .equals(other.getMaxPostMessageLength())) return false;
      if (!getMaxAdditionalAttributesFieldsNumber()
          .equals(other.getMaxAdditionalAttributesFieldsNumber())) return false;
      if (!getMaxAdditionalAttributesFieldValueLength()
          .equals(other.getMaxAdditionalAttributesFieldValueLength())) return false;
      if (!getMaxAdditionalAttributesFieldKeyLength()
          .equals(other.getMaxAdditionalAttributesFieldKeyLength())) return false;
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
      hash = (37 * hash) + MAX_POST_MESSAGE_LENGTH_FIELD_NUMBER;
      hash = (53 * hash) + getMaxPostMessageLength().hashCode();
      hash = (37 * hash) + MAX_ADDITIONAL_ATTRIBUTES_FIELDS_NUMBER_FIELD_NUMBER;
      hash = (53 * hash) + getMaxAdditionalAttributesFieldsNumber().hashCode();
      hash = (37 * hash) + MAX_ADDITIONAL_ATTRIBUTES_FIELD_VALUE_LENGTH_FIELD_NUMBER;
      hash = (53 * hash) + getMaxAdditionalAttributesFieldValueLength().hashCode();
      hash = (37 * hash) + MAX_ADDITIONAL_ATTRIBUTES_FIELD_KEY_LENGTH_FIELD_NUMBER;
      hash = (53 * hash) + getMaxAdditionalAttributesFieldKeyLength().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static desmos.posts.v1beta1.ParamsOuterClass.Params parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static desmos.posts.v1beta1.ParamsOuterClass.Params parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static desmos.posts.v1beta1.ParamsOuterClass.Params parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static desmos.posts.v1beta1.ParamsOuterClass.Params parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static desmos.posts.v1beta1.ParamsOuterClass.Params parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static desmos.posts.v1beta1.ParamsOuterClass.Params parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static desmos.posts.v1beta1.ParamsOuterClass.Params parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static desmos.posts.v1beta1.ParamsOuterClass.Params parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static desmos.posts.v1beta1.ParamsOuterClass.Params parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static desmos.posts.v1beta1.ParamsOuterClass.Params parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static desmos.posts.v1beta1.ParamsOuterClass.Params parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static desmos.posts.v1beta1.ParamsOuterClass.Params parseFrom(
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
    public static Builder newBuilder(desmos.posts.v1beta1.ParamsOuterClass.Params prototype) {
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
     * Params contains the parameters for the posts module
     * </pre>
     *
     * Protobuf type {@code desmos.posts.v1beta1.Params}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:desmos.posts.v1beta1.Params)
        desmos.posts.v1beta1.ParamsOuterClass.ParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return desmos.posts.v1beta1.ParamsOuterClass.internal_static_desmos_posts_v1beta1_Params_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return desmos.posts.v1beta1.ParamsOuterClass.internal_static_desmos_posts_v1beta1_Params_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                desmos.posts.v1beta1.ParamsOuterClass.Params.class, desmos.posts.v1beta1.ParamsOuterClass.Params.Builder.class);
      }

      // Construct using desmos.posts.v1beta1.ParamsOuterClass.Params.newBuilder()
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
        maxPostMessageLength_ = com.google.protobuf.ByteString.EMPTY;

        maxAdditionalAttributesFieldsNumber_ = com.google.protobuf.ByteString.EMPTY;

        maxAdditionalAttributesFieldValueLength_ = com.google.protobuf.ByteString.EMPTY;

        maxAdditionalAttributesFieldKeyLength_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return desmos.posts.v1beta1.ParamsOuterClass.internal_static_desmos_posts_v1beta1_Params_descriptor;
      }

      @java.lang.Override
      public desmos.posts.v1beta1.ParamsOuterClass.Params getDefaultInstanceForType() {
        return desmos.posts.v1beta1.ParamsOuterClass.Params.getDefaultInstance();
      }

      @java.lang.Override
      public desmos.posts.v1beta1.ParamsOuterClass.Params build() {
        desmos.posts.v1beta1.ParamsOuterClass.Params result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public desmos.posts.v1beta1.ParamsOuterClass.Params buildPartial() {
        desmos.posts.v1beta1.ParamsOuterClass.Params result = new desmos.posts.v1beta1.ParamsOuterClass.Params(this);
        result.maxPostMessageLength_ = maxPostMessageLength_;
        result.maxAdditionalAttributesFieldsNumber_ = maxAdditionalAttributesFieldsNumber_;
        result.maxAdditionalAttributesFieldValueLength_ = maxAdditionalAttributesFieldValueLength_;
        result.maxAdditionalAttributesFieldKeyLength_ = maxAdditionalAttributesFieldKeyLength_;
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
        if (other instanceof desmos.posts.v1beta1.ParamsOuterClass.Params) {
          return mergeFrom((desmos.posts.v1beta1.ParamsOuterClass.Params)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(desmos.posts.v1beta1.ParamsOuterClass.Params other) {
        if (other == desmos.posts.v1beta1.ParamsOuterClass.Params.getDefaultInstance()) return this;
        if (other.getMaxPostMessageLength() != com.google.protobuf.ByteString.EMPTY) {
          setMaxPostMessageLength(other.getMaxPostMessageLength());
        }
        if (other.getMaxAdditionalAttributesFieldsNumber() != com.google.protobuf.ByteString.EMPTY) {
          setMaxAdditionalAttributesFieldsNumber(other.getMaxAdditionalAttributesFieldsNumber());
        }
        if (other.getMaxAdditionalAttributesFieldValueLength() != com.google.protobuf.ByteString.EMPTY) {
          setMaxAdditionalAttributesFieldValueLength(other.getMaxAdditionalAttributesFieldValueLength());
        }
        if (other.getMaxAdditionalAttributesFieldKeyLength() != com.google.protobuf.ByteString.EMPTY) {
          setMaxAdditionalAttributesFieldKeyLength(other.getMaxAdditionalAttributesFieldKeyLength());
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
        desmos.posts.v1beta1.ParamsOuterClass.Params parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (desmos.posts.v1beta1.ParamsOuterClass.Params) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.ByteString maxPostMessageLength_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes max_post_message_length = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"max_post_message_length&#92;""];</code>
       * @return The maxPostMessageLength.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getMaxPostMessageLength() {
        return maxPostMessageLength_;
      }
      /**
       * <code>bytes max_post_message_length = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"max_post_message_length&#92;""];</code>
       * @param value The maxPostMessageLength to set.
       * @return This builder for chaining.
       */
      public Builder setMaxPostMessageLength(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        maxPostMessageLength_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes max_post_message_length = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"max_post_message_length&#92;""];</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxPostMessageLength() {
        
        maxPostMessageLength_ = getDefaultInstance().getMaxPostMessageLength();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString maxAdditionalAttributesFieldsNumber_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes max_additional_attributes_fields_number = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"max_additional_attributes_fields_number&#92;""];</code>
       * @return The maxAdditionalAttributesFieldsNumber.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getMaxAdditionalAttributesFieldsNumber() {
        return maxAdditionalAttributesFieldsNumber_;
      }
      /**
       * <code>bytes max_additional_attributes_fields_number = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"max_additional_attributes_fields_number&#92;""];</code>
       * @param value The maxAdditionalAttributesFieldsNumber to set.
       * @return This builder for chaining.
       */
      public Builder setMaxAdditionalAttributesFieldsNumber(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        maxAdditionalAttributesFieldsNumber_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes max_additional_attributes_fields_number = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"max_additional_attributes_fields_number&#92;""];</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxAdditionalAttributesFieldsNumber() {
        
        maxAdditionalAttributesFieldsNumber_ = getDefaultInstance().getMaxAdditionalAttributesFieldsNumber();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString maxAdditionalAttributesFieldValueLength_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes max_additional_attributes_field_value_length = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"max_additional_attributes_field_value_length&#92;""];</code>
       * @return The maxAdditionalAttributesFieldValueLength.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getMaxAdditionalAttributesFieldValueLength() {
        return maxAdditionalAttributesFieldValueLength_;
      }
      /**
       * <code>bytes max_additional_attributes_field_value_length = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"max_additional_attributes_field_value_length&#92;""];</code>
       * @param value The maxAdditionalAttributesFieldValueLength to set.
       * @return This builder for chaining.
       */
      public Builder setMaxAdditionalAttributesFieldValueLength(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        maxAdditionalAttributesFieldValueLength_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes max_additional_attributes_field_value_length = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"max_additional_attributes_field_value_length&#92;""];</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxAdditionalAttributesFieldValueLength() {
        
        maxAdditionalAttributesFieldValueLength_ = getDefaultInstance().getMaxAdditionalAttributesFieldValueLength();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString maxAdditionalAttributesFieldKeyLength_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes max_additional_attributes_field_key_length = 4 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"max_additional_attributes_field_key_length&#92;""];</code>
       * @return The maxAdditionalAttributesFieldKeyLength.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getMaxAdditionalAttributesFieldKeyLength() {
        return maxAdditionalAttributesFieldKeyLength_;
      }
      /**
       * <code>bytes max_additional_attributes_field_key_length = 4 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"max_additional_attributes_field_key_length&#92;""];</code>
       * @param value The maxAdditionalAttributesFieldKeyLength to set.
       * @return This builder for chaining.
       */
      public Builder setMaxAdditionalAttributesFieldKeyLength(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        maxAdditionalAttributesFieldKeyLength_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes max_additional_attributes_field_key_length = 4 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.moretags) = "yaml:&#92;"max_additional_attributes_field_key_length&#92;""];</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxAdditionalAttributesFieldKeyLength() {
        
        maxAdditionalAttributesFieldKeyLength_ = getDefaultInstance().getMaxAdditionalAttributesFieldKeyLength();
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


      // @@protoc_insertion_point(builder_scope:desmos.posts.v1beta1.Params)
    }

    // @@protoc_insertion_point(class_scope:desmos.posts.v1beta1.Params)
    private static final desmos.posts.v1beta1.ParamsOuterClass.Params DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new desmos.posts.v1beta1.ParamsOuterClass.Params();
    }

    public static desmos.posts.v1beta1.ParamsOuterClass.Params getDefaultInstance() {
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
    public desmos.posts.v1beta1.ParamsOuterClass.Params getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_posts_v1beta1_Params_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_posts_v1beta1_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!desmos/posts/v1beta1/params.proto\022\024des" +
      "mos.posts.v1beta1\032\024gogoproto/gogo.proto\"" +
      "\307\004\n\006Params\022q\n\027max_post_message_length\030\001 " +
      "\001(\014BP\332\336\037&github.com/cosmos/cosmos-sdk/ty" +
      "pes.Int\310\336\037\000\362\336\037\036yaml:\"max_post_message_le" +
      "ngth\"\022\221\001\n\'max_additional_attributes_fiel" +
      "ds_number\030\002 \001(\014B`\332\336\037&github.com/cosmos/c" +
      "osmos-sdk/types.Int\310\336\037\000\362\336\037.yaml:\"max_add" +
      "itional_attributes_fields_number\"\022\233\001\n,ma" +
      "x_additional_attributes_field_value_leng" +
      "th\030\003 \001(\014Be\332\336\037&github.com/cosmos/cosmos-s" +
      "dk/types.Int\310\336\037\000\362\336\0373yaml:\"max_additional" +
      "_attributes_field_value_length\"\022\227\001\n*max_" +
      "additional_attributes_field_key_length\030\004" +
      " \001(\014Bc\332\336\037&github.com/cosmos/cosmos-sdk/t" +
      "ypes.Int\310\336\037\000\362\336\0371yaml:\"max_additional_att" +
      "ributes_field_key_length\"B8Z6github.com/" +
      "desmos-labs/desmos/v2/x/staging/posts/ty" +
      "pesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf2.GoGoProtos.getDescriptor(),
        });
    internal_static_desmos_posts_v1beta1_Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_desmos_posts_v1beta1_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_posts_v1beta1_Params_descriptor,
        new java.lang.String[] { "MaxPostMessageLength", "MaxAdditionalAttributesFieldsNumber", "MaxAdditionalAttributesFieldValueLength", "MaxAdditionalAttributesFieldKeyLength", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf2.GoGoProtos.customtype);
    registry.add(com.google.protobuf2.GoGoProtos.moretags);
    registry.add(com.google.protobuf2.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf2.GoGoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
