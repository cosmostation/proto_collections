//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: kava/cdp/v1beta1/query.proto
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


/// Query defines the gRPC querier service for cdp module
///
/// Usage: instantiate `Kava_Cdp_V1beta1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Kava_Cdp_V1beta1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Kava_Cdp_V1beta1_QueryClientInterceptorFactoryProtocol? { get }

  func params(
    _ request: Kava_Cdp_V1beta1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Kava_Cdp_V1beta1_QueryParamsRequest, Kava_Cdp_V1beta1_QueryParamsResponse>

  func accounts(
    _ request: Kava_Cdp_V1beta1_QueryAccountsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Kava_Cdp_V1beta1_QueryAccountsRequest, Kava_Cdp_V1beta1_QueryAccountsResponse>

  func totalPrincipal(
    _ request: Kava_Cdp_V1beta1_QueryTotalPrincipalRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Kava_Cdp_V1beta1_QueryTotalPrincipalRequest, Kava_Cdp_V1beta1_QueryTotalPrincipalResponse>

  func totalCollateral(
    _ request: Kava_Cdp_V1beta1_QueryTotalCollateralRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Kava_Cdp_V1beta1_QueryTotalCollateralRequest, Kava_Cdp_V1beta1_QueryTotalCollateralResponse>

  func cdps(
    _ request: Kava_Cdp_V1beta1_QueryCdpsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Kava_Cdp_V1beta1_QueryCdpsRequest, Kava_Cdp_V1beta1_QueryCdpsResponse>

  func cdp(
    _ request: Kava_Cdp_V1beta1_QueryCdpRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Kava_Cdp_V1beta1_QueryCdpRequest, Kava_Cdp_V1beta1_QueryCdpResponse>

  func deposits(
    _ request: Kava_Cdp_V1beta1_QueryDepositsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Kava_Cdp_V1beta1_QueryDepositsRequest, Kava_Cdp_V1beta1_QueryDepositsResponse>
}

extension Kava_Cdp_V1beta1_QueryClientProtocol {
  internal var serviceName: String {
    return "kava.cdp.v1beta1.Query"
  }

  /// Params queries all parameters of the cdp module.
  ///
  /// - Parameters:
  ///   - request: Request to send to Params.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func params(
    _ request: Kava_Cdp_V1beta1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kava_Cdp_V1beta1_QueryParamsRequest, Kava_Cdp_V1beta1_QueryParamsResponse> {
    return self.makeUnaryCall(
      path: "/kava.cdp.v1beta1.Query/Params",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  /// Accounts queries the CDP module accounts.
  ///
  /// - Parameters:
  ///   - request: Request to send to Accounts.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func accounts(
    _ request: Kava_Cdp_V1beta1_QueryAccountsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kava_Cdp_V1beta1_QueryAccountsRequest, Kava_Cdp_V1beta1_QueryAccountsResponse> {
    return self.makeUnaryCall(
      path: "/kava.cdp.v1beta1.Query/Accounts",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAccountsInterceptors() ?? []
    )
  }

  /// TotalPrincipal queries the total principal of a given collateral type.
  ///
  /// - Parameters:
  ///   - request: Request to send to TotalPrincipal.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func totalPrincipal(
    _ request: Kava_Cdp_V1beta1_QueryTotalPrincipalRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kava_Cdp_V1beta1_QueryTotalPrincipalRequest, Kava_Cdp_V1beta1_QueryTotalPrincipalResponse> {
    return self.makeUnaryCall(
      path: "/kava.cdp.v1beta1.Query/TotalPrincipal",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTotalPrincipalInterceptors() ?? []
    )
  }

  /// TotalCollateral queries the total collateral of a given collateral type.
  ///
  /// - Parameters:
  ///   - request: Request to send to TotalCollateral.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func totalCollateral(
    _ request: Kava_Cdp_V1beta1_QueryTotalCollateralRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kava_Cdp_V1beta1_QueryTotalCollateralRequest, Kava_Cdp_V1beta1_QueryTotalCollateralResponse> {
    return self.makeUnaryCall(
      path: "/kava.cdp.v1beta1.Query/TotalCollateral",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTotalCollateralInterceptors() ?? []
    )
  }

  /// Cdps queries all active CDPs.
  ///
  /// - Parameters:
  ///   - request: Request to send to Cdps.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func cdps(
    _ request: Kava_Cdp_V1beta1_QueryCdpsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kava_Cdp_V1beta1_QueryCdpsRequest, Kava_Cdp_V1beta1_QueryCdpsResponse> {
    return self.makeUnaryCall(
      path: "/kava.cdp.v1beta1.Query/Cdps",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCdpsInterceptors() ?? []
    )
  }

  /// Cdp queries a CDP with the input owner address and collateral type.
  ///
  /// - Parameters:
  ///   - request: Request to send to Cdp.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func cdp(
    _ request: Kava_Cdp_V1beta1_QueryCdpRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kava_Cdp_V1beta1_QueryCdpRequest, Kava_Cdp_V1beta1_QueryCdpResponse> {
    return self.makeUnaryCall(
      path: "/kava.cdp.v1beta1.Query/Cdp",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCdpInterceptors() ?? []
    )
  }

  /// Deposits queries deposits associated with the CDP owned by an address for a collateral type.
  ///
  /// - Parameters:
  ///   - request: Request to send to Deposits.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func deposits(
    _ request: Kava_Cdp_V1beta1_QueryDepositsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kava_Cdp_V1beta1_QueryDepositsRequest, Kava_Cdp_V1beta1_QueryDepositsResponse> {
    return self.makeUnaryCall(
      path: "/kava.cdp.v1beta1.Query/Deposits",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDepositsInterceptors() ?? []
    )
  }
}

internal protocol Kava_Cdp_V1beta1_QueryClientInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when invoking 'params'.
  func makeParamsInterceptors() -> [ClientInterceptor<Kava_Cdp_V1beta1_QueryParamsRequest, Kava_Cdp_V1beta1_QueryParamsResponse>]

  /// - Returns: Interceptors to use when invoking 'accounts'.
  func makeAccountsInterceptors() -> [ClientInterceptor<Kava_Cdp_V1beta1_QueryAccountsRequest, Kava_Cdp_V1beta1_QueryAccountsResponse>]

  /// - Returns: Interceptors to use when invoking 'totalPrincipal'.
  func makeTotalPrincipalInterceptors() -> [ClientInterceptor<Kava_Cdp_V1beta1_QueryTotalPrincipalRequest, Kava_Cdp_V1beta1_QueryTotalPrincipalResponse>]

  /// - Returns: Interceptors to use when invoking 'totalCollateral'.
  func makeTotalCollateralInterceptors() -> [ClientInterceptor<Kava_Cdp_V1beta1_QueryTotalCollateralRequest, Kava_Cdp_V1beta1_QueryTotalCollateralResponse>]

  /// - Returns: Interceptors to use when invoking 'cdps'.
  func makeCdpsInterceptors() -> [ClientInterceptor<Kava_Cdp_V1beta1_QueryCdpsRequest, Kava_Cdp_V1beta1_QueryCdpsResponse>]

  /// - Returns: Interceptors to use when invoking 'cdp'.
  func makeCdpInterceptors() -> [ClientInterceptor<Kava_Cdp_V1beta1_QueryCdpRequest, Kava_Cdp_V1beta1_QueryCdpResponse>]

  /// - Returns: Interceptors to use when invoking 'deposits'.
  func makeDepositsInterceptors() -> [ClientInterceptor<Kava_Cdp_V1beta1_QueryDepositsRequest, Kava_Cdp_V1beta1_QueryDepositsResponse>]
}

internal final class Kava_Cdp_V1beta1_QueryClient: Kava_Cdp_V1beta1_QueryClientProtocol {
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Kava_Cdp_V1beta1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the kava.cdp.v1beta1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Kava_Cdp_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service for cdp module
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Kava_Cdp_V1beta1_QueryProvider: CallHandlerProvider {
  var interceptors: Kava_Cdp_V1beta1_QueryServerInterceptorFactoryProtocol? { get }

  /// Params queries all parameters of the cdp module.
  func params(request: Kava_Cdp_V1beta1_QueryParamsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Kava_Cdp_V1beta1_QueryParamsResponse>

  /// Accounts queries the CDP module accounts.
  func accounts(request: Kava_Cdp_V1beta1_QueryAccountsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Kava_Cdp_V1beta1_QueryAccountsResponse>

  /// TotalPrincipal queries the total principal of a given collateral type.
  func totalPrincipal(request: Kava_Cdp_V1beta1_QueryTotalPrincipalRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Kava_Cdp_V1beta1_QueryTotalPrincipalResponse>

  /// TotalCollateral queries the total collateral of a given collateral type.
  func totalCollateral(request: Kava_Cdp_V1beta1_QueryTotalCollateralRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Kava_Cdp_V1beta1_QueryTotalCollateralResponse>

  /// Cdps queries all active CDPs.
  func cdps(request: Kava_Cdp_V1beta1_QueryCdpsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Kava_Cdp_V1beta1_QueryCdpsResponse>

  /// Cdp queries a CDP with the input owner address and collateral type.
  func cdp(request: Kava_Cdp_V1beta1_QueryCdpRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Kava_Cdp_V1beta1_QueryCdpResponse>

  /// Deposits queries deposits associated with the CDP owned by an address for a collateral type.
  func deposits(request: Kava_Cdp_V1beta1_QueryDepositsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Kava_Cdp_V1beta1_QueryDepositsResponse>
}

extension Kava_Cdp_V1beta1_QueryProvider {
  internal var serviceName: Substring { return "kava.cdp.v1beta1.Query" }

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
        requestDeserializer: ProtobufDeserializer<Kava_Cdp_V1beta1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Kava_Cdp_V1beta1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        userFunction: self.params(request:context:)
      )

    case "Accounts":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Cdp_V1beta1_QueryAccountsRequest>(),
        responseSerializer: ProtobufSerializer<Kava_Cdp_V1beta1_QueryAccountsResponse>(),
        interceptors: self.interceptors?.makeAccountsInterceptors() ?? [],
        userFunction: self.accounts(request:context:)
      )

    case "TotalPrincipal":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Cdp_V1beta1_QueryTotalPrincipalRequest>(),
        responseSerializer: ProtobufSerializer<Kava_Cdp_V1beta1_QueryTotalPrincipalResponse>(),
        interceptors: self.interceptors?.makeTotalPrincipalInterceptors() ?? [],
        userFunction: self.totalPrincipal(request:context:)
      )

    case "TotalCollateral":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Cdp_V1beta1_QueryTotalCollateralRequest>(),
        responseSerializer: ProtobufSerializer<Kava_Cdp_V1beta1_QueryTotalCollateralResponse>(),
        interceptors: self.interceptors?.makeTotalCollateralInterceptors() ?? [],
        userFunction: self.totalCollateral(request:context:)
      )

    case "Cdps":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Cdp_V1beta1_QueryCdpsRequest>(),
        responseSerializer: ProtobufSerializer<Kava_Cdp_V1beta1_QueryCdpsResponse>(),
        interceptors: self.interceptors?.makeCdpsInterceptors() ?? [],
        userFunction: self.cdps(request:context:)
      )

    case "Cdp":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Cdp_V1beta1_QueryCdpRequest>(),
        responseSerializer: ProtobufSerializer<Kava_Cdp_V1beta1_QueryCdpResponse>(),
        interceptors: self.interceptors?.makeCdpInterceptors() ?? [],
        userFunction: self.cdp(request:context:)
      )

    case "Deposits":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Cdp_V1beta1_QueryDepositsRequest>(),
        responseSerializer: ProtobufSerializer<Kava_Cdp_V1beta1_QueryDepositsResponse>(),
        interceptors: self.interceptors?.makeDepositsInterceptors() ?? [],
        userFunction: self.deposits(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Kava_Cdp_V1beta1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'params'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeParamsInterceptors() -> [ServerInterceptor<Kava_Cdp_V1beta1_QueryParamsRequest, Kava_Cdp_V1beta1_QueryParamsResponse>]

  /// - Returns: Interceptors to use when handling 'accounts'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAccountsInterceptors() -> [ServerInterceptor<Kava_Cdp_V1beta1_QueryAccountsRequest, Kava_Cdp_V1beta1_QueryAccountsResponse>]

  /// - Returns: Interceptors to use when handling 'totalPrincipal'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeTotalPrincipalInterceptors() -> [ServerInterceptor<Kava_Cdp_V1beta1_QueryTotalPrincipalRequest, Kava_Cdp_V1beta1_QueryTotalPrincipalResponse>]

  /// - Returns: Interceptors to use when handling 'totalCollateral'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeTotalCollateralInterceptors() -> [ServerInterceptor<Kava_Cdp_V1beta1_QueryTotalCollateralRequest, Kava_Cdp_V1beta1_QueryTotalCollateralResponse>]

  /// - Returns: Interceptors to use when handling 'cdps'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCdpsInterceptors() -> [ServerInterceptor<Kava_Cdp_V1beta1_QueryCdpsRequest, Kava_Cdp_V1beta1_QueryCdpsResponse>]

  /// - Returns: Interceptors to use when handling 'cdp'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCdpInterceptors() -> [ServerInterceptor<Kava_Cdp_V1beta1_QueryCdpRequest, Kava_Cdp_V1beta1_QueryCdpResponse>]

  /// - Returns: Interceptors to use when handling 'deposits'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDepositsInterceptors() -> [ServerInterceptor<Kava_Cdp_V1beta1_QueryDepositsRequest, Kava_Cdp_V1beta1_QueryDepositsResponse>]
}
