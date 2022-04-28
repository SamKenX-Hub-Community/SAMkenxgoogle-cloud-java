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
// source: google/cloud/dataplex/v1/metadata.proto

package com.google.cloud.dataplex.v1;

/**
 *
 *
 * <pre>
 * List metadata entities response.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataplex.v1.ListEntitiesResponse}
 */
public final class ListEntitiesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataplex.v1.ListEntitiesResponse)
    ListEntitiesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListEntitiesResponse.newBuilder() to construct.
  private ListEntitiesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListEntitiesResponse() {
    entities_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListEntitiesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListEntitiesResponse(
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                entities_ = new java.util.ArrayList<com.google.cloud.dataplex.v1.Entity>();
                mutable_bitField0_ |= 0x00000001;
              }
              entities_.add(
                  input.readMessage(
                      com.google.cloud.dataplex.v1.Entity.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        entities_ = java.util.Collections.unmodifiableList(entities_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataplex.v1.MetadataProto
        .internal_static_google_cloud_dataplex_v1_ListEntitiesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataplex.v1.MetadataProto
        .internal_static_google_cloud_dataplex_v1_ListEntitiesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataplex.v1.ListEntitiesResponse.class,
            com.google.cloud.dataplex.v1.ListEntitiesResponse.Builder.class);
  }

  public static final int ENTITIES_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.dataplex.v1.Entity> entities_;
  /**
   *
   *
   * <pre>
   * Entities in the specified parent zone.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.Entity entities = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dataplex.v1.Entity> getEntitiesList() {
    return entities_;
  }
  /**
   *
   *
   * <pre>
   * Entities in the specified parent zone.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.Entity entities = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.dataplex.v1.EntityOrBuilder>
      getEntitiesOrBuilderList() {
    return entities_;
  }
  /**
   *
   *
   * <pre>
   * Entities in the specified parent zone.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.Entity entities = 1;</code>
   */
  @java.lang.Override
  public int getEntitiesCount() {
    return entities_.size();
  }
  /**
   *
   *
   * <pre>
   * Entities in the specified parent zone.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.Entity entities = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.Entity getEntities(int index) {
    return entities_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Entities in the specified parent zone.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.Entity entities = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.EntityOrBuilder getEntitiesOrBuilder(int index) {
    return entities_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * remaining results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * remaining results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < entities_.size(); i++) {
      output.writeMessage(1, entities_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < entities_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, entities_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.dataplex.v1.ListEntitiesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dataplex.v1.ListEntitiesResponse other =
        (com.google.cloud.dataplex.v1.ListEntitiesResponse) obj;

    if (!getEntitiesList().equals(other.getEntitiesList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getEntitiesCount() > 0) {
      hash = (37 * hash) + ENTITIES_FIELD_NUMBER;
      hash = (53 * hash) + getEntitiesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataplex.v1.ListEntitiesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.ListEntitiesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.ListEntitiesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.ListEntitiesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.ListEntitiesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.ListEntitiesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.ListEntitiesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.ListEntitiesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.ListEntitiesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.ListEntitiesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.ListEntitiesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.ListEntitiesResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataplex.v1.ListEntitiesResponse prototype) {
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
   * List metadata entities response.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataplex.v1.ListEntitiesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataplex.v1.ListEntitiesResponse)
      com.google.cloud.dataplex.v1.ListEntitiesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataplex.v1.MetadataProto
          .internal_static_google_cloud_dataplex_v1_ListEntitiesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataplex.v1.MetadataProto
          .internal_static_google_cloud_dataplex_v1_ListEntitiesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataplex.v1.ListEntitiesResponse.class,
              com.google.cloud.dataplex.v1.ListEntitiesResponse.Builder.class);
    }

    // Construct using com.google.cloud.dataplex.v1.ListEntitiesResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getEntitiesFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (entitiesBuilder_ == null) {
        entities_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        entitiesBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataplex.v1.MetadataProto
          .internal_static_google_cloud_dataplex_v1_ListEntitiesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.ListEntitiesResponse getDefaultInstanceForType() {
      return com.google.cloud.dataplex.v1.ListEntitiesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.ListEntitiesResponse build() {
      com.google.cloud.dataplex.v1.ListEntitiesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.ListEntitiesResponse buildPartial() {
      com.google.cloud.dataplex.v1.ListEntitiesResponse result =
          new com.google.cloud.dataplex.v1.ListEntitiesResponse(this);
      int from_bitField0_ = bitField0_;
      if (entitiesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          entities_ = java.util.Collections.unmodifiableList(entities_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.entities_ = entities_;
      } else {
        result.entities_ = entitiesBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.dataplex.v1.ListEntitiesResponse) {
        return mergeFrom((com.google.cloud.dataplex.v1.ListEntitiesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataplex.v1.ListEntitiesResponse other) {
      if (other == com.google.cloud.dataplex.v1.ListEntitiesResponse.getDefaultInstance())
        return this;
      if (entitiesBuilder_ == null) {
        if (!other.entities_.isEmpty()) {
          if (entities_.isEmpty()) {
            entities_ = other.entities_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEntitiesIsMutable();
            entities_.addAll(other.entities_);
          }
          onChanged();
        }
      } else {
        if (!other.entities_.isEmpty()) {
          if (entitiesBuilder_.isEmpty()) {
            entitiesBuilder_.dispose();
            entitiesBuilder_ = null;
            entities_ = other.entities_;
            bitField0_ = (bitField0_ & ~0x00000001);
            entitiesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getEntitiesFieldBuilder()
                    : null;
          } else {
            entitiesBuilder_.addAllMessages(other.entities_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.cloud.dataplex.v1.ListEntitiesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.dataplex.v1.ListEntitiesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.dataplex.v1.Entity> entities_ =
        java.util.Collections.emptyList();

    private void ensureEntitiesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        entities_ = new java.util.ArrayList<com.google.cloud.dataplex.v1.Entity>(entities_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dataplex.v1.Entity,
            com.google.cloud.dataplex.v1.Entity.Builder,
            com.google.cloud.dataplex.v1.EntityOrBuilder>
        entitiesBuilder_;

    /**
     *
     *
     * <pre>
     * Entities in the specified parent zone.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Entity entities = 1;</code>
     */
    public java.util.List<com.google.cloud.dataplex.v1.Entity> getEntitiesList() {
      if (entitiesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(entities_);
      } else {
        return entitiesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Entities in the specified parent zone.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Entity entities = 1;</code>
     */
    public int getEntitiesCount() {
      if (entitiesBuilder_ == null) {
        return entities_.size();
      } else {
        return entitiesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Entities in the specified parent zone.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Entity entities = 1;</code>
     */
    public com.google.cloud.dataplex.v1.Entity getEntities(int index) {
      if (entitiesBuilder_ == null) {
        return entities_.get(index);
      } else {
        return entitiesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Entities in the specified parent zone.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Entity entities = 1;</code>
     */
    public Builder setEntities(int index, com.google.cloud.dataplex.v1.Entity value) {
      if (entitiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntitiesIsMutable();
        entities_.set(index, value);
        onChanged();
      } else {
        entitiesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Entities in the specified parent zone.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Entity entities = 1;</code>
     */
    public Builder setEntities(
        int index, com.google.cloud.dataplex.v1.Entity.Builder builderForValue) {
      if (entitiesBuilder_ == null) {
        ensureEntitiesIsMutable();
        entities_.set(index, builderForValue.build());
        onChanged();
      } else {
        entitiesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Entities in the specified parent zone.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Entity entities = 1;</code>
     */
    public Builder addEntities(com.google.cloud.dataplex.v1.Entity value) {
      if (entitiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntitiesIsMutable();
        entities_.add(value);
        onChanged();
      } else {
        entitiesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Entities in the specified parent zone.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Entity entities = 1;</code>
     */
    public Builder addEntities(int index, com.google.cloud.dataplex.v1.Entity value) {
      if (entitiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntitiesIsMutable();
        entities_.add(index, value);
        onChanged();
      } else {
        entitiesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Entities in the specified parent zone.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Entity entities = 1;</code>
     */
    public Builder addEntities(com.google.cloud.dataplex.v1.Entity.Builder builderForValue) {
      if (entitiesBuilder_ == null) {
        ensureEntitiesIsMutable();
        entities_.add(builderForValue.build());
        onChanged();
      } else {
        entitiesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Entities in the specified parent zone.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Entity entities = 1;</code>
     */
    public Builder addEntities(
        int index, com.google.cloud.dataplex.v1.Entity.Builder builderForValue) {
      if (entitiesBuilder_ == null) {
        ensureEntitiesIsMutable();
        entities_.add(index, builderForValue.build());
        onChanged();
      } else {
        entitiesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Entities in the specified parent zone.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Entity entities = 1;</code>
     */
    public Builder addAllEntities(
        java.lang.Iterable<? extends com.google.cloud.dataplex.v1.Entity> values) {
      if (entitiesBuilder_ == null) {
        ensureEntitiesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, entities_);
        onChanged();
      } else {
        entitiesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Entities in the specified parent zone.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Entity entities = 1;</code>
     */
    public Builder clearEntities() {
      if (entitiesBuilder_ == null) {
        entities_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        entitiesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Entities in the specified parent zone.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Entity entities = 1;</code>
     */
    public Builder removeEntities(int index) {
      if (entitiesBuilder_ == null) {
        ensureEntitiesIsMutable();
        entities_.remove(index);
        onChanged();
      } else {
        entitiesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Entities in the specified parent zone.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Entity entities = 1;</code>
     */
    public com.google.cloud.dataplex.v1.Entity.Builder getEntitiesBuilder(int index) {
      return getEntitiesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Entities in the specified parent zone.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Entity entities = 1;</code>
     */
    public com.google.cloud.dataplex.v1.EntityOrBuilder getEntitiesOrBuilder(int index) {
      if (entitiesBuilder_ == null) {
        return entities_.get(index);
      } else {
        return entitiesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Entities in the specified parent zone.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Entity entities = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.dataplex.v1.EntityOrBuilder>
        getEntitiesOrBuilderList() {
      if (entitiesBuilder_ != null) {
        return entitiesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(entities_);
      }
    }
    /**
     *
     *
     * <pre>
     * Entities in the specified parent zone.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Entity entities = 1;</code>
     */
    public com.google.cloud.dataplex.v1.Entity.Builder addEntitiesBuilder() {
      return getEntitiesFieldBuilder()
          .addBuilder(com.google.cloud.dataplex.v1.Entity.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Entities in the specified parent zone.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Entity entities = 1;</code>
     */
    public com.google.cloud.dataplex.v1.Entity.Builder addEntitiesBuilder(int index) {
      return getEntitiesFieldBuilder()
          .addBuilder(index, com.google.cloud.dataplex.v1.Entity.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Entities in the specified parent zone.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Entity entities = 1;</code>
     */
    public java.util.List<com.google.cloud.dataplex.v1.Entity.Builder> getEntitiesBuilderList() {
      return getEntitiesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dataplex.v1.Entity,
            com.google.cloud.dataplex.v1.Entity.Builder,
            com.google.cloud.dataplex.v1.EntityOrBuilder>
        getEntitiesFieldBuilder() {
      if (entitiesBuilder_ == null) {
        entitiesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.dataplex.v1.Entity,
                com.google.cloud.dataplex.v1.Entity.Builder,
                com.google.cloud.dataplex.v1.EntityOrBuilder>(
                entities_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        entities_ = null;
      }
      return entitiesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * remaining results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * remaining results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * remaining results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * remaining results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * remaining results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataplex.v1.ListEntitiesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataplex.v1.ListEntitiesResponse)
  private static final com.google.cloud.dataplex.v1.ListEntitiesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataplex.v1.ListEntitiesResponse();
  }

  public static com.google.cloud.dataplex.v1.ListEntitiesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListEntitiesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListEntitiesResponse>() {
        @java.lang.Override
        public ListEntitiesResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListEntitiesResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListEntitiesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListEntitiesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataplex.v1.ListEntitiesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
