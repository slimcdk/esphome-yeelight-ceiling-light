package com.google.p017ar.schemas.sceneform;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ar.schemas.sceneform.BoolInit */
public final class BoolInit extends Table {
    public static void addValue(FlatBufferBuilder flatBufferBuilder, boolean z) {
        flatBufferBuilder.addBoolean(0, z, false);
    }

    public static int createBoolInit(FlatBufferBuilder flatBufferBuilder, boolean z) {
        flatBufferBuilder.startObject(1);
        addValue(flatBufferBuilder, z);
        return endBoolInit(flatBufferBuilder);
    }

    public static int endBoolInit(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static BoolInit getRootAsBoolInit(ByteBuffer byteBuffer) {
        return getRootAsBoolInit(byteBuffer, new BoolInit());
    }

    public static BoolInit getRootAsBoolInit(ByteBuffer byteBuffer, BoolInit boolInit) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return boolInit.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startBoolInit(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(1);
    }

    public final BoolInit __assign(int i, ByteBuffer byteBuffer) {
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

    public final boolean value() {
        int __offset = __offset(4);
        return (__offset == 0 || this.f4160bb.get(__offset + this.bb_pos) == 0) ? false : true;
    }
}
