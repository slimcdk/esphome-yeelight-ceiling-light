package com.google.android.filament;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.google.android.filament.proguard.UsedByReflection;

public class EntityManager {
    private long mNativeObject;

    private static class Holder {
        static final EntityManager INSTANCE = new EntityManager();

        private Holder() {
        }
    }

    private EntityManager() {
        this.mNativeObject = nGetEntityManager();
    }

    @NonNull
    public static EntityManager get() {
        return Holder.INSTANCE;
    }

    private static native int nCreate(long j);

    private static native void nCreateArray(long j, int i, int[] iArr);

    private static native void nDestroy(long j, int i);

    private static native void nDestroyArray(long j, int i, int[] iArr);

    private static native long nGetEntityManager();

    private static native boolean nIsAlive(long j, int i);

    @Entity
    public int create() {
        return nCreate(this.mNativeObject);
    }

    @NonNull
    @Entity
    public int[] create(@IntRange(from = 1) int i) {
        if (i >= 1) {
            int[] iArr = new int[i];
            nCreateArray(this.mNativeObject, i, iArr);
            return iArr;
        }
        throw new ArrayIndexOutOfBoundsException("n must be at least 1");
    }

    @NonNull
    public int[] create(@NonNull @Entity int[] iArr) {
        nCreateArray(this.mNativeObject, iArr.length, iArr);
        return iArr;
    }

    public void destroy(@Entity int i) {
        nDestroy(this.mNativeObject, i);
    }

    public void destroy(@NonNull @Entity int[] iArr) {
        nDestroyArray(this.mNativeObject, iArr.length, iArr);
    }

    /* access modifiers changed from: package-private */
    @UsedByReflection("AssetLoader.java")
    public long getNativeObject() {
        return this.mNativeObject;
    }

    public boolean isAlive(@Entity int i) {
        return nIsAlive(this.mNativeObject, i);
    }
}
