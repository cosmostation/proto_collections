// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/marker/v1/query.proto

package io.provenance.marker.v1;

public interface BalanceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.marker.v1.Balance)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * address is the address of the balance holder.
   * </pre>
   *
   * <code>string address = 1;</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <pre>
   * address is the address of the balance holder.
   * </pre>
   *
   * <code>string address = 1;</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <pre>
   * coins defines the different coins this balance holds.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<cosmos.base.v1beta1.CoinOuterClass.Coin> 
      getCoinsList();
  /**
   * <pre>
   * coins defines the different coins this balance holds.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  cosmos.base.v1beta1.CoinOuterClass.Coin getCoins(int index);
  /**
   * <pre>
   * coins defines the different coins this balance holds.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  int getCoinsCount();
  /**
   * <pre>
   * coins defines the different coins this balance holds.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<? extends cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder> 
      getCoinsOrBuilderList();
  /**
   * <pre>
   * coins defines the different coins this balance holds.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin coins = 2 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder getCoinsOrBuilder(
      int index);
}
