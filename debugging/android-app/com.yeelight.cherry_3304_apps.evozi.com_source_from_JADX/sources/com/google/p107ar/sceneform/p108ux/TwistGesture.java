package com.google.p107ar.sceneform.p108ux;

import android.view.MotionEvent;
import com.google.p107ar.sceneform.HitTestResult;
import com.google.p107ar.sceneform.math.Vector3;
import com.google.p107ar.sceneform.p108ux.BaseGesture;

/* renamed from: com.google.ar.sceneform.ux.TwistGesture */
public class TwistGesture extends BaseGesture<TwistGesture> {
    private static final float SLOP_ROTATION_DEGREES = 15.0f;
    private static final String TAG = "TwistGesture";
    private static final boolean TWIST_GESTURE_DEBUG = false;
    private float deltaRotationDegrees;
    private final int pointerId1;
    private final int pointerId2;
    private final Vector3 previousPosition1 = new Vector3(this.startPosition1);
    private final Vector3 previousPosition2 = new Vector3(this.startPosition2);
    private final Vector3 startPosition1;
    private final Vector3 startPosition2;

    /* renamed from: com.google.ar.sceneform.ux.TwistGesture$OnGestureEventListener */
    public interface OnGestureEventListener extends BaseGesture.OnGestureEventListener<TwistGesture> {
    }

    public TwistGesture(GesturePointersUtility gesturePointersUtility, MotionEvent motionEvent, int i) {
        super(gesturePointersUtility);
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        this.pointerId1 = pointerId;
        this.pointerId2 = i;
        this.startPosition1 = GesturePointersUtility.motionEventToPosition(motionEvent, pointerId);
        this.startPosition2 = GesturePointersUtility.motionEventToPosition(motionEvent, i);
        debugLog("Created");
    }

    private static float calculateDeltaRotation(Vector3 vector3, Vector3 vector32, Vector3 vector33, Vector3 vector34) {
        Vector3 normalized = Vector3.subtract(vector3, vector32).normalized();
        Vector3 normalized2 = Vector3.subtract(vector33, vector34).normalized();
        return Vector3.angleBetweenVectors(normalized, normalized2) * Math.signum((normalized2.f5202x * normalized.f5203y) - (normalized2.f5203y * normalized.f5202x));
    }

    private static void debugLog(String str) {
    }

    /* access modifiers changed from: protected */
    public boolean canStart(HitTestResult hitTestResult, MotionEvent motionEvent) {
        if (this.gesturePointersUtility.isPointerIdRetained(this.pointerId1) || this.gesturePointersUtility.isPointerIdRetained(this.pointerId2)) {
            cancel();
            return false;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            cancel();
            return false;
        }
        if ((actionMasked == 1 || actionMasked == 6) && (pointerId == this.pointerId1 || pointerId == this.pointerId2)) {
            cancel();
            return false;
        } else if (actionMasked != 2) {
            return false;
        } else {
            Vector3 motionEventToPosition = GesturePointersUtility.motionEventToPosition(motionEvent, this.pointerId1);
            Vector3 motionEventToPosition2 = GesturePointersUtility.motionEventToPosition(motionEvent, this.pointerId2);
            Vector3 subtract = Vector3.subtract(motionEventToPosition, this.previousPosition1);
            Vector3 subtract2 = Vector3.subtract(motionEventToPosition2, this.previousPosition2);
            this.previousPosition1.set(motionEventToPosition);
            this.previousPosition2.set(motionEventToPosition2);
            return !Vector3.equals(subtract, Vector3.zero()) && !Vector3.equals(subtract2, Vector3.zero()) && Math.abs(calculateDeltaRotation(motionEventToPosition, motionEventToPosition2, this.startPosition1, this.startPosition2)) >= SLOP_ROTATION_DEGREES;
        }
    }

    public float getDeltaRotationDegrees() {
        return this.deltaRotationDegrees;
    }

    /* access modifiers changed from: protected */
    public TwistGesture getSelf() {
        return this;
    }

    /* access modifiers changed from: protected */
    public void onCancel() {
        debugLog("Cancelled");
    }

    /* access modifiers changed from: protected */
    public void onFinish() {
        debugLog("Finished");
        this.gesturePointersUtility.releasePointerId(this.pointerId1);
        this.gesturePointersUtility.releasePointerId(this.pointerId2);
    }

    /* access modifiers changed from: protected */
    public void onStart(HitTestResult hitTestResult, MotionEvent motionEvent) {
        debugLog("Started");
        this.gesturePointersUtility.retainPointerId(this.pointerId1);
        this.gesturePointersUtility.retainPointerId(this.pointerId2);
    }

    /* access modifiers changed from: protected */
    public boolean updateGesture(HitTestResult hitTestResult, MotionEvent motionEvent) {
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            cancel();
            return false;
        }
        if ((actionMasked == 1 || actionMasked == 6) && (pointerId == this.pointerId1 || pointerId == this.pointerId2)) {
            complete();
            return false;
        } else if (actionMasked != 2) {
            return false;
        } else {
            Vector3 motionEventToPosition = GesturePointersUtility.motionEventToPosition(motionEvent, this.pointerId1);
            Vector3 motionEventToPosition2 = GesturePointersUtility.motionEventToPosition(motionEvent, this.pointerId2);
            this.deltaRotationDegrees = calculateDeltaRotation(motionEventToPosition, motionEventToPosition2, this.previousPosition1, this.previousPosition2);
            this.previousPosition1.set(motionEventToPosition);
            this.previousPosition2.set(motionEventToPosition2);
            float f = this.deltaRotationDegrees;
            StringBuilder sb = new StringBuilder(23);
            sb.append("Update: ");
            sb.append(f);
            debugLog(sb.toString());
            return true;
        }
    }
}
