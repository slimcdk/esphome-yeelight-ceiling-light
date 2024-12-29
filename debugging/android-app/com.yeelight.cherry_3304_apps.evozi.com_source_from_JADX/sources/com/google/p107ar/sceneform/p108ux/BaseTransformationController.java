package com.google.p107ar.sceneform.p108ux;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.p107ar.sceneform.FrameTime;
import com.google.p107ar.sceneform.Node;
import com.google.p107ar.sceneform.p108ux.BaseGesture;
import com.google.p107ar.sceneform.p108ux.BaseGestureRecognizer;

/* renamed from: com.google.ar.sceneform.ux.BaseTransformationController */
public abstract class BaseTransformationController<T extends BaseGesture<T>> implements BaseGestureRecognizer.OnGestureStartedListener<T>, BaseGesture.OnGestureEventListener<T>, Node.LifecycleListener {
    private boolean activeAndEnabled;
    @Nullable
    private T activeGesture;
    private boolean enabled;
    private final BaseGestureRecognizer<T> gestureRecognizer;
    private final BaseTransformableNode transformableNode;

    public BaseTransformationController(BaseTransformableNode baseTransformableNode, BaseGestureRecognizer<T> baseGestureRecognizer) {
        this.transformableNode = baseTransformableNode;
        baseTransformableNode.addLifecycleListener(this);
        this.gestureRecognizer = baseGestureRecognizer;
        setEnabled(true);
    }

    private void connectToRecognizer() {
        this.gestureRecognizer.addOnGestureStartedListener(this);
    }

    private void disconnectFromRecognizer() {
        this.gestureRecognizer.removeOnGestureStartedListener(this);
    }

    private void setActiveGesture(@Nullable T t) {
        T t2 = this.activeGesture;
        if (t2 != null) {
            t2.setGestureEventListener((BaseGesture.OnGestureEventListener) null);
        }
        this.activeGesture = t;
        if (t != null) {
            t.setGestureEventListener(this);
        }
    }

    private void updateActiveAndEnabled() {
        boolean z = getTransformableNode().isActive() && this.enabled;
        if (z != this.activeAndEnabled) {
            this.activeAndEnabled = z;
            if (z) {
                connectToRecognizer();
                return;
            }
            disconnectFromRecognizer();
            T t = this.activeGesture;
            if (t != null) {
                t.cancel();
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean canStartTransformation(T t);

    @Nullable
    public T getActiveGesture() {
        return this.activeGesture;
    }

    public BaseTransformableNode getTransformableNode() {
        return this.transformableNode;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isTransforming() {
        return this.activeGesture != null;
    }

    @CallSuper
    public void onActivated(Node node) {
        updateActiveAndEnabled();
    }

    /* access modifiers changed from: protected */
    public abstract void onContinueTransformation(T t);

    @CallSuper
    public void onDeactivated(Node node) {
        updateActiveAndEnabled();
    }

    /* access modifiers changed from: protected */
    public abstract void onEndTransformation(T t);

    public void onFinished(T t) {
        onEndTransformation(t);
        setActiveGesture((BaseGesture) null);
    }

    public void onGestureStarted(T t) {
        if (!isTransforming() && canStartTransformation(t)) {
            setActiveGesture(t);
        }
    }

    public void onUpdated(Node node, FrameTime frameTime) {
    }

    public void onUpdated(T t) {
        onContinueTransformation(t);
    }

    public void setEnabled(boolean z) {
        this.enabled = z;
        updateActiveAndEnabled();
    }
}
