package com.google.p107ar.sceneform.lullmodel;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ar.sceneform.lullmodel.SkeletonDef */
public final class SkeletonDef extends Table {
    public static void addBoneNames(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(0, i, 0);
    }

    public static void addBoneParents(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(1, i, 0);
    }

    public static void addBoneTransforms(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(2, i, 0);
    }

    public static int createBoneNamesVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createBoneParentsVector(FlatBufferBuilder flatBufferBuilder, byte[] bArr) {
        flatBufferBuilder.startVector(1, bArr.length, 1);
        for (int length = bArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addByte(bArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createSkeletonDef(FlatBufferBuilder flatBufferBuilder, int i, int i2, int i3) {
        flatBufferBuilder.startObject(5);
        addBoneTransforms(flatBufferBuilder, i3);
        addBoneParents(flatBufferBuilder, i2);
        addBoneNames(flatBufferBuilder, i);
        return endSkeletonDef(flatBufferBuilder);
    }

    public static int endSkeletonDef(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static SkeletonDef getRootAsSkeletonDef(ByteBuffer byteBuffer) {
        return getRootAsSkeletonDef(byteBuffer, new SkeletonDef());
    }

    public static SkeletonDef getRootAsSkeletonDef(ByteBuffer byteBuffer, SkeletonDef skeletonDef) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return skeletonDef.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startBoneNamesVector(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(4, i, 4);
    }

    public static void startBoneParentsVector(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(1, i, 1);
    }

    public static void startBoneTransformsVector(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(48, i, 4);
    }

    public static void startSkeletonDef(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(5);
    }

    public final SkeletonDef __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public final void __init(int i, ByteBuffer byteBuffer) {
        this.bb_pos = i;
        this.f6424bb = byteBuffer;
        int i2 = i - byteBuffer.getInt(i);
        this.vtable_start = i2;
        this.vtable_size = this.f6424bb.getShort(i2);
    }

    public final String boneNames(int i) {
        int __offset = __offset(4);
        if (__offset != 0) {
            return __string(__vector(__offset) + (i << 2));
        }
        return null;
    }

    public final int boneNamesLength() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    public final int boneParents(int i) {
        int __offset = __offset(6);
        if (__offset != 0) {
            return this.f6424bb.get(__vector(__offset) + i) & 255;
        }
        return 0;
    }

    public final ByteBuffer boneParentsAsByteBuffer() {
        return __vector_as_bytebuffer(6, 1);
    }

    public final ByteBuffer boneParentsInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 6, 1);
    }

    public final int boneParentsLength() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    public final Mat4x3 boneTransforms(int i) {
        return boneTransforms(new Mat4x3(), i);
    }

    public final Mat4x3 boneTransforms(Mat4x3 mat4x3, int i) {
        int __offset = __offset(8);
        if (__offset != 0) {
            return mat4x3.__assign(__vector(__offset) + (i * 48), this.f6424bb);
        }
        return null;
    }

    public final int boneTransformsLength() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }
}
