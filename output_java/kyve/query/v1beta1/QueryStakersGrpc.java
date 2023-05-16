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
 * QueryStakers ...
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: kyve/query/v1beta1/stakers.proto")
public final class QueryStakersGrpc {

  private QueryStakersGrpc() {}

  public static final String SERVICE_NAME = "kyve.query.v1beta1.QueryStakers";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<kyve.query.v1beta1.Stakers.QueryStakersRequest,
      kyve.query.v1beta1.Stakers.QueryStakersResponse> getStakersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stakers",
      requestType = kyve.query.v1beta1.Stakers.QueryStakersRequest.class,
      responseType = kyve.query.v1beta1.Stakers.QueryStakersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.query.v1beta1.Stakers.QueryStakersRequest,
      kyve.query.v1beta1.Stakers.QueryStakersResponse> getStakersMethod() {
    io.grpc.MethodDescriptor<kyve.query.v1beta1.Stakers.QueryStakersRequest, kyve.query.v1beta1.Stakers.QueryStakersResponse> getStakersMethod;
    if ((getStakersMethod = QueryStakersGrpc.getStakersMethod) == null) {
      synchronized (QueryStakersGrpc.class) {
        if ((getStakersMethod = QueryStakersGrpc.getStakersMethod) == null) {
          QueryStakersGrpc.getStakersMethod = getStakersMethod =
              io.grpc.MethodDescriptor.<kyve.query.v1beta1.Stakers.QueryStakersRequest, kyve.query.v1beta1.Stakers.QueryStakersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Stakers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Stakers.QueryStakersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Stakers.QueryStakersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryStakersMethodDescriptorSupplier("Stakers"))
              .build();
        }
      }
    }
    return getStakersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.query.v1beta1.Stakers.QueryStakerRequest,
      kyve.query.v1beta1.Stakers.QueryStakerResponse> getStakerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Staker",
      requestType = kyve.query.v1beta1.Stakers.QueryStakerRequest.class,
      responseType = kyve.query.v1beta1.Stakers.QueryStakerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.query.v1beta1.Stakers.QueryStakerRequest,
      kyve.query.v1beta1.Stakers.QueryStakerResponse> getStakerMethod() {
    io.grpc.MethodDescriptor<kyve.query.v1beta1.Stakers.QueryStakerRequest, kyve.query.v1beta1.Stakers.QueryStakerResponse> getStakerMethod;
    if ((getStakerMethod = QueryStakersGrpc.getStakerMethod) == null) {
      synchronized (QueryStakersGrpc.class) {
        if ((getStakerMethod = QueryStakersGrpc.getStakerMethod) == null) {
          QueryStakersGrpc.getStakerMethod = getStakerMethod =
              io.grpc.MethodDescriptor.<kyve.query.v1beta1.Stakers.QueryStakerRequest, kyve.query.v1beta1.Stakers.QueryStakerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Staker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Stakers.QueryStakerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Stakers.QueryStakerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryStakersMethodDescriptorSupplier("Staker"))
              .build();
        }
      }
    }
    return getStakerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.query.v1beta1.Stakers.QueryStakersByPoolRequest,
      kyve.query.v1beta1.Stakers.QueryStakersByPoolResponse> getStakersByPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StakersByPool",
      requestType = kyve.query.v1beta1.Stakers.QueryStakersByPoolRequest.class,
      responseType = kyve.query.v1beta1.Stakers.QueryStakersByPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.query.v1beta1.Stakers.QueryStakersByPoolRequest,
      kyve.query.v1beta1.Stakers.QueryStakersByPoolResponse> getStakersByPoolMethod() {
    io.grpc.MethodDescriptor<kyve.query.v1beta1.Stakers.QueryStakersByPoolRequest, kyve.query.v1beta1.Stakers.QueryStakersByPoolResponse> getStakersByPoolMethod;
    if ((getStakersByPoolMethod = QueryStakersGrpc.getStakersByPoolMethod) == null) {
      synchronized (QueryStakersGrpc.class) {
        if ((getStakersByPoolMethod = QueryStakersGrpc.getStakersByPoolMethod) == null) {
          QueryStakersGrpc.getStakersByPoolMethod = getStakersByPoolMethod =
              io.grpc.MethodDescriptor.<kyve.query.v1beta1.Stakers.QueryStakersByPoolRequest, kyve.query.v1beta1.Stakers.QueryStakersByPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StakersByPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Stakers.QueryStakersByPoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Stakers.QueryStakersByPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryStakersMethodDescriptorSupplier("StakersByPool"))
              .build();
        }
      }
    }
    return getStakersByPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.query.v1beta1.Stakers.QueryStakersByPoolCountRequest,
      kyve.query.v1beta1.Stakers.QueryStakersByPoolCountResponse> getStakersByPoolCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StakersByPoolCount",
      requestType = kyve.query.v1beta1.Stakers.QueryStakersByPoolCountRequest.class,
      responseType = kyve.query.v1beta1.Stakers.QueryStakersByPoolCountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.query.v1beta1.Stakers.QueryStakersByPoolCountRequest,
      kyve.query.v1beta1.Stakers.QueryStakersByPoolCountResponse> getStakersByPoolCountMethod() {
    io.grpc.MethodDescriptor<kyve.query.v1beta1.Stakers.QueryStakersByPoolCountRequest, kyve.query.v1beta1.Stakers.QueryStakersByPoolCountResponse> getStakersByPoolCountMethod;
    if ((getStakersByPoolCountMethod = QueryStakersGrpc.getStakersByPoolCountMethod) == null) {
      synchronized (QueryStakersGrpc.class) {
        if ((getStakersByPoolCountMethod = QueryStakersGrpc.getStakersByPoolCountMethod) == null) {
          QueryStakersGrpc.getStakersByPoolCountMethod = getStakersByPoolCountMethod =
              io.grpc.MethodDescriptor.<kyve.query.v1beta1.Stakers.QueryStakersByPoolCountRequest, kyve.query.v1beta1.Stakers.QueryStakersByPoolCountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StakersByPoolCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Stakers.QueryStakersByPoolCountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Stakers.QueryStakersByPoolCountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryStakersMethodDescriptorSupplier("StakersByPoolCount"))
              .build();
        }
      }
    }
    return getStakersByPoolCountMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryStakersStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryStakersStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryStakersStub>() {
        @java.lang.Override
        public QueryStakersStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryStakersStub(channel, callOptions);
        }
      };
    return QueryStakersStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryStakersBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryStakersBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryStakersBlockingStub>() {
        @java.lang.Override
        public QueryStakersBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryStakersBlockingStub(channel, callOptions);
        }
      };
    return QueryStakersBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryStakersFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryStakersFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryStakersFutureStub>() {
        @java.lang.Override
        public QueryStakersFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryStakersFutureStub(channel, callOptions);
        }
      };
    return QueryStakersFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * QueryStakers ...
   * </pre>
   */
  public static abstract class QueryStakersImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Stakers queries for all stakers.
     * </pre>
     */
    public void stakers(kyve.query.v1beta1.Stakers.QueryStakersRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Stakers.QueryStakersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStakersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Staker queries for all stakers.
     * </pre>
     */
    public void staker(kyve.query.v1beta1.Stakers.QueryStakerRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Stakers.QueryStakerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStakerMethod(), responseObserver);
    }

    /**
     * <pre>
     * StakersByPool queries for all stakers that are currently participating in the given pool
     * </pre>
     */
    public void stakersByPool(kyve.query.v1beta1.Stakers.QueryStakersByPoolRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Stakers.QueryStakersByPoolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStakersByPoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * StakersByPool queries for all stakers and sorted them first by number of pools participating and
     * then by delegation
     * </pre>
     */
    public void stakersByPoolCount(kyve.query.v1beta1.Stakers.QueryStakersByPoolCountRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Stakers.QueryStakersByPoolCountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStakersByPoolCountMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStakersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.query.v1beta1.Stakers.QueryStakersRequest,
                kyve.query.v1beta1.Stakers.QueryStakersResponse>(
                  this, METHODID_STAKERS)))
          .addMethod(
            getStakerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.query.v1beta1.Stakers.QueryStakerRequest,
                kyve.query.v1beta1.Stakers.QueryStakerResponse>(
                  this, METHODID_STAKER)))
          .addMethod(
            getStakersByPoolMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.query.v1beta1.Stakers.QueryStakersByPoolRequest,
                kyve.query.v1beta1.Stakers.QueryStakersByPoolResponse>(
                  this, METHODID_STAKERS_BY_POOL)))
          .addMethod(
            getStakersByPoolCountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.query.v1beta1.Stakers.QueryStakersByPoolCountRequest,
                kyve.query.v1beta1.Stakers.QueryStakersByPoolCountResponse>(
                  this, METHODID_STAKERS_BY_POOL_COUNT)))
          .build();
    }
  }

  /**
   * <pre>
   * QueryStakers ...
   * </pre>
   */
  public static final class QueryStakersStub extends io.grpc.stub.AbstractAsyncStub<QueryStakersStub> {
    private QueryStakersStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryStakersStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryStakersStub(channel, callOptions);
    }

    /**
     * <pre>
     * Stakers queries for all stakers.
     * </pre>
     */
    public void stakers(kyve.query.v1beta1.Stakers.QueryStakersRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Stakers.QueryStakersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStakersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Staker queries for all stakers.
     * </pre>
     */
    public void staker(kyve.query.v1beta1.Stakers.QueryStakerRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Stakers.QueryStakerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStakerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * StakersByPool queries for all stakers that are currently participating in the given pool
     * </pre>
     */
    public void stakersByPool(kyve.query.v1beta1.Stakers.QueryStakersByPoolRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Stakers.QueryStakersByPoolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStakersByPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * StakersByPool queries for all stakers and sorted them first by number of pools participating and
     * then by delegation
     * </pre>
     */
    public void stakersByPoolCount(kyve.query.v1beta1.Stakers.QueryStakersByPoolCountRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Stakers.QueryStakersByPoolCountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStakersByPoolCountMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * QueryStakers ...
   * </pre>
   */
  public static final class QueryStakersBlockingStub extends io.grpc.stub.AbstractBlockingStub<QueryStakersBlockingStub> {
    private QueryStakersBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryStakersBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryStakersBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Stakers queries for all stakers.
     * </pre>
     */
    public kyve.query.v1beta1.Stakers.QueryStakersResponse stakers(kyve.query.v1beta1.Stakers.QueryStakersRequest request) {
      return blockingUnaryCall(
          getChannel(), getStakersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Staker queries for all stakers.
     * </pre>
     */
    public kyve.query.v1beta1.Stakers.QueryStakerResponse staker(kyve.query.v1beta1.Stakers.QueryStakerRequest request) {
      return blockingUnaryCall(
          getChannel(), getStakerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * StakersByPool queries for all stakers that are currently participating in the given pool
     * </pre>
     */
    public kyve.query.v1beta1.Stakers.QueryStakersByPoolResponse stakersByPool(kyve.query.v1beta1.Stakers.QueryStakersByPoolRequest request) {
      return blockingUnaryCall(
          getChannel(), getStakersByPoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * StakersByPool queries for all stakers and sorted them first by number of pools participating and
     * then by delegation
     * </pre>
     */
    public kyve.query.v1beta1.Stakers.QueryStakersByPoolCountResponse stakersByPoolCount(kyve.query.v1beta1.Stakers.QueryStakersByPoolCountRequest request) {
      return blockingUnaryCall(
          getChannel(), getStakersByPoolCountMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * QueryStakers ...
   * </pre>
   */
  public static final class QueryStakersFutureStub extends io.grpc.stub.AbstractFutureStub<QueryStakersFutureStub> {
    private QueryStakersFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryStakersFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryStakersFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Stakers queries for all stakers.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.query.v1beta1.Stakers.QueryStakersResponse> stakers(
        kyve.query.v1beta1.Stakers.QueryStakersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStakersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Staker queries for all stakers.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.query.v1beta1.Stakers.QueryStakerResponse> staker(
        kyve.query.v1beta1.Stakers.QueryStakerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStakerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * StakersByPool queries for all stakers that are currently participating in the given pool
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.query.v1beta1.Stakers.QueryStakersByPoolResponse> stakersByPool(
        kyve.query.v1beta1.Stakers.QueryStakersByPoolRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStakersByPoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * StakersByPool queries for all stakers and sorted them first by number of pools participating and
     * then by delegation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.query.v1beta1.Stakers.QueryStakersByPoolCountResponse> stakersByPoolCount(
        kyve.query.v1beta1.Stakers.QueryStakersByPoolCountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStakersByPoolCountMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_STAKERS = 0;
  private static final int METHODID_STAKER = 1;
  private static final int METHODID_STAKERS_BY_POOL = 2;
  private static final int METHODID_STAKERS_BY_POOL_COUNT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QueryStakersImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QueryStakersImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STAKERS:
          serviceImpl.stakers((kyve.query.v1beta1.Stakers.QueryStakersRequest) request,
              (io.grpc.stub.StreamObserver<kyve.query.v1beta1.Stakers.QueryStakersResponse>) responseObserver);
          break;
        case METHODID_STAKER:
          serviceImpl.staker((kyve.query.v1beta1.Stakers.QueryStakerRequest) request,
              (io.grpc.stub.StreamObserver<kyve.query.v1beta1.Stakers.QueryStakerResponse>) responseObserver);
          break;
        case METHODID_STAKERS_BY_POOL:
          serviceImpl.stakersByPool((kyve.query.v1beta1.Stakers.QueryStakersByPoolRequest) request,
              (io.grpc.stub.StreamObserver<kyve.query.v1beta1.Stakers.QueryStakersByPoolResponse>) responseObserver);
          break;
        case METHODID_STAKERS_BY_POOL_COUNT:
          serviceImpl.stakersByPoolCount((kyve.query.v1beta1.Stakers.QueryStakersByPoolCountRequest) request,
              (io.grpc.stub.StreamObserver<kyve.query.v1beta1.Stakers.QueryStakersByPoolCountResponse>) responseObserver);
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

  private static abstract class QueryStakersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryStakersBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return kyve.query.v1beta1.Stakers.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QueryStakers");
    }
  }

  private static final class QueryStakersFileDescriptorSupplier
      extends QueryStakersBaseDescriptorSupplier {
    QueryStakersFileDescriptorSupplier() {}
  }

  private static final class QueryStakersMethodDescriptorSupplier
      extends QueryStakersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryStakersMethodDescriptorSupplier(String methodName) {
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
      synchronized (QueryStakersGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryStakersFileDescriptorSupplier())
              .addMethod(getStakersMethod())
              .addMethod(getStakerMethod())
              .addMethod(getStakersByPoolMethod())
              .addMethod(getStakersByPoolCountMethod())
              .build();
        }
      }
    }
    return result;
  }
}
