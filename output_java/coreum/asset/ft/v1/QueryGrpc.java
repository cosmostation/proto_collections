package coreum.asset.ft.v1;

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
    comments = "Source: coreum/asset/ft/v1/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "coreum.asset.ft.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<coreum.asset.ft.v1.QueryOuterClass.QueryParamsRequest,
      coreum.asset.ft.v1.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = coreum.asset.ft.v1.QueryOuterClass.QueryParamsRequest.class,
      responseType = coreum.asset.ft.v1.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<coreum.asset.ft.v1.QueryOuterClass.QueryParamsRequest,
      coreum.asset.ft.v1.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<coreum.asset.ft.v1.QueryOuterClass.QueryParamsRequest, coreum.asset.ft.v1.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<coreum.asset.ft.v1.QueryOuterClass.QueryParamsRequest, coreum.asset.ft.v1.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.ft.v1.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.ft.v1.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<coreum.asset.ft.v1.QueryOuterClass.QueryTokensRequest,
      coreum.asset.ft.v1.QueryOuterClass.QueryTokensResponse> getTokensMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Tokens",
      requestType = coreum.asset.ft.v1.QueryOuterClass.QueryTokensRequest.class,
      responseType = coreum.asset.ft.v1.QueryOuterClass.QueryTokensResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<coreum.asset.ft.v1.QueryOuterClass.QueryTokensRequest,
      coreum.asset.ft.v1.QueryOuterClass.QueryTokensResponse> getTokensMethod() {
    io.grpc.MethodDescriptor<coreum.asset.ft.v1.QueryOuterClass.QueryTokensRequest, coreum.asset.ft.v1.QueryOuterClass.QueryTokensResponse> getTokensMethod;
    if ((getTokensMethod = QueryGrpc.getTokensMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTokensMethod = QueryGrpc.getTokensMethod) == null) {
          QueryGrpc.getTokensMethod = getTokensMethod =
              io.grpc.MethodDescriptor.<coreum.asset.ft.v1.QueryOuterClass.QueryTokensRequest, coreum.asset.ft.v1.QueryOuterClass.QueryTokensResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Tokens"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.ft.v1.QueryOuterClass.QueryTokensRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.ft.v1.QueryOuterClass.QueryTokensResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Tokens"))
              .build();
        }
      }
    }
    return getTokensMethod;
  }

  private static volatile io.grpc.MethodDescriptor<coreum.asset.ft.v1.QueryOuterClass.QueryTokenRequest,
      coreum.asset.ft.v1.QueryOuterClass.QueryTokenResponse> getTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Token",
      requestType = coreum.asset.ft.v1.QueryOuterClass.QueryTokenRequest.class,
      responseType = coreum.asset.ft.v1.QueryOuterClass.QueryTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<coreum.asset.ft.v1.QueryOuterClass.QueryTokenRequest,
      coreum.asset.ft.v1.QueryOuterClass.QueryTokenResponse> getTokenMethod() {
    io.grpc.MethodDescriptor<coreum.asset.ft.v1.QueryOuterClass.QueryTokenRequest, coreum.asset.ft.v1.QueryOuterClass.QueryTokenResponse> getTokenMethod;
    if ((getTokenMethod = QueryGrpc.getTokenMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTokenMethod = QueryGrpc.getTokenMethod) == null) {
          QueryGrpc.getTokenMethod = getTokenMethod =
              io.grpc.MethodDescriptor.<coreum.asset.ft.v1.QueryOuterClass.QueryTokenRequest, coreum.asset.ft.v1.QueryOuterClass.QueryTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Token"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.ft.v1.QueryOuterClass.QueryTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.ft.v1.QueryOuterClass.QueryTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Token"))
              .build();
        }
      }
    }
    return getTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalancesRequest,
      coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalancesResponse> getFrozenBalancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FrozenBalances",
      requestType = coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalancesRequest.class,
      responseType = coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalancesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalancesRequest,
      coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalancesResponse> getFrozenBalancesMethod() {
    io.grpc.MethodDescriptor<coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalancesRequest, coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalancesResponse> getFrozenBalancesMethod;
    if ((getFrozenBalancesMethod = QueryGrpc.getFrozenBalancesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFrozenBalancesMethod = QueryGrpc.getFrozenBalancesMethod) == null) {
          QueryGrpc.getFrozenBalancesMethod = getFrozenBalancesMethod =
              io.grpc.MethodDescriptor.<coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalancesRequest, coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalancesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FrozenBalances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalancesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalancesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("FrozenBalances"))
              .build();
        }
      }
    }
    return getFrozenBalancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalanceRequest,
      coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalanceResponse> getFrozenBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FrozenBalance",
      requestType = coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalanceRequest.class,
      responseType = coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalanceRequest,
      coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalanceResponse> getFrozenBalanceMethod() {
    io.grpc.MethodDescriptor<coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalanceRequest, coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalanceResponse> getFrozenBalanceMethod;
    if ((getFrozenBalanceMethod = QueryGrpc.getFrozenBalanceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFrozenBalanceMethod = QueryGrpc.getFrozenBalanceMethod) == null) {
          QueryGrpc.getFrozenBalanceMethod = getFrozenBalanceMethod =
              io.grpc.MethodDescriptor.<coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalanceRequest, coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FrozenBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("FrozenBalance"))
              .build();
        }
      }
    }
    return getFrozenBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalancesRequest,
      coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalancesResponse> getWhitelistedBalancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WhitelistedBalances",
      requestType = coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalancesRequest.class,
      responseType = coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalancesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalancesRequest,
      coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalancesResponse> getWhitelistedBalancesMethod() {
    io.grpc.MethodDescriptor<coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalancesRequest, coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalancesResponse> getWhitelistedBalancesMethod;
    if ((getWhitelistedBalancesMethod = QueryGrpc.getWhitelistedBalancesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getWhitelistedBalancesMethod = QueryGrpc.getWhitelistedBalancesMethod) == null) {
          QueryGrpc.getWhitelistedBalancesMethod = getWhitelistedBalancesMethod =
              io.grpc.MethodDescriptor.<coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalancesRequest, coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalancesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WhitelistedBalances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalancesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalancesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("WhitelistedBalances"))
              .build();
        }
      }
    }
    return getWhitelistedBalancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalanceRequest,
      coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalanceResponse> getWhitelistedBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WhitelistedBalance",
      requestType = coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalanceRequest.class,
      responseType = coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalanceRequest,
      coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalanceResponse> getWhitelistedBalanceMethod() {
    io.grpc.MethodDescriptor<coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalanceRequest, coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalanceResponse> getWhitelistedBalanceMethod;
    if ((getWhitelistedBalanceMethod = QueryGrpc.getWhitelistedBalanceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getWhitelistedBalanceMethod = QueryGrpc.getWhitelistedBalanceMethod) == null) {
          QueryGrpc.getWhitelistedBalanceMethod = getWhitelistedBalanceMethod =
              io.grpc.MethodDescriptor.<coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalanceRequest, coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WhitelistedBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("WhitelistedBalance"))
              .build();
        }
      }
    }
    return getWhitelistedBalanceMethod;
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
     * Params queries the parameters of x/asset/ft module.
     * </pre>
     */
    public void params(coreum.asset.ft.v1.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<coreum.asset.ft.v1.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Tokens queries the fungible tokens of the module.
     * </pre>
     */
    public void tokens(coreum.asset.ft.v1.QueryOuterClass.QueryTokensRequest request,
        io.grpc.stub.StreamObserver<coreum.asset.ft.v1.QueryOuterClass.QueryTokensResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTokensMethod(), responseObserver);
    }

    /**
     * <pre>
     * Token queries the fungible token of the module.
     * </pre>
     */
    public void token(coreum.asset.ft.v1.QueryOuterClass.QueryTokenRequest request,
        io.grpc.stub.StreamObserver<coreum.asset.ft.v1.QueryOuterClass.QueryTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * FrozenBalances returns all the frozen balances for the account.
     * </pre>
     */
    public void frozenBalances(coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalancesRequest request,
        io.grpc.stub.StreamObserver<coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalancesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFrozenBalancesMethod(), responseObserver);
    }

    /**
     * <pre>
     * FrozenBalance returns frozen balance of the denom for the account.
     * </pre>
     */
    public void frozenBalance(coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalanceRequest request,
        io.grpc.stub.StreamObserver<coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFrozenBalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * WhitelistedBalances returns all the whitelisted balances for the account.
     * </pre>
     */
    public void whitelistedBalances(coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalancesRequest request,
        io.grpc.stub.StreamObserver<coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalancesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWhitelistedBalancesMethod(), responseObserver);
    }

    /**
     * <pre>
     * WhitelistedBalance returns whitelisted balance of the denom for the account.
     * </pre>
     */
    public void whitelistedBalance(coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalanceRequest request,
        io.grpc.stub.StreamObserver<coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWhitelistedBalanceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                coreum.asset.ft.v1.QueryOuterClass.QueryParamsRequest,
                coreum.asset.ft.v1.QueryOuterClass.QueryParamsResponse>(
                  this, METHODID_PARAMS)))
          .addMethod(
            getTokensMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                coreum.asset.ft.v1.QueryOuterClass.QueryTokensRequest,
                coreum.asset.ft.v1.QueryOuterClass.QueryTokensResponse>(
                  this, METHODID_TOKENS)))
          .addMethod(
            getTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                coreum.asset.ft.v1.QueryOuterClass.QueryTokenRequest,
                coreum.asset.ft.v1.QueryOuterClass.QueryTokenResponse>(
                  this, METHODID_TOKEN)))
          .addMethod(
            getFrozenBalancesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalancesRequest,
                coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalancesResponse>(
                  this, METHODID_FROZEN_BALANCES)))
          .addMethod(
            getFrozenBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalanceRequest,
                coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalanceResponse>(
                  this, METHODID_FROZEN_BALANCE)))
          .addMethod(
            getWhitelistedBalancesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalancesRequest,
                coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalancesResponse>(
                  this, METHODID_WHITELISTED_BALANCES)))
          .addMethod(
            getWhitelistedBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalanceRequest,
                coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalanceResponse>(
                  this, METHODID_WHITELISTED_BALANCE)))
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
     * Params queries the parameters of x/asset/ft module.
     * </pre>
     */
    public void params(coreum.asset.ft.v1.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<coreum.asset.ft.v1.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Tokens queries the fungible tokens of the module.
     * </pre>
     */
    public void tokens(coreum.asset.ft.v1.QueryOuterClass.QueryTokensRequest request,
        io.grpc.stub.StreamObserver<coreum.asset.ft.v1.QueryOuterClass.QueryTokensResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTokensMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Token queries the fungible token of the module.
     * </pre>
     */
    public void token(coreum.asset.ft.v1.QueryOuterClass.QueryTokenRequest request,
        io.grpc.stub.StreamObserver<coreum.asset.ft.v1.QueryOuterClass.QueryTokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FrozenBalances returns all the frozen balances for the account.
     * </pre>
     */
    public void frozenBalances(coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalancesRequest request,
        io.grpc.stub.StreamObserver<coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalancesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFrozenBalancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FrozenBalance returns frozen balance of the denom for the account.
     * </pre>
     */
    public void frozenBalance(coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalanceRequest request,
        io.grpc.stub.StreamObserver<coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalanceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFrozenBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WhitelistedBalances returns all the whitelisted balances for the account.
     * </pre>
     */
    public void whitelistedBalances(coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalancesRequest request,
        io.grpc.stub.StreamObserver<coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalancesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWhitelistedBalancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WhitelistedBalance returns whitelisted balance of the denom for the account.
     * </pre>
     */
    public void whitelistedBalance(coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalanceRequest request,
        io.grpc.stub.StreamObserver<coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalanceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWhitelistedBalanceMethod(), getCallOptions()), request, responseObserver);
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
     * Params queries the parameters of x/asset/ft module.
     * </pre>
     */
    public coreum.asset.ft.v1.QueryOuterClass.QueryParamsResponse params(coreum.asset.ft.v1.QueryOuterClass.QueryParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Tokens queries the fungible tokens of the module.
     * </pre>
     */
    public coreum.asset.ft.v1.QueryOuterClass.QueryTokensResponse tokens(coreum.asset.ft.v1.QueryOuterClass.QueryTokensRequest request) {
      return blockingUnaryCall(
          getChannel(), getTokensMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Token queries the fungible token of the module.
     * </pre>
     */
    public coreum.asset.ft.v1.QueryOuterClass.QueryTokenResponse token(coreum.asset.ft.v1.QueryOuterClass.QueryTokenRequest request) {
      return blockingUnaryCall(
          getChannel(), getTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FrozenBalances returns all the frozen balances for the account.
     * </pre>
     */
    public coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalancesResponse frozenBalances(coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalancesRequest request) {
      return blockingUnaryCall(
          getChannel(), getFrozenBalancesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FrozenBalance returns frozen balance of the denom for the account.
     * </pre>
     */
    public coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalanceResponse frozenBalance(coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getFrozenBalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WhitelistedBalances returns all the whitelisted balances for the account.
     * </pre>
     */
    public coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalancesResponse whitelistedBalances(coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalancesRequest request) {
      return blockingUnaryCall(
          getChannel(), getWhitelistedBalancesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WhitelistedBalance returns whitelisted balance of the denom for the account.
     * </pre>
     */
    public coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalanceResponse whitelistedBalance(coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getWhitelistedBalanceMethod(), getCallOptions(), request);
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
     * Params queries the parameters of x/asset/ft module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<coreum.asset.ft.v1.QueryOuterClass.QueryParamsResponse> params(
        coreum.asset.ft.v1.QueryOuterClass.QueryParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Tokens queries the fungible tokens of the module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<coreum.asset.ft.v1.QueryOuterClass.QueryTokensResponse> tokens(
        coreum.asset.ft.v1.QueryOuterClass.QueryTokensRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTokensMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Token queries the fungible token of the module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<coreum.asset.ft.v1.QueryOuterClass.QueryTokenResponse> token(
        coreum.asset.ft.v1.QueryOuterClass.QueryTokenRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FrozenBalances returns all the frozen balances for the account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalancesResponse> frozenBalances(
        coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalancesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFrozenBalancesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FrozenBalance returns frozen balance of the denom for the account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalanceResponse> frozenBalance(
        coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFrozenBalanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WhitelistedBalances returns all the whitelisted balances for the account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalancesResponse> whitelistedBalances(
        coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalancesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWhitelistedBalancesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WhitelistedBalance returns whitelisted balance of the denom for the account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalanceResponse> whitelistedBalance(
        coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWhitelistedBalanceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_TOKENS = 1;
  private static final int METHODID_TOKEN = 2;
  private static final int METHODID_FROZEN_BALANCES = 3;
  private static final int METHODID_FROZEN_BALANCE = 4;
  private static final int METHODID_WHITELISTED_BALANCES = 5;
  private static final int METHODID_WHITELISTED_BALANCE = 6;

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
          serviceImpl.params((coreum.asset.ft.v1.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<coreum.asset.ft.v1.QueryOuterClass.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_TOKENS:
          serviceImpl.tokens((coreum.asset.ft.v1.QueryOuterClass.QueryTokensRequest) request,
              (io.grpc.stub.StreamObserver<coreum.asset.ft.v1.QueryOuterClass.QueryTokensResponse>) responseObserver);
          break;
        case METHODID_TOKEN:
          serviceImpl.token((coreum.asset.ft.v1.QueryOuterClass.QueryTokenRequest) request,
              (io.grpc.stub.StreamObserver<coreum.asset.ft.v1.QueryOuterClass.QueryTokenResponse>) responseObserver);
          break;
        case METHODID_FROZEN_BALANCES:
          serviceImpl.frozenBalances((coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalancesRequest) request,
              (io.grpc.stub.StreamObserver<coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalancesResponse>) responseObserver);
          break;
        case METHODID_FROZEN_BALANCE:
          serviceImpl.frozenBalance((coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalanceRequest) request,
              (io.grpc.stub.StreamObserver<coreum.asset.ft.v1.QueryOuterClass.QueryFrozenBalanceResponse>) responseObserver);
          break;
        case METHODID_WHITELISTED_BALANCES:
          serviceImpl.whitelistedBalances((coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalancesRequest) request,
              (io.grpc.stub.StreamObserver<coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalancesResponse>) responseObserver);
          break;
        case METHODID_WHITELISTED_BALANCE:
          serviceImpl.whitelistedBalance((coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalanceRequest) request,
              (io.grpc.stub.StreamObserver<coreum.asset.ft.v1.QueryOuterClass.QueryWhitelistedBalanceResponse>) responseObserver);
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
      return coreum.asset.ft.v1.QueryOuterClass.getDescriptor();
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
              .addMethod(getTokensMethod())
              .addMethod(getTokenMethod())
              .addMethod(getFrozenBalancesMethod())
              .addMethod(getFrozenBalanceMethod())
              .addMethod(getWhitelistedBalancesMethod())
              .addMethod(getWhitelistedBalanceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
