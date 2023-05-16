package canto.csr.v1;

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
    comments = "Source: canto/csr/v1/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "canto.csr.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<canto.csr.v1.QueryOuterClass.QueryParamsRequest,
      canto.csr.v1.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = canto.csr.v1.QueryOuterClass.QueryParamsRequest.class,
      responseType = canto.csr.v1.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<canto.csr.v1.QueryOuterClass.QueryParamsRequest,
      canto.csr.v1.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<canto.csr.v1.QueryOuterClass.QueryParamsRequest, canto.csr.v1.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<canto.csr.v1.QueryOuterClass.QueryParamsRequest, canto.csr.v1.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  canto.csr.v1.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  canto.csr.v1.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<canto.csr.v1.QueryOuterClass.QueryCSRsRequest,
      canto.csr.v1.QueryOuterClass.QueryCSRsResponse> getCSRsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CSRs",
      requestType = canto.csr.v1.QueryOuterClass.QueryCSRsRequest.class,
      responseType = canto.csr.v1.QueryOuterClass.QueryCSRsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<canto.csr.v1.QueryOuterClass.QueryCSRsRequest,
      canto.csr.v1.QueryOuterClass.QueryCSRsResponse> getCSRsMethod() {
    io.grpc.MethodDescriptor<canto.csr.v1.QueryOuterClass.QueryCSRsRequest, canto.csr.v1.QueryOuterClass.QueryCSRsResponse> getCSRsMethod;
    if ((getCSRsMethod = QueryGrpc.getCSRsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCSRsMethod = QueryGrpc.getCSRsMethod) == null) {
          QueryGrpc.getCSRsMethod = getCSRsMethod =
              io.grpc.MethodDescriptor.<canto.csr.v1.QueryOuterClass.QueryCSRsRequest, canto.csr.v1.QueryOuterClass.QueryCSRsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CSRs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  canto.csr.v1.QueryOuterClass.QueryCSRsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  canto.csr.v1.QueryOuterClass.QueryCSRsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CSRs"))
              .build();
        }
      }
    }
    return getCSRsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<canto.csr.v1.QueryOuterClass.QueryCSRByNFTRequest,
      canto.csr.v1.QueryOuterClass.QueryCSRByNFTResponse> getCSRByNFTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CSRByNFT",
      requestType = canto.csr.v1.QueryOuterClass.QueryCSRByNFTRequest.class,
      responseType = canto.csr.v1.QueryOuterClass.QueryCSRByNFTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<canto.csr.v1.QueryOuterClass.QueryCSRByNFTRequest,
      canto.csr.v1.QueryOuterClass.QueryCSRByNFTResponse> getCSRByNFTMethod() {
    io.grpc.MethodDescriptor<canto.csr.v1.QueryOuterClass.QueryCSRByNFTRequest, canto.csr.v1.QueryOuterClass.QueryCSRByNFTResponse> getCSRByNFTMethod;
    if ((getCSRByNFTMethod = QueryGrpc.getCSRByNFTMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCSRByNFTMethod = QueryGrpc.getCSRByNFTMethod) == null) {
          QueryGrpc.getCSRByNFTMethod = getCSRByNFTMethod =
              io.grpc.MethodDescriptor.<canto.csr.v1.QueryOuterClass.QueryCSRByNFTRequest, canto.csr.v1.QueryOuterClass.QueryCSRByNFTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CSRByNFT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  canto.csr.v1.QueryOuterClass.QueryCSRByNFTRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  canto.csr.v1.QueryOuterClass.QueryCSRByNFTResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CSRByNFT"))
              .build();
        }
      }
    }
    return getCSRByNFTMethod;
  }

  private static volatile io.grpc.MethodDescriptor<canto.csr.v1.QueryOuterClass.QueryCSRByContractRequest,
      canto.csr.v1.QueryOuterClass.QueryCSRByContractResponse> getCSRByContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CSRByContract",
      requestType = canto.csr.v1.QueryOuterClass.QueryCSRByContractRequest.class,
      responseType = canto.csr.v1.QueryOuterClass.QueryCSRByContractResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<canto.csr.v1.QueryOuterClass.QueryCSRByContractRequest,
      canto.csr.v1.QueryOuterClass.QueryCSRByContractResponse> getCSRByContractMethod() {
    io.grpc.MethodDescriptor<canto.csr.v1.QueryOuterClass.QueryCSRByContractRequest, canto.csr.v1.QueryOuterClass.QueryCSRByContractResponse> getCSRByContractMethod;
    if ((getCSRByContractMethod = QueryGrpc.getCSRByContractMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCSRByContractMethod = QueryGrpc.getCSRByContractMethod) == null) {
          QueryGrpc.getCSRByContractMethod = getCSRByContractMethod =
              io.grpc.MethodDescriptor.<canto.csr.v1.QueryOuterClass.QueryCSRByContractRequest, canto.csr.v1.QueryOuterClass.QueryCSRByContractResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CSRByContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  canto.csr.v1.QueryOuterClass.QueryCSRByContractRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  canto.csr.v1.QueryOuterClass.QueryCSRByContractResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CSRByContract"))
              .build();
        }
      }
    }
    return getCSRByContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<canto.csr.v1.QueryOuterClass.QueryTurnstileRequest,
      canto.csr.v1.QueryOuterClass.QueryTurnstileResponse> getTurnstileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Turnstile",
      requestType = canto.csr.v1.QueryOuterClass.QueryTurnstileRequest.class,
      responseType = canto.csr.v1.QueryOuterClass.QueryTurnstileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<canto.csr.v1.QueryOuterClass.QueryTurnstileRequest,
      canto.csr.v1.QueryOuterClass.QueryTurnstileResponse> getTurnstileMethod() {
    io.grpc.MethodDescriptor<canto.csr.v1.QueryOuterClass.QueryTurnstileRequest, canto.csr.v1.QueryOuterClass.QueryTurnstileResponse> getTurnstileMethod;
    if ((getTurnstileMethod = QueryGrpc.getTurnstileMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTurnstileMethod = QueryGrpc.getTurnstileMethod) == null) {
          QueryGrpc.getTurnstileMethod = getTurnstileMethod =
              io.grpc.MethodDescriptor.<canto.csr.v1.QueryOuterClass.QueryTurnstileRequest, canto.csr.v1.QueryOuterClass.QueryTurnstileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Turnstile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  canto.csr.v1.QueryOuterClass.QueryTurnstileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  canto.csr.v1.QueryOuterClass.QueryTurnstileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Turnstile"))
              .build();
        }
      }
    }
    return getTurnstileMethod;
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
     * Parameters queries the parameters of the module.
     * </pre>
     */
    public void params(canto.csr.v1.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<canto.csr.v1.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * query all registered CSRs
     * </pre>
     */
    public void cSRs(canto.csr.v1.QueryOuterClass.QueryCSRsRequest request,
        io.grpc.stub.StreamObserver<canto.csr.v1.QueryOuterClass.QueryCSRsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCSRsMethod(), responseObserver);
    }

    /**
     * <pre>
     * query a specific CSR by the nftId 
     * </pre>
     */
    public void cSRByNFT(canto.csr.v1.QueryOuterClass.QueryCSRByNFTRequest request,
        io.grpc.stub.StreamObserver<canto.csr.v1.QueryOuterClass.QueryCSRByNFTResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCSRByNFTMethod(), responseObserver);
    }

    /**
     * <pre>
     * query a CSR by smart contract address
     * </pre>
     */
    public void cSRByContract(canto.csr.v1.QueryOuterClass.QueryCSRByContractRequest request,
        io.grpc.stub.StreamObserver<canto.csr.v1.QueryOuterClass.QueryCSRByContractResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCSRByContractMethod(), responseObserver);
    }

    /**
     * <pre>
     * query the turnstile address
     * </pre>
     */
    public void turnstile(canto.csr.v1.QueryOuterClass.QueryTurnstileRequest request,
        io.grpc.stub.StreamObserver<canto.csr.v1.QueryOuterClass.QueryTurnstileResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTurnstileMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                canto.csr.v1.QueryOuterClass.QueryParamsRequest,
                canto.csr.v1.QueryOuterClass.QueryParamsResponse>(
                  this, METHODID_PARAMS)))
          .addMethod(
            getCSRsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                canto.csr.v1.QueryOuterClass.QueryCSRsRequest,
                canto.csr.v1.QueryOuterClass.QueryCSRsResponse>(
                  this, METHODID_CSRS)))
          .addMethod(
            getCSRByNFTMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                canto.csr.v1.QueryOuterClass.QueryCSRByNFTRequest,
                canto.csr.v1.QueryOuterClass.QueryCSRByNFTResponse>(
                  this, METHODID_CSRBY_NFT)))
          .addMethod(
            getCSRByContractMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                canto.csr.v1.QueryOuterClass.QueryCSRByContractRequest,
                canto.csr.v1.QueryOuterClass.QueryCSRByContractResponse>(
                  this, METHODID_CSRBY_CONTRACT)))
          .addMethod(
            getTurnstileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                canto.csr.v1.QueryOuterClass.QueryTurnstileRequest,
                canto.csr.v1.QueryOuterClass.QueryTurnstileResponse>(
                  this, METHODID_TURNSTILE)))
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
     * Parameters queries the parameters of the module.
     * </pre>
     */
    public void params(canto.csr.v1.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<canto.csr.v1.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * query all registered CSRs
     * </pre>
     */
    public void cSRs(canto.csr.v1.QueryOuterClass.QueryCSRsRequest request,
        io.grpc.stub.StreamObserver<canto.csr.v1.QueryOuterClass.QueryCSRsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCSRsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * query a specific CSR by the nftId 
     * </pre>
     */
    public void cSRByNFT(canto.csr.v1.QueryOuterClass.QueryCSRByNFTRequest request,
        io.grpc.stub.StreamObserver<canto.csr.v1.QueryOuterClass.QueryCSRByNFTResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCSRByNFTMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * query a CSR by smart contract address
     * </pre>
     */
    public void cSRByContract(canto.csr.v1.QueryOuterClass.QueryCSRByContractRequest request,
        io.grpc.stub.StreamObserver<canto.csr.v1.QueryOuterClass.QueryCSRByContractResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCSRByContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * query the turnstile address
     * </pre>
     */
    public void turnstile(canto.csr.v1.QueryOuterClass.QueryTurnstileRequest request,
        io.grpc.stub.StreamObserver<canto.csr.v1.QueryOuterClass.QueryTurnstileResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTurnstileMethod(), getCallOptions()), request, responseObserver);
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
     * Parameters queries the parameters of the module.
     * </pre>
     */
    public canto.csr.v1.QueryOuterClass.QueryParamsResponse params(canto.csr.v1.QueryOuterClass.QueryParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * query all registered CSRs
     * </pre>
     */
    public canto.csr.v1.QueryOuterClass.QueryCSRsResponse cSRs(canto.csr.v1.QueryOuterClass.QueryCSRsRequest request) {
      return blockingUnaryCall(
          getChannel(), getCSRsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * query a specific CSR by the nftId 
     * </pre>
     */
    public canto.csr.v1.QueryOuterClass.QueryCSRByNFTResponse cSRByNFT(canto.csr.v1.QueryOuterClass.QueryCSRByNFTRequest request) {
      return blockingUnaryCall(
          getChannel(), getCSRByNFTMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * query a CSR by smart contract address
     * </pre>
     */
    public canto.csr.v1.QueryOuterClass.QueryCSRByContractResponse cSRByContract(canto.csr.v1.QueryOuterClass.QueryCSRByContractRequest request) {
      return blockingUnaryCall(
          getChannel(), getCSRByContractMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * query the turnstile address
     * </pre>
     */
    public canto.csr.v1.QueryOuterClass.QueryTurnstileResponse turnstile(canto.csr.v1.QueryOuterClass.QueryTurnstileRequest request) {
      return blockingUnaryCall(
          getChannel(), getTurnstileMethod(), getCallOptions(), request);
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
     * Parameters queries the parameters of the module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<canto.csr.v1.QueryOuterClass.QueryParamsResponse> params(
        canto.csr.v1.QueryOuterClass.QueryParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * query all registered CSRs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<canto.csr.v1.QueryOuterClass.QueryCSRsResponse> cSRs(
        canto.csr.v1.QueryOuterClass.QueryCSRsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCSRsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * query a specific CSR by the nftId 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<canto.csr.v1.QueryOuterClass.QueryCSRByNFTResponse> cSRByNFT(
        canto.csr.v1.QueryOuterClass.QueryCSRByNFTRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCSRByNFTMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * query a CSR by smart contract address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<canto.csr.v1.QueryOuterClass.QueryCSRByContractResponse> cSRByContract(
        canto.csr.v1.QueryOuterClass.QueryCSRByContractRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCSRByContractMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * query the turnstile address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<canto.csr.v1.QueryOuterClass.QueryTurnstileResponse> turnstile(
        canto.csr.v1.QueryOuterClass.QueryTurnstileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTurnstileMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_CSRS = 1;
  private static final int METHODID_CSRBY_NFT = 2;
  private static final int METHODID_CSRBY_CONTRACT = 3;
  private static final int METHODID_TURNSTILE = 4;

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
        case METHODID_PARAMS:
          serviceImpl.params((canto.csr.v1.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<canto.csr.v1.QueryOuterClass.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_CSRS:
          serviceImpl.cSRs((canto.csr.v1.QueryOuterClass.QueryCSRsRequest) request,
              (io.grpc.stub.StreamObserver<canto.csr.v1.QueryOuterClass.QueryCSRsResponse>) responseObserver);
          break;
        case METHODID_CSRBY_NFT:
          serviceImpl.cSRByNFT((canto.csr.v1.QueryOuterClass.QueryCSRByNFTRequest) request,
              (io.grpc.stub.StreamObserver<canto.csr.v1.QueryOuterClass.QueryCSRByNFTResponse>) responseObserver);
          break;
        case METHODID_CSRBY_CONTRACT:
          serviceImpl.cSRByContract((canto.csr.v1.QueryOuterClass.QueryCSRByContractRequest) request,
              (io.grpc.stub.StreamObserver<canto.csr.v1.QueryOuterClass.QueryCSRByContractResponse>) responseObserver);
          break;
        case METHODID_TURNSTILE:
          serviceImpl.turnstile((canto.csr.v1.QueryOuterClass.QueryTurnstileRequest) request,
              (io.grpc.stub.StreamObserver<canto.csr.v1.QueryOuterClass.QueryTurnstileResponse>) responseObserver);
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
      return canto.csr.v1.QueryOuterClass.getDescriptor();
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
              .addMethod(getParamsMethod())
              .addMethod(getCSRsMethod())
              .addMethod(getCSRByNFTMethod())
              .addMethod(getCSRByContractMethod())
              .addMethod(getTurnstileMethod())
              .build();
        }
      }
    }
    return result;
  }
}
