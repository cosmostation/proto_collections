package bonds;

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
 * Msg defines the bonds Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: bonds/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "bonds.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bonds.Tx.MsgCreateBond,
      bonds.Tx.MsgCreateBondResponse> getCreateBondMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBond",
      requestType = bonds.Tx.MsgCreateBond.class,
      responseType = bonds.Tx.MsgCreateBondResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bonds.Tx.MsgCreateBond,
      bonds.Tx.MsgCreateBondResponse> getCreateBondMethod() {
    io.grpc.MethodDescriptor<bonds.Tx.MsgCreateBond, bonds.Tx.MsgCreateBondResponse> getCreateBondMethod;
    if ((getCreateBondMethod = MsgGrpc.getCreateBondMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateBondMethod = MsgGrpc.getCreateBondMethod) == null) {
          MsgGrpc.getCreateBondMethod = getCreateBondMethod =
              io.grpc.MethodDescriptor.<bonds.Tx.MsgCreateBond, bonds.Tx.MsgCreateBondResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBond"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bonds.Tx.MsgCreateBond.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bonds.Tx.MsgCreateBondResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateBond"))
              .build();
        }
      }
    }
    return getCreateBondMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bonds.Tx.MsgEditBond,
      bonds.Tx.MsgEditBondResponse> getEditBondMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditBond",
      requestType = bonds.Tx.MsgEditBond.class,
      responseType = bonds.Tx.MsgEditBondResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bonds.Tx.MsgEditBond,
      bonds.Tx.MsgEditBondResponse> getEditBondMethod() {
    io.grpc.MethodDescriptor<bonds.Tx.MsgEditBond, bonds.Tx.MsgEditBondResponse> getEditBondMethod;
    if ((getEditBondMethod = MsgGrpc.getEditBondMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getEditBondMethod = MsgGrpc.getEditBondMethod) == null) {
          MsgGrpc.getEditBondMethod = getEditBondMethod =
              io.grpc.MethodDescriptor.<bonds.Tx.MsgEditBond, bonds.Tx.MsgEditBondResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditBond"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bonds.Tx.MsgEditBond.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bonds.Tx.MsgEditBondResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("EditBond"))
              .build();
        }
      }
    }
    return getEditBondMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bonds.Tx.MsgSetNextAlpha,
      bonds.Tx.MsgSetNextAlphaResponse> getSetNextAlphaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetNextAlpha",
      requestType = bonds.Tx.MsgSetNextAlpha.class,
      responseType = bonds.Tx.MsgSetNextAlphaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bonds.Tx.MsgSetNextAlpha,
      bonds.Tx.MsgSetNextAlphaResponse> getSetNextAlphaMethod() {
    io.grpc.MethodDescriptor<bonds.Tx.MsgSetNextAlpha, bonds.Tx.MsgSetNextAlphaResponse> getSetNextAlphaMethod;
    if ((getSetNextAlphaMethod = MsgGrpc.getSetNextAlphaMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetNextAlphaMethod = MsgGrpc.getSetNextAlphaMethod) == null) {
          MsgGrpc.getSetNextAlphaMethod = getSetNextAlphaMethod =
              io.grpc.MethodDescriptor.<bonds.Tx.MsgSetNextAlpha, bonds.Tx.MsgSetNextAlphaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetNextAlpha"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bonds.Tx.MsgSetNextAlpha.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bonds.Tx.MsgSetNextAlphaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetNextAlpha"))
              .build();
        }
      }
    }
    return getSetNextAlphaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bonds.Tx.MsgUpdateBondState,
      bonds.Tx.MsgUpdateBondStateResponse> getUpdateBondStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBondState",
      requestType = bonds.Tx.MsgUpdateBondState.class,
      responseType = bonds.Tx.MsgUpdateBondStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bonds.Tx.MsgUpdateBondState,
      bonds.Tx.MsgUpdateBondStateResponse> getUpdateBondStateMethod() {
    io.grpc.MethodDescriptor<bonds.Tx.MsgUpdateBondState, bonds.Tx.MsgUpdateBondStateResponse> getUpdateBondStateMethod;
    if ((getUpdateBondStateMethod = MsgGrpc.getUpdateBondStateMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateBondStateMethod = MsgGrpc.getUpdateBondStateMethod) == null) {
          MsgGrpc.getUpdateBondStateMethod = getUpdateBondStateMethod =
              io.grpc.MethodDescriptor.<bonds.Tx.MsgUpdateBondState, bonds.Tx.MsgUpdateBondStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBondState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bonds.Tx.MsgUpdateBondState.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bonds.Tx.MsgUpdateBondStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateBondState"))
              .build();
        }
      }
    }
    return getUpdateBondStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bonds.Tx.MsgBuy,
      bonds.Tx.MsgBuyResponse> getBuyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Buy",
      requestType = bonds.Tx.MsgBuy.class,
      responseType = bonds.Tx.MsgBuyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bonds.Tx.MsgBuy,
      bonds.Tx.MsgBuyResponse> getBuyMethod() {
    io.grpc.MethodDescriptor<bonds.Tx.MsgBuy, bonds.Tx.MsgBuyResponse> getBuyMethod;
    if ((getBuyMethod = MsgGrpc.getBuyMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBuyMethod = MsgGrpc.getBuyMethod) == null) {
          MsgGrpc.getBuyMethod = getBuyMethod =
              io.grpc.MethodDescriptor.<bonds.Tx.MsgBuy, bonds.Tx.MsgBuyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Buy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bonds.Tx.MsgBuy.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bonds.Tx.MsgBuyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Buy"))
              .build();
        }
      }
    }
    return getBuyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bonds.Tx.MsgSell,
      bonds.Tx.MsgSellResponse> getSellMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Sell",
      requestType = bonds.Tx.MsgSell.class,
      responseType = bonds.Tx.MsgSellResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bonds.Tx.MsgSell,
      bonds.Tx.MsgSellResponse> getSellMethod() {
    io.grpc.MethodDescriptor<bonds.Tx.MsgSell, bonds.Tx.MsgSellResponse> getSellMethod;
    if ((getSellMethod = MsgGrpc.getSellMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSellMethod = MsgGrpc.getSellMethod) == null) {
          MsgGrpc.getSellMethod = getSellMethod =
              io.grpc.MethodDescriptor.<bonds.Tx.MsgSell, bonds.Tx.MsgSellResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Sell"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bonds.Tx.MsgSell.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bonds.Tx.MsgSellResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Sell"))
              .build();
        }
      }
    }
    return getSellMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bonds.Tx.MsgSwap,
      bonds.Tx.MsgSwapResponse> getSwapMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Swap",
      requestType = bonds.Tx.MsgSwap.class,
      responseType = bonds.Tx.MsgSwapResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bonds.Tx.MsgSwap,
      bonds.Tx.MsgSwapResponse> getSwapMethod() {
    io.grpc.MethodDescriptor<bonds.Tx.MsgSwap, bonds.Tx.MsgSwapResponse> getSwapMethod;
    if ((getSwapMethod = MsgGrpc.getSwapMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSwapMethod = MsgGrpc.getSwapMethod) == null) {
          MsgGrpc.getSwapMethod = getSwapMethod =
              io.grpc.MethodDescriptor.<bonds.Tx.MsgSwap, bonds.Tx.MsgSwapResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Swap"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bonds.Tx.MsgSwap.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bonds.Tx.MsgSwapResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Swap"))
              .build();
        }
      }
    }
    return getSwapMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bonds.Tx.MsgMakeOutcomePayment,
      bonds.Tx.MsgMakeOutcomePaymentResponse> getMakeOutcomePaymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MakeOutcomePayment",
      requestType = bonds.Tx.MsgMakeOutcomePayment.class,
      responseType = bonds.Tx.MsgMakeOutcomePaymentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bonds.Tx.MsgMakeOutcomePayment,
      bonds.Tx.MsgMakeOutcomePaymentResponse> getMakeOutcomePaymentMethod() {
    io.grpc.MethodDescriptor<bonds.Tx.MsgMakeOutcomePayment, bonds.Tx.MsgMakeOutcomePaymentResponse> getMakeOutcomePaymentMethod;
    if ((getMakeOutcomePaymentMethod = MsgGrpc.getMakeOutcomePaymentMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMakeOutcomePaymentMethod = MsgGrpc.getMakeOutcomePaymentMethod) == null) {
          MsgGrpc.getMakeOutcomePaymentMethod = getMakeOutcomePaymentMethod =
              io.grpc.MethodDescriptor.<bonds.Tx.MsgMakeOutcomePayment, bonds.Tx.MsgMakeOutcomePaymentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MakeOutcomePayment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bonds.Tx.MsgMakeOutcomePayment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bonds.Tx.MsgMakeOutcomePaymentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MakeOutcomePayment"))
              .build();
        }
      }
    }
    return getMakeOutcomePaymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bonds.Tx.MsgWithdrawShare,
      bonds.Tx.MsgWithdrawShareResponse> getWithdrawShareMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawShare",
      requestType = bonds.Tx.MsgWithdrawShare.class,
      responseType = bonds.Tx.MsgWithdrawShareResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bonds.Tx.MsgWithdrawShare,
      bonds.Tx.MsgWithdrawShareResponse> getWithdrawShareMethod() {
    io.grpc.MethodDescriptor<bonds.Tx.MsgWithdrawShare, bonds.Tx.MsgWithdrawShareResponse> getWithdrawShareMethod;
    if ((getWithdrawShareMethod = MsgGrpc.getWithdrawShareMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawShareMethod = MsgGrpc.getWithdrawShareMethod) == null) {
          MsgGrpc.getWithdrawShareMethod = getWithdrawShareMethod =
              io.grpc.MethodDescriptor.<bonds.Tx.MsgWithdrawShare, bonds.Tx.MsgWithdrawShareResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawShare"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bonds.Tx.MsgWithdrawShare.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bonds.Tx.MsgWithdrawShareResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WithdrawShare"))
              .build();
        }
      }
    }
    return getWithdrawShareMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bonds.Tx.MsgWithdrawReserve,
      bonds.Tx.MsgWithdrawReserveResponse> getWithdrawReserveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawReserve",
      requestType = bonds.Tx.MsgWithdrawReserve.class,
      responseType = bonds.Tx.MsgWithdrawReserveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bonds.Tx.MsgWithdrawReserve,
      bonds.Tx.MsgWithdrawReserveResponse> getWithdrawReserveMethod() {
    io.grpc.MethodDescriptor<bonds.Tx.MsgWithdrawReserve, bonds.Tx.MsgWithdrawReserveResponse> getWithdrawReserveMethod;
    if ((getWithdrawReserveMethod = MsgGrpc.getWithdrawReserveMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawReserveMethod = MsgGrpc.getWithdrawReserveMethod) == null) {
          MsgGrpc.getWithdrawReserveMethod = getWithdrawReserveMethod =
              io.grpc.MethodDescriptor.<bonds.Tx.MsgWithdrawReserve, bonds.Tx.MsgWithdrawReserveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawReserve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bonds.Tx.MsgWithdrawReserve.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bonds.Tx.MsgWithdrawReserveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WithdrawReserve"))
              .build();
        }
      }
    }
    return getWithdrawReserveMethod;
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
   * Msg defines the bonds Msg service.
   * </pre>
   */
  public static abstract class MsgImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * CreateBond defines a method for creating a bond.
     * </pre>
     */
    public void createBond(bonds.Tx.MsgCreateBond request,
        io.grpc.stub.StreamObserver<bonds.Tx.MsgCreateBondResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateBondMethod(), responseObserver);
    }

    /**
     * <pre>
     * EditBond defines a method for editing a bond.
     * </pre>
     */
    public void editBond(bonds.Tx.MsgEditBond request,
        io.grpc.stub.StreamObserver<bonds.Tx.MsgEditBondResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEditBondMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetNextAlpha defines a method for editing a bond's alpha parameter.
     * </pre>
     */
    public void setNextAlpha(bonds.Tx.MsgSetNextAlpha request,
        io.grpc.stub.StreamObserver<bonds.Tx.MsgSetNextAlphaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetNextAlphaMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateBondState defines a method for updating a bond's current state.
     * </pre>
     */
    public void updateBondState(bonds.Tx.MsgUpdateBondState request,
        io.grpc.stub.StreamObserver<bonds.Tx.MsgUpdateBondStateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateBondStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Buy defines a method for buying from a bond.
     * </pre>
     */
    public void buy(bonds.Tx.MsgBuy request,
        io.grpc.stub.StreamObserver<bonds.Tx.MsgBuyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBuyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sell defines a method for selling from a bond.
     * </pre>
     */
    public void sell(bonds.Tx.MsgSell request,
        io.grpc.stub.StreamObserver<bonds.Tx.MsgSellResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSellMethod(), responseObserver);
    }

    /**
     * <pre>
     * Swap defines a method for swapping from one reserve bond token to another.
     * </pre>
     */
    public void swap(bonds.Tx.MsgSwap request,
        io.grpc.stub.StreamObserver<bonds.Tx.MsgSwapResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSwapMethod(), responseObserver);
    }

    /**
     * <pre>
     * MakeOutcomePayment defines a method for making an outcome payment to a bond.
     * </pre>
     */
    public void makeOutcomePayment(bonds.Tx.MsgMakeOutcomePayment request,
        io.grpc.stub.StreamObserver<bonds.Tx.MsgMakeOutcomePaymentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMakeOutcomePaymentMethod(), responseObserver);
    }

    /**
     * <pre>
     * WithdrawShare defines a method for withdrawing a share from a bond that is in the SETTLE stage.
     * </pre>
     */
    public void withdrawShare(bonds.Tx.MsgWithdrawShare request,
        io.grpc.stub.StreamObserver<bonds.Tx.MsgWithdrawShareResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWithdrawShareMethod(), responseObserver);
    }

    /**
     * <pre>
     * WithdrawReserve defines a method for withdrawing reserve from a bond.
     * </pre>
     */
    public void withdrawReserve(bonds.Tx.MsgWithdrawReserve request,
        io.grpc.stub.StreamObserver<bonds.Tx.MsgWithdrawReserveResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWithdrawReserveMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateBondMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                bonds.Tx.MsgCreateBond,
                bonds.Tx.MsgCreateBondResponse>(
                  this, METHODID_CREATE_BOND)))
          .addMethod(
            getEditBondMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                bonds.Tx.MsgEditBond,
                bonds.Tx.MsgEditBondResponse>(
                  this, METHODID_EDIT_BOND)))
          .addMethod(
            getSetNextAlphaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                bonds.Tx.MsgSetNextAlpha,
                bonds.Tx.MsgSetNextAlphaResponse>(
                  this, METHODID_SET_NEXT_ALPHA)))
          .addMethod(
            getUpdateBondStateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                bonds.Tx.MsgUpdateBondState,
                bonds.Tx.MsgUpdateBondStateResponse>(
                  this, METHODID_UPDATE_BOND_STATE)))
          .addMethod(
            getBuyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                bonds.Tx.MsgBuy,
                bonds.Tx.MsgBuyResponse>(
                  this, METHODID_BUY)))
          .addMethod(
            getSellMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                bonds.Tx.MsgSell,
                bonds.Tx.MsgSellResponse>(
                  this, METHODID_SELL)))
          .addMethod(
            getSwapMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                bonds.Tx.MsgSwap,
                bonds.Tx.MsgSwapResponse>(
                  this, METHODID_SWAP)))
          .addMethod(
            getMakeOutcomePaymentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                bonds.Tx.MsgMakeOutcomePayment,
                bonds.Tx.MsgMakeOutcomePaymentResponse>(
                  this, METHODID_MAKE_OUTCOME_PAYMENT)))
          .addMethod(
            getWithdrawShareMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                bonds.Tx.MsgWithdrawShare,
                bonds.Tx.MsgWithdrawShareResponse>(
                  this, METHODID_WITHDRAW_SHARE)))
          .addMethod(
            getWithdrawReserveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                bonds.Tx.MsgWithdrawReserve,
                bonds.Tx.MsgWithdrawReserveResponse>(
                  this, METHODID_WITHDRAW_RESERVE)))
          .build();
    }
  }

  /**
   * <pre>
   * Msg defines the bonds Msg service.
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
     * CreateBond defines a method for creating a bond.
     * </pre>
     */
    public void createBond(bonds.Tx.MsgCreateBond request,
        io.grpc.stub.StreamObserver<bonds.Tx.MsgCreateBondResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateBondMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EditBond defines a method for editing a bond.
     * </pre>
     */
    public void editBond(bonds.Tx.MsgEditBond request,
        io.grpc.stub.StreamObserver<bonds.Tx.MsgEditBondResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEditBondMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetNextAlpha defines a method for editing a bond's alpha parameter.
     * </pre>
     */
    public void setNextAlpha(bonds.Tx.MsgSetNextAlpha request,
        io.grpc.stub.StreamObserver<bonds.Tx.MsgSetNextAlphaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetNextAlphaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateBondState defines a method for updating a bond's current state.
     * </pre>
     */
    public void updateBondState(bonds.Tx.MsgUpdateBondState request,
        io.grpc.stub.StreamObserver<bonds.Tx.MsgUpdateBondStateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateBondStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Buy defines a method for buying from a bond.
     * </pre>
     */
    public void buy(bonds.Tx.MsgBuy request,
        io.grpc.stub.StreamObserver<bonds.Tx.MsgBuyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBuyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sell defines a method for selling from a bond.
     * </pre>
     */
    public void sell(bonds.Tx.MsgSell request,
        io.grpc.stub.StreamObserver<bonds.Tx.MsgSellResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSellMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Swap defines a method for swapping from one reserve bond token to another.
     * </pre>
     */
    public void swap(bonds.Tx.MsgSwap request,
        io.grpc.stub.StreamObserver<bonds.Tx.MsgSwapResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSwapMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MakeOutcomePayment defines a method for making an outcome payment to a bond.
     * </pre>
     */
    public void makeOutcomePayment(bonds.Tx.MsgMakeOutcomePayment request,
        io.grpc.stub.StreamObserver<bonds.Tx.MsgMakeOutcomePaymentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMakeOutcomePaymentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WithdrawShare defines a method for withdrawing a share from a bond that is in the SETTLE stage.
     * </pre>
     */
    public void withdrawShare(bonds.Tx.MsgWithdrawShare request,
        io.grpc.stub.StreamObserver<bonds.Tx.MsgWithdrawShareResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWithdrawShareMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WithdrawReserve defines a method for withdrawing reserve from a bond.
     * </pre>
     */
    public void withdrawReserve(bonds.Tx.MsgWithdrawReserve request,
        io.grpc.stub.StreamObserver<bonds.Tx.MsgWithdrawReserveResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWithdrawReserveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Msg defines the bonds Msg service.
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
     * CreateBond defines a method for creating a bond.
     * </pre>
     */
    public bonds.Tx.MsgCreateBondResponse createBond(bonds.Tx.MsgCreateBond request) {
      return blockingUnaryCall(
          getChannel(), getCreateBondMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EditBond defines a method for editing a bond.
     * </pre>
     */
    public bonds.Tx.MsgEditBondResponse editBond(bonds.Tx.MsgEditBond request) {
      return blockingUnaryCall(
          getChannel(), getEditBondMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetNextAlpha defines a method for editing a bond's alpha parameter.
     * </pre>
     */
    public bonds.Tx.MsgSetNextAlphaResponse setNextAlpha(bonds.Tx.MsgSetNextAlpha request) {
      return blockingUnaryCall(
          getChannel(), getSetNextAlphaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateBondState defines a method for updating a bond's current state.
     * </pre>
     */
    public bonds.Tx.MsgUpdateBondStateResponse updateBondState(bonds.Tx.MsgUpdateBondState request) {
      return blockingUnaryCall(
          getChannel(), getUpdateBondStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Buy defines a method for buying from a bond.
     * </pre>
     */
    public bonds.Tx.MsgBuyResponse buy(bonds.Tx.MsgBuy request) {
      return blockingUnaryCall(
          getChannel(), getBuyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sell defines a method for selling from a bond.
     * </pre>
     */
    public bonds.Tx.MsgSellResponse sell(bonds.Tx.MsgSell request) {
      return blockingUnaryCall(
          getChannel(), getSellMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Swap defines a method for swapping from one reserve bond token to another.
     * </pre>
     */
    public bonds.Tx.MsgSwapResponse swap(bonds.Tx.MsgSwap request) {
      return blockingUnaryCall(
          getChannel(), getSwapMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MakeOutcomePayment defines a method for making an outcome payment to a bond.
     * </pre>
     */
    public bonds.Tx.MsgMakeOutcomePaymentResponse makeOutcomePayment(bonds.Tx.MsgMakeOutcomePayment request) {
      return blockingUnaryCall(
          getChannel(), getMakeOutcomePaymentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WithdrawShare defines a method for withdrawing a share from a bond that is in the SETTLE stage.
     * </pre>
     */
    public bonds.Tx.MsgWithdrawShareResponse withdrawShare(bonds.Tx.MsgWithdrawShare request) {
      return blockingUnaryCall(
          getChannel(), getWithdrawShareMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WithdrawReserve defines a method for withdrawing reserve from a bond.
     * </pre>
     */
    public bonds.Tx.MsgWithdrawReserveResponse withdrawReserve(bonds.Tx.MsgWithdrawReserve request) {
      return blockingUnaryCall(
          getChannel(), getWithdrawReserveMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Msg defines the bonds Msg service.
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
     * CreateBond defines a method for creating a bond.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bonds.Tx.MsgCreateBondResponse> createBond(
        bonds.Tx.MsgCreateBond request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateBondMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EditBond defines a method for editing a bond.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bonds.Tx.MsgEditBondResponse> editBond(
        bonds.Tx.MsgEditBond request) {
      return futureUnaryCall(
          getChannel().newCall(getEditBondMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetNextAlpha defines a method for editing a bond's alpha parameter.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bonds.Tx.MsgSetNextAlphaResponse> setNextAlpha(
        bonds.Tx.MsgSetNextAlpha request) {
      return futureUnaryCall(
          getChannel().newCall(getSetNextAlphaMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateBondState defines a method for updating a bond's current state.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bonds.Tx.MsgUpdateBondStateResponse> updateBondState(
        bonds.Tx.MsgUpdateBondState request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateBondStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Buy defines a method for buying from a bond.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bonds.Tx.MsgBuyResponse> buy(
        bonds.Tx.MsgBuy request) {
      return futureUnaryCall(
          getChannel().newCall(getBuyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sell defines a method for selling from a bond.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bonds.Tx.MsgSellResponse> sell(
        bonds.Tx.MsgSell request) {
      return futureUnaryCall(
          getChannel().newCall(getSellMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Swap defines a method for swapping from one reserve bond token to another.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bonds.Tx.MsgSwapResponse> swap(
        bonds.Tx.MsgSwap request) {
      return futureUnaryCall(
          getChannel().newCall(getSwapMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MakeOutcomePayment defines a method for making an outcome payment to a bond.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bonds.Tx.MsgMakeOutcomePaymentResponse> makeOutcomePayment(
        bonds.Tx.MsgMakeOutcomePayment request) {
      return futureUnaryCall(
          getChannel().newCall(getMakeOutcomePaymentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WithdrawShare defines a method for withdrawing a share from a bond that is in the SETTLE stage.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bonds.Tx.MsgWithdrawShareResponse> withdrawShare(
        bonds.Tx.MsgWithdrawShare request) {
      return futureUnaryCall(
          getChannel().newCall(getWithdrawShareMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WithdrawReserve defines a method for withdrawing reserve from a bond.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bonds.Tx.MsgWithdrawReserveResponse> withdrawReserve(
        bonds.Tx.MsgWithdrawReserve request) {
      return futureUnaryCall(
          getChannel().newCall(getWithdrawReserveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_BOND = 0;
  private static final int METHODID_EDIT_BOND = 1;
  private static final int METHODID_SET_NEXT_ALPHA = 2;
  private static final int METHODID_UPDATE_BOND_STATE = 3;
  private static final int METHODID_BUY = 4;
  private static final int METHODID_SELL = 5;
  private static final int METHODID_SWAP = 6;
  private static final int METHODID_MAKE_OUTCOME_PAYMENT = 7;
  private static final int METHODID_WITHDRAW_SHARE = 8;
  private static final int METHODID_WITHDRAW_RESERVE = 9;

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
        case METHODID_CREATE_BOND:
          serviceImpl.createBond((bonds.Tx.MsgCreateBond) request,
              (io.grpc.stub.StreamObserver<bonds.Tx.MsgCreateBondResponse>) responseObserver);
          break;
        case METHODID_EDIT_BOND:
          serviceImpl.editBond((bonds.Tx.MsgEditBond) request,
              (io.grpc.stub.StreamObserver<bonds.Tx.MsgEditBondResponse>) responseObserver);
          break;
        case METHODID_SET_NEXT_ALPHA:
          serviceImpl.setNextAlpha((bonds.Tx.MsgSetNextAlpha) request,
              (io.grpc.stub.StreamObserver<bonds.Tx.MsgSetNextAlphaResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BOND_STATE:
          serviceImpl.updateBondState((bonds.Tx.MsgUpdateBondState) request,
              (io.grpc.stub.StreamObserver<bonds.Tx.MsgUpdateBondStateResponse>) responseObserver);
          break;
        case METHODID_BUY:
          serviceImpl.buy((bonds.Tx.MsgBuy) request,
              (io.grpc.stub.StreamObserver<bonds.Tx.MsgBuyResponse>) responseObserver);
          break;
        case METHODID_SELL:
          serviceImpl.sell((bonds.Tx.MsgSell) request,
              (io.grpc.stub.StreamObserver<bonds.Tx.MsgSellResponse>) responseObserver);
          break;
        case METHODID_SWAP:
          serviceImpl.swap((bonds.Tx.MsgSwap) request,
              (io.grpc.stub.StreamObserver<bonds.Tx.MsgSwapResponse>) responseObserver);
          break;
        case METHODID_MAKE_OUTCOME_PAYMENT:
          serviceImpl.makeOutcomePayment((bonds.Tx.MsgMakeOutcomePayment) request,
              (io.grpc.stub.StreamObserver<bonds.Tx.MsgMakeOutcomePaymentResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_SHARE:
          serviceImpl.withdrawShare((bonds.Tx.MsgWithdrawShare) request,
              (io.grpc.stub.StreamObserver<bonds.Tx.MsgWithdrawShareResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_RESERVE:
          serviceImpl.withdrawReserve((bonds.Tx.MsgWithdrawReserve) request,
              (io.grpc.stub.StreamObserver<bonds.Tx.MsgWithdrawReserveResponse>) responseObserver);
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
      return bonds.Tx.getDescriptor();
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
              .addMethod(getCreateBondMethod())
              .addMethod(getEditBondMethod())
              .addMethod(getSetNextAlphaMethod())
              .addMethod(getUpdateBondStateMethod())
              .addMethod(getBuyMethod())
              .addMethod(getSellMethod())
              .addMethod(getSwapMethod())
              .addMethod(getMakeOutcomePaymentMethod())
              .addMethod(getWithdrawShareMethod())
              .addMethod(getWithdrawReserveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
