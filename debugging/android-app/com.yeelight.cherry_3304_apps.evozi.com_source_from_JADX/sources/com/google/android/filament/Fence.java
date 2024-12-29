package com.google.android.filament;

import androidx.annotation.NonNull;

public class Fence {
    public static final long WAIT_FOR_EVER = -1;
    private long mNativeObject;

    public enum FenceStatus {
        ERROR,
        CONDITION_SATISFIED,
        TIMEOUT_EXPIRED
    }

    public enum Mode {
        FLUSH,
        DONT_FLUSH
    }

    public enum Type {
        SOFT,
        HARD
    }

    Fence(long j) {
        this.mNativeObject = j;
    }

    private static native int nWait(long j, int i, long j2);

    private static native int nWaitAndDestroy(long j, int i);

    public static FenceStatus waitAndDestroy(@NonNull Fence fence, @NonNull Mode mode) {
        int nWaitAndDestroy = nWaitAndDestroy(fence.getNativeObject(), mode.ordinal());
        return nWaitAndDestroy != -1 ? nWaitAndDestroy != 0 ? FenceStatus.ERROR : FenceStatus.CONDITION_SATISFIED : FenceStatus.ERROR;
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
        throw new IllegalStateException("Calling method on destroyed Fence");
    }

    public FenceStatus wait(@NonNull Mode mode, long j) {
        int nWait = nWait(getNativeObject(), mode.ordinal(), j);
        return nWait != -1 ? nWait != 0 ? nWait != 1 ? FenceStatus.ERROR : FenceStatus.TIMEOUT_EXPIRED : FenceStatus.CONDITION_SATISFIED : FenceStatus.ERROR;
    }
}
