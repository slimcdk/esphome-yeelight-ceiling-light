package com.google.p017ar.core;

import android.util.Range;
import android.util.Size;
import com.google.p017ar.core.exceptions.FatalException;

/* renamed from: com.google.ar.core.CameraConfig */
public class CameraConfig {
    long nativeHandle;
    final Session session;

    /* renamed from: com.google.ar.core.CameraConfig$DepthSensorUsage */
    public enum DepthSensorUsage {
        REQUIRE_AND_USE(1),
        DO_NOT_USE(2);
        
        final int nativeCode;

        private DepthSensorUsage(int i) {
            this.nativeCode = i;
        }

        static DepthSensorUsage forNumber(int i) {
            for (DepthSensorUsage depthSensorUsage : values()) {
                if (depthSensorUsage.nativeCode == i) {
                    return depthSensorUsage;
                }
            }
            StringBuilder sb = new StringBuilder(63);
            sb.append("Unexpected value for native DepthSensorUsage, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }
    }

    /* renamed from: com.google.ar.core.CameraConfig$FacingDirection */
    public enum FacingDirection {
        BACK(0),
        FRONT(1);
        
        final int nativeCode;

        private FacingDirection(int i) {
            this.nativeCode = i;
        }

        static FacingDirection forNumber(int i) {
            for (FacingDirection facingDirection : values()) {
                if (facingDirection.nativeCode == i) {
                    return facingDirection;
                }
            }
            StringBuilder sb = new StringBuilder(62);
            sb.append("Unexpected value for native FacingDirection, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }
    }

    /* renamed from: com.google.ar.core.CameraConfig$TargetFps */
    public enum TargetFps {
        TARGET_FPS_30(1),
        TARGET_FPS_60(2);
        
        final int nativeCode;

        private TargetFps(int i) {
            this.nativeCode = i;
        }
    }

    protected CameraConfig() {
        this.session = null;
        this.nativeHandle = 0;
    }

    CameraConfig(Session session2, long j) {
        this.session = session2;
        this.nativeHandle = j;
    }

    private static native void nativeDestroyCameraConfig(long j);

    private native String nativeGetCameraId(long j, long j2);

    private native int nativeGetDepthSensorUsage(long j, long j2);

    private native int nativeGetFacingDirection(long j, long j2);

    private native void nativeGetFpsRange(long j, long j2, int[] iArr);

    private native void nativeGetImageDimensions(long j, long j2, int[] iArr);

    private native void nativeGetTextureDimensions(long j, long j2, int[] iArr);

    /* access modifiers changed from: protected */
    public void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeDestroyCameraConfig(j);
            this.nativeHandle = 0;
        }
        super.finalize();
    }

    public String getCameraId() {
        return nativeGetCameraId(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public DepthSensorUsage getDepthSensorUsage() {
        return DepthSensorUsage.forNumber(nativeGetDepthSensorUsage(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public FacingDirection getFacingDirection() {
        return FacingDirection.forNumber(nativeGetFacingDirection(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public Range<Integer> getFpsRange() {
        int[] iArr = new int[2];
        nativeGetFpsRange(this.session.nativeWrapperHandle, this.nativeHandle, iArr);
        return new Range<>(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
    }

    public Size getImageSize() {
        int[] iArr = new int[2];
        nativeGetImageDimensions(this.session.nativeWrapperHandle, this.nativeHandle, iArr);
        return new Size(iArr[0], iArr[1]);
    }

    public Size getTextureSize() {
        int[] iArr = new int[2];
        nativeGetTextureDimensions(this.session.nativeWrapperHandle, this.nativeHandle, iArr);
        return new Size(iArr[0], iArr[1]);
    }
}
