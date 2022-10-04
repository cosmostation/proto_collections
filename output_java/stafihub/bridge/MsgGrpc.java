package stafihub.bridge;

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
    comments = "Source: stafihub/bridge/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "stafihub.stafihub.bridge.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<stafihub.bridge.Tx.MsgSetResourceidToDenom,
      stafihub.bridge.Tx.MsgSetResourceidToDenomResponse> getSetResourceidToDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetResourceidToDenom",
      requestType = stafihub.bridge.Tx.MsgSetResourceidToDenom.class,
      responseType = stafihub.bridge.Tx.MsgSetResourceidToDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.bridge.Tx.MsgSetResourceidToDenom,
      stafihub.bridge.Tx.MsgSetResourceidToDenomResponse> getSetResourceidToDenomMethod() {
    io.grpc.MethodDescriptor<stafihub.bridge.Tx.MsgSetResourceidToDenom, stafihub.bridge.Tx.MsgSetResourceidToDenomResponse> getSetResourceidToDenomMethod;
    if ((getSetResourceidToDenomMethod = MsgGrpc.getSetResourceidToDenomMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetResourceidToDenomMethod = MsgGrpc.getSetResourceidToDenomMethod) == null) {
          MsgGrpc.getSetResourceidToDenomMethod = getSetResourceidToDenomMethod =
              io.grpc.MethodDescriptor.<stafihub.bridge.Tx.MsgSetResourceidToDenom, stafihub.bridge.Tx.MsgSetResourceidToDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetResourceidToDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.bridge.Tx.MsgSetResourceidToDenom.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.bridge.Tx.MsgSetResourceidToDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetResourceidToDenom"))
              .build();
        }
      }
    }
    return getSetResourceidToDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.bridge.Tx.MsgDeposit,
      stafihub.bridge.Tx.MsgDepositResponse> getDepositMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Deposit",
      requestType = stafihub.bridge.Tx.MsgDeposit.class,
      responseType = stafihub.bridge.Tx.MsgDepositResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.bridge.Tx.MsgDeposit,
      stafihub.bridge.Tx.MsgDepositResponse> getDepositMethod() {
    io.grpc.MethodDescriptor<stafihub.bridge.Tx.MsgDeposit, stafihub.bridge.Tx.MsgDepositResponse> getDepositMethod;
    if ((getDepositMethod = MsgGrpc.getDepositMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDepositMethod = MsgGrpc.getDepositMethod) == null) {
          MsgGrpc.getDepositMethod = getDepositMethod =
              io.grpc.MethodDescriptor.<stafihub.bridge.Tx.MsgDeposit, stafihub.bridge.Tx.MsgDepositResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Deposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.bridge.Tx.MsgDeposit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.bridge.Tx.MsgDepositResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Deposit"))
              .build();
        }
      }
    }
    return getDepositMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.bridge.Tx.MsgAddChainId,
      stafihub.bridge.Tx.MsgAddChainIdResponse> getAddChainIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddChainId",
      requestType = stafihub.bridge.Tx.MsgAddChainId.class,
      responseType = stafihub.bridge.Tx.MsgAddChainIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.bridge.Tx.MsgAddChainId,
      stafihub.bridge.Tx.MsgAddChainIdResponse> getAddChainIdMethod() {
    io.grpc.MethodDescriptor<stafihub.bridge.Tx.MsgAddChainId, stafihub.bridge.Tx.MsgAddChainIdResponse> getAddChainIdMethod;
    if ((getAddChainIdMethod = MsgGrpc.getAddChainIdMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddChainIdMethod = MsgGrpc.getAddChainIdMethod) == null) {
          MsgGrpc.getAddChainIdMethod = getAddChainIdMethod =
              io.grpc.MethodDescriptor.<stafihub.bridge.Tx.MsgAddChainId, stafihub.bridge.Tx.MsgAddChainIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddChainId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.bridge.Tx.MsgAddChainId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.bridge.Tx.MsgAddChainIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddChainId"))
              .build();
        }
      }
    }
    return getAddChainIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.bridge.Tx.MsgVoteProposal,
      stafihub.bridge.Tx.MsgVoteProposalResponse> getVoteProposalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VoteProposal",
      requestType = stafihub.bridge.Tx.MsgVoteProposal.class,
      responseType = stafihub.bridge.Tx.MsgVoteProposalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.bridge.Tx.MsgVoteProposal,
      stafihub.bridge.Tx.MsgVoteProposalResponse> getVoteProposalMethod() {
    io.grpc.MethodDescriptor<stafihub.bridge.Tx.MsgVoteProposal, stafihub.bridge.Tx.MsgVoteProposalResponse> getVoteProposalMethod;
    if ((getVoteProposalMethod = MsgGrpc.getVoteProposalMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getVoteProposalMethod = MsgGrpc.getVoteProposalMethod) == null) {
          MsgGrpc.getVoteProposalMethod = getVoteProposalMethod =
              io.grpc.MethodDescriptor.<stafihub.bridge.Tx.MsgVoteProposal, stafihub.bridge.Tx.MsgVoteProposalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VoteProposal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.bridge.Tx.MsgVoteProposal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.bridge.Tx.MsgVoteProposalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("VoteProposal"))
              .build();
        }
      }
    }
    return getVoteProposalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.bridge.Tx.MsgRmChainId,
      stafihub.bridge.Tx.MsgRmChainIdResponse> getRmChainIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RmChainId",
      requestType = stafihub.bridge.Tx.MsgRmChainId.class,
      responseType = stafihub.bridge.Tx.MsgRmChainIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.bridge.Tx.MsgRmChainId,
      stafihub.bridge.Tx.MsgRmChainIdResponse> getRmChainIdMethod() {
    io.grpc.MethodDescriptor<stafihub.bridge.Tx.MsgRmChainId, stafihub.bridge.Tx.MsgRmChainIdResponse> getRmChainIdMethod;
    if ((getRmChainIdMethod = MsgGrpc.getRmChainIdMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRmChainIdMethod = MsgGrpc.getRmChainIdMethod) == null) {
          MsgGrpc.getRmChainIdMethod = getRmChainIdMethod =
              io.grpc.MethodDescriptor.<stafihub.bridge.Tx.MsgRmChainId, stafihub.bridge.Tx.MsgRmChainIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RmChainId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.bridge.Tx.MsgRmChainId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.bridge.Tx.MsgRmChainIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RmChainId"))
              .build();
        }
      }
    }
    return getRmChainIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.bridge.Tx.MsgSetRelayFeeReceiver,
      stafihub.bridge.Tx.MsgSetRelayFeeReceiverResponse> getSetRelayFeeReceiverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRelayFeeReceiver",
      requestType = stafihub.bridge.Tx.MsgSetRelayFeeReceiver.class,
      responseType = stafihub.bridge.Tx.MsgSetRelayFeeReceiverResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.bridge.Tx.MsgSetRelayFeeReceiver,
      stafihub.bridge.Tx.MsgSetRelayFeeReceiverResponse> getSetRelayFeeReceiverMethod() {
    io.grpc.MethodDescriptor<stafihub.bridge.Tx.MsgSetRelayFeeReceiver, stafihub.bridge.Tx.MsgSetRelayFeeReceiverResponse> getSetRelayFeeReceiverMethod;
    if ((getSetRelayFeeReceiverMethod = MsgGrpc.getSetRelayFeeReceiverMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetRelayFeeReceiverMethod = MsgGrpc.getSetRelayFeeReceiverMethod) == null) {
          MsgGrpc.getSetRelayFeeReceiverMethod = getSetRelayFeeReceiverMethod =
              io.grpc.MethodDescriptor.<stafihub.bridge.Tx.MsgSetRelayFeeReceiver, stafihub.bridge.Tx.MsgSetRelayFeeReceiverResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRelayFeeReceiver"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.bridge.Tx.MsgSetRelayFeeReceiver.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.bridge.Tx.MsgSetRelayFeeReceiverResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetRelayFeeReceiver"))
              .build();
        }
      }
    }
    return getSetRelayFeeReceiverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.bridge.Tx.MsgSetRelayFee,
      stafihub.bridge.Tx.MsgSetRelayFeeResponse> getSetRelayFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRelayFee",
      requestType = stafihub.bridge.Tx.MsgSetRelayFee.class,
      responseType = stafihub.bridge.Tx.MsgSetRelayFeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.bridge.Tx.MsgSetRelayFee,
      stafihub.bridge.Tx.MsgSetRelayFeeResponse> getSetRelayFeeMethod() {
    io.grpc.MethodDescriptor<stafihub.bridge.Tx.MsgSetRelayFee, stafihub.bridge.Tx.MsgSetRelayFeeResponse> getSetRelayFeeMethod;
    if ((getSetRelayFeeMethod = MsgGrpc.getSetRelayFeeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetRelayFeeMethod = MsgGrpc.getSetRelayFeeMethod) == null) {
          MsgGrpc.getSetRelayFeeMethod = getSetRelayFeeMethod =
              io.grpc.MethodDescriptor.<stafihub.bridge.Tx.MsgSetRelayFee, stafihub.bridge.Tx.MsgSetRelayFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRelayFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.bridge.Tx.MsgSetRelayFee.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.bridge.Tx.MsgSetRelayFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetRelayFee"))
              .build();
        }
      }
    }
    return getSetRelayFeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.bridge.Tx.MsgAddBannedDenom,
      stafihub.bridge.Tx.MsgAddBannedDenomResponse> getAddBannedDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddBannedDenom",
      requestType = stafihub.bridge.Tx.MsgAddBannedDenom.class,
      responseType = stafihub.bridge.Tx.MsgAddBannedDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.bridge.Tx.MsgAddBannedDenom,
      stafihub.bridge.Tx.MsgAddBannedDenomResponse> getAddBannedDenomMethod() {
    io.grpc.MethodDescriptor<stafihub.bridge.Tx.MsgAddBannedDenom, stafihub.bridge.Tx.MsgAddBannedDenomResponse> getAddBannedDenomMethod;
    if ((getAddBannedDenomMethod = MsgGrpc.getAddBannedDenomMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddBannedDenomMethod = MsgGrpc.getAddBannedDenomMethod) == null) {
          MsgGrpc.getAddBannedDenomMethod = getAddBannedDenomMethod =
              io.grpc.MethodDescriptor.<stafihub.bridge.Tx.MsgAddBannedDenom, stafihub.bridge.Tx.MsgAddBannedDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddBannedDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.bridge.Tx.MsgAddBannedDenom.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.bridge.Tx.MsgAddBannedDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddBannedDenom"))
              .build();
        }
      }
    }
    return getAddBannedDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.bridge.Tx.MsgRmBannedDenom,
      stafihub.bridge.Tx.MsgRmBannedDenomResponse> getRmBannedDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RmBannedDenom",
      requestType = stafihub.bridge.Tx.MsgRmBannedDenom.class,
      responseType = stafihub.bridge.Tx.MsgRmBannedDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.bridge.Tx.MsgRmBannedDenom,
      stafihub.bridge.Tx.MsgRmBannedDenomResponse> getRmBannedDenomMethod() {
    io.grpc.MethodDescriptor<stafihub.bridge.Tx.MsgRmBannedDenom, stafihub.bridge.Tx.MsgRmBannedDenomResponse> getRmBannedDenomMethod;
    if ((getRmBannedDenomMethod = MsgGrpc.getRmBannedDenomMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRmBannedDenomMethod = MsgGrpc.getRmBannedDenomMethod) == null) {
          MsgGrpc.getRmBannedDenomMethod = getRmBannedDenomMethod =
              io.grpc.MethodDescriptor.<stafihub.bridge.Tx.MsgRmBannedDenom, stafihub.bridge.Tx.MsgRmBannedDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RmBannedDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.bridge.Tx.MsgRmBannedDenom.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.bridge.Tx.MsgRmBannedDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RmBannedDenom"))
              .build();
        }
      }
    }
    return getRmBannedDenomMethod;
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
    public void setResourceidToDenom(stafihub.bridge.Tx.MsgSetResourceidToDenom request,
        io.grpc.stub.StreamObserver<stafihub.bridge.Tx.MsgSetResourceidToDenomResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetResourceidToDenomMethod(), responseObserver);
    }

    /**
     */
    public void deposit(stafihub.bridge.Tx.MsgDeposit request,
        io.grpc.stub.StreamObserver<stafihub.bridge.Tx.MsgDepositResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDepositMethod(), responseObserver);
    }

    /**
     */
    public void addChainId(stafihub.bridge.Tx.MsgAddChainId request,
        io.grpc.stub.StreamObserver<stafihub.bridge.Tx.MsgAddChainIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddChainIdMethod(), responseObserver);
    }

    /**
     */
    public void voteProposal(stafihub.bridge.Tx.MsgVoteProposal request,
        io.grpc.stub.StreamObserver<stafihub.bridge.Tx.MsgVoteProposalResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getVoteProposalMethod(), responseObserver);
    }

    /**
     */
    public void rmChainId(stafihub.bridge.Tx.MsgRmChainId request,
        io.grpc.stub.StreamObserver<stafihub.bridge.Tx.MsgRmChainIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRmChainIdMethod(), responseObserver);
    }

    /**
     */
    public void setRelayFeeReceiver(stafihub.bridge.Tx.MsgSetRelayFeeReceiver request,
        io.grpc.stub.StreamObserver<stafihub.bridge.Tx.MsgSetRelayFeeReceiverResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetRelayFeeReceiverMethod(), responseObserver);
    }

    /**
     */
    public void setRelayFee(stafihub.bridge.Tx.MsgSetRelayFee request,
        io.grpc.stub.StreamObserver<stafihub.bridge.Tx.MsgSetRelayFeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetRelayFeeMethod(), responseObserver);
    }

    /**
     */
    public void addBannedDenom(stafihub.bridge.Tx.MsgAddBannedDenom request,
        io.grpc.stub.StreamObserver<stafihub.bridge.Tx.MsgAddBannedDenomResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddBannedDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void rmBannedDenom(stafihub.bridge.Tx.MsgRmBannedDenom request,
        io.grpc.stub.StreamObserver<stafihub.bridge.Tx.MsgRmBannedDenomResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRmBannedDenomMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSetResourceidToDenomMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.bridge.Tx.MsgSetResourceidToDenom,
                stafihub.bridge.Tx.MsgSetResourceidToDenomResponse>(
                  this, METHODID_SET_RESOURCEID_TO_DENOM)))
          .addMethod(
            getDepositMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.bridge.Tx.MsgDeposit,
                stafihub.bridge.Tx.MsgDepositResponse>(
                  this, METHODID_DEPOSIT)))
          .addMethod(
            getAddChainIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.bridge.Tx.MsgAddChainId,
                stafihub.bridge.Tx.MsgAddChainIdResponse>(
                  this, METHODID_ADD_CHAIN_ID)))
          .addMethod(
            getVoteProposalMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.bridge.Tx.MsgVoteProposal,
                stafihub.bridge.Tx.MsgVoteProposalResponse>(
                  this, METHODID_VOTE_PROPOSAL)))
          .addMethod(
            getRmChainIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.bridge.Tx.MsgRmChainId,
                stafihub.bridge.Tx.MsgRmChainIdResponse>(
                  this, METHODID_RM_CHAIN_ID)))
          .addMethod(
            getSetRelayFeeReceiverMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.bridge.Tx.MsgSetRelayFeeReceiver,
                stafihub.bridge.Tx.MsgSetRelayFeeReceiverResponse>(
                  this, METHODID_SET_RELAY_FEE_RECEIVER)))
          .addMethod(
            getSetRelayFeeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.bridge.Tx.MsgSetRelayFee,
                stafihub.bridge.Tx.MsgSetRelayFeeResponse>(
                  this, METHODID_SET_RELAY_FEE)))
          .addMethod(
            getAddBannedDenomMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.bridge.Tx.MsgAddBannedDenom,
                stafihub.bridge.Tx.MsgAddBannedDenomResponse>(
                  this, METHODID_ADD_BANNED_DENOM)))
          .addMethod(
            getRmBannedDenomMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.bridge.Tx.MsgRmBannedDenom,
                stafihub.bridge.Tx.MsgRmBannedDenomResponse>(
                  this, METHODID_RM_BANNED_DENOM)))
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
    public void setResourceidToDenom(stafihub.bridge.Tx.MsgSetResourceidToDenom request,
        io.grpc.stub.StreamObserver<stafihub.bridge.Tx.MsgSetResourceidToDenomResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetResourceidToDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deposit(stafihub.bridge.Tx.MsgDeposit request,
        io.grpc.stub.StreamObserver<stafihub.bridge.Tx.MsgDepositResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addChainId(stafihub.bridge.Tx.MsgAddChainId request,
        io.grpc.stub.StreamObserver<stafihub.bridge.Tx.MsgAddChainIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddChainIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void voteProposal(stafihub.bridge.Tx.MsgVoteProposal request,
        io.grpc.stub.StreamObserver<stafihub.bridge.Tx.MsgVoteProposalResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVoteProposalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rmChainId(stafihub.bridge.Tx.MsgRmChainId request,
        io.grpc.stub.StreamObserver<stafihub.bridge.Tx.MsgRmChainIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRmChainIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setRelayFeeReceiver(stafihub.bridge.Tx.MsgSetRelayFeeReceiver request,
        io.grpc.stub.StreamObserver<stafihub.bridge.Tx.MsgSetRelayFeeReceiverResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetRelayFeeReceiverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setRelayFee(stafihub.bridge.Tx.MsgSetRelayFee request,
        io.grpc.stub.StreamObserver<stafihub.bridge.Tx.MsgSetRelayFeeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetRelayFeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addBannedDenom(stafihub.bridge.Tx.MsgAddBannedDenom request,
        io.grpc.stub.StreamObserver<stafihub.bridge.Tx.MsgAddBannedDenomResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddBannedDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void rmBannedDenom(stafihub.bridge.Tx.MsgRmBannedDenom request,
        io.grpc.stub.StreamObserver<stafihub.bridge.Tx.MsgRmBannedDenomResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRmBannedDenomMethod(), getCallOptions()), request, responseObserver);
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
    public stafihub.bridge.Tx.MsgSetResourceidToDenomResponse setResourceidToDenom(stafihub.bridge.Tx.MsgSetResourceidToDenom request) {
      return blockingUnaryCall(
          getChannel(), getSetResourceidToDenomMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.bridge.Tx.MsgDepositResponse deposit(stafihub.bridge.Tx.MsgDeposit request) {
      return blockingUnaryCall(
          getChannel(), getDepositMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.bridge.Tx.MsgAddChainIdResponse addChainId(stafihub.bridge.Tx.MsgAddChainId request) {
      return blockingUnaryCall(
          getChannel(), getAddChainIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.bridge.Tx.MsgVoteProposalResponse voteProposal(stafihub.bridge.Tx.MsgVoteProposal request) {
      return blockingUnaryCall(
          getChannel(), getVoteProposalMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.bridge.Tx.MsgRmChainIdResponse rmChainId(stafihub.bridge.Tx.MsgRmChainId request) {
      return blockingUnaryCall(
          getChannel(), getRmChainIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.bridge.Tx.MsgSetRelayFeeReceiverResponse setRelayFeeReceiver(stafihub.bridge.Tx.MsgSetRelayFeeReceiver request) {
      return blockingUnaryCall(
          getChannel(), getSetRelayFeeReceiverMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.bridge.Tx.MsgSetRelayFeeResponse setRelayFee(stafihub.bridge.Tx.MsgSetRelayFee request) {
      return blockingUnaryCall(
          getChannel(), getSetRelayFeeMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.bridge.Tx.MsgAddBannedDenomResponse addBannedDenom(stafihub.bridge.Tx.MsgAddBannedDenom request) {
      return blockingUnaryCall(
          getChannel(), getAddBannedDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public stafihub.bridge.Tx.MsgRmBannedDenomResponse rmBannedDenom(stafihub.bridge.Tx.MsgRmBannedDenom request) {
      return blockingUnaryCall(
          getChannel(), getRmBannedDenomMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<stafihub.bridge.Tx.MsgSetResourceidToDenomResponse> setResourceidToDenom(
        stafihub.bridge.Tx.MsgSetResourceidToDenom request) {
      return futureUnaryCall(
          getChannel().newCall(getSetResourceidToDenomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.bridge.Tx.MsgDepositResponse> deposit(
        stafihub.bridge.Tx.MsgDeposit request) {
      return futureUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.bridge.Tx.MsgAddChainIdResponse> addChainId(
        stafihub.bridge.Tx.MsgAddChainId request) {
      return futureUnaryCall(
          getChannel().newCall(getAddChainIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.bridge.Tx.MsgVoteProposalResponse> voteProposal(
        stafihub.bridge.Tx.MsgVoteProposal request) {
      return futureUnaryCall(
          getChannel().newCall(getVoteProposalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.bridge.Tx.MsgRmChainIdResponse> rmChainId(
        stafihub.bridge.Tx.MsgRmChainId request) {
      return futureUnaryCall(
          getChannel().newCall(getRmChainIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.bridge.Tx.MsgSetRelayFeeReceiverResponse> setRelayFeeReceiver(
        stafihub.bridge.Tx.MsgSetRelayFeeReceiver request) {
      return futureUnaryCall(
          getChannel().newCall(getSetRelayFeeReceiverMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.bridge.Tx.MsgSetRelayFeeResponse> setRelayFee(
        stafihub.bridge.Tx.MsgSetRelayFee request) {
      return futureUnaryCall(
          getChannel().newCall(getSetRelayFeeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.bridge.Tx.MsgAddBannedDenomResponse> addBannedDenom(
        stafihub.bridge.Tx.MsgAddBannedDenom request) {
      return futureUnaryCall(
          getChannel().newCall(getAddBannedDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.bridge.Tx.MsgRmBannedDenomResponse> rmBannedDenom(
        stafihub.bridge.Tx.MsgRmBannedDenom request) {
      return futureUnaryCall(
          getChannel().newCall(getRmBannedDenomMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_RESOURCEID_TO_DENOM = 0;
  private static final int METHODID_DEPOSIT = 1;
  private static final int METHODID_ADD_CHAIN_ID = 2;
  private static final int METHODID_VOTE_PROPOSAL = 3;
  private static final int METHODID_RM_CHAIN_ID = 4;
  private static final int METHODID_SET_RELAY_FEE_RECEIVER = 5;
  private static final int METHODID_SET_RELAY_FEE = 6;
  private static final int METHODID_ADD_BANNED_DENOM = 7;
  private static final int METHODID_RM_BANNED_DENOM = 8;

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
        case METHODID_SET_RESOURCEID_TO_DENOM:
          serviceImpl.setResourceidToDenom((stafihub.bridge.Tx.MsgSetResourceidToDenom) request,
              (io.grpc.stub.StreamObserver<stafihub.bridge.Tx.MsgSetResourceidToDenomResponse>) responseObserver);
          break;
        case METHODID_DEPOSIT:
          serviceImpl.deposit((stafihub.bridge.Tx.MsgDeposit) request,
              (io.grpc.stub.StreamObserver<stafihub.bridge.Tx.MsgDepositResponse>) responseObserver);
          break;
        case METHODID_ADD_CHAIN_ID:
          serviceImpl.addChainId((stafihub.bridge.Tx.MsgAddChainId) request,
              (io.grpc.stub.StreamObserver<stafihub.bridge.Tx.MsgAddChainIdResponse>) responseObserver);
          break;
        case METHODID_VOTE_PROPOSAL:
          serviceImpl.voteProposal((stafihub.bridge.Tx.MsgVoteProposal) request,
              (io.grpc.stub.StreamObserver<stafihub.bridge.Tx.MsgVoteProposalResponse>) responseObserver);
          break;
        case METHODID_RM_CHAIN_ID:
          serviceImpl.rmChainId((stafihub.bridge.Tx.MsgRmChainId) request,
              (io.grpc.stub.StreamObserver<stafihub.bridge.Tx.MsgRmChainIdResponse>) responseObserver);
          break;
        case METHODID_SET_RELAY_FEE_RECEIVER:
          serviceImpl.setRelayFeeReceiver((stafihub.bridge.Tx.MsgSetRelayFeeReceiver) request,
              (io.grpc.stub.StreamObserver<stafihub.bridge.Tx.MsgSetRelayFeeReceiverResponse>) responseObserver);
          break;
        case METHODID_SET_RELAY_FEE:
          serviceImpl.setRelayFee((stafihub.bridge.Tx.MsgSetRelayFee) request,
              (io.grpc.stub.StreamObserver<stafihub.bridge.Tx.MsgSetRelayFeeResponse>) responseObserver);
          break;
        case METHODID_ADD_BANNED_DENOM:
          serviceImpl.addBannedDenom((stafihub.bridge.Tx.MsgAddBannedDenom) request,
              (io.grpc.stub.StreamObserver<stafihub.bridge.Tx.MsgAddBannedDenomResponse>) responseObserver);
          break;
        case METHODID_RM_BANNED_DENOM:
          serviceImpl.rmBannedDenom((stafihub.bridge.Tx.MsgRmBannedDenom) request,
              (io.grpc.stub.StreamObserver<stafihub.bridge.Tx.MsgRmBannedDenomResponse>) responseObserver);
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
      return stafihub.bridge.Tx.getDescriptor();
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
              .addMethod(getSetResourceidToDenomMethod())
              .addMethod(getDepositMethod())
              .addMethod(getAddChainIdMethod())
              .addMethod(getVoteProposalMethod())
              .addMethod(getRmChainIdMethod())
              .addMethod(getSetRelayFeeReceiverMethod())
              .addMethod(getSetRelayFeeMethod())
              .addMethod(getAddBannedDenomMethod())
              .addMethod(getRmBannedDenomMethod())
              .build();
        }
      }
    }
    return result;
  }
}
