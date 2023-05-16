package stafihub.stafihub.rmintreward;

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
    comments = "Source: stafihub/rmintreward/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "stafihub.stafihub.rmintreward.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rmintreward.Tx.MsgAddMintRewardAct,
      stafihub.stafihub.rmintreward.Tx.MsgAddMintRewardActResponse> getAddMintRewardActMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddMintRewardAct",
      requestType = stafihub.stafihub.rmintreward.Tx.MsgAddMintRewardAct.class,
      responseType = stafihub.stafihub.rmintreward.Tx.MsgAddMintRewardActResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rmintreward.Tx.MsgAddMintRewardAct,
      stafihub.stafihub.rmintreward.Tx.MsgAddMintRewardActResponse> getAddMintRewardActMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rmintreward.Tx.MsgAddMintRewardAct, stafihub.stafihub.rmintreward.Tx.MsgAddMintRewardActResponse> getAddMintRewardActMethod;
    if ((getAddMintRewardActMethod = MsgGrpc.getAddMintRewardActMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddMintRewardActMethod = MsgGrpc.getAddMintRewardActMethod) == null) {
          MsgGrpc.getAddMintRewardActMethod = getAddMintRewardActMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rmintreward.Tx.MsgAddMintRewardAct, stafihub.stafihub.rmintreward.Tx.MsgAddMintRewardActResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddMintRewardAct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rmintreward.Tx.MsgAddMintRewardAct.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rmintreward.Tx.MsgAddMintRewardActResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddMintRewardAct"))
              .build();
        }
      }
    }
    return getAddMintRewardActMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rmintreward.Tx.MsgUpdateMintRewardAct,
      stafihub.stafihub.rmintreward.Tx.MsgUpdateMintRewardActResponse> getUpdateMintRewardActMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMintRewardAct",
      requestType = stafihub.stafihub.rmintreward.Tx.MsgUpdateMintRewardAct.class,
      responseType = stafihub.stafihub.rmintreward.Tx.MsgUpdateMintRewardActResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rmintreward.Tx.MsgUpdateMintRewardAct,
      stafihub.stafihub.rmintreward.Tx.MsgUpdateMintRewardActResponse> getUpdateMintRewardActMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rmintreward.Tx.MsgUpdateMintRewardAct, stafihub.stafihub.rmintreward.Tx.MsgUpdateMintRewardActResponse> getUpdateMintRewardActMethod;
    if ((getUpdateMintRewardActMethod = MsgGrpc.getUpdateMintRewardActMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateMintRewardActMethod = MsgGrpc.getUpdateMintRewardActMethod) == null) {
          MsgGrpc.getUpdateMintRewardActMethod = getUpdateMintRewardActMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rmintreward.Tx.MsgUpdateMintRewardAct, stafihub.stafihub.rmintreward.Tx.MsgUpdateMintRewardActResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMintRewardAct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rmintreward.Tx.MsgUpdateMintRewardAct.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rmintreward.Tx.MsgUpdateMintRewardActResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateMintRewardAct"))
              .build();
        }
      }
    }
    return getUpdateMintRewardActMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rmintreward.Tx.MsgClaimMintReward,
      stafihub.stafihub.rmintreward.Tx.MsgClaimMintRewardResponse> getClaimMintRewardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimMintReward",
      requestType = stafihub.stafihub.rmintreward.Tx.MsgClaimMintReward.class,
      responseType = stafihub.stafihub.rmintreward.Tx.MsgClaimMintRewardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rmintreward.Tx.MsgClaimMintReward,
      stafihub.stafihub.rmintreward.Tx.MsgClaimMintRewardResponse> getClaimMintRewardMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rmintreward.Tx.MsgClaimMintReward, stafihub.stafihub.rmintreward.Tx.MsgClaimMintRewardResponse> getClaimMintRewardMethod;
    if ((getClaimMintRewardMethod = MsgGrpc.getClaimMintRewardMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClaimMintRewardMethod = MsgGrpc.getClaimMintRewardMethod) == null) {
          MsgGrpc.getClaimMintRewardMethod = getClaimMintRewardMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rmintreward.Tx.MsgClaimMintReward, stafihub.stafihub.rmintreward.Tx.MsgClaimMintRewardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimMintReward"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rmintreward.Tx.MsgClaimMintReward.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rmintreward.Tx.MsgClaimMintRewardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ClaimMintReward"))
              .build();
        }
      }
    }
    return getClaimMintRewardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rmintreward.Tx.MsgProvideRewardToken,
      stafihub.stafihub.rmintreward.Tx.MsgProvideRewardTokenResponse> getProvideRewardTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProvideRewardToken",
      requestType = stafihub.stafihub.rmintreward.Tx.MsgProvideRewardToken.class,
      responseType = stafihub.stafihub.rmintreward.Tx.MsgProvideRewardTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rmintreward.Tx.MsgProvideRewardToken,
      stafihub.stafihub.rmintreward.Tx.MsgProvideRewardTokenResponse> getProvideRewardTokenMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rmintreward.Tx.MsgProvideRewardToken, stafihub.stafihub.rmintreward.Tx.MsgProvideRewardTokenResponse> getProvideRewardTokenMethod;
    if ((getProvideRewardTokenMethod = MsgGrpc.getProvideRewardTokenMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getProvideRewardTokenMethod = MsgGrpc.getProvideRewardTokenMethod) == null) {
          MsgGrpc.getProvideRewardTokenMethod = getProvideRewardTokenMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rmintreward.Tx.MsgProvideRewardToken, stafihub.stafihub.rmintreward.Tx.MsgProvideRewardTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProvideRewardToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rmintreward.Tx.MsgProvideRewardToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rmintreward.Tx.MsgProvideRewardTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ProvideRewardToken"))
              .build();
        }
      }
    }
    return getProvideRewardTokenMethod;
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
    public void addMintRewardAct(stafihub.stafihub.rmintreward.Tx.MsgAddMintRewardAct request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rmintreward.Tx.MsgAddMintRewardActResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddMintRewardActMethod(), responseObserver);
    }

    /**
     */
    public void updateMintRewardAct(stafihub.stafihub.rmintreward.Tx.MsgUpdateMintRewardAct request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rmintreward.Tx.MsgUpdateMintRewardActResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMintRewardActMethod(), responseObserver);
    }

    /**
     */
    public void claimMintReward(stafihub.stafihub.rmintreward.Tx.MsgClaimMintReward request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rmintreward.Tx.MsgClaimMintRewardResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClaimMintRewardMethod(), responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void provideRewardToken(stafihub.stafihub.rmintreward.Tx.MsgProvideRewardToken request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rmintreward.Tx.MsgProvideRewardTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getProvideRewardTokenMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddMintRewardActMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rmintreward.Tx.MsgAddMintRewardAct,
                stafihub.stafihub.rmintreward.Tx.MsgAddMintRewardActResponse>(
                  this, METHODID_ADD_MINT_REWARD_ACT)))
          .addMethod(
            getUpdateMintRewardActMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rmintreward.Tx.MsgUpdateMintRewardAct,
                stafihub.stafihub.rmintreward.Tx.MsgUpdateMintRewardActResponse>(
                  this, METHODID_UPDATE_MINT_REWARD_ACT)))
          .addMethod(
            getClaimMintRewardMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rmintreward.Tx.MsgClaimMintReward,
                stafihub.stafihub.rmintreward.Tx.MsgClaimMintRewardResponse>(
                  this, METHODID_CLAIM_MINT_REWARD)))
          .addMethod(
            getProvideRewardTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rmintreward.Tx.MsgProvideRewardToken,
                stafihub.stafihub.rmintreward.Tx.MsgProvideRewardTokenResponse>(
                  this, METHODID_PROVIDE_REWARD_TOKEN)))
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
    public void addMintRewardAct(stafihub.stafihub.rmintreward.Tx.MsgAddMintRewardAct request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rmintreward.Tx.MsgAddMintRewardActResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddMintRewardActMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateMintRewardAct(stafihub.stafihub.rmintreward.Tx.MsgUpdateMintRewardAct request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rmintreward.Tx.MsgUpdateMintRewardActResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMintRewardActMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void claimMintReward(stafihub.stafihub.rmintreward.Tx.MsgClaimMintReward request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rmintreward.Tx.MsgClaimMintRewardResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClaimMintRewardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void provideRewardToken(stafihub.stafihub.rmintreward.Tx.MsgProvideRewardToken request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rmintreward.Tx.MsgProvideRewardTokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProvideRewardTokenMethod(), getCallOptions()), request, responseObserver);
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
    public stafihub.stafihub.rmintreward.Tx.MsgAddMintRewardActResponse addMintRewardAct(stafihub.stafihub.rmintreward.Tx.MsgAddMintRewardAct request) {
      return blockingUnaryCall(
          getChannel(), getAddMintRewardActMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.rmintreward.Tx.MsgUpdateMintRewardActResponse updateMintRewardAct(stafihub.stafihub.rmintreward.Tx.MsgUpdateMintRewardAct request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMintRewardActMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.rmintreward.Tx.MsgClaimMintRewardResponse claimMintReward(stafihub.stafihub.rmintreward.Tx.MsgClaimMintReward request) {
      return blockingUnaryCall(
          getChannel(), getClaimMintRewardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public stafihub.stafihub.rmintreward.Tx.MsgProvideRewardTokenResponse provideRewardToken(stafihub.stafihub.rmintreward.Tx.MsgProvideRewardToken request) {
      return blockingUnaryCall(
          getChannel(), getProvideRewardTokenMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rmintreward.Tx.MsgAddMintRewardActResponse> addMintRewardAct(
        stafihub.stafihub.rmintreward.Tx.MsgAddMintRewardAct request) {
      return futureUnaryCall(
          getChannel().newCall(getAddMintRewardActMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rmintreward.Tx.MsgUpdateMintRewardActResponse> updateMintRewardAct(
        stafihub.stafihub.rmintreward.Tx.MsgUpdateMintRewardAct request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMintRewardActMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rmintreward.Tx.MsgClaimMintRewardResponse> claimMintReward(
        stafihub.stafihub.rmintreward.Tx.MsgClaimMintReward request) {
      return futureUnaryCall(
          getChannel().newCall(getClaimMintRewardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rmintreward.Tx.MsgProvideRewardTokenResponse> provideRewardToken(
        stafihub.stafihub.rmintreward.Tx.MsgProvideRewardToken request) {
      return futureUnaryCall(
          getChannel().newCall(getProvideRewardTokenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_MINT_REWARD_ACT = 0;
  private static final int METHODID_UPDATE_MINT_REWARD_ACT = 1;
  private static final int METHODID_CLAIM_MINT_REWARD = 2;
  private static final int METHODID_PROVIDE_REWARD_TOKEN = 3;

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
        case METHODID_ADD_MINT_REWARD_ACT:
          serviceImpl.addMintRewardAct((stafihub.stafihub.rmintreward.Tx.MsgAddMintRewardAct) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rmintreward.Tx.MsgAddMintRewardActResponse>) responseObserver);
          break;
        case METHODID_UPDATE_MINT_REWARD_ACT:
          serviceImpl.updateMintRewardAct((stafihub.stafihub.rmintreward.Tx.MsgUpdateMintRewardAct) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rmintreward.Tx.MsgUpdateMintRewardActResponse>) responseObserver);
          break;
        case METHODID_CLAIM_MINT_REWARD:
          serviceImpl.claimMintReward((stafihub.stafihub.rmintreward.Tx.MsgClaimMintReward) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rmintreward.Tx.MsgClaimMintRewardResponse>) responseObserver);
          break;
        case METHODID_PROVIDE_REWARD_TOKEN:
          serviceImpl.provideRewardToken((stafihub.stafihub.rmintreward.Tx.MsgProvideRewardToken) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rmintreward.Tx.MsgProvideRewardTokenResponse>) responseObserver);
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
      return stafihub.stafihub.rmintreward.Tx.getDescriptor();
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
              .addMethod(getAddMintRewardActMethod())
              .addMethod(getUpdateMintRewardActMethod())
              .addMethod(getClaimMintRewardMethod())
              .addMethod(getProvideRewardTokenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
