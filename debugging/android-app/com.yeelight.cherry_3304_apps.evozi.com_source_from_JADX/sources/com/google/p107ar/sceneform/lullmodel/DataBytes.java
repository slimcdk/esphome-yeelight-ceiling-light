package com.google.p107ar.sceneform.lullmodel;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ar.sceneform.lullmodel.DataBytes */
public final class DataBytes extends Table {
    public static void addValue(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(0, i, 0);
    }

    public static int createDataBytes(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startObject(1);
        addValue(flatBufferBuilder, i);
        return endDataBytes(flatBufferBuilder);
    }

    public static int createValueVector(FlatBufferBuilder flatBufferBuilder, byte[] bArr) {
        flatBufferBuilder.startVector(1, bArr.length, 1);
        for (int length = bArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addByte(bArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int endDataBytes(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static DataBytes getRootAsDataBytes(ByteBuffer byteBuffer) {
        return getRootAsDataBytes(byteBuffer, new DataBytes());
    }

    public static DataBytes getRootAsDataBytes(ByteBuffer byteBuffer, DataBytes dataBytes) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return dataBytes.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startDataBytes(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(1);
    }

    public static void startValueVector(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(1, i, 1);
    }

    public final DataBytes __assign(int i, ByteBuffer byteBuffer) {
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

    public final int value(int i) {
        int __offset = __offset(4);
        if (__offset != 0) {
            return this.f6424bb.get(__vector(__offset) + i) & 255;
        }
        return 0;
    }

    public final ByteBuffer valueAsByteBuffer() {
        return __vector_as_bytebuffer(4, 1);
    }

    public final ByteBuffer valueInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 1);
    }

    public final int valueLength() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }
}
