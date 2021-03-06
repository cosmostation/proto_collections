//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: desmos/profiles/v1beta1/msg_server.proto
//

//
// Copyright 2018, gRPC Authors All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
import GRPC
import NIO
import SwiftProtobuf


/// Msg defines the relationships Msg service.
///
/// Usage: instantiate `Desmos_Profiles_V1beta1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Desmos_Profiles_V1beta1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Desmos_Profiles_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func saveProfile(
    _ request: Desmos_Profiles_V1beta1_MsgSaveProfile,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Profiles_V1beta1_MsgSaveProfile, Desmos_Profiles_V1beta1_MsgSaveProfileResponse>

  func deleteProfile(
    _ request: Desmos_Profiles_V1beta1_MsgDeleteProfile,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Profiles_V1beta1_MsgDeleteProfile, Desmos_Profiles_V1beta1_MsgDeleteProfileResponse>

  func requestDTagTransfer(
    _ request: Desmos_Profiles_V1beta1_MsgRequestDTagTransfer,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Profiles_V1beta1_MsgRequestDTagTransfer, Desmos_Profiles_V1beta1_MsgRequestDTagTransferResponse>

  func cancelDTagTransferRequest(
    _ request: Desmos_Profiles_V1beta1_MsgCancelDTagTransferRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Profiles_V1beta1_MsgCancelDTagTransferRequest, Desmos_Profiles_V1beta1_MsgCancelDTagTransferRequestResponse>

  func acceptDTagTransferRequest(
    _ request: Desmos_Profiles_V1beta1_MsgAcceptDTagTransferRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Profiles_V1beta1_MsgAcceptDTagTransferRequest, Desmos_Profiles_V1beta1_MsgAcceptDTagTransferRequestResponse>

  func refuseDTagTransferRequest(
    _ request: Desmos_Profiles_V1beta1_MsgRefuseDTagTransferRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Profiles_V1beta1_MsgRefuseDTagTransferRequest, Desmos_Profiles_V1beta1_MsgRefuseDTagTransferRequestResponse>

  func createRelationship(
    _ request: Desmos_Profiles_V1beta1_MsgCreateRelationship,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Profiles_V1beta1_MsgCreateRelationship, Desmos_Profiles_V1beta1_MsgCreateRelationshipResponse>

  func deleteRelationship(
    _ request: Desmos_Profiles_V1beta1_MsgDeleteRelationship,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Profiles_V1beta1_MsgDeleteRelationship, Desmos_Profiles_V1beta1_MsgDeleteRelationshipResponse>

  func blockUser(
    _ request: Desmos_Profiles_V1beta1_MsgBlockUser,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Profiles_V1beta1_MsgBlockUser, Desmos_Profiles_V1beta1_MsgBlockUserResponse>

  func unblockUser(
    _ request: Desmos_Profiles_V1beta1_MsgUnblockUser,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Profiles_V1beta1_MsgUnblockUser, Desmos_Profiles_V1beta1_MsgUnblockUserResponse>

  func linkChainAccount(
    _ request: Desmos_Profiles_V1beta1_MsgLinkChainAccount,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Profiles_V1beta1_MsgLinkChainAccount, Desmos_Profiles_V1beta1_MsgLinkChainAccountResponse>

  func unlinkChainAccount(
    _ request: Desmos_Profiles_V1beta1_MsgUnlinkChainAccount,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Profiles_V1beta1_MsgUnlinkChainAccount, Desmos_Profiles_V1beta1_MsgUnlinkChainAccountResponse>

  func linkApplication(
    _ request: Desmos_Profiles_V1beta1_MsgLinkApplication,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Profiles_V1beta1_MsgLinkApplication, Desmos_Profiles_V1beta1_MsgLinkApplicationResponse>

  func unlinkApplication(
    _ request: Desmos_Profiles_V1beta1_MsgUnlinkApplication,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Profiles_V1beta1_MsgUnlinkApplication, Desmos_Profiles_V1beta1_MsgUnlinkApplicationResponse>
}

extension Desmos_Profiles_V1beta1_MsgClientProtocol {
  internal var serviceName: String {
    return "desmos.profiles.v1beta1.Msg"
  }

  /// SaveProfile defines the method to save a profile
  ///
  /// - Parameters:
  ///   - request: Request to send to SaveProfile.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func saveProfile(
    _ request: Desmos_Profiles_V1beta1_MsgSaveProfile,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Profiles_V1beta1_MsgSaveProfile, Desmos_Profiles_V1beta1_MsgSaveProfileResponse> {
    return self.makeUnaryCall(
      path: "/desmos.profiles.v1beta1.Msg/SaveProfile",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSaveProfileInterceptors() ?? []
    )
  }

  /// DeleteProfile defines the method to delete an existing profile
  ///
  /// - Parameters:
  ///   - request: Request to send to DeleteProfile.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func deleteProfile(
    _ request: Desmos_Profiles_V1beta1_MsgDeleteProfile,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Profiles_V1beta1_MsgDeleteProfile, Desmos_Profiles_V1beta1_MsgDeleteProfileResponse> {
    return self.makeUnaryCall(
      path: "/desmos.profiles.v1beta1.Msg/DeleteProfile",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeleteProfileInterceptors() ?? []
    )
  }

  /// RequestDTagTransfer defines the method to request another user to transfer
  /// their DTag to you
  ///
  /// - Parameters:
  ///   - request: Request to send to RequestDTagTransfer.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func requestDTagTransfer(
    _ request: Desmos_Profiles_V1beta1_MsgRequestDTagTransfer,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Profiles_V1beta1_MsgRequestDTagTransfer, Desmos_Profiles_V1beta1_MsgRequestDTagTransferResponse> {
    return self.makeUnaryCall(
      path: "/desmos.profiles.v1beta1.Msg/RequestDTagTransfer",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRequestDTagTransferInterceptors() ?? []
    )
  }

  /// CancelDTagTransferRequest defines the method to cancel an outgoing DTag
  /// transfer request
  ///
  /// - Parameters:
  ///   - request: Request to send to CancelDTagTransferRequest.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func cancelDTagTransferRequest(
    _ request: Desmos_Profiles_V1beta1_MsgCancelDTagTransferRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Profiles_V1beta1_MsgCancelDTagTransferRequest, Desmos_Profiles_V1beta1_MsgCancelDTagTransferRequestResponse> {
    return self.makeUnaryCall(
      path: "/desmos.profiles.v1beta1.Msg/CancelDTagTransferRequest",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCancelDTagTransferRequestInterceptors() ?? []
    )
  }

  /// AcceptDTagTransferRequest defines the method to accept an incoming DTag
  /// transfer request
  ///
  /// - Parameters:
  ///   - request: Request to send to AcceptDTagTransferRequest.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func acceptDTagTransferRequest(
    _ request: Desmos_Profiles_V1beta1_MsgAcceptDTagTransferRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Profiles_V1beta1_MsgAcceptDTagTransferRequest, Desmos_Profiles_V1beta1_MsgAcceptDTagTransferRequestResponse> {
    return self.makeUnaryCall(
      path: "/desmos.profiles.v1beta1.Msg/AcceptDTagTransferRequest",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAcceptDTagTransferRequestInterceptors() ?? []
    )
  }

  /// RefuseDTagTransferRequest defines the method to refuse an incoming DTag
  /// transfer request
  ///
  /// - Parameters:
  ///   - request: Request to send to RefuseDTagTransferRequest.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func refuseDTagTransferRequest(
    _ request: Desmos_Profiles_V1beta1_MsgRefuseDTagTransferRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Profiles_V1beta1_MsgRefuseDTagTransferRequest, Desmos_Profiles_V1beta1_MsgRefuseDTagTransferRequestResponse> {
    return self.makeUnaryCall(
      path: "/desmos.profiles.v1beta1.Msg/RefuseDTagTransferRequest",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRefuseDTagTransferRequestInterceptors() ?? []
    )
  }

  /// CreateRelationship defines a method for creating a new relationship
  ///
  /// - Parameters:
  ///   - request: Request to send to CreateRelationship.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func createRelationship(
    _ request: Desmos_Profiles_V1beta1_MsgCreateRelationship,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Profiles_V1beta1_MsgCreateRelationship, Desmos_Profiles_V1beta1_MsgCreateRelationshipResponse> {
    return self.makeUnaryCall(
      path: "/desmos.profiles.v1beta1.Msg/CreateRelationship",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateRelationshipInterceptors() ?? []
    )
  }

  /// DeleteRelationship defines a method for deleting a relationship
  ///
  /// - Parameters:
  ///   - request: Request to send to DeleteRelationship.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func deleteRelationship(
    _ request: Desmos_Profiles_V1beta1_MsgDeleteRelationship,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Profiles_V1beta1_MsgDeleteRelationship, Desmos_Profiles_V1beta1_MsgDeleteRelationshipResponse> {
    return self.makeUnaryCall(
      path: "/desmos.profiles.v1beta1.Msg/DeleteRelationship",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeleteRelationshipInterceptors() ?? []
    )
  }

  /// BlockUser defines a method for blocking a user
  ///
  /// - Parameters:
  ///   - request: Request to send to BlockUser.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func blockUser(
    _ request: Desmos_Profiles_V1beta1_MsgBlockUser,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Profiles_V1beta1_MsgBlockUser, Desmos_Profiles_V1beta1_MsgBlockUserResponse> {
    return self.makeUnaryCall(
      path: "/desmos.profiles.v1beta1.Msg/BlockUser",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBlockUserInterceptors() ?? []
    )
  }

  /// UnblockUser defines a method for unblocking a user
  ///
  /// - Parameters:
  ///   - request: Request to send to UnblockUser.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func unblockUser(
    _ request: Desmos_Profiles_V1beta1_MsgUnblockUser,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Profiles_V1beta1_MsgUnblockUser, Desmos_Profiles_V1beta1_MsgUnblockUserResponse> {
    return self.makeUnaryCall(
      path: "/desmos.profiles.v1beta1.Msg/UnblockUser",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUnblockUserInterceptors() ?? []
    )
  }

  /// LinkChainAccount defines a method to link an external chain account to a
  /// profile
  ///
  /// - Parameters:
  ///   - request: Request to send to LinkChainAccount.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func linkChainAccount(
    _ request: Desmos_Profiles_V1beta1_MsgLinkChainAccount,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Profiles_V1beta1_MsgLinkChainAccount, Desmos_Profiles_V1beta1_MsgLinkChainAccountResponse> {
    return self.makeUnaryCall(
      path: "/desmos.profiles.v1beta1.Msg/LinkChainAccount",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeLinkChainAccountInterceptors() ?? []
    )
  }

  /// UnlinkChainAccount defines a method to unlink an external chain account
  /// from a profile
  ///
  /// - Parameters:
  ///   - request: Request to send to UnlinkChainAccount.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func unlinkChainAccount(
    _ request: Desmos_Profiles_V1beta1_MsgUnlinkChainAccount,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Profiles_V1beta1_MsgUnlinkChainAccount, Desmos_Profiles_V1beta1_MsgUnlinkChainAccountResponse> {
    return self.makeUnaryCall(
      path: "/desmos.profiles.v1beta1.Msg/UnlinkChainAccount",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUnlinkChainAccountInterceptors() ?? []
    )
  }

  /// LinkApplication defines a method to create a centralized application
  /// link
  ///
  /// - Parameters:
  ///   - request: Request to send to LinkApplication.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func linkApplication(
    _ request: Desmos_Profiles_V1beta1_MsgLinkApplication,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Profiles_V1beta1_MsgLinkApplication, Desmos_Profiles_V1beta1_MsgLinkApplicationResponse> {
    return self.makeUnaryCall(
      path: "/desmos.profiles.v1beta1.Msg/LinkApplication",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeLinkApplicationInterceptors() ?? []
    )
  }

  /// UnlinkApplication defines a method to remove a centralized application
  ///
  /// - Parameters:
  ///   - request: Request to send to UnlinkApplication.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func unlinkApplication(
    _ request: Desmos_Profiles_V1beta1_MsgUnlinkApplication,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Profiles_V1beta1_MsgUnlinkApplication, Desmos_Profiles_V1beta1_MsgUnlinkApplicationResponse> {
    return self.makeUnaryCall(
      path: "/desmos.profiles.v1beta1.Msg/UnlinkApplication",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUnlinkApplicationInterceptors() ?? []
    )
  }
}

internal protocol Desmos_Profiles_V1beta1_MsgClientInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when invoking 'saveProfile'.
  func makeSaveProfileInterceptors() -> [ClientInterceptor<Desmos_Profiles_V1beta1_MsgSaveProfile, Desmos_Profiles_V1beta1_MsgSaveProfileResponse>]

  /// - Returns: Interceptors to use when invoking 'deleteProfile'.
  func makeDeleteProfileInterceptors() -> [ClientInterceptor<Desmos_Profiles_V1beta1_MsgDeleteProfile, Desmos_Profiles_V1beta1_MsgDeleteProfileResponse>]

  /// - Returns: Interceptors to use when invoking 'requestDTagTransfer'.
  func makeRequestDTagTransferInterceptors() -> [ClientInterceptor<Desmos_Profiles_V1beta1_MsgRequestDTagTransfer, Desmos_Profiles_V1beta1_MsgRequestDTagTransferResponse>]

  /// - Returns: Interceptors to use when invoking 'cancelDTagTransferRequest'.
  func makeCancelDTagTransferRequestInterceptors() -> [ClientInterceptor<Desmos_Profiles_V1beta1_MsgCancelDTagTransferRequest, Desmos_Profiles_V1beta1_MsgCancelDTagTransferRequestResponse>]

  /// - Returns: Interceptors to use when invoking 'acceptDTagTransferRequest'.
  func makeAcceptDTagTransferRequestInterceptors() -> [ClientInterceptor<Desmos_Profiles_V1beta1_MsgAcceptDTagTransferRequest, Desmos_Profiles_V1beta1_MsgAcceptDTagTransferRequestResponse>]

  /// - Returns: Interceptors to use when invoking 'refuseDTagTransferRequest'.
  func makeRefuseDTagTransferRequestInterceptors() -> [ClientInterceptor<Desmos_Profiles_V1beta1_MsgRefuseDTagTransferRequest, Desmos_Profiles_V1beta1_MsgRefuseDTagTransferRequestResponse>]

  /// - Returns: Interceptors to use when invoking 'createRelationship'.
  func makeCreateRelationshipInterceptors() -> [ClientInterceptor<Desmos_Profiles_V1beta1_MsgCreateRelationship, Desmos_Profiles_V1beta1_MsgCreateRelationshipResponse>]

  /// - Returns: Interceptors to use when invoking 'deleteRelationship'.
  func makeDeleteRelationshipInterceptors() -> [ClientInterceptor<Desmos_Profiles_V1beta1_MsgDeleteRelationship, Desmos_Profiles_V1beta1_MsgDeleteRelationshipResponse>]

  /// - Returns: Interceptors to use when invoking 'blockUser'.
  func makeBlockUserInterceptors() -> [ClientInterceptor<Desmos_Profiles_V1beta1_MsgBlockUser, Desmos_Profiles_V1beta1_MsgBlockUserResponse>]

  /// - Returns: Interceptors to use when invoking 'unblockUser'.
  func makeUnblockUserInterceptors() -> [ClientInterceptor<Desmos_Profiles_V1beta1_MsgUnblockUser, Desmos_Profiles_V1beta1_MsgUnblockUserResponse>]

  /// - Returns: Interceptors to use when invoking 'linkChainAccount'.
  func makeLinkChainAccountInterceptors() -> [ClientInterceptor<Desmos_Profiles_V1beta1_MsgLinkChainAccount, Desmos_Profiles_V1beta1_MsgLinkChainAccountResponse>]

  /// - Returns: Interceptors to use when invoking 'unlinkChainAccount'.
  func makeUnlinkChainAccountInterceptors() -> [ClientInterceptor<Desmos_Profiles_V1beta1_MsgUnlinkChainAccount, Desmos_Profiles_V1beta1_MsgUnlinkChainAccountResponse>]

  /// - Returns: Interceptors to use when invoking 'linkApplication'.
  func makeLinkApplicationInterceptors() -> [ClientInterceptor<Desmos_Profiles_V1beta1_MsgLinkApplication, Desmos_Profiles_V1beta1_MsgLinkApplicationResponse>]

  /// - Returns: Interceptors to use when invoking 'unlinkApplication'.
  func makeUnlinkApplicationInterceptors() -> [ClientInterceptor<Desmos_Profiles_V1beta1_MsgUnlinkApplication, Desmos_Profiles_V1beta1_MsgUnlinkApplicationResponse>]
}

internal final class Desmos_Profiles_V1beta1_MsgClient: Desmos_Profiles_V1beta1_MsgClientProtocol {
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Desmos_Profiles_V1beta1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the desmos.profiles.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Desmos_Profiles_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the relationships Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Desmos_Profiles_V1beta1_MsgProvider: CallHandlerProvider {
  var interceptors: Desmos_Profiles_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  /// SaveProfile defines the method to save a profile
  func saveProfile(request: Desmos_Profiles_V1beta1_MsgSaveProfile, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Profiles_V1beta1_MsgSaveProfileResponse>

  /// DeleteProfile defines the method to delete an existing profile
  func deleteProfile(request: Desmos_Profiles_V1beta1_MsgDeleteProfile, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Profiles_V1beta1_MsgDeleteProfileResponse>

  /// RequestDTagTransfer defines the method to request another user to transfer
  /// their DTag to you
  func requestDTagTransfer(request: Desmos_Profiles_V1beta1_MsgRequestDTagTransfer, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Profiles_V1beta1_MsgRequestDTagTransferResponse>

  /// CancelDTagTransferRequest defines the method to cancel an outgoing DTag
  /// transfer request
  func cancelDTagTransferRequest(request: Desmos_Profiles_V1beta1_MsgCancelDTagTransferRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Profiles_V1beta1_MsgCancelDTagTransferRequestResponse>

  /// AcceptDTagTransferRequest defines the method to accept an incoming DTag
  /// transfer request
  func acceptDTagTransferRequest(request: Desmos_Profiles_V1beta1_MsgAcceptDTagTransferRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Profiles_V1beta1_MsgAcceptDTagTransferRequestResponse>

  /// RefuseDTagTransferRequest defines the method to refuse an incoming DTag
  /// transfer request
  func refuseDTagTransferRequest(request: Desmos_Profiles_V1beta1_MsgRefuseDTagTransferRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Profiles_V1beta1_MsgRefuseDTagTransferRequestResponse>

  /// CreateRelationship defines a method for creating a new relationship
  func createRelationship(request: Desmos_Profiles_V1beta1_MsgCreateRelationship, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Profiles_V1beta1_MsgCreateRelationshipResponse>

  /// DeleteRelationship defines a method for deleting a relationship
  func deleteRelationship(request: Desmos_Profiles_V1beta1_MsgDeleteRelationship, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Profiles_V1beta1_MsgDeleteRelationshipResponse>

  /// BlockUser defines a method for blocking a user
  func blockUser(request: Desmos_Profiles_V1beta1_MsgBlockUser, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Profiles_V1beta1_MsgBlockUserResponse>

  /// UnblockUser defines a method for unblocking a user
  func unblockUser(request: Desmos_Profiles_V1beta1_MsgUnblockUser, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Profiles_V1beta1_MsgUnblockUserResponse>

  /// LinkChainAccount defines a method to link an external chain account to a
  /// profile
  func linkChainAccount(request: Desmos_Profiles_V1beta1_MsgLinkChainAccount, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Profiles_V1beta1_MsgLinkChainAccountResponse>

  /// UnlinkChainAccount defines a method to unlink an external chain account
  /// from a profile
  func unlinkChainAccount(request: Desmos_Profiles_V1beta1_MsgUnlinkChainAccount, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Profiles_V1beta1_MsgUnlinkChainAccountResponse>

  /// LinkApplication defines a method to create a centralized application
  /// link
  func linkApplication(request: Desmos_Profiles_V1beta1_MsgLinkApplication, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Profiles_V1beta1_MsgLinkApplicationResponse>

  /// UnlinkApplication defines a method to remove a centralized application
  func unlinkApplication(request: Desmos_Profiles_V1beta1_MsgUnlinkApplication, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Profiles_V1beta1_MsgUnlinkApplicationResponse>
}

extension Desmos_Profiles_V1beta1_MsgProvider {
  internal var serviceName: Substring { return "desmos.profiles.v1beta1.Msg" }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "SaveProfile":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Profiles_V1beta1_MsgSaveProfile>(),
        responseSerializer: ProtobufSerializer<Desmos_Profiles_V1beta1_MsgSaveProfileResponse>(),
        interceptors: self.interceptors?.makeSaveProfileInterceptors() ?? [],
        userFunction: self.saveProfile(request:context:)
      )

    case "DeleteProfile":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Profiles_V1beta1_MsgDeleteProfile>(),
        responseSerializer: ProtobufSerializer<Desmos_Profiles_V1beta1_MsgDeleteProfileResponse>(),
        interceptors: self.interceptors?.makeDeleteProfileInterceptors() ?? [],
        userFunction: self.deleteProfile(request:context:)
      )

    case "RequestDTagTransfer":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Profiles_V1beta1_MsgRequestDTagTransfer>(),
        responseSerializer: ProtobufSerializer<Desmos_Profiles_V1beta1_MsgRequestDTagTransferResponse>(),
        interceptors: self.interceptors?.makeRequestDTagTransferInterceptors() ?? [],
        userFunction: self.requestDTagTransfer(request:context:)
      )

    case "CancelDTagTransferRequest":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Profiles_V1beta1_MsgCancelDTagTransferRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Profiles_V1beta1_MsgCancelDTagTransferRequestResponse>(),
        interceptors: self.interceptors?.makeCancelDTagTransferRequestInterceptors() ?? [],
        userFunction: self.cancelDTagTransferRequest(request:context:)
      )

    case "AcceptDTagTransferRequest":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Profiles_V1beta1_MsgAcceptDTagTransferRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Profiles_V1beta1_MsgAcceptDTagTransferRequestResponse>(),
        interceptors: self.interceptors?.makeAcceptDTagTransferRequestInterceptors() ?? [],
        userFunction: self.acceptDTagTransferRequest(request:context:)
      )

    case "RefuseDTagTransferRequest":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Profiles_V1beta1_MsgRefuseDTagTransferRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Profiles_V1beta1_MsgRefuseDTagTransferRequestResponse>(),
        interceptors: self.interceptors?.makeRefuseDTagTransferRequestInterceptors() ?? [],
        userFunction: self.refuseDTagTransferRequest(request:context:)
      )

    case "CreateRelationship":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Profiles_V1beta1_MsgCreateRelationship>(),
        responseSerializer: ProtobufSerializer<Desmos_Profiles_V1beta1_MsgCreateRelationshipResponse>(),
        interceptors: self.interceptors?.makeCreateRelationshipInterceptors() ?? [],
        userFunction: self.createRelationship(request:context:)
      )

    case "DeleteRelationship":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Profiles_V1beta1_MsgDeleteRelationship>(),
        responseSerializer: ProtobufSerializer<Desmos_Profiles_V1beta1_MsgDeleteRelationshipResponse>(),
        interceptors: self.interceptors?.makeDeleteRelationshipInterceptors() ?? [],
        userFunction: self.deleteRelationship(request:context:)
      )

    case "BlockUser":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Profiles_V1beta1_MsgBlockUser>(),
        responseSerializer: ProtobufSerializer<Desmos_Profiles_V1beta1_MsgBlockUserResponse>(),
        interceptors: self.interceptors?.makeBlockUserInterceptors() ?? [],
        userFunction: self.blockUser(request:context:)
      )

    case "UnblockUser":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Profiles_V1beta1_MsgUnblockUser>(),
        responseSerializer: ProtobufSerializer<Desmos_Profiles_V1beta1_MsgUnblockUserResponse>(),
        interceptors: self.interceptors?.makeUnblockUserInterceptors() ?? [],
        userFunction: self.unblockUser(request:context:)
      )

    case "LinkChainAccount":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Profiles_V1beta1_MsgLinkChainAccount>(),
        responseSerializer: ProtobufSerializer<Desmos_Profiles_V1beta1_MsgLinkChainAccountResponse>(),
        interceptors: self.interceptors?.makeLinkChainAccountInterceptors() ?? [],
        userFunction: self.linkChainAccount(request:context:)
      )

    case "UnlinkChainAccount":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Profiles_V1beta1_MsgUnlinkChainAccount>(),
        responseSerializer: ProtobufSerializer<Desmos_Profiles_V1beta1_MsgUnlinkChainAccountResponse>(),
        interceptors: self.interceptors?.makeUnlinkChainAccountInterceptors() ?? [],
        userFunction: self.unlinkChainAccount(request:context:)
      )

    case "LinkApplication":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Profiles_V1beta1_MsgLinkApplication>(),
        responseSerializer: ProtobufSerializer<Desmos_Profiles_V1beta1_MsgLinkApplicationResponse>(),
        interceptors: self.interceptors?.makeLinkApplicationInterceptors() ?? [],
        userFunction: self.linkApplication(request:context:)
      )

    case "UnlinkApplication":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Profiles_V1beta1_MsgUnlinkApplication>(),
        responseSerializer: ProtobufSerializer<Desmos_Profiles_V1beta1_MsgUnlinkApplicationResponse>(),
        interceptors: self.interceptors?.makeUnlinkApplicationInterceptors() ?? [],
        userFunction: self.unlinkApplication(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Desmos_Profiles_V1beta1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'saveProfile'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSaveProfileInterceptors() -> [ServerInterceptor<Desmos_Profiles_V1beta1_MsgSaveProfile, Desmos_Profiles_V1beta1_MsgSaveProfileResponse>]

  /// - Returns: Interceptors to use when handling 'deleteProfile'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDeleteProfileInterceptors() -> [ServerInterceptor<Desmos_Profiles_V1beta1_MsgDeleteProfile, Desmos_Profiles_V1beta1_MsgDeleteProfileResponse>]

  /// - Returns: Interceptors to use when handling 'requestDTagTransfer'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRequestDTagTransferInterceptors() -> [ServerInterceptor<Desmos_Profiles_V1beta1_MsgRequestDTagTransfer, Desmos_Profiles_V1beta1_MsgRequestDTagTransferResponse>]

  /// - Returns: Interceptors to use when handling 'cancelDTagTransferRequest'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCancelDTagTransferRequestInterceptors() -> [ServerInterceptor<Desmos_Profiles_V1beta1_MsgCancelDTagTransferRequest, Desmos_Profiles_V1beta1_MsgCancelDTagTransferRequestResponse>]

  /// - Returns: Interceptors to use when handling 'acceptDTagTransferRequest'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAcceptDTagTransferRequestInterceptors() -> [ServerInterceptor<Desmos_Profiles_V1beta1_MsgAcceptDTagTransferRequest, Desmos_Profiles_V1beta1_MsgAcceptDTagTransferRequestResponse>]

  /// - Returns: Interceptors to use when handling 'refuseDTagTransferRequest'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRefuseDTagTransferRequestInterceptors() -> [ServerInterceptor<Desmos_Profiles_V1beta1_MsgRefuseDTagTransferRequest, Desmos_Profiles_V1beta1_MsgRefuseDTagTransferRequestResponse>]

  /// - Returns: Interceptors to use when handling 'createRelationship'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCreateRelationshipInterceptors() -> [ServerInterceptor<Desmos_Profiles_V1beta1_MsgCreateRelationship, Desmos_Profiles_V1beta1_MsgCreateRelationshipResponse>]

  /// - Returns: Interceptors to use when handling 'deleteRelationship'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDeleteRelationshipInterceptors() -> [ServerInterceptor<Desmos_Profiles_V1beta1_MsgDeleteRelationship, Desmos_Profiles_V1beta1_MsgDeleteRelationshipResponse>]

  /// - Returns: Interceptors to use when handling 'blockUser'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeBlockUserInterceptors() -> [ServerInterceptor<Desmos_Profiles_V1beta1_MsgBlockUser, Desmos_Profiles_V1beta1_MsgBlockUserResponse>]

  /// - Returns: Interceptors to use when handling 'unblockUser'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeUnblockUserInterceptors() -> [ServerInterceptor<Desmos_Profiles_V1beta1_MsgUnblockUser, Desmos_Profiles_V1beta1_MsgUnblockUserResponse>]

  /// - Returns: Interceptors to use when handling 'linkChainAccount'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeLinkChainAccountInterceptors() -> [ServerInterceptor<Desmos_Profiles_V1beta1_MsgLinkChainAccount, Desmos_Profiles_V1beta1_MsgLinkChainAccountResponse>]

  /// - Returns: Interceptors to use when handling 'unlinkChainAccount'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeUnlinkChainAccountInterceptors() -> [ServerInterceptor<Desmos_Profiles_V1beta1_MsgUnlinkChainAccount, Desmos_Profiles_V1beta1_MsgUnlinkChainAccountResponse>]

  /// - Returns: Interceptors to use when handling 'linkApplication'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeLinkApplicationInterceptors() -> [ServerInterceptor<Desmos_Profiles_V1beta1_MsgLinkApplication, Desmos_Profiles_V1beta1_MsgLinkApplicationResponse>]

  /// - Returns: Interceptors to use when handling 'unlinkApplication'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeUnlinkApplicationInterceptors() -> [ServerInterceptor<Desmos_Profiles_V1beta1_MsgUnlinkApplication, Desmos_Profiles_V1beta1_MsgUnlinkApplicationResponse>]
}
