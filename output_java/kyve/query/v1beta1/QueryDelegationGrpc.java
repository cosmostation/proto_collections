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
    comments = "Source: kyve/query/v1beta1/delegation.proto")
public final class QueryDelegationGrpc {

  private QueryDelegationGrpc() {}

  public static final String SERVICE_NAME = "kyve.query.v1beta1.QueryDelegation";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<kyve.query.v1beta1.Delegation.QueryDelegatorRequest,
      kyve.query.v1beta1.Delegation.QueryDelegatorResponse> getDelegatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delegator",
      requestType = kyve.query.v1beta1.Delegation.QueryDelegatorRequest.class,
      responseType = kyve.query.v1beta1.Delegation.QueryDelegatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.query.v1beta1.Delegation.QueryDelegatorRequest,
      kyve.query.v1beta1.Delegation.QueryDelegatorResponse> getDelegatorMethod() {
    io.grpc.MethodDescriptor<kyve.query.v1beta1.Delegation.QueryDelegatorRequest, kyve.query.v1beta1.Delegation.QueryDelegatorResponse> getDelegatorMethod;
    if ((getDelegatorMethod = QueryDelegationGrpc.getDelegatorMethod) == null) {
      synchronized (QueryDelegationGrpc.class) {
        if ((getDelegatorMethod = QueryDelegationGrpc.getDelegatorMethod) == null) {
          QueryDelegationGrpc.getDelegatorMethod = getDelegatorMethod =
              io.grpc.MethodDescriptor.<kyve.query.v1beta1.Delegation.QueryDelegatorRequest, kyve.query.v1beta1.Delegation.QueryDelegatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delegator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Delegation.QueryDelegatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Delegation.QueryDelegatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryDelegationMethodDescriptorSupplier("Delegator"))
              .build();
        }
      }
    }
    return getDelegatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.query.v1beta1.Delegation.QueryDelegatorsByStakerRequest,
      kyve.query.v1beta1.Delegation.QueryDelegatorsByStakerResponse> getDelegatorsByStakerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DelegatorsByStaker",
      requestType = kyve.query.v1beta1.Delegation.QueryDelegatorsByStakerRequest.class,
      responseType = kyve.query.v1beta1.Delegation.QueryDelegatorsByStakerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.query.v1beta1.Delegation.QueryDelegatorsByStakerRequest,
      kyve.query.v1beta1.Delegation.QueryDelegatorsByStakerResponse> getDelegatorsByStakerMethod() {
    io.grpc.MethodDescriptor<kyve.query.v1beta1.Delegation.QueryDelegatorsByStakerRequest, kyve.query.v1beta1.Delegation.QueryDelegatorsByStakerResponse> getDelegatorsByStakerMethod;
    if ((getDelegatorsByStakerMethod = QueryDelegationGrpc.getDelegatorsByStakerMethod) == null) {
      synchronized (QueryDelegationGrpc.class) {
        if ((getDelegatorsByStakerMethod = QueryDelegationGrpc.getDelegatorsByStakerMethod) == null) {
          QueryDelegationGrpc.getDelegatorsByStakerMethod = getDelegatorsByStakerMethod =
              io.grpc.MethodDescriptor.<kyve.query.v1beta1.Delegation.QueryDelegatorsByStakerRequest, kyve.query.v1beta1.Delegation.QueryDelegatorsByStakerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DelegatorsByStaker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Delegation.QueryDelegatorsByStakerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Delegation.QueryDelegatorsByStakerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryDelegationMethodDescriptorSupplier("DelegatorsByStaker"))
              .build();
        }
      }
    }
    return getDelegatorsByStakerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.query.v1beta1.Delegation.QueryStakersByDelegatorRequest,
      kyve.query.v1beta1.Delegation.QueryStakersByDelegatorResponse> getStakersByDelegatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StakersByDelegator",
      requestType = kyve.query.v1beta1.Delegation.QueryStakersByDelegatorRequest.class,
      responseType = kyve.query.v1beta1.Delegation.QueryStakersByDelegatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.query.v1beta1.Delegation.QueryStakersByDelegatorRequest,
      kyve.query.v1beta1.Delegation.QueryStakersByDelegatorResponse> getStakersByDelegatorMethod() {
    io.grpc.MethodDescriptor<kyve.query.v1beta1.Delegation.QueryStakersByDelegatorRequest, kyve.query.v1beta1.Delegation.QueryStakersByDelegatorResponse> getStakersByDelegatorMethod;
    if ((getStakersByDelegatorMethod = QueryDelegationGrpc.getStakersByDelegatorMethod) == null) {
      synchronized (QueryDelegationGrpc.class) {
        if ((getStakersByDelegatorMethod = QueryDelegationGrpc.getStakersByDelegatorMethod) == null) {
          QueryDelegationGrpc.getStakersByDelegatorMethod = getStakersByDelegatorMethod =
              io.grpc.MethodDescriptor.<kyve.query.v1beta1.Delegation.QueryStakersByDelegatorRequest, kyve.query.v1beta1.Delegation.QueryStakersByDelegatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StakersByDelegator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Delegation.QueryStakersByDelegatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Delegation.QueryStakersByDelegatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryDelegationMethodDescriptorSupplier("StakersByDelegator"))
              .build();
        }
      }
    }
    return getStakersByDelegatorMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryDelegationStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryDelegationStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryDelegationStub>() {
        @java.lang.Override
        public QueryDelegationStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryDelegationStub(channel, callOptions);
        }
      };
    return QueryDelegationStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryDelegationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryDelegationBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryDelegationBlockingStub>() {
        @java.lang.Override
        public QueryDelegationBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryDelegationBlockingStub(channel, callOptions);
        }
      };
    return QueryDelegationBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryDelegationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryDelegationFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryDelegationFutureStub>() {
        @java.lang.Override
        public QueryDelegationFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryDelegationFutureStub(channel, callOptions);
        }
      };
    return QueryDelegationFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * QueryDelegation contains all rpc requests related to direct delegation data
   * </pre>
   */
  public static abstract class QueryDelegationImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Delegator returns delegation information for a specific delegator of a specific staker.
     * </pre>
     */
    public void delegator(kyve.query.v1beta1.Delegation.QueryDelegatorRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Delegation.QueryDelegatorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDelegatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * DelegatorsByStaker returns all delegators that have delegated to the given staker
     * This query is paginated.
     * </pre>
     */
    public void delegatorsByStaker(kyve.query.v1beta1.Delegation.QueryDelegatorsByStakerRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Delegation.QueryDelegatorsByStakerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDelegatorsByStakerMethod(), responseObserver);
    }

    /**
     * <pre>
     * StakersByPoolAndDelegator returns all stakers the given delegator has delegated to.
     * This query is paginated.
     * </pre>
     */
    public void stakersByDelegator(kyve.query.v1beta1.Delegation.QueryStakersByDelegatorRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Delegation.QueryStakersByDelegatorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStakersByDelegatorMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDelegatorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.query.v1beta1.Delegation.QueryDelegatorRequest,
                kyve.query.v1beta1.Delegation.QueryDelegatorResponse>(
                  this, METHODID_DELEGATOR)))
          .addMethod(
            getDelegatorsByStakerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.query.v1beta1.Delegation.QueryDelegatorsByStakerRequest,
                kyve.query.v1beta1.Delegation.QueryDelegatorsByStakerResponse>(
                  this, METHODID_DELEGATORS_BY_STAKER)))
          .addMethod(
            getStakersByDelegatorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.query.v1beta1.Delegation.QueryStakersByDelegatorRequest,
                kyve.query.v1beta1.Delegation.QueryStakersByDelegatorResponse>(
                  this, METHODID_STAKERS_BY_DELEGATOR)))
          .build();
    }
  }

  /**
   * <pre>
   * QueryDelegation contains all rpc requests related to direct delegation data
   * </pre>
   */
  public static final class QueryDelegationStub extends io.grpc.stub.AbstractAsyncStub<QueryDelegationStub> {
    private QueryDelegationStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryDelegationStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryDelegationStub(channel, callOptions);
    }

    /**
     * <pre>
     * Delegator returns delegation information for a specific delegator of a specific staker.
     * </pre>
     */
    public void delegator(kyve.query.v1beta1.Delegation.QueryDelegatorRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Delegation.QueryDelegatorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDelegatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DelegatorsByStaker returns all delegators that have delegated to the given staker
     * This query is paginated.
     * </pre>
     */
    public void delegatorsByStaker(kyve.query.v1beta1.Delegation.QueryDelegatorsByStakerRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Delegation.QueryDelegatorsByStakerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDelegatorsByStakerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * StakersByPoolAndDelegator returns all stakers the given delegator has delegated to.
     * This query is paginated.
     * </pre>
     */
    public void stakersByDelegator(kyve.query.v1beta1.Delegation.QueryStakersByDelegatorRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Delegation.QueryStakersByDelegatorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStakersByDelegatorMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * QueryDelegation contains all rpc requests related to direct delegation data
   * </pre>
   */
  public static final class QueryDelegationBlockingStub extends io.grpc.stub.AbstractBlockingStub<QueryDelegationBlockingStub> {
    private QueryDelegationBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryDelegationBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryDelegationBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Delegator returns delegation information for a specific delegator of a specific staker.
     * </pre>
     */
    public kyve.query.v1beta1.Delegation.QueryDelegatorResponse delegator(kyve.query.v1beta1.Delegation.QueryDelegatorRequest request) {
      return blockingUnaryCall(
          getChannel(), getDelegatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DelegatorsByStaker returns all delegators that have delegated to the given staker
     * This query is paginated.
     * </pre>
     */
    public kyve.query.v1beta1.Delegation.QueryDelegatorsByStakerResponse delegatorsByStaker(kyve.query.v1beta1.Delegation.QueryDelegatorsByStakerRequest request) {
      return blockingUnaryCall(
          getChannel(), getDelegatorsByStakerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * StakersByPoolAndDelegator returns all stakers the given delegator has delegated to.
     * This query is paginated.
     * </pre>
     */
    public kyve.query.v1beta1.Delegation.QueryStakersByDelegatorResponse stakersByDelegator(kyve.query.v1beta1.Delegation.QueryStakersByDelegatorRequest request) {
      return blockingUnaryCall(
          getChannel(), getStakersByDelegatorMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * QueryDelegation contains all rpc requests related to direct delegation data
   * </pre>
   */
  public static final class QueryDelegationFutureStub extends io.grpc.stub.AbstractFutureStub<QueryDelegationFutureStub> {
    private QueryDelegationFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryDelegationFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryDelegationFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Delegator returns delegation information for a specific delegator of a specific staker.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.query.v1beta1.Delegation.QueryDelegatorResponse> delegator(
        kyve.query.v1beta1.Delegation.QueryDelegatorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDelegatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DelegatorsByStaker returns all delegators that have delegated to the given staker
     * This query is paginated.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.query.v1beta1.Delegation.QueryDelegatorsByStakerResponse> delegatorsByStaker(
        kyve.query.v1beta1.Delegation.QueryDelegatorsByStakerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDelegatorsByStakerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * StakersByPoolAndDelegator returns all stakers the given delegator has delegated to.
     * This query is paginated.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.query.v1beta1.Delegation.QueryStakersByDelegatorResponse> stakersByDelegator(
        kyve.query.v1beta1.Delegation.QueryStakersByDelegatorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStakersByDelegatorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DELEGATOR = 0;
  private static final int METHODID_DELEGATORS_BY_STAKER = 1;
  private static final int METHODID_STAKERS_BY_DELEGATOR = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QueryDelegationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QueryDelegationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DELEGATOR:
          serviceImpl.delegator((kyve.query.v1beta1.Delegation.QueryDelegatorRequest) request,
              (io.grpc.stub.StreamObserver<kyve.query.v1beta1.Delegation.QueryDelegatorResponse>) responseObserver);
          break;
        case METHODID_DELEGATORS_BY_STAKER:
          serviceImpl.delegatorsByStaker((kyve.query.v1beta1.Delegation.QueryDelegatorsByStakerRequest) request,
              (io.grpc.stub.StreamObserver<kyve.query.v1beta1.Delegation.QueryDelegatorsByStakerResponse>) responseObserver);
          break;
        case METHODID_STAKERS_BY_DELEGATOR:
          serviceImpl.stakersByDelegator((kyve.query.v1beta1.Delegation.QueryStakersByDelegatorRequest) request,
              (io.grpc.stub.StreamObserver<kyve.query.v1beta1.Delegation.QueryStakersByDelegatorResponse>) responseObserver);
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

  private static abstract class QueryDelegationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryDelegationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return kyve.query.v1beta1.Delegation.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QueryDelegation");
    }
  }

  private static final class QueryDelegationFileDescriptorSupplier
      extends QueryDelegationBaseDescriptorSupplier {
    QueryDelegationFileDescriptorSupplier() {}
  }

  private static final class QueryDelegationMethodDescriptorSupplier
      extends QueryDelegationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryDelegationMethodDescriptorSupplier(String methodName) {
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
      synchronized (QueryDelegationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryDelegationFileDescriptorSupplier())
              .addMethod(getDelegatorMethod())
              .addMethod(getDelegatorsByStakerMethod())
              .addMethod(getStakersByDelegatorMethod())
              .build();
        }
      }
    }
    return result;
  }
}
