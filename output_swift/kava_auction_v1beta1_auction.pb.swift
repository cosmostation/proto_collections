// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: kava/auction/v1beta1/auction.proto
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

/// BaseAuction defines common attributes of all auctions
struct Kava_Auction_V1beta1_BaseAuction {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: UInt64 = 0

  var initiator: String = String()

  var lot: Cosmos_Base_V1beta1_Coin {
    get {return _lot ?? Cosmos_Base_V1beta1_Coin()}
    set {_lot = newValue}
  }
  /// Returns true if `lot` has been explicitly set.
  var hasLot: Bool {return self._lot != nil}
  /// Clears the value of `lot`. Subsequent reads from it will return its default value.
  mutating func clearLot() {self._lot = nil}

  var bidder: Data = Data()

  var bid: Cosmos_Base_V1beta1_Coin {
    get {return _bid ?? Cosmos_Base_V1beta1_Coin()}
    set {_bid = newValue}
  }
  /// Returns true if `bid` has been explicitly set.
  var hasBid: Bool {return self._bid != nil}
  /// Clears the value of `bid`. Subsequent reads from it will return its default value.
  mutating func clearBid() {self._bid = nil}

  var hasReceivedBids_p: Bool = false

  var endTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _endTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_endTime = newValue}
  }
  /// Returns true if `endTime` has been explicitly set.
  var hasEndTime: Bool {return self._endTime != nil}
  /// Clears the value of `endTime`. Subsequent reads from it will return its default value.
  mutating func clearEndTime() {self._endTime = nil}

  var maxEndTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _maxEndTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_maxEndTime = newValue}
  }
  /// Returns true if `maxEndTime` has been explicitly set.
  var hasMaxEndTime: Bool {return self._maxEndTime != nil}
  /// Clears the value of `maxEndTime`. Subsequent reads from it will return its default value.
  mutating func clearMaxEndTime() {self._maxEndTime = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _lot: Cosmos_Base_V1beta1_Coin? = nil
  fileprivate var _bid: Cosmos_Base_V1beta1_Coin? = nil
  fileprivate var _endTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
  fileprivate var _maxEndTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
}

/// SurplusAuction is a forward auction that burns what it receives from bids.
/// It is normally used to sell off excess pegged asset acquired by the CDP system.
struct Kava_Auction_V1beta1_SurplusAuction {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var baseAuction: Kava_Auction_V1beta1_BaseAuction {
    get {return _baseAuction ?? Kava_Auction_V1beta1_BaseAuction()}
    set {_baseAuction = newValue}
  }
  /// Returns true if `baseAuction` has been explicitly set.
  var hasBaseAuction: Bool {return self._baseAuction != nil}
  /// Clears the value of `baseAuction`. Subsequent reads from it will return its default value.
  mutating func clearBaseAuction() {self._baseAuction = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _baseAuction: Kava_Auction_V1beta1_BaseAuction? = nil
}

/// DebtAuction is a reverse auction that mints what it pays out.
/// It is normally used to acquire pegged asset to cover the CDP system's debts that were not covered by selling
/// collateral.
struct Kava_Auction_V1beta1_DebtAuction {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var baseAuction: Kava_Auction_V1beta1_BaseAuction {
    get {return _baseAuction ?? Kava_Auction_V1beta1_BaseAuction()}
    set {_baseAuction = newValue}
  }
  /// Returns true if `baseAuction` has been explicitly set.
  var hasBaseAuction: Bool {return self._baseAuction != nil}
  /// Clears the value of `baseAuction`. Subsequent reads from it will return its default value.
  mutating func clearBaseAuction() {self._baseAuction = nil}

  var correspondingDebt: Cosmos_Base_V1beta1_Coin {
    get {return _correspondingDebt ?? Cosmos_Base_V1beta1_Coin()}
    set {_correspondingDebt = newValue}
  }
  /// Returns true if `correspondingDebt` has been explicitly set.
  var hasCorrespondingDebt: Bool {return self._correspondingDebt != nil}
  /// Clears the value of `correspondingDebt`. Subsequent reads from it will return its default value.
  mutating func clearCorrespondingDebt() {self._correspondingDebt = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _baseAuction: Kava_Auction_V1beta1_BaseAuction? = nil
  fileprivate var _correspondingDebt: Cosmos_Base_V1beta1_Coin? = nil
}

/// CollateralAuction is a two phase auction.
/// Initially, in forward auction phase, bids can be placed up to a max bid.
/// Then it switches to a reverse auction phase, where the initial amount up for auction is bid down.
/// Unsold Lot is sent to LotReturns, being divided among the addresses by weight.
/// Collateral auctions are normally used to sell off collateral seized from CDPs.
struct Kava_Auction_V1beta1_CollateralAuction {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var baseAuction: Kava_Auction_V1beta1_BaseAuction {
    get {return _storage._baseAuction ?? Kava_Auction_V1beta1_BaseAuction()}
    set {_uniqueStorage()._baseAuction = newValue}
  }
  /// Returns true if `baseAuction` has been explicitly set.
  var hasBaseAuction: Bool {return _storage._baseAuction != nil}
  /// Clears the value of `baseAuction`. Subsequent reads from it will return its default value.
  mutating func clearBaseAuction() {_uniqueStorage()._baseAuction = nil}

  var correspondingDebt: Cosmos_Base_V1beta1_Coin {
    get {return _storage._correspondingDebt ?? Cosmos_Base_V1beta1_Coin()}
    set {_uniqueStorage()._correspondingDebt = newValue}
  }
  /// Returns true if `correspondingDebt` has been explicitly set.
  var hasCorrespondingDebt: Bool {return _storage._correspondingDebt != nil}
  /// Clears the value of `correspondingDebt`. Subsequent reads from it will return its default value.
  mutating func clearCorrespondingDebt() {_uniqueStorage()._correspondingDebt = nil}

  var maxBid: Cosmos_Base_V1beta1_Coin {
    get {return _storage._maxBid ?? Cosmos_Base_V1beta1_Coin()}
    set {_uniqueStorage()._maxBid = newValue}
  }
  /// Returns true if `maxBid` has been explicitly set.
  var hasMaxBid: Bool {return _storage._maxBid != nil}
  /// Clears the value of `maxBid`. Subsequent reads from it will return its default value.
  mutating func clearMaxBid() {_uniqueStorage()._maxBid = nil}

  var lotReturns: Kava_Auction_V1beta1_WeightedAddresses {
    get {return _storage._lotReturns ?? Kava_Auction_V1beta1_WeightedAddresses()}
    set {_uniqueStorage()._lotReturns = newValue}
  }
  /// Returns true if `lotReturns` has been explicitly set.
  var hasLotReturns: Bool {return _storage._lotReturns != nil}
  /// Clears the value of `lotReturns`. Subsequent reads from it will return its default value.
  mutating func clearLotReturns() {_uniqueStorage()._lotReturns = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

/// WeightedAddresses is a type for storing some addresses and associated weights.
struct Kava_Auction_V1beta1_WeightedAddresses {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var addresses: [Data] = []

  var weights: [Data] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "kava.auction.v1beta1"

extension Kava_Auction_V1beta1_BaseAuction: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".BaseAuction"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .same(proto: "initiator"),
    3: .same(proto: "lot"),
    4: .same(proto: "bidder"),
    5: .same(proto: "bid"),
    6: .standard(proto: "has_received_bids"),
    7: .standard(proto: "end_time"),
    8: .standard(proto: "max_end_time"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.initiator) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._lot) }()
      case 4: try { try decoder.decodeSingularBytesField(value: &self.bidder) }()
      case 5: try { try decoder.decodeSingularMessageField(value: &self._bid) }()
      case 6: try { try decoder.decodeSingularBoolField(value: &self.hasReceivedBids_p) }()
      case 7: try { try decoder.decodeSingularMessageField(value: &self._endTime) }()
      case 8: try { try decoder.decodeSingularMessageField(value: &self._maxEndTime) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 1)
    }
    if !self.initiator.isEmpty {
      try visitor.visitSingularStringField(value: self.initiator, fieldNumber: 2)
    }
    if let v = self._lot {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    }
    if !self.bidder.isEmpty {
      try visitor.visitSingularBytesField(value: self.bidder, fieldNumber: 4)
    }
    if let v = self._bid {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
    }
    if self.hasReceivedBids_p != false {
      try visitor.visitSingularBoolField(value: self.hasReceivedBids_p, fieldNumber: 6)
    }
    if let v = self._endTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 7)
    }
    if let v = self._maxEndTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 8)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kava_Auction_V1beta1_BaseAuction, rhs: Kava_Auction_V1beta1_BaseAuction) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.initiator != rhs.initiator {return false}
    if lhs._lot != rhs._lot {return false}
    if lhs.bidder != rhs.bidder {return false}
    if lhs._bid != rhs._bid {return false}
    if lhs.hasReceivedBids_p != rhs.hasReceivedBids_p {return false}
    if lhs._endTime != rhs._endTime {return false}
    if lhs._maxEndTime != rhs._maxEndTime {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kava_Auction_V1beta1_SurplusAuction: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".SurplusAuction"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "base_auction"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._baseAuction) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if let v = self._baseAuction {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kava_Auction_V1beta1_SurplusAuction, rhs: Kava_Auction_V1beta1_SurplusAuction) -> Bool {
    if lhs._baseAuction != rhs._baseAuction {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kava_Auction_V1beta1_DebtAuction: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".DebtAuction"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "base_auction"),
    2: .standard(proto: "corresponding_debt"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._baseAuction) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._correspondingDebt) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if let v = self._baseAuction {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    }
    if let v = self._correspondingDebt {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kava_Auction_V1beta1_DebtAuction, rhs: Kava_Auction_V1beta1_DebtAuction) -> Bool {
    if lhs._baseAuction != rhs._baseAuction {return false}
    if lhs._correspondingDebt != rhs._correspondingDebt {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kava_Auction_V1beta1_CollateralAuction: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".CollateralAuction"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "base_auction"),
    2: .standard(proto: "corresponding_debt"),
    3: .standard(proto: "max_bid"),
    4: .standard(proto: "lot_returns"),
  ]

  fileprivate class _StorageClass {
    var _baseAuction: Kava_Auction_V1beta1_BaseAuction? = nil
    var _correspondingDebt: Cosmos_Base_V1beta1_Coin? = nil
    var _maxBid: Cosmos_Base_V1beta1_Coin? = nil
    var _lotReturns: Kava_Auction_V1beta1_WeightedAddresses? = nil

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _baseAuction = source._baseAuction
      _correspondingDebt = source._correspondingDebt
      _maxBid = source._maxBid
      _lotReturns = source._lotReturns
    }
  }

  fileprivate mutating func _uniqueStorage() -> _StorageClass {
    if !isKnownUniquelyReferenced(&_storage) {
      _storage = _StorageClass(copying: _storage)
    }
    return _storage
  }

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    _ = _uniqueStorage()
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      while let fieldNumber = try decoder.nextFieldNumber() {
        // The use of inline closures is to circumvent an issue where the compiler
        // allocates stack space for every case branch when no optimizations are
        // enabled. https://github.com/apple/swift-protobuf/issues/1034
        switch fieldNumber {
        case 1: try { try decoder.decodeSingularMessageField(value: &_storage._baseAuction) }()
        case 2: try { try decoder.decodeSingularMessageField(value: &_storage._correspondingDebt) }()
        case 3: try { try decoder.decodeSingularMessageField(value: &_storage._maxBid) }()
        case 4: try { try decoder.decodeSingularMessageField(value: &_storage._lotReturns) }()
        default: break
        }
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      if let v = _storage._baseAuction {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
      }
      if let v = _storage._correspondingDebt {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
      }
      if let v = _storage._maxBid {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
      }
      if let v = _storage._lotReturns {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
      }
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kava_Auction_V1beta1_CollateralAuction, rhs: Kava_Auction_V1beta1_CollateralAuction) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._baseAuction != rhs_storage._baseAuction {return false}
        if _storage._correspondingDebt != rhs_storage._correspondingDebt {return false}
        if _storage._maxBid != rhs_storage._maxBid {return false}
        if _storage._lotReturns != rhs_storage._lotReturns {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kava_Auction_V1beta1_WeightedAddresses: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".WeightedAddresses"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "addresses"),
    2: .same(proto: "weights"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedBytesField(value: &self.addresses) }()
      case 2: try { try decoder.decodeRepeatedBytesField(value: &self.weights) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.addresses.isEmpty {
      try visitor.visitRepeatedBytesField(value: self.addresses, fieldNumber: 1)
    }
    if !self.weights.isEmpty {
      try visitor.visitRepeatedBytesField(value: self.weights, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kava_Auction_V1beta1_WeightedAddresses, rhs: Kava_Auction_V1beta1_WeightedAddresses) -> Bool {
    if lhs.addresses != rhs.addresses {return false}
    if lhs.weights != rhs.weights {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
