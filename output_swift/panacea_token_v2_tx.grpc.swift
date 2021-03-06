//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: panacea/token/v2/tx.proto
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
/// Usage: instantiate `Panacea_Token_V2_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Panacea_Token_V2_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Panacea_Token_V2_MsgClientInterceptorFactoryProtocol? { get }

  func issueToken(
    _ request: Panacea_Token_V2_MsgIssueToken,
    callOptions: CallOptions?
  ) -> UnaryCall<Panacea_Token_V2_MsgIssueToken, Panacea_Token_V2_MsgIssueTokenResponse>
}

extension Panacea_Token_V2_MsgClientProtocol {
  internal var serviceName: String {
    return "panacea.token.v2.Msg"
  }

  /// IssueToken defines a method for issuing a token.
  ///
  /// - Parameters:
  ///   - request: Request to send to IssueToken.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func issueToken(
    _ request: Panacea_Token_V2_MsgIssueToken,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Panacea_Token_V2_MsgIssueToken, Panacea_Token_V2_MsgIssueTokenResponse> {
    return self.makeUnaryCall(
      path: "/panacea.token.v2.Msg/IssueToken",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeIssueTokenInterceptors() ?? []
    )
  }
}

internal protocol Panacea_Token_V2_MsgClientInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when invoking 'issueToken'.
  func makeIssueTokenInterceptors() -> [ClientInterceptor<Panacea_Token_V2_MsgIssueToken, Panacea_Token_V2_MsgIssueTokenResponse>]
}

internal final class Panacea_Token_V2_MsgClient: Panacea_Token_V2_MsgClientProtocol {
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Panacea_Token_V2_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the panacea.token.v2.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Panacea_Token_V2_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Panacea_Token_V2_MsgProvider: CallHandlerProvider {
  var interceptors: Panacea_Token_V2_MsgServerInterceptorFactoryProtocol? { get }

  /// IssueToken defines a method for issuing a token.
  func issueToken(request: Panacea_Token_V2_MsgIssueToken, context: StatusOnlyCallContext) -> EventLoopFuture<Panacea_Token_V2_MsgIssueTokenResponse>
}

extension Panacea_Token_V2_MsgProvider {
  internal var serviceName: Substring { return "panacea.token.v2.Msg" }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "IssueToken":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Panacea_Token_V2_MsgIssueToken>(),
        responseSerializer: ProtobufSerializer<Panacea_Token_V2_MsgIssueTokenResponse>(),
        interceptors: self.interceptors?.makeIssueTokenInterceptors() ?? [],
        userFunction: self.issueToken(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Panacea_Token_V2_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'issueToken'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeIssueTokenInterceptors() -> [ServerInterceptor<Panacea_Token_V2_MsgIssueToken, Panacea_Token_V2_MsgIssueTokenResponse>]
}
