// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: shentu/auth/v1alpha1/vesting.proto
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

/// ManualVestingAccount implements the VestingAccount interface.
struct Cosmos_Auth_V1alpha1_ManualVestingAccount {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var baseVestingAccount: Cosmos_Vesting_V1beta1_BaseVestingAccount {
    get {return _baseVestingAccount ?? Cosmos_Vesting_V1beta1_BaseVestingAccount()}
    set {_baseVestingAccount = newValue}
  }
  /// Returns true if `baseVestingAccount` has been explicitly set.
  var hasBaseVestingAccount: Bool {return self._baseVestingAccount != nil}
  /// Clears the value of `baseVestingAccount`. Subsequent reads from it will return its default value.
  mutating func clearBaseVestingAccount() {self._baseVestingAccount = nil}

  var vestedCoins: [Cosmos_Base_V1beta1_Coin] = []

  var unlocker: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _baseVestingAccount: Cosmos_Vesting_V1beta1_BaseVestingAccount? = nil
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "cosmos.auth.v1alpha1"

extension Cosmos_Auth_V1alpha1_ManualVestingAccount: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ManualVestingAccount"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "base_vesting_account"),
    2: .standard(proto: "vested_coins"),
    3: .same(proto: "unlocker"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._baseVestingAccount) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.vestedCoins) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.unlocker) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if let v = self._baseVestingAccount {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    }
    if !self.vestedCoins.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.vestedCoins, fieldNumber: 2)
    }
    if !self.unlocker.isEmpty {
      try visitor.visitSingularStringField(value: self.unlocker, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Auth_V1alpha1_ManualVestingAccount, rhs: Cosmos_Auth_V1alpha1_ManualVestingAccount) -> Bool {
    if lhs._baseVestingAccount != rhs._baseVestingAccount {return false}
    if lhs.vestedCoins != rhs.vestedCoins {return false}
    if lhs.unlocker != rhs.unlocker {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
