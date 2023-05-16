package stafihub.stafihub.rdex;

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
    comments = "Source: stafihub/rdex/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "stafihub.stafihub.rdex.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rdex.Tx.MsgCreatePool,
      stafihub.stafihub.rdex.Tx.MsgCreatePoolResponse> getCreatePoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePool",
      requestType = stafihub.stafihub.rdex.Tx.MsgCreatePool.class,
      responseType = stafihub.stafihub.rdex.Tx.MsgCreatePoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rdex.Tx.MsgCreatePool,
      stafihub.stafihub.rdex.Tx.MsgCreatePoolResponse> getCreatePoolMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rdex.Tx.MsgCreatePool, stafihub.stafihub.rdex.Tx.MsgCreatePoolResponse> getCreatePoolMethod;
    if ((getCreatePoolMethod = MsgGrpc.getCreatePoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreatePoolMethod = MsgGrpc.getCreatePoolMethod) == null) {
          MsgGrpc.getCreatePoolMethod = getCreatePoolMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rdex.Tx.MsgCreatePool, stafihub.stafihub.rdex.Tx.MsgCreatePoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rdex.Tx.MsgCreatePool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rdex.Tx.MsgCreatePoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreatePool"))
              .build();
        }
      }
    }
    return getCreatePoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rdex.Tx.MsgAddLiquidity,
      stafihub.stafihub.rdex.Tx.MsgAddLiquidityResponse> getAddLiquidityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddLiquidity",
      requestType = stafihub.stafihub.rdex.Tx.MsgAddLiquidity.class,
      responseType = stafihub.stafihub.rdex.Tx.MsgAddLiquidityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rdex.Tx.MsgAddLiquidity,
      stafihub.stafihub.rdex.Tx.MsgAddLiquidityResponse> getAddLiquidityMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rdex.Tx.MsgAddLiquidity, stafihub.stafihub.rdex.Tx.MsgAddLiquidityResponse> getAddLiquidityMethod;
    if ((getAddLiquidityMethod = MsgGrpc.getAddLiquidityMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddLiquidityMethod = MsgGrpc.getAddLiquidityMethod) == null) {
          MsgGrpc.getAddLiquidityMethod = getAddLiquidityMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rdex.Tx.MsgAddLiquidity, stafihub.stafihub.rdex.Tx.MsgAddLiquidityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddLiquidity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rdex.Tx.MsgAddLiquidity.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rdex.Tx.MsgAddLiquidityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddLiquidity"))
              .build();
        }
      }
    }
    return getAddLiquidityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rdex.Tx.MsgSwap,
      stafihub.stafihub.rdex.Tx.MsgSwapResponse> getSwapMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Swap",
      requestType = stafihub.stafihub.rdex.Tx.MsgSwap.class,
      responseType = stafihub.stafihub.rdex.Tx.MsgSwapResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rdex.Tx.MsgSwap,
      stafihub.stafihub.rdex.Tx.MsgSwapResponse> getSwapMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rdex.Tx.MsgSwap, stafihub.stafihub.rdex.Tx.MsgSwapResponse> getSwapMethod;
    if ((getSwapMethod = MsgGrpc.getSwapMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSwapMethod = MsgGrpc.getSwapMethod) == null) {
          MsgGrpc.getSwapMethod = getSwapMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rdex.Tx.MsgSwap, stafihub.stafihub.rdex.Tx.MsgSwapResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Swap"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rdex.Tx.MsgSwap.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rdex.Tx.MsgSwapResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Swap"))
              .build();
        }
      }
    }
    return getSwapMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rdex.Tx.MsgRemoveLiquidity,
      stafihub.stafihub.rdex.Tx.MsgRemoveLiquidityResponse> getRemoveLiquidityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveLiquidity",
      requestType = stafihub.stafihub.rdex.Tx.MsgRemoveLiquidity.class,
      responseType = stafihub.stafihub.rdex.Tx.MsgRemoveLiquidityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rdex.Tx.MsgRemoveLiquidity,
      stafihub.stafihub.rdex.Tx.MsgRemoveLiquidityResponse> getRemoveLiquidityMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rdex.Tx.MsgRemoveLiquidity, stafihub.stafihub.rdex.Tx.MsgRemoveLiquidityResponse> getRemoveLiquidityMethod;
    if ((getRemoveLiquidityMethod = MsgGrpc.getRemoveLiquidityMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemoveLiquidityMethod = MsgGrpc.getRemoveLiquidityMethod) == null) {
          MsgGrpc.getRemoveLiquidityMethod = getRemoveLiquidityMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rdex.Tx.MsgRemoveLiquidity, stafihub.stafihub.rdex.Tx.MsgRemoveLiquidityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveLiquidity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rdex.Tx.MsgRemoveLiquidity.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rdex.Tx.MsgRemoveLiquidityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemoveLiquidity"))
              .build();
        }
      }
    }
    return getRemoveLiquidityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rdex.Tx.MsgToggleProviderSwitch,
      stafihub.stafihub.rdex.Tx.MsgToggleProviderSwitchResponse> getToggleProviderSwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ToggleProviderSwitch",
      requestType = stafihub.stafihub.rdex.Tx.MsgToggleProviderSwitch.class,
      responseType = stafihub.stafihub.rdex.Tx.MsgToggleProviderSwitchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rdex.Tx.MsgToggleProviderSwitch,
      stafihub.stafihub.rdex.Tx.MsgToggleProviderSwitchResponse> getToggleProviderSwitchMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rdex.Tx.MsgToggleProviderSwitch, stafihub.stafihub.rdex.Tx.MsgToggleProviderSwitchResponse> getToggleProviderSwitchMethod;
    if ((getToggleProviderSwitchMethod = MsgGrpc.getToggleProviderSwitchMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getToggleProviderSwitchMethod = MsgGrpc.getToggleProviderSwitchMethod) == null) {
          MsgGrpc.getToggleProviderSwitchMethod = getToggleProviderSwitchMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rdex.Tx.MsgToggleProviderSwitch, stafihub.stafihub.rdex.Tx.MsgToggleProviderSwitchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ToggleProviderSwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rdex.Tx.MsgToggleProviderSwitch.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rdex.Tx.MsgToggleProviderSwitchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ToggleProviderSwitch"))
              .build();
        }
      }
    }
    return getToggleProviderSwitchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rdex.Tx.MsgAddProvider,
      stafihub.stafihub.rdex.Tx.MsgAddProviderResponse> getAddProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddProvider",
      requestType = stafihub.stafihub.rdex.Tx.MsgAddProvider.class,
      responseType = stafihub.stafihub.rdex.Tx.MsgAddProviderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rdex.Tx.MsgAddProvider,
      stafihub.stafihub.rdex.Tx.MsgAddProviderResponse> getAddProviderMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rdex.Tx.MsgAddProvider, stafihub.stafihub.rdex.Tx.MsgAddProviderResponse> getAddProviderMethod;
    if ((getAddProviderMethod = MsgGrpc.getAddProviderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddProviderMethod = MsgGrpc.getAddProviderMethod) == null) {
          MsgGrpc.getAddProviderMethod = getAddProviderMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rdex.Tx.MsgAddProvider, stafihub.stafihub.rdex.Tx.MsgAddProviderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rdex.Tx.MsgAddProvider.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rdex.Tx.MsgAddProviderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddProvider"))
              .build();
        }
      }
    }
    return getAddProviderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rdex.Tx.MsgRmProvider,
      stafihub.stafihub.rdex.Tx.MsgRmProviderResponse> getRmProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RmProvider",
      requestType = stafihub.stafihub.rdex.Tx.MsgRmProvider.class,
      responseType = stafihub.stafihub.rdex.Tx.MsgRmProviderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rdex.Tx.MsgRmProvider,
      stafihub.stafihub.rdex.Tx.MsgRmProviderResponse> getRmProviderMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rdex.Tx.MsgRmProvider, stafihub.stafihub.rdex.Tx.MsgRmProviderResponse> getRmProviderMethod;
    if ((getRmProviderMethod = MsgGrpc.getRmProviderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRmProviderMethod = MsgGrpc.getRmProviderMethod) == null) {
          MsgGrpc.getRmProviderMethod = getRmProviderMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rdex.Tx.MsgRmProvider, stafihub.stafihub.rdex.Tx.MsgRmProviderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RmProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rdex.Tx.MsgRmProvider.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rdex.Tx.MsgRmProviderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RmProvider"))
              .build();
        }
      }
    }
    return getRmProviderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rdex.Tx.MsgAddPoolCreator,
      stafihub.stafihub.rdex.Tx.MsgAddPoolCreatorResponse> getAddPoolCreatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddPoolCreator",
      requestType = stafihub.stafihub.rdex.Tx.MsgAddPoolCreator.class,
      responseType = stafihub.stafihub.rdex.Tx.MsgAddPoolCreatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rdex.Tx.MsgAddPoolCreator,
      stafihub.stafihub.rdex.Tx.MsgAddPoolCreatorResponse> getAddPoolCreatorMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rdex.Tx.MsgAddPoolCreator, stafihub.stafihub.rdex.Tx.MsgAddPoolCreatorResponse> getAddPoolCreatorMethod;
    if ((getAddPoolCreatorMethod = MsgGrpc.getAddPoolCreatorMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddPoolCreatorMethod = MsgGrpc.getAddPoolCreatorMethod) == null) {
          MsgGrpc.getAddPoolCreatorMethod = getAddPoolCreatorMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rdex.Tx.MsgAddPoolCreator, stafihub.stafihub.rdex.Tx.MsgAddPoolCreatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddPoolCreator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rdex.Tx.MsgAddPoolCreator.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rdex.Tx.MsgAddPoolCreatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddPoolCreator"))
              .build();
        }
      }
    }
    return getAddPoolCreatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rdex.Tx.MsgRmPoolCreator,
      stafihub.stafihub.rdex.Tx.MsgRmPoolCreatorResponse> getRmPoolCreatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RmPoolCreator",
      requestType = stafihub.stafihub.rdex.Tx.MsgRmPoolCreator.class,
      responseType = stafihub.stafihub.rdex.Tx.MsgRmPoolCreatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rdex.Tx.MsgRmPoolCreator,
      stafihub.stafihub.rdex.Tx.MsgRmPoolCreatorResponse> getRmPoolCreatorMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rdex.Tx.MsgRmPoolCreator, stafihub.stafihub.rdex.Tx.MsgRmPoolCreatorResponse> getRmPoolCreatorMethod;
    if ((getRmPoolCreatorMethod = MsgGrpc.getRmPoolCreatorMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRmPoolCreatorMethod = MsgGrpc.getRmPoolCreatorMethod) == null) {
          MsgGrpc.getRmPoolCreatorMethod = getRmPoolCreatorMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rdex.Tx.MsgRmPoolCreator, stafihub.stafihub.rdex.Tx.MsgRmPoolCreatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RmPoolCreator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rdex.Tx.MsgRmPoolCreator.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rdex.Tx.MsgRmPoolCreatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RmPoolCreator"))
              .build();
        }
      }
    }
    return getRmPoolCreatorMethod;
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
    public void createPool(stafihub.stafihub.rdex.Tx.MsgCreatePool request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.Tx.MsgCreatePoolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreatePoolMethod(), responseObserver);
    }

    /**
     */
    public void addLiquidity(stafihub.stafihub.rdex.Tx.MsgAddLiquidity request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.Tx.MsgAddLiquidityResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddLiquidityMethod(), responseObserver);
    }

    /**
     */
    public void swap(stafihub.stafihub.rdex.Tx.MsgSwap request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.Tx.MsgSwapResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSwapMethod(), responseObserver);
    }

    /**
     */
    public void removeLiquidity(stafihub.stafihub.rdex.Tx.MsgRemoveLiquidity request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.Tx.MsgRemoveLiquidityResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveLiquidityMethod(), responseObserver);
    }

    /**
     */
    public void toggleProviderSwitch(stafihub.stafihub.rdex.Tx.MsgToggleProviderSwitch request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.Tx.MsgToggleProviderSwitchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getToggleProviderSwitchMethod(), responseObserver);
    }

    /**
     */
    public void addProvider(stafihub.stafihub.rdex.Tx.MsgAddProvider request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.Tx.MsgAddProviderResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddProviderMethod(), responseObserver);
    }

    /**
     */
    public void rmProvider(stafihub.stafihub.rdex.Tx.MsgRmProvider request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.Tx.MsgRmProviderResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRmProviderMethod(), responseObserver);
    }

    /**
     */
    public void addPoolCreator(stafihub.stafihub.rdex.Tx.MsgAddPoolCreator request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.Tx.MsgAddPoolCreatorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddPoolCreatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void rmPoolCreator(stafihub.stafihub.rdex.Tx.MsgRmPoolCreator request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.Tx.MsgRmPoolCreatorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRmPoolCreatorMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreatePoolMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rdex.Tx.MsgCreatePool,
                stafihub.stafihub.rdex.Tx.MsgCreatePoolResponse>(
                  this, METHODID_CREATE_POOL)))
          .addMethod(
            getAddLiquidityMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rdex.Tx.MsgAddLiquidity,
                stafihub.stafihub.rdex.Tx.MsgAddLiquidityResponse>(
                  this, METHODID_ADD_LIQUIDITY)))
          .addMethod(
            getSwapMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rdex.Tx.MsgSwap,
                stafihub.stafihub.rdex.Tx.MsgSwapResponse>(
                  this, METHODID_SWAP)))
          .addMethod(
            getRemoveLiquidityMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rdex.Tx.MsgRemoveLiquidity,
                stafihub.stafihub.rdex.Tx.MsgRemoveLiquidityResponse>(
                  this, METHODID_REMOVE_LIQUIDITY)))
          .addMethod(
            getToggleProviderSwitchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rdex.Tx.MsgToggleProviderSwitch,
                stafihub.stafihub.rdex.Tx.MsgToggleProviderSwitchResponse>(
                  this, METHODID_TOGGLE_PROVIDER_SWITCH)))
          .addMethod(
            getAddProviderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rdex.Tx.MsgAddProvider,
                stafihub.stafihub.rdex.Tx.MsgAddProviderResponse>(
                  this, METHODID_ADD_PROVIDER)))
          .addMethod(
            getRmProviderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rdex.Tx.MsgRmProvider,
                stafihub.stafihub.rdex.Tx.MsgRmProviderResponse>(
                  this, METHODID_RM_PROVIDER)))
          .addMethod(
            getAddPoolCreatorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rdex.Tx.MsgAddPoolCreator,
                stafihub.stafihub.rdex.Tx.MsgAddPoolCreatorResponse>(
                  this, METHODID_ADD_POOL_CREATOR)))
          .addMethod(
            getRmPoolCreatorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rdex.Tx.MsgRmPoolCreator,
                stafihub.stafihub.rdex.Tx.MsgRmPoolCreatorResponse>(
                  this, METHODID_RM_POOL_CREATOR)))
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
    public void createPool(stafihub.stafihub.rdex.Tx.MsgCreatePool request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.Tx.MsgCreatePoolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreatePoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addLiquidity(stafihub.stafihub.rdex.Tx.MsgAddLiquidity request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.Tx.MsgAddLiquidityResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddLiquidityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void swap(stafihub.stafihub.rdex.Tx.MsgSwap request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.Tx.MsgSwapResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSwapMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeLiquidity(stafihub.stafihub.rdex.Tx.MsgRemoveLiquidity request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.Tx.MsgRemoveLiquidityResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveLiquidityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void toggleProviderSwitch(stafihub.stafihub.rdex.Tx.MsgToggleProviderSwitch request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.Tx.MsgToggleProviderSwitchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getToggleProviderSwitchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addProvider(stafihub.stafihub.rdex.Tx.MsgAddProvider request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.Tx.MsgAddProviderResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddProviderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rmProvider(stafihub.stafihub.rdex.Tx.MsgRmProvider request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.Tx.MsgRmProviderResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRmProviderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addPoolCreator(stafihub.stafihub.rdex.Tx.MsgAddPoolCreator request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.Tx.MsgAddPoolCreatorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddPoolCreatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void rmPoolCreator(stafihub.stafihub.rdex.Tx.MsgRmPoolCreator request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.Tx.MsgRmPoolCreatorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRmPoolCreatorMethod(), getCallOptions()), request, responseObserver);
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
    public stafihub.stafihub.rdex.Tx.MsgCreatePoolResponse createPool(stafihub.stafihub.rdex.Tx.MsgCreatePool request) {
      return blockingUnaryCall(
          getChannel(), getCreatePoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.rdex.Tx.MsgAddLiquidityResponse addLiquidity(stafihub.stafihub.rdex.Tx.MsgAddLiquidity request) {
      return blockingUnaryCall(
          getChannel(), getAddLiquidityMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.rdex.Tx.MsgSwapResponse swap(stafihub.stafihub.rdex.Tx.MsgSwap request) {
      return blockingUnaryCall(
          getChannel(), getSwapMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.rdex.Tx.MsgRemoveLiquidityResponse removeLiquidity(stafihub.stafihub.rdex.Tx.MsgRemoveLiquidity request) {
      return blockingUnaryCall(
          getChannel(), getRemoveLiquidityMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.rdex.Tx.MsgToggleProviderSwitchResponse toggleProviderSwitch(stafihub.stafihub.rdex.Tx.MsgToggleProviderSwitch request) {
      return blockingUnaryCall(
          getChannel(), getToggleProviderSwitchMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.rdex.Tx.MsgAddProviderResponse addProvider(stafihub.stafihub.rdex.Tx.MsgAddProvider request) {
      return blockingUnaryCall(
          getChannel(), getAddProviderMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.rdex.Tx.MsgRmProviderResponse rmProvider(stafihub.stafihub.rdex.Tx.MsgRmProvider request) {
      return blockingUnaryCall(
          getChannel(), getRmProviderMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.rdex.Tx.MsgAddPoolCreatorResponse addPoolCreator(stafihub.stafihub.rdex.Tx.MsgAddPoolCreator request) {
      return blockingUnaryCall(
          getChannel(), getAddPoolCreatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public stafihub.stafihub.rdex.Tx.MsgRmPoolCreatorResponse rmPoolCreator(stafihub.stafihub.rdex.Tx.MsgRmPoolCreator request) {
      return blockingUnaryCall(
          getChannel(), getRmPoolCreatorMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rdex.Tx.MsgCreatePoolResponse> createPool(
        stafihub.stafihub.rdex.Tx.MsgCreatePool request) {
      return futureUnaryCall(
          getChannel().newCall(getCreatePoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rdex.Tx.MsgAddLiquidityResponse> addLiquidity(
        stafihub.stafihub.rdex.Tx.MsgAddLiquidity request) {
      return futureUnaryCall(
          getChannel().newCall(getAddLiquidityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rdex.Tx.MsgSwapResponse> swap(
        stafihub.stafihub.rdex.Tx.MsgSwap request) {
      return futureUnaryCall(
          getChannel().newCall(getSwapMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rdex.Tx.MsgRemoveLiquidityResponse> removeLiquidity(
        stafihub.stafihub.rdex.Tx.MsgRemoveLiquidity request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveLiquidityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rdex.Tx.MsgToggleProviderSwitchResponse> toggleProviderSwitch(
        stafihub.stafihub.rdex.Tx.MsgToggleProviderSwitch request) {
      return futureUnaryCall(
          getChannel().newCall(getToggleProviderSwitchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rdex.Tx.MsgAddProviderResponse> addProvider(
        stafihub.stafihub.rdex.Tx.MsgAddProvider request) {
      return futureUnaryCall(
          getChannel().newCall(getAddProviderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rdex.Tx.MsgRmProviderResponse> rmProvider(
        stafihub.stafihub.rdex.Tx.MsgRmProvider request) {
      return futureUnaryCall(
          getChannel().newCall(getRmProviderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rdex.Tx.MsgAddPoolCreatorResponse> addPoolCreator(
        stafihub.stafihub.rdex.Tx.MsgAddPoolCreator request) {
      return futureUnaryCall(
          getChannel().newCall(getAddPoolCreatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rdex.Tx.MsgRmPoolCreatorResponse> rmPoolCreator(
        stafihub.stafihub.rdex.Tx.MsgRmPoolCreator request) {
      return futureUnaryCall(
          getChannel().newCall(getRmPoolCreatorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_POOL = 0;
  private static final int METHODID_ADD_LIQUIDITY = 1;
  private static final int METHODID_SWAP = 2;
  private static final int METHODID_REMOVE_LIQUIDITY = 3;
  private static final int METHODID_TOGGLE_PROVIDER_SWITCH = 4;
  private static final int METHODID_ADD_PROVIDER = 5;
  private static final int METHODID_RM_PROVIDER = 6;
  private static final int METHODID_ADD_POOL_CREATOR = 7;
  private static final int METHODID_RM_POOL_CREATOR = 8;

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
        case METHODID_CREATE_POOL:
          serviceImpl.createPool((stafihub.stafihub.rdex.Tx.MsgCreatePool) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.Tx.MsgCreatePoolResponse>) responseObserver);
          break;
        case METHODID_ADD_LIQUIDITY:
          serviceImpl.addLiquidity((stafihub.stafihub.rdex.Tx.MsgAddLiquidity) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.Tx.MsgAddLiquidityResponse>) responseObserver);
          break;
        case METHODID_SWAP:
          serviceImpl.swap((stafihub.stafihub.rdex.Tx.MsgSwap) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.Tx.MsgSwapResponse>) responseObserver);
          break;
        case METHODID_REMOVE_LIQUIDITY:
          serviceImpl.removeLiquidity((stafihub.stafihub.rdex.Tx.MsgRemoveLiquidity) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.Tx.MsgRemoveLiquidityResponse>) responseObserver);
          break;
        case METHODID_TOGGLE_PROVIDER_SWITCH:
          serviceImpl.toggleProviderSwitch((stafihub.stafihub.rdex.Tx.MsgToggleProviderSwitch) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.Tx.MsgToggleProviderSwitchResponse>) responseObserver);
          break;
        case METHODID_ADD_PROVIDER:
          serviceImpl.addProvider((stafihub.stafihub.rdex.Tx.MsgAddProvider) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.Tx.MsgAddProviderResponse>) responseObserver);
          break;
        case METHODID_RM_PROVIDER:
          serviceImpl.rmProvider((stafihub.stafihub.rdex.Tx.MsgRmProvider) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.Tx.MsgRmProviderResponse>) responseObserver);
          break;
        case METHODID_ADD_POOL_CREATOR:
          serviceImpl.addPoolCreator((stafihub.stafihub.rdex.Tx.MsgAddPoolCreator) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.Tx.MsgAddPoolCreatorResponse>) responseObserver);
          break;
        case METHODID_RM_POOL_CREATOR:
          serviceImpl.rmPoolCreator((stafihub.stafihub.rdex.Tx.MsgRmPoolCreator) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.Tx.MsgRmPoolCreatorResponse>) responseObserver);
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
      return stafihub.stafihub.rdex.Tx.getDescriptor();
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
              .addMethod(getCreatePoolMethod())
              .addMethod(getAddLiquidityMethod())
              .addMethod(getSwapMethod())
              .addMethod(getRemoveLiquidityMethod())
              .addMethod(getToggleProviderSwitchMethod())
              .addMethod(getAddProviderMethod())
              .addMethod(getRmProviderMethod())
              .addMethod(getAddPoolCreatorMethod())
              .addMethod(getRmPoolCreatorMethod())
              .build();
        }
      }
    }
    return result;
  }
}
