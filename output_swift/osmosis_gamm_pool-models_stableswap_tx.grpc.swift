//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: osmosis/gamm/pool-models/stableswap/tx.proto
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


/// Usage: instantiate `Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func createStableswapPool(
    _ request: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPool,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPool, Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPoolResponse>

  func stableSwapAdjustScalingFactors(
    _ request: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactors,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactors, Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactorsResponse>
}

extension Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgClientProtocol {
  internal var serviceName: String {
    return "osmosis.gamm.poolmodels.stableswap.v1beta1.Msg"
  }

  /// Unary call to CreateStableswapPool
  ///
  /// - Parameters:
  ///   - request: Request to send to CreateStableswapPool.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func createStableswapPool(
    _ request: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPool,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPool, Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPoolResponse> {
    return self.makeUnaryCall(
      path: "/osmosis.gamm.poolmodels.stableswap.v1beta1.Msg/CreateStableswapPool",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateStableswapPoolInterceptors() ?? []
    )
  }

  /// Unary call to StableSwapAdjustScalingFactors
  ///
  /// - Parameters:
  ///   - request: Request to send to StableSwapAdjustScalingFactors.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func stableSwapAdjustScalingFactors(
    _ request: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactors,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactors, Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactorsResponse> {
    return self.makeUnaryCall(
      path: "/osmosis.gamm.poolmodels.stableswap.v1beta1.Msg/StableSwapAdjustScalingFactors",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeStableSwapAdjustScalingFactorsInterceptors() ?? []
    )
  }
}

internal protocol Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgClientInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when invoking 'createStableswapPool'.
  func makeCreateStableswapPoolInterceptors() -> [ClientInterceptor<Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPool, Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPoolResponse>]

  /// - Returns: Interceptors to use when invoking 'stableSwapAdjustScalingFactors'.
  func makeStableSwapAdjustScalingFactorsInterceptors() -> [ClientInterceptor<Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactors, Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactorsResponse>]
}

internal final class Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgClient: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgClientProtocol {
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the osmosis.gamm.poolmodels.stableswap.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// To build a server, implement a class that conforms to this protocol.
internal protocol Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgProvider: CallHandlerProvider {
  var interceptors: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  func createStableswapPool(request: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPool, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPoolResponse>

  func stableSwapAdjustScalingFactors(request: Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactors, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactorsResponse>
}

extension Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgProvider {
  internal var serviceName: Substring { return "osmosis.gamm.poolmodels.stableswap.v1beta1.Msg" }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "CreateStableswapPool":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPool>(),
        responseSerializer: ProtobufSerializer<Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPoolResponse>(),
        interceptors: self.interceptors?.makeCreateStableswapPoolInterceptors() ?? [],
        userFunction: self.createStableswapPool(request:context:)
      )

    case "StableSwapAdjustScalingFactors":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactors>(),
        responseSerializer: ProtobufSerializer<Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactorsResponse>(),
        interceptors: self.interceptors?.makeStableSwapAdjustScalingFactorsInterceptors() ?? [],
        userFunction: self.stableSwapAdjustScalingFactors(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'createStableswapPool'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCreateStableswapPoolInterceptors() -> [ServerInterceptor<Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPool, Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgCreateStableswapPoolResponse>]

  /// - Returns: Interceptors to use when handling 'stableSwapAdjustScalingFactors'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeStableSwapAdjustScalingFactorsInterceptors() -> [ServerInterceptor<Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactors, Osmosis_Gamm_Poolmodels_Stableswap_V1beta1_MsgStableSwapAdjustScalingFactorsResponse>]
}
