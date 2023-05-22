package seiprotocol.seichain.tokenfactory;

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
 * Msg defines the tokefactory module's gRPC message service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: sei/tokenfactory/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "seiprotocol.seichain.tokenfactory.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.tokenfactory.Tx.MsgCreateDenom,
      seiprotocol.seichain.tokenfactory.Tx.MsgCreateDenomResponse> getCreateDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDenom",
      requestType = seiprotocol.seichain.tokenfactory.Tx.MsgCreateDenom.class,
      responseType = seiprotocol.seichain.tokenfactory.Tx.MsgCreateDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.tokenfactory.Tx.MsgCreateDenom,
      seiprotocol.seichain.tokenfactory.Tx.MsgCreateDenomResponse> getCreateDenomMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.tokenfactory.Tx.MsgCreateDenom, seiprotocol.seichain.tokenfactory.Tx.MsgCreateDenomResponse> getCreateDenomMethod;
    if ((getCreateDenomMethod = MsgGrpc.getCreateDenomMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateDenomMethod = MsgGrpc.getCreateDenomMethod) == null) {
          MsgGrpc.getCreateDenomMethod = getCreateDenomMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.tokenfactory.Tx.MsgCreateDenom, seiprotocol.seichain.tokenfactory.Tx.MsgCreateDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.tokenfactory.Tx.MsgCreateDenom.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.tokenfactory.Tx.MsgCreateDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateDenom"))
              .build();
        }
      }
    }
    return getCreateDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.tokenfactory.Tx.MsgMint,
      seiprotocol.seichain.tokenfactory.Tx.MsgMintResponse> getMintMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Mint",
      requestType = seiprotocol.seichain.tokenfactory.Tx.MsgMint.class,
      responseType = seiprotocol.seichain.tokenfactory.Tx.MsgMintResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.tokenfactory.Tx.MsgMint,
      seiprotocol.seichain.tokenfactory.Tx.MsgMintResponse> getMintMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.tokenfactory.Tx.MsgMint, seiprotocol.seichain.tokenfactory.Tx.MsgMintResponse> getMintMethod;
    if ((getMintMethod = MsgGrpc.getMintMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMintMethod = MsgGrpc.getMintMethod) == null) {
          MsgGrpc.getMintMethod = getMintMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.tokenfactory.Tx.MsgMint, seiprotocol.seichain.tokenfactory.Tx.MsgMintResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Mint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.tokenfactory.Tx.MsgMint.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.tokenfactory.Tx.MsgMintResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Mint"))
              .build();
        }
      }
    }
    return getMintMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.tokenfactory.Tx.MsgBurn,
      seiprotocol.seichain.tokenfactory.Tx.MsgBurnResponse> getBurnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Burn",
      requestType = seiprotocol.seichain.tokenfactory.Tx.MsgBurn.class,
      responseType = seiprotocol.seichain.tokenfactory.Tx.MsgBurnResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.tokenfactory.Tx.MsgBurn,
      seiprotocol.seichain.tokenfactory.Tx.MsgBurnResponse> getBurnMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.tokenfactory.Tx.MsgBurn, seiprotocol.seichain.tokenfactory.Tx.MsgBurnResponse> getBurnMethod;
    if ((getBurnMethod = MsgGrpc.getBurnMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBurnMethod = MsgGrpc.getBurnMethod) == null) {
          MsgGrpc.getBurnMethod = getBurnMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.tokenfactory.Tx.MsgBurn, seiprotocol.seichain.tokenfactory.Tx.MsgBurnResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Burn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.tokenfactory.Tx.MsgBurn.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.tokenfactory.Tx.MsgBurnResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Burn"))
              .build();
        }
      }
    }
    return getBurnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.tokenfactory.Tx.MsgChangeAdmin,
      seiprotocol.seichain.tokenfactory.Tx.MsgChangeAdminResponse> getChangeAdminMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeAdmin",
      requestType = seiprotocol.seichain.tokenfactory.Tx.MsgChangeAdmin.class,
      responseType = seiprotocol.seichain.tokenfactory.Tx.MsgChangeAdminResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.tokenfactory.Tx.MsgChangeAdmin,
      seiprotocol.seichain.tokenfactory.Tx.MsgChangeAdminResponse> getChangeAdminMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.tokenfactory.Tx.MsgChangeAdmin, seiprotocol.seichain.tokenfactory.Tx.MsgChangeAdminResponse> getChangeAdminMethod;
    if ((getChangeAdminMethod = MsgGrpc.getChangeAdminMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getChangeAdminMethod = MsgGrpc.getChangeAdminMethod) == null) {
          MsgGrpc.getChangeAdminMethod = getChangeAdminMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.tokenfactory.Tx.MsgChangeAdmin, seiprotocol.seichain.tokenfactory.Tx.MsgChangeAdminResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangeAdmin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.tokenfactory.Tx.MsgChangeAdmin.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.tokenfactory.Tx.MsgChangeAdminResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ChangeAdmin"))
              .build();
        }
      }
    }
    return getChangeAdminMethod;
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
   * Msg defines the tokefactory module's gRPC message service.
   * </pre>
   */
  public static abstract class MsgImplBase implements io.grpc.BindableService {

    /**
     */
    public void createDenom(seiprotocol.seichain.tokenfactory.Tx.MsgCreateDenom request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.tokenfactory.Tx.MsgCreateDenomResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateDenomMethod(), responseObserver);
    }

    /**
     */
    public void mint(seiprotocol.seichain.tokenfactory.Tx.MsgMint request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.tokenfactory.Tx.MsgMintResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMintMethod(), responseObserver);
    }

    /**
     */
    public void burn(seiprotocol.seichain.tokenfactory.Tx.MsgBurn request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.tokenfactory.Tx.MsgBurnResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBurnMethod(), responseObserver);
    }

    /**
     */
    public void changeAdmin(seiprotocol.seichain.tokenfactory.Tx.MsgChangeAdmin request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.tokenfactory.Tx.MsgChangeAdminResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeAdminMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateDenomMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                seiprotocol.seichain.tokenfactory.Tx.MsgCreateDenom,
                seiprotocol.seichain.tokenfactory.Tx.MsgCreateDenomResponse>(
                  this, METHODID_CREATE_DENOM)))
          .addMethod(
            getMintMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                seiprotocol.seichain.tokenfactory.Tx.MsgMint,
                seiprotocol.seichain.tokenfactory.Tx.MsgMintResponse>(
                  this, METHODID_MINT)))
          .addMethod(
            getBurnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                seiprotocol.seichain.tokenfactory.Tx.MsgBurn,
                seiprotocol.seichain.tokenfactory.Tx.MsgBurnResponse>(
                  this, METHODID_BURN)))
          .addMethod(
            getChangeAdminMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                seiprotocol.seichain.tokenfactory.Tx.MsgChangeAdmin,
                seiprotocol.seichain.tokenfactory.Tx.MsgChangeAdminResponse>(
                  this, METHODID_CHANGE_ADMIN)))
          .build();
    }
  }

  /**
   * <pre>
   * Msg defines the tokefactory module's gRPC message service.
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
    public void createDenom(seiprotocol.seichain.tokenfactory.Tx.MsgCreateDenom request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.tokenfactory.Tx.MsgCreateDenomResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void mint(seiprotocol.seichain.tokenfactory.Tx.MsgMint request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.tokenfactory.Tx.MsgMintResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMintMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void burn(seiprotocol.seichain.tokenfactory.Tx.MsgBurn request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.tokenfactory.Tx.MsgBurnResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBurnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeAdmin(seiprotocol.seichain.tokenfactory.Tx.MsgChangeAdmin request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.tokenfactory.Tx.MsgChangeAdminResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeAdminMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Msg defines the tokefactory module's gRPC message service.
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
    public seiprotocol.seichain.tokenfactory.Tx.MsgCreateDenomResponse createDenom(seiprotocol.seichain.tokenfactory.Tx.MsgCreateDenom request) {
      return blockingUnaryCall(
          getChannel(), getCreateDenomMethod(), getCallOptions(), request);
    }

    /**
     */
    public seiprotocol.seichain.tokenfactory.Tx.MsgMintResponse mint(seiprotocol.seichain.tokenfactory.Tx.MsgMint request) {
      return blockingUnaryCall(
          getChannel(), getMintMethod(), getCallOptions(), request);
    }

    /**
     */
    public seiprotocol.seichain.tokenfactory.Tx.MsgBurnResponse burn(seiprotocol.seichain.tokenfactory.Tx.MsgBurn request) {
      return blockingUnaryCall(
          getChannel(), getBurnMethod(), getCallOptions(), request);
    }

    /**
     */
    public seiprotocol.seichain.tokenfactory.Tx.MsgChangeAdminResponse changeAdmin(seiprotocol.seichain.tokenfactory.Tx.MsgChangeAdmin request) {
      return blockingUnaryCall(
          getChannel(), getChangeAdminMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Msg defines the tokefactory module's gRPC message service.
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
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.tokenfactory.Tx.MsgCreateDenomResponse> createDenom(
        seiprotocol.seichain.tokenfactory.Tx.MsgCreateDenom request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateDenomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.tokenfactory.Tx.MsgMintResponse> mint(
        seiprotocol.seichain.tokenfactory.Tx.MsgMint request) {
      return futureUnaryCall(
          getChannel().newCall(getMintMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.tokenfactory.Tx.MsgBurnResponse> burn(
        seiprotocol.seichain.tokenfactory.Tx.MsgBurn request) {
      return futureUnaryCall(
          getChannel().newCall(getBurnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.tokenfactory.Tx.MsgChangeAdminResponse> changeAdmin(
        seiprotocol.seichain.tokenfactory.Tx.MsgChangeAdmin request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeAdminMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_DENOM = 0;
  private static final int METHODID_MINT = 1;
  private static final int METHODID_BURN = 2;
  private static final int METHODID_CHANGE_ADMIN = 3;

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
        case METHODID_CREATE_DENOM:
          serviceImpl.createDenom((seiprotocol.seichain.tokenfactory.Tx.MsgCreateDenom) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.tokenfactory.Tx.MsgCreateDenomResponse>) responseObserver);
          break;
        case METHODID_MINT:
          serviceImpl.mint((seiprotocol.seichain.tokenfactory.Tx.MsgMint) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.tokenfactory.Tx.MsgMintResponse>) responseObserver);
          break;
        case METHODID_BURN:
          serviceImpl.burn((seiprotocol.seichain.tokenfactory.Tx.MsgBurn) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.tokenfactory.Tx.MsgBurnResponse>) responseObserver);
          break;
        case METHODID_CHANGE_ADMIN:
          serviceImpl.changeAdmin((seiprotocol.seichain.tokenfactory.Tx.MsgChangeAdmin) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.tokenfactory.Tx.MsgChangeAdminResponse>) responseObserver);
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
      return seiprotocol.seichain.tokenfactory.Tx.getDescriptor();
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
              .addMethod(getCreateDenomMethod())
              .addMethod(getMintMethod())
              .addMethod(getBurnMethod())
              .addMethod(getChangeAdminMethod())
              .build();
        }
      }
    }
    return result;
  }
}
