// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/tx.proto

package io.provenance.metadata.v1;

public interface MsgWriteRecordResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.metadata.v1.MsgWriteRecordResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * record_id_info contains information about the id/address of the record that was added or updated.
   * </pre>
   *
   * <code>.provenance.metadata.v1.RecordIdInfo record_id_info = 1 [(.gogoproto.moretags) = "yaml:&#92;"record_id_info&#92;""];</code>
   * @return Whether the recordIdInfo field is set.
   */
  boolean hasRecordIdInfo();
  /**
   * <pre>
   * record_id_info contains information about the id/address of the record that was added or updated.
   * </pre>
   *
   * <code>.provenance.metadata.v1.RecordIdInfo record_id_info = 1 [(.gogoproto.moretags) = "yaml:&#92;"record_id_info&#92;""];</code>
   * @return The recordIdInfo.
   */
  io.provenance.metadata.v1.RecordIdInfo getRecordIdInfo();
  /**
   * <pre>
   * record_id_info contains information about the id/address of the record that was added or updated.
   * </pre>
   *
   * <code>.provenance.metadata.v1.RecordIdInfo record_id_info = 1 [(.gogoproto.moretags) = "yaml:&#92;"record_id_info&#92;""];</code>
   */
  io.provenance.metadata.v1.RecordIdInfoOrBuilder getRecordIdInfoOrBuilder();
}
