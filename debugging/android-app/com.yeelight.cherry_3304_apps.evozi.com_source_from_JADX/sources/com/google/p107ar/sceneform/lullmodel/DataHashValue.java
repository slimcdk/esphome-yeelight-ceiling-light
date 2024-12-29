package com.google.p107ar.sceneform.lullmodel;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ar.sceneform.lullmodel.DataHashValue */
public final class DataHashValue extends Table {
    public static void addValue(FlatBufferBuilder flatBufferBuilder, long j) {
        flatBufferBuilder.addInt(0, (int) j, 0);
    }

    public static int createDataHashValue(FlatBufferBuilder flatBufferBuilder, long j) {
        flatBufferBuilder.startObject(1);
        addValue(flatBufferBuilder, j);
        return endDataHashValue(flatBufferBuilder);
    }

    public static int endDataHashValue(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static DataHashValue getRootAsDataHashValue(ByteBuffer byteBuffer) {
        return getRootAsDataHashValue(byteBuffer, new DataHashValue());
    }

    public static DataHashValue getRootAsDataHashValue(ByteBuffer byteBuffer, DataHashValue dataHashValue) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return dataHashValue.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startDataHashValue(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(1);
    }

    public final DataHashValue __assign(int i, ByteBuffer byteBuffer) {
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

    public final long value() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return ((long) this.f6424bb.getInt(__offset + this.bb_pos)) & 4294967295L;
        }
        return 0;
    }
}
