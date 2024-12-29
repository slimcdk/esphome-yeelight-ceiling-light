package com.google.p107ar.core;

import android.hardware.camera2.CameraDevice;

/* renamed from: com.google.ar.core.n */
final /* synthetic */ class C2653n implements Runnable {

    /* renamed from: a */
    private final CameraDevice.StateCallback f5130a;

    /* renamed from: b */
    private final CameraDevice f5131b;

    C2653n(CameraDevice.StateCallback stateCallback, CameraDevice cameraDevice) {
        this.f5130a = stateCallback;
        this.f5131b = cameraDevice;
    }

    public final void run() {
        this.f5130a.onOpened(this.f5131b);
    }
}
