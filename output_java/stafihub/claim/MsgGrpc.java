package stafihub.claim;

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
    comments = "Source: stafihub/claim/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "stafihub.stafihub.claim.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<stafihub.claim.Tx.MsgSetMerkleRoot,
      stafihub.claim.Tx.MsgSetMerkleRootResponse> getSetMerkleRootMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetMerkleRoot",
      requestType = stafihub.claim.Tx.MsgSetMerkleRoot.class,
      responseType = stafihub.claim.Tx.MsgSetMerkleRootResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.claim.Tx.MsgSetMerkleRoot,
      stafihub.claim.Tx.MsgSetMerkleRootResponse> getSetMerkleRootMethod() {
    io.grpc.MethodDescriptor<stafihub.claim.Tx.MsgSetMerkleRoot, stafihub.claim.Tx.MsgSetMerkleRootResponse> getSetMerkleRootMethod;
    if ((getSetMerkleRootMethod = MsgGrpc.getSetMerkleRootMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetMerkleRootMethod = MsgGrpc.getSetMerkleRootMethod) == null) {
          MsgGrpc.getSetMerkleRootMethod = getSetMerkleRootMethod =
              io.grpc.MethodDescriptor.<stafihub.claim.Tx.MsgSetMerkleRoot, stafihub.claim.Tx.MsgSetMerkleRootResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetMerkleRoot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.claim.Tx.MsgSetMerkleRoot.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.claim.Tx.MsgSetMerkleRootResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetMerkleRoot"))
              .build();
        }
      }
    }
    return getSetMerkleRootMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.claim.Tx.MsgClaim,
      stafihub.claim.Tx.MsgClaimResponse> getClaimMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Claim",
      requestType = stafihub.claim.Tx.MsgClaim.class,
      responseType = stafihub.claim.Tx.MsgClaimResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.claim.Tx.MsgClaim,
      stafihub.claim.Tx.MsgClaimResponse> getClaimMethod() {
    io.grpc.MethodDescriptor<stafihub.claim.Tx.MsgClaim, stafihub.claim.Tx.MsgClaimResponse> getClaimMethod;
    if ((getClaimMethod = MsgGrpc.getClaimMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClaimMethod = MsgGrpc.getClaimMethod) == null) {
          MsgGrpc.getClaimMethod = getClaimMethod =
              io.grpc.MethodDescriptor.<stafihub.claim.Tx.MsgClaim, stafihub.claim.Tx.MsgClaimResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Claim"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.claim.Tx.MsgClaim.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.claim.Tx.MsgClaimResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Claim"))
              .build();
        }
      }
    }
    return getClaimMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.claim.Tx.MsgToggleClaimSwitch,
      stafihub.claim.Tx.MsgToggleClaimSwitchResponse> getToggleClaimSwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ToggleClaimSwitch",
      requestType = stafihub.claim.Tx.MsgToggleClaimSwitch.class,
      responseType = stafihub.claim.Tx.MsgToggleClaimSwitchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.claim.Tx.MsgToggleClaimSwitch,
      stafihub.claim.Tx.MsgToggleClaimSwitchResponse> getToggleClaimSwitchMethod() {
    io.grpc.MethodDescriptor<stafihub.claim.Tx.MsgToggleClaimSwitch, stafihub.claim.Tx.MsgToggleClaimSwitchResponse> getToggleClaimSwitchMethod;
    if ((getToggleClaimSwitchMethod = MsgGrpc.getToggleClaimSwitchMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getToggleClaimSwitchMethod = MsgGrpc.getToggleClaimSwitchMethod) == null) {
          MsgGrpc.getToggleClaimSwitchMethod = getToggleClaimSwitchMethod =
              io.grpc.MethodDescriptor.<stafihub.claim.Tx.MsgToggleClaimSwitch, stafihub.claim.Tx.MsgToggleClaimSwitchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ToggleClaimSwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.claim.Tx.MsgToggleClaimSwitch.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.claim.Tx.MsgToggleClaimSwitchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ToggleClaimSwitch"))
              .build();
        }
      }
    }
    return getToggleClaimSwitchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.claim.Tx.MsgProvideToken,
      stafihub.claim.Tx.MsgProvideTokenResponse> getProvideTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProvideToken",
      requestType = stafihub.claim.Tx.MsgProvideToken.class,
      responseType = stafihub.claim.Tx.MsgProvideTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.claim.Tx.MsgProvideToken,
      stafihub.claim.Tx.MsgProvideTokenResponse> getProvideTokenMethod() {
    io.grpc.MethodDescriptor<stafihub.claim.Tx.MsgProvideToken, stafihub.claim.Tx.MsgProvideTokenResponse> getProvideTokenMethod;
    if ((getProvideTokenMethod = MsgGrpc.getProvideTokenMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getProvideTokenMethod = MsgGrpc.getProvideTokenMethod) == null) {
          MsgGrpc.getProvideTokenMethod = getProvideTokenMethod =
              io.grpc.MethodDescriptor.<stafihub.claim.Tx.MsgProvideToken, stafihub.claim.Tx.MsgProvideTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProvideToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.claim.Tx.MsgProvideToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.claim.Tx.MsgProvideTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ProvideToken"))
              .build();
        }
      }
    }
    return getProvideTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.claim.Tx.MsgWithdrawToken,
      stafihub.claim.Tx.MsgWithdrawTokenResponse> getWithdrawTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawToken",
      requestType = stafihub.claim.Tx.MsgWithdrawToken.class,
      responseType = stafihub.claim.Tx.MsgWithdrawTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.claim.Tx.MsgWithdrawToken,
      stafihub.claim.Tx.MsgWithdrawTokenResponse> getWithdrawTokenMethod() {
    io.grpc.MethodDescriptor<stafihub.claim.Tx.MsgWithdrawToken, stafihub.claim.Tx.MsgWithdrawTokenResponse> getWithdrawTokenMethod;
    if ((getWithdrawTokenMethod = MsgGrpc.getWithdrawTokenMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawTokenMethod = MsgGrpc.getWithdrawTokenMethod) == null) {
          MsgGrpc.getWithdrawTokenMethod = getWithdrawTokenMethod =
              io.grpc.MethodDescriptor.<stafihub.claim.Tx.MsgWithdrawToken, stafihub.claim.Tx.MsgWithdrawTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.claim.Tx.MsgWithdrawToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.claim.Tx.MsgWithdrawTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WithdrawToken"))
              .build();
        }
      }
    }
    return getWithdrawTokenMethod;
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
     */
    public void setMerkleRoot(stafihub.claim.Tx.MsgSetMerkleRoot request,
        io.grpc.stub.StreamObserver<stafihub.claim.Tx.MsgSetMerkleRootResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetMerkleRootMethod(), responseObserver);
    }

    /**
     */
    public void claim(stafihub.claim.Tx.MsgClaim request,
        io.grpc.stub.StreamObserver<stafihub.claim.Tx.MsgClaimResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClaimMethod(), responseObserver);
    }

    /**
     */
    public void toggleClaimSwitch(stafihub.claim.Tx.MsgToggleClaimSwitch request,
        io.grpc.stub.StreamObserver<stafihub.claim.Tx.MsgToggleClaimSwitchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getToggleClaimSwitchMethod(), responseObserver);
    }

    /**
     */
    public void provideToken(stafihub.claim.Tx.MsgProvideToken request,
        io.grpc.stub.StreamObserver<stafihub.claim.Tx.MsgProvideTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getProvideTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void withdrawToken(stafihub.claim.Tx.MsgWithdrawToken request,
        io.grpc.stub.StreamObserver<stafihub.claim.Tx.MsgWithdrawTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWithdrawTokenMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSetMerkleRootMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.claim.Tx.MsgSetMerkleRoot,
                stafihub.claim.Tx.MsgSetMerkleRootResponse>(
                  this, METHODID_SET_MERKLE_ROOT)))
          .addMethod(
            getClaimMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.claim.Tx.MsgClaim,
                stafihub.claim.Tx.MsgClaimResponse>(
                  this, METHODID_CLAIM)))
          .addMethod(
            getToggleClaimSwitchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.claim.Tx.MsgToggleClaimSwitch,
                stafihub.claim.Tx.MsgToggleClaimSwitchResponse>(
                  this, METHODID_TOGGLE_CLAIM_SWITCH)))
          .addMethod(
            getProvideTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.claim.Tx.MsgProvideToken,
                stafihub.claim.Tx.MsgProvideTokenResponse>(
                  this, METHODID_PROVIDE_TOKEN)))
          .addMethod(
            getWithdrawTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.claim.Tx.MsgWithdrawToken,
                stafihub.claim.Tx.MsgWithdrawTokenResponse>(
                  this, METHODID_WITHDRAW_TOKEN)))
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
     */
    public void setMerkleRoot(stafihub.claim.Tx.MsgSetMerkleRoot request,
        io.grpc.stub.StreamObserver<stafihub.claim.Tx.MsgSetMerkleRootResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetMerkleRootMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void claim(stafihub.claim.Tx.MsgClaim request,
        io.grpc.stub.StreamObserver<stafihub.claim.Tx.MsgClaimResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClaimMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void toggleClaimSwitch(stafihub.claim.Tx.MsgToggleClaimSwitch request,
        io.grpc.stub.StreamObserver<stafihub.claim.Tx.MsgToggleClaimSwitchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getToggleClaimSwitchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void provideToken(stafihub.claim.Tx.MsgProvideToken request,
        io.grpc.stub.StreamObserver<stafihub.claim.Tx.MsgProvideTokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProvideTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void withdrawToken(stafihub.claim.Tx.MsgWithdrawToken request,
        io.grpc.stub.StreamObserver<stafihub.claim.Tx.MsgWithdrawTokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWithdrawTokenMethod(), getCallOptions()), request, responseObserver);
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
     */
    public stafihub.claim.Tx.MsgSetMerkleRootResponse setMerkleRoot(stafihub.claim.Tx.MsgSetMerkleRoot request) {
      return blockingUnaryCall(
          getChannel(), getSetMerkleRootMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.claim.Tx.MsgClaimResponse claim(stafihub.claim.Tx.MsgClaim request) {
      return blockingUnaryCall(
          getChannel(), getClaimMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.claim.Tx.MsgToggleClaimSwitchResponse toggleClaimSwitch(stafihub.claim.Tx.MsgToggleClaimSwitch request) {
      return blockingUnaryCall(
          getChannel(), getToggleClaimSwitchMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.claim.Tx.MsgProvideTokenResponse provideToken(stafihub.claim.Tx.MsgProvideToken request) {
      return blockingUnaryCall(
          getChannel(), getProvideTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public stafihub.claim.Tx.MsgWithdrawTokenResponse withdrawToken(stafihub.claim.Tx.MsgWithdrawToken request) {
      return blockingUnaryCall(
          getChannel(), getWithdrawTokenMethod(), getCallOptions(), request);
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
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.claim.Tx.MsgSetMerkleRootResponse> setMerkleRoot(
        stafihub.claim.Tx.MsgSetMerkleRoot request) {
      return futureUnaryCall(
          getChannel().newCall(getSetMerkleRootMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.claim.Tx.MsgClaimResponse> claim(
        stafihub.claim.Tx.MsgClaim request) {
      return futureUnaryCall(
          getChannel().newCall(getClaimMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.claim.Tx.MsgToggleClaimSwitchResponse> toggleClaimSwitch(
        stafihub.claim.Tx.MsgToggleClaimSwitch request) {
      return futureUnaryCall(
          getChannel().newCall(getToggleClaimSwitchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.claim.Tx.MsgProvideTokenResponse> provideToken(
        stafihub.claim.Tx.MsgProvideToken request) {
      return futureUnaryCall(
          getChannel().newCall(getProvideTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.claim.Tx.MsgWithdrawTokenResponse> withdrawToken(
        stafihub.claim.Tx.MsgWithdrawToken request) {
      return futureUnaryCall(
          getChannel().newCall(getWithdrawTokenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_MERKLE_ROOT = 0;
  private static final int METHODID_CLAIM = 1;
  private static final int METHODID_TOGGLE_CLAIM_SWITCH = 2;
  private static final int METHODID_PROVIDE_TOKEN = 3;
  private static final int METHODID_WITHDRAW_TOKEN = 4;

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
        case METHODID_SET_MERKLE_ROOT:
          serviceImpl.setMerkleRoot((stafihub.claim.Tx.MsgSetMerkleRoot) request,
              (io.grpc.stub.StreamObserver<stafihub.claim.Tx.MsgSetMerkleRootResponse>) responseObserver);
          break;
        case METHODID_CLAIM:
          serviceImpl.claim((stafihub.claim.Tx.MsgClaim) request,
              (io.grpc.stub.StreamObserver<stafihub.claim.Tx.MsgClaimResponse>) responseObserver);
          break;
        case METHODID_TOGGLE_CLAIM_SWITCH:
          serviceImpl.toggleClaimSwitch((stafihub.claim.Tx.MsgToggleClaimSwitch) request,
              (io.grpc.stub.StreamObserver<stafihub.claim.Tx.MsgToggleClaimSwitchResponse>) responseObserver);
          break;
        case METHODID_PROVIDE_TOKEN:
          serviceImpl.provideToken((stafihub.claim.Tx.MsgProvideToken) request,
              (io.grpc.stub.StreamObserver<stafihub.claim.Tx.MsgProvideTokenResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_TOKEN:
          serviceImpl.withdrawToken((stafihub.claim.Tx.MsgWithdrawToken) request,
              (io.grpc.stub.StreamObserver<stafihub.claim.Tx.MsgWithdrawTokenResponse>) responseObserver);
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
      return stafihub.claim.Tx.getDescriptor();
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
              .addMethod(getSetMerkleRootMethod())
              .addMethod(getClaimMethod())
              .addMethod(getToggleClaimSwitchMethod())
              .addMethod(getProvideTokenMethod())
              .addMethod(getWithdrawTokenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
