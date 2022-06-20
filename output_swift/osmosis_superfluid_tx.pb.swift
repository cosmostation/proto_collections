// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: osmosis/superfluid/tx.proto
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

struct Osmosis_Superfluid_MsgSuperfluidDelegate {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var sender: String = String()

  var lockID: UInt64 = 0

  var valAddr: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Osmosis_Superfluid_MsgSuperfluidDelegateResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Osmosis_Superfluid_MsgSuperfluidUndelegate {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var sender: String = String()

  var lockID: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Osmosis_Superfluid_MsgSuperfluidUndelegateResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Osmosis_Superfluid_MsgSuperfluidUnbondLock {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var sender: String = String()

  var lockID: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Osmosis_Superfluid_MsgSuperfluidUnbondLockResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgLockAndSuperfluidDelegate locks coins with the unbonding period duration,
/// and then does a superfluid lock from the newly created lockup, to the
/// specified validator addr.
struct Osmosis_Superfluid_MsgLockAndSuperfluidDelegate {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var sender: String = String()

  var coins: [Cosmos_Base_V1beta1_Coin] = []

  var valAddr: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Osmosis_Superfluid_MsgLockAndSuperfluidDelegateResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgUnPoolWhitelistedPool Unpools every lock the sender has, that is
/// associated with pool pool_id. If pool_id is not approved for unpooling by
/// governance, this is a no-op. Unpooling takes the locked gamm shares, and runs
/// "ExitPool" on it, to get the constituent tokens. e.g. z gamm/pool/1 tokens
/// ExitPools into constituent tokens x uatom, y uosmo. Then it creates a new
/// lock for every constituent token, with the duration associated with the lock.
/// If the lock was unbonding, the new lockup durations should be the time left
/// until unbond completion.
struct Osmosis_Superfluid_MsgUnPoolWhitelistedPool {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var sender: String = String()

  var poolID: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Osmosis_Superfluid_MsgUnPoolWhitelistedPoolResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var exitedLockIds: [UInt64] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "osmosis.superfluid"

extension Osmosis_Superfluid_MsgSuperfluidDelegate: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSuperfluidDelegate"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "sender"),
    2: .standard(proto: "lock_id"),
    3: .standard(proto: "val_addr"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.sender) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.lockID) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.valAddr) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.sender.isEmpty {
      try visitor.visitSingularStringField(value: self.sender, fieldNumber: 1)
    }
    if self.lockID != 0 {
      try visitor.visitSingularUInt64Field(value: self.lockID, fieldNumber: 2)
    }
    if !self.valAddr.isEmpty {
      try visitor.visitSingularStringField(value: self.valAddr, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Superfluid_MsgSuperfluidDelegate, rhs: Osmosis_Superfluid_MsgSuperfluidDelegate) -> Bool {
    if lhs.sender != rhs.sender {return false}
    if lhs.lockID != rhs.lockID {return false}
    if lhs.valAddr != rhs.valAddr {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Superfluid_MsgSuperfluidDelegateResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSuperfluidDelegateResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Superfluid_MsgSuperfluidDelegateResponse, rhs: Osmosis_Superfluid_MsgSuperfluidDelegateResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Superfluid_MsgSuperfluidUndelegate: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSuperfluidUndelegate"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "sender"),
    2: .standard(proto: "lock_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.sender) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.lockID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.sender.isEmpty {
      try visitor.visitSingularStringField(value: self.sender, fieldNumber: 1)
    }
    if self.lockID != 0 {
      try visitor.visitSingularUInt64Field(value: self.lockID, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Superfluid_MsgSuperfluidUndelegate, rhs: Osmosis_Superfluid_MsgSuperfluidUndelegate) -> Bool {
    if lhs.sender != rhs.sender {return false}
    if lhs.lockID != rhs.lockID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Superfluid_MsgSuperfluidUndelegateResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSuperfluidUndelegateResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Superfluid_MsgSuperfluidUndelegateResponse, rhs: Osmosis_Superfluid_MsgSuperfluidUndelegateResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Superfluid_MsgSuperfluidUnbondLock: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSuperfluidUnbondLock"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "sender"),
    2: .standard(proto: "lock_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.sender) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.lockID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.sender.isEmpty {
      try visitor.visitSingularStringField(value: self.sender, fieldNumber: 1)
    }
    if self.lockID != 0 {
      try visitor.visitSingularUInt64Field(value: self.lockID, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Superfluid_MsgSuperfluidUnbondLock, rhs: Osmosis_Superfluid_MsgSuperfluidUnbondLock) -> Bool {
    if lhs.sender != rhs.sender {return false}
    if lhs.lockID != rhs.lockID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Superfluid_MsgSuperfluidUnbondLockResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSuperfluidUnbondLockResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Superfluid_MsgSuperfluidUnbondLockResponse, rhs: Osmosis_Superfluid_MsgSuperfluidUnbondLockResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Superfluid_MsgLockAndSuperfluidDelegate: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgLockAndSuperfluidDelegate"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "sender"),
    2: .same(proto: "coins"),
    3: .standard(proto: "val_addr"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.sender) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.coins) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.valAddr) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.sender.isEmpty {
      try visitor.visitSingularStringField(value: self.sender, fieldNumber: 1)
    }
    if !self.coins.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.coins, fieldNumber: 2)
    }
    if !self.valAddr.isEmpty {
      try visitor.visitSingularStringField(value: self.valAddr, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Superfluid_MsgLockAndSuperfluidDelegate, rhs: Osmosis_Superfluid_MsgLockAndSuperfluidDelegate) -> Bool {
    if lhs.sender != rhs.sender {return false}
    if lhs.coins != rhs.coins {return false}
    if lhs.valAddr != rhs.valAddr {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Superfluid_MsgLockAndSuperfluidDelegateResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgLockAndSuperfluidDelegateResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "ID"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Superfluid_MsgLockAndSuperfluidDelegateResponse, rhs: Osmosis_Superfluid_MsgLockAndSuperfluidDelegateResponse) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Superfluid_MsgUnPoolWhitelistedPool: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgUnPoolWhitelistedPool"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "sender"),
    2: .standard(proto: "pool_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.sender) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.poolID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.sender.isEmpty {
      try visitor.visitSingularStringField(value: self.sender, fieldNumber: 1)
    }
    if self.poolID != 0 {
      try visitor.visitSingularUInt64Field(value: self.poolID, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Superfluid_MsgUnPoolWhitelistedPool, rhs: Osmosis_Superfluid_MsgUnPoolWhitelistedPool) -> Bool {
    if lhs.sender != rhs.sender {return false}
    if lhs.poolID != rhs.poolID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Superfluid_MsgUnPoolWhitelistedPoolResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgUnPoolWhitelistedPoolResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "exited_lock_ids"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedUInt64Field(value: &self.exitedLockIds) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.exitedLockIds.isEmpty {
      try visitor.visitPackedUInt64Field(value: self.exitedLockIds, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Superfluid_MsgUnPoolWhitelistedPoolResponse, rhs: Osmosis_Superfluid_MsgUnPoolWhitelistedPoolResponse) -> Bool {
    if lhs.exitedLockIds != rhs.exitedLockIds {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
