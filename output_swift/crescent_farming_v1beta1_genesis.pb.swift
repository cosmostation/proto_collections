// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: crescent/farming/v1beta1/genesis.proto
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

/// GenesisState defines the farming module's genesis state.
struct Crescent_Farming_V1beta1_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// params defines all the parameters for the farming module
  var params: Crescent_Farming_V1beta1_Params {
    get {return _storage._params ?? Crescent_Farming_V1beta1_Params()}
    set {_uniqueStorage()._params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return _storage._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {_uniqueStorage()._params = nil}

  var globalPlanID: UInt64 {
    get {return _storage._globalPlanID}
    set {_uniqueStorage()._globalPlanID = newValue}
  }

  /// plan_records defines the plan records used for genesis state
  var planRecords: [Crescent_Farming_V1beta1_PlanRecord] {
    get {return _storage._planRecords}
    set {_uniqueStorage()._planRecords = newValue}
  }

  var stakingRecords: [Crescent_Farming_V1beta1_StakingRecord] {
    get {return _storage._stakingRecords}
    set {_uniqueStorage()._stakingRecords = newValue}
  }

  var queuedStakingRecords: [Crescent_Farming_V1beta1_QueuedStakingRecord] {
    get {return _storage._queuedStakingRecords}
    set {_uniqueStorage()._queuedStakingRecords = newValue}
  }

  var historicalRewardsRecords: [Crescent_Farming_V1beta1_HistoricalRewardsRecord] {
    get {return _storage._historicalRewardsRecords}
    set {_uniqueStorage()._historicalRewardsRecords = newValue}
  }

  var outstandingRewardsRecords: [Crescent_Farming_V1beta1_OutstandingRewardsRecord] {
    get {return _storage._outstandingRewardsRecords}
    set {_uniqueStorage()._outstandingRewardsRecords = newValue}
  }

  var currentEpochRecords: [Crescent_Farming_V1beta1_CurrentEpochRecord] {
    get {return _storage._currentEpochRecords}
    set {_uniqueStorage()._currentEpochRecords = newValue}
  }

  var totalStakingsRecords: [Crescent_Farming_V1beta1_TotalStakingsRecord] {
    get {return _storage._totalStakingsRecords}
    set {_uniqueStorage()._totalStakingsRecords = newValue}
  }

  /// reward_pool_coins specifies balance of the reward pool to be distributed in the plans
  /// this param is needed for import/export validation
  var rewardPoolCoins: [Cosmos_Base_V1beta1_Coin] {
    get {return _storage._rewardPoolCoins}
    set {_uniqueStorage()._rewardPoolCoins = newValue}
  }

  /// last_epoch_time specifies the last executed epoch time of the plans
  var lastEpochTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _storage._lastEpochTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_uniqueStorage()._lastEpochTime = newValue}
  }
  /// Returns true if `lastEpochTime` has been explicitly set.
  var hasLastEpochTime: Bool {return _storage._lastEpochTime != nil}
  /// Clears the value of `lastEpochTime`. Subsequent reads from it will return its default value.
  mutating func clearLastEpochTime() {_uniqueStorage()._lastEpochTime = nil}

  /// current_epoch_days specifies the epoch used when allocating farming rewards in end blocker
  var currentEpochDays: UInt32 {
    get {return _storage._currentEpochDays}
    set {_uniqueStorage()._currentEpochDays = newValue}
  }

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

/// PlanRecord is used for import/export via genesis json.
struct Crescent_Farming_V1beta1_PlanRecord {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// plan specifies the plan interface; it can be FixedAmountPlan or RatioPlan
  var plan: Google_Protobuf2_Any {
    get {return _plan ?? Google_Protobuf2_Any()}
    set {_plan = newValue}
  }
  /// Returns true if `plan` has been explicitly set.
  var hasPlan: Bool {return self._plan != nil}
  /// Clears the value of `plan`. Subsequent reads from it will return its default value.
  mutating func clearPlan() {self._plan = nil}

  /// farming_pool_coins specifies balance of the farming pool for the plan
  /// this param is needed for import/export validation
  var farmingPoolCoins: [Cosmos_Base_V1beta1_Coin] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _plan: Google_Protobuf2_Any? = nil
}

/// StakingRecord is used for import/export via genesis json.
struct Crescent_Farming_V1beta1_StakingRecord {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var stakingCoinDenom: String = String()

  var farmer: String = String()

  var staking: Crescent_Farming_V1beta1_Staking {
    get {return _staking ?? Crescent_Farming_V1beta1_Staking()}
    set {_staking = newValue}
  }
  /// Returns true if `staking` has been explicitly set.
  var hasStaking: Bool {return self._staking != nil}
  /// Clears the value of `staking`. Subsequent reads from it will return its default value.
  mutating func clearStaking() {self._staking = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _staking: Crescent_Farming_V1beta1_Staking? = nil
}

/// QueuedStakingRecord is used for import/export via genesis json.
struct Crescent_Farming_V1beta1_QueuedStakingRecord {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var stakingCoinDenom: String = String()

  var farmer: String = String()

  var queuedStaking: Crescent_Farming_V1beta1_QueuedStaking {
    get {return _queuedStaking ?? Crescent_Farming_V1beta1_QueuedStaking()}
    set {_queuedStaking = newValue}
  }
  /// Returns true if `queuedStaking` has been explicitly set.
  var hasQueuedStaking: Bool {return self._queuedStaking != nil}
  /// Clears the value of `queuedStaking`. Subsequent reads from it will return its default value.
  mutating func clearQueuedStaking() {self._queuedStaking = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _queuedStaking: Crescent_Farming_V1beta1_QueuedStaking? = nil
}

/// TotalStakingsRecord is used for import/export via genesis json.
struct Crescent_Farming_V1beta1_TotalStakingsRecord {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var stakingCoinDenom: String = String()

  /// amount specifies total amount of the staking for the staking coin denom except queued staking
  var amount: String = String()

  /// staking_reserve_coins specifies balance of the staking reserve account where staking and queued staking for the
  /// staking coin denom is stored this param is needed for import/export validation
  var stakingReserveCoins: [Cosmos_Base_V1beta1_Coin] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// HistoricalRewardsRecord is used for import/export via genesis json.
struct Crescent_Farming_V1beta1_HistoricalRewardsRecord {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var stakingCoinDenom: String = String()

  var epoch: UInt64 = 0

  var historicalRewards: Crescent_Farming_V1beta1_HistoricalRewards {
    get {return _historicalRewards ?? Crescent_Farming_V1beta1_HistoricalRewards()}
    set {_historicalRewards = newValue}
  }
  /// Returns true if `historicalRewards` has been explicitly set.
  var hasHistoricalRewards: Bool {return self._historicalRewards != nil}
  /// Clears the value of `historicalRewards`. Subsequent reads from it will return its default value.
  mutating func clearHistoricalRewards() {self._historicalRewards = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _historicalRewards: Crescent_Farming_V1beta1_HistoricalRewards? = nil
}

/// OutstandingRewardsRecord is used for import/export via genesis json.
struct Crescent_Farming_V1beta1_OutstandingRewardsRecord {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var stakingCoinDenom: String = String()

  var outstandingRewards: Crescent_Farming_V1beta1_OutstandingRewards {
    get {return _outstandingRewards ?? Crescent_Farming_V1beta1_OutstandingRewards()}
    set {_outstandingRewards = newValue}
  }
  /// Returns true if `outstandingRewards` has been explicitly set.
  var hasOutstandingRewards: Bool {return self._outstandingRewards != nil}
  /// Clears the value of `outstandingRewards`. Subsequent reads from it will return its default value.
  mutating func clearOutstandingRewards() {self._outstandingRewards = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _outstandingRewards: Crescent_Farming_V1beta1_OutstandingRewards? = nil
}

/// CurrentEpochRecord is used for import/export via genesis json.
struct Crescent_Farming_V1beta1_CurrentEpochRecord {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var stakingCoinDenom: String = String()

  var currentEpoch: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "crescent.farming.v1beta1"

extension Crescent_Farming_V1beta1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "params"),
    2: .standard(proto: "global_plan_id"),
    3: .standard(proto: "plan_records"),
    4: .standard(proto: "staking_records"),
    5: .standard(proto: "queued_staking_records"),
    6: .standard(proto: "historical_rewards_records"),
    7: .standard(proto: "outstanding_rewards_records"),
    8: .standard(proto: "current_epoch_records"),
    9: .standard(proto: "total_stakings_records"),
    10: .standard(proto: "reward_pool_coins"),
    11: .standard(proto: "last_epoch_time"),
    12: .standard(proto: "current_epoch_days"),
  ]

  fileprivate class _StorageClass {
    var _params: Crescent_Farming_V1beta1_Params? = nil
    var _globalPlanID: UInt64 = 0
    var _planRecords: [Crescent_Farming_V1beta1_PlanRecord] = []
    var _stakingRecords: [Crescent_Farming_V1beta1_StakingRecord] = []
    var _queuedStakingRecords: [Crescent_Farming_V1beta1_QueuedStakingRecord] = []
    var _historicalRewardsRecords: [Crescent_Farming_V1beta1_HistoricalRewardsRecord] = []
    var _outstandingRewardsRecords: [Crescent_Farming_V1beta1_OutstandingRewardsRecord] = []
    var _currentEpochRecords: [Crescent_Farming_V1beta1_CurrentEpochRecord] = []
    var _totalStakingsRecords: [Crescent_Farming_V1beta1_TotalStakingsRecord] = []
    var _rewardPoolCoins: [Cosmos_Base_V1beta1_Coin] = []
    var _lastEpochTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
    var _currentEpochDays: UInt32 = 0

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _params = source._params
      _globalPlanID = source._globalPlanID
      _planRecords = source._planRecords
      _stakingRecords = source._stakingRecords
      _queuedStakingRecords = source._queuedStakingRecords
      _historicalRewardsRecords = source._historicalRewardsRecords
      _outstandingRewardsRecords = source._outstandingRewardsRecords
      _currentEpochRecords = source._currentEpochRecords
      _totalStakingsRecords = source._totalStakingsRecords
      _rewardPoolCoins = source._rewardPoolCoins
      _lastEpochTime = source._lastEpochTime
      _currentEpochDays = source._currentEpochDays
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
        case 1: try { try decoder.decodeSingularMessageField(value: &_storage._params) }()
        case 2: try { try decoder.decodeSingularUInt64Field(value: &_storage._globalPlanID) }()
        case 3: try { try decoder.decodeRepeatedMessageField(value: &_storage._planRecords) }()
        case 4: try { try decoder.decodeRepeatedMessageField(value: &_storage._stakingRecords) }()
        case 5: try { try decoder.decodeRepeatedMessageField(value: &_storage._queuedStakingRecords) }()
        case 6: try { try decoder.decodeRepeatedMessageField(value: &_storage._historicalRewardsRecords) }()
        case 7: try { try decoder.decodeRepeatedMessageField(value: &_storage._outstandingRewardsRecords) }()
        case 8: try { try decoder.decodeRepeatedMessageField(value: &_storage._currentEpochRecords) }()
        case 9: try { try decoder.decodeRepeatedMessageField(value: &_storage._totalStakingsRecords) }()
        case 10: try { try decoder.decodeRepeatedMessageField(value: &_storage._rewardPoolCoins) }()
        case 11: try { try decoder.decodeSingularMessageField(value: &_storage._lastEpochTime) }()
        case 12: try { try decoder.decodeSingularUInt32Field(value: &_storage._currentEpochDays) }()
        default: break
        }
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      if let v = _storage._params {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
      }
      if _storage._globalPlanID != 0 {
        try visitor.visitSingularUInt64Field(value: _storage._globalPlanID, fieldNumber: 2)
      }
      if !_storage._planRecords.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._planRecords, fieldNumber: 3)
      }
      if !_storage._stakingRecords.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._stakingRecords, fieldNumber: 4)
      }
      if !_storage._queuedStakingRecords.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._queuedStakingRecords, fieldNumber: 5)
      }
      if !_storage._historicalRewardsRecords.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._historicalRewardsRecords, fieldNumber: 6)
      }
      if !_storage._outstandingRewardsRecords.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._outstandingRewardsRecords, fieldNumber: 7)
      }
      if !_storage._currentEpochRecords.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._currentEpochRecords, fieldNumber: 8)
      }
      if !_storage._totalStakingsRecords.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._totalStakingsRecords, fieldNumber: 9)
      }
      if !_storage._rewardPoolCoins.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._rewardPoolCoins, fieldNumber: 10)
      }
      if let v = _storage._lastEpochTime {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 11)
      }
      if _storage._currentEpochDays != 0 {
        try visitor.visitSingularUInt32Field(value: _storage._currentEpochDays, fieldNumber: 12)
      }
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Crescent_Farming_V1beta1_GenesisState, rhs: Crescent_Farming_V1beta1_GenesisState) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._params != rhs_storage._params {return false}
        if _storage._globalPlanID != rhs_storage._globalPlanID {return false}
        if _storage._planRecords != rhs_storage._planRecords {return false}
        if _storage._stakingRecords != rhs_storage._stakingRecords {return false}
        if _storage._queuedStakingRecords != rhs_storage._queuedStakingRecords {return false}
        if _storage._historicalRewardsRecords != rhs_storage._historicalRewardsRecords {return false}
        if _storage._outstandingRewardsRecords != rhs_storage._outstandingRewardsRecords {return false}
        if _storage._currentEpochRecords != rhs_storage._currentEpochRecords {return false}
        if _storage._totalStakingsRecords != rhs_storage._totalStakingsRecords {return false}
        if _storage._rewardPoolCoins != rhs_storage._rewardPoolCoins {return false}
        if _storage._lastEpochTime != rhs_storage._lastEpochTime {return false}
        if _storage._currentEpochDays != rhs_storage._currentEpochDays {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Crescent_Farming_V1beta1_PlanRecord: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".PlanRecord"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "plan"),
    2: .standard(proto: "farming_pool_coins"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._plan) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.farmingPoolCoins) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if let v = self._plan {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    }
    if !self.farmingPoolCoins.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.farmingPoolCoins, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Crescent_Farming_V1beta1_PlanRecord, rhs: Crescent_Farming_V1beta1_PlanRecord) -> Bool {
    if lhs._plan != rhs._plan {return false}
    if lhs.farmingPoolCoins != rhs.farmingPoolCoins {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Crescent_Farming_V1beta1_StakingRecord: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".StakingRecord"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "staking_coin_denom"),
    2: .same(proto: "farmer"),
    3: .same(proto: "staking"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.stakingCoinDenom) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.farmer) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._staking) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.stakingCoinDenom.isEmpty {
      try visitor.visitSingularStringField(value: self.stakingCoinDenom, fieldNumber: 1)
    }
    if !self.farmer.isEmpty {
      try visitor.visitSingularStringField(value: self.farmer, fieldNumber: 2)
    }
    if let v = self._staking {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Crescent_Farming_V1beta1_StakingRecord, rhs: Crescent_Farming_V1beta1_StakingRecord) -> Bool {
    if lhs.stakingCoinDenom != rhs.stakingCoinDenom {return false}
    if lhs.farmer != rhs.farmer {return false}
    if lhs._staking != rhs._staking {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Crescent_Farming_V1beta1_QueuedStakingRecord: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueuedStakingRecord"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "staking_coin_denom"),
    2: .same(proto: "farmer"),
    3: .standard(proto: "queued_staking"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.stakingCoinDenom) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.farmer) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._queuedStaking) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.stakingCoinDenom.isEmpty {
      try visitor.visitSingularStringField(value: self.stakingCoinDenom, fieldNumber: 1)
    }
    if !self.farmer.isEmpty {
      try visitor.visitSingularStringField(value: self.farmer, fieldNumber: 2)
    }
    if let v = self._queuedStaking {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Crescent_Farming_V1beta1_QueuedStakingRecord, rhs: Crescent_Farming_V1beta1_QueuedStakingRecord) -> Bool {
    if lhs.stakingCoinDenom != rhs.stakingCoinDenom {return false}
    if lhs.farmer != rhs.farmer {return false}
    if lhs._queuedStaking != rhs._queuedStaking {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Crescent_Farming_V1beta1_TotalStakingsRecord: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".TotalStakingsRecord"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "staking_coin_denom"),
    2: .same(proto: "amount"),
    9: .standard(proto: "staking_reserve_coins"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.stakingCoinDenom) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.amount) }()
      case 9: try { try decoder.decodeRepeatedMessageField(value: &self.stakingReserveCoins) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.stakingCoinDenom.isEmpty {
      try visitor.visitSingularStringField(value: self.stakingCoinDenom, fieldNumber: 1)
    }
    if !self.amount.isEmpty {
      try visitor.visitSingularStringField(value: self.amount, fieldNumber: 2)
    }
    if !self.stakingReserveCoins.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.stakingReserveCoins, fieldNumber: 9)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Crescent_Farming_V1beta1_TotalStakingsRecord, rhs: Crescent_Farming_V1beta1_TotalStakingsRecord) -> Bool {
    if lhs.stakingCoinDenom != rhs.stakingCoinDenom {return false}
    if lhs.amount != rhs.amount {return false}
    if lhs.stakingReserveCoins != rhs.stakingReserveCoins {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Crescent_Farming_V1beta1_HistoricalRewardsRecord: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".HistoricalRewardsRecord"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "staking_coin_denom"),
    2: .same(proto: "epoch"),
    3: .standard(proto: "historical_rewards"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.stakingCoinDenom) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.epoch) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._historicalRewards) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.stakingCoinDenom.isEmpty {
      try visitor.visitSingularStringField(value: self.stakingCoinDenom, fieldNumber: 1)
    }
    if self.epoch != 0 {
      try visitor.visitSingularUInt64Field(value: self.epoch, fieldNumber: 2)
    }
    if let v = self._historicalRewards {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Crescent_Farming_V1beta1_HistoricalRewardsRecord, rhs: Crescent_Farming_V1beta1_HistoricalRewardsRecord) -> Bool {
    if lhs.stakingCoinDenom != rhs.stakingCoinDenom {return false}
    if lhs.epoch != rhs.epoch {return false}
    if lhs._historicalRewards != rhs._historicalRewards {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Crescent_Farming_V1beta1_OutstandingRewardsRecord: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".OutstandingRewardsRecord"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "staking_coin_denom"),
    2: .standard(proto: "outstanding_rewards"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.stakingCoinDenom) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._outstandingRewards) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.stakingCoinDenom.isEmpty {
      try visitor.visitSingularStringField(value: self.stakingCoinDenom, fieldNumber: 1)
    }
    if let v = self._outstandingRewards {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Crescent_Farming_V1beta1_OutstandingRewardsRecord, rhs: Crescent_Farming_V1beta1_OutstandingRewardsRecord) -> Bool {
    if lhs.stakingCoinDenom != rhs.stakingCoinDenom {return false}
    if lhs._outstandingRewards != rhs._outstandingRewards {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Crescent_Farming_V1beta1_CurrentEpochRecord: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".CurrentEpochRecord"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "staking_coin_denom"),
    2: .standard(proto: "current_epoch"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.stakingCoinDenom) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.currentEpoch) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.stakingCoinDenom.isEmpty {
      try visitor.visitSingularStringField(value: self.stakingCoinDenom, fieldNumber: 1)
    }
    if self.currentEpoch != 0 {
      try visitor.visitSingularUInt64Field(value: self.currentEpoch, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Crescent_Farming_V1beta1_CurrentEpochRecord, rhs: Crescent_Farming_V1beta1_CurrentEpochRecord) -> Bool {
    if lhs.stakingCoinDenom != rhs.stakingCoinDenom {return false}
    if lhs.currentEpoch != rhs.currentEpoch {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
