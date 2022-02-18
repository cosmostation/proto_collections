// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: provenance/metadata/v1/specification.proto
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

/// DefinitionType indicates the required definition type for this value
enum Provenance_Metadata_V1_DefinitionType: SwiftProtobuf.Enum {
  typealias RawValue = Int

  /// DEFINITION_TYPE_UNSPECIFIED indicates an unknown/invalid value
  case unspecified // = 0

  /// DEFINITION_TYPE_PROPOSED indicates a proposed value is used here (a record that is not on-chain)
  case proposed // = 1

  /// DEFINITION_TYPE_RECORD indicates the value must be a reference to a record on chain
  case record // = 2

  /// DEFINITION_TYPE_RECORD_LIST indicates the value maybe a reference to a collection of values on chain having
  /// the same name
  case recordList // = 3
  case UNRECOGNIZED(Int)

  init() {
    self = .unspecified
  }

  init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .unspecified
    case 1: self = .proposed
    case 2: self = .record
    case 3: self = .recordList
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  var rawValue: Int {
    switch self {
    case .unspecified: return 0
    case .proposed: return 1
    case .record: return 2
    case .recordList: return 3
    case .UNRECOGNIZED(let i): return i
    }
  }

}

#if swift(>=4.2)

extension Provenance_Metadata_V1_DefinitionType: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [Provenance_Metadata_V1_DefinitionType] = [
    .unspecified,
    .proposed,
    .record,
    .recordList,
  ]
}

#endif  // swift(>=4.2)

/// PartyType are the different roles parties on a contract may use
enum Provenance_Metadata_V1_PartyType: SwiftProtobuf.Enum {
  typealias RawValue = Int

  /// PARTY_TYPE_UNSPECIFIED is an error condition
  case unspecified // = 0

  /// PARTY_TYPE_ORIGINATOR is an asset originator
  case originator // = 1

  /// PARTY_TYPE_SERVICER provides debt servicing functions
  case servicer // = 2

  /// PARTY_TYPE_INVESTOR is a generic investor
  case investor // = 3

  /// PARTY_TYPE_CUSTODIAN is an entity that provides custodian services for assets
  case custodian // = 4

  /// PARTY_TYPE_OWNER indicates this party is an owner of the item
  case owner // = 5

  /// PARTY_TYPE_AFFILIATE is a party with an affiliate agreement
  case affiliate // = 6

  /// PARTY_TYPE_OMNIBUS is a special type of party that controls an omnibus bank account
  case omnibus // = 7

  /// PARTY_TYPE_PROVENANCE is used to indicate this party represents the blockchain or a smart contract action
  case provenance // = 8
  case UNRECOGNIZED(Int)

  init() {
    self = .unspecified
  }

  init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .unspecified
    case 1: self = .originator
    case 2: self = .servicer
    case 3: self = .investor
    case 4: self = .custodian
    case 5: self = .owner
    case 6: self = .affiliate
    case 7: self = .omnibus
    case 8: self = .provenance
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  var rawValue: Int {
    switch self {
    case .unspecified: return 0
    case .originator: return 1
    case .servicer: return 2
    case .investor: return 3
    case .custodian: return 4
    case .owner: return 5
    case .affiliate: return 6
    case .omnibus: return 7
    case .provenance: return 8
    case .UNRECOGNIZED(let i): return i
    }
  }

}

#if swift(>=4.2)

extension Provenance_Metadata_V1_PartyType: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [Provenance_Metadata_V1_PartyType] = [
    .unspecified,
    .originator,
    .servicer,
    .investor,
    .custodian,
    .owner,
    .affiliate,
    .omnibus,
    .provenance,
  ]
}

#endif  // swift(>=4.2)

/// ScopeSpecification defines the required parties, resources, conditions, and consideration outputs for a contract
struct Provenance_Metadata_V1_ScopeSpecification {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// unique identifier for this specification on chain
  var specificationID: Data = Data()

  /// General information about this scope specification.
  var description_p: Provenance_Metadata_V1_Description {
    get {return _description_p ?? Provenance_Metadata_V1_Description()}
    set {_description_p = newValue}
  }
  /// Returns true if `description_p` has been explicitly set.
  var hasDescription_p: Bool {return self._description_p != nil}
  /// Clears the value of `description_p`. Subsequent reads from it will return its default value.
  mutating func clearDescription_p() {self._description_p = nil}

  /// Addresses of the owners of this scope specification.
  var ownerAddresses: [String] = []

  /// A list of parties that must be present on a scope (and their associated roles)
  var partiesInvolved: [Provenance_Metadata_V1_PartyType] = []

  /// A list of contract specification ids allowed for a scope based on this specification.
  var contractSpecIds: [Data] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _description_p: Provenance_Metadata_V1_Description? = nil
}

/// ContractSpecification defines the required parties, resources, conditions, and consideration outputs for a contract
struct Provenance_Metadata_V1_ContractSpecification {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// unique identifier for this specification on chain
  var specificationID: Data = Data()

  /// Description information for this contract specification
  var description_p: Provenance_Metadata_V1_Description {
    get {return _description_p ?? Provenance_Metadata_V1_Description()}
    set {_description_p = newValue}
  }
  /// Returns true if `description_p` has been explicitly set.
  var hasDescription_p: Bool {return self._description_p != nil}
  /// Clears the value of `description_p`. Subsequent reads from it will return its default value.
  mutating func clearDescription_p() {self._description_p = nil}

  /// Address of the account that owns this specificaiton
  var ownerAddresses: [String] = []

  /// a list of party roles that must be fullfilled when signing a transaction for this contract specification
  var partiesInvolved: [Provenance_Metadata_V1_PartyType] = []

  /// Reference to a metadata record with a hash and type information for the instance of code that will process this
  /// contract
  var source: Provenance_Metadata_V1_ContractSpecification.OneOf_Source? = nil

  /// the address of a record on chain that represents this contract
  var resourceID: Data {
    get {
      if case .resourceID(let v)? = source {return v}
      return Data()
    }
    set {source = .resourceID(newValue)}
  }

  /// the hash of contract binary (off-chain instance)
  var hash: String {
    get {
      if case .hash(let v)? = source {return v}
      return String()
    }
    set {source = .hash(newValue)}
  }

  /// name of the class/type of this contract executable
  var className: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  /// Reference to a metadata record with a hash and type information for the instance of code that will process this
  /// contract
  enum OneOf_Source: Equatable {
    /// the address of a record on chain that represents this contract
    case resourceID(Data)
    /// the hash of contract binary (off-chain instance)
    case hash(String)

  #if !swift(>=4.1)
    static func ==(lhs: Provenance_Metadata_V1_ContractSpecification.OneOf_Source, rhs: Provenance_Metadata_V1_ContractSpecification.OneOf_Source) -> Bool {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch (lhs, rhs) {
      case (.resourceID, .resourceID): return {
        guard case .resourceID(let l) = lhs, case .resourceID(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      case (.hash, .hash): return {
        guard case .hash(let l) = lhs, case .hash(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      default: return false
      }
    }
  #endif
  }

  init() {}

  fileprivate var _description_p: Provenance_Metadata_V1_Description? = nil
}

/// RecordSpecification defines the specification for a Record including allowed/required inputs/outputs
struct Provenance_Metadata_V1_RecordSpecification {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// unique identifier for this specification on chain
  var specificationID: Data = Data()

  /// Name of Record that will be created when this specification is used
  var name: String = String()

  /// A set of inputs that must be satisified to apply this RecordSpecification and create a Record
  var inputs: [Provenance_Metadata_V1_InputSpecification] = []

  /// A type name for data associated with this record (typically a class or proto name)
  var typeName: String = String()

  /// Type of result for this record specification (must be RECORD or RECORD_LIST)
  var resultType: Provenance_Metadata_V1_DefinitionType = .unspecified

  /// Type of party responsible for this record
  var responsibleParties: [Provenance_Metadata_V1_PartyType] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// InputSpecification defines a name, type_name, and source reference (either on or off chain) to define an input
/// parameter
struct Provenance_Metadata_V1_InputSpecification {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// name for this input
  var name: String = String()

  /// a type_name (typically a proto name or class_name)
  var typeName: String = String()

  /// source is either on chain (record_id) or off-chain (hash)
  var source: Provenance_Metadata_V1_InputSpecification.OneOf_Source? = nil

  /// the address of a record on chain (For Established Records)
  var recordID: Data {
    get {
      if case .recordID(let v)? = source {return v}
      return Data()
    }
    set {source = .recordID(newValue)}
  }

  /// the hash of an off-chain piece of information (For Proposed Records)
  var hash: String {
    get {
      if case .hash(let v)? = source {return v}
      return String()
    }
    set {source = .hash(newValue)}
  }

  var unknownFields = SwiftProtobuf.UnknownStorage()

  /// source is either on chain (record_id) or off-chain (hash)
  enum OneOf_Source: Equatable {
    /// the address of a record on chain (For Established Records)
    case recordID(Data)
    /// the hash of an off-chain piece of information (For Proposed Records)
    case hash(String)

  #if !swift(>=4.1)
    static func ==(lhs: Provenance_Metadata_V1_InputSpecification.OneOf_Source, rhs: Provenance_Metadata_V1_InputSpecification.OneOf_Source) -> Bool {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch (lhs, rhs) {
      case (.recordID, .recordID): return {
        guard case .recordID(let l) = lhs, case .recordID(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      case (.hash, .hash): return {
        guard case .hash(let l) = lhs, case .hash(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      default: return false
      }
    }
  #endif
  }

  init() {}
}

/// Description holds general information that is handy to associate with a structure.
struct Provenance_Metadata_V1_Description {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// A Name for this thing.
  var name: String = String()

  /// A description of this thing.
  var description_p: String = String()

  /// URL to find even more info.
  var websiteURL: String = String()

  /// URL of an icon.
  var iconURL: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "provenance.metadata.v1"

extension Provenance_Metadata_V1_DefinitionType: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "DEFINITION_TYPE_UNSPECIFIED"),
    1: .same(proto: "DEFINITION_TYPE_PROPOSED"),
    2: .same(proto: "DEFINITION_TYPE_RECORD"),
    3: .same(proto: "DEFINITION_TYPE_RECORD_LIST"),
  ]
}

extension Provenance_Metadata_V1_PartyType: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "PARTY_TYPE_UNSPECIFIED"),
    1: .same(proto: "PARTY_TYPE_ORIGINATOR"),
    2: .same(proto: "PARTY_TYPE_SERVICER"),
    3: .same(proto: "PARTY_TYPE_INVESTOR"),
    4: .same(proto: "PARTY_TYPE_CUSTODIAN"),
    5: .same(proto: "PARTY_TYPE_OWNER"),
    6: .same(proto: "PARTY_TYPE_AFFILIATE"),
    7: .same(proto: "PARTY_TYPE_OMNIBUS"),
    8: .same(proto: "PARTY_TYPE_PROVENANCE"),
  ]
}

extension Provenance_Metadata_V1_ScopeSpecification: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ScopeSpecification"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "specification_id"),
    2: .same(proto: "description"),
    3: .standard(proto: "owner_addresses"),
    4: .standard(proto: "parties_involved"),
    5: .standard(proto: "contract_spec_ids"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.specificationID) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._description_p) }()
      case 3: try { try decoder.decodeRepeatedStringField(value: &self.ownerAddresses) }()
      case 4: try { try decoder.decodeRepeatedEnumField(value: &self.partiesInvolved) }()
      case 5: try { try decoder.decodeRepeatedBytesField(value: &self.contractSpecIds) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.specificationID.isEmpty {
      try visitor.visitSingularBytesField(value: self.specificationID, fieldNumber: 1)
    }
    if let v = self._description_p {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    }
    if !self.ownerAddresses.isEmpty {
      try visitor.visitRepeatedStringField(value: self.ownerAddresses, fieldNumber: 3)
    }
    if !self.partiesInvolved.isEmpty {
      try visitor.visitPackedEnumField(value: self.partiesInvolved, fieldNumber: 4)
    }
    if !self.contractSpecIds.isEmpty {
      try visitor.visitRepeatedBytesField(value: self.contractSpecIds, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Provenance_Metadata_V1_ScopeSpecification, rhs: Provenance_Metadata_V1_ScopeSpecification) -> Bool {
    if lhs.specificationID != rhs.specificationID {return false}
    if lhs._description_p != rhs._description_p {return false}
    if lhs.ownerAddresses != rhs.ownerAddresses {return false}
    if lhs.partiesInvolved != rhs.partiesInvolved {return false}
    if lhs.contractSpecIds != rhs.contractSpecIds {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Provenance_Metadata_V1_ContractSpecification: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ContractSpecification"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "specification_id"),
    2: .same(proto: "description"),
    3: .standard(proto: "owner_addresses"),
    4: .standard(proto: "parties_involved"),
    5: .standard(proto: "resource_id"),
    6: .same(proto: "hash"),
    7: .standard(proto: "class_name"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.specificationID) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._description_p) }()
      case 3: try { try decoder.decodeRepeatedStringField(value: &self.ownerAddresses) }()
      case 4: try { try decoder.decodeRepeatedEnumField(value: &self.partiesInvolved) }()
      case 5: try {
        var v: Data?
        try decoder.decodeSingularBytesField(value: &v)
        if let v = v {
          if self.source != nil {try decoder.handleConflictingOneOf()}
          self.source = .resourceID(v)
        }
      }()
      case 6: try {
        var v: String?
        try decoder.decodeSingularStringField(value: &v)
        if let v = v {
          if self.source != nil {try decoder.handleConflictingOneOf()}
          self.source = .hash(v)
        }
      }()
      case 7: try { try decoder.decodeSingularStringField(value: &self.className) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.specificationID.isEmpty {
      try visitor.visitSingularBytesField(value: self.specificationID, fieldNumber: 1)
    }
    if let v = self._description_p {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    }
    if !self.ownerAddresses.isEmpty {
      try visitor.visitRepeatedStringField(value: self.ownerAddresses, fieldNumber: 3)
    }
    if !self.partiesInvolved.isEmpty {
      try visitor.visitPackedEnumField(value: self.partiesInvolved, fieldNumber: 4)
    }
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every case branch when no optimizations are
    // enabled. https://github.com/apple/swift-protobuf/issues/1034
    switch self.source {
    case .resourceID?: try {
      guard case .resourceID(let v)? = self.source else { preconditionFailure() }
      try visitor.visitSingularBytesField(value: v, fieldNumber: 5)
    }()
    case .hash?: try {
      guard case .hash(let v)? = self.source else { preconditionFailure() }
      try visitor.visitSingularStringField(value: v, fieldNumber: 6)
    }()
    case nil: break
    }
    if !self.className.isEmpty {
      try visitor.visitSingularStringField(value: self.className, fieldNumber: 7)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Provenance_Metadata_V1_ContractSpecification, rhs: Provenance_Metadata_V1_ContractSpecification) -> Bool {
    if lhs.specificationID != rhs.specificationID {return false}
    if lhs._description_p != rhs._description_p {return false}
    if lhs.ownerAddresses != rhs.ownerAddresses {return false}
    if lhs.partiesInvolved != rhs.partiesInvolved {return false}
    if lhs.source != rhs.source {return false}
    if lhs.className != rhs.className {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Provenance_Metadata_V1_RecordSpecification: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".RecordSpecification"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "specification_id"),
    2: .same(proto: "name"),
    3: .same(proto: "inputs"),
    4: .standard(proto: "type_name"),
    5: .standard(proto: "result_type"),
    6: .standard(proto: "responsible_parties"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.specificationID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.name) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.inputs) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.typeName) }()
      case 5: try { try decoder.decodeSingularEnumField(value: &self.resultType) }()
      case 6: try { try decoder.decodeRepeatedEnumField(value: &self.responsibleParties) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.specificationID.isEmpty {
      try visitor.visitSingularBytesField(value: self.specificationID, fieldNumber: 1)
    }
    if !self.name.isEmpty {
      try visitor.visitSingularStringField(value: self.name, fieldNumber: 2)
    }
    if !self.inputs.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.inputs, fieldNumber: 3)
    }
    if !self.typeName.isEmpty {
      try visitor.visitSingularStringField(value: self.typeName, fieldNumber: 4)
    }
    if self.resultType != .unspecified {
      try visitor.visitSingularEnumField(value: self.resultType, fieldNumber: 5)
    }
    if !self.responsibleParties.isEmpty {
      try visitor.visitPackedEnumField(value: self.responsibleParties, fieldNumber: 6)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Provenance_Metadata_V1_RecordSpecification, rhs: Provenance_Metadata_V1_RecordSpecification) -> Bool {
    if lhs.specificationID != rhs.specificationID {return false}
    if lhs.name != rhs.name {return false}
    if lhs.inputs != rhs.inputs {return false}
    if lhs.typeName != rhs.typeName {return false}
    if lhs.resultType != rhs.resultType {return false}
    if lhs.responsibleParties != rhs.responsibleParties {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Provenance_Metadata_V1_InputSpecification: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".InputSpecification"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "name"),
    2: .standard(proto: "type_name"),
    3: .standard(proto: "record_id"),
    4: .same(proto: "hash"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.name) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.typeName) }()
      case 3: try {
        var v: Data?
        try decoder.decodeSingularBytesField(value: &v)
        if let v = v {
          if self.source != nil {try decoder.handleConflictingOneOf()}
          self.source = .recordID(v)
        }
      }()
      case 4: try {
        var v: String?
        try decoder.decodeSingularStringField(value: &v)
        if let v = v {
          if self.source != nil {try decoder.handleConflictingOneOf()}
          self.source = .hash(v)
        }
      }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.name.isEmpty {
      try visitor.visitSingularStringField(value: self.name, fieldNumber: 1)
    }
    if !self.typeName.isEmpty {
      try visitor.visitSingularStringField(value: self.typeName, fieldNumber: 2)
    }
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every case branch when no optimizations are
    // enabled. https://github.com/apple/swift-protobuf/issues/1034
    switch self.source {
    case .recordID?: try {
      guard case .recordID(let v)? = self.source else { preconditionFailure() }
      try visitor.visitSingularBytesField(value: v, fieldNumber: 3)
    }()
    case .hash?: try {
      guard case .hash(let v)? = self.source else { preconditionFailure() }
      try visitor.visitSingularStringField(value: v, fieldNumber: 4)
    }()
    case nil: break
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Provenance_Metadata_V1_InputSpecification, rhs: Provenance_Metadata_V1_InputSpecification) -> Bool {
    if lhs.name != rhs.name {return false}
    if lhs.typeName != rhs.typeName {return false}
    if lhs.source != rhs.source {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Provenance_Metadata_V1_Description: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Description"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "name"),
    3: .same(proto: "description"),
    4: .standard(proto: "website_url"),
    5: .standard(proto: "icon_url"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.name) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.websiteURL) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.iconURL) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.name.isEmpty {
      try visitor.visitSingularStringField(value: self.name, fieldNumber: 1)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 3)
    }
    if !self.websiteURL.isEmpty {
      try visitor.visitSingularStringField(value: self.websiteURL, fieldNumber: 4)
    }
    if !self.iconURL.isEmpty {
      try visitor.visitSingularStringField(value: self.iconURL, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Provenance_Metadata_V1_Description, rhs: Provenance_Metadata_V1_Description) -> Bool {
    if lhs.name != rhs.name {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.websiteURL != rhs.websiteURL {return false}
    if lhs.iconURL != rhs.iconURL {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
