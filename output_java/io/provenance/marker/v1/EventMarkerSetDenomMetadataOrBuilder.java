// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/marker/v1/marker.proto

package io.provenance.marker.v1;

public interface EventMarkerSetDenomMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.marker.v1.EventMarkerSetDenomMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string metadata_base = 1;</code>
   * @return The metadataBase.
   */
  java.lang.String getMetadataBase();
  /**
   * <code>string metadata_base = 1;</code>
   * @return The bytes for metadataBase.
   */
  com.google.protobuf.ByteString
      getMetadataBaseBytes();

  /**
   * <code>string metadata_description = 2;</code>
   * @return The metadataDescription.
   */
  java.lang.String getMetadataDescription();
  /**
   * <code>string metadata_description = 2;</code>
   * @return The bytes for metadataDescription.
   */
  com.google.protobuf.ByteString
      getMetadataDescriptionBytes();

  /**
   * <code>string metadata_display = 3;</code>
   * @return The metadataDisplay.
   */
  java.lang.String getMetadataDisplay();
  /**
   * <code>string metadata_display = 3;</code>
   * @return The bytes for metadataDisplay.
   */
  com.google.protobuf.ByteString
      getMetadataDisplayBytes();

  /**
   * <code>repeated .provenance.marker.v1.EventDenomUnit metadata_denom_units = 4;</code>
   */
  java.util.List<io.provenance.marker.v1.EventDenomUnit> 
      getMetadataDenomUnitsList();
  /**
   * <code>repeated .provenance.marker.v1.EventDenomUnit metadata_denom_units = 4;</code>
   */
  io.provenance.marker.v1.EventDenomUnit getMetadataDenomUnits(int index);
  /**
   * <code>repeated .provenance.marker.v1.EventDenomUnit metadata_denom_units = 4;</code>
   */
  int getMetadataDenomUnitsCount();
  /**
   * <code>repeated .provenance.marker.v1.EventDenomUnit metadata_denom_units = 4;</code>
   */
  java.util.List<? extends io.provenance.marker.v1.EventDenomUnitOrBuilder> 
      getMetadataDenomUnitsOrBuilderList();
  /**
   * <code>repeated .provenance.marker.v1.EventDenomUnit metadata_denom_units = 4;</code>
   */
  io.provenance.marker.v1.EventDenomUnitOrBuilder getMetadataDenomUnitsOrBuilder(
      int index);

  /**
   * <code>string administrator = 5;</code>
   * @return The administrator.
   */
  java.lang.String getAdministrator();
  /**
   * <code>string administrator = 5;</code>
   * @return The bytes for administrator.
   */
  com.google.protobuf.ByteString
      getAdministratorBytes();

  /**
   * <code>string metadata_name = 6;</code>
   * @return The metadataName.
   */
  java.lang.String getMetadataName();
  /**
   * <code>string metadata_name = 6;</code>
   * @return The bytes for metadataName.
   */
  com.google.protobuf.ByteString
      getMetadataNameBytes();

  /**
   * <code>string metadata_symbol = 7;</code>
   * @return The metadataSymbol.
   */
  java.lang.String getMetadataSymbol();
  /**
   * <code>string metadata_symbol = 7;</code>
   * @return The bytes for metadataSymbol.
   */
  com.google.protobuf.ByteString
      getMetadataSymbolBytes();
}
