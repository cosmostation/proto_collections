// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/bitcoin/v1beta1/service.proto

package axelar.bitcoin.v1beta1;

public final class Service {
  private Service() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$axelar/bitcoin/v1beta1/service.proto\022\026" +
      "axelar.bitcoin.v1beta1\032\024gogoproto/gogo.p" +
      "roto\032\034google/api/annotations.proto\032\037axel" +
      "ar/bitcoin/v1beta1/tx.proto2\373\t\n\nMsgServi" +
      "ce\022\204\001\n\004Link\022#.axelar.bitcoin.v1beta1.Lin" +
      "kRequest\032$.axelar.bitcoin.v1beta1.LinkRe" +
      "sponse\"1\202\323\344\223\002+\"&/axelar/bitcoin/link/{re" +
      "cipient_chain}:\001*\022\226\001\n\017ConfirmOutpoint\022.." +
      "axelar.bitcoin.v1beta1.ConfirmOutpointRe" +
      "quest\032/.axelar.bitcoin.v1beta1.ConfirmOu" +
      "tpointResponse\"\"\202\323\344\223\002\034\"\027/axelar/bitcoin/" +
      "confirm:\001*\022\206\001\n\023VoteConfirmOutpoint\0222.axe" +
      "lar.bitcoin.v1beta1.VoteConfirmOutpointR" +
      "equest\0323.axelar.bitcoin.v1beta1.VoteConf" +
      "irmOutpointResponse\"\006\202\323\344\223\002\000\022\305\001\n\030CreatePe" +
      "ndingTransfersTx\0227.axelar.bitcoin.v1beta" +
      "1.CreatePendingTransfersTxRequest\0328.axel" +
      "ar.bitcoin.v1beta1.CreatePendingTransfer" +
      "sTxResponse\"6\202\323\344\223\0020\"+/axelar/bitcoin/cre" +
      "ate-pending-transfers-tx:\001*\022\234\001\n\016CreateMa" +
      "sterTx\022-.axelar.bitcoin.v1beta1.CreateMa" +
      "sterTxRequest\032..axelar.bitcoin.v1beta1.C" +
      "reateMasterTxResponse\"+\202\323\344\223\002%\" /axelar/b" +
      "itcoin/create-master-tx:\001*\022\234\001\n\016CreateRes" +
      "cueTx\022-.axelar.bitcoin.v1beta1.CreateRes" +
      "cueTxRequest\032..axelar.bitcoin.v1beta1.Cr" +
      "eateRescueTxResponse\"+\202\323\344\223\002%\" /axelar/bi" +
      "tcoin/create-rescue-tx:\001*\022{\n\006SignTx\022%.ax" +
      "elar.bitcoin.v1beta1.SignTxRequest\032&.axe" +
      "lar.bitcoin.v1beta1.SignTxResponse\"\"\202\323\344\223" +
      "\002\034\"\027/axelar/bitcoin/sign-tx:\001*\022\300\001\n\027Submi" +
      "tExternalSignature\0226.axelar.bitcoin.v1be" +
      "ta1.SubmitExternalSignatureRequest\0327.axe" +
      "lar.bitcoin.v1beta1.SubmitExternalSignat" +
      "ureResponse\"4\202\323\344\223\002.\")/axelar/bitcoin/sub" +
      "mit-external-signature:\001*B:Z4github.com/" +
      "axelarnetwork/axelar-core/x/bitcoin/type" +
      "s\300\343\036\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf2.GoGoProtos.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          axelar.bitcoin.v1beta1.Tx.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf2.GoGoProtos.goprotoRegistration);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf2.GoGoProtos.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    axelar.bitcoin.v1beta1.Tx.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
