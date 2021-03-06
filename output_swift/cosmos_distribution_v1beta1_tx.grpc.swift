//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: cosmos/distribution/v1beta1/tx.proto
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


/// Msg defines the distribution Msg service.
///
/// Usage: instantiate `Cosmos_Distribution_V1beta1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Cosmos_Distribution_V1beta1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Cosmos_Distribution_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func setWithdrawAddress(
    _ request: Cosmos_Distribution_V1beta1_MsgSetWithdrawAddress,
    callOptions: CallOptions?
  ) -> UnaryCall<Cosmos_Distribution_V1beta1_MsgSetWithdrawAddress, Cosmos_Distribution_V1beta1_MsgSetWithdrawAddressResponse>

  func withdrawDelegatorReward(
    _ request: Cosmos_Distribution_V1beta1_MsgWithdrawDelegatorReward,
    callOptions: CallOptions?
  ) -> UnaryCall<Cosmos_Distribution_V1beta1_MsgWithdrawDelegatorReward, Cosmos_Distribution_V1beta1_MsgWithdrawDelegatorRewardResponse>

  func withdrawValidatorCommission(
    _ request: Cosmos_Distribution_V1beta1_MsgWithdrawValidatorCommission,
    callOptions: CallOptions?
  ) -> UnaryCall<Cosmos_Distribution_V1beta1_MsgWithdrawValidatorCommission, Cosmos_Distribution_V1beta1_MsgWithdrawValidatorCommissionResponse>

  func fundCommunityPool(
    _ request: Cosmos_Distribution_V1beta1_MsgFundCommunityPool,
    callOptions: CallOptions?
  ) -> UnaryCall<Cosmos_Distribution_V1beta1_MsgFundCommunityPool, Cosmos_Distribution_V1beta1_MsgFundCommunityPoolResponse>
}

extension Cosmos_Distribution_V1beta1_MsgClientProtocol {
  internal var serviceName: String {
    return "cosmos.distribution.v1beta1.Msg"
  }

  /// SetWithdrawAddress defines a method to change the withdraw address
  /// for a delegator (or validator self-delegation).
  ///
  /// - Parameters:
  ///   - request: Request to send to SetWithdrawAddress.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func setWithdrawAddress(
    _ request: Cosmos_Distribution_V1beta1_MsgSetWithdrawAddress,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Cosmos_Distribution_V1beta1_MsgSetWithdrawAddress, Cosmos_Distribution_V1beta1_MsgSetWithdrawAddressResponse> {
    return self.makeUnaryCall(
      path: "/cosmos.distribution.v1beta1.Msg/SetWithdrawAddress",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetWithdrawAddressInterceptors() ?? []
    )
  }

  /// WithdrawDelegatorReward defines a method to withdraw rewards of delegator
  /// from a single validator.
  ///
  /// - Parameters:
  ///   - request: Request to send to WithdrawDelegatorReward.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func withdrawDelegatorReward(
    _ request: Cosmos_Distribution_V1beta1_MsgWithdrawDelegatorReward,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Cosmos_Distribution_V1beta1_MsgWithdrawDelegatorReward, Cosmos_Distribution_V1beta1_MsgWithdrawDelegatorRewardResponse> {
    return self.makeUnaryCall(
      path: "/cosmos.distribution.v1beta1.Msg/WithdrawDelegatorReward",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWithdrawDelegatorRewardInterceptors() ?? []
    )
  }

  /// WithdrawValidatorCommission defines a method to withdraw the
  /// full commission to the validator address.
  ///
  /// - Parameters:
  ///   - request: Request to send to WithdrawValidatorCommission.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func withdrawValidatorCommission(
    _ request: Cosmos_Distribution_V1beta1_MsgWithdrawValidatorCommission,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Cosmos_Distribution_V1beta1_MsgWithdrawValidatorCommission, Cosmos_Distribution_V1beta1_MsgWithdrawValidatorCommissionResponse> {
    return self.makeUnaryCall(
      path: "/cosmos.distribution.v1beta1.Msg/WithdrawValidatorCommission",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWithdrawValidatorCommissionInterceptors() ?? []
    )
  }

  /// FundCommunityPool defines a method to allow an account to directly
  /// fund the community pool.
  ///
  /// - Parameters:
  ///   - request: Request to send to FundCommunityPool.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func fundCommunityPool(
    _ request: Cosmos_Distribution_V1beta1_MsgFundCommunityPool,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Cosmos_Distribution_V1beta1_MsgFundCommunityPool, Cosmos_Distribution_V1beta1_MsgFundCommunityPoolResponse> {
    return self.makeUnaryCall(
      path: "/cosmos.distribution.v1beta1.Msg/FundCommunityPool",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeFundCommunityPoolInterceptors() ?? []
    )
  }
}

internal protocol Cosmos_Distribution_V1beta1_MsgClientInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when invoking 'setWithdrawAddress'.
  func makeSetWithdrawAddressInterceptors() -> [ClientInterceptor<Cosmos_Distribution_V1beta1_MsgSetWithdrawAddress, Cosmos_Distribution_V1beta1_MsgSetWithdrawAddressResponse>]

  /// - Returns: Interceptors to use when invoking 'withdrawDelegatorReward'.
  func makeWithdrawDelegatorRewardInterceptors() -> [ClientInterceptor<Cosmos_Distribution_V1beta1_MsgWithdrawDelegatorReward, Cosmos_Distribution_V1beta1_MsgWithdrawDelegatorRewardResponse>]

  /// - Returns: Interceptors to use when invoking 'withdrawValidatorCommission'.
  func makeWithdrawValidatorCommissionInterceptors() -> [ClientInterceptor<Cosmos_Distribution_V1beta1_MsgWithdrawValidatorCommission, Cosmos_Distribution_V1beta1_MsgWithdrawValidatorCommissionResponse>]

  /// - Returns: Interceptors to use when invoking 'fundCommunityPool'.
  func makeFundCommunityPoolInterceptors() -> [ClientInterceptor<Cosmos_Distribution_V1beta1_MsgFundCommunityPool, Cosmos_Distribution_V1beta1_MsgFundCommunityPoolResponse>]
}

internal final class Cosmos_Distribution_V1beta1_MsgClient: Cosmos_Distribution_V1beta1_MsgClientProtocol {
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Cosmos_Distribution_V1beta1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the cosmos.distribution.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Cosmos_Distribution_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the distribution Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Cosmos_Distribution_V1beta1_MsgProvider: CallHandlerProvider {
  var interceptors: Cosmos_Distribution_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  /// SetWithdrawAddress defines a method to change the withdraw address
  /// for a delegator (or validator self-delegation).
  func setWithdrawAddress(request: Cosmos_Distribution_V1beta1_MsgSetWithdrawAddress, context: StatusOnlyCallContext) -> EventLoopFuture<Cosmos_Distribution_V1beta1_MsgSetWithdrawAddressResponse>

  /// WithdrawDelegatorReward defines a method to withdraw rewards of delegator
  /// from a single validator.
  func withdrawDelegatorReward(request: Cosmos_Distribution_V1beta1_MsgWithdrawDelegatorReward, context: StatusOnlyCallContext) -> EventLoopFuture<Cosmos_Distribution_V1beta1_MsgWithdrawDelegatorRewardResponse>

  /// WithdrawValidatorCommission defines a method to withdraw the
  /// full commission to the validator address.
  func withdrawValidatorCommission(request: Cosmos_Distribution_V1beta1_MsgWithdrawValidatorCommission, context: StatusOnlyCallContext) -> EventLoopFuture<Cosmos_Distribution_V1beta1_MsgWithdrawValidatorCommissionResponse>

  /// FundCommunityPool defines a method to allow an account to directly
  /// fund the community pool.
  func fundCommunityPool(request: Cosmos_Distribution_V1beta1_MsgFundCommunityPool, context: StatusOnlyCallContext) -> EventLoopFuture<Cosmos_Distribution_V1beta1_MsgFundCommunityPoolResponse>
}

extension Cosmos_Distribution_V1beta1_MsgProvider {
  internal var serviceName: Substring { return "cosmos.distribution.v1beta1.Msg" }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "SetWithdrawAddress":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cosmos_Distribution_V1beta1_MsgSetWithdrawAddress>(),
        responseSerializer: ProtobufSerializer<Cosmos_Distribution_V1beta1_MsgSetWithdrawAddressResponse>(),
        interceptors: self.interceptors?.makeSetWithdrawAddressInterceptors() ?? [],
        userFunction: self.setWithdrawAddress(request:context:)
      )

    case "WithdrawDelegatorReward":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cosmos_Distribution_V1beta1_MsgWithdrawDelegatorReward>(),
        responseSerializer: ProtobufSerializer<Cosmos_Distribution_V1beta1_MsgWithdrawDelegatorRewardResponse>(),
        interceptors: self.interceptors?.makeWithdrawDelegatorRewardInterceptors() ?? [],
        userFunction: self.withdrawDelegatorReward(request:context:)
      )

    case "WithdrawValidatorCommission":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cosmos_Distribution_V1beta1_MsgWithdrawValidatorCommission>(),
        responseSerializer: ProtobufSerializer<Cosmos_Distribution_V1beta1_MsgWithdrawValidatorCommissionResponse>(),
        interceptors: self.interceptors?.makeWithdrawValidatorCommissionInterceptors() ?? [],
        userFunction: self.withdrawValidatorCommission(request:context:)
      )

    case "FundCommunityPool":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cosmos_Distribution_V1beta1_MsgFundCommunityPool>(),
        responseSerializer: ProtobufSerializer<Cosmos_Distribution_V1beta1_MsgFundCommunityPoolResponse>(),
        interceptors: self.interceptors?.makeFundCommunityPoolInterceptors() ?? [],
        userFunction: self.fundCommunityPool(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Cosmos_Distribution_V1beta1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'setWithdrawAddress'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSetWithdrawAddressInterceptors() -> [ServerInterceptor<Cosmos_Distribution_V1beta1_MsgSetWithdrawAddress, Cosmos_Distribution_V1beta1_MsgSetWithdrawAddressResponse>]

  /// - Returns: Interceptors to use when handling 'withdrawDelegatorReward'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeWithdrawDelegatorRewardInterceptors() -> [ServerInterceptor<Cosmos_Distribution_V1beta1_MsgWithdrawDelegatorReward, Cosmos_Distribution_V1beta1_MsgWithdrawDelegatorRewardResponse>]

  /// - Returns: Interceptors to use when handling 'withdrawValidatorCommission'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeWithdrawValidatorCommissionInterceptors() -> [ServerInterceptor<Cosmos_Distribution_V1beta1_MsgWithdrawValidatorCommission, Cosmos_Distribution_V1beta1_MsgWithdrawValidatorCommissionResponse>]

  /// - Returns: Interceptors to use when handling 'fundCommunityPool'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeFundCommunityPoolInterceptors() -> [ServerInterceptor<Cosmos_Distribution_V1beta1_MsgFundCommunityPool, Cosmos_Distribution_V1beta1_MsgFundCommunityPoolResponse>]
}
