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
    comments = "Source: kyve/query/v1beta1/params.proto")
public final class QueryParamsGrpc {

  private QueryParamsGrpc() {}

  public static final String SERVICE_NAME = "kyve.query.v1beta1.QueryParams";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<kyve.query.v1beta1.Params.QueryParamsRequest,
      kyve.query.v1beta1.Params.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = kyve.query.v1beta1.Params.QueryParamsRequest.class,
      responseType = kyve.query.v1beta1.Params.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.query.v1beta1.Params.QueryParamsRequest,
      kyve.query.v1beta1.Params.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<kyve.query.v1beta1.Params.QueryParamsRequest, kyve.query.v1beta1.Params.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryParamsGrpc.getParamsMethod) == null) {
      synchronized (QueryParamsGrpc.class) {
        if ((getParamsMethod = QueryParamsGrpc.getParamsMethod) == null) {
          QueryParamsGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<kyve.query.v1beta1.Params.QueryParamsRequest, kyve.query.v1beta1.Params.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Params.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Params.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryParamsMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryParamsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryParamsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryParamsStub>() {
        @java.lang.Override
        public QueryParamsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryParamsStub(channel, callOptions);
        }
      };
    return QueryParamsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryParamsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryParamsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryParamsBlockingStub>() {
        @java.lang.Override
        public QueryParamsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryParamsBlockingStub(channel, callOptions);
        }
      };
    return QueryParamsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryParamsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryParamsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryParamsFutureStub>() {
        @java.lang.Override
        public QueryParamsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryParamsFutureStub(channel, callOptions);
        }
      };
    return QueryParamsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * QueryPool ...
   * </pre>
   */
  public static abstract class QueryParamsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Pools queries for all pools.
     * </pre>
     */
    public void params(kyve.query.v1beta1.Params.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Params.QueryParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.query.v1beta1.Params.QueryParamsRequest,
                kyve.query.v1beta1.Params.QueryParamsResponse>(
                  this, METHODID_PARAMS)))
          .build();
    }
  }

  /**
   * <pre>
   * QueryPool ...
   * </pre>
   */
  public static final class QueryParamsStub extends io.grpc.stub.AbstractAsyncStub<QueryParamsStub> {
    private QueryParamsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryParamsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryParamsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Pools queries for all pools.
     * </pre>
     */
    public void params(kyve.query.v1beta1.Params.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Params.QueryParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * QueryPool ...
   * </pre>
   */
  public static final class QueryParamsBlockingStub extends io.grpc.stub.AbstractBlockingStub<QueryParamsBlockingStub> {
    private QueryParamsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryParamsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryParamsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Pools queries for all pools.
     * </pre>
     */
    public kyve.query.v1beta1.Params.QueryParamsResponse params(kyve.query.v1beta1.Params.QueryParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * QueryPool ...
   * </pre>
   */
  public static final class QueryParamsFutureStub extends io.grpc.stub.AbstractFutureStub<QueryParamsFutureStub> {
    private QueryParamsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryParamsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryParamsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Pools queries for all pools.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.query.v1beta1.Params.QueryParamsResponse> params(
        kyve.query.v1beta1.Params.QueryParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QueryParamsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QueryParamsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PARAMS:
          serviceImpl.params((kyve.query.v1beta1.Params.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<kyve.query.v1beta1.Params.QueryParamsResponse>) responseObserver);
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

  private static abstract class QueryParamsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryParamsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return kyve.query.v1beta1.Params.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QueryParams");
    }
  }

  private static final class QueryParamsFileDescriptorSupplier
      extends QueryParamsBaseDescriptorSupplier {
    QueryParamsFileDescriptorSupplier() {}
  }

  private static final class QueryParamsMethodDescriptorSupplier
      extends QueryParamsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryParamsMethodDescriptorSupplier(String methodName) {
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
      synchronized (QueryParamsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryParamsFileDescriptorSupplier())
              .addMethod(getParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
