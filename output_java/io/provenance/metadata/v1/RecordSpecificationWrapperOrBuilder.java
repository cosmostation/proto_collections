// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/query.proto

package io.provenance.metadata.v1;

public interface RecordSpecificationWrapperOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.metadata.v1.RecordSpecificationWrapper)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * specification is the on-chain record specification message.
   * </pre>
   *
   * <code>.provenance.metadata.v1.RecordSpecification specification = 1;</code>
   * @return Whether the specification field is set.
   */
  boolean hasSpecification();
  /**
   * <pre>
   * specification is the on-chain record specification message.
   * </pre>
   *
   * <code>.provenance.metadata.v1.RecordSpecification specification = 1;</code>
   * @return The specification.
   */
  io.provenance.metadata.v1.RecordSpecification getSpecification();
  /**
   * <pre>
   * specification is the on-chain record specification message.
   * </pre>
   *
   * <code>.provenance.metadata.v1.RecordSpecification specification = 1;</code>
   */
  io.provenance.metadata.v1.RecordSpecificationOrBuilder getSpecificationOrBuilder();

  /**
   * <pre>
   * record_spec_id_info contains information about the id/address of the record specification.
   * </pre>
   *
   * <code>.provenance.metadata.v1.RecordSpecIdInfo record_spec_id_info = 2 [(.gogoproto.moretags) = "yaml:&#92;"record_spec_id_info&#92;""];</code>
   * @return Whether the recordSpecIdInfo field is set.
   */
  boolean hasRecordSpecIdInfo();
  /**
   * <pre>
   * record_spec_id_info contains information about the id/address of the record specification.
   * </pre>
   *
   * <code>.provenance.metadata.v1.RecordSpecIdInfo record_spec_id_info = 2 [(.gogoproto.moretags) = "yaml:&#92;"record_spec_id_info&#92;""];</code>
   * @return The recordSpecIdInfo.
   */
  io.provenance.metadata.v1.RecordSpecIdInfo getRecordSpecIdInfo();
  /**
   * <pre>
   * record_spec_id_info contains information about the id/address of the record specification.
   * </pre>
   *
   * <code>.provenance.metadata.v1.RecordSpecIdInfo record_spec_id_info = 2 [(.gogoproto.moretags) = "yaml:&#92;"record_spec_id_info&#92;""];</code>
   */
  io.provenance.metadata.v1.RecordSpecIdInfoOrBuilder getRecordSpecIdInfoOrBuilder();
}
