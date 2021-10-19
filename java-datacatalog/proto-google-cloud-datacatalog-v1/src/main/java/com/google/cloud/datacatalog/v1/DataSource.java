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
// source: google/cloud/datacatalog/v1/data_source.proto

package com.google.cloud.datacatalog.v1;

/**
 *
 *
 * <pre>
 * Physical location of an entry.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1.DataSource}
 */
public final class DataSource extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1.DataSource)
    DataSourceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DataSource.newBuilder() to construct.
  private DataSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DataSource() {
    service_ = 0;
    resource_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DataSource();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private DataSource(
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
          case 8:
            {
              int rawValue = input.readEnum();

              service_ = rawValue;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              resource_ = s;
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
    return com.google.cloud.datacatalog.v1.DataSourceProto
        .internal_static_google_cloud_datacatalog_v1_DataSource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1.DataSourceProto
        .internal_static_google_cloud_datacatalog_v1_DataSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1.DataSource.class,
            com.google.cloud.datacatalog.v1.DataSource.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Name of a service that stores the data.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.datacatalog.v1.DataSource.Service}
   */
  public enum Service implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Default unknown service.
     * </pre>
     *
     * <code>SERVICE_UNSPECIFIED = 0;</code>
     */
    SERVICE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Google Cloud Storage service.
     * </pre>
     *
     * <code>CLOUD_STORAGE = 1;</code>
     */
    CLOUD_STORAGE(1),
    /**
     *
     *
     * <pre>
     * BigQuery service.
     * </pre>
     *
     * <code>BIGQUERY = 2;</code>
     */
    BIGQUERY(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Default unknown service.
     * </pre>
     *
     * <code>SERVICE_UNSPECIFIED = 0;</code>
     */
    public static final int SERVICE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Google Cloud Storage service.
     * </pre>
     *
     * <code>CLOUD_STORAGE = 1;</code>
     */
    public static final int CLOUD_STORAGE_VALUE = 1;
    /**
     *
     *
     * <pre>
     * BigQuery service.
     * </pre>
     *
     * <code>BIGQUERY = 2;</code>
     */
    public static final int BIGQUERY_VALUE = 2;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Service valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Service forNumber(int value) {
      switch (value) {
        case 0:
          return SERVICE_UNSPECIFIED;
        case 1:
          return CLOUD_STORAGE;
        case 2:
          return BIGQUERY;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Service> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Service> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Service>() {
          public Service findValueByNumber(int number) {
            return Service.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1.DataSource.getDescriptor().getEnumTypes().get(0);
    }

    private static final Service[] VALUES = values();

    public static Service valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Service(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.datacatalog.v1.DataSource.Service)
  }

  public static final int SERVICE_FIELD_NUMBER = 1;
  private int service_;
  /**
   *
   *
   * <pre>
   * Service that physically stores the data.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.DataSource.Service service = 1;</code>
   *
   * @return The enum numeric value on the wire for service.
   */
  @java.lang.Override
  public int getServiceValue() {
    return service_;
  }
  /**
   *
   *
   * <pre>
   * Service that physically stores the data.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.DataSource.Service service = 1;</code>
   *
   * @return The service.
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.DataSource.Service getService() {
    @SuppressWarnings("deprecation")
    com.google.cloud.datacatalog.v1.DataSource.Service result =
        com.google.cloud.datacatalog.v1.DataSource.Service.valueOf(service_);
    return result == null
        ? com.google.cloud.datacatalog.v1.DataSource.Service.UNRECOGNIZED
        : result;
  }

  public static final int RESOURCE_FIELD_NUMBER = 2;
  private volatile java.lang.Object resource_;
  /**
   *
   *
   * <pre>
   * Full name of a resource as defined by the service. For example:
   * `//bigquery.googleapis.com/projects/{PROJECT_ID}/locations/{LOCATION}/datasets/{DATASET_ID}/tables/{TABLE_ID}`
   * </pre>
   *
   * <code>string resource = 2;</code>
   *
   * @return The resource.
   */
  @java.lang.Override
  public java.lang.String getResource() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resource_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Full name of a resource as defined by the service. For example:
   * `//bigquery.googleapis.com/projects/{PROJECT_ID}/locations/{LOCATION}/datasets/{DATASET_ID}/tables/{TABLE_ID}`
   * </pre>
   *
   * <code>string resource = 2;</code>
   *
   * @return The bytes for resource.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getResourceBytes() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      resource_ = b;
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
    if (service_
        != com.google.cloud.datacatalog.v1.DataSource.Service.SERVICE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, service_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resource_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, resource_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (service_
        != com.google.cloud.datacatalog.v1.DataSource.Service.SERVICE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, service_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resource_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, resource_);
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1.DataSource)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1.DataSource other =
        (com.google.cloud.datacatalog.v1.DataSource) obj;

    if (service_ != other.service_) return false;
    if (!getResource().equals(other.getResource())) return false;
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
    hash = (37 * hash) + SERVICE_FIELD_NUMBER;
    hash = (53 * hash) + service_;
    hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getResource().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1.DataSource parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.DataSource parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.DataSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.DataSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.DataSource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.DataSource parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.DataSource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.DataSource parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.DataSource parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.DataSource parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.DataSource parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.DataSource parseFrom(
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

  public static Builder newBuilder(com.google.cloud.datacatalog.v1.DataSource prototype) {
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
   * Physical location of an entry.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1.DataSource}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1.DataSource)
      com.google.cloud.datacatalog.v1.DataSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1.DataSourceProto
          .internal_static_google_cloud_datacatalog_v1_DataSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1.DataSourceProto
          .internal_static_google_cloud_datacatalog_v1_DataSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1.DataSource.class,
              com.google.cloud.datacatalog.v1.DataSource.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1.DataSource.newBuilder()
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
      service_ = 0;

      resource_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.v1.DataSourceProto
          .internal_static_google_cloud_datacatalog_v1_DataSource_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.DataSource getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1.DataSource.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.DataSource build() {
      com.google.cloud.datacatalog.v1.DataSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.DataSource buildPartial() {
      com.google.cloud.datacatalog.v1.DataSource result =
          new com.google.cloud.datacatalog.v1.DataSource(this);
      result.service_ = service_;
      result.resource_ = resource_;
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
      if (other instanceof com.google.cloud.datacatalog.v1.DataSource) {
        return mergeFrom((com.google.cloud.datacatalog.v1.DataSource) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1.DataSource other) {
      if (other == com.google.cloud.datacatalog.v1.DataSource.getDefaultInstance()) return this;
      if (other.service_ != 0) {
        setServiceValue(other.getServiceValue());
      }
      if (!other.getResource().isEmpty()) {
        resource_ = other.resource_;
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
      com.google.cloud.datacatalog.v1.DataSource parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.datacatalog.v1.DataSource) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int service_ = 0;
    /**
     *
     *
     * <pre>
     * Service that physically stores the data.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.DataSource.Service service = 1;</code>
     *
     * @return The enum numeric value on the wire for service.
     */
    @java.lang.Override
    public int getServiceValue() {
      return service_;
    }
    /**
     *
     *
     * <pre>
     * Service that physically stores the data.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.DataSource.Service service = 1;</code>
     *
     * @param value The enum numeric value on the wire for service to set.
     * @return This builder for chaining.
     */
    public Builder setServiceValue(int value) {

      service_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Service that physically stores the data.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.DataSource.Service service = 1;</code>
     *
     * @return The service.
     */
    @java.lang.Override
    public com.google.cloud.datacatalog.v1.DataSource.Service getService() {
      @SuppressWarnings("deprecation")
      com.google.cloud.datacatalog.v1.DataSource.Service result =
          com.google.cloud.datacatalog.v1.DataSource.Service.valueOf(service_);
      return result == null
          ? com.google.cloud.datacatalog.v1.DataSource.Service.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Service that physically stores the data.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.DataSource.Service service = 1;</code>
     *
     * @param value The service to set.
     * @return This builder for chaining.
     */
    public Builder setService(com.google.cloud.datacatalog.v1.DataSource.Service value) {
      if (value == null) {
        throw new NullPointerException();
      }

      service_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Service that physically stores the data.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.DataSource.Service service = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearService() {

      service_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object resource_ = "";
    /**
     *
     *
     * <pre>
     * Full name of a resource as defined by the service. For example:
     * `//bigquery.googleapis.com/projects/{PROJECT_ID}/locations/{LOCATION}/datasets/{DATASET_ID}/tables/{TABLE_ID}`
     * </pre>
     *
     * <code>string resource = 2;</code>
     *
     * @return The resource.
     */
    public java.lang.String getResource() {
      java.lang.Object ref = resource_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resource_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Full name of a resource as defined by the service. For example:
     * `//bigquery.googleapis.com/projects/{PROJECT_ID}/locations/{LOCATION}/datasets/{DATASET_ID}/tables/{TABLE_ID}`
     * </pre>
     *
     * <code>string resource = 2;</code>
     *
     * @return The bytes for resource.
     */
    public com.google.protobuf.ByteString getResourceBytes() {
      java.lang.Object ref = resource_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        resource_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Full name of a resource as defined by the service. For example:
     * `//bigquery.googleapis.com/projects/{PROJECT_ID}/locations/{LOCATION}/datasets/{DATASET_ID}/tables/{TABLE_ID}`
     * </pre>
     *
     * <code>string resource = 2;</code>
     *
     * @param value The resource to set.
     * @return This builder for chaining.
     */
    public Builder setResource(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      resource_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Full name of a resource as defined by the service. For example:
     * `//bigquery.googleapis.com/projects/{PROJECT_ID}/locations/{LOCATION}/datasets/{DATASET_ID}/tables/{TABLE_ID}`
     * </pre>
     *
     * <code>string resource = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResource() {

      resource_ = getDefaultInstance().getResource();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Full name of a resource as defined by the service. For example:
     * `//bigquery.googleapis.com/projects/{PROJECT_ID}/locations/{LOCATION}/datasets/{DATASET_ID}/tables/{TABLE_ID}`
     * </pre>
     *
     * <code>string resource = 2;</code>
     *
     * @param value The bytes for resource to set.
     * @return This builder for chaining.
     */
    public Builder setResourceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      resource_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1.DataSource)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1.DataSource)
  private static final com.google.cloud.datacatalog.v1.DataSource DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1.DataSource();
  }

  public static com.google.cloud.datacatalog.v1.DataSource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DataSource> PARSER =
      new com.google.protobuf.AbstractParser<DataSource>() {
        @java.lang.Override
        public DataSource parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new DataSource(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<DataSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DataSource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1.DataSource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
