package com.google.android.filament;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.google.android.filament.Texture;
import java.nio.Buffer;
import java.nio.BufferOverflowException;
import java.nio.ReadOnlyBufferException;

public class Renderer {
    public static final int MIRROR_FRAME_FLAG_CLEAR = 4;
    public static final int MIRROR_FRAME_FLAG_COMMIT = 1;
    public static final int MIRROR_FRAME_FLAG_SET_PRESENTATION_TIME = 2;
    private final Engine mEngine;
    private long mNativeObject;

    Renderer(@NonNull Engine engine, long j) {
        this.mEngine = engine;
        this.mNativeObject = j;
    }

    private static native boolean nBeginFrame(long j, long j2);

    private static native void nCopyFrame(long j, long j2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9);

    private static native void nEndFrame(long j);

    private static native double nGetUserTime(long j);

    private static native int nReadPixels(long j, long j2, int i, int i2, int i3, int i4, Buffer buffer, int i5, int i6, int i7, int i8, int i9, int i10, int i11, Object obj, Runnable runnable);

    private static native void nRender(long j, long j2);

    private static native void nResetUserTime(long j);

    public boolean beginFrame(@NonNull SwapChain swapChain) {
        return nBeginFrame(getNativeObject(), swapChain.getNativeObject());
    }

    /* access modifiers changed from: package-private */
    public void clearNativeObject() {
        this.mNativeObject = 0;
    }

    public void copyFrame(@NonNull SwapChain swapChain, @NonNull Viewport viewport, @NonNull Viewport viewport2, int i) {
        Viewport viewport3 = viewport;
        Viewport viewport4 = viewport2;
        nCopyFrame(getNativeObject(), swapChain.getNativeObject(), viewport3.left, viewport3.bottom, viewport3.width, viewport3.height, viewport4.left, viewport4.bottom, viewport4.width, viewport4.height, i);
    }

    public void endFrame() {
        nEndFrame(getNativeObject());
    }

    @NonNull
    public Engine getEngine() {
        return this.mEngine;
    }

    /* access modifiers changed from: package-private */
    public long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Calling method on destroyed Renderer");
    }

    /* access modifiers changed from: package-private */
    public double getUserTime() {
        return nGetUserTime(getNativeObject());
    }

    @Deprecated
    public void mirrorFrame(@NonNull SwapChain swapChain, @NonNull Viewport viewport, @NonNull Viewport viewport2, int i) {
        copyFrame(swapChain, viewport, viewport2, i);
    }

    public void readPixels(@IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, @IntRange(from = 0) int i4, @NonNull Texture.PixelBufferDescriptor pixelBufferDescriptor) {
        Texture.PixelBufferDescriptor pixelBufferDescriptor2 = pixelBufferDescriptor;
        if (!pixelBufferDescriptor2.storage.isReadOnly()) {
            long nativeObject = getNativeObject();
            long nativeObject2 = this.mEngine.getNativeObject();
            Buffer buffer = pixelBufferDescriptor2.storage;
            if (nReadPixels(nativeObject, nativeObject2, i, i2, i3, i4, buffer, buffer.remaining(), pixelBufferDescriptor2.left, pixelBufferDescriptor2.top, pixelBufferDescriptor2.type.ordinal(), pixelBufferDescriptor2.alignment, pixelBufferDescriptor2.stride, pixelBufferDescriptor2.format.ordinal(), pixelBufferDescriptor2.handler, pixelBufferDescriptor2.callback) < 0) {
                throw new BufferOverflowException();
            }
            return;
        }
        throw new ReadOnlyBufferException();
    }

    public void render(@NonNull View view) {
        nRender(getNativeObject(), view.getNativeObject());
    }

    /* access modifiers changed from: package-private */
    public void resetUserTime() {
        nResetUserTime(getNativeObject());
    }
}
