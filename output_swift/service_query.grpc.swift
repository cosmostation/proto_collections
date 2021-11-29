//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: service/query.proto
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


/// Query creates service with iservice as rpc
///
/// Usage: instantiate `Irismod_Service_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Irismod_Service_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Irismod_Service_QueryClientInterceptorFactoryProtocol? { get }

  func definition(
    _ request: Irismod_Service_QueryDefinitionRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Irismod_Service_QueryDefinitionRequest, Irismod_Service_QueryDefinitionResponse>

  func binding(
    _ request: Irismod_Service_QueryBindingRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Irismod_Service_QueryBindingRequest, Irismod_Service_QueryBindingResponse>

  func bindings(
    _ request: Irismod_Service_QueryBindingsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Irismod_Service_QueryBindingsRequest, Irismod_Service_QueryBindingsResponse>

  func withdrawAddress(
    _ request: Irismod_Service_QueryWithdrawAddressRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Irismod_Service_QueryWithdrawAddressRequest, Irismod_Service_QueryWithdrawAddressResponse>

  func requestContext(
    _ request: Irismod_Service_QueryRequestContextRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Irismod_Service_QueryRequestContextRequest, Irismod_Service_QueryRequestContextResponse>

  func request(
    _ request: Irismod_Service_QueryRequestRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Irismod_Service_QueryRequestRequest, Irismod_Service_QueryRequestResponse>

  func requests(
    _ request: Irismod_Service_QueryRequestsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Irismod_Service_QueryRequestsRequest, Irismod_Service_QueryRequestsResponse>

  func requestsByReqCtx(
    _ request: Irismod_Service_QueryRequestsByReqCtxRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Irismod_Service_QueryRequestsByReqCtxRequest, Irismod_Service_QueryRequestsByReqCtxResponse>

  func response(
    _ request: Irismod_Service_QueryResponseRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Irismod_Service_QueryResponseRequest, Irismod_Service_QueryResponseResponse>

  func responses(
    _ request: Irismod_Service_QueryResponsesRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Irismod_Service_QueryResponsesRequest, Irismod_Service_QueryResponsesResponse>

  func earnedFees(
    _ request: Irismod_Service_QueryEarnedFeesRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Irismod_Service_QueryEarnedFeesRequest, Irismod_Service_QueryEarnedFeesResponse>

  func schema(
    _ request: Irismod_Service_QuerySchemaRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Irismod_Service_QuerySchemaRequest, Irismod_Service_QuerySchemaResponse>

  func params(
    _ request: Irismod_Service_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Irismod_Service_QueryParamsRequest, Irismod_Service_QueryParamsResponse>
}

extension Irismod_Service_QueryClientProtocol {
  internal var serviceName: String {
    return "irismod.service.Query"
  }

  /// Definition returns service definition
  ///
  /// - Parameters:
  ///   - request: Request to send to Definition.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func definition(
    _ request: Irismod_Service_QueryDefinitionRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Irismod_Service_QueryDefinitionRequest, Irismod_Service_QueryDefinitionResponse> {
    return self.makeUnaryCall(
      path: "/irismod.service.Query/Definition",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDefinitionInterceptors() ?? []
    )
  }

  /// Binding returns service Binding with service name and provider
  ///
  /// - Parameters:
  ///   - request: Request to send to Binding.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func binding(
    _ request: Irismod_Service_QueryBindingRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Irismod_Service_QueryBindingRequest, Irismod_Service_QueryBindingResponse> {
    return self.makeUnaryCall(
      path: "/irismod.service.Query/Binding",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBindingInterceptors() ?? []
    )
  }

  /// Bindings returns all service Bindings with service name and owner
  ///
  /// - Parameters:
  ///   - request: Request to send to Bindings.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func bindings(
    _ request: Irismod_Service_QueryBindingsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Irismod_Service_QueryBindingsRequest, Irismod_Service_QueryBindingsResponse> {
    return self.makeUnaryCall(
      path: "/irismod.service.Query/Bindings",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeBindingsInterceptors() ?? []
    )
  }

  /// WithdrawAddress returns the withdraw address of the binding owner
  ///
  /// - Parameters:
  ///   - request: Request to send to WithdrawAddress.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func withdrawAddress(
    _ request: Irismod_Service_QueryWithdrawAddressRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Irismod_Service_QueryWithdrawAddressRequest, Irismod_Service_QueryWithdrawAddressResponse> {
    return self.makeUnaryCall(
      path: "/irismod.service.Query/WithdrawAddress",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWithdrawAddressInterceptors() ?? []
    )
  }

  /// RequestContext returns the request context
  ///
  /// - Parameters:
  ///   - request: Request to send to RequestContext.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func requestContext(
    _ request: Irismod_Service_QueryRequestContextRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Irismod_Service_QueryRequestContextRequest, Irismod_Service_QueryRequestContextResponse> {
    return self.makeUnaryCall(
      path: "/irismod.service.Query/RequestContext",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRequestContextInterceptors() ?? []
    )
  }

  /// Request returns the request
  ///
  /// - Parameters:
  ///   - request: Request to send to Request.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func request(
    _ request: Irismod_Service_QueryRequestRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Irismod_Service_QueryRequestRequest, Irismod_Service_QueryRequestResponse> {
    return self.makeUnaryCall(
      path: "/irismod.service.Query/Request",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRequestInterceptors() ?? []
    )
  }

  /// Request returns all requests of one service with provider
  ///
  /// - Parameters:
  ///   - request: Request to send to Requests.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func requests(
    _ request: Irismod_Service_QueryRequestsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Irismod_Service_QueryRequestsRequest, Irismod_Service_QueryRequestsResponse> {
    return self.makeUnaryCall(
      path: "/irismod.service.Query/Requests",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRequestsInterceptors() ?? []
    )
  }

  /// RequestsByReqCtx returns all requests of one service call batch
  ///
  /// - Parameters:
  ///   - request: Request to send to RequestsByReqCtx.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func requestsByReqCtx(
    _ request: Irismod_Service_QueryRequestsByReqCtxRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Irismod_Service_QueryRequestsByReqCtxRequest, Irismod_Service_QueryRequestsByReqCtxResponse> {
    return self.makeUnaryCall(
      path: "/irismod.service.Query/RequestsByReqCtx",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRequestsByReqCtxInterceptors() ?? []
    )
  }

  /// Response returns the response of request
  ///
  /// - Parameters:
  ///   - request: Request to send to Response.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func response(
    _ request: Irismod_Service_QueryResponseRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Irismod_Service_QueryResponseRequest, Irismod_Service_QueryResponseResponse> {
    return self.makeUnaryCall(
      path: "/irismod.service.Query/Response",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeResponseInterceptors() ?? []
    )
  }

  /// Responses returns all responses of one service call batch
  ///
  /// - Parameters:
  ///   - request: Request to send to Responses.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func responses(
    _ request: Irismod_Service_QueryResponsesRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Irismod_Service_QueryResponsesRequest, Irismod_Service_QueryResponsesResponse> {
    return self.makeUnaryCall(
      path: "/irismod.service.Query/Responses",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeResponsesInterceptors() ?? []
    )
  }

  /// EarnedFees returns the earned service fee of one provider
  ///
  /// - Parameters:
  ///   - request: Request to send to EarnedFees.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func earnedFees(
    _ request: Irismod_Service_QueryEarnedFeesRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Irismod_Service_QueryEarnedFeesRequest, Irismod_Service_QueryEarnedFeesResponse> {
    return self.makeUnaryCall(
      path: "/irismod.service.Query/EarnedFees",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeEarnedFeesInterceptors() ?? []
    )
  }

  /// Schema returns the schema
  ///
  /// - Parameters:
  ///   - request: Request to send to Schema.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func schema(
    _ request: Irismod_Service_QuerySchemaRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Irismod_Service_QuerySchemaRequest, Irismod_Service_QuerySchemaResponse> {
    return self.makeUnaryCall(
      path: "/irismod.service.Query/Schema",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSchemaInterceptors() ?? []
    )
  }

  /// Params queries the service parameters
  ///
  /// - Parameters:
  ///   - request: Request to send to Params.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func params(
    _ request: Irismod_Service_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Irismod_Service_QueryParamsRequest, Irismod_Service_QueryParamsResponse> {
    return self.makeUnaryCall(
      path: "/irismod.service.Query/Params",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }
}

internal protocol Irismod_Service_QueryClientInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when invoking 'definition'.
  func makeDefinitionInterceptors() -> [ClientInterceptor<Irismod_Service_QueryDefinitionRequest, Irismod_Service_QueryDefinitionResponse>]

  /// - Returns: Interceptors to use when invoking 'binding'.
  func makeBindingInterceptors() -> [ClientInterceptor<Irismod_Service_QueryBindingRequest, Irismod_Service_QueryBindingResponse>]

  /// - Returns: Interceptors to use when invoking 'bindings'.
  func makeBindingsInterceptors() -> [ClientInterceptor<Irismod_Service_QueryBindingsRequest, Irismod_Service_QueryBindingsResponse>]

  /// - Returns: Interceptors to use when invoking 'withdrawAddress'.
  func makeWithdrawAddressInterceptors() -> [ClientInterceptor<Irismod_Service_QueryWithdrawAddressRequest, Irismod_Service_QueryWithdrawAddressResponse>]

  /// - Returns: Interceptors to use when invoking 'requestContext'.
  func makeRequestContextInterceptors() -> [ClientInterceptor<Irismod_Service_QueryRequestContextRequest, Irismod_Service_QueryRequestContextResponse>]

  /// - Returns: Interceptors to use when invoking 'request'.
  func makeRequestInterceptors() -> [ClientInterceptor<Irismod_Service_QueryRequestRequest, Irismod_Service_QueryRequestResponse>]

  /// - Returns: Interceptors to use when invoking 'requests'.
  func makeRequestsInterceptors() -> [ClientInterceptor<Irismod_Service_QueryRequestsRequest, Irismod_Service_QueryRequestsResponse>]

  /// - Returns: Interceptors to use when invoking 'requestsByReqCtx'.
  func makeRequestsByReqCtxInterceptors() -> [ClientInterceptor<Irismod_Service_QueryRequestsByReqCtxRequest, Irismod_Service_QueryRequestsByReqCtxResponse>]

  /// - Returns: Interceptors to use when invoking 'response'.
  func makeResponseInterceptors() -> [ClientInterceptor<Irismod_Service_QueryResponseRequest, Irismod_Service_QueryResponseResponse>]

  /// - Returns: Interceptors to use when invoking 'responses'.
  func makeResponsesInterceptors() -> [ClientInterceptor<Irismod_Service_QueryResponsesRequest, Irismod_Service_QueryResponsesResponse>]

  /// - Returns: Interceptors to use when invoking 'earnedFees'.
  func makeEarnedFeesInterceptors() -> [ClientInterceptor<Irismod_Service_QueryEarnedFeesRequest, Irismod_Service_QueryEarnedFeesResponse>]

  /// - Returns: Interceptors to use when invoking 'schema'.
  func makeSchemaInterceptors() -> [ClientInterceptor<Irismod_Service_QuerySchemaRequest, Irismod_Service_QuerySchemaResponse>]

  /// - Returns: Interceptors to use when invoking 'params'.
  func makeParamsInterceptors() -> [ClientInterceptor<Irismod_Service_QueryParamsRequest, Irismod_Service_QueryParamsResponse>]
}

internal final class Irismod_Service_QueryClient: Irismod_Service_QueryClientProtocol {
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Irismod_Service_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the irismod.service.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Irismod_Service_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query creates service with iservice as rpc
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Irismod_Service_QueryProvider: CallHandlerProvider {
  var interceptors: Irismod_Service_QueryServerInterceptorFactoryProtocol? { get }

  /// Definition returns service definition
  func definition(request: Irismod_Service_QueryDefinitionRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Irismod_Service_QueryDefinitionResponse>

  /// Binding returns service Binding with service name and provider
  func binding(request: Irismod_Service_QueryBindingRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Irismod_Service_QueryBindingResponse>

  /// Bindings returns all service Bindings with service name and owner
  func bindings(request: Irismod_Service_QueryBindingsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Irismod_Service_QueryBindingsResponse>

  /// WithdrawAddress returns the withdraw address of the binding owner
  func withdrawAddress(request: Irismod_Service_QueryWithdrawAddressRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Irismod_Service_QueryWithdrawAddressResponse>

  /// RequestContext returns the request context
  func requestContext(request: Irismod_Service_QueryRequestContextRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Irismod_Service_QueryRequestContextResponse>

  /// Request returns the request
  func request(request: Irismod_Service_QueryRequestRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Irismod_Service_QueryRequestResponse>

  /// Request returns all requests of one service with provider
  func requests(request: Irismod_Service_QueryRequestsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Irismod_Service_QueryRequestsResponse>

  /// RequestsByReqCtx returns all requests of one service call batch
  func requestsByReqCtx(request: Irismod_Service_QueryRequestsByReqCtxRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Irismod_Service_QueryRequestsByReqCtxResponse>

  /// Response returns the response of request
  func response(request: Irismod_Service_QueryResponseRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Irismod_Service_QueryResponseResponse>

  /// Responses returns all responses of one service call batch
  func responses(request: Irismod_Service_QueryResponsesRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Irismod_Service_QueryResponsesResponse>

  /// EarnedFees returns the earned service fee of one provider
  func earnedFees(request: Irismod_Service_QueryEarnedFeesRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Irismod_Service_QueryEarnedFeesResponse>

  /// Schema returns the schema
  func schema(request: Irismod_Service_QuerySchemaRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Irismod_Service_QuerySchemaResponse>

  /// Params queries the service parameters
  func params(request: Irismod_Service_QueryParamsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Irismod_Service_QueryParamsResponse>
}

extension Irismod_Service_QueryProvider {
  internal var serviceName: Substring { return "irismod.service.Query" }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Definition":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Service_QueryDefinitionRequest>(),
        responseSerializer: ProtobufSerializer<Irismod_Service_QueryDefinitionResponse>(),
        interceptors: self.interceptors?.makeDefinitionInterceptors() ?? [],
        userFunction: self.definition(request:context:)
      )

    case "Binding":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Service_QueryBindingRequest>(),
        responseSerializer: ProtobufSerializer<Irismod_Service_QueryBindingResponse>(),
        interceptors: self.interceptors?.makeBindingInterceptors() ?? [],
        userFunction: self.binding(request:context:)
      )

    case "Bindings":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Service_QueryBindingsRequest>(),
        responseSerializer: ProtobufSerializer<Irismod_Service_QueryBindingsResponse>(),
        interceptors: self.interceptors?.makeBindingsInterceptors() ?? [],
        userFunction: self.bindings(request:context:)
      )

    case "WithdrawAddress":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Service_QueryWithdrawAddressRequest>(),
        responseSerializer: ProtobufSerializer<Irismod_Service_QueryWithdrawAddressResponse>(),
        interceptors: self.interceptors?.makeWithdrawAddressInterceptors() ?? [],
        userFunction: self.withdrawAddress(request:context:)
      )

    case "RequestContext":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Service_QueryRequestContextRequest>(),
        responseSerializer: ProtobufSerializer<Irismod_Service_QueryRequestContextResponse>(),
        interceptors: self.interceptors?.makeRequestContextInterceptors() ?? [],
        userFunction: self.requestContext(request:context:)
      )

    case "Request":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Service_QueryRequestRequest>(),
        responseSerializer: ProtobufSerializer<Irismod_Service_QueryRequestResponse>(),
        interceptors: self.interceptors?.makeRequestInterceptors() ?? [],
        userFunction: self.request(request:context:)
      )

    case "Requests":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Service_QueryRequestsRequest>(),
        responseSerializer: ProtobufSerializer<Irismod_Service_QueryRequestsResponse>(),
        interceptors: self.interceptors?.makeRequestsInterceptors() ?? [],
        userFunction: self.requests(request:context:)
      )

    case "RequestsByReqCtx":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Service_QueryRequestsByReqCtxRequest>(),
        responseSerializer: ProtobufSerializer<Irismod_Service_QueryRequestsByReqCtxResponse>(),
        interceptors: self.interceptors?.makeRequestsByReqCtxInterceptors() ?? [],
        userFunction: self.requestsByReqCtx(request:context:)
      )

    case "Response":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Service_QueryResponseRequest>(),
        responseSerializer: ProtobufSerializer<Irismod_Service_QueryResponseResponse>(),
        interceptors: self.interceptors?.makeResponseInterceptors() ?? [],
        userFunction: self.response(request:context:)
      )

    case "Responses":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Service_QueryResponsesRequest>(),
        responseSerializer: ProtobufSerializer<Irismod_Service_QueryResponsesResponse>(),
        interceptors: self.interceptors?.makeResponsesInterceptors() ?? [],
        userFunction: self.responses(request:context:)
      )

    case "EarnedFees":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Service_QueryEarnedFeesRequest>(),
        responseSerializer: ProtobufSerializer<Irismod_Service_QueryEarnedFeesResponse>(),
        interceptors: self.interceptors?.makeEarnedFeesInterceptors() ?? [],
        userFunction: self.earnedFees(request:context:)
      )

    case "Schema":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Service_QuerySchemaRequest>(),
        responseSerializer: ProtobufSerializer<Irismod_Service_QuerySchemaResponse>(),
        interceptors: self.interceptors?.makeSchemaInterceptors() ?? [],
        userFunction: self.schema(request:context:)
      )

    case "Params":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Irismod_Service_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Irismod_Service_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        userFunction: self.params(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Irismod_Service_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'definition'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDefinitionInterceptors() -> [ServerInterceptor<Irismod_Service_QueryDefinitionRequest, Irismod_Service_QueryDefinitionResponse>]

  /// - Returns: Interceptors to use when handling 'binding'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeBindingInterceptors() -> [ServerInterceptor<Irismod_Service_QueryBindingRequest, Irismod_Service_QueryBindingResponse>]

  /// - Returns: Interceptors to use when handling 'bindings'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeBindingsInterceptors() -> [ServerInterceptor<Irismod_Service_QueryBindingsRequest, Irismod_Service_QueryBindingsResponse>]

  /// - Returns: Interceptors to use when handling 'withdrawAddress'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeWithdrawAddressInterceptors() -> [ServerInterceptor<Irismod_Service_QueryWithdrawAddressRequest, Irismod_Service_QueryWithdrawAddressResponse>]

  /// - Returns: Interceptors to use when handling 'requestContext'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRequestContextInterceptors() -> [ServerInterceptor<Irismod_Service_QueryRequestContextRequest, Irismod_Service_QueryRequestContextResponse>]

  /// - Returns: Interceptors to use when handling 'request'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRequestInterceptors() -> [ServerInterceptor<Irismod_Service_QueryRequestRequest, Irismod_Service_QueryRequestResponse>]

  /// - Returns: Interceptors to use when handling 'requests'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRequestsInterceptors() -> [ServerInterceptor<Irismod_Service_QueryRequestsRequest, Irismod_Service_QueryRequestsResponse>]

  /// - Returns: Interceptors to use when handling 'requestsByReqCtx'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRequestsByReqCtxInterceptors() -> [ServerInterceptor<Irismod_Service_QueryRequestsByReqCtxRequest, Irismod_Service_QueryRequestsByReqCtxResponse>]

  /// - Returns: Interceptors to use when handling 'response'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeResponseInterceptors() -> [ServerInterceptor<Irismod_Service_QueryResponseRequest, Irismod_Service_QueryResponseResponse>]

  /// - Returns: Interceptors to use when handling 'responses'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeResponsesInterceptors() -> [ServerInterceptor<Irismod_Service_QueryResponsesRequest, Irismod_Service_QueryResponsesResponse>]

  /// - Returns: Interceptors to use when handling 'earnedFees'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeEarnedFeesInterceptors() -> [ServerInterceptor<Irismod_Service_QueryEarnedFeesRequest, Irismod_Service_QueryEarnedFeesResponse>]

  /// - Returns: Interceptors to use when handling 'schema'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSchemaInterceptors() -> [ServerInterceptor<Irismod_Service_QuerySchemaRequest, Irismod_Service_QuerySchemaResponse>]

  /// - Returns: Interceptors to use when handling 'params'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeParamsInterceptors() -> [ServerInterceptor<Irismod_Service_QueryParamsRequest, Irismod_Service_QueryParamsResponse>]
}
