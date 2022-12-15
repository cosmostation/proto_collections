package desmos.relationships.v1;

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
    comments = "Source: desmos/relationships/v1/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "desmos.relationships.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<desmos.relationships.v1.QueryOuterClass.QueryRelationshipsRequest,
      desmos.relationships.v1.QueryOuterClass.QueryRelationshipsResponse> getRelationshipsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Relationships",
      requestType = desmos.relationships.v1.QueryOuterClass.QueryRelationshipsRequest.class,
      responseType = desmos.relationships.v1.QueryOuterClass.QueryRelationshipsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.relationships.v1.QueryOuterClass.QueryRelationshipsRequest,
      desmos.relationships.v1.QueryOuterClass.QueryRelationshipsResponse> getRelationshipsMethod() {
    io.grpc.MethodDescriptor<desmos.relationships.v1.QueryOuterClass.QueryRelationshipsRequest, desmos.relationships.v1.QueryOuterClass.QueryRelationshipsResponse> getRelationshipsMethod;
    if ((getRelationshipsMethod = QueryGrpc.getRelationshipsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRelationshipsMethod = QueryGrpc.getRelationshipsMethod) == null) {
          QueryGrpc.getRelationshipsMethod = getRelationshipsMethod =
              io.grpc.MethodDescriptor.<desmos.relationships.v1.QueryOuterClass.QueryRelationshipsRequest, desmos.relationships.v1.QueryOuterClass.QueryRelationshipsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Relationships"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.relationships.v1.QueryOuterClass.QueryRelationshipsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.relationships.v1.QueryOuterClass.QueryRelationshipsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Relationships"))
              .build();
        }
      }
    }
    return getRelationshipsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.relationships.v1.QueryOuterClass.QueryBlocksRequest,
      desmos.relationships.v1.QueryOuterClass.QueryBlocksResponse> getBlocksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Blocks",
      requestType = desmos.relationships.v1.QueryOuterClass.QueryBlocksRequest.class,
      responseType = desmos.relationships.v1.QueryOuterClass.QueryBlocksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.relationships.v1.QueryOuterClass.QueryBlocksRequest,
      desmos.relationships.v1.QueryOuterClass.QueryBlocksResponse> getBlocksMethod() {
    io.grpc.MethodDescriptor<desmos.relationships.v1.QueryOuterClass.QueryBlocksRequest, desmos.relationships.v1.QueryOuterClass.QueryBlocksResponse> getBlocksMethod;
    if ((getBlocksMethod = QueryGrpc.getBlocksMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBlocksMethod = QueryGrpc.getBlocksMethod) == null) {
          QueryGrpc.getBlocksMethod = getBlocksMethod =
              io.grpc.MethodDescriptor.<desmos.relationships.v1.QueryOuterClass.QueryBlocksRequest, desmos.relationships.v1.QueryOuterClass.QueryBlocksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Blocks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.relationships.v1.QueryOuterClass.QueryBlocksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.relationships.v1.QueryOuterClass.QueryBlocksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Blocks"))
              .build();
        }
      }
    }
    return getBlocksMethod;
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
     * Relationships queries all relationships present inside a specific subspace
     * </pre>
     */
    public void relationships(desmos.relationships.v1.QueryOuterClass.QueryRelationshipsRequest request,
        io.grpc.stub.StreamObserver<desmos.relationships.v1.QueryOuterClass.QueryRelationshipsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRelationshipsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Blocks queries the blocks for the given user, if provided.
     * Otherwise, it queries all the stored blocks.
     * </pre>
     */
    public void blocks(desmos.relationships.v1.QueryOuterClass.QueryBlocksRequest request,
        io.grpc.stub.StreamObserver<desmos.relationships.v1.QueryOuterClass.QueryBlocksResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBlocksMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRelationshipsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.relationships.v1.QueryOuterClass.QueryRelationshipsRequest,
                desmos.relationships.v1.QueryOuterClass.QueryRelationshipsResponse>(
                  this, METHODID_RELATIONSHIPS)))
          .addMethod(
            getBlocksMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.relationships.v1.QueryOuterClass.QueryBlocksRequest,
                desmos.relationships.v1.QueryOuterClass.QueryBlocksResponse>(
                  this, METHODID_BLOCKS)))
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
     * Relationships queries all relationships present inside a specific subspace
     * </pre>
     */
    public void relationships(desmos.relationships.v1.QueryOuterClass.QueryRelationshipsRequest request,
        io.grpc.stub.StreamObserver<desmos.relationships.v1.QueryOuterClass.QueryRelationshipsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRelationshipsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Blocks queries the blocks for the given user, if provided.
     * Otherwise, it queries all the stored blocks.
     * </pre>
     */
    public void blocks(desmos.relationships.v1.QueryOuterClass.QueryBlocksRequest request,
        io.grpc.stub.StreamObserver<desmos.relationships.v1.QueryOuterClass.QueryBlocksResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBlocksMethod(), getCallOptions()), request, responseObserver);
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
     * Relationships queries all relationships present inside a specific subspace
     * </pre>
     */
    public desmos.relationships.v1.QueryOuterClass.QueryRelationshipsResponse relationships(desmos.relationships.v1.QueryOuterClass.QueryRelationshipsRequest request) {
      return blockingUnaryCall(
          getChannel(), getRelationshipsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Blocks queries the blocks for the given user, if provided.
     * Otherwise, it queries all the stored blocks.
     * </pre>
     */
    public desmos.relationships.v1.QueryOuterClass.QueryBlocksResponse blocks(desmos.relationships.v1.QueryOuterClass.QueryBlocksRequest request) {
      return blockingUnaryCall(
          getChannel(), getBlocksMethod(), getCallOptions(), request);
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
     * Relationships queries all relationships present inside a specific subspace
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.relationships.v1.QueryOuterClass.QueryRelationshipsResponse> relationships(
        desmos.relationships.v1.QueryOuterClass.QueryRelationshipsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRelationshipsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Blocks queries the blocks for the given user, if provided.
     * Otherwise, it queries all the stored blocks.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.relationships.v1.QueryOuterClass.QueryBlocksResponse> blocks(
        desmos.relationships.v1.QueryOuterClass.QueryBlocksRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBlocksMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RELATIONSHIPS = 0;
  private static final int METHODID_BLOCKS = 1;

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
        case METHODID_RELATIONSHIPS:
          serviceImpl.relationships((desmos.relationships.v1.QueryOuterClass.QueryRelationshipsRequest) request,
              (io.grpc.stub.StreamObserver<desmos.relationships.v1.QueryOuterClass.QueryRelationshipsResponse>) responseObserver);
          break;
        case METHODID_BLOCKS:
          serviceImpl.blocks((desmos.relationships.v1.QueryOuterClass.QueryBlocksRequest) request,
              (io.grpc.stub.StreamObserver<desmos.relationships.v1.QueryOuterClass.QueryBlocksResponse>) responseObserver);
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
      return desmos.relationships.v1.QueryOuterClass.getDescriptor();
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
              .addMethod(getRelationshipsMethod())
              .addMethod(getBlocksMethod())
              .build();
        }
      }
    }
    return result;
  }
}
