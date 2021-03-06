//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: regen/group/v1alpha1/query.proto
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


/// Query is the regen.group.v1alpha1 Query service.
///
/// Usage: instantiate `Regen_Group_V1alpha1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Regen_Group_V1alpha1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Regen_Group_V1alpha1_QueryClientInterceptorFactoryProtocol? { get }

  func groupInfo(
    _ request: Regen_Group_V1alpha1_QueryGroupInfoRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Regen_Group_V1alpha1_QueryGroupInfoRequest, Regen_Group_V1alpha1_QueryGroupInfoResponse>

  func groupAccountInfo(
    _ request: Regen_Group_V1alpha1_QueryGroupAccountInfoRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Regen_Group_V1alpha1_QueryGroupAccountInfoRequest, Regen_Group_V1alpha1_QueryGroupAccountInfoResponse>

  func groupMembers(
    _ request: Regen_Group_V1alpha1_QueryGroupMembersRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Regen_Group_V1alpha1_QueryGroupMembersRequest, Regen_Group_V1alpha1_QueryGroupMembersResponse>

  func groupsByAdmin(
    _ request: Regen_Group_V1alpha1_QueryGroupsByAdminRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Regen_Group_V1alpha1_QueryGroupsByAdminRequest, Regen_Group_V1alpha1_QueryGroupsByAdminResponse>

  func groupAccountsByGroup(
    _ request: Regen_Group_V1alpha1_QueryGroupAccountsByGroupRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Regen_Group_V1alpha1_QueryGroupAccountsByGroupRequest, Regen_Group_V1alpha1_QueryGroupAccountsByGroupResponse>

  func groupAccountsByAdmin(
    _ request: Regen_Group_V1alpha1_QueryGroupAccountsByAdminRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Regen_Group_V1alpha1_QueryGroupAccountsByAdminRequest, Regen_Group_V1alpha1_QueryGroupAccountsByAdminResponse>

  func proposal(
    _ request: Regen_Group_V1alpha1_QueryProposalRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Regen_Group_V1alpha1_QueryProposalRequest, Regen_Group_V1alpha1_QueryProposalResponse>

  func proposalsByGroupAccount(
    _ request: Regen_Group_V1alpha1_QueryProposalsByGroupAccountRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Regen_Group_V1alpha1_QueryProposalsByGroupAccountRequest, Regen_Group_V1alpha1_QueryProposalsByGroupAccountResponse>

  func voteByProposalVoter(
    _ request: Regen_Group_V1alpha1_QueryVoteByProposalVoterRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Regen_Group_V1alpha1_QueryVoteByProposalVoterRequest, Regen_Group_V1alpha1_QueryVoteByProposalVoterResponse>

  func votesByProposal(
    _ request: Regen_Group_V1alpha1_QueryVotesByProposalRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Regen_Group_V1alpha1_QueryVotesByProposalRequest, Regen_Group_V1alpha1_QueryVotesByProposalResponse>

  func votesByVoter(
    _ request: Regen_Group_V1alpha1_QueryVotesByVoterRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Regen_Group_V1alpha1_QueryVotesByVoterRequest, Regen_Group_V1alpha1_QueryVotesByVoterResponse>
}

extension Regen_Group_V1alpha1_QueryClientProtocol {
  internal var serviceName: String {
    return "regen.group.v1alpha1.Query"
  }

  /// GroupInfo queries group info based on group id.
  ///
  /// - Parameters:
  ///   - request: Request to send to GroupInfo.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func groupInfo(
    _ request: Regen_Group_V1alpha1_QueryGroupInfoRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Regen_Group_V1alpha1_QueryGroupInfoRequest, Regen_Group_V1alpha1_QueryGroupInfoResponse> {
    return self.makeUnaryCall(
      path: "/regen.group.v1alpha1.Query/GroupInfo",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeGroupInfoInterceptors() ?? []
    )
  }

  /// GroupAccountInfo queries group account info based on group account address.
  ///
  /// - Parameters:
  ///   - request: Request to send to GroupAccountInfo.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func groupAccountInfo(
    _ request: Regen_Group_V1alpha1_QueryGroupAccountInfoRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Regen_Group_V1alpha1_QueryGroupAccountInfoRequest, Regen_Group_V1alpha1_QueryGroupAccountInfoResponse> {
    return self.makeUnaryCall(
      path: "/regen.group.v1alpha1.Query/GroupAccountInfo",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeGroupAccountInfoInterceptors() ?? []
    )
  }

  /// GroupMembers queries members of a group
  ///
  /// - Parameters:
  ///   - request: Request to send to GroupMembers.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func groupMembers(
    _ request: Regen_Group_V1alpha1_QueryGroupMembersRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Regen_Group_V1alpha1_QueryGroupMembersRequest, Regen_Group_V1alpha1_QueryGroupMembersResponse> {
    return self.makeUnaryCall(
      path: "/regen.group.v1alpha1.Query/GroupMembers",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeGroupMembersInterceptors() ?? []
    )
  }

  /// GroupsByAdmin queries groups by admin address.
  ///
  /// - Parameters:
  ///   - request: Request to send to GroupsByAdmin.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func groupsByAdmin(
    _ request: Regen_Group_V1alpha1_QueryGroupsByAdminRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Regen_Group_V1alpha1_QueryGroupsByAdminRequest, Regen_Group_V1alpha1_QueryGroupsByAdminResponse> {
    return self.makeUnaryCall(
      path: "/regen.group.v1alpha1.Query/GroupsByAdmin",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeGroupsByAdminInterceptors() ?? []
    )
  }

  /// GroupAccountsByGroup queries group accounts by group id.
  ///
  /// - Parameters:
  ///   - request: Request to send to GroupAccountsByGroup.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func groupAccountsByGroup(
    _ request: Regen_Group_V1alpha1_QueryGroupAccountsByGroupRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Regen_Group_V1alpha1_QueryGroupAccountsByGroupRequest, Regen_Group_V1alpha1_QueryGroupAccountsByGroupResponse> {
    return self.makeUnaryCall(
      path: "/regen.group.v1alpha1.Query/GroupAccountsByGroup",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeGroupAccountsByGroupInterceptors() ?? []
    )
  }

  /// GroupsByAdmin queries group accounts by admin address.
  ///
  /// - Parameters:
  ///   - request: Request to send to GroupAccountsByAdmin.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func groupAccountsByAdmin(
    _ request: Regen_Group_V1alpha1_QueryGroupAccountsByAdminRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Regen_Group_V1alpha1_QueryGroupAccountsByAdminRequest, Regen_Group_V1alpha1_QueryGroupAccountsByAdminResponse> {
    return self.makeUnaryCall(
      path: "/regen.group.v1alpha1.Query/GroupAccountsByAdmin",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeGroupAccountsByAdminInterceptors() ?? []
    )
  }

  /// Proposal queries a proposal based on proposal id.
  ///
  /// - Parameters:
  ///   - request: Request to send to Proposal.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func proposal(
    _ request: Regen_Group_V1alpha1_QueryProposalRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Regen_Group_V1alpha1_QueryProposalRequest, Regen_Group_V1alpha1_QueryProposalResponse> {
    return self.makeUnaryCall(
      path: "/regen.group.v1alpha1.Query/Proposal",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeProposalInterceptors() ?? []
    )
  }

  /// ProposalsByGroupAccount queries proposals based on group account address.
  ///
  /// - Parameters:
  ///   - request: Request to send to ProposalsByGroupAccount.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func proposalsByGroupAccount(
    _ request: Regen_Group_V1alpha1_QueryProposalsByGroupAccountRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Regen_Group_V1alpha1_QueryProposalsByGroupAccountRequest, Regen_Group_V1alpha1_QueryProposalsByGroupAccountResponse> {
    return self.makeUnaryCall(
      path: "/regen.group.v1alpha1.Query/ProposalsByGroupAccount",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeProposalsByGroupAccountInterceptors() ?? []
    )
  }

  /// VoteByProposalVoter queries a vote by proposal id and voter.
  ///
  /// - Parameters:
  ///   - request: Request to send to VoteByProposalVoter.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func voteByProposalVoter(
    _ request: Regen_Group_V1alpha1_QueryVoteByProposalVoterRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Regen_Group_V1alpha1_QueryVoteByProposalVoterRequest, Regen_Group_V1alpha1_QueryVoteByProposalVoterResponse> {
    return self.makeUnaryCall(
      path: "/regen.group.v1alpha1.Query/VoteByProposalVoter",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeVoteByProposalVoterInterceptors() ?? []
    )
  }

  /// VotesByProposal queries a vote by proposal.
  ///
  /// - Parameters:
  ///   - request: Request to send to VotesByProposal.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func votesByProposal(
    _ request: Regen_Group_V1alpha1_QueryVotesByProposalRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Regen_Group_V1alpha1_QueryVotesByProposalRequest, Regen_Group_V1alpha1_QueryVotesByProposalResponse> {
    return self.makeUnaryCall(
      path: "/regen.group.v1alpha1.Query/VotesByProposal",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeVotesByProposalInterceptors() ?? []
    )
  }

  /// VotesByVoter queries a vote by voter.
  ///
  /// - Parameters:
  ///   - request: Request to send to VotesByVoter.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func votesByVoter(
    _ request: Regen_Group_V1alpha1_QueryVotesByVoterRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Regen_Group_V1alpha1_QueryVotesByVoterRequest, Regen_Group_V1alpha1_QueryVotesByVoterResponse> {
    return self.makeUnaryCall(
      path: "/regen.group.v1alpha1.Query/VotesByVoter",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeVotesByVoterInterceptors() ?? []
    )
  }
}

internal protocol Regen_Group_V1alpha1_QueryClientInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when invoking 'groupInfo'.
  func makeGroupInfoInterceptors() -> [ClientInterceptor<Regen_Group_V1alpha1_QueryGroupInfoRequest, Regen_Group_V1alpha1_QueryGroupInfoResponse>]

  /// - Returns: Interceptors to use when invoking 'groupAccountInfo'.
  func makeGroupAccountInfoInterceptors() -> [ClientInterceptor<Regen_Group_V1alpha1_QueryGroupAccountInfoRequest, Regen_Group_V1alpha1_QueryGroupAccountInfoResponse>]

  /// - Returns: Interceptors to use when invoking 'groupMembers'.
  func makeGroupMembersInterceptors() -> [ClientInterceptor<Regen_Group_V1alpha1_QueryGroupMembersRequest, Regen_Group_V1alpha1_QueryGroupMembersResponse>]

  /// - Returns: Interceptors to use when invoking 'groupsByAdmin'.
  func makeGroupsByAdminInterceptors() -> [ClientInterceptor<Regen_Group_V1alpha1_QueryGroupsByAdminRequest, Regen_Group_V1alpha1_QueryGroupsByAdminResponse>]

  /// - Returns: Interceptors to use when invoking 'groupAccountsByGroup'.
  func makeGroupAccountsByGroupInterceptors() -> [ClientInterceptor<Regen_Group_V1alpha1_QueryGroupAccountsByGroupRequest, Regen_Group_V1alpha1_QueryGroupAccountsByGroupResponse>]

  /// - Returns: Interceptors to use when invoking 'groupAccountsByAdmin'.
  func makeGroupAccountsByAdminInterceptors() -> [ClientInterceptor<Regen_Group_V1alpha1_QueryGroupAccountsByAdminRequest, Regen_Group_V1alpha1_QueryGroupAccountsByAdminResponse>]

  /// - Returns: Interceptors to use when invoking 'proposal'.
  func makeProposalInterceptors() -> [ClientInterceptor<Regen_Group_V1alpha1_QueryProposalRequest, Regen_Group_V1alpha1_QueryProposalResponse>]

  /// - Returns: Interceptors to use when invoking 'proposalsByGroupAccount'.
  func makeProposalsByGroupAccountInterceptors() -> [ClientInterceptor<Regen_Group_V1alpha1_QueryProposalsByGroupAccountRequest, Regen_Group_V1alpha1_QueryProposalsByGroupAccountResponse>]

  /// - Returns: Interceptors to use when invoking 'voteByProposalVoter'.
  func makeVoteByProposalVoterInterceptors() -> [ClientInterceptor<Regen_Group_V1alpha1_QueryVoteByProposalVoterRequest, Regen_Group_V1alpha1_QueryVoteByProposalVoterResponse>]

  /// - Returns: Interceptors to use when invoking 'votesByProposal'.
  func makeVotesByProposalInterceptors() -> [ClientInterceptor<Regen_Group_V1alpha1_QueryVotesByProposalRequest, Regen_Group_V1alpha1_QueryVotesByProposalResponse>]

  /// - Returns: Interceptors to use when invoking 'votesByVoter'.
  func makeVotesByVoterInterceptors() -> [ClientInterceptor<Regen_Group_V1alpha1_QueryVotesByVoterRequest, Regen_Group_V1alpha1_QueryVotesByVoterResponse>]
}

internal final class Regen_Group_V1alpha1_QueryClient: Regen_Group_V1alpha1_QueryClientProtocol {
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Regen_Group_V1alpha1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the regen.group.v1alpha1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Regen_Group_V1alpha1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query is the regen.group.v1alpha1 Query service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Regen_Group_V1alpha1_QueryProvider: CallHandlerProvider {
  var interceptors: Regen_Group_V1alpha1_QueryServerInterceptorFactoryProtocol? { get }

  /// GroupInfo queries group info based on group id.
  func groupInfo(request: Regen_Group_V1alpha1_QueryGroupInfoRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Regen_Group_V1alpha1_QueryGroupInfoResponse>

  /// GroupAccountInfo queries group account info based on group account address.
  func groupAccountInfo(request: Regen_Group_V1alpha1_QueryGroupAccountInfoRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Regen_Group_V1alpha1_QueryGroupAccountInfoResponse>

  /// GroupMembers queries members of a group
  func groupMembers(request: Regen_Group_V1alpha1_QueryGroupMembersRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Regen_Group_V1alpha1_QueryGroupMembersResponse>

  /// GroupsByAdmin queries groups by admin address.
  func groupsByAdmin(request: Regen_Group_V1alpha1_QueryGroupsByAdminRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Regen_Group_V1alpha1_QueryGroupsByAdminResponse>

  /// GroupAccountsByGroup queries group accounts by group id.
  func groupAccountsByGroup(request: Regen_Group_V1alpha1_QueryGroupAccountsByGroupRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Regen_Group_V1alpha1_QueryGroupAccountsByGroupResponse>

  /// GroupsByAdmin queries group accounts by admin address.
  func groupAccountsByAdmin(request: Regen_Group_V1alpha1_QueryGroupAccountsByAdminRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Regen_Group_V1alpha1_QueryGroupAccountsByAdminResponse>

  /// Proposal queries a proposal based on proposal id.
  func proposal(request: Regen_Group_V1alpha1_QueryProposalRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Regen_Group_V1alpha1_QueryProposalResponse>

  /// ProposalsByGroupAccount queries proposals based on group account address.
  func proposalsByGroupAccount(request: Regen_Group_V1alpha1_QueryProposalsByGroupAccountRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Regen_Group_V1alpha1_QueryProposalsByGroupAccountResponse>

  /// VoteByProposalVoter queries a vote by proposal id and voter.
  func voteByProposalVoter(request: Regen_Group_V1alpha1_QueryVoteByProposalVoterRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Regen_Group_V1alpha1_QueryVoteByProposalVoterResponse>

  /// VotesByProposal queries a vote by proposal.
  func votesByProposal(request: Regen_Group_V1alpha1_QueryVotesByProposalRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Regen_Group_V1alpha1_QueryVotesByProposalResponse>

  /// VotesByVoter queries a vote by voter.
  func votesByVoter(request: Regen_Group_V1alpha1_QueryVotesByVoterRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Regen_Group_V1alpha1_QueryVotesByVoterResponse>
}

extension Regen_Group_V1alpha1_QueryProvider {
  internal var serviceName: Substring { return "regen.group.v1alpha1.Query" }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "GroupInfo":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Regen_Group_V1alpha1_QueryGroupInfoRequest>(),
        responseSerializer: ProtobufSerializer<Regen_Group_V1alpha1_QueryGroupInfoResponse>(),
        interceptors: self.interceptors?.makeGroupInfoInterceptors() ?? [],
        userFunction: self.groupInfo(request:context:)
      )

    case "GroupAccountInfo":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Regen_Group_V1alpha1_QueryGroupAccountInfoRequest>(),
        responseSerializer: ProtobufSerializer<Regen_Group_V1alpha1_QueryGroupAccountInfoResponse>(),
        interceptors: self.interceptors?.makeGroupAccountInfoInterceptors() ?? [],
        userFunction: self.groupAccountInfo(request:context:)
      )

    case "GroupMembers":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Regen_Group_V1alpha1_QueryGroupMembersRequest>(),
        responseSerializer: ProtobufSerializer<Regen_Group_V1alpha1_QueryGroupMembersResponse>(),
        interceptors: self.interceptors?.makeGroupMembersInterceptors() ?? [],
        userFunction: self.groupMembers(request:context:)
      )

    case "GroupsByAdmin":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Regen_Group_V1alpha1_QueryGroupsByAdminRequest>(),
        responseSerializer: ProtobufSerializer<Regen_Group_V1alpha1_QueryGroupsByAdminResponse>(),
        interceptors: self.interceptors?.makeGroupsByAdminInterceptors() ?? [],
        userFunction: self.groupsByAdmin(request:context:)
      )

    case "GroupAccountsByGroup":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Regen_Group_V1alpha1_QueryGroupAccountsByGroupRequest>(),
        responseSerializer: ProtobufSerializer<Regen_Group_V1alpha1_QueryGroupAccountsByGroupResponse>(),
        interceptors: self.interceptors?.makeGroupAccountsByGroupInterceptors() ?? [],
        userFunction: self.groupAccountsByGroup(request:context:)
      )

    case "GroupAccountsByAdmin":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Regen_Group_V1alpha1_QueryGroupAccountsByAdminRequest>(),
        responseSerializer: ProtobufSerializer<Regen_Group_V1alpha1_QueryGroupAccountsByAdminResponse>(),
        interceptors: self.interceptors?.makeGroupAccountsByAdminInterceptors() ?? [],
        userFunction: self.groupAccountsByAdmin(request:context:)
      )

    case "Proposal":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Regen_Group_V1alpha1_QueryProposalRequest>(),
        responseSerializer: ProtobufSerializer<Regen_Group_V1alpha1_QueryProposalResponse>(),
        interceptors: self.interceptors?.makeProposalInterceptors() ?? [],
        userFunction: self.proposal(request:context:)
      )

    case "ProposalsByGroupAccount":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Regen_Group_V1alpha1_QueryProposalsByGroupAccountRequest>(),
        responseSerializer: ProtobufSerializer<Regen_Group_V1alpha1_QueryProposalsByGroupAccountResponse>(),
        interceptors: self.interceptors?.makeProposalsByGroupAccountInterceptors() ?? [],
        userFunction: self.proposalsByGroupAccount(request:context:)
      )

    case "VoteByProposalVoter":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Regen_Group_V1alpha1_QueryVoteByProposalVoterRequest>(),
        responseSerializer: ProtobufSerializer<Regen_Group_V1alpha1_QueryVoteByProposalVoterResponse>(),
        interceptors: self.interceptors?.makeVoteByProposalVoterInterceptors() ?? [],
        userFunction: self.voteByProposalVoter(request:context:)
      )

    case "VotesByProposal":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Regen_Group_V1alpha1_QueryVotesByProposalRequest>(),
        responseSerializer: ProtobufSerializer<Regen_Group_V1alpha1_QueryVotesByProposalResponse>(),
        interceptors: self.interceptors?.makeVotesByProposalInterceptors() ?? [],
        userFunction: self.votesByProposal(request:context:)
      )

    case "VotesByVoter":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Regen_Group_V1alpha1_QueryVotesByVoterRequest>(),
        responseSerializer: ProtobufSerializer<Regen_Group_V1alpha1_QueryVotesByVoterResponse>(),
        interceptors: self.interceptors?.makeVotesByVoterInterceptors() ?? [],
        userFunction: self.votesByVoter(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Regen_Group_V1alpha1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'groupInfo'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeGroupInfoInterceptors() -> [ServerInterceptor<Regen_Group_V1alpha1_QueryGroupInfoRequest, Regen_Group_V1alpha1_QueryGroupInfoResponse>]

  /// - Returns: Interceptors to use when handling 'groupAccountInfo'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeGroupAccountInfoInterceptors() -> [ServerInterceptor<Regen_Group_V1alpha1_QueryGroupAccountInfoRequest, Regen_Group_V1alpha1_QueryGroupAccountInfoResponse>]

  /// - Returns: Interceptors to use when handling 'groupMembers'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeGroupMembersInterceptors() -> [ServerInterceptor<Regen_Group_V1alpha1_QueryGroupMembersRequest, Regen_Group_V1alpha1_QueryGroupMembersResponse>]

  /// - Returns: Interceptors to use when handling 'groupsByAdmin'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeGroupsByAdminInterceptors() -> [ServerInterceptor<Regen_Group_V1alpha1_QueryGroupsByAdminRequest, Regen_Group_V1alpha1_QueryGroupsByAdminResponse>]

  /// - Returns: Interceptors to use when handling 'groupAccountsByGroup'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeGroupAccountsByGroupInterceptors() -> [ServerInterceptor<Regen_Group_V1alpha1_QueryGroupAccountsByGroupRequest, Regen_Group_V1alpha1_QueryGroupAccountsByGroupResponse>]

  /// - Returns: Interceptors to use when handling 'groupAccountsByAdmin'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeGroupAccountsByAdminInterceptors() -> [ServerInterceptor<Regen_Group_V1alpha1_QueryGroupAccountsByAdminRequest, Regen_Group_V1alpha1_QueryGroupAccountsByAdminResponse>]

  /// - Returns: Interceptors to use when handling 'proposal'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeProposalInterceptors() -> [ServerInterceptor<Regen_Group_V1alpha1_QueryProposalRequest, Regen_Group_V1alpha1_QueryProposalResponse>]

  /// - Returns: Interceptors to use when handling 'proposalsByGroupAccount'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeProposalsByGroupAccountInterceptors() -> [ServerInterceptor<Regen_Group_V1alpha1_QueryProposalsByGroupAccountRequest, Regen_Group_V1alpha1_QueryProposalsByGroupAccountResponse>]

  /// - Returns: Interceptors to use when handling 'voteByProposalVoter'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeVoteByProposalVoterInterceptors() -> [ServerInterceptor<Regen_Group_V1alpha1_QueryVoteByProposalVoterRequest, Regen_Group_V1alpha1_QueryVoteByProposalVoterResponse>]

  /// - Returns: Interceptors to use when handling 'votesByProposal'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeVotesByProposalInterceptors() -> [ServerInterceptor<Regen_Group_V1alpha1_QueryVotesByProposalRequest, Regen_Group_V1alpha1_QueryVotesByProposalResponse>]

  /// - Returns: Interceptors to use when handling 'votesByVoter'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeVotesByVoterInterceptors() -> [ServerInterceptor<Regen_Group_V1alpha1_QueryVotesByVoterRequest, Regen_Group_V1alpha1_QueryVotesByVoterResponse>]
}
