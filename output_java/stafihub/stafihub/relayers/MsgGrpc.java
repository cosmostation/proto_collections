package stafihub.stafihub.relayers;

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
    comments = "Source: stafihub/relayers/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "stafihub.stafihub.relayers.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.relayers.Tx.MsgAddRelayer,
      stafihub.stafihub.relayers.Tx.MsgAddRelayerResponse> getAddRelayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddRelayer",
      requestType = stafihub.stafihub.relayers.Tx.MsgAddRelayer.class,
      responseType = stafihub.stafihub.relayers.Tx.MsgAddRelayerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.relayers.Tx.MsgAddRelayer,
      stafihub.stafihub.relayers.Tx.MsgAddRelayerResponse> getAddRelayerMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.relayers.Tx.MsgAddRelayer, stafihub.stafihub.relayers.Tx.MsgAddRelayerResponse> getAddRelayerMethod;
    if ((getAddRelayerMethod = MsgGrpc.getAddRelayerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddRelayerMethod = MsgGrpc.getAddRelayerMethod) == null) {
          MsgGrpc.getAddRelayerMethod = getAddRelayerMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.relayers.Tx.MsgAddRelayer, stafihub.stafihub.relayers.Tx.MsgAddRelayerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddRelayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.relayers.Tx.MsgAddRelayer.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.relayers.Tx.MsgAddRelayerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddRelayer"))
              .build();
        }
      }
    }
    return getAddRelayerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.relayers.Tx.MsgDeleteRelayer,
      stafihub.stafihub.relayers.Tx.MsgDeleteRelayerResponse> getDeleteRelayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRelayer",
      requestType = stafihub.stafihub.relayers.Tx.MsgDeleteRelayer.class,
      responseType = stafihub.stafihub.relayers.Tx.MsgDeleteRelayerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.relayers.Tx.MsgDeleteRelayer,
      stafihub.stafihub.relayers.Tx.MsgDeleteRelayerResponse> getDeleteRelayerMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.relayers.Tx.MsgDeleteRelayer, stafihub.stafihub.relayers.Tx.MsgDeleteRelayerResponse> getDeleteRelayerMethod;
    if ((getDeleteRelayerMethod = MsgGrpc.getDeleteRelayerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteRelayerMethod = MsgGrpc.getDeleteRelayerMethod) == null) {
          MsgGrpc.getDeleteRelayerMethod = getDeleteRelayerMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.relayers.Tx.MsgDeleteRelayer, stafihub.stafihub.relayers.Tx.MsgDeleteRelayerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRelayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.relayers.Tx.MsgDeleteRelayer.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.relayers.Tx.MsgDeleteRelayerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteRelayer"))
              .build();
        }
      }
    }
    return getDeleteRelayerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.relayers.Tx.MsgSetThreshold,
      stafihub.stafihub.relayers.Tx.MsgSetThresholdResponse> getSetThresholdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetThreshold",
      requestType = stafihub.stafihub.relayers.Tx.MsgSetThreshold.class,
      responseType = stafihub.stafihub.relayers.Tx.MsgSetThresholdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.relayers.Tx.MsgSetThreshold,
      stafihub.stafihub.relayers.Tx.MsgSetThresholdResponse> getSetThresholdMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.relayers.Tx.MsgSetThreshold, stafihub.stafihub.relayers.Tx.MsgSetThresholdResponse> getSetThresholdMethod;
    if ((getSetThresholdMethod = MsgGrpc.getSetThresholdMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetThresholdMethod = MsgGrpc.getSetThresholdMethod) == null) {
          MsgGrpc.getSetThresholdMethod = getSetThresholdMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.relayers.Tx.MsgSetThreshold, stafihub.stafihub.relayers.Tx.MsgSetThresholdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetThreshold"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.relayers.Tx.MsgSetThreshold.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.relayers.Tx.MsgSetThresholdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetThreshold"))
              .build();
        }
      }
    }
    return getSetThresholdMethod;
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
    public void addRelayer(stafihub.stafihub.relayers.Tx.MsgAddRelayer request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.relayers.Tx.MsgAddRelayerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddRelayerMethod(), responseObserver);
    }

    /**
     */
    public void deleteRelayer(stafihub.stafihub.relayers.Tx.MsgDeleteRelayer request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.relayers.Tx.MsgDeleteRelayerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteRelayerMethod(), responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void setThreshold(stafihub.stafihub.relayers.Tx.MsgSetThreshold request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.relayers.Tx.MsgSetThresholdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetThresholdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddRelayerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.relayers.Tx.MsgAddRelayer,
                stafihub.stafihub.relayers.Tx.MsgAddRelayerResponse>(
                  this, METHODID_ADD_RELAYER)))
          .addMethod(
            getDeleteRelayerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.relayers.Tx.MsgDeleteRelayer,
                stafihub.stafihub.relayers.Tx.MsgDeleteRelayerResponse>(
                  this, METHODID_DELETE_RELAYER)))
          .addMethod(
            getSetThresholdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.relayers.Tx.MsgSetThreshold,
                stafihub.stafihub.relayers.Tx.MsgSetThresholdResponse>(
                  this, METHODID_SET_THRESHOLD)))
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
    public void addRelayer(stafihub.stafihub.relayers.Tx.MsgAddRelayer request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.relayers.Tx.MsgAddRelayerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddRelayerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteRelayer(stafihub.stafihub.relayers.Tx.MsgDeleteRelayer request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.relayers.Tx.MsgDeleteRelayerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteRelayerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void setThreshold(stafihub.stafihub.relayers.Tx.MsgSetThreshold request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.relayers.Tx.MsgSetThresholdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetThresholdMethod(), getCallOptions()), request, responseObserver);
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
    public stafihub.stafihub.relayers.Tx.MsgAddRelayerResponse addRelayer(stafihub.stafihub.relayers.Tx.MsgAddRelayer request) {
      return blockingUnaryCall(
          getChannel(), getAddRelayerMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.relayers.Tx.MsgDeleteRelayerResponse deleteRelayer(stafihub.stafihub.relayers.Tx.MsgDeleteRelayer request) {
      return blockingUnaryCall(
          getChannel(), getDeleteRelayerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public stafihub.stafihub.relayers.Tx.MsgSetThresholdResponse setThreshold(stafihub.stafihub.relayers.Tx.MsgSetThreshold request) {
      return blockingUnaryCall(
          getChannel(), getSetThresholdMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.relayers.Tx.MsgAddRelayerResponse> addRelayer(
        stafihub.stafihub.relayers.Tx.MsgAddRelayer request) {
      return futureUnaryCall(
          getChannel().newCall(getAddRelayerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.relayers.Tx.MsgDeleteRelayerResponse> deleteRelayer(
        stafihub.stafihub.relayers.Tx.MsgDeleteRelayer request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteRelayerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.relayers.Tx.MsgSetThresholdResponse> setThreshold(
        stafihub.stafihub.relayers.Tx.MsgSetThreshold request) {
      return futureUnaryCall(
          getChannel().newCall(getSetThresholdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_RELAYER = 0;
  private static final int METHODID_DELETE_RELAYER = 1;
  private static final int METHODID_SET_THRESHOLD = 2;

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
        case METHODID_ADD_RELAYER:
          serviceImpl.addRelayer((stafihub.stafihub.relayers.Tx.MsgAddRelayer) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.relayers.Tx.MsgAddRelayerResponse>) responseObserver);
          break;
        case METHODID_DELETE_RELAYER:
          serviceImpl.deleteRelayer((stafihub.stafihub.relayers.Tx.MsgDeleteRelayer) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.relayers.Tx.MsgDeleteRelayerResponse>) responseObserver);
          break;
        case METHODID_SET_THRESHOLD:
          serviceImpl.setThreshold((stafihub.stafihub.relayers.Tx.MsgSetThreshold) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.relayers.Tx.MsgSetThresholdResponse>) responseObserver);
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
      return stafihub.stafihub.relayers.Tx.getDescriptor();
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
              .addMethod(getAddRelayerMethod())
              .addMethod(getDeleteRelayerMethod())
              .addMethod(getSetThresholdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
