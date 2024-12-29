package com.google.p107ar.core;

import com.google.p107ar.core.exceptions.FatalException;

/* renamed from: com.google.ar.core.Config */
public class Config {
    private static final int AR_CLOUD_ANCHOR_DEBUG_MODE_DISABLED = 0;
    private static final int AR_CLOUD_ANCHOR_DEBUG_MODE_ENABLED = 1;
    private static final String TAG = "ARCore-Config";
    long nativeHandle;
    final Session session;

    /* renamed from: com.google.ar.core.Config$AugmentedFaceMode */
    public enum AugmentedFaceMode {
        DISABLED(0),
        MESH3D(2);
        
        final int nativeCode;

        private AugmentedFaceMode(int i) {
            this.nativeCode = i;
        }

        static AugmentedFaceMode forNumber(int i) {
            for (AugmentedFaceMode augmentedFaceMode : values()) {
                if (augmentedFaceMode.nativeCode == i) {
                    return augmentedFaceMode;
                }
            }
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected value for native AugmentedFaceMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }
    }

    /* renamed from: com.google.ar.core.Config$CloudAnchorMode */
    public enum CloudAnchorMode {
        DISABLED(0),
        ENABLED(1);
        
        final int nativeCode;

        private CloudAnchorMode(int i) {
            this.nativeCode = i;
        }

        static CloudAnchorMode forNumber(int i) {
            for (CloudAnchorMode cloudAnchorMode : values()) {
                if (cloudAnchorMode.nativeCode == i) {
                    return cloudAnchorMode;
                }
            }
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected value for native AnchorHostingMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }
    }

    /* renamed from: com.google.ar.core.Config$FocusMode */
    public enum FocusMode {
        FIXED(0),
        AUTO(1);
        
        final int nativeCode;

        private FocusMode(int i) {
            this.nativeCode = i;
        }

        static FocusMode forNumber(int i) {
            for (FocusMode focusMode : values()) {
                if (focusMode.nativeCode == i) {
                    return focusMode;
                }
            }
            StringBuilder sb = new StringBuilder(56);
            sb.append("Unexpected value for native FocusMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }
    }

    /* renamed from: com.google.ar.core.Config$LightEstimationMode */
    public enum LightEstimationMode {
        DISABLED(0),
        AMBIENT_INTENSITY(1),
        ENVIRONMENTAL_HDR(2);
        
        final int nativeCode;

        private LightEstimationMode(int i) {
            this.nativeCode = i;
        }

        static LightEstimationMode forNumber(int i) {
            for (LightEstimationMode lightEstimationMode : values()) {
                if (lightEstimationMode.nativeCode == i) {
                    return lightEstimationMode;
                }
            }
            StringBuilder sb = new StringBuilder(66);
            sb.append("Unexpected value for native LightEstimationMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }
    }

    /* renamed from: com.google.ar.core.Config$PlaneFindingMode */
    public enum PlaneFindingMode {
        DISABLED(0),
        HORIZONTAL(1),
        VERTICAL(2),
        HORIZONTAL_AND_VERTICAL(3);
        
        final int nativeCode;

        private PlaneFindingMode(int i) {
            this.nativeCode = i;
        }

        static PlaneFindingMode forNumber(int i) {
            for (PlaneFindingMode planeFindingMode : values()) {
                if (planeFindingMode.nativeCode == i) {
                    return planeFindingMode;
                }
            }
            StringBuilder sb = new StringBuilder(63);
            sb.append("Unexpected value for native PlaneFindingMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }
    }

    /* renamed from: com.google.ar.core.Config$UpdateMode */
    public enum UpdateMode {
        BLOCKING(0),
        LATEST_CAMERA_IMAGE(1);
        
        final int nativeCode;

        private UpdateMode(int i) {
            this.nativeCode = i;
        }

        static UpdateMode forNumber(int i) {
            for (UpdateMode updateMode : values()) {
                if (updateMode.nativeCode == i) {
                    return updateMode;
                }
            }
            StringBuilder sb = new StringBuilder(57);
            sb.append("Unexpected value for native UpdateMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }
    }

    protected Config() {
        this.session = null;
        this.nativeHandle = 0;
    }

    public Config(Session session2) {
        this.session = session2;
        this.nativeHandle = nativeCreate(session2.nativeWrapperHandle);
    }

    Config(Session session2, long j) {
        this.session = session2;
        this.nativeHandle = j;
    }

    private static native long nativeCreate(long j);

    private static native void nativeDestroy(long j);

    private native int nativeGetAugmentedFaceMode(long j, long j2);

    private native long nativeGetAugmentedImageDatabase(long j, long j2);

    private native int nativeGetCloudAnchorMode(long j, long j2);

    private native int nativeGetFocusMode(long j, long j2);

    private native int nativeGetLightEstimationMode(long j, long j2);

    private native int nativeGetPlaneFindingMode(long j, long j2);

    private native int nativeGetUpdateMode(long j, long j2);

    private native void nativeSetAugmentedFaceMode(long j, long j2, int i);

    private native void nativeSetAugmentedImageDatabase(long j, long j2, long j3);

    private native void nativeSetCloudAnchorMode(long j, long j2, int i);

    private native void nativeSetFocusMode(long j, long j2, int i);

    private native void nativeSetLightEstimationMode(long j, long j2, int i);

    private native void nativeSetPlaneFindingMode(long j, long j2, int i);

    private native void nativeSetUpdateMode(long j, long j2, int i);

    private native void nativeUnsetAugmentedImageDatabase(long j, long j2);

    /* access modifiers changed from: protected */
    public void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeDestroy(j);
        }
        super.finalize();
    }

    public AugmentedFaceMode getAugmentedFaceMode() {
        return AugmentedFaceMode.forNumber(nativeGetAugmentedFaceMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public AugmentedImageDatabase getAugmentedImageDatabase() {
        return new AugmentedImageDatabase(this.session, nativeGetAugmentedImageDatabase(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public CloudAnchorMode getCloudAnchorMode() {
        return CloudAnchorMode.forNumber(nativeGetCloudAnchorMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public FocusMode getFocusMode() {
        return FocusMode.forNumber(nativeGetFocusMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public LightEstimationMode getLightEstimationMode() {
        return LightEstimationMode.forNumber(nativeGetLightEstimationMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public PlaneFindingMode getPlaneFindingMode() {
        return PlaneFindingMode.forNumber(nativeGetPlaneFindingMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public UpdateMode getUpdateMode() {
        return UpdateMode.forNumber(nativeGetUpdateMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public Config setAugmentedFaceMode(AugmentedFaceMode augmentedFaceMode) {
        nativeSetAugmentedFaceMode(this.session.nativeWrapperHandle, this.nativeHandle, augmentedFaceMode.nativeCode);
        return this;
    }

    public Config setAugmentedImageDatabase(AugmentedImageDatabase augmentedImageDatabase) {
        nativeSetAugmentedImageDatabase(this.session.nativeWrapperHandle, this.nativeHandle, augmentedImageDatabase == null ? 0 : augmentedImageDatabase.nativeHandle);
        return this;
    }

    public Config setCloudAnchorMode(CloudAnchorMode cloudAnchorMode) {
        nativeSetCloudAnchorMode(this.session.nativeWrapperHandle, this.nativeHandle, cloudAnchorMode.nativeCode);
        return this;
    }

    public Config setFocusMode(FocusMode focusMode) {
        nativeSetFocusMode(this.session.nativeWrapperHandle, this.nativeHandle, focusMode.nativeCode);
        return this;
    }

    public Config setLightEstimationMode(LightEstimationMode lightEstimationMode) {
        nativeSetLightEstimationMode(this.session.nativeWrapperHandle, this.nativeHandle, lightEstimationMode.nativeCode);
        return this;
    }

    public Config setPlaneFindingMode(PlaneFindingMode planeFindingMode) {
        nativeSetPlaneFindingMode(this.session.nativeWrapperHandle, this.nativeHandle, planeFindingMode.nativeCode);
        return this;
    }

    public Config setUpdateMode(UpdateMode updateMode) {
        nativeSetUpdateMode(this.session.nativeWrapperHandle, this.nativeHandle, updateMode.nativeCode);
        return this;
    }
}
