package com.google.p017ar.sceneform.lullmodel;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ar.sceneform.lullmodel.VariantArrayDef */
public final class VariantArrayDef extends Table {
    public static void addValues(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(0, i, 0);
    }

    public static int createValuesVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createVariantArrayDef(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startObject(1);
        addValues(flatBufferBuilder, i);
        return endVariantArrayDef(flatBufferBuilder);
    }

    public static int endVariantArrayDef(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static VariantArrayDef getRootAsVariantArrayDef(ByteBuffer byteBuffer) {
        return getRootAsVariantArrayDef(byteBuffer, new VariantArrayDef());
    }

    public static VariantArrayDef getRootAsVariantArrayDef(ByteBuffer byteBuffer, VariantArrayDef variantArrayDef) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return variantArrayDef.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startValuesVector(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(4, i, 4);
    }

    public static void startVariantArrayDef(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(1);
    }

    public final VariantArrayDef __assign(int i, ByteBuffer byteBuffer) {
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

    public final VariantArrayDefImpl values(int i) {
        return values(new VariantArrayDefImpl(), i);
    }

    public final VariantArrayDefImpl values(VariantArrayDefImpl variantArrayDefImpl, int i) {
        int __offset = __offset(4);
        if (__offset != 0) {
            return variantArrayDefImpl.__assign(__indirect(__vector(__offset) + (i << 2)), this.f4160bb);
        }
        return null;
    }

    public final int valuesLength() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }
}
