// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: akash/deployment/v1beta1/group.proto
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

/// MsgCloseGroup defines SDK message to close a single Group within a Deployment.
struct Akash_Deployment_V1beta1_MsgCloseGroup {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: Akash_Deployment_V1beta1_GroupID {
    get {return _id ?? Akash_Deployment_V1beta1_GroupID()}
    set {_id = newValue}
  }
  /// Returns true if `id` has been explicitly set.
  var hasID: Bool {return self._id != nil}
  /// Clears the value of `id`. Subsequent reads from it will return its default value.
  mutating func clearID() {self._id = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _id: Akash_Deployment_V1beta1_GroupID? = nil
}

/// MsgCloseGroupResponse defines the Msg/CloseGroup response type.
struct Akash_Deployment_V1beta1_MsgCloseGroupResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgPauseGroup defines SDK message to close a single Group within a Deployment.
struct Akash_Deployment_V1beta1_MsgPauseGroup {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: Akash_Deployment_V1beta1_GroupID {
    get {return _id ?? Akash_Deployment_V1beta1_GroupID()}
    set {_id = newValue}
  }
  /// Returns true if `id` has been explicitly set.
  var hasID: Bool {return self._id != nil}
  /// Clears the value of `id`. Subsequent reads from it will return its default value.
  mutating func clearID() {self._id = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _id: Akash_Deployment_V1beta1_GroupID? = nil
}

/// MsgPauseGroupResponse defines the Msg/PauseGroup response type.
struct Akash_Deployment_V1beta1_MsgPauseGroupResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgStartGroup defines SDK message to close a single Group within a Deployment.
struct Akash_Deployment_V1beta1_MsgStartGroup {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: Akash_Deployment_V1beta1_GroupID {
    get {return _id ?? Akash_Deployment_V1beta1_GroupID()}
    set {_id = newValue}
  }
  /// Returns true if `id` has been explicitly set.
  var hasID: Bool {return self._id != nil}
  /// Clears the value of `id`. Subsequent reads from it will return its default value.
  mutating func clearID() {self._id = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _id: Akash_Deployment_V1beta1_GroupID? = nil
}

/// MsgStartGroupResponse defines the Msg/StartGroup response type.
struct Akash_Deployment_V1beta1_MsgStartGroupResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// GroupID stores owner, deployment sequence number and group sequence number
struct Akash_Deployment_V1beta1_GroupID {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var owner: String = String()

  var dseq: UInt64 = 0

  var gseq: UInt32 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// GroupSpec stores group specifications
struct Akash_Deployment_V1beta1_GroupSpec {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var name: String = String()

  var requirements: Akash_Base_V1beta1_PlacementRequirements {
    get {return _requirements ?? Akash_Base_V1beta1_PlacementRequirements()}
    set {_requirements = newValue}
  }
  /// Returns true if `requirements` has been explicitly set.
  var hasRequirements: Bool {return self._requirements != nil}
  /// Clears the value of `requirements`. Subsequent reads from it will return its default value.
  mutating func clearRequirements() {self._requirements = nil}

  var resources: [Akash_Deployment_V1beta1_Resource] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _requirements: Akash_Base_V1beta1_PlacementRequirements? = nil
}

/// Group stores group id, state and specifications of group
struct Akash_Deployment_V1beta1_Group {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var groupID: Akash_Deployment_V1beta1_GroupID {
    get {return _groupID ?? Akash_Deployment_V1beta1_GroupID()}
    set {_groupID = newValue}
  }
  /// Returns true if `groupID` has been explicitly set.
  var hasGroupID: Bool {return self._groupID != nil}
  /// Clears the value of `groupID`. Subsequent reads from it will return its default value.
  mutating func clearGroupID() {self._groupID = nil}

  var state: Akash_Deployment_V1beta1_Group.State = .invalid

  var groupSpec: Akash_Deployment_V1beta1_GroupSpec {
    get {return _groupSpec ?? Akash_Deployment_V1beta1_GroupSpec()}
    set {_groupSpec = newValue}
  }
  /// Returns true if `groupSpec` has been explicitly set.
  var hasGroupSpec: Bool {return self._groupSpec != nil}
  /// Clears the value of `groupSpec`. Subsequent reads from it will return its default value.
  mutating func clearGroupSpec() {self._groupSpec = nil}

  var createdAt: Int64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  /// State is an enum which refers to state of group
  enum State: SwiftProtobuf.Enum {
    typealias RawValue = Int

    /// Prefix should start with 0 in enum. So declaring dummy state
    case invalid // = 0

    /// GroupOpen denotes state for group open
    case `open` // = 1

    /// GroupOrdered denotes state for group ordered
    case paused // = 2

    /// GroupInsufficientFunds denotes state for group insufficient_funds
    case insufficientFunds // = 3

    /// GroupClosed denotes state for group closed
    case closed // = 4
    case UNRECOGNIZED(Int)

    init() {
      self = .invalid
    }

    init?(rawValue: Int) {
      switch rawValue {
      case 0: self = .invalid
      case 1: self = .open
      case 2: self = .paused
      case 3: self = .insufficientFunds
      case 4: self = .closed
      default: self = .UNRECOGNIZED(rawValue)
      }
    }

    var rawValue: Int {
      switch self {
      case .invalid: return 0
      case .open: return 1
      case .paused: return 2
      case .insufficientFunds: return 3
      case .closed: return 4
      case .UNRECOGNIZED(let i): return i
      }
    }

  }

  init() {}

  fileprivate var _groupID: Akash_Deployment_V1beta1_GroupID? = nil
  fileprivate var _groupSpec: Akash_Deployment_V1beta1_GroupSpec? = nil
}

#if swift(>=4.2)

extension Akash_Deployment_V1beta1_Group.State: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [Akash_Deployment_V1beta1_Group.State] = [
    .invalid,
    .open,
    .paused,
    .insufficientFunds,
    .closed,
  ]
}

#endif  // swift(>=4.2)

/// Resource stores unit, total count and price of resource
struct Akash_Deployment_V1beta1_Resource {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var resources: Akash_Base_V1beta1_ResourceUnits {
    get {return _resources ?? Akash_Base_V1beta1_ResourceUnits()}
    set {_resources = newValue}
  }
  /// Returns true if `resources` has been explicitly set.
  var hasResources: Bool {return self._resources != nil}
  /// Clears the value of `resources`. Subsequent reads from it will return its default value.
  mutating func clearResources() {self._resources = nil}

  var count: UInt32 = 0

  var price: Cosmos_Base_V1beta1_Coin {
    get {return _price ?? Cosmos_Base_V1beta1_Coin()}
    set {_price = newValue}
  }
  /// Returns true if `price` has been explicitly set.
  var hasPrice: Bool {return self._price != nil}
  /// Clears the value of `price`. Subsequent reads from it will return its default value.
  mutating func clearPrice() {self._price = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _resources: Akash_Base_V1beta1_ResourceUnits? = nil
  fileprivate var _price: Cosmos_Base_V1beta1_Coin? = nil
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "akash.deployment.v1beta1"

extension Akash_Deployment_V1beta1_MsgCloseGroup: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCloseGroup"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._id) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if let v = self._id {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Akash_Deployment_V1beta1_MsgCloseGroup, rhs: Akash_Deployment_V1beta1_MsgCloseGroup) -> Bool {
    if lhs._id != rhs._id {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Akash_Deployment_V1beta1_MsgCloseGroupResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCloseGroupResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Akash_Deployment_V1beta1_MsgCloseGroupResponse, rhs: Akash_Deployment_V1beta1_MsgCloseGroupResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Akash_Deployment_V1beta1_MsgPauseGroup: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgPauseGroup"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._id) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if let v = self._id {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Akash_Deployment_V1beta1_MsgPauseGroup, rhs: Akash_Deployment_V1beta1_MsgPauseGroup) -> Bool {
    if lhs._id != rhs._id {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Akash_Deployment_V1beta1_MsgPauseGroupResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgPauseGroupResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Akash_Deployment_V1beta1_MsgPauseGroupResponse, rhs: Akash_Deployment_V1beta1_MsgPauseGroupResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Akash_Deployment_V1beta1_MsgStartGroup: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgStartGroup"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._id) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if let v = self._id {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Akash_Deployment_V1beta1_MsgStartGroup, rhs: Akash_Deployment_V1beta1_MsgStartGroup) -> Bool {
    if lhs._id != rhs._id {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Akash_Deployment_V1beta1_MsgStartGroupResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgStartGroupResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Akash_Deployment_V1beta1_MsgStartGroupResponse, rhs: Akash_Deployment_V1beta1_MsgStartGroupResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Akash_Deployment_V1beta1_GroupID: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GroupID"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "owner"),
    2: .same(proto: "dseq"),
    3: .same(proto: "gseq"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.owner) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.dseq) }()
      case 3: try { try decoder.decodeSingularUInt32Field(value: &self.gseq) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.owner.isEmpty {
      try visitor.visitSingularStringField(value: self.owner, fieldNumber: 1)
    }
    if self.dseq != 0 {
      try visitor.visitSingularUInt64Field(value: self.dseq, fieldNumber: 2)
    }
    if self.gseq != 0 {
      try visitor.visitSingularUInt32Field(value: self.gseq, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Akash_Deployment_V1beta1_GroupID, rhs: Akash_Deployment_V1beta1_GroupID) -> Bool {
    if lhs.owner != rhs.owner {return false}
    if lhs.dseq != rhs.dseq {return false}
    if lhs.gseq != rhs.gseq {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Akash_Deployment_V1beta1_GroupSpec: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GroupSpec"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "name"),
    2: .same(proto: "requirements"),
    3: .same(proto: "resources"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.name) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._requirements) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.resources) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.name.isEmpty {
      try visitor.visitSingularStringField(value: self.name, fieldNumber: 1)
    }
    if let v = self._requirements {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    }
    if !self.resources.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.resources, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Akash_Deployment_V1beta1_GroupSpec, rhs: Akash_Deployment_V1beta1_GroupSpec) -> Bool {
    if lhs.name != rhs.name {return false}
    if lhs._requirements != rhs._requirements {return false}
    if lhs.resources != rhs.resources {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Akash_Deployment_V1beta1_Group: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Group"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "group_id"),
    2: .same(proto: "state"),
    3: .standard(proto: "group_spec"),
    4: .standard(proto: "created_at"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._groupID) }()
      case 2: try { try decoder.decodeSingularEnumField(value: &self.state) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._groupSpec) }()
      case 4: try { try decoder.decodeSingularInt64Field(value: &self.createdAt) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if let v = self._groupID {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    }
    if self.state != .invalid {
      try visitor.visitSingularEnumField(value: self.state, fieldNumber: 2)
    }
    if let v = self._groupSpec {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    }
    if self.createdAt != 0 {
      try visitor.visitSingularInt64Field(value: self.createdAt, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Akash_Deployment_V1beta1_Group, rhs: Akash_Deployment_V1beta1_Group) -> Bool {
    if lhs._groupID != rhs._groupID {return false}
    if lhs.state != rhs.state {return false}
    if lhs._groupSpec != rhs._groupSpec {return false}
    if lhs.createdAt != rhs.createdAt {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Akash_Deployment_V1beta1_Group.State: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "invalid"),
    1: .same(proto: "open"),
    2: .same(proto: "paused"),
    3: .same(proto: "insufficient_funds"),
    4: .same(proto: "closed"),
  ]
}

extension Akash_Deployment_V1beta1_Resource: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Resource"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "resources"),
    2: .same(proto: "count"),
    3: .same(proto: "price"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._resources) }()
      case 2: try { try decoder.decodeSingularUInt32Field(value: &self.count) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._price) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if let v = self._resources {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    }
    if self.count != 0 {
      try visitor.visitSingularUInt32Field(value: self.count, fieldNumber: 2)
    }
    if let v = self._price {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Akash_Deployment_V1beta1_Resource, rhs: Akash_Deployment_V1beta1_Resource) -> Bool {
    if lhs._resources != rhs._resources {return false}
    if lhs.count != rhs.count {return false}
    if lhs._price != rhs._price {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
