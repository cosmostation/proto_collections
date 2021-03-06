//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: stargaze/claim/v1beta1/tx.proto
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
/// Usage: instantiate `Publicawesome_Stargaze_Claim_V1beta1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Publicawesome_Stargaze_Claim_V1beta1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Publicawesome_Stargaze_Claim_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func initialClaim(
    _ request: Publicawesome_Stargaze_Claim_V1beta1_MsgInitialClaim,
    callOptions: CallOptions?
  ) -> UnaryCall<Publicawesome_Stargaze_Claim_V1beta1_MsgInitialClaim, Publicawesome_Stargaze_Claim_V1beta1_MsgInitialClaimResponse>
}

extension Publicawesome_Stargaze_Claim_V1beta1_MsgClientProtocol {
  internal var serviceName: String {
    return "publicawesome.stargaze.claim.v1beta1.Msg"
  }

  /// this line is used by starport scaffolding # proto/tx/rpc
  ///
  /// - Parameters:
  ///   - request: Request to send to InitialClaim.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func initialClaim(
    _ request: Publicawesome_Stargaze_Claim_V1beta1_MsgInitialClaim,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Publicawesome_Stargaze_Claim_V1beta1_MsgInitialClaim, Publicawesome_Stargaze_Claim_V1beta1_MsgInitialClaimResponse> {
    return self.makeUnaryCall(
      path: "/publicawesome.stargaze.claim.v1beta1.Msg/InitialClaim",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeInitialClaimInterceptors() ?? []
    )
  }
}

internal protocol Publicawesome_Stargaze_Claim_V1beta1_MsgClientInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when invoking 'initialClaim'.
  func makeInitialClaimInterceptors() -> [ClientInterceptor<Publicawesome_Stargaze_Claim_V1beta1_MsgInitialClaim, Publicawesome_Stargaze_Claim_V1beta1_MsgInitialClaimResponse>]
}

internal final class Publicawesome_Stargaze_Claim_V1beta1_MsgClient: Publicawesome_Stargaze_Claim_V1beta1_MsgClientProtocol {
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Publicawesome_Stargaze_Claim_V1beta1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the publicawesome.stargaze.claim.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Publicawesome_Stargaze_Claim_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Publicawesome_Stargaze_Claim_V1beta1_MsgProvider: CallHandlerProvider {
  var interceptors: Publicawesome_Stargaze_Claim_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  /// this line is used by starport scaffolding # proto/tx/rpc
  func initialClaim(request: Publicawesome_Stargaze_Claim_V1beta1_MsgInitialClaim, context: StatusOnlyCallContext) -> EventLoopFuture<Publicawesome_Stargaze_Claim_V1beta1_MsgInitialClaimResponse>
}

extension Publicawesome_Stargaze_Claim_V1beta1_MsgProvider {
  internal var serviceName: Substring { return "publicawesome.stargaze.claim.v1beta1.Msg" }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "InitialClaim":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Publicawesome_Stargaze_Claim_V1beta1_MsgInitialClaim>(),
        responseSerializer: ProtobufSerializer<Publicawesome_Stargaze_Claim_V1beta1_MsgInitialClaimResponse>(),
        interceptors: self.interceptors?.makeInitialClaimInterceptors() ?? [],
        userFunction: self.initialClaim(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Publicawesome_Stargaze_Claim_V1beta1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'initialClaim'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeInitialClaimInterceptors() -> [ServerInterceptor<Publicawesome_Stargaze_Claim_V1beta1_MsgInitialClaim, Publicawesome_Stargaze_Claim_V1beta1_MsgInitialClaimResponse>]
}
