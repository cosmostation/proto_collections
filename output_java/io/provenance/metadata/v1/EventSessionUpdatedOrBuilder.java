// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/events.proto

package io.provenance.metadata.v1;

public interface EventSessionUpdatedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.metadata.v1.EventSessionUpdated)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * session_addr is the bech32 address string of the session id that was updated.
   * </pre>
   *
   * <code>string session_addr = 1;</code>
   * @return The sessionAddr.
   */
  java.lang.String getSessionAddr();
  /**
   * <pre>
   * session_addr is the bech32 address string of the session id that was updated.
   * </pre>
   *
   * <code>string session_addr = 1;</code>
   * @return The bytes for sessionAddr.
   */
  com.google.protobuf.ByteString
      getSessionAddrBytes();

  /**
   * <pre>
   * scope_addr is the bech32 address string of the scope id this session belongs to.
   * </pre>
   *
   * <code>string scope_addr = 2;</code>
   * @return The scopeAddr.
   */
  java.lang.String getScopeAddr();
  /**
   * <pre>
   * scope_addr is the bech32 address string of the scope id this session belongs to.
   * </pre>
   *
   * <code>string scope_addr = 2;</code>
   * @return The bytes for scopeAddr.
   */
  com.google.protobuf.ByteString
      getScopeAddrBytes();
}
