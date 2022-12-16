package quicksilver.interchainquery.v1;

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
 * Query provides defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: quicksilver/interchainquery/v1/query.proto")
public final class QuerySrvrGrpc {

  private QuerySrvrGrpc() {}

  public static final String SERVICE_NAME = "quicksilver.interchainquery.v1.QuerySrvr";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<quicksilver.interchainquery.v1.Query.QueryRequestsRequest,
      quicksilver.interchainquery.v1.Query.QueryRequestsResponse> getQueriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Queries",
      requestType = quicksilver.interchainquery.v1.Query.QueryRequestsRequest.class,
      responseType = quicksilver.interchainquery.v1.Query.QueryRequestsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<quicksilver.interchainquery.v1.Query.QueryRequestsRequest,
      quicksilver.interchainquery.v1.Query.QueryRequestsResponse> getQueriesMethod() {
    io.grpc.MethodDescriptor<quicksilver.interchainquery.v1.Query.QueryRequestsRequest, quicksilver.interchainquery.v1.Query.QueryRequestsResponse> getQueriesMethod;
    if ((getQueriesMethod = QuerySrvrGrpc.getQueriesMethod) == null) {
      synchronized (QuerySrvrGrpc.class) {
        if ((getQueriesMethod = QuerySrvrGrpc.getQueriesMethod) == null) {
          QuerySrvrGrpc.getQueriesMethod = getQueriesMethod =
              io.grpc.MethodDescriptor.<quicksilver.interchainquery.v1.Query.QueryRequestsRequest, quicksilver.interchainquery.v1.Query.QueryRequestsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Queries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.interchainquery.v1.Query.QueryRequestsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.interchainquery.v1.Query.QueryRequestsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QuerySrvrMethodDescriptorSupplier("Queries"))
              .build();
        }
      }
    }
    return getQueriesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QuerySrvrStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QuerySrvrStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QuerySrvrStub>() {
        @java.lang.Override
        public QuerySrvrStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QuerySrvrStub(channel, callOptions);
        }
      };
    return QuerySrvrStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QuerySrvrBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QuerySrvrBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QuerySrvrBlockingStub>() {
        @java.lang.Override
        public QuerySrvrBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QuerySrvrBlockingStub(channel, callOptions);
        }
      };
    return QuerySrvrBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QuerySrvrFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QuerySrvrFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QuerySrvrFutureStub>() {
        @java.lang.Override
        public QuerySrvrFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QuerySrvrFutureStub(channel, callOptions);
        }
      };
    return QuerySrvrFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Query provides defines the gRPC querier service.
   * </pre>
   */
  public static abstract class QuerySrvrImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Params returns the total set of minting parameters.
     * </pre>
     */
    public void queries(quicksilver.interchainquery.v1.Query.QueryRequestsRequest request,
        io.grpc.stub.StreamObserver<quicksilver.interchainquery.v1.Query.QueryRequestsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQueriesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getQueriesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                quicksilver.interchainquery.v1.Query.QueryRequestsRequest,
                quicksilver.interchainquery.v1.Query.QueryRequestsResponse>(
                  this, METHODID_QUERIES)))
          .build();
    }
  }

  /**
   * <pre>
   * Query provides defines the gRPC querier service.
   * </pre>
   */
  public static final class QuerySrvrStub extends io.grpc.stub.AbstractAsyncStub<QuerySrvrStub> {
    private QuerySrvrStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QuerySrvrStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QuerySrvrStub(channel, callOptions);
    }

    /**
     * <pre>
     * Params returns the total set of minting parameters.
     * </pre>
     */
    public void queries(quicksilver.interchainquery.v1.Query.QueryRequestsRequest request,
        io.grpc.stub.StreamObserver<quicksilver.interchainquery.v1.Query.QueryRequestsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueriesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Query provides defines the gRPC querier service.
   * </pre>
   */
  public static final class QuerySrvrBlockingStub extends io.grpc.stub.AbstractBlockingStub<QuerySrvrBlockingStub> {
    private QuerySrvrBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QuerySrvrBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QuerySrvrBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Params returns the total set of minting parameters.
     * </pre>
     */
    public quicksilver.interchainquery.v1.Query.QueryRequestsResponse queries(quicksilver.interchainquery.v1.Query.QueryRequestsRequest request) {
      return blockingUnaryCall(
          getChannel(), getQueriesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Query provides defines the gRPC querier service.
   * </pre>
   */
  public static final class QuerySrvrFutureStub extends io.grpc.stub.AbstractFutureStub<QuerySrvrFutureStub> {
    private QuerySrvrFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QuerySrvrFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QuerySrvrFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Params returns the total set of minting parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<quicksilver.interchainquery.v1.Query.QueryRequestsResponse> queries(
        quicksilver.interchainquery.v1.Query.QueryRequestsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQueriesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERIES = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QuerySrvrImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QuerySrvrImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_QUERIES:
          serviceImpl.queries((quicksilver.interchainquery.v1.Query.QueryRequestsRequest) request,
              (io.grpc.stub.StreamObserver<quicksilver.interchainquery.v1.Query.QueryRequestsResponse>) responseObserver);
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

  private static abstract class QuerySrvrBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QuerySrvrBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return quicksilver.interchainquery.v1.Query.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QuerySrvr");
    }
  }

  private static final class QuerySrvrFileDescriptorSupplier
      extends QuerySrvrBaseDescriptorSupplier {
    QuerySrvrFileDescriptorSupplier() {}
  }

  private static final class QuerySrvrMethodDescriptorSupplier
      extends QuerySrvrBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QuerySrvrMethodDescriptorSupplier(String methodName) {
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
      synchronized (QuerySrvrGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QuerySrvrFileDescriptorSupplier())
              .addMethod(getQueriesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
