package com.google.p107ar.sceneform.p108ux;

import android.view.MotionEvent;
import com.google.p107ar.sceneform.HitTestResult;
import com.google.p107ar.sceneform.math.Vector3;
import com.google.p107ar.sceneform.p108ux.BaseGesture;

/* renamed from: com.google.ar.sceneform.ux.DragGesture */
public class DragGesture extends BaseGesture<DragGesture> {
    private static final boolean DRAG_GESTURE_DEBUG = false;
    private static final float SLOP_INCHES = 0.1f;
    private static final String TAG = "DragGesture";
    private final Vector3 delta = Vector3.zero();
    private final int pointerId;
    private final Vector3 position;
    private final Vector3 startPosition;

    /* renamed from: com.google.ar.sceneform.ux.DragGesture$OnGestureEventListener */
    public interface OnGestureEventListener extends BaseGesture.OnGestureEventListener<DragGesture> {
    }

    public DragGesture(GesturePointersUtility gesturePointersUtility, HitTestResult hitTestResult, MotionEvent motionEvent) {
        super(gesturePointersUtility);
        int pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
        this.pointerId = pointerId2;
        Vector3 motionEventToPosition = GesturePointersUtility.motionEventToPosition(motionEvent, pointerId2);
        this.startPosition = motionEventToPosition;
        this.position = new Vector3(motionEventToPosition);
        this.targetNode = hitTestResult.getNode();
        int i = this.pointerId;
        StringBuilder sb = new StringBuilder(20);
        sb.append("Created: ");
        sb.append(i);
        debugLog(sb.toString());
    }

    private static void debugLog(String str) {
    }

    /* access modifiers changed from: protected */
    public boolean canStart(HitTestResult hitTestResult, MotionEvent motionEvent) {
        int pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
        int actionMasked = motionEvent.getActionMasked();
        if (this.gesturePointersUtility.isPointerIdRetained(this.pointerId)) {
            cancel();
            return false;
        } else if (pointerId2 == this.pointerId && (actionMasked == 1 || actionMasked == 6)) {
            cancel();
            return false;
        } else if (actionMasked == 3) {
            cancel();
            return false;
        } else if (actionMasked != 2) {
            return false;
        } else {
            if (motionEvent.getPointerCount() > 1) {
                for (int i = 0; i < motionEvent.getPointerCount(); i++) {
                    int pointerId3 = motionEvent.getPointerId(i);
                    if (pointerId3 != this.pointerId && !this.gesturePointersUtility.isPointerIdRetained(pointerId3)) {
                        return false;
                    }
                }
            }
            return Vector3.subtract(GesturePointersUtility.motionEventToPosition(motionEvent, this.pointerId), this.startPosition).length() >= this.gesturePointersUtility.inchesToPixels(SLOP_INCHES);
        }
    }

    public Vector3 getDelta() {
        return new Vector3(this.delta);
    }

    public Vector3 getPosition() {
        return new Vector3(this.position);
    }

    /* access modifiers changed from: protected */
    public DragGesture getSelf() {
        return this;
    }

    /* access modifiers changed from: protected */
    public void onCancel() {
        int i = this.pointerId;
        StringBuilder sb = new StringBuilder(22);
        sb.append("Cancelled: ");
        sb.append(i);
        debugLog(sb.toString());
    }

    /* access modifiers changed from: protected */
    public void onFinish() {
        int i = this.pointerId;
        StringBuilder sb = new StringBuilder(21);
        sb.append("Finished: ");
        sb.append(i);
        debugLog(sb.toString());
        this.gesturePointersUtility.releasePointerId(this.pointerId);
    }

    /* access modifiers changed from: protected */
    public void onStart(HitTestResult hitTestResult, MotionEvent motionEvent) {
        int i = this.pointerId;
        StringBuilder sb = new StringBuilder(20);
        sb.append("Started: ");
        sb.append(i);
        debugLog(sb.toString());
        this.position.set(GesturePointersUtility.motionEventToPosition(motionEvent, this.pointerId));
        this.gesturePointersUtility.retainPointerId(this.pointerId);
    }

    /* access modifiers changed from: protected */
    public boolean updateGesture(HitTestResult hitTestResult, MotionEvent motionEvent) {
        int pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 2) {
            Vector3 motionEventToPosition = GesturePointersUtility.motionEventToPosition(motionEvent, this.pointerId);
            if (Vector3.equals(motionEventToPosition, this.position)) {
                return false;
            }
            this.delta.set(Vector3.subtract(motionEventToPosition, this.position));
            this.position.set(motionEventToPosition);
            int i = this.pointerId;
            String valueOf = String.valueOf(this.position);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Updated: ");
            sb.append(i);
            sb.append(" : ");
            sb.append(valueOf);
            debugLog(sb.toString());
            return true;
        } else if (pointerId2 == this.pointerId && (actionMasked == 1 || actionMasked == 6)) {
            complete();
            return false;
        } else if (actionMasked != 3) {
            return false;
        } else {
            cancel();
            return false;
        }
    }
}
