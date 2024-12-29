package com.google.p017ar.core;

import android.hardware.camera2.CameraCaptureSession;
import android.os.Handler;
import com.google.p017ar.core.SharedCamera;

/* renamed from: com.google.ar.core.u */
final class C2053u extends CameraCaptureSession.StateCallback {

    /* renamed from: a */
    private final /* synthetic */ Handler f3223a;

    /* renamed from: b */
    private final /* synthetic */ CameraCaptureSession.StateCallback f3224b;

    /* renamed from: c */
    private final /* synthetic */ SharedCamera f3225c;

    C2053u(SharedCamera sharedCamera, Handler handler, CameraCaptureSession.StateCallback stateCallback) {
        this.f3225c = sharedCamera;
        this.f3223a = handler;
        this.f3224b = stateCallback;
    }

    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        this.f3223a.post(new C2056x(this.f3224b, cameraCaptureSession));
        this.f3225c.onCaptureSessionActive(cameraCaptureSession);
    }

    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        this.f3223a.post(new C2052t(this.f3224b, cameraCaptureSession));
        this.f3225c.onCaptureSessionClosed(cameraCaptureSession);
    }

    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        this.f3223a.post(new C2054v(this.f3224b, cameraCaptureSession));
        this.f3225c.onCaptureSessionConfigureFailed(cameraCaptureSession);
    }

    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        SharedCamera.C2011a unused = this.f3225c.sharedCameraInfo;
        this.f3223a.post(new C2055w(this.f3224b, cameraCaptureSession));
        this.f3225c.onCaptureSessionConfigured(cameraCaptureSession);
        if (this.f3225c.sharedCameraInfo.mo16624a() != null) {
            this.f3225c.setDummyListenerToAvoidImageBufferStarvation();
        }
    }

    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        this.f3223a.post(new C2057y(this.f3224b, cameraCaptureSession));
        this.f3225c.onCaptureSessionReady(cameraCaptureSession);
    }
}
