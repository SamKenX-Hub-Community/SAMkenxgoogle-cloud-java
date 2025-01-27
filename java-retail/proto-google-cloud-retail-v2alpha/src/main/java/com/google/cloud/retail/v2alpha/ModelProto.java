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
// source: google/cloud/retail/v2alpha/model.proto

package com.google.cloud.retail.v2alpha;

public final class ModelProto {
  private ModelProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_Model_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_Model_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_Model_PageOptimizationConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_Model_PageOptimizationConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_Model_PageOptimizationConfig_Candidate_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_Model_PageOptimizationConfig_Candidate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_Model_PageOptimizationConfig_Panel_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_Model_PageOptimizationConfig_Panel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_Model_ServingConfigList_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_Model_ServingConfigList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\'google/cloud/retail/v2alpha/model.prot"
          + "o\022\033google.cloud.retail.v2alpha\032\037google/a"
          + "pi/field_behavior.proto\032\031google/api/reso"
          + "urce.proto\032(google/cloud/retail/v2alpha/"
          + "common.proto\032\037google/protobuf/timestamp."
          + "proto\"\374\020\n\005Model\022b\n\030page_optimization_con"
          + "fig\030\021 \001(\01329.google.cloud.retail.v2alpha."
          + "Model.PageOptimizationConfigB\003\340A\001H\000\022\021\n\004n"
          + "ame\030\001 \001(\tB\003\340A\002\022\031\n\014display_name\030\002 \001(\tB\003\340A"
          + "\002\022M\n\016training_state\030\003 \001(\01620.google.cloud"
          + ".retail.v2alpha.Model.TrainingStateB\003\340A\001"
          + "\022K\n\rserving_state\030\004 \001(\0162/.google.cloud.r"
          + "etail.v2alpha.Model.ServingStateB\003\340A\003\0224\n"
          + "\013create_time\030\005 \001(\0132\032.google.protobuf.Tim"
          + "estampB\003\340A\003\0224\n\013update_time\030\006 \001(\0132\032.googl"
          + "e.protobuf.TimestampB\003\340A\003\022\021\n\004type\030\007 \001(\tB"
          + "\003\340A\002\022#\n\026optimization_objective\030\010 \001(\tB\003\340A"
          + "\001\022Z\n\025periodic_tuning_state\030\013 \001(\01626.googl"
          + "e.cloud.retail.v2alpha.Model.PeriodicTun"
          + "ingStateB\003\340A\001\0227\n\016last_tune_time\030\014 \001(\0132\032."
          + "google.protobuf.TimestampB\003\340A\003\022\035\n\020tuning"
          + "_operation\030\017 \001(\tB\003\340A\003\022E\n\ndata_state\030\020 \001("
          + "\0162,.google.cloud.retail.v2alpha.Model.Da"
          + "taStateB\003\340A\003\022Z\n\020filtering_option\030\022 \001(\0162;"
          + ".google.cloud.retail.v2alpha.Recommendat"
          + "ionsFilteringOptionB\003\340A\001\022W\n\024serving_conf"
          + "ig_lists\030\023 \003(\01324.google.cloud.retail.v2a"
          + "lpha.Model.ServingConfigListB\003\340A\003\032\302\005\n\026Pa"
          + "geOptimizationConfig\022)\n\034page_optimizatio"
          + "n_event_type\030\001 \001(\tB\003\340A\002\022T\n\006panels\030\002 \003(\0132"
          + "?.google.cloud.retail.v2alpha.Model.Page"
          + "OptimizationConfig.PanelB\003\340A\002\022_\n\013restric"
          + "tion\030\003 \001(\0162E.google.cloud.retail.v2alpha"
          + ".Model.PageOptimizationConfig.Restrictio"
          + "nB\003\340A\001\0325\n\tCandidate\022\033\n\021serving_config_id"
          + "\030\001 \001(\tH\000B\013\n\tcandidate\032\345\001\n\005Panel\022\031\n\014displ"
          + "ay_name\030\001 \001(\tB\003\340A\001\022\\\n\ncandidates\030\002 \003(\0132C"
          + ".google.cloud.retail.v2alpha.Model.PageO"
          + "ptimizationConfig.CandidateB\003\340A\002\022c\n\021defa"
          + "ult_candidate\030\003 \001(\0132C.google.cloud.retai"
          + "l.v2alpha.Model.PageOptimizationConfig.C"
          + "andidateB\003\340A\002\"\246\001\n\013Restriction\022\033\n\027RESTRIC"
          + "TION_UNSPECIFIED\020\000\022\022\n\016NO_RESTRICTION\020\001\022%"
          + "\n!UNIQUE_SERVING_CONFIG_RESTRICTION\020\002\022\034\n"
          + "\030UNIQUE_MODEL_RESTRICTION\020\003\022!\n\035UNIQUE_MO"
          + "DEL_TYPE_RESTRICTION\020\004\0324\n\021ServingConfigL"
          + "ist\022\037\n\022serving_config_ids\030\001 \003(\tB\003\340A\001\"R\n\014"
          + "ServingState\022\035\n\031SERVING_STATE_UNSPECIFIE"
          + "D\020\000\022\014\n\010INACTIVE\020\001\022\n\n\006ACTIVE\020\002\022\t\n\005TUNED\020\003"
          + "\"I\n\rTrainingState\022\036\n\032TRAINING_STATE_UNSP"
          + "ECIFIED\020\000\022\n\n\006PAUSED\020\001\022\014\n\010TRAINING\020\002\"\220\001\n\023"
          + "PeriodicTuningState\022%\n!PERIODIC_TUNING_S"
          + "TATE_UNSPECIFIED\020\000\022\034\n\030PERIODIC_TUNING_DI"
          + "SABLED\020\001\022\027\n\023ALL_TUNING_DISABLED\020\003\022\033\n\027PER"
          + "IODIC_TUNING_ENABLED\020\002\"D\n\tDataState\022\032\n\026D"
          + "ATA_STATE_UNSPECIFIED\020\000\022\013\n\007DATA_OK\020\001\022\016\n\n"
          + "DATA_ERROR\020\002:k\352Ah\n\033retail.googleapis.com"
          + "/Model\022Iprojects/{project}/locations/{lo"
          + "cation}/catalogs/{catalog}/models/{model"
          + "}B\021\n\017training_configB\316\001\n\037com.google.clou"
          + "d.retail.v2alphaB\nModelProtoP\001Z7cloud.go"
          + "ogle.com/go/retail/apiv2alpha/retailpb;r"
          + "etailpb\242\002\006RETAIL\252\002\033Google.Cloud.Retail.V"
          + "2Alpha\312\002\033Google\\Cloud\\Retail\\V2alpha\352\002\036G"
          + "oogle::Cloud::Retail::V2alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.retail.v2alpha.CommonProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2alpha_Model_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2alpha_Model_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_Model_descriptor,
            new java.lang.String[] {
              "PageOptimizationConfig",
              "Name",
              "DisplayName",
              "TrainingState",
              "ServingState",
              "CreateTime",
              "UpdateTime",
              "Type",
              "OptimizationObjective",
              "PeriodicTuningState",
              "LastTuneTime",
              "TuningOperation",
              "DataState",
              "FilteringOption",
              "ServingConfigLists",
              "TrainingConfig",
            });
    internal_static_google_cloud_retail_v2alpha_Model_PageOptimizationConfig_descriptor =
        internal_static_google_cloud_retail_v2alpha_Model_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_retail_v2alpha_Model_PageOptimizationConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_Model_PageOptimizationConfig_descriptor,
            new java.lang.String[] {
              "PageOptimizationEventType", "Panels", "Restriction",
            });
    internal_static_google_cloud_retail_v2alpha_Model_PageOptimizationConfig_Candidate_descriptor =
        internal_static_google_cloud_retail_v2alpha_Model_PageOptimizationConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_retail_v2alpha_Model_PageOptimizationConfig_Candidate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_Model_PageOptimizationConfig_Candidate_descriptor,
            new java.lang.String[] {
              "ServingConfigId", "Candidate",
            });
    internal_static_google_cloud_retail_v2alpha_Model_PageOptimizationConfig_Panel_descriptor =
        internal_static_google_cloud_retail_v2alpha_Model_PageOptimizationConfig_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_retail_v2alpha_Model_PageOptimizationConfig_Panel_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_Model_PageOptimizationConfig_Panel_descriptor,
            new java.lang.String[] {
              "DisplayName", "Candidates", "DefaultCandidate",
            });
    internal_static_google_cloud_retail_v2alpha_Model_ServingConfigList_descriptor =
        internal_static_google_cloud_retail_v2alpha_Model_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_retail_v2alpha_Model_ServingConfigList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_Model_ServingConfigList_descriptor,
            new java.lang.String[] {
              "ServingConfigIds",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.retail.v2alpha.CommonProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
