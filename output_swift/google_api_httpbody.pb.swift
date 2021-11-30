// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: google/api/httpbody.proto
//
// For information on using the generated types, please see the documentation:
//   https://github.com/apple/swift-protobuf/

// Copyright 2018 Google LLC.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

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

/// Message that represents an arbitrary HTTP body. It should only be used for
/// payload formats that can't be represented as JSON, such as raw binary or
/// an HTML page.
///
///
/// This message can be used both in streaming and non-streaming API methods in
/// the request as well as the response.
///
/// It can be used as a top-level request field, which is convenient if one
/// wants to extract parameters from either the URL or HTTP template into the
/// request fields and also want access to the raw HTTP body.
///
/// Example:
///
///     message GetResourceRequest {
///       // A unique request id.
///       string request_id = 1;
///
///       // The raw HTTP body is bound to this field.
///       google.api.HttpBody http_body = 2;
///     }
///
///     service ResourceService {
///       rpc GetResource(GetResourceRequest) returns (google.api.HttpBody);
///       rpc UpdateResource(google.api.HttpBody) returns
///       (google.protobuf.Empty);
///     }
///
/// Example with streaming methods:
///
///     service CaldavService {
///       rpc GetCalendar(stream google.api.HttpBody)
///         returns (stream google.api.HttpBody);
///       rpc UpdateCalendar(stream google.api.HttpBody)
///         returns (stream google.api.HttpBody);
///     }
///
/// Use of this type only changes how the request and response bodies are
/// handled, all other features will continue to work unchanged.
struct Google_Api_HttpBody {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// The HTTP Content-Type header value specifying the content type of the body.
  var contentType: String = String()

  /// The HTTP request/response body as raw binary.
  var data: Data = Data()

  /// Application specific response metadata. Must be set in the first response
  /// for streaming APIs.
  var extensions: [Google_Protobuf_Any] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "google.api"

extension Google_Api_HttpBody: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".HttpBody"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "content_type"),
    2: .same(proto: "data"),
    3: .same(proto: "extensions"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.contentType) }()
      case 2: try { try decoder.decodeSingularBytesField(value: &self.data) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.extensions) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.contentType.isEmpty {
      try visitor.visitSingularStringField(value: self.contentType, fieldNumber: 1)
    }
    if !self.data.isEmpty {
      try visitor.visitSingularBytesField(value: self.data, fieldNumber: 2)
    }
    if !self.extensions.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.extensions, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Google_Api_HttpBody, rhs: Google_Api_HttpBody) -> Bool {
    if lhs.contentType != rhs.contentType {return false}
    if lhs.data != rhs.data {return false}
    if lhs.extensions != rhs.extensions {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
