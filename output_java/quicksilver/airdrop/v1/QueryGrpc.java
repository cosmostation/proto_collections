package quicksilver.airdrop.v1;

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
    comments = "Source: quicksilver/airdrop/v1/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "quicksilver.airdrop.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<quicksilver.airdrop.v1.QueryOuterClass.QueryParamsRequest,
      quicksilver.airdrop.v1.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = quicksilver.airdrop.v1.QueryOuterClass.QueryParamsRequest.class,
      responseType = quicksilver.airdrop.v1.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<quicksilver.airdrop.v1.QueryOuterClass.QueryParamsRequest,
      quicksilver.airdrop.v1.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<quicksilver.airdrop.v1.QueryOuterClass.QueryParamsRequest, quicksilver.airdrop.v1.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<quicksilver.airdrop.v1.QueryOuterClass.QueryParamsRequest, quicksilver.airdrop.v1.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.airdrop.v1.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.airdrop.v1.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropRequest,
      quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropResponse> getZoneDropMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ZoneDrop",
      requestType = quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropRequest.class,
      responseType = quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropRequest,
      quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropResponse> getZoneDropMethod() {
    io.grpc.MethodDescriptor<quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropRequest, quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropResponse> getZoneDropMethod;
    if ((getZoneDropMethod = QueryGrpc.getZoneDropMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getZoneDropMethod = QueryGrpc.getZoneDropMethod) == null) {
          QueryGrpc.getZoneDropMethod = getZoneDropMethod =
              io.grpc.MethodDescriptor.<quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropRequest, quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ZoneDrop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ZoneDrop"))
              .build();
        }
      }
    }
    return getZoneDropMethod;
  }

  private static volatile io.grpc.MethodDescriptor<quicksilver.airdrop.v1.QueryOuterClass.QueryAccountBalanceRequest,
      quicksilver.airdrop.v1.QueryOuterClass.QueryAccountBalanceResponse> getAccountBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountBalance",
      requestType = quicksilver.airdrop.v1.QueryOuterClass.QueryAccountBalanceRequest.class,
      responseType = quicksilver.airdrop.v1.QueryOuterClass.QueryAccountBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<quicksilver.airdrop.v1.QueryOuterClass.QueryAccountBalanceRequest,
      quicksilver.airdrop.v1.QueryOuterClass.QueryAccountBalanceResponse> getAccountBalanceMethod() {
    io.grpc.MethodDescriptor<quicksilver.airdrop.v1.QueryOuterClass.QueryAccountBalanceRequest, quicksilver.airdrop.v1.QueryOuterClass.QueryAccountBalanceResponse> getAccountBalanceMethod;
    if ((getAccountBalanceMethod = QueryGrpc.getAccountBalanceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountBalanceMethod = QueryGrpc.getAccountBalanceMethod) == null) {
          QueryGrpc.getAccountBalanceMethod = getAccountBalanceMethod =
              io.grpc.MethodDescriptor.<quicksilver.airdrop.v1.QueryOuterClass.QueryAccountBalanceRequest, quicksilver.airdrop.v1.QueryOuterClass.QueryAccountBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.airdrop.v1.QueryOuterClass.QueryAccountBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.airdrop.v1.QueryOuterClass.QueryAccountBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountBalance"))
              .build();
        }
      }
    }
    return getAccountBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropsRequest,
      quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropsResponse> getZoneDropsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ZoneDrops",
      requestType = quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropsRequest.class,
      responseType = quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropsRequest,
      quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropsResponse> getZoneDropsMethod() {
    io.grpc.MethodDescriptor<quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropsRequest, quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropsResponse> getZoneDropsMethod;
    if ((getZoneDropsMethod = QueryGrpc.getZoneDropsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getZoneDropsMethod = QueryGrpc.getZoneDropsMethod) == null) {
          QueryGrpc.getZoneDropsMethod = getZoneDropsMethod =
              io.grpc.MethodDescriptor.<quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropsRequest, quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ZoneDrops"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ZoneDrops"))
              .build();
        }
      }
    }
    return getZoneDropsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordRequest,
      quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordResponse> getClaimRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimRecord",
      requestType = quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordRequest.class,
      responseType = quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordRequest,
      quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordResponse> getClaimRecordMethod() {
    io.grpc.MethodDescriptor<quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordRequest, quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordResponse> getClaimRecordMethod;
    if ((getClaimRecordMethod = QueryGrpc.getClaimRecordMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClaimRecordMethod = QueryGrpc.getClaimRecordMethod) == null) {
          QueryGrpc.getClaimRecordMethod = getClaimRecordMethod =
              io.grpc.MethodDescriptor.<quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordRequest, quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ClaimRecord"))
              .build();
        }
      }
    }
    return getClaimRecordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordsRequest,
      quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordsResponse> getClaimRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimRecords",
      requestType = quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordsRequest.class,
      responseType = quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordsRequest,
      quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordsResponse> getClaimRecordsMethod() {
    io.grpc.MethodDescriptor<quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordsRequest, quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordsResponse> getClaimRecordsMethod;
    if ((getClaimRecordsMethod = QueryGrpc.getClaimRecordsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClaimRecordsMethod = QueryGrpc.getClaimRecordsMethod) == null) {
          QueryGrpc.getClaimRecordsMethod = getClaimRecordsMethod =
              io.grpc.MethodDescriptor.<quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordsRequest, quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ClaimRecords"))
              .build();
        }
      }
    }
    return getClaimRecordsMethod;
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
     * Params returns the total set of airdrop parameters.
     * </pre>
     */
    public void params(quicksilver.airdrop.v1.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<quicksilver.airdrop.v1.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ZoneDrop returns the details of the specified zone airdrop.
     * </pre>
     */
    public void zoneDrop(quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropRequest request,
        io.grpc.stub.StreamObserver<quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getZoneDropMethod(), responseObserver);
    }

    /**
     * <pre>
     * AccountBalance returns the module account balance of the specified zone.
     * </pre>
     */
    public void accountBalance(quicksilver.airdrop.v1.QueryOuterClass.QueryAccountBalanceRequest request,
        io.grpc.stub.StreamObserver<quicksilver.airdrop.v1.QueryOuterClass.QueryAccountBalanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAccountBalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * ZoneDrops returns all zone airdrops of the specified status.
     * </pre>
     */
    public void zoneDrops(quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropsRequest request,
        io.grpc.stub.StreamObserver<quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getZoneDropsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ClaimRecord returns the claim record that corresponds to the given zone and
     * address.
     * </pre>
     */
    public void claimRecord(quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordRequest request,
        io.grpc.stub.StreamObserver<quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClaimRecordMethod(), responseObserver);
    }

    /**
     * <pre>
     * ClaimRecords returns all the claim records of the given zone.
     * </pre>
     */
    public void claimRecords(quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordsRequest request,
        io.grpc.stub.StreamObserver<quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClaimRecordsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                quicksilver.airdrop.v1.QueryOuterClass.QueryParamsRequest,
                quicksilver.airdrop.v1.QueryOuterClass.QueryParamsResponse>(
                  this, METHODID_PARAMS)))
          .addMethod(
            getZoneDropMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropRequest,
                quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropResponse>(
                  this, METHODID_ZONE_DROP)))
          .addMethod(
            getAccountBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                quicksilver.airdrop.v1.QueryOuterClass.QueryAccountBalanceRequest,
                quicksilver.airdrop.v1.QueryOuterClass.QueryAccountBalanceResponse>(
                  this, METHODID_ACCOUNT_BALANCE)))
          .addMethod(
            getZoneDropsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropsRequest,
                quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropsResponse>(
                  this, METHODID_ZONE_DROPS)))
          .addMethod(
            getClaimRecordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordRequest,
                quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordResponse>(
                  this, METHODID_CLAIM_RECORD)))
          .addMethod(
            getClaimRecordsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordsRequest,
                quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordsResponse>(
                  this, METHODID_CLAIM_RECORDS)))
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
     * Params returns the total set of airdrop parameters.
     * </pre>
     */
    public void params(quicksilver.airdrop.v1.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<quicksilver.airdrop.v1.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ZoneDrop returns the details of the specified zone airdrop.
     * </pre>
     */
    public void zoneDrop(quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropRequest request,
        io.grpc.stub.StreamObserver<quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getZoneDropMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AccountBalance returns the module account balance of the specified zone.
     * </pre>
     */
    public void accountBalance(quicksilver.airdrop.v1.QueryOuterClass.QueryAccountBalanceRequest request,
        io.grpc.stub.StreamObserver<quicksilver.airdrop.v1.QueryOuterClass.QueryAccountBalanceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAccountBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ZoneDrops returns all zone airdrops of the specified status.
     * </pre>
     */
    public void zoneDrops(quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropsRequest request,
        io.grpc.stub.StreamObserver<quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getZoneDropsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ClaimRecord returns the claim record that corresponds to the given zone and
     * address.
     * </pre>
     */
    public void claimRecord(quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordRequest request,
        io.grpc.stub.StreamObserver<quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClaimRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ClaimRecords returns all the claim records of the given zone.
     * </pre>
     */
    public void claimRecords(quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordsRequest request,
        io.grpc.stub.StreamObserver<quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClaimRecordsMethod(), getCallOptions()), request, responseObserver);
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
     * Params returns the total set of airdrop parameters.
     * </pre>
     */
    public quicksilver.airdrop.v1.QueryOuterClass.QueryParamsResponse params(quicksilver.airdrop.v1.QueryOuterClass.QueryParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ZoneDrop returns the details of the specified zone airdrop.
     * </pre>
     */
    public quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropResponse zoneDrop(quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropRequest request) {
      return blockingUnaryCall(
          getChannel(), getZoneDropMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AccountBalance returns the module account balance of the specified zone.
     * </pre>
     */
    public quicksilver.airdrop.v1.QueryOuterClass.QueryAccountBalanceResponse accountBalance(quicksilver.airdrop.v1.QueryOuterClass.QueryAccountBalanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getAccountBalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ZoneDrops returns all zone airdrops of the specified status.
     * </pre>
     */
    public quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropsResponse zoneDrops(quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropsRequest request) {
      return blockingUnaryCall(
          getChannel(), getZoneDropsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ClaimRecord returns the claim record that corresponds to the given zone and
     * address.
     * </pre>
     */
    public quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordResponse claimRecord(quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordRequest request) {
      return blockingUnaryCall(
          getChannel(), getClaimRecordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ClaimRecords returns all the claim records of the given zone.
     * </pre>
     */
    public quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordsResponse claimRecords(quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordsRequest request) {
      return blockingUnaryCall(
          getChannel(), getClaimRecordsMethod(), getCallOptions(), request);
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
     * Params returns the total set of airdrop parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<quicksilver.airdrop.v1.QueryOuterClass.QueryParamsResponse> params(
        quicksilver.airdrop.v1.QueryOuterClass.QueryParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ZoneDrop returns the details of the specified zone airdrop.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropResponse> zoneDrop(
        quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getZoneDropMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AccountBalance returns the module account balance of the specified zone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<quicksilver.airdrop.v1.QueryOuterClass.QueryAccountBalanceResponse> accountBalance(
        quicksilver.airdrop.v1.QueryOuterClass.QueryAccountBalanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAccountBalanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ZoneDrops returns all zone airdrops of the specified status.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropsResponse> zoneDrops(
        quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getZoneDropsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ClaimRecord returns the claim record that corresponds to the given zone and
     * address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordResponse> claimRecord(
        quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getClaimRecordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ClaimRecords returns all the claim records of the given zone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordsResponse> claimRecords(
        quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getClaimRecordsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_ZONE_DROP = 1;
  private static final int METHODID_ACCOUNT_BALANCE = 2;
  private static final int METHODID_ZONE_DROPS = 3;
  private static final int METHODID_CLAIM_RECORD = 4;
  private static final int METHODID_CLAIM_RECORDS = 5;

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
          serviceImpl.params((quicksilver.airdrop.v1.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<quicksilver.airdrop.v1.QueryOuterClass.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_ZONE_DROP:
          serviceImpl.zoneDrop((quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropRequest) request,
              (io.grpc.stub.StreamObserver<quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_BALANCE:
          serviceImpl.accountBalance((quicksilver.airdrop.v1.QueryOuterClass.QueryAccountBalanceRequest) request,
              (io.grpc.stub.StreamObserver<quicksilver.airdrop.v1.QueryOuterClass.QueryAccountBalanceResponse>) responseObserver);
          break;
        case METHODID_ZONE_DROPS:
          serviceImpl.zoneDrops((quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropsRequest) request,
              (io.grpc.stub.StreamObserver<quicksilver.airdrop.v1.QueryOuterClass.QueryZoneDropsResponse>) responseObserver);
          break;
        case METHODID_CLAIM_RECORD:
          serviceImpl.claimRecord((quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordRequest) request,
              (io.grpc.stub.StreamObserver<quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordResponse>) responseObserver);
          break;
        case METHODID_CLAIM_RECORDS:
          serviceImpl.claimRecords((quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordsRequest) request,
              (io.grpc.stub.StreamObserver<quicksilver.airdrop.v1.QueryOuterClass.QueryClaimRecordsResponse>) responseObserver);
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
      return quicksilver.airdrop.v1.QueryOuterClass.getDescriptor();
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
              .addMethod(getZoneDropMethod())
              .addMethod(getAccountBalanceMethod())
              .addMethod(getZoneDropsMethod())
              .addMethod(getClaimRecordMethod())
              .addMethod(getClaimRecordsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
