package stafihub.claim;

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
    comments = "Source: stafihub/claim/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "stafihub.stafihub.claim.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<stafihub.claim.QueryOuterClass.QueryParamsRequest,
      stafihub.claim.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = stafihub.claim.QueryOuterClass.QueryParamsRequest.class,
      responseType = stafihub.claim.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.claim.QueryOuterClass.QueryParamsRequest,
      stafihub.claim.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<stafihub.claim.QueryOuterClass.QueryParamsRequest, stafihub.claim.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<stafihub.claim.QueryOuterClass.QueryParamsRequest, stafihub.claim.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.claim.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.claim.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.claim.QueryOuterClass.QueryIsClaimedRequest,
      stafihub.claim.QueryOuterClass.QueryIsClaimedResponse> getIsClaimedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsClaimed",
      requestType = stafihub.claim.QueryOuterClass.QueryIsClaimedRequest.class,
      responseType = stafihub.claim.QueryOuterClass.QueryIsClaimedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.claim.QueryOuterClass.QueryIsClaimedRequest,
      stafihub.claim.QueryOuterClass.QueryIsClaimedResponse> getIsClaimedMethod() {
    io.grpc.MethodDescriptor<stafihub.claim.QueryOuterClass.QueryIsClaimedRequest, stafihub.claim.QueryOuterClass.QueryIsClaimedResponse> getIsClaimedMethod;
    if ((getIsClaimedMethod = QueryGrpc.getIsClaimedMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getIsClaimedMethod = QueryGrpc.getIsClaimedMethod) == null) {
          QueryGrpc.getIsClaimedMethod = getIsClaimedMethod =
              io.grpc.MethodDescriptor.<stafihub.claim.QueryOuterClass.QueryIsClaimedRequest, stafihub.claim.QueryOuterClass.QueryIsClaimedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsClaimed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.claim.QueryOuterClass.QueryIsClaimedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.claim.QueryOuterClass.QueryIsClaimedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("IsClaimed"))
              .build();
        }
      }
    }
    return getIsClaimedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.claim.QueryOuterClass.QueryClaimSwitchRequest,
      stafihub.claim.QueryOuterClass.QueryClaimSwitchResponse> getClaimSwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimSwitch",
      requestType = stafihub.claim.QueryOuterClass.QueryClaimSwitchRequest.class,
      responseType = stafihub.claim.QueryOuterClass.QueryClaimSwitchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.claim.QueryOuterClass.QueryClaimSwitchRequest,
      stafihub.claim.QueryOuterClass.QueryClaimSwitchResponse> getClaimSwitchMethod() {
    io.grpc.MethodDescriptor<stafihub.claim.QueryOuterClass.QueryClaimSwitchRequest, stafihub.claim.QueryOuterClass.QueryClaimSwitchResponse> getClaimSwitchMethod;
    if ((getClaimSwitchMethod = QueryGrpc.getClaimSwitchMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClaimSwitchMethod = QueryGrpc.getClaimSwitchMethod) == null) {
          QueryGrpc.getClaimSwitchMethod = getClaimSwitchMethod =
              io.grpc.MethodDescriptor.<stafihub.claim.QueryOuterClass.QueryClaimSwitchRequest, stafihub.claim.QueryOuterClass.QueryClaimSwitchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimSwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.claim.QueryOuterClass.QueryClaimSwitchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.claim.QueryOuterClass.QueryClaimSwitchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ClaimSwitch"))
              .build();
        }
      }
    }
    return getClaimSwitchMethod;
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
    public void params(stafihub.claim.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<stafihub.claim.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of IsClaimed items.
     * </pre>
     */
    public void isClaimed(stafihub.claim.QueryOuterClass.QueryIsClaimedRequest request,
        io.grpc.stub.StreamObserver<stafihub.claim.QueryOuterClass.QueryIsClaimedResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getIsClaimedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ClaimSwitch items.
     * </pre>
     */
    public void claimSwitch(stafihub.claim.QueryOuterClass.QueryClaimSwitchRequest request,
        io.grpc.stub.StreamObserver<stafihub.claim.QueryOuterClass.QueryClaimSwitchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClaimSwitchMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.claim.QueryOuterClass.QueryParamsRequest,
                stafihub.claim.QueryOuterClass.QueryParamsResponse>(
                  this, METHODID_PARAMS)))
          .addMethod(
            getIsClaimedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.claim.QueryOuterClass.QueryIsClaimedRequest,
                stafihub.claim.QueryOuterClass.QueryIsClaimedResponse>(
                  this, METHODID_IS_CLAIMED)))
          .addMethod(
            getClaimSwitchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.claim.QueryOuterClass.QueryClaimSwitchRequest,
                stafihub.claim.QueryOuterClass.QueryClaimSwitchResponse>(
                  this, METHODID_CLAIM_SWITCH)))
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
    public void params(stafihub.claim.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<stafihub.claim.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of IsClaimed items.
     * </pre>
     */
    public void isClaimed(stafihub.claim.QueryOuterClass.QueryIsClaimedRequest request,
        io.grpc.stub.StreamObserver<stafihub.claim.QueryOuterClass.QueryIsClaimedResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIsClaimedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ClaimSwitch items.
     * </pre>
     */
    public void claimSwitch(stafihub.claim.QueryOuterClass.QueryClaimSwitchRequest request,
        io.grpc.stub.StreamObserver<stafihub.claim.QueryOuterClass.QueryClaimSwitchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClaimSwitchMethod(), getCallOptions()), request, responseObserver);
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
    public stafihub.claim.QueryOuterClass.QueryParamsResponse params(stafihub.claim.QueryOuterClass.QueryParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of IsClaimed items.
     * </pre>
     */
    public stafihub.claim.QueryOuterClass.QueryIsClaimedResponse isClaimed(stafihub.claim.QueryOuterClass.QueryIsClaimedRequest request) {
      return blockingUnaryCall(
          getChannel(), getIsClaimedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of ClaimSwitch items.
     * </pre>
     */
    public stafihub.claim.QueryOuterClass.QueryClaimSwitchResponse claimSwitch(stafihub.claim.QueryOuterClass.QueryClaimSwitchRequest request) {
      return blockingUnaryCall(
          getChannel(), getClaimSwitchMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<stafihub.claim.QueryOuterClass.QueryParamsResponse> params(
        stafihub.claim.QueryOuterClass.QueryParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of IsClaimed items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.claim.QueryOuterClass.QueryIsClaimedResponse> isClaimed(
        stafihub.claim.QueryOuterClass.QueryIsClaimedRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getIsClaimedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of ClaimSwitch items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.claim.QueryOuterClass.QueryClaimSwitchResponse> claimSwitch(
        stafihub.claim.QueryOuterClass.QueryClaimSwitchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getClaimSwitchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_IS_CLAIMED = 1;
  private static final int METHODID_CLAIM_SWITCH = 2;

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
          serviceImpl.params((stafihub.claim.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.claim.QueryOuterClass.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_IS_CLAIMED:
          serviceImpl.isClaimed((stafihub.claim.QueryOuterClass.QueryIsClaimedRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.claim.QueryOuterClass.QueryIsClaimedResponse>) responseObserver);
          break;
        case METHODID_CLAIM_SWITCH:
          serviceImpl.claimSwitch((stafihub.claim.QueryOuterClass.QueryClaimSwitchRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.claim.QueryOuterClass.QueryClaimSwitchResponse>) responseObserver);
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
      return stafihub.claim.QueryOuterClass.getDescriptor();
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
              .addMethod(getIsClaimedMethod())
              .addMethod(getClaimSwitchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
