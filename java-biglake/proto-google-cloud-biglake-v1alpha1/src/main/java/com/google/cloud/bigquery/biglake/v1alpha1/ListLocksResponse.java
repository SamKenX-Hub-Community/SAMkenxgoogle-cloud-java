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
// source: google/cloud/bigquery/biglake/v1alpha1/metastore.proto

package com.google.cloud.bigquery.biglake.v1alpha1;

/**
 *
 *
 * <pre>
 * Response message for the ListLocks method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse}
 */
public final class ListLocksResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse)
    ListLocksResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListLocksResponse.newBuilder() to construct.
  private ListLocksResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListLocksResponse() {
    locks_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListLocksResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.biglake.v1alpha1.MetastoreProto
        .internal_static_google_cloud_bigquery_biglake_v1alpha1_ListLocksResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.biglake.v1alpha1.MetastoreProto
        .internal_static_google_cloud_bigquery_biglake_v1alpha1_ListLocksResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse.class,
            com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse.Builder.class);
  }

  public static final int LOCKS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.bigquery.biglake.v1alpha1.Lock> locks_;
  /**
   *
   *
   * <pre>
   * The locks from the specified database.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.biglake.v1alpha1.Lock locks = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.bigquery.biglake.v1alpha1.Lock> getLocksList() {
    return locks_;
  }
  /**
   *
   *
   * <pre>
   * The locks from the specified database.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.biglake.v1alpha1.Lock locks = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.bigquery.biglake.v1alpha1.LockOrBuilder>
      getLocksOrBuilderList() {
    return locks_;
  }
  /**
   *
   *
   * <pre>
   * The locks from the specified database.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.biglake.v1alpha1.Lock locks = 1;</code>
   */
  @java.lang.Override
  public int getLocksCount() {
    return locks_.size();
  }
  /**
   *
   *
   * <pre>
   * The locks from the specified database.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.biglake.v1alpha1.Lock locks = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.biglake.v1alpha1.Lock getLocks(int index) {
    return locks_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The locks from the specified database.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.biglake.v1alpha1.Lock locks = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.biglake.v1alpha1.LockOrBuilder getLocksOrBuilder(int index) {
    return locks_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
    for (int i = 0; i < locks_.size(); i++) {
      output.writeMessage(1, locks_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < locks_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, locks_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse other =
        (com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse) obj;

    if (!getLocksList().equals(other.getLocksList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getLocksCount() > 0) {
      hash = (37 * hash) + LOCKS_FIELD_NUMBER;
      hash = (53 * hash) + getLocksList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse parseFrom(
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
      com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse prototype) {
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
   * Response message for the ListLocks method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse)
      com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.biglake.v1alpha1.MetastoreProto
          .internal_static_google_cloud_bigquery_biglake_v1alpha1_ListLocksResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.biglake.v1alpha1.MetastoreProto
          .internal_static_google_cloud_bigquery_biglake_v1alpha1_ListLocksResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse.class,
              com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (locksBuilder_ == null) {
        locks_ = java.util.Collections.emptyList();
      } else {
        locks_ = null;
        locksBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.biglake.v1alpha1.MetastoreProto
          .internal_static_google_cloud_bigquery_biglake_v1alpha1_ListLocksResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse
        getDefaultInstanceForType() {
      return com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse build() {
      com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse buildPartial() {
      com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse result =
          new com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse result) {
      if (locksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          locks_ = java.util.Collections.unmodifiableList(locks_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.locks_ = locks_;
      } else {
        result.locks_ = locksBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
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
      if (other instanceof com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse) {
        return mergeFrom((com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse other) {
      if (other
          == com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse.getDefaultInstance())
        return this;
      if (locksBuilder_ == null) {
        if (!other.locks_.isEmpty()) {
          if (locks_.isEmpty()) {
            locks_ = other.locks_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLocksIsMutable();
            locks_.addAll(other.locks_);
          }
          onChanged();
        }
      } else {
        if (!other.locks_.isEmpty()) {
          if (locksBuilder_.isEmpty()) {
            locksBuilder_.dispose();
            locksBuilder_ = null;
            locks_ = other.locks_;
            bitField0_ = (bitField0_ & ~0x00000001);
            locksBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getLocksFieldBuilder()
                    : null;
          } else {
            locksBuilder_.addAllMessages(other.locks_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
                com.google.cloud.bigquery.biglake.v1alpha1.Lock m =
                    input.readMessage(
                        com.google.cloud.bigquery.biglake.v1alpha1.Lock.parser(),
                        extensionRegistry);
                if (locksBuilder_ == null) {
                  ensureLocksIsMutable();
                  locks_.add(m);
                } else {
                  locksBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.bigquery.biglake.v1alpha1.Lock> locks_ =
        java.util.Collections.emptyList();

    private void ensureLocksIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        locks_ = new java.util.ArrayList<com.google.cloud.bigquery.biglake.v1alpha1.Lock>(locks_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.bigquery.biglake.v1alpha1.Lock,
            com.google.cloud.bigquery.biglake.v1alpha1.Lock.Builder,
            com.google.cloud.bigquery.biglake.v1alpha1.LockOrBuilder>
        locksBuilder_;

    /**
     *
     *
     * <pre>
     * The locks from the specified database.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.biglake.v1alpha1.Lock locks = 1;</code>
     */
    public java.util.List<com.google.cloud.bigquery.biglake.v1alpha1.Lock> getLocksList() {
      if (locksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(locks_);
      } else {
        return locksBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The locks from the specified database.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.biglake.v1alpha1.Lock locks = 1;</code>
     */
    public int getLocksCount() {
      if (locksBuilder_ == null) {
        return locks_.size();
      } else {
        return locksBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The locks from the specified database.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.biglake.v1alpha1.Lock locks = 1;</code>
     */
    public com.google.cloud.bigquery.biglake.v1alpha1.Lock getLocks(int index) {
      if (locksBuilder_ == null) {
        return locks_.get(index);
      } else {
        return locksBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The locks from the specified database.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.biglake.v1alpha1.Lock locks = 1;</code>
     */
    public Builder setLocks(int index, com.google.cloud.bigquery.biglake.v1alpha1.Lock value) {
      if (locksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLocksIsMutable();
        locks_.set(index, value);
        onChanged();
      } else {
        locksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The locks from the specified database.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.biglake.v1alpha1.Lock locks = 1;</code>
     */
    public Builder setLocks(
        int index, com.google.cloud.bigquery.biglake.v1alpha1.Lock.Builder builderForValue) {
      if (locksBuilder_ == null) {
        ensureLocksIsMutable();
        locks_.set(index, builderForValue.build());
        onChanged();
      } else {
        locksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The locks from the specified database.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.biglake.v1alpha1.Lock locks = 1;</code>
     */
    public Builder addLocks(com.google.cloud.bigquery.biglake.v1alpha1.Lock value) {
      if (locksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLocksIsMutable();
        locks_.add(value);
        onChanged();
      } else {
        locksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The locks from the specified database.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.biglake.v1alpha1.Lock locks = 1;</code>
     */
    public Builder addLocks(int index, com.google.cloud.bigquery.biglake.v1alpha1.Lock value) {
      if (locksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLocksIsMutable();
        locks_.add(index, value);
        onChanged();
      } else {
        locksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The locks from the specified database.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.biglake.v1alpha1.Lock locks = 1;</code>
     */
    public Builder addLocks(
        com.google.cloud.bigquery.biglake.v1alpha1.Lock.Builder builderForValue) {
      if (locksBuilder_ == null) {
        ensureLocksIsMutable();
        locks_.add(builderForValue.build());
        onChanged();
      } else {
        locksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The locks from the specified database.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.biglake.v1alpha1.Lock locks = 1;</code>
     */
    public Builder addLocks(
        int index, com.google.cloud.bigquery.biglake.v1alpha1.Lock.Builder builderForValue) {
      if (locksBuilder_ == null) {
        ensureLocksIsMutable();
        locks_.add(index, builderForValue.build());
        onChanged();
      } else {
        locksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The locks from the specified database.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.biglake.v1alpha1.Lock locks = 1;</code>
     */
    public Builder addAllLocks(
        java.lang.Iterable<? extends com.google.cloud.bigquery.biglake.v1alpha1.Lock> values) {
      if (locksBuilder_ == null) {
        ensureLocksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, locks_);
        onChanged();
      } else {
        locksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The locks from the specified database.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.biglake.v1alpha1.Lock locks = 1;</code>
     */
    public Builder clearLocks() {
      if (locksBuilder_ == null) {
        locks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        locksBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The locks from the specified database.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.biglake.v1alpha1.Lock locks = 1;</code>
     */
    public Builder removeLocks(int index) {
      if (locksBuilder_ == null) {
        ensureLocksIsMutable();
        locks_.remove(index);
        onChanged();
      } else {
        locksBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The locks from the specified database.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.biglake.v1alpha1.Lock locks = 1;</code>
     */
    public com.google.cloud.bigquery.biglake.v1alpha1.Lock.Builder getLocksBuilder(int index) {
      return getLocksFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The locks from the specified database.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.biglake.v1alpha1.Lock locks = 1;</code>
     */
    public com.google.cloud.bigquery.biglake.v1alpha1.LockOrBuilder getLocksOrBuilder(int index) {
      if (locksBuilder_ == null) {
        return locks_.get(index);
      } else {
        return locksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The locks from the specified database.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.biglake.v1alpha1.Lock locks = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.bigquery.biglake.v1alpha1.LockOrBuilder>
        getLocksOrBuilderList() {
      if (locksBuilder_ != null) {
        return locksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(locks_);
      }
    }
    /**
     *
     *
     * <pre>
     * The locks from the specified database.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.biglake.v1alpha1.Lock locks = 1;</code>
     */
    public com.google.cloud.bigquery.biglake.v1alpha1.Lock.Builder addLocksBuilder() {
      return getLocksFieldBuilder()
          .addBuilder(com.google.cloud.bigquery.biglake.v1alpha1.Lock.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The locks from the specified database.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.biglake.v1alpha1.Lock locks = 1;</code>
     */
    public com.google.cloud.bigquery.biglake.v1alpha1.Lock.Builder addLocksBuilder(int index) {
      return getLocksFieldBuilder()
          .addBuilder(index, com.google.cloud.bigquery.biglake.v1alpha1.Lock.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The locks from the specified database.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.biglake.v1alpha1.Lock locks = 1;</code>
     */
    public java.util.List<com.google.cloud.bigquery.biglake.v1alpha1.Lock.Builder>
        getLocksBuilderList() {
      return getLocksFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.bigquery.biglake.v1alpha1.Lock,
            com.google.cloud.bigquery.biglake.v1alpha1.Lock.Builder,
            com.google.cloud.bigquery.biglake.v1alpha1.LockOrBuilder>
        getLocksFieldBuilder() {
      if (locksBuilder_ == null) {
        locksBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.bigquery.biglake.v1alpha1.Lock,
                com.google.cloud.bigquery.biglake.v1alpha1.Lock.Builder,
                com.google.cloud.bigquery.biglake.v1alpha1.LockOrBuilder>(
                locks_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        locks_ = null;
      }
      return locksBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse)
  private static final com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse();
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListLocksResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListLocksResponse>() {
        @java.lang.Override
        public ListLocksResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<ListLocksResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListLocksResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.biglake.v1alpha1.ListLocksResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
