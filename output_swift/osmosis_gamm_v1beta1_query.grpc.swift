//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: osmosis/gamm/v1beta1/query.proto
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


/// Usage: instantiate `Osmosis_Gamm_V1beta1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Osmosis_Gamm_V1beta1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Osmosis_Gamm_V1beta1_QueryClientInterceptorFactoryProtocol? { get }

  func pools(
    _ request: Osmosis_Gamm_V1beta1_QueryPoolsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Gamm_V1beta1_QueryPoolsRequest, Osmosis_Gamm_V1beta1_QueryPoolsResponse>

  func numPools(
    _ request: Osmosis_Gamm_V1beta1_QueryNumPoolsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Gamm_V1beta1_QueryNumPoolsRequest, Osmosis_Gamm_V1beta1_QueryNumPoolsResponse>

  func totalLiquidity(
    _ request: Osmosis_Gamm_V1beta1_QueryTotalLiquidityRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Gamm_V1beta1_QueryTotalLiquidityRequest, Osmosis_Gamm_V1beta1_QueryTotalLiquidityResponse>

  func pool(
    _ request: Osmosis_Gamm_V1beta1_QueryPoolRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Gamm_V1beta1_QueryPoolRequest, Osmosis_Gamm_V1beta1_QueryPoolResponse>

  func poolParams(
    _ request: Osmosis_Gamm_V1beta1_QueryPoolParamsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Gamm_V1beta1_QueryPoolParamsRequest, Osmosis_Gamm_V1beta1_QueryPoolParamsResponse>

  func totalPoolLiquidity(
    _ request: Osmosis_Gamm_V1beta1_QueryTotalPoolLiquidityRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Gamm_V1beta1_QueryTotalPoolLiquidityRequest, Osmosis_Gamm_V1beta1_QueryTotalPoolLiquidityResponse>

  func totalShares(
    _ request: Osmosis_Gamm_V1beta1_QueryTotalSharesRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Gamm_V1beta1_QueryTotalSharesRequest, Osmosis_Gamm_V1beta1_QueryTotalSharesResponse>

  func spotPrice(
    _ request: Osmosis_Gamm_V1beta1_QuerySpotPriceRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Gamm_V1beta1_QuerySpotPriceRequest, Osmosis_Gamm_V1beta1_QuerySpotPriceResponse>

  func estimateSwapExactAmountIn(
    _ request: Osmosis_Gamm_V1beta1_QuerySwapExactAmountInRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Gamm_V1beta1_QuerySwapExactAmountInRequest, Osmosis_Gamm_V1beta1_QuerySwapExactAmountInResponse>

  func estimateSwapExactAmountOut(
    _ request: Osmosis_Gamm_V1beta1_QuerySwapExactAmountOutRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Gamm_V1beta1_QuerySwapExactAmountOutRequest, Osmosis_Gamm_V1beta1_QuerySwapExactAmountOutResponse>
}

extension Osmosis_Gamm_V1beta1_QueryClientProtocol {
  internal var serviceName: String {
    return "osmosis.gamm.v1beta1.Query"
  }

  /// Unary call to Pools
  ///
  /// - Parameters:
  ///   - request: Request to send to Pools.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func pools(
    _ request: Osmosis_Gamm_V1beta1_QueryPoolsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Gamm_V1beta1_QueryPoolsRequest, Osmosis_Gamm_V1beta1_QueryPoolsResponse> {
    return self.makeUnaryCall(
      path: "/osmosis.gamm.v1beta1.Query/Pools",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makePoolsInterceptors() ?? []
    )
  }

  /// Unary call to NumPools
  ///
  /// - Parameters:
  ///   - request: Request to send to NumPools.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func numPools(
    _ request: Osmosis_Gamm_V1beta1_QueryNumPoolsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Gamm_V1beta1_QueryNumPoolsRequest, Osmosis_Gamm_V1beta1_QueryNumPoolsResponse> {
    return self.makeUnaryCall(
      path: "/osmosis.gamm.v1beta1.Query/NumPools",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeNumPoolsInterceptors() ?? []
    )
  }

  /// Unary call to TotalLiquidity
  ///
  /// - Parameters:
  ///   - request: Request to send to TotalLiquidity.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func totalLiquidity(
    _ request: Osmosis_Gamm_V1beta1_QueryTotalLiquidityRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Gamm_V1beta1_QueryTotalLiquidityRequest, Osmosis_Gamm_V1beta1_QueryTotalLiquidityResponse> {
    return self.makeUnaryCall(
      path: "/osmosis.gamm.v1beta1.Query/TotalLiquidity",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTotalLiquidityInterceptors() ?? []
    )
  }

  /// Per Pool gRPC Endpoints
  ///
  /// - Parameters:
  ///   - request: Request to send to Pool.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func pool(
    _ request: Osmosis_Gamm_V1beta1_QueryPoolRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Gamm_V1beta1_QueryPoolRequest, Osmosis_Gamm_V1beta1_QueryPoolResponse> {
    return self.makeUnaryCall(
      path: "/osmosis.gamm.v1beta1.Query/Pool",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makePoolInterceptors() ?? []
    )
  }

  /// Unary call to PoolParams
  ///
  /// - Parameters:
  ///   - request: Request to send to PoolParams.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func poolParams(
    _ request: Osmosis_Gamm_V1beta1_QueryPoolParamsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Gamm_V1beta1_QueryPoolParamsRequest, Osmosis_Gamm_V1beta1_QueryPoolParamsResponse> {
    return self.makeUnaryCall(
      path: "/osmosis.gamm.v1beta1.Query/PoolParams",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makePoolParamsInterceptors() ?? []
    )
  }

  /// Unary call to TotalPoolLiquidity
  ///
  /// - Parameters:
  ///   - request: Request to send to TotalPoolLiquidity.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func totalPoolLiquidity(
    _ request: Osmosis_Gamm_V1beta1_QueryTotalPoolLiquidityRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Gamm_V1beta1_QueryTotalPoolLiquidityRequest, Osmosis_Gamm_V1beta1_QueryTotalPoolLiquidityResponse> {
    return self.makeUnaryCall(
      path: "/osmosis.gamm.v1beta1.Query/TotalPoolLiquidity",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTotalPoolLiquidityInterceptors() ?? []
    )
  }

  /// Unary call to TotalShares
  ///
  /// - Parameters:
  ///   - request: Request to send to TotalShares.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func totalShares(
    _ request: Osmosis_Gamm_V1beta1_QueryTotalSharesRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Gamm_V1beta1_QueryTotalSharesRequest, Osmosis_Gamm_V1beta1_QueryTotalSharesResponse> {
    return self.makeUnaryCall(
      path: "/osmosis.gamm.v1beta1.Query/TotalShares",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTotalSharesInterceptors() ?? []
    )
  }

  /// SpotPrice defines a gRPC query handler that returns the spot price given
  /// a base denomination and a quote denomination.
  ///
  /// - Parameters:
  ///   - request: Request to send to SpotPrice.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func spotPrice(
    _ request: Osmosis_Gamm_V1beta1_QuerySpotPriceRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Gamm_V1beta1_QuerySpotPriceRequest, Osmosis_Gamm_V1beta1_QuerySpotPriceResponse> {
    return self.makeUnaryCall(
      path: "/osmosis.gamm.v1beta1.Query/SpotPrice",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSpotPriceInterceptors() ?? []
    )
  }

  /// Estimate the swap.
  ///
  /// - Parameters:
  ///   - request: Request to send to EstimateSwapExactAmountIn.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func estimateSwapExactAmountIn(
    _ request: Osmosis_Gamm_V1beta1_QuerySwapExactAmountInRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Gamm_V1beta1_QuerySwapExactAmountInRequest, Osmosis_Gamm_V1beta1_QuerySwapExactAmountInResponse> {
    return self.makeUnaryCall(
      path: "/osmosis.gamm.v1beta1.Query/EstimateSwapExactAmountIn",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeEstimateSwapExactAmountInInterceptors() ?? []
    )
  }

  /// Unary call to EstimateSwapExactAmountOut
  ///
  /// - Parameters:
  ///   - request: Request to send to EstimateSwapExactAmountOut.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func estimateSwapExactAmountOut(
    _ request: Osmosis_Gamm_V1beta1_QuerySwapExactAmountOutRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Gamm_V1beta1_QuerySwapExactAmountOutRequest, Osmosis_Gamm_V1beta1_QuerySwapExactAmountOutResponse> {
    return self.makeUnaryCall(
      path: "/osmosis.gamm.v1beta1.Query/EstimateSwapExactAmountOut",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeEstimateSwapExactAmountOutInterceptors() ?? []
    )
  }
}

internal protocol Osmosis_Gamm_V1beta1_QueryClientInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when invoking 'pools'.
  func makePoolsInterceptors() -> [ClientInterceptor<Osmosis_Gamm_V1beta1_QueryPoolsRequest, Osmosis_Gamm_V1beta1_QueryPoolsResponse>]

  /// - Returns: Interceptors to use when invoking 'numPools'.
  func makeNumPoolsInterceptors() -> [ClientInterceptor<Osmosis_Gamm_V1beta1_QueryNumPoolsRequest, Osmosis_Gamm_V1beta1_QueryNumPoolsResponse>]

  /// - Returns: Interceptors to use when invoking 'totalLiquidity'.
  func makeTotalLiquidityInterceptors() -> [ClientInterceptor<Osmosis_Gamm_V1beta1_QueryTotalLiquidityRequest, Osmosis_Gamm_V1beta1_QueryTotalLiquidityResponse>]

  /// - Returns: Interceptors to use when invoking 'pool'.
  func makePoolInterceptors() -> [ClientInterceptor<Osmosis_Gamm_V1beta1_QueryPoolRequest, Osmosis_Gamm_V1beta1_QueryPoolResponse>]

  /// - Returns: Interceptors to use when invoking 'poolParams'.
  func makePoolParamsInterceptors() -> [ClientInterceptor<Osmosis_Gamm_V1beta1_QueryPoolParamsRequest, Osmosis_Gamm_V1beta1_QueryPoolParamsResponse>]

  /// - Returns: Interceptors to use when invoking 'totalPoolLiquidity'.
  func makeTotalPoolLiquidityInterceptors() -> [ClientInterceptor<Osmosis_Gamm_V1beta1_QueryTotalPoolLiquidityRequest, Osmosis_Gamm_V1beta1_QueryTotalPoolLiquidityResponse>]

  /// - Returns: Interceptors to use when invoking 'totalShares'.
  func makeTotalSharesInterceptors() -> [ClientInterceptor<Osmosis_Gamm_V1beta1_QueryTotalSharesRequest, Osmosis_Gamm_V1beta1_QueryTotalSharesResponse>]

  /// - Returns: Interceptors to use when invoking 'spotPrice'.
  func makeSpotPriceInterceptors() -> [ClientInterceptor<Osmosis_Gamm_V1beta1_QuerySpotPriceRequest, Osmosis_Gamm_V1beta1_QuerySpotPriceResponse>]

  /// - Returns: Interceptors to use when invoking 'estimateSwapExactAmountIn'.
  func makeEstimateSwapExactAmountInInterceptors() -> [ClientInterceptor<Osmosis_Gamm_V1beta1_QuerySwapExactAmountInRequest, Osmosis_Gamm_V1beta1_QuerySwapExactAmountInResponse>]

  /// - Returns: Interceptors to use when invoking 'estimateSwapExactAmountOut'.
  func makeEstimateSwapExactAmountOutInterceptors() -> [ClientInterceptor<Osmosis_Gamm_V1beta1_QuerySwapExactAmountOutRequest, Osmosis_Gamm_V1beta1_QuerySwapExactAmountOutResponse>]
}

internal final class Osmosis_Gamm_V1beta1_QueryClient: Osmosis_Gamm_V1beta1_QueryClientProtocol {
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Osmosis_Gamm_V1beta1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the osmosis.gamm.v1beta1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Osmosis_Gamm_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// To build a server, implement a class that conforms to this protocol.
internal protocol Osmosis_Gamm_V1beta1_QueryProvider: CallHandlerProvider {
  var interceptors: Osmosis_Gamm_V1beta1_QueryServerInterceptorFactoryProtocol? { get }

  func pools(request: Osmosis_Gamm_V1beta1_QueryPoolsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Gamm_V1beta1_QueryPoolsResponse>

  func numPools(request: Osmosis_Gamm_V1beta1_QueryNumPoolsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Gamm_V1beta1_QueryNumPoolsResponse>

  func totalLiquidity(request: Osmosis_Gamm_V1beta1_QueryTotalLiquidityRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Gamm_V1beta1_QueryTotalLiquidityResponse>

  /// Per Pool gRPC Endpoints
  func pool(request: Osmosis_Gamm_V1beta1_QueryPoolRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Gamm_V1beta1_QueryPoolResponse>

  func poolParams(request: Osmosis_Gamm_V1beta1_QueryPoolParamsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Gamm_V1beta1_QueryPoolParamsResponse>

  func totalPoolLiquidity(request: Osmosis_Gamm_V1beta1_QueryTotalPoolLiquidityRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Gamm_V1beta1_QueryTotalPoolLiquidityResponse>

  func totalShares(request: Osmosis_Gamm_V1beta1_QueryTotalSharesRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Gamm_V1beta1_QueryTotalSharesResponse>

  /// SpotPrice defines a gRPC query handler that returns the spot price given
  /// a base denomination and a quote denomination.
  func spotPrice(request: Osmosis_Gamm_V1beta1_QuerySpotPriceRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Gamm_V1beta1_QuerySpotPriceResponse>

  /// Estimate the swap.
  func estimateSwapExactAmountIn(request: Osmosis_Gamm_V1beta1_QuerySwapExactAmountInRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Gamm_V1beta1_QuerySwapExactAmountInResponse>

  func estimateSwapExactAmountOut(request: Osmosis_Gamm_V1beta1_QuerySwapExactAmountOutRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Gamm_V1beta1_QuerySwapExactAmountOutResponse>
}

extension Osmosis_Gamm_V1beta1_QueryProvider {
  internal var serviceName: Substring { return "osmosis.gamm.v1beta1.Query" }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Pools":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Gamm_V1beta1_QueryPoolsRequest>(),
        responseSerializer: ProtobufSerializer<Osmosis_Gamm_V1beta1_QueryPoolsResponse>(),
        interceptors: self.interceptors?.makePoolsInterceptors() ?? [],
        userFunction: self.pools(request:context:)
      )

    case "NumPools":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Gamm_V1beta1_QueryNumPoolsRequest>(),
        responseSerializer: ProtobufSerializer<Osmosis_Gamm_V1beta1_QueryNumPoolsResponse>(),
        interceptors: self.interceptors?.makeNumPoolsInterceptors() ?? [],
        userFunction: self.numPools(request:context:)
      )

    case "TotalLiquidity":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Gamm_V1beta1_QueryTotalLiquidityRequest>(),
        responseSerializer: ProtobufSerializer<Osmosis_Gamm_V1beta1_QueryTotalLiquidityResponse>(),
        interceptors: self.interceptors?.makeTotalLiquidityInterceptors() ?? [],
        userFunction: self.totalLiquidity(request:context:)
      )

    case "Pool":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Gamm_V1beta1_QueryPoolRequest>(),
        responseSerializer: ProtobufSerializer<Osmosis_Gamm_V1beta1_QueryPoolResponse>(),
        interceptors: self.interceptors?.makePoolInterceptors() ?? [],
        userFunction: self.pool(request:context:)
      )

    case "PoolParams":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Gamm_V1beta1_QueryPoolParamsRequest>(),
        responseSerializer: ProtobufSerializer<Osmosis_Gamm_V1beta1_QueryPoolParamsResponse>(),
        interceptors: self.interceptors?.makePoolParamsInterceptors() ?? [],
        userFunction: self.poolParams(request:context:)
      )

    case "TotalPoolLiquidity":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Gamm_V1beta1_QueryTotalPoolLiquidityRequest>(),
        responseSerializer: ProtobufSerializer<Osmosis_Gamm_V1beta1_QueryTotalPoolLiquidityResponse>(),
        interceptors: self.interceptors?.makeTotalPoolLiquidityInterceptors() ?? [],
        userFunction: self.totalPoolLiquidity(request:context:)
      )

    case "TotalShares":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Gamm_V1beta1_QueryTotalSharesRequest>(),
        responseSerializer: ProtobufSerializer<Osmosis_Gamm_V1beta1_QueryTotalSharesResponse>(),
        interceptors: self.interceptors?.makeTotalSharesInterceptors() ?? [],
        userFunction: self.totalShares(request:context:)
      )

    case "SpotPrice":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Gamm_V1beta1_QuerySpotPriceRequest>(),
        responseSerializer: ProtobufSerializer<Osmosis_Gamm_V1beta1_QuerySpotPriceResponse>(),
        interceptors: self.interceptors?.makeSpotPriceInterceptors() ?? [],
        userFunction: self.spotPrice(request:context:)
      )

    case "EstimateSwapExactAmountIn":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Gamm_V1beta1_QuerySwapExactAmountInRequest>(),
        responseSerializer: ProtobufSerializer<Osmosis_Gamm_V1beta1_QuerySwapExactAmountInResponse>(),
        interceptors: self.interceptors?.makeEstimateSwapExactAmountInInterceptors() ?? [],
        userFunction: self.estimateSwapExactAmountIn(request:context:)
      )

    case "EstimateSwapExactAmountOut":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Gamm_V1beta1_QuerySwapExactAmountOutRequest>(),
        responseSerializer: ProtobufSerializer<Osmosis_Gamm_V1beta1_QuerySwapExactAmountOutResponse>(),
        interceptors: self.interceptors?.makeEstimateSwapExactAmountOutInterceptors() ?? [],
        userFunction: self.estimateSwapExactAmountOut(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Osmosis_Gamm_V1beta1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'pools'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makePoolsInterceptors() -> [ServerInterceptor<Osmosis_Gamm_V1beta1_QueryPoolsRequest, Osmosis_Gamm_V1beta1_QueryPoolsResponse>]

  /// - Returns: Interceptors to use when handling 'numPools'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeNumPoolsInterceptors() -> [ServerInterceptor<Osmosis_Gamm_V1beta1_QueryNumPoolsRequest, Osmosis_Gamm_V1beta1_QueryNumPoolsResponse>]

  /// - Returns: Interceptors to use when handling 'totalLiquidity'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeTotalLiquidityInterceptors() -> [ServerInterceptor<Osmosis_Gamm_V1beta1_QueryTotalLiquidityRequest, Osmosis_Gamm_V1beta1_QueryTotalLiquidityResponse>]

  /// - Returns: Interceptors to use when handling 'pool'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makePoolInterceptors() -> [ServerInterceptor<Osmosis_Gamm_V1beta1_QueryPoolRequest, Osmosis_Gamm_V1beta1_QueryPoolResponse>]

  /// - Returns: Interceptors to use when handling 'poolParams'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makePoolParamsInterceptors() -> [ServerInterceptor<Osmosis_Gamm_V1beta1_QueryPoolParamsRequest, Osmosis_Gamm_V1beta1_QueryPoolParamsResponse>]

  /// - Returns: Interceptors to use when handling 'totalPoolLiquidity'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeTotalPoolLiquidityInterceptors() -> [ServerInterceptor<Osmosis_Gamm_V1beta1_QueryTotalPoolLiquidityRequest, Osmosis_Gamm_V1beta1_QueryTotalPoolLiquidityResponse>]

  /// - Returns: Interceptors to use when handling 'totalShares'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeTotalSharesInterceptors() -> [ServerInterceptor<Osmosis_Gamm_V1beta1_QueryTotalSharesRequest, Osmosis_Gamm_V1beta1_QueryTotalSharesResponse>]

  /// - Returns: Interceptors to use when handling 'spotPrice'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSpotPriceInterceptors() -> [ServerInterceptor<Osmosis_Gamm_V1beta1_QuerySpotPriceRequest, Osmosis_Gamm_V1beta1_QuerySpotPriceResponse>]

  /// - Returns: Interceptors to use when handling 'estimateSwapExactAmountIn'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeEstimateSwapExactAmountInInterceptors() -> [ServerInterceptor<Osmosis_Gamm_V1beta1_QuerySwapExactAmountInRequest, Osmosis_Gamm_V1beta1_QuerySwapExactAmountInResponse>]

  /// - Returns: Interceptors to use when handling 'estimateSwapExactAmountOut'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeEstimateSwapExactAmountOutInterceptors() -> [ServerInterceptor<Osmosis_Gamm_V1beta1_QuerySwapExactAmountOutRequest, Osmosis_Gamm_V1beta1_QuerySwapExactAmountOutResponse>]
}
