package com.google.p017ar.sceneform.lullmodel;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ar.sceneform.lullmodel.VariantArrayDefImpl */
public final class VariantArrayDefImpl extends Table {
    public static void addValue(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(1, i, 0);
    }

    public static void addValueType(FlatBufferBuilder flatBufferBuilder, byte b) {
        flatBufferBuilder.addByte(0, b, 0);
    }

    public static int createVariantArrayDefImpl(FlatBufferBuilder flatBufferBuilder, byte b, int i) {
        flatBufferBuilder.startObject(2);
        addValue(flatBufferBuilder, i);
        addValueType(flatBufferBuilder, b);
        return endVariantArrayDefImpl(flatBufferBuilder);
    }

    public static int endVariantArrayDefImpl(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static VariantArrayDefImpl getRootAsVariantArrayDefImpl(ByteBuffer byteBuffer) {
        return getRootAsVariantArrayDefImpl(byteBuffer, new VariantArrayDefImpl());
    }

    public static VariantArrayDefImpl getRootAsVariantArrayDefImpl(ByteBuffer byteBuffer, VariantArrayDefImpl variantArrayDefImpl) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return variantArrayDefImpl.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startVariantArrayDefImpl(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(2);
    }

    public final VariantArrayDefImpl __assign(int i, ByteBuffer byteBuffer) {
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

    public final Table value(Table table) {
        int __offset = __offset(6);
        if (__offset != 0) {
            return __union(table, __offset);
        }
        return null;
    }

    public final byte valueType() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return this.f4160bb.get(__offset + this.bb_pos);
        }
        return 0;
    }
}
