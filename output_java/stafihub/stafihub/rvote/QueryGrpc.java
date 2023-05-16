package stafihub.stafihub.rvote;

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
    comments = "Source: stafihub/rvote/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "stafihub.stafihub.rvote.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalRequest,
      stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalResponse> getGetProposalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProposal",
      requestType = stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalRequest.class,
      responseType = stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalRequest,
      stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalResponse> getGetProposalMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalRequest, stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalResponse> getGetProposalMethod;
    if ((getGetProposalMethod = QueryGrpc.getGetProposalMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetProposalMethod = QueryGrpc.getGetProposalMethod) == null) {
          QueryGrpc.getGetProposalMethod = getGetProposalMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalRequest, stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProposal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetProposal"))
              .build();
        }
      }
    }
    return getGetProposalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalLifeRequest,
      stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalLifeResponse> getGetProposalLifeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProposalLife",
      requestType = stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalLifeRequest.class,
      responseType = stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalLifeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalLifeRequest,
      stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalLifeResponse> getGetProposalLifeMethod() {
    io.grpc.MethodDescriptor<stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalLifeRequest, stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalLifeResponse> getGetProposalLifeMethod;
    if ((getGetProposalLifeMethod = QueryGrpc.getGetProposalLifeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetProposalLifeMethod = QueryGrpc.getGetProposalLifeMethod) == null) {
          QueryGrpc.getGetProposalLifeMethod = getGetProposalLifeMethod =
              io.grpc.MethodDescriptor.<stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalLifeRequest, stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalLifeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProposalLife"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalLifeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalLifeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetProposalLife"))
              .build();
        }
      }
    }
    return getGetProposalLifeMethod;
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
     * Queries a list of getProposal items.
     * </pre>
     */
    public void getProposal(stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProposalMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getProposalLife items.
     * </pre>
     */
    public void getProposalLife(stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalLifeRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalLifeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProposalLifeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetProposalMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalRequest,
                stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalResponse>(
                  this, METHODID_GET_PROPOSAL)))
          .addMethod(
            getGetProposalLifeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalLifeRequest,
                stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalLifeResponse>(
                  this, METHODID_GET_PROPOSAL_LIFE)))
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
     * Queries a list of getProposal items.
     * </pre>
     */
    public void getProposal(stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProposalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getProposalLife items.
     * </pre>
     */
    public void getProposalLife(stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalLifeRequest request,
        io.grpc.stub.StreamObserver<stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalLifeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProposalLifeMethod(), getCallOptions()), request, responseObserver);
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
     * Queries a list of getProposal items.
     * </pre>
     */
    public stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalResponse getProposal(stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProposalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getProposalLife items.
     * </pre>
     */
    public stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalLifeResponse getProposalLife(stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalLifeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProposalLifeMethod(), getCallOptions(), request);
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
     * Queries a list of getProposal items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalResponse> getProposal(
        stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProposalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getProposalLife items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalLifeResponse> getProposalLife(
        stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalLifeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProposalLifeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PROPOSAL = 0;
  private static final int METHODID_GET_PROPOSAL_LIFE = 1;

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
        case METHODID_GET_PROPOSAL:
          serviceImpl.getProposal((stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalResponse>) responseObserver);
          break;
        case METHODID_GET_PROPOSAL_LIFE:
          serviceImpl.getProposalLife((stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalLifeRequest) request,
              (io.grpc.stub.StreamObserver<stafihub.stafihub.rvote.QueryOuterClass.QueryGetProposalLifeResponse>) responseObserver);
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
      return stafihub.stafihub.rvote.QueryOuterClass.getDescriptor();
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
              .addMethod(getGetProposalMethod())
              .addMethod(getGetProposalLifeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
