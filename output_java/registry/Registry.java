// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: burrow/registry.proto

package registry;

public final class Registry {
  private Registry() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NodeIdentityOrBuilder extends
      // @@protoc_insertion_point(interface_extends:registry.NodeIdentity)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Peer moniker name
     * </pre>
     *
     * <code>string Moniker = 1;</code>
     * @return The moniker.
     */
    java.lang.String getMoniker();
    /**
     * <pre>
     * Peer moniker name
     * </pre>
     *
     * <code>string Moniker = 1;</code>
     * @return The bytes for moniker.
     */
    com.google.protobuf.ByteString
        getMonikerBytes();

    /**
     * <pre>
     * Peer network address
     * </pre>
     *
     * <code>string NetworkAddress = 2;</code>
     * @return The networkAddress.
     */
    java.lang.String getNetworkAddress();
    /**
     * <pre>
     * Peer network address
     * </pre>
     *
     * <code>string NetworkAddress = 2;</code>
     * @return The bytes for networkAddress.
     */
    com.google.protobuf.ByteString
        getNetworkAddressBytes();

    /**
     * <pre>
     * The Tendermint p2p node ID
     * </pre>
     *
     * <code>bytes TendermintNodeID = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/hyperledger/burrow/crypto.Address"];</code>
     * @return The tendermintNodeID.
     */
    com.google.protobuf.ByteString getTendermintNodeID();

    /**
     * <pre>
     * The public key that this node will validate with if it becomes a validator 
     * (use this to create a binding between p2p node ID and validator)
     * </pre>
     *
     * <code>bytes ValidatorPublicKey = 4 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/hyperledger/burrow/crypto.PublicKey"];</code>
     * @return The validatorPublicKey.
     */
    com.google.protobuf.ByteString getValidatorPublicKey();
  }
  /**
   * <pre>
   * NodeIdentity stores and establishes a binding between 4 different types of identifiers, a human readable name,
   * a advertised network address, a p2p station-to-station key, and a validator key. Updates must be signed
   * by the node key and the validator key to prove the update is consensual.
   * </pre>
   *
   * Protobuf type {@code registry.NodeIdentity}
   */
  public static final class NodeIdentity extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:registry.NodeIdentity)
      NodeIdentityOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NodeIdentity.newBuilder() to construct.
    private NodeIdentity(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NodeIdentity() {
      moniker_ = "";
      networkAddress_ = "";
      tendermintNodeID_ = com.google.protobuf.ByteString.EMPTY;
      validatorPublicKey_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new NodeIdentity();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private NodeIdentity(
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

              moniker_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              networkAddress_ = s;
              break;
            }
            case 26: {

              tendermintNodeID_ = input.readBytes();
              break;
            }
            case 34: {

              validatorPublicKey_ = input.readBytes();
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
      return registry.Registry.internal_static_registry_NodeIdentity_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return registry.Registry.internal_static_registry_NodeIdentity_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              registry.Registry.NodeIdentity.class, registry.Registry.NodeIdentity.Builder.class);
    }

    public static final int MONIKER_FIELD_NUMBER = 1;
    private volatile java.lang.Object moniker_;
    /**
     * <pre>
     * Peer moniker name
     * </pre>
     *
     * <code>string Moniker = 1;</code>
     * @return The moniker.
     */
    @java.lang.Override
    public java.lang.String getMoniker() {
      java.lang.Object ref = moniker_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        moniker_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Peer moniker name
     * </pre>
     *
     * <code>string Moniker = 1;</code>
     * @return The bytes for moniker.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getMonikerBytes() {
      java.lang.Object ref = moniker_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        moniker_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int NETWORKADDRESS_FIELD_NUMBER = 2;
    private volatile java.lang.Object networkAddress_;
    /**
     * <pre>
     * Peer network address
     * </pre>
     *
     * <code>string NetworkAddress = 2;</code>
     * @return The networkAddress.
     */
    @java.lang.Override
    public java.lang.String getNetworkAddress() {
      java.lang.Object ref = networkAddress_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        networkAddress_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Peer network address
     * </pre>
     *
     * <code>string NetworkAddress = 2;</code>
     * @return The bytes for networkAddress.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNetworkAddressBytes() {
      java.lang.Object ref = networkAddress_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        networkAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TENDERMINTNODEID_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString tendermintNodeID_;
    /**
     * <pre>
     * The Tendermint p2p node ID
     * </pre>
     *
     * <code>bytes TendermintNodeID = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/hyperledger/burrow/crypto.Address"];</code>
     * @return The tendermintNodeID.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getTendermintNodeID() {
      return tendermintNodeID_;
    }

    public static final int VALIDATORPUBLICKEY_FIELD_NUMBER = 4;
    private com.google.protobuf.ByteString validatorPublicKey_;
    /**
     * <pre>
     * The public key that this node will validate with if it becomes a validator 
     * (use this to create a binding between p2p node ID and validator)
     * </pre>
     *
     * <code>bytes ValidatorPublicKey = 4 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/hyperledger/burrow/crypto.PublicKey"];</code>
     * @return The validatorPublicKey.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getValidatorPublicKey() {
      return validatorPublicKey_;
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
      if (!getMonikerBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, moniker_);
      }
      if (!getNetworkAddressBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, networkAddress_);
      }
      if (!tendermintNodeID_.isEmpty()) {
        output.writeBytes(3, tendermintNodeID_);
      }
      if (!validatorPublicKey_.isEmpty()) {
        output.writeBytes(4, validatorPublicKey_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getMonikerBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, moniker_);
      }
      if (!getNetworkAddressBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, networkAddress_);
      }
      if (!tendermintNodeID_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, tendermintNodeID_);
      }
      if (!validatorPublicKey_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, validatorPublicKey_);
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
      if (!(obj instanceof registry.Registry.NodeIdentity)) {
        return super.equals(obj);
      }
      registry.Registry.NodeIdentity other = (registry.Registry.NodeIdentity) obj;

      if (!getMoniker()
          .equals(other.getMoniker())) return false;
      if (!getNetworkAddress()
          .equals(other.getNetworkAddress())) return false;
      if (!getTendermintNodeID()
          .equals(other.getTendermintNodeID())) return false;
      if (!getValidatorPublicKey()
          .equals(other.getValidatorPublicKey())) return false;
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
      hash = (37 * hash) + MONIKER_FIELD_NUMBER;
      hash = (53 * hash) + getMoniker().hashCode();
      hash = (37 * hash) + NETWORKADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getNetworkAddress().hashCode();
      hash = (37 * hash) + TENDERMINTNODEID_FIELD_NUMBER;
      hash = (53 * hash) + getTendermintNodeID().hashCode();
      hash = (37 * hash) + VALIDATORPUBLICKEY_FIELD_NUMBER;
      hash = (53 * hash) + getValidatorPublicKey().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static registry.Registry.NodeIdentity parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static registry.Registry.NodeIdentity parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static registry.Registry.NodeIdentity parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static registry.Registry.NodeIdentity parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static registry.Registry.NodeIdentity parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static registry.Registry.NodeIdentity parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static registry.Registry.NodeIdentity parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static registry.Registry.NodeIdentity parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static registry.Registry.NodeIdentity parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static registry.Registry.NodeIdentity parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static registry.Registry.NodeIdentity parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static registry.Registry.NodeIdentity parseFrom(
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
    public static Builder newBuilder(registry.Registry.NodeIdentity prototype) {
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
     * NodeIdentity stores and establishes a binding between 4 different types of identifiers, a human readable name,
     * a advertised network address, a p2p station-to-station key, and a validator key. Updates must be signed
     * by the node key and the validator key to prove the update is consensual.
     * </pre>
     *
     * Protobuf type {@code registry.NodeIdentity}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:registry.NodeIdentity)
        registry.Registry.NodeIdentityOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return registry.Registry.internal_static_registry_NodeIdentity_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return registry.Registry.internal_static_registry_NodeIdentity_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                registry.Registry.NodeIdentity.class, registry.Registry.NodeIdentity.Builder.class);
      }

      // Construct using registry.Registry.NodeIdentity.newBuilder()
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
        moniker_ = "";

        networkAddress_ = "";

        tendermintNodeID_ = com.google.protobuf.ByteString.EMPTY;

        validatorPublicKey_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return registry.Registry.internal_static_registry_NodeIdentity_descriptor;
      }

      @java.lang.Override
      public registry.Registry.NodeIdentity getDefaultInstanceForType() {
        return registry.Registry.NodeIdentity.getDefaultInstance();
      }

      @java.lang.Override
      public registry.Registry.NodeIdentity build() {
        registry.Registry.NodeIdentity result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public registry.Registry.NodeIdentity buildPartial() {
        registry.Registry.NodeIdentity result = new registry.Registry.NodeIdentity(this);
        result.moniker_ = moniker_;
        result.networkAddress_ = networkAddress_;
        result.tendermintNodeID_ = tendermintNodeID_;
        result.validatorPublicKey_ = validatorPublicKey_;
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
        if (other instanceof registry.Registry.NodeIdentity) {
          return mergeFrom((registry.Registry.NodeIdentity)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(registry.Registry.NodeIdentity other) {
        if (other == registry.Registry.NodeIdentity.getDefaultInstance()) return this;
        if (!other.getMoniker().isEmpty()) {
          moniker_ = other.moniker_;
          onChanged();
        }
        if (!other.getNetworkAddress().isEmpty()) {
          networkAddress_ = other.networkAddress_;
          onChanged();
        }
        if (other.getTendermintNodeID() != com.google.protobuf.ByteString.EMPTY) {
          setTendermintNodeID(other.getTendermintNodeID());
        }
        if (other.getValidatorPublicKey() != com.google.protobuf.ByteString.EMPTY) {
          setValidatorPublicKey(other.getValidatorPublicKey());
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
        registry.Registry.NodeIdentity parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (registry.Registry.NodeIdentity) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object moniker_ = "";
      /**
       * <pre>
       * Peer moniker name
       * </pre>
       *
       * <code>string Moniker = 1;</code>
       * @return The moniker.
       */
      public java.lang.String getMoniker() {
        java.lang.Object ref = moniker_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          moniker_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Peer moniker name
       * </pre>
       *
       * <code>string Moniker = 1;</code>
       * @return The bytes for moniker.
       */
      public com.google.protobuf.ByteString
          getMonikerBytes() {
        java.lang.Object ref = moniker_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          moniker_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Peer moniker name
       * </pre>
       *
       * <code>string Moniker = 1;</code>
       * @param value The moniker to set.
       * @return This builder for chaining.
       */
      public Builder setMoniker(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        moniker_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Peer moniker name
       * </pre>
       *
       * <code>string Moniker = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMoniker() {
        
        moniker_ = getDefaultInstance().getMoniker();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Peer moniker name
       * </pre>
       *
       * <code>string Moniker = 1;</code>
       * @param value The bytes for moniker to set.
       * @return This builder for chaining.
       */
      public Builder setMonikerBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        moniker_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object networkAddress_ = "";
      /**
       * <pre>
       * Peer network address
       * </pre>
       *
       * <code>string NetworkAddress = 2;</code>
       * @return The networkAddress.
       */
      public java.lang.String getNetworkAddress() {
        java.lang.Object ref = networkAddress_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          networkAddress_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Peer network address
       * </pre>
       *
       * <code>string NetworkAddress = 2;</code>
       * @return The bytes for networkAddress.
       */
      public com.google.protobuf.ByteString
          getNetworkAddressBytes() {
        java.lang.Object ref = networkAddress_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          networkAddress_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Peer network address
       * </pre>
       *
       * <code>string NetworkAddress = 2;</code>
       * @param value The networkAddress to set.
       * @return This builder for chaining.
       */
      public Builder setNetworkAddress(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        networkAddress_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Peer network address
       * </pre>
       *
       * <code>string NetworkAddress = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearNetworkAddress() {
        
        networkAddress_ = getDefaultInstance().getNetworkAddress();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Peer network address
       * </pre>
       *
       * <code>string NetworkAddress = 2;</code>
       * @param value The bytes for networkAddress to set.
       * @return This builder for chaining.
       */
      public Builder setNetworkAddressBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        networkAddress_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString tendermintNodeID_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       * The Tendermint p2p node ID
       * </pre>
       *
       * <code>bytes TendermintNodeID = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/hyperledger/burrow/crypto.Address"];</code>
       * @return The tendermintNodeID.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getTendermintNodeID() {
        return tendermintNodeID_;
      }
      /**
       * <pre>
       * The Tendermint p2p node ID
       * </pre>
       *
       * <code>bytes TendermintNodeID = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/hyperledger/burrow/crypto.Address"];</code>
       * @param value The tendermintNodeID to set.
       * @return This builder for chaining.
       */
      public Builder setTendermintNodeID(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        tendermintNodeID_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The Tendermint p2p node ID
       * </pre>
       *
       * <code>bytes TendermintNodeID = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/hyperledger/burrow/crypto.Address"];</code>
       * @return This builder for chaining.
       */
      public Builder clearTendermintNodeID() {
        
        tendermintNodeID_ = getDefaultInstance().getTendermintNodeID();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString validatorPublicKey_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       * The public key that this node will validate with if it becomes a validator 
       * (use this to create a binding between p2p node ID and validator)
       * </pre>
       *
       * <code>bytes ValidatorPublicKey = 4 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/hyperledger/burrow/crypto.PublicKey"];</code>
       * @return The validatorPublicKey.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getValidatorPublicKey() {
        return validatorPublicKey_;
      }
      /**
       * <pre>
       * The public key that this node will validate with if it becomes a validator 
       * (use this to create a binding between p2p node ID and validator)
       * </pre>
       *
       * <code>bytes ValidatorPublicKey = 4 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/hyperledger/burrow/crypto.PublicKey"];</code>
       * @param value The validatorPublicKey to set.
       * @return This builder for chaining.
       */
      public Builder setValidatorPublicKey(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        validatorPublicKey_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The public key that this node will validate with if it becomes a validator 
       * (use this to create a binding between p2p node ID and validator)
       * </pre>
       *
       * <code>bytes ValidatorPublicKey = 4 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/hyperledger/burrow/crypto.PublicKey"];</code>
       * @return This builder for chaining.
       */
      public Builder clearValidatorPublicKey() {
        
        validatorPublicKey_ = getDefaultInstance().getValidatorPublicKey();
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


      // @@protoc_insertion_point(builder_scope:registry.NodeIdentity)
    }

    // @@protoc_insertion_point(class_scope:registry.NodeIdentity)
    private static final registry.Registry.NodeIdentity DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new registry.Registry.NodeIdentity();
    }

    public static registry.Registry.NodeIdentity getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NodeIdentity>
        PARSER = new com.google.protobuf.AbstractParser<NodeIdentity>() {
      @java.lang.Override
      public NodeIdentity parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new NodeIdentity(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<NodeIdentity> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NodeIdentity> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public registry.Registry.NodeIdentity getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_registry_NodeIdentity_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_registry_NodeIdentity_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025burrow/registry.proto\022\010registry\032\024gogop" +
      "roto/gogo.proto\"\341\001\n\014NodeIdentity\022\017\n\007Moni" +
      "ker\030\001 \001(\t\022\026\n\016NetworkAddress\030\002 \001(\t\022N\n\020Ten" +
      "dermintNodeID\030\003 \001(\014B4\332\336\037,github.com/hype" +
      "rledger/burrow/crypto.Address\310\336\037\000\022R\n\022Val" +
      "idatorPublicKey\030\004 \001(\014B6\332\336\037.github.com/hy" +
      "perledger/burrow/crypto.PublicKey\310\336\037\000:\004\230" +
      "\240\037\000BJZ0github.com/hyperledger/burrow/exe" +
      "cution/registry\330\342\036\001\310\342\036\001\320\342\036\001\340\342\036\001\300\343\036\001\310\343\036\001b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.GoGoProtos.getDescriptor(),
        });
    internal_static_registry_NodeIdentity_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_registry_NodeIdentity_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_registry_NodeIdentity_descriptor,
        new java.lang.String[] { "Moniker", "NetworkAddress", "TendermintNodeID", "ValidatorPublicKey", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.customtype);
    registry.add(com.google.protobuf.GoGoProtos.goprotoRegistration);
    registry.add(com.google.protobuf.GoGoProtos.goprotoStringer);
    registry.add(com.google.protobuf.GoGoProtos.marshalerAll);
    registry.add(com.google.protobuf.GoGoProtos.messagenameAll);
    registry.add(com.google.protobuf.GoGoProtos.nullable);
    registry.add(com.google.protobuf.GoGoProtos.sizerAll);
    registry.add(com.google.protobuf.GoGoProtos.stableMarshalerAll);
    registry.add(com.google.protobuf.GoGoProtos.unmarshalerAll);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
