/*
 * Copyright (C) 2019 The Turms Project
 * https://github.com/turms-im/turms
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/conversation/update_conversation_request.proto

package im.turms.server.common.access.client.dto.request.conversation;

/**
 * Protobuf type {@code im.turms.proto.UpdateConversationRequest}
 */
public final class UpdateConversationRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:im.turms.proto.UpdateConversationRequest)
    UpdateConversationRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateConversationRequest.newBuilder() to construct.
  private UpdateConversationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateConversationRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateConversationRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateConversationRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 8: {
            bitField0_ |= 0x00000001;
            targetId_ = input.readInt64();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            groupId_ = input.readInt64();
            break;
          }
          case 24: {

            readDate_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequestOuterClass.internal_static_im_turms_proto_UpdateConversationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequestOuterClass.internal_static_im_turms_proto_UpdateConversationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest.class, im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest.Builder.class);
  }

  private int bitField0_;
  public static final int TARGET_ID_FIELD_NUMBER = 1;
  private long targetId_;
  /**
   * <code>optional int64 target_id = 1;</code>
   * @return Whether the targetId field is set.
   */
  @java.lang.Override
  public boolean hasTargetId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional int64 target_id = 1;</code>
   * @return The targetId.
   */
  @java.lang.Override
  public long getTargetId() {
    return targetId_;
  }

  public static final int GROUP_ID_FIELD_NUMBER = 2;
  private long groupId_;
  /**
   * <code>optional int64 group_id = 2;</code>
   * @return Whether the groupId field is set.
   */
  @java.lang.Override
  public boolean hasGroupId() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional int64 group_id = 2;</code>
   * @return The groupId.
   */
  @java.lang.Override
  public long getGroupId() {
    return groupId_;
  }

  public static final int READ_DATE_FIELD_NUMBER = 3;
  private long readDate_;
  /**
   * <code>int64 read_date = 3;</code>
   * @return The readDate.
   */
  @java.lang.Override
  public long getReadDate() {
    return readDate_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(1, targetId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt64(2, groupId_);
    }
    if (readDate_ != 0L) {
      output.writeInt64(3, readDate_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, targetId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, groupId_);
    }
    if (readDate_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, readDate_);
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
    if (!(obj instanceof im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest)) {
      return super.equals(obj);
    }
    im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest other = (im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest) obj;

    if (hasTargetId() != other.hasTargetId()) return false;
    if (hasTargetId()) {
      if (getTargetId()
          != other.getTargetId()) return false;
    }
    if (hasGroupId() != other.hasGroupId()) return false;
    if (hasGroupId()) {
      if (getGroupId()
          != other.getGroupId()) return false;
    }
    if (getReadDate()
        != other.getReadDate()) return false;
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
    if (hasTargetId()) {
      hash = (37 * hash) + TARGET_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTargetId());
    }
    if (hasGroupId()) {
      hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getGroupId());
    }
    hash = (37 * hash) + READ_DATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getReadDate());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code im.turms.proto.UpdateConversationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:im.turms.proto.UpdateConversationRequest)
      im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequestOuterClass.internal_static_im_turms_proto_UpdateConversationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequestOuterClass.internal_static_im_turms_proto_UpdateConversationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest.class, im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest.Builder.class);
    }

    // Construct using im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      targetId_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      groupId_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      readDate_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequestOuterClass.internal_static_im_turms_proto_UpdateConversationRequest_descriptor;
    }

    @java.lang.Override
    public im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest getDefaultInstanceForType() {
      return im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest build() {
      im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest buildPartial() {
      im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest result = new im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.targetId_ = targetId_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.groupId_ = groupId_;
        to_bitField0_ |= 0x00000002;
      }
      result.readDate_ = readDate_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest) {
        return mergeFrom((im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest other) {
      if (other == im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest.getDefaultInstance()) return this;
      if (other.hasTargetId()) {
        setTargetId(other.getTargetId());
      }
      if (other.hasGroupId()) {
        setGroupId(other.getGroupId());
      }
      if (other.getReadDate() != 0L) {
        setReadDate(other.getReadDate());
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
      im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long targetId_ ;
    /**
     * <code>optional int64 target_id = 1;</code>
     * @return Whether the targetId field is set.
     */
    @java.lang.Override
    public boolean hasTargetId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int64 target_id = 1;</code>
     * @return The targetId.
     */
    @java.lang.Override
    public long getTargetId() {
      return targetId_;
    }
    /**
     * <code>optional int64 target_id = 1;</code>
     * @param value The targetId to set.
     * @return This builder for chaining.
     */
    public Builder setTargetId(long value) {
      bitField0_ |= 0x00000001;
      targetId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 target_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      targetId_ = 0L;
      onChanged();
      return this;
    }

    private long groupId_ ;
    /**
     * <code>optional int64 group_id = 2;</code>
     * @return Whether the groupId field is set.
     */
    @java.lang.Override
    public boolean hasGroupId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int64 group_id = 2;</code>
     * @return The groupId.
     */
    @java.lang.Override
    public long getGroupId() {
      return groupId_;
    }
    /**
     * <code>optional int64 group_id = 2;</code>
     * @param value The groupId to set.
     * @return This builder for chaining.
     */
    public Builder setGroupId(long value) {
      bitField0_ |= 0x00000002;
      groupId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 group_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGroupId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      groupId_ = 0L;
      onChanged();
      return this;
    }

    private long readDate_ ;
    /**
     * <code>int64 read_date = 3;</code>
     * @return The readDate.
     */
    @java.lang.Override
    public long getReadDate() {
      return readDate_;
    }
    /**
     * <code>int64 read_date = 3;</code>
     * @param value The readDate to set.
     * @return This builder for chaining.
     */
    public Builder setReadDate(long value) {
      
      readDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 read_date = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearReadDate() {
      
      readDate_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:im.turms.proto.UpdateConversationRequest)
  }

  // @@protoc_insertion_point(class_scope:im.turms.proto.UpdateConversationRequest)
  private static final im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest();
  }

  public static im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateConversationRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateConversationRequest>() {
    @java.lang.Override
    public UpdateConversationRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateConversationRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateConversationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateConversationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public im.turms.server.common.access.client.dto.request.conversation.UpdateConversationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

