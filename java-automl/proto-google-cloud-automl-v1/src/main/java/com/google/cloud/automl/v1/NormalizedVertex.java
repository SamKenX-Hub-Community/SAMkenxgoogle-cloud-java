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
// source: google/cloud/automl/v1/geometry.proto

package com.google.cloud.automl.v1;

/**
 *
 *
 * <pre>
 * A vertex represents a 2D point in the image.
 * The normalized vertex coordinates are between 0 to 1 fractions relative to
 * the original plane (image, video). E.g. if the plane (e.g. whole image) would
 * have size 10 x 20 then a point with normalized coordinates (0.1, 0.3) would
 * be at the position (1, 6) on that plane.
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1.NormalizedVertex}
 */
public final class NormalizedVertex extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1.NormalizedVertex)
    NormalizedVertexOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use NormalizedVertex.newBuilder() to construct.
  private NormalizedVertex(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private NormalizedVertex() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new NormalizedVertex();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private NormalizedVertex(
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
          case 13:
            {
              x_ = input.readFloat();
              break;
            }
          case 21:
            {
              y_ = input.readFloat();
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
    return com.google.cloud.automl.v1.Geometry
        .internal_static_google_cloud_automl_v1_NormalizedVertex_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1.Geometry
        .internal_static_google_cloud_automl_v1_NormalizedVertex_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1.NormalizedVertex.class,
            com.google.cloud.automl.v1.NormalizedVertex.Builder.class);
  }

  public static final int X_FIELD_NUMBER = 1;
  private float x_;
  /**
   *
   *
   * <pre>
   * Required. Horizontal coordinate.
   * </pre>
   *
   * <code>float x = 1;</code>
   *
   * @return The x.
   */
  @java.lang.Override
  public float getX() {
    return x_;
  }

  public static final int Y_FIELD_NUMBER = 2;
  private float y_;
  /**
   *
   *
   * <pre>
   * Required. Vertical coordinate.
   * </pre>
   *
   * <code>float y = 2;</code>
   *
   * @return The y.
   */
  @java.lang.Override
  public float getY() {
    return y_;
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
    if (x_ != 0F) {
      output.writeFloat(1, x_);
    }
    if (y_ != 0F) {
      output.writeFloat(2, y_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (x_ != 0F) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(1, x_);
    }
    if (y_ != 0F) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(2, y_);
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
    if (!(obj instanceof com.google.cloud.automl.v1.NormalizedVertex)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1.NormalizedVertex other =
        (com.google.cloud.automl.v1.NormalizedVertex) obj;

    if (java.lang.Float.floatToIntBits(getX()) != java.lang.Float.floatToIntBits(other.getX()))
      return false;
    if (java.lang.Float.floatToIntBits(getY()) != java.lang.Float.floatToIntBits(other.getY()))
      return false;
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
    hash = (37 * hash) + X_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getX());
    hash = (37 * hash) + Y_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getY());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1.NormalizedVertex parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.NormalizedVertex parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.NormalizedVertex parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.NormalizedVertex parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.NormalizedVertex parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.NormalizedVertex parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.NormalizedVertex parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.NormalizedVertex parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.NormalizedVertex parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.NormalizedVertex parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.NormalizedVertex parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.NormalizedVertex parseFrom(
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

  public static Builder newBuilder(com.google.cloud.automl.v1.NormalizedVertex prototype) {
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
   * A vertex represents a 2D point in the image.
   * The normalized vertex coordinates are between 0 to 1 fractions relative to
   * the original plane (image, video). E.g. if the plane (e.g. whole image) would
   * have size 10 x 20 then a point with normalized coordinates (0.1, 0.3) would
   * be at the position (1, 6) on that plane.
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1.NormalizedVertex}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1.NormalizedVertex)
      com.google.cloud.automl.v1.NormalizedVertexOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.automl.v1.Geometry
          .internal_static_google_cloud_automl_v1_NormalizedVertex_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1.Geometry
          .internal_static_google_cloud_automl_v1_NormalizedVertex_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1.NormalizedVertex.class,
              com.google.cloud.automl.v1.NormalizedVertex.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1.NormalizedVertex.newBuilder()
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
      x_ = 0F;

      y_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.automl.v1.Geometry
          .internal_static_google_cloud_automl_v1_NormalizedVertex_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.NormalizedVertex getDefaultInstanceForType() {
      return com.google.cloud.automl.v1.NormalizedVertex.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.NormalizedVertex build() {
      com.google.cloud.automl.v1.NormalizedVertex result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.NormalizedVertex buildPartial() {
      com.google.cloud.automl.v1.NormalizedVertex result =
          new com.google.cloud.automl.v1.NormalizedVertex(this);
      result.x_ = x_;
      result.y_ = y_;
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
      if (other instanceof com.google.cloud.automl.v1.NormalizedVertex) {
        return mergeFrom((com.google.cloud.automl.v1.NormalizedVertex) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.automl.v1.NormalizedVertex other) {
      if (other == com.google.cloud.automl.v1.NormalizedVertex.getDefaultInstance()) return this;
      if (other.getX() != 0F) {
        setX(other.getX());
      }
      if (other.getY() != 0F) {
        setY(other.getY());
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
      com.google.cloud.automl.v1.NormalizedVertex parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.automl.v1.NormalizedVertex) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float x_;
    /**
     *
     *
     * <pre>
     * Required. Horizontal coordinate.
     * </pre>
     *
     * <code>float x = 1;</code>
     *
     * @return The x.
     */
    @java.lang.Override
    public float getX() {
      return x_;
    }
    /**
     *
     *
     * <pre>
     * Required. Horizontal coordinate.
     * </pre>
     *
     * <code>float x = 1;</code>
     *
     * @param value The x to set.
     * @return This builder for chaining.
     */
    public Builder setX(float value) {

      x_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Horizontal coordinate.
     * </pre>
     *
     * <code>float x = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearX() {

      x_ = 0F;
      onChanged();
      return this;
    }

    private float y_;
    /**
     *
     *
     * <pre>
     * Required. Vertical coordinate.
     * </pre>
     *
     * <code>float y = 2;</code>
     *
     * @return The y.
     */
    @java.lang.Override
    public float getY() {
      return y_;
    }
    /**
     *
     *
     * <pre>
     * Required. Vertical coordinate.
     * </pre>
     *
     * <code>float y = 2;</code>
     *
     * @param value The y to set.
     * @return This builder for chaining.
     */
    public Builder setY(float value) {

      y_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Vertical coordinate.
     * </pre>
     *
     * <code>float y = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearY() {

      y_ = 0F;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1.NormalizedVertex)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1.NormalizedVertex)
  private static final com.google.cloud.automl.v1.NormalizedVertex DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1.NormalizedVertex();
  }

  public static com.google.cloud.automl.v1.NormalizedVertex getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NormalizedVertex> PARSER =
      new com.google.protobuf.AbstractParser<NormalizedVertex>() {
        @java.lang.Override
        public NormalizedVertex parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new NormalizedVertex(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<NormalizedVertex> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NormalizedVertex> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1.NormalizedVertex getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
