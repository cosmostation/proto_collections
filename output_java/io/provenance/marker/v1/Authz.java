// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/marker/v1/authz.proto

package io.provenance.marker.v1;

public final class Authz {
  private Authz() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_provenance_marker_v1_MarkerTransferAuthorization_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_provenance_marker_v1_MarkerTransferAuthorization_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n provenance/marker/v1/authz.proto\022\024prov" +
      "enance.marker.v1\032\024gogoproto/gogo.proto\032\031" +
      "cosmos_proto/cosmos.proto\032\036cosmos/base/v" +
      "1beta1/coin.proto\"\225\001\n\033MarkerTransferAuth" +
      "orization\022c\n\016transfer_limit\030\001 \003(\0132\031.cosm" +
      "os.base.v1beta1.CoinB0\310\336\037\000\252\337\037(github.com" +
      "/cosmos/cosmos-sdk/types.Coins:\021\312\264-\rAuth" +
      "orizationBO\n\027io.provenance.marker.v1P\001Z2" +
      "github.com/provenance-io/provenance/x/ma" +
      "rker/typesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf2.GoGoProtos.getDescriptor(),
          cosmos_proto.Cosmos.getDescriptor(),
          cosmos.base.v1beta1.CoinOuterClass.getDescriptor(),
        });
    internal_static_provenance_marker_v1_MarkerTransferAuthorization_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_provenance_marker_v1_MarkerTransferAuthorization_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_provenance_marker_v1_MarkerTransferAuthorization_descriptor,
        new java.lang.String[] { "TransferLimit", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(cosmos_proto.Cosmos.implementsInterface);
    registry.add(com.google.protobuf2.GoGoProtos.castrepeated);
    registry.add(com.google.protobuf2.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf2.GoGoProtos.getDescriptor();
    cosmos_proto.Cosmos.getDescriptor();
    cosmos.base.v1beta1.CoinOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
