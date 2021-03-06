// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: desmos/posts/v1beta1/genesis.proto
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

/// GenesisState contains the data of the genesis state for the posts module
struct Desmos_Posts_V1beta1_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var posts: [Desmos_Posts_V1beta1_Post] = []

  var usersPollAnswers: [Desmos_Posts_V1beta1_UserAnswer] = []

  var postsReactions: [Desmos_Posts_V1beta1_PostReaction] = []

  var registeredReactions: [Desmos_Posts_V1beta1_RegisteredReaction] = []

  var reports: [Desmos_Posts_V1beta1_Report] = []

  var params: Desmos_Posts_V1beta1_Params {
    get {return _params ?? Desmos_Posts_V1beta1_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _params: Desmos_Posts_V1beta1_Params? = nil
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "desmos.posts.v1beta1"

extension Desmos_Posts_V1beta1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "posts"),
    2: .standard(proto: "users_poll_answers"),
    3: .standard(proto: "posts_reactions"),
    4: .standard(proto: "registered_reactions"),
    5: .same(proto: "reports"),
    6: .same(proto: "params"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.posts) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.usersPollAnswers) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.postsReactions) }()
      case 4: try { try decoder.decodeRepeatedMessageField(value: &self.registeredReactions) }()
      case 5: try { try decoder.decodeRepeatedMessageField(value: &self.reports) }()
      case 6: try { try decoder.decodeSingularMessageField(value: &self._params) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.posts.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.posts, fieldNumber: 1)
    }
    if !self.usersPollAnswers.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.usersPollAnswers, fieldNumber: 2)
    }
    if !self.postsReactions.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.postsReactions, fieldNumber: 3)
    }
    if !self.registeredReactions.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.registeredReactions, fieldNumber: 4)
    }
    if !self.reports.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.reports, fieldNumber: 5)
    }
    if let v = self._params {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 6)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Desmos_Posts_V1beta1_GenesisState, rhs: Desmos_Posts_V1beta1_GenesisState) -> Bool {
    if lhs.posts != rhs.posts {return false}
    if lhs.usersPollAnswers != rhs.usersPollAnswers {return false}
    if lhs.postsReactions != rhs.postsReactions {return false}
    if lhs.registeredReactions != rhs.registeredReactions {return false}
    if lhs.reports != rhs.reports {return false}
    if lhs._params != rhs._params {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
