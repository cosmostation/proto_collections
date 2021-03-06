// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/objectstore.proto

package io.provenance.metadata.v1;

public interface ObjectStoreLocatorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.metadata.v1.ObjectStoreLocator)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * account address the endpoint is owned by
   * </pre>
   *
   * <code>string owner = 1;</code>
   * @return The owner.
   */
  java.lang.String getOwner();
  /**
   * <pre>
   * account address the endpoint is owned by
   * </pre>
   *
   * <code>string owner = 1;</code>
   * @return The bytes for owner.
   */
  com.google.protobuf.ByteString
      getOwnerBytes();

  /**
   * <pre>
   * locator endpoint uri
   * </pre>
   *
   * <code>string locator_uri = 2;</code>
   * @return The locatorUri.
   */
  java.lang.String getLocatorUri();
  /**
   * <pre>
   * locator endpoint uri
   * </pre>
   *
   * <code>string locator_uri = 2;</code>
   * @return The bytes for locatorUri.
   */
  com.google.protobuf.ByteString
      getLocatorUriBytes();

  /**
   * <pre>
   * owners encryption key address
   * </pre>
   *
   * <code>string encryption_key = 3;</code>
   * @return The encryptionKey.
   */
  java.lang.String getEncryptionKey();
  /**
   * <pre>
   * owners encryption key address
   * </pre>
   *
   * <code>string encryption_key = 3;</code>
   * @return The bytes for encryptionKey.
   */
  com.google.protobuf.ByteString
      getEncryptionKeyBytes();
}
