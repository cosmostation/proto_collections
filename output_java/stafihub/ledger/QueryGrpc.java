package stafihub.ledger;

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
    comments = "Source: stafihub/ledger/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "stafihub.stafihub.ledger.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetExchangeRateRequest,
      stafihub.ledger.QueryOuterClass.QueryGetExchangeRateResponse> getGetExchangeRateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetExchangeRate",
      requestType = stafihub.ledger.QueryOuterClass.QueryGetExchangeRateRequest.class,
      responseType = stafihub.ledger.QueryOuterClass.QueryGetExchangeRateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetExchangeRateRequest,
      stafihub.ledger.QueryOuterClass.QueryGetExchangeRateResponse> getGetExchangeRateMethod() {
    io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetExchangeRateRequest, stafihub.ledger.QueryOuterClass.QueryGetExchangeRateResponse> getGetExchangeRateMethod;
    if ((getGetExchangeRateMethod = QueryGrpc.getGetExchangeRateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetExchangeRateMethod = QueryGrpc.getGetExchangeRateMethod) == null) {
          QueryGrpc.getGetExchangeRateMethod = getGetExchangeRateMethod =
              io.grpc.MethodDescriptor.<stafihub.ledger.QueryOuterClass.QueryGetExchangeRateRequest, stafihub.ledger.QueryOuterClass.QueryGetExchangeRateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetExchangeRate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryGetExchangeRateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryGetExchangeRateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetExchangeRate"))
              .build();
        }
      }
    }
    return getGetExchangeRateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryExchangeRateAllRequest,
      stafihub.ledger.QueryOuterClass.QueryExchangeRateAllResponse> getExchangeRateAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExchangeRateAll",
      requestType = stafihub.ledger.QueryOuterClass.QueryExchangeRateAllRequest.class,
      responseType = stafihub.ledger.QueryOuterClass.QueryExchangeRateAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryExchangeRateAllRequest,
      stafihub.ledger.QueryOuterClass.QueryExchangeRateAllResponse> getExchangeRateAllMethod() {
    io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryExchangeRateAllRequest, stafihub.ledger.QueryOuterClass.QueryExchangeRateAllResponse> getExchangeRateAllMethod;
    if ((getExchangeRateAllMethod = QueryGrpc.getExchangeRateAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getExchangeRateAllMethod = QueryGrpc.getExchangeRateAllMethod) == null) {
          QueryGrpc.getExchangeRateAllMethod = getExchangeRateAllMethod =
              io.grpc.MethodDescriptor.<stafihub.ledger.QueryOuterClass.QueryExchangeRateAllRequest, stafihub.ledger.QueryOuterClass.QueryExchangeRateAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExchangeRateAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryExchangeRateAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryExchangeRateAllResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ExchangeRateAll"))
              .build();
        }
      }
    }
    return getExchangeRateAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetEraExchangeRateRequest,
      stafihub.ledger.QueryOuterClass.QueryGetEraExchangeRateResponse> getGetEraExchangeRateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEraExchangeRate",
      requestType = stafihub.ledger.QueryOuterClass.QueryGetEraExchangeRateRequest.class,
      responseType = stafihub.ledger.QueryOuterClass.QueryGetEraExchangeRateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetEraExchangeRateRequest,
      stafihub.ledger.QueryOuterClass.QueryGetEraExchangeRateResponse> getGetEraExchangeRateMethod() {
    io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetEraExchangeRateRequest, stafihub.ledger.QueryOuterClass.QueryGetEraExchangeRateResponse> getGetEraExchangeRateMethod;
    if ((getGetEraExchangeRateMethod = QueryGrpc.getGetEraExchangeRateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetEraExchangeRateMethod = QueryGrpc.getGetEraExchangeRateMethod) == null) {
          QueryGrpc.getGetEraExchangeRateMethod = getGetEraExchangeRateMethod =
              io.grpc.MethodDescriptor.<stafihub.ledger.QueryOuterClass.QueryGetEraExchangeRateRequest, stafihub.ledger.QueryOuterClass.QueryGetEraExchangeRateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEraExchangeRate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryGetEraExchangeRateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryGetEraExchangeRateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetEraExchangeRate"))
              .build();
        }
      }
    }
    return getGetEraExchangeRateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryEraExchangeRatesByDenomRequest,
      stafihub.ledger.QueryOuterClass.QueryEraExchangeRatesByDenomResponse> getEraExchangeRatesByDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EraExchangeRatesByDenom",
      requestType = stafihub.ledger.QueryOuterClass.QueryEraExchangeRatesByDenomRequest.class,
      responseType = stafihub.ledger.QueryOuterClass.QueryEraExchangeRatesByDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryEraExchangeRatesByDenomRequest,
      stafihub.ledger.QueryOuterClass.QueryEraExchangeRatesByDenomResponse> getEraExchangeRatesByDenomMethod() {
    io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryEraExchangeRatesByDenomRequest, stafihub.ledger.QueryOuterClass.QueryEraExchangeRatesByDenomResponse> getEraExchangeRatesByDenomMethod;
    if ((getEraExchangeRatesByDenomMethod = QueryGrpc.getEraExchangeRatesByDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getEraExchangeRatesByDenomMethod = QueryGrpc.getEraExchangeRatesByDenomMethod) == null) {
          QueryGrpc.getEraExchangeRatesByDenomMethod = getEraExchangeRatesByDenomMethod =
              io.grpc.MethodDescriptor.<stafihub.ledger.QueryOuterClass.QueryEraExchangeRatesByDenomRequest, stafihub.ledger.QueryOuterClass.QueryEraExchangeRatesByDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EraExchangeRatesByDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryEraExchangeRatesByDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryEraExchangeRatesByDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("EraExchangeRatesByDenom"))
              .build();
        }
      }
    }
    return getEraExchangeRatesByDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryBondedPoolsByDenomRequest,
      stafihub.ledger.QueryOuterClass.QueryBondedPoolsByDenomResponse> getBondedPoolsByDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BondedPoolsByDenom",
      requestType = stafihub.ledger.QueryOuterClass.QueryBondedPoolsByDenomRequest.class,
      responseType = stafihub.ledger.QueryOuterClass.QueryBondedPoolsByDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryBondedPoolsByDenomRequest,
      stafihub.ledger.QueryOuterClass.QueryBondedPoolsByDenomResponse> getBondedPoolsByDenomMethod() {
    io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryBondedPoolsByDenomRequest, stafihub.ledger.QueryOuterClass.QueryBondedPoolsByDenomResponse> getBondedPoolsByDenomMethod;
    if ((getBondedPoolsByDenomMethod = QueryGrpc.getBondedPoolsByDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBondedPoolsByDenomMethod = QueryGrpc.getBondedPoolsByDenomMethod) == null) {
          QueryGrpc.getBondedPoolsByDenomMethod = getBondedPoolsByDenomMethod =
              io.grpc.MethodDescriptor.<stafihub.ledger.QueryOuterClass.QueryBondedPoolsByDenomRequest, stafihub.ledger.QueryOuterClass.QueryBondedPoolsByDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BondedPoolsByDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryBondedPoolsByDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryBondedPoolsByDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BondedPoolsByDenom"))
              .build();
        }
      }
    }
    return getBondedPoolsByDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetPoolDetailRequest,
      stafihub.ledger.QueryOuterClass.QueryGetPoolDetailResponse> getGetPoolDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPoolDetail",
      requestType = stafihub.ledger.QueryOuterClass.QueryGetPoolDetailRequest.class,
      responseType = stafihub.ledger.QueryOuterClass.QueryGetPoolDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetPoolDetailRequest,
      stafihub.ledger.QueryOuterClass.QueryGetPoolDetailResponse> getGetPoolDetailMethod() {
    io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetPoolDetailRequest, stafihub.ledger.QueryOuterClass.QueryGetPoolDetailResponse> getGetPoolDetailMethod;
    if ((getGetPoolDetailMethod = QueryGrpc.getGetPoolDetailMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetPoolDetailMethod = QueryGrpc.getGetPoolDetailMethod) == null) {
          QueryGrpc.getGetPoolDetailMethod = getGetPoolDetailMethod =
              io.grpc.MethodDescriptor.<stafihub.ledger.QueryOuterClass.QueryGetPoolDetailRequest, stafihub.ledger.QueryOuterClass.QueryGetPoolDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPoolDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryGetPoolDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryGetPoolDetailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetPoolDetail"))
              .build();
        }
      }
    }
    return getGetPoolDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetChainEraRequest,
      stafihub.ledger.QueryOuterClass.QueryGetChainEraResponse> getGetChainEraMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetChainEra",
      requestType = stafihub.ledger.QueryOuterClass.QueryGetChainEraRequest.class,
      responseType = stafihub.ledger.QueryOuterClass.QueryGetChainEraResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetChainEraRequest,
      stafihub.ledger.QueryOuterClass.QueryGetChainEraResponse> getGetChainEraMethod() {
    io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetChainEraRequest, stafihub.ledger.QueryOuterClass.QueryGetChainEraResponse> getGetChainEraMethod;
    if ((getGetChainEraMethod = QueryGrpc.getGetChainEraMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetChainEraMethod = QueryGrpc.getGetChainEraMethod) == null) {
          QueryGrpc.getGetChainEraMethod = getGetChainEraMethod =
              io.grpc.MethodDescriptor.<stafihub.ledger.QueryOuterClass.QueryGetChainEraRequest, stafihub.ledger.QueryOuterClass.QueryGetChainEraResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetChainEra"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryGetChainEraRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryGetChainEraResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetChainEra"))
              .build();
        }
      }
    }
    return getGetChainEraMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetCurrentEraSnapshotRequest,
      stafihub.ledger.QueryOuterClass.QueryGetCurrentEraSnapshotResponse> getGetCurrentEraSnapshotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCurrentEraSnapshot",
      requestType = stafihub.ledger.QueryOuterClass.QueryGetCurrentEraSnapshotRequest.class,
      responseType = stafihub.ledger.QueryOuterClass.QueryGetCurrentEraSnapshotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetCurrentEraSnapshotRequest,
      stafihub.ledger.QueryOuterClass.QueryGetCurrentEraSnapshotResponse> getGetCurrentEraSnapshotMethod() {
    io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetCurrentEraSnapshotRequest, stafihub.ledger.QueryOuterClass.QueryGetCurrentEraSnapshotResponse> getGetCurrentEraSnapshotMethod;
    if ((getGetCurrentEraSnapshotMethod = QueryGrpc.getGetCurrentEraSnapshotMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetCurrentEraSnapshotMethod = QueryGrpc.getGetCurrentEraSnapshotMethod) == null) {
          QueryGrpc.getGetCurrentEraSnapshotMethod = getGetCurrentEraSnapshotMethod =
              io.grpc.MethodDescriptor.<stafihub.ledger.QueryOuterClass.QueryGetCurrentEraSnapshotRequest, stafihub.ledger.QueryOuterClass.QueryGetCurrentEraSnapshotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCurrentEraSnapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryGetCurrentEraSnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryGetCurrentEraSnapshotResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetCurrentEraSnapshot"))
              .build();
        }
      }
    }
    return getGetCurrentEraSnapshotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetProtocolFeeReceiverRequest,
      stafihub.ledger.QueryOuterClass.QueryGetProtocolFeeReceiverResponse> getGetProtocolFeeReceiverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProtocolFeeReceiver",
      requestType = stafihub.ledger.QueryOuterClass.QueryGetProtocolFeeReceiverRequest.class,
      responseType = stafihub.ledger.QueryOuterClass.QueryGetProtocolFeeReceiverResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetProtocolFeeReceiverRequest,
      stafihub.ledger.QueryOuterClass.QueryGetProtocolFeeReceiverResponse> getGetProtocolFeeReceiverMethod() {
    io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetProtocolFeeReceiverRequest, stafihub.ledger.QueryOuterClass.QueryGetProtocolFeeReceiverResponse> getGetProtocolFeeReceiverMethod;
    if ((getGetProtocolFeeReceiverMethod = QueryGrpc.getGetProtocolFeeReceiverMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetProtocolFeeReceiverMethod = QueryGrpc.getGetProtocolFeeReceiverMethod) == null) {
          QueryGrpc.getGetProtocolFeeReceiverMethod = getGetProtocolFeeReceiverMethod =
              io.grpc.MethodDescriptor.<stafihub.ledger.QueryOuterClass.QueryGetProtocolFeeReceiverRequest, stafihub.ledger.QueryOuterClass.QueryGetProtocolFeeReceiverResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProtocolFeeReceiver"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryGetProtocolFeeReceiverRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryGetProtocolFeeReceiverResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetProtocolFeeReceiver"))
              .build();
        }
      }
    }
    return getGetProtocolFeeReceiverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetStakingRewardCommissionRequest,
      stafihub.ledger.QueryOuterClass.QueryGetStakingRewardCommissionResponse> getGetStakingRewardCommissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStakingRewardCommission",
      requestType = stafihub.ledger.QueryOuterClass.QueryGetStakingRewardCommissionRequest.class,
      responseType = stafihub.ledger.QueryOuterClass.QueryGetStakingRewardCommissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetStakingRewardCommissionRequest,
      stafihub.ledger.QueryOuterClass.QueryGetStakingRewardCommissionResponse> getGetStakingRewardCommissionMethod() {
    io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetStakingRewardCommissionRequest, stafihub.ledger.QueryOuterClass.QueryGetStakingRewardCommissionResponse> getGetStakingRewardCommissionMethod;
    if ((getGetStakingRewardCommissionMethod = QueryGrpc.getGetStakingRewardCommissionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetStakingRewardCommissionMethod = QueryGrpc.getGetStakingRewardCommissionMethod) == null) {
          QueryGrpc.getGetStakingRewardCommissionMethod = getGetStakingRewardCommissionMethod =
              io.grpc.MethodDescriptor.<stafihub.ledger.QueryOuterClass.QueryGetStakingRewardCommissionRequest, stafihub.ledger.QueryOuterClass.QueryGetStakingRewardCommissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStakingRewardCommission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryGetStakingRewardCommissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryGetStakingRewardCommissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetStakingRewardCommission"))
              .build();
        }
      }
    }
    return getGetStakingRewardCommissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetUnbondRelayFeeRequest,
      stafihub.ledger.QueryOuterClass.QueryGetUnbondRelayFeeResponse> getGetUnbondRelayFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUnbondRelayFee",
      requestType = stafihub.ledger.QueryOuterClass.QueryGetUnbondRelayFeeRequest.class,
      responseType = stafihub.ledger.QueryOuterClass.QueryGetUnbondRelayFeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetUnbondRelayFeeRequest,
      stafihub.ledger.QueryOuterClass.QueryGetUnbondRelayFeeResponse> getGetUnbondRelayFeeMethod() {
    io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetUnbondRelayFeeRequest, stafihub.ledger.QueryOuterClass.QueryGetUnbondRelayFeeResponse> getGetUnbondRelayFeeMethod;
    if ((getGetUnbondRelayFeeMethod = QueryGrpc.getGetUnbondRelayFeeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetUnbondRelayFeeMethod = QueryGrpc.getGetUnbondRelayFeeMethod) == null) {
          QueryGrpc.getGetUnbondRelayFeeMethod = getGetUnbondRelayFeeMethod =
              io.grpc.MethodDescriptor.<stafihub.ledger.QueryOuterClass.QueryGetUnbondRelayFeeRequest, stafihub.ledger.QueryOuterClass.QueryGetUnbondRelayFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUnbondRelayFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryGetUnbondRelayFeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryGetUnbondRelayFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetUnbondRelayFee"))
              .build();
        }
      }
    }
    return getGetUnbondRelayFeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetUnbondCommissionRequest,
      stafihub.ledger.QueryOuterClass.QueryGetUnbondCommissionResponse> getGetUnbondCommissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUnbondCommission",
      requestType = stafihub.ledger.QueryOuterClass.QueryGetUnbondCommissionRequest.class,
      responseType = stafihub.ledger.QueryOuterClass.QueryGetUnbondCommissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetUnbondCommissionRequest,
      stafihub.ledger.QueryOuterClass.QueryGetUnbondCommissionResponse> getGetUnbondCommissionMethod() {
    io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetUnbondCommissionRequest, stafihub.ledger.QueryOuterClass.QueryGetUnbondCommissionResponse> getGetUnbondCommissionMethod;
    if ((getGetUnbondCommissionMethod = QueryGrpc.getGetUnbondCommissionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetUnbondCommissionMethod = QueryGrpc.getGetUnbondCommissionMethod) == null) {
          QueryGrpc.getGetUnbondCommissionMethod = getGetUnbondCommissionMethod =
              io.grpc.MethodDescriptor.<stafihub.ledger.QueryOuterClass.QueryGetUnbondCommissionRequest, stafihub.ledger.QueryOuterClass.QueryGetUnbondCommissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUnbondCommission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryGetUnbondCommissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryGetUnbondCommissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetUnbondCommission"))
              .build();
        }
      }
    }
    return getGetUnbondCommissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetEraUnbondLimitRequest,
      stafihub.ledger.QueryOuterClass.QueryGetEraUnbondLimitResponse> getGetEraUnbondLimitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEraUnbondLimit",
      requestType = stafihub.ledger.QueryOuterClass.QueryGetEraUnbondLimitRequest.class,
      responseType = stafihub.ledger.QueryOuterClass.QueryGetEraUnbondLimitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetEraUnbondLimitRequest,
      stafihub.ledger.QueryOuterClass.QueryGetEraUnbondLimitResponse> getGetEraUnbondLimitMethod() {
    io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetEraUnbondLimitRequest, stafihub.ledger.QueryOuterClass.QueryGetEraUnbondLimitResponse> getGetEraUnbondLimitMethod;
    if ((getGetEraUnbondLimitMethod = QueryGrpc.getGetEraUnbondLimitMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetEraUnbondLimitMethod = QueryGrpc.getGetEraUnbondLimitMethod) == null) {
          QueryGrpc.getGetEraUnbondLimitMethod = getGetEraUnbondLimitMethod =
              io.grpc.MethodDescriptor.<stafihub.ledger.QueryOuterClass.QueryGetEraUnbondLimitRequest, stafihub.ledger.QueryOuterClass.QueryGetEraUnbondLimitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEraUnbondLimit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryGetEraUnbondLimitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryGetEraUnbondLimitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetEraUnbondLimit"))
              .build();
        }
      }
    }
    return getGetEraUnbondLimitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetBondPipelineRequest,
      stafihub.ledger.QueryOuterClass.QueryGetBondPipelineResponse> getGetBondPipelineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBondPipeline",
      requestType = stafihub.ledger.QueryOuterClass.QueryGetBondPipelineRequest.class,
      responseType = stafihub.ledger.QueryOuterClass.QueryGetBondPipelineResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetBondPipelineRequest,
      stafihub.ledger.QueryOuterClass.QueryGetBondPipelineResponse> getGetBondPipelineMethod() {
    io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetBondPipelineRequest, stafihub.ledger.QueryOuterClass.QueryGetBondPipelineResponse> getGetBondPipelineMethod;
    if ((getGetBondPipelineMethod = QueryGrpc.getGetBondPipelineMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetBondPipelineMethod = QueryGrpc.getGetBondPipelineMethod) == null) {
          QueryGrpc.getGetBondPipelineMethod = getGetBondPipelineMethod =
              io.grpc.MethodDescriptor.<stafihub.ledger.QueryOuterClass.QueryGetBondPipelineRequest, stafihub.ledger.QueryOuterClass.QueryGetBondPipelineResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBondPipeline"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryGetBondPipelineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryGetBondPipelineResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetBondPipeline"))
              .build();
        }
      }
    }
    return getGetBondPipelineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetEraSnapshotRequest,
      stafihub.ledger.QueryOuterClass.QueryGetEraSnapshotResponse> getGetEraSnapshotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEraSnapshot",
      requestType = stafihub.ledger.QueryOuterClass.QueryGetEraSnapshotRequest.class,
      responseType = stafihub.ledger.QueryOuterClass.QueryGetEraSnapshotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetEraSnapshotRequest,
      stafihub.ledger.QueryOuterClass.QueryGetEraSnapshotResponse> getGetEraSnapshotMethod() {
    io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetEraSnapshotRequest, stafihub.ledger.QueryOuterClass.QueryGetEraSnapshotResponse> getGetEraSnapshotMethod;
    if ((getGetEraSnapshotMethod = QueryGrpc.getGetEraSnapshotMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetEraSnapshotMethod = QueryGrpc.getGetEraSnapshotMethod) == null) {
          QueryGrpc.getGetEraSnapshotMethod = getGetEraSnapshotMethod =
              io.grpc.MethodDescriptor.<stafihub.ledger.QueryOuterClass.QueryGetEraSnapshotRequest, stafihub.ledger.QueryOuterClass.QueryGetEraSnapshotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEraSnapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryGetEraSnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryGetEraSnapshotResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetEraSnapshot"))
              .build();
        }
      }
    }
    return getGetEraSnapshotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetSnapshotRequest,
      stafihub.ledger.QueryOuterClass.QueryGetSnapshotResponse> getGetSnapshotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSnapshot",
      requestType = stafihub.ledger.QueryOuterClass.QueryGetSnapshotRequest.class,
      responseType = stafihub.ledger.QueryOuterClass.QueryGetSnapshotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetSnapshotRequest,
      stafihub.ledger.QueryOuterClass.QueryGetSnapshotResponse> getGetSnapshotMethod() {
    io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetSnapshotRequest, stafihub.ledger.QueryOuterClass.QueryGetSnapshotResponse> getGetSnapshotMethod;
    if ((getGetSnapshotMethod = QueryGrpc.getGetSnapshotMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetSnapshotMethod = QueryGrpc.getGetSnapshotMethod) == null) {
          QueryGrpc.getGetSnapshotMethod = getGetSnapshotMethod =
              io.grpc.MethodDescriptor.<stafihub.ledger.QueryOuterClass.QueryGetSnapshotRequest, stafihub.ledger.QueryOuterClass.QueryGetSnapshotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSnapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryGetSnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryGetSnapshotResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetSnapshot"))
              .build();
        }
      }
    }
    return getGetSnapshotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetTotalExpectedActiveRequest,
      stafihub.ledger.QueryOuterClass.QueryGetTotalExpectedActiveResponse> getGetTotalExpectedActiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTotalExpectedActive",
      requestType = stafihub.ledger.QueryOuterClass.QueryGetTotalExpectedActiveRequest.class,
      responseType = stafihub.ledger.QueryOuterClass.QueryGetTotalExpectedActiveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetTotalExpectedActiveRequest,
      stafihub.ledger.QueryOuterClass.QueryGetTotalExpectedActiveResponse> getGetTotalExpectedActiveMethod() {
    io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetTotalExpectedActiveRequest, stafihub.ledger.QueryOuterClass.QueryGetTotalExpectedActiveResponse> getGetTotalExpectedActiveMethod;
    if ((getGetTotalExpectedActiveMethod = QueryGrpc.getGetTotalExpectedActiveMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetTotalExpectedActiveMethod = QueryGrpc.getGetTotalExpectedActiveMethod) == null) {
          QueryGrpc.getGetTotalExpectedActiveMethod = getGetTotalExpectedActiveMethod =
              io.grpc.MethodDescriptor.<stafihub.ledger.QueryOuterClass.QueryGetTotalExpectedActiveRequest, stafihub.ledger.QueryOuterClass.QueryGetTotalExpectedActiveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTotalExpectedActive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryGetTotalExpectedActiveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryGetTotalExpectedActiveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetTotalExpectedActive"))
              .build();
        }
      }
    }
    return getGetTotalExpectedActiveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetBondRecordRequest,
      stafihub.ledger.QueryOuterClass.QueryGetBondRecordResponse> getGetBondRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBondRecord",
      requestType = stafihub.ledger.QueryOuterClass.QueryGetBondRecordRequest.class,
      responseType = stafihub.ledger.QueryOuterClass.QueryGetBondRecordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetBondRecordRequest,
      stafihub.ledger.QueryOuterClass.QueryGetBondRecordResponse> getGetBondRecordMethod() {
    io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetBondRecordRequest, stafihub.ledger.QueryOuterClass.QueryGetBondRecordResponse> getGetBondRecordMethod;
    if ((getGetBondRecordMethod = QueryGrpc.getGetBondRecordMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetBondRecordMethod = QueryGrpc.getGetBondRecordMethod) == null) {
          QueryGrpc.getGetBondRecordMethod = getGetBondRecordMethod =
              io.grpc.MethodDescriptor.<stafihub.ledger.QueryOuterClass.QueryGetBondRecordRequest, stafihub.ledger.QueryOuterClass.QueryGetBondRecordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBondRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryGetBondRecordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryGetBondRecordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetBondRecord"))
              .build();
        }
      }
    }
    return getGetBondRecordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetSignatureRequest,
      stafihub.ledger.QueryOuterClass.QueryGetSignatureResponse> getGetSignatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSignature",
      requestType = stafihub.ledger.QueryOuterClass.QueryGetSignatureRequest.class,
      responseType = stafihub.ledger.QueryOuterClass.QueryGetSignatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetSignatureRequest,
      stafihub.ledger.QueryOuterClass.QueryGetSignatureResponse> getGetSignatureMethod() {
    io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetSignatureRequest, stafihub.ledger.QueryOuterClass.QueryGetSignatureResponse> getGetSignatureMethod;
    if ((getGetSignatureMethod = QueryGrpc.getGetSignatureMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetSignatureMethod = QueryGrpc.getGetSignatureMethod) == null) {
          QueryGrpc.getGetSignatureMethod = getGetSignatureMethod =
              io.grpc.MethodDescriptor.<stafihub.ledger.QueryOuterClass.QueryGetSignatureRequest, stafihub.ledger.QueryOuterClass.QueryGetSignatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSignature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryGetSignatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryGetSignatureResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetSignature"))
              .build();
        }
      }
    }
    return getGetSignatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetRParamsRequest,
      stafihub.ledger.QueryOuterClass.QueryGetRParamsResponse> getGetRParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRParams",
      requestType = stafihub.ledger.QueryOuterClass.QueryGetRParamsRequest.class,
      responseType = stafihub.ledger.QueryOuterClass.QueryGetRParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetRParamsRequest,
      stafihub.ledger.QueryOuterClass.QueryGetRParamsResponse> getGetRParamsMethod() {
    io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryGetRParamsRequest, stafihub.ledger.QueryOuterClass.QueryGetRParamsResponse> getGetRParamsMethod;
    if ((getGetRParamsMethod = QueryGrpc.getGetRParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetRParamsMethod = QueryGrpc.getGetRParamsMethod) == null) {
          QueryGrpc.getGetRParamsMethod = getGetRParamsMethod =
              io.grpc.MethodDescriptor.<stafihub.ledger.QueryOuterClass.QueryGetRParamsRequest, stafihub.ledger.QueryOuterClass.QueryGetRParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryGetRParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryGetRParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetRParams"))
              .build();
        }
      }
    }
    return getGetRParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryTotalProtocolFeeRequest,
      stafihub.ledger.QueryOuterClass.QueryTotalProtocolFeeResponse> getTotalProtocolFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalProtocolFee",
      requestType = stafihub.ledger.QueryOuterClass.QueryTotalProtocolFeeRequest.class,
      responseType = stafihub.ledger.QueryOuterClass.QueryTotalProtocolFeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryTotalProtocolFeeRequest,
      stafihub.ledger.QueryOuterClass.QueryTotalProtocolFeeResponse> getTotalProtocolFeeMethod() {
    io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryTotalProtocolFeeRequest, stafihub.ledger.QueryOuterClass.QueryTotalProtocolFeeResponse> getTotalProtocolFeeMethod;
    if ((getTotalProtocolFeeMethod = QueryGrpc.getTotalProtocolFeeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTotalProtocolFeeMethod = QueryGrpc.getTotalProtocolFeeMethod) == null) {
          QueryGrpc.getTotalProtocolFeeMethod = getTotalProtocolFeeMethod =
              io.grpc.MethodDescriptor.<stafihub.ledger.QueryOuterClass.QueryTotalProtocolFeeRequest, stafihub.ledger.QueryOuterClass.QueryTotalProtocolFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalProtocolFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryTotalProtocolFeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryTotalProtocolFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TotalProtocolFee"))
              .build();
        }
      }
    }
    return getTotalProtocolFeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryRelayFeeReceiverRequest,
      stafihub.ledger.QueryOuterClass.QueryRelayFeeReceiverResponse> getRelayFeeReceiverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RelayFeeReceiver",
      requestType = stafihub.ledger.QueryOuterClass.QueryRelayFeeReceiverRequest.class,
      responseType = stafihub.ledger.QueryOuterClass.QueryRelayFeeReceiverResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryRelayFeeReceiverRequest,
      stafihub.ledger.QueryOuterClass.QueryRelayFeeReceiverResponse> getRelayFeeReceiverMethod() {
    io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryRelayFeeReceiverRequest, stafihub.ledger.QueryOuterClass.QueryRelayFeeReceiverResponse> getRelayFeeReceiverMethod;
    if ((getRelayFeeReceiverMethod = QueryGrpc.getRelayFeeReceiverMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRelayFeeReceiverMethod = QueryGrpc.getRelayFeeReceiverMethod) == null) {
          QueryGrpc.getRelayFeeReceiverMethod = getRelayFeeReceiverMethod =
              io.grpc.MethodDescriptor.<stafihub.ledger.QueryOuterClass.QueryRelayFeeReceiverRequest, stafihub.ledger.QueryOuterClass.QueryRelayFeeReceiverResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RelayFeeReceiver"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryRelayFeeReceiverRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryRelayFeeReceiverResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RelayFeeReceiver"))
              .build();
        }
      }
    }
    return getRelayFeeReceiverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryUnbondSwitchRequest,
      stafihub.ledger.QueryOuterClass.QueryUnbondSwitchResponse> getUnbondSwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnbondSwitch",
      requestType = stafihub.ledger.QueryOuterClass.QueryUnbondSwitchRequest.class,
      responseType = stafihub.ledger.QueryOuterClass.QueryUnbondSwitchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryUnbondSwitchRequest,
      stafihub.ledger.QueryOuterClass.QueryUnbondSwitchResponse> getUnbondSwitchMethod() {
    io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryUnbondSwitchRequest, stafihub.ledger.QueryOuterClass.QueryUnbondSwitchResponse> getUnbondSwitchMethod;
    if ((getUnbondSwitchMethod = QueryGrpc.getUnbondSwitchMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUnbondSwitchMethod = QueryGrpc.getUnbondSwitchMethod) == null) {
          QueryGrpc.getUnbondSwitchMethod = getUnbondSwitchMethod =
              io.grpc.MethodDescriptor.<stafihub.ledger.QueryOuterClass.QueryUnbondSwitchRequest, stafihub.ledger.QueryOuterClass.QueryUnbondSwitchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnbondSwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryUnbondSwitchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryUnbondSwitchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UnbondSwitch"))
              .build();
        }
      }
    }
    return getUnbondSwitchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryPoolUnbondNextSequenceRequest,
      stafihub.ledger.QueryOuterClass.QueryPoolUnbondNextSequenceResponse> getPoolUnbondNextSequenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PoolUnbondNextSequence",
      requestType = stafihub.ledger.QueryOuterClass.QueryPoolUnbondNextSequenceRequest.class,
      responseType = stafihub.ledger.QueryOuterClass.QueryPoolUnbondNextSequenceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryPoolUnbondNextSequenceRequest,
      stafihub.ledger.QueryOuterClass.QueryPoolUnbondNextSequenceResponse> getPoolUnbondNextSequenceMethod() {
    io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryPoolUnbondNextSequenceRequest, stafihub.ledger.QueryOuterClass.QueryPoolUnbondNextSequenceResponse> getPoolUnbondNextSequenceMethod;
    if ((getPoolUnbondNextSequenceMethod = QueryGrpc.getPoolUnbondNextSequenceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolUnbondNextSequenceMethod = QueryGrpc.getPoolUnbondNextSequenceMethod) == null) {
          QueryGrpc.getPoolUnbondNextSequenceMethod = getPoolUnbondNextSequenceMethod =
              io.grpc.MethodDescriptor.<stafihub.ledger.QueryOuterClass.QueryPoolUnbondNextSequenceRequest, stafihub.ledger.QueryOuterClass.QueryPoolUnbondNextSequenceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PoolUnbondNextSequence"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryPoolUnbondNextSequenceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryPoolUnbondNextSequenceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PoolUnbondNextSequence"))
              .build();
        }
      }
    }
    return getPoolUnbondNextSequenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryPoolUnbondingsRequest,
      stafihub.ledger.QueryOuterClass.QueryPoolUnbondingsResponse> getPoolUnbondingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PoolUnbondings",
      requestType = stafihub.ledger.QueryOuterClass.QueryPoolUnbondingsRequest.class,
      responseType = stafihub.ledger.QueryOuterClass.QueryPoolUnbondingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryPoolUnbondingsRequest,
      stafihub.ledger.QueryOuterClass.QueryPoolUnbondingsResponse> getPoolUnbondingsMethod() {
    io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryPoolUnbondingsRequest, stafihub.ledger.QueryOuterClass.QueryPoolUnbondingsResponse> getPoolUnbondingsMethod;
    if ((getPoolUnbondingsMethod = QueryGrpc.getPoolUnbondingsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolUnbondingsMethod = QueryGrpc.getPoolUnbondingsMethod) == null) {
          QueryGrpc.getPoolUnbondingsMethod = getPoolUnbondingsMethod =
              io.grpc.MethodDescriptor.<stafihub.ledger.QueryOuterClass.QueryPoolUnbondingsRequest, stafihub.ledger.QueryOuterClass.QueryPoolUnbondingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PoolUnbondings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryPoolUnbondingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryPoolUnbondingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PoolUnbondings"))
              .build();
        }
      }
    }
    return getPoolUnbondingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryIcaPoolListRequest,
      stafihub.ledger.QueryOuterClass.QueryIcaPoolListResponse> getIcaPoolListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IcaPoolList",
      requestType = stafihub.ledger.QueryOuterClass.QueryIcaPoolListRequest.class,
      responseType = stafihub.ledger.QueryOuterClass.QueryIcaPoolListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryIcaPoolListRequest,
      stafihub.ledger.QueryOuterClass.QueryIcaPoolListResponse> getIcaPoolListMethod() {
    io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryIcaPoolListRequest, stafihub.ledger.QueryOuterClass.QueryIcaPoolListResponse> getIcaPoolListMethod;
    if ((getIcaPoolListMethod = QueryGrpc.getIcaPoolListMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getIcaPoolListMethod = QueryGrpc.getIcaPoolListMethod) == null) {
          QueryGrpc.getIcaPoolListMethod = getIcaPoolListMethod =
              io.grpc.MethodDescriptor.<stafihub.ledger.QueryOuterClass.QueryIcaPoolListRequest, stafihub.ledger.QueryOuterClass.QueryIcaPoolListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IcaPoolList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryIcaPoolListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryIcaPoolListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("IcaPoolList"))
              .build();
        }
      }
    }
    return getIcaPoolListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryInterchainTxStatusRequest,
      stafihub.ledger.QueryOuterClass.QueryInterchainTxStatusResponse> getInterchainTxStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InterchainTxStatus",
      requestType = stafihub.ledger.QueryOuterClass.QueryInterchainTxStatusRequest.class,
      responseType = stafihub.ledger.QueryOuterClass.QueryInterchainTxStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryInterchainTxStatusRequest,
      stafihub.ledger.QueryOuterClass.QueryInterchainTxStatusResponse> getInterchainTxStatusMethod() {
    io.grpc.MethodDescriptor<stafihub.ledger.QueryOuterClass.QueryInterchainTxStatusRequest, stafihub.ledger.QueryOuterClass.QueryInterchainTxStatusResponse> getInterchainTxStatusMethod;
    if ((getInterchainTxStatusMethod = QueryGrpc.getInterchainTxStatusMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getInterchainTxStatusMethod = QueryGrpc.getInterchainTxStatusMethod) == null) {
          QueryGrpc.getInterchainTxStatusMethod = getInterchainTxStatusMethod =
              io.grpc.MethodDescriptor.<stafihub.ledger.QueryOuterClass.QueryInterchainTxStatusRequest, stafihub.ledger.QueryOuterClass.QueryInterchainTxStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InterchainTxStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryInterchainTxStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.ledger.QueryOuterClass.QueryInterchainTxStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("InterchainTxStatus"))
              .build();
        }
      }
    }
    return getInterchainTxStatusMethod;
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
     * Queries a list of getExchangeRate items.
     * </pre>
     */
    public void getExchangeRate(stafihub.ledger.QueryOuterClass.QueryGetExchangeRateRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetExchangeRateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetExchangeRateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of exchangeRateAll items.
     * </pre>
     */
    public void exchangeRateAll(stafihub.ledger.QueryOuterClass.QueryExchangeRateAllRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryExchangeRateAllResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getExchangeRateAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getEraExchangeRate items.
     * </pre>
     */
    public void getEraExchangeRate(stafihub.ledger.QueryOuterClass.QueryGetEraExchangeRateRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetEraExchangeRateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEraExchangeRateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of eraExchangeRatesByDenom items.
     * </pre>
     */
    public void eraExchangeRatesByDenom(stafihub.ledger.QueryOuterClass.QueryEraExchangeRatesByDenomRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryEraExchangeRatesByDenomResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEraExchangeRatesByDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of bondedPoolsByDenom items.
     * </pre>
     */
    public void bondedPoolsByDenom(stafihub.ledger.QueryOuterClass.QueryBondedPoolsByDenomRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryBondedPoolsByDenomResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBondedPoolsByDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getPoolDetail items.
     * </pre>
     */
    public void getPoolDetail(stafihub.ledger.QueryOuterClass.QueryGetPoolDetailRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetPoolDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPoolDetailMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getChainEra items.
     * </pre>
     */
    public void getChainEra(stafihub.ledger.QueryOuterClass.QueryGetChainEraRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetChainEraResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetChainEraMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getCurrentEraSnapshot items.
     * </pre>
     */
    public void getCurrentEraSnapshot(stafihub.ledger.QueryOuterClass.QueryGetCurrentEraSnapshotRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetCurrentEraSnapshotResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCurrentEraSnapshotMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getReceiver items.
     * </pre>
     */
    public void getProtocolFeeReceiver(stafihub.ledger.QueryOuterClass.QueryGetProtocolFeeReceiverRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetProtocolFeeReceiverResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProtocolFeeReceiverMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getCommission items.
     * </pre>
     */
    public void getStakingRewardCommission(stafihub.ledger.QueryOuterClass.QueryGetStakingRewardCommissionRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetStakingRewardCommissionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStakingRewardCommissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getUnbondFee items.
     * </pre>
     */
    public void getUnbondRelayFee(stafihub.ledger.QueryOuterClass.QueryGetUnbondRelayFeeRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetUnbondRelayFeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUnbondRelayFeeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getUnbondCommission items.
     * </pre>
     */
    public void getUnbondCommission(stafihub.ledger.QueryOuterClass.QueryGetUnbondCommissionRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetUnbondCommissionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUnbondCommissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getEraUnbondLimit items.
     * </pre>
     */
    public void getEraUnbondLimit(stafihub.ledger.QueryOuterClass.QueryGetEraUnbondLimitRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetEraUnbondLimitResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEraUnbondLimitMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getBondPipeline items.
     * </pre>
     */
    public void getBondPipeline(stafihub.ledger.QueryOuterClass.QueryGetBondPipelineRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetBondPipelineResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBondPipelineMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getEraSnapshot items.
     * </pre>
     */
    public void getEraSnapshot(stafihub.ledger.QueryOuterClass.QueryGetEraSnapshotRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetEraSnapshotResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEraSnapshotMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getSnapshot items.
     * </pre>
     */
    public void getSnapshot(stafihub.ledger.QueryOuterClass.QueryGetSnapshotRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetSnapshotResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSnapshotMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getTotalExpectedActive items.
     * </pre>
     */
    public void getTotalExpectedActive(stafihub.ledger.QueryOuterClass.QueryGetTotalExpectedActiveRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetTotalExpectedActiveResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTotalExpectedActiveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getBondRecord items.
     * </pre>
     */
    public void getBondRecord(stafihub.ledger.QueryOuterClass.QueryGetBondRecordRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetBondRecordResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBondRecordMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getSignature items.
     * </pre>
     */
    public void getSignature(stafihub.ledger.QueryOuterClass.QueryGetSignatureRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetSignatureResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSignatureMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of GetRParams items.
     * </pre>
     */
    public void getRParams(stafihub.ledger.QueryOuterClass.QueryGetRParamsRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetRParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of TotalFeeList items.
     * </pre>
     */
    public void totalProtocolFee(stafihub.ledger.QueryOuterClass.QueryTotalProtocolFeeRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryTotalProtocolFeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTotalProtocolFeeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of RelayFeeReceiver items.
     * </pre>
     */
    public void relayFeeReceiver(stafihub.ledger.QueryOuterClass.QueryRelayFeeReceiverRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryRelayFeeReceiverResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRelayFeeReceiverMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of UnbondSwitch items.
     * </pre>
     */
    public void unbondSwitch(stafihub.ledger.QueryOuterClass.QueryUnbondSwitchRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryUnbondSwitchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnbondSwitchMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of PoolUnbondNextSequence items.
     * </pre>
     */
    public void poolUnbondNextSequence(stafihub.ledger.QueryOuterClass.QueryPoolUnbondNextSequenceRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryPoolUnbondNextSequenceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPoolUnbondNextSequenceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of PoolUnbondings items.
     * </pre>
     */
    public void poolUnbondings(stafihub.ledger.QueryOuterClass.QueryPoolUnbondingsRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryPoolUnbondingsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPoolUnbondingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of IcaPoolList items.
     * </pre>
     */
    public void icaPoolList(stafihub.ledger.QueryOuterClass.QueryIcaPoolListRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryIcaPoolListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getIcaPoolListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of InterchainTxStatus items.
     * </pre>
     */
    public void interchainTxStatus(stafihub.ledger.QueryOuterClass.QueryInterchainTxStatusRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryInterchainTxStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInterchainTxStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetExchangeRateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.ledger.QueryOuterClass.QueryGetExchangeRateRequest,
                stafihub.ledger.QueryOuterClass.QueryGetExchangeRateResponse>(
                  this, METHODID_GET_EXCHANGE_RATE)))
          .addMethod(
            getExchangeRateAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.ledger.QueryOuterClass.QueryExchangeRateAllRequest,
                stafihub.ledger.QueryOuterClass.QueryExchangeRateAllResponse>(
                  this, METHODID_EXCHANGE_RATE_ALL)))
          .addMethod(
            getGetEraExchangeRateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.ledger.QueryOuterClass.QueryGetEraExchangeRateRequest,
                stafihub.ledger.QueryOuterClass.QueryGetEraExchangeRateResponse>(
                  this, METHODID_GET_ERA_EXCHANGE_RATE)))
          .addMethod(
            getEraExchangeRatesByDenomMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.ledger.QueryOuterClass.QueryEraExchangeRatesByDenomRequest,
                stafihub.ledger.QueryOuterClass.QueryEraExchangeRatesByDenomResponse>(
                  this, METHODID_ERA_EXCHANGE_RATES_BY_DENOM)))
          .addMethod(
            getBondedPoolsByDenomMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.ledger.QueryOuterClass.QueryBondedPoolsByDenomRequest,
                stafihub.ledger.QueryOuterClass.QueryBondedPoolsByDenomResponse>(
                  this, METHODID_BONDED_POOLS_BY_DENOM)))
          .addMethod(
            getGetPoolDetailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.ledger.QueryOuterClass.QueryGetPoolDetailRequest,
                stafihub.ledger.QueryOuterClass.QueryGetPoolDetailResponse>(
                  this, METHODID_GET_POOL_DETAIL)))
          .addMethod(
            getGetChainEraMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.ledger.QueryOuterClass.QueryGetChainEraRequest,
                stafihub.ledger.QueryOuterClass.QueryGetChainEraResponse>(
                  this, METHODID_GET_CHAIN_ERA)))
          .addMethod(
            getGetCurrentEraSnapshotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.ledger.QueryOuterClass.QueryGetCurrentEraSnapshotRequest,
                stafihub.ledger.QueryOuterClass.QueryGetCurrentEraSnapshotResponse>(
                  this, METHODID_GET_CURRENT_ERA_SNAPSHOT)))
          .addMethod(
            getGetProtocolFeeReceiverMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.ledger.QueryOuterClass.QueryGetProtocolFeeReceiverRequest,
                stafihub.ledger.QueryOuterClass.QueryGetProtocolFeeReceiverResponse>(
                  this, METHODID_GET_PROTOCOL_FEE_RECEIVER)))
          .addMethod(
            getGetStakingRewardCommissionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.ledger.QueryOuterClass.QueryGetStakingRewardCommissionRequest,
                stafihub.ledger.QueryOuterClass.QueryGetStakingRewardCommissionResponse>(
                  this, METHODID_GET_STAKING_REWARD_COMMISSION)))
          .addMethod(
            getGetUnbondRelayFeeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.ledger.QueryOuterClass.QueryGetUnbondRelayFeeRequest,
                stafihub.ledger.QueryOuterClass.QueryGetUnbondRelayFeeResponse>(
                  this, METHODID_GET_UNBOND_RELAY_FEE)))
          .addMethod(
            getGetUnbondCommissionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.ledger.QueryOuterClass.QueryGetUnbondCommissionRequest,
                stafihub.ledger.QueryOuterClass.QueryGetUnbondCommissionResponse>(
                  this, METHODID_GET_UNBOND_COMMISSION)))
          .addMethod(
            getGetEraUnbondLimitMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.ledger.QueryOuterClass.QueryGetEraUnbondLimitRequest,
                stafihub.ledger.QueryOuterClass.QueryGetEraUnbondLimitResponse>(
                  this, METHODID_GET_ERA_UNBOND_LIMIT)))
          .addMethod(
            getGetBondPipelineMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.ledger.QueryOuterClass.QueryGetBondPipelineRequest,
                stafihub.ledger.QueryOuterClass.QueryGetBondPipelineResponse>(
                  this, METHODID_GET_BOND_PIPELINE)))
          .addMethod(
            getGetEraSnapshotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.ledger.QueryOuterClass.QueryGetEraSnapshotRequest,
                stafihub.ledger.QueryOuterClass.QueryGetEraSnapshotResponse>(
                  this, METHODID_GET_ERA_SNAPSHOT)))
          .addMethod(
            getGetSnapshotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.ledger.QueryOuterClass.QueryGetSnapshotRequest,
                stafihub.ledger.QueryOuterClass.QueryGetSnapshotResponse>(
                  this, METHODID_GET_SNAPSHOT)))
          .addMethod(
            getGetTotalExpectedActiveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.ledger.QueryOuterClass.QueryGetTotalExpectedActiveRequest,
                stafihub.ledger.QueryOuterClass.QueryGetTotalExpectedActiveResponse>(
                  this, METHODID_GET_TOTAL_EXPECTED_ACTIVE)))
          .addMethod(
            getGetBondRecordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.ledger.QueryOuterClass.QueryGetBondRecordRequest,
                stafihub.ledger.QueryOuterClass.QueryGetBondRecordResponse>(
                  this, METHODID_GET_BOND_RECORD)))
          .addMethod(
            getGetSignatureMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.ledger.QueryOuterClass.QueryGetSignatureRequest,
                stafihub.ledger.QueryOuterClass.QueryGetSignatureResponse>(
                  this, METHODID_GET_SIGNATURE)))
          .addMethod(
            getGetRParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.ledger.QueryOuterClass.QueryGetRParamsRequest,
                stafihub.ledger.QueryOuterClass.QueryGetRParamsResponse>(
                  this, METHODID_GET_RPARAMS)))
          .addMethod(
            getTotalProtocolFeeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.ledger.QueryOuterClass.QueryTotalProtocolFeeRequest,
                stafihub.ledger.QueryOuterClass.QueryTotalProtocolFeeResponse>(
                  this, METHODID_TOTAL_PROTOCOL_FEE)))
          .addMethod(
            getRelayFeeReceiverMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.ledger.QueryOuterClass.QueryRelayFeeReceiverRequest,
                stafihub.ledger.QueryOuterClass.QueryRelayFeeReceiverResponse>(
                  this, METHODID_RELAY_FEE_RECEIVER)))
          .addMethod(
            getUnbondSwitchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.ledger.QueryOuterClass.QueryUnbondSwitchRequest,
                stafihub.ledger.QueryOuterClass.QueryUnbondSwitchResponse>(
                  this, METHODID_UNBOND_SWITCH)))
          .addMethod(
            getPoolUnbondNextSequenceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.ledger.QueryOuterClass.QueryPoolUnbondNextSequenceRequest,
                stafihub.ledger.QueryOuterClass.QueryPoolUnbondNextSequenceResponse>(
                  this, METHODID_POOL_UNBOND_NEXT_SEQUENCE)))
          .addMethod(
            getPoolUnbondingsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.ledger.QueryOuterClass.QueryPoolUnbondingsRequest,
                stafihub.ledger.QueryOuterClass.QueryPoolUnbondingsResponse>(
                  this, METHODID_POOL_UNBONDINGS)))
          .addMethod(
            getIcaPoolListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.ledger.QueryOuterClass.QueryIcaPoolListRequest,
                stafihub.ledger.QueryOuterClass.QueryIcaPoolListResponse>(
                  this, METHODID_ICA_POOL_LIST)))
          .addMethod(
            getInterchainTxStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.ledger.QueryOuterClass.QueryInterchainTxStatusRequest,
                stafihub.ledger.QueryOuterClass.QueryInterchainTxStatusResponse>(
                  this, METHODID_INTERCHAIN_TX_STATUS)))
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
     * Queries a list of getExchangeRate items.
     * </pre>
     */
    public void getExchangeRate(stafihub.ledger.QueryOuterClass.QueryGetExchangeRateRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetExchangeRateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetExchangeRateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of exchangeRateAll items.
     * </pre>
     */
    public void exchangeRateAll(stafihub.ledger.QueryOuterClass.QueryExchangeRateAllRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryExchangeRateAllResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExchangeRateAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getEraExchangeRate items.
     * </pre>
     */
    public void getEraExchangeRate(stafihub.ledger.QueryOuterClass.QueryGetEraExchangeRateRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetEraExchangeRateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEraExchangeRateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of eraExchangeRatesByDenom items.
     * </pre>
     */
    public void eraExchangeRatesByDenom(stafihub.ledger.QueryOuterClass.QueryEraExchangeRatesByDenomRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryEraExchangeRatesByDenomResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEraExchangeRatesByDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of bondedPoolsByDenom items.
     * </pre>
     */
    public void bondedPoolsByDenom(stafihub.ledger.QueryOuterClass.QueryBondedPoolsByDenomRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryBondedPoolsByDenomResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBondedPoolsByDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getPoolDetail items.
     * </pre>
     */
    public void getPoolDetail(stafihub.ledger.QueryOuterClass.QueryGetPoolDetailRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetPoolDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPoolDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getChainEra items.
     * </pre>
     */
    public void getChainEra(stafihub.ledger.QueryOuterClass.QueryGetChainEraRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetChainEraResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetChainEraMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getCurrentEraSnapshot items.
     * </pre>
     */
    public void getCurrentEraSnapshot(stafihub.ledger.QueryOuterClass.QueryGetCurrentEraSnapshotRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetCurrentEraSnapshotResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCurrentEraSnapshotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getReceiver items.
     * </pre>
     */
    public void getProtocolFeeReceiver(stafihub.ledger.QueryOuterClass.QueryGetProtocolFeeReceiverRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetProtocolFeeReceiverResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProtocolFeeReceiverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getCommission items.
     * </pre>
     */
    public void getStakingRewardCommission(stafihub.ledger.QueryOuterClass.QueryGetStakingRewardCommissionRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetStakingRewardCommissionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStakingRewardCommissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getUnbondFee items.
     * </pre>
     */
    public void getUnbondRelayFee(stafihub.ledger.QueryOuterClass.QueryGetUnbondRelayFeeRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetUnbondRelayFeeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUnbondRelayFeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getUnbondCommission items.
     * </pre>
     */
    public void getUnbondCommission(stafihub.ledger.QueryOuterClass.QueryGetUnbondCommissionRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetUnbondCommissionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUnbondCommissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getEraUnbondLimit items.
     * </pre>
     */
    public void getEraUnbondLimit(stafihub.ledger.QueryOuterClass.QueryGetEraUnbondLimitRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetEraUnbondLimitResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEraUnbondLimitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getBondPipeline items.
     * </pre>
     */
    public void getBondPipeline(stafihub.ledger.QueryOuterClass.QueryGetBondPipelineRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetBondPipelineResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBondPipelineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getEraSnapshot items.
     * </pre>
     */
    public void getEraSnapshot(stafihub.ledger.QueryOuterClass.QueryGetEraSnapshotRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetEraSnapshotResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEraSnapshotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getSnapshot items.
     * </pre>
     */
    public void getSnapshot(stafihub.ledger.QueryOuterClass.QueryGetSnapshotRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetSnapshotResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSnapshotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getTotalExpectedActive items.
     * </pre>
     */
    public void getTotalExpectedActive(stafihub.ledger.QueryOuterClass.QueryGetTotalExpectedActiveRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetTotalExpectedActiveResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTotalExpectedActiveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getBondRecord items.
     * </pre>
     */
    public void getBondRecord(stafihub.ledger.QueryOuterClass.QueryGetBondRecordRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetBondRecordResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBondRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getSignature items.
     * </pre>
     */
    public void getSignature(stafihub.ledger.QueryOuterClass.QueryGetSignatureRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetSignatureResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSignatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of GetRParams items.
     * </pre>
     */
    public void getRParams(stafihub.ledger.QueryOuterClass.QueryGetRParamsRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetRParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of TotalFeeList items.
     * </pre>
     */
    public void totalProtocolFee(stafihub.ledger.QueryOuterClass.QueryTotalProtocolFeeRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryTotalProtocolFeeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTotalProtocolFeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of RelayFeeReceiver items.
     * </pre>
     */
    public void relayFeeReceiver(stafihub.ledger.QueryOuterClass.QueryRelayFeeReceiverRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryRelayFeeReceiverResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRelayFeeReceiverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of UnbondSwitch items.
     * </pre>
     */
    public void unbondSwitch(stafihub.ledger.QueryOuterClass.QueryUnbondSwitchRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryUnbondSwitchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnbondSwitchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of PoolUnbondNextSequence items.
     * </pre>
     */
    public void poolUnbondNextSequence(stafihub.ledger.QueryOuterClass.QueryPoolUnbondNextSequenceRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryPoolUnbondNextSequenceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPoolUnbondNextSequenceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of PoolUnbondings items.
     * </pre>
     */
    public void poolUnbondings(stafihub.ledger.QueryOuterClass.QueryPoolUnbondingsRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryPoolUnbondingsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPoolUnbondingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of IcaPoolList items.
     * </pre>
     */
    public void icaPoolList(stafihub.ledger.QueryOuterClass.QueryIcaPoolListRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryIcaPoolListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIcaPoolListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of InterchainTxStatus items.
     * </pre>
     */
    public void interchainTxStatus(stafihub.ledger.QueryOuterClass.QueryInterchainTxStatusRequest request,
        io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryInterchainTxStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInterchainTxStatusMethod(), getCallOptions()), request, responseObserver);
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
     * Queries a list of getExchangeRate items.
     * </pre>
     */
    public stafihub.ledger.QueryOuterClass.QueryGetExchangeRateResponse getExchangeRate(stafihub.ledger.QueryOuterClass.QueryGetExchangeRateRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetExchangeRateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of exchangeRateAll items.
     * </pre>
     */
    public stafihub.ledger.QueryOuterClass.QueryExchangeRateAllResponse exchangeRateAll(stafihub.ledger.QueryOuterClass.QueryExchangeRateAllRequest request) {
      return blockingUnaryCall(
          getChannel(), getExchangeRateAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getEraExchangeRate items.
     * </pre>
     */
    public stafihub.ledger.QueryOuterClass.QueryGetEraExchangeRateResponse getEraExchangeRate(stafihub.ledger.QueryOuterClass.QueryGetEraExchangeRateRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEraExchangeRateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of eraExchangeRatesByDenom items.
     * </pre>
     */
    public stafihub.ledger.QueryOuterClass.QueryEraExchangeRatesByDenomResponse eraExchangeRatesByDenom(stafihub.ledger.QueryOuterClass.QueryEraExchangeRatesByDenomRequest request) {
      return blockingUnaryCall(
          getChannel(), getEraExchangeRatesByDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of bondedPoolsByDenom items.
     * </pre>
     */
    public stafihub.ledger.QueryOuterClass.QueryBondedPoolsByDenomResponse bondedPoolsByDenom(stafihub.ledger.QueryOuterClass.QueryBondedPoolsByDenomRequest request) {
      return blockingUnaryCall(
          getChannel(), getBondedPoolsByDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getPoolDetail items.
     * </pre>
     */
    public stafihub.ledger.QueryOuterClass.QueryGetPoolDetailResponse getPoolDetail(stafihub.ledger.QueryOuterClass.QueryGetPoolDetailRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPoolDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getChainEra items.
     * </pre>
     */
    public stafihub.ledger.QueryOuterClass.QueryGetChainEraResponse getChainEra(stafihub.ledger.QueryOuterClass.QueryGetChainEraRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetChainEraMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getCurrentEraSnapshot items.
     * </pre>
     */
    public stafihub.ledger.QueryOuterClass.QueryGetCurrentEraSnapshotResponse getCurrentEraSnapshot(stafihub.ledger.QueryOuterClass.QueryGetCurrentEraSnapshotRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCurrentEraSnapshotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getReceiver items.
     * </pre>
     */
    public stafihub.ledger.QueryOuterClass.QueryGetProtocolFeeReceiverResponse getProtocolFeeReceiver(stafihub.ledger.QueryOuterClass.QueryGetProtocolFeeReceiverRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProtocolFeeReceiverMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getCommission items.
     * </pre>
     */
    public stafihub.ledger.QueryOuterClass.QueryGetStakingRewardCommissionResponse getStakingRewardCommission(stafihub.ledger.QueryOuterClass.QueryGetStakingRewardCommissionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetStakingRewardCommissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getUnbondFee items.
     * </pre>
     */
    public stafihub.ledger.QueryOuterClass.QueryGetUnbondRelayFeeResponse getUnbondRelayFee(stafihub.ledger.QueryOuterClass.QueryGetUnbondRelayFeeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUnbondRelayFeeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getUnbondCommission items.
     * </pre>
     */
    public stafihub.ledger.QueryOuterClass.QueryGetUnbondCommissionResponse getUnbondCommission(stafihub.ledger.QueryOuterClass.QueryGetUnbondCommissionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUnbondCommissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getEraUnbondLimit items.
     * </pre>
     */
    public stafihub.ledger.QueryOuterClass.QueryGetEraUnbondLimitResponse getEraUnbondLimit(stafihub.ledger.QueryOuterClass.QueryGetEraUnbondLimitRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEraUnbondLimitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getBondPipeline items.
     * </pre>
     */
    public stafihub.ledger.QueryOuterClass.QueryGetBondPipelineResponse getBondPipeline(stafihub.ledger.QueryOuterClass.QueryGetBondPipelineRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBondPipelineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getEraSnapshot items.
     * </pre>
     */
    public stafihub.ledger.QueryOuterClass.QueryGetEraSnapshotResponse getEraSnapshot(stafihub.ledger.QueryOuterClass.QueryGetEraSnapshotRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEraSnapshotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getSnapshot items.
     * </pre>
     */
    public stafihub.ledger.QueryOuterClass.QueryGetSnapshotResponse getSnapshot(stafihub.ledger.QueryOuterClass.QueryGetSnapshotRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSnapshotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getTotalExpectedActive items.
     * </pre>
     */
    public stafihub.ledger.QueryOuterClass.QueryGetTotalExpectedActiveResponse getTotalExpectedActive(stafihub.ledger.QueryOuterClass.QueryGetTotalExpectedActiveRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTotalExpectedActiveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getBondRecord items.
     * </pre>
     */
    public stafihub.ledger.QueryOuterClass.QueryGetBondRecordResponse getBondRecord(stafihub.ledger.QueryOuterClass.QueryGetBondRecordRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBondRecordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getSignature items.
     * </pre>
     */
    public stafihub.ledger.QueryOuterClass.QueryGetSignatureResponse getSignature(stafihub.ledger.QueryOuterClass.QueryGetSignatureRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSignatureMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of GetRParams items.
     * </pre>
     */
    public stafihub.ledger.QueryOuterClass.QueryGetRParamsResponse getRParams(stafihub.ledger.QueryOuterClass.QueryGetRParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of TotalFeeList items.
     * </pre>
     */
    public stafihub.ledger.QueryOuterClass.QueryTotalProtocolFeeResponse totalProtocolFee(stafihub.ledger.QueryOuterClass.QueryTotalProtocolFeeRequest request) {
      return blockingUnaryCall(
          getChannel(), getTotalProtocolFeeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of RelayFeeReceiver items.
     * </pre>
     */
    public stafihub.ledger.QueryOuterClass.QueryRelayFeeReceiverResponse relayFeeReceiver(stafihub.ledger.QueryOuterClass.QueryRelayFeeReceiverRequest request) {
      return blockingUnaryCall(
          getChannel(), getRelayFeeReceiverMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of UnbondSwitch items.
     * </pre>
     */
    public stafihub.ledger.QueryOuterClass.QueryUnbondSwitchResponse unbondSwitch(stafihub.ledger.QueryOuterClass.QueryUnbondSwitchRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnbondSwitchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of PoolUnbondNextSequence items.
     * </pre>
     */
    public stafihub.ledger.QueryOuterClass.QueryPoolUnbondNextSequenceResponse poolUnbondNextSequence(stafihub.ledger.QueryOuterClass.QueryPoolUnbondNextSequenceRequest request) {
      return blockingUnaryCall(
          getChannel(), getPoolUnbondNextSequenceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of PoolUnbondings items.
     * </pre>
     */
    public stafihub.ledger.QueryOuterClass.QueryPoolUnbondingsResponse poolUnbondings(stafihub.ledger.QueryOuterClass.QueryPoolUnbondingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPoolUnbondingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of IcaPoolList items.
     * </pre>
     */
    public stafihub.ledger.QueryOuterClass.QueryIcaPoolListResponse icaPoolList(stafihub.ledger.QueryOuterClass.QueryIcaPoolListRequest request) {
      return blockingUnaryCall(
          getChannel(), getIcaPoolListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of InterchainTxStatus items.
     * </pre>
     */
    public stafihub.ledger.QueryOuterClass.QueryInterchainTxStatusResponse interchainTxStatus(stafihub.ledger.QueryOuterClass.QueryInterchainTxStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getInterchainTxStatusMethod(), getCallOptions(), request);
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
     * Queries a list of getExchangeRate items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.ledger.QueryOuterClass.QueryGetExchangeRateResponse> getExchangeRate(
        stafihub.ledger.QueryOuterClass.QueryGetExchangeRateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetExchangeRateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of exchangeRateAll items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.ledger.QueryOuterClass.QueryExchangeRateAllResponse> exchangeRateAll(
        stafihub.ledger.QueryOuterClass.QueryExchangeRateAllRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExchangeRateAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getEraExchangeRate items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.ledger.QueryOuterClass.QueryGetEraExchangeRateResponse> getEraExchangeRate(
        stafihub.ledger.QueryOuterClass.QueryGetEraExchangeRateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEraExchangeRateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of eraExchangeRatesByDenom items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.ledger.QueryOuterClass.QueryEraExchangeRatesByDenomResponse> eraExchangeRatesByDenom(
        stafihub.ledger.QueryOuterClass.QueryEraExchangeRatesByDenomRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEraExchangeRatesByDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of bondedPoolsByDenom items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.ledger.QueryOuterClass.QueryBondedPoolsByDenomResponse> bondedPoolsByDenom(
        stafihub.ledger.QueryOuterClass.QueryBondedPoolsByDenomRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBondedPoolsByDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getPoolDetail items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.ledger.QueryOuterClass.QueryGetPoolDetailResponse> getPoolDetail(
        stafihub.ledger.QueryOuterClass.QueryGetPoolDetailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPoolDetailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getChainEra items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.ledger.QueryOuterClass.QueryGetChainEraResponse> getChainEra(
        stafihub.ledger.QueryOuterClass.QueryGetChainEraRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetChainEraMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getCurrentEraSnapshot items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.ledger.QueryOuterClass.QueryGetCurrentEraSnapshotResponse> getCurrentEraSnapshot(
        stafihub.ledger.QueryOuterClass.QueryGetCurrentEraSnapshotRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCurrentEraSnapshotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getReceiver items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.ledger.QueryOuterClass.QueryGetProtocolFeeReceiverResponse> getProtocolFeeReceiver(
        stafihub.ledger.QueryOuterClass.QueryGetProtocolFeeReceiverRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProtocolFeeReceiverMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getCommission items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.ledger.QueryOuterClass.QueryGetStakingRewardCommissionResponse> getStakingRewardCommission(
        stafihub.ledger.QueryOuterClass.QueryGetStakingRewardCommissionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStakingRewardCommissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getUnbondFee items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.ledger.QueryOuterClass.QueryGetUnbondRelayFeeResponse> getUnbondRelayFee(
        stafihub.ledger.QueryOuterClass.QueryGetUnbondRelayFeeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUnbondRelayFeeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getUnbondCommission items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.ledger.QueryOuterClass.QueryGetUnbondCommissionResponse> getUnbondCommission(
        stafihub.ledger.QueryOuterClass.QueryGetUnbondCommissionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUnbondCommissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getEraUnbondLimit items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.ledger.QueryOuterClass.QueryGetEraUnbondLimitResponse> getEraUnbondLimit(
        stafihub.ledger.QueryOuterClass.QueryGetEraUnbondLimitRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEraUnbondLimitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getBondPipeline items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.ledger.QueryOuterClass.QueryGetBondPipelineResponse> getBondPipeline(
        stafihub.ledger.QueryOuterClass.QueryGetBondPipelineRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBondPipelineMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getEraSnapshot items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.ledger.QueryOuterClass.QueryGetEraSnapshotResponse> getEraSnapshot(
        stafihub.ledger.QueryOuterClass.QueryGetEraSnapshotRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEraSnapshotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getSnapshot items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.ledger.QueryOuterClass.QueryGetSnapshotResponse> getSnapshot(
        stafihub.ledger.QueryOuterClass.QueryGetSnapshotRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSnapshotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getTotalExpectedActive items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.ledger.QueryOuterClass.QueryGetTotalExpectedActiveResponse> getTotalExpectedActive(
        stafihub.ledger.QueryOuterClass.QueryGetTotalExpectedActiveRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTotalExpectedActiveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getBondRecord items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.ledger.QueryOuterClass.QueryGetBondRecordResponse> getBondRecord(
        stafihub.ledger.QueryOuterClass.QueryGetBondRecordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBondRecordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getSignature items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.ledger.QueryOuterClass.QueryGetSignatureResponse> getSignature(
        stafihub.ledger.QueryOuterClass.QueryGetSignatureRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSignatureMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of GetRParams items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.ledger.QueryOuterClass.QueryGetRParamsResponse> getRParams(
        stafihub.ledger.QueryOuterClass.QueryGetRParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of TotalFeeList items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.ledger.QueryOuterClass.QueryTotalProtocolFeeResponse> totalProtocolFee(
        stafihub.ledger.QueryOuterClass.QueryTotalProtocolFeeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTotalProtocolFeeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of RelayFeeReceiver items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.ledger.QueryOuterClass.QueryRelayFeeReceiverResponse> relayFeeReceiver(
        stafihub.ledger.QueryOuterClass.QueryRelayFeeReceiverRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRelayFeeReceiverMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of UnbondSwitch items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.ledger.QueryOuterClass.QueryUnbondSwitchResponse> unbondSwitch(
        stafihub.ledger.QueryOuterClass.QueryUnbondSwitchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnbondSwitchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of PoolUnbondNextSequence items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.ledger.QueryOuterClass.QueryPoolUnbondNextSequenceResponse> poolUnbondNextSequence(
        stafihub.ledger.QueryOuterClass.QueryPoolUnbondNextSequenceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPoolUnbondNextSequenceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of PoolUnbondings items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.ledger.QueryOuterClass.QueryPoolUnbondingsResponse> poolUnbondings(
        stafihub.ledger.QueryOuterClass.QueryPoolUnbondingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPoolUnbondingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of IcaPoolList items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.ledger.QueryOuterClass.QueryIcaPoolListResponse> icaPoolList(
        stafihub.ledger.QueryOuterClass.QueryIcaPoolListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getIcaPoolListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of InterchainTxStatus items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.ledger.QueryOuterClass.QueryInterchainTxStatusResponse> interchainTxStatus(
        stafihub.ledger.QueryOuterClass.QueryInterchainTxStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getInterchainTxStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_EXCHANGE_RATE = 0;
  private static final int METHODID_EXCHANGE_RATE_ALL = 1;
  private static final int METHODID_GET_ERA_EXCHANGE_RATE = 2;
  private static final int METHODID_ERA_EXCHANGE_RATES_BY_DENOM = 3;
  private static final int METHODID_BONDED_POOLS_BY_DENOM = 4;
  private static final int METHODID_GET_POOL_DETAIL = 5;
  private static final int METHODID_GET_CHAIN_ERA = 6;
  private static final int METHODID_GET_CURRENT_ERA_SNAPSHOT = 7;
  private static final int METHODID_GET_PROTOCOL_FEE_RECEIVER = 8;
  private static final int METHODID_GET_STAKING_REWARD_COMMISSION = 9;
  private static final int METHODID_GET_UNBOND_RELAY_FEE = 10;
  private static final int METHODID_GET_UNBOND_COMMISSION = 11;
  private static final int METHODID_GET_ERA_UNBOND_LIMIT = 12;
  private static final int METHODID_GET_BOND_PIPELINE = 13;
  private static final int METHODID_GET_ERA_SNAPSHOT = 14;
  private static final int METHODID_GET_SNAPSHOT = 15;
  private static final int METHODID_GET_TOTAL_EXPECTED_ACTIVE = 16;
  private static final int METHODID_GET_BOND_RECORD = 17;
  private static final int METHODID_GET_SIGNATURE = 18;
  private static final int METHODID_GET_RPARAMS = 19;
  private static final int METHODID_TOTAL_PROTOCOL_FEE = 20;
  private static final int METHODID_RELAY_FEE_RECEIVER = 21;
  private static final int METHODID_UNBOND_SWITCH = 22;
  private static final int METHODID_POOL_UNBOND_NEXT_SEQUENCE = 23;
  private static final int METHODID_POOL_UNBONDINGS = 24;
  private static final int METHODID_ICA_POOL_LIST = 25;
  private static final int METHODID_INTERCHAIN_TX_STATUS = 26;

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
        case METHODID_GET_EXCHANGE_RATE:
          serviceImpl.getExchangeRate((stafihub.ledger.QueryOuterClass.QueryGetExchangeRateRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetExchangeRateResponse>) responseObserver);
          break;
        case METHODID_EXCHANGE_RATE_ALL:
          serviceImpl.exchangeRateAll((stafihub.ledger.QueryOuterClass.QueryExchangeRateAllRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryExchangeRateAllResponse>) responseObserver);
          break;
        case METHODID_GET_ERA_EXCHANGE_RATE:
          serviceImpl.getEraExchangeRate((stafihub.ledger.QueryOuterClass.QueryGetEraExchangeRateRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetEraExchangeRateResponse>) responseObserver);
          break;
        case METHODID_ERA_EXCHANGE_RATES_BY_DENOM:
          serviceImpl.eraExchangeRatesByDenom((stafihub.ledger.QueryOuterClass.QueryEraExchangeRatesByDenomRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryEraExchangeRatesByDenomResponse>) responseObserver);
          break;
        case METHODID_BONDED_POOLS_BY_DENOM:
          serviceImpl.bondedPoolsByDenom((stafihub.ledger.QueryOuterClass.QueryBondedPoolsByDenomRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryBondedPoolsByDenomResponse>) responseObserver);
          break;
        case METHODID_GET_POOL_DETAIL:
          serviceImpl.getPoolDetail((stafihub.ledger.QueryOuterClass.QueryGetPoolDetailRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetPoolDetailResponse>) responseObserver);
          break;
        case METHODID_GET_CHAIN_ERA:
          serviceImpl.getChainEra((stafihub.ledger.QueryOuterClass.QueryGetChainEraRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetChainEraResponse>) responseObserver);
          break;
        case METHODID_GET_CURRENT_ERA_SNAPSHOT:
          serviceImpl.getCurrentEraSnapshot((stafihub.ledger.QueryOuterClass.QueryGetCurrentEraSnapshotRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetCurrentEraSnapshotResponse>) responseObserver);
          break;
        case METHODID_GET_PROTOCOL_FEE_RECEIVER:
          serviceImpl.getProtocolFeeReceiver((stafihub.ledger.QueryOuterClass.QueryGetProtocolFeeReceiverRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetProtocolFeeReceiverResponse>) responseObserver);
          break;
        case METHODID_GET_STAKING_REWARD_COMMISSION:
          serviceImpl.getStakingRewardCommission((stafihub.ledger.QueryOuterClass.QueryGetStakingRewardCommissionRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetStakingRewardCommissionResponse>) responseObserver);
          break;
        case METHODID_GET_UNBOND_RELAY_FEE:
          serviceImpl.getUnbondRelayFee((stafihub.ledger.QueryOuterClass.QueryGetUnbondRelayFeeRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetUnbondRelayFeeResponse>) responseObserver);
          break;
        case METHODID_GET_UNBOND_COMMISSION:
          serviceImpl.getUnbondCommission((stafihub.ledger.QueryOuterClass.QueryGetUnbondCommissionRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetUnbondCommissionResponse>) responseObserver);
          break;
        case METHODID_GET_ERA_UNBOND_LIMIT:
          serviceImpl.getEraUnbondLimit((stafihub.ledger.QueryOuterClass.QueryGetEraUnbondLimitRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetEraUnbondLimitResponse>) responseObserver);
          break;
        case METHODID_GET_BOND_PIPELINE:
          serviceImpl.getBondPipeline((stafihub.ledger.QueryOuterClass.QueryGetBondPipelineRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetBondPipelineResponse>) responseObserver);
          break;
        case METHODID_GET_ERA_SNAPSHOT:
          serviceImpl.getEraSnapshot((stafihub.ledger.QueryOuterClass.QueryGetEraSnapshotRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetEraSnapshotResponse>) responseObserver);
          break;
        case METHODID_GET_SNAPSHOT:
          serviceImpl.getSnapshot((stafihub.ledger.QueryOuterClass.QueryGetSnapshotRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetSnapshotResponse>) responseObserver);
          break;
        case METHODID_GET_TOTAL_EXPECTED_ACTIVE:
          serviceImpl.getTotalExpectedActive((stafihub.ledger.QueryOuterClass.QueryGetTotalExpectedActiveRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetTotalExpectedActiveResponse>) responseObserver);
          break;
        case METHODID_GET_BOND_RECORD:
          serviceImpl.getBondRecord((stafihub.ledger.QueryOuterClass.QueryGetBondRecordRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetBondRecordResponse>) responseObserver);
          break;
        case METHODID_GET_SIGNATURE:
          serviceImpl.getSignature((stafihub.ledger.QueryOuterClass.QueryGetSignatureRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetSignatureResponse>) responseObserver);
          break;
        case METHODID_GET_RPARAMS:
          serviceImpl.getRParams((stafihub.ledger.QueryOuterClass.QueryGetRParamsRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryGetRParamsResponse>) responseObserver);
          break;
        case METHODID_TOTAL_PROTOCOL_FEE:
          serviceImpl.totalProtocolFee((stafihub.ledger.QueryOuterClass.QueryTotalProtocolFeeRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryTotalProtocolFeeResponse>) responseObserver);
          break;
        case METHODID_RELAY_FEE_RECEIVER:
          serviceImpl.relayFeeReceiver((stafihub.ledger.QueryOuterClass.QueryRelayFeeReceiverRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryRelayFeeReceiverResponse>) responseObserver);
          break;
        case METHODID_UNBOND_SWITCH:
          serviceImpl.unbondSwitch((stafihub.ledger.QueryOuterClass.QueryUnbondSwitchRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryUnbondSwitchResponse>) responseObserver);
          break;
        case METHODID_POOL_UNBOND_NEXT_SEQUENCE:
          serviceImpl.poolUnbondNextSequence((stafihub.ledger.QueryOuterClass.QueryPoolUnbondNextSequenceRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryPoolUnbondNextSequenceResponse>) responseObserver);
          break;
        case METHODID_POOL_UNBONDINGS:
          serviceImpl.poolUnbondings((stafihub.ledger.QueryOuterClass.QueryPoolUnbondingsRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryPoolUnbondingsResponse>) responseObserver);
          break;
        case METHODID_ICA_POOL_LIST:
          serviceImpl.icaPoolList((stafihub.ledger.QueryOuterClass.QueryIcaPoolListRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryIcaPoolListResponse>) responseObserver);
          break;
        case METHODID_INTERCHAIN_TX_STATUS:
          serviceImpl.interchainTxStatus((stafihub.ledger.QueryOuterClass.QueryInterchainTxStatusRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.ledger.QueryOuterClass.QueryInterchainTxStatusResponse>) responseObserver);
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
      return stafihub.ledger.QueryOuterClass.getDescriptor();
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
              .addMethod(getGetExchangeRateMethod())
              .addMethod(getExchangeRateAllMethod())
              .addMethod(getGetEraExchangeRateMethod())
              .addMethod(getEraExchangeRatesByDenomMethod())
              .addMethod(getBondedPoolsByDenomMethod())
              .addMethod(getGetPoolDetailMethod())
              .addMethod(getGetChainEraMethod())
              .addMethod(getGetCurrentEraSnapshotMethod())
              .addMethod(getGetProtocolFeeReceiverMethod())
              .addMethod(getGetStakingRewardCommissionMethod())
              .addMethod(getGetUnbondRelayFeeMethod())
              .addMethod(getGetUnbondCommissionMethod())
              .addMethod(getGetEraUnbondLimitMethod())
              .addMethod(getGetBondPipelineMethod())
              .addMethod(getGetEraSnapshotMethod())
              .addMethod(getGetSnapshotMethod())
              .addMethod(getGetTotalExpectedActiveMethod())
              .addMethod(getGetBondRecordMethod())
              .addMethod(getGetSignatureMethod())
              .addMethod(getGetRParamsMethod())
              .addMethod(getTotalProtocolFeeMethod())
              .addMethod(getRelayFeeReceiverMethod())
              .addMethod(getUnbondSwitchMethod())
              .addMethod(getPoolUnbondNextSequenceMethod())
              .addMethod(getPoolUnbondingsMethod())
              .addMethod(getIcaPoolListMethod())
              .addMethod(getInterchainTxStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
