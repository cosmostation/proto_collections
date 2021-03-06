// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/marker/v1/tx.proto

package io.provenance.marker.v1;

public interface MsgWithdrawRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.marker.v1.MsgWithdrawRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string denom = 1;</code>
   * @return The denom.
   */
  java.lang.String getDenom();
  /**
   * <code>string denom = 1;</code>
   * @return The bytes for denom.
   */
  com.google.protobuf.ByteString
      getDenomBytes();

  /**
   * <code>string administrator = 2;</code>
   * @return The administrator.
   */
  java.lang.String getAdministrator();
  /**
   * <code>string administrator = 2;</code>
   * @return The bytes for administrator.
   */
  com.google.protobuf.ByteString
      getAdministratorBytes();

  /**
   * <code>string to_address = 3;</code>
   * @return The toAddress.
   */
  java.lang.String getToAddress();
  /**
   * <code>string to_address = 3;</code>
   * @return The bytes for toAddress.
   */
  com.google.protobuf.ByteString
      getToAddressBytes();

  /**
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 4 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<cosmos.base.v1beta1.CoinOuterClass.Coin> 
      getAmountList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 4 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  cosmos.base.v1beta1.CoinOuterClass.Coin getAmount(int index);
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 4 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  int getAmountCount();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 4 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<? extends cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder> 
      getAmountOrBuilderList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin amount = 4 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder getAmountOrBuilder(
      int index);
}
