package com.google.p107ar.schemas.lull;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Struct;
import java.nio.ByteBuffer;

/* renamed from: com.google.ar.schemas.lull.Mat4x3 */
public final class Mat4x3 extends Struct {
    public static int createMat4x3(FlatBufferBuilder flatBufferBuilder, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12) {
        flatBufferBuilder.prep(4, 48);
        flatBufferBuilder.prep(4, 16);
        flatBufferBuilder.putFloat(f12);
        flatBufferBuilder.putFloat(f11);
        flatBufferBuilder.putFloat(f10);
        flatBufferBuilder.putFloat(f9);
        flatBufferBuilder.prep(4, 16);
        flatBufferBuilder.putFloat(f8);
        flatBufferBuilder.putFloat(f7);
        flatBufferBuilder.putFloat(f6);
        flatBufferBuilder.putFloat(f5);
        flatBufferBuilder.prep(4, 16);
        flatBufferBuilder.putFloat(f4);
        flatBufferBuilder.putFloat(f3);
        flatBufferBuilder.putFloat(f2);
        flatBufferBuilder.putFloat(f);
        return flatBufferBuilder.offset();
    }

    public final Mat4x3 __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public final void __init(int i, ByteBuffer byteBuffer) {
        this.bb_pos = i;
        this.f6423bb = byteBuffer;
    }

    /* renamed from: c0 */
    public final Vec4 mo16556c0() {
        return mo16557c0(new Vec4());
    }

    /* renamed from: c0 */
    public final Vec4 mo16557c0(Vec4 vec4) {
        return vec4.__assign(this.bb_pos, this.f6423bb);
    }

    /* renamed from: c1 */
    public final Vec4 mo16558c1() {
        return mo16559c1(new Vec4());
    }

    /* renamed from: c1 */
    public final Vec4 mo16559c1(Vec4 vec4) {
        return vec4.__assign(this.bb_pos + 16, this.f6423bb);
    }

    /* renamed from: c2 */
    public final Vec4 mo16560c2() {
        return mo16561c2(new Vec4());
    }

    /* renamed from: c2 */
    public final Vec4 mo16561c2(Vec4 vec4) {
        return vec4.__assign(this.bb_pos + 32, this.f6423bb);
    }
}