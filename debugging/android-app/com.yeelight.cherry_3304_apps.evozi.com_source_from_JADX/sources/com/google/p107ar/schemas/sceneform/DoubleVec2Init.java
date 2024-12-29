package com.google.p107ar.schemas.sceneform;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ar.schemas.sceneform.DoubleVec2Init */
public final class DoubleVec2Init extends Table {
    public static void addX(FlatBufferBuilder flatBufferBuilder, double d) {
        flatBufferBuilder.addDouble(0, d, 0.0d);
    }

    public static void addY(FlatBufferBuilder flatBufferBuilder, double d) {
        flatBufferBuilder.addDouble(1, d, 0.0d);
    }

    public static int createDoubleVec2Init(FlatBufferBuilder flatBufferBuilder, double d, double d2) {
        flatBufferBuilder.startObject(2);
        addY(flatBufferBuilder, d2);
        addX(flatBufferBuilder, d);
        return endDoubleVec2Init(flatBufferBuilder);
    }

    public static int endDoubleVec2Init(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static DoubleVec2Init getRootAsDoubleVec2Init(ByteBuffer byteBuffer) {
        return getRootAsDoubleVec2Init(byteBuffer, new DoubleVec2Init());
    }

    public static DoubleVec2Init getRootAsDoubleVec2Init(ByteBuffer byteBuffer, DoubleVec2Init doubleVec2Init) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return doubleVec2Init.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startDoubleVec2Init(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(2);
    }

    public final DoubleVec2Init __assign(int i, ByteBuffer byteBuffer) {
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

    /* renamed from: x */
    public final double mo16857x() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return this.f6424bb.getDouble(__offset + this.bb_pos);
        }
        return 0.0d;
    }

    /* renamed from: y */
    public final double mo16858y() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return this.f6424bb.getDouble(__offset + this.bb_pos);
        }
        return 0.0d;
    }
}
