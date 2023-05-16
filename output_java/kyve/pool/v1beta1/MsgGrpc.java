package kyve.pool.v1beta1;

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
    comments = "Source: kyve/pool/v1beta1/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "kyve.pool.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<kyve.pool.v1beta1.Tx.MsgFundPool,
      kyve.pool.v1beta1.Tx.MsgFundPoolResponse> getFundPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FundPool",
      requestType = kyve.pool.v1beta1.Tx.MsgFundPool.class,
      responseType = kyve.pool.v1beta1.Tx.MsgFundPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.pool.v1beta1.Tx.MsgFundPool,
      kyve.pool.v1beta1.Tx.MsgFundPoolResponse> getFundPoolMethod() {
    io.grpc.MethodDescriptor<kyve.pool.v1beta1.Tx.MsgFundPool, kyve.pool.v1beta1.Tx.MsgFundPoolResponse> getFundPoolMethod;
    if ((getFundPoolMethod = MsgGrpc.getFundPoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getFundPoolMethod = MsgGrpc.getFundPoolMethod) == null) {
          MsgGrpc.getFundPoolMethod = getFundPoolMethod =
              io.grpc.MethodDescriptor.<kyve.pool.v1beta1.Tx.MsgFundPool, kyve.pool.v1beta1.Tx.MsgFundPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FundPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.pool.v1beta1.Tx.MsgFundPool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.pool.v1beta1.Tx.MsgFundPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("FundPool"))
              .build();
        }
      }
    }
    return getFundPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.pool.v1beta1.Tx.MsgDefundPool,
      kyve.pool.v1beta1.Tx.MsgDefundPoolResponse> getDefundPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DefundPool",
      requestType = kyve.pool.v1beta1.Tx.MsgDefundPool.class,
      responseType = kyve.pool.v1beta1.Tx.MsgDefundPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.pool.v1beta1.Tx.MsgDefundPool,
      kyve.pool.v1beta1.Tx.MsgDefundPoolResponse> getDefundPoolMethod() {
    io.grpc.MethodDescriptor<kyve.pool.v1beta1.Tx.MsgDefundPool, kyve.pool.v1beta1.Tx.MsgDefundPoolResponse> getDefundPoolMethod;
    if ((getDefundPoolMethod = MsgGrpc.getDefundPoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDefundPoolMethod = MsgGrpc.getDefundPoolMethod) == null) {
          MsgGrpc.getDefundPoolMethod = getDefundPoolMethod =
              io.grpc.MethodDescriptor.<kyve.pool.v1beta1.Tx.MsgDefundPool, kyve.pool.v1beta1.Tx.MsgDefundPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DefundPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.pool.v1beta1.Tx.MsgDefundPool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.pool.v1beta1.Tx.MsgDefundPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DefundPool"))
              .build();
        }
      }
    }
    return getDefundPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.pool.v1beta1.Tx.MsgCreatePool,
      kyve.pool.v1beta1.Tx.MsgCreatePoolResponse> getCreatePoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePool",
      requestType = kyve.pool.v1beta1.Tx.MsgCreatePool.class,
      responseType = kyve.pool.v1beta1.Tx.MsgCreatePoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.pool.v1beta1.Tx.MsgCreatePool,
      kyve.pool.v1beta1.Tx.MsgCreatePoolResponse> getCreatePoolMethod() {
    io.grpc.MethodDescriptor<kyve.pool.v1beta1.Tx.MsgCreatePool, kyve.pool.v1beta1.Tx.MsgCreatePoolResponse> getCreatePoolMethod;
    if ((getCreatePoolMethod = MsgGrpc.getCreatePoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreatePoolMethod = MsgGrpc.getCreatePoolMethod) == null) {
          MsgGrpc.getCreatePoolMethod = getCreatePoolMethod =
              io.grpc.MethodDescriptor.<kyve.pool.v1beta1.Tx.MsgCreatePool, kyve.pool.v1beta1.Tx.MsgCreatePoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.pool.v1beta1.Tx.MsgCreatePool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.pool.v1beta1.Tx.MsgCreatePoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreatePool"))
              .build();
        }
      }
    }
    return getCreatePoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.pool.v1beta1.Tx.MsgUpdatePool,
      kyve.pool.v1beta1.Tx.MsgUpdatePoolResponse> getUpdatePoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePool",
      requestType = kyve.pool.v1beta1.Tx.MsgUpdatePool.class,
      responseType = kyve.pool.v1beta1.Tx.MsgUpdatePoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.pool.v1beta1.Tx.MsgUpdatePool,
      kyve.pool.v1beta1.Tx.MsgUpdatePoolResponse> getUpdatePoolMethod() {
    io.grpc.MethodDescriptor<kyve.pool.v1beta1.Tx.MsgUpdatePool, kyve.pool.v1beta1.Tx.MsgUpdatePoolResponse> getUpdatePoolMethod;
    if ((getUpdatePoolMethod = MsgGrpc.getUpdatePoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdatePoolMethod = MsgGrpc.getUpdatePoolMethod) == null) {
          MsgGrpc.getUpdatePoolMethod = getUpdatePoolMethod =
              io.grpc.MethodDescriptor.<kyve.pool.v1beta1.Tx.MsgUpdatePool, kyve.pool.v1beta1.Tx.MsgUpdatePoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.pool.v1beta1.Tx.MsgUpdatePool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.pool.v1beta1.Tx.MsgUpdatePoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdatePool"))
              .build();
        }
      }
    }
    return getUpdatePoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.pool.v1beta1.Tx.MsgDisablePool,
      kyve.pool.v1beta1.Tx.MsgDisablePoolResponse> getDisablePoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisablePool",
      requestType = kyve.pool.v1beta1.Tx.MsgDisablePool.class,
      responseType = kyve.pool.v1beta1.Tx.MsgDisablePoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.pool.v1beta1.Tx.MsgDisablePool,
      kyve.pool.v1beta1.Tx.MsgDisablePoolResponse> getDisablePoolMethod() {
    io.grpc.MethodDescriptor<kyve.pool.v1beta1.Tx.MsgDisablePool, kyve.pool.v1beta1.Tx.MsgDisablePoolResponse> getDisablePoolMethod;
    if ((getDisablePoolMethod = MsgGrpc.getDisablePoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDisablePoolMethod = MsgGrpc.getDisablePoolMethod) == null) {
          MsgGrpc.getDisablePoolMethod = getDisablePoolMethod =
              io.grpc.MethodDescriptor.<kyve.pool.v1beta1.Tx.MsgDisablePool, kyve.pool.v1beta1.Tx.MsgDisablePoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisablePool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.pool.v1beta1.Tx.MsgDisablePool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.pool.v1beta1.Tx.MsgDisablePoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DisablePool"))
              .build();
        }
      }
    }
    return getDisablePoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.pool.v1beta1.Tx.MsgEnablePool,
      kyve.pool.v1beta1.Tx.MsgEnablePoolResponse> getEnablePoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnablePool",
      requestType = kyve.pool.v1beta1.Tx.MsgEnablePool.class,
      responseType = kyve.pool.v1beta1.Tx.MsgEnablePoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.pool.v1beta1.Tx.MsgEnablePool,
      kyve.pool.v1beta1.Tx.MsgEnablePoolResponse> getEnablePoolMethod() {
    io.grpc.MethodDescriptor<kyve.pool.v1beta1.Tx.MsgEnablePool, kyve.pool.v1beta1.Tx.MsgEnablePoolResponse> getEnablePoolMethod;
    if ((getEnablePoolMethod = MsgGrpc.getEnablePoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getEnablePoolMethod = MsgGrpc.getEnablePoolMethod) == null) {
          MsgGrpc.getEnablePoolMethod = getEnablePoolMethod =
              io.grpc.MethodDescriptor.<kyve.pool.v1beta1.Tx.MsgEnablePool, kyve.pool.v1beta1.Tx.MsgEnablePoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnablePool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.pool.v1beta1.Tx.MsgEnablePool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.pool.v1beta1.Tx.MsgEnablePoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("EnablePool"))
              .build();
        }
      }
    }
    return getEnablePoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.pool.v1beta1.Tx.MsgScheduleRuntimeUpgrade,
      kyve.pool.v1beta1.Tx.MsgScheduleRuntimeUpgradeResponse> getScheduleRuntimeUpgradeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScheduleRuntimeUpgrade",
      requestType = kyve.pool.v1beta1.Tx.MsgScheduleRuntimeUpgrade.class,
      responseType = kyve.pool.v1beta1.Tx.MsgScheduleRuntimeUpgradeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.pool.v1beta1.Tx.MsgScheduleRuntimeUpgrade,
      kyve.pool.v1beta1.Tx.MsgScheduleRuntimeUpgradeResponse> getScheduleRuntimeUpgradeMethod() {
    io.grpc.MethodDescriptor<kyve.pool.v1beta1.Tx.MsgScheduleRuntimeUpgrade, kyve.pool.v1beta1.Tx.MsgScheduleRuntimeUpgradeResponse> getScheduleRuntimeUpgradeMethod;
    if ((getScheduleRuntimeUpgradeMethod = MsgGrpc.getScheduleRuntimeUpgradeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getScheduleRuntimeUpgradeMethod = MsgGrpc.getScheduleRuntimeUpgradeMethod) == null) {
          MsgGrpc.getScheduleRuntimeUpgradeMethod = getScheduleRuntimeUpgradeMethod =
              io.grpc.MethodDescriptor.<kyve.pool.v1beta1.Tx.MsgScheduleRuntimeUpgrade, kyve.pool.v1beta1.Tx.MsgScheduleRuntimeUpgradeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScheduleRuntimeUpgrade"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.pool.v1beta1.Tx.MsgScheduleRuntimeUpgrade.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.pool.v1beta1.Tx.MsgScheduleRuntimeUpgradeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ScheduleRuntimeUpgrade"))
              .build();
        }
      }
    }
    return getScheduleRuntimeUpgradeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.pool.v1beta1.Tx.MsgCancelRuntimeUpgrade,
      kyve.pool.v1beta1.Tx.MsgCancelRuntimeUpgradeResponse> getCancelRuntimeUpgradeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelRuntimeUpgrade",
      requestType = kyve.pool.v1beta1.Tx.MsgCancelRuntimeUpgrade.class,
      responseType = kyve.pool.v1beta1.Tx.MsgCancelRuntimeUpgradeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.pool.v1beta1.Tx.MsgCancelRuntimeUpgrade,
      kyve.pool.v1beta1.Tx.MsgCancelRuntimeUpgradeResponse> getCancelRuntimeUpgradeMethod() {
    io.grpc.MethodDescriptor<kyve.pool.v1beta1.Tx.MsgCancelRuntimeUpgrade, kyve.pool.v1beta1.Tx.MsgCancelRuntimeUpgradeResponse> getCancelRuntimeUpgradeMethod;
    if ((getCancelRuntimeUpgradeMethod = MsgGrpc.getCancelRuntimeUpgradeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCancelRuntimeUpgradeMethod = MsgGrpc.getCancelRuntimeUpgradeMethod) == null) {
          MsgGrpc.getCancelRuntimeUpgradeMethod = getCancelRuntimeUpgradeMethod =
              io.grpc.MethodDescriptor.<kyve.pool.v1beta1.Tx.MsgCancelRuntimeUpgrade, kyve.pool.v1beta1.Tx.MsgCancelRuntimeUpgradeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelRuntimeUpgrade"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.pool.v1beta1.Tx.MsgCancelRuntimeUpgrade.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.pool.v1beta1.Tx.MsgCancelRuntimeUpgradeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CancelRuntimeUpgrade"))
              .build();
        }
      }
    }
    return getCancelRuntimeUpgradeMethod;
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
     * FundPool ...
     * </pre>
     */
    public void fundPool(kyve.pool.v1beta1.Tx.MsgFundPool request,
        io.grpc.stub.StreamObserver<kyve.pool.v1beta1.Tx.MsgFundPoolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFundPoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * DefundPool ...
     * </pre>
     */
    public void defundPool(kyve.pool.v1beta1.Tx.MsgDefundPool request,
        io.grpc.stub.StreamObserver<kyve.pool.v1beta1.Tx.MsgDefundPoolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDefundPoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreatePool defines a governance operation for creating a new pool.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public void createPool(kyve.pool.v1beta1.Tx.MsgCreatePool request,
        io.grpc.stub.StreamObserver<kyve.pool.v1beta1.Tx.MsgCreatePoolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreatePoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdatePool defines a governance operation for updating an existing pool.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public void updatePool(kyve.pool.v1beta1.Tx.MsgUpdatePool request,
        io.grpc.stub.StreamObserver<kyve.pool.v1beta1.Tx.MsgUpdatePoolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatePoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * DisablePool defines a governance operation for disabling an existing pool.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public void disablePool(kyve.pool.v1beta1.Tx.MsgDisablePool request,
        io.grpc.stub.StreamObserver<kyve.pool.v1beta1.Tx.MsgDisablePoolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDisablePoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * EnablePool defines a governance operation for enabling an existing pool.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public void enablePool(kyve.pool.v1beta1.Tx.MsgEnablePool request,
        io.grpc.stub.StreamObserver<kyve.pool.v1beta1.Tx.MsgEnablePoolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEnablePoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * ScheduleRuntimeUpgrade defines a governance operation for scheduling a runtime upgrade.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public void scheduleRuntimeUpgrade(kyve.pool.v1beta1.Tx.MsgScheduleRuntimeUpgrade request,
        io.grpc.stub.StreamObserver<kyve.pool.v1beta1.Tx.MsgScheduleRuntimeUpgradeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getScheduleRuntimeUpgradeMethod(), responseObserver);
    }

    /**
     * <pre>
     * CancelRuntimeUpgrade defines a governance operation for cancelling a runtime upgrade.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public void cancelRuntimeUpgrade(kyve.pool.v1beta1.Tx.MsgCancelRuntimeUpgrade request,
        io.grpc.stub.StreamObserver<kyve.pool.v1beta1.Tx.MsgCancelRuntimeUpgradeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCancelRuntimeUpgradeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFundPoolMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.pool.v1beta1.Tx.MsgFundPool,
                kyve.pool.v1beta1.Tx.MsgFundPoolResponse>(
                  this, METHODID_FUND_POOL)))
          .addMethod(
            getDefundPoolMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.pool.v1beta1.Tx.MsgDefundPool,
                kyve.pool.v1beta1.Tx.MsgDefundPoolResponse>(
                  this, METHODID_DEFUND_POOL)))
          .addMethod(
            getCreatePoolMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.pool.v1beta1.Tx.MsgCreatePool,
                kyve.pool.v1beta1.Tx.MsgCreatePoolResponse>(
                  this, METHODID_CREATE_POOL)))
          .addMethod(
            getUpdatePoolMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.pool.v1beta1.Tx.MsgUpdatePool,
                kyve.pool.v1beta1.Tx.MsgUpdatePoolResponse>(
                  this, METHODID_UPDATE_POOL)))
          .addMethod(
            getDisablePoolMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.pool.v1beta1.Tx.MsgDisablePool,
                kyve.pool.v1beta1.Tx.MsgDisablePoolResponse>(
                  this, METHODID_DISABLE_POOL)))
          .addMethod(
            getEnablePoolMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.pool.v1beta1.Tx.MsgEnablePool,
                kyve.pool.v1beta1.Tx.MsgEnablePoolResponse>(
                  this, METHODID_ENABLE_POOL)))
          .addMethod(
            getScheduleRuntimeUpgradeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.pool.v1beta1.Tx.MsgScheduleRuntimeUpgrade,
                kyve.pool.v1beta1.Tx.MsgScheduleRuntimeUpgradeResponse>(
                  this, METHODID_SCHEDULE_RUNTIME_UPGRADE)))
          .addMethod(
            getCancelRuntimeUpgradeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.pool.v1beta1.Tx.MsgCancelRuntimeUpgrade,
                kyve.pool.v1beta1.Tx.MsgCancelRuntimeUpgradeResponse>(
                  this, METHODID_CANCEL_RUNTIME_UPGRADE)))
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
     * FundPool ...
     * </pre>
     */
    public void fundPool(kyve.pool.v1beta1.Tx.MsgFundPool request,
        io.grpc.stub.StreamObserver<kyve.pool.v1beta1.Tx.MsgFundPoolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFundPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DefundPool ...
     * </pre>
     */
    public void defundPool(kyve.pool.v1beta1.Tx.MsgDefundPool request,
        io.grpc.stub.StreamObserver<kyve.pool.v1beta1.Tx.MsgDefundPoolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDefundPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreatePool defines a governance operation for creating a new pool.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public void createPool(kyve.pool.v1beta1.Tx.MsgCreatePool request,
        io.grpc.stub.StreamObserver<kyve.pool.v1beta1.Tx.MsgCreatePoolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreatePoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdatePool defines a governance operation for updating an existing pool.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public void updatePool(kyve.pool.v1beta1.Tx.MsgUpdatePool request,
        io.grpc.stub.StreamObserver<kyve.pool.v1beta1.Tx.MsgUpdatePoolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatePoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DisablePool defines a governance operation for disabling an existing pool.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public void disablePool(kyve.pool.v1beta1.Tx.MsgDisablePool request,
        io.grpc.stub.StreamObserver<kyve.pool.v1beta1.Tx.MsgDisablePoolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDisablePoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EnablePool defines a governance operation for enabling an existing pool.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public void enablePool(kyve.pool.v1beta1.Tx.MsgEnablePool request,
        io.grpc.stub.StreamObserver<kyve.pool.v1beta1.Tx.MsgEnablePoolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEnablePoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ScheduleRuntimeUpgrade defines a governance operation for scheduling a runtime upgrade.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public void scheduleRuntimeUpgrade(kyve.pool.v1beta1.Tx.MsgScheduleRuntimeUpgrade request,
        io.grpc.stub.StreamObserver<kyve.pool.v1beta1.Tx.MsgScheduleRuntimeUpgradeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getScheduleRuntimeUpgradeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CancelRuntimeUpgrade defines a governance operation for cancelling a runtime upgrade.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public void cancelRuntimeUpgrade(kyve.pool.v1beta1.Tx.MsgCancelRuntimeUpgrade request,
        io.grpc.stub.StreamObserver<kyve.pool.v1beta1.Tx.MsgCancelRuntimeUpgradeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCancelRuntimeUpgradeMethod(), getCallOptions()), request, responseObserver);
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
     * FundPool ...
     * </pre>
     */
    public kyve.pool.v1beta1.Tx.MsgFundPoolResponse fundPool(kyve.pool.v1beta1.Tx.MsgFundPool request) {
      return blockingUnaryCall(
          getChannel(), getFundPoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DefundPool ...
     * </pre>
     */
    public kyve.pool.v1beta1.Tx.MsgDefundPoolResponse defundPool(kyve.pool.v1beta1.Tx.MsgDefundPool request) {
      return blockingUnaryCall(
          getChannel(), getDefundPoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreatePool defines a governance operation for creating a new pool.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public kyve.pool.v1beta1.Tx.MsgCreatePoolResponse createPool(kyve.pool.v1beta1.Tx.MsgCreatePool request) {
      return blockingUnaryCall(
          getChannel(), getCreatePoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdatePool defines a governance operation for updating an existing pool.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public kyve.pool.v1beta1.Tx.MsgUpdatePoolResponse updatePool(kyve.pool.v1beta1.Tx.MsgUpdatePool request) {
      return blockingUnaryCall(
          getChannel(), getUpdatePoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DisablePool defines a governance operation for disabling an existing pool.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public kyve.pool.v1beta1.Tx.MsgDisablePoolResponse disablePool(kyve.pool.v1beta1.Tx.MsgDisablePool request) {
      return blockingUnaryCall(
          getChannel(), getDisablePoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EnablePool defines a governance operation for enabling an existing pool.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public kyve.pool.v1beta1.Tx.MsgEnablePoolResponse enablePool(kyve.pool.v1beta1.Tx.MsgEnablePool request) {
      return blockingUnaryCall(
          getChannel(), getEnablePoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ScheduleRuntimeUpgrade defines a governance operation for scheduling a runtime upgrade.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public kyve.pool.v1beta1.Tx.MsgScheduleRuntimeUpgradeResponse scheduleRuntimeUpgrade(kyve.pool.v1beta1.Tx.MsgScheduleRuntimeUpgrade request) {
      return blockingUnaryCall(
          getChannel(), getScheduleRuntimeUpgradeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CancelRuntimeUpgrade defines a governance operation for cancelling a runtime upgrade.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public kyve.pool.v1beta1.Tx.MsgCancelRuntimeUpgradeResponse cancelRuntimeUpgrade(kyve.pool.v1beta1.Tx.MsgCancelRuntimeUpgrade request) {
      return blockingUnaryCall(
          getChannel(), getCancelRuntimeUpgradeMethod(), getCallOptions(), request);
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
     * FundPool ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.pool.v1beta1.Tx.MsgFundPoolResponse> fundPool(
        kyve.pool.v1beta1.Tx.MsgFundPool request) {
      return futureUnaryCall(
          getChannel().newCall(getFundPoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DefundPool ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.pool.v1beta1.Tx.MsgDefundPoolResponse> defundPool(
        kyve.pool.v1beta1.Tx.MsgDefundPool request) {
      return futureUnaryCall(
          getChannel().newCall(getDefundPoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreatePool defines a governance operation for creating a new pool.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.pool.v1beta1.Tx.MsgCreatePoolResponse> createPool(
        kyve.pool.v1beta1.Tx.MsgCreatePool request) {
      return futureUnaryCall(
          getChannel().newCall(getCreatePoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdatePool defines a governance operation for updating an existing pool.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.pool.v1beta1.Tx.MsgUpdatePoolResponse> updatePool(
        kyve.pool.v1beta1.Tx.MsgUpdatePool request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatePoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DisablePool defines a governance operation for disabling an existing pool.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.pool.v1beta1.Tx.MsgDisablePoolResponse> disablePool(
        kyve.pool.v1beta1.Tx.MsgDisablePool request) {
      return futureUnaryCall(
          getChannel().newCall(getDisablePoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EnablePool defines a governance operation for enabling an existing pool.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.pool.v1beta1.Tx.MsgEnablePoolResponse> enablePool(
        kyve.pool.v1beta1.Tx.MsgEnablePool request) {
      return futureUnaryCall(
          getChannel().newCall(getEnablePoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ScheduleRuntimeUpgrade defines a governance operation for scheduling a runtime upgrade.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.pool.v1beta1.Tx.MsgScheduleRuntimeUpgradeResponse> scheduleRuntimeUpgrade(
        kyve.pool.v1beta1.Tx.MsgScheduleRuntimeUpgrade request) {
      return futureUnaryCall(
          getChannel().newCall(getScheduleRuntimeUpgradeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CancelRuntimeUpgrade defines a governance operation for cancelling a runtime upgrade.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.pool.v1beta1.Tx.MsgCancelRuntimeUpgradeResponse> cancelRuntimeUpgrade(
        kyve.pool.v1beta1.Tx.MsgCancelRuntimeUpgrade request) {
      return futureUnaryCall(
          getChannel().newCall(getCancelRuntimeUpgradeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FUND_POOL = 0;
  private static final int METHODID_DEFUND_POOL = 1;
  private static final int METHODID_CREATE_POOL = 2;
  private static final int METHODID_UPDATE_POOL = 3;
  private static final int METHODID_DISABLE_POOL = 4;
  private static final int METHODID_ENABLE_POOL = 5;
  private static final int METHODID_SCHEDULE_RUNTIME_UPGRADE = 6;
  private static final int METHODID_CANCEL_RUNTIME_UPGRADE = 7;

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
        case METHODID_FUND_POOL:
          serviceImpl.fundPool((kyve.pool.v1beta1.Tx.MsgFundPool) request,
              (io.grpc.stub.StreamObserver<kyve.pool.v1beta1.Tx.MsgFundPoolResponse>) responseObserver);
          break;
        case METHODID_DEFUND_POOL:
          serviceImpl.defundPool((kyve.pool.v1beta1.Tx.MsgDefundPool) request,
              (io.grpc.stub.StreamObserver<kyve.pool.v1beta1.Tx.MsgDefundPoolResponse>) responseObserver);
          break;
        case METHODID_CREATE_POOL:
          serviceImpl.createPool((kyve.pool.v1beta1.Tx.MsgCreatePool) request,
              (io.grpc.stub.StreamObserver<kyve.pool.v1beta1.Tx.MsgCreatePoolResponse>) responseObserver);
          break;
        case METHODID_UPDATE_POOL:
          serviceImpl.updatePool((kyve.pool.v1beta1.Tx.MsgUpdatePool) request,
              (io.grpc.stub.StreamObserver<kyve.pool.v1beta1.Tx.MsgUpdatePoolResponse>) responseObserver);
          break;
        case METHODID_DISABLE_POOL:
          serviceImpl.disablePool((kyve.pool.v1beta1.Tx.MsgDisablePool) request,
              (io.grpc.stub.StreamObserver<kyve.pool.v1beta1.Tx.MsgDisablePoolResponse>) responseObserver);
          break;
        case METHODID_ENABLE_POOL:
          serviceImpl.enablePool((kyve.pool.v1beta1.Tx.MsgEnablePool) request,
              (io.grpc.stub.StreamObserver<kyve.pool.v1beta1.Tx.MsgEnablePoolResponse>) responseObserver);
          break;
        case METHODID_SCHEDULE_RUNTIME_UPGRADE:
          serviceImpl.scheduleRuntimeUpgrade((kyve.pool.v1beta1.Tx.MsgScheduleRuntimeUpgrade) request,
              (io.grpc.stub.StreamObserver<kyve.pool.v1beta1.Tx.MsgScheduleRuntimeUpgradeResponse>) responseObserver);
          break;
        case METHODID_CANCEL_RUNTIME_UPGRADE:
          serviceImpl.cancelRuntimeUpgrade((kyve.pool.v1beta1.Tx.MsgCancelRuntimeUpgrade) request,
              (io.grpc.stub.StreamObserver<kyve.pool.v1beta1.Tx.MsgCancelRuntimeUpgradeResponse>) responseObserver);
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
      return kyve.pool.v1beta1.Tx.getDescriptor();
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
              .addMethod(getFundPoolMethod())
              .addMethod(getDefundPoolMethod())
              .addMethod(getCreatePoolMethod())
              .addMethod(getUpdatePoolMethod())
              .addMethod(getDisablePoolMethod())
              .addMethod(getEnablePoolMethod())
              .addMethod(getScheduleRuntimeUpgradeMethod())
              .addMethod(getCancelRuntimeUpgradeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
