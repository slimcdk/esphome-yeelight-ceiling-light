package com.google.p107ar.schemas.lull;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.ar.schemas.lull.ModelPipelineImportDef */
public final class ModelPipelineImportDef extends Table {
    public static void addAxisSystem(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(4, i, -1);
    }

    public static void addCmPerUnit(FlatBufferBuilder flatBufferBuilder, float f) {
        flatBufferBuilder.addFloat(13, f, 0.0d);
    }

    public static void addEnsureVertexOrientationWNotZero(FlatBufferBuilder flatBufferBuilder, boolean z) {
        flatBufferBuilder.addBoolean(12, z, false);
    }

    public static void addFile(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(1, i, 0);
    }

    public static void addFixInfacingNormals(FlatBufferBuilder flatBufferBuilder, boolean z) {
        flatBufferBuilder.addBoolean(11, z, true);
    }

    public static void addFlattenHierarchyAndTransformVerticesToRootSpace(FlatBufferBuilder flatBufferBuilder, boolean z) {
        flatBufferBuilder.addBoolean(9, z, false);
    }

    public static void addFlipTextureCoordinates(FlatBufferBuilder flatBufferBuilder, boolean z) {
        flatBufferBuilder.addBoolean(8, z, false);
    }

    public static void addMaxBoneWeights(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addInt(6, i, 4);
    }

    public static void addName(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(0, i, 0);
    }

    public static void addRecenter(FlatBufferBuilder flatBufferBuilder, boolean z) {
        flatBufferBuilder.addBoolean(2, z, false);
    }

    public static void addReportErrorsToStdout(FlatBufferBuilder flatBufferBuilder, boolean z) {
        flatBufferBuilder.addBoolean(7, z, false);
    }

    public static void addScale(FlatBufferBuilder flatBufferBuilder, float f) {
        flatBufferBuilder.addFloat(3, f, 1.0d);
    }

    public static void addSmoothingAngle(FlatBufferBuilder flatBufferBuilder, float f) {
        flatBufferBuilder.addFloat(5, f, 45.0d);
    }

    public static void addTargetMeshes(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.addOffset(14, i, 0);
    }

    public static void addUseSpecularGlossinessTexturesIfPresent(FlatBufferBuilder flatBufferBuilder, boolean z) {
        flatBufferBuilder.addBoolean(10, z, false);
    }

    public static int createModelPipelineImportDef(FlatBufferBuilder flatBufferBuilder, int i, int i2, boolean z, float f, int i3, float f2, int i4, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, float f3, int i5) {
        FlatBufferBuilder flatBufferBuilder2 = flatBufferBuilder;
        flatBufferBuilder.startObject(15);
        addTargetMeshes(flatBufferBuilder, i5);
        addCmPerUnit(flatBufferBuilder, f3);
        int i6 = i4;
        addMaxBoneWeights(flatBufferBuilder, i4);
        float f4 = f2;
        addSmoothingAngle(flatBufferBuilder, f2);
        int i7 = i3;
        addAxisSystem(flatBufferBuilder, i3);
        float f5 = f;
        addScale(flatBufferBuilder, f);
        int i8 = i2;
        addFile(flatBufferBuilder, i2);
        addName(flatBufferBuilder, i);
        boolean z8 = z7;
        addEnsureVertexOrientationWNotZero(flatBufferBuilder, z7);
        boolean z9 = z6;
        addFixInfacingNormals(flatBufferBuilder, z6);
        boolean z10 = z5;
        addUseSpecularGlossinessTexturesIfPresent(flatBufferBuilder, z5);
        boolean z11 = z4;
        addFlattenHierarchyAndTransformVerticesToRootSpace(flatBufferBuilder, z4);
        boolean z12 = z3;
        addFlipTextureCoordinates(flatBufferBuilder, z3);
        boolean z13 = z2;
        addReportErrorsToStdout(flatBufferBuilder, z2);
        boolean z14 = z;
        addRecenter(flatBufferBuilder, z);
        return endModelPipelineImportDef(flatBufferBuilder);
    }

    public static int createTargetMeshesVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int endModelPipelineImportDef(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endObject();
    }

    public static ModelPipelineImportDef getRootAsModelPipelineImportDef(ByteBuffer byteBuffer) {
        return getRootAsModelPipelineImportDef(byteBuffer, new ModelPipelineImportDef());
    }

    public static ModelPipelineImportDef getRootAsModelPipelineImportDef(ByteBuffer byteBuffer, ModelPipelineImportDef modelPipelineImportDef) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return modelPipelineImportDef.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startModelPipelineImportDef(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startObject(15);
    }

    public static void startTargetMeshesVector(FlatBufferBuilder flatBufferBuilder, int i) {
        flatBufferBuilder.startVector(4, i, 4);
    }

    public final ModelPipelineImportDef __assign(int i, ByteBuffer byteBuffer) {
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

    public final int axisSystem() {
        int __offset = __offset(12);
        if (__offset != 0) {
            return this.f6424bb.getInt(__offset + this.bb_pos);
        }
        return -1;
    }

    public final float cmPerUnit() {
        int __offset = __offset(30);
        if (__offset != 0) {
            return this.f6424bb.getFloat(__offset + this.bb_pos);
        }
        return 0.0f;
    }

    public final boolean ensureVertexOrientationWNotZero() {
        int __offset = __offset(28);
        return (__offset == 0 || this.f6424bb.get(__offset + this.bb_pos) == 0) ? false : true;
    }

    public final String file() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public final ByteBuffer fileAsByteBuffer() {
        return __vector_as_bytebuffer(6, 1);
    }

    public final ByteBuffer fileInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 6, 1);
    }

    public final boolean fixInfacingNormals() {
        int __offset = __offset(26);
        return __offset == 0 || this.f6424bb.get(__offset + this.bb_pos) != 0;
    }

    public final boolean flattenHierarchyAndTransformVerticesToRootSpace() {
        int __offset = __offset(22);
        return (__offset == 0 || this.f6424bb.get(__offset + this.bb_pos) == 0) ? false : true;
    }

    public final boolean flipTextureCoordinates() {
        int __offset = __offset(20);
        return (__offset == 0 || this.f6424bb.get(__offset + this.bb_pos) == 0) ? false : true;
    }

    public final int maxBoneWeights() {
        int __offset = __offset(16);
        if (__offset != 0) {
            return this.f6424bb.getInt(__offset + this.bb_pos);
        }
        return 4;
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

    public final boolean recenter() {
        int __offset = __offset(8);
        return (__offset == 0 || this.f6424bb.get(__offset + this.bb_pos) == 0) ? false : true;
    }

    public final boolean reportErrorsToStdout() {
        int __offset = __offset(18);
        return (__offset == 0 || this.f6424bb.get(__offset + this.bb_pos) == 0) ? false : true;
    }

    public final float scale() {
        int __offset = __offset(10);
        if (__offset != 0) {
            return this.f6424bb.getFloat(__offset + this.bb_pos);
        }
        return 1.0f;
    }

    public final float smoothingAngle() {
        int __offset = __offset(14);
        if (__offset != 0) {
            return this.f6424bb.getFloat(__offset + this.bb_pos);
        }
        return 45.0f;
    }

    public final String targetMeshes(int i) {
        int __offset = __offset(32);
        if (__offset != 0) {
            return __string(__vector(__offset) + (i << 2));
        }
        return null;
    }

    public final int targetMeshesLength() {
        int __offset = __offset(32);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    public final boolean useSpecularGlossinessTexturesIfPresent() {
        int __offset = __offset(24);
        return (__offset == 0 || this.f6424bb.get(__offset + this.bb_pos) == 0) ? false : true;
    }
}
