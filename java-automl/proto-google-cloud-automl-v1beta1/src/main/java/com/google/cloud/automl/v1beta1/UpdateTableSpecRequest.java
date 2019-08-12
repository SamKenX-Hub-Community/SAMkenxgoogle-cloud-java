// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/service.proto

package com.google.cloud.automl.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for [AutoMl.UpdateTableSpec][google.cloud.automl.v1beta1.AutoMl.UpdateTableSpec]
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1beta1.UpdateTableSpecRequest}
 */
public final class UpdateTableSpecRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1beta1.UpdateTableSpecRequest)
    UpdateTableSpecRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateTableSpecRequest.newBuilder() to construct.
  private UpdateTableSpecRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateTableSpecRequest() {}

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private UpdateTableSpecRequest(
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
              com.google.cloud.automl.v1beta1.TableSpec.Builder subBuilder = null;
              if (tableSpec_ != null) {
                subBuilder = tableSpec_.toBuilder();
              }
              tableSpec_ =
                  input.readMessage(
                      com.google.cloud.automl.v1beta1.TableSpec.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(tableSpec_);
                tableSpec_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.protobuf.FieldMask.Builder subBuilder = null;
              if (updateMask_ != null) {
                subBuilder = updateMask_.toBuilder();
              }
              updateMask_ =
                  input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(updateMask_);
                updateMask_ = subBuilder.buildPartial();
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
    return com.google.cloud.automl.v1beta1.AutoMlProto
        .internal_static_google_cloud_automl_v1beta1_UpdateTableSpecRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1beta1.AutoMlProto
        .internal_static_google_cloud_automl_v1beta1_UpdateTableSpecRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1beta1.UpdateTableSpecRequest.class,
            com.google.cloud.automl.v1beta1.UpdateTableSpecRequest.Builder.class);
  }

  public static final int TABLE_SPEC_FIELD_NUMBER = 1;
  private com.google.cloud.automl.v1beta1.TableSpec tableSpec_;
  /**
   *
   *
   * <pre>
   * The table spec which replaces the resource on the server.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TableSpec table_spec = 1;</code>
   */
  public boolean hasTableSpec() {
    return tableSpec_ != null;
  }
  /**
   *
   *
   * <pre>
   * The table spec which replaces the resource on the server.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TableSpec table_spec = 1;</code>
   */
  public com.google.cloud.automl.v1beta1.TableSpec getTableSpec() {
    return tableSpec_ == null
        ? com.google.cloud.automl.v1beta1.TableSpec.getDefaultInstance()
        : tableSpec_;
  }
  /**
   *
   *
   * <pre>
   * The table spec which replaces the resource on the server.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TableSpec table_spec = 1;</code>
   */
  public com.google.cloud.automl.v1beta1.TableSpecOrBuilder getTableSpecOrBuilder() {
    return getTableSpec();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * The update mask applies to the resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * The update mask applies to the resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * The update mask applies to the resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (tableSpec_ != null) {
      output.writeMessage(1, getTableSpec());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tableSpec_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getTableSpec());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.automl.v1beta1.UpdateTableSpecRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1beta1.UpdateTableSpecRequest other =
        (com.google.cloud.automl.v1beta1.UpdateTableSpecRequest) obj;

    if (hasTableSpec() != other.hasTableSpec()) return false;
    if (hasTableSpec()) {
      if (!getTableSpec().equals(other.getTableSpec())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
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
    if (hasTableSpec()) {
      hash = (37 * hash) + TABLE_SPEC_FIELD_NUMBER;
      hash = (53 * hash) + getTableSpec().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1beta1.UpdateTableSpecRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.UpdateTableSpecRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.UpdateTableSpecRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.UpdateTableSpecRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.UpdateTableSpecRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.UpdateTableSpecRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.UpdateTableSpecRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.UpdateTableSpecRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.UpdateTableSpecRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.UpdateTableSpecRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.UpdateTableSpecRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.UpdateTableSpecRequest parseFrom(
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
      com.google.cloud.automl.v1beta1.UpdateTableSpecRequest prototype) {
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
   * Request message for [AutoMl.UpdateTableSpec][google.cloud.automl.v1beta1.AutoMl.UpdateTableSpec]
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1beta1.UpdateTableSpecRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1beta1.UpdateTableSpecRequest)
      com.google.cloud.automl.v1beta1.UpdateTableSpecRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.automl.v1beta1.AutoMlProto
          .internal_static_google_cloud_automl_v1beta1_UpdateTableSpecRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1beta1.AutoMlProto
          .internal_static_google_cloud_automl_v1beta1_UpdateTableSpecRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1beta1.UpdateTableSpecRequest.class,
              com.google.cloud.automl.v1beta1.UpdateTableSpecRequest.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1beta1.UpdateTableSpecRequest.newBuilder()
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
      if (tableSpecBuilder_ == null) {
        tableSpec_ = null;
      } else {
        tableSpec_ = null;
        tableSpecBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.automl.v1beta1.AutoMlProto
          .internal_static_google_cloud_automl_v1beta1_UpdateTableSpecRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.UpdateTableSpecRequest getDefaultInstanceForType() {
      return com.google.cloud.automl.v1beta1.UpdateTableSpecRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.UpdateTableSpecRequest build() {
      com.google.cloud.automl.v1beta1.UpdateTableSpecRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.UpdateTableSpecRequest buildPartial() {
      com.google.cloud.automl.v1beta1.UpdateTableSpecRequest result =
          new com.google.cloud.automl.v1beta1.UpdateTableSpecRequest(this);
      if (tableSpecBuilder_ == null) {
        result.tableSpec_ = tableSpec_;
      } else {
        result.tableSpec_ = tableSpecBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.automl.v1beta1.UpdateTableSpecRequest) {
        return mergeFrom((com.google.cloud.automl.v1beta1.UpdateTableSpecRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.automl.v1beta1.UpdateTableSpecRequest other) {
      if (other == com.google.cloud.automl.v1beta1.UpdateTableSpecRequest.getDefaultInstance())
        return this;
      if (other.hasTableSpec()) {
        mergeTableSpec(other.getTableSpec());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
      com.google.cloud.automl.v1beta1.UpdateTableSpecRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.automl.v1beta1.UpdateTableSpecRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.automl.v1beta1.TableSpec tableSpec_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.automl.v1beta1.TableSpec,
            com.google.cloud.automl.v1beta1.TableSpec.Builder,
            com.google.cloud.automl.v1beta1.TableSpecOrBuilder>
        tableSpecBuilder_;
    /**
     *
     *
     * <pre>
     * The table spec which replaces the resource on the server.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.TableSpec table_spec = 1;</code>
     */
    public boolean hasTableSpec() {
      return tableSpecBuilder_ != null || tableSpec_ != null;
    }
    /**
     *
     *
     * <pre>
     * The table spec which replaces the resource on the server.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.TableSpec table_spec = 1;</code>
     */
    public com.google.cloud.automl.v1beta1.TableSpec getTableSpec() {
      if (tableSpecBuilder_ == null) {
        return tableSpec_ == null
            ? com.google.cloud.automl.v1beta1.TableSpec.getDefaultInstance()
            : tableSpec_;
      } else {
        return tableSpecBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The table spec which replaces the resource on the server.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.TableSpec table_spec = 1;</code>
     */
    public Builder setTableSpec(com.google.cloud.automl.v1beta1.TableSpec value) {
      if (tableSpecBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tableSpec_ = value;
        onChanged();
      } else {
        tableSpecBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The table spec which replaces the resource on the server.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.TableSpec table_spec = 1;</code>
     */
    public Builder setTableSpec(com.google.cloud.automl.v1beta1.TableSpec.Builder builderForValue) {
      if (tableSpecBuilder_ == null) {
        tableSpec_ = builderForValue.build();
        onChanged();
      } else {
        tableSpecBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The table spec which replaces the resource on the server.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.TableSpec table_spec = 1;</code>
     */
    public Builder mergeTableSpec(com.google.cloud.automl.v1beta1.TableSpec value) {
      if (tableSpecBuilder_ == null) {
        if (tableSpec_ != null) {
          tableSpec_ =
              com.google.cloud.automl.v1beta1.TableSpec.newBuilder(tableSpec_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          tableSpec_ = value;
        }
        onChanged();
      } else {
        tableSpecBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The table spec which replaces the resource on the server.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.TableSpec table_spec = 1;</code>
     */
    public Builder clearTableSpec() {
      if (tableSpecBuilder_ == null) {
        tableSpec_ = null;
        onChanged();
      } else {
        tableSpec_ = null;
        tableSpecBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The table spec which replaces the resource on the server.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.TableSpec table_spec = 1;</code>
     */
    public com.google.cloud.automl.v1beta1.TableSpec.Builder getTableSpecBuilder() {

      onChanged();
      return getTableSpecFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The table spec which replaces the resource on the server.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.TableSpec table_spec = 1;</code>
     */
    public com.google.cloud.automl.v1beta1.TableSpecOrBuilder getTableSpecOrBuilder() {
      if (tableSpecBuilder_ != null) {
        return tableSpecBuilder_.getMessageOrBuilder();
      } else {
        return tableSpec_ == null
            ? com.google.cloud.automl.v1beta1.TableSpec.getDefaultInstance()
            : tableSpec_;
      }
    }
    /**
     *
     *
     * <pre>
     * The table spec which replaces the resource on the server.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.TableSpec table_spec = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.automl.v1beta1.TableSpec,
            com.google.cloud.automl.v1beta1.TableSpec.Builder,
            com.google.cloud.automl.v1beta1.TableSpecOrBuilder>
        getTableSpecFieldBuilder() {
      if (tableSpecBuilder_ == null) {
        tableSpecBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.automl.v1beta1.TableSpec,
                com.google.cloud.automl.v1beta1.TableSpec.Builder,
                com.google.cloud.automl.v1beta1.TableSpecOrBuilder>(
                getTableSpec(), getParentForChildren(), isClean());
        tableSpec_ = null;
      }
      return tableSpecBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * The update mask applies to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * The update mask applies to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The update mask applies to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The update mask applies to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The update mask applies to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
              com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The update mask applies to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The update mask applies to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The update mask applies to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * The update mask applies to the resource.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1beta1.UpdateTableSpecRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.UpdateTableSpecRequest)
  private static final com.google.cloud.automl.v1beta1.UpdateTableSpecRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1beta1.UpdateTableSpecRequest();
  }

  public static com.google.cloud.automl.v1beta1.UpdateTableSpecRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateTableSpecRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateTableSpecRequest>() {
        @java.lang.Override
        public UpdateTableSpecRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UpdateTableSpecRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<UpdateTableSpecRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateTableSpecRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1beta1.UpdateTableSpecRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
