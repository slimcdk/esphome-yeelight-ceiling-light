package com.google.p017ar.core;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: com.google.ar.core.t */
final /* synthetic */ class C2052t implements Runnable {

    /* renamed from: a */
    private final CameraCaptureSession.StateCallback f3221a;

    /* renamed from: b */
    private final CameraCaptureSession f3222b;

    C2052t(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        this.f3221a = stateCallback;
        this.f3222b = cameraCaptureSession;
    }

    public final void run() {
        this.f3221a.onClosed(this.f3222b);
    }
}
