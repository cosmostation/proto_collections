// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: axelar/nexus/v1beta1/query.proto
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

struct Axelar_Nexus_V1beta1_QueryChainMaintainersResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var maintainers: [Data] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// LatestDepositAddressRequest represents a message that queries a deposit
/// address by recipient address
struct Axelar_Nexus_V1beta1_LatestDepositAddressRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var recipientAddr: String = String()

  var recipientChain: String = String()

  var depositChain: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Axelar_Nexus_V1beta1_LatestDepositAddressResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var depositAddr: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// TransfersForChainRequest represents a message that queries the
/// transfers for the specified chain
struct Axelar_Nexus_V1beta1_TransfersForChainRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var chain: String = String()

  var state: Axelar_Nexus_Exported_V1beta1_TransferState = .unspecified

  var pagination: Cosmos_Base_Query_V1beta1_PageRequest {
    get {return _pagination ?? Cosmos_Base_Query_V1beta1_PageRequest()}
    set {_pagination = newValue}
  }
  /// Returns true if `pagination` has been explicitly set.
  var hasPagination: Bool {return self._pagination != nil}
  /// Clears the value of `pagination`. Subsequent reads from it will return its default value.
  mutating func clearPagination() {self._pagination = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _pagination: Cosmos_Base_Query_V1beta1_PageRequest? = nil
}

struct Axelar_Nexus_V1beta1_TransfersForChainResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var transfers: [Axelar_Nexus_Exported_V1beta1_CrossChainTransfer] = []

  var pagination: Cosmos_Base_Query_V1beta1_PageResponse {
    get {return _pagination ?? Cosmos_Base_Query_V1beta1_PageResponse()}
    set {_pagination = newValue}
  }
  /// Returns true if `pagination` has been explicitly set.
  var hasPagination: Bool {return self._pagination != nil}
  /// Clears the value of `pagination`. Subsequent reads from it will return its default value.
  mutating func clearPagination() {self._pagination = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _pagination: Cosmos_Base_Query_V1beta1_PageResponse? = nil
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "axelar.nexus.v1beta1"

extension Axelar_Nexus_V1beta1_QueryChainMaintainersResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryChainMaintainersResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "maintainers"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedBytesField(value: &self.maintainers) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.maintainers.isEmpty {
      try visitor.visitRepeatedBytesField(value: self.maintainers, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Nexus_V1beta1_QueryChainMaintainersResponse, rhs: Axelar_Nexus_V1beta1_QueryChainMaintainersResponse) -> Bool {
    if lhs.maintainers != rhs.maintainers {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Axelar_Nexus_V1beta1_LatestDepositAddressRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".LatestDepositAddressRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "recipient_addr"),
    2: .standard(proto: "recipient_chain"),
    3: .standard(proto: "deposit_chain"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.recipientAddr) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.recipientChain) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.depositChain) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.recipientAddr.isEmpty {
      try visitor.visitSingularStringField(value: self.recipientAddr, fieldNumber: 1)
    }
    if !self.recipientChain.isEmpty {
      try visitor.visitSingularStringField(value: self.recipientChain, fieldNumber: 2)
    }
    if !self.depositChain.isEmpty {
      try visitor.visitSingularStringField(value: self.depositChain, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Nexus_V1beta1_LatestDepositAddressRequest, rhs: Axelar_Nexus_V1beta1_LatestDepositAddressRequest) -> Bool {
    if lhs.recipientAddr != rhs.recipientAddr {return false}
    if lhs.recipientChain != rhs.recipientChain {return false}
    if lhs.depositChain != rhs.depositChain {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Axelar_Nexus_V1beta1_LatestDepositAddressResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".LatestDepositAddressResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "deposit_addr"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.depositAddr) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.depositAddr.isEmpty {
      try visitor.visitSingularStringField(value: self.depositAddr, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Nexus_V1beta1_LatestDepositAddressResponse, rhs: Axelar_Nexus_V1beta1_LatestDepositAddressResponse) -> Bool {
    if lhs.depositAddr != rhs.depositAddr {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Axelar_Nexus_V1beta1_TransfersForChainRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".TransfersForChainRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "chain"),
    2: .same(proto: "state"),
    3: .same(proto: "pagination"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.chain) }()
      case 2: try { try decoder.decodeSingularEnumField(value: &self.state) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._pagination) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.chain.isEmpty {
      try visitor.visitSingularStringField(value: self.chain, fieldNumber: 1)
    }
    if self.state != .unspecified {
      try visitor.visitSingularEnumField(value: self.state, fieldNumber: 2)
    }
    if let v = self._pagination {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Nexus_V1beta1_TransfersForChainRequest, rhs: Axelar_Nexus_V1beta1_TransfersForChainRequest) -> Bool {
    if lhs.chain != rhs.chain {return false}
    if lhs.state != rhs.state {return false}
    if lhs._pagination != rhs._pagination {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Axelar_Nexus_V1beta1_TransfersForChainResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".TransfersForChainResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "transfers"),
    2: .same(proto: "pagination"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.transfers) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._pagination) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.transfers.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.transfers, fieldNumber: 1)
    }
    if let v = self._pagination {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Nexus_V1beta1_TransfersForChainResponse, rhs: Axelar_Nexus_V1beta1_TransfersForChainResponse) -> Bool {
    if lhs.transfers != rhs.transfers {return false}
    if lhs._pagination != rhs._pagination {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
