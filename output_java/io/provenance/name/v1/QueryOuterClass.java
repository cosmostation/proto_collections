// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/name/v1/query.proto

package io.provenance.name.v1;

public final class QueryOuterClass {
  private QueryOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_provenance_name_v1_QueryParamsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_provenance_name_v1_QueryParamsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_provenance_name_v1_QueryParamsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_provenance_name_v1_QueryParamsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_provenance_name_v1_QueryResolveRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_provenance_name_v1_QueryResolveRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_provenance_name_v1_QueryResolveResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_provenance_name_v1_QueryResolveResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_provenance_name_v1_QueryReverseLookupRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_provenance_name_v1_QueryReverseLookupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_provenance_name_v1_QueryReverseLookupResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_provenance_name_v1_QueryReverseLookupResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036provenance/name/v1/query.proto\022\022proven" +
      "ance.name.v1\032*cosmos/base/query/v1beta1/" +
      "pagination.proto\032\024gogoproto/gogo.proto\032\034" +
      "google/api/annotations.proto\032\035provenance" +
      "/name/v1/name.proto\"\024\n\022QueryParamsReques" +
      "t\"G\n\023QueryParamsResponse\0220\n\006params\030\001 \001(\013" +
      "2\032.provenance.name.v1.ParamsB\004\310\336\037\000\"-\n\023Qu" +
      "eryResolveRequest\022\014\n\004name\030\001 \001(\t:\010\350\240\037\000\210\240\037" +
      "\000\"\'\n\024QueryResolveResponse\022\017\n\007address\030\001 \001" +
      "(\t\"r\n\031QueryReverseLookupRequest\022\017\n\007addre" +
      "ss\030\001 \001(\t\022:\n\npagination\030\002 \001(\0132&.cosmos.ba" +
      "se.query.v1beta1.PageRequest:\010\350\240\037\000\210\240\037\000\"q" +
      "\n\032QueryReverseLookupResponse\022\014\n\004name\030\001 \003" +
      "(\t\022;\n\npagination\030\002 \001(\0132\'.cosmos.base.que" +
      "ry.v1beta1.PageResponse:\010\350\240\037\000\210\240\037\0002\260\003\n\005Qu" +
      "ery\022}\n\006Params\022&.provenance.name.v1.Query" +
      "ParamsRequest\032\'.provenance.name.v1.Query" +
      "ParamsResponse\"\"\202\323\344\223\002\034\022\032/provenance/name" +
      "/v1/params\022\210\001\n\007Resolve\022\'.provenance.name" +
      ".v1.QueryResolveRequest\032(.provenance.nam" +
      "e.v1.QueryResolveResponse\"*\202\323\344\223\002$\022\"/prov" +
      "enance/name/v1/resolve/{name}\022\234\001\n\rRevers" +
      "eLookup\022-.provenance.name.v1.QueryRevers" +
      "eLookupRequest\032..provenance.name.v1.Quer" +
      "yReverseLookupResponse\",\202\323\344\223\002&\022$/provena" +
      "nce/name/v1/lookup/{address}BK\n\025io.prove" +
      "nance.name.v1P\001Z0github.com/provenance-i" +
      "o/provenance/x/name/typesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cosmos.base.query.v1beta1.Pagination.getDescriptor(),
          com.google.protobuf2.GoGoProtos.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          io.provenance.name.v1.Name.getDescriptor(),
        });
    internal_static_provenance_name_v1_QueryParamsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_provenance_name_v1_QueryParamsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_provenance_name_v1_QueryParamsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_provenance_name_v1_QueryParamsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_provenance_name_v1_QueryParamsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_provenance_name_v1_QueryParamsResponse_descriptor,
        new java.lang.String[] { "Params", });
    internal_static_provenance_name_v1_QueryResolveRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_provenance_name_v1_QueryResolveRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_provenance_name_v1_QueryResolveRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_provenance_name_v1_QueryResolveResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_provenance_name_v1_QueryResolveResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_provenance_name_v1_QueryResolveResponse_descriptor,
        new java.lang.String[] { "Address", });
    internal_static_provenance_name_v1_QueryReverseLookupRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_provenance_name_v1_QueryReverseLookupRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_provenance_name_v1_QueryReverseLookupRequest_descriptor,
        new java.lang.String[] { "Address", "Pagination", });
    internal_static_provenance_name_v1_QueryReverseLookupResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_provenance_name_v1_QueryReverseLookupResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_provenance_name_v1_QueryReverseLookupResponse_descriptor,
        new java.lang.String[] { "Name", "Pagination", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf2.GoGoProtos.equal);
    registry.add(com.google.protobuf2.GoGoProtos.goprotoGetters);
    registry.add(com.google.protobuf2.GoGoProtos.nullable);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    cosmos.base.query.v1beta1.Pagination.getDescriptor();
    com.google.protobuf2.GoGoProtos.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    io.provenance.name.v1.Name.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
