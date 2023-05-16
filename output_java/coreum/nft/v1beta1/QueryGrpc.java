package coreum.nft.v1beta1;

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
    comments = "Source: coreum/nft/v1beta1/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "coreum.nft.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<coreum.nft.v1beta1.QueryOuterClass.QueryBalanceRequest,
      coreum.nft.v1beta1.QueryOuterClass.QueryBalanceResponse> getBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Balance",
      requestType = coreum.nft.v1beta1.QueryOuterClass.QueryBalanceRequest.class,
      responseType = coreum.nft.v1beta1.QueryOuterClass.QueryBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<coreum.nft.v1beta1.QueryOuterClass.QueryBalanceRequest,
      coreum.nft.v1beta1.QueryOuterClass.QueryBalanceResponse> getBalanceMethod() {
    io.grpc.MethodDescriptor<coreum.nft.v1beta1.QueryOuterClass.QueryBalanceRequest, coreum.nft.v1beta1.QueryOuterClass.QueryBalanceResponse> getBalanceMethod;
    if ((getBalanceMethod = QueryGrpc.getBalanceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBalanceMethod = QueryGrpc.getBalanceMethod) == null) {
          QueryGrpc.getBalanceMethod = getBalanceMethod =
              io.grpc.MethodDescriptor.<coreum.nft.v1beta1.QueryOuterClass.QueryBalanceRequest, coreum.nft.v1beta1.QueryOuterClass.QueryBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Balance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.nft.v1beta1.QueryOuterClass.QueryBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.nft.v1beta1.QueryOuterClass.QueryBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Balance"))
              .build();
        }
      }
    }
    return getBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<coreum.nft.v1beta1.QueryOuterClass.QueryOwnerRequest,
      coreum.nft.v1beta1.QueryOuterClass.QueryOwnerResponse> getOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Owner",
      requestType = coreum.nft.v1beta1.QueryOuterClass.QueryOwnerRequest.class,
      responseType = coreum.nft.v1beta1.QueryOuterClass.QueryOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<coreum.nft.v1beta1.QueryOuterClass.QueryOwnerRequest,
      coreum.nft.v1beta1.QueryOuterClass.QueryOwnerResponse> getOwnerMethod() {
    io.grpc.MethodDescriptor<coreum.nft.v1beta1.QueryOuterClass.QueryOwnerRequest, coreum.nft.v1beta1.QueryOuterClass.QueryOwnerResponse> getOwnerMethod;
    if ((getOwnerMethod = QueryGrpc.getOwnerMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOwnerMethod = QueryGrpc.getOwnerMethod) == null) {
          QueryGrpc.getOwnerMethod = getOwnerMethod =
              io.grpc.MethodDescriptor.<coreum.nft.v1beta1.QueryOuterClass.QueryOwnerRequest, coreum.nft.v1beta1.QueryOuterClass.QueryOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Owner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.nft.v1beta1.QueryOuterClass.QueryOwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.nft.v1beta1.QueryOuterClass.QueryOwnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Owner"))
              .build();
        }
      }
    }
    return getOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<coreum.nft.v1beta1.QueryOuterClass.QuerySupplyRequest,
      coreum.nft.v1beta1.QueryOuterClass.QuerySupplyResponse> getSupplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Supply",
      requestType = coreum.nft.v1beta1.QueryOuterClass.QuerySupplyRequest.class,
      responseType = coreum.nft.v1beta1.QueryOuterClass.QuerySupplyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<coreum.nft.v1beta1.QueryOuterClass.QuerySupplyRequest,
      coreum.nft.v1beta1.QueryOuterClass.QuerySupplyResponse> getSupplyMethod() {
    io.grpc.MethodDescriptor<coreum.nft.v1beta1.QueryOuterClass.QuerySupplyRequest, coreum.nft.v1beta1.QueryOuterClass.QuerySupplyResponse> getSupplyMethod;
    if ((getSupplyMethod = QueryGrpc.getSupplyMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSupplyMethod = QueryGrpc.getSupplyMethod) == null) {
          QueryGrpc.getSupplyMethod = getSupplyMethod =
              io.grpc.MethodDescriptor.<coreum.nft.v1beta1.QueryOuterClass.QuerySupplyRequest, coreum.nft.v1beta1.QueryOuterClass.QuerySupplyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Supply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.nft.v1beta1.QueryOuterClass.QuerySupplyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.nft.v1beta1.QueryOuterClass.QuerySupplyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Supply"))
              .build();
        }
      }
    }
    return getSupplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<coreum.nft.v1beta1.QueryOuterClass.QueryNFTsRequest,
      coreum.nft.v1beta1.QueryOuterClass.QueryNFTsResponse> getNFTsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NFTs",
      requestType = coreum.nft.v1beta1.QueryOuterClass.QueryNFTsRequest.class,
      responseType = coreum.nft.v1beta1.QueryOuterClass.QueryNFTsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<coreum.nft.v1beta1.QueryOuterClass.QueryNFTsRequest,
      coreum.nft.v1beta1.QueryOuterClass.QueryNFTsResponse> getNFTsMethod() {
    io.grpc.MethodDescriptor<coreum.nft.v1beta1.QueryOuterClass.QueryNFTsRequest, coreum.nft.v1beta1.QueryOuterClass.QueryNFTsResponse> getNFTsMethod;
    if ((getNFTsMethod = QueryGrpc.getNFTsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getNFTsMethod = QueryGrpc.getNFTsMethod) == null) {
          QueryGrpc.getNFTsMethod = getNFTsMethod =
              io.grpc.MethodDescriptor.<coreum.nft.v1beta1.QueryOuterClass.QueryNFTsRequest, coreum.nft.v1beta1.QueryOuterClass.QueryNFTsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NFTs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.nft.v1beta1.QueryOuterClass.QueryNFTsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.nft.v1beta1.QueryOuterClass.QueryNFTsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("NFTs"))
              .build();
        }
      }
    }
    return getNFTsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<coreum.nft.v1beta1.QueryOuterClass.QueryNFTRequest,
      coreum.nft.v1beta1.QueryOuterClass.QueryNFTResponse> getNFTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NFT",
      requestType = coreum.nft.v1beta1.QueryOuterClass.QueryNFTRequest.class,
      responseType = coreum.nft.v1beta1.QueryOuterClass.QueryNFTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<coreum.nft.v1beta1.QueryOuterClass.QueryNFTRequest,
      coreum.nft.v1beta1.QueryOuterClass.QueryNFTResponse> getNFTMethod() {
    io.grpc.MethodDescriptor<coreum.nft.v1beta1.QueryOuterClass.QueryNFTRequest, coreum.nft.v1beta1.QueryOuterClass.QueryNFTResponse> getNFTMethod;
    if ((getNFTMethod = QueryGrpc.getNFTMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getNFTMethod = QueryGrpc.getNFTMethod) == null) {
          QueryGrpc.getNFTMethod = getNFTMethod =
              io.grpc.MethodDescriptor.<coreum.nft.v1beta1.QueryOuterClass.QueryNFTRequest, coreum.nft.v1beta1.QueryOuterClass.QueryNFTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NFT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.nft.v1beta1.QueryOuterClass.QueryNFTRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.nft.v1beta1.QueryOuterClass.QueryNFTResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("NFT"))
              .build();
        }
      }
    }
    return getNFTMethod;
  }

  private static volatile io.grpc.MethodDescriptor<coreum.nft.v1beta1.QueryOuterClass.QueryClassRequest,
      coreum.nft.v1beta1.QueryOuterClass.QueryClassResponse> getClassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Class",
      requestType = coreum.nft.v1beta1.QueryOuterClass.QueryClassRequest.class,
      responseType = coreum.nft.v1beta1.QueryOuterClass.QueryClassResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<coreum.nft.v1beta1.QueryOuterClass.QueryClassRequest,
      coreum.nft.v1beta1.QueryOuterClass.QueryClassResponse> getClassMethod() {
    io.grpc.MethodDescriptor<coreum.nft.v1beta1.QueryOuterClass.QueryClassRequest, coreum.nft.v1beta1.QueryOuterClass.QueryClassResponse> getClassMethod;
    if ((getClassMethod = QueryGrpc.getClassMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClassMethod = QueryGrpc.getClassMethod) == null) {
          QueryGrpc.getClassMethod = getClassMethod =
              io.grpc.MethodDescriptor.<coreum.nft.v1beta1.QueryOuterClass.QueryClassRequest, coreum.nft.v1beta1.QueryOuterClass.QueryClassResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Class"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.nft.v1beta1.QueryOuterClass.QueryClassRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.nft.v1beta1.QueryOuterClass.QueryClassResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Class"))
              .build();
        }
      }
    }
    return getClassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<coreum.nft.v1beta1.QueryOuterClass.QueryClassesRequest,
      coreum.nft.v1beta1.QueryOuterClass.QueryClassesResponse> getClassesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Classes",
      requestType = coreum.nft.v1beta1.QueryOuterClass.QueryClassesRequest.class,
      responseType = coreum.nft.v1beta1.QueryOuterClass.QueryClassesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<coreum.nft.v1beta1.QueryOuterClass.QueryClassesRequest,
      coreum.nft.v1beta1.QueryOuterClass.QueryClassesResponse> getClassesMethod() {
    io.grpc.MethodDescriptor<coreum.nft.v1beta1.QueryOuterClass.QueryClassesRequest, coreum.nft.v1beta1.QueryOuterClass.QueryClassesResponse> getClassesMethod;
    if ((getClassesMethod = QueryGrpc.getClassesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClassesMethod = QueryGrpc.getClassesMethod) == null) {
          QueryGrpc.getClassesMethod = getClassesMethod =
              io.grpc.MethodDescriptor.<coreum.nft.v1beta1.QueryOuterClass.QueryClassesRequest, coreum.nft.v1beta1.QueryOuterClass.QueryClassesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Classes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.nft.v1beta1.QueryOuterClass.QueryClassesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  coreum.nft.v1beta1.QueryOuterClass.QueryClassesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Classes"))
              .build();
        }
      }
    }
    return getClassesMethod;
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
     * Balance queries the number of NFTs of a given class owned by the owner, same as balanceOf in ERC721
     * </pre>
     */
    public void balance(coreum.nft.v1beta1.QueryOuterClass.QueryBalanceRequest request,
        io.grpc.stub.StreamObserver<coreum.nft.v1beta1.QueryOuterClass.QueryBalanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Owner queries the owner of the NFT based on its class and id, same as ownerOf in ERC721
     * </pre>
     */
    public void owner(coreum.nft.v1beta1.QueryOuterClass.QueryOwnerRequest request,
        io.grpc.stub.StreamObserver<coreum.nft.v1beta1.QueryOuterClass.QueryOwnerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOwnerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Supply queries the number of NFTs from the given class, same as totalSupply of ERC721.
     * </pre>
     */
    public void supply(coreum.nft.v1beta1.QueryOuterClass.QuerySupplyRequest request,
        io.grpc.stub.StreamObserver<coreum.nft.v1beta1.QueryOuterClass.QuerySupplyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSupplyMethod(), responseObserver);
    }

    /**
     * <pre>
     * NFTs queries all NFTs of a given class or owner,choose at least one of the two, similar to tokenByIndex in
     * ERC721Enumerable
     * </pre>
     */
    public void nFTs(coreum.nft.v1beta1.QueryOuterClass.QueryNFTsRequest request,
        io.grpc.stub.StreamObserver<coreum.nft.v1beta1.QueryOuterClass.QueryNFTsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNFTsMethod(), responseObserver);
    }

    /**
     * <pre>
     * NFT queries an NFT based on its class and id.
     * </pre>
     */
    public void nFT(coreum.nft.v1beta1.QueryOuterClass.QueryNFTRequest request,
        io.grpc.stub.StreamObserver<coreum.nft.v1beta1.QueryOuterClass.QueryNFTResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNFTMethod(), responseObserver);
    }

    /**
     * <pre>
     * Class queries an NFT class based on its id
     * </pre>
     */
    public void class_(coreum.nft.v1beta1.QueryOuterClass.QueryClassRequest request,
        io.grpc.stub.StreamObserver<coreum.nft.v1beta1.QueryOuterClass.QueryClassResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClassMethod(), responseObserver);
    }

    /**
     * <pre>
     * Classes queries all NFT classes
     * </pre>
     */
    public void classes(coreum.nft.v1beta1.QueryOuterClass.QueryClassesRequest request,
        io.grpc.stub.StreamObserver<coreum.nft.v1beta1.QueryOuterClass.QueryClassesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClassesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                coreum.nft.v1beta1.QueryOuterClass.QueryBalanceRequest,
                coreum.nft.v1beta1.QueryOuterClass.QueryBalanceResponse>(
                  this, METHODID_BALANCE)))
          .addMethod(
            getOwnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                coreum.nft.v1beta1.QueryOuterClass.QueryOwnerRequest,
                coreum.nft.v1beta1.QueryOuterClass.QueryOwnerResponse>(
                  this, METHODID_OWNER)))
          .addMethod(
            getSupplyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                coreum.nft.v1beta1.QueryOuterClass.QuerySupplyRequest,
                coreum.nft.v1beta1.QueryOuterClass.QuerySupplyResponse>(
                  this, METHODID_SUPPLY)))
          .addMethod(
            getNFTsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                coreum.nft.v1beta1.QueryOuterClass.QueryNFTsRequest,
                coreum.nft.v1beta1.QueryOuterClass.QueryNFTsResponse>(
                  this, METHODID_NFTS)))
          .addMethod(
            getNFTMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                coreum.nft.v1beta1.QueryOuterClass.QueryNFTRequest,
                coreum.nft.v1beta1.QueryOuterClass.QueryNFTResponse>(
                  this, METHODID_NFT)))
          .addMethod(
            getClassMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                coreum.nft.v1beta1.QueryOuterClass.QueryClassRequest,
                coreum.nft.v1beta1.QueryOuterClass.QueryClassResponse>(
                  this, METHODID_CLASS)))
          .addMethod(
            getClassesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                coreum.nft.v1beta1.QueryOuterClass.QueryClassesRequest,
                coreum.nft.v1beta1.QueryOuterClass.QueryClassesResponse>(
                  this, METHODID_CLASSES)))
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
     * Balance queries the number of NFTs of a given class owned by the owner, same as balanceOf in ERC721
     * </pre>
     */
    public void balance(coreum.nft.v1beta1.QueryOuterClass.QueryBalanceRequest request,
        io.grpc.stub.StreamObserver<coreum.nft.v1beta1.QueryOuterClass.QueryBalanceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Owner queries the owner of the NFT based on its class and id, same as ownerOf in ERC721
     * </pre>
     */
    public void owner(coreum.nft.v1beta1.QueryOuterClass.QueryOwnerRequest request,
        io.grpc.stub.StreamObserver<coreum.nft.v1beta1.QueryOuterClass.QueryOwnerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Supply queries the number of NFTs from the given class, same as totalSupply of ERC721.
     * </pre>
     */
    public void supply(coreum.nft.v1beta1.QueryOuterClass.QuerySupplyRequest request,
        io.grpc.stub.StreamObserver<coreum.nft.v1beta1.QueryOuterClass.QuerySupplyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSupplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NFTs queries all NFTs of a given class or owner,choose at least one of the two, similar to tokenByIndex in
     * ERC721Enumerable
     * </pre>
     */
    public void nFTs(coreum.nft.v1beta1.QueryOuterClass.QueryNFTsRequest request,
        io.grpc.stub.StreamObserver<coreum.nft.v1beta1.QueryOuterClass.QueryNFTsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNFTsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NFT queries an NFT based on its class and id.
     * </pre>
     */
    public void nFT(coreum.nft.v1beta1.QueryOuterClass.QueryNFTRequest request,
        io.grpc.stub.StreamObserver<coreum.nft.v1beta1.QueryOuterClass.QueryNFTResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNFTMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Class queries an NFT class based on its id
     * </pre>
     */
    public void class_(coreum.nft.v1beta1.QueryOuterClass.QueryClassRequest request,
        io.grpc.stub.StreamObserver<coreum.nft.v1beta1.QueryOuterClass.QueryClassResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Classes queries all NFT classes
     * </pre>
     */
    public void classes(coreum.nft.v1beta1.QueryOuterClass.QueryClassesRequest request,
        io.grpc.stub.StreamObserver<coreum.nft.v1beta1.QueryOuterClass.QueryClassesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClassesMethod(), getCallOptions()), request, responseObserver);
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
     * Balance queries the number of NFTs of a given class owned by the owner, same as balanceOf in ERC721
     * </pre>
     */
    public coreum.nft.v1beta1.QueryOuterClass.QueryBalanceResponse balance(coreum.nft.v1beta1.QueryOuterClass.QueryBalanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getBalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Owner queries the owner of the NFT based on its class and id, same as ownerOf in ERC721
     * </pre>
     */
    public coreum.nft.v1beta1.QueryOuterClass.QueryOwnerResponse owner(coreum.nft.v1beta1.QueryOuterClass.QueryOwnerRequest request) {
      return blockingUnaryCall(
          getChannel(), getOwnerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Supply queries the number of NFTs from the given class, same as totalSupply of ERC721.
     * </pre>
     */
    public coreum.nft.v1beta1.QueryOuterClass.QuerySupplyResponse supply(coreum.nft.v1beta1.QueryOuterClass.QuerySupplyRequest request) {
      return blockingUnaryCall(
          getChannel(), getSupplyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NFTs queries all NFTs of a given class or owner,choose at least one of the two, similar to tokenByIndex in
     * ERC721Enumerable
     * </pre>
     */
    public coreum.nft.v1beta1.QueryOuterClass.QueryNFTsResponse nFTs(coreum.nft.v1beta1.QueryOuterClass.QueryNFTsRequest request) {
      return blockingUnaryCall(
          getChannel(), getNFTsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NFT queries an NFT based on its class and id.
     * </pre>
     */
    public coreum.nft.v1beta1.QueryOuterClass.QueryNFTResponse nFT(coreum.nft.v1beta1.QueryOuterClass.QueryNFTRequest request) {
      return blockingUnaryCall(
          getChannel(), getNFTMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Class queries an NFT class based on its id
     * </pre>
     */
    public coreum.nft.v1beta1.QueryOuterClass.QueryClassResponse class_(coreum.nft.v1beta1.QueryOuterClass.QueryClassRequest request) {
      return blockingUnaryCall(
          getChannel(), getClassMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Classes queries all NFT classes
     * </pre>
     */
    public coreum.nft.v1beta1.QueryOuterClass.QueryClassesResponse classes(coreum.nft.v1beta1.QueryOuterClass.QueryClassesRequest request) {
      return blockingUnaryCall(
          getChannel(), getClassesMethod(), getCallOptions(), request);
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
     * Balance queries the number of NFTs of a given class owned by the owner, same as balanceOf in ERC721
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<coreum.nft.v1beta1.QueryOuterClass.QueryBalanceResponse> balance(
        coreum.nft.v1beta1.QueryOuterClass.QueryBalanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBalanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Owner queries the owner of the NFT based on its class and id, same as ownerOf in ERC721
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<coreum.nft.v1beta1.QueryOuterClass.QueryOwnerResponse> owner(
        coreum.nft.v1beta1.QueryOuterClass.QueryOwnerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getOwnerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Supply queries the number of NFTs from the given class, same as totalSupply of ERC721.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<coreum.nft.v1beta1.QueryOuterClass.QuerySupplyResponse> supply(
        coreum.nft.v1beta1.QueryOuterClass.QuerySupplyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSupplyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NFTs queries all NFTs of a given class or owner,choose at least one of the two, similar to tokenByIndex in
     * ERC721Enumerable
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<coreum.nft.v1beta1.QueryOuterClass.QueryNFTsResponse> nFTs(
        coreum.nft.v1beta1.QueryOuterClass.QueryNFTsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNFTsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NFT queries an NFT based on its class and id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<coreum.nft.v1beta1.QueryOuterClass.QueryNFTResponse> nFT(
        coreum.nft.v1beta1.QueryOuterClass.QueryNFTRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNFTMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Class queries an NFT class based on its id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<coreum.nft.v1beta1.QueryOuterClass.QueryClassResponse> class_(
        coreum.nft.v1beta1.QueryOuterClass.QueryClassRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getClassMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Classes queries all NFT classes
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<coreum.nft.v1beta1.QueryOuterClass.QueryClassesResponse> classes(
        coreum.nft.v1beta1.QueryOuterClass.QueryClassesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getClassesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BALANCE = 0;
  private static final int METHODID_OWNER = 1;
  private static final int METHODID_SUPPLY = 2;
  private static final int METHODID_NFTS = 3;
  private static final int METHODID_NFT = 4;
  private static final int METHODID_CLASS = 5;
  private static final int METHODID_CLASSES = 6;

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
        case METHODID_BALANCE:
          serviceImpl.balance((coreum.nft.v1beta1.QueryOuterClass.QueryBalanceRequest) request,
              (io.grpc.stub.StreamObserver<coreum.nft.v1beta1.QueryOuterClass.QueryBalanceResponse>) responseObserver);
          break;
        case METHODID_OWNER:
          serviceImpl.owner((coreum.nft.v1beta1.QueryOuterClass.QueryOwnerRequest) request,
              (io.grpc.stub.StreamObserver<coreum.nft.v1beta1.QueryOuterClass.QueryOwnerResponse>) responseObserver);
          break;
        case METHODID_SUPPLY:
          serviceImpl.supply((coreum.nft.v1beta1.QueryOuterClass.QuerySupplyRequest) request,
              (io.grpc.stub.StreamObserver<coreum.nft.v1beta1.QueryOuterClass.QuerySupplyResponse>) responseObserver);
          break;
        case METHODID_NFTS:
          serviceImpl.nFTs((coreum.nft.v1beta1.QueryOuterClass.QueryNFTsRequest) request,
              (io.grpc.stub.StreamObserver<coreum.nft.v1beta1.QueryOuterClass.QueryNFTsResponse>) responseObserver);
          break;
        case METHODID_NFT:
          serviceImpl.nFT((coreum.nft.v1beta1.QueryOuterClass.QueryNFTRequest) request,
              (io.grpc.stub.StreamObserver<coreum.nft.v1beta1.QueryOuterClass.QueryNFTResponse>) responseObserver);
          break;
        case METHODID_CLASS:
          serviceImpl.class_((coreum.nft.v1beta1.QueryOuterClass.QueryClassRequest) request,
              (io.grpc.stub.StreamObserver<coreum.nft.v1beta1.QueryOuterClass.QueryClassResponse>) responseObserver);
          break;
        case METHODID_CLASSES:
          serviceImpl.classes((coreum.nft.v1beta1.QueryOuterClass.QueryClassesRequest) request,
              (io.grpc.stub.StreamObserver<coreum.nft.v1beta1.QueryOuterClass.QueryClassesResponse>) responseObserver);
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
      return coreum.nft.v1beta1.QueryOuterClass.getDescriptor();
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
              .addMethod(getBalanceMethod())
              .addMethod(getOwnerMethod())
              .addMethod(getSupplyMethod())
              .addMethod(getNFTsMethod())
              .addMethod(getNFTMethod())
              .addMethod(getClassMethod())
              .addMethod(getClassesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
