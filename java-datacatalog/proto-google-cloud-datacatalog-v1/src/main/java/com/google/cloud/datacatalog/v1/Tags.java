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
// source: google/cloud/datacatalog/v1/tags.proto

package com.google.cloud.datacatalog.v1;

public final class Tags {
  private Tags() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_Tag_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_Tag_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_Tag_FieldsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_Tag_FieldsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_TagField_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_TagField_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_TagField_EnumValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_TagField_EnumValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_TagTemplate_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_TagTemplate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_TagTemplate_FieldsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_TagTemplate_FieldsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_TagTemplateField_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_TagTemplateField_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_FieldType_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_FieldType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_FieldType_EnumType_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_FieldType_EnumType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_FieldType_EnumType_EnumValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_FieldType_EnumType_EnumValue_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/datacatalog/v1/tags.proto"
          + "\022\033google.cloud.datacatalog.v1\032\037google/ap"
          + "i/field_behavior.proto\032\031google/api/resou"
          + "rce.proto\032\037google/protobuf/timestamp.pro"
          + "to\"\206\003\n\003Tag\022\014\n\004name\030\001 \001(\t\022\025\n\010template\030\002 \001"
          + "(\tB\003\340A\002\022\"\n\025template_display_name\030\005 \001(\tB\003"
          + "\340A\003\022\020\n\006column\030\004 \001(\tH\000\022A\n\006fields\030\003 \003(\0132,."
          + "google.cloud.datacatalog.v1.Tag.FieldsEn"
          + "tryB\003\340A\002\032T\n\013FieldsEntry\022\013\n\003key\030\001 \001(\t\0224\n\005"
          + "value\030\002 \001(\0132%.google.cloud.datacatalog.v"
          + "1.TagField:\0028\001:\201\001\352A~\n\036datacatalog.google"
          + "apis.com/Tag\022\\projects/{project}/locatio"
          + "ns/{location}/entryGroups/{entry_group}/"
          + "entries/{entry}/tags/{tag}B\007\n\005scope\"\302\002\n\010"
          + "TagField\022\031\n\014display_name\030\001 \001(\tB\003\340A\003\022\026\n\014d"
          + "ouble_value\030\002 \001(\001H\000\022\026\n\014string_value\030\003 \001("
          + "\tH\000\022\024\n\nbool_value\030\004 \001(\010H\000\0225\n\017timestamp_v"
          + "alue\030\005 \001(\0132\032.google.protobuf.TimestampH\000"
          + "\022E\n\nenum_value\030\006 \001(\0132/.google.cloud.data"
          + "catalog.v1.TagField.EnumValueH\000\022\030\n\016richt"
          + "ext_value\030\010 \001(\tH\000\022\022\n\005order\030\007 \001(\005B\003\340A\003\032!\n"
          + "\tEnumValue\022\024\n\014display_name\030\001 \001(\tB\006\n\004kind"
          + "\"\352\002\n\013TagTemplate\022\014\n\004name\030\001 \001(\t\022\024\n\014displa"
          + "y_name\030\002 \001(\t\022\034\n\024is_publicly_readable\030\005 \001"
          + "(\010\022I\n\006fields\030\003 \003(\01324.google.cloud.dataca"
          + "talog.v1.TagTemplate.FieldsEntryB\003\340A\002\032\\\n"
          + "\013FieldsEntry\022\013\n\003key\030\001 \001(\t\022<\n\005value\030\002 \001(\013"
          + "2-.google.cloud.datacatalog.v1.TagTempla"
          + "teField:\0028\001:p\352Am\n&datacatalog.googleapis"
          + ".com/TagTemplate\022Cprojects/{project}/loc"
          + "ations/{location}/tagTemplates/{tag_temp"
          + "late}\"\267\002\n\020TagTemplateField\022\021\n\004name\030\006 \001(\t"
          + "B\003\340A\003\022\024\n\014display_name\030\001 \001(\t\0229\n\004type\030\002 \001("
          + "\0132&.google.cloud.datacatalog.v1.FieldTyp"
          + "eB\003\340A\002\022\023\n\013is_required\030\003 \001(\010\022\023\n\013descripti"
          + "on\030\004 \001(\t\022\r\n\005order\030\005 \001(\005:\205\001\352A\201\001\n+datacata"
          + "log.googleapis.com/TagTemplateField\022Rpro"
          + "jects/{project}/locations/{location}/tag"
          + "Templates/{tag_template}/fields/{field}\""
          + "\246\003\n\tFieldType\022N\n\016primitive_type\030\001 \001(\01624."
          + "google.cloud.datacatalog.v1.FieldType.Pr"
          + "imitiveTypeH\000\022D\n\tenum_type\030\002 \001(\0132/.googl"
          + "e.cloud.datacatalog.v1.FieldType.EnumTyp"
          + "eH\000\032\205\001\n\010EnumType\022Q\n\016allowed_values\030\001 \003(\013"
          + "29.google.cloud.datacatalog.v1.FieldType"
          + ".EnumType.EnumValue\032&\n\tEnumValue\022\031\n\014disp"
          + "lay_name\030\001 \001(\tB\003\340A\002\"n\n\rPrimitiveType\022\036\n\032"
          + "PRIMITIVE_TYPE_UNSPECIFIED\020\000\022\n\n\006DOUBLE\020\001"
          + "\022\n\n\006STRING\020\002\022\010\n\004BOOL\020\003\022\r\n\tTIMESTAMP\020\004\022\014\n"
          + "\010RICHTEXT\020\005B\013\n\ttype_declB\306\001\n\037com.google."
          + "cloud.datacatalog.v1P\001ZAcloud.google.com"
          + "/go/datacatalog/apiv1/datacatalogpb;data"
          + "catalogpb\370\001\001\252\002\033Google.Cloud.DataCatalog."
          + "V1\312\002\033Google\\Cloud\\DataCatalog\\V1\352\002\036Googl"
          + "e::Cloud::DataCatalog::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_datacatalog_v1_Tag_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datacatalog_v1_Tag_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_Tag_descriptor,
            new java.lang.String[] {
              "Name", "Template", "TemplateDisplayName", "Column", "Fields", "Scope",
            });
    internal_static_google_cloud_datacatalog_v1_Tag_FieldsEntry_descriptor =
        internal_static_google_cloud_datacatalog_v1_Tag_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_datacatalog_v1_Tag_FieldsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_Tag_FieldsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_datacatalog_v1_TagField_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_datacatalog_v1_TagField_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_TagField_descriptor,
            new java.lang.String[] {
              "DisplayName",
              "DoubleValue",
              "StringValue",
              "BoolValue",
              "TimestampValue",
              "EnumValue",
              "RichtextValue",
              "Order",
              "Kind",
            });
    internal_static_google_cloud_datacatalog_v1_TagField_EnumValue_descriptor =
        internal_static_google_cloud_datacatalog_v1_TagField_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_datacatalog_v1_TagField_EnumValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_TagField_EnumValue_descriptor,
            new java.lang.String[] {
              "DisplayName",
            });
    internal_static_google_cloud_datacatalog_v1_TagTemplate_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_datacatalog_v1_TagTemplate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_TagTemplate_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "IsPubliclyReadable", "Fields",
            });
    internal_static_google_cloud_datacatalog_v1_TagTemplate_FieldsEntry_descriptor =
        internal_static_google_cloud_datacatalog_v1_TagTemplate_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_datacatalog_v1_TagTemplate_FieldsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_TagTemplate_FieldsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_datacatalog_v1_TagTemplateField_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_datacatalog_v1_TagTemplateField_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_TagTemplateField_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "Type", "IsRequired", "Description", "Order",
            });
    internal_static_google_cloud_datacatalog_v1_FieldType_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_datacatalog_v1_FieldType_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_FieldType_descriptor,
            new java.lang.String[] {
              "PrimitiveType", "EnumType", "TypeDecl",
            });
    internal_static_google_cloud_datacatalog_v1_FieldType_EnumType_descriptor =
        internal_static_google_cloud_datacatalog_v1_FieldType_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_datacatalog_v1_FieldType_EnumType_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_FieldType_EnumType_descriptor,
            new java.lang.String[] {
              "AllowedValues",
            });
    internal_static_google_cloud_datacatalog_v1_FieldType_EnumType_EnumValue_descriptor =
        internal_static_google_cloud_datacatalog_v1_FieldType_EnumType_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_datacatalog_v1_FieldType_EnumType_EnumValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_FieldType_EnumType_EnumValue_descriptor,
            new java.lang.String[] {
              "DisplayName",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
