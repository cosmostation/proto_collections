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
 * Query defines the gRPC querier service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: desmos/posts/v2/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "desmos.posts.v2.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<desmos.posts.v2.QueryOuterClass.QuerySubspacePostsRequest,
      desmos.posts.v2.QueryOuterClass.QuerySubspacePostsResponse> getSubspacePostsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubspacePosts",
      requestType = desmos.posts.v2.QueryOuterClass.QuerySubspacePostsRequest.class,
      responseType = desmos.posts.v2.QueryOuterClass.QuerySubspacePostsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.posts.v2.QueryOuterClass.QuerySubspacePostsRequest,
      desmos.posts.v2.QueryOuterClass.QuerySubspacePostsResponse> getSubspacePostsMethod() {
    io.grpc.MethodDescriptor<desmos.posts.v2.QueryOuterClass.QuerySubspacePostsRequest, desmos.posts.v2.QueryOuterClass.QuerySubspacePostsResponse> getSubspacePostsMethod;
    if ((getSubspacePostsMethod = QueryGrpc.getSubspacePostsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSubspacePostsMethod = QueryGrpc.getSubspacePostsMethod) == null) {
          QueryGrpc.getSubspacePostsMethod = getSubspacePostsMethod =
              io.grpc.MethodDescriptor.<desmos.posts.v2.QueryOuterClass.QuerySubspacePostsRequest, desmos.posts.v2.QueryOuterClass.QuerySubspacePostsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubspacePosts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.posts.v2.QueryOuterClass.QuerySubspacePostsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.posts.v2.QueryOuterClass.QuerySubspacePostsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SubspacePosts"))
              .build();
        }
      }
    }
    return getSubspacePostsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.posts.v2.QueryOuterClass.QuerySectionPostsRequest,
      desmos.posts.v2.QueryOuterClass.QuerySectionPostsResponse> getSectionPostsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SectionPosts",
      requestType = desmos.posts.v2.QueryOuterClass.QuerySectionPostsRequest.class,
      responseType = desmos.posts.v2.QueryOuterClass.QuerySectionPostsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.posts.v2.QueryOuterClass.QuerySectionPostsRequest,
      desmos.posts.v2.QueryOuterClass.QuerySectionPostsResponse> getSectionPostsMethod() {
    io.grpc.MethodDescriptor<desmos.posts.v2.QueryOuterClass.QuerySectionPostsRequest, desmos.posts.v2.QueryOuterClass.QuerySectionPostsResponse> getSectionPostsMethod;
    if ((getSectionPostsMethod = QueryGrpc.getSectionPostsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSectionPostsMethod = QueryGrpc.getSectionPostsMethod) == null) {
          QueryGrpc.getSectionPostsMethod = getSectionPostsMethod =
              io.grpc.MethodDescriptor.<desmos.posts.v2.QueryOuterClass.QuerySectionPostsRequest, desmos.posts.v2.QueryOuterClass.QuerySectionPostsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SectionPosts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.posts.v2.QueryOuterClass.QuerySectionPostsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.posts.v2.QueryOuterClass.QuerySectionPostsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SectionPosts"))
              .build();
        }
      }
    }
    return getSectionPostsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.posts.v2.QueryOuterClass.QueryPostRequest,
      desmos.posts.v2.QueryOuterClass.QueryPostResponse> getPostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Post",
      requestType = desmos.posts.v2.QueryOuterClass.QueryPostRequest.class,
      responseType = desmos.posts.v2.QueryOuterClass.QueryPostResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.posts.v2.QueryOuterClass.QueryPostRequest,
      desmos.posts.v2.QueryOuterClass.QueryPostResponse> getPostMethod() {
    io.grpc.MethodDescriptor<desmos.posts.v2.QueryOuterClass.QueryPostRequest, desmos.posts.v2.QueryOuterClass.QueryPostResponse> getPostMethod;
    if ((getPostMethod = QueryGrpc.getPostMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPostMethod = QueryGrpc.getPostMethod) == null) {
          QueryGrpc.getPostMethod = getPostMethod =
              io.grpc.MethodDescriptor.<desmos.posts.v2.QueryOuterClass.QueryPostRequest, desmos.posts.v2.QueryOuterClass.QueryPostResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Post"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.posts.v2.QueryOuterClass.QueryPostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.posts.v2.QueryOuterClass.QueryPostResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Post"))
              .build();
        }
      }
    }
    return getPostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.posts.v2.QueryOuterClass.QueryPostAttachmentsRequest,
      desmos.posts.v2.QueryOuterClass.QueryPostAttachmentsResponse> getPostAttachmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostAttachments",
      requestType = desmos.posts.v2.QueryOuterClass.QueryPostAttachmentsRequest.class,
      responseType = desmos.posts.v2.QueryOuterClass.QueryPostAttachmentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.posts.v2.QueryOuterClass.QueryPostAttachmentsRequest,
      desmos.posts.v2.QueryOuterClass.QueryPostAttachmentsResponse> getPostAttachmentsMethod() {
    io.grpc.MethodDescriptor<desmos.posts.v2.QueryOuterClass.QueryPostAttachmentsRequest, desmos.posts.v2.QueryOuterClass.QueryPostAttachmentsResponse> getPostAttachmentsMethod;
    if ((getPostAttachmentsMethod = QueryGrpc.getPostAttachmentsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPostAttachmentsMethod = QueryGrpc.getPostAttachmentsMethod) == null) {
          QueryGrpc.getPostAttachmentsMethod = getPostAttachmentsMethod =
              io.grpc.MethodDescriptor.<desmos.posts.v2.QueryOuterClass.QueryPostAttachmentsRequest, desmos.posts.v2.QueryOuterClass.QueryPostAttachmentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostAttachments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.posts.v2.QueryOuterClass.QueryPostAttachmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.posts.v2.QueryOuterClass.QueryPostAttachmentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PostAttachments"))
              .build();
        }
      }
    }
    return getPostAttachmentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.posts.v2.QueryOuterClass.QueryPollAnswersRequest,
      desmos.posts.v2.QueryOuterClass.QueryPollAnswersResponse> getPollAnswersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PollAnswers",
      requestType = desmos.posts.v2.QueryOuterClass.QueryPollAnswersRequest.class,
      responseType = desmos.posts.v2.QueryOuterClass.QueryPollAnswersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.posts.v2.QueryOuterClass.QueryPollAnswersRequest,
      desmos.posts.v2.QueryOuterClass.QueryPollAnswersResponse> getPollAnswersMethod() {
    io.grpc.MethodDescriptor<desmos.posts.v2.QueryOuterClass.QueryPollAnswersRequest, desmos.posts.v2.QueryOuterClass.QueryPollAnswersResponse> getPollAnswersMethod;
    if ((getPollAnswersMethod = QueryGrpc.getPollAnswersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPollAnswersMethod = QueryGrpc.getPollAnswersMethod) == null) {
          QueryGrpc.getPollAnswersMethod = getPollAnswersMethod =
              io.grpc.MethodDescriptor.<desmos.posts.v2.QueryOuterClass.QueryPollAnswersRequest, desmos.posts.v2.QueryOuterClass.QueryPollAnswersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PollAnswers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.posts.v2.QueryOuterClass.QueryPollAnswersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.posts.v2.QueryOuterClass.QueryPollAnswersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PollAnswers"))
              .build();
        }
      }
    }
    return getPollAnswersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.posts.v2.QueryOuterClass.QueryParamsRequest,
      desmos.posts.v2.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = desmos.posts.v2.QueryOuterClass.QueryParamsRequest.class,
      responseType = desmos.posts.v2.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.posts.v2.QueryOuterClass.QueryParamsRequest,
      desmos.posts.v2.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<desmos.posts.v2.QueryOuterClass.QueryParamsRequest, desmos.posts.v2.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<desmos.posts.v2.QueryOuterClass.QueryParamsRequest, desmos.posts.v2.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.posts.v2.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.posts.v2.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryStub>() {
        @java.lang.Override
        public QueryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryStub(channel, callOptions);
        }
      };
    return QueryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryBlockingStub>() {
        @java.lang.Override
        public QueryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryBlockingStub(channel, callOptions);
        }
      };
    return QueryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryFutureStub>() {
        @java.lang.Override
        public QueryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryFutureStub(channel, callOptions);
        }
      };
    return QueryFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Query defines the gRPC querier service
   * </pre>
   */
  public static abstract class QueryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * SubspacePosts queries all the posts inside a given subspace
     * </pre>
     */
    public void subspacePosts(desmos.posts.v2.QueryOuterClass.QuerySubspacePostsRequest request,
        io.grpc.stub.StreamObserver<desmos.posts.v2.QueryOuterClass.QuerySubspacePostsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSubspacePostsMethod(), responseObserver);
    }

    /**
     * <pre>
     * SectionPosts queries all the posts inside a given section
     * </pre>
     */
    public void sectionPosts(desmos.posts.v2.QueryOuterClass.QuerySectionPostsRequest request,
        io.grpc.stub.StreamObserver<desmos.posts.v2.QueryOuterClass.QuerySectionPostsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSectionPostsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Post queries for a single post inside a given subspace
     * </pre>
     */
    public void post(desmos.posts.v2.QueryOuterClass.QueryPostRequest request,
        io.grpc.stub.StreamObserver<desmos.posts.v2.QueryOuterClass.QueryPostResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostMethod(), responseObserver);
    }

    /**
     * <pre>
     * PostAttachments queries the attachments of the post having the given id
     * </pre>
     */
    public void postAttachments(desmos.posts.v2.QueryOuterClass.QueryPostAttachmentsRequest request,
        io.grpc.stub.StreamObserver<desmos.posts.v2.QueryOuterClass.QueryPostAttachmentsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostAttachmentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * PollAnswers queries the answers for the poll having the given id
     * </pre>
     */
    public void pollAnswers(desmos.posts.v2.QueryOuterClass.QueryPollAnswersRequest request,
        io.grpc.stub.StreamObserver<desmos.posts.v2.QueryOuterClass.QueryPollAnswersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPollAnswersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params queries the module parameters
     * </pre>
     */
    public void params(desmos.posts.v2.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<desmos.posts.v2.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSubspacePostsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.posts.v2.QueryOuterClass.QuerySubspacePostsRequest,
                desmos.posts.v2.QueryOuterClass.QuerySubspacePostsResponse>(
                  this, METHODID_SUBSPACE_POSTS)))
          .addMethod(
            getSectionPostsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.posts.v2.QueryOuterClass.QuerySectionPostsRequest,
                desmos.posts.v2.QueryOuterClass.QuerySectionPostsResponse>(
                  this, METHODID_SECTION_POSTS)))
          .addMethod(
            getPostMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.posts.v2.QueryOuterClass.QueryPostRequest,
                desmos.posts.v2.QueryOuterClass.QueryPostResponse>(
                  this, METHODID_POST)))
          .addMethod(
            getPostAttachmentsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.posts.v2.QueryOuterClass.QueryPostAttachmentsRequest,
                desmos.posts.v2.QueryOuterClass.QueryPostAttachmentsResponse>(
                  this, METHODID_POST_ATTACHMENTS)))
          .addMethod(
            getPollAnswersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.posts.v2.QueryOuterClass.QueryPollAnswersRequest,
                desmos.posts.v2.QueryOuterClass.QueryPollAnswersResponse>(
                  this, METHODID_POLL_ANSWERS)))
          .addMethod(
            getParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.posts.v2.QueryOuterClass.QueryParamsRequest,
                desmos.posts.v2.QueryOuterClass.QueryParamsResponse>(
                  this, METHODID_PARAMS)))
          .build();
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service
   * </pre>
   */
  public static final class QueryStub extends io.grpc.stub.AbstractAsyncStub<QueryStub> {
    private QueryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryStub(channel, callOptions);
    }

    /**
     * <pre>
     * SubspacePosts queries all the posts inside a given subspace
     * </pre>
     */
    public void subspacePosts(desmos.posts.v2.QueryOuterClass.QuerySubspacePostsRequest request,
        io.grpc.stub.StreamObserver<desmos.posts.v2.QueryOuterClass.QuerySubspacePostsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubspacePostsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SectionPosts queries all the posts inside a given section
     * </pre>
     */
    public void sectionPosts(desmos.posts.v2.QueryOuterClass.QuerySectionPostsRequest request,
        io.grpc.stub.StreamObserver<desmos.posts.v2.QueryOuterClass.QuerySectionPostsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSectionPostsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Post queries for a single post inside a given subspace
     * </pre>
     */
    public void post(desmos.posts.v2.QueryOuterClass.QueryPostRequest request,
        io.grpc.stub.StreamObserver<desmos.posts.v2.QueryOuterClass.QueryPostResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PostAttachments queries the attachments of the post having the given id
     * </pre>
     */
    public void postAttachments(desmos.posts.v2.QueryOuterClass.QueryPostAttachmentsRequest request,
        io.grpc.stub.StreamObserver<desmos.posts.v2.QueryOuterClass.QueryPostAttachmentsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostAttachmentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PollAnswers queries the answers for the poll having the given id
     * </pre>
     */
    public void pollAnswers(desmos.posts.v2.QueryOuterClass.QueryPollAnswersRequest request,
        io.grpc.stub.StreamObserver<desmos.posts.v2.QueryOuterClass.QueryPollAnswersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPollAnswersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params queries the module parameters
     * </pre>
     */
    public void params(desmos.posts.v2.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<desmos.posts.v2.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service
   * </pre>
   */
  public static final class QueryBlockingStub extends io.grpc.stub.AbstractBlockingStub<QueryBlockingStub> {
    private QueryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * SubspacePosts queries all the posts inside a given subspace
     * </pre>
     */
    public desmos.posts.v2.QueryOuterClass.QuerySubspacePostsResponse subspacePosts(desmos.posts.v2.QueryOuterClass.QuerySubspacePostsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSubspacePostsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SectionPosts queries all the posts inside a given section
     * </pre>
     */
    public desmos.posts.v2.QueryOuterClass.QuerySectionPostsResponse sectionPosts(desmos.posts.v2.QueryOuterClass.QuerySectionPostsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSectionPostsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Post queries for a single post inside a given subspace
     * </pre>
     */
    public desmos.posts.v2.QueryOuterClass.QueryPostResponse post(desmos.posts.v2.QueryOuterClass.QueryPostRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PostAttachments queries the attachments of the post having the given id
     * </pre>
     */
    public desmos.posts.v2.QueryOuterClass.QueryPostAttachmentsResponse postAttachments(desmos.posts.v2.QueryOuterClass.QueryPostAttachmentsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostAttachmentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PollAnswers queries the answers for the poll having the given id
     * </pre>
     */
    public desmos.posts.v2.QueryOuterClass.QueryPollAnswersResponse pollAnswers(desmos.posts.v2.QueryOuterClass.QueryPollAnswersRequest request) {
      return blockingUnaryCall(
          getChannel(), getPollAnswersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params queries the module parameters
     * </pre>
     */
    public desmos.posts.v2.QueryOuterClass.QueryParamsResponse params(desmos.posts.v2.QueryOuterClass.QueryParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service
   * </pre>
   */
  public static final class QueryFutureStub extends io.grpc.stub.AbstractFutureStub<QueryFutureStub> {
    private QueryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * SubspacePosts queries all the posts inside a given subspace
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.posts.v2.QueryOuterClass.QuerySubspacePostsResponse> subspacePosts(
        desmos.posts.v2.QueryOuterClass.QuerySubspacePostsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSubspacePostsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SectionPosts queries all the posts inside a given section
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.posts.v2.QueryOuterClass.QuerySectionPostsResponse> sectionPosts(
        desmos.posts.v2.QueryOuterClass.QuerySectionPostsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSectionPostsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Post queries for a single post inside a given subspace
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.posts.v2.QueryOuterClass.QueryPostResponse> post(
        desmos.posts.v2.QueryOuterClass.QueryPostRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PostAttachments queries the attachments of the post having the given id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.posts.v2.QueryOuterClass.QueryPostAttachmentsResponse> postAttachments(
        desmos.posts.v2.QueryOuterClass.QueryPostAttachmentsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostAttachmentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PollAnswers queries the answers for the poll having the given id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.posts.v2.QueryOuterClass.QueryPollAnswersResponse> pollAnswers(
        desmos.posts.v2.QueryOuterClass.QueryPollAnswersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPollAnswersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params queries the module parameters
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.posts.v2.QueryOuterClass.QueryParamsResponse> params(
        desmos.posts.v2.QueryOuterClass.QueryParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBSPACE_POSTS = 0;
  private static final int METHODID_SECTION_POSTS = 1;
  private static final int METHODID_POST = 2;
  private static final int METHODID_POST_ATTACHMENTS = 3;
  private static final int METHODID_POLL_ANSWERS = 4;
  private static final int METHODID_PARAMS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QueryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QueryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBSPACE_POSTS:
          serviceImpl.subspacePosts((desmos.posts.v2.QueryOuterClass.QuerySubspacePostsRequest) request,
              (io.grpc.stub.StreamObserver<desmos.posts.v2.QueryOuterClass.QuerySubspacePostsResponse>) responseObserver);
          break;
        case METHODID_SECTION_POSTS:
          serviceImpl.sectionPosts((desmos.posts.v2.QueryOuterClass.QuerySectionPostsRequest) request,
              (io.grpc.stub.StreamObserver<desmos.posts.v2.QueryOuterClass.QuerySectionPostsResponse>) responseObserver);
          break;
        case METHODID_POST:
          serviceImpl.post((desmos.posts.v2.QueryOuterClass.QueryPostRequest) request,
              (io.grpc.stub.StreamObserver<desmos.posts.v2.QueryOuterClass.QueryPostResponse>) responseObserver);
          break;
        case METHODID_POST_ATTACHMENTS:
          serviceImpl.postAttachments((desmos.posts.v2.QueryOuterClass.QueryPostAttachmentsRequest) request,
              (io.grpc.stub.StreamObserver<desmos.posts.v2.QueryOuterClass.QueryPostAttachmentsResponse>) responseObserver);
          break;
        case METHODID_POLL_ANSWERS:
          serviceImpl.pollAnswers((desmos.posts.v2.QueryOuterClass.QueryPollAnswersRequest) request,
              (io.grpc.stub.StreamObserver<desmos.posts.v2.QueryOuterClass.QueryPollAnswersResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((desmos.posts.v2.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<desmos.posts.v2.QueryOuterClass.QueryParamsResponse>) responseObserver);
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

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return desmos.posts.v2.QueryOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Query");
    }
  }

  private static final class QueryFileDescriptorSupplier
      extends QueryBaseDescriptorSupplier {
    QueryFileDescriptorSupplier() {}
  }

  private static final class QueryMethodDescriptorSupplier
      extends QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryMethodDescriptorSupplier(String methodName) {
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
      synchronized (QueryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryFileDescriptorSupplier())
              .addMethod(getSubspacePostsMethod())
              .addMethod(getSectionPostsMethod())
              .addMethod(getPostMethod())
              .addMethod(getPostAttachmentsMethod())
              .addMethod(getPollAnswersMethod())
              .addMethod(getParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
