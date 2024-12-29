package com.google.p017ar.core;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: com.google.ar.core.x */
final /* synthetic */ class C2056x implements Runnable {

    /* renamed from: a */
    private final CameraCaptureSession.StateCallback f3230a;

    /* renamed from: b */
    private final CameraCaptureSession f3231b;

    C2056x(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        this.f3230a = stateCallback;
        this.f3231b = cameraCaptureSession;
    }

    public final void run() {
        this.f3230a.onActive(this.f3231b);
    }
}
