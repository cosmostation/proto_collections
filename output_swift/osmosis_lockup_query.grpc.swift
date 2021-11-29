//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: osmosis/lockup/query.proto
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
/// Usage: instantiate `Osmosis_Lockup_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Osmosis_Lockup_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Osmosis_Lockup_QueryClientInterceptorFactoryProtocol? { get }

  func moduleBalance(
    _ request: Osmosis_Lockup_ModuleBalanceRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Lockup_ModuleBalanceRequest, Osmosis_Lockup_ModuleBalanceResponse>

  func moduleLockedAmount(
    _ request: Osmosis_Lockup_ModuleLockedAmountRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Lockup_ModuleLockedAmountRequest, Osmosis_Lockup_ModuleLockedAmountResponse>

  func accountUnlockableCoins(
    _ request: Osmosis_Lockup_AccountUnlockableCoinsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Lockup_AccountUnlockableCoinsRequest, Osmosis_Lockup_AccountUnlockableCoinsResponse>

  func accountUnlockingCoins(
    _ request: Osmosis_Lockup_AccountUnlockingCoinsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Lockup_AccountUnlockingCoinsRequest, Osmosis_Lockup_AccountUnlockingCoinsResponse>

  func accountLockedCoins(
    _ request: Osmosis_Lockup_AccountLockedCoinsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Lockup_AccountLockedCoinsRequest, Osmosis_Lockup_AccountLockedCoinsResponse>

  func accountLockedPastTime(
    _ request: Osmosis_Lockup_AccountLockedPastTimeRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Lockup_AccountLockedPastTimeRequest, Osmosis_Lockup_AccountLockedPastTimeResponse>

  func accountLockedPastTimeNotUnlockingOnly(
    _ request: Osmosis_Lockup_AccountLockedPastTimeNotUnlockingOnlyRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Lockup_AccountLockedPastTimeNotUnlockingOnlyRequest, Osmosis_Lockup_AccountLockedPastTimeNotUnlockingOnlyResponse>

  func accountUnlockedBeforeTime(
    _ request: Osmosis_Lockup_AccountUnlockedBeforeTimeRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Lockup_AccountUnlockedBeforeTimeRequest, Osmosis_Lockup_AccountUnlockedBeforeTimeResponse>

  func accountLockedPastTimeDenom(
    _ request: Osmosis_Lockup_AccountLockedPastTimeDenomRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Lockup_AccountLockedPastTimeDenomRequest, Osmosis_Lockup_AccountLockedPastTimeDenomResponse>

  func lockedDenom(
    _ request: Osmosis_Lockup_LockedDenomRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Lockup_LockedDenomRequest, Osmosis_Lockup_LockedDenomResponse>

  func lockedByID(
    _ request: Osmosis_Lockup_LockedRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Lockup_LockedRequest, Osmosis_Lockup_LockedResponse>

  func accountLockedLongerDuration(
    _ request: Osmosis_Lockup_AccountLockedLongerDurationRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Lockup_AccountLockedLongerDurationRequest, Osmosis_Lockup_AccountLockedLongerDurationResponse>

  func accountLockedLongerDurationNotUnlockingOnly(
    _ request: Osmosis_Lockup_AccountLockedLongerDurationNotUnlockingOnlyRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Lockup_AccountLockedLongerDurationNotUnlockingOnlyRequest, Osmosis_Lockup_AccountLockedLongerDurationNotUnlockingOnlyResponse>

  func accountLockedLongerDurationDenom(
    _ request: Osmosis_Lockup_AccountLockedLongerDurationDenomRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Lockup_AccountLockedLongerDurationDenomRequest, Osmosis_Lockup_AccountLockedLongerDurationDenomResponse>
}

extension Osmosis_Lockup_QueryClientProtocol {
  internal var serviceName: String {
    return "osmosis.lockup.Query"
  }

  /// Return full balance of the module
  ///
  /// - Parameters:
  ///   - request: Request to send to ModuleBalance.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func moduleBalance(
    _ request: Osmosis_Lockup_ModuleBalanceRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Lockup_ModuleBalanceRequest, Osmosis_Lockup_ModuleBalanceResponse> {
    return self.makeUnaryCall(
      path: "/osmosis.lockup.Query/ModuleBalance",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeModuleBalanceInterceptors() ?? []
    )
  }

  /// Return locked balance of the module
  ///
  /// - Parameters:
  ///   - request: Request to send to ModuleLockedAmount.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func moduleLockedAmount(
    _ request: Osmosis_Lockup_ModuleLockedAmountRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Lockup_ModuleLockedAmountRequest, Osmosis_Lockup_ModuleLockedAmountResponse> {
    return self.makeUnaryCall(
      path: "/osmosis.lockup.Query/ModuleLockedAmount",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeModuleLockedAmountInterceptors() ?? []
    )
  }

  /// Returns unlockable coins which are not withdrawn yet
  ///
  /// - Parameters:
  ///   - request: Request to send to AccountUnlockableCoins.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func accountUnlockableCoins(
    _ request: Osmosis_Lockup_AccountUnlockableCoinsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Lockup_AccountUnlockableCoinsRequest, Osmosis_Lockup_AccountUnlockableCoinsResponse> {
    return self.makeUnaryCall(
      path: "/osmosis.lockup.Query/AccountUnlockableCoins",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAccountUnlockableCoinsInterceptors() ?? []
    )
  }

  /// Returns unlocking coins
  ///
  /// - Parameters:
  ///   - request: Request to send to AccountUnlockingCoins.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func accountUnlockingCoins(
    _ request: Osmosis_Lockup_AccountUnlockingCoinsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Lockup_AccountUnlockingCoinsRequest, Osmosis_Lockup_AccountUnlockingCoinsResponse> {
    return self.makeUnaryCall(
      path: "/osmosis.lockup.Query/AccountUnlockingCoins",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAccountUnlockingCoinsInterceptors() ?? []
    )
  }

  /// Return a locked coins that can't be withdrawn
  ///
  /// - Parameters:
  ///   - request: Request to send to AccountLockedCoins.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func accountLockedCoins(
    _ request: Osmosis_Lockup_AccountLockedCoinsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Lockup_AccountLockedCoinsRequest, Osmosis_Lockup_AccountLockedCoinsResponse> {
    return self.makeUnaryCall(
      path: "/osmosis.lockup.Query/AccountLockedCoins",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAccountLockedCoinsInterceptors() ?? []
    )
  }

  /// Returns locked records of an account with unlock time beyond timestamp
  ///
  /// - Parameters:
  ///   - request: Request to send to AccountLockedPastTime.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func accountLockedPastTime(
    _ request: Osmosis_Lockup_AccountLockedPastTimeRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Lockup_AccountLockedPastTimeRequest, Osmosis_Lockup_AccountLockedPastTimeResponse> {
    return self.makeUnaryCall(
      path: "/osmosis.lockup.Query/AccountLockedPastTime",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAccountLockedPastTimeInterceptors() ?? []
    )
  }

  /// Returns locked records of an account with unlock time beyond timestamp
  /// excluding tokens started unlocking
  ///
  /// - Parameters:
  ///   - request: Request to send to AccountLockedPastTimeNotUnlockingOnly.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func accountLockedPastTimeNotUnlockingOnly(
    _ request: Osmosis_Lockup_AccountLockedPastTimeNotUnlockingOnlyRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Lockup_AccountLockedPastTimeNotUnlockingOnlyRequest, Osmosis_Lockup_AccountLockedPastTimeNotUnlockingOnlyResponse> {
    return self.makeUnaryCall(
      path: "/osmosis.lockup.Query/AccountLockedPastTimeNotUnlockingOnly",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAccountLockedPastTimeNotUnlockingOnlyInterceptors() ?? []
    )
  }

  /// Returns unlocked records with unlock time before timestamp
  ///
  /// - Parameters:
  ///   - request: Request to send to AccountUnlockedBeforeTime.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func accountUnlockedBeforeTime(
    _ request: Osmosis_Lockup_AccountUnlockedBeforeTimeRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Lockup_AccountUnlockedBeforeTimeRequest, Osmosis_Lockup_AccountUnlockedBeforeTimeResponse> {
    return self.makeUnaryCall(
      path: "/osmosis.lockup.Query/AccountUnlockedBeforeTime",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAccountUnlockedBeforeTimeInterceptors() ?? []
    )
  }

  /// Returns lock records by address, timestamp, denom
  ///
  /// - Parameters:
  ///   - request: Request to send to AccountLockedPastTimeDenom.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func accountLockedPastTimeDenom(
    _ request: Osmosis_Lockup_AccountLockedPastTimeDenomRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Lockup_AccountLockedPastTimeDenomRequest, Osmosis_Lockup_AccountLockedPastTimeDenomResponse> {
    return self.makeUnaryCall(
      path: "/osmosis.lockup.Query/AccountLockedPastTimeDenom",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAccountLockedPastTimeDenomInterceptors() ?? []
    )
  }

  /// Returns total locked per denom with longer past given time
  ///
  /// - Parameters:
  ///   - request: Request to send to LockedDenom.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func lockedDenom(
    _ request: Osmosis_Lockup_LockedDenomRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Lockup_LockedDenomRequest, Osmosis_Lockup_LockedDenomResponse> {
    return self.makeUnaryCall(
      path: "/osmosis.lockup.Query/LockedDenom",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeLockedDenomInterceptors() ?? []
    )
  }

  /// Returns lock record by id
  ///
  /// - Parameters:
  ///   - request: Request to send to LockedByID.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func lockedByID(
    _ request: Osmosis_Lockup_LockedRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Lockup_LockedRequest, Osmosis_Lockup_LockedResponse> {
    return self.makeUnaryCall(
      path: "/osmosis.lockup.Query/LockedByID",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeLockedByIDInterceptors() ?? []
    )
  }

  /// Returns account locked records with longer duration
  ///
  /// - Parameters:
  ///   - request: Request to send to AccountLockedLongerDuration.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func accountLockedLongerDuration(
    _ request: Osmosis_Lockup_AccountLockedLongerDurationRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Lockup_AccountLockedLongerDurationRequest, Osmosis_Lockup_AccountLockedLongerDurationResponse> {
    return self.makeUnaryCall(
      path: "/osmosis.lockup.Query/AccountLockedLongerDuration",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAccountLockedLongerDurationInterceptors() ?? []
    )
  }

  /// Returns account locked records with longer duration excluding tokens
  /// started unlocking
  ///
  /// - Parameters:
  ///   - request: Request to send to AccountLockedLongerDurationNotUnlockingOnly.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func accountLockedLongerDurationNotUnlockingOnly(
    _ request: Osmosis_Lockup_AccountLockedLongerDurationNotUnlockingOnlyRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Lockup_AccountLockedLongerDurationNotUnlockingOnlyRequest, Osmosis_Lockup_AccountLockedLongerDurationNotUnlockingOnlyResponse> {
    return self.makeUnaryCall(
      path: "/osmosis.lockup.Query/AccountLockedLongerDurationNotUnlockingOnly",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAccountLockedLongerDurationNotUnlockingOnlyInterceptors() ?? []
    )
  }

  /// Returns account's locked records for a denom with longer duration
  ///
  /// - Parameters:
  ///   - request: Request to send to AccountLockedLongerDurationDenom.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func accountLockedLongerDurationDenom(
    _ request: Osmosis_Lockup_AccountLockedLongerDurationDenomRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Lockup_AccountLockedLongerDurationDenomRequest, Osmosis_Lockup_AccountLockedLongerDurationDenomResponse> {
    return self.makeUnaryCall(
      path: "/osmosis.lockup.Query/AccountLockedLongerDurationDenom",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAccountLockedLongerDurationDenomInterceptors() ?? []
    )
  }
}

internal protocol Osmosis_Lockup_QueryClientInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when invoking 'moduleBalance'.
  func makeModuleBalanceInterceptors() -> [ClientInterceptor<Osmosis_Lockup_ModuleBalanceRequest, Osmosis_Lockup_ModuleBalanceResponse>]

  /// - Returns: Interceptors to use when invoking 'moduleLockedAmount'.
  func makeModuleLockedAmountInterceptors() -> [ClientInterceptor<Osmosis_Lockup_ModuleLockedAmountRequest, Osmosis_Lockup_ModuleLockedAmountResponse>]

  /// - Returns: Interceptors to use when invoking 'accountUnlockableCoins'.
  func makeAccountUnlockableCoinsInterceptors() -> [ClientInterceptor<Osmosis_Lockup_AccountUnlockableCoinsRequest, Osmosis_Lockup_AccountUnlockableCoinsResponse>]

  /// - Returns: Interceptors to use when invoking 'accountUnlockingCoins'.
  func makeAccountUnlockingCoinsInterceptors() -> [ClientInterceptor<Osmosis_Lockup_AccountUnlockingCoinsRequest, Osmosis_Lockup_AccountUnlockingCoinsResponse>]

  /// - Returns: Interceptors to use when invoking 'accountLockedCoins'.
  func makeAccountLockedCoinsInterceptors() -> [ClientInterceptor<Osmosis_Lockup_AccountLockedCoinsRequest, Osmosis_Lockup_AccountLockedCoinsResponse>]

  /// - Returns: Interceptors to use when invoking 'accountLockedPastTime'.
  func makeAccountLockedPastTimeInterceptors() -> [ClientInterceptor<Osmosis_Lockup_AccountLockedPastTimeRequest, Osmosis_Lockup_AccountLockedPastTimeResponse>]

  /// - Returns: Interceptors to use when invoking 'accountLockedPastTimeNotUnlockingOnly'.
  func makeAccountLockedPastTimeNotUnlockingOnlyInterceptors() -> [ClientInterceptor<Osmosis_Lockup_AccountLockedPastTimeNotUnlockingOnlyRequest, Osmosis_Lockup_AccountLockedPastTimeNotUnlockingOnlyResponse>]

  /// - Returns: Interceptors to use when invoking 'accountUnlockedBeforeTime'.
  func makeAccountUnlockedBeforeTimeInterceptors() -> [ClientInterceptor<Osmosis_Lockup_AccountUnlockedBeforeTimeRequest, Osmosis_Lockup_AccountUnlockedBeforeTimeResponse>]

  /// - Returns: Interceptors to use when invoking 'accountLockedPastTimeDenom'.
  func makeAccountLockedPastTimeDenomInterceptors() -> [ClientInterceptor<Osmosis_Lockup_AccountLockedPastTimeDenomRequest, Osmosis_Lockup_AccountLockedPastTimeDenomResponse>]

  /// - Returns: Interceptors to use when invoking 'lockedDenom'.
  func makeLockedDenomInterceptors() -> [ClientInterceptor<Osmosis_Lockup_LockedDenomRequest, Osmosis_Lockup_LockedDenomResponse>]

  /// - Returns: Interceptors to use when invoking 'lockedByID'.
  func makeLockedByIDInterceptors() -> [ClientInterceptor<Osmosis_Lockup_LockedRequest, Osmosis_Lockup_LockedResponse>]

  /// - Returns: Interceptors to use when invoking 'accountLockedLongerDuration'.
  func makeAccountLockedLongerDurationInterceptors() -> [ClientInterceptor<Osmosis_Lockup_AccountLockedLongerDurationRequest, Osmosis_Lockup_AccountLockedLongerDurationResponse>]

  /// - Returns: Interceptors to use when invoking 'accountLockedLongerDurationNotUnlockingOnly'.
  func makeAccountLockedLongerDurationNotUnlockingOnlyInterceptors() -> [ClientInterceptor<Osmosis_Lockup_AccountLockedLongerDurationNotUnlockingOnlyRequest, Osmosis_Lockup_AccountLockedLongerDurationNotUnlockingOnlyResponse>]

  /// - Returns: Interceptors to use when invoking 'accountLockedLongerDurationDenom'.
  func makeAccountLockedLongerDurationDenomInterceptors() -> [ClientInterceptor<Osmosis_Lockup_AccountLockedLongerDurationDenomRequest, Osmosis_Lockup_AccountLockedLongerDurationDenomResponse>]
}

internal final class Osmosis_Lockup_QueryClient: Osmosis_Lockup_QueryClientProtocol {
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Osmosis_Lockup_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the osmosis.lockup.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Osmosis_Lockup_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Osmosis_Lockup_QueryProvider: CallHandlerProvider {
  var interceptors: Osmosis_Lockup_QueryServerInterceptorFactoryProtocol? { get }

  /// Return full balance of the module
  func moduleBalance(request: Osmosis_Lockup_ModuleBalanceRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Lockup_ModuleBalanceResponse>

  /// Return locked balance of the module
  func moduleLockedAmount(request: Osmosis_Lockup_ModuleLockedAmountRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Lockup_ModuleLockedAmountResponse>

  /// Returns unlockable coins which are not withdrawn yet
  func accountUnlockableCoins(request: Osmosis_Lockup_AccountUnlockableCoinsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Lockup_AccountUnlockableCoinsResponse>

  /// Returns unlocking coins
  func accountUnlockingCoins(request: Osmosis_Lockup_AccountUnlockingCoinsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Lockup_AccountUnlockingCoinsResponse>

  /// Return a locked coins that can't be withdrawn
  func accountLockedCoins(request: Osmosis_Lockup_AccountLockedCoinsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Lockup_AccountLockedCoinsResponse>

  /// Returns locked records of an account with unlock time beyond timestamp
  func accountLockedPastTime(request: Osmosis_Lockup_AccountLockedPastTimeRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Lockup_AccountLockedPastTimeResponse>

  /// Returns locked records of an account with unlock time beyond timestamp
  /// excluding tokens started unlocking
  func accountLockedPastTimeNotUnlockingOnly(request: Osmosis_Lockup_AccountLockedPastTimeNotUnlockingOnlyRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Lockup_AccountLockedPastTimeNotUnlockingOnlyResponse>

  /// Returns unlocked records with unlock time before timestamp
  func accountUnlockedBeforeTime(request: Osmosis_Lockup_AccountUnlockedBeforeTimeRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Lockup_AccountUnlockedBeforeTimeResponse>

  /// Returns lock records by address, timestamp, denom
  func accountLockedPastTimeDenom(request: Osmosis_Lockup_AccountLockedPastTimeDenomRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Lockup_AccountLockedPastTimeDenomResponse>

  /// Returns total locked per denom with longer past given time
  func lockedDenom(request: Osmosis_Lockup_LockedDenomRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Lockup_LockedDenomResponse>

  /// Returns lock record by id
  func lockedByID(request: Osmosis_Lockup_LockedRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Lockup_LockedResponse>

  /// Returns account locked records with longer duration
  func accountLockedLongerDuration(request: Osmosis_Lockup_AccountLockedLongerDurationRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Lockup_AccountLockedLongerDurationResponse>

  /// Returns account locked records with longer duration excluding tokens
  /// started unlocking
  func accountLockedLongerDurationNotUnlockingOnly(request: Osmosis_Lockup_AccountLockedLongerDurationNotUnlockingOnlyRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Lockup_AccountLockedLongerDurationNotUnlockingOnlyResponse>

  /// Returns account's locked records for a denom with longer duration
  func accountLockedLongerDurationDenom(request: Osmosis_Lockup_AccountLockedLongerDurationDenomRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Lockup_AccountLockedLongerDurationDenomResponse>
}

extension Osmosis_Lockup_QueryProvider {
  internal var serviceName: Substring { return "osmosis.lockup.Query" }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "ModuleBalance":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Lockup_ModuleBalanceRequest>(),
        responseSerializer: ProtobufSerializer<Osmosis_Lockup_ModuleBalanceResponse>(),
        interceptors: self.interceptors?.makeModuleBalanceInterceptors() ?? [],
        userFunction: self.moduleBalance(request:context:)
      )

    case "ModuleLockedAmount":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Lockup_ModuleLockedAmountRequest>(),
        responseSerializer: ProtobufSerializer<Osmosis_Lockup_ModuleLockedAmountResponse>(),
        interceptors: self.interceptors?.makeModuleLockedAmountInterceptors() ?? [],
        userFunction: self.moduleLockedAmount(request:context:)
      )

    case "AccountUnlockableCoins":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Lockup_AccountUnlockableCoinsRequest>(),
        responseSerializer: ProtobufSerializer<Osmosis_Lockup_AccountUnlockableCoinsResponse>(),
        interceptors: self.interceptors?.makeAccountUnlockableCoinsInterceptors() ?? [],
        userFunction: self.accountUnlockableCoins(request:context:)
      )

    case "AccountUnlockingCoins":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Lockup_AccountUnlockingCoinsRequest>(),
        responseSerializer: ProtobufSerializer<Osmosis_Lockup_AccountUnlockingCoinsResponse>(),
        interceptors: self.interceptors?.makeAccountUnlockingCoinsInterceptors() ?? [],
        userFunction: self.accountUnlockingCoins(request:context:)
      )

    case "AccountLockedCoins":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Lockup_AccountLockedCoinsRequest>(),
        responseSerializer: ProtobufSerializer<Osmosis_Lockup_AccountLockedCoinsResponse>(),
        interceptors: self.interceptors?.makeAccountLockedCoinsInterceptors() ?? [],
        userFunction: self.accountLockedCoins(request:context:)
      )

    case "AccountLockedPastTime":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Lockup_AccountLockedPastTimeRequest>(),
        responseSerializer: ProtobufSerializer<Osmosis_Lockup_AccountLockedPastTimeResponse>(),
        interceptors: self.interceptors?.makeAccountLockedPastTimeInterceptors() ?? [],
        userFunction: self.accountLockedPastTime(request:context:)
      )

    case "AccountLockedPastTimeNotUnlockingOnly":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Lockup_AccountLockedPastTimeNotUnlockingOnlyRequest>(),
        responseSerializer: ProtobufSerializer<Osmosis_Lockup_AccountLockedPastTimeNotUnlockingOnlyResponse>(),
        interceptors: self.interceptors?.makeAccountLockedPastTimeNotUnlockingOnlyInterceptors() ?? [],
        userFunction: self.accountLockedPastTimeNotUnlockingOnly(request:context:)
      )

    case "AccountUnlockedBeforeTime":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Lockup_AccountUnlockedBeforeTimeRequest>(),
        responseSerializer: ProtobufSerializer<Osmosis_Lockup_AccountUnlockedBeforeTimeResponse>(),
        interceptors: self.interceptors?.makeAccountUnlockedBeforeTimeInterceptors() ?? [],
        userFunction: self.accountUnlockedBeforeTime(request:context:)
      )

    case "AccountLockedPastTimeDenom":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Lockup_AccountLockedPastTimeDenomRequest>(),
        responseSerializer: ProtobufSerializer<Osmosis_Lockup_AccountLockedPastTimeDenomResponse>(),
        interceptors: self.interceptors?.makeAccountLockedPastTimeDenomInterceptors() ?? [],
        userFunction: self.accountLockedPastTimeDenom(request:context:)
      )

    case "LockedDenom":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Lockup_LockedDenomRequest>(),
        responseSerializer: ProtobufSerializer<Osmosis_Lockup_LockedDenomResponse>(),
        interceptors: self.interceptors?.makeLockedDenomInterceptors() ?? [],
        userFunction: self.lockedDenom(request:context:)
      )

    case "LockedByID":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Lockup_LockedRequest>(),
        responseSerializer: ProtobufSerializer<Osmosis_Lockup_LockedResponse>(),
        interceptors: self.interceptors?.makeLockedByIDInterceptors() ?? [],
        userFunction: self.lockedByID(request:context:)
      )

    case "AccountLockedLongerDuration":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Lockup_AccountLockedLongerDurationRequest>(),
        responseSerializer: ProtobufSerializer<Osmosis_Lockup_AccountLockedLongerDurationResponse>(),
        interceptors: self.interceptors?.makeAccountLockedLongerDurationInterceptors() ?? [],
        userFunction: self.accountLockedLongerDuration(request:context:)
      )

    case "AccountLockedLongerDurationNotUnlockingOnly":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Lockup_AccountLockedLongerDurationNotUnlockingOnlyRequest>(),
        responseSerializer: ProtobufSerializer<Osmosis_Lockup_AccountLockedLongerDurationNotUnlockingOnlyResponse>(),
        interceptors: self.interceptors?.makeAccountLockedLongerDurationNotUnlockingOnlyInterceptors() ?? [],
        userFunction: self.accountLockedLongerDurationNotUnlockingOnly(request:context:)
      )

    case "AccountLockedLongerDurationDenom":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Lockup_AccountLockedLongerDurationDenomRequest>(),
        responseSerializer: ProtobufSerializer<Osmosis_Lockup_AccountLockedLongerDurationDenomResponse>(),
        interceptors: self.interceptors?.makeAccountLockedLongerDurationDenomInterceptors() ?? [],
        userFunction: self.accountLockedLongerDurationDenom(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Osmosis_Lockup_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'moduleBalance'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeModuleBalanceInterceptors() -> [ServerInterceptor<Osmosis_Lockup_ModuleBalanceRequest, Osmosis_Lockup_ModuleBalanceResponse>]

  /// - Returns: Interceptors to use when handling 'moduleLockedAmount'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeModuleLockedAmountInterceptors() -> [ServerInterceptor<Osmosis_Lockup_ModuleLockedAmountRequest, Osmosis_Lockup_ModuleLockedAmountResponse>]

  /// - Returns: Interceptors to use when handling 'accountUnlockableCoins'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAccountUnlockableCoinsInterceptors() -> [ServerInterceptor<Osmosis_Lockup_AccountUnlockableCoinsRequest, Osmosis_Lockup_AccountUnlockableCoinsResponse>]

  /// - Returns: Interceptors to use when handling 'accountUnlockingCoins'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAccountUnlockingCoinsInterceptors() -> [ServerInterceptor<Osmosis_Lockup_AccountUnlockingCoinsRequest, Osmosis_Lockup_AccountUnlockingCoinsResponse>]

  /// - Returns: Interceptors to use when handling 'accountLockedCoins'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAccountLockedCoinsInterceptors() -> [ServerInterceptor<Osmosis_Lockup_AccountLockedCoinsRequest, Osmosis_Lockup_AccountLockedCoinsResponse>]

  /// - Returns: Interceptors to use when handling 'accountLockedPastTime'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAccountLockedPastTimeInterceptors() -> [ServerInterceptor<Osmosis_Lockup_AccountLockedPastTimeRequest, Osmosis_Lockup_AccountLockedPastTimeResponse>]

  /// - Returns: Interceptors to use when handling 'accountLockedPastTimeNotUnlockingOnly'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAccountLockedPastTimeNotUnlockingOnlyInterceptors() -> [ServerInterceptor<Osmosis_Lockup_AccountLockedPastTimeNotUnlockingOnlyRequest, Osmosis_Lockup_AccountLockedPastTimeNotUnlockingOnlyResponse>]

  /// - Returns: Interceptors to use when handling 'accountUnlockedBeforeTime'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAccountUnlockedBeforeTimeInterceptors() -> [ServerInterceptor<Osmosis_Lockup_AccountUnlockedBeforeTimeRequest, Osmosis_Lockup_AccountUnlockedBeforeTimeResponse>]

  /// - Returns: Interceptors to use when handling 'accountLockedPastTimeDenom'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAccountLockedPastTimeDenomInterceptors() -> [ServerInterceptor<Osmosis_Lockup_AccountLockedPastTimeDenomRequest, Osmosis_Lockup_AccountLockedPastTimeDenomResponse>]

  /// - Returns: Interceptors to use when handling 'lockedDenom'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeLockedDenomInterceptors() -> [ServerInterceptor<Osmosis_Lockup_LockedDenomRequest, Osmosis_Lockup_LockedDenomResponse>]

  /// - Returns: Interceptors to use when handling 'lockedByID'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeLockedByIDInterceptors() -> [ServerInterceptor<Osmosis_Lockup_LockedRequest, Osmosis_Lockup_LockedResponse>]

  /// - Returns: Interceptors to use when handling 'accountLockedLongerDuration'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAccountLockedLongerDurationInterceptors() -> [ServerInterceptor<Osmosis_Lockup_AccountLockedLongerDurationRequest, Osmosis_Lockup_AccountLockedLongerDurationResponse>]

  /// - Returns: Interceptors to use when handling 'accountLockedLongerDurationNotUnlockingOnly'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAccountLockedLongerDurationNotUnlockingOnlyInterceptors() -> [ServerInterceptor<Osmosis_Lockup_AccountLockedLongerDurationNotUnlockingOnlyRequest, Osmosis_Lockup_AccountLockedLongerDurationNotUnlockingOnlyResponse>]

  /// - Returns: Interceptors to use when handling 'accountLockedLongerDurationDenom'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAccountLockedLongerDurationDenomInterceptors() -> [ServerInterceptor<Osmosis_Lockup_AccountLockedLongerDurationDenomRequest, Osmosis_Lockup_AccountLockedLongerDurationDenomResponse>]
}
