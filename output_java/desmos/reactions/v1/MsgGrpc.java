package desmos.reactions.v1;

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
 * Msg defines the reactions Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: desmos/reactions/v1/msgs.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "desmos.reactions.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<desmos.reactions.v1.Msgs.MsgAddReaction,
      desmos.reactions.v1.Msgs.MsgAddReactionResponse> getAddReactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddReaction",
      requestType = desmos.reactions.v1.Msgs.MsgAddReaction.class,
      responseType = desmos.reactions.v1.Msgs.MsgAddReactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.reactions.v1.Msgs.MsgAddReaction,
      desmos.reactions.v1.Msgs.MsgAddReactionResponse> getAddReactionMethod() {
    io.grpc.MethodDescriptor<desmos.reactions.v1.Msgs.MsgAddReaction, desmos.reactions.v1.Msgs.MsgAddReactionResponse> getAddReactionMethod;
    if ((getAddReactionMethod = MsgGrpc.getAddReactionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddReactionMethod = MsgGrpc.getAddReactionMethod) == null) {
          MsgGrpc.getAddReactionMethod = getAddReactionMethod =
              io.grpc.MethodDescriptor.<desmos.reactions.v1.Msgs.MsgAddReaction, desmos.reactions.v1.Msgs.MsgAddReactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddReaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reactions.v1.Msgs.MsgAddReaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reactions.v1.Msgs.MsgAddReactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddReaction"))
              .build();
        }
      }
    }
    return getAddReactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.reactions.v1.Msgs.MsgRemoveReaction,
      desmos.reactions.v1.Msgs.MsgRemoveReactionResponse> getRemoveReactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveReaction",
      requestType = desmos.reactions.v1.Msgs.MsgRemoveReaction.class,
      responseType = desmos.reactions.v1.Msgs.MsgRemoveReactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.reactions.v1.Msgs.MsgRemoveReaction,
      desmos.reactions.v1.Msgs.MsgRemoveReactionResponse> getRemoveReactionMethod() {
    io.grpc.MethodDescriptor<desmos.reactions.v1.Msgs.MsgRemoveReaction, desmos.reactions.v1.Msgs.MsgRemoveReactionResponse> getRemoveReactionMethod;
    if ((getRemoveReactionMethod = MsgGrpc.getRemoveReactionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemoveReactionMethod = MsgGrpc.getRemoveReactionMethod) == null) {
          MsgGrpc.getRemoveReactionMethod = getRemoveReactionMethod =
              io.grpc.MethodDescriptor.<desmos.reactions.v1.Msgs.MsgRemoveReaction, desmos.reactions.v1.Msgs.MsgRemoveReactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveReaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reactions.v1.Msgs.MsgRemoveReaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reactions.v1.Msgs.MsgRemoveReactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemoveReaction"))
              .build();
        }
      }
    }
    return getRemoveReactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.reactions.v1.Msgs.MsgAddRegisteredReaction,
      desmos.reactions.v1.Msgs.MsgAddRegisteredReactionResponse> getAddRegisteredReactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddRegisteredReaction",
      requestType = desmos.reactions.v1.Msgs.MsgAddRegisteredReaction.class,
      responseType = desmos.reactions.v1.Msgs.MsgAddRegisteredReactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.reactions.v1.Msgs.MsgAddRegisteredReaction,
      desmos.reactions.v1.Msgs.MsgAddRegisteredReactionResponse> getAddRegisteredReactionMethod() {
    io.grpc.MethodDescriptor<desmos.reactions.v1.Msgs.MsgAddRegisteredReaction, desmos.reactions.v1.Msgs.MsgAddRegisteredReactionResponse> getAddRegisteredReactionMethod;
    if ((getAddRegisteredReactionMethod = MsgGrpc.getAddRegisteredReactionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddRegisteredReactionMethod = MsgGrpc.getAddRegisteredReactionMethod) == null) {
          MsgGrpc.getAddRegisteredReactionMethod = getAddRegisteredReactionMethod =
              io.grpc.MethodDescriptor.<desmos.reactions.v1.Msgs.MsgAddRegisteredReaction, desmos.reactions.v1.Msgs.MsgAddRegisteredReactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddRegisteredReaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reactions.v1.Msgs.MsgAddRegisteredReaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reactions.v1.Msgs.MsgAddRegisteredReactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddRegisteredReaction"))
              .build();
        }
      }
    }
    return getAddRegisteredReactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.reactions.v1.Msgs.MsgEditRegisteredReaction,
      desmos.reactions.v1.Msgs.MsgEditRegisteredReactionResponse> getEditRegisteredReactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditRegisteredReaction",
      requestType = desmos.reactions.v1.Msgs.MsgEditRegisteredReaction.class,
      responseType = desmos.reactions.v1.Msgs.MsgEditRegisteredReactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.reactions.v1.Msgs.MsgEditRegisteredReaction,
      desmos.reactions.v1.Msgs.MsgEditRegisteredReactionResponse> getEditRegisteredReactionMethod() {
    io.grpc.MethodDescriptor<desmos.reactions.v1.Msgs.MsgEditRegisteredReaction, desmos.reactions.v1.Msgs.MsgEditRegisteredReactionResponse> getEditRegisteredReactionMethod;
    if ((getEditRegisteredReactionMethod = MsgGrpc.getEditRegisteredReactionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getEditRegisteredReactionMethod = MsgGrpc.getEditRegisteredReactionMethod) == null) {
          MsgGrpc.getEditRegisteredReactionMethod = getEditRegisteredReactionMethod =
              io.grpc.MethodDescriptor.<desmos.reactions.v1.Msgs.MsgEditRegisteredReaction, desmos.reactions.v1.Msgs.MsgEditRegisteredReactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditRegisteredReaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reactions.v1.Msgs.MsgEditRegisteredReaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reactions.v1.Msgs.MsgEditRegisteredReactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("EditRegisteredReaction"))
              .build();
        }
      }
    }
    return getEditRegisteredReactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.reactions.v1.Msgs.MsgRemoveRegisteredReaction,
      desmos.reactions.v1.Msgs.MsgRemoveRegisteredReactionResponse> getRemoveRegisteredReactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveRegisteredReaction",
      requestType = desmos.reactions.v1.Msgs.MsgRemoveRegisteredReaction.class,
      responseType = desmos.reactions.v1.Msgs.MsgRemoveRegisteredReactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.reactions.v1.Msgs.MsgRemoveRegisteredReaction,
      desmos.reactions.v1.Msgs.MsgRemoveRegisteredReactionResponse> getRemoveRegisteredReactionMethod() {
    io.grpc.MethodDescriptor<desmos.reactions.v1.Msgs.MsgRemoveRegisteredReaction, desmos.reactions.v1.Msgs.MsgRemoveRegisteredReactionResponse> getRemoveRegisteredReactionMethod;
    if ((getRemoveRegisteredReactionMethod = MsgGrpc.getRemoveRegisteredReactionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemoveRegisteredReactionMethod = MsgGrpc.getRemoveRegisteredReactionMethod) == null) {
          MsgGrpc.getRemoveRegisteredReactionMethod = getRemoveRegisteredReactionMethod =
              io.grpc.MethodDescriptor.<desmos.reactions.v1.Msgs.MsgRemoveRegisteredReaction, desmos.reactions.v1.Msgs.MsgRemoveRegisteredReactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveRegisteredReaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reactions.v1.Msgs.MsgRemoveRegisteredReaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reactions.v1.Msgs.MsgRemoveRegisteredReactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemoveRegisteredReaction"))
              .build();
        }
      }
    }
    return getRemoveRegisteredReactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.reactions.v1.Msgs.MsgSetReactionsParams,
      desmos.reactions.v1.Msgs.MsgSetReactionsParamsResponse> getSetReactionsParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetReactionsParams",
      requestType = desmos.reactions.v1.Msgs.MsgSetReactionsParams.class,
      responseType = desmos.reactions.v1.Msgs.MsgSetReactionsParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.reactions.v1.Msgs.MsgSetReactionsParams,
      desmos.reactions.v1.Msgs.MsgSetReactionsParamsResponse> getSetReactionsParamsMethod() {
    io.grpc.MethodDescriptor<desmos.reactions.v1.Msgs.MsgSetReactionsParams, desmos.reactions.v1.Msgs.MsgSetReactionsParamsResponse> getSetReactionsParamsMethod;
    if ((getSetReactionsParamsMethod = MsgGrpc.getSetReactionsParamsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetReactionsParamsMethod = MsgGrpc.getSetReactionsParamsMethod) == null) {
          MsgGrpc.getSetReactionsParamsMethod = getSetReactionsParamsMethod =
              io.grpc.MethodDescriptor.<desmos.reactions.v1.Msgs.MsgSetReactionsParams, desmos.reactions.v1.Msgs.MsgSetReactionsParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetReactionsParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reactions.v1.Msgs.MsgSetReactionsParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reactions.v1.Msgs.MsgSetReactionsParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetReactionsParams"))
              .build();
        }
      }
    }
    return getSetReactionsParamsMethod;
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
   * Msg defines the reactions Msg service.
   * </pre>
   */
  public static abstract class MsgImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * AddReaction allows to add a post reaction
     * </pre>
     */
    public void addReaction(desmos.reactions.v1.Msgs.MsgAddReaction request,
        io.grpc.stub.StreamObserver<desmos.reactions.v1.Msgs.MsgAddReactionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddReactionMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveReaction allows to remove an existing post reaction
     * </pre>
     */
    public void removeReaction(desmos.reactions.v1.Msgs.MsgRemoveReaction request,
        io.grpc.stub.StreamObserver<desmos.reactions.v1.Msgs.MsgRemoveReactionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveReactionMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddRegisteredReaction allows to registered a new supported reaction
     * </pre>
     */
    public void addRegisteredReaction(desmos.reactions.v1.Msgs.MsgAddRegisteredReaction request,
        io.grpc.stub.StreamObserver<desmos.reactions.v1.Msgs.MsgAddRegisteredReactionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddRegisteredReactionMethod(), responseObserver);
    }

    /**
     * <pre>
     * EditRegisteredReaction allows to edit a registered reaction
     * </pre>
     */
    public void editRegisteredReaction(desmos.reactions.v1.Msgs.MsgEditRegisteredReaction request,
        io.grpc.stub.StreamObserver<desmos.reactions.v1.Msgs.MsgEditRegisteredReactionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEditRegisteredReactionMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveRegisteredReaction allows to remove an existing supported reaction
     * </pre>
     */
    public void removeRegisteredReaction(desmos.reactions.v1.Msgs.MsgRemoveRegisteredReaction request,
        io.grpc.stub.StreamObserver<desmos.reactions.v1.Msgs.MsgRemoveRegisteredReactionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveRegisteredReactionMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetReactionsParams allows to set the reactions params
     * </pre>
     */
    public void setReactionsParams(desmos.reactions.v1.Msgs.MsgSetReactionsParams request,
        io.grpc.stub.StreamObserver<desmos.reactions.v1.Msgs.MsgSetReactionsParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetReactionsParamsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddReactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.reactions.v1.Msgs.MsgAddReaction,
                desmos.reactions.v1.Msgs.MsgAddReactionResponse>(
                  this, METHODID_ADD_REACTION)))
          .addMethod(
            getRemoveReactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.reactions.v1.Msgs.MsgRemoveReaction,
                desmos.reactions.v1.Msgs.MsgRemoveReactionResponse>(
                  this, METHODID_REMOVE_REACTION)))
          .addMethod(
            getAddRegisteredReactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.reactions.v1.Msgs.MsgAddRegisteredReaction,
                desmos.reactions.v1.Msgs.MsgAddRegisteredReactionResponse>(
                  this, METHODID_ADD_REGISTERED_REACTION)))
          .addMethod(
            getEditRegisteredReactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.reactions.v1.Msgs.MsgEditRegisteredReaction,
                desmos.reactions.v1.Msgs.MsgEditRegisteredReactionResponse>(
                  this, METHODID_EDIT_REGISTERED_REACTION)))
          .addMethod(
            getRemoveRegisteredReactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.reactions.v1.Msgs.MsgRemoveRegisteredReaction,
                desmos.reactions.v1.Msgs.MsgRemoveRegisteredReactionResponse>(
                  this, METHODID_REMOVE_REGISTERED_REACTION)))
          .addMethod(
            getSetReactionsParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.reactions.v1.Msgs.MsgSetReactionsParams,
                desmos.reactions.v1.Msgs.MsgSetReactionsParamsResponse>(
                  this, METHODID_SET_REACTIONS_PARAMS)))
          .build();
    }
  }

  /**
   * <pre>
   * Msg defines the reactions Msg service.
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
     * AddReaction allows to add a post reaction
     * </pre>
     */
    public void addReaction(desmos.reactions.v1.Msgs.MsgAddReaction request,
        io.grpc.stub.StreamObserver<desmos.reactions.v1.Msgs.MsgAddReactionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddReactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveReaction allows to remove an existing post reaction
     * </pre>
     */
    public void removeReaction(desmos.reactions.v1.Msgs.MsgRemoveReaction request,
        io.grpc.stub.StreamObserver<desmos.reactions.v1.Msgs.MsgRemoveReactionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveReactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddRegisteredReaction allows to registered a new supported reaction
     * </pre>
     */
    public void addRegisteredReaction(desmos.reactions.v1.Msgs.MsgAddRegisteredReaction request,
        io.grpc.stub.StreamObserver<desmos.reactions.v1.Msgs.MsgAddRegisteredReactionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddRegisteredReactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EditRegisteredReaction allows to edit a registered reaction
     * </pre>
     */
    public void editRegisteredReaction(desmos.reactions.v1.Msgs.MsgEditRegisteredReaction request,
        io.grpc.stub.StreamObserver<desmos.reactions.v1.Msgs.MsgEditRegisteredReactionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEditRegisteredReactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveRegisteredReaction allows to remove an existing supported reaction
     * </pre>
     */
    public void removeRegisteredReaction(desmos.reactions.v1.Msgs.MsgRemoveRegisteredReaction request,
        io.grpc.stub.StreamObserver<desmos.reactions.v1.Msgs.MsgRemoveRegisteredReactionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveRegisteredReactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetReactionsParams allows to set the reactions params
     * </pre>
     */
    public void setReactionsParams(desmos.reactions.v1.Msgs.MsgSetReactionsParams request,
        io.grpc.stub.StreamObserver<desmos.reactions.v1.Msgs.MsgSetReactionsParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetReactionsParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Msg defines the reactions Msg service.
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
     * AddReaction allows to add a post reaction
     * </pre>
     */
    public desmos.reactions.v1.Msgs.MsgAddReactionResponse addReaction(desmos.reactions.v1.Msgs.MsgAddReaction request) {
      return blockingUnaryCall(
          getChannel(), getAddReactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveReaction allows to remove an existing post reaction
     * </pre>
     */
    public desmos.reactions.v1.Msgs.MsgRemoveReactionResponse removeReaction(desmos.reactions.v1.Msgs.MsgRemoveReaction request) {
      return blockingUnaryCall(
          getChannel(), getRemoveReactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddRegisteredReaction allows to registered a new supported reaction
     * </pre>
     */
    public desmos.reactions.v1.Msgs.MsgAddRegisteredReactionResponse addRegisteredReaction(desmos.reactions.v1.Msgs.MsgAddRegisteredReaction request) {
      return blockingUnaryCall(
          getChannel(), getAddRegisteredReactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EditRegisteredReaction allows to edit a registered reaction
     * </pre>
     */
    public desmos.reactions.v1.Msgs.MsgEditRegisteredReactionResponse editRegisteredReaction(desmos.reactions.v1.Msgs.MsgEditRegisteredReaction request) {
      return blockingUnaryCall(
          getChannel(), getEditRegisteredReactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveRegisteredReaction allows to remove an existing supported reaction
     * </pre>
     */
    public desmos.reactions.v1.Msgs.MsgRemoveRegisteredReactionResponse removeRegisteredReaction(desmos.reactions.v1.Msgs.MsgRemoveRegisteredReaction request) {
      return blockingUnaryCall(
          getChannel(), getRemoveRegisteredReactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetReactionsParams allows to set the reactions params
     * </pre>
     */
    public desmos.reactions.v1.Msgs.MsgSetReactionsParamsResponse setReactionsParams(desmos.reactions.v1.Msgs.MsgSetReactionsParams request) {
      return blockingUnaryCall(
          getChannel(), getSetReactionsParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Msg defines the reactions Msg service.
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
     * AddReaction allows to add a post reaction
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.reactions.v1.Msgs.MsgAddReactionResponse> addReaction(
        desmos.reactions.v1.Msgs.MsgAddReaction request) {
      return futureUnaryCall(
          getChannel().newCall(getAddReactionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveReaction allows to remove an existing post reaction
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.reactions.v1.Msgs.MsgRemoveReactionResponse> removeReaction(
        desmos.reactions.v1.Msgs.MsgRemoveReaction request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveReactionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddRegisteredReaction allows to registered a new supported reaction
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.reactions.v1.Msgs.MsgAddRegisteredReactionResponse> addRegisteredReaction(
        desmos.reactions.v1.Msgs.MsgAddRegisteredReaction request) {
      return futureUnaryCall(
          getChannel().newCall(getAddRegisteredReactionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EditRegisteredReaction allows to edit a registered reaction
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.reactions.v1.Msgs.MsgEditRegisteredReactionResponse> editRegisteredReaction(
        desmos.reactions.v1.Msgs.MsgEditRegisteredReaction request) {
      return futureUnaryCall(
          getChannel().newCall(getEditRegisteredReactionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveRegisteredReaction allows to remove an existing supported reaction
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.reactions.v1.Msgs.MsgRemoveRegisteredReactionResponse> removeRegisteredReaction(
        desmos.reactions.v1.Msgs.MsgRemoveRegisteredReaction request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveRegisteredReactionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetReactionsParams allows to set the reactions params
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.reactions.v1.Msgs.MsgSetReactionsParamsResponse> setReactionsParams(
        desmos.reactions.v1.Msgs.MsgSetReactionsParams request) {
      return futureUnaryCall(
          getChannel().newCall(getSetReactionsParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_REACTION = 0;
  private static final int METHODID_REMOVE_REACTION = 1;
  private static final int METHODID_ADD_REGISTERED_REACTION = 2;
  private static final int METHODID_EDIT_REGISTERED_REACTION = 3;
  private static final int METHODID_REMOVE_REGISTERED_REACTION = 4;
  private static final int METHODID_SET_REACTIONS_PARAMS = 5;

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
        case METHODID_ADD_REACTION:
          serviceImpl.addReaction((desmos.reactions.v1.Msgs.MsgAddReaction) request,
              (io.grpc.stub.StreamObserver<desmos.reactions.v1.Msgs.MsgAddReactionResponse>) responseObserver);
          break;
        case METHODID_REMOVE_REACTION:
          serviceImpl.removeReaction((desmos.reactions.v1.Msgs.MsgRemoveReaction) request,
              (io.grpc.stub.StreamObserver<desmos.reactions.v1.Msgs.MsgRemoveReactionResponse>) responseObserver);
          break;
        case METHODID_ADD_REGISTERED_REACTION:
          serviceImpl.addRegisteredReaction((desmos.reactions.v1.Msgs.MsgAddRegisteredReaction) request,
              (io.grpc.stub.StreamObserver<desmos.reactions.v1.Msgs.MsgAddRegisteredReactionResponse>) responseObserver);
          break;
        case METHODID_EDIT_REGISTERED_REACTION:
          serviceImpl.editRegisteredReaction((desmos.reactions.v1.Msgs.MsgEditRegisteredReaction) request,
              (io.grpc.stub.StreamObserver<desmos.reactions.v1.Msgs.MsgEditRegisteredReactionResponse>) responseObserver);
          break;
        case METHODID_REMOVE_REGISTERED_REACTION:
          serviceImpl.removeRegisteredReaction((desmos.reactions.v1.Msgs.MsgRemoveRegisteredReaction) request,
              (io.grpc.stub.StreamObserver<desmos.reactions.v1.Msgs.MsgRemoveRegisteredReactionResponse>) responseObserver);
          break;
        case METHODID_SET_REACTIONS_PARAMS:
          serviceImpl.setReactionsParams((desmos.reactions.v1.Msgs.MsgSetReactionsParams) request,
              (io.grpc.stub.StreamObserver<desmos.reactions.v1.Msgs.MsgSetReactionsParamsResponse>) responseObserver);
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
      return desmos.reactions.v1.Msgs.getDescriptor();
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
              .addMethod(getAddReactionMethod())
              .addMethod(getRemoveReactionMethod())
              .addMethod(getAddRegisteredReactionMethod())
              .addMethod(getEditRegisteredReactionMethod())
              .addMethod(getRemoveRegisteredReactionMethod())
              .addMethod(getSetReactionsParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
