package com.google.p017ar.sceneform.p018ux;

import android.view.MotionEvent;
import com.google.p017ar.sceneform.HitTestResult;
import com.google.p017ar.sceneform.p018ux.BaseGestureRecognizer;

/* renamed from: com.google.ar.sceneform.ux.DragGestureRecognizer */
public class DragGestureRecognizer extends BaseGestureRecognizer<DragGesture> {

    /* renamed from: com.google.ar.sceneform.ux.DragGestureRecognizer$OnGestureStartedListener */
    public interface OnGestureStartedListener extends BaseGestureRecognizer.OnGestureStartedListener<DragGesture> {
    }

    public DragGestureRecognizer(GesturePointersUtility gesturePointersUtility) {
        super(gesturePointersUtility);
    }

    /* access modifiers changed from: protected */
    public void tryCreateGestures(HitTestResult hitTestResult, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        if ((actionMasked == 0 || actionMasked == 5) && !this.gesturePointersUtility.isPointerIdRetained(pointerId)) {
            this.gestures.add(new DragGesture(this.gesturePointersUtility, hitTestResult, motionEvent));
        }
    }
}
