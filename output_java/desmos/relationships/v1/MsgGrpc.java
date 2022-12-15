package desmos.relationships.v1;

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
 * Msg defines the relationships Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: desmos/relationships/v1/msgs.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "desmos.relationships.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<desmos.relationships.v1.Msgs.MsgCreateRelationship,
      desmos.relationships.v1.Msgs.MsgCreateRelationshipResponse> getCreateRelationshipMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRelationship",
      requestType = desmos.relationships.v1.Msgs.MsgCreateRelationship.class,
      responseType = desmos.relationships.v1.Msgs.MsgCreateRelationshipResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.relationships.v1.Msgs.MsgCreateRelationship,
      desmos.relationships.v1.Msgs.MsgCreateRelationshipResponse> getCreateRelationshipMethod() {
    io.grpc.MethodDescriptor<desmos.relationships.v1.Msgs.MsgCreateRelationship, desmos.relationships.v1.Msgs.MsgCreateRelationshipResponse> getCreateRelationshipMethod;
    if ((getCreateRelationshipMethod = MsgGrpc.getCreateRelationshipMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateRelationshipMethod = MsgGrpc.getCreateRelationshipMethod) == null) {
          MsgGrpc.getCreateRelationshipMethod = getCreateRelationshipMethod =
              io.grpc.MethodDescriptor.<desmos.relationships.v1.Msgs.MsgCreateRelationship, desmos.relationships.v1.Msgs.MsgCreateRelationshipResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRelationship"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.relationships.v1.Msgs.MsgCreateRelationship.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.relationships.v1.Msgs.MsgCreateRelationshipResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateRelationship"))
              .build();
        }
      }
    }
    return getCreateRelationshipMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.relationships.v1.Msgs.MsgDeleteRelationship,
      desmos.relationships.v1.Msgs.MsgDeleteRelationshipResponse> getDeleteRelationshipMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRelationship",
      requestType = desmos.relationships.v1.Msgs.MsgDeleteRelationship.class,
      responseType = desmos.relationships.v1.Msgs.MsgDeleteRelationshipResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.relationships.v1.Msgs.MsgDeleteRelationship,
      desmos.relationships.v1.Msgs.MsgDeleteRelationshipResponse> getDeleteRelationshipMethod() {
    io.grpc.MethodDescriptor<desmos.relationships.v1.Msgs.MsgDeleteRelationship, desmos.relationships.v1.Msgs.MsgDeleteRelationshipResponse> getDeleteRelationshipMethod;
    if ((getDeleteRelationshipMethod = MsgGrpc.getDeleteRelationshipMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteRelationshipMethod = MsgGrpc.getDeleteRelationshipMethod) == null) {
          MsgGrpc.getDeleteRelationshipMethod = getDeleteRelationshipMethod =
              io.grpc.MethodDescriptor.<desmos.relationships.v1.Msgs.MsgDeleteRelationship, desmos.relationships.v1.Msgs.MsgDeleteRelationshipResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRelationship"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.relationships.v1.Msgs.MsgDeleteRelationship.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.relationships.v1.Msgs.MsgDeleteRelationshipResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteRelationship"))
              .build();
        }
      }
    }
    return getDeleteRelationshipMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.relationships.v1.Msgs.MsgBlockUser,
      desmos.relationships.v1.Msgs.MsgBlockUserResponse> getBlockUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BlockUser",
      requestType = desmos.relationships.v1.Msgs.MsgBlockUser.class,
      responseType = desmos.relationships.v1.Msgs.MsgBlockUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.relationships.v1.Msgs.MsgBlockUser,
      desmos.relationships.v1.Msgs.MsgBlockUserResponse> getBlockUserMethod() {
    io.grpc.MethodDescriptor<desmos.relationships.v1.Msgs.MsgBlockUser, desmos.relationships.v1.Msgs.MsgBlockUserResponse> getBlockUserMethod;
    if ((getBlockUserMethod = MsgGrpc.getBlockUserMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBlockUserMethod = MsgGrpc.getBlockUserMethod) == null) {
          MsgGrpc.getBlockUserMethod = getBlockUserMethod =
              io.grpc.MethodDescriptor.<desmos.relationships.v1.Msgs.MsgBlockUser, desmos.relationships.v1.Msgs.MsgBlockUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BlockUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.relationships.v1.Msgs.MsgBlockUser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.relationships.v1.Msgs.MsgBlockUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("BlockUser"))
              .build();
        }
      }
    }
    return getBlockUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.relationships.v1.Msgs.MsgUnblockUser,
      desmos.relationships.v1.Msgs.MsgUnblockUserResponse> getUnblockUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnblockUser",
      requestType = desmos.relationships.v1.Msgs.MsgUnblockUser.class,
      responseType = desmos.relationships.v1.Msgs.MsgUnblockUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.relationships.v1.Msgs.MsgUnblockUser,
      desmos.relationships.v1.Msgs.MsgUnblockUserResponse> getUnblockUserMethod() {
    io.grpc.MethodDescriptor<desmos.relationships.v1.Msgs.MsgUnblockUser, desmos.relationships.v1.Msgs.MsgUnblockUserResponse> getUnblockUserMethod;
    if ((getUnblockUserMethod = MsgGrpc.getUnblockUserMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUnblockUserMethod = MsgGrpc.getUnblockUserMethod) == null) {
          MsgGrpc.getUnblockUserMethod = getUnblockUserMethod =
              io.grpc.MethodDescriptor.<desmos.relationships.v1.Msgs.MsgUnblockUser, desmos.relationships.v1.Msgs.MsgUnblockUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnblockUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.relationships.v1.Msgs.MsgUnblockUser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.relationships.v1.Msgs.MsgUnblockUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UnblockUser"))
              .build();
        }
      }
    }
    return getUnblockUserMethod;
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
   * Msg defines the relationships Msg service.
   * </pre>
   */
  public static abstract class MsgImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * CreateRelationship defines a method for creating a new relationship
     * </pre>
     */
    public void createRelationship(desmos.relationships.v1.Msgs.MsgCreateRelationship request,
        io.grpc.stub.StreamObserver<desmos.relationships.v1.Msgs.MsgCreateRelationshipResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateRelationshipMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteRelationship defines a method for deleting a relationship
     * </pre>
     */
    public void deleteRelationship(desmos.relationships.v1.Msgs.MsgDeleteRelationship request,
        io.grpc.stub.StreamObserver<desmos.relationships.v1.Msgs.MsgDeleteRelationshipResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteRelationshipMethod(), responseObserver);
    }

    /**
     * <pre>
     * BlockUser defines a method for blocking a user
     * </pre>
     */
    public void blockUser(desmos.relationships.v1.Msgs.MsgBlockUser request,
        io.grpc.stub.StreamObserver<desmos.relationships.v1.Msgs.MsgBlockUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBlockUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * UnblockUser defines a method for unblocking a user
     * </pre>
     */
    public void unblockUser(desmos.relationships.v1.Msgs.MsgUnblockUser request,
        io.grpc.stub.StreamObserver<desmos.relationships.v1.Msgs.MsgUnblockUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnblockUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateRelationshipMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.relationships.v1.Msgs.MsgCreateRelationship,
                desmos.relationships.v1.Msgs.MsgCreateRelationshipResponse>(
                  this, METHODID_CREATE_RELATIONSHIP)))
          .addMethod(
            getDeleteRelationshipMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.relationships.v1.Msgs.MsgDeleteRelationship,
                desmos.relationships.v1.Msgs.MsgDeleteRelationshipResponse>(
                  this, METHODID_DELETE_RELATIONSHIP)))
          .addMethod(
            getBlockUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.relationships.v1.Msgs.MsgBlockUser,
                desmos.relationships.v1.Msgs.MsgBlockUserResponse>(
                  this, METHODID_BLOCK_USER)))
          .addMethod(
            getUnblockUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.relationships.v1.Msgs.MsgUnblockUser,
                desmos.relationships.v1.Msgs.MsgUnblockUserResponse>(
                  this, METHODID_UNBLOCK_USER)))
          .build();
    }
  }

  /**
   * <pre>
   * Msg defines the relationships Msg service.
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
     * CreateRelationship defines a method for creating a new relationship
     * </pre>
     */
    public void createRelationship(desmos.relationships.v1.Msgs.MsgCreateRelationship request,
        io.grpc.stub.StreamObserver<desmos.relationships.v1.Msgs.MsgCreateRelationshipResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateRelationshipMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteRelationship defines a method for deleting a relationship
     * </pre>
     */
    public void deleteRelationship(desmos.relationships.v1.Msgs.MsgDeleteRelationship request,
        io.grpc.stub.StreamObserver<desmos.relationships.v1.Msgs.MsgDeleteRelationshipResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteRelationshipMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BlockUser defines a method for blocking a user
     * </pre>
     */
    public void blockUser(desmos.relationships.v1.Msgs.MsgBlockUser request,
        io.grpc.stub.StreamObserver<desmos.relationships.v1.Msgs.MsgBlockUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBlockUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UnblockUser defines a method for unblocking a user
     * </pre>
     */
    public void unblockUser(desmos.relationships.v1.Msgs.MsgUnblockUser request,
        io.grpc.stub.StreamObserver<desmos.relationships.v1.Msgs.MsgUnblockUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnblockUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Msg defines the relationships Msg service.
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
     * CreateRelationship defines a method for creating a new relationship
     * </pre>
     */
    public desmos.relationships.v1.Msgs.MsgCreateRelationshipResponse createRelationship(desmos.relationships.v1.Msgs.MsgCreateRelationship request) {
      return blockingUnaryCall(
          getChannel(), getCreateRelationshipMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteRelationship defines a method for deleting a relationship
     * </pre>
     */
    public desmos.relationships.v1.Msgs.MsgDeleteRelationshipResponse deleteRelationship(desmos.relationships.v1.Msgs.MsgDeleteRelationship request) {
      return blockingUnaryCall(
          getChannel(), getDeleteRelationshipMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BlockUser defines a method for blocking a user
     * </pre>
     */
    public desmos.relationships.v1.Msgs.MsgBlockUserResponse blockUser(desmos.relationships.v1.Msgs.MsgBlockUser request) {
      return blockingUnaryCall(
          getChannel(), getBlockUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UnblockUser defines a method for unblocking a user
     * </pre>
     */
    public desmos.relationships.v1.Msgs.MsgUnblockUserResponse unblockUser(desmos.relationships.v1.Msgs.MsgUnblockUser request) {
      return blockingUnaryCall(
          getChannel(), getUnblockUserMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Msg defines the relationships Msg service.
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
     * CreateRelationship defines a method for creating a new relationship
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.relationships.v1.Msgs.MsgCreateRelationshipResponse> createRelationship(
        desmos.relationships.v1.Msgs.MsgCreateRelationship request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateRelationshipMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteRelationship defines a method for deleting a relationship
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.relationships.v1.Msgs.MsgDeleteRelationshipResponse> deleteRelationship(
        desmos.relationships.v1.Msgs.MsgDeleteRelationship request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteRelationshipMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BlockUser defines a method for blocking a user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.relationships.v1.Msgs.MsgBlockUserResponse> blockUser(
        desmos.relationships.v1.Msgs.MsgBlockUser request) {
      return futureUnaryCall(
          getChannel().newCall(getBlockUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UnblockUser defines a method for unblocking a user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.relationships.v1.Msgs.MsgUnblockUserResponse> unblockUser(
        desmos.relationships.v1.Msgs.MsgUnblockUser request) {
      return futureUnaryCall(
          getChannel().newCall(getUnblockUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_RELATIONSHIP = 0;
  private static final int METHODID_DELETE_RELATIONSHIP = 1;
  private static final int METHODID_BLOCK_USER = 2;
  private static final int METHODID_UNBLOCK_USER = 3;

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
        case METHODID_CREATE_RELATIONSHIP:
          serviceImpl.createRelationship((desmos.relationships.v1.Msgs.MsgCreateRelationship) request,
              (io.grpc.stub.StreamObserver<desmos.relationships.v1.Msgs.MsgCreateRelationshipResponse>) responseObserver);
          break;
        case METHODID_DELETE_RELATIONSHIP:
          serviceImpl.deleteRelationship((desmos.relationships.v1.Msgs.MsgDeleteRelationship) request,
              (io.grpc.stub.StreamObserver<desmos.relationships.v1.Msgs.MsgDeleteRelationshipResponse>) responseObserver);
          break;
        case METHODID_BLOCK_USER:
          serviceImpl.blockUser((desmos.relationships.v1.Msgs.MsgBlockUser) request,
              (io.grpc.stub.StreamObserver<desmos.relationships.v1.Msgs.MsgBlockUserResponse>) responseObserver);
          break;
        case METHODID_UNBLOCK_USER:
          serviceImpl.unblockUser((desmos.relationships.v1.Msgs.MsgUnblockUser) request,
              (io.grpc.stub.StreamObserver<desmos.relationships.v1.Msgs.MsgUnblockUserResponse>) responseObserver);
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
      return desmos.relationships.v1.Msgs.getDescriptor();
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
              .addMethod(getCreateRelationshipMethod())
              .addMethod(getDeleteRelationshipMethod())
              .addMethod(getBlockUserMethod())
              .addMethod(getUnblockUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
