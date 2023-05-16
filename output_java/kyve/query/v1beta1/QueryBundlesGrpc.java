package kyve.query.v1beta1;

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
 * QueryDelegation contains all rpc requests related to direct delegation data
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: kyve/query/v1beta1/bundles.proto")
public final class QueryBundlesGrpc {

  private QueryBundlesGrpc() {}

  public static final String SERVICE_NAME = "kyve.query.v1beta1.QueryBundles";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<kyve.query.v1beta1.Bundles.QueryFinalizedBundlesRequest,
      kyve.query.v1beta1.Bundles.QueryFinalizedBundlesResponse> getFinalizedBundlesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FinalizedBundles",
      requestType = kyve.query.v1beta1.Bundles.QueryFinalizedBundlesRequest.class,
      responseType = kyve.query.v1beta1.Bundles.QueryFinalizedBundlesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.query.v1beta1.Bundles.QueryFinalizedBundlesRequest,
      kyve.query.v1beta1.Bundles.QueryFinalizedBundlesResponse> getFinalizedBundlesMethod() {
    io.grpc.MethodDescriptor<kyve.query.v1beta1.Bundles.QueryFinalizedBundlesRequest, kyve.query.v1beta1.Bundles.QueryFinalizedBundlesResponse> getFinalizedBundlesMethod;
    if ((getFinalizedBundlesMethod = QueryBundlesGrpc.getFinalizedBundlesMethod) == null) {
      synchronized (QueryBundlesGrpc.class) {
        if ((getFinalizedBundlesMethod = QueryBundlesGrpc.getFinalizedBundlesMethod) == null) {
          QueryBundlesGrpc.getFinalizedBundlesMethod = getFinalizedBundlesMethod =
              io.grpc.MethodDescriptor.<kyve.query.v1beta1.Bundles.QueryFinalizedBundlesRequest, kyve.query.v1beta1.Bundles.QueryFinalizedBundlesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FinalizedBundles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Bundles.QueryFinalizedBundlesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Bundles.QueryFinalizedBundlesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryBundlesMethodDescriptorSupplier("FinalizedBundles"))
              .build();
        }
      }
    }
    return getFinalizedBundlesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.query.v1beta1.Bundles.QueryFinalizedBundleRequest,
      kyve.query.v1beta1.Bundles.QueryFinalizedBundleResponse> getFinalizedBundleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FinalizedBundle",
      requestType = kyve.query.v1beta1.Bundles.QueryFinalizedBundleRequest.class,
      responseType = kyve.query.v1beta1.Bundles.QueryFinalizedBundleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.query.v1beta1.Bundles.QueryFinalizedBundleRequest,
      kyve.query.v1beta1.Bundles.QueryFinalizedBundleResponse> getFinalizedBundleMethod() {
    io.grpc.MethodDescriptor<kyve.query.v1beta1.Bundles.QueryFinalizedBundleRequest, kyve.query.v1beta1.Bundles.QueryFinalizedBundleResponse> getFinalizedBundleMethod;
    if ((getFinalizedBundleMethod = QueryBundlesGrpc.getFinalizedBundleMethod) == null) {
      synchronized (QueryBundlesGrpc.class) {
        if ((getFinalizedBundleMethod = QueryBundlesGrpc.getFinalizedBundleMethod) == null) {
          QueryBundlesGrpc.getFinalizedBundleMethod = getFinalizedBundleMethod =
              io.grpc.MethodDescriptor.<kyve.query.v1beta1.Bundles.QueryFinalizedBundleRequest, kyve.query.v1beta1.Bundles.QueryFinalizedBundleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FinalizedBundle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Bundles.QueryFinalizedBundleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Bundles.QueryFinalizedBundleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryBundlesMethodDescriptorSupplier("FinalizedBundle"))
              .build();
        }
      }
    }
    return getFinalizedBundleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.query.v1beta1.Bundles.QueryFinalizedBundlesByHeightRequest,
      kyve.query.v1beta1.Bundles.QueryFinalizedBundlesByHeightResponse> getFinalizedBundlesByHeightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FinalizedBundlesByHeight",
      requestType = kyve.query.v1beta1.Bundles.QueryFinalizedBundlesByHeightRequest.class,
      responseType = kyve.query.v1beta1.Bundles.QueryFinalizedBundlesByHeightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.query.v1beta1.Bundles.QueryFinalizedBundlesByHeightRequest,
      kyve.query.v1beta1.Bundles.QueryFinalizedBundlesByHeightResponse> getFinalizedBundlesByHeightMethod() {
    io.grpc.MethodDescriptor<kyve.query.v1beta1.Bundles.QueryFinalizedBundlesByHeightRequest, kyve.query.v1beta1.Bundles.QueryFinalizedBundlesByHeightResponse> getFinalizedBundlesByHeightMethod;
    if ((getFinalizedBundlesByHeightMethod = QueryBundlesGrpc.getFinalizedBundlesByHeightMethod) == null) {
      synchronized (QueryBundlesGrpc.class) {
        if ((getFinalizedBundlesByHeightMethod = QueryBundlesGrpc.getFinalizedBundlesByHeightMethod) == null) {
          QueryBundlesGrpc.getFinalizedBundlesByHeightMethod = getFinalizedBundlesByHeightMethod =
              io.grpc.MethodDescriptor.<kyve.query.v1beta1.Bundles.QueryFinalizedBundlesByHeightRequest, kyve.query.v1beta1.Bundles.QueryFinalizedBundlesByHeightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FinalizedBundlesByHeight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Bundles.QueryFinalizedBundlesByHeightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Bundles.QueryFinalizedBundlesByHeightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryBundlesMethodDescriptorSupplier("FinalizedBundlesByHeight"))
              .build();
        }
      }
    }
    return getFinalizedBundlesByHeightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.query.v1beta1.Bundles.QueryCurrentVoteStatusRequest,
      kyve.query.v1beta1.Bundles.QueryCurrentVoteStatusResponse> getCurrentVoteStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CurrentVoteStatus",
      requestType = kyve.query.v1beta1.Bundles.QueryCurrentVoteStatusRequest.class,
      responseType = kyve.query.v1beta1.Bundles.QueryCurrentVoteStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.query.v1beta1.Bundles.QueryCurrentVoteStatusRequest,
      kyve.query.v1beta1.Bundles.QueryCurrentVoteStatusResponse> getCurrentVoteStatusMethod() {
    io.grpc.MethodDescriptor<kyve.query.v1beta1.Bundles.QueryCurrentVoteStatusRequest, kyve.query.v1beta1.Bundles.QueryCurrentVoteStatusResponse> getCurrentVoteStatusMethod;
    if ((getCurrentVoteStatusMethod = QueryBundlesGrpc.getCurrentVoteStatusMethod) == null) {
      synchronized (QueryBundlesGrpc.class) {
        if ((getCurrentVoteStatusMethod = QueryBundlesGrpc.getCurrentVoteStatusMethod) == null) {
          QueryBundlesGrpc.getCurrentVoteStatusMethod = getCurrentVoteStatusMethod =
              io.grpc.MethodDescriptor.<kyve.query.v1beta1.Bundles.QueryCurrentVoteStatusRequest, kyve.query.v1beta1.Bundles.QueryCurrentVoteStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CurrentVoteStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Bundles.QueryCurrentVoteStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Bundles.QueryCurrentVoteStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryBundlesMethodDescriptorSupplier("CurrentVoteStatus"))
              .build();
        }
      }
    }
    return getCurrentVoteStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.query.v1beta1.Bundles.QueryCanValidateRequest,
      kyve.query.v1beta1.Bundles.QueryCanValidateResponse> getCanValidateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CanValidate",
      requestType = kyve.query.v1beta1.Bundles.QueryCanValidateRequest.class,
      responseType = kyve.query.v1beta1.Bundles.QueryCanValidateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.query.v1beta1.Bundles.QueryCanValidateRequest,
      kyve.query.v1beta1.Bundles.QueryCanValidateResponse> getCanValidateMethod() {
    io.grpc.MethodDescriptor<kyve.query.v1beta1.Bundles.QueryCanValidateRequest, kyve.query.v1beta1.Bundles.QueryCanValidateResponse> getCanValidateMethod;
    if ((getCanValidateMethod = QueryBundlesGrpc.getCanValidateMethod) == null) {
      synchronized (QueryBundlesGrpc.class) {
        if ((getCanValidateMethod = QueryBundlesGrpc.getCanValidateMethod) == null) {
          QueryBundlesGrpc.getCanValidateMethod = getCanValidateMethod =
              io.grpc.MethodDescriptor.<kyve.query.v1beta1.Bundles.QueryCanValidateRequest, kyve.query.v1beta1.Bundles.QueryCanValidateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CanValidate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Bundles.QueryCanValidateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Bundles.QueryCanValidateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryBundlesMethodDescriptorSupplier("CanValidate"))
              .build();
        }
      }
    }
    return getCanValidateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.query.v1beta1.Bundles.QueryCanProposeRequest,
      kyve.query.v1beta1.Bundles.QueryCanProposeResponse> getCanProposeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CanPropose",
      requestType = kyve.query.v1beta1.Bundles.QueryCanProposeRequest.class,
      responseType = kyve.query.v1beta1.Bundles.QueryCanProposeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.query.v1beta1.Bundles.QueryCanProposeRequest,
      kyve.query.v1beta1.Bundles.QueryCanProposeResponse> getCanProposeMethod() {
    io.grpc.MethodDescriptor<kyve.query.v1beta1.Bundles.QueryCanProposeRequest, kyve.query.v1beta1.Bundles.QueryCanProposeResponse> getCanProposeMethod;
    if ((getCanProposeMethod = QueryBundlesGrpc.getCanProposeMethod) == null) {
      synchronized (QueryBundlesGrpc.class) {
        if ((getCanProposeMethod = QueryBundlesGrpc.getCanProposeMethod) == null) {
          QueryBundlesGrpc.getCanProposeMethod = getCanProposeMethod =
              io.grpc.MethodDescriptor.<kyve.query.v1beta1.Bundles.QueryCanProposeRequest, kyve.query.v1beta1.Bundles.QueryCanProposeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CanPropose"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Bundles.QueryCanProposeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Bundles.QueryCanProposeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryBundlesMethodDescriptorSupplier("CanPropose"))
              .build();
        }
      }
    }
    return getCanProposeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.query.v1beta1.Bundles.QueryCanVoteRequest,
      kyve.query.v1beta1.Bundles.QueryCanVoteResponse> getCanVoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CanVote",
      requestType = kyve.query.v1beta1.Bundles.QueryCanVoteRequest.class,
      responseType = kyve.query.v1beta1.Bundles.QueryCanVoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.query.v1beta1.Bundles.QueryCanVoteRequest,
      kyve.query.v1beta1.Bundles.QueryCanVoteResponse> getCanVoteMethod() {
    io.grpc.MethodDescriptor<kyve.query.v1beta1.Bundles.QueryCanVoteRequest, kyve.query.v1beta1.Bundles.QueryCanVoteResponse> getCanVoteMethod;
    if ((getCanVoteMethod = QueryBundlesGrpc.getCanVoteMethod) == null) {
      synchronized (QueryBundlesGrpc.class) {
        if ((getCanVoteMethod = QueryBundlesGrpc.getCanVoteMethod) == null) {
          QueryBundlesGrpc.getCanVoteMethod = getCanVoteMethod =
              io.grpc.MethodDescriptor.<kyve.query.v1beta1.Bundles.QueryCanVoteRequest, kyve.query.v1beta1.Bundles.QueryCanVoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CanVote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Bundles.QueryCanVoteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Bundles.QueryCanVoteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryBundlesMethodDescriptorSupplier("CanVote"))
              .build();
        }
      }
    }
    return getCanVoteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryBundlesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryBundlesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryBundlesStub>() {
        @java.lang.Override
        public QueryBundlesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryBundlesStub(channel, callOptions);
        }
      };
    return QueryBundlesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryBundlesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryBundlesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryBundlesBlockingStub>() {
        @java.lang.Override
        public QueryBundlesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryBundlesBlockingStub(channel, callOptions);
        }
      };
    return QueryBundlesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryBundlesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryBundlesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryBundlesFutureStub>() {
        @java.lang.Override
        public QueryBundlesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryBundlesFutureStub(channel, callOptions);
        }
      };
    return QueryBundlesFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * QueryDelegation contains all rpc requests related to direct delegation data
   * </pre>
   */
  public static abstract class QueryBundlesImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * FinalizedBundles ...
     * </pre>
     */
    public void finalizedBundles(kyve.query.v1beta1.Bundles.QueryFinalizedBundlesRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Bundles.QueryFinalizedBundlesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFinalizedBundlesMethod(), responseObserver);
    }

    /**
     * <pre>
     * FinalizedBundle ...
     * </pre>
     */
    public void finalizedBundle(kyve.query.v1beta1.Bundles.QueryFinalizedBundleRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Bundles.QueryFinalizedBundleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFinalizedBundleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries the bundle which contains the data given height
     * </pre>
     */
    public void finalizedBundlesByHeight(kyve.query.v1beta1.Bundles.QueryFinalizedBundlesByHeightRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Bundles.QueryFinalizedBundlesByHeightResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFinalizedBundlesByHeightMethod(), responseObserver);
    }

    /**
     * <pre>
     * CurrentVoteStatus ...
     * </pre>
     */
    public void currentVoteStatus(kyve.query.v1beta1.Bundles.QueryCurrentVoteStatusRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Bundles.QueryCurrentVoteStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCurrentVoteStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * CanValidate ...
     * </pre>
     */
    public void canValidate(kyve.query.v1beta1.Bundles.QueryCanValidateRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Bundles.QueryCanValidateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCanValidateMethod(), responseObserver);
    }

    /**
     * <pre>
     * CanPropose ...
     * </pre>
     */
    public void canPropose(kyve.query.v1beta1.Bundles.QueryCanProposeRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Bundles.QueryCanProposeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCanProposeMethod(), responseObserver);
    }

    /**
     * <pre>
     * CanVote checks if voter on pool can still vote for the given bundle
     * </pre>
     */
    public void canVote(kyve.query.v1beta1.Bundles.QueryCanVoteRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Bundles.QueryCanVoteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCanVoteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFinalizedBundlesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.query.v1beta1.Bundles.QueryFinalizedBundlesRequest,
                kyve.query.v1beta1.Bundles.QueryFinalizedBundlesResponse>(
                  this, METHODID_FINALIZED_BUNDLES)))
          .addMethod(
            getFinalizedBundleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.query.v1beta1.Bundles.QueryFinalizedBundleRequest,
                kyve.query.v1beta1.Bundles.QueryFinalizedBundleResponse>(
                  this, METHODID_FINALIZED_BUNDLE)))
          .addMethod(
            getFinalizedBundlesByHeightMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.query.v1beta1.Bundles.QueryFinalizedBundlesByHeightRequest,
                kyve.query.v1beta1.Bundles.QueryFinalizedBundlesByHeightResponse>(
                  this, METHODID_FINALIZED_BUNDLES_BY_HEIGHT)))
          .addMethod(
            getCurrentVoteStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.query.v1beta1.Bundles.QueryCurrentVoteStatusRequest,
                kyve.query.v1beta1.Bundles.QueryCurrentVoteStatusResponse>(
                  this, METHODID_CURRENT_VOTE_STATUS)))
          .addMethod(
            getCanValidateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.query.v1beta1.Bundles.QueryCanValidateRequest,
                kyve.query.v1beta1.Bundles.QueryCanValidateResponse>(
                  this, METHODID_CAN_VALIDATE)))
          .addMethod(
            getCanProposeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.query.v1beta1.Bundles.QueryCanProposeRequest,
                kyve.query.v1beta1.Bundles.QueryCanProposeResponse>(
                  this, METHODID_CAN_PROPOSE)))
          .addMethod(
            getCanVoteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.query.v1beta1.Bundles.QueryCanVoteRequest,
                kyve.query.v1beta1.Bundles.QueryCanVoteResponse>(
                  this, METHODID_CAN_VOTE)))
          .build();
    }
  }

  /**
   * <pre>
   * QueryDelegation contains all rpc requests related to direct delegation data
   * </pre>
   */
  public static final class QueryBundlesStub extends io.grpc.stub.AbstractAsyncStub<QueryBundlesStub> {
    private QueryBundlesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryBundlesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryBundlesStub(channel, callOptions);
    }

    /**
     * <pre>
     * FinalizedBundles ...
     * </pre>
     */
    public void finalizedBundles(kyve.query.v1beta1.Bundles.QueryFinalizedBundlesRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Bundles.QueryFinalizedBundlesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFinalizedBundlesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FinalizedBundle ...
     * </pre>
     */
    public void finalizedBundle(kyve.query.v1beta1.Bundles.QueryFinalizedBundleRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Bundles.QueryFinalizedBundleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFinalizedBundleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries the bundle which contains the data given height
     * </pre>
     */
    public void finalizedBundlesByHeight(kyve.query.v1beta1.Bundles.QueryFinalizedBundlesByHeightRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Bundles.QueryFinalizedBundlesByHeightResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFinalizedBundlesByHeightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CurrentVoteStatus ...
     * </pre>
     */
    public void currentVoteStatus(kyve.query.v1beta1.Bundles.QueryCurrentVoteStatusRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Bundles.QueryCurrentVoteStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCurrentVoteStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CanValidate ...
     * </pre>
     */
    public void canValidate(kyve.query.v1beta1.Bundles.QueryCanValidateRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Bundles.QueryCanValidateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCanValidateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CanPropose ...
     * </pre>
     */
    public void canPropose(kyve.query.v1beta1.Bundles.QueryCanProposeRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Bundles.QueryCanProposeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCanProposeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CanVote checks if voter on pool can still vote for the given bundle
     * </pre>
     */
    public void canVote(kyve.query.v1beta1.Bundles.QueryCanVoteRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Bundles.QueryCanVoteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCanVoteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * QueryDelegation contains all rpc requests related to direct delegation data
   * </pre>
   */
  public static final class QueryBundlesBlockingStub extends io.grpc.stub.AbstractBlockingStub<QueryBundlesBlockingStub> {
    private QueryBundlesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryBundlesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryBundlesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * FinalizedBundles ...
     * </pre>
     */
    public kyve.query.v1beta1.Bundles.QueryFinalizedBundlesResponse finalizedBundles(kyve.query.v1beta1.Bundles.QueryFinalizedBundlesRequest request) {
      return blockingUnaryCall(
          getChannel(), getFinalizedBundlesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FinalizedBundle ...
     * </pre>
     */
    public kyve.query.v1beta1.Bundles.QueryFinalizedBundleResponse finalizedBundle(kyve.query.v1beta1.Bundles.QueryFinalizedBundleRequest request) {
      return blockingUnaryCall(
          getChannel(), getFinalizedBundleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries the bundle which contains the data given height
     * </pre>
     */
    public kyve.query.v1beta1.Bundles.QueryFinalizedBundlesByHeightResponse finalizedBundlesByHeight(kyve.query.v1beta1.Bundles.QueryFinalizedBundlesByHeightRequest request) {
      return blockingUnaryCall(
          getChannel(), getFinalizedBundlesByHeightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CurrentVoteStatus ...
     * </pre>
     */
    public kyve.query.v1beta1.Bundles.QueryCurrentVoteStatusResponse currentVoteStatus(kyve.query.v1beta1.Bundles.QueryCurrentVoteStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getCurrentVoteStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CanValidate ...
     * </pre>
     */
    public kyve.query.v1beta1.Bundles.QueryCanValidateResponse canValidate(kyve.query.v1beta1.Bundles.QueryCanValidateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCanValidateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CanPropose ...
     * </pre>
     */
    public kyve.query.v1beta1.Bundles.QueryCanProposeResponse canPropose(kyve.query.v1beta1.Bundles.QueryCanProposeRequest request) {
      return blockingUnaryCall(
          getChannel(), getCanProposeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CanVote checks if voter on pool can still vote for the given bundle
     * </pre>
     */
    public kyve.query.v1beta1.Bundles.QueryCanVoteResponse canVote(kyve.query.v1beta1.Bundles.QueryCanVoteRequest request) {
      return blockingUnaryCall(
          getChannel(), getCanVoteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * QueryDelegation contains all rpc requests related to direct delegation data
   * </pre>
   */
  public static final class QueryBundlesFutureStub extends io.grpc.stub.AbstractFutureStub<QueryBundlesFutureStub> {
    private QueryBundlesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryBundlesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryBundlesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * FinalizedBundles ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.query.v1beta1.Bundles.QueryFinalizedBundlesResponse> finalizedBundles(
        kyve.query.v1beta1.Bundles.QueryFinalizedBundlesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFinalizedBundlesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FinalizedBundle ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.query.v1beta1.Bundles.QueryFinalizedBundleResponse> finalizedBundle(
        kyve.query.v1beta1.Bundles.QueryFinalizedBundleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFinalizedBundleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries the bundle which contains the data given height
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.query.v1beta1.Bundles.QueryFinalizedBundlesByHeightResponse> finalizedBundlesByHeight(
        kyve.query.v1beta1.Bundles.QueryFinalizedBundlesByHeightRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFinalizedBundlesByHeightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CurrentVoteStatus ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.query.v1beta1.Bundles.QueryCurrentVoteStatusResponse> currentVoteStatus(
        kyve.query.v1beta1.Bundles.QueryCurrentVoteStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCurrentVoteStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CanValidate ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.query.v1beta1.Bundles.QueryCanValidateResponse> canValidate(
        kyve.query.v1beta1.Bundles.QueryCanValidateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCanValidateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CanPropose ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.query.v1beta1.Bundles.QueryCanProposeResponse> canPropose(
        kyve.query.v1beta1.Bundles.QueryCanProposeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCanProposeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CanVote checks if voter on pool can still vote for the given bundle
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.query.v1beta1.Bundles.QueryCanVoteResponse> canVote(
        kyve.query.v1beta1.Bundles.QueryCanVoteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCanVoteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FINALIZED_BUNDLES = 0;
  private static final int METHODID_FINALIZED_BUNDLE = 1;
  private static final int METHODID_FINALIZED_BUNDLES_BY_HEIGHT = 2;
  private static final int METHODID_CURRENT_VOTE_STATUS = 3;
  private static final int METHODID_CAN_VALIDATE = 4;
  private static final int METHODID_CAN_PROPOSE = 5;
  private static final int METHODID_CAN_VOTE = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QueryBundlesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QueryBundlesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FINALIZED_BUNDLES:
          serviceImpl.finalizedBundles((kyve.query.v1beta1.Bundles.QueryFinalizedBundlesRequest) request,
              (io.grpc.stub.StreamObserver<kyve.query.v1beta1.Bundles.QueryFinalizedBundlesResponse>) responseObserver);
          break;
        case METHODID_FINALIZED_BUNDLE:
          serviceImpl.finalizedBundle((kyve.query.v1beta1.Bundles.QueryFinalizedBundleRequest) request,
              (io.grpc.stub.StreamObserver<kyve.query.v1beta1.Bundles.QueryFinalizedBundleResponse>) responseObserver);
          break;
        case METHODID_FINALIZED_BUNDLES_BY_HEIGHT:
          serviceImpl.finalizedBundlesByHeight((kyve.query.v1beta1.Bundles.QueryFinalizedBundlesByHeightRequest) request,
              (io.grpc.stub.StreamObserver<kyve.query.v1beta1.Bundles.QueryFinalizedBundlesByHeightResponse>) responseObserver);
          break;
        case METHODID_CURRENT_VOTE_STATUS:
          serviceImpl.currentVoteStatus((kyve.query.v1beta1.Bundles.QueryCurrentVoteStatusRequest) request,
              (io.grpc.stub.StreamObserver<kyve.query.v1beta1.Bundles.QueryCurrentVoteStatusResponse>) responseObserver);
          break;
        case METHODID_CAN_VALIDATE:
          serviceImpl.canValidate((kyve.query.v1beta1.Bundles.QueryCanValidateRequest) request,
              (io.grpc.stub.StreamObserver<kyve.query.v1beta1.Bundles.QueryCanValidateResponse>) responseObserver);
          break;
        case METHODID_CAN_PROPOSE:
          serviceImpl.canPropose((kyve.query.v1beta1.Bundles.QueryCanProposeRequest) request,
              (io.grpc.stub.StreamObserver<kyve.query.v1beta1.Bundles.QueryCanProposeResponse>) responseObserver);
          break;
        case METHODID_CAN_VOTE:
          serviceImpl.canVote((kyve.query.v1beta1.Bundles.QueryCanVoteRequest) request,
              (io.grpc.stub.StreamObserver<kyve.query.v1beta1.Bundles.QueryCanVoteResponse>) responseObserver);
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

  private static abstract class QueryBundlesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBundlesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return kyve.query.v1beta1.Bundles.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QueryBundles");
    }
  }

  private static final class QueryBundlesFileDescriptorSupplier
      extends QueryBundlesBaseDescriptorSupplier {
    QueryBundlesFileDescriptorSupplier() {}
  }

  private static final class QueryBundlesMethodDescriptorSupplier
      extends QueryBundlesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryBundlesMethodDescriptorSupplier(String methodName) {
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
      synchronized (QueryBundlesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryBundlesFileDescriptorSupplier())
              .addMethod(getFinalizedBundlesMethod())
              .addMethod(getFinalizedBundleMethod())
              .addMethod(getFinalizedBundlesByHeightMethod())
              .addMethod(getCurrentVoteStatusMethod())
              .addMethod(getCanValidateMethod())
              .addMethod(getCanProposeMethod())
              .addMethod(getCanVoteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
