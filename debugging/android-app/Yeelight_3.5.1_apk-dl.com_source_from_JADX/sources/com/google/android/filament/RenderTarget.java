package com.google.android.filament;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.filament.Texture;

public class RenderTarget {
    private long mNativeObject;
    private final Texture[] mTextures;

    public enum AttachmentPoint {
        COLOR,
        DEPTH
    }

    public static class Builder {
        private final BuilderFinalizer mFinalizer;
        private final long mNativeBuilder;
        /* access modifiers changed from: private */
        public final Texture[] mTextures = new Texture[2];

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
                long unused2 = RenderTarget.nDestroyBuilder(this.mNativeObject);
            }
        }

        public Builder() {
            long access$100 = RenderTarget.nCreateBuilder();
            this.mNativeBuilder = access$100;
            this.mFinalizer = new BuilderFinalizer(access$100);
        }

        @NonNull
        public RenderTarget build(@NonNull Engine engine) {
            long access$600 = RenderTarget.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (access$600 != 0) {
                return new RenderTarget(access$600, this);
            }
            throw new IllegalStateException("Couldn't create RenderTarget");
        }

        @NonNull
        public Builder face(@NonNull AttachmentPoint attachmentPoint, Texture.CubemapFace cubemapFace) {
            long unused = RenderTarget.nBuilderFace(this.mNativeBuilder, attachmentPoint.ordinal(), cubemapFace.ordinal());
            return this;
        }

        @NonNull
        public Builder layer(@NonNull AttachmentPoint attachmentPoint, @IntRange(from = 0) int i) {
            long unused = RenderTarget.nBuilderLayer(this.mNativeBuilder, attachmentPoint.ordinal(), i);
            return this;
        }

        @NonNull
        public Builder mipLevel(@NonNull AttachmentPoint attachmentPoint, @IntRange(from = 0) int i) {
            long unused = RenderTarget.nBuilderMipLevel(this.mNativeBuilder, attachmentPoint.ordinal(), i);
            return this;
        }

        @NonNull
        public Builder texture(@NonNull AttachmentPoint attachmentPoint, @Nullable Texture texture) {
            this.mTextures[attachmentPoint.ordinal()] = texture;
            long unused = RenderTarget.nBuilderTexture(this.mNativeBuilder, attachmentPoint.ordinal(), texture != null ? texture.getNativeObject() : 0);
            return this;
        }
    }

    private RenderTarget(long j, Builder builder) {
        Texture[] textureArr = new Texture[2];
        this.mTextures = textureArr;
        this.mNativeObject = j;
        textureArr[0] = builder.mTextures[0];
        textureArr[1] = builder.mTextures[1];
    }

    /* access modifiers changed from: private */
    public static native long nBuilderBuild(long j, long j2);

    /* access modifiers changed from: private */
    public static native long nBuilderFace(long j, int i, int i2);

    /* access modifiers changed from: private */
    public static native long nBuilderLayer(long j, int i, int i2);

    /* access modifiers changed from: private */
    public static native long nBuilderMipLevel(long j, int i, int i2);

    /* access modifiers changed from: private */
    public static native long nBuilderTexture(long j, int i, long j2);

    /* access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* access modifiers changed from: private */
    public static native long nDestroyBuilder(long j);

    private static native int nGetFace(long j, int i);

    private static native int nGetLayer(long j, int i);

    private static native int nGetMipLevel(long j, int i);

    /* access modifiers changed from: package-private */
    public void clearNativeObject() {
        this.mNativeObject = 0;
    }

    public Texture.CubemapFace getFace(AttachmentPoint attachmentPoint) {
        return Texture.CubemapFace.values()[nGetFace(getNativeObject(), attachmentPoint.ordinal())];
    }

    @IntRange(from = 0)
    public int getLayer(@NonNull AttachmentPoint attachmentPoint) {
        return nGetLayer(getNativeObject(), attachmentPoint.ordinal());
    }

    @IntRange(from = 0)
    public int getMipLevel(@NonNull AttachmentPoint attachmentPoint) {
        return nGetMipLevel(getNativeObject(), attachmentPoint.ordinal());
    }

    /* access modifiers changed from: package-private */
    public long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Calling method on destroyed RenderTarget");
    }

    @Nullable
    public Texture getTexture(@NonNull AttachmentPoint attachmentPoint) {
        return this.mTextures[attachmentPoint.ordinal()];
    }
}
