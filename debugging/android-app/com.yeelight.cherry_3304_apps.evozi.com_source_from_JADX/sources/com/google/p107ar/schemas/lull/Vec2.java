package com.google.p107ar.schemas.lull;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Struct;
import java.nio.ByteBuffer;

/* renamed from: com.google.ar.schemas.lull.Vec2 */
public final class Vec2 extends Struct {
    public static int createVec2(FlatBufferBuilder flatBufferBuilder, float f, float f2) {
        flatBufferBuilder.prep(4, 8);
        flatBufferBuilder.putFloat(f2);
        flatBufferBuilder.putFloat(f);
        return flatBufferBuilder.offset();
    }

    public final Vec2 __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public final void __init(int i, ByteBuffer byteBuffer) {
        this.bb_pos = i;
        this.f6423bb = byteBuffer;
    }

    /* renamed from: x */
    public final float mo16775x() {
        return this.f6423bb.getFloat(this.bb_pos);
    }

    /* renamed from: y */
    public final float mo16776y() {
        return this.f6423bb.getFloat(this.bb_pos + 4);
    }
}
