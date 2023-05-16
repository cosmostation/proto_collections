package kyve.team.v1beta1;

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
    comments = "Source: kyve/team/v1beta1/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "kyve.team.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<kyve.team.v1beta1.QueryOuterClass.QueryTeamInfoRequest,
      kyve.team.v1beta1.QueryOuterClass.QueryTeamInfoResponse> getTeamInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TeamInfo",
      requestType = kyve.team.v1beta1.QueryOuterClass.QueryTeamInfoRequest.class,
      responseType = kyve.team.v1beta1.QueryOuterClass.QueryTeamInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.team.v1beta1.QueryOuterClass.QueryTeamInfoRequest,
      kyve.team.v1beta1.QueryOuterClass.QueryTeamInfoResponse> getTeamInfoMethod() {
    io.grpc.MethodDescriptor<kyve.team.v1beta1.QueryOuterClass.QueryTeamInfoRequest, kyve.team.v1beta1.QueryOuterClass.QueryTeamInfoResponse> getTeamInfoMethod;
    if ((getTeamInfoMethod = QueryGrpc.getTeamInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTeamInfoMethod = QueryGrpc.getTeamInfoMethod) == null) {
          QueryGrpc.getTeamInfoMethod = getTeamInfoMethod =
              io.grpc.MethodDescriptor.<kyve.team.v1beta1.QueryOuterClass.QueryTeamInfoRequest, kyve.team.v1beta1.QueryOuterClass.QueryTeamInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TeamInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.team.v1beta1.QueryOuterClass.QueryTeamInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.team.v1beta1.QueryOuterClass.QueryTeamInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TeamInfo"))
              .build();
        }
      }
    }
    return getTeamInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountsRequest,
      kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountsResponse> getTeamVestingAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TeamVestingAccounts",
      requestType = kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountsRequest.class,
      responseType = kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountsRequest,
      kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountsResponse> getTeamVestingAccountsMethod() {
    io.grpc.MethodDescriptor<kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountsRequest, kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountsResponse> getTeamVestingAccountsMethod;
    if ((getTeamVestingAccountsMethod = QueryGrpc.getTeamVestingAccountsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTeamVestingAccountsMethod = QueryGrpc.getTeamVestingAccountsMethod) == null) {
          QueryGrpc.getTeamVestingAccountsMethod = getTeamVestingAccountsMethod =
              io.grpc.MethodDescriptor.<kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountsRequest, kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TeamVestingAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TeamVestingAccounts"))
              .build();
        }
      }
    }
    return getTeamVestingAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountRequest,
      kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountResponse> getTeamVestingAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TeamVestingAccount",
      requestType = kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountRequest.class,
      responseType = kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountRequest,
      kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountResponse> getTeamVestingAccountMethod() {
    io.grpc.MethodDescriptor<kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountRequest, kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountResponse> getTeamVestingAccountMethod;
    if ((getTeamVestingAccountMethod = QueryGrpc.getTeamVestingAccountMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTeamVestingAccountMethod = QueryGrpc.getTeamVestingAccountMethod) == null) {
          QueryGrpc.getTeamVestingAccountMethod = getTeamVestingAccountMethod =
              io.grpc.MethodDescriptor.<kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountRequest, kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TeamVestingAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TeamVestingAccount"))
              .build();
        }
      }
    }
    return getTeamVestingAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusRequest,
      kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusResponse> getTeamVestingStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TeamVestingStatus",
      requestType = kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusRequest.class,
      responseType = kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusRequest,
      kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusResponse> getTeamVestingStatusMethod() {
    io.grpc.MethodDescriptor<kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusRequest, kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusResponse> getTeamVestingStatusMethod;
    if ((getTeamVestingStatusMethod = QueryGrpc.getTeamVestingStatusMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTeamVestingStatusMethod = QueryGrpc.getTeamVestingStatusMethod) == null) {
          QueryGrpc.getTeamVestingStatusMethod = getTeamVestingStatusMethod =
              io.grpc.MethodDescriptor.<kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusRequest, kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TeamVestingStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TeamVestingStatus"))
              .build();
        }
      }
    }
    return getTeamVestingStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusByTimeRequest,
      kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusByTimeResponse> getTeamVestingStatusByTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TeamVestingStatusByTime",
      requestType = kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusByTimeRequest.class,
      responseType = kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusByTimeRequest,
      kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusByTimeResponse> getTeamVestingStatusByTimeMethod() {
    io.grpc.MethodDescriptor<kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusByTimeRequest, kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusByTimeResponse> getTeamVestingStatusByTimeMethod;
    if ((getTeamVestingStatusByTimeMethod = QueryGrpc.getTeamVestingStatusByTimeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTeamVestingStatusByTimeMethod = QueryGrpc.getTeamVestingStatusByTimeMethod) == null) {
          QueryGrpc.getTeamVestingStatusByTimeMethod = getTeamVestingStatusByTimeMethod =
              io.grpc.MethodDescriptor.<kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusByTimeRequest, kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TeamVestingStatusByTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusByTimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusByTimeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TeamVestingStatusByTime"))
              .build();
        }
      }
    }
    return getTeamVestingStatusByTimeMethod;
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
     * TeamInfo queries all important information from the team module
     * </pre>
     */
    public void teamInfo(kyve.team.v1beta1.QueryOuterClass.QueryTeamInfoRequest request,
        io.grpc.stub.StreamObserver<kyve.team.v1beta1.QueryOuterClass.QueryTeamInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTeamInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * TeamVestingAccounts queries all team vesting accounts of the module.
     * </pre>
     */
    public void teamVestingAccounts(kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountsRequest request,
        io.grpc.stub.StreamObserver<kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTeamVestingAccountsMethod(), responseObserver);
    }

    /**
     * <pre>
     * TeamVestingAccount queries the team vesting accounts of the module.
     * </pre>
     */
    public void teamVestingAccount(kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountRequest request,
        io.grpc.stub.StreamObserver<kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTeamVestingAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * TeamCurrentVestingStatus queries the current vesting progress of a team vesting account
     * </pre>
     */
    public void teamVestingStatus(kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusRequest request,
        io.grpc.stub.StreamObserver<kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTeamVestingStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * TeamCurrentVestingStatus queries the current vesting progress of a team vesting account
     * </pre>
     */
    public void teamVestingStatusByTime(kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusByTimeRequest request,
        io.grpc.stub.StreamObserver<kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusByTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTeamVestingStatusByTimeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTeamInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.team.v1beta1.QueryOuterClass.QueryTeamInfoRequest,
                kyve.team.v1beta1.QueryOuterClass.QueryTeamInfoResponse>(
                  this, METHODID_TEAM_INFO)))
          .addMethod(
            getTeamVestingAccountsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountsRequest,
                kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountsResponse>(
                  this, METHODID_TEAM_VESTING_ACCOUNTS)))
          .addMethod(
            getTeamVestingAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountRequest,
                kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountResponse>(
                  this, METHODID_TEAM_VESTING_ACCOUNT)))
          .addMethod(
            getTeamVestingStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusRequest,
                kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusResponse>(
                  this, METHODID_TEAM_VESTING_STATUS)))
          .addMethod(
            getTeamVestingStatusByTimeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusByTimeRequest,
                kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusByTimeResponse>(
                  this, METHODID_TEAM_VESTING_STATUS_BY_TIME)))
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
     * TeamInfo queries all important information from the team module
     * </pre>
     */
    public void teamInfo(kyve.team.v1beta1.QueryOuterClass.QueryTeamInfoRequest request,
        io.grpc.stub.StreamObserver<kyve.team.v1beta1.QueryOuterClass.QueryTeamInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTeamInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TeamVestingAccounts queries all team vesting accounts of the module.
     * </pre>
     */
    public void teamVestingAccounts(kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountsRequest request,
        io.grpc.stub.StreamObserver<kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTeamVestingAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TeamVestingAccount queries the team vesting accounts of the module.
     * </pre>
     */
    public void teamVestingAccount(kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountRequest request,
        io.grpc.stub.StreamObserver<kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTeamVestingAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TeamCurrentVestingStatus queries the current vesting progress of a team vesting account
     * </pre>
     */
    public void teamVestingStatus(kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusRequest request,
        io.grpc.stub.StreamObserver<kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTeamVestingStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TeamCurrentVestingStatus queries the current vesting progress of a team vesting account
     * </pre>
     */
    public void teamVestingStatusByTime(kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusByTimeRequest request,
        io.grpc.stub.StreamObserver<kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusByTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTeamVestingStatusByTimeMethod(), getCallOptions()), request, responseObserver);
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
     * TeamInfo queries all important information from the team module
     * </pre>
     */
    public kyve.team.v1beta1.QueryOuterClass.QueryTeamInfoResponse teamInfo(kyve.team.v1beta1.QueryOuterClass.QueryTeamInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getTeamInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TeamVestingAccounts queries all team vesting accounts of the module.
     * </pre>
     */
    public kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountsResponse teamVestingAccounts(kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountsRequest request) {
      return blockingUnaryCall(
          getChannel(), getTeamVestingAccountsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TeamVestingAccount queries the team vesting accounts of the module.
     * </pre>
     */
    public kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountResponse teamVestingAccount(kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getTeamVestingAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TeamCurrentVestingStatus queries the current vesting progress of a team vesting account
     * </pre>
     */
    public kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusResponse teamVestingStatus(kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getTeamVestingStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TeamCurrentVestingStatus queries the current vesting progress of a team vesting account
     * </pre>
     */
    public kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusByTimeResponse teamVestingStatusByTime(kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusByTimeRequest request) {
      return blockingUnaryCall(
          getChannel(), getTeamVestingStatusByTimeMethod(), getCallOptions(), request);
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
     * TeamInfo queries all important information from the team module
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.team.v1beta1.QueryOuterClass.QueryTeamInfoResponse> teamInfo(
        kyve.team.v1beta1.QueryOuterClass.QueryTeamInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTeamInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TeamVestingAccounts queries all team vesting accounts of the module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountsResponse> teamVestingAccounts(
        kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTeamVestingAccountsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TeamVestingAccount queries the team vesting accounts of the module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountResponse> teamVestingAccount(
        kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTeamVestingAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TeamCurrentVestingStatus queries the current vesting progress of a team vesting account
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusResponse> teamVestingStatus(
        kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTeamVestingStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TeamCurrentVestingStatus queries the current vesting progress of a team vesting account
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusByTimeResponse> teamVestingStatusByTime(
        kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusByTimeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTeamVestingStatusByTimeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TEAM_INFO = 0;
  private static final int METHODID_TEAM_VESTING_ACCOUNTS = 1;
  private static final int METHODID_TEAM_VESTING_ACCOUNT = 2;
  private static final int METHODID_TEAM_VESTING_STATUS = 3;
  private static final int METHODID_TEAM_VESTING_STATUS_BY_TIME = 4;

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
        case METHODID_TEAM_INFO:
          serviceImpl.teamInfo((kyve.team.v1beta1.QueryOuterClass.QueryTeamInfoRequest) request,
              (io.grpc.stub.StreamObserver<kyve.team.v1beta1.QueryOuterClass.QueryTeamInfoResponse>) responseObserver);
          break;
        case METHODID_TEAM_VESTING_ACCOUNTS:
          serviceImpl.teamVestingAccounts((kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountsRequest) request,
              (io.grpc.stub.StreamObserver<kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountsResponse>) responseObserver);
          break;
        case METHODID_TEAM_VESTING_ACCOUNT:
          serviceImpl.teamVestingAccount((kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountRequest) request,
              (io.grpc.stub.StreamObserver<kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingAccountResponse>) responseObserver);
          break;
        case METHODID_TEAM_VESTING_STATUS:
          serviceImpl.teamVestingStatus((kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusRequest) request,
              (io.grpc.stub.StreamObserver<kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusResponse>) responseObserver);
          break;
        case METHODID_TEAM_VESTING_STATUS_BY_TIME:
          serviceImpl.teamVestingStatusByTime((kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusByTimeRequest) request,
              (io.grpc.stub.StreamObserver<kyve.team.v1beta1.QueryOuterClass.QueryTeamVestingStatusByTimeResponse>) responseObserver);
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
      return kyve.team.v1beta1.QueryOuterClass.getDescriptor();
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
              .addMethod(getTeamInfoMethod())
              .addMethod(getTeamVestingAccountsMethod())
              .addMethod(getTeamVestingAccountMethod())
              .addMethod(getTeamVestingStatusMethod())
              .addMethod(getTeamVestingStatusByTimeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
