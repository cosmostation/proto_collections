package cosmos.orm.query.v1alpha1;

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
 * Query is a generic gRPC service for querying ORM data.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: cosmos/orm/query/v1alpha1/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "cosmos.orm.query.v1alpha1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cosmos.orm.query.v1alpha1.QueryOuterClass.GetRequest,
      cosmos.orm.query.v1alpha1.QueryOuterClass.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = cosmos.orm.query.v1alpha1.QueryOuterClass.GetRequest.class,
      responseType = cosmos.orm.query.v1alpha1.QueryOuterClass.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.orm.query.v1alpha1.QueryOuterClass.GetRequest,
      cosmos.orm.query.v1alpha1.QueryOuterClass.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<cosmos.orm.query.v1alpha1.QueryOuterClass.GetRequest, cosmos.orm.query.v1alpha1.QueryOuterClass.GetResponse> getGetMethod;
    if ((getGetMethod = QueryGrpc.getGetMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetMethod = QueryGrpc.getGetMethod) == null) {
          QueryGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<cosmos.orm.query.v1alpha1.QueryOuterClass.GetRequest, cosmos.orm.query.v1alpha1.QueryOuterClass.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.orm.query.v1alpha1.QueryOuterClass.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.orm.query.v1alpha1.QueryOuterClass.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.orm.query.v1alpha1.QueryOuterClass.ListRequest,
      cosmos.orm.query.v1alpha1.QueryOuterClass.ListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = cosmos.orm.query.v1alpha1.QueryOuterClass.ListRequest.class,
      responseType = cosmos.orm.query.v1alpha1.QueryOuterClass.ListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.orm.query.v1alpha1.QueryOuterClass.ListRequest,
      cosmos.orm.query.v1alpha1.QueryOuterClass.ListResponse> getListMethod() {
    io.grpc.MethodDescriptor<cosmos.orm.query.v1alpha1.QueryOuterClass.ListRequest, cosmos.orm.query.v1alpha1.QueryOuterClass.ListResponse> getListMethod;
    if ((getListMethod = QueryGrpc.getListMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getListMethod = QueryGrpc.getListMethod) == null) {
          QueryGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<cosmos.orm.query.v1alpha1.QueryOuterClass.ListRequest, cosmos.orm.query.v1alpha1.QueryOuterClass.ListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.orm.query.v1alpha1.QueryOuterClass.ListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.orm.query.v1alpha1.QueryOuterClass.ListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
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
   * Query is a generic gRPC service for querying ORM data.
   * </pre>
   */
  public static abstract class QueryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get queries an ORM table against an unique index.
     * </pre>
     */
    public void get(cosmos.orm.query.v1alpha1.QueryOuterClass.GetRequest request,
        io.grpc.stub.StreamObserver<cosmos.orm.query.v1alpha1.QueryOuterClass.GetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * List queries an ORM table against an index.
     * </pre>
     */
    public void list(cosmos.orm.query.v1alpha1.QueryOuterClass.ListRequest request,
        io.grpc.stub.StreamObserver<cosmos.orm.query.v1alpha1.QueryOuterClass.ListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.orm.query.v1alpha1.QueryOuterClass.GetRequest,
                cosmos.orm.query.v1alpha1.QueryOuterClass.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.orm.query.v1alpha1.QueryOuterClass.ListRequest,
                cosmos.orm.query.v1alpha1.QueryOuterClass.ListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * Query is a generic gRPC service for querying ORM data.
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
     * Get queries an ORM table against an unique index.
     * </pre>
     */
    public void get(cosmos.orm.query.v1alpha1.QueryOuterClass.GetRequest request,
        io.grpc.stub.StreamObserver<cosmos.orm.query.v1alpha1.QueryOuterClass.GetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List queries an ORM table against an index.
     * </pre>
     */
    public void list(cosmos.orm.query.v1alpha1.QueryOuterClass.ListRequest request,
        io.grpc.stub.StreamObserver<cosmos.orm.query.v1alpha1.QueryOuterClass.ListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Query is a generic gRPC service for querying ORM data.
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
     * Get queries an ORM table against an unique index.
     * </pre>
     */
    public cosmos.orm.query.v1alpha1.QueryOuterClass.GetResponse get(cosmos.orm.query.v1alpha1.QueryOuterClass.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List queries an ORM table against an index.
     * </pre>
     */
    public cosmos.orm.query.v1alpha1.QueryOuterClass.ListResponse list(cosmos.orm.query.v1alpha1.QueryOuterClass.ListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Query is a generic gRPC service for querying ORM data.
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
     * Get queries an ORM table against an unique index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.orm.query.v1alpha1.QueryOuterClass.GetResponse> get(
        cosmos.orm.query.v1alpha1.QueryOuterClass.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List queries an ORM table against an index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.orm.query.v1alpha1.QueryOuterClass.ListResponse> list(
        cosmos.orm.query.v1alpha1.QueryOuterClass.ListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;

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
        case METHODID_GET:
          serviceImpl.get((cosmos.orm.query.v1alpha1.QueryOuterClass.GetRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.orm.query.v1alpha1.QueryOuterClass.GetResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((cosmos.orm.query.v1alpha1.QueryOuterClass.ListRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.orm.query.v1alpha1.QueryOuterClass.ListResponse>) responseObserver);
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
      return cosmos.orm.query.v1alpha1.QueryOuterClass.getDescriptor();
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
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
