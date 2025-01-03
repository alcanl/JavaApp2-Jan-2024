// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: randomgenerator.proto

package org.csystem.generator.random;

/**
 * Protobuf type {@code org.csystem.generator.random.DoubleGenerateInfo}
 */
public final class DoubleGenerateInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.csystem.generator.random.DoubleGenerateInfo)
    DoubleGenerateInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DoubleGenerateInfo.newBuilder() to construct.
  private DoubleGenerateInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DoubleGenerateInfo() {
    username_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DoubleGenerateInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DoubleGenerateInfo(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            username_ = s;
            break;
          }
          case 17: {

            min_ = input.readDouble();
            break;
          }
          case 25: {

            bound_ = input.readDouble();
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
    return org.csystem.generator.random.Randomgenerator.internal_static_org_csystem_generator_random_DoubleGenerateInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.csystem.generator.random.Randomgenerator.internal_static_org_csystem_generator_random_DoubleGenerateInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.csystem.generator.random.DoubleGenerateInfo.class, org.csystem.generator.random.DoubleGenerateInfo.Builder.class);
  }

  public static final int USERNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object username_;
  /**
   * <code>string username = 1;</code>
   * @return The username.
   */
  @java.lang.Override
  public java.lang.String getUsername() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      username_ = s;
      return s;
    }
  }
  /**
   * <code>string username = 1;</code>
   * @return The bytes for username.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUsernameBytes() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      username_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MIN_FIELD_NUMBER = 2;
  private double min_;
  /**
   * <code>double min = 2;</code>
   * @return The min.
   */
  @java.lang.Override
  public double getMin() {
    return min_;
  }

  public static final int BOUND_FIELD_NUMBER = 3;
  private double bound_;
  /**
   * <code>double bound = 3;</code>
   * @return The bound.
   */
  @java.lang.Override
  public double getBound() {
    return bound_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(username_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, username_);
    }
    if (java.lang.Double.doubleToRawLongBits(min_) != 0) {
      output.writeDouble(2, min_);
    }
    if (java.lang.Double.doubleToRawLongBits(bound_) != 0) {
      output.writeDouble(3, bound_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(username_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, username_);
    }
    if (java.lang.Double.doubleToRawLongBits(min_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, min_);
    }
    if (java.lang.Double.doubleToRawLongBits(bound_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, bound_);
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
    if (!(obj instanceof org.csystem.generator.random.DoubleGenerateInfo)) {
      return super.equals(obj);
    }
    org.csystem.generator.random.DoubleGenerateInfo other = (org.csystem.generator.random.DoubleGenerateInfo) obj;

    if (!getUsername()
        .equals(other.getUsername())) return false;
    if (java.lang.Double.doubleToLongBits(getMin())
        != java.lang.Double.doubleToLongBits(
            other.getMin())) return false;
    if (java.lang.Double.doubleToLongBits(getBound())
        != java.lang.Double.doubleToLongBits(
            other.getBound())) return false;
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
    hash = (37 * hash) + USERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getUsername().hashCode();
    hash = (37 * hash) + MIN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getMin()));
    hash = (37 * hash) + BOUND_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getBound()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.csystem.generator.random.DoubleGenerateInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.csystem.generator.random.DoubleGenerateInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.csystem.generator.random.DoubleGenerateInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.csystem.generator.random.DoubleGenerateInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.csystem.generator.random.DoubleGenerateInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.csystem.generator.random.DoubleGenerateInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.csystem.generator.random.DoubleGenerateInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.csystem.generator.random.DoubleGenerateInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.csystem.generator.random.DoubleGenerateInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.csystem.generator.random.DoubleGenerateInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.csystem.generator.random.DoubleGenerateInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.csystem.generator.random.DoubleGenerateInfo parseFrom(
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
  public static Builder newBuilder(org.csystem.generator.random.DoubleGenerateInfo prototype) {
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
   * Protobuf type {@code org.csystem.generator.random.DoubleGenerateInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.csystem.generator.random.DoubleGenerateInfo)
      org.csystem.generator.random.DoubleGenerateInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.csystem.generator.random.Randomgenerator.internal_static_org_csystem_generator_random_DoubleGenerateInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.csystem.generator.random.Randomgenerator.internal_static_org_csystem_generator_random_DoubleGenerateInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.csystem.generator.random.DoubleGenerateInfo.class, org.csystem.generator.random.DoubleGenerateInfo.Builder.class);
    }

    // Construct using org.csystem.generator.random.DoubleGenerateInfo.newBuilder()
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
      username_ = "";

      min_ = 0D;

      bound_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.csystem.generator.random.Randomgenerator.internal_static_org_csystem_generator_random_DoubleGenerateInfo_descriptor;
    }

    @java.lang.Override
    public org.csystem.generator.random.DoubleGenerateInfo getDefaultInstanceForType() {
      return org.csystem.generator.random.DoubleGenerateInfo.getDefaultInstance();
    }

    @java.lang.Override
    public org.csystem.generator.random.DoubleGenerateInfo build() {
      org.csystem.generator.random.DoubleGenerateInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.csystem.generator.random.DoubleGenerateInfo buildPartial() {
      org.csystem.generator.random.DoubleGenerateInfo result = new org.csystem.generator.random.DoubleGenerateInfo(this);
      result.username_ = username_;
      result.min_ = min_;
      result.bound_ = bound_;
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
      if (other instanceof org.csystem.generator.random.DoubleGenerateInfo) {
        return mergeFrom((org.csystem.generator.random.DoubleGenerateInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.csystem.generator.random.DoubleGenerateInfo other) {
      if (other == org.csystem.generator.random.DoubleGenerateInfo.getDefaultInstance()) return this;
      if (!other.getUsername().isEmpty()) {
        username_ = other.username_;
        onChanged();
      }
      if (other.getMin() != 0D) {
        setMin(other.getMin());
      }
      if (other.getBound() != 0D) {
        setBound(other.getBound());
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
      org.csystem.generator.random.DoubleGenerateInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.csystem.generator.random.DoubleGenerateInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object username_ = "";
    /**
     * <code>string username = 1;</code>
     * @return The username.
     */
    public java.lang.String getUsername() {
      java.lang.Object ref = username_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        username_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string username = 1;</code>
     * @return The bytes for username.
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      java.lang.Object ref = username_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string username = 1;</code>
     * @param value The username to set.
     * @return This builder for chaining.
     */
    public Builder setUsername(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      username_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string username = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUsername() {
      
      username_ = getDefaultInstance().getUsername();
      onChanged();
      return this;
    }
    /**
     * <code>string username = 1;</code>
     * @param value The bytes for username to set.
     * @return This builder for chaining.
     */
    public Builder setUsernameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      username_ = value;
      onChanged();
      return this;
    }

    private double min_ ;
    /**
     * <code>double min = 2;</code>
     * @return The min.
     */
    @java.lang.Override
    public double getMin() {
      return min_;
    }
    /**
     * <code>double min = 2;</code>
     * @param value The min to set.
     * @return This builder for chaining.
     */
    public Builder setMin(double value) {
      
      min_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double min = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMin() {
      
      min_ = 0D;
      onChanged();
      return this;
    }

    private double bound_ ;
    /**
     * <code>double bound = 3;</code>
     * @return The bound.
     */
    @java.lang.Override
    public double getBound() {
      return bound_;
    }
    /**
     * <code>double bound = 3;</code>
     * @param value The bound to set.
     * @return This builder for chaining.
     */
    public Builder setBound(double value) {
      
      bound_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double bound = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBound() {
      
      bound_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:org.csystem.generator.random.DoubleGenerateInfo)
  }

  // @@protoc_insertion_point(class_scope:org.csystem.generator.random.DoubleGenerateInfo)
  private static final org.csystem.generator.random.DoubleGenerateInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.csystem.generator.random.DoubleGenerateInfo();
  }

  public static org.csystem.generator.random.DoubleGenerateInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DoubleGenerateInfo>
      PARSER = new com.google.protobuf.AbstractParser<DoubleGenerateInfo>() {
    @java.lang.Override
    public DoubleGenerateInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DoubleGenerateInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DoubleGenerateInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DoubleGenerateInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.csystem.generator.random.DoubleGenerateInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

