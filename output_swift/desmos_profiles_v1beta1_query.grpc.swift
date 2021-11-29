//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: desmos/profiles/v1beta1/query.proto
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


/// Query defines the gRPC querier service.
///
/// Usage: instantiate `Desmos_Profiles_V1beta1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Desmos_Profiles_V1beta1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Desmos_Profiles_V1beta1_QueryClientInterceptorFactoryProtocol? { get }

  func profile(
    _ request: Desmos_Profiles_V1beta1_QueryProfileRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Profiles_V1beta1_QueryProfileRequest, Desmos_Profiles_V1beta1_QueryProfileResponse>

  func incomingDTagTransferRequests(
    _ request: Desmos_Profiles_V1beta1_QueryIncomingDTagTransferRequestsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Profiles_V1beta1_QueryIncomingDTagTransferRequestsRequest, Desmos_Profiles_V1beta1_QueryIncomingDTagTransferRequestsResponse>

  func params(
    _ request: Desmos_Profiles_V1beta1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Profiles_V1beta1_QueryParamsRequest, Desmos_Profiles_V1beta1_QueryParamsResponse>

  func relationships(
    _ request: Desmos_Profiles_V1beta1_QueryRelationshipsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Profiles_V1beta1_QueryRelationshipsRequest, Desmos_Profiles_V1beta1_QueryRelationshipsResponse>

  func blocks(
    _ request: Desmos_Profiles_V1beta1_QueryBlocksRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Profiles_V1beta1_QueryBlocksRequest, Desmos_Profiles_V1beta1_QueryBlocksResponse>

  func chainLinks(
    _ request: Desmos_Profiles_V1beta1_QueryChainLinksRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Profiles_V1beta1_QueryChainLinksRequest, Desmos_Profiles_V1beta1_QueryChainLinksResponse>

  func userChainLink(
    _ request: Desmos_Profiles_V1beta1_QueryUserChainLinkRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Profiles_V1beta1_QueryUserChainLinkRequest, Desmos_Profiles_V1beta1_QueryUserChainLinkResponse>

  func applicationLinks(
    _ request: Desmos_Profiles_V1beta1_QueryApplicationLinksRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Profiles_V1beta1_QueryApplicationLinksRequest, Desmos_Profiles_V1beta1_QueryApplicationLinksResponse>

  func userApplicationLink(
    _ request: Desmos_Profiles_V1beta1_QueryUserApplicationLinkRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Profiles_V1beta1_QueryUserApplicationLinkRequest, Desmos_Profiles_V1beta1_QueryUserApplicationLinkResponse>

  func applicationLinkByClientID(
    _ request: Desmos_Profiles_V1beta1_QueryApplicationLinkByClientIDRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Profiles_V1beta1_QueryApplicationLinkByClientIDRequest, Desmos_Profiles_V1beta1_QueryApplicationLinkByClientIDResponse>
}

extension Desmos_Profiles_V1beta1_QueryClientProtocol {
  internal var serviceName: String {
    return "desmos.profiles.v1beta1.Query"
  }

  /// Profile queries the profile of a specific user given their DTag or address.
  /// If the queried user does not have a profile, the returned response will
  /// contain a null profile.
  ///
  /// - Parameters:
  ///   - request: Request to send to Profile.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func profile(
    _ request: Desmos_Profiles_V1beta1_QueryProfileRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Profiles_V1beta1_QueryProfileRequest, Desmos_Profiles_V1beta1_QueryProfileResponse> {
    return self.makeUnaryCall(
      path: "/desmos.profiles.v1beta1.Query/Profile",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeProfileInterceptors() ?? []
    )
  }

  /// IncomingDTagTransferRequests queries all the DTag transfers requests that
  /// have been made towards the user with the given address
  ///
  /// - Parameters:
  ///   - request: Request to send to IncomingDTagTransferRequests.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func incomingDTagTransferRequests(
    _ request: Desmos_Profiles_V1beta1_QueryIncomingDTagTransferRequestsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Profiles_V1beta1_QueryIncomingDTagTransferRequestsRequest, Desmos_Profiles_V1beta1_QueryIncomingDTagTransferRequestsResponse> {
    return self.makeUnaryCall(
      path: "/desmos.profiles.v1beta1.Query/IncomingDTagTransferRequests",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeIncomingDTagTransferRequestsInterceptors() ?? []
    )
  }

  /// Params queries the profiles module params
  ///
  /// - Parameters:
  ///   - request: Request to send to Params.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func params(
    _ request: Desmos_Profiles_V1beta1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Profiles_V1beta1_QueryParamsRequest, Desmos_Profiles_V1beta1_QueryParamsResponse> {
    return self.makeUnaryCall(
      path: "/desmos.profiles.v1beta1.Query/Params",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  /// Relationships queries all relationships for the given user, if provided.
  /// Otherwise, it queries all the relationships stored.
  ///
  /// - Parameters:
  ///   - request: Request to send to Relationships.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func relationships(
    _ request: Desmos_Profiles_V1beta1_QueryRelationshipsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Profiles_V1beta1_QueryRelationshipsRequest, Desmos_Profiles_V1beta1_QueryRelationshipsResponse> {
    return self.makeUnaryCall(
      path: "/desmos.profiles.v1beta1.Query/Relationships",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRelationshipsInterceptors() ?? []
    )
  }

  /// Blocks queries the blocks for the given user, if provided.
  /// Otherwise, it queries all the stored blocks.
  ///
  /// - Parameters:
  ///   - request: Request to send to Blocks.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func blocks(
    _ request: Desmos_Profiles_V1beta1_QueryBlocksRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Profiles_V1beta1_QueryBlocksRequest, Desmos_Profiles_V1beta1_QueryBlocksResponse> {
    return self.makeUnaryCall(
      path: "/desmos.profiles.v1beta1.Query/Blocks",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBlocksInterceptors() ?? []
    )
  }

  /// ChainLinks queries the chain links associated to the given user, if
  /// provided. Otherwise it queries all the chain links stored.
  ///
  /// - Parameters:
  ///   - request: Request to send to ChainLinks.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func chainLinks(
    _ request: Desmos_Profiles_V1beta1_QueryChainLinksRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Profiles_V1beta1_QueryChainLinksRequest, Desmos_Profiles_V1beta1_QueryChainLinksResponse> {
    return self.makeUnaryCall(
      path: "/desmos.profiles.v1beta1.Query/ChainLinks",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeChainLinksInterceptors() ?? []
    )
  }

  /// UserChainLink queries the chain link for the given user, chain name and
  /// target address
  ///
  /// - Parameters:
  ///   - request: Request to send to UserChainLink.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func userChainLink(
    _ request: Desmos_Profiles_V1beta1_QueryUserChainLinkRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Profiles_V1beta1_QueryUserChainLinkRequest, Desmos_Profiles_V1beta1_QueryUserChainLinkResponse> {
    return self.makeUnaryCall(
      path: "/desmos.profiles.v1beta1.Query/UserChainLink",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUserChainLinkInterceptors() ?? []
    )
  }

  /// ApplicationLinks queries the applications links associated to the given
  /// user, if provided. Otherwise, it queries all the application links stored.
  ///
  /// - Parameters:
  ///   - request: Request to send to ApplicationLinks.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func applicationLinks(
    _ request: Desmos_Profiles_V1beta1_QueryApplicationLinksRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Profiles_V1beta1_QueryApplicationLinksRequest, Desmos_Profiles_V1beta1_QueryApplicationLinksResponse> {
    return self.makeUnaryCall(
      path: "/desmos.profiles.v1beta1.Query/ApplicationLinks",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeApplicationLinksInterceptors() ?? []
    )
  }

  /// UserApplicationLinks queries a single application link for a given user,
  /// searching via the application name and username
  ///
  /// - Parameters:
  ///   - request: Request to send to UserApplicationLink.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func userApplicationLink(
    _ request: Desmos_Profiles_V1beta1_QueryUserApplicationLinkRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Profiles_V1beta1_QueryUserApplicationLinkRequest, Desmos_Profiles_V1beta1_QueryUserApplicationLinkResponse> {
    return self.makeUnaryCall(
      path: "/desmos.profiles.v1beta1.Query/UserApplicationLink",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUserApplicationLinkInterceptors() ?? []
    )
  }

  /// ApplicationLinkByClientID queries a single application link for a given
  /// client id.
  ///
  /// - Parameters:
  ///   - request: Request to send to ApplicationLinkByClientID.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func applicationLinkByClientID(
    _ request: Desmos_Profiles_V1beta1_QueryApplicationLinkByClientIDRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Profiles_V1beta1_QueryApplicationLinkByClientIDRequest, Desmos_Profiles_V1beta1_QueryApplicationLinkByClientIDResponse> {
    return self.makeUnaryCall(
      path: "/desmos.profiles.v1beta1.Query/ApplicationLinkByClientID",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeApplicationLinkByClientIDInterceptors() ?? []
    )
  }
}

internal protocol Desmos_Profiles_V1beta1_QueryClientInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when invoking 'profile'.
  func makeProfileInterceptors() -> [ClientInterceptor<Desmos_Profiles_V1beta1_QueryProfileRequest, Desmos_Profiles_V1beta1_QueryProfileResponse>]

  /// - Returns: Interceptors to use when invoking 'incomingDTagTransferRequests'.
  func makeIncomingDTagTransferRequestsInterceptors() -> [ClientInterceptor<Desmos_Profiles_V1beta1_QueryIncomingDTagTransferRequestsRequest, Desmos_Profiles_V1beta1_QueryIncomingDTagTransferRequestsResponse>]

  /// - Returns: Interceptors to use when invoking 'params'.
  func makeParamsInterceptors() -> [ClientInterceptor<Desmos_Profiles_V1beta1_QueryParamsRequest, Desmos_Profiles_V1beta1_QueryParamsResponse>]

  /// - Returns: Interceptors to use when invoking 'relationships'.
  func makeRelationshipsInterceptors() -> [ClientInterceptor<Desmos_Profiles_V1beta1_QueryRelationshipsRequest, Desmos_Profiles_V1beta1_QueryRelationshipsResponse>]

  /// - Returns: Interceptors to use when invoking 'blocks'.
  func makeBlocksInterceptors() -> [ClientInterceptor<Desmos_Profiles_V1beta1_QueryBlocksRequest, Desmos_Profiles_V1beta1_QueryBlocksResponse>]

  /// - Returns: Interceptors to use when invoking 'chainLinks'.
  func makeChainLinksInterceptors() -> [ClientInterceptor<Desmos_Profiles_V1beta1_QueryChainLinksRequest, Desmos_Profiles_V1beta1_QueryChainLinksResponse>]

  /// - Returns: Interceptors to use when invoking 'userChainLink'.
  func makeUserChainLinkInterceptors() -> [ClientInterceptor<Desmos_Profiles_V1beta1_QueryUserChainLinkRequest, Desmos_Profiles_V1beta1_QueryUserChainLinkResponse>]

  /// - Returns: Interceptors to use when invoking 'applicationLinks'.
  func makeApplicationLinksInterceptors() -> [ClientInterceptor<Desmos_Profiles_V1beta1_QueryApplicationLinksRequest, Desmos_Profiles_V1beta1_QueryApplicationLinksResponse>]

  /// - Returns: Interceptors to use when invoking 'userApplicationLink'.
  func makeUserApplicationLinkInterceptors() -> [ClientInterceptor<Desmos_Profiles_V1beta1_QueryUserApplicationLinkRequest, Desmos_Profiles_V1beta1_QueryUserApplicationLinkResponse>]

  /// - Returns: Interceptors to use when invoking 'applicationLinkByClientID'.
  func makeApplicationLinkByClientIDInterceptors() -> [ClientInterceptor<Desmos_Profiles_V1beta1_QueryApplicationLinkByClientIDRequest, Desmos_Profiles_V1beta1_QueryApplicationLinkByClientIDResponse>]
}

internal final class Desmos_Profiles_V1beta1_QueryClient: Desmos_Profiles_V1beta1_QueryClientProtocol {
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Desmos_Profiles_V1beta1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the desmos.profiles.v1beta1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Desmos_Profiles_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Desmos_Profiles_V1beta1_QueryProvider: CallHandlerProvider {
  var interceptors: Desmos_Profiles_V1beta1_QueryServerInterceptorFactoryProtocol? { get }

  /// Profile queries the profile of a specific user given their DTag or address.
  /// If the queried user does not have a profile, the returned response will
  /// contain a null profile.
  func profile(request: Desmos_Profiles_V1beta1_QueryProfileRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Profiles_V1beta1_QueryProfileResponse>

  /// IncomingDTagTransferRequests queries all the DTag transfers requests that
  /// have been made towards the user with the given address
  func incomingDTagTransferRequests(request: Desmos_Profiles_V1beta1_QueryIncomingDTagTransferRequestsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Profiles_V1beta1_QueryIncomingDTagTransferRequestsResponse>

  /// Params queries the profiles module params
  func params(request: Desmos_Profiles_V1beta1_QueryParamsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Profiles_V1beta1_QueryParamsResponse>

  /// Relationships queries all relationships for the given user, if provided.
  /// Otherwise, it queries all the relationships stored.
  func relationships(request: Desmos_Profiles_V1beta1_QueryRelationshipsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Profiles_V1beta1_QueryRelationshipsResponse>

  /// Blocks queries the blocks for the given user, if provided.
  /// Otherwise, it queries all the stored blocks.
  func blocks(request: Desmos_Profiles_V1beta1_QueryBlocksRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Profiles_V1beta1_QueryBlocksResponse>

  /// ChainLinks queries the chain links associated to the given user, if
  /// provided. Otherwise it queries all the chain links stored.
  func chainLinks(request: Desmos_Profiles_V1beta1_QueryChainLinksRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Profiles_V1beta1_QueryChainLinksResponse>

  /// UserChainLink queries the chain link for the given user, chain name and
  /// target address
  func userChainLink(request: Desmos_Profiles_V1beta1_QueryUserChainLinkRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Profiles_V1beta1_QueryUserChainLinkResponse>

  /// ApplicationLinks queries the applications links associated to the given
  /// user, if provided. Otherwise, it queries all the application links stored.
  func applicationLinks(request: Desmos_Profiles_V1beta1_QueryApplicationLinksRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Profiles_V1beta1_QueryApplicationLinksResponse>

  /// UserApplicationLinks queries a single application link for a given user,
  /// searching via the application name and username
  func userApplicationLink(request: Desmos_Profiles_V1beta1_QueryUserApplicationLinkRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Profiles_V1beta1_QueryUserApplicationLinkResponse>

  /// ApplicationLinkByClientID queries a single application link for a given
  /// client id.
  func applicationLinkByClientID(request: Desmos_Profiles_V1beta1_QueryApplicationLinkByClientIDRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Profiles_V1beta1_QueryApplicationLinkByClientIDResponse>
}

extension Desmos_Profiles_V1beta1_QueryProvider {
  internal var serviceName: Substring { return "desmos.profiles.v1beta1.Query" }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Profile":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Profiles_V1beta1_QueryProfileRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Profiles_V1beta1_QueryProfileResponse>(),
        interceptors: self.interceptors?.makeProfileInterceptors() ?? [],
        userFunction: self.profile(request:context:)
      )

    case "IncomingDTagTransferRequests":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Profiles_V1beta1_QueryIncomingDTagTransferRequestsRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Profiles_V1beta1_QueryIncomingDTagTransferRequestsResponse>(),
        interceptors: self.interceptors?.makeIncomingDTagTransferRequestsInterceptors() ?? [],
        userFunction: self.incomingDTagTransferRequests(request:context:)
      )

    case "Params":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Profiles_V1beta1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Profiles_V1beta1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        userFunction: self.params(request:context:)
      )

    case "Relationships":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Profiles_V1beta1_QueryRelationshipsRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Profiles_V1beta1_QueryRelationshipsResponse>(),
        interceptors: self.interceptors?.makeRelationshipsInterceptors() ?? [],
        userFunction: self.relationships(request:context:)
      )

    case "Blocks":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Profiles_V1beta1_QueryBlocksRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Profiles_V1beta1_QueryBlocksResponse>(),
        interceptors: self.interceptors?.makeBlocksInterceptors() ?? [],
        userFunction: self.blocks(request:context:)
      )

    case "ChainLinks":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Profiles_V1beta1_QueryChainLinksRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Profiles_V1beta1_QueryChainLinksResponse>(),
        interceptors: self.interceptors?.makeChainLinksInterceptors() ?? [],
        userFunction: self.chainLinks(request:context:)
      )

    case "UserChainLink":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Profiles_V1beta1_QueryUserChainLinkRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Profiles_V1beta1_QueryUserChainLinkResponse>(),
        interceptors: self.interceptors?.makeUserChainLinkInterceptors() ?? [],
        userFunction: self.userChainLink(request:context:)
      )

    case "ApplicationLinks":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Profiles_V1beta1_QueryApplicationLinksRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Profiles_V1beta1_QueryApplicationLinksResponse>(),
        interceptors: self.interceptors?.makeApplicationLinksInterceptors() ?? [],
        userFunction: self.applicationLinks(request:context:)
      )

    case "UserApplicationLink":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Profiles_V1beta1_QueryUserApplicationLinkRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Profiles_V1beta1_QueryUserApplicationLinkResponse>(),
        interceptors: self.interceptors?.makeUserApplicationLinkInterceptors() ?? [],
        userFunction: self.userApplicationLink(request:context:)
      )

    case "ApplicationLinkByClientID":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Profiles_V1beta1_QueryApplicationLinkByClientIDRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Profiles_V1beta1_QueryApplicationLinkByClientIDResponse>(),
        interceptors: self.interceptors?.makeApplicationLinkByClientIDInterceptors() ?? [],
        userFunction: self.applicationLinkByClientID(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Desmos_Profiles_V1beta1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'profile'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeProfileInterceptors() -> [ServerInterceptor<Desmos_Profiles_V1beta1_QueryProfileRequest, Desmos_Profiles_V1beta1_QueryProfileResponse>]

  /// - Returns: Interceptors to use when handling 'incomingDTagTransferRequests'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeIncomingDTagTransferRequestsInterceptors() -> [ServerInterceptor<Desmos_Profiles_V1beta1_QueryIncomingDTagTransferRequestsRequest, Desmos_Profiles_V1beta1_QueryIncomingDTagTransferRequestsResponse>]

  /// - Returns: Interceptors to use when handling 'params'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeParamsInterceptors() -> [ServerInterceptor<Desmos_Profiles_V1beta1_QueryParamsRequest, Desmos_Profiles_V1beta1_QueryParamsResponse>]

  /// - Returns: Interceptors to use when handling 'relationships'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRelationshipsInterceptors() -> [ServerInterceptor<Desmos_Profiles_V1beta1_QueryRelationshipsRequest, Desmos_Profiles_V1beta1_QueryRelationshipsResponse>]

  /// - Returns: Interceptors to use when handling 'blocks'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeBlocksInterceptors() -> [ServerInterceptor<Desmos_Profiles_V1beta1_QueryBlocksRequest, Desmos_Profiles_V1beta1_QueryBlocksResponse>]

  /// - Returns: Interceptors to use when handling 'chainLinks'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeChainLinksInterceptors() -> [ServerInterceptor<Desmos_Profiles_V1beta1_QueryChainLinksRequest, Desmos_Profiles_V1beta1_QueryChainLinksResponse>]

  /// - Returns: Interceptors to use when handling 'userChainLink'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeUserChainLinkInterceptors() -> [ServerInterceptor<Desmos_Profiles_V1beta1_QueryUserChainLinkRequest, Desmos_Profiles_V1beta1_QueryUserChainLinkResponse>]

  /// - Returns: Interceptors to use when handling 'applicationLinks'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeApplicationLinksInterceptors() -> [ServerInterceptor<Desmos_Profiles_V1beta1_QueryApplicationLinksRequest, Desmos_Profiles_V1beta1_QueryApplicationLinksResponse>]

  /// - Returns: Interceptors to use when handling 'userApplicationLink'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeUserApplicationLinkInterceptors() -> [ServerInterceptor<Desmos_Profiles_V1beta1_QueryUserApplicationLinkRequest, Desmos_Profiles_V1beta1_QueryUserApplicationLinkResponse>]

  /// - Returns: Interceptors to use when handling 'applicationLinkByClientID'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeApplicationLinkByClientIDInterceptors() -> [ServerInterceptor<Desmos_Profiles_V1beta1_QueryApplicationLinkByClientIDRequest, Desmos_Profiles_V1beta1_QueryApplicationLinkByClientIDResponse>]
}
