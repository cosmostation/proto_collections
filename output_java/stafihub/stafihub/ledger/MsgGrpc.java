package stafihub.stafihub.ledger;

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
    comments = "Source: stafihub/ledger/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "stafihub.stafihub.ledger.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetEraUnbondLimit,
      stafihub.stafihub.ledger.Tx.MsgSetEraUnbondLimitResponse> getSetEraUnbondLimitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetEraUnbondLimit",
      requestType = stafihub.stafihub.ledger.Tx.MsgSetEraUnbondLimit.class,
      responseType = stafihub.stafihub.ledger.Tx.MsgSetEraUnbondLimitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetEraUnbondLimit,
      stafihub.stafihub.ledger.Tx.MsgSetEraUnbondLimitResponse> getSetEraUnbondLimitMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetEraUnbondLimit, stafihub.stafihub.ledger.Tx.MsgSetEraUnbondLimitResponse> getSetEraUnbondLimitMethod;
    if ((getSetEraUnbondLimitMethod = MsgGrpc.getSetEraUnbondLimitMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetEraUnbondLimitMethod = MsgGrpc.getSetEraUnbondLimitMethod) == null) {
          MsgGrpc.getSetEraUnbondLimitMethod = getSetEraUnbondLimitMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.ledger.Tx.MsgSetEraUnbondLimit, stafihub.stafihub.ledger.Tx.MsgSetEraUnbondLimitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetEraUnbondLimit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgSetEraUnbondLimit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgSetEraUnbondLimitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetEraUnbondLimit"))
              .build();
        }
      }
    }
    return getSetEraUnbondLimitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetPoolDetail,
      stafihub.stafihub.ledger.Tx.MsgSetPoolDetailResponse> getSetPoolDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetPoolDetail",
      requestType = stafihub.stafihub.ledger.Tx.MsgSetPoolDetail.class,
      responseType = stafihub.stafihub.ledger.Tx.MsgSetPoolDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetPoolDetail,
      stafihub.stafihub.ledger.Tx.MsgSetPoolDetailResponse> getSetPoolDetailMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetPoolDetail, stafihub.stafihub.ledger.Tx.MsgSetPoolDetailResponse> getSetPoolDetailMethod;
    if ((getSetPoolDetailMethod = MsgGrpc.getSetPoolDetailMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetPoolDetailMethod = MsgGrpc.getSetPoolDetailMethod) == null) {
          MsgGrpc.getSetPoolDetailMethod = getSetPoolDetailMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.ledger.Tx.MsgSetPoolDetail, stafihub.stafihub.ledger.Tx.MsgSetPoolDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPoolDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgSetPoolDetail.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgSetPoolDetailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetPoolDetail"))
              .build();
        }
      }
    }
    return getSetPoolDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetLeastBond,
      stafihub.stafihub.ledger.Tx.MsgSetLeastBondResponse> getSetLeastBondMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetLeastBond",
      requestType = stafihub.stafihub.ledger.Tx.MsgSetLeastBond.class,
      responseType = stafihub.stafihub.ledger.Tx.MsgSetLeastBondResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetLeastBond,
      stafihub.stafihub.ledger.Tx.MsgSetLeastBondResponse> getSetLeastBondMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetLeastBond, stafihub.stafihub.ledger.Tx.MsgSetLeastBondResponse> getSetLeastBondMethod;
    if ((getSetLeastBondMethod = MsgGrpc.getSetLeastBondMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetLeastBondMethod = MsgGrpc.getSetLeastBondMethod) == null) {
          MsgGrpc.getSetLeastBondMethod = getSetLeastBondMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.ledger.Tx.MsgSetLeastBond, stafihub.stafihub.ledger.Tx.MsgSetLeastBondResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetLeastBond"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgSetLeastBond.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgSetLeastBondResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetLeastBond"))
              .build();
        }
      }
    }
    return getSetLeastBondMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgClearCurrentEraSnapShots,
      stafihub.stafihub.ledger.Tx.MsgClearCurrentEraSnapShotsResponse> getClearCurrentEraSnapShotsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClearCurrentEraSnapShots",
      requestType = stafihub.stafihub.ledger.Tx.MsgClearCurrentEraSnapShots.class,
      responseType = stafihub.stafihub.ledger.Tx.MsgClearCurrentEraSnapShotsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgClearCurrentEraSnapShots,
      stafihub.stafihub.ledger.Tx.MsgClearCurrentEraSnapShotsResponse> getClearCurrentEraSnapShotsMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgClearCurrentEraSnapShots, stafihub.stafihub.ledger.Tx.MsgClearCurrentEraSnapShotsResponse> getClearCurrentEraSnapShotsMethod;
    if ((getClearCurrentEraSnapShotsMethod = MsgGrpc.getClearCurrentEraSnapShotsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClearCurrentEraSnapShotsMethod = MsgGrpc.getClearCurrentEraSnapShotsMethod) == null) {
          MsgGrpc.getClearCurrentEraSnapShotsMethod = getClearCurrentEraSnapShotsMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.ledger.Tx.MsgClearCurrentEraSnapShots, stafihub.stafihub.ledger.Tx.MsgClearCurrentEraSnapShotsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClearCurrentEraSnapShots"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgClearCurrentEraSnapShots.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgClearCurrentEraSnapShotsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ClearCurrentEraSnapShots"))
              .build();
        }
      }
    }
    return getClearCurrentEraSnapShotsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetStakingRewardCommission,
      stafihub.stafihub.ledger.Tx.MsgSetStakingRewardCommissionResponse> getSetStakingRewardCommissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetStakingRewardCommission",
      requestType = stafihub.stafihub.ledger.Tx.MsgSetStakingRewardCommission.class,
      responseType = stafihub.stafihub.ledger.Tx.MsgSetStakingRewardCommissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetStakingRewardCommission,
      stafihub.stafihub.ledger.Tx.MsgSetStakingRewardCommissionResponse> getSetStakingRewardCommissionMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetStakingRewardCommission, stafihub.stafihub.ledger.Tx.MsgSetStakingRewardCommissionResponse> getSetStakingRewardCommissionMethod;
    if ((getSetStakingRewardCommissionMethod = MsgGrpc.getSetStakingRewardCommissionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetStakingRewardCommissionMethod = MsgGrpc.getSetStakingRewardCommissionMethod) == null) {
          MsgGrpc.getSetStakingRewardCommissionMethod = getSetStakingRewardCommissionMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.ledger.Tx.MsgSetStakingRewardCommission, stafihub.stafihub.ledger.Tx.MsgSetStakingRewardCommissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetStakingRewardCommission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgSetStakingRewardCommission.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgSetStakingRewardCommissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetStakingRewardCommission"))
              .build();
        }
      }
    }
    return getSetStakingRewardCommissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetProtocolFeeReceiver,
      stafihub.stafihub.ledger.Tx.MsgSetProtocolFeeReceiverResponse> getSetProtocolFeeReceiverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetProtocolFeeReceiver",
      requestType = stafihub.stafihub.ledger.Tx.MsgSetProtocolFeeReceiver.class,
      responseType = stafihub.stafihub.ledger.Tx.MsgSetProtocolFeeReceiverResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetProtocolFeeReceiver,
      stafihub.stafihub.ledger.Tx.MsgSetProtocolFeeReceiverResponse> getSetProtocolFeeReceiverMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetProtocolFeeReceiver, stafihub.stafihub.ledger.Tx.MsgSetProtocolFeeReceiverResponse> getSetProtocolFeeReceiverMethod;
    if ((getSetProtocolFeeReceiverMethod = MsgGrpc.getSetProtocolFeeReceiverMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetProtocolFeeReceiverMethod = MsgGrpc.getSetProtocolFeeReceiverMethod) == null) {
          MsgGrpc.getSetProtocolFeeReceiverMethod = getSetProtocolFeeReceiverMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.ledger.Tx.MsgSetProtocolFeeReceiver, stafihub.stafihub.ledger.Tx.MsgSetProtocolFeeReceiverResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetProtocolFeeReceiver"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgSetProtocolFeeReceiver.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgSetProtocolFeeReceiverResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetProtocolFeeReceiver"))
              .build();
        }
      }
    }
    return getSetProtocolFeeReceiverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetUnbondRelayFee,
      stafihub.stafihub.ledger.Tx.MsgSetUnbondRelayFeeResponse> getSetUnbondRelayFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetUnbondRelayFee",
      requestType = stafihub.stafihub.ledger.Tx.MsgSetUnbondRelayFee.class,
      responseType = stafihub.stafihub.ledger.Tx.MsgSetUnbondRelayFeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetUnbondRelayFee,
      stafihub.stafihub.ledger.Tx.MsgSetUnbondRelayFeeResponse> getSetUnbondRelayFeeMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetUnbondRelayFee, stafihub.stafihub.ledger.Tx.MsgSetUnbondRelayFeeResponse> getSetUnbondRelayFeeMethod;
    if ((getSetUnbondRelayFeeMethod = MsgGrpc.getSetUnbondRelayFeeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetUnbondRelayFeeMethod = MsgGrpc.getSetUnbondRelayFeeMethod) == null) {
          MsgGrpc.getSetUnbondRelayFeeMethod = getSetUnbondRelayFeeMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.ledger.Tx.MsgSetUnbondRelayFee, stafihub.stafihub.ledger.Tx.MsgSetUnbondRelayFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetUnbondRelayFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgSetUnbondRelayFee.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgSetUnbondRelayFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetUnbondRelayFee"))
              .build();
        }
      }
    }
    return getSetUnbondRelayFeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgLiquidityUnbond,
      stafihub.stafihub.ledger.Tx.MsgLiquidityUnbondResponse> getLiquidityUnbondMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LiquidityUnbond",
      requestType = stafihub.stafihub.ledger.Tx.MsgLiquidityUnbond.class,
      responseType = stafihub.stafihub.ledger.Tx.MsgLiquidityUnbondResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgLiquidityUnbond,
      stafihub.stafihub.ledger.Tx.MsgLiquidityUnbondResponse> getLiquidityUnbondMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgLiquidityUnbond, stafihub.stafihub.ledger.Tx.MsgLiquidityUnbondResponse> getLiquidityUnbondMethod;
    if ((getLiquidityUnbondMethod = MsgGrpc.getLiquidityUnbondMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getLiquidityUnbondMethod = MsgGrpc.getLiquidityUnbondMethod) == null) {
          MsgGrpc.getLiquidityUnbondMethod = getLiquidityUnbondMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.ledger.Tx.MsgLiquidityUnbond, stafihub.stafihub.ledger.Tx.MsgLiquidityUnbondResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LiquidityUnbond"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgLiquidityUnbond.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgLiquidityUnbondResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("LiquidityUnbond"))
              .build();
        }
      }
    }
    return getLiquidityUnbondMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetUnbondCommission,
      stafihub.stafihub.ledger.Tx.MsgSetUnbondCommissionResponse> getSetUnbondCommissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetUnbondCommission",
      requestType = stafihub.stafihub.ledger.Tx.MsgSetUnbondCommission.class,
      responseType = stafihub.stafihub.ledger.Tx.MsgSetUnbondCommissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetUnbondCommission,
      stafihub.stafihub.ledger.Tx.MsgSetUnbondCommissionResponse> getSetUnbondCommissionMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetUnbondCommission, stafihub.stafihub.ledger.Tx.MsgSetUnbondCommissionResponse> getSetUnbondCommissionMethod;
    if ((getSetUnbondCommissionMethod = MsgGrpc.getSetUnbondCommissionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetUnbondCommissionMethod = MsgGrpc.getSetUnbondCommissionMethod) == null) {
          MsgGrpc.getSetUnbondCommissionMethod = getSetUnbondCommissionMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.ledger.Tx.MsgSetUnbondCommission, stafihub.stafihub.ledger.Tx.MsgSetUnbondCommissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetUnbondCommission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgSetUnbondCommission.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgSetUnbondCommissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetUnbondCommission"))
              .build();
        }
      }
    }
    return getSetUnbondCommissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSubmitSignature,
      stafihub.stafihub.ledger.Tx.MsgSubmitSignatureResponse> getSubmitSignatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitSignature",
      requestType = stafihub.stafihub.ledger.Tx.MsgSubmitSignature.class,
      responseType = stafihub.stafihub.ledger.Tx.MsgSubmitSignatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSubmitSignature,
      stafihub.stafihub.ledger.Tx.MsgSubmitSignatureResponse> getSubmitSignatureMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSubmitSignature, stafihub.stafihub.ledger.Tx.MsgSubmitSignatureResponse> getSubmitSignatureMethod;
    if ((getSubmitSignatureMethod = MsgGrpc.getSubmitSignatureMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSubmitSignatureMethod = MsgGrpc.getSubmitSignatureMethod) == null) {
          MsgGrpc.getSubmitSignatureMethod = getSubmitSignatureMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.ledger.Tx.MsgSubmitSignature, stafihub.stafihub.ledger.Tx.MsgSubmitSignatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitSignature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgSubmitSignature.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgSubmitSignatureResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SubmitSignature"))
              .build();
        }
      }
    }
    return getSubmitSignatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetRParams,
      stafihub.stafihub.ledger.Tx.MsgSetRParamsResponse> getSetRParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRParams",
      requestType = stafihub.stafihub.ledger.Tx.MsgSetRParams.class,
      responseType = stafihub.stafihub.ledger.Tx.MsgSetRParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetRParams,
      stafihub.stafihub.ledger.Tx.MsgSetRParamsResponse> getSetRParamsMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetRParams, stafihub.stafihub.ledger.Tx.MsgSetRParamsResponse> getSetRParamsMethod;
    if ((getSetRParamsMethod = MsgGrpc.getSetRParamsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetRParamsMethod = MsgGrpc.getSetRParamsMethod) == null) {
          MsgGrpc.getSetRParamsMethod = getSetRParamsMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.ledger.Tx.MsgSetRParams, stafihub.stafihub.ledger.Tx.MsgSetRParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgSetRParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgSetRParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetRParams"))
              .build();
        }
      }
    }
    return getSetRParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetRelayFeeReceiver,
      stafihub.stafihub.ledger.Tx.MsgSetRelayFeeReceiverResponse> getSetRelayFeeReceiverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRelayFeeReceiver",
      requestType = stafihub.stafihub.ledger.Tx.MsgSetRelayFeeReceiver.class,
      responseType = stafihub.stafihub.ledger.Tx.MsgSetRelayFeeReceiverResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetRelayFeeReceiver,
      stafihub.stafihub.ledger.Tx.MsgSetRelayFeeReceiverResponse> getSetRelayFeeReceiverMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetRelayFeeReceiver, stafihub.stafihub.ledger.Tx.MsgSetRelayFeeReceiverResponse> getSetRelayFeeReceiverMethod;
    if ((getSetRelayFeeReceiverMethod = MsgGrpc.getSetRelayFeeReceiverMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetRelayFeeReceiverMethod = MsgGrpc.getSetRelayFeeReceiverMethod) == null) {
          MsgGrpc.getSetRelayFeeReceiverMethod = getSetRelayFeeReceiverMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.ledger.Tx.MsgSetRelayFeeReceiver, stafihub.stafihub.ledger.Tx.MsgSetRelayFeeReceiverResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRelayFeeReceiver"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgSetRelayFeeReceiver.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgSetRelayFeeReceiverResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetRelayFeeReceiver"))
              .build();
        }
      }
    }
    return getSetRelayFeeReceiverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetRelayGasPrice,
      stafihub.stafihub.ledger.Tx.MsgSetRelayGasPriceResponse> getSetRelayGasPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRelayGasPrice",
      requestType = stafihub.stafihub.ledger.Tx.MsgSetRelayGasPrice.class,
      responseType = stafihub.stafihub.ledger.Tx.MsgSetRelayGasPriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetRelayGasPrice,
      stafihub.stafihub.ledger.Tx.MsgSetRelayGasPriceResponse> getSetRelayGasPriceMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetRelayGasPrice, stafihub.stafihub.ledger.Tx.MsgSetRelayGasPriceResponse> getSetRelayGasPriceMethod;
    if ((getSetRelayGasPriceMethod = MsgGrpc.getSetRelayGasPriceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetRelayGasPriceMethod = MsgGrpc.getSetRelayGasPriceMethod) == null) {
          MsgGrpc.getSetRelayGasPriceMethod = getSetRelayGasPriceMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.ledger.Tx.MsgSetRelayGasPrice, stafihub.stafihub.ledger.Tx.MsgSetRelayGasPriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRelayGasPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgSetRelayGasPrice.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgSetRelayGasPriceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetRelayGasPrice"))
              .build();
        }
      }
    }
    return getSetRelayGasPriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetEraSeconds,
      stafihub.stafihub.ledger.Tx.MsgSetEraSecondsResponse> getSetEraSecondsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetEraSeconds",
      requestType = stafihub.stafihub.ledger.Tx.MsgSetEraSeconds.class,
      responseType = stafihub.stafihub.ledger.Tx.MsgSetEraSecondsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetEraSeconds,
      stafihub.stafihub.ledger.Tx.MsgSetEraSecondsResponse> getSetEraSecondsMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetEraSeconds, stafihub.stafihub.ledger.Tx.MsgSetEraSecondsResponse> getSetEraSecondsMethod;
    if ((getSetEraSecondsMethod = MsgGrpc.getSetEraSecondsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetEraSecondsMethod = MsgGrpc.getSetEraSecondsMethod) == null) {
          MsgGrpc.getSetEraSecondsMethod = getSetEraSecondsMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.ledger.Tx.MsgSetEraSeconds, stafihub.stafihub.ledger.Tx.MsgSetEraSecondsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetEraSeconds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgSetEraSeconds.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgSetEraSecondsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetEraSeconds"))
              .build();
        }
      }
    }
    return getSetEraSecondsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgRmBondedPool,
      stafihub.stafihub.ledger.Tx.MsgRmBondedPoolResponse> getRmBondedPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RmBondedPool",
      requestType = stafihub.stafihub.ledger.Tx.MsgRmBondedPool.class,
      responseType = stafihub.stafihub.ledger.Tx.MsgRmBondedPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgRmBondedPool,
      stafihub.stafihub.ledger.Tx.MsgRmBondedPoolResponse> getRmBondedPoolMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgRmBondedPool, stafihub.stafihub.ledger.Tx.MsgRmBondedPoolResponse> getRmBondedPoolMethod;
    if ((getRmBondedPoolMethod = MsgGrpc.getRmBondedPoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRmBondedPoolMethod = MsgGrpc.getRmBondedPoolMethod) == null) {
          MsgGrpc.getRmBondedPoolMethod = getRmBondedPoolMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.ledger.Tx.MsgRmBondedPool, stafihub.stafihub.ledger.Tx.MsgRmBondedPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RmBondedPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgRmBondedPool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgRmBondedPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RmBondedPool"))
              .build();
        }
      }
    }
    return getRmBondedPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgMigrateInit,
      stafihub.stafihub.ledger.Tx.MsgMigrateInitResponse> getMigrateInitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MigrateInit",
      requestType = stafihub.stafihub.ledger.Tx.MsgMigrateInit.class,
      responseType = stafihub.stafihub.ledger.Tx.MsgMigrateInitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgMigrateInit,
      stafihub.stafihub.ledger.Tx.MsgMigrateInitResponse> getMigrateInitMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgMigrateInit, stafihub.stafihub.ledger.Tx.MsgMigrateInitResponse> getMigrateInitMethod;
    if ((getMigrateInitMethod = MsgGrpc.getMigrateInitMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMigrateInitMethod = MsgGrpc.getMigrateInitMethod) == null) {
          MsgGrpc.getMigrateInitMethod = getMigrateInitMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.ledger.Tx.MsgMigrateInit, stafihub.stafihub.ledger.Tx.MsgMigrateInitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MigrateInit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgMigrateInit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgMigrateInitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MigrateInit"))
              .build();
        }
      }
    }
    return getMigrateInitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgMigrateUnbondings,
      stafihub.stafihub.ledger.Tx.MsgMigrateUnbondingsResponse> getMigrateUnbondingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MigrateUnbondings",
      requestType = stafihub.stafihub.ledger.Tx.MsgMigrateUnbondings.class,
      responseType = stafihub.stafihub.ledger.Tx.MsgMigrateUnbondingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgMigrateUnbondings,
      stafihub.stafihub.ledger.Tx.MsgMigrateUnbondingsResponse> getMigrateUnbondingsMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgMigrateUnbondings, stafihub.stafihub.ledger.Tx.MsgMigrateUnbondingsResponse> getMigrateUnbondingsMethod;
    if ((getMigrateUnbondingsMethod = MsgGrpc.getMigrateUnbondingsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMigrateUnbondingsMethod = MsgGrpc.getMigrateUnbondingsMethod) == null) {
          MsgGrpc.getMigrateUnbondingsMethod = getMigrateUnbondingsMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.ledger.Tx.MsgMigrateUnbondings, stafihub.stafihub.ledger.Tx.MsgMigrateUnbondingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MigrateUnbondings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgMigrateUnbondings.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgMigrateUnbondingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MigrateUnbondings"))
              .build();
        }
      }
    }
    return getMigrateUnbondingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgToggleUnbondSwitch,
      stafihub.stafihub.ledger.Tx.MsgToggleUnbondSwitchResponse> getToggleUnbondSwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ToggleUnbondSwitch",
      requestType = stafihub.stafihub.ledger.Tx.MsgToggleUnbondSwitch.class,
      responseType = stafihub.stafihub.ledger.Tx.MsgToggleUnbondSwitchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgToggleUnbondSwitch,
      stafihub.stafihub.ledger.Tx.MsgToggleUnbondSwitchResponse> getToggleUnbondSwitchMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgToggleUnbondSwitch, stafihub.stafihub.ledger.Tx.MsgToggleUnbondSwitchResponse> getToggleUnbondSwitchMethod;
    if ((getToggleUnbondSwitchMethod = MsgGrpc.getToggleUnbondSwitchMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getToggleUnbondSwitchMethod = MsgGrpc.getToggleUnbondSwitchMethod) == null) {
          MsgGrpc.getToggleUnbondSwitchMethod = getToggleUnbondSwitchMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.ledger.Tx.MsgToggleUnbondSwitch, stafihub.stafihub.ledger.Tx.MsgToggleUnbondSwitchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ToggleUnbondSwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgToggleUnbondSwitch.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgToggleUnbondSwitchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ToggleUnbondSwitch"))
              .build();
        }
      }
    }
    return getToggleUnbondSwitchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgUnsealMigrateInit,
      stafihub.stafihub.ledger.Tx.MsgUnsealMigrateInitResponse> getUnsealMigrateInitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnsealMigrateInit",
      requestType = stafihub.stafihub.ledger.Tx.MsgUnsealMigrateInit.class,
      responseType = stafihub.stafihub.ledger.Tx.MsgUnsealMigrateInitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgUnsealMigrateInit,
      stafihub.stafihub.ledger.Tx.MsgUnsealMigrateInitResponse> getUnsealMigrateInitMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgUnsealMigrateInit, stafihub.stafihub.ledger.Tx.MsgUnsealMigrateInitResponse> getUnsealMigrateInitMethod;
    if ((getUnsealMigrateInitMethod = MsgGrpc.getUnsealMigrateInitMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUnsealMigrateInitMethod = MsgGrpc.getUnsealMigrateInitMethod) == null) {
          MsgGrpc.getUnsealMigrateInitMethod = getUnsealMigrateInitMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.ledger.Tx.MsgUnsealMigrateInit, stafihub.stafihub.ledger.Tx.MsgUnsealMigrateInitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnsealMigrateInit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgUnsealMigrateInit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgUnsealMigrateInitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UnsealMigrateInit"))
              .build();
        }
      }
    }
    return getUnsealMigrateInitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgRegisterIcaPool,
      stafihub.stafihub.ledger.Tx.MsgRegisterIcaPoolResponse> getRegisterIcaPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterIcaPool",
      requestType = stafihub.stafihub.ledger.Tx.MsgRegisterIcaPool.class,
      responseType = stafihub.stafihub.ledger.Tx.MsgRegisterIcaPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgRegisterIcaPool,
      stafihub.stafihub.ledger.Tx.MsgRegisterIcaPoolResponse> getRegisterIcaPoolMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgRegisterIcaPool, stafihub.stafihub.ledger.Tx.MsgRegisterIcaPoolResponse> getRegisterIcaPoolMethod;
    if ((getRegisterIcaPoolMethod = MsgGrpc.getRegisterIcaPoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRegisterIcaPoolMethod = MsgGrpc.getRegisterIcaPoolMethod) == null) {
          MsgGrpc.getRegisterIcaPoolMethod = getRegisterIcaPoolMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.ledger.Tx.MsgRegisterIcaPool, stafihub.stafihub.ledger.Tx.MsgRegisterIcaPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterIcaPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgRegisterIcaPool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgRegisterIcaPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RegisterIcaPool"))
              .build();
        }
      }
    }
    return getRegisterIcaPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetWithdrawalAddr,
      stafihub.stafihub.ledger.Tx.MsgSetWithdrawalAddrResponse> getSetWithdrawalAddrMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetWithdrawalAddr",
      requestType = stafihub.stafihub.ledger.Tx.MsgSetWithdrawalAddr.class,
      responseType = stafihub.stafihub.ledger.Tx.MsgSetWithdrawalAddrResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetWithdrawalAddr,
      stafihub.stafihub.ledger.Tx.MsgSetWithdrawalAddrResponse> getSetWithdrawalAddrMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetWithdrawalAddr, stafihub.stafihub.ledger.Tx.MsgSetWithdrawalAddrResponse> getSetWithdrawalAddrMethod;
    if ((getSetWithdrawalAddrMethod = MsgGrpc.getSetWithdrawalAddrMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetWithdrawalAddrMethod = MsgGrpc.getSetWithdrawalAddrMethod) == null) {
          MsgGrpc.getSetWithdrawalAddrMethod = getSetWithdrawalAddrMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.ledger.Tx.MsgSetWithdrawalAddr, stafihub.stafihub.ledger.Tx.MsgSetWithdrawalAddrResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetWithdrawalAddr"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgSetWithdrawalAddr.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgSetWithdrawalAddrResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetWithdrawalAddr"))
              .build();
        }
      }
    }
    return getSetWithdrawalAddrMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgInitPool,
      stafihub.stafihub.ledger.Tx.MsgInitPoolResponse> getInitPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitPool",
      requestType = stafihub.stafihub.ledger.Tx.MsgInitPool.class,
      responseType = stafihub.stafihub.ledger.Tx.MsgInitPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgInitPool,
      stafihub.stafihub.ledger.Tx.MsgInitPoolResponse> getInitPoolMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgInitPool, stafihub.stafihub.ledger.Tx.MsgInitPoolResponse> getInitPoolMethod;
    if ((getInitPoolMethod = MsgGrpc.getInitPoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getInitPoolMethod = MsgGrpc.getInitPoolMethod) == null) {
          MsgGrpc.getInitPoolMethod = getInitPoolMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.ledger.Tx.MsgInitPool, stafihub.stafihub.ledger.Tx.MsgInitPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgInitPool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgInitPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("InitPool"))
              .build();
        }
      }
    }
    return getInitPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetPoolStatus,
      stafihub.stafihub.ledger.Tx.MsgSetPoolStatusResponse> getSetPoolStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetPoolStatus",
      requestType = stafihub.stafihub.ledger.Tx.MsgSetPoolStatus.class,
      responseType = stafihub.stafihub.ledger.Tx.MsgSetPoolStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetPoolStatus,
      stafihub.stafihub.ledger.Tx.MsgSetPoolStatusResponse> getSetPoolStatusMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.ledger.Tx.MsgSetPoolStatus, stafihub.stafihub.ledger.Tx.MsgSetPoolStatusResponse> getSetPoolStatusMethod;
    if ((getSetPoolStatusMethod = MsgGrpc.getSetPoolStatusMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetPoolStatusMethod = MsgGrpc.getSetPoolStatusMethod) == null) {
          MsgGrpc.getSetPoolStatusMethod = getSetPoolStatusMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.ledger.Tx.MsgSetPoolStatus, stafihub.stafihub.ledger.Tx.MsgSetPoolStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPoolStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgSetPoolStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.ledger.Tx.MsgSetPoolStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetPoolStatus"))
              .build();
        }
      }
    }
    return getSetPoolStatusMethod;
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
    public void setEraUnbondLimit(stafihub.stafihub.ledger.Tx.MsgSetEraUnbondLimit request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetEraUnbondLimitResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetEraUnbondLimitMethod(), responseObserver);
    }

    /**
     */
    public void setPoolDetail(stafihub.stafihub.ledger.Tx.MsgSetPoolDetail request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetPoolDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetPoolDetailMethod(), responseObserver);
    }

    /**
     */
    public void setLeastBond(stafihub.stafihub.ledger.Tx.MsgSetLeastBond request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetLeastBondResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetLeastBondMethod(), responseObserver);
    }

    /**
     */
    public void clearCurrentEraSnapShots(stafihub.stafihub.ledger.Tx.MsgClearCurrentEraSnapShots request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgClearCurrentEraSnapShotsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClearCurrentEraSnapShotsMethod(), responseObserver);
    }

    /**
     */
    public void setStakingRewardCommission(stafihub.stafihub.ledger.Tx.MsgSetStakingRewardCommission request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetStakingRewardCommissionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetStakingRewardCommissionMethod(), responseObserver);
    }

    /**
     */
    public void setProtocolFeeReceiver(stafihub.stafihub.ledger.Tx.MsgSetProtocolFeeReceiver request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetProtocolFeeReceiverResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetProtocolFeeReceiverMethod(), responseObserver);
    }

    /**
     */
    public void setUnbondRelayFee(stafihub.stafihub.ledger.Tx.MsgSetUnbondRelayFee request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetUnbondRelayFeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetUnbondRelayFeeMethod(), responseObserver);
    }

    /**
     */
    public void liquidityUnbond(stafihub.stafihub.ledger.Tx.MsgLiquidityUnbond request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgLiquidityUnbondResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLiquidityUnbondMethod(), responseObserver);
    }

    /**
     */
    public void setUnbondCommission(stafihub.stafihub.ledger.Tx.MsgSetUnbondCommission request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetUnbondCommissionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetUnbondCommissionMethod(), responseObserver);
    }

    /**
     */
    public void submitSignature(stafihub.stafihub.ledger.Tx.MsgSubmitSignature request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSubmitSignatureResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSubmitSignatureMethod(), responseObserver);
    }

    /**
     */
    public void setRParams(stafihub.stafihub.ledger.Tx.MsgSetRParams request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetRParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetRParamsMethod(), responseObserver);
    }

    /**
     */
    public void setRelayFeeReceiver(stafihub.stafihub.ledger.Tx.MsgSetRelayFeeReceiver request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetRelayFeeReceiverResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetRelayFeeReceiverMethod(), responseObserver);
    }

    /**
     */
    public void setRelayGasPrice(stafihub.stafihub.ledger.Tx.MsgSetRelayGasPrice request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetRelayGasPriceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetRelayGasPriceMethod(), responseObserver);
    }

    /**
     */
    public void setEraSeconds(stafihub.stafihub.ledger.Tx.MsgSetEraSeconds request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetEraSecondsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetEraSecondsMethod(), responseObserver);
    }

    /**
     */
    public void rmBondedPool(stafihub.stafihub.ledger.Tx.MsgRmBondedPool request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgRmBondedPoolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRmBondedPoolMethod(), responseObserver);
    }

    /**
     */
    public void migrateInit(stafihub.stafihub.ledger.Tx.MsgMigrateInit request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgMigrateInitResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMigrateInitMethod(), responseObserver);
    }

    /**
     */
    public void migrateUnbondings(stafihub.stafihub.ledger.Tx.MsgMigrateUnbondings request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgMigrateUnbondingsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMigrateUnbondingsMethod(), responseObserver);
    }

    /**
     */
    public void toggleUnbondSwitch(stafihub.stafihub.ledger.Tx.MsgToggleUnbondSwitch request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgToggleUnbondSwitchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getToggleUnbondSwitchMethod(), responseObserver);
    }

    /**
     */
    public void unsealMigrateInit(stafihub.stafihub.ledger.Tx.MsgUnsealMigrateInit request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgUnsealMigrateInitResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnsealMigrateInitMethod(), responseObserver);
    }

    /**
     */
    public void registerIcaPool(stafihub.stafihub.ledger.Tx.MsgRegisterIcaPool request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgRegisterIcaPoolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterIcaPoolMethod(), responseObserver);
    }

    /**
     */
    public void setWithdrawalAddr(stafihub.stafihub.ledger.Tx.MsgSetWithdrawalAddr request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetWithdrawalAddrResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetWithdrawalAddrMethod(), responseObserver);
    }

    /**
     */
    public void initPool(stafihub.stafihub.ledger.Tx.MsgInitPool request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgInitPoolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInitPoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void setPoolStatus(stafihub.stafihub.ledger.Tx.MsgSetPoolStatus request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetPoolStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetPoolStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSetEraUnbondLimitMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.ledger.Tx.MsgSetEraUnbondLimit,
                stafihub.stafihub.ledger.Tx.MsgSetEraUnbondLimitResponse>(
                  this, METHODID_SET_ERA_UNBOND_LIMIT)))
          .addMethod(
            getSetPoolDetailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.ledger.Tx.MsgSetPoolDetail,
                stafihub.stafihub.ledger.Tx.MsgSetPoolDetailResponse>(
                  this, METHODID_SET_POOL_DETAIL)))
          .addMethod(
            getSetLeastBondMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.ledger.Tx.MsgSetLeastBond,
                stafihub.stafihub.ledger.Tx.MsgSetLeastBondResponse>(
                  this, METHODID_SET_LEAST_BOND)))
          .addMethod(
            getClearCurrentEraSnapShotsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.ledger.Tx.MsgClearCurrentEraSnapShots,
                stafihub.stafihub.ledger.Tx.MsgClearCurrentEraSnapShotsResponse>(
                  this, METHODID_CLEAR_CURRENT_ERA_SNAP_SHOTS)))
          .addMethod(
            getSetStakingRewardCommissionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.ledger.Tx.MsgSetStakingRewardCommission,
                stafihub.stafihub.ledger.Tx.MsgSetStakingRewardCommissionResponse>(
                  this, METHODID_SET_STAKING_REWARD_COMMISSION)))
          .addMethod(
            getSetProtocolFeeReceiverMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.ledger.Tx.MsgSetProtocolFeeReceiver,
                stafihub.stafihub.ledger.Tx.MsgSetProtocolFeeReceiverResponse>(
                  this, METHODID_SET_PROTOCOL_FEE_RECEIVER)))
          .addMethod(
            getSetUnbondRelayFeeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.ledger.Tx.MsgSetUnbondRelayFee,
                stafihub.stafihub.ledger.Tx.MsgSetUnbondRelayFeeResponse>(
                  this, METHODID_SET_UNBOND_RELAY_FEE)))
          .addMethod(
            getLiquidityUnbondMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.ledger.Tx.MsgLiquidityUnbond,
                stafihub.stafihub.ledger.Tx.MsgLiquidityUnbondResponse>(
                  this, METHODID_LIQUIDITY_UNBOND)))
          .addMethod(
            getSetUnbondCommissionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.ledger.Tx.MsgSetUnbondCommission,
                stafihub.stafihub.ledger.Tx.MsgSetUnbondCommissionResponse>(
                  this, METHODID_SET_UNBOND_COMMISSION)))
          .addMethod(
            getSubmitSignatureMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.ledger.Tx.MsgSubmitSignature,
                stafihub.stafihub.ledger.Tx.MsgSubmitSignatureResponse>(
                  this, METHODID_SUBMIT_SIGNATURE)))
          .addMethod(
            getSetRParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.ledger.Tx.MsgSetRParams,
                stafihub.stafihub.ledger.Tx.MsgSetRParamsResponse>(
                  this, METHODID_SET_RPARAMS)))
          .addMethod(
            getSetRelayFeeReceiverMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.ledger.Tx.MsgSetRelayFeeReceiver,
                stafihub.stafihub.ledger.Tx.MsgSetRelayFeeReceiverResponse>(
                  this, METHODID_SET_RELAY_FEE_RECEIVER)))
          .addMethod(
            getSetRelayGasPriceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.ledger.Tx.MsgSetRelayGasPrice,
                stafihub.stafihub.ledger.Tx.MsgSetRelayGasPriceResponse>(
                  this, METHODID_SET_RELAY_GAS_PRICE)))
          .addMethod(
            getSetEraSecondsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.ledger.Tx.MsgSetEraSeconds,
                stafihub.stafihub.ledger.Tx.MsgSetEraSecondsResponse>(
                  this, METHODID_SET_ERA_SECONDS)))
          .addMethod(
            getRmBondedPoolMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.ledger.Tx.MsgRmBondedPool,
                stafihub.stafihub.ledger.Tx.MsgRmBondedPoolResponse>(
                  this, METHODID_RM_BONDED_POOL)))
          .addMethod(
            getMigrateInitMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.ledger.Tx.MsgMigrateInit,
                stafihub.stafihub.ledger.Tx.MsgMigrateInitResponse>(
                  this, METHODID_MIGRATE_INIT)))
          .addMethod(
            getMigrateUnbondingsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.ledger.Tx.MsgMigrateUnbondings,
                stafihub.stafihub.ledger.Tx.MsgMigrateUnbondingsResponse>(
                  this, METHODID_MIGRATE_UNBONDINGS)))
          .addMethod(
            getToggleUnbondSwitchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.ledger.Tx.MsgToggleUnbondSwitch,
                stafihub.stafihub.ledger.Tx.MsgToggleUnbondSwitchResponse>(
                  this, METHODID_TOGGLE_UNBOND_SWITCH)))
          .addMethod(
            getUnsealMigrateInitMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.ledger.Tx.MsgUnsealMigrateInit,
                stafihub.stafihub.ledger.Tx.MsgUnsealMigrateInitResponse>(
                  this, METHODID_UNSEAL_MIGRATE_INIT)))
          .addMethod(
            getRegisterIcaPoolMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.ledger.Tx.MsgRegisterIcaPool,
                stafihub.stafihub.ledger.Tx.MsgRegisterIcaPoolResponse>(
                  this, METHODID_REGISTER_ICA_POOL)))
          .addMethod(
            getSetWithdrawalAddrMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.ledger.Tx.MsgSetWithdrawalAddr,
                stafihub.stafihub.ledger.Tx.MsgSetWithdrawalAddrResponse>(
                  this, METHODID_SET_WITHDRAWAL_ADDR)))
          .addMethod(
            getInitPoolMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.ledger.Tx.MsgInitPool,
                stafihub.stafihub.ledger.Tx.MsgInitPoolResponse>(
                  this, METHODID_INIT_POOL)))
          .addMethod(
            getSetPoolStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.ledger.Tx.MsgSetPoolStatus,
                stafihub.stafihub.ledger.Tx.MsgSetPoolStatusResponse>(
                  this, METHODID_SET_POOL_STATUS)))
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
    public void setEraUnbondLimit(stafihub.stafihub.ledger.Tx.MsgSetEraUnbondLimit request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetEraUnbondLimitResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetEraUnbondLimitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setPoolDetail(stafihub.stafihub.ledger.Tx.MsgSetPoolDetail request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetPoolDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetPoolDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setLeastBond(stafihub.stafihub.ledger.Tx.MsgSetLeastBond request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetLeastBondResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetLeastBondMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void clearCurrentEraSnapShots(stafihub.stafihub.ledger.Tx.MsgClearCurrentEraSnapShots request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgClearCurrentEraSnapShotsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClearCurrentEraSnapShotsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setStakingRewardCommission(stafihub.stafihub.ledger.Tx.MsgSetStakingRewardCommission request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetStakingRewardCommissionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetStakingRewardCommissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setProtocolFeeReceiver(stafihub.stafihub.ledger.Tx.MsgSetProtocolFeeReceiver request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetProtocolFeeReceiverResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetProtocolFeeReceiverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setUnbondRelayFee(stafihub.stafihub.ledger.Tx.MsgSetUnbondRelayFee request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetUnbondRelayFeeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetUnbondRelayFeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void liquidityUnbond(stafihub.stafihub.ledger.Tx.MsgLiquidityUnbond request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgLiquidityUnbondResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLiquidityUnbondMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setUnbondCommission(stafihub.stafihub.ledger.Tx.MsgSetUnbondCommission request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetUnbondCommissionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetUnbondCommissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void submitSignature(stafihub.stafihub.ledger.Tx.MsgSubmitSignature request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSubmitSignatureResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubmitSignatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setRParams(stafihub.stafihub.ledger.Tx.MsgSetRParams request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetRParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetRParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setRelayFeeReceiver(stafihub.stafihub.ledger.Tx.MsgSetRelayFeeReceiver request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetRelayFeeReceiverResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetRelayFeeReceiverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setRelayGasPrice(stafihub.stafihub.ledger.Tx.MsgSetRelayGasPrice request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetRelayGasPriceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetRelayGasPriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setEraSeconds(stafihub.stafihub.ledger.Tx.MsgSetEraSeconds request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetEraSecondsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetEraSecondsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rmBondedPool(stafihub.stafihub.ledger.Tx.MsgRmBondedPool request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgRmBondedPoolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRmBondedPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void migrateInit(stafihub.stafihub.ledger.Tx.MsgMigrateInit request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgMigrateInitResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMigrateInitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void migrateUnbondings(stafihub.stafihub.ledger.Tx.MsgMigrateUnbondings request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgMigrateUnbondingsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMigrateUnbondingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void toggleUnbondSwitch(stafihub.stafihub.ledger.Tx.MsgToggleUnbondSwitch request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgToggleUnbondSwitchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getToggleUnbondSwitchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unsealMigrateInit(stafihub.stafihub.ledger.Tx.MsgUnsealMigrateInit request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgUnsealMigrateInitResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnsealMigrateInitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerIcaPool(stafihub.stafihub.ledger.Tx.MsgRegisterIcaPool request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgRegisterIcaPoolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterIcaPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setWithdrawalAddr(stafihub.stafihub.ledger.Tx.MsgSetWithdrawalAddr request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetWithdrawalAddrResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetWithdrawalAddrMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void initPool(stafihub.stafihub.ledger.Tx.MsgInitPool request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgInitPoolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInitPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void setPoolStatus(stafihub.stafihub.ledger.Tx.MsgSetPoolStatus request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetPoolStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetPoolStatusMethod(), getCallOptions()), request, responseObserver);
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
    public stafihub.stafihub.ledger.Tx.MsgSetEraUnbondLimitResponse setEraUnbondLimit(stafihub.stafihub.ledger.Tx.MsgSetEraUnbondLimit request) {
      return blockingUnaryCall(
          getChannel(), getSetEraUnbondLimitMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.ledger.Tx.MsgSetPoolDetailResponse setPoolDetail(stafihub.stafihub.ledger.Tx.MsgSetPoolDetail request) {
      return blockingUnaryCall(
          getChannel(), getSetPoolDetailMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.ledger.Tx.MsgSetLeastBondResponse setLeastBond(stafihub.stafihub.ledger.Tx.MsgSetLeastBond request) {
      return blockingUnaryCall(
          getChannel(), getSetLeastBondMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.ledger.Tx.MsgClearCurrentEraSnapShotsResponse clearCurrentEraSnapShots(stafihub.stafihub.ledger.Tx.MsgClearCurrentEraSnapShots request) {
      return blockingUnaryCall(
          getChannel(), getClearCurrentEraSnapShotsMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.ledger.Tx.MsgSetStakingRewardCommissionResponse setStakingRewardCommission(stafihub.stafihub.ledger.Tx.MsgSetStakingRewardCommission request) {
      return blockingUnaryCall(
          getChannel(), getSetStakingRewardCommissionMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.ledger.Tx.MsgSetProtocolFeeReceiverResponse setProtocolFeeReceiver(stafihub.stafihub.ledger.Tx.MsgSetProtocolFeeReceiver request) {
      return blockingUnaryCall(
          getChannel(), getSetProtocolFeeReceiverMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.ledger.Tx.MsgSetUnbondRelayFeeResponse setUnbondRelayFee(stafihub.stafihub.ledger.Tx.MsgSetUnbondRelayFee request) {
      return blockingUnaryCall(
          getChannel(), getSetUnbondRelayFeeMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.ledger.Tx.MsgLiquidityUnbondResponse liquidityUnbond(stafihub.stafihub.ledger.Tx.MsgLiquidityUnbond request) {
      return blockingUnaryCall(
          getChannel(), getLiquidityUnbondMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.ledger.Tx.MsgSetUnbondCommissionResponse setUnbondCommission(stafihub.stafihub.ledger.Tx.MsgSetUnbondCommission request) {
      return blockingUnaryCall(
          getChannel(), getSetUnbondCommissionMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.ledger.Tx.MsgSubmitSignatureResponse submitSignature(stafihub.stafihub.ledger.Tx.MsgSubmitSignature request) {
      return blockingUnaryCall(
          getChannel(), getSubmitSignatureMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.ledger.Tx.MsgSetRParamsResponse setRParams(stafihub.stafihub.ledger.Tx.MsgSetRParams request) {
      return blockingUnaryCall(
          getChannel(), getSetRParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.ledger.Tx.MsgSetRelayFeeReceiverResponse setRelayFeeReceiver(stafihub.stafihub.ledger.Tx.MsgSetRelayFeeReceiver request) {
      return blockingUnaryCall(
          getChannel(), getSetRelayFeeReceiverMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.ledger.Tx.MsgSetRelayGasPriceResponse setRelayGasPrice(stafihub.stafihub.ledger.Tx.MsgSetRelayGasPrice request) {
      return blockingUnaryCall(
          getChannel(), getSetRelayGasPriceMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.ledger.Tx.MsgSetEraSecondsResponse setEraSeconds(stafihub.stafihub.ledger.Tx.MsgSetEraSeconds request) {
      return blockingUnaryCall(
          getChannel(), getSetEraSecondsMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.ledger.Tx.MsgRmBondedPoolResponse rmBondedPool(stafihub.stafihub.ledger.Tx.MsgRmBondedPool request) {
      return blockingUnaryCall(
          getChannel(), getRmBondedPoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.ledger.Tx.MsgMigrateInitResponse migrateInit(stafihub.stafihub.ledger.Tx.MsgMigrateInit request) {
      return blockingUnaryCall(
          getChannel(), getMigrateInitMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.ledger.Tx.MsgMigrateUnbondingsResponse migrateUnbondings(stafihub.stafihub.ledger.Tx.MsgMigrateUnbondings request) {
      return blockingUnaryCall(
          getChannel(), getMigrateUnbondingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.ledger.Tx.MsgToggleUnbondSwitchResponse toggleUnbondSwitch(stafihub.stafihub.ledger.Tx.MsgToggleUnbondSwitch request) {
      return blockingUnaryCall(
          getChannel(), getToggleUnbondSwitchMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.ledger.Tx.MsgUnsealMigrateInitResponse unsealMigrateInit(stafihub.stafihub.ledger.Tx.MsgUnsealMigrateInit request) {
      return blockingUnaryCall(
          getChannel(), getUnsealMigrateInitMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.ledger.Tx.MsgRegisterIcaPoolResponse registerIcaPool(stafihub.stafihub.ledger.Tx.MsgRegisterIcaPool request) {
      return blockingUnaryCall(
          getChannel(), getRegisterIcaPoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.ledger.Tx.MsgSetWithdrawalAddrResponse setWithdrawalAddr(stafihub.stafihub.ledger.Tx.MsgSetWithdrawalAddr request) {
      return blockingUnaryCall(
          getChannel(), getSetWithdrawalAddrMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.ledger.Tx.MsgInitPoolResponse initPool(stafihub.stafihub.ledger.Tx.MsgInitPool request) {
      return blockingUnaryCall(
          getChannel(), getInitPoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public stafihub.stafihub.ledger.Tx.MsgSetPoolStatusResponse setPoolStatus(stafihub.stafihub.ledger.Tx.MsgSetPoolStatus request) {
      return blockingUnaryCall(
          getChannel(), getSetPoolStatusMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.ledger.Tx.MsgSetEraUnbondLimitResponse> setEraUnbondLimit(
        stafihub.stafihub.ledger.Tx.MsgSetEraUnbondLimit request) {
      return futureUnaryCall(
          getChannel().newCall(getSetEraUnbondLimitMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.ledger.Tx.MsgSetPoolDetailResponse> setPoolDetail(
        stafihub.stafihub.ledger.Tx.MsgSetPoolDetail request) {
      return futureUnaryCall(
          getChannel().newCall(getSetPoolDetailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.ledger.Tx.MsgSetLeastBondResponse> setLeastBond(
        stafihub.stafihub.ledger.Tx.MsgSetLeastBond request) {
      return futureUnaryCall(
          getChannel().newCall(getSetLeastBondMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.ledger.Tx.MsgClearCurrentEraSnapShotsResponse> clearCurrentEraSnapShots(
        stafihub.stafihub.ledger.Tx.MsgClearCurrentEraSnapShots request) {
      return futureUnaryCall(
          getChannel().newCall(getClearCurrentEraSnapShotsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.ledger.Tx.MsgSetStakingRewardCommissionResponse> setStakingRewardCommission(
        stafihub.stafihub.ledger.Tx.MsgSetStakingRewardCommission request) {
      return futureUnaryCall(
          getChannel().newCall(getSetStakingRewardCommissionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.ledger.Tx.MsgSetProtocolFeeReceiverResponse> setProtocolFeeReceiver(
        stafihub.stafihub.ledger.Tx.MsgSetProtocolFeeReceiver request) {
      return futureUnaryCall(
          getChannel().newCall(getSetProtocolFeeReceiverMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.ledger.Tx.MsgSetUnbondRelayFeeResponse> setUnbondRelayFee(
        stafihub.stafihub.ledger.Tx.MsgSetUnbondRelayFee request) {
      return futureUnaryCall(
          getChannel().newCall(getSetUnbondRelayFeeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.ledger.Tx.MsgLiquidityUnbondResponse> liquidityUnbond(
        stafihub.stafihub.ledger.Tx.MsgLiquidityUnbond request) {
      return futureUnaryCall(
          getChannel().newCall(getLiquidityUnbondMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.ledger.Tx.MsgSetUnbondCommissionResponse> setUnbondCommission(
        stafihub.stafihub.ledger.Tx.MsgSetUnbondCommission request) {
      return futureUnaryCall(
          getChannel().newCall(getSetUnbondCommissionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.ledger.Tx.MsgSubmitSignatureResponse> submitSignature(
        stafihub.stafihub.ledger.Tx.MsgSubmitSignature request) {
      return futureUnaryCall(
          getChannel().newCall(getSubmitSignatureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.ledger.Tx.MsgSetRParamsResponse> setRParams(
        stafihub.stafihub.ledger.Tx.MsgSetRParams request) {
      return futureUnaryCall(
          getChannel().newCall(getSetRParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.ledger.Tx.MsgSetRelayFeeReceiverResponse> setRelayFeeReceiver(
        stafihub.stafihub.ledger.Tx.MsgSetRelayFeeReceiver request) {
      return futureUnaryCall(
          getChannel().newCall(getSetRelayFeeReceiverMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.ledger.Tx.MsgSetRelayGasPriceResponse> setRelayGasPrice(
        stafihub.stafihub.ledger.Tx.MsgSetRelayGasPrice request) {
      return futureUnaryCall(
          getChannel().newCall(getSetRelayGasPriceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.ledger.Tx.MsgSetEraSecondsResponse> setEraSeconds(
        stafihub.stafihub.ledger.Tx.MsgSetEraSeconds request) {
      return futureUnaryCall(
          getChannel().newCall(getSetEraSecondsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.ledger.Tx.MsgRmBondedPoolResponse> rmBondedPool(
        stafihub.stafihub.ledger.Tx.MsgRmBondedPool request) {
      return futureUnaryCall(
          getChannel().newCall(getRmBondedPoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.ledger.Tx.MsgMigrateInitResponse> migrateInit(
        stafihub.stafihub.ledger.Tx.MsgMigrateInit request) {
      return futureUnaryCall(
          getChannel().newCall(getMigrateInitMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.ledger.Tx.MsgMigrateUnbondingsResponse> migrateUnbondings(
        stafihub.stafihub.ledger.Tx.MsgMigrateUnbondings request) {
      return futureUnaryCall(
          getChannel().newCall(getMigrateUnbondingsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.ledger.Tx.MsgToggleUnbondSwitchResponse> toggleUnbondSwitch(
        stafihub.stafihub.ledger.Tx.MsgToggleUnbondSwitch request) {
      return futureUnaryCall(
          getChannel().newCall(getToggleUnbondSwitchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.ledger.Tx.MsgUnsealMigrateInitResponse> unsealMigrateInit(
        stafihub.stafihub.ledger.Tx.MsgUnsealMigrateInit request) {
      return futureUnaryCall(
          getChannel().newCall(getUnsealMigrateInitMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.ledger.Tx.MsgRegisterIcaPoolResponse> registerIcaPool(
        stafihub.stafihub.ledger.Tx.MsgRegisterIcaPool request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterIcaPoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.ledger.Tx.MsgSetWithdrawalAddrResponse> setWithdrawalAddr(
        stafihub.stafihub.ledger.Tx.MsgSetWithdrawalAddr request) {
      return futureUnaryCall(
          getChannel().newCall(getSetWithdrawalAddrMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.ledger.Tx.MsgInitPoolResponse> initPool(
        stafihub.stafihub.ledger.Tx.MsgInitPool request) {
      return futureUnaryCall(
          getChannel().newCall(getInitPoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.ledger.Tx.MsgSetPoolStatusResponse> setPoolStatus(
        stafihub.stafihub.ledger.Tx.MsgSetPoolStatus request) {
      return futureUnaryCall(
          getChannel().newCall(getSetPoolStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_ERA_UNBOND_LIMIT = 0;
  private static final int METHODID_SET_POOL_DETAIL = 1;
  private static final int METHODID_SET_LEAST_BOND = 2;
  private static final int METHODID_CLEAR_CURRENT_ERA_SNAP_SHOTS = 3;
  private static final int METHODID_SET_STAKING_REWARD_COMMISSION = 4;
  private static final int METHODID_SET_PROTOCOL_FEE_RECEIVER = 5;
  private static final int METHODID_SET_UNBOND_RELAY_FEE = 6;
  private static final int METHODID_LIQUIDITY_UNBOND = 7;
  private static final int METHODID_SET_UNBOND_COMMISSION = 8;
  private static final int METHODID_SUBMIT_SIGNATURE = 9;
  private static final int METHODID_SET_RPARAMS = 10;
  private static final int METHODID_SET_RELAY_FEE_RECEIVER = 11;
  private static final int METHODID_SET_RELAY_GAS_PRICE = 12;
  private static final int METHODID_SET_ERA_SECONDS = 13;
  private static final int METHODID_RM_BONDED_POOL = 14;
  private static final int METHODID_MIGRATE_INIT = 15;
  private static final int METHODID_MIGRATE_UNBONDINGS = 16;
  private static final int METHODID_TOGGLE_UNBOND_SWITCH = 17;
  private static final int METHODID_UNSEAL_MIGRATE_INIT = 18;
  private static final int METHODID_REGISTER_ICA_POOL = 19;
  private static final int METHODID_SET_WITHDRAWAL_ADDR = 20;
  private static final int METHODID_INIT_POOL = 21;
  private static final int METHODID_SET_POOL_STATUS = 22;

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
        case METHODID_SET_ERA_UNBOND_LIMIT:
          serviceImpl.setEraUnbondLimit((stafihub.stafihub.ledger.Tx.MsgSetEraUnbondLimit) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetEraUnbondLimitResponse>) responseObserver);
          break;
        case METHODID_SET_POOL_DETAIL:
          serviceImpl.setPoolDetail((stafihub.stafihub.ledger.Tx.MsgSetPoolDetail) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetPoolDetailResponse>) responseObserver);
          break;
        case METHODID_SET_LEAST_BOND:
          serviceImpl.setLeastBond((stafihub.stafihub.ledger.Tx.MsgSetLeastBond) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetLeastBondResponse>) responseObserver);
          break;
        case METHODID_CLEAR_CURRENT_ERA_SNAP_SHOTS:
          serviceImpl.clearCurrentEraSnapShots((stafihub.stafihub.ledger.Tx.MsgClearCurrentEraSnapShots) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgClearCurrentEraSnapShotsResponse>) responseObserver);
          break;
        case METHODID_SET_STAKING_REWARD_COMMISSION:
          serviceImpl.setStakingRewardCommission((stafihub.stafihub.ledger.Tx.MsgSetStakingRewardCommission) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetStakingRewardCommissionResponse>) responseObserver);
          break;
        case METHODID_SET_PROTOCOL_FEE_RECEIVER:
          serviceImpl.setProtocolFeeReceiver((stafihub.stafihub.ledger.Tx.MsgSetProtocolFeeReceiver) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetProtocolFeeReceiverResponse>) responseObserver);
          break;
        case METHODID_SET_UNBOND_RELAY_FEE:
          serviceImpl.setUnbondRelayFee((stafihub.stafihub.ledger.Tx.MsgSetUnbondRelayFee) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetUnbondRelayFeeResponse>) responseObserver);
          break;
        case METHODID_LIQUIDITY_UNBOND:
          serviceImpl.liquidityUnbond((stafihub.stafihub.ledger.Tx.MsgLiquidityUnbond) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgLiquidityUnbondResponse>) responseObserver);
          break;
        case METHODID_SET_UNBOND_COMMISSION:
          serviceImpl.setUnbondCommission((stafihub.stafihub.ledger.Tx.MsgSetUnbondCommission) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetUnbondCommissionResponse>) responseObserver);
          break;
        case METHODID_SUBMIT_SIGNATURE:
          serviceImpl.submitSignature((stafihub.stafihub.ledger.Tx.MsgSubmitSignature) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSubmitSignatureResponse>) responseObserver);
          break;
        case METHODID_SET_RPARAMS:
          serviceImpl.setRParams((stafihub.stafihub.ledger.Tx.MsgSetRParams) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetRParamsResponse>) responseObserver);
          break;
        case METHODID_SET_RELAY_FEE_RECEIVER:
          serviceImpl.setRelayFeeReceiver((stafihub.stafihub.ledger.Tx.MsgSetRelayFeeReceiver) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetRelayFeeReceiverResponse>) responseObserver);
          break;
        case METHODID_SET_RELAY_GAS_PRICE:
          serviceImpl.setRelayGasPrice((stafihub.stafihub.ledger.Tx.MsgSetRelayGasPrice) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetRelayGasPriceResponse>) responseObserver);
          break;
        case METHODID_SET_ERA_SECONDS:
          serviceImpl.setEraSeconds((stafihub.stafihub.ledger.Tx.MsgSetEraSeconds) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetEraSecondsResponse>) responseObserver);
          break;
        case METHODID_RM_BONDED_POOL:
          serviceImpl.rmBondedPool((stafihub.stafihub.ledger.Tx.MsgRmBondedPool) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgRmBondedPoolResponse>) responseObserver);
          break;
        case METHODID_MIGRATE_INIT:
          serviceImpl.migrateInit((stafihub.stafihub.ledger.Tx.MsgMigrateInit) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgMigrateInitResponse>) responseObserver);
          break;
        case METHODID_MIGRATE_UNBONDINGS:
          serviceImpl.migrateUnbondings((stafihub.stafihub.ledger.Tx.MsgMigrateUnbondings) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgMigrateUnbondingsResponse>) responseObserver);
          break;
        case METHODID_TOGGLE_UNBOND_SWITCH:
          serviceImpl.toggleUnbondSwitch((stafihub.stafihub.ledger.Tx.MsgToggleUnbondSwitch) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgToggleUnbondSwitchResponse>) responseObserver);
          break;
        case METHODID_UNSEAL_MIGRATE_INIT:
          serviceImpl.unsealMigrateInit((stafihub.stafihub.ledger.Tx.MsgUnsealMigrateInit) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgUnsealMigrateInitResponse>) responseObserver);
          break;
        case METHODID_REGISTER_ICA_POOL:
          serviceImpl.registerIcaPool((stafihub.stafihub.ledger.Tx.MsgRegisterIcaPool) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgRegisterIcaPoolResponse>) responseObserver);
          break;
        case METHODID_SET_WITHDRAWAL_ADDR:
          serviceImpl.setWithdrawalAddr((stafihub.stafihub.ledger.Tx.MsgSetWithdrawalAddr) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetWithdrawalAddrResponse>) responseObserver);
          break;
        case METHODID_INIT_POOL:
          serviceImpl.initPool((stafihub.stafihub.ledger.Tx.MsgInitPool) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgInitPoolResponse>) responseObserver);
          break;
        case METHODID_SET_POOL_STATUS:
          serviceImpl.setPoolStatus((stafihub.stafihub.ledger.Tx.MsgSetPoolStatus) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.ledger.Tx.MsgSetPoolStatusResponse>) responseObserver);
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
      return stafihub.stafihub.ledger.Tx.getDescriptor();
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
              .addMethod(getSetEraUnbondLimitMethod())
              .addMethod(getSetPoolDetailMethod())
              .addMethod(getSetLeastBondMethod())
              .addMethod(getClearCurrentEraSnapShotsMethod())
              .addMethod(getSetStakingRewardCommissionMethod())
              .addMethod(getSetProtocolFeeReceiverMethod())
              .addMethod(getSetUnbondRelayFeeMethod())
              .addMethod(getLiquidityUnbondMethod())
              .addMethod(getSetUnbondCommissionMethod())
              .addMethod(getSubmitSignatureMethod())
              .addMethod(getSetRParamsMethod())
              .addMethod(getSetRelayFeeReceiverMethod())
              .addMethod(getSetRelayGasPriceMethod())
              .addMethod(getSetEraSecondsMethod())
              .addMethod(getRmBondedPoolMethod())
              .addMethod(getMigrateInitMethod())
              .addMethod(getMigrateUnbondingsMethod())
              .addMethod(getToggleUnbondSwitchMethod())
              .addMethod(getUnsealMigrateInitMethod())
              .addMethod(getRegisterIcaPoolMethod())
              .addMethod(getSetWithdrawalAddrMethod())
              .addMethod(getInitPoolMethod())
              .addMethod(getSetPoolStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
