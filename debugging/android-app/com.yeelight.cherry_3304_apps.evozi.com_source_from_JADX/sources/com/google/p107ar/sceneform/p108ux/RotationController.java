package com.google.p107ar.sceneform.p108ux;

import com.google.p107ar.sceneform.math.Quaternion;
import com.google.p107ar.sceneform.math.Vector3;

/* renamed from: com.google.ar.sceneform.ux.RotationController */
public class RotationController extends BaseTransformationController<TwistGesture> {
    private float rotationRateDegrees = 2.5f;

    public RotationController(BaseTransformableNode baseTransformableNode, TwistGestureRecognizer twistGestureRecognizer) {
        super(baseTransformableNode, twistGestureRecognizer);
    }

    public boolean canStartTransformation(TwistGesture twistGesture) {
        return getTransformableNode().isSelected();
    }

    public float getRotationRateDegrees() {
        return this.rotationRateDegrees;
    }

    public void onContinueTransformation(TwistGesture twistGesture) {
        getTransformableNode().setLocalRotation(Quaternion.multiply(getTransformableNode().getLocalRotation(), new Quaternion(Vector3.m8263up(), (-twistGesture.getDeltaRotationDegrees()) * this.rotationRateDegrees)));
    }

    public void onEndTransformation(TwistGesture twistGesture) {
    }

    public void setRotationRateDegrees(float f) {
        this.rotationRateDegrees = f;
    }
}
