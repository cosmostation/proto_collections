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
 * QueryPool ...
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: kyve/query/v1beta1/pools.proto")
public final class QueryPoolGrpc {

  private QueryPoolGrpc() {}

  public static final String SERVICE_NAME = "kyve.query.v1beta1.QueryPool";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<kyve.query.v1beta1.Pools.QueryPoolsRequest,
      kyve.query.v1beta1.Pools.QueryPoolsResponse> getPoolsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pools",
      requestType = kyve.query.v1beta1.Pools.QueryPoolsRequest.class,
      responseType = kyve.query.v1beta1.Pools.QueryPoolsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.query.v1beta1.Pools.QueryPoolsRequest,
      kyve.query.v1beta1.Pools.QueryPoolsResponse> getPoolsMethod() {
    io.grpc.MethodDescriptor<kyve.query.v1beta1.Pools.QueryPoolsRequest, kyve.query.v1beta1.Pools.QueryPoolsResponse> getPoolsMethod;
    if ((getPoolsMethod = QueryPoolGrpc.getPoolsMethod) == null) {
      synchronized (QueryPoolGrpc.class) {
        if ((getPoolsMethod = QueryPoolGrpc.getPoolsMethod) == null) {
          QueryPoolGrpc.getPoolsMethod = getPoolsMethod =
              io.grpc.MethodDescriptor.<kyve.query.v1beta1.Pools.QueryPoolsRequest, kyve.query.v1beta1.Pools.QueryPoolsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pools"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Pools.QueryPoolsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Pools.QueryPoolsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryPoolMethodDescriptorSupplier("Pools"))
              .build();
        }
      }
    }
    return getPoolsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.query.v1beta1.Pools.QueryPoolRequest,
      kyve.query.v1beta1.Pools.QueryPoolResponse> getPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pool",
      requestType = kyve.query.v1beta1.Pools.QueryPoolRequest.class,
      responseType = kyve.query.v1beta1.Pools.QueryPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.query.v1beta1.Pools.QueryPoolRequest,
      kyve.query.v1beta1.Pools.QueryPoolResponse> getPoolMethod() {
    io.grpc.MethodDescriptor<kyve.query.v1beta1.Pools.QueryPoolRequest, kyve.query.v1beta1.Pools.QueryPoolResponse> getPoolMethod;
    if ((getPoolMethod = QueryPoolGrpc.getPoolMethod) == null) {
      synchronized (QueryPoolGrpc.class) {
        if ((getPoolMethod = QueryPoolGrpc.getPoolMethod) == null) {
          QueryPoolGrpc.getPoolMethod = getPoolMethod =
              io.grpc.MethodDescriptor.<kyve.query.v1beta1.Pools.QueryPoolRequest, kyve.query.v1beta1.Pools.QueryPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Pools.QueryPoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Pools.QueryPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryPoolMethodDescriptorSupplier("Pool"))
              .build();
        }
      }
    }
    return getPoolMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryPoolStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryPoolStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryPoolStub>() {
        @java.lang.Override
        public QueryPoolStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryPoolStub(channel, callOptions);
        }
      };
    return QueryPoolStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryPoolBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryPoolBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryPoolBlockingStub>() {
        @java.lang.Override
        public QueryPoolBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryPoolBlockingStub(channel, callOptions);
        }
      };
    return QueryPoolBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryPoolFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryPoolFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryPoolFutureStub>() {
        @java.lang.Override
        public QueryPoolFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryPoolFutureStub(channel, callOptions);
        }
      };
    return QueryPoolFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * QueryPool ...
   * </pre>
   */
  public static abstract class QueryPoolImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Pools queries for all pools.
     * </pre>
     */
    public void pools(kyve.query.v1beta1.Pools.QueryPoolsRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Pools.QueryPoolsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPoolsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Pool queries a pool by its Id.
     * </pre>
     */
    public void pool(kyve.query.v1beta1.Pools.QueryPoolRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Pools.QueryPoolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPoolMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPoolsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.query.v1beta1.Pools.QueryPoolsRequest,
                kyve.query.v1beta1.Pools.QueryPoolsResponse>(
                  this, METHODID_POOLS)))
          .addMethod(
            getPoolMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.query.v1beta1.Pools.QueryPoolRequest,
                kyve.query.v1beta1.Pools.QueryPoolResponse>(
                  this, METHODID_POOL)))
          .build();
    }
  }

  /**
   * <pre>
   * QueryPool ...
   * </pre>
   */
  public static final class QueryPoolStub extends io.grpc.stub.AbstractAsyncStub<QueryPoolStub> {
    private QueryPoolStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryPoolStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryPoolStub(channel, callOptions);
    }

    /**
     * <pre>
     * Pools queries for all pools.
     * </pre>
     */
    public void pools(kyve.query.v1beta1.Pools.QueryPoolsRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Pools.QueryPoolsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPoolsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Pool queries a pool by its Id.
     * </pre>
     */
    public void pool(kyve.query.v1beta1.Pools.QueryPoolRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Pools.QueryPoolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPoolMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * QueryPool ...
   * </pre>
   */
  public static final class QueryPoolBlockingStub extends io.grpc.stub.AbstractBlockingStub<QueryPoolBlockingStub> {
    private QueryPoolBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryPoolBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryPoolBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Pools queries for all pools.
     * </pre>
     */
    public kyve.query.v1beta1.Pools.QueryPoolsResponse pools(kyve.query.v1beta1.Pools.QueryPoolsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPoolsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Pool queries a pool by its Id.
     * </pre>
     */
    public kyve.query.v1beta1.Pools.QueryPoolResponse pool(kyve.query.v1beta1.Pools.QueryPoolRequest request) {
      return blockingUnaryCall(
          getChannel(), getPoolMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * QueryPool ...
   * </pre>
   */
  public static final class QueryPoolFutureStub extends io.grpc.stub.AbstractFutureStub<QueryPoolFutureStub> {
    private QueryPoolFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryPoolFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryPoolFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Pools queries for all pools.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.query.v1beta1.Pools.QueryPoolsResponse> pools(
        kyve.query.v1beta1.Pools.QueryPoolsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPoolsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Pool queries a pool by its Id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.query.v1beta1.Pools.QueryPoolResponse> pool(
        kyve.query.v1beta1.Pools.QueryPoolRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPoolMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_POOLS = 0;
  private static final int METHODID_POOL = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QueryPoolImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QueryPoolImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_POOLS:
          serviceImpl.pools((kyve.query.v1beta1.Pools.QueryPoolsRequest) request,
              (io.grpc.stub.StreamObserver<kyve.query.v1beta1.Pools.QueryPoolsResponse>) responseObserver);
          break;
        case METHODID_POOL:
          serviceImpl.pool((kyve.query.v1beta1.Pools.QueryPoolRequest) request,
              (io.grpc.stub.StreamObserver<kyve.query.v1beta1.Pools.QueryPoolResponse>) responseObserver);
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

  private static abstract class QueryPoolBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryPoolBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return kyve.query.v1beta1.Pools.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QueryPool");
    }
  }

  private static final class QueryPoolFileDescriptorSupplier
      extends QueryPoolBaseDescriptorSupplier {
    QueryPoolFileDescriptorSupplier() {}
  }

  private static final class QueryPoolMethodDescriptorSupplier
      extends QueryPoolBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryPoolMethodDescriptorSupplier(String methodName) {
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
      synchronized (QueryPoolGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryPoolFileDescriptorSupplier())
              .addMethod(getPoolsMethod())
              .addMethod(getPoolMethod())
              .build();
        }
      }
    }
    return result;
  }
}
