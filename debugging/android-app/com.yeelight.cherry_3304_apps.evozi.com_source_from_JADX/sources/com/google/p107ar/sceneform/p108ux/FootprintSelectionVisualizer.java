package com.google.p107ar.sceneform.p108ux;

import androidx.annotation.Nullable;
import com.google.p107ar.sceneform.Node;
import com.google.p107ar.sceneform.NodeParent;
import com.google.p107ar.sceneform.collision.CollisionShape;
import com.google.p107ar.sceneform.rendering.ModelRenderable;

/* renamed from: com.google.ar.sceneform.ux.FootprintSelectionVisualizer */
public class FootprintSelectionVisualizer implements SelectionVisualizer {
    private final Node footprintNode = new Node();
    @Nullable
    private ModelRenderable footprintRenderable;

    public void applySelectionVisual(BaseTransformableNode baseTransformableNode) {
        this.footprintNode.setParent(baseTransformableNode);
    }

    @Nullable
    public ModelRenderable getFootprintRenderable() {
        return this.footprintRenderable;
    }

    public void removeSelectionVisual(BaseTransformableNode baseTransformableNode) {
        this.footprintNode.setParent((NodeParent) null);
    }

    public void setFootprintRenderable(ModelRenderable modelRenderable) {
        ModelRenderable makeCopy = modelRenderable.makeCopy();
        this.footprintNode.setRenderable(makeCopy);
        makeCopy.setCollisionShape((CollisionShape) null);
        this.footprintRenderable = makeCopy;
    }
}
