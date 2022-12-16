package quicksilver.claimsmanager.v1;

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
 * Query provides defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: quicksilver/claimsmanager/v1/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "quicksilver.claimsmanager.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest,
      quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse> getClaimsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Claims",
      requestType = quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest.class,
      responseType = quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest,
      quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse> getClaimsMethod() {
    io.grpc.MethodDescriptor<quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest, quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse> getClaimsMethod;
    if ((getClaimsMethod = QueryGrpc.getClaimsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClaimsMethod = QueryGrpc.getClaimsMethod) == null) {
          QueryGrpc.getClaimsMethod = getClaimsMethod =
              io.grpc.MethodDescriptor.<quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest, quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Claims"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Claims"))
              .build();
        }
      }
    }
    return getClaimsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest,
      quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse> getLastEpochClaimsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LastEpochClaims",
      requestType = quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest.class,
      responseType = quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest,
      quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse> getLastEpochClaimsMethod() {
    io.grpc.MethodDescriptor<quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest, quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse> getLastEpochClaimsMethod;
    if ((getLastEpochClaimsMethod = QueryGrpc.getLastEpochClaimsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLastEpochClaimsMethod = QueryGrpc.getLastEpochClaimsMethod) == null) {
          QueryGrpc.getLastEpochClaimsMethod = getLastEpochClaimsMethod =
              io.grpc.MethodDescriptor.<quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest, quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LastEpochClaims"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LastEpochClaims"))
              .build();
        }
      }
    }
    return getLastEpochClaimsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest,
      quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse> getUserClaimsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserClaims",
      requestType = quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest.class,
      responseType = quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest,
      quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse> getUserClaimsMethod() {
    io.grpc.MethodDescriptor<quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest, quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse> getUserClaimsMethod;
    if ((getUserClaimsMethod = QueryGrpc.getUserClaimsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUserClaimsMethod = QueryGrpc.getUserClaimsMethod) == null) {
          QueryGrpc.getUserClaimsMethod = getUserClaimsMethod =
              io.grpc.MethodDescriptor.<quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest, quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserClaims"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UserClaims"))
              .build();
        }
      }
    }
    return getUserClaimsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest,
      quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse> getUserLastEpochClaimsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserLastEpochClaims",
      requestType = quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest.class,
      responseType = quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest,
      quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse> getUserLastEpochClaimsMethod() {
    io.grpc.MethodDescriptor<quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest, quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse> getUserLastEpochClaimsMethod;
    if ((getUserLastEpochClaimsMethod = QueryGrpc.getUserLastEpochClaimsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUserLastEpochClaimsMethod = QueryGrpc.getUserLastEpochClaimsMethod) == null) {
          QueryGrpc.getUserLastEpochClaimsMethod = getUserLastEpochClaimsMethod =
              io.grpc.MethodDescriptor.<quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest, quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserLastEpochClaims"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UserLastEpochClaims"))
              .build();
        }
      }
    }
    return getUserLastEpochClaimsMethod;
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
   * Query provides defines the gRPC querier service.
   * </pre>
   */
  public static abstract class QueryImplBase implements io.grpc.BindableService {

    /**
     */
    public void claims(quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest request,
        io.grpc.stub.StreamObserver<quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClaimsMethod(), responseObserver);
    }

    /**
     */
    public void lastEpochClaims(quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest request,
        io.grpc.stub.StreamObserver<quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLastEpochClaimsMethod(), responseObserver);
    }

    /**
     */
    public void userClaims(quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest request,
        io.grpc.stub.StreamObserver<quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserClaimsMethod(), responseObserver);
    }

    /**
     */
    public void userLastEpochClaims(quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest request,
        io.grpc.stub.StreamObserver<quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserLastEpochClaimsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getClaimsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest,
                quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse>(
                  this, METHODID_CLAIMS)))
          .addMethod(
            getLastEpochClaimsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest,
                quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse>(
                  this, METHODID_LAST_EPOCH_CLAIMS)))
          .addMethod(
            getUserClaimsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest,
                quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse>(
                  this, METHODID_USER_CLAIMS)))
          .addMethod(
            getUserLastEpochClaimsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest,
                quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse>(
                  this, METHODID_USER_LAST_EPOCH_CLAIMS)))
          .build();
    }
  }

  /**
   * <pre>
   * Query provides defines the gRPC querier service.
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
     */
    public void claims(quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest request,
        io.grpc.stub.StreamObserver<quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClaimsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lastEpochClaims(quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest request,
        io.grpc.stub.StreamObserver<quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLastEpochClaimsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void userClaims(quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest request,
        io.grpc.stub.StreamObserver<quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserClaimsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void userLastEpochClaims(quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest request,
        io.grpc.stub.StreamObserver<quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserLastEpochClaimsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Query provides defines the gRPC querier service.
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
     */
    public quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse claims(quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest request) {
      return blockingUnaryCall(
          getChannel(), getClaimsMethod(), getCallOptions(), request);
    }

    /**
     */
    public quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse lastEpochClaims(quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest request) {
      return blockingUnaryCall(
          getChannel(), getLastEpochClaimsMethod(), getCallOptions(), request);
    }

    /**
     */
    public quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse userClaims(quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUserClaimsMethod(), getCallOptions(), request);
    }

    /**
     */
    public quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse userLastEpochClaims(quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUserLastEpochClaimsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Query provides defines the gRPC querier service.
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
     */
    public com.google.common.util.concurrent.ListenableFuture<quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse> claims(
        quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getClaimsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse> lastEpochClaims(
        quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLastEpochClaimsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse> userClaims(
        quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUserClaimsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse> userLastEpochClaims(
        quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUserLastEpochClaimsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CLAIMS = 0;
  private static final int METHODID_LAST_EPOCH_CLAIMS = 1;
  private static final int METHODID_USER_CLAIMS = 2;
  private static final int METHODID_USER_LAST_EPOCH_CLAIMS = 3;

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
        case METHODID_CLAIMS:
          serviceImpl.claims((quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest) request,
              (io.grpc.stub.StreamObserver<quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse>) responseObserver);
          break;
        case METHODID_LAST_EPOCH_CLAIMS:
          serviceImpl.lastEpochClaims((quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest) request,
              (io.grpc.stub.StreamObserver<quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse>) responseObserver);
          break;
        case METHODID_USER_CLAIMS:
          serviceImpl.userClaims((quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest) request,
              (io.grpc.stub.StreamObserver<quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse>) responseObserver);
          break;
        case METHODID_USER_LAST_EPOCH_CLAIMS:
          serviceImpl.userLastEpochClaims((quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsRequest) request,
              (io.grpc.stub.StreamObserver<quicksilver.claimsmanager.v1.QueryOuterClass.QueryClaimsResponse>) responseObserver);
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
      return quicksilver.claimsmanager.v1.QueryOuterClass.getDescriptor();
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
              .addMethod(getClaimsMethod())
              .addMethod(getLastEpochClaimsMethod())
              .addMethod(getUserClaimsMethod())
              .addMethod(getUserLastEpochClaimsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
