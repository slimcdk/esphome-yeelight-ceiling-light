package com.google.p107ar.schemas.lull;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Struct;
import java.nio.ByteBuffer;

/* renamed from: com.google.ar.schemas.lull.Quat */
public final class Quat extends Struct {
    public static int createQuat(FlatBufferBuilder flatBufferBuilder, float f, float f2, float f3, float f4) {
        flatBufferBuilder.prep(4, 16);
        flatBufferBuilder.putFloat(f4);
        flatBufferBuilder.putFloat(f3);
        flatBufferBuilder.putFloat(f2);
        flatBufferBuilder.putFloat(f);
        return flatBufferBuilder.offset();
    }

    public final Quat __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public final void __init(int i, ByteBuffer byteBuffer) {
        this.bb_pos = i;
        this.f6423bb = byteBuffer;
    }

    /* renamed from: w */
    public final float mo16705w() {
        return this.f6423bb.getFloat(this.bb_pos + 12);
    }

    /* renamed from: x */
    public final float mo16706x() {
        return this.f6423bb.getFloat(this.bb_pos);
    }

    /* renamed from: y */
    public final float mo16707y() {
        return this.f6423bb.getFloat(this.bb_pos + 4);
    }

    /* renamed from: z */
    public final float mo16708z() {
        return this.f6423bb.getFloat(this.bb_pos + 8);
    }
}
