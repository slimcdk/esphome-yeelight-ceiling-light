package com.google.p017ar.sceneform.lullmodel;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ar.sceneform.lullmodel.ModelPipelineCollidableDef */
public final class ModelPipelineCollidableDef extends Table {
    public static void addSource(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(0, i, 0);
    }

    public static int createModelPipelineCollidableDef(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startObject(1);
        addSource(flatBufferBuilder, i);
        return endModelPipelineCollidableDef(flatBufferBuilder);
    }

    public static int endModelPipelineCollidableDef(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static ModelPipelineCollidableDef getRootAsModelPipelineCollidableDef(ByteBuffer byteBuffer) {
        return getRootAsModelPipelineCollidableDef(byteBuffer, new ModelPipelineCollidableDef());
    }

    public static ModelPipelineCollidableDef getRootAsModelPipelineCollidableDef(ByteBuffer byteBuffer, ModelPipelineCollidableDef modelPipelineCollidableDef) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return modelPipelineCollidableDef.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startModelPipelineCollidableDef(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(1);
    }

    public final ModelPipelineCollidableDef __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public final void __init(int i, ByteBuffer byteBuffer) {
        this.bb_pos = i;
        this.f4160bb = byteBuffer;
        int i2 = i - byteBuffer.getInt(i);
        this.vtable_start = i2;
        this.vtable_size = this.f4160bb.getShort(i2);
    }

    public final String source() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public final ByteBuffer sourceAsByteBuffer() {
        return __vector_as_bytebuffer(4, 1);
    }

    public final ByteBuffer sourceInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 1);
    }
}
