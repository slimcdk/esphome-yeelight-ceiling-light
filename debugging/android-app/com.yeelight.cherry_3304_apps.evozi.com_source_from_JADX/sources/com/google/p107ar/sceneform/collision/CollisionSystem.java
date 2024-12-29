package com.google.p107ar.sceneform.collision;

import androidx.annotation.Nullable;
import com.google.p107ar.sceneform.utilities.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* renamed from: com.google.ar.sceneform.collision.CollisionSystem */
public class CollisionSystem {
    private static final String TAG = "CollisionSystem";
    private final ArrayList<Collider> colliders = new ArrayList<>();

    public void addCollider(Collider collider) {
        Preconditions.checkNotNull(collider, "Parameter \"collider\" was null.");
        this.colliders.add(collider);
    }

    @Nullable
    public Collider intersects(Collider collider) {
        CollisionShape transformedShape;
        Preconditions.checkNotNull(collider, "Parameter \"collider\" was null.");
        CollisionShape transformedShape2 = collider.getTransformedShape();
        if (transformedShape2 == null) {
            return null;
        }
        ArrayList<Collider> arrayList = this.colliders;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Collider collider2 = arrayList.get(i);
            i++;
            Collider collider3 = collider2;
            if (collider3 != collider && (transformedShape = collider3.getTransformedShape()) != null && transformedShape2.shapeIntersection(transformedShape)) {
                return collider3;
            }
        }
        return null;
    }

    public void intersectsAll(Collider collider, Consumer<Collider> consumer) {
        CollisionShape transformedShape;
        Preconditions.checkNotNull(collider, "Parameter \"collider\" was null.");
        Preconditions.checkNotNull(consumer, "Parameter \"processResult\" was null.");
        CollisionShape transformedShape2 = collider.getTransformedShape();
        if (transformedShape2 != null) {
            ArrayList<Collider> arrayList = this.colliders;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Collider collider2 = arrayList.get(i);
                i++;
                Collider collider3 = collider2;
                if (!(collider3 == collider || (transformedShape = collider3.getTransformedShape()) == null || !transformedShape2.shapeIntersection(transformedShape))) {
                    consumer.accept(collider3);
                }
            }
        }
    }

    @Nullable
    public Collider raycast(Ray ray, RayHit rayHit) {
        Preconditions.checkNotNull(ray, "Parameter \"ray\" was null.");
        Preconditions.checkNotNull(rayHit, "Parameter \"resultHit\" was null.");
        rayHit.reset();
        RayHit rayHit2 = new RayHit();
        ArrayList<Collider> arrayList = this.colliders;
        int size = arrayList.size();
        Collider collider = null;
        int i = 0;
        while (i < size) {
            Collider collider2 = arrayList.get(i);
            i++;
            Collider collider3 = collider2;
            CollisionShape transformedShape = collider3.getTransformedShape();
            if (transformedShape != null && transformedShape.rayIntersection(ray, rayHit2) && rayHit2.getDistance() < rayHit.getDistance()) {
                rayHit.set(rayHit2);
                collider = collider3;
            }
        }
        return collider;
    }

    public <T extends RayHit> int raycastAll(Ray ray, ArrayList<T> arrayList, @Nullable BiConsumer<T, Collider> biConsumer, Supplier<T> supplier) {
        RayHit rayHit;
        Preconditions.checkNotNull(ray, "Parameter \"ray\" was null.");
        Preconditions.checkNotNull(arrayList, "Parameter \"resultBuffer\" was null.");
        Preconditions.checkNotNull(supplier, "Parameter \"allocateResult\" was null.");
        RayHit rayHit2 = new RayHit();
        ArrayList<Collider> arrayList2 = this.colliders;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            Collider collider = arrayList2.get(i);
            i++;
            Collider collider2 = collider;
            CollisionShape transformedShape = collider2.getTransformedShape();
            if (transformedShape != null && transformedShape.rayIntersection(ray, rayHit2)) {
                i2++;
                if (arrayList.size() >= i2) {
                    rayHit = (RayHit) arrayList.get(i2 - 1);
                } else {
                    rayHit = (RayHit) supplier.get();
                    arrayList.add(rayHit);
                }
                rayHit.reset();
                rayHit.set(rayHit2);
                if (biConsumer != null) {
                    biConsumer.accept(rayHit, collider2);
                }
            }
        }
        for (int i3 = i2; i3 < arrayList.size(); i3++) {
            ((RayHit) arrayList.get(i3)).reset();
        }
        Collections.sort(arrayList, C2681b.f5186a);
        return i2;
    }

    public void removeCollider(Collider collider) {
        Preconditions.checkNotNull(collider, "Parameter \"collider\" was null.");
        this.colliders.remove(collider);
    }
}
