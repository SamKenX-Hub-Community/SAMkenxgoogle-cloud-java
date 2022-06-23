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

package com.google.cloud.videointelligence.v1p3beta1.samples;

// [START
// videointelligence_v1p3beta1_generated_streamingvideointelligenceserviceclient_streamingannotatevideo_async]
import com.google.api.gax.rpc.BidiStream;
import com.google.cloud.videointelligence.v1p3beta1.StreamingAnnotateVideoRequest;
import com.google.cloud.videointelligence.v1p3beta1.StreamingAnnotateVideoResponse;
import com.google.cloud.videointelligence.v1p3beta1.StreamingVideoIntelligenceServiceClient;

public class AsyncStreamingAnnotateVideo {

  public static void main(String[] args) throws Exception {
    asyncStreamingAnnotateVideo();
  }

  public static void asyncStreamingAnnotateVideo() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (StreamingVideoIntelligenceServiceClient streamingVideoIntelligenceServiceClient =
        StreamingVideoIntelligenceServiceClient.create()) {
      BidiStream<StreamingAnnotateVideoRequest, StreamingAnnotateVideoResponse> bidiStream =
          streamingVideoIntelligenceServiceClient.streamingAnnotateVideoCallable().call();
      StreamingAnnotateVideoRequest request = StreamingAnnotateVideoRequest.newBuilder().build();
      bidiStream.send(request);
      for (StreamingAnnotateVideoResponse response : bidiStream) {
        // Do something when a response is received.
      }
    }
  }
}
// [END
// videointelligence_v1p3beta1_generated_streamingvideointelligenceserviceclient_streamingannotatevideo_async]
