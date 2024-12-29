package com.google.p107ar.core;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: com.google.ar.core.w */
final /* synthetic */ class C2670w implements Runnable {

    /* renamed from: a */
    private final CameraCaptureSession.StateCallback f5167a;

    /* renamed from: b */
    private final CameraCaptureSession f5168b;

    C2670w(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        this.f5167a = stateCallback;
        this.f5168b = cameraCaptureSession;
    }

    public final void run() {
        this.f5167a.onActive(this.f5168b);
    }
}
