package com.google.p017ar.core;

import android.hardware.camera2.CameraDevice;

/* renamed from: com.google.ar.core.p */
final /* synthetic */ class C2049p implements Runnable {

    /* renamed from: a */
    private final CameraDevice.StateCallback f3214a;

    /* renamed from: b */
    private final CameraDevice f3215b;

    C2049p(CameraDevice.StateCallback stateCallback, CameraDevice cameraDevice) {
        this.f3214a = stateCallback;
        this.f3215b = cameraDevice;
    }

    public final void run() {
        this.f3214a.onClosed(this.f3215b);
    }
}
