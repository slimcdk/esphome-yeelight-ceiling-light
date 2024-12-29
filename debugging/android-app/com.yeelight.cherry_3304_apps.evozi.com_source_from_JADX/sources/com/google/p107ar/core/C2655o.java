package com.google.p107ar.core;

import android.hardware.camera2.CameraDevice;

/* renamed from: com.google.ar.core.o */
final /* synthetic */ class C2655o implements Runnable {

    /* renamed from: a */
    private final CameraDevice.StateCallback f5133a;

    /* renamed from: b */
    private final CameraDevice f5134b;

    C2655o(CameraDevice.StateCallback stateCallback, CameraDevice cameraDevice) {
        this.f5133a = stateCallback;
        this.f5134b = cameraDevice;
    }

    public final void run() {
        this.f5133a.onClosed(this.f5134b);
    }
}
