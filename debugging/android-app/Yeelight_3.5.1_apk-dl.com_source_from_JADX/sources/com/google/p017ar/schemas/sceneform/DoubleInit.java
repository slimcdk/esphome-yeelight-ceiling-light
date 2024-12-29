package com.google.p017ar.schemas.sceneform;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ar.schemas.sceneform.DoubleInit */
public final class DoubleInit extends Table {
    public static void addValue(FlatBufferBuilder flatBufferBuilder, double d) {
        flatBufferBuilder.addDouble(0, d, 0.0d);
    }

    public static int createDoubleInit(FlatBufferBuilder flatBufferBuilder, double d) {
        flatBufferBuilder.startObject(1);
        addValue(flatBufferBuilder, d);
        return endDoubleInit(flatBufferBuilder);
    }

    public static int endDoubleInit(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static DoubleInit getRootAsDoubleInit(ByteBuffer byteBuffer) {
        return getRootAsDoubleInit(byteBuffer, new DoubleInit());
    }

    public static DoubleInit getRootAsDoubleInit(ByteBuffer byteBuffer, DoubleInit doubleInit) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return doubleInit.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startDoubleInit(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(1);
    }

    public final DoubleInit __assign(int i, ByteBuffer byteBuffer) {
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

    public final double value() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return this.f4160bb.getDouble(__offset + this.bb_pos);
        }
        return 0.0d;
    }
}
