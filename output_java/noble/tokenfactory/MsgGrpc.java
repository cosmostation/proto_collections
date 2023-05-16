package noble.tokenfactory;

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
    comments = "Source: noble/tokenfactory/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "noble.tokenfactory.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgUpdateMasterMinter,
      noble.tokenfactory.Tx.MsgUpdateMasterMinterResponse> getUpdateMasterMinterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMasterMinter",
      requestType = noble.tokenfactory.Tx.MsgUpdateMasterMinter.class,
      responseType = noble.tokenfactory.Tx.MsgUpdateMasterMinterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgUpdateMasterMinter,
      noble.tokenfactory.Tx.MsgUpdateMasterMinterResponse> getUpdateMasterMinterMethod() {
    io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgUpdateMasterMinter, noble.tokenfactory.Tx.MsgUpdateMasterMinterResponse> getUpdateMasterMinterMethod;
    if ((getUpdateMasterMinterMethod = MsgGrpc.getUpdateMasterMinterMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateMasterMinterMethod = MsgGrpc.getUpdateMasterMinterMethod) == null) {
          MsgGrpc.getUpdateMasterMinterMethod = getUpdateMasterMinterMethod =
              io.grpc.MethodDescriptor.<noble.tokenfactory.Tx.MsgUpdateMasterMinter, noble.tokenfactory.Tx.MsgUpdateMasterMinterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMasterMinter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.Tx.MsgUpdateMasterMinter.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.Tx.MsgUpdateMasterMinterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateMasterMinter"))
              .build();
        }
      }
    }
    return getUpdateMasterMinterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgUpdatePauser,
      noble.tokenfactory.Tx.MsgUpdatePauserResponse> getUpdatePauserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePauser",
      requestType = noble.tokenfactory.Tx.MsgUpdatePauser.class,
      responseType = noble.tokenfactory.Tx.MsgUpdatePauserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgUpdatePauser,
      noble.tokenfactory.Tx.MsgUpdatePauserResponse> getUpdatePauserMethod() {
    io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgUpdatePauser, noble.tokenfactory.Tx.MsgUpdatePauserResponse> getUpdatePauserMethod;
    if ((getUpdatePauserMethod = MsgGrpc.getUpdatePauserMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdatePauserMethod = MsgGrpc.getUpdatePauserMethod) == null) {
          MsgGrpc.getUpdatePauserMethod = getUpdatePauserMethod =
              io.grpc.MethodDescriptor.<noble.tokenfactory.Tx.MsgUpdatePauser, noble.tokenfactory.Tx.MsgUpdatePauserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePauser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.Tx.MsgUpdatePauser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.Tx.MsgUpdatePauserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdatePauser"))
              .build();
        }
      }
    }
    return getUpdatePauserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgUpdateBlacklister,
      noble.tokenfactory.Tx.MsgUpdateBlacklisterResponse> getUpdateBlacklisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBlacklister",
      requestType = noble.tokenfactory.Tx.MsgUpdateBlacklister.class,
      responseType = noble.tokenfactory.Tx.MsgUpdateBlacklisterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgUpdateBlacklister,
      noble.tokenfactory.Tx.MsgUpdateBlacklisterResponse> getUpdateBlacklisterMethod() {
    io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgUpdateBlacklister, noble.tokenfactory.Tx.MsgUpdateBlacklisterResponse> getUpdateBlacklisterMethod;
    if ((getUpdateBlacklisterMethod = MsgGrpc.getUpdateBlacklisterMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateBlacklisterMethod = MsgGrpc.getUpdateBlacklisterMethod) == null) {
          MsgGrpc.getUpdateBlacklisterMethod = getUpdateBlacklisterMethod =
              io.grpc.MethodDescriptor.<noble.tokenfactory.Tx.MsgUpdateBlacklister, noble.tokenfactory.Tx.MsgUpdateBlacklisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBlacklister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.Tx.MsgUpdateBlacklister.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.Tx.MsgUpdateBlacklisterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateBlacklister"))
              .build();
        }
      }
    }
    return getUpdateBlacklisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgUpdateOwner,
      noble.tokenfactory.Tx.MsgUpdateOwnerResponse> getUpdateOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOwner",
      requestType = noble.tokenfactory.Tx.MsgUpdateOwner.class,
      responseType = noble.tokenfactory.Tx.MsgUpdateOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgUpdateOwner,
      noble.tokenfactory.Tx.MsgUpdateOwnerResponse> getUpdateOwnerMethod() {
    io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgUpdateOwner, noble.tokenfactory.Tx.MsgUpdateOwnerResponse> getUpdateOwnerMethod;
    if ((getUpdateOwnerMethod = MsgGrpc.getUpdateOwnerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateOwnerMethod = MsgGrpc.getUpdateOwnerMethod) == null) {
          MsgGrpc.getUpdateOwnerMethod = getUpdateOwnerMethod =
              io.grpc.MethodDescriptor.<noble.tokenfactory.Tx.MsgUpdateOwner, noble.tokenfactory.Tx.MsgUpdateOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.Tx.MsgUpdateOwner.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.Tx.MsgUpdateOwnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateOwner"))
              .build();
        }
      }
    }
    return getUpdateOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgAcceptOwner,
      noble.tokenfactory.Tx.MsgAcceptOwnerResponse> getAcceptOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AcceptOwner",
      requestType = noble.tokenfactory.Tx.MsgAcceptOwner.class,
      responseType = noble.tokenfactory.Tx.MsgAcceptOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgAcceptOwner,
      noble.tokenfactory.Tx.MsgAcceptOwnerResponse> getAcceptOwnerMethod() {
    io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgAcceptOwner, noble.tokenfactory.Tx.MsgAcceptOwnerResponse> getAcceptOwnerMethod;
    if ((getAcceptOwnerMethod = MsgGrpc.getAcceptOwnerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAcceptOwnerMethod = MsgGrpc.getAcceptOwnerMethod) == null) {
          MsgGrpc.getAcceptOwnerMethod = getAcceptOwnerMethod =
              io.grpc.MethodDescriptor.<noble.tokenfactory.Tx.MsgAcceptOwner, noble.tokenfactory.Tx.MsgAcceptOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AcceptOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.Tx.MsgAcceptOwner.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.Tx.MsgAcceptOwnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AcceptOwner"))
              .build();
        }
      }
    }
    return getAcceptOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgConfigureMinter,
      noble.tokenfactory.Tx.MsgConfigureMinterResponse> getConfigureMinterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfigureMinter",
      requestType = noble.tokenfactory.Tx.MsgConfigureMinter.class,
      responseType = noble.tokenfactory.Tx.MsgConfigureMinterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgConfigureMinter,
      noble.tokenfactory.Tx.MsgConfigureMinterResponse> getConfigureMinterMethod() {
    io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgConfigureMinter, noble.tokenfactory.Tx.MsgConfigureMinterResponse> getConfigureMinterMethod;
    if ((getConfigureMinterMethod = MsgGrpc.getConfigureMinterMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getConfigureMinterMethod = MsgGrpc.getConfigureMinterMethod) == null) {
          MsgGrpc.getConfigureMinterMethod = getConfigureMinterMethod =
              io.grpc.MethodDescriptor.<noble.tokenfactory.Tx.MsgConfigureMinter, noble.tokenfactory.Tx.MsgConfigureMinterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfigureMinter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.Tx.MsgConfigureMinter.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.Tx.MsgConfigureMinterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ConfigureMinter"))
              .build();
        }
      }
    }
    return getConfigureMinterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgRemoveMinter,
      noble.tokenfactory.Tx.MsgRemoveMinterResponse> getRemoveMinterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveMinter",
      requestType = noble.tokenfactory.Tx.MsgRemoveMinter.class,
      responseType = noble.tokenfactory.Tx.MsgRemoveMinterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgRemoveMinter,
      noble.tokenfactory.Tx.MsgRemoveMinterResponse> getRemoveMinterMethod() {
    io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgRemoveMinter, noble.tokenfactory.Tx.MsgRemoveMinterResponse> getRemoveMinterMethod;
    if ((getRemoveMinterMethod = MsgGrpc.getRemoveMinterMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemoveMinterMethod = MsgGrpc.getRemoveMinterMethod) == null) {
          MsgGrpc.getRemoveMinterMethod = getRemoveMinterMethod =
              io.grpc.MethodDescriptor.<noble.tokenfactory.Tx.MsgRemoveMinter, noble.tokenfactory.Tx.MsgRemoveMinterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveMinter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.Tx.MsgRemoveMinter.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.Tx.MsgRemoveMinterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemoveMinter"))
              .build();
        }
      }
    }
    return getRemoveMinterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgMint,
      noble.tokenfactory.Tx.MsgMintResponse> getMintMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Mint",
      requestType = noble.tokenfactory.Tx.MsgMint.class,
      responseType = noble.tokenfactory.Tx.MsgMintResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgMint,
      noble.tokenfactory.Tx.MsgMintResponse> getMintMethod() {
    io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgMint, noble.tokenfactory.Tx.MsgMintResponse> getMintMethod;
    if ((getMintMethod = MsgGrpc.getMintMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMintMethod = MsgGrpc.getMintMethod) == null) {
          MsgGrpc.getMintMethod = getMintMethod =
              io.grpc.MethodDescriptor.<noble.tokenfactory.Tx.MsgMint, noble.tokenfactory.Tx.MsgMintResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Mint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.Tx.MsgMint.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.Tx.MsgMintResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Mint"))
              .build();
        }
      }
    }
    return getMintMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgBurn,
      noble.tokenfactory.Tx.MsgBurnResponse> getBurnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Burn",
      requestType = noble.tokenfactory.Tx.MsgBurn.class,
      responseType = noble.tokenfactory.Tx.MsgBurnResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgBurn,
      noble.tokenfactory.Tx.MsgBurnResponse> getBurnMethod() {
    io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgBurn, noble.tokenfactory.Tx.MsgBurnResponse> getBurnMethod;
    if ((getBurnMethod = MsgGrpc.getBurnMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBurnMethod = MsgGrpc.getBurnMethod) == null) {
          MsgGrpc.getBurnMethod = getBurnMethod =
              io.grpc.MethodDescriptor.<noble.tokenfactory.Tx.MsgBurn, noble.tokenfactory.Tx.MsgBurnResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Burn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.Tx.MsgBurn.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.Tx.MsgBurnResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Burn"))
              .build();
        }
      }
    }
    return getBurnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgBlacklist,
      noble.tokenfactory.Tx.MsgBlacklistResponse> getBlacklistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Blacklist",
      requestType = noble.tokenfactory.Tx.MsgBlacklist.class,
      responseType = noble.tokenfactory.Tx.MsgBlacklistResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgBlacklist,
      noble.tokenfactory.Tx.MsgBlacklistResponse> getBlacklistMethod() {
    io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgBlacklist, noble.tokenfactory.Tx.MsgBlacklistResponse> getBlacklistMethod;
    if ((getBlacklistMethod = MsgGrpc.getBlacklistMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBlacklistMethod = MsgGrpc.getBlacklistMethod) == null) {
          MsgGrpc.getBlacklistMethod = getBlacklistMethod =
              io.grpc.MethodDescriptor.<noble.tokenfactory.Tx.MsgBlacklist, noble.tokenfactory.Tx.MsgBlacklistResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Blacklist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.Tx.MsgBlacklist.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.Tx.MsgBlacklistResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Blacklist"))
              .build();
        }
      }
    }
    return getBlacklistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgUnblacklist,
      noble.tokenfactory.Tx.MsgUnblacklistResponse> getUnblacklistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Unblacklist",
      requestType = noble.tokenfactory.Tx.MsgUnblacklist.class,
      responseType = noble.tokenfactory.Tx.MsgUnblacklistResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgUnblacklist,
      noble.tokenfactory.Tx.MsgUnblacklistResponse> getUnblacklistMethod() {
    io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgUnblacklist, noble.tokenfactory.Tx.MsgUnblacklistResponse> getUnblacklistMethod;
    if ((getUnblacklistMethod = MsgGrpc.getUnblacklistMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUnblacklistMethod = MsgGrpc.getUnblacklistMethod) == null) {
          MsgGrpc.getUnblacklistMethod = getUnblacklistMethod =
              io.grpc.MethodDescriptor.<noble.tokenfactory.Tx.MsgUnblacklist, noble.tokenfactory.Tx.MsgUnblacklistResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Unblacklist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.Tx.MsgUnblacklist.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.Tx.MsgUnblacklistResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Unblacklist"))
              .build();
        }
      }
    }
    return getUnblacklistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgPause,
      noble.tokenfactory.Tx.MsgPauseResponse> getPauseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pause",
      requestType = noble.tokenfactory.Tx.MsgPause.class,
      responseType = noble.tokenfactory.Tx.MsgPauseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgPause,
      noble.tokenfactory.Tx.MsgPauseResponse> getPauseMethod() {
    io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgPause, noble.tokenfactory.Tx.MsgPauseResponse> getPauseMethod;
    if ((getPauseMethod = MsgGrpc.getPauseMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getPauseMethod = MsgGrpc.getPauseMethod) == null) {
          MsgGrpc.getPauseMethod = getPauseMethod =
              io.grpc.MethodDescriptor.<noble.tokenfactory.Tx.MsgPause, noble.tokenfactory.Tx.MsgPauseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pause"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.Tx.MsgPause.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.Tx.MsgPauseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Pause"))
              .build();
        }
      }
    }
    return getPauseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgUnpause,
      noble.tokenfactory.Tx.MsgUnpauseResponse> getUnpauseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Unpause",
      requestType = noble.tokenfactory.Tx.MsgUnpause.class,
      responseType = noble.tokenfactory.Tx.MsgUnpauseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgUnpause,
      noble.tokenfactory.Tx.MsgUnpauseResponse> getUnpauseMethod() {
    io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgUnpause, noble.tokenfactory.Tx.MsgUnpauseResponse> getUnpauseMethod;
    if ((getUnpauseMethod = MsgGrpc.getUnpauseMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUnpauseMethod = MsgGrpc.getUnpauseMethod) == null) {
          MsgGrpc.getUnpauseMethod = getUnpauseMethod =
              io.grpc.MethodDescriptor.<noble.tokenfactory.Tx.MsgUnpause, noble.tokenfactory.Tx.MsgUnpauseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Unpause"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.Tx.MsgUnpause.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.Tx.MsgUnpauseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Unpause"))
              .build();
        }
      }
    }
    return getUnpauseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgConfigureMinterController,
      noble.tokenfactory.Tx.MsgConfigureMinterControllerResponse> getConfigureMinterControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfigureMinterController",
      requestType = noble.tokenfactory.Tx.MsgConfigureMinterController.class,
      responseType = noble.tokenfactory.Tx.MsgConfigureMinterControllerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgConfigureMinterController,
      noble.tokenfactory.Tx.MsgConfigureMinterControllerResponse> getConfigureMinterControllerMethod() {
    io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgConfigureMinterController, noble.tokenfactory.Tx.MsgConfigureMinterControllerResponse> getConfigureMinterControllerMethod;
    if ((getConfigureMinterControllerMethod = MsgGrpc.getConfigureMinterControllerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getConfigureMinterControllerMethod = MsgGrpc.getConfigureMinterControllerMethod) == null) {
          MsgGrpc.getConfigureMinterControllerMethod = getConfigureMinterControllerMethod =
              io.grpc.MethodDescriptor.<noble.tokenfactory.Tx.MsgConfigureMinterController, noble.tokenfactory.Tx.MsgConfigureMinterControllerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfigureMinterController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.Tx.MsgConfigureMinterController.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.Tx.MsgConfigureMinterControllerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ConfigureMinterController"))
              .build();
        }
      }
    }
    return getConfigureMinterControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgRemoveMinterController,
      noble.tokenfactory.Tx.MsgRemoveMinterControllerResponse> getRemoveMinterControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveMinterController",
      requestType = noble.tokenfactory.Tx.MsgRemoveMinterController.class,
      responseType = noble.tokenfactory.Tx.MsgRemoveMinterControllerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgRemoveMinterController,
      noble.tokenfactory.Tx.MsgRemoveMinterControllerResponse> getRemoveMinterControllerMethod() {
    io.grpc.MethodDescriptor<noble.tokenfactory.Tx.MsgRemoveMinterController, noble.tokenfactory.Tx.MsgRemoveMinterControllerResponse> getRemoveMinterControllerMethod;
    if ((getRemoveMinterControllerMethod = MsgGrpc.getRemoveMinterControllerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemoveMinterControllerMethod = MsgGrpc.getRemoveMinterControllerMethod) == null) {
          MsgGrpc.getRemoveMinterControllerMethod = getRemoveMinterControllerMethod =
              io.grpc.MethodDescriptor.<noble.tokenfactory.Tx.MsgRemoveMinterController, noble.tokenfactory.Tx.MsgRemoveMinterControllerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveMinterController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.Tx.MsgRemoveMinterController.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.Tx.MsgRemoveMinterControllerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemoveMinterController"))
              .build();
        }
      }
    }
    return getRemoveMinterControllerMethod;
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
    public void updateMasterMinter(noble.tokenfactory.Tx.MsgUpdateMasterMinter request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgUpdateMasterMinterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMasterMinterMethod(), responseObserver);
    }

    /**
     */
    public void updatePauser(noble.tokenfactory.Tx.MsgUpdatePauser request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgUpdatePauserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatePauserMethod(), responseObserver);
    }

    /**
     */
    public void updateBlacklister(noble.tokenfactory.Tx.MsgUpdateBlacklister request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgUpdateBlacklisterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateBlacklisterMethod(), responseObserver);
    }

    /**
     */
    public void updateOwner(noble.tokenfactory.Tx.MsgUpdateOwner request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgUpdateOwnerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateOwnerMethod(), responseObserver);
    }

    /**
     */
    public void acceptOwner(noble.tokenfactory.Tx.MsgAcceptOwner request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgAcceptOwnerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAcceptOwnerMethod(), responseObserver);
    }

    /**
     */
    public void configureMinter(noble.tokenfactory.Tx.MsgConfigureMinter request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgConfigureMinterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConfigureMinterMethod(), responseObserver);
    }

    /**
     */
    public void removeMinter(noble.tokenfactory.Tx.MsgRemoveMinter request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgRemoveMinterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveMinterMethod(), responseObserver);
    }

    /**
     */
    public void mint(noble.tokenfactory.Tx.MsgMint request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgMintResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMintMethod(), responseObserver);
    }

    /**
     */
    public void burn(noble.tokenfactory.Tx.MsgBurn request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgBurnResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBurnMethod(), responseObserver);
    }

    /**
     */
    public void blacklist(noble.tokenfactory.Tx.MsgBlacklist request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgBlacklistResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBlacklistMethod(), responseObserver);
    }

    /**
     */
    public void unblacklist(noble.tokenfactory.Tx.MsgUnblacklist request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgUnblacklistResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnblacklistMethod(), responseObserver);
    }

    /**
     */
    public void pause(noble.tokenfactory.Tx.MsgPause request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgPauseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPauseMethod(), responseObserver);
    }

    /**
     */
    public void unpause(noble.tokenfactory.Tx.MsgUnpause request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgUnpauseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnpauseMethod(), responseObserver);
    }

    /**
     */
    public void configureMinterController(noble.tokenfactory.Tx.MsgConfigureMinterController request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgConfigureMinterControllerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConfigureMinterControllerMethod(), responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void removeMinterController(noble.tokenfactory.Tx.MsgRemoveMinterController request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgRemoveMinterControllerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveMinterControllerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUpdateMasterMinterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.tokenfactory.Tx.MsgUpdateMasterMinter,
                noble.tokenfactory.Tx.MsgUpdateMasterMinterResponse>(
                  this, METHODID_UPDATE_MASTER_MINTER)))
          .addMethod(
            getUpdatePauserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.tokenfactory.Tx.MsgUpdatePauser,
                noble.tokenfactory.Tx.MsgUpdatePauserResponse>(
                  this, METHODID_UPDATE_PAUSER)))
          .addMethod(
            getUpdateBlacklisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.tokenfactory.Tx.MsgUpdateBlacklister,
                noble.tokenfactory.Tx.MsgUpdateBlacklisterResponse>(
                  this, METHODID_UPDATE_BLACKLISTER)))
          .addMethod(
            getUpdateOwnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.tokenfactory.Tx.MsgUpdateOwner,
                noble.tokenfactory.Tx.MsgUpdateOwnerResponse>(
                  this, METHODID_UPDATE_OWNER)))
          .addMethod(
            getAcceptOwnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.tokenfactory.Tx.MsgAcceptOwner,
                noble.tokenfactory.Tx.MsgAcceptOwnerResponse>(
                  this, METHODID_ACCEPT_OWNER)))
          .addMethod(
            getConfigureMinterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.tokenfactory.Tx.MsgConfigureMinter,
                noble.tokenfactory.Tx.MsgConfigureMinterResponse>(
                  this, METHODID_CONFIGURE_MINTER)))
          .addMethod(
            getRemoveMinterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.tokenfactory.Tx.MsgRemoveMinter,
                noble.tokenfactory.Tx.MsgRemoveMinterResponse>(
                  this, METHODID_REMOVE_MINTER)))
          .addMethod(
            getMintMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.tokenfactory.Tx.MsgMint,
                noble.tokenfactory.Tx.MsgMintResponse>(
                  this, METHODID_MINT)))
          .addMethod(
            getBurnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.tokenfactory.Tx.MsgBurn,
                noble.tokenfactory.Tx.MsgBurnResponse>(
                  this, METHODID_BURN)))
          .addMethod(
            getBlacklistMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.tokenfactory.Tx.MsgBlacklist,
                noble.tokenfactory.Tx.MsgBlacklistResponse>(
                  this, METHODID_BLACKLIST)))
          .addMethod(
            getUnblacklistMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.tokenfactory.Tx.MsgUnblacklist,
                noble.tokenfactory.Tx.MsgUnblacklistResponse>(
                  this, METHODID_UNBLACKLIST)))
          .addMethod(
            getPauseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.tokenfactory.Tx.MsgPause,
                noble.tokenfactory.Tx.MsgPauseResponse>(
                  this, METHODID_PAUSE)))
          .addMethod(
            getUnpauseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.tokenfactory.Tx.MsgUnpause,
                noble.tokenfactory.Tx.MsgUnpauseResponse>(
                  this, METHODID_UNPAUSE)))
          .addMethod(
            getConfigureMinterControllerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.tokenfactory.Tx.MsgConfigureMinterController,
                noble.tokenfactory.Tx.MsgConfigureMinterControllerResponse>(
                  this, METHODID_CONFIGURE_MINTER_CONTROLLER)))
          .addMethod(
            getRemoveMinterControllerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.tokenfactory.Tx.MsgRemoveMinterController,
                noble.tokenfactory.Tx.MsgRemoveMinterControllerResponse>(
                  this, METHODID_REMOVE_MINTER_CONTROLLER)))
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
    public void updateMasterMinter(noble.tokenfactory.Tx.MsgUpdateMasterMinter request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgUpdateMasterMinterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMasterMinterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePauser(noble.tokenfactory.Tx.MsgUpdatePauser request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgUpdatePauserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatePauserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateBlacklister(noble.tokenfactory.Tx.MsgUpdateBlacklister request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgUpdateBlacklisterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateBlacklisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateOwner(noble.tokenfactory.Tx.MsgUpdateOwner request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgUpdateOwnerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void acceptOwner(noble.tokenfactory.Tx.MsgAcceptOwner request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgAcceptOwnerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAcceptOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void configureMinter(noble.tokenfactory.Tx.MsgConfigureMinter request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgConfigureMinterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConfigureMinterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeMinter(noble.tokenfactory.Tx.MsgRemoveMinter request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgRemoveMinterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveMinterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void mint(noble.tokenfactory.Tx.MsgMint request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgMintResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMintMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void burn(noble.tokenfactory.Tx.MsgBurn request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgBurnResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBurnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void blacklist(noble.tokenfactory.Tx.MsgBlacklist request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgBlacklistResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBlacklistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unblacklist(noble.tokenfactory.Tx.MsgUnblacklist request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgUnblacklistResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnblacklistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pause(noble.tokenfactory.Tx.MsgPause request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgPauseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPauseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unpause(noble.tokenfactory.Tx.MsgUnpause request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgUnpauseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnpauseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void configureMinterController(noble.tokenfactory.Tx.MsgConfigureMinterController request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgConfigureMinterControllerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConfigureMinterControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void removeMinterController(noble.tokenfactory.Tx.MsgRemoveMinterController request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgRemoveMinterControllerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveMinterControllerMethod(), getCallOptions()), request, responseObserver);
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
    public noble.tokenfactory.Tx.MsgUpdateMasterMinterResponse updateMasterMinter(noble.tokenfactory.Tx.MsgUpdateMasterMinter request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMasterMinterMethod(), getCallOptions(), request);
    }

    /**
     */
    public noble.tokenfactory.Tx.MsgUpdatePauserResponse updatePauser(noble.tokenfactory.Tx.MsgUpdatePauser request) {
      return blockingUnaryCall(
          getChannel(), getUpdatePauserMethod(), getCallOptions(), request);
    }

    /**
     */
    public noble.tokenfactory.Tx.MsgUpdateBlacklisterResponse updateBlacklister(noble.tokenfactory.Tx.MsgUpdateBlacklister request) {
      return blockingUnaryCall(
          getChannel(), getUpdateBlacklisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public noble.tokenfactory.Tx.MsgUpdateOwnerResponse updateOwner(noble.tokenfactory.Tx.MsgUpdateOwner request) {
      return blockingUnaryCall(
          getChannel(), getUpdateOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public noble.tokenfactory.Tx.MsgAcceptOwnerResponse acceptOwner(noble.tokenfactory.Tx.MsgAcceptOwner request) {
      return blockingUnaryCall(
          getChannel(), getAcceptOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public noble.tokenfactory.Tx.MsgConfigureMinterResponse configureMinter(noble.tokenfactory.Tx.MsgConfigureMinter request) {
      return blockingUnaryCall(
          getChannel(), getConfigureMinterMethod(), getCallOptions(), request);
    }

    /**
     */
    public noble.tokenfactory.Tx.MsgRemoveMinterResponse removeMinter(noble.tokenfactory.Tx.MsgRemoveMinter request) {
      return blockingUnaryCall(
          getChannel(), getRemoveMinterMethod(), getCallOptions(), request);
    }

    /**
     */
    public noble.tokenfactory.Tx.MsgMintResponse mint(noble.tokenfactory.Tx.MsgMint request) {
      return blockingUnaryCall(
          getChannel(), getMintMethod(), getCallOptions(), request);
    }

    /**
     */
    public noble.tokenfactory.Tx.MsgBurnResponse burn(noble.tokenfactory.Tx.MsgBurn request) {
      return blockingUnaryCall(
          getChannel(), getBurnMethod(), getCallOptions(), request);
    }

    /**
     */
    public noble.tokenfactory.Tx.MsgBlacklistResponse blacklist(noble.tokenfactory.Tx.MsgBlacklist request) {
      return blockingUnaryCall(
          getChannel(), getBlacklistMethod(), getCallOptions(), request);
    }

    /**
     */
    public noble.tokenfactory.Tx.MsgUnblacklistResponse unblacklist(noble.tokenfactory.Tx.MsgUnblacklist request) {
      return blockingUnaryCall(
          getChannel(), getUnblacklistMethod(), getCallOptions(), request);
    }

    /**
     */
    public noble.tokenfactory.Tx.MsgPauseResponse pause(noble.tokenfactory.Tx.MsgPause request) {
      return blockingUnaryCall(
          getChannel(), getPauseMethod(), getCallOptions(), request);
    }

    /**
     */
    public noble.tokenfactory.Tx.MsgUnpauseResponse unpause(noble.tokenfactory.Tx.MsgUnpause request) {
      return blockingUnaryCall(
          getChannel(), getUnpauseMethod(), getCallOptions(), request);
    }

    /**
     */
    public noble.tokenfactory.Tx.MsgConfigureMinterControllerResponse configureMinterController(noble.tokenfactory.Tx.MsgConfigureMinterController request) {
      return blockingUnaryCall(
          getChannel(), getConfigureMinterControllerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public noble.tokenfactory.Tx.MsgRemoveMinterControllerResponse removeMinterController(noble.tokenfactory.Tx.MsgRemoveMinterController request) {
      return blockingUnaryCall(
          getChannel(), getRemoveMinterControllerMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<noble.tokenfactory.Tx.MsgUpdateMasterMinterResponse> updateMasterMinter(
        noble.tokenfactory.Tx.MsgUpdateMasterMinter request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMasterMinterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.tokenfactory.Tx.MsgUpdatePauserResponse> updatePauser(
        noble.tokenfactory.Tx.MsgUpdatePauser request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatePauserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.tokenfactory.Tx.MsgUpdateBlacklisterResponse> updateBlacklister(
        noble.tokenfactory.Tx.MsgUpdateBlacklister request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateBlacklisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.tokenfactory.Tx.MsgUpdateOwnerResponse> updateOwner(
        noble.tokenfactory.Tx.MsgUpdateOwner request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateOwnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.tokenfactory.Tx.MsgAcceptOwnerResponse> acceptOwner(
        noble.tokenfactory.Tx.MsgAcceptOwner request) {
      return futureUnaryCall(
          getChannel().newCall(getAcceptOwnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.tokenfactory.Tx.MsgConfigureMinterResponse> configureMinter(
        noble.tokenfactory.Tx.MsgConfigureMinter request) {
      return futureUnaryCall(
          getChannel().newCall(getConfigureMinterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.tokenfactory.Tx.MsgRemoveMinterResponse> removeMinter(
        noble.tokenfactory.Tx.MsgRemoveMinter request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveMinterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.tokenfactory.Tx.MsgMintResponse> mint(
        noble.tokenfactory.Tx.MsgMint request) {
      return futureUnaryCall(
          getChannel().newCall(getMintMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.tokenfactory.Tx.MsgBurnResponse> burn(
        noble.tokenfactory.Tx.MsgBurn request) {
      return futureUnaryCall(
          getChannel().newCall(getBurnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.tokenfactory.Tx.MsgBlacklistResponse> blacklist(
        noble.tokenfactory.Tx.MsgBlacklist request) {
      return futureUnaryCall(
          getChannel().newCall(getBlacklistMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.tokenfactory.Tx.MsgUnblacklistResponse> unblacklist(
        noble.tokenfactory.Tx.MsgUnblacklist request) {
      return futureUnaryCall(
          getChannel().newCall(getUnblacklistMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.tokenfactory.Tx.MsgPauseResponse> pause(
        noble.tokenfactory.Tx.MsgPause request) {
      return futureUnaryCall(
          getChannel().newCall(getPauseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.tokenfactory.Tx.MsgUnpauseResponse> unpause(
        noble.tokenfactory.Tx.MsgUnpause request) {
      return futureUnaryCall(
          getChannel().newCall(getUnpauseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.tokenfactory.Tx.MsgConfigureMinterControllerResponse> configureMinterController(
        noble.tokenfactory.Tx.MsgConfigureMinterController request) {
      return futureUnaryCall(
          getChannel().newCall(getConfigureMinterControllerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.tokenfactory.Tx.MsgRemoveMinterControllerResponse> removeMinterController(
        noble.tokenfactory.Tx.MsgRemoveMinterController request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveMinterControllerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPDATE_MASTER_MINTER = 0;
  private static final int METHODID_UPDATE_PAUSER = 1;
  private static final int METHODID_UPDATE_BLACKLISTER = 2;
  private static final int METHODID_UPDATE_OWNER = 3;
  private static final int METHODID_ACCEPT_OWNER = 4;
  private static final int METHODID_CONFIGURE_MINTER = 5;
  private static final int METHODID_REMOVE_MINTER = 6;
  private static final int METHODID_MINT = 7;
  private static final int METHODID_BURN = 8;
  private static final int METHODID_BLACKLIST = 9;
  private static final int METHODID_UNBLACKLIST = 10;
  private static final int METHODID_PAUSE = 11;
  private static final int METHODID_UNPAUSE = 12;
  private static final int METHODID_CONFIGURE_MINTER_CONTROLLER = 13;
  private static final int METHODID_REMOVE_MINTER_CONTROLLER = 14;

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
        case METHODID_UPDATE_MASTER_MINTER:
          serviceImpl.updateMasterMinter((noble.tokenfactory.Tx.MsgUpdateMasterMinter) request,
              (io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgUpdateMasterMinterResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PAUSER:
          serviceImpl.updatePauser((noble.tokenfactory.Tx.MsgUpdatePauser) request,
              (io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgUpdatePauserResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BLACKLISTER:
          serviceImpl.updateBlacklister((noble.tokenfactory.Tx.MsgUpdateBlacklister) request,
              (io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgUpdateBlacklisterResponse>) responseObserver);
          break;
        case METHODID_UPDATE_OWNER:
          serviceImpl.updateOwner((noble.tokenfactory.Tx.MsgUpdateOwner) request,
              (io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgUpdateOwnerResponse>) responseObserver);
          break;
        case METHODID_ACCEPT_OWNER:
          serviceImpl.acceptOwner((noble.tokenfactory.Tx.MsgAcceptOwner) request,
              (io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgAcceptOwnerResponse>) responseObserver);
          break;
        case METHODID_CONFIGURE_MINTER:
          serviceImpl.configureMinter((noble.tokenfactory.Tx.MsgConfigureMinter) request,
              (io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgConfigureMinterResponse>) responseObserver);
          break;
        case METHODID_REMOVE_MINTER:
          serviceImpl.removeMinter((noble.tokenfactory.Tx.MsgRemoveMinter) request,
              (io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgRemoveMinterResponse>) responseObserver);
          break;
        case METHODID_MINT:
          serviceImpl.mint((noble.tokenfactory.Tx.MsgMint) request,
              (io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgMintResponse>) responseObserver);
          break;
        case METHODID_BURN:
          serviceImpl.burn((noble.tokenfactory.Tx.MsgBurn) request,
              (io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgBurnResponse>) responseObserver);
          break;
        case METHODID_BLACKLIST:
          serviceImpl.blacklist((noble.tokenfactory.Tx.MsgBlacklist) request,
              (io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgBlacklistResponse>) responseObserver);
          break;
        case METHODID_UNBLACKLIST:
          serviceImpl.unblacklist((noble.tokenfactory.Tx.MsgUnblacklist) request,
              (io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgUnblacklistResponse>) responseObserver);
          break;
        case METHODID_PAUSE:
          serviceImpl.pause((noble.tokenfactory.Tx.MsgPause) request,
              (io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgPauseResponse>) responseObserver);
          break;
        case METHODID_UNPAUSE:
          serviceImpl.unpause((noble.tokenfactory.Tx.MsgUnpause) request,
              (io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgUnpauseResponse>) responseObserver);
          break;
        case METHODID_CONFIGURE_MINTER_CONTROLLER:
          serviceImpl.configureMinterController((noble.tokenfactory.Tx.MsgConfigureMinterController) request,
              (io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgConfigureMinterControllerResponse>) responseObserver);
          break;
        case METHODID_REMOVE_MINTER_CONTROLLER:
          serviceImpl.removeMinterController((noble.tokenfactory.Tx.MsgRemoveMinterController) request,
              (io.grpc.stub.StreamObserver<noble.tokenfactory.Tx.MsgRemoveMinterControllerResponse>) responseObserver);
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
      return noble.tokenfactory.Tx.getDescriptor();
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
              .addMethod(getUpdateMasterMinterMethod())
              .addMethod(getUpdatePauserMethod())
              .addMethod(getUpdateBlacklisterMethod())
              .addMethod(getUpdateOwnerMethod())
              .addMethod(getAcceptOwnerMethod())
              .addMethod(getConfigureMinterMethod())
              .addMethod(getRemoveMinterMethod())
              .addMethod(getMintMethod())
              .addMethod(getBurnMethod())
              .addMethod(getBlacklistMethod())
              .addMethod(getUnblacklistMethod())
              .addMethod(getPauseMethod())
              .addMethod(getUnpauseMethod())
              .addMethod(getConfigureMinterControllerMethod())
              .addMethod(getRemoveMinterControllerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
