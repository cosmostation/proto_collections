package cosmos.store.streaming.abci;

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
 * ABCIListenerService is the service for the BaseApp ABCIListener interface
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: cosmos/store/streaming/abci/grpc.proto")
public final class ABCIListenerServiceGrpc {

  private ABCIListenerServiceGrpc() {}

  public static final String SERVICE_NAME = "cosmos.store.streaming.abci.ABCIListenerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cosmos.store.streaming.abci.Grpc.ListenBeginBlockRequest,
      cosmos.store.streaming.abci.Grpc.ListenBeginBlockResponse> getListenBeginBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListenBeginBlock",
      requestType = cosmos.store.streaming.abci.Grpc.ListenBeginBlockRequest.class,
      responseType = cosmos.store.streaming.abci.Grpc.ListenBeginBlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.store.streaming.abci.Grpc.ListenBeginBlockRequest,
      cosmos.store.streaming.abci.Grpc.ListenBeginBlockResponse> getListenBeginBlockMethod() {
    io.grpc.MethodDescriptor<cosmos.store.streaming.abci.Grpc.ListenBeginBlockRequest, cosmos.store.streaming.abci.Grpc.ListenBeginBlockResponse> getListenBeginBlockMethod;
    if ((getListenBeginBlockMethod = ABCIListenerServiceGrpc.getListenBeginBlockMethod) == null) {
      synchronized (ABCIListenerServiceGrpc.class) {
        if ((getListenBeginBlockMethod = ABCIListenerServiceGrpc.getListenBeginBlockMethod) == null) {
          ABCIListenerServiceGrpc.getListenBeginBlockMethod = getListenBeginBlockMethod =
              io.grpc.MethodDescriptor.<cosmos.store.streaming.abci.Grpc.ListenBeginBlockRequest, cosmos.store.streaming.abci.Grpc.ListenBeginBlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListenBeginBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.store.streaming.abci.Grpc.ListenBeginBlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.store.streaming.abci.Grpc.ListenBeginBlockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ABCIListenerServiceMethodDescriptorSupplier("ListenBeginBlock"))
              .build();
        }
      }
    }
    return getListenBeginBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.store.streaming.abci.Grpc.ListenEndBlockRequest,
      cosmos.store.streaming.abci.Grpc.ListenEndBlockResponse> getListenEndBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListenEndBlock",
      requestType = cosmos.store.streaming.abci.Grpc.ListenEndBlockRequest.class,
      responseType = cosmos.store.streaming.abci.Grpc.ListenEndBlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.store.streaming.abci.Grpc.ListenEndBlockRequest,
      cosmos.store.streaming.abci.Grpc.ListenEndBlockResponse> getListenEndBlockMethod() {
    io.grpc.MethodDescriptor<cosmos.store.streaming.abci.Grpc.ListenEndBlockRequest, cosmos.store.streaming.abci.Grpc.ListenEndBlockResponse> getListenEndBlockMethod;
    if ((getListenEndBlockMethod = ABCIListenerServiceGrpc.getListenEndBlockMethod) == null) {
      synchronized (ABCIListenerServiceGrpc.class) {
        if ((getListenEndBlockMethod = ABCIListenerServiceGrpc.getListenEndBlockMethod) == null) {
          ABCIListenerServiceGrpc.getListenEndBlockMethod = getListenEndBlockMethod =
              io.grpc.MethodDescriptor.<cosmos.store.streaming.abci.Grpc.ListenEndBlockRequest, cosmos.store.streaming.abci.Grpc.ListenEndBlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListenEndBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.store.streaming.abci.Grpc.ListenEndBlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.store.streaming.abci.Grpc.ListenEndBlockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ABCIListenerServiceMethodDescriptorSupplier("ListenEndBlock"))
              .build();
        }
      }
    }
    return getListenEndBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.store.streaming.abci.Grpc.ListenDeliverTxRequest,
      cosmos.store.streaming.abci.Grpc.ListenDeliverTxResponse> getListenDeliverTxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListenDeliverTx",
      requestType = cosmos.store.streaming.abci.Grpc.ListenDeliverTxRequest.class,
      responseType = cosmos.store.streaming.abci.Grpc.ListenDeliverTxResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.store.streaming.abci.Grpc.ListenDeliverTxRequest,
      cosmos.store.streaming.abci.Grpc.ListenDeliverTxResponse> getListenDeliverTxMethod() {
    io.grpc.MethodDescriptor<cosmos.store.streaming.abci.Grpc.ListenDeliverTxRequest, cosmos.store.streaming.abci.Grpc.ListenDeliverTxResponse> getListenDeliverTxMethod;
    if ((getListenDeliverTxMethod = ABCIListenerServiceGrpc.getListenDeliverTxMethod) == null) {
      synchronized (ABCIListenerServiceGrpc.class) {
        if ((getListenDeliverTxMethod = ABCIListenerServiceGrpc.getListenDeliverTxMethod) == null) {
          ABCIListenerServiceGrpc.getListenDeliverTxMethod = getListenDeliverTxMethod =
              io.grpc.MethodDescriptor.<cosmos.store.streaming.abci.Grpc.ListenDeliverTxRequest, cosmos.store.streaming.abci.Grpc.ListenDeliverTxResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListenDeliverTx"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.store.streaming.abci.Grpc.ListenDeliverTxRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.store.streaming.abci.Grpc.ListenDeliverTxResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ABCIListenerServiceMethodDescriptorSupplier("ListenDeliverTx"))
              .build();
        }
      }
    }
    return getListenDeliverTxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.store.streaming.abci.Grpc.ListenCommitRequest,
      cosmos.store.streaming.abci.Grpc.ListenCommitResponse> getListenCommitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListenCommit",
      requestType = cosmos.store.streaming.abci.Grpc.ListenCommitRequest.class,
      responseType = cosmos.store.streaming.abci.Grpc.ListenCommitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.store.streaming.abci.Grpc.ListenCommitRequest,
      cosmos.store.streaming.abci.Grpc.ListenCommitResponse> getListenCommitMethod() {
    io.grpc.MethodDescriptor<cosmos.store.streaming.abci.Grpc.ListenCommitRequest, cosmos.store.streaming.abci.Grpc.ListenCommitResponse> getListenCommitMethod;
    if ((getListenCommitMethod = ABCIListenerServiceGrpc.getListenCommitMethod) == null) {
      synchronized (ABCIListenerServiceGrpc.class) {
        if ((getListenCommitMethod = ABCIListenerServiceGrpc.getListenCommitMethod) == null) {
          ABCIListenerServiceGrpc.getListenCommitMethod = getListenCommitMethod =
              io.grpc.MethodDescriptor.<cosmos.store.streaming.abci.Grpc.ListenCommitRequest, cosmos.store.streaming.abci.Grpc.ListenCommitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListenCommit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.store.streaming.abci.Grpc.ListenCommitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.store.streaming.abci.Grpc.ListenCommitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ABCIListenerServiceMethodDescriptorSupplier("ListenCommit"))
              .build();
        }
      }
    }
    return getListenCommitMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ABCIListenerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ABCIListenerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ABCIListenerServiceStub>() {
        @java.lang.Override
        public ABCIListenerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ABCIListenerServiceStub(channel, callOptions);
        }
      };
    return ABCIListenerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ABCIListenerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ABCIListenerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ABCIListenerServiceBlockingStub>() {
        @java.lang.Override
        public ABCIListenerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ABCIListenerServiceBlockingStub(channel, callOptions);
        }
      };
    return ABCIListenerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ABCIListenerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ABCIListenerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ABCIListenerServiceFutureStub>() {
        @java.lang.Override
        public ABCIListenerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ABCIListenerServiceFutureStub(channel, callOptions);
        }
      };
    return ABCIListenerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ABCIListenerService is the service for the BaseApp ABCIListener interface
   * </pre>
   */
  public static abstract class ABCIListenerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * ListenBeginBlock is the corresponding endpoint for ABCIListener.ListenBeginBlock
     * </pre>
     */
    public void listenBeginBlock(cosmos.store.streaming.abci.Grpc.ListenBeginBlockRequest request,
        io.grpc.stub.StreamObserver<cosmos.store.streaming.abci.Grpc.ListenBeginBlockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListenBeginBlockMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListenEndBlock is the corresponding endpoint for ABCIListener.ListenEndBlock
     * </pre>
     */
    public void listenEndBlock(cosmos.store.streaming.abci.Grpc.ListenEndBlockRequest request,
        io.grpc.stub.StreamObserver<cosmos.store.streaming.abci.Grpc.ListenEndBlockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListenEndBlockMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListenDeliverTx is the corresponding endpoint for ABCIListener.ListenDeliverTx
     * </pre>
     */
    public void listenDeliverTx(cosmos.store.streaming.abci.Grpc.ListenDeliverTxRequest request,
        io.grpc.stub.StreamObserver<cosmos.store.streaming.abci.Grpc.ListenDeliverTxResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListenDeliverTxMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListenCommit is the corresponding endpoint for ABCIListener.ListenCommit
     * </pre>
     */
    public void listenCommit(cosmos.store.streaming.abci.Grpc.ListenCommitRequest request,
        io.grpc.stub.StreamObserver<cosmos.store.streaming.abci.Grpc.ListenCommitResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListenCommitMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListenBeginBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.store.streaming.abci.Grpc.ListenBeginBlockRequest,
                cosmos.store.streaming.abci.Grpc.ListenBeginBlockResponse>(
                  this, METHODID_LISTEN_BEGIN_BLOCK)))
          .addMethod(
            getListenEndBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.store.streaming.abci.Grpc.ListenEndBlockRequest,
                cosmos.store.streaming.abci.Grpc.ListenEndBlockResponse>(
                  this, METHODID_LISTEN_END_BLOCK)))
          .addMethod(
            getListenDeliverTxMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.store.streaming.abci.Grpc.ListenDeliverTxRequest,
                cosmos.store.streaming.abci.Grpc.ListenDeliverTxResponse>(
                  this, METHODID_LISTEN_DELIVER_TX)))
          .addMethod(
            getListenCommitMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.store.streaming.abci.Grpc.ListenCommitRequest,
                cosmos.store.streaming.abci.Grpc.ListenCommitResponse>(
                  this, METHODID_LISTEN_COMMIT)))
          .build();
    }
  }

  /**
   * <pre>
   * ABCIListenerService is the service for the BaseApp ABCIListener interface
   * </pre>
   */
  public static final class ABCIListenerServiceStub extends io.grpc.stub.AbstractAsyncStub<ABCIListenerServiceStub> {
    private ABCIListenerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ABCIListenerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ABCIListenerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListenBeginBlock is the corresponding endpoint for ABCIListener.ListenBeginBlock
     * </pre>
     */
    public void listenBeginBlock(cosmos.store.streaming.abci.Grpc.ListenBeginBlockRequest request,
        io.grpc.stub.StreamObserver<cosmos.store.streaming.abci.Grpc.ListenBeginBlockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListenBeginBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListenEndBlock is the corresponding endpoint for ABCIListener.ListenEndBlock
     * </pre>
     */
    public void listenEndBlock(cosmos.store.streaming.abci.Grpc.ListenEndBlockRequest request,
        io.grpc.stub.StreamObserver<cosmos.store.streaming.abci.Grpc.ListenEndBlockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListenEndBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListenDeliverTx is the corresponding endpoint for ABCIListener.ListenDeliverTx
     * </pre>
     */
    public void listenDeliverTx(cosmos.store.streaming.abci.Grpc.ListenDeliverTxRequest request,
        io.grpc.stub.StreamObserver<cosmos.store.streaming.abci.Grpc.ListenDeliverTxResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListenDeliverTxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListenCommit is the corresponding endpoint for ABCIListener.ListenCommit
     * </pre>
     */
    public void listenCommit(cosmos.store.streaming.abci.Grpc.ListenCommitRequest request,
        io.grpc.stub.StreamObserver<cosmos.store.streaming.abci.Grpc.ListenCommitResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListenCommitMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * ABCIListenerService is the service for the BaseApp ABCIListener interface
   * </pre>
   */
  public static final class ABCIListenerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ABCIListenerServiceBlockingStub> {
    private ABCIListenerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ABCIListenerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ABCIListenerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListenBeginBlock is the corresponding endpoint for ABCIListener.ListenBeginBlock
     * </pre>
     */
    public cosmos.store.streaming.abci.Grpc.ListenBeginBlockResponse listenBeginBlock(cosmos.store.streaming.abci.Grpc.ListenBeginBlockRequest request) {
      return blockingUnaryCall(
          getChannel(), getListenBeginBlockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListenEndBlock is the corresponding endpoint for ABCIListener.ListenEndBlock
     * </pre>
     */
    public cosmos.store.streaming.abci.Grpc.ListenEndBlockResponse listenEndBlock(cosmos.store.streaming.abci.Grpc.ListenEndBlockRequest request) {
      return blockingUnaryCall(
          getChannel(), getListenEndBlockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListenDeliverTx is the corresponding endpoint for ABCIListener.ListenDeliverTx
     * </pre>
     */
    public cosmos.store.streaming.abci.Grpc.ListenDeliverTxResponse listenDeliverTx(cosmos.store.streaming.abci.Grpc.ListenDeliverTxRequest request) {
      return blockingUnaryCall(
          getChannel(), getListenDeliverTxMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListenCommit is the corresponding endpoint for ABCIListener.ListenCommit
     * </pre>
     */
    public cosmos.store.streaming.abci.Grpc.ListenCommitResponse listenCommit(cosmos.store.streaming.abci.Grpc.ListenCommitRequest request) {
      return blockingUnaryCall(
          getChannel(), getListenCommitMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * ABCIListenerService is the service for the BaseApp ABCIListener interface
   * </pre>
   */
  public static final class ABCIListenerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ABCIListenerServiceFutureStub> {
    private ABCIListenerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ABCIListenerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ABCIListenerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListenBeginBlock is the corresponding endpoint for ABCIListener.ListenBeginBlock
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.store.streaming.abci.Grpc.ListenBeginBlockResponse> listenBeginBlock(
        cosmos.store.streaming.abci.Grpc.ListenBeginBlockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListenBeginBlockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListenEndBlock is the corresponding endpoint for ABCIListener.ListenEndBlock
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.store.streaming.abci.Grpc.ListenEndBlockResponse> listenEndBlock(
        cosmos.store.streaming.abci.Grpc.ListenEndBlockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListenEndBlockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListenDeliverTx is the corresponding endpoint for ABCIListener.ListenDeliverTx
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.store.streaming.abci.Grpc.ListenDeliverTxResponse> listenDeliverTx(
        cosmos.store.streaming.abci.Grpc.ListenDeliverTxRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListenDeliverTxMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListenCommit is the corresponding endpoint for ABCIListener.ListenCommit
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.store.streaming.abci.Grpc.ListenCommitResponse> listenCommit(
        cosmos.store.streaming.abci.Grpc.ListenCommitRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListenCommitMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LISTEN_BEGIN_BLOCK = 0;
  private static final int METHODID_LISTEN_END_BLOCK = 1;
  private static final int METHODID_LISTEN_DELIVER_TX = 2;
  private static final int METHODID_LISTEN_COMMIT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ABCIListenerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ABCIListenerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LISTEN_BEGIN_BLOCK:
          serviceImpl.listenBeginBlock((cosmos.store.streaming.abci.Grpc.ListenBeginBlockRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.store.streaming.abci.Grpc.ListenBeginBlockResponse>) responseObserver);
          break;
        case METHODID_LISTEN_END_BLOCK:
          serviceImpl.listenEndBlock((cosmos.store.streaming.abci.Grpc.ListenEndBlockRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.store.streaming.abci.Grpc.ListenEndBlockResponse>) responseObserver);
          break;
        case METHODID_LISTEN_DELIVER_TX:
          serviceImpl.listenDeliverTx((cosmos.store.streaming.abci.Grpc.ListenDeliverTxRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.store.streaming.abci.Grpc.ListenDeliverTxResponse>) responseObserver);
          break;
        case METHODID_LISTEN_COMMIT:
          serviceImpl.listenCommit((cosmos.store.streaming.abci.Grpc.ListenCommitRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.store.streaming.abci.Grpc.ListenCommitResponse>) responseObserver);
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

  private static abstract class ABCIListenerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ABCIListenerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cosmos.store.streaming.abci.Grpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ABCIListenerService");
    }
  }

  private static final class ABCIListenerServiceFileDescriptorSupplier
      extends ABCIListenerServiceBaseDescriptorSupplier {
    ABCIListenerServiceFileDescriptorSupplier() {}
  }

  private static final class ABCIListenerServiceMethodDescriptorSupplier
      extends ABCIListenerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ABCIListenerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ABCIListenerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ABCIListenerServiceFileDescriptorSupplier())
              .addMethod(getListenBeginBlockMethod())
              .addMethod(getListenEndBlockMethod())
              .addMethod(getListenDeliverTxMethod())
              .addMethod(getListenCommitMethod())
              .build();
        }
      }
    }
    return result;
  }
}
