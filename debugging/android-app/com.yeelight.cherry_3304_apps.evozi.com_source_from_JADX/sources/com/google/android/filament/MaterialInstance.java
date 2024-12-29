package com.google.android.filament;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import com.google.android.filament.Colors;

public class MaterialInstance {
    private Material mMaterial;
    private long mNativeMaterial;
    private long mNativeObject;

    public enum BooleanElement {
        BOOL,
        BOOL2,
        BOOL3,
        BOOL4
    }

    public enum FloatElement {
        FLOAT,
        FLOAT2,
        FLOAT3,
        FLOAT4,
        MAT3,
        MAT4
    }

    public enum IntElement {
        INT,
        INT2,
        INT3,
        INT4
    }

    MaterialInstance(long j, long j2) {
        this.mNativeMaterial = j;
        this.mNativeObject = j2;
    }

    MaterialInstance(@NonNull Material material, long j) {
        this.mMaterial = material;
        this.mNativeObject = j;
    }

    private static native void nSetBooleanParameterArray(long j, @NonNull String str, int i, @Size(min = 1) @NonNull boolean[] zArr, @IntRange(from = 0) int i2, @IntRange(from = 1) int i3);

    private static native void nSetDoubleSided(long j, boolean z);

    private static native void nSetFloatParameterArray(long j, @NonNull String str, int i, @Size(min = 1) @NonNull float[] fArr, @IntRange(from = 0) int i2, @IntRange(from = 1) int i3);

    private static native void nSetIntParameterArray(long j, @NonNull String str, int i, @Size(min = 1) @NonNull int[] iArr, @IntRange(from = 0) int i2, @IntRange(from = 1) int i3);

    private static native void nSetMaskThreshold(long j, float f);

    private static native void nSetParameterBool(long j, @NonNull String str, boolean z);

    private static native void nSetParameterBool2(long j, @NonNull String str, boolean z, boolean z2);

    private static native void nSetParameterBool3(long j, @NonNull String str, boolean z, boolean z2, boolean z3);

    private static native void nSetParameterBool4(long j, @NonNull String str, boolean z, boolean z2, boolean z3, boolean z4);

    private static native void nSetParameterFloat(long j, @NonNull String str, float f);

    private static native void nSetParameterFloat2(long j, @NonNull String str, float f, float f2);

    private static native void nSetParameterFloat3(long j, @NonNull String str, float f, float f2, float f3);

    private static native void nSetParameterFloat4(long j, @NonNull String str, float f, float f2, float f3, float f4);

    private static native void nSetParameterInt(long j, @NonNull String str, int i);

    private static native void nSetParameterInt2(long j, @NonNull String str, int i, int i2);

    private static native void nSetParameterInt3(long j, @NonNull String str, int i, int i2, int i3);

    private static native void nSetParameterInt4(long j, @NonNull String str, int i, int i2, int i3, int i4);

    private static native void nSetParameterTexture(long j, @NonNull String str, long j2, int i);

    private static native void nSetPolygonOffset(long j, float f, float f2);

    private static native void nSetScissor(long j, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, @IntRange(from = 0) int i4);

    private static native void nSetSpecularAntiAliasingThreshold(long j, float f);

    private static native void nSetSpecularAntiAliasingVariance(long j, float f);

    private static native void nUnsetScissor(long j);

    /* access modifiers changed from: package-private */
    public void clearNativeObject() {
        this.mNativeObject = 0;
    }

    @NonNull
    public Material getMaterial() {
        if (this.mMaterial == null) {
            this.mMaterial = new Material(this.mNativeMaterial);
        }
        return this.mMaterial;
    }

    /* access modifiers changed from: package-private */
    public long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Calling method on destroyed MaterialInstance");
    }

    public void setDoubleSided(boolean z) {
        nSetDoubleSided(getNativeObject(), z);
    }

    public void setMaskThreshold(float f) {
        nSetMaskThreshold(getNativeObject(), f);
    }

    public void setParameter(@NonNull String str, float f) {
        nSetParameterFloat(getNativeObject(), str, f);
    }

    public void setParameter(@NonNull String str, float f, float f2) {
        nSetParameterFloat2(getNativeObject(), str, f, f2);
    }

    public void setParameter(@NonNull String str, float f, float f2, float f3) {
        nSetParameterFloat3(getNativeObject(), str, f, f2, f3);
    }

    public void setParameter(@NonNull String str, float f, float f2, float f3, float f4) {
        nSetParameterFloat4(getNativeObject(), str, f, f2, f3, f4);
    }

    public void setParameter(@NonNull String str, int i) {
        nSetParameterInt(getNativeObject(), str, i);
    }

    public void setParameter(@NonNull String str, int i, int i2) {
        nSetParameterInt2(getNativeObject(), str, i, i2);
    }

    public void setParameter(@NonNull String str, int i, int i2, int i3) {
        nSetParameterInt3(getNativeObject(), str, i, i2, i3);
    }

    public void setParameter(@NonNull String str, int i, int i2, int i3, int i4) {
        nSetParameterInt4(getNativeObject(), str, i, i2, i3, i4);
    }

    public void setParameter(@NonNull String str, @NonNull Colors.RgbType rgbType, float f, float f2, float f3) {
        float[] linear = Colors.toLinear(rgbType, f, f2, f3);
        nSetParameterFloat3(getNativeObject(), str, linear[0], linear[1], linear[2]);
    }

    public void setParameter(@NonNull String str, @NonNull Colors.RgbaType rgbaType, float f, float f2, float f3, float f4) {
        float[] linear = Colors.toLinear(rgbaType, f, f2, f3, f4);
        nSetParameterFloat4(getNativeObject(), str, linear[0], linear[1], linear[2], linear[3]);
    }

    public void setParameter(@NonNull String str, @NonNull BooleanElement booleanElement, @NonNull boolean[] zArr, @IntRange(from = 0) int i, @IntRange(from = 1) int i2) {
        nSetBooleanParameterArray(getNativeObject(), str, booleanElement.ordinal(), zArr, i, i2);
    }

    public void setParameter(@NonNull String str, @NonNull FloatElement floatElement, @NonNull float[] fArr, @IntRange(from = 0) int i, @IntRange(from = 1) int i2) {
        nSetFloatParameterArray(getNativeObject(), str, floatElement.ordinal(), fArr, i, i2);
    }

    public void setParameter(@NonNull String str, @NonNull IntElement intElement, @NonNull int[] iArr, @IntRange(from = 0) int i, @IntRange(from = 1) int i2) {
        nSetIntParameterArray(getNativeObject(), str, intElement.ordinal(), iArr, i, i2);
    }

    public void setParameter(@NonNull String str, @NonNull Texture texture, @NonNull TextureSampler textureSampler) {
        nSetParameterTexture(getNativeObject(), str, texture.getNativeObject(), textureSampler.mSampler);
    }

    public void setParameter(@NonNull String str, boolean z) {
        nSetParameterBool(getNativeObject(), str, z);
    }

    public void setParameter(@NonNull String str, boolean z, boolean z2) {
        nSetParameterBool2(getNativeObject(), str, z, z2);
    }

    public void setParameter(@NonNull String str, boolean z, boolean z2, boolean z3) {
        nSetParameterBool3(getNativeObject(), str, z, z2, z3);
    }

    public void setParameter(@NonNull String str, boolean z, boolean z2, boolean z3, boolean z4) {
        nSetParameterBool4(getNativeObject(), str, z, z2, z3, z4);
    }

    public void setPolygonOffset(float f, float f2) {
        nSetPolygonOffset(getNativeObject(), f, f2);
    }

    public void setScissor(@IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, @IntRange(from = 0) int i4) {
        nSetScissor(getNativeObject(), i, i2, i3, i4);
    }

    public void setSpecularAntiAliasingThreshold(float f) {
        nSetSpecularAntiAliasingThreshold(getNativeObject(), f);
    }

    public void setSpecularAntiAliasingVariance(float f) {
        nSetSpecularAntiAliasingVariance(getNativeObject(), f);
    }

    public void unsetScissor() {
        nUnsetScissor(getNativeObject());
    }
}
