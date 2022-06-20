//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: osmosis/tokenfactory/v1beta1/tx.proto
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
/// Usage: instantiate `Osmosis_Tokenfactory_V1beta1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Osmosis_Tokenfactory_V1beta1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Osmosis_Tokenfactory_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func createDenom(
    _ request: Osmosis_Tokenfactory_V1beta1_MsgCreateDenom,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Tokenfactory_V1beta1_MsgCreateDenom, Osmosis_Tokenfactory_V1beta1_MsgCreateDenomResponse>

  func mint(
    _ request: Osmosis_Tokenfactory_V1beta1_MsgMint,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Tokenfactory_V1beta1_MsgMint, Osmosis_Tokenfactory_V1beta1_MsgMintResponse>

  func burn(
    _ request: Osmosis_Tokenfactory_V1beta1_MsgBurn,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Tokenfactory_V1beta1_MsgBurn, Osmosis_Tokenfactory_V1beta1_MsgBurnResponse>

  func changeAdmin(
    _ request: Osmosis_Tokenfactory_V1beta1_MsgChangeAdmin,
    callOptions: CallOptions?
  ) -> UnaryCall<Osmosis_Tokenfactory_V1beta1_MsgChangeAdmin, Osmosis_Tokenfactory_V1beta1_MsgChangeAdminResponse>
}

extension Osmosis_Tokenfactory_V1beta1_MsgClientProtocol {
  internal var serviceName: String {
    return "osmosis.tokenfactory.v1beta1.Msg"
  }

  /// Unary call to CreateDenom
  ///
  /// - Parameters:
  ///   - request: Request to send to CreateDenom.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func createDenom(
    _ request: Osmosis_Tokenfactory_V1beta1_MsgCreateDenom,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Tokenfactory_V1beta1_MsgCreateDenom, Osmosis_Tokenfactory_V1beta1_MsgCreateDenomResponse> {
    return self.makeUnaryCall(
      path: "/osmosis.tokenfactory.v1beta1.Msg/CreateDenom",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateDenomInterceptors() ?? []
    )
  }

  /// Unary call to Mint
  ///
  /// - Parameters:
  ///   - request: Request to send to Mint.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func mint(
    _ request: Osmosis_Tokenfactory_V1beta1_MsgMint,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Tokenfactory_V1beta1_MsgMint, Osmosis_Tokenfactory_V1beta1_MsgMintResponse> {
    return self.makeUnaryCall(
      path: "/osmosis.tokenfactory.v1beta1.Msg/Mint",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMintInterceptors() ?? []
    )
  }

  /// Unary call to Burn
  ///
  /// - Parameters:
  ///   - request: Request to send to Burn.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func burn(
    _ request: Osmosis_Tokenfactory_V1beta1_MsgBurn,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Tokenfactory_V1beta1_MsgBurn, Osmosis_Tokenfactory_V1beta1_MsgBurnResponse> {
    return self.makeUnaryCall(
      path: "/osmosis.tokenfactory.v1beta1.Msg/Burn",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBurnInterceptors() ?? []
    )
  }

  /// ForceTransfer is deactivated for now because we need to think through edge
  /// cases rpc ForceTransfer(MsgForceTransfer) returns
  /// (MsgForceTransferResponse);
  ///
  /// - Parameters:
  ///   - request: Request to send to ChangeAdmin.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func changeAdmin(
    _ request: Osmosis_Tokenfactory_V1beta1_MsgChangeAdmin,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Osmosis_Tokenfactory_V1beta1_MsgChangeAdmin, Osmosis_Tokenfactory_V1beta1_MsgChangeAdminResponse> {
    return self.makeUnaryCall(
      path: "/osmosis.tokenfactory.v1beta1.Msg/ChangeAdmin",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeChangeAdminInterceptors() ?? []
    )
  }
}

internal protocol Osmosis_Tokenfactory_V1beta1_MsgClientInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when invoking 'createDenom'.
  func makeCreateDenomInterceptors() -> [ClientInterceptor<Osmosis_Tokenfactory_V1beta1_MsgCreateDenom, Osmosis_Tokenfactory_V1beta1_MsgCreateDenomResponse>]

  /// - Returns: Interceptors to use when invoking 'mint'.
  func makeMintInterceptors() -> [ClientInterceptor<Osmosis_Tokenfactory_V1beta1_MsgMint, Osmosis_Tokenfactory_V1beta1_MsgMintResponse>]

  /// - Returns: Interceptors to use when invoking 'burn'.
  func makeBurnInterceptors() -> [ClientInterceptor<Osmosis_Tokenfactory_V1beta1_MsgBurn, Osmosis_Tokenfactory_V1beta1_MsgBurnResponse>]

  /// - Returns: Interceptors to use when invoking 'changeAdmin'.
  func makeChangeAdminInterceptors() -> [ClientInterceptor<Osmosis_Tokenfactory_V1beta1_MsgChangeAdmin, Osmosis_Tokenfactory_V1beta1_MsgChangeAdminResponse>]
}

internal final class Osmosis_Tokenfactory_V1beta1_MsgClient: Osmosis_Tokenfactory_V1beta1_MsgClientProtocol {
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Osmosis_Tokenfactory_V1beta1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the osmosis.tokenfactory.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Osmosis_Tokenfactory_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Osmosis_Tokenfactory_V1beta1_MsgProvider: CallHandlerProvider {
  var interceptors: Osmosis_Tokenfactory_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  func createDenom(request: Osmosis_Tokenfactory_V1beta1_MsgCreateDenom, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Tokenfactory_V1beta1_MsgCreateDenomResponse>

  func mint(request: Osmosis_Tokenfactory_V1beta1_MsgMint, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Tokenfactory_V1beta1_MsgMintResponse>

  func burn(request: Osmosis_Tokenfactory_V1beta1_MsgBurn, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Tokenfactory_V1beta1_MsgBurnResponse>

  /// ForceTransfer is deactivated for now because we need to think through edge
  /// cases rpc ForceTransfer(MsgForceTransfer) returns
  /// (MsgForceTransferResponse);
  func changeAdmin(request: Osmosis_Tokenfactory_V1beta1_MsgChangeAdmin, context: StatusOnlyCallContext) -> EventLoopFuture<Osmosis_Tokenfactory_V1beta1_MsgChangeAdminResponse>
}

extension Osmosis_Tokenfactory_V1beta1_MsgProvider {
  internal var serviceName: Substring { return "osmosis.tokenfactory.v1beta1.Msg" }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "CreateDenom":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Tokenfactory_V1beta1_MsgCreateDenom>(),
        responseSerializer: ProtobufSerializer<Osmosis_Tokenfactory_V1beta1_MsgCreateDenomResponse>(),
        interceptors: self.interceptors?.makeCreateDenomInterceptors() ?? [],
        userFunction: self.createDenom(request:context:)
      )

    case "Mint":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Tokenfactory_V1beta1_MsgMint>(),
        responseSerializer: ProtobufSerializer<Osmosis_Tokenfactory_V1beta1_MsgMintResponse>(),
        interceptors: self.interceptors?.makeMintInterceptors() ?? [],
        userFunction: self.mint(request:context:)
      )

    case "Burn":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Tokenfactory_V1beta1_MsgBurn>(),
        responseSerializer: ProtobufSerializer<Osmosis_Tokenfactory_V1beta1_MsgBurnResponse>(),
        interceptors: self.interceptors?.makeBurnInterceptors() ?? [],
        userFunction: self.burn(request:context:)
      )

    case "ChangeAdmin":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Osmosis_Tokenfactory_V1beta1_MsgChangeAdmin>(),
        responseSerializer: ProtobufSerializer<Osmosis_Tokenfactory_V1beta1_MsgChangeAdminResponse>(),
        interceptors: self.interceptors?.makeChangeAdminInterceptors() ?? [],
        userFunction: self.changeAdmin(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Osmosis_Tokenfactory_V1beta1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'createDenom'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCreateDenomInterceptors() -> [ServerInterceptor<Osmosis_Tokenfactory_V1beta1_MsgCreateDenom, Osmosis_Tokenfactory_V1beta1_MsgCreateDenomResponse>]

  /// - Returns: Interceptors to use when handling 'mint'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeMintInterceptors() -> [ServerInterceptor<Osmosis_Tokenfactory_V1beta1_MsgMint, Osmosis_Tokenfactory_V1beta1_MsgMintResponse>]

  /// - Returns: Interceptors to use when handling 'burn'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeBurnInterceptors() -> [ServerInterceptor<Osmosis_Tokenfactory_V1beta1_MsgBurn, Osmosis_Tokenfactory_V1beta1_MsgBurnResponse>]

  /// - Returns: Interceptors to use when handling 'changeAdmin'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeChangeAdminInterceptors() -> [ServerInterceptor<Osmosis_Tokenfactory_V1beta1_MsgChangeAdmin, Osmosis_Tokenfactory_V1beta1_MsgChangeAdminResponse>]
}
