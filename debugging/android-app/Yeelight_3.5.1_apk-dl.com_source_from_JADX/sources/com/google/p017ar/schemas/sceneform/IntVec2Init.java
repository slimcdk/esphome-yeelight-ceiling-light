package com.google.p017ar.schemas.sceneform;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ar.schemas.sceneform.IntVec2Init */
public final class IntVec2Init extends Table {
    public static void addX(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(0, i, 0);
    }

    public static void addY(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(1, i, 0);
    }

    public static int createIntVec2Init(FlatBufferBuilder flatBufferBuilder, int i, int i2) {
        flatBufferBuilder.startObject(2);
        addY(flatBufferBuilder, i2);
        addX(flatBufferBuilder, i);
        return endIntVec2Init(flatBufferBuilder);
    }

    public static int endIntVec2Init(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static IntVec2Init getRootAsIntVec2Init(ByteBuffer byteBuffer) {
        return getRootAsIntVec2Init(byteBuffer, new IntVec2Init());
    }

    public static IntVec2Init getRootAsIntVec2Init(ByteBuffer byteBuffer, IntVec2Init intVec2Init) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return intVec2Init.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startIntVec2Init(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(2);
    }

    public final IntVec2Init __assign(int i, ByteBuffer byteBuffer) {
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

    /* renamed from: x */
    public final int mo18321x() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return this.f4160bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    /* renamed from: y */
    public final int mo18322y() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return this.f4160bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }
}
