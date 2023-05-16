package mars.incentives.v1beta1;

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
 * Msg defines the incentives module's Msg service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: mars/incentives/v1beta1/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "mars.incentives.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<mars.incentives.v1beta1.Tx.MsgCreateSchedule,
      mars.incentives.v1beta1.Tx.MsgCreateScheduleResponse> getCreateScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSchedule",
      requestType = mars.incentives.v1beta1.Tx.MsgCreateSchedule.class,
      responseType = mars.incentives.v1beta1.Tx.MsgCreateScheduleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mars.incentives.v1beta1.Tx.MsgCreateSchedule,
      mars.incentives.v1beta1.Tx.MsgCreateScheduleResponse> getCreateScheduleMethod() {
    io.grpc.MethodDescriptor<mars.incentives.v1beta1.Tx.MsgCreateSchedule, mars.incentives.v1beta1.Tx.MsgCreateScheduleResponse> getCreateScheduleMethod;
    if ((getCreateScheduleMethod = MsgGrpc.getCreateScheduleMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateScheduleMethod = MsgGrpc.getCreateScheduleMethod) == null) {
          MsgGrpc.getCreateScheduleMethod = getCreateScheduleMethod =
              io.grpc.MethodDescriptor.<mars.incentives.v1beta1.Tx.MsgCreateSchedule, mars.incentives.v1beta1.Tx.MsgCreateScheduleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSchedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mars.incentives.v1beta1.Tx.MsgCreateSchedule.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mars.incentives.v1beta1.Tx.MsgCreateScheduleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateSchedule"))
              .build();
        }
      }
    }
    return getCreateScheduleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mars.incentives.v1beta1.Tx.MsgTerminateSchedules,
      mars.incentives.v1beta1.Tx.MsgTerminateSchedulesResponse> getTerminateSchedulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TerminateSchedules",
      requestType = mars.incentives.v1beta1.Tx.MsgTerminateSchedules.class,
      responseType = mars.incentives.v1beta1.Tx.MsgTerminateSchedulesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mars.incentives.v1beta1.Tx.MsgTerminateSchedules,
      mars.incentives.v1beta1.Tx.MsgTerminateSchedulesResponse> getTerminateSchedulesMethod() {
    io.grpc.MethodDescriptor<mars.incentives.v1beta1.Tx.MsgTerminateSchedules, mars.incentives.v1beta1.Tx.MsgTerminateSchedulesResponse> getTerminateSchedulesMethod;
    if ((getTerminateSchedulesMethod = MsgGrpc.getTerminateSchedulesMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getTerminateSchedulesMethod = MsgGrpc.getTerminateSchedulesMethod) == null) {
          MsgGrpc.getTerminateSchedulesMethod = getTerminateSchedulesMethod =
              io.grpc.MethodDescriptor.<mars.incentives.v1beta1.Tx.MsgTerminateSchedules, mars.incentives.v1beta1.Tx.MsgTerminateSchedulesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TerminateSchedules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mars.incentives.v1beta1.Tx.MsgTerminateSchedules.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mars.incentives.v1beta1.Tx.MsgTerminateSchedulesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("TerminateSchedules"))
              .build();
        }
      }
    }
    return getTerminateSchedulesMethod;
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
   * Msg defines the incentives module's Msg service
   * </pre>
   */
  public static abstract class MsgImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * CreateSchedule is a governance operation for creating a new incentives
     * schedule.
     * </pre>
     */
    public void createSchedule(mars.incentives.v1beta1.Tx.MsgCreateSchedule request,
        io.grpc.stub.StreamObserver<mars.incentives.v1beta1.Tx.MsgCreateScheduleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateScheduleMethod(), responseObserver);
    }

    /**
     * <pre>
     * TerminateSchedule is a governance operation for terminating one or more
     * existing incentives schedules.
     * </pre>
     */
    public void terminateSchedules(mars.incentives.v1beta1.Tx.MsgTerminateSchedules request,
        io.grpc.stub.StreamObserver<mars.incentives.v1beta1.Tx.MsgTerminateSchedulesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTerminateSchedulesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateScheduleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mars.incentives.v1beta1.Tx.MsgCreateSchedule,
                mars.incentives.v1beta1.Tx.MsgCreateScheduleResponse>(
                  this, METHODID_CREATE_SCHEDULE)))
          .addMethod(
            getTerminateSchedulesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mars.incentives.v1beta1.Tx.MsgTerminateSchedules,
                mars.incentives.v1beta1.Tx.MsgTerminateSchedulesResponse>(
                  this, METHODID_TERMINATE_SCHEDULES)))
          .build();
    }
  }

  /**
   * <pre>
   * Msg defines the incentives module's Msg service
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
     * CreateSchedule is a governance operation for creating a new incentives
     * schedule.
     * </pre>
     */
    public void createSchedule(mars.incentives.v1beta1.Tx.MsgCreateSchedule request,
        io.grpc.stub.StreamObserver<mars.incentives.v1beta1.Tx.MsgCreateScheduleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateScheduleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TerminateSchedule is a governance operation for terminating one or more
     * existing incentives schedules.
     * </pre>
     */
    public void terminateSchedules(mars.incentives.v1beta1.Tx.MsgTerminateSchedules request,
        io.grpc.stub.StreamObserver<mars.incentives.v1beta1.Tx.MsgTerminateSchedulesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTerminateSchedulesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Msg defines the incentives module's Msg service
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
     * CreateSchedule is a governance operation for creating a new incentives
     * schedule.
     * </pre>
     */
    public mars.incentives.v1beta1.Tx.MsgCreateScheduleResponse createSchedule(mars.incentives.v1beta1.Tx.MsgCreateSchedule request) {
      return blockingUnaryCall(
          getChannel(), getCreateScheduleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TerminateSchedule is a governance operation for terminating one or more
     * existing incentives schedules.
     * </pre>
     */
    public mars.incentives.v1beta1.Tx.MsgTerminateSchedulesResponse terminateSchedules(mars.incentives.v1beta1.Tx.MsgTerminateSchedules request) {
      return blockingUnaryCall(
          getChannel(), getTerminateSchedulesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Msg defines the incentives module's Msg service
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
     * CreateSchedule is a governance operation for creating a new incentives
     * schedule.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mars.incentives.v1beta1.Tx.MsgCreateScheduleResponse> createSchedule(
        mars.incentives.v1beta1.Tx.MsgCreateSchedule request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateScheduleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TerminateSchedule is a governance operation for terminating one or more
     * existing incentives schedules.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mars.incentives.v1beta1.Tx.MsgTerminateSchedulesResponse> terminateSchedules(
        mars.incentives.v1beta1.Tx.MsgTerminateSchedules request) {
      return futureUnaryCall(
          getChannel().newCall(getTerminateSchedulesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SCHEDULE = 0;
  private static final int METHODID_TERMINATE_SCHEDULES = 1;

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
        case METHODID_CREATE_SCHEDULE:
          serviceImpl.createSchedule((mars.incentives.v1beta1.Tx.MsgCreateSchedule) request,
              (io.grpc.stub.StreamObserver<mars.incentives.v1beta1.Tx.MsgCreateScheduleResponse>) responseObserver);
          break;
        case METHODID_TERMINATE_SCHEDULES:
          serviceImpl.terminateSchedules((mars.incentives.v1beta1.Tx.MsgTerminateSchedules) request,
              (io.grpc.stub.StreamObserver<mars.incentives.v1beta1.Tx.MsgTerminateSchedulesResponse>) responseObserver);
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
      return mars.incentives.v1beta1.Tx.getDescriptor();
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
              .addMethod(getCreateScheduleMethod())
              .addMethod(getTerminateSchedulesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
