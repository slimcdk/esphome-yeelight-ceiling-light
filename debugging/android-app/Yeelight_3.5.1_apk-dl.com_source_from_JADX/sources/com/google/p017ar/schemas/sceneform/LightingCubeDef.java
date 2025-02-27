package com.google.p017ar.schemas.sceneform;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ar.schemas.sceneform.LightingCubeDef */
public final class LightingCubeDef extends Table {
    public static void addFaces(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(0, i, 0);
    }

    public static int createFacesVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createLightingCubeDef(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startObject(1);
        addFaces(flatBufferBuilder, i);
        return endLightingCubeDef(flatBufferBuilder);
    }

    public static int endLightingCubeDef(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static LightingCubeDef getRootAsLightingCubeDef(ByteBuffer byteBuffer) {
        return getRootAsLightingCubeDef(byteBuffer, new LightingCubeDef());
    }

    public static LightingCubeDef getRootAsLightingCubeDef(ByteBuffer byteBuffer, LightingCubeDef lightingCubeDef) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return lightingCubeDef.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startFacesVector(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(4, i, 4);
    }

    public static void startLightingCubeDef(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(1);
    }

    public final LightingCubeDef __assign(int i, ByteBuffer byteBuffer) {
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

    public final LightingCubeFaceDef faces(int i) {
        return faces(new LightingCubeFaceDef(), i);
    }

    public final LightingCubeFaceDef faces(LightingCubeFaceDef lightingCubeFaceDef, int i) {
        int __offset = __offset(4);
        if (__offset != 0) {
            return lightingCubeFaceDef.__assign(__indirect(__vector(__offset) + (i << 2)), this.f4160bb);
        }
        return null;
    }

    public final int facesLength() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }
}
