package com.google.p017ar.sceneform.collision;

import com.google.p017ar.sceneform.common.TransformProvider;
import com.google.p017ar.sceneform.utilities.ChangeId;

/* renamed from: com.google.ar.sceneform.collision.CollisionShape */
public abstract class CollisionShape {
    private final ChangeId changeId;

    CollisionShape() {
        ChangeId changeId2 = new ChangeId();
        this.changeId = changeId2;
        changeId2.update();
    }

    /* access modifiers changed from: protected */
    public abstract boolean boxIntersection(Box box);

    /* access modifiers changed from: package-private */
    public ChangeId getId() {
        return this.changeId;
    }

    public abstract CollisionShape makeCopy();

    /* access modifiers changed from: protected */
    public void onChanged() {
        this.changeId.update();
    }

    /* access modifiers changed from: protected */
    public abstract boolean rayIntersection(Ray ray, RayHit rayHit);

    /* access modifiers changed from: protected */
    public abstract boolean shapeIntersection(CollisionShape collisionShape);

    /* access modifiers changed from: protected */
    public abstract boolean sphereIntersection(Sphere sphere);

    /* access modifiers changed from: package-private */
    public abstract CollisionShape transform(TransformProvider transformProvider);

    /* access modifiers changed from: package-private */
    public abstract void transform(TransformProvider transformProvider, CollisionShape collisionShape);
}
