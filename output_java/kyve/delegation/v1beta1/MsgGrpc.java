package kyve.delegation.v1beta1;

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
    comments = "Source: kyve/delegation/v1beta1/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "kyve.delegation.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<kyve.delegation.v1beta1.Tx.MsgDelegate,
      kyve.delegation.v1beta1.Tx.MsgDelegateResponse> getDelegateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delegate",
      requestType = kyve.delegation.v1beta1.Tx.MsgDelegate.class,
      responseType = kyve.delegation.v1beta1.Tx.MsgDelegateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.delegation.v1beta1.Tx.MsgDelegate,
      kyve.delegation.v1beta1.Tx.MsgDelegateResponse> getDelegateMethod() {
    io.grpc.MethodDescriptor<kyve.delegation.v1beta1.Tx.MsgDelegate, kyve.delegation.v1beta1.Tx.MsgDelegateResponse> getDelegateMethod;
    if ((getDelegateMethod = MsgGrpc.getDelegateMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDelegateMethod = MsgGrpc.getDelegateMethod) == null) {
          MsgGrpc.getDelegateMethod = getDelegateMethod =
              io.grpc.MethodDescriptor.<kyve.delegation.v1beta1.Tx.MsgDelegate, kyve.delegation.v1beta1.Tx.MsgDelegateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delegate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.delegation.v1beta1.Tx.MsgDelegate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.delegation.v1beta1.Tx.MsgDelegateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Delegate"))
              .build();
        }
      }
    }
    return getDelegateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.delegation.v1beta1.Tx.MsgWithdrawRewards,
      kyve.delegation.v1beta1.Tx.MsgWithdrawRewardsResponse> getWithdrawRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawRewards",
      requestType = kyve.delegation.v1beta1.Tx.MsgWithdrawRewards.class,
      responseType = kyve.delegation.v1beta1.Tx.MsgWithdrawRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.delegation.v1beta1.Tx.MsgWithdrawRewards,
      kyve.delegation.v1beta1.Tx.MsgWithdrawRewardsResponse> getWithdrawRewardsMethod() {
    io.grpc.MethodDescriptor<kyve.delegation.v1beta1.Tx.MsgWithdrawRewards, kyve.delegation.v1beta1.Tx.MsgWithdrawRewardsResponse> getWithdrawRewardsMethod;
    if ((getWithdrawRewardsMethod = MsgGrpc.getWithdrawRewardsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawRewardsMethod = MsgGrpc.getWithdrawRewardsMethod) == null) {
          MsgGrpc.getWithdrawRewardsMethod = getWithdrawRewardsMethod =
              io.grpc.MethodDescriptor.<kyve.delegation.v1beta1.Tx.MsgWithdrawRewards, kyve.delegation.v1beta1.Tx.MsgWithdrawRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.delegation.v1beta1.Tx.MsgWithdrawRewards.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.delegation.v1beta1.Tx.MsgWithdrawRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WithdrawRewards"))
              .build();
        }
      }
    }
    return getWithdrawRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.delegation.v1beta1.Tx.MsgUndelegate,
      kyve.delegation.v1beta1.Tx.MsgUndelegateResponse> getUndelegateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Undelegate",
      requestType = kyve.delegation.v1beta1.Tx.MsgUndelegate.class,
      responseType = kyve.delegation.v1beta1.Tx.MsgUndelegateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.delegation.v1beta1.Tx.MsgUndelegate,
      kyve.delegation.v1beta1.Tx.MsgUndelegateResponse> getUndelegateMethod() {
    io.grpc.MethodDescriptor<kyve.delegation.v1beta1.Tx.MsgUndelegate, kyve.delegation.v1beta1.Tx.MsgUndelegateResponse> getUndelegateMethod;
    if ((getUndelegateMethod = MsgGrpc.getUndelegateMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUndelegateMethod = MsgGrpc.getUndelegateMethod) == null) {
          MsgGrpc.getUndelegateMethod = getUndelegateMethod =
              io.grpc.MethodDescriptor.<kyve.delegation.v1beta1.Tx.MsgUndelegate, kyve.delegation.v1beta1.Tx.MsgUndelegateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Undelegate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.delegation.v1beta1.Tx.MsgUndelegate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.delegation.v1beta1.Tx.MsgUndelegateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Undelegate"))
              .build();
        }
      }
    }
    return getUndelegateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.delegation.v1beta1.Tx.MsgRedelegate,
      kyve.delegation.v1beta1.Tx.MsgRedelegateResponse> getRedelegateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Redelegate",
      requestType = kyve.delegation.v1beta1.Tx.MsgRedelegate.class,
      responseType = kyve.delegation.v1beta1.Tx.MsgRedelegateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.delegation.v1beta1.Tx.MsgRedelegate,
      kyve.delegation.v1beta1.Tx.MsgRedelegateResponse> getRedelegateMethod() {
    io.grpc.MethodDescriptor<kyve.delegation.v1beta1.Tx.MsgRedelegate, kyve.delegation.v1beta1.Tx.MsgRedelegateResponse> getRedelegateMethod;
    if ((getRedelegateMethod = MsgGrpc.getRedelegateMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRedelegateMethod = MsgGrpc.getRedelegateMethod) == null) {
          MsgGrpc.getRedelegateMethod = getRedelegateMethod =
              io.grpc.MethodDescriptor.<kyve.delegation.v1beta1.Tx.MsgRedelegate, kyve.delegation.v1beta1.Tx.MsgRedelegateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Redelegate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.delegation.v1beta1.Tx.MsgRedelegate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.delegation.v1beta1.Tx.MsgRedelegateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Redelegate"))
              .build();
        }
      }
    }
    return getRedelegateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.delegation.v1beta1.Tx.MsgUpdateParams,
      kyve.delegation.v1beta1.Tx.MsgUpdateParamsResponse> getUpdateParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParams",
      requestType = kyve.delegation.v1beta1.Tx.MsgUpdateParams.class,
      responseType = kyve.delegation.v1beta1.Tx.MsgUpdateParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.delegation.v1beta1.Tx.MsgUpdateParams,
      kyve.delegation.v1beta1.Tx.MsgUpdateParamsResponse> getUpdateParamsMethod() {
    io.grpc.MethodDescriptor<kyve.delegation.v1beta1.Tx.MsgUpdateParams, kyve.delegation.v1beta1.Tx.MsgUpdateParamsResponse> getUpdateParamsMethod;
    if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
          MsgGrpc.getUpdateParamsMethod = getUpdateParamsMethod =
              io.grpc.MethodDescriptor.<kyve.delegation.v1beta1.Tx.MsgUpdateParams, kyve.delegation.v1beta1.Tx.MsgUpdateParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.delegation.v1beta1.Tx.MsgUpdateParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.delegation.v1beta1.Tx.MsgUpdateParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateParams"))
              .build();
        }
      }
    }
    return getUpdateParamsMethod;
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
     * Delegate ...
     * </pre>
     */
    public void delegate(kyve.delegation.v1beta1.Tx.MsgDelegate request,
        io.grpc.stub.StreamObserver<kyve.delegation.v1beta1.Tx.MsgDelegateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDelegateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Withdraw ...
     * </pre>
     */
    public void withdrawRewards(kyve.delegation.v1beta1.Tx.MsgWithdrawRewards request,
        io.grpc.stub.StreamObserver<kyve.delegation.v1beta1.Tx.MsgWithdrawRewardsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWithdrawRewardsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Undelegate ...
     * </pre>
     */
    public void undelegate(kyve.delegation.v1beta1.Tx.MsgUndelegate request,
        io.grpc.stub.StreamObserver<kyve.delegation.v1beta1.Tx.MsgUndelegateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUndelegateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Redelegate ...
     * </pre>
     */
    public void redelegate(kyve.delegation.v1beta1.Tx.MsgRedelegate request,
        io.grpc.stub.StreamObserver<kyve.delegation.v1beta1.Tx.MsgRedelegateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRedelegateMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/delegation module
     * parameters. The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public void updateParams(kyve.delegation.v1beta1.Tx.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<kyve.delegation.v1beta1.Tx.MsgUpdateParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateParamsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDelegateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.delegation.v1beta1.Tx.MsgDelegate,
                kyve.delegation.v1beta1.Tx.MsgDelegateResponse>(
                  this, METHODID_DELEGATE)))
          .addMethod(
            getWithdrawRewardsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.delegation.v1beta1.Tx.MsgWithdrawRewards,
                kyve.delegation.v1beta1.Tx.MsgWithdrawRewardsResponse>(
                  this, METHODID_WITHDRAW_REWARDS)))
          .addMethod(
            getUndelegateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.delegation.v1beta1.Tx.MsgUndelegate,
                kyve.delegation.v1beta1.Tx.MsgUndelegateResponse>(
                  this, METHODID_UNDELEGATE)))
          .addMethod(
            getRedelegateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.delegation.v1beta1.Tx.MsgRedelegate,
                kyve.delegation.v1beta1.Tx.MsgRedelegateResponse>(
                  this, METHODID_REDELEGATE)))
          .addMethod(
            getUpdateParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.delegation.v1beta1.Tx.MsgUpdateParams,
                kyve.delegation.v1beta1.Tx.MsgUpdateParamsResponse>(
                  this, METHODID_UPDATE_PARAMS)))
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
     * Delegate ...
     * </pre>
     */
    public void delegate(kyve.delegation.v1beta1.Tx.MsgDelegate request,
        io.grpc.stub.StreamObserver<kyve.delegation.v1beta1.Tx.MsgDelegateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDelegateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Withdraw ...
     * </pre>
     */
    public void withdrawRewards(kyve.delegation.v1beta1.Tx.MsgWithdrawRewards request,
        io.grpc.stub.StreamObserver<kyve.delegation.v1beta1.Tx.MsgWithdrawRewardsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWithdrawRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Undelegate ...
     * </pre>
     */
    public void undelegate(kyve.delegation.v1beta1.Tx.MsgUndelegate request,
        io.grpc.stub.StreamObserver<kyve.delegation.v1beta1.Tx.MsgUndelegateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUndelegateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Redelegate ...
     * </pre>
     */
    public void redelegate(kyve.delegation.v1beta1.Tx.MsgRedelegate request,
        io.grpc.stub.StreamObserver<kyve.delegation.v1beta1.Tx.MsgRedelegateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRedelegateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/delegation module
     * parameters. The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public void updateParams(kyve.delegation.v1beta1.Tx.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<kyve.delegation.v1beta1.Tx.MsgUpdateParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request, responseObserver);
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
     * Delegate ...
     * </pre>
     */
    public kyve.delegation.v1beta1.Tx.MsgDelegateResponse delegate(kyve.delegation.v1beta1.Tx.MsgDelegate request) {
      return blockingUnaryCall(
          getChannel(), getDelegateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Withdraw ...
     * </pre>
     */
    public kyve.delegation.v1beta1.Tx.MsgWithdrawRewardsResponse withdrawRewards(kyve.delegation.v1beta1.Tx.MsgWithdrawRewards request) {
      return blockingUnaryCall(
          getChannel(), getWithdrawRewardsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Undelegate ...
     * </pre>
     */
    public kyve.delegation.v1beta1.Tx.MsgUndelegateResponse undelegate(kyve.delegation.v1beta1.Tx.MsgUndelegate request) {
      return blockingUnaryCall(
          getChannel(), getUndelegateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Redelegate ...
     * </pre>
     */
    public kyve.delegation.v1beta1.Tx.MsgRedelegateResponse redelegate(kyve.delegation.v1beta1.Tx.MsgRedelegate request) {
      return blockingUnaryCall(
          getChannel(), getRedelegateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/delegation module
     * parameters. The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public kyve.delegation.v1beta1.Tx.MsgUpdateParamsResponse updateParams(kyve.delegation.v1beta1.Tx.MsgUpdateParams request) {
      return blockingUnaryCall(
          getChannel(), getUpdateParamsMethod(), getCallOptions(), request);
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
     * Delegate ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.delegation.v1beta1.Tx.MsgDelegateResponse> delegate(
        kyve.delegation.v1beta1.Tx.MsgDelegate request) {
      return futureUnaryCall(
          getChannel().newCall(getDelegateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Withdraw ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.delegation.v1beta1.Tx.MsgWithdrawRewardsResponse> withdrawRewards(
        kyve.delegation.v1beta1.Tx.MsgWithdrawRewards request) {
      return futureUnaryCall(
          getChannel().newCall(getWithdrawRewardsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Undelegate ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.delegation.v1beta1.Tx.MsgUndelegateResponse> undelegate(
        kyve.delegation.v1beta1.Tx.MsgUndelegate request) {
      return futureUnaryCall(
          getChannel().newCall(getUndelegateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Redelegate ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.delegation.v1beta1.Tx.MsgRedelegateResponse> redelegate(
        kyve.delegation.v1beta1.Tx.MsgRedelegate request) {
      return futureUnaryCall(
          getChannel().newCall(getRedelegateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/delegation module
     * parameters. The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.delegation.v1beta1.Tx.MsgUpdateParamsResponse> updateParams(
        kyve.delegation.v1beta1.Tx.MsgUpdateParams request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DELEGATE = 0;
  private static final int METHODID_WITHDRAW_REWARDS = 1;
  private static final int METHODID_UNDELEGATE = 2;
  private static final int METHODID_REDELEGATE = 3;
  private static final int METHODID_UPDATE_PARAMS = 4;

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
        case METHODID_DELEGATE:
          serviceImpl.delegate((kyve.delegation.v1beta1.Tx.MsgDelegate) request,
              (io.grpc.stub.StreamObserver<kyve.delegation.v1beta1.Tx.MsgDelegateResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_REWARDS:
          serviceImpl.withdrawRewards((kyve.delegation.v1beta1.Tx.MsgWithdrawRewards) request,
              (io.grpc.stub.StreamObserver<kyve.delegation.v1beta1.Tx.MsgWithdrawRewardsResponse>) responseObserver);
          break;
        case METHODID_UNDELEGATE:
          serviceImpl.undelegate((kyve.delegation.v1beta1.Tx.MsgUndelegate) request,
              (io.grpc.stub.StreamObserver<kyve.delegation.v1beta1.Tx.MsgUndelegateResponse>) responseObserver);
          break;
        case METHODID_REDELEGATE:
          serviceImpl.redelegate((kyve.delegation.v1beta1.Tx.MsgRedelegate) request,
              (io.grpc.stub.StreamObserver<kyve.delegation.v1beta1.Tx.MsgRedelegateResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PARAMS:
          serviceImpl.updateParams((kyve.delegation.v1beta1.Tx.MsgUpdateParams) request,
              (io.grpc.stub.StreamObserver<kyve.delegation.v1beta1.Tx.MsgUpdateParamsResponse>) responseObserver);
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
      return kyve.delegation.v1beta1.Tx.getDescriptor();
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
              .addMethod(getDelegateMethod())
              .addMethod(getWithdrawRewardsMethod())
              .addMethod(getUndelegateMethod())
              .addMethod(getRedelegateMethod())
              .addMethod(getUpdateParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
