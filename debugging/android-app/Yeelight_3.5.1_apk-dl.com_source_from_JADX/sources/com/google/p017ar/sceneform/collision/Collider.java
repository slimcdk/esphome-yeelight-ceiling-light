package com.google.p017ar.sceneform.collision;

import androidx.annotation.Nullable;
import com.google.p017ar.sceneform.common.TransformProvider;
import com.google.p017ar.sceneform.utilities.Preconditions;

/* renamed from: com.google.ar.sceneform.collision.Collider */
public class Collider {
    @Nullable
    private CollisionSystem attachedCollisionSystem;
    @Nullable
    private CollisionShape cachedWorldShape;
    private boolean isWorldShapeDirty;
    private CollisionShape localShape;
    private int shapeId = 0;
    private TransformProvider transformProvider;

    public Collider(TransformProvider transformProvider2, CollisionShape collisionShape) {
        Preconditions.checkNotNull(transformProvider2, "Parameter \"transformProvider\" was null.");
        Preconditions.checkNotNull(collisionShape, "Parameter \"localCollisionShape\" was null.");
        this.transformProvider = transformProvider2;
        setShape(collisionShape);
    }

    private boolean doesCachedWorldShapeNeedUpdate() {
        CollisionShape collisionShape = this.localShape;
        if (collisionShape == null) {
            return false;
        }
        return collisionShape.getId().checkChanged(this.shapeId) || this.isWorldShapeDirty || this.cachedWorldShape == null;
    }

    private void updateCachedWorldShape() {
        if (doesCachedWorldShapeNeedUpdate()) {
            CollisionShape collisionShape = this.cachedWorldShape;
            if (collisionShape == null) {
                this.cachedWorldShape = this.localShape.transform(this.transformProvider);
            } else {
                this.localShape.transform(this.transformProvider, collisionShape);
            }
            this.shapeId = this.localShape.getId().get();
        }
    }

    public CollisionShape getShape() {
        return this.localShape;
    }

    public TransformProvider getTransformProvider() {
        return this.transformProvider;
    }

    @Nullable
    public CollisionShape getTransformedShape() {
        updateCachedWorldShape();
        return this.cachedWorldShape;
    }

    public void markWorldShapeDirty() {
        this.isWorldShapeDirty = true;
    }

    public void setAttachedCollisionSystem(@Nullable CollisionSystem collisionSystem) {
        CollisionSystem collisionSystem2 = this.attachedCollisionSystem;
        if (collisionSystem2 != null) {
            collisionSystem2.removeCollider(this);
        }
        this.attachedCollisionSystem = collisionSystem;
        if (collisionSystem != null) {
            collisionSystem.addCollider(this);
        }
    }

    public void setShape(CollisionShape collisionShape) {
        Preconditions.checkNotNull(collisionShape, "Parameter \"localCollisionShape\" was null.");
        this.localShape = collisionShape;
        this.cachedWorldShape = null;
    }
}
