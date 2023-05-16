package stafihub.stafihub.bridge;

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
    comments = "Source: stafihub/bridge/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "stafihub.stafihub.bridge.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.bridge.QueryOuterClass.QueryParamsRequest,
      stafihub.stafihub.bridge.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = stafihub.stafihub.bridge.QueryOuterClass.QueryParamsRequest.class,
      responseType = stafihub.stafihub.bridge.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.bridge.QueryOuterClass.QueryParamsRequest,
      stafihub.stafihub.bridge.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.bridge.QueryOuterClass.QueryParamsRequest, stafihub.stafihub.bridge.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.bridge.QueryOuterClass.QueryParamsRequest, stafihub.stafihub.bridge.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.bridge.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.bridge.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.bridge.QueryOuterClass.QueryChaindIdsRequest,
      stafihub.stafihub.bridge.QueryOuterClass.QueryChaindIdsResponse> getChaindIdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChaindIds",
      requestType = stafihub.stafihub.bridge.QueryOuterClass.QueryChaindIdsRequest.class,
      responseType = stafihub.stafihub.bridge.QueryOuterClass.QueryChaindIdsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.bridge.QueryOuterClass.QueryChaindIdsRequest,
      stafihub.stafihub.bridge.QueryOuterClass.QueryChaindIdsResponse> getChaindIdsMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.bridge.QueryOuterClass.QueryChaindIdsRequest, stafihub.stafihub.bridge.QueryOuterClass.QueryChaindIdsResponse> getChaindIdsMethod;
    if ((getChaindIdsMethod = QueryGrpc.getChaindIdsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getChaindIdsMethod = QueryGrpc.getChaindIdsMethod) == null) {
          QueryGrpc.getChaindIdsMethod = getChaindIdsMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.bridge.QueryOuterClass.QueryChaindIdsRequest, stafihub.stafihub.bridge.QueryOuterClass.QueryChaindIdsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChaindIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.bridge.QueryOuterClass.QueryChaindIdsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.bridge.QueryOuterClass.QueryChaindIdsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ChaindIds"))
              .build();
        }
      }
    }
    return getChaindIdsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.bridge.QueryOuterClass.QueryProposalDetailRequest,
      stafihub.stafihub.bridge.QueryOuterClass.QueryProposalDetailResponse> getProposalDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProposalDetail",
      requestType = stafihub.stafihub.bridge.QueryOuterClass.QueryProposalDetailRequest.class,
      responseType = stafihub.stafihub.bridge.QueryOuterClass.QueryProposalDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.bridge.QueryOuterClass.QueryProposalDetailRequest,
      stafihub.stafihub.bridge.QueryOuterClass.QueryProposalDetailResponse> getProposalDetailMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.bridge.QueryOuterClass.QueryProposalDetailRequest, stafihub.stafihub.bridge.QueryOuterClass.QueryProposalDetailResponse> getProposalDetailMethod;
    if ((getProposalDetailMethod = QueryGrpc.getProposalDetailMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getProposalDetailMethod = QueryGrpc.getProposalDetailMethod) == null) {
          QueryGrpc.getProposalDetailMethod = getProposalDetailMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.bridge.QueryOuterClass.QueryProposalDetailRequest, stafihub.stafihub.bridge.QueryOuterClass.QueryProposalDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProposalDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.bridge.QueryOuterClass.QueryProposalDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.bridge.QueryOuterClass.QueryProposalDetailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ProposalDetail"))
              .build();
        }
      }
    }
    return getProposalDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.bridge.QueryOuterClass.QueryResourceidToDenomsRequest,
      stafihub.stafihub.bridge.QueryOuterClass.QueryResourceidToDenomsResponse> getResourceidToDenomsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResourceidToDenoms",
      requestType = stafihub.stafihub.bridge.QueryOuterClass.QueryResourceidToDenomsRequest.class,
      responseType = stafihub.stafihub.bridge.QueryOuterClass.QueryResourceidToDenomsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.bridge.QueryOuterClass.QueryResourceidToDenomsRequest,
      stafihub.stafihub.bridge.QueryOuterClass.QueryResourceidToDenomsResponse> getResourceidToDenomsMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.bridge.QueryOuterClass.QueryResourceidToDenomsRequest, stafihub.stafihub.bridge.QueryOuterClass.QueryResourceidToDenomsResponse> getResourceidToDenomsMethod;
    if ((getResourceidToDenomsMethod = QueryGrpc.getResourceidToDenomsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getResourceidToDenomsMethod = QueryGrpc.getResourceidToDenomsMethod) == null) {
          QueryGrpc.getResourceidToDenomsMethod = getResourceidToDenomsMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.bridge.QueryOuterClass.QueryResourceidToDenomsRequest, stafihub.stafihub.bridge.QueryOuterClass.QueryResourceidToDenomsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResourceidToDenoms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.bridge.QueryOuterClass.QueryResourceidToDenomsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.bridge.QueryOuterClass.QueryResourceidToDenomsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ResourceidToDenoms"))
              .build();
        }
      }
    }
    return getResourceidToDenomsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeReceiverRequest,
      stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeReceiverResponse> getRelayFeeReceiverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RelayFeeReceiver",
      requestType = stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeReceiverRequest.class,
      responseType = stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeReceiverResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeReceiverRequest,
      stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeReceiverResponse> getRelayFeeReceiverMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeReceiverRequest, stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeReceiverResponse> getRelayFeeReceiverMethod;
    if ((getRelayFeeReceiverMethod = QueryGrpc.getRelayFeeReceiverMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRelayFeeReceiverMethod = QueryGrpc.getRelayFeeReceiverMethod) == null) {
          QueryGrpc.getRelayFeeReceiverMethod = getRelayFeeReceiverMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeReceiverRequest, stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeReceiverResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RelayFeeReceiver"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeReceiverRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeReceiverResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RelayFeeReceiver"))
              .build();
        }
      }
    }
    return getRelayFeeReceiverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeRequest,
      stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeResponse> getRelayFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RelayFee",
      requestType = stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeRequest.class,
      responseType = stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeRequest,
      stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeResponse> getRelayFeeMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeRequest, stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeResponse> getRelayFeeMethod;
    if ((getRelayFeeMethod = QueryGrpc.getRelayFeeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRelayFeeMethod = QueryGrpc.getRelayFeeMethod) == null) {
          QueryGrpc.getRelayFeeMethod = getRelayFeeMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeRequest, stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RelayFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RelayFee"))
              .build();
        }
      }
    }
    return getRelayFeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.bridge.QueryOuterClass.QueryBannedDenomListRequest,
      stafihub.stafihub.bridge.QueryOuterClass.QueryBannedDenomListResponse> getBannedDenomListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BannedDenomList",
      requestType = stafihub.stafihub.bridge.QueryOuterClass.QueryBannedDenomListRequest.class,
      responseType = stafihub.stafihub.bridge.QueryOuterClass.QueryBannedDenomListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.bridge.QueryOuterClass.QueryBannedDenomListRequest,
      stafihub.stafihub.bridge.QueryOuterClass.QueryBannedDenomListResponse> getBannedDenomListMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.bridge.QueryOuterClass.QueryBannedDenomListRequest, stafihub.stafihub.bridge.QueryOuterClass.QueryBannedDenomListResponse> getBannedDenomListMethod;
    if ((getBannedDenomListMethod = QueryGrpc.getBannedDenomListMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBannedDenomListMethod = QueryGrpc.getBannedDenomListMethod) == null) {
          QueryGrpc.getBannedDenomListMethod = getBannedDenomListMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.bridge.QueryOuterClass.QueryBannedDenomListRequest, stafihub.stafihub.bridge.QueryOuterClass.QueryBannedDenomListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BannedDenomList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.bridge.QueryOuterClass.QueryBannedDenomListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.bridge.QueryOuterClass.QueryBannedDenomListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BannedDenomList"))
              .build();
        }
      }
    }
    return getBannedDenomListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.bridge.QueryOuterClass.QueryGetDepositCountRequest,
      stafihub.stafihub.bridge.QueryOuterClass.QueryGetDepositCountResponse> getGetDepositCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDepositCount",
      requestType = stafihub.stafihub.bridge.QueryOuterClass.QueryGetDepositCountRequest.class,
      responseType = stafihub.stafihub.bridge.QueryOuterClass.QueryGetDepositCountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.bridge.QueryOuterClass.QueryGetDepositCountRequest,
      stafihub.stafihub.bridge.QueryOuterClass.QueryGetDepositCountResponse> getGetDepositCountMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.bridge.QueryOuterClass.QueryGetDepositCountRequest, stafihub.stafihub.bridge.QueryOuterClass.QueryGetDepositCountResponse> getGetDepositCountMethod;
    if ((getGetDepositCountMethod = QueryGrpc.getGetDepositCountMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetDepositCountMethod = QueryGrpc.getGetDepositCountMethod) == null) {
          QueryGrpc.getGetDepositCountMethod = getGetDepositCountMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.bridge.QueryOuterClass.QueryGetDepositCountRequest, stafihub.stafihub.bridge.QueryOuterClass.QueryGetDepositCountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDepositCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.bridge.QueryOuterClass.QueryGetDepositCountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.bridge.QueryOuterClass.QueryGetDepositCountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetDepositCount"))
              .build();
        }
      }
    }
    return getGetDepositCountMethod;
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
    public void params(stafihub.stafihub.bridge.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.bridge.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ChaindIds items.
     * </pre>
     */
    public void chaindIds(stafihub.stafihub.bridge.QueryOuterClass.QueryChaindIdsRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.bridge.QueryOuterClass.QueryChaindIdsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChaindIdsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ProposalDetail items.
     * </pre>
     */
    public void proposalDetail(stafihub.stafihub.bridge.QueryOuterClass.QueryProposalDetailRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.bridge.QueryOuterClass.QueryProposalDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getProposalDetailMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ResourceidToDenoms items.
     * </pre>
     */
    public void resourceidToDenoms(stafihub.stafihub.bridge.QueryOuterClass.QueryResourceidToDenomsRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.bridge.QueryOuterClass.QueryResourceidToDenomsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getResourceidToDenomsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of RelayFeeReceiver items.
     * </pre>
     */
    public void relayFeeReceiver(stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeReceiverRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeReceiverResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRelayFeeReceiverMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of RelayFee items.
     * </pre>
     */
    public void relayFee(stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRelayFeeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of BannedDenomList items.
     * </pre>
     */
    public void bannedDenomList(stafihub.stafihub.bridge.QueryOuterClass.QueryBannedDenomListRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.bridge.QueryOuterClass.QueryBannedDenomListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBannedDenomListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of GetDepositCount items.
     * </pre>
     */
    public void getDepositCount(stafihub.stafihub.bridge.QueryOuterClass.QueryGetDepositCountRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.bridge.QueryOuterClass.QueryGetDepositCountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDepositCountMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.bridge.QueryOuterClass.QueryParamsRequest,
                stafihub.stafihub.bridge.QueryOuterClass.QueryParamsResponse>(
                  this, METHODID_PARAMS)))
          .addMethod(
            getChaindIdsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.bridge.QueryOuterClass.QueryChaindIdsRequest,
                stafihub.stafihub.bridge.QueryOuterClass.QueryChaindIdsResponse>(
                  this, METHODID_CHAIND_IDS)))
          .addMethod(
            getProposalDetailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.bridge.QueryOuterClass.QueryProposalDetailRequest,
                stafihub.stafihub.bridge.QueryOuterClass.QueryProposalDetailResponse>(
                  this, METHODID_PROPOSAL_DETAIL)))
          .addMethod(
            getResourceidToDenomsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.bridge.QueryOuterClass.QueryResourceidToDenomsRequest,
                stafihub.stafihub.bridge.QueryOuterClass.QueryResourceidToDenomsResponse>(
                  this, METHODID_RESOURCEID_TO_DENOMS)))
          .addMethod(
            getRelayFeeReceiverMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeReceiverRequest,
                stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeReceiverResponse>(
                  this, METHODID_RELAY_FEE_RECEIVER)))
          .addMethod(
            getRelayFeeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeRequest,
                stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeResponse>(
                  this, METHODID_RELAY_FEE)))
          .addMethod(
            getBannedDenomListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.bridge.QueryOuterClass.QueryBannedDenomListRequest,
                stafihub.stafihub.bridge.QueryOuterClass.QueryBannedDenomListResponse>(
                  this, METHODID_BANNED_DENOM_LIST)))
          .addMethod(
            getGetDepositCountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.bridge.QueryOuterClass.QueryGetDepositCountRequest,
                stafihub.stafihub.bridge.QueryOuterClass.QueryGetDepositCountResponse>(
                  this, METHODID_GET_DEPOSIT_COUNT)))
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
    public void params(stafihub.stafihub.bridge.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.bridge.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ChaindIds items.
     * </pre>
     */
    public void chaindIds(stafihub.stafihub.bridge.QueryOuterClass.QueryChaindIdsRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.bridge.QueryOuterClass.QueryChaindIdsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChaindIdsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ProposalDetail items.
     * </pre>
     */
    public void proposalDetail(stafihub.stafihub.bridge.QueryOuterClass.QueryProposalDetailRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.bridge.QueryOuterClass.QueryProposalDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProposalDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ResourceidToDenoms items.
     * </pre>
     */
    public void resourceidToDenoms(stafihub.stafihub.bridge.QueryOuterClass.QueryResourceidToDenomsRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.bridge.QueryOuterClass.QueryResourceidToDenomsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getResourceidToDenomsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of RelayFeeReceiver items.
     * </pre>
     */
    public void relayFeeReceiver(stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeReceiverRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeReceiverResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRelayFeeReceiverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of RelayFee items.
     * </pre>
     */
    public void relayFee(stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRelayFeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of BannedDenomList items.
     * </pre>
     */
    public void bannedDenomList(stafihub.stafihub.bridge.QueryOuterClass.QueryBannedDenomListRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.bridge.QueryOuterClass.QueryBannedDenomListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBannedDenomListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of GetDepositCount items.
     * </pre>
     */
    public void getDepositCount(stafihub.stafihub.bridge.QueryOuterClass.QueryGetDepositCountRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.bridge.QueryOuterClass.QueryGetDepositCountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDepositCountMethod(), getCallOptions()), request, responseObserver);
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
    public stafihub.stafihub.bridge.QueryOuterClass.QueryParamsResponse params(stafihub.stafihub.bridge.QueryOuterClass.QueryParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of ChaindIds items.
     * </pre>
     */
    public stafihub.stafihub.bridge.QueryOuterClass.QueryChaindIdsResponse chaindIds(stafihub.stafihub.bridge.QueryOuterClass.QueryChaindIdsRequest request) {
      return blockingUnaryCall(
          getChannel(), getChaindIdsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of ProposalDetail items.
     * </pre>
     */
    public stafihub.stafihub.bridge.QueryOuterClass.QueryProposalDetailResponse proposalDetail(stafihub.stafihub.bridge.QueryOuterClass.QueryProposalDetailRequest request) {
      return blockingUnaryCall(
          getChannel(), getProposalDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of ResourceidToDenoms items.
     * </pre>
     */
    public stafihub.stafihub.bridge.QueryOuterClass.QueryResourceidToDenomsResponse resourceidToDenoms(stafihub.stafihub.bridge.QueryOuterClass.QueryResourceidToDenomsRequest request) {
      return blockingUnaryCall(
          getChannel(), getResourceidToDenomsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of RelayFeeReceiver items.
     * </pre>
     */
    public stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeReceiverResponse relayFeeReceiver(stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeReceiverRequest request) {
      return blockingUnaryCall(
          getChannel(), getRelayFeeReceiverMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of RelayFee items.
     * </pre>
     */
    public stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeResponse relayFee(stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeRequest request) {
      return blockingUnaryCall(
          getChannel(), getRelayFeeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of BannedDenomList items.
     * </pre>
     */
    public stafihub.stafihub.bridge.QueryOuterClass.QueryBannedDenomListResponse bannedDenomList(stafihub.stafihub.bridge.QueryOuterClass.QueryBannedDenomListRequest request) {
      return blockingUnaryCall(
          getChannel(), getBannedDenomListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of GetDepositCount items.
     * </pre>
     */
    public stafihub.stafihub.bridge.QueryOuterClass.QueryGetDepositCountResponse getDepositCount(stafihub.stafihub.bridge.QueryOuterClass.QueryGetDepositCountRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDepositCountMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.bridge.QueryOuterClass.QueryParamsResponse> params(
        stafihub.stafihub.bridge.QueryOuterClass.QueryParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of ChaindIds items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.bridge.QueryOuterClass.QueryChaindIdsResponse> chaindIds(
        stafihub.stafihub.bridge.QueryOuterClass.QueryChaindIdsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChaindIdsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of ProposalDetail items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.bridge.QueryOuterClass.QueryProposalDetailResponse> proposalDetail(
        stafihub.stafihub.bridge.QueryOuterClass.QueryProposalDetailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getProposalDetailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of ResourceidToDenoms items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.bridge.QueryOuterClass.QueryResourceidToDenomsResponse> resourceidToDenoms(
        stafihub.stafihub.bridge.QueryOuterClass.QueryResourceidToDenomsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getResourceidToDenomsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of RelayFeeReceiver items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeReceiverResponse> relayFeeReceiver(
        stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeReceiverRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRelayFeeReceiverMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of RelayFee items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeResponse> relayFee(
        stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRelayFeeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of BannedDenomList items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.bridge.QueryOuterClass.QueryBannedDenomListResponse> bannedDenomList(
        stafihub.stafihub.bridge.QueryOuterClass.QueryBannedDenomListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBannedDenomListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of GetDepositCount items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.bridge.QueryOuterClass.QueryGetDepositCountResponse> getDepositCount(
        stafihub.stafihub.bridge.QueryOuterClass.QueryGetDepositCountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDepositCountMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_CHAIND_IDS = 1;
  private static final int METHODID_PROPOSAL_DETAIL = 2;
  private static final int METHODID_RESOURCEID_TO_DENOMS = 3;
  private static final int METHODID_RELAY_FEE_RECEIVER = 4;
  private static final int METHODID_RELAY_FEE = 5;
  private static final int METHODID_BANNED_DENOM_LIST = 6;
  private static final int METHODID_GET_DEPOSIT_COUNT = 7;

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
          serviceImpl.params((stafihub.stafihub.bridge.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.bridge.QueryOuterClass.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_CHAIND_IDS:
          serviceImpl.chaindIds((stafihub.stafihub.bridge.QueryOuterClass.QueryChaindIdsRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.bridge.QueryOuterClass.QueryChaindIdsResponse>) responseObserver);
          break;
        case METHODID_PROPOSAL_DETAIL:
          serviceImpl.proposalDetail((stafihub.stafihub.bridge.QueryOuterClass.QueryProposalDetailRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.bridge.QueryOuterClass.QueryProposalDetailResponse>) responseObserver);
          break;
        case METHODID_RESOURCEID_TO_DENOMS:
          serviceImpl.resourceidToDenoms((stafihub.stafihub.bridge.QueryOuterClass.QueryResourceidToDenomsRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.bridge.QueryOuterClass.QueryResourceidToDenomsResponse>) responseObserver);
          break;
        case METHODID_RELAY_FEE_RECEIVER:
          serviceImpl.relayFeeReceiver((stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeReceiverRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeReceiverResponse>) responseObserver);
          break;
        case METHODID_RELAY_FEE:
          serviceImpl.relayFee((stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.bridge.QueryOuterClass.QueryRelayFeeResponse>) responseObserver);
          break;
        case METHODID_BANNED_DENOM_LIST:
          serviceImpl.bannedDenomList((stafihub.stafihub.bridge.QueryOuterClass.QueryBannedDenomListRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.bridge.QueryOuterClass.QueryBannedDenomListResponse>) responseObserver);
          break;
        case METHODID_GET_DEPOSIT_COUNT:
          serviceImpl.getDepositCount((stafihub.stafihub.bridge.QueryOuterClass.QueryGetDepositCountRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.bridge.QueryOuterClass.QueryGetDepositCountResponse>) responseObserver);
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
      return stafihub.stafihub.bridge.QueryOuterClass.getDescriptor();
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
              .addMethod(getChaindIdsMethod())
              .addMethod(getProposalDetailMethod())
              .addMethod(getResourceidToDenomsMethod())
              .addMethod(getRelayFeeReceiverMethod())
              .addMethod(getRelayFeeMethod())
              .addMethod(getBannedDenomListMethod())
              .addMethod(getGetDepositCountMethod())
              .build();
        }
      }
    }
    return result;
  }
}
