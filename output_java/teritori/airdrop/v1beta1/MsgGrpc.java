package teritori.airdrop.v1beta1;

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
 * Msg defines the staking Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: teritori/airdrop/v1beta1/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "teritori.airdrop.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<teritori.airdrop.v1beta1.Tx.MsgClaimAllocation,
      teritori.airdrop.v1beta1.Tx.MsgClaimAllocationResponse> getClaimAllocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimAllocation",
      requestType = teritori.airdrop.v1beta1.Tx.MsgClaimAllocation.class,
      responseType = teritori.airdrop.v1beta1.Tx.MsgClaimAllocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<teritori.airdrop.v1beta1.Tx.MsgClaimAllocation,
      teritori.airdrop.v1beta1.Tx.MsgClaimAllocationResponse> getClaimAllocationMethod() {
    io.grpc.MethodDescriptor<teritori.airdrop.v1beta1.Tx.MsgClaimAllocation, teritori.airdrop.v1beta1.Tx.MsgClaimAllocationResponse> getClaimAllocationMethod;
    if ((getClaimAllocationMethod = MsgGrpc.getClaimAllocationMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClaimAllocationMethod = MsgGrpc.getClaimAllocationMethod) == null) {
          MsgGrpc.getClaimAllocationMethod = getClaimAllocationMethod =
              io.grpc.MethodDescriptor.<teritori.airdrop.v1beta1.Tx.MsgClaimAllocation, teritori.airdrop.v1beta1.Tx.MsgClaimAllocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimAllocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  teritori.airdrop.v1beta1.Tx.MsgClaimAllocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  teritori.airdrop.v1beta1.Tx.MsgClaimAllocationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ClaimAllocation"))
              .build();
        }
      }
    }
    return getClaimAllocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<teritori.airdrop.v1beta1.Tx.MsgSetAllocation,
      teritori.airdrop.v1beta1.Tx.MsgSetAllocationResponse> getSetAllocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAllocation",
      requestType = teritori.airdrop.v1beta1.Tx.MsgSetAllocation.class,
      responseType = teritori.airdrop.v1beta1.Tx.MsgSetAllocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<teritori.airdrop.v1beta1.Tx.MsgSetAllocation,
      teritori.airdrop.v1beta1.Tx.MsgSetAllocationResponse> getSetAllocationMethod() {
    io.grpc.MethodDescriptor<teritori.airdrop.v1beta1.Tx.MsgSetAllocation, teritori.airdrop.v1beta1.Tx.MsgSetAllocationResponse> getSetAllocationMethod;
    if ((getSetAllocationMethod = MsgGrpc.getSetAllocationMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetAllocationMethod = MsgGrpc.getSetAllocationMethod) == null) {
          MsgGrpc.getSetAllocationMethod = getSetAllocationMethod =
              io.grpc.MethodDescriptor.<teritori.airdrop.v1beta1.Tx.MsgSetAllocation, teritori.airdrop.v1beta1.Tx.MsgSetAllocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAllocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  teritori.airdrop.v1beta1.Tx.MsgSetAllocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  teritori.airdrop.v1beta1.Tx.MsgSetAllocationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetAllocation"))
              .build();
        }
      }
    }
    return getSetAllocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<teritori.airdrop.v1beta1.Tx.MsgTransferModuleOwnership,
      teritori.airdrop.v1beta1.Tx.MsgTransferModuleOwnershipResponse> getTransferModuleOwnershipMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferModuleOwnership",
      requestType = teritori.airdrop.v1beta1.Tx.MsgTransferModuleOwnership.class,
      responseType = teritori.airdrop.v1beta1.Tx.MsgTransferModuleOwnershipResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<teritori.airdrop.v1beta1.Tx.MsgTransferModuleOwnership,
      teritori.airdrop.v1beta1.Tx.MsgTransferModuleOwnershipResponse> getTransferModuleOwnershipMethod() {
    io.grpc.MethodDescriptor<teritori.airdrop.v1beta1.Tx.MsgTransferModuleOwnership, teritori.airdrop.v1beta1.Tx.MsgTransferModuleOwnershipResponse> getTransferModuleOwnershipMethod;
    if ((getTransferModuleOwnershipMethod = MsgGrpc.getTransferModuleOwnershipMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getTransferModuleOwnershipMethod = MsgGrpc.getTransferModuleOwnershipMethod) == null) {
          MsgGrpc.getTransferModuleOwnershipMethod = getTransferModuleOwnershipMethod =
              io.grpc.MethodDescriptor.<teritori.airdrop.v1beta1.Tx.MsgTransferModuleOwnership, teritori.airdrop.v1beta1.Tx.MsgTransferModuleOwnershipResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferModuleOwnership"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  teritori.airdrop.v1beta1.Tx.MsgTransferModuleOwnership.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  teritori.airdrop.v1beta1.Tx.MsgTransferModuleOwnershipResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("TransferModuleOwnership"))
              .build();
        }
      }
    }
    return getTransferModuleOwnershipMethod;
  }

  private static volatile io.grpc.MethodDescriptor<teritori.airdrop.v1beta1.Tx.MsgDepositTokens,
      teritori.airdrop.v1beta1.Tx.MsgDepositTokensResponse> getDepositTokensMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DepositTokens",
      requestType = teritori.airdrop.v1beta1.Tx.MsgDepositTokens.class,
      responseType = teritori.airdrop.v1beta1.Tx.MsgDepositTokensResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<teritori.airdrop.v1beta1.Tx.MsgDepositTokens,
      teritori.airdrop.v1beta1.Tx.MsgDepositTokensResponse> getDepositTokensMethod() {
    io.grpc.MethodDescriptor<teritori.airdrop.v1beta1.Tx.MsgDepositTokens, teritori.airdrop.v1beta1.Tx.MsgDepositTokensResponse> getDepositTokensMethod;
    if ((getDepositTokensMethod = MsgGrpc.getDepositTokensMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDepositTokensMethod = MsgGrpc.getDepositTokensMethod) == null) {
          MsgGrpc.getDepositTokensMethod = getDepositTokensMethod =
              io.grpc.MethodDescriptor.<teritori.airdrop.v1beta1.Tx.MsgDepositTokens, teritori.airdrop.v1beta1.Tx.MsgDepositTokensResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DepositTokens"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  teritori.airdrop.v1beta1.Tx.MsgDepositTokens.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  teritori.airdrop.v1beta1.Tx.MsgDepositTokensResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DepositTokens"))
              .build();
        }
      }
    }
    return getDepositTokensMethod;
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
   * Msg defines the staking Msg service.
   * </pre>
   */
  public static abstract class MsgImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * ClaimAllocation defines a method to claim allocation
     * </pre>
     */
    public void claimAllocation(teritori.airdrop.v1beta1.Tx.MsgClaimAllocation request,
        io.grpc.stub.StreamObserver<teritori.airdrop.v1beta1.Tx.MsgClaimAllocationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClaimAllocationMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetAllocation defines a method to set allocation
     * </pre>
     */
    public void setAllocation(teritori.airdrop.v1beta1.Tx.MsgSetAllocation request,
        io.grpc.stub.StreamObserver<teritori.airdrop.v1beta1.Tx.MsgSetAllocationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetAllocationMethod(), responseObserver);
    }

    /**
     * <pre>
     * TransferModuleOwnership defines a method to transfer module ownership to other address
     * </pre>
     */
    public void transferModuleOwnership(teritori.airdrop.v1beta1.Tx.MsgTransferModuleOwnership request,
        io.grpc.stub.StreamObserver<teritori.airdrop.v1beta1.Tx.MsgTransferModuleOwnershipResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTransferModuleOwnershipMethod(), responseObserver);
    }

    /**
     * <pre>
     * DepositTokens defines a method to deposit tokens to the module
     * </pre>
     */
    public void depositTokens(teritori.airdrop.v1beta1.Tx.MsgDepositTokens request,
        io.grpc.stub.StreamObserver<teritori.airdrop.v1beta1.Tx.MsgDepositTokensResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDepositTokensMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getClaimAllocationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                teritori.airdrop.v1beta1.Tx.MsgClaimAllocation,
                teritori.airdrop.v1beta1.Tx.MsgClaimAllocationResponse>(
                  this, METHODID_CLAIM_ALLOCATION)))
          .addMethod(
            getSetAllocationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                teritori.airdrop.v1beta1.Tx.MsgSetAllocation,
                teritori.airdrop.v1beta1.Tx.MsgSetAllocationResponse>(
                  this, METHODID_SET_ALLOCATION)))
          .addMethod(
            getTransferModuleOwnershipMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                teritori.airdrop.v1beta1.Tx.MsgTransferModuleOwnership,
                teritori.airdrop.v1beta1.Tx.MsgTransferModuleOwnershipResponse>(
                  this, METHODID_TRANSFER_MODULE_OWNERSHIP)))
          .addMethod(
            getDepositTokensMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                teritori.airdrop.v1beta1.Tx.MsgDepositTokens,
                teritori.airdrop.v1beta1.Tx.MsgDepositTokensResponse>(
                  this, METHODID_DEPOSIT_TOKENS)))
          .build();
    }
  }

  /**
   * <pre>
   * Msg defines the staking Msg service.
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
     * <pre>
     * ClaimAllocation defines a method to claim allocation
     * </pre>
     */
    public void claimAllocation(teritori.airdrop.v1beta1.Tx.MsgClaimAllocation request,
        io.grpc.stub.StreamObserver<teritori.airdrop.v1beta1.Tx.MsgClaimAllocationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClaimAllocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetAllocation defines a method to set allocation
     * </pre>
     */
    public void setAllocation(teritori.airdrop.v1beta1.Tx.MsgSetAllocation request,
        io.grpc.stub.StreamObserver<teritori.airdrop.v1beta1.Tx.MsgSetAllocationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetAllocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TransferModuleOwnership defines a method to transfer module ownership to other address
     * </pre>
     */
    public void transferModuleOwnership(teritori.airdrop.v1beta1.Tx.MsgTransferModuleOwnership request,
        io.grpc.stub.StreamObserver<teritori.airdrop.v1beta1.Tx.MsgTransferModuleOwnershipResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTransferModuleOwnershipMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DepositTokens defines a method to deposit tokens to the module
     * </pre>
     */
    public void depositTokens(teritori.airdrop.v1beta1.Tx.MsgDepositTokens request,
        io.grpc.stub.StreamObserver<teritori.airdrop.v1beta1.Tx.MsgDepositTokensResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDepositTokensMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Msg defines the staking Msg service.
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
     * <pre>
     * ClaimAllocation defines a method to claim allocation
     * </pre>
     */
    public teritori.airdrop.v1beta1.Tx.MsgClaimAllocationResponse claimAllocation(teritori.airdrop.v1beta1.Tx.MsgClaimAllocation request) {
      return blockingUnaryCall(
          getChannel(), getClaimAllocationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetAllocation defines a method to set allocation
     * </pre>
     */
    public teritori.airdrop.v1beta1.Tx.MsgSetAllocationResponse setAllocation(teritori.airdrop.v1beta1.Tx.MsgSetAllocation request) {
      return blockingUnaryCall(
          getChannel(), getSetAllocationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TransferModuleOwnership defines a method to transfer module ownership to other address
     * </pre>
     */
    public teritori.airdrop.v1beta1.Tx.MsgTransferModuleOwnershipResponse transferModuleOwnership(teritori.airdrop.v1beta1.Tx.MsgTransferModuleOwnership request) {
      return blockingUnaryCall(
          getChannel(), getTransferModuleOwnershipMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DepositTokens defines a method to deposit tokens to the module
     * </pre>
     */
    public teritori.airdrop.v1beta1.Tx.MsgDepositTokensResponse depositTokens(teritori.airdrop.v1beta1.Tx.MsgDepositTokens request) {
      return blockingUnaryCall(
          getChannel(), getDepositTokensMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Msg defines the staking Msg service.
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
     * <pre>
     * ClaimAllocation defines a method to claim allocation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<teritori.airdrop.v1beta1.Tx.MsgClaimAllocationResponse> claimAllocation(
        teritori.airdrop.v1beta1.Tx.MsgClaimAllocation request) {
      return futureUnaryCall(
          getChannel().newCall(getClaimAllocationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetAllocation defines a method to set allocation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<teritori.airdrop.v1beta1.Tx.MsgSetAllocationResponse> setAllocation(
        teritori.airdrop.v1beta1.Tx.MsgSetAllocation request) {
      return futureUnaryCall(
          getChannel().newCall(getSetAllocationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TransferModuleOwnership defines a method to transfer module ownership to other address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<teritori.airdrop.v1beta1.Tx.MsgTransferModuleOwnershipResponse> transferModuleOwnership(
        teritori.airdrop.v1beta1.Tx.MsgTransferModuleOwnership request) {
      return futureUnaryCall(
          getChannel().newCall(getTransferModuleOwnershipMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DepositTokens defines a method to deposit tokens to the module
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<teritori.airdrop.v1beta1.Tx.MsgDepositTokensResponse> depositTokens(
        teritori.airdrop.v1beta1.Tx.MsgDepositTokens request) {
      return futureUnaryCall(
          getChannel().newCall(getDepositTokensMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CLAIM_ALLOCATION = 0;
  private static final int METHODID_SET_ALLOCATION = 1;
  private static final int METHODID_TRANSFER_MODULE_OWNERSHIP = 2;
  private static final int METHODID_DEPOSIT_TOKENS = 3;

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
        case METHODID_CLAIM_ALLOCATION:
          serviceImpl.claimAllocation((teritori.airdrop.v1beta1.Tx.MsgClaimAllocation) request,
              (io.grpc.stub.StreamObserver<teritori.airdrop.v1beta1.Tx.MsgClaimAllocationResponse>) responseObserver);
          break;
        case METHODID_SET_ALLOCATION:
          serviceImpl.setAllocation((teritori.airdrop.v1beta1.Tx.MsgSetAllocation) request,
              (io.grpc.stub.StreamObserver<teritori.airdrop.v1beta1.Tx.MsgSetAllocationResponse>) responseObserver);
          break;
        case METHODID_TRANSFER_MODULE_OWNERSHIP:
          serviceImpl.transferModuleOwnership((teritori.airdrop.v1beta1.Tx.MsgTransferModuleOwnership) request,
              (io.grpc.stub.StreamObserver<teritori.airdrop.v1beta1.Tx.MsgTransferModuleOwnershipResponse>) responseObserver);
          break;
        case METHODID_DEPOSIT_TOKENS:
          serviceImpl.depositTokens((teritori.airdrop.v1beta1.Tx.MsgDepositTokens) request,
              (io.grpc.stub.StreamObserver<teritori.airdrop.v1beta1.Tx.MsgDepositTokensResponse>) responseObserver);
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
      return teritori.airdrop.v1beta1.Tx.getDescriptor();
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
              .addMethod(getClaimAllocationMethod())
              .addMethod(getSetAllocationMethod())
              .addMethod(getTransferModuleOwnershipMethod())
              .addMethod(getDepositTokensMethod())
              .build();
        }
      }
    }
    return result;
  }
}
