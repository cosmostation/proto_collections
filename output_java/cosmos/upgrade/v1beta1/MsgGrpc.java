package cosmos.upgrade.v1beta1;

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
 * Msg defines the upgrade Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: cosmos/upgrade/v1beta1/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "cosmos.upgrade.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cosmos.upgrade.v1beta1.Tx.MsgSoftwareUpgrade,
      cosmos.upgrade.v1beta1.Tx.MsgSoftwareUpgradeResponse> getSoftwareUpgradeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SoftwareUpgrade",
      requestType = cosmos.upgrade.v1beta1.Tx.MsgSoftwareUpgrade.class,
      responseType = cosmos.upgrade.v1beta1.Tx.MsgSoftwareUpgradeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.upgrade.v1beta1.Tx.MsgSoftwareUpgrade,
      cosmos.upgrade.v1beta1.Tx.MsgSoftwareUpgradeResponse> getSoftwareUpgradeMethod() {
    io.grpc.MethodDescriptor<cosmos.upgrade.v1beta1.Tx.MsgSoftwareUpgrade, cosmos.upgrade.v1beta1.Tx.MsgSoftwareUpgradeResponse> getSoftwareUpgradeMethod;
    if ((getSoftwareUpgradeMethod = MsgGrpc.getSoftwareUpgradeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSoftwareUpgradeMethod = MsgGrpc.getSoftwareUpgradeMethod) == null) {
          MsgGrpc.getSoftwareUpgradeMethod = getSoftwareUpgradeMethod =
              io.grpc.MethodDescriptor.<cosmos.upgrade.v1beta1.Tx.MsgSoftwareUpgrade, cosmos.upgrade.v1beta1.Tx.MsgSoftwareUpgradeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SoftwareUpgrade"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.upgrade.v1beta1.Tx.MsgSoftwareUpgrade.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.upgrade.v1beta1.Tx.MsgSoftwareUpgradeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SoftwareUpgrade"))
              .build();
        }
      }
    }
    return getSoftwareUpgradeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.upgrade.v1beta1.Tx.MsgCancelUpgrade,
      cosmos.upgrade.v1beta1.Tx.MsgCancelUpgradeResponse> getCancelUpgradeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelUpgrade",
      requestType = cosmos.upgrade.v1beta1.Tx.MsgCancelUpgrade.class,
      responseType = cosmos.upgrade.v1beta1.Tx.MsgCancelUpgradeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.upgrade.v1beta1.Tx.MsgCancelUpgrade,
      cosmos.upgrade.v1beta1.Tx.MsgCancelUpgradeResponse> getCancelUpgradeMethod() {
    io.grpc.MethodDescriptor<cosmos.upgrade.v1beta1.Tx.MsgCancelUpgrade, cosmos.upgrade.v1beta1.Tx.MsgCancelUpgradeResponse> getCancelUpgradeMethod;
    if ((getCancelUpgradeMethod = MsgGrpc.getCancelUpgradeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCancelUpgradeMethod = MsgGrpc.getCancelUpgradeMethod) == null) {
          MsgGrpc.getCancelUpgradeMethod = getCancelUpgradeMethod =
              io.grpc.MethodDescriptor.<cosmos.upgrade.v1beta1.Tx.MsgCancelUpgrade, cosmos.upgrade.v1beta1.Tx.MsgCancelUpgradeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelUpgrade"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.upgrade.v1beta1.Tx.MsgCancelUpgrade.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.upgrade.v1beta1.Tx.MsgCancelUpgradeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CancelUpgrade"))
              .build();
        }
      }
    }
    return getCancelUpgradeMethod;
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
   * Msg defines the upgrade Msg service.
   * </pre>
   */
  public static abstract class MsgImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * SoftwareUpgrade is a governance operation for initiating a software upgrade.
     * Since: cosmos-sdk 0.46
     * </pre>
     */
    public void softwareUpgrade(cosmos.upgrade.v1beta1.Tx.MsgSoftwareUpgrade request,
        io.grpc.stub.StreamObserver<cosmos.upgrade.v1beta1.Tx.MsgSoftwareUpgradeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSoftwareUpgradeMethod(), responseObserver);
    }

    /**
     * <pre>
     * CancelUpgrade is a governance operation for cancelling a previously
     * approved software upgrade.
     * Since: cosmos-sdk 0.46
     * </pre>
     */
    public void cancelUpgrade(cosmos.upgrade.v1beta1.Tx.MsgCancelUpgrade request,
        io.grpc.stub.StreamObserver<cosmos.upgrade.v1beta1.Tx.MsgCancelUpgradeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCancelUpgradeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSoftwareUpgradeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.upgrade.v1beta1.Tx.MsgSoftwareUpgrade,
                cosmos.upgrade.v1beta1.Tx.MsgSoftwareUpgradeResponse>(
                  this, METHODID_SOFTWARE_UPGRADE)))
          .addMethod(
            getCancelUpgradeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.upgrade.v1beta1.Tx.MsgCancelUpgrade,
                cosmos.upgrade.v1beta1.Tx.MsgCancelUpgradeResponse>(
                  this, METHODID_CANCEL_UPGRADE)))
          .build();
    }
  }

  /**
   * <pre>
   * Msg defines the upgrade Msg service.
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
     * SoftwareUpgrade is a governance operation for initiating a software upgrade.
     * Since: cosmos-sdk 0.46
     * </pre>
     */
    public void softwareUpgrade(cosmos.upgrade.v1beta1.Tx.MsgSoftwareUpgrade request,
        io.grpc.stub.StreamObserver<cosmos.upgrade.v1beta1.Tx.MsgSoftwareUpgradeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSoftwareUpgradeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CancelUpgrade is a governance operation for cancelling a previously
     * approved software upgrade.
     * Since: cosmos-sdk 0.46
     * </pre>
     */
    public void cancelUpgrade(cosmos.upgrade.v1beta1.Tx.MsgCancelUpgrade request,
        io.grpc.stub.StreamObserver<cosmos.upgrade.v1beta1.Tx.MsgCancelUpgradeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCancelUpgradeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Msg defines the upgrade Msg service.
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
     * SoftwareUpgrade is a governance operation for initiating a software upgrade.
     * Since: cosmos-sdk 0.46
     * </pre>
     */
    public cosmos.upgrade.v1beta1.Tx.MsgSoftwareUpgradeResponse softwareUpgrade(cosmos.upgrade.v1beta1.Tx.MsgSoftwareUpgrade request) {
      return blockingUnaryCall(
          getChannel(), getSoftwareUpgradeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CancelUpgrade is a governance operation for cancelling a previously
     * approved software upgrade.
     * Since: cosmos-sdk 0.46
     * </pre>
     */
    public cosmos.upgrade.v1beta1.Tx.MsgCancelUpgradeResponse cancelUpgrade(cosmos.upgrade.v1beta1.Tx.MsgCancelUpgrade request) {
      return blockingUnaryCall(
          getChannel(), getCancelUpgradeMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Msg defines the upgrade Msg service.
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
     * SoftwareUpgrade is a governance operation for initiating a software upgrade.
     * Since: cosmos-sdk 0.46
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.upgrade.v1beta1.Tx.MsgSoftwareUpgradeResponse> softwareUpgrade(
        cosmos.upgrade.v1beta1.Tx.MsgSoftwareUpgrade request) {
      return futureUnaryCall(
          getChannel().newCall(getSoftwareUpgradeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CancelUpgrade is a governance operation for cancelling a previously
     * approved software upgrade.
     * Since: cosmos-sdk 0.46
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.upgrade.v1beta1.Tx.MsgCancelUpgradeResponse> cancelUpgrade(
        cosmos.upgrade.v1beta1.Tx.MsgCancelUpgrade request) {
      return futureUnaryCall(
          getChannel().newCall(getCancelUpgradeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SOFTWARE_UPGRADE = 0;
  private static final int METHODID_CANCEL_UPGRADE = 1;

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
        case METHODID_SOFTWARE_UPGRADE:
          serviceImpl.softwareUpgrade((cosmos.upgrade.v1beta1.Tx.MsgSoftwareUpgrade) request,
              (io.grpc.stub.StreamObserver<cosmos.upgrade.v1beta1.Tx.MsgSoftwareUpgradeResponse>) responseObserver);
          break;
        case METHODID_CANCEL_UPGRADE:
          serviceImpl.cancelUpgrade((cosmos.upgrade.v1beta1.Tx.MsgCancelUpgrade) request,
              (io.grpc.stub.StreamObserver<cosmos.upgrade.v1beta1.Tx.MsgCancelUpgradeResponse>) responseObserver);
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
      return cosmos.upgrade.v1beta1.Tx.getDescriptor();
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
              .addMethod(getSoftwareUpgradeMethod())
              .addMethod(getCancelUpgradeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
