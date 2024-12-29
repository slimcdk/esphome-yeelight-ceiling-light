package com.google.p017ar.core;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ar.core.SharedCamera */
public class SharedCamera {
    private static final String TAG = "ArSdk-SharedCamera";
    private boolean cameraSharedWithAr = false;
    private final Session session;
    private Handler sharedCameraHandler;
    /* access modifiers changed from: private */
    public final C2011a sharedCameraInfo = new C2011a((byte) 0);

    /* renamed from: com.google.ar.core.SharedCamera$a */
    static class C2011a {

        /* renamed from: a */
        private CameraDevice f3160a;

        /* renamed from: b */
        private final Map<String, List<Surface>> f3161b;

        /* renamed from: c */
        private SurfaceTexture f3162c;

        /* renamed from: d */
        private Surface f3163d;

        private C2011a() {
            this.f3160a = null;
            this.f3161b = new HashMap();
            this.f3162c = null;
            this.f3163d = null;
        }

        /* synthetic */ C2011a(byte b) {
            this();
        }

        /* renamed from: a */
        public final CameraDevice mo16624a() {
            return this.f3160a;
        }

        /* renamed from: b */
        public final void mo16625b(SurfaceTexture surfaceTexture) {
            this.f3162c = surfaceTexture;
        }

        /* renamed from: c */
        public final void mo16626c(CameraDevice cameraDevice) {
            this.f3160a = cameraDevice;
        }

        /* renamed from: d */
        public final void mo16627d(Surface surface) {
            this.f3163d = surface;
        }

        /* renamed from: e */
        public final void mo16628e(String str, List<Surface> list) {
            this.f3161b.put(str, list);
        }

        /* renamed from: f */
        public final SurfaceTexture mo16629f() {
            return this.f3162c;
        }

        /* renamed from: g */
        public final Surface mo16630g() {
            return this.f3163d;
        }
    }

    SharedCamera(Session session2) {
        HandlerThread handlerThread = new HandlerThread("SharedCameraHandlerThread");
        handlerThread.start();
        this.sharedCameraHandler = new Handler(handlerThread.getLooper());
        this.session = session2;
    }

    /* access modifiers changed from: private */
    public void close() {
        this.sharedCameraHandler.removeCallbacksAndMessages((Object) null);
        this.sharedCameraHandler.getLooper().quit();
        this.sharedCameraHandler = null;
    }

    private ImageReader getCpuImageReader() {
        return nativeSharedCameraGetImageReader(this.session.nativeWrapperHandle, this.sharedCameraInfo.mo16624a());
    }

    private ImageReader getCpuImageReaderMotionTracking() {
        return nativeSharedCameraGetImageReaderMotionTracking(this.session.nativeWrapperHandle, this.sharedCameraInfo.mo16624a());
    }

    /* access modifiers changed from: private */
    public Surface getGpuSurface() {
        return nativeSharedCameraGetSurface(this.session.nativeWrapperHandle, this.sharedCameraInfo.mo16624a());
    }

    /* access modifiers changed from: private */
    public SurfaceTexture getGpuSurfaceTexture() {
        return nativeSharedCameraGetSurfaceTexture(this.session.nativeWrapperHandle, this.sharedCameraInfo.mo16624a());
    }

    static final /* synthetic */ void lambda$setDummyOnImageAvailableListener$0$SharedCamera(ImageReader imageReader) {
        Image acquireLatestImage = imageReader.acquireLatestImage();
        if (acquireLatestImage != null) {
            acquireLatestImage.close();
        }
    }

    private native void nativeSharedCameraCaptureSessionActive(long j, CameraCaptureSession cameraCaptureSession);

    private native void nativeSharedCameraCaptureSessionClosed(long j, CameraCaptureSession cameraCaptureSession);

    private native void nativeSharedCameraCaptureSessionConfigureFailed(long j, CameraCaptureSession cameraCaptureSession);

    private native void nativeSharedCameraCaptureSessionConfigured(long j, CameraCaptureSession cameraCaptureSession);

    private native void nativeSharedCameraCaptureSessionReady(long j, CameraCaptureSession cameraCaptureSession);

    private native ImageReader nativeSharedCameraGetImageReader(long j, CameraDevice cameraDevice);

    private native ImageReader nativeSharedCameraGetImageReaderMotionTracking(long j, CameraDevice cameraDevice);

    private native Surface nativeSharedCameraGetSurface(long j, CameraDevice cameraDevice);

    private native SurfaceTexture nativeSharedCameraGetSurfaceTexture(long j, CameraDevice cameraDevice);

    private native void nativeSharedCameraOnClosed(long j, CameraDevice cameraDevice);

    private native void nativeSharedCameraOnDisconnected(long j, CameraDevice cameraDevice);

    private native void nativeSharedCameraOnOpened(long j, CameraDevice cameraDevice);

    private native void nativeSharedCameraSetAppSurfaces(long j, String str, List<Surface> list);

    private native void nativeSharedCameraSetCaptureCallback(long j, CameraCaptureSession.CaptureCallback captureCallback, Handler handler);

    /* access modifiers changed from: private */
    public void onCaptureSessionActive(CameraCaptureSession cameraCaptureSession) {
        nativeSharedCameraCaptureSessionActive(this.session.nativeWrapperHandle, cameraCaptureSession);
    }

    /* access modifiers changed from: private */
    public void onCaptureSessionClosed(CameraCaptureSession cameraCaptureSession) {
        nativeSharedCameraCaptureSessionClosed(this.session.nativeWrapperHandle, cameraCaptureSession);
    }

    /* access modifiers changed from: private */
    public void onCaptureSessionConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        nativeSharedCameraCaptureSessionConfigureFailed(this.session.nativeWrapperHandle, cameraCaptureSession);
    }

    /* access modifiers changed from: private */
    public void onCaptureSessionConfigured(CameraCaptureSession cameraCaptureSession) {
        nativeSharedCameraCaptureSessionConfigured(this.session.nativeWrapperHandle, cameraCaptureSession);
    }

    /* access modifiers changed from: private */
    public void onCaptureSessionReady(CameraCaptureSession cameraCaptureSession) {
        nativeSharedCameraCaptureSessionReady(this.session.nativeWrapperHandle, cameraCaptureSession);
    }

    /* access modifiers changed from: private */
    public void onDeviceClosed(CameraDevice cameraDevice) {
        nativeSharedCameraOnClosed(this.session.nativeWrapperHandle, cameraDevice);
        this.cameraSharedWithAr = false;
    }

    /* access modifiers changed from: private */
    public void onDeviceDisconnected(CameraDevice cameraDevice) {
        nativeSharedCameraOnDisconnected(this.session.nativeWrapperHandle, cameraDevice);
        this.cameraSharedWithAr = false;
        this.sharedCameraInfo.mo16626c((CameraDevice) null);
    }

    /* access modifiers changed from: private */
    public void onDeviceOpened(CameraDevice cameraDevice) {
        this.sharedCameraInfo.mo16626c(cameraDevice);
        this.cameraSharedWithAr = true;
        nativeSharedCameraOnOpened(this.session.nativeWrapperHandle, cameraDevice);
    }

    /* access modifiers changed from: private */
    public void setDummyListenerToAvoidImageBufferStarvation() {
        setDummyOnImageAvailableListener(getCpuImageReader());
        setDummyOnImageAvailableListener(getCpuImageReaderMotionTracking());
    }

    private void setDummyOnImageAvailableListener(ImageReader imageReader) {
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener(C2043m.f3200a, this.sharedCameraHandler);
        }
    }

    public CameraDevice.StateCallback createARDeviceStateCallback(CameraDevice.StateCallback stateCallback, Handler handler) {
        return new C2041l(this, handler, stateCallback);
    }

    public CameraCaptureSession.StateCallback createARSessionStateCallback(CameraCaptureSession.StateCallback stateCallback, Handler handler) {
        return new C2053u(this, handler, stateCallback);
    }

    public List<Surface> getArCoreSurfaces() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.sharedCameraInfo.mo16630g());
        ImageReader cpuImageReaderMotionTracking = getCpuImageReaderMotionTracking();
        if (cpuImageReaderMotionTracking != null) {
            arrayList.add(cpuImageReaderMotionTracking.getSurface());
        }
        arrayList.add(getCpuImageReader().getSurface());
        return arrayList;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.sharedCameraInfo.mo16629f();
    }

    /* access modifiers changed from: package-private */
    public void pause() {
        if (this.sharedCameraInfo.mo16624a() != null) {
            setDummyListenerToAvoidImageBufferStarvation();
        }
    }

    public void setAppSurfaces(String str, List<Surface> list) {
        this.sharedCameraInfo.mo16628e(str, list);
        nativeSharedCameraSetAppSurfaces(this.session.nativeWrapperHandle, str, list);
    }

    public void setCaptureCallback(CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        nativeSharedCameraSetCaptureCallback(this.session.nativeWrapperHandle, captureCallback, handler);
    }
}
