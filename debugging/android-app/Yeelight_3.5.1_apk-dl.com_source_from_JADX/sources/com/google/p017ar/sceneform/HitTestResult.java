package com.google.p017ar.sceneform;

import androidx.annotation.Nullable;
import com.google.p017ar.sceneform.collision.RayHit;

/* renamed from: com.google.ar.sceneform.HitTestResult */
public class HitTestResult extends RayHit {
    @Nullable
    private Node node;

    @Nullable
    public Node getNode() {
        return this.node;
    }

    public void reset() {
        super.reset();
        this.node = null;
    }

    public void set(HitTestResult hitTestResult) {
        super.set(hitTestResult);
        setNode(hitTestResult.node);
    }

    public void setNode(@Nullable Node node2) {
        this.node = node2;
    }
}
