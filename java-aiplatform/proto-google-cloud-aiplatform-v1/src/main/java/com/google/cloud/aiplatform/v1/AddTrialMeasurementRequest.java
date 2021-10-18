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
// source: google/cloud/aiplatform/v1/vizier_service.proto

package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Request message for [VizierService.AddTrialMeasurement][google.cloud.aiplatform.v1.VizierService.AddTrialMeasurement].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.AddTrialMeasurementRequest}
 */
public final class AddTrialMeasurementRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.AddTrialMeasurementRequest)
    AddTrialMeasurementRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AddTrialMeasurementRequest.newBuilder() to construct.
  private AddTrialMeasurementRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AddTrialMeasurementRequest() {
    trialName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AddTrialMeasurementRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AddTrialMeasurementRequest(
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

              trialName_ = s;
              break;
            }
          case 26:
            {
              com.google.cloud.aiplatform.v1.Measurement.Builder subBuilder = null;
              if (measurement_ != null) {
                subBuilder = measurement_.toBuilder();
              }
              measurement_ =
                  input.readMessage(
                      com.google.cloud.aiplatform.v1.Measurement.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(measurement_);
                measurement_ = subBuilder.buildPartial();
              }

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
    return com.google.cloud.aiplatform.v1.VizierServiceProto
        .internal_static_google_cloud_aiplatform_v1_AddTrialMeasurementRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.VizierServiceProto
        .internal_static_google_cloud_aiplatform_v1_AddTrialMeasurementRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest.class,
            com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest.Builder.class);
  }

  public static final int TRIAL_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object trialName_;
  /**
   *
   *
   * <pre>
   * Required. The name of the trial to add measurement.
   * Format:
   * `projects/{project}/locations/{location}/studies/{study}/trials/{trial}`
   * </pre>
   *
   * <code>
   * string trial_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The trialName.
   */
  @java.lang.Override
  public java.lang.String getTrialName() {
    java.lang.Object ref = trialName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      trialName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the trial to add measurement.
   * Format:
   * `projects/{project}/locations/{location}/studies/{study}/trials/{trial}`
   * </pre>
   *
   * <code>
   * string trial_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for trialName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTrialNameBytes() {
    java.lang.Object ref = trialName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      trialName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MEASUREMENT_FIELD_NUMBER = 3;
  private com.google.cloud.aiplatform.v1.Measurement measurement_;
  /**
   *
   *
   * <pre>
   * Required. The measurement to be added to a Trial.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.Measurement measurement = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the measurement field is set.
   */
  @java.lang.Override
  public boolean hasMeasurement() {
    return measurement_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The measurement to be added to a Trial.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.Measurement measurement = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The measurement.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.Measurement getMeasurement() {
    return measurement_ == null
        ? com.google.cloud.aiplatform.v1.Measurement.getDefaultInstance()
        : measurement_;
  }
  /**
   *
   *
   * <pre>
   * Required. The measurement to be added to a Trial.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.Measurement measurement = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.MeasurementOrBuilder getMeasurementOrBuilder() {
    return getMeasurement();
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
    if (!getTrialNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, trialName_);
    }
    if (measurement_ != null) {
      output.writeMessage(3, getMeasurement());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTrialNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, trialName_);
    }
    if (measurement_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getMeasurement());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest other =
        (com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest) obj;

    if (!getTrialName().equals(other.getTrialName())) return false;
    if (hasMeasurement() != other.hasMeasurement()) return false;
    if (hasMeasurement()) {
      if (!getMeasurement().equals(other.getMeasurement())) return false;
    }
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
    hash = (37 * hash) + TRIAL_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getTrialName().hashCode();
    if (hasMeasurement()) {
      hash = (37 * hash) + MEASUREMENT_FIELD_NUMBER;
      hash = (53 * hash) + getMeasurement().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest parseFrom(
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
      com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest prototype) {
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
   * Request message for [VizierService.AddTrialMeasurement][google.cloud.aiplatform.v1.VizierService.AddTrialMeasurement].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.AddTrialMeasurementRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.AddTrialMeasurementRequest)
      com.google.cloud.aiplatform.v1.AddTrialMeasurementRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.VizierServiceProto
          .internal_static_google_cloud_aiplatform_v1_AddTrialMeasurementRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.VizierServiceProto
          .internal_static_google_cloud_aiplatform_v1_AddTrialMeasurementRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest.class,
              com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest.newBuilder()
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
      trialName_ = "";

      if (measurementBuilder_ == null) {
        measurement_ = null;
      } else {
        measurement_ = null;
        measurementBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.VizierServiceProto
          .internal_static_google_cloud_aiplatform_v1_AddTrialMeasurementRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest build() {
      com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest buildPartial() {
      com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest result =
          new com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest(this);
      result.trialName_ = trialName_;
      if (measurementBuilder_ == null) {
        result.measurement_ = measurement_;
      } else {
        result.measurement_ = measurementBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest other) {
      if (other == com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest.getDefaultInstance())
        return this;
      if (!other.getTrialName().isEmpty()) {
        trialName_ = other.trialName_;
        onChanged();
      }
      if (other.hasMeasurement()) {
        mergeMeasurement(other.getMeasurement());
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
      com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object trialName_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the trial to add measurement.
     * Format:
     * `projects/{project}/locations/{location}/studies/{study}/trials/{trial}`
     * </pre>
     *
     * <code>
     * string trial_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The trialName.
     */
    public java.lang.String getTrialName() {
      java.lang.Object ref = trialName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        trialName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the trial to add measurement.
     * Format:
     * `projects/{project}/locations/{location}/studies/{study}/trials/{trial}`
     * </pre>
     *
     * <code>
     * string trial_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for trialName.
     */
    public com.google.protobuf.ByteString getTrialNameBytes() {
      java.lang.Object ref = trialName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        trialName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the trial to add measurement.
     * Format:
     * `projects/{project}/locations/{location}/studies/{study}/trials/{trial}`
     * </pre>
     *
     * <code>
     * string trial_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The trialName to set.
     * @return This builder for chaining.
     */
    public Builder setTrialName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      trialName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the trial to add measurement.
     * Format:
     * `projects/{project}/locations/{location}/studies/{study}/trials/{trial}`
     * </pre>
     *
     * <code>
     * string trial_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTrialName() {

      trialName_ = getDefaultInstance().getTrialName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the trial to add measurement.
     * Format:
     * `projects/{project}/locations/{location}/studies/{study}/trials/{trial}`
     * </pre>
     *
     * <code>
     * string trial_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for trialName to set.
     * @return This builder for chaining.
     */
    public Builder setTrialNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      trialName_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.aiplatform.v1.Measurement measurement_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.Measurement,
            com.google.cloud.aiplatform.v1.Measurement.Builder,
            com.google.cloud.aiplatform.v1.MeasurementOrBuilder>
        measurementBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The measurement to be added to a Trial.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.Measurement measurement = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the measurement field is set.
     */
    public boolean hasMeasurement() {
      return measurementBuilder_ != null || measurement_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The measurement to be added to a Trial.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.Measurement measurement = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The measurement.
     */
    public com.google.cloud.aiplatform.v1.Measurement getMeasurement() {
      if (measurementBuilder_ == null) {
        return measurement_ == null
            ? com.google.cloud.aiplatform.v1.Measurement.getDefaultInstance()
            : measurement_;
      } else {
        return measurementBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The measurement to be added to a Trial.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.Measurement measurement = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setMeasurement(com.google.cloud.aiplatform.v1.Measurement value) {
      if (measurementBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        measurement_ = value;
        onChanged();
      } else {
        measurementBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The measurement to be added to a Trial.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.Measurement measurement = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setMeasurement(
        com.google.cloud.aiplatform.v1.Measurement.Builder builderForValue) {
      if (measurementBuilder_ == null) {
        measurement_ = builderForValue.build();
        onChanged();
      } else {
        measurementBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The measurement to be added to a Trial.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.Measurement measurement = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeMeasurement(com.google.cloud.aiplatform.v1.Measurement value) {
      if (measurementBuilder_ == null) {
        if (measurement_ != null) {
          measurement_ =
              com.google.cloud.aiplatform.v1.Measurement.newBuilder(measurement_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          measurement_ = value;
        }
        onChanged();
      } else {
        measurementBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The measurement to be added to a Trial.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.Measurement measurement = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearMeasurement() {
      if (measurementBuilder_ == null) {
        measurement_ = null;
        onChanged();
      } else {
        measurement_ = null;
        measurementBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The measurement to be added to a Trial.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.Measurement measurement = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1.Measurement.Builder getMeasurementBuilder() {

      onChanged();
      return getMeasurementFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The measurement to be added to a Trial.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.Measurement measurement = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1.MeasurementOrBuilder getMeasurementOrBuilder() {
      if (measurementBuilder_ != null) {
        return measurementBuilder_.getMessageOrBuilder();
      } else {
        return measurement_ == null
            ? com.google.cloud.aiplatform.v1.Measurement.getDefaultInstance()
            : measurement_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The measurement to be added to a Trial.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.Measurement measurement = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.Measurement,
            com.google.cloud.aiplatform.v1.Measurement.Builder,
            com.google.cloud.aiplatform.v1.MeasurementOrBuilder>
        getMeasurementFieldBuilder() {
      if (measurementBuilder_ == null) {
        measurementBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1.Measurement,
                com.google.cloud.aiplatform.v1.Measurement.Builder,
                com.google.cloud.aiplatform.v1.MeasurementOrBuilder>(
                getMeasurement(), getParentForChildren(), isClean());
        measurement_ = null;
      }
      return measurementBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.AddTrialMeasurementRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.AddTrialMeasurementRequest)
  private static final com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest();
  }

  public static com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddTrialMeasurementRequest> PARSER =
      new com.google.protobuf.AbstractParser<AddTrialMeasurementRequest>() {
        @java.lang.Override
        public AddTrialMeasurementRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AddTrialMeasurementRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AddTrialMeasurementRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddTrialMeasurementRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.AddTrialMeasurementRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
