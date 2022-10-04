package osmosis.streamswap.v1;

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
    comments = "Source: osmosis/streamswap/v1/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "osmosis.streamswap.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<osmosis.streamswap.v1.Tx.MsgCreateSale,
      osmosis.streamswap.v1.Tx.MsgCreateSaleResponse> getCreateSaleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSale",
      requestType = osmosis.streamswap.v1.Tx.MsgCreateSale.class,
      responseType = osmosis.streamswap.v1.Tx.MsgCreateSaleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<osmosis.streamswap.v1.Tx.MsgCreateSale,
      osmosis.streamswap.v1.Tx.MsgCreateSaleResponse> getCreateSaleMethod() {
    io.grpc.MethodDescriptor<osmosis.streamswap.v1.Tx.MsgCreateSale, osmosis.streamswap.v1.Tx.MsgCreateSaleResponse> getCreateSaleMethod;
    if ((getCreateSaleMethod = MsgGrpc.getCreateSaleMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateSaleMethod = MsgGrpc.getCreateSaleMethod) == null) {
          MsgGrpc.getCreateSaleMethod = getCreateSaleMethod =
              io.grpc.MethodDescriptor.<osmosis.streamswap.v1.Tx.MsgCreateSale, osmosis.streamswap.v1.Tx.MsgCreateSaleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSale"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  osmosis.streamswap.v1.Tx.MsgCreateSale.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  osmosis.streamswap.v1.Tx.MsgCreateSaleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateSale"))
              .build();
        }
      }
    }
    return getCreateSaleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<osmosis.streamswap.v1.Tx.MsgSubscribe,
      com.google.protobuf.Empty> getSubscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subscribe",
      requestType = osmosis.streamswap.v1.Tx.MsgSubscribe.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<osmosis.streamswap.v1.Tx.MsgSubscribe,
      com.google.protobuf.Empty> getSubscribeMethod() {
    io.grpc.MethodDescriptor<osmosis.streamswap.v1.Tx.MsgSubscribe, com.google.protobuf.Empty> getSubscribeMethod;
    if ((getSubscribeMethod = MsgGrpc.getSubscribeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSubscribeMethod = MsgGrpc.getSubscribeMethod) == null) {
          MsgGrpc.getSubscribeMethod = getSubscribeMethod =
              io.grpc.MethodDescriptor.<osmosis.streamswap.v1.Tx.MsgSubscribe, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Subscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  osmosis.streamswap.v1.Tx.MsgSubscribe.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Subscribe"))
              .build();
        }
      }
    }
    return getSubscribeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<osmosis.streamswap.v1.Tx.MsgWithdraw,
      com.google.protobuf.Empty> getWithdrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Withdraw",
      requestType = osmosis.streamswap.v1.Tx.MsgWithdraw.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<osmosis.streamswap.v1.Tx.MsgWithdraw,
      com.google.protobuf.Empty> getWithdrawMethod() {
    io.grpc.MethodDescriptor<osmosis.streamswap.v1.Tx.MsgWithdraw, com.google.protobuf.Empty> getWithdrawMethod;
    if ((getWithdrawMethod = MsgGrpc.getWithdrawMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawMethod = MsgGrpc.getWithdrawMethod) == null) {
          MsgGrpc.getWithdrawMethod = getWithdrawMethod =
              io.grpc.MethodDescriptor.<osmosis.streamswap.v1.Tx.MsgWithdraw, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Withdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  osmosis.streamswap.v1.Tx.MsgWithdraw.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Withdraw"))
              .build();
        }
      }
    }
    return getWithdrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<osmosis.streamswap.v1.Tx.MsgExitSale,
      osmosis.streamswap.v1.Tx.MsgExitSaleResponse> getExitSaleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExitSale",
      requestType = osmosis.streamswap.v1.Tx.MsgExitSale.class,
      responseType = osmosis.streamswap.v1.Tx.MsgExitSaleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<osmosis.streamswap.v1.Tx.MsgExitSale,
      osmosis.streamswap.v1.Tx.MsgExitSaleResponse> getExitSaleMethod() {
    io.grpc.MethodDescriptor<osmosis.streamswap.v1.Tx.MsgExitSale, osmosis.streamswap.v1.Tx.MsgExitSaleResponse> getExitSaleMethod;
    if ((getExitSaleMethod = MsgGrpc.getExitSaleMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getExitSaleMethod = MsgGrpc.getExitSaleMethod) == null) {
          MsgGrpc.getExitSaleMethod = getExitSaleMethod =
              io.grpc.MethodDescriptor.<osmosis.streamswap.v1.Tx.MsgExitSale, osmosis.streamswap.v1.Tx.MsgExitSaleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExitSale"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  osmosis.streamswap.v1.Tx.MsgExitSale.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  osmosis.streamswap.v1.Tx.MsgExitSaleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ExitSale"))
              .build();
        }
      }
    }
    return getExitSaleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<osmosis.streamswap.v1.Tx.MsgFinalizeSale,
      osmosis.streamswap.v1.Tx.MsgFinalizeSaleResponse> getFinalizeSaleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FinalizeSale",
      requestType = osmosis.streamswap.v1.Tx.MsgFinalizeSale.class,
      responseType = osmosis.streamswap.v1.Tx.MsgFinalizeSaleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<osmosis.streamswap.v1.Tx.MsgFinalizeSale,
      osmosis.streamswap.v1.Tx.MsgFinalizeSaleResponse> getFinalizeSaleMethod() {
    io.grpc.MethodDescriptor<osmosis.streamswap.v1.Tx.MsgFinalizeSale, osmosis.streamswap.v1.Tx.MsgFinalizeSaleResponse> getFinalizeSaleMethod;
    if ((getFinalizeSaleMethod = MsgGrpc.getFinalizeSaleMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getFinalizeSaleMethod = MsgGrpc.getFinalizeSaleMethod) == null) {
          MsgGrpc.getFinalizeSaleMethod = getFinalizeSaleMethod =
              io.grpc.MethodDescriptor.<osmosis.streamswap.v1.Tx.MsgFinalizeSale, osmosis.streamswap.v1.Tx.MsgFinalizeSaleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FinalizeSale"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  osmosis.streamswap.v1.Tx.MsgFinalizeSale.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  osmosis.streamswap.v1.Tx.MsgFinalizeSaleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("FinalizeSale"))
              .build();
        }
      }
    }
    return getFinalizeSaleMethod;
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
     * <pre>
     * CreateSale creates new token sale. Anyone can create a new sale.
     * params.SaleBond OSMO will be charged as a bond (returned in FinalizeSale)
     * to avoid spams.
     * The sale follows the streamswap functionality explained in the
     * x/launchapd/spec
     * </pre>
     */
    public void createSale(osmosis.streamswap.v1.Tx.MsgCreateSale request,
        io.grpc.stub.StreamObserver<osmosis.streamswap.v1.Tx.MsgCreateSaleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateSaleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to a token sale. Any use at any time before the sale end can join
     * the sale by sending `token_in` to the Sale through the Subscribe msg.
     * During the sale, user `token_in` will be automatically charged every
     * epoch to purchase `token_out`.
     * </pre>
     */
    public void subscribe(osmosis.streamswap.v1.Tx.MsgSubscribe request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Withdraw sends back `amount` of unspent tokens_in to the user.
     * If `amount` is empty, it will default to all unspent tokens.
     * User can do it any time unless his deposit is empty.
     * </pre>
     */
    public void withdraw(osmosis.streamswap.v1.Tx.MsgWithdraw request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getWithdrawMethod(), responseObserver);
    }

    /**
     * <pre>
     * ExitSale withdraws (by a user who subscribed to the sale) purchased
     * tokens_out from the pool and remained tokens_in. Must be called after
     * the sale end.
     * </pre>
     */
    public void exitSale(osmosis.streamswap.v1.Tx.MsgExitSale request,
        io.grpc.stub.StreamObserver<osmosis.streamswap.v1.Tx.MsgExitSaleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getExitSaleMethod(), responseObserver);
    }

    /**
     * <pre>
     * FinalizeSale clean ups the sale and sends income (earned tokens_in) to the
     * Sale recipient. Returns error if called before the Sale end or it was
     * already finalized. Anyone can call this method.
     * </pre>
     */
    public void finalizeSale(osmosis.streamswap.v1.Tx.MsgFinalizeSale request,
        io.grpc.stub.StreamObserver<osmosis.streamswap.v1.Tx.MsgFinalizeSaleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFinalizeSaleMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateSaleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                osmosis.streamswap.v1.Tx.MsgCreateSale,
                osmosis.streamswap.v1.Tx.MsgCreateSaleResponse>(
                  this, METHODID_CREATE_SALE)))
          .addMethod(
            getSubscribeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                osmosis.streamswap.v1.Tx.MsgSubscribe,
                com.google.protobuf.Empty>(
                  this, METHODID_SUBSCRIBE)))
          .addMethod(
            getWithdrawMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                osmosis.streamswap.v1.Tx.MsgWithdraw,
                com.google.protobuf.Empty>(
                  this, METHODID_WITHDRAW)))
          .addMethod(
            getExitSaleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                osmosis.streamswap.v1.Tx.MsgExitSale,
                osmosis.streamswap.v1.Tx.MsgExitSaleResponse>(
                  this, METHODID_EXIT_SALE)))
          .addMethod(
            getFinalizeSaleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                osmosis.streamswap.v1.Tx.MsgFinalizeSale,
                osmosis.streamswap.v1.Tx.MsgFinalizeSaleResponse>(
                  this, METHODID_FINALIZE_SALE)))
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
     * <pre>
     * CreateSale creates new token sale. Anyone can create a new sale.
     * params.SaleBond OSMO will be charged as a bond (returned in FinalizeSale)
     * to avoid spams.
     * The sale follows the streamswap functionality explained in the
     * x/launchapd/spec
     * </pre>
     */
    public void createSale(osmosis.streamswap.v1.Tx.MsgCreateSale request,
        io.grpc.stub.StreamObserver<osmosis.streamswap.v1.Tx.MsgCreateSaleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateSaleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to a token sale. Any use at any time before the sale end can join
     * the sale by sending `token_in` to the Sale through the Subscribe msg.
     * During the sale, user `token_in` will be automatically charged every
     * epoch to purchase `token_out`.
     * </pre>
     */
    public void subscribe(osmosis.streamswap.v1.Tx.MsgSubscribe request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubscribeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Withdraw sends back `amount` of unspent tokens_in to the user.
     * If `amount` is empty, it will default to all unspent tokens.
     * User can do it any time unless his deposit is empty.
     * </pre>
     */
    public void withdraw(osmosis.streamswap.v1.Tx.MsgWithdraw request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ExitSale withdraws (by a user who subscribed to the sale) purchased
     * tokens_out from the pool and remained tokens_in. Must be called after
     * the sale end.
     * </pre>
     */
    public void exitSale(osmosis.streamswap.v1.Tx.MsgExitSale request,
        io.grpc.stub.StreamObserver<osmosis.streamswap.v1.Tx.MsgExitSaleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExitSaleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FinalizeSale clean ups the sale and sends income (earned tokens_in) to the
     * Sale recipient. Returns error if called before the Sale end or it was
     * already finalized. Anyone can call this method.
     * </pre>
     */
    public void finalizeSale(osmosis.streamswap.v1.Tx.MsgFinalizeSale request,
        io.grpc.stub.StreamObserver<osmosis.streamswap.v1.Tx.MsgFinalizeSaleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFinalizeSaleMethod(), getCallOptions()), request, responseObserver);
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
     * <pre>
     * CreateSale creates new token sale. Anyone can create a new sale.
     * params.SaleBond OSMO will be charged as a bond (returned in FinalizeSale)
     * to avoid spams.
     * The sale follows the streamswap functionality explained in the
     * x/launchapd/spec
     * </pre>
     */
    public osmosis.streamswap.v1.Tx.MsgCreateSaleResponse createSale(osmosis.streamswap.v1.Tx.MsgCreateSale request) {
      return blockingUnaryCall(
          getChannel(), getCreateSaleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to a token sale. Any use at any time before the sale end can join
     * the sale by sending `token_in` to the Sale through the Subscribe msg.
     * During the sale, user `token_in` will be automatically charged every
     * epoch to purchase `token_out`.
     * </pre>
     */
    public com.google.protobuf.Empty subscribe(osmosis.streamswap.v1.Tx.MsgSubscribe request) {
      return blockingUnaryCall(
          getChannel(), getSubscribeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Withdraw sends back `amount` of unspent tokens_in to the user.
     * If `amount` is empty, it will default to all unspent tokens.
     * User can do it any time unless his deposit is empty.
     * </pre>
     */
    public com.google.protobuf.Empty withdraw(osmosis.streamswap.v1.Tx.MsgWithdraw request) {
      return blockingUnaryCall(
          getChannel(), getWithdrawMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ExitSale withdraws (by a user who subscribed to the sale) purchased
     * tokens_out from the pool and remained tokens_in. Must be called after
     * the sale end.
     * </pre>
     */
    public osmosis.streamswap.v1.Tx.MsgExitSaleResponse exitSale(osmosis.streamswap.v1.Tx.MsgExitSale request) {
      return blockingUnaryCall(
          getChannel(), getExitSaleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FinalizeSale clean ups the sale and sends income (earned tokens_in) to the
     * Sale recipient. Returns error if called before the Sale end or it was
     * already finalized. Anyone can call this method.
     * </pre>
     */
    public osmosis.streamswap.v1.Tx.MsgFinalizeSaleResponse finalizeSale(osmosis.streamswap.v1.Tx.MsgFinalizeSale request) {
      return blockingUnaryCall(
          getChannel(), getFinalizeSaleMethod(), getCallOptions(), request);
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
     * <pre>
     * CreateSale creates new token sale. Anyone can create a new sale.
     * params.SaleBond OSMO will be charged as a bond (returned in FinalizeSale)
     * to avoid spams.
     * The sale follows the streamswap functionality explained in the
     * x/launchapd/spec
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<osmosis.streamswap.v1.Tx.MsgCreateSaleResponse> createSale(
        osmosis.streamswap.v1.Tx.MsgCreateSale request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateSaleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Subscribe to a token sale. Any use at any time before the sale end can join
     * the sale by sending `token_in` to the Sale through the Subscribe msg.
     * During the sale, user `token_in` will be automatically charged every
     * epoch to purchase `token_out`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> subscribe(
        osmosis.streamswap.v1.Tx.MsgSubscribe request) {
      return futureUnaryCall(
          getChannel().newCall(getSubscribeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Withdraw sends back `amount` of unspent tokens_in to the user.
     * If `amount` is empty, it will default to all unspent tokens.
     * User can do it any time unless his deposit is empty.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> withdraw(
        osmosis.streamswap.v1.Tx.MsgWithdraw request) {
      return futureUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ExitSale withdraws (by a user who subscribed to the sale) purchased
     * tokens_out from the pool and remained tokens_in. Must be called after
     * the sale end.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<osmosis.streamswap.v1.Tx.MsgExitSaleResponse> exitSale(
        osmosis.streamswap.v1.Tx.MsgExitSale request) {
      return futureUnaryCall(
          getChannel().newCall(getExitSaleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FinalizeSale clean ups the sale and sends income (earned tokens_in) to the
     * Sale recipient. Returns error if called before the Sale end or it was
     * already finalized. Anyone can call this method.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<osmosis.streamswap.v1.Tx.MsgFinalizeSaleResponse> finalizeSale(
        osmosis.streamswap.v1.Tx.MsgFinalizeSale request) {
      return futureUnaryCall(
          getChannel().newCall(getFinalizeSaleMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SALE = 0;
  private static final int METHODID_SUBSCRIBE = 1;
  private static final int METHODID_WITHDRAW = 2;
  private static final int METHODID_EXIT_SALE = 3;
  private static final int METHODID_FINALIZE_SALE = 4;

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
        case METHODID_CREATE_SALE:
          serviceImpl.createSale((osmosis.streamswap.v1.Tx.MsgCreateSale) request,
              (io.grpc.stub.StreamObserver<osmosis.streamswap.v1.Tx.MsgCreateSaleResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE:
          serviceImpl.subscribe((osmosis.streamswap.v1.Tx.MsgSubscribe) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_WITHDRAW:
          serviceImpl.withdraw((osmosis.streamswap.v1.Tx.MsgWithdraw) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_EXIT_SALE:
          serviceImpl.exitSale((osmosis.streamswap.v1.Tx.MsgExitSale) request,
              (io.grpc.stub.StreamObserver<osmosis.streamswap.v1.Tx.MsgExitSaleResponse>) responseObserver);
          break;
        case METHODID_FINALIZE_SALE:
          serviceImpl.finalizeSale((osmosis.streamswap.v1.Tx.MsgFinalizeSale) request,
              (io.grpc.stub.StreamObserver<osmosis.streamswap.v1.Tx.MsgFinalizeSaleResponse>) responseObserver);
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
      return osmosis.streamswap.v1.Tx.getDescriptor();
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
              .addMethod(getCreateSaleMethod())
              .addMethod(getSubscribeMethod())
              .addMethod(getWithdrawMethod())
              .addMethod(getExitSaleMethod())
              .addMethod(getFinalizeSaleMethod())
              .build();
        }
      }
    }
    return result;
  }
}
