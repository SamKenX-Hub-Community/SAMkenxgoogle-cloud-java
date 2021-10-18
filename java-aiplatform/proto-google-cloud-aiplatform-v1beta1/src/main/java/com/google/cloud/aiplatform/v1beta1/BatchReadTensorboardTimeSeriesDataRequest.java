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
// source: google/cloud/aiplatform/v1beta1/tensorboard_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for
 * [TensorboardService.BatchReadTensorboardTimeSeriesData][google.cloud.aiplatform.v1beta1.TensorboardService.BatchReadTensorboardTimeSeriesData].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest}
 */
public final class BatchReadTensorboardTimeSeriesDataRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest)
    BatchReadTensorboardTimeSeriesDataRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BatchReadTensorboardTimeSeriesDataRequest.newBuilder() to construct.
  private BatchReadTensorboardTimeSeriesDataRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchReadTensorboardTimeSeriesDataRequest() {
    tensorboard_ = "";
    timeSeries_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BatchReadTensorboardTimeSeriesDataRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private BatchReadTensorboardTimeSeriesDataRequest(
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

              tensorboard_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                timeSeries_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              timeSeries_.add(s);
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
        timeSeries_ = timeSeries_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.TensorboardServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_BatchReadTensorboardTimeSeriesDataRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.TensorboardServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_BatchReadTensorboardTimeSeriesDataRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest.class,
            com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest.Builder
                .class);
  }

  public static final int TENSORBOARD_FIELD_NUMBER = 1;
  private volatile java.lang.Object tensorboard_;
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Tensorboard containing TensorboardTimeSeries to
   * read data from. Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}`.
   * The TensorboardTimeSeries referenced by [time_series][google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest.time_series] must be sub
   * resources of this Tensorboard.
   * </pre>
   *
   * <code>
   * string tensorboard = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The tensorboard.
   */
  @java.lang.Override
  public java.lang.String getTensorboard() {
    java.lang.Object ref = tensorboard_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tensorboard_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Tensorboard containing TensorboardTimeSeries to
   * read data from. Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}`.
   * The TensorboardTimeSeries referenced by [time_series][google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest.time_series] must be sub
   * resources of this Tensorboard.
   * </pre>
   *
   * <code>
   * string tensorboard = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for tensorboard.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTensorboardBytes() {
    java.lang.Object ref = tensorboard_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      tensorboard_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIME_SERIES_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList timeSeries_;
  /**
   *
   *
   * <pre>
   * Required. The resource names of the TensorboardTimeSeries to read data from. Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`
   * </pre>
   *
   * <code>
   * repeated string time_series = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return A list containing the timeSeries.
   */
  public com.google.protobuf.ProtocolStringList getTimeSeriesList() {
    return timeSeries_;
  }
  /**
   *
   *
   * <pre>
   * Required. The resource names of the TensorboardTimeSeries to read data from. Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`
   * </pre>
   *
   * <code>
   * repeated string time_series = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The count of timeSeries.
   */
  public int getTimeSeriesCount() {
    return timeSeries_.size();
  }
  /**
   *
   *
   * <pre>
   * Required. The resource names of the TensorboardTimeSeries to read data from. Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`
   * </pre>
   *
   * <code>
   * repeated string time_series = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The timeSeries at the given index.
   */
  public java.lang.String getTimeSeries(int index) {
    return timeSeries_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Required. The resource names of the TensorboardTimeSeries to read data from. Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`
   * </pre>
   *
   * <code>
   * repeated string time_series = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the timeSeries at the given index.
   */
  public com.google.protobuf.ByteString getTimeSeriesBytes(int index) {
    return timeSeries_.getByteString(index);
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
    if (!getTensorboardBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, tensorboard_);
    }
    for (int i = 0; i < timeSeries_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, timeSeries_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTensorboardBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, tensorboard_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < timeSeries_.size(); i++) {
        dataSize += computeStringSizeNoTag(timeSeries_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getTimeSeriesList().size();
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
    if (!(obj
        instanceof com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest other =
        (com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest) obj;

    if (!getTensorboard().equals(other.getTensorboard())) return false;
    if (!getTimeSeriesList().equals(other.getTimeSeriesList())) return false;
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
    hash = (37 * hash) + TENSORBOARD_FIELD_NUMBER;
    hash = (53 * hash) + getTensorboard().hashCode();
    if (getTimeSeriesCount() > 0) {
      hash = (37 * hash) + TIME_SERIES_FIELD_NUMBER;
      hash = (53 * hash) + getTimeSeriesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest
      parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest prototype) {
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
   * Request message for
   * [TensorboardService.BatchReadTensorboardTimeSeriesData][google.cloud.aiplatform.v1beta1.TensorboardService.BatchReadTensorboardTimeSeriesData].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest)
      com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.TensorboardServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_BatchReadTensorboardTimeSeriesDataRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.TensorboardServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_BatchReadTensorboardTimeSeriesDataRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest.class,
              com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest.newBuilder()
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
      tensorboard_ = "";

      timeSeries_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.TensorboardServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_BatchReadTensorboardTimeSeriesDataRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest build() {
      com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest
        buildPartial() {
      com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest result =
          new com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest(this);
      int from_bitField0_ = bitField0_;
      result.tensorboard_ = tensorboard_;
      if (((bitField0_ & 0x00000001) != 0)) {
        timeSeries_ = timeSeries_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.timeSeries_ = timeSeries_;
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
      if (other
          instanceof
          com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest) {
        return mergeFrom(
            (com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest other) {
      if (other
          == com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest
              .getDefaultInstance()) return this;
      if (!other.getTensorboard().isEmpty()) {
        tensorboard_ = other.tensorboard_;
        onChanged();
      }
      if (!other.timeSeries_.isEmpty()) {
        if (timeSeries_.isEmpty()) {
          timeSeries_ = other.timeSeries_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureTimeSeriesIsMutable();
          timeSeries_.addAll(other.timeSeries_);
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
      com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest parsedMessage =
          null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object tensorboard_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name of the Tensorboard containing TensorboardTimeSeries to
     * read data from. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}`.
     * The TensorboardTimeSeries referenced by [time_series][google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest.time_series] must be sub
     * resources of this Tensorboard.
     * </pre>
     *
     * <code>
     * string tensorboard = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The tensorboard.
     */
    public java.lang.String getTensorboard() {
      java.lang.Object ref = tensorboard_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tensorboard_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the Tensorboard containing TensorboardTimeSeries to
     * read data from. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}`.
     * The TensorboardTimeSeries referenced by [time_series][google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest.time_series] must be sub
     * resources of this Tensorboard.
     * </pre>
     *
     * <code>
     * string tensorboard = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for tensorboard.
     */
    public com.google.protobuf.ByteString getTensorboardBytes() {
      java.lang.Object ref = tensorboard_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        tensorboard_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the Tensorboard containing TensorboardTimeSeries to
     * read data from. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}`.
     * The TensorboardTimeSeries referenced by [time_series][google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest.time_series] must be sub
     * resources of this Tensorboard.
     * </pre>
     *
     * <code>
     * string tensorboard = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The tensorboard to set.
     * @return This builder for chaining.
     */
    public Builder setTensorboard(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      tensorboard_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the Tensorboard containing TensorboardTimeSeries to
     * read data from. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}`.
     * The TensorboardTimeSeries referenced by [time_series][google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest.time_series] must be sub
     * resources of this Tensorboard.
     * </pre>
     *
     * <code>
     * string tensorboard = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTensorboard() {

      tensorboard_ = getDefaultInstance().getTensorboard();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the Tensorboard containing TensorboardTimeSeries to
     * read data from. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}`.
     * The TensorboardTimeSeries referenced by [time_series][google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest.time_series] must be sub
     * resources of this Tensorboard.
     * </pre>
     *
     * <code>
     * string tensorboard = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for tensorboard to set.
     * @return This builder for chaining.
     */
    public Builder setTensorboardBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      tensorboard_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList timeSeries_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureTimeSeriesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        timeSeries_ = new com.google.protobuf.LazyStringArrayList(timeSeries_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource names of the TensorboardTimeSeries to read data from. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`
     * </pre>
     *
     * <code>
     * repeated string time_series = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return A list containing the timeSeries.
     */
    public com.google.protobuf.ProtocolStringList getTimeSeriesList() {
      return timeSeries_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * Required. The resource names of the TensorboardTimeSeries to read data from. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`
     * </pre>
     *
     * <code>
     * repeated string time_series = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The count of timeSeries.
     */
    public int getTimeSeriesCount() {
      return timeSeries_.size();
    }
    /**
     *
     *
     * <pre>
     * Required. The resource names of the TensorboardTimeSeries to read data from. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`
     * </pre>
     *
     * <code>
     * repeated string time_series = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param index The index of the element to return.
     * @return The timeSeries at the given index.
     */
    public java.lang.String getTimeSeries(int index) {
      return timeSeries_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Required. The resource names of the TensorboardTimeSeries to read data from. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`
     * </pre>
     *
     * <code>
     * repeated string time_series = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the timeSeries at the given index.
     */
    public com.google.protobuf.ByteString getTimeSeriesBytes(int index) {
      return timeSeries_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Required. The resource names of the TensorboardTimeSeries to read data from. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`
     * </pre>
     *
     * <code>
     * repeated string time_series = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param index The index to set the value at.
     * @param value The timeSeries to set.
     * @return This builder for chaining.
     */
    public Builder setTimeSeries(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureTimeSeriesIsMutable();
      timeSeries_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource names of the TensorboardTimeSeries to read data from. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`
     * </pre>
     *
     * <code>
     * repeated string time_series = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The timeSeries to add.
     * @return This builder for chaining.
     */
    public Builder addTimeSeries(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureTimeSeriesIsMutable();
      timeSeries_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource names of the TensorboardTimeSeries to read data from. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`
     * </pre>
     *
     * <code>
     * repeated string time_series = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param values The timeSeries to add.
     * @return This builder for chaining.
     */
    public Builder addAllTimeSeries(java.lang.Iterable<java.lang.String> values) {
      ensureTimeSeriesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, timeSeries_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource names of the TensorboardTimeSeries to read data from. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`
     * </pre>
     *
     * <code>
     * repeated string time_series = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTimeSeries() {
      timeSeries_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource names of the TensorboardTimeSeries to read data from. Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`
     * </pre>
     *
     * <code>
     * repeated string time_series = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes of the timeSeries to add.
     * @return This builder for chaining.
     */
    public Builder addTimeSeriesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureTimeSeriesIsMutable();
      timeSeries_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest)
  private static final com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest();
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchReadTensorboardTimeSeriesDataRequest>
      PARSER =
          new com.google.protobuf.AbstractParser<BatchReadTensorboardTimeSeriesDataRequest>() {
            @java.lang.Override
            public BatchReadTensorboardTimeSeriesDataRequest parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              return new BatchReadTensorboardTimeSeriesDataRequest(input, extensionRegistry);
            }
          };

  public static com.google.protobuf.Parser<BatchReadTensorboardTimeSeriesDataRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchReadTensorboardTimeSeriesDataRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.BatchReadTensorboardTimeSeriesDataRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
