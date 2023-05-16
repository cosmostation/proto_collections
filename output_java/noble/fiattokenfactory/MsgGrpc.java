package noble.fiattokenfactory;

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
    comments = "Source: noble/fiattokenfactory/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "noble.fiattokenfactory.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgUpdateMasterMinter,
      noble.fiattokenfactory.Tx.MsgUpdateMasterMinterResponse> getUpdateMasterMinterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMasterMinter",
      requestType = noble.fiattokenfactory.Tx.MsgUpdateMasterMinter.class,
      responseType = noble.fiattokenfactory.Tx.MsgUpdateMasterMinterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgUpdateMasterMinter,
      noble.fiattokenfactory.Tx.MsgUpdateMasterMinterResponse> getUpdateMasterMinterMethod() {
    io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgUpdateMasterMinter, noble.fiattokenfactory.Tx.MsgUpdateMasterMinterResponse> getUpdateMasterMinterMethod;
    if ((getUpdateMasterMinterMethod = MsgGrpc.getUpdateMasterMinterMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateMasterMinterMethod = MsgGrpc.getUpdateMasterMinterMethod) == null) {
          MsgGrpc.getUpdateMasterMinterMethod = getUpdateMasterMinterMethod =
              io.grpc.MethodDescriptor.<noble.fiattokenfactory.Tx.MsgUpdateMasterMinter, noble.fiattokenfactory.Tx.MsgUpdateMasterMinterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMasterMinter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.Tx.MsgUpdateMasterMinter.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.Tx.MsgUpdateMasterMinterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateMasterMinter"))
              .build();
        }
      }
    }
    return getUpdateMasterMinterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgUpdatePauser,
      noble.fiattokenfactory.Tx.MsgUpdatePauserResponse> getUpdatePauserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePauser",
      requestType = noble.fiattokenfactory.Tx.MsgUpdatePauser.class,
      responseType = noble.fiattokenfactory.Tx.MsgUpdatePauserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgUpdatePauser,
      noble.fiattokenfactory.Tx.MsgUpdatePauserResponse> getUpdatePauserMethod() {
    io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgUpdatePauser, noble.fiattokenfactory.Tx.MsgUpdatePauserResponse> getUpdatePauserMethod;
    if ((getUpdatePauserMethod = MsgGrpc.getUpdatePauserMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdatePauserMethod = MsgGrpc.getUpdatePauserMethod) == null) {
          MsgGrpc.getUpdatePauserMethod = getUpdatePauserMethod =
              io.grpc.MethodDescriptor.<noble.fiattokenfactory.Tx.MsgUpdatePauser, noble.fiattokenfactory.Tx.MsgUpdatePauserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePauser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.Tx.MsgUpdatePauser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.Tx.MsgUpdatePauserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdatePauser"))
              .build();
        }
      }
    }
    return getUpdatePauserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgUpdateBlacklister,
      noble.fiattokenfactory.Tx.MsgUpdateBlacklisterResponse> getUpdateBlacklisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBlacklister",
      requestType = noble.fiattokenfactory.Tx.MsgUpdateBlacklister.class,
      responseType = noble.fiattokenfactory.Tx.MsgUpdateBlacklisterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgUpdateBlacklister,
      noble.fiattokenfactory.Tx.MsgUpdateBlacklisterResponse> getUpdateBlacklisterMethod() {
    io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgUpdateBlacklister, noble.fiattokenfactory.Tx.MsgUpdateBlacklisterResponse> getUpdateBlacklisterMethod;
    if ((getUpdateBlacklisterMethod = MsgGrpc.getUpdateBlacklisterMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateBlacklisterMethod = MsgGrpc.getUpdateBlacklisterMethod) == null) {
          MsgGrpc.getUpdateBlacklisterMethod = getUpdateBlacklisterMethod =
              io.grpc.MethodDescriptor.<noble.fiattokenfactory.Tx.MsgUpdateBlacklister, noble.fiattokenfactory.Tx.MsgUpdateBlacklisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBlacklister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.Tx.MsgUpdateBlacklister.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.Tx.MsgUpdateBlacklisterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateBlacklister"))
              .build();
        }
      }
    }
    return getUpdateBlacklisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgUpdateOwner,
      noble.fiattokenfactory.Tx.MsgUpdateOwnerResponse> getUpdateOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOwner",
      requestType = noble.fiattokenfactory.Tx.MsgUpdateOwner.class,
      responseType = noble.fiattokenfactory.Tx.MsgUpdateOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgUpdateOwner,
      noble.fiattokenfactory.Tx.MsgUpdateOwnerResponse> getUpdateOwnerMethod() {
    io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgUpdateOwner, noble.fiattokenfactory.Tx.MsgUpdateOwnerResponse> getUpdateOwnerMethod;
    if ((getUpdateOwnerMethod = MsgGrpc.getUpdateOwnerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateOwnerMethod = MsgGrpc.getUpdateOwnerMethod) == null) {
          MsgGrpc.getUpdateOwnerMethod = getUpdateOwnerMethod =
              io.grpc.MethodDescriptor.<noble.fiattokenfactory.Tx.MsgUpdateOwner, noble.fiattokenfactory.Tx.MsgUpdateOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.Tx.MsgUpdateOwner.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.Tx.MsgUpdateOwnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateOwner"))
              .build();
        }
      }
    }
    return getUpdateOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgAcceptOwner,
      noble.fiattokenfactory.Tx.MsgAcceptOwnerResponse> getAcceptOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AcceptOwner",
      requestType = noble.fiattokenfactory.Tx.MsgAcceptOwner.class,
      responseType = noble.fiattokenfactory.Tx.MsgAcceptOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgAcceptOwner,
      noble.fiattokenfactory.Tx.MsgAcceptOwnerResponse> getAcceptOwnerMethod() {
    io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgAcceptOwner, noble.fiattokenfactory.Tx.MsgAcceptOwnerResponse> getAcceptOwnerMethod;
    if ((getAcceptOwnerMethod = MsgGrpc.getAcceptOwnerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAcceptOwnerMethod = MsgGrpc.getAcceptOwnerMethod) == null) {
          MsgGrpc.getAcceptOwnerMethod = getAcceptOwnerMethod =
              io.grpc.MethodDescriptor.<noble.fiattokenfactory.Tx.MsgAcceptOwner, noble.fiattokenfactory.Tx.MsgAcceptOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AcceptOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.Tx.MsgAcceptOwner.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.Tx.MsgAcceptOwnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AcceptOwner"))
              .build();
        }
      }
    }
    return getAcceptOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgConfigureMinter,
      noble.fiattokenfactory.Tx.MsgConfigureMinterResponse> getConfigureMinterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfigureMinter",
      requestType = noble.fiattokenfactory.Tx.MsgConfigureMinter.class,
      responseType = noble.fiattokenfactory.Tx.MsgConfigureMinterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgConfigureMinter,
      noble.fiattokenfactory.Tx.MsgConfigureMinterResponse> getConfigureMinterMethod() {
    io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgConfigureMinter, noble.fiattokenfactory.Tx.MsgConfigureMinterResponse> getConfigureMinterMethod;
    if ((getConfigureMinterMethod = MsgGrpc.getConfigureMinterMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getConfigureMinterMethod = MsgGrpc.getConfigureMinterMethod) == null) {
          MsgGrpc.getConfigureMinterMethod = getConfigureMinterMethod =
              io.grpc.MethodDescriptor.<noble.fiattokenfactory.Tx.MsgConfigureMinter, noble.fiattokenfactory.Tx.MsgConfigureMinterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfigureMinter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.Tx.MsgConfigureMinter.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.Tx.MsgConfigureMinterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ConfigureMinter"))
              .build();
        }
      }
    }
    return getConfigureMinterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgRemoveMinter,
      noble.fiattokenfactory.Tx.MsgRemoveMinterResponse> getRemoveMinterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveMinter",
      requestType = noble.fiattokenfactory.Tx.MsgRemoveMinter.class,
      responseType = noble.fiattokenfactory.Tx.MsgRemoveMinterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgRemoveMinter,
      noble.fiattokenfactory.Tx.MsgRemoveMinterResponse> getRemoveMinterMethod() {
    io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgRemoveMinter, noble.fiattokenfactory.Tx.MsgRemoveMinterResponse> getRemoveMinterMethod;
    if ((getRemoveMinterMethod = MsgGrpc.getRemoveMinterMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemoveMinterMethod = MsgGrpc.getRemoveMinterMethod) == null) {
          MsgGrpc.getRemoveMinterMethod = getRemoveMinterMethod =
              io.grpc.MethodDescriptor.<noble.fiattokenfactory.Tx.MsgRemoveMinter, noble.fiattokenfactory.Tx.MsgRemoveMinterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveMinter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.Tx.MsgRemoveMinter.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.Tx.MsgRemoveMinterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemoveMinter"))
              .build();
        }
      }
    }
    return getRemoveMinterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgMint,
      noble.fiattokenfactory.Tx.MsgMintResponse> getMintMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Mint",
      requestType = noble.fiattokenfactory.Tx.MsgMint.class,
      responseType = noble.fiattokenfactory.Tx.MsgMintResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgMint,
      noble.fiattokenfactory.Tx.MsgMintResponse> getMintMethod() {
    io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgMint, noble.fiattokenfactory.Tx.MsgMintResponse> getMintMethod;
    if ((getMintMethod = MsgGrpc.getMintMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMintMethod = MsgGrpc.getMintMethod) == null) {
          MsgGrpc.getMintMethod = getMintMethod =
              io.grpc.MethodDescriptor.<noble.fiattokenfactory.Tx.MsgMint, noble.fiattokenfactory.Tx.MsgMintResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Mint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.Tx.MsgMint.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.Tx.MsgMintResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Mint"))
              .build();
        }
      }
    }
    return getMintMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgBurn,
      noble.fiattokenfactory.Tx.MsgBurnResponse> getBurnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Burn",
      requestType = noble.fiattokenfactory.Tx.MsgBurn.class,
      responseType = noble.fiattokenfactory.Tx.MsgBurnResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgBurn,
      noble.fiattokenfactory.Tx.MsgBurnResponse> getBurnMethod() {
    io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgBurn, noble.fiattokenfactory.Tx.MsgBurnResponse> getBurnMethod;
    if ((getBurnMethod = MsgGrpc.getBurnMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBurnMethod = MsgGrpc.getBurnMethod) == null) {
          MsgGrpc.getBurnMethod = getBurnMethod =
              io.grpc.MethodDescriptor.<noble.fiattokenfactory.Tx.MsgBurn, noble.fiattokenfactory.Tx.MsgBurnResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Burn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.Tx.MsgBurn.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.Tx.MsgBurnResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Burn"))
              .build();
        }
      }
    }
    return getBurnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgBlacklist,
      noble.fiattokenfactory.Tx.MsgBlacklistResponse> getBlacklistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Blacklist",
      requestType = noble.fiattokenfactory.Tx.MsgBlacklist.class,
      responseType = noble.fiattokenfactory.Tx.MsgBlacklistResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgBlacklist,
      noble.fiattokenfactory.Tx.MsgBlacklistResponse> getBlacklistMethod() {
    io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgBlacklist, noble.fiattokenfactory.Tx.MsgBlacklistResponse> getBlacklistMethod;
    if ((getBlacklistMethod = MsgGrpc.getBlacklistMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBlacklistMethod = MsgGrpc.getBlacklistMethod) == null) {
          MsgGrpc.getBlacklistMethod = getBlacklistMethod =
              io.grpc.MethodDescriptor.<noble.fiattokenfactory.Tx.MsgBlacklist, noble.fiattokenfactory.Tx.MsgBlacklistResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Blacklist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.Tx.MsgBlacklist.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.Tx.MsgBlacklistResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Blacklist"))
              .build();
        }
      }
    }
    return getBlacklistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgUnblacklist,
      noble.fiattokenfactory.Tx.MsgUnblacklistResponse> getUnblacklistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Unblacklist",
      requestType = noble.fiattokenfactory.Tx.MsgUnblacklist.class,
      responseType = noble.fiattokenfactory.Tx.MsgUnblacklistResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgUnblacklist,
      noble.fiattokenfactory.Tx.MsgUnblacklistResponse> getUnblacklistMethod() {
    io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgUnblacklist, noble.fiattokenfactory.Tx.MsgUnblacklistResponse> getUnblacklistMethod;
    if ((getUnblacklistMethod = MsgGrpc.getUnblacklistMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUnblacklistMethod = MsgGrpc.getUnblacklistMethod) == null) {
          MsgGrpc.getUnblacklistMethod = getUnblacklistMethod =
              io.grpc.MethodDescriptor.<noble.fiattokenfactory.Tx.MsgUnblacklist, noble.fiattokenfactory.Tx.MsgUnblacklistResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Unblacklist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.Tx.MsgUnblacklist.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.Tx.MsgUnblacklistResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Unblacklist"))
              .build();
        }
      }
    }
    return getUnblacklistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgPause,
      noble.fiattokenfactory.Tx.MsgPauseResponse> getPauseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pause",
      requestType = noble.fiattokenfactory.Tx.MsgPause.class,
      responseType = noble.fiattokenfactory.Tx.MsgPauseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgPause,
      noble.fiattokenfactory.Tx.MsgPauseResponse> getPauseMethod() {
    io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgPause, noble.fiattokenfactory.Tx.MsgPauseResponse> getPauseMethod;
    if ((getPauseMethod = MsgGrpc.getPauseMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getPauseMethod = MsgGrpc.getPauseMethod) == null) {
          MsgGrpc.getPauseMethod = getPauseMethod =
              io.grpc.MethodDescriptor.<noble.fiattokenfactory.Tx.MsgPause, noble.fiattokenfactory.Tx.MsgPauseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pause"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.Tx.MsgPause.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.Tx.MsgPauseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Pause"))
              .build();
        }
      }
    }
    return getPauseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgUnpause,
      noble.fiattokenfactory.Tx.MsgUnpauseResponse> getUnpauseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Unpause",
      requestType = noble.fiattokenfactory.Tx.MsgUnpause.class,
      responseType = noble.fiattokenfactory.Tx.MsgUnpauseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgUnpause,
      noble.fiattokenfactory.Tx.MsgUnpauseResponse> getUnpauseMethod() {
    io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgUnpause, noble.fiattokenfactory.Tx.MsgUnpauseResponse> getUnpauseMethod;
    if ((getUnpauseMethod = MsgGrpc.getUnpauseMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUnpauseMethod = MsgGrpc.getUnpauseMethod) == null) {
          MsgGrpc.getUnpauseMethod = getUnpauseMethod =
              io.grpc.MethodDescriptor.<noble.fiattokenfactory.Tx.MsgUnpause, noble.fiattokenfactory.Tx.MsgUnpauseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Unpause"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.Tx.MsgUnpause.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.Tx.MsgUnpauseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Unpause"))
              .build();
        }
      }
    }
    return getUnpauseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgConfigureMinterController,
      noble.fiattokenfactory.Tx.MsgConfigureMinterControllerResponse> getConfigureMinterControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfigureMinterController",
      requestType = noble.fiattokenfactory.Tx.MsgConfigureMinterController.class,
      responseType = noble.fiattokenfactory.Tx.MsgConfigureMinterControllerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgConfigureMinterController,
      noble.fiattokenfactory.Tx.MsgConfigureMinterControllerResponse> getConfigureMinterControllerMethod() {
    io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgConfigureMinterController, noble.fiattokenfactory.Tx.MsgConfigureMinterControllerResponse> getConfigureMinterControllerMethod;
    if ((getConfigureMinterControllerMethod = MsgGrpc.getConfigureMinterControllerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getConfigureMinterControllerMethod = MsgGrpc.getConfigureMinterControllerMethod) == null) {
          MsgGrpc.getConfigureMinterControllerMethod = getConfigureMinterControllerMethod =
              io.grpc.MethodDescriptor.<noble.fiattokenfactory.Tx.MsgConfigureMinterController, noble.fiattokenfactory.Tx.MsgConfigureMinterControllerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfigureMinterController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.Tx.MsgConfigureMinterController.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.Tx.MsgConfigureMinterControllerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ConfigureMinterController"))
              .build();
        }
      }
    }
    return getConfigureMinterControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgRemoveMinterController,
      noble.fiattokenfactory.Tx.MsgRemoveMinterControllerResponse> getRemoveMinterControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveMinterController",
      requestType = noble.fiattokenfactory.Tx.MsgRemoveMinterController.class,
      responseType = noble.fiattokenfactory.Tx.MsgRemoveMinterControllerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgRemoveMinterController,
      noble.fiattokenfactory.Tx.MsgRemoveMinterControllerResponse> getRemoveMinterControllerMethod() {
    io.grpc.MethodDescriptor<noble.fiattokenfactory.Tx.MsgRemoveMinterController, noble.fiattokenfactory.Tx.MsgRemoveMinterControllerResponse> getRemoveMinterControllerMethod;
    if ((getRemoveMinterControllerMethod = MsgGrpc.getRemoveMinterControllerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemoveMinterControllerMethod = MsgGrpc.getRemoveMinterControllerMethod) == null) {
          MsgGrpc.getRemoveMinterControllerMethod = getRemoveMinterControllerMethod =
              io.grpc.MethodDescriptor.<noble.fiattokenfactory.Tx.MsgRemoveMinterController, noble.fiattokenfactory.Tx.MsgRemoveMinterControllerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveMinterController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.Tx.MsgRemoveMinterController.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.Tx.MsgRemoveMinterControllerResponse.getDefaultInstance()))
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
    public void updateMasterMinter(noble.fiattokenfactory.Tx.MsgUpdateMasterMinter request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgUpdateMasterMinterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMasterMinterMethod(), responseObserver);
    }

    /**
     */
    public void updatePauser(noble.fiattokenfactory.Tx.MsgUpdatePauser request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgUpdatePauserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatePauserMethod(), responseObserver);
    }

    /**
     */
    public void updateBlacklister(noble.fiattokenfactory.Tx.MsgUpdateBlacklister request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgUpdateBlacklisterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateBlacklisterMethod(), responseObserver);
    }

    /**
     */
    public void updateOwner(noble.fiattokenfactory.Tx.MsgUpdateOwner request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgUpdateOwnerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateOwnerMethod(), responseObserver);
    }

    /**
     */
    public void acceptOwner(noble.fiattokenfactory.Tx.MsgAcceptOwner request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgAcceptOwnerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAcceptOwnerMethod(), responseObserver);
    }

    /**
     */
    public void configureMinter(noble.fiattokenfactory.Tx.MsgConfigureMinter request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgConfigureMinterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConfigureMinterMethod(), responseObserver);
    }

    /**
     */
    public void removeMinter(noble.fiattokenfactory.Tx.MsgRemoveMinter request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgRemoveMinterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveMinterMethod(), responseObserver);
    }

    /**
     */
    public void mint(noble.fiattokenfactory.Tx.MsgMint request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgMintResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMintMethod(), responseObserver);
    }

    /**
     */
    public void burn(noble.fiattokenfactory.Tx.MsgBurn request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgBurnResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBurnMethod(), responseObserver);
    }

    /**
     */
    public void blacklist(noble.fiattokenfactory.Tx.MsgBlacklist request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgBlacklistResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBlacklistMethod(), responseObserver);
    }

    /**
     */
    public void unblacklist(noble.fiattokenfactory.Tx.MsgUnblacklist request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgUnblacklistResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnblacklistMethod(), responseObserver);
    }

    /**
     */
    public void pause(noble.fiattokenfactory.Tx.MsgPause request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgPauseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPauseMethod(), responseObserver);
    }

    /**
     */
    public void unpause(noble.fiattokenfactory.Tx.MsgUnpause request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgUnpauseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnpauseMethod(), responseObserver);
    }

    /**
     */
    public void configureMinterController(noble.fiattokenfactory.Tx.MsgConfigureMinterController request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgConfigureMinterControllerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConfigureMinterControllerMethod(), responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void removeMinterController(noble.fiattokenfactory.Tx.MsgRemoveMinterController request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgRemoveMinterControllerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveMinterControllerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUpdateMasterMinterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.fiattokenfactory.Tx.MsgUpdateMasterMinter,
                noble.fiattokenfactory.Tx.MsgUpdateMasterMinterResponse>(
                  this, METHODID_UPDATE_MASTER_MINTER)))
          .addMethod(
            getUpdatePauserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.fiattokenfactory.Tx.MsgUpdatePauser,
                noble.fiattokenfactory.Tx.MsgUpdatePauserResponse>(
                  this, METHODID_UPDATE_PAUSER)))
          .addMethod(
            getUpdateBlacklisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.fiattokenfactory.Tx.MsgUpdateBlacklister,
                noble.fiattokenfactory.Tx.MsgUpdateBlacklisterResponse>(
                  this, METHODID_UPDATE_BLACKLISTER)))
          .addMethod(
            getUpdateOwnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.fiattokenfactory.Tx.MsgUpdateOwner,
                noble.fiattokenfactory.Tx.MsgUpdateOwnerResponse>(
                  this, METHODID_UPDATE_OWNER)))
          .addMethod(
            getAcceptOwnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.fiattokenfactory.Tx.MsgAcceptOwner,
                noble.fiattokenfactory.Tx.MsgAcceptOwnerResponse>(
                  this, METHODID_ACCEPT_OWNER)))
          .addMethod(
            getConfigureMinterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.fiattokenfactory.Tx.MsgConfigureMinter,
                noble.fiattokenfactory.Tx.MsgConfigureMinterResponse>(
                  this, METHODID_CONFIGURE_MINTER)))
          .addMethod(
            getRemoveMinterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.fiattokenfactory.Tx.MsgRemoveMinter,
                noble.fiattokenfactory.Tx.MsgRemoveMinterResponse>(
                  this, METHODID_REMOVE_MINTER)))
          .addMethod(
            getMintMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.fiattokenfactory.Tx.MsgMint,
                noble.fiattokenfactory.Tx.MsgMintResponse>(
                  this, METHODID_MINT)))
          .addMethod(
            getBurnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.fiattokenfactory.Tx.MsgBurn,
                noble.fiattokenfactory.Tx.MsgBurnResponse>(
                  this, METHODID_BURN)))
          .addMethod(
            getBlacklistMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.fiattokenfactory.Tx.MsgBlacklist,
                noble.fiattokenfactory.Tx.MsgBlacklistResponse>(
                  this, METHODID_BLACKLIST)))
          .addMethod(
            getUnblacklistMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.fiattokenfactory.Tx.MsgUnblacklist,
                noble.fiattokenfactory.Tx.MsgUnblacklistResponse>(
                  this, METHODID_UNBLACKLIST)))
          .addMethod(
            getPauseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.fiattokenfactory.Tx.MsgPause,
                noble.fiattokenfactory.Tx.MsgPauseResponse>(
                  this, METHODID_PAUSE)))
          .addMethod(
            getUnpauseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.fiattokenfactory.Tx.MsgUnpause,
                noble.fiattokenfactory.Tx.MsgUnpauseResponse>(
                  this, METHODID_UNPAUSE)))
          .addMethod(
            getConfigureMinterControllerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.fiattokenfactory.Tx.MsgConfigureMinterController,
                noble.fiattokenfactory.Tx.MsgConfigureMinterControllerResponse>(
                  this, METHODID_CONFIGURE_MINTER_CONTROLLER)))
          .addMethod(
            getRemoveMinterControllerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.fiattokenfactory.Tx.MsgRemoveMinterController,
                noble.fiattokenfactory.Tx.MsgRemoveMinterControllerResponse>(
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
    public void updateMasterMinter(noble.fiattokenfactory.Tx.MsgUpdateMasterMinter request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgUpdateMasterMinterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMasterMinterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePauser(noble.fiattokenfactory.Tx.MsgUpdatePauser request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgUpdatePauserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatePauserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateBlacklister(noble.fiattokenfactory.Tx.MsgUpdateBlacklister request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgUpdateBlacklisterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateBlacklisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateOwner(noble.fiattokenfactory.Tx.MsgUpdateOwner request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgUpdateOwnerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void acceptOwner(noble.fiattokenfactory.Tx.MsgAcceptOwner request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgAcceptOwnerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAcceptOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void configureMinter(noble.fiattokenfactory.Tx.MsgConfigureMinter request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgConfigureMinterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConfigureMinterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeMinter(noble.fiattokenfactory.Tx.MsgRemoveMinter request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgRemoveMinterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveMinterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void mint(noble.fiattokenfactory.Tx.MsgMint request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgMintResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMintMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void burn(noble.fiattokenfactory.Tx.MsgBurn request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgBurnResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBurnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void blacklist(noble.fiattokenfactory.Tx.MsgBlacklist request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgBlacklistResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBlacklistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unblacklist(noble.fiattokenfactory.Tx.MsgUnblacklist request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgUnblacklistResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnblacklistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pause(noble.fiattokenfactory.Tx.MsgPause request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgPauseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPauseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unpause(noble.fiattokenfactory.Tx.MsgUnpause request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgUnpauseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnpauseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void configureMinterController(noble.fiattokenfactory.Tx.MsgConfigureMinterController request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgConfigureMinterControllerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConfigureMinterControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void removeMinterController(noble.fiattokenfactory.Tx.MsgRemoveMinterController request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgRemoveMinterControllerResponse> responseObserver) {
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
    public noble.fiattokenfactory.Tx.MsgUpdateMasterMinterResponse updateMasterMinter(noble.fiattokenfactory.Tx.MsgUpdateMasterMinter request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMasterMinterMethod(), getCallOptions(), request);
    }

    /**
     */
    public noble.fiattokenfactory.Tx.MsgUpdatePauserResponse updatePauser(noble.fiattokenfactory.Tx.MsgUpdatePauser request) {
      return blockingUnaryCall(
          getChannel(), getUpdatePauserMethod(), getCallOptions(), request);
    }

    /**
     */
    public noble.fiattokenfactory.Tx.MsgUpdateBlacklisterResponse updateBlacklister(noble.fiattokenfactory.Tx.MsgUpdateBlacklister request) {
      return blockingUnaryCall(
          getChannel(), getUpdateBlacklisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public noble.fiattokenfactory.Tx.MsgUpdateOwnerResponse updateOwner(noble.fiattokenfactory.Tx.MsgUpdateOwner request) {
      return blockingUnaryCall(
          getChannel(), getUpdateOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public noble.fiattokenfactory.Tx.MsgAcceptOwnerResponse acceptOwner(noble.fiattokenfactory.Tx.MsgAcceptOwner request) {
      return blockingUnaryCall(
          getChannel(), getAcceptOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public noble.fiattokenfactory.Tx.MsgConfigureMinterResponse configureMinter(noble.fiattokenfactory.Tx.MsgConfigureMinter request) {
      return blockingUnaryCall(
          getChannel(), getConfigureMinterMethod(), getCallOptions(), request);
    }

    /**
     */
    public noble.fiattokenfactory.Tx.MsgRemoveMinterResponse removeMinter(noble.fiattokenfactory.Tx.MsgRemoveMinter request) {
      return blockingUnaryCall(
          getChannel(), getRemoveMinterMethod(), getCallOptions(), request);
    }

    /**
     */
    public noble.fiattokenfactory.Tx.MsgMintResponse mint(noble.fiattokenfactory.Tx.MsgMint request) {
      return blockingUnaryCall(
          getChannel(), getMintMethod(), getCallOptions(), request);
    }

    /**
     */
    public noble.fiattokenfactory.Tx.MsgBurnResponse burn(noble.fiattokenfactory.Tx.MsgBurn request) {
      return blockingUnaryCall(
          getChannel(), getBurnMethod(), getCallOptions(), request);
    }

    /**
     */
    public noble.fiattokenfactory.Tx.MsgBlacklistResponse blacklist(noble.fiattokenfactory.Tx.MsgBlacklist request) {
      return blockingUnaryCall(
          getChannel(), getBlacklistMethod(), getCallOptions(), request);
    }

    /**
     */
    public noble.fiattokenfactory.Tx.MsgUnblacklistResponse unblacklist(noble.fiattokenfactory.Tx.MsgUnblacklist request) {
      return blockingUnaryCall(
          getChannel(), getUnblacklistMethod(), getCallOptions(), request);
    }

    /**
     */
    public noble.fiattokenfactory.Tx.MsgPauseResponse pause(noble.fiattokenfactory.Tx.MsgPause request) {
      return blockingUnaryCall(
          getChannel(), getPauseMethod(), getCallOptions(), request);
    }

    /**
     */
    public noble.fiattokenfactory.Tx.MsgUnpauseResponse unpause(noble.fiattokenfactory.Tx.MsgUnpause request) {
      return blockingUnaryCall(
          getChannel(), getUnpauseMethod(), getCallOptions(), request);
    }

    /**
     */
    public noble.fiattokenfactory.Tx.MsgConfigureMinterControllerResponse configureMinterController(noble.fiattokenfactory.Tx.MsgConfigureMinterController request) {
      return blockingUnaryCall(
          getChannel(), getConfigureMinterControllerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public noble.fiattokenfactory.Tx.MsgRemoveMinterControllerResponse removeMinterController(noble.fiattokenfactory.Tx.MsgRemoveMinterController request) {
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
    public com.google.common.util.concurrent.ListenableFuture<noble.fiattokenfactory.Tx.MsgUpdateMasterMinterResponse> updateMasterMinter(
        noble.fiattokenfactory.Tx.MsgUpdateMasterMinter request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMasterMinterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.fiattokenfactory.Tx.MsgUpdatePauserResponse> updatePauser(
        noble.fiattokenfactory.Tx.MsgUpdatePauser request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatePauserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.fiattokenfactory.Tx.MsgUpdateBlacklisterResponse> updateBlacklister(
        noble.fiattokenfactory.Tx.MsgUpdateBlacklister request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateBlacklisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.fiattokenfactory.Tx.MsgUpdateOwnerResponse> updateOwner(
        noble.fiattokenfactory.Tx.MsgUpdateOwner request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateOwnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.fiattokenfactory.Tx.MsgAcceptOwnerResponse> acceptOwner(
        noble.fiattokenfactory.Tx.MsgAcceptOwner request) {
      return futureUnaryCall(
          getChannel().newCall(getAcceptOwnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.fiattokenfactory.Tx.MsgConfigureMinterResponse> configureMinter(
        noble.fiattokenfactory.Tx.MsgConfigureMinter request) {
      return futureUnaryCall(
          getChannel().newCall(getConfigureMinterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.fiattokenfactory.Tx.MsgRemoveMinterResponse> removeMinter(
        noble.fiattokenfactory.Tx.MsgRemoveMinter request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveMinterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.fiattokenfactory.Tx.MsgMintResponse> mint(
        noble.fiattokenfactory.Tx.MsgMint request) {
      return futureUnaryCall(
          getChannel().newCall(getMintMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.fiattokenfactory.Tx.MsgBurnResponse> burn(
        noble.fiattokenfactory.Tx.MsgBurn request) {
      return futureUnaryCall(
          getChannel().newCall(getBurnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.fiattokenfactory.Tx.MsgBlacklistResponse> blacklist(
        noble.fiattokenfactory.Tx.MsgBlacklist request) {
      return futureUnaryCall(
          getChannel().newCall(getBlacklistMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.fiattokenfactory.Tx.MsgUnblacklistResponse> unblacklist(
        noble.fiattokenfactory.Tx.MsgUnblacklist request) {
      return futureUnaryCall(
          getChannel().newCall(getUnblacklistMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.fiattokenfactory.Tx.MsgPauseResponse> pause(
        noble.fiattokenfactory.Tx.MsgPause request) {
      return futureUnaryCall(
          getChannel().newCall(getPauseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.fiattokenfactory.Tx.MsgUnpauseResponse> unpause(
        noble.fiattokenfactory.Tx.MsgUnpause request) {
      return futureUnaryCall(
          getChannel().newCall(getUnpauseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.fiattokenfactory.Tx.MsgConfigureMinterControllerResponse> configureMinterController(
        noble.fiattokenfactory.Tx.MsgConfigureMinterController request) {
      return futureUnaryCall(
          getChannel().newCall(getConfigureMinterControllerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.fiattokenfactory.Tx.MsgRemoveMinterControllerResponse> removeMinterController(
        noble.fiattokenfactory.Tx.MsgRemoveMinterController request) {
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
          serviceImpl.updateMasterMinter((noble.fiattokenfactory.Tx.MsgUpdateMasterMinter) request,
              (io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgUpdateMasterMinterResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PAUSER:
          serviceImpl.updatePauser((noble.fiattokenfactory.Tx.MsgUpdatePauser) request,
              (io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgUpdatePauserResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BLACKLISTER:
          serviceImpl.updateBlacklister((noble.fiattokenfactory.Tx.MsgUpdateBlacklister) request,
              (io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgUpdateBlacklisterResponse>) responseObserver);
          break;
        case METHODID_UPDATE_OWNER:
          serviceImpl.updateOwner((noble.fiattokenfactory.Tx.MsgUpdateOwner) request,
              (io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgUpdateOwnerResponse>) responseObserver);
          break;
        case METHODID_ACCEPT_OWNER:
          serviceImpl.acceptOwner((noble.fiattokenfactory.Tx.MsgAcceptOwner) request,
              (io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgAcceptOwnerResponse>) responseObserver);
          break;
        case METHODID_CONFIGURE_MINTER:
          serviceImpl.configureMinter((noble.fiattokenfactory.Tx.MsgConfigureMinter) request,
              (io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgConfigureMinterResponse>) responseObserver);
          break;
        case METHODID_REMOVE_MINTER:
          serviceImpl.removeMinter((noble.fiattokenfactory.Tx.MsgRemoveMinter) request,
              (io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgRemoveMinterResponse>) responseObserver);
          break;
        case METHODID_MINT:
          serviceImpl.mint((noble.fiattokenfactory.Tx.MsgMint) request,
              (io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgMintResponse>) responseObserver);
          break;
        case METHODID_BURN:
          serviceImpl.burn((noble.fiattokenfactory.Tx.MsgBurn) request,
              (io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgBurnResponse>) responseObserver);
          break;
        case METHODID_BLACKLIST:
          serviceImpl.blacklist((noble.fiattokenfactory.Tx.MsgBlacklist) request,
              (io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgBlacklistResponse>) responseObserver);
          break;
        case METHODID_UNBLACKLIST:
          serviceImpl.unblacklist((noble.fiattokenfactory.Tx.MsgUnblacklist) request,
              (io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgUnblacklistResponse>) responseObserver);
          break;
        case METHODID_PAUSE:
          serviceImpl.pause((noble.fiattokenfactory.Tx.MsgPause) request,
              (io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgPauseResponse>) responseObserver);
          break;
        case METHODID_UNPAUSE:
          serviceImpl.unpause((noble.fiattokenfactory.Tx.MsgUnpause) request,
              (io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgUnpauseResponse>) responseObserver);
          break;
        case METHODID_CONFIGURE_MINTER_CONTROLLER:
          serviceImpl.configureMinterController((noble.fiattokenfactory.Tx.MsgConfigureMinterController) request,
              (io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgConfigureMinterControllerResponse>) responseObserver);
          break;
        case METHODID_REMOVE_MINTER_CONTROLLER:
          serviceImpl.removeMinterController((noble.fiattokenfactory.Tx.MsgRemoveMinterController) request,
              (io.grpc.stub.StreamObserver<noble.fiattokenfactory.Tx.MsgRemoveMinterControllerResponse>) responseObserver);
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
      return noble.fiattokenfactory.Tx.getDescriptor();
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
