package com.google.p107ar.schemas.sceneform;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ar.schemas.sceneform.IntVec4Init */
public final class IntVec4Init extends Table {
    public static void addW(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(3, i, 0);
    }

    public static void addX(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(0, i, 0);
    }

    public static void addY(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(1, i, 0);
    }

    public static void addZ(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(2, i, 0);
    }

    public static int createIntVec4Init(FlatBufferBuilder flatBufferBuilder, int i, int i2, int i3, int i4) {
        flatBufferBuilder.startObject(4);
        addW(flatBufferBuilder, i4);
        addZ(flatBufferBuilder, i3);
        addY(flatBufferBuilder, i2);
        addX(flatBufferBuilder, i);
        return endIntVec4Init(flatBufferBuilder);
    }

    public static int endIntVec4Init(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static IntVec4Init getRootAsIntVec4Init(ByteBuffer byteBuffer) {
        return getRootAsIntVec4Init(byteBuffer, new IntVec4Init());
    }

    public static IntVec4Init getRootAsIntVec4Init(ByteBuffer byteBuffer, IntVec4Init intVec4Init) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return intVec4Init.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startIntVec4Init(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(4);
    }

    public final IntVec4Init __assign(int i, ByteBuffer byteBuffer) {
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

    /* renamed from: w */
    public final int mo16898w() {
        int __offset = __offset(10);
        if (__offset != 0) {
            return this.f6424bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    /* renamed from: x */
    public final int mo16899x() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return this.f6424bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    /* renamed from: y */
    public final int mo16900y() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return this.f6424bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    /* renamed from: z */
    public final int mo16901z() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return this.f6424bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }
}
