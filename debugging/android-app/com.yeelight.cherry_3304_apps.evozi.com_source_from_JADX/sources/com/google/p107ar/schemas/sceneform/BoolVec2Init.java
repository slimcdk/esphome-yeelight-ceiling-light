package com.google.p107ar.schemas.sceneform;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ar.schemas.sceneform.BoolVec2Init */
public final class BoolVec2Init extends Table {
    public static void addX(FlatBufferBuilder flatBufferBuilder, boolean z) {
        flatBufferBuilder.addBoolean(0, z, false);
    }

    public static void addY(FlatBufferBuilder flatBufferBuilder, boolean z) {
        flatBufferBuilder.addBoolean(1, z, false);
    }

    public static int createBoolVec2Init(FlatBufferBuilder flatBufferBuilder, boolean z, boolean z2) {
        flatBufferBuilder.startObject(2);
        addY(flatBufferBuilder, z2);
        addX(flatBufferBuilder, z);
        return endBoolVec2Init(flatBufferBuilder);
    }

    public static int endBoolVec2Init(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static BoolVec2Init getRootAsBoolVec2Init(ByteBuffer byteBuffer) {
        return getRootAsBoolVec2Init(byteBuffer, new BoolVec2Init());
    }

    public static BoolVec2Init getRootAsBoolVec2Init(ByteBuffer byteBuffer, BoolVec2Init boolVec2Init) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return boolVec2Init.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startBoolVec2Init(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(2);
    }

    public final BoolVec2Init __assign(int i, ByteBuffer byteBuffer) {
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
    public final boolean mo16811x() {
        int __offset = __offset(4);
        return (__offset == 0 || this.f6424bb.get(__offset + this.bb_pos) == 0) ? false : true;
    }

    /* renamed from: y */
    public final boolean mo16812y() {
        int __offset = __offset(6);
        return (__offset == 0 || this.f6424bb.get(__offset + this.bb_pos) == 0) ? false : true;
    }
}
