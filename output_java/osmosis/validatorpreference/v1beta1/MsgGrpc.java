package osmosis.validatorpreference.v1beta1;

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
 * Msg defines the validator-preference modules's gRPC message service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: osmosis/validator-preference/v1beta1/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "osmosis.validatorpreference.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<osmosis.validatorpreference.v1beta1.Tx.MsgSetValidatorSetPreference,
      osmosis.validatorpreference.v1beta1.Tx.MsgSetValidatorSetPreferenceResponse> getSetValidatorSetPreferenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetValidatorSetPreference",
      requestType = osmosis.validatorpreference.v1beta1.Tx.MsgSetValidatorSetPreference.class,
      responseType = osmosis.validatorpreference.v1beta1.Tx.MsgSetValidatorSetPreferenceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<osmosis.validatorpreference.v1beta1.Tx.MsgSetValidatorSetPreference,
      osmosis.validatorpreference.v1beta1.Tx.MsgSetValidatorSetPreferenceResponse> getSetValidatorSetPreferenceMethod() {
    io.grpc.MethodDescriptor<osmosis.validatorpreference.v1beta1.Tx.MsgSetValidatorSetPreference, osmosis.validatorpreference.v1beta1.Tx.MsgSetValidatorSetPreferenceResponse> getSetValidatorSetPreferenceMethod;
    if ((getSetValidatorSetPreferenceMethod = MsgGrpc.getSetValidatorSetPreferenceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetValidatorSetPreferenceMethod = MsgGrpc.getSetValidatorSetPreferenceMethod) == null) {
          MsgGrpc.getSetValidatorSetPreferenceMethod = getSetValidatorSetPreferenceMethod =
              io.grpc.MethodDescriptor.<osmosis.validatorpreference.v1beta1.Tx.MsgSetValidatorSetPreference, osmosis.validatorpreference.v1beta1.Tx.MsgSetValidatorSetPreferenceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetValidatorSetPreference"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  osmosis.validatorpreference.v1beta1.Tx.MsgSetValidatorSetPreference.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  osmosis.validatorpreference.v1beta1.Tx.MsgSetValidatorSetPreferenceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetValidatorSetPreference"))
              .build();
        }
      }
    }
    return getSetValidatorSetPreferenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<osmosis.validatorpreference.v1beta1.Tx.MsgDelegateToValidatorSet,
      osmosis.validatorpreference.v1beta1.Tx.MsgDelegateToValidatorSetResponse> getDelegateToValidatorSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DelegateToValidatorSet",
      requestType = osmosis.validatorpreference.v1beta1.Tx.MsgDelegateToValidatorSet.class,
      responseType = osmosis.validatorpreference.v1beta1.Tx.MsgDelegateToValidatorSetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<osmosis.validatorpreference.v1beta1.Tx.MsgDelegateToValidatorSet,
      osmosis.validatorpreference.v1beta1.Tx.MsgDelegateToValidatorSetResponse> getDelegateToValidatorSetMethod() {
    io.grpc.MethodDescriptor<osmosis.validatorpreference.v1beta1.Tx.MsgDelegateToValidatorSet, osmosis.validatorpreference.v1beta1.Tx.MsgDelegateToValidatorSetResponse> getDelegateToValidatorSetMethod;
    if ((getDelegateToValidatorSetMethod = MsgGrpc.getDelegateToValidatorSetMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDelegateToValidatorSetMethod = MsgGrpc.getDelegateToValidatorSetMethod) == null) {
          MsgGrpc.getDelegateToValidatorSetMethod = getDelegateToValidatorSetMethod =
              io.grpc.MethodDescriptor.<osmosis.validatorpreference.v1beta1.Tx.MsgDelegateToValidatorSet, osmosis.validatorpreference.v1beta1.Tx.MsgDelegateToValidatorSetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DelegateToValidatorSet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  osmosis.validatorpreference.v1beta1.Tx.MsgDelegateToValidatorSet.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  osmosis.validatorpreference.v1beta1.Tx.MsgDelegateToValidatorSetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DelegateToValidatorSet"))
              .build();
        }
      }
    }
    return getDelegateToValidatorSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<osmosis.validatorpreference.v1beta1.Tx.MsgUndelegateFromValidatorSet,
      osmosis.validatorpreference.v1beta1.Tx.MsgUndelegateFromValidatorSetResponse> getUndelegateFromValidatorSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UndelegateFromValidatorSet",
      requestType = osmosis.validatorpreference.v1beta1.Tx.MsgUndelegateFromValidatorSet.class,
      responseType = osmosis.validatorpreference.v1beta1.Tx.MsgUndelegateFromValidatorSetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<osmosis.validatorpreference.v1beta1.Tx.MsgUndelegateFromValidatorSet,
      osmosis.validatorpreference.v1beta1.Tx.MsgUndelegateFromValidatorSetResponse> getUndelegateFromValidatorSetMethod() {
    io.grpc.MethodDescriptor<osmosis.validatorpreference.v1beta1.Tx.MsgUndelegateFromValidatorSet, osmosis.validatorpreference.v1beta1.Tx.MsgUndelegateFromValidatorSetResponse> getUndelegateFromValidatorSetMethod;
    if ((getUndelegateFromValidatorSetMethod = MsgGrpc.getUndelegateFromValidatorSetMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUndelegateFromValidatorSetMethod = MsgGrpc.getUndelegateFromValidatorSetMethod) == null) {
          MsgGrpc.getUndelegateFromValidatorSetMethod = getUndelegateFromValidatorSetMethod =
              io.grpc.MethodDescriptor.<osmosis.validatorpreference.v1beta1.Tx.MsgUndelegateFromValidatorSet, osmosis.validatorpreference.v1beta1.Tx.MsgUndelegateFromValidatorSetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UndelegateFromValidatorSet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  osmosis.validatorpreference.v1beta1.Tx.MsgUndelegateFromValidatorSet.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  osmosis.validatorpreference.v1beta1.Tx.MsgUndelegateFromValidatorSetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UndelegateFromValidatorSet"))
              .build();
        }
      }
    }
    return getUndelegateFromValidatorSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<osmosis.validatorpreference.v1beta1.Tx.MsgWithdrawDelegationRewards,
      osmosis.validatorpreference.v1beta1.Tx.MsgWithdrawDelegationRewardsResponse> getWithdrawDelegationRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawDelegationRewards",
      requestType = osmosis.validatorpreference.v1beta1.Tx.MsgWithdrawDelegationRewards.class,
      responseType = osmosis.validatorpreference.v1beta1.Tx.MsgWithdrawDelegationRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<osmosis.validatorpreference.v1beta1.Tx.MsgWithdrawDelegationRewards,
      osmosis.validatorpreference.v1beta1.Tx.MsgWithdrawDelegationRewardsResponse> getWithdrawDelegationRewardsMethod() {
    io.grpc.MethodDescriptor<osmosis.validatorpreference.v1beta1.Tx.MsgWithdrawDelegationRewards, osmosis.validatorpreference.v1beta1.Tx.MsgWithdrawDelegationRewardsResponse> getWithdrawDelegationRewardsMethod;
    if ((getWithdrawDelegationRewardsMethod = MsgGrpc.getWithdrawDelegationRewardsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawDelegationRewardsMethod = MsgGrpc.getWithdrawDelegationRewardsMethod) == null) {
          MsgGrpc.getWithdrawDelegationRewardsMethod = getWithdrawDelegationRewardsMethod =
              io.grpc.MethodDescriptor.<osmosis.validatorpreference.v1beta1.Tx.MsgWithdrawDelegationRewards, osmosis.validatorpreference.v1beta1.Tx.MsgWithdrawDelegationRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawDelegationRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  osmosis.validatorpreference.v1beta1.Tx.MsgWithdrawDelegationRewards.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  osmosis.validatorpreference.v1beta1.Tx.MsgWithdrawDelegationRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WithdrawDelegationRewards"))
              .build();
        }
      }
    }
    return getWithdrawDelegationRewardsMethod;
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
   * Msg defines the validator-preference modules's gRPC message service.
   * </pre>
   */
  public static abstract class MsgImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * SetValidatorSetPreference creates a set of validator preference.
     * This message will process both create + update request.
     * </pre>
     */
    public void setValidatorSetPreference(osmosis.validatorpreference.v1beta1.Tx.MsgSetValidatorSetPreference request,
        io.grpc.stub.StreamObserver<osmosis.validatorpreference.v1beta1.Tx.MsgSetValidatorSetPreferenceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetValidatorSetPreferenceMethod(), responseObserver);
    }

    /**
     * <pre>
     * DelegateToValidatorSet gets the owner, coins and delegates to a
     * validator-set.
     * </pre>
     */
    public void delegateToValidatorSet(osmosis.validatorpreference.v1beta1.Tx.MsgDelegateToValidatorSet request,
        io.grpc.stub.StreamObserver<osmosis.validatorpreference.v1beta1.Tx.MsgDelegateToValidatorSetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDelegateToValidatorSetMethod(), responseObserver);
    }

    /**
     * <pre>
     * UndelegateFromValidatorSet gets the owner and coins and undelegates from
     * validator-set. The unbonding logic will follow the `Undelegate` logic from
     * the sdk.
     * </pre>
     */
    public void undelegateFromValidatorSet(osmosis.validatorpreference.v1beta1.Tx.MsgUndelegateFromValidatorSet request,
        io.grpc.stub.StreamObserver<osmosis.validatorpreference.v1beta1.Tx.MsgUndelegateFromValidatorSetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUndelegateFromValidatorSetMethod(), responseObserver);
    }

    /**
     * <pre>
     * WithdrawDelegationRewards allows users to claim rewards from the
     * validator-set.
     * </pre>
     */
    public void withdrawDelegationRewards(osmosis.validatorpreference.v1beta1.Tx.MsgWithdrawDelegationRewards request,
        io.grpc.stub.StreamObserver<osmosis.validatorpreference.v1beta1.Tx.MsgWithdrawDelegationRewardsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWithdrawDelegationRewardsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSetValidatorSetPreferenceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                osmosis.validatorpreference.v1beta1.Tx.MsgSetValidatorSetPreference,
                osmosis.validatorpreference.v1beta1.Tx.MsgSetValidatorSetPreferenceResponse>(
                  this, METHODID_SET_VALIDATOR_SET_PREFERENCE)))
          .addMethod(
            getDelegateToValidatorSetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                osmosis.validatorpreference.v1beta1.Tx.MsgDelegateToValidatorSet,
                osmosis.validatorpreference.v1beta1.Tx.MsgDelegateToValidatorSetResponse>(
                  this, METHODID_DELEGATE_TO_VALIDATOR_SET)))
          .addMethod(
            getUndelegateFromValidatorSetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                osmosis.validatorpreference.v1beta1.Tx.MsgUndelegateFromValidatorSet,
                osmosis.validatorpreference.v1beta1.Tx.MsgUndelegateFromValidatorSetResponse>(
                  this, METHODID_UNDELEGATE_FROM_VALIDATOR_SET)))
          .addMethod(
            getWithdrawDelegationRewardsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                osmosis.validatorpreference.v1beta1.Tx.MsgWithdrawDelegationRewards,
                osmosis.validatorpreference.v1beta1.Tx.MsgWithdrawDelegationRewardsResponse>(
                  this, METHODID_WITHDRAW_DELEGATION_REWARDS)))
          .build();
    }
  }

  /**
   * <pre>
   * Msg defines the validator-preference modules's gRPC message service.
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
     * SetValidatorSetPreference creates a set of validator preference.
     * This message will process both create + update request.
     * </pre>
     */
    public void setValidatorSetPreference(osmosis.validatorpreference.v1beta1.Tx.MsgSetValidatorSetPreference request,
        io.grpc.stub.StreamObserver<osmosis.validatorpreference.v1beta1.Tx.MsgSetValidatorSetPreferenceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetValidatorSetPreferenceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DelegateToValidatorSet gets the owner, coins and delegates to a
     * validator-set.
     * </pre>
     */
    public void delegateToValidatorSet(osmosis.validatorpreference.v1beta1.Tx.MsgDelegateToValidatorSet request,
        io.grpc.stub.StreamObserver<osmosis.validatorpreference.v1beta1.Tx.MsgDelegateToValidatorSetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDelegateToValidatorSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UndelegateFromValidatorSet gets the owner and coins and undelegates from
     * validator-set. The unbonding logic will follow the `Undelegate` logic from
     * the sdk.
     * </pre>
     */
    public void undelegateFromValidatorSet(osmosis.validatorpreference.v1beta1.Tx.MsgUndelegateFromValidatorSet request,
        io.grpc.stub.StreamObserver<osmosis.validatorpreference.v1beta1.Tx.MsgUndelegateFromValidatorSetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUndelegateFromValidatorSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WithdrawDelegationRewards allows users to claim rewards from the
     * validator-set.
     * </pre>
     */
    public void withdrawDelegationRewards(osmosis.validatorpreference.v1beta1.Tx.MsgWithdrawDelegationRewards request,
        io.grpc.stub.StreamObserver<osmosis.validatorpreference.v1beta1.Tx.MsgWithdrawDelegationRewardsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWithdrawDelegationRewardsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Msg defines the validator-preference modules's gRPC message service.
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
     * SetValidatorSetPreference creates a set of validator preference.
     * This message will process both create + update request.
     * </pre>
     */
    public osmosis.validatorpreference.v1beta1.Tx.MsgSetValidatorSetPreferenceResponse setValidatorSetPreference(osmosis.validatorpreference.v1beta1.Tx.MsgSetValidatorSetPreference request) {
      return blockingUnaryCall(
          getChannel(), getSetValidatorSetPreferenceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DelegateToValidatorSet gets the owner, coins and delegates to a
     * validator-set.
     * </pre>
     */
    public osmosis.validatorpreference.v1beta1.Tx.MsgDelegateToValidatorSetResponse delegateToValidatorSet(osmosis.validatorpreference.v1beta1.Tx.MsgDelegateToValidatorSet request) {
      return blockingUnaryCall(
          getChannel(), getDelegateToValidatorSetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UndelegateFromValidatorSet gets the owner and coins and undelegates from
     * validator-set. The unbonding logic will follow the `Undelegate` logic from
     * the sdk.
     * </pre>
     */
    public osmosis.validatorpreference.v1beta1.Tx.MsgUndelegateFromValidatorSetResponse undelegateFromValidatorSet(osmosis.validatorpreference.v1beta1.Tx.MsgUndelegateFromValidatorSet request) {
      return blockingUnaryCall(
          getChannel(), getUndelegateFromValidatorSetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WithdrawDelegationRewards allows users to claim rewards from the
     * validator-set.
     * </pre>
     */
    public osmosis.validatorpreference.v1beta1.Tx.MsgWithdrawDelegationRewardsResponse withdrawDelegationRewards(osmosis.validatorpreference.v1beta1.Tx.MsgWithdrawDelegationRewards request) {
      return blockingUnaryCall(
          getChannel(), getWithdrawDelegationRewardsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Msg defines the validator-preference modules's gRPC message service.
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
     * SetValidatorSetPreference creates a set of validator preference.
     * This message will process both create + update request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<osmosis.validatorpreference.v1beta1.Tx.MsgSetValidatorSetPreferenceResponse> setValidatorSetPreference(
        osmosis.validatorpreference.v1beta1.Tx.MsgSetValidatorSetPreference request) {
      return futureUnaryCall(
          getChannel().newCall(getSetValidatorSetPreferenceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DelegateToValidatorSet gets the owner, coins and delegates to a
     * validator-set.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<osmosis.validatorpreference.v1beta1.Tx.MsgDelegateToValidatorSetResponse> delegateToValidatorSet(
        osmosis.validatorpreference.v1beta1.Tx.MsgDelegateToValidatorSet request) {
      return futureUnaryCall(
          getChannel().newCall(getDelegateToValidatorSetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UndelegateFromValidatorSet gets the owner and coins and undelegates from
     * validator-set. The unbonding logic will follow the `Undelegate` logic from
     * the sdk.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<osmosis.validatorpreference.v1beta1.Tx.MsgUndelegateFromValidatorSetResponse> undelegateFromValidatorSet(
        osmosis.validatorpreference.v1beta1.Tx.MsgUndelegateFromValidatorSet request) {
      return futureUnaryCall(
          getChannel().newCall(getUndelegateFromValidatorSetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WithdrawDelegationRewards allows users to claim rewards from the
     * validator-set.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<osmosis.validatorpreference.v1beta1.Tx.MsgWithdrawDelegationRewardsResponse> withdrawDelegationRewards(
        osmosis.validatorpreference.v1beta1.Tx.MsgWithdrawDelegationRewards request) {
      return futureUnaryCall(
          getChannel().newCall(getWithdrawDelegationRewardsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_VALIDATOR_SET_PREFERENCE = 0;
  private static final int METHODID_DELEGATE_TO_VALIDATOR_SET = 1;
  private static final int METHODID_UNDELEGATE_FROM_VALIDATOR_SET = 2;
  private static final int METHODID_WITHDRAW_DELEGATION_REWARDS = 3;

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
        case METHODID_SET_VALIDATOR_SET_PREFERENCE:
          serviceImpl.setValidatorSetPreference((osmosis.validatorpreference.v1beta1.Tx.MsgSetValidatorSetPreference) request,
              (io.grpc.stub.StreamObserver<osmosis.validatorpreference.v1beta1.Tx.MsgSetValidatorSetPreferenceResponse>) responseObserver);
          break;
        case METHODID_DELEGATE_TO_VALIDATOR_SET:
          serviceImpl.delegateToValidatorSet((osmosis.validatorpreference.v1beta1.Tx.MsgDelegateToValidatorSet) request,
              (io.grpc.stub.StreamObserver<osmosis.validatorpreference.v1beta1.Tx.MsgDelegateToValidatorSetResponse>) responseObserver);
          break;
        case METHODID_UNDELEGATE_FROM_VALIDATOR_SET:
          serviceImpl.undelegateFromValidatorSet((osmosis.validatorpreference.v1beta1.Tx.MsgUndelegateFromValidatorSet) request,
              (io.grpc.stub.StreamObserver<osmosis.validatorpreference.v1beta1.Tx.MsgUndelegateFromValidatorSetResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_DELEGATION_REWARDS:
          serviceImpl.withdrawDelegationRewards((osmosis.validatorpreference.v1beta1.Tx.MsgWithdrawDelegationRewards) request,
              (io.grpc.stub.StreamObserver<osmosis.validatorpreference.v1beta1.Tx.MsgWithdrawDelegationRewardsResponse>) responseObserver);
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
      return osmosis.validatorpreference.v1beta1.Tx.getDescriptor();
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
              .addMethod(getSetValidatorSetPreferenceMethod())
              .addMethod(getDelegateToValidatorSetMethod())
              .addMethod(getUndelegateFromValidatorSetMethod())
              .addMethod(getWithdrawDelegationRewardsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
