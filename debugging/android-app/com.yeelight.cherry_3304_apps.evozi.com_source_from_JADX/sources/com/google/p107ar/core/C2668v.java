package com.google.p107ar.core;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: com.google.ar.core.v */
final /* synthetic */ class C2668v implements Runnable {

    /* renamed from: a */
    private final CameraCaptureSession.StateCallback f5162a;

    /* renamed from: b */
    private final CameraCaptureSession f5163b;

    C2668v(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        this.f5162a = stateCallback;
        this.f5163b = cameraCaptureSession;
    }

    public final void run() {
        this.f5162a.onConfigured(this.f5163b);
    }
}
