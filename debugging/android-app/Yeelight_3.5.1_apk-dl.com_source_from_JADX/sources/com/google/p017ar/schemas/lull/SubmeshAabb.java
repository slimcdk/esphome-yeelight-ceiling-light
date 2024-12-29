package com.google.p017ar.schemas.lull;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ar.schemas.lull.SubmeshAabb */
public final class SubmeshAabb extends Table {
    public static void addMaxPosition(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addStruct(1, i, 0);
    }

    public static void addMinPosition(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addStruct(0, i, 0);
    }

    public static int endSubmeshAabb(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static SubmeshAabb getRootAsSubmeshAabb(ByteBuffer byteBuffer) {
        return getRootAsSubmeshAabb(byteBuffer, new SubmeshAabb());
    }

    public static SubmeshAabb getRootAsSubmeshAabb(ByteBuffer byteBuffer, SubmeshAabb submeshAabb) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return submeshAabb.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startSubmeshAabb(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(2);
    }

    public final SubmeshAabb __assign(int i, ByteBuffer byteBuffer) {
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

    public final Vec3 maxPosition() {
        return maxPosition(new Vec3());
    }

    public final Vec3 maxPosition(Vec3 vec3) {
        int __offset = __offset(6);
        if (__offset != 0) {
            return vec3.__assign(__offset + this.bb_pos, this.f4160bb);
        }
        return null;
    }

    public final Vec3 minPosition() {
        return minPosition(new Vec3());
    }

    public final Vec3 minPosition(Vec3 vec3) {
        int __offset = __offset(4);
        if (__offset != 0) {
            return vec3.__assign(__offset + this.bb_pos, this.f4160bb);
        }
        return null;
    }
}
