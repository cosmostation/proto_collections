package kujira.scheduler;

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
    comments = "Source: kujira/scheduler/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "kujira.scheduler.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<kujira.scheduler.QueryOuterClass.QueryParamsRequest,
      kujira.scheduler.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = kujira.scheduler.QueryOuterClass.QueryParamsRequest.class,
      responseType = kujira.scheduler.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kujira.scheduler.QueryOuterClass.QueryParamsRequest,
      kujira.scheduler.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<kujira.scheduler.QueryOuterClass.QueryParamsRequest, kujira.scheduler.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<kujira.scheduler.QueryOuterClass.QueryParamsRequest, kujira.scheduler.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kujira.scheduler.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kujira.scheduler.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kujira.scheduler.QueryOuterClass.QueryGetHookRequest,
      kujira.scheduler.QueryOuterClass.QueryGetHookResponse> getHookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Hook",
      requestType = kujira.scheduler.QueryOuterClass.QueryGetHookRequest.class,
      responseType = kujira.scheduler.QueryOuterClass.QueryGetHookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kujira.scheduler.QueryOuterClass.QueryGetHookRequest,
      kujira.scheduler.QueryOuterClass.QueryGetHookResponse> getHookMethod() {
    io.grpc.MethodDescriptor<kujira.scheduler.QueryOuterClass.QueryGetHookRequest, kujira.scheduler.QueryOuterClass.QueryGetHookResponse> getHookMethod;
    if ((getHookMethod = QueryGrpc.getHookMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getHookMethod = QueryGrpc.getHookMethod) == null) {
          QueryGrpc.getHookMethod = getHookMethod =
              io.grpc.MethodDescriptor.<kujira.scheduler.QueryOuterClass.QueryGetHookRequest, kujira.scheduler.QueryOuterClass.QueryGetHookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Hook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kujira.scheduler.QueryOuterClass.QueryGetHookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kujira.scheduler.QueryOuterClass.QueryGetHookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Hook"))
              .build();
        }
      }
    }
    return getHookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kujira.scheduler.QueryOuterClass.QueryAllHookRequest,
      kujira.scheduler.QueryOuterClass.QueryAllHookResponse> getHookAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HookAll",
      requestType = kujira.scheduler.QueryOuterClass.QueryAllHookRequest.class,
      responseType = kujira.scheduler.QueryOuterClass.QueryAllHookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kujira.scheduler.QueryOuterClass.QueryAllHookRequest,
      kujira.scheduler.QueryOuterClass.QueryAllHookResponse> getHookAllMethod() {
    io.grpc.MethodDescriptor<kujira.scheduler.QueryOuterClass.QueryAllHookRequest, kujira.scheduler.QueryOuterClass.QueryAllHookResponse> getHookAllMethod;
    if ((getHookAllMethod = QueryGrpc.getHookAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getHookAllMethod = QueryGrpc.getHookAllMethod) == null) {
          QueryGrpc.getHookAllMethod = getHookAllMethod =
              io.grpc.MethodDescriptor.<kujira.scheduler.QueryOuterClass.QueryAllHookRequest, kujira.scheduler.QueryOuterClass.QueryAllHookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HookAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kujira.scheduler.QueryOuterClass.QueryAllHookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kujira.scheduler.QueryOuterClass.QueryAllHookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("HookAll"))
              .build();
        }
      }
    }
    return getHookAllMethod;
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
     * Parameters queries the parameters of the module.
     * </pre>
     */
    public void params(kujira.scheduler.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<kujira.scheduler.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a Hook by id.
     * </pre>
     */
    public void hook(kujira.scheduler.QueryOuterClass.QueryGetHookRequest request,
        io.grpc.stub.StreamObserver<kujira.scheduler.QueryOuterClass.QueryGetHookResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHookMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Hook items.
     * </pre>
     */
    public void hookAll(kujira.scheduler.QueryOuterClass.QueryAllHookRequest request,
        io.grpc.stub.StreamObserver<kujira.scheduler.QueryOuterClass.QueryAllHookResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHookAllMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kujira.scheduler.QueryOuterClass.QueryParamsRequest,
                kujira.scheduler.QueryOuterClass.QueryParamsResponse>(
                  this, METHODID_PARAMS)))
          .addMethod(
            getHookMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kujira.scheduler.QueryOuterClass.QueryGetHookRequest,
                kujira.scheduler.QueryOuterClass.QueryGetHookResponse>(
                  this, METHODID_HOOK)))
          .addMethod(
            getHookAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kujira.scheduler.QueryOuterClass.QueryAllHookRequest,
                kujira.scheduler.QueryOuterClass.QueryAllHookResponse>(
                  this, METHODID_HOOK_ALL)))
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
     * Parameters queries the parameters of the module.
     * </pre>
     */
    public void params(kujira.scheduler.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<kujira.scheduler.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a Hook by id.
     * </pre>
     */
    public void hook(kujira.scheduler.QueryOuterClass.QueryGetHookRequest request,
        io.grpc.stub.StreamObserver<kujira.scheduler.QueryOuterClass.QueryGetHookResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Hook items.
     * </pre>
     */
    public void hookAll(kujira.scheduler.QueryOuterClass.QueryAllHookRequest request,
        io.grpc.stub.StreamObserver<kujira.scheduler.QueryOuterClass.QueryAllHookResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHookAllMethod(), getCallOptions()), request, responseObserver);
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
     * Parameters queries the parameters of the module.
     * </pre>
     */
    public kujira.scheduler.QueryOuterClass.QueryParamsResponse params(kujira.scheduler.QueryOuterClass.QueryParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a Hook by id.
     * </pre>
     */
    public kujira.scheduler.QueryOuterClass.QueryGetHookResponse hook(kujira.scheduler.QueryOuterClass.QueryGetHookRequest request) {
      return blockingUnaryCall(
          getChannel(), getHookMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of Hook items.
     * </pre>
     */
    public kujira.scheduler.QueryOuterClass.QueryAllHookResponse hookAll(kujira.scheduler.QueryOuterClass.QueryAllHookRequest request) {
      return blockingUnaryCall(
          getChannel(), getHookAllMethod(), getCallOptions(), request);
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
     * Parameters queries the parameters of the module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kujira.scheduler.QueryOuterClass.QueryParamsResponse> params(
        kujira.scheduler.QueryOuterClass.QueryParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a Hook by id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kujira.scheduler.QueryOuterClass.QueryGetHookResponse> hook(
        kujira.scheduler.QueryOuterClass.QueryGetHookRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHookMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of Hook items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kujira.scheduler.QueryOuterClass.QueryAllHookResponse> hookAll(
        kujira.scheduler.QueryOuterClass.QueryAllHookRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHookAllMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_HOOK = 1;
  private static final int METHODID_HOOK_ALL = 2;

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
          serviceImpl.params((kujira.scheduler.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<kujira.scheduler.QueryOuterClass.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_HOOK:
          serviceImpl.hook((kujira.scheduler.QueryOuterClass.QueryGetHookRequest) request,
              (io.grpc.stub.StreamObserver<kujira.scheduler.QueryOuterClass.QueryGetHookResponse>) responseObserver);
          break;
        case METHODID_HOOK_ALL:
          serviceImpl.hookAll((kujira.scheduler.QueryOuterClass.QueryAllHookRequest) request,
              (io.grpc.stub.StreamObserver<kujira.scheduler.QueryOuterClass.QueryAllHookResponse>) responseObserver);
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
      return kujira.scheduler.QueryOuterClass.getDescriptor();
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
              .addMethod(getHookMethod())
              .addMethod(getHookAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}
