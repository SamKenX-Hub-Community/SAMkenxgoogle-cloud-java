/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/lifesciences/v2beta/workflows.proto

package com.google.cloud.lifesciences.v2beta;

/**
 *
 *
 * <pre>
 * Holds encrypted information that is only decrypted and stored in RAM
 * by the worker VM when running the pipeline.
 * </pre>
 *
 * Protobuf type {@code google.cloud.lifesciences.v2beta.Secret}
 */
public final class Secret extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.lifesciences.v2beta.Secret)
    SecretOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Secret.newBuilder() to construct.
  private Secret(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Secret() {
    keyName_ = "";
    cipherText_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Secret();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Secret(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              keyName_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              cipherText_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.lifesciences.v2beta.WorkflowsProto
        .internal_static_google_cloud_lifesciences_v2beta_Secret_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.lifesciences.v2beta.WorkflowsProto
        .internal_static_google_cloud_lifesciences_v2beta_Secret_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.lifesciences.v2beta.Secret.class,
            com.google.cloud.lifesciences.v2beta.Secret.Builder.class);
  }

  public static final int KEY_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object keyName_;
  /**
   *
   *
   * <pre>
   * The name of the Cloud KMS key that will be used to decrypt the secret
   * value. The VM service account must have the required permissions and
   * authentication scopes to invoke the `decrypt` method on the specified key.
   * </pre>
   *
   * <code>string key_name = 1;</code>
   *
   * @return The keyName.
   */
  @java.lang.Override
  public java.lang.String getKeyName() {
    java.lang.Object ref = keyName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      keyName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The name of the Cloud KMS key that will be used to decrypt the secret
   * value. The VM service account must have the required permissions and
   * authentication scopes to invoke the `decrypt` method on the specified key.
   * </pre>
   *
   * <code>string key_name = 1;</code>
   *
   * @return The bytes for keyName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKeyNameBytes() {
    java.lang.Object ref = keyName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      keyName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CIPHER_TEXT_FIELD_NUMBER = 2;
  private volatile java.lang.Object cipherText_;
  /**
   *
   *
   * <pre>
   * The value of the cipherText response from the `encrypt` method. This field
   * is intentionally unaudited.
   * </pre>
   *
   * <code>string cipher_text = 2;</code>
   *
   * @return The cipherText.
   */
  @java.lang.Override
  public java.lang.String getCipherText() {
    java.lang.Object ref = cipherText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cipherText_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The value of the cipherText response from the `encrypt` method. This field
   * is intentionally unaudited.
   * </pre>
   *
   * <code>string cipher_text = 2;</code>
   *
   * @return The bytes for cipherText.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCipherTextBytes() {
    java.lang.Object ref = cipherText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      cipherText_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getKeyNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, keyName_);
    }
    if (!getCipherTextBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, cipherText_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getKeyNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, keyName_);
    }
    if (!getCipherTextBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, cipherText_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.lifesciences.v2beta.Secret)) {
      return super.equals(obj);
    }
    com.google.cloud.lifesciences.v2beta.Secret other =
        (com.google.cloud.lifesciences.v2beta.Secret) obj;

    if (!getKeyName().equals(other.getKeyName())) return false;
    if (!getCipherText().equals(other.getCipherText())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + KEY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getKeyName().hashCode();
    hash = (37 * hash) + CIPHER_TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getCipherText().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.lifesciences.v2beta.Secret parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.lifesciences.v2beta.Secret parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.lifesciences.v2beta.Secret parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.lifesciences.v2beta.Secret parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.lifesciences.v2beta.Secret parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.lifesciences.v2beta.Secret parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.lifesciences.v2beta.Secret parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.lifesciences.v2beta.Secret parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.lifesciences.v2beta.Secret parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.lifesciences.v2beta.Secret parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.lifesciences.v2beta.Secret parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.lifesciences.v2beta.Secret parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.lifesciences.v2beta.Secret prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Holds encrypted information that is only decrypted and stored in RAM
   * by the worker VM when running the pipeline.
   * </pre>
   *
   * Protobuf type {@code google.cloud.lifesciences.v2beta.Secret}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.lifesciences.v2beta.Secret)
      com.google.cloud.lifesciences.v2beta.SecretOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.lifesciences.v2beta.WorkflowsProto
          .internal_static_google_cloud_lifesciences_v2beta_Secret_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.lifesciences.v2beta.WorkflowsProto
          .internal_static_google_cloud_lifesciences_v2beta_Secret_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.lifesciences.v2beta.Secret.class,
              com.google.cloud.lifesciences.v2beta.Secret.Builder.class);
    }

    // Construct using com.google.cloud.lifesciences.v2beta.Secret.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      keyName_ = "";

      cipherText_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.lifesciences.v2beta.WorkflowsProto
          .internal_static_google_cloud_lifesciences_v2beta_Secret_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.lifesciences.v2beta.Secret getDefaultInstanceForType() {
      return com.google.cloud.lifesciences.v2beta.Secret.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.lifesciences.v2beta.Secret build() {
      com.google.cloud.lifesciences.v2beta.Secret result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.lifesciences.v2beta.Secret buildPartial() {
      com.google.cloud.lifesciences.v2beta.Secret result =
          new com.google.cloud.lifesciences.v2beta.Secret(this);
      result.keyName_ = keyName_;
      result.cipherText_ = cipherText_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.lifesciences.v2beta.Secret) {
        return mergeFrom((com.google.cloud.lifesciences.v2beta.Secret) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.lifesciences.v2beta.Secret other) {
      if (other == com.google.cloud.lifesciences.v2beta.Secret.getDefaultInstance()) return this;
      if (!other.getKeyName().isEmpty()) {
        keyName_ = other.keyName_;
        onChanged();
      }
      if (!other.getCipherText().isEmpty()) {
        cipherText_ = other.cipherText_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.lifesciences.v2beta.Secret parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.lifesciences.v2beta.Secret) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object keyName_ = "";
    /**
     *
     *
     * <pre>
     * The name of the Cloud KMS key that will be used to decrypt the secret
     * value. The VM service account must have the required permissions and
     * authentication scopes to invoke the `decrypt` method on the specified key.
     * </pre>
     *
     * <code>string key_name = 1;</code>
     *
     * @return The keyName.
     */
    public java.lang.String getKeyName() {
      java.lang.Object ref = keyName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        keyName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the Cloud KMS key that will be used to decrypt the secret
     * value. The VM service account must have the required permissions and
     * authentication scopes to invoke the `decrypt` method on the specified key.
     * </pre>
     *
     * <code>string key_name = 1;</code>
     *
     * @return The bytes for keyName.
     */
    public com.google.protobuf.ByteString getKeyNameBytes() {
      java.lang.Object ref = keyName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        keyName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the Cloud KMS key that will be used to decrypt the secret
     * value. The VM service account must have the required permissions and
     * authentication scopes to invoke the `decrypt` method on the specified key.
     * </pre>
     *
     * <code>string key_name = 1;</code>
     *
     * @param value The keyName to set.
     * @return This builder for chaining.
     */
    public Builder setKeyName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      keyName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the Cloud KMS key that will be used to decrypt the secret
     * value. The VM service account must have the required permissions and
     * authentication scopes to invoke the `decrypt` method on the specified key.
     * </pre>
     *
     * <code>string key_name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKeyName() {

      keyName_ = getDefaultInstance().getKeyName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the Cloud KMS key that will be used to decrypt the secret
     * value. The VM service account must have the required permissions and
     * authentication scopes to invoke the `decrypt` method on the specified key.
     * </pre>
     *
     * <code>string key_name = 1;</code>
     *
     * @param value The bytes for keyName to set.
     * @return This builder for chaining.
     */
    public Builder setKeyNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      keyName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object cipherText_ = "";
    /**
     *
     *
     * <pre>
     * The value of the cipherText response from the `encrypt` method. This field
     * is intentionally unaudited.
     * </pre>
     *
     * <code>string cipher_text = 2;</code>
     *
     * @return The cipherText.
     */
    public java.lang.String getCipherText() {
      java.lang.Object ref = cipherText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cipherText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The value of the cipherText response from the `encrypt` method. This field
     * is intentionally unaudited.
     * </pre>
     *
     * <code>string cipher_text = 2;</code>
     *
     * @return The bytes for cipherText.
     */
    public com.google.protobuf.ByteString getCipherTextBytes() {
      java.lang.Object ref = cipherText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        cipherText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The value of the cipherText response from the `encrypt` method. This field
     * is intentionally unaudited.
     * </pre>
     *
     * <code>string cipher_text = 2;</code>
     *
     * @param value The cipherText to set.
     * @return This builder for chaining.
     */
    public Builder setCipherText(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      cipherText_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The value of the cipherText response from the `encrypt` method. This field
     * is intentionally unaudited.
     * </pre>
     *
     * <code>string cipher_text = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCipherText() {

      cipherText_ = getDefaultInstance().getCipherText();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The value of the cipherText response from the `encrypt` method. This field
     * is intentionally unaudited.
     * </pre>
     *
     * <code>string cipher_text = 2;</code>
     *
     * @param value The bytes for cipherText to set.
     * @return This builder for chaining.
     */
    public Builder setCipherTextBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      cipherText_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.lifesciences.v2beta.Secret)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.lifesciences.v2beta.Secret)
  private static final com.google.cloud.lifesciences.v2beta.Secret DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.lifesciences.v2beta.Secret();
  }

  public static com.google.cloud.lifesciences.v2beta.Secret getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Secret> PARSER =
      new com.google.protobuf.AbstractParser<Secret>() {
        @java.lang.Override
        public Secret parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Secret(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Secret> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Secret> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.lifesciences.v2beta.Secret getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
