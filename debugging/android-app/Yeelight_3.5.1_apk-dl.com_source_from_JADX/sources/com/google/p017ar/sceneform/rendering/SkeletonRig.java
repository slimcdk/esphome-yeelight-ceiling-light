package com.google.p017ar.sceneform.rendering;

import androidx.annotation.Nullable;
import com.google.p017ar.sceneform.math.Matrix;
import com.google.p017ar.schemas.lull.Mat4x3;
import com.google.p017ar.schemas.lull.ModelInstanceDef;
import com.google.p017ar.schemas.lull.SkeletonDef;
import com.google.p017ar.schemas.lull.Vec4;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: com.google.ar.sceneform.rendering.SkeletonRig */
public class SkeletonRig {
    private static final int BYTES_PER_BONE = 64;
    private static final int BYTES_PER_FLOAT = 4;
    protected static final int FLOATS_PER_BONE = 16;
    private static Factory factory = makeDefaultFactory();
    private final FloatBuffer materialBoneTransformsBuffer;
    private final ModelInstanceDef modelInstanceDef;
    private final SkeletonDef skeletonDef;

    /* renamed from: com.google.ar.sceneform.rendering.SkeletonRig$Factory */
    public static abstract class Factory {
        @Nullable
        public abstract SkeletonRig create(SkeletonDef skeletonDef, ModelInstanceDef modelInstanceDef);
    }

    /* renamed from: com.google.ar.sceneform.rendering.SkeletonRig$a */
    class C2115a extends Factory {
        C2115a() {
        }

        @Nullable
        public SkeletonRig create(SkeletonDef skeletonDef, ModelInstanceDef modelInstanceDef) {
            return new SkeletonRig(skeletonDef, modelInstanceDef);
        }
    }

    protected SkeletonRig(SkeletonRig skeletonRig) {
        this(skeletonRig.skeletonDef, skeletonRig.modelInstanceDef);
    }

    protected SkeletonRig(SkeletonDef skeletonDef2, ModelInstanceDef modelInstanceDef2) {
        this.skeletonDef = skeletonDef2;
        this.modelInstanceDef = modelInstanceDef2;
        FloatBuffer makeBufferForBones = makeBufferForBones(getMaterialBoneCount());
        this.materialBoneTransformsBuffer = makeBufferForBones;
        setBufferToIdentity(makeBufferForBones);
    }

    @Nullable
    public static SkeletonRig createInstance(SkeletonDef skeletonDef2, ModelInstanceDef modelInstanceDef2) {
        return factory.create(skeletonDef2, modelInstanceDef2);
    }

    protected static void initializeMatrix(float[] fArr, Mat4x3 mat4x3) {
        Vec4 vec4 = new Vec4();
        initializeRow(fArr, 0, mat4x3.mo17989c0(vec4));
        initializeRow(fArr, 1, mat4x3.mo17991c1(vec4));
        initializeRow(fArr, 2, mat4x3.mo17993c2(vec4));
        fArr[15] = 1.0f;
    }

    protected static void initializeRow(float[] fArr, int i, Vec4 vec4) {
        fArr[i + 0] = vec4.mo18221x();
        fArr[i + 4] = vec4.mo18222y();
        fArr[i + 8] = vec4.mo18223z();
        fArr[i + 12] = vec4.mo18220w();
    }

    protected static FloatBuffer makeBufferForBones(int i) {
        return ByteBuffer.allocateDirect(i * 64).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static Factory makeDefaultFactory() {
        return new C2115a();
    }

    private void setBufferToIdentity(FloatBuffer floatBuffer) {
        floatBuffer.rewind();
        while (floatBuffer.hasRemaining()) {
            floatBuffer.put(Matrix.IDENTITY_DATA);
        }
        floatBuffer.rewind();
    }

    public static void setFactory(Factory factory2) {
        factory = factory2;
    }

    public int getBoneCount() {
        return this.skeletonDef.boneNamesLength();
    }

    public String getBoneName(int i) {
        if (i < getBoneCount()) {
            return this.skeletonDef.boneNames(i);
        }
        throw new IndexOutOfBoundsException("boneIndex must be less than boneCount.");
    }

    public int getBoneParentIndex(int i) {
        if (i < getBoneCount()) {
            int boneParents = this.skeletonDef.boneParents(i);
            if (boneParents != 255) {
                return boneParents;
            }
            return -1;
        }
        throw new IndexOutOfBoundsException("boneIndex must be less than boneCount.");
    }

    public void getInverseBindPoseForBone(int i, Matrix matrix) {
        if (i < getBoneCount()) {
            initializeMatrix(matrix.data, this.skeletonDef.boneTransforms(i));
            return;
        }
        int boneCount = getBoneCount();
        StringBuilder sb = new StringBuilder(71);
        sb.append("boneIndex is out of range. boneIndex=");
        sb.append(i);
        sb.append(", boneCount=");
        sb.append(boneCount);
        throw new IllegalArgumentException(sb.toString());
    }

    public int getMaterialBoneCount() {
        return this.modelInstanceDef.shaderToMeshBonesLength();
    }

    public int getMaterialBoneIndex(int i) {
        if (i < getMaterialBoneCount()) {
            return this.modelInstanceDef.shaderToMeshBones(i);
        }
        int materialBoneCount = getMaterialBoneCount();
        StringBuilder sb = new StringBuilder(71);
        sb.append("index is out of range. index=");
        sb.append(i);
        sb.append(", materialBoneCount=");
        sb.append(materialBoneCount);
        throw new IllegalArgumentException(sb.toString());
    }

    public FloatBuffer getMaterialBoneTransformsBuffer() {
        return this.materialBoneTransformsBuffer;
    }

    public void getMatrixForBone(int i, Matrix matrix) {
        initializeMatrix(matrix.data, this.skeletonDef.boneTransforms(i));
        Matrix.invert(matrix, matrix);
    }

    public boolean isAnimating(ModelRenderable modelRenderable) {
        return false;
    }

    public SkeletonRig makeCopy() {
        return new SkeletonRig(this);
    }

    public void updateBoneTransforms() {
    }
}
