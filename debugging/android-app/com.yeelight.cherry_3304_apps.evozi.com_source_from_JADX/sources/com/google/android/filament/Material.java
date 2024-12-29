package com.google.android.filament;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import com.google.android.filament.Colors;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.VertexBuffer;
import com.google.android.filament.proguard.UsedByNative;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class Material {
    private final MaterialInstance mDefaultInstance;
    private long mNativeObject;
    private Set<VertexBuffer.VertexAttribute> mRequiredAttributes;

    public enum BlendingMode {
        OPAQUE,
        TRANSPARENT,
        ADD,
        MODULATE,
        MASKED,
        FADE
    }

    public static class Builder {
        private Buffer mBuffer;
        private int mSize;

        @NonNull
        public Material build(@NonNull Engine engine) {
            long access$000 = Material.nBuilderBuild(engine.getNativeObject(), this.mBuffer, this.mSize);
            if (access$000 != 0) {
                return new Material(access$000);
            }
            throw new IllegalStateException("Couldn't create Material");
        }

        @NonNull
        public Builder payload(@NonNull Buffer buffer, @IntRange(from = 0) int i) {
            this.mBuffer = buffer;
            this.mSize = i;
            return this;
        }
    }

    public enum CullingMode {
        NONE,
        FRONT,
        BACK,
        FRONT_AND_BACK
    }

    public enum Interpolation {
        SMOOTH,
        FLAT
    }

    @UsedByNative("Material.cpp")
    public static class Parameter {
        @UsedByNative("Material.cpp")
        private static final int SAMPLER_OFFSET = (Type.MAT4.ordinal() + 1);
        @IntRange(from = 1)
        public final int count;
        @NonNull
        public final String name;
        @NonNull
        public final Precision precision;
        @NonNull
        public final Type type;

        public enum Precision {
            LOW,
            MEDIUM,
            HIGH,
            DEFAULT
        }

        public enum Type {
            BOOL,
            BOOL2,
            BOOL3,
            BOOL4,
            FLOAT,
            FLOAT2,
            FLOAT3,
            FLOAT4,
            INT,
            INT2,
            INT3,
            INT4,
            UINT,
            UINT2,
            UINT3,
            UINT4,
            MAT3,
            MAT4,
            SAMPLER_2D,
            SAMPLER_CUBEMAP,
            SAMPLER_EXTERNAL
        }

        private Parameter(@NonNull String str, @NonNull Type type2, @NonNull Precision precision2, @IntRange(from = 1) int i) {
            this.name = str;
            this.type = type2;
            this.precision = precision2;
            this.count = i;
        }

        @UsedByNative("Material.cpp")
        private static void add(@NonNull List<Parameter> list, @NonNull String str, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 1) int i3) {
            list.add(new Parameter(str, Type.values()[i], Precision.values()[i2], i3));
        }
    }

    public enum Shading {
        UNLIT,
        LIT,
        SUBSURFACE,
        CLOTH,
        SPECULAR_GLOSSINESS
    }

    public enum VertexDomain {
        OBJECT,
        WORLD,
        VIEW,
        DEVICE
    }

    Material(long j) {
        this.mNativeObject = j;
        this.mDefaultInstance = new MaterialInstance(this, nGetDefaultInstance(j));
    }

    /* access modifiers changed from: private */
    public static native long nBuilderBuild(long j, @NonNull Buffer buffer, int i);

    private static native long nCreateInstance(long j);

    private static native int nGetBlendingMode(long j);

    private static native int nGetCullingMode(long j);

    private static native long nGetDefaultInstance(long j);

    private static native int nGetInterpolation(long j);

    private static native float nGetMaskThreshold(long j);

    private static native String nGetName(long j);

    private static native int nGetParameterCount(long j);

    private static native void nGetParameters(long j, @NonNull List<Parameter> list, @IntRange(from = 1) int i);

    private static native int nGetRequiredAttributes(long j);

    private static native int nGetShading(long j);

    private static native float nGetSpecularAntiAliasingThreshold(long j);

    private static native float nGetSpecularAntiAliasingVariance(long j);

    private static native int nGetVertexDomain(long j);

    private static native boolean nHasParameter(long j, @NonNull String str);

    private static native boolean nIsColorWriteEnabled(long j);

    private static native boolean nIsDepthCullingEnabled(long j);

    private static native boolean nIsDepthWriteEnabled(long j);

    private static native boolean nIsDoubleSided(long j);

    /* access modifiers changed from: package-private */
    public void clearNativeObject() {
        this.mNativeObject = 0;
    }

    @NonNull
    public MaterialInstance createInstance() {
        long nCreateInstance = nCreateInstance(getNativeObject());
        if (nCreateInstance != 0) {
            return new MaterialInstance(this, nCreateInstance);
        }
        throw new IllegalStateException("Couldn't create MaterialInstance");
    }

    public BlendingMode getBlendingMode() {
        return BlendingMode.values()[nGetBlendingMode(getNativeObject())];
    }

    public CullingMode getCullingMode() {
        return CullingMode.values()[nGetCullingMode(getNativeObject())];
    }

    @NonNull
    public MaterialInstance getDefaultInstance() {
        return this.mDefaultInstance;
    }

    public Interpolation getInterpolation() {
        return Interpolation.values()[nGetInterpolation(getNativeObject())];
    }

    public float getMaskThreshold() {
        return nGetMaskThreshold(getNativeObject());
    }

    public String getName() {
        return nGetName(getNativeObject());
    }

    /* access modifiers changed from: package-private */
    public long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Calling method on destroyed Material");
    }

    public int getParameterCount() {
        return nGetParameterCount(getNativeObject());
    }

    public List<Parameter> getParameters() {
        int parameterCount = getParameterCount();
        ArrayList arrayList = new ArrayList(parameterCount);
        if (parameterCount > 0) {
            nGetParameters(getNativeObject(), arrayList, parameterCount);
        }
        return arrayList;
    }

    public Set<VertexBuffer.VertexAttribute> getRequiredAttributes() {
        if (this.mRequiredAttributes == null) {
            int nGetRequiredAttributes = nGetRequiredAttributes(getNativeObject());
            this.mRequiredAttributes = EnumSet.noneOf(VertexBuffer.VertexAttribute.class);
            VertexBuffer.VertexAttribute[] values = VertexBuffer.VertexAttribute.values();
            for (int i = 0; i < values.length; i++) {
                if (((1 << i) & nGetRequiredAttributes) != 0) {
                    this.mRequiredAttributes.add(values[i]);
                }
            }
            this.mRequiredAttributes = Collections.unmodifiableSet(this.mRequiredAttributes);
        }
        return this.mRequiredAttributes;
    }

    /* access modifiers changed from: package-private */
    public int getRequiredAttributesAsInt() {
        return nGetRequiredAttributes(getNativeObject());
    }

    public Shading getShading() {
        return Shading.values()[nGetShading(getNativeObject())];
    }

    public float getSpecularAntiAliasingThreshold() {
        return nGetSpecularAntiAliasingThreshold(getNativeObject());
    }

    public float getSpecularAntiAliasingVariance() {
        return nGetSpecularAntiAliasingVariance(getNativeObject());
    }

    public VertexDomain getVertexDomain() {
        return VertexDomain.values()[nGetVertexDomain(getNativeObject())];
    }

    public boolean hasParameter(@NonNull String str) {
        return nHasParameter(getNativeObject(), str);
    }

    public boolean isColorWriteEnabled() {
        return nIsColorWriteEnabled(getNativeObject());
    }

    public boolean isDepthCullingEnabled() {
        return nIsDepthCullingEnabled(getNativeObject());
    }

    public boolean isDepthWriteEnabled() {
        return nIsDepthWriteEnabled(getNativeObject());
    }

    public boolean isDoubleSided() {
        return nIsDoubleSided(getNativeObject());
    }

    public void setDefaultParameter(@NonNull String str, float f) {
        this.mDefaultInstance.setParameter(str, f);
    }

    public void setDefaultParameter(@NonNull String str, float f, float f2) {
        this.mDefaultInstance.setParameter(str, f, f2);
    }

    public void setDefaultParameter(@NonNull String str, float f, float f2, float f3) {
        this.mDefaultInstance.setParameter(str, f, f2, f3);
    }

    public void setDefaultParameter(@NonNull String str, float f, float f2, float f3, float f4) {
        this.mDefaultInstance.setParameter(str, f, f2, f3, f4);
    }

    public void setDefaultParameter(@NonNull String str, int i) {
        this.mDefaultInstance.setParameter(str, i);
    }

    public void setDefaultParameter(@NonNull String str, int i, int i2) {
        this.mDefaultInstance.setParameter(str, i, i2);
    }

    public void setDefaultParameter(@NonNull String str, int i, int i2, int i3) {
        this.mDefaultInstance.setParameter(str, i, i2, i3);
    }

    public void setDefaultParameter(@NonNull String str, int i, int i2, int i3, int i4) {
        this.mDefaultInstance.setParameter(str, i, i2, i3, i4);
    }

    public void setDefaultParameter(@NonNull String str, @NonNull Colors.RgbType rgbType, float f, float f2, float f3) {
        this.mDefaultInstance.setParameter(str, rgbType, f, f2, f3);
    }

    public void setDefaultParameter(@NonNull String str, @NonNull Colors.RgbaType rgbaType, float f, float f2, float f3, float f4) {
        this.mDefaultInstance.setParameter(str, rgbaType, f, f2, f3, f4);
    }

    public void setDefaultParameter(@NonNull String str, @NonNull MaterialInstance.BooleanElement booleanElement, @Size(min = 1) @NonNull boolean[] zArr, @IntRange(from = 0) int i, @IntRange(from = 1) int i2) {
        this.mDefaultInstance.setParameter(str, booleanElement, zArr, i, i2);
    }

    public void setDefaultParameter(@NonNull String str, @NonNull MaterialInstance.FloatElement floatElement, @Size(min = 1) @NonNull float[] fArr, @IntRange(from = 0) int i, @IntRange(from = 1) int i2) {
        this.mDefaultInstance.setParameter(str, floatElement, fArr, i, i2);
    }

    public void setDefaultParameter(@NonNull String str, @NonNull MaterialInstance.IntElement intElement, @Size(min = 1) @NonNull int[] iArr, @IntRange(from = 0) int i, @IntRange(from = 1) int i2) {
        this.mDefaultInstance.setParameter(str, intElement, iArr, i, i2);
    }

    public void setDefaultParameter(@NonNull String str, @NonNull Texture texture, @NonNull TextureSampler textureSampler) {
        this.mDefaultInstance.setParameter(str, texture, textureSampler);
    }

    public void setDefaultParameter(@NonNull String str, boolean z) {
        this.mDefaultInstance.setParameter(str, z);
    }

    public void setDefaultParameter(@NonNull String str, boolean z, boolean z2) {
        this.mDefaultInstance.setParameter(str, z, z2);
    }

    public void setDefaultParameter(@NonNull String str, boolean z, boolean z2, boolean z3) {
        this.mDefaultInstance.setParameter(str, z, z2, z3);
    }

    public void setDefaultParameter(@NonNull String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.mDefaultInstance.setParameter(str, z, z2, z3, z4);
    }
}
