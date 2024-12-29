package com.google.p017ar.core;

import android.hardware.camera2.CameraDevice;

/* renamed from: com.google.ar.core.s */
final /* synthetic */ class C2051s implements Runnable {

    /* renamed from: a */
    private final CameraDevice.StateCallback f3219a;

    /* renamed from: b */
    private final CameraDevice f3220b;

    C2051s(CameraDevice.StateCallback stateCallback, CameraDevice cameraDevice) {
        this.f3219a = stateCallback;
        this.f3220b = cameraDevice;
    }

    public final void run() {
        this.f3219a.onDisconnected(this.f3220b);
    }
}
