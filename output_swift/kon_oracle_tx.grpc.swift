//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: kon_oracle/tx.proto
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
/// Usage: instantiate `Konstellation_Oracle_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Konstellation_Oracle_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Konstellation_Oracle_MsgClientInterceptorFactoryProtocol? { get }

  func setExchangeRate(
    _ request: Konstellation_Oracle_MsgSetExchangeRate,
    callOptions: CallOptions?
  ) -> UnaryCall<Konstellation_Oracle_MsgSetExchangeRate, Konstellation_Oracle_MsgSetExchangeRateResponse>

  func setExchangeRates(
    _ request: Konstellation_Oracle_MsgSetExchangeRates,
    callOptions: CallOptions?
  ) -> UnaryCall<Konstellation_Oracle_MsgSetExchangeRates, Konstellation_Oracle_MsgSetExchangeRatesResponse>

  func deleteExchangeRate(
    _ request: Konstellation_Oracle_MsgDeleteExchangeRate,
    callOptions: CallOptions?
  ) -> UnaryCall<Konstellation_Oracle_MsgDeleteExchangeRate, Konstellation_Oracle_MsgDeleteExchangeRateResponse>

  func deleteExchangeRates(
    _ request: Konstellation_Oracle_MsgDeleteExchangeRates,
    callOptions: CallOptions?
  ) -> UnaryCall<Konstellation_Oracle_MsgDeleteExchangeRates, Konstellation_Oracle_MsgDeleteExchangeRatesResponse>

  func setAdminAddr(
    _ request: Konstellation_Oracle_MsgSetAdminAddr,
    callOptions: CallOptions?
  ) -> UnaryCall<Konstellation_Oracle_MsgSetAdminAddr, Konstellation_Oracle_MsgSetAdminAddrResponse>
}

extension Konstellation_Oracle_MsgClientProtocol {
  internal var serviceName: String {
    return "konstellation.oracle.Msg"
  }

  /// Unary call to SetExchangeRate
  ///
  /// - Parameters:
  ///   - request: Request to send to SetExchangeRate.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func setExchangeRate(
    _ request: Konstellation_Oracle_MsgSetExchangeRate,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Konstellation_Oracle_MsgSetExchangeRate, Konstellation_Oracle_MsgSetExchangeRateResponse> {
    return self.makeUnaryCall(
      path: "/konstellation.oracle.Msg/SetExchangeRate",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetExchangeRateInterceptors() ?? []
    )
  }

  /// Unary call to SetExchangeRates
  ///
  /// - Parameters:
  ///   - request: Request to send to SetExchangeRates.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func setExchangeRates(
    _ request: Konstellation_Oracle_MsgSetExchangeRates,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Konstellation_Oracle_MsgSetExchangeRates, Konstellation_Oracle_MsgSetExchangeRatesResponse> {
    return self.makeUnaryCall(
      path: "/konstellation.oracle.Msg/SetExchangeRates",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetExchangeRatesInterceptors() ?? []
    )
  }

  /// Unary call to DeleteExchangeRate
  ///
  /// - Parameters:
  ///   - request: Request to send to DeleteExchangeRate.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func deleteExchangeRate(
    _ request: Konstellation_Oracle_MsgDeleteExchangeRate,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Konstellation_Oracle_MsgDeleteExchangeRate, Konstellation_Oracle_MsgDeleteExchangeRateResponse> {
    return self.makeUnaryCall(
      path: "/konstellation.oracle.Msg/DeleteExchangeRate",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeleteExchangeRateInterceptors() ?? []
    )
  }

  /// Unary call to DeleteExchangeRates
  ///
  /// - Parameters:
  ///   - request: Request to send to DeleteExchangeRates.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func deleteExchangeRates(
    _ request: Konstellation_Oracle_MsgDeleteExchangeRates,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Konstellation_Oracle_MsgDeleteExchangeRates, Konstellation_Oracle_MsgDeleteExchangeRatesResponse> {
    return self.makeUnaryCall(
      path: "/konstellation.oracle.Msg/DeleteExchangeRates",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeleteExchangeRatesInterceptors() ?? []
    )
  }

  /// Unary call to SetAdminAddr
  ///
  /// - Parameters:
  ///   - request: Request to send to SetAdminAddr.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func setAdminAddr(
    _ request: Konstellation_Oracle_MsgSetAdminAddr,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Konstellation_Oracle_MsgSetAdminAddr, Konstellation_Oracle_MsgSetAdminAddrResponse> {
    return self.makeUnaryCall(
      path: "/konstellation.oracle.Msg/SetAdminAddr",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetAdminAddrInterceptors() ?? []
    )
  }
}

internal protocol Konstellation_Oracle_MsgClientInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when invoking 'setExchangeRate'.
  func makeSetExchangeRateInterceptors() -> [ClientInterceptor<Konstellation_Oracle_MsgSetExchangeRate, Konstellation_Oracle_MsgSetExchangeRateResponse>]

  /// - Returns: Interceptors to use when invoking 'setExchangeRates'.
  func makeSetExchangeRatesInterceptors() -> [ClientInterceptor<Konstellation_Oracle_MsgSetExchangeRates, Konstellation_Oracle_MsgSetExchangeRatesResponse>]

  /// - Returns: Interceptors to use when invoking 'deleteExchangeRate'.
  func makeDeleteExchangeRateInterceptors() -> [ClientInterceptor<Konstellation_Oracle_MsgDeleteExchangeRate, Konstellation_Oracle_MsgDeleteExchangeRateResponse>]

  /// - Returns: Interceptors to use when invoking 'deleteExchangeRates'.
  func makeDeleteExchangeRatesInterceptors() -> [ClientInterceptor<Konstellation_Oracle_MsgDeleteExchangeRates, Konstellation_Oracle_MsgDeleteExchangeRatesResponse>]

  /// - Returns: Interceptors to use when invoking 'setAdminAddr'.
  func makeSetAdminAddrInterceptors() -> [ClientInterceptor<Konstellation_Oracle_MsgSetAdminAddr, Konstellation_Oracle_MsgSetAdminAddrResponse>]
}

internal final class Konstellation_Oracle_MsgClient: Konstellation_Oracle_MsgClientProtocol {
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Konstellation_Oracle_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the konstellation.oracle.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Konstellation_Oracle_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Konstellation_Oracle_MsgProvider: CallHandlerProvider {
  var interceptors: Konstellation_Oracle_MsgServerInterceptorFactoryProtocol? { get }

  func setExchangeRate(request: Konstellation_Oracle_MsgSetExchangeRate, context: StatusOnlyCallContext) -> EventLoopFuture<Konstellation_Oracle_MsgSetExchangeRateResponse>

  func setExchangeRates(request: Konstellation_Oracle_MsgSetExchangeRates, context: StatusOnlyCallContext) -> EventLoopFuture<Konstellation_Oracle_MsgSetExchangeRatesResponse>

  func deleteExchangeRate(request: Konstellation_Oracle_MsgDeleteExchangeRate, context: StatusOnlyCallContext) -> EventLoopFuture<Konstellation_Oracle_MsgDeleteExchangeRateResponse>

  func deleteExchangeRates(request: Konstellation_Oracle_MsgDeleteExchangeRates, context: StatusOnlyCallContext) -> EventLoopFuture<Konstellation_Oracle_MsgDeleteExchangeRatesResponse>

  func setAdminAddr(request: Konstellation_Oracle_MsgSetAdminAddr, context: StatusOnlyCallContext) -> EventLoopFuture<Konstellation_Oracle_MsgSetAdminAddrResponse>
}

extension Konstellation_Oracle_MsgProvider {
  internal var serviceName: Substring { return "konstellation.oracle.Msg" }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "SetExchangeRate":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Konstellation_Oracle_MsgSetExchangeRate>(),
        responseSerializer: ProtobufSerializer<Konstellation_Oracle_MsgSetExchangeRateResponse>(),
        interceptors: self.interceptors?.makeSetExchangeRateInterceptors() ?? [],
        userFunction: self.setExchangeRate(request:context:)
      )

    case "SetExchangeRates":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Konstellation_Oracle_MsgSetExchangeRates>(),
        responseSerializer: ProtobufSerializer<Konstellation_Oracle_MsgSetExchangeRatesResponse>(),
        interceptors: self.interceptors?.makeSetExchangeRatesInterceptors() ?? [],
        userFunction: self.setExchangeRates(request:context:)
      )

    case "DeleteExchangeRate":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Konstellation_Oracle_MsgDeleteExchangeRate>(),
        responseSerializer: ProtobufSerializer<Konstellation_Oracle_MsgDeleteExchangeRateResponse>(),
        interceptors: self.interceptors?.makeDeleteExchangeRateInterceptors() ?? [],
        userFunction: self.deleteExchangeRate(request:context:)
      )

    case "DeleteExchangeRates":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Konstellation_Oracle_MsgDeleteExchangeRates>(),
        responseSerializer: ProtobufSerializer<Konstellation_Oracle_MsgDeleteExchangeRatesResponse>(),
        interceptors: self.interceptors?.makeDeleteExchangeRatesInterceptors() ?? [],
        userFunction: self.deleteExchangeRates(request:context:)
      )

    case "SetAdminAddr":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Konstellation_Oracle_MsgSetAdminAddr>(),
        responseSerializer: ProtobufSerializer<Konstellation_Oracle_MsgSetAdminAddrResponse>(),
        interceptors: self.interceptors?.makeSetAdminAddrInterceptors() ?? [],
        userFunction: self.setAdminAddr(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Konstellation_Oracle_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'setExchangeRate'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSetExchangeRateInterceptors() -> [ServerInterceptor<Konstellation_Oracle_MsgSetExchangeRate, Konstellation_Oracle_MsgSetExchangeRateResponse>]

  /// - Returns: Interceptors to use when handling 'setExchangeRates'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSetExchangeRatesInterceptors() -> [ServerInterceptor<Konstellation_Oracle_MsgSetExchangeRates, Konstellation_Oracle_MsgSetExchangeRatesResponse>]

  /// - Returns: Interceptors to use when handling 'deleteExchangeRate'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDeleteExchangeRateInterceptors() -> [ServerInterceptor<Konstellation_Oracle_MsgDeleteExchangeRate, Konstellation_Oracle_MsgDeleteExchangeRateResponse>]

  /// - Returns: Interceptors to use when handling 'deleteExchangeRates'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDeleteExchangeRatesInterceptors() -> [ServerInterceptor<Konstellation_Oracle_MsgDeleteExchangeRates, Konstellation_Oracle_MsgDeleteExchangeRatesResponse>]

  /// - Returns: Interceptors to use when handling 'setAdminAddr'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSetAdminAddrInterceptors() -> [ServerInterceptor<Konstellation_Oracle_MsgSetAdminAddr, Konstellation_Oracle_MsgSetAdminAddrResponse>]
}
