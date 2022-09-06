package likechain.likenft.v1;

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
    comments = "Source: likechain/likenft/v1/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "likechain.likenft.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryParamsRequest,
      likechain.likenft.v1.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = likechain.likenft.v1.QueryOuterClass.QueryParamsRequest.class,
      responseType = likechain.likenft.v1.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryParamsRequest,
      likechain.likenft.v1.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryParamsRequest, likechain.likenft.v1.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.QueryOuterClass.QueryParamsRequest, likechain.likenft.v1.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNRequest,
      likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNResponse> getClassesByISCNMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClassesByISCN",
      requestType = likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNRequest.class,
      responseType = likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNRequest,
      likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNResponse> getClassesByISCNMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNRequest, likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNResponse> getClassesByISCNMethod;
    if ((getClassesByISCNMethod = QueryGrpc.getClassesByISCNMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClassesByISCNMethod = QueryGrpc.getClassesByISCNMethod) == null) {
          QueryGrpc.getClassesByISCNMethod = getClassesByISCNMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNRequest, likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClassesByISCN"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ClassesByISCN"))
              .build();
        }
      }
    }
    return getClassesByISCNMethod;
  }

  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNIndexRequest,
      likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNIndexResponse> getClassesByISCNIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClassesByISCNIndex",
      requestType = likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNIndexRequest.class,
      responseType = likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNIndexResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNIndexRequest,
      likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNIndexResponse> getClassesByISCNIndexMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNIndexRequest, likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNIndexResponse> getClassesByISCNIndexMethod;
    if ((getClassesByISCNIndexMethod = QueryGrpc.getClassesByISCNIndexMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClassesByISCNIndexMethod = QueryGrpc.getClassesByISCNIndexMethod) == null) {
          QueryGrpc.getClassesByISCNIndexMethod = getClassesByISCNIndexMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNIndexRequest, likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNIndexResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClassesByISCNIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNIndexResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ClassesByISCNIndex"))
              .build();
        }
      }
    }
    return getClassesByISCNIndexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryISCNByClassRequest,
      likechain.likenft.v1.QueryOuterClass.QueryISCNByClassResponse> getISCNByClassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ISCNByClass",
      requestType = likechain.likenft.v1.QueryOuterClass.QueryISCNByClassRequest.class,
      responseType = likechain.likenft.v1.QueryOuterClass.QueryISCNByClassResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryISCNByClassRequest,
      likechain.likenft.v1.QueryOuterClass.QueryISCNByClassResponse> getISCNByClassMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryISCNByClassRequest, likechain.likenft.v1.QueryOuterClass.QueryISCNByClassResponse> getISCNByClassMethod;
    if ((getISCNByClassMethod = QueryGrpc.getISCNByClassMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getISCNByClassMethod = QueryGrpc.getISCNByClassMethod) == null) {
          QueryGrpc.getISCNByClassMethod = getISCNByClassMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.QueryOuterClass.QueryISCNByClassRequest, likechain.likenft.v1.QueryOuterClass.QueryISCNByClassResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ISCNByClass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryISCNByClassRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryISCNByClassResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ISCNByClass"))
              .build();
        }
      }
    }
    return getISCNByClassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountRequest,
      likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountResponse> getClassesByAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClassesByAccount",
      requestType = likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountRequest.class,
      responseType = likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountRequest,
      likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountResponse> getClassesByAccountMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountRequest, likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountResponse> getClassesByAccountMethod;
    if ((getClassesByAccountMethod = QueryGrpc.getClassesByAccountMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClassesByAccountMethod = QueryGrpc.getClassesByAccountMethod) == null) {
          QueryGrpc.getClassesByAccountMethod = getClassesByAccountMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountRequest, likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClassesByAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ClassesByAccount"))
              .build();
        }
      }
    }
    return getClassesByAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountIndexRequest,
      likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountIndexResponse> getClassesByAccountIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClassesByAccountIndex",
      requestType = likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountIndexRequest.class,
      responseType = likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountIndexResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountIndexRequest,
      likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountIndexResponse> getClassesByAccountIndexMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountIndexRequest, likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountIndexResponse> getClassesByAccountIndexMethod;
    if ((getClassesByAccountIndexMethod = QueryGrpc.getClassesByAccountIndexMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClassesByAccountIndexMethod = QueryGrpc.getClassesByAccountIndexMethod) == null) {
          QueryGrpc.getClassesByAccountIndexMethod = getClassesByAccountIndexMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountIndexRequest, likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountIndexResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClassesByAccountIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountIndexResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ClassesByAccountIndex"))
              .build();
        }
      }
    }
    return getClassesByAccountIndexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryAccountByClassRequest,
      likechain.likenft.v1.QueryOuterClass.QueryAccountByClassResponse> getAccountByClassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountByClass",
      requestType = likechain.likenft.v1.QueryOuterClass.QueryAccountByClassRequest.class,
      responseType = likechain.likenft.v1.QueryOuterClass.QueryAccountByClassResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryAccountByClassRequest,
      likechain.likenft.v1.QueryOuterClass.QueryAccountByClassResponse> getAccountByClassMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryAccountByClassRequest, likechain.likenft.v1.QueryOuterClass.QueryAccountByClassResponse> getAccountByClassMethod;
    if ((getAccountByClassMethod = QueryGrpc.getAccountByClassMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountByClassMethod = QueryGrpc.getAccountByClassMethod) == null) {
          QueryGrpc.getAccountByClassMethod = getAccountByClassMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.QueryOuterClass.QueryAccountByClassRequest, likechain.likenft.v1.QueryOuterClass.QueryAccountByClassResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountByClass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryAccountByClassRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryAccountByClassResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountByClass"))
              .build();
        }
      }
    }
    return getAccountByClassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentRequest,
      likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentResponse> getBlindBoxContentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BlindBoxContent",
      requestType = likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentRequest.class,
      responseType = likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentRequest,
      likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentResponse> getBlindBoxContentMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentRequest, likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentResponse> getBlindBoxContentMethod;
    if ((getBlindBoxContentMethod = QueryGrpc.getBlindBoxContentMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBlindBoxContentMethod = QueryGrpc.getBlindBoxContentMethod) == null) {
          QueryGrpc.getBlindBoxContentMethod = getBlindBoxContentMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentRequest, likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BlindBoxContent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BlindBoxContent"))
              .build();
        }
      }
    }
    return getBlindBoxContentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentIndexRequest,
      likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentIndexResponse> getBlindBoxContentIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BlindBoxContentIndex",
      requestType = likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentIndexRequest.class,
      responseType = likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentIndexResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentIndexRequest,
      likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentIndexResponse> getBlindBoxContentIndexMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentIndexRequest, likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentIndexResponse> getBlindBoxContentIndexMethod;
    if ((getBlindBoxContentIndexMethod = QueryGrpc.getBlindBoxContentIndexMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBlindBoxContentIndexMethod = QueryGrpc.getBlindBoxContentIndexMethod) == null) {
          QueryGrpc.getBlindBoxContentIndexMethod = getBlindBoxContentIndexMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentIndexRequest, likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentIndexResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BlindBoxContentIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentIndexResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BlindBoxContentIndex"))
              .build();
        }
      }
    }
    return getBlindBoxContentIndexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentsRequest,
      likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentsResponse> getBlindBoxContentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BlindBoxContents",
      requestType = likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentsRequest.class,
      responseType = likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentsRequest,
      likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentsResponse> getBlindBoxContentsMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentsRequest, likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentsResponse> getBlindBoxContentsMethod;
    if ((getBlindBoxContentsMethod = QueryGrpc.getBlindBoxContentsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBlindBoxContentsMethod = QueryGrpc.getBlindBoxContentsMethod) == null) {
          QueryGrpc.getBlindBoxContentsMethod = getBlindBoxContentsMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentsRequest, likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BlindBoxContents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BlindBoxContents"))
              .build();
        }
      }
    }
    return getBlindBoxContentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryOfferRequest,
      likechain.likenft.v1.QueryOuterClass.QueryOfferResponse> getOfferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Offer",
      requestType = likechain.likenft.v1.QueryOuterClass.QueryOfferRequest.class,
      responseType = likechain.likenft.v1.QueryOuterClass.QueryOfferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryOfferRequest,
      likechain.likenft.v1.QueryOuterClass.QueryOfferResponse> getOfferMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryOfferRequest, likechain.likenft.v1.QueryOuterClass.QueryOfferResponse> getOfferMethod;
    if ((getOfferMethod = QueryGrpc.getOfferMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOfferMethod = QueryGrpc.getOfferMethod) == null) {
          QueryGrpc.getOfferMethod = getOfferMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.QueryOuterClass.QueryOfferRequest, likechain.likenft.v1.QueryOuterClass.QueryOfferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Offer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryOfferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryOfferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Offer"))
              .build();
        }
      }
    }
    return getOfferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryOfferIndexRequest,
      likechain.likenft.v1.QueryOuterClass.QueryOfferIndexResponse> getOfferIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OfferIndex",
      requestType = likechain.likenft.v1.QueryOuterClass.QueryOfferIndexRequest.class,
      responseType = likechain.likenft.v1.QueryOuterClass.QueryOfferIndexResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryOfferIndexRequest,
      likechain.likenft.v1.QueryOuterClass.QueryOfferIndexResponse> getOfferIndexMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryOfferIndexRequest, likechain.likenft.v1.QueryOuterClass.QueryOfferIndexResponse> getOfferIndexMethod;
    if ((getOfferIndexMethod = QueryGrpc.getOfferIndexMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOfferIndexMethod = QueryGrpc.getOfferIndexMethod) == null) {
          QueryGrpc.getOfferIndexMethod = getOfferIndexMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.QueryOuterClass.QueryOfferIndexRequest, likechain.likenft.v1.QueryOuterClass.QueryOfferIndexResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OfferIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryOfferIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryOfferIndexResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OfferIndex"))
              .build();
        }
      }
    }
    return getOfferIndexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryOffersByClassRequest,
      likechain.likenft.v1.QueryOuterClass.QueryOffersByClassResponse> getOffersByClassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OffersByClass",
      requestType = likechain.likenft.v1.QueryOuterClass.QueryOffersByClassRequest.class,
      responseType = likechain.likenft.v1.QueryOuterClass.QueryOffersByClassResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryOffersByClassRequest,
      likechain.likenft.v1.QueryOuterClass.QueryOffersByClassResponse> getOffersByClassMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryOffersByClassRequest, likechain.likenft.v1.QueryOuterClass.QueryOffersByClassResponse> getOffersByClassMethod;
    if ((getOffersByClassMethod = QueryGrpc.getOffersByClassMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOffersByClassMethod = QueryGrpc.getOffersByClassMethod) == null) {
          QueryGrpc.getOffersByClassMethod = getOffersByClassMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.QueryOuterClass.QueryOffersByClassRequest, likechain.likenft.v1.QueryOuterClass.QueryOffersByClassResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OffersByClass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryOffersByClassRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryOffersByClassResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OffersByClass"))
              .build();
        }
      }
    }
    return getOffersByClassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryOffersByNFTRequest,
      likechain.likenft.v1.QueryOuterClass.QueryOffersByNFTResponse> getOffersByNFTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OffersByNFT",
      requestType = likechain.likenft.v1.QueryOuterClass.QueryOffersByNFTRequest.class,
      responseType = likechain.likenft.v1.QueryOuterClass.QueryOffersByNFTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryOffersByNFTRequest,
      likechain.likenft.v1.QueryOuterClass.QueryOffersByNFTResponse> getOffersByNFTMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryOffersByNFTRequest, likechain.likenft.v1.QueryOuterClass.QueryOffersByNFTResponse> getOffersByNFTMethod;
    if ((getOffersByNFTMethod = QueryGrpc.getOffersByNFTMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOffersByNFTMethod = QueryGrpc.getOffersByNFTMethod) == null) {
          QueryGrpc.getOffersByNFTMethod = getOffersByNFTMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.QueryOuterClass.QueryOffersByNFTRequest, likechain.likenft.v1.QueryOuterClass.QueryOffersByNFTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OffersByNFT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryOffersByNFTRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryOffersByNFTResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OffersByNFT"))
              .build();
        }
      }
    }
    return getOffersByNFTMethod;
  }

  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryListingRequest,
      likechain.likenft.v1.QueryOuterClass.QueryListingResponse> getListingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Listing",
      requestType = likechain.likenft.v1.QueryOuterClass.QueryListingRequest.class,
      responseType = likechain.likenft.v1.QueryOuterClass.QueryListingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryListingRequest,
      likechain.likenft.v1.QueryOuterClass.QueryListingResponse> getListingMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryListingRequest, likechain.likenft.v1.QueryOuterClass.QueryListingResponse> getListingMethod;
    if ((getListingMethod = QueryGrpc.getListingMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getListingMethod = QueryGrpc.getListingMethod) == null) {
          QueryGrpc.getListingMethod = getListingMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.QueryOuterClass.QueryListingRequest, likechain.likenft.v1.QueryOuterClass.QueryListingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Listing"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryListingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryListingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Listing"))
              .build();
        }
      }
    }
    return getListingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryListingIndexRequest,
      likechain.likenft.v1.QueryOuterClass.QueryListingIndexResponse> getListingIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListingIndex",
      requestType = likechain.likenft.v1.QueryOuterClass.QueryListingIndexRequest.class,
      responseType = likechain.likenft.v1.QueryOuterClass.QueryListingIndexResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryListingIndexRequest,
      likechain.likenft.v1.QueryOuterClass.QueryListingIndexResponse> getListingIndexMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryListingIndexRequest, likechain.likenft.v1.QueryOuterClass.QueryListingIndexResponse> getListingIndexMethod;
    if ((getListingIndexMethod = QueryGrpc.getListingIndexMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getListingIndexMethod = QueryGrpc.getListingIndexMethod) == null) {
          QueryGrpc.getListingIndexMethod = getListingIndexMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.QueryOuterClass.QueryListingIndexRequest, likechain.likenft.v1.QueryOuterClass.QueryListingIndexResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListingIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryListingIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryListingIndexResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ListingIndex"))
              .build();
        }
      }
    }
    return getListingIndexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryListingsByClassRequest,
      likechain.likenft.v1.QueryOuterClass.QueryListingsByClassResponse> getListingsByClassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListingsByClass",
      requestType = likechain.likenft.v1.QueryOuterClass.QueryListingsByClassRequest.class,
      responseType = likechain.likenft.v1.QueryOuterClass.QueryListingsByClassResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryListingsByClassRequest,
      likechain.likenft.v1.QueryOuterClass.QueryListingsByClassResponse> getListingsByClassMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryListingsByClassRequest, likechain.likenft.v1.QueryOuterClass.QueryListingsByClassResponse> getListingsByClassMethod;
    if ((getListingsByClassMethod = QueryGrpc.getListingsByClassMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getListingsByClassMethod = QueryGrpc.getListingsByClassMethod) == null) {
          QueryGrpc.getListingsByClassMethod = getListingsByClassMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.QueryOuterClass.QueryListingsByClassRequest, likechain.likenft.v1.QueryOuterClass.QueryListingsByClassResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListingsByClass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryListingsByClassRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryListingsByClassResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ListingsByClass"))
              .build();
        }
      }
    }
    return getListingsByClassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryListingsByNFTRequest,
      likechain.likenft.v1.QueryOuterClass.QueryListingsByNFTResponse> getListingsByNFTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListingsByNFT",
      requestType = likechain.likenft.v1.QueryOuterClass.QueryListingsByNFTRequest.class,
      responseType = likechain.likenft.v1.QueryOuterClass.QueryListingsByNFTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryListingsByNFTRequest,
      likechain.likenft.v1.QueryOuterClass.QueryListingsByNFTResponse> getListingsByNFTMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryListingsByNFTRequest, likechain.likenft.v1.QueryOuterClass.QueryListingsByNFTResponse> getListingsByNFTMethod;
    if ((getListingsByNFTMethod = QueryGrpc.getListingsByNFTMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getListingsByNFTMethod = QueryGrpc.getListingsByNFTMethod) == null) {
          QueryGrpc.getListingsByNFTMethod = getListingsByNFTMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.QueryOuterClass.QueryListingsByNFTRequest, likechain.likenft.v1.QueryOuterClass.QueryListingsByNFTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListingsByNFT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryListingsByNFTRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryListingsByNFTResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ListingsByNFT"))
              .build();
        }
      }
    }
    return getListingsByNFTMethod;
  }

  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigRequest,
      likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigResponse> getRoyaltyConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RoyaltyConfig",
      requestType = likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigRequest.class,
      responseType = likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigRequest,
      likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigResponse> getRoyaltyConfigMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigRequest, likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigResponse> getRoyaltyConfigMethod;
    if ((getRoyaltyConfigMethod = QueryGrpc.getRoyaltyConfigMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRoyaltyConfigMethod = QueryGrpc.getRoyaltyConfigMethod) == null) {
          QueryGrpc.getRoyaltyConfigMethod = getRoyaltyConfigMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigRequest, likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RoyaltyConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RoyaltyConfig"))
              .build();
        }
      }
    }
    return getRoyaltyConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigIndexRequest,
      likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigIndexResponse> getRoyaltyConfigIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RoyaltyConfigIndex",
      requestType = likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigIndexRequest.class,
      responseType = likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigIndexResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigIndexRequest,
      likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigIndexResponse> getRoyaltyConfigIndexMethod() {
    io.grpc.MethodDescriptor<likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigIndexRequest, likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigIndexResponse> getRoyaltyConfigIndexMethod;
    if ((getRoyaltyConfigIndexMethod = QueryGrpc.getRoyaltyConfigIndexMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRoyaltyConfigIndexMethod = QueryGrpc.getRoyaltyConfigIndexMethod) == null) {
          QueryGrpc.getRoyaltyConfigIndexMethod = getRoyaltyConfigIndexMethod =
              io.grpc.MethodDescriptor.<likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigIndexRequest, likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigIndexResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RoyaltyConfigIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigIndexResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RoyaltyConfigIndex"))
              .build();
        }
      }
    }
    return getRoyaltyConfigIndexMethod;
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
    public void params(likechain.likenft.v1.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a ClassesByISCN by index.
     * </pre>
     */
    public void classesByISCN(likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClassesByISCNMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ClassesByISCN items.
     * </pre>
     */
    public void classesByISCNIndex(likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNIndexRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNIndexResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClassesByISCNIndexMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ISCNByClass items.
     * </pre>
     */
    public void iSCNByClass(likechain.likenft.v1.QueryOuterClass.QueryISCNByClassRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryISCNByClassResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getISCNByClassMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a ClassesByAccount by index.
     * </pre>
     */
    public void classesByAccount(likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClassesByAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ClassesByAccount items.
     * </pre>
     */
    public void classesByAccountIndex(likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountIndexRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountIndexResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClassesByAccountIndexMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of AccountByClass items.
     * </pre>
     */
    public void accountByClass(likechain.likenft.v1.QueryOuterClass.QueryAccountByClassRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryAccountByClassResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAccountByClassMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a BlindBoxContent by index.
     * </pre>
     */
    public void blindBoxContent(likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBlindBoxContentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of BlindBoxContent items.
     * </pre>
     */
    public void blindBoxContentIndex(likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentIndexRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentIndexResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBlindBoxContentIndexMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of BlindBoxContents by class_id
     * </pre>
     */
    public void blindBoxContents(likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentsRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBlindBoxContentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a Offer by index.
     * </pre>
     */
    public void offer(likechain.likenft.v1.QueryOuterClass.QueryOfferRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryOfferResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOfferMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Offer items.
     * </pre>
     */
    public void offerIndex(likechain.likenft.v1.QueryOuterClass.QueryOfferIndexRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryOfferIndexResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOfferIndexMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of OffersByClass items.
     * </pre>
     */
    public void offersByClass(likechain.likenft.v1.QueryOuterClass.QueryOffersByClassRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryOffersByClassResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOffersByClassMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of OffersByNFT items.
     * </pre>
     */
    public void offersByNFT(likechain.likenft.v1.QueryOuterClass.QueryOffersByNFTRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryOffersByNFTResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOffersByNFTMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a Listing by index.
     * </pre>
     */
    public void listing(likechain.likenft.v1.QueryOuterClass.QueryListingRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryListingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Listing items.
     * </pre>
     */
    public void listingIndex(likechain.likenft.v1.QueryOuterClass.QueryListingIndexRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryListingIndexResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListingIndexMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Listing items by class
     * </pre>
     */
    public void listingsByClass(likechain.likenft.v1.QueryOuterClass.QueryListingsByClassRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryListingsByClassResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListingsByClassMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Listing items by nft
     * </pre>
     */
    public void listingsByNFT(likechain.likenft.v1.QueryOuterClass.QueryListingsByNFTRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryListingsByNFTResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListingsByNFTMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a RoyaltyConfig by class
     * </pre>
     */
    public void royaltyConfig(likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRoyaltyConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries index of RoyaltyConfig of all classes
     * </pre>
     */
    public void royaltyConfigIndex(likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigIndexRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigIndexResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRoyaltyConfigIndexMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.QueryOuterClass.QueryParamsRequest,
                likechain.likenft.v1.QueryOuterClass.QueryParamsResponse>(
                  this, METHODID_PARAMS)))
          .addMethod(
            getClassesByISCNMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNRequest,
                likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNResponse>(
                  this, METHODID_CLASSES_BY_ISCN)))
          .addMethod(
            getClassesByISCNIndexMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNIndexRequest,
                likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNIndexResponse>(
                  this, METHODID_CLASSES_BY_ISCNINDEX)))
          .addMethod(
            getISCNByClassMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.QueryOuterClass.QueryISCNByClassRequest,
                likechain.likenft.v1.QueryOuterClass.QueryISCNByClassResponse>(
                  this, METHODID_ISCNBY_CLASS)))
          .addMethod(
            getClassesByAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountRequest,
                likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountResponse>(
                  this, METHODID_CLASSES_BY_ACCOUNT)))
          .addMethod(
            getClassesByAccountIndexMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountIndexRequest,
                likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountIndexResponse>(
                  this, METHODID_CLASSES_BY_ACCOUNT_INDEX)))
          .addMethod(
            getAccountByClassMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.QueryOuterClass.QueryAccountByClassRequest,
                likechain.likenft.v1.QueryOuterClass.QueryAccountByClassResponse>(
                  this, METHODID_ACCOUNT_BY_CLASS)))
          .addMethod(
            getBlindBoxContentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentRequest,
                likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentResponse>(
                  this, METHODID_BLIND_BOX_CONTENT)))
          .addMethod(
            getBlindBoxContentIndexMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentIndexRequest,
                likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentIndexResponse>(
                  this, METHODID_BLIND_BOX_CONTENT_INDEX)))
          .addMethod(
            getBlindBoxContentsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentsRequest,
                likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentsResponse>(
                  this, METHODID_BLIND_BOX_CONTENTS)))
          .addMethod(
            getOfferMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.QueryOuterClass.QueryOfferRequest,
                likechain.likenft.v1.QueryOuterClass.QueryOfferResponse>(
                  this, METHODID_OFFER)))
          .addMethod(
            getOfferIndexMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.QueryOuterClass.QueryOfferIndexRequest,
                likechain.likenft.v1.QueryOuterClass.QueryOfferIndexResponse>(
                  this, METHODID_OFFER_INDEX)))
          .addMethod(
            getOffersByClassMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.QueryOuterClass.QueryOffersByClassRequest,
                likechain.likenft.v1.QueryOuterClass.QueryOffersByClassResponse>(
                  this, METHODID_OFFERS_BY_CLASS)))
          .addMethod(
            getOffersByNFTMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.QueryOuterClass.QueryOffersByNFTRequest,
                likechain.likenft.v1.QueryOuterClass.QueryOffersByNFTResponse>(
                  this, METHODID_OFFERS_BY_NFT)))
          .addMethod(
            getListingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.QueryOuterClass.QueryListingRequest,
                likechain.likenft.v1.QueryOuterClass.QueryListingResponse>(
                  this, METHODID_LISTING)))
          .addMethod(
            getListingIndexMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.QueryOuterClass.QueryListingIndexRequest,
                likechain.likenft.v1.QueryOuterClass.QueryListingIndexResponse>(
                  this, METHODID_LISTING_INDEX)))
          .addMethod(
            getListingsByClassMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.QueryOuterClass.QueryListingsByClassRequest,
                likechain.likenft.v1.QueryOuterClass.QueryListingsByClassResponse>(
                  this, METHODID_LISTINGS_BY_CLASS)))
          .addMethod(
            getListingsByNFTMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.QueryOuterClass.QueryListingsByNFTRequest,
                likechain.likenft.v1.QueryOuterClass.QueryListingsByNFTResponse>(
                  this, METHODID_LISTINGS_BY_NFT)))
          .addMethod(
            getRoyaltyConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigRequest,
                likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigResponse>(
                  this, METHODID_ROYALTY_CONFIG)))
          .addMethod(
            getRoyaltyConfigIndexMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigIndexRequest,
                likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigIndexResponse>(
                  this, METHODID_ROYALTY_CONFIG_INDEX)))
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
    public void params(likechain.likenft.v1.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a ClassesByISCN by index.
     * </pre>
     */
    public void classesByISCN(likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClassesByISCNMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ClassesByISCN items.
     * </pre>
     */
    public void classesByISCNIndex(likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNIndexRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNIndexResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClassesByISCNIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ISCNByClass items.
     * </pre>
     */
    public void iSCNByClass(likechain.likenft.v1.QueryOuterClass.QueryISCNByClassRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryISCNByClassResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getISCNByClassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a ClassesByAccount by index.
     * </pre>
     */
    public void classesByAccount(likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClassesByAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ClassesByAccount items.
     * </pre>
     */
    public void classesByAccountIndex(likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountIndexRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountIndexResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClassesByAccountIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of AccountByClass items.
     * </pre>
     */
    public void accountByClass(likechain.likenft.v1.QueryOuterClass.QueryAccountByClassRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryAccountByClassResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAccountByClassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a BlindBoxContent by index.
     * </pre>
     */
    public void blindBoxContent(likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBlindBoxContentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of BlindBoxContent items.
     * </pre>
     */
    public void blindBoxContentIndex(likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentIndexRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentIndexResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBlindBoxContentIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of BlindBoxContents by class_id
     * </pre>
     */
    public void blindBoxContents(likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentsRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBlindBoxContentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a Offer by index.
     * </pre>
     */
    public void offer(likechain.likenft.v1.QueryOuterClass.QueryOfferRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryOfferResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOfferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Offer items.
     * </pre>
     */
    public void offerIndex(likechain.likenft.v1.QueryOuterClass.QueryOfferIndexRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryOfferIndexResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOfferIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of OffersByClass items.
     * </pre>
     */
    public void offersByClass(likechain.likenft.v1.QueryOuterClass.QueryOffersByClassRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryOffersByClassResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOffersByClassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of OffersByNFT items.
     * </pre>
     */
    public void offersByNFT(likechain.likenft.v1.QueryOuterClass.QueryOffersByNFTRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryOffersByNFTResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOffersByNFTMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a Listing by index.
     * </pre>
     */
    public void listing(likechain.likenft.v1.QueryOuterClass.QueryListingRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryListingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Listing items.
     * </pre>
     */
    public void listingIndex(likechain.likenft.v1.QueryOuterClass.QueryListingIndexRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryListingIndexResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListingIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Listing items by class
     * </pre>
     */
    public void listingsByClass(likechain.likenft.v1.QueryOuterClass.QueryListingsByClassRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryListingsByClassResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListingsByClassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Listing items by nft
     * </pre>
     */
    public void listingsByNFT(likechain.likenft.v1.QueryOuterClass.QueryListingsByNFTRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryListingsByNFTResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListingsByNFTMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a RoyaltyConfig by class
     * </pre>
     */
    public void royaltyConfig(likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRoyaltyConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries index of RoyaltyConfig of all classes
     * </pre>
     */
    public void royaltyConfigIndex(likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigIndexRequest request,
        io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigIndexResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRoyaltyConfigIndexMethod(), getCallOptions()), request, responseObserver);
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
    public likechain.likenft.v1.QueryOuterClass.QueryParamsResponse params(likechain.likenft.v1.QueryOuterClass.QueryParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a ClassesByISCN by index.
     * </pre>
     */
    public likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNResponse classesByISCN(likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNRequest request) {
      return blockingUnaryCall(
          getChannel(), getClassesByISCNMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of ClassesByISCN items.
     * </pre>
     */
    public likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNIndexResponse classesByISCNIndex(likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNIndexRequest request) {
      return blockingUnaryCall(
          getChannel(), getClassesByISCNIndexMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of ISCNByClass items.
     * </pre>
     */
    public likechain.likenft.v1.QueryOuterClass.QueryISCNByClassResponse iSCNByClass(likechain.likenft.v1.QueryOuterClass.QueryISCNByClassRequest request) {
      return blockingUnaryCall(
          getChannel(), getISCNByClassMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a ClassesByAccount by index.
     * </pre>
     */
    public likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountResponse classesByAccount(likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getClassesByAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of ClassesByAccount items.
     * </pre>
     */
    public likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountIndexResponse classesByAccountIndex(likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountIndexRequest request) {
      return blockingUnaryCall(
          getChannel(), getClassesByAccountIndexMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of AccountByClass items.
     * </pre>
     */
    public likechain.likenft.v1.QueryOuterClass.QueryAccountByClassResponse accountByClass(likechain.likenft.v1.QueryOuterClass.QueryAccountByClassRequest request) {
      return blockingUnaryCall(
          getChannel(), getAccountByClassMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a BlindBoxContent by index.
     * </pre>
     */
    public likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentResponse blindBoxContent(likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentRequest request) {
      return blockingUnaryCall(
          getChannel(), getBlindBoxContentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of BlindBoxContent items.
     * </pre>
     */
    public likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentIndexResponse blindBoxContentIndex(likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentIndexRequest request) {
      return blockingUnaryCall(
          getChannel(), getBlindBoxContentIndexMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of BlindBoxContents by class_id
     * </pre>
     */
    public likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentsResponse blindBoxContents(likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentsRequest request) {
      return blockingUnaryCall(
          getChannel(), getBlindBoxContentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a Offer by index.
     * </pre>
     */
    public likechain.likenft.v1.QueryOuterClass.QueryOfferResponse offer(likechain.likenft.v1.QueryOuterClass.QueryOfferRequest request) {
      return blockingUnaryCall(
          getChannel(), getOfferMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of Offer items.
     * </pre>
     */
    public likechain.likenft.v1.QueryOuterClass.QueryOfferIndexResponse offerIndex(likechain.likenft.v1.QueryOuterClass.QueryOfferIndexRequest request) {
      return blockingUnaryCall(
          getChannel(), getOfferIndexMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of OffersByClass items.
     * </pre>
     */
    public likechain.likenft.v1.QueryOuterClass.QueryOffersByClassResponse offersByClass(likechain.likenft.v1.QueryOuterClass.QueryOffersByClassRequest request) {
      return blockingUnaryCall(
          getChannel(), getOffersByClassMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of OffersByNFT items.
     * </pre>
     */
    public likechain.likenft.v1.QueryOuterClass.QueryOffersByNFTResponse offersByNFT(likechain.likenft.v1.QueryOuterClass.QueryOffersByNFTRequest request) {
      return blockingUnaryCall(
          getChannel(), getOffersByNFTMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a Listing by index.
     * </pre>
     */
    public likechain.likenft.v1.QueryOuterClass.QueryListingResponse listing(likechain.likenft.v1.QueryOuterClass.QueryListingRequest request) {
      return blockingUnaryCall(
          getChannel(), getListingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of Listing items.
     * </pre>
     */
    public likechain.likenft.v1.QueryOuterClass.QueryListingIndexResponse listingIndex(likechain.likenft.v1.QueryOuterClass.QueryListingIndexRequest request) {
      return blockingUnaryCall(
          getChannel(), getListingIndexMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of Listing items by class
     * </pre>
     */
    public likechain.likenft.v1.QueryOuterClass.QueryListingsByClassResponse listingsByClass(likechain.likenft.v1.QueryOuterClass.QueryListingsByClassRequest request) {
      return blockingUnaryCall(
          getChannel(), getListingsByClassMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of Listing items by nft
     * </pre>
     */
    public likechain.likenft.v1.QueryOuterClass.QueryListingsByNFTResponse listingsByNFT(likechain.likenft.v1.QueryOuterClass.QueryListingsByNFTRequest request) {
      return blockingUnaryCall(
          getChannel(), getListingsByNFTMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a RoyaltyConfig by class
     * </pre>
     */
    public likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigResponse royaltyConfig(likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigRequest request) {
      return blockingUnaryCall(
          getChannel(), getRoyaltyConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries index of RoyaltyConfig of all classes
     * </pre>
     */
    public likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigIndexResponse royaltyConfigIndex(likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigIndexRequest request) {
      return blockingUnaryCall(
          getChannel(), getRoyaltyConfigIndexMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.QueryOuterClass.QueryParamsResponse> params(
        likechain.likenft.v1.QueryOuterClass.QueryParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a ClassesByISCN by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNResponse> classesByISCN(
        likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getClassesByISCNMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of ClassesByISCN items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNIndexResponse> classesByISCNIndex(
        likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNIndexRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getClassesByISCNIndexMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of ISCNByClass items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.QueryOuterClass.QueryISCNByClassResponse> iSCNByClass(
        likechain.likenft.v1.QueryOuterClass.QueryISCNByClassRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getISCNByClassMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a ClassesByAccount by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountResponse> classesByAccount(
        likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getClassesByAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of ClassesByAccount items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountIndexResponse> classesByAccountIndex(
        likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountIndexRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getClassesByAccountIndexMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of AccountByClass items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.QueryOuterClass.QueryAccountByClassResponse> accountByClass(
        likechain.likenft.v1.QueryOuterClass.QueryAccountByClassRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAccountByClassMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a BlindBoxContent by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentResponse> blindBoxContent(
        likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBlindBoxContentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of BlindBoxContent items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentIndexResponse> blindBoxContentIndex(
        likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentIndexRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBlindBoxContentIndexMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of BlindBoxContents by class_id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentsResponse> blindBoxContents(
        likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBlindBoxContentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a Offer by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.QueryOuterClass.QueryOfferResponse> offer(
        likechain.likenft.v1.QueryOuterClass.QueryOfferRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getOfferMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of Offer items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.QueryOuterClass.QueryOfferIndexResponse> offerIndex(
        likechain.likenft.v1.QueryOuterClass.QueryOfferIndexRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getOfferIndexMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of OffersByClass items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.QueryOuterClass.QueryOffersByClassResponse> offersByClass(
        likechain.likenft.v1.QueryOuterClass.QueryOffersByClassRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getOffersByClassMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of OffersByNFT items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.QueryOuterClass.QueryOffersByNFTResponse> offersByNFT(
        likechain.likenft.v1.QueryOuterClass.QueryOffersByNFTRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getOffersByNFTMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a Listing by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.QueryOuterClass.QueryListingResponse> listing(
        likechain.likenft.v1.QueryOuterClass.QueryListingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of Listing items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.QueryOuterClass.QueryListingIndexResponse> listingIndex(
        likechain.likenft.v1.QueryOuterClass.QueryListingIndexRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListingIndexMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of Listing items by class
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.QueryOuterClass.QueryListingsByClassResponse> listingsByClass(
        likechain.likenft.v1.QueryOuterClass.QueryListingsByClassRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListingsByClassMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of Listing items by nft
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.QueryOuterClass.QueryListingsByNFTResponse> listingsByNFT(
        likechain.likenft.v1.QueryOuterClass.QueryListingsByNFTRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListingsByNFTMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a RoyaltyConfig by class
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigResponse> royaltyConfig(
        likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRoyaltyConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries index of RoyaltyConfig of all classes
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigIndexResponse> royaltyConfigIndex(
        likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigIndexRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRoyaltyConfigIndexMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_CLASSES_BY_ISCN = 1;
  private static final int METHODID_CLASSES_BY_ISCNINDEX = 2;
  private static final int METHODID_ISCNBY_CLASS = 3;
  private static final int METHODID_CLASSES_BY_ACCOUNT = 4;
  private static final int METHODID_CLASSES_BY_ACCOUNT_INDEX = 5;
  private static final int METHODID_ACCOUNT_BY_CLASS = 6;
  private static final int METHODID_BLIND_BOX_CONTENT = 7;
  private static final int METHODID_BLIND_BOX_CONTENT_INDEX = 8;
  private static final int METHODID_BLIND_BOX_CONTENTS = 9;
  private static final int METHODID_OFFER = 10;
  private static final int METHODID_OFFER_INDEX = 11;
  private static final int METHODID_OFFERS_BY_CLASS = 12;
  private static final int METHODID_OFFERS_BY_NFT = 13;
  private static final int METHODID_LISTING = 14;
  private static final int METHODID_LISTING_INDEX = 15;
  private static final int METHODID_LISTINGS_BY_CLASS = 16;
  private static final int METHODID_LISTINGS_BY_NFT = 17;
  private static final int METHODID_ROYALTY_CONFIG = 18;
  private static final int METHODID_ROYALTY_CONFIG_INDEX = 19;

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
          serviceImpl.params((likechain.likenft.v1.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_CLASSES_BY_ISCN:
          serviceImpl.classesByISCN((likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNRequest) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNResponse>) responseObserver);
          break;
        case METHODID_CLASSES_BY_ISCNINDEX:
          serviceImpl.classesByISCNIndex((likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNIndexRequest) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryClassesByISCNIndexResponse>) responseObserver);
          break;
        case METHODID_ISCNBY_CLASS:
          serviceImpl.iSCNByClass((likechain.likenft.v1.QueryOuterClass.QueryISCNByClassRequest) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryISCNByClassResponse>) responseObserver);
          break;
        case METHODID_CLASSES_BY_ACCOUNT:
          serviceImpl.classesByAccount((likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountRequest) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountResponse>) responseObserver);
          break;
        case METHODID_CLASSES_BY_ACCOUNT_INDEX:
          serviceImpl.classesByAccountIndex((likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountIndexRequest) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryClassesByAccountIndexResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_BY_CLASS:
          serviceImpl.accountByClass((likechain.likenft.v1.QueryOuterClass.QueryAccountByClassRequest) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryAccountByClassResponse>) responseObserver);
          break;
        case METHODID_BLIND_BOX_CONTENT:
          serviceImpl.blindBoxContent((likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentRequest) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentResponse>) responseObserver);
          break;
        case METHODID_BLIND_BOX_CONTENT_INDEX:
          serviceImpl.blindBoxContentIndex((likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentIndexRequest) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentIndexResponse>) responseObserver);
          break;
        case METHODID_BLIND_BOX_CONTENTS:
          serviceImpl.blindBoxContents((likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentsRequest) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryBlindBoxContentsResponse>) responseObserver);
          break;
        case METHODID_OFFER:
          serviceImpl.offer((likechain.likenft.v1.QueryOuterClass.QueryOfferRequest) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryOfferResponse>) responseObserver);
          break;
        case METHODID_OFFER_INDEX:
          serviceImpl.offerIndex((likechain.likenft.v1.QueryOuterClass.QueryOfferIndexRequest) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryOfferIndexResponse>) responseObserver);
          break;
        case METHODID_OFFERS_BY_CLASS:
          serviceImpl.offersByClass((likechain.likenft.v1.QueryOuterClass.QueryOffersByClassRequest) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryOffersByClassResponse>) responseObserver);
          break;
        case METHODID_OFFERS_BY_NFT:
          serviceImpl.offersByNFT((likechain.likenft.v1.QueryOuterClass.QueryOffersByNFTRequest) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryOffersByNFTResponse>) responseObserver);
          break;
        case METHODID_LISTING:
          serviceImpl.listing((likechain.likenft.v1.QueryOuterClass.QueryListingRequest) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryListingResponse>) responseObserver);
          break;
        case METHODID_LISTING_INDEX:
          serviceImpl.listingIndex((likechain.likenft.v1.QueryOuterClass.QueryListingIndexRequest) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryListingIndexResponse>) responseObserver);
          break;
        case METHODID_LISTINGS_BY_CLASS:
          serviceImpl.listingsByClass((likechain.likenft.v1.QueryOuterClass.QueryListingsByClassRequest) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryListingsByClassResponse>) responseObserver);
          break;
        case METHODID_LISTINGS_BY_NFT:
          serviceImpl.listingsByNFT((likechain.likenft.v1.QueryOuterClass.QueryListingsByNFTRequest) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryListingsByNFTResponse>) responseObserver);
          break;
        case METHODID_ROYALTY_CONFIG:
          serviceImpl.royaltyConfig((likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigRequest) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigResponse>) responseObserver);
          break;
        case METHODID_ROYALTY_CONFIG_INDEX:
          serviceImpl.royaltyConfigIndex((likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigIndexRequest) request,
              (io.grpc.stub.StreamObserver<likechain.likenft.v1.QueryOuterClass.QueryRoyaltyConfigIndexResponse>) responseObserver);
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
      return likechain.likenft.v1.QueryOuterClass.getDescriptor();
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
              .addMethod(getClassesByISCNMethod())
              .addMethod(getClassesByISCNIndexMethod())
              .addMethod(getISCNByClassMethod())
              .addMethod(getClassesByAccountMethod())
              .addMethod(getClassesByAccountIndexMethod())
              .addMethod(getAccountByClassMethod())
              .addMethod(getBlindBoxContentMethod())
              .addMethod(getBlindBoxContentIndexMethod())
              .addMethod(getBlindBoxContentsMethod())
              .addMethod(getOfferMethod())
              .addMethod(getOfferIndexMethod())
              .addMethod(getOffersByClassMethod())
              .addMethod(getOffersByNFTMethod())
              .addMethod(getListingMethod())
              .addMethod(getListingIndexMethod())
              .addMethod(getListingsByClassMethod())
              .addMethod(getListingsByNFTMethod())
              .addMethod(getRoyaltyConfigMethod())
              .addMethod(getRoyaltyConfigIndexMethod())
              .build();
        }
      }
    }
    return result;
  }
}
