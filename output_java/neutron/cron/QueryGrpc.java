package neutron.cron;

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
    comments = "Source: neutron/cron/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "neutron.cron.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<neutron.cron.QueryOuterClass.QueryParamsRequest,
      neutron.cron.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = neutron.cron.QueryOuterClass.QueryParamsRequest.class,
      responseType = neutron.cron.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<neutron.cron.QueryOuterClass.QueryParamsRequest,
      neutron.cron.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<neutron.cron.QueryOuterClass.QueryParamsRequest, neutron.cron.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<neutron.cron.QueryOuterClass.QueryParamsRequest, neutron.cron.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.cron.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.cron.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<neutron.cron.QueryOuterClass.QueryGetScheduleRequest,
      neutron.cron.QueryOuterClass.QueryGetScheduleResponse> getScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Schedule",
      requestType = neutron.cron.QueryOuterClass.QueryGetScheduleRequest.class,
      responseType = neutron.cron.QueryOuterClass.QueryGetScheduleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<neutron.cron.QueryOuterClass.QueryGetScheduleRequest,
      neutron.cron.QueryOuterClass.QueryGetScheduleResponse> getScheduleMethod() {
    io.grpc.MethodDescriptor<neutron.cron.QueryOuterClass.QueryGetScheduleRequest, neutron.cron.QueryOuterClass.QueryGetScheduleResponse> getScheduleMethod;
    if ((getScheduleMethod = QueryGrpc.getScheduleMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getScheduleMethod = QueryGrpc.getScheduleMethod) == null) {
          QueryGrpc.getScheduleMethod = getScheduleMethod =
              io.grpc.MethodDescriptor.<neutron.cron.QueryOuterClass.QueryGetScheduleRequest, neutron.cron.QueryOuterClass.QueryGetScheduleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Schedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.cron.QueryOuterClass.QueryGetScheduleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.cron.QueryOuterClass.QueryGetScheduleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Schedule"))
              .build();
        }
      }
    }
    return getScheduleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<neutron.cron.QueryOuterClass.QuerySchedulesRequest,
      neutron.cron.QueryOuterClass.QuerySchedulesResponse> getSchedulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Schedules",
      requestType = neutron.cron.QueryOuterClass.QuerySchedulesRequest.class,
      responseType = neutron.cron.QueryOuterClass.QuerySchedulesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<neutron.cron.QueryOuterClass.QuerySchedulesRequest,
      neutron.cron.QueryOuterClass.QuerySchedulesResponse> getSchedulesMethod() {
    io.grpc.MethodDescriptor<neutron.cron.QueryOuterClass.QuerySchedulesRequest, neutron.cron.QueryOuterClass.QuerySchedulesResponse> getSchedulesMethod;
    if ((getSchedulesMethod = QueryGrpc.getSchedulesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSchedulesMethod = QueryGrpc.getSchedulesMethod) == null) {
          QueryGrpc.getSchedulesMethod = getSchedulesMethod =
              io.grpc.MethodDescriptor.<neutron.cron.QueryOuterClass.QuerySchedulesRequest, neutron.cron.QueryOuterClass.QuerySchedulesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Schedules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.cron.QueryOuterClass.QuerySchedulesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.cron.QueryOuterClass.QuerySchedulesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Schedules"))
              .build();
        }
      }
    }
    return getSchedulesMethod;
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
     * Queries the parameters of the module.
     * </pre>
     */
    public void params(neutron.cron.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<neutron.cron.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a Schedule by name.
     * </pre>
     */
    public void schedule(neutron.cron.QueryOuterClass.QueryGetScheduleRequest request,
        io.grpc.stub.StreamObserver<neutron.cron.QueryOuterClass.QueryGetScheduleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getScheduleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Schedule items.
     * </pre>
     */
    public void schedules(neutron.cron.QueryOuterClass.QuerySchedulesRequest request,
        io.grpc.stub.StreamObserver<neutron.cron.QueryOuterClass.QuerySchedulesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSchedulesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                neutron.cron.QueryOuterClass.QueryParamsRequest,
                neutron.cron.QueryOuterClass.QueryParamsResponse>(
                  this, METHODID_PARAMS)))
          .addMethod(
            getScheduleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                neutron.cron.QueryOuterClass.QueryGetScheduleRequest,
                neutron.cron.QueryOuterClass.QueryGetScheduleResponse>(
                  this, METHODID_SCHEDULE)))
          .addMethod(
            getSchedulesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                neutron.cron.QueryOuterClass.QuerySchedulesRequest,
                neutron.cron.QueryOuterClass.QuerySchedulesResponse>(
                  this, METHODID_SCHEDULES)))
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
     * Queries the parameters of the module.
     * </pre>
     */
    public void params(neutron.cron.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<neutron.cron.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a Schedule by name.
     * </pre>
     */
    public void schedule(neutron.cron.QueryOuterClass.QueryGetScheduleRequest request,
        io.grpc.stub.StreamObserver<neutron.cron.QueryOuterClass.QueryGetScheduleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getScheduleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Schedule items.
     * </pre>
     */
    public void schedules(neutron.cron.QueryOuterClass.QuerySchedulesRequest request,
        io.grpc.stub.StreamObserver<neutron.cron.QueryOuterClass.QuerySchedulesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSchedulesMethod(), getCallOptions()), request, responseObserver);
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
     * Queries the parameters of the module.
     * </pre>
     */
    public neutron.cron.QueryOuterClass.QueryParamsResponse params(neutron.cron.QueryOuterClass.QueryParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a Schedule by name.
     * </pre>
     */
    public neutron.cron.QueryOuterClass.QueryGetScheduleResponse schedule(neutron.cron.QueryOuterClass.QueryGetScheduleRequest request) {
      return blockingUnaryCall(
          getChannel(), getScheduleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of Schedule items.
     * </pre>
     */
    public neutron.cron.QueryOuterClass.QuerySchedulesResponse schedules(neutron.cron.QueryOuterClass.QuerySchedulesRequest request) {
      return blockingUnaryCall(
          getChannel(), getSchedulesMethod(), getCallOptions(), request);
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
     * Queries the parameters of the module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<neutron.cron.QueryOuterClass.QueryParamsResponse> params(
        neutron.cron.QueryOuterClass.QueryParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a Schedule by name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<neutron.cron.QueryOuterClass.QueryGetScheduleResponse> schedule(
        neutron.cron.QueryOuterClass.QueryGetScheduleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getScheduleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of Schedule items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<neutron.cron.QueryOuterClass.QuerySchedulesResponse> schedules(
        neutron.cron.QueryOuterClass.QuerySchedulesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSchedulesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_SCHEDULE = 1;
  private static final int METHODID_SCHEDULES = 2;

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
        case METHODID_PARAMS:
          serviceImpl.params((neutron.cron.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<neutron.cron.QueryOuterClass.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_SCHEDULE:
          serviceImpl.schedule((neutron.cron.QueryOuterClass.QueryGetScheduleRequest) request,
              (io.grpc.stub.StreamObserver<neutron.cron.QueryOuterClass.QueryGetScheduleResponse>) responseObserver);
          break;
        case METHODID_SCHEDULES:
          serviceImpl.schedules((neutron.cron.QueryOuterClass.QuerySchedulesRequest) request,
              (io.grpc.stub.StreamObserver<neutron.cron.QueryOuterClass.QuerySchedulesResponse>) responseObserver);
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
      return neutron.cron.QueryOuterClass.getDescriptor();
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
              .addMethod(getParamsMethod())
              .addMethod(getScheduleMethod())
              .addMethod(getSchedulesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
