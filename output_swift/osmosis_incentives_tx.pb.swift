// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: osmosis/incentives/tx.proto
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

struct Osmosis_Incentives_MsgCreateGauge {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// flag to show if it's perpetual or multi-epoch
  /// distribution incentives by third party
  var isPerpetual: Bool = false

  var owner: String = String()

  /// distribute condition of a lock which meet one of these conditions
  var distributeTo: Osmosis_Lockup_QueryCondition {
    get {return _distributeTo ?? Osmosis_Lockup_QueryCondition()}
    set {_distributeTo = newValue}
  }
  /// Returns true if `distributeTo` has been explicitly set.
  var hasDistributeTo: Bool {return self._distributeTo != nil}
  /// Clears the value of `distributeTo`. Subsequent reads from it will return its default value.
  mutating func clearDistributeTo() {self._distributeTo = nil}

  /// can distribute multiple coins
  var coins: [Cosmos_Base_V1beta1_Coin] = []

  /// distribution start time
  var startTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _startTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_startTime = newValue}
  }
  /// Returns true if `startTime` has been explicitly set.
  var hasStartTime: Bool {return self._startTime != nil}
  /// Clears the value of `startTime`. Subsequent reads from it will return its default value.
  mutating func clearStartTime() {self._startTime = nil}

  /// number of epochs distribution will be done
  var numEpochsPaidOver: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _distributeTo: Osmosis_Lockup_QueryCondition? = nil
  fileprivate var _startTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
}

struct Osmosis_Incentives_MsgCreateGaugeResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Osmosis_Incentives_MsgAddToGauge {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var owner: String = String()

  var gaugeID: UInt64 = 0

  var rewards: [Cosmos_Base_V1beta1_Coin] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Osmosis_Incentives_MsgAddToGaugeResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "osmosis.incentives"

extension Osmosis_Incentives_MsgCreateGauge: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCreateGauge"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "is_perpetual"),
    2: .same(proto: "owner"),
    3: .standard(proto: "distribute_to"),
    4: .same(proto: "coins"),
    5: .standard(proto: "start_time"),
    6: .standard(proto: "num_epochs_paid_over"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBoolField(value: &self.isPerpetual) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.owner) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._distributeTo) }()
      case 4: try { try decoder.decodeRepeatedMessageField(value: &self.coins) }()
      case 5: try { try decoder.decodeSingularMessageField(value: &self._startTime) }()
      case 6: try { try decoder.decodeSingularUInt64Field(value: &self.numEpochsPaidOver) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.isPerpetual != false {
      try visitor.visitSingularBoolField(value: self.isPerpetual, fieldNumber: 1)
    }
    if !self.owner.isEmpty {
      try visitor.visitSingularStringField(value: self.owner, fieldNumber: 2)
    }
    if let v = self._distributeTo {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    }
    if !self.coins.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.coins, fieldNumber: 4)
    }
    if let v = self._startTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
    }
    if self.numEpochsPaidOver != 0 {
      try visitor.visitSingularUInt64Field(value: self.numEpochsPaidOver, fieldNumber: 6)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Incentives_MsgCreateGauge, rhs: Osmosis_Incentives_MsgCreateGauge) -> Bool {
    if lhs.isPerpetual != rhs.isPerpetual {return false}
    if lhs.owner != rhs.owner {return false}
    if lhs._distributeTo != rhs._distributeTo {return false}
    if lhs.coins != rhs.coins {return false}
    if lhs._startTime != rhs._startTime {return false}
    if lhs.numEpochsPaidOver != rhs.numEpochsPaidOver {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Incentives_MsgCreateGaugeResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCreateGaugeResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Incentives_MsgCreateGaugeResponse, rhs: Osmosis_Incentives_MsgCreateGaugeResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Incentives_MsgAddToGauge: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgAddToGauge"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "owner"),
    2: .standard(proto: "gauge_id"),
    3: .same(proto: "rewards"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.owner) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.gaugeID) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.rewards) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.owner.isEmpty {
      try visitor.visitSingularStringField(value: self.owner, fieldNumber: 1)
    }
    if self.gaugeID != 0 {
      try visitor.visitSingularUInt64Field(value: self.gaugeID, fieldNumber: 2)
    }
    if !self.rewards.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.rewards, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Incentives_MsgAddToGauge, rhs: Osmosis_Incentives_MsgAddToGauge) -> Bool {
    if lhs.owner != rhs.owner {return false}
    if lhs.gaugeID != rhs.gaugeID {return false}
    if lhs.rewards != rhs.rewards {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Incentives_MsgAddToGaugeResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgAddToGaugeResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Incentives_MsgAddToGaugeResponse, rhs: Osmosis_Incentives_MsgAddToGaugeResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
