package quicksilver.interchainstaking.v1;

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
    comments = "Source: quicksilver/interchainstaking/v1/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "quicksilver.interchainstaking.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<quicksilver.interchainstaking.v1.QueryOuterClass.QueryZonesInfoRequest,
      quicksilver.interchainstaking.v1.QueryOuterClass.QueryZonesInfoResponse> getZoneInfosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ZoneInfos",
      requestType = quicksilver.interchainstaking.v1.QueryOuterClass.QueryZonesInfoRequest.class,
      responseType = quicksilver.interchainstaking.v1.QueryOuterClass.QueryZonesInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<quicksilver.interchainstaking.v1.QueryOuterClass.QueryZonesInfoRequest,
      quicksilver.interchainstaking.v1.QueryOuterClass.QueryZonesInfoResponse> getZoneInfosMethod() {
    io.grpc.MethodDescriptor<quicksilver.interchainstaking.v1.QueryOuterClass.QueryZonesInfoRequest, quicksilver.interchainstaking.v1.QueryOuterClass.QueryZonesInfoResponse> getZoneInfosMethod;
    if ((getZoneInfosMethod = QueryGrpc.getZoneInfosMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getZoneInfosMethod = QueryGrpc.getZoneInfosMethod) == null) {
          QueryGrpc.getZoneInfosMethod = getZoneInfosMethod =
              io.grpc.MethodDescriptor.<quicksilver.interchainstaking.v1.QueryOuterClass.QueryZonesInfoRequest, quicksilver.interchainstaking.v1.QueryOuterClass.QueryZonesInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ZoneInfos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.interchainstaking.v1.QueryOuterClass.QueryZonesInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.interchainstaking.v1.QueryOuterClass.QueryZonesInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ZoneInfos"))
              .build();
        }
      }
    }
    return getZoneInfosMethod;
  }

  private static volatile io.grpc.MethodDescriptor<quicksilver.interchainstaking.v1.QueryOuterClass.QueryDepositAccountForChainRequest,
      quicksilver.interchainstaking.v1.QueryOuterClass.QueryDepositAccountForChainResponse> getDepositAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DepositAccount",
      requestType = quicksilver.interchainstaking.v1.QueryOuterClass.QueryDepositAccountForChainRequest.class,
      responseType = quicksilver.interchainstaking.v1.QueryOuterClass.QueryDepositAccountForChainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<quicksilver.interchainstaking.v1.QueryOuterClass.QueryDepositAccountForChainRequest,
      quicksilver.interchainstaking.v1.QueryOuterClass.QueryDepositAccountForChainResponse> getDepositAccountMethod() {
    io.grpc.MethodDescriptor<quicksilver.interchainstaking.v1.QueryOuterClass.QueryDepositAccountForChainRequest, quicksilver.interchainstaking.v1.QueryOuterClass.QueryDepositAccountForChainResponse> getDepositAccountMethod;
    if ((getDepositAccountMethod = QueryGrpc.getDepositAccountMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDepositAccountMethod = QueryGrpc.getDepositAccountMethod) == null) {
          QueryGrpc.getDepositAccountMethod = getDepositAccountMethod =
              io.grpc.MethodDescriptor.<quicksilver.interchainstaking.v1.QueryOuterClass.QueryDepositAccountForChainRequest, quicksilver.interchainstaking.v1.QueryOuterClass.QueryDepositAccountForChainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DepositAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.interchainstaking.v1.QueryOuterClass.QueryDepositAccountForChainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.interchainstaking.v1.QueryOuterClass.QueryDepositAccountForChainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DepositAccount"))
              .build();
        }
      }
    }
    return getDepositAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegatorIntentRequest,
      quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegatorIntentResponse> getDelegatorIntentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DelegatorIntent",
      requestType = quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegatorIntentRequest.class,
      responseType = quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegatorIntentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegatorIntentRequest,
      quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegatorIntentResponse> getDelegatorIntentMethod() {
    io.grpc.MethodDescriptor<quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegatorIntentRequest, quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegatorIntentResponse> getDelegatorIntentMethod;
    if ((getDelegatorIntentMethod = QueryGrpc.getDelegatorIntentMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDelegatorIntentMethod = QueryGrpc.getDelegatorIntentMethod) == null) {
          QueryGrpc.getDelegatorIntentMethod = getDelegatorIntentMethod =
              io.grpc.MethodDescriptor.<quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegatorIntentRequest, quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegatorIntentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DelegatorIntent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegatorIntentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegatorIntentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DelegatorIntent"))
              .build();
        }
      }
    }
    return getDelegatorIntentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegationsRequest,
      quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegationsResponse> getDelegationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delegations",
      requestType = quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegationsRequest.class,
      responseType = quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegationsRequest,
      quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegationsResponse> getDelegationsMethod() {
    io.grpc.MethodDescriptor<quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegationsRequest, quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegationsResponse> getDelegationsMethod;
    if ((getDelegationsMethod = QueryGrpc.getDelegationsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDelegationsMethod = QueryGrpc.getDelegationsMethod) == null) {
          QueryGrpc.getDelegationsMethod = getDelegationsMethod =
              io.grpc.MethodDescriptor.<quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegationsRequest, quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delegations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Delegations"))
              .build();
        }
      }
    }
    return getDelegationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<quicksilver.interchainstaking.v1.QueryOuterClass.QueryReceiptsRequest,
      quicksilver.interchainstaking.v1.QueryOuterClass.QueryReceiptsResponse> getReceiptsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Receipts",
      requestType = quicksilver.interchainstaking.v1.QueryOuterClass.QueryReceiptsRequest.class,
      responseType = quicksilver.interchainstaking.v1.QueryOuterClass.QueryReceiptsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<quicksilver.interchainstaking.v1.QueryOuterClass.QueryReceiptsRequest,
      quicksilver.interchainstaking.v1.QueryOuterClass.QueryReceiptsResponse> getReceiptsMethod() {
    io.grpc.MethodDescriptor<quicksilver.interchainstaking.v1.QueryOuterClass.QueryReceiptsRequest, quicksilver.interchainstaking.v1.QueryOuterClass.QueryReceiptsResponse> getReceiptsMethod;
    if ((getReceiptsMethod = QueryGrpc.getReceiptsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getReceiptsMethod = QueryGrpc.getReceiptsMethod) == null) {
          QueryGrpc.getReceiptsMethod = getReceiptsMethod =
              io.grpc.MethodDescriptor.<quicksilver.interchainstaking.v1.QueryOuterClass.QueryReceiptsRequest, quicksilver.interchainstaking.v1.QueryOuterClass.QueryReceiptsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Receipts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.interchainstaking.v1.QueryOuterClass.QueryReceiptsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.interchainstaking.v1.QueryOuterClass.QueryReceiptsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Receipts"))
              .build();
        }
      }
    }
    return getReceiptsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsRequest,
      quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsResponse> getZoneWithdrawalRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ZoneWithdrawalRecords",
      requestType = quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsRequest.class,
      responseType = quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsRequest,
      quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsResponse> getZoneWithdrawalRecordsMethod() {
    io.grpc.MethodDescriptor<quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsRequest, quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsResponse> getZoneWithdrawalRecordsMethod;
    if ((getZoneWithdrawalRecordsMethod = QueryGrpc.getZoneWithdrawalRecordsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getZoneWithdrawalRecordsMethod = QueryGrpc.getZoneWithdrawalRecordsMethod) == null) {
          QueryGrpc.getZoneWithdrawalRecordsMethod = getZoneWithdrawalRecordsMethod =
              io.grpc.MethodDescriptor.<quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsRequest, quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ZoneWithdrawalRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ZoneWithdrawalRecords"))
              .build();
        }
      }
    }
    return getZoneWithdrawalRecordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsRequest,
      quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsResponse> getWithdrawalRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawalRecords",
      requestType = quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsRequest.class,
      responseType = quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsRequest,
      quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsResponse> getWithdrawalRecordsMethod() {
    io.grpc.MethodDescriptor<quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsRequest, quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsResponse> getWithdrawalRecordsMethod;
    if ((getWithdrawalRecordsMethod = QueryGrpc.getWithdrawalRecordsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getWithdrawalRecordsMethod = QueryGrpc.getWithdrawalRecordsMethod) == null) {
          QueryGrpc.getWithdrawalRecordsMethod = getWithdrawalRecordsMethod =
              io.grpc.MethodDescriptor.<quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsRequest, quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawalRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("WithdrawalRecords"))
              .build();
        }
      }
    }
    return getWithdrawalRecordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<quicksilver.interchainstaking.v1.QueryOuterClass.QueryUnbondingRecordsRequest,
      quicksilver.interchainstaking.v1.QueryOuterClass.QueryUnbondingRecordsResponse> getUnbondingRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnbondingRecords",
      requestType = quicksilver.interchainstaking.v1.QueryOuterClass.QueryUnbondingRecordsRequest.class,
      responseType = quicksilver.interchainstaking.v1.QueryOuterClass.QueryUnbondingRecordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<quicksilver.interchainstaking.v1.QueryOuterClass.QueryUnbondingRecordsRequest,
      quicksilver.interchainstaking.v1.QueryOuterClass.QueryUnbondingRecordsResponse> getUnbondingRecordsMethod() {
    io.grpc.MethodDescriptor<quicksilver.interchainstaking.v1.QueryOuterClass.QueryUnbondingRecordsRequest, quicksilver.interchainstaking.v1.QueryOuterClass.QueryUnbondingRecordsResponse> getUnbondingRecordsMethod;
    if ((getUnbondingRecordsMethod = QueryGrpc.getUnbondingRecordsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUnbondingRecordsMethod = QueryGrpc.getUnbondingRecordsMethod) == null) {
          QueryGrpc.getUnbondingRecordsMethod = getUnbondingRecordsMethod =
              io.grpc.MethodDescriptor.<quicksilver.interchainstaking.v1.QueryOuterClass.QueryUnbondingRecordsRequest, quicksilver.interchainstaking.v1.QueryOuterClass.QueryUnbondingRecordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnbondingRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.interchainstaking.v1.QueryOuterClass.QueryUnbondingRecordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.interchainstaking.v1.QueryOuterClass.QueryUnbondingRecordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UnbondingRecords"))
              .build();
        }
      }
    }
    return getUnbondingRecordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<quicksilver.interchainstaking.v1.QueryOuterClass.QueryRedelegationRecordsRequest,
      quicksilver.interchainstaking.v1.QueryOuterClass.QueryRedelegationRecordsResponse> getRedelegationRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RedelegationRecords",
      requestType = quicksilver.interchainstaking.v1.QueryOuterClass.QueryRedelegationRecordsRequest.class,
      responseType = quicksilver.interchainstaking.v1.QueryOuterClass.QueryRedelegationRecordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<quicksilver.interchainstaking.v1.QueryOuterClass.QueryRedelegationRecordsRequest,
      quicksilver.interchainstaking.v1.QueryOuterClass.QueryRedelegationRecordsResponse> getRedelegationRecordsMethod() {
    io.grpc.MethodDescriptor<quicksilver.interchainstaking.v1.QueryOuterClass.QueryRedelegationRecordsRequest, quicksilver.interchainstaking.v1.QueryOuterClass.QueryRedelegationRecordsResponse> getRedelegationRecordsMethod;
    if ((getRedelegationRecordsMethod = QueryGrpc.getRedelegationRecordsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRedelegationRecordsMethod = QueryGrpc.getRedelegationRecordsMethod) == null) {
          QueryGrpc.getRedelegationRecordsMethod = getRedelegationRecordsMethod =
              io.grpc.MethodDescriptor.<quicksilver.interchainstaking.v1.QueryOuterClass.QueryRedelegationRecordsRequest, quicksilver.interchainstaking.v1.QueryOuterClass.QueryRedelegationRecordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RedelegationRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.interchainstaking.v1.QueryOuterClass.QueryRedelegationRecordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.interchainstaking.v1.QueryOuterClass.QueryRedelegationRecordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RedelegationRecords"))
              .build();
        }
      }
    }
    return getRedelegationRecordsMethod;
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
     * ZoneInfos provides meta data on connected zones.
     * </pre>
     */
    public void zoneInfos(quicksilver.interchainstaking.v1.QueryOuterClass.QueryZonesInfoRequest request,
        io.grpc.stub.StreamObserver<quicksilver.interchainstaking.v1.QueryOuterClass.QueryZonesInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getZoneInfosMethod(), responseObserver);
    }

    /**
     * <pre>
     * DepositAccount provides data on the deposit address for a connected zone.
     * </pre>
     */
    public void depositAccount(quicksilver.interchainstaking.v1.QueryOuterClass.QueryDepositAccountForChainRequest request,
        io.grpc.stub.StreamObserver<quicksilver.interchainstaking.v1.QueryOuterClass.QueryDepositAccountForChainResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDepositAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * DelegatorIntent provides data on the intent of the delegator for the given
     * zone.
     * </pre>
     */
    public void delegatorIntent(quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegatorIntentRequest request,
        io.grpc.stub.StreamObserver<quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegatorIntentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDelegatorIntentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delegations provides data on the delegations for the given zone.
     * </pre>
     */
    public void delegations(quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegationsRequest request,
        io.grpc.stub.StreamObserver<quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDelegationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delegations provides data on the delegations for the given zone.
     * </pre>
     */
    public void receipts(quicksilver.interchainstaking.v1.QueryOuterClass.QueryReceiptsRequest request,
        io.grpc.stub.StreamObserver<quicksilver.interchainstaking.v1.QueryOuterClass.QueryReceiptsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReceiptsMethod(), responseObserver);
    }

    /**
     * <pre>
     * WithdrawalRecords provides data on the active withdrawals.
     * </pre>
     */
    public void zoneWithdrawalRecords(quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsRequest request,
        io.grpc.stub.StreamObserver<quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getZoneWithdrawalRecordsMethod(), responseObserver);
    }

    /**
     * <pre>
     * WithdrawalRecords provides data on the active withdrawals.
     * </pre>
     */
    public void withdrawalRecords(quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsRequest request,
        io.grpc.stub.StreamObserver<quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWithdrawalRecordsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UnbondingRecords provides data on the active unbondings.
     * </pre>
     */
    public void unbondingRecords(quicksilver.interchainstaking.v1.QueryOuterClass.QueryUnbondingRecordsRequest request,
        io.grpc.stub.StreamObserver<quicksilver.interchainstaking.v1.QueryOuterClass.QueryUnbondingRecordsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnbondingRecordsMethod(), responseObserver);
    }

    /**
     * <pre>
     * RedelegationRecords provides data on the active unbondings.
     * </pre>
     */
    public void redelegationRecords(quicksilver.interchainstaking.v1.QueryOuterClass.QueryRedelegationRecordsRequest request,
        io.grpc.stub.StreamObserver<quicksilver.interchainstaking.v1.QueryOuterClass.QueryRedelegationRecordsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRedelegationRecordsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getZoneInfosMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                quicksilver.interchainstaking.v1.QueryOuterClass.QueryZonesInfoRequest,
                quicksilver.interchainstaking.v1.QueryOuterClass.QueryZonesInfoResponse>(
                  this, METHODID_ZONE_INFOS)))
          .addMethod(
            getDepositAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                quicksilver.interchainstaking.v1.QueryOuterClass.QueryDepositAccountForChainRequest,
                quicksilver.interchainstaking.v1.QueryOuterClass.QueryDepositAccountForChainResponse>(
                  this, METHODID_DEPOSIT_ACCOUNT)))
          .addMethod(
            getDelegatorIntentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegatorIntentRequest,
                quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegatorIntentResponse>(
                  this, METHODID_DELEGATOR_INTENT)))
          .addMethod(
            getDelegationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegationsRequest,
                quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegationsResponse>(
                  this, METHODID_DELEGATIONS)))
          .addMethod(
            getReceiptsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                quicksilver.interchainstaking.v1.QueryOuterClass.QueryReceiptsRequest,
                quicksilver.interchainstaking.v1.QueryOuterClass.QueryReceiptsResponse>(
                  this, METHODID_RECEIPTS)))
          .addMethod(
            getZoneWithdrawalRecordsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsRequest,
                quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsResponse>(
                  this, METHODID_ZONE_WITHDRAWAL_RECORDS)))
          .addMethod(
            getWithdrawalRecordsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsRequest,
                quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsResponse>(
                  this, METHODID_WITHDRAWAL_RECORDS)))
          .addMethod(
            getUnbondingRecordsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                quicksilver.interchainstaking.v1.QueryOuterClass.QueryUnbondingRecordsRequest,
                quicksilver.interchainstaking.v1.QueryOuterClass.QueryUnbondingRecordsResponse>(
                  this, METHODID_UNBONDING_RECORDS)))
          .addMethod(
            getRedelegationRecordsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                quicksilver.interchainstaking.v1.QueryOuterClass.QueryRedelegationRecordsRequest,
                quicksilver.interchainstaking.v1.QueryOuterClass.QueryRedelegationRecordsResponse>(
                  this, METHODID_REDELEGATION_RECORDS)))
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
     * ZoneInfos provides meta data on connected zones.
     * </pre>
     */
    public void zoneInfos(quicksilver.interchainstaking.v1.QueryOuterClass.QueryZonesInfoRequest request,
        io.grpc.stub.StreamObserver<quicksilver.interchainstaking.v1.QueryOuterClass.QueryZonesInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getZoneInfosMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DepositAccount provides data on the deposit address for a connected zone.
     * </pre>
     */
    public void depositAccount(quicksilver.interchainstaking.v1.QueryOuterClass.QueryDepositAccountForChainRequest request,
        io.grpc.stub.StreamObserver<quicksilver.interchainstaking.v1.QueryOuterClass.QueryDepositAccountForChainResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDepositAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DelegatorIntent provides data on the intent of the delegator for the given
     * zone.
     * </pre>
     */
    public void delegatorIntent(quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegatorIntentRequest request,
        io.grpc.stub.StreamObserver<quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegatorIntentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDelegatorIntentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delegations provides data on the delegations for the given zone.
     * </pre>
     */
    public void delegations(quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegationsRequest request,
        io.grpc.stub.StreamObserver<quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDelegationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delegations provides data on the delegations for the given zone.
     * </pre>
     */
    public void receipts(quicksilver.interchainstaking.v1.QueryOuterClass.QueryReceiptsRequest request,
        io.grpc.stub.StreamObserver<quicksilver.interchainstaking.v1.QueryOuterClass.QueryReceiptsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReceiptsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WithdrawalRecords provides data on the active withdrawals.
     * </pre>
     */
    public void zoneWithdrawalRecords(quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsRequest request,
        io.grpc.stub.StreamObserver<quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getZoneWithdrawalRecordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WithdrawalRecords provides data on the active withdrawals.
     * </pre>
     */
    public void withdrawalRecords(quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsRequest request,
        io.grpc.stub.StreamObserver<quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWithdrawalRecordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UnbondingRecords provides data on the active unbondings.
     * </pre>
     */
    public void unbondingRecords(quicksilver.interchainstaking.v1.QueryOuterClass.QueryUnbondingRecordsRequest request,
        io.grpc.stub.StreamObserver<quicksilver.interchainstaking.v1.QueryOuterClass.QueryUnbondingRecordsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnbondingRecordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RedelegationRecords provides data on the active unbondings.
     * </pre>
     */
    public void redelegationRecords(quicksilver.interchainstaking.v1.QueryOuterClass.QueryRedelegationRecordsRequest request,
        io.grpc.stub.StreamObserver<quicksilver.interchainstaking.v1.QueryOuterClass.QueryRedelegationRecordsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRedelegationRecordsMethod(), getCallOptions()), request, responseObserver);
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
     * ZoneInfos provides meta data on connected zones.
     * </pre>
     */
    public quicksilver.interchainstaking.v1.QueryOuterClass.QueryZonesInfoResponse zoneInfos(quicksilver.interchainstaking.v1.QueryOuterClass.QueryZonesInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getZoneInfosMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DepositAccount provides data on the deposit address for a connected zone.
     * </pre>
     */
    public quicksilver.interchainstaking.v1.QueryOuterClass.QueryDepositAccountForChainResponse depositAccount(quicksilver.interchainstaking.v1.QueryOuterClass.QueryDepositAccountForChainRequest request) {
      return blockingUnaryCall(
          getChannel(), getDepositAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DelegatorIntent provides data on the intent of the delegator for the given
     * zone.
     * </pre>
     */
    public quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegatorIntentResponse delegatorIntent(quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegatorIntentRequest request) {
      return blockingUnaryCall(
          getChannel(), getDelegatorIntentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delegations provides data on the delegations for the given zone.
     * </pre>
     */
    public quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegationsResponse delegations(quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getDelegationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delegations provides data on the delegations for the given zone.
     * </pre>
     */
    public quicksilver.interchainstaking.v1.QueryOuterClass.QueryReceiptsResponse receipts(quicksilver.interchainstaking.v1.QueryOuterClass.QueryReceiptsRequest request) {
      return blockingUnaryCall(
          getChannel(), getReceiptsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WithdrawalRecords provides data on the active withdrawals.
     * </pre>
     */
    public quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsResponse zoneWithdrawalRecords(quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsRequest request) {
      return blockingUnaryCall(
          getChannel(), getZoneWithdrawalRecordsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WithdrawalRecords provides data on the active withdrawals.
     * </pre>
     */
    public quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsResponse withdrawalRecords(quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsRequest request) {
      return blockingUnaryCall(
          getChannel(), getWithdrawalRecordsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UnbondingRecords provides data on the active unbondings.
     * </pre>
     */
    public quicksilver.interchainstaking.v1.QueryOuterClass.QueryUnbondingRecordsResponse unbondingRecords(quicksilver.interchainstaking.v1.QueryOuterClass.QueryUnbondingRecordsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnbondingRecordsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RedelegationRecords provides data on the active unbondings.
     * </pre>
     */
    public quicksilver.interchainstaking.v1.QueryOuterClass.QueryRedelegationRecordsResponse redelegationRecords(quicksilver.interchainstaking.v1.QueryOuterClass.QueryRedelegationRecordsRequest request) {
      return blockingUnaryCall(
          getChannel(), getRedelegationRecordsMethod(), getCallOptions(), request);
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
     * ZoneInfos provides meta data on connected zones.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<quicksilver.interchainstaking.v1.QueryOuterClass.QueryZonesInfoResponse> zoneInfos(
        quicksilver.interchainstaking.v1.QueryOuterClass.QueryZonesInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getZoneInfosMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DepositAccount provides data on the deposit address for a connected zone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<quicksilver.interchainstaking.v1.QueryOuterClass.QueryDepositAccountForChainResponse> depositAccount(
        quicksilver.interchainstaking.v1.QueryOuterClass.QueryDepositAccountForChainRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDepositAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DelegatorIntent provides data on the intent of the delegator for the given
     * zone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegatorIntentResponse> delegatorIntent(
        quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegatorIntentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDelegatorIntentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delegations provides data on the delegations for the given zone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegationsResponse> delegations(
        quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDelegationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delegations provides data on the delegations for the given zone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<quicksilver.interchainstaking.v1.QueryOuterClass.QueryReceiptsResponse> receipts(
        quicksilver.interchainstaking.v1.QueryOuterClass.QueryReceiptsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReceiptsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WithdrawalRecords provides data on the active withdrawals.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsResponse> zoneWithdrawalRecords(
        quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getZoneWithdrawalRecordsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WithdrawalRecords provides data on the active withdrawals.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsResponse> withdrawalRecords(
        quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWithdrawalRecordsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UnbondingRecords provides data on the active unbondings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<quicksilver.interchainstaking.v1.QueryOuterClass.QueryUnbondingRecordsResponse> unbondingRecords(
        quicksilver.interchainstaking.v1.QueryOuterClass.QueryUnbondingRecordsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnbondingRecordsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RedelegationRecords provides data on the active unbondings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<quicksilver.interchainstaking.v1.QueryOuterClass.QueryRedelegationRecordsResponse> redelegationRecords(
        quicksilver.interchainstaking.v1.QueryOuterClass.QueryRedelegationRecordsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRedelegationRecordsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ZONE_INFOS = 0;
  private static final int METHODID_DEPOSIT_ACCOUNT = 1;
  private static final int METHODID_DELEGATOR_INTENT = 2;
  private static final int METHODID_DELEGATIONS = 3;
  private static final int METHODID_RECEIPTS = 4;
  private static final int METHODID_ZONE_WITHDRAWAL_RECORDS = 5;
  private static final int METHODID_WITHDRAWAL_RECORDS = 6;
  private static final int METHODID_UNBONDING_RECORDS = 7;
  private static final int METHODID_REDELEGATION_RECORDS = 8;

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
        case METHODID_ZONE_INFOS:
          serviceImpl.zoneInfos((quicksilver.interchainstaking.v1.QueryOuterClass.QueryZonesInfoRequest) request,
              (io.grpc.stub.StreamObserver<quicksilver.interchainstaking.v1.QueryOuterClass.QueryZonesInfoResponse>) responseObserver);
          break;
        case METHODID_DEPOSIT_ACCOUNT:
          serviceImpl.depositAccount((quicksilver.interchainstaking.v1.QueryOuterClass.QueryDepositAccountForChainRequest) request,
              (io.grpc.stub.StreamObserver<quicksilver.interchainstaking.v1.QueryOuterClass.QueryDepositAccountForChainResponse>) responseObserver);
          break;
        case METHODID_DELEGATOR_INTENT:
          serviceImpl.delegatorIntent((quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegatorIntentRequest) request,
              (io.grpc.stub.StreamObserver<quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegatorIntentResponse>) responseObserver);
          break;
        case METHODID_DELEGATIONS:
          serviceImpl.delegations((quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegationsRequest) request,
              (io.grpc.stub.StreamObserver<quicksilver.interchainstaking.v1.QueryOuterClass.QueryDelegationsResponse>) responseObserver);
          break;
        case METHODID_RECEIPTS:
          serviceImpl.receipts((quicksilver.interchainstaking.v1.QueryOuterClass.QueryReceiptsRequest) request,
              (io.grpc.stub.StreamObserver<quicksilver.interchainstaking.v1.QueryOuterClass.QueryReceiptsResponse>) responseObserver);
          break;
        case METHODID_ZONE_WITHDRAWAL_RECORDS:
          serviceImpl.zoneWithdrawalRecords((quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsRequest) request,
              (io.grpc.stub.StreamObserver<quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsResponse>) responseObserver);
          break;
        case METHODID_WITHDRAWAL_RECORDS:
          serviceImpl.withdrawalRecords((quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsRequest) request,
              (io.grpc.stub.StreamObserver<quicksilver.interchainstaking.v1.QueryOuterClass.QueryWithdrawalRecordsResponse>) responseObserver);
          break;
        case METHODID_UNBONDING_RECORDS:
          serviceImpl.unbondingRecords((quicksilver.interchainstaking.v1.QueryOuterClass.QueryUnbondingRecordsRequest) request,
              (io.grpc.stub.StreamObserver<quicksilver.interchainstaking.v1.QueryOuterClass.QueryUnbondingRecordsResponse>) responseObserver);
          break;
        case METHODID_REDELEGATION_RECORDS:
          serviceImpl.redelegationRecords((quicksilver.interchainstaking.v1.QueryOuterClass.QueryRedelegationRecordsRequest) request,
              (io.grpc.stub.StreamObserver<quicksilver.interchainstaking.v1.QueryOuterClass.QueryRedelegationRecordsResponse>) responseObserver);
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
      return quicksilver.interchainstaking.v1.QueryOuterClass.getDescriptor();
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
              .addMethod(getZoneInfosMethod())
              .addMethod(getDepositAccountMethod())
              .addMethod(getDelegatorIntentMethod())
              .addMethod(getDelegationsMethod())
              .addMethod(getReceiptsMethod())
              .addMethod(getZoneWithdrawalRecordsMethod())
              .addMethod(getWithdrawalRecordsMethod())
              .addMethod(getUnbondingRecordsMethod())
              .addMethod(getRedelegationRecordsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
