/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/dialogflow/v2/audio_config.proto

package com.google.cloud.dialogflow.v2;

/**
 *
 *
 * <pre>
 * Instructs the speech synthesizer on how to generate the output audio content.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.OutputAudioConfig}
 */
public final class OutputAudioConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.OutputAudioConfig)
    OutputAudioConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use OutputAudioConfig.newBuilder() to construct.
  private OutputAudioConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private OutputAudioConfig() {
    audioEncoding_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new OutputAudioConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private OutputAudioConfig(
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

              audioEncoding_ = rawValue;
              break;
            }
          case 16:
            {
              sampleRateHertz_ = input.readInt32();
              break;
            }
          case 26:
            {
              com.google.cloud.dialogflow.v2.SynthesizeSpeechConfig.Builder subBuilder = null;
              if (synthesizeSpeechConfig_ != null) {
                subBuilder = synthesizeSpeechConfig_.toBuilder();
              }
              synthesizeSpeechConfig_ =
                  input.readMessage(
                      com.google.cloud.dialogflow.v2.SynthesizeSpeechConfig.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(synthesizeSpeechConfig_);
                synthesizeSpeechConfig_ = subBuilder.buildPartial();
              }

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
    return com.google.cloud.dialogflow.v2.AudioConfigProto
        .internal_static_google_cloud_dialogflow_v2_OutputAudioConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.AudioConfigProto
        .internal_static_google_cloud_dialogflow_v2_OutputAudioConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.OutputAudioConfig.class,
            com.google.cloud.dialogflow.v2.OutputAudioConfig.Builder.class);
  }

  public static final int AUDIO_ENCODING_FIELD_NUMBER = 1;
  private int audioEncoding_;
  /**
   *
   *
   * <pre>
   * Required. Audio encoding of the synthesized audio content.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.OutputAudioEncoding audio_encoding = 1;</code>
   *
   * @return The enum numeric value on the wire for audioEncoding.
   */
  public int getAudioEncodingValue() {
    return audioEncoding_;
  }
  /**
   *
   *
   * <pre>
   * Required. Audio encoding of the synthesized audio content.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.OutputAudioEncoding audio_encoding = 1;</code>
   *
   * @return The audioEncoding.
   */
  public com.google.cloud.dialogflow.v2.OutputAudioEncoding getAudioEncoding() {
    @SuppressWarnings("deprecation")
    com.google.cloud.dialogflow.v2.OutputAudioEncoding result =
        com.google.cloud.dialogflow.v2.OutputAudioEncoding.valueOf(audioEncoding_);
    return result == null
        ? com.google.cloud.dialogflow.v2.OutputAudioEncoding.UNRECOGNIZED
        : result;
  }

  public static final int SAMPLE_RATE_HERTZ_FIELD_NUMBER = 2;
  private int sampleRateHertz_;
  /**
   *
   *
   * <pre>
   * Optional. The synthesis sample rate (in hertz) for this audio. If not
   * provided, then the synthesizer will use the default sample rate based on
   * the audio encoding. If this is different from the voice's natural sample
   * rate, then the synthesizer will honor this request by converting to the
   * desired sample rate (which might result in worse audio quality).
   * </pre>
   *
   * <code>int32 sample_rate_hertz = 2;</code>
   *
   * @return The sampleRateHertz.
   */
  public int getSampleRateHertz() {
    return sampleRateHertz_;
  }

  public static final int SYNTHESIZE_SPEECH_CONFIG_FIELD_NUMBER = 3;
  private com.google.cloud.dialogflow.v2.SynthesizeSpeechConfig synthesizeSpeechConfig_;
  /**
   *
   *
   * <pre>
   * Optional. Configuration of how speech should be synthesized.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.SynthesizeSpeechConfig synthesize_speech_config = 3;</code>
   *
   * @return Whether the synthesizeSpeechConfig field is set.
   */
  public boolean hasSynthesizeSpeechConfig() {
    return synthesizeSpeechConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * Optional. Configuration of how speech should be synthesized.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.SynthesizeSpeechConfig synthesize_speech_config = 3;</code>
   *
   * @return The synthesizeSpeechConfig.
   */
  public com.google.cloud.dialogflow.v2.SynthesizeSpeechConfig getSynthesizeSpeechConfig() {
    return synthesizeSpeechConfig_ == null
        ? com.google.cloud.dialogflow.v2.SynthesizeSpeechConfig.getDefaultInstance()
        : synthesizeSpeechConfig_;
  }
  /**
   *
   *
   * <pre>
   * Optional. Configuration of how speech should be synthesized.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.SynthesizeSpeechConfig synthesize_speech_config = 3;</code>
   */
  public com.google.cloud.dialogflow.v2.SynthesizeSpeechConfigOrBuilder
      getSynthesizeSpeechConfigOrBuilder() {
    return getSynthesizeSpeechConfig();
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
    if (audioEncoding_
        != com.google.cloud.dialogflow.v2.OutputAudioEncoding.OUTPUT_AUDIO_ENCODING_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, audioEncoding_);
    }
    if (sampleRateHertz_ != 0) {
      output.writeInt32(2, sampleRateHertz_);
    }
    if (synthesizeSpeechConfig_ != null) {
      output.writeMessage(3, getSynthesizeSpeechConfig());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (audioEncoding_
        != com.google.cloud.dialogflow.v2.OutputAudioEncoding.OUTPUT_AUDIO_ENCODING_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, audioEncoding_);
    }
    if (sampleRateHertz_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, sampleRateHertz_);
    }
    if (synthesizeSpeechConfig_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(3, getSynthesizeSpeechConfig());
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.OutputAudioConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.OutputAudioConfig other =
        (com.google.cloud.dialogflow.v2.OutputAudioConfig) obj;

    if (audioEncoding_ != other.audioEncoding_) return false;
    if (getSampleRateHertz() != other.getSampleRateHertz()) return false;
    if (hasSynthesizeSpeechConfig() != other.hasSynthesizeSpeechConfig()) return false;
    if (hasSynthesizeSpeechConfig()) {
      if (!getSynthesizeSpeechConfig().equals(other.getSynthesizeSpeechConfig())) return false;
    }
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
    hash = (37 * hash) + AUDIO_ENCODING_FIELD_NUMBER;
    hash = (53 * hash) + audioEncoding_;
    hash = (37 * hash) + SAMPLE_RATE_HERTZ_FIELD_NUMBER;
    hash = (53 * hash) + getSampleRateHertz();
    if (hasSynthesizeSpeechConfig()) {
      hash = (37 * hash) + SYNTHESIZE_SPEECH_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getSynthesizeSpeechConfig().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.OutputAudioConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.OutputAudioConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.OutputAudioConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.OutputAudioConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.OutputAudioConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.OutputAudioConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.OutputAudioConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.OutputAudioConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.OutputAudioConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.OutputAudioConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.OutputAudioConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.OutputAudioConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dialogflow.v2.OutputAudioConfig prototype) {
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
   * Instructs the speech synthesizer on how to generate the output audio content.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.OutputAudioConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.OutputAudioConfig)
      com.google.cloud.dialogflow.v2.OutputAudioConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.AudioConfigProto
          .internal_static_google_cloud_dialogflow_v2_OutputAudioConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.AudioConfigProto
          .internal_static_google_cloud_dialogflow_v2_OutputAudioConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.OutputAudioConfig.class,
              com.google.cloud.dialogflow.v2.OutputAudioConfig.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.OutputAudioConfig.newBuilder()
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
      audioEncoding_ = 0;

      sampleRateHertz_ = 0;

      if (synthesizeSpeechConfigBuilder_ == null) {
        synthesizeSpeechConfig_ = null;
      } else {
        synthesizeSpeechConfig_ = null;
        synthesizeSpeechConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.AudioConfigProto
          .internal_static_google_cloud_dialogflow_v2_OutputAudioConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.OutputAudioConfig getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.OutputAudioConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.OutputAudioConfig build() {
      com.google.cloud.dialogflow.v2.OutputAudioConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.OutputAudioConfig buildPartial() {
      com.google.cloud.dialogflow.v2.OutputAudioConfig result =
          new com.google.cloud.dialogflow.v2.OutputAudioConfig(this);
      result.audioEncoding_ = audioEncoding_;
      result.sampleRateHertz_ = sampleRateHertz_;
      if (synthesizeSpeechConfigBuilder_ == null) {
        result.synthesizeSpeechConfig_ = synthesizeSpeechConfig_;
      } else {
        result.synthesizeSpeechConfig_ = synthesizeSpeechConfigBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.dialogflow.v2.OutputAudioConfig) {
        return mergeFrom((com.google.cloud.dialogflow.v2.OutputAudioConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.OutputAudioConfig other) {
      if (other == com.google.cloud.dialogflow.v2.OutputAudioConfig.getDefaultInstance())
        return this;
      if (other.audioEncoding_ != 0) {
        setAudioEncodingValue(other.getAudioEncodingValue());
      }
      if (other.getSampleRateHertz() != 0) {
        setSampleRateHertz(other.getSampleRateHertz());
      }
      if (other.hasSynthesizeSpeechConfig()) {
        mergeSynthesizeSpeechConfig(other.getSynthesizeSpeechConfig());
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
      com.google.cloud.dialogflow.v2.OutputAudioConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dialogflow.v2.OutputAudioConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int audioEncoding_ = 0;
    /**
     *
     *
     * <pre>
     * Required. Audio encoding of the synthesized audio content.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.OutputAudioEncoding audio_encoding = 1;</code>
     *
     * @return The enum numeric value on the wire for audioEncoding.
     */
    public int getAudioEncodingValue() {
      return audioEncoding_;
    }
    /**
     *
     *
     * <pre>
     * Required. Audio encoding of the synthesized audio content.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.OutputAudioEncoding audio_encoding = 1;</code>
     *
     * @param value The enum numeric value on the wire for audioEncoding to set.
     * @return This builder for chaining.
     */
    public Builder setAudioEncodingValue(int value) {
      audioEncoding_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Audio encoding of the synthesized audio content.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.OutputAudioEncoding audio_encoding = 1;</code>
     *
     * @return The audioEncoding.
     */
    public com.google.cloud.dialogflow.v2.OutputAudioEncoding getAudioEncoding() {
      @SuppressWarnings("deprecation")
      com.google.cloud.dialogflow.v2.OutputAudioEncoding result =
          com.google.cloud.dialogflow.v2.OutputAudioEncoding.valueOf(audioEncoding_);
      return result == null
          ? com.google.cloud.dialogflow.v2.OutputAudioEncoding.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Required. Audio encoding of the synthesized audio content.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.OutputAudioEncoding audio_encoding = 1;</code>
     *
     * @param value The audioEncoding to set.
     * @return This builder for chaining.
     */
    public Builder setAudioEncoding(com.google.cloud.dialogflow.v2.OutputAudioEncoding value) {
      if (value == null) {
        throw new NullPointerException();
      }

      audioEncoding_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Audio encoding of the synthesized audio content.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.OutputAudioEncoding audio_encoding = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAudioEncoding() {

      audioEncoding_ = 0;
      onChanged();
      return this;
    }

    private int sampleRateHertz_;
    /**
     *
     *
     * <pre>
     * Optional. The synthesis sample rate (in hertz) for this audio. If not
     * provided, then the synthesizer will use the default sample rate based on
     * the audio encoding. If this is different from the voice's natural sample
     * rate, then the synthesizer will honor this request by converting to the
     * desired sample rate (which might result in worse audio quality).
     * </pre>
     *
     * <code>int32 sample_rate_hertz = 2;</code>
     *
     * @return The sampleRateHertz.
     */
    public int getSampleRateHertz() {
      return sampleRateHertz_;
    }
    /**
     *
     *
     * <pre>
     * Optional. The synthesis sample rate (in hertz) for this audio. If not
     * provided, then the synthesizer will use the default sample rate based on
     * the audio encoding. If this is different from the voice's natural sample
     * rate, then the synthesizer will honor this request by converting to the
     * desired sample rate (which might result in worse audio quality).
     * </pre>
     *
     * <code>int32 sample_rate_hertz = 2;</code>
     *
     * @param value The sampleRateHertz to set.
     * @return This builder for chaining.
     */
    public Builder setSampleRateHertz(int value) {

      sampleRateHertz_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The synthesis sample rate (in hertz) for this audio. If not
     * provided, then the synthesizer will use the default sample rate based on
     * the audio encoding. If this is different from the voice's natural sample
     * rate, then the synthesizer will honor this request by converting to the
     * desired sample rate (which might result in worse audio quality).
     * </pre>
     *
     * <code>int32 sample_rate_hertz = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSampleRateHertz() {

      sampleRateHertz_ = 0;
      onChanged();
      return this;
    }

    private com.google.cloud.dialogflow.v2.SynthesizeSpeechConfig synthesizeSpeechConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2.SynthesizeSpeechConfig,
            com.google.cloud.dialogflow.v2.SynthesizeSpeechConfig.Builder,
            com.google.cloud.dialogflow.v2.SynthesizeSpeechConfigOrBuilder>
        synthesizeSpeechConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Optional. Configuration of how speech should be synthesized.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.SynthesizeSpeechConfig synthesize_speech_config = 3;</code>
     *
     * @return Whether the synthesizeSpeechConfig field is set.
     */
    public boolean hasSynthesizeSpeechConfig() {
      return synthesizeSpeechConfigBuilder_ != null || synthesizeSpeechConfig_ != null;
    }
    /**
     *
     *
     * <pre>
     * Optional. Configuration of how speech should be synthesized.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.SynthesizeSpeechConfig synthesize_speech_config = 3;</code>
     *
     * @return The synthesizeSpeechConfig.
     */
    public com.google.cloud.dialogflow.v2.SynthesizeSpeechConfig getSynthesizeSpeechConfig() {
      if (synthesizeSpeechConfigBuilder_ == null) {
        return synthesizeSpeechConfig_ == null
            ? com.google.cloud.dialogflow.v2.SynthesizeSpeechConfig.getDefaultInstance()
            : synthesizeSpeechConfig_;
      } else {
        return synthesizeSpeechConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Configuration of how speech should be synthesized.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.SynthesizeSpeechConfig synthesize_speech_config = 3;</code>
     */
    public Builder setSynthesizeSpeechConfig(
        com.google.cloud.dialogflow.v2.SynthesizeSpeechConfig value) {
      if (synthesizeSpeechConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        synthesizeSpeechConfig_ = value;
        onChanged();
      } else {
        synthesizeSpeechConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Configuration of how speech should be synthesized.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.SynthesizeSpeechConfig synthesize_speech_config = 3;</code>
     */
    public Builder setSynthesizeSpeechConfig(
        com.google.cloud.dialogflow.v2.SynthesizeSpeechConfig.Builder builderForValue) {
      if (synthesizeSpeechConfigBuilder_ == null) {
        synthesizeSpeechConfig_ = builderForValue.build();
        onChanged();
      } else {
        synthesizeSpeechConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Configuration of how speech should be synthesized.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.SynthesizeSpeechConfig synthesize_speech_config = 3;</code>
     */
    public Builder mergeSynthesizeSpeechConfig(
        com.google.cloud.dialogflow.v2.SynthesizeSpeechConfig value) {
      if (synthesizeSpeechConfigBuilder_ == null) {
        if (synthesizeSpeechConfig_ != null) {
          synthesizeSpeechConfig_ =
              com.google.cloud.dialogflow.v2.SynthesizeSpeechConfig.newBuilder(
                      synthesizeSpeechConfig_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          synthesizeSpeechConfig_ = value;
        }
        onChanged();
      } else {
        synthesizeSpeechConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Configuration of how speech should be synthesized.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.SynthesizeSpeechConfig synthesize_speech_config = 3;</code>
     */
    public Builder clearSynthesizeSpeechConfig() {
      if (synthesizeSpeechConfigBuilder_ == null) {
        synthesizeSpeechConfig_ = null;
        onChanged();
      } else {
        synthesizeSpeechConfig_ = null;
        synthesizeSpeechConfigBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Configuration of how speech should be synthesized.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.SynthesizeSpeechConfig synthesize_speech_config = 3;</code>
     */
    public com.google.cloud.dialogflow.v2.SynthesizeSpeechConfig.Builder
        getSynthesizeSpeechConfigBuilder() {

      onChanged();
      return getSynthesizeSpeechConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional. Configuration of how speech should be synthesized.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.SynthesizeSpeechConfig synthesize_speech_config = 3;</code>
     */
    public com.google.cloud.dialogflow.v2.SynthesizeSpeechConfigOrBuilder
        getSynthesizeSpeechConfigOrBuilder() {
      if (synthesizeSpeechConfigBuilder_ != null) {
        return synthesizeSpeechConfigBuilder_.getMessageOrBuilder();
      } else {
        return synthesizeSpeechConfig_ == null
            ? com.google.cloud.dialogflow.v2.SynthesizeSpeechConfig.getDefaultInstance()
            : synthesizeSpeechConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Configuration of how speech should be synthesized.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.SynthesizeSpeechConfig synthesize_speech_config = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2.SynthesizeSpeechConfig,
            com.google.cloud.dialogflow.v2.SynthesizeSpeechConfig.Builder,
            com.google.cloud.dialogflow.v2.SynthesizeSpeechConfigOrBuilder>
        getSynthesizeSpeechConfigFieldBuilder() {
      if (synthesizeSpeechConfigBuilder_ == null) {
        synthesizeSpeechConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dialogflow.v2.SynthesizeSpeechConfig,
                com.google.cloud.dialogflow.v2.SynthesizeSpeechConfig.Builder,
                com.google.cloud.dialogflow.v2.SynthesizeSpeechConfigOrBuilder>(
                getSynthesizeSpeechConfig(), getParentForChildren(), isClean());
        synthesizeSpeechConfig_ = null;
      }
      return synthesizeSpeechConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.OutputAudioConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.OutputAudioConfig)
  private static final com.google.cloud.dialogflow.v2.OutputAudioConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.OutputAudioConfig();
  }

  public static com.google.cloud.dialogflow.v2.OutputAudioConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OutputAudioConfig> PARSER =
      new com.google.protobuf.AbstractParser<OutputAudioConfig>() {
        @java.lang.Override
        public OutputAudioConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new OutputAudioConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<OutputAudioConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OutputAudioConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.OutputAudioConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
