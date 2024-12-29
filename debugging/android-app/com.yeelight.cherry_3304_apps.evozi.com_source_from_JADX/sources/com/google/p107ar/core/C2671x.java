package com.google.p107ar.core;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: com.google.ar.core.x */
final /* synthetic */ class C2671x implements Runnable {

    /* renamed from: a */
    private final CameraCaptureSession.StateCallback f5169a;

    /* renamed from: b */
    private final CameraCaptureSession f5170b;

    C2671x(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        this.f5169a = stateCallback;
        this.f5170b = cameraCaptureSession;
    }

    public final void run() {
        this.f5169a.onReady(this.f5170b);
    }
}
