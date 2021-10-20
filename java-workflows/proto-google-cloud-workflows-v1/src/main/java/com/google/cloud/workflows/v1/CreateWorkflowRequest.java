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
// source: google/cloud/workflows/v1/workflows.proto

package com.google.cloud.workflows.v1;

/**
 *
 *
 * <pre>
 * Request for the
 * [CreateWorkflow][google.cloud.workflows.v1.Workflows.CreateWorkflow]
 * method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.workflows.v1.CreateWorkflowRequest}
 */
public final class CreateWorkflowRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.workflows.v1.CreateWorkflowRequest)
    CreateWorkflowRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateWorkflowRequest.newBuilder() to construct.
  private CreateWorkflowRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateWorkflowRequest() {
    parent_ = "";
    workflowId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateWorkflowRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateWorkflowRequest(
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

              parent_ = s;
              break;
            }
          case 18:
            {
              com.google.cloud.workflows.v1.Workflow.Builder subBuilder = null;
              if (workflow_ != null) {
                subBuilder = workflow_.toBuilder();
              }
              workflow_ =
                  input.readMessage(
                      com.google.cloud.workflows.v1.Workflow.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(workflow_);
                workflow_ = subBuilder.buildPartial();
              }

              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              workflowId_ = s;
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
    return com.google.cloud.workflows.v1.WorkflowsProto
        .internal_static_google_cloud_workflows_v1_CreateWorkflowRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.workflows.v1.WorkflowsProto
        .internal_static_google_cloud_workflows_v1_CreateWorkflowRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.workflows.v1.CreateWorkflowRequest.class,
            com.google.cloud.workflows.v1.CreateWorkflowRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. Project and location in which the workflow should be created.
   * Format:  projects/{project}/locations/{location}
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
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
   * Required. Project and location in which the workflow should be created.
   * Format:  projects/{project}/locations/{location}
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
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

  public static final int WORKFLOW_FIELD_NUMBER = 2;
  private com.google.cloud.workflows.v1.Workflow workflow_;
  /**
   *
   *
   * <pre>
   * Required. Workflow to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.workflows.v1.Workflow workflow = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the workflow field is set.
   */
  @java.lang.Override
  public boolean hasWorkflow() {
    return workflow_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Workflow to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.workflows.v1.Workflow workflow = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The workflow.
   */
  @java.lang.Override
  public com.google.cloud.workflows.v1.Workflow getWorkflow() {
    return workflow_ == null
        ? com.google.cloud.workflows.v1.Workflow.getDefaultInstance()
        : workflow_;
  }
  /**
   *
   *
   * <pre>
   * Required. Workflow to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.workflows.v1.Workflow workflow = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.workflows.v1.WorkflowOrBuilder getWorkflowOrBuilder() {
    return getWorkflow();
  }

  public static final int WORKFLOW_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object workflowId_;
  /**
   *
   *
   * <pre>
   * Required. The ID of the workflow to be created. It has to fulfill the
   * following requirements:
   * * Must contain only letters, numbers, underscores and hyphens.
   * * Must start with a letter.
   * * Must be between 1-64 characters.
   * * Must end with a number or a letter.
   * * Must be unique within the customer project and location.
   * </pre>
   *
   * <code>string workflow_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The workflowId.
   */
  @java.lang.Override
  public java.lang.String getWorkflowId() {
    java.lang.Object ref = workflowId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      workflowId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The ID of the workflow to be created. It has to fulfill the
   * following requirements:
   * * Must contain only letters, numbers, underscores and hyphens.
   * * Must start with a letter.
   * * Must be between 1-64 characters.
   * * Must end with a number or a letter.
   * * Must be unique within the customer project and location.
   * </pre>
   *
   * <code>string workflow_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for workflowId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getWorkflowIdBytes() {
    java.lang.Object ref = workflowId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      workflowId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (workflow_ != null) {
      output.writeMessage(2, getWorkflow());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(workflowId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, workflowId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (workflow_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getWorkflow());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(workflowId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, workflowId_);
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
    if (!(obj instanceof com.google.cloud.workflows.v1.CreateWorkflowRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.workflows.v1.CreateWorkflowRequest other =
        (com.google.cloud.workflows.v1.CreateWorkflowRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasWorkflow() != other.hasWorkflow()) return false;
    if (hasWorkflow()) {
      if (!getWorkflow().equals(other.getWorkflow())) return false;
    }
    if (!getWorkflowId().equals(other.getWorkflowId())) return false;
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
    if (hasWorkflow()) {
      hash = (37 * hash) + WORKFLOW_FIELD_NUMBER;
      hash = (53 * hash) + getWorkflow().hashCode();
    }
    hash = (37 * hash) + WORKFLOW_ID_FIELD_NUMBER;
    hash = (53 * hash) + getWorkflowId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.workflows.v1.CreateWorkflowRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.workflows.v1.CreateWorkflowRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.workflows.v1.CreateWorkflowRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.workflows.v1.CreateWorkflowRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.workflows.v1.CreateWorkflowRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.workflows.v1.CreateWorkflowRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.workflows.v1.CreateWorkflowRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.workflows.v1.CreateWorkflowRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.workflows.v1.CreateWorkflowRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.workflows.v1.CreateWorkflowRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.workflows.v1.CreateWorkflowRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.workflows.v1.CreateWorkflowRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.workflows.v1.CreateWorkflowRequest prototype) {
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
   * Request for the
   * [CreateWorkflow][google.cloud.workflows.v1.Workflows.CreateWorkflow]
   * method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.workflows.v1.CreateWorkflowRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.workflows.v1.CreateWorkflowRequest)
      com.google.cloud.workflows.v1.CreateWorkflowRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.workflows.v1.WorkflowsProto
          .internal_static_google_cloud_workflows_v1_CreateWorkflowRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.workflows.v1.WorkflowsProto
          .internal_static_google_cloud_workflows_v1_CreateWorkflowRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.workflows.v1.CreateWorkflowRequest.class,
              com.google.cloud.workflows.v1.CreateWorkflowRequest.Builder.class);
    }

    // Construct using com.google.cloud.workflows.v1.CreateWorkflowRequest.newBuilder()
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

      if (workflowBuilder_ == null) {
        workflow_ = null;
      } else {
        workflow_ = null;
        workflowBuilder_ = null;
      }
      workflowId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.workflows.v1.WorkflowsProto
          .internal_static_google_cloud_workflows_v1_CreateWorkflowRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.workflows.v1.CreateWorkflowRequest getDefaultInstanceForType() {
      return com.google.cloud.workflows.v1.CreateWorkflowRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.workflows.v1.CreateWorkflowRequest build() {
      com.google.cloud.workflows.v1.CreateWorkflowRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.workflows.v1.CreateWorkflowRequest buildPartial() {
      com.google.cloud.workflows.v1.CreateWorkflowRequest result =
          new com.google.cloud.workflows.v1.CreateWorkflowRequest(this);
      result.parent_ = parent_;
      if (workflowBuilder_ == null) {
        result.workflow_ = workflow_;
      } else {
        result.workflow_ = workflowBuilder_.build();
      }
      result.workflowId_ = workflowId_;
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
      if (other instanceof com.google.cloud.workflows.v1.CreateWorkflowRequest) {
        return mergeFrom((com.google.cloud.workflows.v1.CreateWorkflowRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.workflows.v1.CreateWorkflowRequest other) {
      if (other == com.google.cloud.workflows.v1.CreateWorkflowRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasWorkflow()) {
        mergeWorkflow(other.getWorkflow());
      }
      if (!other.getWorkflowId().isEmpty()) {
        workflowId_ = other.workflowId_;
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
      com.google.cloud.workflows.v1.CreateWorkflowRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.workflows.v1.CreateWorkflowRequest) e.getUnfinishedMessage();
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
     * Required. Project and location in which the workflow should be created.
     * Format:  projects/{project}/locations/{location}
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
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
     * Required. Project and location in which the workflow should be created.
     * Format:  projects/{project}/locations/{location}
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
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
     * Required. Project and location in which the workflow should be created.
     * Format:  projects/{project}/locations/{location}
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
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
     * Required. Project and location in which the workflow should be created.
     * Format:  projects/{project}/locations/{location}
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
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
     * Required. Project and location in which the workflow should be created.
     * Format:  projects/{project}/locations/{location}
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
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

    private com.google.cloud.workflows.v1.Workflow workflow_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.workflows.v1.Workflow,
            com.google.cloud.workflows.v1.Workflow.Builder,
            com.google.cloud.workflows.v1.WorkflowOrBuilder>
        workflowBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Workflow to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.workflows.v1.Workflow workflow = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the workflow field is set.
     */
    public boolean hasWorkflow() {
      return workflowBuilder_ != null || workflow_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. Workflow to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.workflows.v1.Workflow workflow = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The workflow.
     */
    public com.google.cloud.workflows.v1.Workflow getWorkflow() {
      if (workflowBuilder_ == null) {
        return workflow_ == null
            ? com.google.cloud.workflows.v1.Workflow.getDefaultInstance()
            : workflow_;
      } else {
        return workflowBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Workflow to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.workflows.v1.Workflow workflow = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setWorkflow(com.google.cloud.workflows.v1.Workflow value) {
      if (workflowBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        workflow_ = value;
        onChanged();
      } else {
        workflowBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Workflow to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.workflows.v1.Workflow workflow = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setWorkflow(com.google.cloud.workflows.v1.Workflow.Builder builderForValue) {
      if (workflowBuilder_ == null) {
        workflow_ = builderForValue.build();
        onChanged();
      } else {
        workflowBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Workflow to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.workflows.v1.Workflow workflow = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeWorkflow(com.google.cloud.workflows.v1.Workflow value) {
      if (workflowBuilder_ == null) {
        if (workflow_ != null) {
          workflow_ =
              com.google.cloud.workflows.v1.Workflow.newBuilder(workflow_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          workflow_ = value;
        }
        onChanged();
      } else {
        workflowBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Workflow to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.workflows.v1.Workflow workflow = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearWorkflow() {
      if (workflowBuilder_ == null) {
        workflow_ = null;
        onChanged();
      } else {
        workflow_ = null;
        workflowBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Workflow to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.workflows.v1.Workflow workflow = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.workflows.v1.Workflow.Builder getWorkflowBuilder() {

      onChanged();
      return getWorkflowFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Workflow to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.workflows.v1.Workflow workflow = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.workflows.v1.WorkflowOrBuilder getWorkflowOrBuilder() {
      if (workflowBuilder_ != null) {
        return workflowBuilder_.getMessageOrBuilder();
      } else {
        return workflow_ == null
            ? com.google.cloud.workflows.v1.Workflow.getDefaultInstance()
            : workflow_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Workflow to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.workflows.v1.Workflow workflow = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.workflows.v1.Workflow,
            com.google.cloud.workflows.v1.Workflow.Builder,
            com.google.cloud.workflows.v1.WorkflowOrBuilder>
        getWorkflowFieldBuilder() {
      if (workflowBuilder_ == null) {
        workflowBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.workflows.v1.Workflow,
                com.google.cloud.workflows.v1.Workflow.Builder,
                com.google.cloud.workflows.v1.WorkflowOrBuilder>(
                getWorkflow(), getParentForChildren(), isClean());
        workflow_ = null;
      }
      return workflowBuilder_;
    }

    private java.lang.Object workflowId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The ID of the workflow to be created. It has to fulfill the
     * following requirements:
     * * Must contain only letters, numbers, underscores and hyphens.
     * * Must start with a letter.
     * * Must be between 1-64 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the customer project and location.
     * </pre>
     *
     * <code>string workflow_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The workflowId.
     */
    public java.lang.String getWorkflowId() {
      java.lang.Object ref = workflowId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        workflowId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the workflow to be created. It has to fulfill the
     * following requirements:
     * * Must contain only letters, numbers, underscores and hyphens.
     * * Must start with a letter.
     * * Must be between 1-64 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the customer project and location.
     * </pre>
     *
     * <code>string workflow_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for workflowId.
     */
    public com.google.protobuf.ByteString getWorkflowIdBytes() {
      java.lang.Object ref = workflowId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        workflowId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the workflow to be created. It has to fulfill the
     * following requirements:
     * * Must contain only letters, numbers, underscores and hyphens.
     * * Must start with a letter.
     * * Must be between 1-64 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the customer project and location.
     * </pre>
     *
     * <code>string workflow_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The workflowId to set.
     * @return This builder for chaining.
     */
    public Builder setWorkflowId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      workflowId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the workflow to be created. It has to fulfill the
     * following requirements:
     * * Must contain only letters, numbers, underscores and hyphens.
     * * Must start with a letter.
     * * Must be between 1-64 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the customer project and location.
     * </pre>
     *
     * <code>string workflow_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearWorkflowId() {

      workflowId_ = getDefaultInstance().getWorkflowId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the workflow to be created. It has to fulfill the
     * following requirements:
     * * Must contain only letters, numbers, underscores and hyphens.
     * * Must start with a letter.
     * * Must be between 1-64 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the customer project and location.
     * </pre>
     *
     * <code>string workflow_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for workflowId to set.
     * @return This builder for chaining.
     */
    public Builder setWorkflowIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      workflowId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.workflows.v1.CreateWorkflowRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.workflows.v1.CreateWorkflowRequest)
  private static final com.google.cloud.workflows.v1.CreateWorkflowRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.workflows.v1.CreateWorkflowRequest();
  }

  public static com.google.cloud.workflows.v1.CreateWorkflowRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateWorkflowRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateWorkflowRequest>() {
        @java.lang.Override
        public CreateWorkflowRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateWorkflowRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateWorkflowRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateWorkflowRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.workflows.v1.CreateWorkflowRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
