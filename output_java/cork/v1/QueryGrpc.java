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
 * Query defines the gRPC query service for the cork module.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: sommelier/cork/v1/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "cork.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cork.v1.QueryOuterClass.QueryParamsRequest,
      cork.v1.QueryOuterClass.QueryParamsResponse> getQueryParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryParams",
      requestType = cork.v1.QueryOuterClass.QueryParamsRequest.class,
      responseType = cork.v1.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cork.v1.QueryOuterClass.QueryParamsRequest,
      cork.v1.QueryOuterClass.QueryParamsResponse> getQueryParamsMethod() {
    io.grpc.MethodDescriptor<cork.v1.QueryOuterClass.QueryParamsRequest, cork.v1.QueryOuterClass.QueryParamsResponse> getQueryParamsMethod;
    if ((getQueryParamsMethod = QueryGrpc.getQueryParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryParamsMethod = QueryGrpc.getQueryParamsMethod) == null) {
          QueryGrpc.getQueryParamsMethod = getQueryParamsMethod =
              io.grpc.MethodDescriptor.<cork.v1.QueryOuterClass.QueryParamsRequest, cork.v1.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cork.v1.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cork.v1.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryParams"))
              .build();
        }
      }
    }
    return getQueryParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cork.v1.QueryOuterClass.QuerySubmittedCorksRequest,
      cork.v1.QueryOuterClass.QuerySubmittedCorksResponse> getQuerySubmittedCorksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QuerySubmittedCorks",
      requestType = cork.v1.QueryOuterClass.QuerySubmittedCorksRequest.class,
      responseType = cork.v1.QueryOuterClass.QuerySubmittedCorksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cork.v1.QueryOuterClass.QuerySubmittedCorksRequest,
      cork.v1.QueryOuterClass.QuerySubmittedCorksResponse> getQuerySubmittedCorksMethod() {
    io.grpc.MethodDescriptor<cork.v1.QueryOuterClass.QuerySubmittedCorksRequest, cork.v1.QueryOuterClass.QuerySubmittedCorksResponse> getQuerySubmittedCorksMethod;
    if ((getQuerySubmittedCorksMethod = QueryGrpc.getQuerySubmittedCorksMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQuerySubmittedCorksMethod = QueryGrpc.getQuerySubmittedCorksMethod) == null) {
          QueryGrpc.getQuerySubmittedCorksMethod = getQuerySubmittedCorksMethod =
              io.grpc.MethodDescriptor.<cork.v1.QueryOuterClass.QuerySubmittedCorksRequest, cork.v1.QueryOuterClass.QuerySubmittedCorksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QuerySubmittedCorks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cork.v1.QueryOuterClass.QuerySubmittedCorksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cork.v1.QueryOuterClass.QuerySubmittedCorksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QuerySubmittedCorks"))
              .build();
        }
      }
    }
    return getQuerySubmittedCorksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cork.v1.QueryOuterClass.QueryCommitPeriodRequest,
      cork.v1.QueryOuterClass.QueryCommitPeriodResponse> getQueryCommitPeriodMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryCommitPeriod",
      requestType = cork.v1.QueryOuterClass.QueryCommitPeriodRequest.class,
      responseType = cork.v1.QueryOuterClass.QueryCommitPeriodResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cork.v1.QueryOuterClass.QueryCommitPeriodRequest,
      cork.v1.QueryOuterClass.QueryCommitPeriodResponse> getQueryCommitPeriodMethod() {
    io.grpc.MethodDescriptor<cork.v1.QueryOuterClass.QueryCommitPeriodRequest, cork.v1.QueryOuterClass.QueryCommitPeriodResponse> getQueryCommitPeriodMethod;
    if ((getQueryCommitPeriodMethod = QueryGrpc.getQueryCommitPeriodMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryCommitPeriodMethod = QueryGrpc.getQueryCommitPeriodMethod) == null) {
          QueryGrpc.getQueryCommitPeriodMethod = getQueryCommitPeriodMethod =
              io.grpc.MethodDescriptor.<cork.v1.QueryOuterClass.QueryCommitPeriodRequest, cork.v1.QueryOuterClass.QueryCommitPeriodResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryCommitPeriod"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cork.v1.QueryOuterClass.QueryCommitPeriodRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cork.v1.QueryOuterClass.QueryCommitPeriodResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryCommitPeriod"))
              .build();
        }
      }
    }
    return getQueryCommitPeriodMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cork.v1.QueryOuterClass.QueryCellarIDsRequest,
      cork.v1.QueryOuterClass.QueryCellarIDsResponse> getQueryCellarIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryCellarIDs",
      requestType = cork.v1.QueryOuterClass.QueryCellarIDsRequest.class,
      responseType = cork.v1.QueryOuterClass.QueryCellarIDsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cork.v1.QueryOuterClass.QueryCellarIDsRequest,
      cork.v1.QueryOuterClass.QueryCellarIDsResponse> getQueryCellarIDsMethod() {
    io.grpc.MethodDescriptor<cork.v1.QueryOuterClass.QueryCellarIDsRequest, cork.v1.QueryOuterClass.QueryCellarIDsResponse> getQueryCellarIDsMethod;
    if ((getQueryCellarIDsMethod = QueryGrpc.getQueryCellarIDsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryCellarIDsMethod = QueryGrpc.getQueryCellarIDsMethod) == null) {
          QueryGrpc.getQueryCellarIDsMethod = getQueryCellarIDsMethod =
              io.grpc.MethodDescriptor.<cork.v1.QueryOuterClass.QueryCellarIDsRequest, cork.v1.QueryOuterClass.QueryCellarIDsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryCellarIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cork.v1.QueryOuterClass.QueryCellarIDsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cork.v1.QueryOuterClass.QueryCellarIDsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryCellarIDs"))
              .build();
        }
      }
    }
    return getQueryCellarIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cork.v1.QueryOuterClass.QueryScheduledCorksRequest,
      cork.v1.QueryOuterClass.QueryScheduledCorksResponse> getQueryScheduledCorksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryScheduledCorks",
      requestType = cork.v1.QueryOuterClass.QueryScheduledCorksRequest.class,
      responseType = cork.v1.QueryOuterClass.QueryScheduledCorksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cork.v1.QueryOuterClass.QueryScheduledCorksRequest,
      cork.v1.QueryOuterClass.QueryScheduledCorksResponse> getQueryScheduledCorksMethod() {
    io.grpc.MethodDescriptor<cork.v1.QueryOuterClass.QueryScheduledCorksRequest, cork.v1.QueryOuterClass.QueryScheduledCorksResponse> getQueryScheduledCorksMethod;
    if ((getQueryScheduledCorksMethod = QueryGrpc.getQueryScheduledCorksMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryScheduledCorksMethod = QueryGrpc.getQueryScheduledCorksMethod) == null) {
          QueryGrpc.getQueryScheduledCorksMethod = getQueryScheduledCorksMethod =
              io.grpc.MethodDescriptor.<cork.v1.QueryOuterClass.QueryScheduledCorksRequest, cork.v1.QueryOuterClass.QueryScheduledCorksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryScheduledCorks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cork.v1.QueryOuterClass.QueryScheduledCorksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cork.v1.QueryOuterClass.QueryScheduledCorksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryScheduledCorks"))
              .build();
        }
      }
    }
    return getQueryScheduledCorksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cork.v1.QueryOuterClass.QueryScheduledBlockHeightsRequest,
      cork.v1.QueryOuterClass.QueryScheduledBlockHeightsResponse> getQueryScheduledBlockHeightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryScheduledBlockHeights",
      requestType = cork.v1.QueryOuterClass.QueryScheduledBlockHeightsRequest.class,
      responseType = cork.v1.QueryOuterClass.QueryScheduledBlockHeightsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cork.v1.QueryOuterClass.QueryScheduledBlockHeightsRequest,
      cork.v1.QueryOuterClass.QueryScheduledBlockHeightsResponse> getQueryScheduledBlockHeightsMethod() {
    io.grpc.MethodDescriptor<cork.v1.QueryOuterClass.QueryScheduledBlockHeightsRequest, cork.v1.QueryOuterClass.QueryScheduledBlockHeightsResponse> getQueryScheduledBlockHeightsMethod;
    if ((getQueryScheduledBlockHeightsMethod = QueryGrpc.getQueryScheduledBlockHeightsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryScheduledBlockHeightsMethod = QueryGrpc.getQueryScheduledBlockHeightsMethod) == null) {
          QueryGrpc.getQueryScheduledBlockHeightsMethod = getQueryScheduledBlockHeightsMethod =
              io.grpc.MethodDescriptor.<cork.v1.QueryOuterClass.QueryScheduledBlockHeightsRequest, cork.v1.QueryOuterClass.QueryScheduledBlockHeightsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryScheduledBlockHeights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cork.v1.QueryOuterClass.QueryScheduledBlockHeightsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cork.v1.QueryOuterClass.QueryScheduledBlockHeightsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryScheduledBlockHeights"))
              .build();
        }
      }
    }
    return getQueryScheduledBlockHeightsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cork.v1.QueryOuterClass.QueryScheduledCorksByBlockHeightRequest,
      cork.v1.QueryOuterClass.QueryScheduledCorksByBlockHeightResponse> getQueryScheduledCorksByBlockHeightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryScheduledCorksByBlockHeight",
      requestType = cork.v1.QueryOuterClass.QueryScheduledCorksByBlockHeightRequest.class,
      responseType = cork.v1.QueryOuterClass.QueryScheduledCorksByBlockHeightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cork.v1.QueryOuterClass.QueryScheduledCorksByBlockHeightRequest,
      cork.v1.QueryOuterClass.QueryScheduledCorksByBlockHeightResponse> getQueryScheduledCorksByBlockHeightMethod() {
    io.grpc.MethodDescriptor<cork.v1.QueryOuterClass.QueryScheduledCorksByBlockHeightRequest, cork.v1.QueryOuterClass.QueryScheduledCorksByBlockHeightResponse> getQueryScheduledCorksByBlockHeightMethod;
    if ((getQueryScheduledCorksByBlockHeightMethod = QueryGrpc.getQueryScheduledCorksByBlockHeightMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryScheduledCorksByBlockHeightMethod = QueryGrpc.getQueryScheduledCorksByBlockHeightMethod) == null) {
          QueryGrpc.getQueryScheduledCorksByBlockHeightMethod = getQueryScheduledCorksByBlockHeightMethod =
              io.grpc.MethodDescriptor.<cork.v1.QueryOuterClass.QueryScheduledCorksByBlockHeightRequest, cork.v1.QueryOuterClass.QueryScheduledCorksByBlockHeightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryScheduledCorksByBlockHeight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cork.v1.QueryOuterClass.QueryScheduledCorksByBlockHeightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cork.v1.QueryOuterClass.QueryScheduledCorksByBlockHeightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryScheduledCorksByBlockHeight"))
              .build();
        }
      }
    }
    return getQueryScheduledCorksByBlockHeightMethod;
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
   * Query defines the gRPC query service for the cork module.
   * </pre>
   */
  public static abstract class QueryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * QueryParams queries the allocation module parameters.
     * </pre>
     */
    public void queryParams(cork.v1.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<cork.v1.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * QuerySubmittedCorks queries the submitted corks awaiting vote
     * </pre>
     */
    public void querySubmittedCorks(cork.v1.QueryOuterClass.QuerySubmittedCorksRequest request,
        io.grpc.stub.StreamObserver<cork.v1.QueryOuterClass.QuerySubmittedCorksResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQuerySubmittedCorksMethod(), responseObserver);
    }

    /**
     * <pre>
     * QueryCommitPeriod queries the heights for the current voting period (current, start and end)
     * </pre>
     */
    public void queryCommitPeriod(cork.v1.QueryOuterClass.QueryCommitPeriodRequest request,
        io.grpc.stub.StreamObserver<cork.v1.QueryOuterClass.QueryCommitPeriodResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryCommitPeriodMethod(), responseObserver);
    }

    /**
     * <pre>
     * QueryCellarIDs returns all cellars and current tick ranges
     * </pre>
     */
    public void queryCellarIDs(cork.v1.QueryOuterClass.QueryCellarIDsRequest request,
        io.grpc.stub.StreamObserver<cork.v1.QueryOuterClass.QueryCellarIDsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryCellarIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * QueryScheduledCorks returns all scheduled corks
     * </pre>
     */
    public void queryScheduledCorks(cork.v1.QueryOuterClass.QueryScheduledCorksRequest request,
        io.grpc.stub.StreamObserver<cork.v1.QueryOuterClass.QueryScheduledCorksResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryScheduledCorksMethod(), responseObserver);
    }

    /**
     * <pre>
     * QueryScheduledBlockHeights returns all scheduled block heights
     * </pre>
     */
    public void queryScheduledBlockHeights(cork.v1.QueryOuterClass.QueryScheduledBlockHeightsRequest request,
        io.grpc.stub.StreamObserver<cork.v1.QueryOuterClass.QueryScheduledBlockHeightsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryScheduledBlockHeightsMethod(), responseObserver);
    }

    /**
     * <pre>
     * QueryScheduledCorks returns all scheduled corks at a block height
     * </pre>
     */
    public void queryScheduledCorksByBlockHeight(cork.v1.QueryOuterClass.QueryScheduledCorksByBlockHeightRequest request,
        io.grpc.stub.StreamObserver<cork.v1.QueryOuterClass.QueryScheduledCorksByBlockHeightResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryScheduledCorksByBlockHeightMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getQueryParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cork.v1.QueryOuterClass.QueryParamsRequest,
                cork.v1.QueryOuterClass.QueryParamsResponse>(
                  this, METHODID_QUERY_PARAMS)))
          .addMethod(
            getQuerySubmittedCorksMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cork.v1.QueryOuterClass.QuerySubmittedCorksRequest,
                cork.v1.QueryOuterClass.QuerySubmittedCorksResponse>(
                  this, METHODID_QUERY_SUBMITTED_CORKS)))
          .addMethod(
            getQueryCommitPeriodMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cork.v1.QueryOuterClass.QueryCommitPeriodRequest,
                cork.v1.QueryOuterClass.QueryCommitPeriodResponse>(
                  this, METHODID_QUERY_COMMIT_PERIOD)))
          .addMethod(
            getQueryCellarIDsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cork.v1.QueryOuterClass.QueryCellarIDsRequest,
                cork.v1.QueryOuterClass.QueryCellarIDsResponse>(
                  this, METHODID_QUERY_CELLAR_IDS)))
          .addMethod(
            getQueryScheduledCorksMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cork.v1.QueryOuterClass.QueryScheduledCorksRequest,
                cork.v1.QueryOuterClass.QueryScheduledCorksResponse>(
                  this, METHODID_QUERY_SCHEDULED_CORKS)))
          .addMethod(
            getQueryScheduledBlockHeightsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cork.v1.QueryOuterClass.QueryScheduledBlockHeightsRequest,
                cork.v1.QueryOuterClass.QueryScheduledBlockHeightsResponse>(
                  this, METHODID_QUERY_SCHEDULED_BLOCK_HEIGHTS)))
          .addMethod(
            getQueryScheduledCorksByBlockHeightMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cork.v1.QueryOuterClass.QueryScheduledCorksByBlockHeightRequest,
                cork.v1.QueryOuterClass.QueryScheduledCorksByBlockHeightResponse>(
                  this, METHODID_QUERY_SCHEDULED_CORKS_BY_BLOCK_HEIGHT)))
          .build();
    }
  }

  /**
   * <pre>
   * Query defines the gRPC query service for the cork module.
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
     * QueryParams queries the allocation module parameters.
     * </pre>
     */
    public void queryParams(cork.v1.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<cork.v1.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * QuerySubmittedCorks queries the submitted corks awaiting vote
     * </pre>
     */
    public void querySubmittedCorks(cork.v1.QueryOuterClass.QuerySubmittedCorksRequest request,
        io.grpc.stub.StreamObserver<cork.v1.QueryOuterClass.QuerySubmittedCorksResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQuerySubmittedCorksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * QueryCommitPeriod queries the heights for the current voting period (current, start and end)
     * </pre>
     */
    public void queryCommitPeriod(cork.v1.QueryOuterClass.QueryCommitPeriodRequest request,
        io.grpc.stub.StreamObserver<cork.v1.QueryOuterClass.QueryCommitPeriodResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryCommitPeriodMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * QueryCellarIDs returns all cellars and current tick ranges
     * </pre>
     */
    public void queryCellarIDs(cork.v1.QueryOuterClass.QueryCellarIDsRequest request,
        io.grpc.stub.StreamObserver<cork.v1.QueryOuterClass.QueryCellarIDsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryCellarIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * QueryScheduledCorks returns all scheduled corks
     * </pre>
     */
    public void queryScheduledCorks(cork.v1.QueryOuterClass.QueryScheduledCorksRequest request,
        io.grpc.stub.StreamObserver<cork.v1.QueryOuterClass.QueryScheduledCorksResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryScheduledCorksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * QueryScheduledBlockHeights returns all scheduled block heights
     * </pre>
     */
    public void queryScheduledBlockHeights(cork.v1.QueryOuterClass.QueryScheduledBlockHeightsRequest request,
        io.grpc.stub.StreamObserver<cork.v1.QueryOuterClass.QueryScheduledBlockHeightsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryScheduledBlockHeightsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * QueryScheduledCorks returns all scheduled corks at a block height
     * </pre>
     */
    public void queryScheduledCorksByBlockHeight(cork.v1.QueryOuterClass.QueryScheduledCorksByBlockHeightRequest request,
        io.grpc.stub.StreamObserver<cork.v1.QueryOuterClass.QueryScheduledCorksByBlockHeightResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryScheduledCorksByBlockHeightMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Query defines the gRPC query service for the cork module.
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
     * QueryParams queries the allocation module parameters.
     * </pre>
     */
    public cork.v1.QueryOuterClass.QueryParamsResponse queryParams(cork.v1.QueryOuterClass.QueryParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getQueryParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * QuerySubmittedCorks queries the submitted corks awaiting vote
     * </pre>
     */
    public cork.v1.QueryOuterClass.QuerySubmittedCorksResponse querySubmittedCorks(cork.v1.QueryOuterClass.QuerySubmittedCorksRequest request) {
      return blockingUnaryCall(
          getChannel(), getQuerySubmittedCorksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * QueryCommitPeriod queries the heights for the current voting period (current, start and end)
     * </pre>
     */
    public cork.v1.QueryOuterClass.QueryCommitPeriodResponse queryCommitPeriod(cork.v1.QueryOuterClass.QueryCommitPeriodRequest request) {
      return blockingUnaryCall(
          getChannel(), getQueryCommitPeriodMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * QueryCellarIDs returns all cellars and current tick ranges
     * </pre>
     */
    public cork.v1.QueryOuterClass.QueryCellarIDsResponse queryCellarIDs(cork.v1.QueryOuterClass.QueryCellarIDsRequest request) {
      return blockingUnaryCall(
          getChannel(), getQueryCellarIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * QueryScheduledCorks returns all scheduled corks
     * </pre>
     */
    public cork.v1.QueryOuterClass.QueryScheduledCorksResponse queryScheduledCorks(cork.v1.QueryOuterClass.QueryScheduledCorksRequest request) {
      return blockingUnaryCall(
          getChannel(), getQueryScheduledCorksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * QueryScheduledBlockHeights returns all scheduled block heights
     * </pre>
     */
    public cork.v1.QueryOuterClass.QueryScheduledBlockHeightsResponse queryScheduledBlockHeights(cork.v1.QueryOuterClass.QueryScheduledBlockHeightsRequest request) {
      return blockingUnaryCall(
          getChannel(), getQueryScheduledBlockHeightsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * QueryScheduledCorks returns all scheduled corks at a block height
     * </pre>
     */
    public cork.v1.QueryOuterClass.QueryScheduledCorksByBlockHeightResponse queryScheduledCorksByBlockHeight(cork.v1.QueryOuterClass.QueryScheduledCorksByBlockHeightRequest request) {
      return blockingUnaryCall(
          getChannel(), getQueryScheduledCorksByBlockHeightMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Query defines the gRPC query service for the cork module.
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
     * QueryParams queries the allocation module parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cork.v1.QueryOuterClass.QueryParamsResponse> queryParams(
        cork.v1.QueryOuterClass.QueryParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * QuerySubmittedCorks queries the submitted corks awaiting vote
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cork.v1.QueryOuterClass.QuerySubmittedCorksResponse> querySubmittedCorks(
        cork.v1.QueryOuterClass.QuerySubmittedCorksRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQuerySubmittedCorksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * QueryCommitPeriod queries the heights for the current voting period (current, start and end)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cork.v1.QueryOuterClass.QueryCommitPeriodResponse> queryCommitPeriod(
        cork.v1.QueryOuterClass.QueryCommitPeriodRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryCommitPeriodMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * QueryCellarIDs returns all cellars and current tick ranges
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cork.v1.QueryOuterClass.QueryCellarIDsResponse> queryCellarIDs(
        cork.v1.QueryOuterClass.QueryCellarIDsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryCellarIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * QueryScheduledCorks returns all scheduled corks
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cork.v1.QueryOuterClass.QueryScheduledCorksResponse> queryScheduledCorks(
        cork.v1.QueryOuterClass.QueryScheduledCorksRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryScheduledCorksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * QueryScheduledBlockHeights returns all scheduled block heights
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cork.v1.QueryOuterClass.QueryScheduledBlockHeightsResponse> queryScheduledBlockHeights(
        cork.v1.QueryOuterClass.QueryScheduledBlockHeightsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryScheduledBlockHeightsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * QueryScheduledCorks returns all scheduled corks at a block height
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cork.v1.QueryOuterClass.QueryScheduledCorksByBlockHeightResponse> queryScheduledCorksByBlockHeight(
        cork.v1.QueryOuterClass.QueryScheduledCorksByBlockHeightRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryScheduledCorksByBlockHeightMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_PARAMS = 0;
  private static final int METHODID_QUERY_SUBMITTED_CORKS = 1;
  private static final int METHODID_QUERY_COMMIT_PERIOD = 2;
  private static final int METHODID_QUERY_CELLAR_IDS = 3;
  private static final int METHODID_QUERY_SCHEDULED_CORKS = 4;
  private static final int METHODID_QUERY_SCHEDULED_BLOCK_HEIGHTS = 5;
  private static final int METHODID_QUERY_SCHEDULED_CORKS_BY_BLOCK_HEIGHT = 6;

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
        case METHODID_QUERY_PARAMS:
          serviceImpl.queryParams((cork.v1.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<cork.v1.QueryOuterClass.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_QUERY_SUBMITTED_CORKS:
          serviceImpl.querySubmittedCorks((cork.v1.QueryOuterClass.QuerySubmittedCorksRequest) request,
              (io.grpc.stub.StreamObserver<cork.v1.QueryOuterClass.QuerySubmittedCorksResponse>) responseObserver);
          break;
        case METHODID_QUERY_COMMIT_PERIOD:
          serviceImpl.queryCommitPeriod((cork.v1.QueryOuterClass.QueryCommitPeriodRequest) request,
              (io.grpc.stub.StreamObserver<cork.v1.QueryOuterClass.QueryCommitPeriodResponse>) responseObserver);
          break;
        case METHODID_QUERY_CELLAR_IDS:
          serviceImpl.queryCellarIDs((cork.v1.QueryOuterClass.QueryCellarIDsRequest) request,
              (io.grpc.stub.StreamObserver<cork.v1.QueryOuterClass.QueryCellarIDsResponse>) responseObserver);
          break;
        case METHODID_QUERY_SCHEDULED_CORKS:
          serviceImpl.queryScheduledCorks((cork.v1.QueryOuterClass.QueryScheduledCorksRequest) request,
              (io.grpc.stub.StreamObserver<cork.v1.QueryOuterClass.QueryScheduledCorksResponse>) responseObserver);
          break;
        case METHODID_QUERY_SCHEDULED_BLOCK_HEIGHTS:
          serviceImpl.queryScheduledBlockHeights((cork.v1.QueryOuterClass.QueryScheduledBlockHeightsRequest) request,
              (io.grpc.stub.StreamObserver<cork.v1.QueryOuterClass.QueryScheduledBlockHeightsResponse>) responseObserver);
          break;
        case METHODID_QUERY_SCHEDULED_CORKS_BY_BLOCK_HEIGHT:
          serviceImpl.queryScheduledCorksByBlockHeight((cork.v1.QueryOuterClass.QueryScheduledCorksByBlockHeightRequest) request,
              (io.grpc.stub.StreamObserver<cork.v1.QueryOuterClass.QueryScheduledCorksByBlockHeightResponse>) responseObserver);
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
      return cork.v1.QueryOuterClass.getDescriptor();
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
              .addMethod(getQueryParamsMethod())
              .addMethod(getQuerySubmittedCorksMethod())
              .addMethod(getQueryCommitPeriodMethod())
              .addMethod(getQueryCellarIDsMethod())
              .addMethod(getQueryScheduledCorksMethod())
              .addMethod(getQueryScheduledBlockHeightsMethod())
              .addMethod(getQueryScheduledCorksByBlockHeightMethod())
              .build();
        }
      }
    }
    return result;
  }
}
