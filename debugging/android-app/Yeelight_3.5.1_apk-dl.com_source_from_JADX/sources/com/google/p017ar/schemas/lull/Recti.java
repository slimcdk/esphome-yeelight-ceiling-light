package com.google.p017ar.schemas.lull;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Struct;
import java.nio.ByteBuffer;

/* renamed from: com.google.ar.schemas.lull.Recti */
public final class Recti extends Struct {
    public static int createRecti(FlatBufferBuilder flatBufferBuilder, int i, int i2, int i3, int i4) {
        flatBufferBuilder.prep(4, 16);
        flatBufferBuilder.putInt(i4);
        flatBufferBuilder.putInt(i3);
        flatBufferBuilder.putInt(i2);
        flatBufferBuilder.putInt(i);
        return flatBufferBuilder.offset();
    }

    public final Recti __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public final void __init(int i, ByteBuffer byteBuffer) {
        this.bb_pos = i;
        this.f4159bb = byteBuffer;
    }

    /* renamed from: h */
    public final int mo18149h() {
        return this.f4159bb.getInt(this.bb_pos + 12);
    }

    /* renamed from: w */
    public final int mo18150w() {
        return this.f4159bb.getInt(this.bb_pos + 8);
    }

    /* renamed from: x */
    public final int mo18151x() {
        return this.f4159bb.getInt(this.bb_pos);
    }

    /* renamed from: y */
    public final int mo18152y() {
        return this.f4159bb.getInt(this.bb_pos + 4);
    }
}