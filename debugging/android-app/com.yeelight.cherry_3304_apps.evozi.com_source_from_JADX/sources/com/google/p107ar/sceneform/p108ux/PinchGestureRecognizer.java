package com.google.p107ar.sceneform.p108ux;

import android.view.MotionEvent;
import com.google.p107ar.sceneform.HitTestResult;
import com.google.p107ar.sceneform.p108ux.BaseGestureRecognizer;

/* renamed from: com.google.ar.sceneform.ux.PinchGestureRecognizer */
public class PinchGestureRecognizer extends BaseGestureRecognizer<PinchGesture> {

    /* renamed from: com.google.ar.sceneform.ux.PinchGestureRecognizer$OnGestureStartedListener */
    public interface OnGestureStartedListener extends BaseGestureRecognizer.OnGestureStartedListener<PinchGesture> {
    }

    public PinchGestureRecognizer(GesturePointersUtility gesturePointersUtility) {
        super(gesturePointersUtility);
    }

    /* access modifiers changed from: protected */
    public void tryCreateGestures(HitTestResult hitTestResult, MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() >= 2) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked == 0 || actionMasked == 5) && !this.gesturePointersUtility.isPointerIdRetained(pointerId)) {
                for (int i = 0; i < motionEvent.getPointerCount(); i++) {
                    int pointerId2 = motionEvent.getPointerId(i);
                    if (pointerId2 != pointerId && !this.gesturePointersUtility.isPointerIdRetained(pointerId2)) {
                        this.gestures.add(new PinchGesture(this.gesturePointersUtility, motionEvent, pointerId2));
                    }
                }
            }
        }
    }
}
