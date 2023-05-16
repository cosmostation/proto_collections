package noble.tokenfactory;

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
    comments = "Source: noble/tokenfactory/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "noble.tokenfactory.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryParamsRequest,
      noble.tokenfactory.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = noble.tokenfactory.QueryOuterClass.QueryParamsRequest.class,
      responseType = noble.tokenfactory.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryParamsRequest,
      noble.tokenfactory.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryParamsRequest, noble.tokenfactory.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<noble.tokenfactory.QueryOuterClass.QueryParamsRequest, noble.tokenfactory.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryGetBlacklistedRequest,
      noble.tokenfactory.QueryOuterClass.QueryGetBlacklistedResponse> getBlacklistedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Blacklisted",
      requestType = noble.tokenfactory.QueryOuterClass.QueryGetBlacklistedRequest.class,
      responseType = noble.tokenfactory.QueryOuterClass.QueryGetBlacklistedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryGetBlacklistedRequest,
      noble.tokenfactory.QueryOuterClass.QueryGetBlacklistedResponse> getBlacklistedMethod() {
    io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryGetBlacklistedRequest, noble.tokenfactory.QueryOuterClass.QueryGetBlacklistedResponse> getBlacklistedMethod;
    if ((getBlacklistedMethod = QueryGrpc.getBlacklistedMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBlacklistedMethod = QueryGrpc.getBlacklistedMethod) == null) {
          QueryGrpc.getBlacklistedMethod = getBlacklistedMethod =
              io.grpc.MethodDescriptor.<noble.tokenfactory.QueryOuterClass.QueryGetBlacklistedRequest, noble.tokenfactory.QueryOuterClass.QueryGetBlacklistedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Blacklisted"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.QueryOuterClass.QueryGetBlacklistedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.QueryOuterClass.QueryGetBlacklistedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Blacklisted"))
              .build();
        }
      }
    }
    return getBlacklistedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryAllBlacklistedRequest,
      noble.tokenfactory.QueryOuterClass.QueryAllBlacklistedResponse> getBlacklistedAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BlacklistedAll",
      requestType = noble.tokenfactory.QueryOuterClass.QueryAllBlacklistedRequest.class,
      responseType = noble.tokenfactory.QueryOuterClass.QueryAllBlacklistedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryAllBlacklistedRequest,
      noble.tokenfactory.QueryOuterClass.QueryAllBlacklistedResponse> getBlacklistedAllMethod() {
    io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryAllBlacklistedRequest, noble.tokenfactory.QueryOuterClass.QueryAllBlacklistedResponse> getBlacklistedAllMethod;
    if ((getBlacklistedAllMethod = QueryGrpc.getBlacklistedAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBlacklistedAllMethod = QueryGrpc.getBlacklistedAllMethod) == null) {
          QueryGrpc.getBlacklistedAllMethod = getBlacklistedAllMethod =
              io.grpc.MethodDescriptor.<noble.tokenfactory.QueryOuterClass.QueryAllBlacklistedRequest, noble.tokenfactory.QueryOuterClass.QueryAllBlacklistedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BlacklistedAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.QueryOuterClass.QueryAllBlacklistedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.QueryOuterClass.QueryAllBlacklistedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BlacklistedAll"))
              .build();
        }
      }
    }
    return getBlacklistedAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryGetPausedRequest,
      noble.tokenfactory.QueryOuterClass.QueryGetPausedResponse> getPausedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Paused",
      requestType = noble.tokenfactory.QueryOuterClass.QueryGetPausedRequest.class,
      responseType = noble.tokenfactory.QueryOuterClass.QueryGetPausedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryGetPausedRequest,
      noble.tokenfactory.QueryOuterClass.QueryGetPausedResponse> getPausedMethod() {
    io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryGetPausedRequest, noble.tokenfactory.QueryOuterClass.QueryGetPausedResponse> getPausedMethod;
    if ((getPausedMethod = QueryGrpc.getPausedMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPausedMethod = QueryGrpc.getPausedMethod) == null) {
          QueryGrpc.getPausedMethod = getPausedMethod =
              io.grpc.MethodDescriptor.<noble.tokenfactory.QueryOuterClass.QueryGetPausedRequest, noble.tokenfactory.QueryOuterClass.QueryGetPausedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Paused"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.QueryOuterClass.QueryGetPausedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.QueryOuterClass.QueryGetPausedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Paused"))
              .build();
        }
      }
    }
    return getPausedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryGetMasterMinterRequest,
      noble.tokenfactory.QueryOuterClass.QueryGetMasterMinterResponse> getMasterMinterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MasterMinter",
      requestType = noble.tokenfactory.QueryOuterClass.QueryGetMasterMinterRequest.class,
      responseType = noble.tokenfactory.QueryOuterClass.QueryGetMasterMinterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryGetMasterMinterRequest,
      noble.tokenfactory.QueryOuterClass.QueryGetMasterMinterResponse> getMasterMinterMethod() {
    io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryGetMasterMinterRequest, noble.tokenfactory.QueryOuterClass.QueryGetMasterMinterResponse> getMasterMinterMethod;
    if ((getMasterMinterMethod = QueryGrpc.getMasterMinterMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMasterMinterMethod = QueryGrpc.getMasterMinterMethod) == null) {
          QueryGrpc.getMasterMinterMethod = getMasterMinterMethod =
              io.grpc.MethodDescriptor.<noble.tokenfactory.QueryOuterClass.QueryGetMasterMinterRequest, noble.tokenfactory.QueryOuterClass.QueryGetMasterMinterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MasterMinter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.QueryOuterClass.QueryGetMasterMinterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.QueryOuterClass.QueryGetMasterMinterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MasterMinter"))
              .build();
        }
      }
    }
    return getMasterMinterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryGetMintersRequest,
      noble.tokenfactory.QueryOuterClass.QueryGetMintersResponse> getMintersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Minters",
      requestType = noble.tokenfactory.QueryOuterClass.QueryGetMintersRequest.class,
      responseType = noble.tokenfactory.QueryOuterClass.QueryGetMintersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryGetMintersRequest,
      noble.tokenfactory.QueryOuterClass.QueryGetMintersResponse> getMintersMethod() {
    io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryGetMintersRequest, noble.tokenfactory.QueryOuterClass.QueryGetMintersResponse> getMintersMethod;
    if ((getMintersMethod = QueryGrpc.getMintersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMintersMethod = QueryGrpc.getMintersMethod) == null) {
          QueryGrpc.getMintersMethod = getMintersMethod =
              io.grpc.MethodDescriptor.<noble.tokenfactory.QueryOuterClass.QueryGetMintersRequest, noble.tokenfactory.QueryOuterClass.QueryGetMintersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Minters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.QueryOuterClass.QueryGetMintersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.QueryOuterClass.QueryGetMintersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Minters"))
              .build();
        }
      }
    }
    return getMintersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryAllMintersRequest,
      noble.tokenfactory.QueryOuterClass.QueryAllMintersResponse> getMintersAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MintersAll",
      requestType = noble.tokenfactory.QueryOuterClass.QueryAllMintersRequest.class,
      responseType = noble.tokenfactory.QueryOuterClass.QueryAllMintersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryAllMintersRequest,
      noble.tokenfactory.QueryOuterClass.QueryAllMintersResponse> getMintersAllMethod() {
    io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryAllMintersRequest, noble.tokenfactory.QueryOuterClass.QueryAllMintersResponse> getMintersAllMethod;
    if ((getMintersAllMethod = QueryGrpc.getMintersAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMintersAllMethod = QueryGrpc.getMintersAllMethod) == null) {
          QueryGrpc.getMintersAllMethod = getMintersAllMethod =
              io.grpc.MethodDescriptor.<noble.tokenfactory.QueryOuterClass.QueryAllMintersRequest, noble.tokenfactory.QueryOuterClass.QueryAllMintersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MintersAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.QueryOuterClass.QueryAllMintersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.QueryOuterClass.QueryAllMintersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MintersAll"))
              .build();
        }
      }
    }
    return getMintersAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryGetPauserRequest,
      noble.tokenfactory.QueryOuterClass.QueryGetPauserResponse> getPauserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pauser",
      requestType = noble.tokenfactory.QueryOuterClass.QueryGetPauserRequest.class,
      responseType = noble.tokenfactory.QueryOuterClass.QueryGetPauserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryGetPauserRequest,
      noble.tokenfactory.QueryOuterClass.QueryGetPauserResponse> getPauserMethod() {
    io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryGetPauserRequest, noble.tokenfactory.QueryOuterClass.QueryGetPauserResponse> getPauserMethod;
    if ((getPauserMethod = QueryGrpc.getPauserMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPauserMethod = QueryGrpc.getPauserMethod) == null) {
          QueryGrpc.getPauserMethod = getPauserMethod =
              io.grpc.MethodDescriptor.<noble.tokenfactory.QueryOuterClass.QueryGetPauserRequest, noble.tokenfactory.QueryOuterClass.QueryGetPauserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pauser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.QueryOuterClass.QueryGetPauserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.QueryOuterClass.QueryGetPauserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Pauser"))
              .build();
        }
      }
    }
    return getPauserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryGetBlacklisterRequest,
      noble.tokenfactory.QueryOuterClass.QueryGetBlacklisterResponse> getBlacklisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Blacklister",
      requestType = noble.tokenfactory.QueryOuterClass.QueryGetBlacklisterRequest.class,
      responseType = noble.tokenfactory.QueryOuterClass.QueryGetBlacklisterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryGetBlacklisterRequest,
      noble.tokenfactory.QueryOuterClass.QueryGetBlacklisterResponse> getBlacklisterMethod() {
    io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryGetBlacklisterRequest, noble.tokenfactory.QueryOuterClass.QueryGetBlacklisterResponse> getBlacklisterMethod;
    if ((getBlacklisterMethod = QueryGrpc.getBlacklisterMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBlacklisterMethod = QueryGrpc.getBlacklisterMethod) == null) {
          QueryGrpc.getBlacklisterMethod = getBlacklisterMethod =
              io.grpc.MethodDescriptor.<noble.tokenfactory.QueryOuterClass.QueryGetBlacklisterRequest, noble.tokenfactory.QueryOuterClass.QueryGetBlacklisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Blacklister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.QueryOuterClass.QueryGetBlacklisterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.QueryOuterClass.QueryGetBlacklisterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Blacklister"))
              .build();
        }
      }
    }
    return getBlacklisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryGetOwnerRequest,
      noble.tokenfactory.QueryOuterClass.QueryGetOwnerResponse> getOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Owner",
      requestType = noble.tokenfactory.QueryOuterClass.QueryGetOwnerRequest.class,
      responseType = noble.tokenfactory.QueryOuterClass.QueryGetOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryGetOwnerRequest,
      noble.tokenfactory.QueryOuterClass.QueryGetOwnerResponse> getOwnerMethod() {
    io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryGetOwnerRequest, noble.tokenfactory.QueryOuterClass.QueryGetOwnerResponse> getOwnerMethod;
    if ((getOwnerMethod = QueryGrpc.getOwnerMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOwnerMethod = QueryGrpc.getOwnerMethod) == null) {
          QueryGrpc.getOwnerMethod = getOwnerMethod =
              io.grpc.MethodDescriptor.<noble.tokenfactory.QueryOuterClass.QueryGetOwnerRequest, noble.tokenfactory.QueryOuterClass.QueryGetOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Owner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.QueryOuterClass.QueryGetOwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.QueryOuterClass.QueryGetOwnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Owner"))
              .build();
        }
      }
    }
    return getOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryGetMinterControllerRequest,
      noble.tokenfactory.QueryOuterClass.QueryGetMinterControllerResponse> getMinterControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MinterController",
      requestType = noble.tokenfactory.QueryOuterClass.QueryGetMinterControllerRequest.class,
      responseType = noble.tokenfactory.QueryOuterClass.QueryGetMinterControllerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryGetMinterControllerRequest,
      noble.tokenfactory.QueryOuterClass.QueryGetMinterControllerResponse> getMinterControllerMethod() {
    io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryGetMinterControllerRequest, noble.tokenfactory.QueryOuterClass.QueryGetMinterControllerResponse> getMinterControllerMethod;
    if ((getMinterControllerMethod = QueryGrpc.getMinterControllerMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMinterControllerMethod = QueryGrpc.getMinterControllerMethod) == null) {
          QueryGrpc.getMinterControllerMethod = getMinterControllerMethod =
              io.grpc.MethodDescriptor.<noble.tokenfactory.QueryOuterClass.QueryGetMinterControllerRequest, noble.tokenfactory.QueryOuterClass.QueryGetMinterControllerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MinterController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.QueryOuterClass.QueryGetMinterControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.QueryOuterClass.QueryGetMinterControllerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MinterController"))
              .build();
        }
      }
    }
    return getMinterControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryAllMinterControllerRequest,
      noble.tokenfactory.QueryOuterClass.QueryAllMinterControllerResponse> getMinterControllerAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MinterControllerAll",
      requestType = noble.tokenfactory.QueryOuterClass.QueryAllMinterControllerRequest.class,
      responseType = noble.tokenfactory.QueryOuterClass.QueryAllMinterControllerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryAllMinterControllerRequest,
      noble.tokenfactory.QueryOuterClass.QueryAllMinterControllerResponse> getMinterControllerAllMethod() {
    io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryAllMinterControllerRequest, noble.tokenfactory.QueryOuterClass.QueryAllMinterControllerResponse> getMinterControllerAllMethod;
    if ((getMinterControllerAllMethod = QueryGrpc.getMinterControllerAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMinterControllerAllMethod = QueryGrpc.getMinterControllerAllMethod) == null) {
          QueryGrpc.getMinterControllerAllMethod = getMinterControllerAllMethod =
              io.grpc.MethodDescriptor.<noble.tokenfactory.QueryOuterClass.QueryAllMinterControllerRequest, noble.tokenfactory.QueryOuterClass.QueryAllMinterControllerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MinterControllerAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.QueryOuterClass.QueryAllMinterControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.QueryOuterClass.QueryAllMinterControllerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MinterControllerAll"))
              .build();
        }
      }
    }
    return getMinterControllerAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryGetMintingDenomRequest,
      noble.tokenfactory.QueryOuterClass.QueryGetMintingDenomResponse> getMintingDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MintingDenom",
      requestType = noble.tokenfactory.QueryOuterClass.QueryGetMintingDenomRequest.class,
      responseType = noble.tokenfactory.QueryOuterClass.QueryGetMintingDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryGetMintingDenomRequest,
      noble.tokenfactory.QueryOuterClass.QueryGetMintingDenomResponse> getMintingDenomMethod() {
    io.grpc.MethodDescriptor<noble.tokenfactory.QueryOuterClass.QueryGetMintingDenomRequest, noble.tokenfactory.QueryOuterClass.QueryGetMintingDenomResponse> getMintingDenomMethod;
    if ((getMintingDenomMethod = QueryGrpc.getMintingDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMintingDenomMethod = QueryGrpc.getMintingDenomMethod) == null) {
          QueryGrpc.getMintingDenomMethod = getMintingDenomMethod =
              io.grpc.MethodDescriptor.<noble.tokenfactory.QueryOuterClass.QueryGetMintingDenomRequest, noble.tokenfactory.QueryOuterClass.QueryGetMintingDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MintingDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.QueryOuterClass.QueryGetMintingDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.tokenfactory.QueryOuterClass.QueryGetMintingDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MintingDenom"))
              .build();
        }
      }
    }
    return getMintingDenomMethod;
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
    public void params(noble.tokenfactory.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a Blacklisted by index.
     * </pre>
     */
    public void blacklisted(noble.tokenfactory.QueryOuterClass.QueryGetBlacklistedRequest request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryGetBlacklistedResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBlacklistedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Blacklisted items.
     * </pre>
     */
    public void blacklistedAll(noble.tokenfactory.QueryOuterClass.QueryAllBlacklistedRequest request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryAllBlacklistedResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBlacklistedAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a Paused by index.
     * </pre>
     */
    public void paused(noble.tokenfactory.QueryOuterClass.QueryGetPausedRequest request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryGetPausedResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPausedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a MasterMinter by index.
     * </pre>
     */
    public void masterMinter(noble.tokenfactory.QueryOuterClass.QueryGetMasterMinterRequest request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryGetMasterMinterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMasterMinterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a Minters by index.
     * </pre>
     */
    public void minters(noble.tokenfactory.QueryOuterClass.QueryGetMintersRequest request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryGetMintersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMintersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Minters items.
     * </pre>
     */
    public void mintersAll(noble.tokenfactory.QueryOuterClass.QueryAllMintersRequest request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryAllMintersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMintersAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a Pauser by index.
     * </pre>
     */
    public void pauser(noble.tokenfactory.QueryOuterClass.QueryGetPauserRequest request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryGetPauserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPauserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a Blacklister by index.
     * </pre>
     */
    public void blacklister(noble.tokenfactory.QueryOuterClass.QueryGetBlacklisterRequest request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryGetBlacklisterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBlacklisterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a Owner by index.
     * </pre>
     */
    public void owner(noble.tokenfactory.QueryOuterClass.QueryGetOwnerRequest request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryGetOwnerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOwnerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a MinterController by index.
     * </pre>
     */
    public void minterController(noble.tokenfactory.QueryOuterClass.QueryGetMinterControllerRequest request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryGetMinterControllerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMinterControllerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of MinterController items.
     * </pre>
     */
    public void minterControllerAll(noble.tokenfactory.QueryOuterClass.QueryAllMinterControllerRequest request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryAllMinterControllerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMinterControllerAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a MintingDenom by index.
     * </pre>
     */
    public void mintingDenom(noble.tokenfactory.QueryOuterClass.QueryGetMintingDenomRequest request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryGetMintingDenomResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMintingDenomMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.tokenfactory.QueryOuterClass.QueryParamsRequest,
                noble.tokenfactory.QueryOuterClass.QueryParamsResponse>(
                  this, METHODID_PARAMS)))
          .addMethod(
            getBlacklistedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.tokenfactory.QueryOuterClass.QueryGetBlacklistedRequest,
                noble.tokenfactory.QueryOuterClass.QueryGetBlacklistedResponse>(
                  this, METHODID_BLACKLISTED)))
          .addMethod(
            getBlacklistedAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.tokenfactory.QueryOuterClass.QueryAllBlacklistedRequest,
                noble.tokenfactory.QueryOuterClass.QueryAllBlacklistedResponse>(
                  this, METHODID_BLACKLISTED_ALL)))
          .addMethod(
            getPausedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.tokenfactory.QueryOuterClass.QueryGetPausedRequest,
                noble.tokenfactory.QueryOuterClass.QueryGetPausedResponse>(
                  this, METHODID_PAUSED)))
          .addMethod(
            getMasterMinterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.tokenfactory.QueryOuterClass.QueryGetMasterMinterRequest,
                noble.tokenfactory.QueryOuterClass.QueryGetMasterMinterResponse>(
                  this, METHODID_MASTER_MINTER)))
          .addMethod(
            getMintersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.tokenfactory.QueryOuterClass.QueryGetMintersRequest,
                noble.tokenfactory.QueryOuterClass.QueryGetMintersResponse>(
                  this, METHODID_MINTERS)))
          .addMethod(
            getMintersAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.tokenfactory.QueryOuterClass.QueryAllMintersRequest,
                noble.tokenfactory.QueryOuterClass.QueryAllMintersResponse>(
                  this, METHODID_MINTERS_ALL)))
          .addMethod(
            getPauserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.tokenfactory.QueryOuterClass.QueryGetPauserRequest,
                noble.tokenfactory.QueryOuterClass.QueryGetPauserResponse>(
                  this, METHODID_PAUSER)))
          .addMethod(
            getBlacklisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.tokenfactory.QueryOuterClass.QueryGetBlacklisterRequest,
                noble.tokenfactory.QueryOuterClass.QueryGetBlacklisterResponse>(
                  this, METHODID_BLACKLISTER)))
          .addMethod(
            getOwnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.tokenfactory.QueryOuterClass.QueryGetOwnerRequest,
                noble.tokenfactory.QueryOuterClass.QueryGetOwnerResponse>(
                  this, METHODID_OWNER)))
          .addMethod(
            getMinterControllerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.tokenfactory.QueryOuterClass.QueryGetMinterControllerRequest,
                noble.tokenfactory.QueryOuterClass.QueryGetMinterControllerResponse>(
                  this, METHODID_MINTER_CONTROLLER)))
          .addMethod(
            getMinterControllerAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.tokenfactory.QueryOuterClass.QueryAllMinterControllerRequest,
                noble.tokenfactory.QueryOuterClass.QueryAllMinterControllerResponse>(
                  this, METHODID_MINTER_CONTROLLER_ALL)))
          .addMethod(
            getMintingDenomMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.tokenfactory.QueryOuterClass.QueryGetMintingDenomRequest,
                noble.tokenfactory.QueryOuterClass.QueryGetMintingDenomResponse>(
                  this, METHODID_MINTING_DENOM)))
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
    public void params(noble.tokenfactory.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a Blacklisted by index.
     * </pre>
     */
    public void blacklisted(noble.tokenfactory.QueryOuterClass.QueryGetBlacklistedRequest request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryGetBlacklistedResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBlacklistedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Blacklisted items.
     * </pre>
     */
    public void blacklistedAll(noble.tokenfactory.QueryOuterClass.QueryAllBlacklistedRequest request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryAllBlacklistedResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBlacklistedAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a Paused by index.
     * </pre>
     */
    public void paused(noble.tokenfactory.QueryOuterClass.QueryGetPausedRequest request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryGetPausedResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPausedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a MasterMinter by index.
     * </pre>
     */
    public void masterMinter(noble.tokenfactory.QueryOuterClass.QueryGetMasterMinterRequest request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryGetMasterMinterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMasterMinterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a Minters by index.
     * </pre>
     */
    public void minters(noble.tokenfactory.QueryOuterClass.QueryGetMintersRequest request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryGetMintersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMintersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Minters items.
     * </pre>
     */
    public void mintersAll(noble.tokenfactory.QueryOuterClass.QueryAllMintersRequest request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryAllMintersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMintersAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a Pauser by index.
     * </pre>
     */
    public void pauser(noble.tokenfactory.QueryOuterClass.QueryGetPauserRequest request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryGetPauserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPauserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a Blacklister by index.
     * </pre>
     */
    public void blacklister(noble.tokenfactory.QueryOuterClass.QueryGetBlacklisterRequest request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryGetBlacklisterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBlacklisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a Owner by index.
     * </pre>
     */
    public void owner(noble.tokenfactory.QueryOuterClass.QueryGetOwnerRequest request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryGetOwnerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a MinterController by index.
     * </pre>
     */
    public void minterController(noble.tokenfactory.QueryOuterClass.QueryGetMinterControllerRequest request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryGetMinterControllerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMinterControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of MinterController items.
     * </pre>
     */
    public void minterControllerAll(noble.tokenfactory.QueryOuterClass.QueryAllMinterControllerRequest request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryAllMinterControllerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMinterControllerAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a MintingDenom by index.
     * </pre>
     */
    public void mintingDenom(noble.tokenfactory.QueryOuterClass.QueryGetMintingDenomRequest request,
        io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryGetMintingDenomResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMintingDenomMethod(), getCallOptions()), request, responseObserver);
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
    public noble.tokenfactory.QueryOuterClass.QueryParamsResponse params(noble.tokenfactory.QueryOuterClass.QueryParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a Blacklisted by index.
     * </pre>
     */
    public noble.tokenfactory.QueryOuterClass.QueryGetBlacklistedResponse blacklisted(noble.tokenfactory.QueryOuterClass.QueryGetBlacklistedRequest request) {
      return blockingUnaryCall(
          getChannel(), getBlacklistedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of Blacklisted items.
     * </pre>
     */
    public noble.tokenfactory.QueryOuterClass.QueryAllBlacklistedResponse blacklistedAll(noble.tokenfactory.QueryOuterClass.QueryAllBlacklistedRequest request) {
      return blockingUnaryCall(
          getChannel(), getBlacklistedAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a Paused by index.
     * </pre>
     */
    public noble.tokenfactory.QueryOuterClass.QueryGetPausedResponse paused(noble.tokenfactory.QueryOuterClass.QueryGetPausedRequest request) {
      return blockingUnaryCall(
          getChannel(), getPausedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a MasterMinter by index.
     * </pre>
     */
    public noble.tokenfactory.QueryOuterClass.QueryGetMasterMinterResponse masterMinter(noble.tokenfactory.QueryOuterClass.QueryGetMasterMinterRequest request) {
      return blockingUnaryCall(
          getChannel(), getMasterMinterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a Minters by index.
     * </pre>
     */
    public noble.tokenfactory.QueryOuterClass.QueryGetMintersResponse minters(noble.tokenfactory.QueryOuterClass.QueryGetMintersRequest request) {
      return blockingUnaryCall(
          getChannel(), getMintersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of Minters items.
     * </pre>
     */
    public noble.tokenfactory.QueryOuterClass.QueryAllMintersResponse mintersAll(noble.tokenfactory.QueryOuterClass.QueryAllMintersRequest request) {
      return blockingUnaryCall(
          getChannel(), getMintersAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a Pauser by index.
     * </pre>
     */
    public noble.tokenfactory.QueryOuterClass.QueryGetPauserResponse pauser(noble.tokenfactory.QueryOuterClass.QueryGetPauserRequest request) {
      return blockingUnaryCall(
          getChannel(), getPauserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a Blacklister by index.
     * </pre>
     */
    public noble.tokenfactory.QueryOuterClass.QueryGetBlacklisterResponse blacklister(noble.tokenfactory.QueryOuterClass.QueryGetBlacklisterRequest request) {
      return blockingUnaryCall(
          getChannel(), getBlacklisterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a Owner by index.
     * </pre>
     */
    public noble.tokenfactory.QueryOuterClass.QueryGetOwnerResponse owner(noble.tokenfactory.QueryOuterClass.QueryGetOwnerRequest request) {
      return blockingUnaryCall(
          getChannel(), getOwnerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a MinterController by index.
     * </pre>
     */
    public noble.tokenfactory.QueryOuterClass.QueryGetMinterControllerResponse minterController(noble.tokenfactory.QueryOuterClass.QueryGetMinterControllerRequest request) {
      return blockingUnaryCall(
          getChannel(), getMinterControllerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of MinterController items.
     * </pre>
     */
    public noble.tokenfactory.QueryOuterClass.QueryAllMinterControllerResponse minterControllerAll(noble.tokenfactory.QueryOuterClass.QueryAllMinterControllerRequest request) {
      return blockingUnaryCall(
          getChannel(), getMinterControllerAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a MintingDenom by index.
     * </pre>
     */
    public noble.tokenfactory.QueryOuterClass.QueryGetMintingDenomResponse mintingDenom(noble.tokenfactory.QueryOuterClass.QueryGetMintingDenomRequest request) {
      return blockingUnaryCall(
          getChannel(), getMintingDenomMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<noble.tokenfactory.QueryOuterClass.QueryParamsResponse> params(
        noble.tokenfactory.QueryOuterClass.QueryParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a Blacklisted by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.tokenfactory.QueryOuterClass.QueryGetBlacklistedResponse> blacklisted(
        noble.tokenfactory.QueryOuterClass.QueryGetBlacklistedRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBlacklistedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of Blacklisted items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.tokenfactory.QueryOuterClass.QueryAllBlacklistedResponse> blacklistedAll(
        noble.tokenfactory.QueryOuterClass.QueryAllBlacklistedRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBlacklistedAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a Paused by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.tokenfactory.QueryOuterClass.QueryGetPausedResponse> paused(
        noble.tokenfactory.QueryOuterClass.QueryGetPausedRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPausedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a MasterMinter by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.tokenfactory.QueryOuterClass.QueryGetMasterMinterResponse> masterMinter(
        noble.tokenfactory.QueryOuterClass.QueryGetMasterMinterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMasterMinterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a Minters by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.tokenfactory.QueryOuterClass.QueryGetMintersResponse> minters(
        noble.tokenfactory.QueryOuterClass.QueryGetMintersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMintersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of Minters items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.tokenfactory.QueryOuterClass.QueryAllMintersResponse> mintersAll(
        noble.tokenfactory.QueryOuterClass.QueryAllMintersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMintersAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a Pauser by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.tokenfactory.QueryOuterClass.QueryGetPauserResponse> pauser(
        noble.tokenfactory.QueryOuterClass.QueryGetPauserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPauserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a Blacklister by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.tokenfactory.QueryOuterClass.QueryGetBlacklisterResponse> blacklister(
        noble.tokenfactory.QueryOuterClass.QueryGetBlacklisterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBlacklisterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a Owner by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.tokenfactory.QueryOuterClass.QueryGetOwnerResponse> owner(
        noble.tokenfactory.QueryOuterClass.QueryGetOwnerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getOwnerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a MinterController by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.tokenfactory.QueryOuterClass.QueryGetMinterControllerResponse> minterController(
        noble.tokenfactory.QueryOuterClass.QueryGetMinterControllerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMinterControllerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of MinterController items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.tokenfactory.QueryOuterClass.QueryAllMinterControllerResponse> minterControllerAll(
        noble.tokenfactory.QueryOuterClass.QueryAllMinterControllerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMinterControllerAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a MintingDenom by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.tokenfactory.QueryOuterClass.QueryGetMintingDenomResponse> mintingDenom(
        noble.tokenfactory.QueryOuterClass.QueryGetMintingDenomRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMintingDenomMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_BLACKLISTED = 1;
  private static final int METHODID_BLACKLISTED_ALL = 2;
  private static final int METHODID_PAUSED = 3;
  private static final int METHODID_MASTER_MINTER = 4;
  private static final int METHODID_MINTERS = 5;
  private static final int METHODID_MINTERS_ALL = 6;
  private static final int METHODID_PAUSER = 7;
  private static final int METHODID_BLACKLISTER = 8;
  private static final int METHODID_OWNER = 9;
  private static final int METHODID_MINTER_CONTROLLER = 10;
  private static final int METHODID_MINTER_CONTROLLER_ALL = 11;
  private static final int METHODID_MINTING_DENOM = 12;

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
          serviceImpl.params((noble.tokenfactory.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_BLACKLISTED:
          serviceImpl.blacklisted((noble.tokenfactory.QueryOuterClass.QueryGetBlacklistedRequest) request,
              (io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryGetBlacklistedResponse>) responseObserver);
          break;
        case METHODID_BLACKLISTED_ALL:
          serviceImpl.blacklistedAll((noble.tokenfactory.QueryOuterClass.QueryAllBlacklistedRequest) request,
              (io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryAllBlacklistedResponse>) responseObserver);
          break;
        case METHODID_PAUSED:
          serviceImpl.paused((noble.tokenfactory.QueryOuterClass.QueryGetPausedRequest) request,
              (io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryGetPausedResponse>) responseObserver);
          break;
        case METHODID_MASTER_MINTER:
          serviceImpl.masterMinter((noble.tokenfactory.QueryOuterClass.QueryGetMasterMinterRequest) request,
              (io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryGetMasterMinterResponse>) responseObserver);
          break;
        case METHODID_MINTERS:
          serviceImpl.minters((noble.tokenfactory.QueryOuterClass.QueryGetMintersRequest) request,
              (io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryGetMintersResponse>) responseObserver);
          break;
        case METHODID_MINTERS_ALL:
          serviceImpl.mintersAll((noble.tokenfactory.QueryOuterClass.QueryAllMintersRequest) request,
              (io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryAllMintersResponse>) responseObserver);
          break;
        case METHODID_PAUSER:
          serviceImpl.pauser((noble.tokenfactory.QueryOuterClass.QueryGetPauserRequest) request,
              (io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryGetPauserResponse>) responseObserver);
          break;
        case METHODID_BLACKLISTER:
          serviceImpl.blacklister((noble.tokenfactory.QueryOuterClass.QueryGetBlacklisterRequest) request,
              (io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryGetBlacklisterResponse>) responseObserver);
          break;
        case METHODID_OWNER:
          serviceImpl.owner((noble.tokenfactory.QueryOuterClass.QueryGetOwnerRequest) request,
              (io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryGetOwnerResponse>) responseObserver);
          break;
        case METHODID_MINTER_CONTROLLER:
          serviceImpl.minterController((noble.tokenfactory.QueryOuterClass.QueryGetMinterControllerRequest) request,
              (io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryGetMinterControllerResponse>) responseObserver);
          break;
        case METHODID_MINTER_CONTROLLER_ALL:
          serviceImpl.minterControllerAll((noble.tokenfactory.QueryOuterClass.QueryAllMinterControllerRequest) request,
              (io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryAllMinterControllerResponse>) responseObserver);
          break;
        case METHODID_MINTING_DENOM:
          serviceImpl.mintingDenom((noble.tokenfactory.QueryOuterClass.QueryGetMintingDenomRequest) request,
              (io.grpc.stub.StreamObserver<noble.tokenfactory.QueryOuterClass.QueryGetMintingDenomResponse>) responseObserver);
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
      return noble.tokenfactory.QueryOuterClass.getDescriptor();
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
              .addMethod(getBlacklistedMethod())
              .addMethod(getBlacklistedAllMethod())
              .addMethod(getPausedMethod())
              .addMethod(getMasterMinterMethod())
              .addMethod(getMintersMethod())
              .addMethod(getMintersAllMethod())
              .addMethod(getPauserMethod())
              .addMethod(getBlacklisterMethod())
              .addMethod(getOwnerMethod())
              .addMethod(getMinterControllerMethod())
              .addMethod(getMinterControllerAllMethod())
              .addMethod(getMintingDenomMethod())
              .build();
        }
      }
    }
    return result;
  }
}
