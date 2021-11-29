//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: iscn/tx.proto
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


/// Msg defines the bank Msg service.
///
/// Usage: instantiate `Likechain_Iscn_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Likechain_Iscn_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Likechain_Iscn_MsgClientInterceptorFactoryProtocol? { get }

  func createIscnRecord(
    _ request: Likechain_Iscn_MsgCreateIscnRecord,
    callOptions: CallOptions?
  ) -> UnaryCall<Likechain_Iscn_MsgCreateIscnRecord, Likechain_Iscn_MsgCreateIscnRecordResponse>

  func updateIscnRecord(
    _ request: Likechain_Iscn_MsgUpdateIscnRecord,
    callOptions: CallOptions?
  ) -> UnaryCall<Likechain_Iscn_MsgUpdateIscnRecord, Likechain_Iscn_MsgUpdateIscnRecordResponse>

  func changeIscnRecordOwnership(
    _ request: Likechain_Iscn_MsgChangeIscnRecordOwnership,
    callOptions: CallOptions?
  ) -> UnaryCall<Likechain_Iscn_MsgChangeIscnRecordOwnership, Likechain_Iscn_MsgChangeIscnRecordOwnershipResponse>
}

extension Likechain_Iscn_MsgClientProtocol {
  internal var serviceName: String {
    return "likechain.iscn.Msg"
  }

  /// CreateIscnRecord defines a method to create ISCN metadata
  ///
  /// - Parameters:
  ///   - request: Request to send to CreateIscnRecord.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func createIscnRecord(
    _ request: Likechain_Iscn_MsgCreateIscnRecord,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Likechain_Iscn_MsgCreateIscnRecord, Likechain_Iscn_MsgCreateIscnRecordResponse> {
    return self.makeUnaryCall(
      path: "/likechain.iscn.Msg/CreateIscnRecord",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateIscnRecordInterceptors() ?? []
    )
  }

  /// UpdateIscnRecord defines a method to update existing ISCN metadata
  ///
  /// - Parameters:
  ///   - request: Request to send to UpdateIscnRecord.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func updateIscnRecord(
    _ request: Likechain_Iscn_MsgUpdateIscnRecord,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Likechain_Iscn_MsgUpdateIscnRecord, Likechain_Iscn_MsgUpdateIscnRecordResponse> {
    return self.makeUnaryCall(
      path: "/likechain.iscn.Msg/UpdateIscnRecord",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdateIscnRecordInterceptors() ?? []
    )
  }

  /// ChangeIscnRecordOwnership defines a method to update the ownership of existing ISCN metadata
  ///
  /// - Parameters:
  ///   - request: Request to send to ChangeIscnRecordOwnership.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func changeIscnRecordOwnership(
    _ request: Likechain_Iscn_MsgChangeIscnRecordOwnership,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Likechain_Iscn_MsgChangeIscnRecordOwnership, Likechain_Iscn_MsgChangeIscnRecordOwnershipResponse> {
    return self.makeUnaryCall(
      path: "/likechain.iscn.Msg/ChangeIscnRecordOwnership",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeChangeIscnRecordOwnershipInterceptors() ?? []
    )
  }
}

internal protocol Likechain_Iscn_MsgClientInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when invoking 'createIscnRecord'.
  func makeCreateIscnRecordInterceptors() -> [ClientInterceptor<Likechain_Iscn_MsgCreateIscnRecord, Likechain_Iscn_MsgCreateIscnRecordResponse>]

  /// - Returns: Interceptors to use when invoking 'updateIscnRecord'.
  func makeUpdateIscnRecordInterceptors() -> [ClientInterceptor<Likechain_Iscn_MsgUpdateIscnRecord, Likechain_Iscn_MsgUpdateIscnRecordResponse>]

  /// - Returns: Interceptors to use when invoking 'changeIscnRecordOwnership'.
  func makeChangeIscnRecordOwnershipInterceptors() -> [ClientInterceptor<Likechain_Iscn_MsgChangeIscnRecordOwnership, Likechain_Iscn_MsgChangeIscnRecordOwnershipResponse>]
}

internal final class Likechain_Iscn_MsgClient: Likechain_Iscn_MsgClientProtocol {
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Likechain_Iscn_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the likechain.iscn.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Likechain_Iscn_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the bank Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Likechain_Iscn_MsgProvider: CallHandlerProvider {
  var interceptors: Likechain_Iscn_MsgServerInterceptorFactoryProtocol? { get }

  /// CreateIscnRecord defines a method to create ISCN metadata
  func createIscnRecord(request: Likechain_Iscn_MsgCreateIscnRecord, context: StatusOnlyCallContext) -> EventLoopFuture<Likechain_Iscn_MsgCreateIscnRecordResponse>

  /// UpdateIscnRecord defines a method to update existing ISCN metadata
  func updateIscnRecord(request: Likechain_Iscn_MsgUpdateIscnRecord, context: StatusOnlyCallContext) -> EventLoopFuture<Likechain_Iscn_MsgUpdateIscnRecordResponse>

  /// ChangeIscnRecordOwnership defines a method to update the ownership of existing ISCN metadata
  func changeIscnRecordOwnership(request: Likechain_Iscn_MsgChangeIscnRecordOwnership, context: StatusOnlyCallContext) -> EventLoopFuture<Likechain_Iscn_MsgChangeIscnRecordOwnershipResponse>
}

extension Likechain_Iscn_MsgProvider {
  internal var serviceName: Substring { return "likechain.iscn.Msg" }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "CreateIscnRecord":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Likechain_Iscn_MsgCreateIscnRecord>(),
        responseSerializer: ProtobufSerializer<Likechain_Iscn_MsgCreateIscnRecordResponse>(),
        interceptors: self.interceptors?.makeCreateIscnRecordInterceptors() ?? [],
        userFunction: self.createIscnRecord(request:context:)
      )

    case "UpdateIscnRecord":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Likechain_Iscn_MsgUpdateIscnRecord>(),
        responseSerializer: ProtobufSerializer<Likechain_Iscn_MsgUpdateIscnRecordResponse>(),
        interceptors: self.interceptors?.makeUpdateIscnRecordInterceptors() ?? [],
        userFunction: self.updateIscnRecord(request:context:)
      )

    case "ChangeIscnRecordOwnership":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Likechain_Iscn_MsgChangeIscnRecordOwnership>(),
        responseSerializer: ProtobufSerializer<Likechain_Iscn_MsgChangeIscnRecordOwnershipResponse>(),
        interceptors: self.interceptors?.makeChangeIscnRecordOwnershipInterceptors() ?? [],
        userFunction: self.changeIscnRecordOwnership(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Likechain_Iscn_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'createIscnRecord'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCreateIscnRecordInterceptors() -> [ServerInterceptor<Likechain_Iscn_MsgCreateIscnRecord, Likechain_Iscn_MsgCreateIscnRecordResponse>]

  /// - Returns: Interceptors to use when handling 'updateIscnRecord'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeUpdateIscnRecordInterceptors() -> [ServerInterceptor<Likechain_Iscn_MsgUpdateIscnRecord, Likechain_Iscn_MsgUpdateIscnRecordResponse>]

  /// - Returns: Interceptors to use when handling 'changeIscnRecordOwnership'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeChangeIscnRecordOwnershipInterceptors() -> [ServerInterceptor<Likechain_Iscn_MsgChangeIscnRecordOwnership, Likechain_Iscn_MsgChangeIscnRecordOwnershipResponse>]
}
