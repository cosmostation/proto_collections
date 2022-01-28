//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: cosmwasm/wasm/v1/query.proto
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


/// Query provides defines the gRPC querier service
///
/// Usage: instantiate `Cosmwasm_Wasm_V1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Cosmwasm_Wasm_V1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Cosmwasm_Wasm_V1_QueryClientInterceptorFactoryProtocol? { get }

  func contractInfo(
    _ request: Cosmwasm_Wasm_V1_QueryContractInfoRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Cosmwasm_Wasm_V1_QueryContractInfoRequest, Cosmwasm_Wasm_V1_QueryContractInfoResponse>

  func contractHistory(
    _ request: Cosmwasm_Wasm_V1_QueryContractHistoryRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Cosmwasm_Wasm_V1_QueryContractHistoryRequest, Cosmwasm_Wasm_V1_QueryContractHistoryResponse>

  func contractsByCode(
    _ request: Cosmwasm_Wasm_V1_QueryContractsByCodeRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Cosmwasm_Wasm_V1_QueryContractsByCodeRequest, Cosmwasm_Wasm_V1_QueryContractsByCodeResponse>

  func allContractState(
    _ request: Cosmwasm_Wasm_V1_QueryAllContractStateRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Cosmwasm_Wasm_V1_QueryAllContractStateRequest, Cosmwasm_Wasm_V1_QueryAllContractStateResponse>

  func rawContractState(
    _ request: Cosmwasm_Wasm_V1_QueryRawContractStateRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Cosmwasm_Wasm_V1_QueryRawContractStateRequest, Cosmwasm_Wasm_V1_QueryRawContractStateResponse>

  func smartContractState(
    _ request: Cosmwasm_Wasm_V1_QuerySmartContractStateRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Cosmwasm_Wasm_V1_QuerySmartContractStateRequest, Cosmwasm_Wasm_V1_QuerySmartContractStateResponse>

  func code(
    _ request: Cosmwasm_Wasm_V1_QueryCodeRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Cosmwasm_Wasm_V1_QueryCodeRequest, Cosmwasm_Wasm_V1_QueryCodeResponse>

  func codes(
    _ request: Cosmwasm_Wasm_V1_QueryCodesRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Cosmwasm_Wasm_V1_QueryCodesRequest, Cosmwasm_Wasm_V1_QueryCodesResponse>

  func pinnedCodes(
    _ request: Cosmwasm_Wasm_V1_QueryPinnedCodesRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Cosmwasm_Wasm_V1_QueryPinnedCodesRequest, Cosmwasm_Wasm_V1_QueryPinnedCodesResponse>
}

extension Cosmwasm_Wasm_V1_QueryClientProtocol {
  internal var serviceName: String {
    return "cosmwasm.wasm.v1.Query"
  }

  /// ContractInfo gets the contract meta data
  ///
  /// - Parameters:
  ///   - request: Request to send to ContractInfo.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func contractInfo(
    _ request: Cosmwasm_Wasm_V1_QueryContractInfoRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Cosmwasm_Wasm_V1_QueryContractInfoRequest, Cosmwasm_Wasm_V1_QueryContractInfoResponse> {
    return self.makeUnaryCall(
      path: "/cosmwasm.wasm.v1.Query/ContractInfo",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeContractInfoInterceptors() ?? []
    )
  }

  /// ContractHistory gets the contract code history
  ///
  /// - Parameters:
  ///   - request: Request to send to ContractHistory.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func contractHistory(
    _ request: Cosmwasm_Wasm_V1_QueryContractHistoryRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Cosmwasm_Wasm_V1_QueryContractHistoryRequest, Cosmwasm_Wasm_V1_QueryContractHistoryResponse> {
    return self.makeUnaryCall(
      path: "/cosmwasm.wasm.v1.Query/ContractHistory",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeContractHistoryInterceptors() ?? []
    )
  }

  /// ContractsByCode lists all smart contracts for a code id
  ///
  /// - Parameters:
  ///   - request: Request to send to ContractsByCode.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func contractsByCode(
    _ request: Cosmwasm_Wasm_V1_QueryContractsByCodeRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Cosmwasm_Wasm_V1_QueryContractsByCodeRequest, Cosmwasm_Wasm_V1_QueryContractsByCodeResponse> {
    return self.makeUnaryCall(
      path: "/cosmwasm.wasm.v1.Query/ContractsByCode",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeContractsByCodeInterceptors() ?? []
    )
  }

  /// AllContractState gets all raw store data for a single contract
  ///
  /// - Parameters:
  ///   - request: Request to send to AllContractState.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func allContractState(
    _ request: Cosmwasm_Wasm_V1_QueryAllContractStateRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Cosmwasm_Wasm_V1_QueryAllContractStateRequest, Cosmwasm_Wasm_V1_QueryAllContractStateResponse> {
    return self.makeUnaryCall(
      path: "/cosmwasm.wasm.v1.Query/AllContractState",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAllContractStateInterceptors() ?? []
    )
  }

  /// RawContractState gets single key from the raw store data of a contract
  ///
  /// - Parameters:
  ///   - request: Request to send to RawContractState.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func rawContractState(
    _ request: Cosmwasm_Wasm_V1_QueryRawContractStateRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Cosmwasm_Wasm_V1_QueryRawContractStateRequest, Cosmwasm_Wasm_V1_QueryRawContractStateResponse> {
    return self.makeUnaryCall(
      path: "/cosmwasm.wasm.v1.Query/RawContractState",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRawContractStateInterceptors() ?? []
    )
  }

  /// SmartContractState get smart query result from the contract
  ///
  /// - Parameters:
  ///   - request: Request to send to SmartContractState.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func smartContractState(
    _ request: Cosmwasm_Wasm_V1_QuerySmartContractStateRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Cosmwasm_Wasm_V1_QuerySmartContractStateRequest, Cosmwasm_Wasm_V1_QuerySmartContractStateResponse> {
    return self.makeUnaryCall(
      path: "/cosmwasm.wasm.v1.Query/SmartContractState",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeSmartContractStateInterceptors() ?? []
    )
  }

  /// Code gets the binary code and metadata for a singe wasm code
  ///
  /// - Parameters:
  ///   - request: Request to send to Code.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func code(
    _ request: Cosmwasm_Wasm_V1_QueryCodeRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Cosmwasm_Wasm_V1_QueryCodeRequest, Cosmwasm_Wasm_V1_QueryCodeResponse> {
    return self.makeUnaryCall(
      path: "/cosmwasm.wasm.v1.Query/Code",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCodeInterceptors() ?? []
    )
  }

  /// Codes gets the metadata for all stored wasm codes
  ///
  /// - Parameters:
  ///   - request: Request to send to Codes.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func codes(
    _ request: Cosmwasm_Wasm_V1_QueryCodesRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Cosmwasm_Wasm_V1_QueryCodesRequest, Cosmwasm_Wasm_V1_QueryCodesResponse> {
    return self.makeUnaryCall(
      path: "/cosmwasm.wasm.v1.Query/Codes",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCodesInterceptors() ?? []
    )
  }

  /// PinnedCodes gets the pinned code ids
  ///
  /// - Parameters:
  ///   - request: Request to send to PinnedCodes.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func pinnedCodes(
    _ request: Cosmwasm_Wasm_V1_QueryPinnedCodesRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Cosmwasm_Wasm_V1_QueryPinnedCodesRequest, Cosmwasm_Wasm_V1_QueryPinnedCodesResponse> {
    return self.makeUnaryCall(
      path: "/cosmwasm.wasm.v1.Query/PinnedCodes",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makePinnedCodesInterceptors() ?? []
    )
  }
}

internal protocol Cosmwasm_Wasm_V1_QueryClientInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when invoking 'contractInfo'.
  func makeContractInfoInterceptors() -> [ClientInterceptor<Cosmwasm_Wasm_V1_QueryContractInfoRequest, Cosmwasm_Wasm_V1_QueryContractInfoResponse>]

  /// - Returns: Interceptors to use when invoking 'contractHistory'.
  func makeContractHistoryInterceptors() -> [ClientInterceptor<Cosmwasm_Wasm_V1_QueryContractHistoryRequest, Cosmwasm_Wasm_V1_QueryContractHistoryResponse>]

  /// - Returns: Interceptors to use when invoking 'contractsByCode'.
  func makeContractsByCodeInterceptors() -> [ClientInterceptor<Cosmwasm_Wasm_V1_QueryContractsByCodeRequest, Cosmwasm_Wasm_V1_QueryContractsByCodeResponse>]

  /// - Returns: Interceptors to use when invoking 'allContractState'.
  func makeAllContractStateInterceptors() -> [ClientInterceptor<Cosmwasm_Wasm_V1_QueryAllContractStateRequest, Cosmwasm_Wasm_V1_QueryAllContractStateResponse>]

  /// - Returns: Interceptors to use when invoking 'rawContractState'.
  func makeRawContractStateInterceptors() -> [ClientInterceptor<Cosmwasm_Wasm_V1_QueryRawContractStateRequest, Cosmwasm_Wasm_V1_QueryRawContractStateResponse>]

  /// - Returns: Interceptors to use when invoking 'smartContractState'.
  func makeSmartContractStateInterceptors() -> [ClientInterceptor<Cosmwasm_Wasm_V1_QuerySmartContractStateRequest, Cosmwasm_Wasm_V1_QuerySmartContractStateResponse>]

  /// - Returns: Interceptors to use when invoking 'code'.
  func makeCodeInterceptors() -> [ClientInterceptor<Cosmwasm_Wasm_V1_QueryCodeRequest, Cosmwasm_Wasm_V1_QueryCodeResponse>]

  /// - Returns: Interceptors to use when invoking 'codes'.
  func makeCodesInterceptors() -> [ClientInterceptor<Cosmwasm_Wasm_V1_QueryCodesRequest, Cosmwasm_Wasm_V1_QueryCodesResponse>]

  /// - Returns: Interceptors to use when invoking 'pinnedCodes'.
  func makePinnedCodesInterceptors() -> [ClientInterceptor<Cosmwasm_Wasm_V1_QueryPinnedCodesRequest, Cosmwasm_Wasm_V1_QueryPinnedCodesResponse>]
}

internal final class Cosmwasm_Wasm_V1_QueryClient: Cosmwasm_Wasm_V1_QueryClientProtocol {
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Cosmwasm_Wasm_V1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the cosmwasm.wasm.v1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Cosmwasm_Wasm_V1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query provides defines the gRPC querier service
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Cosmwasm_Wasm_V1_QueryProvider: CallHandlerProvider {
  var interceptors: Cosmwasm_Wasm_V1_QueryServerInterceptorFactoryProtocol? { get }

  /// ContractInfo gets the contract meta data
  func contractInfo(request: Cosmwasm_Wasm_V1_QueryContractInfoRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Cosmwasm_Wasm_V1_QueryContractInfoResponse>

  /// ContractHistory gets the contract code history
  func contractHistory(request: Cosmwasm_Wasm_V1_QueryContractHistoryRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Cosmwasm_Wasm_V1_QueryContractHistoryResponse>

  /// ContractsByCode lists all smart contracts for a code id
  func contractsByCode(request: Cosmwasm_Wasm_V1_QueryContractsByCodeRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Cosmwasm_Wasm_V1_QueryContractsByCodeResponse>

  /// AllContractState gets all raw store data for a single contract
  func allContractState(request: Cosmwasm_Wasm_V1_QueryAllContractStateRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Cosmwasm_Wasm_V1_QueryAllContractStateResponse>

  /// RawContractState gets single key from the raw store data of a contract
  func rawContractState(request: Cosmwasm_Wasm_V1_QueryRawContractStateRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Cosmwasm_Wasm_V1_QueryRawContractStateResponse>

  /// SmartContractState get smart query result from the contract
  func smartContractState(request: Cosmwasm_Wasm_V1_QuerySmartContractStateRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Cosmwasm_Wasm_V1_QuerySmartContractStateResponse>

  /// Code gets the binary code and metadata for a singe wasm code
  func code(request: Cosmwasm_Wasm_V1_QueryCodeRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Cosmwasm_Wasm_V1_QueryCodeResponse>

  /// Codes gets the metadata for all stored wasm codes
  func codes(request: Cosmwasm_Wasm_V1_QueryCodesRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Cosmwasm_Wasm_V1_QueryCodesResponse>

  /// PinnedCodes gets the pinned code ids
  func pinnedCodes(request: Cosmwasm_Wasm_V1_QueryPinnedCodesRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Cosmwasm_Wasm_V1_QueryPinnedCodesResponse>
}

extension Cosmwasm_Wasm_V1_QueryProvider {
  internal var serviceName: Substring { return "cosmwasm.wasm.v1.Query" }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "ContractInfo":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cosmwasm_Wasm_V1_QueryContractInfoRequest>(),
        responseSerializer: ProtobufSerializer<Cosmwasm_Wasm_V1_QueryContractInfoResponse>(),
        interceptors: self.interceptors?.makeContractInfoInterceptors() ?? [],
        userFunction: self.contractInfo(request:context:)
      )

    case "ContractHistory":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cosmwasm_Wasm_V1_QueryContractHistoryRequest>(),
        responseSerializer: ProtobufSerializer<Cosmwasm_Wasm_V1_QueryContractHistoryResponse>(),
        interceptors: self.interceptors?.makeContractHistoryInterceptors() ?? [],
        userFunction: self.contractHistory(request:context:)
      )

    case "ContractsByCode":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cosmwasm_Wasm_V1_QueryContractsByCodeRequest>(),
        responseSerializer: ProtobufSerializer<Cosmwasm_Wasm_V1_QueryContractsByCodeResponse>(),
        interceptors: self.interceptors?.makeContractsByCodeInterceptors() ?? [],
        userFunction: self.contractsByCode(request:context:)
      )

    case "AllContractState":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cosmwasm_Wasm_V1_QueryAllContractStateRequest>(),
        responseSerializer: ProtobufSerializer<Cosmwasm_Wasm_V1_QueryAllContractStateResponse>(),
        interceptors: self.interceptors?.makeAllContractStateInterceptors() ?? [],
        userFunction: self.allContractState(request:context:)
      )

    case "RawContractState":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cosmwasm_Wasm_V1_QueryRawContractStateRequest>(),
        responseSerializer: ProtobufSerializer<Cosmwasm_Wasm_V1_QueryRawContractStateResponse>(),
        interceptors: self.interceptors?.makeRawContractStateInterceptors() ?? [],
        userFunction: self.rawContractState(request:context:)
      )

    case "SmartContractState":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cosmwasm_Wasm_V1_QuerySmartContractStateRequest>(),
        responseSerializer: ProtobufSerializer<Cosmwasm_Wasm_V1_QuerySmartContractStateResponse>(),
        interceptors: self.interceptors?.makeSmartContractStateInterceptors() ?? [],
        userFunction: self.smartContractState(request:context:)
      )

    case "Code":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cosmwasm_Wasm_V1_QueryCodeRequest>(),
        responseSerializer: ProtobufSerializer<Cosmwasm_Wasm_V1_QueryCodeResponse>(),
        interceptors: self.interceptors?.makeCodeInterceptors() ?? [],
        userFunction: self.code(request:context:)
      )

    case "Codes":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cosmwasm_Wasm_V1_QueryCodesRequest>(),
        responseSerializer: ProtobufSerializer<Cosmwasm_Wasm_V1_QueryCodesResponse>(),
        interceptors: self.interceptors?.makeCodesInterceptors() ?? [],
        userFunction: self.codes(request:context:)
      )

    case "PinnedCodes":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Cosmwasm_Wasm_V1_QueryPinnedCodesRequest>(),
        responseSerializer: ProtobufSerializer<Cosmwasm_Wasm_V1_QueryPinnedCodesResponse>(),
        interceptors: self.interceptors?.makePinnedCodesInterceptors() ?? [],
        userFunction: self.pinnedCodes(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Cosmwasm_Wasm_V1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'contractInfo'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeContractInfoInterceptors() -> [ServerInterceptor<Cosmwasm_Wasm_V1_QueryContractInfoRequest, Cosmwasm_Wasm_V1_QueryContractInfoResponse>]

  /// - Returns: Interceptors to use when handling 'contractHistory'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeContractHistoryInterceptors() -> [ServerInterceptor<Cosmwasm_Wasm_V1_QueryContractHistoryRequest, Cosmwasm_Wasm_V1_QueryContractHistoryResponse>]

  /// - Returns: Interceptors to use when handling 'contractsByCode'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeContractsByCodeInterceptors() -> [ServerInterceptor<Cosmwasm_Wasm_V1_QueryContractsByCodeRequest, Cosmwasm_Wasm_V1_QueryContractsByCodeResponse>]

  /// - Returns: Interceptors to use when handling 'allContractState'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAllContractStateInterceptors() -> [ServerInterceptor<Cosmwasm_Wasm_V1_QueryAllContractStateRequest, Cosmwasm_Wasm_V1_QueryAllContractStateResponse>]

  /// - Returns: Interceptors to use when handling 'rawContractState'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRawContractStateInterceptors() -> [ServerInterceptor<Cosmwasm_Wasm_V1_QueryRawContractStateRequest, Cosmwasm_Wasm_V1_QueryRawContractStateResponse>]

  /// - Returns: Interceptors to use when handling 'smartContractState'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeSmartContractStateInterceptors() -> [ServerInterceptor<Cosmwasm_Wasm_V1_QuerySmartContractStateRequest, Cosmwasm_Wasm_V1_QuerySmartContractStateResponse>]

  /// - Returns: Interceptors to use when handling 'code'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCodeInterceptors() -> [ServerInterceptor<Cosmwasm_Wasm_V1_QueryCodeRequest, Cosmwasm_Wasm_V1_QueryCodeResponse>]

  /// - Returns: Interceptors to use when handling 'codes'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCodesInterceptors() -> [ServerInterceptor<Cosmwasm_Wasm_V1_QueryCodesRequest, Cosmwasm_Wasm_V1_QueryCodesResponse>]

  /// - Returns: Interceptors to use when handling 'pinnedCodes'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makePinnedCodesInterceptors() -> [ServerInterceptor<Cosmwasm_Wasm_V1_QueryPinnedCodesRequest, Cosmwasm_Wasm_V1_QueryPinnedCodesResponse>]
}
