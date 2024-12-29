package com.google.p107ar.sceneform.math;

import com.google.p107ar.sceneform.utilities.Preconditions;

/* renamed from: com.google.ar.sceneform.math.Vector3 */
public class Vector3 {

    /* renamed from: x */
    public float f5202x;

    /* renamed from: y */
    public float f5203y;

    /* renamed from: z */
    public float f5204z;

    public Vector3() {
        this.f5202x = 0.0f;
        this.f5203y = 0.0f;
        this.f5204z = 0.0f;
    }

    public Vector3(float f, float f2, float f3) {
        this.f5202x = f;
        this.f5203y = f2;
        this.f5204z = f3;
    }

    public Vector3(Vector3 vector3) {
        Preconditions.checkNotNull(vector3, "Parameter \"v\" was null.");
        set(vector3);
    }

    public static Vector3 add(Vector3 vector3, Vector3 vector32) {
        Preconditions.checkNotNull(vector3, "Parameter \"lhs\" was null.");
        Preconditions.checkNotNull(vector32, "Parameter \"rhs\" was null.");
        return new Vector3(vector3.f5202x + vector32.f5202x, vector3.f5203y + vector32.f5203y, vector3.f5204z + vector32.f5204z);
    }

    public static float angleBetweenVectors(Vector3 vector3, Vector3 vector32) {
        float length = vector3.length() * vector32.length();
        if (MathHelper.almostEqualRelativeAndAbs(length, 0.0f)) {
            return 0.0f;
        }
        return (float) Math.toDegrees((double) ((float) Math.acos((double) MathHelper.clamp(dot(vector3, vector32) / length, -1.0f, 1.0f))));
    }

    public static Vector3 back() {
        Vector3 vector3 = new Vector3();
        vector3.setBack();
        return vector3;
    }

    static float componentMax(Vector3 vector3) {
        Preconditions.checkNotNull(vector3, "Parameter \"a\" was null.");
        return Math.max(Math.max(vector3.f5202x, vector3.f5203y), vector3.f5204z);
    }

    static float componentMin(Vector3 vector3) {
        Preconditions.checkNotNull(vector3, "Parameter \"a\" was null.");
        return Math.min(Math.min(vector3.f5202x, vector3.f5203y), vector3.f5204z);
    }

    public static Vector3 cross(Vector3 vector3, Vector3 vector32) {
        Preconditions.checkNotNull(vector3, "Parameter \"lhs\" was null.");
        Preconditions.checkNotNull(vector32, "Parameter \"rhs\" was null.");
        float f = vector3.f5202x;
        float f2 = vector3.f5203y;
        float f3 = vector3.f5204z;
        float f4 = vector32.f5202x;
        float f5 = vector32.f5203y;
        float f6 = vector32.f5204z;
        return new Vector3((f2 * f6) - (f3 * f5), (f3 * f4) - (f6 * f), (f * f5) - (f2 * f4));
    }

    public static float dot(Vector3 vector3, Vector3 vector32) {
        Preconditions.checkNotNull(vector3, "Parameter \"lhs\" was null.");
        Preconditions.checkNotNull(vector32, "Parameter \"rhs\" was null.");
        return (vector3.f5202x * vector32.f5202x) + (vector3.f5203y * vector32.f5203y) + (vector3.f5204z * vector32.f5204z);
    }

    public static Vector3 down() {
        Vector3 vector3 = new Vector3();
        vector3.setDown();
        return vector3;
    }

    public static boolean equals(Vector3 vector3, Vector3 vector32) {
        Preconditions.checkNotNull(vector3, "Parameter \"lhs\" was null.");
        Preconditions.checkNotNull(vector32, "Parameter \"rhs\" was null.");
        return MathHelper.almostEqualRelativeAndAbs(vector3.f5204z, vector32.f5204z) & MathHelper.almostEqualRelativeAndAbs(vector3.f5202x, vector32.f5202x) & true & MathHelper.almostEqualRelativeAndAbs(vector3.f5203y, vector32.f5203y);
    }

    public static Vector3 forward() {
        Vector3 vector3 = new Vector3();
        vector3.setForward();
        return vector3;
    }

    public static Vector3 left() {
        Vector3 vector3 = new Vector3();
        vector3.setLeft();
        return vector3;
    }

    public static Vector3 lerp(Vector3 vector3, Vector3 vector32, float f) {
        Preconditions.checkNotNull(vector3, "Parameter \"a\" was null.");
        Preconditions.checkNotNull(vector32, "Parameter \"b\" was null.");
        return new Vector3(MathHelper.lerp(vector3.f5202x, vector32.f5202x, f), MathHelper.lerp(vector3.f5203y, vector32.f5203y, f), MathHelper.lerp(vector3.f5204z, vector32.f5204z, f));
    }

    public static Vector3 max(Vector3 vector3, Vector3 vector32) {
        Preconditions.checkNotNull(vector3, "Parameter \"lhs\" was null.");
        Preconditions.checkNotNull(vector32, "Parameter \"rhs\" was null.");
        return new Vector3(Math.max(vector3.f5202x, vector32.f5202x), Math.max(vector3.f5203y, vector32.f5203y), Math.max(vector3.f5204z, vector32.f5204z));
    }

    public static Vector3 min(Vector3 vector3, Vector3 vector32) {
        Preconditions.checkNotNull(vector3, "Parameter \"lhs\" was null.");
        Preconditions.checkNotNull(vector32, "Parameter \"rhs\" was null.");
        return new Vector3(Math.min(vector3.f5202x, vector32.f5202x), Math.min(vector3.f5203y, vector32.f5203y), Math.min(vector3.f5204z, vector32.f5204z));
    }

    public static Vector3 one() {
        Vector3 vector3 = new Vector3();
        vector3.setOne();
        return vector3;
    }

    public static Vector3 right() {
        Vector3 vector3 = new Vector3();
        vector3.setRight();
        return vector3;
    }

    public static Vector3 subtract(Vector3 vector3, Vector3 vector32) {
        Preconditions.checkNotNull(vector3, "Parameter \"lhs\" was null.");
        Preconditions.checkNotNull(vector32, "Parameter \"rhs\" was null.");
        return new Vector3(vector3.f5202x - vector32.f5202x, vector3.f5203y - vector32.f5203y, vector3.f5204z - vector32.f5204z);
    }

    /* renamed from: up */
    public static Vector3 m8263up() {
        Vector3 vector3 = new Vector3();
        vector3.setUp();
        return vector3;
    }

    public static Vector3 zero() {
        return new Vector3();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Vector3)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return equals(this, (Vector3) obj);
    }

    public int hashCode() {
        return ((((Float.floatToIntBits(this.f5202x) + 31) * 31) + Float.floatToIntBits(this.f5203y)) * 31) + Float.floatToIntBits(this.f5204z);
    }

    public float length() {
        return (float) Math.sqrt((double) lengthSquared());
    }

    /* access modifiers changed from: package-private */
    public float lengthSquared() {
        float f = this.f5202x;
        float f2 = this.f5203y;
        float f3 = (f * f) + (f2 * f2);
        float f4 = this.f5204z;
        return f3 + (f4 * f4);
    }

    public Vector3 negated() {
        return new Vector3(-this.f5202x, -this.f5203y, -this.f5204z);
    }

    public Vector3 normalized() {
        Vector3 vector3 = new Vector3(this);
        float dot = dot(this, this);
        if (MathHelper.almostEqualRelativeAndAbs(dot, 0.0f)) {
            vector3.setZero();
        } else if (dot != 1.0f) {
            vector3.set(scaled((float) (1.0d / Math.sqrt((double) dot))));
        }
        return vector3;
    }

    public Vector3 scaled(float f) {
        return new Vector3(this.f5202x * f, this.f5203y * f, this.f5204z * f);
    }

    public void set(float f, float f2, float f3) {
        this.f5202x = f;
        this.f5203y = f2;
        this.f5204z = f3;
    }

    public void set(Vector3 vector3) {
        Preconditions.checkNotNull(vector3, "Parameter \"v\" was null.");
        this.f5202x = vector3.f5202x;
        this.f5203y = vector3.f5203y;
        this.f5204z = vector3.f5204z;
    }

    /* access modifiers changed from: package-private */
    public void setBack() {
        set(0.0f, 0.0f, 1.0f);
    }

    /* access modifiers changed from: package-private */
    public void setDown() {
        set(0.0f, -1.0f, 0.0f);
    }

    /* access modifiers changed from: package-private */
    public void setForward() {
        set(0.0f, 0.0f, -1.0f);
    }

    /* access modifiers changed from: package-private */
    public void setLeft() {
        set(-1.0f, 0.0f, 0.0f);
    }

    /* access modifiers changed from: package-private */
    public void setOne() {
        set(1.0f, 1.0f, 1.0f);
    }

    /* access modifiers changed from: package-private */
    public void setRight() {
        set(1.0f, 0.0f, 0.0f);
    }

    /* access modifiers changed from: package-private */
    public void setUp() {
        set(0.0f, 1.0f, 0.0f);
    }

    /* access modifiers changed from: package-private */
    public void setZero() {
        set(0.0f, 0.0f, 0.0f);
    }

    public String toString() {
        float f = this.f5202x;
        float f2 = this.f5203y;
        float f3 = this.f5204z;
        StringBuilder sb = new StringBuilder(57);
        sb.append("[x=");
        sb.append(f);
        sb.append(", y=");
        sb.append(f2);
        sb.append(", z=");
        sb.append(f3);
        sb.append("]");
        return sb.toString();
    }
}
