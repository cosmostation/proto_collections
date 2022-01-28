// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: axelar/tss/tofnd/v1beta1/common.proto
//
// For information on using the generated types, please see the documentation:
//   https://github.com/apple/swift-protobuf/

/// File copied from golang tofnd with minor tweaks

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

/// Key presence check types
struct Axelar_Tss_Tofnd_V1beta1_KeyPresenceRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var keyUid: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Axelar_Tss_Tofnd_V1beta1_KeyPresenceResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var response: Axelar_Tss_Tofnd_V1beta1_KeyPresenceResponse.Response = .unspecified

  var unknownFields = SwiftProtobuf.UnknownStorage()

  enum Response: SwiftProtobuf.Enum {
    typealias RawValue = Int
    case unspecified // = 0
    case present // = 1
    case absent // = 2
    case fail // = 3
    case UNRECOGNIZED(Int)

    init() {
      self = .unspecified
    }

    init?(rawValue: Int) {
      switch rawValue {
      case 0: self = .unspecified
      case 1: self = .present
      case 2: self = .absent
      case 3: self = .fail
      default: self = .UNRECOGNIZED(rawValue)
      }
    }

    var rawValue: Int {
      switch self {
      case .unspecified: return 0
      case .present: return 1
      case .absent: return 2
      case .fail: return 3
      case .UNRECOGNIZED(let i): return i
      }
    }

  }

  init() {}
}

#if swift(>=4.2)

extension Axelar_Tss_Tofnd_V1beta1_KeyPresenceResponse.Response: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [Axelar_Tss_Tofnd_V1beta1_KeyPresenceResponse.Response] = [
    .unspecified,
    .present,
    .absent,
    .fail,
  ]
}

#endif  // swift(>=4.2)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "axelar.tss.tofnd.v1beta1"

extension Axelar_Tss_Tofnd_V1beta1_KeyPresenceRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".KeyPresenceRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "key_uid"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.keyUid) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.keyUid.isEmpty {
      try visitor.visitSingularStringField(value: self.keyUid, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Tss_Tofnd_V1beta1_KeyPresenceRequest, rhs: Axelar_Tss_Tofnd_V1beta1_KeyPresenceRequest) -> Bool {
    if lhs.keyUid != rhs.keyUid {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Axelar_Tss_Tofnd_V1beta1_KeyPresenceResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".KeyPresenceResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "response"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularEnumField(value: &self.response) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.response != .unspecified {
      try visitor.visitSingularEnumField(value: self.response, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Tss_Tofnd_V1beta1_KeyPresenceResponse, rhs: Axelar_Tss_Tofnd_V1beta1_KeyPresenceResponse) -> Bool {
    if lhs.response != rhs.response {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Axelar_Tss_Tofnd_V1beta1_KeyPresenceResponse.Response: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "RESPONSE_UNSPECIFIED"),
    1: .same(proto: "RESPONSE_PRESENT"),
    2: .same(proto: "RESPONSE_ABSENT"),
    3: .same(proto: "RESPONSE_FAIL"),
  ]
}
