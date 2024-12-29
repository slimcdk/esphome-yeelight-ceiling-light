package com.google.p107ar.core;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: com.google.ar.core.s */
final /* synthetic */ class C2662s implements Runnable {

    /* renamed from: a */
    private final CameraCaptureSession.StateCallback f5149a;

    /* renamed from: b */
    private final CameraCaptureSession f5150b;

    C2662s(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        this.f5149a = stateCallback;
        this.f5150b = cameraCaptureSession;
    }

    public final void run() {
        this.f5149a.onClosed(this.f5150b);
    }
}
