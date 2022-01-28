//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: axelar/axelarnet/v1beta1/service.proto
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


/// Msg defines the axelarnet Msg service.
///
/// Usage: instantiate `Axelar_Axelarnet_V1beta1_MsgServiceClient`, then call methods of this protocol to make API calls.
internal protocol Axelar_Axelarnet_V1beta1_MsgServiceClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Axelar_Axelarnet_V1beta1_MsgServiceClientInterceptorFactoryProtocol? { get }

  func link(
    _ request: Axelar_Axelarnet_V1beta1_LinkRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Axelar_Axelarnet_V1beta1_LinkRequest, Axelar_Axelarnet_V1beta1_LinkResponse>

  func confirmDeposit(
    _ request: Axelar_Axelarnet_V1beta1_ConfirmDepositRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Axelar_Axelarnet_V1beta1_ConfirmDepositRequest, Axelar_Axelarnet_V1beta1_ConfirmDepositResponse>

  func executePendingTransfers(
    _ request: Axelar_Axelarnet_V1beta1_ExecutePendingTransfersRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Axelar_Axelarnet_V1beta1_ExecutePendingTransfersRequest, Axelar_Axelarnet_V1beta1_ExecutePendingTransfersResponse>

  func registerIBCPath(
    _ request: Axelar_Axelarnet_V1beta1_RegisterIBCPathRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Axelar_Axelarnet_V1beta1_RegisterIBCPathRequest, Axelar_Axelarnet_V1beta1_RegisterIBCPathResponse>

  func addCosmosBasedChain(
    _ request: Axelar_Axelarnet_V1beta1_AddCosmosBasedChainRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Axelar_Axelarnet_V1beta1_AddCosmosBasedChainRequest, Axelar_Axelarnet_V1beta1_AddCosmosBasedChainResponse>

  func registerAsset(
    _ request: Axelar_Axelarnet_V1beta1_RegisterAssetRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Axelar_Axelarnet_V1beta1_RegisterAssetRequest, Axelar_Axelarnet_V1beta1_RegisterAssetResponse>

  func routeIBCTransfers(
    _ request: Axelar_Axelarnet_V1beta1_RouteIBCTransfersRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Axelar_Axelarnet_V1beta1_RouteIBCTransfersRequest, Axelar_Axelarnet_V1beta1_RouteIBCTransfersResponse>

  func registerFeeCollector(
    _ request: Axelar_Axelarnet_V1beta1_RegisterFeeCollectorRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Axelar_Axelarnet_V1beta1_RegisterFeeCollectorRequest, Axelar_Axelarnet_V1beta1_RegisterFeeCollectorResponse>
}

extension Axelar_Axelarnet_V1beta1_MsgServiceClientProtocol {
  internal var serviceName: String {
    return "axelar.axelarnet.v1beta1.MsgService"
  }

  /// Unary call to Link
  ///
  /// - Parameters:
  ///   - request: Request to send to Link.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func link(
    _ request: Axelar_Axelarnet_V1beta1_LinkRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Axelar_Axelarnet_V1beta1_LinkRequest, Axelar_Axelarnet_V1beta1_LinkResponse> {
    return self.makeUnaryCall(
      path: "/axelar.axelarnet.v1beta1.MsgService/Link",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeLinkInterceptors() ?? []
    )
  }

  /// Unary call to ConfirmDeposit
  ///
  /// - Parameters:
  ///   - request: Request to send to ConfirmDeposit.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func confirmDeposit(
    _ request: Axelar_Axelarnet_V1beta1_ConfirmDepositRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Axelar_Axelarnet_V1beta1_ConfirmDepositRequest, Axelar_Axelarnet_V1beta1_ConfirmDepositResponse> {
    return self.makeUnaryCall(
      path: "/axelar.axelarnet.v1beta1.MsgService/ConfirmDeposit",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeConfirmDepositInterceptors() ?? []
    )
  }

  /// Unary call to ExecutePendingTransfers
  ///
  /// - Parameters:
  ///   - request: Request to send to ExecutePendingTransfers.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func executePendingTransfers(
    _ request: Axelar_Axelarnet_V1beta1_ExecutePendingTransfersRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Axelar_Axelarnet_V1beta1_ExecutePendingTransfersRequest, Axelar_Axelarnet_V1beta1_ExecutePendingTransfersResponse> {
    return self.makeUnaryCall(
      path: "/axelar.axelarnet.v1beta1.MsgService/ExecutePendingTransfers",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeExecutePendingTransfersInterceptors() ?? []
    )
  }

  /// Unary call to RegisterIBCPath
  ///
  /// - Parameters:
  ///   - request: Request to send to RegisterIBCPath.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func registerIBCPath(
    _ request: Axelar_Axelarnet_V1beta1_RegisterIBCPathRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Axelar_Axelarnet_V1beta1_RegisterIBCPathRequest, Axelar_Axelarnet_V1beta1_RegisterIBCPathResponse> {
    return self.makeUnaryCall(
      path: "/axelar.axelarnet.v1beta1.MsgService/RegisterIBCPath",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRegisterIBCPathInterceptors() ?? []
    )
  }

  /// Unary call to AddCosmosBasedChain
  ///
  /// - Parameters:
  ///   - request: Request to send to AddCosmosBasedChain.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func addCosmosBasedChain(
    _ request: Axelar_Axelarnet_V1beta1_AddCosmosBasedChainRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Axelar_Axelarnet_V1beta1_AddCosmosBasedChainRequest, Axelar_Axelarnet_V1beta1_AddCosmosBasedChainResponse> {
    return self.makeUnaryCall(
      path: "/axelar.axelarnet.v1beta1.MsgService/AddCosmosBasedChain",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAddCosmosBasedChainInterceptors() ?? []
    )
  }

  /// Unary call to RegisterAsset
  ///
  /// - Parameters:
  ///   - request: Request to send to RegisterAsset.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func registerAsset(
    _ request: Axelar_Axelarnet_V1beta1_RegisterAssetRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Axelar_Axelarnet_V1beta1_RegisterAssetRequest, Axelar_Axelarnet_V1beta1_RegisterAssetResponse> {
    return self.makeUnaryCall(
      path: "/axelar.axelarnet.v1beta1.MsgService/RegisterAsset",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRegisterAssetInterceptors() ?? []
    )
  }

  /// Unary call to RouteIBCTransfers
  ///
  /// - Parameters:
  ///   - request: Request to send to RouteIBCTransfers.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func routeIBCTransfers(
    _ request: Axelar_Axelarnet_V1beta1_RouteIBCTransfersRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Axelar_Axelarnet_V1beta1_RouteIBCTransfersRequest, Axelar_Axelarnet_V1beta1_RouteIBCTransfersResponse> {
    return self.makeUnaryCall(
      path: "/axelar.axelarnet.v1beta1.MsgService/RouteIBCTransfers",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRouteIBCTransfersInterceptors() ?? []
    )
  }

  /// Unary call to RegisterFeeCollector
  ///
  /// - Parameters:
  ///   - request: Request to send to RegisterFeeCollector.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func registerFeeCollector(
    _ request: Axelar_Axelarnet_V1beta1_RegisterFeeCollectorRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Axelar_Axelarnet_V1beta1_RegisterFeeCollectorRequest, Axelar_Axelarnet_V1beta1_RegisterFeeCollectorResponse> {
    return self.makeUnaryCall(
      path: "/axelar.axelarnet.v1beta1.MsgService/RegisterFeeCollector",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRegisterFeeCollectorInterceptors() ?? []
    )
  }
}

internal protocol Axelar_Axelarnet_V1beta1_MsgServiceClientInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when invoking 'link'.
  func makeLinkInterceptors() -> [ClientInterceptor<Axelar_Axelarnet_V1beta1_LinkRequest, Axelar_Axelarnet_V1beta1_LinkResponse>]

  /// - Returns: Interceptors to use when invoking 'confirmDeposit'.
  func makeConfirmDepositInterceptors() -> [ClientInterceptor<Axelar_Axelarnet_V1beta1_ConfirmDepositRequest, Axelar_Axelarnet_V1beta1_ConfirmDepositResponse>]

  /// - Returns: Interceptors to use when invoking 'executePendingTransfers'.
  func makeExecutePendingTransfersInterceptors() -> [ClientInterceptor<Axelar_Axelarnet_V1beta1_ExecutePendingTransfersRequest, Axelar_Axelarnet_V1beta1_ExecutePendingTransfersResponse>]

  /// - Returns: Interceptors to use when invoking 'registerIBCPath'.
  func makeRegisterIBCPathInterceptors() -> [ClientInterceptor<Axelar_Axelarnet_V1beta1_RegisterIBCPathRequest, Axelar_Axelarnet_V1beta1_RegisterIBCPathResponse>]

  /// - Returns: Interceptors to use when invoking 'addCosmosBasedChain'.
  func makeAddCosmosBasedChainInterceptors() -> [ClientInterceptor<Axelar_Axelarnet_V1beta1_AddCosmosBasedChainRequest, Axelar_Axelarnet_V1beta1_AddCosmosBasedChainResponse>]

  /// - Returns: Interceptors to use when invoking 'registerAsset'.
  func makeRegisterAssetInterceptors() -> [ClientInterceptor<Axelar_Axelarnet_V1beta1_RegisterAssetRequest, Axelar_Axelarnet_V1beta1_RegisterAssetResponse>]

  /// - Returns: Interceptors to use when invoking 'routeIBCTransfers'.
  func makeRouteIBCTransfersInterceptors() -> [ClientInterceptor<Axelar_Axelarnet_V1beta1_RouteIBCTransfersRequest, Axelar_Axelarnet_V1beta1_RouteIBCTransfersResponse>]

  /// - Returns: Interceptors to use when invoking 'registerFeeCollector'.
  func makeRegisterFeeCollectorInterceptors() -> [ClientInterceptor<Axelar_Axelarnet_V1beta1_RegisterFeeCollectorRequest, Axelar_Axelarnet_V1beta1_RegisterFeeCollectorResponse>]
}

internal final class Axelar_Axelarnet_V1beta1_MsgServiceClient: Axelar_Axelarnet_V1beta1_MsgServiceClientProtocol {
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Axelar_Axelarnet_V1beta1_MsgServiceClientInterceptorFactoryProtocol?

  /// Creates a client for the axelar.axelarnet.v1beta1.MsgService service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Axelar_Axelarnet_V1beta1_MsgServiceClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the axelarnet Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Axelar_Axelarnet_V1beta1_MsgServiceProvider: CallHandlerProvider {
  var interceptors: Axelar_Axelarnet_V1beta1_MsgServiceServerInterceptorFactoryProtocol? { get }

  func link(request: Axelar_Axelarnet_V1beta1_LinkRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Axelar_Axelarnet_V1beta1_LinkResponse>

  func confirmDeposit(request: Axelar_Axelarnet_V1beta1_ConfirmDepositRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Axelar_Axelarnet_V1beta1_ConfirmDepositResponse>

  func executePendingTransfers(request: Axelar_Axelarnet_V1beta1_ExecutePendingTransfersRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Axelar_Axelarnet_V1beta1_ExecutePendingTransfersResponse>

  func registerIBCPath(request: Axelar_Axelarnet_V1beta1_RegisterIBCPathRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Axelar_Axelarnet_V1beta1_RegisterIBCPathResponse>

  func addCosmosBasedChain(request: Axelar_Axelarnet_V1beta1_AddCosmosBasedChainRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Axelar_Axelarnet_V1beta1_AddCosmosBasedChainResponse>

  func registerAsset(request: Axelar_Axelarnet_V1beta1_RegisterAssetRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Axelar_Axelarnet_V1beta1_RegisterAssetResponse>

  func routeIBCTransfers(request: Axelar_Axelarnet_V1beta1_RouteIBCTransfersRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Axelar_Axelarnet_V1beta1_RouteIBCTransfersResponse>

  func registerFeeCollector(request: Axelar_Axelarnet_V1beta1_RegisterFeeCollectorRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Axelar_Axelarnet_V1beta1_RegisterFeeCollectorResponse>
}

extension Axelar_Axelarnet_V1beta1_MsgServiceProvider {
  internal var serviceName: Substring { return "axelar.axelarnet.v1beta1.MsgService" }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Link":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Axelar_Axelarnet_V1beta1_LinkRequest>(),
        responseSerializer: ProtobufSerializer<Axelar_Axelarnet_V1beta1_LinkResponse>(),
        interceptors: self.interceptors?.makeLinkInterceptors() ?? [],
        userFunction: self.link(request:context:)
      )

    case "ConfirmDeposit":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Axelar_Axelarnet_V1beta1_ConfirmDepositRequest>(),
        responseSerializer: ProtobufSerializer<Axelar_Axelarnet_V1beta1_ConfirmDepositResponse>(),
        interceptors: self.interceptors?.makeConfirmDepositInterceptors() ?? [],
        userFunction: self.confirmDeposit(request:context:)
      )

    case "ExecutePendingTransfers":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Axelar_Axelarnet_V1beta1_ExecutePendingTransfersRequest>(),
        responseSerializer: ProtobufSerializer<Axelar_Axelarnet_V1beta1_ExecutePendingTransfersResponse>(),
        interceptors: self.interceptors?.makeExecutePendingTransfersInterceptors() ?? [],
        userFunction: self.executePendingTransfers(request:context:)
      )

    case "RegisterIBCPath":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Axelar_Axelarnet_V1beta1_RegisterIBCPathRequest>(),
        responseSerializer: ProtobufSerializer<Axelar_Axelarnet_V1beta1_RegisterIBCPathResponse>(),
        interceptors: self.interceptors?.makeRegisterIBCPathInterceptors() ?? [],
        userFunction: self.registerIBCPath(request:context:)
      )

    case "AddCosmosBasedChain":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Axelar_Axelarnet_V1beta1_AddCosmosBasedChainRequest>(),
        responseSerializer: ProtobufSerializer<Axelar_Axelarnet_V1beta1_AddCosmosBasedChainResponse>(),
        interceptors: self.interceptors?.makeAddCosmosBasedChainInterceptors() ?? [],
        userFunction: self.addCosmosBasedChain(request:context:)
      )

    case "RegisterAsset":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Axelar_Axelarnet_V1beta1_RegisterAssetRequest>(),
        responseSerializer: ProtobufSerializer<Axelar_Axelarnet_V1beta1_RegisterAssetResponse>(),
        interceptors: self.interceptors?.makeRegisterAssetInterceptors() ?? [],
        userFunction: self.registerAsset(request:context:)
      )

    case "RouteIBCTransfers":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Axelar_Axelarnet_V1beta1_RouteIBCTransfersRequest>(),
        responseSerializer: ProtobufSerializer<Axelar_Axelarnet_V1beta1_RouteIBCTransfersResponse>(),
        interceptors: self.interceptors?.makeRouteIBCTransfersInterceptors() ?? [],
        userFunction: self.routeIBCTransfers(request:context:)
      )

    case "RegisterFeeCollector":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Axelar_Axelarnet_V1beta1_RegisterFeeCollectorRequest>(),
        responseSerializer: ProtobufSerializer<Axelar_Axelarnet_V1beta1_RegisterFeeCollectorResponse>(),
        interceptors: self.interceptors?.makeRegisterFeeCollectorInterceptors() ?? [],
        userFunction: self.registerFeeCollector(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Axelar_Axelarnet_V1beta1_MsgServiceServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'link'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeLinkInterceptors() -> [ServerInterceptor<Axelar_Axelarnet_V1beta1_LinkRequest, Axelar_Axelarnet_V1beta1_LinkResponse>]

  /// - Returns: Interceptors to use when handling 'confirmDeposit'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeConfirmDepositInterceptors() -> [ServerInterceptor<Axelar_Axelarnet_V1beta1_ConfirmDepositRequest, Axelar_Axelarnet_V1beta1_ConfirmDepositResponse>]

  /// - Returns: Interceptors to use when handling 'executePendingTransfers'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeExecutePendingTransfersInterceptors() -> [ServerInterceptor<Axelar_Axelarnet_V1beta1_ExecutePendingTransfersRequest, Axelar_Axelarnet_V1beta1_ExecutePendingTransfersResponse>]

  /// - Returns: Interceptors to use when handling 'registerIBCPath'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRegisterIBCPathInterceptors() -> [ServerInterceptor<Axelar_Axelarnet_V1beta1_RegisterIBCPathRequest, Axelar_Axelarnet_V1beta1_RegisterIBCPathResponse>]

  /// - Returns: Interceptors to use when handling 'addCosmosBasedChain'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAddCosmosBasedChainInterceptors() -> [ServerInterceptor<Axelar_Axelarnet_V1beta1_AddCosmosBasedChainRequest, Axelar_Axelarnet_V1beta1_AddCosmosBasedChainResponse>]

  /// - Returns: Interceptors to use when handling 'registerAsset'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRegisterAssetInterceptors() -> [ServerInterceptor<Axelar_Axelarnet_V1beta1_RegisterAssetRequest, Axelar_Axelarnet_V1beta1_RegisterAssetResponse>]

  /// - Returns: Interceptors to use when handling 'routeIBCTransfers'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRouteIBCTransfersInterceptors() -> [ServerInterceptor<Axelar_Axelarnet_V1beta1_RouteIBCTransfersRequest, Axelar_Axelarnet_V1beta1_RouteIBCTransfersResponse>]

  /// - Returns: Interceptors to use when handling 'registerFeeCollector'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRegisterFeeCollectorInterceptors() -> [ServerInterceptor<Axelar_Axelarnet_V1beta1_RegisterFeeCollectorRequest, Axelar_Axelarnet_V1beta1_RegisterFeeCollectorResponse>]
}