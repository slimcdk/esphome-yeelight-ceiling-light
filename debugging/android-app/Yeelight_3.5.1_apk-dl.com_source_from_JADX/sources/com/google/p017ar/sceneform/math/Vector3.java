package com.google.p017ar.sceneform.math;

import com.google.p017ar.sceneform.utilities.Preconditions;

/* renamed from: com.google.ar.sceneform.math.Vector3 */
public class Vector3 {

    /* renamed from: x */
    public float f3277x;

    /* renamed from: y */
    public float f3278y;

    /* renamed from: z */
    public float f3279z;

    public Vector3() {
        this.f3277x = 0.0f;
        this.f3278y = 0.0f;
        this.f3279z = 0.0f;
    }

    public Vector3(float f, float f2, float f3) {
        this.f3277x = f;
        this.f3278y = f2;
        this.f3279z = f3;
    }

    public Vector3(Vector3 vector3) {
        Preconditions.checkNotNull(vector3, "Parameter \"v\" was null.");
        set(vector3);
    }

    public static Vector3 add(Vector3 vector3, Vector3 vector32) {
        Preconditions.checkNotNull(vector3, "Parameter \"lhs\" was null.");
        Preconditions.checkNotNull(vector32, "Parameter \"rhs\" was null.");
        return new Vector3(vector3.f3277x + vector32.f3277x, vector3.f3278y + vector32.f3278y, vector3.f3279z + vector32.f3279z);
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
        return Math.max(Math.max(vector3.f3277x, vector3.f3278y), vector3.f3279z);
    }

    static float componentMin(Vector3 vector3) {
        Preconditions.checkNotNull(vector3, "Parameter \"a\" was null.");
        return Math.min(Math.min(vector3.f3277x, vector3.f3278y), vector3.f3279z);
    }

    public static Vector3 cross(Vector3 vector3, Vector3 vector32) {
        Preconditions.checkNotNull(vector3, "Parameter \"lhs\" was null.");
        Preconditions.checkNotNull(vector32, "Parameter \"rhs\" was null.");
        float f = vector3.f3277x;
        float f2 = vector3.f3278y;
        float f3 = vector3.f3279z;
        float f4 = vector32.f3277x;
        float f5 = vector32.f3278y;
        float f6 = vector32.f3279z;
        return new Vector3((f2 * f6) - (f3 * f5), (f3 * f4) - (f6 * f), (f * f5) - (f2 * f4));
    }

    public static float dot(Vector3 vector3, Vector3 vector32) {
        Preconditions.checkNotNull(vector3, "Parameter \"lhs\" was null.");
        Preconditions.checkNotNull(vector32, "Parameter \"rhs\" was null.");
        return (vector3.f3277x * vector32.f3277x) + (vector3.f3278y * vector32.f3278y) + (vector3.f3279z * vector32.f3279z);
    }

    public static Vector3 down() {
        Vector3 vector3 = new Vector3();
        vector3.setDown();
        return vector3;
    }

    public static boolean equals(Vector3 vector3, Vector3 vector32) {
        Preconditions.checkNotNull(vector3, "Parameter \"lhs\" was null.");
        Preconditions.checkNotNull(vector32, "Parameter \"rhs\" was null.");
        return MathHelper.almostEqualRelativeAndAbs(vector3.f3279z, vector32.f3279z) & MathHelper.almostEqualRelativeAndAbs(vector3.f3277x, vector32.f3277x) & true & MathHelper.almostEqualRelativeAndAbs(vector3.f3278y, vector32.f3278y);
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
        return new Vector3(MathHelper.lerp(vector3.f3277x, vector32.f3277x, f), MathHelper.lerp(vector3.f3278y, vector32.f3278y, f), MathHelper.lerp(vector3.f3279z, vector32.f3279z, f));
    }

    public static Vector3 max(Vector3 vector3, Vector3 vector32) {
        Preconditions.checkNotNull(vector3, "Parameter \"lhs\" was null.");
        Preconditions.checkNotNull(vector32, "Parameter \"rhs\" was null.");
        return new Vector3(Math.max(vector3.f3277x, vector32.f3277x), Math.max(vector3.f3278y, vector32.f3278y), Math.max(vector3.f3279z, vector32.f3279z));
    }

    public static Vector3 min(Vector3 vector3, Vector3 vector32) {
        Preconditions.checkNotNull(vector3, "Parameter \"lhs\" was null.");
        Preconditions.checkNotNull(vector32, "Parameter \"rhs\" was null.");
        return new Vector3(Math.min(vector3.f3277x, vector32.f3277x), Math.min(vector3.f3278y, vector32.f3278y), Math.min(vector3.f3279z, vector32.f3279z));
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
        return new Vector3(vector3.f3277x - vector32.f3277x, vector3.f3278y - vector32.f3278y, vector3.f3279z - vector32.f3279z);
    }

    /* renamed from: up */
    public static Vector3 m5216up() {
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
        return ((((Float.floatToIntBits(this.f3277x) + 31) * 31) + Float.floatToIntBits(this.f3278y)) * 31) + Float.floatToIntBits(this.f3279z);
    }

    public float length() {
        return (float) Math.sqrt((double) lengthSquared());
    }

    /* access modifiers changed from: package-private */
    public float lengthSquared() {
        float f = this.f3277x;
        float f2 = this.f3278y;
        float f3 = (f * f) + (f2 * f2);
        float f4 = this.f3279z;
        return f3 + (f4 * f4);
    }

    public Vector3 negated() {
        return new Vector3(-this.f3277x, -this.f3278y, -this.f3279z);
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
        return new Vector3(this.f3277x * f, this.f3278y * f, this.f3279z * f);
    }

    public void set(float f, float f2, float f3) {
        this.f3277x = f;
        this.f3278y = f2;
        this.f3279z = f3;
    }

    public void set(Vector3 vector3) {
        Preconditions.checkNotNull(vector3, "Parameter \"v\" was null.");
        this.f3277x = vector3.f3277x;
        this.f3278y = vector3.f3278y;
        this.f3279z = vector3.f3279z;
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
        float f = this.f3277x;
        float f2 = this.f3278y;
        float f3 = this.f3279z;
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