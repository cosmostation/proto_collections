package Stridelabs.stride.stakeibc;

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
    comments = "Source: stride/stakeibc/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "Stridelabs.stride.stakeibc.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Stridelabs.stride.stakeibc.Tx.MsgLiquidStake,
      Stridelabs.stride.stakeibc.Tx.MsgLiquidStakeResponse> getLiquidStakeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LiquidStake",
      requestType = Stridelabs.stride.stakeibc.Tx.MsgLiquidStake.class,
      responseType = Stridelabs.stride.stakeibc.Tx.MsgLiquidStakeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Stridelabs.stride.stakeibc.Tx.MsgLiquidStake,
      Stridelabs.stride.stakeibc.Tx.MsgLiquidStakeResponse> getLiquidStakeMethod() {
    io.grpc.MethodDescriptor<Stridelabs.stride.stakeibc.Tx.MsgLiquidStake, Stridelabs.stride.stakeibc.Tx.MsgLiquidStakeResponse> getLiquidStakeMethod;
    if ((getLiquidStakeMethod = MsgGrpc.getLiquidStakeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getLiquidStakeMethod = MsgGrpc.getLiquidStakeMethod) == null) {
          MsgGrpc.getLiquidStakeMethod = getLiquidStakeMethod =
              io.grpc.MethodDescriptor.<Stridelabs.stride.stakeibc.Tx.MsgLiquidStake, Stridelabs.stride.stakeibc.Tx.MsgLiquidStakeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LiquidStake"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Stridelabs.stride.stakeibc.Tx.MsgLiquidStake.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Stridelabs.stride.stakeibc.Tx.MsgLiquidStakeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("LiquidStake"))
              .build();
        }
      }
    }
    return getLiquidStakeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Stridelabs.stride.stakeibc.Tx.MsgRedeemStake,
      Stridelabs.stride.stakeibc.Tx.MsgRedeemStakeResponse> getRedeemStakeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RedeemStake",
      requestType = Stridelabs.stride.stakeibc.Tx.MsgRedeemStake.class,
      responseType = Stridelabs.stride.stakeibc.Tx.MsgRedeemStakeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Stridelabs.stride.stakeibc.Tx.MsgRedeemStake,
      Stridelabs.stride.stakeibc.Tx.MsgRedeemStakeResponse> getRedeemStakeMethod() {
    io.grpc.MethodDescriptor<Stridelabs.stride.stakeibc.Tx.MsgRedeemStake, Stridelabs.stride.stakeibc.Tx.MsgRedeemStakeResponse> getRedeemStakeMethod;
    if ((getRedeemStakeMethod = MsgGrpc.getRedeemStakeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRedeemStakeMethod = MsgGrpc.getRedeemStakeMethod) == null) {
          MsgGrpc.getRedeemStakeMethod = getRedeemStakeMethod =
              io.grpc.MethodDescriptor.<Stridelabs.stride.stakeibc.Tx.MsgRedeemStake, Stridelabs.stride.stakeibc.Tx.MsgRedeemStakeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RedeemStake"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Stridelabs.stride.stakeibc.Tx.MsgRedeemStake.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Stridelabs.stride.stakeibc.Tx.MsgRedeemStakeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RedeemStake"))
              .build();
        }
      }
    }
    return getRedeemStakeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Stridelabs.stride.stakeibc.Tx.MsgRegisterHostZone,
      Stridelabs.stride.stakeibc.Tx.MsgRegisterHostZoneResponse> getRegisterHostZoneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterHostZone",
      requestType = Stridelabs.stride.stakeibc.Tx.MsgRegisterHostZone.class,
      responseType = Stridelabs.stride.stakeibc.Tx.MsgRegisterHostZoneResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Stridelabs.stride.stakeibc.Tx.MsgRegisterHostZone,
      Stridelabs.stride.stakeibc.Tx.MsgRegisterHostZoneResponse> getRegisterHostZoneMethod() {
    io.grpc.MethodDescriptor<Stridelabs.stride.stakeibc.Tx.MsgRegisterHostZone, Stridelabs.stride.stakeibc.Tx.MsgRegisterHostZoneResponse> getRegisterHostZoneMethod;
    if ((getRegisterHostZoneMethod = MsgGrpc.getRegisterHostZoneMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRegisterHostZoneMethod = MsgGrpc.getRegisterHostZoneMethod) == null) {
          MsgGrpc.getRegisterHostZoneMethod = getRegisterHostZoneMethod =
              io.grpc.MethodDescriptor.<Stridelabs.stride.stakeibc.Tx.MsgRegisterHostZone, Stridelabs.stride.stakeibc.Tx.MsgRegisterHostZoneResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterHostZone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Stridelabs.stride.stakeibc.Tx.MsgRegisterHostZone.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Stridelabs.stride.stakeibc.Tx.MsgRegisterHostZoneResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RegisterHostZone"))
              .build();
        }
      }
    }
    return getRegisterHostZoneMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Stridelabs.stride.stakeibc.Tx.MsgClaimUndelegatedTokens,
      Stridelabs.stride.stakeibc.Tx.MsgClaimUndelegatedTokensResponse> getClaimUndelegatedTokensMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimUndelegatedTokens",
      requestType = Stridelabs.stride.stakeibc.Tx.MsgClaimUndelegatedTokens.class,
      responseType = Stridelabs.stride.stakeibc.Tx.MsgClaimUndelegatedTokensResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Stridelabs.stride.stakeibc.Tx.MsgClaimUndelegatedTokens,
      Stridelabs.stride.stakeibc.Tx.MsgClaimUndelegatedTokensResponse> getClaimUndelegatedTokensMethod() {
    io.grpc.MethodDescriptor<Stridelabs.stride.stakeibc.Tx.MsgClaimUndelegatedTokens, Stridelabs.stride.stakeibc.Tx.MsgClaimUndelegatedTokensResponse> getClaimUndelegatedTokensMethod;
    if ((getClaimUndelegatedTokensMethod = MsgGrpc.getClaimUndelegatedTokensMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClaimUndelegatedTokensMethod = MsgGrpc.getClaimUndelegatedTokensMethod) == null) {
          MsgGrpc.getClaimUndelegatedTokensMethod = getClaimUndelegatedTokensMethod =
              io.grpc.MethodDescriptor.<Stridelabs.stride.stakeibc.Tx.MsgClaimUndelegatedTokens, Stridelabs.stride.stakeibc.Tx.MsgClaimUndelegatedTokensResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimUndelegatedTokens"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Stridelabs.stride.stakeibc.Tx.MsgClaimUndelegatedTokens.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Stridelabs.stride.stakeibc.Tx.MsgClaimUndelegatedTokensResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ClaimUndelegatedTokens"))
              .build();
        }
      }
    }
    return getClaimUndelegatedTokensMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Stridelabs.stride.stakeibc.Tx.MsgRebalanceValidators,
      Stridelabs.stride.stakeibc.Tx.MsgRebalanceValidatorsResponse> getRebalanceValidatorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RebalanceValidators",
      requestType = Stridelabs.stride.stakeibc.Tx.MsgRebalanceValidators.class,
      responseType = Stridelabs.stride.stakeibc.Tx.MsgRebalanceValidatorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Stridelabs.stride.stakeibc.Tx.MsgRebalanceValidators,
      Stridelabs.stride.stakeibc.Tx.MsgRebalanceValidatorsResponse> getRebalanceValidatorsMethod() {
    io.grpc.MethodDescriptor<Stridelabs.stride.stakeibc.Tx.MsgRebalanceValidators, Stridelabs.stride.stakeibc.Tx.MsgRebalanceValidatorsResponse> getRebalanceValidatorsMethod;
    if ((getRebalanceValidatorsMethod = MsgGrpc.getRebalanceValidatorsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRebalanceValidatorsMethod = MsgGrpc.getRebalanceValidatorsMethod) == null) {
          MsgGrpc.getRebalanceValidatorsMethod = getRebalanceValidatorsMethod =
              io.grpc.MethodDescriptor.<Stridelabs.stride.stakeibc.Tx.MsgRebalanceValidators, Stridelabs.stride.stakeibc.Tx.MsgRebalanceValidatorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RebalanceValidators"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Stridelabs.stride.stakeibc.Tx.MsgRebalanceValidators.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Stridelabs.stride.stakeibc.Tx.MsgRebalanceValidatorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RebalanceValidators"))
              .build();
        }
      }
    }
    return getRebalanceValidatorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Stridelabs.stride.stakeibc.Tx.MsgAddValidator,
      Stridelabs.stride.stakeibc.Tx.MsgAddValidatorResponse> getAddValidatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddValidator",
      requestType = Stridelabs.stride.stakeibc.Tx.MsgAddValidator.class,
      responseType = Stridelabs.stride.stakeibc.Tx.MsgAddValidatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Stridelabs.stride.stakeibc.Tx.MsgAddValidator,
      Stridelabs.stride.stakeibc.Tx.MsgAddValidatorResponse> getAddValidatorMethod() {
    io.grpc.MethodDescriptor<Stridelabs.stride.stakeibc.Tx.MsgAddValidator, Stridelabs.stride.stakeibc.Tx.MsgAddValidatorResponse> getAddValidatorMethod;
    if ((getAddValidatorMethod = MsgGrpc.getAddValidatorMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddValidatorMethod = MsgGrpc.getAddValidatorMethod) == null) {
          MsgGrpc.getAddValidatorMethod = getAddValidatorMethod =
              io.grpc.MethodDescriptor.<Stridelabs.stride.stakeibc.Tx.MsgAddValidator, Stridelabs.stride.stakeibc.Tx.MsgAddValidatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddValidator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Stridelabs.stride.stakeibc.Tx.MsgAddValidator.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Stridelabs.stride.stakeibc.Tx.MsgAddValidatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddValidator"))
              .build();
        }
      }
    }
    return getAddValidatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Stridelabs.stride.stakeibc.Tx.MsgChangeValidatorWeight,
      Stridelabs.stride.stakeibc.Tx.MsgChangeValidatorWeightResponse> getChangeValidatorWeightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeValidatorWeight",
      requestType = Stridelabs.stride.stakeibc.Tx.MsgChangeValidatorWeight.class,
      responseType = Stridelabs.stride.stakeibc.Tx.MsgChangeValidatorWeightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Stridelabs.stride.stakeibc.Tx.MsgChangeValidatorWeight,
      Stridelabs.stride.stakeibc.Tx.MsgChangeValidatorWeightResponse> getChangeValidatorWeightMethod() {
    io.grpc.MethodDescriptor<Stridelabs.stride.stakeibc.Tx.MsgChangeValidatorWeight, Stridelabs.stride.stakeibc.Tx.MsgChangeValidatorWeightResponse> getChangeValidatorWeightMethod;
    if ((getChangeValidatorWeightMethod = MsgGrpc.getChangeValidatorWeightMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getChangeValidatorWeightMethod = MsgGrpc.getChangeValidatorWeightMethod) == null) {
          MsgGrpc.getChangeValidatorWeightMethod = getChangeValidatorWeightMethod =
              io.grpc.MethodDescriptor.<Stridelabs.stride.stakeibc.Tx.MsgChangeValidatorWeight, Stridelabs.stride.stakeibc.Tx.MsgChangeValidatorWeightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangeValidatorWeight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Stridelabs.stride.stakeibc.Tx.MsgChangeValidatorWeight.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Stridelabs.stride.stakeibc.Tx.MsgChangeValidatorWeightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ChangeValidatorWeight"))
              .build();
        }
      }
    }
    return getChangeValidatorWeightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Stridelabs.stride.stakeibc.Tx.MsgDeleteValidator,
      Stridelabs.stride.stakeibc.Tx.MsgDeleteValidatorResponse> getDeleteValidatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteValidator",
      requestType = Stridelabs.stride.stakeibc.Tx.MsgDeleteValidator.class,
      responseType = Stridelabs.stride.stakeibc.Tx.MsgDeleteValidatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Stridelabs.stride.stakeibc.Tx.MsgDeleteValidator,
      Stridelabs.stride.stakeibc.Tx.MsgDeleteValidatorResponse> getDeleteValidatorMethod() {
    io.grpc.MethodDescriptor<Stridelabs.stride.stakeibc.Tx.MsgDeleteValidator, Stridelabs.stride.stakeibc.Tx.MsgDeleteValidatorResponse> getDeleteValidatorMethod;
    if ((getDeleteValidatorMethod = MsgGrpc.getDeleteValidatorMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteValidatorMethod = MsgGrpc.getDeleteValidatorMethod) == null) {
          MsgGrpc.getDeleteValidatorMethod = getDeleteValidatorMethod =
              io.grpc.MethodDescriptor.<Stridelabs.stride.stakeibc.Tx.MsgDeleteValidator, Stridelabs.stride.stakeibc.Tx.MsgDeleteValidatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteValidator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Stridelabs.stride.stakeibc.Tx.MsgDeleteValidator.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Stridelabs.stride.stakeibc.Tx.MsgDeleteValidatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteValidator"))
              .build();
        }
      }
    }
    return getDeleteValidatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Stridelabs.stride.stakeibc.Tx.MsgRestoreInterchainAccount,
      Stridelabs.stride.stakeibc.Tx.MsgRestoreInterchainAccountResponse> getRestoreInterchainAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RestoreInterchainAccount",
      requestType = Stridelabs.stride.stakeibc.Tx.MsgRestoreInterchainAccount.class,
      responseType = Stridelabs.stride.stakeibc.Tx.MsgRestoreInterchainAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Stridelabs.stride.stakeibc.Tx.MsgRestoreInterchainAccount,
      Stridelabs.stride.stakeibc.Tx.MsgRestoreInterchainAccountResponse> getRestoreInterchainAccountMethod() {
    io.grpc.MethodDescriptor<Stridelabs.stride.stakeibc.Tx.MsgRestoreInterchainAccount, Stridelabs.stride.stakeibc.Tx.MsgRestoreInterchainAccountResponse> getRestoreInterchainAccountMethod;
    if ((getRestoreInterchainAccountMethod = MsgGrpc.getRestoreInterchainAccountMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRestoreInterchainAccountMethod = MsgGrpc.getRestoreInterchainAccountMethod) == null) {
          MsgGrpc.getRestoreInterchainAccountMethod = getRestoreInterchainAccountMethod =
              io.grpc.MethodDescriptor.<Stridelabs.stride.stakeibc.Tx.MsgRestoreInterchainAccount, Stridelabs.stride.stakeibc.Tx.MsgRestoreInterchainAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RestoreInterchainAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Stridelabs.stride.stakeibc.Tx.MsgRestoreInterchainAccount.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Stridelabs.stride.stakeibc.Tx.MsgRestoreInterchainAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RestoreInterchainAccount"))
              .build();
        }
      }
    }
    return getRestoreInterchainAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Stridelabs.stride.stakeibc.Tx.MsgUpdateValidatorSharesExchRate,
      Stridelabs.stride.stakeibc.Tx.MsgUpdateValidatorSharesExchRateResponse> getUpdateValidatorSharesExchRateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateValidatorSharesExchRate",
      requestType = Stridelabs.stride.stakeibc.Tx.MsgUpdateValidatorSharesExchRate.class,
      responseType = Stridelabs.stride.stakeibc.Tx.MsgUpdateValidatorSharesExchRateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Stridelabs.stride.stakeibc.Tx.MsgUpdateValidatorSharesExchRate,
      Stridelabs.stride.stakeibc.Tx.MsgUpdateValidatorSharesExchRateResponse> getUpdateValidatorSharesExchRateMethod() {
    io.grpc.MethodDescriptor<Stridelabs.stride.stakeibc.Tx.MsgUpdateValidatorSharesExchRate, Stridelabs.stride.stakeibc.Tx.MsgUpdateValidatorSharesExchRateResponse> getUpdateValidatorSharesExchRateMethod;
    if ((getUpdateValidatorSharesExchRateMethod = MsgGrpc.getUpdateValidatorSharesExchRateMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateValidatorSharesExchRateMethod = MsgGrpc.getUpdateValidatorSharesExchRateMethod) == null) {
          MsgGrpc.getUpdateValidatorSharesExchRateMethod = getUpdateValidatorSharesExchRateMethod =
              io.grpc.MethodDescriptor.<Stridelabs.stride.stakeibc.Tx.MsgUpdateValidatorSharesExchRate, Stridelabs.stride.stakeibc.Tx.MsgUpdateValidatorSharesExchRateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateValidatorSharesExchRate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Stridelabs.stride.stakeibc.Tx.MsgUpdateValidatorSharesExchRate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Stridelabs.stride.stakeibc.Tx.MsgUpdateValidatorSharesExchRateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateValidatorSharesExchRate"))
              .build();
        }
      }
    }
    return getUpdateValidatorSharesExchRateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Stridelabs.stride.stakeibc.Tx.MsgClearBalance,
      Stridelabs.stride.stakeibc.Tx.MsgClearBalanceResponse> getClearBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClearBalance",
      requestType = Stridelabs.stride.stakeibc.Tx.MsgClearBalance.class,
      responseType = Stridelabs.stride.stakeibc.Tx.MsgClearBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Stridelabs.stride.stakeibc.Tx.MsgClearBalance,
      Stridelabs.stride.stakeibc.Tx.MsgClearBalanceResponse> getClearBalanceMethod() {
    io.grpc.MethodDescriptor<Stridelabs.stride.stakeibc.Tx.MsgClearBalance, Stridelabs.stride.stakeibc.Tx.MsgClearBalanceResponse> getClearBalanceMethod;
    if ((getClearBalanceMethod = MsgGrpc.getClearBalanceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClearBalanceMethod = MsgGrpc.getClearBalanceMethod) == null) {
          MsgGrpc.getClearBalanceMethod = getClearBalanceMethod =
              io.grpc.MethodDescriptor.<Stridelabs.stride.stakeibc.Tx.MsgClearBalance, Stridelabs.stride.stakeibc.Tx.MsgClearBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClearBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Stridelabs.stride.stakeibc.Tx.MsgClearBalance.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Stridelabs.stride.stakeibc.Tx.MsgClearBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ClearBalance"))
              .build();
        }
      }
    }
    return getClearBalanceMethod;
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
    public void liquidStake(Stridelabs.stride.stakeibc.Tx.MsgLiquidStake request,
        io.grpc.stub.StreamObserver<Stridelabs.stride.stakeibc.Tx.MsgLiquidStakeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLiquidStakeMethod(), responseObserver);
    }

    /**
     */
    public void redeemStake(Stridelabs.stride.stakeibc.Tx.MsgRedeemStake request,
        io.grpc.stub.StreamObserver<Stridelabs.stride.stakeibc.Tx.MsgRedeemStakeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRedeemStakeMethod(), responseObserver);
    }

    /**
     * <pre>
     * TODO(TEST-53): Remove this pre-launch (no need for clients to create / interact with ICAs)
     * </pre>
     */
    public void registerHostZone(Stridelabs.stride.stakeibc.Tx.MsgRegisterHostZone request,
        io.grpc.stub.StreamObserver<Stridelabs.stride.stakeibc.Tx.MsgRegisterHostZoneResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterHostZoneMethod(), responseObserver);
    }

    /**
     */
    public void claimUndelegatedTokens(Stridelabs.stride.stakeibc.Tx.MsgClaimUndelegatedTokens request,
        io.grpc.stub.StreamObserver<Stridelabs.stride.stakeibc.Tx.MsgClaimUndelegatedTokensResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClaimUndelegatedTokensMethod(), responseObserver);
    }

    /**
     */
    public void rebalanceValidators(Stridelabs.stride.stakeibc.Tx.MsgRebalanceValidators request,
        io.grpc.stub.StreamObserver<Stridelabs.stride.stakeibc.Tx.MsgRebalanceValidatorsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRebalanceValidatorsMethod(), responseObserver);
    }

    /**
     */
    public void addValidator(Stridelabs.stride.stakeibc.Tx.MsgAddValidator request,
        io.grpc.stub.StreamObserver<Stridelabs.stride.stakeibc.Tx.MsgAddValidatorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddValidatorMethod(), responseObserver);
    }

    /**
     */
    public void changeValidatorWeight(Stridelabs.stride.stakeibc.Tx.MsgChangeValidatorWeight request,
        io.grpc.stub.StreamObserver<Stridelabs.stride.stakeibc.Tx.MsgChangeValidatorWeightResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeValidatorWeightMethod(), responseObserver);
    }

    /**
     */
    public void deleteValidator(Stridelabs.stride.stakeibc.Tx.MsgDeleteValidator request,
        io.grpc.stub.StreamObserver<Stridelabs.stride.stakeibc.Tx.MsgDeleteValidatorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteValidatorMethod(), responseObserver);
    }

    /**
     */
    public void restoreInterchainAccount(Stridelabs.stride.stakeibc.Tx.MsgRestoreInterchainAccount request,
        io.grpc.stub.StreamObserver<Stridelabs.stride.stakeibc.Tx.MsgRestoreInterchainAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRestoreInterchainAccountMethod(), responseObserver);
    }

    /**
     */
    public void updateValidatorSharesExchRate(Stridelabs.stride.stakeibc.Tx.MsgUpdateValidatorSharesExchRate request,
        io.grpc.stub.StreamObserver<Stridelabs.stride.stakeibc.Tx.MsgUpdateValidatorSharesExchRateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateValidatorSharesExchRateMethod(), responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void clearBalance(Stridelabs.stride.stakeibc.Tx.MsgClearBalance request,
        io.grpc.stub.StreamObserver<Stridelabs.stride.stakeibc.Tx.MsgClearBalanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClearBalanceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLiquidStakeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Stridelabs.stride.stakeibc.Tx.MsgLiquidStake,
                Stridelabs.stride.stakeibc.Tx.MsgLiquidStakeResponse>(
                  this, METHODID_LIQUID_STAKE)))
          .addMethod(
            getRedeemStakeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Stridelabs.stride.stakeibc.Tx.MsgRedeemStake,
                Stridelabs.stride.stakeibc.Tx.MsgRedeemStakeResponse>(
                  this, METHODID_REDEEM_STAKE)))
          .addMethod(
            getRegisterHostZoneMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Stridelabs.stride.stakeibc.Tx.MsgRegisterHostZone,
                Stridelabs.stride.stakeibc.Tx.MsgRegisterHostZoneResponse>(
                  this, METHODID_REGISTER_HOST_ZONE)))
          .addMethod(
            getClaimUndelegatedTokensMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Stridelabs.stride.stakeibc.Tx.MsgClaimUndelegatedTokens,
                Stridelabs.stride.stakeibc.Tx.MsgClaimUndelegatedTokensResponse>(
                  this, METHODID_CLAIM_UNDELEGATED_TOKENS)))
          .addMethod(
            getRebalanceValidatorsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Stridelabs.stride.stakeibc.Tx.MsgRebalanceValidators,
                Stridelabs.stride.stakeibc.Tx.MsgRebalanceValidatorsResponse>(
                  this, METHODID_REBALANCE_VALIDATORS)))
          .addMethod(
            getAddValidatorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Stridelabs.stride.stakeibc.Tx.MsgAddValidator,
                Stridelabs.stride.stakeibc.Tx.MsgAddValidatorResponse>(
                  this, METHODID_ADD_VALIDATOR)))
          .addMethod(
            getChangeValidatorWeightMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Stridelabs.stride.stakeibc.Tx.MsgChangeValidatorWeight,
                Stridelabs.stride.stakeibc.Tx.MsgChangeValidatorWeightResponse>(
                  this, METHODID_CHANGE_VALIDATOR_WEIGHT)))
          .addMethod(
            getDeleteValidatorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Stridelabs.stride.stakeibc.Tx.MsgDeleteValidator,
                Stridelabs.stride.stakeibc.Tx.MsgDeleteValidatorResponse>(
                  this, METHODID_DELETE_VALIDATOR)))
          .addMethod(
            getRestoreInterchainAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Stridelabs.stride.stakeibc.Tx.MsgRestoreInterchainAccount,
                Stridelabs.stride.stakeibc.Tx.MsgRestoreInterchainAccountResponse>(
                  this, METHODID_RESTORE_INTERCHAIN_ACCOUNT)))
          .addMethod(
            getUpdateValidatorSharesExchRateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Stridelabs.stride.stakeibc.Tx.MsgUpdateValidatorSharesExchRate,
                Stridelabs.stride.stakeibc.Tx.MsgUpdateValidatorSharesExchRateResponse>(
                  this, METHODID_UPDATE_VALIDATOR_SHARES_EXCH_RATE)))
          .addMethod(
            getClearBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Stridelabs.stride.stakeibc.Tx.MsgClearBalance,
                Stridelabs.stride.stakeibc.Tx.MsgClearBalanceResponse>(
                  this, METHODID_CLEAR_BALANCE)))
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
    public void liquidStake(Stridelabs.stride.stakeibc.Tx.MsgLiquidStake request,
        io.grpc.stub.StreamObserver<Stridelabs.stride.stakeibc.Tx.MsgLiquidStakeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLiquidStakeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void redeemStake(Stridelabs.stride.stakeibc.Tx.MsgRedeemStake request,
        io.grpc.stub.StreamObserver<Stridelabs.stride.stakeibc.Tx.MsgRedeemStakeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRedeemStakeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TODO(TEST-53): Remove this pre-launch (no need for clients to create / interact with ICAs)
     * </pre>
     */
    public void registerHostZone(Stridelabs.stride.stakeibc.Tx.MsgRegisterHostZone request,
        io.grpc.stub.StreamObserver<Stridelabs.stride.stakeibc.Tx.MsgRegisterHostZoneResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterHostZoneMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void claimUndelegatedTokens(Stridelabs.stride.stakeibc.Tx.MsgClaimUndelegatedTokens request,
        io.grpc.stub.StreamObserver<Stridelabs.stride.stakeibc.Tx.MsgClaimUndelegatedTokensResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClaimUndelegatedTokensMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rebalanceValidators(Stridelabs.stride.stakeibc.Tx.MsgRebalanceValidators request,
        io.grpc.stub.StreamObserver<Stridelabs.stride.stakeibc.Tx.MsgRebalanceValidatorsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRebalanceValidatorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addValidator(Stridelabs.stride.stakeibc.Tx.MsgAddValidator request,
        io.grpc.stub.StreamObserver<Stridelabs.stride.stakeibc.Tx.MsgAddValidatorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddValidatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeValidatorWeight(Stridelabs.stride.stakeibc.Tx.MsgChangeValidatorWeight request,
        io.grpc.stub.StreamObserver<Stridelabs.stride.stakeibc.Tx.MsgChangeValidatorWeightResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeValidatorWeightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteValidator(Stridelabs.stride.stakeibc.Tx.MsgDeleteValidator request,
        io.grpc.stub.StreamObserver<Stridelabs.stride.stakeibc.Tx.MsgDeleteValidatorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteValidatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void restoreInterchainAccount(Stridelabs.stride.stakeibc.Tx.MsgRestoreInterchainAccount request,
        io.grpc.stub.StreamObserver<Stridelabs.stride.stakeibc.Tx.MsgRestoreInterchainAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRestoreInterchainAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateValidatorSharesExchRate(Stridelabs.stride.stakeibc.Tx.MsgUpdateValidatorSharesExchRate request,
        io.grpc.stub.StreamObserver<Stridelabs.stride.stakeibc.Tx.MsgUpdateValidatorSharesExchRateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateValidatorSharesExchRateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void clearBalance(Stridelabs.stride.stakeibc.Tx.MsgClearBalance request,
        io.grpc.stub.StreamObserver<Stridelabs.stride.stakeibc.Tx.MsgClearBalanceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClearBalanceMethod(), getCallOptions()), request, responseObserver);
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
    public Stridelabs.stride.stakeibc.Tx.MsgLiquidStakeResponse liquidStake(Stridelabs.stride.stakeibc.Tx.MsgLiquidStake request) {
      return blockingUnaryCall(
          getChannel(), getLiquidStakeMethod(), getCallOptions(), request);
    }

    /**
     */
    public Stridelabs.stride.stakeibc.Tx.MsgRedeemStakeResponse redeemStake(Stridelabs.stride.stakeibc.Tx.MsgRedeemStake request) {
      return blockingUnaryCall(
          getChannel(), getRedeemStakeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TODO(TEST-53): Remove this pre-launch (no need for clients to create / interact with ICAs)
     * </pre>
     */
    public Stridelabs.stride.stakeibc.Tx.MsgRegisterHostZoneResponse registerHostZone(Stridelabs.stride.stakeibc.Tx.MsgRegisterHostZone request) {
      return blockingUnaryCall(
          getChannel(), getRegisterHostZoneMethod(), getCallOptions(), request);
    }

    /**
     */
    public Stridelabs.stride.stakeibc.Tx.MsgClaimUndelegatedTokensResponse claimUndelegatedTokens(Stridelabs.stride.stakeibc.Tx.MsgClaimUndelegatedTokens request) {
      return blockingUnaryCall(
          getChannel(), getClaimUndelegatedTokensMethod(), getCallOptions(), request);
    }

    /**
     */
    public Stridelabs.stride.stakeibc.Tx.MsgRebalanceValidatorsResponse rebalanceValidators(Stridelabs.stride.stakeibc.Tx.MsgRebalanceValidators request) {
      return blockingUnaryCall(
          getChannel(), getRebalanceValidatorsMethod(), getCallOptions(), request);
    }

    /**
     */
    public Stridelabs.stride.stakeibc.Tx.MsgAddValidatorResponse addValidator(Stridelabs.stride.stakeibc.Tx.MsgAddValidator request) {
      return blockingUnaryCall(
          getChannel(), getAddValidatorMethod(), getCallOptions(), request);
    }

    /**
     */
    public Stridelabs.stride.stakeibc.Tx.MsgChangeValidatorWeightResponse changeValidatorWeight(Stridelabs.stride.stakeibc.Tx.MsgChangeValidatorWeight request) {
      return blockingUnaryCall(
          getChannel(), getChangeValidatorWeightMethod(), getCallOptions(), request);
    }

    /**
     */
    public Stridelabs.stride.stakeibc.Tx.MsgDeleteValidatorResponse deleteValidator(Stridelabs.stride.stakeibc.Tx.MsgDeleteValidator request) {
      return blockingUnaryCall(
          getChannel(), getDeleteValidatorMethod(), getCallOptions(), request);
    }

    /**
     */
    public Stridelabs.stride.stakeibc.Tx.MsgRestoreInterchainAccountResponse restoreInterchainAccount(Stridelabs.stride.stakeibc.Tx.MsgRestoreInterchainAccount request) {
      return blockingUnaryCall(
          getChannel(), getRestoreInterchainAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public Stridelabs.stride.stakeibc.Tx.MsgUpdateValidatorSharesExchRateResponse updateValidatorSharesExchRate(Stridelabs.stride.stakeibc.Tx.MsgUpdateValidatorSharesExchRate request) {
      return blockingUnaryCall(
          getChannel(), getUpdateValidatorSharesExchRateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public Stridelabs.stride.stakeibc.Tx.MsgClearBalanceResponse clearBalance(Stridelabs.stride.stakeibc.Tx.MsgClearBalance request) {
      return blockingUnaryCall(
          getChannel(), getClearBalanceMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<Stridelabs.stride.stakeibc.Tx.MsgLiquidStakeResponse> liquidStake(
        Stridelabs.stride.stakeibc.Tx.MsgLiquidStake request) {
      return futureUnaryCall(
          getChannel().newCall(getLiquidStakeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Stridelabs.stride.stakeibc.Tx.MsgRedeemStakeResponse> redeemStake(
        Stridelabs.stride.stakeibc.Tx.MsgRedeemStake request) {
      return futureUnaryCall(
          getChannel().newCall(getRedeemStakeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TODO(TEST-53): Remove this pre-launch (no need for clients to create / interact with ICAs)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Stridelabs.stride.stakeibc.Tx.MsgRegisterHostZoneResponse> registerHostZone(
        Stridelabs.stride.stakeibc.Tx.MsgRegisterHostZone request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterHostZoneMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Stridelabs.stride.stakeibc.Tx.MsgClaimUndelegatedTokensResponse> claimUndelegatedTokens(
        Stridelabs.stride.stakeibc.Tx.MsgClaimUndelegatedTokens request) {
      return futureUnaryCall(
          getChannel().newCall(getClaimUndelegatedTokensMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Stridelabs.stride.stakeibc.Tx.MsgRebalanceValidatorsResponse> rebalanceValidators(
        Stridelabs.stride.stakeibc.Tx.MsgRebalanceValidators request) {
      return futureUnaryCall(
          getChannel().newCall(getRebalanceValidatorsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Stridelabs.stride.stakeibc.Tx.MsgAddValidatorResponse> addValidator(
        Stridelabs.stride.stakeibc.Tx.MsgAddValidator request) {
      return futureUnaryCall(
          getChannel().newCall(getAddValidatorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Stridelabs.stride.stakeibc.Tx.MsgChangeValidatorWeightResponse> changeValidatorWeight(
        Stridelabs.stride.stakeibc.Tx.MsgChangeValidatorWeight request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeValidatorWeightMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Stridelabs.stride.stakeibc.Tx.MsgDeleteValidatorResponse> deleteValidator(
        Stridelabs.stride.stakeibc.Tx.MsgDeleteValidator request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteValidatorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Stridelabs.stride.stakeibc.Tx.MsgRestoreInterchainAccountResponse> restoreInterchainAccount(
        Stridelabs.stride.stakeibc.Tx.MsgRestoreInterchainAccount request) {
      return futureUnaryCall(
          getChannel().newCall(getRestoreInterchainAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Stridelabs.stride.stakeibc.Tx.MsgUpdateValidatorSharesExchRateResponse> updateValidatorSharesExchRate(
        Stridelabs.stride.stakeibc.Tx.MsgUpdateValidatorSharesExchRate request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateValidatorSharesExchRateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Stridelabs.stride.stakeibc.Tx.MsgClearBalanceResponse> clearBalance(
        Stridelabs.stride.stakeibc.Tx.MsgClearBalance request) {
      return futureUnaryCall(
          getChannel().newCall(getClearBalanceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIQUID_STAKE = 0;
  private static final int METHODID_REDEEM_STAKE = 1;
  private static final int METHODID_REGISTER_HOST_ZONE = 2;
  private static final int METHODID_CLAIM_UNDELEGATED_TOKENS = 3;
  private static final int METHODID_REBALANCE_VALIDATORS = 4;
  private static final int METHODID_ADD_VALIDATOR = 5;
  private static final int METHODID_CHANGE_VALIDATOR_WEIGHT = 6;
  private static final int METHODID_DELETE_VALIDATOR = 7;
  private static final int METHODID_RESTORE_INTERCHAIN_ACCOUNT = 8;
  private static final int METHODID_UPDATE_VALIDATOR_SHARES_EXCH_RATE = 9;
  private static final int METHODID_CLEAR_BALANCE = 10;

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
        case METHODID_LIQUID_STAKE:
          serviceImpl.liquidStake((Stridelabs.stride.stakeibc.Tx.MsgLiquidStake) request,
              (io.grpc.stub.StreamObserver<Stridelabs.stride.stakeibc.Tx.MsgLiquidStakeResponse>) responseObserver);
          break;
        case METHODID_REDEEM_STAKE:
          serviceImpl.redeemStake((Stridelabs.stride.stakeibc.Tx.MsgRedeemStake) request,
              (io.grpc.stub.StreamObserver<Stridelabs.stride.stakeibc.Tx.MsgRedeemStakeResponse>) responseObserver);
          break;
        case METHODID_REGISTER_HOST_ZONE:
          serviceImpl.registerHostZone((Stridelabs.stride.stakeibc.Tx.MsgRegisterHostZone) request,
              (io.grpc.stub.StreamObserver<Stridelabs.stride.stakeibc.Tx.MsgRegisterHostZoneResponse>) responseObserver);
          break;
        case METHODID_CLAIM_UNDELEGATED_TOKENS:
          serviceImpl.claimUndelegatedTokens((Stridelabs.stride.stakeibc.Tx.MsgClaimUndelegatedTokens) request,
              (io.grpc.stub.StreamObserver<Stridelabs.stride.stakeibc.Tx.MsgClaimUndelegatedTokensResponse>) responseObserver);
          break;
        case METHODID_REBALANCE_VALIDATORS:
          serviceImpl.rebalanceValidators((Stridelabs.stride.stakeibc.Tx.MsgRebalanceValidators) request,
              (io.grpc.stub.StreamObserver<Stridelabs.stride.stakeibc.Tx.MsgRebalanceValidatorsResponse>) responseObserver);
          break;
        case METHODID_ADD_VALIDATOR:
          serviceImpl.addValidator((Stridelabs.stride.stakeibc.Tx.MsgAddValidator) request,
              (io.grpc.stub.StreamObserver<Stridelabs.stride.stakeibc.Tx.MsgAddValidatorResponse>) responseObserver);
          break;
        case METHODID_CHANGE_VALIDATOR_WEIGHT:
          serviceImpl.changeValidatorWeight((Stridelabs.stride.stakeibc.Tx.MsgChangeValidatorWeight) request,
              (io.grpc.stub.StreamObserver<Stridelabs.stride.stakeibc.Tx.MsgChangeValidatorWeightResponse>) responseObserver);
          break;
        case METHODID_DELETE_VALIDATOR:
          serviceImpl.deleteValidator((Stridelabs.stride.stakeibc.Tx.MsgDeleteValidator) request,
              (io.grpc.stub.StreamObserver<Stridelabs.stride.stakeibc.Tx.MsgDeleteValidatorResponse>) responseObserver);
          break;
        case METHODID_RESTORE_INTERCHAIN_ACCOUNT:
          serviceImpl.restoreInterchainAccount((Stridelabs.stride.stakeibc.Tx.MsgRestoreInterchainAccount) request,
              (io.grpc.stub.StreamObserver<Stridelabs.stride.stakeibc.Tx.MsgRestoreInterchainAccountResponse>) responseObserver);
          break;
        case METHODID_UPDATE_VALIDATOR_SHARES_EXCH_RATE:
          serviceImpl.updateValidatorSharesExchRate((Stridelabs.stride.stakeibc.Tx.MsgUpdateValidatorSharesExchRate) request,
              (io.grpc.stub.StreamObserver<Stridelabs.stride.stakeibc.Tx.MsgUpdateValidatorSharesExchRateResponse>) responseObserver);
          break;
        case METHODID_CLEAR_BALANCE:
          serviceImpl.clearBalance((Stridelabs.stride.stakeibc.Tx.MsgClearBalance) request,
              (io.grpc.stub.StreamObserver<Stridelabs.stride.stakeibc.Tx.MsgClearBalanceResponse>) responseObserver);
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
      return Stridelabs.stride.stakeibc.Tx.getDescriptor();
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
              .addMethod(getLiquidStakeMethod())
              .addMethod(getRedeemStakeMethod())
              .addMethod(getRegisterHostZoneMethod())
              .addMethod(getClaimUndelegatedTokensMethod())
              .addMethod(getRebalanceValidatorsMethod())
              .addMethod(getAddValidatorMethod())
              .addMethod(getChangeValidatorWeightMethod())
              .addMethod(getDeleteValidatorMethod())
              .addMethod(getRestoreInterchainAccountMethod())
              .addMethod(getUpdateValidatorSharesExchRateMethod())
              .addMethod(getClearBalanceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
