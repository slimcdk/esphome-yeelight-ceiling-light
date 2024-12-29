package com.google.p107ar.schemas.sceneform;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ar.schemas.sceneform.SamplerInit */
public final class SamplerInit extends Table {
    public static void addPath(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(0, i, 0);
    }

    public static void addUsage(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(1, i, 0);
    }

    public static int createSamplerInit(FlatBufferBuilder flatBufferBuilder, int i, int i2) {
        flatBufferBuilder.startObject(2);
        addUsage(flatBufferBuilder, i2);
        addPath(flatBufferBuilder, i);
        return endSamplerInit(flatBufferBuilder);
    }

    public static int endSamplerInit(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static SamplerInit getRootAsSamplerInit(ByteBuffer byteBuffer) {
        return getRootAsSamplerInit(byteBuffer, new SamplerInit());
    }

    public static SamplerInit getRootAsSamplerInit(ByteBuffer byteBuffer, SamplerInit samplerInit) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return samplerInit.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startSamplerInit(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(2);
    }

    public final SamplerInit __assign(int i, ByteBuffer byteBuffer) {
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

    public final String path() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public final ByteBuffer pathAsByteBuffer() {
        return __vector_as_bytebuffer(4, 1);
    }

    public final ByteBuffer pathInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 1);
    }

    public final int usage() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return this.f6424bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }
}
