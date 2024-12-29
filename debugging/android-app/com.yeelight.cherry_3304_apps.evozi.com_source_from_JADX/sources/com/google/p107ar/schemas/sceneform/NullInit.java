package com.google.p107ar.schemas.sceneform;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ar.schemas.sceneform.NullInit */
public final class NullInit extends Table {
    public static int endNullInit(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static NullInit getRootAsNullInit(ByteBuffer byteBuffer) {
        return getRootAsNullInit(byteBuffer, new NullInit());
    }

    public static NullInit getRootAsNullInit(ByteBuffer byteBuffer, NullInit nullInit) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return nullInit.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startNullInit(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(0);
    }

    public final NullInit __assign(int i, ByteBuffer byteBuffer) {
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
}
