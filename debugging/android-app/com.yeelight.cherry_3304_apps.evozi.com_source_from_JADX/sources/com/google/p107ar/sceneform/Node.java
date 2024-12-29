package com.google.p107ar.sceneform;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import com.google.p107ar.sceneform.collision.Collider;
import com.google.p107ar.sceneform.collision.CollisionShape;
import com.google.p107ar.sceneform.collision.CollisionSystem;
import com.google.p107ar.sceneform.common.TransformProvider;
import com.google.p107ar.sceneform.math.Matrix;
import com.google.p107ar.sceneform.math.Quaternion;
import com.google.p107ar.sceneform.math.Vector3;
import com.google.p107ar.sceneform.rendering.Light;
import com.google.p107ar.sceneform.rendering.LightInstance;
import com.google.p107ar.sceneform.rendering.Renderable;
import com.google.p107ar.sceneform.rendering.RenderableInstance;
import com.google.p107ar.sceneform.rendering.Renderer;
import com.google.p107ar.sceneform.rendering.SkeletonRig;
import com.google.p107ar.sceneform.utilities.AndroidPreconditions;
import com.google.p107ar.sceneform.utilities.Preconditions;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* renamed from: com.google.ar.sceneform.Node */
public class Node extends NodeParent implements TransformProvider {
    private static final String DEFAULT_NAME = "Node";
    private static final int DEFAULT_TOUCH_SLOP = 8;
    private static final float DIRECTION_UP_EPSILON = 0.99f;
    private static final int LOCAL_DIRTY_FLAGS = 63;
    private static final int LOCAL_TRANSFORM_DIRTY = 1;
    private static final int WORLD_DIRTY_FLAGS = 62;
    private static final int WORLD_INVERSE_TRANSFORM_DIRTY = 4;
    private static final int WORLD_POSITION_DIRTY = 8;
    private static final int WORLD_ROTATION_DIRTY = 16;
    private static final int WORLD_SCALE_DIRTY = 32;
    private static final int WORLD_TRANSFORM_DIRTY = 2;
    private boolean active = false;
    private boolean allowDispatchTransformChangedListeners = true;
    private final Matrix cachedLocalModelMatrix = new Matrix();
    private final Matrix cachedWorldModelMatrix = new Matrix();
    private final Matrix cachedWorldModelMatrixInverse = new Matrix();
    private final Vector3 cachedWorldPosition = new Vector3();
    private final Quaternion cachedWorldRotation = new Quaternion();
    private final Vector3 cachedWorldScale = new Vector3();
    @Nullable
    private Collider collider;
    @Nullable
    private CollisionShape collisionShape;
    private int dirtyTransformFlags = 63;
    private boolean enabled = true;
    private final ArrayList<LifecycleListener> lifecycleListeners = new ArrayList<>();
    @Nullable
    private LightInstance lightInstance;
    private final Vector3 localPosition = new Vector3();
    private final Quaternion localRotation = new Quaternion();
    private final Vector3 localScale = new Vector3();
    private String name = DEFAULT_NAME;
    private int nameHash = 2433570;
    @Nullable
    private OnTapListener onTapListener;
    @Nullable
    private OnTouchListener onTouchListener;
    @Nullable
    NodeParent parent;
    @Nullable
    private Node parentAsNode;
    private int renderableId = 0;
    @Nullable
    private RenderableInstance renderableInstance;
    @Nullable
    private Scene scene;
    @Nullable
    private TapTrackingData tapTrackingData = null;
    private final ArrayList<TransformChangedListener> transformChangedListeners = new ArrayList<>();

    /* renamed from: com.google.ar.sceneform.Node$LifecycleListener */
    public interface LifecycleListener {
        void onActivated(Node node);

        void onDeactivated(Node node);

        void onUpdated(Node node, FrameTime frameTime);
    }

    /* renamed from: com.google.ar.sceneform.Node$OnTapListener */
    public interface OnTapListener {
        void onTap(HitTestResult hitTestResult, MotionEvent motionEvent);
    }

    /* renamed from: com.google.ar.sceneform.Node$OnTouchListener */
    public interface OnTouchListener {
        boolean onTouch(HitTestResult hitTestResult, MotionEvent motionEvent);
    }

    /* renamed from: com.google.ar.sceneform.Node$TapTrackingData */
    static class TapTrackingData {

        /* renamed from: a */
        final Node f5171a;

        /* renamed from: b */
        final Vector3 f5172b;

        TapTrackingData(Node node, Vector3 vector3) {
            this.f5171a = node;
            this.f5172b = new Vector3(vector3);
        }
    }

    /* renamed from: com.google.ar.sceneform.Node$TransformChangedListener */
    public interface TransformChangedListener {
        void onTransformChanged(Node node, Node node2);
    }

    public Node() {
        AndroidPreconditions.checkUiThread();
        this.localScale.set(1.0f, 1.0f, 1.0f);
        this.cachedWorldScale.set(this.localScale);
    }

    private void activate() {
        Scene scene2;
        RenderableInstance renderableInstance2;
        AndroidPreconditions.checkUiThread();
        if (!this.active) {
            this.active = true;
            Scene scene3 = this.scene;
            if (!(scene3 == null || scene3.isUnderTesting() || (renderableInstance2 = this.renderableInstance) == null)) {
                renderableInstance2.attachToRenderer(getRendererOrDie());
            }
            LightInstance lightInstance2 = this.lightInstance;
            if (lightInstance2 != null) {
                lightInstance2.attachToRenderer(getRendererOrDie());
            }
            Collider collider2 = this.collider;
            if (!(collider2 == null || (scene2 = this.scene) == null)) {
                collider2.setAttachedCollisionSystem(scene2.collisionSystem);
            }
            onActivate();
            ArrayList<LifecycleListener> arrayList = this.lifecycleListeners;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                LifecycleListener lifecycleListener = arrayList.get(i);
                i++;
                lifecycleListener.onActivated(this);
            }
            return;
        }
        throw new AssertionError("Cannot call activate while already active.");
    }

    private void createLightInstance(Light light) {
        LightInstance createInstance = light.createInstance(this);
        this.lightInstance = createInstance;
        if (createInstance == null) {
            throw new NullPointerException("light.createInstance() failed - which should not happen.");
        } else if (this.active) {
            createInstance.attachToRenderer(getRendererOrDie());
        }
    }

    private void deactivate() {
        AndroidPreconditions.checkUiThread();
        if (this.active) {
            int i = 0;
            this.active = false;
            RenderableInstance renderableInstance2 = this.renderableInstance;
            if (renderableInstance2 != null) {
                renderableInstance2.detachFromRenderer();
            }
            LightInstance lightInstance2 = this.lightInstance;
            if (lightInstance2 != null) {
                lightInstance2.detachFromRenderer();
            }
            Collider collider2 = this.collider;
            if (collider2 != null) {
                collider2.setAttachedCollisionSystem((CollisionSystem) null);
            }
            onDeactivate();
            ArrayList<LifecycleListener> arrayList = this.lifecycleListeners;
            int size = arrayList.size();
            while (i < size) {
                LifecycleListener lifecycleListener = arrayList.get(i);
                i++;
                lifecycleListener.onDeactivated(this);
            }
            return;
        }
        throw new AssertionError("Cannot call deactivate while already inactive.");
    }

    private void destroyLightInstance() {
        LightInstance lightInstance2 = this.lightInstance;
        if (lightInstance2 != null) {
            if (this.active) {
                lightInstance2.detachFromRenderer();
            }
            this.lightInstance.mo15955a();
            this.lightInstance = null;
        }
    }

    private boolean dispatchToViewRenderable(MotionEvent motionEvent) {
        return C2677a.m8222d(this, motionEvent);
    }

    private void dispatchTransformChanged(Node node) {
        onTransformChange(node);
        for (int i = 0; i < this.transformChangedListeners.size(); i++) {
            this.transformChangedListeners.get(i).onTransformChanged(this, node);
        }
    }

    private Renderer getRendererOrDie() {
        Scene scene2 = this.scene;
        if (scene2 != null) {
            return (Renderer) Preconditions.checkNotNull(scene2.getView().getRenderer());
        }
        throw new IllegalStateException("Unable to get Renderer.");
    }

    private int getScaledTouchSlop() {
        Scene scene2 = getScene();
        if (scene2 == null || !AndroidPreconditions.isAndroidApiAvailable() || AndroidPreconditions.isUnderTesting()) {
            return 8;
        }
        return ViewConfiguration.get(scene2.getView().getContext()).getScaledTouchSlop();
    }

    private Matrix getWorldModelMatrixInternal() {
        if ((this.dirtyTransformFlags & 2) == 2) {
            Node node = this.parentAsNode;
            if (node == null) {
                this.cachedWorldModelMatrix.set(getLocalModelMatrixInternal().data);
            } else {
                Matrix.multiply(node.getWorldModelMatrixInternal(), getLocalModelMatrixInternal(), this.cachedWorldModelMatrix);
            }
            this.dirtyTransformFlags &= -3;
        }
        return this.cachedWorldModelMatrix;
    }

    private Vector3 getWorldPositionInternal() {
        if ((this.dirtyTransformFlags & 8) == 8) {
            if (this.parentAsNode != null) {
                getWorldModelMatrixInternal().decomposeTranslation(this.cachedWorldPosition);
            } else {
                this.cachedWorldPosition.set(this.localPosition);
            }
            this.dirtyTransformFlags &= -9;
        }
        return this.cachedWorldPosition;
    }

    private Quaternion getWorldRotationInternal() {
        if ((this.dirtyTransformFlags & 16) == 16) {
            if (this.parentAsNode != null) {
                getWorldModelMatrixInternal().decomposeRotation(getWorldScaleInternal(), this.cachedWorldRotation);
            } else {
                this.cachedWorldRotation.set(this.localRotation);
            }
            this.dirtyTransformFlags &= -17;
        }
        return this.cachedWorldRotation;
    }

    private Vector3 getWorldScaleInternal() {
        if ((this.dirtyTransformFlags & 32) == 32) {
            if (this.parentAsNode != null) {
                getWorldModelMatrixInternal().decomposeScale(this.cachedWorldScale);
            } else {
                this.cachedWorldScale.set(this.localScale);
            }
            this.dirtyTransformFlags &= -33;
        }
        return this.cachedWorldScale;
    }

    private final void markTransformChangedRecursively(int i, Node node) {
        boolean z;
        Collider collider2;
        int i2 = this.dirtyTransformFlags;
        boolean z2 = true;
        if ((i2 & i) != i) {
            int i3 = i2 | i;
            this.dirtyTransformFlags = i3;
            if ((i3 & 2) == 2 && (collider2 = this.collider) != null) {
                collider2.markWorldShapeDirty();
            }
            z = true;
        } else {
            z = false;
        }
        if (node.allowDispatchTransformChangedListeners) {
            dispatchTransformChanged(node);
        } else {
            z2 = z;
        }
        if (z2) {
            List<Node> children = getChildren();
            for (int i4 = 0; i4 < children.size(); i4++) {
                children.get(i4).markTransformChangedRecursively(i, node);
            }
        }
    }

    private void refreshCollider() {
        Scene scene2;
        CollisionShape collisionShape2 = this.collisionShape;
        Renderable renderable = getRenderable();
        if (collisionShape2 == null && renderable != null) {
            collisionShape2 = renderable.getCollisionShape();
        }
        if (collisionShape2 != null) {
            Collider collider2 = this.collider;
            if (collider2 == null) {
                Collider collider3 = new Collider(this, collisionShape2);
                this.collider = collider3;
                if (this.active && (scene2 = this.scene) != null) {
                    collider3.setAttachedCollisionSystem(scene2.collisionSystem);
                }
            } else if (collider2.getShape() != collisionShape2) {
                this.collider.setShape(collisionShape2);
            }
        } else {
            Collider collider4 = this.collider;
            if (collider4 != null) {
                collider4.setAttachedCollisionSystem((CollisionSystem) null);
                this.collider = null;
            }
        }
    }

    private void setSceneRecursivelyInternal(@Nullable Scene scene2) {
        this.scene = scene2;
        for (Node sceneRecursively : getChildren()) {
            sceneRecursively.setSceneRecursively(scene2);
        }
    }

    private boolean shouldBeActive() {
        if (!this.enabled || this.scene == null) {
            return false;
        }
        Node node = this.parentAsNode;
        return node == null || node.isActive();
    }

    private void updateActiveStatusRecursively() {
        boolean shouldBeActive = shouldBeActive();
        if (this.active != shouldBeActive) {
            if (shouldBeActive) {
                activate();
            } else {
                deactivate();
            }
        }
        for (Node updateActiveStatusRecursively : getChildren()) {
            updateActiveStatusRecursively.updateActiveStatusRecursively();
        }
    }

    public void addLifecycleListener(LifecycleListener lifecycleListener) {
        if (!this.lifecycleListeners.contains(lifecycleListener)) {
            this.lifecycleListeners.add(lifecycleListener);
        }
    }

    public void addTransformChangedListener(TransformChangedListener transformChangedListener) {
        if (!this.transformChangedListeners.contains(transformChangedListener)) {
            this.transformChangedListeners.add(transformChangedListener);
        }
    }

    public void callOnHierarchy(Consumer<Node> consumer) {
        consumer.accept(this);
        super.callOnHierarchy(consumer);
    }

    /* access modifiers changed from: protected */
    public final boolean canAddChild(Node node, StringBuilder sb) {
        if (!super.canAddChild(node, sb)) {
            return false;
        }
        if (!isDescendantOf(node)) {
            return true;
        }
        sb.append("Cannot add child: A node's parent cannot be one of its descendants.");
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean dispatchTouchEvent(HitTestResult hitTestResult, MotionEvent motionEvent) {
        Preconditions.checkNotNull(hitTestResult, "Parameter \"hitTestResult\" was null.");
        Preconditions.checkNotNull(motionEvent, "Parameter \"motionEvent\" was null.");
        if (!isActive()) {
            return false;
        }
        if (dispatchToViewRenderable(motionEvent)) {
            return true;
        }
        OnTouchListener onTouchListener2 = this.onTouchListener;
        if (onTouchListener2 == null || !onTouchListener2.onTouch(hitTestResult, motionEvent)) {
            return onTouchEvent(hitTestResult, motionEvent);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void dispatchUpdate(FrameTime frameTime) {
        if (isActive()) {
            Renderable renderable = getRenderable();
            if (renderable != null && renderable.getId().checkChanged(this.renderableId)) {
                refreshCollider();
                this.renderableId = renderable.getId().get();
            }
            onUpdate(frameTime);
            ArrayList<LifecycleListener> arrayList = this.lifecycleListeners;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                LifecycleListener lifecycleListener = arrayList.get(i);
                i++;
                lifecycleListener.onUpdated(this, frameTime);
            }
        }
    }

    @Nullable
    public Node findInHierarchy(Predicate<Node> predicate) {
        return predicate.test(this) ? this : super.findInHierarchy(predicate);
    }

    public final Vector3 getBack() {
        return localToWorldDirection(Vector3.back());
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final Collider getCollider() {
        return this.collider;
    }

    @Nullable
    public CollisionShape getCollisionShape() {
        Collider collider2 = this.collider;
        if (collider2 != null) {
            return collider2.getShape();
        }
        return null;
    }

    public final Vector3 getDown() {
        return localToWorldDirection(Vector3.down());
    }

    public final Vector3 getForward() {
        return localToWorldDirection(Vector3.forward());
    }

    public final Vector3 getLeft() {
        return localToWorldDirection(Vector3.left());
    }

    @Nullable
    public Light getLight() {
        LightInstance lightInstance2 = this.lightInstance;
        if (lightInstance2 != null) {
            return lightInstance2.getLight();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Matrix getLocalModelMatrixInternal() {
        if ((this.dirtyTransformFlags & 1) == 1) {
            this.cachedLocalModelMatrix.makeTrs(this.localPosition, this.localRotation, this.localScale);
            this.dirtyTransformFlags &= -2;
        }
        return this.cachedLocalModelMatrix;
    }

    public final Vector3 getLocalPosition() {
        return new Vector3(this.localPosition);
    }

    public final Quaternion getLocalRotation() {
        return new Quaternion(this.localRotation);
    }

    public final Vector3 getLocalScale() {
        return new Vector3(this.localScale);
    }

    public final String getName() {
        return this.name;
    }

    /* access modifiers changed from: package-private */
    public int getNameHash() {
        return this.nameHash;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final NodeParent getNodeParent() {
        return this.parent;
    }

    @Nullable
    public final Node getParent() {
        return this.parentAsNode;
    }

    @Nullable
    public Renderable getRenderable() {
        RenderableInstance renderableInstance2 = this.renderableInstance;
        if (renderableInstance2 == null) {
            return null;
        }
        return renderableInstance2.getRenderable();
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public RenderableInstance getRenderableInstance() {
        return this.renderableInstance;
    }

    public final Vector3 getRight() {
        return localToWorldDirection(Vector3.right());
    }

    @Nullable
    public final Scene getScene() {
        return this.scene;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public SkeletonRig getSkeletonRig() {
        RenderableInstance renderableInstance2 = this.renderableInstance;
        if (renderableInstance2 != null) {
            return renderableInstance2.getSkeletonRig();
        }
        return null;
    }

    public final Vector3 getUp() {
        return localToWorldDirection(Vector3.m8263up());
    }

    public final Matrix getWorldModelMatrix() {
        return getWorldModelMatrixInternal();
    }

    /* access modifiers changed from: package-private */
    public Matrix getWorldModelMatrixInverseInternal() {
        if ((this.dirtyTransformFlags & 4) == 4) {
            Matrix.invert(getWorldModelMatrixInternal(), this.cachedWorldModelMatrixInverse);
            this.dirtyTransformFlags &= -5;
        }
        return this.cachedWorldModelMatrixInverse;
    }

    public final Vector3 getWorldPosition() {
        return new Vector3(getWorldPositionInternal());
    }

    public final Quaternion getWorldRotation() {
        return new Quaternion(getWorldRotationInternal());
    }

    public final Vector3 getWorldScale() {
        return new Vector3(getWorldScaleInternal());
    }

    public final boolean isActive() {
        return this.active;
    }

    public final boolean isDescendantOf(NodeParent nodeParent) {
        Preconditions.checkNotNull(nodeParent, "Parameter \"ancestor\" was null.");
        NodeParent nodeParent2 = this.parent;
        Node node = this.parentAsNode;
        while (nodeParent2 != null) {
            if (nodeParent2 == nodeParent) {
                return true;
            }
            if (node == null) {
                return false;
            }
            nodeParent2 = node.parent;
            node = node.parentAsNode;
        }
        return false;
    }

    public final boolean isEnabled() {
        return this.enabled;
    }

    public boolean isTopLevel() {
        NodeParent nodeParent = this.parent;
        return nodeParent == null || nodeParent == this.scene;
    }

    public final Vector3 localToWorldDirection(Vector3 vector3) {
        Preconditions.checkNotNull(vector3, "Parameter \"direction\" was null.");
        return Quaternion.rotateVector(getWorldRotationInternal(), vector3);
    }

    public final Vector3 localToWorldPoint(Vector3 vector3) {
        Preconditions.checkNotNull(vector3, "Parameter \"point\" was null.");
        return getWorldModelMatrixInternal().transformPoint(vector3);
    }

    public void onActivate() {
    }

    /* access modifiers changed from: protected */
    public final void onAddChild(Node node) {
        super.onAddChild(node);
        node.parentAsNode = this;
        node.markTransformChangedRecursively(62, node);
        node.setSceneRecursively(this.scene);
    }

    public void onDeactivate() {
    }

    /* access modifiers changed from: protected */
    public final void onRemoveChild(Node node) {
        super.onRemoveChild(node);
        node.parentAsNode = null;
        node.markTransformChangedRecursively(62, node);
        node.setSceneRecursively((Scene) null);
    }

    public boolean onTouchEvent(HitTestResult hitTestResult, MotionEvent motionEvent) {
        Node node;
        TapTrackingData tapTrackingData2;
        OnTapListener onTapListener2;
        Preconditions.checkNotNull(hitTestResult, "Parameter \"hitTestResult\" was null.");
        Preconditions.checkNotNull(motionEvent, "Parameter \"motionEvent\" was null.");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || !isActive()) {
            this.tapTrackingData = null;
        }
        boolean z = false;
        if (actionMasked != 0) {
            if ((actionMasked != 1 && actionMasked != 2) || (tapTrackingData2 = this.tapTrackingData) == null) {
                return false;
            }
            if ((hitTestResult.getNode() == tapTrackingData2.f5171a) || Vector3.subtract(tapTrackingData2.f5172b, new Vector3(motionEvent.getX(), motionEvent.getY(), 0.0f)).length() < ((float) getScaledTouchSlop())) {
                if (actionMasked == 1 && (onTapListener2 = this.onTapListener) != null) {
                    onTapListener2.onTap(hitTestResult, motionEvent);
                    z = true;
                }
            }
            this.tapTrackingData = null;
            return z;
        } else if (this.onTapListener == null || (node = hitTestResult.getNode()) == null) {
            return false;
        } else {
            this.tapTrackingData = new TapTrackingData(node, new Vector3(motionEvent.getX(), motionEvent.getY(), 0.0f));
        }
        return true;
    }

    public void onTransformChange(Node node) {
    }

    public void onUpdate(FrameTime frameTime) {
    }

    public void removeLifecycleListener(LifecycleListener lifecycleListener) {
        this.lifecycleListeners.remove(lifecycleListener);
    }

    public void removeTransformChangedListener(TransformChangedListener transformChangedListener) {
        this.transformChangedListeners.remove(transformChangedListener);
    }

    public void setCollisionShape(@Nullable CollisionShape collisionShape2) {
        AndroidPreconditions.checkUiThread();
        this.collisionShape = collisionShape2;
        refreshCollider();
    }

    public final void setEnabled(boolean z) {
        AndroidPreconditions.checkUiThread();
        if (this.enabled != z) {
            this.enabled = z;
            updateActiveStatusRecursively();
        }
    }

    public void setLight(@Nullable Light light) {
        if (getLight() != light) {
            destroyLightInstance();
            if (light != null) {
                createLightInstance(light);
            }
        }
    }

    public void setLocalPosition(Vector3 vector3) {
        Preconditions.checkNotNull(vector3, "Parameter \"position\" was null.");
        this.localPosition.set(vector3);
        markTransformChangedRecursively(63, this);
    }

    public void setLocalRotation(Quaternion quaternion) {
        Preconditions.checkNotNull(quaternion, "Parameter \"rotation\" was null.");
        this.localRotation.set(quaternion);
        markTransformChangedRecursively(63, this);
    }

    public void setLocalScale(Vector3 vector3) {
        Preconditions.checkNotNull(vector3, "Parameter \"scale\" was null.");
        this.localScale.set(vector3);
        markTransformChangedRecursively(63, this);
    }

    public final void setLookDirection(Vector3 vector3) {
        Vector3 up = Vector3.m8263up();
        if (Math.abs(Vector3.dot(vector3, up)) > DIRECTION_UP_EPSILON) {
            up = new Vector3(0.0f, 0.0f, 1.0f);
        }
        setLookDirection(vector3, up);
    }

    public final void setLookDirection(Vector3 vector3, Vector3 vector32) {
        setWorldRotation(Quaternion.lookRotation(vector3, vector32));
    }

    public final void setName(String str) {
        Preconditions.checkNotNull(str, "Parameter \"name\" was null.");
        this.name = str;
        this.nameHash = str.hashCode();
    }

    public void setOnTapListener(@Nullable OnTapListener onTapListener2) {
        if (onTapListener2 != this.onTapListener) {
            this.tapTrackingData = null;
        }
        this.onTapListener = onTapListener2;
    }

    public void setOnTouchListener(@Nullable OnTouchListener onTouchListener2) {
        this.onTouchListener = onTouchListener2;
    }

    public void setParent(@Nullable NodeParent nodeParent) {
        AndroidPreconditions.checkUiThread();
        NodeParent nodeParent2 = this.parent;
        if (nodeParent != nodeParent2) {
            this.allowDispatchTransformChangedListeners = false;
            if (nodeParent != null) {
                nodeParent.addChild(this);
            } else if (nodeParent2 != null) {
                nodeParent2.removeChild(this);
            }
            this.allowDispatchTransformChangedListeners = true;
            markTransformChangedRecursively(62, this);
        }
    }

    public void setRenderable(@Nullable Renderable renderable) {
        int i;
        Scene scene2;
        AndroidPreconditions.checkUiThread();
        RenderableInstance renderableInstance2 = this.renderableInstance;
        if (renderableInstance2 == null || renderableInstance2.getRenderable() != renderable) {
            RenderableInstance renderableInstance3 = this.renderableInstance;
            if (renderableInstance3 != null) {
                if (this.active) {
                    renderableInstance3.detachFromRenderer();
                }
                this.renderableInstance = null;
            }
            if (renderable != null) {
                RenderableInstance createInstance = renderable.createInstance(this);
                if (this.active && (scene2 = this.scene) != null && !scene2.isUnderTesting()) {
                    createInstance.attachToRenderer(getRendererOrDie());
                }
                this.renderableInstance = createInstance;
                i = renderable.getId().get();
            } else {
                i = 0;
            }
            this.renderableId = i;
            refreshCollider();
        }
    }

    /* access modifiers changed from: package-private */
    public final void setSceneRecursively(@Nullable Scene scene2) {
        AndroidPreconditions.checkUiThread();
        setSceneRecursivelyInternal(scene2);
        updateActiveStatusRecursively();
    }

    public void setWorldPosition(Vector3 vector3) {
        Preconditions.checkNotNull(vector3, "Parameter \"position\" was null.");
        Node node = this.parentAsNode;
        if (node == null) {
            this.localPosition.set(vector3);
        } else {
            this.localPosition.set(node.worldToLocalPoint(vector3));
        }
        markTransformChangedRecursively(63, this);
        this.cachedWorldPosition.set(vector3);
        this.dirtyTransformFlags &= -9;
    }

    public void setWorldRotation(Quaternion quaternion) {
        Preconditions.checkNotNull(quaternion, "Parameter \"rotation\" was null.");
        Node node = this.parentAsNode;
        if (node == null) {
            this.localRotation.set(quaternion);
        } else {
            this.localRotation.set(Quaternion.multiply(node.getWorldRotationInternal().inverted(), quaternion));
        }
        markTransformChangedRecursively(63, this);
        this.cachedWorldRotation.set(quaternion);
        this.dirtyTransformFlags &= -17;
    }

    public void setWorldScale(Vector3 vector3) {
        Preconditions.checkNotNull(vector3, "Parameter \"scale\" was null.");
        Node node = this.parentAsNode;
        if (node != null) {
            this.allowDispatchTransformChangedListeners = false;
            setLocalScale(Vector3.one());
            this.allowDispatchTransformChangedListeners = true;
            Matrix localModelMatrixInternal = getLocalModelMatrixInternal();
            Matrix.multiply(node.getWorldModelMatrixInternal(), localModelMatrixInternal, this.cachedWorldModelMatrix);
            localModelMatrixInternal.makeScale(vector3);
            Matrix matrix = this.cachedWorldModelMatrix;
            Matrix.invert(matrix, matrix);
            Matrix.multiply(matrix, localModelMatrixInternal, matrix);
            matrix.decomposeScale(this.localScale);
            setLocalScale(this.localScale);
        } else {
            setLocalScale(vector3);
        }
        this.cachedWorldScale.set(vector3);
        this.dirtyTransformFlags &= -33;
    }

    public String toString() {
        String str = this.name;
        String obj = super.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(obj).length());
        sb.append(str);
        sb.append("(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final Vector3 worldToLocalDirection(Vector3 vector3) {
        Preconditions.checkNotNull(vector3, "Parameter \"direction\" was null.");
        return Quaternion.inverseRotateVector(getWorldRotationInternal(), vector3);
    }

    public final Vector3 worldToLocalPoint(Vector3 vector3) {
        Preconditions.checkNotNull(vector3, "Parameter \"point\" was null.");
        return getWorldModelMatrixInverseInternal().transformPoint(vector3);
    }
}
