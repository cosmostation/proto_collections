package neutron.interchainqueries;

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
    comments = "Source: neutron/interchainqueries/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "neutron.interchainqueries.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<neutron.interchainqueries.Tx.MsgRegisterInterchainQuery,
      neutron.interchainqueries.Tx.MsgRegisterInterchainQueryResponse> getRegisterInterchainQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterInterchainQuery",
      requestType = neutron.interchainqueries.Tx.MsgRegisterInterchainQuery.class,
      responseType = neutron.interchainqueries.Tx.MsgRegisterInterchainQueryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<neutron.interchainqueries.Tx.MsgRegisterInterchainQuery,
      neutron.interchainqueries.Tx.MsgRegisterInterchainQueryResponse> getRegisterInterchainQueryMethod() {
    io.grpc.MethodDescriptor<neutron.interchainqueries.Tx.MsgRegisterInterchainQuery, neutron.interchainqueries.Tx.MsgRegisterInterchainQueryResponse> getRegisterInterchainQueryMethod;
    if ((getRegisterInterchainQueryMethod = MsgGrpc.getRegisterInterchainQueryMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRegisterInterchainQueryMethod = MsgGrpc.getRegisterInterchainQueryMethod) == null) {
          MsgGrpc.getRegisterInterchainQueryMethod = getRegisterInterchainQueryMethod =
              io.grpc.MethodDescriptor.<neutron.interchainqueries.Tx.MsgRegisterInterchainQuery, neutron.interchainqueries.Tx.MsgRegisterInterchainQueryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterInterchainQuery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.interchainqueries.Tx.MsgRegisterInterchainQuery.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.interchainqueries.Tx.MsgRegisterInterchainQueryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RegisterInterchainQuery"))
              .build();
        }
      }
    }
    return getRegisterInterchainQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<neutron.interchainqueries.Tx.MsgSubmitQueryResult,
      neutron.interchainqueries.Tx.MsgSubmitQueryResultResponse> getSubmitQueryResultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitQueryResult",
      requestType = neutron.interchainqueries.Tx.MsgSubmitQueryResult.class,
      responseType = neutron.interchainqueries.Tx.MsgSubmitQueryResultResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<neutron.interchainqueries.Tx.MsgSubmitQueryResult,
      neutron.interchainqueries.Tx.MsgSubmitQueryResultResponse> getSubmitQueryResultMethod() {
    io.grpc.MethodDescriptor<neutron.interchainqueries.Tx.MsgSubmitQueryResult, neutron.interchainqueries.Tx.MsgSubmitQueryResultResponse> getSubmitQueryResultMethod;
    if ((getSubmitQueryResultMethod = MsgGrpc.getSubmitQueryResultMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSubmitQueryResultMethod = MsgGrpc.getSubmitQueryResultMethod) == null) {
          MsgGrpc.getSubmitQueryResultMethod = getSubmitQueryResultMethod =
              io.grpc.MethodDescriptor.<neutron.interchainqueries.Tx.MsgSubmitQueryResult, neutron.interchainqueries.Tx.MsgSubmitQueryResultResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitQueryResult"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.interchainqueries.Tx.MsgSubmitQueryResult.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.interchainqueries.Tx.MsgSubmitQueryResultResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SubmitQueryResult"))
              .build();
        }
      }
    }
    return getSubmitQueryResultMethod;
  }

  private static volatile io.grpc.MethodDescriptor<neutron.interchainqueries.Tx.MsgRemoveInterchainQueryRequest,
      neutron.interchainqueries.Tx.MsgRemoveInterchainQueryResponse> getRemoveInterchainQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveInterchainQuery",
      requestType = neutron.interchainqueries.Tx.MsgRemoveInterchainQueryRequest.class,
      responseType = neutron.interchainqueries.Tx.MsgRemoveInterchainQueryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<neutron.interchainqueries.Tx.MsgRemoveInterchainQueryRequest,
      neutron.interchainqueries.Tx.MsgRemoveInterchainQueryResponse> getRemoveInterchainQueryMethod() {
    io.grpc.MethodDescriptor<neutron.interchainqueries.Tx.MsgRemoveInterchainQueryRequest, neutron.interchainqueries.Tx.MsgRemoveInterchainQueryResponse> getRemoveInterchainQueryMethod;
    if ((getRemoveInterchainQueryMethod = MsgGrpc.getRemoveInterchainQueryMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemoveInterchainQueryMethod = MsgGrpc.getRemoveInterchainQueryMethod) == null) {
          MsgGrpc.getRemoveInterchainQueryMethod = getRemoveInterchainQueryMethod =
              io.grpc.MethodDescriptor.<neutron.interchainqueries.Tx.MsgRemoveInterchainQueryRequest, neutron.interchainqueries.Tx.MsgRemoveInterchainQueryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveInterchainQuery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.interchainqueries.Tx.MsgRemoveInterchainQueryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.interchainqueries.Tx.MsgRemoveInterchainQueryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemoveInterchainQuery"))
              .build();
        }
      }
    }
    return getRemoveInterchainQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<neutron.interchainqueries.Tx.MsgUpdateInterchainQueryRequest,
      neutron.interchainqueries.Tx.MsgUpdateInterchainQueryResponse> getUpdateInterchainQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateInterchainQuery",
      requestType = neutron.interchainqueries.Tx.MsgUpdateInterchainQueryRequest.class,
      responseType = neutron.interchainqueries.Tx.MsgUpdateInterchainQueryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<neutron.interchainqueries.Tx.MsgUpdateInterchainQueryRequest,
      neutron.interchainqueries.Tx.MsgUpdateInterchainQueryResponse> getUpdateInterchainQueryMethod() {
    io.grpc.MethodDescriptor<neutron.interchainqueries.Tx.MsgUpdateInterchainQueryRequest, neutron.interchainqueries.Tx.MsgUpdateInterchainQueryResponse> getUpdateInterchainQueryMethod;
    if ((getUpdateInterchainQueryMethod = MsgGrpc.getUpdateInterchainQueryMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateInterchainQueryMethod = MsgGrpc.getUpdateInterchainQueryMethod) == null) {
          MsgGrpc.getUpdateInterchainQueryMethod = getUpdateInterchainQueryMethod =
              io.grpc.MethodDescriptor.<neutron.interchainqueries.Tx.MsgUpdateInterchainQueryRequest, neutron.interchainqueries.Tx.MsgUpdateInterchainQueryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateInterchainQuery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.interchainqueries.Tx.MsgUpdateInterchainQueryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  neutron.interchainqueries.Tx.MsgUpdateInterchainQueryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateInterchainQuery"))
              .build();
        }
      }
    }
    return getUpdateInterchainQueryMethod;
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
    public void registerInterchainQuery(neutron.interchainqueries.Tx.MsgRegisterInterchainQuery request,
        io.grpc.stub.StreamObserver<neutron.interchainqueries.Tx.MsgRegisterInterchainQueryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterInterchainQueryMethod(), responseObserver);
    }

    /**
     */
    public void submitQueryResult(neutron.interchainqueries.Tx.MsgSubmitQueryResult request,
        io.grpc.stub.StreamObserver<neutron.interchainqueries.Tx.MsgSubmitQueryResultResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSubmitQueryResultMethod(), responseObserver);
    }

    /**
     */
    public void removeInterchainQuery(neutron.interchainqueries.Tx.MsgRemoveInterchainQueryRequest request,
        io.grpc.stub.StreamObserver<neutron.interchainqueries.Tx.MsgRemoveInterchainQueryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveInterchainQueryMethod(), responseObserver);
    }

    /**
     */
    public void updateInterchainQuery(neutron.interchainqueries.Tx.MsgUpdateInterchainQueryRequest request,
        io.grpc.stub.StreamObserver<neutron.interchainqueries.Tx.MsgUpdateInterchainQueryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateInterchainQueryMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterInterchainQueryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                neutron.interchainqueries.Tx.MsgRegisterInterchainQuery,
                neutron.interchainqueries.Tx.MsgRegisterInterchainQueryResponse>(
                  this, METHODID_REGISTER_INTERCHAIN_QUERY)))
          .addMethod(
            getSubmitQueryResultMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                neutron.interchainqueries.Tx.MsgSubmitQueryResult,
                neutron.interchainqueries.Tx.MsgSubmitQueryResultResponse>(
                  this, METHODID_SUBMIT_QUERY_RESULT)))
          .addMethod(
            getRemoveInterchainQueryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                neutron.interchainqueries.Tx.MsgRemoveInterchainQueryRequest,
                neutron.interchainqueries.Tx.MsgRemoveInterchainQueryResponse>(
                  this, METHODID_REMOVE_INTERCHAIN_QUERY)))
          .addMethod(
            getUpdateInterchainQueryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                neutron.interchainqueries.Tx.MsgUpdateInterchainQueryRequest,
                neutron.interchainqueries.Tx.MsgUpdateInterchainQueryResponse>(
                  this, METHODID_UPDATE_INTERCHAIN_QUERY)))
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
    public void registerInterchainQuery(neutron.interchainqueries.Tx.MsgRegisterInterchainQuery request,
        io.grpc.stub.StreamObserver<neutron.interchainqueries.Tx.MsgRegisterInterchainQueryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterInterchainQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void submitQueryResult(neutron.interchainqueries.Tx.MsgSubmitQueryResult request,
        io.grpc.stub.StreamObserver<neutron.interchainqueries.Tx.MsgSubmitQueryResultResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubmitQueryResultMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeInterchainQuery(neutron.interchainqueries.Tx.MsgRemoveInterchainQueryRequest request,
        io.grpc.stub.StreamObserver<neutron.interchainqueries.Tx.MsgRemoveInterchainQueryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveInterchainQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateInterchainQuery(neutron.interchainqueries.Tx.MsgUpdateInterchainQueryRequest request,
        io.grpc.stub.StreamObserver<neutron.interchainqueries.Tx.MsgUpdateInterchainQueryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateInterchainQueryMethod(), getCallOptions()), request, responseObserver);
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
    public neutron.interchainqueries.Tx.MsgRegisterInterchainQueryResponse registerInterchainQuery(neutron.interchainqueries.Tx.MsgRegisterInterchainQuery request) {
      return blockingUnaryCall(
          getChannel(), getRegisterInterchainQueryMethod(), getCallOptions(), request);
    }

    /**
     */
    public neutron.interchainqueries.Tx.MsgSubmitQueryResultResponse submitQueryResult(neutron.interchainqueries.Tx.MsgSubmitQueryResult request) {
      return blockingUnaryCall(
          getChannel(), getSubmitQueryResultMethod(), getCallOptions(), request);
    }

    /**
     */
    public neutron.interchainqueries.Tx.MsgRemoveInterchainQueryResponse removeInterchainQuery(neutron.interchainqueries.Tx.MsgRemoveInterchainQueryRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveInterchainQueryMethod(), getCallOptions(), request);
    }

    /**
     */
    public neutron.interchainqueries.Tx.MsgUpdateInterchainQueryResponse updateInterchainQuery(neutron.interchainqueries.Tx.MsgUpdateInterchainQueryRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateInterchainQueryMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<neutron.interchainqueries.Tx.MsgRegisterInterchainQueryResponse> registerInterchainQuery(
        neutron.interchainqueries.Tx.MsgRegisterInterchainQuery request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterInterchainQueryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<neutron.interchainqueries.Tx.MsgSubmitQueryResultResponse> submitQueryResult(
        neutron.interchainqueries.Tx.MsgSubmitQueryResult request) {
      return futureUnaryCall(
          getChannel().newCall(getSubmitQueryResultMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<neutron.interchainqueries.Tx.MsgRemoveInterchainQueryResponse> removeInterchainQuery(
        neutron.interchainqueries.Tx.MsgRemoveInterchainQueryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveInterchainQueryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<neutron.interchainqueries.Tx.MsgUpdateInterchainQueryResponse> updateInterchainQuery(
        neutron.interchainqueries.Tx.MsgUpdateInterchainQueryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateInterchainQueryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_INTERCHAIN_QUERY = 0;
  private static final int METHODID_SUBMIT_QUERY_RESULT = 1;
  private static final int METHODID_REMOVE_INTERCHAIN_QUERY = 2;
  private static final int METHODID_UPDATE_INTERCHAIN_QUERY = 3;

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
        case METHODID_REGISTER_INTERCHAIN_QUERY:
          serviceImpl.registerInterchainQuery((neutron.interchainqueries.Tx.MsgRegisterInterchainQuery) request,
              (io.grpc.stub.StreamObserver<neutron.interchainqueries.Tx.MsgRegisterInterchainQueryResponse>) responseObserver);
          break;
        case METHODID_SUBMIT_QUERY_RESULT:
          serviceImpl.submitQueryResult((neutron.interchainqueries.Tx.MsgSubmitQueryResult) request,
              (io.grpc.stub.StreamObserver<neutron.interchainqueries.Tx.MsgSubmitQueryResultResponse>) responseObserver);
          break;
        case METHODID_REMOVE_INTERCHAIN_QUERY:
          serviceImpl.removeInterchainQuery((neutron.interchainqueries.Tx.MsgRemoveInterchainQueryRequest) request,
              (io.grpc.stub.StreamObserver<neutron.interchainqueries.Tx.MsgRemoveInterchainQueryResponse>) responseObserver);
          break;
        case METHODID_UPDATE_INTERCHAIN_QUERY:
          serviceImpl.updateInterchainQuery((neutron.interchainqueries.Tx.MsgUpdateInterchainQueryRequest) request,
              (io.grpc.stub.StreamObserver<neutron.interchainqueries.Tx.MsgUpdateInterchainQueryResponse>) responseObserver);
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
      return neutron.interchainqueries.Tx.getDescriptor();
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
              .addMethod(getRegisterInterchainQueryMethod())
              .addMethod(getSubmitQueryResultMethod())
              .addMethod(getRemoveInterchainQueryMethod())
              .addMethod(getUpdateInterchainQueryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
