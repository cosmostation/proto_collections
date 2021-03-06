//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: lum/airdrop/query.proto
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
/// Usage: instantiate `Lum_Network_Airdrop_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Lum_Network_Airdrop_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Lum_Network_Airdrop_QueryClientInterceptorFactoryProtocol? { get }

  func moduleAccountBalance(
    _ request: Lum_Network_Airdrop_QueryModuleAccountBalanceRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Lum_Network_Airdrop_QueryModuleAccountBalanceRequest, Lum_Network_Airdrop_QueryModuleAccountBalanceResponse>

  func params(
    _ request: Lum_Network_Airdrop_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Lum_Network_Airdrop_QueryParamsRequest, Lum_Network_Airdrop_QueryParamsResponse>

  func claimRecord(
    _ request: Lum_Network_Airdrop_QueryClaimRecordRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Lum_Network_Airdrop_QueryClaimRecordRequest, Lum_Network_Airdrop_QueryClaimRecordResponse>

  func claimableForAction(
    _ request: Lum_Network_Airdrop_QueryClaimableForActionRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Lum_Network_Airdrop_QueryClaimableForActionRequest, Lum_Network_Airdrop_QueryClaimableForActionResponse>

  func totalClaimable(
    _ request: Lum_Network_Airdrop_QueryTotalClaimableRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Lum_Network_Airdrop_QueryTotalClaimableRequest, Lum_Network_Airdrop_QueryTotalClaimableResponse>
}

extension Lum_Network_Airdrop_QueryClientProtocol {
  internal var serviceName: String {
    return "lum.network.airdrop.Query"
  }

  /// Unary call to ModuleAccountBalance
  ///
  /// - Parameters:
  ///   - request: Request to send to ModuleAccountBalance.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func moduleAccountBalance(
    _ request: Lum_Network_Airdrop_QueryModuleAccountBalanceRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Lum_Network_Airdrop_QueryModuleAccountBalanceRequest, Lum_Network_Airdrop_QueryModuleAccountBalanceResponse> {
    return self.makeUnaryCall(
      path: "/lum.network.airdrop.Query/ModuleAccountBalance",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeModuleAccountBalanceInterceptors() ?? []
    )
  }

  /// Unary call to Params
  ///
  /// - Parameters:
  ///   - request: Request to send to Params.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func params(
    _ request: Lum_Network_Airdrop_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Lum_Network_Airdrop_QueryParamsRequest, Lum_Network_Airdrop_QueryParamsResponse> {
    return self.makeUnaryCall(
      path: "/lum.network.airdrop.Query/Params",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  /// Unary call to ClaimRecord
  ///
  /// - Parameters:
  ///   - request: Request to send to ClaimRecord.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func claimRecord(
    _ request: Lum_Network_Airdrop_QueryClaimRecordRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Lum_Network_Airdrop_QueryClaimRecordRequest, Lum_Network_Airdrop_QueryClaimRecordResponse> {
    return self.makeUnaryCall(
      path: "/lum.network.airdrop.Query/ClaimRecord",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimRecordInterceptors() ?? []
    )
  }

  /// Unary call to ClaimableForAction
  ///
  /// - Parameters:
  ///   - request: Request to send to ClaimableForAction.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func claimableForAction(
    _ request: Lum_Network_Airdrop_QueryClaimableForActionRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Lum_Network_Airdrop_QueryClaimableForActionRequest, Lum_Network_Airdrop_QueryClaimableForActionResponse> {
    return self.makeUnaryCall(
      path: "/lum.network.airdrop.Query/ClaimableForAction",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimableForActionInterceptors() ?? []
    )
  }

  /// Unary call to TotalClaimable
  ///
  /// - Parameters:
  ///   - request: Request to send to TotalClaimable.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func totalClaimable(
    _ request: Lum_Network_Airdrop_QueryTotalClaimableRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Lum_Network_Airdrop_QueryTotalClaimableRequest, Lum_Network_Airdrop_QueryTotalClaimableResponse> {
    return self.makeUnaryCall(
      path: "/lum.network.airdrop.Query/TotalClaimable",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTotalClaimableInterceptors() ?? []
    )
  }
}

internal protocol Lum_Network_Airdrop_QueryClientInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when invoking 'moduleAccountBalance'.
  func makeModuleAccountBalanceInterceptors() -> [ClientInterceptor<Lum_Network_Airdrop_QueryModuleAccountBalanceRequest, Lum_Network_Airdrop_QueryModuleAccountBalanceResponse>]

  /// - Returns: Interceptors to use when invoking 'params'.
  func makeParamsInterceptors() -> [ClientInterceptor<Lum_Network_Airdrop_QueryParamsRequest, Lum_Network_Airdrop_QueryParamsResponse>]

  /// - Returns: Interceptors to use when invoking 'claimRecord'.
  func makeClaimRecordInterceptors() -> [ClientInterceptor<Lum_Network_Airdrop_QueryClaimRecordRequest, Lum_Network_Airdrop_QueryClaimRecordResponse>]

  /// - Returns: Interceptors to use when invoking 'claimableForAction'.
  func makeClaimableForActionInterceptors() -> [ClientInterceptor<Lum_Network_Airdrop_QueryClaimableForActionRequest, Lum_Network_Airdrop_QueryClaimableForActionResponse>]

  /// - Returns: Interceptors to use when invoking 'totalClaimable'.
  func makeTotalClaimableInterceptors() -> [ClientInterceptor<Lum_Network_Airdrop_QueryTotalClaimableRequest, Lum_Network_Airdrop_QueryTotalClaimableResponse>]
}

internal final class Lum_Network_Airdrop_QueryClient: Lum_Network_Airdrop_QueryClientProtocol {
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Lum_Network_Airdrop_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the lum.network.airdrop.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Lum_Network_Airdrop_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Lum_Network_Airdrop_QueryProvider: CallHandlerProvider {
  var interceptors: Lum_Network_Airdrop_QueryServerInterceptorFactoryProtocol? { get }

  func moduleAccountBalance(request: Lum_Network_Airdrop_QueryModuleAccountBalanceRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Lum_Network_Airdrop_QueryModuleAccountBalanceResponse>

  func params(request: Lum_Network_Airdrop_QueryParamsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Lum_Network_Airdrop_QueryParamsResponse>

  func claimRecord(request: Lum_Network_Airdrop_QueryClaimRecordRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Lum_Network_Airdrop_QueryClaimRecordResponse>

  func claimableForAction(request: Lum_Network_Airdrop_QueryClaimableForActionRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Lum_Network_Airdrop_QueryClaimableForActionResponse>

  func totalClaimable(request: Lum_Network_Airdrop_QueryTotalClaimableRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Lum_Network_Airdrop_QueryTotalClaimableResponse>
}

extension Lum_Network_Airdrop_QueryProvider {
  internal var serviceName: Substring { return "lum.network.airdrop.Query" }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "ModuleAccountBalance":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Lum_Network_Airdrop_QueryModuleAccountBalanceRequest>(),
        responseSerializer: ProtobufSerializer<Lum_Network_Airdrop_QueryModuleAccountBalanceResponse>(),
        interceptors: self.interceptors?.makeModuleAccountBalanceInterceptors() ?? [],
        userFunction: self.moduleAccountBalance(request:context:)
      )

    case "Params":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Lum_Network_Airdrop_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Lum_Network_Airdrop_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        userFunction: self.params(request:context:)
      )

    case "ClaimRecord":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Lum_Network_Airdrop_QueryClaimRecordRequest>(),
        responseSerializer: ProtobufSerializer<Lum_Network_Airdrop_QueryClaimRecordResponse>(),
        interceptors: self.interceptors?.makeClaimRecordInterceptors() ?? [],
        userFunction: self.claimRecord(request:context:)
      )

    case "ClaimableForAction":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Lum_Network_Airdrop_QueryClaimableForActionRequest>(),
        responseSerializer: ProtobufSerializer<Lum_Network_Airdrop_QueryClaimableForActionResponse>(),
        interceptors: self.interceptors?.makeClaimableForActionInterceptors() ?? [],
        userFunction: self.claimableForAction(request:context:)
      )

    case "TotalClaimable":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Lum_Network_Airdrop_QueryTotalClaimableRequest>(),
        responseSerializer: ProtobufSerializer<Lum_Network_Airdrop_QueryTotalClaimableResponse>(),
        interceptors: self.interceptors?.makeTotalClaimableInterceptors() ?? [],
        userFunction: self.totalClaimable(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Lum_Network_Airdrop_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'moduleAccountBalance'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeModuleAccountBalanceInterceptors() -> [ServerInterceptor<Lum_Network_Airdrop_QueryModuleAccountBalanceRequest, Lum_Network_Airdrop_QueryModuleAccountBalanceResponse>]

  /// - Returns: Interceptors to use when handling 'params'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeParamsInterceptors() -> [ServerInterceptor<Lum_Network_Airdrop_QueryParamsRequest, Lum_Network_Airdrop_QueryParamsResponse>]

  /// - Returns: Interceptors to use when handling 'claimRecord'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeClaimRecordInterceptors() -> [ServerInterceptor<Lum_Network_Airdrop_QueryClaimRecordRequest, Lum_Network_Airdrop_QueryClaimRecordResponse>]

  /// - Returns: Interceptors to use when handling 'claimableForAction'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeClaimableForActionInterceptors() -> [ServerInterceptor<Lum_Network_Airdrop_QueryClaimableForActionRequest, Lum_Network_Airdrop_QueryClaimableForActionResponse>]

  /// - Returns: Interceptors to use when handling 'totalClaimable'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeTotalClaimableInterceptors() -> [ServerInterceptor<Lum_Network_Airdrop_QueryTotalClaimableRequest, Lum_Network_Airdrop_QueryTotalClaimableResponse>]
}
