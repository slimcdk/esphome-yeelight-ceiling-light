package com.google.p107ar.core;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;

/* renamed from: com.google.ar.core.l */
final class C2649l extends CameraDevice.StateCallback {

    /* renamed from: a */
    private final /* synthetic */ Handler f5114a;

    /* renamed from: b */
    private final /* synthetic */ CameraDevice.StateCallback f5115b;

    /* renamed from: c */
    private final /* synthetic */ SharedCamera f5116c;

    C2649l(SharedCamera sharedCamera, Handler handler, CameraDevice.StateCallback stateCallback) {
        this.f5116c = sharedCamera;
        this.f5114a = handler;
        this.f5115b = stateCallback;
    }

    public final void onClosed(CameraDevice cameraDevice) {
        this.f5114a.post(new C2655o(this.f5115b, cameraDevice));
        this.f5116c.onDeviceClosed(cameraDevice);
    }

    public final void onDisconnected(CameraDevice cameraDevice) {
        this.f5114a.post(new C2659q(this.f5115b, cameraDevice));
        this.f5116c.onDeviceDisconnected(cameraDevice);
    }

    public final void onError(CameraDevice cameraDevice, int i) {
        this.f5114a.post(new C2657p(this.f5115b, cameraDevice, i));
        this.f5116c.close();
    }

    public final void onOpened(CameraDevice cameraDevice) {
        this.f5116c.sharedCameraInfo.mo15176c(cameraDevice);
        this.f5114a.post(new C2653n(this.f5115b, cameraDevice));
        this.f5116c.onDeviceOpened(cameraDevice);
        this.f5116c.sharedCameraInfo.mo15175b(this.f5116c.getGpuSurfaceTexture());
        this.f5116c.sharedCameraInfo.mo15177d(this.f5116c.getGpuSurface());
    }
}
