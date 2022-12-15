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
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: desmos/reports/v1/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "desmos.reports.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<desmos.reports.v1.QueryOuterClass.QueryReportsRequest,
      desmos.reports.v1.QueryOuterClass.QueryReportsResponse> getReportsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Reports",
      requestType = desmos.reports.v1.QueryOuterClass.QueryReportsRequest.class,
      responseType = desmos.reports.v1.QueryOuterClass.QueryReportsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.reports.v1.QueryOuterClass.QueryReportsRequest,
      desmos.reports.v1.QueryOuterClass.QueryReportsResponse> getReportsMethod() {
    io.grpc.MethodDescriptor<desmos.reports.v1.QueryOuterClass.QueryReportsRequest, desmos.reports.v1.QueryOuterClass.QueryReportsResponse> getReportsMethod;
    if ((getReportsMethod = QueryGrpc.getReportsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getReportsMethod = QueryGrpc.getReportsMethod) == null) {
          QueryGrpc.getReportsMethod = getReportsMethod =
              io.grpc.MethodDescriptor.<desmos.reports.v1.QueryOuterClass.QueryReportsRequest, desmos.reports.v1.QueryOuterClass.QueryReportsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reports"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reports.v1.QueryOuterClass.QueryReportsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reports.v1.QueryOuterClass.QueryReportsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Reports"))
              .build();
        }
      }
    }
    return getReportsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.reports.v1.QueryOuterClass.QueryReportRequest,
      desmos.reports.v1.QueryOuterClass.QueryReportResponse> getReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Report",
      requestType = desmos.reports.v1.QueryOuterClass.QueryReportRequest.class,
      responseType = desmos.reports.v1.QueryOuterClass.QueryReportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.reports.v1.QueryOuterClass.QueryReportRequest,
      desmos.reports.v1.QueryOuterClass.QueryReportResponse> getReportMethod() {
    io.grpc.MethodDescriptor<desmos.reports.v1.QueryOuterClass.QueryReportRequest, desmos.reports.v1.QueryOuterClass.QueryReportResponse> getReportMethod;
    if ((getReportMethod = QueryGrpc.getReportMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getReportMethod = QueryGrpc.getReportMethod) == null) {
          QueryGrpc.getReportMethod = getReportMethod =
              io.grpc.MethodDescriptor.<desmos.reports.v1.QueryOuterClass.QueryReportRequest, desmos.reports.v1.QueryOuterClass.QueryReportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Report"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reports.v1.QueryOuterClass.QueryReportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reports.v1.QueryOuterClass.QueryReportResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Report"))
              .build();
        }
      }
    }
    return getReportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.reports.v1.QueryOuterClass.QueryReasonsRequest,
      desmos.reports.v1.QueryOuterClass.QueryReasonsResponse> getReasonsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Reasons",
      requestType = desmos.reports.v1.QueryOuterClass.QueryReasonsRequest.class,
      responseType = desmos.reports.v1.QueryOuterClass.QueryReasonsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.reports.v1.QueryOuterClass.QueryReasonsRequest,
      desmos.reports.v1.QueryOuterClass.QueryReasonsResponse> getReasonsMethod() {
    io.grpc.MethodDescriptor<desmos.reports.v1.QueryOuterClass.QueryReasonsRequest, desmos.reports.v1.QueryOuterClass.QueryReasonsResponse> getReasonsMethod;
    if ((getReasonsMethod = QueryGrpc.getReasonsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getReasonsMethod = QueryGrpc.getReasonsMethod) == null) {
          QueryGrpc.getReasonsMethod = getReasonsMethod =
              io.grpc.MethodDescriptor.<desmos.reports.v1.QueryOuterClass.QueryReasonsRequest, desmos.reports.v1.QueryOuterClass.QueryReasonsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reasons"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reports.v1.QueryOuterClass.QueryReasonsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reports.v1.QueryOuterClass.QueryReasonsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Reasons"))
              .build();
        }
      }
    }
    return getReasonsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.reports.v1.QueryOuterClass.QueryReasonRequest,
      desmos.reports.v1.QueryOuterClass.QueryReasonResponse> getReasonMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Reason",
      requestType = desmos.reports.v1.QueryOuterClass.QueryReasonRequest.class,
      responseType = desmos.reports.v1.QueryOuterClass.QueryReasonResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.reports.v1.QueryOuterClass.QueryReasonRequest,
      desmos.reports.v1.QueryOuterClass.QueryReasonResponse> getReasonMethod() {
    io.grpc.MethodDescriptor<desmos.reports.v1.QueryOuterClass.QueryReasonRequest, desmos.reports.v1.QueryOuterClass.QueryReasonResponse> getReasonMethod;
    if ((getReasonMethod = QueryGrpc.getReasonMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getReasonMethod = QueryGrpc.getReasonMethod) == null) {
          QueryGrpc.getReasonMethod = getReasonMethod =
              io.grpc.MethodDescriptor.<desmos.reports.v1.QueryOuterClass.QueryReasonRequest, desmos.reports.v1.QueryOuterClass.QueryReasonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reason"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reports.v1.QueryOuterClass.QueryReasonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reports.v1.QueryOuterClass.QueryReasonResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Reason"))
              .build();
        }
      }
    }
    return getReasonMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.reports.v1.QueryOuterClass.QueryParamsRequest,
      desmos.reports.v1.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = desmos.reports.v1.QueryOuterClass.QueryParamsRequest.class,
      responseType = desmos.reports.v1.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.reports.v1.QueryOuterClass.QueryParamsRequest,
      desmos.reports.v1.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<desmos.reports.v1.QueryOuterClass.QueryParamsRequest, desmos.reports.v1.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<desmos.reports.v1.QueryOuterClass.QueryParamsRequest, desmos.reports.v1.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reports.v1.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reports.v1.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryStub>() {
        @java.lang.Override
        public QueryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryStub(channel, callOptions);
        }
      };
    return QueryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryBlockingStub>() {
        @java.lang.Override
        public QueryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryBlockingStub(channel, callOptions);
        }
      };
    return QueryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryFutureStub>() {
        @java.lang.Override
        public QueryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryFutureStub(channel, callOptions);
        }
      };
    return QueryFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static abstract class QueryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Reports allows to query the reports for a specific target
     * </pre>
     */
    public void reports(desmos.reports.v1.QueryOuterClass.QueryReportsRequest request,
        io.grpc.stub.StreamObserver<desmos.reports.v1.QueryOuterClass.QueryReportsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReportsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Report allows to query the report having the given id
     * </pre>
     */
    public void report(desmos.reports.v1.QueryOuterClass.QueryReportRequest request,
        io.grpc.stub.StreamObserver<desmos.reports.v1.QueryOuterClass.QueryReportResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReportMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reasons allows to query the supported reporting reasons for a subspace
     * </pre>
     */
    public void reasons(desmos.reports.v1.QueryOuterClass.QueryReasonsRequest request,
        io.grpc.stub.StreamObserver<desmos.reports.v1.QueryOuterClass.QueryReasonsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReasonsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reason allows to query the reason having the given id
     * </pre>
     */
    public void reason(desmos.reports.v1.QueryOuterClass.QueryReasonRequest request,
        io.grpc.stub.StreamObserver<desmos.reports.v1.QueryOuterClass.QueryReasonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReasonMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params allows to query the module parameters
     * </pre>
     */
    public void params(desmos.reports.v1.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<desmos.reports.v1.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReportsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.reports.v1.QueryOuterClass.QueryReportsRequest,
                desmos.reports.v1.QueryOuterClass.QueryReportsResponse>(
                  this, METHODID_REPORTS)))
          .addMethod(
            getReportMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.reports.v1.QueryOuterClass.QueryReportRequest,
                desmos.reports.v1.QueryOuterClass.QueryReportResponse>(
                  this, METHODID_REPORT)))
          .addMethod(
            getReasonsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.reports.v1.QueryOuterClass.QueryReasonsRequest,
                desmos.reports.v1.QueryOuterClass.QueryReasonsResponse>(
                  this, METHODID_REASONS)))
          .addMethod(
            getReasonMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.reports.v1.QueryOuterClass.QueryReasonRequest,
                desmos.reports.v1.QueryOuterClass.QueryReasonResponse>(
                  this, METHODID_REASON)))
          .addMethod(
            getParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.reports.v1.QueryOuterClass.QueryParamsRequest,
                desmos.reports.v1.QueryOuterClass.QueryParamsResponse>(
                  this, METHODID_PARAMS)))
          .build();
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryStub extends io.grpc.stub.AbstractAsyncStub<QueryStub> {
    private QueryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryStub(channel, callOptions);
    }

    /**
     * <pre>
     * Reports allows to query the reports for a specific target
     * </pre>
     */
    public void reports(desmos.reports.v1.QueryOuterClass.QueryReportsRequest request,
        io.grpc.stub.StreamObserver<desmos.reports.v1.QueryOuterClass.QueryReportsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReportsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Report allows to query the report having the given id
     * </pre>
     */
    public void report(desmos.reports.v1.QueryOuterClass.QueryReportRequest request,
        io.grpc.stub.StreamObserver<desmos.reports.v1.QueryOuterClass.QueryReportResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reasons allows to query the supported reporting reasons for a subspace
     * </pre>
     */
    public void reasons(desmos.reports.v1.QueryOuterClass.QueryReasonsRequest request,
        io.grpc.stub.StreamObserver<desmos.reports.v1.QueryOuterClass.QueryReasonsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReasonsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reason allows to query the reason having the given id
     * </pre>
     */
    public void reason(desmos.reports.v1.QueryOuterClass.QueryReasonRequest request,
        io.grpc.stub.StreamObserver<desmos.reports.v1.QueryOuterClass.QueryReasonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReasonMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params allows to query the module parameters
     * </pre>
     */
    public void params(desmos.reports.v1.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<desmos.reports.v1.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryBlockingStub extends io.grpc.stub.AbstractBlockingStub<QueryBlockingStub> {
    private QueryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Reports allows to query the reports for a specific target
     * </pre>
     */
    public desmos.reports.v1.QueryOuterClass.QueryReportsResponse reports(desmos.reports.v1.QueryOuterClass.QueryReportsRequest request) {
      return blockingUnaryCall(
          getChannel(), getReportsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Report allows to query the report having the given id
     * </pre>
     */
    public desmos.reports.v1.QueryOuterClass.QueryReportResponse report(desmos.reports.v1.QueryOuterClass.QueryReportRequest request) {
      return blockingUnaryCall(
          getChannel(), getReportMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reasons allows to query the supported reporting reasons for a subspace
     * </pre>
     */
    public desmos.reports.v1.QueryOuterClass.QueryReasonsResponse reasons(desmos.reports.v1.QueryOuterClass.QueryReasonsRequest request) {
      return blockingUnaryCall(
          getChannel(), getReasonsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reason allows to query the reason having the given id
     * </pre>
     */
    public desmos.reports.v1.QueryOuterClass.QueryReasonResponse reason(desmos.reports.v1.QueryOuterClass.QueryReasonRequest request) {
      return blockingUnaryCall(
          getChannel(), getReasonMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params allows to query the module parameters
     * </pre>
     */
    public desmos.reports.v1.QueryOuterClass.QueryParamsResponse params(desmos.reports.v1.QueryOuterClass.QueryParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryFutureStub extends io.grpc.stub.AbstractFutureStub<QueryFutureStub> {
    private QueryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Reports allows to query the reports for a specific target
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.reports.v1.QueryOuterClass.QueryReportsResponse> reports(
        desmos.reports.v1.QueryOuterClass.QueryReportsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReportsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Report allows to query the report having the given id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.reports.v1.QueryOuterClass.QueryReportResponse> report(
        desmos.reports.v1.QueryOuterClass.QueryReportRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReportMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reasons allows to query the supported reporting reasons for a subspace
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.reports.v1.QueryOuterClass.QueryReasonsResponse> reasons(
        desmos.reports.v1.QueryOuterClass.QueryReasonsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReasonsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reason allows to query the reason having the given id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.reports.v1.QueryOuterClass.QueryReasonResponse> reason(
        desmos.reports.v1.QueryOuterClass.QueryReasonRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReasonMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params allows to query the module parameters
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.reports.v1.QueryOuterClass.QueryParamsResponse> params(
        desmos.reports.v1.QueryOuterClass.QueryParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REPORTS = 0;
  private static final int METHODID_REPORT = 1;
  private static final int METHODID_REASONS = 2;
  private static final int METHODID_REASON = 3;
  private static final int METHODID_PARAMS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QueryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QueryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REPORTS:
          serviceImpl.reports((desmos.reports.v1.QueryOuterClass.QueryReportsRequest) request,
              (io.grpc.stub.StreamObserver<desmos.reports.v1.QueryOuterClass.QueryReportsResponse>) responseObserver);
          break;
        case METHODID_REPORT:
          serviceImpl.report((desmos.reports.v1.QueryOuterClass.QueryReportRequest) request,
              (io.grpc.stub.StreamObserver<desmos.reports.v1.QueryOuterClass.QueryReportResponse>) responseObserver);
          break;
        case METHODID_REASONS:
          serviceImpl.reasons((desmos.reports.v1.QueryOuterClass.QueryReasonsRequest) request,
              (io.grpc.stub.StreamObserver<desmos.reports.v1.QueryOuterClass.QueryReasonsResponse>) responseObserver);
          break;
        case METHODID_REASON:
          serviceImpl.reason((desmos.reports.v1.QueryOuterClass.QueryReasonRequest) request,
              (io.grpc.stub.StreamObserver<desmos.reports.v1.QueryOuterClass.QueryReasonResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((desmos.reports.v1.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<desmos.reports.v1.QueryOuterClass.QueryParamsResponse>) responseObserver);
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

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return desmos.reports.v1.QueryOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Query");
    }
  }

  private static final class QueryFileDescriptorSupplier
      extends QueryBaseDescriptorSupplier {
    QueryFileDescriptorSupplier() {}
  }

  private static final class QueryMethodDescriptorSupplier
      extends QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryMethodDescriptorSupplier(String methodName) {
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
      synchronized (QueryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryFileDescriptorSupplier())
              .addMethod(getReportsMethod())
              .addMethod(getReportMethod())
              .addMethod(getReasonsMethod())
              .addMethod(getReasonMethod())
              .addMethod(getParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
