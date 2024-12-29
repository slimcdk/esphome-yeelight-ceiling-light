package com.google.p017ar.sceneform.p018ux;

import android.view.MotionEvent;
import androidx.annotation.Nullable;
import com.google.p017ar.sceneform.HitTestResult;
import com.google.p017ar.sceneform.Node;
import com.google.p017ar.sceneform.p018ux.BaseGesture;

/* renamed from: com.google.ar.sceneform.ux.BaseGesture */
public abstract class BaseGesture<T extends BaseGesture<T>> {
    @Nullable
    private OnGestureEventListener<T> eventListener;
    protected final GesturePointersUtility gesturePointersUtility;
    private boolean hasFinished;
    private boolean hasStarted;
    private boolean justStarted;
    @Nullable
    protected Node targetNode;
    private boolean wasCancelled;

    /* renamed from: com.google.ar.sceneform.ux.BaseGesture$OnGestureEventListener */
    public interface OnGestureEventListener<T extends BaseGesture<T>> {
        void onFinished(T t);

        void onUpdated(T t);
    }

    public BaseGesture(GesturePointersUtility gesturePointersUtility2) {
        this.gesturePointersUtility = gesturePointersUtility2;
    }

    private void dispatchFinishedEvent() {
        OnGestureEventListener<T> onGestureEventListener = this.eventListener;
        if (onGestureEventListener != null) {
            onGestureEventListener.onFinished(getSelf());
        }
    }

    private void dispatchUpdateEvent() {
        OnGestureEventListener<T> onGestureEventListener = this.eventListener;
        if (onGestureEventListener != null) {
            onGestureEventListener.onUpdated(getSelf());
        }
    }

    private void start(HitTestResult hitTestResult, MotionEvent motionEvent) {
        this.hasStarted = true;
        this.justStarted = true;
        onStart(hitTestResult, motionEvent);
    }

    /* access modifiers changed from: protected */
    public abstract boolean canStart(HitTestResult hitTestResult, MotionEvent motionEvent);

    /* access modifiers changed from: protected */
    public void cancel() {
        this.wasCancelled = true;
        onCancel();
        complete();
    }

    /* access modifiers changed from: protected */
    public void complete() {
        this.hasFinished = true;
        if (this.hasStarted) {
            onFinish();
            dispatchFinishedEvent();
        }
    }

    /* access modifiers changed from: protected */
    public abstract T getSelf();

    @Nullable
    public Node getTargetNode() {
        return this.targetNode;
    }

    public boolean hasFinished() {
        return this.hasFinished;
    }

    public boolean hasStarted() {
        return this.hasStarted;
    }

    public float inchesToPixels(float f) {
        return this.gesturePointersUtility.inchesToPixels(f);
    }

    public boolean justStarted() {
        return this.justStarted;
    }

    /* access modifiers changed from: protected */
    public abstract void onCancel();

    /* access modifiers changed from: protected */
    public abstract void onFinish();

    /* access modifiers changed from: protected */
    public abstract void onStart(HitTestResult hitTestResult, MotionEvent motionEvent);

    public void onTouch(HitTestResult hitTestResult, MotionEvent motionEvent) {
        if (this.hasStarted || !canStart(hitTestResult, motionEvent)) {
            this.justStarted = false;
            if (this.hasStarted && updateGesture(hitTestResult, motionEvent)) {
                dispatchUpdateEvent();
                return;
            }
            return;
        }
        start(hitTestResult, motionEvent);
    }

    public float pixelsToInches(float f) {
        return this.gesturePointersUtility.pixelsToInches(f);
    }

    public void setGestureEventListener(@Nullable OnGestureEventListener<T> onGestureEventListener) {
        this.eventListener = onGestureEventListener;
    }

    /* access modifiers changed from: protected */
    public abstract boolean updateGesture(HitTestResult hitTestResult, MotionEvent motionEvent);

    public boolean wasCancelled() {
        return this.wasCancelled;
    }
}
