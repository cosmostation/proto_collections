package neutron.interchaintxs;

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
    comments = "Source: neutron/interchaintxs/v1/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "neutron.interchaintxs.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<neutron.interchaintxs.QueryOuterClass.QueryParamsRequest,
      neutron.interchaintxs.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = neutron.interchaintxs.QueryOuterClass.QueryParamsRequest.class,
      responseType = neutron.interchaintxs.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<neutron.interchaintxs.QueryOuterClass.QueryParamsRequest,
      neutron.interchaintxs.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<neutron.interchaintxs.QueryOuterClass.QueryParamsRequest, neutron.interchaintxs.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<neutron.interchaintxs.QueryOuterClass.QueryParamsRequest, neutron.interchaintxs.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.interchaintxs.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.interchaintxs.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<neutron.interchaintxs.QueryOuterClass.QueryInterchainAccountAddressRequest,
      neutron.interchaintxs.QueryOuterClass.QueryInterchainAccountAddressResponse> getInterchainAccountAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InterchainAccountAddress",
      requestType = neutron.interchaintxs.QueryOuterClass.QueryInterchainAccountAddressRequest.class,
      responseType = neutron.interchaintxs.QueryOuterClass.QueryInterchainAccountAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<neutron.interchaintxs.QueryOuterClass.QueryInterchainAccountAddressRequest,
      neutron.interchaintxs.QueryOuterClass.QueryInterchainAccountAddressResponse> getInterchainAccountAddressMethod() {
    io.grpc.MethodDescriptor<neutron.interchaintxs.QueryOuterClass.QueryInterchainAccountAddressRequest, neutron.interchaintxs.QueryOuterClass.QueryInterchainAccountAddressResponse> getInterchainAccountAddressMethod;
    if ((getInterchainAccountAddressMethod = QueryGrpc.getInterchainAccountAddressMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getInterchainAccountAddressMethod = QueryGrpc.getInterchainAccountAddressMethod) == null) {
          QueryGrpc.getInterchainAccountAddressMethod = getInterchainAccountAddressMethod =
              io.grpc.MethodDescriptor.<neutron.interchaintxs.QueryOuterClass.QueryInterchainAccountAddressRequest, neutron.interchaintxs.QueryOuterClass.QueryInterchainAccountAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InterchainAccountAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.interchaintxs.QueryOuterClass.QueryInterchainAccountAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.interchaintxs.QueryOuterClass.QueryInterchainAccountAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("InterchainAccountAddress"))
              .build();
        }
      }
    }
    return getInterchainAccountAddressMethod;
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
    public void params(neutron.interchaintxs.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<neutron.interchaintxs.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     */
    public void interchainAccountAddress(neutron.interchaintxs.QueryOuterClass.QueryInterchainAccountAddressRequest request,
        io.grpc.stub.StreamObserver<neutron.interchaintxs.QueryOuterClass.QueryInterchainAccountAddressResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInterchainAccountAddressMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                neutron.interchaintxs.QueryOuterClass.QueryParamsRequest,
                neutron.interchaintxs.QueryOuterClass.QueryParamsResponse>(
                  this, METHODID_PARAMS)))
          .addMethod(
            getInterchainAccountAddressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                neutron.interchaintxs.QueryOuterClass.QueryInterchainAccountAddressRequest,
                neutron.interchaintxs.QueryOuterClass.QueryInterchainAccountAddressResponse>(
                  this, METHODID_INTERCHAIN_ACCOUNT_ADDRESS)))
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
    public void params(neutron.interchaintxs.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<neutron.interchaintxs.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void interchainAccountAddress(neutron.interchaintxs.QueryOuterClass.QueryInterchainAccountAddressRequest request,
        io.grpc.stub.StreamObserver<neutron.interchaintxs.QueryOuterClass.QueryInterchainAccountAddressResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInterchainAccountAddressMethod(), getCallOptions()), request, responseObserver);
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
    public neutron.interchaintxs.QueryOuterClass.QueryParamsResponse params(neutron.interchaintxs.QueryOuterClass.QueryParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public neutron.interchaintxs.QueryOuterClass.QueryInterchainAccountAddressResponse interchainAccountAddress(neutron.interchaintxs.QueryOuterClass.QueryInterchainAccountAddressRequest request) {
      return blockingUnaryCall(
          getChannel(), getInterchainAccountAddressMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<neutron.interchaintxs.QueryOuterClass.QueryParamsResponse> params(
        neutron.interchaintxs.QueryOuterClass.QueryParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<neutron.interchaintxs.QueryOuterClass.QueryInterchainAccountAddressResponse> interchainAccountAddress(
        neutron.interchaintxs.QueryOuterClass.QueryInterchainAccountAddressRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getInterchainAccountAddressMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_INTERCHAIN_ACCOUNT_ADDRESS = 1;

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
          serviceImpl.params((neutron.interchaintxs.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<neutron.interchaintxs.QueryOuterClass.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_INTERCHAIN_ACCOUNT_ADDRESS:
          serviceImpl.interchainAccountAddress((neutron.interchaintxs.QueryOuterClass.QueryInterchainAccountAddressRequest) request,
              (io.grpc.stub.StreamObserver<neutron.interchaintxs.QueryOuterClass.QueryInterchainAccountAddressResponse>) responseObserver);
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
      return neutron.interchaintxs.QueryOuterClass.getDescriptor();
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
              .addMethod(getInterchainAccountAddressMethod())
              .build();
        }
      }
    }
    return result;
  }
}
