//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: desmos/posts/v1beta1/query.proto
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
/// Usage: instantiate `Desmos_Posts_V1beta1_QueryClient`, then call methods of this protocol to make API calls.
internal protocol Desmos_Posts_V1beta1_QueryClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Desmos_Posts_V1beta1_QueryClientInterceptorFactoryProtocol? { get }

  func posts(
    _ request: Desmos_Posts_V1beta1_QueryPostsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Posts_V1beta1_QueryPostsRequest, Desmos_Posts_V1beta1_QueryPostsResponse>

  func post(
    _ request: Desmos_Posts_V1beta1_QueryPostRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Posts_V1beta1_QueryPostRequest, Desmos_Posts_V1beta1_QueryPostResponse>

  func reports(
    _ request: Desmos_Posts_V1beta1_QueryReportsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Posts_V1beta1_QueryReportsRequest, Desmos_Posts_V1beta1_QueryReportsResponse>

  func userAnswers(
    _ request: Desmos_Posts_V1beta1_QueryUserAnswersRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Posts_V1beta1_QueryUserAnswersRequest, Desmos_Posts_V1beta1_QueryUserAnswersResponse>

  func registeredReactions(
    _ request: Desmos_Posts_V1beta1_QueryRegisteredReactionsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Posts_V1beta1_QueryRegisteredReactionsRequest, Desmos_Posts_V1beta1_QueryRegisteredReactionsResponse>

  func params(
    _ request: Desmos_Posts_V1beta1_QueryParamsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Posts_V1beta1_QueryParamsRequest, Desmos_Posts_V1beta1_QueryParamsResponse>

  func postComments(
    _ request: Desmos_Posts_V1beta1_QueryPostCommentsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Posts_V1beta1_QueryPostCommentsRequest, Desmos_Posts_V1beta1_QueryPostCommentsResponse>

  func postReactions(
    _ request: Desmos_Posts_V1beta1_QueryPostReactionsRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Desmos_Posts_V1beta1_QueryPostReactionsRequest, Desmos_Posts_V1beta1_QueryPostReactionsResponse>
}

extension Desmos_Posts_V1beta1_QueryClientProtocol {
  internal var serviceName: String {
    return "desmos.posts.v1beta1.Query"
  }

  /// Posts queries all the stored posts
  ///
  /// - Parameters:
  ///   - request: Request to send to Posts.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func posts(
    _ request: Desmos_Posts_V1beta1_QueryPostsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Posts_V1beta1_QueryPostsRequest, Desmos_Posts_V1beta1_QueryPostsResponse> {
    return self.makeUnaryCall(
      path: "/desmos.posts.v1beta1.Query/Posts",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makePostsInterceptors() ?? []
    )
  }

  /// Post queries a specific post
  ///
  /// - Parameters:
  ///   - request: Request to send to Post.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func post(
    _ request: Desmos_Posts_V1beta1_QueryPostRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Posts_V1beta1_QueryPostRequest, Desmos_Posts_V1beta1_QueryPostResponse> {
    return self.makeUnaryCall(
      path: "/desmos.posts.v1beta1.Query/Post",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makePostInterceptors() ?? []
    )
  }

  /// Reports queries the reports for the post having the given id
  ///
  /// - Parameters:
  ///   - request: Request to send to Reports.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func reports(
    _ request: Desmos_Posts_V1beta1_QueryReportsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Posts_V1beta1_QueryReportsRequest, Desmos_Posts_V1beta1_QueryReportsResponse> {
    return self.makeUnaryCall(
      path: "/desmos.posts.v1beta1.Query/Reports",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeReportsInterceptors() ?? []
    )
  }

  /// UserAnswers queries the user answers of the post having a specific id
  ///
  /// - Parameters:
  ///   - request: Request to send to UserAnswers.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func userAnswers(
    _ request: Desmos_Posts_V1beta1_QueryUserAnswersRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Posts_V1beta1_QueryUserAnswersRequest, Desmos_Posts_V1beta1_QueryUserAnswersResponse> {
    return self.makeUnaryCall(
      path: "/desmos.posts.v1beta1.Query/UserAnswers",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUserAnswersInterceptors() ?? []
    )
  }

  /// RegisteredReactions queries all the registered reactions
  ///
  /// - Parameters:
  ///   - request: Request to send to RegisteredReactions.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func registeredReactions(
    _ request: Desmos_Posts_V1beta1_QueryRegisteredReactionsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Posts_V1beta1_QueryRegisteredReactionsRequest, Desmos_Posts_V1beta1_QueryRegisteredReactionsResponse> {
    return self.makeUnaryCall(
      path: "/desmos.posts.v1beta1.Query/RegisteredReactions",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRegisteredReactionsInterceptors() ?? []
    )
  }

  /// Params queries the posts module params
  ///
  /// - Parameters:
  ///   - request: Request to send to Params.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func params(
    _ request: Desmos_Posts_V1beta1_QueryParamsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Posts_V1beta1_QueryParamsRequest, Desmos_Posts_V1beta1_QueryParamsResponse> {
    return self.makeUnaryCall(
      path: "/desmos.posts.v1beta1.Query/Params",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeParamsInterceptors() ?? []
    )
  }

  /// PostComments queries the comments of the post having the given id
  ///
  /// - Parameters:
  ///   - request: Request to send to PostComments.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func postComments(
    _ request: Desmos_Posts_V1beta1_QueryPostCommentsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Posts_V1beta1_QueryPostCommentsRequest, Desmos_Posts_V1beta1_QueryPostCommentsResponse> {
    return self.makeUnaryCall(
      path: "/desmos.posts.v1beta1.Query/PostComments",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makePostCommentsInterceptors() ?? []
    )
  }

  /// PostReactions queries all the reactions of the post having the given id
  ///
  /// - Parameters:
  ///   - request: Request to send to PostReactions.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func postReactions(
    _ request: Desmos_Posts_V1beta1_QueryPostReactionsRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Desmos_Posts_V1beta1_QueryPostReactionsRequest, Desmos_Posts_V1beta1_QueryPostReactionsResponse> {
    return self.makeUnaryCall(
      path: "/desmos.posts.v1beta1.Query/PostReactions",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makePostReactionsInterceptors() ?? []
    )
  }
}

internal protocol Desmos_Posts_V1beta1_QueryClientInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when invoking 'posts'.
  func makePostsInterceptors() -> [ClientInterceptor<Desmos_Posts_V1beta1_QueryPostsRequest, Desmos_Posts_V1beta1_QueryPostsResponse>]

  /// - Returns: Interceptors to use when invoking 'post'.
  func makePostInterceptors() -> [ClientInterceptor<Desmos_Posts_V1beta1_QueryPostRequest, Desmos_Posts_V1beta1_QueryPostResponse>]

  /// - Returns: Interceptors to use when invoking 'reports'.
  func makeReportsInterceptors() -> [ClientInterceptor<Desmos_Posts_V1beta1_QueryReportsRequest, Desmos_Posts_V1beta1_QueryReportsResponse>]

  /// - Returns: Interceptors to use when invoking 'userAnswers'.
  func makeUserAnswersInterceptors() -> [ClientInterceptor<Desmos_Posts_V1beta1_QueryUserAnswersRequest, Desmos_Posts_V1beta1_QueryUserAnswersResponse>]

  /// - Returns: Interceptors to use when invoking 'registeredReactions'.
  func makeRegisteredReactionsInterceptors() -> [ClientInterceptor<Desmos_Posts_V1beta1_QueryRegisteredReactionsRequest, Desmos_Posts_V1beta1_QueryRegisteredReactionsResponse>]

  /// - Returns: Interceptors to use when invoking 'params'.
  func makeParamsInterceptors() -> [ClientInterceptor<Desmos_Posts_V1beta1_QueryParamsRequest, Desmos_Posts_V1beta1_QueryParamsResponse>]

  /// - Returns: Interceptors to use when invoking 'postComments'.
  func makePostCommentsInterceptors() -> [ClientInterceptor<Desmos_Posts_V1beta1_QueryPostCommentsRequest, Desmos_Posts_V1beta1_QueryPostCommentsResponse>]

  /// - Returns: Interceptors to use when invoking 'postReactions'.
  func makePostReactionsInterceptors() -> [ClientInterceptor<Desmos_Posts_V1beta1_QueryPostReactionsRequest, Desmos_Posts_V1beta1_QueryPostReactionsResponse>]
}

internal final class Desmos_Posts_V1beta1_QueryClient: Desmos_Posts_V1beta1_QueryClientProtocol {
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Desmos_Posts_V1beta1_QueryClientInterceptorFactoryProtocol?

  /// Creates a client for the desmos.posts.v1beta1.Query service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Desmos_Posts_V1beta1_QueryClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Query defines the gRPC querier service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Desmos_Posts_V1beta1_QueryProvider: CallHandlerProvider {
  var interceptors: Desmos_Posts_V1beta1_QueryServerInterceptorFactoryProtocol? { get }

  /// Posts queries all the stored posts
  func posts(request: Desmos_Posts_V1beta1_QueryPostsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Posts_V1beta1_QueryPostsResponse>

  /// Post queries a specific post
  func post(request: Desmos_Posts_V1beta1_QueryPostRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Posts_V1beta1_QueryPostResponse>

  /// Reports queries the reports for the post having the given id
  func reports(request: Desmos_Posts_V1beta1_QueryReportsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Posts_V1beta1_QueryReportsResponse>

  /// UserAnswers queries the user answers of the post having a specific id
  func userAnswers(request: Desmos_Posts_V1beta1_QueryUserAnswersRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Posts_V1beta1_QueryUserAnswersResponse>

  /// RegisteredReactions queries all the registered reactions
  func registeredReactions(request: Desmos_Posts_V1beta1_QueryRegisteredReactionsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Posts_V1beta1_QueryRegisteredReactionsResponse>

  /// Params queries the posts module params
  func params(request: Desmos_Posts_V1beta1_QueryParamsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Posts_V1beta1_QueryParamsResponse>

  /// PostComments queries the comments of the post having the given id
  func postComments(request: Desmos_Posts_V1beta1_QueryPostCommentsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Posts_V1beta1_QueryPostCommentsResponse>

  /// PostReactions queries all the reactions of the post having the given id
  func postReactions(request: Desmos_Posts_V1beta1_QueryPostReactionsRequest, context: StatusOnlyCallContext) -> EventLoopFuture<Desmos_Posts_V1beta1_QueryPostReactionsResponse>
}

extension Desmos_Posts_V1beta1_QueryProvider {
  internal var serviceName: Substring { return "desmos.posts.v1beta1.Query" }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "Posts":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Posts_V1beta1_QueryPostsRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Posts_V1beta1_QueryPostsResponse>(),
        interceptors: self.interceptors?.makePostsInterceptors() ?? [],
        userFunction: self.posts(request:context:)
      )

    case "Post":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Posts_V1beta1_QueryPostRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Posts_V1beta1_QueryPostResponse>(),
        interceptors: self.interceptors?.makePostInterceptors() ?? [],
        userFunction: self.post(request:context:)
      )

    case "Reports":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Posts_V1beta1_QueryReportsRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Posts_V1beta1_QueryReportsResponse>(),
        interceptors: self.interceptors?.makeReportsInterceptors() ?? [],
        userFunction: self.reports(request:context:)
      )

    case "UserAnswers":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Posts_V1beta1_QueryUserAnswersRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Posts_V1beta1_QueryUserAnswersResponse>(),
        interceptors: self.interceptors?.makeUserAnswersInterceptors() ?? [],
        userFunction: self.userAnswers(request:context:)
      )

    case "RegisteredReactions":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Posts_V1beta1_QueryRegisteredReactionsRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Posts_V1beta1_QueryRegisteredReactionsResponse>(),
        interceptors: self.interceptors?.makeRegisteredReactionsInterceptors() ?? [],
        userFunction: self.registeredReactions(request:context:)
      )

    case "Params":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Posts_V1beta1_QueryParamsRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Posts_V1beta1_QueryParamsResponse>(),
        interceptors: self.interceptors?.makeParamsInterceptors() ?? [],
        userFunction: self.params(request:context:)
      )

    case "PostComments":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Posts_V1beta1_QueryPostCommentsRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Posts_V1beta1_QueryPostCommentsResponse>(),
        interceptors: self.interceptors?.makePostCommentsInterceptors() ?? [],
        userFunction: self.postComments(request:context:)
      )

    case "PostReactions":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Desmos_Posts_V1beta1_QueryPostReactionsRequest>(),
        responseSerializer: ProtobufSerializer<Desmos_Posts_V1beta1_QueryPostReactionsResponse>(),
        interceptors: self.interceptors?.makePostReactionsInterceptors() ?? [],
        userFunction: self.postReactions(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Desmos_Posts_V1beta1_QueryServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'posts'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makePostsInterceptors() -> [ServerInterceptor<Desmos_Posts_V1beta1_QueryPostsRequest, Desmos_Posts_V1beta1_QueryPostsResponse>]

  /// - Returns: Interceptors to use when handling 'post'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makePostInterceptors() -> [ServerInterceptor<Desmos_Posts_V1beta1_QueryPostRequest, Desmos_Posts_V1beta1_QueryPostResponse>]

  /// - Returns: Interceptors to use when handling 'reports'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeReportsInterceptors() -> [ServerInterceptor<Desmos_Posts_V1beta1_QueryReportsRequest, Desmos_Posts_V1beta1_QueryReportsResponse>]

  /// - Returns: Interceptors to use when handling 'userAnswers'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeUserAnswersInterceptors() -> [ServerInterceptor<Desmos_Posts_V1beta1_QueryUserAnswersRequest, Desmos_Posts_V1beta1_QueryUserAnswersResponse>]

  /// - Returns: Interceptors to use when handling 'registeredReactions'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRegisteredReactionsInterceptors() -> [ServerInterceptor<Desmos_Posts_V1beta1_QueryRegisteredReactionsRequest, Desmos_Posts_V1beta1_QueryRegisteredReactionsResponse>]

  /// - Returns: Interceptors to use when handling 'params'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeParamsInterceptors() -> [ServerInterceptor<Desmos_Posts_V1beta1_QueryParamsRequest, Desmos_Posts_V1beta1_QueryParamsResponse>]

  /// - Returns: Interceptors to use when handling 'postComments'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makePostCommentsInterceptors() -> [ServerInterceptor<Desmos_Posts_V1beta1_QueryPostCommentsRequest, Desmos_Posts_V1beta1_QueryPostCommentsResponse>]

  /// - Returns: Interceptors to use when handling 'postReactions'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makePostReactionsInterceptors() -> [ServerInterceptor<Desmos_Posts_V1beta1_QueryPostReactionsRequest, Desmos_Posts_V1beta1_QueryPostReactionsResponse>]
}
