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
// source: google/monitoring/v3/query_service.proto

package com.google.monitoring.v3;

public final class QueryServiceProto {
  private QueryServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/monitoring/v3/query_service.pro"
          + "to\022\024google.monitoring.v3\032\034google/api/ann"
          + "otations.proto\032\026google/api/label.proto\032!"
          + "google/monitoring/v3/metric.proto\032)googl"
          + "e/monitoring/v3/metric_service.proto\032\027go"
          + "ogle/api/client.proto2\336\002\n\014QueryService\022\241"
          + "\001\n\017QueryTimeSeries\022,.google.monitoring.v"
          + "3.QueryTimeSeriesRequest\032-.google.monito"
          + "ring.v3.QueryTimeSeriesResponse\"1\202\323\344\223\002+\""
          + "&/v3/{name=projects/*}/timeSeries:query:"
          + "\001*\032\251\001\312A\031monitoring.googleapis.com\322A\211\001htt"
          + "ps://www.googleapis.com/auth/cloud-platf"
          + "orm,https://www.googleapis.com/auth/moni"
          + "toring,https://www.googleapis.com/auth/m"
          + "onitoring.readB\311\001\n\030com.google.monitoring"
          + ".v3B\021QueryServiceProtoP\001Z>google.golang."
          + "org/genproto/googleapis/monitoring/v3;mo"
          + "nitoring\252\002\032Google.Cloud.Monitoring.V3\312\002\032"
          + "Google\\Cloud\\Monitoring\\V3\352\002\035Google::Clo"
          + "ud::Monitoring::V3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.LabelProto.getDescriptor(),
              com.google.monitoring.v3.MetricProto.getDescriptor(),
              com.google.monitoring.v3.MetricServiceProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.LabelProto.getDescriptor();
    com.google.monitoring.v3.MetricProto.getDescriptor();
    com.google.monitoring.v3.MetricServiceProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
