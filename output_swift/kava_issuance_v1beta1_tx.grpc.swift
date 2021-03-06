//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: kava/issuance/v1beta1/tx.proto
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


/// Msg defines the issuance Msg service.
///
/// Usage: instantiate `Kava_Issuance_V1beta1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Kava_Issuance_V1beta1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Kava_Issuance_V1beta1_MsgClientInterceptorFactoryProtocol? { get }

  func issueTokens(
    _ request: Kava_Issuance_V1beta1_MsgIssueTokens,
    callOptions: CallOptions?
  ) -> UnaryCall<Kava_Issuance_V1beta1_MsgIssueTokens, Kava_Issuance_V1beta1_MsgIssueTokensResponse>

  func redeemTokens(
    _ request: Kava_Issuance_V1beta1_MsgRedeemTokens,
    callOptions: CallOptions?
  ) -> UnaryCall<Kava_Issuance_V1beta1_MsgRedeemTokens, Kava_Issuance_V1beta1_MsgRedeemTokensResponse>

  func blockAddress(
    _ request: Kava_Issuance_V1beta1_MsgBlockAddress,
    callOptions: CallOptions?
  ) -> UnaryCall<Kava_Issuance_V1beta1_MsgBlockAddress, Kava_Issuance_V1beta1_MsgBlockAddressResponse>

  func unblockAddress(
    _ request: Kava_Issuance_V1beta1_MsgUnblockAddress,
    callOptions: CallOptions?
  ) -> UnaryCall<Kava_Issuance_V1beta1_MsgUnblockAddress, Kava_Issuance_V1beta1_MsgUnblockAddressResponse>

  func setPauseStatus(
    _ request: Kava_Issuance_V1beta1_MsgSetPauseStatus,
    callOptions: CallOptions?
  ) -> UnaryCall<Kava_Issuance_V1beta1_MsgSetPauseStatus, Kava_Issuance_V1beta1_MsgSetPauseStatusResponse>
}

extension Kava_Issuance_V1beta1_MsgClientProtocol {
  internal var serviceName: String {
    return "kava.issuance.v1beta1.Msg"
  }

  /// IssueTokens message type used by the issuer to issue new tokens
  ///
  /// - Parameters:
  ///   - request: Request to send to IssueTokens.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func issueTokens(
    _ request: Kava_Issuance_V1beta1_MsgIssueTokens,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kava_Issuance_V1beta1_MsgIssueTokens, Kava_Issuance_V1beta1_MsgIssueTokensResponse> {
    return self.makeUnaryCall(
      path: "/kava.issuance.v1beta1.Msg/IssueTokens",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeIssueTokensInterceptors() ?? []
    )
  }

  /// RedeemTokens message type used by the issuer to redeem (burn) tokens
  ///
  /// - Parameters:
  ///   - request: Request to send to RedeemTokens.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func redeemTokens(
    _ request: Kava_Issuance_V1beta1_MsgRedeemTokens,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kava_Issuance_V1beta1_MsgRedeemTokens, Kava_Issuance_V1beta1_MsgRedeemTokensResponse> {
    return self.makeUnaryCall(
      path: "/kava.issuance.v1beta1.Msg/RedeemTokens",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRedeemTokensInterceptors() ?? []
    )
  }

  /// BlockAddress message type used by the issuer to block an address from holding or transferring tokens
  ///
  /// - Parameters:
  ///   - request: Request to send to BlockAddress.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func blockAddress(
    _ request: Kava_Issuance_V1beta1_MsgBlockAddress,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kava_Issuance_V1beta1_MsgBlockAddress, Kava_Issuance_V1beta1_MsgBlockAddressResponse> {
    return self.makeUnaryCall(
      path: "/kava.issuance.v1beta1.Msg/BlockAddress",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBlockAddressInterceptors() ?? []
    )
  }

  /// UnblockAddress message type used by the issuer to unblock an address from holding or transferring tokens
  ///
  /// - Parameters:
  ///   - request: Request to send to UnblockAddress.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func unblockAddress(
    _ request: Kava_Issuance_V1beta1_MsgUnblockAddress,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kava_Issuance_V1beta1_MsgUnblockAddress, Kava_Issuance_V1beta1_MsgUnblockAddressResponse> {
    return self.makeUnaryCall(
      path: "/kava.issuance.v1beta1.Msg/UnblockAddress",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUnblockAddressInterceptors() ?? []
    )
  }

  /// SetPauseStatus message type used to pause or unpause status
  ///
  /// - Parameters:
  ///   - request: Request to send to SetPauseStatus.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func setPauseStatus(
    _ request: Kava_Issuance_V1beta1_MsgSetPauseStatus,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Kava_Issuance_V1beta1_MsgSetPauseStatus, Kava_Issuance_V1beta1_MsgSetPauseStatusResponse> {
    return self.makeUnaryCall(
      path: "/kava.issuance.v1beta1.Msg/SetPauseStatus",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetPauseStatusInterceptors() ?? []
    )
  }
}

internal protocol Kava_Issuance_V1beta1_MsgClientInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when invoking 'issueTokens'.
  func makeIssueTokensInterceptors() -> [ClientInterceptor<Kava_Issuance_V1beta1_MsgIssueTokens, Kava_Issuance_V1beta1_MsgIssueTokensResponse>]

  /// - Returns: Interceptors to use when invoking 'redeemTokens'.
  func makeRedeemTokensInterceptors() -> [ClientInterceptor<Kava_Issuance_V1beta1_MsgRedeemTokens, Kava_Issuance_V1beta1_MsgRedeemTokensResponse>]

  /// - Returns: Interceptors to use when invoking 'blockAddress'.
  func makeBlockAddressInterceptors() -> [ClientInterceptor<Kava_Issuance_V1beta1_MsgBlockAddress, Kava_Issuance_V1beta1_MsgBlockAddressResponse>]

  /// - Returns: Interceptors to use when invoking 'unblockAddress'.
  func makeUnblockAddressInterceptors() -> [ClientInterceptor<Kava_Issuance_V1beta1_MsgUnblockAddress, Kava_Issuance_V1beta1_MsgUnblockAddressResponse>]

  /// - Returns: Interceptors to use when invoking 'setPauseStatus'.
  func makeSetPauseStatusInterceptors() -> [ClientInterceptor<Kava_Issuance_V1beta1_MsgSetPauseStatus, Kava_Issuance_V1beta1_MsgSetPauseStatusResponse>]
}

internal final class Kava_Issuance_V1beta1_MsgClient: Kava_Issuance_V1beta1_MsgClientProtocol {
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Kava_Issuance_V1beta1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the kava.issuance.v1beta1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Kava_Issuance_V1beta1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the issuance Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Kava_Issuance_V1beta1_MsgProvider: CallHandlerProvider {
  var interceptors: Kava_Issuance_V1beta1_MsgServerInterceptorFactoryProtocol? { get }

  /// IssueTokens message type used by the issuer to issue new tokens
  func issueTokens(request: Kava_Issuance_V1beta1_MsgIssueTokens, context: StatusOnlyCallContext) -> EventLoopFuture<Kava_Issuance_V1beta1_MsgIssueTokensResponse>

  /// RedeemTokens message type used by the issuer to redeem (burn) tokens
  func redeemTokens(request: Kava_Issuance_V1beta1_MsgRedeemTokens, context: StatusOnlyCallContext) -> EventLoopFuture<Kava_Issuance_V1beta1_MsgRedeemTokensResponse>

  /// BlockAddress message type used by the issuer to block an address from holding or transferring tokens
  func blockAddress(request: Kava_Issuance_V1beta1_MsgBlockAddress, context: StatusOnlyCallContext) -> EventLoopFuture<Kava_Issuance_V1beta1_MsgBlockAddressResponse>

  /// UnblockAddress message type used by the issuer to unblock an address from holding or transferring tokens
  func unblockAddress(request: Kava_Issuance_V1beta1_MsgUnblockAddress, context: StatusOnlyCallContext) -> EventLoopFuture<Kava_Issuance_V1beta1_MsgUnblockAddressResponse>

  /// SetPauseStatus message type used to pause or unpause status
  func setPauseStatus(request: Kava_Issuance_V1beta1_MsgSetPauseStatus, context: StatusOnlyCallContext) -> EventLoopFuture<Kava_Issuance_V1beta1_MsgSetPauseStatusResponse>
}

extension Kava_Issuance_V1beta1_MsgProvider {
  internal var serviceName: Substring { return "kava.issuance.v1beta1.Msg" }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "IssueTokens":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Issuance_V1beta1_MsgIssueTokens>(),
        responseSerializer: ProtobufSerializer<Kava_Issuance_V1beta1_MsgIssueTokensResponse>(),
        interceptors: self.interceptors?.makeIssueTokensInterceptors() ?? [],
        userFunction: self.issueTokens(request:context:)
      )

    case "RedeemTokens":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Issuance_V1beta1_MsgRedeemTokens>(),
        responseSerializer: ProtobufSerializer<Kava_Issuance_V1beta1_MsgRedeemTokensResponse>(),
        interceptors: self.interceptors?.makeRedeemTokensInterceptors() ?? [],
        userFunction: self.redeemTokens(request:context:)
      )

    case "BlockAddress":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Issuance_V1beta1_MsgBlockAddress>(),
        responseSerializer: ProtobufSerializer<Kava_Issuance_V1beta1_MsgBlockAddressResponse>(),
        interceptors: self.interceptors?.makeBlockAddressInterceptors() ?? [],
        userFunction: self.blockAddress(request:context:)
      )

    case "UnblockAddress":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Issuance_V1beta1_MsgUnblockAddress>(),
        responseSerializer: ProtobufSerializer<Kava_Issuance_V1beta1_MsgUnblockAddressResponse>(),
        interceptors: self.interceptors?.makeUnblockAddressInterceptors() ?? [],
        userFunction: self.unblockAddress(request:context:)
      )

    case "SetPauseStatus":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Kava_Issuance_V1beta1_MsgSetPauseStatus>(),
        responseSerializer: ProtobufSerializer<Kava_Issuance_V1beta1_MsgSetPauseStatusResponse>(),
        interceptors: self.interceptors?.makeSetPauseStatusInterceptors() ?? [],
        userFunction: self.setPauseStatus(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Kava_Issuance_V1beta1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'issueTokens'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeIssueTokensInterceptors() -> [ServerInterceptor<Kava_Issuance_V1beta1_MsgIssueTokens, Kava_Issuance_V1beta1_MsgIssueTokensResponse>]

  /// - Returns: Interceptors to use when handling 'redeemTokens'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRedeemTokensInterceptors() -> [ServerInterceptor<Kava_Issuance_V1beta1_MsgRedeemTokens, Kava_Issuance_V1beta1_MsgRedeemTokensResponse>]

  /// - Returns: Interceptors to use when handling 'blockAddress'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeBlockAddressInterceptors() -> [ServerInterceptor<Kava_Issuance_V1beta1_MsgBlockAddress, Kava_Issuance_V1beta1_MsgBlockAddressResponse>]

  /// - Returns: Interceptors to use when handling 'unblockAddress'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeUnblockAddressInterceptors() -> [ServerInterceptor<Kava_Issuance_V1beta1_MsgUnblockAddress, Kava_Issuance_V1beta1_MsgUnblockAddressResponse>]

  /// - Returns: Interceptors to use when handling 'setPauseStatus'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSetPauseStatusInterceptors() -> [ServerInterceptor<Kava_Issuance_V1beta1_MsgSetPauseStatus, Kava_Issuance_V1beta1_MsgSetPauseStatusResponse>]
}
