package com.google.p107ar.sceneform.lullmodel;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ar.sceneform.lullmodel.KeyVariantPairDef */
public final class KeyVariantPairDef extends Table {
    public static void addHashKey(FlatBufferBuilder flatBufferBuilder, long j) {
        flatBufferBuilder.addInt(1, (int) j, 0);
    }

    public static void addKey(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(0, i, 0);
    }

    public static void addValue(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(3, i, 0);
    }

    public static void addValueType(FlatBufferBuilder flatBufferBuilder, byte b) {
        flatBufferBuilder.addByte(2, b, 0);
    }

    public static int createKeyVariantPairDef(FlatBufferBuilder flatBufferBuilder, int i, long j, byte b, int i2) {
        flatBufferBuilder.startObject(4);
        addValue(flatBufferBuilder, i2);
        addHashKey(flatBufferBuilder, j);
        addKey(flatBufferBuilder, i);
        addValueType(flatBufferBuilder, b);
        return endKeyVariantPairDef(flatBufferBuilder);
    }

    public static int endKeyVariantPairDef(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static KeyVariantPairDef getRootAsKeyVariantPairDef(ByteBuffer byteBuffer) {
        return getRootAsKeyVariantPairDef(byteBuffer, new KeyVariantPairDef());
    }

    public static KeyVariantPairDef getRootAsKeyVariantPairDef(ByteBuffer byteBuffer, KeyVariantPairDef keyVariantPairDef) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return keyVariantPairDef.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startKeyVariantPairDef(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(4);
    }

    public final KeyVariantPairDef __assign(int i, ByteBuffer byteBuffer) {
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

    public final long hashKey() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return ((long) this.f6424bb.getInt(__offset + this.bb_pos)) & 4294967295L;
        }
        return 0;
    }

    public final String key() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public final ByteBuffer keyAsByteBuffer() {
        return __vector_as_bytebuffer(4, 1);
    }

    public final ByteBuffer keyInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 1);
    }

    public final Table value(Table table) {
        int __offset = __offset(10);
        if (__offset != 0) {
            return __union(table, __offset);
        }
        return null;
    }

    public final byte valueType() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return this.f6424bb.get(__offset + this.bb_pos);
        }
        return 0;
    }
}
