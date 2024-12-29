package com.google.p107ar.schemas.lull;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ar.schemas.lull.MaterialTextureDef */
public final class MaterialTextureDef extends Table {
    public static void addName(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(0, i, 0);
    }

    public static void addUsage(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(1, i, 0);
    }

    public static void addUsagePerChannel(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(2, i, 0);
    }

    public static int createMaterialTextureDef(FlatBufferBuilder flatBufferBuilder, int i, int i2, int i3) {
        flatBufferBuilder.startObject(3);
        addUsagePerChannel(flatBufferBuilder, i3);
        addUsage(flatBufferBuilder, i2);
        addName(flatBufferBuilder, i);
        return endMaterialTextureDef(flatBufferBuilder);
    }

    public static int createUsagePerChannelVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addInt(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int endMaterialTextureDef(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static MaterialTextureDef getRootAsMaterialTextureDef(ByteBuffer byteBuffer) {
        return getRootAsMaterialTextureDef(byteBuffer, new MaterialTextureDef());
    }

    public static MaterialTextureDef getRootAsMaterialTextureDef(ByteBuffer byteBuffer, MaterialTextureDef materialTextureDef) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return materialTextureDef.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startMaterialTextureDef(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(3);
    }

    public static void startUsagePerChannelVector(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(4, i, 4);
    }

    public final MaterialTextureDef __assign(int i, ByteBuffer byteBuffer) {
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

    public final int usage() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return this.f6424bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    public final int usagePerChannel(int i) {
        int __offset = __offset(8);
        if (__offset != 0) {
            return this.f6424bb.getInt(__vector(__offset) + (i << 2));
        }
        return 0;
    }

    public final ByteBuffer usagePerChannelAsByteBuffer() {
        return __vector_as_bytebuffer(8, 4);
    }

    public final ByteBuffer usagePerChannelInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 8, 4);
    }

    public final int usagePerChannelLength() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }
}
