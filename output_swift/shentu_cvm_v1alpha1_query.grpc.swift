//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: shentu/cvm/v1alpha1/query.proto
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


/// Usage: instantiate `Shentu_Cvm_V1alpha1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Shentu_Cvm_V1alpha1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Shentu_Cvm_V1alpha1_QueryClientInterceptorFactoryProtocol? { get }

  func code(
    _ request: Shentu_Cvm_V1alpha1_QueryCodeRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Shentu_Cvm_V1alpha1_QueryCodeRequest, Shentu_Cvm_V1alpha1_QueryCodeResponse>

  func abi(
    _ request: Shentu_Cvm_V1alpha1_QueryAbiRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Shentu_Cvm_V1alpha1_QueryAbiRequest, Shentu_Cvm_V1alpha1_QueryAbiResponse>

  func storage(
    _ request: Shentu_Cvm_V1alpha1_QueryStorageRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Shentu_Cvm_V1alpha1_QueryStorageRequest, Shentu_Cvm_V1alpha1_QueryStorageResponse>

  func addressMeta(
    _ request: Shentu_Cvm_V1alpha1_QueryAddressMetaRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Shentu_Cvm_V1alpha1_QueryAddressMetaRequest, Shentu_Cvm_V1alpha1_QueryAddressMetaResponse>

  func meta(
    _ request: Shentu_Cvm_V1alpha1_QueryMetaRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Shentu_Cvm_V1alpha1_QueryMetaRequest, Shentu_Cvm_V1alpha1_QueryMetaResponse>

  func account(
    _ request: Shentu_Cvm_V1alpha1_QueryAccountRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Shentu_Cvm_V1alpha1_QueryAccountRequest, Acm_Account>

  func view(
    _ request: Shentu_Cvm_V1alpha1_QueryViewRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Shentu_Cvm_V1alpha1_QueryViewRequest, Shentu_Cvm_V1alpha1_QueryViewResponse>
}

extension Shentu_Cvm_V1alpha1_QueryClientProtocol {
  internal var serviceName: String {
    return "shentu.cvm.v1alpha1.Query"
  }

  /// Unary call to Code
  ///
  /// - Parameters:
  ///   - request: Request to send to Code.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func code(
    _ request: Shentu_Cvm_V1alpha1_QueryCodeRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Shentu_Cvm_V1alpha1_QueryCodeRequest, Shentu_Cvm_V1alpha1_QueryCodeResponse> {
    return self.makeUnaryCall(
      path: "/shentu.cvm.v1alpha1.Query/Code",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCodeInterceptors() ?? []
    )
  }

  /// Unary call to Abi
  ///
  /// - Parameters:
  ///   - request: Request to send to Abi.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func abi(
    _ request: Shentu_Cvm_V1alpha1_QueryAbiRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Shentu_Cvm_V1alpha1_QueryAbiRequest, Shentu_Cvm_V1alpha1_QueryAbiResponse> {
    return self.makeUnaryCall(
      path: "/shentu.cvm.v1alpha1.Query/Abi",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAbiInterceptors() ?? []
    )
  }

  /// Unary call to Storage
  ///
  /// - Parameters:
  ///   - request: Request to send to Storage.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func storage(
    _ request: Shentu_Cvm_V1alpha1_QueryStorageRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Shentu_Cvm_V1alpha1_QueryStorageRequest, Shentu_Cvm_V1alpha1_QueryStorageResponse> {
    return self.makeUnaryCall(
      path: "/shentu.cvm.v1alpha1.Query/Storage",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeStorageInterceptors() ?? []
    )
  }

  /// Unary call to AddressMeta
  ///
  /// - Parameters:
  ///   - request: Request to send to AddressMeta.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func addressMeta(
    _ request: Shentu_Cvm_V1alpha1_QueryAddressMetaRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Shentu_Cvm_V1alpha1_QueryAddressMetaRequest, Shentu_Cvm_V1alpha1_QueryAddressMetaResponse> {
    return self.makeUnaryCall(
      path: "/shentu.cvm.v1alpha1.Query/AddressMeta",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAddressMetaInterceptors() ?? []
    )
  }

  /// Unary call to Meta
  ///
  /// - Parameters:
  ///   - request: Request to send to Meta.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func meta(
    _ request: Shentu_Cvm_V1alpha1_QueryMetaRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Shentu_Cvm_V1alpha1_QueryMetaRequest, Shentu_Cvm_V1alpha1_QueryMetaResponse> {
    return self.makeUnaryCall(
      path: "/shentu.cvm.v1alpha1.Query/Meta",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeMetaInterceptors() ?? []
    )
  }

  /// Unary call to Account
  ///
  /// - Parameters:
  ///   - request: Request to send to Account.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func account(
    _ request: Shentu_Cvm_V1alpha1_QueryAccountRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Shentu_Cvm_V1alpha1_QueryAccountRequest, Acm_Account> {
    return self.makeUnaryCall(
      path: "/shentu.cvm.v1alpha1.Query/Account",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAccountInterceptors() ?? []
    )
  }

  /// Unary call to View
  ///
  /// - Parameters:
  ///   - request: Request to send to View.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func view(
    _ request: Shentu_Cvm_V1alpha1_QueryViewRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Shentu_Cvm_V1alpha1_QueryViewRequest, Shentu_Cvm_V1alpha1_QueryViewResponse> {
    return self.makeUnaryCall(
      path: "/shentu.cvm.v1alpha1.Query/View",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeViewInterceptors() ?? []
    )
  }
}

internal protocol Shentu_Cvm_V1alpha1_QueryClientInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when invoking 'code'.
  func makeCodeInterceptors() -> [ClientInterceptor<Shentu_Cvm_V1alpha1_QueryCodeRequest, Shentu_Cvm_V1alpha1_QueryCodeResponse>]

  /// - Returns: Interceptors to use when invoking 'abi'.
  func makeAbiInterceptors() -> [ClientInterceptor<Shentu_Cvm_V1alpha1_QueryAbiRequest, Shentu_Cvm_V1alpha1_QueryAbiResponse>]

  /// - Returns: Interceptors to use when invoking 'storage'.
  func makeStorageInterceptors() -> [ClientInterceptor<Shentu_Cvm_V1alpha1_QueryStorageRequest, Shentu_Cvm_V1alpha1_QueryStorageResponse>]

  /// - Returns: Interceptors to use when invoking 'addressMeta'.
  func makeAddressMetaInterceptors() -> [ClientInterceptor<Shentu_Cvm_V1alpha1_QueryAddressMetaRequest, Shentu_Cvm_V1alpha1_QueryAddressMetaResponse>]

  /// - Returns: Interceptors to use when invoking 'meta'.
  func makeMetaInterceptors() -> [ClientInterceptor<Shentu_Cvm_V1alpha1_QueryMetaRequest, Shentu_Cvm_V1alpha1_QueryMetaResponse>]

  /// - Returns: Interceptors to use when invoking 'account'.
  func makeAccountInterceptors() -> [ClientInterceptor<Shentu_Cvm_V1alpha1_QueryAccountRequest, Acm_Account>]

  /// - Returns: Interceptors to use when invoking 'view'.
  func makeViewInterceptors() -> [ClientInterceptor<Shentu_Cvm_V1alpha1_QueryViewRequest, Shentu_Cvm_V1alpha1_QueryViewResponse>]
}

internal final class Shentu_Cvm_V1alpha1_QueryClient: Shentu_Cvm_V1alpha1_QueryClientProtocol {
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Shentu_Cvm_V1alpha1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the shentu.cvm.v1alpha1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Shentu_Cvm_V1alpha1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// To build a server, implement a class that conforms to this protocol.
internal protocol Shentu_Cvm_V1alpha1_QueryProvider: CallHandlerProvider {
  var interceptors: Shentu_Cvm_V1alpha1_QueryServerInterceptorFactoryProtocol? { get }

  func code(request: Shentu_Cvm_V1alpha1_QueryCodeRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Shentu_Cvm_V1alpha1_QueryCodeResponse>

  func abi(request: Shentu_Cvm_V1alpha1_QueryAbiRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Shentu_Cvm_V1alpha1_QueryAbiResponse>

  func storage(request: Shentu_Cvm_V1alpha1_QueryStorageRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Shentu_Cvm_V1alpha1_QueryStorageResponse>

  func addressMeta(request: Shentu_Cvm_V1alpha1_QueryAddressMetaRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Shentu_Cvm_V1alpha1_QueryAddressMetaResponse>

  func meta(request: Shentu_Cvm_V1alpha1_QueryMetaRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Shentu_Cvm_V1alpha1_QueryMetaResponse>

  func account(request: Shentu_Cvm_V1alpha1_QueryAccountRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Acm_Account>

  func view(request: Shentu_Cvm_V1alpha1_QueryViewRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Shentu_Cvm_V1alpha1_QueryViewResponse>
}

extension Shentu_Cvm_V1alpha1_QueryProvider {
  internal var serviceName: Substring { return "shentu.cvm.v1alpha1.Query" }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Code":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Cvm_V1alpha1_QueryCodeRequest>(),
        responseSerializer: ProtobufSerializer<Shentu_Cvm_V1alpha1_QueryCodeResponse>(),
        interceptors: self.interceptors?.makeCodeInterceptors() ?? [],
        userFunction: self.code(request:context:)
      )

    case "Abi":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Cvm_V1alpha1_QueryAbiRequest>(),
        responseSerializer: ProtobufSerializer<Shentu_Cvm_V1alpha1_QueryAbiResponse>(),
        interceptors: self.interceptors?.makeAbiInterceptors() ?? [],
        userFunction: self.abi(request:context:)
      )

    case "Storage":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Cvm_V1alpha1_QueryStorageRequest>(),
        responseSerializer: ProtobufSerializer<Shentu_Cvm_V1alpha1_QueryStorageResponse>(),
        interceptors: self.interceptors?.makeStorageInterceptors() ?? [],
        userFunction: self.storage(request:context:)
      )

    case "AddressMeta":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Cvm_V1alpha1_QueryAddressMetaRequest>(),
        responseSerializer: ProtobufSerializer<Shentu_Cvm_V1alpha1_QueryAddressMetaResponse>(),
        interceptors: self.interceptors?.makeAddressMetaInterceptors() ?? [],
        userFunction: self.addressMeta(request:context:)
      )

    case "Meta":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Cvm_V1alpha1_QueryMetaRequest>(),
        responseSerializer: ProtobufSerializer<Shentu_Cvm_V1alpha1_QueryMetaResponse>(),
        interceptors: self.interceptors?.makeMetaInterceptors() ?? [],
        userFunction: self.meta(request:context:)
      )

    case "Account":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Cvm_V1alpha1_QueryAccountRequest>(),
        responseSerializer: ProtobufSerializer<Acm_Account>(),
        interceptors: self.interceptors?.makeAccountInterceptors() ?? [],
        userFunction: self.account(request:context:)
      )

    case "View":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Cvm_V1alpha1_QueryViewRequest>(),
        responseSerializer: ProtobufSerializer<Shentu_Cvm_V1alpha1_QueryViewResponse>(),
        interceptors: self.interceptors?.makeViewInterceptors() ?? [],
        userFunction: self.view(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Shentu_Cvm_V1alpha1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'code'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCodeInterceptors() -> [ServerInterceptor<Shentu_Cvm_V1alpha1_QueryCodeRequest, Shentu_Cvm_V1alpha1_QueryCodeResponse>]

  /// - Returns: Interceptors to use when handling 'abi'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAbiInterceptors() -> [ServerInterceptor<Shentu_Cvm_V1alpha1_QueryAbiRequest, Shentu_Cvm_V1alpha1_QueryAbiResponse>]

  /// - Returns: Interceptors to use when handling 'storage'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeStorageInterceptors() -> [ServerInterceptor<Shentu_Cvm_V1alpha1_QueryStorageRequest, Shentu_Cvm_V1alpha1_QueryStorageResponse>]

  /// - Returns: Interceptors to use when handling 'addressMeta'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAddressMetaInterceptors() -> [ServerInterceptor<Shentu_Cvm_V1alpha1_QueryAddressMetaRequest, Shentu_Cvm_V1alpha1_QueryAddressMetaResponse>]

  /// - Returns: Interceptors to use when handling 'meta'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeMetaInterceptors() -> [ServerInterceptor<Shentu_Cvm_V1alpha1_QueryMetaRequest, Shentu_Cvm_V1alpha1_QueryMetaResponse>]

  /// - Returns: Interceptors to use when handling 'account'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAccountInterceptors() -> [ServerInterceptor<Shentu_Cvm_V1alpha1_QueryAccountRequest, Acm_Account>]

  /// - Returns: Interceptors to use when handling 'view'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeViewInterceptors() -> [ServerInterceptor<Shentu_Cvm_V1alpha1_QueryViewRequest, Shentu_Cvm_V1alpha1_QueryViewResponse>]
}
