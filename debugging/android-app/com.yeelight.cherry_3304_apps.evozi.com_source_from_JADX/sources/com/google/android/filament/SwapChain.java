package com.google.android.filament;

import androidx.annotation.NonNull;

public class SwapChain {
    public static final long CONFIG_DEFAULT = 0;
    public static final long CONFIG_READABLE = 2;
    public static final long CONFIG_TRANSPARENT = 1;
    private long mNativeObject;
    private final Object mSurface;

    SwapChain(long j, @NonNull Object obj) {
        this.mNativeObject = j;
        this.mSurface = obj;
    }

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
        throw new IllegalStateException("Calling method on destroyed SwapChain");
    }

    @NonNull
    public Object getNativeWindow() {
        return this.mSurface;
    }
}
