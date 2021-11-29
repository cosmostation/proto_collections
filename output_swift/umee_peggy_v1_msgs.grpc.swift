//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: umee/peggy/v1/msgs.proto
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


/// Usage: instantiate `Umeenetwork_Umee_Peggy_V1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Umeenetwork_Umee_Peggy_V1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Umeenetwork_Umee_Peggy_V1_MsgClientInterceptorFactoryProtocol? { get }

  func valsetConfirm(
    _ request: Umeenetwork_Umee_Peggy_V1_MsgValsetConfirm,
    callOptions: CallOptions?
  ) -> UnaryCall<Umeenetwork_Umee_Peggy_V1_MsgValsetConfirm, Umeenetwork_Umee_Peggy_V1_MsgValsetConfirmResponse>

  func sendToEth(
    _ request: Umeenetwork_Umee_Peggy_V1_MsgSendToEth,
    callOptions: CallOptions?
  ) -> UnaryCall<Umeenetwork_Umee_Peggy_V1_MsgSendToEth, Umeenetwork_Umee_Peggy_V1_MsgSendToEthResponse>

  func requestBatch(
    _ request: Umeenetwork_Umee_Peggy_V1_MsgRequestBatch,
    callOptions: CallOptions?
  ) -> UnaryCall<Umeenetwork_Umee_Peggy_V1_MsgRequestBatch, Umeenetwork_Umee_Peggy_V1_MsgRequestBatchResponse>

  func confirmBatch(
    _ request: Umeenetwork_Umee_Peggy_V1_MsgConfirmBatch,
    callOptions: CallOptions?
  ) -> UnaryCall<Umeenetwork_Umee_Peggy_V1_MsgConfirmBatch, Umeenetwork_Umee_Peggy_V1_MsgConfirmBatchResponse>

  func depositClaim(
    _ request: Umeenetwork_Umee_Peggy_V1_MsgDepositClaim,
    callOptions: CallOptions?
  ) -> UnaryCall<Umeenetwork_Umee_Peggy_V1_MsgDepositClaim, Umeenetwork_Umee_Peggy_V1_MsgDepositClaimResponse>

  func withdrawClaim(
    _ request: Umeenetwork_Umee_Peggy_V1_MsgWithdrawClaim,
    callOptions: CallOptions?
  ) -> UnaryCall<Umeenetwork_Umee_Peggy_V1_MsgWithdrawClaim, Umeenetwork_Umee_Peggy_V1_MsgWithdrawClaimResponse>

  func valsetUpdateClaim(
    _ request: Umeenetwork_Umee_Peggy_V1_MsgValsetUpdatedClaim,
    callOptions: CallOptions?
  ) -> UnaryCall<Umeenetwork_Umee_Peggy_V1_MsgValsetUpdatedClaim, Umeenetwork_Umee_Peggy_V1_MsgValsetUpdatedClaimResponse>

  func eRC20DeployedClaim(
    _ request: Umeenetwork_Umee_Peggy_V1_MsgERC20DeployedClaim,
    callOptions: CallOptions?
  ) -> UnaryCall<Umeenetwork_Umee_Peggy_V1_MsgERC20DeployedClaim, Umeenetwork_Umee_Peggy_V1_MsgERC20DeployedClaimResponse>

  func setOrchestratorAddresses(
    _ request: Umeenetwork_Umee_Peggy_V1_MsgSetOrchestratorAddresses,
    callOptions: CallOptions?
  ) -> UnaryCall<Umeenetwork_Umee_Peggy_V1_MsgSetOrchestratorAddresses, Umeenetwork_Umee_Peggy_V1_MsgSetOrchestratorAddressesResponse>

  func cancelSendToEth(
    _ request: Umeenetwork_Umee_Peggy_V1_MsgCancelSendToEth,
    callOptions: CallOptions?
  ) -> UnaryCall<Umeenetwork_Umee_Peggy_V1_MsgCancelSendToEth, Umeenetwork_Umee_Peggy_V1_MsgCancelSendToEthResponse>

  func submitBadSignatureEvidence(
    _ request: Umeenetwork_Umee_Peggy_V1_MsgSubmitBadSignatureEvidence,
    callOptions: CallOptions?
  ) -> UnaryCall<Umeenetwork_Umee_Peggy_V1_MsgSubmitBadSignatureEvidence, Umeenetwork_Umee_Peggy_V1_MsgSubmitBadSignatureEvidenceResponse>
}

extension Umeenetwork_Umee_Peggy_V1_MsgClientProtocol {
  internal var serviceName: String {
    return "umeenetwork.umee.peggy.v1.Msg"
  }

  /// Unary call to ValsetConfirm
  ///
  /// - Parameters:
  ///   - request: Request to send to ValsetConfirm.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func valsetConfirm(
    _ request: Umeenetwork_Umee_Peggy_V1_MsgValsetConfirm,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Umeenetwork_Umee_Peggy_V1_MsgValsetConfirm, Umeenetwork_Umee_Peggy_V1_MsgValsetConfirmResponse> {
    return self.makeUnaryCall(
      path: "/umeenetwork.umee.peggy.v1.Msg/ValsetConfirm",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeValsetConfirmInterceptors() ?? []
    )
  }

  /// Unary call to SendToEth
  ///
  /// - Parameters:
  ///   - request: Request to send to SendToEth.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func sendToEth(
    _ request: Umeenetwork_Umee_Peggy_V1_MsgSendToEth,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Umeenetwork_Umee_Peggy_V1_MsgSendToEth, Umeenetwork_Umee_Peggy_V1_MsgSendToEthResponse> {
    return self.makeUnaryCall(
      path: "/umeenetwork.umee.peggy.v1.Msg/SendToEth",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSendToEthInterceptors() ?? []
    )
  }

  /// Unary call to RequestBatch
  ///
  /// - Parameters:
  ///   - request: Request to send to RequestBatch.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func requestBatch(
    _ request: Umeenetwork_Umee_Peggy_V1_MsgRequestBatch,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Umeenetwork_Umee_Peggy_V1_MsgRequestBatch, Umeenetwork_Umee_Peggy_V1_MsgRequestBatchResponse> {
    return self.makeUnaryCall(
      path: "/umeenetwork.umee.peggy.v1.Msg/RequestBatch",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRequestBatchInterceptors() ?? []
    )
  }

  /// Unary call to ConfirmBatch
  ///
  /// - Parameters:
  ///   - request: Request to send to ConfirmBatch.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func confirmBatch(
    _ request: Umeenetwork_Umee_Peggy_V1_MsgConfirmBatch,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Umeenetwork_Umee_Peggy_V1_MsgConfirmBatch, Umeenetwork_Umee_Peggy_V1_MsgConfirmBatchResponse> {
    return self.makeUnaryCall(
      path: "/umeenetwork.umee.peggy.v1.Msg/ConfirmBatch",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeConfirmBatchInterceptors() ?? []
    )
  }

  /// Unary call to DepositClaim
  ///
  /// - Parameters:
  ///   - request: Request to send to DepositClaim.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func depositClaim(
    _ request: Umeenetwork_Umee_Peggy_V1_MsgDepositClaim,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Umeenetwork_Umee_Peggy_V1_MsgDepositClaim, Umeenetwork_Umee_Peggy_V1_MsgDepositClaimResponse> {
    return self.makeUnaryCall(
      path: "/umeenetwork.umee.peggy.v1.Msg/DepositClaim",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDepositClaimInterceptors() ?? []
    )
  }

  /// Unary call to WithdrawClaim
  ///
  /// - Parameters:
  ///   - request: Request to send to WithdrawClaim.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func withdrawClaim(
    _ request: Umeenetwork_Umee_Peggy_V1_MsgWithdrawClaim,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Umeenetwork_Umee_Peggy_V1_MsgWithdrawClaim, Umeenetwork_Umee_Peggy_V1_MsgWithdrawClaimResponse> {
    return self.makeUnaryCall(
      path: "/umeenetwork.umee.peggy.v1.Msg/WithdrawClaim",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWithdrawClaimInterceptors() ?? []
    )
  }

  /// Unary call to ValsetUpdateClaim
  ///
  /// - Parameters:
  ///   - request: Request to send to ValsetUpdateClaim.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func valsetUpdateClaim(
    _ request: Umeenetwork_Umee_Peggy_V1_MsgValsetUpdatedClaim,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Umeenetwork_Umee_Peggy_V1_MsgValsetUpdatedClaim, Umeenetwork_Umee_Peggy_V1_MsgValsetUpdatedClaimResponse> {
    return self.makeUnaryCall(
      path: "/umeenetwork.umee.peggy.v1.Msg/ValsetUpdateClaim",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeValsetUpdateClaimInterceptors() ?? []
    )
  }

  /// Unary call to ERC20DeployedClaim
  ///
  /// - Parameters:
  ///   - request: Request to send to ERC20DeployedClaim.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func eRC20DeployedClaim(
    _ request: Umeenetwork_Umee_Peggy_V1_MsgERC20DeployedClaim,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Umeenetwork_Umee_Peggy_V1_MsgERC20DeployedClaim, Umeenetwork_Umee_Peggy_V1_MsgERC20DeployedClaimResponse> {
    return self.makeUnaryCall(
      path: "/umeenetwork.umee.peggy.v1.Msg/ERC20DeployedClaim",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeERC20DeployedClaimInterceptors() ?? []
    )
  }

  /// Unary call to SetOrchestratorAddresses
  ///
  /// - Parameters:
  ///   - request: Request to send to SetOrchestratorAddresses.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func setOrchestratorAddresses(
    _ request: Umeenetwork_Umee_Peggy_V1_MsgSetOrchestratorAddresses,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Umeenetwork_Umee_Peggy_V1_MsgSetOrchestratorAddresses, Umeenetwork_Umee_Peggy_V1_MsgSetOrchestratorAddressesResponse> {
    return self.makeUnaryCall(
      path: "/umeenetwork.umee.peggy.v1.Msg/SetOrchestratorAddresses",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSetOrchestratorAddressesInterceptors() ?? []
    )
  }

  /// Unary call to CancelSendToEth
  ///
  /// - Parameters:
  ///   - request: Request to send to CancelSendToEth.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func cancelSendToEth(
    _ request: Umeenetwork_Umee_Peggy_V1_MsgCancelSendToEth,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Umeenetwork_Umee_Peggy_V1_MsgCancelSendToEth, Umeenetwork_Umee_Peggy_V1_MsgCancelSendToEthResponse> {
    return self.makeUnaryCall(
      path: "/umeenetwork.umee.peggy.v1.Msg/CancelSendToEth",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCancelSendToEthInterceptors() ?? []
    )
  }

  /// Unary call to SubmitBadSignatureEvidence
  ///
  /// - Parameters:
  ///   - request: Request to send to SubmitBadSignatureEvidence.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func submitBadSignatureEvidence(
    _ request: Umeenetwork_Umee_Peggy_V1_MsgSubmitBadSignatureEvidence,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Umeenetwork_Umee_Peggy_V1_MsgSubmitBadSignatureEvidence, Umeenetwork_Umee_Peggy_V1_MsgSubmitBadSignatureEvidenceResponse> {
    return self.makeUnaryCall(
      path: "/umeenetwork.umee.peggy.v1.Msg/SubmitBadSignatureEvidence",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSubmitBadSignatureEvidenceInterceptors() ?? []
    )
  }
}

internal protocol Umeenetwork_Umee_Peggy_V1_MsgClientInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when invoking 'valsetConfirm'.
  func makeValsetConfirmInterceptors() -> [ClientInterceptor<Umeenetwork_Umee_Peggy_V1_MsgValsetConfirm, Umeenetwork_Umee_Peggy_V1_MsgValsetConfirmResponse>]

  /// - Returns: Interceptors to use when invoking 'sendToEth'.
  func makeSendToEthInterceptors() -> [ClientInterceptor<Umeenetwork_Umee_Peggy_V1_MsgSendToEth, Umeenetwork_Umee_Peggy_V1_MsgSendToEthResponse>]

  /// - Returns: Interceptors to use when invoking 'requestBatch'.
  func makeRequestBatchInterceptors() -> [ClientInterceptor<Umeenetwork_Umee_Peggy_V1_MsgRequestBatch, Umeenetwork_Umee_Peggy_V1_MsgRequestBatchResponse>]

  /// - Returns: Interceptors to use when invoking 'confirmBatch'.
  func makeConfirmBatchInterceptors() -> [ClientInterceptor<Umeenetwork_Umee_Peggy_V1_MsgConfirmBatch, Umeenetwork_Umee_Peggy_V1_MsgConfirmBatchResponse>]

  /// - Returns: Interceptors to use when invoking 'depositClaim'.
  func makeDepositClaimInterceptors() -> [ClientInterceptor<Umeenetwork_Umee_Peggy_V1_MsgDepositClaim, Umeenetwork_Umee_Peggy_V1_MsgDepositClaimResponse>]

  /// - Returns: Interceptors to use when invoking 'withdrawClaim'.
  func makeWithdrawClaimInterceptors() -> [ClientInterceptor<Umeenetwork_Umee_Peggy_V1_MsgWithdrawClaim, Umeenetwork_Umee_Peggy_V1_MsgWithdrawClaimResponse>]

  /// - Returns: Interceptors to use when invoking 'valsetUpdateClaim'.
  func makeValsetUpdateClaimInterceptors() -> [ClientInterceptor<Umeenetwork_Umee_Peggy_V1_MsgValsetUpdatedClaim, Umeenetwork_Umee_Peggy_V1_MsgValsetUpdatedClaimResponse>]

  /// - Returns: Interceptors to use when invoking 'eRC20DeployedClaim'.
  func makeERC20DeployedClaimInterceptors() -> [ClientInterceptor<Umeenetwork_Umee_Peggy_V1_MsgERC20DeployedClaim, Umeenetwork_Umee_Peggy_V1_MsgERC20DeployedClaimResponse>]

  /// - Returns: Interceptors to use when invoking 'setOrchestratorAddresses'.
  func makeSetOrchestratorAddressesInterceptors() -> [ClientInterceptor<Umeenetwork_Umee_Peggy_V1_MsgSetOrchestratorAddresses, Umeenetwork_Umee_Peggy_V1_MsgSetOrchestratorAddressesResponse>]

  /// - Returns: Interceptors to use when invoking 'cancelSendToEth'.
  func makeCancelSendToEthInterceptors() -> [ClientInterceptor<Umeenetwork_Umee_Peggy_V1_MsgCancelSendToEth, Umeenetwork_Umee_Peggy_V1_MsgCancelSendToEthResponse>]

  /// - Returns: Interceptors to use when invoking 'submitBadSignatureEvidence'.
  func makeSubmitBadSignatureEvidenceInterceptors() -> [ClientInterceptor<Umeenetwork_Umee_Peggy_V1_MsgSubmitBadSignatureEvidence, Umeenetwork_Umee_Peggy_V1_MsgSubmitBadSignatureEvidenceResponse>]
}

internal final class Umeenetwork_Umee_Peggy_V1_MsgClient: Umeenetwork_Umee_Peggy_V1_MsgClientProtocol {
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Umeenetwork_Umee_Peggy_V1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the umeenetwork.umee.peggy.v1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Umeenetwork_Umee_Peggy_V1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// To build a server, implement a class that conforms to this protocol.
internal protocol Umeenetwork_Umee_Peggy_V1_MsgProvider: CallHandlerProvider {
  var interceptors: Umeenetwork_Umee_Peggy_V1_MsgServerInterceptorFactoryProtocol? { get }

  func valsetConfirm(request: Umeenetwork_Umee_Peggy_V1_MsgValsetConfirm, context: StatusOnlyCallContext) -> EventLoopFuture<Umeenetwork_Umee_Peggy_V1_MsgValsetConfirmResponse>

  func sendToEth(request: Umeenetwork_Umee_Peggy_V1_MsgSendToEth, context: StatusOnlyCallContext) -> EventLoopFuture<Umeenetwork_Umee_Peggy_V1_MsgSendToEthResponse>

  func requestBatch(request: Umeenetwork_Umee_Peggy_V1_MsgRequestBatch, context: StatusOnlyCallContext) -> EventLoopFuture<Umeenetwork_Umee_Peggy_V1_MsgRequestBatchResponse>

  func confirmBatch(request: Umeenetwork_Umee_Peggy_V1_MsgConfirmBatch, context: StatusOnlyCallContext) -> EventLoopFuture<Umeenetwork_Umee_Peggy_V1_MsgConfirmBatchResponse>

  func depositClaim(request: Umeenetwork_Umee_Peggy_V1_MsgDepositClaim, context: StatusOnlyCallContext) -> EventLoopFuture<Umeenetwork_Umee_Peggy_V1_MsgDepositClaimResponse>

  func withdrawClaim(request: Umeenetwork_Umee_Peggy_V1_MsgWithdrawClaim, context: StatusOnlyCallContext) -> EventLoopFuture<Umeenetwork_Umee_Peggy_V1_MsgWithdrawClaimResponse>

  func valsetUpdateClaim(request: Umeenetwork_Umee_Peggy_V1_MsgValsetUpdatedClaim, context: StatusOnlyCallContext) -> EventLoopFuture<Umeenetwork_Umee_Peggy_V1_MsgValsetUpdatedClaimResponse>

  func eRC20DeployedClaim(request: Umeenetwork_Umee_Peggy_V1_MsgERC20DeployedClaim, context: StatusOnlyCallContext) -> EventLoopFuture<Umeenetwork_Umee_Peggy_V1_MsgERC20DeployedClaimResponse>

  func setOrchestratorAddresses(request: Umeenetwork_Umee_Peggy_V1_MsgSetOrchestratorAddresses, context: StatusOnlyCallContext) -> EventLoopFuture<Umeenetwork_Umee_Peggy_V1_MsgSetOrchestratorAddressesResponse>

  func cancelSendToEth(request: Umeenetwork_Umee_Peggy_V1_MsgCancelSendToEth, context: StatusOnlyCallContext) -> EventLoopFuture<Umeenetwork_Umee_Peggy_V1_MsgCancelSendToEthResponse>

  func submitBadSignatureEvidence(request: Umeenetwork_Umee_Peggy_V1_MsgSubmitBadSignatureEvidence, context: StatusOnlyCallContext) -> EventLoopFuture<Umeenetwork_Umee_Peggy_V1_MsgSubmitBadSignatureEvidenceResponse>
}

extension Umeenetwork_Umee_Peggy_V1_MsgProvider {
  internal var serviceName: Substring { return "umeenetwork.umee.peggy.v1.Msg" }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "ValsetConfirm":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Umeenetwork_Umee_Peggy_V1_MsgValsetConfirm>(),
        responseSerializer: ProtobufSerializer<Umeenetwork_Umee_Peggy_V1_MsgValsetConfirmResponse>(),
        interceptors: self.interceptors?.makeValsetConfirmInterceptors() ?? [],
        userFunction: self.valsetConfirm(request:context:)
      )

    case "SendToEth":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Umeenetwork_Umee_Peggy_V1_MsgSendToEth>(),
        responseSerializer: ProtobufSerializer<Umeenetwork_Umee_Peggy_V1_MsgSendToEthResponse>(),
        interceptors: self.interceptors?.makeSendToEthInterceptors() ?? [],
        userFunction: self.sendToEth(request:context:)
      )

    case "RequestBatch":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Umeenetwork_Umee_Peggy_V1_MsgRequestBatch>(),
        responseSerializer: ProtobufSerializer<Umeenetwork_Umee_Peggy_V1_MsgRequestBatchResponse>(),
        interceptors: self.interceptors?.makeRequestBatchInterceptors() ?? [],
        userFunction: self.requestBatch(request:context:)
      )

    case "ConfirmBatch":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Umeenetwork_Umee_Peggy_V1_MsgConfirmBatch>(),
        responseSerializer: ProtobufSerializer<Umeenetwork_Umee_Peggy_V1_MsgConfirmBatchResponse>(),
        interceptors: self.interceptors?.makeConfirmBatchInterceptors() ?? [],
        userFunction: self.confirmBatch(request:context:)
      )

    case "DepositClaim":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Umeenetwork_Umee_Peggy_V1_MsgDepositClaim>(),
        responseSerializer: ProtobufSerializer<Umeenetwork_Umee_Peggy_V1_MsgDepositClaimResponse>(),
        interceptors: self.interceptors?.makeDepositClaimInterceptors() ?? [],
        userFunction: self.depositClaim(request:context:)
      )

    case "WithdrawClaim":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Umeenetwork_Umee_Peggy_V1_MsgWithdrawClaim>(),
        responseSerializer: ProtobufSerializer<Umeenetwork_Umee_Peggy_V1_MsgWithdrawClaimResponse>(),
        interceptors: self.interceptors?.makeWithdrawClaimInterceptors() ?? [],
        userFunction: self.withdrawClaim(request:context:)
      )

    case "ValsetUpdateClaim":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Umeenetwork_Umee_Peggy_V1_MsgValsetUpdatedClaim>(),
        responseSerializer: ProtobufSerializer<Umeenetwork_Umee_Peggy_V1_MsgValsetUpdatedClaimResponse>(),
        interceptors: self.interceptors?.makeValsetUpdateClaimInterceptors() ?? [],
        userFunction: self.valsetUpdateClaim(request:context:)
      )

    case "ERC20DeployedClaim":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Umeenetwork_Umee_Peggy_V1_MsgERC20DeployedClaim>(),
        responseSerializer: ProtobufSerializer<Umeenetwork_Umee_Peggy_V1_MsgERC20DeployedClaimResponse>(),
        interceptors: self.interceptors?.makeERC20DeployedClaimInterceptors() ?? [],
        userFunction: self.eRC20DeployedClaim(request:context:)
      )

    case "SetOrchestratorAddresses":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Umeenetwork_Umee_Peggy_V1_MsgSetOrchestratorAddresses>(),
        responseSerializer: ProtobufSerializer<Umeenetwork_Umee_Peggy_V1_MsgSetOrchestratorAddressesResponse>(),
        interceptors: self.interceptors?.makeSetOrchestratorAddressesInterceptors() ?? [],
        userFunction: self.setOrchestratorAddresses(request:context:)
      )

    case "CancelSendToEth":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Umeenetwork_Umee_Peggy_V1_MsgCancelSendToEth>(),
        responseSerializer: ProtobufSerializer<Umeenetwork_Umee_Peggy_V1_MsgCancelSendToEthResponse>(),
        interceptors: self.interceptors?.makeCancelSendToEthInterceptors() ?? [],
        userFunction: self.cancelSendToEth(request:context:)
      )

    case "SubmitBadSignatureEvidence":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Umeenetwork_Umee_Peggy_V1_MsgSubmitBadSignatureEvidence>(),
        responseSerializer: ProtobufSerializer<Umeenetwork_Umee_Peggy_V1_MsgSubmitBadSignatureEvidenceResponse>(),
        interceptors: self.interceptors?.makeSubmitBadSignatureEvidenceInterceptors() ?? [],
        userFunction: self.submitBadSignatureEvidence(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Umeenetwork_Umee_Peggy_V1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'valsetConfirm'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeValsetConfirmInterceptors() -> [ServerInterceptor<Umeenetwork_Umee_Peggy_V1_MsgValsetConfirm, Umeenetwork_Umee_Peggy_V1_MsgValsetConfirmResponse>]

  /// - Returns: Interceptors to use when handling 'sendToEth'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSendToEthInterceptors() -> [ServerInterceptor<Umeenetwork_Umee_Peggy_V1_MsgSendToEth, Umeenetwork_Umee_Peggy_V1_MsgSendToEthResponse>]

  /// - Returns: Interceptors to use when handling 'requestBatch'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRequestBatchInterceptors() -> [ServerInterceptor<Umeenetwork_Umee_Peggy_V1_MsgRequestBatch, Umeenetwork_Umee_Peggy_V1_MsgRequestBatchResponse>]

  /// - Returns: Interceptors to use when handling 'confirmBatch'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeConfirmBatchInterceptors() -> [ServerInterceptor<Umeenetwork_Umee_Peggy_V1_MsgConfirmBatch, Umeenetwork_Umee_Peggy_V1_MsgConfirmBatchResponse>]

  /// - Returns: Interceptors to use when handling 'depositClaim'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDepositClaimInterceptors() -> [ServerInterceptor<Umeenetwork_Umee_Peggy_V1_MsgDepositClaim, Umeenetwork_Umee_Peggy_V1_MsgDepositClaimResponse>]

  /// - Returns: Interceptors to use when handling 'withdrawClaim'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeWithdrawClaimInterceptors() -> [ServerInterceptor<Umeenetwork_Umee_Peggy_V1_MsgWithdrawClaim, Umeenetwork_Umee_Peggy_V1_MsgWithdrawClaimResponse>]

  /// - Returns: Interceptors to use when handling 'valsetUpdateClaim'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeValsetUpdateClaimInterceptors() -> [ServerInterceptor<Umeenetwork_Umee_Peggy_V1_MsgValsetUpdatedClaim, Umeenetwork_Umee_Peggy_V1_MsgValsetUpdatedClaimResponse>]

  /// - Returns: Interceptors to use when handling 'eRC20DeployedClaim'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeERC20DeployedClaimInterceptors() -> [ServerInterceptor<Umeenetwork_Umee_Peggy_V1_MsgERC20DeployedClaim, Umeenetwork_Umee_Peggy_V1_MsgERC20DeployedClaimResponse>]

  /// - Returns: Interceptors to use when handling 'setOrchestratorAddresses'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSetOrchestratorAddressesInterceptors() -> [ServerInterceptor<Umeenetwork_Umee_Peggy_V1_MsgSetOrchestratorAddresses, Umeenetwork_Umee_Peggy_V1_MsgSetOrchestratorAddressesResponse>]

  /// - Returns: Interceptors to use when handling 'cancelSendToEth'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCancelSendToEthInterceptors() -> [ServerInterceptor<Umeenetwork_Umee_Peggy_V1_MsgCancelSendToEth, Umeenetwork_Umee_Peggy_V1_MsgCancelSendToEthResponse>]

  /// - Returns: Interceptors to use when handling 'submitBadSignatureEvidence'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSubmitBadSignatureEvidenceInterceptors() -> [ServerInterceptor<Umeenetwork_Umee_Peggy_V1_MsgSubmitBadSignatureEvidence, Umeenetwork_Umee_Peggy_V1_MsgSubmitBadSignatureEvidenceResponse>]
}
