package com.google.android.filament;

import androidx.annotation.Nullable;

public class Scene {
    @Nullable
    private IndirectLight mIndirectLight;
    private long mNativeObject;
    @Nullable
    private Skybox mSkybox;

    Scene(long j) {
        this.mNativeObject = j;
    }

    private static native void nAddEntities(long j, int[] iArr);

    private static native void nAddEntity(long j, int i);

    private static native int nGetLightCount(long j);

    private static native int nGetRenderableCount(long j);

    private static native void nRemove(long j, int i);

    private static native void nSetIndirectLight(long j, long j2);

    private static native void nSetSkybox(long j, long j2);

    public void addEntities(@Entity int[] iArr) {
        nAddEntities(getNativeObject(), iArr);
    }

    public void addEntity(@Entity int i) {
        nAddEntity(getNativeObject(), i);
    }

    /* access modifiers changed from: package-private */
    public void clearNativeObject() {
        this.mNativeObject = 0;
    }

    @Nullable
    public IndirectLight getIndirectLight() {
        return this.mIndirectLight;
    }

    public int getLightCount() {
        return nGetLightCount(getNativeObject());
    }

    /* access modifiers changed from: package-private */
    public long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Calling method on destroyed Scene");
    }

    public int getRenderableCount() {
        return nGetRenderableCount(getNativeObject());
    }

    @Nullable
    public Skybox getSkybox() {
        return this.mSkybox;
    }

    public void remove(@Entity int i) {
        removeEntity(i);
    }

    public void removeEntity(@Entity int i) {
        nRemove(getNativeObject(), i);
    }

    public void setIndirectLight(@Nullable IndirectLight indirectLight) {
        this.mIndirectLight = indirectLight;
        long nativeObject = getNativeObject();
        IndirectLight indirectLight2 = this.mIndirectLight;
        nSetIndirectLight(nativeObject, indirectLight2 != null ? indirectLight2.getNativeObject() : 0);
    }

    public void setSkybox(@Nullable Skybox skybox) {
        this.mSkybox = skybox;
        long nativeObject = getNativeObject();
        Skybox skybox2 = this.mSkybox;
        nSetSkybox(nativeObject, skybox2 != null ? skybox2.getNativeObject() : 0);
    }
}
