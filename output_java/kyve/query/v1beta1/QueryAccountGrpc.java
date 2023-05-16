package kyve.query.v1beta1;

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
 * QueryDelegation contains all rpc requests related to direct delegation data
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: kyve/query/v1beta1/account.proto")
public final class QueryAccountGrpc {

  private QueryAccountGrpc() {}

  public static final String SERVICE_NAME = "kyve.query.v1beta1.QueryAccount";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<kyve.query.v1beta1.Account.QueryAccountAssetsRequest,
      kyve.query.v1beta1.Account.QueryAccountAssetsResponse> getAccountAssetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountAssets",
      requestType = kyve.query.v1beta1.Account.QueryAccountAssetsRequest.class,
      responseType = kyve.query.v1beta1.Account.QueryAccountAssetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.query.v1beta1.Account.QueryAccountAssetsRequest,
      kyve.query.v1beta1.Account.QueryAccountAssetsResponse> getAccountAssetsMethod() {
    io.grpc.MethodDescriptor<kyve.query.v1beta1.Account.QueryAccountAssetsRequest, kyve.query.v1beta1.Account.QueryAccountAssetsResponse> getAccountAssetsMethod;
    if ((getAccountAssetsMethod = QueryAccountGrpc.getAccountAssetsMethod) == null) {
      synchronized (QueryAccountGrpc.class) {
        if ((getAccountAssetsMethod = QueryAccountGrpc.getAccountAssetsMethod) == null) {
          QueryAccountGrpc.getAccountAssetsMethod = getAccountAssetsMethod =
              io.grpc.MethodDescriptor.<kyve.query.v1beta1.Account.QueryAccountAssetsRequest, kyve.query.v1beta1.Account.QueryAccountAssetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountAssets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Account.QueryAccountAssetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Account.QueryAccountAssetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryAccountMethodDescriptorSupplier("AccountAssets"))
              .build();
        }
      }
    }
    return getAccountAssetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.query.v1beta1.Account.QueryAccountDelegationUnbondingsRequest,
      kyve.query.v1beta1.Account.QueryAccountDelegationUnbondingsResponse> getAccountDelegationUnbondingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountDelegationUnbondings",
      requestType = kyve.query.v1beta1.Account.QueryAccountDelegationUnbondingsRequest.class,
      responseType = kyve.query.v1beta1.Account.QueryAccountDelegationUnbondingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.query.v1beta1.Account.QueryAccountDelegationUnbondingsRequest,
      kyve.query.v1beta1.Account.QueryAccountDelegationUnbondingsResponse> getAccountDelegationUnbondingsMethod() {
    io.grpc.MethodDescriptor<kyve.query.v1beta1.Account.QueryAccountDelegationUnbondingsRequest, kyve.query.v1beta1.Account.QueryAccountDelegationUnbondingsResponse> getAccountDelegationUnbondingsMethod;
    if ((getAccountDelegationUnbondingsMethod = QueryAccountGrpc.getAccountDelegationUnbondingsMethod) == null) {
      synchronized (QueryAccountGrpc.class) {
        if ((getAccountDelegationUnbondingsMethod = QueryAccountGrpc.getAccountDelegationUnbondingsMethod) == null) {
          QueryAccountGrpc.getAccountDelegationUnbondingsMethod = getAccountDelegationUnbondingsMethod =
              io.grpc.MethodDescriptor.<kyve.query.v1beta1.Account.QueryAccountDelegationUnbondingsRequest, kyve.query.v1beta1.Account.QueryAccountDelegationUnbondingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountDelegationUnbondings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Account.QueryAccountDelegationUnbondingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Account.QueryAccountDelegationUnbondingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryAccountMethodDescriptorSupplier("AccountDelegationUnbondings"))
              .build();
        }
      }
    }
    return getAccountDelegationUnbondingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.query.v1beta1.Account.QueryAccountFundedListRequest,
      kyve.query.v1beta1.Account.QueryAccountFundedListResponse> getAccountFundedListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountFundedList",
      requestType = kyve.query.v1beta1.Account.QueryAccountFundedListRequest.class,
      responseType = kyve.query.v1beta1.Account.QueryAccountFundedListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.query.v1beta1.Account.QueryAccountFundedListRequest,
      kyve.query.v1beta1.Account.QueryAccountFundedListResponse> getAccountFundedListMethod() {
    io.grpc.MethodDescriptor<kyve.query.v1beta1.Account.QueryAccountFundedListRequest, kyve.query.v1beta1.Account.QueryAccountFundedListResponse> getAccountFundedListMethod;
    if ((getAccountFundedListMethod = QueryAccountGrpc.getAccountFundedListMethod) == null) {
      synchronized (QueryAccountGrpc.class) {
        if ((getAccountFundedListMethod = QueryAccountGrpc.getAccountFundedListMethod) == null) {
          QueryAccountGrpc.getAccountFundedListMethod = getAccountFundedListMethod =
              io.grpc.MethodDescriptor.<kyve.query.v1beta1.Account.QueryAccountFundedListRequest, kyve.query.v1beta1.Account.QueryAccountFundedListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountFundedList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Account.QueryAccountFundedListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Account.QueryAccountFundedListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryAccountMethodDescriptorSupplier("AccountFundedList"))
              .build();
        }
      }
    }
    return getAccountFundedListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.query.v1beta1.Account.QueryAccountRedelegationRequest,
      kyve.query.v1beta1.Account.QueryAccountRedelegationResponse> getAccountRedelegationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountRedelegation",
      requestType = kyve.query.v1beta1.Account.QueryAccountRedelegationRequest.class,
      responseType = kyve.query.v1beta1.Account.QueryAccountRedelegationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.query.v1beta1.Account.QueryAccountRedelegationRequest,
      kyve.query.v1beta1.Account.QueryAccountRedelegationResponse> getAccountRedelegationMethod() {
    io.grpc.MethodDescriptor<kyve.query.v1beta1.Account.QueryAccountRedelegationRequest, kyve.query.v1beta1.Account.QueryAccountRedelegationResponse> getAccountRedelegationMethod;
    if ((getAccountRedelegationMethod = QueryAccountGrpc.getAccountRedelegationMethod) == null) {
      synchronized (QueryAccountGrpc.class) {
        if ((getAccountRedelegationMethod = QueryAccountGrpc.getAccountRedelegationMethod) == null) {
          QueryAccountGrpc.getAccountRedelegationMethod = getAccountRedelegationMethod =
              io.grpc.MethodDescriptor.<kyve.query.v1beta1.Account.QueryAccountRedelegationRequest, kyve.query.v1beta1.Account.QueryAccountRedelegationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountRedelegation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Account.QueryAccountRedelegationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.query.v1beta1.Account.QueryAccountRedelegationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryAccountMethodDescriptorSupplier("AccountRedelegation"))
              .build();
        }
      }
    }
    return getAccountRedelegationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryAccountStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryAccountStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryAccountStub>() {
        @java.lang.Override
        public QueryAccountStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryAccountStub(channel, callOptions);
        }
      };
    return QueryAccountStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryAccountBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryAccountBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryAccountBlockingStub>() {
        @java.lang.Override
        public QueryAccountBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryAccountBlockingStub(channel, callOptions);
        }
      };
    return QueryAccountBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryAccountFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryAccountFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryAccountFutureStub>() {
        @java.lang.Override
        public QueryAccountFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryAccountFutureStub(channel, callOptions);
        }
      };
    return QueryAccountFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * QueryDelegation contains all rpc requests related to direct delegation data
   * </pre>
   */
  public static abstract class QueryAccountImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * AccountAssets returns an overview of the sum of all balances for a given user. e.g. balance, staking, funding, etc.
     * </pre>
     */
    public void accountAssets(kyve.query.v1beta1.Account.QueryAccountAssetsRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Account.QueryAccountAssetsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAccountAssetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * AccountDelegationUnbondings ...
     * </pre>
     */
    public void accountDelegationUnbondings(kyve.query.v1beta1.Account.QueryAccountDelegationUnbondingsRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Account.QueryAccountDelegationUnbondingsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAccountDelegationUnbondingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * AccountFundedList returns all pools the given user has funded into.
     * </pre>
     */
    public void accountFundedList(kyve.query.v1beta1.Account.QueryAccountFundedListRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Account.QueryAccountFundedListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAccountFundedListMethod(), responseObserver);
    }

    /**
     * <pre>
     * AccountRedelegation ...
     * </pre>
     */
    public void accountRedelegation(kyve.query.v1beta1.Account.QueryAccountRedelegationRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Account.QueryAccountRedelegationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAccountRedelegationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAccountAssetsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.query.v1beta1.Account.QueryAccountAssetsRequest,
                kyve.query.v1beta1.Account.QueryAccountAssetsResponse>(
                  this, METHODID_ACCOUNT_ASSETS)))
          .addMethod(
            getAccountDelegationUnbondingsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.query.v1beta1.Account.QueryAccountDelegationUnbondingsRequest,
                kyve.query.v1beta1.Account.QueryAccountDelegationUnbondingsResponse>(
                  this, METHODID_ACCOUNT_DELEGATION_UNBONDINGS)))
          .addMethod(
            getAccountFundedListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.query.v1beta1.Account.QueryAccountFundedListRequest,
                kyve.query.v1beta1.Account.QueryAccountFundedListResponse>(
                  this, METHODID_ACCOUNT_FUNDED_LIST)))
          .addMethod(
            getAccountRedelegationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.query.v1beta1.Account.QueryAccountRedelegationRequest,
                kyve.query.v1beta1.Account.QueryAccountRedelegationResponse>(
                  this, METHODID_ACCOUNT_REDELEGATION)))
          .build();
    }
  }

  /**
   * <pre>
   * QueryDelegation contains all rpc requests related to direct delegation data
   * </pre>
   */
  public static final class QueryAccountStub extends io.grpc.stub.AbstractAsyncStub<QueryAccountStub> {
    private QueryAccountStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryAccountStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryAccountStub(channel, callOptions);
    }

    /**
     * <pre>
     * AccountAssets returns an overview of the sum of all balances for a given user. e.g. balance, staking, funding, etc.
     * </pre>
     */
    public void accountAssets(kyve.query.v1beta1.Account.QueryAccountAssetsRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Account.QueryAccountAssetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAccountAssetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AccountDelegationUnbondings ...
     * </pre>
     */
    public void accountDelegationUnbondings(kyve.query.v1beta1.Account.QueryAccountDelegationUnbondingsRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Account.QueryAccountDelegationUnbondingsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAccountDelegationUnbondingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AccountFundedList returns all pools the given user has funded into.
     * </pre>
     */
    public void accountFundedList(kyve.query.v1beta1.Account.QueryAccountFundedListRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Account.QueryAccountFundedListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAccountFundedListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AccountRedelegation ...
     * </pre>
     */
    public void accountRedelegation(kyve.query.v1beta1.Account.QueryAccountRedelegationRequest request,
        io.grpc.stub.StreamObserver<kyve.query.v1beta1.Account.QueryAccountRedelegationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAccountRedelegationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * QueryDelegation contains all rpc requests related to direct delegation data
   * </pre>
   */
  public static final class QueryAccountBlockingStub extends io.grpc.stub.AbstractBlockingStub<QueryAccountBlockingStub> {
    private QueryAccountBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryAccountBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryAccountBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * AccountAssets returns an overview of the sum of all balances for a given user. e.g. balance, staking, funding, etc.
     * </pre>
     */
    public kyve.query.v1beta1.Account.QueryAccountAssetsResponse accountAssets(kyve.query.v1beta1.Account.QueryAccountAssetsRequest request) {
      return blockingUnaryCall(
          getChannel(), getAccountAssetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AccountDelegationUnbondings ...
     * </pre>
     */
    public kyve.query.v1beta1.Account.QueryAccountDelegationUnbondingsResponse accountDelegationUnbondings(kyve.query.v1beta1.Account.QueryAccountDelegationUnbondingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getAccountDelegationUnbondingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AccountFundedList returns all pools the given user has funded into.
     * </pre>
     */
    public kyve.query.v1beta1.Account.QueryAccountFundedListResponse accountFundedList(kyve.query.v1beta1.Account.QueryAccountFundedListRequest request) {
      return blockingUnaryCall(
          getChannel(), getAccountFundedListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AccountRedelegation ...
     * </pre>
     */
    public kyve.query.v1beta1.Account.QueryAccountRedelegationResponse accountRedelegation(kyve.query.v1beta1.Account.QueryAccountRedelegationRequest request) {
      return blockingUnaryCall(
          getChannel(), getAccountRedelegationMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * QueryDelegation contains all rpc requests related to direct delegation data
   * </pre>
   */
  public static final class QueryAccountFutureStub extends io.grpc.stub.AbstractFutureStub<QueryAccountFutureStub> {
    private QueryAccountFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryAccountFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryAccountFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * AccountAssets returns an overview of the sum of all balances for a given user. e.g. balance, staking, funding, etc.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.query.v1beta1.Account.QueryAccountAssetsResponse> accountAssets(
        kyve.query.v1beta1.Account.QueryAccountAssetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAccountAssetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AccountDelegationUnbondings ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.query.v1beta1.Account.QueryAccountDelegationUnbondingsResponse> accountDelegationUnbondings(
        kyve.query.v1beta1.Account.QueryAccountDelegationUnbondingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAccountDelegationUnbondingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AccountFundedList returns all pools the given user has funded into.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.query.v1beta1.Account.QueryAccountFundedListResponse> accountFundedList(
        kyve.query.v1beta1.Account.QueryAccountFundedListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAccountFundedListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AccountRedelegation ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.query.v1beta1.Account.QueryAccountRedelegationResponse> accountRedelegation(
        kyve.query.v1beta1.Account.QueryAccountRedelegationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAccountRedelegationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ACCOUNT_ASSETS = 0;
  private static final int METHODID_ACCOUNT_DELEGATION_UNBONDINGS = 1;
  private static final int METHODID_ACCOUNT_FUNDED_LIST = 2;
  private static final int METHODID_ACCOUNT_REDELEGATION = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QueryAccountImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QueryAccountImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ACCOUNT_ASSETS:
          serviceImpl.accountAssets((kyve.query.v1beta1.Account.QueryAccountAssetsRequest) request,
              (io.grpc.stub.StreamObserver<kyve.query.v1beta1.Account.QueryAccountAssetsResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_DELEGATION_UNBONDINGS:
          serviceImpl.accountDelegationUnbondings((kyve.query.v1beta1.Account.QueryAccountDelegationUnbondingsRequest) request,
              (io.grpc.stub.StreamObserver<kyve.query.v1beta1.Account.QueryAccountDelegationUnbondingsResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_FUNDED_LIST:
          serviceImpl.accountFundedList((kyve.query.v1beta1.Account.QueryAccountFundedListRequest) request,
              (io.grpc.stub.StreamObserver<kyve.query.v1beta1.Account.QueryAccountFundedListResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_REDELEGATION:
          serviceImpl.accountRedelegation((kyve.query.v1beta1.Account.QueryAccountRedelegationRequest) request,
              (io.grpc.stub.StreamObserver<kyve.query.v1beta1.Account.QueryAccountRedelegationResponse>) responseObserver);
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

  private static abstract class QueryAccountBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryAccountBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return kyve.query.v1beta1.Account.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QueryAccount");
    }
  }

  private static final class QueryAccountFileDescriptorSupplier
      extends QueryAccountBaseDescriptorSupplier {
    QueryAccountFileDescriptorSupplier() {}
  }

  private static final class QueryAccountMethodDescriptorSupplier
      extends QueryAccountBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryAccountMethodDescriptorSupplier(String methodName) {
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
      synchronized (QueryAccountGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryAccountFileDescriptorSupplier())
              .addMethod(getAccountAssetsMethod())
              .addMethod(getAccountDelegationUnbondingsMethod())
              .addMethod(getAccountFundedListMethod())
              .addMethod(getAccountRedelegationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
