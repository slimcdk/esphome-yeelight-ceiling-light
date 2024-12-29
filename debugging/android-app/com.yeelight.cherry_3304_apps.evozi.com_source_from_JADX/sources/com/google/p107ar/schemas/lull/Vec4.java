package com.google.p107ar.schemas.lull;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Struct;
import java.nio.ByteBuffer;

/* renamed from: com.google.ar.schemas.lull.Vec4 */
public final class Vec4 extends Struct {
    public static int createVec4(FlatBufferBuilder flatBufferBuilder, float f, float f2, float f3, float f4) {
        flatBufferBuilder.prep(4, 16);
        flatBufferBuilder.putFloat(f4);
        flatBufferBuilder.putFloat(f3);
        flatBufferBuilder.putFloat(f2);
        flatBufferBuilder.putFloat(f);
        return flatBufferBuilder.offset();
    }

    public final Vec4 __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public final void __init(int i, ByteBuffer byteBuffer) {
        this.bb_pos = i;
        this.f6423bb = byteBuffer;
    }

    /* renamed from: w */
    public final float mo16788w() {
        return this.f6423bb.getFloat(this.bb_pos + 12);
    }

    /* renamed from: x */
    public final float mo16789x() {
        return this.f6423bb.getFloat(this.bb_pos);
    }

    /* renamed from: y */
    public final float mo16790y() {
        return this.f6423bb.getFloat(this.bb_pos + 4);
    }

    /* renamed from: z */
    public final float mo16791z() {
        return this.f6423bb.getFloat(this.bb_pos + 8);
    }
}
