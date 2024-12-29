package com.google.p017ar.sceneform.rendering;

import androidx.annotation.Nullable;
import com.google.p017ar.sceneform.math.Vector3;

/* renamed from: com.google.ar.sceneform.rendering.Vertex */
public class Vertex {
    @Nullable
    private Color color;
    @Nullable
    private Vector3 normal;
    private final Vector3 position;
    @Nullable
    private UvCoordinate uvCoordinate;

    /* renamed from: com.google.ar.sceneform.rendering.Vertex$Builder */
    public static final class Builder {
        /* access modifiers changed from: private */
        @Nullable
        public Color color;
        /* access modifiers changed from: private */
        @Nullable
        public Vector3 normal;
        /* access modifiers changed from: private */
        public final Vector3 position = Vector3.zero();
        /* access modifiers changed from: private */
        @Nullable
        public UvCoordinate uvCoordinate;

        public Vertex build() {
            return new Vertex(this);
        }

        public Builder setColor(@Nullable Color color2) {
            this.color = color2;
            return this;
        }

        public Builder setNormal(@Nullable Vector3 vector3) {
            this.normal = vector3;
            return this;
        }

        public Builder setPosition(Vector3 vector3) {
            this.position.set(vector3);
            return this;
        }

        public Builder setUvCoordinate(@Nullable UvCoordinate uvCoordinate2) {
            this.uvCoordinate = uvCoordinate2;
            return this;
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.Vertex$UvCoordinate */
    public static final class UvCoordinate {

        /* renamed from: x */
        public float f3347x;

        /* renamed from: y */
        public float f3348y;

        public UvCoordinate(float f, float f2) {
            this.f3347x = f;
            this.f3348y = f2;
        }
    }

    private Vertex(Builder builder) {
        Vector3 zero = Vector3.zero();
        this.position = zero;
        zero.set(builder.position);
        this.normal = builder.normal;
        this.uvCoordinate = builder.uvCoordinate;
        this.color = builder.color;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Nullable
    public Color getColor() {
        return this.color;
    }

    @Nullable
    public Vector3 getNormal() {
        return this.normal;
    }

    public Vector3 getPosition() {
        return this.position;
    }

    @Nullable
    public UvCoordinate getUvCoordinate() {
        return this.uvCoordinate;
    }

    public void setColor(@Nullable Color color2) {
        this.color = color2;
    }

    public void setNormal(@Nullable Vector3 vector3) {
        this.normal = vector3;
    }

    public void setPosition(Vector3 vector3) {
        this.position.set(vector3);
    }

    public void setUvCoordinate(@Nullable UvCoordinate uvCoordinate2) {
        this.uvCoordinate = uvCoordinate2;
    }
}
