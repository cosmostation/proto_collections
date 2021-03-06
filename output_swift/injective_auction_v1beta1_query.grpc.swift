//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: injective/auction/v1beta1/query.proto
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
/// Usage: instantiate `Injective_Auction_V1beta1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Injective_Auction_V1beta1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Injective_Auction_V1beta1_QueryClientInterceptorFactoryProtocol? { get }

  func auctionParams(
    _ request: Injective_Auction_V1beta1_QueryAuctionParamsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Injective_Auction_V1beta1_QueryAuctionParamsRequest, Injective_Auction_V1beta1_QueryAuctionParamsResponse>

  func currentAuctionBasket(
    _ request: Injective_Auction_V1beta1_QueryCurrentAuctionBasketRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Injective_Auction_V1beta1_QueryCurrentAuctionBasketRequest, Injective_Auction_V1beta1_QueryCurrentAuctionBasketResponse>

  func auctionModuleState(
    _ request: Injective_Auction_V1beta1_QueryModuleStateRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Injective_Auction_V1beta1_QueryModuleStateRequest, Injective_Auction_V1beta1_QueryModuleStateResponse>
}

extension Injective_Auction_V1beta1_QueryClientProtocol {
  internal var serviceName: String {
    return "injective.auction.v1beta1.Query"
  }

  /// Retrieves auction params
  ///
  /// - Parameters:
  ///   - request: Request to send to AuctionParams.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func auctionParams(
    _ request: Injective_Auction_V1beta1_QueryAuctionParamsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Injective_Auction_V1beta1_QueryAuctionParamsRequest, Injective_Auction_V1beta1_QueryAuctionParamsResponse> {
    return self.makeUnaryCall(
      path: "/injective.auction.v1beta1.Query/AuctionParams",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAuctionParamsInterceptors() ?? []
    )
  }

  /// Retrieves current auction basket with current highest bid and bidder
  ///
  /// - Parameters:
  ///   - request: Request to send to CurrentAuctionBasket.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func currentAuctionBasket(
    _ request: Injective_Auction_V1beta1_QueryCurrentAuctionBasketRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Injective_Auction_V1beta1_QueryCurrentAuctionBasketRequest, Injective_Auction_V1beta1_QueryCurrentAuctionBasketResponse> {
    return self.makeUnaryCall(
      path: "/injective.auction.v1beta1.Query/CurrentAuctionBasket",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCurrentAuctionBasketInterceptors() ?? []
    )
  }

  /// Retrieves the entire auction module's state
  ///
  /// - Parameters:
  ///   - request: Request to send to AuctionModuleState.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func auctionModuleState(
    _ request: Injective_Auction_V1beta1_QueryModuleStateRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Injective_Auction_V1beta1_QueryModuleStateRequest, Injective_Auction_V1beta1_QueryModuleStateResponse> {
    return self.makeUnaryCall(
      path: "/injective.auction.v1beta1.Query/AuctionModuleState",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAuctionModuleStateInterceptors() ?? []
    )
  }
}

internal protocol Injective_Auction_V1beta1_QueryClientInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when invoking 'auctionParams'.
  func makeAuctionParamsInterceptors() -> [ClientInterceptor<Injective_Auction_V1beta1_QueryAuctionParamsRequest, Injective_Auction_V1beta1_QueryAuctionParamsResponse>]

  /// - Returns: Interceptors to use when invoking 'currentAuctionBasket'.
  func makeCurrentAuctionBasketInterceptors() -> [ClientInterceptor<Injective_Auction_V1beta1_QueryCurrentAuctionBasketRequest, Injective_Auction_V1beta1_QueryCurrentAuctionBasketResponse>]

  /// - Returns: Interceptors to use when invoking 'auctionModuleState'.
  func makeAuctionModuleStateInterceptors() -> [ClientInterceptor<Injective_Auction_V1beta1_QueryModuleStateRequest, Injective_Auction_V1beta1_QueryModuleStateResponse>]
}

internal final class Injective_Auction_V1beta1_QueryClient: Injective_Auction_V1beta1_QueryClientProtocol {
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Injective_Auction_V1beta1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the injective.auction.v1beta1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Injective_Auction_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Injective_Auction_V1beta1_QueryProvider: CallHandlerProvider {
  var interceptors: Injective_Auction_V1beta1_QueryServerInterceptorFactoryProtocol? { get }

  /// Retrieves auction params
  func auctionParams(request: Injective_Auction_V1beta1_QueryAuctionParamsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Injective_Auction_V1beta1_QueryAuctionParamsResponse>

  /// Retrieves current auction basket with current highest bid and bidder
  func currentAuctionBasket(request: Injective_Auction_V1beta1_QueryCurrentAuctionBasketRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Injective_Auction_V1beta1_QueryCurrentAuctionBasketResponse>

  /// Retrieves the entire auction module's state
  func auctionModuleState(request: Injective_Auction_V1beta1_QueryModuleStateRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Injective_Auction_V1beta1_QueryModuleStateResponse>
}

extension Injective_Auction_V1beta1_QueryProvider {
  internal var serviceName: Substring { return "injective.auction.v1beta1.Query" }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "AuctionParams":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Injective_Auction_V1beta1_QueryAuctionParamsRequest>(),
        responseSerializer: ProtobufSerializer<Injective_Auction_V1beta1_QueryAuctionParamsResponse>(),
        interceptors: self.interceptors?.makeAuctionParamsInterceptors() ?? [],
        userFunction: self.auctionParams(request:context:)
      )

    case "CurrentAuctionBasket":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Injective_Auction_V1beta1_QueryCurrentAuctionBasketRequest>(),
        responseSerializer: ProtobufSerializer<Injective_Auction_V1beta1_QueryCurrentAuctionBasketResponse>(),
        interceptors: self.interceptors?.makeCurrentAuctionBasketInterceptors() ?? [],
        userFunction: self.currentAuctionBasket(request:context:)
      )

    case "AuctionModuleState":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Injective_Auction_V1beta1_QueryModuleStateRequest>(),
        responseSerializer: ProtobufSerializer<Injective_Auction_V1beta1_QueryModuleStateResponse>(),
        interceptors: self.interceptors?.makeAuctionModuleStateInterceptors() ?? [],
        userFunction: self.auctionModuleState(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Injective_Auction_V1beta1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'auctionParams'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAuctionParamsInterceptors() -> [ServerInterceptor<Injective_Auction_V1beta1_QueryAuctionParamsRequest, Injective_Auction_V1beta1_QueryAuctionParamsResponse>]

  /// - Returns: Interceptors to use when handling 'currentAuctionBasket'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCurrentAuctionBasketInterceptors() -> [ServerInterceptor<Injective_Auction_V1beta1_QueryCurrentAuctionBasketRequest, Injective_Auction_V1beta1_QueryCurrentAuctionBasketResponse>]

  /// - Returns: Interceptors to use when handling 'auctionModuleState'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAuctionModuleStateInterceptors() -> [ServerInterceptor<Injective_Auction_V1beta1_QueryModuleStateRequest, Injective_Auction_V1beta1_QueryModuleStateResponse>]
}
