// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: iris_mod/htlc/htlc.proto
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

/// HTLCState defines the state of an HTLC
enum Irismod_Htlc_HTLCState: SwiftProtobuf.Enum {
  typealias RawValue = Int

  /// HTLC_STATE_OPEN defines an open state.
  case `open` // = 0

  /// HTLC_STATE_COMPLETED defines a completed state.
  case completed // = 1

  /// HTLC_STATE_REFUNDED defines a refunded state.
  case refunded // = 2
  case UNRECOGNIZED(Int)

  init() {
    self = .open
  }

  init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .open
    case 1: self = .completed
    case 2: self = .refunded
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  var rawValue: Int {
    switch self {
    case .open: return 0
    case .completed: return 1
    case .refunded: return 2
    case .UNRECOGNIZED(let i): return i
    }
  }

}

#if swift(>=4.2)

extension Irismod_Htlc_HTLCState: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [Irismod_Htlc_HTLCState] = [
    .open,
    .completed,
    .refunded,
  ]
}

#endif  // swift(>=4.2)

/// SwapDirection defines the direction of an HTLT
enum Irismod_Htlc_SwapDirection: SwiftProtobuf.Enum {
  typealias RawValue = Int

  /// NONE defines an htlt none direction.
  case none // = 0

  /// INCOMING defines an htlt incoming direction.
  case incoming // = 1

  /// OUTGOING defines an htlt outgoing direction.
  case outgoing // = 2
  case UNRECOGNIZED(Int)

  init() {
    self = .none
  }

  init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .none
    case 1: self = .incoming
    case 2: self = .outgoing
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  var rawValue: Int {
    switch self {
    case .none: return 0
    case .incoming: return 1
    case .outgoing: return 2
    case .UNRECOGNIZED(let i): return i
    }
  }

}

#if swift(>=4.2)

extension Irismod_Htlc_SwapDirection: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [Irismod_Htlc_SwapDirection] = [
    .none,
    .incoming,
    .outgoing,
  ]
}

#endif  // swift(>=4.2)

/// HTLC defines the struct of an HTLC
struct Irismod_Htlc_HTLC {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: String = String()

  var sender: String = String()

  var to: String = String()

  var receiverOnOtherChain: String = String()

  var senderOnOtherChain: String = String()

  var amount: [Cosmos_Base_V1beta1_Coin] = []

  var hashLock: String = String()

  var secret: String = String()

  var timestamp: UInt64 = 0

  var expirationHeight: UInt64 = 0

  var state: Irismod_Htlc_HTLCState = .open

  var closedBlock: UInt64 = 0

  var transfer: Bool = false

  var direction: Irismod_Htlc_SwapDirection = .none

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Irismod_Htlc_AssetSupply {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var incomingSupply: Cosmos_Base_V1beta1_Coin {
    get {return _incomingSupply ?? Cosmos_Base_V1beta1_Coin()}
    set {_incomingSupply = newValue}
  }
  /// Returns true if `incomingSupply` has been explicitly set.
  var hasIncomingSupply: Bool {return self._incomingSupply != nil}
  /// Clears the value of `incomingSupply`. Subsequent reads from it will return its default value.
  mutating func clearIncomingSupply() {self._incomingSupply = nil}

  var outgoingSupply: Cosmos_Base_V1beta1_Coin {
    get {return _outgoingSupply ?? Cosmos_Base_V1beta1_Coin()}
    set {_outgoingSupply = newValue}
  }
  /// Returns true if `outgoingSupply` has been explicitly set.
  var hasOutgoingSupply: Bool {return self._outgoingSupply != nil}
  /// Clears the value of `outgoingSupply`. Subsequent reads from it will return its default value.
  mutating func clearOutgoingSupply() {self._outgoingSupply = nil}

  var currentSupply: Cosmos_Base_V1beta1_Coin {
    get {return _currentSupply ?? Cosmos_Base_V1beta1_Coin()}
    set {_currentSupply = newValue}
  }
  /// Returns true if `currentSupply` has been explicitly set.
  var hasCurrentSupply: Bool {return self._currentSupply != nil}
  /// Clears the value of `currentSupply`. Subsequent reads from it will return its default value.
  mutating func clearCurrentSupply() {self._currentSupply = nil}

  var timeLimitedCurrentSupply: Cosmos_Base_V1beta1_Coin {
    get {return _timeLimitedCurrentSupply ?? Cosmos_Base_V1beta1_Coin()}
    set {_timeLimitedCurrentSupply = newValue}
  }
  /// Returns true if `timeLimitedCurrentSupply` has been explicitly set.
  var hasTimeLimitedCurrentSupply: Bool {return self._timeLimitedCurrentSupply != nil}
  /// Clears the value of `timeLimitedCurrentSupply`. Subsequent reads from it will return its default value.
  mutating func clearTimeLimitedCurrentSupply() {self._timeLimitedCurrentSupply = nil}

  var timeElapsed: SwiftProtobuf.Google_Protobuf_Duration {
    get {return _timeElapsed ?? SwiftProtobuf.Google_Protobuf_Duration()}
    set {_timeElapsed = newValue}
  }
  /// Returns true if `timeElapsed` has been explicitly set.
  var hasTimeElapsed: Bool {return self._timeElapsed != nil}
  /// Clears the value of `timeElapsed`. Subsequent reads from it will return its default value.
  mutating func clearTimeElapsed() {self._timeElapsed = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _incomingSupply: Cosmos_Base_V1beta1_Coin? = nil
  fileprivate var _outgoingSupply: Cosmos_Base_V1beta1_Coin? = nil
  fileprivate var _currentSupply: Cosmos_Base_V1beta1_Coin? = nil
  fileprivate var _timeLimitedCurrentSupply: Cosmos_Base_V1beta1_Coin? = nil
  fileprivate var _timeElapsed: SwiftProtobuf.Google_Protobuf_Duration? = nil
}

/// Params defines token module's parameters
struct Irismod_Htlc_Params {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var assetParams: [Irismod_Htlc_AssetParam] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Irismod_Htlc_AssetParam {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// name of the asset
  var denom: String = String()

  /// asset supply limit
  var supplyLimit: Irismod_Htlc_SupplyLimit {
    get {return _supplyLimit ?? Irismod_Htlc_SupplyLimit()}
    set {_supplyLimit = newValue}
  }
  /// Returns true if `supplyLimit` has been explicitly set.
  var hasSupplyLimit: Bool {return self._supplyLimit != nil}
  /// Clears the value of `supplyLimit`. Subsequent reads from it will return its default value.
  mutating func clearSupplyLimit() {self._supplyLimit = nil}

  /// denotes if asset is available or paused
  var active: Bool = false

  /// the address of the relayer process
  var deputyAddress: String = String()

  /// the fixed fee charged by the relayer process for outgoing swaps
  var fixedFee: String = String()

  /// Minimum swap amount
  var minSwapAmount: String = String()

  /// Maximum swap amount
  var maxSwapAmount: String = String()

  /// Minimum swap block lock
  var minBlockLock: UInt64 = 0

  /// Maximum swap block lock
  var maxBlockLock: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _supplyLimit: Irismod_Htlc_SupplyLimit? = nil
}

struct Irismod_Htlc_SupplyLimit {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// the absolute supply limit for an asset
  var limit: String = String()

  /// boolean for if the supply is also limited by time
  var timeLimited: Bool = false

  /// the duration for which the supply time limit applies
  var timePeriod: SwiftProtobuf.Google_Protobuf_Duration {
    get {return _timePeriod ?? SwiftProtobuf.Google_Protobuf_Duration()}
    set {_timePeriod = newValue}
  }
  /// Returns true if `timePeriod` has been explicitly set.
  var hasTimePeriod: Bool {return self._timePeriod != nil}
  /// Clears the value of `timePeriod`. Subsequent reads from it will return its default value.
  mutating func clearTimePeriod() {self._timePeriod = nil}

  /// the supply limit for an asset for each time period
  var timeBasedLimit: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _timePeriod: SwiftProtobuf.Google_Protobuf_Duration? = nil
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "irismod.htlc"

extension Irismod_Htlc_HTLCState: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "HTLC_STATE_OPEN"),
    1: .same(proto: "HTLC_STATE_COMPLETED"),
    2: .same(proto: "HTLC_STATE_REFUNDED"),
  ]
}

extension Irismod_Htlc_SwapDirection: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "NONE"),
    1: .same(proto: "INCOMING"),
    2: .same(proto: "OUTGOING"),
  ]
}

extension Irismod_Htlc_HTLC: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".HTLC"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .same(proto: "sender"),
    3: .same(proto: "to"),
    4: .standard(proto: "receiver_on_other_chain"),
    5: .standard(proto: "sender_on_other_chain"),
    6: .same(proto: "amount"),
    7: .standard(proto: "hash_lock"),
    8: .same(proto: "secret"),
    9: .same(proto: "timestamp"),
    10: .standard(proto: "expiration_height"),
    11: .same(proto: "state"),
    12: .standard(proto: "closed_block"),
    13: .same(proto: "transfer"),
    14: .same(proto: "direction"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.id) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.sender) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.to) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.receiverOnOtherChain) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.senderOnOtherChain) }()
      case 6: try { try decoder.decodeRepeatedMessageField(value: &self.amount) }()
      case 7: try { try decoder.decodeSingularStringField(value: &self.hashLock) }()
      case 8: try { try decoder.decodeSingularStringField(value: &self.secret) }()
      case 9: try { try decoder.decodeSingularUInt64Field(value: &self.timestamp) }()
      case 10: try { try decoder.decodeSingularUInt64Field(value: &self.expirationHeight) }()
      case 11: try { try decoder.decodeSingularEnumField(value: &self.state) }()
      case 12: try { try decoder.decodeSingularUInt64Field(value: &self.closedBlock) }()
      case 13: try { try decoder.decodeSingularBoolField(value: &self.transfer) }()
      case 14: try { try decoder.decodeSingularEnumField(value: &self.direction) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.id.isEmpty {
      try visitor.visitSingularStringField(value: self.id, fieldNumber: 1)
    }
    if !self.sender.isEmpty {
      try visitor.visitSingularStringField(value: self.sender, fieldNumber: 2)
    }
    if !self.to.isEmpty {
      try visitor.visitSingularStringField(value: self.to, fieldNumber: 3)
    }
    if !self.receiverOnOtherChain.isEmpty {
      try visitor.visitSingularStringField(value: self.receiverOnOtherChain, fieldNumber: 4)
    }
    if !self.senderOnOtherChain.isEmpty {
      try visitor.visitSingularStringField(value: self.senderOnOtherChain, fieldNumber: 5)
    }
    if !self.amount.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.amount, fieldNumber: 6)
    }
    if !self.hashLock.isEmpty {
      try visitor.visitSingularStringField(value: self.hashLock, fieldNumber: 7)
    }
    if !self.secret.isEmpty {
      try visitor.visitSingularStringField(value: self.secret, fieldNumber: 8)
    }
    if self.timestamp != 0 {
      try visitor.visitSingularUInt64Field(value: self.timestamp, fieldNumber: 9)
    }
    if self.expirationHeight != 0 {
      try visitor.visitSingularUInt64Field(value: self.expirationHeight, fieldNumber: 10)
    }
    if self.state != .open {
      try visitor.visitSingularEnumField(value: self.state, fieldNumber: 11)
    }
    if self.closedBlock != 0 {
      try visitor.visitSingularUInt64Field(value: self.closedBlock, fieldNumber: 12)
    }
    if self.transfer != false {
      try visitor.visitSingularBoolField(value: self.transfer, fieldNumber: 13)
    }
    if self.direction != .none {
      try visitor.visitSingularEnumField(value: self.direction, fieldNumber: 14)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Irismod_Htlc_HTLC, rhs: Irismod_Htlc_HTLC) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.sender != rhs.sender {return false}
    if lhs.to != rhs.to {return false}
    if lhs.receiverOnOtherChain != rhs.receiverOnOtherChain {return false}
    if lhs.senderOnOtherChain != rhs.senderOnOtherChain {return false}
    if lhs.amount != rhs.amount {return false}
    if lhs.hashLock != rhs.hashLock {return false}
    if lhs.secret != rhs.secret {return false}
    if lhs.timestamp != rhs.timestamp {return false}
    if lhs.expirationHeight != rhs.expirationHeight {return false}
    if lhs.state != rhs.state {return false}
    if lhs.closedBlock != rhs.closedBlock {return false}
    if lhs.transfer != rhs.transfer {return false}
    if lhs.direction != rhs.direction {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Irismod_Htlc_AssetSupply: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".AssetSupply"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "incoming_supply"),
    2: .standard(proto: "outgoing_supply"),
    3: .standard(proto: "current_supply"),
    4: .standard(proto: "time_limited_current_supply"),
    5: .standard(proto: "time_elapsed"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._incomingSupply) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._outgoingSupply) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._currentSupply) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._timeLimitedCurrentSupply) }()
      case 5: try { try decoder.decodeSingularMessageField(value: &self._timeElapsed) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if let v = self._incomingSupply {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    }
    if let v = self._outgoingSupply {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    }
    if let v = self._currentSupply {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    }
    if let v = self._timeLimitedCurrentSupply {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    }
    if let v = self._timeElapsed {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Irismod_Htlc_AssetSupply, rhs: Irismod_Htlc_AssetSupply) -> Bool {
    if lhs._incomingSupply != rhs._incomingSupply {return false}
    if lhs._outgoingSupply != rhs._outgoingSupply {return false}
    if lhs._currentSupply != rhs._currentSupply {return false}
    if lhs._timeLimitedCurrentSupply != rhs._timeLimitedCurrentSupply {return false}
    if lhs._timeElapsed != rhs._timeElapsed {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Irismod_Htlc_Params: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Params"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "asset_params"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.assetParams) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.assetParams.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.assetParams, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Irismod_Htlc_Params, rhs: Irismod_Htlc_Params) -> Bool {
    if lhs.assetParams != rhs.assetParams {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Irismod_Htlc_AssetParam: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".AssetParam"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "denom"),
    2: .standard(proto: "supply_limit"),
    3: .same(proto: "active"),
    4: .standard(proto: "deputy_address"),
    5: .standard(proto: "fixed_fee"),
    6: .standard(proto: "min_swap_amount"),
    7: .standard(proto: "max_swap_amount"),
    8: .standard(proto: "min_block_lock"),
    9: .standard(proto: "max_block_lock"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._supplyLimit) }()
      case 3: try { try decoder.decodeSingularBoolField(value: &self.active) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.deputyAddress) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.fixedFee) }()
      case 6: try { try decoder.decodeSingularStringField(value: &self.minSwapAmount) }()
      case 7: try { try decoder.decodeSingularStringField(value: &self.maxSwapAmount) }()
      case 8: try { try decoder.decodeSingularUInt64Field(value: &self.minBlockLock) }()
      case 9: try { try decoder.decodeSingularUInt64Field(value: &self.maxBlockLock) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 1)
    }
    if let v = self._supplyLimit {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    }
    if self.active != false {
      try visitor.visitSingularBoolField(value: self.active, fieldNumber: 3)
    }
    if !self.deputyAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.deputyAddress, fieldNumber: 4)
    }
    if !self.fixedFee.isEmpty {
      try visitor.visitSingularStringField(value: self.fixedFee, fieldNumber: 5)
    }
    if !self.minSwapAmount.isEmpty {
      try visitor.visitSingularStringField(value: self.minSwapAmount, fieldNumber: 6)
    }
    if !self.maxSwapAmount.isEmpty {
      try visitor.visitSingularStringField(value: self.maxSwapAmount, fieldNumber: 7)
    }
    if self.minBlockLock != 0 {
      try visitor.visitSingularUInt64Field(value: self.minBlockLock, fieldNumber: 8)
    }
    if self.maxBlockLock != 0 {
      try visitor.visitSingularUInt64Field(value: self.maxBlockLock, fieldNumber: 9)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Irismod_Htlc_AssetParam, rhs: Irismod_Htlc_AssetParam) -> Bool {
    if lhs.denom != rhs.denom {return false}
    if lhs._supplyLimit != rhs._supplyLimit {return false}
    if lhs.active != rhs.active {return false}
    if lhs.deputyAddress != rhs.deputyAddress {return false}
    if lhs.fixedFee != rhs.fixedFee {return false}
    if lhs.minSwapAmount != rhs.minSwapAmount {return false}
    if lhs.maxSwapAmount != rhs.maxSwapAmount {return false}
    if lhs.minBlockLock != rhs.minBlockLock {return false}
    if lhs.maxBlockLock != rhs.maxBlockLock {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Irismod_Htlc_SupplyLimit: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".SupplyLimit"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "limit"),
    2: .standard(proto: "time_limited"),
    3: .standard(proto: "time_period"),
    4: .standard(proto: "time_based_limit"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.limit) }()
      case 2: try { try decoder.decodeSingularBoolField(value: &self.timeLimited) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._timePeriod) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.timeBasedLimit) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.limit.isEmpty {
      try visitor.visitSingularStringField(value: self.limit, fieldNumber: 1)
    }
    if self.timeLimited != false {
      try visitor.visitSingularBoolField(value: self.timeLimited, fieldNumber: 2)
    }
    if let v = self._timePeriod {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    }
    if !self.timeBasedLimit.isEmpty {
      try visitor.visitSingularStringField(value: self.timeBasedLimit, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Irismod_Htlc_SupplyLimit, rhs: Irismod_Htlc_SupplyLimit) -> Bool {
    if lhs.limit != rhs.limit {return false}
    if lhs.timeLimited != rhs.timeLimited {return false}
    if lhs._timePeriod != rhs._timePeriod {return false}
    if lhs.timeBasedLimit != rhs.timeBasedLimit {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}