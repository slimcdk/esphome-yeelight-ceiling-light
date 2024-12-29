package com.google.p107ar.sceneform.collision;

import com.google.p107ar.sceneform.common.TransformProvider;
import com.google.p107ar.sceneform.math.Matrix;
import com.google.p107ar.sceneform.math.Vector3;
import com.google.p107ar.sceneform.utilities.Preconditions;

/* renamed from: com.google.ar.sceneform.collision.Sphere */
public class Sphere extends CollisionShape {
    private static final String TAG = "Sphere";
    private final Vector3 center;
    private float radius;

    public Sphere() {
        this.center = new Vector3();
        this.radius = 1.0f;
    }

    public Sphere(float f) {
        this(f, Vector3.zero());
    }

    public Sphere(float f, Vector3 vector3) {
        this.center = new Vector3();
        this.radius = 1.0f;
        Preconditions.checkNotNull(vector3, "Parameter \"center\" was null.");
        setCenter(vector3);
        setRadius(f);
    }

    /* access modifiers changed from: protected */
    public boolean boxIntersection(Box box) {
        return C2680a.m8227d(this, box);
    }

    public Vector3 getCenter() {
        return new Vector3(this.center);
    }

    public float getRadius() {
        return this.radius;
    }

    public Sphere makeCopy() {
        return new Sphere(getRadius(), getCenter());
    }

    /* access modifiers changed from: protected */
    public boolean rayIntersection(Ray ray, RayHit rayHit) {
        Preconditions.checkNotNull(ray, "Parameter \"ray\" was null.");
        Preconditions.checkNotNull(rayHit, "Parameter \"result\" was null.");
        Vector3 direction = ray.getDirection();
        Vector3 subtract = Vector3.subtract(ray.getOrigin(), this.center);
        float dot = Vector3.dot(subtract, direction) * 2.0f;
        float dot2 = Vector3.dot(subtract, subtract);
        float f = this.radius;
        float f2 = (dot * dot) - ((dot2 - (f * f)) * 4.0f);
        if (f2 < 0.0f) {
            return false;
        }
        float sqrt = (float) Math.sqrt((double) f2);
        float f3 = -dot;
        float f4 = (f3 - sqrt) / 2.0f;
        float f5 = (f3 + sqrt) / 2.0f;
        if (f4 < 0.0f && f5 < 0.0f) {
            return false;
        }
        if (f4 >= 0.0f || f5 <= 0.0f) {
            rayHit.setDistance(f4);
        } else {
            rayHit.setDistance(f5);
        }
        rayHit.setPoint(ray.getPoint(rayHit.getDistance()));
        return true;
    }

    public void setCenter(Vector3 vector3) {
        Preconditions.checkNotNull(vector3, "Parameter \"center\" was null.");
        this.center.set(vector3);
        onChanged();
    }

    public void setRadius(float f) {
        this.radius = f;
        onChanged();
    }

    /* access modifiers changed from: protected */
    public boolean shapeIntersection(CollisionShape collisionShape) {
        Preconditions.checkNotNull(collisionShape, "Parameter \"shape\" was null.");
        return collisionShape.sphereIntersection(this);
    }

    /* access modifiers changed from: protected */
    public boolean sphereIntersection(Sphere sphere) {
        Preconditions.checkNotNull(this, "Parameter \"sphere1\" was null.");
        Preconditions.checkNotNull(sphere, "Parameter \"sphere2\" was null.");
        float radius2 = getRadius() + sphere.getRadius();
        Vector3 subtract = Vector3.subtract(sphere.getCenter(), getCenter());
        float dot = Vector3.dot(subtract, subtract);
        return dot - (radius2 * radius2) <= 0.0f && dot != 0.0f;
    }

    /* access modifiers changed from: package-private */
    public CollisionShape transform(TransformProvider transformProvider) {
        Preconditions.checkNotNull(transformProvider, "Parameter \"transformProvider\" was null.");
        Sphere sphere = new Sphere();
        transform(transformProvider, sphere);
        return sphere;
    }

    /* access modifiers changed from: package-private */
    public void transform(TransformProvider transformProvider, CollisionShape collisionShape) {
        Preconditions.checkNotNull(transformProvider, "Parameter \"transformProvider\" was null.");
        Preconditions.checkNotNull(collisionShape, "Parameter \"result\" was null.");
        if (collisionShape instanceof Sphere) {
            Sphere sphere = (Sphere) collisionShape;
            Matrix worldModelMatrix = transformProvider.getWorldModelMatrix();
            sphere.setCenter(worldModelMatrix.transformPoint(this.center));
            Vector3 vector3 = new Vector3();
            worldModelMatrix.decomposeScale(vector3);
            sphere.radius = this.radius * Math.max(Math.abs(Math.min(Math.min(vector3.f5202x, vector3.f5203y), vector3.f5204z)), Math.max(Math.max(vector3.f5202x, vector3.f5203y), vector3.f5204z));
        }
    }
}
