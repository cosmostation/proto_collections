// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: token/tx.proto
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

/// MsgIssueToken defines an SDK message for issuing a new token
struct Irismod_Token_MsgIssueToken {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var symbol: String = String()

  var name: String = String()

  var scale: UInt32 = 0

  var minUnit: String = String()

  var initialSupply: UInt64 = 0

  var maxSupply: UInt64 = 0

  var mintable: Bool = false

  var owner: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgIssueTokenResponse defines the Msg/IssueToken response type
struct Irismod_Token_MsgIssueTokenResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgTransferTokenOwner defines an SDK message for transferring the token owner
struct Irismod_Token_MsgTransferTokenOwner {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var srcOwner: String = String()

  var dstOwner: String = String()

  var symbol: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgTransferTokenOwnerResponse defines the Msg/TransferTokenOwner response type
struct Irismod_Token_MsgTransferTokenOwnerResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgEditToken defines an SDK message for editing a new token
struct Irismod_Token_MsgEditToken {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var symbol: String = String()

  var name: String = String()

  var maxSupply: UInt64 = 0

  var mintable: String = String()

  var owner: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgEditTokenResponse defines the Msg/EditToken response type
struct Irismod_Token_MsgEditTokenResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgMintToken defines an SDK message for minting a new token
struct Irismod_Token_MsgMintToken {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var symbol: String = String()

  var amount: UInt64 = 0

  var to: String = String()

  var owner: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgMintTokenResponse defines the Msg/MintToken response type
struct Irismod_Token_MsgMintTokenResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgBurnToken defines an SDK message for burning some tokens
struct Irismod_Token_MsgBurnToken {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var symbol: String = String()

  var amount: UInt64 = 0

  var sender: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgBurnTokenResponse defines the Msg/BurnToken response type
struct Irismod_Token_MsgBurnTokenResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "irismod.token"

extension Irismod_Token_MsgIssueToken: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgIssueToken"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "symbol"),
    2: .same(proto: "name"),
    3: .same(proto: "scale"),
    4: .standard(proto: "min_unit"),
    5: .standard(proto: "initial_supply"),
    6: .standard(proto: "max_supply"),
    7: .same(proto: "mintable"),
    8: .same(proto: "owner"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.symbol) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.name) }()
      case 3: try { try decoder.decodeSingularUInt32Field(value: &self.scale) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.minUnit) }()
      case 5: try { try decoder.decodeSingularUInt64Field(value: &self.initialSupply) }()
      case 6: try { try decoder.decodeSingularUInt64Field(value: &self.maxSupply) }()
      case 7: try { try decoder.decodeSingularBoolField(value: &self.mintable) }()
      case 8: try { try decoder.decodeSingularStringField(value: &self.owner) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.symbol.isEmpty {
      try visitor.visitSingularStringField(value: self.symbol, fieldNumber: 1)
    }
    if !self.name.isEmpty {
      try visitor.visitSingularStringField(value: self.name, fieldNumber: 2)
    }
    if self.scale != 0 {
      try visitor.visitSingularUInt32Field(value: self.scale, fieldNumber: 3)
    }
    if !self.minUnit.isEmpty {
      try visitor.visitSingularStringField(value: self.minUnit, fieldNumber: 4)
    }
    if self.initialSupply != 0 {
      try visitor.visitSingularUInt64Field(value: self.initialSupply, fieldNumber: 5)
    }
    if self.maxSupply != 0 {
      try visitor.visitSingularUInt64Field(value: self.maxSupply, fieldNumber: 6)
    }
    if self.mintable != false {
      try visitor.visitSingularBoolField(value: self.mintable, fieldNumber: 7)
    }
    if !self.owner.isEmpty {
      try visitor.visitSingularStringField(value: self.owner, fieldNumber: 8)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Irismod_Token_MsgIssueToken, rhs: Irismod_Token_MsgIssueToken) -> Bool {
    if lhs.symbol != rhs.symbol {return false}
    if lhs.name != rhs.name {return false}
    if lhs.scale != rhs.scale {return false}
    if lhs.minUnit != rhs.minUnit {return false}
    if lhs.initialSupply != rhs.initialSupply {return false}
    if lhs.maxSupply != rhs.maxSupply {return false}
    if lhs.mintable != rhs.mintable {return false}
    if lhs.owner != rhs.owner {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Irismod_Token_MsgIssueTokenResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgIssueTokenResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Irismod_Token_MsgIssueTokenResponse, rhs: Irismod_Token_MsgIssueTokenResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Irismod_Token_MsgTransferTokenOwner: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgTransferTokenOwner"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "src_owner"),
    2: .standard(proto: "dst_owner"),
    3: .same(proto: "symbol"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.srcOwner) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.dstOwner) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.symbol) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.srcOwner.isEmpty {
      try visitor.visitSingularStringField(value: self.srcOwner, fieldNumber: 1)
    }
    if !self.dstOwner.isEmpty {
      try visitor.visitSingularStringField(value: self.dstOwner, fieldNumber: 2)
    }
    if !self.symbol.isEmpty {
      try visitor.visitSingularStringField(value: self.symbol, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Irismod_Token_MsgTransferTokenOwner, rhs: Irismod_Token_MsgTransferTokenOwner) -> Bool {
    if lhs.srcOwner != rhs.srcOwner {return false}
    if lhs.dstOwner != rhs.dstOwner {return false}
    if lhs.symbol != rhs.symbol {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Irismod_Token_MsgTransferTokenOwnerResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgTransferTokenOwnerResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Irismod_Token_MsgTransferTokenOwnerResponse, rhs: Irismod_Token_MsgTransferTokenOwnerResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Irismod_Token_MsgEditToken: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgEditToken"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "symbol"),
    2: .same(proto: "name"),
    3: .standard(proto: "max_supply"),
    4: .same(proto: "mintable"),
    5: .same(proto: "owner"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.symbol) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.name) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.maxSupply) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.mintable) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.owner) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.symbol.isEmpty {
      try visitor.visitSingularStringField(value: self.symbol, fieldNumber: 1)
    }
    if !self.name.isEmpty {
      try visitor.visitSingularStringField(value: self.name, fieldNumber: 2)
    }
    if self.maxSupply != 0 {
      try visitor.visitSingularUInt64Field(value: self.maxSupply, fieldNumber: 3)
    }
    if !self.mintable.isEmpty {
      try visitor.visitSingularStringField(value: self.mintable, fieldNumber: 4)
    }
    if !self.owner.isEmpty {
      try visitor.visitSingularStringField(value: self.owner, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Irismod_Token_MsgEditToken, rhs: Irismod_Token_MsgEditToken) -> Bool {
    if lhs.symbol != rhs.symbol {return false}
    if lhs.name != rhs.name {return false}
    if lhs.maxSupply != rhs.maxSupply {return false}
    if lhs.mintable != rhs.mintable {return false}
    if lhs.owner != rhs.owner {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Irismod_Token_MsgEditTokenResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgEditTokenResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Irismod_Token_MsgEditTokenResponse, rhs: Irismod_Token_MsgEditTokenResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Irismod_Token_MsgMintToken: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgMintToken"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "symbol"),
    2: .same(proto: "amount"),
    3: .same(proto: "to"),
    4: .same(proto: "owner"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.symbol) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.amount) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.to) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.owner) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.symbol.isEmpty {
      try visitor.visitSingularStringField(value: self.symbol, fieldNumber: 1)
    }
    if self.amount != 0 {
      try visitor.visitSingularUInt64Field(value: self.amount, fieldNumber: 2)
    }
    if !self.to.isEmpty {
      try visitor.visitSingularStringField(value: self.to, fieldNumber: 3)
    }
    if !self.owner.isEmpty {
      try visitor.visitSingularStringField(value: self.owner, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Irismod_Token_MsgMintToken, rhs: Irismod_Token_MsgMintToken) -> Bool {
    if lhs.symbol != rhs.symbol {return false}
    if lhs.amount != rhs.amount {return false}
    if lhs.to != rhs.to {return false}
    if lhs.owner != rhs.owner {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Irismod_Token_MsgMintTokenResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgMintTokenResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Irismod_Token_MsgMintTokenResponse, rhs: Irismod_Token_MsgMintTokenResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Irismod_Token_MsgBurnToken: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgBurnToken"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "symbol"),
    2: .same(proto: "amount"),
    3: .same(proto: "sender"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.symbol) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.amount) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.sender) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.symbol.isEmpty {
      try visitor.visitSingularStringField(value: self.symbol, fieldNumber: 1)
    }
    if self.amount != 0 {
      try visitor.visitSingularUInt64Field(value: self.amount, fieldNumber: 2)
    }
    if !self.sender.isEmpty {
      try visitor.visitSingularStringField(value: self.sender, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Irismod_Token_MsgBurnToken, rhs: Irismod_Token_MsgBurnToken) -> Bool {
    if lhs.symbol != rhs.symbol {return false}
    if lhs.amount != rhs.amount {return false}
    if lhs.sender != rhs.sender {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Irismod_Token_MsgBurnTokenResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgBurnTokenResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Irismod_Token_MsgBurnTokenResponse, rhs: Irismod_Token_MsgBurnTokenResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
