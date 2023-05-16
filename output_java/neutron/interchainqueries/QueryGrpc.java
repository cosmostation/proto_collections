package neutron.interchainqueries;

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
    comments = "Source: neutron/interchainqueries/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "neutron.interchainqueries.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<neutron.interchainqueries.QueryOuterClass.QueryParamsRequest,
      neutron.interchainqueries.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = neutron.interchainqueries.QueryOuterClass.QueryParamsRequest.class,
      responseType = neutron.interchainqueries.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<neutron.interchainqueries.QueryOuterClass.QueryParamsRequest,
      neutron.interchainqueries.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<neutron.interchainqueries.QueryOuterClass.QueryParamsRequest, neutron.interchainqueries.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<neutron.interchainqueries.QueryOuterClass.QueryParamsRequest, neutron.interchainqueries.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.interchainqueries.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.interchainqueries.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueriesRequest,
      neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueriesResponse> getRegisteredQueriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisteredQueries",
      requestType = neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueriesRequest.class,
      responseType = neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueriesRequest,
      neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueriesResponse> getRegisteredQueriesMethod() {
    io.grpc.MethodDescriptor<neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueriesRequest, neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueriesResponse> getRegisteredQueriesMethod;
    if ((getRegisteredQueriesMethod = QueryGrpc.getRegisteredQueriesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRegisteredQueriesMethod = QueryGrpc.getRegisteredQueriesMethod) == null) {
          QueryGrpc.getRegisteredQueriesMethod = getRegisteredQueriesMethod =
              io.grpc.MethodDescriptor.<neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueriesRequest, neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisteredQueries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RegisteredQueries"))
              .build();
        }
      }
    }
    return getRegisteredQueriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryRequest,
      neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryResponse> getRegisteredQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisteredQuery",
      requestType = neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryRequest.class,
      responseType = neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryRequest,
      neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryResponse> getRegisteredQueryMethod() {
    io.grpc.MethodDescriptor<neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryRequest, neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryResponse> getRegisteredQueryMethod;
    if ((getRegisteredQueryMethod = QueryGrpc.getRegisteredQueryMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRegisteredQueryMethod = QueryGrpc.getRegisteredQueryMethod) == null) {
          QueryGrpc.getRegisteredQueryMethod = getRegisteredQueryMethod =
              io.grpc.MethodDescriptor.<neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryRequest, neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisteredQuery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RegisteredQuery"))
              .build();
        }
      }
    }
    return getRegisteredQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryResultRequest,
      neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryResultResponse> getQueryResultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryResult",
      requestType = neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryResultRequest.class,
      responseType = neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryResultResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryResultRequest,
      neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryResultResponse> getQueryResultMethod() {
    io.grpc.MethodDescriptor<neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryResultRequest, neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryResultResponse> getQueryResultMethod;
    if ((getQueryResultMethod = QueryGrpc.getQueryResultMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryResultMethod = QueryGrpc.getQueryResultMethod) == null) {
          QueryGrpc.getQueryResultMethod = getQueryResultMethod =
              io.grpc.MethodDescriptor.<neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryResultRequest, neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryResultResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryResult"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryResultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryResultResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryResult"))
              .build();
        }
      }
    }
    return getQueryResultMethod;
  }

  private static volatile io.grpc.MethodDescriptor<neutron.interchainqueries.QueryOuterClass.QueryLastRemoteHeight,
      neutron.interchainqueries.QueryOuterClass.QueryLastRemoteHeightResponse> getLastRemoteHeightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LastRemoteHeight",
      requestType = neutron.interchainqueries.QueryOuterClass.QueryLastRemoteHeight.class,
      responseType = neutron.interchainqueries.QueryOuterClass.QueryLastRemoteHeightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<neutron.interchainqueries.QueryOuterClass.QueryLastRemoteHeight,
      neutron.interchainqueries.QueryOuterClass.QueryLastRemoteHeightResponse> getLastRemoteHeightMethod() {
    io.grpc.MethodDescriptor<neutron.interchainqueries.QueryOuterClass.QueryLastRemoteHeight, neutron.interchainqueries.QueryOuterClass.QueryLastRemoteHeightResponse> getLastRemoteHeightMethod;
    if ((getLastRemoteHeightMethod = QueryGrpc.getLastRemoteHeightMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLastRemoteHeightMethod = QueryGrpc.getLastRemoteHeightMethod) == null) {
          QueryGrpc.getLastRemoteHeightMethod = getLastRemoteHeightMethod =
              io.grpc.MethodDescriptor.<neutron.interchainqueries.QueryOuterClass.QueryLastRemoteHeight, neutron.interchainqueries.QueryOuterClass.QueryLastRemoteHeightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LastRemoteHeight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.interchainqueries.QueryOuterClass.QueryLastRemoteHeight.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.interchainqueries.QueryOuterClass.QueryLastRemoteHeightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LastRemoteHeight"))
              .build();
        }
      }
    }
    return getLastRemoteHeightMethod;
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
    public void params(neutron.interchainqueries.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<neutron.interchainqueries.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     */
    public void registeredQueries(neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueriesRequest request,
        io.grpc.stub.StreamObserver<neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueriesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisteredQueriesMethod(), responseObserver);
    }

    /**
     */
    public void registeredQuery(neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryRequest request,
        io.grpc.stub.StreamObserver<neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisteredQueryMethod(), responseObserver);
    }

    /**
     */
    public void queryResult(neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryResultRequest request,
        io.grpc.stub.StreamObserver<neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryResultResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryResultMethod(), responseObserver);
    }

    /**
     */
    public void lastRemoteHeight(neutron.interchainqueries.QueryOuterClass.QueryLastRemoteHeight request,
        io.grpc.stub.StreamObserver<neutron.interchainqueries.QueryOuterClass.QueryLastRemoteHeightResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLastRemoteHeightMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                neutron.interchainqueries.QueryOuterClass.QueryParamsRequest,
                neutron.interchainqueries.QueryOuterClass.QueryParamsResponse>(
                  this, METHODID_PARAMS)))
          .addMethod(
            getRegisteredQueriesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueriesRequest,
                neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueriesResponse>(
                  this, METHODID_REGISTERED_QUERIES)))
          .addMethod(
            getRegisteredQueryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryRequest,
                neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryResponse>(
                  this, METHODID_REGISTERED_QUERY)))
          .addMethod(
            getQueryResultMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryResultRequest,
                neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryResultResponse>(
                  this, METHODID_QUERY_RESULT)))
          .addMethod(
            getLastRemoteHeightMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                neutron.interchainqueries.QueryOuterClass.QueryLastRemoteHeight,
                neutron.interchainqueries.QueryOuterClass.QueryLastRemoteHeightResponse>(
                  this, METHODID_LAST_REMOTE_HEIGHT)))
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
    public void params(neutron.interchainqueries.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<neutron.interchainqueries.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registeredQueries(neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueriesRequest request,
        io.grpc.stub.StreamObserver<neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueriesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisteredQueriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registeredQuery(neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryRequest request,
        io.grpc.stub.StreamObserver<neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisteredQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryResult(neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryResultRequest request,
        io.grpc.stub.StreamObserver<neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryResultResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryResultMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lastRemoteHeight(neutron.interchainqueries.QueryOuterClass.QueryLastRemoteHeight request,
        io.grpc.stub.StreamObserver<neutron.interchainqueries.QueryOuterClass.QueryLastRemoteHeightResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLastRemoteHeightMethod(), getCallOptions()), request, responseObserver);
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
    public neutron.interchainqueries.QueryOuterClass.QueryParamsResponse params(neutron.interchainqueries.QueryOuterClass.QueryParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueriesResponse registeredQueries(neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueriesRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegisteredQueriesMethod(), getCallOptions(), request);
    }

    /**
     */
    public neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryResponse registeredQuery(neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegisteredQueryMethod(), getCallOptions(), request);
    }

    /**
     */
    public neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryResultResponse queryResult(neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryResultRequest request) {
      return blockingUnaryCall(
          getChannel(), getQueryResultMethod(), getCallOptions(), request);
    }

    /**
     */
    public neutron.interchainqueries.QueryOuterClass.QueryLastRemoteHeightResponse lastRemoteHeight(neutron.interchainqueries.QueryOuterClass.QueryLastRemoteHeight request) {
      return blockingUnaryCall(
          getChannel(), getLastRemoteHeightMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<neutron.interchainqueries.QueryOuterClass.QueryParamsResponse> params(
        neutron.interchainqueries.QueryOuterClass.QueryParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueriesResponse> registeredQueries(
        neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueriesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisteredQueriesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryResponse> registeredQuery(
        neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisteredQueryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryResultResponse> queryResult(
        neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryResultRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryResultMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<neutron.interchainqueries.QueryOuterClass.QueryLastRemoteHeightResponse> lastRemoteHeight(
        neutron.interchainqueries.QueryOuterClass.QueryLastRemoteHeight request) {
      return futureUnaryCall(
          getChannel().newCall(getLastRemoteHeightMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_REGISTERED_QUERIES = 1;
  private static final int METHODID_REGISTERED_QUERY = 2;
  private static final int METHODID_QUERY_RESULT = 3;
  private static final int METHODID_LAST_REMOTE_HEIGHT = 4;

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
          serviceImpl.params((neutron.interchainqueries.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<neutron.interchainqueries.QueryOuterClass.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_REGISTERED_QUERIES:
          serviceImpl.registeredQueries((neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueriesRequest) request,
              (io.grpc.stub.StreamObserver<neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueriesResponse>) responseObserver);
          break;
        case METHODID_REGISTERED_QUERY:
          serviceImpl.registeredQuery((neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryRequest) request,
              (io.grpc.stub.StreamObserver<neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryResponse>) responseObserver);
          break;
        case METHODID_QUERY_RESULT:
          serviceImpl.queryResult((neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryResultRequest) request,
              (io.grpc.stub.StreamObserver<neutron.interchainqueries.QueryOuterClass.QueryRegisteredQueryResultResponse>) responseObserver);
          break;
        case METHODID_LAST_REMOTE_HEIGHT:
          serviceImpl.lastRemoteHeight((neutron.interchainqueries.QueryOuterClass.QueryLastRemoteHeight) request,
              (io.grpc.stub.StreamObserver<neutron.interchainqueries.QueryOuterClass.QueryLastRemoteHeightResponse>) responseObserver);
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
      return neutron.interchainqueries.QueryOuterClass.getDescriptor();
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
              .addMethod(getRegisteredQueriesMethod())
              .addMethod(getRegisteredQueryMethod())
              .addMethod(getQueryResultMethod())
              .addMethod(getLastRemoteHeightMethod())
              .build();
        }
      }
    }
    return result;
  }
}
