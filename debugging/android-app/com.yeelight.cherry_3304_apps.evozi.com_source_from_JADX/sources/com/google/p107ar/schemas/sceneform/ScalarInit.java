package com.google.p107ar.schemas.sceneform;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ar.schemas.sceneform.ScalarInit */
public final class ScalarInit extends Table {
    public static void addValue(FlatBufferBuilder flatBufferBuilder, float f) {
        flatBufferBuilder.addFloat(0, f, 0.0d);
    }

    public static int createScalarInit(FlatBufferBuilder flatBufferBuilder, float f) {
        flatBufferBuilder.startObject(1);
        addValue(flatBufferBuilder, f);
        return endScalarInit(flatBufferBuilder);
    }

    public static int endScalarInit(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static ScalarInit getRootAsScalarInit(ByteBuffer byteBuffer) {
        return getRootAsScalarInit(byteBuffer, new ScalarInit());
    }

    public static ScalarInit getRootAsScalarInit(ByteBuffer byteBuffer, ScalarInit scalarInit) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return scalarInit.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startScalarInit(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(1);
    }

    public final ScalarInit __assign(int i, ByteBuffer byteBuffer) {
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

    public final float value() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return this.f6424bb.getFloat(__offset + this.bb_pos);
        }
        return 0.0f;
    }
}
