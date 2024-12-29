package com.google.p107ar.sceneform.lullmodel;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ar.sceneform.lullmodel.DataInt */
public final class DataInt extends Table {
    public static void addValue(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(0, i, 0);
    }

    public static int createDataInt(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startObject(1);
        addValue(flatBufferBuilder, i);
        return endDataInt(flatBufferBuilder);
    }

    public static int endDataInt(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static DataInt getRootAsDataInt(ByteBuffer byteBuffer) {
        return getRootAsDataInt(byteBuffer, new DataInt());
    }

    public static DataInt getRootAsDataInt(ByteBuffer byteBuffer, DataInt dataInt) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return dataInt.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startDataInt(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(1);
    }

    public final DataInt __assign(int i, ByteBuffer byteBuffer) {
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

    public final int value() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return this.f6424bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }
}
