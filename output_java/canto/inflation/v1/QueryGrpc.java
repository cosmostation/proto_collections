package canto.inflation.v1;

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
    comments = "Source: canto/inflation/v1/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "canto.inflation.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<canto.inflation.v1.QueryOuterClass.QueryPeriodRequest,
      canto.inflation.v1.QueryOuterClass.QueryPeriodResponse> getPeriodMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Period",
      requestType = canto.inflation.v1.QueryOuterClass.QueryPeriodRequest.class,
      responseType = canto.inflation.v1.QueryOuterClass.QueryPeriodResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<canto.inflation.v1.QueryOuterClass.QueryPeriodRequest,
      canto.inflation.v1.QueryOuterClass.QueryPeriodResponse> getPeriodMethod() {
    io.grpc.MethodDescriptor<canto.inflation.v1.QueryOuterClass.QueryPeriodRequest, canto.inflation.v1.QueryOuterClass.QueryPeriodResponse> getPeriodMethod;
    if ((getPeriodMethod = QueryGrpc.getPeriodMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPeriodMethod = QueryGrpc.getPeriodMethod) == null) {
          QueryGrpc.getPeriodMethod = getPeriodMethod =
              io.grpc.MethodDescriptor.<canto.inflation.v1.QueryOuterClass.QueryPeriodRequest, canto.inflation.v1.QueryOuterClass.QueryPeriodResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Period"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  canto.inflation.v1.QueryOuterClass.QueryPeriodRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  canto.inflation.v1.QueryOuterClass.QueryPeriodResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Period"))
              .build();
        }
      }
    }
    return getPeriodMethod;
  }

  private static volatile io.grpc.MethodDescriptor<canto.inflation.v1.QueryOuterClass.QueryEpochMintProvisionRequest,
      canto.inflation.v1.QueryOuterClass.QueryEpochMintProvisionResponse> getEpochMintProvisionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EpochMintProvision",
      requestType = canto.inflation.v1.QueryOuterClass.QueryEpochMintProvisionRequest.class,
      responseType = canto.inflation.v1.QueryOuterClass.QueryEpochMintProvisionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<canto.inflation.v1.QueryOuterClass.QueryEpochMintProvisionRequest,
      canto.inflation.v1.QueryOuterClass.QueryEpochMintProvisionResponse> getEpochMintProvisionMethod() {
    io.grpc.MethodDescriptor<canto.inflation.v1.QueryOuterClass.QueryEpochMintProvisionRequest, canto.inflation.v1.QueryOuterClass.QueryEpochMintProvisionResponse> getEpochMintProvisionMethod;
    if ((getEpochMintProvisionMethod = QueryGrpc.getEpochMintProvisionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getEpochMintProvisionMethod = QueryGrpc.getEpochMintProvisionMethod) == null) {
          QueryGrpc.getEpochMintProvisionMethod = getEpochMintProvisionMethod =
              io.grpc.MethodDescriptor.<canto.inflation.v1.QueryOuterClass.QueryEpochMintProvisionRequest, canto.inflation.v1.QueryOuterClass.QueryEpochMintProvisionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EpochMintProvision"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  canto.inflation.v1.QueryOuterClass.QueryEpochMintProvisionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  canto.inflation.v1.QueryOuterClass.QueryEpochMintProvisionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("EpochMintProvision"))
              .build();
        }
      }
    }
    return getEpochMintProvisionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<canto.inflation.v1.QueryOuterClass.QuerySkippedEpochsRequest,
      canto.inflation.v1.QueryOuterClass.QuerySkippedEpochsResponse> getSkippedEpochsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SkippedEpochs",
      requestType = canto.inflation.v1.QueryOuterClass.QuerySkippedEpochsRequest.class,
      responseType = canto.inflation.v1.QueryOuterClass.QuerySkippedEpochsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<canto.inflation.v1.QueryOuterClass.QuerySkippedEpochsRequest,
      canto.inflation.v1.QueryOuterClass.QuerySkippedEpochsResponse> getSkippedEpochsMethod() {
    io.grpc.MethodDescriptor<canto.inflation.v1.QueryOuterClass.QuerySkippedEpochsRequest, canto.inflation.v1.QueryOuterClass.QuerySkippedEpochsResponse> getSkippedEpochsMethod;
    if ((getSkippedEpochsMethod = QueryGrpc.getSkippedEpochsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSkippedEpochsMethod = QueryGrpc.getSkippedEpochsMethod) == null) {
          QueryGrpc.getSkippedEpochsMethod = getSkippedEpochsMethod =
              io.grpc.MethodDescriptor.<canto.inflation.v1.QueryOuterClass.QuerySkippedEpochsRequest, canto.inflation.v1.QueryOuterClass.QuerySkippedEpochsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SkippedEpochs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  canto.inflation.v1.QueryOuterClass.QuerySkippedEpochsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  canto.inflation.v1.QueryOuterClass.QuerySkippedEpochsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SkippedEpochs"))
              .build();
        }
      }
    }
    return getSkippedEpochsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<canto.inflation.v1.QueryOuterClass.QueryCirculatingSupplyRequest,
      canto.inflation.v1.QueryOuterClass.QueryCirculatingSupplyResponse> getCirculatingSupplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CirculatingSupply",
      requestType = canto.inflation.v1.QueryOuterClass.QueryCirculatingSupplyRequest.class,
      responseType = canto.inflation.v1.QueryOuterClass.QueryCirculatingSupplyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<canto.inflation.v1.QueryOuterClass.QueryCirculatingSupplyRequest,
      canto.inflation.v1.QueryOuterClass.QueryCirculatingSupplyResponse> getCirculatingSupplyMethod() {
    io.grpc.MethodDescriptor<canto.inflation.v1.QueryOuterClass.QueryCirculatingSupplyRequest, canto.inflation.v1.QueryOuterClass.QueryCirculatingSupplyResponse> getCirculatingSupplyMethod;
    if ((getCirculatingSupplyMethod = QueryGrpc.getCirculatingSupplyMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCirculatingSupplyMethod = QueryGrpc.getCirculatingSupplyMethod) == null) {
          QueryGrpc.getCirculatingSupplyMethod = getCirculatingSupplyMethod =
              io.grpc.MethodDescriptor.<canto.inflation.v1.QueryOuterClass.QueryCirculatingSupplyRequest, canto.inflation.v1.QueryOuterClass.QueryCirculatingSupplyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CirculatingSupply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  canto.inflation.v1.QueryOuterClass.QueryCirculatingSupplyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  canto.inflation.v1.QueryOuterClass.QueryCirculatingSupplyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CirculatingSupply"))
              .build();
        }
      }
    }
    return getCirculatingSupplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<canto.inflation.v1.QueryOuterClass.QueryInflationRateRequest,
      canto.inflation.v1.QueryOuterClass.QueryInflationRateResponse> getInflationRateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InflationRate",
      requestType = canto.inflation.v1.QueryOuterClass.QueryInflationRateRequest.class,
      responseType = canto.inflation.v1.QueryOuterClass.QueryInflationRateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<canto.inflation.v1.QueryOuterClass.QueryInflationRateRequest,
      canto.inflation.v1.QueryOuterClass.QueryInflationRateResponse> getInflationRateMethod() {
    io.grpc.MethodDescriptor<canto.inflation.v1.QueryOuterClass.QueryInflationRateRequest, canto.inflation.v1.QueryOuterClass.QueryInflationRateResponse> getInflationRateMethod;
    if ((getInflationRateMethod = QueryGrpc.getInflationRateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getInflationRateMethod = QueryGrpc.getInflationRateMethod) == null) {
          QueryGrpc.getInflationRateMethod = getInflationRateMethod =
              io.grpc.MethodDescriptor.<canto.inflation.v1.QueryOuterClass.QueryInflationRateRequest, canto.inflation.v1.QueryOuterClass.QueryInflationRateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InflationRate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  canto.inflation.v1.QueryOuterClass.QueryInflationRateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  canto.inflation.v1.QueryOuterClass.QueryInflationRateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("InflationRate"))
              .build();
        }
      }
    }
    return getInflationRateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<canto.inflation.v1.QueryOuterClass.QueryParamsRequest,
      canto.inflation.v1.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = canto.inflation.v1.QueryOuterClass.QueryParamsRequest.class,
      responseType = canto.inflation.v1.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<canto.inflation.v1.QueryOuterClass.QueryParamsRequest,
      canto.inflation.v1.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<canto.inflation.v1.QueryOuterClass.QueryParamsRequest, canto.inflation.v1.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<canto.inflation.v1.QueryOuterClass.QueryParamsRequest, canto.inflation.v1.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  canto.inflation.v1.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  canto.inflation.v1.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
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
   * Query provides defines the gRPC querier service.
   * </pre>
   */
  public static abstract class QueryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Period retrieves current period.
     * </pre>
     */
    public void period(canto.inflation.v1.QueryOuterClass.QueryPeriodRequest request,
        io.grpc.stub.StreamObserver<canto.inflation.v1.QueryOuterClass.QueryPeriodResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPeriodMethod(), responseObserver);
    }

    /**
     * <pre>
     * EpochMintProvision retrieves current minting epoch provision value.
     * </pre>
     */
    public void epochMintProvision(canto.inflation.v1.QueryOuterClass.QueryEpochMintProvisionRequest request,
        io.grpc.stub.StreamObserver<canto.inflation.v1.QueryOuterClass.QueryEpochMintProvisionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEpochMintProvisionMethod(), responseObserver);
    }

    /**
     * <pre>
     * SkippedEpochs retrieves the total number of skipped epochs.
     * </pre>
     */
    public void skippedEpochs(canto.inflation.v1.QueryOuterClass.QuerySkippedEpochsRequest request,
        io.grpc.stub.StreamObserver<canto.inflation.v1.QueryOuterClass.QuerySkippedEpochsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSkippedEpochsMethod(), responseObserver);
    }

    /**
     * <pre>
     * CirculatingSupply retrieves the total number of tokens that are in
     * circulation (i.e. excluding unvested tokens).
     * </pre>
     */
    public void circulatingSupply(canto.inflation.v1.QueryOuterClass.QueryCirculatingSupplyRequest request,
        io.grpc.stub.StreamObserver<canto.inflation.v1.QueryOuterClass.QueryCirculatingSupplyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCirculatingSupplyMethod(), responseObserver);
    }

    /**
     * <pre>
     * InflationRate retrieves the inflation rate of the current period.
     * </pre>
     */
    public void inflationRate(canto.inflation.v1.QueryOuterClass.QueryInflationRateRequest request,
        io.grpc.stub.StreamObserver<canto.inflation.v1.QueryOuterClass.QueryInflationRateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInflationRateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params retrieves the total set of minting parameters.
     * </pre>
     */
    public void params(canto.inflation.v1.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<canto.inflation.v1.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPeriodMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                canto.inflation.v1.QueryOuterClass.QueryPeriodRequest,
                canto.inflation.v1.QueryOuterClass.QueryPeriodResponse>(
                  this, METHODID_PERIOD)))
          .addMethod(
            getEpochMintProvisionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                canto.inflation.v1.QueryOuterClass.QueryEpochMintProvisionRequest,
                canto.inflation.v1.QueryOuterClass.QueryEpochMintProvisionResponse>(
                  this, METHODID_EPOCH_MINT_PROVISION)))
          .addMethod(
            getSkippedEpochsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                canto.inflation.v1.QueryOuterClass.QuerySkippedEpochsRequest,
                canto.inflation.v1.QueryOuterClass.QuerySkippedEpochsResponse>(
                  this, METHODID_SKIPPED_EPOCHS)))
          .addMethod(
            getCirculatingSupplyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                canto.inflation.v1.QueryOuterClass.QueryCirculatingSupplyRequest,
                canto.inflation.v1.QueryOuterClass.QueryCirculatingSupplyResponse>(
                  this, METHODID_CIRCULATING_SUPPLY)))
          .addMethod(
            getInflationRateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                canto.inflation.v1.QueryOuterClass.QueryInflationRateRequest,
                canto.inflation.v1.QueryOuterClass.QueryInflationRateResponse>(
                  this, METHODID_INFLATION_RATE)))
          .addMethod(
            getParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                canto.inflation.v1.QueryOuterClass.QueryParamsRequest,
                canto.inflation.v1.QueryOuterClass.QueryParamsResponse>(
                  this, METHODID_PARAMS)))
          .build();
    }
  }

  /**
   * <pre>
   * Query provides defines the gRPC querier service.
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
     * Period retrieves current period.
     * </pre>
     */
    public void period(canto.inflation.v1.QueryOuterClass.QueryPeriodRequest request,
        io.grpc.stub.StreamObserver<canto.inflation.v1.QueryOuterClass.QueryPeriodResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPeriodMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EpochMintProvision retrieves current minting epoch provision value.
     * </pre>
     */
    public void epochMintProvision(canto.inflation.v1.QueryOuterClass.QueryEpochMintProvisionRequest request,
        io.grpc.stub.StreamObserver<canto.inflation.v1.QueryOuterClass.QueryEpochMintProvisionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEpochMintProvisionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SkippedEpochs retrieves the total number of skipped epochs.
     * </pre>
     */
    public void skippedEpochs(canto.inflation.v1.QueryOuterClass.QuerySkippedEpochsRequest request,
        io.grpc.stub.StreamObserver<canto.inflation.v1.QueryOuterClass.QuerySkippedEpochsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSkippedEpochsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CirculatingSupply retrieves the total number of tokens that are in
     * circulation (i.e. excluding unvested tokens).
     * </pre>
     */
    public void circulatingSupply(canto.inflation.v1.QueryOuterClass.QueryCirculatingSupplyRequest request,
        io.grpc.stub.StreamObserver<canto.inflation.v1.QueryOuterClass.QueryCirculatingSupplyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCirculatingSupplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * InflationRate retrieves the inflation rate of the current period.
     * </pre>
     */
    public void inflationRate(canto.inflation.v1.QueryOuterClass.QueryInflationRateRequest request,
        io.grpc.stub.StreamObserver<canto.inflation.v1.QueryOuterClass.QueryInflationRateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInflationRateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params retrieves the total set of minting parameters.
     * </pre>
     */
    public void params(canto.inflation.v1.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<canto.inflation.v1.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Query provides defines the gRPC querier service.
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
     * Period retrieves current period.
     * </pre>
     */
    public canto.inflation.v1.QueryOuterClass.QueryPeriodResponse period(canto.inflation.v1.QueryOuterClass.QueryPeriodRequest request) {
      return blockingUnaryCall(
          getChannel(), getPeriodMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EpochMintProvision retrieves current minting epoch provision value.
     * </pre>
     */
    public canto.inflation.v1.QueryOuterClass.QueryEpochMintProvisionResponse epochMintProvision(canto.inflation.v1.QueryOuterClass.QueryEpochMintProvisionRequest request) {
      return blockingUnaryCall(
          getChannel(), getEpochMintProvisionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SkippedEpochs retrieves the total number of skipped epochs.
     * </pre>
     */
    public canto.inflation.v1.QueryOuterClass.QuerySkippedEpochsResponse skippedEpochs(canto.inflation.v1.QueryOuterClass.QuerySkippedEpochsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSkippedEpochsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CirculatingSupply retrieves the total number of tokens that are in
     * circulation (i.e. excluding unvested tokens).
     * </pre>
     */
    public canto.inflation.v1.QueryOuterClass.QueryCirculatingSupplyResponse circulatingSupply(canto.inflation.v1.QueryOuterClass.QueryCirculatingSupplyRequest request) {
      return blockingUnaryCall(
          getChannel(), getCirculatingSupplyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * InflationRate retrieves the inflation rate of the current period.
     * </pre>
     */
    public canto.inflation.v1.QueryOuterClass.QueryInflationRateResponse inflationRate(canto.inflation.v1.QueryOuterClass.QueryInflationRateRequest request) {
      return blockingUnaryCall(
          getChannel(), getInflationRateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params retrieves the total set of minting parameters.
     * </pre>
     */
    public canto.inflation.v1.QueryOuterClass.QueryParamsResponse params(canto.inflation.v1.QueryOuterClass.QueryParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Query provides defines the gRPC querier service.
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
     * Period retrieves current period.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<canto.inflation.v1.QueryOuterClass.QueryPeriodResponse> period(
        canto.inflation.v1.QueryOuterClass.QueryPeriodRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPeriodMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EpochMintProvision retrieves current minting epoch provision value.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<canto.inflation.v1.QueryOuterClass.QueryEpochMintProvisionResponse> epochMintProvision(
        canto.inflation.v1.QueryOuterClass.QueryEpochMintProvisionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEpochMintProvisionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SkippedEpochs retrieves the total number of skipped epochs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<canto.inflation.v1.QueryOuterClass.QuerySkippedEpochsResponse> skippedEpochs(
        canto.inflation.v1.QueryOuterClass.QuerySkippedEpochsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSkippedEpochsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CirculatingSupply retrieves the total number of tokens that are in
     * circulation (i.e. excluding unvested tokens).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<canto.inflation.v1.QueryOuterClass.QueryCirculatingSupplyResponse> circulatingSupply(
        canto.inflation.v1.QueryOuterClass.QueryCirculatingSupplyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCirculatingSupplyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * InflationRate retrieves the inflation rate of the current period.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<canto.inflation.v1.QueryOuterClass.QueryInflationRateResponse> inflationRate(
        canto.inflation.v1.QueryOuterClass.QueryInflationRateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getInflationRateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params retrieves the total set of minting parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<canto.inflation.v1.QueryOuterClass.QueryParamsResponse> params(
        canto.inflation.v1.QueryOuterClass.QueryParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PERIOD = 0;
  private static final int METHODID_EPOCH_MINT_PROVISION = 1;
  private static final int METHODID_SKIPPED_EPOCHS = 2;
  private static final int METHODID_CIRCULATING_SUPPLY = 3;
  private static final int METHODID_INFLATION_RATE = 4;
  private static final int METHODID_PARAMS = 5;

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
        case METHODID_PERIOD:
          serviceImpl.period((canto.inflation.v1.QueryOuterClass.QueryPeriodRequest) request,
              (io.grpc.stub.StreamObserver<canto.inflation.v1.QueryOuterClass.QueryPeriodResponse>) responseObserver);
          break;
        case METHODID_EPOCH_MINT_PROVISION:
          serviceImpl.epochMintProvision((canto.inflation.v1.QueryOuterClass.QueryEpochMintProvisionRequest) request,
              (io.grpc.stub.StreamObserver<canto.inflation.v1.QueryOuterClass.QueryEpochMintProvisionResponse>) responseObserver);
          break;
        case METHODID_SKIPPED_EPOCHS:
          serviceImpl.skippedEpochs((canto.inflation.v1.QueryOuterClass.QuerySkippedEpochsRequest) request,
              (io.grpc.stub.StreamObserver<canto.inflation.v1.QueryOuterClass.QuerySkippedEpochsResponse>) responseObserver);
          break;
        case METHODID_CIRCULATING_SUPPLY:
          serviceImpl.circulatingSupply((canto.inflation.v1.QueryOuterClass.QueryCirculatingSupplyRequest) request,
              (io.grpc.stub.StreamObserver<canto.inflation.v1.QueryOuterClass.QueryCirculatingSupplyResponse>) responseObserver);
          break;
        case METHODID_INFLATION_RATE:
          serviceImpl.inflationRate((canto.inflation.v1.QueryOuterClass.QueryInflationRateRequest) request,
              (io.grpc.stub.StreamObserver<canto.inflation.v1.QueryOuterClass.QueryInflationRateResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((canto.inflation.v1.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<canto.inflation.v1.QueryOuterClass.QueryParamsResponse>) responseObserver);
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
      return canto.inflation.v1.QueryOuterClass.getDescriptor();
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
              .addMethod(getPeriodMethod())
              .addMethod(getEpochMintProvisionMethod())
              .addMethod(getSkippedEpochsMethod())
              .addMethod(getCirculatingSupplyMethod())
              .addMethod(getInflationRateMethod())
              .addMethod(getParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
