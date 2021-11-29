// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: cosmos/gov/v1beta1/gov.proto
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

/// VoteOption enumerates the valid vote options for a given governance proposal.
enum Cosmos_Gov_V1beta1_VoteOption: SwiftProtobuf.Enum {
  typealias RawValue = Int

  /// VOTE_OPTION_UNSPECIFIED defines a no-op vote option.
  case unspecified // = 0

  /// VOTE_OPTION_YES defines a yes vote option.
  case yes // = 1

  /// VOTE_OPTION_ABSTAIN defines an abstain vote option.
  case abstain // = 2

  /// VOTE_OPTION_NO defines a no vote option.
  case no // = 3

  /// VOTE_OPTION_NO_WITH_VETO defines a no with veto vote option.
  case noWithVeto // = 4
  case UNRECOGNIZED(Int)

  init() {
    self = .unspecified
  }

  init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .unspecified
    case 1: self = .yes
    case 2: self = .abstain
    case 3: self = .no
    case 4: self = .noWithVeto
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  var rawValue: Int {
    switch self {
    case .unspecified: return 0
    case .yes: return 1
    case .abstain: return 2
    case .no: return 3
    case .noWithVeto: return 4
    case .UNRECOGNIZED(let i): return i
    }
  }

}

#if swift(>=4.2)

extension Cosmos_Gov_V1beta1_VoteOption: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [Cosmos_Gov_V1beta1_VoteOption] = [
    .unspecified,
    .yes,
    .abstain,
    .no,
    .noWithVeto,
  ]
}

#endif  // swift(>=4.2)

/// ProposalStatus enumerates the valid statuses of a proposal.
enum Cosmos_Gov_V1beta1_ProposalStatus: SwiftProtobuf.Enum {
  typealias RawValue = Int

  /// PROPOSAL_STATUS_UNSPECIFIED defines the default propopsal status.
  case unspecified // = 0

  /// PROPOSAL_STATUS_DEPOSIT_PERIOD defines a proposal status during the deposit
  /// period.
  case depositPeriod // = 1

  /// PROPOSAL_STATUS_VOTING_PERIOD defines a proposal status during the voting
  /// period.
  case votingPeriod // = 2

  /// PROPOSAL_STATUS_PASSED defines a proposal status of a proposal that has
  /// passed.
  case passed // = 3

  /// PROPOSAL_STATUS_REJECTED defines a proposal status of a proposal that has
  /// been rejected.
  case rejected // = 4

  /// PROPOSAL_STATUS_FAILED defines a proposal status of a proposal that has
  /// failed.
  case failed // = 5
  case UNRECOGNIZED(Int)

  init() {
    self = .unspecified
  }

  init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .unspecified
    case 1: self = .depositPeriod
    case 2: self = .votingPeriod
    case 3: self = .passed
    case 4: self = .rejected
    case 5: self = .failed
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  var rawValue: Int {
    switch self {
    case .unspecified: return 0
    case .depositPeriod: return 1
    case .votingPeriod: return 2
    case .passed: return 3
    case .rejected: return 4
    case .failed: return 5
    case .UNRECOGNIZED(let i): return i
    }
  }

}

#if swift(>=4.2)

extension Cosmos_Gov_V1beta1_ProposalStatus: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [Cosmos_Gov_V1beta1_ProposalStatus] = [
    .unspecified,
    .depositPeriod,
    .votingPeriod,
    .passed,
    .rejected,
    .failed,
  ]
}

#endif  // swift(>=4.2)

/// WeightedVoteOption defines a unit of vote for vote split.
///
/// Since: cosmos-sdk 0.43
struct Cosmos_Gov_V1beta1_WeightedVoteOption {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var option: Cosmos_Gov_V1beta1_VoteOption = .unspecified

  var weight: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// TextProposal defines a standard text proposal whose changes need to be
/// manually updated in case of approval.
struct Cosmos_Gov_V1beta1_TextProposal {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var title: String = String()

  var description_p: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// Deposit defines an amount deposited by an account address to an active
/// proposal.
struct Cosmos_Gov_V1beta1_Deposit {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var proposalID: UInt64 = 0

  var depositor: String = String()

  var amount: [Cosmos_Base_V1beta1_Coin] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// Proposal defines the core field members of a governance proposal.
struct Cosmos_Gov_V1beta1_Proposal {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var proposalID: UInt64 = 0

  var content: SwiftProtobuf.Google_Protobuf_Any {
    get {return _content ?? SwiftProtobuf.Google_Protobuf_Any()}
    set {_content = newValue}
  }
  /// Returns true if `content` has been explicitly set.
  var hasContent: Bool {return self._content != nil}
  /// Clears the value of `content`. Subsequent reads from it will return its default value.
  mutating func clearContent() {self._content = nil}

  var status: Cosmos_Gov_V1beta1_ProposalStatus = .unspecified

  var finalTallyResult: Cosmos_Gov_V1beta1_TallyResult {
    get {return _finalTallyResult ?? Cosmos_Gov_V1beta1_TallyResult()}
    set {_finalTallyResult = newValue}
  }
  /// Returns true if `finalTallyResult` has been explicitly set.
  var hasFinalTallyResult: Bool {return self._finalTallyResult != nil}
  /// Clears the value of `finalTallyResult`. Subsequent reads from it will return its default value.
  mutating func clearFinalTallyResult() {self._finalTallyResult = nil}

  var submitTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _submitTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_submitTime = newValue}
  }
  /// Returns true if `submitTime` has been explicitly set.
  var hasSubmitTime: Bool {return self._submitTime != nil}
  /// Clears the value of `submitTime`. Subsequent reads from it will return its default value.
  mutating func clearSubmitTime() {self._submitTime = nil}

  var depositEndTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _depositEndTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_depositEndTime = newValue}
  }
  /// Returns true if `depositEndTime` has been explicitly set.
  var hasDepositEndTime: Bool {return self._depositEndTime != nil}
  /// Clears the value of `depositEndTime`. Subsequent reads from it will return its default value.
  mutating func clearDepositEndTime() {self._depositEndTime = nil}

  var totalDeposit: [Cosmos_Base_V1beta1_Coin] = []

  var votingStartTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _votingStartTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_votingStartTime = newValue}
  }
  /// Returns true if `votingStartTime` has been explicitly set.
  var hasVotingStartTime: Bool {return self._votingStartTime != nil}
  /// Clears the value of `votingStartTime`. Subsequent reads from it will return its default value.
  mutating func clearVotingStartTime() {self._votingStartTime = nil}

  var votingEndTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _votingEndTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_votingEndTime = newValue}
  }
  /// Returns true if `votingEndTime` has been explicitly set.
  var hasVotingEndTime: Bool {return self._votingEndTime != nil}
  /// Clears the value of `votingEndTime`. Subsequent reads from it will return its default value.
  mutating func clearVotingEndTime() {self._votingEndTime = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _content: SwiftProtobuf.Google_Protobuf_Any? = nil
  fileprivate var _finalTallyResult: Cosmos_Gov_V1beta1_TallyResult? = nil
  fileprivate var _submitTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
  fileprivate var _depositEndTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
  fileprivate var _votingStartTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
  fileprivate var _votingEndTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
}

/// TallyResult defines a standard tally for a governance proposal.
struct Cosmos_Gov_V1beta1_TallyResult {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var yes: String = String()

  var abstain: String = String()

  var no: String = String()

  var noWithVeto: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// Vote defines a vote on a governance proposal.
/// A Vote consists of a proposal ID, the voter, and the vote option.
struct Cosmos_Gov_V1beta1_Vote {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var proposalID: UInt64 = 0

  var voter: String = String()

  /// Deprecated: Prefer to use `options` instead. This field is set in queries
  /// if and only if `len(options) == 1` and that option has weight 1. In all
  /// other cases, this field will default to VOTE_OPTION_UNSPECIFIED.
  var option: Cosmos_Gov_V1beta1_VoteOption = .unspecified

  /// Since: cosmos-sdk 0.43
  var options: [Cosmos_Gov_V1beta1_WeightedVoteOption] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// DepositParams defines the params for deposits on governance proposals.
struct Cosmos_Gov_V1beta1_DepositParams {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  ///  Minimum deposit for a proposal to enter voting period.
  var minDeposit: [Cosmos_Base_V1beta1_Coin] = []

  ///  Maximum period for Atom holders to deposit on a proposal. Initial value: 2
  ///  months.
  var maxDepositPeriod: SwiftProtobuf.Google_Protobuf_Duration {
    get {return _maxDepositPeriod ?? SwiftProtobuf.Google_Protobuf_Duration()}
    set {_maxDepositPeriod = newValue}
  }
  /// Returns true if `maxDepositPeriod` has been explicitly set.
  var hasMaxDepositPeriod: Bool {return self._maxDepositPeriod != nil}
  /// Clears the value of `maxDepositPeriod`. Subsequent reads from it will return its default value.
  mutating func clearMaxDepositPeriod() {self._maxDepositPeriod = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _maxDepositPeriod: SwiftProtobuf.Google_Protobuf_Duration? = nil
}

/// VotingParams defines the params for voting on governance proposals.
struct Cosmos_Gov_V1beta1_VotingParams {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  ///  Length of the voting period.
  var votingPeriod: SwiftProtobuf.Google_Protobuf_Duration {
    get {return _votingPeriod ?? SwiftProtobuf.Google_Protobuf_Duration()}
    set {_votingPeriod = newValue}
  }
  /// Returns true if `votingPeriod` has been explicitly set.
  var hasVotingPeriod: Bool {return self._votingPeriod != nil}
  /// Clears the value of `votingPeriod`. Subsequent reads from it will return its default value.
  mutating func clearVotingPeriod() {self._votingPeriod = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _votingPeriod: SwiftProtobuf.Google_Protobuf_Duration? = nil
}

/// TallyParams defines the params for tallying votes on governance proposals.
struct Cosmos_Gov_V1beta1_TallyParams {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  ///  Minimum percentage of total stake needed to vote for a result to be
  ///  considered valid.
  var quorum: Data = Data()

  ///  Minimum proportion of Yes votes for proposal to pass. Default value: 0.5.
  var threshold: Data = Data()

  ///  Minimum value of Veto votes to Total votes ratio for proposal to be
  ///  vetoed. Default value: 1/3.
  var vetoThreshold: Data = Data()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "cosmos.gov.v1beta1"

extension Cosmos_Gov_V1beta1_VoteOption: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "VOTE_OPTION_UNSPECIFIED"),
    1: .same(proto: "VOTE_OPTION_YES"),
    2: .same(proto: "VOTE_OPTION_ABSTAIN"),
    3: .same(proto: "VOTE_OPTION_NO"),
    4: .same(proto: "VOTE_OPTION_NO_WITH_VETO"),
  ]
}

extension Cosmos_Gov_V1beta1_ProposalStatus: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "PROPOSAL_STATUS_UNSPECIFIED"),
    1: .same(proto: "PROPOSAL_STATUS_DEPOSIT_PERIOD"),
    2: .same(proto: "PROPOSAL_STATUS_VOTING_PERIOD"),
    3: .same(proto: "PROPOSAL_STATUS_PASSED"),
    4: .same(proto: "PROPOSAL_STATUS_REJECTED"),
    5: .same(proto: "PROPOSAL_STATUS_FAILED"),
  ]
}

extension Cosmos_Gov_V1beta1_WeightedVoteOption: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".WeightedVoteOption"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "option"),
    2: .same(proto: "weight"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularEnumField(value: &self.option) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.weight) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.option != .unspecified {
      try visitor.visitSingularEnumField(value: self.option, fieldNumber: 1)
    }
    if !self.weight.isEmpty {
      try visitor.visitSingularStringField(value: self.weight, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Gov_V1beta1_WeightedVoteOption, rhs: Cosmos_Gov_V1beta1_WeightedVoteOption) -> Bool {
    if lhs.option != rhs.option {return false}
    if lhs.weight != rhs.weight {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Cosmos_Gov_V1beta1_TextProposal: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".TextProposal"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "title"),
    2: .same(proto: "description"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.title) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
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
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Gov_V1beta1_TextProposal, rhs: Cosmos_Gov_V1beta1_TextProposal) -> Bool {
    if lhs.title != rhs.title {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Cosmos_Gov_V1beta1_Deposit: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Deposit"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "proposal_id"),
    2: .same(proto: "depositor"),
    3: .same(proto: "amount"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.proposalID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.depositor) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.amount) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.proposalID != 0 {
      try visitor.visitSingularUInt64Field(value: self.proposalID, fieldNumber: 1)
    }
    if !self.depositor.isEmpty {
      try visitor.visitSingularStringField(value: self.depositor, fieldNumber: 2)
    }
    if !self.amount.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.amount, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Gov_V1beta1_Deposit, rhs: Cosmos_Gov_V1beta1_Deposit) -> Bool {
    if lhs.proposalID != rhs.proposalID {return false}
    if lhs.depositor != rhs.depositor {return false}
    if lhs.amount != rhs.amount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Cosmos_Gov_V1beta1_Proposal: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Proposal"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "proposal_id"),
    2: .same(proto: "content"),
    3: .same(proto: "status"),
    4: .standard(proto: "final_tally_result"),
    5: .standard(proto: "submit_time"),
    6: .standard(proto: "deposit_end_time"),
    7: .standard(proto: "total_deposit"),
    8: .standard(proto: "voting_start_time"),
    9: .standard(proto: "voting_end_time"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.proposalID) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._content) }()
      case 3: try { try decoder.decodeSingularEnumField(value: &self.status) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._finalTallyResult) }()
      case 5: try { try decoder.decodeSingularMessageField(value: &self._submitTime) }()
      case 6: try { try decoder.decodeSingularMessageField(value: &self._depositEndTime) }()
      case 7: try { try decoder.decodeRepeatedMessageField(value: &self.totalDeposit) }()
      case 8: try { try decoder.decodeSingularMessageField(value: &self._votingStartTime) }()
      case 9: try { try decoder.decodeSingularMessageField(value: &self._votingEndTime) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.proposalID != 0 {
      try visitor.visitSingularUInt64Field(value: self.proposalID, fieldNumber: 1)
    }
    if let v = self._content {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    }
    if self.status != .unspecified {
      try visitor.visitSingularEnumField(value: self.status, fieldNumber: 3)
    }
    if let v = self._finalTallyResult {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    }
    if let v = self._submitTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
    }
    if let v = self._depositEndTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 6)
    }
    if !self.totalDeposit.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.totalDeposit, fieldNumber: 7)
    }
    if let v = self._votingStartTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 8)
    }
    if let v = self._votingEndTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 9)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Gov_V1beta1_Proposal, rhs: Cosmos_Gov_V1beta1_Proposal) -> Bool {
    if lhs.proposalID != rhs.proposalID {return false}
    if lhs._content != rhs._content {return false}
    if lhs.status != rhs.status {return false}
    if lhs._finalTallyResult != rhs._finalTallyResult {return false}
    if lhs._submitTime != rhs._submitTime {return false}
    if lhs._depositEndTime != rhs._depositEndTime {return false}
    if lhs.totalDeposit != rhs.totalDeposit {return false}
    if lhs._votingStartTime != rhs._votingStartTime {return false}
    if lhs._votingEndTime != rhs._votingEndTime {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Cosmos_Gov_V1beta1_TallyResult: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".TallyResult"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "yes"),
    2: .same(proto: "abstain"),
    3: .same(proto: "no"),
    4: .standard(proto: "no_with_veto"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.yes) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.abstain) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.no) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.noWithVeto) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.yes.isEmpty {
      try visitor.visitSingularStringField(value: self.yes, fieldNumber: 1)
    }
    if !self.abstain.isEmpty {
      try visitor.visitSingularStringField(value: self.abstain, fieldNumber: 2)
    }
    if !self.no.isEmpty {
      try visitor.visitSingularStringField(value: self.no, fieldNumber: 3)
    }
    if !self.noWithVeto.isEmpty {
      try visitor.visitSingularStringField(value: self.noWithVeto, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Gov_V1beta1_TallyResult, rhs: Cosmos_Gov_V1beta1_TallyResult) -> Bool {
    if lhs.yes != rhs.yes {return false}
    if lhs.abstain != rhs.abstain {return false}
    if lhs.no != rhs.no {return false}
    if lhs.noWithVeto != rhs.noWithVeto {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Cosmos_Gov_V1beta1_Vote: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Vote"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "proposal_id"),
    2: .same(proto: "voter"),
    3: .same(proto: "option"),
    4: .same(proto: "options"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.proposalID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.voter) }()
      case 3: try { try decoder.decodeSingularEnumField(value: &self.option) }()
      case 4: try { try decoder.decodeRepeatedMessageField(value: &self.options) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.proposalID != 0 {
      try visitor.visitSingularUInt64Field(value: self.proposalID, fieldNumber: 1)
    }
    if !self.voter.isEmpty {
      try visitor.visitSingularStringField(value: self.voter, fieldNumber: 2)
    }
    if self.option != .unspecified {
      try visitor.visitSingularEnumField(value: self.option, fieldNumber: 3)
    }
    if !self.options.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.options, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Gov_V1beta1_Vote, rhs: Cosmos_Gov_V1beta1_Vote) -> Bool {
    if lhs.proposalID != rhs.proposalID {return false}
    if lhs.voter != rhs.voter {return false}
    if lhs.option != rhs.option {return false}
    if lhs.options != rhs.options {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Cosmos_Gov_V1beta1_DepositParams: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".DepositParams"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "min_deposit"),
    2: .standard(proto: "max_deposit_period"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.minDeposit) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._maxDepositPeriod) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.minDeposit.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.minDeposit, fieldNumber: 1)
    }
    if let v = self._maxDepositPeriod {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Gov_V1beta1_DepositParams, rhs: Cosmos_Gov_V1beta1_DepositParams) -> Bool {
    if lhs.minDeposit != rhs.minDeposit {return false}
    if lhs._maxDepositPeriod != rhs._maxDepositPeriod {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Cosmos_Gov_V1beta1_VotingParams: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".VotingParams"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "voting_period"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._votingPeriod) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if let v = self._votingPeriod {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Gov_V1beta1_VotingParams, rhs: Cosmos_Gov_V1beta1_VotingParams) -> Bool {
    if lhs._votingPeriod != rhs._votingPeriod {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Cosmos_Gov_V1beta1_TallyParams: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".TallyParams"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "quorum"),
    2: .same(proto: "threshold"),
    3: .standard(proto: "veto_threshold"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.quorum) }()
      case 2: try { try decoder.decodeSingularBytesField(value: &self.threshold) }()
      case 3: try { try decoder.decodeSingularBytesField(value: &self.vetoThreshold) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.quorum.isEmpty {
      try visitor.visitSingularBytesField(value: self.quorum, fieldNumber: 1)
    }
    if !self.threshold.isEmpty {
      try visitor.visitSingularBytesField(value: self.threshold, fieldNumber: 2)
    }
    if !self.vetoThreshold.isEmpty {
      try visitor.visitSingularBytesField(value: self.vetoThreshold, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Gov_V1beta1_TallyParams, rhs: Cosmos_Gov_V1beta1_TallyParams) -> Bool {
    if lhs.quorum != rhs.quorum {return false}
    if lhs.threshold != rhs.threshold {return false}
    if lhs.vetoThreshold != rhs.vetoThreshold {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
