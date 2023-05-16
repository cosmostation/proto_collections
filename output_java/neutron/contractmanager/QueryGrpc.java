package neutron.contractmanager;

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
    comments = "Source: neutron/contractmanager/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "neutron.contractmanager.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<neutron.contractmanager.QueryOuterClass.QueryParamsRequest,
      neutron.contractmanager.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = neutron.contractmanager.QueryOuterClass.QueryParamsRequest.class,
      responseType = neutron.contractmanager.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<neutron.contractmanager.QueryOuterClass.QueryParamsRequest,
      neutron.contractmanager.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<neutron.contractmanager.QueryOuterClass.QueryParamsRequest, neutron.contractmanager.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<neutron.contractmanager.QueryOuterClass.QueryParamsRequest, neutron.contractmanager.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.contractmanager.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.contractmanager.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<neutron.contractmanager.QueryOuterClass.QueryFailuresRequest,
      neutron.contractmanager.QueryOuterClass.QueryFailuresResponse> getAddressFailuresMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddressFailures",
      requestType = neutron.contractmanager.QueryOuterClass.QueryFailuresRequest.class,
      responseType = neutron.contractmanager.QueryOuterClass.QueryFailuresResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<neutron.contractmanager.QueryOuterClass.QueryFailuresRequest,
      neutron.contractmanager.QueryOuterClass.QueryFailuresResponse> getAddressFailuresMethod() {
    io.grpc.MethodDescriptor<neutron.contractmanager.QueryOuterClass.QueryFailuresRequest, neutron.contractmanager.QueryOuterClass.QueryFailuresResponse> getAddressFailuresMethod;
    if ((getAddressFailuresMethod = QueryGrpc.getAddressFailuresMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAddressFailuresMethod = QueryGrpc.getAddressFailuresMethod) == null) {
          QueryGrpc.getAddressFailuresMethod = getAddressFailuresMethod =
              io.grpc.MethodDescriptor.<neutron.contractmanager.QueryOuterClass.QueryFailuresRequest, neutron.contractmanager.QueryOuterClass.QueryFailuresResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddressFailures"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.contractmanager.QueryOuterClass.QueryFailuresRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.contractmanager.QueryOuterClass.QueryFailuresResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AddressFailures"))
              .build();
        }
      }
    }
    return getAddressFailuresMethod;
  }

  private static volatile io.grpc.MethodDescriptor<neutron.contractmanager.QueryOuterClass.QueryFailuresRequest,
      neutron.contractmanager.QueryOuterClass.QueryFailuresResponse> getFailuresMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Failures",
      requestType = neutron.contractmanager.QueryOuterClass.QueryFailuresRequest.class,
      responseType = neutron.contractmanager.QueryOuterClass.QueryFailuresResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<neutron.contractmanager.QueryOuterClass.QueryFailuresRequest,
      neutron.contractmanager.QueryOuterClass.QueryFailuresResponse> getFailuresMethod() {
    io.grpc.MethodDescriptor<neutron.contractmanager.QueryOuterClass.QueryFailuresRequest, neutron.contractmanager.QueryOuterClass.QueryFailuresResponse> getFailuresMethod;
    if ((getFailuresMethod = QueryGrpc.getFailuresMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFailuresMethod = QueryGrpc.getFailuresMethod) == null) {
          QueryGrpc.getFailuresMethod = getFailuresMethod =
              io.grpc.MethodDescriptor.<neutron.contractmanager.QueryOuterClass.QueryFailuresRequest, neutron.contractmanager.QueryOuterClass.QueryFailuresResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Failures"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.contractmanager.QueryOuterClass.QueryFailuresRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.contractmanager.QueryOuterClass.QueryFailuresResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Failures"))
              .build();
        }
      }
    }
    return getFailuresMethod;
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
    public void params(neutron.contractmanager.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<neutron.contractmanager.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a Failure by address.
     * </pre>
     */
    public void addressFailures(neutron.contractmanager.QueryOuterClass.QueryFailuresRequest request,
        io.grpc.stub.StreamObserver<neutron.contractmanager.QueryOuterClass.QueryFailuresResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddressFailuresMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Failure items.
     * </pre>
     */
    public void failures(neutron.contractmanager.QueryOuterClass.QueryFailuresRequest request,
        io.grpc.stub.StreamObserver<neutron.contractmanager.QueryOuterClass.QueryFailuresResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFailuresMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                neutron.contractmanager.QueryOuterClass.QueryParamsRequest,
                neutron.contractmanager.QueryOuterClass.QueryParamsResponse>(
                  this, METHODID_PARAMS)))
          .addMethod(
            getAddressFailuresMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                neutron.contractmanager.QueryOuterClass.QueryFailuresRequest,
                neutron.contractmanager.QueryOuterClass.QueryFailuresResponse>(
                  this, METHODID_ADDRESS_FAILURES)))
          .addMethod(
            getFailuresMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                neutron.contractmanager.QueryOuterClass.QueryFailuresRequest,
                neutron.contractmanager.QueryOuterClass.QueryFailuresResponse>(
                  this, METHODID_FAILURES)))
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
    public void params(neutron.contractmanager.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<neutron.contractmanager.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a Failure by address.
     * </pre>
     */
    public void addressFailures(neutron.contractmanager.QueryOuterClass.QueryFailuresRequest request,
        io.grpc.stub.StreamObserver<neutron.contractmanager.QueryOuterClass.QueryFailuresResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddressFailuresMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Failure items.
     * </pre>
     */
    public void failures(neutron.contractmanager.QueryOuterClass.QueryFailuresRequest request,
        io.grpc.stub.StreamObserver<neutron.contractmanager.QueryOuterClass.QueryFailuresResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFailuresMethod(), getCallOptions()), request, responseObserver);
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
    public neutron.contractmanager.QueryOuterClass.QueryParamsResponse params(neutron.contractmanager.QueryOuterClass.QueryParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a Failure by address.
     * </pre>
     */
    public neutron.contractmanager.QueryOuterClass.QueryFailuresResponse addressFailures(neutron.contractmanager.QueryOuterClass.QueryFailuresRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddressFailuresMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of Failure items.
     * </pre>
     */
    public neutron.contractmanager.QueryOuterClass.QueryFailuresResponse failures(neutron.contractmanager.QueryOuterClass.QueryFailuresRequest request) {
      return blockingUnaryCall(
          getChannel(), getFailuresMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<neutron.contractmanager.QueryOuterClass.QueryParamsResponse> params(
        neutron.contractmanager.QueryOuterClass.QueryParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a Failure by address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<neutron.contractmanager.QueryOuterClass.QueryFailuresResponse> addressFailures(
        neutron.contractmanager.QueryOuterClass.QueryFailuresRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddressFailuresMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of Failure items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<neutron.contractmanager.QueryOuterClass.QueryFailuresResponse> failures(
        neutron.contractmanager.QueryOuterClass.QueryFailuresRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFailuresMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_ADDRESS_FAILURES = 1;
  private static final int METHODID_FAILURES = 2;

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
          serviceImpl.params((neutron.contractmanager.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<neutron.contractmanager.QueryOuterClass.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_ADDRESS_FAILURES:
          serviceImpl.addressFailures((neutron.contractmanager.QueryOuterClass.QueryFailuresRequest) request,
              (io.grpc.stub.StreamObserver<neutron.contractmanager.QueryOuterClass.QueryFailuresResponse>) responseObserver);
          break;
        case METHODID_FAILURES:
          serviceImpl.failures((neutron.contractmanager.QueryOuterClass.QueryFailuresRequest) request,
              (io.grpc.stub.StreamObserver<neutron.contractmanager.QueryOuterClass.QueryFailuresResponse>) responseObserver);
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
      return neutron.contractmanager.QueryOuterClass.getDescriptor();
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
              .addMethod(getAddressFailuresMethod())
              .addMethod(getFailuresMethod())
              .build();
        }
      }
    }
    return result;
  }
}
