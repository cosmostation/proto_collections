// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: cosmwasm/wasm/v1/genesis.proto
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

/// GenesisState - genesis state of x/wasm
struct Starnamed_X_Wasm_V1beta1_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var params: Starnamed_X_Wasm_V1beta1_Params {
    get {return _params ?? Starnamed_X_Wasm_V1beta1_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  var codes: [Starnamed_X_Wasm_V1beta1_Code] = []

  var contracts: [Starnamed_X_Wasm_V1beta1_Contract] = []

  var sequences: [Starnamed_X_Wasm_V1beta1_Sequence] = []

  var genMsgs: [Starnamed_X_Wasm_V1beta1_GenesisState.GenMsgs] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  /// GenMsgs define the messages that can be executed during genesis phase in
  /// order. The intention is to have more human readable data that is auditable.
  struct GenMsgs {
    // SwiftProtobuf.Message conformance is added in an extension below. See the
    // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
    // methods supported on all messages.

    /// sum is a single message
    var sum: Starnamed_X_Wasm_V1beta1_GenesisState.GenMsgs.OneOf_Sum? = nil

    var storeCode: Starnamed_X_Wasm_V1beta1_MsgStoreCode {
      get {
        if case .storeCode(let v)? = sum {return v}
        return Starnamed_X_Wasm_V1beta1_MsgStoreCode()
      }
      set {sum = .storeCode(newValue)}
    }

    var instantiateContract: Starnamed_X_Wasm_V1beta1_MsgInstantiateContract {
      get {
        if case .instantiateContract(let v)? = sum {return v}
        return Starnamed_X_Wasm_V1beta1_MsgInstantiateContract()
      }
      set {sum = .instantiateContract(newValue)}
    }

    var executeContract: Starnamed_X_Wasm_V1beta1_MsgExecuteContract {
      get {
        if case .executeContract(let v)? = sum {return v}
        return Starnamed_X_Wasm_V1beta1_MsgExecuteContract()
      }
      set {sum = .executeContract(newValue)}
    }

    var unknownFields = SwiftProtobuf.UnknownStorage()

    /// sum is a single message
    enum OneOf_Sum: Equatable {
      case storeCode(Starnamed_X_Wasm_V1beta1_MsgStoreCode)
      case instantiateContract(Starnamed_X_Wasm_V1beta1_MsgInstantiateContract)
      case executeContract(Starnamed_X_Wasm_V1beta1_MsgExecuteContract)

    #if !swift(>=4.1)
      static func ==(lhs: Starnamed_X_Wasm_V1beta1_GenesisState.GenMsgs.OneOf_Sum, rhs: Starnamed_X_Wasm_V1beta1_GenesisState.GenMsgs.OneOf_Sum) -> Bool {
        // The use of inline closures is to circumvent an issue where the compiler
        // allocates stack space for every case branch when no optimizations are
        // enabled. https://github.com/apple/swift-protobuf/issues/1034
        switch (lhs, rhs) {
        case (.storeCode, .storeCode): return {
          guard case .storeCode(let l) = lhs, case .storeCode(let r) = rhs else { preconditionFailure() }
          return l == r
        }()
        case (.instantiateContract, .instantiateContract): return {
          guard case .instantiateContract(let l) = lhs, case .instantiateContract(let r) = rhs else { preconditionFailure() }
          return l == r
        }()
        case (.executeContract, .executeContract): return {
          guard case .executeContract(let l) = lhs, case .executeContract(let r) = rhs else { preconditionFailure() }
          return l == r
        }()
        default: return false
        }
      }
    #endif
    }

    init() {}
  }

  init() {}

  fileprivate var _params: Starnamed_X_Wasm_V1beta1_Params? = nil
}

/// Code struct encompasses CodeInfo and CodeBytes
struct Starnamed_X_Wasm_V1beta1_Code {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var codeID: UInt64 = 0

  var codeInfo: Starnamed_X_Wasm_V1beta1_CodeInfo {
    get {return _codeInfo ?? Starnamed_X_Wasm_V1beta1_CodeInfo()}
    set {_codeInfo = newValue}
  }
  /// Returns true if `codeInfo` has been explicitly set.
  var hasCodeInfo: Bool {return self._codeInfo != nil}
  /// Clears the value of `codeInfo`. Subsequent reads from it will return its default value.
  mutating func clearCodeInfo() {self._codeInfo = nil}

  var codeBytes: Data = Data()

  /// Pinned to wasmvm cache
  var pinned: Bool = false

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _codeInfo: Starnamed_X_Wasm_V1beta1_CodeInfo? = nil
}

/// Contract struct encompasses ContractAddress, ContractInfo, and ContractState
struct Starnamed_X_Wasm_V1beta1_Contract {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var contractAddress: String = String()

  var contractInfo: Starnamed_X_Wasm_V1beta1_ContractInfo {
    get {return _contractInfo ?? Starnamed_X_Wasm_V1beta1_ContractInfo()}
    set {_contractInfo = newValue}
  }
  /// Returns true if `contractInfo` has been explicitly set.
  var hasContractInfo: Bool {return self._contractInfo != nil}
  /// Clears the value of `contractInfo`. Subsequent reads from it will return its default value.
  mutating func clearContractInfo() {self._contractInfo = nil}

  var contractState: [Starnamed_X_Wasm_V1beta1_Model] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _contractInfo: Starnamed_X_Wasm_V1beta1_ContractInfo? = nil
}

/// Sequence key and value of an id generation counter
struct Starnamed_X_Wasm_V1beta1_Sequence {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var idKey: Data = Data()

  var value: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "starnamed.x.wasm.v1beta1"

extension Starnamed_X_Wasm_V1beta1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "params"),
    2: .same(proto: "codes"),
    3: .same(proto: "contracts"),
    4: .same(proto: "sequences"),
    5: .standard(proto: "gen_msgs"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._params) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.codes) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.contracts) }()
      case 4: try { try decoder.decodeRepeatedMessageField(value: &self.sequences) }()
      case 5: try { try decoder.decodeRepeatedMessageField(value: &self.genMsgs) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if let v = self._params {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    }
    if !self.codes.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.codes, fieldNumber: 2)
    }
    if !self.contracts.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.contracts, fieldNumber: 3)
    }
    if !self.sequences.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.sequences, fieldNumber: 4)
    }
    if !self.genMsgs.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.genMsgs, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Starnamed_X_Wasm_V1beta1_GenesisState, rhs: Starnamed_X_Wasm_V1beta1_GenesisState) -> Bool {
    if lhs._params != rhs._params {return false}
    if lhs.codes != rhs.codes {return false}
    if lhs.contracts != rhs.contracts {return false}
    if lhs.sequences != rhs.sequences {return false}
    if lhs.genMsgs != rhs.genMsgs {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Starnamed_X_Wasm_V1beta1_GenesisState.GenMsgs: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = Starnamed_X_Wasm_V1beta1_GenesisState.protoMessageName + ".GenMsgs"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "store_code"),
    2: .standard(proto: "instantiate_contract"),
    3: .standard(proto: "execute_contract"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try {
        var v: Starnamed_X_Wasm_V1beta1_MsgStoreCode?
        var hadOneofValue = false
        if let current = self.sum {
          hadOneofValue = true
          if case .storeCode(let m) = current {v = m}
        }
        try decoder.decodeSingularMessageField(value: &v)
        if let v = v {
          if hadOneofValue {try decoder.handleConflictingOneOf()}
          self.sum = .storeCode(v)
        }
      }()
      case 2: try {
        var v: Starnamed_X_Wasm_V1beta1_MsgInstantiateContract?
        var hadOneofValue = false
        if let current = self.sum {
          hadOneofValue = true
          if case .instantiateContract(let m) = current {v = m}
        }
        try decoder.decodeSingularMessageField(value: &v)
        if let v = v {
          if hadOneofValue {try decoder.handleConflictingOneOf()}
          self.sum = .instantiateContract(v)
        }
      }()
      case 3: try {
        var v: Starnamed_X_Wasm_V1beta1_MsgExecuteContract?
        var hadOneofValue = false
        if let current = self.sum {
          hadOneofValue = true
          if case .executeContract(let m) = current {v = m}
        }
        try decoder.decodeSingularMessageField(value: &v)
        if let v = v {
          if hadOneofValue {try decoder.handleConflictingOneOf()}
          self.sum = .executeContract(v)
        }
      }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every case branch when no optimizations are
    // enabled. https://github.com/apple/swift-protobuf/issues/1034
    switch self.sum {
    case .storeCode?: try {
      guard case .storeCode(let v)? = self.sum else { preconditionFailure() }
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    }()
    case .instantiateContract?: try {
      guard case .instantiateContract(let v)? = self.sum else { preconditionFailure() }
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    }()
    case .executeContract?: try {
      guard case .executeContract(let v)? = self.sum else { preconditionFailure() }
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    }()
    case nil: break
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Starnamed_X_Wasm_V1beta1_GenesisState.GenMsgs, rhs: Starnamed_X_Wasm_V1beta1_GenesisState.GenMsgs) -> Bool {
    if lhs.sum != rhs.sum {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Starnamed_X_Wasm_V1beta1_Code: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Code"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "code_id"),
    2: .standard(proto: "code_info"),
    3: .standard(proto: "code_bytes"),
    4: .same(proto: "pinned"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.codeID) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._codeInfo) }()
      case 3: try { try decoder.decodeSingularBytesField(value: &self.codeBytes) }()
      case 4: try { try decoder.decodeSingularBoolField(value: &self.pinned) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.codeID != 0 {
      try visitor.visitSingularUInt64Field(value: self.codeID, fieldNumber: 1)
    }
    if let v = self._codeInfo {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    }
    if !self.codeBytes.isEmpty {
      try visitor.visitSingularBytesField(value: self.codeBytes, fieldNumber: 3)
    }
    if self.pinned != false {
      try visitor.visitSingularBoolField(value: self.pinned, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Starnamed_X_Wasm_V1beta1_Code, rhs: Starnamed_X_Wasm_V1beta1_Code) -> Bool {
    if lhs.codeID != rhs.codeID {return false}
    if lhs._codeInfo != rhs._codeInfo {return false}
    if lhs.codeBytes != rhs.codeBytes {return false}
    if lhs.pinned != rhs.pinned {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Starnamed_X_Wasm_V1beta1_Contract: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Contract"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "contract_address"),
    2: .standard(proto: "contract_info"),
    3: .standard(proto: "contract_state"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.contractAddress) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._contractInfo) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.contractState) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.contractAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.contractAddress, fieldNumber: 1)
    }
    if let v = self._contractInfo {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    }
    if !self.contractState.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.contractState, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Starnamed_X_Wasm_V1beta1_Contract, rhs: Starnamed_X_Wasm_V1beta1_Contract) -> Bool {
    if lhs.contractAddress != rhs.contractAddress {return false}
    if lhs._contractInfo != rhs._contractInfo {return false}
    if lhs.contractState != rhs.contractState {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Starnamed_X_Wasm_V1beta1_Sequence: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Sequence"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "id_key"),
    2: .same(proto: "value"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.idKey) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.value) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.idKey.isEmpty {
      try visitor.visitSingularBytesField(value: self.idKey, fieldNumber: 1)
    }
    if self.value != 0 {
      try visitor.visitSingularUInt64Field(value: self.value, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Starnamed_X_Wasm_V1beta1_Sequence, rhs: Starnamed_X_Wasm_V1beta1_Sequence) -> Bool {
    if lhs.idKey != rhs.idKey {return false}
    if lhs.value != rhs.value {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
