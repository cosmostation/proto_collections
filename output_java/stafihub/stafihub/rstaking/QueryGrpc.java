package stafihub.stafihub.rstaking;

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
    comments = "Source: stafihub/rstaking/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "stafihub.stafihub.rstaking.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rstaking.QueryOuterClass.QueryParamsRequest,
      stafihub.stafihub.rstaking.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = stafihub.stafihub.rstaking.QueryOuterClass.QueryParamsRequest.class,
      responseType = stafihub.stafihub.rstaking.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rstaking.QueryOuterClass.QueryParamsRequest,
      stafihub.stafihub.rstaking.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rstaking.QueryOuterClass.QueryParamsRequest, stafihub.stafihub.rstaking.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rstaking.QueryOuterClass.QueryParamsRequest, stafihub.stafihub.rstaking.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rstaking.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rstaking.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rstaking.QueryOuterClass.QueryInflationBaseRequest,
      stafihub.stafihub.rstaking.QueryOuterClass.QueryInflationBaseResponse> getInflationBaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InflationBase",
      requestType = stafihub.stafihub.rstaking.QueryOuterClass.QueryInflationBaseRequest.class,
      responseType = stafihub.stafihub.rstaking.QueryOuterClass.QueryInflationBaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rstaking.QueryOuterClass.QueryInflationBaseRequest,
      stafihub.stafihub.rstaking.QueryOuterClass.QueryInflationBaseResponse> getInflationBaseMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rstaking.QueryOuterClass.QueryInflationBaseRequest, stafihub.stafihub.rstaking.QueryOuterClass.QueryInflationBaseResponse> getInflationBaseMethod;
    if ((getInflationBaseMethod = QueryGrpc.getInflationBaseMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getInflationBaseMethod = QueryGrpc.getInflationBaseMethod) == null) {
          QueryGrpc.getInflationBaseMethod = getInflationBaseMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rstaking.QueryOuterClass.QueryInflationBaseRequest, stafihub.stafihub.rstaking.QueryOuterClass.QueryInflationBaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InflationBase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rstaking.QueryOuterClass.QueryInflationBaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rstaking.QueryOuterClass.QueryInflationBaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("InflationBase"))
              .build();
        }
      }
    }
    return getInflationBaseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistRequest,
      stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistResponse> getValidatorWhitelistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidatorWhitelist",
      requestType = stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistRequest.class,
      responseType = stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistRequest,
      stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistResponse> getValidatorWhitelistMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistRequest, stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistResponse> getValidatorWhitelistMethod;
    if ((getValidatorWhitelistMethod = QueryGrpc.getValidatorWhitelistMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValidatorWhitelistMethod = QueryGrpc.getValidatorWhitelistMethod) == null) {
          QueryGrpc.getValidatorWhitelistMethod = getValidatorWhitelistMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistRequest, stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidatorWhitelist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ValidatorWhitelist"))
              .build();
        }
      }
    }
    return getValidatorWhitelistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistSwitchRequest,
      stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistSwitchResponse> getValidatorWhitelistSwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidatorWhitelistSwitch",
      requestType = stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistSwitchRequest.class,
      responseType = stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistSwitchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistSwitchRequest,
      stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistSwitchResponse> getValidatorWhitelistSwitchMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistSwitchRequest, stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistSwitchResponse> getValidatorWhitelistSwitchMethod;
    if ((getValidatorWhitelistSwitchMethod = QueryGrpc.getValidatorWhitelistSwitchMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValidatorWhitelistSwitchMethod = QueryGrpc.getValidatorWhitelistSwitchMethod) == null) {
          QueryGrpc.getValidatorWhitelistSwitchMethod = getValidatorWhitelistSwitchMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistSwitchRequest, stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistSwitchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidatorWhitelistSwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistSwitchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistSwitchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ValidatorWhitelistSwitch"))
              .build();
        }
      }
    }
    return getValidatorWhitelistSwitchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistRequest,
      stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistResponse> getDelegatorWhitelistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DelegatorWhitelist",
      requestType = stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistRequest.class,
      responseType = stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistRequest,
      stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistResponse> getDelegatorWhitelistMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistRequest, stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistResponse> getDelegatorWhitelistMethod;
    if ((getDelegatorWhitelistMethod = QueryGrpc.getDelegatorWhitelistMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDelegatorWhitelistMethod = QueryGrpc.getDelegatorWhitelistMethod) == null) {
          QueryGrpc.getDelegatorWhitelistMethod = getDelegatorWhitelistMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistRequest, stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DelegatorWhitelist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DelegatorWhitelist"))
              .build();
        }
      }
    }
    return getDelegatorWhitelistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistSwitchRequest,
      stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistSwitchResponse> getDelegatorWhitelistSwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DelegatorWhitelistSwitch",
      requestType = stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistSwitchRequest.class,
      responseType = stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistSwitchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistSwitchRequest,
      stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistSwitchResponse> getDelegatorWhitelistSwitchMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistSwitchRequest, stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistSwitchResponse> getDelegatorWhitelistSwitchMethod;
    if ((getDelegatorWhitelistSwitchMethod = QueryGrpc.getDelegatorWhitelistSwitchMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDelegatorWhitelistSwitchMethod = QueryGrpc.getDelegatorWhitelistSwitchMethod) == null) {
          QueryGrpc.getDelegatorWhitelistSwitchMethod = getDelegatorWhitelistSwitchMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistSwitchRequest, stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistSwitchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DelegatorWhitelistSwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistSwitchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistSwitchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DelegatorWhitelistSwitch"))
              .build();
        }
      }
    }
    return getDelegatorWhitelistSwitchMethod;
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
    public void params(stafihub.stafihub.rstaking.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rstaking.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of InflationBase items.
     * </pre>
     */
    public void inflationBase(stafihub.stafihub.rstaking.QueryOuterClass.QueryInflationBaseRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rstaking.QueryOuterClass.QueryInflationBaseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInflationBaseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ValidatorWhitelist items.
     * </pre>
     */
    public void validatorWhitelist(stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getValidatorWhitelistMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of WhitelistSwitch items.
     * </pre>
     */
    public void validatorWhitelistSwitch(stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistSwitchRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistSwitchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getValidatorWhitelistSwitchMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of DelegatorWhitelist items.
     * </pre>
     */
    public void delegatorWhitelist(stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDelegatorWhitelistMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of DelegatorWhitelistSwitch items.
     * </pre>
     */
    public void delegatorWhitelistSwitch(stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistSwitchRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistSwitchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDelegatorWhitelistSwitchMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rstaking.QueryOuterClass.QueryParamsRequest,
                stafihub.stafihub.rstaking.QueryOuterClass.QueryParamsResponse>(
                  this, METHODID_PARAMS)))
          .addMethod(
            getInflationBaseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rstaking.QueryOuterClass.QueryInflationBaseRequest,
                stafihub.stafihub.rstaking.QueryOuterClass.QueryInflationBaseResponse>(
                  this, METHODID_INFLATION_BASE)))
          .addMethod(
            getValidatorWhitelistMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistRequest,
                stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistResponse>(
                  this, METHODID_VALIDATOR_WHITELIST)))
          .addMethod(
            getValidatorWhitelistSwitchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistSwitchRequest,
                stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistSwitchResponse>(
                  this, METHODID_VALIDATOR_WHITELIST_SWITCH)))
          .addMethod(
            getDelegatorWhitelistMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistRequest,
                stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistResponse>(
                  this, METHODID_DELEGATOR_WHITELIST)))
          .addMethod(
            getDelegatorWhitelistSwitchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistSwitchRequest,
                stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistSwitchResponse>(
                  this, METHODID_DELEGATOR_WHITELIST_SWITCH)))
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
    public void params(stafihub.stafihub.rstaking.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rstaking.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of InflationBase items.
     * </pre>
     */
    public void inflationBase(stafihub.stafihub.rstaking.QueryOuterClass.QueryInflationBaseRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rstaking.QueryOuterClass.QueryInflationBaseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInflationBaseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ValidatorWhitelist items.
     * </pre>
     */
    public void validatorWhitelist(stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getValidatorWhitelistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of WhitelistSwitch items.
     * </pre>
     */
    public void validatorWhitelistSwitch(stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistSwitchRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistSwitchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getValidatorWhitelistSwitchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of DelegatorWhitelist items.
     * </pre>
     */
    public void delegatorWhitelist(stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDelegatorWhitelistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of DelegatorWhitelistSwitch items.
     * </pre>
     */
    public void delegatorWhitelistSwitch(stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistSwitchRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistSwitchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDelegatorWhitelistSwitchMethod(), getCallOptions()), request, responseObserver);
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
    public stafihub.stafihub.rstaking.QueryOuterClass.QueryParamsResponse params(stafihub.stafihub.rstaking.QueryOuterClass.QueryParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of InflationBase items.
     * </pre>
     */
    public stafihub.stafihub.rstaking.QueryOuterClass.QueryInflationBaseResponse inflationBase(stafihub.stafihub.rstaking.QueryOuterClass.QueryInflationBaseRequest request) {
      return blockingUnaryCall(
          getChannel(), getInflationBaseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of ValidatorWhitelist items.
     * </pre>
     */
    public stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistResponse validatorWhitelist(stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistRequest request) {
      return blockingUnaryCall(
          getChannel(), getValidatorWhitelistMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of WhitelistSwitch items.
     * </pre>
     */
    public stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistSwitchResponse validatorWhitelistSwitch(stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistSwitchRequest request) {
      return blockingUnaryCall(
          getChannel(), getValidatorWhitelistSwitchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of DelegatorWhitelist items.
     * </pre>
     */
    public stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistResponse delegatorWhitelist(stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistRequest request) {
      return blockingUnaryCall(
          getChannel(), getDelegatorWhitelistMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of DelegatorWhitelistSwitch items.
     * </pre>
     */
    public stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistSwitchResponse delegatorWhitelistSwitch(stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistSwitchRequest request) {
      return blockingUnaryCall(
          getChannel(), getDelegatorWhitelistSwitchMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rstaking.QueryOuterClass.QueryParamsResponse> params(
        stafihub.stafihub.rstaking.QueryOuterClass.QueryParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of InflationBase items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rstaking.QueryOuterClass.QueryInflationBaseResponse> inflationBase(
        stafihub.stafihub.rstaking.QueryOuterClass.QueryInflationBaseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getInflationBaseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of ValidatorWhitelist items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistResponse> validatorWhitelist(
        stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getValidatorWhitelistMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of WhitelistSwitch items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistSwitchResponse> validatorWhitelistSwitch(
        stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistSwitchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getValidatorWhitelistSwitchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of DelegatorWhitelist items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistResponse> delegatorWhitelist(
        stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDelegatorWhitelistMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of DelegatorWhitelistSwitch items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistSwitchResponse> delegatorWhitelistSwitch(
        stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistSwitchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDelegatorWhitelistSwitchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_INFLATION_BASE = 1;
  private static final int METHODID_VALIDATOR_WHITELIST = 2;
  private static final int METHODID_VALIDATOR_WHITELIST_SWITCH = 3;
  private static final int METHODID_DELEGATOR_WHITELIST = 4;
  private static final int METHODID_DELEGATOR_WHITELIST_SWITCH = 5;

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
          serviceImpl.params((stafihub.stafihub.rstaking.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rstaking.QueryOuterClass.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_INFLATION_BASE:
          serviceImpl.inflationBase((stafihub.stafihub.rstaking.QueryOuterClass.QueryInflationBaseRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rstaking.QueryOuterClass.QueryInflationBaseResponse>) responseObserver);
          break;
        case METHODID_VALIDATOR_WHITELIST:
          serviceImpl.validatorWhitelist((stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistResponse>) responseObserver);
          break;
        case METHODID_VALIDATOR_WHITELIST_SWITCH:
          serviceImpl.validatorWhitelistSwitch((stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistSwitchRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rstaking.QueryOuterClass.QueryValidatorWhitelistSwitchResponse>) responseObserver);
          break;
        case METHODID_DELEGATOR_WHITELIST:
          serviceImpl.delegatorWhitelist((stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistResponse>) responseObserver);
          break;
        case METHODID_DELEGATOR_WHITELIST_SWITCH:
          serviceImpl.delegatorWhitelistSwitch((stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistSwitchRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rstaking.QueryOuterClass.QueryDelegatorWhitelistSwitchResponse>) responseObserver);
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
      return stafihub.stafihub.rstaking.QueryOuterClass.getDescriptor();
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
              .addMethod(getInflationBaseMethod())
              .addMethod(getValidatorWhitelistMethod())
              .addMethod(getValidatorWhitelistSwitchMethod())
              .addMethod(getDelegatorWhitelistMethod())
              .addMethod(getDelegatorWhitelistSwitchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
