package com.google.android.filament;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;

public class LightManager {
    public static final float EFFICIENCY_FLUORESCENT = 0.0878f;
    public static final float EFFICIENCY_HALOGEN = 0.0707f;
    public static final float EFFICIENCY_INCANDESCENT = 0.022f;
    public static final float EFFICIENCY_LED = 0.1171f;
    private long mNativeObject;

    public static class Builder {
        private final BuilderFinalizer mFinalizer;
        private final long mNativeBuilder;

        private static class BuilderFinalizer {
            private final long mNativeObject;

            BuilderFinalizer(long j) {
                this.mNativeObject = j;
            }

            public void finalize() {
                try {
                    super.finalize();
                } catch (Throwable unused) {
                }
                LightManager.nDestroyBuilder(this.mNativeObject);
            }
        }

        public Builder(@NonNull Type type) {
            long access$000 = LightManager.nCreateBuilder(type.ordinal());
            this.mNativeBuilder = access$000;
            this.mFinalizer = new BuilderFinalizer(access$000);
        }

        public void build(@NonNull Engine engine, @Entity int i) {
            if (!LightManager.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject(), i)) {
                throw new IllegalStateException("Couldn't create Light component for entity " + i + ", see log.");
            }
        }

        @NonNull
        public Builder castLight(boolean z) {
            LightManager.nBuilderCastLight(this.mNativeBuilder, z);
            return this;
        }

        @NonNull
        public Builder castShadows(boolean z) {
            LightManager.nBuilderCastShadows(this.mNativeBuilder, z);
            return this;
        }

        @NonNull
        public Builder color(float f, float f2, float f3) {
            LightManager.nBuilderColor(this.mNativeBuilder, f, f2, f3);
            return this;
        }

        @NonNull
        public Builder direction(float f, float f2, float f3) {
            LightManager.nBuilderDirection(this.mNativeBuilder, f, f2, f3);
            return this;
        }

        @NonNull
        public Builder falloff(float f) {
            LightManager.nBuilderFalloff(this.mNativeBuilder, f);
            return this;
        }

        @NonNull
        public Builder intensity(float f) {
            LightManager.nBuilderIntensity(this.mNativeBuilder, f);
            return this;
        }

        @NonNull
        public Builder intensity(float f, float f2) {
            LightManager.nBuilderIntensity(this.mNativeBuilder, f, f2);
            return this;
        }

        @NonNull
        public Builder position(float f, float f2, float f3) {
            LightManager.nBuilderPosition(this.mNativeBuilder, f, f2, f3);
            return this;
        }

        @NonNull
        public Builder shadowOptions(@NonNull ShadowOptions shadowOptions) {
            LightManager.nBuilderShadowOptions(this.mNativeBuilder, shadowOptions.mapSize, shadowOptions.constantBias, shadowOptions.normalBias, shadowOptions.shadowFar, shadowOptions.shadowNearHint, shadowOptions.shadowFarHint, shadowOptions.stable);
            return this;
        }

        @NonNull
        public Builder spotLightCone(float f, float f2) {
            LightManager.nBuilderSpotLightCone(this.mNativeBuilder, f, f2);
            return this;
        }

        @NonNull
        public Builder sunAngularRadius(float f) {
            LightManager.nBuilderAngularRadius(this.mNativeBuilder, f);
            return this;
        }

        @NonNull
        public Builder sunHaloFalloff(float f) {
            LightManager.nBuilderHaloFalloff(this.mNativeBuilder, f);
            return this;
        }

        @NonNull
        public Builder sunHaloSize(float f) {
            LightManager.nBuilderHaloSize(this.mNativeBuilder, f);
            return this;
        }
    }

    public static class ShadowOptions {
        public float constantBias = 0.05f;
        public int mapSize = 1024;
        public float normalBias = 0.4f;
        public float shadowFar = 0.0f;
        public float shadowFarHint = 100.0f;
        public float shadowNearHint = 1.0f;
        public boolean stable = true;
    }

    public enum Type {
        SUN,
        DIRECTIONAL,
        POINT,
        FOCUSED_SPOT,
        SPOT
    }

    LightManager(long j) {
        this.mNativeObject = j;
    }

    @Size(min = 3)
    @NonNull
    private static float[] assertFloat3(@Nullable float[] fArr) {
        if (fArr == null) {
            return new float[3];
        }
        if (fArr.length >= 3) {
            return fArr;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 3");
    }

    /* access modifiers changed from: private */
    public static native void nBuilderAngularRadius(long j, float f);

    /* access modifiers changed from: private */
    public static native boolean nBuilderBuild(long j, long j2, int i);

    /* access modifiers changed from: private */
    public static native void nBuilderCastLight(long j, boolean z);

    /* access modifiers changed from: private */
    public static native void nBuilderCastShadows(long j, boolean z);

    /* access modifiers changed from: private */
    public static native void nBuilderColor(long j, float f, float f2, float f3);

    /* access modifiers changed from: private */
    public static native void nBuilderDirection(long j, float f, float f2, float f3);

    /* access modifiers changed from: private */
    public static native void nBuilderFalloff(long j, float f);

    /* access modifiers changed from: private */
    public static native void nBuilderHaloFalloff(long j, float f);

    /* access modifiers changed from: private */
    public static native void nBuilderHaloSize(long j, float f);

    /* access modifiers changed from: private */
    public static native void nBuilderIntensity(long j, float f);

    /* access modifiers changed from: private */
    public static native void nBuilderIntensity(long j, float f, float f2);

    /* access modifiers changed from: private */
    public static native void nBuilderPosition(long j, float f, float f2, float f3);

    /* access modifiers changed from: private */
    public static native void nBuilderShadowOptions(long j, int i, float f, float f2, float f3, float f4, float f5, boolean z);

    /* access modifiers changed from: private */
    public static native void nBuilderSpotLightCone(long j, float f, float f2);

    /* access modifiers changed from: private */
    public static native long nCreateBuilder(int i);

    private static native void nDestroy(long j, int i);

    /* access modifiers changed from: private */
    public static native void nDestroyBuilder(long j);

    private static native void nGetColor(long j, int i, float[] fArr);

    private static native void nGetDirection(long j, int i, float[] fArr);

    private static native float nGetFalloff(long j, int i);

    private static native int nGetInstance(long j, int i);

    private static native float nGetIntensity(long j, int i);

    private static native void nGetPosition(long j, int i, float[] fArr);

    private static native float nGetSunAngularRadius(long j, int i);

    private static native float nGetSunHaloFalloff(long j, int i);

    private static native float nGetSunHaloSize(long j, int i);

    private static native int nGetType(long j, int i);

    private static native boolean nHasComponent(long j, int i);

    private static native void nSetColor(long j, int i, float f, float f2, float f3);

    private static native void nSetDirection(long j, int i, float f, float f2, float f3);

    private static native void nSetFalloff(long j, int i, float f);

    private static native void nSetIntensity(long j, int i, float f);

    private static native void nSetIntensity(long j, int i, float f, float f2);

    private static native void nSetPosition(long j, int i, float f, float f2, float f3);

    private static native void nSetSpotLightCone(long j, int i, float f, float f2);

    private static native void nSetSunAngularRadius(long j, int i, float f);

    private static native void nSetSunHaloFalloff(long j, int i, float f);

    private static native void nSetSunHaloSize(long j, int i, float f);

    public void destroy(@Entity int i) {
        nDestroy(this.mNativeObject, i);
    }

    @NonNull
    public float[] getColor(@EntityInstance int i, @Size(min = 3) @Nullable float[] fArr) {
        float[] assertFloat3 = assertFloat3(fArr);
        nGetColor(this.mNativeObject, i, assertFloat3);
        return assertFloat3;
    }

    @NonNull
    public float[] getDirection(@EntityInstance int i, @Size(min = 3) @Nullable float[] fArr) {
        float[] assertFloat3 = assertFloat3(fArr);
        nGetDirection(this.mNativeObject, i, assertFloat3);
        return assertFloat3;
    }

    public float getFalloff(@EntityInstance int i) {
        return nGetFalloff(this.mNativeObject, i);
    }

    @EntityInstance
    public int getInstance(@Entity int i) {
        return nGetInstance(this.mNativeObject, i);
    }

    public float getIntensity(@EntityInstance int i) {
        return nGetIntensity(this.mNativeObject, i);
    }

    @NonNull
    public float[] getPosition(@EntityInstance int i, @Size(min = 3) @Nullable float[] fArr) {
        float[] assertFloat3 = assertFloat3(fArr);
        nGetPosition(this.mNativeObject, i, assertFloat3);
        return assertFloat3;
    }

    public float getSunAngularRadius(@EntityInstance int i) {
        return nGetSunAngularRadius(this.mNativeObject, i);
    }

    public float getSunHaloFalloff(@EntityInstance int i) {
        return nGetSunHaloFalloff(this.mNativeObject, i);
    }

    public float getSunHaloSize(@EntityInstance int i) {
        return nGetSunHaloSize(this.mNativeObject, i);
    }

    @NonNull
    public Type getType(@EntityInstance int i) {
        return Type.values()[nGetType(this.mNativeObject, i)];
    }

    public boolean hasComponent(@Entity int i) {
        return nHasComponent(this.mNativeObject, i);
    }

    public void setColor(@EntityInstance int i, float f, float f2, float f3) {
        nSetColor(this.mNativeObject, i, f, f2, f3);
    }

    public void setDirection(@EntityInstance int i, float f, float f2, float f3) {
        nSetDirection(this.mNativeObject, i, f, f2, f3);
    }

    public void setFalloff(@EntityInstance int i, float f) {
        nSetFalloff(this.mNativeObject, i, f);
    }

    public void setIntensity(@EntityInstance int i, float f) {
        nSetIntensity(this.mNativeObject, i, f);
    }

    public void setIntensity(@EntityInstance int i, float f, float f2) {
        nSetIntensity(this.mNativeObject, i, f, f2);
    }

    public void setPosition(@EntityInstance int i, float f, float f2, float f3) {
        nSetPosition(this.mNativeObject, i, f, f2, f3);
    }

    public void setSpotLightCone(@EntityInstance int i, float f, float f2) {
        nSetSpotLightCone(this.mNativeObject, i, f, f2);
    }

    public void setSunAngularRadius(@EntityInstance int i, float f) {
        nSetSunAngularRadius(this.mNativeObject, i, f);
    }

    public void setSunHaloFalloff(@EntityInstance int i, float f) {
        nSetSunHaloFalloff(this.mNativeObject, i, f);
    }

    public void setSunHaloSize(@EntityInstance int i, float f) {
        nSetSunHaloSize(this.mNativeObject, i, f);
    }
}
