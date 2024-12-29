package com.google.p017ar.sceneform.p018ux;

import android.view.MotionEvent;
import com.google.p017ar.sceneform.HitTestResult;
import com.google.p017ar.sceneform.Node;
import java.util.ArrayList;

/* renamed from: com.google.ar.sceneform.ux.BaseTransformableNode */
public abstract class BaseTransformableNode extends Node implements Node.OnTapListener {
    private final ArrayList<BaseTransformationController<?>> controllers = new ArrayList<>();
    private final TransformationSystem transformationSystem;

    public BaseTransformableNode(TransformationSystem transformationSystem2) {
        this.transformationSystem = transformationSystem2;
        setOnTapListener(this);
    }

    /* access modifiers changed from: protected */
    public void addTransformationController(BaseTransformationController<?> baseTransformationController) {
        this.controllers.add(baseTransformationController);
    }

    public TransformationSystem getTransformationSystem() {
        return this.transformationSystem;
    }

    public boolean isSelected() {
        return this.transformationSystem.getSelectedNode() == this;
    }

    public boolean isTransforming() {
        for (int i = 0; i < this.controllers.size(); i++) {
            if (this.controllers.get(i).isTransforming()) {
                return true;
            }
        }
        return false;
    }

    public void onTap(HitTestResult hitTestResult, MotionEvent motionEvent) {
        select();
    }

    /* access modifiers changed from: protected */
    public void removeTransformationController(BaseTransformationController<?> baseTransformationController) {
        this.controllers.remove(baseTransformationController);
    }

    public boolean select() {
        return this.transformationSystem.selectNode(this);
    }
}
