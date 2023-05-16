package mars.envoy.v1beta1;

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
 * Msg defines the module's gRPC message service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: mars/envoy/v1beta1/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "mars.envoy.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<mars.envoy.v1beta1.Tx.MsgRegisterAccount,
      mars.envoy.v1beta1.Tx.MsgRegisterAccountResponse> getRegisterAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterAccount",
      requestType = mars.envoy.v1beta1.Tx.MsgRegisterAccount.class,
      responseType = mars.envoy.v1beta1.Tx.MsgRegisterAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mars.envoy.v1beta1.Tx.MsgRegisterAccount,
      mars.envoy.v1beta1.Tx.MsgRegisterAccountResponse> getRegisterAccountMethod() {
    io.grpc.MethodDescriptor<mars.envoy.v1beta1.Tx.MsgRegisterAccount, mars.envoy.v1beta1.Tx.MsgRegisterAccountResponse> getRegisterAccountMethod;
    if ((getRegisterAccountMethod = MsgGrpc.getRegisterAccountMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRegisterAccountMethod = MsgGrpc.getRegisterAccountMethod) == null) {
          MsgGrpc.getRegisterAccountMethod = getRegisterAccountMethod =
              io.grpc.MethodDescriptor.<mars.envoy.v1beta1.Tx.MsgRegisterAccount, mars.envoy.v1beta1.Tx.MsgRegisterAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mars.envoy.v1beta1.Tx.MsgRegisterAccount.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mars.envoy.v1beta1.Tx.MsgRegisterAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RegisterAccount"))
              .build();
        }
      }
    }
    return getRegisterAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mars.envoy.v1beta1.Tx.MsgSendFunds,
      mars.envoy.v1beta1.Tx.MsgSendFundsResponse> getSendFundsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendFunds",
      requestType = mars.envoy.v1beta1.Tx.MsgSendFunds.class,
      responseType = mars.envoy.v1beta1.Tx.MsgSendFundsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mars.envoy.v1beta1.Tx.MsgSendFunds,
      mars.envoy.v1beta1.Tx.MsgSendFundsResponse> getSendFundsMethod() {
    io.grpc.MethodDescriptor<mars.envoy.v1beta1.Tx.MsgSendFunds, mars.envoy.v1beta1.Tx.MsgSendFundsResponse> getSendFundsMethod;
    if ((getSendFundsMethod = MsgGrpc.getSendFundsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSendFundsMethod = MsgGrpc.getSendFundsMethod) == null) {
          MsgGrpc.getSendFundsMethod = getSendFundsMethod =
              io.grpc.MethodDescriptor.<mars.envoy.v1beta1.Tx.MsgSendFunds, mars.envoy.v1beta1.Tx.MsgSendFundsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendFunds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mars.envoy.v1beta1.Tx.MsgSendFunds.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mars.envoy.v1beta1.Tx.MsgSendFundsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SendFunds"))
              .build();
        }
      }
    }
    return getSendFundsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mars.envoy.v1beta1.Tx.MsgSendMessages,
      mars.envoy.v1beta1.Tx.MsgSendMessagesResponse> getSendMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendMessages",
      requestType = mars.envoy.v1beta1.Tx.MsgSendMessages.class,
      responseType = mars.envoy.v1beta1.Tx.MsgSendMessagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mars.envoy.v1beta1.Tx.MsgSendMessages,
      mars.envoy.v1beta1.Tx.MsgSendMessagesResponse> getSendMessagesMethod() {
    io.grpc.MethodDescriptor<mars.envoy.v1beta1.Tx.MsgSendMessages, mars.envoy.v1beta1.Tx.MsgSendMessagesResponse> getSendMessagesMethod;
    if ((getSendMessagesMethod = MsgGrpc.getSendMessagesMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSendMessagesMethod = MsgGrpc.getSendMessagesMethod) == null) {
          MsgGrpc.getSendMessagesMethod = getSendMessagesMethod =
              io.grpc.MethodDescriptor.<mars.envoy.v1beta1.Tx.MsgSendMessages, mars.envoy.v1beta1.Tx.MsgSendMessagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mars.envoy.v1beta1.Tx.MsgSendMessages.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mars.envoy.v1beta1.Tx.MsgSendMessagesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SendMessages"))
              .build();
        }
      }
    }
    return getSendMessagesMethod;
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
   * Msg defines the module's gRPC message service.
   * </pre>
   */
  public static abstract class MsgImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * RegisterAccount creates a new interchain account on the given connection,
     * or if an interchain account already exists but its channel is closed (due
     * to a packet having timed out), open a new channel for this account.
     * </pre>
     */
    public void registerAccount(mars.envoy.v1beta1.Tx.MsgRegisterAccount request,
        io.grpc.stub.StreamObserver<mars.envoy.v1beta1.Tx.MsgRegisterAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * SendFunds is a governance operation for sending funds to an interchain
     * account via ICS-20.
     * The envoy module will first attempt to use the balance held in its own
     * module account. If the balance is not sufficient, it will attempt to draw
     * the difference from the community pool.
     * </pre>
     */
    public void sendFunds(mars.envoy.v1beta1.Tx.MsgSendFunds request,
        io.grpc.stub.StreamObserver<mars.envoy.v1beta1.Tx.MsgSendFundsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendFundsMethod(), responseObserver);
    }

    /**
     * <pre>
     * SendMessages is a governance operation for sending one or more messages to
     * the host chain to be executed by the interchain account.
     * </pre>
     */
    public void sendMessages(mars.envoy.v1beta1.Tx.MsgSendMessages request,
        io.grpc.stub.StreamObserver<mars.envoy.v1beta1.Tx.MsgSendMessagesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendMessagesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mars.envoy.v1beta1.Tx.MsgRegisterAccount,
                mars.envoy.v1beta1.Tx.MsgRegisterAccountResponse>(
                  this, METHODID_REGISTER_ACCOUNT)))
          .addMethod(
            getSendFundsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mars.envoy.v1beta1.Tx.MsgSendFunds,
                mars.envoy.v1beta1.Tx.MsgSendFundsResponse>(
                  this, METHODID_SEND_FUNDS)))
          .addMethod(
            getSendMessagesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mars.envoy.v1beta1.Tx.MsgSendMessages,
                mars.envoy.v1beta1.Tx.MsgSendMessagesResponse>(
                  this, METHODID_SEND_MESSAGES)))
          .build();
    }
  }

  /**
   * <pre>
   * Msg defines the module's gRPC message service.
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
     * RegisterAccount creates a new interchain account on the given connection,
     * or if an interchain account already exists but its channel is closed (due
     * to a packet having timed out), open a new channel for this account.
     * </pre>
     */
    public void registerAccount(mars.envoy.v1beta1.Tx.MsgRegisterAccount request,
        io.grpc.stub.StreamObserver<mars.envoy.v1beta1.Tx.MsgRegisterAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SendFunds is a governance operation for sending funds to an interchain
     * account via ICS-20.
     * The envoy module will first attempt to use the balance held in its own
     * module account. If the balance is not sufficient, it will attempt to draw
     * the difference from the community pool.
     * </pre>
     */
    public void sendFunds(mars.envoy.v1beta1.Tx.MsgSendFunds request,
        io.grpc.stub.StreamObserver<mars.envoy.v1beta1.Tx.MsgSendFundsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendFundsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SendMessages is a governance operation for sending one or more messages to
     * the host chain to be executed by the interchain account.
     * </pre>
     */
    public void sendMessages(mars.envoy.v1beta1.Tx.MsgSendMessages request,
        io.grpc.stub.StreamObserver<mars.envoy.v1beta1.Tx.MsgSendMessagesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendMessagesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Msg defines the module's gRPC message service.
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
     * RegisterAccount creates a new interchain account on the given connection,
     * or if an interchain account already exists but its channel is closed (due
     * to a packet having timed out), open a new channel for this account.
     * </pre>
     */
    public mars.envoy.v1beta1.Tx.MsgRegisterAccountResponse registerAccount(mars.envoy.v1beta1.Tx.MsgRegisterAccount request) {
      return blockingUnaryCall(
          getChannel(), getRegisterAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SendFunds is a governance operation for sending funds to an interchain
     * account via ICS-20.
     * The envoy module will first attempt to use the balance held in its own
     * module account. If the balance is not sufficient, it will attempt to draw
     * the difference from the community pool.
     * </pre>
     */
    public mars.envoy.v1beta1.Tx.MsgSendFundsResponse sendFunds(mars.envoy.v1beta1.Tx.MsgSendFunds request) {
      return blockingUnaryCall(
          getChannel(), getSendFundsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SendMessages is a governance operation for sending one or more messages to
     * the host chain to be executed by the interchain account.
     * </pre>
     */
    public mars.envoy.v1beta1.Tx.MsgSendMessagesResponse sendMessages(mars.envoy.v1beta1.Tx.MsgSendMessages request) {
      return blockingUnaryCall(
          getChannel(), getSendMessagesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Msg defines the module's gRPC message service.
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
     * RegisterAccount creates a new interchain account on the given connection,
     * or if an interchain account already exists but its channel is closed (due
     * to a packet having timed out), open a new channel for this account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mars.envoy.v1beta1.Tx.MsgRegisterAccountResponse> registerAccount(
        mars.envoy.v1beta1.Tx.MsgRegisterAccount request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SendFunds is a governance operation for sending funds to an interchain
     * account via ICS-20.
     * The envoy module will first attempt to use the balance held in its own
     * module account. If the balance is not sufficient, it will attempt to draw
     * the difference from the community pool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mars.envoy.v1beta1.Tx.MsgSendFundsResponse> sendFunds(
        mars.envoy.v1beta1.Tx.MsgSendFunds request) {
      return futureUnaryCall(
          getChannel().newCall(getSendFundsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SendMessages is a governance operation for sending one or more messages to
     * the host chain to be executed by the interchain account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mars.envoy.v1beta1.Tx.MsgSendMessagesResponse> sendMessages(
        mars.envoy.v1beta1.Tx.MsgSendMessages request) {
      return futureUnaryCall(
          getChannel().newCall(getSendMessagesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_ACCOUNT = 0;
  private static final int METHODID_SEND_FUNDS = 1;
  private static final int METHODID_SEND_MESSAGES = 2;

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
        case METHODID_REGISTER_ACCOUNT:
          serviceImpl.registerAccount((mars.envoy.v1beta1.Tx.MsgRegisterAccount) request,
              (io.grpc.stub.StreamObserver<mars.envoy.v1beta1.Tx.MsgRegisterAccountResponse>) responseObserver);
          break;
        case METHODID_SEND_FUNDS:
          serviceImpl.sendFunds((mars.envoy.v1beta1.Tx.MsgSendFunds) request,
              (io.grpc.stub.StreamObserver<mars.envoy.v1beta1.Tx.MsgSendFundsResponse>) responseObserver);
          break;
        case METHODID_SEND_MESSAGES:
          serviceImpl.sendMessages((mars.envoy.v1beta1.Tx.MsgSendMessages) request,
              (io.grpc.stub.StreamObserver<mars.envoy.v1beta1.Tx.MsgSendMessagesResponse>) responseObserver);
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
      return mars.envoy.v1beta1.Tx.getDescriptor();
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
              .addMethod(getRegisterAccountMethod())
              .addMethod(getSendFundsMethod())
              .addMethod(getSendMessagesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
