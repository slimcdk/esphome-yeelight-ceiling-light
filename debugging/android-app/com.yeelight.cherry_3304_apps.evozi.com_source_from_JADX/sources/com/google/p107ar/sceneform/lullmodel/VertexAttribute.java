package com.google.p107ar.sceneform.lullmodel;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Struct;
import java.nio.ByteBuffer;

/* renamed from: com.google.ar.sceneform.lullmodel.VertexAttribute */
public final class VertexAttribute extends Struct {
    public static int createVertexAttribute(FlatBufferBuilder flatBufferBuilder, int i, int i2) {
        flatBufferBuilder.prep(4, 8);
        flatBufferBuilder.putInt(i2);
        flatBufferBuilder.putInt(i);
        return flatBufferBuilder.offset();
    }

    public final VertexAttribute __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public final void __init(int i, ByteBuffer byteBuffer) {
        this.bb_pos = i;
        this.f6423bb = byteBuffer;
    }

    public final int type() {
        return this.f6423bb.getInt(this.bb_pos + 4);
    }

    public final int usage() {
        return this.f6423bb.getInt(this.bb_pos);
    }
}
