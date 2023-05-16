package neutron.feeburner;

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
    comments = "Source: neutron/feeburner/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "neutron.feeburner.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<neutron.feeburner.QueryOuterClass.QueryParamsRequest,
      neutron.feeburner.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = neutron.feeburner.QueryOuterClass.QueryParamsRequest.class,
      responseType = neutron.feeburner.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<neutron.feeburner.QueryOuterClass.QueryParamsRequest,
      neutron.feeburner.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<neutron.feeburner.QueryOuterClass.QueryParamsRequest, neutron.feeburner.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<neutron.feeburner.QueryOuterClass.QueryParamsRequest, neutron.feeburner.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.feeburner.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.feeburner.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<neutron.feeburner.QueryOuterClass.QueryTotalBurnedNeutronsAmountRequest,
      neutron.feeburner.QueryOuterClass.QueryTotalBurnedNeutronsAmountResponse> getTotalBurnedNeutronsAmountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalBurnedNeutronsAmount",
      requestType = neutron.feeburner.QueryOuterClass.QueryTotalBurnedNeutronsAmountRequest.class,
      responseType = neutron.feeburner.QueryOuterClass.QueryTotalBurnedNeutronsAmountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<neutron.feeburner.QueryOuterClass.QueryTotalBurnedNeutronsAmountRequest,
      neutron.feeburner.QueryOuterClass.QueryTotalBurnedNeutronsAmountResponse> getTotalBurnedNeutronsAmountMethod() {
    io.grpc.MethodDescriptor<neutron.feeburner.QueryOuterClass.QueryTotalBurnedNeutronsAmountRequest, neutron.feeburner.QueryOuterClass.QueryTotalBurnedNeutronsAmountResponse> getTotalBurnedNeutronsAmountMethod;
    if ((getTotalBurnedNeutronsAmountMethod = QueryGrpc.getTotalBurnedNeutronsAmountMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTotalBurnedNeutronsAmountMethod = QueryGrpc.getTotalBurnedNeutronsAmountMethod) == null) {
          QueryGrpc.getTotalBurnedNeutronsAmountMethod = getTotalBurnedNeutronsAmountMethod =
              io.grpc.MethodDescriptor.<neutron.feeburner.QueryOuterClass.QueryTotalBurnedNeutronsAmountRequest, neutron.feeburner.QueryOuterClass.QueryTotalBurnedNeutronsAmountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalBurnedNeutronsAmount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.feeburner.QueryOuterClass.QueryTotalBurnedNeutronsAmountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.feeburner.QueryOuterClass.QueryTotalBurnedNeutronsAmountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TotalBurnedNeutronsAmount"))
              .build();
        }
      }
    }
    return getTotalBurnedNeutronsAmountMethod;
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
    public void params(neutron.feeburner.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<neutron.feeburner.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * TotalBurnedNeutronsAmount queries total amount of burned neutron fees.
     * </pre>
     */
    public void totalBurnedNeutronsAmount(neutron.feeburner.QueryOuterClass.QueryTotalBurnedNeutronsAmountRequest request,
        io.grpc.stub.StreamObserver<neutron.feeburner.QueryOuterClass.QueryTotalBurnedNeutronsAmountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTotalBurnedNeutronsAmountMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                neutron.feeburner.QueryOuterClass.QueryParamsRequest,
                neutron.feeburner.QueryOuterClass.QueryParamsResponse>(
                  this, METHODID_PARAMS)))
          .addMethod(
            getTotalBurnedNeutronsAmountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                neutron.feeburner.QueryOuterClass.QueryTotalBurnedNeutronsAmountRequest,
                neutron.feeburner.QueryOuterClass.QueryTotalBurnedNeutronsAmountResponse>(
                  this, METHODID_TOTAL_BURNED_NEUTRONS_AMOUNT)))
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
    public void params(neutron.feeburner.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<neutron.feeburner.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TotalBurnedNeutronsAmount queries total amount of burned neutron fees.
     * </pre>
     */
    public void totalBurnedNeutronsAmount(neutron.feeburner.QueryOuterClass.QueryTotalBurnedNeutronsAmountRequest request,
        io.grpc.stub.StreamObserver<neutron.feeburner.QueryOuterClass.QueryTotalBurnedNeutronsAmountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTotalBurnedNeutronsAmountMethod(), getCallOptions()), request, responseObserver);
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
    public neutron.feeburner.QueryOuterClass.QueryParamsResponse params(neutron.feeburner.QueryOuterClass.QueryParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TotalBurnedNeutronsAmount queries total amount of burned neutron fees.
     * </pre>
     */
    public neutron.feeburner.QueryOuterClass.QueryTotalBurnedNeutronsAmountResponse totalBurnedNeutronsAmount(neutron.feeburner.QueryOuterClass.QueryTotalBurnedNeutronsAmountRequest request) {
      return blockingUnaryCall(
          getChannel(), getTotalBurnedNeutronsAmountMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<neutron.feeburner.QueryOuterClass.QueryParamsResponse> params(
        neutron.feeburner.QueryOuterClass.QueryParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TotalBurnedNeutronsAmount queries total amount of burned neutron fees.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<neutron.feeburner.QueryOuterClass.QueryTotalBurnedNeutronsAmountResponse> totalBurnedNeutronsAmount(
        neutron.feeburner.QueryOuterClass.QueryTotalBurnedNeutronsAmountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTotalBurnedNeutronsAmountMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_TOTAL_BURNED_NEUTRONS_AMOUNT = 1;

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
          serviceImpl.params((neutron.feeburner.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<neutron.feeburner.QueryOuterClass.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_TOTAL_BURNED_NEUTRONS_AMOUNT:
          serviceImpl.totalBurnedNeutronsAmount((neutron.feeburner.QueryOuterClass.QueryTotalBurnedNeutronsAmountRequest) request,
              (io.grpc.stub.StreamObserver<neutron.feeburner.QueryOuterClass.QueryTotalBurnedNeutronsAmountResponse>) responseObserver);
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
      return neutron.feeburner.QueryOuterClass.getDescriptor();
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
              .addMethod(getTotalBurnedNeutronsAmountMethod())
              .build();
        }
      }
    }
    return result;
  }
}
