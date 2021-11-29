//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: tokenswap/query.proto
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


/// Query defines the gRPC querier service
///
/// Usage: instantiate `Rizonworld_Rizon_Tokenswap_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Rizonworld_Rizon_Tokenswap_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Rizonworld_Rizon_Tokenswap_QueryClientInterceptorFactoryProtocol? { get }

  func tokenswap(
    _ request: Rizonworld_Rizon_Tokenswap_QueryTokenswapRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Rizonworld_Rizon_Tokenswap_QueryTokenswapRequest, Rizonworld_Rizon_Tokenswap_QueryTokenswapResponse>

  func swappedAmount(
    _ request: Rizonworld_Rizon_Tokenswap_QuerySwappedAmountRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Rizonworld_Rizon_Tokenswap_QuerySwappedAmountRequest, Rizonworld_Rizon_Tokenswap_QuerySwappedAmountResponse>

  func params(
    _ request: Rizonworld_Rizon_Tokenswap_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Rizonworld_Rizon_Tokenswap_QueryParamsRequest, Rizonworld_Rizon_Tokenswap_QueryParamsResponse>
}

extension Rizonworld_Rizon_Tokenswap_QueryClientProtocol {
  internal var serviceName: String {
    return "rizonworld.rizon.tokenswap.Query"
  }

  /// Tokenswap queries tokenswap item for given tx hash
  ///
  /// - Parameters:
  ///   - request: Request to send to Tokenswap.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func tokenswap(
    _ request: Rizonworld_Rizon_Tokenswap_QueryTokenswapRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Rizonworld_Rizon_Tokenswap_QueryTokenswapRequest, Rizonworld_Rizon_Tokenswap_QueryTokenswapResponse> {
    return self.makeUnaryCall(
      path: "/rizonworld.rizon.tokenswap.Query/Tokenswap",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTokenswapInterceptors() ?? []
    )
  }

  /// SwappedAmount queries current swapped amount of tokenswap
  ///
  /// - Parameters:
  ///   - request: Request to send to SwappedAmount.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func swappedAmount(
    _ request: Rizonworld_Rizon_Tokenswap_QuerySwappedAmountRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Rizonworld_Rizon_Tokenswap_QuerySwappedAmountRequest, Rizonworld_Rizon_Tokenswap_QuerySwappedAmountResponse> {
    return self.makeUnaryCall(
      path: "/rizonworld.rizon.tokenswap.Query/SwappedAmount",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSwappedAmountInterceptors() ?? []
    )
  }

  /// Params queries parameters of tokenswap
  ///
  /// - Parameters:
  ///   - request: Request to send to Params.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func params(
    _ request: Rizonworld_Rizon_Tokenswap_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Rizonworld_Rizon_Tokenswap_QueryParamsRequest, Rizonworld_Rizon_Tokenswap_QueryParamsResponse> {
    return self.makeUnaryCall(
      path: "/rizonworld.rizon.tokenswap.Query/Params",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }
}

internal protocol Rizonworld_Rizon_Tokenswap_QueryClientInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when invoking 'tokenswap'.
  func makeTokenswapInterceptors() -> [ClientInterceptor<Rizonworld_Rizon_Tokenswap_QueryTokenswapRequest, Rizonworld_Rizon_Tokenswap_QueryTokenswapResponse>]

  /// - Returns: Interceptors to use when invoking 'swappedAmount'.
  func makeSwappedAmountInterceptors() -> [ClientInterceptor<Rizonworld_Rizon_Tokenswap_QuerySwappedAmountRequest, Rizonworld_Rizon_Tokenswap_QuerySwappedAmountResponse>]

  /// - Returns: Interceptors to use when invoking 'params'.
  func makeParamsInterceptors() -> [ClientInterceptor<Rizonworld_Rizon_Tokenswap_QueryParamsRequest, Rizonworld_Rizon_Tokenswap_QueryParamsResponse>]
}

internal final class Rizonworld_Rizon_Tokenswap_QueryClient: Rizonworld_Rizon_Tokenswap_QueryClientProtocol {
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Rizonworld_Rizon_Tokenswap_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the rizonworld.rizon.tokenswap.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Rizonworld_Rizon_Tokenswap_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Rizonworld_Rizon_Tokenswap_QueryProvider: CallHandlerProvider {
  var interceptors: Rizonworld_Rizon_Tokenswap_QueryServerInterceptorFactoryProtocol? { get }

  /// Tokenswap queries tokenswap item for given tx hash
  func tokenswap(request: Rizonworld_Rizon_Tokenswap_QueryTokenswapRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Rizonworld_Rizon_Tokenswap_QueryTokenswapResponse>

  /// SwappedAmount queries current swapped amount of tokenswap
  func swappedAmount(request: Rizonworld_Rizon_Tokenswap_QuerySwappedAmountRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Rizonworld_Rizon_Tokenswap_QuerySwappedAmountResponse>

  /// Params queries parameters of tokenswap
  func params(request: Rizonworld_Rizon_Tokenswap_QueryParamsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Rizonworld_Rizon_Tokenswap_QueryParamsResponse>
}

extension Rizonworld_Rizon_Tokenswap_QueryProvider {
  internal var serviceName: Substring { return "rizonworld.rizon.tokenswap.Query" }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Tokenswap":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Rizonworld_Rizon_Tokenswap_QueryTokenswapRequest>(),
        responseSerializer: ProtobufSerializer<Rizonworld_Rizon_Tokenswap_QueryTokenswapResponse>(),
        interceptors: self.interceptors?.makeTokenswapInterceptors() ?? [],
        userFunction: self.tokenswap(request:context:)
      )

    case "SwappedAmount":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Rizonworld_Rizon_Tokenswap_QuerySwappedAmountRequest>(),
        responseSerializer: ProtobufSerializer<Rizonworld_Rizon_Tokenswap_QuerySwappedAmountResponse>(),
        interceptors: self.interceptors?.makeSwappedAmountInterceptors() ?? [],
        userFunction: self.swappedAmount(request:context:)
      )

    case "Params":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Rizonworld_Rizon_Tokenswap_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Rizonworld_Rizon_Tokenswap_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        userFunction: self.params(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Rizonworld_Rizon_Tokenswap_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'tokenswap'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeTokenswapInterceptors() -> [ServerInterceptor<Rizonworld_Rizon_Tokenswap_QueryTokenswapRequest, Rizonworld_Rizon_Tokenswap_QueryTokenswapResponse>]

  /// - Returns: Interceptors to use when handling 'swappedAmount'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSwappedAmountInterceptors() -> [ServerInterceptor<Rizonworld_Rizon_Tokenswap_QuerySwappedAmountRequest, Rizonworld_Rizon_Tokenswap_QuerySwappedAmountResponse>]

  /// - Returns: Interceptors to use when handling 'params'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeParamsInterceptors() -> [ServerInterceptor<Rizonworld_Rizon_Tokenswap_QueryParamsRequest, Rizonworld_Rizon_Tokenswap_QueryParamsResponse>]
}
