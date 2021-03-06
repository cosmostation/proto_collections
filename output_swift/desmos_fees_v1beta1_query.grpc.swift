//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: desmos/fees/v1beta1/query.proto
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
/// Usage: instantiate `Desmos_Fees_V1beta1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Desmos_Fees_V1beta1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Desmos_Fees_V1beta1_QueryClientInterceptorFactoryProtocol? { get }

  func params(
    _ request: Desmos_Fees_V1beta1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Fees_V1beta1_QueryParamsRequest, Desmos_Fees_V1beta1_QueryParamsResponse>
}

extension Desmos_Fees_V1beta1_QueryClientProtocol {
  internal var serviceName: String {
    return "desmos.fees.v1beta1.Query"
  }

  /// Params queries the fees module params
  ///
  /// - Parameters:
  ///   - request: Request to send to Params.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func params(
    _ request: Desmos_Fees_V1beta1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Fees_V1beta1_QueryParamsRequest, Desmos_Fees_V1beta1_QueryParamsResponse> {
    return self.makeUnaryCall(
      path: "/desmos.fees.v1beta1.Query/Params",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }
}

internal protocol Desmos_Fees_V1beta1_QueryClientInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when invoking 'params'.
  func makeParamsInterceptors() -> [ClientInterceptor<Desmos_Fees_V1beta1_QueryParamsRequest, Desmos_Fees_V1beta1_QueryParamsResponse>]
}

internal final class Desmos_Fees_V1beta1_QueryClient: Desmos_Fees_V1beta1_QueryClientProtocol {
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Desmos_Fees_V1beta1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the desmos.fees.v1beta1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Desmos_Fees_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Desmos_Fees_V1beta1_QueryProvider: CallHandlerProvider {
  var interceptors: Desmos_Fees_V1beta1_QueryServerInterceptorFactoryProtocol? { get }

  /// Params queries the fees module params
  func params(request: Desmos_Fees_V1beta1_QueryParamsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Fees_V1beta1_QueryParamsResponse>
}

extension Desmos_Fees_V1beta1_QueryProvider {
  internal var serviceName: Substring { return "desmos.fees.v1beta1.Query" }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Params":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Fees_V1beta1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Fees_V1beta1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        userFunction: self.params(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Desmos_Fees_V1beta1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'params'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeParamsInterceptors() -> [ServerInterceptor<Desmos_Fees_V1beta1_QueryParamsRequest, Desmos_Fees_V1beta1_QueryParamsResponse>]
}
