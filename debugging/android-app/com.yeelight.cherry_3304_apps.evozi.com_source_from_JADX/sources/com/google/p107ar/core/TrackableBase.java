package com.google.p107ar.core;

import com.google.p107ar.core.annotations.UsedByNative;
import java.util.Collection;

@UsedByNative("trackable_base_jni.cc")
/* renamed from: com.google.ar.core.TrackableBase */
class TrackableBase implements Trackable {
    long nativeHandle;
    final Session session;

    TrackableBase(long j, Session session2) {
        this.session = session2;
        this.nativeHandle = j;
    }

    static int internalGetType(long j, long j2) {
        return nativeGetType(j, j2);
    }

    static void internalReleaseNativeHandle(long j) {
        nativeReleaseTrackable(j);
    }

    private native long nativeCreateAnchor(long j, long j2, Pose pose);

    private native long[] nativeGetAnchors(long j, long j2);

    private native int nativeGetTrackingState(long j, long j2);

    private static native int nativeGetType(long j, long j2);

    private static native void nativeReleaseTrackable(long j);

    public Anchor createAnchor(Pose pose) {
        return new Anchor(nativeCreateAnchor(this.session.nativeWrapperHandle, this.nativeHandle, pose), this.session);
    }

    public boolean equals(Object obj) {
        return (obj instanceof TrackableBase) && ((TrackableBase) obj).nativeHandle == this.nativeHandle;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeReleaseTrackable(j);
            this.nativeHandle = 0;
        }
        super.finalize();
    }

    public Collection<Anchor> getAnchors() {
        Session session2 = this.session;
        return session2.convertNativeAnchorsToCollection(nativeGetAnchors(session2.nativeWrapperHandle, this.nativeHandle));
    }

    public TrackingState getTrackingState() {
        return TrackingState.forNumber(nativeGetTrackingState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public int hashCode() {
        return Long.valueOf(this.nativeHandle).hashCode();
    }
}
