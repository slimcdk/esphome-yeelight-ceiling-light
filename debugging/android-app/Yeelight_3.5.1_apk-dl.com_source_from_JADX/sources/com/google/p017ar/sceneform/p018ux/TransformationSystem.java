package com.google.p017ar.sceneform.p018ux;

import android.util.DisplayMetrics;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import com.google.p017ar.sceneform.HitTestResult;
import java.util.ArrayList;

/* renamed from: com.google.ar.sceneform.ux.TransformationSystem */
public class TransformationSystem {
    private final DragGestureRecognizer dragGestureRecognizer;
    private final GesturePointersUtility gesturePointersUtility;
    private final PinchGestureRecognizer pinchGestureRecognizer;
    private final ArrayList<BaseGestureRecognizer<?>> recognizers = new ArrayList<>();
    @Nullable
    private BaseTransformableNode selectedNode;
    private SelectionVisualizer selectionVisualizer;
    private final TwistGestureRecognizer twistGestureRecognizer;

    public TransformationSystem(DisplayMetrics displayMetrics, SelectionVisualizer selectionVisualizer2) {
        this.selectionVisualizer = selectionVisualizer2;
        GesturePointersUtility gesturePointersUtility2 = new GesturePointersUtility(displayMetrics);
        this.gesturePointersUtility = gesturePointersUtility2;
        DragGestureRecognizer dragGestureRecognizer2 = new DragGestureRecognizer(gesturePointersUtility2);
        this.dragGestureRecognizer = dragGestureRecognizer2;
        addGestureRecognizer(dragGestureRecognizer2);
        PinchGestureRecognizer pinchGestureRecognizer2 = new PinchGestureRecognizer(gesturePointersUtility2);
        this.pinchGestureRecognizer = pinchGestureRecognizer2;
        addGestureRecognizer(pinchGestureRecognizer2);
        TwistGestureRecognizer twistGestureRecognizer2 = new TwistGestureRecognizer(gesturePointersUtility2);
        this.twistGestureRecognizer = twistGestureRecognizer2;
        addGestureRecognizer(twistGestureRecognizer2);
    }

    private boolean deselectNode() {
        BaseTransformableNode baseTransformableNode = this.selectedNode;
        if (baseTransformableNode == null) {
            return true;
        }
        if (baseTransformableNode.isTransforming()) {
            return false;
        }
        this.selectionVisualizer.removeSelectionVisual(this.selectedNode);
        this.selectedNode = null;
        return true;
    }

    public void addGestureRecognizer(BaseGestureRecognizer<?> baseGestureRecognizer) {
        this.recognizers.add(baseGestureRecognizer);
    }

    public DragGestureRecognizer getDragRecognizer() {
        return this.dragGestureRecognizer;
    }

    public GesturePointersUtility getGesturePointersUtility() {
        return this.gesturePointersUtility;
    }

    public PinchGestureRecognizer getPinchRecognizer() {
        return this.pinchGestureRecognizer;
    }

    @Nullable
    public BaseTransformableNode getSelectedNode() {
        return this.selectedNode;
    }

    public SelectionVisualizer getSelectionVisualizer() {
        return this.selectionVisualizer;
    }

    public TwistGestureRecognizer getTwistRecognizer() {
        return this.twistGestureRecognizer;
    }

    public void onTouch(HitTestResult hitTestResult, MotionEvent motionEvent) {
        for (int i = 0; i < this.recognizers.size(); i++) {
            this.recognizers.get(i).onTouch(hitTestResult, motionEvent);
        }
    }

    public boolean selectNode(@Nullable BaseTransformableNode baseTransformableNode) {
        if (!deselectNode()) {
            return false;
        }
        if (baseTransformableNode == null) {
            return true;
        }
        this.selectedNode = baseTransformableNode;
        this.selectionVisualizer.applySelectionVisual(baseTransformableNode);
        return true;
    }

    public void setSelectionVisualizer(SelectionVisualizer selectionVisualizer2) {
        BaseTransformableNode baseTransformableNode = this.selectedNode;
        if (baseTransformableNode != null) {
            this.selectionVisualizer.removeSelectionVisual(baseTransformableNode);
        }
        this.selectionVisualizer = selectionVisualizer2;
        BaseTransformableNode baseTransformableNode2 = this.selectedNode;
        if (baseTransformableNode2 != null) {
            selectionVisualizer2.applySelectionVisual(baseTransformableNode2);
        }
    }
}
