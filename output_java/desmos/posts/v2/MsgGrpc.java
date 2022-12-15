package desmos.posts.v2;

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
 * Msg defines the posts Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: desmos/posts/v2/msgs.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "desmos.posts.v2.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<desmos.posts.v2.Msgs.MsgCreatePost,
      desmos.posts.v2.Msgs.MsgCreatePostResponse> getCreatePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePost",
      requestType = desmos.posts.v2.Msgs.MsgCreatePost.class,
      responseType = desmos.posts.v2.Msgs.MsgCreatePostResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.posts.v2.Msgs.MsgCreatePost,
      desmos.posts.v2.Msgs.MsgCreatePostResponse> getCreatePostMethod() {
    io.grpc.MethodDescriptor<desmos.posts.v2.Msgs.MsgCreatePost, desmos.posts.v2.Msgs.MsgCreatePostResponse> getCreatePostMethod;
    if ((getCreatePostMethod = MsgGrpc.getCreatePostMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreatePostMethod = MsgGrpc.getCreatePostMethod) == null) {
          MsgGrpc.getCreatePostMethod = getCreatePostMethod =
              io.grpc.MethodDescriptor.<desmos.posts.v2.Msgs.MsgCreatePost, desmos.posts.v2.Msgs.MsgCreatePostResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.posts.v2.Msgs.MsgCreatePost.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.posts.v2.Msgs.MsgCreatePostResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreatePost"))
              .build();
        }
      }
    }
    return getCreatePostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.posts.v2.Msgs.MsgEditPost,
      desmos.posts.v2.Msgs.MsgEditPostResponse> getEditPostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditPost",
      requestType = desmos.posts.v2.Msgs.MsgEditPost.class,
      responseType = desmos.posts.v2.Msgs.MsgEditPostResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.posts.v2.Msgs.MsgEditPost,
      desmos.posts.v2.Msgs.MsgEditPostResponse> getEditPostMethod() {
    io.grpc.MethodDescriptor<desmos.posts.v2.Msgs.MsgEditPost, desmos.posts.v2.Msgs.MsgEditPostResponse> getEditPostMethod;
    if ((getEditPostMethod = MsgGrpc.getEditPostMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getEditPostMethod = MsgGrpc.getEditPostMethod) == null) {
          MsgGrpc.getEditPostMethod = getEditPostMethod =
              io.grpc.MethodDescriptor.<desmos.posts.v2.Msgs.MsgEditPost, desmos.posts.v2.Msgs.MsgEditPostResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditPost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.posts.v2.Msgs.MsgEditPost.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.posts.v2.Msgs.MsgEditPostResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("EditPost"))
              .build();
        }
      }
    }
    return getEditPostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.posts.v2.Msgs.MsgDeletePost,
      desmos.posts.v2.Msgs.MsgDeletePostResponse> getDeletePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePost",
      requestType = desmos.posts.v2.Msgs.MsgDeletePost.class,
      responseType = desmos.posts.v2.Msgs.MsgDeletePostResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.posts.v2.Msgs.MsgDeletePost,
      desmos.posts.v2.Msgs.MsgDeletePostResponse> getDeletePostMethod() {
    io.grpc.MethodDescriptor<desmos.posts.v2.Msgs.MsgDeletePost, desmos.posts.v2.Msgs.MsgDeletePostResponse> getDeletePostMethod;
    if ((getDeletePostMethod = MsgGrpc.getDeletePostMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeletePostMethod = MsgGrpc.getDeletePostMethod) == null) {
          MsgGrpc.getDeletePostMethod = getDeletePostMethod =
              io.grpc.MethodDescriptor.<desmos.posts.v2.Msgs.MsgDeletePost, desmos.posts.v2.Msgs.MsgDeletePostResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.posts.v2.Msgs.MsgDeletePost.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.posts.v2.Msgs.MsgDeletePostResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeletePost"))
              .build();
        }
      }
    }
    return getDeletePostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.posts.v2.Msgs.MsgAddPostAttachment,
      desmos.posts.v2.Msgs.MsgAddPostAttachmentResponse> getAddPostAttachmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddPostAttachment",
      requestType = desmos.posts.v2.Msgs.MsgAddPostAttachment.class,
      responseType = desmos.posts.v2.Msgs.MsgAddPostAttachmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.posts.v2.Msgs.MsgAddPostAttachment,
      desmos.posts.v2.Msgs.MsgAddPostAttachmentResponse> getAddPostAttachmentMethod() {
    io.grpc.MethodDescriptor<desmos.posts.v2.Msgs.MsgAddPostAttachment, desmos.posts.v2.Msgs.MsgAddPostAttachmentResponse> getAddPostAttachmentMethod;
    if ((getAddPostAttachmentMethod = MsgGrpc.getAddPostAttachmentMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddPostAttachmentMethod = MsgGrpc.getAddPostAttachmentMethod) == null) {
          MsgGrpc.getAddPostAttachmentMethod = getAddPostAttachmentMethod =
              io.grpc.MethodDescriptor.<desmos.posts.v2.Msgs.MsgAddPostAttachment, desmos.posts.v2.Msgs.MsgAddPostAttachmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddPostAttachment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.posts.v2.Msgs.MsgAddPostAttachment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.posts.v2.Msgs.MsgAddPostAttachmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddPostAttachment"))
              .build();
        }
      }
    }
    return getAddPostAttachmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.posts.v2.Msgs.MsgRemovePostAttachment,
      desmos.posts.v2.Msgs.MsgRemovePostAttachmentResponse> getRemovePostAttachmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemovePostAttachment",
      requestType = desmos.posts.v2.Msgs.MsgRemovePostAttachment.class,
      responseType = desmos.posts.v2.Msgs.MsgRemovePostAttachmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.posts.v2.Msgs.MsgRemovePostAttachment,
      desmos.posts.v2.Msgs.MsgRemovePostAttachmentResponse> getRemovePostAttachmentMethod() {
    io.grpc.MethodDescriptor<desmos.posts.v2.Msgs.MsgRemovePostAttachment, desmos.posts.v2.Msgs.MsgRemovePostAttachmentResponse> getRemovePostAttachmentMethod;
    if ((getRemovePostAttachmentMethod = MsgGrpc.getRemovePostAttachmentMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemovePostAttachmentMethod = MsgGrpc.getRemovePostAttachmentMethod) == null) {
          MsgGrpc.getRemovePostAttachmentMethod = getRemovePostAttachmentMethod =
              io.grpc.MethodDescriptor.<desmos.posts.v2.Msgs.MsgRemovePostAttachment, desmos.posts.v2.Msgs.MsgRemovePostAttachmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemovePostAttachment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.posts.v2.Msgs.MsgRemovePostAttachment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.posts.v2.Msgs.MsgRemovePostAttachmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemovePostAttachment"))
              .build();
        }
      }
    }
    return getRemovePostAttachmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.posts.v2.Msgs.MsgAnswerPoll,
      desmos.posts.v2.Msgs.MsgAnswerPollResponse> getAnswerPollMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AnswerPoll",
      requestType = desmos.posts.v2.Msgs.MsgAnswerPoll.class,
      responseType = desmos.posts.v2.Msgs.MsgAnswerPollResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.posts.v2.Msgs.MsgAnswerPoll,
      desmos.posts.v2.Msgs.MsgAnswerPollResponse> getAnswerPollMethod() {
    io.grpc.MethodDescriptor<desmos.posts.v2.Msgs.MsgAnswerPoll, desmos.posts.v2.Msgs.MsgAnswerPollResponse> getAnswerPollMethod;
    if ((getAnswerPollMethod = MsgGrpc.getAnswerPollMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAnswerPollMethod = MsgGrpc.getAnswerPollMethod) == null) {
          MsgGrpc.getAnswerPollMethod = getAnswerPollMethod =
              io.grpc.MethodDescriptor.<desmos.posts.v2.Msgs.MsgAnswerPoll, desmos.posts.v2.Msgs.MsgAnswerPollResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AnswerPoll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.posts.v2.Msgs.MsgAnswerPoll.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.posts.v2.Msgs.MsgAnswerPollResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AnswerPoll"))
              .build();
        }
      }
    }
    return getAnswerPollMethod;
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
   * Msg defines the posts Msg service.
   * </pre>
   */
  public static abstract class MsgImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * CreatePost allows to create a new post
     * </pre>
     */
    public void createPost(desmos.posts.v2.Msgs.MsgCreatePost request,
        io.grpc.stub.StreamObserver<desmos.posts.v2.Msgs.MsgCreatePostResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreatePostMethod(), responseObserver);
    }

    /**
     * <pre>
     * EditPost allows to edit an existing post
     * </pre>
     */
    public void editPost(desmos.posts.v2.Msgs.MsgEditPost request,
        io.grpc.stub.StreamObserver<desmos.posts.v2.Msgs.MsgEditPostResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEditPostMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeletePost allows to delete an existing post
     * </pre>
     */
    public void deletePost(desmos.posts.v2.Msgs.MsgDeletePost request,
        io.grpc.stub.StreamObserver<desmos.posts.v2.Msgs.MsgDeletePostResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeletePostMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddPostAttachment allows to add a new attachment to a post
     * </pre>
     */
    public void addPostAttachment(desmos.posts.v2.Msgs.MsgAddPostAttachment request,
        io.grpc.stub.StreamObserver<desmos.posts.v2.Msgs.MsgAddPostAttachmentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddPostAttachmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemovePostAttachment allows to remove an attachment from a post
     * </pre>
     */
    public void removePostAttachment(desmos.posts.v2.Msgs.MsgRemovePostAttachment request,
        io.grpc.stub.StreamObserver<desmos.posts.v2.Msgs.MsgRemovePostAttachmentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemovePostAttachmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * AnswerPoll allows to answer a post poll
     * </pre>
     */
    public void answerPoll(desmos.posts.v2.Msgs.MsgAnswerPoll request,
        io.grpc.stub.StreamObserver<desmos.posts.v2.Msgs.MsgAnswerPollResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAnswerPollMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreatePostMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.posts.v2.Msgs.MsgCreatePost,
                desmos.posts.v2.Msgs.MsgCreatePostResponse>(
                  this, METHODID_CREATE_POST)))
          .addMethod(
            getEditPostMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.posts.v2.Msgs.MsgEditPost,
                desmos.posts.v2.Msgs.MsgEditPostResponse>(
                  this, METHODID_EDIT_POST)))
          .addMethod(
            getDeletePostMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.posts.v2.Msgs.MsgDeletePost,
                desmos.posts.v2.Msgs.MsgDeletePostResponse>(
                  this, METHODID_DELETE_POST)))
          .addMethod(
            getAddPostAttachmentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.posts.v2.Msgs.MsgAddPostAttachment,
                desmos.posts.v2.Msgs.MsgAddPostAttachmentResponse>(
                  this, METHODID_ADD_POST_ATTACHMENT)))
          .addMethod(
            getRemovePostAttachmentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.posts.v2.Msgs.MsgRemovePostAttachment,
                desmos.posts.v2.Msgs.MsgRemovePostAttachmentResponse>(
                  this, METHODID_REMOVE_POST_ATTACHMENT)))
          .addMethod(
            getAnswerPollMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.posts.v2.Msgs.MsgAnswerPoll,
                desmos.posts.v2.Msgs.MsgAnswerPollResponse>(
                  this, METHODID_ANSWER_POLL)))
          .build();
    }
  }

  /**
   * <pre>
   * Msg defines the posts Msg service.
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
     * CreatePost allows to create a new post
     * </pre>
     */
    public void createPost(desmos.posts.v2.Msgs.MsgCreatePost request,
        io.grpc.stub.StreamObserver<desmos.posts.v2.Msgs.MsgCreatePostResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreatePostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EditPost allows to edit an existing post
     * </pre>
     */
    public void editPost(desmos.posts.v2.Msgs.MsgEditPost request,
        io.grpc.stub.StreamObserver<desmos.posts.v2.Msgs.MsgEditPostResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEditPostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeletePost allows to delete an existing post
     * </pre>
     */
    public void deletePost(desmos.posts.v2.Msgs.MsgDeletePost request,
        io.grpc.stub.StreamObserver<desmos.posts.v2.Msgs.MsgDeletePostResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeletePostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddPostAttachment allows to add a new attachment to a post
     * </pre>
     */
    public void addPostAttachment(desmos.posts.v2.Msgs.MsgAddPostAttachment request,
        io.grpc.stub.StreamObserver<desmos.posts.v2.Msgs.MsgAddPostAttachmentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddPostAttachmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemovePostAttachment allows to remove an attachment from a post
     * </pre>
     */
    public void removePostAttachment(desmos.posts.v2.Msgs.MsgRemovePostAttachment request,
        io.grpc.stub.StreamObserver<desmos.posts.v2.Msgs.MsgRemovePostAttachmentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemovePostAttachmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AnswerPoll allows to answer a post poll
     * </pre>
     */
    public void answerPoll(desmos.posts.v2.Msgs.MsgAnswerPoll request,
        io.grpc.stub.StreamObserver<desmos.posts.v2.Msgs.MsgAnswerPollResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAnswerPollMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Msg defines the posts Msg service.
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
     * CreatePost allows to create a new post
     * </pre>
     */
    public desmos.posts.v2.Msgs.MsgCreatePostResponse createPost(desmos.posts.v2.Msgs.MsgCreatePost request) {
      return blockingUnaryCall(
          getChannel(), getCreatePostMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EditPost allows to edit an existing post
     * </pre>
     */
    public desmos.posts.v2.Msgs.MsgEditPostResponse editPost(desmos.posts.v2.Msgs.MsgEditPost request) {
      return blockingUnaryCall(
          getChannel(), getEditPostMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeletePost allows to delete an existing post
     * </pre>
     */
    public desmos.posts.v2.Msgs.MsgDeletePostResponse deletePost(desmos.posts.v2.Msgs.MsgDeletePost request) {
      return blockingUnaryCall(
          getChannel(), getDeletePostMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddPostAttachment allows to add a new attachment to a post
     * </pre>
     */
    public desmos.posts.v2.Msgs.MsgAddPostAttachmentResponse addPostAttachment(desmos.posts.v2.Msgs.MsgAddPostAttachment request) {
      return blockingUnaryCall(
          getChannel(), getAddPostAttachmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemovePostAttachment allows to remove an attachment from a post
     * </pre>
     */
    public desmos.posts.v2.Msgs.MsgRemovePostAttachmentResponse removePostAttachment(desmos.posts.v2.Msgs.MsgRemovePostAttachment request) {
      return blockingUnaryCall(
          getChannel(), getRemovePostAttachmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AnswerPoll allows to answer a post poll
     * </pre>
     */
    public desmos.posts.v2.Msgs.MsgAnswerPollResponse answerPoll(desmos.posts.v2.Msgs.MsgAnswerPoll request) {
      return blockingUnaryCall(
          getChannel(), getAnswerPollMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Msg defines the posts Msg service.
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
     * CreatePost allows to create a new post
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.posts.v2.Msgs.MsgCreatePostResponse> createPost(
        desmos.posts.v2.Msgs.MsgCreatePost request) {
      return futureUnaryCall(
          getChannel().newCall(getCreatePostMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EditPost allows to edit an existing post
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.posts.v2.Msgs.MsgEditPostResponse> editPost(
        desmos.posts.v2.Msgs.MsgEditPost request) {
      return futureUnaryCall(
          getChannel().newCall(getEditPostMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeletePost allows to delete an existing post
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.posts.v2.Msgs.MsgDeletePostResponse> deletePost(
        desmos.posts.v2.Msgs.MsgDeletePost request) {
      return futureUnaryCall(
          getChannel().newCall(getDeletePostMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddPostAttachment allows to add a new attachment to a post
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.posts.v2.Msgs.MsgAddPostAttachmentResponse> addPostAttachment(
        desmos.posts.v2.Msgs.MsgAddPostAttachment request) {
      return futureUnaryCall(
          getChannel().newCall(getAddPostAttachmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemovePostAttachment allows to remove an attachment from a post
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.posts.v2.Msgs.MsgRemovePostAttachmentResponse> removePostAttachment(
        desmos.posts.v2.Msgs.MsgRemovePostAttachment request) {
      return futureUnaryCall(
          getChannel().newCall(getRemovePostAttachmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AnswerPoll allows to answer a post poll
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.posts.v2.Msgs.MsgAnswerPollResponse> answerPoll(
        desmos.posts.v2.Msgs.MsgAnswerPoll request) {
      return futureUnaryCall(
          getChannel().newCall(getAnswerPollMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_POST = 0;
  private static final int METHODID_EDIT_POST = 1;
  private static final int METHODID_DELETE_POST = 2;
  private static final int METHODID_ADD_POST_ATTACHMENT = 3;
  private static final int METHODID_REMOVE_POST_ATTACHMENT = 4;
  private static final int METHODID_ANSWER_POLL = 5;

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
        case METHODID_CREATE_POST:
          serviceImpl.createPost((desmos.posts.v2.Msgs.MsgCreatePost) request,
              (io.grpc.stub.StreamObserver<desmos.posts.v2.Msgs.MsgCreatePostResponse>) responseObserver);
          break;
        case METHODID_EDIT_POST:
          serviceImpl.editPost((desmos.posts.v2.Msgs.MsgEditPost) request,
              (io.grpc.stub.StreamObserver<desmos.posts.v2.Msgs.MsgEditPostResponse>) responseObserver);
          break;
        case METHODID_DELETE_POST:
          serviceImpl.deletePost((desmos.posts.v2.Msgs.MsgDeletePost) request,
              (io.grpc.stub.StreamObserver<desmos.posts.v2.Msgs.MsgDeletePostResponse>) responseObserver);
          break;
        case METHODID_ADD_POST_ATTACHMENT:
          serviceImpl.addPostAttachment((desmos.posts.v2.Msgs.MsgAddPostAttachment) request,
              (io.grpc.stub.StreamObserver<desmos.posts.v2.Msgs.MsgAddPostAttachmentResponse>) responseObserver);
          break;
        case METHODID_REMOVE_POST_ATTACHMENT:
          serviceImpl.removePostAttachment((desmos.posts.v2.Msgs.MsgRemovePostAttachment) request,
              (io.grpc.stub.StreamObserver<desmos.posts.v2.Msgs.MsgRemovePostAttachmentResponse>) responseObserver);
          break;
        case METHODID_ANSWER_POLL:
          serviceImpl.answerPoll((desmos.posts.v2.Msgs.MsgAnswerPoll) request,
              (io.grpc.stub.StreamObserver<desmos.posts.v2.Msgs.MsgAnswerPollResponse>) responseObserver);
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
      return desmos.posts.v2.Msgs.getDescriptor();
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
              .addMethod(getCreatePostMethod())
              .addMethod(getEditPostMethod())
              .addMethod(getDeletePostMethod())
              .addMethod(getAddPostAttachmentMethod())
              .addMethod(getRemovePostAttachmentMethod())
              .addMethod(getAnswerPollMethod())
              .build();
        }
      }
    }
    return result;
  }
}
