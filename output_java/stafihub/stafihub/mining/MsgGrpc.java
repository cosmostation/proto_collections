package stafihub.stafihub.mining;

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
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: stafihub/mining/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "stafihub.stafihub.mining.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgAddStakePool,
      stafihub.stafihub.mining.Tx.MsgAddStakePoolResponse> getAddStakePoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddStakePool",
      requestType = stafihub.stafihub.mining.Tx.MsgAddStakePool.class,
      responseType = stafihub.stafihub.mining.Tx.MsgAddStakePoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgAddStakePool,
      stafihub.stafihub.mining.Tx.MsgAddStakePoolResponse> getAddStakePoolMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgAddStakePool, stafihub.stafihub.mining.Tx.MsgAddStakePoolResponse> getAddStakePoolMethod;
    if ((getAddStakePoolMethod = MsgGrpc.getAddStakePoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddStakePoolMethod = MsgGrpc.getAddStakePoolMethod) == null) {
          MsgGrpc.getAddStakePoolMethod = getAddStakePoolMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.mining.Tx.MsgAddStakePool, stafihub.stafihub.mining.Tx.MsgAddStakePoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddStakePool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgAddStakePool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgAddStakePoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddStakePool"))
              .build();
        }
      }
    }
    return getAddStakePoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgAddStakeItem,
      stafihub.stafihub.mining.Tx.MsgAddStakeItemResponse> getAddStakeItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddStakeItem",
      requestType = stafihub.stafihub.mining.Tx.MsgAddStakeItem.class,
      responseType = stafihub.stafihub.mining.Tx.MsgAddStakeItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgAddStakeItem,
      stafihub.stafihub.mining.Tx.MsgAddStakeItemResponse> getAddStakeItemMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgAddStakeItem, stafihub.stafihub.mining.Tx.MsgAddStakeItemResponse> getAddStakeItemMethod;
    if ((getAddStakeItemMethod = MsgGrpc.getAddStakeItemMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddStakeItemMethod = MsgGrpc.getAddStakeItemMethod) == null) {
          MsgGrpc.getAddStakeItemMethod = getAddStakeItemMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.mining.Tx.MsgAddStakeItem, stafihub.stafihub.mining.Tx.MsgAddStakeItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddStakeItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgAddStakeItem.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgAddStakeItemResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddStakeItem"))
              .build();
        }
      }
    }
    return getAddStakeItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgAddRewardPool,
      stafihub.stafihub.mining.Tx.MsgAddRewardPoolResponse> getAddRewardPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddRewardPool",
      requestType = stafihub.stafihub.mining.Tx.MsgAddRewardPool.class,
      responseType = stafihub.stafihub.mining.Tx.MsgAddRewardPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgAddRewardPool,
      stafihub.stafihub.mining.Tx.MsgAddRewardPoolResponse> getAddRewardPoolMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgAddRewardPool, stafihub.stafihub.mining.Tx.MsgAddRewardPoolResponse> getAddRewardPoolMethod;
    if ((getAddRewardPoolMethod = MsgGrpc.getAddRewardPoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddRewardPoolMethod = MsgGrpc.getAddRewardPoolMethod) == null) {
          MsgGrpc.getAddRewardPoolMethod = getAddRewardPoolMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.mining.Tx.MsgAddRewardPool, stafihub.stafihub.mining.Tx.MsgAddRewardPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddRewardPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgAddRewardPool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgAddRewardPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddRewardPool"))
              .build();
        }
      }
    }
    return getAddRewardPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgStake,
      stafihub.stafihub.mining.Tx.MsgStakeResponse> getStakeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stake",
      requestType = stafihub.stafihub.mining.Tx.MsgStake.class,
      responseType = stafihub.stafihub.mining.Tx.MsgStakeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgStake,
      stafihub.stafihub.mining.Tx.MsgStakeResponse> getStakeMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgStake, stafihub.stafihub.mining.Tx.MsgStakeResponse> getStakeMethod;
    if ((getStakeMethod = MsgGrpc.getStakeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getStakeMethod = MsgGrpc.getStakeMethod) == null) {
          MsgGrpc.getStakeMethod = getStakeMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.mining.Tx.MsgStake, stafihub.stafihub.mining.Tx.MsgStakeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Stake"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgStake.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgStakeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Stake"))
              .build();
        }
      }
    }
    return getStakeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgClaimReward,
      stafihub.stafihub.mining.Tx.MsgClaimRewardResponse> getClaimRewardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimReward",
      requestType = stafihub.stafihub.mining.Tx.MsgClaimReward.class,
      responseType = stafihub.stafihub.mining.Tx.MsgClaimRewardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgClaimReward,
      stafihub.stafihub.mining.Tx.MsgClaimRewardResponse> getClaimRewardMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgClaimReward, stafihub.stafihub.mining.Tx.MsgClaimRewardResponse> getClaimRewardMethod;
    if ((getClaimRewardMethod = MsgGrpc.getClaimRewardMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClaimRewardMethod = MsgGrpc.getClaimRewardMethod) == null) {
          MsgGrpc.getClaimRewardMethod = getClaimRewardMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.mining.Tx.MsgClaimReward, stafihub.stafihub.mining.Tx.MsgClaimRewardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimReward"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgClaimReward.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgClaimRewardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ClaimReward"))
              .build();
        }
      }
    }
    return getClaimRewardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgWithdraw,
      stafihub.stafihub.mining.Tx.MsgWithdrawResponse> getWithdrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Withdraw",
      requestType = stafihub.stafihub.mining.Tx.MsgWithdraw.class,
      responseType = stafihub.stafihub.mining.Tx.MsgWithdrawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgWithdraw,
      stafihub.stafihub.mining.Tx.MsgWithdrawResponse> getWithdrawMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgWithdraw, stafihub.stafihub.mining.Tx.MsgWithdrawResponse> getWithdrawMethod;
    if ((getWithdrawMethod = MsgGrpc.getWithdrawMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawMethod = MsgGrpc.getWithdrawMethod) == null) {
          MsgGrpc.getWithdrawMethod = getWithdrawMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.mining.Tx.MsgWithdraw, stafihub.stafihub.mining.Tx.MsgWithdrawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Withdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgWithdraw.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgWithdrawResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Withdraw"))
              .build();
        }
      }
    }
    return getWithdrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgUpdateStakeItem,
      stafihub.stafihub.mining.Tx.MsgUpdateStakeItemResponse> getUpdateStakeItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateStakeItem",
      requestType = stafihub.stafihub.mining.Tx.MsgUpdateStakeItem.class,
      responseType = stafihub.stafihub.mining.Tx.MsgUpdateStakeItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgUpdateStakeItem,
      stafihub.stafihub.mining.Tx.MsgUpdateStakeItemResponse> getUpdateStakeItemMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgUpdateStakeItem, stafihub.stafihub.mining.Tx.MsgUpdateStakeItemResponse> getUpdateStakeItemMethod;
    if ((getUpdateStakeItemMethod = MsgGrpc.getUpdateStakeItemMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateStakeItemMethod = MsgGrpc.getUpdateStakeItemMethod) == null) {
          MsgGrpc.getUpdateStakeItemMethod = getUpdateStakeItemMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.mining.Tx.MsgUpdateStakeItem, stafihub.stafihub.mining.Tx.MsgUpdateStakeItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateStakeItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgUpdateStakeItem.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgUpdateStakeItemResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateStakeItem"))
              .build();
        }
      }
    }
    return getUpdateStakeItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgAddMiningProvider,
      stafihub.stafihub.mining.Tx.MsgAddMiningProviderResponse> getAddMiningProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddMiningProvider",
      requestType = stafihub.stafihub.mining.Tx.MsgAddMiningProvider.class,
      responseType = stafihub.stafihub.mining.Tx.MsgAddMiningProviderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgAddMiningProvider,
      stafihub.stafihub.mining.Tx.MsgAddMiningProviderResponse> getAddMiningProviderMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgAddMiningProvider, stafihub.stafihub.mining.Tx.MsgAddMiningProviderResponse> getAddMiningProviderMethod;
    if ((getAddMiningProviderMethod = MsgGrpc.getAddMiningProviderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddMiningProviderMethod = MsgGrpc.getAddMiningProviderMethod) == null) {
          MsgGrpc.getAddMiningProviderMethod = getAddMiningProviderMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.mining.Tx.MsgAddMiningProvider, stafihub.stafihub.mining.Tx.MsgAddMiningProviderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddMiningProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgAddMiningProvider.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgAddMiningProviderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddMiningProvider"))
              .build();
        }
      }
    }
    return getAddMiningProviderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgRmMiningProvider,
      stafihub.stafihub.mining.Tx.MsgRmMiningProviderResponse> getRmMiningProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RmMiningProvider",
      requestType = stafihub.stafihub.mining.Tx.MsgRmMiningProvider.class,
      responseType = stafihub.stafihub.mining.Tx.MsgRmMiningProviderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgRmMiningProvider,
      stafihub.stafihub.mining.Tx.MsgRmMiningProviderResponse> getRmMiningProviderMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgRmMiningProvider, stafihub.stafihub.mining.Tx.MsgRmMiningProviderResponse> getRmMiningProviderMethod;
    if ((getRmMiningProviderMethod = MsgGrpc.getRmMiningProviderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRmMiningProviderMethod = MsgGrpc.getRmMiningProviderMethod) == null) {
          MsgGrpc.getRmMiningProviderMethod = getRmMiningProviderMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.mining.Tx.MsgRmMiningProvider, stafihub.stafihub.mining.Tx.MsgRmMiningProviderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RmMiningProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgRmMiningProvider.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgRmMiningProviderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RmMiningProvider"))
              .build();
        }
      }
    }
    return getRmMiningProviderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgAddRewardToken,
      stafihub.stafihub.mining.Tx.MsgAddRewardTokenResponse> getAddRewardTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddRewardToken",
      requestType = stafihub.stafihub.mining.Tx.MsgAddRewardToken.class,
      responseType = stafihub.stafihub.mining.Tx.MsgAddRewardTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgAddRewardToken,
      stafihub.stafihub.mining.Tx.MsgAddRewardTokenResponse> getAddRewardTokenMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgAddRewardToken, stafihub.stafihub.mining.Tx.MsgAddRewardTokenResponse> getAddRewardTokenMethod;
    if ((getAddRewardTokenMethod = MsgGrpc.getAddRewardTokenMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddRewardTokenMethod = MsgGrpc.getAddRewardTokenMethod) == null) {
          MsgGrpc.getAddRewardTokenMethod = getAddRewardTokenMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.mining.Tx.MsgAddRewardToken, stafihub.stafihub.mining.Tx.MsgAddRewardTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddRewardToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgAddRewardToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgAddRewardTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddRewardToken"))
              .build();
        }
      }
    }
    return getAddRewardTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgSetMaxRewardPoolNumber,
      stafihub.stafihub.mining.Tx.MsgSetMaxRewardPoolNumberResponse> getSetMaxRewardPoolNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetMaxRewardPoolNumber",
      requestType = stafihub.stafihub.mining.Tx.MsgSetMaxRewardPoolNumber.class,
      responseType = stafihub.stafihub.mining.Tx.MsgSetMaxRewardPoolNumberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgSetMaxRewardPoolNumber,
      stafihub.stafihub.mining.Tx.MsgSetMaxRewardPoolNumberResponse> getSetMaxRewardPoolNumberMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgSetMaxRewardPoolNumber, stafihub.stafihub.mining.Tx.MsgSetMaxRewardPoolNumberResponse> getSetMaxRewardPoolNumberMethod;
    if ((getSetMaxRewardPoolNumberMethod = MsgGrpc.getSetMaxRewardPoolNumberMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetMaxRewardPoolNumberMethod = MsgGrpc.getSetMaxRewardPoolNumberMethod) == null) {
          MsgGrpc.getSetMaxRewardPoolNumberMethod = getSetMaxRewardPoolNumberMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.mining.Tx.MsgSetMaxRewardPoolNumber, stafihub.stafihub.mining.Tx.MsgSetMaxRewardPoolNumberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetMaxRewardPoolNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgSetMaxRewardPoolNumber.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgSetMaxRewardPoolNumberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetMaxRewardPoolNumber"))
              .build();
        }
      }
    }
    return getSetMaxRewardPoolNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgUpdateRewardPool,
      stafihub.stafihub.mining.Tx.MsgUpdateRewardPoolResponse> getUpdateRewardPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRewardPool",
      requestType = stafihub.stafihub.mining.Tx.MsgUpdateRewardPool.class,
      responseType = stafihub.stafihub.mining.Tx.MsgUpdateRewardPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgUpdateRewardPool,
      stafihub.stafihub.mining.Tx.MsgUpdateRewardPoolResponse> getUpdateRewardPoolMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgUpdateRewardPool, stafihub.stafihub.mining.Tx.MsgUpdateRewardPoolResponse> getUpdateRewardPoolMethod;
    if ((getUpdateRewardPoolMethod = MsgGrpc.getUpdateRewardPoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateRewardPoolMethod = MsgGrpc.getUpdateRewardPoolMethod) == null) {
          MsgGrpc.getUpdateRewardPoolMethod = getUpdateRewardPoolMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.mining.Tx.MsgUpdateRewardPool, stafihub.stafihub.mining.Tx.MsgUpdateRewardPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRewardPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgUpdateRewardPool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgUpdateRewardPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateRewardPool"))
              .build();
        }
      }
    }
    return getUpdateRewardPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgToggleProviderSwitch,
      stafihub.stafihub.mining.Tx.MsgToggleProviderSwitchResponse> getToggleProviderSwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ToggleProviderSwitch",
      requestType = stafihub.stafihub.mining.Tx.MsgToggleProviderSwitch.class,
      responseType = stafihub.stafihub.mining.Tx.MsgToggleProviderSwitchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgToggleProviderSwitch,
      stafihub.stafihub.mining.Tx.MsgToggleProviderSwitchResponse> getToggleProviderSwitchMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgToggleProviderSwitch, stafihub.stafihub.mining.Tx.MsgToggleProviderSwitchResponse> getToggleProviderSwitchMethod;
    if ((getToggleProviderSwitchMethod = MsgGrpc.getToggleProviderSwitchMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getToggleProviderSwitchMethod = MsgGrpc.getToggleProviderSwitchMethod) == null) {
          MsgGrpc.getToggleProviderSwitchMethod = getToggleProviderSwitchMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.mining.Tx.MsgToggleProviderSwitch, stafihub.stafihub.mining.Tx.MsgToggleProviderSwitchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ToggleProviderSwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgToggleProviderSwitch.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgToggleProviderSwitchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ToggleProviderSwitch"))
              .build();
        }
      }
    }
    return getToggleProviderSwitchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgSetMaxStakeItemNumber,
      stafihub.stafihub.mining.Tx.MsgSetMaxStakeItemNumberResponse> getSetMaxStakeItemNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetMaxStakeItemNumber",
      requestType = stafihub.stafihub.mining.Tx.MsgSetMaxStakeItemNumber.class,
      responseType = stafihub.stafihub.mining.Tx.MsgSetMaxStakeItemNumberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgSetMaxStakeItemNumber,
      stafihub.stafihub.mining.Tx.MsgSetMaxStakeItemNumberResponse> getSetMaxStakeItemNumberMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgSetMaxStakeItemNumber, stafihub.stafihub.mining.Tx.MsgSetMaxStakeItemNumberResponse> getSetMaxStakeItemNumberMethod;
    if ((getSetMaxStakeItemNumberMethod = MsgGrpc.getSetMaxStakeItemNumberMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetMaxStakeItemNumberMethod = MsgGrpc.getSetMaxStakeItemNumberMethod) == null) {
          MsgGrpc.getSetMaxStakeItemNumberMethod = getSetMaxStakeItemNumberMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.mining.Tx.MsgSetMaxStakeItemNumber, stafihub.stafihub.mining.Tx.MsgSetMaxStakeItemNumberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetMaxStakeItemNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgSetMaxStakeItemNumber.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgSetMaxStakeItemNumberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetMaxStakeItemNumber"))
              .build();
        }
      }
    }
    return getSetMaxStakeItemNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgAddReward,
      stafihub.stafihub.mining.Tx.MsgAddRewardResponse> getAddRewardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddReward",
      requestType = stafihub.stafihub.mining.Tx.MsgAddReward.class,
      responseType = stafihub.stafihub.mining.Tx.MsgAddRewardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgAddReward,
      stafihub.stafihub.mining.Tx.MsgAddRewardResponse> getAddRewardMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgAddReward, stafihub.stafihub.mining.Tx.MsgAddRewardResponse> getAddRewardMethod;
    if ((getAddRewardMethod = MsgGrpc.getAddRewardMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddRewardMethod = MsgGrpc.getAddRewardMethod) == null) {
          MsgGrpc.getAddRewardMethod = getAddRewardMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.mining.Tx.MsgAddReward, stafihub.stafihub.mining.Tx.MsgAddRewardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddReward"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgAddReward.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgAddRewardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddReward"))
              .build();
        }
      }
    }
    return getAddRewardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgToggleEmergencySwitch,
      stafihub.stafihub.mining.Tx.MsgToggleEmergencySwitchResponse> getToggleEmergencySwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ToggleEmergencySwitch",
      requestType = stafihub.stafihub.mining.Tx.MsgToggleEmergencySwitch.class,
      responseType = stafihub.stafihub.mining.Tx.MsgToggleEmergencySwitchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgToggleEmergencySwitch,
      stafihub.stafihub.mining.Tx.MsgToggleEmergencySwitchResponse> getToggleEmergencySwitchMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgToggleEmergencySwitch, stafihub.stafihub.mining.Tx.MsgToggleEmergencySwitchResponse> getToggleEmergencySwitchMethod;
    if ((getToggleEmergencySwitchMethod = MsgGrpc.getToggleEmergencySwitchMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getToggleEmergencySwitchMethod = MsgGrpc.getToggleEmergencySwitchMethod) == null) {
          MsgGrpc.getToggleEmergencySwitchMethod = getToggleEmergencySwitchMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.mining.Tx.MsgToggleEmergencySwitch, stafihub.stafihub.mining.Tx.MsgToggleEmergencySwitchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ToggleEmergencySwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgToggleEmergencySwitch.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgToggleEmergencySwitchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ToggleEmergencySwitch"))
              .build();
        }
      }
    }
    return getToggleEmergencySwitchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgEmergencyWithdraw,
      stafihub.stafihub.mining.Tx.MsgEmergencyWithdrawResponse> getEmergencyWithdrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EmergencyWithdraw",
      requestType = stafihub.stafihub.mining.Tx.MsgEmergencyWithdraw.class,
      responseType = stafihub.stafihub.mining.Tx.MsgEmergencyWithdrawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgEmergencyWithdraw,
      stafihub.stafihub.mining.Tx.MsgEmergencyWithdrawResponse> getEmergencyWithdrawMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgEmergencyWithdraw, stafihub.stafihub.mining.Tx.MsgEmergencyWithdrawResponse> getEmergencyWithdrawMethod;
    if ((getEmergencyWithdrawMethod = MsgGrpc.getEmergencyWithdrawMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getEmergencyWithdrawMethod = MsgGrpc.getEmergencyWithdrawMethod) == null) {
          MsgGrpc.getEmergencyWithdrawMethod = getEmergencyWithdrawMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.mining.Tx.MsgEmergencyWithdraw, stafihub.stafihub.mining.Tx.MsgEmergencyWithdrawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EmergencyWithdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgEmergencyWithdraw.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgEmergencyWithdrawResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("EmergencyWithdraw"))
              .build();
        }
      }
    }
    return getEmergencyWithdrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgAddStakeToken,
      stafihub.stafihub.mining.Tx.MsgAddStakeTokenResponse> getAddStakeTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddStakeToken",
      requestType = stafihub.stafihub.mining.Tx.MsgAddStakeToken.class,
      responseType = stafihub.stafihub.mining.Tx.MsgAddStakeTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgAddStakeToken,
      stafihub.stafihub.mining.Tx.MsgAddStakeTokenResponse> getAddStakeTokenMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgAddStakeToken, stafihub.stafihub.mining.Tx.MsgAddStakeTokenResponse> getAddStakeTokenMethod;
    if ((getAddStakeTokenMethod = MsgGrpc.getAddStakeTokenMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddStakeTokenMethod = MsgGrpc.getAddStakeTokenMethod) == null) {
          MsgGrpc.getAddStakeTokenMethod = getAddStakeTokenMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.mining.Tx.MsgAddStakeToken, stafihub.stafihub.mining.Tx.MsgAddStakeTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddStakeToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgAddStakeToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgAddStakeTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddStakeToken"))
              .build();
        }
      }
    }
    return getAddStakeTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgRmRewardToken,
      stafihub.stafihub.mining.Tx.MsgRmRewardTokenResponse> getRmRewardTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RmRewardToken",
      requestType = stafihub.stafihub.mining.Tx.MsgRmRewardToken.class,
      responseType = stafihub.stafihub.mining.Tx.MsgRmRewardTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgRmRewardToken,
      stafihub.stafihub.mining.Tx.MsgRmRewardTokenResponse> getRmRewardTokenMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgRmRewardToken, stafihub.stafihub.mining.Tx.MsgRmRewardTokenResponse> getRmRewardTokenMethod;
    if ((getRmRewardTokenMethod = MsgGrpc.getRmRewardTokenMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRmRewardTokenMethod = MsgGrpc.getRmRewardTokenMethod) == null) {
          MsgGrpc.getRmRewardTokenMethod = getRmRewardTokenMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.mining.Tx.MsgRmRewardToken, stafihub.stafihub.mining.Tx.MsgRmRewardTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RmRewardToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgRmRewardToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgRmRewardTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RmRewardToken"))
              .build();
        }
      }
    }
    return getRmRewardTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgRmStakeToken,
      stafihub.stafihub.mining.Tx.MsgRmStakeTokenResponse> getRmStakeTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RmStakeToken",
      requestType = stafihub.stafihub.mining.Tx.MsgRmStakeToken.class,
      responseType = stafihub.stafihub.mining.Tx.MsgRmStakeTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgRmStakeToken,
      stafihub.stafihub.mining.Tx.MsgRmStakeTokenResponse> getRmStakeTokenMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgRmStakeToken, stafihub.stafihub.mining.Tx.MsgRmStakeTokenResponse> getRmStakeTokenMethod;
    if ((getRmStakeTokenMethod = MsgGrpc.getRmStakeTokenMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRmStakeTokenMethod = MsgGrpc.getRmStakeTokenMethod) == null) {
          MsgGrpc.getRmStakeTokenMethod = getRmStakeTokenMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.mining.Tx.MsgRmStakeToken, stafihub.stafihub.mining.Tx.MsgRmStakeTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RmStakeToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgRmStakeToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgRmStakeTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RmStakeToken"))
              .build();
        }
      }
    }
    return getRmStakeTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgSetStakeItemLimit,
      stafihub.stafihub.mining.Tx.MsgSetStakeItemLimitResponse> getSetStakeItemLimitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetStakeItemLimit",
      requestType = stafihub.stafihub.mining.Tx.MsgSetStakeItemLimit.class,
      responseType = stafihub.stafihub.mining.Tx.MsgSetStakeItemLimitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgSetStakeItemLimit,
      stafihub.stafihub.mining.Tx.MsgSetStakeItemLimitResponse> getSetStakeItemLimitMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgSetStakeItemLimit, stafihub.stafihub.mining.Tx.MsgSetStakeItemLimitResponse> getSetStakeItemLimitMethod;
    if ((getSetStakeItemLimitMethod = MsgGrpc.getSetStakeItemLimitMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetStakeItemLimitMethod = MsgGrpc.getSetStakeItemLimitMethod) == null) {
          MsgGrpc.getSetStakeItemLimitMethod = getSetStakeItemLimitMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.mining.Tx.MsgSetStakeItemLimit, stafihub.stafihub.mining.Tx.MsgSetStakeItemLimitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetStakeItemLimit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgSetStakeItemLimit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgSetStakeItemLimitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetStakeItemLimit"))
              .build();
        }
      }
    }
    return getSetStakeItemLimitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgWithdrawRewardToken,
      stafihub.stafihub.mining.Tx.MsgWithdrawRewardTokenResponse> getWithdrawRewardTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawRewardToken",
      requestType = stafihub.stafihub.mining.Tx.MsgWithdrawRewardToken.class,
      responseType = stafihub.stafihub.mining.Tx.MsgWithdrawRewardTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgWithdrawRewardToken,
      stafihub.stafihub.mining.Tx.MsgWithdrawRewardTokenResponse> getWithdrawRewardTokenMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.mining.Tx.MsgWithdrawRewardToken, stafihub.stafihub.mining.Tx.MsgWithdrawRewardTokenResponse> getWithdrawRewardTokenMethod;
    if ((getWithdrawRewardTokenMethod = MsgGrpc.getWithdrawRewardTokenMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawRewardTokenMethod = MsgGrpc.getWithdrawRewardTokenMethod) == null) {
          MsgGrpc.getWithdrawRewardTokenMethod = getWithdrawRewardTokenMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.mining.Tx.MsgWithdrawRewardToken, stafihub.stafihub.mining.Tx.MsgWithdrawRewardTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawRewardToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgWithdrawRewardToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.mining.Tx.MsgWithdrawRewardTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WithdrawRewardToken"))
              .build();
        }
      }
    }
    return getWithdrawRewardTokenMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MsgStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgStub>() {
        @java.lang.Override
        public MsgStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgStub(channel, callOptions);
        }
      };
    return MsgStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MsgBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgBlockingStub>() {
        @java.lang.Override
        public MsgBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgBlockingStub(channel, callOptions);
        }
      };
    return MsgBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MsgFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgFutureStub>() {
        @java.lang.Override
        public MsgFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgFutureStub(channel, callOptions);
        }
      };
    return MsgFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Msg defines the Msg service.
   * </pre>
   */
  public static abstract class MsgImplBase implements io.grpc.BindableService {

    /**
     */
    public void addStakePool(stafihub.stafihub.mining.Tx.MsgAddStakePool request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgAddStakePoolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddStakePoolMethod(), responseObserver);
    }

    /**
     */
    public void addStakeItem(stafihub.stafihub.mining.Tx.MsgAddStakeItem request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgAddStakeItemResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddStakeItemMethod(), responseObserver);
    }

    /**
     */
    public void addRewardPool(stafihub.stafihub.mining.Tx.MsgAddRewardPool request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgAddRewardPoolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddRewardPoolMethod(), responseObserver);
    }

    /**
     */
    public void stake(stafihub.stafihub.mining.Tx.MsgStake request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgStakeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStakeMethod(), responseObserver);
    }

    /**
     */
    public void claimReward(stafihub.stafihub.mining.Tx.MsgClaimReward request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgClaimRewardResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClaimRewardMethod(), responseObserver);
    }

    /**
     */
    public void withdraw(stafihub.stafihub.mining.Tx.MsgWithdraw request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgWithdrawResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWithdrawMethod(), responseObserver);
    }

    /**
     */
    public void updateStakeItem(stafihub.stafihub.mining.Tx.MsgUpdateStakeItem request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgUpdateStakeItemResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateStakeItemMethod(), responseObserver);
    }

    /**
     */
    public void addMiningProvider(stafihub.stafihub.mining.Tx.MsgAddMiningProvider request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgAddMiningProviderResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddMiningProviderMethod(), responseObserver);
    }

    /**
     */
    public void rmMiningProvider(stafihub.stafihub.mining.Tx.MsgRmMiningProvider request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgRmMiningProviderResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRmMiningProviderMethod(), responseObserver);
    }

    /**
     */
    public void addRewardToken(stafihub.stafihub.mining.Tx.MsgAddRewardToken request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgAddRewardTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddRewardTokenMethod(), responseObserver);
    }

    /**
     */
    public void setMaxRewardPoolNumber(stafihub.stafihub.mining.Tx.MsgSetMaxRewardPoolNumber request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgSetMaxRewardPoolNumberResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetMaxRewardPoolNumberMethod(), responseObserver);
    }

    /**
     */
    public void updateRewardPool(stafihub.stafihub.mining.Tx.MsgUpdateRewardPool request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgUpdateRewardPoolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateRewardPoolMethod(), responseObserver);
    }

    /**
     */
    public void toggleProviderSwitch(stafihub.stafihub.mining.Tx.MsgToggleProviderSwitch request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgToggleProviderSwitchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getToggleProviderSwitchMethod(), responseObserver);
    }

    /**
     */
    public void setMaxStakeItemNumber(stafihub.stafihub.mining.Tx.MsgSetMaxStakeItemNumber request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgSetMaxStakeItemNumberResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetMaxStakeItemNumberMethod(), responseObserver);
    }

    /**
     */
    public void addReward(stafihub.stafihub.mining.Tx.MsgAddReward request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgAddRewardResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddRewardMethod(), responseObserver);
    }

    /**
     */
    public void toggleEmergencySwitch(stafihub.stafihub.mining.Tx.MsgToggleEmergencySwitch request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgToggleEmergencySwitchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getToggleEmergencySwitchMethod(), responseObserver);
    }

    /**
     */
    public void emergencyWithdraw(stafihub.stafihub.mining.Tx.MsgEmergencyWithdraw request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgEmergencyWithdrawResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEmergencyWithdrawMethod(), responseObserver);
    }

    /**
     */
    public void addStakeToken(stafihub.stafihub.mining.Tx.MsgAddStakeToken request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgAddStakeTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddStakeTokenMethod(), responseObserver);
    }

    /**
     */
    public void rmRewardToken(stafihub.stafihub.mining.Tx.MsgRmRewardToken request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgRmRewardTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRmRewardTokenMethod(), responseObserver);
    }

    /**
     */
    public void rmStakeToken(stafihub.stafihub.mining.Tx.MsgRmStakeToken request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgRmStakeTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRmStakeTokenMethod(), responseObserver);
    }

    /**
     */
    public void setStakeItemLimit(stafihub.stafihub.mining.Tx.MsgSetStakeItemLimit request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgSetStakeItemLimitResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetStakeItemLimitMethod(), responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void withdrawRewardToken(stafihub.stafihub.mining.Tx.MsgWithdrawRewardToken request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgWithdrawRewardTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWithdrawRewardTokenMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddStakePoolMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.mining.Tx.MsgAddStakePool,
                stafihub.stafihub.mining.Tx.MsgAddStakePoolResponse>(
                  this, METHODID_ADD_STAKE_POOL)))
          .addMethod(
            getAddStakeItemMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.mining.Tx.MsgAddStakeItem,
                stafihub.stafihub.mining.Tx.MsgAddStakeItemResponse>(
                  this, METHODID_ADD_STAKE_ITEM)))
          .addMethod(
            getAddRewardPoolMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.mining.Tx.MsgAddRewardPool,
                stafihub.stafihub.mining.Tx.MsgAddRewardPoolResponse>(
                  this, METHODID_ADD_REWARD_POOL)))
          .addMethod(
            getStakeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.mining.Tx.MsgStake,
                stafihub.stafihub.mining.Tx.MsgStakeResponse>(
                  this, METHODID_STAKE)))
          .addMethod(
            getClaimRewardMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.mining.Tx.MsgClaimReward,
                stafihub.stafihub.mining.Tx.MsgClaimRewardResponse>(
                  this, METHODID_CLAIM_REWARD)))
          .addMethod(
            getWithdrawMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.mining.Tx.MsgWithdraw,
                stafihub.stafihub.mining.Tx.MsgWithdrawResponse>(
                  this, METHODID_WITHDRAW)))
          .addMethod(
            getUpdateStakeItemMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.mining.Tx.MsgUpdateStakeItem,
                stafihub.stafihub.mining.Tx.MsgUpdateStakeItemResponse>(
                  this, METHODID_UPDATE_STAKE_ITEM)))
          .addMethod(
            getAddMiningProviderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.mining.Tx.MsgAddMiningProvider,
                stafihub.stafihub.mining.Tx.MsgAddMiningProviderResponse>(
                  this, METHODID_ADD_MINING_PROVIDER)))
          .addMethod(
            getRmMiningProviderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.mining.Tx.MsgRmMiningProvider,
                stafihub.stafihub.mining.Tx.MsgRmMiningProviderResponse>(
                  this, METHODID_RM_MINING_PROVIDER)))
          .addMethod(
            getAddRewardTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.mining.Tx.MsgAddRewardToken,
                stafihub.stafihub.mining.Tx.MsgAddRewardTokenResponse>(
                  this, METHODID_ADD_REWARD_TOKEN)))
          .addMethod(
            getSetMaxRewardPoolNumberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.mining.Tx.MsgSetMaxRewardPoolNumber,
                stafihub.stafihub.mining.Tx.MsgSetMaxRewardPoolNumberResponse>(
                  this, METHODID_SET_MAX_REWARD_POOL_NUMBER)))
          .addMethod(
            getUpdateRewardPoolMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.mining.Tx.MsgUpdateRewardPool,
                stafihub.stafihub.mining.Tx.MsgUpdateRewardPoolResponse>(
                  this, METHODID_UPDATE_REWARD_POOL)))
          .addMethod(
            getToggleProviderSwitchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.mining.Tx.MsgToggleProviderSwitch,
                stafihub.stafihub.mining.Tx.MsgToggleProviderSwitchResponse>(
                  this, METHODID_TOGGLE_PROVIDER_SWITCH)))
          .addMethod(
            getSetMaxStakeItemNumberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.mining.Tx.MsgSetMaxStakeItemNumber,
                stafihub.stafihub.mining.Tx.MsgSetMaxStakeItemNumberResponse>(
                  this, METHODID_SET_MAX_STAKE_ITEM_NUMBER)))
          .addMethod(
            getAddRewardMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.mining.Tx.MsgAddReward,
                stafihub.stafihub.mining.Tx.MsgAddRewardResponse>(
                  this, METHODID_ADD_REWARD)))
          .addMethod(
            getToggleEmergencySwitchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.mining.Tx.MsgToggleEmergencySwitch,
                stafihub.stafihub.mining.Tx.MsgToggleEmergencySwitchResponse>(
                  this, METHODID_TOGGLE_EMERGENCY_SWITCH)))
          .addMethod(
            getEmergencyWithdrawMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.mining.Tx.MsgEmergencyWithdraw,
                stafihub.stafihub.mining.Tx.MsgEmergencyWithdrawResponse>(
                  this, METHODID_EMERGENCY_WITHDRAW)))
          .addMethod(
            getAddStakeTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.mining.Tx.MsgAddStakeToken,
                stafihub.stafihub.mining.Tx.MsgAddStakeTokenResponse>(
                  this, METHODID_ADD_STAKE_TOKEN)))
          .addMethod(
            getRmRewardTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.mining.Tx.MsgRmRewardToken,
                stafihub.stafihub.mining.Tx.MsgRmRewardTokenResponse>(
                  this, METHODID_RM_REWARD_TOKEN)))
          .addMethod(
            getRmStakeTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.mining.Tx.MsgRmStakeToken,
                stafihub.stafihub.mining.Tx.MsgRmStakeTokenResponse>(
                  this, METHODID_RM_STAKE_TOKEN)))
          .addMethod(
            getSetStakeItemLimitMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.mining.Tx.MsgSetStakeItemLimit,
                stafihub.stafihub.mining.Tx.MsgSetStakeItemLimitResponse>(
                  this, METHODID_SET_STAKE_ITEM_LIMIT)))
          .addMethod(
            getWithdrawRewardTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.mining.Tx.MsgWithdrawRewardToken,
                stafihub.stafihub.mining.Tx.MsgWithdrawRewardTokenResponse>(
                  this, METHODID_WITHDRAW_REWARD_TOKEN)))
          .build();
    }
  }

  /**
   * <pre>
   * Msg defines the Msg service.
   * </pre>
   */
  public static final class MsgStub extends io.grpc.stub.AbstractAsyncStub<MsgStub> {
    private MsgStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgStub(channel, callOptions);
    }

    /**
     */
    public void addStakePool(stafihub.stafihub.mining.Tx.MsgAddStakePool request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgAddStakePoolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddStakePoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addStakeItem(stafihub.stafihub.mining.Tx.MsgAddStakeItem request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgAddStakeItemResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddStakeItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addRewardPool(stafihub.stafihub.mining.Tx.MsgAddRewardPool request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgAddRewardPoolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddRewardPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stake(stafihub.stafihub.mining.Tx.MsgStake request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgStakeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStakeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void claimReward(stafihub.stafihub.mining.Tx.MsgClaimReward request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgClaimRewardResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClaimRewardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void withdraw(stafihub.stafihub.mining.Tx.MsgWithdraw request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgWithdrawResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateStakeItem(stafihub.stafihub.mining.Tx.MsgUpdateStakeItem request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgUpdateStakeItemResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateStakeItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addMiningProvider(stafihub.stafihub.mining.Tx.MsgAddMiningProvider request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgAddMiningProviderResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddMiningProviderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rmMiningProvider(stafihub.stafihub.mining.Tx.MsgRmMiningProvider request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgRmMiningProviderResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRmMiningProviderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addRewardToken(stafihub.stafihub.mining.Tx.MsgAddRewardToken request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgAddRewardTokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddRewardTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setMaxRewardPoolNumber(stafihub.stafihub.mining.Tx.MsgSetMaxRewardPoolNumber request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgSetMaxRewardPoolNumberResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetMaxRewardPoolNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRewardPool(stafihub.stafihub.mining.Tx.MsgUpdateRewardPool request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgUpdateRewardPoolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateRewardPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void toggleProviderSwitch(stafihub.stafihub.mining.Tx.MsgToggleProviderSwitch request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgToggleProviderSwitchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getToggleProviderSwitchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setMaxStakeItemNumber(stafihub.stafihub.mining.Tx.MsgSetMaxStakeItemNumber request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgSetMaxStakeItemNumberResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetMaxStakeItemNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addReward(stafihub.stafihub.mining.Tx.MsgAddReward request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgAddRewardResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddRewardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void toggleEmergencySwitch(stafihub.stafihub.mining.Tx.MsgToggleEmergencySwitch request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgToggleEmergencySwitchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getToggleEmergencySwitchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void emergencyWithdraw(stafihub.stafihub.mining.Tx.MsgEmergencyWithdraw request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgEmergencyWithdrawResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEmergencyWithdrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addStakeToken(stafihub.stafihub.mining.Tx.MsgAddStakeToken request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgAddStakeTokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddStakeTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rmRewardToken(stafihub.stafihub.mining.Tx.MsgRmRewardToken request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgRmRewardTokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRmRewardTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rmStakeToken(stafihub.stafihub.mining.Tx.MsgRmStakeToken request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgRmStakeTokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRmStakeTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setStakeItemLimit(stafihub.stafihub.mining.Tx.MsgSetStakeItemLimit request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgSetStakeItemLimitResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetStakeItemLimitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void withdrawRewardToken(stafihub.stafihub.mining.Tx.MsgWithdrawRewardToken request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgWithdrawRewardTokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWithdrawRewardTokenMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Msg defines the Msg service.
   * </pre>
   */
  public static final class MsgBlockingStub extends io.grpc.stub.AbstractBlockingStub<MsgBlockingStub> {
    private MsgBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgBlockingStub(channel, callOptions);
    }

    /**
     */
    public stafihub.stafihub.mining.Tx.MsgAddStakePoolResponse addStakePool(stafihub.stafihub.mining.Tx.MsgAddStakePool request) {
      return blockingUnaryCall(
          getChannel(), getAddStakePoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.mining.Tx.MsgAddStakeItemResponse addStakeItem(stafihub.stafihub.mining.Tx.MsgAddStakeItem request) {
      return blockingUnaryCall(
          getChannel(), getAddStakeItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.mining.Tx.MsgAddRewardPoolResponse addRewardPool(stafihub.stafihub.mining.Tx.MsgAddRewardPool request) {
      return blockingUnaryCall(
          getChannel(), getAddRewardPoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.mining.Tx.MsgStakeResponse stake(stafihub.stafihub.mining.Tx.MsgStake request) {
      return blockingUnaryCall(
          getChannel(), getStakeMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.mining.Tx.MsgClaimRewardResponse claimReward(stafihub.stafihub.mining.Tx.MsgClaimReward request) {
      return blockingUnaryCall(
          getChannel(), getClaimRewardMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.mining.Tx.MsgWithdrawResponse withdraw(stafihub.stafihub.mining.Tx.MsgWithdraw request) {
      return blockingUnaryCall(
          getChannel(), getWithdrawMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.mining.Tx.MsgUpdateStakeItemResponse updateStakeItem(stafihub.stafihub.mining.Tx.MsgUpdateStakeItem request) {
      return blockingUnaryCall(
          getChannel(), getUpdateStakeItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.mining.Tx.MsgAddMiningProviderResponse addMiningProvider(stafihub.stafihub.mining.Tx.MsgAddMiningProvider request) {
      return blockingUnaryCall(
          getChannel(), getAddMiningProviderMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.mining.Tx.MsgRmMiningProviderResponse rmMiningProvider(stafihub.stafihub.mining.Tx.MsgRmMiningProvider request) {
      return blockingUnaryCall(
          getChannel(), getRmMiningProviderMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.mining.Tx.MsgAddRewardTokenResponse addRewardToken(stafihub.stafihub.mining.Tx.MsgAddRewardToken request) {
      return blockingUnaryCall(
          getChannel(), getAddRewardTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.mining.Tx.MsgSetMaxRewardPoolNumberResponse setMaxRewardPoolNumber(stafihub.stafihub.mining.Tx.MsgSetMaxRewardPoolNumber request) {
      return blockingUnaryCall(
          getChannel(), getSetMaxRewardPoolNumberMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.mining.Tx.MsgUpdateRewardPoolResponse updateRewardPool(stafihub.stafihub.mining.Tx.MsgUpdateRewardPool request) {
      return blockingUnaryCall(
          getChannel(), getUpdateRewardPoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.mining.Tx.MsgToggleProviderSwitchResponse toggleProviderSwitch(stafihub.stafihub.mining.Tx.MsgToggleProviderSwitch request) {
      return blockingUnaryCall(
          getChannel(), getToggleProviderSwitchMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.mining.Tx.MsgSetMaxStakeItemNumberResponse setMaxStakeItemNumber(stafihub.stafihub.mining.Tx.MsgSetMaxStakeItemNumber request) {
      return blockingUnaryCall(
          getChannel(), getSetMaxStakeItemNumberMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.mining.Tx.MsgAddRewardResponse addReward(stafihub.stafihub.mining.Tx.MsgAddReward request) {
      return blockingUnaryCall(
          getChannel(), getAddRewardMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.mining.Tx.MsgToggleEmergencySwitchResponse toggleEmergencySwitch(stafihub.stafihub.mining.Tx.MsgToggleEmergencySwitch request) {
      return blockingUnaryCall(
          getChannel(), getToggleEmergencySwitchMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.mining.Tx.MsgEmergencyWithdrawResponse emergencyWithdraw(stafihub.stafihub.mining.Tx.MsgEmergencyWithdraw request) {
      return blockingUnaryCall(
          getChannel(), getEmergencyWithdrawMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.mining.Tx.MsgAddStakeTokenResponse addStakeToken(stafihub.stafihub.mining.Tx.MsgAddStakeToken request) {
      return blockingUnaryCall(
          getChannel(), getAddStakeTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.mining.Tx.MsgRmRewardTokenResponse rmRewardToken(stafihub.stafihub.mining.Tx.MsgRmRewardToken request) {
      return blockingUnaryCall(
          getChannel(), getRmRewardTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.mining.Tx.MsgRmStakeTokenResponse rmStakeToken(stafihub.stafihub.mining.Tx.MsgRmStakeToken request) {
      return blockingUnaryCall(
          getChannel(), getRmStakeTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.mining.Tx.MsgSetStakeItemLimitResponse setStakeItemLimit(stafihub.stafihub.mining.Tx.MsgSetStakeItemLimit request) {
      return blockingUnaryCall(
          getChannel(), getSetStakeItemLimitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public stafihub.stafihub.mining.Tx.MsgWithdrawRewardTokenResponse withdrawRewardToken(stafihub.stafihub.mining.Tx.MsgWithdrawRewardToken request) {
      return blockingUnaryCall(
          getChannel(), getWithdrawRewardTokenMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Msg defines the Msg service.
   * </pre>
   */
  public static final class MsgFutureStub extends io.grpc.stub.AbstractFutureStub<MsgFutureStub> {
    private MsgFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.mining.Tx.MsgAddStakePoolResponse> addStakePool(
        stafihub.stafihub.mining.Tx.MsgAddStakePool request) {
      return futureUnaryCall(
          getChannel().newCall(getAddStakePoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.mining.Tx.MsgAddStakeItemResponse> addStakeItem(
        stafihub.stafihub.mining.Tx.MsgAddStakeItem request) {
      return futureUnaryCall(
          getChannel().newCall(getAddStakeItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.mining.Tx.MsgAddRewardPoolResponse> addRewardPool(
        stafihub.stafihub.mining.Tx.MsgAddRewardPool request) {
      return futureUnaryCall(
          getChannel().newCall(getAddRewardPoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.mining.Tx.MsgStakeResponse> stake(
        stafihub.stafihub.mining.Tx.MsgStake request) {
      return futureUnaryCall(
          getChannel().newCall(getStakeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.mining.Tx.MsgClaimRewardResponse> claimReward(
        stafihub.stafihub.mining.Tx.MsgClaimReward request) {
      return futureUnaryCall(
          getChannel().newCall(getClaimRewardMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.mining.Tx.MsgWithdrawResponse> withdraw(
        stafihub.stafihub.mining.Tx.MsgWithdraw request) {
      return futureUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.mining.Tx.MsgUpdateStakeItemResponse> updateStakeItem(
        stafihub.stafihub.mining.Tx.MsgUpdateStakeItem request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateStakeItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.mining.Tx.MsgAddMiningProviderResponse> addMiningProvider(
        stafihub.stafihub.mining.Tx.MsgAddMiningProvider request) {
      return futureUnaryCall(
          getChannel().newCall(getAddMiningProviderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.mining.Tx.MsgRmMiningProviderResponse> rmMiningProvider(
        stafihub.stafihub.mining.Tx.MsgRmMiningProvider request) {
      return futureUnaryCall(
          getChannel().newCall(getRmMiningProviderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.mining.Tx.MsgAddRewardTokenResponse> addRewardToken(
        stafihub.stafihub.mining.Tx.MsgAddRewardToken request) {
      return futureUnaryCall(
          getChannel().newCall(getAddRewardTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.mining.Tx.MsgSetMaxRewardPoolNumberResponse> setMaxRewardPoolNumber(
        stafihub.stafihub.mining.Tx.MsgSetMaxRewardPoolNumber request) {
      return futureUnaryCall(
          getChannel().newCall(getSetMaxRewardPoolNumberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.mining.Tx.MsgUpdateRewardPoolResponse> updateRewardPool(
        stafihub.stafihub.mining.Tx.MsgUpdateRewardPool request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateRewardPoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.mining.Tx.MsgToggleProviderSwitchResponse> toggleProviderSwitch(
        stafihub.stafihub.mining.Tx.MsgToggleProviderSwitch request) {
      return futureUnaryCall(
          getChannel().newCall(getToggleProviderSwitchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.mining.Tx.MsgSetMaxStakeItemNumberResponse> setMaxStakeItemNumber(
        stafihub.stafihub.mining.Tx.MsgSetMaxStakeItemNumber request) {
      return futureUnaryCall(
          getChannel().newCall(getSetMaxStakeItemNumberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.mining.Tx.MsgAddRewardResponse> addReward(
        stafihub.stafihub.mining.Tx.MsgAddReward request) {
      return futureUnaryCall(
          getChannel().newCall(getAddRewardMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.mining.Tx.MsgToggleEmergencySwitchResponse> toggleEmergencySwitch(
        stafihub.stafihub.mining.Tx.MsgToggleEmergencySwitch request) {
      return futureUnaryCall(
          getChannel().newCall(getToggleEmergencySwitchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.mining.Tx.MsgEmergencyWithdrawResponse> emergencyWithdraw(
        stafihub.stafihub.mining.Tx.MsgEmergencyWithdraw request) {
      return futureUnaryCall(
          getChannel().newCall(getEmergencyWithdrawMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.mining.Tx.MsgAddStakeTokenResponse> addStakeToken(
        stafihub.stafihub.mining.Tx.MsgAddStakeToken request) {
      return futureUnaryCall(
          getChannel().newCall(getAddStakeTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.mining.Tx.MsgRmRewardTokenResponse> rmRewardToken(
        stafihub.stafihub.mining.Tx.MsgRmRewardToken request) {
      return futureUnaryCall(
          getChannel().newCall(getRmRewardTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.mining.Tx.MsgRmStakeTokenResponse> rmStakeToken(
        stafihub.stafihub.mining.Tx.MsgRmStakeToken request) {
      return futureUnaryCall(
          getChannel().newCall(getRmStakeTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.mining.Tx.MsgSetStakeItemLimitResponse> setStakeItemLimit(
        stafihub.stafihub.mining.Tx.MsgSetStakeItemLimit request) {
      return futureUnaryCall(
          getChannel().newCall(getSetStakeItemLimitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.mining.Tx.MsgWithdrawRewardTokenResponse> withdrawRewardToken(
        stafihub.stafihub.mining.Tx.MsgWithdrawRewardToken request) {
      return futureUnaryCall(
          getChannel().newCall(getWithdrawRewardTokenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_STAKE_POOL = 0;
  private static final int METHODID_ADD_STAKE_ITEM = 1;
  private static final int METHODID_ADD_REWARD_POOL = 2;
  private static final int METHODID_STAKE = 3;
  private static final int METHODID_CLAIM_REWARD = 4;
  private static final int METHODID_WITHDRAW = 5;
  private static final int METHODID_UPDATE_STAKE_ITEM = 6;
  private static final int METHODID_ADD_MINING_PROVIDER = 7;
  private static final int METHODID_RM_MINING_PROVIDER = 8;
  private static final int METHODID_ADD_REWARD_TOKEN = 9;
  private static final int METHODID_SET_MAX_REWARD_POOL_NUMBER = 10;
  private static final int METHODID_UPDATE_REWARD_POOL = 11;
  private static final int METHODID_TOGGLE_PROVIDER_SWITCH = 12;
  private static final int METHODID_SET_MAX_STAKE_ITEM_NUMBER = 13;
  private static final int METHODID_ADD_REWARD = 14;
  private static final int METHODID_TOGGLE_EMERGENCY_SWITCH = 15;
  private static final int METHODID_EMERGENCY_WITHDRAW = 16;
  private static final int METHODID_ADD_STAKE_TOKEN = 17;
  private static final int METHODID_RM_REWARD_TOKEN = 18;
  private static final int METHODID_RM_STAKE_TOKEN = 19;
  private static final int METHODID_SET_STAKE_ITEM_LIMIT = 20;
  private static final int METHODID_WITHDRAW_REWARD_TOKEN = 21;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MsgImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MsgImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_STAKE_POOL:
          serviceImpl.addStakePool((stafihub.stafihub.mining.Tx.MsgAddStakePool) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgAddStakePoolResponse>) responseObserver);
          break;
        case METHODID_ADD_STAKE_ITEM:
          serviceImpl.addStakeItem((stafihub.stafihub.mining.Tx.MsgAddStakeItem) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgAddStakeItemResponse>) responseObserver);
          break;
        case METHODID_ADD_REWARD_POOL:
          serviceImpl.addRewardPool((stafihub.stafihub.mining.Tx.MsgAddRewardPool) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgAddRewardPoolResponse>) responseObserver);
          break;
        case METHODID_STAKE:
          serviceImpl.stake((stafihub.stafihub.mining.Tx.MsgStake) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgStakeResponse>) responseObserver);
          break;
        case METHODID_CLAIM_REWARD:
          serviceImpl.claimReward((stafihub.stafihub.mining.Tx.MsgClaimReward) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgClaimRewardResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW:
          serviceImpl.withdraw((stafihub.stafihub.mining.Tx.MsgWithdraw) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgWithdrawResponse>) responseObserver);
          break;
        case METHODID_UPDATE_STAKE_ITEM:
          serviceImpl.updateStakeItem((stafihub.stafihub.mining.Tx.MsgUpdateStakeItem) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgUpdateStakeItemResponse>) responseObserver);
          break;
        case METHODID_ADD_MINING_PROVIDER:
          serviceImpl.addMiningProvider((stafihub.stafihub.mining.Tx.MsgAddMiningProvider) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgAddMiningProviderResponse>) responseObserver);
          break;
        case METHODID_RM_MINING_PROVIDER:
          serviceImpl.rmMiningProvider((stafihub.stafihub.mining.Tx.MsgRmMiningProvider) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgRmMiningProviderResponse>) responseObserver);
          break;
        case METHODID_ADD_REWARD_TOKEN:
          serviceImpl.addRewardToken((stafihub.stafihub.mining.Tx.MsgAddRewardToken) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgAddRewardTokenResponse>) responseObserver);
          break;
        case METHODID_SET_MAX_REWARD_POOL_NUMBER:
          serviceImpl.setMaxRewardPoolNumber((stafihub.stafihub.mining.Tx.MsgSetMaxRewardPoolNumber) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgSetMaxRewardPoolNumberResponse>) responseObserver);
          break;
        case METHODID_UPDATE_REWARD_POOL:
          serviceImpl.updateRewardPool((stafihub.stafihub.mining.Tx.MsgUpdateRewardPool) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgUpdateRewardPoolResponse>) responseObserver);
          break;
        case METHODID_TOGGLE_PROVIDER_SWITCH:
          serviceImpl.toggleProviderSwitch((stafihub.stafihub.mining.Tx.MsgToggleProviderSwitch) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgToggleProviderSwitchResponse>) responseObserver);
          break;
        case METHODID_SET_MAX_STAKE_ITEM_NUMBER:
          serviceImpl.setMaxStakeItemNumber((stafihub.stafihub.mining.Tx.MsgSetMaxStakeItemNumber) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgSetMaxStakeItemNumberResponse>) responseObserver);
          break;
        case METHODID_ADD_REWARD:
          serviceImpl.addReward((stafihub.stafihub.mining.Tx.MsgAddReward) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgAddRewardResponse>) responseObserver);
          break;
        case METHODID_TOGGLE_EMERGENCY_SWITCH:
          serviceImpl.toggleEmergencySwitch((stafihub.stafihub.mining.Tx.MsgToggleEmergencySwitch) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgToggleEmergencySwitchResponse>) responseObserver);
          break;
        case METHODID_EMERGENCY_WITHDRAW:
          serviceImpl.emergencyWithdraw((stafihub.stafihub.mining.Tx.MsgEmergencyWithdraw) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgEmergencyWithdrawResponse>) responseObserver);
          break;
        case METHODID_ADD_STAKE_TOKEN:
          serviceImpl.addStakeToken((stafihub.stafihub.mining.Tx.MsgAddStakeToken) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgAddStakeTokenResponse>) responseObserver);
          break;
        case METHODID_RM_REWARD_TOKEN:
          serviceImpl.rmRewardToken((stafihub.stafihub.mining.Tx.MsgRmRewardToken) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgRmRewardTokenResponse>) responseObserver);
          break;
        case METHODID_RM_STAKE_TOKEN:
          serviceImpl.rmStakeToken((stafihub.stafihub.mining.Tx.MsgRmStakeToken) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgRmStakeTokenResponse>) responseObserver);
          break;
        case METHODID_SET_STAKE_ITEM_LIMIT:
          serviceImpl.setStakeItemLimit((stafihub.stafihub.mining.Tx.MsgSetStakeItemLimit) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgSetStakeItemLimitResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_REWARD_TOKEN:
          serviceImpl.withdrawRewardToken((stafihub.stafihub.mining.Tx.MsgWithdrawRewardToken) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.mining.Tx.MsgWithdrawRewardTokenResponse>) responseObserver);
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

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return stafihub.stafihub.mining.Tx.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Msg");
    }
  }

  private static final class MsgFileDescriptorSupplier
      extends MsgBaseDescriptorSupplier {
    MsgFileDescriptorSupplier() {}
  }

  private static final class MsgMethodDescriptorSupplier
      extends MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MsgMethodDescriptorSupplier(String methodName) {
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
      synchronized (MsgGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MsgFileDescriptorSupplier())
              .addMethod(getAddStakePoolMethod())
              .addMethod(getAddStakeItemMethod())
              .addMethod(getAddRewardPoolMethod())
              .addMethod(getStakeMethod())
              .addMethod(getClaimRewardMethod())
              .addMethod(getWithdrawMethod())
              .addMethod(getUpdateStakeItemMethod())
              .addMethod(getAddMiningProviderMethod())
              .addMethod(getRmMiningProviderMethod())
              .addMethod(getAddRewardTokenMethod())
              .addMethod(getSetMaxRewardPoolNumberMethod())
              .addMethod(getUpdateRewardPoolMethod())
              .addMethod(getToggleProviderSwitchMethod())
              .addMethod(getSetMaxStakeItemNumberMethod())
              .addMethod(getAddRewardMethod())
              .addMethod(getToggleEmergencySwitchMethod())
              .addMethod(getEmergencyWithdrawMethod())
              .addMethod(getAddStakeTokenMethod())
              .addMethod(getRmRewardTokenMethod())
              .addMethod(getRmStakeTokenMethod())
              .addMethod(getSetStakeItemLimitMethod())
              .addMethod(getWithdrawRewardTokenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
