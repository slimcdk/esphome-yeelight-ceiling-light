package com.google.p017ar.schemas.sceneform;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ar.schemas.sceneform.Vec4Init */
public final class Vec4Init extends Table {
    public static void addW(FlatBufferBuilder flatBufferBuilder, float f) {
        flatBufferBuilder.addFloat(3, f, 0.0d);
    }

    public static void addX(FlatBufferBuilder flatBufferBuilder, float f) {
        flatBufferBuilder.addFloat(0, f, 0.0d);
    }

    public static void addY(FlatBufferBuilder flatBufferBuilder, float f) {
        flatBufferBuilder.addFloat(1, f, 0.0d);
    }

    public static void addZ(FlatBufferBuilder flatBufferBuilder, float f) {
        flatBufferBuilder.addFloat(2, f, 0.0d);
    }

    public static int createVec4Init(FlatBufferBuilder flatBufferBuilder, float f, float f2, float f3, float f4) {
        flatBufferBuilder.startObject(4);
        addW(flatBufferBuilder, f4);
        addZ(flatBufferBuilder, f3);
        addY(flatBufferBuilder, f2);
        addX(flatBufferBuilder, f);
        return endVec4Init(flatBufferBuilder);
    }

    public static int endVec4Init(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static Vec4Init getRootAsVec4Init(ByteBuffer byteBuffer) {
        return getRootAsVec4Init(byteBuffer, new Vec4Init());
    }

    public static Vec4Init getRootAsVec4Init(ByteBuffer byteBuffer, Vec4Init vec4Init) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return vec4Init.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startVec4Init(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(4);
    }

    public final Vec4Init __assign(int i, ByteBuffer byteBuffer) {
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
    public final float mo18470w() {
        int __offset = __offset(10);
        if (__offset != 0) {
            return this.f4160bb.getFloat(__offset + this.bb_pos);
        }
        return 0.0f;
    }

    /* renamed from: x */
    public final float mo18471x() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return this.f4160bb.getFloat(__offset + this.bb_pos);
        }
        return 0.0f;
    }

    /* renamed from: y */
    public final float mo18472y() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return this.f4160bb.getFloat(__offset + this.bb_pos);
        }
        return 0.0f;
    }

    /* renamed from: z */
    public final float mo18473z() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return this.f4160bb.getFloat(__offset + this.bb_pos);
        }
        return 0.0f;
    }
}
