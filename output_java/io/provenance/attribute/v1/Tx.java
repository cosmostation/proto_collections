// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/attribute/v1/tx.proto

package io.provenance.attribute.v1;

public final class Tx {
  private Tx() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_provenance_attribute_v1_MsgAddAttributeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_provenance_attribute_v1_MsgAddAttributeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_provenance_attribute_v1_MsgAddAttributeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_provenance_attribute_v1_MsgAddAttributeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_provenance_attribute_v1_MsgUpdateAttributeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_provenance_attribute_v1_MsgUpdateAttributeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_provenance_attribute_v1_MsgUpdateAttributeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_provenance_attribute_v1_MsgUpdateAttributeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_provenance_attribute_v1_MsgDeleteAttributeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_provenance_attribute_v1_MsgDeleteAttributeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_provenance_attribute_v1_MsgDeleteAttributeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_provenance_attribute_v1_MsgDeleteAttributeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_provenance_attribute_v1_MsgDeleteDistinctAttributeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_provenance_attribute_v1_MsgDeleteDistinctAttributeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_provenance_attribute_v1_MsgDeleteDistinctAttributeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_provenance_attribute_v1_MsgDeleteDistinctAttributeResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n provenance/attribute/v1/tx.proto\022\027prov" +
      "enance.attribute.v1\032\024gogoproto/gogo.prot" +
      "o\032\'provenance/attribute/v1/attribute.pro" +
      "to\"\247\001\n\026MsgAddAttributeRequest\022\014\n\004name\030\001 " +
      "\001(\t\022\r\n\005value\030\002 \001(\014\022>\n\016attribute_type\030\003 \001" +
      "(\0162&.provenance.attribute.v1.AttributeTy" +
      "pe\022\017\n\007account\030\004 \001(\t\022\r\n\005owner\030\005 \001(\t:\020\350\240\037\000" +
      "\230\240\037\000\200\334 \000\210\240\037\000\"\031\n\027MsgAddAttributeResponse\"" +
      "\231\002\n\031MsgUpdateAttributeRequest\022\014\n\004name\030\001 " +
      "\001(\t\022\026\n\016original_value\030\002 \001(\014\022\024\n\014update_va" +
      "lue\030\003 \001(\014\022G\n\027original_attribute_type\030\004 \001" +
      "(\0162&.provenance.attribute.v1.AttributeTy" +
      "pe\022E\n\025update_attribute_type\030\005 \001(\0162&.prov" +
      "enance.attribute.v1.AttributeType\022\017\n\007acc" +
      "ount\030\006 \001(\t\022\r\n\005owner\030\007 \001(\t:\020\350\240\037\000\230\240\037\000\200\334 \000\210" +
      "\240\037\000\"\034\n\032MsgUpdateAttributeResponse\"[\n\031Msg" +
      "DeleteAttributeRequest\022\014\n\004name\030\001 \001(\t\022\017\n\007" +
      "account\030\002 \001(\t\022\r\n\005owner\030\003 \001(\t:\020\350\240\037\000\230\240\037\000\200\334" +
      " \000\210\240\037\000\"\034\n\032MsgDeleteAttributeResponse\"r\n!" +
      "MsgDeleteDistinctAttributeRequest\022\014\n\004nam" +
      "e\030\001 \001(\t\022\r\n\005value\030\002 \001(\014\022\017\n\007account\030\003 \001(\t\022" +
      "\r\n\005owner\030\004 \001(\t:\020\350\240\037\000\230\240\037\000\200\334 \000\210\240\037\000\"$\n\"MsgD" +
      "eleteDistinctAttributeResponse2\205\004\n\003Msg\022q" +
      "\n\014AddAttribute\022/.provenance.attribute.v1" +
      ".MsgAddAttributeRequest\0320.provenance.att" +
      "ribute.v1.MsgAddAttributeResponse\022z\n\017Upd" +
      "ateAttribute\0222.provenance.attribute.v1.M" +
      "sgUpdateAttributeRequest\0323.provenance.at" +
      "tribute.v1.MsgUpdateAttributeResponse\022z\n" +
      "\017DeleteAttribute\0222.provenance.attribute." +
      "v1.MsgDeleteAttributeRequest\0323.provenanc" +
      "e.attribute.v1.MsgDeleteAttributeRespons" +
      "e\022\222\001\n\027DeleteDistinctAttribute\022:.provenan" +
      "ce.attribute.v1.MsgDeleteDistinctAttribu" +
      "teRequest\032;.provenance.attribute.v1.MsgD" +
      "eleteDistinctAttributeResponseBU\n\032io.pro" +
      "venance.attribute.v1P\001Z5github.com/prove" +
      "nance-io/provenance/x/attribute/typesb\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf2.GoGoProtos.getDescriptor(),
          io.provenance.attribute.v1.AttributeOuterClass.getDescriptor(),
        });
    internal_static_provenance_attribute_v1_MsgAddAttributeRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_provenance_attribute_v1_MsgAddAttributeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_provenance_attribute_v1_MsgAddAttributeRequest_descriptor,
        new java.lang.String[] { "Name", "Value", "AttributeType", "Account", "Owner", });
    internal_static_provenance_attribute_v1_MsgAddAttributeResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_provenance_attribute_v1_MsgAddAttributeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_provenance_attribute_v1_MsgAddAttributeResponse_descriptor,
        new java.lang.String[] { });
    internal_static_provenance_attribute_v1_MsgUpdateAttributeRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_provenance_attribute_v1_MsgUpdateAttributeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_provenance_attribute_v1_MsgUpdateAttributeRequest_descriptor,
        new java.lang.String[] { "Name", "OriginalValue", "UpdateValue", "OriginalAttributeType", "UpdateAttributeType", "Account", "Owner", });
    internal_static_provenance_attribute_v1_MsgUpdateAttributeResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_provenance_attribute_v1_MsgUpdateAttributeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_provenance_attribute_v1_MsgUpdateAttributeResponse_descriptor,
        new java.lang.String[] { });
    internal_static_provenance_attribute_v1_MsgDeleteAttributeRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_provenance_attribute_v1_MsgDeleteAttributeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_provenance_attribute_v1_MsgDeleteAttributeRequest_descriptor,
        new java.lang.String[] { "Name", "Account", "Owner", });
    internal_static_provenance_attribute_v1_MsgDeleteAttributeResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_provenance_attribute_v1_MsgDeleteAttributeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_provenance_attribute_v1_MsgDeleteAttributeResponse_descriptor,
        new java.lang.String[] { });
    internal_static_provenance_attribute_v1_MsgDeleteDistinctAttributeRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_provenance_attribute_v1_MsgDeleteDistinctAttributeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_provenance_attribute_v1_MsgDeleteDistinctAttributeRequest_descriptor,
        new java.lang.String[] { "Name", "Value", "Account", "Owner", });
    internal_static_provenance_attribute_v1_MsgDeleteDistinctAttributeResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_provenance_attribute_v1_MsgDeleteDistinctAttributeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_provenance_attribute_v1_MsgDeleteDistinctAttributeResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf2.GoGoProtos.equal);
    registry.add(com.google.protobuf2.GoGoProtos.goprotoGetters);
    registry.add(com.google.protobuf2.GoGoProtos.goprotoStringer);
    registry.add(com.google.protobuf2.GoGoProtos.stringer);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf2.GoGoProtos.getDescriptor();
    io.provenance.attribute.v1.AttributeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
