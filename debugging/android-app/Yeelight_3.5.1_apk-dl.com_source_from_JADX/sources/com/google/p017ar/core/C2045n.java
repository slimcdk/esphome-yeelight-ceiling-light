package com.google.p017ar.core;

import android.hardware.camera2.CameraDevice;

/* renamed from: com.google.ar.core.n */
final /* synthetic */ class C2045n implements Runnable {

    /* renamed from: a */
    private final CameraDevice.StateCallback f3203a;

    /* renamed from: b */
    private final CameraDevice f3204b;

    C2045n(CameraDevice.StateCallback stateCallback, CameraDevice cameraDevice) {
        this.f3203a = stateCallback;
        this.f3204b = cameraDevice;
    }

    public final void run() {
        this.f3203a.onOpened(this.f3204b);
    }
}
