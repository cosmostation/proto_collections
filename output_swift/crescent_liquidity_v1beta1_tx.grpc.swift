//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: crescent/liquidity/v1beta1/tx.proto
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


/// Msg defines the Msg service.
///
/// Usage: instantiate `Crescent_Liquidity_V1beta1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Crescent_Liquidity_V1beta1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Crescent_Liquidity_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func createPair(
    _ request: Crescent_Liquidity_V1beta1_MsgCreatePair,
    callOptions: CallOptions?
  ) -> UnaryCall<Crescent_Liquidity_V1beta1_MsgCreatePair, Crescent_Liquidity_V1beta1_MsgCreatePairResponse>

  func createPool(
    _ request: Crescent_Liquidity_V1beta1_MsgCreatePool,
    callOptions: CallOptions?
  ) -> UnaryCall<Crescent_Liquidity_V1beta1_MsgCreatePool, Crescent_Liquidity_V1beta1_MsgCreatePoolResponse>

  func deposit(
    _ request: Crescent_Liquidity_V1beta1_MsgDeposit,
    callOptions: CallOptions?
  ) -> UnaryCall<Crescent_Liquidity_V1beta1_MsgDeposit, Crescent_Liquidity_V1beta1_MsgDepositResponse>

  func withdraw(
    _ request: Crescent_Liquidity_V1beta1_MsgWithdraw,
    callOptions: CallOptions?
  ) -> UnaryCall<Crescent_Liquidity_V1beta1_MsgWithdraw, Crescent_Liquidity_V1beta1_MsgWithdrawResponse>

  func limitOrder(
    _ request: Crescent_Liquidity_V1beta1_MsgLimitOrder,
    callOptions: CallOptions?
  ) -> UnaryCall<Crescent_Liquidity_V1beta1_MsgLimitOrder, Crescent_Liquidity_V1beta1_MsgLimitOrderResponse>

  func marketOrder(
    _ request: Crescent_Liquidity_V1beta1_MsgMarketOrder,
    callOptions: CallOptions?
  ) -> UnaryCall<Crescent_Liquidity_V1beta1_MsgMarketOrder, Crescent_Liquidity_V1beta1_MsgMarketOrderResponse>

  func cancelOrder(
    _ request: Crescent_Liquidity_V1beta1_MsgCancelOrder,
    callOptions: CallOptions?
  ) -> UnaryCall<Crescent_Liquidity_V1beta1_MsgCancelOrder, Crescent_Liquidity_V1beta1_MsgCancelOrderResponse>

  func cancelAllOrders(
    _ request: Crescent_Liquidity_V1beta1_MsgCancelAllOrders,
    callOptions: CallOptions?
  ) -> UnaryCall<Crescent_Liquidity_V1beta1_MsgCancelAllOrders, Crescent_Liquidity_V1beta1_MsgCancelAllOrdersResponse>
}

extension Crescent_Liquidity_V1beta1_MsgClientProtocol {
  internal var serviceName: String {
    return "crescent.liquidity.v1beta1.Msg"
  }

  /// CreatePair defines a method for creating a pair
  ///
  /// - Parameters:
  ///   - request: Request to send to CreatePair.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func createPair(
    _ request: Crescent_Liquidity_V1beta1_MsgCreatePair,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Crescent_Liquidity_V1beta1_MsgCreatePair, Crescent_Liquidity_V1beta1_MsgCreatePairResponse> {
    return self.makeUnaryCall(
      path: "/crescent.liquidity.v1beta1.Msg/CreatePair",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreatePairInterceptors() ?? []
    )
  }

  /// CreatePool defines a method for creating a pool
  ///
  /// - Parameters:
  ///   - request: Request to send to CreatePool.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func createPool(
    _ request: Crescent_Liquidity_V1beta1_MsgCreatePool,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Crescent_Liquidity_V1beta1_MsgCreatePool, Crescent_Liquidity_V1beta1_MsgCreatePoolResponse> {
    return self.makeUnaryCall(
      path: "/crescent.liquidity.v1beta1.Msg/CreatePool",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreatePoolInterceptors() ?? []
    )
  }

  /// Deposit defines a method for depositing coins to the pool
  ///
  /// - Parameters:
  ///   - request: Request to send to Deposit.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func deposit(
    _ request: Crescent_Liquidity_V1beta1_MsgDeposit,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Crescent_Liquidity_V1beta1_MsgDeposit, Crescent_Liquidity_V1beta1_MsgDepositResponse> {
    return self.makeUnaryCall(
      path: "/crescent.liquidity.v1beta1.Msg/Deposit",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDepositInterceptors() ?? []
    )
  }

  /// Withdraw defines a method for withdrawing pool coin from the pool
  ///
  /// - Parameters:
  ///   - request: Request to send to Withdraw.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func withdraw(
    _ request: Crescent_Liquidity_V1beta1_MsgWithdraw,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Crescent_Liquidity_V1beta1_MsgWithdraw, Crescent_Liquidity_V1beta1_MsgWithdrawResponse> {
    return self.makeUnaryCall(
      path: "/crescent.liquidity.v1beta1.Msg/Withdraw",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWithdrawInterceptors() ?? []
    )
  }

  /// LimitOrder defines a method for making a limit order
  ///
  /// - Parameters:
  ///   - request: Request to send to LimitOrder.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func limitOrder(
    _ request: Crescent_Liquidity_V1beta1_MsgLimitOrder,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Crescent_Liquidity_V1beta1_MsgLimitOrder, Crescent_Liquidity_V1beta1_MsgLimitOrderResponse> {
    return self.makeUnaryCall(
      path: "/crescent.liquidity.v1beta1.Msg/LimitOrder",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeLimitOrderInterceptors() ?? []
    )
  }

  /// MarketOrder defines a method for making a market order
  ///
  /// - Parameters:
  ///   - request: Request to send to MarketOrder.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func marketOrder(
    _ request: Crescent_Liquidity_V1beta1_MsgMarketOrder,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Crescent_Liquidity_V1beta1_MsgMarketOrder, Crescent_Liquidity_V1beta1_MsgMarketOrderResponse> {
    return self.makeUnaryCall(
      path: "/crescent.liquidity.v1beta1.Msg/MarketOrder",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMarketOrderInterceptors() ?? []
    )
  }

  /// CancelOrder defines a method for cancelling an order
  ///
  /// - Parameters:
  ///   - request: Request to send to CancelOrder.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func cancelOrder(
    _ request: Crescent_Liquidity_V1beta1_MsgCancelOrder,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Crescent_Liquidity_V1beta1_MsgCancelOrder, Crescent_Liquidity_V1beta1_MsgCancelOrderResponse> {
    return self.makeUnaryCall(
      path: "/crescent.liquidity.v1beta1.Msg/CancelOrder",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCancelOrderInterceptors() ?? []
    )
  }

  /// CancelAllOrders defines a method for cancelling all orders
  ///
  /// - Parameters:
  ///   - request: Request to send to CancelAllOrders.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func cancelAllOrders(
    _ request: Crescent_Liquidity_V1beta1_MsgCancelAllOrders,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Crescent_Liquidity_V1beta1_MsgCancelAllOrders, Crescent_Liquidity_V1beta1_MsgCancelAllOrdersResponse> {
    return self.makeUnaryCall(
      path: "/crescent.liquidity.v1beta1.Msg/CancelAllOrders",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCancelAllOrdersInterceptors() ?? []
    )
  }
}

internal protocol Crescent_Liquidity_V1beta1_MsgClientInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when invoking 'createPair'.
  func makeCreatePairInterceptors() -> [ClientInterceptor<Crescent_Liquidity_V1beta1_MsgCreatePair, Crescent_Liquidity_V1beta1_MsgCreatePairResponse>]

  /// - Returns: Interceptors to use when invoking 'createPool'.
  func makeCreatePoolInterceptors() -> [ClientInterceptor<Crescent_Liquidity_V1beta1_MsgCreatePool, Crescent_Liquidity_V1beta1_MsgCreatePoolResponse>]

  /// - Returns: Interceptors to use when invoking 'deposit'.
  func makeDepositInterceptors() -> [ClientInterceptor<Crescent_Liquidity_V1beta1_MsgDeposit, Crescent_Liquidity_V1beta1_MsgDepositResponse>]

  /// - Returns: Interceptors to use when invoking 'withdraw'.
  func makeWithdrawInterceptors() -> [ClientInterceptor<Crescent_Liquidity_V1beta1_MsgWithdraw, Crescent_Liquidity_V1beta1_MsgWithdrawResponse>]

  /// - Returns: Interceptors to use when invoking 'limitOrder'.
  func makeLimitOrderInterceptors() -> [ClientInterceptor<Crescent_Liquidity_V1beta1_MsgLimitOrder, Crescent_Liquidity_V1beta1_MsgLimitOrderResponse>]

  /// - Returns: Interceptors to use when invoking 'marketOrder'.
  func makeMarketOrderInterceptors() -> [ClientInterceptor<Crescent_Liquidity_V1beta1_MsgMarketOrder, Crescent_Liquidity_V1beta1_MsgMarketOrderResponse>]

  /// - Returns: Interceptors to use when invoking 'cancelOrder'.
  func makeCancelOrderInterceptors() -> [ClientInterceptor<Crescent_Liquidity_V1beta1_MsgCancelOrder, Crescent_Liquidity_V1beta1_MsgCancelOrderResponse>]

  /// - Returns: Interceptors to use when invoking 'cancelAllOrders'.
  func makeCancelAllOrdersInterceptors() -> [ClientInterceptor<Crescent_Liquidity_V1beta1_MsgCancelAllOrders, Crescent_Liquidity_V1beta1_MsgCancelAllOrdersResponse>]
}

internal final class Crescent_Liquidity_V1beta1_MsgClient: Crescent_Liquidity_V1beta1_MsgClientProtocol {
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Crescent_Liquidity_V1beta1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the crescent.liquidity.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Crescent_Liquidity_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Crescent_Liquidity_V1beta1_MsgProvider: CallHandlerProvider {
  var interceptors: Crescent_Liquidity_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  /// CreatePair defines a method for creating a pair
  func createPair(request: Crescent_Liquidity_V1beta1_MsgCreatePair, context: StatusOnlyCallContext) -> EventLoopFuture<Crescent_Liquidity_V1beta1_MsgCreatePairResponse>

  /// CreatePool defines a method for creating a pool
  func createPool(request: Crescent_Liquidity_V1beta1_MsgCreatePool, context: StatusOnlyCallContext) -> EventLoopFuture<Crescent_Liquidity_V1beta1_MsgCreatePoolResponse>

  /// Deposit defines a method for depositing coins to the pool
  func deposit(request: Crescent_Liquidity_V1beta1_MsgDeposit, context: StatusOnlyCallContext) -> EventLoopFuture<Crescent_Liquidity_V1beta1_MsgDepositResponse>

  /// Withdraw defines a method for withdrawing pool coin from the pool
  func withdraw(request: Crescent_Liquidity_V1beta1_MsgWithdraw, context: StatusOnlyCallContext) -> EventLoopFuture<Crescent_Liquidity_V1beta1_MsgWithdrawResponse>

  /// LimitOrder defines a method for making a limit order
  func limitOrder(request: Crescent_Liquidity_V1beta1_MsgLimitOrder, context: StatusOnlyCallContext) -> EventLoopFuture<Crescent_Liquidity_V1beta1_MsgLimitOrderResponse>

  /// MarketOrder defines a method for making a market order
  func marketOrder(request: Crescent_Liquidity_V1beta1_MsgMarketOrder, context: StatusOnlyCallContext) -> EventLoopFuture<Crescent_Liquidity_V1beta1_MsgMarketOrderResponse>

  /// CancelOrder defines a method for cancelling an order
  func cancelOrder(request: Crescent_Liquidity_V1beta1_MsgCancelOrder, context: StatusOnlyCallContext) -> EventLoopFuture<Crescent_Liquidity_V1beta1_MsgCancelOrderResponse>

  /// CancelAllOrders defines a method for cancelling all orders
  func cancelAllOrders(request: Crescent_Liquidity_V1beta1_MsgCancelAllOrders, context: StatusOnlyCallContext) -> EventLoopFuture<Crescent_Liquidity_V1beta1_MsgCancelAllOrdersResponse>
}

extension Crescent_Liquidity_V1beta1_MsgProvider {
  internal var serviceName: Substring { return "crescent.liquidity.v1beta1.Msg" }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "CreatePair":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Crescent_Liquidity_V1beta1_MsgCreatePair>(),
        responseSerializer: ProtobufSerializer<Crescent_Liquidity_V1beta1_MsgCreatePairResponse>(),
        interceptors: self.interceptors?.makeCreatePairInterceptors() ?? [],
        userFunction: self.createPair(request:context:)
      )

    case "CreatePool":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Crescent_Liquidity_V1beta1_MsgCreatePool>(),
        responseSerializer: ProtobufSerializer<Crescent_Liquidity_V1beta1_MsgCreatePoolResponse>(),
        interceptors: self.interceptors?.makeCreatePoolInterceptors() ?? [],
        userFunction: self.createPool(request:context:)
      )

    case "Deposit":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Crescent_Liquidity_V1beta1_MsgDeposit>(),
        responseSerializer: ProtobufSerializer<Crescent_Liquidity_V1beta1_MsgDepositResponse>(),
        interceptors: self.interceptors?.makeDepositInterceptors() ?? [],
        userFunction: self.deposit(request:context:)
      )

    case "Withdraw":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Crescent_Liquidity_V1beta1_MsgWithdraw>(),
        responseSerializer: ProtobufSerializer<Crescent_Liquidity_V1beta1_MsgWithdrawResponse>(),
        interceptors: self.interceptors?.makeWithdrawInterceptors() ?? [],
        userFunction: self.withdraw(request:context:)
      )

    case "LimitOrder":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Crescent_Liquidity_V1beta1_MsgLimitOrder>(),
        responseSerializer: ProtobufSerializer<Crescent_Liquidity_V1beta1_MsgLimitOrderResponse>(),
        interceptors: self.interceptors?.makeLimitOrderInterceptors() ?? [],
        userFunction: self.limitOrder(request:context:)
      )

    case "MarketOrder":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Crescent_Liquidity_V1beta1_MsgMarketOrder>(),
        responseSerializer: ProtobufSerializer<Crescent_Liquidity_V1beta1_MsgMarketOrderResponse>(),
        interceptors: self.interceptors?.makeMarketOrderInterceptors() ?? [],
        userFunction: self.marketOrder(request:context:)
      )

    case "CancelOrder":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Crescent_Liquidity_V1beta1_MsgCancelOrder>(),
        responseSerializer: ProtobufSerializer<Crescent_Liquidity_V1beta1_MsgCancelOrderResponse>(),
        interceptors: self.interceptors?.makeCancelOrderInterceptors() ?? [],
        userFunction: self.cancelOrder(request:context:)
      )

    case "CancelAllOrders":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Crescent_Liquidity_V1beta1_MsgCancelAllOrders>(),
        responseSerializer: ProtobufSerializer<Crescent_Liquidity_V1beta1_MsgCancelAllOrdersResponse>(),
        interceptors: self.interceptors?.makeCancelAllOrdersInterceptors() ?? [],
        userFunction: self.cancelAllOrders(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Crescent_Liquidity_V1beta1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'createPair'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCreatePairInterceptors() -> [ServerInterceptor<Crescent_Liquidity_V1beta1_MsgCreatePair, Crescent_Liquidity_V1beta1_MsgCreatePairResponse>]

  /// - Returns: Interceptors to use when handling 'createPool'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCreatePoolInterceptors() -> [ServerInterceptor<Crescent_Liquidity_V1beta1_MsgCreatePool, Crescent_Liquidity_V1beta1_MsgCreatePoolResponse>]

  /// - Returns: Interceptors to use when handling 'deposit'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDepositInterceptors() -> [ServerInterceptor<Crescent_Liquidity_V1beta1_MsgDeposit, Crescent_Liquidity_V1beta1_MsgDepositResponse>]

  /// - Returns: Interceptors to use when handling 'withdraw'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeWithdrawInterceptors() -> [ServerInterceptor<Crescent_Liquidity_V1beta1_MsgWithdraw, Crescent_Liquidity_V1beta1_MsgWithdrawResponse>]

  /// - Returns: Interceptors to use when handling 'limitOrder'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeLimitOrderInterceptors() -> [ServerInterceptor<Crescent_Liquidity_V1beta1_MsgLimitOrder, Crescent_Liquidity_V1beta1_MsgLimitOrderResponse>]

  /// - Returns: Interceptors to use when handling 'marketOrder'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeMarketOrderInterceptors() -> [ServerInterceptor<Crescent_Liquidity_V1beta1_MsgMarketOrder, Crescent_Liquidity_V1beta1_MsgMarketOrderResponse>]

  /// - Returns: Interceptors to use when handling 'cancelOrder'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCancelOrderInterceptors() -> [ServerInterceptor<Crescent_Liquidity_V1beta1_MsgCancelOrder, Crescent_Liquidity_V1beta1_MsgCancelOrderResponse>]

  /// - Returns: Interceptors to use when handling 'cancelAllOrders'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCancelAllOrdersInterceptors() -> [ServerInterceptor<Crescent_Liquidity_V1beta1_MsgCancelAllOrders, Crescent_Liquidity_V1beta1_MsgCancelAllOrdersResponse>]
}
