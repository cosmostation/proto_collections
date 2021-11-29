// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: oracle/query.proto
//
// For information on using the generated types, please see the documentation:
//   https://github.com/apple/swift-protobuf/

import Foundation
import SwiftProtobuf

// If the compiler emits an error on this type, it is because this file
// was generated by a version of the `protoc` Swift plug-in that is
// incompatible with the version of SwiftProtobuf to which you are linking.
// Please ensure that you are building against the same version of the API
// that was used to generate this file.
fileprivate struct _GeneratedWithProtocGenSwiftVersion: SwiftProtobuf.ProtobufAPIVersionCheck {
  struct _2: SwiftProtobuf.ProtobufAPIVersion_2 {}
  typealias Version = _2
}

/// QueryFeedRequest is request type for the Query/Feed RPC method
struct Irismod_Oracle_QueryFeedRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var feedName: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// QueryFeedResponse is response type for the Query/Feed RPC method
struct Irismod_Oracle_QueryFeedResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var feed: Irismod_Oracle_FeedContext {
    get {return _feed ?? Irismod_Oracle_FeedContext()}
    set {_feed = newValue}
  }
  /// Returns true if `feed` has been explicitly set.
  var hasFeed: Bool {return self._feed != nil}
  /// Clears the value of `feed`. Subsequent reads from it will return its default value.
  mutating func clearFeed() {self._feed = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _feed: Irismod_Oracle_FeedContext? = nil
}

/// QueryFeedsRequest is request type for the Query/Feeds RPC method
struct Irismod_Oracle_QueryFeedsRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var state: String = String()

  /// pagination defines an optional pagination for the request
  var pagination: Cosmos_Base_Query_V1beta1_PageRequest {
    get {return _pagination ?? Cosmos_Base_Query_V1beta1_PageRequest()}
    set {_pagination = newValue}
  }
  /// Returns true if `pagination` has been explicitly set.
  var hasPagination: Bool {return self._pagination != nil}
  /// Clears the value of `pagination`. Subsequent reads from it will return its default value.
  mutating func clearPagination() {self._pagination = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _pagination: Cosmos_Base_Query_V1beta1_PageRequest? = nil
}

/// QueryFeedsResponse is response type for the Query/Feeds RPC method
struct Irismod_Oracle_QueryFeedsResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var feeds: [Irismod_Oracle_FeedContext] = []

  /// pagination defines an optional pagination for the request
  var pagination: Cosmos_Base_Query_V1beta1_PageResponse {
    get {return _pagination ?? Cosmos_Base_Query_V1beta1_PageResponse()}
    set {_pagination = newValue}
  }
  /// Returns true if `pagination` has been explicitly set.
  var hasPagination: Bool {return self._pagination != nil}
  /// Clears the value of `pagination`. Subsequent reads from it will return its default value.
  mutating func clearPagination() {self._pagination = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _pagination: Cosmos_Base_Query_V1beta1_PageResponse? = nil
}

/// QueryFeedValueRequest is request type for the Query/FeedValue RPC method
struct Irismod_Oracle_QueryFeedValueRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var feedName: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// QueryFeedValueResponse is response type for the Query/FeedValue RPC method
struct Irismod_Oracle_QueryFeedValueResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var feedValues: [Irismod_Oracle_FeedValue] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// FeedContext defines the feed context struct
struct Irismod_Oracle_FeedContext {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var feed: Irismod_Oracle_Feed {
    get {return _feed ?? Irismod_Oracle_Feed()}
    set {_feed = newValue}
  }
  /// Returns true if `feed` has been explicitly set.
  var hasFeed: Bool {return self._feed != nil}
  /// Clears the value of `feed`. Subsequent reads from it will return its default value.
  mutating func clearFeed() {self._feed = nil}

  var serviceName: String = String()

  var providers: [String] = []

  var input: String = String()

  var timeout: Int64 = 0

  var serviceFeeCap: [Cosmos_Base_V1beta1_Coin] = []

  var repeatedFrequency: UInt64 = 0

  var responseThreshold: UInt32 = 0

  var state: Irismod_Service_RequestContextState = .running

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _feed: Irismod_Oracle_Feed? = nil
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "irismod.oracle"

extension Irismod_Oracle_QueryFeedRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryFeedRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "feed_name"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.feedName) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.feedName.isEmpty {
      try visitor.visitSingularStringField(value: self.feedName, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Irismod_Oracle_QueryFeedRequest, rhs: Irismod_Oracle_QueryFeedRequest) -> Bool {
    if lhs.feedName != rhs.feedName {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Irismod_Oracle_QueryFeedResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryFeedResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "feed"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._feed) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if let v = self._feed {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Irismod_Oracle_QueryFeedResponse, rhs: Irismod_Oracle_QueryFeedResponse) -> Bool {
    if lhs._feed != rhs._feed {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Irismod_Oracle_QueryFeedsRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryFeedsRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "state"),
    2: .same(proto: "pagination"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.state) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._pagination) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.state.isEmpty {
      try visitor.visitSingularStringField(value: self.state, fieldNumber: 1)
    }
    if let v = self._pagination {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Irismod_Oracle_QueryFeedsRequest, rhs: Irismod_Oracle_QueryFeedsRequest) -> Bool {
    if lhs.state != rhs.state {return false}
    if lhs._pagination != rhs._pagination {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Irismod_Oracle_QueryFeedsResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryFeedsResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "feeds"),
    2: .same(proto: "pagination"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.feeds) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._pagination) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.feeds.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.feeds, fieldNumber: 1)
    }
    if let v = self._pagination {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Irismod_Oracle_QueryFeedsResponse, rhs: Irismod_Oracle_QueryFeedsResponse) -> Bool {
    if lhs.feeds != rhs.feeds {return false}
    if lhs._pagination != rhs._pagination {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Irismod_Oracle_QueryFeedValueRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryFeedValueRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "feed_name"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.feedName) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.feedName.isEmpty {
      try visitor.visitSingularStringField(value: self.feedName, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Irismod_Oracle_QueryFeedValueRequest, rhs: Irismod_Oracle_QueryFeedValueRequest) -> Bool {
    if lhs.feedName != rhs.feedName {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Irismod_Oracle_QueryFeedValueResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryFeedValueResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "feed_values"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.feedValues) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.feedValues.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.feedValues, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Irismod_Oracle_QueryFeedValueResponse, rhs: Irismod_Oracle_QueryFeedValueResponse) -> Bool {
    if lhs.feedValues != rhs.feedValues {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Irismod_Oracle_FeedContext: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".FeedContext"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "feed"),
    2: .standard(proto: "service_name"),
    3: .same(proto: "providers"),
    4: .same(proto: "input"),
    5: .same(proto: "timeout"),
    6: .standard(proto: "service_fee_cap"),
    7: .standard(proto: "repeated_frequency"),
    8: .standard(proto: "response_threshold"),
    9: .same(proto: "state"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._feed) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.serviceName) }()
      case 3: try { try decoder.decodeRepeatedStringField(value: &self.providers) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.input) }()
      case 5: try { try decoder.decodeSingularInt64Field(value: &self.timeout) }()
      case 6: try { try decoder.decodeRepeatedMessageField(value: &self.serviceFeeCap) }()
      case 7: try { try decoder.decodeSingularUInt64Field(value: &self.repeatedFrequency) }()
      case 8: try { try decoder.decodeSingularUInt32Field(value: &self.responseThreshold) }()
      case 9: try { try decoder.decodeSingularEnumField(value: &self.state) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if let v = self._feed {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    }
    if !self.serviceName.isEmpty {
      try visitor.visitSingularStringField(value: self.serviceName, fieldNumber: 2)
    }
    if !self.providers.isEmpty {
      try visitor.visitRepeatedStringField(value: self.providers, fieldNumber: 3)
    }
    if !self.input.isEmpty {
      try visitor.visitSingularStringField(value: self.input, fieldNumber: 4)
    }
    if self.timeout != 0 {
      try visitor.visitSingularInt64Field(value: self.timeout, fieldNumber: 5)
    }
    if !self.serviceFeeCap.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.serviceFeeCap, fieldNumber: 6)
    }
    if self.repeatedFrequency != 0 {
      try visitor.visitSingularUInt64Field(value: self.repeatedFrequency, fieldNumber: 7)
    }
    if self.responseThreshold != 0 {
      try visitor.visitSingularUInt32Field(value: self.responseThreshold, fieldNumber: 8)
    }
    if self.state != .running {
      try visitor.visitSingularEnumField(value: self.state, fieldNumber: 9)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Irismod_Oracle_FeedContext, rhs: Irismod_Oracle_FeedContext) -> Bool {
    if lhs._feed != rhs._feed {return false}
    if lhs.serviceName != rhs.serviceName {return false}
    if lhs.providers != rhs.providers {return false}
    if lhs.input != rhs.input {return false}
    if lhs.timeout != rhs.timeout {return false}
    if lhs.serviceFeeCap != rhs.serviceFeeCap {return false}
    if lhs.repeatedFrequency != rhs.repeatedFrequency {return false}
    if lhs.responseThreshold != rhs.responseThreshold {return false}
    if lhs.state != rhs.state {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
