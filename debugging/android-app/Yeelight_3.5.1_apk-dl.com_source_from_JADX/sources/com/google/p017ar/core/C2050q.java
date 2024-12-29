package com.google.p017ar.core;

import android.hardware.camera2.CameraDevice;

/* renamed from: com.google.ar.core.q */
final /* synthetic */ class C2050q implements Runnable {

    /* renamed from: a */
    private final CameraDevice.StateCallback f3216a;

    /* renamed from: b */
    private final CameraDevice f3217b;

    /* renamed from: c */
    private final int f3218c;

    C2050q(CameraDevice.StateCallback stateCallback, CameraDevice cameraDevice, int i) {
        this.f3216a = stateCallback;
        this.f3217b = cameraDevice;
        this.f3218c = i;
    }

    public final void run() {
        this.f3216a.onError(this.f3217b, this.f3218c);
    }
}
