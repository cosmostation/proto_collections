package quasarlabs.quasarnode.qoracle.osmosis;

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
    comments = "Source: quasar/qoracle/osmosis/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "quasarlabs.quasarnode.qoracle.osmosis.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryParamsRequest,
      quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryParamsRequest.class,
      responseType = quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryParamsRequest,
      quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryParamsRequest, quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryParamsRequest, quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryStateRequest,
      quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryStateResponse> getStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "State",
      requestType = quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryStateRequest.class,
      responseType = quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryStateRequest,
      quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryStateResponse> getStateMethod() {
    io.grpc.MethodDescriptor<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryStateRequest, quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryStateResponse> getStateMethod;
    if ((getStateMethod = QueryGrpc.getStateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getStateMethod = QueryGrpc.getStateMethod) == null) {
          QueryGrpc.getStateMethod = getStateMethod =
              io.grpc.MethodDescriptor.<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryStateRequest, quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "State"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("State"))
              .build();
        }
      }
    }
    return getStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryChainParamsRequest,
      quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryChainParamsResponse> getChainParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChainParams",
      requestType = quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryChainParamsRequest.class,
      responseType = quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryChainParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryChainParamsRequest,
      quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryChainParamsResponse> getChainParamsMethod() {
    io.grpc.MethodDescriptor<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryChainParamsRequest, quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryChainParamsResponse> getChainParamsMethod;
    if ((getChainParamsMethod = QueryGrpc.getChainParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getChainParamsMethod = QueryGrpc.getChainParamsMethod) == null) {
          QueryGrpc.getChainParamsMethod = getChainParamsMethod =
              io.grpc.MethodDescriptor.<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryChainParamsRequest, quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryChainParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChainParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryChainParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryChainParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ChainParams"))
              .build();
        }
      }
    }
    return getChainParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryIncentivizedPoolsRequest,
      quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryIncentivizedPoolsResponse> getIncentivizedPoolsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IncentivizedPools",
      requestType = quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryIncentivizedPoolsRequest.class,
      responseType = quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryIncentivizedPoolsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryIncentivizedPoolsRequest,
      quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryIncentivizedPoolsResponse> getIncentivizedPoolsMethod() {
    io.grpc.MethodDescriptor<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryIncentivizedPoolsRequest, quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryIncentivizedPoolsResponse> getIncentivizedPoolsMethod;
    if ((getIncentivizedPoolsMethod = QueryGrpc.getIncentivizedPoolsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getIncentivizedPoolsMethod = QueryGrpc.getIncentivizedPoolsMethod) == null) {
          QueryGrpc.getIncentivizedPoolsMethod = getIncentivizedPoolsMethod =
              io.grpc.MethodDescriptor.<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryIncentivizedPoolsRequest, quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryIncentivizedPoolsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IncentivizedPools"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryIncentivizedPoolsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryIncentivizedPoolsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("IncentivizedPools"))
              .build();
        }
      }
    }
    return getIncentivizedPoolsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryPoolsRequest,
      quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryPoolsResponse> getPoolsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pools",
      requestType = quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryPoolsRequest.class,
      responseType = quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryPoolsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryPoolsRequest,
      quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryPoolsResponse> getPoolsMethod() {
    io.grpc.MethodDescriptor<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryPoolsRequest, quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryPoolsResponse> getPoolsMethod;
    if ((getPoolsMethod = QueryGrpc.getPoolsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolsMethod = QueryGrpc.getPoolsMethod) == null) {
          QueryGrpc.getPoolsMethod = getPoolsMethod =
              io.grpc.MethodDescriptor.<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryPoolsRequest, quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryPoolsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pools"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryPoolsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryPoolsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Pools"))
              .build();
        }
      }
    }
    return getPoolsMethod;
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
    public void params(quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries the state of oracle requests.
     * </pre>
     */
    public void state(quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryStateRequest request,
        io.grpc.stub.StreamObserver<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryStateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries latest fetched params from osmosis chain.
     * </pre>
     */
    public void chainParams(quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryChainParamsRequest request,
        io.grpc.stub.StreamObserver<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryChainParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChainParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries latest fetched list of incentivized pools from osmosis.
     * </pre>
     */
    public void incentivizedPools(quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryIncentivizedPoolsRequest request,
        io.grpc.stub.StreamObserver<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryIncentivizedPoolsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getIncentivizedPoolsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries latest fetched list of pool details from osmosis.
     * </pre>
     */
    public void pools(quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryPoolsRequest request,
        io.grpc.stub.StreamObserver<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryPoolsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPoolsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryParamsRequest,
                quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryParamsResponse>(
                  this, METHODID_PARAMS)))
          .addMethod(
            getStateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryStateRequest,
                quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryStateResponse>(
                  this, METHODID_STATE)))
          .addMethod(
            getChainParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryChainParamsRequest,
                quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryChainParamsResponse>(
                  this, METHODID_CHAIN_PARAMS)))
          .addMethod(
            getIncentivizedPoolsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryIncentivizedPoolsRequest,
                quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryIncentivizedPoolsResponse>(
                  this, METHODID_INCENTIVIZED_POOLS)))
          .addMethod(
            getPoolsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryPoolsRequest,
                quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryPoolsResponse>(
                  this, METHODID_POOLS)))
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
    public void params(quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries the state of oracle requests.
     * </pre>
     */
    public void state(quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryStateRequest request,
        io.grpc.stub.StreamObserver<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryStateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries latest fetched params from osmosis chain.
     * </pre>
     */
    public void chainParams(quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryChainParamsRequest request,
        io.grpc.stub.StreamObserver<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryChainParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChainParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries latest fetched list of incentivized pools from osmosis.
     * </pre>
     */
    public void incentivizedPools(quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryIncentivizedPoolsRequest request,
        io.grpc.stub.StreamObserver<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryIncentivizedPoolsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIncentivizedPoolsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries latest fetched list of pool details from osmosis.
     * </pre>
     */
    public void pools(quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryPoolsRequest request,
        io.grpc.stub.StreamObserver<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryPoolsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPoolsMethod(), getCallOptions()), request, responseObserver);
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
    public quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryParamsResponse params(quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries the state of oracle requests.
     * </pre>
     */
    public quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryStateResponse state(quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryStateRequest request) {
      return blockingUnaryCall(
          getChannel(), getStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries latest fetched params from osmosis chain.
     * </pre>
     */
    public quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryChainParamsResponse chainParams(quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryChainParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getChainParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries latest fetched list of incentivized pools from osmosis.
     * </pre>
     */
    public quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryIncentivizedPoolsResponse incentivizedPools(quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryIncentivizedPoolsRequest request) {
      return blockingUnaryCall(
          getChannel(), getIncentivizedPoolsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries latest fetched list of pool details from osmosis.
     * </pre>
     */
    public quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryPoolsResponse pools(quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryPoolsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPoolsMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryParamsResponse> params(
        quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries the state of oracle requests.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryStateResponse> state(
        quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryStateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries latest fetched params from osmosis chain.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryChainParamsResponse> chainParams(
        quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryChainParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChainParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries latest fetched list of incentivized pools from osmosis.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryIncentivizedPoolsResponse> incentivizedPools(
        quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryIncentivizedPoolsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getIncentivizedPoolsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries latest fetched list of pool details from osmosis.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryPoolsResponse> pools(
        quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryPoolsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPoolsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_STATE = 1;
  private static final int METHODID_CHAIN_PARAMS = 2;
  private static final int METHODID_INCENTIVIZED_POOLS = 3;
  private static final int METHODID_POOLS = 4;

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
          serviceImpl.params((quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_STATE:
          serviceImpl.state((quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryStateRequest) request,
              (io.grpc.stub.StreamObserver<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryStateResponse>) responseObserver);
          break;
        case METHODID_CHAIN_PARAMS:
          serviceImpl.chainParams((quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryChainParamsRequest) request,
              (io.grpc.stub.StreamObserver<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryChainParamsResponse>) responseObserver);
          break;
        case METHODID_INCENTIVIZED_POOLS:
          serviceImpl.incentivizedPools((quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryIncentivizedPoolsRequest) request,
              (io.grpc.stub.StreamObserver<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryIncentivizedPoolsResponse>) responseObserver);
          break;
        case METHODID_POOLS:
          serviceImpl.pools((quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryPoolsRequest) request,
              (io.grpc.stub.StreamObserver<quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.QueryPoolsResponse>) responseObserver);
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
      return quasarlabs.quasarnode.qoracle.osmosis.QueryOuterClass.getDescriptor();
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
              .addMethod(getStateMethod())
              .addMethod(getChainParamsMethod())
              .addMethod(getIncentivizedPoolsMethod())
              .addMethod(getPoolsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
