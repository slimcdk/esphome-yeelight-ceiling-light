package com.google.p017ar.sceneform.math;

import com.google.p017ar.sceneform.utilities.Preconditions;

/* renamed from: com.google.ar.sceneform.math.Quaternion */
public class Quaternion {
    private static final float SLERP_THRESHOLD = 0.9995f;

    /* renamed from: w */
    public float f3273w;

    /* renamed from: x */
    public float f3274x;

    /* renamed from: y */
    public float f3275y;

    /* renamed from: z */
    public float f3276z;

    public Quaternion() {
        this.f3274x = 0.0f;
        this.f3275y = 0.0f;
        this.f3276z = 0.0f;
        this.f3273w = 1.0f;
    }

    public Quaternion(float f, float f2, float f3, float f4) {
        set(f, f2, f3, f4);
    }

    public Quaternion(Quaternion quaternion) {
        Preconditions.checkNotNull(quaternion, "Parameter \"q\" was null.");
        set(quaternion);
    }

    public Quaternion(Vector3 vector3) {
        Preconditions.checkNotNull(vector3, "Parameter \"eulerAngles\" was null.");
        set(eulerAngles(vector3));
    }

    public Quaternion(Vector3 vector3, float f) {
        Preconditions.checkNotNull(vector3, "Parameter \"axis\" was null.");
        set(axisAngle(vector3, f));
    }

    static Quaternion add(Quaternion quaternion, Quaternion quaternion2) {
        Preconditions.checkNotNull(quaternion, "Parameter \"lhs\" was null.");
        Preconditions.checkNotNull(quaternion2, "Parameter \"rhs\" was null.");
        Quaternion quaternion3 = new Quaternion();
        quaternion3.f3274x = quaternion.f3274x + quaternion2.f3274x;
        quaternion3.f3275y = quaternion.f3275y + quaternion2.f3275y;
        quaternion3.f3276z = quaternion.f3276z + quaternion2.f3276z;
        quaternion3.f3273w = quaternion.f3273w + quaternion2.f3273w;
        return quaternion3;
    }

    public static Quaternion axisAngle(Vector3 vector3, float f) {
        Preconditions.checkNotNull(vector3, "Parameter \"axis\" was null.");
        Quaternion quaternion = new Quaternion();
        double radians = Math.toRadians((double) f) / 2.0d;
        double sin = Math.sin(radians);
        double d = (double) vector3.f3277x;
        Double.isNaN(d);
        quaternion.f3274x = (float) (d * sin);
        double d2 = (double) vector3.f3278y;
        Double.isNaN(d2);
        quaternion.f3275y = (float) (d2 * sin);
        double d3 = (double) vector3.f3279z;
        Double.isNaN(d3);
        quaternion.f3276z = (float) (d3 * sin);
        quaternion.f3273w = (float) Math.cos(radians);
        quaternion.normalize();
        return quaternion;
    }

    static float dot(Quaternion quaternion, Quaternion quaternion2) {
        Preconditions.checkNotNull(quaternion, "Parameter \"lhs\" was null.");
        Preconditions.checkNotNull(quaternion2, "Parameter \"rhs\" was null.");
        return (quaternion.f3274x * quaternion2.f3274x) + (quaternion.f3275y * quaternion2.f3275y) + (quaternion.f3276z * quaternion2.f3276z) + (quaternion.f3273w * quaternion2.f3273w);
    }

    public static boolean equals(Quaternion quaternion, Quaternion quaternion2) {
        Preconditions.checkNotNull(quaternion, "Parameter \"lhs\" was null.");
        Preconditions.checkNotNull(quaternion2, "Parameter \"rhs\" was null.");
        return MathHelper.almostEqualRelativeAndAbs(dot(quaternion, quaternion2), 1.0f);
    }

    public static Quaternion eulerAngles(Vector3 vector3) {
        Preconditions.checkNotNull(vector3, "Parameter \"eulerAngles\" was null.");
        Quaternion quaternion = new Quaternion(Vector3.right(), vector3.f3277x);
        Quaternion quaternion2 = new Quaternion(Vector3.m5216up(), vector3.f3278y);
        return multiply(multiply(quaternion2, quaternion), new Quaternion(Vector3.back(), vector3.f3279z));
    }

    public static Quaternion identity() {
        return new Quaternion();
    }

    public static Vector3 inverseRotateVector(Quaternion quaternion, Vector3 vector3) {
        Quaternion quaternion2 = quaternion;
        Vector3 vector32 = vector3;
        Preconditions.checkNotNull(quaternion2, "Parameter \"q\" was null.");
        Preconditions.checkNotNull(vector32, "Parameter \"src\" was null.");
        Vector3 vector33 = new Vector3();
        float f = quaternion2.f3273w;
        float f2 = f * f;
        float f3 = quaternion2.f3274x;
        float f4 = (-f3) * (-f3);
        float f5 = quaternion2.f3275y;
        float f6 = (-f5) * (-f5);
        float f7 = quaternion2.f3276z;
        float f8 = (-f7) * (-f7);
        float f9 = (-f7) * f;
        float f10 = (-f3) * (-f5);
        float f11 = (-f3) * (-f7);
        float f12 = (-f5) * f;
        float f13 = (-f5) * (-f7);
        float f14 = (-f3) * f;
        float f15 = f10 + f9 + f9 + f10;
        float f16 = (((-f9) + f10) - f9) + f10;
        float f17 = f13 + f13;
        float f18 = f17 + f14 + f14;
        float f19 = (f17 - f14) - f14;
        float f20 = ((f8 - f6) - f4) + f2;
        float f21 = vector32.f3277x;
        float f22 = vector32.f3278y;
        float f23 = vector32.f3279z;
        vector33.f3277x = ((((f2 + f4) - f8) - f6) * f21) + (f16 * f22) + ((f12 + f11 + f11 + f12) * f23);
        vector33.f3278y = (f15 * f21) + ((((f6 - f8) + f2) - f4) * f22) + (f19 * f23);
        vector33.f3279z = ((((f11 - f12) + f11) - f12) * f21) + (f18 * f22) + (f20 * f23);
        return vector33;
    }

    static Quaternion lerp(Quaternion quaternion, Quaternion quaternion2, float f) {
        Preconditions.checkNotNull(quaternion, "Parameter \"a\" was null.");
        Preconditions.checkNotNull(quaternion2, "Parameter \"b\" was null.");
        return new Quaternion(MathHelper.lerp(quaternion.f3274x, quaternion2.f3274x, f), MathHelper.lerp(quaternion.f3275y, quaternion2.f3275y, f), MathHelper.lerp(quaternion.f3276z, quaternion2.f3276z, f), MathHelper.lerp(quaternion.f3273w, quaternion2.f3273w, f));
    }

    public static Quaternion lookRotation(Vector3 vector3, Vector3 vector32) {
        Preconditions.checkNotNull(vector3, "Parameter \"forwardInWorld\" was null.");
        Preconditions.checkNotNull(vector32, "Parameter \"desiredUpInWorld\" was null.");
        Quaternion rotationBetweenVectors = rotationBetweenVectors(Vector3.forward(), vector3);
        return multiply(rotationBetweenVectors(rotateVector(rotationBetweenVectors, Vector3.m5216up()), Vector3.cross(Vector3.cross(vector3, vector32), vector3)), rotationBetweenVectors);
    }

    public static Quaternion multiply(Quaternion quaternion, Quaternion quaternion2) {
        Preconditions.checkNotNull(quaternion, "Parameter \"lhs\" was null.");
        Preconditions.checkNotNull(quaternion2, "Parameter \"rhs\" was null.");
        float f = quaternion.f3274x;
        float f2 = quaternion.f3275y;
        float f3 = quaternion.f3276z;
        float f4 = quaternion.f3273w;
        float f5 = quaternion2.f3274x;
        float f6 = quaternion2.f3275y;
        float f7 = quaternion2.f3276z;
        float f8 = quaternion2.f3273w;
        return new Quaternion((((f4 * f5) + (f * f8)) + (f2 * f7)) - (f3 * f6), ((f4 * f6) - (f * f7)) + (f2 * f8) + (f3 * f5), (((f4 * f7) + (f * f6)) - (f2 * f5)) + (f3 * f8), (((f4 * f8) - (f * f5)) - (f2 * f6)) - (f3 * f7));
    }

    public static Vector3 rotateVector(Quaternion quaternion, Vector3 vector3) {
        Quaternion quaternion2 = quaternion;
        Vector3 vector32 = vector3;
        Preconditions.checkNotNull(quaternion2, "Parameter \"q\" was null.");
        Preconditions.checkNotNull(vector32, "Parameter \"src\" was null.");
        Vector3 vector33 = new Vector3();
        float f = quaternion2.f3273w;
        float f2 = f * f;
        float f3 = quaternion2.f3274x;
        float f4 = f3 * f3;
        float f5 = quaternion2.f3275y;
        float f6 = f5 * f5;
        float f7 = quaternion2.f3276z;
        float f8 = f7 * f7;
        float f9 = f7 * f;
        float f10 = f3 * f5;
        float f11 = f3 * f7;
        float f12 = f5 * f;
        float f13 = f5 * f7;
        float f14 = f3 * f;
        float f15 = f10 + f9 + f9 + f10;
        float f16 = (((-f9) + f10) - f9) + f10;
        float f17 = f13 + f13;
        float f18 = f17 + f14 + f14;
        float f19 = (f17 - f14) - f14;
        float f20 = ((f8 - f6) - f4) + f2;
        float f21 = vector32.f3277x;
        float f22 = vector32.f3278y;
        float f23 = vector32.f3279z;
        vector33.f3277x = ((((f2 + f4) - f8) - f6) * f21) + (f16 * f22) + ((f12 + f11 + f11 + f12) * f23);
        vector33.f3278y = (f15 * f21) + ((((f6 - f8) + f2) - f4) * f22) + (f19 * f23);
        vector33.f3279z = ((((f11 - f12) + f11) - f12) * f21) + (f18 * f22) + (f20 * f23);
        return vector33;
    }

    public static Quaternion rotationBetweenVectors(Vector3 vector3, Vector3 vector32) {
        Preconditions.checkNotNull(vector3, "Parameter \"start\" was null.");
        Preconditions.checkNotNull(vector32, "Parameter \"end\" was null.");
        Vector3 normalized = vector3.normalized();
        Vector3 normalized2 = vector32.normalized();
        float dot = Vector3.dot(normalized, normalized2);
        if (dot < -0.999f) {
            Vector3 cross = Vector3.cross(Vector3.back(), normalized);
            if (cross.lengthSquared() < 0.01f) {
                cross = Vector3.cross(Vector3.right(), normalized);
            }
            return axisAngle(cross.normalized(), 180.0f);
        }
        Vector3 cross2 = Vector3.cross(normalized, normalized2);
        double d = (double) dot;
        Double.isNaN(d);
        float sqrt = (float) Math.sqrt((d + 1.0d) * 2.0d);
        float f = 1.0f / sqrt;
        return new Quaternion(cross2.f3277x * f, cross2.f3278y * f, cross2.f3279z * f, sqrt * 0.5f);
    }

    public static Quaternion slerp(Quaternion quaternion, Quaternion quaternion2, float f) {
        Preconditions.checkNotNull(quaternion, "Parameter \"start\" was null.");
        Preconditions.checkNotNull(quaternion2, "Parameter \"end\" was null.");
        Quaternion normalized = quaternion.normalized();
        Quaternion normalized2 = quaternion2.normalized();
        double dot = (double) dot(normalized, normalized2);
        if (dot < 0.0d) {
            normalized2 = normalized2.negated();
            Double.isNaN(dot);
            dot = -dot;
        }
        if (dot > 0.9994999766349792d) {
            return lerp(normalized, normalized2, f);
        }
        double max = Math.max(-1.0d, Math.min(1.0d, dot));
        double acos = Math.acos(max);
        double d = (double) f;
        Double.isNaN(d);
        double d2 = d * acos;
        return add(normalized.scaled((float) (Math.cos(d2) - ((max * Math.sin(d2)) / Math.sin(acos)))), normalized2.scaled((float) (Math.sin(d2) / Math.sin(acos)))).normalized();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Quaternion)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return equals(this, (Quaternion) obj);
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.f3273w) + 31) * 31) + Float.floatToIntBits(this.f3274x)) * 31) + Float.floatToIntBits(this.f3275y)) * 31) + Float.floatToIntBits(this.f3276z);
    }

    public Quaternion inverted() {
        return new Quaternion(-this.f3274x, -this.f3275y, -this.f3276z, this.f3273w);
    }

    /* access modifiers changed from: package-private */
    public Quaternion negated() {
        return new Quaternion(-this.f3274x, -this.f3275y, -this.f3276z, -this.f3273w);
    }

    public boolean normalize() {
        float dot = dot(this, this);
        if (MathHelper.almostEqualRelativeAndAbs(dot, 0.0f)) {
            setIdentity();
            return false;
        } else if (dot == 1.0f) {
            return true;
        } else {
            float sqrt = (float) (1.0d / Math.sqrt((double) dot));
            this.f3274x *= sqrt;
            this.f3275y *= sqrt;
            this.f3276z *= sqrt;
            this.f3273w *= sqrt;
            return true;
        }
    }

    public Quaternion normalized() {
        Quaternion quaternion = new Quaternion(this);
        quaternion.normalize();
        return quaternion;
    }

    /* access modifiers changed from: package-private */
    public Quaternion scaled(float f) {
        Quaternion quaternion = new Quaternion();
        quaternion.f3274x = this.f3274x * f;
        quaternion.f3275y = this.f3275y * f;
        quaternion.f3276z = this.f3276z * f;
        quaternion.f3273w = this.f3273w * f;
        return quaternion;
    }

    public void set(float f, float f2, float f3, float f4) {
        this.f3274x = f;
        this.f3275y = f2;
        this.f3276z = f3;
        this.f3273w = f4;
        normalize();
    }

    public void set(Quaternion quaternion) {
        Preconditions.checkNotNull(quaternion, "Parameter \"q\" was null.");
        this.f3274x = quaternion.f3274x;
        this.f3275y = quaternion.f3275y;
        this.f3276z = quaternion.f3276z;
        this.f3273w = quaternion.f3273w;
        normalize();
    }

    public void set(Vector3 vector3, float f) {
        Preconditions.checkNotNull(vector3, "Parameter \"axis\" was null.");
        set(axisAngle(vector3, f));
    }

    public void setIdentity() {
        this.f3274x = 0.0f;
        this.f3275y = 0.0f;
        this.f3276z = 0.0f;
        this.f3273w = 1.0f;
    }

    public String toString() {
        float f = this.f3274x;
        float f2 = this.f3275y;
        float f3 = this.f3276z;
        float f4 = this.f3273w;
        StringBuilder sb = new StringBuilder(76);
        sb.append("[x=");
        sb.append(f);
        sb.append(", y=");
        sb.append(f2);
        sb.append(", z=");
        sb.append(f3);
        sb.append(", w=");
        sb.append(f4);
        sb.append("]");
        return sb.toString();
    }
}
