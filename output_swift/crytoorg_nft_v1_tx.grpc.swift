//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: crytoorg_nft/v1/tx.proto
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


/// Msg defines the NFT Msg service.
///
/// Usage: instantiate `Chainmain_Nft_V1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Chainmain_Nft_V1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Chainmain_Nft_V1_MsgClientInterceptorFactoryProtocol? { get }

  func issueDenom(
    _ request: Chainmain_Nft_V1_MsgIssueDenom,
    callOptions: CallOptions?
  ) -> UnaryCall<Chainmain_Nft_V1_MsgIssueDenom, Chainmain_Nft_V1_MsgIssueDenomResponse>

  func mintNFT(
    _ request: Chainmain_Nft_V1_MsgMintNFT,
    callOptions: CallOptions?
  ) -> UnaryCall<Chainmain_Nft_V1_MsgMintNFT, Chainmain_Nft_V1_MsgMintNFTResponse>

  func editNFT(
    _ request: Chainmain_Nft_V1_MsgEditNFT,
    callOptions: CallOptions?
  ) -> UnaryCall<Chainmain_Nft_V1_MsgEditNFT, Chainmain_Nft_V1_MsgEditNFTResponse>

  func transferNFT(
    _ request: Chainmain_Nft_V1_MsgTransferNFT,
    callOptions: CallOptions?
  ) -> UnaryCall<Chainmain_Nft_V1_MsgTransferNFT, Chainmain_Nft_V1_MsgTransferNFTResponse>

  func burnNFT(
    _ request: Chainmain_Nft_V1_MsgBurnNFT,
    callOptions: CallOptions?
  ) -> UnaryCall<Chainmain_Nft_V1_MsgBurnNFT, Chainmain_Nft_V1_MsgBurnNFTResponse>
}

extension Chainmain_Nft_V1_MsgClientProtocol {
  internal var serviceName: String {
    return "chainmain.nft.v1.Msg"
  }

  /// IssueDenom defines a method for issue a denom.
  ///
  /// - Parameters:
  ///   - request: Request to send to IssueDenom.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func issueDenom(
    _ request: Chainmain_Nft_V1_MsgIssueDenom,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Chainmain_Nft_V1_MsgIssueDenom, Chainmain_Nft_V1_MsgIssueDenomResponse> {
    return self.makeUnaryCall(
      path: "/chainmain.nft.v1.Msg/IssueDenom",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeIssueDenomInterceptors() ?? []
    )
  }

  /// MintNFT defines a method for mint a new nft
  ///
  /// - Parameters:
  ///   - request: Request to send to MintNFT.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func mintNFT(
    _ request: Chainmain_Nft_V1_MsgMintNFT,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Chainmain_Nft_V1_MsgMintNFT, Chainmain_Nft_V1_MsgMintNFTResponse> {
    return self.makeUnaryCall(
      path: "/chainmain.nft.v1.Msg/MintNFT",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMintNFTInterceptors() ?? []
    )
  }

  /// EditNFT defines a method for editing a nft.
  ///
  /// - Parameters:
  ///   - request: Request to send to EditNFT.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func editNFT(
    _ request: Chainmain_Nft_V1_MsgEditNFT,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Chainmain_Nft_V1_MsgEditNFT, Chainmain_Nft_V1_MsgEditNFTResponse> {
    return self.makeUnaryCall(
      path: "/chainmain.nft.v1.Msg/EditNFT",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeEditNFTInterceptors() ?? []
    )
  }

  /// TransferNFT defines a method for transferring a nft.
  ///
  /// - Parameters:
  ///   - request: Request to send to TransferNFT.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func transferNFT(
    _ request: Chainmain_Nft_V1_MsgTransferNFT,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Chainmain_Nft_V1_MsgTransferNFT, Chainmain_Nft_V1_MsgTransferNFTResponse> {
    return self.makeUnaryCall(
      path: "/chainmain.nft.v1.Msg/TransferNFT",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTransferNFTInterceptors() ?? []
    )
  }

  /// BurnNFT defines a method for burning a nft.
  ///
  /// - Parameters:
  ///   - request: Request to send to BurnNFT.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func burnNFT(
    _ request: Chainmain_Nft_V1_MsgBurnNFT,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Chainmain_Nft_V1_MsgBurnNFT, Chainmain_Nft_V1_MsgBurnNFTResponse> {
    return self.makeUnaryCall(
      path: "/chainmain.nft.v1.Msg/BurnNFT",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBurnNFTInterceptors() ?? []
    )
  }
}

internal protocol Chainmain_Nft_V1_MsgClientInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when invoking 'issueDenom'.
  func makeIssueDenomInterceptors() -> [ClientInterceptor<Chainmain_Nft_V1_MsgIssueDenom, Chainmain_Nft_V1_MsgIssueDenomResponse>]

  /// - Returns: Interceptors to use when invoking 'mintNFT'.
  func makeMintNFTInterceptors() -> [ClientInterceptor<Chainmain_Nft_V1_MsgMintNFT, Chainmain_Nft_V1_MsgMintNFTResponse>]

  /// - Returns: Interceptors to use when invoking 'editNFT'.
  func makeEditNFTInterceptors() -> [ClientInterceptor<Chainmain_Nft_V1_MsgEditNFT, Chainmain_Nft_V1_MsgEditNFTResponse>]

  /// - Returns: Interceptors to use when invoking 'transferNFT'.
  func makeTransferNFTInterceptors() -> [ClientInterceptor<Chainmain_Nft_V1_MsgTransferNFT, Chainmain_Nft_V1_MsgTransferNFTResponse>]

  /// - Returns: Interceptors to use when invoking 'burnNFT'.
  func makeBurnNFTInterceptors() -> [ClientInterceptor<Chainmain_Nft_V1_MsgBurnNFT, Chainmain_Nft_V1_MsgBurnNFTResponse>]
}

internal final class Chainmain_Nft_V1_MsgClient: Chainmain_Nft_V1_MsgClientProtocol {
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Chainmain_Nft_V1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the chainmain.nft.v1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Chainmain_Nft_V1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the NFT Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Chainmain_Nft_V1_MsgProvider: CallHandlerProvider {
  var interceptors: Chainmain_Nft_V1_MsgServerInterceptorFactoryProtocol? { get }

  /// IssueDenom defines a method for issue a denom.
  func issueDenom(request: Chainmain_Nft_V1_MsgIssueDenom, context: StatusOnlyCallContext) -> EventLoopFuture<Chainmain_Nft_V1_MsgIssueDenomResponse>

  /// MintNFT defines a method for mint a new nft
  func mintNFT(request: Chainmain_Nft_V1_MsgMintNFT, context: StatusOnlyCallContext) -> EventLoopFuture<Chainmain_Nft_V1_MsgMintNFTResponse>

  /// EditNFT defines a method for editing a nft.
  func editNFT(request: Chainmain_Nft_V1_MsgEditNFT, context: StatusOnlyCallContext) -> EventLoopFuture<Chainmain_Nft_V1_MsgEditNFTResponse>

  /// TransferNFT defines a method for transferring a nft.
  func transferNFT(request: Chainmain_Nft_V1_MsgTransferNFT, context: StatusOnlyCallContext) -> EventLoopFuture<Chainmain_Nft_V1_MsgTransferNFTResponse>

  /// BurnNFT defines a method for burning a nft.
  func burnNFT(request: Chainmain_Nft_V1_MsgBurnNFT, context: StatusOnlyCallContext) -> EventLoopFuture<Chainmain_Nft_V1_MsgBurnNFTResponse>
}

extension Chainmain_Nft_V1_MsgProvider {
  internal var serviceName: Substring { return "chainmain.nft.v1.Msg" }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "IssueDenom":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Chainmain_Nft_V1_MsgIssueDenom>(),
        responseSerializer: ProtobufSerializer<Chainmain_Nft_V1_MsgIssueDenomResponse>(),
        interceptors: self.interceptors?.makeIssueDenomInterceptors() ?? [],
        userFunction: self.issueDenom(request:context:)
      )

    case "MintNFT":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Chainmain_Nft_V1_MsgMintNFT>(),
        responseSerializer: ProtobufSerializer<Chainmain_Nft_V1_MsgMintNFTResponse>(),
        interceptors: self.interceptors?.makeMintNFTInterceptors() ?? [],
        userFunction: self.mintNFT(request:context:)
      )

    case "EditNFT":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Chainmain_Nft_V1_MsgEditNFT>(),
        responseSerializer: ProtobufSerializer<Chainmain_Nft_V1_MsgEditNFTResponse>(),
        interceptors: self.interceptors?.makeEditNFTInterceptors() ?? [],
        userFunction: self.editNFT(request:context:)
      )

    case "TransferNFT":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Chainmain_Nft_V1_MsgTransferNFT>(),
        responseSerializer: ProtobufSerializer<Chainmain_Nft_V1_MsgTransferNFTResponse>(),
        interceptors: self.interceptors?.makeTransferNFTInterceptors() ?? [],
        userFunction: self.transferNFT(request:context:)
      )

    case "BurnNFT":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Chainmain_Nft_V1_MsgBurnNFT>(),
        responseSerializer: ProtobufSerializer<Chainmain_Nft_V1_MsgBurnNFTResponse>(),
        interceptors: self.interceptors?.makeBurnNFTInterceptors() ?? [],
        userFunction: self.burnNFT(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Chainmain_Nft_V1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'issueDenom'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeIssueDenomInterceptors() -> [ServerInterceptor<Chainmain_Nft_V1_MsgIssueDenom, Chainmain_Nft_V1_MsgIssueDenomResponse>]

  /// - Returns: Interceptors to use when handling 'mintNFT'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeMintNFTInterceptors() -> [ServerInterceptor<Chainmain_Nft_V1_MsgMintNFT, Chainmain_Nft_V1_MsgMintNFTResponse>]

  /// - Returns: Interceptors to use when handling 'editNFT'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeEditNFTInterceptors() -> [ServerInterceptor<Chainmain_Nft_V1_MsgEditNFT, Chainmain_Nft_V1_MsgEditNFTResponse>]

  /// - Returns: Interceptors to use when handling 'transferNFT'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeTransferNFTInterceptors() -> [ServerInterceptor<Chainmain_Nft_V1_MsgTransferNFT, Chainmain_Nft_V1_MsgTransferNFTResponse>]

  /// - Returns: Interceptors to use when handling 'burnNFT'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeBurnNFTInterceptors() -> [ServerInterceptor<Chainmain_Nft_V1_MsgBurnNFT, Chainmain_Nft_V1_MsgBurnNFTResponse>]
}
