package coreum.asset.nft.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: coreum/asset/nft/v1/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "coreum.asset.nft.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<coreum.asset.nft.v1.Tx.MsgIssueClass,
      coreum.asset.nft.v1.Tx.EmptyResponse> getIssueClassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IssueClass",
      requestType = coreum.asset.nft.v1.Tx.MsgIssueClass.class,
      responseType = coreum.asset.nft.v1.Tx.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<coreum.asset.nft.v1.Tx.MsgIssueClass,
      coreum.asset.nft.v1.Tx.EmptyResponse> getIssueClassMethod() {
    io.grpc.MethodDescriptor<coreum.asset.nft.v1.Tx.MsgIssueClass, coreum.asset.nft.v1.Tx.EmptyResponse> getIssueClassMethod;
    if ((getIssueClassMethod = MsgGrpc.getIssueClassMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getIssueClassMethod = MsgGrpc.getIssueClassMethod) == null) {
          MsgGrpc.getIssueClassMethod = getIssueClassMethod =
              io.grpc.MethodDescriptor.<coreum.asset.nft.v1.Tx.MsgIssueClass, coreum.asset.nft.v1.Tx.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IssueClass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.nft.v1.Tx.MsgIssueClass.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.nft.v1.Tx.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("IssueClass"))
              .build();
        }
      }
    }
    return getIssueClassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<coreum.asset.nft.v1.Tx.MsgMint,
      coreum.asset.nft.v1.Tx.EmptyResponse> getMintMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Mint",
      requestType = coreum.asset.nft.v1.Tx.MsgMint.class,
      responseType = coreum.asset.nft.v1.Tx.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<coreum.asset.nft.v1.Tx.MsgMint,
      coreum.asset.nft.v1.Tx.EmptyResponse> getMintMethod() {
    io.grpc.MethodDescriptor<coreum.asset.nft.v1.Tx.MsgMint, coreum.asset.nft.v1.Tx.EmptyResponse> getMintMethod;
    if ((getMintMethod = MsgGrpc.getMintMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMintMethod = MsgGrpc.getMintMethod) == null) {
          MsgGrpc.getMintMethod = getMintMethod =
              io.grpc.MethodDescriptor.<coreum.asset.nft.v1.Tx.MsgMint, coreum.asset.nft.v1.Tx.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Mint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.nft.v1.Tx.MsgMint.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.nft.v1.Tx.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Mint"))
              .build();
        }
      }
    }
    return getMintMethod;
  }

  private static volatile io.grpc.MethodDescriptor<coreum.asset.nft.v1.Tx.MsgBurn,
      coreum.asset.nft.v1.Tx.EmptyResponse> getBurnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Burn",
      requestType = coreum.asset.nft.v1.Tx.MsgBurn.class,
      responseType = coreum.asset.nft.v1.Tx.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<coreum.asset.nft.v1.Tx.MsgBurn,
      coreum.asset.nft.v1.Tx.EmptyResponse> getBurnMethod() {
    io.grpc.MethodDescriptor<coreum.asset.nft.v1.Tx.MsgBurn, coreum.asset.nft.v1.Tx.EmptyResponse> getBurnMethod;
    if ((getBurnMethod = MsgGrpc.getBurnMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBurnMethod = MsgGrpc.getBurnMethod) == null) {
          MsgGrpc.getBurnMethod = getBurnMethod =
              io.grpc.MethodDescriptor.<coreum.asset.nft.v1.Tx.MsgBurn, coreum.asset.nft.v1.Tx.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Burn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.nft.v1.Tx.MsgBurn.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.nft.v1.Tx.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Burn"))
              .build();
        }
      }
    }
    return getBurnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<coreum.asset.nft.v1.Tx.MsgFreeze,
      coreum.asset.nft.v1.Tx.EmptyResponse> getFreezeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Freeze",
      requestType = coreum.asset.nft.v1.Tx.MsgFreeze.class,
      responseType = coreum.asset.nft.v1.Tx.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<coreum.asset.nft.v1.Tx.MsgFreeze,
      coreum.asset.nft.v1.Tx.EmptyResponse> getFreezeMethod() {
    io.grpc.MethodDescriptor<coreum.asset.nft.v1.Tx.MsgFreeze, coreum.asset.nft.v1.Tx.EmptyResponse> getFreezeMethod;
    if ((getFreezeMethod = MsgGrpc.getFreezeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getFreezeMethod = MsgGrpc.getFreezeMethod) == null) {
          MsgGrpc.getFreezeMethod = getFreezeMethod =
              io.grpc.MethodDescriptor.<coreum.asset.nft.v1.Tx.MsgFreeze, coreum.asset.nft.v1.Tx.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Freeze"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.nft.v1.Tx.MsgFreeze.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.nft.v1.Tx.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Freeze"))
              .build();
        }
      }
    }
    return getFreezeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<coreum.asset.nft.v1.Tx.MsgUnfreeze,
      coreum.asset.nft.v1.Tx.EmptyResponse> getUnfreezeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Unfreeze",
      requestType = coreum.asset.nft.v1.Tx.MsgUnfreeze.class,
      responseType = coreum.asset.nft.v1.Tx.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<coreum.asset.nft.v1.Tx.MsgUnfreeze,
      coreum.asset.nft.v1.Tx.EmptyResponse> getUnfreezeMethod() {
    io.grpc.MethodDescriptor<coreum.asset.nft.v1.Tx.MsgUnfreeze, coreum.asset.nft.v1.Tx.EmptyResponse> getUnfreezeMethod;
    if ((getUnfreezeMethod = MsgGrpc.getUnfreezeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUnfreezeMethod = MsgGrpc.getUnfreezeMethod) == null) {
          MsgGrpc.getUnfreezeMethod = getUnfreezeMethod =
              io.grpc.MethodDescriptor.<coreum.asset.nft.v1.Tx.MsgUnfreeze, coreum.asset.nft.v1.Tx.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Unfreeze"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.nft.v1.Tx.MsgUnfreeze.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.nft.v1.Tx.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Unfreeze"))
              .build();
        }
      }
    }
    return getUnfreezeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<coreum.asset.nft.v1.Tx.MsgAddToWhitelist,
      coreum.asset.nft.v1.Tx.EmptyResponse> getAddToWhitelistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddToWhitelist",
      requestType = coreum.asset.nft.v1.Tx.MsgAddToWhitelist.class,
      responseType = coreum.asset.nft.v1.Tx.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<coreum.asset.nft.v1.Tx.MsgAddToWhitelist,
      coreum.asset.nft.v1.Tx.EmptyResponse> getAddToWhitelistMethod() {
    io.grpc.MethodDescriptor<coreum.asset.nft.v1.Tx.MsgAddToWhitelist, coreum.asset.nft.v1.Tx.EmptyResponse> getAddToWhitelistMethod;
    if ((getAddToWhitelistMethod = MsgGrpc.getAddToWhitelistMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddToWhitelistMethod = MsgGrpc.getAddToWhitelistMethod) == null) {
          MsgGrpc.getAddToWhitelistMethod = getAddToWhitelistMethod =
              io.grpc.MethodDescriptor.<coreum.asset.nft.v1.Tx.MsgAddToWhitelist, coreum.asset.nft.v1.Tx.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddToWhitelist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.nft.v1.Tx.MsgAddToWhitelist.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.nft.v1.Tx.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddToWhitelist"))
              .build();
        }
      }
    }
    return getAddToWhitelistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<coreum.asset.nft.v1.Tx.MsgRemoveFromWhitelist,
      coreum.asset.nft.v1.Tx.EmptyResponse> getRemoveFromWhitelistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveFromWhitelist",
      requestType = coreum.asset.nft.v1.Tx.MsgRemoveFromWhitelist.class,
      responseType = coreum.asset.nft.v1.Tx.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<coreum.asset.nft.v1.Tx.MsgRemoveFromWhitelist,
      coreum.asset.nft.v1.Tx.EmptyResponse> getRemoveFromWhitelistMethod() {
    io.grpc.MethodDescriptor<coreum.asset.nft.v1.Tx.MsgRemoveFromWhitelist, coreum.asset.nft.v1.Tx.EmptyResponse> getRemoveFromWhitelistMethod;
    if ((getRemoveFromWhitelistMethod = MsgGrpc.getRemoveFromWhitelistMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemoveFromWhitelistMethod = MsgGrpc.getRemoveFromWhitelistMethod) == null) {
          MsgGrpc.getRemoveFromWhitelistMethod = getRemoveFromWhitelistMethod =
              io.grpc.MethodDescriptor.<coreum.asset.nft.v1.Tx.MsgRemoveFromWhitelist, coreum.asset.nft.v1.Tx.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveFromWhitelist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.nft.v1.Tx.MsgRemoveFromWhitelist.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.nft.v1.Tx.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemoveFromWhitelist"))
              .build();
        }
      }
    }
    return getRemoveFromWhitelistMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MsgStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgStub>() {
        @java.lang.Override
        public MsgStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgStub(channel, callOptions);
        }
      };
    return MsgStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MsgBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgBlockingStub>() {
        @java.lang.Override
        public MsgBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgBlockingStub(channel, callOptions);
        }
      };
    return MsgBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MsgFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgFutureStub>() {
        @java.lang.Override
        public MsgFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgFutureStub(channel, callOptions);
        }
      };
    return MsgFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Msg defines the Msg service.
   * </pre>
   */
  public static abstract class MsgImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * IssueClass creates new non-fungible token class.
     * </pre>
     */
    public void issueClass(coreum.asset.nft.v1.Tx.MsgIssueClass request,
        io.grpc.stub.StreamObserver<coreum.asset.nft.v1.Tx.EmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getIssueClassMethod(), responseObserver);
    }

    /**
     * <pre>
     * Mint mints new non-fungible token in the class.
     * </pre>
     */
    public void mint(coreum.asset.nft.v1.Tx.MsgMint request,
        io.grpc.stub.StreamObserver<coreum.asset.nft.v1.Tx.EmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMintMethod(), responseObserver);
    }

    /**
     * <pre>
     * Burn burns the existing non-fungible token in the class.
     * </pre>
     */
    public void burn(coreum.asset.nft.v1.Tx.MsgBurn request,
        io.grpc.stub.StreamObserver<coreum.asset.nft.v1.Tx.EmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBurnMethod(), responseObserver);
    }

    /**
     * <pre>
     * Freeze freezes an NFT
     * </pre>
     */
    public void freeze(coreum.asset.nft.v1.Tx.MsgFreeze request,
        io.grpc.stub.StreamObserver<coreum.asset.nft.v1.Tx.EmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFreezeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unfreeze removes the freeze effect already put on an NFT
     * </pre>
     */
    public void unfreeze(coreum.asset.nft.v1.Tx.MsgUnfreeze request,
        io.grpc.stub.StreamObserver<coreum.asset.nft.v1.Tx.EmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnfreezeMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddToWhitelist sets the account as whitelisted to hold the NFT
     * </pre>
     */
    public void addToWhitelist(coreum.asset.nft.v1.Tx.MsgAddToWhitelist request,
        io.grpc.stub.StreamObserver<coreum.asset.nft.v1.Tx.EmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddToWhitelistMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveFromWhitelist removes an account from whitelisted list of the NFT
     * </pre>
     */
    public void removeFromWhitelist(coreum.asset.nft.v1.Tx.MsgRemoveFromWhitelist request,
        io.grpc.stub.StreamObserver<coreum.asset.nft.v1.Tx.EmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveFromWhitelistMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getIssueClassMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                coreum.asset.nft.v1.Tx.MsgIssueClass,
                coreum.asset.nft.v1.Tx.EmptyResponse>(
                  this, METHODID_ISSUE_CLASS)))
          .addMethod(
            getMintMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                coreum.asset.nft.v1.Tx.MsgMint,
                coreum.asset.nft.v1.Tx.EmptyResponse>(
                  this, METHODID_MINT)))
          .addMethod(
            getBurnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                coreum.asset.nft.v1.Tx.MsgBurn,
                coreum.asset.nft.v1.Tx.EmptyResponse>(
                  this, METHODID_BURN)))
          .addMethod(
            getFreezeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                coreum.asset.nft.v1.Tx.MsgFreeze,
                coreum.asset.nft.v1.Tx.EmptyResponse>(
                  this, METHODID_FREEZE)))
          .addMethod(
            getUnfreezeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                coreum.asset.nft.v1.Tx.MsgUnfreeze,
                coreum.asset.nft.v1.Tx.EmptyResponse>(
                  this, METHODID_UNFREEZE)))
          .addMethod(
            getAddToWhitelistMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                coreum.asset.nft.v1.Tx.MsgAddToWhitelist,
                coreum.asset.nft.v1.Tx.EmptyResponse>(
                  this, METHODID_ADD_TO_WHITELIST)))
          .addMethod(
            getRemoveFromWhitelistMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                coreum.asset.nft.v1.Tx.MsgRemoveFromWhitelist,
                coreum.asset.nft.v1.Tx.EmptyResponse>(
                  this, METHODID_REMOVE_FROM_WHITELIST)))
          .build();
    }
  }

  /**
   * <pre>
   * Msg defines the Msg service.
   * </pre>
   */
  public static final class MsgStub extends io.grpc.stub.AbstractAsyncStub<MsgStub> {
    private MsgStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgStub(channel, callOptions);
    }

    /**
     * <pre>
     * IssueClass creates new non-fungible token class.
     * </pre>
     */
    public void issueClass(coreum.asset.nft.v1.Tx.MsgIssueClass request,
        io.grpc.stub.StreamObserver<coreum.asset.nft.v1.Tx.EmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIssueClassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Mint mints new non-fungible token in the class.
     * </pre>
     */
    public void mint(coreum.asset.nft.v1.Tx.MsgMint request,
        io.grpc.stub.StreamObserver<coreum.asset.nft.v1.Tx.EmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMintMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Burn burns the existing non-fungible token in the class.
     * </pre>
     */
    public void burn(coreum.asset.nft.v1.Tx.MsgBurn request,
        io.grpc.stub.StreamObserver<coreum.asset.nft.v1.Tx.EmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBurnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Freeze freezes an NFT
     * </pre>
     */
    public void freeze(coreum.asset.nft.v1.Tx.MsgFreeze request,
        io.grpc.stub.StreamObserver<coreum.asset.nft.v1.Tx.EmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFreezeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unfreeze removes the freeze effect already put on an NFT
     * </pre>
     */
    public void unfreeze(coreum.asset.nft.v1.Tx.MsgUnfreeze request,
        io.grpc.stub.StreamObserver<coreum.asset.nft.v1.Tx.EmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnfreezeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddToWhitelist sets the account as whitelisted to hold the NFT
     * </pre>
     */
    public void addToWhitelist(coreum.asset.nft.v1.Tx.MsgAddToWhitelist request,
        io.grpc.stub.StreamObserver<coreum.asset.nft.v1.Tx.EmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddToWhitelistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveFromWhitelist removes an account from whitelisted list of the NFT
     * </pre>
     */
    public void removeFromWhitelist(coreum.asset.nft.v1.Tx.MsgRemoveFromWhitelist request,
        io.grpc.stub.StreamObserver<coreum.asset.nft.v1.Tx.EmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveFromWhitelistMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Msg defines the Msg service.
   * </pre>
   */
  public static final class MsgBlockingStub extends io.grpc.stub.AbstractBlockingStub<MsgBlockingStub> {
    private MsgBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * IssueClass creates new non-fungible token class.
     * </pre>
     */
    public coreum.asset.nft.v1.Tx.EmptyResponse issueClass(coreum.asset.nft.v1.Tx.MsgIssueClass request) {
      return blockingUnaryCall(
          getChannel(), getIssueClassMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Mint mints new non-fungible token in the class.
     * </pre>
     */
    public coreum.asset.nft.v1.Tx.EmptyResponse mint(coreum.asset.nft.v1.Tx.MsgMint request) {
      return blockingUnaryCall(
          getChannel(), getMintMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Burn burns the existing non-fungible token in the class.
     * </pre>
     */
    public coreum.asset.nft.v1.Tx.EmptyResponse burn(coreum.asset.nft.v1.Tx.MsgBurn request) {
      return blockingUnaryCall(
          getChannel(), getBurnMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Freeze freezes an NFT
     * </pre>
     */
    public coreum.asset.nft.v1.Tx.EmptyResponse freeze(coreum.asset.nft.v1.Tx.MsgFreeze request) {
      return blockingUnaryCall(
          getChannel(), getFreezeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unfreeze removes the freeze effect already put on an NFT
     * </pre>
     */
    public coreum.asset.nft.v1.Tx.EmptyResponse unfreeze(coreum.asset.nft.v1.Tx.MsgUnfreeze request) {
      return blockingUnaryCall(
          getChannel(), getUnfreezeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddToWhitelist sets the account as whitelisted to hold the NFT
     * </pre>
     */
    public coreum.asset.nft.v1.Tx.EmptyResponse addToWhitelist(coreum.asset.nft.v1.Tx.MsgAddToWhitelist request) {
      return blockingUnaryCall(
          getChannel(), getAddToWhitelistMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveFromWhitelist removes an account from whitelisted list of the NFT
     * </pre>
     */
    public coreum.asset.nft.v1.Tx.EmptyResponse removeFromWhitelist(coreum.asset.nft.v1.Tx.MsgRemoveFromWhitelist request) {
      return blockingUnaryCall(
          getChannel(), getRemoveFromWhitelistMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Msg defines the Msg service.
   * </pre>
   */
  public static final class MsgFutureStub extends io.grpc.stub.AbstractFutureStub<MsgFutureStub> {
    private MsgFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * IssueClass creates new non-fungible token class.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<coreum.asset.nft.v1.Tx.EmptyResponse> issueClass(
        coreum.asset.nft.v1.Tx.MsgIssueClass request) {
      return futureUnaryCall(
          getChannel().newCall(getIssueClassMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Mint mints new non-fungible token in the class.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<coreum.asset.nft.v1.Tx.EmptyResponse> mint(
        coreum.asset.nft.v1.Tx.MsgMint request) {
      return futureUnaryCall(
          getChannel().newCall(getMintMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Burn burns the existing non-fungible token in the class.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<coreum.asset.nft.v1.Tx.EmptyResponse> burn(
        coreum.asset.nft.v1.Tx.MsgBurn request) {
      return futureUnaryCall(
          getChannel().newCall(getBurnMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Freeze freezes an NFT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<coreum.asset.nft.v1.Tx.EmptyResponse> freeze(
        coreum.asset.nft.v1.Tx.MsgFreeze request) {
      return futureUnaryCall(
          getChannel().newCall(getFreezeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unfreeze removes the freeze effect already put on an NFT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<coreum.asset.nft.v1.Tx.EmptyResponse> unfreeze(
        coreum.asset.nft.v1.Tx.MsgUnfreeze request) {
      return futureUnaryCall(
          getChannel().newCall(getUnfreezeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddToWhitelist sets the account as whitelisted to hold the NFT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<coreum.asset.nft.v1.Tx.EmptyResponse> addToWhitelist(
        coreum.asset.nft.v1.Tx.MsgAddToWhitelist request) {
      return futureUnaryCall(
          getChannel().newCall(getAddToWhitelistMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveFromWhitelist removes an account from whitelisted list of the NFT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<coreum.asset.nft.v1.Tx.EmptyResponse> removeFromWhitelist(
        coreum.asset.nft.v1.Tx.MsgRemoveFromWhitelist request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveFromWhitelistMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ISSUE_CLASS = 0;
  private static final int METHODID_MINT = 1;
  private static final int METHODID_BURN = 2;
  private static final int METHODID_FREEZE = 3;
  private static final int METHODID_UNFREEZE = 4;
  private static final int METHODID_ADD_TO_WHITELIST = 5;
  private static final int METHODID_REMOVE_FROM_WHITELIST = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MsgImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MsgImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ISSUE_CLASS:
          serviceImpl.issueClass((coreum.asset.nft.v1.Tx.MsgIssueClass) request,
              (io.grpc.stub.StreamObserver<coreum.asset.nft.v1.Tx.EmptyResponse>) responseObserver);
          break;
        case METHODID_MINT:
          serviceImpl.mint((coreum.asset.nft.v1.Tx.MsgMint) request,
              (io.grpc.stub.StreamObserver<coreum.asset.nft.v1.Tx.EmptyResponse>) responseObserver);
          break;
        case METHODID_BURN:
          serviceImpl.burn((coreum.asset.nft.v1.Tx.MsgBurn) request,
              (io.grpc.stub.StreamObserver<coreum.asset.nft.v1.Tx.EmptyResponse>) responseObserver);
          break;
        case METHODID_FREEZE:
          serviceImpl.freeze((coreum.asset.nft.v1.Tx.MsgFreeze) request,
              (io.grpc.stub.StreamObserver<coreum.asset.nft.v1.Tx.EmptyResponse>) responseObserver);
          break;
        case METHODID_UNFREEZE:
          serviceImpl.unfreeze((coreum.asset.nft.v1.Tx.MsgUnfreeze) request,
              (io.grpc.stub.StreamObserver<coreum.asset.nft.v1.Tx.EmptyResponse>) responseObserver);
          break;
        case METHODID_ADD_TO_WHITELIST:
          serviceImpl.addToWhitelist((coreum.asset.nft.v1.Tx.MsgAddToWhitelist) request,
              (io.grpc.stub.StreamObserver<coreum.asset.nft.v1.Tx.EmptyResponse>) responseObserver);
          break;
        case METHODID_REMOVE_FROM_WHITELIST:
          serviceImpl.removeFromWhitelist((coreum.asset.nft.v1.Tx.MsgRemoveFromWhitelist) request,
              (io.grpc.stub.StreamObserver<coreum.asset.nft.v1.Tx.EmptyResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return coreum.asset.nft.v1.Tx.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Msg");
    }
  }

  private static final class MsgFileDescriptorSupplier
      extends MsgBaseDescriptorSupplier {
    MsgFileDescriptorSupplier() {}
  }

  private static final class MsgMethodDescriptorSupplier
      extends MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MsgMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MsgGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MsgFileDescriptorSupplier())
              .addMethod(getIssueClassMethod())
              .addMethod(getMintMethod())
              .addMethod(getBurnMethod())
              .addMethod(getFreezeMethod())
              .addMethod(getUnfreezeMethod())
              .addMethod(getAddToWhitelistMethod())
              .addMethod(getRemoveFromWhitelistMethod())
              .build();
        }
      }
    }
    return result;
  }
}
