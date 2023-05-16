package ibc.applications.fee.v1;

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
 * Msg defines the ICS29 Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: ibc/applications/fee/v1/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "ibc.applications.fee.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ibc.applications.fee.v1.Tx.MsgRegisterPayee,
      ibc.applications.fee.v1.Tx.MsgRegisterPayeeResponse> getRegisterPayeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterPayee",
      requestType = ibc.applications.fee.v1.Tx.MsgRegisterPayee.class,
      responseType = ibc.applications.fee.v1.Tx.MsgRegisterPayeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ibc.applications.fee.v1.Tx.MsgRegisterPayee,
      ibc.applications.fee.v1.Tx.MsgRegisterPayeeResponse> getRegisterPayeeMethod() {
    io.grpc.MethodDescriptor<ibc.applications.fee.v1.Tx.MsgRegisterPayee, ibc.applications.fee.v1.Tx.MsgRegisterPayeeResponse> getRegisterPayeeMethod;
    if ((getRegisterPayeeMethod = MsgGrpc.getRegisterPayeeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRegisterPayeeMethod = MsgGrpc.getRegisterPayeeMethod) == null) {
          MsgGrpc.getRegisterPayeeMethod = getRegisterPayeeMethod =
              io.grpc.MethodDescriptor.<ibc.applications.fee.v1.Tx.MsgRegisterPayee, ibc.applications.fee.v1.Tx.MsgRegisterPayeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterPayee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.applications.fee.v1.Tx.MsgRegisterPayee.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.applications.fee.v1.Tx.MsgRegisterPayeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RegisterPayee"))
              .build();
        }
      }
    }
    return getRegisterPayeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ibc.applications.fee.v1.Tx.MsgRegisterCounterpartyPayee,
      ibc.applications.fee.v1.Tx.MsgRegisterCounterpartyPayeeResponse> getRegisterCounterpartyPayeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterCounterpartyPayee",
      requestType = ibc.applications.fee.v1.Tx.MsgRegisterCounterpartyPayee.class,
      responseType = ibc.applications.fee.v1.Tx.MsgRegisterCounterpartyPayeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ibc.applications.fee.v1.Tx.MsgRegisterCounterpartyPayee,
      ibc.applications.fee.v1.Tx.MsgRegisterCounterpartyPayeeResponse> getRegisterCounterpartyPayeeMethod() {
    io.grpc.MethodDescriptor<ibc.applications.fee.v1.Tx.MsgRegisterCounterpartyPayee, ibc.applications.fee.v1.Tx.MsgRegisterCounterpartyPayeeResponse> getRegisterCounterpartyPayeeMethod;
    if ((getRegisterCounterpartyPayeeMethod = MsgGrpc.getRegisterCounterpartyPayeeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRegisterCounterpartyPayeeMethod = MsgGrpc.getRegisterCounterpartyPayeeMethod) == null) {
          MsgGrpc.getRegisterCounterpartyPayeeMethod = getRegisterCounterpartyPayeeMethod =
              io.grpc.MethodDescriptor.<ibc.applications.fee.v1.Tx.MsgRegisterCounterpartyPayee, ibc.applications.fee.v1.Tx.MsgRegisterCounterpartyPayeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterCounterpartyPayee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.applications.fee.v1.Tx.MsgRegisterCounterpartyPayee.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.applications.fee.v1.Tx.MsgRegisterCounterpartyPayeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RegisterCounterpartyPayee"))
              .build();
        }
      }
    }
    return getRegisterCounterpartyPayeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ibc.applications.fee.v1.Tx.MsgPayPacketFee,
      ibc.applications.fee.v1.Tx.MsgPayPacketFeeResponse> getPayPacketFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PayPacketFee",
      requestType = ibc.applications.fee.v1.Tx.MsgPayPacketFee.class,
      responseType = ibc.applications.fee.v1.Tx.MsgPayPacketFeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ibc.applications.fee.v1.Tx.MsgPayPacketFee,
      ibc.applications.fee.v1.Tx.MsgPayPacketFeeResponse> getPayPacketFeeMethod() {
    io.grpc.MethodDescriptor<ibc.applications.fee.v1.Tx.MsgPayPacketFee, ibc.applications.fee.v1.Tx.MsgPayPacketFeeResponse> getPayPacketFeeMethod;
    if ((getPayPacketFeeMethod = MsgGrpc.getPayPacketFeeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getPayPacketFeeMethod = MsgGrpc.getPayPacketFeeMethod) == null) {
          MsgGrpc.getPayPacketFeeMethod = getPayPacketFeeMethod =
              io.grpc.MethodDescriptor.<ibc.applications.fee.v1.Tx.MsgPayPacketFee, ibc.applications.fee.v1.Tx.MsgPayPacketFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PayPacketFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.applications.fee.v1.Tx.MsgPayPacketFee.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.applications.fee.v1.Tx.MsgPayPacketFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("PayPacketFee"))
              .build();
        }
      }
    }
    return getPayPacketFeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ibc.applications.fee.v1.Tx.MsgPayPacketFeeAsync,
      ibc.applications.fee.v1.Tx.MsgPayPacketFeeAsyncResponse> getPayPacketFeeAsyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PayPacketFeeAsync",
      requestType = ibc.applications.fee.v1.Tx.MsgPayPacketFeeAsync.class,
      responseType = ibc.applications.fee.v1.Tx.MsgPayPacketFeeAsyncResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ibc.applications.fee.v1.Tx.MsgPayPacketFeeAsync,
      ibc.applications.fee.v1.Tx.MsgPayPacketFeeAsyncResponse> getPayPacketFeeAsyncMethod() {
    io.grpc.MethodDescriptor<ibc.applications.fee.v1.Tx.MsgPayPacketFeeAsync, ibc.applications.fee.v1.Tx.MsgPayPacketFeeAsyncResponse> getPayPacketFeeAsyncMethod;
    if ((getPayPacketFeeAsyncMethod = MsgGrpc.getPayPacketFeeAsyncMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getPayPacketFeeAsyncMethod = MsgGrpc.getPayPacketFeeAsyncMethod) == null) {
          MsgGrpc.getPayPacketFeeAsyncMethod = getPayPacketFeeAsyncMethod =
              io.grpc.MethodDescriptor.<ibc.applications.fee.v1.Tx.MsgPayPacketFeeAsync, ibc.applications.fee.v1.Tx.MsgPayPacketFeeAsyncResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PayPacketFeeAsync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.applications.fee.v1.Tx.MsgPayPacketFeeAsync.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ibc.applications.fee.v1.Tx.MsgPayPacketFeeAsyncResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("PayPacketFeeAsync"))
              .build();
        }
      }
    }
    return getPayPacketFeeAsyncMethod;
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
   * Msg defines the ICS29 Msg service.
   * </pre>
   */
  public static abstract class MsgImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * RegisterPayee defines a rpc handler method for MsgRegisterPayee
     * RegisterPayee is called by the relayer on each channelEnd and allows them to set an optional
     * payee to which reverse and timeout relayer packet fees will be paid out. The payee should be registered on
     * the source chain from which packets originate as this is where fee distribution takes place. This function may be
     * called more than once by a relayer, in which case, the latest payee is always used.
     * </pre>
     */
    public void registerPayee(ibc.applications.fee.v1.Tx.MsgRegisterPayee request,
        io.grpc.stub.StreamObserver<ibc.applications.fee.v1.Tx.MsgRegisterPayeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterPayeeMethod(), responseObserver);
    }

    /**
     * <pre>
     * RegisterCounterpartyPayee defines a rpc handler method for MsgRegisterCounterpartyPayee
     * RegisterCounterpartyPayee is called by the relayer on each channelEnd and allows them to specify the counterparty
     * payee address before relaying. This ensures they will be properly compensated for forward relaying since
     * the destination chain must include the registered counterparty payee address in the acknowledgement. This function
     * may be called more than once by a relayer, in which case, the latest counterparty payee address is always used.
     * </pre>
     */
    public void registerCounterpartyPayee(ibc.applications.fee.v1.Tx.MsgRegisterCounterpartyPayee request,
        io.grpc.stub.StreamObserver<ibc.applications.fee.v1.Tx.MsgRegisterCounterpartyPayeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterCounterpartyPayeeMethod(), responseObserver);
    }

    /**
     * <pre>
     * PayPacketFee defines a rpc handler method for MsgPayPacketFee
     * PayPacketFee is an open callback that may be called by any module/user that wishes to escrow funds in order to
     * incentivize the relaying of the packet at the next sequence
     * NOTE: This method is intended to be used within a multi msg transaction, where the subsequent msg that follows
     * initiates the lifecycle of the incentivized packet
     * </pre>
     */
    public void payPacketFee(ibc.applications.fee.v1.Tx.MsgPayPacketFee request,
        io.grpc.stub.StreamObserver<ibc.applications.fee.v1.Tx.MsgPayPacketFeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPayPacketFeeMethod(), responseObserver);
    }

    /**
     * <pre>
     * PayPacketFeeAsync defines a rpc handler method for MsgPayPacketFeeAsync
     * PayPacketFeeAsync is an open callback that may be called by any module/user that wishes to escrow funds in order to
     * incentivize the relaying of a known packet (i.e. at a particular sequence)
     * </pre>
     */
    public void payPacketFeeAsync(ibc.applications.fee.v1.Tx.MsgPayPacketFeeAsync request,
        io.grpc.stub.StreamObserver<ibc.applications.fee.v1.Tx.MsgPayPacketFeeAsyncResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPayPacketFeeAsyncMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterPayeeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ibc.applications.fee.v1.Tx.MsgRegisterPayee,
                ibc.applications.fee.v1.Tx.MsgRegisterPayeeResponse>(
                  this, METHODID_REGISTER_PAYEE)))
          .addMethod(
            getRegisterCounterpartyPayeeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ibc.applications.fee.v1.Tx.MsgRegisterCounterpartyPayee,
                ibc.applications.fee.v1.Tx.MsgRegisterCounterpartyPayeeResponse>(
                  this, METHODID_REGISTER_COUNTERPARTY_PAYEE)))
          .addMethod(
            getPayPacketFeeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ibc.applications.fee.v1.Tx.MsgPayPacketFee,
                ibc.applications.fee.v1.Tx.MsgPayPacketFeeResponse>(
                  this, METHODID_PAY_PACKET_FEE)))
          .addMethod(
            getPayPacketFeeAsyncMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ibc.applications.fee.v1.Tx.MsgPayPacketFeeAsync,
                ibc.applications.fee.v1.Tx.MsgPayPacketFeeAsyncResponse>(
                  this, METHODID_PAY_PACKET_FEE_ASYNC)))
          .build();
    }
  }

  /**
   * <pre>
   * Msg defines the ICS29 Msg service.
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
     * RegisterPayee defines a rpc handler method for MsgRegisterPayee
     * RegisterPayee is called by the relayer on each channelEnd and allows them to set an optional
     * payee to which reverse and timeout relayer packet fees will be paid out. The payee should be registered on
     * the source chain from which packets originate as this is where fee distribution takes place. This function may be
     * called more than once by a relayer, in which case, the latest payee is always used.
     * </pre>
     */
    public void registerPayee(ibc.applications.fee.v1.Tx.MsgRegisterPayee request,
        io.grpc.stub.StreamObserver<ibc.applications.fee.v1.Tx.MsgRegisterPayeeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterPayeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RegisterCounterpartyPayee defines a rpc handler method for MsgRegisterCounterpartyPayee
     * RegisterCounterpartyPayee is called by the relayer on each channelEnd and allows them to specify the counterparty
     * payee address before relaying. This ensures they will be properly compensated for forward relaying since
     * the destination chain must include the registered counterparty payee address in the acknowledgement. This function
     * may be called more than once by a relayer, in which case, the latest counterparty payee address is always used.
     * </pre>
     */
    public void registerCounterpartyPayee(ibc.applications.fee.v1.Tx.MsgRegisterCounterpartyPayee request,
        io.grpc.stub.StreamObserver<ibc.applications.fee.v1.Tx.MsgRegisterCounterpartyPayeeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterCounterpartyPayeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PayPacketFee defines a rpc handler method for MsgPayPacketFee
     * PayPacketFee is an open callback that may be called by any module/user that wishes to escrow funds in order to
     * incentivize the relaying of the packet at the next sequence
     * NOTE: This method is intended to be used within a multi msg transaction, where the subsequent msg that follows
     * initiates the lifecycle of the incentivized packet
     * </pre>
     */
    public void payPacketFee(ibc.applications.fee.v1.Tx.MsgPayPacketFee request,
        io.grpc.stub.StreamObserver<ibc.applications.fee.v1.Tx.MsgPayPacketFeeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPayPacketFeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PayPacketFeeAsync defines a rpc handler method for MsgPayPacketFeeAsync
     * PayPacketFeeAsync is an open callback that may be called by any module/user that wishes to escrow funds in order to
     * incentivize the relaying of a known packet (i.e. at a particular sequence)
     * </pre>
     */
    public void payPacketFeeAsync(ibc.applications.fee.v1.Tx.MsgPayPacketFeeAsync request,
        io.grpc.stub.StreamObserver<ibc.applications.fee.v1.Tx.MsgPayPacketFeeAsyncResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPayPacketFeeAsyncMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Msg defines the ICS29 Msg service.
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
     * RegisterPayee defines a rpc handler method for MsgRegisterPayee
     * RegisterPayee is called by the relayer on each channelEnd and allows them to set an optional
     * payee to which reverse and timeout relayer packet fees will be paid out. The payee should be registered on
     * the source chain from which packets originate as this is where fee distribution takes place. This function may be
     * called more than once by a relayer, in which case, the latest payee is always used.
     * </pre>
     */
    public ibc.applications.fee.v1.Tx.MsgRegisterPayeeResponse registerPayee(ibc.applications.fee.v1.Tx.MsgRegisterPayee request) {
      return blockingUnaryCall(
          getChannel(), getRegisterPayeeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RegisterCounterpartyPayee defines a rpc handler method for MsgRegisterCounterpartyPayee
     * RegisterCounterpartyPayee is called by the relayer on each channelEnd and allows them to specify the counterparty
     * payee address before relaying. This ensures they will be properly compensated for forward relaying since
     * the destination chain must include the registered counterparty payee address in the acknowledgement. This function
     * may be called more than once by a relayer, in which case, the latest counterparty payee address is always used.
     * </pre>
     */
    public ibc.applications.fee.v1.Tx.MsgRegisterCounterpartyPayeeResponse registerCounterpartyPayee(ibc.applications.fee.v1.Tx.MsgRegisterCounterpartyPayee request) {
      return blockingUnaryCall(
          getChannel(), getRegisterCounterpartyPayeeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PayPacketFee defines a rpc handler method for MsgPayPacketFee
     * PayPacketFee is an open callback that may be called by any module/user that wishes to escrow funds in order to
     * incentivize the relaying of the packet at the next sequence
     * NOTE: This method is intended to be used within a multi msg transaction, where the subsequent msg that follows
     * initiates the lifecycle of the incentivized packet
     * </pre>
     */
    public ibc.applications.fee.v1.Tx.MsgPayPacketFeeResponse payPacketFee(ibc.applications.fee.v1.Tx.MsgPayPacketFee request) {
      return blockingUnaryCall(
          getChannel(), getPayPacketFeeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PayPacketFeeAsync defines a rpc handler method for MsgPayPacketFeeAsync
     * PayPacketFeeAsync is an open callback that may be called by any module/user that wishes to escrow funds in order to
     * incentivize the relaying of a known packet (i.e. at a particular sequence)
     * </pre>
     */
    public ibc.applications.fee.v1.Tx.MsgPayPacketFeeAsyncResponse payPacketFeeAsync(ibc.applications.fee.v1.Tx.MsgPayPacketFeeAsync request) {
      return blockingUnaryCall(
          getChannel(), getPayPacketFeeAsyncMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Msg defines the ICS29 Msg service.
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
     * RegisterPayee defines a rpc handler method for MsgRegisterPayee
     * RegisterPayee is called by the relayer on each channelEnd and allows them to set an optional
     * payee to which reverse and timeout relayer packet fees will be paid out. The payee should be registered on
     * the source chain from which packets originate as this is where fee distribution takes place. This function may be
     * called more than once by a relayer, in which case, the latest payee is always used.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ibc.applications.fee.v1.Tx.MsgRegisterPayeeResponse> registerPayee(
        ibc.applications.fee.v1.Tx.MsgRegisterPayee request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterPayeeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RegisterCounterpartyPayee defines a rpc handler method for MsgRegisterCounterpartyPayee
     * RegisterCounterpartyPayee is called by the relayer on each channelEnd and allows them to specify the counterparty
     * payee address before relaying. This ensures they will be properly compensated for forward relaying since
     * the destination chain must include the registered counterparty payee address in the acknowledgement. This function
     * may be called more than once by a relayer, in which case, the latest counterparty payee address is always used.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ibc.applications.fee.v1.Tx.MsgRegisterCounterpartyPayeeResponse> registerCounterpartyPayee(
        ibc.applications.fee.v1.Tx.MsgRegisterCounterpartyPayee request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterCounterpartyPayeeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PayPacketFee defines a rpc handler method for MsgPayPacketFee
     * PayPacketFee is an open callback that may be called by any module/user that wishes to escrow funds in order to
     * incentivize the relaying of the packet at the next sequence
     * NOTE: This method is intended to be used within a multi msg transaction, where the subsequent msg that follows
     * initiates the lifecycle of the incentivized packet
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ibc.applications.fee.v1.Tx.MsgPayPacketFeeResponse> payPacketFee(
        ibc.applications.fee.v1.Tx.MsgPayPacketFee request) {
      return futureUnaryCall(
          getChannel().newCall(getPayPacketFeeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PayPacketFeeAsync defines a rpc handler method for MsgPayPacketFeeAsync
     * PayPacketFeeAsync is an open callback that may be called by any module/user that wishes to escrow funds in order to
     * incentivize the relaying of a known packet (i.e. at a particular sequence)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ibc.applications.fee.v1.Tx.MsgPayPacketFeeAsyncResponse> payPacketFeeAsync(
        ibc.applications.fee.v1.Tx.MsgPayPacketFeeAsync request) {
      return futureUnaryCall(
          getChannel().newCall(getPayPacketFeeAsyncMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_PAYEE = 0;
  private static final int METHODID_REGISTER_COUNTERPARTY_PAYEE = 1;
  private static final int METHODID_PAY_PACKET_FEE = 2;
  private static final int METHODID_PAY_PACKET_FEE_ASYNC = 3;

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
        case METHODID_REGISTER_PAYEE:
          serviceImpl.registerPayee((ibc.applications.fee.v1.Tx.MsgRegisterPayee) request,
              (io.grpc.stub.StreamObserver<ibc.applications.fee.v1.Tx.MsgRegisterPayeeResponse>) responseObserver);
          break;
        case METHODID_REGISTER_COUNTERPARTY_PAYEE:
          serviceImpl.registerCounterpartyPayee((ibc.applications.fee.v1.Tx.MsgRegisterCounterpartyPayee) request,
              (io.grpc.stub.StreamObserver<ibc.applications.fee.v1.Tx.MsgRegisterCounterpartyPayeeResponse>) responseObserver);
          break;
        case METHODID_PAY_PACKET_FEE:
          serviceImpl.payPacketFee((ibc.applications.fee.v1.Tx.MsgPayPacketFee) request,
              (io.grpc.stub.StreamObserver<ibc.applications.fee.v1.Tx.MsgPayPacketFeeResponse>) responseObserver);
          break;
        case METHODID_PAY_PACKET_FEE_ASYNC:
          serviceImpl.payPacketFeeAsync((ibc.applications.fee.v1.Tx.MsgPayPacketFeeAsync) request,
              (io.grpc.stub.StreamObserver<ibc.applications.fee.v1.Tx.MsgPayPacketFeeAsyncResponse>) responseObserver);
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
      return ibc.applications.fee.v1.Tx.getDescriptor();
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
              .addMethod(getRegisterPayeeMethod())
              .addMethod(getRegisterCounterpartyPayeeMethod())
              .addMethod(getPayPacketFeeMethod())
              .addMethod(getPayPacketFeeAsyncMethod())
              .build();
        }
      }
    }
    return result;
  }
}
