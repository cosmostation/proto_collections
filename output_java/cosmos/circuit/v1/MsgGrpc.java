package cosmos.circuit.v1;

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
 * Msg defines the crisis Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: cosmos/circuit/v1/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "cosmos.circuit.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cosmos.circuit.v1.Tx.MsgAuthorizeCircuitBreaker,
      cosmos.circuit.v1.Tx.MsgAuthorizeCircuitBreakerResponse> getAuthorizeCircuitBreakerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AuthorizeCircuitBreaker",
      requestType = cosmos.circuit.v1.Tx.MsgAuthorizeCircuitBreaker.class,
      responseType = cosmos.circuit.v1.Tx.MsgAuthorizeCircuitBreakerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.circuit.v1.Tx.MsgAuthorizeCircuitBreaker,
      cosmos.circuit.v1.Tx.MsgAuthorizeCircuitBreakerResponse> getAuthorizeCircuitBreakerMethod() {
    io.grpc.MethodDescriptor<cosmos.circuit.v1.Tx.MsgAuthorizeCircuitBreaker, cosmos.circuit.v1.Tx.MsgAuthorizeCircuitBreakerResponse> getAuthorizeCircuitBreakerMethod;
    if ((getAuthorizeCircuitBreakerMethod = MsgGrpc.getAuthorizeCircuitBreakerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAuthorizeCircuitBreakerMethod = MsgGrpc.getAuthorizeCircuitBreakerMethod) == null) {
          MsgGrpc.getAuthorizeCircuitBreakerMethod = getAuthorizeCircuitBreakerMethod =
              io.grpc.MethodDescriptor.<cosmos.circuit.v1.Tx.MsgAuthorizeCircuitBreaker, cosmos.circuit.v1.Tx.MsgAuthorizeCircuitBreakerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AuthorizeCircuitBreaker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.circuit.v1.Tx.MsgAuthorizeCircuitBreaker.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.circuit.v1.Tx.MsgAuthorizeCircuitBreakerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AuthorizeCircuitBreaker"))
              .build();
        }
      }
    }
    return getAuthorizeCircuitBreakerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.circuit.v1.Tx.MsgTripCircuitBreaker,
      cosmos.circuit.v1.Tx.MsgTripCircuitBreakerResponse> getTripCircuitBreakerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TripCircuitBreaker",
      requestType = cosmos.circuit.v1.Tx.MsgTripCircuitBreaker.class,
      responseType = cosmos.circuit.v1.Tx.MsgTripCircuitBreakerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.circuit.v1.Tx.MsgTripCircuitBreaker,
      cosmos.circuit.v1.Tx.MsgTripCircuitBreakerResponse> getTripCircuitBreakerMethod() {
    io.grpc.MethodDescriptor<cosmos.circuit.v1.Tx.MsgTripCircuitBreaker, cosmos.circuit.v1.Tx.MsgTripCircuitBreakerResponse> getTripCircuitBreakerMethod;
    if ((getTripCircuitBreakerMethod = MsgGrpc.getTripCircuitBreakerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getTripCircuitBreakerMethod = MsgGrpc.getTripCircuitBreakerMethod) == null) {
          MsgGrpc.getTripCircuitBreakerMethod = getTripCircuitBreakerMethod =
              io.grpc.MethodDescriptor.<cosmos.circuit.v1.Tx.MsgTripCircuitBreaker, cosmos.circuit.v1.Tx.MsgTripCircuitBreakerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TripCircuitBreaker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.circuit.v1.Tx.MsgTripCircuitBreaker.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.circuit.v1.Tx.MsgTripCircuitBreakerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("TripCircuitBreaker"))
              .build();
        }
      }
    }
    return getTripCircuitBreakerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.circuit.v1.Tx.MsgResetCircuitBreaker,
      cosmos.circuit.v1.Tx.MsgResetCircuitBreakerResponse> getResetCircuitBreakerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResetCircuitBreaker",
      requestType = cosmos.circuit.v1.Tx.MsgResetCircuitBreaker.class,
      responseType = cosmos.circuit.v1.Tx.MsgResetCircuitBreakerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.circuit.v1.Tx.MsgResetCircuitBreaker,
      cosmos.circuit.v1.Tx.MsgResetCircuitBreakerResponse> getResetCircuitBreakerMethod() {
    io.grpc.MethodDescriptor<cosmos.circuit.v1.Tx.MsgResetCircuitBreaker, cosmos.circuit.v1.Tx.MsgResetCircuitBreakerResponse> getResetCircuitBreakerMethod;
    if ((getResetCircuitBreakerMethod = MsgGrpc.getResetCircuitBreakerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getResetCircuitBreakerMethod = MsgGrpc.getResetCircuitBreakerMethod) == null) {
          MsgGrpc.getResetCircuitBreakerMethod = getResetCircuitBreakerMethod =
              io.grpc.MethodDescriptor.<cosmos.circuit.v1.Tx.MsgResetCircuitBreaker, cosmos.circuit.v1.Tx.MsgResetCircuitBreakerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResetCircuitBreaker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.circuit.v1.Tx.MsgResetCircuitBreaker.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.circuit.v1.Tx.MsgResetCircuitBreakerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ResetCircuitBreaker"))
              .build();
        }
      }
    }
    return getResetCircuitBreakerMethod;
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
   * Msg defines the crisis Msg service.
   * </pre>
   */
  public static abstract class MsgImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * AuthorizeCircuitBreaker allows a super-admin to grant (or revoke) another
     * account's circuit breaker permissions.
     * </pre>
     */
    public void authorizeCircuitBreaker(cosmos.circuit.v1.Tx.MsgAuthorizeCircuitBreaker request,
        io.grpc.stub.StreamObserver<cosmos.circuit.v1.Tx.MsgAuthorizeCircuitBreakerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAuthorizeCircuitBreakerMethod(), responseObserver);
    }

    /**
     * <pre>
     * TripCircuitBreaker pauses processing of Msg's in the state machine.
     * </pre>
     */
    public void tripCircuitBreaker(cosmos.circuit.v1.Tx.MsgTripCircuitBreaker request,
        io.grpc.stub.StreamObserver<cosmos.circuit.v1.Tx.MsgTripCircuitBreakerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTripCircuitBreakerMethod(), responseObserver);
    }

    /**
     * <pre>
     * ResetCircuitBreaker resumes processing of Msg's in the state machine that
     * have been been paused using TripCircuitBreaker.
     * </pre>
     */
    public void resetCircuitBreaker(cosmos.circuit.v1.Tx.MsgResetCircuitBreaker request,
        io.grpc.stub.StreamObserver<cosmos.circuit.v1.Tx.MsgResetCircuitBreakerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getResetCircuitBreakerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAuthorizeCircuitBreakerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.circuit.v1.Tx.MsgAuthorizeCircuitBreaker,
                cosmos.circuit.v1.Tx.MsgAuthorizeCircuitBreakerResponse>(
                  this, METHODID_AUTHORIZE_CIRCUIT_BREAKER)))
          .addMethod(
            getTripCircuitBreakerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.circuit.v1.Tx.MsgTripCircuitBreaker,
                cosmos.circuit.v1.Tx.MsgTripCircuitBreakerResponse>(
                  this, METHODID_TRIP_CIRCUIT_BREAKER)))
          .addMethod(
            getResetCircuitBreakerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cosmos.circuit.v1.Tx.MsgResetCircuitBreaker,
                cosmos.circuit.v1.Tx.MsgResetCircuitBreakerResponse>(
                  this, METHODID_RESET_CIRCUIT_BREAKER)))
          .build();
    }
  }

  /**
   * <pre>
   * Msg defines the crisis Msg service.
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
     * AuthorizeCircuitBreaker allows a super-admin to grant (or revoke) another
     * account's circuit breaker permissions.
     * </pre>
     */
    public void authorizeCircuitBreaker(cosmos.circuit.v1.Tx.MsgAuthorizeCircuitBreaker request,
        io.grpc.stub.StreamObserver<cosmos.circuit.v1.Tx.MsgAuthorizeCircuitBreakerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAuthorizeCircuitBreakerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TripCircuitBreaker pauses processing of Msg's in the state machine.
     * </pre>
     */
    public void tripCircuitBreaker(cosmos.circuit.v1.Tx.MsgTripCircuitBreaker request,
        io.grpc.stub.StreamObserver<cosmos.circuit.v1.Tx.MsgTripCircuitBreakerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTripCircuitBreakerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ResetCircuitBreaker resumes processing of Msg's in the state machine that
     * have been been paused using TripCircuitBreaker.
     * </pre>
     */
    public void resetCircuitBreaker(cosmos.circuit.v1.Tx.MsgResetCircuitBreaker request,
        io.grpc.stub.StreamObserver<cosmos.circuit.v1.Tx.MsgResetCircuitBreakerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getResetCircuitBreakerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Msg defines the crisis Msg service.
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
     * AuthorizeCircuitBreaker allows a super-admin to grant (or revoke) another
     * account's circuit breaker permissions.
     * </pre>
     */
    public cosmos.circuit.v1.Tx.MsgAuthorizeCircuitBreakerResponse authorizeCircuitBreaker(cosmos.circuit.v1.Tx.MsgAuthorizeCircuitBreaker request) {
      return blockingUnaryCall(
          getChannel(), getAuthorizeCircuitBreakerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TripCircuitBreaker pauses processing of Msg's in the state machine.
     * </pre>
     */
    public cosmos.circuit.v1.Tx.MsgTripCircuitBreakerResponse tripCircuitBreaker(cosmos.circuit.v1.Tx.MsgTripCircuitBreaker request) {
      return blockingUnaryCall(
          getChannel(), getTripCircuitBreakerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ResetCircuitBreaker resumes processing of Msg's in the state machine that
     * have been been paused using TripCircuitBreaker.
     * </pre>
     */
    public cosmos.circuit.v1.Tx.MsgResetCircuitBreakerResponse resetCircuitBreaker(cosmos.circuit.v1.Tx.MsgResetCircuitBreaker request) {
      return blockingUnaryCall(
          getChannel(), getResetCircuitBreakerMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Msg defines the crisis Msg service.
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
     * AuthorizeCircuitBreaker allows a super-admin to grant (or revoke) another
     * account's circuit breaker permissions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.circuit.v1.Tx.MsgAuthorizeCircuitBreakerResponse> authorizeCircuitBreaker(
        cosmos.circuit.v1.Tx.MsgAuthorizeCircuitBreaker request) {
      return futureUnaryCall(
          getChannel().newCall(getAuthorizeCircuitBreakerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TripCircuitBreaker pauses processing of Msg's in the state machine.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.circuit.v1.Tx.MsgTripCircuitBreakerResponse> tripCircuitBreaker(
        cosmos.circuit.v1.Tx.MsgTripCircuitBreaker request) {
      return futureUnaryCall(
          getChannel().newCall(getTripCircuitBreakerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ResetCircuitBreaker resumes processing of Msg's in the state machine that
     * have been been paused using TripCircuitBreaker.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.circuit.v1.Tx.MsgResetCircuitBreakerResponse> resetCircuitBreaker(
        cosmos.circuit.v1.Tx.MsgResetCircuitBreaker request) {
      return futureUnaryCall(
          getChannel().newCall(getResetCircuitBreakerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AUTHORIZE_CIRCUIT_BREAKER = 0;
  private static final int METHODID_TRIP_CIRCUIT_BREAKER = 1;
  private static final int METHODID_RESET_CIRCUIT_BREAKER = 2;

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
        case METHODID_AUTHORIZE_CIRCUIT_BREAKER:
          serviceImpl.authorizeCircuitBreaker((cosmos.circuit.v1.Tx.MsgAuthorizeCircuitBreaker) request,
              (io.grpc.stub.StreamObserver<cosmos.circuit.v1.Tx.MsgAuthorizeCircuitBreakerResponse>) responseObserver);
          break;
        case METHODID_TRIP_CIRCUIT_BREAKER:
          serviceImpl.tripCircuitBreaker((cosmos.circuit.v1.Tx.MsgTripCircuitBreaker) request,
              (io.grpc.stub.StreamObserver<cosmos.circuit.v1.Tx.MsgTripCircuitBreakerResponse>) responseObserver);
          break;
        case METHODID_RESET_CIRCUIT_BREAKER:
          serviceImpl.resetCircuitBreaker((cosmos.circuit.v1.Tx.MsgResetCircuitBreaker) request,
              (io.grpc.stub.StreamObserver<cosmos.circuit.v1.Tx.MsgResetCircuitBreakerResponse>) responseObserver);
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
      return cosmos.circuit.v1.Tx.getDescriptor();
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
              .addMethod(getAuthorizeCircuitBreakerMethod())
              .addMethod(getTripCircuitBreakerMethod())
              .addMethod(getResetCircuitBreakerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
