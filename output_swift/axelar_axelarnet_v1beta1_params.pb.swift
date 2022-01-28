// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: axelar/axelarnet/v1beta1/params.proto
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

/// Params represent the genesis parameters for the module
struct Axelar_Axelarnet_V1beta1_Params {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// IBC packet route timeout window
  var routeTimeoutWindow: UInt64 = 0

  var transactionFeeRate: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "axelar.axelarnet.v1beta1"

extension Axelar_Axelarnet_V1beta1_Params: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Params"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "route_timeout_window"),
    2: .standard(proto: "transaction_fee_rate"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.routeTimeoutWindow) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.transactionFeeRate) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.routeTimeoutWindow != 0 {
      try visitor.visitSingularUInt64Field(value: self.routeTimeoutWindow, fieldNumber: 1)
    }
    if !self.transactionFeeRate.isEmpty {
      try visitor.visitSingularStringField(value: self.transactionFeeRate, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Axelarnet_V1beta1_Params, rhs: Axelar_Axelarnet_V1beta1_Params) -> Bool {
    if lhs.routeTimeoutWindow != rhs.routeTimeoutWindow {return false}
    if lhs.transactionFeeRate != rhs.transactionFeeRate {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
