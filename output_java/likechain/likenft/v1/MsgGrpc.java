package likechain.likenft.v1;

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
    comments = "Source: likechain/likenft/v1/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "likechain.likenft.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgNewClass,
      likechain.likenft.v1.Tx.MsgNewClassResponse> getNewClassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewClass",
      requestType = likechain.likenft.v1.Tx.MsgNewClass.class,
      responseType = likechain.likenft.v1.Tx.MsgNewClassResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgNewClass,
      likechain.likenft.v1.Tx.MsgNewClassResponse> getNewClassMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgNewClass, likechain.likenft.v1.Tx.MsgNewClassResponse> getNewClassMethod;
    if ((getNewClassMethod = MsgGrpc.getNewClassMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getNewClassMethod = MsgGrpc.getNewClassMethod) == null) {
          MsgGrpc.getNewClassMethod = getNewClassMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.Tx.MsgNewClass, likechain.likenft.v1.Tx.MsgNewClassResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewClass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.Tx.MsgNewClass.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.Tx.MsgNewClassResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("NewClass"))
              .build();
        }
      }
    }
    return getNewClassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgUpdateClass,
      likechain.likenft.v1.Tx.MsgUpdateClassResponse> getUpdateClassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateClass",
      requestType = likechain.likenft.v1.Tx.MsgUpdateClass.class,
      responseType = likechain.likenft.v1.Tx.MsgUpdateClassResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgUpdateClass,
      likechain.likenft.v1.Tx.MsgUpdateClassResponse> getUpdateClassMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgUpdateClass, likechain.likenft.v1.Tx.MsgUpdateClassResponse> getUpdateClassMethod;
    if ((getUpdateClassMethod = MsgGrpc.getUpdateClassMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateClassMethod = MsgGrpc.getUpdateClassMethod) == null) {
          MsgGrpc.getUpdateClassMethod = getUpdateClassMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.Tx.MsgUpdateClass, likechain.likenft.v1.Tx.MsgUpdateClassResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateClass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.Tx.MsgUpdateClass.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.Tx.MsgUpdateClassResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateClass"))
              .build();
        }
      }
    }
    return getUpdateClassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgMintNFT,
      likechain.likenft.v1.Tx.MsgMintNFTResponse> getMintNFTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MintNFT",
      requestType = likechain.likenft.v1.Tx.MsgMintNFT.class,
      responseType = likechain.likenft.v1.Tx.MsgMintNFTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgMintNFT,
      likechain.likenft.v1.Tx.MsgMintNFTResponse> getMintNFTMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgMintNFT, likechain.likenft.v1.Tx.MsgMintNFTResponse> getMintNFTMethod;
    if ((getMintNFTMethod = MsgGrpc.getMintNFTMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMintNFTMethod = MsgGrpc.getMintNFTMethod) == null) {
          MsgGrpc.getMintNFTMethod = getMintNFTMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.Tx.MsgMintNFT, likechain.likenft.v1.Tx.MsgMintNFTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MintNFT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.Tx.MsgMintNFT.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.Tx.MsgMintNFTResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MintNFT"))
              .build();
        }
      }
    }
    return getMintNFTMethod;
  }

  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgBurnNFT,
      likechain.likenft.v1.Tx.MsgBurnNFTResponse> getBurnNFTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BurnNFT",
      requestType = likechain.likenft.v1.Tx.MsgBurnNFT.class,
      responseType = likechain.likenft.v1.Tx.MsgBurnNFTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgBurnNFT,
      likechain.likenft.v1.Tx.MsgBurnNFTResponse> getBurnNFTMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgBurnNFT, likechain.likenft.v1.Tx.MsgBurnNFTResponse> getBurnNFTMethod;
    if ((getBurnNFTMethod = MsgGrpc.getBurnNFTMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBurnNFTMethod = MsgGrpc.getBurnNFTMethod) == null) {
          MsgGrpc.getBurnNFTMethod = getBurnNFTMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.Tx.MsgBurnNFT, likechain.likenft.v1.Tx.MsgBurnNFTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BurnNFT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.Tx.MsgBurnNFT.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.Tx.MsgBurnNFTResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("BurnNFT"))
              .build();
        }
      }
    }
    return getBurnNFTMethod;
  }

  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgCreateBlindBoxContent,
      likechain.likenft.v1.Tx.MsgCreateBlindBoxContentResponse> getCreateBlindBoxContentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBlindBoxContent",
      requestType = likechain.likenft.v1.Tx.MsgCreateBlindBoxContent.class,
      responseType = likechain.likenft.v1.Tx.MsgCreateBlindBoxContentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgCreateBlindBoxContent,
      likechain.likenft.v1.Tx.MsgCreateBlindBoxContentResponse> getCreateBlindBoxContentMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgCreateBlindBoxContent, likechain.likenft.v1.Tx.MsgCreateBlindBoxContentResponse> getCreateBlindBoxContentMethod;
    if ((getCreateBlindBoxContentMethod = MsgGrpc.getCreateBlindBoxContentMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateBlindBoxContentMethod = MsgGrpc.getCreateBlindBoxContentMethod) == null) {
          MsgGrpc.getCreateBlindBoxContentMethod = getCreateBlindBoxContentMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.Tx.MsgCreateBlindBoxContent, likechain.likenft.v1.Tx.MsgCreateBlindBoxContentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBlindBoxContent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.Tx.MsgCreateBlindBoxContent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.Tx.MsgCreateBlindBoxContentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateBlindBoxContent"))
              .build();
        }
      }
    }
    return getCreateBlindBoxContentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgUpdateBlindBoxContent,
      likechain.likenft.v1.Tx.MsgUpdateBlindBoxContentResponse> getUpdateBlindBoxContentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBlindBoxContent",
      requestType = likechain.likenft.v1.Tx.MsgUpdateBlindBoxContent.class,
      responseType = likechain.likenft.v1.Tx.MsgUpdateBlindBoxContentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgUpdateBlindBoxContent,
      likechain.likenft.v1.Tx.MsgUpdateBlindBoxContentResponse> getUpdateBlindBoxContentMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgUpdateBlindBoxContent, likechain.likenft.v1.Tx.MsgUpdateBlindBoxContentResponse> getUpdateBlindBoxContentMethod;
    if ((getUpdateBlindBoxContentMethod = MsgGrpc.getUpdateBlindBoxContentMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateBlindBoxContentMethod = MsgGrpc.getUpdateBlindBoxContentMethod) == null) {
          MsgGrpc.getUpdateBlindBoxContentMethod = getUpdateBlindBoxContentMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.Tx.MsgUpdateBlindBoxContent, likechain.likenft.v1.Tx.MsgUpdateBlindBoxContentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBlindBoxContent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.Tx.MsgUpdateBlindBoxContent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.Tx.MsgUpdateBlindBoxContentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateBlindBoxContent"))
              .build();
        }
      }
    }
    return getUpdateBlindBoxContentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgDeleteBlindBoxContent,
      likechain.likenft.v1.Tx.MsgDeleteBlindBoxContentResponse> getDeleteBlindBoxContentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteBlindBoxContent",
      requestType = likechain.likenft.v1.Tx.MsgDeleteBlindBoxContent.class,
      responseType = likechain.likenft.v1.Tx.MsgDeleteBlindBoxContentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgDeleteBlindBoxContent,
      likechain.likenft.v1.Tx.MsgDeleteBlindBoxContentResponse> getDeleteBlindBoxContentMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgDeleteBlindBoxContent, likechain.likenft.v1.Tx.MsgDeleteBlindBoxContentResponse> getDeleteBlindBoxContentMethod;
    if ((getDeleteBlindBoxContentMethod = MsgGrpc.getDeleteBlindBoxContentMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteBlindBoxContentMethod = MsgGrpc.getDeleteBlindBoxContentMethod) == null) {
          MsgGrpc.getDeleteBlindBoxContentMethod = getDeleteBlindBoxContentMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.Tx.MsgDeleteBlindBoxContent, likechain.likenft.v1.Tx.MsgDeleteBlindBoxContentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteBlindBoxContent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.Tx.MsgDeleteBlindBoxContent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.Tx.MsgDeleteBlindBoxContentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteBlindBoxContent"))
              .build();
        }
      }
    }
    return getDeleteBlindBoxContentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgCreateOffer,
      likechain.likenft.v1.Tx.MsgCreateOfferResponse> getCreateOfferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOffer",
      requestType = likechain.likenft.v1.Tx.MsgCreateOffer.class,
      responseType = likechain.likenft.v1.Tx.MsgCreateOfferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgCreateOffer,
      likechain.likenft.v1.Tx.MsgCreateOfferResponse> getCreateOfferMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgCreateOffer, likechain.likenft.v1.Tx.MsgCreateOfferResponse> getCreateOfferMethod;
    if ((getCreateOfferMethod = MsgGrpc.getCreateOfferMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateOfferMethod = MsgGrpc.getCreateOfferMethod) == null) {
          MsgGrpc.getCreateOfferMethod = getCreateOfferMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.Tx.MsgCreateOffer, likechain.likenft.v1.Tx.MsgCreateOfferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOffer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.Tx.MsgCreateOffer.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.Tx.MsgCreateOfferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateOffer"))
              .build();
        }
      }
    }
    return getCreateOfferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgUpdateOffer,
      likechain.likenft.v1.Tx.MsgUpdateOfferResponse> getUpdateOfferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOffer",
      requestType = likechain.likenft.v1.Tx.MsgUpdateOffer.class,
      responseType = likechain.likenft.v1.Tx.MsgUpdateOfferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgUpdateOffer,
      likechain.likenft.v1.Tx.MsgUpdateOfferResponse> getUpdateOfferMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgUpdateOffer, likechain.likenft.v1.Tx.MsgUpdateOfferResponse> getUpdateOfferMethod;
    if ((getUpdateOfferMethod = MsgGrpc.getUpdateOfferMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateOfferMethod = MsgGrpc.getUpdateOfferMethod) == null) {
          MsgGrpc.getUpdateOfferMethod = getUpdateOfferMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.Tx.MsgUpdateOffer, likechain.likenft.v1.Tx.MsgUpdateOfferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOffer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.Tx.MsgUpdateOffer.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.Tx.MsgUpdateOfferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateOffer"))
              .build();
        }
      }
    }
    return getUpdateOfferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgDeleteOffer,
      likechain.likenft.v1.Tx.MsgDeleteOfferResponse> getDeleteOfferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOffer",
      requestType = likechain.likenft.v1.Tx.MsgDeleteOffer.class,
      responseType = likechain.likenft.v1.Tx.MsgDeleteOfferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgDeleteOffer,
      likechain.likenft.v1.Tx.MsgDeleteOfferResponse> getDeleteOfferMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgDeleteOffer, likechain.likenft.v1.Tx.MsgDeleteOfferResponse> getDeleteOfferMethod;
    if ((getDeleteOfferMethod = MsgGrpc.getDeleteOfferMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteOfferMethod = MsgGrpc.getDeleteOfferMethod) == null) {
          MsgGrpc.getDeleteOfferMethod = getDeleteOfferMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.Tx.MsgDeleteOffer, likechain.likenft.v1.Tx.MsgDeleteOfferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteOffer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.Tx.MsgDeleteOffer.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.Tx.MsgDeleteOfferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteOffer"))
              .build();
        }
      }
    }
    return getDeleteOfferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgCreateListing,
      likechain.likenft.v1.Tx.MsgCreateListingResponse> getCreateListingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateListing",
      requestType = likechain.likenft.v1.Tx.MsgCreateListing.class,
      responseType = likechain.likenft.v1.Tx.MsgCreateListingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgCreateListing,
      likechain.likenft.v1.Tx.MsgCreateListingResponse> getCreateListingMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgCreateListing, likechain.likenft.v1.Tx.MsgCreateListingResponse> getCreateListingMethod;
    if ((getCreateListingMethod = MsgGrpc.getCreateListingMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateListingMethod = MsgGrpc.getCreateListingMethod) == null) {
          MsgGrpc.getCreateListingMethod = getCreateListingMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.Tx.MsgCreateListing, likechain.likenft.v1.Tx.MsgCreateListingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateListing"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.Tx.MsgCreateListing.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.Tx.MsgCreateListingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateListing"))
              .build();
        }
      }
    }
    return getCreateListingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgUpdateListing,
      likechain.likenft.v1.Tx.MsgUpdateListingResponse> getUpdateListingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateListing",
      requestType = likechain.likenft.v1.Tx.MsgUpdateListing.class,
      responseType = likechain.likenft.v1.Tx.MsgUpdateListingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgUpdateListing,
      likechain.likenft.v1.Tx.MsgUpdateListingResponse> getUpdateListingMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgUpdateListing, likechain.likenft.v1.Tx.MsgUpdateListingResponse> getUpdateListingMethod;
    if ((getUpdateListingMethod = MsgGrpc.getUpdateListingMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateListingMethod = MsgGrpc.getUpdateListingMethod) == null) {
          MsgGrpc.getUpdateListingMethod = getUpdateListingMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.Tx.MsgUpdateListing, likechain.likenft.v1.Tx.MsgUpdateListingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateListing"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.Tx.MsgUpdateListing.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.Tx.MsgUpdateListingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateListing"))
              .build();
        }
      }
    }
    return getUpdateListingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgDeleteListing,
      likechain.likenft.v1.Tx.MsgDeleteListingResponse> getDeleteListingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteListing",
      requestType = likechain.likenft.v1.Tx.MsgDeleteListing.class,
      responseType = likechain.likenft.v1.Tx.MsgDeleteListingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgDeleteListing,
      likechain.likenft.v1.Tx.MsgDeleteListingResponse> getDeleteListingMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgDeleteListing, likechain.likenft.v1.Tx.MsgDeleteListingResponse> getDeleteListingMethod;
    if ((getDeleteListingMethod = MsgGrpc.getDeleteListingMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteListingMethod = MsgGrpc.getDeleteListingMethod) == null) {
          MsgGrpc.getDeleteListingMethod = getDeleteListingMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.Tx.MsgDeleteListing, likechain.likenft.v1.Tx.MsgDeleteListingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteListing"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.Tx.MsgDeleteListing.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.Tx.MsgDeleteListingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteListing"))
              .build();
        }
      }
    }
    return getDeleteListingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgSellNFT,
      likechain.likenft.v1.Tx.MsgSellNFTResponse> getSellNFTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SellNFT",
      requestType = likechain.likenft.v1.Tx.MsgSellNFT.class,
      responseType = likechain.likenft.v1.Tx.MsgSellNFTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgSellNFT,
      likechain.likenft.v1.Tx.MsgSellNFTResponse> getSellNFTMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgSellNFT, likechain.likenft.v1.Tx.MsgSellNFTResponse> getSellNFTMethod;
    if ((getSellNFTMethod = MsgGrpc.getSellNFTMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSellNFTMethod = MsgGrpc.getSellNFTMethod) == null) {
          MsgGrpc.getSellNFTMethod = getSellNFTMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.Tx.MsgSellNFT, likechain.likenft.v1.Tx.MsgSellNFTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SellNFT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.Tx.MsgSellNFT.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.Tx.MsgSellNFTResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SellNFT"))
              .build();
        }
      }
    }
    return getSellNFTMethod;
  }

  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgBuyNFT,
      likechain.likenft.v1.Tx.MsgBuyNFTResponse> getBuyNFTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuyNFT",
      requestType = likechain.likenft.v1.Tx.MsgBuyNFT.class,
      responseType = likechain.likenft.v1.Tx.MsgBuyNFTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgBuyNFT,
      likechain.likenft.v1.Tx.MsgBuyNFTResponse> getBuyNFTMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgBuyNFT, likechain.likenft.v1.Tx.MsgBuyNFTResponse> getBuyNFTMethod;
    if ((getBuyNFTMethod = MsgGrpc.getBuyNFTMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBuyNFTMethod = MsgGrpc.getBuyNFTMethod) == null) {
          MsgGrpc.getBuyNFTMethod = getBuyNFTMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.Tx.MsgBuyNFT, likechain.likenft.v1.Tx.MsgBuyNFTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BuyNFT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.Tx.MsgBuyNFT.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.Tx.MsgBuyNFTResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("BuyNFT"))
              .build();
        }
      }
    }
    return getBuyNFTMethod;
  }

  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgCreateRoyaltyConfig,
      likechain.likenft.v1.Tx.MsgCreateRoyaltyConfigResponse> getCreateRoyaltyConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRoyaltyConfig",
      requestType = likechain.likenft.v1.Tx.MsgCreateRoyaltyConfig.class,
      responseType = likechain.likenft.v1.Tx.MsgCreateRoyaltyConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgCreateRoyaltyConfig,
      likechain.likenft.v1.Tx.MsgCreateRoyaltyConfigResponse> getCreateRoyaltyConfigMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgCreateRoyaltyConfig, likechain.likenft.v1.Tx.MsgCreateRoyaltyConfigResponse> getCreateRoyaltyConfigMethod;
    if ((getCreateRoyaltyConfigMethod = MsgGrpc.getCreateRoyaltyConfigMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateRoyaltyConfigMethod = MsgGrpc.getCreateRoyaltyConfigMethod) == null) {
          MsgGrpc.getCreateRoyaltyConfigMethod = getCreateRoyaltyConfigMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.Tx.MsgCreateRoyaltyConfig, likechain.likenft.v1.Tx.MsgCreateRoyaltyConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRoyaltyConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.Tx.MsgCreateRoyaltyConfig.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.Tx.MsgCreateRoyaltyConfigResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateRoyaltyConfig"))
              .build();
        }
      }
    }
    return getCreateRoyaltyConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgUpdateRoyaltyConfig,
      likechain.likenft.v1.Tx.MsgUpdateRoyaltyConfigResponse> getUpdateRoyaltyConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRoyaltyConfig",
      requestType = likechain.likenft.v1.Tx.MsgUpdateRoyaltyConfig.class,
      responseType = likechain.likenft.v1.Tx.MsgUpdateRoyaltyConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgUpdateRoyaltyConfig,
      likechain.likenft.v1.Tx.MsgUpdateRoyaltyConfigResponse> getUpdateRoyaltyConfigMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgUpdateRoyaltyConfig, likechain.likenft.v1.Tx.MsgUpdateRoyaltyConfigResponse> getUpdateRoyaltyConfigMethod;
    if ((getUpdateRoyaltyConfigMethod = MsgGrpc.getUpdateRoyaltyConfigMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateRoyaltyConfigMethod = MsgGrpc.getUpdateRoyaltyConfigMethod) == null) {
          MsgGrpc.getUpdateRoyaltyConfigMethod = getUpdateRoyaltyConfigMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.Tx.MsgUpdateRoyaltyConfig, likechain.likenft.v1.Tx.MsgUpdateRoyaltyConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRoyaltyConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.Tx.MsgUpdateRoyaltyConfig.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.Tx.MsgUpdateRoyaltyConfigResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateRoyaltyConfig"))
              .build();
        }
      }
    }
    return getUpdateRoyaltyConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgDeleteRoyaltyConfig,
      likechain.likenft.v1.Tx.MsgDeleteRoyaltyConfigResponse> getDeleteRoyaltyConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRoyaltyConfig",
      requestType = likechain.likenft.v1.Tx.MsgDeleteRoyaltyConfig.class,
      responseType = likechain.likenft.v1.Tx.MsgDeleteRoyaltyConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgDeleteRoyaltyConfig,
      likechain.likenft.v1.Tx.MsgDeleteRoyaltyConfigResponse> getDeleteRoyaltyConfigMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.Tx.MsgDeleteRoyaltyConfig, likechain.likenft.v1.Tx.MsgDeleteRoyaltyConfigResponse> getDeleteRoyaltyConfigMethod;
    if ((getDeleteRoyaltyConfigMethod = MsgGrpc.getDeleteRoyaltyConfigMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteRoyaltyConfigMethod = MsgGrpc.getDeleteRoyaltyConfigMethod) == null) {
          MsgGrpc.getDeleteRoyaltyConfigMethod = getDeleteRoyaltyConfigMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.Tx.MsgDeleteRoyaltyConfig, likechain.likenft.v1.Tx.MsgDeleteRoyaltyConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRoyaltyConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.Tx.MsgDeleteRoyaltyConfig.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.Tx.MsgDeleteRoyaltyConfigResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteRoyaltyConfig"))
              .build();
        }
      }
    }
    return getDeleteRoyaltyConfigMethod;
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
    public void newClass(likechain.likenft.v1.Tx.MsgNewClass request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgNewClassResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNewClassMethod(), responseObserver);
    }

    /**
     */
    public void updateClass(likechain.likenft.v1.Tx.MsgUpdateClass request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgUpdateClassResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateClassMethod(), responseObserver);
    }

    /**
     */
    public void mintNFT(likechain.likenft.v1.Tx.MsgMintNFT request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgMintNFTResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMintNFTMethod(), responseObserver);
    }

    /**
     */
    public void burnNFT(likechain.likenft.v1.Tx.MsgBurnNFT request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgBurnNFTResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBurnNFTMethod(), responseObserver);
    }

    /**
     */
    public void createBlindBoxContent(likechain.likenft.v1.Tx.MsgCreateBlindBoxContent request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgCreateBlindBoxContentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateBlindBoxContentMethod(), responseObserver);
    }

    /**
     */
    public void updateBlindBoxContent(likechain.likenft.v1.Tx.MsgUpdateBlindBoxContent request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgUpdateBlindBoxContentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateBlindBoxContentMethod(), responseObserver);
    }

    /**
     */
    public void deleteBlindBoxContent(likechain.likenft.v1.Tx.MsgDeleteBlindBoxContent request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgDeleteBlindBoxContentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteBlindBoxContentMethod(), responseObserver);
    }

    /**
     */
    public void createOffer(likechain.likenft.v1.Tx.MsgCreateOffer request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgCreateOfferResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateOfferMethod(), responseObserver);
    }

    /**
     */
    public void updateOffer(likechain.likenft.v1.Tx.MsgUpdateOffer request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgUpdateOfferResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateOfferMethod(), responseObserver);
    }

    /**
     */
    public void deleteOffer(likechain.likenft.v1.Tx.MsgDeleteOffer request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgDeleteOfferResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteOfferMethod(), responseObserver);
    }

    /**
     */
    public void createListing(likechain.likenft.v1.Tx.MsgCreateListing request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgCreateListingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateListingMethod(), responseObserver);
    }

    /**
     */
    public void updateListing(likechain.likenft.v1.Tx.MsgUpdateListing request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgUpdateListingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateListingMethod(), responseObserver);
    }

    /**
     */
    public void deleteListing(likechain.likenft.v1.Tx.MsgDeleteListing request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgDeleteListingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteListingMethod(), responseObserver);
    }

    /**
     */
    public void sellNFT(likechain.likenft.v1.Tx.MsgSellNFT request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgSellNFTResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSellNFTMethod(), responseObserver);
    }

    /**
     */
    public void buyNFT(likechain.likenft.v1.Tx.MsgBuyNFT request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgBuyNFTResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBuyNFTMethod(), responseObserver);
    }

    /**
     */
    public void createRoyaltyConfig(likechain.likenft.v1.Tx.MsgCreateRoyaltyConfig request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgCreateRoyaltyConfigResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateRoyaltyConfigMethod(), responseObserver);
    }

    /**
     */
    public void updateRoyaltyConfig(likechain.likenft.v1.Tx.MsgUpdateRoyaltyConfig request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgUpdateRoyaltyConfigResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateRoyaltyConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void deleteRoyaltyConfig(likechain.likenft.v1.Tx.MsgDeleteRoyaltyConfig request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgDeleteRoyaltyConfigResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteRoyaltyConfigMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNewClassMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.Tx.MsgNewClass,
                likechain.likenft.v1.Tx.MsgNewClassResponse>(
                  this, METHODID_NEW_CLASS)))
          .addMethod(
            getUpdateClassMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.Tx.MsgUpdateClass,
                likechain.likenft.v1.Tx.MsgUpdateClassResponse>(
                  this, METHODID_UPDATE_CLASS)))
          .addMethod(
            getMintNFTMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.Tx.MsgMintNFT,
                likechain.likenft.v1.Tx.MsgMintNFTResponse>(
                  this, METHODID_MINT_NFT)))
          .addMethod(
            getBurnNFTMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.Tx.MsgBurnNFT,
                likechain.likenft.v1.Tx.MsgBurnNFTResponse>(
                  this, METHODID_BURN_NFT)))
          .addMethod(
            getCreateBlindBoxContentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.Tx.MsgCreateBlindBoxContent,
                likechain.likenft.v1.Tx.MsgCreateBlindBoxContentResponse>(
                  this, METHODID_CREATE_BLIND_BOX_CONTENT)))
          .addMethod(
            getUpdateBlindBoxContentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.Tx.MsgUpdateBlindBoxContent,
                likechain.likenft.v1.Tx.MsgUpdateBlindBoxContentResponse>(
                  this, METHODID_UPDATE_BLIND_BOX_CONTENT)))
          .addMethod(
            getDeleteBlindBoxContentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.Tx.MsgDeleteBlindBoxContent,
                likechain.likenft.v1.Tx.MsgDeleteBlindBoxContentResponse>(
                  this, METHODID_DELETE_BLIND_BOX_CONTENT)))
          .addMethod(
            getCreateOfferMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.Tx.MsgCreateOffer,
                likechain.likenft.v1.Tx.MsgCreateOfferResponse>(
                  this, METHODID_CREATE_OFFER)))
          .addMethod(
            getUpdateOfferMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.Tx.MsgUpdateOffer,
                likechain.likenft.v1.Tx.MsgUpdateOfferResponse>(
                  this, METHODID_UPDATE_OFFER)))
          .addMethod(
            getDeleteOfferMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.Tx.MsgDeleteOffer,
                likechain.likenft.v1.Tx.MsgDeleteOfferResponse>(
                  this, METHODID_DELETE_OFFER)))
          .addMethod(
            getCreateListingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.Tx.MsgCreateListing,
                likechain.likenft.v1.Tx.MsgCreateListingResponse>(
                  this, METHODID_CREATE_LISTING)))
          .addMethod(
            getUpdateListingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.Tx.MsgUpdateListing,
                likechain.likenft.v1.Tx.MsgUpdateListingResponse>(
                  this, METHODID_UPDATE_LISTING)))
          .addMethod(
            getDeleteListingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.Tx.MsgDeleteListing,
                likechain.likenft.v1.Tx.MsgDeleteListingResponse>(
                  this, METHODID_DELETE_LISTING)))
          .addMethod(
            getSellNFTMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.Tx.MsgSellNFT,
                likechain.likenft.v1.Tx.MsgSellNFTResponse>(
                  this, METHODID_SELL_NFT)))
          .addMethod(
            getBuyNFTMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.Tx.MsgBuyNFT,
                likechain.likenft.v1.Tx.MsgBuyNFTResponse>(
                  this, METHODID_BUY_NFT)))
          .addMethod(
            getCreateRoyaltyConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.Tx.MsgCreateRoyaltyConfig,
                likechain.likenft.v1.Tx.MsgCreateRoyaltyConfigResponse>(
                  this, METHODID_CREATE_ROYALTY_CONFIG)))
          .addMethod(
            getUpdateRoyaltyConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.Tx.MsgUpdateRoyaltyConfig,
                likechain.likenft.v1.Tx.MsgUpdateRoyaltyConfigResponse>(
                  this, METHODID_UPDATE_ROYALTY_CONFIG)))
          .addMethod(
            getDeleteRoyaltyConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.Tx.MsgDeleteRoyaltyConfig,
                likechain.likenft.v1.Tx.MsgDeleteRoyaltyConfigResponse>(
                  this, METHODID_DELETE_ROYALTY_CONFIG)))
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
    public void newClass(likechain.likenft.v1.Tx.MsgNewClass request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgNewClassResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNewClassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateClass(likechain.likenft.v1.Tx.MsgUpdateClass request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgUpdateClassResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateClassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void mintNFT(likechain.likenft.v1.Tx.MsgMintNFT request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgMintNFTResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMintNFTMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void burnNFT(likechain.likenft.v1.Tx.MsgBurnNFT request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgBurnNFTResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBurnNFTMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createBlindBoxContent(likechain.likenft.v1.Tx.MsgCreateBlindBoxContent request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgCreateBlindBoxContentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateBlindBoxContentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateBlindBoxContent(likechain.likenft.v1.Tx.MsgUpdateBlindBoxContent request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgUpdateBlindBoxContentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateBlindBoxContentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteBlindBoxContent(likechain.likenft.v1.Tx.MsgDeleteBlindBoxContent request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgDeleteBlindBoxContentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteBlindBoxContentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createOffer(likechain.likenft.v1.Tx.MsgCreateOffer request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgCreateOfferResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateOfferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateOffer(likechain.likenft.v1.Tx.MsgUpdateOffer request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgUpdateOfferResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateOfferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteOffer(likechain.likenft.v1.Tx.MsgDeleteOffer request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgDeleteOfferResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteOfferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createListing(likechain.likenft.v1.Tx.MsgCreateListing request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgCreateListingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateListingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateListing(likechain.likenft.v1.Tx.MsgUpdateListing request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgUpdateListingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateListingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteListing(likechain.likenft.v1.Tx.MsgDeleteListing request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgDeleteListingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteListingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sellNFT(likechain.likenft.v1.Tx.MsgSellNFT request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgSellNFTResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSellNFTMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void buyNFT(likechain.likenft.v1.Tx.MsgBuyNFT request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgBuyNFTResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBuyNFTMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createRoyaltyConfig(likechain.likenft.v1.Tx.MsgCreateRoyaltyConfig request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgCreateRoyaltyConfigResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateRoyaltyConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRoyaltyConfig(likechain.likenft.v1.Tx.MsgUpdateRoyaltyConfig request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgUpdateRoyaltyConfigResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateRoyaltyConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void deleteRoyaltyConfig(likechain.likenft.v1.Tx.MsgDeleteRoyaltyConfig request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgDeleteRoyaltyConfigResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteRoyaltyConfigMethod(), getCallOptions()), request, responseObserver);
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
    public likechain.likenft.v1.Tx.MsgNewClassResponse newClass(likechain.likenft.v1.Tx.MsgNewClass request) {
      return blockingUnaryCall(
          getChannel(), getNewClassMethod(), getCallOptions(), request);
    }

    /**
     */
    public likechain.likenft.v1.Tx.MsgUpdateClassResponse updateClass(likechain.likenft.v1.Tx.MsgUpdateClass request) {
      return blockingUnaryCall(
          getChannel(), getUpdateClassMethod(), getCallOptions(), request);
    }

    /**
     */
    public likechain.likenft.v1.Tx.MsgMintNFTResponse mintNFT(likechain.likenft.v1.Tx.MsgMintNFT request) {
      return blockingUnaryCall(
          getChannel(), getMintNFTMethod(), getCallOptions(), request);
    }

    /**
     */
    public likechain.likenft.v1.Tx.MsgBurnNFTResponse burnNFT(likechain.likenft.v1.Tx.MsgBurnNFT request) {
      return blockingUnaryCall(
          getChannel(), getBurnNFTMethod(), getCallOptions(), request);
    }

    /**
     */
    public likechain.likenft.v1.Tx.MsgCreateBlindBoxContentResponse createBlindBoxContent(likechain.likenft.v1.Tx.MsgCreateBlindBoxContent request) {
      return blockingUnaryCall(
          getChannel(), getCreateBlindBoxContentMethod(), getCallOptions(), request);
    }

    /**
     */
    public likechain.likenft.v1.Tx.MsgUpdateBlindBoxContentResponse updateBlindBoxContent(likechain.likenft.v1.Tx.MsgUpdateBlindBoxContent request) {
      return blockingUnaryCall(
          getChannel(), getUpdateBlindBoxContentMethod(), getCallOptions(), request);
    }

    /**
     */
    public likechain.likenft.v1.Tx.MsgDeleteBlindBoxContentResponse deleteBlindBoxContent(likechain.likenft.v1.Tx.MsgDeleteBlindBoxContent request) {
      return blockingUnaryCall(
          getChannel(), getDeleteBlindBoxContentMethod(), getCallOptions(), request);
    }

    /**
     */
    public likechain.likenft.v1.Tx.MsgCreateOfferResponse createOffer(likechain.likenft.v1.Tx.MsgCreateOffer request) {
      return blockingUnaryCall(
          getChannel(), getCreateOfferMethod(), getCallOptions(), request);
    }

    /**
     */
    public likechain.likenft.v1.Tx.MsgUpdateOfferResponse updateOffer(likechain.likenft.v1.Tx.MsgUpdateOffer request) {
      return blockingUnaryCall(
          getChannel(), getUpdateOfferMethod(), getCallOptions(), request);
    }

    /**
     */
    public likechain.likenft.v1.Tx.MsgDeleteOfferResponse deleteOffer(likechain.likenft.v1.Tx.MsgDeleteOffer request) {
      return blockingUnaryCall(
          getChannel(), getDeleteOfferMethod(), getCallOptions(), request);
    }

    /**
     */
    public likechain.likenft.v1.Tx.MsgCreateListingResponse createListing(likechain.likenft.v1.Tx.MsgCreateListing request) {
      return blockingUnaryCall(
          getChannel(), getCreateListingMethod(), getCallOptions(), request);
    }

    /**
     */
    public likechain.likenft.v1.Tx.MsgUpdateListingResponse updateListing(likechain.likenft.v1.Tx.MsgUpdateListing request) {
      return blockingUnaryCall(
          getChannel(), getUpdateListingMethod(), getCallOptions(), request);
    }

    /**
     */
    public likechain.likenft.v1.Tx.MsgDeleteListingResponse deleteListing(likechain.likenft.v1.Tx.MsgDeleteListing request) {
      return blockingUnaryCall(
          getChannel(), getDeleteListingMethod(), getCallOptions(), request);
    }

    /**
     */
    public likechain.likenft.v1.Tx.MsgSellNFTResponse sellNFT(likechain.likenft.v1.Tx.MsgSellNFT request) {
      return blockingUnaryCall(
          getChannel(), getSellNFTMethod(), getCallOptions(), request);
    }

    /**
     */
    public likechain.likenft.v1.Tx.MsgBuyNFTResponse buyNFT(likechain.likenft.v1.Tx.MsgBuyNFT request) {
      return blockingUnaryCall(
          getChannel(), getBuyNFTMethod(), getCallOptions(), request);
    }

    /**
     */
    public likechain.likenft.v1.Tx.MsgCreateRoyaltyConfigResponse createRoyaltyConfig(likechain.likenft.v1.Tx.MsgCreateRoyaltyConfig request) {
      return blockingUnaryCall(
          getChannel(), getCreateRoyaltyConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public likechain.likenft.v1.Tx.MsgUpdateRoyaltyConfigResponse updateRoyaltyConfig(likechain.likenft.v1.Tx.MsgUpdateRoyaltyConfig request) {
      return blockingUnaryCall(
          getChannel(), getUpdateRoyaltyConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public likechain.likenft.v1.Tx.MsgDeleteRoyaltyConfigResponse deleteRoyaltyConfig(likechain.likenft.v1.Tx.MsgDeleteRoyaltyConfig request) {
      return blockingUnaryCall(
          getChannel(), getDeleteRoyaltyConfigMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.Tx.MsgNewClassResponse> newClass(
        likechain.likenft.v1.Tx.MsgNewClass request) {
      return futureUnaryCall(
          getChannel().newCall(getNewClassMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.Tx.MsgUpdateClassResponse> updateClass(
        likechain.likenft.v1.Tx.MsgUpdateClass request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateClassMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.Tx.MsgMintNFTResponse> mintNFT(
        likechain.likenft.v1.Tx.MsgMintNFT request) {
      return futureUnaryCall(
          getChannel().newCall(getMintNFTMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.Tx.MsgBurnNFTResponse> burnNFT(
        likechain.likenft.v1.Tx.MsgBurnNFT request) {
      return futureUnaryCall(
          getChannel().newCall(getBurnNFTMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.Tx.MsgCreateBlindBoxContentResponse> createBlindBoxContent(
        likechain.likenft.v1.Tx.MsgCreateBlindBoxContent request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateBlindBoxContentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.Tx.MsgUpdateBlindBoxContentResponse> updateBlindBoxContent(
        likechain.likenft.v1.Tx.MsgUpdateBlindBoxContent request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateBlindBoxContentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.Tx.MsgDeleteBlindBoxContentResponse> deleteBlindBoxContent(
        likechain.likenft.v1.Tx.MsgDeleteBlindBoxContent request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteBlindBoxContentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.Tx.MsgCreateOfferResponse> createOffer(
        likechain.likenft.v1.Tx.MsgCreateOffer request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateOfferMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.Tx.MsgUpdateOfferResponse> updateOffer(
        likechain.likenft.v1.Tx.MsgUpdateOffer request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateOfferMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.Tx.MsgDeleteOfferResponse> deleteOffer(
        likechain.likenft.v1.Tx.MsgDeleteOffer request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteOfferMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.Tx.MsgCreateListingResponse> createListing(
        likechain.likenft.v1.Tx.MsgCreateListing request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateListingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.Tx.MsgUpdateListingResponse> updateListing(
        likechain.likenft.v1.Tx.MsgUpdateListing request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateListingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.Tx.MsgDeleteListingResponse> deleteListing(
        likechain.likenft.v1.Tx.MsgDeleteListing request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteListingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.Tx.MsgSellNFTResponse> sellNFT(
        likechain.likenft.v1.Tx.MsgSellNFT request) {
      return futureUnaryCall(
          getChannel().newCall(getSellNFTMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.Tx.MsgBuyNFTResponse> buyNFT(
        likechain.likenft.v1.Tx.MsgBuyNFT request) {
      return futureUnaryCall(
          getChannel().newCall(getBuyNFTMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.Tx.MsgCreateRoyaltyConfigResponse> createRoyaltyConfig(
        likechain.likenft.v1.Tx.MsgCreateRoyaltyConfig request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateRoyaltyConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.Tx.MsgUpdateRoyaltyConfigResponse> updateRoyaltyConfig(
        likechain.likenft.v1.Tx.MsgUpdateRoyaltyConfig request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateRoyaltyConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.Tx.MsgDeleteRoyaltyConfigResponse> deleteRoyaltyConfig(
        likechain.likenft.v1.Tx.MsgDeleteRoyaltyConfig request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteRoyaltyConfigMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NEW_CLASS = 0;
  private static final int METHODID_UPDATE_CLASS = 1;
  private static final int METHODID_MINT_NFT = 2;
  private static final int METHODID_BURN_NFT = 3;
  private static final int METHODID_CREATE_BLIND_BOX_CONTENT = 4;
  private static final int METHODID_UPDATE_BLIND_BOX_CONTENT = 5;
  private static final int METHODID_DELETE_BLIND_BOX_CONTENT = 6;
  private static final int METHODID_CREATE_OFFER = 7;
  private static final int METHODID_UPDATE_OFFER = 8;
  private static final int METHODID_DELETE_OFFER = 9;
  private static final int METHODID_CREATE_LISTING = 10;
  private static final int METHODID_UPDATE_LISTING = 11;
  private static final int METHODID_DELETE_LISTING = 12;
  private static final int METHODID_SELL_NFT = 13;
  private static final int METHODID_BUY_NFT = 14;
  private static final int METHODID_CREATE_ROYALTY_CONFIG = 15;
  private static final int METHODID_UPDATE_ROYALTY_CONFIG = 16;
  private static final int METHODID_DELETE_ROYALTY_CONFIG = 17;

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
        case METHODID_NEW_CLASS:
          serviceImpl.newClass((likechain.likenft.v1.Tx.MsgNewClass) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgNewClassResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CLASS:
          serviceImpl.updateClass((likechain.likenft.v1.Tx.MsgUpdateClass) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgUpdateClassResponse>) responseObserver);
          break;
        case METHODID_MINT_NFT:
          serviceImpl.mintNFT((likechain.likenft.v1.Tx.MsgMintNFT) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgMintNFTResponse>) responseObserver);
          break;
        case METHODID_BURN_NFT:
          serviceImpl.burnNFT((likechain.likenft.v1.Tx.MsgBurnNFT) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgBurnNFTResponse>) responseObserver);
          break;
        case METHODID_CREATE_BLIND_BOX_CONTENT:
          serviceImpl.createBlindBoxContent((likechain.likenft.v1.Tx.MsgCreateBlindBoxContent) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgCreateBlindBoxContentResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BLIND_BOX_CONTENT:
          serviceImpl.updateBlindBoxContent((likechain.likenft.v1.Tx.MsgUpdateBlindBoxContent) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgUpdateBlindBoxContentResponse>) responseObserver);
          break;
        case METHODID_DELETE_BLIND_BOX_CONTENT:
          serviceImpl.deleteBlindBoxContent((likechain.likenft.v1.Tx.MsgDeleteBlindBoxContent) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgDeleteBlindBoxContentResponse>) responseObserver);
          break;
        case METHODID_CREATE_OFFER:
          serviceImpl.createOffer((likechain.likenft.v1.Tx.MsgCreateOffer) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgCreateOfferResponse>) responseObserver);
          break;
        case METHODID_UPDATE_OFFER:
          serviceImpl.updateOffer((likechain.likenft.v1.Tx.MsgUpdateOffer) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgUpdateOfferResponse>) responseObserver);
          break;
        case METHODID_DELETE_OFFER:
          serviceImpl.deleteOffer((likechain.likenft.v1.Tx.MsgDeleteOffer) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgDeleteOfferResponse>) responseObserver);
          break;
        case METHODID_CREATE_LISTING:
          serviceImpl.createListing((likechain.likenft.v1.Tx.MsgCreateListing) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgCreateListingResponse>) responseObserver);
          break;
        case METHODID_UPDATE_LISTING:
          serviceImpl.updateListing((likechain.likenft.v1.Tx.MsgUpdateListing) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgUpdateListingResponse>) responseObserver);
          break;
        case METHODID_DELETE_LISTING:
          serviceImpl.deleteListing((likechain.likenft.v1.Tx.MsgDeleteListing) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgDeleteListingResponse>) responseObserver);
          break;
        case METHODID_SELL_NFT:
          serviceImpl.sellNFT((likechain.likenft.v1.Tx.MsgSellNFT) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgSellNFTResponse>) responseObserver);
          break;
        case METHODID_BUY_NFT:
          serviceImpl.buyNFT((likechain.likenft.v1.Tx.MsgBuyNFT) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgBuyNFTResponse>) responseObserver);
          break;
        case METHODID_CREATE_ROYALTY_CONFIG:
          serviceImpl.createRoyaltyConfig((likechain.likenft.v1.Tx.MsgCreateRoyaltyConfig) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgCreateRoyaltyConfigResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ROYALTY_CONFIG:
          serviceImpl.updateRoyaltyConfig((likechain.likenft.v1.Tx.MsgUpdateRoyaltyConfig) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgUpdateRoyaltyConfigResponse>) responseObserver);
          break;
        case METHODID_DELETE_ROYALTY_CONFIG:
          serviceImpl.deleteRoyaltyConfig((likechain.likenft.v1.Tx.MsgDeleteRoyaltyConfig) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.Tx.MsgDeleteRoyaltyConfigResponse>) responseObserver);
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
      return likechain.likenft.v1.Tx.getDescriptor();
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
              .addMethod(getNewClassMethod())
              .addMethod(getUpdateClassMethod())
              .addMethod(getMintNFTMethod())
              .addMethod(getBurnNFTMethod())
              .addMethod(getCreateBlindBoxContentMethod())
              .addMethod(getUpdateBlindBoxContentMethod())
              .addMethod(getDeleteBlindBoxContentMethod())
              .addMethod(getCreateOfferMethod())
              .addMethod(getUpdateOfferMethod())
              .addMethod(getDeleteOfferMethod())
              .addMethod(getCreateListingMethod())
              .addMethod(getUpdateListingMethod())
              .addMethod(getDeleteListingMethod())
              .addMethod(getSellNFTMethod())
              .addMethod(getBuyNFTMethod())
              .addMethod(getCreateRoyaltyConfigMethod())
              .addMethod(getUpdateRoyaltyConfigMethod())
              .addMethod(getDeleteRoyaltyConfigMethod())
              .build();
        }
      }
    }
    return result;
  }
}
