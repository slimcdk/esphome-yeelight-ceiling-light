package com.google.p017ar.core;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: com.google.ar.core.y */
final /* synthetic */ class C2057y implements Runnable {

    /* renamed from: a */
    private final CameraCaptureSession.StateCallback f3232a;

    /* renamed from: b */
    private final CameraCaptureSession f3233b;

    C2057y(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        this.f3232a = stateCallback;
        this.f3233b = cameraCaptureSession;
    }

    public final void run() {
        this.f3232a.onReady(this.f3233b);
    }
}
