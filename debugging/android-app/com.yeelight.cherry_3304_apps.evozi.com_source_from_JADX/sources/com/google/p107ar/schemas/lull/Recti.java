package com.google.p107ar.schemas.lull;

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
        this.f6423bb = byteBuffer;
    }

    /* renamed from: h */
    public final int mo16717h() {
        return this.f6423bb.getInt(this.bb_pos + 12);
    }

    /* renamed from: w */
    public final int mo16718w() {
        return this.f6423bb.getInt(this.bb_pos + 8);
    }

    /* renamed from: x */
    public final int mo16719x() {
        return this.f6423bb.getInt(this.bb_pos);
    }

    /* renamed from: y */
    public final int mo16720y() {
        return this.f6423bb.getInt(this.bb_pos + 4);
    }
}
