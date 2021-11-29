// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: did/diddoc.proto
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

/// BaseDidDoc defines a base DID document type. It implements the DidDoc interface.
struct Did_BaseDidDoc {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var did: String = String()

  var pubKey: String = String()

  var credentials: [Did_DidCredential] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "did"

extension Did_BaseDidDoc: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".BaseDidDoc"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "did"),
    2: .standard(proto: "pub_key"),
    3: .same(proto: "credentials"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.did) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.pubKey) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.credentials) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.did.isEmpty {
      try visitor.visitSingularStringField(value: self.did, fieldNumber: 1)
    }
    if !self.pubKey.isEmpty {
      try visitor.visitSingularStringField(value: self.pubKey, fieldNumber: 2)
    }
    if !self.credentials.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.credentials, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Did_BaseDidDoc, rhs: Did_BaseDidDoc) -> Bool {
    if lhs.did != rhs.did {return false}
    if lhs.pubKey != rhs.pubKey {return false}
    if lhs.credentials != rhs.credentials {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
