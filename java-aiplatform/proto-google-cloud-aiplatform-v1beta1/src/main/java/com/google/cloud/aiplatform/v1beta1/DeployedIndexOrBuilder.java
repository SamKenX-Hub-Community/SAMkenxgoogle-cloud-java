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
// source: google/cloud/aiplatform/v1beta1/index_endpoint.proto

package com.google.cloud.aiplatform.v1beta1;

public interface DeployedIndexOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.DeployedIndex)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The user specified ID of the DeployedIndex.
   * The ID can be up to 128 characters long and must start with a letter and
   * only contain letters, numbers, and underscores.
   * The ID must be unique within the project it is created in.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * Required. The user specified ID of the DeployedIndex.
   * The ID can be up to 128 characters long and must start with a letter and
   * only contain letters, numbers, and underscores.
   * The ID must be unique within the project it is created in.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The name of the Index this is the deployment of.
   * We may refer to this Index as the DeployedIndex's "original" Index.
   * </pre>
   *
   * <code>
   * string index = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The index.
   */
  java.lang.String getIndex();
  /**
   *
   *
   * <pre>
   * Required. The name of the Index this is the deployment of.
   * We may refer to this Index as the DeployedIndex's "original" Index.
   * </pre>
   *
   * <code>
   * string index = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for index.
   */
  com.google.protobuf.ByteString getIndexBytes();

  /**
   *
   *
   * <pre>
   * The display name of the DeployedIndex. If not provided upon creation,
   * the Index's display_name is used.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The display name of the DeployedIndex. If not provided upon creation,
   * the Index's display_name is used.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when the DeployedIndex was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when the DeployedIndex was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when the DeployedIndex was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Provides paths for users to send requests directly to the deployed index
   * services running on Cloud via private services access. This field is
   * populated if [network][google.cloud.aiplatform.v1beta1.IndexEndpoint.network] is configured.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints private_endpoints = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the privateEndpoints field is set.
   */
  boolean hasPrivateEndpoints();
  /**
   *
   *
   * <pre>
   * Output only. Provides paths for users to send requests directly to the deployed index
   * services running on Cloud via private services access. This field is
   * populated if [network][google.cloud.aiplatform.v1beta1.IndexEndpoint.network] is configured.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints private_endpoints = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The privateEndpoints.
   */
  com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints getPrivateEndpoints();
  /**
   *
   *
   * <pre>
   * Output only. Provides paths for users to send requests directly to the deployed index
   * services running on Cloud via private services access. This field is
   * populated if [network][google.cloud.aiplatform.v1beta1.IndexEndpoint.network] is configured.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.IndexPrivateEndpoints private_endpoints = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.IndexPrivateEndpointsOrBuilder getPrivateEndpointsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The DeployedIndex may depend on various data on its original Index.
   * Additionally when certain changes to the original Index are being done
   * (e.g. when what the Index contains is being changed) the DeployedIndex may
   * be asynchronously updated in the background to reflect this changes.
   * If this timestamp's value is at least the [Index.update_time][google.cloud.aiplatform.v1beta1.Index.update_time] of the
   * original Index, it means that this DeployedIndex and the original Index are
   * in sync. If this timestamp is older, then to see which updates this
   * DeployedIndex already contains (and which not), one must
   * [list][Operations.ListOperations] [Operations][Operation]
   * [working][Operation.name] on the original Index. Only
   * the successfully completed Operations with
   * [Operations.metadata.generic_metadata.update_time]
   * [google.cloud.aiplatform.v1beta1.GenericOperationMetadata.update_time]
   * equal or before this sync time are contained in this DeployedIndex.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp index_sync_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the indexSyncTime field is set.
   */
  boolean hasIndexSyncTime();
  /**
   *
   *
   * <pre>
   * Output only. The DeployedIndex may depend on various data on its original Index.
   * Additionally when certain changes to the original Index are being done
   * (e.g. when what the Index contains is being changed) the DeployedIndex may
   * be asynchronously updated in the background to reflect this changes.
   * If this timestamp's value is at least the [Index.update_time][google.cloud.aiplatform.v1beta1.Index.update_time] of the
   * original Index, it means that this DeployedIndex and the original Index are
   * in sync. If this timestamp is older, then to see which updates this
   * DeployedIndex already contains (and which not), one must
   * [list][Operations.ListOperations] [Operations][Operation]
   * [working][Operation.name] on the original Index. Only
   * the successfully completed Operations with
   * [Operations.metadata.generic_metadata.update_time]
   * [google.cloud.aiplatform.v1beta1.GenericOperationMetadata.update_time]
   * equal or before this sync time are contained in this DeployedIndex.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp index_sync_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The indexSyncTime.
   */
  com.google.protobuf.Timestamp getIndexSyncTime();
  /**
   *
   *
   * <pre>
   * Output only. The DeployedIndex may depend on various data on its original Index.
   * Additionally when certain changes to the original Index are being done
   * (e.g. when what the Index contains is being changed) the DeployedIndex may
   * be asynchronously updated in the background to reflect this changes.
   * If this timestamp's value is at least the [Index.update_time][google.cloud.aiplatform.v1beta1.Index.update_time] of the
   * original Index, it means that this DeployedIndex and the original Index are
   * in sync. If this timestamp is older, then to see which updates this
   * DeployedIndex already contains (and which not), one must
   * [list][Operations.ListOperations] [Operations][Operation]
   * [working][Operation.name] on the original Index. Only
   * the successfully completed Operations with
   * [Operations.metadata.generic_metadata.update_time]
   * [google.cloud.aiplatform.v1beta1.GenericOperationMetadata.update_time]
   * equal or before this sync time are contained in this DeployedIndex.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp index_sync_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getIndexSyncTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A description of resources that the DeployedIndex uses, which to large
   * degree are decided by Vertex AI, and optionally allows only a modest
   * additional configuration.
   * If min_replica_count is not set, the default value is 1. If
   * max_replica_count is not set, the default value is min_replica_count. The
   * max allowed replica count is 1000.
   * The user is billed for the resources (at least their minimal amount)
   * even if the DeployedIndex receives no traffic.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.AutomaticResources automatic_resources = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the automaticResources field is set.
   */
  boolean hasAutomaticResources();
  /**
   *
   *
   * <pre>
   * Optional. A description of resources that the DeployedIndex uses, which to large
   * degree are decided by Vertex AI, and optionally allows only a modest
   * additional configuration.
   * If min_replica_count is not set, the default value is 1. If
   * max_replica_count is not set, the default value is min_replica_count. The
   * max allowed replica count is 1000.
   * The user is billed for the resources (at least their minimal amount)
   * even if the DeployedIndex receives no traffic.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.AutomaticResources automatic_resources = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The automaticResources.
   */
  com.google.cloud.aiplatform.v1beta1.AutomaticResources getAutomaticResources();
  /**
   *
   *
   * <pre>
   * Optional. A description of resources that the DeployedIndex uses, which to large
   * degree are decided by Vertex AI, and optionally allows only a modest
   * additional configuration.
   * If min_replica_count is not set, the default value is 1. If
   * max_replica_count is not set, the default value is min_replica_count. The
   * max allowed replica count is 1000.
   * The user is billed for the resources (at least their minimal amount)
   * even if the DeployedIndex receives no traffic.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.AutomaticResources automatic_resources = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.AutomaticResourcesOrBuilder getAutomaticResourcesOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. If true, private endpoint's access logs are sent to StackDriver Logging.
   * These logs are like standard server access logs, containing
   * information like timestamp and latency for each MatchRequest.
   * Note that Stackdriver logs may incur a cost, especially if the deployed
   * index receives a high queries per second rate (QPS).
   * Estimate your costs before enabling this option.
   * </pre>
   *
   * <code>bool enable_access_logging = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The enableAccessLogging.
   */
  boolean getEnableAccessLogging();

  /**
   *
   *
   * <pre>
   * Optional. If set, the authentication is enabled for the private endpoint.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.DeployedIndexAuthConfig deployed_index_auth_config = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the deployedIndexAuthConfig field is set.
   */
  boolean hasDeployedIndexAuthConfig();
  /**
   *
   *
   * <pre>
   * Optional. If set, the authentication is enabled for the private endpoint.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.DeployedIndexAuthConfig deployed_index_auth_config = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The deployedIndexAuthConfig.
   */
  com.google.cloud.aiplatform.v1beta1.DeployedIndexAuthConfig getDeployedIndexAuthConfig();
  /**
   *
   *
   * <pre>
   * Optional. If set, the authentication is enabled for the private endpoint.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.DeployedIndexAuthConfig deployed_index_auth_config = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.DeployedIndexAuthConfigOrBuilder
      getDeployedIndexAuthConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A list of reserved ip ranges under the VPC network that can be
   * used for this DeployedIndex.
   * If set, we will deploy the index within the provided ip ranges. Otherwise,
   * the index might be deployed to any ip ranges under the provided VPC
   * network.
   * The value sohuld be the name of the address
   * (https://cloud.google.com/compute/docs/reference/rest/v1/addresses)
   * Example: 'vertex-ai-ip-range'.
   * </pre>
   *
   * <code>repeated string reserved_ip_ranges = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the reservedIpRanges.
   */
  java.util.List<java.lang.String> getReservedIpRangesList();
  /**
   *
   *
   * <pre>
   * Optional. A list of reserved ip ranges under the VPC network that can be
   * used for this DeployedIndex.
   * If set, we will deploy the index within the provided ip ranges. Otherwise,
   * the index might be deployed to any ip ranges under the provided VPC
   * network.
   * The value sohuld be the name of the address
   * (https://cloud.google.com/compute/docs/reference/rest/v1/addresses)
   * Example: 'vertex-ai-ip-range'.
   * </pre>
   *
   * <code>repeated string reserved_ip_ranges = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of reservedIpRanges.
   */
  int getReservedIpRangesCount();
  /**
   *
   *
   * <pre>
   * Optional. A list of reserved ip ranges under the VPC network that can be
   * used for this DeployedIndex.
   * If set, we will deploy the index within the provided ip ranges. Otherwise,
   * the index might be deployed to any ip ranges under the provided VPC
   * network.
   * The value sohuld be the name of the address
   * (https://cloud.google.com/compute/docs/reference/rest/v1/addresses)
   * Example: 'vertex-ai-ip-range'.
   * </pre>
   *
   * <code>repeated string reserved_ip_ranges = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The reservedIpRanges at the given index.
   */
  java.lang.String getReservedIpRanges(int index);
  /**
   *
   *
   * <pre>
   * Optional. A list of reserved ip ranges under the VPC network that can be
   * used for this DeployedIndex.
   * If set, we will deploy the index within the provided ip ranges. Otherwise,
   * the index might be deployed to any ip ranges under the provided VPC
   * network.
   * The value sohuld be the name of the address
   * (https://cloud.google.com/compute/docs/reference/rest/v1/addresses)
   * Example: 'vertex-ai-ip-range'.
   * </pre>
   *
   * <code>repeated string reserved_ip_ranges = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the reservedIpRanges at the given index.
   */
  com.google.protobuf.ByteString getReservedIpRangesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. The deployment group can be no longer than 64 characters (eg:
   * 'test', 'prod'). If not set, we will use the 'default' deployment group.
   * Creating `deployment_groups` with `reserved_ip_ranges` is a recommended
   * practice when the peered network has multiple peering ranges. This creates
   * your deployments from predictable IP spaces for easier traffic
   * administration. Also, one deployment_group (except 'default') can only be
   * used with the same reserved_ip_ranges which means if the deployment_group
   * has been used with reserved_ip_ranges: [a, b, c], using it with [a, b] or
   * [d, e] is disallowed.
   * Note: we only support up to 5 deployment groups(not including 'default').
   * </pre>
   *
   * <code>string deployment_group = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The deploymentGroup.
   */
  java.lang.String getDeploymentGroup();
  /**
   *
   *
   * <pre>
   * Optional. The deployment group can be no longer than 64 characters (eg:
   * 'test', 'prod'). If not set, we will use the 'default' deployment group.
   * Creating `deployment_groups` with `reserved_ip_ranges` is a recommended
   * practice when the peered network has multiple peering ranges. This creates
   * your deployments from predictable IP spaces for easier traffic
   * administration. Also, one deployment_group (except 'default') can only be
   * used with the same reserved_ip_ranges which means if the deployment_group
   * has been used with reserved_ip_ranges: [a, b, c], using it with [a, b] or
   * [d, e] is disallowed.
   * Note: we only support up to 5 deployment groups(not including 'default').
   * </pre>
   *
   * <code>string deployment_group = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for deploymentGroup.
   */
  com.google.protobuf.ByteString getDeploymentGroupBytes();
}
