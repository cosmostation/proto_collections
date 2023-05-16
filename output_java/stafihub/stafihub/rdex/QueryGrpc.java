package stafihub.stafihub.rdex;

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
    comments = "Source: stafihub/rdex/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "stafihub.stafihub.rdex.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rdex.QueryOuterClass.QueryParamsRequest,
      stafihub.stafihub.rdex.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = stafihub.stafihub.rdex.QueryOuterClass.QueryParamsRequest.class,
      responseType = stafihub.stafihub.rdex.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rdex.QueryOuterClass.QueryParamsRequest,
      stafihub.stafihub.rdex.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rdex.QueryOuterClass.QueryParamsRequest, stafihub.stafihub.rdex.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rdex.QueryOuterClass.QueryParamsRequest, stafihub.stafihub.rdex.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rdex.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rdex.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolInfoRequest,
      stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolInfoResponse> getSwapPoolInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SwapPoolInfo",
      requestType = stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolInfoRequest.class,
      responseType = stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolInfoRequest,
      stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolInfoResponse> getSwapPoolInfoMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolInfoRequest, stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolInfoResponse> getSwapPoolInfoMethod;
    if ((getSwapPoolInfoMethod = QueryGrpc.getSwapPoolInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSwapPoolInfoMethod = QueryGrpc.getSwapPoolInfoMethod) == null) {
          QueryGrpc.getSwapPoolInfoMethod = getSwapPoolInfoMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolInfoRequest, stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SwapPoolInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SwapPoolInfo"))
              .build();
        }
      }
    }
    return getSwapPoolInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolListRequest,
      stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolListResponse> getSwapPoolListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SwapPoolList",
      requestType = stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolListRequest.class,
      responseType = stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolListRequest,
      stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolListResponse> getSwapPoolListMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolListRequest, stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolListResponse> getSwapPoolListMethod;
    if ((getSwapPoolListMethod = QueryGrpc.getSwapPoolListMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSwapPoolListMethod = QueryGrpc.getSwapPoolListMethod) == null) {
          QueryGrpc.getSwapPoolListMethod = getSwapPoolListMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolListRequest, stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SwapPoolList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SwapPoolList"))
              .build();
        }
      }
    }
    return getSwapPoolListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rdex.QueryOuterClass.QueryProviderListRequest,
      stafihub.stafihub.rdex.QueryOuterClass.QueryProviderListResponse> getProviderListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProviderList",
      requestType = stafihub.stafihub.rdex.QueryOuterClass.QueryProviderListRequest.class,
      responseType = stafihub.stafihub.rdex.QueryOuterClass.QueryProviderListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rdex.QueryOuterClass.QueryProviderListRequest,
      stafihub.stafihub.rdex.QueryOuterClass.QueryProviderListResponse> getProviderListMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rdex.QueryOuterClass.QueryProviderListRequest, stafihub.stafihub.rdex.QueryOuterClass.QueryProviderListResponse> getProviderListMethod;
    if ((getProviderListMethod = QueryGrpc.getProviderListMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getProviderListMethod = QueryGrpc.getProviderListMethod) == null) {
          QueryGrpc.getProviderListMethod = getProviderListMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rdex.QueryOuterClass.QueryProviderListRequest, stafihub.stafihub.rdex.QueryOuterClass.QueryProviderListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProviderList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rdex.QueryOuterClass.QueryProviderListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rdex.QueryOuterClass.QueryProviderListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ProviderList"))
              .build();
        }
      }
    }
    return getProviderListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rdex.QueryOuterClass.QueryPoolCreatorListRequest,
      stafihub.stafihub.rdex.QueryOuterClass.QueryPoolCreatorListResponse> getPoolCreatorListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PoolCreatorList",
      requestType = stafihub.stafihub.rdex.QueryOuterClass.QueryPoolCreatorListRequest.class,
      responseType = stafihub.stafihub.rdex.QueryOuterClass.QueryPoolCreatorListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rdex.QueryOuterClass.QueryPoolCreatorListRequest,
      stafihub.stafihub.rdex.QueryOuterClass.QueryPoolCreatorListResponse> getPoolCreatorListMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rdex.QueryOuterClass.QueryPoolCreatorListRequest, stafihub.stafihub.rdex.QueryOuterClass.QueryPoolCreatorListResponse> getPoolCreatorListMethod;
    if ((getPoolCreatorListMethod = QueryGrpc.getPoolCreatorListMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolCreatorListMethod = QueryGrpc.getPoolCreatorListMethod) == null) {
          QueryGrpc.getPoolCreatorListMethod = getPoolCreatorListMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rdex.QueryOuterClass.QueryPoolCreatorListRequest, stafihub.stafihub.rdex.QueryOuterClass.QueryPoolCreatorListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PoolCreatorList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rdex.QueryOuterClass.QueryPoolCreatorListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rdex.QueryOuterClass.QueryPoolCreatorListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PoolCreatorList"))
              .build();
        }
      }
    }
    return getPoolCreatorListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rdex.QueryOuterClass.QueryProviderSwitchRequest,
      stafihub.stafihub.rdex.QueryOuterClass.QueryProviderSwitchResponse> getProviderSwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProviderSwitch",
      requestType = stafihub.stafihub.rdex.QueryOuterClass.QueryProviderSwitchRequest.class,
      responseType = stafihub.stafihub.rdex.QueryOuterClass.QueryProviderSwitchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rdex.QueryOuterClass.QueryProviderSwitchRequest,
      stafihub.stafihub.rdex.QueryOuterClass.QueryProviderSwitchResponse> getProviderSwitchMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rdex.QueryOuterClass.QueryProviderSwitchRequest, stafihub.stafihub.rdex.QueryOuterClass.QueryProviderSwitchResponse> getProviderSwitchMethod;
    if ((getProviderSwitchMethod = QueryGrpc.getProviderSwitchMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getProviderSwitchMethod = QueryGrpc.getProviderSwitchMethod) == null) {
          QueryGrpc.getProviderSwitchMethod = getProviderSwitchMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rdex.QueryOuterClass.QueryProviderSwitchRequest, stafihub.stafihub.rdex.QueryOuterClass.QueryProviderSwitchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProviderSwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rdex.QueryOuterClass.QueryProviderSwitchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rdex.QueryOuterClass.QueryProviderSwitchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ProviderSwitch"))
              .build();
        }
      }
    }
    return getProviderSwitchMethod;
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
    public void params(stafihub.stafihub.rdex.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of SwapPoolInfo items.
     * </pre>
     */
    public void swapPoolInfo(stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolInfoRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSwapPoolInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of SwapPoolList items.
     * </pre>
     */
    public void swapPoolList(stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolListRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSwapPoolListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ProviderList items.
     * </pre>
     */
    public void providerList(stafihub.stafihub.rdex.QueryOuterClass.QueryProviderListRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.QueryOuterClass.QueryProviderListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getProviderListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of PoolCreatorList items.
     * </pre>
     */
    public void poolCreatorList(stafihub.stafihub.rdex.QueryOuterClass.QueryPoolCreatorListRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.QueryOuterClass.QueryPoolCreatorListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPoolCreatorListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ProviderSwitch items.
     * </pre>
     */
    public void providerSwitch(stafihub.stafihub.rdex.QueryOuterClass.QueryProviderSwitchRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.QueryOuterClass.QueryProviderSwitchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getProviderSwitchMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rdex.QueryOuterClass.QueryParamsRequest,
                stafihub.stafihub.rdex.QueryOuterClass.QueryParamsResponse>(
                  this, METHODID_PARAMS)))
          .addMethod(
            getSwapPoolInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolInfoRequest,
                stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolInfoResponse>(
                  this, METHODID_SWAP_POOL_INFO)))
          .addMethod(
            getSwapPoolListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolListRequest,
                stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolListResponse>(
                  this, METHODID_SWAP_POOL_LIST)))
          .addMethod(
            getProviderListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rdex.QueryOuterClass.QueryProviderListRequest,
                stafihub.stafihub.rdex.QueryOuterClass.QueryProviderListResponse>(
                  this, METHODID_PROVIDER_LIST)))
          .addMethod(
            getPoolCreatorListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rdex.QueryOuterClass.QueryPoolCreatorListRequest,
                stafihub.stafihub.rdex.QueryOuterClass.QueryPoolCreatorListResponse>(
                  this, METHODID_POOL_CREATOR_LIST)))
          .addMethod(
            getProviderSwitchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rdex.QueryOuterClass.QueryProviderSwitchRequest,
                stafihub.stafihub.rdex.QueryOuterClass.QueryProviderSwitchResponse>(
                  this, METHODID_PROVIDER_SWITCH)))
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
    public void params(stafihub.stafihub.rdex.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of SwapPoolInfo items.
     * </pre>
     */
    public void swapPoolInfo(stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolInfoRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSwapPoolInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of SwapPoolList items.
     * </pre>
     */
    public void swapPoolList(stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolListRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSwapPoolListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ProviderList items.
     * </pre>
     */
    public void providerList(stafihub.stafihub.rdex.QueryOuterClass.QueryProviderListRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.QueryOuterClass.QueryProviderListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProviderListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of PoolCreatorList items.
     * </pre>
     */
    public void poolCreatorList(stafihub.stafihub.rdex.QueryOuterClass.QueryPoolCreatorListRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.QueryOuterClass.QueryPoolCreatorListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPoolCreatorListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ProviderSwitch items.
     * </pre>
     */
    public void providerSwitch(stafihub.stafihub.rdex.QueryOuterClass.QueryProviderSwitchRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.QueryOuterClass.QueryProviderSwitchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProviderSwitchMethod(), getCallOptions()), request, responseObserver);
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
    public stafihub.stafihub.rdex.QueryOuterClass.QueryParamsResponse params(stafihub.stafihub.rdex.QueryOuterClass.QueryParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of SwapPoolInfo items.
     * </pre>
     */
    public stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolInfoResponse swapPoolInfo(stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getSwapPoolInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of SwapPoolList items.
     * </pre>
     */
    public stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolListResponse swapPoolList(stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolListRequest request) {
      return blockingUnaryCall(
          getChannel(), getSwapPoolListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of ProviderList items.
     * </pre>
     */
    public stafihub.stafihub.rdex.QueryOuterClass.QueryProviderListResponse providerList(stafihub.stafihub.rdex.QueryOuterClass.QueryProviderListRequest request) {
      return blockingUnaryCall(
          getChannel(), getProviderListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of PoolCreatorList items.
     * </pre>
     */
    public stafihub.stafihub.rdex.QueryOuterClass.QueryPoolCreatorListResponse poolCreatorList(stafihub.stafihub.rdex.QueryOuterClass.QueryPoolCreatorListRequest request) {
      return blockingUnaryCall(
          getChannel(), getPoolCreatorListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of ProviderSwitch items.
     * </pre>
     */
    public stafihub.stafihub.rdex.QueryOuterClass.QueryProviderSwitchResponse providerSwitch(stafihub.stafihub.rdex.QueryOuterClass.QueryProviderSwitchRequest request) {
      return blockingUnaryCall(
          getChannel(), getProviderSwitchMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rdex.QueryOuterClass.QueryParamsResponse> params(
        stafihub.stafihub.rdex.QueryOuterClass.QueryParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of SwapPoolInfo items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolInfoResponse> swapPoolInfo(
        stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSwapPoolInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of SwapPoolList items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolListResponse> swapPoolList(
        stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSwapPoolListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of ProviderList items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rdex.QueryOuterClass.QueryProviderListResponse> providerList(
        stafihub.stafihub.rdex.QueryOuterClass.QueryProviderListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getProviderListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of PoolCreatorList items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rdex.QueryOuterClass.QueryPoolCreatorListResponse> poolCreatorList(
        stafihub.stafihub.rdex.QueryOuterClass.QueryPoolCreatorListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPoolCreatorListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of ProviderSwitch items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rdex.QueryOuterClass.QueryProviderSwitchResponse> providerSwitch(
        stafihub.stafihub.rdex.QueryOuterClass.QueryProviderSwitchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getProviderSwitchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_SWAP_POOL_INFO = 1;
  private static final int METHODID_SWAP_POOL_LIST = 2;
  private static final int METHODID_PROVIDER_LIST = 3;
  private static final int METHODID_POOL_CREATOR_LIST = 4;
  private static final int METHODID_PROVIDER_SWITCH = 5;

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
          serviceImpl.params((stafihub.stafihub.rdex.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.QueryOuterClass.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_SWAP_POOL_INFO:
          serviceImpl.swapPoolInfo((stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolInfoRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolInfoResponse>) responseObserver);
          break;
        case METHODID_SWAP_POOL_LIST:
          serviceImpl.swapPoolList((stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolListRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.QueryOuterClass.QuerySwapPoolListResponse>) responseObserver);
          break;
        case METHODID_PROVIDER_LIST:
          serviceImpl.providerList((stafihub.stafihub.rdex.QueryOuterClass.QueryProviderListRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.QueryOuterClass.QueryProviderListResponse>) responseObserver);
          break;
        case METHODID_POOL_CREATOR_LIST:
          serviceImpl.poolCreatorList((stafihub.stafihub.rdex.QueryOuterClass.QueryPoolCreatorListRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.QueryOuterClass.QueryPoolCreatorListResponse>) responseObserver);
          break;
        case METHODID_PROVIDER_SWITCH:
          serviceImpl.providerSwitch((stafihub.stafihub.rdex.QueryOuterClass.QueryProviderSwitchRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rdex.QueryOuterClass.QueryProviderSwitchResponse>) responseObserver);
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
      return stafihub.stafihub.rdex.QueryOuterClass.getDescriptor();
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
              .addMethod(getSwapPoolInfoMethod())
              .addMethod(getSwapPoolListMethod())
              .addMethod(getProviderListMethod())
              .addMethod(getPoolCreatorListMethod())
              .addMethod(getProviderSwitchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
