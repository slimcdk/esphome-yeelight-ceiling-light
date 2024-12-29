package com.google.p017ar.core;

/* renamed from: com.google.ar.core.HitResult */
public class HitResult {
    long nativeHandle;
    private final Session session;

    protected HitResult() {
        this.session = null;
        this.nativeHandle = 0;
    }

    HitResult(long j, Session session2) {
        this.session = session2;
        this.nativeHandle = j;
    }

    private native long nativeCreateAnchor(long j, long j2);

    private static native void nativeDestroyHitResult(long j);

    private native float nativeGetDistance(long j, long j2);

    private native Pose nativeGetPose(long j, long j2);

    public Anchor createAnchor() {
        return new Anchor(nativeCreateAnchor(this.session.nativeWrapperHandle, this.nativeHandle), this.session);
    }

    public boolean equals(Object obj) {
        return (obj instanceof HitResult) && ((HitResult) obj).nativeHandle == this.nativeHandle;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeDestroyHitResult(j);
        }
        super.finalize();
    }

    public float getDistance() {
        return nativeGetDistance(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public Pose getHitPose() {
        return nativeGetPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public Trackable getTrackable() {
        return this.session.createTrackable(nativeAcquireTrackable(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public int hashCode() {
        return Long.valueOf(this.nativeHandle).hashCode();
    }

    /* access modifiers changed from: package-private */
    public native long nativeAcquireTrackable(long j, long j2);
}
