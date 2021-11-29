// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: shentu/cert/v1alpha1/genesis.proto
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

struct Shentu_Cert_V1alpha1_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var certifiers: [Shentu_Cert_V1alpha1_Certifier] = []

  var platforms: [Shentu_Cert_V1alpha1_Platform] = []

  var certificates: [Shentu_Cert_V1alpha1_Certificate] = []

  var libraries: [Shentu_Cert_V1alpha1_Library] = []

  var nextCertificateID: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "shentu.cert.v1alpha1"

extension Shentu_Cert_V1alpha1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "certifiers"),
    2: .same(proto: "platforms"),
    3: .same(proto: "certificates"),
    4: .same(proto: "libraries"),
    5: .standard(proto: "next_certificate_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.certifiers) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.platforms) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.certificates) }()
      case 4: try { try decoder.decodeRepeatedMessageField(value: &self.libraries) }()
      case 5: try { try decoder.decodeSingularUInt64Field(value: &self.nextCertificateID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.certifiers.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.certifiers, fieldNumber: 1)
    }
    if !self.platforms.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.platforms, fieldNumber: 2)
    }
    if !self.certificates.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.certificates, fieldNumber: 3)
    }
    if !self.libraries.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.libraries, fieldNumber: 4)
    }
    if self.nextCertificateID != 0 {
      try visitor.visitSingularUInt64Field(value: self.nextCertificateID, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Cert_V1alpha1_GenesisState, rhs: Shentu_Cert_V1alpha1_GenesisState) -> Bool {
    if lhs.certifiers != rhs.certifiers {return false}
    if lhs.platforms != rhs.platforms {return false}
    if lhs.certificates != rhs.certificates {return false}
    if lhs.libraries != rhs.libraries {return false}
    if lhs.nextCertificateID != rhs.nextCertificateID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
