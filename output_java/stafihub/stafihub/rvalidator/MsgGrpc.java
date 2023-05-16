package stafihub.stafihub.rvalidator;

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
    comments = "Source: stafihub/rvalidator/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "stafihub.stafihub.rvalidator.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rvalidator.Tx.MsgInitRValidator,
      stafihub.stafihub.rvalidator.Tx.MsgInitRValidatorResponse> getInitRValidatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitRValidator",
      requestType = stafihub.stafihub.rvalidator.Tx.MsgInitRValidator.class,
      responseType = stafihub.stafihub.rvalidator.Tx.MsgInitRValidatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rvalidator.Tx.MsgInitRValidator,
      stafihub.stafihub.rvalidator.Tx.MsgInitRValidatorResponse> getInitRValidatorMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rvalidator.Tx.MsgInitRValidator, stafihub.stafihub.rvalidator.Tx.MsgInitRValidatorResponse> getInitRValidatorMethod;
    if ((getInitRValidatorMethod = MsgGrpc.getInitRValidatorMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getInitRValidatorMethod = MsgGrpc.getInitRValidatorMethod) == null) {
          MsgGrpc.getInitRValidatorMethod = getInitRValidatorMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rvalidator.Tx.MsgInitRValidator, stafihub.stafihub.rvalidator.Tx.MsgInitRValidatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitRValidator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rvalidator.Tx.MsgInitRValidator.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rvalidator.Tx.MsgInitRValidatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("InitRValidator"))
              .build();
        }
      }
    }
    return getInitRValidatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rvalidator.Tx.MsgSetCycleSeconds,
      stafihub.stafihub.rvalidator.Tx.MsgSetCycleSecondsResponse> getSetCycleSecondsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetCycleSeconds",
      requestType = stafihub.stafihub.rvalidator.Tx.MsgSetCycleSeconds.class,
      responseType = stafihub.stafihub.rvalidator.Tx.MsgSetCycleSecondsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rvalidator.Tx.MsgSetCycleSeconds,
      stafihub.stafihub.rvalidator.Tx.MsgSetCycleSecondsResponse> getSetCycleSecondsMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rvalidator.Tx.MsgSetCycleSeconds, stafihub.stafihub.rvalidator.Tx.MsgSetCycleSecondsResponse> getSetCycleSecondsMethod;
    if ((getSetCycleSecondsMethod = MsgGrpc.getSetCycleSecondsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetCycleSecondsMethod = MsgGrpc.getSetCycleSecondsMethod) == null) {
          MsgGrpc.getSetCycleSecondsMethod = getSetCycleSecondsMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rvalidator.Tx.MsgSetCycleSeconds, stafihub.stafihub.rvalidator.Tx.MsgSetCycleSecondsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetCycleSeconds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rvalidator.Tx.MsgSetCycleSeconds.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rvalidator.Tx.MsgSetCycleSecondsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetCycleSeconds"))
              .build();
        }
      }
    }
    return getSetCycleSecondsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rvalidator.Tx.MsgSetShuffleSeconds,
      stafihub.stafihub.rvalidator.Tx.MsgSetShuffleSecondsResponse> getSetShuffleSecondsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetShuffleSeconds",
      requestType = stafihub.stafihub.rvalidator.Tx.MsgSetShuffleSeconds.class,
      responseType = stafihub.stafihub.rvalidator.Tx.MsgSetShuffleSecondsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rvalidator.Tx.MsgSetShuffleSeconds,
      stafihub.stafihub.rvalidator.Tx.MsgSetShuffleSecondsResponse> getSetShuffleSecondsMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rvalidator.Tx.MsgSetShuffleSeconds, stafihub.stafihub.rvalidator.Tx.MsgSetShuffleSecondsResponse> getSetShuffleSecondsMethod;
    if ((getSetShuffleSecondsMethod = MsgGrpc.getSetShuffleSecondsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetShuffleSecondsMethod = MsgGrpc.getSetShuffleSecondsMethod) == null) {
          MsgGrpc.getSetShuffleSecondsMethod = getSetShuffleSecondsMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rvalidator.Tx.MsgSetShuffleSeconds, stafihub.stafihub.rvalidator.Tx.MsgSetShuffleSecondsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetShuffleSeconds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rvalidator.Tx.MsgSetShuffleSeconds.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rvalidator.Tx.MsgSetShuffleSecondsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetShuffleSeconds"))
              .build();
        }
      }
    }
    return getSetShuffleSecondsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rvalidator.Tx.MsgAddRValidator,
      stafihub.stafihub.rvalidator.Tx.MsgAddRValidatorResponse> getAddRValidatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddRValidator",
      requestType = stafihub.stafihub.rvalidator.Tx.MsgAddRValidator.class,
      responseType = stafihub.stafihub.rvalidator.Tx.MsgAddRValidatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rvalidator.Tx.MsgAddRValidator,
      stafihub.stafihub.rvalidator.Tx.MsgAddRValidatorResponse> getAddRValidatorMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rvalidator.Tx.MsgAddRValidator, stafihub.stafihub.rvalidator.Tx.MsgAddRValidatorResponse> getAddRValidatorMethod;
    if ((getAddRValidatorMethod = MsgGrpc.getAddRValidatorMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddRValidatorMethod = MsgGrpc.getAddRValidatorMethod) == null) {
          MsgGrpc.getAddRValidatorMethod = getAddRValidatorMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rvalidator.Tx.MsgAddRValidator, stafihub.stafihub.rvalidator.Tx.MsgAddRValidatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddRValidator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rvalidator.Tx.MsgAddRValidator.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rvalidator.Tx.MsgAddRValidatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddRValidator"))
              .build();
        }
      }
    }
    return getAddRValidatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rvalidator.Tx.MsgRmRValidator,
      stafihub.stafihub.rvalidator.Tx.MsgRmRValidatorResponse> getRmRValidatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RmRValidator",
      requestType = stafihub.stafihub.rvalidator.Tx.MsgRmRValidator.class,
      responseType = stafihub.stafihub.rvalidator.Tx.MsgRmRValidatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rvalidator.Tx.MsgRmRValidator,
      stafihub.stafihub.rvalidator.Tx.MsgRmRValidatorResponse> getRmRValidatorMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rvalidator.Tx.MsgRmRValidator, stafihub.stafihub.rvalidator.Tx.MsgRmRValidatorResponse> getRmRValidatorMethod;
    if ((getRmRValidatorMethod = MsgGrpc.getRmRValidatorMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRmRValidatorMethod = MsgGrpc.getRmRValidatorMethod) == null) {
          MsgGrpc.getRmRValidatorMethod = getRmRValidatorMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rvalidator.Tx.MsgRmRValidator, stafihub.stafihub.rvalidator.Tx.MsgRmRValidatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RmRValidator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rvalidator.Tx.MsgRmRValidator.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rvalidator.Tx.MsgRmRValidatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RmRValidator"))
              .build();
        }
      }
    }
    return getRmRValidatorMethod;
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
    public void initRValidator(stafihub.stafihub.rvalidator.Tx.MsgInitRValidator request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rvalidator.Tx.MsgInitRValidatorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInitRValidatorMethod(), responseObserver);
    }

    /**
     */
    public void setCycleSeconds(stafihub.stafihub.rvalidator.Tx.MsgSetCycleSeconds request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rvalidator.Tx.MsgSetCycleSecondsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetCycleSecondsMethod(), responseObserver);
    }

    /**
     */
    public void setShuffleSeconds(stafihub.stafihub.rvalidator.Tx.MsgSetShuffleSeconds request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rvalidator.Tx.MsgSetShuffleSecondsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetShuffleSecondsMethod(), responseObserver);
    }

    /**
     */
    public void addRValidator(stafihub.stafihub.rvalidator.Tx.MsgAddRValidator request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rvalidator.Tx.MsgAddRValidatorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddRValidatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void rmRValidator(stafihub.stafihub.rvalidator.Tx.MsgRmRValidator request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rvalidator.Tx.MsgRmRValidatorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRmRValidatorMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInitRValidatorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rvalidator.Tx.MsgInitRValidator,
                stafihub.stafihub.rvalidator.Tx.MsgInitRValidatorResponse>(
                  this, METHODID_INIT_RVALIDATOR)))
          .addMethod(
            getSetCycleSecondsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rvalidator.Tx.MsgSetCycleSeconds,
                stafihub.stafihub.rvalidator.Tx.MsgSetCycleSecondsResponse>(
                  this, METHODID_SET_CYCLE_SECONDS)))
          .addMethod(
            getSetShuffleSecondsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rvalidator.Tx.MsgSetShuffleSeconds,
                stafihub.stafihub.rvalidator.Tx.MsgSetShuffleSecondsResponse>(
                  this, METHODID_SET_SHUFFLE_SECONDS)))
          .addMethod(
            getAddRValidatorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rvalidator.Tx.MsgAddRValidator,
                stafihub.stafihub.rvalidator.Tx.MsgAddRValidatorResponse>(
                  this, METHODID_ADD_RVALIDATOR)))
          .addMethod(
            getRmRValidatorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rvalidator.Tx.MsgRmRValidator,
                stafihub.stafihub.rvalidator.Tx.MsgRmRValidatorResponse>(
                  this, METHODID_RM_RVALIDATOR)))
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
    public void initRValidator(stafihub.stafihub.rvalidator.Tx.MsgInitRValidator request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rvalidator.Tx.MsgInitRValidatorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInitRValidatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setCycleSeconds(stafihub.stafihub.rvalidator.Tx.MsgSetCycleSeconds request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rvalidator.Tx.MsgSetCycleSecondsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetCycleSecondsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setShuffleSeconds(stafihub.stafihub.rvalidator.Tx.MsgSetShuffleSeconds request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rvalidator.Tx.MsgSetShuffleSecondsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetShuffleSecondsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addRValidator(stafihub.stafihub.rvalidator.Tx.MsgAddRValidator request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rvalidator.Tx.MsgAddRValidatorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddRValidatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void rmRValidator(stafihub.stafihub.rvalidator.Tx.MsgRmRValidator request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rvalidator.Tx.MsgRmRValidatorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRmRValidatorMethod(), getCallOptions()), request, responseObserver);
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
    public stafihub.stafihub.rvalidator.Tx.MsgInitRValidatorResponse initRValidator(stafihub.stafihub.rvalidator.Tx.MsgInitRValidator request) {
      return blockingUnaryCall(
          getChannel(), getInitRValidatorMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.rvalidator.Tx.MsgSetCycleSecondsResponse setCycleSeconds(stafihub.stafihub.rvalidator.Tx.MsgSetCycleSeconds request) {
      return blockingUnaryCall(
          getChannel(), getSetCycleSecondsMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.rvalidator.Tx.MsgSetShuffleSecondsResponse setShuffleSeconds(stafihub.stafihub.rvalidator.Tx.MsgSetShuffleSeconds request) {
      return blockingUnaryCall(
          getChannel(), getSetShuffleSecondsMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.stafihub.rvalidator.Tx.MsgAddRValidatorResponse addRValidator(stafihub.stafihub.rvalidator.Tx.MsgAddRValidator request) {
      return blockingUnaryCall(
          getChannel(), getAddRValidatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public stafihub.stafihub.rvalidator.Tx.MsgRmRValidatorResponse rmRValidator(stafihub.stafihub.rvalidator.Tx.MsgRmRValidator request) {
      return blockingUnaryCall(
          getChannel(), getRmRValidatorMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rvalidator.Tx.MsgInitRValidatorResponse> initRValidator(
        stafihub.stafihub.rvalidator.Tx.MsgInitRValidator request) {
      return futureUnaryCall(
          getChannel().newCall(getInitRValidatorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rvalidator.Tx.MsgSetCycleSecondsResponse> setCycleSeconds(
        stafihub.stafihub.rvalidator.Tx.MsgSetCycleSeconds request) {
      return futureUnaryCall(
          getChannel().newCall(getSetCycleSecondsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rvalidator.Tx.MsgSetShuffleSecondsResponse> setShuffleSeconds(
        stafihub.stafihub.rvalidator.Tx.MsgSetShuffleSeconds request) {
      return futureUnaryCall(
          getChannel().newCall(getSetShuffleSecondsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rvalidator.Tx.MsgAddRValidatorResponse> addRValidator(
        stafihub.stafihub.rvalidator.Tx.MsgAddRValidator request) {
      return futureUnaryCall(
          getChannel().newCall(getAddRValidatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rvalidator.Tx.MsgRmRValidatorResponse> rmRValidator(
        stafihub.stafihub.rvalidator.Tx.MsgRmRValidator request) {
      return futureUnaryCall(
          getChannel().newCall(getRmRValidatorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INIT_RVALIDATOR = 0;
  private static final int METHODID_SET_CYCLE_SECONDS = 1;
  private static final int METHODID_SET_SHUFFLE_SECONDS = 2;
  private static final int METHODID_ADD_RVALIDATOR = 3;
  private static final int METHODID_RM_RVALIDATOR = 4;

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
        case METHODID_INIT_RVALIDATOR:
          serviceImpl.initRValidator((stafihub.stafihub.rvalidator.Tx.MsgInitRValidator) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rvalidator.Tx.MsgInitRValidatorResponse>) responseObserver);
          break;
        case METHODID_SET_CYCLE_SECONDS:
          serviceImpl.setCycleSeconds((stafihub.stafihub.rvalidator.Tx.MsgSetCycleSeconds) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rvalidator.Tx.MsgSetCycleSecondsResponse>) responseObserver);
          break;
        case METHODID_SET_SHUFFLE_SECONDS:
          serviceImpl.setShuffleSeconds((stafihub.stafihub.rvalidator.Tx.MsgSetShuffleSeconds) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rvalidator.Tx.MsgSetShuffleSecondsResponse>) responseObserver);
          break;
        case METHODID_ADD_RVALIDATOR:
          serviceImpl.addRValidator((stafihub.stafihub.rvalidator.Tx.MsgAddRValidator) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rvalidator.Tx.MsgAddRValidatorResponse>) responseObserver);
          break;
        case METHODID_RM_RVALIDATOR:
          serviceImpl.rmRValidator((stafihub.stafihub.rvalidator.Tx.MsgRmRValidator) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rvalidator.Tx.MsgRmRValidatorResponse>) responseObserver);
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
      return stafihub.stafihub.rvalidator.Tx.getDescriptor();
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
              .addMethod(getInitRValidatorMethod())
              .addMethod(getSetCycleSecondsMethod())
              .addMethod(getSetShuffleSecondsMethod())
              .addMethod(getAddRValidatorMethod())
              .addMethod(getRmRValidatorMethod())
              .build();
        }
      }
    }
    return result;
  }
}
