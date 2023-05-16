package kyve.bundles.v1beta1;

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
    comments = "Source: kyve/bundles/v1beta1/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "kyve.bundles.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<kyve.bundles.v1beta1.Tx.MsgSubmitBundleProposal,
      kyve.bundles.v1beta1.Tx.MsgSubmitBundleProposalResponse> getSubmitBundleProposalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitBundleProposal",
      requestType = kyve.bundles.v1beta1.Tx.MsgSubmitBundleProposal.class,
      responseType = kyve.bundles.v1beta1.Tx.MsgSubmitBundleProposalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.bundles.v1beta1.Tx.MsgSubmitBundleProposal,
      kyve.bundles.v1beta1.Tx.MsgSubmitBundleProposalResponse> getSubmitBundleProposalMethod() {
    io.grpc.MethodDescriptor<kyve.bundles.v1beta1.Tx.MsgSubmitBundleProposal, kyve.bundles.v1beta1.Tx.MsgSubmitBundleProposalResponse> getSubmitBundleProposalMethod;
    if ((getSubmitBundleProposalMethod = MsgGrpc.getSubmitBundleProposalMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSubmitBundleProposalMethod = MsgGrpc.getSubmitBundleProposalMethod) == null) {
          MsgGrpc.getSubmitBundleProposalMethod = getSubmitBundleProposalMethod =
              io.grpc.MethodDescriptor.<kyve.bundles.v1beta1.Tx.MsgSubmitBundleProposal, kyve.bundles.v1beta1.Tx.MsgSubmitBundleProposalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitBundleProposal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.bundles.v1beta1.Tx.MsgSubmitBundleProposal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.bundles.v1beta1.Tx.MsgSubmitBundleProposalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SubmitBundleProposal"))
              .build();
        }
      }
    }
    return getSubmitBundleProposalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.bundles.v1beta1.Tx.MsgVoteBundleProposal,
      kyve.bundles.v1beta1.Tx.MsgVoteBundleProposalResponse> getVoteBundleProposalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VoteBundleProposal",
      requestType = kyve.bundles.v1beta1.Tx.MsgVoteBundleProposal.class,
      responseType = kyve.bundles.v1beta1.Tx.MsgVoteBundleProposalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.bundles.v1beta1.Tx.MsgVoteBundleProposal,
      kyve.bundles.v1beta1.Tx.MsgVoteBundleProposalResponse> getVoteBundleProposalMethod() {
    io.grpc.MethodDescriptor<kyve.bundles.v1beta1.Tx.MsgVoteBundleProposal, kyve.bundles.v1beta1.Tx.MsgVoteBundleProposalResponse> getVoteBundleProposalMethod;
    if ((getVoteBundleProposalMethod = MsgGrpc.getVoteBundleProposalMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getVoteBundleProposalMethod = MsgGrpc.getVoteBundleProposalMethod) == null) {
          MsgGrpc.getVoteBundleProposalMethod = getVoteBundleProposalMethod =
              io.grpc.MethodDescriptor.<kyve.bundles.v1beta1.Tx.MsgVoteBundleProposal, kyve.bundles.v1beta1.Tx.MsgVoteBundleProposalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VoteBundleProposal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.bundles.v1beta1.Tx.MsgVoteBundleProposal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.bundles.v1beta1.Tx.MsgVoteBundleProposalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("VoteBundleProposal"))
              .build();
        }
      }
    }
    return getVoteBundleProposalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.bundles.v1beta1.Tx.MsgClaimUploaderRole,
      kyve.bundles.v1beta1.Tx.MsgClaimUploaderRoleResponse> getClaimUploaderRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimUploaderRole",
      requestType = kyve.bundles.v1beta1.Tx.MsgClaimUploaderRole.class,
      responseType = kyve.bundles.v1beta1.Tx.MsgClaimUploaderRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.bundles.v1beta1.Tx.MsgClaimUploaderRole,
      kyve.bundles.v1beta1.Tx.MsgClaimUploaderRoleResponse> getClaimUploaderRoleMethod() {
    io.grpc.MethodDescriptor<kyve.bundles.v1beta1.Tx.MsgClaimUploaderRole, kyve.bundles.v1beta1.Tx.MsgClaimUploaderRoleResponse> getClaimUploaderRoleMethod;
    if ((getClaimUploaderRoleMethod = MsgGrpc.getClaimUploaderRoleMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClaimUploaderRoleMethod = MsgGrpc.getClaimUploaderRoleMethod) == null) {
          MsgGrpc.getClaimUploaderRoleMethod = getClaimUploaderRoleMethod =
              io.grpc.MethodDescriptor.<kyve.bundles.v1beta1.Tx.MsgClaimUploaderRole, kyve.bundles.v1beta1.Tx.MsgClaimUploaderRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimUploaderRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.bundles.v1beta1.Tx.MsgClaimUploaderRole.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.bundles.v1beta1.Tx.MsgClaimUploaderRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ClaimUploaderRole"))
              .build();
        }
      }
    }
    return getClaimUploaderRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.bundles.v1beta1.Tx.MsgSkipUploaderRole,
      kyve.bundles.v1beta1.Tx.MsgSkipUploaderRoleResponse> getSkipUploaderRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SkipUploaderRole",
      requestType = kyve.bundles.v1beta1.Tx.MsgSkipUploaderRole.class,
      responseType = kyve.bundles.v1beta1.Tx.MsgSkipUploaderRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.bundles.v1beta1.Tx.MsgSkipUploaderRole,
      kyve.bundles.v1beta1.Tx.MsgSkipUploaderRoleResponse> getSkipUploaderRoleMethod() {
    io.grpc.MethodDescriptor<kyve.bundles.v1beta1.Tx.MsgSkipUploaderRole, kyve.bundles.v1beta1.Tx.MsgSkipUploaderRoleResponse> getSkipUploaderRoleMethod;
    if ((getSkipUploaderRoleMethod = MsgGrpc.getSkipUploaderRoleMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSkipUploaderRoleMethod = MsgGrpc.getSkipUploaderRoleMethod) == null) {
          MsgGrpc.getSkipUploaderRoleMethod = getSkipUploaderRoleMethod =
              io.grpc.MethodDescriptor.<kyve.bundles.v1beta1.Tx.MsgSkipUploaderRole, kyve.bundles.v1beta1.Tx.MsgSkipUploaderRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SkipUploaderRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.bundles.v1beta1.Tx.MsgSkipUploaderRole.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.bundles.v1beta1.Tx.MsgSkipUploaderRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SkipUploaderRole"))
              .build();
        }
      }
    }
    return getSkipUploaderRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.bundles.v1beta1.Tx.MsgUpdateParams,
      kyve.bundles.v1beta1.Tx.MsgUpdateParamsResponse> getUpdateParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParams",
      requestType = kyve.bundles.v1beta1.Tx.MsgUpdateParams.class,
      responseType = kyve.bundles.v1beta1.Tx.MsgUpdateParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.bundles.v1beta1.Tx.MsgUpdateParams,
      kyve.bundles.v1beta1.Tx.MsgUpdateParamsResponse> getUpdateParamsMethod() {
    io.grpc.MethodDescriptor<kyve.bundles.v1beta1.Tx.MsgUpdateParams, kyve.bundles.v1beta1.Tx.MsgUpdateParamsResponse> getUpdateParamsMethod;
    if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
          MsgGrpc.getUpdateParamsMethod = getUpdateParamsMethod =
              io.grpc.MethodDescriptor.<kyve.bundles.v1beta1.Tx.MsgUpdateParams, kyve.bundles.v1beta1.Tx.MsgUpdateParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.bundles.v1beta1.Tx.MsgUpdateParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.bundles.v1beta1.Tx.MsgUpdateParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateParams"))
              .build();
        }
      }
    }
    return getUpdateParamsMethod;
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
     * <pre>
     * SubmitBundleProposal ...
     * </pre>
     */
    public void submitBundleProposal(kyve.bundles.v1beta1.Tx.MsgSubmitBundleProposal request,
        io.grpc.stub.StreamObserver<kyve.bundles.v1beta1.Tx.MsgSubmitBundleProposalResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSubmitBundleProposalMethod(), responseObserver);
    }

    /**
     * <pre>
     * VoteBundleProposal ...
     * </pre>
     */
    public void voteBundleProposal(kyve.bundles.v1beta1.Tx.MsgVoteBundleProposal request,
        io.grpc.stub.StreamObserver<kyve.bundles.v1beta1.Tx.MsgVoteBundleProposalResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getVoteBundleProposalMethod(), responseObserver);
    }

    /**
     * <pre>
     * ClaimUploaderRole ...
     * </pre>
     */
    public void claimUploaderRole(kyve.bundles.v1beta1.Tx.MsgClaimUploaderRole request,
        io.grpc.stub.StreamObserver<kyve.bundles.v1beta1.Tx.MsgClaimUploaderRoleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClaimUploaderRoleMethod(), responseObserver);
    }

    /**
     * <pre>
     * SkipUploaderRole ...
     * </pre>
     */
    public void skipUploaderRole(kyve.bundles.v1beta1.Tx.MsgSkipUploaderRole request,
        io.grpc.stub.StreamObserver<kyve.bundles.v1beta1.Tx.MsgSkipUploaderRoleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSkipUploaderRoleMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/bundles module
     * parameters. The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public void updateParams(kyve.bundles.v1beta1.Tx.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<kyve.bundles.v1beta1.Tx.MsgUpdateParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateParamsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSubmitBundleProposalMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.bundles.v1beta1.Tx.MsgSubmitBundleProposal,
                kyve.bundles.v1beta1.Tx.MsgSubmitBundleProposalResponse>(
                  this, METHODID_SUBMIT_BUNDLE_PROPOSAL)))
          .addMethod(
            getVoteBundleProposalMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.bundles.v1beta1.Tx.MsgVoteBundleProposal,
                kyve.bundles.v1beta1.Tx.MsgVoteBundleProposalResponse>(
                  this, METHODID_VOTE_BUNDLE_PROPOSAL)))
          .addMethod(
            getClaimUploaderRoleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.bundles.v1beta1.Tx.MsgClaimUploaderRole,
                kyve.bundles.v1beta1.Tx.MsgClaimUploaderRoleResponse>(
                  this, METHODID_CLAIM_UPLOADER_ROLE)))
          .addMethod(
            getSkipUploaderRoleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.bundles.v1beta1.Tx.MsgSkipUploaderRole,
                kyve.bundles.v1beta1.Tx.MsgSkipUploaderRoleResponse>(
                  this, METHODID_SKIP_UPLOADER_ROLE)))
          .addMethod(
            getUpdateParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.bundles.v1beta1.Tx.MsgUpdateParams,
                kyve.bundles.v1beta1.Tx.MsgUpdateParamsResponse>(
                  this, METHODID_UPDATE_PARAMS)))
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
     * <pre>
     * SubmitBundleProposal ...
     * </pre>
     */
    public void submitBundleProposal(kyve.bundles.v1beta1.Tx.MsgSubmitBundleProposal request,
        io.grpc.stub.StreamObserver<kyve.bundles.v1beta1.Tx.MsgSubmitBundleProposalResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubmitBundleProposalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * VoteBundleProposal ...
     * </pre>
     */
    public void voteBundleProposal(kyve.bundles.v1beta1.Tx.MsgVoteBundleProposal request,
        io.grpc.stub.StreamObserver<kyve.bundles.v1beta1.Tx.MsgVoteBundleProposalResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVoteBundleProposalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ClaimUploaderRole ...
     * </pre>
     */
    public void claimUploaderRole(kyve.bundles.v1beta1.Tx.MsgClaimUploaderRole request,
        io.grpc.stub.StreamObserver<kyve.bundles.v1beta1.Tx.MsgClaimUploaderRoleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClaimUploaderRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SkipUploaderRole ...
     * </pre>
     */
    public void skipUploaderRole(kyve.bundles.v1beta1.Tx.MsgSkipUploaderRole request,
        io.grpc.stub.StreamObserver<kyve.bundles.v1beta1.Tx.MsgSkipUploaderRoleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSkipUploaderRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/bundles module
     * parameters. The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public void updateParams(kyve.bundles.v1beta1.Tx.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<kyve.bundles.v1beta1.Tx.MsgUpdateParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request, responseObserver);
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
     * <pre>
     * SubmitBundleProposal ...
     * </pre>
     */
    public kyve.bundles.v1beta1.Tx.MsgSubmitBundleProposalResponse submitBundleProposal(kyve.bundles.v1beta1.Tx.MsgSubmitBundleProposal request) {
      return blockingUnaryCall(
          getChannel(), getSubmitBundleProposalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * VoteBundleProposal ...
     * </pre>
     */
    public kyve.bundles.v1beta1.Tx.MsgVoteBundleProposalResponse voteBundleProposal(kyve.bundles.v1beta1.Tx.MsgVoteBundleProposal request) {
      return blockingUnaryCall(
          getChannel(), getVoteBundleProposalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ClaimUploaderRole ...
     * </pre>
     */
    public kyve.bundles.v1beta1.Tx.MsgClaimUploaderRoleResponse claimUploaderRole(kyve.bundles.v1beta1.Tx.MsgClaimUploaderRole request) {
      return blockingUnaryCall(
          getChannel(), getClaimUploaderRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SkipUploaderRole ...
     * </pre>
     */
    public kyve.bundles.v1beta1.Tx.MsgSkipUploaderRoleResponse skipUploaderRole(kyve.bundles.v1beta1.Tx.MsgSkipUploaderRole request) {
      return blockingUnaryCall(
          getChannel(), getSkipUploaderRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/bundles module
     * parameters. The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public kyve.bundles.v1beta1.Tx.MsgUpdateParamsResponse updateParams(kyve.bundles.v1beta1.Tx.MsgUpdateParams request) {
      return blockingUnaryCall(
          getChannel(), getUpdateParamsMethod(), getCallOptions(), request);
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
     * <pre>
     * SubmitBundleProposal ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.bundles.v1beta1.Tx.MsgSubmitBundleProposalResponse> submitBundleProposal(
        kyve.bundles.v1beta1.Tx.MsgSubmitBundleProposal request) {
      return futureUnaryCall(
          getChannel().newCall(getSubmitBundleProposalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * VoteBundleProposal ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.bundles.v1beta1.Tx.MsgVoteBundleProposalResponse> voteBundleProposal(
        kyve.bundles.v1beta1.Tx.MsgVoteBundleProposal request) {
      return futureUnaryCall(
          getChannel().newCall(getVoteBundleProposalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ClaimUploaderRole ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.bundles.v1beta1.Tx.MsgClaimUploaderRoleResponse> claimUploaderRole(
        kyve.bundles.v1beta1.Tx.MsgClaimUploaderRole request) {
      return futureUnaryCall(
          getChannel().newCall(getClaimUploaderRoleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SkipUploaderRole ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.bundles.v1beta1.Tx.MsgSkipUploaderRoleResponse> skipUploaderRole(
        kyve.bundles.v1beta1.Tx.MsgSkipUploaderRole request) {
      return futureUnaryCall(
          getChannel().newCall(getSkipUploaderRoleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/bundles module
     * parameters. The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.bundles.v1beta1.Tx.MsgUpdateParamsResponse> updateParams(
        kyve.bundles.v1beta1.Tx.MsgUpdateParams request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBMIT_BUNDLE_PROPOSAL = 0;
  private static final int METHODID_VOTE_BUNDLE_PROPOSAL = 1;
  private static final int METHODID_CLAIM_UPLOADER_ROLE = 2;
  private static final int METHODID_SKIP_UPLOADER_ROLE = 3;
  private static final int METHODID_UPDATE_PARAMS = 4;

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
        case METHODID_SUBMIT_BUNDLE_PROPOSAL:
          serviceImpl.submitBundleProposal((kyve.bundles.v1beta1.Tx.MsgSubmitBundleProposal) request,
              (io.grpc.stub.StreamObserver<kyve.bundles.v1beta1.Tx.MsgSubmitBundleProposalResponse>) responseObserver);
          break;
        case METHODID_VOTE_BUNDLE_PROPOSAL:
          serviceImpl.voteBundleProposal((kyve.bundles.v1beta1.Tx.MsgVoteBundleProposal) request,
              (io.grpc.stub.StreamObserver<kyve.bundles.v1beta1.Tx.MsgVoteBundleProposalResponse>) responseObserver);
          break;
        case METHODID_CLAIM_UPLOADER_ROLE:
          serviceImpl.claimUploaderRole((kyve.bundles.v1beta1.Tx.MsgClaimUploaderRole) request,
              (io.grpc.stub.StreamObserver<kyve.bundles.v1beta1.Tx.MsgClaimUploaderRoleResponse>) responseObserver);
          break;
        case METHODID_SKIP_UPLOADER_ROLE:
          serviceImpl.skipUploaderRole((kyve.bundles.v1beta1.Tx.MsgSkipUploaderRole) request,
              (io.grpc.stub.StreamObserver<kyve.bundles.v1beta1.Tx.MsgSkipUploaderRoleResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PARAMS:
          serviceImpl.updateParams((kyve.bundles.v1beta1.Tx.MsgUpdateParams) request,
              (io.grpc.stub.StreamObserver<kyve.bundles.v1beta1.Tx.MsgUpdateParamsResponse>) responseObserver);
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
      return kyve.bundles.v1beta1.Tx.getDescriptor();
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
              .addMethod(getSubmitBundleProposalMethod())
              .addMethod(getVoteBundleProposalMethod())
              .addMethod(getClaimUploaderRoleMethod())
              .addMethod(getSkipUploaderRoleMethod())
              .addMethod(getUpdateParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
