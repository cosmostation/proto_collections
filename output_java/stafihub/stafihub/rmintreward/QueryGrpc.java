package stafihub.stafihub.rmintreward;

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
    comments = "Source: stafihub/rmintreward/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "stafihub.stafihub.rmintreward.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rmintreward.QueryOuterClass.QueryParamsRequest,
      stafihub.stafihub.rmintreward.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = stafihub.stafihub.rmintreward.QueryOuterClass.QueryParamsRequest.class,
      responseType = stafihub.stafihub.rmintreward.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rmintreward.QueryOuterClass.QueryParamsRequest,
      stafihub.stafihub.rmintreward.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rmintreward.QueryOuterClass.QueryParamsRequest, stafihub.stafihub.rmintreward.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rmintreward.QueryOuterClass.QueryParamsRequest, stafihub.stafihub.rmintreward.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rmintreward.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rmintreward.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rmintreward.QueryOuterClass.QueryActLatestCycleRequest,
      stafihub.stafihub.rmintreward.QueryOuterClass.QueryActLatestCycleResponse> getActLatestCycleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActLatestCycle",
      requestType = stafihub.stafihub.rmintreward.QueryOuterClass.QueryActLatestCycleRequest.class,
      responseType = stafihub.stafihub.rmintreward.QueryOuterClass.QueryActLatestCycleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rmintreward.QueryOuterClass.QueryActLatestCycleRequest,
      stafihub.stafihub.rmintreward.QueryOuterClass.QueryActLatestCycleResponse> getActLatestCycleMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rmintreward.QueryOuterClass.QueryActLatestCycleRequest, stafihub.stafihub.rmintreward.QueryOuterClass.QueryActLatestCycleResponse> getActLatestCycleMethod;
    if ((getActLatestCycleMethod = QueryGrpc.getActLatestCycleMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getActLatestCycleMethod = QueryGrpc.getActLatestCycleMethod) == null) {
          QueryGrpc.getActLatestCycleMethod = getActLatestCycleMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rmintreward.QueryOuterClass.QueryActLatestCycleRequest, stafihub.stafihub.rmintreward.QueryOuterClass.QueryActLatestCycleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ActLatestCycle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rmintreward.QueryOuterClass.QueryActLatestCycleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rmintreward.QueryOuterClass.QueryActLatestCycleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ActLatestCycle"))
              .build();
        }
      }
    }
    return getActLatestCycleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rmintreward.QueryOuterClass.QueryActDetailRequest,
      stafihub.stafihub.rmintreward.QueryOuterClass.QueryActDetailResponse> getActDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActDetail",
      requestType = stafihub.stafihub.rmintreward.QueryOuterClass.QueryActDetailRequest.class,
      responseType = stafihub.stafihub.rmintreward.QueryOuterClass.QueryActDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rmintreward.QueryOuterClass.QueryActDetailRequest,
      stafihub.stafihub.rmintreward.QueryOuterClass.QueryActDetailResponse> getActDetailMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rmintreward.QueryOuterClass.QueryActDetailRequest, stafihub.stafihub.rmintreward.QueryOuterClass.QueryActDetailResponse> getActDetailMethod;
    if ((getActDetailMethod = QueryGrpc.getActDetailMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getActDetailMethod = QueryGrpc.getActDetailMethod) == null) {
          QueryGrpc.getActDetailMethod = getActDetailMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rmintreward.QueryOuterClass.QueryActDetailRequest, stafihub.stafihub.rmintreward.QueryOuterClass.QueryActDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ActDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rmintreward.QueryOuterClass.QueryActDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rmintreward.QueryOuterClass.QueryActDetailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ActDetail"))
              .build();
        }
      }
    }
    return getActDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserMintCountRequest,
      stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserMintCountResponse> getUserMintCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserMintCount",
      requestType = stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserMintCountRequest.class,
      responseType = stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserMintCountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserMintCountRequest,
      stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserMintCountResponse> getUserMintCountMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserMintCountRequest, stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserMintCountResponse> getUserMintCountMethod;
    if ((getUserMintCountMethod = QueryGrpc.getUserMintCountMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUserMintCountMethod = QueryGrpc.getUserMintCountMethod) == null) {
          QueryGrpc.getUserMintCountMethod = getUserMintCountMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserMintCountRequest, stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserMintCountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserMintCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserMintCountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserMintCountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UserMintCount"))
              .build();
        }
      }
    }
    return getUserMintCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserActsRequest,
      stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserActsResponse> getUserActsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserActs",
      requestType = stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserActsRequest.class,
      responseType = stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserActsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserActsRequest,
      stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserActsResponse> getUserActsMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserActsRequest, stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserActsResponse> getUserActsMethod;
    if ((getUserActsMethod = QueryGrpc.getUserActsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUserActsMethod = QueryGrpc.getUserActsMethod) == null) {
          QueryGrpc.getUserActsMethod = getUserActsMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserActsRequest, stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserActsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserActs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserActsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserActsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UserActs"))
              .build();
        }
      }
    }
    return getUserActsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rmintreward.QueryOuterClass.QueryActCurrentCycleRequest,
      stafihub.stafihub.rmintreward.QueryOuterClass.QueryActCurrentCycleResponse> getActCurrentCycleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActCurrentCycle",
      requestType = stafihub.stafihub.rmintreward.QueryOuterClass.QueryActCurrentCycleRequest.class,
      responseType = stafihub.stafihub.rmintreward.QueryOuterClass.QueryActCurrentCycleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rmintreward.QueryOuterClass.QueryActCurrentCycleRequest,
      stafihub.stafihub.rmintreward.QueryOuterClass.QueryActCurrentCycleResponse> getActCurrentCycleMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rmintreward.QueryOuterClass.QueryActCurrentCycleRequest, stafihub.stafihub.rmintreward.QueryOuterClass.QueryActCurrentCycleResponse> getActCurrentCycleMethod;
    if ((getActCurrentCycleMethod = QueryGrpc.getActCurrentCycleMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getActCurrentCycleMethod = QueryGrpc.getActCurrentCycleMethod) == null) {
          QueryGrpc.getActCurrentCycleMethod = getActCurrentCycleMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rmintreward.QueryOuterClass.QueryActCurrentCycleRequest, stafihub.stafihub.rmintreward.QueryOuterClass.QueryActCurrentCycleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ActCurrentCycle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rmintreward.QueryOuterClass.QueryActCurrentCycleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rmintreward.QueryOuterClass.QueryActCurrentCycleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ActCurrentCycle"))
              .build();
        }
      }
    }
    return getActCurrentCycleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rmintreward.QueryOuterClass.QueryClaimInfoDetailRequest,
      stafihub.stafihub.rmintreward.QueryOuterClass.QueryClaimInfoDetailResponse> getClaimInfoDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimInfoDetail",
      requestType = stafihub.stafihub.rmintreward.QueryOuterClass.QueryClaimInfoDetailRequest.class,
      responseType = stafihub.stafihub.rmintreward.QueryOuterClass.QueryClaimInfoDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rmintreward.QueryOuterClass.QueryClaimInfoDetailRequest,
      stafihub.stafihub.rmintreward.QueryOuterClass.QueryClaimInfoDetailResponse> getClaimInfoDetailMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rmintreward.QueryOuterClass.QueryClaimInfoDetailRequest, stafihub.stafihub.rmintreward.QueryOuterClass.QueryClaimInfoDetailResponse> getClaimInfoDetailMethod;
    if ((getClaimInfoDetailMethod = QueryGrpc.getClaimInfoDetailMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClaimInfoDetailMethod = QueryGrpc.getClaimInfoDetailMethod) == null) {
          QueryGrpc.getClaimInfoDetailMethod = getClaimInfoDetailMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rmintreward.QueryOuterClass.QueryClaimInfoDetailRequest, stafihub.stafihub.rmintreward.QueryOuterClass.QueryClaimInfoDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimInfoDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rmintreward.QueryOuterClass.QueryClaimInfoDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rmintreward.QueryOuterClass.QueryClaimInfoDetailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ClaimInfoDetail"))
              .build();
        }
      }
    }
    return getClaimInfoDetailMethod;
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
    public void params(stafihub.stafihub.rmintreward.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rmintreward.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ActLatestCycle items.
     * </pre>
     */
    public void actLatestCycle(stafihub.stafihub.rmintreward.QueryOuterClass.QueryActLatestCycleRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rmintreward.QueryOuterClass.QueryActLatestCycleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getActLatestCycleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ActDetail items.
     * </pre>
     */
    public void actDetail(stafihub.stafihub.rmintreward.QueryOuterClass.QueryActDetailRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rmintreward.QueryOuterClass.QueryActDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getActDetailMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of UserMintCount items.
     * </pre>
     */
    public void userMintCount(stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserMintCountRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserMintCountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserMintCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of UserActs items.
     * </pre>
     */
    public void userActs(stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserActsRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserActsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserActsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ActCurrentCycle items.
     * </pre>
     */
    public void actCurrentCycle(stafihub.stafihub.rmintreward.QueryOuterClass.QueryActCurrentCycleRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rmintreward.QueryOuterClass.QueryActCurrentCycleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getActCurrentCycleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ClaimInfoDetail items.
     * </pre>
     */
    public void claimInfoDetail(stafihub.stafihub.rmintreward.QueryOuterClass.QueryClaimInfoDetailRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rmintreward.QueryOuterClass.QueryClaimInfoDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClaimInfoDetailMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rmintreward.QueryOuterClass.QueryParamsRequest,
                stafihub.stafihub.rmintreward.QueryOuterClass.QueryParamsResponse>(
                  this, METHODID_PARAMS)))
          .addMethod(
            getActLatestCycleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rmintreward.QueryOuterClass.QueryActLatestCycleRequest,
                stafihub.stafihub.rmintreward.QueryOuterClass.QueryActLatestCycleResponse>(
                  this, METHODID_ACT_LATEST_CYCLE)))
          .addMethod(
            getActDetailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rmintreward.QueryOuterClass.QueryActDetailRequest,
                stafihub.stafihub.rmintreward.QueryOuterClass.QueryActDetailResponse>(
                  this, METHODID_ACT_DETAIL)))
          .addMethod(
            getUserMintCountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserMintCountRequest,
                stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserMintCountResponse>(
                  this, METHODID_USER_MINT_COUNT)))
          .addMethod(
            getUserActsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserActsRequest,
                stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserActsResponse>(
                  this, METHODID_USER_ACTS)))
          .addMethod(
            getActCurrentCycleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rmintreward.QueryOuterClass.QueryActCurrentCycleRequest,
                stafihub.stafihub.rmintreward.QueryOuterClass.QueryActCurrentCycleResponse>(
                  this, METHODID_ACT_CURRENT_CYCLE)))
          .addMethod(
            getClaimInfoDetailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rmintreward.QueryOuterClass.QueryClaimInfoDetailRequest,
                stafihub.stafihub.rmintreward.QueryOuterClass.QueryClaimInfoDetailResponse>(
                  this, METHODID_CLAIM_INFO_DETAIL)))
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
    public void params(stafihub.stafihub.rmintreward.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rmintreward.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ActLatestCycle items.
     * </pre>
     */
    public void actLatestCycle(stafihub.stafihub.rmintreward.QueryOuterClass.QueryActLatestCycleRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rmintreward.QueryOuterClass.QueryActLatestCycleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getActLatestCycleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ActDetail items.
     * </pre>
     */
    public void actDetail(stafihub.stafihub.rmintreward.QueryOuterClass.QueryActDetailRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rmintreward.QueryOuterClass.QueryActDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getActDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of UserMintCount items.
     * </pre>
     */
    public void userMintCount(stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserMintCountRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserMintCountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserMintCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of UserActs items.
     * </pre>
     */
    public void userActs(stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserActsRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserActsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserActsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ActCurrentCycle items.
     * </pre>
     */
    public void actCurrentCycle(stafihub.stafihub.rmintreward.QueryOuterClass.QueryActCurrentCycleRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rmintreward.QueryOuterClass.QueryActCurrentCycleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getActCurrentCycleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ClaimInfoDetail items.
     * </pre>
     */
    public void claimInfoDetail(stafihub.stafihub.rmintreward.QueryOuterClass.QueryClaimInfoDetailRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rmintreward.QueryOuterClass.QueryClaimInfoDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClaimInfoDetailMethod(), getCallOptions()), request, responseObserver);
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
    public stafihub.stafihub.rmintreward.QueryOuterClass.QueryParamsResponse params(stafihub.stafihub.rmintreward.QueryOuterClass.QueryParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of ActLatestCycle items.
     * </pre>
     */
    public stafihub.stafihub.rmintreward.QueryOuterClass.QueryActLatestCycleResponse actLatestCycle(stafihub.stafihub.rmintreward.QueryOuterClass.QueryActLatestCycleRequest request) {
      return blockingUnaryCall(
          getChannel(), getActLatestCycleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of ActDetail items.
     * </pre>
     */
    public stafihub.stafihub.rmintreward.QueryOuterClass.QueryActDetailResponse actDetail(stafihub.stafihub.rmintreward.QueryOuterClass.QueryActDetailRequest request) {
      return blockingUnaryCall(
          getChannel(), getActDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of UserMintCount items.
     * </pre>
     */
    public stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserMintCountResponse userMintCount(stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserMintCountRequest request) {
      return blockingUnaryCall(
          getChannel(), getUserMintCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of UserActs items.
     * </pre>
     */
    public stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserActsResponse userActs(stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserActsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUserActsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of ActCurrentCycle items.
     * </pre>
     */
    public stafihub.stafihub.rmintreward.QueryOuterClass.QueryActCurrentCycleResponse actCurrentCycle(stafihub.stafihub.rmintreward.QueryOuterClass.QueryActCurrentCycleRequest request) {
      return blockingUnaryCall(
          getChannel(), getActCurrentCycleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of ClaimInfoDetail items.
     * </pre>
     */
    public stafihub.stafihub.rmintreward.QueryOuterClass.QueryClaimInfoDetailResponse claimInfoDetail(stafihub.stafihub.rmintreward.QueryOuterClass.QueryClaimInfoDetailRequest request) {
      return blockingUnaryCall(
          getChannel(), getClaimInfoDetailMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rmintreward.QueryOuterClass.QueryParamsResponse> params(
        stafihub.stafihub.rmintreward.QueryOuterClass.QueryParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of ActLatestCycle items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rmintreward.QueryOuterClass.QueryActLatestCycleResponse> actLatestCycle(
        stafihub.stafihub.rmintreward.QueryOuterClass.QueryActLatestCycleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getActLatestCycleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of ActDetail items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rmintreward.QueryOuterClass.QueryActDetailResponse> actDetail(
        stafihub.stafihub.rmintreward.QueryOuterClass.QueryActDetailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getActDetailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of UserMintCount items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserMintCountResponse> userMintCount(
        stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserMintCountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUserMintCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of UserActs items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserActsResponse> userActs(
        stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserActsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUserActsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of ActCurrentCycle items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rmintreward.QueryOuterClass.QueryActCurrentCycleResponse> actCurrentCycle(
        stafihub.stafihub.rmintreward.QueryOuterClass.QueryActCurrentCycleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getActCurrentCycleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of ClaimInfoDetail items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rmintreward.QueryOuterClass.QueryClaimInfoDetailResponse> claimInfoDetail(
        stafihub.stafihub.rmintreward.QueryOuterClass.QueryClaimInfoDetailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getClaimInfoDetailMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_ACT_LATEST_CYCLE = 1;
  private static final int METHODID_ACT_DETAIL = 2;
  private static final int METHODID_USER_MINT_COUNT = 3;
  private static final int METHODID_USER_ACTS = 4;
  private static final int METHODID_ACT_CURRENT_CYCLE = 5;
  private static final int METHODID_CLAIM_INFO_DETAIL = 6;

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
          serviceImpl.params((stafihub.stafihub.rmintreward.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rmintreward.QueryOuterClass.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_ACT_LATEST_CYCLE:
          serviceImpl.actLatestCycle((stafihub.stafihub.rmintreward.QueryOuterClass.QueryActLatestCycleRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rmintreward.QueryOuterClass.QueryActLatestCycleResponse>) responseObserver);
          break;
        case METHODID_ACT_DETAIL:
          serviceImpl.actDetail((stafihub.stafihub.rmintreward.QueryOuterClass.QueryActDetailRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rmintreward.QueryOuterClass.QueryActDetailResponse>) responseObserver);
          break;
        case METHODID_USER_MINT_COUNT:
          serviceImpl.userMintCount((stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserMintCountRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserMintCountResponse>) responseObserver);
          break;
        case METHODID_USER_ACTS:
          serviceImpl.userActs((stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserActsRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rmintreward.QueryOuterClass.QueryUserActsResponse>) responseObserver);
          break;
        case METHODID_ACT_CURRENT_CYCLE:
          serviceImpl.actCurrentCycle((stafihub.stafihub.rmintreward.QueryOuterClass.QueryActCurrentCycleRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rmintreward.QueryOuterClass.QueryActCurrentCycleResponse>) responseObserver);
          break;
        case METHODID_CLAIM_INFO_DETAIL:
          serviceImpl.claimInfoDetail((stafihub.stafihub.rmintreward.QueryOuterClass.QueryClaimInfoDetailRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rmintreward.QueryOuterClass.QueryClaimInfoDetailResponse>) responseObserver);
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
      return stafihub.stafihub.rmintreward.QueryOuterClass.getDescriptor();
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
              .addMethod(getActLatestCycleMethod())
              .addMethod(getActDetailMethod())
              .addMethod(getUserMintCountMethod())
              .addMethod(getUserActsMethod())
              .addMethod(getActCurrentCycleMethod())
              .addMethod(getClaimInfoDetailMethod())
              .build();
        }
      }
    }
    return result;
  }
}
