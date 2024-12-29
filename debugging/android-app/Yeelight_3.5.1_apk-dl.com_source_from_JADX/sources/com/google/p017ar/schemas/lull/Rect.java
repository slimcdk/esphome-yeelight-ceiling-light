package com.google.p017ar.schemas.lull;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Struct;
import java.nio.ByteBuffer;

/* renamed from: com.google.ar.schemas.lull.Rect */
public final class Rect extends Struct {
    public static int createRect(FlatBufferBuilder flatBufferBuilder, float f, float f2, float f3, float f4) {
        flatBufferBuilder.prep(4, 16);
        flatBufferBuilder.putFloat(f4);
        flatBufferBuilder.putFloat(f3);
        flatBufferBuilder.putFloat(f2);
        flatBufferBuilder.putFloat(f);
        return flatBufferBuilder.offset();
    }

    public final Rect __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public final void __init(int i, ByteBuffer byteBuffer) {
        this.bb_pos = i;
        this.f4159bb = byteBuffer;
    }

    /* renamed from: h */
    public final float mo18143h() {
        return this.f4159bb.getFloat(this.bb_pos + 12);
    }

    /* renamed from: w */
    public final float mo18144w() {
        return this.f4159bb.getFloat(this.bb_pos + 8);
    }

    /* renamed from: x */
    public final float mo18145x() {
        return this.f4159bb.getFloat(this.bb_pos);
    }

    /* renamed from: y */
    public final float mo18146y() {
        return this.f4159bb.getFloat(this.bb_pos + 4);
    }
}
