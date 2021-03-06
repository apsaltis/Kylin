// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Node.proto

package com.kylinolap.storage.hbase.coprocessor.example.generated;

public final class NodeProtos {
  private NodeProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface NodeOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string name = 1;
    /**
     * <code>required string name = 1;</code>
     */
    boolean hasName();
    /**
     * <code>required string name = 1;</code>
     */
    java.lang.String getName();
    /**
     * <code>required string name = 1;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    // optional .Node left = 2;
    /**
     * <code>optional .Node left = 2;</code>
     */
    boolean hasLeft();
    /**
     * <code>optional .Node left = 2;</code>
     */
    com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node getLeft();
    /**
     * <code>optional .Node left = 2;</code>
     */
    com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.NodeOrBuilder getLeftOrBuilder();

    // optional .Node right = 3;
    /**
     * <code>optional .Node right = 3;</code>
     */
    boolean hasRight();
    /**
     * <code>optional .Node right = 3;</code>
     */
    com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node getRight();
    /**
     * <code>optional .Node right = 3;</code>
     */
    com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.NodeOrBuilder getRightOrBuilder();
  }
  /**
   * Protobuf type {@code Node}
   */
  public static final class Node extends
      com.google.protobuf.GeneratedMessage
      implements NodeOrBuilder {
    // Use Node.newBuilder() to construct.
    private Node(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Node(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Node defaultInstance;
    public static Node getDefaultInstance() {
      return defaultInstance;
    }

    public Node getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Node(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              name_ = input.readBytes();
              break;
            }
            case 18: {
              com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = left_.toBuilder();
              }
              left_ = input.readMessage(com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(left_);
                left_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
            case 26: {
              com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = right_.toBuilder();
              }
              right_ = input.readMessage(com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(right_);
                right_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.internal_static_Node_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.internal_static_Node_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node.class, com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node.Builder.class);
    }

    public static com.google.protobuf.Parser<Node> PARSER =
        new com.google.protobuf.AbstractParser<Node>() {
      public Node parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Node(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Node> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string name = 1;
    public static final int NAME_FIELD_NUMBER = 1;
    private java.lang.Object name_;
    /**
     * <code>required string name = 1;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional .Node left = 2;
    public static final int LEFT_FIELD_NUMBER = 2;
    private com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node left_;
    /**
     * <code>optional .Node left = 2;</code>
     */
    public boolean hasLeft() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .Node left = 2;</code>
     */
    public com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node getLeft() {
      return left_;
    }
    /**
     * <code>optional .Node left = 2;</code>
     */
    public com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.NodeOrBuilder getLeftOrBuilder() {
      return left_;
    }

    // optional .Node right = 3;
    public static final int RIGHT_FIELD_NUMBER = 3;
    private com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node right_;
    /**
     * <code>optional .Node right = 3;</code>
     */
    public boolean hasRight() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .Node right = 3;</code>
     */
    public com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node getRight() {
      return right_;
    }
    /**
     * <code>optional .Node right = 3;</code>
     */
    public com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.NodeOrBuilder getRightOrBuilder() {
      return right_;
    }

    private void initFields() {
      name_ = "";
      left_ = com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node.getDefaultInstance();
      right_ = com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasLeft()) {
        if (!getLeft().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasRight()) {
        if (!getRight().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, left_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, right_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, left_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, right_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Node}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.NodeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.internal_static_Node_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.internal_static_Node_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node.class, com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node.Builder.class);
      }

      // Construct using com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getLeftFieldBuilder();
          getRightFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (leftBuilder_ == null) {
          left_ = com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node.getDefaultInstance();
        } else {
          leftBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (rightBuilder_ == null) {
          right_ = com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node.getDefaultInstance();
        } else {
          rightBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.internal_static_Node_descriptor;
      }

      public com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node getDefaultInstanceForType() {
        return com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node.getDefaultInstance();
      }

      public com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node build() {
        com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node buildPartial() {
        com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node result = new com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (leftBuilder_ == null) {
          result.left_ = left_;
        } else {
          result.left_ = leftBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (rightBuilder_ == null) {
          result.right_ = right_;
        } else {
          result.right_ = rightBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node) {
          return mergeFrom((com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node other) {
        if (other == com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node.getDefaultInstance()) return this;
        if (other.hasName()) {
          bitField0_ |= 0x00000001;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasLeft()) {
          mergeLeft(other.getLeft());
        }
        if (other.hasRight()) {
          mergeRight(other.getRight());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasName()) {
          
          return false;
        }
        if (hasLeft()) {
          if (!getLeft().isInitialized()) {
            
            return false;
          }
        }
        if (hasRight()) {
          if (!getRight().isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string name = 1;
      private java.lang.Object name_ = "";
      /**
       * <code>required string name = 1;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string name = 1;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string name = 1;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 1;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 1;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }

      // optional .Node left = 2;
      private com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node left_ = com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node, com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node.Builder, com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.NodeOrBuilder> leftBuilder_;
      /**
       * <code>optional .Node left = 2;</code>
       */
      public boolean hasLeft() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional .Node left = 2;</code>
       */
      public com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node getLeft() {
        if (leftBuilder_ == null) {
          return left_;
        } else {
          return leftBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .Node left = 2;</code>
       */
      public Builder setLeft(com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node value) {
        if (leftBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          left_ = value;
          onChanged();
        } else {
          leftBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .Node left = 2;</code>
       */
      public Builder setLeft(
          com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node.Builder builderForValue) {
        if (leftBuilder_ == null) {
          left_ = builderForValue.build();
          onChanged();
        } else {
          leftBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .Node left = 2;</code>
       */
      public Builder mergeLeft(com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node value) {
        if (leftBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              left_ != com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node.getDefaultInstance()) {
            left_ =
              com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node.newBuilder(left_).mergeFrom(value).buildPartial();
          } else {
            left_ = value;
          }
          onChanged();
        } else {
          leftBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .Node left = 2;</code>
       */
      public Builder clearLeft() {
        if (leftBuilder_ == null) {
          left_ = com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node.getDefaultInstance();
          onChanged();
        } else {
          leftBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>optional .Node left = 2;</code>
       */
      public com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node.Builder getLeftBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getLeftFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .Node left = 2;</code>
       */
      public com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.NodeOrBuilder getLeftOrBuilder() {
        if (leftBuilder_ != null) {
          return leftBuilder_.getMessageOrBuilder();
        } else {
          return left_;
        }
      }
      /**
       * <code>optional .Node left = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node, com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node.Builder, com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.NodeOrBuilder> 
          getLeftFieldBuilder() {
        if (leftBuilder_ == null) {
          leftBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node, com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node.Builder, com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.NodeOrBuilder>(
                  left_,
                  getParentForChildren(),
                  isClean());
          left_ = null;
        }
        return leftBuilder_;
      }

      // optional .Node right = 3;
      private com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node right_ = com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node, com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node.Builder, com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.NodeOrBuilder> rightBuilder_;
      /**
       * <code>optional .Node right = 3;</code>
       */
      public boolean hasRight() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional .Node right = 3;</code>
       */
      public com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node getRight() {
        if (rightBuilder_ == null) {
          return right_;
        } else {
          return rightBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .Node right = 3;</code>
       */
      public Builder setRight(com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node value) {
        if (rightBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          right_ = value;
          onChanged();
        } else {
          rightBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .Node right = 3;</code>
       */
      public Builder setRight(
          com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node.Builder builderForValue) {
        if (rightBuilder_ == null) {
          right_ = builderForValue.build();
          onChanged();
        } else {
          rightBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .Node right = 3;</code>
       */
      public Builder mergeRight(com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node value) {
        if (rightBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) &&
              right_ != com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node.getDefaultInstance()) {
            right_ =
              com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node.newBuilder(right_).mergeFrom(value).buildPartial();
          } else {
            right_ = value;
          }
          onChanged();
        } else {
          rightBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .Node right = 3;</code>
       */
      public Builder clearRight() {
        if (rightBuilder_ == null) {
          right_ = com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node.getDefaultInstance();
          onChanged();
        } else {
          rightBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <code>optional .Node right = 3;</code>
       */
      public com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node.Builder getRightBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getRightFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .Node right = 3;</code>
       */
      public com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.NodeOrBuilder getRightOrBuilder() {
        if (rightBuilder_ != null) {
          return rightBuilder_.getMessageOrBuilder();
        } else {
          return right_;
        }
      }
      /**
       * <code>optional .Node right = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node, com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node.Builder, com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.NodeOrBuilder> 
          getRightFieldBuilder() {
        if (rightBuilder_ == null) {
          rightBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node, com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.Node.Builder, com.kylinolap.storage.hbase.coprocessor.example.generated.NodeProtos.NodeOrBuilder>(
                  right_,
                  getParentForChildren(),
                  isClean());
          right_ = null;
        }
        return rightBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:Node)
    }

    static {
      defaultInstance = new Node(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Node)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_Node_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Node_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nNode.proto\"?\n\004Node\022\014\n\004name\030\001 \002(\t\022\023\n\004le" +
      "ft\030\002 \001(\0132\005.Node\022\024\n\005right\030\003 \001(\0132\005.NodeBG\n" +
      "9com.kylinolap.storage.hbase.coprocessor" +
      ".example.generatedB\nNodeProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_Node_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_Node_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_Node_descriptor,
              new java.lang.String[] { "Name", "Left", "Right", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
