package com.google.android.filament;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.google.android.filament.Texture;
import java.nio.Buffer;
import java.nio.BufferOverflowException;
import java.nio.ReadOnlyBufferException;

public class Stream {
    private long mNativeEngine;
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
                Stream.nDestroyBuilder(this.mNativeObject);
            }
        }

        public Builder() {
            long access$000 = Stream.nCreateBuilder();
            this.mNativeBuilder = access$000;
            this.mFinalizer = new BuilderFinalizer(access$000);
        }

        @NonNull
        public Stream build(@NonNull Engine engine) {
            long access$500 = Stream.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (access$500 != 0) {
                return new Stream(access$500, engine);
            }
            throw new IllegalStateException("Couldn't create Stream");
        }

        @NonNull
        public Builder height(int i) {
            Stream.nBuilderHeight(this.mNativeBuilder, i);
            return this;
        }

        @NonNull
        public Builder stream(long j) {
            Stream.nBuilderStream(this.mNativeBuilder, j);
            return this;
        }

        @NonNull
        public Builder stream(@NonNull Object obj) {
            if (Platform.get().validateStreamSource(obj)) {
                Stream.nBuilderStreamSource(this.mNativeBuilder, obj);
                return this;
            }
            throw new IllegalArgumentException("Invalid stream source: " + obj);
        }

        @NonNull
        public Builder width(int i) {
            Stream.nBuilderWidth(this.mNativeBuilder, i);
            return this;
        }
    }

    Stream(long j, Engine engine) {
        this.mNativeObject = j;
        this.mNativeEngine = engine.getNativeObject();
    }

    /* access modifiers changed from: private */
    public static native long nBuilderBuild(long j, long j2);

    /* access modifiers changed from: private */
    public static native void nBuilderHeight(long j, int i);

    /* access modifiers changed from: private */
    public static native void nBuilderStream(long j, long j2);

    /* access modifiers changed from: private */
    public static native void nBuilderStreamSource(long j, Object obj);

    /* access modifiers changed from: private */
    public static native void nBuilderWidth(long j, int i);

    /* access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* access modifiers changed from: private */
    public static native void nDestroyBuilder(long j);

    private static native long nGetTimestamp(long j);

    private static native boolean nIsNative(long j);

    private static native int nReadPixels(long j, long j2, int i, int i2, int i3, int i4, Buffer buffer, int i5, int i6, int i7, int i8, int i9, int i10, int i11, Object obj, Runnable runnable);

    private static native void nSetDimensions(long j, int i, int i2);

    /* access modifiers changed from: package-private */
    public void clearNativeObject() {
        this.mNativeObject = 0;
    }

    /* access modifiers changed from: package-private */
    public long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Calling method on destroyed Stream");
    }

    public long getTimestamp() {
        return nGetTimestamp(getNativeObject());
    }

    public boolean isNative() {
        return nIsNative(getNativeObject());
    }

    public void readPixels(@IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, @IntRange(from = 0) int i4, @NonNull Texture.PixelBufferDescriptor pixelBufferDescriptor) {
        Texture.PixelBufferDescriptor pixelBufferDescriptor2 = pixelBufferDescriptor;
        if (!pixelBufferDescriptor2.storage.isReadOnly()) {
            long nativeObject = getNativeObject();
            long j = this.mNativeEngine;
            Buffer buffer = pixelBufferDescriptor2.storage;
            if (nReadPixels(nativeObject, j, i, i2, i3, i4, buffer, buffer.remaining(), pixelBufferDescriptor2.left, pixelBufferDescriptor2.top, pixelBufferDescriptor2.type.ordinal(), pixelBufferDescriptor2.alignment, pixelBufferDescriptor2.stride, pixelBufferDescriptor2.format.ordinal(), pixelBufferDescriptor2.handler, pixelBufferDescriptor2.callback) < 0) {
                throw new BufferOverflowException();
            }
            return;
        }
        throw new ReadOnlyBufferException();
    }

    public void setDimensions(@IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
        nSetDimensions(getNativeObject(), i, i2);
    }
}
