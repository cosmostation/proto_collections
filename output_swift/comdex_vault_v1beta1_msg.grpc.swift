//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: comdex/vault/v1beta1/msg.proto
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


/// Usage: instantiate `Comdex_Vault_V1beta1_MsgServiceClient`, then call methods of this protocol to make API calls.
internal protocol Comdex_Vault_V1beta1_MsgServiceClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Comdex_Vault_V1beta1_MsgServiceClientInterceptorFactoryProtocol? { get }

  func msgCreate(
    _ request: Comdex_Vault_V1beta1_MsgCreateRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Comdex_Vault_V1beta1_MsgCreateRequest, Comdex_Vault_V1beta1_MsgCreateResponse>

  func msgDeposit(
    _ request: Comdex_Vault_V1beta1_MsgDepositRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Comdex_Vault_V1beta1_MsgDepositRequest, Comdex_Vault_V1beta1_MsgDepositResponse>

  func msgWithdraw(
    _ request: Comdex_Vault_V1beta1_MsgWithdrawRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Comdex_Vault_V1beta1_MsgWithdrawRequest, Comdex_Vault_V1beta1_MsgWithdrawResponse>

  func msgDraw(
    _ request: Comdex_Vault_V1beta1_MsgDrawRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Comdex_Vault_V1beta1_MsgDrawRequest, Comdex_Vault_V1beta1_MsgDrawResponse>

  func msgRepay(
    _ request: Comdex_Vault_V1beta1_MsgRepayRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Comdex_Vault_V1beta1_MsgRepayRequest, Comdex_Vault_V1beta1_MsgRepayResponse>

  func msgClose(
    _ request: Comdex_Vault_V1beta1_MsgCloseRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Comdex_Vault_V1beta1_MsgCloseRequest, Comdex_Vault_V1beta1_MsgCloseResponse>
}

extension Comdex_Vault_V1beta1_MsgServiceClientProtocol {
  internal var serviceName: String {
    return "comdex.vault.v1beta1.MsgService"
  }

  /// Unary call to MsgCreate
  ///
  /// - Parameters:
  ///   - request: Request to send to MsgCreate.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func msgCreate(
    _ request: Comdex_Vault_V1beta1_MsgCreateRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Comdex_Vault_V1beta1_MsgCreateRequest, Comdex_Vault_V1beta1_MsgCreateResponse> {
    return self.makeUnaryCall(
      path: "/comdex.vault.v1beta1.MsgService/MsgCreate",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMsgCreateInterceptors() ?? []
    )
  }

  /// Unary call to MsgDeposit
  ///
  /// - Parameters:
  ///   - request: Request to send to MsgDeposit.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func msgDeposit(
    _ request: Comdex_Vault_V1beta1_MsgDepositRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Comdex_Vault_V1beta1_MsgDepositRequest, Comdex_Vault_V1beta1_MsgDepositResponse> {
    return self.makeUnaryCall(
      path: "/comdex.vault.v1beta1.MsgService/MsgDeposit",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMsgDepositInterceptors() ?? []
    )
  }

  /// Unary call to MsgWithdraw
  ///
  /// - Parameters:
  ///   - request: Request to send to MsgWithdraw.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func msgWithdraw(
    _ request: Comdex_Vault_V1beta1_MsgWithdrawRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Comdex_Vault_V1beta1_MsgWithdrawRequest, Comdex_Vault_V1beta1_MsgWithdrawResponse> {
    return self.makeUnaryCall(
      path: "/comdex.vault.v1beta1.MsgService/MsgWithdraw",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMsgWithdrawInterceptors() ?? []
    )
  }

  /// Unary call to MsgDraw
  ///
  /// - Parameters:
  ///   - request: Request to send to MsgDraw.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func msgDraw(
    _ request: Comdex_Vault_V1beta1_MsgDrawRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Comdex_Vault_V1beta1_MsgDrawRequest, Comdex_Vault_V1beta1_MsgDrawResponse> {
    return self.makeUnaryCall(
      path: "/comdex.vault.v1beta1.MsgService/MsgDraw",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMsgDrawInterceptors() ?? []
    )
  }

  /// Unary call to MsgRepay
  ///
  /// - Parameters:
  ///   - request: Request to send to MsgRepay.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func msgRepay(
    _ request: Comdex_Vault_V1beta1_MsgRepayRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Comdex_Vault_V1beta1_MsgRepayRequest, Comdex_Vault_V1beta1_MsgRepayResponse> {
    return self.makeUnaryCall(
      path: "/comdex.vault.v1beta1.MsgService/MsgRepay",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMsgRepayInterceptors() ?? []
    )
  }

  /// Unary call to MsgClose
  ///
  /// - Parameters:
  ///   - request: Request to send to MsgClose.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func msgClose(
    _ request: Comdex_Vault_V1beta1_MsgCloseRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Comdex_Vault_V1beta1_MsgCloseRequest, Comdex_Vault_V1beta1_MsgCloseResponse> {
    return self.makeUnaryCall(
      path: "/comdex.vault.v1beta1.MsgService/MsgClose",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMsgCloseInterceptors() ?? []
    )
  }
}

internal protocol Comdex_Vault_V1beta1_MsgServiceClientInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when invoking 'msgCreate'.
  func makeMsgCreateInterceptors() -> [ClientInterceptor<Comdex_Vault_V1beta1_MsgCreateRequest, Comdex_Vault_V1beta1_MsgCreateResponse>]

  /// - Returns: Interceptors to use when invoking 'msgDeposit'.
  func makeMsgDepositInterceptors() -> [ClientInterceptor<Comdex_Vault_V1beta1_MsgDepositRequest, Comdex_Vault_V1beta1_MsgDepositResponse>]

  /// - Returns: Interceptors to use when invoking 'msgWithdraw'.
  func makeMsgWithdrawInterceptors() -> [ClientInterceptor<Comdex_Vault_V1beta1_MsgWithdrawRequest, Comdex_Vault_V1beta1_MsgWithdrawResponse>]

  /// - Returns: Interceptors to use when invoking 'msgDraw'.
  func makeMsgDrawInterceptors() -> [ClientInterceptor<Comdex_Vault_V1beta1_MsgDrawRequest, Comdex_Vault_V1beta1_MsgDrawResponse>]

  /// - Returns: Interceptors to use when invoking 'msgRepay'.
  func makeMsgRepayInterceptors() -> [ClientInterceptor<Comdex_Vault_V1beta1_MsgRepayRequest, Comdex_Vault_V1beta1_MsgRepayResponse>]

  /// - Returns: Interceptors to use when invoking 'msgClose'.
  func makeMsgCloseInterceptors() -> [ClientInterceptor<Comdex_Vault_V1beta1_MsgCloseRequest, Comdex_Vault_V1beta1_MsgCloseResponse>]
}

internal final class Comdex_Vault_V1beta1_MsgServiceClient: Comdex_Vault_V1beta1_MsgServiceClientProtocol {
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Comdex_Vault_V1beta1_MsgServiceClientInterceptorFactoryProtocol?

  /// Creates a client for the comdex.vault.v1beta1.MsgService service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Comdex_Vault_V1beta1_MsgServiceClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// To build a server, implement a class that conforms to this protocol.
internal protocol Comdex_Vault_V1beta1_MsgServiceProvider: CallHandlerProvider {
  var interceptors: Comdex_Vault_V1beta1_MsgServiceServerInterceptorFactoryProtocol? { get }

  func msgCreate(request: Comdex_Vault_V1beta1_MsgCreateRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Comdex_Vault_V1beta1_MsgCreateResponse>

  func msgDeposit(request: Comdex_Vault_V1beta1_MsgDepositRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Comdex_Vault_V1beta1_MsgDepositResponse>

  func msgWithdraw(request: Comdex_Vault_V1beta1_MsgWithdrawRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Comdex_Vault_V1beta1_MsgWithdrawResponse>

  func msgDraw(request: Comdex_Vault_V1beta1_MsgDrawRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Comdex_Vault_V1beta1_MsgDrawResponse>

  func msgRepay(request: Comdex_Vault_V1beta1_MsgRepayRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Comdex_Vault_V1beta1_MsgRepayResponse>

  func msgClose(request: Comdex_Vault_V1beta1_MsgCloseRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Comdex_Vault_V1beta1_MsgCloseResponse>
}

extension Comdex_Vault_V1beta1_MsgServiceProvider {
  internal var serviceName: Substring { return "comdex.vault.v1beta1.MsgService" }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "MsgCreate":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Comdex_Vault_V1beta1_MsgCreateRequest>(),
        responseSerializer: ProtobufSerializer<Comdex_Vault_V1beta1_MsgCreateResponse>(),
        interceptors: self.interceptors?.makeMsgCreateInterceptors() ?? [],
        userFunction: self.msgCreate(request:context:)
      )

    case "MsgDeposit":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Comdex_Vault_V1beta1_MsgDepositRequest>(),
        responseSerializer: ProtobufSerializer<Comdex_Vault_V1beta1_MsgDepositResponse>(),
        interceptors: self.interceptors?.makeMsgDepositInterceptors() ?? [],
        userFunction: self.msgDeposit(request:context:)
      )

    case "MsgWithdraw":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Comdex_Vault_V1beta1_MsgWithdrawRequest>(),
        responseSerializer: ProtobufSerializer<Comdex_Vault_V1beta1_MsgWithdrawResponse>(),
        interceptors: self.interceptors?.makeMsgWithdrawInterceptors() ?? [],
        userFunction: self.msgWithdraw(request:context:)
      )

    case "MsgDraw":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Comdex_Vault_V1beta1_MsgDrawRequest>(),
        responseSerializer: ProtobufSerializer<Comdex_Vault_V1beta1_MsgDrawResponse>(),
        interceptors: self.interceptors?.makeMsgDrawInterceptors() ?? [],
        userFunction: self.msgDraw(request:context:)
      )

    case "MsgRepay":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Comdex_Vault_V1beta1_MsgRepayRequest>(),
        responseSerializer: ProtobufSerializer<Comdex_Vault_V1beta1_MsgRepayResponse>(),
        interceptors: self.interceptors?.makeMsgRepayInterceptors() ?? [],
        userFunction: self.msgRepay(request:context:)
      )

    case "MsgClose":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Comdex_Vault_V1beta1_MsgCloseRequest>(),
        responseSerializer: ProtobufSerializer<Comdex_Vault_V1beta1_MsgCloseResponse>(),
        interceptors: self.interceptors?.makeMsgCloseInterceptors() ?? [],
        userFunction: self.msgClose(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Comdex_Vault_V1beta1_MsgServiceServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'msgCreate'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeMsgCreateInterceptors() -> [ServerInterceptor<Comdex_Vault_V1beta1_MsgCreateRequest, Comdex_Vault_V1beta1_MsgCreateResponse>]

  /// - Returns: Interceptors to use when handling 'msgDeposit'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeMsgDepositInterceptors() -> [ServerInterceptor<Comdex_Vault_V1beta1_MsgDepositRequest, Comdex_Vault_V1beta1_MsgDepositResponse>]

  /// - Returns: Interceptors to use when handling 'msgWithdraw'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeMsgWithdrawInterceptors() -> [ServerInterceptor<Comdex_Vault_V1beta1_MsgWithdrawRequest, Comdex_Vault_V1beta1_MsgWithdrawResponse>]

  /// - Returns: Interceptors to use when handling 'msgDraw'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeMsgDrawInterceptors() -> [ServerInterceptor<Comdex_Vault_V1beta1_MsgDrawRequest, Comdex_Vault_V1beta1_MsgDrawResponse>]

  /// - Returns: Interceptors to use when handling 'msgRepay'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeMsgRepayInterceptors() -> [ServerInterceptor<Comdex_Vault_V1beta1_MsgRepayRequest, Comdex_Vault_V1beta1_MsgRepayResponse>]

  /// - Returns: Interceptors to use when handling 'msgClose'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeMsgCloseInterceptors() -> [ServerInterceptor<Comdex_Vault_V1beta1_MsgCloseRequest, Comdex_Vault_V1beta1_MsgCloseResponse>]
}
