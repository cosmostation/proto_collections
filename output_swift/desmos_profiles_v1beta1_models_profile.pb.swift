// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: desmos/profiles/v1beta1/models_profile.proto
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

/// Profile represents a generic first on Desmos, containing the information of a
/// single user
struct Desmos_Profiles_V1beta1_Profile {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Account represents the base Cosmos account associated with this profile
  var account: Google_Protobuf_Any {
    get {return _account ?? Google_Protobuf_Any()}
    set {_account = newValue}
  }
  /// Returns true if `account` has been explicitly set.
  var hasAccount: Bool {return self._account != nil}
  /// Clears the value of `account`. Subsequent reads from it will return its default value.
  mutating func clearAccount() {self._account = nil}

  /// DTag represents the unique tag of this profile
  var dtag: String = String()

  /// Nickname contains the custom human readable name of the profile
  var nickname: String = String()

  /// Bio contains the biography of the profile
  var bio: String = String()

  /// Pictures contains the data about the pictures associated with he profile
  var pictures: Desmos_Profiles_V1beta1_Pictures {
    get {return _pictures ?? Desmos_Profiles_V1beta1_Pictures()}
    set {_pictures = newValue}
  }
  /// Returns true if `pictures` has been explicitly set.
  var hasPictures: Bool {return self._pictures != nil}
  /// Clears the value of `pictures`. Subsequent reads from it will return its default value.
  mutating func clearPictures() {self._pictures = nil}

  /// CreationTime represents the time in which the profile has been created
  var creationDate: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _creationDate ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_creationDate = newValue}
  }
  /// Returns true if `creationDate` has been explicitly set.
  var hasCreationDate: Bool {return self._creationDate != nil}
  /// Clears the value of `creationDate`. Subsequent reads from it will return its default value.
  mutating func clearCreationDate() {self._creationDate = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _account: Google_Protobuf_Any? = nil
  fileprivate var _pictures: Desmos_Profiles_V1beta1_Pictures? = nil
  fileprivate var _creationDate: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
}

/// Pictures contains the data of a user profile's related pictures
struct Desmos_Profiles_V1beta1_Pictures {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Profile contains the URL to the profile picture
  var profile: String = String()

  /// Cover contains the URL to the cover picture
  var cover: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "desmos.profiles.v1beta1"

extension Desmos_Profiles_V1beta1_Profile: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Profile"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "account"),
    2: .same(proto: "dtag"),
    3: .same(proto: "nickname"),
    4: .same(proto: "bio"),
    5: .same(proto: "pictures"),
    6: .standard(proto: "creation_date"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._account) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.dtag) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.nickname) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.bio) }()
      case 5: try { try decoder.decodeSingularMessageField(value: &self._pictures) }()
      case 6: try { try decoder.decodeSingularMessageField(value: &self._creationDate) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if let v = self._account {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    }
    if !self.dtag.isEmpty {
      try visitor.visitSingularStringField(value: self.dtag, fieldNumber: 2)
    }
    if !self.nickname.isEmpty {
      try visitor.visitSingularStringField(value: self.nickname, fieldNumber: 3)
    }
    if !self.bio.isEmpty {
      try visitor.visitSingularStringField(value: self.bio, fieldNumber: 4)
    }
    if let v = self._pictures {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
    }
    if let v = self._creationDate {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 6)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Desmos_Profiles_V1beta1_Profile, rhs: Desmos_Profiles_V1beta1_Profile) -> Bool {
    if lhs._account != rhs._account {return false}
    if lhs.dtag != rhs.dtag {return false}
    if lhs.nickname != rhs.nickname {return false}
    if lhs.bio != rhs.bio {return false}
    if lhs._pictures != rhs._pictures {return false}
    if lhs._creationDate != rhs._creationDate {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Desmos_Profiles_V1beta1_Pictures: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Pictures"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "profile"),
    2: .same(proto: "cover"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.profile) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.cover) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.profile.isEmpty {
      try visitor.visitSingularStringField(value: self.profile, fieldNumber: 1)
    }
    if !self.cover.isEmpty {
      try visitor.visitSingularStringField(value: self.cover, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Desmos_Profiles_V1beta1_Pictures, rhs: Desmos_Profiles_V1beta1_Pictures) -> Bool {
    if lhs.profile != rhs.profile {return false}
    if lhs.cover != rhs.cover {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
