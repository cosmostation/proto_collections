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
 * Msg defines subspaces Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: desmos/subspaces/v3/msgs.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "desmos.subspaces.v3.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgCreateSubspace,
      desmos.subspaces.v3.Msgs.MsgCreateSubspaceResponse> getCreateSubspaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSubspace",
      requestType = desmos.subspaces.v3.Msgs.MsgCreateSubspace.class,
      responseType = desmos.subspaces.v3.Msgs.MsgCreateSubspaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgCreateSubspace,
      desmos.subspaces.v3.Msgs.MsgCreateSubspaceResponse> getCreateSubspaceMethod() {
    io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgCreateSubspace, desmos.subspaces.v3.Msgs.MsgCreateSubspaceResponse> getCreateSubspaceMethod;
    if ((getCreateSubspaceMethod = MsgGrpc.getCreateSubspaceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateSubspaceMethod = MsgGrpc.getCreateSubspaceMethod) == null) {
          MsgGrpc.getCreateSubspaceMethod = getCreateSubspaceMethod =
              io.grpc.MethodDescriptor.<desmos.subspaces.v3.Msgs.MsgCreateSubspace, desmos.subspaces.v3.Msgs.MsgCreateSubspaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSubspace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.Msgs.MsgCreateSubspace.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.Msgs.MsgCreateSubspaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateSubspace"))
              .build();
        }
      }
    }
    return getCreateSubspaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgEditSubspace,
      desmos.subspaces.v3.Msgs.MsgEditSubspaceResponse> getEditSubspaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditSubspace",
      requestType = desmos.subspaces.v3.Msgs.MsgEditSubspace.class,
      responseType = desmos.subspaces.v3.Msgs.MsgEditSubspaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgEditSubspace,
      desmos.subspaces.v3.Msgs.MsgEditSubspaceResponse> getEditSubspaceMethod() {
    io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgEditSubspace, desmos.subspaces.v3.Msgs.MsgEditSubspaceResponse> getEditSubspaceMethod;
    if ((getEditSubspaceMethod = MsgGrpc.getEditSubspaceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getEditSubspaceMethod = MsgGrpc.getEditSubspaceMethod) == null) {
          MsgGrpc.getEditSubspaceMethod = getEditSubspaceMethod =
              io.grpc.MethodDescriptor.<desmos.subspaces.v3.Msgs.MsgEditSubspace, desmos.subspaces.v3.Msgs.MsgEditSubspaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditSubspace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.Msgs.MsgEditSubspace.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.Msgs.MsgEditSubspaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("EditSubspace"))
              .build();
        }
      }
    }
    return getEditSubspaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgDeleteSubspace,
      desmos.subspaces.v3.Msgs.MsgDeleteSubspaceResponse> getDeleteSubspaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSubspace",
      requestType = desmos.subspaces.v3.Msgs.MsgDeleteSubspace.class,
      responseType = desmos.subspaces.v3.Msgs.MsgDeleteSubspaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgDeleteSubspace,
      desmos.subspaces.v3.Msgs.MsgDeleteSubspaceResponse> getDeleteSubspaceMethod() {
    io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgDeleteSubspace, desmos.subspaces.v3.Msgs.MsgDeleteSubspaceResponse> getDeleteSubspaceMethod;
    if ((getDeleteSubspaceMethod = MsgGrpc.getDeleteSubspaceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteSubspaceMethod = MsgGrpc.getDeleteSubspaceMethod) == null) {
          MsgGrpc.getDeleteSubspaceMethod = getDeleteSubspaceMethod =
              io.grpc.MethodDescriptor.<desmos.subspaces.v3.Msgs.MsgDeleteSubspace, desmos.subspaces.v3.Msgs.MsgDeleteSubspaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSubspace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.Msgs.MsgDeleteSubspace.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.Msgs.MsgDeleteSubspaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteSubspace"))
              .build();
        }
      }
    }
    return getDeleteSubspaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgCreateSection,
      desmos.subspaces.v3.Msgs.MsgCreateSectionResponse> getCreateSectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSection",
      requestType = desmos.subspaces.v3.Msgs.MsgCreateSection.class,
      responseType = desmos.subspaces.v3.Msgs.MsgCreateSectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgCreateSection,
      desmos.subspaces.v3.Msgs.MsgCreateSectionResponse> getCreateSectionMethod() {
    io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgCreateSection, desmos.subspaces.v3.Msgs.MsgCreateSectionResponse> getCreateSectionMethod;
    if ((getCreateSectionMethod = MsgGrpc.getCreateSectionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateSectionMethod = MsgGrpc.getCreateSectionMethod) == null) {
          MsgGrpc.getCreateSectionMethod = getCreateSectionMethod =
              io.grpc.MethodDescriptor.<desmos.subspaces.v3.Msgs.MsgCreateSection, desmos.subspaces.v3.Msgs.MsgCreateSectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.Msgs.MsgCreateSection.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.Msgs.MsgCreateSectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateSection"))
              .build();
        }
      }
    }
    return getCreateSectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgEditSection,
      desmos.subspaces.v3.Msgs.MsgEditSectionResponse> getEditSectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditSection",
      requestType = desmos.subspaces.v3.Msgs.MsgEditSection.class,
      responseType = desmos.subspaces.v3.Msgs.MsgEditSectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgEditSection,
      desmos.subspaces.v3.Msgs.MsgEditSectionResponse> getEditSectionMethod() {
    io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgEditSection, desmos.subspaces.v3.Msgs.MsgEditSectionResponse> getEditSectionMethod;
    if ((getEditSectionMethod = MsgGrpc.getEditSectionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getEditSectionMethod = MsgGrpc.getEditSectionMethod) == null) {
          MsgGrpc.getEditSectionMethod = getEditSectionMethod =
              io.grpc.MethodDescriptor.<desmos.subspaces.v3.Msgs.MsgEditSection, desmos.subspaces.v3.Msgs.MsgEditSectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditSection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.Msgs.MsgEditSection.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.Msgs.MsgEditSectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("EditSection"))
              .build();
        }
      }
    }
    return getEditSectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgMoveSection,
      desmos.subspaces.v3.Msgs.MsgMoveSectionResponse> getMoveSectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MoveSection",
      requestType = desmos.subspaces.v3.Msgs.MsgMoveSection.class,
      responseType = desmos.subspaces.v3.Msgs.MsgMoveSectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgMoveSection,
      desmos.subspaces.v3.Msgs.MsgMoveSectionResponse> getMoveSectionMethod() {
    io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgMoveSection, desmos.subspaces.v3.Msgs.MsgMoveSectionResponse> getMoveSectionMethod;
    if ((getMoveSectionMethod = MsgGrpc.getMoveSectionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMoveSectionMethod = MsgGrpc.getMoveSectionMethod) == null) {
          MsgGrpc.getMoveSectionMethod = getMoveSectionMethod =
              io.grpc.MethodDescriptor.<desmos.subspaces.v3.Msgs.MsgMoveSection, desmos.subspaces.v3.Msgs.MsgMoveSectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MoveSection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.Msgs.MsgMoveSection.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.Msgs.MsgMoveSectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MoveSection"))
              .build();
        }
      }
    }
    return getMoveSectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgDeleteSection,
      desmos.subspaces.v3.Msgs.MsgDeleteSectionResponse> getDeleteSectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSection",
      requestType = desmos.subspaces.v3.Msgs.MsgDeleteSection.class,
      responseType = desmos.subspaces.v3.Msgs.MsgDeleteSectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgDeleteSection,
      desmos.subspaces.v3.Msgs.MsgDeleteSectionResponse> getDeleteSectionMethod() {
    io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgDeleteSection, desmos.subspaces.v3.Msgs.MsgDeleteSectionResponse> getDeleteSectionMethod;
    if ((getDeleteSectionMethod = MsgGrpc.getDeleteSectionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteSectionMethod = MsgGrpc.getDeleteSectionMethod) == null) {
          MsgGrpc.getDeleteSectionMethod = getDeleteSectionMethod =
              io.grpc.MethodDescriptor.<desmos.subspaces.v3.Msgs.MsgDeleteSection, desmos.subspaces.v3.Msgs.MsgDeleteSectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.Msgs.MsgDeleteSection.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.Msgs.MsgDeleteSectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteSection"))
              .build();
        }
      }
    }
    return getDeleteSectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgCreateUserGroup,
      desmos.subspaces.v3.Msgs.MsgCreateUserGroupResponse> getCreateUserGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUserGroup",
      requestType = desmos.subspaces.v3.Msgs.MsgCreateUserGroup.class,
      responseType = desmos.subspaces.v3.Msgs.MsgCreateUserGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgCreateUserGroup,
      desmos.subspaces.v3.Msgs.MsgCreateUserGroupResponse> getCreateUserGroupMethod() {
    io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgCreateUserGroup, desmos.subspaces.v3.Msgs.MsgCreateUserGroupResponse> getCreateUserGroupMethod;
    if ((getCreateUserGroupMethod = MsgGrpc.getCreateUserGroupMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateUserGroupMethod = MsgGrpc.getCreateUserGroupMethod) == null) {
          MsgGrpc.getCreateUserGroupMethod = getCreateUserGroupMethod =
              io.grpc.MethodDescriptor.<desmos.subspaces.v3.Msgs.MsgCreateUserGroup, desmos.subspaces.v3.Msgs.MsgCreateUserGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUserGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.Msgs.MsgCreateUserGroup.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.Msgs.MsgCreateUserGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateUserGroup"))
              .build();
        }
      }
    }
    return getCreateUserGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgEditUserGroup,
      desmos.subspaces.v3.Msgs.MsgEditUserGroupResponse> getEditUserGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditUserGroup",
      requestType = desmos.subspaces.v3.Msgs.MsgEditUserGroup.class,
      responseType = desmos.subspaces.v3.Msgs.MsgEditUserGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgEditUserGroup,
      desmos.subspaces.v3.Msgs.MsgEditUserGroupResponse> getEditUserGroupMethod() {
    io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgEditUserGroup, desmos.subspaces.v3.Msgs.MsgEditUserGroupResponse> getEditUserGroupMethod;
    if ((getEditUserGroupMethod = MsgGrpc.getEditUserGroupMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getEditUserGroupMethod = MsgGrpc.getEditUserGroupMethod) == null) {
          MsgGrpc.getEditUserGroupMethod = getEditUserGroupMethod =
              io.grpc.MethodDescriptor.<desmos.subspaces.v3.Msgs.MsgEditUserGroup, desmos.subspaces.v3.Msgs.MsgEditUserGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditUserGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.Msgs.MsgEditUserGroup.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.Msgs.MsgEditUserGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("EditUserGroup"))
              .build();
        }
      }
    }
    return getEditUserGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgMoveUserGroup,
      desmos.subspaces.v3.Msgs.MsgMoveUserGroupResponse> getMoveUserGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MoveUserGroup",
      requestType = desmos.subspaces.v3.Msgs.MsgMoveUserGroup.class,
      responseType = desmos.subspaces.v3.Msgs.MsgMoveUserGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgMoveUserGroup,
      desmos.subspaces.v3.Msgs.MsgMoveUserGroupResponse> getMoveUserGroupMethod() {
    io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgMoveUserGroup, desmos.subspaces.v3.Msgs.MsgMoveUserGroupResponse> getMoveUserGroupMethod;
    if ((getMoveUserGroupMethod = MsgGrpc.getMoveUserGroupMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMoveUserGroupMethod = MsgGrpc.getMoveUserGroupMethod) == null) {
          MsgGrpc.getMoveUserGroupMethod = getMoveUserGroupMethod =
              io.grpc.MethodDescriptor.<desmos.subspaces.v3.Msgs.MsgMoveUserGroup, desmos.subspaces.v3.Msgs.MsgMoveUserGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MoveUserGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.Msgs.MsgMoveUserGroup.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.Msgs.MsgMoveUserGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MoveUserGroup"))
              .build();
        }
      }
    }
    return getMoveUserGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgSetUserGroupPermissions,
      desmos.subspaces.v3.Msgs.MsgSetUserGroupPermissionsResponse> getSetUserGroupPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetUserGroupPermissions",
      requestType = desmos.subspaces.v3.Msgs.MsgSetUserGroupPermissions.class,
      responseType = desmos.subspaces.v3.Msgs.MsgSetUserGroupPermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgSetUserGroupPermissions,
      desmos.subspaces.v3.Msgs.MsgSetUserGroupPermissionsResponse> getSetUserGroupPermissionsMethod() {
    io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgSetUserGroupPermissions, desmos.subspaces.v3.Msgs.MsgSetUserGroupPermissionsResponse> getSetUserGroupPermissionsMethod;
    if ((getSetUserGroupPermissionsMethod = MsgGrpc.getSetUserGroupPermissionsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetUserGroupPermissionsMethod = MsgGrpc.getSetUserGroupPermissionsMethod) == null) {
          MsgGrpc.getSetUserGroupPermissionsMethod = getSetUserGroupPermissionsMethod =
              io.grpc.MethodDescriptor.<desmos.subspaces.v3.Msgs.MsgSetUserGroupPermissions, desmos.subspaces.v3.Msgs.MsgSetUserGroupPermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetUserGroupPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.Msgs.MsgSetUserGroupPermissions.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.Msgs.MsgSetUserGroupPermissionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetUserGroupPermissions"))
              .build();
        }
      }
    }
    return getSetUserGroupPermissionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgDeleteUserGroup,
      desmos.subspaces.v3.Msgs.MsgDeleteUserGroupResponse> getDeleteUserGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUserGroup",
      requestType = desmos.subspaces.v3.Msgs.MsgDeleteUserGroup.class,
      responseType = desmos.subspaces.v3.Msgs.MsgDeleteUserGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgDeleteUserGroup,
      desmos.subspaces.v3.Msgs.MsgDeleteUserGroupResponse> getDeleteUserGroupMethod() {
    io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgDeleteUserGroup, desmos.subspaces.v3.Msgs.MsgDeleteUserGroupResponse> getDeleteUserGroupMethod;
    if ((getDeleteUserGroupMethod = MsgGrpc.getDeleteUserGroupMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteUserGroupMethod = MsgGrpc.getDeleteUserGroupMethod) == null) {
          MsgGrpc.getDeleteUserGroupMethod = getDeleteUserGroupMethod =
              io.grpc.MethodDescriptor.<desmos.subspaces.v3.Msgs.MsgDeleteUserGroup, desmos.subspaces.v3.Msgs.MsgDeleteUserGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteUserGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.Msgs.MsgDeleteUserGroup.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.Msgs.MsgDeleteUserGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteUserGroup"))
              .build();
        }
      }
    }
    return getDeleteUserGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgAddUserToUserGroup,
      desmos.subspaces.v3.Msgs.MsgAddUserToUserGroupResponse> getAddUserToUserGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUserToUserGroup",
      requestType = desmos.subspaces.v3.Msgs.MsgAddUserToUserGroup.class,
      responseType = desmos.subspaces.v3.Msgs.MsgAddUserToUserGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgAddUserToUserGroup,
      desmos.subspaces.v3.Msgs.MsgAddUserToUserGroupResponse> getAddUserToUserGroupMethod() {
    io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgAddUserToUserGroup, desmos.subspaces.v3.Msgs.MsgAddUserToUserGroupResponse> getAddUserToUserGroupMethod;
    if ((getAddUserToUserGroupMethod = MsgGrpc.getAddUserToUserGroupMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddUserToUserGroupMethod = MsgGrpc.getAddUserToUserGroupMethod) == null) {
          MsgGrpc.getAddUserToUserGroupMethod = getAddUserToUserGroupMethod =
              io.grpc.MethodDescriptor.<desmos.subspaces.v3.Msgs.MsgAddUserToUserGroup, desmos.subspaces.v3.Msgs.MsgAddUserToUserGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddUserToUserGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.Msgs.MsgAddUserToUserGroup.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.Msgs.MsgAddUserToUserGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddUserToUserGroup"))
              .build();
        }
      }
    }
    return getAddUserToUserGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgRemoveUserFromUserGroup,
      desmos.subspaces.v3.Msgs.MsgRemoveUserFromUserGroupResponse> getRemoveUserFromUserGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveUserFromUserGroup",
      requestType = desmos.subspaces.v3.Msgs.MsgRemoveUserFromUserGroup.class,
      responseType = desmos.subspaces.v3.Msgs.MsgRemoveUserFromUserGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgRemoveUserFromUserGroup,
      desmos.subspaces.v3.Msgs.MsgRemoveUserFromUserGroupResponse> getRemoveUserFromUserGroupMethod() {
    io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgRemoveUserFromUserGroup, desmos.subspaces.v3.Msgs.MsgRemoveUserFromUserGroupResponse> getRemoveUserFromUserGroupMethod;
    if ((getRemoveUserFromUserGroupMethod = MsgGrpc.getRemoveUserFromUserGroupMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemoveUserFromUserGroupMethod = MsgGrpc.getRemoveUserFromUserGroupMethod) == null) {
          MsgGrpc.getRemoveUserFromUserGroupMethod = getRemoveUserFromUserGroupMethod =
              io.grpc.MethodDescriptor.<desmos.subspaces.v3.Msgs.MsgRemoveUserFromUserGroup, desmos.subspaces.v3.Msgs.MsgRemoveUserFromUserGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveUserFromUserGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.Msgs.MsgRemoveUserFromUserGroup.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.Msgs.MsgRemoveUserFromUserGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemoveUserFromUserGroup"))
              .build();
        }
      }
    }
    return getRemoveUserFromUserGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgSetUserPermissions,
      desmos.subspaces.v3.Msgs.MsgSetUserPermissionsResponse> getSetUserPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetUserPermissions",
      requestType = desmos.subspaces.v3.Msgs.MsgSetUserPermissions.class,
      responseType = desmos.subspaces.v3.Msgs.MsgSetUserPermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgSetUserPermissions,
      desmos.subspaces.v3.Msgs.MsgSetUserPermissionsResponse> getSetUserPermissionsMethod() {
    io.grpc.MethodDescriptor<desmos.subspaces.v3.Msgs.MsgSetUserPermissions, desmos.subspaces.v3.Msgs.MsgSetUserPermissionsResponse> getSetUserPermissionsMethod;
    if ((getSetUserPermissionsMethod = MsgGrpc.getSetUserPermissionsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetUserPermissionsMethod = MsgGrpc.getSetUserPermissionsMethod) == null) {
          MsgGrpc.getSetUserPermissionsMethod = getSetUserPermissionsMethod =
              io.grpc.MethodDescriptor.<desmos.subspaces.v3.Msgs.MsgSetUserPermissions, desmos.subspaces.v3.Msgs.MsgSetUserPermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetUserPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.Msgs.MsgSetUserPermissions.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  desmos.subspaces.v3.Msgs.MsgSetUserPermissionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetUserPermissions"))
              .build();
        }
      }
    }
    return getSetUserPermissionsMethod;
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
   * Msg defines subspaces Msg service.
   * </pre>
   */
  public static abstract class MsgImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * CreateSubspace allows to create a subspace
     * </pre>
     */
    public void createSubspace(desmos.subspaces.v3.Msgs.MsgCreateSubspace request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgCreateSubspaceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateSubspaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * EditSubspace allows to edit a subspace
     * </pre>
     */
    public void editSubspace(desmos.subspaces.v3.Msgs.MsgEditSubspace request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgEditSubspaceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEditSubspaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteSubspace allows to delete a subspace
     * </pre>
     */
    public void deleteSubspace(desmos.subspaces.v3.Msgs.MsgDeleteSubspace request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgDeleteSubspaceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteSubspaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateSection allows to create a new subspace section
     * </pre>
     */
    public void createSection(desmos.subspaces.v3.Msgs.MsgCreateSection request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgCreateSectionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateSectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * EditSection allows to edit an existing section
     * </pre>
     */
    public void editSection(desmos.subspaces.v3.Msgs.MsgEditSection request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgEditSectionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEditSectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * MoveSection allows to move an existing section to another parent
     * </pre>
     */
    public void moveSection(desmos.subspaces.v3.Msgs.MsgMoveSection request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgMoveSectionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMoveSectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteSection allows to delete an existing section
     * </pre>
     */
    public void deleteSection(desmos.subspaces.v3.Msgs.MsgDeleteSection request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgDeleteSectionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteSectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateUserGroup allows to create a user group
     * </pre>
     */
    public void createUserGroup(desmos.subspaces.v3.Msgs.MsgCreateUserGroup request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgCreateUserGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateUserGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * EditUserGroup allows to edit a user group
     * </pre>
     */
    public void editUserGroup(desmos.subspaces.v3.Msgs.MsgEditUserGroup request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgEditUserGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEditUserGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * MoveUserGroup allows to move a user group from a section to another
     * </pre>
     */
    public void moveUserGroup(desmos.subspaces.v3.Msgs.MsgMoveUserGroup request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgMoveUserGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMoveUserGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetUserGroupPermissions allows to set the permissions for a specific group
     * </pre>
     */
    public void setUserGroupPermissions(desmos.subspaces.v3.Msgs.MsgSetUserGroupPermissions request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgSetUserGroupPermissionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetUserGroupPermissionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteUserGroup allows to delete an existing user group
     * </pre>
     */
    public void deleteUserGroup(desmos.subspaces.v3.Msgs.MsgDeleteUserGroup request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgDeleteUserGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteUserGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddUserToUserGroup allows to add a specific user to a specific user group
     * </pre>
     */
    public void addUserToUserGroup(desmos.subspaces.v3.Msgs.MsgAddUserToUserGroup request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgAddUserToUserGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddUserToUserGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveUserFromUserGroup allows to remove a specific user from a specific
     * user group
     * </pre>
     */
    public void removeUserFromUserGroup(desmos.subspaces.v3.Msgs.MsgRemoveUserFromUserGroup request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgRemoveUserFromUserGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveUserFromUserGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetUserPermissions allows to set the permissions for a specific user
     * </pre>
     */
    public void setUserPermissions(desmos.subspaces.v3.Msgs.MsgSetUserPermissions request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgSetUserPermissionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetUserPermissionsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateSubspaceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.subspaces.v3.Msgs.MsgCreateSubspace,
                desmos.subspaces.v3.Msgs.MsgCreateSubspaceResponse>(
                  this, METHODID_CREATE_SUBSPACE)))
          .addMethod(
            getEditSubspaceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.subspaces.v3.Msgs.MsgEditSubspace,
                desmos.subspaces.v3.Msgs.MsgEditSubspaceResponse>(
                  this, METHODID_EDIT_SUBSPACE)))
          .addMethod(
            getDeleteSubspaceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.subspaces.v3.Msgs.MsgDeleteSubspace,
                desmos.subspaces.v3.Msgs.MsgDeleteSubspaceResponse>(
                  this, METHODID_DELETE_SUBSPACE)))
          .addMethod(
            getCreateSectionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.subspaces.v3.Msgs.MsgCreateSection,
                desmos.subspaces.v3.Msgs.MsgCreateSectionResponse>(
                  this, METHODID_CREATE_SECTION)))
          .addMethod(
            getEditSectionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.subspaces.v3.Msgs.MsgEditSection,
                desmos.subspaces.v3.Msgs.MsgEditSectionResponse>(
                  this, METHODID_EDIT_SECTION)))
          .addMethod(
            getMoveSectionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.subspaces.v3.Msgs.MsgMoveSection,
                desmos.subspaces.v3.Msgs.MsgMoveSectionResponse>(
                  this, METHODID_MOVE_SECTION)))
          .addMethod(
            getDeleteSectionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.subspaces.v3.Msgs.MsgDeleteSection,
                desmos.subspaces.v3.Msgs.MsgDeleteSectionResponse>(
                  this, METHODID_DELETE_SECTION)))
          .addMethod(
            getCreateUserGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.subspaces.v3.Msgs.MsgCreateUserGroup,
                desmos.subspaces.v3.Msgs.MsgCreateUserGroupResponse>(
                  this, METHODID_CREATE_USER_GROUP)))
          .addMethod(
            getEditUserGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.subspaces.v3.Msgs.MsgEditUserGroup,
                desmos.subspaces.v3.Msgs.MsgEditUserGroupResponse>(
                  this, METHODID_EDIT_USER_GROUP)))
          .addMethod(
            getMoveUserGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.subspaces.v3.Msgs.MsgMoveUserGroup,
                desmos.subspaces.v3.Msgs.MsgMoveUserGroupResponse>(
                  this, METHODID_MOVE_USER_GROUP)))
          .addMethod(
            getSetUserGroupPermissionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.subspaces.v3.Msgs.MsgSetUserGroupPermissions,
                desmos.subspaces.v3.Msgs.MsgSetUserGroupPermissionsResponse>(
                  this, METHODID_SET_USER_GROUP_PERMISSIONS)))
          .addMethod(
            getDeleteUserGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.subspaces.v3.Msgs.MsgDeleteUserGroup,
                desmos.subspaces.v3.Msgs.MsgDeleteUserGroupResponse>(
                  this, METHODID_DELETE_USER_GROUP)))
          .addMethod(
            getAddUserToUserGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.subspaces.v3.Msgs.MsgAddUserToUserGroup,
                desmos.subspaces.v3.Msgs.MsgAddUserToUserGroupResponse>(
                  this, METHODID_ADD_USER_TO_USER_GROUP)))
          .addMethod(
            getRemoveUserFromUserGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.subspaces.v3.Msgs.MsgRemoveUserFromUserGroup,
                desmos.subspaces.v3.Msgs.MsgRemoveUserFromUserGroupResponse>(
                  this, METHODID_REMOVE_USER_FROM_USER_GROUP)))
          .addMethod(
            getSetUserPermissionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                desmos.subspaces.v3.Msgs.MsgSetUserPermissions,
                desmos.subspaces.v3.Msgs.MsgSetUserPermissionsResponse>(
                  this, METHODID_SET_USER_PERMISSIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * Msg defines subspaces Msg service.
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
     * CreateSubspace allows to create a subspace
     * </pre>
     */
    public void createSubspace(desmos.subspaces.v3.Msgs.MsgCreateSubspace request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgCreateSubspaceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateSubspaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EditSubspace allows to edit a subspace
     * </pre>
     */
    public void editSubspace(desmos.subspaces.v3.Msgs.MsgEditSubspace request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgEditSubspaceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEditSubspaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteSubspace allows to delete a subspace
     * </pre>
     */
    public void deleteSubspace(desmos.subspaces.v3.Msgs.MsgDeleteSubspace request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgDeleteSubspaceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteSubspaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateSection allows to create a new subspace section
     * </pre>
     */
    public void createSection(desmos.subspaces.v3.Msgs.MsgCreateSection request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgCreateSectionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateSectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EditSection allows to edit an existing section
     * </pre>
     */
    public void editSection(desmos.subspaces.v3.Msgs.MsgEditSection request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgEditSectionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEditSectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MoveSection allows to move an existing section to another parent
     * </pre>
     */
    public void moveSection(desmos.subspaces.v3.Msgs.MsgMoveSection request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgMoveSectionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMoveSectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteSection allows to delete an existing section
     * </pre>
     */
    public void deleteSection(desmos.subspaces.v3.Msgs.MsgDeleteSection request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgDeleteSectionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteSectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateUserGroup allows to create a user group
     * </pre>
     */
    public void createUserGroup(desmos.subspaces.v3.Msgs.MsgCreateUserGroup request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgCreateUserGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateUserGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EditUserGroup allows to edit a user group
     * </pre>
     */
    public void editUserGroup(desmos.subspaces.v3.Msgs.MsgEditUserGroup request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgEditUserGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEditUserGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MoveUserGroup allows to move a user group from a section to another
     * </pre>
     */
    public void moveUserGroup(desmos.subspaces.v3.Msgs.MsgMoveUserGroup request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgMoveUserGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMoveUserGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetUserGroupPermissions allows to set the permissions for a specific group
     * </pre>
     */
    public void setUserGroupPermissions(desmos.subspaces.v3.Msgs.MsgSetUserGroupPermissions request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgSetUserGroupPermissionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetUserGroupPermissionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteUserGroup allows to delete an existing user group
     * </pre>
     */
    public void deleteUserGroup(desmos.subspaces.v3.Msgs.MsgDeleteUserGroup request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgDeleteUserGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteUserGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddUserToUserGroup allows to add a specific user to a specific user group
     * </pre>
     */
    public void addUserToUserGroup(desmos.subspaces.v3.Msgs.MsgAddUserToUserGroup request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgAddUserToUserGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddUserToUserGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveUserFromUserGroup allows to remove a specific user from a specific
     * user group
     * </pre>
     */
    public void removeUserFromUserGroup(desmos.subspaces.v3.Msgs.MsgRemoveUserFromUserGroup request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgRemoveUserFromUserGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveUserFromUserGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetUserPermissions allows to set the permissions for a specific user
     * </pre>
     */
    public void setUserPermissions(desmos.subspaces.v3.Msgs.MsgSetUserPermissions request,
        io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgSetUserPermissionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetUserPermissionsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Msg defines subspaces Msg service.
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
     * CreateSubspace allows to create a subspace
     * </pre>
     */
    public desmos.subspaces.v3.Msgs.MsgCreateSubspaceResponse createSubspace(desmos.subspaces.v3.Msgs.MsgCreateSubspace request) {
      return blockingUnaryCall(
          getChannel(), getCreateSubspaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EditSubspace allows to edit a subspace
     * </pre>
     */
    public desmos.subspaces.v3.Msgs.MsgEditSubspaceResponse editSubspace(desmos.subspaces.v3.Msgs.MsgEditSubspace request) {
      return blockingUnaryCall(
          getChannel(), getEditSubspaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteSubspace allows to delete a subspace
     * </pre>
     */
    public desmos.subspaces.v3.Msgs.MsgDeleteSubspaceResponse deleteSubspace(desmos.subspaces.v3.Msgs.MsgDeleteSubspace request) {
      return blockingUnaryCall(
          getChannel(), getDeleteSubspaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateSection allows to create a new subspace section
     * </pre>
     */
    public desmos.subspaces.v3.Msgs.MsgCreateSectionResponse createSection(desmos.subspaces.v3.Msgs.MsgCreateSection request) {
      return blockingUnaryCall(
          getChannel(), getCreateSectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EditSection allows to edit an existing section
     * </pre>
     */
    public desmos.subspaces.v3.Msgs.MsgEditSectionResponse editSection(desmos.subspaces.v3.Msgs.MsgEditSection request) {
      return blockingUnaryCall(
          getChannel(), getEditSectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MoveSection allows to move an existing section to another parent
     * </pre>
     */
    public desmos.subspaces.v3.Msgs.MsgMoveSectionResponse moveSection(desmos.subspaces.v3.Msgs.MsgMoveSection request) {
      return blockingUnaryCall(
          getChannel(), getMoveSectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteSection allows to delete an existing section
     * </pre>
     */
    public desmos.subspaces.v3.Msgs.MsgDeleteSectionResponse deleteSection(desmos.subspaces.v3.Msgs.MsgDeleteSection request) {
      return blockingUnaryCall(
          getChannel(), getDeleteSectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateUserGroup allows to create a user group
     * </pre>
     */
    public desmos.subspaces.v3.Msgs.MsgCreateUserGroupResponse createUserGroup(desmos.subspaces.v3.Msgs.MsgCreateUserGroup request) {
      return blockingUnaryCall(
          getChannel(), getCreateUserGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EditUserGroup allows to edit a user group
     * </pre>
     */
    public desmos.subspaces.v3.Msgs.MsgEditUserGroupResponse editUserGroup(desmos.subspaces.v3.Msgs.MsgEditUserGroup request) {
      return blockingUnaryCall(
          getChannel(), getEditUserGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MoveUserGroup allows to move a user group from a section to another
     * </pre>
     */
    public desmos.subspaces.v3.Msgs.MsgMoveUserGroupResponse moveUserGroup(desmos.subspaces.v3.Msgs.MsgMoveUserGroup request) {
      return blockingUnaryCall(
          getChannel(), getMoveUserGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetUserGroupPermissions allows to set the permissions for a specific group
     * </pre>
     */
    public desmos.subspaces.v3.Msgs.MsgSetUserGroupPermissionsResponse setUserGroupPermissions(desmos.subspaces.v3.Msgs.MsgSetUserGroupPermissions request) {
      return blockingUnaryCall(
          getChannel(), getSetUserGroupPermissionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteUserGroup allows to delete an existing user group
     * </pre>
     */
    public desmos.subspaces.v3.Msgs.MsgDeleteUserGroupResponse deleteUserGroup(desmos.subspaces.v3.Msgs.MsgDeleteUserGroup request) {
      return blockingUnaryCall(
          getChannel(), getDeleteUserGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddUserToUserGroup allows to add a specific user to a specific user group
     * </pre>
     */
    public desmos.subspaces.v3.Msgs.MsgAddUserToUserGroupResponse addUserToUserGroup(desmos.subspaces.v3.Msgs.MsgAddUserToUserGroup request) {
      return blockingUnaryCall(
          getChannel(), getAddUserToUserGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveUserFromUserGroup allows to remove a specific user from a specific
     * user group
     * </pre>
     */
    public desmos.subspaces.v3.Msgs.MsgRemoveUserFromUserGroupResponse removeUserFromUserGroup(desmos.subspaces.v3.Msgs.MsgRemoveUserFromUserGroup request) {
      return blockingUnaryCall(
          getChannel(), getRemoveUserFromUserGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetUserPermissions allows to set the permissions for a specific user
     * </pre>
     */
    public desmos.subspaces.v3.Msgs.MsgSetUserPermissionsResponse setUserPermissions(desmos.subspaces.v3.Msgs.MsgSetUserPermissions request) {
      return blockingUnaryCall(
          getChannel(), getSetUserPermissionsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Msg defines subspaces Msg service.
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
     * CreateSubspace allows to create a subspace
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.subspaces.v3.Msgs.MsgCreateSubspaceResponse> createSubspace(
        desmos.subspaces.v3.Msgs.MsgCreateSubspace request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateSubspaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EditSubspace allows to edit a subspace
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.subspaces.v3.Msgs.MsgEditSubspaceResponse> editSubspace(
        desmos.subspaces.v3.Msgs.MsgEditSubspace request) {
      return futureUnaryCall(
          getChannel().newCall(getEditSubspaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteSubspace allows to delete a subspace
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.subspaces.v3.Msgs.MsgDeleteSubspaceResponse> deleteSubspace(
        desmos.subspaces.v3.Msgs.MsgDeleteSubspace request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteSubspaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateSection allows to create a new subspace section
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.subspaces.v3.Msgs.MsgCreateSectionResponse> createSection(
        desmos.subspaces.v3.Msgs.MsgCreateSection request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateSectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EditSection allows to edit an existing section
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.subspaces.v3.Msgs.MsgEditSectionResponse> editSection(
        desmos.subspaces.v3.Msgs.MsgEditSection request) {
      return futureUnaryCall(
          getChannel().newCall(getEditSectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MoveSection allows to move an existing section to another parent
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.subspaces.v3.Msgs.MsgMoveSectionResponse> moveSection(
        desmos.subspaces.v3.Msgs.MsgMoveSection request) {
      return futureUnaryCall(
          getChannel().newCall(getMoveSectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteSection allows to delete an existing section
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.subspaces.v3.Msgs.MsgDeleteSectionResponse> deleteSection(
        desmos.subspaces.v3.Msgs.MsgDeleteSection request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteSectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateUserGroup allows to create a user group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.subspaces.v3.Msgs.MsgCreateUserGroupResponse> createUserGroup(
        desmos.subspaces.v3.Msgs.MsgCreateUserGroup request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateUserGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EditUserGroup allows to edit a user group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.subspaces.v3.Msgs.MsgEditUserGroupResponse> editUserGroup(
        desmos.subspaces.v3.Msgs.MsgEditUserGroup request) {
      return futureUnaryCall(
          getChannel().newCall(getEditUserGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MoveUserGroup allows to move a user group from a section to another
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.subspaces.v3.Msgs.MsgMoveUserGroupResponse> moveUserGroup(
        desmos.subspaces.v3.Msgs.MsgMoveUserGroup request) {
      return futureUnaryCall(
          getChannel().newCall(getMoveUserGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetUserGroupPermissions allows to set the permissions for a specific group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.subspaces.v3.Msgs.MsgSetUserGroupPermissionsResponse> setUserGroupPermissions(
        desmos.subspaces.v3.Msgs.MsgSetUserGroupPermissions request) {
      return futureUnaryCall(
          getChannel().newCall(getSetUserGroupPermissionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteUserGroup allows to delete an existing user group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.subspaces.v3.Msgs.MsgDeleteUserGroupResponse> deleteUserGroup(
        desmos.subspaces.v3.Msgs.MsgDeleteUserGroup request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteUserGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddUserToUserGroup allows to add a specific user to a specific user group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.subspaces.v3.Msgs.MsgAddUserToUserGroupResponse> addUserToUserGroup(
        desmos.subspaces.v3.Msgs.MsgAddUserToUserGroup request) {
      return futureUnaryCall(
          getChannel().newCall(getAddUserToUserGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveUserFromUserGroup allows to remove a specific user from a specific
     * user group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.subspaces.v3.Msgs.MsgRemoveUserFromUserGroupResponse> removeUserFromUserGroup(
        desmos.subspaces.v3.Msgs.MsgRemoveUserFromUserGroup request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveUserFromUserGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetUserPermissions allows to set the permissions for a specific user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<desmos.subspaces.v3.Msgs.MsgSetUserPermissionsResponse> setUserPermissions(
        desmos.subspaces.v3.Msgs.MsgSetUserPermissions request) {
      return futureUnaryCall(
          getChannel().newCall(getSetUserPermissionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SUBSPACE = 0;
  private static final int METHODID_EDIT_SUBSPACE = 1;
  private static final int METHODID_DELETE_SUBSPACE = 2;
  private static final int METHODID_CREATE_SECTION = 3;
  private static final int METHODID_EDIT_SECTION = 4;
  private static final int METHODID_MOVE_SECTION = 5;
  private static final int METHODID_DELETE_SECTION = 6;
  private static final int METHODID_CREATE_USER_GROUP = 7;
  private static final int METHODID_EDIT_USER_GROUP = 8;
  private static final int METHODID_MOVE_USER_GROUP = 9;
  private static final int METHODID_SET_USER_GROUP_PERMISSIONS = 10;
  private static final int METHODID_DELETE_USER_GROUP = 11;
  private static final int METHODID_ADD_USER_TO_USER_GROUP = 12;
  private static final int METHODID_REMOVE_USER_FROM_USER_GROUP = 13;
  private static final int METHODID_SET_USER_PERMISSIONS = 14;

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
        case METHODID_CREATE_SUBSPACE:
          serviceImpl.createSubspace((desmos.subspaces.v3.Msgs.MsgCreateSubspace) request,
              (io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgCreateSubspaceResponse>) responseObserver);
          break;
        case METHODID_EDIT_SUBSPACE:
          serviceImpl.editSubspace((desmos.subspaces.v3.Msgs.MsgEditSubspace) request,
              (io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgEditSubspaceResponse>) responseObserver);
          break;
        case METHODID_DELETE_SUBSPACE:
          serviceImpl.deleteSubspace((desmos.subspaces.v3.Msgs.MsgDeleteSubspace) request,
              (io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgDeleteSubspaceResponse>) responseObserver);
          break;
        case METHODID_CREATE_SECTION:
          serviceImpl.createSection((desmos.subspaces.v3.Msgs.MsgCreateSection) request,
              (io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgCreateSectionResponse>) responseObserver);
          break;
        case METHODID_EDIT_SECTION:
          serviceImpl.editSection((desmos.subspaces.v3.Msgs.MsgEditSection) request,
              (io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgEditSectionResponse>) responseObserver);
          break;
        case METHODID_MOVE_SECTION:
          serviceImpl.moveSection((desmos.subspaces.v3.Msgs.MsgMoveSection) request,
              (io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgMoveSectionResponse>) responseObserver);
          break;
        case METHODID_DELETE_SECTION:
          serviceImpl.deleteSection((desmos.subspaces.v3.Msgs.MsgDeleteSection) request,
              (io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgDeleteSectionResponse>) responseObserver);
          break;
        case METHODID_CREATE_USER_GROUP:
          serviceImpl.createUserGroup((desmos.subspaces.v3.Msgs.MsgCreateUserGroup) request,
              (io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgCreateUserGroupResponse>) responseObserver);
          break;
        case METHODID_EDIT_USER_GROUP:
          serviceImpl.editUserGroup((desmos.subspaces.v3.Msgs.MsgEditUserGroup) request,
              (io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgEditUserGroupResponse>) responseObserver);
          break;
        case METHODID_MOVE_USER_GROUP:
          serviceImpl.moveUserGroup((desmos.subspaces.v3.Msgs.MsgMoveUserGroup) request,
              (io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgMoveUserGroupResponse>) responseObserver);
          break;
        case METHODID_SET_USER_GROUP_PERMISSIONS:
          serviceImpl.setUserGroupPermissions((desmos.subspaces.v3.Msgs.MsgSetUserGroupPermissions) request,
              (io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgSetUserGroupPermissionsResponse>) responseObserver);
          break;
        case METHODID_DELETE_USER_GROUP:
          serviceImpl.deleteUserGroup((desmos.subspaces.v3.Msgs.MsgDeleteUserGroup) request,
              (io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgDeleteUserGroupResponse>) responseObserver);
          break;
        case METHODID_ADD_USER_TO_USER_GROUP:
          serviceImpl.addUserToUserGroup((desmos.subspaces.v3.Msgs.MsgAddUserToUserGroup) request,
              (io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgAddUserToUserGroupResponse>) responseObserver);
          break;
        case METHODID_REMOVE_USER_FROM_USER_GROUP:
          serviceImpl.removeUserFromUserGroup((desmos.subspaces.v3.Msgs.MsgRemoveUserFromUserGroup) request,
              (io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgRemoveUserFromUserGroupResponse>) responseObserver);
          break;
        case METHODID_SET_USER_PERMISSIONS:
          serviceImpl.setUserPermissions((desmos.subspaces.v3.Msgs.MsgSetUserPermissions) request,
              (io.grpc.stub.StreamObserver<desmos.subspaces.v3.Msgs.MsgSetUserPermissionsResponse>) responseObserver);
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
      return desmos.subspaces.v3.Msgs.getDescriptor();
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
              .addMethod(getCreateSubspaceMethod())
              .addMethod(getEditSubspaceMethod())
              .addMethod(getDeleteSubspaceMethod())
              .addMethod(getCreateSectionMethod())
              .addMethod(getEditSectionMethod())
              .addMethod(getMoveSectionMethod())
              .addMethod(getDeleteSectionMethod())
              .addMethod(getCreateUserGroupMethod())
              .addMethod(getEditUserGroupMethod())
              .addMethod(getMoveUserGroupMethod())
              .addMethod(getSetUserGroupPermissionsMethod())
              .addMethod(getDeleteUserGroupMethod())
              .addMethod(getAddUserToUserGroupMethod())
              .addMethod(getRemoveUserFromUserGroupMethod())
              .addMethod(getSetUserPermissionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
