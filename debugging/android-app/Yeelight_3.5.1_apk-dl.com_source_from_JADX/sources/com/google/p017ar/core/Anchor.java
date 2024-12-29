package com.google.p017ar.core;

import com.google.p017ar.core.exceptions.FatalException;

/* renamed from: com.google.ar.core.Anchor */
public class Anchor {
    long nativeHandle;
    private final Session session;

    /* renamed from: com.google.ar.core.Anchor$CloudAnchorState */
    public enum CloudAnchorState {
        NONE(0),
        TASK_IN_PROGRESS(1),
        SUCCESS(2),
        ERROR_INTERNAL(-1),
        ERROR_NOT_AUTHORIZED(-2),
        ERROR_SERVICE_UNAVAILABLE(-3),
        ERROR_RESOURCE_EXHAUSTED(-4),
        ERROR_HOSTING_DATASET_PROCESSING_FAILED(-5),
        ERROR_CLOUD_ID_NOT_FOUND(-6),
        ERROR_RESOLVING_LOCALIZATION_NO_MATCH(-7),
        ERROR_RESOLVING_SDK_VERSION_TOO_OLD(-8),
        ERROR_RESOLVING_SDK_VERSION_TOO_NEW(-9),
        ERROR_HOSTING_SERVICE_UNAVAILABLE(-10);
        
        final int nativeCode;

        private CloudAnchorState(int i) {
            this.nativeCode = i;
        }

        public static CloudAnchorState forNumber(int i) {
            for (CloudAnchorState cloudAnchorState : values()) {
                if (cloudAnchorState.nativeCode == i) {
                    return cloudAnchorState;
                }
            }
            StringBuilder sb = new StringBuilder(63);
            sb.append("Unexpected value for native CloudAnchorState, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        public final boolean isError() {
            return this.nativeCode < 0;
        }
    }

    protected Anchor() {
        this.session = null;
        this.nativeHandle = 0;
    }

    Anchor(long j, Session session2) {
        this.session = session2;
        this.nativeHandle = j;
    }

    private native void nativeDetach(long j, long j2);

    private native String nativeGetCloudAnchorId(long j, long j2);

    private native int nativeGetCloudAnchorState(long j, long j2);

    private native Pose nativeGetPose(long j, long j2);

    private native int nativeGetTrackingState(long j, long j2);

    private static native void nativeReleaseAnchor(long j);

    public void detach() {
        nativeDetach(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public boolean equals(Object obj) {
        return (obj instanceof Anchor) && ((Anchor) obj).nativeHandle == this.nativeHandle;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeReleaseAnchor(j);
        }
        super.finalize();
    }

    public String getCloudAnchorId() {
        return nativeGetCloudAnchorId(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public CloudAnchorState getCloudAnchorState() {
        return CloudAnchorState.forNumber(nativeGetCloudAnchorState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public Pose getPose() {
        return nativeGetPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public TrackingState getTrackingState() {
        return TrackingState.forNumber(nativeGetTrackingState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public int hashCode() {
        return Long.valueOf(this.nativeHandle).hashCode();
    }
}
