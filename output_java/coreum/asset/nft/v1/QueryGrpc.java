package coreum.asset.nft.v1;

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
    comments = "Source: coreum/asset/nft/v1/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "coreum.asset.nft.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<coreum.asset.nft.v1.QueryOuterClass.QueryParamsRequest,
      coreum.asset.nft.v1.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = coreum.asset.nft.v1.QueryOuterClass.QueryParamsRequest.class,
      responseType = coreum.asset.nft.v1.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<coreum.asset.nft.v1.QueryOuterClass.QueryParamsRequest,
      coreum.asset.nft.v1.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<coreum.asset.nft.v1.QueryOuterClass.QueryParamsRequest, coreum.asset.nft.v1.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<coreum.asset.nft.v1.QueryOuterClass.QueryParamsRequest, coreum.asset.nft.v1.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.nft.v1.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.nft.v1.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<coreum.asset.nft.v1.QueryOuterClass.QueryClassRequest,
      coreum.asset.nft.v1.QueryOuterClass.QueryClassResponse> getClassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Class",
      requestType = coreum.asset.nft.v1.QueryOuterClass.QueryClassRequest.class,
      responseType = coreum.asset.nft.v1.QueryOuterClass.QueryClassResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<coreum.asset.nft.v1.QueryOuterClass.QueryClassRequest,
      coreum.asset.nft.v1.QueryOuterClass.QueryClassResponse> getClassMethod() {
    io.grpc.MethodDescriptor<coreum.asset.nft.v1.QueryOuterClass.QueryClassRequest, coreum.asset.nft.v1.QueryOuterClass.QueryClassResponse> getClassMethod;
    if ((getClassMethod = QueryGrpc.getClassMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClassMethod = QueryGrpc.getClassMethod) == null) {
          QueryGrpc.getClassMethod = getClassMethod =
              io.grpc.MethodDescriptor.<coreum.asset.nft.v1.QueryOuterClass.QueryClassRequest, coreum.asset.nft.v1.QueryOuterClass.QueryClassResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Class"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.nft.v1.QueryOuterClass.QueryClassRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.nft.v1.QueryOuterClass.QueryClassResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Class"))
              .build();
        }
      }
    }
    return getClassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<coreum.asset.nft.v1.QueryOuterClass.QueryFrozenRequest,
      coreum.asset.nft.v1.QueryOuterClass.QueryFrozenResponse> getFrozenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Frozen",
      requestType = coreum.asset.nft.v1.QueryOuterClass.QueryFrozenRequest.class,
      responseType = coreum.asset.nft.v1.QueryOuterClass.QueryFrozenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<coreum.asset.nft.v1.QueryOuterClass.QueryFrozenRequest,
      coreum.asset.nft.v1.QueryOuterClass.QueryFrozenResponse> getFrozenMethod() {
    io.grpc.MethodDescriptor<coreum.asset.nft.v1.QueryOuterClass.QueryFrozenRequest, coreum.asset.nft.v1.QueryOuterClass.QueryFrozenResponse> getFrozenMethod;
    if ((getFrozenMethod = QueryGrpc.getFrozenMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFrozenMethod = QueryGrpc.getFrozenMethod) == null) {
          QueryGrpc.getFrozenMethod = getFrozenMethod =
              io.grpc.MethodDescriptor.<coreum.asset.nft.v1.QueryOuterClass.QueryFrozenRequest, coreum.asset.nft.v1.QueryOuterClass.QueryFrozenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Frozen"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.nft.v1.QueryOuterClass.QueryFrozenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.nft.v1.QueryOuterClass.QueryFrozenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Frozen"))
              .build();
        }
      }
    }
    return getFrozenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedRequest,
      coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedResponse> getWhitelistedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Whitelisted",
      requestType = coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedRequest.class,
      responseType = coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedRequest,
      coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedResponse> getWhitelistedMethod() {
    io.grpc.MethodDescriptor<coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedRequest, coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedResponse> getWhitelistedMethod;
    if ((getWhitelistedMethod = QueryGrpc.getWhitelistedMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getWhitelistedMethod = QueryGrpc.getWhitelistedMethod) == null) {
          QueryGrpc.getWhitelistedMethod = getWhitelistedMethod =
              io.grpc.MethodDescriptor.<coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedRequest, coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Whitelisted"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Whitelisted"))
              .build();
        }
      }
    }
    return getWhitelistedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedAccountsForNFTRequest,
      coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedAccountsForNFTResponse> getWhitelistedAccountsForNFTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WhitelistedAccountsForNFT",
      requestType = coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedAccountsForNFTRequest.class,
      responseType = coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedAccountsForNFTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedAccountsForNFTRequest,
      coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedAccountsForNFTResponse> getWhitelistedAccountsForNFTMethod() {
    io.grpc.MethodDescriptor<coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedAccountsForNFTRequest, coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedAccountsForNFTResponse> getWhitelistedAccountsForNFTMethod;
    if ((getWhitelistedAccountsForNFTMethod = QueryGrpc.getWhitelistedAccountsForNFTMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getWhitelistedAccountsForNFTMethod = QueryGrpc.getWhitelistedAccountsForNFTMethod) == null) {
          QueryGrpc.getWhitelistedAccountsForNFTMethod = getWhitelistedAccountsForNFTMethod =
              io.grpc.MethodDescriptor.<coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedAccountsForNFTRequest, coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedAccountsForNFTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WhitelistedAccountsForNFT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedAccountsForNFTRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedAccountsForNFTResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("WhitelistedAccountsForNFT"))
              .build();
        }
      }
    }
    return getWhitelistedAccountsForNFTMethod;
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
    public void params(coreum.asset.nft.v1.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<coreum.asset.nft.v1.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Class queries the non-fungible token class of the module.
     * </pre>
     */
    public void class_(coreum.asset.nft.v1.QueryOuterClass.QueryClassRequest request,
        io.grpc.stub.StreamObserver<coreum.asset.nft.v1.QueryOuterClass.QueryClassResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClassMethod(), responseObserver);
    }

    /**
     * <pre>
     * Frozen queries to check if an NFT is frozen or not.
     * </pre>
     */
    public void frozen(coreum.asset.nft.v1.QueryOuterClass.QueryFrozenRequest request,
        io.grpc.stub.StreamObserver<coreum.asset.nft.v1.QueryOuterClass.QueryFrozenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFrozenMethod(), responseObserver);
    }

    /**
     * <pre>
     * Whitelisted queries to check if an account is whitelited to hold an NFT or not.
     * </pre>
     */
    public void whitelisted(coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedRequest request,
        io.grpc.stub.StreamObserver<coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWhitelistedMethod(), responseObserver);
    }

    /**
     * <pre>
     * WhitelistedAccountsForNFT returns the list of accounts which are whitelisted to hold this NFT.
     * </pre>
     */
    public void whitelistedAccountsForNFT(coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedAccountsForNFTRequest request,
        io.grpc.stub.StreamObserver<coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedAccountsForNFTResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWhitelistedAccountsForNFTMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                coreum.asset.nft.v1.QueryOuterClass.QueryParamsRequest,
                coreum.asset.nft.v1.QueryOuterClass.QueryParamsResponse>(
                  this, METHODID_PARAMS)))
          .addMethod(
            getClassMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                coreum.asset.nft.v1.QueryOuterClass.QueryClassRequest,
                coreum.asset.nft.v1.QueryOuterClass.QueryClassResponse>(
                  this, METHODID_CLASS)))
          .addMethod(
            getFrozenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                coreum.asset.nft.v1.QueryOuterClass.QueryFrozenRequest,
                coreum.asset.nft.v1.QueryOuterClass.QueryFrozenResponse>(
                  this, METHODID_FROZEN)))
          .addMethod(
            getWhitelistedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedRequest,
                coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedResponse>(
                  this, METHODID_WHITELISTED)))
          .addMethod(
            getWhitelistedAccountsForNFTMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedAccountsForNFTRequest,
                coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedAccountsForNFTResponse>(
                  this, METHODID_WHITELISTED_ACCOUNTS_FOR_NFT)))
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
    public void params(coreum.asset.nft.v1.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<coreum.asset.nft.v1.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Class queries the non-fungible token class of the module.
     * </pre>
     */
    public void class_(coreum.asset.nft.v1.QueryOuterClass.QueryClassRequest request,
        io.grpc.stub.StreamObserver<coreum.asset.nft.v1.QueryOuterClass.QueryClassResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Frozen queries to check if an NFT is frozen or not.
     * </pre>
     */
    public void frozen(coreum.asset.nft.v1.QueryOuterClass.QueryFrozenRequest request,
        io.grpc.stub.StreamObserver<coreum.asset.nft.v1.QueryOuterClass.QueryFrozenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFrozenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Whitelisted queries to check if an account is whitelited to hold an NFT or not.
     * </pre>
     */
    public void whitelisted(coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedRequest request,
        io.grpc.stub.StreamObserver<coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWhitelistedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WhitelistedAccountsForNFT returns the list of accounts which are whitelisted to hold this NFT.
     * </pre>
     */
    public void whitelistedAccountsForNFT(coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedAccountsForNFTRequest request,
        io.grpc.stub.StreamObserver<coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedAccountsForNFTResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWhitelistedAccountsForNFTMethod(), getCallOptions()), request, responseObserver);
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
    public coreum.asset.nft.v1.QueryOuterClass.QueryParamsResponse params(coreum.asset.nft.v1.QueryOuterClass.QueryParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Class queries the non-fungible token class of the module.
     * </pre>
     */
    public coreum.asset.nft.v1.QueryOuterClass.QueryClassResponse class_(coreum.asset.nft.v1.QueryOuterClass.QueryClassRequest request) {
      return blockingUnaryCall(
          getChannel(), getClassMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Frozen queries to check if an NFT is frozen or not.
     * </pre>
     */
    public coreum.asset.nft.v1.QueryOuterClass.QueryFrozenResponse frozen(coreum.asset.nft.v1.QueryOuterClass.QueryFrozenRequest request) {
      return blockingUnaryCall(
          getChannel(), getFrozenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Whitelisted queries to check if an account is whitelited to hold an NFT or not.
     * </pre>
     */
    public coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedResponse whitelisted(coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedRequest request) {
      return blockingUnaryCall(
          getChannel(), getWhitelistedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WhitelistedAccountsForNFT returns the list of accounts which are whitelisted to hold this NFT.
     * </pre>
     */
    public coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedAccountsForNFTResponse whitelistedAccountsForNFT(coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedAccountsForNFTRequest request) {
      return blockingUnaryCall(
          getChannel(), getWhitelistedAccountsForNFTMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<coreum.asset.nft.v1.QueryOuterClass.QueryParamsResponse> params(
        coreum.asset.nft.v1.QueryOuterClass.QueryParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Class queries the non-fungible token class of the module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<coreum.asset.nft.v1.QueryOuterClass.QueryClassResponse> class_(
        coreum.asset.nft.v1.QueryOuterClass.QueryClassRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getClassMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Frozen queries to check if an NFT is frozen or not.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<coreum.asset.nft.v1.QueryOuterClass.QueryFrozenResponse> frozen(
        coreum.asset.nft.v1.QueryOuterClass.QueryFrozenRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFrozenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Whitelisted queries to check if an account is whitelited to hold an NFT or not.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedResponse> whitelisted(
        coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWhitelistedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WhitelistedAccountsForNFT returns the list of accounts which are whitelisted to hold this NFT.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedAccountsForNFTResponse> whitelistedAccountsForNFT(
        coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedAccountsForNFTRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWhitelistedAccountsForNFTMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_CLASS = 1;
  private static final int METHODID_FROZEN = 2;
  private static final int METHODID_WHITELISTED = 3;
  private static final int METHODID_WHITELISTED_ACCOUNTS_FOR_NFT = 4;

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
          serviceImpl.params((coreum.asset.nft.v1.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<coreum.asset.nft.v1.QueryOuterClass.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_CLASS:
          serviceImpl.class_((coreum.asset.nft.v1.QueryOuterClass.QueryClassRequest) request,
              (io.grpc.stub.StreamObserver<coreum.asset.nft.v1.QueryOuterClass.QueryClassResponse>) responseObserver);
          break;
        case METHODID_FROZEN:
          serviceImpl.frozen((coreum.asset.nft.v1.QueryOuterClass.QueryFrozenRequest) request,
              (io.grpc.stub.StreamObserver<coreum.asset.nft.v1.QueryOuterClass.QueryFrozenResponse>) responseObserver);
          break;
        case METHODID_WHITELISTED:
          serviceImpl.whitelisted((coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedRequest) request,
              (io.grpc.stub.StreamObserver<coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedResponse>) responseObserver);
          break;
        case METHODID_WHITELISTED_ACCOUNTS_FOR_NFT:
          serviceImpl.whitelistedAccountsForNFT((coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedAccountsForNFTRequest) request,
              (io.grpc.stub.StreamObserver<coreum.asset.nft.v1.QueryOuterClass.QueryWhitelistedAccountsForNFTResponse>) responseObserver);
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
      return coreum.asset.nft.v1.QueryOuterClass.getDescriptor();
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
              .addMethod(getClassMethod())
              .addMethod(getFrozenMethod())
              .addMethod(getWhitelistedMethod())
              .addMethod(getWhitelistedAccountsForNFTMethod())
              .build();
        }
      }
    }
    return result;
  }
}
