package com.google.p017ar.sceneform.p018ux;

import com.google.p017ar.sceneform.FrameTime;
import com.google.p017ar.sceneform.Node;
import com.google.p017ar.sceneform.math.MathHelper;
import com.google.p017ar.sceneform.math.Vector3;

/* renamed from: com.google.ar.sceneform.ux.ScaleController */
public class ScaleController extends BaseTransformationController<PinchGesture> {
    public static final float DEFAULT_ELASTICITY = 0.15f;
    public static final float DEFAULT_MAX_SCALE = 1.75f;
    public static final float DEFAULT_MIN_SCALE = 0.75f;
    public static final float DEFAULT_SENSITIVITY = 0.75f;
    private static final float ELASTIC_RATIO_LIMIT = 0.8f;
    private static final float LERP_SPEED = 8.0f;
    private float currentScaleRatio;
    private float elasticity = 0.15f;
    private float maxScale = 1.75f;
    private float minScale = 0.75f;
    private float sensitivity = 0.75f;

    public ScaleController(BaseTransformableNode baseTransformableNode, PinchGestureRecognizer pinchGestureRecognizer) {
        super(baseTransformableNode, pinchGestureRecognizer);
    }

    private float getClampedScaleRatio() {
        return Math.min(1.0f, Math.max(0.0f, this.currentScaleRatio));
    }

    private float getElasticDelta() {
        float f = this.currentScaleRatio;
        if (f > 1.0f) {
            f -= 1.0f;
        } else if (f >= 0.0f) {
            return 0.0f;
        }
        return (1.0f - (1.0f / ((Math.abs(f) * this.elasticity) + 1.0f))) * Math.signum(f);
    }

    private float getFinalScale() {
        return this.minScale + ((getClampedScaleRatio() + getElasticDelta()) * getScaleDelta());
    }

    private float getScaleDelta() {
        float f = this.maxScale - this.minScale;
        if (f > 0.0f) {
            return f;
        }
        throw new IllegalStateException("maxScale must be greater than minScale.");
    }

    public boolean canStartTransformation(PinchGesture pinchGesture) {
        return getTransformableNode().isSelected();
    }

    public float getElasticity() {
        return this.elasticity;
    }

    public float getMaxScale() {
        return this.maxScale;
    }

    public float getMinScale() {
        return this.minScale;
    }

    public float getSensitivity() {
        return this.sensitivity;
    }

    public void onActivated(Node node) {
        super.onActivated(node);
        this.currentScaleRatio = (getTransformableNode().getLocalScale().f3277x - this.minScale) / getScaleDelta();
    }

    public void onContinueTransformation(PinchGesture pinchGesture) {
        this.currentScaleRatio += pinchGesture.gapDeltaInches() * this.sensitivity;
        float finalScale = getFinalScale();
        getTransformableNode().setLocalScale(new Vector3(finalScale, finalScale, finalScale));
        float f = this.currentScaleRatio;
        if (f < -0.8f || f > 1.8f) {
            pinchGesture.cancel();
        }
    }

    public void onEndTransformation(PinchGesture pinchGesture) {
    }

    public void onUpdated(Node node, FrameTime frameTime) {
        if (!isTransforming() && isEnabled()) {
            this.currentScaleRatio = MathHelper.lerp(this.currentScaleRatio, getClampedScaleRatio(), MathHelper.clamp(frameTime.getDeltaSeconds() * LERP_SPEED, 0.0f, 1.0f));
            float finalScale = getFinalScale();
            getTransformableNode().setLocalScale(new Vector3(finalScale, finalScale, finalScale));
        }
    }

    public void setElasticity(float f) {
        this.elasticity = f;
    }

    public void setMaxScale(float f) {
        this.maxScale = f;
    }

    public void setMinScale(float f) {
        this.minScale = f;
    }

    public void setSensitivity(float f) {
        this.sensitivity = f;
    }
}
