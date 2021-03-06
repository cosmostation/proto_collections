// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: umee/oracle/v1beta1/oracle.proto
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

/// Params defines the parameters for the oracle module.
struct Umeenetwork_Umee_Oracle_V1beta1_Params {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var votePeriod: UInt64 = 0

  var voteThreshold: String = String()

  var rewardBand: String = String()

  var rewardDistributionWindow: UInt64 = 0

  var whitelist: [Umeenetwork_Umee_Oracle_V1beta1_Denom] = []

  var slashFraction: String = String()

  var slashWindow: UInt64 = 0

  var minValidPerWindow: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// Denom - the object to hold configurations of each denom
struct Umeenetwork_Umee_Oracle_V1beta1_Denom {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var name: String = String()

  var tobinTax: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// struct for aggregate prevoting on the ExchangeRateVote.
/// The purpose of aggregate prevote is to hide vote exchange rates with hash
/// which is formatted as hex string in SHA256("{salt}:{exchange
/// rate}{denom},...,{exchange rate}{denom}:{voter}")
struct Umeenetwork_Umee_Oracle_V1beta1_AggregateExchangeRatePrevote {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var hash: String = String()

  var voter: String = String()

  var submitBlock: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgAggregateExchangeRateVote - struct for voting on
/// the exchange rates of USD denominated in various assets.
struct Umeenetwork_Umee_Oracle_V1beta1_AggregateExchangeRateVote {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var exchangeRateTuples: [Umeenetwork_Umee_Oracle_V1beta1_ExchangeRateTuple] = []

  var voter: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// ExchangeRateTuple - struct to store interpreted exchange rates data to store
struct Umeenetwork_Umee_Oracle_V1beta1_ExchangeRateTuple {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var denom: String = String()

  var exchangeRate: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "umeenetwork.umee.oracle.v1beta1"

extension Umeenetwork_Umee_Oracle_V1beta1_Params: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Params"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "vote_period"),
    2: .standard(proto: "vote_threshold"),
    3: .standard(proto: "reward_band"),
    4: .standard(proto: "reward_distribution_window"),
    5: .same(proto: "whitelist"),
    6: .standard(proto: "slash_fraction"),
    7: .standard(proto: "slash_window"),
    8: .standard(proto: "min_valid_per_window"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.votePeriod) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.voteThreshold) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.rewardBand) }()
      case 4: try { try decoder.decodeSingularUInt64Field(value: &self.rewardDistributionWindow) }()
      case 5: try { try decoder.decodeRepeatedMessageField(value: &self.whitelist) }()
      case 6: try { try decoder.decodeSingularStringField(value: &self.slashFraction) }()
      case 7: try { try decoder.decodeSingularUInt64Field(value: &self.slashWindow) }()
      case 8: try { try decoder.decodeSingularStringField(value: &self.minValidPerWindow) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.votePeriod != 0 {
      try visitor.visitSingularUInt64Field(value: self.votePeriod, fieldNumber: 1)
    }
    if !self.voteThreshold.isEmpty {
      try visitor.visitSingularStringField(value: self.voteThreshold, fieldNumber: 2)
    }
    if !self.rewardBand.isEmpty {
      try visitor.visitSingularStringField(value: self.rewardBand, fieldNumber: 3)
    }
    if self.rewardDistributionWindow != 0 {
      try visitor.visitSingularUInt64Field(value: self.rewardDistributionWindow, fieldNumber: 4)
    }
    if !self.whitelist.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.whitelist, fieldNumber: 5)
    }
    if !self.slashFraction.isEmpty {
      try visitor.visitSingularStringField(value: self.slashFraction, fieldNumber: 6)
    }
    if self.slashWindow != 0 {
      try visitor.visitSingularUInt64Field(value: self.slashWindow, fieldNumber: 7)
    }
    if !self.minValidPerWindow.isEmpty {
      try visitor.visitSingularStringField(value: self.minValidPerWindow, fieldNumber: 8)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Umeenetwork_Umee_Oracle_V1beta1_Params, rhs: Umeenetwork_Umee_Oracle_V1beta1_Params) -> Bool {
    if lhs.votePeriod != rhs.votePeriod {return false}
    if lhs.voteThreshold != rhs.voteThreshold {return false}
    if lhs.rewardBand != rhs.rewardBand {return false}
    if lhs.rewardDistributionWindow != rhs.rewardDistributionWindow {return false}
    if lhs.whitelist != rhs.whitelist {return false}
    if lhs.slashFraction != rhs.slashFraction {return false}
    if lhs.slashWindow != rhs.slashWindow {return false}
    if lhs.minValidPerWindow != rhs.minValidPerWindow {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Umeenetwork_Umee_Oracle_V1beta1_Denom: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Denom"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "name"),
    2: .standard(proto: "tobin_tax"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.name) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.tobinTax) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.name.isEmpty {
      try visitor.visitSingularStringField(value: self.name, fieldNumber: 1)
    }
    if !self.tobinTax.isEmpty {
      try visitor.visitSingularStringField(value: self.tobinTax, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Umeenetwork_Umee_Oracle_V1beta1_Denom, rhs: Umeenetwork_Umee_Oracle_V1beta1_Denom) -> Bool {
    if lhs.name != rhs.name {return false}
    if lhs.tobinTax != rhs.tobinTax {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Umeenetwork_Umee_Oracle_V1beta1_AggregateExchangeRatePrevote: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".AggregateExchangeRatePrevote"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "hash"),
    2: .same(proto: "voter"),
    3: .standard(proto: "submit_block"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.hash) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.voter) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.submitBlock) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.hash.isEmpty {
      try visitor.visitSingularStringField(value: self.hash, fieldNumber: 1)
    }
    if !self.voter.isEmpty {
      try visitor.visitSingularStringField(value: self.voter, fieldNumber: 2)
    }
    if self.submitBlock != 0 {
      try visitor.visitSingularUInt64Field(value: self.submitBlock, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Umeenetwork_Umee_Oracle_V1beta1_AggregateExchangeRatePrevote, rhs: Umeenetwork_Umee_Oracle_V1beta1_AggregateExchangeRatePrevote) -> Bool {
    if lhs.hash != rhs.hash {return false}
    if lhs.voter != rhs.voter {return false}
    if lhs.submitBlock != rhs.submitBlock {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Umeenetwork_Umee_Oracle_V1beta1_AggregateExchangeRateVote: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".AggregateExchangeRateVote"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "exchange_rate_tuples"),
    2: .same(proto: "voter"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.exchangeRateTuples) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.voter) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.exchangeRateTuples.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.exchangeRateTuples, fieldNumber: 1)
    }
    if !self.voter.isEmpty {
      try visitor.visitSingularStringField(value: self.voter, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Umeenetwork_Umee_Oracle_V1beta1_AggregateExchangeRateVote, rhs: Umeenetwork_Umee_Oracle_V1beta1_AggregateExchangeRateVote) -> Bool {
    if lhs.exchangeRateTuples != rhs.exchangeRateTuples {return false}
    if lhs.voter != rhs.voter {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Umeenetwork_Umee_Oracle_V1beta1_ExchangeRateTuple: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ExchangeRateTuple"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "denom"),
    2: .standard(proto: "exchange_rate"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.denom) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.exchangeRate) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.denom.isEmpty {
      try visitor.visitSingularStringField(value: self.denom, fieldNumber: 1)
    }
    if !self.exchangeRate.isEmpty {
      try visitor.visitSingularStringField(value: self.exchangeRate, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Umeenetwork_Umee_Oracle_V1beta1_ExchangeRateTuple, rhs: Umeenetwork_Umee_Oracle_V1beta1_ExchangeRateTuple) -> Bool {
    if lhs.denom != rhs.denom {return false}
    if lhs.exchangeRate != rhs.exchangeRate {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
