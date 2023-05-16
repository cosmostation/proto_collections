package noble.fiattokenfactory;

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
    comments = "Source: noble/fiattokenfactory/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "noble.fiattokenfactory.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryParamsRequest,
      noble.fiattokenfactory.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = noble.fiattokenfactory.QueryOuterClass.QueryParamsRequest.class,
      responseType = noble.fiattokenfactory.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryParamsRequest,
      noble.fiattokenfactory.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryParamsRequest, noble.fiattokenfactory.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<noble.fiattokenfactory.QueryOuterClass.QueryParamsRequest, noble.fiattokenfactory.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklistedRequest,
      noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklistedResponse> getBlacklistedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Blacklisted",
      requestType = noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklistedRequest.class,
      responseType = noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklistedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklistedRequest,
      noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklistedResponse> getBlacklistedMethod() {
    io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklistedRequest, noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklistedResponse> getBlacklistedMethod;
    if ((getBlacklistedMethod = QueryGrpc.getBlacklistedMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBlacklistedMethod = QueryGrpc.getBlacklistedMethod) == null) {
          QueryGrpc.getBlacklistedMethod = getBlacklistedMethod =
              io.grpc.MethodDescriptor.<noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklistedRequest, noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklistedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Blacklisted"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklistedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklistedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Blacklisted"))
              .build();
        }
      }
    }
    return getBlacklistedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryAllBlacklistedRequest,
      noble.fiattokenfactory.QueryOuterClass.QueryAllBlacklistedResponse> getBlacklistedAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BlacklistedAll",
      requestType = noble.fiattokenfactory.QueryOuterClass.QueryAllBlacklistedRequest.class,
      responseType = noble.fiattokenfactory.QueryOuterClass.QueryAllBlacklistedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryAllBlacklistedRequest,
      noble.fiattokenfactory.QueryOuterClass.QueryAllBlacklistedResponse> getBlacklistedAllMethod() {
    io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryAllBlacklistedRequest, noble.fiattokenfactory.QueryOuterClass.QueryAllBlacklistedResponse> getBlacklistedAllMethod;
    if ((getBlacklistedAllMethod = QueryGrpc.getBlacklistedAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBlacklistedAllMethod = QueryGrpc.getBlacklistedAllMethod) == null) {
          QueryGrpc.getBlacklistedAllMethod = getBlacklistedAllMethod =
              io.grpc.MethodDescriptor.<noble.fiattokenfactory.QueryOuterClass.QueryAllBlacklistedRequest, noble.fiattokenfactory.QueryOuterClass.QueryAllBlacklistedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BlacklistedAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.QueryOuterClass.QueryAllBlacklistedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.QueryOuterClass.QueryAllBlacklistedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BlacklistedAll"))
              .build();
        }
      }
    }
    return getBlacklistedAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryGetPausedRequest,
      noble.fiattokenfactory.QueryOuterClass.QueryGetPausedResponse> getPausedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Paused",
      requestType = noble.fiattokenfactory.QueryOuterClass.QueryGetPausedRequest.class,
      responseType = noble.fiattokenfactory.QueryOuterClass.QueryGetPausedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryGetPausedRequest,
      noble.fiattokenfactory.QueryOuterClass.QueryGetPausedResponse> getPausedMethod() {
    io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryGetPausedRequest, noble.fiattokenfactory.QueryOuterClass.QueryGetPausedResponse> getPausedMethod;
    if ((getPausedMethod = QueryGrpc.getPausedMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPausedMethod = QueryGrpc.getPausedMethod) == null) {
          QueryGrpc.getPausedMethod = getPausedMethod =
              io.grpc.MethodDescriptor.<noble.fiattokenfactory.QueryOuterClass.QueryGetPausedRequest, noble.fiattokenfactory.QueryOuterClass.QueryGetPausedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Paused"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.QueryOuterClass.QueryGetPausedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.QueryOuterClass.QueryGetPausedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Paused"))
              .build();
        }
      }
    }
    return getPausedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryGetMasterMinterRequest,
      noble.fiattokenfactory.QueryOuterClass.QueryGetMasterMinterResponse> getMasterMinterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MasterMinter",
      requestType = noble.fiattokenfactory.QueryOuterClass.QueryGetMasterMinterRequest.class,
      responseType = noble.fiattokenfactory.QueryOuterClass.QueryGetMasterMinterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryGetMasterMinterRequest,
      noble.fiattokenfactory.QueryOuterClass.QueryGetMasterMinterResponse> getMasterMinterMethod() {
    io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryGetMasterMinterRequest, noble.fiattokenfactory.QueryOuterClass.QueryGetMasterMinterResponse> getMasterMinterMethod;
    if ((getMasterMinterMethod = QueryGrpc.getMasterMinterMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMasterMinterMethod = QueryGrpc.getMasterMinterMethod) == null) {
          QueryGrpc.getMasterMinterMethod = getMasterMinterMethod =
              io.grpc.MethodDescriptor.<noble.fiattokenfactory.QueryOuterClass.QueryGetMasterMinterRequest, noble.fiattokenfactory.QueryOuterClass.QueryGetMasterMinterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MasterMinter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.QueryOuterClass.QueryGetMasterMinterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.QueryOuterClass.QueryGetMasterMinterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MasterMinter"))
              .build();
        }
      }
    }
    return getMasterMinterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryGetMintersRequest,
      noble.fiattokenfactory.QueryOuterClass.QueryGetMintersResponse> getMintersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Minters",
      requestType = noble.fiattokenfactory.QueryOuterClass.QueryGetMintersRequest.class,
      responseType = noble.fiattokenfactory.QueryOuterClass.QueryGetMintersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryGetMintersRequest,
      noble.fiattokenfactory.QueryOuterClass.QueryGetMintersResponse> getMintersMethod() {
    io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryGetMintersRequest, noble.fiattokenfactory.QueryOuterClass.QueryGetMintersResponse> getMintersMethod;
    if ((getMintersMethod = QueryGrpc.getMintersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMintersMethod = QueryGrpc.getMintersMethod) == null) {
          QueryGrpc.getMintersMethod = getMintersMethod =
              io.grpc.MethodDescriptor.<noble.fiattokenfactory.QueryOuterClass.QueryGetMintersRequest, noble.fiattokenfactory.QueryOuterClass.QueryGetMintersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Minters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.QueryOuterClass.QueryGetMintersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.QueryOuterClass.QueryGetMintersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Minters"))
              .build();
        }
      }
    }
    return getMintersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryAllMintersRequest,
      noble.fiattokenfactory.QueryOuterClass.QueryAllMintersResponse> getMintersAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MintersAll",
      requestType = noble.fiattokenfactory.QueryOuterClass.QueryAllMintersRequest.class,
      responseType = noble.fiattokenfactory.QueryOuterClass.QueryAllMintersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryAllMintersRequest,
      noble.fiattokenfactory.QueryOuterClass.QueryAllMintersResponse> getMintersAllMethod() {
    io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryAllMintersRequest, noble.fiattokenfactory.QueryOuterClass.QueryAllMintersResponse> getMintersAllMethod;
    if ((getMintersAllMethod = QueryGrpc.getMintersAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMintersAllMethod = QueryGrpc.getMintersAllMethod) == null) {
          QueryGrpc.getMintersAllMethod = getMintersAllMethod =
              io.grpc.MethodDescriptor.<noble.fiattokenfactory.QueryOuterClass.QueryAllMintersRequest, noble.fiattokenfactory.QueryOuterClass.QueryAllMintersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MintersAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.QueryOuterClass.QueryAllMintersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.QueryOuterClass.QueryAllMintersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MintersAll"))
              .build();
        }
      }
    }
    return getMintersAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryGetPauserRequest,
      noble.fiattokenfactory.QueryOuterClass.QueryGetPauserResponse> getPauserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pauser",
      requestType = noble.fiattokenfactory.QueryOuterClass.QueryGetPauserRequest.class,
      responseType = noble.fiattokenfactory.QueryOuterClass.QueryGetPauserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryGetPauserRequest,
      noble.fiattokenfactory.QueryOuterClass.QueryGetPauserResponse> getPauserMethod() {
    io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryGetPauserRequest, noble.fiattokenfactory.QueryOuterClass.QueryGetPauserResponse> getPauserMethod;
    if ((getPauserMethod = QueryGrpc.getPauserMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPauserMethod = QueryGrpc.getPauserMethod) == null) {
          QueryGrpc.getPauserMethod = getPauserMethod =
              io.grpc.MethodDescriptor.<noble.fiattokenfactory.QueryOuterClass.QueryGetPauserRequest, noble.fiattokenfactory.QueryOuterClass.QueryGetPauserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pauser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.QueryOuterClass.QueryGetPauserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.QueryOuterClass.QueryGetPauserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Pauser"))
              .build();
        }
      }
    }
    return getPauserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklisterRequest,
      noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklisterResponse> getBlacklisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Blacklister",
      requestType = noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklisterRequest.class,
      responseType = noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklisterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklisterRequest,
      noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklisterResponse> getBlacklisterMethod() {
    io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklisterRequest, noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklisterResponse> getBlacklisterMethod;
    if ((getBlacklisterMethod = QueryGrpc.getBlacklisterMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBlacklisterMethod = QueryGrpc.getBlacklisterMethod) == null) {
          QueryGrpc.getBlacklisterMethod = getBlacklisterMethod =
              io.grpc.MethodDescriptor.<noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklisterRequest, noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Blacklister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklisterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklisterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Blacklister"))
              .build();
        }
      }
    }
    return getBlacklisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryGetOwnerRequest,
      noble.fiattokenfactory.QueryOuterClass.QueryGetOwnerResponse> getOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Owner",
      requestType = noble.fiattokenfactory.QueryOuterClass.QueryGetOwnerRequest.class,
      responseType = noble.fiattokenfactory.QueryOuterClass.QueryGetOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryGetOwnerRequest,
      noble.fiattokenfactory.QueryOuterClass.QueryGetOwnerResponse> getOwnerMethod() {
    io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryGetOwnerRequest, noble.fiattokenfactory.QueryOuterClass.QueryGetOwnerResponse> getOwnerMethod;
    if ((getOwnerMethod = QueryGrpc.getOwnerMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOwnerMethod = QueryGrpc.getOwnerMethod) == null) {
          QueryGrpc.getOwnerMethod = getOwnerMethod =
              io.grpc.MethodDescriptor.<noble.fiattokenfactory.QueryOuterClass.QueryGetOwnerRequest, noble.fiattokenfactory.QueryOuterClass.QueryGetOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Owner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.QueryOuterClass.QueryGetOwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.QueryOuterClass.QueryGetOwnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Owner"))
              .build();
        }
      }
    }
    return getOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryGetMinterControllerRequest,
      noble.fiattokenfactory.QueryOuterClass.QueryGetMinterControllerResponse> getMinterControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MinterController",
      requestType = noble.fiattokenfactory.QueryOuterClass.QueryGetMinterControllerRequest.class,
      responseType = noble.fiattokenfactory.QueryOuterClass.QueryGetMinterControllerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryGetMinterControllerRequest,
      noble.fiattokenfactory.QueryOuterClass.QueryGetMinterControllerResponse> getMinterControllerMethod() {
    io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryGetMinterControllerRequest, noble.fiattokenfactory.QueryOuterClass.QueryGetMinterControllerResponse> getMinterControllerMethod;
    if ((getMinterControllerMethod = QueryGrpc.getMinterControllerMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMinterControllerMethod = QueryGrpc.getMinterControllerMethod) == null) {
          QueryGrpc.getMinterControllerMethod = getMinterControllerMethod =
              io.grpc.MethodDescriptor.<noble.fiattokenfactory.QueryOuterClass.QueryGetMinterControllerRequest, noble.fiattokenfactory.QueryOuterClass.QueryGetMinterControllerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MinterController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.QueryOuterClass.QueryGetMinterControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.QueryOuterClass.QueryGetMinterControllerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MinterController"))
              .build();
        }
      }
    }
    return getMinterControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryAllMinterControllerRequest,
      noble.fiattokenfactory.QueryOuterClass.QueryAllMinterControllerResponse> getMinterControllerAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MinterControllerAll",
      requestType = noble.fiattokenfactory.QueryOuterClass.QueryAllMinterControllerRequest.class,
      responseType = noble.fiattokenfactory.QueryOuterClass.QueryAllMinterControllerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryAllMinterControllerRequest,
      noble.fiattokenfactory.QueryOuterClass.QueryAllMinterControllerResponse> getMinterControllerAllMethod() {
    io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryAllMinterControllerRequest, noble.fiattokenfactory.QueryOuterClass.QueryAllMinterControllerResponse> getMinterControllerAllMethod;
    if ((getMinterControllerAllMethod = QueryGrpc.getMinterControllerAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMinterControllerAllMethod = QueryGrpc.getMinterControllerAllMethod) == null) {
          QueryGrpc.getMinterControllerAllMethod = getMinterControllerAllMethod =
              io.grpc.MethodDescriptor.<noble.fiattokenfactory.QueryOuterClass.QueryAllMinterControllerRequest, noble.fiattokenfactory.QueryOuterClass.QueryAllMinterControllerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MinterControllerAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.QueryOuterClass.QueryAllMinterControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.QueryOuterClass.QueryAllMinterControllerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MinterControllerAll"))
              .build();
        }
      }
    }
    return getMinterControllerAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryGetMintingDenomRequest,
      noble.fiattokenfactory.QueryOuterClass.QueryGetMintingDenomResponse> getMintingDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MintingDenom",
      requestType = noble.fiattokenfactory.QueryOuterClass.QueryGetMintingDenomRequest.class,
      responseType = noble.fiattokenfactory.QueryOuterClass.QueryGetMintingDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryGetMintingDenomRequest,
      noble.fiattokenfactory.QueryOuterClass.QueryGetMintingDenomResponse> getMintingDenomMethod() {
    io.grpc.MethodDescriptor<noble.fiattokenfactory.QueryOuterClass.QueryGetMintingDenomRequest, noble.fiattokenfactory.QueryOuterClass.QueryGetMintingDenomResponse> getMintingDenomMethod;
    if ((getMintingDenomMethod = QueryGrpc.getMintingDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMintingDenomMethod = QueryGrpc.getMintingDenomMethod) == null) {
          QueryGrpc.getMintingDenomMethod = getMintingDenomMethod =
              io.grpc.MethodDescriptor.<noble.fiattokenfactory.QueryOuterClass.QueryGetMintingDenomRequest, noble.fiattokenfactory.QueryOuterClass.QueryGetMintingDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MintingDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.QueryOuterClass.QueryGetMintingDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  noble.fiattokenfactory.QueryOuterClass.QueryGetMintingDenomResponse.getDefaultInstance()))
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
    public void params(noble.fiattokenfactory.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a Blacklisted by index.
     * </pre>
     */
    public void blacklisted(noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklistedRequest request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklistedResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBlacklistedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Blacklisted items.
     * </pre>
     */
    public void blacklistedAll(noble.fiattokenfactory.QueryOuterClass.QueryAllBlacklistedRequest request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryAllBlacklistedResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBlacklistedAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a Paused by index.
     * </pre>
     */
    public void paused(noble.fiattokenfactory.QueryOuterClass.QueryGetPausedRequest request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryGetPausedResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPausedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a MasterMinter by index.
     * </pre>
     */
    public void masterMinter(noble.fiattokenfactory.QueryOuterClass.QueryGetMasterMinterRequest request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryGetMasterMinterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMasterMinterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a Minters by index.
     * </pre>
     */
    public void minters(noble.fiattokenfactory.QueryOuterClass.QueryGetMintersRequest request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryGetMintersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMintersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Minters items.
     * </pre>
     */
    public void mintersAll(noble.fiattokenfactory.QueryOuterClass.QueryAllMintersRequest request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryAllMintersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMintersAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a Pauser by index.
     * </pre>
     */
    public void pauser(noble.fiattokenfactory.QueryOuterClass.QueryGetPauserRequest request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryGetPauserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPauserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a Blacklister by index.
     * </pre>
     */
    public void blacklister(noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklisterRequest request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklisterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBlacklisterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a Owner by index.
     * </pre>
     */
    public void owner(noble.fiattokenfactory.QueryOuterClass.QueryGetOwnerRequest request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryGetOwnerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOwnerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a MinterController by index.
     * </pre>
     */
    public void minterController(noble.fiattokenfactory.QueryOuterClass.QueryGetMinterControllerRequest request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryGetMinterControllerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMinterControllerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of MinterController items.
     * </pre>
     */
    public void minterControllerAll(noble.fiattokenfactory.QueryOuterClass.QueryAllMinterControllerRequest request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryAllMinterControllerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMinterControllerAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a MintingDenom by index.
     * </pre>
     */
    public void mintingDenom(noble.fiattokenfactory.QueryOuterClass.QueryGetMintingDenomRequest request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryGetMintingDenomResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMintingDenomMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.fiattokenfactory.QueryOuterClass.QueryParamsRequest,
                noble.fiattokenfactory.QueryOuterClass.QueryParamsResponse>(
                  this, METHODID_PARAMS)))
          .addMethod(
            getBlacklistedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklistedRequest,
                noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklistedResponse>(
                  this, METHODID_BLACKLISTED)))
          .addMethod(
            getBlacklistedAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.fiattokenfactory.QueryOuterClass.QueryAllBlacklistedRequest,
                noble.fiattokenfactory.QueryOuterClass.QueryAllBlacklistedResponse>(
                  this, METHODID_BLACKLISTED_ALL)))
          .addMethod(
            getPausedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.fiattokenfactory.QueryOuterClass.QueryGetPausedRequest,
                noble.fiattokenfactory.QueryOuterClass.QueryGetPausedResponse>(
                  this, METHODID_PAUSED)))
          .addMethod(
            getMasterMinterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.fiattokenfactory.QueryOuterClass.QueryGetMasterMinterRequest,
                noble.fiattokenfactory.QueryOuterClass.QueryGetMasterMinterResponse>(
                  this, METHODID_MASTER_MINTER)))
          .addMethod(
            getMintersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.fiattokenfactory.QueryOuterClass.QueryGetMintersRequest,
                noble.fiattokenfactory.QueryOuterClass.QueryGetMintersResponse>(
                  this, METHODID_MINTERS)))
          .addMethod(
            getMintersAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.fiattokenfactory.QueryOuterClass.QueryAllMintersRequest,
                noble.fiattokenfactory.QueryOuterClass.QueryAllMintersResponse>(
                  this, METHODID_MINTERS_ALL)))
          .addMethod(
            getPauserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.fiattokenfactory.QueryOuterClass.QueryGetPauserRequest,
                noble.fiattokenfactory.QueryOuterClass.QueryGetPauserResponse>(
                  this, METHODID_PAUSER)))
          .addMethod(
            getBlacklisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklisterRequest,
                noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklisterResponse>(
                  this, METHODID_BLACKLISTER)))
          .addMethod(
            getOwnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.fiattokenfactory.QueryOuterClass.QueryGetOwnerRequest,
                noble.fiattokenfactory.QueryOuterClass.QueryGetOwnerResponse>(
                  this, METHODID_OWNER)))
          .addMethod(
            getMinterControllerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.fiattokenfactory.QueryOuterClass.QueryGetMinterControllerRequest,
                noble.fiattokenfactory.QueryOuterClass.QueryGetMinterControllerResponse>(
                  this, METHODID_MINTER_CONTROLLER)))
          .addMethod(
            getMinterControllerAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.fiattokenfactory.QueryOuterClass.QueryAllMinterControllerRequest,
                noble.fiattokenfactory.QueryOuterClass.QueryAllMinterControllerResponse>(
                  this, METHODID_MINTER_CONTROLLER_ALL)))
          .addMethod(
            getMintingDenomMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                noble.fiattokenfactory.QueryOuterClass.QueryGetMintingDenomRequest,
                noble.fiattokenfactory.QueryOuterClass.QueryGetMintingDenomResponse>(
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
    public void params(noble.fiattokenfactory.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a Blacklisted by index.
     * </pre>
     */
    public void blacklisted(noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklistedRequest request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklistedResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBlacklistedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Blacklisted items.
     * </pre>
     */
    public void blacklistedAll(noble.fiattokenfactory.QueryOuterClass.QueryAllBlacklistedRequest request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryAllBlacklistedResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBlacklistedAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a Paused by index.
     * </pre>
     */
    public void paused(noble.fiattokenfactory.QueryOuterClass.QueryGetPausedRequest request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryGetPausedResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPausedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a MasterMinter by index.
     * </pre>
     */
    public void masterMinter(noble.fiattokenfactory.QueryOuterClass.QueryGetMasterMinterRequest request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryGetMasterMinterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMasterMinterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a Minters by index.
     * </pre>
     */
    public void minters(noble.fiattokenfactory.QueryOuterClass.QueryGetMintersRequest request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryGetMintersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMintersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Minters items.
     * </pre>
     */
    public void mintersAll(noble.fiattokenfactory.QueryOuterClass.QueryAllMintersRequest request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryAllMintersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMintersAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a Pauser by index.
     * </pre>
     */
    public void pauser(noble.fiattokenfactory.QueryOuterClass.QueryGetPauserRequest request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryGetPauserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPauserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a Blacklister by index.
     * </pre>
     */
    public void blacklister(noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklisterRequest request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklisterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBlacklisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a Owner by index.
     * </pre>
     */
    public void owner(noble.fiattokenfactory.QueryOuterClass.QueryGetOwnerRequest request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryGetOwnerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a MinterController by index.
     * </pre>
     */
    public void minterController(noble.fiattokenfactory.QueryOuterClass.QueryGetMinterControllerRequest request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryGetMinterControllerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMinterControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of MinterController items.
     * </pre>
     */
    public void minterControllerAll(noble.fiattokenfactory.QueryOuterClass.QueryAllMinterControllerRequest request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryAllMinterControllerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMinterControllerAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a MintingDenom by index.
     * </pre>
     */
    public void mintingDenom(noble.fiattokenfactory.QueryOuterClass.QueryGetMintingDenomRequest request,
        io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryGetMintingDenomResponse> responseObserver) {
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
    public noble.fiattokenfactory.QueryOuterClass.QueryParamsResponse params(noble.fiattokenfactory.QueryOuterClass.QueryParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a Blacklisted by index.
     * </pre>
     */
    public noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklistedResponse blacklisted(noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklistedRequest request) {
      return blockingUnaryCall(
          getChannel(), getBlacklistedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of Blacklisted items.
     * </pre>
     */
    public noble.fiattokenfactory.QueryOuterClass.QueryAllBlacklistedResponse blacklistedAll(noble.fiattokenfactory.QueryOuterClass.QueryAllBlacklistedRequest request) {
      return blockingUnaryCall(
          getChannel(), getBlacklistedAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a Paused by index.
     * </pre>
     */
    public noble.fiattokenfactory.QueryOuterClass.QueryGetPausedResponse paused(noble.fiattokenfactory.QueryOuterClass.QueryGetPausedRequest request) {
      return blockingUnaryCall(
          getChannel(), getPausedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a MasterMinter by index.
     * </pre>
     */
    public noble.fiattokenfactory.QueryOuterClass.QueryGetMasterMinterResponse masterMinter(noble.fiattokenfactory.QueryOuterClass.QueryGetMasterMinterRequest request) {
      return blockingUnaryCall(
          getChannel(), getMasterMinterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a Minters by index.
     * </pre>
     */
    public noble.fiattokenfactory.QueryOuterClass.QueryGetMintersResponse minters(noble.fiattokenfactory.QueryOuterClass.QueryGetMintersRequest request) {
      return blockingUnaryCall(
          getChannel(), getMintersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of Minters items.
     * </pre>
     */
    public noble.fiattokenfactory.QueryOuterClass.QueryAllMintersResponse mintersAll(noble.fiattokenfactory.QueryOuterClass.QueryAllMintersRequest request) {
      return blockingUnaryCall(
          getChannel(), getMintersAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a Pauser by index.
     * </pre>
     */
    public noble.fiattokenfactory.QueryOuterClass.QueryGetPauserResponse pauser(noble.fiattokenfactory.QueryOuterClass.QueryGetPauserRequest request) {
      return blockingUnaryCall(
          getChannel(), getPauserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a Blacklister by index.
     * </pre>
     */
    public noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklisterResponse blacklister(noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklisterRequest request) {
      return blockingUnaryCall(
          getChannel(), getBlacklisterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a Owner by index.
     * </pre>
     */
    public noble.fiattokenfactory.QueryOuterClass.QueryGetOwnerResponse owner(noble.fiattokenfactory.QueryOuterClass.QueryGetOwnerRequest request) {
      return blockingUnaryCall(
          getChannel(), getOwnerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a MinterController by index.
     * </pre>
     */
    public noble.fiattokenfactory.QueryOuterClass.QueryGetMinterControllerResponse minterController(noble.fiattokenfactory.QueryOuterClass.QueryGetMinterControllerRequest request) {
      return blockingUnaryCall(
          getChannel(), getMinterControllerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of MinterController items.
     * </pre>
     */
    public noble.fiattokenfactory.QueryOuterClass.QueryAllMinterControllerResponse minterControllerAll(noble.fiattokenfactory.QueryOuterClass.QueryAllMinterControllerRequest request) {
      return blockingUnaryCall(
          getChannel(), getMinterControllerAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a MintingDenom by index.
     * </pre>
     */
    public noble.fiattokenfactory.QueryOuterClass.QueryGetMintingDenomResponse mintingDenom(noble.fiattokenfactory.QueryOuterClass.QueryGetMintingDenomRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<noble.fiattokenfactory.QueryOuterClass.QueryParamsResponse> params(
        noble.fiattokenfactory.QueryOuterClass.QueryParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a Blacklisted by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklistedResponse> blacklisted(
        noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklistedRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBlacklistedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of Blacklisted items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.fiattokenfactory.QueryOuterClass.QueryAllBlacklistedResponse> blacklistedAll(
        noble.fiattokenfactory.QueryOuterClass.QueryAllBlacklistedRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBlacklistedAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a Paused by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.fiattokenfactory.QueryOuterClass.QueryGetPausedResponse> paused(
        noble.fiattokenfactory.QueryOuterClass.QueryGetPausedRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPausedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a MasterMinter by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.fiattokenfactory.QueryOuterClass.QueryGetMasterMinterResponse> masterMinter(
        noble.fiattokenfactory.QueryOuterClass.QueryGetMasterMinterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMasterMinterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a Minters by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.fiattokenfactory.QueryOuterClass.QueryGetMintersResponse> minters(
        noble.fiattokenfactory.QueryOuterClass.QueryGetMintersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMintersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of Minters items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.fiattokenfactory.QueryOuterClass.QueryAllMintersResponse> mintersAll(
        noble.fiattokenfactory.QueryOuterClass.QueryAllMintersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMintersAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a Pauser by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.fiattokenfactory.QueryOuterClass.QueryGetPauserResponse> pauser(
        noble.fiattokenfactory.QueryOuterClass.QueryGetPauserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPauserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a Blacklister by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklisterResponse> blacklister(
        noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklisterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBlacklisterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a Owner by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.fiattokenfactory.QueryOuterClass.QueryGetOwnerResponse> owner(
        noble.fiattokenfactory.QueryOuterClass.QueryGetOwnerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getOwnerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a MinterController by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.fiattokenfactory.QueryOuterClass.QueryGetMinterControllerResponse> minterController(
        noble.fiattokenfactory.QueryOuterClass.QueryGetMinterControllerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMinterControllerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of MinterController items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.fiattokenfactory.QueryOuterClass.QueryAllMinterControllerResponse> minterControllerAll(
        noble.fiattokenfactory.QueryOuterClass.QueryAllMinterControllerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMinterControllerAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a MintingDenom by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<noble.fiattokenfactory.QueryOuterClass.QueryGetMintingDenomResponse> mintingDenom(
        noble.fiattokenfactory.QueryOuterClass.QueryGetMintingDenomRequest request) {
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
          serviceImpl.params((noble.fiattokenfactory.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_BLACKLISTED:
          serviceImpl.blacklisted((noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklistedRequest) request,
              (io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklistedResponse>) responseObserver);
          break;
        case METHODID_BLACKLISTED_ALL:
          serviceImpl.blacklistedAll((noble.fiattokenfactory.QueryOuterClass.QueryAllBlacklistedRequest) request,
              (io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryAllBlacklistedResponse>) responseObserver);
          break;
        case METHODID_PAUSED:
          serviceImpl.paused((noble.fiattokenfactory.QueryOuterClass.QueryGetPausedRequest) request,
              (io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryGetPausedResponse>) responseObserver);
          break;
        case METHODID_MASTER_MINTER:
          serviceImpl.masterMinter((noble.fiattokenfactory.QueryOuterClass.QueryGetMasterMinterRequest) request,
              (io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryGetMasterMinterResponse>) responseObserver);
          break;
        case METHODID_MINTERS:
          serviceImpl.minters((noble.fiattokenfactory.QueryOuterClass.QueryGetMintersRequest) request,
              (io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryGetMintersResponse>) responseObserver);
          break;
        case METHODID_MINTERS_ALL:
          serviceImpl.mintersAll((noble.fiattokenfactory.QueryOuterClass.QueryAllMintersRequest) request,
              (io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryAllMintersResponse>) responseObserver);
          break;
        case METHODID_PAUSER:
          serviceImpl.pauser((noble.fiattokenfactory.QueryOuterClass.QueryGetPauserRequest) request,
              (io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryGetPauserResponse>) responseObserver);
          break;
        case METHODID_BLACKLISTER:
          serviceImpl.blacklister((noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklisterRequest) request,
              (io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryGetBlacklisterResponse>) responseObserver);
          break;
        case METHODID_OWNER:
          serviceImpl.owner((noble.fiattokenfactory.QueryOuterClass.QueryGetOwnerRequest) request,
              (io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryGetOwnerResponse>) responseObserver);
          break;
        case METHODID_MINTER_CONTROLLER:
          serviceImpl.minterController((noble.fiattokenfactory.QueryOuterClass.QueryGetMinterControllerRequest) request,
              (io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryGetMinterControllerResponse>) responseObserver);
          break;
        case METHODID_MINTER_CONTROLLER_ALL:
          serviceImpl.minterControllerAll((noble.fiattokenfactory.QueryOuterClass.QueryAllMinterControllerRequest) request,
              (io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryAllMinterControllerResponse>) responseObserver);
          break;
        case METHODID_MINTING_DENOM:
          serviceImpl.mintingDenom((noble.fiattokenfactory.QueryOuterClass.QueryGetMintingDenomRequest) request,
              (io.grpc.stub.StreamObserver<noble.fiattokenfactory.QueryOuterClass.QueryGetMintingDenomResponse>) responseObserver);
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
      return noble.fiattokenfactory.QueryOuterClass.getDescriptor();
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
