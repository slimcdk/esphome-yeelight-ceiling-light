package com.google.p107ar.core;

import com.google.p107ar.core.CameraConfig;
import java.util.EnumSet;
import java.util.Iterator;

/* renamed from: com.google.ar.core.CameraConfigFilter */
public class CameraConfigFilter {
    private static final String TAG = "CameraConfigFilter";
    long nativeHandle;
    final Session session;

    protected CameraConfigFilter() {
        this.session = null;
        this.nativeHandle = 0;
    }

    public CameraConfigFilter(Session session2) {
        this.session = session2;
        this.nativeHandle = nativeCreateCameraConfigFilter(session2.nativeWrapperHandle);
    }

    private static native long nativeCreateCameraConfigFilter(long j);

    private static native void nativeDestroyCameraConfigFilter(long j);

    private native void nativeSetDepthSensorUsage(long j, long j2, int i);

    private native void nativeSetTargetFps(long j, long j2, int i);

    /* access modifiers changed from: protected */
    public void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeDestroyCameraConfigFilter(j);
            this.nativeHandle = 0;
        }
        super.finalize();
    }

    public CameraConfigFilter setDepthSensorUsage(EnumSet<CameraConfig.DepthSensorUsage> enumSet) {
        Iterator it = enumSet.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((CameraConfig.DepthSensorUsage) it.next()).nativeCode;
        }
        nativeSetDepthSensorUsage(this.session.nativeWrapperHandle, this.nativeHandle, i);
        return this;
    }

    public CameraConfigFilter setTargetFps(EnumSet<CameraConfig.TargetFps> enumSet) {
        Iterator it = enumSet.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((CameraConfig.TargetFps) it.next()).nativeCode;
        }
        nativeSetTargetFps(this.session.nativeWrapperHandle, this.nativeHandle, i);
        return this;
    }
}
