// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/name/v1/query.proto

package io.provenance.name.v1;

public interface QueryReverseLookupRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.name.v1.QueryReverseLookupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * address to find name records for
   * </pre>
   *
   * <code>string address = 1;</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <pre>
   * address to find name records for
   * </pre>
   *
   * <code>string address = 1;</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <pre>
   * pagination defines an optional pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2;</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <pre>
   * pagination defines an optional pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2;</code>
   * @return The pagination.
   */
  cosmos.base.query.v1beta1.Pagination.PageRequest getPagination();
  /**
   * <pre>
   * pagination defines an optional pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2;</code>
   */
  cosmos.base.query.v1beta1.Pagination.PageRequestOrBuilder getPaginationOrBuilder();
}
