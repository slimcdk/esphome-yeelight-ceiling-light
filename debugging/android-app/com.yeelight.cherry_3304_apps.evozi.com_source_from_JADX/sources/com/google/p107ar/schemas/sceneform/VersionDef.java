package com.google.p107ar.schemas.sceneform;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ar.schemas.sceneform.VersionDef */
public final class VersionDef extends Table {
    public static void addMajorVersion(FlatBufferBuilder flatBufferBuilder, float f) {
        flatBufferBuilder.addFloat(0, f, 0.0d);
    }

    public static void addMinorVersion(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(1, i, 0);
    }

    public static int createVersionDef(FlatBufferBuilder flatBufferBuilder, float f, int i) {
        flatBufferBuilder.startObject(2);
        addMinorVersion(flatBufferBuilder, i);
        addMajorVersion(flatBufferBuilder, f);
        return endVersionDef(flatBufferBuilder);
    }

    public static int endVersionDef(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static VersionDef getRootAsVersionDef(ByteBuffer byteBuffer) {
        return getRootAsVersionDef(byteBuffer, new VersionDef());
    }

    public static VersionDef getRootAsVersionDef(ByteBuffer byteBuffer, VersionDef versionDef) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return versionDef.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startVersionDef(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(2);
    }

    public final VersionDef __assign(int i, ByteBuffer byteBuffer) {
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

    public final float majorVersion() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return this.f6424bb.getFloat(__offset + this.bb_pos);
        }
        return 0.0f;
    }

    public final int minorVersion() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return this.f6424bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }
}
