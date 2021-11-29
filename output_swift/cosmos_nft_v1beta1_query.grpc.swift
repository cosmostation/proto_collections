//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: cosmos/nft/v1beta1/query.proto
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
/// Usage: instantiate `Cosmos_Nft_V1beta1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Cosmos_Nft_V1beta1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Cosmos_Nft_V1beta1_QueryClientInterceptorFactoryProtocol? { get }

  func balance(
    _ request: Cosmos_Nft_V1beta1_QueryBalanceRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Cosmos_Nft_V1beta1_QueryBalanceRequest, Cosmos_Nft_V1beta1_QueryBalanceResponse>

  func owner(
    _ request: Cosmos_Nft_V1beta1_QueryOwnerRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Cosmos_Nft_V1beta1_QueryOwnerRequest, Cosmos_Nft_V1beta1_QueryOwnerResponse>

  func supply(
    _ request: Cosmos_Nft_V1beta1_QuerySupplyRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Cosmos_Nft_V1beta1_QuerySupplyRequest, Cosmos_Nft_V1beta1_QuerySupplyResponse>

  func nFTsOfClass(
    _ request: Cosmos_Nft_V1beta1_QueryNFTsOfClassRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Cosmos_Nft_V1beta1_QueryNFTsOfClassRequest, Cosmos_Nft_V1beta1_QueryNFTsOfClassResponse>

  func nFT(
    _ request: Cosmos_Nft_V1beta1_QueryNFTRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Cosmos_Nft_V1beta1_QueryNFTRequest, Cosmos_Nft_V1beta1_QueryNFTResponse>

  func class(
    _ request: Cosmos_Nft_V1beta1_QueryClassRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Cosmos_Nft_V1beta1_QueryClassRequest, Cosmos_Nft_V1beta1_QueryClassResponse>

  func classes(
    _ request: Cosmos_Nft_V1beta1_QueryClassesRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Cosmos_Nft_V1beta1_QueryClassesRequest, Cosmos_Nft_V1beta1_QueryClassesResponse>
}

extension Cosmos_Nft_V1beta1_QueryClientProtocol {
  internal var serviceName: String {
    return "cosmos.nft.v1beta1.Query"
  }

  /// Balance queries the number of NFTs of a given class owned by the owner, same as balanceOf in ERC721
  ///
  /// - Parameters:
  ///   - request: Request to send to Balance.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func balance(
    _ request: Cosmos_Nft_V1beta1_QueryBalanceRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Cosmos_Nft_V1beta1_QueryBalanceRequest, Cosmos_Nft_V1beta1_QueryBalanceResponse> {
    return self.makeUnaryCall(
      path: "/cosmos.nft.v1beta1.Query/Balance",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBalanceInterceptors() ?? []
    )
  }

  /// Owner queries the owner of the NFT based on its class and id, same as ownerOf in ERC721
  ///
  /// - Parameters:
  ///   - request: Request to send to Owner.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func owner(
    _ request: Cosmos_Nft_V1beta1_QueryOwnerRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Cosmos_Nft_V1beta1_QueryOwnerRequest, Cosmos_Nft_V1beta1_QueryOwnerResponse> {
    return self.makeUnaryCall(
      path: "/cosmos.nft.v1beta1.Query/Owner",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeOwnerInterceptors() ?? []
    )
  }

  /// Supply queries the number of NFTs from the given class, same as totalSupply of ERC721.
  ///
  /// - Parameters:
  ///   - request: Request to send to Supply.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func supply(
    _ request: Cosmos_Nft_V1beta1_QuerySupplyRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Cosmos_Nft_V1beta1_QuerySupplyRequest, Cosmos_Nft_V1beta1_QuerySupplyResponse> {
    return self.makeUnaryCall(
      path: "/cosmos.nft.v1beta1.Query/Supply",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSupplyInterceptors() ?? []
    )
  }

  /// NFTsOfClass queries all NFTs of a given class or optional owner, similar to tokenByIndex in ERC721Enumerable
  ///
  /// - Parameters:
  ///   - request: Request to send to NFTsOfClass.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func nFTsOfClass(
    _ request: Cosmos_Nft_V1beta1_QueryNFTsOfClassRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Cosmos_Nft_V1beta1_QueryNFTsOfClassRequest, Cosmos_Nft_V1beta1_QueryNFTsOfClassResponse> {
    return self.makeUnaryCall(
      path: "/cosmos.nft.v1beta1.Query/NFTsOfClass",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeNFTsOfClassInterceptors() ?? []
    )
  }

  /// NFT queries an NFT based on its class and id.
  ///
  /// - Parameters:
  ///   - request: Request to send to NFT.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func nFT(
    _ request: Cosmos_Nft_V1beta1_QueryNFTRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Cosmos_Nft_V1beta1_QueryNFTRequest, Cosmos_Nft_V1beta1_QueryNFTResponse> {
    return self.makeUnaryCall(
      path: "/cosmos.nft.v1beta1.Query/NFT",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeNFTInterceptors() ?? []
    )
  }

  /// Class queries an NFT class based on its id
  ///
  /// - Parameters:
  ///   - request: Request to send to Class.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func class(
    _ request: Cosmos_Nft_V1beta1_QueryClassRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Cosmos_Nft_V1beta1_QueryClassRequest, Cosmos_Nft_V1beta1_QueryClassResponse> {
    return self.makeUnaryCall(
      path: "/cosmos.nft.v1beta1.Query/Class",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClassInterceptors() ?? []
    )
  }

  /// Classes queries all NFT classes
  ///
  /// - Parameters:
  ///   - request: Request to send to Classes.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func classes(
    _ request: Cosmos_Nft_V1beta1_QueryClassesRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Cosmos_Nft_V1beta1_QueryClassesRequest, Cosmos_Nft_V1beta1_QueryClassesResponse> {
    return self.makeUnaryCall(
      path: "/cosmos.nft.v1beta1.Query/Classes",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeClassesInterceptors() ?? []
    )
  }
}

internal protocol Cosmos_Nft_V1beta1_QueryClientInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when invoking 'balance'.
  func makeBalanceInterceptors() -> [ClientInterceptor<Cosmos_Nft_V1beta1_QueryBalanceRequest, Cosmos_Nft_V1beta1_QueryBalanceResponse>]

  /// - Returns: Interceptors to use when invoking 'owner'.
  func makeOwnerInterceptors() -> [ClientInterceptor<Cosmos_Nft_V1beta1_QueryOwnerRequest, Cosmos_Nft_V1beta1_QueryOwnerResponse>]

  /// - Returns: Interceptors to use when invoking 'supply'.
  func makeSupplyInterceptors() -> [ClientInterceptor<Cosmos_Nft_V1beta1_QuerySupplyRequest, Cosmos_Nft_V1beta1_QuerySupplyResponse>]

  /// - Returns: Interceptors to use when invoking 'nFTsOfClass'.
  func makeNFTsOfClassInterceptors() -> [ClientInterceptor<Cosmos_Nft_V1beta1_QueryNFTsOfClassRequest, Cosmos_Nft_V1beta1_QueryNFTsOfClassResponse>]

  /// - Returns: Interceptors to use when invoking 'nFT'.
  func makeNFTInterceptors() -> [ClientInterceptor<Cosmos_Nft_V1beta1_QueryNFTRequest, Cosmos_Nft_V1beta1_QueryNFTResponse>]

  /// - Returns: Interceptors to use when invoking 'class'.
  func makeClassInterceptors() -> [ClientInterceptor<Cosmos_Nft_V1beta1_QueryClassRequest, Cosmos_Nft_V1beta1_QueryClassResponse>]

  /// - Returns: Interceptors to use when invoking 'classes'.
  func makeClassesInterceptors() -> [ClientInterceptor<Cosmos_Nft_V1beta1_QueryClassesRequest, Cosmos_Nft_V1beta1_QueryClassesResponse>]
}

internal final class Cosmos_Nft_V1beta1_QueryClient: Cosmos_Nft_V1beta1_QueryClientProtocol {
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Cosmos_Nft_V1beta1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the cosmos.nft.v1beta1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Cosmos_Nft_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Cosmos_Nft_V1beta1_QueryProvider: CallHandlerProvider {
  var interceptors: Cosmos_Nft_V1beta1_QueryServerInterceptorFactoryProtocol? { get }

  /// Balance queries the number of NFTs of a given class owned by the owner, same as balanceOf in ERC721
  func balance(request: Cosmos_Nft_V1beta1_QueryBalanceRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Cosmos_Nft_V1beta1_QueryBalanceResponse>

  /// Owner queries the owner of the NFT based on its class and id, same as ownerOf in ERC721
  func owner(request: Cosmos_Nft_V1beta1_QueryOwnerRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Cosmos_Nft_V1beta1_QueryOwnerResponse>

  /// Supply queries the number of NFTs from the given class, same as totalSupply of ERC721.
  func supply(request: Cosmos_Nft_V1beta1_QuerySupplyRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Cosmos_Nft_V1beta1_QuerySupplyResponse>

  /// NFTsOfClass queries all NFTs of a given class or optional owner, similar to tokenByIndex in ERC721Enumerable
  func nFTsOfClass(request: Cosmos_Nft_V1beta1_QueryNFTsOfClassRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Cosmos_Nft_V1beta1_QueryNFTsOfClassResponse>

  /// NFT queries an NFT based on its class and id.
  func nFT(request: Cosmos_Nft_V1beta1_QueryNFTRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Cosmos_Nft_V1beta1_QueryNFTResponse>

  /// Class queries an NFT class based on its id
  func class(request: Cosmos_Nft_V1beta1_QueryClassRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Cosmos_Nft_V1beta1_QueryClassResponse>

  /// Classes queries all NFT classes
  func classes(request: Cosmos_Nft_V1beta1_QueryClassesRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Cosmos_Nft_V1beta1_QueryClassesResponse>
}

extension Cosmos_Nft_V1beta1_QueryProvider {
  internal var serviceName: Substring { return "cosmos.nft.v1beta1.Query" }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Balance":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cosmos_Nft_V1beta1_QueryBalanceRequest>(),
        responseSerializer: ProtobufSerializer<Cosmos_Nft_V1beta1_QueryBalanceResponse>(),
        interceptors: self.interceptors?.makeBalanceInterceptors() ?? [],
        userFunction: self.balance(request:context:)
      )

    case "Owner":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cosmos_Nft_V1beta1_QueryOwnerRequest>(),
        responseSerializer: ProtobufSerializer<Cosmos_Nft_V1beta1_QueryOwnerResponse>(),
        interceptors: self.interceptors?.makeOwnerInterceptors() ?? [],
        userFunction: self.owner(request:context:)
      )

    case "Supply":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cosmos_Nft_V1beta1_QuerySupplyRequest>(),
        responseSerializer: ProtobufSerializer<Cosmos_Nft_V1beta1_QuerySupplyResponse>(),
        interceptors: self.interceptors?.makeSupplyInterceptors() ?? [],
        userFunction: self.supply(request:context:)
      )

    case "NFTsOfClass":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cosmos_Nft_V1beta1_QueryNFTsOfClassRequest>(),
        responseSerializer: ProtobufSerializer<Cosmos_Nft_V1beta1_QueryNFTsOfClassResponse>(),
        interceptors: self.interceptors?.makeNFTsOfClassInterceptors() ?? [],
        userFunction: self.nFTsOfClass(request:context:)
      )

    case "NFT":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cosmos_Nft_V1beta1_QueryNFTRequest>(),
        responseSerializer: ProtobufSerializer<Cosmos_Nft_V1beta1_QueryNFTResponse>(),
        interceptors: self.interceptors?.makeNFTInterceptors() ?? [],
        userFunction: self.nFT(request:context:)
      )

    case "Class":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cosmos_Nft_V1beta1_QueryClassRequest>(),
        responseSerializer: ProtobufSerializer<Cosmos_Nft_V1beta1_QueryClassResponse>(),
        interceptors: self.interceptors?.makeClassInterceptors() ?? [],
        userFunction: self.class(request:context:)
      )

    case "Classes":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cosmos_Nft_V1beta1_QueryClassesRequest>(),
        responseSerializer: ProtobufSerializer<Cosmos_Nft_V1beta1_QueryClassesResponse>(),
        interceptors: self.interceptors?.makeClassesInterceptors() ?? [],
        userFunction: self.classes(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Cosmos_Nft_V1beta1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'balance'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeBalanceInterceptors() -> [ServerInterceptor<Cosmos_Nft_V1beta1_QueryBalanceRequest, Cosmos_Nft_V1beta1_QueryBalanceResponse>]

  /// - Returns: Interceptors to use when handling 'owner'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeOwnerInterceptors() -> [ServerInterceptor<Cosmos_Nft_V1beta1_QueryOwnerRequest, Cosmos_Nft_V1beta1_QueryOwnerResponse>]

  /// - Returns: Interceptors to use when handling 'supply'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSupplyInterceptors() -> [ServerInterceptor<Cosmos_Nft_V1beta1_QuerySupplyRequest, Cosmos_Nft_V1beta1_QuerySupplyResponse>]

  /// - Returns: Interceptors to use when handling 'nFTsOfClass'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeNFTsOfClassInterceptors() -> [ServerInterceptor<Cosmos_Nft_V1beta1_QueryNFTsOfClassRequest, Cosmos_Nft_V1beta1_QueryNFTsOfClassResponse>]

  /// - Returns: Interceptors to use when handling 'nFT'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeNFTInterceptors() -> [ServerInterceptor<Cosmos_Nft_V1beta1_QueryNFTRequest, Cosmos_Nft_V1beta1_QueryNFTResponse>]

  /// - Returns: Interceptors to use when handling 'class'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeClassInterceptors() -> [ServerInterceptor<Cosmos_Nft_V1beta1_QueryClassRequest, Cosmos_Nft_V1beta1_QueryClassResponse>]

  /// - Returns: Interceptors to use when handling 'classes'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeClassesInterceptors() -> [ServerInterceptor<Cosmos_Nft_V1beta1_QueryClassesRequest, Cosmos_Nft_V1beta1_QueryClassesResponse>]
}
