// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: osmosis/gamm/pool-models/stableswap/stableswap_pool.proto
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

/// PoolParams defined the parameters that will be managed by the pool
/// governance in the future. This params are not managed by the chain
/// governance. Instead they will be managed by the token holders of the pool.
/// The pool's token holders are specified in future_pool_governor.
struct Osmosis_Gamm_Stableswap_V1beta1_PoolParams {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var swapFee: String = String()

  var exitFee: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// Pool is the stableswap Pool struct
struct Osmosis_Gamm_Stableswap_V1beta1_Pool {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var address: String = String()

  var id: UInt64 = 0

  var poolParams: Osmosis_Gamm_Stableswap_V1beta1_PoolParams {
    get {return _poolParams ?? Osmosis_Gamm_Stableswap_V1beta1_PoolParams()}
    set {_poolParams = newValue}
  }
  /// Returns true if `poolParams` has been explicitly set.
  var hasPoolParams: Bool {return self._poolParams != nil}
  /// Clears the value of `poolParams`. Subsequent reads from it will return its default value.
  mutating func clearPoolParams() {self._poolParams = nil}

  /// This string specifies who will govern the pool in the future.
  /// Valid forms of this are:
  /// {token name},{duration}
  /// {duration}
  /// where {token name} if specified is the token which determines the
  /// governor, and if not specified is the LP token for this pool.duration is
  /// a time specified as 0w,1w,2w, etc. which specifies how long the token
  /// would need to be locked up to count in governance. 0w means no lockup.
  var futurePoolGovernor: String = String()

  /// sum of all LP shares
  var totalShares: Cosmos_Base_V1beta1_Coin {
    get {return _totalShares ?? Cosmos_Base_V1beta1_Coin()}
    set {_totalShares = newValue}
  }
  /// Returns true if `totalShares` has been explicitly set.
  var hasTotalShares: Bool {return self._totalShares != nil}
  /// Clears the value of `totalShares`. Subsequent reads from it will return its default value.
  mutating func clearTotalShares() {self._totalShares = nil}

  /// assets in the pool
  var poolLiquidity: [Cosmos_Base_V1beta1_Coin] = []

  /// for calculation amognst assets with different precisions
  var scalingFactor: [UInt64] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _poolParams: Osmosis_Gamm_Stableswap_V1beta1_PoolParams? = nil
  fileprivate var _totalShares: Cosmos_Base_V1beta1_Coin? = nil
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "osmosis.gamm.stableswap.v1beta1"

extension Osmosis_Gamm_Stableswap_V1beta1_PoolParams: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".PoolParams"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "swapFee"),
    2: .same(proto: "exitFee"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.swapFee) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.exitFee) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.swapFee.isEmpty {
      try visitor.visitSingularStringField(value: self.swapFee, fieldNumber: 1)
    }
    if !self.exitFee.isEmpty {
      try visitor.visitSingularStringField(value: self.exitFee, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Gamm_Stableswap_V1beta1_PoolParams, rhs: Osmosis_Gamm_Stableswap_V1beta1_PoolParams) -> Bool {
    if lhs.swapFee != rhs.swapFee {return false}
    if lhs.exitFee != rhs.exitFee {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Gamm_Stableswap_V1beta1_Pool: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Pool"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "address"),
    2: .same(proto: "id"),
    3: .same(proto: "poolParams"),
    4: .standard(proto: "future_pool_governor"),
    5: .same(proto: "totalShares"),
    6: .same(proto: "poolLiquidity"),
    7: .standard(proto: "scaling_factor"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.address) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._poolParams) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.futurePoolGovernor) }()
      case 5: try { try decoder.decodeSingularMessageField(value: &self._totalShares) }()
      case 6: try { try decoder.decodeRepeatedMessageField(value: &self.poolLiquidity) }()
      case 7: try { try decoder.decodeRepeatedUInt64Field(value: &self.scalingFactor) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.address.isEmpty {
      try visitor.visitSingularStringField(value: self.address, fieldNumber: 1)
    }
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 2)
    }
    if let v = self._poolParams {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    }
    if !self.futurePoolGovernor.isEmpty {
      try visitor.visitSingularStringField(value: self.futurePoolGovernor, fieldNumber: 4)
    }
    if let v = self._totalShares {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
    }
    if !self.poolLiquidity.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.poolLiquidity, fieldNumber: 6)
    }
    if !self.scalingFactor.isEmpty {
      try visitor.visitPackedUInt64Field(value: self.scalingFactor, fieldNumber: 7)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Gamm_Stableswap_V1beta1_Pool, rhs: Osmosis_Gamm_Stableswap_V1beta1_Pool) -> Bool {
    if lhs.address != rhs.address {return false}
    if lhs.id != rhs.id {return false}
    if lhs._poolParams != rhs._poolParams {return false}
    if lhs.futurePoolGovernor != rhs.futurePoolGovernor {return false}
    if lhs._totalShares != rhs._totalShares {return false}
    if lhs.poolLiquidity != rhs.poolLiquidity {return false}
    if lhs.scalingFactor != rhs.scalingFactor {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}