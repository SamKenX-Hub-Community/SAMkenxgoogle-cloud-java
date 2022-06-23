/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.run.v2.samples;

// [START run_v2_generated_revisionsclient_listrevisions_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.run.v2.ListRevisionsRequest;
import com.google.cloud.run.v2.Revision;
import com.google.cloud.run.v2.RevisionsClient;
import com.google.cloud.run.v2.ServiceName;

public class AsyncListRevisions {

  public static void main(String[] args) throws Exception {
    asyncListRevisions();
  }

  public static void asyncListRevisions() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (RevisionsClient revisionsClient = RevisionsClient.create()) {
      ListRevisionsRequest request =
          ListRevisionsRequest.newBuilder()
              .setParent(ServiceName.of("[PROJECT]", "[LOCATION]", "[SERVICE]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setShowDeleted(true)
              .build();
      ApiFuture<Revision> future = revisionsClient.listRevisionsPagedCallable().futureCall(request);
      // Do something.
      for (Revision element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END run_v2_generated_revisionsclient_listrevisions_async]
