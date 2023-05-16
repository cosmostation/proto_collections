package stafihub.stafihub.rvote;

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
    comments = "Source: stafihub/rvote/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "stafihub.stafihub.rvote.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rvote.Tx.MsgSetProposalLife,
      stafihub.stafihub.rvote.Tx.MsgSetProposalLifeResponse> getSetProposalLifeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetProposalLife",
      requestType = stafihub.stafihub.rvote.Tx.MsgSetProposalLife.class,
      responseType = stafihub.stafihub.rvote.Tx.MsgSetProposalLifeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rvote.Tx.MsgSetProposalLife,
      stafihub.stafihub.rvote.Tx.MsgSetProposalLifeResponse> getSetProposalLifeMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rvote.Tx.MsgSetProposalLife, stafihub.stafihub.rvote.Tx.MsgSetProposalLifeResponse> getSetProposalLifeMethod;
    if ((getSetProposalLifeMethod = MsgGrpc.getSetProposalLifeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetProposalLifeMethod = MsgGrpc.getSetProposalLifeMethod) == null) {
          MsgGrpc.getSetProposalLifeMethod = getSetProposalLifeMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rvote.Tx.MsgSetProposalLife, stafihub.stafihub.rvote.Tx.MsgSetProposalLifeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetProposalLife"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rvote.Tx.MsgSetProposalLife.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rvote.Tx.MsgSetProposalLifeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetProposalLife"))
              .build();
        }
      }
    }
    return getSetProposalLifeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rvote.Tx.MsgSubmitProposal,
      stafihub.stafihub.rvote.Tx.MsgSubmitProposalResponse> getSubmitProposalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitProposal",
      requestType = stafihub.stafihub.rvote.Tx.MsgSubmitProposal.class,
      responseType = stafihub.stafihub.rvote.Tx.MsgSubmitProposalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rvote.Tx.MsgSubmitProposal,
      stafihub.stafihub.rvote.Tx.MsgSubmitProposalResponse> getSubmitProposalMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rvote.Tx.MsgSubmitProposal, stafihub.stafihub.rvote.Tx.MsgSubmitProposalResponse> getSubmitProposalMethod;
    if ((getSubmitProposalMethod = MsgGrpc.getSubmitProposalMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSubmitProposalMethod = MsgGrpc.getSubmitProposalMethod) == null) {
          MsgGrpc.getSubmitProposalMethod = getSubmitProposalMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rvote.Tx.MsgSubmitProposal, stafihub.stafihub.rvote.Tx.MsgSubmitProposalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitProposal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rvote.Tx.MsgSubmitProposal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rvote.Tx.MsgSubmitProposalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SubmitProposal"))
              .build();
        }
      }
    }
    return getSubmitProposalMethod;
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
    public void setProposalLife(stafihub.stafihub.rvote.Tx.MsgSetProposalLife request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rvote.Tx.MsgSetProposalLifeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetProposalLifeMethod(), responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void submitProposal(stafihub.stafihub.rvote.Tx.MsgSubmitProposal request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rvote.Tx.MsgSubmitProposalResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSubmitProposalMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSetProposalLifeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rvote.Tx.MsgSetProposalLife,
                stafihub.stafihub.rvote.Tx.MsgSetProposalLifeResponse>(
                  this, METHODID_SET_PROPOSAL_LIFE)))
          .addMethod(
            getSubmitProposalMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rvote.Tx.MsgSubmitProposal,
                stafihub.stafihub.rvote.Tx.MsgSubmitProposalResponse>(
                  this, METHODID_SUBMIT_PROPOSAL)))
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
    public void setProposalLife(stafihub.stafihub.rvote.Tx.MsgSetProposalLife request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rvote.Tx.MsgSetProposalLifeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetProposalLifeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void submitProposal(stafihub.stafihub.rvote.Tx.MsgSubmitProposal request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rvote.Tx.MsgSubmitProposalResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubmitProposalMethod(), getCallOptions()), request, responseObserver);
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
    public stafihub.stafihub.rvote.Tx.MsgSetProposalLifeResponse setProposalLife(stafihub.stafihub.rvote.Tx.MsgSetProposalLife request) {
      return blockingUnaryCall(
          getChannel(), getSetProposalLifeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public stafihub.stafihub.rvote.Tx.MsgSubmitProposalResponse submitProposal(stafihub.stafihub.rvote.Tx.MsgSubmitProposal request) {
      return blockingUnaryCall(
          getChannel(), getSubmitProposalMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rvote.Tx.MsgSetProposalLifeResponse> setProposalLife(
        stafihub.stafihub.rvote.Tx.MsgSetProposalLife request) {
      return futureUnaryCall(
          getChannel().newCall(getSetProposalLifeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rvote.Tx.MsgSubmitProposalResponse> submitProposal(
        stafihub.stafihub.rvote.Tx.MsgSubmitProposal request) {
      return futureUnaryCall(
          getChannel().newCall(getSubmitProposalMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_PROPOSAL_LIFE = 0;
  private static final int METHODID_SUBMIT_PROPOSAL = 1;

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
        case METHODID_SET_PROPOSAL_LIFE:
          serviceImpl.setProposalLife((stafihub.stafihub.rvote.Tx.MsgSetProposalLife) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rvote.Tx.MsgSetProposalLifeResponse>) responseObserver);
          break;
        case METHODID_SUBMIT_PROPOSAL:
          serviceImpl.submitProposal((stafihub.stafihub.rvote.Tx.MsgSubmitProposal) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rvote.Tx.MsgSubmitProposalResponse>) responseObserver);
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
      return stafihub.stafihub.rvote.Tx.getDescriptor();
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
              .addMethod(getSetProposalLifeMethod())
              .addMethod(getSubmitProposalMethod())
              .build();
        }
      }
    }
    return result;
  }
}
