package desmos.reports.v1;

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
 * Msg defines the reports Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: desmos/reports/v1/msgs.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "desmos.reports.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<desmos.reports.v1.Msgs.MsgCreateReport,
      desmos.reports.v1.Msgs.MsgCreateReportResponse> getCreateReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateReport",
      requestType = desmos.reports.v1.Msgs.MsgCreateReport.class,
      responseType = desmos.reports.v1.Msgs.MsgCreateReportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.reports.v1.Msgs.MsgCreateReport,
      desmos.reports.v1.Msgs.MsgCreateReportResponse> getCreateReportMethod() {
    io.grpc.MethodDescriptor<desmos.reports.v1.Msgs.MsgCreateReport, desmos.reports.v1.Msgs.MsgCreateReportResponse> getCreateReportMethod;
    if ((getCreateReportMethod = MsgGrpc.getCreateReportMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateReportMethod = MsgGrpc.getCreateReportMethod) == null) {
          MsgGrpc.getCreateReportMethod = getCreateReportMethod =
              io.grpc.MethodDescriptor.<desmos.reports.v1.Msgs.MsgCreateReport, desmos.reports.v1.Msgs.MsgCreateReportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reports.v1.Msgs.MsgCreateReport.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reports.v1.Msgs.MsgCreateReportResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateReport"))
              .build();
        }
      }
    }
    return getCreateReportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.reports.v1.Msgs.MsgDeleteReport,
      desmos.reports.v1.Msgs.MsgDeleteReportResponse> getDeleteReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteReport",
      requestType = desmos.reports.v1.Msgs.MsgDeleteReport.class,
      responseType = desmos.reports.v1.Msgs.MsgDeleteReportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.reports.v1.Msgs.MsgDeleteReport,
      desmos.reports.v1.Msgs.MsgDeleteReportResponse> getDeleteReportMethod() {
    io.grpc.MethodDescriptor<desmos.reports.v1.Msgs.MsgDeleteReport, desmos.reports.v1.Msgs.MsgDeleteReportResponse> getDeleteReportMethod;
    if ((getDeleteReportMethod = MsgGrpc.getDeleteReportMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteReportMethod = MsgGrpc.getDeleteReportMethod) == null) {
          MsgGrpc.getDeleteReportMethod = getDeleteReportMethod =
              io.grpc.MethodDescriptor.<desmos.reports.v1.Msgs.MsgDeleteReport, desmos.reports.v1.Msgs.MsgDeleteReportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reports.v1.Msgs.MsgDeleteReport.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reports.v1.Msgs.MsgDeleteReportResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteReport"))
              .build();
        }
      }
    }
    return getDeleteReportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.reports.v1.Msgs.MsgSupportStandardReason,
      desmos.reports.v1.Msgs.MsgSupportStandardReasonResponse> getSupportStandardReasonMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SupportStandardReason",
      requestType = desmos.reports.v1.Msgs.MsgSupportStandardReason.class,
      responseType = desmos.reports.v1.Msgs.MsgSupportStandardReasonResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.reports.v1.Msgs.MsgSupportStandardReason,
      desmos.reports.v1.Msgs.MsgSupportStandardReasonResponse> getSupportStandardReasonMethod() {
    io.grpc.MethodDescriptor<desmos.reports.v1.Msgs.MsgSupportStandardReason, desmos.reports.v1.Msgs.MsgSupportStandardReasonResponse> getSupportStandardReasonMethod;
    if ((getSupportStandardReasonMethod = MsgGrpc.getSupportStandardReasonMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSupportStandardReasonMethod = MsgGrpc.getSupportStandardReasonMethod) == null) {
          MsgGrpc.getSupportStandardReasonMethod = getSupportStandardReasonMethod =
              io.grpc.MethodDescriptor.<desmos.reports.v1.Msgs.MsgSupportStandardReason, desmos.reports.v1.Msgs.MsgSupportStandardReasonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SupportStandardReason"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reports.v1.Msgs.MsgSupportStandardReason.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reports.v1.Msgs.MsgSupportStandardReasonResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SupportStandardReason"))
              .build();
        }
      }
    }
    return getSupportStandardReasonMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.reports.v1.Msgs.MsgAddReason,
      desmos.reports.v1.Msgs.MsgAddReasonResponse> getAddReasonMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddReason",
      requestType = desmos.reports.v1.Msgs.MsgAddReason.class,
      responseType = desmos.reports.v1.Msgs.MsgAddReasonResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.reports.v1.Msgs.MsgAddReason,
      desmos.reports.v1.Msgs.MsgAddReasonResponse> getAddReasonMethod() {
    io.grpc.MethodDescriptor<desmos.reports.v1.Msgs.MsgAddReason, desmos.reports.v1.Msgs.MsgAddReasonResponse> getAddReasonMethod;
    if ((getAddReasonMethod = MsgGrpc.getAddReasonMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddReasonMethod = MsgGrpc.getAddReasonMethod) == null) {
          MsgGrpc.getAddReasonMethod = getAddReasonMethod =
              io.grpc.MethodDescriptor.<desmos.reports.v1.Msgs.MsgAddReason, desmos.reports.v1.Msgs.MsgAddReasonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddReason"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reports.v1.Msgs.MsgAddReason.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reports.v1.Msgs.MsgAddReasonResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddReason"))
              .build();
        }
      }
    }
    return getAddReasonMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.reports.v1.Msgs.MsgRemoveReason,
      desmos.reports.v1.Msgs.MsgRemoveReasonResponse> getRemoveReasonMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveReason",
      requestType = desmos.reports.v1.Msgs.MsgRemoveReason.class,
      responseType = desmos.reports.v1.Msgs.MsgRemoveReasonResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.reports.v1.Msgs.MsgRemoveReason,
      desmos.reports.v1.Msgs.MsgRemoveReasonResponse> getRemoveReasonMethod() {
    io.grpc.MethodDescriptor<desmos.reports.v1.Msgs.MsgRemoveReason, desmos.reports.v1.Msgs.MsgRemoveReasonResponse> getRemoveReasonMethod;
    if ((getRemoveReasonMethod = MsgGrpc.getRemoveReasonMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemoveReasonMethod = MsgGrpc.getRemoveReasonMethod) == null) {
          MsgGrpc.getRemoveReasonMethod = getRemoveReasonMethod =
              io.grpc.MethodDescriptor.<desmos.reports.v1.Msgs.MsgRemoveReason, desmos.reports.v1.Msgs.MsgRemoveReasonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveReason"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reports.v1.Msgs.MsgRemoveReason.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reports.v1.Msgs.MsgRemoveReasonResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemoveReason"))
              .build();
        }
      }
    }
    return getRemoveReasonMethod;
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
   * Msg defines the reports Msg service.
   * </pre>
   */
  public static abstract class MsgImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * CreateReport allows to create a new report
     * </pre>
     */
    public void createReport(desmos.reports.v1.Msgs.MsgCreateReport request,
        io.grpc.stub.StreamObserver<desmos.reports.v1.Msgs.MsgCreateReportResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateReportMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteReport allows to delete an existing report
     * </pre>
     */
    public void deleteReport(desmos.reports.v1.Msgs.MsgDeleteReport request,
        io.grpc.stub.StreamObserver<desmos.reports.v1.Msgs.MsgDeleteReportResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteReportMethod(), responseObserver);
    }

    /**
     * <pre>
     * SupportStandardReason allows to support one of the reasons present inside
     * the module params
     * </pre>
     */
    public void supportStandardReason(desmos.reports.v1.Msgs.MsgSupportStandardReason request,
        io.grpc.stub.StreamObserver<desmos.reports.v1.Msgs.MsgSupportStandardReasonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSupportStandardReasonMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddReason allows to add a new supported reporting reason
     * </pre>
     */
    public void addReason(desmos.reports.v1.Msgs.MsgAddReason request,
        io.grpc.stub.StreamObserver<desmos.reports.v1.Msgs.MsgAddReasonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddReasonMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveReason allows to remove a supported reporting reason
     * </pre>
     */
    public void removeReason(desmos.reports.v1.Msgs.MsgRemoveReason request,
        io.grpc.stub.StreamObserver<desmos.reports.v1.Msgs.MsgRemoveReasonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveReasonMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateReportMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.reports.v1.Msgs.MsgCreateReport,
                desmos.reports.v1.Msgs.MsgCreateReportResponse>(
                  this, METHODID_CREATE_REPORT)))
          .addMethod(
            getDeleteReportMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.reports.v1.Msgs.MsgDeleteReport,
                desmos.reports.v1.Msgs.MsgDeleteReportResponse>(
                  this, METHODID_DELETE_REPORT)))
          .addMethod(
            getSupportStandardReasonMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.reports.v1.Msgs.MsgSupportStandardReason,
                desmos.reports.v1.Msgs.MsgSupportStandardReasonResponse>(
                  this, METHODID_SUPPORT_STANDARD_REASON)))
          .addMethod(
            getAddReasonMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.reports.v1.Msgs.MsgAddReason,
                desmos.reports.v1.Msgs.MsgAddReasonResponse>(
                  this, METHODID_ADD_REASON)))
          .addMethod(
            getRemoveReasonMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.reports.v1.Msgs.MsgRemoveReason,
                desmos.reports.v1.Msgs.MsgRemoveReasonResponse>(
                  this, METHODID_REMOVE_REASON)))
          .build();
    }
  }

  /**
   * <pre>
   * Msg defines the reports Msg service.
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
     * CreateReport allows to create a new report
     * </pre>
     */
    public void createReport(desmos.reports.v1.Msgs.MsgCreateReport request,
        io.grpc.stub.StreamObserver<desmos.reports.v1.Msgs.MsgCreateReportResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateReportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteReport allows to delete an existing report
     * </pre>
     */
    public void deleteReport(desmos.reports.v1.Msgs.MsgDeleteReport request,
        io.grpc.stub.StreamObserver<desmos.reports.v1.Msgs.MsgDeleteReportResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteReportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SupportStandardReason allows to support one of the reasons present inside
     * the module params
     * </pre>
     */
    public void supportStandardReason(desmos.reports.v1.Msgs.MsgSupportStandardReason request,
        io.grpc.stub.StreamObserver<desmos.reports.v1.Msgs.MsgSupportStandardReasonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSupportStandardReasonMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddReason allows to add a new supported reporting reason
     * </pre>
     */
    public void addReason(desmos.reports.v1.Msgs.MsgAddReason request,
        io.grpc.stub.StreamObserver<desmos.reports.v1.Msgs.MsgAddReasonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddReasonMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveReason allows to remove a supported reporting reason
     * </pre>
     */
    public void removeReason(desmos.reports.v1.Msgs.MsgRemoveReason request,
        io.grpc.stub.StreamObserver<desmos.reports.v1.Msgs.MsgRemoveReasonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveReasonMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Msg defines the reports Msg service.
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
     * CreateReport allows to create a new report
     * </pre>
     */
    public desmos.reports.v1.Msgs.MsgCreateReportResponse createReport(desmos.reports.v1.Msgs.MsgCreateReport request) {
      return blockingUnaryCall(
          getChannel(), getCreateReportMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteReport allows to delete an existing report
     * </pre>
     */
    public desmos.reports.v1.Msgs.MsgDeleteReportResponse deleteReport(desmos.reports.v1.Msgs.MsgDeleteReport request) {
      return blockingUnaryCall(
          getChannel(), getDeleteReportMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SupportStandardReason allows to support one of the reasons present inside
     * the module params
     * </pre>
     */
    public desmos.reports.v1.Msgs.MsgSupportStandardReasonResponse supportStandardReason(desmos.reports.v1.Msgs.MsgSupportStandardReason request) {
      return blockingUnaryCall(
          getChannel(), getSupportStandardReasonMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddReason allows to add a new supported reporting reason
     * </pre>
     */
    public desmos.reports.v1.Msgs.MsgAddReasonResponse addReason(desmos.reports.v1.Msgs.MsgAddReason request) {
      return blockingUnaryCall(
          getChannel(), getAddReasonMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveReason allows to remove a supported reporting reason
     * </pre>
     */
    public desmos.reports.v1.Msgs.MsgRemoveReasonResponse removeReason(desmos.reports.v1.Msgs.MsgRemoveReason request) {
      return blockingUnaryCall(
          getChannel(), getRemoveReasonMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Msg defines the reports Msg service.
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
     * CreateReport allows to create a new report
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.reports.v1.Msgs.MsgCreateReportResponse> createReport(
        desmos.reports.v1.Msgs.MsgCreateReport request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateReportMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteReport allows to delete an existing report
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.reports.v1.Msgs.MsgDeleteReportResponse> deleteReport(
        desmos.reports.v1.Msgs.MsgDeleteReport request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteReportMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SupportStandardReason allows to support one of the reasons present inside
     * the module params
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.reports.v1.Msgs.MsgSupportStandardReasonResponse> supportStandardReason(
        desmos.reports.v1.Msgs.MsgSupportStandardReason request) {
      return futureUnaryCall(
          getChannel().newCall(getSupportStandardReasonMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddReason allows to add a new supported reporting reason
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.reports.v1.Msgs.MsgAddReasonResponse> addReason(
        desmos.reports.v1.Msgs.MsgAddReason request) {
      return futureUnaryCall(
          getChannel().newCall(getAddReasonMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveReason allows to remove a supported reporting reason
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.reports.v1.Msgs.MsgRemoveReasonResponse> removeReason(
        desmos.reports.v1.Msgs.MsgRemoveReason request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveReasonMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_REPORT = 0;
  private static final int METHODID_DELETE_REPORT = 1;
  private static final int METHODID_SUPPORT_STANDARD_REASON = 2;
  private static final int METHODID_ADD_REASON = 3;
  private static final int METHODID_REMOVE_REASON = 4;

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
        case METHODID_CREATE_REPORT:
          serviceImpl.createReport((desmos.reports.v1.Msgs.MsgCreateReport) request,
              (io.grpc.stub.StreamObserver<desmos.reports.v1.Msgs.MsgCreateReportResponse>) responseObserver);
          break;
        case METHODID_DELETE_REPORT:
          serviceImpl.deleteReport((desmos.reports.v1.Msgs.MsgDeleteReport) request,
              (io.grpc.stub.StreamObserver<desmos.reports.v1.Msgs.MsgDeleteReportResponse>) responseObserver);
          break;
        case METHODID_SUPPORT_STANDARD_REASON:
          serviceImpl.supportStandardReason((desmos.reports.v1.Msgs.MsgSupportStandardReason) request,
              (io.grpc.stub.StreamObserver<desmos.reports.v1.Msgs.MsgSupportStandardReasonResponse>) responseObserver);
          break;
        case METHODID_ADD_REASON:
          serviceImpl.addReason((desmos.reports.v1.Msgs.MsgAddReason) request,
              (io.grpc.stub.StreamObserver<desmos.reports.v1.Msgs.MsgAddReasonResponse>) responseObserver);
          break;
        case METHODID_REMOVE_REASON:
          serviceImpl.removeReason((desmos.reports.v1.Msgs.MsgRemoveReason) request,
              (io.grpc.stub.StreamObserver<desmos.reports.v1.Msgs.MsgRemoveReasonResponse>) responseObserver);
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
      return desmos.reports.v1.Msgs.getDescriptor();
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
              .addMethod(getCreateReportMethod())
              .addMethod(getDeleteReportMethod())
              .addMethod(getSupportStandardReasonMethod())
              .addMethod(getAddReasonMethod())
              .addMethod(getRemoveReasonMethod())
              .build();
        }
      }
    }
    return result;
  }
}
