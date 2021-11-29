// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: desmos/profiles/v1beta1/client/cli.proto
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

/// ChainLinkJSON contains the data required to create a ChainLink using the CLI
/// command
struct Desmos_Profiles_V1beta1_Client_ChainLinkJSON {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Address contains the data of the external chain address to be connected
  /// with the Desmos profile
  var address: SwiftProtobuf.Google_Protobuf_Any {
    get {return _address ?? SwiftProtobuf.Google_Protobuf_Any()}
    set {_address = newValue}
  }
  /// Returns true if `address` has been explicitly set.
  var hasAddress: Bool {return self._address != nil}
  /// Clears the value of `address`. Subsequent reads from it will return its default value.
  mutating func clearAddress() {self._address = nil}

  /// Proof contains the ownership proof of the external chain address
  var proof: Desmos_Profiles_V1beta1_Proof {
    get {return _proof ?? Desmos_Profiles_V1beta1_Proof()}
    set {_proof = newValue}
  }
  /// Returns true if `proof` has been explicitly set.
  var hasProof: Bool {return self._proof != nil}
  /// Clears the value of `proof`. Subsequent reads from it will return its default value.
  mutating func clearProof() {self._proof = nil}

  /// ChainConfig contains the configuration of the external chain
  var chainConfig: Desmos_Profiles_V1beta1_ChainConfig {
    get {return _chainConfig ?? Desmos_Profiles_V1beta1_ChainConfig()}
    set {_chainConfig = newValue}
  }
  /// Returns true if `chainConfig` has been explicitly set.
  var hasChainConfig: Bool {return self._chainConfig != nil}
  /// Clears the value of `chainConfig`. Subsequent reads from it will return its default value.
  mutating func clearChainConfig() {self._chainConfig = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _address: SwiftProtobuf.Google_Protobuf_Any? = nil
  fileprivate var _proof: Desmos_Profiles_V1beta1_Proof? = nil
  fileprivate var _chainConfig: Desmos_Profiles_V1beta1_ChainConfig? = nil
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "desmos.profiles.v1beta1.client"

extension Desmos_Profiles_V1beta1_Client_ChainLinkJSON: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ChainLinkJSON"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "address"),
    2: .same(proto: "proof"),
    3: .standard(proto: "chain_config"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._address) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._proof) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._chainConfig) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if let v = self._address {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    }
    if let v = self._proof {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    }
    if let v = self._chainConfig {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Desmos_Profiles_V1beta1_Client_ChainLinkJSON, rhs: Desmos_Profiles_V1beta1_Client_ChainLinkJSON) -> Bool {
    if lhs._address != rhs._address {return false}
    if lhs._proof != rhs._proof {return false}
    if lhs._chainConfig != rhs._chainConfig {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
