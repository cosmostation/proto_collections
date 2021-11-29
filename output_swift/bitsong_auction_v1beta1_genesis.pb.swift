// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: bitsong/auction/v1beta1/genesis.proto
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

/// GenesisState defines the auction module's genesis state
struct Bitsong_Auction_V1beta1_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var lastAuctionID: UInt64 = 0

  var auctions: [Bitsong_Auction_V1beta1_Auction] = []

  var bids: [Bitsong_Auction_V1beta1_Bid] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "bitsong.auction.v1beta1"

extension Bitsong_Auction_V1beta1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "last_auction_id"),
    2: .same(proto: "auctions"),
    3: .same(proto: "bids"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.lastAuctionID) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.auctions) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.bids) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.lastAuctionID != 0 {
      try visitor.visitSingularUInt64Field(value: self.lastAuctionID, fieldNumber: 1)
    }
    if !self.auctions.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.auctions, fieldNumber: 2)
    }
    if !self.bids.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.bids, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Bitsong_Auction_V1beta1_GenesisState, rhs: Bitsong_Auction_V1beta1_GenesisState) -> Bool {
    if lhs.lastAuctionID != rhs.lastAuctionID {return false}
    if lhs.auctions != rhs.auctions {return false}
    if lhs.bids != rhs.bids {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
