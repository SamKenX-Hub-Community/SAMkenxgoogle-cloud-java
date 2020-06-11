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
// source: google/cloud/websecurityscanner/v1/finding_addon.proto

package com.google.cloud.websecurityscanner.v1;

/**
 *
 *
 * <pre>
 * Information about vulnerable request parameters.
 * </pre>
 *
 * Protobuf type {@code google.cloud.websecurityscanner.v1.VulnerableParameters}
 */
public final class VulnerableParameters extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.websecurityscanner.v1.VulnerableParameters)
    VulnerableParametersOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use VulnerableParameters.newBuilder() to construct.
  private VulnerableParameters(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private VulnerableParameters() {
    parameterNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new VulnerableParameters();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private VulnerableParameters(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                parameterNames_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              parameterNames_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        parameterNames_ = parameterNames_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.websecurityscanner.v1.FindingAddonProto
        .internal_static_google_cloud_websecurityscanner_v1_VulnerableParameters_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.websecurityscanner.v1.FindingAddonProto
        .internal_static_google_cloud_websecurityscanner_v1_VulnerableParameters_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.websecurityscanner.v1.VulnerableParameters.class,
            com.google.cloud.websecurityscanner.v1.VulnerableParameters.Builder.class);
  }

  public static final int PARAMETER_NAMES_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList parameterNames_;
  /**
   *
   *
   * <pre>
   * The vulnerable parameter names.
   * </pre>
   *
   * <code>repeated string parameter_names = 1;</code>
   *
   * @return A list containing the parameterNames.
   */
  public com.google.protobuf.ProtocolStringList getParameterNamesList() {
    return parameterNames_;
  }
  /**
   *
   *
   * <pre>
   * The vulnerable parameter names.
   * </pre>
   *
   * <code>repeated string parameter_names = 1;</code>
   *
   * @return The count of parameterNames.
   */
  public int getParameterNamesCount() {
    return parameterNames_.size();
  }
  /**
   *
   *
   * <pre>
   * The vulnerable parameter names.
   * </pre>
   *
   * <code>repeated string parameter_names = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The parameterNames at the given index.
   */
  public java.lang.String getParameterNames(int index) {
    return parameterNames_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The vulnerable parameter names.
   * </pre>
   *
   * <code>repeated string parameter_names = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the parameterNames at the given index.
   */
  public com.google.protobuf.ByteString getParameterNamesBytes(int index) {
    return parameterNames_.getByteString(index);
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
    for (int i = 0; i < parameterNames_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parameterNames_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < parameterNames_.size(); i++) {
        dataSize += computeStringSizeNoTag(parameterNames_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getParameterNamesList().size();
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
    if (!(obj instanceof com.google.cloud.websecurityscanner.v1.VulnerableParameters)) {
      return super.equals(obj);
    }
    com.google.cloud.websecurityscanner.v1.VulnerableParameters other =
        (com.google.cloud.websecurityscanner.v1.VulnerableParameters) obj;

    if (!getParameterNamesList().equals(other.getParameterNamesList())) return false;
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
    if (getParameterNamesCount() > 0) {
      hash = (37 * hash) + PARAMETER_NAMES_FIELD_NUMBER;
      hash = (53 * hash) + getParameterNamesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.websecurityscanner.v1.VulnerableParameters parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1.VulnerableParameters parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1.VulnerableParameters parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1.VulnerableParameters parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1.VulnerableParameters parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1.VulnerableParameters parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1.VulnerableParameters parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1.VulnerableParameters parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1.VulnerableParameters parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1.VulnerableParameters parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1.VulnerableParameters parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1.VulnerableParameters parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.websecurityscanner.v1.VulnerableParameters prototype) {
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
   * Information about vulnerable request parameters.
   * </pre>
   *
   * Protobuf type {@code google.cloud.websecurityscanner.v1.VulnerableParameters}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.websecurityscanner.v1.VulnerableParameters)
      com.google.cloud.websecurityscanner.v1.VulnerableParametersOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.websecurityscanner.v1.FindingAddonProto
          .internal_static_google_cloud_websecurityscanner_v1_VulnerableParameters_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.websecurityscanner.v1.FindingAddonProto
          .internal_static_google_cloud_websecurityscanner_v1_VulnerableParameters_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.websecurityscanner.v1.VulnerableParameters.class,
              com.google.cloud.websecurityscanner.v1.VulnerableParameters.Builder.class);
    }

    // Construct using com.google.cloud.websecurityscanner.v1.VulnerableParameters.newBuilder()
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
      parameterNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.websecurityscanner.v1.FindingAddonProto
          .internal_static_google_cloud_websecurityscanner_v1_VulnerableParameters_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1.VulnerableParameters getDefaultInstanceForType() {
      return com.google.cloud.websecurityscanner.v1.VulnerableParameters.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1.VulnerableParameters build() {
      com.google.cloud.websecurityscanner.v1.VulnerableParameters result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1.VulnerableParameters buildPartial() {
      com.google.cloud.websecurityscanner.v1.VulnerableParameters result =
          new com.google.cloud.websecurityscanner.v1.VulnerableParameters(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        parameterNames_ = parameterNames_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.parameterNames_ = parameterNames_;
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
      if (other instanceof com.google.cloud.websecurityscanner.v1.VulnerableParameters) {
        return mergeFrom((com.google.cloud.websecurityscanner.v1.VulnerableParameters) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.websecurityscanner.v1.VulnerableParameters other) {
      if (other == com.google.cloud.websecurityscanner.v1.VulnerableParameters.getDefaultInstance())
        return this;
      if (!other.parameterNames_.isEmpty()) {
        if (parameterNames_.isEmpty()) {
          parameterNames_ = other.parameterNames_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureParameterNamesIsMutable();
          parameterNames_.addAll(other.parameterNames_);
        }
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
      com.google.cloud.websecurityscanner.v1.VulnerableParameters parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.websecurityscanner.v1.VulnerableParameters) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.LazyStringList parameterNames_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureParameterNamesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        parameterNames_ = new com.google.protobuf.LazyStringArrayList(parameterNames_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * The vulnerable parameter names.
     * </pre>
     *
     * <code>repeated string parameter_names = 1;</code>
     *
     * @return A list containing the parameterNames.
     */
    public com.google.protobuf.ProtocolStringList getParameterNamesList() {
      return parameterNames_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * The vulnerable parameter names.
     * </pre>
     *
     * <code>repeated string parameter_names = 1;</code>
     *
     * @return The count of parameterNames.
     */
    public int getParameterNamesCount() {
      return parameterNames_.size();
    }
    /**
     *
     *
     * <pre>
     * The vulnerable parameter names.
     * </pre>
     *
     * <code>repeated string parameter_names = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The parameterNames at the given index.
     */
    public java.lang.String getParameterNames(int index) {
      return parameterNames_.get(index);
    }
    /**
     *
     *
     * <pre>
     * The vulnerable parameter names.
     * </pre>
     *
     * <code>repeated string parameter_names = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the parameterNames at the given index.
     */
    public com.google.protobuf.ByteString getParameterNamesBytes(int index) {
      return parameterNames_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * The vulnerable parameter names.
     * </pre>
     *
     * <code>repeated string parameter_names = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The parameterNames to set.
     * @return This builder for chaining.
     */
    public Builder setParameterNames(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureParameterNamesIsMutable();
      parameterNames_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The vulnerable parameter names.
     * </pre>
     *
     * <code>repeated string parameter_names = 1;</code>
     *
     * @param value The parameterNames to add.
     * @return This builder for chaining.
     */
    public Builder addParameterNames(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureParameterNamesIsMutable();
      parameterNames_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The vulnerable parameter names.
     * </pre>
     *
     * <code>repeated string parameter_names = 1;</code>
     *
     * @param values The parameterNames to add.
     * @return This builder for chaining.
     */
    public Builder addAllParameterNames(java.lang.Iterable<java.lang.String> values) {
      ensureParameterNamesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, parameterNames_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The vulnerable parameter names.
     * </pre>
     *
     * <code>repeated string parameter_names = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParameterNames() {
      parameterNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The vulnerable parameter names.
     * </pre>
     *
     * <code>repeated string parameter_names = 1;</code>
     *
     * @param value The bytes of the parameterNames to add.
     * @return This builder for chaining.
     */
    public Builder addParameterNamesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureParameterNamesIsMutable();
      parameterNames_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.websecurityscanner.v1.VulnerableParameters)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.websecurityscanner.v1.VulnerableParameters)
  private static final com.google.cloud.websecurityscanner.v1.VulnerableParameters DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.websecurityscanner.v1.VulnerableParameters();
  }

  public static com.google.cloud.websecurityscanner.v1.VulnerableParameters getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VulnerableParameters> PARSER =
      new com.google.protobuf.AbstractParser<VulnerableParameters>() {
        @java.lang.Override
        public VulnerableParameters parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new VulnerableParameters(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<VulnerableParameters> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VulnerableParameters> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.websecurityscanner.v1.VulnerableParameters getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
