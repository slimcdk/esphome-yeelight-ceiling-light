package com.google.p017ar.schemas.sceneform;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ar.schemas.sceneform.DoubleVec4Init */
public final class DoubleVec4Init extends Table {
    public static void addW(FlatBufferBuilder flatBufferBuilder, double d) {
        flatBufferBuilder.addDouble(3, d, 0.0d);
    }

    public static void addX(FlatBufferBuilder flatBufferBuilder, double d) {
        flatBufferBuilder.addDouble(0, d, 0.0d);
    }

    public static void addY(FlatBufferBuilder flatBufferBuilder, double d) {
        flatBufferBuilder.addDouble(1, d, 0.0d);
    }

    public static void addZ(FlatBufferBuilder flatBufferBuilder, double d) {
        flatBufferBuilder.addDouble(2, d, 0.0d);
    }

    public static int createDoubleVec4Init(FlatBufferBuilder flatBufferBuilder, double d, double d2, double d3, double d4) {
        flatBufferBuilder.startObject(4);
        addW(flatBufferBuilder, d4);
        addZ(flatBufferBuilder, d3);
        addY(flatBufferBuilder, d2);
        addX(flatBufferBuilder, d);
        return endDoubleVec4Init(flatBufferBuilder);
    }

    public static int endDoubleVec4Init(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static DoubleVec4Init getRootAsDoubleVec4Init(ByteBuffer byteBuffer) {
        return getRootAsDoubleVec4Init(byteBuffer, new DoubleVec4Init());
    }

    public static DoubleVec4Init getRootAsDoubleVec4Init(ByteBuffer byteBuffer, DoubleVec4Init doubleVec4Init) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return doubleVec4Init.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startDoubleVec4Init(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(4);
    }

    public final DoubleVec4Init __assign(int i, ByteBuffer byteBuffer) {
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

    /* renamed from: w */
    public final double mo18298w() {
        int __offset = __offset(10);
        if (__offset != 0) {
            return this.f4160bb.getDouble(__offset + this.bb_pos);
        }
        return 0.0d;
    }

    /* renamed from: x */
    public final double mo18299x() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return this.f4160bb.getDouble(__offset + this.bb_pos);
        }
        return 0.0d;
    }

    /* renamed from: y */
    public final double mo18300y() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return this.f4160bb.getDouble(__offset + this.bb_pos);
        }
        return 0.0d;
    }

    /* renamed from: z */
    public final double mo18301z() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return this.f4160bb.getDouble(__offset + this.bb_pos);
        }
        return 0.0d;
    }
}
