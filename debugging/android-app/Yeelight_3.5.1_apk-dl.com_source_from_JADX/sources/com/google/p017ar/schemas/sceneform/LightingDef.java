package com.google.p017ar.schemas.sceneform;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import com.google.p017ar.schemas.lull.Vec3;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ar.schemas.sceneform.LightingDef */
public final class LightingDef extends Table {
    public static void addCubeLevels(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(2, i, 0);
    }

    public static void addName(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(0, i, 0);
    }

    public static void addScale(FlatBufferBuilder flatBufferBuilder, float f) {
        flatBufferBuilder.addFloat(1, f, 0.0d);
    }

    public static void addShCoefficients(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(3, i, 0);
    }

    public static int createCubeLevelsVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createLightingDef(FlatBufferBuilder flatBufferBuilder, int i, float f, int i2, int i3) {
        flatBufferBuilder.startObject(4);
        addShCoefficients(flatBufferBuilder, i3);
        addCubeLevels(flatBufferBuilder, i2);
        addScale(flatBufferBuilder, f);
        addName(flatBufferBuilder, i);
        return endLightingDef(flatBufferBuilder);
    }

    public static int endLightingDef(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static LightingDef getRootAsLightingDef(ByteBuffer byteBuffer) {
        return getRootAsLightingDef(byteBuffer, new LightingDef());
    }

    public static LightingDef getRootAsLightingDef(ByteBuffer byteBuffer, LightingDef lightingDef) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return lightingDef.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startCubeLevelsVector(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(4, i, 4);
    }

    public static void startLightingDef(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(4);
    }

    public static void startShCoefficientsVector(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(12, i, 4);
    }

    public final LightingDef __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public final void __init(int i, ByteBuffer byteBuffer) {
        this.bb_pos = i;
        this.f4160bb = byteBuffer;
        int i2 = i - byteBuffer.getInt(i);
        this.vtable_start = i2;
        this.vtable_size = this.f4160bb.getShort(i2);
    }

    public final LightingCubeDef cubeLevels(int i) {
        return cubeLevels(new LightingCubeDef(), i);
    }

    public final LightingCubeDef cubeLevels(LightingCubeDef lightingCubeDef, int i) {
        int __offset = __offset(8);
        if (__offset != 0) {
            return lightingCubeDef.__assign(__indirect(__vector(__offset) + (i << 2)), this.f4160bb);
        }
        return null;
    }

    public final int cubeLevelsLength() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    public final String name() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public final ByteBuffer nameAsByteBuffer() {
        return __vector_as_bytebuffer(4, 1);
    }

    public final ByteBuffer nameInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 1);
    }

    public final float scale() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return this.f4160bb.getFloat(__offset + this.bb_pos);
        }
        return 0.0f;
    }

    public final Vec3 shCoefficients(int i) {
        return shCoefficients(new Vec3(), i);
    }

    public final Vec3 shCoefficients(Vec3 vec3, int i) {
        int __offset = __offset(10);
        if (__offset != 0) {
            return vec3.__assign(__vector(__offset) + (i * 12), this.f4160bb);
        }
        return null;
    }

    public final int shCoefficientsLength() {
        int __offset = __offset(10);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }
}
