package com.google.p017ar.sceneform;

import androidx.annotation.Nullable;
import com.google.p017ar.core.Anchor;
import com.google.p017ar.core.Pose;
import com.google.p017ar.core.TrackingState;
import com.google.p017ar.sceneform.math.MathHelper;
import com.google.p017ar.sceneform.math.Quaternion;
import com.google.p017ar.sceneform.math.Vector3;
import java.util.List;

/* renamed from: com.google.ar.sceneform.AnchorNode */
public class AnchorNode extends Node {
    private static final float SMOOTH_FACTOR = 12.0f;
    private static final String TAG = "AnchorNode";
    @Nullable
    private Anchor anchor;
    private boolean isSmoothed = true;
    private boolean wasTracking;

    public AnchorNode() {
    }

    public AnchorNode(Anchor anchor2) {
        setAnchor(anchor2);
    }

    private void setChildrenEnabled(boolean z) {
        List<Node> children = getChildren();
        for (int i = 0; i < children.size(); i++) {
            children.get(i).setEnabled(z);
        }
    }

    private void updateTrackedPose(float f, boolean z) {
        boolean isTracking = isTracking();
        if (isTracking != this.wasTracking) {
            setChildrenEnabled(isTracking || this.anchor == null);
        }
        Anchor anchor2 = this.anchor;
        if (anchor2 == null || !isTracking) {
            this.wasTracking = isTracking;
            return;
        }
        Pose pose = anchor2.getPose();
        Vector3 b = C2063a.m5173b(pose);
        Quaternion e = C2063a.m5176e(pose);
        if (!this.isSmoothed || z) {
            super.setWorldPosition(b);
            super.setWorldRotation(e);
        } else {
            Vector3 worldPosition = getWorldPosition();
            float clamp = MathHelper.clamp(f * SMOOTH_FACTOR, 0.0f, 1.0f);
            worldPosition.set(Vector3.lerp(worldPosition, b, clamp));
            super.setWorldPosition(worldPosition);
            super.setWorldRotation(Quaternion.slerp(getWorldRotation(), e, clamp));
        }
        this.wasTracking = isTracking;
    }

    @Nullable
    public Anchor getAnchor() {
        return this.anchor;
    }

    public boolean isSmoothed() {
        return this.isSmoothed;
    }

    public boolean isTracking() {
        Anchor anchor2 = this.anchor;
        return anchor2 != null && anchor2.getTrackingState() == TrackingState.TRACKING;
    }

    public void onUpdate(FrameTime frameTime) {
        updateTrackedPose(frameTime.getDeltaSeconds(), false);
    }

    public void setAnchor(@Nullable Anchor anchor2) {
        this.anchor = anchor2;
        boolean z = true;
        if (anchor2 != null) {
            updateTrackedPose(0.0f, true);
        }
        boolean isTracking = isTracking();
        this.wasTracking = isTracking;
        if (!isTracking && anchor2 != null) {
            z = false;
        }
        setChildrenEnabled(z);
    }

    public void setLocalPosition(Vector3 vector3) {
        if (this.anchor == null) {
            super.setLocalPosition(vector3);
        }
    }

    public void setLocalRotation(Quaternion quaternion) {
        if (this.anchor == null) {
            super.setLocalRotation(quaternion);
        }
    }

    public void setSmoothed(boolean z) {
        this.isSmoothed = z;
    }

    public void setWorldPosition(Vector3 vector3) {
        if (this.anchor == null) {
            super.setWorldPosition(vector3);
        }
    }

    public void setWorldRotation(Quaternion quaternion) {
        if (this.anchor == null) {
            super.setWorldRotation(quaternion);
        }
    }
}
