package com.google.p017ar.schemas.lull;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ar.schemas.lull.MaterialDef */
public final class MaterialDef extends Table {
    public static void addName(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(0, i, 0);
    }

    public static void addProperties(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(1, i, 0);
    }

    public static void addTextures(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(2, i, 0);
    }

    public static int createMaterialDef(FlatBufferBuilder flatBufferBuilder, int i, int i2, int i3) {
        flatBufferBuilder.startObject(3);
        addTextures(flatBufferBuilder, i3);
        addProperties(flatBufferBuilder, i2);
        addName(flatBufferBuilder, i);
        return endMaterialDef(flatBufferBuilder);
    }

    public static int createTexturesVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int endMaterialDef(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static MaterialDef getRootAsMaterialDef(ByteBuffer byteBuffer) {
        return getRootAsMaterialDef(byteBuffer, new MaterialDef());
    }

    public static MaterialDef getRootAsMaterialDef(ByteBuffer byteBuffer, MaterialDef materialDef) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return materialDef.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startMaterialDef(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(3);
    }

    public static void startTexturesVector(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(4, i, 4);
    }

    public final MaterialDef __assign(int i, ByteBuffer byteBuffer) {
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

    public final VariantMapDef properties() {
        return properties(new VariantMapDef());
    }

    public final VariantMapDef properties(VariantMapDef variantMapDef) {
        int __offset = __offset(6);
        if (__offset != 0) {
            return variantMapDef.__assign(__indirect(__offset + this.bb_pos), this.f4160bb);
        }
        return null;
    }

    public final MaterialTextureDef textures(int i) {
        return textures(new MaterialTextureDef(), i);
    }

    public final MaterialTextureDef textures(MaterialTextureDef materialTextureDef, int i) {
        int __offset = __offset(8);
        if (__offset != 0) {
            return materialTextureDef.__assign(__indirect(__vector(__offset) + (i << 2)), this.f4160bb);
        }
        return null;
    }

    public final int texturesLength() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }
}
