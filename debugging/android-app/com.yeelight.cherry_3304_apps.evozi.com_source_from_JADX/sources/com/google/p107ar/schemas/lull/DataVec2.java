package com.google.p107ar.schemas.lull;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ar.schemas.lull.DataVec2 */
public final class DataVec2 extends Table {
    public static void addValue(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addStruct(0, i, 0);
    }

    public static int endDataVec2(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static DataVec2 getRootAsDataVec2(ByteBuffer byteBuffer) {
        return getRootAsDataVec2(byteBuffer, new DataVec2());
    }

    public static DataVec2 getRootAsDataVec2(ByteBuffer byteBuffer, DataVec2 dataVec2) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return dataVec2.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startDataVec2(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(1);
    }

    public final DataVec2 __assign(int i, ByteBuffer byteBuffer) {
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

    public final Vec2 value() {
        return value(new Vec2());
    }

    public final Vec2 value(Vec2 vec2) {
        int __offset = __offset(4);
        if (__offset != 0) {
            return vec2.__assign(__offset + this.bb_pos, this.f6424bb);
        }
        return null;
    }
}
