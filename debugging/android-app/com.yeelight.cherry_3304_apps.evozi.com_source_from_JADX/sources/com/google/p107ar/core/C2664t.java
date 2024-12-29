package com.google.p107ar.core;

import android.hardware.camera2.CameraCaptureSession;
import android.os.Handler;
import com.google.p107ar.core.SharedCamera;

/* renamed from: com.google.ar.core.t */
final class C2664t extends CameraCaptureSession.StateCallback {

    /* renamed from: a */
    private final /* synthetic */ Handler f5153a;

    /* renamed from: b */
    private final /* synthetic */ CameraCaptureSession.StateCallback f5154b;

    /* renamed from: c */
    private final /* synthetic */ SharedCamera f5155c;

    C2664t(SharedCamera sharedCamera, Handler handler, CameraCaptureSession.StateCallback stateCallback) {
        this.f5155c = sharedCamera;
        this.f5153a = handler;
        this.f5154b = stateCallback;
    }

    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        this.f5153a.post(new C2670w(this.f5154b, cameraCaptureSession));
        this.f5155c.onCaptureSessionActive(cameraCaptureSession);
    }

    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        this.f5153a.post(new C2662s(this.f5154b, cameraCaptureSession));
        this.f5155c.onCaptureSessionClosed(cameraCaptureSession);
    }

    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        this.f5153a.post(new C2666u(this.f5154b, cameraCaptureSession));
        this.f5155c.onCaptureSessionConfigureFailed(cameraCaptureSession);
    }

    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        SharedCamera.C2626a unused = this.f5155c.sharedCameraInfo;
        this.f5153a.post(new C2668v(this.f5154b, cameraCaptureSession));
        this.f5155c.onCaptureSessionConfigured(cameraCaptureSession);
        if (this.f5155c.sharedCameraInfo.mo15174a() != null) {
            this.f5155c.setDummyListenerToAvoidImageBufferStarvation();
        }
    }

    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        this.f5153a.post(new C2671x(this.f5154b, cameraCaptureSession));
        this.f5155c.onCaptureSessionReady(cameraCaptureSession);
    }
}
