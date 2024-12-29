package com.google.p017ar.core;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: com.google.ar.core.v */
final /* synthetic */ class C2054v implements Runnable {

    /* renamed from: a */
    private final CameraCaptureSession.StateCallback f3226a;

    /* renamed from: b */
    private final CameraCaptureSession f3227b;

    C2054v(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        this.f3226a = stateCallback;
        this.f3227b = cameraCaptureSession;
    }

    public final void run() {
        this.f3226a.onConfigureFailed(this.f3227b);
    }
}
