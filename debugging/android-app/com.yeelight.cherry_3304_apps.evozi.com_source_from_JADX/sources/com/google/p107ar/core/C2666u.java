package com.google.p107ar.core;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: com.google.ar.core.u */
final /* synthetic */ class C2666u implements Runnable {

    /* renamed from: a */
    private final CameraCaptureSession.StateCallback f5158a;

    /* renamed from: b */
    private final CameraCaptureSession f5159b;

    C2666u(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        this.f5158a = stateCallback;
        this.f5159b = cameraCaptureSession;
    }

    public final void run() {
        this.f5158a.onConfigureFailed(this.f5159b);
    }
}
