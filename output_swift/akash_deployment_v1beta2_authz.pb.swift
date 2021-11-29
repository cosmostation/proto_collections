// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: akash/deployment/v1beta2/authz.proto
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

/// DepositDeploymentAuthorization allows the grantee to deposit up to spend_limit coins from
/// the granter's account for a deployment.
struct Akash_Deployment_V1beta2_DepositDeploymentAuthorization {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// SpendLimit is the amount the grantee is authorized to spend from the granter's account for
  /// the purpose of deployment.
  var spendLimit: Cosmos_Base_V1beta1_Coin {
    get {return _spendLimit ?? Cosmos_Base_V1beta1_Coin()}
    set {_spendLimit = newValue}
  }
  /// Returns true if `spendLimit` has been explicitly set.
  var hasSpendLimit: Bool {return self._spendLimit != nil}
  /// Clears the value of `spendLimit`. Subsequent reads from it will return its default value.
  mutating func clearSpendLimit() {self._spendLimit = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _spendLimit: Cosmos_Base_V1beta1_Coin? = nil
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "akash.deployment.v1beta2"

extension Akash_Deployment_V1beta2_DepositDeploymentAuthorization: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".DepositDeploymentAuthorization"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "spend_limit"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._spendLimit) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if let v = self._spendLimit {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Akash_Deployment_V1beta2_DepositDeploymentAuthorization, rhs: Akash_Deployment_V1beta2_DepositDeploymentAuthorization) -> Bool {
    if lhs._spendLimit != rhs._spendLimit {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
