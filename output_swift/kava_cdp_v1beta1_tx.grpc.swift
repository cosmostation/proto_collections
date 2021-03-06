//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: kava/cdp/v1beta1/tx.proto
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


/// Msg defines the cdp Msg service.
///
/// Usage: instantiate `Kava_Cdp_V1beta1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Kava_Cdp_V1beta1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Kava_Cdp_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func createCDP(
    _ request: Kava_Cdp_V1beta1_MsgCreateCDP,
    callOptions: CallOptions?
  ) -> UnaryCall<Kava_Cdp_V1beta1_MsgCreateCDP, Kava_Cdp_V1beta1_MsgCreateCDPResponse>

  func deposit(
    _ request: Kava_Cdp_V1beta1_MsgDeposit,
    callOptions: CallOptions?
  ) -> UnaryCall<Kava_Cdp_V1beta1_MsgDeposit, Kava_Cdp_V1beta1_MsgDepositResponse>

  func withdraw(
    _ request: Kava_Cdp_V1beta1_MsgWithdraw,
    callOptions: CallOptions?
  ) -> UnaryCall<Kava_Cdp_V1beta1_MsgWithdraw, Kava_Cdp_V1beta1_MsgWithdrawResponse>

  func drawDebt(
    _ request: Kava_Cdp_V1beta1_MsgDrawDebt,
    callOptions: CallOptions?
  ) -> UnaryCall<Kava_Cdp_V1beta1_MsgDrawDebt, Kava_Cdp_V1beta1_MsgDrawDebtResponse>

  func repayDebt(
    _ request: Kava_Cdp_V1beta1_MsgRepayDebt,
    callOptions: CallOptions?
  ) -> UnaryCall<Kava_Cdp_V1beta1_MsgRepayDebt, Kava_Cdp_V1beta1_MsgRepayDebtResponse>

  func liquidate(
    _ request: Kava_Cdp_V1beta1_MsgLiquidate,
    callOptions: CallOptions?
  ) -> UnaryCall<Kava_Cdp_V1beta1_MsgLiquidate, Kava_Cdp_V1beta1_MsgLiquidateResponse>
}

extension Kava_Cdp_V1beta1_MsgClientProtocol {
  internal var serviceName: String {
    return "kava.cdp.v1beta1.Msg"
  }

  /// CreateCDP defines a method to create a new CDP.
  ///
  /// - Parameters:
  ///   - request: Request to send to CreateCDP.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func createCDP(
    _ request: Kava_Cdp_V1beta1_MsgCreateCDP,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kava_Cdp_V1beta1_MsgCreateCDP, Kava_Cdp_V1beta1_MsgCreateCDPResponse> {
    return self.makeUnaryCall(
      path: "/kava.cdp.v1beta1.Msg/CreateCDP",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateCDPInterceptors() ?? []
    )
  }

  /// Deposit defines a method to deposit to a CDP.
  ///
  /// - Parameters:
  ///   - request: Request to send to Deposit.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func deposit(
    _ request: Kava_Cdp_V1beta1_MsgDeposit,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kava_Cdp_V1beta1_MsgDeposit, Kava_Cdp_V1beta1_MsgDepositResponse> {
    return self.makeUnaryCall(
      path: "/kava.cdp.v1beta1.Msg/Deposit",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDepositInterceptors() ?? []
    )
  }

  /// Withdraw defines a method to withdraw collateral from a CDP.
  ///
  /// - Parameters:
  ///   - request: Request to send to Withdraw.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func withdraw(
    _ request: Kava_Cdp_V1beta1_MsgWithdraw,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kava_Cdp_V1beta1_MsgWithdraw, Kava_Cdp_V1beta1_MsgWithdrawResponse> {
    return self.makeUnaryCall(
      path: "/kava.cdp.v1beta1.Msg/Withdraw",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWithdrawInterceptors() ?? []
    )
  }

  /// DrawDebt defines a method to draw debt from a CDP.
  ///
  /// - Parameters:
  ///   - request: Request to send to DrawDebt.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func drawDebt(
    _ request: Kava_Cdp_V1beta1_MsgDrawDebt,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kava_Cdp_V1beta1_MsgDrawDebt, Kava_Cdp_V1beta1_MsgDrawDebtResponse> {
    return self.makeUnaryCall(
      path: "/kava.cdp.v1beta1.Msg/DrawDebt",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDrawDebtInterceptors() ?? []
    )
  }

  /// RepayDebt defines a method to repay debt from a CDP.
  ///
  /// - Parameters:
  ///   - request: Request to send to RepayDebt.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func repayDebt(
    _ request: Kava_Cdp_V1beta1_MsgRepayDebt,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kava_Cdp_V1beta1_MsgRepayDebt, Kava_Cdp_V1beta1_MsgRepayDebtResponse> {
    return self.makeUnaryCall(
      path: "/kava.cdp.v1beta1.Msg/RepayDebt",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRepayDebtInterceptors() ?? []
    )
  }

  /// Liquidate defines a method to attempt to liquidate a CDP whos
  /// collateralization ratio is under its liquidation ratio.
  ///
  /// - Parameters:
  ///   - request: Request to send to Liquidate.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func liquidate(
    _ request: Kava_Cdp_V1beta1_MsgLiquidate,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kava_Cdp_V1beta1_MsgLiquidate, Kava_Cdp_V1beta1_MsgLiquidateResponse> {
    return self.makeUnaryCall(
      path: "/kava.cdp.v1beta1.Msg/Liquidate",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeLiquidateInterceptors() ?? []
    )
  }
}

internal protocol Kava_Cdp_V1beta1_MsgClientInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when invoking 'createCDP'.
  func makeCreateCDPInterceptors() -> [ClientInterceptor<Kava_Cdp_V1beta1_MsgCreateCDP, Kava_Cdp_V1beta1_MsgCreateCDPResponse>]

  /// - Returns: Interceptors to use when invoking 'deposit'.
  func makeDepositInterceptors() -> [ClientInterceptor<Kava_Cdp_V1beta1_MsgDeposit, Kava_Cdp_V1beta1_MsgDepositResponse>]

  /// - Returns: Interceptors to use when invoking 'withdraw'.
  func makeWithdrawInterceptors() -> [ClientInterceptor<Kava_Cdp_V1beta1_MsgWithdraw, Kava_Cdp_V1beta1_MsgWithdrawResponse>]

  /// - Returns: Interceptors to use when invoking 'drawDebt'.
  func makeDrawDebtInterceptors() -> [ClientInterceptor<Kava_Cdp_V1beta1_MsgDrawDebt, Kava_Cdp_V1beta1_MsgDrawDebtResponse>]

  /// - Returns: Interceptors to use when invoking 'repayDebt'.
  func makeRepayDebtInterceptors() -> [ClientInterceptor<Kava_Cdp_V1beta1_MsgRepayDebt, Kava_Cdp_V1beta1_MsgRepayDebtResponse>]

  /// - Returns: Interceptors to use when invoking 'liquidate'.
  func makeLiquidateInterceptors() -> [ClientInterceptor<Kava_Cdp_V1beta1_MsgLiquidate, Kava_Cdp_V1beta1_MsgLiquidateResponse>]
}

internal final class Kava_Cdp_V1beta1_MsgClient: Kava_Cdp_V1beta1_MsgClientProtocol {
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Kava_Cdp_V1beta1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the kava.cdp.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Kava_Cdp_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the cdp Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Kava_Cdp_V1beta1_MsgProvider: CallHandlerProvider {
  var interceptors: Kava_Cdp_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  /// CreateCDP defines a method to create a new CDP.
  func createCDP(request: Kava_Cdp_V1beta1_MsgCreateCDP, context: StatusOnlyCallContext) -> EventLoopFuture<Kava_Cdp_V1beta1_MsgCreateCDPResponse>

  /// Deposit defines a method to deposit to a CDP.
  func deposit(request: Kava_Cdp_V1beta1_MsgDeposit, context: StatusOnlyCallContext) -> EventLoopFuture<Kava_Cdp_V1beta1_MsgDepositResponse>

  /// Withdraw defines a method to withdraw collateral from a CDP.
  func withdraw(request: Kava_Cdp_V1beta1_MsgWithdraw, context: StatusOnlyCallContext) -> EventLoopFuture<Kava_Cdp_V1beta1_MsgWithdrawResponse>

  /// DrawDebt defines a method to draw debt from a CDP.
  func drawDebt(request: Kava_Cdp_V1beta1_MsgDrawDebt, context: StatusOnlyCallContext) -> EventLoopFuture<Kava_Cdp_V1beta1_MsgDrawDebtResponse>

  /// RepayDebt defines a method to repay debt from a CDP.
  func repayDebt(request: Kava_Cdp_V1beta1_MsgRepayDebt, context: StatusOnlyCallContext) -> EventLoopFuture<Kava_Cdp_V1beta1_MsgRepayDebtResponse>

  /// Liquidate defines a method to attempt to liquidate a CDP whos
  /// collateralization ratio is under its liquidation ratio.
  func liquidate(request: Kava_Cdp_V1beta1_MsgLiquidate, context: StatusOnlyCallContext) -> EventLoopFuture<Kava_Cdp_V1beta1_MsgLiquidateResponse>
}

extension Kava_Cdp_V1beta1_MsgProvider {
  internal var serviceName: Substring { return "kava.cdp.v1beta1.Msg" }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "CreateCDP":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Cdp_V1beta1_MsgCreateCDP>(),
        responseSerializer: ProtobufSerializer<Kava_Cdp_V1beta1_MsgCreateCDPResponse>(),
        interceptors: self.interceptors?.makeCreateCDPInterceptors() ?? [],
        userFunction: self.createCDP(request:context:)
      )

    case "Deposit":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Cdp_V1beta1_MsgDeposit>(),
        responseSerializer: ProtobufSerializer<Kava_Cdp_V1beta1_MsgDepositResponse>(),
        interceptors: self.interceptors?.makeDepositInterceptors() ?? [],
        userFunction: self.deposit(request:context:)
      )

    case "Withdraw":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Cdp_V1beta1_MsgWithdraw>(),
        responseSerializer: ProtobufSerializer<Kava_Cdp_V1beta1_MsgWithdrawResponse>(),
        interceptors: self.interceptors?.makeWithdrawInterceptors() ?? [],
        userFunction: self.withdraw(request:context:)
      )

    case "DrawDebt":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Cdp_V1beta1_MsgDrawDebt>(),
        responseSerializer: ProtobufSerializer<Kava_Cdp_V1beta1_MsgDrawDebtResponse>(),
        interceptors: self.interceptors?.makeDrawDebtInterceptors() ?? [],
        userFunction: self.drawDebt(request:context:)
      )

    case "RepayDebt":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Cdp_V1beta1_MsgRepayDebt>(),
        responseSerializer: ProtobufSerializer<Kava_Cdp_V1beta1_MsgRepayDebtResponse>(),
        interceptors: self.interceptors?.makeRepayDebtInterceptors() ?? [],
        userFunction: self.repayDebt(request:context:)
      )

    case "Liquidate":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Cdp_V1beta1_MsgLiquidate>(),
        responseSerializer: ProtobufSerializer<Kava_Cdp_V1beta1_MsgLiquidateResponse>(),
        interceptors: self.interceptors?.makeLiquidateInterceptors() ?? [],
        userFunction: self.liquidate(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Kava_Cdp_V1beta1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'createCDP'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCreateCDPInterceptors() -> [ServerInterceptor<Kava_Cdp_V1beta1_MsgCreateCDP, Kava_Cdp_V1beta1_MsgCreateCDPResponse>]

  /// - Returns: Interceptors to use when handling 'deposit'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDepositInterceptors() -> [ServerInterceptor<Kava_Cdp_V1beta1_MsgDeposit, Kava_Cdp_V1beta1_MsgDepositResponse>]

  /// - Returns: Interceptors to use when handling 'withdraw'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeWithdrawInterceptors() -> [ServerInterceptor<Kava_Cdp_V1beta1_MsgWithdraw, Kava_Cdp_V1beta1_MsgWithdrawResponse>]

  /// - Returns: Interceptors to use when handling 'drawDebt'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDrawDebtInterceptors() -> [ServerInterceptor<Kava_Cdp_V1beta1_MsgDrawDebt, Kava_Cdp_V1beta1_MsgDrawDebtResponse>]

  /// - Returns: Interceptors to use when handling 'repayDebt'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRepayDebtInterceptors() -> [ServerInterceptor<Kava_Cdp_V1beta1_MsgRepayDebt, Kava_Cdp_V1beta1_MsgRepayDebtResponse>]

  /// - Returns: Interceptors to use when handling 'liquidate'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeLiquidateInterceptors() -> [ServerInterceptor<Kava_Cdp_V1beta1_MsgLiquidate, Kava_Cdp_V1beta1_MsgLiquidateResponse>]
}
