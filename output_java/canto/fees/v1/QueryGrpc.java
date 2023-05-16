package canto.fees.v1;

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
    comments = "Source: canto/fees/v1/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "canto.fees.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<canto.fees.v1.QueryOuterClass.QueryFeesRequest,
      canto.fees.v1.QueryOuterClass.QueryFeesResponse> getFeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Fees",
      requestType = canto.fees.v1.QueryOuterClass.QueryFeesRequest.class,
      responseType = canto.fees.v1.QueryOuterClass.QueryFeesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<canto.fees.v1.QueryOuterClass.QueryFeesRequest,
      canto.fees.v1.QueryOuterClass.QueryFeesResponse> getFeesMethod() {
    io.grpc.MethodDescriptor<canto.fees.v1.QueryOuterClass.QueryFeesRequest, canto.fees.v1.QueryOuterClass.QueryFeesResponse> getFeesMethod;
    if ((getFeesMethod = QueryGrpc.getFeesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFeesMethod = QueryGrpc.getFeesMethod) == null) {
          QueryGrpc.getFeesMethod = getFeesMethod =
              io.grpc.MethodDescriptor.<canto.fees.v1.QueryOuterClass.QueryFeesRequest, canto.fees.v1.QueryOuterClass.QueryFeesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Fees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  canto.fees.v1.QueryOuterClass.QueryFeesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  canto.fees.v1.QueryOuterClass.QueryFeesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Fees"))
              .build();
        }
      }
    }
    return getFeesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<canto.fees.v1.QueryOuterClass.QueryFeeRequest,
      canto.fees.v1.QueryOuterClass.QueryFeeResponse> getFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Fee",
      requestType = canto.fees.v1.QueryOuterClass.QueryFeeRequest.class,
      responseType = canto.fees.v1.QueryOuterClass.QueryFeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<canto.fees.v1.QueryOuterClass.QueryFeeRequest,
      canto.fees.v1.QueryOuterClass.QueryFeeResponse> getFeeMethod() {
    io.grpc.MethodDescriptor<canto.fees.v1.QueryOuterClass.QueryFeeRequest, canto.fees.v1.QueryOuterClass.QueryFeeResponse> getFeeMethod;
    if ((getFeeMethod = QueryGrpc.getFeeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFeeMethod = QueryGrpc.getFeeMethod) == null) {
          QueryGrpc.getFeeMethod = getFeeMethod =
              io.grpc.MethodDescriptor.<canto.fees.v1.QueryOuterClass.QueryFeeRequest, canto.fees.v1.QueryOuterClass.QueryFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Fee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  canto.fees.v1.QueryOuterClass.QueryFeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  canto.fees.v1.QueryOuterClass.QueryFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Fee"))
              .build();
        }
      }
    }
    return getFeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<canto.fees.v1.QueryOuterClass.QueryParamsRequest,
      canto.fees.v1.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = canto.fees.v1.QueryOuterClass.QueryParamsRequest.class,
      responseType = canto.fees.v1.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<canto.fees.v1.QueryOuterClass.QueryParamsRequest,
      canto.fees.v1.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<canto.fees.v1.QueryOuterClass.QueryParamsRequest, canto.fees.v1.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<canto.fees.v1.QueryOuterClass.QueryParamsRequest, canto.fees.v1.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  canto.fees.v1.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  canto.fees.v1.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<canto.fees.v1.QueryOuterClass.QueryDeployerFeesRequest,
      canto.fees.v1.QueryOuterClass.QueryDeployerFeesResponse> getDeployerFeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeployerFees",
      requestType = canto.fees.v1.QueryOuterClass.QueryDeployerFeesRequest.class,
      responseType = canto.fees.v1.QueryOuterClass.QueryDeployerFeesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<canto.fees.v1.QueryOuterClass.QueryDeployerFeesRequest,
      canto.fees.v1.QueryOuterClass.QueryDeployerFeesResponse> getDeployerFeesMethod() {
    io.grpc.MethodDescriptor<canto.fees.v1.QueryOuterClass.QueryDeployerFeesRequest, canto.fees.v1.QueryOuterClass.QueryDeployerFeesResponse> getDeployerFeesMethod;
    if ((getDeployerFeesMethod = QueryGrpc.getDeployerFeesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDeployerFeesMethod = QueryGrpc.getDeployerFeesMethod) == null) {
          QueryGrpc.getDeployerFeesMethod = getDeployerFeesMethod =
              io.grpc.MethodDescriptor.<canto.fees.v1.QueryOuterClass.QueryDeployerFeesRequest, canto.fees.v1.QueryOuterClass.QueryDeployerFeesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeployerFees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  canto.fees.v1.QueryOuterClass.QueryDeployerFeesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  canto.fees.v1.QueryOuterClass.QueryDeployerFeesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DeployerFees"))
              .build();
        }
      }
    }
    return getDeployerFeesMethod;
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
     * Fees retrieves all registered contracts for fee distribution
     * </pre>
     */
    public void fees(canto.fees.v1.QueryOuterClass.QueryFeesRequest request,
        io.grpc.stub.StreamObserver<canto.fees.v1.QueryOuterClass.QueryFeesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFeesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Fee retrieves a registered contract for fee distribution for a given
     * address
     * </pre>
     */
    public void fee(canto.fees.v1.QueryOuterClass.QueryFeeRequest request,
        io.grpc.stub.StreamObserver<canto.fees.v1.QueryOuterClass.QueryFeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFeeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params retrieves the fees module params
     * </pre>
     */
    public void params(canto.fees.v1.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<canto.fees.v1.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeployerFees retrieves all contracts that a given deployer has registered
     * for fee distribution
     * </pre>
     */
    public void deployerFees(canto.fees.v1.QueryOuterClass.QueryDeployerFeesRequest request,
        io.grpc.stub.StreamObserver<canto.fees.v1.QueryOuterClass.QueryDeployerFeesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeployerFeesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFeesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                canto.fees.v1.QueryOuterClass.QueryFeesRequest,
                canto.fees.v1.QueryOuterClass.QueryFeesResponse>(
                  this, METHODID_FEES)))
          .addMethod(
            getFeeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                canto.fees.v1.QueryOuterClass.QueryFeeRequest,
                canto.fees.v1.QueryOuterClass.QueryFeeResponse>(
                  this, METHODID_FEE)))
          .addMethod(
            getParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                canto.fees.v1.QueryOuterClass.QueryParamsRequest,
                canto.fees.v1.QueryOuterClass.QueryParamsResponse>(
                  this, METHODID_PARAMS)))
          .addMethod(
            getDeployerFeesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                canto.fees.v1.QueryOuterClass.QueryDeployerFeesRequest,
                canto.fees.v1.QueryOuterClass.QueryDeployerFeesResponse>(
                  this, METHODID_DEPLOYER_FEES)))
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
     * Fees retrieves all registered contracts for fee distribution
     * </pre>
     */
    public void fees(canto.fees.v1.QueryOuterClass.QueryFeesRequest request,
        io.grpc.stub.StreamObserver<canto.fees.v1.QueryOuterClass.QueryFeesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFeesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Fee retrieves a registered contract for fee distribution for a given
     * address
     * </pre>
     */
    public void fee(canto.fees.v1.QueryOuterClass.QueryFeeRequest request,
        io.grpc.stub.StreamObserver<canto.fees.v1.QueryOuterClass.QueryFeeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params retrieves the fees module params
     * </pre>
     */
    public void params(canto.fees.v1.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<canto.fees.v1.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeployerFees retrieves all contracts that a given deployer has registered
     * for fee distribution
     * </pre>
     */
    public void deployerFees(canto.fees.v1.QueryOuterClass.QueryDeployerFeesRequest request,
        io.grpc.stub.StreamObserver<canto.fees.v1.QueryOuterClass.QueryDeployerFeesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeployerFeesMethod(), getCallOptions()), request, responseObserver);
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
     * Fees retrieves all registered contracts for fee distribution
     * </pre>
     */
    public canto.fees.v1.QueryOuterClass.QueryFeesResponse fees(canto.fees.v1.QueryOuterClass.QueryFeesRequest request) {
      return blockingUnaryCall(
          getChannel(), getFeesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Fee retrieves a registered contract for fee distribution for a given
     * address
     * </pre>
     */
    public canto.fees.v1.QueryOuterClass.QueryFeeResponse fee(canto.fees.v1.QueryOuterClass.QueryFeeRequest request) {
      return blockingUnaryCall(
          getChannel(), getFeeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params retrieves the fees module params
     * </pre>
     */
    public canto.fees.v1.QueryOuterClass.QueryParamsResponse params(canto.fees.v1.QueryOuterClass.QueryParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeployerFees retrieves all contracts that a given deployer has registered
     * for fee distribution
     * </pre>
     */
    public canto.fees.v1.QueryOuterClass.QueryDeployerFeesResponse deployerFees(canto.fees.v1.QueryOuterClass.QueryDeployerFeesRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeployerFeesMethod(), getCallOptions(), request);
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
     * Fees retrieves all registered contracts for fee distribution
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<canto.fees.v1.QueryOuterClass.QueryFeesResponse> fees(
        canto.fees.v1.QueryOuterClass.QueryFeesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFeesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Fee retrieves a registered contract for fee distribution for a given
     * address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<canto.fees.v1.QueryOuterClass.QueryFeeResponse> fee(
        canto.fees.v1.QueryOuterClass.QueryFeeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFeeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params retrieves the fees module params
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<canto.fees.v1.QueryOuterClass.QueryParamsResponse> params(
        canto.fees.v1.QueryOuterClass.QueryParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeployerFees retrieves all contracts that a given deployer has registered
     * for fee distribution
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<canto.fees.v1.QueryOuterClass.QueryDeployerFeesResponse> deployerFees(
        canto.fees.v1.QueryOuterClass.QueryDeployerFeesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeployerFeesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FEES = 0;
  private static final int METHODID_FEE = 1;
  private static final int METHODID_PARAMS = 2;
  private static final int METHODID_DEPLOYER_FEES = 3;

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
        case METHODID_FEES:
          serviceImpl.fees((canto.fees.v1.QueryOuterClass.QueryFeesRequest) request,
              (io.grpc.stub.StreamObserver<canto.fees.v1.QueryOuterClass.QueryFeesResponse>) responseObserver);
          break;
        case METHODID_FEE:
          serviceImpl.fee((canto.fees.v1.QueryOuterClass.QueryFeeRequest) request,
              (io.grpc.stub.StreamObserver<canto.fees.v1.QueryOuterClass.QueryFeeResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((canto.fees.v1.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<canto.fees.v1.QueryOuterClass.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_DEPLOYER_FEES:
          serviceImpl.deployerFees((canto.fees.v1.QueryOuterClass.QueryDeployerFeesRequest) request,
              (io.grpc.stub.StreamObserver<canto.fees.v1.QueryOuterClass.QueryDeployerFeesResponse>) responseObserver);
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
      return canto.fees.v1.QueryOuterClass.getDescriptor();
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
              .addMethod(getFeesMethod())
              .addMethod(getFeeMethod())
              .addMethod(getParamsMethod())
              .addMethod(getDeployerFeesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
