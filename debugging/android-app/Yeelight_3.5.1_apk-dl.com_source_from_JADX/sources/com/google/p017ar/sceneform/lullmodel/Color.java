package com.google.p017ar.sceneform.lullmodel;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Struct;
import java.nio.ByteBuffer;

/* renamed from: com.google.ar.sceneform.lullmodel.Color */
public final class Color extends Struct {
    public static int createColor(FlatBufferBuilder flatBufferBuilder, float f, float f2, float f3, float f4) {
        flatBufferBuilder.prep(4, 16);
        flatBufferBuilder.putFloat(f4);
        flatBufferBuilder.putFloat(f3);
        flatBufferBuilder.putFloat(f2);
        flatBufferBuilder.putFloat(f);
        return flatBufferBuilder.offset();
    }

    public final Color __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public final void __init(int i, ByteBuffer byteBuffer) {
        this.bb_pos = i;
        this.f4159bb = byteBuffer;
    }

    /* renamed from: a */
    public final float mo16930a() {
        return this.f4159bb.getFloat(this.bb_pos + 12);
    }

    /* renamed from: b */
    public final float mo16931b() {
        return this.f4159bb.getFloat(this.bb_pos + 8);
    }

    /* renamed from: g */
    public final float mo16932g() {
        return this.f4159bb.getFloat(this.bb_pos + 4);
    }

    /* renamed from: r */
    public final float mo16933r() {
        return this.f4159bb.getFloat(this.bb_pos);
    }
}
