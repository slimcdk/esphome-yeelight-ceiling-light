package com.google.p107ar.schemas.sceneform;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import com.google.p107ar.schemas.lull.Vec3;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ar.schemas.sceneform.TransformDef */
public final class TransformDef extends Table {
    public static void addOffset(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addStruct(1, i, 0);
    }

    public static void addScale(FlatBufferBuilder flatBufferBuilder, float f) {
        flatBufferBuilder.addFloat(0, f, 0.0d);
    }

    public static int endTransformDef(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static TransformDef getRootAsTransformDef(ByteBuffer byteBuffer) {
        return getRootAsTransformDef(byteBuffer, new TransformDef());
    }

    public static TransformDef getRootAsTransformDef(ByteBuffer byteBuffer, TransformDef transformDef) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return transformDef.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startTransformDef(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(2);
    }

    public final TransformDef __assign(int i, ByteBuffer byteBuffer) {
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

    public final Vec3 offset() {
        return offset(new Vec3());
    }

    public final Vec3 offset(Vec3 vec3) {
        int __offset = __offset(6);
        if (__offset != 0) {
            return vec3.__assign(__offset + this.bb_pos, this.f6424bb);
        }
        return null;
    }

    public final float scale() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return this.f6424bb.getFloat(__offset + this.bb_pos);
        }
        return 0.0f;
    }
}
