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
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: desmos/reactions/v1/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "desmos.reactions.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<desmos.reactions.v1.QueryOuterClass.QueryReactionsRequest,
      desmos.reactions.v1.QueryOuterClass.QueryReactionsResponse> getReactionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Reactions",
      requestType = desmos.reactions.v1.QueryOuterClass.QueryReactionsRequest.class,
      responseType = desmos.reactions.v1.QueryOuterClass.QueryReactionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.reactions.v1.QueryOuterClass.QueryReactionsRequest,
      desmos.reactions.v1.QueryOuterClass.QueryReactionsResponse> getReactionsMethod() {
    io.grpc.MethodDescriptor<desmos.reactions.v1.QueryOuterClass.QueryReactionsRequest, desmos.reactions.v1.QueryOuterClass.QueryReactionsResponse> getReactionsMethod;
    if ((getReactionsMethod = QueryGrpc.getReactionsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getReactionsMethod = QueryGrpc.getReactionsMethod) == null) {
          QueryGrpc.getReactionsMethod = getReactionsMethod =
              io.grpc.MethodDescriptor.<desmos.reactions.v1.QueryOuterClass.QueryReactionsRequest, desmos.reactions.v1.QueryOuterClass.QueryReactionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reactions.v1.QueryOuterClass.QueryReactionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reactions.v1.QueryOuterClass.QueryReactionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Reactions"))
              .build();
        }
      }
    }
    return getReactionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.reactions.v1.QueryOuterClass.QueryReactionRequest,
      desmos.reactions.v1.QueryOuterClass.QueryReactionResponse> getReactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Reaction",
      requestType = desmos.reactions.v1.QueryOuterClass.QueryReactionRequest.class,
      responseType = desmos.reactions.v1.QueryOuterClass.QueryReactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.reactions.v1.QueryOuterClass.QueryReactionRequest,
      desmos.reactions.v1.QueryOuterClass.QueryReactionResponse> getReactionMethod() {
    io.grpc.MethodDescriptor<desmos.reactions.v1.QueryOuterClass.QueryReactionRequest, desmos.reactions.v1.QueryOuterClass.QueryReactionResponse> getReactionMethod;
    if ((getReactionMethod = QueryGrpc.getReactionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getReactionMethod = QueryGrpc.getReactionMethod) == null) {
          QueryGrpc.getReactionMethod = getReactionMethod =
              io.grpc.MethodDescriptor.<desmos.reactions.v1.QueryOuterClass.QueryReactionRequest, desmos.reactions.v1.QueryOuterClass.QueryReactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reactions.v1.QueryOuterClass.QueryReactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reactions.v1.QueryOuterClass.QueryReactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Reaction"))
              .build();
        }
      }
    }
    return getReactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionsRequest,
      desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionsResponse> getRegisteredReactionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisteredReactions",
      requestType = desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionsRequest.class,
      responseType = desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionsRequest,
      desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionsResponse> getRegisteredReactionsMethod() {
    io.grpc.MethodDescriptor<desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionsRequest, desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionsResponse> getRegisteredReactionsMethod;
    if ((getRegisteredReactionsMethod = QueryGrpc.getRegisteredReactionsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRegisteredReactionsMethod = QueryGrpc.getRegisteredReactionsMethod) == null) {
          QueryGrpc.getRegisteredReactionsMethod = getRegisteredReactionsMethod =
              io.grpc.MethodDescriptor.<desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionsRequest, desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisteredReactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RegisteredReactions"))
              .build();
        }
      }
    }
    return getRegisteredReactionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionRequest,
      desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionResponse> getRegisteredReactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisteredReaction",
      requestType = desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionRequest.class,
      responseType = desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionRequest,
      desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionResponse> getRegisteredReactionMethod() {
    io.grpc.MethodDescriptor<desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionRequest, desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionResponse> getRegisteredReactionMethod;
    if ((getRegisteredReactionMethod = QueryGrpc.getRegisteredReactionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRegisteredReactionMethod = QueryGrpc.getRegisteredReactionMethod) == null) {
          QueryGrpc.getRegisteredReactionMethod = getRegisteredReactionMethod =
              io.grpc.MethodDescriptor.<desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionRequest, desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisteredReaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RegisteredReaction"))
              .build();
        }
      }
    }
    return getRegisteredReactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.reactions.v1.QueryOuterClass.QueryReactionsParamsRequest,
      desmos.reactions.v1.QueryOuterClass.QueryReactionsParamsResponse> getReactionsParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReactionsParams",
      requestType = desmos.reactions.v1.QueryOuterClass.QueryReactionsParamsRequest.class,
      responseType = desmos.reactions.v1.QueryOuterClass.QueryReactionsParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.reactions.v1.QueryOuterClass.QueryReactionsParamsRequest,
      desmos.reactions.v1.QueryOuterClass.QueryReactionsParamsResponse> getReactionsParamsMethod() {
    io.grpc.MethodDescriptor<desmos.reactions.v1.QueryOuterClass.QueryReactionsParamsRequest, desmos.reactions.v1.QueryOuterClass.QueryReactionsParamsResponse> getReactionsParamsMethod;
    if ((getReactionsParamsMethod = QueryGrpc.getReactionsParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getReactionsParamsMethod = QueryGrpc.getReactionsParamsMethod) == null) {
          QueryGrpc.getReactionsParamsMethod = getReactionsParamsMethod =
              io.grpc.MethodDescriptor.<desmos.reactions.v1.QueryOuterClass.QueryReactionsParamsRequest, desmos.reactions.v1.QueryOuterClass.QueryReactionsParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReactionsParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reactions.v1.QueryOuterClass.QueryReactionsParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.reactions.v1.QueryOuterClass.QueryReactionsParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ReactionsParams"))
              .build();
        }
      }
    }
    return getReactionsParamsMethod;
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
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static abstract class QueryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Reactions allows to query the reactions for a given post
     * </pre>
     */
    public void reactions(desmos.reactions.v1.QueryOuterClass.QueryReactionsRequest request,
        io.grpc.stub.StreamObserver<desmos.reactions.v1.QueryOuterClass.QueryReactionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReactionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reaction allows to query the reaction with the given id
     * </pre>
     */
    public void reaction(desmos.reactions.v1.QueryOuterClass.QueryReactionRequest request,
        io.grpc.stub.StreamObserver<desmos.reactions.v1.QueryOuterClass.QueryReactionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReactionMethod(), responseObserver);
    }

    /**
     * <pre>
     * RegisteredReactions allows to query the registered reaction of a subspace
     * </pre>
     */
    public void registeredReactions(desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionsRequest request,
        io.grpc.stub.StreamObserver<desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisteredReactionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * RegisteredReaction allows to query the registered reaction of a subspace
     * </pre>
     */
    public void registeredReaction(desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionRequest request,
        io.grpc.stub.StreamObserver<desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisteredReactionMethod(), responseObserver);
    }

    /**
     * <pre>
     * ReactionsParams allows to query the reaction params of a subspace
     * </pre>
     */
    public void reactionsParams(desmos.reactions.v1.QueryOuterClass.QueryReactionsParamsRequest request,
        io.grpc.stub.StreamObserver<desmos.reactions.v1.QueryOuterClass.QueryReactionsParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReactionsParamsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReactionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.reactions.v1.QueryOuterClass.QueryReactionsRequest,
                desmos.reactions.v1.QueryOuterClass.QueryReactionsResponse>(
                  this, METHODID_REACTIONS)))
          .addMethod(
            getReactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.reactions.v1.QueryOuterClass.QueryReactionRequest,
                desmos.reactions.v1.QueryOuterClass.QueryReactionResponse>(
                  this, METHODID_REACTION)))
          .addMethod(
            getRegisteredReactionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionsRequest,
                desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionsResponse>(
                  this, METHODID_REGISTERED_REACTIONS)))
          .addMethod(
            getRegisteredReactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionRequest,
                desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionResponse>(
                  this, METHODID_REGISTERED_REACTION)))
          .addMethod(
            getReactionsParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.reactions.v1.QueryOuterClass.QueryReactionsParamsRequest,
                desmos.reactions.v1.QueryOuterClass.QueryReactionsParamsResponse>(
                  this, METHODID_REACTIONS_PARAMS)))
          .build();
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service.
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
     * Reactions allows to query the reactions for a given post
     * </pre>
     */
    public void reactions(desmos.reactions.v1.QueryOuterClass.QueryReactionsRequest request,
        io.grpc.stub.StreamObserver<desmos.reactions.v1.QueryOuterClass.QueryReactionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReactionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reaction allows to query the reaction with the given id
     * </pre>
     */
    public void reaction(desmos.reactions.v1.QueryOuterClass.QueryReactionRequest request,
        io.grpc.stub.StreamObserver<desmos.reactions.v1.QueryOuterClass.QueryReactionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RegisteredReactions allows to query the registered reaction of a subspace
     * </pre>
     */
    public void registeredReactions(desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionsRequest request,
        io.grpc.stub.StreamObserver<desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisteredReactionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RegisteredReaction allows to query the registered reaction of a subspace
     * </pre>
     */
    public void registeredReaction(desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionRequest request,
        io.grpc.stub.StreamObserver<desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisteredReactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ReactionsParams allows to query the reaction params of a subspace
     * </pre>
     */
    public void reactionsParams(desmos.reactions.v1.QueryOuterClass.QueryReactionsParamsRequest request,
        io.grpc.stub.StreamObserver<desmos.reactions.v1.QueryOuterClass.QueryReactionsParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReactionsParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service.
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
     * Reactions allows to query the reactions for a given post
     * </pre>
     */
    public desmos.reactions.v1.QueryOuterClass.QueryReactionsResponse reactions(desmos.reactions.v1.QueryOuterClass.QueryReactionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getReactionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reaction allows to query the reaction with the given id
     * </pre>
     */
    public desmos.reactions.v1.QueryOuterClass.QueryReactionResponse reaction(desmos.reactions.v1.QueryOuterClass.QueryReactionRequest request) {
      return blockingUnaryCall(
          getChannel(), getReactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RegisteredReactions allows to query the registered reaction of a subspace
     * </pre>
     */
    public desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionsResponse registeredReactions(desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegisteredReactionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RegisteredReaction allows to query the registered reaction of a subspace
     * </pre>
     */
    public desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionResponse registeredReaction(desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegisteredReactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ReactionsParams allows to query the reaction params of a subspace
     * </pre>
     */
    public desmos.reactions.v1.QueryOuterClass.QueryReactionsParamsResponse reactionsParams(desmos.reactions.v1.QueryOuterClass.QueryReactionsParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getReactionsParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service.
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
     * Reactions allows to query the reactions for a given post
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.reactions.v1.QueryOuterClass.QueryReactionsResponse> reactions(
        desmos.reactions.v1.QueryOuterClass.QueryReactionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReactionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reaction allows to query the reaction with the given id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.reactions.v1.QueryOuterClass.QueryReactionResponse> reaction(
        desmos.reactions.v1.QueryOuterClass.QueryReactionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReactionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RegisteredReactions allows to query the registered reaction of a subspace
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionsResponse> registeredReactions(
        desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisteredReactionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RegisteredReaction allows to query the registered reaction of a subspace
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionResponse> registeredReaction(
        desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisteredReactionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ReactionsParams allows to query the reaction params of a subspace
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.reactions.v1.QueryOuterClass.QueryReactionsParamsResponse> reactionsParams(
        desmos.reactions.v1.QueryOuterClass.QueryReactionsParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReactionsParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REACTIONS = 0;
  private static final int METHODID_REACTION = 1;
  private static final int METHODID_REGISTERED_REACTIONS = 2;
  private static final int METHODID_REGISTERED_REACTION = 3;
  private static final int METHODID_REACTIONS_PARAMS = 4;

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
        case METHODID_REACTIONS:
          serviceImpl.reactions((desmos.reactions.v1.QueryOuterClass.QueryReactionsRequest) request,
              (io.grpc.stub.StreamObserver<desmos.reactions.v1.QueryOuterClass.QueryReactionsResponse>) responseObserver);
          break;
        case METHODID_REACTION:
          serviceImpl.reaction((desmos.reactions.v1.QueryOuterClass.QueryReactionRequest) request,
              (io.grpc.stub.StreamObserver<desmos.reactions.v1.QueryOuterClass.QueryReactionResponse>) responseObserver);
          break;
        case METHODID_REGISTERED_REACTIONS:
          serviceImpl.registeredReactions((desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionsRequest) request,
              (io.grpc.stub.StreamObserver<desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionsResponse>) responseObserver);
          break;
        case METHODID_REGISTERED_REACTION:
          serviceImpl.registeredReaction((desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionRequest) request,
              (io.grpc.stub.StreamObserver<desmos.reactions.v1.QueryOuterClass.QueryRegisteredReactionResponse>) responseObserver);
          break;
        case METHODID_REACTIONS_PARAMS:
          serviceImpl.reactionsParams((desmos.reactions.v1.QueryOuterClass.QueryReactionsParamsRequest) request,
              (io.grpc.stub.StreamObserver<desmos.reactions.v1.QueryOuterClass.QueryReactionsParamsResponse>) responseObserver);
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
      return desmos.reactions.v1.QueryOuterClass.getDescriptor();
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
              .addMethod(getReactionsMethod())
              .addMethod(getReactionMethod())
              .addMethod(getRegisteredReactionsMethod())
              .addMethod(getRegisteredReactionMethod())
              .addMethod(getReactionsParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
