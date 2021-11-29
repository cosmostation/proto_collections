// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: shentu/shield/v1alpha1/shield.proto
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

/// MixedCoins defines the struct for mixed coins with native and foreign coins.
struct Shentu_Shield_V1alpha1_MixedCoins {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var native: [Cosmos_Base_V1beta1_Coin] = []

  var foreign: [Cosmos_Base_V1beta1_Coin] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MixedDecCoins defines the struct for mixed coins in decimal with native and foreign decimal coins.
struct Shentu_Shield_V1alpha1_MixedDecCoins {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var native: [Cosmos_Base_V1beta1_DecCoin] = []

  var foreign: [Cosmos_Base_V1beta1_DecCoin] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// Pool contains a shield project pool's data.
struct Shentu_Shield_V1alpha1_Pool {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: UInt64 = 0

  var description_p: String = String()

  var sponsor: String = String()

  var sponsorAddr: String = String()

  var shieldLimit: String = String()

  var active: Bool = false

  var shield: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// Purchase record an individual purchase.
struct Shentu_Shield_V1alpha1_Purchase {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// PurchaseID is the purchase_id.
  var purchaseID: UInt64 = 0

  /// ProtectionEndTime is the time when the protection of the shield ends.
  var protectionEndTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _protectionEndTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_protectionEndTime = newValue}
  }
  /// Returns true if `protectionEndTime` has been explicitly set.
  var hasProtectionEndTime: Bool {return self._protectionEndTime != nil}
  /// Clears the value of `protectionEndTime`. Subsequent reads from it will return its default value.
  mutating func clearProtectionEndTime() {self._protectionEndTime = nil}

  /// DeletionTime is the time when the purchase should be deleted.
  var deletionTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _deletionTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_deletionTime = newValue}
  }
  /// Returns true if `deletionTime` has been explicitly set.
  var hasDeletionTime: Bool {return self._deletionTime != nil}
  /// Clears the value of `deletionTime`. Subsequent reads from it will return its default value.
  mutating func clearDeletionTime() {self._deletionTime = nil}

  /// Description is the information about the protected asset.
  var description_p: String = String()

  /// Shield is the unused amount of shield purchased.
  var shield: String = String()

  /// ServiceFees is the service fees paid by this purchase.
  var serviceFees: Shentu_Shield_V1alpha1_MixedDecCoins {
    get {return _serviceFees ?? Shentu_Shield_V1alpha1_MixedDecCoins()}
    set {_serviceFees = newValue}
  }
  /// Returns true if `serviceFees` has been explicitly set.
  var hasServiceFees: Bool {return self._serviceFees != nil}
  /// Clears the value of `serviceFees`. Subsequent reads from it will return its default value.
  mutating func clearServiceFees() {self._serviceFees = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _protectionEndTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
  fileprivate var _deletionTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
  fileprivate var _serviceFees: Shentu_Shield_V1alpha1_MixedDecCoins? = nil
}

/// PurchaseList is a collection of purchase.
struct Shentu_Shield_V1alpha1_PurchaseList {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// PoolID is the id of the shield of the purchase.
  var poolID: UInt64 = 0

  /// Purchaser is the address making the purchase.
  var purchaser: String = String()

  /// Entries stores all purchases by the purchaser in the pool.
  var entries: [Shentu_Shield_V1alpha1_Purchase] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// Provider tracks total delegation, total collateral, and rewards of a provider.
struct Shentu_Shield_V1alpha1_Provider {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Address is the address of the provider.
  var address: String = String()

  /// DelegationBonded is the amount of bonded delegation.
  var delegationBonded: String = String()

  /// Collateral is amount of all collaterals for the provider, including
  /// those in withdraw queue but excluding those currently locked, in all
  /// pools.
  var collateral: String = String()

  /// TotalLocked is the amount locked for pending claims.
  var totalLocked: String = String()

  /// Withdrawing is the amount of collateral in withdraw queues.
  var withdrawing: String = String()

  /// Rewards is the pooling rewards to be collected.
  var rewards: Shentu_Shield_V1alpha1_MixedDecCoins {
    get {return _rewards ?? Shentu_Shield_V1alpha1_MixedDecCoins()}
    set {_rewards = newValue}
  }
  /// Returns true if `rewards` has been explicitly set.
  var hasRewards: Bool {return self._rewards != nil}
  /// Clears the value of `rewards`. Subsequent reads from it will return its default value.
  mutating func clearRewards() {self._rewards = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _rewards: Shentu_Shield_V1alpha1_MixedDecCoins? = nil
}

/// PoolPurchase is a pair of pool id and purchaser.
struct Shentu_Shield_V1alpha1_PoolPurchaser {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// PoolID is the id of the shield pool.
  var poolID: UInt64 = 0

  /// Purchaser is the chain address of the purchaser.
  var purchaser: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// PoolPurchaserPairs defines an array of PoolPurchaser objects.
struct Shentu_Shield_V1alpha1_PoolPurchaserPairs {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var pairs: [Shentu_Shield_V1alpha1_PoolPurchaser] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// Withdraw stores an ongoing withdraw of pool collateral.
struct Shentu_Shield_V1alpha1_Withdraw {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Address is the chain address of the provider withdrawing.    
  var address: String = String()

  /// Amount is the amount of withdraw.
  var amount: String = String()

  /// CompletionTime is the scheduled withdraw completion time.
  var completionTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _completionTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_completionTime = newValue}
  }
  /// Returns true if `completionTime` has been explicitly set.
  var hasCompletionTime: Bool {return self._completionTime != nil}
  /// Clears the value of `completionTime`. Subsequent reads from it will return its default value.
  mutating func clearCompletionTime() {self._completionTime = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _completionTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
}

/// Withdraws defines an array of Withdraw objects.
struct Shentu_Shield_V1alpha1_Withdraws {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var withdraws: [Shentu_Shield_V1alpha1_Withdraw] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Shentu_Shield_V1alpha1_ShieldStaking {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var poolID: UInt64 = 0

  var purchaser: String = String()

  var amount: String = String()

  var withdrawRequested: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Shentu_Shield_V1alpha1_LastUpdateTime {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var time: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _time ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_time = newValue}
  }
  /// Returns true if `time` has been explicitly set.
  var hasTime: Bool {return self._time != nil}
  /// Clears the value of `time`. Subsequent reads from it will return its default value.
  mutating func clearTime() {self._time = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _time: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
}

struct Shentu_Shield_V1alpha1_ShieldClaimProposal {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var proposalID: UInt64 = 0

  var poolID: UInt64 = 0

  var purchaseID: UInt64 = 0

  var loss: [Cosmos_Base_V1beta1_Coin] = []

  var evidence: String = String()

  var description_p: String = String()

  var proposer: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "shentu.shield.v1alpha1"

extension Shentu_Shield_V1alpha1_MixedCoins: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MixedCoins"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "native"),
    2: .same(proto: "foreign"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.native) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.foreign) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.native.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.native, fieldNumber: 1)
    }
    if !self.foreign.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.foreign, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Shield_V1alpha1_MixedCoins, rhs: Shentu_Shield_V1alpha1_MixedCoins) -> Bool {
    if lhs.native != rhs.native {return false}
    if lhs.foreign != rhs.foreign {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Shield_V1alpha1_MixedDecCoins: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MixedDecCoins"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "native"),
    2: .same(proto: "foreign"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.native) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.foreign) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.native.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.native, fieldNumber: 1)
    }
    if !self.foreign.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.foreign, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Shield_V1alpha1_MixedDecCoins, rhs: Shentu_Shield_V1alpha1_MixedDecCoins) -> Bool {
    if lhs.native != rhs.native {return false}
    if lhs.foreign != rhs.foreign {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Shield_V1alpha1_Pool: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Pool"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .same(proto: "description"),
    3: .same(proto: "sponsor"),
    4: .standard(proto: "sponsor_addr"),
    5: .standard(proto: "shield_limit"),
    6: .same(proto: "active"),
    7: .same(proto: "shield"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.sponsor) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.sponsorAddr) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.shieldLimit) }()
      case 6: try { try decoder.decodeSingularBoolField(value: &self.active) }()
      case 7: try { try decoder.decodeSingularStringField(value: &self.shield) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 1)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 2)
    }
    if !self.sponsor.isEmpty {
      try visitor.visitSingularStringField(value: self.sponsor, fieldNumber: 3)
    }
    if !self.sponsorAddr.isEmpty {
      try visitor.visitSingularStringField(value: self.sponsorAddr, fieldNumber: 4)
    }
    if !self.shieldLimit.isEmpty {
      try visitor.visitSingularStringField(value: self.shieldLimit, fieldNumber: 5)
    }
    if self.active != false {
      try visitor.visitSingularBoolField(value: self.active, fieldNumber: 6)
    }
    if !self.shield.isEmpty {
      try visitor.visitSingularStringField(value: self.shield, fieldNumber: 7)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Shield_V1alpha1_Pool, rhs: Shentu_Shield_V1alpha1_Pool) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.sponsor != rhs.sponsor {return false}
    if lhs.sponsorAddr != rhs.sponsorAddr {return false}
    if lhs.shieldLimit != rhs.shieldLimit {return false}
    if lhs.active != rhs.active {return false}
    if lhs.shield != rhs.shield {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Shield_V1alpha1_Purchase: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Purchase"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "purchase_id"),
    2: .standard(proto: "protection_end_time"),
    3: .standard(proto: "deletion_time"),
    4: .same(proto: "description"),
    5: .same(proto: "shield"),
    6: .standard(proto: "service_fees"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.purchaseID) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._protectionEndTime) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._deletionTime) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.shield) }()
      case 6: try { try decoder.decodeSingularMessageField(value: &self._serviceFees) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.purchaseID != 0 {
      try visitor.visitSingularUInt64Field(value: self.purchaseID, fieldNumber: 1)
    }
    if let v = self._protectionEndTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    }
    if let v = self._deletionTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 4)
    }
    if !self.shield.isEmpty {
      try visitor.visitSingularStringField(value: self.shield, fieldNumber: 5)
    }
    if let v = self._serviceFees {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 6)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Shield_V1alpha1_Purchase, rhs: Shentu_Shield_V1alpha1_Purchase) -> Bool {
    if lhs.purchaseID != rhs.purchaseID {return false}
    if lhs._protectionEndTime != rhs._protectionEndTime {return false}
    if lhs._deletionTime != rhs._deletionTime {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.shield != rhs.shield {return false}
    if lhs._serviceFees != rhs._serviceFees {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Shield_V1alpha1_PurchaseList: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".PurchaseList"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "pool_id"),
    2: .same(proto: "purchaser"),
    3: .same(proto: "entries"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.poolID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.purchaser) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.entries) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.poolID != 0 {
      try visitor.visitSingularUInt64Field(value: self.poolID, fieldNumber: 1)
    }
    if !self.purchaser.isEmpty {
      try visitor.visitSingularStringField(value: self.purchaser, fieldNumber: 2)
    }
    if !self.entries.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.entries, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Shield_V1alpha1_PurchaseList, rhs: Shentu_Shield_V1alpha1_PurchaseList) -> Bool {
    if lhs.poolID != rhs.poolID {return false}
    if lhs.purchaser != rhs.purchaser {return false}
    if lhs.entries != rhs.entries {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Shield_V1alpha1_Provider: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Provider"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "address"),
    2: .standard(proto: "delegation_bonded"),
    3: .same(proto: "collateral"),
    4: .standard(proto: "total_locked"),
    5: .same(proto: "withdrawing"),
    6: .same(proto: "rewards"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.address) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.delegationBonded) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.collateral) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.totalLocked) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.withdrawing) }()
      case 6: try { try decoder.decodeSingularMessageField(value: &self._rewards) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.address.isEmpty {
      try visitor.visitSingularStringField(value: self.address, fieldNumber: 1)
    }
    if !self.delegationBonded.isEmpty {
      try visitor.visitSingularStringField(value: self.delegationBonded, fieldNumber: 2)
    }
    if !self.collateral.isEmpty {
      try visitor.visitSingularStringField(value: self.collateral, fieldNumber: 3)
    }
    if !self.totalLocked.isEmpty {
      try visitor.visitSingularStringField(value: self.totalLocked, fieldNumber: 4)
    }
    if !self.withdrawing.isEmpty {
      try visitor.visitSingularStringField(value: self.withdrawing, fieldNumber: 5)
    }
    if let v = self._rewards {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 6)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Shield_V1alpha1_Provider, rhs: Shentu_Shield_V1alpha1_Provider) -> Bool {
    if lhs.address != rhs.address {return false}
    if lhs.delegationBonded != rhs.delegationBonded {return false}
    if lhs.collateral != rhs.collateral {return false}
    if lhs.totalLocked != rhs.totalLocked {return false}
    if lhs.withdrawing != rhs.withdrawing {return false}
    if lhs._rewards != rhs._rewards {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Shield_V1alpha1_PoolPurchaser: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".PoolPurchaser"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "pool_id"),
    2: .same(proto: "purchaser"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.poolID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.purchaser) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.poolID != 0 {
      try visitor.visitSingularUInt64Field(value: self.poolID, fieldNumber: 1)
    }
    if !self.purchaser.isEmpty {
      try visitor.visitSingularStringField(value: self.purchaser, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Shield_V1alpha1_PoolPurchaser, rhs: Shentu_Shield_V1alpha1_PoolPurchaser) -> Bool {
    if lhs.poolID != rhs.poolID {return false}
    if lhs.purchaser != rhs.purchaser {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Shield_V1alpha1_PoolPurchaserPairs: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".PoolPurchaserPairs"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "pairs"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.pairs) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.pairs.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.pairs, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Shield_V1alpha1_PoolPurchaserPairs, rhs: Shentu_Shield_V1alpha1_PoolPurchaserPairs) -> Bool {
    if lhs.pairs != rhs.pairs {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Shield_V1alpha1_Withdraw: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Withdraw"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "address"),
    2: .same(proto: "amount"),
    3: .standard(proto: "completion_time"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.address) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.amount) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._completionTime) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.address.isEmpty {
      try visitor.visitSingularStringField(value: self.address, fieldNumber: 1)
    }
    if !self.amount.isEmpty {
      try visitor.visitSingularStringField(value: self.amount, fieldNumber: 2)
    }
    if let v = self._completionTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Shield_V1alpha1_Withdraw, rhs: Shentu_Shield_V1alpha1_Withdraw) -> Bool {
    if lhs.address != rhs.address {return false}
    if lhs.amount != rhs.amount {return false}
    if lhs._completionTime != rhs._completionTime {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Shield_V1alpha1_Withdraws: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Withdraws"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "withdraws"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.withdraws) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.withdraws.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.withdraws, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Shield_V1alpha1_Withdraws, rhs: Shentu_Shield_V1alpha1_Withdraws) -> Bool {
    if lhs.withdraws != rhs.withdraws {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Shield_V1alpha1_ShieldStaking: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ShieldStaking"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "pool_id"),
    2: .same(proto: "purchaser"),
    3: .same(proto: "amount"),
    4: .standard(proto: "withdraw_requested"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.poolID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.purchaser) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.amount) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.withdrawRequested) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.poolID != 0 {
      try visitor.visitSingularUInt64Field(value: self.poolID, fieldNumber: 1)
    }
    if !self.purchaser.isEmpty {
      try visitor.visitSingularStringField(value: self.purchaser, fieldNumber: 2)
    }
    if !self.amount.isEmpty {
      try visitor.visitSingularStringField(value: self.amount, fieldNumber: 3)
    }
    if !self.withdrawRequested.isEmpty {
      try visitor.visitSingularStringField(value: self.withdrawRequested, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Shield_V1alpha1_ShieldStaking, rhs: Shentu_Shield_V1alpha1_ShieldStaking) -> Bool {
    if lhs.poolID != rhs.poolID {return false}
    if lhs.purchaser != rhs.purchaser {return false}
    if lhs.amount != rhs.amount {return false}
    if lhs.withdrawRequested != rhs.withdrawRequested {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Shield_V1alpha1_LastUpdateTime: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".LastUpdateTime"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "time"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._time) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if let v = self._time {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Shield_V1alpha1_LastUpdateTime, rhs: Shentu_Shield_V1alpha1_LastUpdateTime) -> Bool {
    if lhs._time != rhs._time {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Shield_V1alpha1_ShieldClaimProposal: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ShieldClaimProposal"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "proposal_id"),
    2: .standard(proto: "pool_id"),
    3: .standard(proto: "purchase_id"),
    4: .same(proto: "loss"),
    5: .same(proto: "evidence"),
    6: .same(proto: "description"),
    7: .same(proto: "proposer"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.proposalID) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.poolID) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.purchaseID) }()
      case 4: try { try decoder.decodeRepeatedMessageField(value: &self.loss) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.evidence) }()
      case 6: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      case 7: try { try decoder.decodeSingularStringField(value: &self.proposer) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.proposalID != 0 {
      try visitor.visitSingularUInt64Field(value: self.proposalID, fieldNumber: 1)
    }
    if self.poolID != 0 {
      try visitor.visitSingularUInt64Field(value: self.poolID, fieldNumber: 2)
    }
    if self.purchaseID != 0 {
      try visitor.visitSingularUInt64Field(value: self.purchaseID, fieldNumber: 3)
    }
    if !self.loss.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.loss, fieldNumber: 4)
    }
    if !self.evidence.isEmpty {
      try visitor.visitSingularStringField(value: self.evidence, fieldNumber: 5)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 6)
    }
    if !self.proposer.isEmpty {
      try visitor.visitSingularStringField(value: self.proposer, fieldNumber: 7)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Shield_V1alpha1_ShieldClaimProposal, rhs: Shentu_Shield_V1alpha1_ShieldClaimProposal) -> Bool {
    if lhs.proposalID != rhs.proposalID {return false}
    if lhs.poolID != rhs.poolID {return false}
    if lhs.purchaseID != rhs.purchaseID {return false}
    if lhs.loss != rhs.loss {return false}
    if lhs.evidence != rhs.evidence {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.proposer != rhs.proposer {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
