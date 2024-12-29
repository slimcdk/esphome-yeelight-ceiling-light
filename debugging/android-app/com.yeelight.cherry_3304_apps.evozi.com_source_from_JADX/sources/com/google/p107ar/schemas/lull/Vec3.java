package com.google.p107ar.schemas.lull;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Struct;
import java.nio.ByteBuffer;

/* renamed from: com.google.ar.schemas.lull.Vec3 */
public final class Vec3 extends Struct {
    public static int createVec3(FlatBufferBuilder flatBufferBuilder, float f, float f2, float f3) {
        flatBufferBuilder.prep(4, 12);
        flatBufferBuilder.putFloat(f3);
        flatBufferBuilder.putFloat(f2);
        flatBufferBuilder.putFloat(f);
        return flatBufferBuilder.offset();
    }

    public final Vec3 __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public final void __init(int i, ByteBuffer byteBuffer) {
        this.bb_pos = i;
        this.f6423bb = byteBuffer;
    }

    /* renamed from: x */
    public final float mo16783x() {
        return this.f6423bb.getFloat(this.bb_pos);
    }

    /* renamed from: y */
    public final float mo16784y() {
        return this.f6423bb.getFloat(this.bb_pos + 4);
    }

    /* renamed from: z */
    public final float mo16785z() {
        return this.f6423bb.getFloat(this.bb_pos + 8);
    }
}
