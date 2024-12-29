package com.google.p107ar.core;

import android.hardware.camera2.CameraDevice;

/* renamed from: com.google.ar.core.p */
final /* synthetic */ class C2657p implements Runnable {

    /* renamed from: a */
    private final CameraDevice.StateCallback f5137a;

    /* renamed from: b */
    private final CameraDevice f5138b;

    /* renamed from: c */
    private final int f5139c;

    C2657p(CameraDevice.StateCallback stateCallback, CameraDevice cameraDevice, int i) {
        this.f5137a = stateCallback;
        this.f5138b = cameraDevice;
        this.f5139c = i;
    }

    public final void run() {
        this.f5137a.onError(this.f5138b, this.f5139c);
    }
}
