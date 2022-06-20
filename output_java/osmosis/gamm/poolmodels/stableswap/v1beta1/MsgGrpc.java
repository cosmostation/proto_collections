package osmosis.gamm.poolmodels.stableswap.v1beta1;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: osmosis/gamm/pool-models/stableswap/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "osmosis.gamm.poolmodels.stableswap.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgCreateStableswapPool,
      osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgCreateStableswapPoolResponse> getCreateStableswapPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateStableswapPool",
      requestType = osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgCreateStableswapPool.class,
      responseType = osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgCreateStableswapPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgCreateStableswapPool,
      osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgCreateStableswapPoolResponse> getCreateStableswapPoolMethod() {
    io.grpc.MethodDescriptor<osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgCreateStableswapPool, osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgCreateStableswapPoolResponse> getCreateStableswapPoolMethod;
    if ((getCreateStableswapPoolMethod = MsgGrpc.getCreateStableswapPoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateStableswapPoolMethod = MsgGrpc.getCreateStableswapPoolMethod) == null) {
          MsgGrpc.getCreateStableswapPoolMethod = getCreateStableswapPoolMethod =
              io.grpc.MethodDescriptor.<osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgCreateStableswapPool, osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgCreateStableswapPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateStableswapPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgCreateStableswapPool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgCreateStableswapPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateStableswapPool"))
              .build();
        }
      }
    }
    return getCreateStableswapPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgStableSwapAdjustScalingFactors,
      osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgStableSwapAdjustScalingFactorsResponse> getStableSwapAdjustScalingFactorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StableSwapAdjustScalingFactors",
      requestType = osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgStableSwapAdjustScalingFactors.class,
      responseType = osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgStableSwapAdjustScalingFactorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgStableSwapAdjustScalingFactors,
      osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgStableSwapAdjustScalingFactorsResponse> getStableSwapAdjustScalingFactorsMethod() {
    io.grpc.MethodDescriptor<osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgStableSwapAdjustScalingFactors, osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgStableSwapAdjustScalingFactorsResponse> getStableSwapAdjustScalingFactorsMethod;
    if ((getStableSwapAdjustScalingFactorsMethod = MsgGrpc.getStableSwapAdjustScalingFactorsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getStableSwapAdjustScalingFactorsMethod = MsgGrpc.getStableSwapAdjustScalingFactorsMethod) == null) {
          MsgGrpc.getStableSwapAdjustScalingFactorsMethod = getStableSwapAdjustScalingFactorsMethod =
              io.grpc.MethodDescriptor.<osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgStableSwapAdjustScalingFactors, osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgStableSwapAdjustScalingFactorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StableSwapAdjustScalingFactors"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgStableSwapAdjustScalingFactors.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgStableSwapAdjustScalingFactorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("StableSwapAdjustScalingFactors"))
              .build();
        }
      }
    }
    return getStableSwapAdjustScalingFactorsMethod;
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
   */
  public static abstract class MsgImplBase implements io.grpc.BindableService {

    /**
     */
    public void createStableswapPool(osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgCreateStableswapPool request,
        io.grpc.stub.StreamObserver<osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgCreateStableswapPoolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateStableswapPoolMethod(), responseObserver);
    }

    /**
     */
    public void stableSwapAdjustScalingFactors(osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgStableSwapAdjustScalingFactors request,
        io.grpc.stub.StreamObserver<osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgStableSwapAdjustScalingFactorsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStableSwapAdjustScalingFactorsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateStableswapPoolMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgCreateStableswapPool,
                osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgCreateStableswapPoolResponse>(
                  this, METHODID_CREATE_STABLESWAP_POOL)))
          .addMethod(
            getStableSwapAdjustScalingFactorsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgStableSwapAdjustScalingFactors,
                osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgStableSwapAdjustScalingFactorsResponse>(
                  this, METHODID_STABLE_SWAP_ADJUST_SCALING_FACTORS)))
          .build();
    }
  }

  /**
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
    public void createStableswapPool(osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgCreateStableswapPool request,
        io.grpc.stub.StreamObserver<osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgCreateStableswapPoolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateStableswapPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stableSwapAdjustScalingFactors(osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgStableSwapAdjustScalingFactors request,
        io.grpc.stub.StreamObserver<osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgStableSwapAdjustScalingFactorsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStableSwapAdjustScalingFactorsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
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
    public osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgCreateStableswapPoolResponse createStableswapPool(osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgCreateStableswapPool request) {
      return blockingUnaryCall(
          getChannel(), getCreateStableswapPoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgStableSwapAdjustScalingFactorsResponse stableSwapAdjustScalingFactors(osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgStableSwapAdjustScalingFactors request) {
      return blockingUnaryCall(
          getChannel(), getStableSwapAdjustScalingFactorsMethod(), getCallOptions(), request);
    }
  }

  /**
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
    public com.google.common.util.concurrent.ListenableFuture<osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgCreateStableswapPoolResponse> createStableswapPool(
        osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgCreateStableswapPool request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateStableswapPoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgStableSwapAdjustScalingFactorsResponse> stableSwapAdjustScalingFactors(
        osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgStableSwapAdjustScalingFactors request) {
      return futureUnaryCall(
          getChannel().newCall(getStableSwapAdjustScalingFactorsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_STABLESWAP_POOL = 0;
  private static final int METHODID_STABLE_SWAP_ADJUST_SCALING_FACTORS = 1;

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
        case METHODID_CREATE_STABLESWAP_POOL:
          serviceImpl.createStableswapPool((osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgCreateStableswapPool) request,
              (io.grpc.stub.StreamObserver<osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgCreateStableswapPoolResponse>) responseObserver);
          break;
        case METHODID_STABLE_SWAP_ADJUST_SCALING_FACTORS:
          serviceImpl.stableSwapAdjustScalingFactors((osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgStableSwapAdjustScalingFactors) request,
              (io.grpc.stub.StreamObserver<osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.MsgStableSwapAdjustScalingFactorsResponse>) responseObserver);
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
      return osmosis.gamm.poolmodels.stableswap.v1beta1.Tx.getDescriptor();
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
              .addMethod(getCreateStableswapPoolMethod())
              .addMethod(getStableSwapAdjustScalingFactorsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
