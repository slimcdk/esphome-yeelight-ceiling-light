package com.google.p107ar.sceneform.lullmodel;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ar.sceneform.lullmodel.DataFloat */
public final class DataFloat extends Table {
    public static void addValue(FlatBufferBuilder flatBufferBuilder, float f) {
        flatBufferBuilder.addFloat(0, f, 0.0d);
    }

    public static int createDataFloat(FlatBufferBuilder flatBufferBuilder, float f) {
        flatBufferBuilder.startObject(1);
        addValue(flatBufferBuilder, f);
        return endDataFloat(flatBufferBuilder);
    }

    public static int endDataFloat(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static DataFloat getRootAsDataFloat(ByteBuffer byteBuffer) {
        return getRootAsDataFloat(byteBuffer, new DataFloat());
    }

    public static DataFloat getRootAsDataFloat(ByteBuffer byteBuffer, DataFloat dataFloat) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return dataFloat.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startDataFloat(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(1);
    }

    public final DataFloat __assign(int i, ByteBuffer byteBuffer) {
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
