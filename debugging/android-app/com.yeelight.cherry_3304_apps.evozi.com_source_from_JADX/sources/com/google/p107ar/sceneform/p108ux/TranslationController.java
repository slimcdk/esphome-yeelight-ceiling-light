package com.google.p107ar.sceneform.p108ux;

import androidx.annotation.Nullable;
import com.google.p107ar.core.Anchor;
import com.google.p107ar.core.Frame;
import com.google.p107ar.core.HitResult;
import com.google.p107ar.core.Plane;
import com.google.p107ar.core.Pose;
import com.google.p107ar.core.Trackable;
import com.google.p107ar.core.TrackingState;
import com.google.p107ar.sceneform.AnchorNode;
import com.google.p107ar.sceneform.ArSceneView;
import com.google.p107ar.sceneform.FrameTime;
import com.google.p107ar.sceneform.Node;
import com.google.p107ar.sceneform.Scene;
import com.google.p107ar.sceneform.math.MathHelper;
import com.google.p107ar.sceneform.math.Quaternion;
import com.google.p107ar.sceneform.math.Vector3;
import com.google.p107ar.sceneform.utilities.Preconditions;
import java.util.EnumSet;
import java.util.List;

/* renamed from: com.google.ar.sceneform.ux.TranslationController */
public class TranslationController extends BaseTransformationController<DragGesture> {
    private static final float LERP_SPEED = 12.0f;
    private static final float POSITION_LENGTH_THRESHOLD = 0.01f;
    private static final float ROTATION_DOT_THRESHOLD = 0.99f;
    private EnumSet<Plane.Type> allowedPlaneTypes = EnumSet.allOf(Plane.Type.class);
    @Nullable
    private Vector3 desiredLocalPosition;
    @Nullable
    private Quaternion desiredLocalRotation;
    private final Vector3 initialForwardInLocal = new Vector3();
    @Nullable
    private HitResult lastArHitResult;

    public TranslationController(BaseTransformableNode baseTransformableNode, DragGestureRecognizer dragGestureRecognizer) {
        super(baseTransformableNode, dragGestureRecognizer);
    }

    private Quaternion calculateFinalDesiredLocalRotation(Quaternion quaternion) {
        return Quaternion.multiply(Quaternion.rotationBetweenVectors(Vector3.m8263up(), Quaternion.rotateVector(quaternion, Vector3.m8263up())), Quaternion.rotationBetweenVectors(Vector3.forward(), this.initialForwardInLocal)).normalized();
    }

    private static float dotQuaternion(Quaternion quaternion, Quaternion quaternion2) {
        return (quaternion.f5199x * quaternion2.f5199x) + (quaternion.f5200y * quaternion2.f5200y) + (quaternion.f5201z * quaternion2.f5201z) + (quaternion.f5198w * quaternion2.f5198w);
    }

    private AnchorNode getAnchorNodeOrDie() {
        Node parent = getTransformableNode().getParent();
        if (parent instanceof AnchorNode) {
            return (AnchorNode) parent;
        }
        throw new IllegalStateException("TransformableNode must have an AnchorNode as a parent.");
    }

    private void updatePosition(FrameTime frameTime) {
        Vector3 vector3 = this.desiredLocalPosition;
        if (vector3 != null) {
            Vector3 lerp = Vector3.lerp(getTransformableNode().getLocalPosition(), vector3, MathHelper.clamp(frameTime.getDeltaSeconds() * LERP_SPEED, 0.0f, 1.0f));
            if (Math.abs(Vector3.subtract(vector3, lerp).length()) <= POSITION_LENGTH_THRESHOLD) {
                this.desiredLocalPosition = null;
            } else {
                vector3 = lerp;
            }
            getTransformableNode().setLocalPosition(vector3);
        }
    }

    private void updateRotation(FrameTime frameTime) {
        Quaternion quaternion = this.desiredLocalRotation;
        if (quaternion != null) {
            Quaternion slerp = Quaternion.slerp(getTransformableNode().getLocalRotation(), quaternion, MathHelper.clamp(frameTime.getDeltaSeconds() * LERP_SPEED, 0.0f, 1.0f));
            if (Math.abs(dotQuaternion(slerp, quaternion)) >= ROTATION_DOT_THRESHOLD) {
                this.desiredLocalRotation = null;
            } else {
                quaternion = slerp;
            }
            getTransformableNode().setLocalRotation(quaternion);
        }
    }

    public boolean canStartTransformation(DragGesture dragGesture) {
        Node targetNode = dragGesture.getTargetNode();
        if (targetNode == null) {
            return false;
        }
        BaseTransformableNode transformableNode = getTransformableNode();
        if (targetNode != transformableNode && !targetNode.isDescendantOf(transformableNode)) {
            return false;
        }
        if (!transformableNode.isSelected() && !transformableNode.select()) {
            return false;
        }
        Vector3 forward = transformableNode.getForward();
        Node parent = transformableNode.getParent();
        if (parent != null) {
            this.initialForwardInLocal.set(parent.worldToLocalDirection(forward));
            return true;
        }
        this.initialForwardInLocal.set(forward);
        return true;
    }

    public EnumSet<Plane.Type> getAllowedPlaneTypes() {
        return this.allowedPlaneTypes;
    }

    public boolean isTransforming() {
        return (!super.isTransforming() && this.desiredLocalRotation == null && this.desiredLocalPosition == null) ? false : true;
    }

    public void onContinueTransformation(DragGesture dragGesture) {
        Frame arFrame;
        Vector3 vector3;
        Scene scene = getTransformableNode().getScene();
        if (scene != null && (arFrame = ((ArSceneView) scene.getView()).getArFrame()) != null && arFrame.getCamera().getTrackingState() == TrackingState.TRACKING) {
            Vector3 position = dragGesture.getPosition();
            List<HitResult> hitTest = arFrame.hitTest(position.f5202x, position.f5203y);
            for (int i = 0; i < hitTest.size(); i++) {
                HitResult hitResult = hitTest.get(i);
                Trackable trackable = hitResult.getTrackable();
                Pose hitPose = hitResult.getHitPose();
                if (trackable instanceof Plane) {
                    Plane plane = (Plane) trackable;
                    if (plane.isPoseInPolygon(hitPose) && this.allowedPlaneTypes.contains(plane.getType())) {
                        this.desiredLocalPosition = new Vector3(hitPose.mo15124tx(), hitPose.mo15125ty(), hitPose.mo15126tz());
                        this.desiredLocalRotation = new Quaternion(hitPose.mo15115qx(), hitPose.mo15116qy(), hitPose.mo15117qz(), hitPose.mo15114qw());
                        Node parent = getTransformableNode().getParent();
                        if (!(parent == null || (vector3 = this.desiredLocalPosition) == null || this.desiredLocalRotation == null)) {
                            this.desiredLocalPosition = parent.worldToLocalPoint(vector3);
                            this.desiredLocalRotation = Quaternion.multiply(parent.getWorldRotation().inverted(), (Quaternion) Preconditions.checkNotNull(this.desiredLocalRotation));
                        }
                        this.desiredLocalRotation = calculateFinalDesiredLocalRotation((Quaternion) Preconditions.checkNotNull(this.desiredLocalRotation));
                        this.lastArHitResult = hitResult;
                        return;
                    }
                }
            }
        }
    }

    public void onEndTransformation(DragGesture dragGesture) {
        Quaternion quaternion;
        HitResult hitResult = this.lastArHitResult;
        if (hitResult != null) {
            if (hitResult.getTrackable().getTrackingState() == TrackingState.TRACKING) {
                AnchorNode anchorNodeOrDie = getAnchorNodeOrDie();
                Anchor anchor = anchorNodeOrDie.getAnchor();
                if (anchor != null) {
                    anchor.detach();
                }
                Anchor createAnchor = hitResult.createAnchor();
                Vector3 worldPosition = getTransformableNode().getWorldPosition();
                Quaternion worldRotation = getTransformableNode().getWorldRotation();
                Quaternion quaternion2 = this.desiredLocalRotation;
                if (quaternion2 != null) {
                    getTransformableNode().setLocalRotation(quaternion2);
                    quaternion = getTransformableNode().getWorldRotation();
                } else {
                    quaternion = worldRotation;
                }
                anchorNodeOrDie.setAnchor(createAnchor);
                getTransformableNode().setWorldRotation(quaternion);
                this.initialForwardInLocal.set(anchorNodeOrDie.worldToLocalDirection(getTransformableNode().getForward()));
                getTransformableNode().setWorldRotation(worldRotation);
                getTransformableNode().setWorldPosition(worldPosition);
            }
            this.desiredLocalPosition = Vector3.zero();
            this.desiredLocalRotation = calculateFinalDesiredLocalRotation(Quaternion.identity());
        }
    }

    public void onUpdated(Node node, FrameTime frameTime) {
        updatePosition(frameTime);
        updateRotation(frameTime);
    }

    public void setAllowedPlaneTypes(EnumSet<Plane.Type> enumSet) {
        this.allowedPlaneTypes = enumSet;
    }
}
