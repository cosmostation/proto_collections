package quicksilver.tokenfactory.v1beta1;

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
    comments = "Source: quicksilver/tokenfactory/v1beta1/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "quicksilver.tokenfactory.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<quicksilver.tokenfactory.v1beta1.Tx.MsgCreateDenom,
      quicksilver.tokenfactory.v1beta1.Tx.MsgCreateDenomResponse> getCreateDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDenom",
      requestType = quicksilver.tokenfactory.v1beta1.Tx.MsgCreateDenom.class,
      responseType = quicksilver.tokenfactory.v1beta1.Tx.MsgCreateDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<quicksilver.tokenfactory.v1beta1.Tx.MsgCreateDenom,
      quicksilver.tokenfactory.v1beta1.Tx.MsgCreateDenomResponse> getCreateDenomMethod() {
    io.grpc.MethodDescriptor<quicksilver.tokenfactory.v1beta1.Tx.MsgCreateDenom, quicksilver.tokenfactory.v1beta1.Tx.MsgCreateDenomResponse> getCreateDenomMethod;
    if ((getCreateDenomMethod = MsgGrpc.getCreateDenomMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateDenomMethod = MsgGrpc.getCreateDenomMethod) == null) {
          MsgGrpc.getCreateDenomMethod = getCreateDenomMethod =
              io.grpc.MethodDescriptor.<quicksilver.tokenfactory.v1beta1.Tx.MsgCreateDenom, quicksilver.tokenfactory.v1beta1.Tx.MsgCreateDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.tokenfactory.v1beta1.Tx.MsgCreateDenom.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.tokenfactory.v1beta1.Tx.MsgCreateDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateDenom"))
              .build();
        }
      }
    }
    return getCreateDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<quicksilver.tokenfactory.v1beta1.Tx.MsgMint,
      quicksilver.tokenfactory.v1beta1.Tx.MsgMintResponse> getMintMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Mint",
      requestType = quicksilver.tokenfactory.v1beta1.Tx.MsgMint.class,
      responseType = quicksilver.tokenfactory.v1beta1.Tx.MsgMintResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<quicksilver.tokenfactory.v1beta1.Tx.MsgMint,
      quicksilver.tokenfactory.v1beta1.Tx.MsgMintResponse> getMintMethod() {
    io.grpc.MethodDescriptor<quicksilver.tokenfactory.v1beta1.Tx.MsgMint, quicksilver.tokenfactory.v1beta1.Tx.MsgMintResponse> getMintMethod;
    if ((getMintMethod = MsgGrpc.getMintMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMintMethod = MsgGrpc.getMintMethod) == null) {
          MsgGrpc.getMintMethod = getMintMethod =
              io.grpc.MethodDescriptor.<quicksilver.tokenfactory.v1beta1.Tx.MsgMint, quicksilver.tokenfactory.v1beta1.Tx.MsgMintResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Mint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.tokenfactory.v1beta1.Tx.MsgMint.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.tokenfactory.v1beta1.Tx.MsgMintResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Mint"))
              .build();
        }
      }
    }
    return getMintMethod;
  }

  private static volatile io.grpc.MethodDescriptor<quicksilver.tokenfactory.v1beta1.Tx.MsgBurn,
      quicksilver.tokenfactory.v1beta1.Tx.MsgBurnResponse> getBurnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Burn",
      requestType = quicksilver.tokenfactory.v1beta1.Tx.MsgBurn.class,
      responseType = quicksilver.tokenfactory.v1beta1.Tx.MsgBurnResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<quicksilver.tokenfactory.v1beta1.Tx.MsgBurn,
      quicksilver.tokenfactory.v1beta1.Tx.MsgBurnResponse> getBurnMethod() {
    io.grpc.MethodDescriptor<quicksilver.tokenfactory.v1beta1.Tx.MsgBurn, quicksilver.tokenfactory.v1beta1.Tx.MsgBurnResponse> getBurnMethod;
    if ((getBurnMethod = MsgGrpc.getBurnMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBurnMethod = MsgGrpc.getBurnMethod) == null) {
          MsgGrpc.getBurnMethod = getBurnMethod =
              io.grpc.MethodDescriptor.<quicksilver.tokenfactory.v1beta1.Tx.MsgBurn, quicksilver.tokenfactory.v1beta1.Tx.MsgBurnResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Burn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.tokenfactory.v1beta1.Tx.MsgBurn.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.tokenfactory.v1beta1.Tx.MsgBurnResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Burn"))
              .build();
        }
      }
    }
    return getBurnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<quicksilver.tokenfactory.v1beta1.Tx.MsgChangeAdmin,
      quicksilver.tokenfactory.v1beta1.Tx.MsgChangeAdminResponse> getChangeAdminMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeAdmin",
      requestType = quicksilver.tokenfactory.v1beta1.Tx.MsgChangeAdmin.class,
      responseType = quicksilver.tokenfactory.v1beta1.Tx.MsgChangeAdminResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<quicksilver.tokenfactory.v1beta1.Tx.MsgChangeAdmin,
      quicksilver.tokenfactory.v1beta1.Tx.MsgChangeAdminResponse> getChangeAdminMethod() {
    io.grpc.MethodDescriptor<quicksilver.tokenfactory.v1beta1.Tx.MsgChangeAdmin, quicksilver.tokenfactory.v1beta1.Tx.MsgChangeAdminResponse> getChangeAdminMethod;
    if ((getChangeAdminMethod = MsgGrpc.getChangeAdminMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getChangeAdminMethod = MsgGrpc.getChangeAdminMethod) == null) {
          MsgGrpc.getChangeAdminMethod = getChangeAdminMethod =
              io.grpc.MethodDescriptor.<quicksilver.tokenfactory.v1beta1.Tx.MsgChangeAdmin, quicksilver.tokenfactory.v1beta1.Tx.MsgChangeAdminResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangeAdmin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.tokenfactory.v1beta1.Tx.MsgChangeAdmin.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.tokenfactory.v1beta1.Tx.MsgChangeAdminResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ChangeAdmin"))
              .build();
        }
      }
    }
    return getChangeAdminMethod;
  }

  private static volatile io.grpc.MethodDescriptor<quicksilver.tokenfactory.v1beta1.Tx.MsgSetDenomMetadata,
      quicksilver.tokenfactory.v1beta1.Tx.MsgSetDenomMetadataResponse> getSetDenomMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetDenomMetadata",
      requestType = quicksilver.tokenfactory.v1beta1.Tx.MsgSetDenomMetadata.class,
      responseType = quicksilver.tokenfactory.v1beta1.Tx.MsgSetDenomMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<quicksilver.tokenfactory.v1beta1.Tx.MsgSetDenomMetadata,
      quicksilver.tokenfactory.v1beta1.Tx.MsgSetDenomMetadataResponse> getSetDenomMetadataMethod() {
    io.grpc.MethodDescriptor<quicksilver.tokenfactory.v1beta1.Tx.MsgSetDenomMetadata, quicksilver.tokenfactory.v1beta1.Tx.MsgSetDenomMetadataResponse> getSetDenomMetadataMethod;
    if ((getSetDenomMetadataMethod = MsgGrpc.getSetDenomMetadataMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetDenomMetadataMethod = MsgGrpc.getSetDenomMetadataMethod) == null) {
          MsgGrpc.getSetDenomMetadataMethod = getSetDenomMetadataMethod =
              io.grpc.MethodDescriptor.<quicksilver.tokenfactory.v1beta1.Tx.MsgSetDenomMetadata, quicksilver.tokenfactory.v1beta1.Tx.MsgSetDenomMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetDenomMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.tokenfactory.v1beta1.Tx.MsgSetDenomMetadata.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  quicksilver.tokenfactory.v1beta1.Tx.MsgSetDenomMetadataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetDenomMetadata"))
              .build();
        }
      }
    }
    return getSetDenomMetadataMethod;
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
    public void createDenom(quicksilver.tokenfactory.v1beta1.Tx.MsgCreateDenom request,
        io.grpc.stub.StreamObserver<quicksilver.tokenfactory.v1beta1.Tx.MsgCreateDenomResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateDenomMethod(), responseObserver);
    }

    /**
     */
    public void mint(quicksilver.tokenfactory.v1beta1.Tx.MsgMint request,
        io.grpc.stub.StreamObserver<quicksilver.tokenfactory.v1beta1.Tx.MsgMintResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMintMethod(), responseObserver);
    }

    /**
     */
    public void burn(quicksilver.tokenfactory.v1beta1.Tx.MsgBurn request,
        io.grpc.stub.StreamObserver<quicksilver.tokenfactory.v1beta1.Tx.MsgBurnResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBurnMethod(), responseObserver);
    }

    /**
     */
    public void changeAdmin(quicksilver.tokenfactory.v1beta1.Tx.MsgChangeAdmin request,
        io.grpc.stub.StreamObserver<quicksilver.tokenfactory.v1beta1.Tx.MsgChangeAdminResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeAdminMethod(), responseObserver);
    }

    /**
     */
    public void setDenomMetadata(quicksilver.tokenfactory.v1beta1.Tx.MsgSetDenomMetadata request,
        io.grpc.stub.StreamObserver<quicksilver.tokenfactory.v1beta1.Tx.MsgSetDenomMetadataResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetDenomMetadataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateDenomMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                quicksilver.tokenfactory.v1beta1.Tx.MsgCreateDenom,
                quicksilver.tokenfactory.v1beta1.Tx.MsgCreateDenomResponse>(
                  this, METHODID_CREATE_DENOM)))
          .addMethod(
            getMintMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                quicksilver.tokenfactory.v1beta1.Tx.MsgMint,
                quicksilver.tokenfactory.v1beta1.Tx.MsgMintResponse>(
                  this, METHODID_MINT)))
          .addMethod(
            getBurnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                quicksilver.tokenfactory.v1beta1.Tx.MsgBurn,
                quicksilver.tokenfactory.v1beta1.Tx.MsgBurnResponse>(
                  this, METHODID_BURN)))
          .addMethod(
            getChangeAdminMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                quicksilver.tokenfactory.v1beta1.Tx.MsgChangeAdmin,
                quicksilver.tokenfactory.v1beta1.Tx.MsgChangeAdminResponse>(
                  this, METHODID_CHANGE_ADMIN)))
          .addMethod(
            getSetDenomMetadataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                quicksilver.tokenfactory.v1beta1.Tx.MsgSetDenomMetadata,
                quicksilver.tokenfactory.v1beta1.Tx.MsgSetDenomMetadataResponse>(
                  this, METHODID_SET_DENOM_METADATA)))
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
    public void createDenom(quicksilver.tokenfactory.v1beta1.Tx.MsgCreateDenom request,
        io.grpc.stub.StreamObserver<quicksilver.tokenfactory.v1beta1.Tx.MsgCreateDenomResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void mint(quicksilver.tokenfactory.v1beta1.Tx.MsgMint request,
        io.grpc.stub.StreamObserver<quicksilver.tokenfactory.v1beta1.Tx.MsgMintResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMintMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void burn(quicksilver.tokenfactory.v1beta1.Tx.MsgBurn request,
        io.grpc.stub.StreamObserver<quicksilver.tokenfactory.v1beta1.Tx.MsgBurnResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBurnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeAdmin(quicksilver.tokenfactory.v1beta1.Tx.MsgChangeAdmin request,
        io.grpc.stub.StreamObserver<quicksilver.tokenfactory.v1beta1.Tx.MsgChangeAdminResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeAdminMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setDenomMetadata(quicksilver.tokenfactory.v1beta1.Tx.MsgSetDenomMetadata request,
        io.grpc.stub.StreamObserver<quicksilver.tokenfactory.v1beta1.Tx.MsgSetDenomMetadataResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetDenomMetadataMethod(), getCallOptions()), request, responseObserver);
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
    public quicksilver.tokenfactory.v1beta1.Tx.MsgCreateDenomResponse createDenom(quicksilver.tokenfactory.v1beta1.Tx.MsgCreateDenom request) {
      return blockingUnaryCall(
          getChannel(), getCreateDenomMethod(), getCallOptions(), request);
    }

    /**
     */
    public quicksilver.tokenfactory.v1beta1.Tx.MsgMintResponse mint(quicksilver.tokenfactory.v1beta1.Tx.MsgMint request) {
      return blockingUnaryCall(
          getChannel(), getMintMethod(), getCallOptions(), request);
    }

    /**
     */
    public quicksilver.tokenfactory.v1beta1.Tx.MsgBurnResponse burn(quicksilver.tokenfactory.v1beta1.Tx.MsgBurn request) {
      return blockingUnaryCall(
          getChannel(), getBurnMethod(), getCallOptions(), request);
    }

    /**
     */
    public quicksilver.tokenfactory.v1beta1.Tx.MsgChangeAdminResponse changeAdmin(quicksilver.tokenfactory.v1beta1.Tx.MsgChangeAdmin request) {
      return blockingUnaryCall(
          getChannel(), getChangeAdminMethod(), getCallOptions(), request);
    }

    /**
     */
    public quicksilver.tokenfactory.v1beta1.Tx.MsgSetDenomMetadataResponse setDenomMetadata(quicksilver.tokenfactory.v1beta1.Tx.MsgSetDenomMetadata request) {
      return blockingUnaryCall(
          getChannel(), getSetDenomMetadataMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<quicksilver.tokenfactory.v1beta1.Tx.MsgCreateDenomResponse> createDenom(
        quicksilver.tokenfactory.v1beta1.Tx.MsgCreateDenom request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateDenomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<quicksilver.tokenfactory.v1beta1.Tx.MsgMintResponse> mint(
        quicksilver.tokenfactory.v1beta1.Tx.MsgMint request) {
      return futureUnaryCall(
          getChannel().newCall(getMintMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<quicksilver.tokenfactory.v1beta1.Tx.MsgBurnResponse> burn(
        quicksilver.tokenfactory.v1beta1.Tx.MsgBurn request) {
      return futureUnaryCall(
          getChannel().newCall(getBurnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<quicksilver.tokenfactory.v1beta1.Tx.MsgChangeAdminResponse> changeAdmin(
        quicksilver.tokenfactory.v1beta1.Tx.MsgChangeAdmin request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeAdminMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<quicksilver.tokenfactory.v1beta1.Tx.MsgSetDenomMetadataResponse> setDenomMetadata(
        quicksilver.tokenfactory.v1beta1.Tx.MsgSetDenomMetadata request) {
      return futureUnaryCall(
          getChannel().newCall(getSetDenomMetadataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_DENOM = 0;
  private static final int METHODID_MINT = 1;
  private static final int METHODID_BURN = 2;
  private static final int METHODID_CHANGE_ADMIN = 3;
  private static final int METHODID_SET_DENOM_METADATA = 4;

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
          serviceImpl.createDenom((quicksilver.tokenfactory.v1beta1.Tx.MsgCreateDenom) request,
              (io.grpc.stub.StreamObserver<quicksilver.tokenfactory.v1beta1.Tx.MsgCreateDenomResponse>) responseObserver);
          break;
        case METHODID_MINT:
          serviceImpl.mint((quicksilver.tokenfactory.v1beta1.Tx.MsgMint) request,
              (io.grpc.stub.StreamObserver<quicksilver.tokenfactory.v1beta1.Tx.MsgMintResponse>) responseObserver);
          break;
        case METHODID_BURN:
          serviceImpl.burn((quicksilver.tokenfactory.v1beta1.Tx.MsgBurn) request,
              (io.grpc.stub.StreamObserver<quicksilver.tokenfactory.v1beta1.Tx.MsgBurnResponse>) responseObserver);
          break;
        case METHODID_CHANGE_ADMIN:
          serviceImpl.changeAdmin((quicksilver.tokenfactory.v1beta1.Tx.MsgChangeAdmin) request,
              (io.grpc.stub.StreamObserver<quicksilver.tokenfactory.v1beta1.Tx.MsgChangeAdminResponse>) responseObserver);
          break;
        case METHODID_SET_DENOM_METADATA:
          serviceImpl.setDenomMetadata((quicksilver.tokenfactory.v1beta1.Tx.MsgSetDenomMetadata) request,
              (io.grpc.stub.StreamObserver<quicksilver.tokenfactory.v1beta1.Tx.MsgSetDenomMetadataResponse>) responseObserver);
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
      return quicksilver.tokenfactory.v1beta1.Tx.getDescriptor();
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
              .addMethod(getSetDenomMetadataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
