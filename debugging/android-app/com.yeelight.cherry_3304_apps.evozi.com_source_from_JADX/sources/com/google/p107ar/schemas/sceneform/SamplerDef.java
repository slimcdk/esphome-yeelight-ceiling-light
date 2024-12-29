package com.google.p107ar.schemas.sceneform;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ar.schemas.sceneform.SamplerDef */
public final class SamplerDef extends Table {
    public static void addData(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(2, i, 0);
    }

    public static void addFile(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(1, i, 0);
    }

    public static void addName(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(0, i, 0);
    }

    public static void addParams(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(3, i, 0);
    }

    public static int createDataVector(FlatBufferBuilder flatBufferBuilder, byte[] bArr) {
        flatBufferBuilder.startVector(1, bArr.length, 1);
        for (int length = bArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addByte(bArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createSamplerDef(FlatBufferBuilder flatBufferBuilder, int i, int i2, int i3, int i4) {
        flatBufferBuilder.startObject(4);
        addParams(flatBufferBuilder, i4);
        addData(flatBufferBuilder, i3);
        addFile(flatBufferBuilder, i2);
        addName(flatBufferBuilder, i);
        return endSamplerDef(flatBufferBuilder);
    }

    public static int endSamplerDef(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static SamplerDef getRootAsSamplerDef(ByteBuffer byteBuffer) {
        return getRootAsSamplerDef(byteBuffer, new SamplerDef());
    }

    public static SamplerDef getRootAsSamplerDef(ByteBuffer byteBuffer, SamplerDef samplerDef) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return samplerDef.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startDataVector(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(1, i, 1);
    }

    public static void startSamplerDef(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(4);
    }

    public final SamplerDef __assign(int i, ByteBuffer byteBuffer) {
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

    public final int data(int i) {
        int __offset = __offset(8);
        if (__offset != 0) {
            return this.f6424bb.get(__vector(__offset) + i) & 255;
        }
        return 0;
    }

    public final ByteBuffer dataAsByteBuffer() {
        return __vector_as_bytebuffer(8, 1);
    }

    public final ByteBuffer dataInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 8, 1);
    }

    public final int dataLength() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    public final String file() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public final ByteBuffer fileAsByteBuffer() {
        return __vector_as_bytebuffer(6, 1);
    }

    public final ByteBuffer fileInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 6, 1);
    }

    public final String name() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public final ByteBuffer nameAsByteBuffer() {
        return __vector_as_bytebuffer(4, 1);
    }

    public final ByteBuffer nameInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 1);
    }

    public final SamplerParamsDef params() {
        return params(new SamplerParamsDef());
    }

    public final SamplerParamsDef params(SamplerParamsDef samplerParamsDef) {
        int __offset = __offset(10);
        if (__offset != 0) {
            return samplerParamsDef.__assign(__indirect(__offset + this.bb_pos), this.f6424bb);
        }
        return null;
    }
}
