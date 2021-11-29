// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: osmosis/txfees/v1beta1/gov.proto
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

/// UpdateFeeTokenProposal is a gov Content type for adding a new whitelisted fee
/// token. It must specify a denom along with gamm pool ID to use as a spot price
/// calculator. It can be used to add a new denom to the whitelist It can also be
/// used to update the Pool to associate with the denom. If Pool ID is set to 0,
/// it will remove the denom from the whitelisted set.
struct Osmosis_Txfees_V1beta1_UpdateFeeTokenProposal {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var title: String = String()

  var description_p: String = String()

  var feetoken: Osmosis_Txfees_V1beta1_FeeToken {
    get {return _feetoken ?? Osmosis_Txfees_V1beta1_FeeToken()}
    set {_feetoken = newValue}
  }
  /// Returns true if `feetoken` has been explicitly set.
  var hasFeetoken: Bool {return self._feetoken != nil}
  /// Clears the value of `feetoken`. Subsequent reads from it will return its default value.
  mutating func clearFeetoken() {self._feetoken = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _feetoken: Osmosis_Txfees_V1beta1_FeeToken? = nil
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "osmosis.txfees.v1beta1"

extension Osmosis_Txfees_V1beta1_UpdateFeeTokenProposal: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".UpdateFeeTokenProposal"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "title"),
    2: .same(proto: "description"),
    3: .same(proto: "feetoken"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.title) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._feetoken) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.title.isEmpty {
      try visitor.visitSingularStringField(value: self.title, fieldNumber: 1)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 2)
    }
    if let v = self._feetoken {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Txfees_V1beta1_UpdateFeeTokenProposal, rhs: Osmosis_Txfees_V1beta1_UpdateFeeTokenProposal) -> Bool {
    if lhs.title != rhs.title {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs._feetoken != rhs._feetoken {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
