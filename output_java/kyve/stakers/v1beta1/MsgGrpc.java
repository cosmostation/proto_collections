package kyve.stakers.v1beta1;

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
    comments = "Source: kyve/stakers/v1beta1/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "kyve.stakers.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<kyve.stakers.v1beta1.Tx.MsgCreateStaker,
      kyve.stakers.v1beta1.Tx.MsgCreateStakerResponse> getCreateStakerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateStaker",
      requestType = kyve.stakers.v1beta1.Tx.MsgCreateStaker.class,
      responseType = kyve.stakers.v1beta1.Tx.MsgCreateStakerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.stakers.v1beta1.Tx.MsgCreateStaker,
      kyve.stakers.v1beta1.Tx.MsgCreateStakerResponse> getCreateStakerMethod() {
    io.grpc.MethodDescriptor<kyve.stakers.v1beta1.Tx.MsgCreateStaker, kyve.stakers.v1beta1.Tx.MsgCreateStakerResponse> getCreateStakerMethod;
    if ((getCreateStakerMethod = MsgGrpc.getCreateStakerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateStakerMethod = MsgGrpc.getCreateStakerMethod) == null) {
          MsgGrpc.getCreateStakerMethod = getCreateStakerMethod =
              io.grpc.MethodDescriptor.<kyve.stakers.v1beta1.Tx.MsgCreateStaker, kyve.stakers.v1beta1.Tx.MsgCreateStakerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateStaker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.stakers.v1beta1.Tx.MsgCreateStaker.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.stakers.v1beta1.Tx.MsgCreateStakerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateStaker"))
              .build();
        }
      }
    }
    return getCreateStakerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.stakers.v1beta1.Tx.MsgUpdateMetadata,
      kyve.stakers.v1beta1.Tx.MsgUpdateMetadataResponse> getUpdateMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMetadata",
      requestType = kyve.stakers.v1beta1.Tx.MsgUpdateMetadata.class,
      responseType = kyve.stakers.v1beta1.Tx.MsgUpdateMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.stakers.v1beta1.Tx.MsgUpdateMetadata,
      kyve.stakers.v1beta1.Tx.MsgUpdateMetadataResponse> getUpdateMetadataMethod() {
    io.grpc.MethodDescriptor<kyve.stakers.v1beta1.Tx.MsgUpdateMetadata, kyve.stakers.v1beta1.Tx.MsgUpdateMetadataResponse> getUpdateMetadataMethod;
    if ((getUpdateMetadataMethod = MsgGrpc.getUpdateMetadataMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateMetadataMethod = MsgGrpc.getUpdateMetadataMethod) == null) {
          MsgGrpc.getUpdateMetadataMethod = getUpdateMetadataMethod =
              io.grpc.MethodDescriptor.<kyve.stakers.v1beta1.Tx.MsgUpdateMetadata, kyve.stakers.v1beta1.Tx.MsgUpdateMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.stakers.v1beta1.Tx.MsgUpdateMetadata.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.stakers.v1beta1.Tx.MsgUpdateMetadataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateMetadata"))
              .build();
        }
      }
    }
    return getUpdateMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.stakers.v1beta1.Tx.MsgUpdateCommission,
      kyve.stakers.v1beta1.Tx.MsgUpdateCommissionResponse> getUpdateCommissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCommission",
      requestType = kyve.stakers.v1beta1.Tx.MsgUpdateCommission.class,
      responseType = kyve.stakers.v1beta1.Tx.MsgUpdateCommissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.stakers.v1beta1.Tx.MsgUpdateCommission,
      kyve.stakers.v1beta1.Tx.MsgUpdateCommissionResponse> getUpdateCommissionMethod() {
    io.grpc.MethodDescriptor<kyve.stakers.v1beta1.Tx.MsgUpdateCommission, kyve.stakers.v1beta1.Tx.MsgUpdateCommissionResponse> getUpdateCommissionMethod;
    if ((getUpdateCommissionMethod = MsgGrpc.getUpdateCommissionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateCommissionMethod = MsgGrpc.getUpdateCommissionMethod) == null) {
          MsgGrpc.getUpdateCommissionMethod = getUpdateCommissionMethod =
              io.grpc.MethodDescriptor.<kyve.stakers.v1beta1.Tx.MsgUpdateCommission, kyve.stakers.v1beta1.Tx.MsgUpdateCommissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCommission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.stakers.v1beta1.Tx.MsgUpdateCommission.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.stakers.v1beta1.Tx.MsgUpdateCommissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateCommission"))
              .build();
        }
      }
    }
    return getUpdateCommissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.stakers.v1beta1.Tx.MsgJoinPool,
      kyve.stakers.v1beta1.Tx.MsgJoinPoolResponse> getJoinPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "JoinPool",
      requestType = kyve.stakers.v1beta1.Tx.MsgJoinPool.class,
      responseType = kyve.stakers.v1beta1.Tx.MsgJoinPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.stakers.v1beta1.Tx.MsgJoinPool,
      kyve.stakers.v1beta1.Tx.MsgJoinPoolResponse> getJoinPoolMethod() {
    io.grpc.MethodDescriptor<kyve.stakers.v1beta1.Tx.MsgJoinPool, kyve.stakers.v1beta1.Tx.MsgJoinPoolResponse> getJoinPoolMethod;
    if ((getJoinPoolMethod = MsgGrpc.getJoinPoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getJoinPoolMethod = MsgGrpc.getJoinPoolMethod) == null) {
          MsgGrpc.getJoinPoolMethod = getJoinPoolMethod =
              io.grpc.MethodDescriptor.<kyve.stakers.v1beta1.Tx.MsgJoinPool, kyve.stakers.v1beta1.Tx.MsgJoinPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "JoinPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.stakers.v1beta1.Tx.MsgJoinPool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.stakers.v1beta1.Tx.MsgJoinPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("JoinPool"))
              .build();
        }
      }
    }
    return getJoinPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.stakers.v1beta1.Tx.MsgLeavePool,
      kyve.stakers.v1beta1.Tx.MsgLeavePoolResponse> getLeavePoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LeavePool",
      requestType = kyve.stakers.v1beta1.Tx.MsgLeavePool.class,
      responseType = kyve.stakers.v1beta1.Tx.MsgLeavePoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.stakers.v1beta1.Tx.MsgLeavePool,
      kyve.stakers.v1beta1.Tx.MsgLeavePoolResponse> getLeavePoolMethod() {
    io.grpc.MethodDescriptor<kyve.stakers.v1beta1.Tx.MsgLeavePool, kyve.stakers.v1beta1.Tx.MsgLeavePoolResponse> getLeavePoolMethod;
    if ((getLeavePoolMethod = MsgGrpc.getLeavePoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getLeavePoolMethod = MsgGrpc.getLeavePoolMethod) == null) {
          MsgGrpc.getLeavePoolMethod = getLeavePoolMethod =
              io.grpc.MethodDescriptor.<kyve.stakers.v1beta1.Tx.MsgLeavePool, kyve.stakers.v1beta1.Tx.MsgLeavePoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LeavePool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.stakers.v1beta1.Tx.MsgLeavePool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.stakers.v1beta1.Tx.MsgLeavePoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("LeavePool"))
              .build();
        }
      }
    }
    return getLeavePoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.stakers.v1beta1.Tx.MsgUpdateParams,
      kyve.stakers.v1beta1.Tx.MsgUpdateParamsResponse> getUpdateParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParams",
      requestType = kyve.stakers.v1beta1.Tx.MsgUpdateParams.class,
      responseType = kyve.stakers.v1beta1.Tx.MsgUpdateParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.stakers.v1beta1.Tx.MsgUpdateParams,
      kyve.stakers.v1beta1.Tx.MsgUpdateParamsResponse> getUpdateParamsMethod() {
    io.grpc.MethodDescriptor<kyve.stakers.v1beta1.Tx.MsgUpdateParams, kyve.stakers.v1beta1.Tx.MsgUpdateParamsResponse> getUpdateParamsMethod;
    if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
          MsgGrpc.getUpdateParamsMethod = getUpdateParamsMethod =
              io.grpc.MethodDescriptor.<kyve.stakers.v1beta1.Tx.MsgUpdateParams, kyve.stakers.v1beta1.Tx.MsgUpdateParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.stakers.v1beta1.Tx.MsgUpdateParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.stakers.v1beta1.Tx.MsgUpdateParamsResponse.getDefaultInstance()))
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
     * CreateStaker ...
     * </pre>
     */
    public void createStaker(kyve.stakers.v1beta1.Tx.MsgCreateStaker request,
        io.grpc.stub.StreamObserver<kyve.stakers.v1beta1.Tx.MsgCreateStakerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateStakerMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateMetadata ...
     * </pre>
     */
    public void updateMetadata(kyve.stakers.v1beta1.Tx.MsgUpdateMetadata request,
        io.grpc.stub.StreamObserver<kyve.stakers.v1beta1.Tx.MsgUpdateMetadataResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateCommission ...
     * </pre>
     */
    public void updateCommission(kyve.stakers.v1beta1.Tx.MsgUpdateCommission request,
        io.grpc.stub.StreamObserver<kyve.stakers.v1beta1.Tx.MsgUpdateCommissionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCommissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * JoinPool ...
     * </pre>
     */
    public void joinPool(kyve.stakers.v1beta1.Tx.MsgJoinPool request,
        io.grpc.stub.StreamObserver<kyve.stakers.v1beta1.Tx.MsgJoinPoolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getJoinPoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * LeavePool ...
     * </pre>
     */
    public void leavePool(kyve.stakers.v1beta1.Tx.MsgLeavePool request,
        io.grpc.stub.StreamObserver<kyve.stakers.v1beta1.Tx.MsgLeavePoolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLeavePoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/stakers module
     * parameters. The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public void updateParams(kyve.stakers.v1beta1.Tx.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<kyve.stakers.v1beta1.Tx.MsgUpdateParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateParamsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateStakerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.stakers.v1beta1.Tx.MsgCreateStaker,
                kyve.stakers.v1beta1.Tx.MsgCreateStakerResponse>(
                  this, METHODID_CREATE_STAKER)))
          .addMethod(
            getUpdateMetadataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.stakers.v1beta1.Tx.MsgUpdateMetadata,
                kyve.stakers.v1beta1.Tx.MsgUpdateMetadataResponse>(
                  this, METHODID_UPDATE_METADATA)))
          .addMethod(
            getUpdateCommissionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.stakers.v1beta1.Tx.MsgUpdateCommission,
                kyve.stakers.v1beta1.Tx.MsgUpdateCommissionResponse>(
                  this, METHODID_UPDATE_COMMISSION)))
          .addMethod(
            getJoinPoolMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.stakers.v1beta1.Tx.MsgJoinPool,
                kyve.stakers.v1beta1.Tx.MsgJoinPoolResponse>(
                  this, METHODID_JOIN_POOL)))
          .addMethod(
            getLeavePoolMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.stakers.v1beta1.Tx.MsgLeavePool,
                kyve.stakers.v1beta1.Tx.MsgLeavePoolResponse>(
                  this, METHODID_LEAVE_POOL)))
          .addMethod(
            getUpdateParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.stakers.v1beta1.Tx.MsgUpdateParams,
                kyve.stakers.v1beta1.Tx.MsgUpdateParamsResponse>(
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
     * CreateStaker ...
     * </pre>
     */
    public void createStaker(kyve.stakers.v1beta1.Tx.MsgCreateStaker request,
        io.grpc.stub.StreamObserver<kyve.stakers.v1beta1.Tx.MsgCreateStakerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateStakerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateMetadata ...
     * </pre>
     */
    public void updateMetadata(kyve.stakers.v1beta1.Tx.MsgUpdateMetadata request,
        io.grpc.stub.StreamObserver<kyve.stakers.v1beta1.Tx.MsgUpdateMetadataResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateCommission ...
     * </pre>
     */
    public void updateCommission(kyve.stakers.v1beta1.Tx.MsgUpdateCommission request,
        io.grpc.stub.StreamObserver<kyve.stakers.v1beta1.Tx.MsgUpdateCommissionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCommissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * JoinPool ...
     * </pre>
     */
    public void joinPool(kyve.stakers.v1beta1.Tx.MsgJoinPool request,
        io.grpc.stub.StreamObserver<kyve.stakers.v1beta1.Tx.MsgJoinPoolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getJoinPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LeavePool ...
     * </pre>
     */
    public void leavePool(kyve.stakers.v1beta1.Tx.MsgLeavePool request,
        io.grpc.stub.StreamObserver<kyve.stakers.v1beta1.Tx.MsgLeavePoolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLeavePoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/stakers module
     * parameters. The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public void updateParams(kyve.stakers.v1beta1.Tx.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<kyve.stakers.v1beta1.Tx.MsgUpdateParamsResponse> responseObserver) {
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
     * CreateStaker ...
     * </pre>
     */
    public kyve.stakers.v1beta1.Tx.MsgCreateStakerResponse createStaker(kyve.stakers.v1beta1.Tx.MsgCreateStaker request) {
      return blockingUnaryCall(
          getChannel(), getCreateStakerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateMetadata ...
     * </pre>
     */
    public kyve.stakers.v1beta1.Tx.MsgUpdateMetadataResponse updateMetadata(kyve.stakers.v1beta1.Tx.MsgUpdateMetadata request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateCommission ...
     * </pre>
     */
    public kyve.stakers.v1beta1.Tx.MsgUpdateCommissionResponse updateCommission(kyve.stakers.v1beta1.Tx.MsgUpdateCommission request) {
      return blockingUnaryCall(
          getChannel(), getUpdateCommissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * JoinPool ...
     * </pre>
     */
    public kyve.stakers.v1beta1.Tx.MsgJoinPoolResponse joinPool(kyve.stakers.v1beta1.Tx.MsgJoinPool request) {
      return blockingUnaryCall(
          getChannel(), getJoinPoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LeavePool ...
     * </pre>
     */
    public kyve.stakers.v1beta1.Tx.MsgLeavePoolResponse leavePool(kyve.stakers.v1beta1.Tx.MsgLeavePool request) {
      return blockingUnaryCall(
          getChannel(), getLeavePoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/stakers module
     * parameters. The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public kyve.stakers.v1beta1.Tx.MsgUpdateParamsResponse updateParams(kyve.stakers.v1beta1.Tx.MsgUpdateParams request) {
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
     * CreateStaker ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.stakers.v1beta1.Tx.MsgCreateStakerResponse> createStaker(
        kyve.stakers.v1beta1.Tx.MsgCreateStaker request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateStakerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateMetadata ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.stakers.v1beta1.Tx.MsgUpdateMetadataResponse> updateMetadata(
        kyve.stakers.v1beta1.Tx.MsgUpdateMetadata request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateCommission ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.stakers.v1beta1.Tx.MsgUpdateCommissionResponse> updateCommission(
        kyve.stakers.v1beta1.Tx.MsgUpdateCommission request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCommissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * JoinPool ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.stakers.v1beta1.Tx.MsgJoinPoolResponse> joinPool(
        kyve.stakers.v1beta1.Tx.MsgJoinPool request) {
      return futureUnaryCall(
          getChannel().newCall(getJoinPoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LeavePool ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.stakers.v1beta1.Tx.MsgLeavePoolResponse> leavePool(
        kyve.stakers.v1beta1.Tx.MsgLeavePool request) {
      return futureUnaryCall(
          getChannel().newCall(getLeavePoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/stakers module
     * parameters. The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.stakers.v1beta1.Tx.MsgUpdateParamsResponse> updateParams(
        kyve.stakers.v1beta1.Tx.MsgUpdateParams request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_STAKER = 0;
  private static final int METHODID_UPDATE_METADATA = 1;
  private static final int METHODID_UPDATE_COMMISSION = 2;
  private static final int METHODID_JOIN_POOL = 3;
  private static final int METHODID_LEAVE_POOL = 4;
  private static final int METHODID_UPDATE_PARAMS = 5;

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
        case METHODID_CREATE_STAKER:
          serviceImpl.createStaker((kyve.stakers.v1beta1.Tx.MsgCreateStaker) request,
              (io.grpc.stub.StreamObserver<kyve.stakers.v1beta1.Tx.MsgCreateStakerResponse>) responseObserver);
          break;
        case METHODID_UPDATE_METADATA:
          serviceImpl.updateMetadata((kyve.stakers.v1beta1.Tx.MsgUpdateMetadata) request,
              (io.grpc.stub.StreamObserver<kyve.stakers.v1beta1.Tx.MsgUpdateMetadataResponse>) responseObserver);
          break;
        case METHODID_UPDATE_COMMISSION:
          serviceImpl.updateCommission((kyve.stakers.v1beta1.Tx.MsgUpdateCommission) request,
              (io.grpc.stub.StreamObserver<kyve.stakers.v1beta1.Tx.MsgUpdateCommissionResponse>) responseObserver);
          break;
        case METHODID_JOIN_POOL:
          serviceImpl.joinPool((kyve.stakers.v1beta1.Tx.MsgJoinPool) request,
              (io.grpc.stub.StreamObserver<kyve.stakers.v1beta1.Tx.MsgJoinPoolResponse>) responseObserver);
          break;
        case METHODID_LEAVE_POOL:
          serviceImpl.leavePool((kyve.stakers.v1beta1.Tx.MsgLeavePool) request,
              (io.grpc.stub.StreamObserver<kyve.stakers.v1beta1.Tx.MsgLeavePoolResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PARAMS:
          serviceImpl.updateParams((kyve.stakers.v1beta1.Tx.MsgUpdateParams) request,
              (io.grpc.stub.StreamObserver<kyve.stakers.v1beta1.Tx.MsgUpdateParamsResponse>) responseObserver);
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
      return kyve.stakers.v1beta1.Tx.getDescriptor();
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
              .addMethod(getCreateStakerMethod())
              .addMethod(getUpdateMetadataMethod())
              .addMethod(getUpdateCommissionMethod())
              .addMethod(getJoinPoolMethod())
              .addMethod(getLeavePoolMethod())
              .addMethod(getUpdateParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
