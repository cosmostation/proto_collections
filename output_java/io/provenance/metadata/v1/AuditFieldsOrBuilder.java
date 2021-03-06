// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/scope.proto

package io.provenance.metadata.v1;

public interface AuditFieldsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.metadata.v1.AuditFields)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the date/time when this entry was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_date = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "created_date,omitempty", (.gogoproto.moretags) = "yaml:&#92;"created_date,omitempty&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return Whether the createdDate field is set.
   */
  boolean hasCreatedDate();
  /**
   * <pre>
   * the date/time when this entry was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_date = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "created_date,omitempty", (.gogoproto.moretags) = "yaml:&#92;"created_date,omitempty&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return The createdDate.
   */
  com.google.protobuf.Timestamp getCreatedDate();
  /**
   * <pre>
   * the date/time when this entry was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_date = 1 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "created_date,omitempty", (.gogoproto.moretags) = "yaml:&#92;"created_date,omitempty&#92;"", (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedDateOrBuilder();

  /**
   * <pre>
   * the address of the account that created this record
   * </pre>
   *
   * <code>string created_by = 2 [(.gogoproto.moretags) = "yaml:&#92;"created_by,omitempty&#92;""];</code>
   * @return The createdBy.
   */
  java.lang.String getCreatedBy();
  /**
   * <pre>
   * the address of the account that created this record
   * </pre>
   *
   * <code>string created_by = 2 [(.gogoproto.moretags) = "yaml:&#92;"created_by,omitempty&#92;""];</code>
   * @return The bytes for createdBy.
   */
  com.google.protobuf.ByteString
      getCreatedByBytes();

  /**
   * <pre>
   * the date/time when this entry was last updated
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updated_date = 3 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "updated_date,omitempty", (.gogoproto.moretags) = "yaml:&#92;"updated_date,omitempty&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return Whether the updatedDate field is set.
   */
  boolean hasUpdatedDate();
  /**
   * <pre>
   * the date/time when this entry was last updated
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updated_date = 3 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "updated_date,omitempty", (.gogoproto.moretags) = "yaml:&#92;"updated_date,omitempty&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return The updatedDate.
   */
  com.google.protobuf.Timestamp getUpdatedDate();
  /**
   * <pre>
   * the date/time when this entry was last updated
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updated_date = 3 [(.gogoproto.nullable) = false, (.gogoproto.jsontag) = "updated_date,omitempty", (.gogoproto.moretags) = "yaml:&#92;"updated_date,omitempty&#92;"", (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdatedDateOrBuilder();

  /**
   * <pre>
   * the address of the account that modified this record
   * </pre>
   *
   * <code>string updated_by = 4 [(.gogoproto.moretags) = "yaml:&#92;"updated_by,omitempty&#92;""];</code>
   * @return The updatedBy.
   */
  java.lang.String getUpdatedBy();
  /**
   * <pre>
   * the address of the account that modified this record
   * </pre>
   *
   * <code>string updated_by = 4 [(.gogoproto.moretags) = "yaml:&#92;"updated_by,omitempty&#92;""];</code>
   * @return The bytes for updatedBy.
   */
  com.google.protobuf.ByteString
      getUpdatedByBytes();

  /**
   * <pre>
   * an optional version number that is incremented with each update
   * </pre>
   *
   * <code>uint32 version = 5 [(.gogoproto.moretags) = "yaml:&#92;"version,omitempty&#92;""];</code>
   * @return The version.
   */
  int getVersion();

  /**
   * <pre>
   * an optional message associated with the creation/update event
   * </pre>
   *
   * <code>string message = 6 [(.gogoproto.moretags) = "yaml:&#92;"message,omitempty&#92;""];</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * an optional message associated with the creation/update event
   * </pre>
   *
   * <code>string message = 6 [(.gogoproto.moretags) = "yaml:&#92;"message,omitempty&#92;""];</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}
