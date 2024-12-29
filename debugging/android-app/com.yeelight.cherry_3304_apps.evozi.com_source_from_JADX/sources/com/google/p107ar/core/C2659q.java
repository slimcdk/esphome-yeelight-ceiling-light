package com.google.p107ar.core;

import android.hardware.camera2.CameraDevice;

/* renamed from: com.google.ar.core.q */
final /* synthetic */ class C2659q implements Runnable {

    /* renamed from: a */
    private final CameraDevice.StateCallback f5141a;

    /* renamed from: b */
    private final CameraDevice f5142b;

    C2659q(CameraDevice.StateCallback stateCallback, CameraDevice cameraDevice) {
        this.f5141a = stateCallback;
        this.f5142b = cameraDevice;
    }

    public final void run() {
        this.f5141a.onDisconnected(this.f5142b);
    }
}
