package com.google.android.filament;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;

public class Skybox {
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
                Skybox.nDestroyBuilder(this.mNativeObject);
            }
        }

        public Builder() {
            long access$000 = Skybox.nCreateBuilder();
            this.mNativeBuilder = access$000;
            this.mFinalizer = new BuilderFinalizer(access$000);
        }

        @NonNull
        public Skybox build(@NonNull Engine engine) {
            long access$300 = Skybox.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (access$300 != 0) {
                return new Skybox(access$300);
            }
            throw new IllegalStateException("Couldn't create Skybox");
        }

        @NonNull
        public Builder environment(@NonNull Texture texture) {
            Skybox.nBuilderEnvironment(this.mNativeBuilder, texture.getNativeObject());
            return this;
        }

        @NonNull
        public Builder showSun(boolean z) {
            Skybox.nBuilderShowSun(this.mNativeBuilder, z);
            return this;
        }
    }

    private Skybox(long j) {
        this.mNativeObject = j;
    }

    /* access modifiers changed from: private */
    public static native long nBuilderBuild(long j, long j2);

    /* access modifiers changed from: private */
    public static native void nBuilderEnvironment(long j, long j2);

    /* access modifiers changed from: private */
    public static native void nBuilderShowSun(long j, boolean z);

    /* access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* access modifiers changed from: private */
    public static native void nDestroyBuilder(long j);

    private static native int nGetLayerMask(long j);

    private static native void nSetLayerMask(long j, int i, int i2);

    /* access modifiers changed from: package-private */
    public void clearNativeObject() {
        this.mNativeObject = 0;
    }

    public int getLayerMask() {
        return nGetLayerMask(getNativeObject());
    }

    /* access modifiers changed from: package-private */
    public long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Calling method on destroyed Skybox");
    }

    public void setLayerMask(@IntRange(from = 0, mo660to = 255) int i, @IntRange(from = 0, mo660to = 255) int i2) {
        nSetLayerMask(getNativeObject(), i & 255, i2 & 255);
    }
}
