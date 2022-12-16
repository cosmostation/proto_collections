package quicksilver.interchainstaking.v1;

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
 * Msg defines the interchainstaking Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: quicksilver/interchainstaking/v1/messages.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "quicksilver.interchainstaking.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<quicksilver.interchainstaking.v1.Messages.MsgRequestRedemption,
      quicksilver.interchainstaking.v1.Messages.MsgRequestRedemptionResponse> getRequestRedemptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestRedemption",
      requestType = quicksilver.interchainstaking.v1.Messages.MsgRequestRedemption.class,
      responseType = quicksilver.interchainstaking.v1.Messages.MsgRequestRedemptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<quicksilver.interchainstaking.v1.Messages.MsgRequestRedemption,
      quicksilver.interchainstaking.v1.Messages.MsgRequestRedemptionResponse> getRequestRedemptionMethod() {
    io.grpc.MethodDescriptor<quicksilver.interchainstaking.v1.Messages.MsgRequestRedemption, quicksilver.interchainstaking.v1.Messages.MsgRequestRedemptionResponse> getRequestRedemptionMethod;
    if ((getRequestRedemptionMethod = MsgGrpc.getRequestRedemptionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRequestRedemptionMethod = MsgGrpc.getRequestRedemptionMethod) == null) {
          MsgGrpc.getRequestRedemptionMethod = getRequestRedemptionMethod =
              io.grpc.MethodDescriptor.<quicksilver.interchainstaking.v1.Messages.MsgRequestRedemption, quicksilver.interchainstaking.v1.Messages.MsgRequestRedemptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequestRedemption"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.interchainstaking.v1.Messages.MsgRequestRedemption.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.interchainstaking.v1.Messages.MsgRequestRedemptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RequestRedemption"))
              .build();
        }
      }
    }
    return getRequestRedemptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<quicksilver.interchainstaking.v1.Messages.MsgSignalIntent,
      quicksilver.interchainstaking.v1.Messages.MsgSignalIntentResponse> getSignalIntentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignalIntent",
      requestType = quicksilver.interchainstaking.v1.Messages.MsgSignalIntent.class,
      responseType = quicksilver.interchainstaking.v1.Messages.MsgSignalIntentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<quicksilver.interchainstaking.v1.Messages.MsgSignalIntent,
      quicksilver.interchainstaking.v1.Messages.MsgSignalIntentResponse> getSignalIntentMethod() {
    io.grpc.MethodDescriptor<quicksilver.interchainstaking.v1.Messages.MsgSignalIntent, quicksilver.interchainstaking.v1.Messages.MsgSignalIntentResponse> getSignalIntentMethod;
    if ((getSignalIntentMethod = MsgGrpc.getSignalIntentMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSignalIntentMethod = MsgGrpc.getSignalIntentMethod) == null) {
          MsgGrpc.getSignalIntentMethod = getSignalIntentMethod =
              io.grpc.MethodDescriptor.<quicksilver.interchainstaking.v1.Messages.MsgSignalIntent, quicksilver.interchainstaking.v1.Messages.MsgSignalIntentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignalIntent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.interchainstaking.v1.Messages.MsgSignalIntent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.interchainstaking.v1.Messages.MsgSignalIntentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SignalIntent"))
              .build();
        }
      }
    }
    return getSignalIntentMethod;
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
   * Msg defines the interchainstaking Msg service.
   * </pre>
   */
  public static abstract class MsgImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * RequestRedemption defines a method for requesting burning of qAssets for
     * native assets.
     * </pre>
     */
    public void requestRedemption(quicksilver.interchainstaking.v1.Messages.MsgRequestRedemption request,
        io.grpc.stub.StreamObserver<quicksilver.interchainstaking.v1.Messages.MsgRequestRedemptionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRequestRedemptionMethod(), responseObserver);
    }

    /**
     * <pre>
     * SignalIntent defines a method for signalling voting intent for one or more
     * validators.
     * </pre>
     */
    public void signalIntent(quicksilver.interchainstaking.v1.Messages.MsgSignalIntent request,
        io.grpc.stub.StreamObserver<quicksilver.interchainstaking.v1.Messages.MsgSignalIntentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSignalIntentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRequestRedemptionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                quicksilver.interchainstaking.v1.Messages.MsgRequestRedemption,
                quicksilver.interchainstaking.v1.Messages.MsgRequestRedemptionResponse>(
                  this, METHODID_REQUEST_REDEMPTION)))
          .addMethod(
            getSignalIntentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                quicksilver.interchainstaking.v1.Messages.MsgSignalIntent,
                quicksilver.interchainstaking.v1.Messages.MsgSignalIntentResponse>(
                  this, METHODID_SIGNAL_INTENT)))
          .build();
    }
  }

  /**
   * <pre>
   * Msg defines the interchainstaking Msg service.
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
     * RequestRedemption defines a method for requesting burning of qAssets for
     * native assets.
     * </pre>
     */
    public void requestRedemption(quicksilver.interchainstaking.v1.Messages.MsgRequestRedemption request,
        io.grpc.stub.StreamObserver<quicksilver.interchainstaking.v1.Messages.MsgRequestRedemptionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRequestRedemptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SignalIntent defines a method for signalling voting intent for one or more
     * validators.
     * </pre>
     */
    public void signalIntent(quicksilver.interchainstaking.v1.Messages.MsgSignalIntent request,
        io.grpc.stub.StreamObserver<quicksilver.interchainstaking.v1.Messages.MsgSignalIntentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSignalIntentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Msg defines the interchainstaking Msg service.
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
     * RequestRedemption defines a method for requesting burning of qAssets for
     * native assets.
     * </pre>
     */
    public quicksilver.interchainstaking.v1.Messages.MsgRequestRedemptionResponse requestRedemption(quicksilver.interchainstaking.v1.Messages.MsgRequestRedemption request) {
      return blockingUnaryCall(
          getChannel(), getRequestRedemptionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SignalIntent defines a method for signalling voting intent for one or more
     * validators.
     * </pre>
     */
    public quicksilver.interchainstaking.v1.Messages.MsgSignalIntentResponse signalIntent(quicksilver.interchainstaking.v1.Messages.MsgSignalIntent request) {
      return blockingUnaryCall(
          getChannel(), getSignalIntentMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Msg defines the interchainstaking Msg service.
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
     * RequestRedemption defines a method for requesting burning of qAssets for
     * native assets.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<quicksilver.interchainstaking.v1.Messages.MsgRequestRedemptionResponse> requestRedemption(
        quicksilver.interchainstaking.v1.Messages.MsgRequestRedemption request) {
      return futureUnaryCall(
          getChannel().newCall(getRequestRedemptionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SignalIntent defines a method for signalling voting intent for one or more
     * validators.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<quicksilver.interchainstaking.v1.Messages.MsgSignalIntentResponse> signalIntent(
        quicksilver.interchainstaking.v1.Messages.MsgSignalIntent request) {
      return futureUnaryCall(
          getChannel().newCall(getSignalIntentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REQUEST_REDEMPTION = 0;
  private static final int METHODID_SIGNAL_INTENT = 1;

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
        case METHODID_REQUEST_REDEMPTION:
          serviceImpl.requestRedemption((quicksilver.interchainstaking.v1.Messages.MsgRequestRedemption) request,
              (io.grpc.stub.StreamObserver<quicksilver.interchainstaking.v1.Messages.MsgRequestRedemptionResponse>) responseObserver);
          break;
        case METHODID_SIGNAL_INTENT:
          serviceImpl.signalIntent((quicksilver.interchainstaking.v1.Messages.MsgSignalIntent) request,
              (io.grpc.stub.StreamObserver<quicksilver.interchainstaking.v1.Messages.MsgSignalIntentResponse>) responseObserver);
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
      return quicksilver.interchainstaking.v1.Messages.getDescriptor();
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
              .addMethod(getRequestRedemptionMethod())
              .addMethod(getSignalIntentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
