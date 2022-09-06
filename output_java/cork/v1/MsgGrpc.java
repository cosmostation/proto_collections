package cork.v1;

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
 * MsgService defines the msgs that the cork module handles
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: sommelier/cork/v1/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "cork.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cork.v1.Tx.MsgSubmitCorkRequest,
      cork.v1.Tx.MsgSubmitCorkResponse> getSubmitCorkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitCork",
      requestType = cork.v1.Tx.MsgSubmitCorkRequest.class,
      responseType = cork.v1.Tx.MsgSubmitCorkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cork.v1.Tx.MsgSubmitCorkRequest,
      cork.v1.Tx.MsgSubmitCorkResponse> getSubmitCorkMethod() {
    io.grpc.MethodDescriptor<cork.v1.Tx.MsgSubmitCorkRequest, cork.v1.Tx.MsgSubmitCorkResponse> getSubmitCorkMethod;
    if ((getSubmitCorkMethod = MsgGrpc.getSubmitCorkMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSubmitCorkMethod = MsgGrpc.getSubmitCorkMethod) == null) {
          MsgGrpc.getSubmitCorkMethod = getSubmitCorkMethod =
              io.grpc.MethodDescriptor.<cork.v1.Tx.MsgSubmitCorkRequest, cork.v1.Tx.MsgSubmitCorkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitCork"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cork.v1.Tx.MsgSubmitCorkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cork.v1.Tx.MsgSubmitCorkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SubmitCork"))
              .build();
        }
      }
    }
    return getSubmitCorkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cork.v1.Tx.MsgScheduleCorkRequest,
      cork.v1.Tx.MsgScheduleCorkResponse> getScheduleCorkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScheduleCork",
      requestType = cork.v1.Tx.MsgScheduleCorkRequest.class,
      responseType = cork.v1.Tx.MsgScheduleCorkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cork.v1.Tx.MsgScheduleCorkRequest,
      cork.v1.Tx.MsgScheduleCorkResponse> getScheduleCorkMethod() {
    io.grpc.MethodDescriptor<cork.v1.Tx.MsgScheduleCorkRequest, cork.v1.Tx.MsgScheduleCorkResponse> getScheduleCorkMethod;
    if ((getScheduleCorkMethod = MsgGrpc.getScheduleCorkMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getScheduleCorkMethod = MsgGrpc.getScheduleCorkMethod) == null) {
          MsgGrpc.getScheduleCorkMethod = getScheduleCorkMethod =
              io.grpc.MethodDescriptor.<cork.v1.Tx.MsgScheduleCorkRequest, cork.v1.Tx.MsgScheduleCorkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScheduleCork"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cork.v1.Tx.MsgScheduleCorkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cork.v1.Tx.MsgScheduleCorkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ScheduleCork"))
              .build();
        }
      }
    }
    return getScheduleCorkMethod;
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
   * MsgService defines the msgs that the cork module handles
   * </pre>
   */
  public static abstract class MsgImplBase implements io.grpc.BindableService {

    /**
     */
    public void submitCork(cork.v1.Tx.MsgSubmitCorkRequest request,
        io.grpc.stub.StreamObserver<cork.v1.Tx.MsgSubmitCorkResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSubmitCorkMethod(), responseObserver);
    }

    /**
     */
    public void scheduleCork(cork.v1.Tx.MsgScheduleCorkRequest request,
        io.grpc.stub.StreamObserver<cork.v1.Tx.MsgScheduleCorkResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getScheduleCorkMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSubmitCorkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cork.v1.Tx.MsgSubmitCorkRequest,
                cork.v1.Tx.MsgSubmitCorkResponse>(
                  this, METHODID_SUBMIT_CORK)))
          .addMethod(
            getScheduleCorkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cork.v1.Tx.MsgScheduleCorkRequest,
                cork.v1.Tx.MsgScheduleCorkResponse>(
                  this, METHODID_SCHEDULE_CORK)))
          .build();
    }
  }

  /**
   * <pre>
   * MsgService defines the msgs that the cork module handles
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
    public void submitCork(cork.v1.Tx.MsgSubmitCorkRequest request,
        io.grpc.stub.StreamObserver<cork.v1.Tx.MsgSubmitCorkResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubmitCorkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void scheduleCork(cork.v1.Tx.MsgScheduleCorkRequest request,
        io.grpc.stub.StreamObserver<cork.v1.Tx.MsgScheduleCorkResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getScheduleCorkMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * MsgService defines the msgs that the cork module handles
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
    public cork.v1.Tx.MsgSubmitCorkResponse submitCork(cork.v1.Tx.MsgSubmitCorkRequest request) {
      return blockingUnaryCall(
          getChannel(), getSubmitCorkMethod(), getCallOptions(), request);
    }

    /**
     */
    public cork.v1.Tx.MsgScheduleCorkResponse scheduleCork(cork.v1.Tx.MsgScheduleCorkRequest request) {
      return blockingUnaryCall(
          getChannel(), getScheduleCorkMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * MsgService defines the msgs that the cork module handles
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
    public com.google.common.util.concurrent.ListenableFuture<cork.v1.Tx.MsgSubmitCorkResponse> submitCork(
        cork.v1.Tx.MsgSubmitCorkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSubmitCorkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cork.v1.Tx.MsgScheduleCorkResponse> scheduleCork(
        cork.v1.Tx.MsgScheduleCorkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getScheduleCorkMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBMIT_CORK = 0;
  private static final int METHODID_SCHEDULE_CORK = 1;

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
        case METHODID_SUBMIT_CORK:
          serviceImpl.submitCork((cork.v1.Tx.MsgSubmitCorkRequest) request,
              (io.grpc.stub.StreamObserver<cork.v1.Tx.MsgSubmitCorkResponse>) responseObserver);
          break;
        case METHODID_SCHEDULE_CORK:
          serviceImpl.scheduleCork((cork.v1.Tx.MsgScheduleCorkRequest) request,
              (io.grpc.stub.StreamObserver<cork.v1.Tx.MsgScheduleCorkResponse>) responseObserver);
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
      return cork.v1.Tx.getDescriptor();
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
              .addMethod(getSubmitCorkMethod())
              .addMethod(getScheduleCorkMethod())
              .build();
        }
      }
    }
    return result;
  }
}
