package stafihub.mining;

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
    comments = "Source: stafihub/mining/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "stafihub.stafihub.mining.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryParamsRequest,
      stafihub.mining.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = stafihub.mining.QueryOuterClass.QueryParamsRequest.class,
      responseType = stafihub.mining.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryParamsRequest,
      stafihub.mining.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryParamsRequest, stafihub.mining.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<stafihub.mining.QueryOuterClass.QueryParamsRequest, stafihub.mining.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.mining.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.mining.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryStakePoolInfoRequest,
      stafihub.mining.QueryOuterClass.QueryStakePoolInfoResponse> getStakePoolInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StakePoolInfo",
      requestType = stafihub.mining.QueryOuterClass.QueryStakePoolInfoRequest.class,
      responseType = stafihub.mining.QueryOuterClass.QueryStakePoolInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryStakePoolInfoRequest,
      stafihub.mining.QueryOuterClass.QueryStakePoolInfoResponse> getStakePoolInfoMethod() {
    io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryStakePoolInfoRequest, stafihub.mining.QueryOuterClass.QueryStakePoolInfoResponse> getStakePoolInfoMethod;
    if ((getStakePoolInfoMethod = QueryGrpc.getStakePoolInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getStakePoolInfoMethod = QueryGrpc.getStakePoolInfoMethod) == null) {
          QueryGrpc.getStakePoolInfoMethod = getStakePoolInfoMethod =
              io.grpc.MethodDescriptor.<stafihub.mining.QueryOuterClass.QueryStakePoolInfoRequest, stafihub.mining.QueryOuterClass.QueryStakePoolInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StakePoolInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.mining.QueryOuterClass.QueryStakePoolInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.mining.QueryOuterClass.QueryStakePoolInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("StakePoolInfo"))
              .build();
        }
      }
    }
    return getStakePoolInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryStakeItemListRequest,
      stafihub.mining.QueryOuterClass.QueryStakeItemListResponse> getStakeItemListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StakeItemList",
      requestType = stafihub.mining.QueryOuterClass.QueryStakeItemListRequest.class,
      responseType = stafihub.mining.QueryOuterClass.QueryStakeItemListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryStakeItemListRequest,
      stafihub.mining.QueryOuterClass.QueryStakeItemListResponse> getStakeItemListMethod() {
    io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryStakeItemListRequest, stafihub.mining.QueryOuterClass.QueryStakeItemListResponse> getStakeItemListMethod;
    if ((getStakeItemListMethod = QueryGrpc.getStakeItemListMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getStakeItemListMethod = QueryGrpc.getStakeItemListMethod) == null) {
          QueryGrpc.getStakeItemListMethod = getStakeItemListMethod =
              io.grpc.MethodDescriptor.<stafihub.mining.QueryOuterClass.QueryStakeItemListRequest, stafihub.mining.QueryOuterClass.QueryStakeItemListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StakeItemList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.mining.QueryOuterClass.QueryStakeItemListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.mining.QueryOuterClass.QueryStakeItemListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("StakeItemList"))
              .build();
        }
      }
    }
    return getStakeItemListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryStakeRewardRequest,
      stafihub.mining.QueryOuterClass.QueryStakeRewardResponse> getStakeRewardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StakeReward",
      requestType = stafihub.mining.QueryOuterClass.QueryStakeRewardRequest.class,
      responseType = stafihub.mining.QueryOuterClass.QueryStakeRewardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryStakeRewardRequest,
      stafihub.mining.QueryOuterClass.QueryStakeRewardResponse> getStakeRewardMethod() {
    io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryStakeRewardRequest, stafihub.mining.QueryOuterClass.QueryStakeRewardResponse> getStakeRewardMethod;
    if ((getStakeRewardMethod = QueryGrpc.getStakeRewardMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getStakeRewardMethod = QueryGrpc.getStakeRewardMethod) == null) {
          QueryGrpc.getStakeRewardMethod = getStakeRewardMethod =
              io.grpc.MethodDescriptor.<stafihub.mining.QueryOuterClass.QueryStakeRewardRequest, stafihub.mining.QueryOuterClass.QueryStakeRewardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StakeReward"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.mining.QueryOuterClass.QueryStakeRewardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.mining.QueryOuterClass.QueryStakeRewardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("StakeReward"))
              .build();
        }
      }
    }
    return getStakeRewardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryStakeRecordCountRequest,
      stafihub.mining.QueryOuterClass.QueryStakeRecordCountResponse> getStakeRecordCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StakeRecordCount",
      requestType = stafihub.mining.QueryOuterClass.QueryStakeRecordCountRequest.class,
      responseType = stafihub.mining.QueryOuterClass.QueryStakeRecordCountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryStakeRecordCountRequest,
      stafihub.mining.QueryOuterClass.QueryStakeRecordCountResponse> getStakeRecordCountMethod() {
    io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryStakeRecordCountRequest, stafihub.mining.QueryOuterClass.QueryStakeRecordCountResponse> getStakeRecordCountMethod;
    if ((getStakeRecordCountMethod = QueryGrpc.getStakeRecordCountMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getStakeRecordCountMethod = QueryGrpc.getStakeRecordCountMethod) == null) {
          QueryGrpc.getStakeRecordCountMethod = getStakeRecordCountMethod =
              io.grpc.MethodDescriptor.<stafihub.mining.QueryOuterClass.QueryStakeRecordCountRequest, stafihub.mining.QueryOuterClass.QueryStakeRecordCountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StakeRecordCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.mining.QueryOuterClass.QueryStakeRecordCountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.mining.QueryOuterClass.QueryStakeRecordCountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("StakeRecordCount"))
              .build();
        }
      }
    }
    return getStakeRecordCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryStakeRecordRequest,
      stafihub.mining.QueryOuterClass.QueryStakeRecordResponse> getStakeRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StakeRecord",
      requestType = stafihub.mining.QueryOuterClass.QueryStakeRecordRequest.class,
      responseType = stafihub.mining.QueryOuterClass.QueryStakeRecordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryStakeRecordRequest,
      stafihub.mining.QueryOuterClass.QueryStakeRecordResponse> getStakeRecordMethod() {
    io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryStakeRecordRequest, stafihub.mining.QueryOuterClass.QueryStakeRecordResponse> getStakeRecordMethod;
    if ((getStakeRecordMethod = QueryGrpc.getStakeRecordMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getStakeRecordMethod = QueryGrpc.getStakeRecordMethod) == null) {
          QueryGrpc.getStakeRecordMethod = getStakeRecordMethod =
              io.grpc.MethodDescriptor.<stafihub.mining.QueryOuterClass.QueryStakeRecordRequest, stafihub.mining.QueryOuterClass.QueryStakeRecordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StakeRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.mining.QueryOuterClass.QueryStakeRecordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.mining.QueryOuterClass.QueryStakeRecordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("StakeRecord"))
              .build();
        }
      }
    }
    return getStakeRecordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryStakeRecordListRequest,
      stafihub.mining.QueryOuterClass.QueryStakeRecordListResponse> getStakeRecordListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StakeRecordList",
      requestType = stafihub.mining.QueryOuterClass.QueryStakeRecordListRequest.class,
      responseType = stafihub.mining.QueryOuterClass.QueryStakeRecordListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryStakeRecordListRequest,
      stafihub.mining.QueryOuterClass.QueryStakeRecordListResponse> getStakeRecordListMethod() {
    io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryStakeRecordListRequest, stafihub.mining.QueryOuterClass.QueryStakeRecordListResponse> getStakeRecordListMethod;
    if ((getStakeRecordListMethod = QueryGrpc.getStakeRecordListMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getStakeRecordListMethod = QueryGrpc.getStakeRecordListMethod) == null) {
          QueryGrpc.getStakeRecordListMethod = getStakeRecordListMethod =
              io.grpc.MethodDescriptor.<stafihub.mining.QueryOuterClass.QueryStakeRecordListRequest, stafihub.mining.QueryOuterClass.QueryStakeRecordListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StakeRecordList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.mining.QueryOuterClass.QueryStakeRecordListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.mining.QueryOuterClass.QueryStakeRecordListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("StakeRecordList"))
              .build();
        }
      }
    }
    return getStakeRecordListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryStakePoolListRequest,
      stafihub.mining.QueryOuterClass.QueryStakePoolListResponse> getStakePoolListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StakePoolList",
      requestType = stafihub.mining.QueryOuterClass.QueryStakePoolListRequest.class,
      responseType = stafihub.mining.QueryOuterClass.QueryStakePoolListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryStakePoolListRequest,
      stafihub.mining.QueryOuterClass.QueryStakePoolListResponse> getStakePoolListMethod() {
    io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryStakePoolListRequest, stafihub.mining.QueryOuterClass.QueryStakePoolListResponse> getStakePoolListMethod;
    if ((getStakePoolListMethod = QueryGrpc.getStakePoolListMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getStakePoolListMethod = QueryGrpc.getStakePoolListMethod) == null) {
          QueryGrpc.getStakePoolListMethod = getStakePoolListMethod =
              io.grpc.MethodDescriptor.<stafihub.mining.QueryOuterClass.QueryStakePoolListRequest, stafihub.mining.QueryOuterClass.QueryStakePoolListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StakePoolList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.mining.QueryOuterClass.QueryStakePoolListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.mining.QueryOuterClass.QueryStakePoolListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("StakePoolList"))
              .build();
        }
      }
    }
    return getStakePoolListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryMiningProviderListRequest,
      stafihub.mining.QueryOuterClass.QueryMiningProviderListResponse> getMiningProviderListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MiningProviderList",
      requestType = stafihub.mining.QueryOuterClass.QueryMiningProviderListRequest.class,
      responseType = stafihub.mining.QueryOuterClass.QueryMiningProviderListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryMiningProviderListRequest,
      stafihub.mining.QueryOuterClass.QueryMiningProviderListResponse> getMiningProviderListMethod() {
    io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryMiningProviderListRequest, stafihub.mining.QueryOuterClass.QueryMiningProviderListResponse> getMiningProviderListMethod;
    if ((getMiningProviderListMethod = QueryGrpc.getMiningProviderListMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMiningProviderListMethod = QueryGrpc.getMiningProviderListMethod) == null) {
          QueryGrpc.getMiningProviderListMethod = getMiningProviderListMethod =
              io.grpc.MethodDescriptor.<stafihub.mining.QueryOuterClass.QueryMiningProviderListRequest, stafihub.mining.QueryOuterClass.QueryMiningProviderListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MiningProviderList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.mining.QueryOuterClass.QueryMiningProviderListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.mining.QueryOuterClass.QueryMiningProviderListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MiningProviderList"))
              .build();
        }
      }
    }
    return getMiningProviderListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryRewardTokenListRequest,
      stafihub.mining.QueryOuterClass.QueryRewardTokenListResponse> getRewardTokenListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RewardTokenList",
      requestType = stafihub.mining.QueryOuterClass.QueryRewardTokenListRequest.class,
      responseType = stafihub.mining.QueryOuterClass.QueryRewardTokenListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryRewardTokenListRequest,
      stafihub.mining.QueryOuterClass.QueryRewardTokenListResponse> getRewardTokenListMethod() {
    io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryRewardTokenListRequest, stafihub.mining.QueryOuterClass.QueryRewardTokenListResponse> getRewardTokenListMethod;
    if ((getRewardTokenListMethod = QueryGrpc.getRewardTokenListMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRewardTokenListMethod = QueryGrpc.getRewardTokenListMethod) == null) {
          QueryGrpc.getRewardTokenListMethod = getRewardTokenListMethod =
              io.grpc.MethodDescriptor.<stafihub.mining.QueryOuterClass.QueryRewardTokenListRequest, stafihub.mining.QueryOuterClass.QueryRewardTokenListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RewardTokenList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.mining.QueryOuterClass.QueryRewardTokenListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.mining.QueryOuterClass.QueryRewardTokenListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RewardTokenList"))
              .build();
        }
      }
    }
    return getRewardTokenListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryMaxRewardPoolNumberRequest,
      stafihub.mining.QueryOuterClass.QueryMaxRewardPoolNumberResponse> getMaxRewardPoolNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MaxRewardPoolNumber",
      requestType = stafihub.mining.QueryOuterClass.QueryMaxRewardPoolNumberRequest.class,
      responseType = stafihub.mining.QueryOuterClass.QueryMaxRewardPoolNumberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryMaxRewardPoolNumberRequest,
      stafihub.mining.QueryOuterClass.QueryMaxRewardPoolNumberResponse> getMaxRewardPoolNumberMethod() {
    io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryMaxRewardPoolNumberRequest, stafihub.mining.QueryOuterClass.QueryMaxRewardPoolNumberResponse> getMaxRewardPoolNumberMethod;
    if ((getMaxRewardPoolNumberMethod = QueryGrpc.getMaxRewardPoolNumberMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMaxRewardPoolNumberMethod = QueryGrpc.getMaxRewardPoolNumberMethod) == null) {
          QueryGrpc.getMaxRewardPoolNumberMethod = getMaxRewardPoolNumberMethod =
              io.grpc.MethodDescriptor.<stafihub.mining.QueryOuterClass.QueryMaxRewardPoolNumberRequest, stafihub.mining.QueryOuterClass.QueryMaxRewardPoolNumberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MaxRewardPoolNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.mining.QueryOuterClass.QueryMaxRewardPoolNumberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.mining.QueryOuterClass.QueryMaxRewardPoolNumberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MaxRewardPoolNumber"))
              .build();
        }
      }
    }
    return getMaxRewardPoolNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryMaxStakeItemNumberRequest,
      stafihub.mining.QueryOuterClass.QueryMaxStakeItemNumberResponse> getMaxStakeItemNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MaxStakeItemNumber",
      requestType = stafihub.mining.QueryOuterClass.QueryMaxStakeItemNumberRequest.class,
      responseType = stafihub.mining.QueryOuterClass.QueryMaxStakeItemNumberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryMaxStakeItemNumberRequest,
      stafihub.mining.QueryOuterClass.QueryMaxStakeItemNumberResponse> getMaxStakeItemNumberMethod() {
    io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryMaxStakeItemNumberRequest, stafihub.mining.QueryOuterClass.QueryMaxStakeItemNumberResponse> getMaxStakeItemNumberMethod;
    if ((getMaxStakeItemNumberMethod = QueryGrpc.getMaxStakeItemNumberMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMaxStakeItemNumberMethod = QueryGrpc.getMaxStakeItemNumberMethod) == null) {
          QueryGrpc.getMaxStakeItemNumberMethod = getMaxStakeItemNumberMethod =
              io.grpc.MethodDescriptor.<stafihub.mining.QueryOuterClass.QueryMaxStakeItemNumberRequest, stafihub.mining.QueryOuterClass.QueryMaxStakeItemNumberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MaxStakeItemNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.mining.QueryOuterClass.QueryMaxStakeItemNumberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.mining.QueryOuterClass.QueryMaxStakeItemNumberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MaxStakeItemNumber"))
              .build();
        }
      }
    }
    return getMaxStakeItemNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryProviderSwitchRequest,
      stafihub.mining.QueryOuterClass.QueryProviderSwitchResponse> getProviderSwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProviderSwitch",
      requestType = stafihub.mining.QueryOuterClass.QueryProviderSwitchRequest.class,
      responseType = stafihub.mining.QueryOuterClass.QueryProviderSwitchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryProviderSwitchRequest,
      stafihub.mining.QueryOuterClass.QueryProviderSwitchResponse> getProviderSwitchMethod() {
    io.grpc.MethodDescriptor<stafihub.mining.QueryOuterClass.QueryProviderSwitchRequest, stafihub.mining.QueryOuterClass.QueryProviderSwitchResponse> getProviderSwitchMethod;
    if ((getProviderSwitchMethod = QueryGrpc.getProviderSwitchMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getProviderSwitchMethod = QueryGrpc.getProviderSwitchMethod) == null) {
          QueryGrpc.getProviderSwitchMethod = getProviderSwitchMethod =
              io.grpc.MethodDescriptor.<stafihub.mining.QueryOuterClass.QueryProviderSwitchRequest, stafihub.mining.QueryOuterClass.QueryProviderSwitchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProviderSwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.mining.QueryOuterClass.QueryProviderSwitchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.mining.QueryOuterClass.QueryProviderSwitchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ProviderSwitch"))
              .build();
        }
      }
    }
    return getProviderSwitchMethod;
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
    public void params(stafihub.mining.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of StakePoolInfo items.
     * </pre>
     */
    public void stakePoolInfo(stafihub.mining.QueryOuterClass.QueryStakePoolInfoRequest request,
        io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryStakePoolInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStakePoolInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of StakeItemList items.
     * </pre>
     */
    public void stakeItemList(stafihub.mining.QueryOuterClass.QueryStakeItemListRequest request,
        io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryStakeItemListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStakeItemListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of StakeReward items.
     * </pre>
     */
    public void stakeReward(stafihub.mining.QueryOuterClass.QueryStakeRewardRequest request,
        io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryStakeRewardResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStakeRewardMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of StakeRecordCount items.
     * </pre>
     */
    public void stakeRecordCount(stafihub.mining.QueryOuterClass.QueryStakeRecordCountRequest request,
        io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryStakeRecordCountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStakeRecordCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of StakeRecord items.
     * </pre>
     */
    public void stakeRecord(stafihub.mining.QueryOuterClass.QueryStakeRecordRequest request,
        io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryStakeRecordResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStakeRecordMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of StakeRecordList items.
     * </pre>
     */
    public void stakeRecordList(stafihub.mining.QueryOuterClass.QueryStakeRecordListRequest request,
        io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryStakeRecordListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStakeRecordListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of StakePoolList items.
     * </pre>
     */
    public void stakePoolList(stafihub.mining.QueryOuterClass.QueryStakePoolListRequest request,
        io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryStakePoolListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStakePoolListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of MiningProviderList items.
     * </pre>
     */
    public void miningProviderList(stafihub.mining.QueryOuterClass.QueryMiningProviderListRequest request,
        io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryMiningProviderListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMiningProviderListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of RewardTokenList items.
     * </pre>
     */
    public void rewardTokenList(stafihub.mining.QueryOuterClass.QueryRewardTokenListRequest request,
        io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryRewardTokenListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRewardTokenListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of MaxRewardPoolNumber items.
     * </pre>
     */
    public void maxRewardPoolNumber(stafihub.mining.QueryOuterClass.QueryMaxRewardPoolNumberRequest request,
        io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryMaxRewardPoolNumberResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMaxRewardPoolNumberMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of MaxStakeItemNumber items.
     * </pre>
     */
    public void maxStakeItemNumber(stafihub.mining.QueryOuterClass.QueryMaxStakeItemNumberRequest request,
        io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryMaxStakeItemNumberResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMaxStakeItemNumberMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ProviderSwitch items.
     * </pre>
     */
    public void providerSwitch(stafihub.mining.QueryOuterClass.QueryProviderSwitchRequest request,
        io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryProviderSwitchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getProviderSwitchMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.mining.QueryOuterClass.QueryParamsRequest,
                stafihub.mining.QueryOuterClass.QueryParamsResponse>(
                  this, METHODID_PARAMS)))
          .addMethod(
            getStakePoolInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.mining.QueryOuterClass.QueryStakePoolInfoRequest,
                stafihub.mining.QueryOuterClass.QueryStakePoolInfoResponse>(
                  this, METHODID_STAKE_POOL_INFO)))
          .addMethod(
            getStakeItemListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.mining.QueryOuterClass.QueryStakeItemListRequest,
                stafihub.mining.QueryOuterClass.QueryStakeItemListResponse>(
                  this, METHODID_STAKE_ITEM_LIST)))
          .addMethod(
            getStakeRewardMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.mining.QueryOuterClass.QueryStakeRewardRequest,
                stafihub.mining.QueryOuterClass.QueryStakeRewardResponse>(
                  this, METHODID_STAKE_REWARD)))
          .addMethod(
            getStakeRecordCountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.mining.QueryOuterClass.QueryStakeRecordCountRequest,
                stafihub.mining.QueryOuterClass.QueryStakeRecordCountResponse>(
                  this, METHODID_STAKE_RECORD_COUNT)))
          .addMethod(
            getStakeRecordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.mining.QueryOuterClass.QueryStakeRecordRequest,
                stafihub.mining.QueryOuterClass.QueryStakeRecordResponse>(
                  this, METHODID_STAKE_RECORD)))
          .addMethod(
            getStakeRecordListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.mining.QueryOuterClass.QueryStakeRecordListRequest,
                stafihub.mining.QueryOuterClass.QueryStakeRecordListResponse>(
                  this, METHODID_STAKE_RECORD_LIST)))
          .addMethod(
            getStakePoolListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.mining.QueryOuterClass.QueryStakePoolListRequest,
                stafihub.mining.QueryOuterClass.QueryStakePoolListResponse>(
                  this, METHODID_STAKE_POOL_LIST)))
          .addMethod(
            getMiningProviderListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.mining.QueryOuterClass.QueryMiningProviderListRequest,
                stafihub.mining.QueryOuterClass.QueryMiningProviderListResponse>(
                  this, METHODID_MINING_PROVIDER_LIST)))
          .addMethod(
            getRewardTokenListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.mining.QueryOuterClass.QueryRewardTokenListRequest,
                stafihub.mining.QueryOuterClass.QueryRewardTokenListResponse>(
                  this, METHODID_REWARD_TOKEN_LIST)))
          .addMethod(
            getMaxRewardPoolNumberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.mining.QueryOuterClass.QueryMaxRewardPoolNumberRequest,
                stafihub.mining.QueryOuterClass.QueryMaxRewardPoolNumberResponse>(
                  this, METHODID_MAX_REWARD_POOL_NUMBER)))
          .addMethod(
            getMaxStakeItemNumberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.mining.QueryOuterClass.QueryMaxStakeItemNumberRequest,
                stafihub.mining.QueryOuterClass.QueryMaxStakeItemNumberResponse>(
                  this, METHODID_MAX_STAKE_ITEM_NUMBER)))
          .addMethod(
            getProviderSwitchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.mining.QueryOuterClass.QueryProviderSwitchRequest,
                stafihub.mining.QueryOuterClass.QueryProviderSwitchResponse>(
                  this, METHODID_PROVIDER_SWITCH)))
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
    public void params(stafihub.mining.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of StakePoolInfo items.
     * </pre>
     */
    public void stakePoolInfo(stafihub.mining.QueryOuterClass.QueryStakePoolInfoRequest request,
        io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryStakePoolInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStakePoolInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of StakeItemList items.
     * </pre>
     */
    public void stakeItemList(stafihub.mining.QueryOuterClass.QueryStakeItemListRequest request,
        io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryStakeItemListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStakeItemListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of StakeReward items.
     * </pre>
     */
    public void stakeReward(stafihub.mining.QueryOuterClass.QueryStakeRewardRequest request,
        io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryStakeRewardResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStakeRewardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of StakeRecordCount items.
     * </pre>
     */
    public void stakeRecordCount(stafihub.mining.QueryOuterClass.QueryStakeRecordCountRequest request,
        io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryStakeRecordCountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStakeRecordCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of StakeRecord items.
     * </pre>
     */
    public void stakeRecord(stafihub.mining.QueryOuterClass.QueryStakeRecordRequest request,
        io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryStakeRecordResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStakeRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of StakeRecordList items.
     * </pre>
     */
    public void stakeRecordList(stafihub.mining.QueryOuterClass.QueryStakeRecordListRequest request,
        io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryStakeRecordListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStakeRecordListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of StakePoolList items.
     * </pre>
     */
    public void stakePoolList(stafihub.mining.QueryOuterClass.QueryStakePoolListRequest request,
        io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryStakePoolListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStakePoolListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of MiningProviderList items.
     * </pre>
     */
    public void miningProviderList(stafihub.mining.QueryOuterClass.QueryMiningProviderListRequest request,
        io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryMiningProviderListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMiningProviderListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of RewardTokenList items.
     * </pre>
     */
    public void rewardTokenList(stafihub.mining.QueryOuterClass.QueryRewardTokenListRequest request,
        io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryRewardTokenListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRewardTokenListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of MaxRewardPoolNumber items.
     * </pre>
     */
    public void maxRewardPoolNumber(stafihub.mining.QueryOuterClass.QueryMaxRewardPoolNumberRequest request,
        io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryMaxRewardPoolNumberResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMaxRewardPoolNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of MaxStakeItemNumber items.
     * </pre>
     */
    public void maxStakeItemNumber(stafihub.mining.QueryOuterClass.QueryMaxStakeItemNumberRequest request,
        io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryMaxStakeItemNumberResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMaxStakeItemNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ProviderSwitch items.
     * </pre>
     */
    public void providerSwitch(stafihub.mining.QueryOuterClass.QueryProviderSwitchRequest request,
        io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryProviderSwitchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProviderSwitchMethod(), getCallOptions()), request, responseObserver);
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
    public stafihub.mining.QueryOuterClass.QueryParamsResponse params(stafihub.mining.QueryOuterClass.QueryParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of StakePoolInfo items.
     * </pre>
     */
    public stafihub.mining.QueryOuterClass.QueryStakePoolInfoResponse stakePoolInfo(stafihub.mining.QueryOuterClass.QueryStakePoolInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getStakePoolInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of StakeItemList items.
     * </pre>
     */
    public stafihub.mining.QueryOuterClass.QueryStakeItemListResponse stakeItemList(stafihub.mining.QueryOuterClass.QueryStakeItemListRequest request) {
      return blockingUnaryCall(
          getChannel(), getStakeItemListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of StakeReward items.
     * </pre>
     */
    public stafihub.mining.QueryOuterClass.QueryStakeRewardResponse stakeReward(stafihub.mining.QueryOuterClass.QueryStakeRewardRequest request) {
      return blockingUnaryCall(
          getChannel(), getStakeRewardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of StakeRecordCount items.
     * </pre>
     */
    public stafihub.mining.QueryOuterClass.QueryStakeRecordCountResponse stakeRecordCount(stafihub.mining.QueryOuterClass.QueryStakeRecordCountRequest request) {
      return blockingUnaryCall(
          getChannel(), getStakeRecordCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of StakeRecord items.
     * </pre>
     */
    public stafihub.mining.QueryOuterClass.QueryStakeRecordResponse stakeRecord(stafihub.mining.QueryOuterClass.QueryStakeRecordRequest request) {
      return blockingUnaryCall(
          getChannel(), getStakeRecordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of StakeRecordList items.
     * </pre>
     */
    public stafihub.mining.QueryOuterClass.QueryStakeRecordListResponse stakeRecordList(stafihub.mining.QueryOuterClass.QueryStakeRecordListRequest request) {
      return blockingUnaryCall(
          getChannel(), getStakeRecordListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of StakePoolList items.
     * </pre>
     */
    public stafihub.mining.QueryOuterClass.QueryStakePoolListResponse stakePoolList(stafihub.mining.QueryOuterClass.QueryStakePoolListRequest request) {
      return blockingUnaryCall(
          getChannel(), getStakePoolListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of MiningProviderList items.
     * </pre>
     */
    public stafihub.mining.QueryOuterClass.QueryMiningProviderListResponse miningProviderList(stafihub.mining.QueryOuterClass.QueryMiningProviderListRequest request) {
      return blockingUnaryCall(
          getChannel(), getMiningProviderListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of RewardTokenList items.
     * </pre>
     */
    public stafihub.mining.QueryOuterClass.QueryRewardTokenListResponse rewardTokenList(stafihub.mining.QueryOuterClass.QueryRewardTokenListRequest request) {
      return blockingUnaryCall(
          getChannel(), getRewardTokenListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of MaxRewardPoolNumber items.
     * </pre>
     */
    public stafihub.mining.QueryOuterClass.QueryMaxRewardPoolNumberResponse maxRewardPoolNumber(stafihub.mining.QueryOuterClass.QueryMaxRewardPoolNumberRequest request) {
      return blockingUnaryCall(
          getChannel(), getMaxRewardPoolNumberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of MaxStakeItemNumber items.
     * </pre>
     */
    public stafihub.mining.QueryOuterClass.QueryMaxStakeItemNumberResponse maxStakeItemNumber(stafihub.mining.QueryOuterClass.QueryMaxStakeItemNumberRequest request) {
      return blockingUnaryCall(
          getChannel(), getMaxStakeItemNumberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of ProviderSwitch items.
     * </pre>
     */
    public stafihub.mining.QueryOuterClass.QueryProviderSwitchResponse providerSwitch(stafihub.mining.QueryOuterClass.QueryProviderSwitchRequest request) {
      return blockingUnaryCall(
          getChannel(), getProviderSwitchMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<stafihub.mining.QueryOuterClass.QueryParamsResponse> params(
        stafihub.mining.QueryOuterClass.QueryParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of StakePoolInfo items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.mining.QueryOuterClass.QueryStakePoolInfoResponse> stakePoolInfo(
        stafihub.mining.QueryOuterClass.QueryStakePoolInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStakePoolInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of StakeItemList items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.mining.QueryOuterClass.QueryStakeItemListResponse> stakeItemList(
        stafihub.mining.QueryOuterClass.QueryStakeItemListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStakeItemListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of StakeReward items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.mining.QueryOuterClass.QueryStakeRewardResponse> stakeReward(
        stafihub.mining.QueryOuterClass.QueryStakeRewardRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStakeRewardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of StakeRecordCount items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.mining.QueryOuterClass.QueryStakeRecordCountResponse> stakeRecordCount(
        stafihub.mining.QueryOuterClass.QueryStakeRecordCountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStakeRecordCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of StakeRecord items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.mining.QueryOuterClass.QueryStakeRecordResponse> stakeRecord(
        stafihub.mining.QueryOuterClass.QueryStakeRecordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStakeRecordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of StakeRecordList items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.mining.QueryOuterClass.QueryStakeRecordListResponse> stakeRecordList(
        stafihub.mining.QueryOuterClass.QueryStakeRecordListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStakeRecordListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of StakePoolList items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.mining.QueryOuterClass.QueryStakePoolListResponse> stakePoolList(
        stafihub.mining.QueryOuterClass.QueryStakePoolListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStakePoolListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of MiningProviderList items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.mining.QueryOuterClass.QueryMiningProviderListResponse> miningProviderList(
        stafihub.mining.QueryOuterClass.QueryMiningProviderListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMiningProviderListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of RewardTokenList items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.mining.QueryOuterClass.QueryRewardTokenListResponse> rewardTokenList(
        stafihub.mining.QueryOuterClass.QueryRewardTokenListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRewardTokenListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of MaxRewardPoolNumber items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.mining.QueryOuterClass.QueryMaxRewardPoolNumberResponse> maxRewardPoolNumber(
        stafihub.mining.QueryOuterClass.QueryMaxRewardPoolNumberRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMaxRewardPoolNumberMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of MaxStakeItemNumber items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.mining.QueryOuterClass.QueryMaxStakeItemNumberResponse> maxStakeItemNumber(
        stafihub.mining.QueryOuterClass.QueryMaxStakeItemNumberRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMaxStakeItemNumberMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of ProviderSwitch items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.mining.QueryOuterClass.QueryProviderSwitchResponse> providerSwitch(
        stafihub.mining.QueryOuterClass.QueryProviderSwitchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getProviderSwitchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_STAKE_POOL_INFO = 1;
  private static final int METHODID_STAKE_ITEM_LIST = 2;
  private static final int METHODID_STAKE_REWARD = 3;
  private static final int METHODID_STAKE_RECORD_COUNT = 4;
  private static final int METHODID_STAKE_RECORD = 5;
  private static final int METHODID_STAKE_RECORD_LIST = 6;
  private static final int METHODID_STAKE_POOL_LIST = 7;
  private static final int METHODID_MINING_PROVIDER_LIST = 8;
  private static final int METHODID_REWARD_TOKEN_LIST = 9;
  private static final int METHODID_MAX_REWARD_POOL_NUMBER = 10;
  private static final int METHODID_MAX_STAKE_ITEM_NUMBER = 11;
  private static final int METHODID_PROVIDER_SWITCH = 12;

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
          serviceImpl.params((stafihub.mining.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_STAKE_POOL_INFO:
          serviceImpl.stakePoolInfo((stafihub.mining.QueryOuterClass.QueryStakePoolInfoRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryStakePoolInfoResponse>) responseObserver);
          break;
        case METHODID_STAKE_ITEM_LIST:
          serviceImpl.stakeItemList((stafihub.mining.QueryOuterClass.QueryStakeItemListRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryStakeItemListResponse>) responseObserver);
          break;
        case METHODID_STAKE_REWARD:
          serviceImpl.stakeReward((stafihub.mining.QueryOuterClass.QueryStakeRewardRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryStakeRewardResponse>) responseObserver);
          break;
        case METHODID_STAKE_RECORD_COUNT:
          serviceImpl.stakeRecordCount((stafihub.mining.QueryOuterClass.QueryStakeRecordCountRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryStakeRecordCountResponse>) responseObserver);
          break;
        case METHODID_STAKE_RECORD:
          serviceImpl.stakeRecord((stafihub.mining.QueryOuterClass.QueryStakeRecordRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryStakeRecordResponse>) responseObserver);
          break;
        case METHODID_STAKE_RECORD_LIST:
          serviceImpl.stakeRecordList((stafihub.mining.QueryOuterClass.QueryStakeRecordListRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryStakeRecordListResponse>) responseObserver);
          break;
        case METHODID_STAKE_POOL_LIST:
          serviceImpl.stakePoolList((stafihub.mining.QueryOuterClass.QueryStakePoolListRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryStakePoolListResponse>) responseObserver);
          break;
        case METHODID_MINING_PROVIDER_LIST:
          serviceImpl.miningProviderList((stafihub.mining.QueryOuterClass.QueryMiningProviderListRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryMiningProviderListResponse>) responseObserver);
          break;
        case METHODID_REWARD_TOKEN_LIST:
          serviceImpl.rewardTokenList((stafihub.mining.QueryOuterClass.QueryRewardTokenListRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryRewardTokenListResponse>) responseObserver);
          break;
        case METHODID_MAX_REWARD_POOL_NUMBER:
          serviceImpl.maxRewardPoolNumber((stafihub.mining.QueryOuterClass.QueryMaxRewardPoolNumberRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryMaxRewardPoolNumberResponse>) responseObserver);
          break;
        case METHODID_MAX_STAKE_ITEM_NUMBER:
          serviceImpl.maxStakeItemNumber((stafihub.mining.QueryOuterClass.QueryMaxStakeItemNumberRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryMaxStakeItemNumberResponse>) responseObserver);
          break;
        case METHODID_PROVIDER_SWITCH:
          serviceImpl.providerSwitch((stafihub.mining.QueryOuterClass.QueryProviderSwitchRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.mining.QueryOuterClass.QueryProviderSwitchResponse>) responseObserver);
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
      return stafihub.mining.QueryOuterClass.getDescriptor();
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
              .addMethod(getStakePoolInfoMethod())
              .addMethod(getStakeItemListMethod())
              .addMethod(getStakeRewardMethod())
              .addMethod(getStakeRecordCountMethod())
              .addMethod(getStakeRecordMethod())
              .addMethod(getStakeRecordListMethod())
              .addMethod(getStakePoolListMethod())
              .addMethod(getMiningProviderListMethod())
              .addMethod(getRewardTokenListMethod())
              .addMethod(getMaxRewardPoolNumberMethod())
              .addMethod(getMaxStakeItemNumberMethod())
              .addMethod(getProviderSwitchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
