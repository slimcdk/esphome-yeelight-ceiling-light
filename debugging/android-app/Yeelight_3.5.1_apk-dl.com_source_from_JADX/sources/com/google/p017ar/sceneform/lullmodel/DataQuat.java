package com.google.p017ar.sceneform.lullmodel;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ar.sceneform.lullmodel.DataQuat */
public final class DataQuat extends Table {
    public static void addValue(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addStruct(0, i, 0);
    }

    public static int endDataQuat(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static DataQuat getRootAsDataQuat(ByteBuffer byteBuffer) {
        return getRootAsDataQuat(byteBuffer, new DataQuat());
    }

    public static DataQuat getRootAsDataQuat(ByteBuffer byteBuffer, DataQuat dataQuat) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return dataQuat.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startDataQuat(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(1);
    }

    public final DataQuat __assign(int i, ByteBuffer byteBuffer) {
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

    public final Quat value() {
        return value(new Quat());
    }

    public final Quat value(Quat quat) {
        int __offset = __offset(4);
        if (__offset != 0) {
            return quat.__assign(__offset + this.bb_pos, this.f4160bb);
        }
        return null;
    }
}
