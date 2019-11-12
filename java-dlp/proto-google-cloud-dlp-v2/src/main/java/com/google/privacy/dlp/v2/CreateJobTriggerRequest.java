/*
 * Copyright 2019 Google LLC
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
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * Request message for CreateJobTrigger.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.CreateJobTriggerRequest}
 */
public final class CreateJobTriggerRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.CreateJobTriggerRequest)
    CreateJobTriggerRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateJobTriggerRequest.newBuilder() to construct.
  private CreateJobTriggerRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateJobTriggerRequest() {
    parent_ = "";
    triggerId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateJobTriggerRequest(
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

              parent_ = s;
              break;
            }
          case 18:
            {
              com.google.privacy.dlp.v2.JobTrigger.Builder subBuilder = null;
              if (jobTrigger_ != null) {
                subBuilder = jobTrigger_.toBuilder();
              }
              jobTrigger_ =
                  input.readMessage(
                      com.google.privacy.dlp.v2.JobTrigger.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(jobTrigger_);
                jobTrigger_ = subBuilder.buildPartial();
              }

              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              triggerId_ = s;
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
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_CreateJobTriggerRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_CreateJobTriggerRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.CreateJobTriggerRequest.class,
            com.google.privacy.dlp.v2.CreateJobTriggerRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The parent resource name, for example projects/my-project-id.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The parent resource name, for example projects/my-project-id.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   */
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JOB_TRIGGER_FIELD_NUMBER = 2;
  private com.google.privacy.dlp.v2.JobTrigger jobTrigger_;
  /**
   *
   *
   * <pre>
   * The JobTrigger to create.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.JobTrigger job_trigger = 2;</code>
   */
  public boolean hasJobTrigger() {
    return jobTrigger_ != null;
  }
  /**
   *
   *
   * <pre>
   * The JobTrigger to create.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.JobTrigger job_trigger = 2;</code>
   */
  public com.google.privacy.dlp.v2.JobTrigger getJobTrigger() {
    return jobTrigger_ == null
        ? com.google.privacy.dlp.v2.JobTrigger.getDefaultInstance()
        : jobTrigger_;
  }
  /**
   *
   *
   * <pre>
   * The JobTrigger to create.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.JobTrigger job_trigger = 2;</code>
   */
  public com.google.privacy.dlp.v2.JobTriggerOrBuilder getJobTriggerOrBuilder() {
    return getJobTrigger();
  }

  public static final int TRIGGER_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object triggerId_;
  /**
   *
   *
   * <pre>
   * The trigger id can contain uppercase and lowercase letters,
   * numbers, and hyphens; that is, it must match the regular
   * expression: `[a-zA-Z&#92;&#92;d-_]+`. The maximum length is 100
   * characters. Can be empty to allow the system to generate one.
   * </pre>
   *
   * <code>string trigger_id = 3;</code>
   */
  public java.lang.String getTriggerId() {
    java.lang.Object ref = triggerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      triggerId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The trigger id can contain uppercase and lowercase letters,
   * numbers, and hyphens; that is, it must match the regular
   * expression: `[a-zA-Z&#92;&#92;d-_]+`. The maximum length is 100
   * characters. Can be empty to allow the system to generate one.
   * </pre>
   *
   * <code>string trigger_id = 3;</code>
   */
  public com.google.protobuf.ByteString getTriggerIdBytes() {
    java.lang.Object ref = triggerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      triggerId_ = b;
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
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (jobTrigger_ != null) {
      output.writeMessage(2, getJobTrigger());
    }
    if (!getTriggerIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, triggerId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (jobTrigger_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getJobTrigger());
    }
    if (!getTriggerIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, triggerId_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2.CreateJobTriggerRequest)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.CreateJobTriggerRequest other =
        (com.google.privacy.dlp.v2.CreateJobTriggerRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasJobTrigger() != other.hasJobTrigger()) return false;
    if (hasJobTrigger()) {
      if (!getJobTrigger().equals(other.getJobTrigger())) return false;
    }
    if (!getTriggerId().equals(other.getTriggerId())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasJobTrigger()) {
      hash = (37 * hash) + JOB_TRIGGER_FIELD_NUMBER;
      hash = (53 * hash) + getJobTrigger().hashCode();
    }
    hash = (37 * hash) + TRIGGER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTriggerId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.CreateJobTriggerRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.CreateJobTriggerRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.CreateJobTriggerRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.CreateJobTriggerRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.CreateJobTriggerRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.CreateJobTriggerRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.CreateJobTriggerRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.CreateJobTriggerRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.CreateJobTriggerRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.CreateJobTriggerRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.CreateJobTriggerRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.CreateJobTriggerRequest parseFrom(
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

  public static Builder newBuilder(com.google.privacy.dlp.v2.CreateJobTriggerRequest prototype) {
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
   * Request message for CreateJobTrigger.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.CreateJobTriggerRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.CreateJobTriggerRequest)
      com.google.privacy.dlp.v2.CreateJobTriggerRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_CreateJobTriggerRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_CreateJobTriggerRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.CreateJobTriggerRequest.class,
              com.google.privacy.dlp.v2.CreateJobTriggerRequest.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.CreateJobTriggerRequest.newBuilder()
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
      parent_ = "";

      if (jobTriggerBuilder_ == null) {
        jobTrigger_ = null;
      } else {
        jobTrigger_ = null;
        jobTriggerBuilder_ = null;
      }
      triggerId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_CreateJobTriggerRequest_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.CreateJobTriggerRequest getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.CreateJobTriggerRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.CreateJobTriggerRequest build() {
      com.google.privacy.dlp.v2.CreateJobTriggerRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.CreateJobTriggerRequest buildPartial() {
      com.google.privacy.dlp.v2.CreateJobTriggerRequest result =
          new com.google.privacy.dlp.v2.CreateJobTriggerRequest(this);
      result.parent_ = parent_;
      if (jobTriggerBuilder_ == null) {
        result.jobTrigger_ = jobTrigger_;
      } else {
        result.jobTrigger_ = jobTriggerBuilder_.build();
      }
      result.triggerId_ = triggerId_;
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
      if (other instanceof com.google.privacy.dlp.v2.CreateJobTriggerRequest) {
        return mergeFrom((com.google.privacy.dlp.v2.CreateJobTriggerRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.CreateJobTriggerRequest other) {
      if (other == com.google.privacy.dlp.v2.CreateJobTriggerRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasJobTrigger()) {
        mergeJobTrigger(other.getJobTrigger());
      }
      if (!other.getTriggerId().isEmpty()) {
        triggerId_ = other.triggerId_;
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
      com.google.privacy.dlp.v2.CreateJobTriggerRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.privacy.dlp.v2.CreateJobTriggerRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The parent resource name, for example projects/my-project-id.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource name, for example projects/my-project-id.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource name, for example projects/my-project-id.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource name, for example projects/my-project-id.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource name, for example projects/my-project-id.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.privacy.dlp.v2.JobTrigger jobTrigger_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.JobTrigger,
            com.google.privacy.dlp.v2.JobTrigger.Builder,
            com.google.privacy.dlp.v2.JobTriggerOrBuilder>
        jobTriggerBuilder_;
    /**
     *
     *
     * <pre>
     * The JobTrigger to create.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.JobTrigger job_trigger = 2;</code>
     */
    public boolean hasJobTrigger() {
      return jobTriggerBuilder_ != null || jobTrigger_ != null;
    }
    /**
     *
     *
     * <pre>
     * The JobTrigger to create.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.JobTrigger job_trigger = 2;</code>
     */
    public com.google.privacy.dlp.v2.JobTrigger getJobTrigger() {
      if (jobTriggerBuilder_ == null) {
        return jobTrigger_ == null
            ? com.google.privacy.dlp.v2.JobTrigger.getDefaultInstance()
            : jobTrigger_;
      } else {
        return jobTriggerBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The JobTrigger to create.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.JobTrigger job_trigger = 2;</code>
     */
    public Builder setJobTrigger(com.google.privacy.dlp.v2.JobTrigger value) {
      if (jobTriggerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        jobTrigger_ = value;
        onChanged();
      } else {
        jobTriggerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The JobTrigger to create.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.JobTrigger job_trigger = 2;</code>
     */
    public Builder setJobTrigger(com.google.privacy.dlp.v2.JobTrigger.Builder builderForValue) {
      if (jobTriggerBuilder_ == null) {
        jobTrigger_ = builderForValue.build();
        onChanged();
      } else {
        jobTriggerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The JobTrigger to create.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.JobTrigger job_trigger = 2;</code>
     */
    public Builder mergeJobTrigger(com.google.privacy.dlp.v2.JobTrigger value) {
      if (jobTriggerBuilder_ == null) {
        if (jobTrigger_ != null) {
          jobTrigger_ =
              com.google.privacy.dlp.v2.JobTrigger.newBuilder(jobTrigger_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          jobTrigger_ = value;
        }
        onChanged();
      } else {
        jobTriggerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The JobTrigger to create.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.JobTrigger job_trigger = 2;</code>
     */
    public Builder clearJobTrigger() {
      if (jobTriggerBuilder_ == null) {
        jobTrigger_ = null;
        onChanged();
      } else {
        jobTrigger_ = null;
        jobTriggerBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The JobTrigger to create.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.JobTrigger job_trigger = 2;</code>
     */
    public com.google.privacy.dlp.v2.JobTrigger.Builder getJobTriggerBuilder() {

      onChanged();
      return getJobTriggerFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The JobTrigger to create.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.JobTrigger job_trigger = 2;</code>
     */
    public com.google.privacy.dlp.v2.JobTriggerOrBuilder getJobTriggerOrBuilder() {
      if (jobTriggerBuilder_ != null) {
        return jobTriggerBuilder_.getMessageOrBuilder();
      } else {
        return jobTrigger_ == null
            ? com.google.privacy.dlp.v2.JobTrigger.getDefaultInstance()
            : jobTrigger_;
      }
    }
    /**
     *
     *
     * <pre>
     * The JobTrigger to create.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.JobTrigger job_trigger = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.JobTrigger,
            com.google.privacy.dlp.v2.JobTrigger.Builder,
            com.google.privacy.dlp.v2.JobTriggerOrBuilder>
        getJobTriggerFieldBuilder() {
      if (jobTriggerBuilder_ == null) {
        jobTriggerBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.privacy.dlp.v2.JobTrigger,
                com.google.privacy.dlp.v2.JobTrigger.Builder,
                com.google.privacy.dlp.v2.JobTriggerOrBuilder>(
                getJobTrigger(), getParentForChildren(), isClean());
        jobTrigger_ = null;
      }
      return jobTriggerBuilder_;
    }

    private java.lang.Object triggerId_ = "";
    /**
     *
     *
     * <pre>
     * The trigger id can contain uppercase and lowercase letters,
     * numbers, and hyphens; that is, it must match the regular
     * expression: `[a-zA-Z&#92;&#92;d-_]+`. The maximum length is 100
     * characters. Can be empty to allow the system to generate one.
     * </pre>
     *
     * <code>string trigger_id = 3;</code>
     */
    public java.lang.String getTriggerId() {
      java.lang.Object ref = triggerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        triggerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The trigger id can contain uppercase and lowercase letters,
     * numbers, and hyphens; that is, it must match the regular
     * expression: `[a-zA-Z&#92;&#92;d-_]+`. The maximum length is 100
     * characters. Can be empty to allow the system to generate one.
     * </pre>
     *
     * <code>string trigger_id = 3;</code>
     */
    public com.google.protobuf.ByteString getTriggerIdBytes() {
      java.lang.Object ref = triggerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        triggerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The trigger id can contain uppercase and lowercase letters,
     * numbers, and hyphens; that is, it must match the regular
     * expression: `[a-zA-Z&#92;&#92;d-_]+`. The maximum length is 100
     * characters. Can be empty to allow the system to generate one.
     * </pre>
     *
     * <code>string trigger_id = 3;</code>
     */
    public Builder setTriggerId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      triggerId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The trigger id can contain uppercase and lowercase letters,
     * numbers, and hyphens; that is, it must match the regular
     * expression: `[a-zA-Z&#92;&#92;d-_]+`. The maximum length is 100
     * characters. Can be empty to allow the system to generate one.
     * </pre>
     *
     * <code>string trigger_id = 3;</code>
     */
    public Builder clearTriggerId() {

      triggerId_ = getDefaultInstance().getTriggerId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The trigger id can contain uppercase and lowercase letters,
     * numbers, and hyphens; that is, it must match the regular
     * expression: `[a-zA-Z&#92;&#92;d-_]+`. The maximum length is 100
     * characters. Can be empty to allow the system to generate one.
     * </pre>
     *
     * <code>string trigger_id = 3;</code>
     */
    public Builder setTriggerIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      triggerId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.CreateJobTriggerRequest)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.CreateJobTriggerRequest)
  private static final com.google.privacy.dlp.v2.CreateJobTriggerRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.CreateJobTriggerRequest();
  }

  public static com.google.privacy.dlp.v2.CreateJobTriggerRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateJobTriggerRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateJobTriggerRequest>() {
        @java.lang.Override
        public CreateJobTriggerRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateJobTriggerRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateJobTriggerRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateJobTriggerRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.CreateJobTriggerRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
