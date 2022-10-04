package stafihub.rvalidator;

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
    comments = "Source: stafihub/rvalidator/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "stafihub.stafihub.rvalidator.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<stafihub.rvalidator.QueryOuterClass.QueryParamsRequest,
      stafihub.rvalidator.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = stafihub.rvalidator.QueryOuterClass.QueryParamsRequest.class,
      responseType = stafihub.rvalidator.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.rvalidator.QueryOuterClass.QueryParamsRequest,
      stafihub.rvalidator.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<stafihub.rvalidator.QueryOuterClass.QueryParamsRequest, stafihub.rvalidator.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<stafihub.rvalidator.QueryOuterClass.QueryParamsRequest, stafihub.rvalidator.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.rvalidator.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.rvalidator.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.rvalidator.QueryOuterClass.QueryRValidatorListRequest,
      stafihub.rvalidator.QueryOuterClass.QueryRValidatorListResponse> getRValidatorListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RValidatorList",
      requestType = stafihub.rvalidator.QueryOuterClass.QueryRValidatorListRequest.class,
      responseType = stafihub.rvalidator.QueryOuterClass.QueryRValidatorListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.rvalidator.QueryOuterClass.QueryRValidatorListRequest,
      stafihub.rvalidator.QueryOuterClass.QueryRValidatorListResponse> getRValidatorListMethod() {
    io.grpc.MethodDescriptor<stafihub.rvalidator.QueryOuterClass.QueryRValidatorListRequest, stafihub.rvalidator.QueryOuterClass.QueryRValidatorListResponse> getRValidatorListMethod;
    if ((getRValidatorListMethod = QueryGrpc.getRValidatorListMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRValidatorListMethod = QueryGrpc.getRValidatorListMethod) == null) {
          QueryGrpc.getRValidatorListMethod = getRValidatorListMethod =
              io.grpc.MethodDescriptor.<stafihub.rvalidator.QueryOuterClass.QueryRValidatorListRequest, stafihub.rvalidator.QueryOuterClass.QueryRValidatorListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RValidatorList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.rvalidator.QueryOuterClass.QueryRValidatorListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.rvalidator.QueryOuterClass.QueryRValidatorListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RValidatorList"))
              .build();
        }
      }
    }
    return getRValidatorListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.rvalidator.QueryOuterClass.QueryCycleSecondsRequest,
      stafihub.rvalidator.QueryOuterClass.QueryCycleSecondsResponse> getCycleSecondsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CycleSeconds",
      requestType = stafihub.rvalidator.QueryOuterClass.QueryCycleSecondsRequest.class,
      responseType = stafihub.rvalidator.QueryOuterClass.QueryCycleSecondsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.rvalidator.QueryOuterClass.QueryCycleSecondsRequest,
      stafihub.rvalidator.QueryOuterClass.QueryCycleSecondsResponse> getCycleSecondsMethod() {
    io.grpc.MethodDescriptor<stafihub.rvalidator.QueryOuterClass.QueryCycleSecondsRequest, stafihub.rvalidator.QueryOuterClass.QueryCycleSecondsResponse> getCycleSecondsMethod;
    if ((getCycleSecondsMethod = QueryGrpc.getCycleSecondsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCycleSecondsMethod = QueryGrpc.getCycleSecondsMethod) == null) {
          QueryGrpc.getCycleSecondsMethod = getCycleSecondsMethod =
              io.grpc.MethodDescriptor.<stafihub.rvalidator.QueryOuterClass.QueryCycleSecondsRequest, stafihub.rvalidator.QueryOuterClass.QueryCycleSecondsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CycleSeconds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.rvalidator.QueryOuterClass.QueryCycleSecondsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.rvalidator.QueryOuterClass.QueryCycleSecondsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CycleSeconds"))
              .build();
        }
      }
    }
    return getCycleSecondsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.rvalidator.QueryOuterClass.QueryShuffleSecondsRequest,
      stafihub.rvalidator.QueryOuterClass.QueryShuffleSecondsResponse> getShuffleSecondsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ShuffleSeconds",
      requestType = stafihub.rvalidator.QueryOuterClass.QueryShuffleSecondsRequest.class,
      responseType = stafihub.rvalidator.QueryOuterClass.QueryShuffleSecondsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.rvalidator.QueryOuterClass.QueryShuffleSecondsRequest,
      stafihub.rvalidator.QueryOuterClass.QueryShuffleSecondsResponse> getShuffleSecondsMethod() {
    io.grpc.MethodDescriptor<stafihub.rvalidator.QueryOuterClass.QueryShuffleSecondsRequest, stafihub.rvalidator.QueryOuterClass.QueryShuffleSecondsResponse> getShuffleSecondsMethod;
    if ((getShuffleSecondsMethod = QueryGrpc.getShuffleSecondsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getShuffleSecondsMethod = QueryGrpc.getShuffleSecondsMethod) == null) {
          QueryGrpc.getShuffleSecondsMethod = getShuffleSecondsMethod =
              io.grpc.MethodDescriptor.<stafihub.rvalidator.QueryOuterClass.QueryShuffleSecondsRequest, stafihub.rvalidator.QueryOuterClass.QueryShuffleSecondsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ShuffleSeconds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.rvalidator.QueryOuterClass.QueryShuffleSecondsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.rvalidator.QueryOuterClass.QueryShuffleSecondsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ShuffleSeconds"))
              .build();
        }
      }
    }
    return getShuffleSecondsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.rvalidator.QueryOuterClass.QueryLatestVotedCycleRequest,
      stafihub.rvalidator.QueryOuterClass.QueryLatestVotedCycleResponse> getLatestVotedCycleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LatestVotedCycle",
      requestType = stafihub.rvalidator.QueryOuterClass.QueryLatestVotedCycleRequest.class,
      responseType = stafihub.rvalidator.QueryOuterClass.QueryLatestVotedCycleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.rvalidator.QueryOuterClass.QueryLatestVotedCycleRequest,
      stafihub.rvalidator.QueryOuterClass.QueryLatestVotedCycleResponse> getLatestVotedCycleMethod() {
    io.grpc.MethodDescriptor<stafihub.rvalidator.QueryOuterClass.QueryLatestVotedCycleRequest, stafihub.rvalidator.QueryOuterClass.QueryLatestVotedCycleResponse> getLatestVotedCycleMethod;
    if ((getLatestVotedCycleMethod = QueryGrpc.getLatestVotedCycleMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLatestVotedCycleMethod = QueryGrpc.getLatestVotedCycleMethod) == null) {
          QueryGrpc.getLatestVotedCycleMethod = getLatestVotedCycleMethod =
              io.grpc.MethodDescriptor.<stafihub.rvalidator.QueryOuterClass.QueryLatestVotedCycleRequest, stafihub.rvalidator.QueryOuterClass.QueryLatestVotedCycleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LatestVotedCycle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.rvalidator.QueryOuterClass.QueryLatestVotedCycleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.rvalidator.QueryOuterClass.QueryLatestVotedCycleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LatestVotedCycle"))
              .build();
        }
      }
    }
    return getLatestVotedCycleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.rvalidator.QueryOuterClass.QueryLatestDealedCycleRequest,
      stafihub.rvalidator.QueryOuterClass.QueryLatestDealedCycleResponse> getLatestDealedCycleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LatestDealedCycle",
      requestType = stafihub.rvalidator.QueryOuterClass.QueryLatestDealedCycleRequest.class,
      responseType = stafihub.rvalidator.QueryOuterClass.QueryLatestDealedCycleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.rvalidator.QueryOuterClass.QueryLatestDealedCycleRequest,
      stafihub.rvalidator.QueryOuterClass.QueryLatestDealedCycleResponse> getLatestDealedCycleMethod() {
    io.grpc.MethodDescriptor<stafihub.rvalidator.QueryOuterClass.QueryLatestDealedCycleRequest, stafihub.rvalidator.QueryOuterClass.QueryLatestDealedCycleResponse> getLatestDealedCycleMethod;
    if ((getLatestDealedCycleMethod = QueryGrpc.getLatestDealedCycleMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLatestDealedCycleMethod = QueryGrpc.getLatestDealedCycleMethod) == null) {
          QueryGrpc.getLatestDealedCycleMethod = getLatestDealedCycleMethod =
              io.grpc.MethodDescriptor.<stafihub.rvalidator.QueryOuterClass.QueryLatestDealedCycleRequest, stafihub.rvalidator.QueryOuterClass.QueryLatestDealedCycleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LatestDealedCycle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.rvalidator.QueryOuterClass.QueryLatestDealedCycleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.rvalidator.QueryOuterClass.QueryLatestDealedCycleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LatestDealedCycle"))
              .build();
        }
      }
    }
    return getLatestDealedCycleMethod;
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
    public void params(stafihub.rvalidator.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<stafihub.rvalidator.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of RValidatorList items.
     * </pre>
     */
    public void rValidatorList(stafihub.rvalidator.QueryOuterClass.QueryRValidatorListRequest request,
        io.grpc.stub.StreamObserver<stafihub.rvalidator.QueryOuterClass.QueryRValidatorListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRValidatorListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of CycleSeconds items.
     * </pre>
     */
    public void cycleSeconds(stafihub.rvalidator.QueryOuterClass.QueryCycleSecondsRequest request,
        io.grpc.stub.StreamObserver<stafihub.rvalidator.QueryOuterClass.QueryCycleSecondsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCycleSecondsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ShuffleSeconds items.
     * </pre>
     */
    public void shuffleSeconds(stafihub.rvalidator.QueryOuterClass.QueryShuffleSecondsRequest request,
        io.grpc.stub.StreamObserver<stafihub.rvalidator.QueryOuterClass.QueryShuffleSecondsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getShuffleSecondsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of LatestVotedCycle items.
     * </pre>
     */
    public void latestVotedCycle(stafihub.rvalidator.QueryOuterClass.QueryLatestVotedCycleRequest request,
        io.grpc.stub.StreamObserver<stafihub.rvalidator.QueryOuterClass.QueryLatestVotedCycleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLatestVotedCycleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of LatestDealedCycle items.
     * </pre>
     */
    public void latestDealedCycle(stafihub.rvalidator.QueryOuterClass.QueryLatestDealedCycleRequest request,
        io.grpc.stub.StreamObserver<stafihub.rvalidator.QueryOuterClass.QueryLatestDealedCycleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLatestDealedCycleMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.rvalidator.QueryOuterClass.QueryParamsRequest,
                stafihub.rvalidator.QueryOuterClass.QueryParamsResponse>(
                  this, METHODID_PARAMS)))
          .addMethod(
            getRValidatorListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.rvalidator.QueryOuterClass.QueryRValidatorListRequest,
                stafihub.rvalidator.QueryOuterClass.QueryRValidatorListResponse>(
                  this, METHODID_RVALIDATOR_LIST)))
          .addMethod(
            getCycleSecondsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.rvalidator.QueryOuterClass.QueryCycleSecondsRequest,
                stafihub.rvalidator.QueryOuterClass.QueryCycleSecondsResponse>(
                  this, METHODID_CYCLE_SECONDS)))
          .addMethod(
            getShuffleSecondsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.rvalidator.QueryOuterClass.QueryShuffleSecondsRequest,
                stafihub.rvalidator.QueryOuterClass.QueryShuffleSecondsResponse>(
                  this, METHODID_SHUFFLE_SECONDS)))
          .addMethod(
            getLatestVotedCycleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.rvalidator.QueryOuterClass.QueryLatestVotedCycleRequest,
                stafihub.rvalidator.QueryOuterClass.QueryLatestVotedCycleResponse>(
                  this, METHODID_LATEST_VOTED_CYCLE)))
          .addMethod(
            getLatestDealedCycleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.rvalidator.QueryOuterClass.QueryLatestDealedCycleRequest,
                stafihub.rvalidator.QueryOuterClass.QueryLatestDealedCycleResponse>(
                  this, METHODID_LATEST_DEALED_CYCLE)))
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
    public void params(stafihub.rvalidator.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<stafihub.rvalidator.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of RValidatorList items.
     * </pre>
     */
    public void rValidatorList(stafihub.rvalidator.QueryOuterClass.QueryRValidatorListRequest request,
        io.grpc.stub.StreamObserver<stafihub.rvalidator.QueryOuterClass.QueryRValidatorListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRValidatorListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of CycleSeconds items.
     * </pre>
     */
    public void cycleSeconds(stafihub.rvalidator.QueryOuterClass.QueryCycleSecondsRequest request,
        io.grpc.stub.StreamObserver<stafihub.rvalidator.QueryOuterClass.QueryCycleSecondsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCycleSecondsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ShuffleSeconds items.
     * </pre>
     */
    public void shuffleSeconds(stafihub.rvalidator.QueryOuterClass.QueryShuffleSecondsRequest request,
        io.grpc.stub.StreamObserver<stafihub.rvalidator.QueryOuterClass.QueryShuffleSecondsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getShuffleSecondsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of LatestVotedCycle items.
     * </pre>
     */
    public void latestVotedCycle(stafihub.rvalidator.QueryOuterClass.QueryLatestVotedCycleRequest request,
        io.grpc.stub.StreamObserver<stafihub.rvalidator.QueryOuterClass.QueryLatestVotedCycleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLatestVotedCycleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of LatestDealedCycle items.
     * </pre>
     */
    public void latestDealedCycle(stafihub.rvalidator.QueryOuterClass.QueryLatestDealedCycleRequest request,
        io.grpc.stub.StreamObserver<stafihub.rvalidator.QueryOuterClass.QueryLatestDealedCycleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLatestDealedCycleMethod(), getCallOptions()), request, responseObserver);
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
    public stafihub.rvalidator.QueryOuterClass.QueryParamsResponse params(stafihub.rvalidator.QueryOuterClass.QueryParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of RValidatorList items.
     * </pre>
     */
    public stafihub.rvalidator.QueryOuterClass.QueryRValidatorListResponse rValidatorList(stafihub.rvalidator.QueryOuterClass.QueryRValidatorListRequest request) {
      return blockingUnaryCall(
          getChannel(), getRValidatorListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of CycleSeconds items.
     * </pre>
     */
    public stafihub.rvalidator.QueryOuterClass.QueryCycleSecondsResponse cycleSeconds(stafihub.rvalidator.QueryOuterClass.QueryCycleSecondsRequest request) {
      return blockingUnaryCall(
          getChannel(), getCycleSecondsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of ShuffleSeconds items.
     * </pre>
     */
    public stafihub.rvalidator.QueryOuterClass.QueryShuffleSecondsResponse shuffleSeconds(stafihub.rvalidator.QueryOuterClass.QueryShuffleSecondsRequest request) {
      return blockingUnaryCall(
          getChannel(), getShuffleSecondsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of LatestVotedCycle items.
     * </pre>
     */
    public stafihub.rvalidator.QueryOuterClass.QueryLatestVotedCycleResponse latestVotedCycle(stafihub.rvalidator.QueryOuterClass.QueryLatestVotedCycleRequest request) {
      return blockingUnaryCall(
          getChannel(), getLatestVotedCycleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of LatestDealedCycle items.
     * </pre>
     */
    public stafihub.rvalidator.QueryOuterClass.QueryLatestDealedCycleResponse latestDealedCycle(stafihub.rvalidator.QueryOuterClass.QueryLatestDealedCycleRequest request) {
      return blockingUnaryCall(
          getChannel(), getLatestDealedCycleMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<stafihub.rvalidator.QueryOuterClass.QueryParamsResponse> params(
        stafihub.rvalidator.QueryOuterClass.QueryParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of RValidatorList items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.rvalidator.QueryOuterClass.QueryRValidatorListResponse> rValidatorList(
        stafihub.rvalidator.QueryOuterClass.QueryRValidatorListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRValidatorListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of CycleSeconds items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.rvalidator.QueryOuterClass.QueryCycleSecondsResponse> cycleSeconds(
        stafihub.rvalidator.QueryOuterClass.QueryCycleSecondsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCycleSecondsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of ShuffleSeconds items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.rvalidator.QueryOuterClass.QueryShuffleSecondsResponse> shuffleSeconds(
        stafihub.rvalidator.QueryOuterClass.QueryShuffleSecondsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getShuffleSecondsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of LatestVotedCycle items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.rvalidator.QueryOuterClass.QueryLatestVotedCycleResponse> latestVotedCycle(
        stafihub.rvalidator.QueryOuterClass.QueryLatestVotedCycleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLatestVotedCycleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of LatestDealedCycle items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.rvalidator.QueryOuterClass.QueryLatestDealedCycleResponse> latestDealedCycle(
        stafihub.rvalidator.QueryOuterClass.QueryLatestDealedCycleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLatestDealedCycleMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_RVALIDATOR_LIST = 1;
  private static final int METHODID_CYCLE_SECONDS = 2;
  private static final int METHODID_SHUFFLE_SECONDS = 3;
  private static final int METHODID_LATEST_VOTED_CYCLE = 4;
  private static final int METHODID_LATEST_DEALED_CYCLE = 5;

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
          serviceImpl.params((stafihub.rvalidator.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.rvalidator.QueryOuterClass.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_RVALIDATOR_LIST:
          serviceImpl.rValidatorList((stafihub.rvalidator.QueryOuterClass.QueryRValidatorListRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.rvalidator.QueryOuterClass.QueryRValidatorListResponse>) responseObserver);
          break;
        case METHODID_CYCLE_SECONDS:
          serviceImpl.cycleSeconds((stafihub.rvalidator.QueryOuterClass.QueryCycleSecondsRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.rvalidator.QueryOuterClass.QueryCycleSecondsResponse>) responseObserver);
          break;
        case METHODID_SHUFFLE_SECONDS:
          serviceImpl.shuffleSeconds((stafihub.rvalidator.QueryOuterClass.QueryShuffleSecondsRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.rvalidator.QueryOuterClass.QueryShuffleSecondsResponse>) responseObserver);
          break;
        case METHODID_LATEST_VOTED_CYCLE:
          serviceImpl.latestVotedCycle((stafihub.rvalidator.QueryOuterClass.QueryLatestVotedCycleRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.rvalidator.QueryOuterClass.QueryLatestVotedCycleResponse>) responseObserver);
          break;
        case METHODID_LATEST_DEALED_CYCLE:
          serviceImpl.latestDealedCycle((stafihub.rvalidator.QueryOuterClass.QueryLatestDealedCycleRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.rvalidator.QueryOuterClass.QueryLatestDealedCycleResponse>) responseObserver);
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
      return stafihub.rvalidator.QueryOuterClass.getDescriptor();
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
              .addMethod(getRValidatorListMethod())
              .addMethod(getCycleSecondsMethod())
              .addMethod(getShuffleSecondsMethod())
              .addMethod(getLatestVotedCycleMethod())
              .addMethod(getLatestDealedCycleMethod())
              .build();
        }
      }
    }
    return result;
  }
}
