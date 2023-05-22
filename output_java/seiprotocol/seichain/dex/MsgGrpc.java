package seiprotocol.seichain.dex;

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
    comments = "Source: sei/dex/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "seiprotocol.seichain.dex.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.dex.Tx.MsgPlaceOrders,
      seiprotocol.seichain.dex.Tx.MsgPlaceOrdersResponse> getPlaceOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlaceOrders",
      requestType = seiprotocol.seichain.dex.Tx.MsgPlaceOrders.class,
      responseType = seiprotocol.seichain.dex.Tx.MsgPlaceOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.dex.Tx.MsgPlaceOrders,
      seiprotocol.seichain.dex.Tx.MsgPlaceOrdersResponse> getPlaceOrdersMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.dex.Tx.MsgPlaceOrders, seiprotocol.seichain.dex.Tx.MsgPlaceOrdersResponse> getPlaceOrdersMethod;
    if ((getPlaceOrdersMethod = MsgGrpc.getPlaceOrdersMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getPlaceOrdersMethod = MsgGrpc.getPlaceOrdersMethod) == null) {
          MsgGrpc.getPlaceOrdersMethod = getPlaceOrdersMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.dex.Tx.MsgPlaceOrders, seiprotocol.seichain.dex.Tx.MsgPlaceOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlaceOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.Tx.MsgPlaceOrders.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.Tx.MsgPlaceOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("PlaceOrders"))
              .build();
        }
      }
    }
    return getPlaceOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.dex.Tx.MsgCancelOrders,
      seiprotocol.seichain.dex.Tx.MsgCancelOrdersResponse> getCancelOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelOrders",
      requestType = seiprotocol.seichain.dex.Tx.MsgCancelOrders.class,
      responseType = seiprotocol.seichain.dex.Tx.MsgCancelOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.dex.Tx.MsgCancelOrders,
      seiprotocol.seichain.dex.Tx.MsgCancelOrdersResponse> getCancelOrdersMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.dex.Tx.MsgCancelOrders, seiprotocol.seichain.dex.Tx.MsgCancelOrdersResponse> getCancelOrdersMethod;
    if ((getCancelOrdersMethod = MsgGrpc.getCancelOrdersMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCancelOrdersMethod = MsgGrpc.getCancelOrdersMethod) == null) {
          MsgGrpc.getCancelOrdersMethod = getCancelOrdersMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.dex.Tx.MsgCancelOrders, seiprotocol.seichain.dex.Tx.MsgCancelOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.Tx.MsgCancelOrders.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.Tx.MsgCancelOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CancelOrders"))
              .build();
        }
      }
    }
    return getCancelOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.dex.Tx.MsgRegisterContract,
      seiprotocol.seichain.dex.Tx.MsgRegisterContractResponse> getRegisterContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterContract",
      requestType = seiprotocol.seichain.dex.Tx.MsgRegisterContract.class,
      responseType = seiprotocol.seichain.dex.Tx.MsgRegisterContractResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.dex.Tx.MsgRegisterContract,
      seiprotocol.seichain.dex.Tx.MsgRegisterContractResponse> getRegisterContractMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.dex.Tx.MsgRegisterContract, seiprotocol.seichain.dex.Tx.MsgRegisterContractResponse> getRegisterContractMethod;
    if ((getRegisterContractMethod = MsgGrpc.getRegisterContractMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRegisterContractMethod = MsgGrpc.getRegisterContractMethod) == null) {
          MsgGrpc.getRegisterContractMethod = getRegisterContractMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.dex.Tx.MsgRegisterContract, seiprotocol.seichain.dex.Tx.MsgRegisterContractResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.Tx.MsgRegisterContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.Tx.MsgRegisterContractResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RegisterContract"))
              .build();
        }
      }
    }
    return getRegisterContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.dex.Tx.MsgContractDepositRent,
      seiprotocol.seichain.dex.Tx.MsgContractDepositRentResponse> getContractDepositRentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ContractDepositRent",
      requestType = seiprotocol.seichain.dex.Tx.MsgContractDepositRent.class,
      responseType = seiprotocol.seichain.dex.Tx.MsgContractDepositRentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.dex.Tx.MsgContractDepositRent,
      seiprotocol.seichain.dex.Tx.MsgContractDepositRentResponse> getContractDepositRentMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.dex.Tx.MsgContractDepositRent, seiprotocol.seichain.dex.Tx.MsgContractDepositRentResponse> getContractDepositRentMethod;
    if ((getContractDepositRentMethod = MsgGrpc.getContractDepositRentMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getContractDepositRentMethod = MsgGrpc.getContractDepositRentMethod) == null) {
          MsgGrpc.getContractDepositRentMethod = getContractDepositRentMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.dex.Tx.MsgContractDepositRent, seiprotocol.seichain.dex.Tx.MsgContractDepositRentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ContractDepositRent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.Tx.MsgContractDepositRent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.Tx.MsgContractDepositRentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ContractDepositRent"))
              .build();
        }
      }
    }
    return getContractDepositRentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.dex.Tx.MsgUnregisterContract,
      seiprotocol.seichain.dex.Tx.MsgUnregisterContractResponse> getUnregisterContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnregisterContract",
      requestType = seiprotocol.seichain.dex.Tx.MsgUnregisterContract.class,
      responseType = seiprotocol.seichain.dex.Tx.MsgUnregisterContractResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.dex.Tx.MsgUnregisterContract,
      seiprotocol.seichain.dex.Tx.MsgUnregisterContractResponse> getUnregisterContractMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.dex.Tx.MsgUnregisterContract, seiprotocol.seichain.dex.Tx.MsgUnregisterContractResponse> getUnregisterContractMethod;
    if ((getUnregisterContractMethod = MsgGrpc.getUnregisterContractMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUnregisterContractMethod = MsgGrpc.getUnregisterContractMethod) == null) {
          MsgGrpc.getUnregisterContractMethod = getUnregisterContractMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.dex.Tx.MsgUnregisterContract, seiprotocol.seichain.dex.Tx.MsgUnregisterContractResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnregisterContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.Tx.MsgUnregisterContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.Tx.MsgUnregisterContractResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UnregisterContract"))
              .build();
        }
      }
    }
    return getUnregisterContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.dex.Tx.MsgRegisterPairs,
      seiprotocol.seichain.dex.Tx.MsgRegisterPairsResponse> getRegisterPairsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterPairs",
      requestType = seiprotocol.seichain.dex.Tx.MsgRegisterPairs.class,
      responseType = seiprotocol.seichain.dex.Tx.MsgRegisterPairsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.dex.Tx.MsgRegisterPairs,
      seiprotocol.seichain.dex.Tx.MsgRegisterPairsResponse> getRegisterPairsMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.dex.Tx.MsgRegisterPairs, seiprotocol.seichain.dex.Tx.MsgRegisterPairsResponse> getRegisterPairsMethod;
    if ((getRegisterPairsMethod = MsgGrpc.getRegisterPairsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRegisterPairsMethod = MsgGrpc.getRegisterPairsMethod) == null) {
          MsgGrpc.getRegisterPairsMethod = getRegisterPairsMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.dex.Tx.MsgRegisterPairs, seiprotocol.seichain.dex.Tx.MsgRegisterPairsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterPairs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.Tx.MsgRegisterPairs.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.Tx.MsgRegisterPairsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RegisterPairs"))
              .build();
        }
      }
    }
    return getRegisterPairsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.dex.Tx.MsgUpdatePriceTickSize,
      seiprotocol.seichain.dex.Tx.MsgUpdateTickSizeResponse> getUpdatePriceTickSizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePriceTickSize",
      requestType = seiprotocol.seichain.dex.Tx.MsgUpdatePriceTickSize.class,
      responseType = seiprotocol.seichain.dex.Tx.MsgUpdateTickSizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.dex.Tx.MsgUpdatePriceTickSize,
      seiprotocol.seichain.dex.Tx.MsgUpdateTickSizeResponse> getUpdatePriceTickSizeMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.dex.Tx.MsgUpdatePriceTickSize, seiprotocol.seichain.dex.Tx.MsgUpdateTickSizeResponse> getUpdatePriceTickSizeMethod;
    if ((getUpdatePriceTickSizeMethod = MsgGrpc.getUpdatePriceTickSizeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdatePriceTickSizeMethod = MsgGrpc.getUpdatePriceTickSizeMethod) == null) {
          MsgGrpc.getUpdatePriceTickSizeMethod = getUpdatePriceTickSizeMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.dex.Tx.MsgUpdatePriceTickSize, seiprotocol.seichain.dex.Tx.MsgUpdateTickSizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePriceTickSize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.Tx.MsgUpdatePriceTickSize.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.Tx.MsgUpdateTickSizeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdatePriceTickSize"))
              .build();
        }
      }
    }
    return getUpdatePriceTickSizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.dex.Tx.MsgUpdateQuantityTickSize,
      seiprotocol.seichain.dex.Tx.MsgUpdateTickSizeResponse> getUpdateQuantityTickSizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateQuantityTickSize",
      requestType = seiprotocol.seichain.dex.Tx.MsgUpdateQuantityTickSize.class,
      responseType = seiprotocol.seichain.dex.Tx.MsgUpdateTickSizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.dex.Tx.MsgUpdateQuantityTickSize,
      seiprotocol.seichain.dex.Tx.MsgUpdateTickSizeResponse> getUpdateQuantityTickSizeMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.dex.Tx.MsgUpdateQuantityTickSize, seiprotocol.seichain.dex.Tx.MsgUpdateTickSizeResponse> getUpdateQuantityTickSizeMethod;
    if ((getUpdateQuantityTickSizeMethod = MsgGrpc.getUpdateQuantityTickSizeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateQuantityTickSizeMethod = MsgGrpc.getUpdateQuantityTickSizeMethod) == null) {
          MsgGrpc.getUpdateQuantityTickSizeMethod = getUpdateQuantityTickSizeMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.dex.Tx.MsgUpdateQuantityTickSize, seiprotocol.seichain.dex.Tx.MsgUpdateTickSizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateQuantityTickSize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.Tx.MsgUpdateQuantityTickSize.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.Tx.MsgUpdateTickSizeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateQuantityTickSize"))
              .build();
        }
      }
    }
    return getUpdateQuantityTickSizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.dex.Tx.MsgUnsuspendContract,
      seiprotocol.seichain.dex.Tx.MsgUnsuspendContractResponse> getUnsuspendContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnsuspendContract",
      requestType = seiprotocol.seichain.dex.Tx.MsgUnsuspendContract.class,
      responseType = seiprotocol.seichain.dex.Tx.MsgUnsuspendContractResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.dex.Tx.MsgUnsuspendContract,
      seiprotocol.seichain.dex.Tx.MsgUnsuspendContractResponse> getUnsuspendContractMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.dex.Tx.MsgUnsuspendContract, seiprotocol.seichain.dex.Tx.MsgUnsuspendContractResponse> getUnsuspendContractMethod;
    if ((getUnsuspendContractMethod = MsgGrpc.getUnsuspendContractMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUnsuspendContractMethod = MsgGrpc.getUnsuspendContractMethod) == null) {
          MsgGrpc.getUnsuspendContractMethod = getUnsuspendContractMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.dex.Tx.MsgUnsuspendContract, seiprotocol.seichain.dex.Tx.MsgUnsuspendContractResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnsuspendContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.Tx.MsgUnsuspendContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.dex.Tx.MsgUnsuspendContractResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UnsuspendContract"))
              .build();
        }
      }
    }
    return getUnsuspendContractMethod;
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
    public void placeOrders(seiprotocol.seichain.dex.Tx.MsgPlaceOrders request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.Tx.MsgPlaceOrdersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPlaceOrdersMethod(), responseObserver);
    }

    /**
     */
    public void cancelOrders(seiprotocol.seichain.dex.Tx.MsgCancelOrders request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.Tx.MsgCancelOrdersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCancelOrdersMethod(), responseObserver);
    }

    /**
     */
    public void registerContract(seiprotocol.seichain.dex.Tx.MsgRegisterContract request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.Tx.MsgRegisterContractResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterContractMethod(), responseObserver);
    }

    /**
     */
    public void contractDepositRent(seiprotocol.seichain.dex.Tx.MsgContractDepositRent request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.Tx.MsgContractDepositRentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getContractDepositRentMethod(), responseObserver);
    }

    /**
     */
    public void unregisterContract(seiprotocol.seichain.dex.Tx.MsgUnregisterContract request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.Tx.MsgUnregisterContractResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnregisterContractMethod(), responseObserver);
    }

    /**
     */
    public void registerPairs(seiprotocol.seichain.dex.Tx.MsgRegisterPairs request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.Tx.MsgRegisterPairsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterPairsMethod(), responseObserver);
    }

    /**
     */
    public void updatePriceTickSize(seiprotocol.seichain.dex.Tx.MsgUpdatePriceTickSize request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.Tx.MsgUpdateTickSizeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatePriceTickSizeMethod(), responseObserver);
    }

    /**
     */
    public void updateQuantityTickSize(seiprotocol.seichain.dex.Tx.MsgUpdateQuantityTickSize request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.Tx.MsgUpdateTickSizeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateQuantityTickSizeMethod(), responseObserver);
    }

    /**
     * <pre>
     * privileged endpoints below
     * </pre>
     */
    public void unsuspendContract(seiprotocol.seichain.dex.Tx.MsgUnsuspendContract request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.Tx.MsgUnsuspendContractResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnsuspendContractMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPlaceOrdersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                seiprotocol.seichain.dex.Tx.MsgPlaceOrders,
                seiprotocol.seichain.dex.Tx.MsgPlaceOrdersResponse>(
                  this, METHODID_PLACE_ORDERS)))
          .addMethod(
            getCancelOrdersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                seiprotocol.seichain.dex.Tx.MsgCancelOrders,
                seiprotocol.seichain.dex.Tx.MsgCancelOrdersResponse>(
                  this, METHODID_CANCEL_ORDERS)))
          .addMethod(
            getRegisterContractMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                seiprotocol.seichain.dex.Tx.MsgRegisterContract,
                seiprotocol.seichain.dex.Tx.MsgRegisterContractResponse>(
                  this, METHODID_REGISTER_CONTRACT)))
          .addMethod(
            getContractDepositRentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                seiprotocol.seichain.dex.Tx.MsgContractDepositRent,
                seiprotocol.seichain.dex.Tx.MsgContractDepositRentResponse>(
                  this, METHODID_CONTRACT_DEPOSIT_RENT)))
          .addMethod(
            getUnregisterContractMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                seiprotocol.seichain.dex.Tx.MsgUnregisterContract,
                seiprotocol.seichain.dex.Tx.MsgUnregisterContractResponse>(
                  this, METHODID_UNREGISTER_CONTRACT)))
          .addMethod(
            getRegisterPairsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                seiprotocol.seichain.dex.Tx.MsgRegisterPairs,
                seiprotocol.seichain.dex.Tx.MsgRegisterPairsResponse>(
                  this, METHODID_REGISTER_PAIRS)))
          .addMethod(
            getUpdatePriceTickSizeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                seiprotocol.seichain.dex.Tx.MsgUpdatePriceTickSize,
                seiprotocol.seichain.dex.Tx.MsgUpdateTickSizeResponse>(
                  this, METHODID_UPDATE_PRICE_TICK_SIZE)))
          .addMethod(
            getUpdateQuantityTickSizeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                seiprotocol.seichain.dex.Tx.MsgUpdateQuantityTickSize,
                seiprotocol.seichain.dex.Tx.MsgUpdateTickSizeResponse>(
                  this, METHODID_UPDATE_QUANTITY_TICK_SIZE)))
          .addMethod(
            getUnsuspendContractMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                seiprotocol.seichain.dex.Tx.MsgUnsuspendContract,
                seiprotocol.seichain.dex.Tx.MsgUnsuspendContractResponse>(
                  this, METHODID_UNSUSPEND_CONTRACT)))
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
    public void placeOrders(seiprotocol.seichain.dex.Tx.MsgPlaceOrders request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.Tx.MsgPlaceOrdersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPlaceOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelOrders(seiprotocol.seichain.dex.Tx.MsgCancelOrders request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.Tx.MsgCancelOrdersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCancelOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerContract(seiprotocol.seichain.dex.Tx.MsgRegisterContract request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.Tx.MsgRegisterContractResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void contractDepositRent(seiprotocol.seichain.dex.Tx.MsgContractDepositRent request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.Tx.MsgContractDepositRentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getContractDepositRentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unregisterContract(seiprotocol.seichain.dex.Tx.MsgUnregisterContract request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.Tx.MsgUnregisterContractResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnregisterContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerPairs(seiprotocol.seichain.dex.Tx.MsgRegisterPairs request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.Tx.MsgRegisterPairsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterPairsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePriceTickSize(seiprotocol.seichain.dex.Tx.MsgUpdatePriceTickSize request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.Tx.MsgUpdateTickSizeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatePriceTickSizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateQuantityTickSize(seiprotocol.seichain.dex.Tx.MsgUpdateQuantityTickSize request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.Tx.MsgUpdateTickSizeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateQuantityTickSizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * privileged endpoints below
     * </pre>
     */
    public void unsuspendContract(seiprotocol.seichain.dex.Tx.MsgUnsuspendContract request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.Tx.MsgUnsuspendContractResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnsuspendContractMethod(), getCallOptions()), request, responseObserver);
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
    public seiprotocol.seichain.dex.Tx.MsgPlaceOrdersResponse placeOrders(seiprotocol.seichain.dex.Tx.MsgPlaceOrders request) {
      return blockingUnaryCall(
          getChannel(), getPlaceOrdersMethod(), getCallOptions(), request);
    }

    /**
     */
    public seiprotocol.seichain.dex.Tx.MsgCancelOrdersResponse cancelOrders(seiprotocol.seichain.dex.Tx.MsgCancelOrders request) {
      return blockingUnaryCall(
          getChannel(), getCancelOrdersMethod(), getCallOptions(), request);
    }

    /**
     */
    public seiprotocol.seichain.dex.Tx.MsgRegisterContractResponse registerContract(seiprotocol.seichain.dex.Tx.MsgRegisterContract request) {
      return blockingUnaryCall(
          getChannel(), getRegisterContractMethod(), getCallOptions(), request);
    }

    /**
     */
    public seiprotocol.seichain.dex.Tx.MsgContractDepositRentResponse contractDepositRent(seiprotocol.seichain.dex.Tx.MsgContractDepositRent request) {
      return blockingUnaryCall(
          getChannel(), getContractDepositRentMethod(), getCallOptions(), request);
    }

    /**
     */
    public seiprotocol.seichain.dex.Tx.MsgUnregisterContractResponse unregisterContract(seiprotocol.seichain.dex.Tx.MsgUnregisterContract request) {
      return blockingUnaryCall(
          getChannel(), getUnregisterContractMethod(), getCallOptions(), request);
    }

    /**
     */
    public seiprotocol.seichain.dex.Tx.MsgRegisterPairsResponse registerPairs(seiprotocol.seichain.dex.Tx.MsgRegisterPairs request) {
      return blockingUnaryCall(
          getChannel(), getRegisterPairsMethod(), getCallOptions(), request);
    }

    /**
     */
    public seiprotocol.seichain.dex.Tx.MsgUpdateTickSizeResponse updatePriceTickSize(seiprotocol.seichain.dex.Tx.MsgUpdatePriceTickSize request) {
      return blockingUnaryCall(
          getChannel(), getUpdatePriceTickSizeMethod(), getCallOptions(), request);
    }

    /**
     */
    public seiprotocol.seichain.dex.Tx.MsgUpdateTickSizeResponse updateQuantityTickSize(seiprotocol.seichain.dex.Tx.MsgUpdateQuantityTickSize request) {
      return blockingUnaryCall(
          getChannel(), getUpdateQuantityTickSizeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * privileged endpoints below
     * </pre>
     */
    public seiprotocol.seichain.dex.Tx.MsgUnsuspendContractResponse unsuspendContract(seiprotocol.seichain.dex.Tx.MsgUnsuspendContract request) {
      return blockingUnaryCall(
          getChannel(), getUnsuspendContractMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.dex.Tx.MsgPlaceOrdersResponse> placeOrders(
        seiprotocol.seichain.dex.Tx.MsgPlaceOrders request) {
      return futureUnaryCall(
          getChannel().newCall(getPlaceOrdersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.dex.Tx.MsgCancelOrdersResponse> cancelOrders(
        seiprotocol.seichain.dex.Tx.MsgCancelOrders request) {
      return futureUnaryCall(
          getChannel().newCall(getCancelOrdersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.dex.Tx.MsgRegisterContractResponse> registerContract(
        seiprotocol.seichain.dex.Tx.MsgRegisterContract request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterContractMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.dex.Tx.MsgContractDepositRentResponse> contractDepositRent(
        seiprotocol.seichain.dex.Tx.MsgContractDepositRent request) {
      return futureUnaryCall(
          getChannel().newCall(getContractDepositRentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.dex.Tx.MsgUnregisterContractResponse> unregisterContract(
        seiprotocol.seichain.dex.Tx.MsgUnregisterContract request) {
      return futureUnaryCall(
          getChannel().newCall(getUnregisterContractMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.dex.Tx.MsgRegisterPairsResponse> registerPairs(
        seiprotocol.seichain.dex.Tx.MsgRegisterPairs request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterPairsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.dex.Tx.MsgUpdateTickSizeResponse> updatePriceTickSize(
        seiprotocol.seichain.dex.Tx.MsgUpdatePriceTickSize request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatePriceTickSizeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.dex.Tx.MsgUpdateTickSizeResponse> updateQuantityTickSize(
        seiprotocol.seichain.dex.Tx.MsgUpdateQuantityTickSize request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateQuantityTickSizeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * privileged endpoints below
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.dex.Tx.MsgUnsuspendContractResponse> unsuspendContract(
        seiprotocol.seichain.dex.Tx.MsgUnsuspendContract request) {
      return futureUnaryCall(
          getChannel().newCall(getUnsuspendContractMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PLACE_ORDERS = 0;
  private static final int METHODID_CANCEL_ORDERS = 1;
  private static final int METHODID_REGISTER_CONTRACT = 2;
  private static final int METHODID_CONTRACT_DEPOSIT_RENT = 3;
  private static final int METHODID_UNREGISTER_CONTRACT = 4;
  private static final int METHODID_REGISTER_PAIRS = 5;
  private static final int METHODID_UPDATE_PRICE_TICK_SIZE = 6;
  private static final int METHODID_UPDATE_QUANTITY_TICK_SIZE = 7;
  private static final int METHODID_UNSUSPEND_CONTRACT = 8;

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
        case METHODID_PLACE_ORDERS:
          serviceImpl.placeOrders((seiprotocol.seichain.dex.Tx.MsgPlaceOrders) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.Tx.MsgPlaceOrdersResponse>) responseObserver);
          break;
        case METHODID_CANCEL_ORDERS:
          serviceImpl.cancelOrders((seiprotocol.seichain.dex.Tx.MsgCancelOrders) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.Tx.MsgCancelOrdersResponse>) responseObserver);
          break;
        case METHODID_REGISTER_CONTRACT:
          serviceImpl.registerContract((seiprotocol.seichain.dex.Tx.MsgRegisterContract) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.Tx.MsgRegisterContractResponse>) responseObserver);
          break;
        case METHODID_CONTRACT_DEPOSIT_RENT:
          serviceImpl.contractDepositRent((seiprotocol.seichain.dex.Tx.MsgContractDepositRent) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.Tx.MsgContractDepositRentResponse>) responseObserver);
          break;
        case METHODID_UNREGISTER_CONTRACT:
          serviceImpl.unregisterContract((seiprotocol.seichain.dex.Tx.MsgUnregisterContract) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.Tx.MsgUnregisterContractResponse>) responseObserver);
          break;
        case METHODID_REGISTER_PAIRS:
          serviceImpl.registerPairs((seiprotocol.seichain.dex.Tx.MsgRegisterPairs) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.Tx.MsgRegisterPairsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PRICE_TICK_SIZE:
          serviceImpl.updatePriceTickSize((seiprotocol.seichain.dex.Tx.MsgUpdatePriceTickSize) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.Tx.MsgUpdateTickSizeResponse>) responseObserver);
          break;
        case METHODID_UPDATE_QUANTITY_TICK_SIZE:
          serviceImpl.updateQuantityTickSize((seiprotocol.seichain.dex.Tx.MsgUpdateQuantityTickSize) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.Tx.MsgUpdateTickSizeResponse>) responseObserver);
          break;
        case METHODID_UNSUSPEND_CONTRACT:
          serviceImpl.unsuspendContract((seiprotocol.seichain.dex.Tx.MsgUnsuspendContract) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.dex.Tx.MsgUnsuspendContractResponse>) responseObserver);
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
      return seiprotocol.seichain.dex.Tx.getDescriptor();
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
              .addMethod(getPlaceOrdersMethod())
              .addMethod(getCancelOrdersMethod())
              .addMethod(getRegisterContractMethod())
              .addMethod(getContractDepositRentMethod())
              .addMethod(getUnregisterContractMethod())
              .addMethod(getRegisterPairsMethod())
              .addMethod(getUpdatePriceTickSizeMethod())
              .addMethod(getUpdateQuantityTickSizeMethod())
              .addMethod(getUnsuspendContractMethod())
              .build();
        }
      }
    }
    return result;
  }
}
