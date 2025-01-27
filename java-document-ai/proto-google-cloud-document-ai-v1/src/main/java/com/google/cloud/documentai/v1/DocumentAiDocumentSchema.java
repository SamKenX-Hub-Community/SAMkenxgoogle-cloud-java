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
// source: google/cloud/documentai/v1/document_schema.proto

package com.google.cloud.documentai.v1;

public final class DocumentAiDocumentSchema {
  private DocumentAiDocumentSchema() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1_DocumentSchema_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1_DocumentSchema_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1_DocumentSchema_EntityType_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1_DocumentSchema_EntityType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1_DocumentSchema_EntityType_EnumValues_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1_DocumentSchema_EntityType_EnumValues_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1_DocumentSchema_EntityType_Property_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1_DocumentSchema_EntityType_Property_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1_DocumentSchema_Metadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1_DocumentSchema_Metadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/documentai/v1/document_sc"
          + "hema.proto\022\032google.cloud.documentai.v1\"\247"
          + "\007\n\016DocumentSchema\022\024\n\014display_name\030\001 \001(\t\022"
          + "\023\n\013description\030\002 \001(\t\022K\n\014entity_types\030\003 \003"
          + "(\01325.google.cloud.documentai.v1.Document"
          + "Schema.EntityType\022E\n\010metadata\030\004 \001(\01323.go"
          + "ogle.cloud.documentai.v1.DocumentSchema."
          + "Metadata\032\276\004\n\nEntityType\022W\n\013enum_values\030\016"
          + " \001(\0132@.google.cloud.documentai.v1.Docume"
          + "ntSchema.EntityType.EnumValuesH\000\022\024\n\014disp"
          + "lay_name\030\r \001(\t\022\014\n\004name\030\001 \001(\t\022\022\n\nbase_typ"
          + "es\030\002 \003(\t\022R\n\nproperties\030\006 \003(\0132>.google.cl"
          + "oud.documentai.v1.DocumentSchema.EntityT"
          + "ype.Property\032\034\n\nEnumValues\022\016\n\006values\030\001 \003"
          + "(\t\032\234\002\n\010Property\022\014\n\004name\030\001 \001(\t\022\022\n\nvalue_t"
          + "ype\030\002 \001(\t\022f\n\017occurrence_type\030\003 \001(\0162M.goo"
          + "gle.cloud.documentai.v1.DocumentSchema.E"
          + "ntityType.Property.OccurrenceType\"\205\001\n\016Oc"
          + "currenceType\022\037\n\033OCCURRENCE_TYPE_UNSPECIF"
          + "IED\020\000\022\021\n\rOPTIONAL_ONCE\020\001\022\025\n\021OPTIONAL_MUL"
          + "TIPLE\020\002\022\021\n\rREQUIRED_ONCE\020\003\022\025\n\021REQUIRED_M"
          + "ULTIPLE\020\004B\016\n\014value_source\032\224\001\n\010Metadata\022\031"
          + "\n\021document_splitter\030\001 \001(\010\022&\n\036document_al"
          + "low_multiple_labels\030\002 \001(\010\022%\n\035prefixed_na"
          + "ming_on_properties\030\006 \001(\010\022\036\n\026skip_naming_"
          + "validation\030\007 \001(\010B\326\001\n\036com.google.cloud.do"
          + "cumentai.v1B\030DocumentAiDocumentSchemaP\001Z"
          + ">cloud.google.com/go/documentai/apiv1/do"
          + "cumentaipb;documentaipb\252\002\032Google.Cloud.D"
          + "ocumentAI.V1\312\002\032Google\\Cloud\\DocumentAI\\V"
          + "1\352\002\035Google::Cloud::DocumentAI::V1b\006proto"
          + "3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_documentai_v1_DocumentSchema_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_documentai_v1_DocumentSchema_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1_DocumentSchema_descriptor,
            new java.lang.String[] {
              "DisplayName", "Description", "EntityTypes", "Metadata",
            });
    internal_static_google_cloud_documentai_v1_DocumentSchema_EntityType_descriptor =
        internal_static_google_cloud_documentai_v1_DocumentSchema_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_documentai_v1_DocumentSchema_EntityType_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1_DocumentSchema_EntityType_descriptor,
            new java.lang.String[] {
              "EnumValues", "DisplayName", "Name", "BaseTypes", "Properties", "ValueSource",
            });
    internal_static_google_cloud_documentai_v1_DocumentSchema_EntityType_EnumValues_descriptor =
        internal_static_google_cloud_documentai_v1_DocumentSchema_EntityType_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_documentai_v1_DocumentSchema_EntityType_EnumValues_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1_DocumentSchema_EntityType_EnumValues_descriptor,
            new java.lang.String[] {
              "Values",
            });
    internal_static_google_cloud_documentai_v1_DocumentSchema_EntityType_Property_descriptor =
        internal_static_google_cloud_documentai_v1_DocumentSchema_EntityType_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_documentai_v1_DocumentSchema_EntityType_Property_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1_DocumentSchema_EntityType_Property_descriptor,
            new java.lang.String[] {
              "Name", "ValueType", "OccurrenceType",
            });
    internal_static_google_cloud_documentai_v1_DocumentSchema_Metadata_descriptor =
        internal_static_google_cloud_documentai_v1_DocumentSchema_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_documentai_v1_DocumentSchema_Metadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1_DocumentSchema_Metadata_descriptor,
            new java.lang.String[] {
              "DocumentSplitter",
              "DocumentAllowMultipleLabels",
              "PrefixedNamingOnProperties",
              "SkipNamingValidation",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
