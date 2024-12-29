package com.google.p017ar.schemas.sceneform;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ar.schemas.sceneform.LightingCubeFaceDef */
public final class LightingCubeFaceDef extends Table {
    public static void addData(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(0, i, 0);
    }

    public static int createDataVector(FlatBufferBuilder flatBufferBuilder, byte[] bArr) {
        flatBufferBuilder.startVector(1, bArr.length, 1);
        for (int length = bArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addByte(bArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createLightingCubeFaceDef(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startObject(1);
        addData(flatBufferBuilder, i);
        return endLightingCubeFaceDef(flatBufferBuilder);
    }

    public static int endLightingCubeFaceDef(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static LightingCubeFaceDef getRootAsLightingCubeFaceDef(ByteBuffer byteBuffer) {
        return getRootAsLightingCubeFaceDef(byteBuffer, new LightingCubeFaceDef());
    }

    public static LightingCubeFaceDef getRootAsLightingCubeFaceDef(ByteBuffer byteBuffer, LightingCubeFaceDef lightingCubeFaceDef) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return lightingCubeFaceDef.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startDataVector(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(1, i, 1);
    }

    public static void startLightingCubeFaceDef(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(1);
    }

    public final LightingCubeFaceDef __assign(int i, ByteBuffer byteBuffer) {
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

    public final int data(int i) {
        int __offset = __offset(4);
        if (__offset != 0) {
            return this.f4160bb.get(__vector(__offset) + i) & 255;
        }
        return 0;
    }

    public final ByteBuffer dataAsByteBuffer() {
        return __vector_as_bytebuffer(4, 1);
    }

    public final ByteBuffer dataInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 1);
    }

    public final int dataLength() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }
}
