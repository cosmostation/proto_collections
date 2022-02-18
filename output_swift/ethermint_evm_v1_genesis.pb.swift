// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: ethermint/evm/v1/genesis.proto
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

/// GenesisState defines the evm module's genesis state.
struct Ethermint_Evm_V1_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// accounts is an array containing the ethereum genesis accounts.
  var accounts: [Ethermint_Evm_V1_GenesisAccount] = []

  /// params defines all the paramaters of the module.
  var params: Ethermint_Evm_V1_Params {
    get {return _params ?? Ethermint_Evm_V1_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  var txsLogs: [Ethermint_Evm_V1_TransactionLogs] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _params: Ethermint_Evm_V1_Params? = nil
}

/// GenesisAccount defines an account to be initialized in the genesis state.
/// Its main difference between with Geth's GenesisAccount is that it uses a
/// custom storage type and that it doesn't contain the private key field.
struct Ethermint_Evm_V1_GenesisAccount {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// address defines an ethereum hex formated address of an account
  var address: String = String()

  /// code defines the hex bytes of the account code.
  var code: String = String()

  /// storage defines the set of state key values for the account.
  var storage: [Ethermint_Evm_V1_State] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "ethermint.evm.v1"

extension Ethermint_Evm_V1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "accounts"),
    3: .same(proto: "params"),
    4: .standard(proto: "txs_logs"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.accounts) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._params) }()
      case 4: try { try decoder.decodeRepeatedMessageField(value: &self.txsLogs) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.accounts.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.accounts, fieldNumber: 1)
    }
    if let v = self._params {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    }
    if !self.txsLogs.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.txsLogs, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ethermint_Evm_V1_GenesisState, rhs: Ethermint_Evm_V1_GenesisState) -> Bool {
    if lhs.accounts != rhs.accounts {return false}
    if lhs._params != rhs._params {return false}
    if lhs.txsLogs != rhs.txsLogs {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ethermint_Evm_V1_GenesisAccount: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisAccount"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "address"),
    2: .same(proto: "code"),
    3: .same(proto: "storage"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.address) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.code) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.storage) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.address.isEmpty {
      try visitor.visitSingularStringField(value: self.address, fieldNumber: 1)
    }
    if !self.code.isEmpty {
      try visitor.visitSingularStringField(value: self.code, fieldNumber: 2)
    }
    if !self.storage.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.storage, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ethermint_Evm_V1_GenesisAccount, rhs: Ethermint_Evm_V1_GenesisAccount) -> Bool {
    if lhs.address != rhs.address {return false}
    if lhs.code != rhs.code {return false}
    if lhs.storage != rhs.storage {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
