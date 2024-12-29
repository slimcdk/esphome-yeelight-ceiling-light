package com.google.android.filament;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.view.Surface;

final class AndroidPlatform extends Platform {
    private static final String LOG_TAG = "Filament";

    /* renamed from: a */
    public static final /* synthetic */ int f451a = 0;

    static {
        EGL14.eglGetDisplay(0);
    }

    AndroidPlatform() {
    }

    /* access modifiers changed from: package-private */
    public long getSharedContextNativeHandle(Object obj) {
        return ((EGLContext) obj).getNativeHandle();
    }

    /* access modifiers changed from: package-private */
    public void log(String str) {
    }

    /* access modifiers changed from: package-private */
    public boolean validateSharedContext(Object obj) {
        return obj instanceof EGLContext;
    }

    /* access modifiers changed from: package-private */
    public boolean validateStreamSource(Object obj) {
        return obj instanceof SurfaceTexture;
    }

    /* access modifiers changed from: package-private */
    public boolean validateSurface(Object obj) {
        return obj instanceof Surface;
    }

    /* access modifiers changed from: package-private */
    public void warn(String str) {
    }
}
