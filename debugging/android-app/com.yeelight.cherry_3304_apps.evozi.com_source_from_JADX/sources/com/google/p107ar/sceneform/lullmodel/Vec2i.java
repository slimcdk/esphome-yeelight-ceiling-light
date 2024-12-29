package com.google.p107ar.sceneform.lullmodel;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Struct;
import java.nio.ByteBuffer;

/* renamed from: com.google.ar.sceneform.lullmodel.Vec2i */
public final class Vec2i extends Struct {
    public static int createVec2i(FlatBufferBuilder flatBufferBuilder, int i, int i2) {
        flatBufferBuilder.prep(4, 8);
        flatBufferBuilder.putInt(i2);
        flatBufferBuilder.putInt(i);
        return flatBufferBuilder.offset();
    }

    public final Vec2i __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public final void __init(int i, ByteBuffer byteBuffer) {
        this.bb_pos = i;
        this.f6423bb = byteBuffer;
    }

    /* renamed from: x */
    public final int mo15753x() {
        return this.f6423bb.getInt(this.bb_pos);
    }

    /* renamed from: y */
    public final int mo15754y() {
        return this.f6423bb.getInt(this.bb_pos + 4);
    }
}
