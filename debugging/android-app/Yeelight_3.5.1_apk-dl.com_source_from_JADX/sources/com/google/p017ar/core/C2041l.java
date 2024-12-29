package com.google.p017ar.core;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;

/* renamed from: com.google.ar.core.l */
final class C2041l extends CameraDevice.StateCallback {

    /* renamed from: a */
    private final /* synthetic */ Handler f3195a;

    /* renamed from: b */
    private final /* synthetic */ CameraDevice.StateCallback f3196b;

    /* renamed from: c */
    private final /* synthetic */ SharedCamera f3197c;

    C2041l(SharedCamera sharedCamera, Handler handler, CameraDevice.StateCallback stateCallback) {
        this.f3197c = sharedCamera;
        this.f3195a = handler;
        this.f3196b = stateCallback;
    }

    public final void onClosed(CameraDevice cameraDevice) {
        this.f3195a.post(new C2049p(this.f3196b, cameraDevice));
        this.f3197c.onDeviceClosed(cameraDevice);
    }

    public final void onDisconnected(CameraDevice cameraDevice) {
        this.f3195a.post(new C2051s(this.f3196b, cameraDevice));
        this.f3197c.onDeviceDisconnected(cameraDevice);
    }

    public final void onError(CameraDevice cameraDevice, int i) {
        this.f3195a.post(new C2050q(this.f3196b, cameraDevice, i));
        this.f3197c.close();
    }

    public final void onOpened(CameraDevice cameraDevice) {
        this.f3197c.sharedCameraInfo.mo16626c(cameraDevice);
        this.f3195a.post(new C2045n(this.f3196b, cameraDevice));
        this.f3197c.onDeviceOpened(cameraDevice);
        this.f3197c.sharedCameraInfo.mo16625b(this.f3197c.getGpuSurfaceTexture());
        this.f3197c.sharedCameraInfo.mo16627d(this.f3197c.getGpuSurface());
    }
}
