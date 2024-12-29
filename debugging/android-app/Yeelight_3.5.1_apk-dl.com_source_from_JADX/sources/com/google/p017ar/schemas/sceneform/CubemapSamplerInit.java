package com.google.p017ar.schemas.sceneform;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ar.schemas.sceneform.CubemapSamplerInit */
public final class CubemapSamplerInit extends Table {
    public static void addPath(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(0, i, 0);
    }

    public static void addUsage(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(1, i, 0);
    }

    public static int createCubemapSamplerInit(FlatBufferBuilder flatBufferBuilder, int i, int i2) {
        flatBufferBuilder.startObject(2);
        addUsage(flatBufferBuilder, i2);
        addPath(flatBufferBuilder, i);
        return endCubemapSamplerInit(flatBufferBuilder);
    }

    public static int endCubemapSamplerInit(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static CubemapSamplerInit getRootAsCubemapSamplerInit(ByteBuffer byteBuffer) {
        return getRootAsCubemapSamplerInit(byteBuffer, new CubemapSamplerInit());
    }

    public static CubemapSamplerInit getRootAsCubemapSamplerInit(ByteBuffer byteBuffer, CubemapSamplerInit cubemapSamplerInit) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return cubemapSamplerInit.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startCubemapSamplerInit(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(2);
    }

    public final CubemapSamplerInit __assign(int i, ByteBuffer byteBuffer) {
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
            return this.f4160bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }
}
