//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: bitsong/nft/v1beta1/query.proto
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


/// Query defines the gRPC querier service for NFT module
///
/// Usage: instantiate `Bitsong_Nft_V1beta1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Bitsong_Nft_V1beta1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Bitsong_Nft_V1beta1_QueryClientInterceptorFactoryProtocol? { get }

  func supply(
    _ request: Bitsong_Nft_V1beta1_QuerySupplyRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Bitsong_Nft_V1beta1_QuerySupplyRequest, Bitsong_Nft_V1beta1_QuerySupplyResponse>

  func owner(
    _ request: Bitsong_Nft_V1beta1_QueryOwnerRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Bitsong_Nft_V1beta1_QueryOwnerRequest, Bitsong_Nft_V1beta1_QueryOwnerResponse>

  func collection(
    _ request: Bitsong_Nft_V1beta1_QueryCollectionRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Bitsong_Nft_V1beta1_QueryCollectionRequest, Bitsong_Nft_V1beta1_QueryCollectionResponse>

  func denom(
    _ request: Bitsong_Nft_V1beta1_QueryDenomRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Bitsong_Nft_V1beta1_QueryDenomRequest, Bitsong_Nft_V1beta1_QueryDenomResponse>

  func denomByName(
    _ request: Bitsong_Nft_V1beta1_QueryDenomByNameRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Bitsong_Nft_V1beta1_QueryDenomByNameRequest, Bitsong_Nft_V1beta1_QueryDenomByNameResponse>

  func denoms(
    _ request: Bitsong_Nft_V1beta1_QueryDenomsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Bitsong_Nft_V1beta1_QueryDenomsRequest, Bitsong_Nft_V1beta1_QueryDenomsResponse>

  func nFT(
    _ request: Bitsong_Nft_V1beta1_QueryNFTRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Bitsong_Nft_V1beta1_QueryNFTRequest, Bitsong_Nft_V1beta1_QueryNFTResponse>
}

extension Bitsong_Nft_V1beta1_QueryClientProtocol {
  internal var serviceName: String {
    return "bitsong.nft.v1beta1.Query"
  }

  /// Supply queries the total supply of a given denom or owner
  ///
  /// - Parameters:
  ///   - request: Request to send to Supply.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func supply(
    _ request: Bitsong_Nft_V1beta1_QuerySupplyRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Bitsong_Nft_V1beta1_QuerySupplyRequest, Bitsong_Nft_V1beta1_QuerySupplyResponse> {
    return self.makeUnaryCall(
      path: "/bitsong.nft.v1beta1.Query/Supply",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSupplyInterceptors() ?? []
    )
  }

  /// Owner queries the NFTs of the specified owner
  ///
  /// - Parameters:
  ///   - request: Request to send to Owner.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func owner(
    _ request: Bitsong_Nft_V1beta1_QueryOwnerRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Bitsong_Nft_V1beta1_QueryOwnerRequest, Bitsong_Nft_V1beta1_QueryOwnerResponse> {
    return self.makeUnaryCall(
      path: "/bitsong.nft.v1beta1.Query/Owner",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeOwnerInterceptors() ?? []
    )
  }

  /// Collection queries the NFTs of the specified denom
  ///
  /// - Parameters:
  ///   - request: Request to send to Collection.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func collection(
    _ request: Bitsong_Nft_V1beta1_QueryCollectionRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Bitsong_Nft_V1beta1_QueryCollectionRequest, Bitsong_Nft_V1beta1_QueryCollectionResponse> {
    return self.makeUnaryCall(
      path: "/bitsong.nft.v1beta1.Query/Collection",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCollectionInterceptors() ?? []
    )
  }

  /// Denom queries the definition of a given denom
  ///
  /// - Parameters:
  ///   - request: Request to send to Denom.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func denom(
    _ request: Bitsong_Nft_V1beta1_QueryDenomRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Bitsong_Nft_V1beta1_QueryDenomRequest, Bitsong_Nft_V1beta1_QueryDenomResponse> {
    return self.makeUnaryCall(
      path: "/bitsong.nft.v1beta1.Query/Denom",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDenomInterceptors() ?? []
    )
  }

  /// DenomByName queries the definition of a given denom by name
  ///
  /// - Parameters:
  ///   - request: Request to send to DenomByName.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func denomByName(
    _ request: Bitsong_Nft_V1beta1_QueryDenomByNameRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Bitsong_Nft_V1beta1_QueryDenomByNameRequest, Bitsong_Nft_V1beta1_QueryDenomByNameResponse> {
    return self.makeUnaryCall(
      path: "/bitsong.nft.v1beta1.Query/DenomByName",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDenomByNameInterceptors() ?? []
    )
  }

  /// Denoms queries all the denoms
  ///
  /// - Parameters:
  ///   - request: Request to send to Denoms.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func denoms(
    _ request: Bitsong_Nft_V1beta1_QueryDenomsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Bitsong_Nft_V1beta1_QueryDenomsRequest, Bitsong_Nft_V1beta1_QueryDenomsResponse> {
    return self.makeUnaryCall(
      path: "/bitsong.nft.v1beta1.Query/Denoms",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDenomsInterceptors() ?? []
    )
  }

  /// NFT queries the NFT for the given denom and token ID
  ///
  /// - Parameters:
  ///   - request: Request to send to NFT.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func nFT(
    _ request: Bitsong_Nft_V1beta1_QueryNFTRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Bitsong_Nft_V1beta1_QueryNFTRequest, Bitsong_Nft_V1beta1_QueryNFTResponse> {
    return self.makeUnaryCall(
      path: "/bitsong.nft.v1beta1.Query/NFT",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeNFTInterceptors() ?? []
    )
  }
}

internal protocol Bitsong_Nft_V1beta1_QueryClientInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when invoking 'supply'.
  func makeSupplyInterceptors() -> [ClientInterceptor<Bitsong_Nft_V1beta1_QuerySupplyRequest, Bitsong_Nft_V1beta1_QuerySupplyResponse>]

  /// - Returns: Interceptors to use when invoking 'owner'.
  func makeOwnerInterceptors() -> [ClientInterceptor<Bitsong_Nft_V1beta1_QueryOwnerRequest, Bitsong_Nft_V1beta1_QueryOwnerResponse>]

  /// - Returns: Interceptors to use when invoking 'collection'.
  func makeCollectionInterceptors() -> [ClientInterceptor<Bitsong_Nft_V1beta1_QueryCollectionRequest, Bitsong_Nft_V1beta1_QueryCollectionResponse>]

  /// - Returns: Interceptors to use when invoking 'denom'.
  func makeDenomInterceptors() -> [ClientInterceptor<Bitsong_Nft_V1beta1_QueryDenomRequest, Bitsong_Nft_V1beta1_QueryDenomResponse>]

  /// - Returns: Interceptors to use when invoking 'denomByName'.
  func makeDenomByNameInterceptors() -> [ClientInterceptor<Bitsong_Nft_V1beta1_QueryDenomByNameRequest, Bitsong_Nft_V1beta1_QueryDenomByNameResponse>]

  /// - Returns: Interceptors to use when invoking 'denoms'.
  func makeDenomsInterceptors() -> [ClientInterceptor<Bitsong_Nft_V1beta1_QueryDenomsRequest, Bitsong_Nft_V1beta1_QueryDenomsResponse>]

  /// - Returns: Interceptors to use when invoking 'nFT'.
  func makeNFTInterceptors() -> [ClientInterceptor<Bitsong_Nft_V1beta1_QueryNFTRequest, Bitsong_Nft_V1beta1_QueryNFTResponse>]
}

internal final class Bitsong_Nft_V1beta1_QueryClient: Bitsong_Nft_V1beta1_QueryClientProtocol {
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Bitsong_Nft_V1beta1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the bitsong.nft.v1beta1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Bitsong_Nft_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service for NFT module
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Bitsong_Nft_V1beta1_QueryProvider: CallHandlerProvider {
  var interceptors: Bitsong_Nft_V1beta1_QueryServerInterceptorFactoryProtocol? { get }

  /// Supply queries the total supply of a given denom or owner
  func supply(request: Bitsong_Nft_V1beta1_QuerySupplyRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Bitsong_Nft_V1beta1_QuerySupplyResponse>

  /// Owner queries the NFTs of the specified owner
  func owner(request: Bitsong_Nft_V1beta1_QueryOwnerRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Bitsong_Nft_V1beta1_QueryOwnerResponse>

  /// Collection queries the NFTs of the specified denom
  func collection(request: Bitsong_Nft_V1beta1_QueryCollectionRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Bitsong_Nft_V1beta1_QueryCollectionResponse>

  /// Denom queries the definition of a given denom
  func denom(request: Bitsong_Nft_V1beta1_QueryDenomRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Bitsong_Nft_V1beta1_QueryDenomResponse>

  /// DenomByName queries the definition of a given denom by name
  func denomByName(request: Bitsong_Nft_V1beta1_QueryDenomByNameRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Bitsong_Nft_V1beta1_QueryDenomByNameResponse>

  /// Denoms queries all the denoms
  func denoms(request: Bitsong_Nft_V1beta1_QueryDenomsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Bitsong_Nft_V1beta1_QueryDenomsResponse>

  /// NFT queries the NFT for the given denom and token ID
  func nFT(request: Bitsong_Nft_V1beta1_QueryNFTRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Bitsong_Nft_V1beta1_QueryNFTResponse>
}

extension Bitsong_Nft_V1beta1_QueryProvider {
  internal var serviceName: Substring { return "bitsong.nft.v1beta1.Query" }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Supply":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Bitsong_Nft_V1beta1_QuerySupplyRequest>(),
        responseSerializer: ProtobufSerializer<Bitsong_Nft_V1beta1_QuerySupplyResponse>(),
        interceptors: self.interceptors?.makeSupplyInterceptors() ?? [],
        userFunction: self.supply(request:context:)
      )

    case "Owner":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Bitsong_Nft_V1beta1_QueryOwnerRequest>(),
        responseSerializer: ProtobufSerializer<Bitsong_Nft_V1beta1_QueryOwnerResponse>(),
        interceptors: self.interceptors?.makeOwnerInterceptors() ?? [],
        userFunction: self.owner(request:context:)
      )

    case "Collection":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Bitsong_Nft_V1beta1_QueryCollectionRequest>(),
        responseSerializer: ProtobufSerializer<Bitsong_Nft_V1beta1_QueryCollectionResponse>(),
        interceptors: self.interceptors?.makeCollectionInterceptors() ?? [],
        userFunction: self.collection(request:context:)
      )

    case "Denom":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Bitsong_Nft_V1beta1_QueryDenomRequest>(),
        responseSerializer: ProtobufSerializer<Bitsong_Nft_V1beta1_QueryDenomResponse>(),
        interceptors: self.interceptors?.makeDenomInterceptors() ?? [],
        userFunction: self.denom(request:context:)
      )

    case "DenomByName":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Bitsong_Nft_V1beta1_QueryDenomByNameRequest>(),
        responseSerializer: ProtobufSerializer<Bitsong_Nft_V1beta1_QueryDenomByNameResponse>(),
        interceptors: self.interceptors?.makeDenomByNameInterceptors() ?? [],
        userFunction: self.denomByName(request:context:)
      )

    case "Denoms":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Bitsong_Nft_V1beta1_QueryDenomsRequest>(),
        responseSerializer: ProtobufSerializer<Bitsong_Nft_V1beta1_QueryDenomsResponse>(),
        interceptors: self.interceptors?.makeDenomsInterceptors() ?? [],
        userFunction: self.denoms(request:context:)
      )

    case "NFT":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Bitsong_Nft_V1beta1_QueryNFTRequest>(),
        responseSerializer: ProtobufSerializer<Bitsong_Nft_V1beta1_QueryNFTResponse>(),
        interceptors: self.interceptors?.makeNFTInterceptors() ?? [],
        userFunction: self.nFT(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Bitsong_Nft_V1beta1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'supply'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSupplyInterceptors() -> [ServerInterceptor<Bitsong_Nft_V1beta1_QuerySupplyRequest, Bitsong_Nft_V1beta1_QuerySupplyResponse>]

  /// - Returns: Interceptors to use when handling 'owner'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeOwnerInterceptors() -> [ServerInterceptor<Bitsong_Nft_V1beta1_QueryOwnerRequest, Bitsong_Nft_V1beta1_QueryOwnerResponse>]

  /// - Returns: Interceptors to use when handling 'collection'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCollectionInterceptors() -> [ServerInterceptor<Bitsong_Nft_V1beta1_QueryCollectionRequest, Bitsong_Nft_V1beta1_QueryCollectionResponse>]

  /// - Returns: Interceptors to use when handling 'denom'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDenomInterceptors() -> [ServerInterceptor<Bitsong_Nft_V1beta1_QueryDenomRequest, Bitsong_Nft_V1beta1_QueryDenomResponse>]

  /// - Returns: Interceptors to use when handling 'denomByName'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDenomByNameInterceptors() -> [ServerInterceptor<Bitsong_Nft_V1beta1_QueryDenomByNameRequest, Bitsong_Nft_V1beta1_QueryDenomByNameResponse>]

  /// - Returns: Interceptors to use when handling 'denoms'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDenomsInterceptors() -> [ServerInterceptor<Bitsong_Nft_V1beta1_QueryDenomsRequest, Bitsong_Nft_V1beta1_QueryDenomsResponse>]

  /// - Returns: Interceptors to use when handling 'nFT'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeNFTInterceptors() -> [ServerInterceptor<Bitsong_Nft_V1beta1_QueryNFTRequest, Bitsong_Nft_V1beta1_QueryNFTResponse>]
}
