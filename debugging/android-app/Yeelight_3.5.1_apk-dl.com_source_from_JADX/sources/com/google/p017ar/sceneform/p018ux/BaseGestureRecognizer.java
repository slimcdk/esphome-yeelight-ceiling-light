package com.google.p017ar.sceneform.p018ux;

import android.view.MotionEvent;
import com.google.p017ar.sceneform.HitTestResult;
import com.google.p017ar.sceneform.p018ux.BaseGesture;
import java.util.ArrayList;

/* renamed from: com.google.ar.sceneform.ux.BaseGestureRecognizer */
public abstract class BaseGestureRecognizer<T extends BaseGesture<T>> {
    protected final GesturePointersUtility gesturePointersUtility;
    private final ArrayList<OnGestureStartedListener<T>> gestureStartedListeners;
    protected final ArrayList<T> gestures = new ArrayList<>();

    /* renamed from: com.google.ar.sceneform.ux.BaseGestureRecognizer$OnGestureStartedListener */
    public interface OnGestureStartedListener<T extends BaseGesture<T>> {
        void onGestureStarted(T t);
    }

    public BaseGestureRecognizer(GesturePointersUtility gesturePointersUtility2) {
        this.gesturePointersUtility = gesturePointersUtility2;
        this.gestureStartedListeners = new ArrayList<>();
    }

    private void dispatchGestureStarted(T t) {
        for (int i = 0; i < this.gestureStartedListeners.size(); i++) {
            this.gestureStartedListeners.get(i).onGestureStarted(t);
        }
    }

    private void removeFinishedGestures() {
        for (int size = this.gestures.size() - 1; size >= 0; size--) {
            if (((BaseGesture) this.gestures.get(size)).hasFinished()) {
                this.gestures.remove(size);
            }
        }
    }

    public void addOnGestureStartedListener(OnGestureStartedListener<T> onGestureStartedListener) {
        if (!this.gestureStartedListeners.contains(onGestureStartedListener)) {
            this.gestureStartedListeners.add(onGestureStartedListener);
        }
    }

    public void onTouch(HitTestResult hitTestResult, MotionEvent motionEvent) {
        tryCreateGestures(hitTestResult, motionEvent);
        for (int i = 0; i < this.gestures.size(); i++) {
            BaseGesture baseGesture = (BaseGesture) this.gestures.get(i);
            baseGesture.onTouch(hitTestResult, motionEvent);
            if (baseGesture.justStarted()) {
                dispatchGestureStarted(baseGesture);
            }
        }
        removeFinishedGestures();
    }

    public void removeOnGestureStartedListener(OnGestureStartedListener<T> onGestureStartedListener) {
        this.gestureStartedListeners.remove(onGestureStartedListener);
    }

    /* access modifiers changed from: protected */
    public abstract void tryCreateGestures(HitTestResult hitTestResult, MotionEvent motionEvent);
}
