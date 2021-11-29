// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: injective/auction/v1beta1/tx.proto
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

/// Bid defines a SDK message for placing a bid for an auction
struct Injective_Auction_V1beta1_MsgBid {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var sender: String = String()

  /// amount of the bid in INJ tokens
  var bidAmount: Cosmos_Base_V1beta1_Coin {
    get {return _bidAmount ?? Cosmos_Base_V1beta1_Coin()}
    set {_bidAmount = newValue}
  }
  /// Returns true if `bidAmount` has been explicitly set.
  var hasBidAmount: Bool {return self._bidAmount != nil}
  /// Clears the value of `bidAmount`. Subsequent reads from it will return its default value.
  mutating func clearBidAmount() {self._bidAmount = nil}

  /// the current auction round being bid on
  var round: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _bidAmount: Cosmos_Base_V1beta1_Coin? = nil
}

struct Injective_Auction_V1beta1_MsgBidResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "injective.auction.v1beta1"

extension Injective_Auction_V1beta1_MsgBid: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgBid"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "sender"),
    2: .standard(proto: "bid_amount"),
    3: .same(proto: "round"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.sender) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._bidAmount) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.round) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.sender.isEmpty {
      try visitor.visitSingularStringField(value: self.sender, fieldNumber: 1)
    }
    if let v = self._bidAmount {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    }
    if self.round != 0 {
      try visitor.visitSingularUInt64Field(value: self.round, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Injective_Auction_V1beta1_MsgBid, rhs: Injective_Auction_V1beta1_MsgBid) -> Bool {
    if lhs.sender != rhs.sender {return false}
    if lhs._bidAmount != rhs._bidAmount {return false}
    if lhs.round != rhs.round {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Injective_Auction_V1beta1_MsgBidResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgBidResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Injective_Auction_V1beta1_MsgBidResponse, rhs: Injective_Auction_V1beta1_MsgBidResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
