//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: kava/incentive/v1beta1/tx.proto
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


/// Msg defines the incentive Msg service.
///
/// Usage: instantiate `Kava_Incentive_V1beta1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Kava_Incentive_V1beta1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Kava_Incentive_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func claimUSDXMintingReward(
    _ request: Kava_Incentive_V1beta1_MsgClaimUSDXMintingReward,
    callOptions: CallOptions?
  ) -> UnaryCall<Kava_Incentive_V1beta1_MsgClaimUSDXMintingReward, Kava_Incentive_V1beta1_MsgClaimUSDXMintingRewardResponse>

  func claimHardReward(
    _ request: Kava_Incentive_V1beta1_MsgClaimHardReward,
    callOptions: CallOptions?
  ) -> UnaryCall<Kava_Incentive_V1beta1_MsgClaimHardReward, Kava_Incentive_V1beta1_MsgClaimHardRewardResponse>

  func claimDelegatorReward(
    _ request: Kava_Incentive_V1beta1_MsgClaimDelegatorReward,
    callOptions: CallOptions?
  ) -> UnaryCall<Kava_Incentive_V1beta1_MsgClaimDelegatorReward, Kava_Incentive_V1beta1_MsgClaimDelegatorRewardResponse>

  func claimSwapReward(
    _ request: Kava_Incentive_V1beta1_MsgClaimSwapReward,
    callOptions: CallOptions?
  ) -> UnaryCall<Kava_Incentive_V1beta1_MsgClaimSwapReward, Kava_Incentive_V1beta1_MsgClaimSwapRewardResponse>

  func claimSavingsReward(
    _ request: Kava_Incentive_V1beta1_MsgClaimSavingsReward,
    callOptions: CallOptions?
  ) -> UnaryCall<Kava_Incentive_V1beta1_MsgClaimSavingsReward, Kava_Incentive_V1beta1_MsgClaimSavingsRewardResponse>
}

extension Kava_Incentive_V1beta1_MsgClientProtocol {
  internal var serviceName: String {
    return "kava.incentive.v1beta1.Msg"
  }

  /// ClaimUSDXMintingReward is a message type used to claim USDX minting rewards
  ///
  /// - Parameters:
  ///   - request: Request to send to ClaimUSDXMintingReward.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func claimUSDXMintingReward(
    _ request: Kava_Incentive_V1beta1_MsgClaimUSDXMintingReward,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kava_Incentive_V1beta1_MsgClaimUSDXMintingReward, Kava_Incentive_V1beta1_MsgClaimUSDXMintingRewardResponse> {
    return self.makeUnaryCall(
      path: "/kava.incentive.v1beta1.Msg/ClaimUSDXMintingReward",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimUSDXMintingRewardInterceptors() ?? []
    )
  }

  /// ClaimHardReward is a message type used to claim Hard liquidity provider rewards
  ///
  /// - Parameters:
  ///   - request: Request to send to ClaimHardReward.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func claimHardReward(
    _ request: Kava_Incentive_V1beta1_MsgClaimHardReward,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kava_Incentive_V1beta1_MsgClaimHardReward, Kava_Incentive_V1beta1_MsgClaimHardRewardResponse> {
    return self.makeUnaryCall(
      path: "/kava.incentive.v1beta1.Msg/ClaimHardReward",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimHardRewardInterceptors() ?? []
    )
  }

  /// ClaimDelegatorReward is a message type used to claim delegator rewards
  ///
  /// - Parameters:
  ///   - request: Request to send to ClaimDelegatorReward.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func claimDelegatorReward(
    _ request: Kava_Incentive_V1beta1_MsgClaimDelegatorReward,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kava_Incentive_V1beta1_MsgClaimDelegatorReward, Kava_Incentive_V1beta1_MsgClaimDelegatorRewardResponse> {
    return self.makeUnaryCall(
      path: "/kava.incentive.v1beta1.Msg/ClaimDelegatorReward",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimDelegatorRewardInterceptors() ?? []
    )
  }

  /// ClaimSwapReward is a message type used to claim delegator rewards
  ///
  /// - Parameters:
  ///   - request: Request to send to ClaimSwapReward.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func claimSwapReward(
    _ request: Kava_Incentive_V1beta1_MsgClaimSwapReward,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kava_Incentive_V1beta1_MsgClaimSwapReward, Kava_Incentive_V1beta1_MsgClaimSwapRewardResponse> {
    return self.makeUnaryCall(
      path: "/kava.incentive.v1beta1.Msg/ClaimSwapReward",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimSwapRewardInterceptors() ?? []
    )
  }

  /// ClaimSavingsReward is a message type used to claim savings rewards
  ///
  /// - Parameters:
  ///   - request: Request to send to ClaimSavingsReward.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func claimSavingsReward(
    _ request: Kava_Incentive_V1beta1_MsgClaimSavingsReward,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kava_Incentive_V1beta1_MsgClaimSavingsReward, Kava_Incentive_V1beta1_MsgClaimSavingsRewardResponse> {
    return self.makeUnaryCall(
      path: "/kava.incentive.v1beta1.Msg/ClaimSavingsReward",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClaimSavingsRewardInterceptors() ?? []
    )
  }
}

internal protocol Kava_Incentive_V1beta1_MsgClientInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when invoking 'claimUSDXMintingReward'.
  func makeClaimUSDXMintingRewardInterceptors() -> [ClientInterceptor<Kava_Incentive_V1beta1_MsgClaimUSDXMintingReward, Kava_Incentive_V1beta1_MsgClaimUSDXMintingRewardResponse>]

  /// - Returns: Interceptors to use when invoking 'claimHardReward'.
  func makeClaimHardRewardInterceptors() -> [ClientInterceptor<Kava_Incentive_V1beta1_MsgClaimHardReward, Kava_Incentive_V1beta1_MsgClaimHardRewardResponse>]

  /// - Returns: Interceptors to use when invoking 'claimDelegatorReward'.
  func makeClaimDelegatorRewardInterceptors() -> [ClientInterceptor<Kava_Incentive_V1beta1_MsgClaimDelegatorReward, Kava_Incentive_V1beta1_MsgClaimDelegatorRewardResponse>]

  /// - Returns: Interceptors to use when invoking 'claimSwapReward'.
  func makeClaimSwapRewardInterceptors() -> [ClientInterceptor<Kava_Incentive_V1beta1_MsgClaimSwapReward, Kava_Incentive_V1beta1_MsgClaimSwapRewardResponse>]

  /// - Returns: Interceptors to use when invoking 'claimSavingsReward'.
  func makeClaimSavingsRewardInterceptors() -> [ClientInterceptor<Kava_Incentive_V1beta1_MsgClaimSavingsReward, Kava_Incentive_V1beta1_MsgClaimSavingsRewardResponse>]
}

internal final class Kava_Incentive_V1beta1_MsgClient: Kava_Incentive_V1beta1_MsgClientProtocol {
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Kava_Incentive_V1beta1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the kava.incentive.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Kava_Incentive_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the incentive Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Kava_Incentive_V1beta1_MsgProvider: CallHandlerProvider {
  var interceptors: Kava_Incentive_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  /// ClaimUSDXMintingReward is a message type used to claim USDX minting rewards
  func claimUSDXMintingReward(request: Kava_Incentive_V1beta1_MsgClaimUSDXMintingReward, context: StatusOnlyCallContext) -> EventLoopFuture<Kava_Incentive_V1beta1_MsgClaimUSDXMintingRewardResponse>

  /// ClaimHardReward is a message type used to claim Hard liquidity provider rewards
  func claimHardReward(request: Kava_Incentive_V1beta1_MsgClaimHardReward, context: StatusOnlyCallContext) -> EventLoopFuture<Kava_Incentive_V1beta1_MsgClaimHardRewardResponse>

  /// ClaimDelegatorReward is a message type used to claim delegator rewards
  func claimDelegatorReward(request: Kava_Incentive_V1beta1_MsgClaimDelegatorReward, context: StatusOnlyCallContext) -> EventLoopFuture<Kava_Incentive_V1beta1_MsgClaimDelegatorRewardResponse>

  /// ClaimSwapReward is a message type used to claim delegator rewards
  func claimSwapReward(request: Kava_Incentive_V1beta1_MsgClaimSwapReward, context: StatusOnlyCallContext) -> EventLoopFuture<Kava_Incentive_V1beta1_MsgClaimSwapRewardResponse>

  /// ClaimSavingsReward is a message type used to claim savings rewards
  func claimSavingsReward(request: Kava_Incentive_V1beta1_MsgClaimSavingsReward, context: StatusOnlyCallContext) -> EventLoopFuture<Kava_Incentive_V1beta1_MsgClaimSavingsRewardResponse>
}

extension Kava_Incentive_V1beta1_MsgProvider {
  internal var serviceName: Substring { return "kava.incentive.v1beta1.Msg" }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "ClaimUSDXMintingReward":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Incentive_V1beta1_MsgClaimUSDXMintingReward>(),
        responseSerializer: ProtobufSerializer<Kava_Incentive_V1beta1_MsgClaimUSDXMintingRewardResponse>(),
        interceptors: self.interceptors?.makeClaimUSDXMintingRewardInterceptors() ?? [],
        userFunction: self.claimUSDXMintingReward(request:context:)
      )

    case "ClaimHardReward":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Incentive_V1beta1_MsgClaimHardReward>(),
        responseSerializer: ProtobufSerializer<Kava_Incentive_V1beta1_MsgClaimHardRewardResponse>(),
        interceptors: self.interceptors?.makeClaimHardRewardInterceptors() ?? [],
        userFunction: self.claimHardReward(request:context:)
      )

    case "ClaimDelegatorReward":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Incentive_V1beta1_MsgClaimDelegatorReward>(),
        responseSerializer: ProtobufSerializer<Kava_Incentive_V1beta1_MsgClaimDelegatorRewardResponse>(),
        interceptors: self.interceptors?.makeClaimDelegatorRewardInterceptors() ?? [],
        userFunction: self.claimDelegatorReward(request:context:)
      )

    case "ClaimSwapReward":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Incentive_V1beta1_MsgClaimSwapReward>(),
        responseSerializer: ProtobufSerializer<Kava_Incentive_V1beta1_MsgClaimSwapRewardResponse>(),
        interceptors: self.interceptors?.makeClaimSwapRewardInterceptors() ?? [],
        userFunction: self.claimSwapReward(request:context:)
      )

    case "ClaimSavingsReward":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Incentive_V1beta1_MsgClaimSavingsReward>(),
        responseSerializer: ProtobufSerializer<Kava_Incentive_V1beta1_MsgClaimSavingsRewardResponse>(),
        interceptors: self.interceptors?.makeClaimSavingsRewardInterceptors() ?? [],
        userFunction: self.claimSavingsReward(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Kava_Incentive_V1beta1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'claimUSDXMintingReward'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeClaimUSDXMintingRewardInterceptors() -> [ServerInterceptor<Kava_Incentive_V1beta1_MsgClaimUSDXMintingReward, Kava_Incentive_V1beta1_MsgClaimUSDXMintingRewardResponse>]

  /// - Returns: Interceptors to use when handling 'claimHardReward'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeClaimHardRewardInterceptors() -> [ServerInterceptor<Kava_Incentive_V1beta1_MsgClaimHardReward, Kava_Incentive_V1beta1_MsgClaimHardRewardResponse>]

  /// - Returns: Interceptors to use when handling 'claimDelegatorReward'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeClaimDelegatorRewardInterceptors() -> [ServerInterceptor<Kava_Incentive_V1beta1_MsgClaimDelegatorReward, Kava_Incentive_V1beta1_MsgClaimDelegatorRewardResponse>]

  /// - Returns: Interceptors to use when handling 'claimSwapReward'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeClaimSwapRewardInterceptors() -> [ServerInterceptor<Kava_Incentive_V1beta1_MsgClaimSwapReward, Kava_Incentive_V1beta1_MsgClaimSwapRewardResponse>]

  /// - Returns: Interceptors to use when handling 'claimSavingsReward'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeClaimSavingsRewardInterceptors() -> [ServerInterceptor<Kava_Incentive_V1beta1_MsgClaimSavingsReward, Kava_Incentive_V1beta1_MsgClaimSavingsRewardResponse>]
}
