package stafihub.rstaking;

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
    comments = "Source: stafihub/rstaking/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "stafihub.stafihub.rstaking.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<stafihub.rstaking.Tx.MsgSetInflationBase,
      stafihub.rstaking.Tx.MsgSetInflationBaseResponse> getSetInflationBaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetInflationBase",
      requestType = stafihub.rstaking.Tx.MsgSetInflationBase.class,
      responseType = stafihub.rstaking.Tx.MsgSetInflationBaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.rstaking.Tx.MsgSetInflationBase,
      stafihub.rstaking.Tx.MsgSetInflationBaseResponse> getSetInflationBaseMethod() {
    io.grpc.MethodDescriptor<stafihub.rstaking.Tx.MsgSetInflationBase, stafihub.rstaking.Tx.MsgSetInflationBaseResponse> getSetInflationBaseMethod;
    if ((getSetInflationBaseMethod = MsgGrpc.getSetInflationBaseMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetInflationBaseMethod = MsgGrpc.getSetInflationBaseMethod) == null) {
          MsgGrpc.getSetInflationBaseMethod = getSetInflationBaseMethod =
              io.grpc.MethodDescriptor.<stafihub.rstaking.Tx.MsgSetInflationBase, stafihub.rstaking.Tx.MsgSetInflationBaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetInflationBase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.rstaking.Tx.MsgSetInflationBase.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.rstaking.Tx.MsgSetInflationBaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetInflationBase"))
              .build();
        }
      }
    }
    return getSetInflationBaseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.rstaking.Tx.MsgAddValToWhitelist,
      stafihub.rstaking.Tx.MsgAddValToWhitelistResponse> getAddValToWhitelistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddValToWhitelist",
      requestType = stafihub.rstaking.Tx.MsgAddValToWhitelist.class,
      responseType = stafihub.rstaking.Tx.MsgAddValToWhitelistResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.rstaking.Tx.MsgAddValToWhitelist,
      stafihub.rstaking.Tx.MsgAddValToWhitelistResponse> getAddValToWhitelistMethod() {
    io.grpc.MethodDescriptor<stafihub.rstaking.Tx.MsgAddValToWhitelist, stafihub.rstaking.Tx.MsgAddValToWhitelistResponse> getAddValToWhitelistMethod;
    if ((getAddValToWhitelistMethod = MsgGrpc.getAddValToWhitelistMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddValToWhitelistMethod = MsgGrpc.getAddValToWhitelistMethod) == null) {
          MsgGrpc.getAddValToWhitelistMethod = getAddValToWhitelistMethod =
              io.grpc.MethodDescriptor.<stafihub.rstaking.Tx.MsgAddValToWhitelist, stafihub.rstaking.Tx.MsgAddValToWhitelistResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddValToWhitelist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.rstaking.Tx.MsgAddValToWhitelist.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.rstaking.Tx.MsgAddValToWhitelistResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddValToWhitelist"))
              .build();
        }
      }
    }
    return getAddValToWhitelistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.rstaking.Tx.MsgToggleValidatorWhitelistSwitch,
      stafihub.rstaking.Tx.MsgToggleValidatorWhitelistSwitchResponse> getToggleValidatorWhitelistSwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ToggleValidatorWhitelistSwitch",
      requestType = stafihub.rstaking.Tx.MsgToggleValidatorWhitelistSwitch.class,
      responseType = stafihub.rstaking.Tx.MsgToggleValidatorWhitelistSwitchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.rstaking.Tx.MsgToggleValidatorWhitelistSwitch,
      stafihub.rstaking.Tx.MsgToggleValidatorWhitelistSwitchResponse> getToggleValidatorWhitelistSwitchMethod() {
    io.grpc.MethodDescriptor<stafihub.rstaking.Tx.MsgToggleValidatorWhitelistSwitch, stafihub.rstaking.Tx.MsgToggleValidatorWhitelistSwitchResponse> getToggleValidatorWhitelistSwitchMethod;
    if ((getToggleValidatorWhitelistSwitchMethod = MsgGrpc.getToggleValidatorWhitelistSwitchMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getToggleValidatorWhitelistSwitchMethod = MsgGrpc.getToggleValidatorWhitelistSwitchMethod) == null) {
          MsgGrpc.getToggleValidatorWhitelistSwitchMethod = getToggleValidatorWhitelistSwitchMethod =
              io.grpc.MethodDescriptor.<stafihub.rstaking.Tx.MsgToggleValidatorWhitelistSwitch, stafihub.rstaking.Tx.MsgToggleValidatorWhitelistSwitchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ToggleValidatorWhitelistSwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.rstaking.Tx.MsgToggleValidatorWhitelistSwitch.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.rstaking.Tx.MsgToggleValidatorWhitelistSwitchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ToggleValidatorWhitelistSwitch"))
              .build();
        }
      }
    }
    return getToggleValidatorWhitelistSwitchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.rstaking.Tx.MsgWithdraw,
      stafihub.rstaking.Tx.MsgWithdrawResponse> getWithdrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Withdraw",
      requestType = stafihub.rstaking.Tx.MsgWithdraw.class,
      responseType = stafihub.rstaking.Tx.MsgWithdrawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.rstaking.Tx.MsgWithdraw,
      stafihub.rstaking.Tx.MsgWithdrawResponse> getWithdrawMethod() {
    io.grpc.MethodDescriptor<stafihub.rstaking.Tx.MsgWithdraw, stafihub.rstaking.Tx.MsgWithdrawResponse> getWithdrawMethod;
    if ((getWithdrawMethod = MsgGrpc.getWithdrawMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawMethod = MsgGrpc.getWithdrawMethod) == null) {
          MsgGrpc.getWithdrawMethod = getWithdrawMethod =
              io.grpc.MethodDescriptor.<stafihub.rstaking.Tx.MsgWithdraw, stafihub.rstaking.Tx.MsgWithdrawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Withdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.rstaking.Tx.MsgWithdraw.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.rstaking.Tx.MsgWithdrawResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Withdraw"))
              .build();
        }
      }
    }
    return getWithdrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.rstaking.Tx.MsgAddDelegatorToWhitelist,
      stafihub.rstaking.Tx.MsgAddDelegatorToWhitelistResponse> getAddDelegatorToWhitelistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddDelegatorToWhitelist",
      requestType = stafihub.rstaking.Tx.MsgAddDelegatorToWhitelist.class,
      responseType = stafihub.rstaking.Tx.MsgAddDelegatorToWhitelistResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.rstaking.Tx.MsgAddDelegatorToWhitelist,
      stafihub.rstaking.Tx.MsgAddDelegatorToWhitelistResponse> getAddDelegatorToWhitelistMethod() {
    io.grpc.MethodDescriptor<stafihub.rstaking.Tx.MsgAddDelegatorToWhitelist, stafihub.rstaking.Tx.MsgAddDelegatorToWhitelistResponse> getAddDelegatorToWhitelistMethod;
    if ((getAddDelegatorToWhitelistMethod = MsgGrpc.getAddDelegatorToWhitelistMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddDelegatorToWhitelistMethod = MsgGrpc.getAddDelegatorToWhitelistMethod) == null) {
          MsgGrpc.getAddDelegatorToWhitelistMethod = getAddDelegatorToWhitelistMethod =
              io.grpc.MethodDescriptor.<stafihub.rstaking.Tx.MsgAddDelegatorToWhitelist, stafihub.rstaking.Tx.MsgAddDelegatorToWhitelistResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddDelegatorToWhitelist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.rstaking.Tx.MsgAddDelegatorToWhitelist.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.rstaking.Tx.MsgAddDelegatorToWhitelistResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddDelegatorToWhitelist"))
              .build();
        }
      }
    }
    return getAddDelegatorToWhitelistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.rstaking.Tx.MsgToggleDelegatorWhitelistSwitch,
      stafihub.rstaking.Tx.MsgToggleDelegatorWhitelistSwitchResponse> getToggleDelegatorWhitelistSwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ToggleDelegatorWhitelistSwitch",
      requestType = stafihub.rstaking.Tx.MsgToggleDelegatorWhitelistSwitch.class,
      responseType = stafihub.rstaking.Tx.MsgToggleDelegatorWhitelistSwitchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.rstaking.Tx.MsgToggleDelegatorWhitelistSwitch,
      stafihub.rstaking.Tx.MsgToggleDelegatorWhitelistSwitchResponse> getToggleDelegatorWhitelistSwitchMethod() {
    io.grpc.MethodDescriptor<stafihub.rstaking.Tx.MsgToggleDelegatorWhitelistSwitch, stafihub.rstaking.Tx.MsgToggleDelegatorWhitelistSwitchResponse> getToggleDelegatorWhitelistSwitchMethod;
    if ((getToggleDelegatorWhitelistSwitchMethod = MsgGrpc.getToggleDelegatorWhitelistSwitchMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getToggleDelegatorWhitelistSwitchMethod = MsgGrpc.getToggleDelegatorWhitelistSwitchMethod) == null) {
          MsgGrpc.getToggleDelegatorWhitelistSwitchMethod = getToggleDelegatorWhitelistSwitchMethod =
              io.grpc.MethodDescriptor.<stafihub.rstaking.Tx.MsgToggleDelegatorWhitelistSwitch, stafihub.rstaking.Tx.MsgToggleDelegatorWhitelistSwitchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ToggleDelegatorWhitelistSwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.rstaking.Tx.MsgToggleDelegatorWhitelistSwitch.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.rstaking.Tx.MsgToggleDelegatorWhitelistSwitchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ToggleDelegatorWhitelistSwitch"))
              .build();
        }
      }
    }
    return getToggleDelegatorWhitelistSwitchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.rstaking.Tx.MsgProvideToken,
      stafihub.rstaking.Tx.MsgProvideTokenResponse> getProvideTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProvideToken",
      requestType = stafihub.rstaking.Tx.MsgProvideToken.class,
      responseType = stafihub.rstaking.Tx.MsgProvideTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.rstaking.Tx.MsgProvideToken,
      stafihub.rstaking.Tx.MsgProvideTokenResponse> getProvideTokenMethod() {
    io.grpc.MethodDescriptor<stafihub.rstaking.Tx.MsgProvideToken, stafihub.rstaking.Tx.MsgProvideTokenResponse> getProvideTokenMethod;
    if ((getProvideTokenMethod = MsgGrpc.getProvideTokenMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getProvideTokenMethod = MsgGrpc.getProvideTokenMethod) == null) {
          MsgGrpc.getProvideTokenMethod = getProvideTokenMethod =
              io.grpc.MethodDescriptor.<stafihub.rstaking.Tx.MsgProvideToken, stafihub.rstaking.Tx.MsgProvideTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProvideToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.rstaking.Tx.MsgProvideToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.rstaking.Tx.MsgProvideTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ProvideToken"))
              .build();
        }
      }
    }
    return getProvideTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.rstaking.Tx.MsgRmDelegatorFromWhitelist,
      stafihub.rstaking.Tx.MsgRmDelegatorFromWhitelistResponse> getRmDelegatorFromWhitelistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RmDelegatorFromWhitelist",
      requestType = stafihub.rstaking.Tx.MsgRmDelegatorFromWhitelist.class,
      responseType = stafihub.rstaking.Tx.MsgRmDelegatorFromWhitelistResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.rstaking.Tx.MsgRmDelegatorFromWhitelist,
      stafihub.rstaking.Tx.MsgRmDelegatorFromWhitelistResponse> getRmDelegatorFromWhitelistMethod() {
    io.grpc.MethodDescriptor<stafihub.rstaking.Tx.MsgRmDelegatorFromWhitelist, stafihub.rstaking.Tx.MsgRmDelegatorFromWhitelistResponse> getRmDelegatorFromWhitelistMethod;
    if ((getRmDelegatorFromWhitelistMethod = MsgGrpc.getRmDelegatorFromWhitelistMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRmDelegatorFromWhitelistMethod = MsgGrpc.getRmDelegatorFromWhitelistMethod) == null) {
          MsgGrpc.getRmDelegatorFromWhitelistMethod = getRmDelegatorFromWhitelistMethod =
              io.grpc.MethodDescriptor.<stafihub.rstaking.Tx.MsgRmDelegatorFromWhitelist, stafihub.rstaking.Tx.MsgRmDelegatorFromWhitelistResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RmDelegatorFromWhitelist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.rstaking.Tx.MsgRmDelegatorFromWhitelist.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.rstaking.Tx.MsgRmDelegatorFromWhitelistResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RmDelegatorFromWhitelist"))
              .build();
        }
      }
    }
    return getRmDelegatorFromWhitelistMethod;
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
    public void setInflationBase(stafihub.rstaking.Tx.MsgSetInflationBase request,
        io.grpc.stub.StreamObserver<stafihub.rstaking.Tx.MsgSetInflationBaseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetInflationBaseMethod(), responseObserver);
    }

    /**
     */
    public void addValToWhitelist(stafihub.rstaking.Tx.MsgAddValToWhitelist request,
        io.grpc.stub.StreamObserver<stafihub.rstaking.Tx.MsgAddValToWhitelistResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddValToWhitelistMethod(), responseObserver);
    }

    /**
     */
    public void toggleValidatorWhitelistSwitch(stafihub.rstaking.Tx.MsgToggleValidatorWhitelistSwitch request,
        io.grpc.stub.StreamObserver<stafihub.rstaking.Tx.MsgToggleValidatorWhitelistSwitchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getToggleValidatorWhitelistSwitchMethod(), responseObserver);
    }

    /**
     */
    public void withdraw(stafihub.rstaking.Tx.MsgWithdraw request,
        io.grpc.stub.StreamObserver<stafihub.rstaking.Tx.MsgWithdrawResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWithdrawMethod(), responseObserver);
    }

    /**
     */
    public void addDelegatorToWhitelist(stafihub.rstaking.Tx.MsgAddDelegatorToWhitelist request,
        io.grpc.stub.StreamObserver<stafihub.rstaking.Tx.MsgAddDelegatorToWhitelistResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddDelegatorToWhitelistMethod(), responseObserver);
    }

    /**
     */
    public void toggleDelegatorWhitelistSwitch(stafihub.rstaking.Tx.MsgToggleDelegatorWhitelistSwitch request,
        io.grpc.stub.StreamObserver<stafihub.rstaking.Tx.MsgToggleDelegatorWhitelistSwitchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getToggleDelegatorWhitelistSwitchMethod(), responseObserver);
    }

    /**
     */
    public void provideToken(stafihub.rstaking.Tx.MsgProvideToken request,
        io.grpc.stub.StreamObserver<stafihub.rstaking.Tx.MsgProvideTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getProvideTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void rmDelegatorFromWhitelist(stafihub.rstaking.Tx.MsgRmDelegatorFromWhitelist request,
        io.grpc.stub.StreamObserver<stafihub.rstaking.Tx.MsgRmDelegatorFromWhitelistResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRmDelegatorFromWhitelistMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSetInflationBaseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.rstaking.Tx.MsgSetInflationBase,
                stafihub.rstaking.Tx.MsgSetInflationBaseResponse>(
                  this, METHODID_SET_INFLATION_BASE)))
          .addMethod(
            getAddValToWhitelistMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.rstaking.Tx.MsgAddValToWhitelist,
                stafihub.rstaking.Tx.MsgAddValToWhitelistResponse>(
                  this, METHODID_ADD_VAL_TO_WHITELIST)))
          .addMethod(
            getToggleValidatorWhitelistSwitchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.rstaking.Tx.MsgToggleValidatorWhitelistSwitch,
                stafihub.rstaking.Tx.MsgToggleValidatorWhitelistSwitchResponse>(
                  this, METHODID_TOGGLE_VALIDATOR_WHITELIST_SWITCH)))
          .addMethod(
            getWithdrawMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.rstaking.Tx.MsgWithdraw,
                stafihub.rstaking.Tx.MsgWithdrawResponse>(
                  this, METHODID_WITHDRAW)))
          .addMethod(
            getAddDelegatorToWhitelistMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.rstaking.Tx.MsgAddDelegatorToWhitelist,
                stafihub.rstaking.Tx.MsgAddDelegatorToWhitelistResponse>(
                  this, METHODID_ADD_DELEGATOR_TO_WHITELIST)))
          .addMethod(
            getToggleDelegatorWhitelistSwitchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.rstaking.Tx.MsgToggleDelegatorWhitelistSwitch,
                stafihub.rstaking.Tx.MsgToggleDelegatorWhitelistSwitchResponse>(
                  this, METHODID_TOGGLE_DELEGATOR_WHITELIST_SWITCH)))
          .addMethod(
            getProvideTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.rstaking.Tx.MsgProvideToken,
                stafihub.rstaking.Tx.MsgProvideTokenResponse>(
                  this, METHODID_PROVIDE_TOKEN)))
          .addMethod(
            getRmDelegatorFromWhitelistMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.rstaking.Tx.MsgRmDelegatorFromWhitelist,
                stafihub.rstaking.Tx.MsgRmDelegatorFromWhitelistResponse>(
                  this, METHODID_RM_DELEGATOR_FROM_WHITELIST)))
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
    public void setInflationBase(stafihub.rstaking.Tx.MsgSetInflationBase request,
        io.grpc.stub.StreamObserver<stafihub.rstaking.Tx.MsgSetInflationBaseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetInflationBaseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addValToWhitelist(stafihub.rstaking.Tx.MsgAddValToWhitelist request,
        io.grpc.stub.StreamObserver<stafihub.rstaking.Tx.MsgAddValToWhitelistResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddValToWhitelistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void toggleValidatorWhitelistSwitch(stafihub.rstaking.Tx.MsgToggleValidatorWhitelistSwitch request,
        io.grpc.stub.StreamObserver<stafihub.rstaking.Tx.MsgToggleValidatorWhitelistSwitchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getToggleValidatorWhitelistSwitchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void withdraw(stafihub.rstaking.Tx.MsgWithdraw request,
        io.grpc.stub.StreamObserver<stafihub.rstaking.Tx.MsgWithdrawResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addDelegatorToWhitelist(stafihub.rstaking.Tx.MsgAddDelegatorToWhitelist request,
        io.grpc.stub.StreamObserver<stafihub.rstaking.Tx.MsgAddDelegatorToWhitelistResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddDelegatorToWhitelistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void toggleDelegatorWhitelistSwitch(stafihub.rstaking.Tx.MsgToggleDelegatorWhitelistSwitch request,
        io.grpc.stub.StreamObserver<stafihub.rstaking.Tx.MsgToggleDelegatorWhitelistSwitchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getToggleDelegatorWhitelistSwitchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void provideToken(stafihub.rstaking.Tx.MsgProvideToken request,
        io.grpc.stub.StreamObserver<stafihub.rstaking.Tx.MsgProvideTokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProvideTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void rmDelegatorFromWhitelist(stafihub.rstaking.Tx.MsgRmDelegatorFromWhitelist request,
        io.grpc.stub.StreamObserver<stafihub.rstaking.Tx.MsgRmDelegatorFromWhitelistResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRmDelegatorFromWhitelistMethod(), getCallOptions()), request, responseObserver);
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
    public stafihub.rstaking.Tx.MsgSetInflationBaseResponse setInflationBase(stafihub.rstaking.Tx.MsgSetInflationBase request) {
      return blockingUnaryCall(
          getChannel(), getSetInflationBaseMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.rstaking.Tx.MsgAddValToWhitelistResponse addValToWhitelist(stafihub.rstaking.Tx.MsgAddValToWhitelist request) {
      return blockingUnaryCall(
          getChannel(), getAddValToWhitelistMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.rstaking.Tx.MsgToggleValidatorWhitelistSwitchResponse toggleValidatorWhitelistSwitch(stafihub.rstaking.Tx.MsgToggleValidatorWhitelistSwitch request) {
      return blockingUnaryCall(
          getChannel(), getToggleValidatorWhitelistSwitchMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.rstaking.Tx.MsgWithdrawResponse withdraw(stafihub.rstaking.Tx.MsgWithdraw request) {
      return blockingUnaryCall(
          getChannel(), getWithdrawMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.rstaking.Tx.MsgAddDelegatorToWhitelistResponse addDelegatorToWhitelist(stafihub.rstaking.Tx.MsgAddDelegatorToWhitelist request) {
      return blockingUnaryCall(
          getChannel(), getAddDelegatorToWhitelistMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.rstaking.Tx.MsgToggleDelegatorWhitelistSwitchResponse toggleDelegatorWhitelistSwitch(stafihub.rstaking.Tx.MsgToggleDelegatorWhitelistSwitch request) {
      return blockingUnaryCall(
          getChannel(), getToggleDelegatorWhitelistSwitchMethod(), getCallOptions(), request);
    }

    /**
     */
    public stafihub.rstaking.Tx.MsgProvideTokenResponse provideToken(stafihub.rstaking.Tx.MsgProvideToken request) {
      return blockingUnaryCall(
          getChannel(), getProvideTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public stafihub.rstaking.Tx.MsgRmDelegatorFromWhitelistResponse rmDelegatorFromWhitelist(stafihub.rstaking.Tx.MsgRmDelegatorFromWhitelist request) {
      return blockingUnaryCall(
          getChannel(), getRmDelegatorFromWhitelistMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<stafihub.rstaking.Tx.MsgSetInflationBaseResponse> setInflationBase(
        stafihub.rstaking.Tx.MsgSetInflationBase request) {
      return futureUnaryCall(
          getChannel().newCall(getSetInflationBaseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.rstaking.Tx.MsgAddValToWhitelistResponse> addValToWhitelist(
        stafihub.rstaking.Tx.MsgAddValToWhitelist request) {
      return futureUnaryCall(
          getChannel().newCall(getAddValToWhitelistMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.rstaking.Tx.MsgToggleValidatorWhitelistSwitchResponse> toggleValidatorWhitelistSwitch(
        stafihub.rstaking.Tx.MsgToggleValidatorWhitelistSwitch request) {
      return futureUnaryCall(
          getChannel().newCall(getToggleValidatorWhitelistSwitchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.rstaking.Tx.MsgWithdrawResponse> withdraw(
        stafihub.rstaking.Tx.MsgWithdraw request) {
      return futureUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.rstaking.Tx.MsgAddDelegatorToWhitelistResponse> addDelegatorToWhitelist(
        stafihub.rstaking.Tx.MsgAddDelegatorToWhitelist request) {
      return futureUnaryCall(
          getChannel().newCall(getAddDelegatorToWhitelistMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.rstaking.Tx.MsgToggleDelegatorWhitelistSwitchResponse> toggleDelegatorWhitelistSwitch(
        stafihub.rstaking.Tx.MsgToggleDelegatorWhitelistSwitch request) {
      return futureUnaryCall(
          getChannel().newCall(getToggleDelegatorWhitelistSwitchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.rstaking.Tx.MsgProvideTokenResponse> provideToken(
        stafihub.rstaking.Tx.MsgProvideToken request) {
      return futureUnaryCall(
          getChannel().newCall(getProvideTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.rstaking.Tx.MsgRmDelegatorFromWhitelistResponse> rmDelegatorFromWhitelist(
        stafihub.rstaking.Tx.MsgRmDelegatorFromWhitelist request) {
      return futureUnaryCall(
          getChannel().newCall(getRmDelegatorFromWhitelistMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_INFLATION_BASE = 0;
  private static final int METHODID_ADD_VAL_TO_WHITELIST = 1;
  private static final int METHODID_TOGGLE_VALIDATOR_WHITELIST_SWITCH = 2;
  private static final int METHODID_WITHDRAW = 3;
  private static final int METHODID_ADD_DELEGATOR_TO_WHITELIST = 4;
  private static final int METHODID_TOGGLE_DELEGATOR_WHITELIST_SWITCH = 5;
  private static final int METHODID_PROVIDE_TOKEN = 6;
  private static final int METHODID_RM_DELEGATOR_FROM_WHITELIST = 7;

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
        case METHODID_SET_INFLATION_BASE:
          serviceImpl.setInflationBase((stafihub.rstaking.Tx.MsgSetInflationBase) request,
              (io.grpc.stub.StreamObserver<stafihub.rstaking.Tx.MsgSetInflationBaseResponse>) responseObserver);
          break;
        case METHODID_ADD_VAL_TO_WHITELIST:
          serviceImpl.addValToWhitelist((stafihub.rstaking.Tx.MsgAddValToWhitelist) request,
              (io.grpc.stub.StreamObserver<stafihub.rstaking.Tx.MsgAddValToWhitelistResponse>) responseObserver);
          break;
        case METHODID_TOGGLE_VALIDATOR_WHITELIST_SWITCH:
          serviceImpl.toggleValidatorWhitelistSwitch((stafihub.rstaking.Tx.MsgToggleValidatorWhitelistSwitch) request,
              (io.grpc.stub.StreamObserver<stafihub.rstaking.Tx.MsgToggleValidatorWhitelistSwitchResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW:
          serviceImpl.withdraw((stafihub.rstaking.Tx.MsgWithdraw) request,
              (io.grpc.stub.StreamObserver<stafihub.rstaking.Tx.MsgWithdrawResponse>) responseObserver);
          break;
        case METHODID_ADD_DELEGATOR_TO_WHITELIST:
          serviceImpl.addDelegatorToWhitelist((stafihub.rstaking.Tx.MsgAddDelegatorToWhitelist) request,
              (io.grpc.stub.StreamObserver<stafihub.rstaking.Tx.MsgAddDelegatorToWhitelistResponse>) responseObserver);
          break;
        case METHODID_TOGGLE_DELEGATOR_WHITELIST_SWITCH:
          serviceImpl.toggleDelegatorWhitelistSwitch((stafihub.rstaking.Tx.MsgToggleDelegatorWhitelistSwitch) request,
              (io.grpc.stub.StreamObserver<stafihub.rstaking.Tx.MsgToggleDelegatorWhitelistSwitchResponse>) responseObserver);
          break;
        case METHODID_PROVIDE_TOKEN:
          serviceImpl.provideToken((stafihub.rstaking.Tx.MsgProvideToken) request,
              (io.grpc.stub.StreamObserver<stafihub.rstaking.Tx.MsgProvideTokenResponse>) responseObserver);
          break;
        case METHODID_RM_DELEGATOR_FROM_WHITELIST:
          serviceImpl.rmDelegatorFromWhitelist((stafihub.rstaking.Tx.MsgRmDelegatorFromWhitelist) request,
              (io.grpc.stub.StreamObserver<stafihub.rstaking.Tx.MsgRmDelegatorFromWhitelistResponse>) responseObserver);
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
      return stafihub.rstaking.Tx.getDescriptor();
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
              .addMethod(getSetInflationBaseMethod())
              .addMethod(getAddValToWhitelistMethod())
              .addMethod(getToggleValidatorWhitelistSwitchMethod())
              .addMethod(getWithdrawMethod())
              .addMethod(getAddDelegatorToWhitelistMethod())
              .addMethod(getToggleDelegatorWhitelistSwitchMethod())
              .addMethod(getProvideTokenMethod())
              .addMethod(getRmDelegatorFromWhitelistMethod())
              .build();
        }
      }
    }
    return result;
  }
}
