// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/tx.proto

package io.provenance.metadata.v1;

public interface MsgWriteScopeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.metadata.v1.MsgWriteScopeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * scope_id_info contains information about the id/address of the scope that was added or updated.
   * </pre>
   *
   * <code>.provenance.metadata.v1.ScopeIdInfo scope_id_info = 1 [(.gogoproto.moretags) = "yaml:&#92;"scope_id_info&#92;""];</code>
   * @return Whether the scopeIdInfo field is set.
   */
  boolean hasScopeIdInfo();
  /**
   * <pre>
   * scope_id_info contains information about the id/address of the scope that was added or updated.
   * </pre>
   *
   * <code>.provenance.metadata.v1.ScopeIdInfo scope_id_info = 1 [(.gogoproto.moretags) = "yaml:&#92;"scope_id_info&#92;""];</code>
   * @return The scopeIdInfo.
   */
  io.provenance.metadata.v1.ScopeIdInfo getScopeIdInfo();
  /**
   * <pre>
   * scope_id_info contains information about the id/address of the scope that was added or updated.
   * </pre>
   *
   * <code>.provenance.metadata.v1.ScopeIdInfo scope_id_info = 1 [(.gogoproto.moretags) = "yaml:&#92;"scope_id_info&#92;""];</code>
   */
  io.provenance.metadata.v1.ScopeIdInfoOrBuilder getScopeIdInfoOrBuilder();
}
