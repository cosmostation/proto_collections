package kyve.team.v1beta1;

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
    comments = "Source: kyve/team/v1beta1/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "kyve.team.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<kyve.team.v1beta1.Tx.MsgClaimUnlocked,
      kyve.team.v1beta1.Tx.MsgClaimUnlockedResponse> getClaimUnlockedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimUnlocked",
      requestType = kyve.team.v1beta1.Tx.MsgClaimUnlocked.class,
      responseType = kyve.team.v1beta1.Tx.MsgClaimUnlockedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.team.v1beta1.Tx.MsgClaimUnlocked,
      kyve.team.v1beta1.Tx.MsgClaimUnlockedResponse> getClaimUnlockedMethod() {
    io.grpc.MethodDescriptor<kyve.team.v1beta1.Tx.MsgClaimUnlocked, kyve.team.v1beta1.Tx.MsgClaimUnlockedResponse> getClaimUnlockedMethod;
    if ((getClaimUnlockedMethod = MsgGrpc.getClaimUnlockedMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClaimUnlockedMethod = MsgGrpc.getClaimUnlockedMethod) == null) {
          MsgGrpc.getClaimUnlockedMethod = getClaimUnlockedMethod =
              io.grpc.MethodDescriptor.<kyve.team.v1beta1.Tx.MsgClaimUnlocked, kyve.team.v1beta1.Tx.MsgClaimUnlockedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimUnlocked"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.team.v1beta1.Tx.MsgClaimUnlocked.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.team.v1beta1.Tx.MsgClaimUnlockedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ClaimUnlocked"))
              .build();
        }
      }
    }
    return getClaimUnlockedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.team.v1beta1.Tx.MsgClawback,
      kyve.team.v1beta1.Tx.MsgClawbackResponse> getClawbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Clawback",
      requestType = kyve.team.v1beta1.Tx.MsgClawback.class,
      responseType = kyve.team.v1beta1.Tx.MsgClawbackResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.team.v1beta1.Tx.MsgClawback,
      kyve.team.v1beta1.Tx.MsgClawbackResponse> getClawbackMethod() {
    io.grpc.MethodDescriptor<kyve.team.v1beta1.Tx.MsgClawback, kyve.team.v1beta1.Tx.MsgClawbackResponse> getClawbackMethod;
    if ((getClawbackMethod = MsgGrpc.getClawbackMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClawbackMethod = MsgGrpc.getClawbackMethod) == null) {
          MsgGrpc.getClawbackMethod = getClawbackMethod =
              io.grpc.MethodDescriptor.<kyve.team.v1beta1.Tx.MsgClawback, kyve.team.v1beta1.Tx.MsgClawbackResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Clawback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.team.v1beta1.Tx.MsgClawback.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.team.v1beta1.Tx.MsgClawbackResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Clawback"))
              .build();
        }
      }
    }
    return getClawbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.team.v1beta1.Tx.MsgCreateTeamVestingAccount,
      kyve.team.v1beta1.Tx.MsgCreateTeamVestingAccountResponse> getCreateTeamVestingAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTeamVestingAccount",
      requestType = kyve.team.v1beta1.Tx.MsgCreateTeamVestingAccount.class,
      responseType = kyve.team.v1beta1.Tx.MsgCreateTeamVestingAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.team.v1beta1.Tx.MsgCreateTeamVestingAccount,
      kyve.team.v1beta1.Tx.MsgCreateTeamVestingAccountResponse> getCreateTeamVestingAccountMethod() {
    io.grpc.MethodDescriptor<kyve.team.v1beta1.Tx.MsgCreateTeamVestingAccount, kyve.team.v1beta1.Tx.MsgCreateTeamVestingAccountResponse> getCreateTeamVestingAccountMethod;
    if ((getCreateTeamVestingAccountMethod = MsgGrpc.getCreateTeamVestingAccountMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateTeamVestingAccountMethod = MsgGrpc.getCreateTeamVestingAccountMethod) == null) {
          MsgGrpc.getCreateTeamVestingAccountMethod = getCreateTeamVestingAccountMethod =
              io.grpc.MethodDescriptor.<kyve.team.v1beta1.Tx.MsgCreateTeamVestingAccount, kyve.team.v1beta1.Tx.MsgCreateTeamVestingAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTeamVestingAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.team.v1beta1.Tx.MsgCreateTeamVestingAccount.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.team.v1beta1.Tx.MsgCreateTeamVestingAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateTeamVestingAccount"))
              .build();
        }
      }
    }
    return getCreateTeamVestingAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.team.v1beta1.Tx.MsgClaimAuthorityRewards,
      kyve.team.v1beta1.Tx.MsgClaimAuthorityRewardsResponse> getClaimAuthorityRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimAuthorityRewards",
      requestType = kyve.team.v1beta1.Tx.MsgClaimAuthorityRewards.class,
      responseType = kyve.team.v1beta1.Tx.MsgClaimAuthorityRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.team.v1beta1.Tx.MsgClaimAuthorityRewards,
      kyve.team.v1beta1.Tx.MsgClaimAuthorityRewardsResponse> getClaimAuthorityRewardsMethod() {
    io.grpc.MethodDescriptor<kyve.team.v1beta1.Tx.MsgClaimAuthorityRewards, kyve.team.v1beta1.Tx.MsgClaimAuthorityRewardsResponse> getClaimAuthorityRewardsMethod;
    if ((getClaimAuthorityRewardsMethod = MsgGrpc.getClaimAuthorityRewardsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClaimAuthorityRewardsMethod = MsgGrpc.getClaimAuthorityRewardsMethod) == null) {
          MsgGrpc.getClaimAuthorityRewardsMethod = getClaimAuthorityRewardsMethod =
              io.grpc.MethodDescriptor.<kyve.team.v1beta1.Tx.MsgClaimAuthorityRewards, kyve.team.v1beta1.Tx.MsgClaimAuthorityRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimAuthorityRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.team.v1beta1.Tx.MsgClaimAuthorityRewards.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.team.v1beta1.Tx.MsgClaimAuthorityRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ClaimAuthorityRewards"))
              .build();
        }
      }
    }
    return getClaimAuthorityRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.team.v1beta1.Tx.MsgClaimAccountRewards,
      kyve.team.v1beta1.Tx.MsgClaimAccountRewardsResponse> getClaimAccountRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimAccountRewards",
      requestType = kyve.team.v1beta1.Tx.MsgClaimAccountRewards.class,
      responseType = kyve.team.v1beta1.Tx.MsgClaimAccountRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.team.v1beta1.Tx.MsgClaimAccountRewards,
      kyve.team.v1beta1.Tx.MsgClaimAccountRewardsResponse> getClaimAccountRewardsMethod() {
    io.grpc.MethodDescriptor<kyve.team.v1beta1.Tx.MsgClaimAccountRewards, kyve.team.v1beta1.Tx.MsgClaimAccountRewardsResponse> getClaimAccountRewardsMethod;
    if ((getClaimAccountRewardsMethod = MsgGrpc.getClaimAccountRewardsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClaimAccountRewardsMethod = MsgGrpc.getClaimAccountRewardsMethod) == null) {
          MsgGrpc.getClaimAccountRewardsMethod = getClaimAccountRewardsMethod =
              io.grpc.MethodDescriptor.<kyve.team.v1beta1.Tx.MsgClaimAccountRewards, kyve.team.v1beta1.Tx.MsgClaimAccountRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimAccountRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.team.v1beta1.Tx.MsgClaimAccountRewards.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.team.v1beta1.Tx.MsgClaimAccountRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ClaimAccountRewards"))
              .build();
        }
      }
    }
    return getClaimAccountRewardsMethod;
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
     * ClaimUnlocked ...
     * </pre>
     */
    public void claimUnlocked(kyve.team.v1beta1.Tx.MsgClaimUnlocked request,
        io.grpc.stub.StreamObserver<kyve.team.v1beta1.Tx.MsgClaimUnlockedResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClaimUnlockedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Clawback ...
     * </pre>
     */
    public void clawback(kyve.team.v1beta1.Tx.MsgClawback request,
        io.grpc.stub.StreamObserver<kyve.team.v1beta1.Tx.MsgClawbackResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClawbackMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateTeamVestingAccount ...
     * </pre>
     */
    public void createTeamVestingAccount(kyve.team.v1beta1.Tx.MsgCreateTeamVestingAccount request,
        io.grpc.stub.StreamObserver<kyve.team.v1beta1.Tx.MsgCreateTeamVestingAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateTeamVestingAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * ClaimAuthorityRewards ...
     * </pre>
     */
    public void claimAuthorityRewards(kyve.team.v1beta1.Tx.MsgClaimAuthorityRewards request,
        io.grpc.stub.StreamObserver<kyve.team.v1beta1.Tx.MsgClaimAuthorityRewardsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClaimAuthorityRewardsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ClaimInflationRewards ...
     * </pre>
     */
    public void claimAccountRewards(kyve.team.v1beta1.Tx.MsgClaimAccountRewards request,
        io.grpc.stub.StreamObserver<kyve.team.v1beta1.Tx.MsgClaimAccountRewardsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClaimAccountRewardsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getClaimUnlockedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.team.v1beta1.Tx.MsgClaimUnlocked,
                kyve.team.v1beta1.Tx.MsgClaimUnlockedResponse>(
                  this, METHODID_CLAIM_UNLOCKED)))
          .addMethod(
            getClawbackMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.team.v1beta1.Tx.MsgClawback,
                kyve.team.v1beta1.Tx.MsgClawbackResponse>(
                  this, METHODID_CLAWBACK)))
          .addMethod(
            getCreateTeamVestingAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.team.v1beta1.Tx.MsgCreateTeamVestingAccount,
                kyve.team.v1beta1.Tx.MsgCreateTeamVestingAccountResponse>(
                  this, METHODID_CREATE_TEAM_VESTING_ACCOUNT)))
          .addMethod(
            getClaimAuthorityRewardsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.team.v1beta1.Tx.MsgClaimAuthorityRewards,
                kyve.team.v1beta1.Tx.MsgClaimAuthorityRewardsResponse>(
                  this, METHODID_CLAIM_AUTHORITY_REWARDS)))
          .addMethod(
            getClaimAccountRewardsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.team.v1beta1.Tx.MsgClaimAccountRewards,
                kyve.team.v1beta1.Tx.MsgClaimAccountRewardsResponse>(
                  this, METHODID_CLAIM_ACCOUNT_REWARDS)))
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
     * ClaimUnlocked ...
     * </pre>
     */
    public void claimUnlocked(kyve.team.v1beta1.Tx.MsgClaimUnlocked request,
        io.grpc.stub.StreamObserver<kyve.team.v1beta1.Tx.MsgClaimUnlockedResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClaimUnlockedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Clawback ...
     * </pre>
     */
    public void clawback(kyve.team.v1beta1.Tx.MsgClawback request,
        io.grpc.stub.StreamObserver<kyve.team.v1beta1.Tx.MsgClawbackResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClawbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateTeamVestingAccount ...
     * </pre>
     */
    public void createTeamVestingAccount(kyve.team.v1beta1.Tx.MsgCreateTeamVestingAccount request,
        io.grpc.stub.StreamObserver<kyve.team.v1beta1.Tx.MsgCreateTeamVestingAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateTeamVestingAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ClaimAuthorityRewards ...
     * </pre>
     */
    public void claimAuthorityRewards(kyve.team.v1beta1.Tx.MsgClaimAuthorityRewards request,
        io.grpc.stub.StreamObserver<kyve.team.v1beta1.Tx.MsgClaimAuthorityRewardsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClaimAuthorityRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ClaimInflationRewards ...
     * </pre>
     */
    public void claimAccountRewards(kyve.team.v1beta1.Tx.MsgClaimAccountRewards request,
        io.grpc.stub.StreamObserver<kyve.team.v1beta1.Tx.MsgClaimAccountRewardsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClaimAccountRewardsMethod(), getCallOptions()), request, responseObserver);
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
     * ClaimUnlocked ...
     * </pre>
     */
    public kyve.team.v1beta1.Tx.MsgClaimUnlockedResponse claimUnlocked(kyve.team.v1beta1.Tx.MsgClaimUnlocked request) {
      return blockingUnaryCall(
          getChannel(), getClaimUnlockedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Clawback ...
     * </pre>
     */
    public kyve.team.v1beta1.Tx.MsgClawbackResponse clawback(kyve.team.v1beta1.Tx.MsgClawback request) {
      return blockingUnaryCall(
          getChannel(), getClawbackMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateTeamVestingAccount ...
     * </pre>
     */
    public kyve.team.v1beta1.Tx.MsgCreateTeamVestingAccountResponse createTeamVestingAccount(kyve.team.v1beta1.Tx.MsgCreateTeamVestingAccount request) {
      return blockingUnaryCall(
          getChannel(), getCreateTeamVestingAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ClaimAuthorityRewards ...
     * </pre>
     */
    public kyve.team.v1beta1.Tx.MsgClaimAuthorityRewardsResponse claimAuthorityRewards(kyve.team.v1beta1.Tx.MsgClaimAuthorityRewards request) {
      return blockingUnaryCall(
          getChannel(), getClaimAuthorityRewardsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ClaimInflationRewards ...
     * </pre>
     */
    public kyve.team.v1beta1.Tx.MsgClaimAccountRewardsResponse claimAccountRewards(kyve.team.v1beta1.Tx.MsgClaimAccountRewards request) {
      return blockingUnaryCall(
          getChannel(), getClaimAccountRewardsMethod(), getCallOptions(), request);
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
     * ClaimUnlocked ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.team.v1beta1.Tx.MsgClaimUnlockedResponse> claimUnlocked(
        kyve.team.v1beta1.Tx.MsgClaimUnlocked request) {
      return futureUnaryCall(
          getChannel().newCall(getClaimUnlockedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Clawback ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.team.v1beta1.Tx.MsgClawbackResponse> clawback(
        kyve.team.v1beta1.Tx.MsgClawback request) {
      return futureUnaryCall(
          getChannel().newCall(getClawbackMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateTeamVestingAccount ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.team.v1beta1.Tx.MsgCreateTeamVestingAccountResponse> createTeamVestingAccount(
        kyve.team.v1beta1.Tx.MsgCreateTeamVestingAccount request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateTeamVestingAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ClaimAuthorityRewards ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.team.v1beta1.Tx.MsgClaimAuthorityRewardsResponse> claimAuthorityRewards(
        kyve.team.v1beta1.Tx.MsgClaimAuthorityRewards request) {
      return futureUnaryCall(
          getChannel().newCall(getClaimAuthorityRewardsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ClaimInflationRewards ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.team.v1beta1.Tx.MsgClaimAccountRewardsResponse> claimAccountRewards(
        kyve.team.v1beta1.Tx.MsgClaimAccountRewards request) {
      return futureUnaryCall(
          getChannel().newCall(getClaimAccountRewardsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CLAIM_UNLOCKED = 0;
  private static final int METHODID_CLAWBACK = 1;
  private static final int METHODID_CREATE_TEAM_VESTING_ACCOUNT = 2;
  private static final int METHODID_CLAIM_AUTHORITY_REWARDS = 3;
  private static final int METHODID_CLAIM_ACCOUNT_REWARDS = 4;

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
        case METHODID_CLAIM_UNLOCKED:
          serviceImpl.claimUnlocked((kyve.team.v1beta1.Tx.MsgClaimUnlocked) request,
              (io.grpc.stub.StreamObserver<kyve.team.v1beta1.Tx.MsgClaimUnlockedResponse>) responseObserver);
          break;
        case METHODID_CLAWBACK:
          serviceImpl.clawback((kyve.team.v1beta1.Tx.MsgClawback) request,
              (io.grpc.stub.StreamObserver<kyve.team.v1beta1.Tx.MsgClawbackResponse>) responseObserver);
          break;
        case METHODID_CREATE_TEAM_VESTING_ACCOUNT:
          serviceImpl.createTeamVestingAccount((kyve.team.v1beta1.Tx.MsgCreateTeamVestingAccount) request,
              (io.grpc.stub.StreamObserver<kyve.team.v1beta1.Tx.MsgCreateTeamVestingAccountResponse>) responseObserver);
          break;
        case METHODID_CLAIM_AUTHORITY_REWARDS:
          serviceImpl.claimAuthorityRewards((kyve.team.v1beta1.Tx.MsgClaimAuthorityRewards) request,
              (io.grpc.stub.StreamObserver<kyve.team.v1beta1.Tx.MsgClaimAuthorityRewardsResponse>) responseObserver);
          break;
        case METHODID_CLAIM_ACCOUNT_REWARDS:
          serviceImpl.claimAccountRewards((kyve.team.v1beta1.Tx.MsgClaimAccountRewards) request,
              (io.grpc.stub.StreamObserver<kyve.team.v1beta1.Tx.MsgClaimAccountRewardsResponse>) responseObserver);
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
      return kyve.team.v1beta1.Tx.getDescriptor();
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
              .addMethod(getClaimUnlockedMethod())
              .addMethod(getClawbackMethod())
              .addMethod(getCreateTeamVestingAccountMethod())
              .addMethod(getClaimAuthorityRewardsMethod())
              .addMethod(getClaimAccountRewardsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
