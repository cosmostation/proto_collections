package canto.fees.v1;

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
 * Msg defines the fees Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: canto/fees/v1/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "canto.fees.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<canto.fees.v1.Tx.MsgRegisterFee,
      canto.fees.v1.Tx.MsgRegisterFeeResponse> getRegisterFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterFee",
      requestType = canto.fees.v1.Tx.MsgRegisterFee.class,
      responseType = canto.fees.v1.Tx.MsgRegisterFeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<canto.fees.v1.Tx.MsgRegisterFee,
      canto.fees.v1.Tx.MsgRegisterFeeResponse> getRegisterFeeMethod() {
    io.grpc.MethodDescriptor<canto.fees.v1.Tx.MsgRegisterFee, canto.fees.v1.Tx.MsgRegisterFeeResponse> getRegisterFeeMethod;
    if ((getRegisterFeeMethod = MsgGrpc.getRegisterFeeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRegisterFeeMethod = MsgGrpc.getRegisterFeeMethod) == null) {
          MsgGrpc.getRegisterFeeMethod = getRegisterFeeMethod =
              io.grpc.MethodDescriptor.<canto.fees.v1.Tx.MsgRegisterFee, canto.fees.v1.Tx.MsgRegisterFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  canto.fees.v1.Tx.MsgRegisterFee.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  canto.fees.v1.Tx.MsgRegisterFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RegisterFee"))
              .build();
        }
      }
    }
    return getRegisterFeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<canto.fees.v1.Tx.MsgCancelFee,
      canto.fees.v1.Tx.MsgCancelFeeResponse> getCancelFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelFee",
      requestType = canto.fees.v1.Tx.MsgCancelFee.class,
      responseType = canto.fees.v1.Tx.MsgCancelFeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<canto.fees.v1.Tx.MsgCancelFee,
      canto.fees.v1.Tx.MsgCancelFeeResponse> getCancelFeeMethod() {
    io.grpc.MethodDescriptor<canto.fees.v1.Tx.MsgCancelFee, canto.fees.v1.Tx.MsgCancelFeeResponse> getCancelFeeMethod;
    if ((getCancelFeeMethod = MsgGrpc.getCancelFeeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCancelFeeMethod = MsgGrpc.getCancelFeeMethod) == null) {
          MsgGrpc.getCancelFeeMethod = getCancelFeeMethod =
              io.grpc.MethodDescriptor.<canto.fees.v1.Tx.MsgCancelFee, canto.fees.v1.Tx.MsgCancelFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  canto.fees.v1.Tx.MsgCancelFee.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  canto.fees.v1.Tx.MsgCancelFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CancelFee"))
              .build();
        }
      }
    }
    return getCancelFeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<canto.fees.v1.Tx.MsgUpdateFee,
      canto.fees.v1.Tx.MsgUpdateFeeResponse> getUpdateFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateFee",
      requestType = canto.fees.v1.Tx.MsgUpdateFee.class,
      responseType = canto.fees.v1.Tx.MsgUpdateFeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<canto.fees.v1.Tx.MsgUpdateFee,
      canto.fees.v1.Tx.MsgUpdateFeeResponse> getUpdateFeeMethod() {
    io.grpc.MethodDescriptor<canto.fees.v1.Tx.MsgUpdateFee, canto.fees.v1.Tx.MsgUpdateFeeResponse> getUpdateFeeMethod;
    if ((getUpdateFeeMethod = MsgGrpc.getUpdateFeeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateFeeMethod = MsgGrpc.getUpdateFeeMethod) == null) {
          MsgGrpc.getUpdateFeeMethod = getUpdateFeeMethod =
              io.grpc.MethodDescriptor.<canto.fees.v1.Tx.MsgUpdateFee, canto.fees.v1.Tx.MsgUpdateFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  canto.fees.v1.Tx.MsgUpdateFee.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  canto.fees.v1.Tx.MsgUpdateFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateFee"))
              .build();
        }
      }
    }
    return getUpdateFeeMethod;
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
   * Msg defines the fees Msg service.
   * </pre>
   */
  public static abstract class MsgImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * RegisterFee registers a new contract for receiving transaction fees
     * </pre>
     */
    public void registerFee(canto.fees.v1.Tx.MsgRegisterFee request,
        io.grpc.stub.StreamObserver<canto.fees.v1.Tx.MsgRegisterFeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterFeeMethod(), responseObserver);
    }

    /**
     * <pre>
     * CancelFee cancels a contract's fee registration and further receival of
     * transaction fees
     * </pre>
     */
    public void cancelFee(canto.fees.v1.Tx.MsgCancelFee request,
        io.grpc.stub.StreamObserver<canto.fees.v1.Tx.MsgCancelFeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCancelFeeMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateFee updates the withdraw address
     * </pre>
     */
    public void updateFee(canto.fees.v1.Tx.MsgUpdateFee request,
        io.grpc.stub.StreamObserver<canto.fees.v1.Tx.MsgUpdateFeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateFeeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterFeeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                canto.fees.v1.Tx.MsgRegisterFee,
                canto.fees.v1.Tx.MsgRegisterFeeResponse>(
                  this, METHODID_REGISTER_FEE)))
          .addMethod(
            getCancelFeeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                canto.fees.v1.Tx.MsgCancelFee,
                canto.fees.v1.Tx.MsgCancelFeeResponse>(
                  this, METHODID_CANCEL_FEE)))
          .addMethod(
            getUpdateFeeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                canto.fees.v1.Tx.MsgUpdateFee,
                canto.fees.v1.Tx.MsgUpdateFeeResponse>(
                  this, METHODID_UPDATE_FEE)))
          .build();
    }
  }

  /**
   * <pre>
   * Msg defines the fees Msg service.
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
     * RegisterFee registers a new contract for receiving transaction fees
     * </pre>
     */
    public void registerFee(canto.fees.v1.Tx.MsgRegisterFee request,
        io.grpc.stub.StreamObserver<canto.fees.v1.Tx.MsgRegisterFeeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterFeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CancelFee cancels a contract's fee registration and further receival of
     * transaction fees
     * </pre>
     */
    public void cancelFee(canto.fees.v1.Tx.MsgCancelFee request,
        io.grpc.stub.StreamObserver<canto.fees.v1.Tx.MsgCancelFeeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCancelFeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateFee updates the withdraw address
     * </pre>
     */
    public void updateFee(canto.fees.v1.Tx.MsgUpdateFee request,
        io.grpc.stub.StreamObserver<canto.fees.v1.Tx.MsgUpdateFeeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateFeeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Msg defines the fees Msg service.
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
     * RegisterFee registers a new contract for receiving transaction fees
     * </pre>
     */
    public canto.fees.v1.Tx.MsgRegisterFeeResponse registerFee(canto.fees.v1.Tx.MsgRegisterFee request) {
      return blockingUnaryCall(
          getChannel(), getRegisterFeeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CancelFee cancels a contract's fee registration and further receival of
     * transaction fees
     * </pre>
     */
    public canto.fees.v1.Tx.MsgCancelFeeResponse cancelFee(canto.fees.v1.Tx.MsgCancelFee request) {
      return blockingUnaryCall(
          getChannel(), getCancelFeeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateFee updates the withdraw address
     * </pre>
     */
    public canto.fees.v1.Tx.MsgUpdateFeeResponse updateFee(canto.fees.v1.Tx.MsgUpdateFee request) {
      return blockingUnaryCall(
          getChannel(), getUpdateFeeMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Msg defines the fees Msg service.
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
     * RegisterFee registers a new contract for receiving transaction fees
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<canto.fees.v1.Tx.MsgRegisterFeeResponse> registerFee(
        canto.fees.v1.Tx.MsgRegisterFee request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterFeeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CancelFee cancels a contract's fee registration and further receival of
     * transaction fees
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<canto.fees.v1.Tx.MsgCancelFeeResponse> cancelFee(
        canto.fees.v1.Tx.MsgCancelFee request) {
      return futureUnaryCall(
          getChannel().newCall(getCancelFeeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateFee updates the withdraw address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<canto.fees.v1.Tx.MsgUpdateFeeResponse> updateFee(
        canto.fees.v1.Tx.MsgUpdateFee request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateFeeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_FEE = 0;
  private static final int METHODID_CANCEL_FEE = 1;
  private static final int METHODID_UPDATE_FEE = 2;

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
        case METHODID_REGISTER_FEE:
          serviceImpl.registerFee((canto.fees.v1.Tx.MsgRegisterFee) request,
              (io.grpc.stub.StreamObserver<canto.fees.v1.Tx.MsgRegisterFeeResponse>) responseObserver);
          break;
        case METHODID_CANCEL_FEE:
          serviceImpl.cancelFee((canto.fees.v1.Tx.MsgCancelFee) request,
              (io.grpc.stub.StreamObserver<canto.fees.v1.Tx.MsgCancelFeeResponse>) responseObserver);
          break;
        case METHODID_UPDATE_FEE:
          serviceImpl.updateFee((canto.fees.v1.Tx.MsgUpdateFee) request,
              (io.grpc.stub.StreamObserver<canto.fees.v1.Tx.MsgUpdateFeeResponse>) responseObserver);
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
      return canto.fees.v1.Tx.getDescriptor();
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
              .addMethod(getRegisterFeeMethod())
              .addMethod(getCancelFeeMethod())
              .addMethod(getUpdateFeeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
