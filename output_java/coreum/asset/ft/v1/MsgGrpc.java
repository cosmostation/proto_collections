package coreum.asset.ft.v1;

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
    comments = "Source: coreum/asset/ft/v1/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "coreum.asset.ft.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<coreum.asset.ft.v1.Tx.MsgIssue,
      coreum.asset.ft.v1.Tx.EmptyResponse> getIssueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Issue",
      requestType = coreum.asset.ft.v1.Tx.MsgIssue.class,
      responseType = coreum.asset.ft.v1.Tx.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<coreum.asset.ft.v1.Tx.MsgIssue,
      coreum.asset.ft.v1.Tx.EmptyResponse> getIssueMethod() {
    io.grpc.MethodDescriptor<coreum.asset.ft.v1.Tx.MsgIssue, coreum.asset.ft.v1.Tx.EmptyResponse> getIssueMethod;
    if ((getIssueMethod = MsgGrpc.getIssueMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getIssueMethod = MsgGrpc.getIssueMethod) == null) {
          MsgGrpc.getIssueMethod = getIssueMethod =
              io.grpc.MethodDescriptor.<coreum.asset.ft.v1.Tx.MsgIssue, coreum.asset.ft.v1.Tx.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Issue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.ft.v1.Tx.MsgIssue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.ft.v1.Tx.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Issue"))
              .build();
        }
      }
    }
    return getIssueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<coreum.asset.ft.v1.Tx.MsgMint,
      coreum.asset.ft.v1.Tx.EmptyResponse> getMintMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Mint",
      requestType = coreum.asset.ft.v1.Tx.MsgMint.class,
      responseType = coreum.asset.ft.v1.Tx.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<coreum.asset.ft.v1.Tx.MsgMint,
      coreum.asset.ft.v1.Tx.EmptyResponse> getMintMethod() {
    io.grpc.MethodDescriptor<coreum.asset.ft.v1.Tx.MsgMint, coreum.asset.ft.v1.Tx.EmptyResponse> getMintMethod;
    if ((getMintMethod = MsgGrpc.getMintMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMintMethod = MsgGrpc.getMintMethod) == null) {
          MsgGrpc.getMintMethod = getMintMethod =
              io.grpc.MethodDescriptor.<coreum.asset.ft.v1.Tx.MsgMint, coreum.asset.ft.v1.Tx.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Mint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.ft.v1.Tx.MsgMint.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.ft.v1.Tx.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Mint"))
              .build();
        }
      }
    }
    return getMintMethod;
  }

  private static volatile io.grpc.MethodDescriptor<coreum.asset.ft.v1.Tx.MsgBurn,
      coreum.asset.ft.v1.Tx.EmptyResponse> getBurnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Burn",
      requestType = coreum.asset.ft.v1.Tx.MsgBurn.class,
      responseType = coreum.asset.ft.v1.Tx.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<coreum.asset.ft.v1.Tx.MsgBurn,
      coreum.asset.ft.v1.Tx.EmptyResponse> getBurnMethod() {
    io.grpc.MethodDescriptor<coreum.asset.ft.v1.Tx.MsgBurn, coreum.asset.ft.v1.Tx.EmptyResponse> getBurnMethod;
    if ((getBurnMethod = MsgGrpc.getBurnMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBurnMethod = MsgGrpc.getBurnMethod) == null) {
          MsgGrpc.getBurnMethod = getBurnMethod =
              io.grpc.MethodDescriptor.<coreum.asset.ft.v1.Tx.MsgBurn, coreum.asset.ft.v1.Tx.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Burn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.ft.v1.Tx.MsgBurn.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.ft.v1.Tx.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Burn"))
              .build();
        }
      }
    }
    return getBurnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<coreum.asset.ft.v1.Tx.MsgFreeze,
      coreum.asset.ft.v1.Tx.EmptyResponse> getFreezeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Freeze",
      requestType = coreum.asset.ft.v1.Tx.MsgFreeze.class,
      responseType = coreum.asset.ft.v1.Tx.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<coreum.asset.ft.v1.Tx.MsgFreeze,
      coreum.asset.ft.v1.Tx.EmptyResponse> getFreezeMethod() {
    io.grpc.MethodDescriptor<coreum.asset.ft.v1.Tx.MsgFreeze, coreum.asset.ft.v1.Tx.EmptyResponse> getFreezeMethod;
    if ((getFreezeMethod = MsgGrpc.getFreezeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getFreezeMethod = MsgGrpc.getFreezeMethod) == null) {
          MsgGrpc.getFreezeMethod = getFreezeMethod =
              io.grpc.MethodDescriptor.<coreum.asset.ft.v1.Tx.MsgFreeze, coreum.asset.ft.v1.Tx.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Freeze"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.ft.v1.Tx.MsgFreeze.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.ft.v1.Tx.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Freeze"))
              .build();
        }
      }
    }
    return getFreezeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<coreum.asset.ft.v1.Tx.MsgUnfreeze,
      coreum.asset.ft.v1.Tx.EmptyResponse> getUnfreezeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Unfreeze",
      requestType = coreum.asset.ft.v1.Tx.MsgUnfreeze.class,
      responseType = coreum.asset.ft.v1.Tx.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<coreum.asset.ft.v1.Tx.MsgUnfreeze,
      coreum.asset.ft.v1.Tx.EmptyResponse> getUnfreezeMethod() {
    io.grpc.MethodDescriptor<coreum.asset.ft.v1.Tx.MsgUnfreeze, coreum.asset.ft.v1.Tx.EmptyResponse> getUnfreezeMethod;
    if ((getUnfreezeMethod = MsgGrpc.getUnfreezeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUnfreezeMethod = MsgGrpc.getUnfreezeMethod) == null) {
          MsgGrpc.getUnfreezeMethod = getUnfreezeMethod =
              io.grpc.MethodDescriptor.<coreum.asset.ft.v1.Tx.MsgUnfreeze, coreum.asset.ft.v1.Tx.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Unfreeze"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.ft.v1.Tx.MsgUnfreeze.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.ft.v1.Tx.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Unfreeze"))
              .build();
        }
      }
    }
    return getUnfreezeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<coreum.asset.ft.v1.Tx.MsgGloballyFreeze,
      coreum.asset.ft.v1.Tx.EmptyResponse> getGloballyFreezeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GloballyFreeze",
      requestType = coreum.asset.ft.v1.Tx.MsgGloballyFreeze.class,
      responseType = coreum.asset.ft.v1.Tx.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<coreum.asset.ft.v1.Tx.MsgGloballyFreeze,
      coreum.asset.ft.v1.Tx.EmptyResponse> getGloballyFreezeMethod() {
    io.grpc.MethodDescriptor<coreum.asset.ft.v1.Tx.MsgGloballyFreeze, coreum.asset.ft.v1.Tx.EmptyResponse> getGloballyFreezeMethod;
    if ((getGloballyFreezeMethod = MsgGrpc.getGloballyFreezeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getGloballyFreezeMethod = MsgGrpc.getGloballyFreezeMethod) == null) {
          MsgGrpc.getGloballyFreezeMethod = getGloballyFreezeMethod =
              io.grpc.MethodDescriptor.<coreum.asset.ft.v1.Tx.MsgGloballyFreeze, coreum.asset.ft.v1.Tx.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GloballyFreeze"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.ft.v1.Tx.MsgGloballyFreeze.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.ft.v1.Tx.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("GloballyFreeze"))
              .build();
        }
      }
    }
    return getGloballyFreezeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<coreum.asset.ft.v1.Tx.MsgGloballyUnfreeze,
      coreum.asset.ft.v1.Tx.EmptyResponse> getGloballyUnfreezeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GloballyUnfreeze",
      requestType = coreum.asset.ft.v1.Tx.MsgGloballyUnfreeze.class,
      responseType = coreum.asset.ft.v1.Tx.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<coreum.asset.ft.v1.Tx.MsgGloballyUnfreeze,
      coreum.asset.ft.v1.Tx.EmptyResponse> getGloballyUnfreezeMethod() {
    io.grpc.MethodDescriptor<coreum.asset.ft.v1.Tx.MsgGloballyUnfreeze, coreum.asset.ft.v1.Tx.EmptyResponse> getGloballyUnfreezeMethod;
    if ((getGloballyUnfreezeMethod = MsgGrpc.getGloballyUnfreezeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getGloballyUnfreezeMethod = MsgGrpc.getGloballyUnfreezeMethod) == null) {
          MsgGrpc.getGloballyUnfreezeMethod = getGloballyUnfreezeMethod =
              io.grpc.MethodDescriptor.<coreum.asset.ft.v1.Tx.MsgGloballyUnfreeze, coreum.asset.ft.v1.Tx.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GloballyUnfreeze"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.ft.v1.Tx.MsgGloballyUnfreeze.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.ft.v1.Tx.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("GloballyUnfreeze"))
              .build();
        }
      }
    }
    return getGloballyUnfreezeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<coreum.asset.ft.v1.Tx.MsgSetWhitelistedLimit,
      coreum.asset.ft.v1.Tx.EmptyResponse> getSetWhitelistedLimitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetWhitelistedLimit",
      requestType = coreum.asset.ft.v1.Tx.MsgSetWhitelistedLimit.class,
      responseType = coreum.asset.ft.v1.Tx.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<coreum.asset.ft.v1.Tx.MsgSetWhitelistedLimit,
      coreum.asset.ft.v1.Tx.EmptyResponse> getSetWhitelistedLimitMethod() {
    io.grpc.MethodDescriptor<coreum.asset.ft.v1.Tx.MsgSetWhitelistedLimit, coreum.asset.ft.v1.Tx.EmptyResponse> getSetWhitelistedLimitMethod;
    if ((getSetWhitelistedLimitMethod = MsgGrpc.getSetWhitelistedLimitMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetWhitelistedLimitMethod = MsgGrpc.getSetWhitelistedLimitMethod) == null) {
          MsgGrpc.getSetWhitelistedLimitMethod = getSetWhitelistedLimitMethod =
              io.grpc.MethodDescriptor.<coreum.asset.ft.v1.Tx.MsgSetWhitelistedLimit, coreum.asset.ft.v1.Tx.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetWhitelistedLimit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.ft.v1.Tx.MsgSetWhitelistedLimit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.ft.v1.Tx.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetWhitelistedLimit"))
              .build();
        }
      }
    }
    return getSetWhitelistedLimitMethod;
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
     * Issue defines a method to issue a new fungible token.
     * </pre>
     */
    public void issue(coreum.asset.ft.v1.Tx.MsgIssue request,
        io.grpc.stub.StreamObserver<coreum.asset.ft.v1.Tx.EmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getIssueMethod(), responseObserver);
    }

    /**
     * <pre>
     * Mint mints new fungible tokens.
     * </pre>
     */
    public void mint(coreum.asset.ft.v1.Tx.MsgMint request,
        io.grpc.stub.StreamObserver<coreum.asset.ft.v1.Tx.EmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMintMethod(), responseObserver);
    }

    /**
     * <pre>
     * Burn burns the specified fungible tokens from senders balance if the sender has enough balance.
     * </pre>
     */
    public void burn(coreum.asset.ft.v1.Tx.MsgBurn request,
        io.grpc.stub.StreamObserver<coreum.asset.ft.v1.Tx.EmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBurnMethod(), responseObserver);
    }

    /**
     * <pre>
     * Freeze freezes a part of the fungible tokens in an
     * account, only if the freezable feature is enabled on that token.
     * </pre>
     */
    public void freeze(coreum.asset.ft.v1.Tx.MsgFreeze request,
        io.grpc.stub.StreamObserver<coreum.asset.ft.v1.Tx.EmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFreezeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unfreeze unfreezes a part of the frozen fungible tokens in an
     * account, only if there are such frozen tokens on that account.
     * </pre>
     */
    public void unfreeze(coreum.asset.ft.v1.Tx.MsgUnfreeze request,
        io.grpc.stub.StreamObserver<coreum.asset.ft.v1.Tx.EmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnfreezeMethod(), responseObserver);
    }

    /**
     * <pre>
     * GloballyFreeze freezes fungible token so no operations are allowed with it before unfrozen.
     * This operation is idempotent so global freeze of already frozen token does nothing.
     * </pre>
     */
    public void globallyFreeze(coreum.asset.ft.v1.Tx.MsgGloballyFreeze request,
        io.grpc.stub.StreamObserver<coreum.asset.ft.v1.Tx.EmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGloballyFreezeMethod(), responseObserver);
    }

    /**
     * <pre>
     * GloballyUnfreeze unfreezes fungible token and unblocks basic operations on it.
     * This operation is idempotent so global unfreezing of non-frozen token does nothing.
     * </pre>
     */
    public void globallyUnfreeze(coreum.asset.ft.v1.Tx.MsgGloballyUnfreeze request,
        io.grpc.stub.StreamObserver<coreum.asset.ft.v1.Tx.EmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGloballyUnfreezeMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetWhitelistedLimit sets the limit of how many tokens a specific account may hold.
     * </pre>
     */
    public void setWhitelistedLimit(coreum.asset.ft.v1.Tx.MsgSetWhitelistedLimit request,
        io.grpc.stub.StreamObserver<coreum.asset.ft.v1.Tx.EmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetWhitelistedLimitMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getIssueMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                coreum.asset.ft.v1.Tx.MsgIssue,
                coreum.asset.ft.v1.Tx.EmptyResponse>(
                  this, METHODID_ISSUE)))
          .addMethod(
            getMintMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                coreum.asset.ft.v1.Tx.MsgMint,
                coreum.asset.ft.v1.Tx.EmptyResponse>(
                  this, METHODID_MINT)))
          .addMethod(
            getBurnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                coreum.asset.ft.v1.Tx.MsgBurn,
                coreum.asset.ft.v1.Tx.EmptyResponse>(
                  this, METHODID_BURN)))
          .addMethod(
            getFreezeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                coreum.asset.ft.v1.Tx.MsgFreeze,
                coreum.asset.ft.v1.Tx.EmptyResponse>(
                  this, METHODID_FREEZE)))
          .addMethod(
            getUnfreezeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                coreum.asset.ft.v1.Tx.MsgUnfreeze,
                coreum.asset.ft.v1.Tx.EmptyResponse>(
                  this, METHODID_UNFREEZE)))
          .addMethod(
            getGloballyFreezeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                coreum.asset.ft.v1.Tx.MsgGloballyFreeze,
                coreum.asset.ft.v1.Tx.EmptyResponse>(
                  this, METHODID_GLOBALLY_FREEZE)))
          .addMethod(
            getGloballyUnfreezeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                coreum.asset.ft.v1.Tx.MsgGloballyUnfreeze,
                coreum.asset.ft.v1.Tx.EmptyResponse>(
                  this, METHODID_GLOBALLY_UNFREEZE)))
          .addMethod(
            getSetWhitelistedLimitMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                coreum.asset.ft.v1.Tx.MsgSetWhitelistedLimit,
                coreum.asset.ft.v1.Tx.EmptyResponse>(
                  this, METHODID_SET_WHITELISTED_LIMIT)))
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
     * Issue defines a method to issue a new fungible token.
     * </pre>
     */
    public void issue(coreum.asset.ft.v1.Tx.MsgIssue request,
        io.grpc.stub.StreamObserver<coreum.asset.ft.v1.Tx.EmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIssueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Mint mints new fungible tokens.
     * </pre>
     */
    public void mint(coreum.asset.ft.v1.Tx.MsgMint request,
        io.grpc.stub.StreamObserver<coreum.asset.ft.v1.Tx.EmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMintMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Burn burns the specified fungible tokens from senders balance if the sender has enough balance.
     * </pre>
     */
    public void burn(coreum.asset.ft.v1.Tx.MsgBurn request,
        io.grpc.stub.StreamObserver<coreum.asset.ft.v1.Tx.EmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBurnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Freeze freezes a part of the fungible tokens in an
     * account, only if the freezable feature is enabled on that token.
     * </pre>
     */
    public void freeze(coreum.asset.ft.v1.Tx.MsgFreeze request,
        io.grpc.stub.StreamObserver<coreum.asset.ft.v1.Tx.EmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFreezeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unfreeze unfreezes a part of the frozen fungible tokens in an
     * account, only if there are such frozen tokens on that account.
     * </pre>
     */
    public void unfreeze(coreum.asset.ft.v1.Tx.MsgUnfreeze request,
        io.grpc.stub.StreamObserver<coreum.asset.ft.v1.Tx.EmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnfreezeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GloballyFreeze freezes fungible token so no operations are allowed with it before unfrozen.
     * This operation is idempotent so global freeze of already frozen token does nothing.
     * </pre>
     */
    public void globallyFreeze(coreum.asset.ft.v1.Tx.MsgGloballyFreeze request,
        io.grpc.stub.StreamObserver<coreum.asset.ft.v1.Tx.EmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGloballyFreezeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GloballyUnfreeze unfreezes fungible token and unblocks basic operations on it.
     * This operation is idempotent so global unfreezing of non-frozen token does nothing.
     * </pre>
     */
    public void globallyUnfreeze(coreum.asset.ft.v1.Tx.MsgGloballyUnfreeze request,
        io.grpc.stub.StreamObserver<coreum.asset.ft.v1.Tx.EmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGloballyUnfreezeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetWhitelistedLimit sets the limit of how many tokens a specific account may hold.
     * </pre>
     */
    public void setWhitelistedLimit(coreum.asset.ft.v1.Tx.MsgSetWhitelistedLimit request,
        io.grpc.stub.StreamObserver<coreum.asset.ft.v1.Tx.EmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetWhitelistedLimitMethod(), getCallOptions()), request, responseObserver);
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
     * Issue defines a method to issue a new fungible token.
     * </pre>
     */
    public coreum.asset.ft.v1.Tx.EmptyResponse issue(coreum.asset.ft.v1.Tx.MsgIssue request) {
      return blockingUnaryCall(
          getChannel(), getIssueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Mint mints new fungible tokens.
     * </pre>
     */
    public coreum.asset.ft.v1.Tx.EmptyResponse mint(coreum.asset.ft.v1.Tx.MsgMint request) {
      return blockingUnaryCall(
          getChannel(), getMintMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Burn burns the specified fungible tokens from senders balance if the sender has enough balance.
     * </pre>
     */
    public coreum.asset.ft.v1.Tx.EmptyResponse burn(coreum.asset.ft.v1.Tx.MsgBurn request) {
      return blockingUnaryCall(
          getChannel(), getBurnMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Freeze freezes a part of the fungible tokens in an
     * account, only if the freezable feature is enabled on that token.
     * </pre>
     */
    public coreum.asset.ft.v1.Tx.EmptyResponse freeze(coreum.asset.ft.v1.Tx.MsgFreeze request) {
      return blockingUnaryCall(
          getChannel(), getFreezeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unfreeze unfreezes a part of the frozen fungible tokens in an
     * account, only if there are such frozen tokens on that account.
     * </pre>
     */
    public coreum.asset.ft.v1.Tx.EmptyResponse unfreeze(coreum.asset.ft.v1.Tx.MsgUnfreeze request) {
      return blockingUnaryCall(
          getChannel(), getUnfreezeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GloballyFreeze freezes fungible token so no operations are allowed with it before unfrozen.
     * This operation is idempotent so global freeze of already frozen token does nothing.
     * </pre>
     */
    public coreum.asset.ft.v1.Tx.EmptyResponse globallyFreeze(coreum.asset.ft.v1.Tx.MsgGloballyFreeze request) {
      return blockingUnaryCall(
          getChannel(), getGloballyFreezeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GloballyUnfreeze unfreezes fungible token and unblocks basic operations on it.
     * This operation is idempotent so global unfreezing of non-frozen token does nothing.
     * </pre>
     */
    public coreum.asset.ft.v1.Tx.EmptyResponse globallyUnfreeze(coreum.asset.ft.v1.Tx.MsgGloballyUnfreeze request) {
      return blockingUnaryCall(
          getChannel(), getGloballyUnfreezeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetWhitelistedLimit sets the limit of how many tokens a specific account may hold.
     * </pre>
     */
    public coreum.asset.ft.v1.Tx.EmptyResponse setWhitelistedLimit(coreum.asset.ft.v1.Tx.MsgSetWhitelistedLimit request) {
      return blockingUnaryCall(
          getChannel(), getSetWhitelistedLimitMethod(), getCallOptions(), request);
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
     * Issue defines a method to issue a new fungible token.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<coreum.asset.ft.v1.Tx.EmptyResponse> issue(
        coreum.asset.ft.v1.Tx.MsgIssue request) {
      return futureUnaryCall(
          getChannel().newCall(getIssueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Mint mints new fungible tokens.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<coreum.asset.ft.v1.Tx.EmptyResponse> mint(
        coreum.asset.ft.v1.Tx.MsgMint request) {
      return futureUnaryCall(
          getChannel().newCall(getMintMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Burn burns the specified fungible tokens from senders balance if the sender has enough balance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<coreum.asset.ft.v1.Tx.EmptyResponse> burn(
        coreum.asset.ft.v1.Tx.MsgBurn request) {
      return futureUnaryCall(
          getChannel().newCall(getBurnMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Freeze freezes a part of the fungible tokens in an
     * account, only if the freezable feature is enabled on that token.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<coreum.asset.ft.v1.Tx.EmptyResponse> freeze(
        coreum.asset.ft.v1.Tx.MsgFreeze request) {
      return futureUnaryCall(
          getChannel().newCall(getFreezeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unfreeze unfreezes a part of the frozen fungible tokens in an
     * account, only if there are such frozen tokens on that account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<coreum.asset.ft.v1.Tx.EmptyResponse> unfreeze(
        coreum.asset.ft.v1.Tx.MsgUnfreeze request) {
      return futureUnaryCall(
          getChannel().newCall(getUnfreezeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GloballyFreeze freezes fungible token so no operations are allowed with it before unfrozen.
     * This operation is idempotent so global freeze of already frozen token does nothing.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<coreum.asset.ft.v1.Tx.EmptyResponse> globallyFreeze(
        coreum.asset.ft.v1.Tx.MsgGloballyFreeze request) {
      return futureUnaryCall(
          getChannel().newCall(getGloballyFreezeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GloballyUnfreeze unfreezes fungible token and unblocks basic operations on it.
     * This operation is idempotent so global unfreezing of non-frozen token does nothing.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<coreum.asset.ft.v1.Tx.EmptyResponse> globallyUnfreeze(
        coreum.asset.ft.v1.Tx.MsgGloballyUnfreeze request) {
      return futureUnaryCall(
          getChannel().newCall(getGloballyUnfreezeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetWhitelistedLimit sets the limit of how many tokens a specific account may hold.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<coreum.asset.ft.v1.Tx.EmptyResponse> setWhitelistedLimit(
        coreum.asset.ft.v1.Tx.MsgSetWhitelistedLimit request) {
      return futureUnaryCall(
          getChannel().newCall(getSetWhitelistedLimitMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ISSUE = 0;
  private static final int METHODID_MINT = 1;
  private static final int METHODID_BURN = 2;
  private static final int METHODID_FREEZE = 3;
  private static final int METHODID_UNFREEZE = 4;
  private static final int METHODID_GLOBALLY_FREEZE = 5;
  private static final int METHODID_GLOBALLY_UNFREEZE = 6;
  private static final int METHODID_SET_WHITELISTED_LIMIT = 7;

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
        case METHODID_ISSUE:
          serviceImpl.issue((coreum.asset.ft.v1.Tx.MsgIssue) request,
              (io.grpc.stub.StreamObserver<coreum.asset.ft.v1.Tx.EmptyResponse>) responseObserver);
          break;
        case METHODID_MINT:
          serviceImpl.mint((coreum.asset.ft.v1.Tx.MsgMint) request,
              (io.grpc.stub.StreamObserver<coreum.asset.ft.v1.Tx.EmptyResponse>) responseObserver);
          break;
        case METHODID_BURN:
          serviceImpl.burn((coreum.asset.ft.v1.Tx.MsgBurn) request,
              (io.grpc.stub.StreamObserver<coreum.asset.ft.v1.Tx.EmptyResponse>) responseObserver);
          break;
        case METHODID_FREEZE:
          serviceImpl.freeze((coreum.asset.ft.v1.Tx.MsgFreeze) request,
              (io.grpc.stub.StreamObserver<coreum.asset.ft.v1.Tx.EmptyResponse>) responseObserver);
          break;
        case METHODID_UNFREEZE:
          serviceImpl.unfreeze((coreum.asset.ft.v1.Tx.MsgUnfreeze) request,
              (io.grpc.stub.StreamObserver<coreum.asset.ft.v1.Tx.EmptyResponse>) responseObserver);
          break;
        case METHODID_GLOBALLY_FREEZE:
          serviceImpl.globallyFreeze((coreum.asset.ft.v1.Tx.MsgGloballyFreeze) request,
              (io.grpc.stub.StreamObserver<coreum.asset.ft.v1.Tx.EmptyResponse>) responseObserver);
          break;
        case METHODID_GLOBALLY_UNFREEZE:
          serviceImpl.globallyUnfreeze((coreum.asset.ft.v1.Tx.MsgGloballyUnfreeze) request,
              (io.grpc.stub.StreamObserver<coreum.asset.ft.v1.Tx.EmptyResponse>) responseObserver);
          break;
        case METHODID_SET_WHITELISTED_LIMIT:
          serviceImpl.setWhitelistedLimit((coreum.asset.ft.v1.Tx.MsgSetWhitelistedLimit) request,
              (io.grpc.stub.StreamObserver<coreum.asset.ft.v1.Tx.EmptyResponse>) responseObserver);
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
      return coreum.asset.ft.v1.Tx.getDescriptor();
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
              .addMethod(getIssueMethod())
              .addMethod(getMintMethod())
              .addMethod(getBurnMethod())
              .addMethod(getFreezeMethod())
              .addMethod(getUnfreezeMethod())
              .addMethod(getGloballyFreezeMethod())
              .addMethod(getGloballyUnfreezeMethod())
              .addMethod(getSetWhitelistedLimitMethod())
              .build();
        }
      }
    }
    return result;
  }
}
