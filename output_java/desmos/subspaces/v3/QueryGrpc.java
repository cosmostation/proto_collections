package desmos.subspaces.v3;

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
 * Query defines the gRPC querier service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: desmos/subspaces/v3/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "desmos.subspaces.v3.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<desmos.subspaces.v3.QueryOuterClass.QuerySubspacesRequest,
      desmos.subspaces.v3.QueryOuterClass.QuerySubspacesResponse> getSubspacesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subspaces",
      requestType = desmos.subspaces.v3.QueryOuterClass.QuerySubspacesRequest.class,
      responseType = desmos.subspaces.v3.QueryOuterClass.QuerySubspacesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.subspaces.v3.QueryOuterClass.QuerySubspacesRequest,
      desmos.subspaces.v3.QueryOuterClass.QuerySubspacesResponse> getSubspacesMethod() {
    io.grpc.MethodDescriptor<desmos.subspaces.v3.QueryOuterClass.QuerySubspacesRequest, desmos.subspaces.v3.QueryOuterClass.QuerySubspacesResponse> getSubspacesMethod;
    if ((getSubspacesMethod = QueryGrpc.getSubspacesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSubspacesMethod = QueryGrpc.getSubspacesMethod) == null) {
          QueryGrpc.getSubspacesMethod = getSubspacesMethod =
              io.grpc.MethodDescriptor.<desmos.subspaces.v3.QueryOuterClass.QuerySubspacesRequest, desmos.subspaces.v3.QueryOuterClass.QuerySubspacesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Subspaces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.QueryOuterClass.QuerySubspacesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.QueryOuterClass.QuerySubspacesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Subspaces"))
              .build();
        }
      }
    }
    return getSubspacesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.subspaces.v3.QueryOuterClass.QuerySubspaceRequest,
      desmos.subspaces.v3.QueryOuterClass.QuerySubspaceResponse> getSubspaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subspace",
      requestType = desmos.subspaces.v3.QueryOuterClass.QuerySubspaceRequest.class,
      responseType = desmos.subspaces.v3.QueryOuterClass.QuerySubspaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.subspaces.v3.QueryOuterClass.QuerySubspaceRequest,
      desmos.subspaces.v3.QueryOuterClass.QuerySubspaceResponse> getSubspaceMethod() {
    io.grpc.MethodDescriptor<desmos.subspaces.v3.QueryOuterClass.QuerySubspaceRequest, desmos.subspaces.v3.QueryOuterClass.QuerySubspaceResponse> getSubspaceMethod;
    if ((getSubspaceMethod = QueryGrpc.getSubspaceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSubspaceMethod = QueryGrpc.getSubspaceMethod) == null) {
          QueryGrpc.getSubspaceMethod = getSubspaceMethod =
              io.grpc.MethodDescriptor.<desmos.subspaces.v3.QueryOuterClass.QuerySubspaceRequest, desmos.subspaces.v3.QueryOuterClass.QuerySubspaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Subspace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.QueryOuterClass.QuerySubspaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.QueryOuterClass.QuerySubspaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Subspace"))
              .build();
        }
      }
    }
    return getSubspaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.subspaces.v3.QueryOuterClass.QuerySectionsRequest,
      desmos.subspaces.v3.QueryOuterClass.QuerySectionsResponse> getSectionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Sections",
      requestType = desmos.subspaces.v3.QueryOuterClass.QuerySectionsRequest.class,
      responseType = desmos.subspaces.v3.QueryOuterClass.QuerySectionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.subspaces.v3.QueryOuterClass.QuerySectionsRequest,
      desmos.subspaces.v3.QueryOuterClass.QuerySectionsResponse> getSectionsMethod() {
    io.grpc.MethodDescriptor<desmos.subspaces.v3.QueryOuterClass.QuerySectionsRequest, desmos.subspaces.v3.QueryOuterClass.QuerySectionsResponse> getSectionsMethod;
    if ((getSectionsMethod = QueryGrpc.getSectionsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSectionsMethod = QueryGrpc.getSectionsMethod) == null) {
          QueryGrpc.getSectionsMethod = getSectionsMethod =
              io.grpc.MethodDescriptor.<desmos.subspaces.v3.QueryOuterClass.QuerySectionsRequest, desmos.subspaces.v3.QueryOuterClass.QuerySectionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Sections"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.QueryOuterClass.QuerySectionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.QueryOuterClass.QuerySectionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Sections"))
              .build();
        }
      }
    }
    return getSectionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.subspaces.v3.QueryOuterClass.QuerySectionRequest,
      desmos.subspaces.v3.QueryOuterClass.QuerySectionResponse> getSectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Section",
      requestType = desmos.subspaces.v3.QueryOuterClass.QuerySectionRequest.class,
      responseType = desmos.subspaces.v3.QueryOuterClass.QuerySectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.subspaces.v3.QueryOuterClass.QuerySectionRequest,
      desmos.subspaces.v3.QueryOuterClass.QuerySectionResponse> getSectionMethod() {
    io.grpc.MethodDescriptor<desmos.subspaces.v3.QueryOuterClass.QuerySectionRequest, desmos.subspaces.v3.QueryOuterClass.QuerySectionResponse> getSectionMethod;
    if ((getSectionMethod = QueryGrpc.getSectionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSectionMethod = QueryGrpc.getSectionMethod) == null) {
          QueryGrpc.getSectionMethod = getSectionMethod =
              io.grpc.MethodDescriptor.<desmos.subspaces.v3.QueryOuterClass.QuerySectionRequest, desmos.subspaces.v3.QueryOuterClass.QuerySectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Section"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.QueryOuterClass.QuerySectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.QueryOuterClass.QuerySectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Section"))
              .build();
        }
      }
    }
    return getSectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.subspaces.v3.QueryOuterClass.QueryUserGroupsRequest,
      desmos.subspaces.v3.QueryOuterClass.QueryUserGroupsResponse> getUserGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserGroups",
      requestType = desmos.subspaces.v3.QueryOuterClass.QueryUserGroupsRequest.class,
      responseType = desmos.subspaces.v3.QueryOuterClass.QueryUserGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.subspaces.v3.QueryOuterClass.QueryUserGroupsRequest,
      desmos.subspaces.v3.QueryOuterClass.QueryUserGroupsResponse> getUserGroupsMethod() {
    io.grpc.MethodDescriptor<desmos.subspaces.v3.QueryOuterClass.QueryUserGroupsRequest, desmos.subspaces.v3.QueryOuterClass.QueryUserGroupsResponse> getUserGroupsMethod;
    if ((getUserGroupsMethod = QueryGrpc.getUserGroupsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUserGroupsMethod = QueryGrpc.getUserGroupsMethod) == null) {
          QueryGrpc.getUserGroupsMethod = getUserGroupsMethod =
              io.grpc.MethodDescriptor.<desmos.subspaces.v3.QueryOuterClass.QueryUserGroupsRequest, desmos.subspaces.v3.QueryOuterClass.QueryUserGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.QueryOuterClass.QueryUserGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.QueryOuterClass.QueryUserGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UserGroups"))
              .build();
        }
      }
    }
    return getUserGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.subspaces.v3.QueryOuterClass.QueryUserGroupRequest,
      desmos.subspaces.v3.QueryOuterClass.QueryUserGroupResponse> getUserGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserGroup",
      requestType = desmos.subspaces.v3.QueryOuterClass.QueryUserGroupRequest.class,
      responseType = desmos.subspaces.v3.QueryOuterClass.QueryUserGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.subspaces.v3.QueryOuterClass.QueryUserGroupRequest,
      desmos.subspaces.v3.QueryOuterClass.QueryUserGroupResponse> getUserGroupMethod() {
    io.grpc.MethodDescriptor<desmos.subspaces.v3.QueryOuterClass.QueryUserGroupRequest, desmos.subspaces.v3.QueryOuterClass.QueryUserGroupResponse> getUserGroupMethod;
    if ((getUserGroupMethod = QueryGrpc.getUserGroupMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUserGroupMethod = QueryGrpc.getUserGroupMethod) == null) {
          QueryGrpc.getUserGroupMethod = getUserGroupMethod =
              io.grpc.MethodDescriptor.<desmos.subspaces.v3.QueryOuterClass.QueryUserGroupRequest, desmos.subspaces.v3.QueryOuterClass.QueryUserGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.QueryOuterClass.QueryUserGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.QueryOuterClass.QueryUserGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UserGroup"))
              .build();
        }
      }
    }
    return getUserGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.subspaces.v3.QueryOuterClass.QueryUserGroupMembersRequest,
      desmos.subspaces.v3.QueryOuterClass.QueryUserGroupMembersResponse> getUserGroupMembersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserGroupMembers",
      requestType = desmos.subspaces.v3.QueryOuterClass.QueryUserGroupMembersRequest.class,
      responseType = desmos.subspaces.v3.QueryOuterClass.QueryUserGroupMembersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.subspaces.v3.QueryOuterClass.QueryUserGroupMembersRequest,
      desmos.subspaces.v3.QueryOuterClass.QueryUserGroupMembersResponse> getUserGroupMembersMethod() {
    io.grpc.MethodDescriptor<desmos.subspaces.v3.QueryOuterClass.QueryUserGroupMembersRequest, desmos.subspaces.v3.QueryOuterClass.QueryUserGroupMembersResponse> getUserGroupMembersMethod;
    if ((getUserGroupMembersMethod = QueryGrpc.getUserGroupMembersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUserGroupMembersMethod = QueryGrpc.getUserGroupMembersMethod) == null) {
          QueryGrpc.getUserGroupMembersMethod = getUserGroupMembersMethod =
              io.grpc.MethodDescriptor.<desmos.subspaces.v3.QueryOuterClass.QueryUserGroupMembersRequest, desmos.subspaces.v3.QueryOuterClass.QueryUserGroupMembersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserGroupMembers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.QueryOuterClass.QueryUserGroupMembersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.QueryOuterClass.QueryUserGroupMembersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UserGroupMembers"))
              .build();
        }
      }
    }
    return getUserGroupMembersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.subspaces.v3.QueryOuterClass.QueryUserPermissionsRequest,
      desmos.subspaces.v3.QueryOuterClass.QueryUserPermissionsResponse> getUserPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserPermissions",
      requestType = desmos.subspaces.v3.QueryOuterClass.QueryUserPermissionsRequest.class,
      responseType = desmos.subspaces.v3.QueryOuterClass.QueryUserPermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.subspaces.v3.QueryOuterClass.QueryUserPermissionsRequest,
      desmos.subspaces.v3.QueryOuterClass.QueryUserPermissionsResponse> getUserPermissionsMethod() {
    io.grpc.MethodDescriptor<desmos.subspaces.v3.QueryOuterClass.QueryUserPermissionsRequest, desmos.subspaces.v3.QueryOuterClass.QueryUserPermissionsResponse> getUserPermissionsMethod;
    if ((getUserPermissionsMethod = QueryGrpc.getUserPermissionsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUserPermissionsMethod = QueryGrpc.getUserPermissionsMethod) == null) {
          QueryGrpc.getUserPermissionsMethod = getUserPermissionsMethod =
              io.grpc.MethodDescriptor.<desmos.subspaces.v3.QueryOuterClass.QueryUserPermissionsRequest, desmos.subspaces.v3.QueryOuterClass.QueryUserPermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.QueryOuterClass.QueryUserPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.QueryOuterClass.QueryUserPermissionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UserPermissions"))
              .build();
        }
      }
    }
    return getUserPermissionsMethod;
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
   * Query defines the gRPC querier service
   * </pre>
   */
  public static abstract class QueryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Subspaces queries all the subspaces inside Desmos
     * </pre>
     */
    public void subspaces(desmos.subspaces.v3.QueryOuterClass.QuerySubspacesRequest request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.QueryOuterClass.QuerySubspacesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSubspacesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subspace queries all the information about the subspace with the given id
     * </pre>
     */
    public void subspace(desmos.subspaces.v3.QueryOuterClass.QuerySubspaceRequest request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.QueryOuterClass.QuerySubspaceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSubspaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sections allows to query for the sections of a specific subspace
     * </pre>
     */
    public void sections(desmos.subspaces.v3.QueryOuterClass.QuerySectionsRequest request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.QueryOuterClass.QuerySectionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSectionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Section queries all the information about the section with the given id
     * </pre>
     */
    public void section(desmos.subspaces.v3.QueryOuterClass.QuerySectionRequest request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.QueryOuterClass.QuerySectionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * UserGroups queries all the groups that are present inside the subspace with
     * the given id
     * </pre>
     */
    public void userGroups(desmos.subspaces.v3.QueryOuterClass.QueryUserGroupsRequest request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.QueryOuterClass.QueryUserGroupsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UserGroup queries the user group having the given id inside the specific
     * subspace
     * </pre>
     */
    public void userGroup(desmos.subspaces.v3.QueryOuterClass.QueryUserGroupRequest request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.QueryOuterClass.QueryUserGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * UserGroupMembers queries all the members of a given user group
     * </pre>
     */
    public void userGroupMembers(desmos.subspaces.v3.QueryOuterClass.QueryUserGroupMembersRequest request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.QueryOuterClass.QueryUserGroupMembersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserGroupMembersMethod(), responseObserver);
    }

    /**
     * <pre>
     * UserPermissions queries the permissions for the given user
     * </pre>
     */
    public void userPermissions(desmos.subspaces.v3.QueryOuterClass.QueryUserPermissionsRequest request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.QueryOuterClass.QueryUserPermissionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserPermissionsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSubspacesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.subspaces.v3.QueryOuterClass.QuerySubspacesRequest,
                desmos.subspaces.v3.QueryOuterClass.QuerySubspacesResponse>(
                  this, METHODID_SUBSPACES)))
          .addMethod(
            getSubspaceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.subspaces.v3.QueryOuterClass.QuerySubspaceRequest,
                desmos.subspaces.v3.QueryOuterClass.QuerySubspaceResponse>(
                  this, METHODID_SUBSPACE)))
          .addMethod(
            getSectionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.subspaces.v3.QueryOuterClass.QuerySectionsRequest,
                desmos.subspaces.v3.QueryOuterClass.QuerySectionsResponse>(
                  this, METHODID_SECTIONS)))
          .addMethod(
            getSectionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.subspaces.v3.QueryOuterClass.QuerySectionRequest,
                desmos.subspaces.v3.QueryOuterClass.QuerySectionResponse>(
                  this, METHODID_SECTION)))
          .addMethod(
            getUserGroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.subspaces.v3.QueryOuterClass.QueryUserGroupsRequest,
                desmos.subspaces.v3.QueryOuterClass.QueryUserGroupsResponse>(
                  this, METHODID_USER_GROUPS)))
          .addMethod(
            getUserGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.subspaces.v3.QueryOuterClass.QueryUserGroupRequest,
                desmos.subspaces.v3.QueryOuterClass.QueryUserGroupResponse>(
                  this, METHODID_USER_GROUP)))
          .addMethod(
            getUserGroupMembersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.subspaces.v3.QueryOuterClass.QueryUserGroupMembersRequest,
                desmos.subspaces.v3.QueryOuterClass.QueryUserGroupMembersResponse>(
                  this, METHODID_USER_GROUP_MEMBERS)))
          .addMethod(
            getUserPermissionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.subspaces.v3.QueryOuterClass.QueryUserPermissionsRequest,
                desmos.subspaces.v3.QueryOuterClass.QueryUserPermissionsResponse>(
                  this, METHODID_USER_PERMISSIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service
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
     * Subspaces queries all the subspaces inside Desmos
     * </pre>
     */
    public void subspaces(desmos.subspaces.v3.QueryOuterClass.QuerySubspacesRequest request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.QueryOuterClass.QuerySubspacesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubspacesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subspace queries all the information about the subspace with the given id
     * </pre>
     */
    public void subspace(desmos.subspaces.v3.QueryOuterClass.QuerySubspaceRequest request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.QueryOuterClass.QuerySubspaceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubspaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sections allows to query for the sections of a specific subspace
     * </pre>
     */
    public void sections(desmos.subspaces.v3.QueryOuterClass.QuerySectionsRequest request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.QueryOuterClass.QuerySectionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSectionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Section queries all the information about the section with the given id
     * </pre>
     */
    public void section(desmos.subspaces.v3.QueryOuterClass.QuerySectionRequest request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.QueryOuterClass.QuerySectionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UserGroups queries all the groups that are present inside the subspace with
     * the given id
     * </pre>
     */
    public void userGroups(desmos.subspaces.v3.QueryOuterClass.QueryUserGroupsRequest request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.QueryOuterClass.QueryUserGroupsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UserGroup queries the user group having the given id inside the specific
     * subspace
     * </pre>
     */
    public void userGroup(desmos.subspaces.v3.QueryOuterClass.QueryUserGroupRequest request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.QueryOuterClass.QueryUserGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UserGroupMembers queries all the members of a given user group
     * </pre>
     */
    public void userGroupMembers(desmos.subspaces.v3.QueryOuterClass.QueryUserGroupMembersRequest request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.QueryOuterClass.QueryUserGroupMembersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserGroupMembersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UserPermissions queries the permissions for the given user
     * </pre>
     */
    public void userPermissions(desmos.subspaces.v3.QueryOuterClass.QueryUserPermissionsRequest request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.QueryOuterClass.QueryUserPermissionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserPermissionsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service
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
     * Subspaces queries all the subspaces inside Desmos
     * </pre>
     */
    public desmos.subspaces.v3.QueryOuterClass.QuerySubspacesResponse subspaces(desmos.subspaces.v3.QueryOuterClass.QuerySubspacesRequest request) {
      return blockingUnaryCall(
          getChannel(), getSubspacesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subspace queries all the information about the subspace with the given id
     * </pre>
     */
    public desmos.subspaces.v3.QueryOuterClass.QuerySubspaceResponse subspace(desmos.subspaces.v3.QueryOuterClass.QuerySubspaceRequest request) {
      return blockingUnaryCall(
          getChannel(), getSubspaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sections allows to query for the sections of a specific subspace
     * </pre>
     */
    public desmos.subspaces.v3.QueryOuterClass.QuerySectionsResponse sections(desmos.subspaces.v3.QueryOuterClass.QuerySectionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSectionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Section queries all the information about the section with the given id
     * </pre>
     */
    public desmos.subspaces.v3.QueryOuterClass.QuerySectionResponse section(desmos.subspaces.v3.QueryOuterClass.QuerySectionRequest request) {
      return blockingUnaryCall(
          getChannel(), getSectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UserGroups queries all the groups that are present inside the subspace with
     * the given id
     * </pre>
     */
    public desmos.subspaces.v3.QueryOuterClass.QueryUserGroupsResponse userGroups(desmos.subspaces.v3.QueryOuterClass.QueryUserGroupsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUserGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UserGroup queries the user group having the given id inside the specific
     * subspace
     * </pre>
     */
    public desmos.subspaces.v3.QueryOuterClass.QueryUserGroupResponse userGroup(desmos.subspaces.v3.QueryOuterClass.QueryUserGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getUserGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UserGroupMembers queries all the members of a given user group
     * </pre>
     */
    public desmos.subspaces.v3.QueryOuterClass.QueryUserGroupMembersResponse userGroupMembers(desmos.subspaces.v3.QueryOuterClass.QueryUserGroupMembersRequest request) {
      return blockingUnaryCall(
          getChannel(), getUserGroupMembersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UserPermissions queries the permissions for the given user
     * </pre>
     */
    public desmos.subspaces.v3.QueryOuterClass.QueryUserPermissionsResponse userPermissions(desmos.subspaces.v3.QueryOuterClass.QueryUserPermissionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUserPermissionsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service
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
     * Subspaces queries all the subspaces inside Desmos
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.subspaces.v3.QueryOuterClass.QuerySubspacesResponse> subspaces(
        desmos.subspaces.v3.QueryOuterClass.QuerySubspacesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSubspacesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Subspace queries all the information about the subspace with the given id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.subspaces.v3.QueryOuterClass.QuerySubspaceResponse> subspace(
        desmos.subspaces.v3.QueryOuterClass.QuerySubspaceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSubspaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sections allows to query for the sections of a specific subspace
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.subspaces.v3.QueryOuterClass.QuerySectionsResponse> sections(
        desmos.subspaces.v3.QueryOuterClass.QuerySectionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSectionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Section queries all the information about the section with the given id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.subspaces.v3.QueryOuterClass.QuerySectionResponse> section(
        desmos.subspaces.v3.QueryOuterClass.QuerySectionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UserGroups queries all the groups that are present inside the subspace with
     * the given id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.subspaces.v3.QueryOuterClass.QueryUserGroupsResponse> userGroups(
        desmos.subspaces.v3.QueryOuterClass.QueryUserGroupsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUserGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UserGroup queries the user group having the given id inside the specific
     * subspace
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.subspaces.v3.QueryOuterClass.QueryUserGroupResponse> userGroup(
        desmos.subspaces.v3.QueryOuterClass.QueryUserGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUserGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UserGroupMembers queries all the members of a given user group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.subspaces.v3.QueryOuterClass.QueryUserGroupMembersResponse> userGroupMembers(
        desmos.subspaces.v3.QueryOuterClass.QueryUserGroupMembersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUserGroupMembersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UserPermissions queries the permissions for the given user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.subspaces.v3.QueryOuterClass.QueryUserPermissionsResponse> userPermissions(
        desmos.subspaces.v3.QueryOuterClass.QueryUserPermissionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUserPermissionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBSPACES = 0;
  private static final int METHODID_SUBSPACE = 1;
  private static final int METHODID_SECTIONS = 2;
  private static final int METHODID_SECTION = 3;
  private static final int METHODID_USER_GROUPS = 4;
  private static final int METHODID_USER_GROUP = 5;
  private static final int METHODID_USER_GROUP_MEMBERS = 6;
  private static final int METHODID_USER_PERMISSIONS = 7;

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
        case METHODID_SUBSPACES:
          serviceImpl.subspaces((desmos.subspaces.v3.QueryOuterClass.QuerySubspacesRequest) request,
              (io.grpc.stub.StreamObserver<desmos.subspaces.v3.QueryOuterClass.QuerySubspacesResponse>) responseObserver);
          break;
        case METHODID_SUBSPACE:
          serviceImpl.subspace((desmos.subspaces.v3.QueryOuterClass.QuerySubspaceRequest) request,
              (io.grpc.stub.StreamObserver<desmos.subspaces.v3.QueryOuterClass.QuerySubspaceResponse>) responseObserver);
          break;
        case METHODID_SECTIONS:
          serviceImpl.sections((desmos.subspaces.v3.QueryOuterClass.QuerySectionsRequest) request,
              (io.grpc.stub.StreamObserver<desmos.subspaces.v3.QueryOuterClass.QuerySectionsResponse>) responseObserver);
          break;
        case METHODID_SECTION:
          serviceImpl.section((desmos.subspaces.v3.QueryOuterClass.QuerySectionRequest) request,
              (io.grpc.stub.StreamObserver<desmos.subspaces.v3.QueryOuterClass.QuerySectionResponse>) responseObserver);
          break;
        case METHODID_USER_GROUPS:
          serviceImpl.userGroups((desmos.subspaces.v3.QueryOuterClass.QueryUserGroupsRequest) request,
              (io.grpc.stub.StreamObserver<desmos.subspaces.v3.QueryOuterClass.QueryUserGroupsResponse>) responseObserver);
          break;
        case METHODID_USER_GROUP:
          serviceImpl.userGroup((desmos.subspaces.v3.QueryOuterClass.QueryUserGroupRequest) request,
              (io.grpc.stub.StreamObserver<desmos.subspaces.v3.QueryOuterClass.QueryUserGroupResponse>) responseObserver);
          break;
        case METHODID_USER_GROUP_MEMBERS:
          serviceImpl.userGroupMembers((desmos.subspaces.v3.QueryOuterClass.QueryUserGroupMembersRequest) request,
              (io.grpc.stub.StreamObserver<desmos.subspaces.v3.QueryOuterClass.QueryUserGroupMembersResponse>) responseObserver);
          break;
        case METHODID_USER_PERMISSIONS:
          serviceImpl.userPermissions((desmos.subspaces.v3.QueryOuterClass.QueryUserPermissionsRequest) request,
              (io.grpc.stub.StreamObserver<desmos.subspaces.v3.QueryOuterClass.QueryUserPermissionsResponse>) responseObserver);
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
      return desmos.subspaces.v3.QueryOuterClass.getDescriptor();
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
              .addMethod(getSubspacesMethod())
              .addMethod(getSubspaceMethod())
              .addMethod(getSectionsMethod())
              .addMethod(getSectionMethod())
              .addMethod(getUserGroupsMethod())
              .addMethod(getUserGroupMethod())
              .addMethod(getUserGroupMembersMethod())
              .addMethod(getUserPermissionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
