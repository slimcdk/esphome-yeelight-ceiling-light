package com.google.p017ar.core;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: com.google.ar.core.w */
final /* synthetic */ class C2055w implements Runnable {

    /* renamed from: a */
    private final CameraCaptureSession.StateCallback f3228a;

    /* renamed from: b */
    private final CameraCaptureSession f3229b;

    C2055w(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        this.f3228a = stateCallback;
        this.f3229b = cameraCaptureSession;
    }

    public final void run() {
        this.f3228a.onConfigured(this.f3229b);
    }
}
