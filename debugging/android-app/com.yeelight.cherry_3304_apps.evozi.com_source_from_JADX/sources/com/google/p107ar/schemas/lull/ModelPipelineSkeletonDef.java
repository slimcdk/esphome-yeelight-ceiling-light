package com.google.p107ar.schemas.lull;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ar.schemas.lull.ModelPipelineSkeletonDef */
public final class ModelPipelineSkeletonDef extends Table {
    public static void addSource(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(0, i, 0);
    }

    public static int createModelPipelineSkeletonDef(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startObject(1);
        addSource(flatBufferBuilder, i);
        return endModelPipelineSkeletonDef(flatBufferBuilder);
    }

    public static int endModelPipelineSkeletonDef(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static ModelPipelineSkeletonDef getRootAsModelPipelineSkeletonDef(ByteBuffer byteBuffer) {
        return getRootAsModelPipelineSkeletonDef(byteBuffer, new ModelPipelineSkeletonDef());
    }

    public static ModelPipelineSkeletonDef getRootAsModelPipelineSkeletonDef(ByteBuffer byteBuffer, ModelPipelineSkeletonDef modelPipelineSkeletonDef) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return modelPipelineSkeletonDef.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startModelPipelineSkeletonDef(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(1);
    }

    public final ModelPipelineSkeletonDef __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public final void __init(int i, ByteBuffer byteBuffer) {
        this.bb_pos = i;
        this.f6424bb = byteBuffer;
        int i2 = i - byteBuffer.getInt(i);
        this.vtable_start = i2;
        this.vtable_size = this.f6424bb.getShort(i2);
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
