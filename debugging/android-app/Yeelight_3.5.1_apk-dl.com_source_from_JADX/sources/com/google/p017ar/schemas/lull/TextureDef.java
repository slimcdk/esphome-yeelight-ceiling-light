package com.google.p017ar.schemas.lull;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ar.schemas.lull.TextureDef */
public final class TextureDef extends Table {
    public static void addData(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(2, i, 0);
    }

    public static void addFile(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(1, i, 0);
    }

    public static void addGenerateMipmaps(FlatBufferBuilder flatBufferBuilder, boolean z) {
        flatBufferBuilder.addBoolean(3, z, false);
    }

    public static void addIsRgbm(FlatBufferBuilder flatBufferBuilder, boolean z) {
        flatBufferBuilder.addBoolean(11, z, false);
    }

    public static void addMagFilter(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addShort(6, (short) i, 1);
    }

    public static void addMinFilter(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addShort(5, (short) i, 4);
    }

    public static void addName(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(0, i, 0);
    }

    public static void addPremultiplyAlpha(FlatBufferBuilder flatBufferBuilder, boolean z) {
        flatBufferBuilder.addBoolean(4, z, false);
    }

    public static void addTargetType(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addShort(10, (short) i, 0);
    }

    public static void addWrapR(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addShort(9, (short) i, 4);
    }

    public static void addWrapS(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addShort(7, (short) i, 4);
    }

    public static void addWrapT(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addShort(8, (short) i, 4);
    }

    public static int createDataVector(FlatBufferBuilder flatBufferBuilder, byte[] bArr) {
        flatBufferBuilder.startVector(1, bArr.length, 1);
        for (int length = bArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addByte(bArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createTextureDef(FlatBufferBuilder flatBufferBuilder, int i, int i2, int i3, boolean z, boolean z2, int i4, int i5, int i6, int i7, int i8, int i9, boolean z3) {
        flatBufferBuilder.startObject(12);
        addData(flatBufferBuilder, i3);
        addFile(flatBufferBuilder, i2);
        addName(flatBufferBuilder, i);
        addTargetType(flatBufferBuilder, i9);
        addWrapR(flatBufferBuilder, i8);
        addWrapT(flatBufferBuilder, i7);
        addWrapS(flatBufferBuilder, i6);
        addMagFilter(flatBufferBuilder, i5);
        addMinFilter(flatBufferBuilder, i4);
        addIsRgbm(flatBufferBuilder, z3);
        addPremultiplyAlpha(flatBufferBuilder, z2);
        addGenerateMipmaps(flatBufferBuilder, z);
        return endTextureDef(flatBufferBuilder);
    }

    public static int endTextureDef(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static TextureDef getRootAsTextureDef(ByteBuffer byteBuffer) {
        return getRootAsTextureDef(byteBuffer, new TextureDef());
    }

    public static TextureDef getRootAsTextureDef(ByteBuffer byteBuffer, TextureDef textureDef) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return textureDef.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startDataVector(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(1, i, 1);
    }

    public static void startTextureDef(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(12);
    }

    public final TextureDef __assign(int i, ByteBuffer byteBuffer) {
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
        int __offset = __offset(8);
        if (__offset != 0) {
            return this.f4160bb.get(__vector(__offset) + i) & 255;
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

    public final boolean generateMipmaps() {
        int __offset = __offset(10);
        return (__offset == 0 || this.f4160bb.get(__offset + this.bb_pos) == 0) ? false : true;
    }

    public final boolean isRgbm() {
        int __offset = __offset(26);
        return (__offset == 0 || this.f4160bb.get(__offset + this.bb_pos) == 0) ? false : true;
    }

    public final int magFilter() {
        int __offset = __offset(16);
        if (__offset != 0) {
            return this.f4160bb.getShort(__offset + this.bb_pos) & 65535;
        }
        return 1;
    }

    public final int minFilter() {
        int __offset = __offset(14);
        if (__offset != 0) {
            return this.f4160bb.getShort(__offset + this.bb_pos) & 65535;
        }
        return 4;
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

    public final boolean premultiplyAlpha() {
        int __offset = __offset(12);
        return (__offset == 0 || this.f4160bb.get(__offset + this.bb_pos) == 0) ? false : true;
    }

    public final int targetType() {
        int __offset = __offset(24);
        if (__offset != 0) {
            return this.f4160bb.getShort(__offset + this.bb_pos) & 65535;
        }
        return 0;
    }

    public final int wrapR() {
        int __offset = __offset(22);
        if (__offset != 0) {
            return this.f4160bb.getShort(__offset + this.bb_pos) & 65535;
        }
        return 4;
    }

    public final int wrapS() {
        int __offset = __offset(18);
        if (__offset != 0) {
            return this.f4160bb.getShort(__offset + this.bb_pos) & 65535;
        }
        return 4;
    }

    public final int wrapT() {
        int __offset = __offset(20);
        if (__offset != 0) {
            return this.f4160bb.getShort(__offset + this.bb_pos) & 65535;
        }
        return 4;
    }
}
