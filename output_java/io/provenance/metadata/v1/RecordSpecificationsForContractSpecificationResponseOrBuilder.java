// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/query.proto

package io.provenance.metadata.v1;

public interface RecordSpecificationsForContractSpecificationResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * record_specifications is any number of wrapped record specifications associated with this contract_specification.
   * </pre>
   *
   * <code>repeated .provenance.metadata.v1.RecordSpecificationWrapper record_specifications = 1 [(.gogoproto.moretags) = "yaml:&#92;"record_specifications&#92;""];</code>
   */
  java.util.List<io.provenance.metadata.v1.RecordSpecificationWrapper> 
      getRecordSpecificationsList();
  /**
   * <pre>
   * record_specifications is any number of wrapped record specifications associated with this contract_specification.
   * </pre>
   *
   * <code>repeated .provenance.metadata.v1.RecordSpecificationWrapper record_specifications = 1 [(.gogoproto.moretags) = "yaml:&#92;"record_specifications&#92;""];</code>
   */
  io.provenance.metadata.v1.RecordSpecificationWrapper getRecordSpecifications(int index);
  /**
   * <pre>
   * record_specifications is any number of wrapped record specifications associated with this contract_specification.
   * </pre>
   *
   * <code>repeated .provenance.metadata.v1.RecordSpecificationWrapper record_specifications = 1 [(.gogoproto.moretags) = "yaml:&#92;"record_specifications&#92;""];</code>
   */
  int getRecordSpecificationsCount();
  /**
   * <pre>
   * record_specifications is any number of wrapped record specifications associated with this contract_specification.
   * </pre>
   *
   * <code>repeated .provenance.metadata.v1.RecordSpecificationWrapper record_specifications = 1 [(.gogoproto.moretags) = "yaml:&#92;"record_specifications&#92;""];</code>
   */
  java.util.List<? extends io.provenance.metadata.v1.RecordSpecificationWrapperOrBuilder> 
      getRecordSpecificationsOrBuilderList();
  /**
   * <pre>
   * record_specifications is any number of wrapped record specifications associated with this contract_specification.
   * </pre>
   *
   * <code>repeated .provenance.metadata.v1.RecordSpecificationWrapper record_specifications = 1 [(.gogoproto.moretags) = "yaml:&#92;"record_specifications&#92;""];</code>
   */
  io.provenance.metadata.v1.RecordSpecificationWrapperOrBuilder getRecordSpecificationsOrBuilder(
      int index);

  /**
   * <pre>
   * contract_specification_uuid is the uuid of this contract specification.
   * </pre>
   *
   * <code>string contract_specification_uuid = 2 [(.gogoproto.moretags) = "yaml:&#92;"contract_specification_uuid&#92;""];</code>
   * @return The contractSpecificationUuid.
   */
  java.lang.String getContractSpecificationUuid();
  /**
   * <pre>
   * contract_specification_uuid is the uuid of this contract specification.
   * </pre>
   *
   * <code>string contract_specification_uuid = 2 [(.gogoproto.moretags) = "yaml:&#92;"contract_specification_uuid&#92;""];</code>
   * @return The bytes for contractSpecificationUuid.
   */
  com.google.protobuf.ByteString
      getContractSpecificationUuidBytes();

  /**
   * <pre>
   * contract_specification_addr is the contract specification address as a bech32 encoded string.
   * </pre>
   *
   * <code>string contract_specification_addr = 3 [(.gogoproto.moretags) = "yaml:&#92;"contract_specification_addr&#92;""];</code>
   * @return The contractSpecificationAddr.
   */
  java.lang.String getContractSpecificationAddr();
  /**
   * <pre>
   * contract_specification_addr is the contract specification address as a bech32 encoded string.
   * </pre>
   *
   * <code>string contract_specification_addr = 3 [(.gogoproto.moretags) = "yaml:&#92;"contract_specification_addr&#92;""];</code>
   * @return The bytes for contractSpecificationAddr.
   */
  com.google.protobuf.ByteString
      getContractSpecificationAddrBytes();

  /**
   * <pre>
   * request is a copy of the request that generated these results.
   * </pre>
   *
   * <code>.provenance.metadata.v1.RecordSpecificationsForContractSpecificationRequest request = 98;</code>
   * @return Whether the request field is set.
   */
  boolean hasRequest();
  /**
   * <pre>
   * request is a copy of the request that generated these results.
   * </pre>
   *
   * <code>.provenance.metadata.v1.RecordSpecificationsForContractSpecificationRequest request = 98;</code>
   * @return The request.
   */
  io.provenance.metadata.v1.RecordSpecificationsForContractSpecificationRequest getRequest();
  /**
   * <pre>
   * request is a copy of the request that generated these results.
   * </pre>
   *
   * <code>.provenance.metadata.v1.RecordSpecificationsForContractSpecificationRequest request = 98;</code>
   */
  io.provenance.metadata.v1.RecordSpecificationsForContractSpecificationRequestOrBuilder getRequestOrBuilder();
}
