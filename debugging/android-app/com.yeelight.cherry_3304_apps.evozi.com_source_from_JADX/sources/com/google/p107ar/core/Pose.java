package com.google.p107ar.core;

import com.google.p107ar.core.annotations.UsedByNative;
import java.util.Locale;

@UsedByNative("session_jni_wrapper.cc")
/* renamed from: com.google.ar.core.Pose */
public class Pose {
    public static final Pose IDENTITY = new Pose(new float[]{0.0f, 0.0f, 0.0f}, Quaternion.f5039a);
    @UsedByNative("session_jni_wrapper.cc")
    private final Quaternion quaternion;
    @UsedByNative("session_jni_wrapper.cc")
    private final float[] translation;

    private Pose(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.quaternion = new Quaternion(f4, f5, f6, f7);
        this.translation = new float[]{f, f2, f3};
    }

    @UsedByNative("session_jni_wrapper.cc")
    private Pose(float[] fArr, Quaternion quaternion2) {
        this.translation = fArr;
        this.quaternion = quaternion2;
    }

    public Pose(float[] fArr, float[] fArr2) {
        this(fArr[0], fArr[1], fArr[2], fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
    }

    public static Pose makeInterpolated(Pose pose, Pose pose2, float f) {
        if (f == 0.0f) {
            return pose;
        }
        if (f == 1.0f) {
            return pose2;
        }
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = (pose.translation[i] * (1.0f - f)) + (pose2.translation[i] * f);
        }
        return new Pose(fArr, Quaternion.m8145c(pose.quaternion, pose2.quaternion, f));
    }

    public static Pose makeRotation(float f, float f2, float f3, float f4) {
        return new Pose(IDENTITY.translation, new Quaternion(f, f2, f3, f4));
    }

    public static Pose makeRotation(float[] fArr) {
        return makeRotation(fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    public static Pose makeTranslation(float f, float f2, float f3) {
        return new Pose(new float[]{f, f2, f3}, IDENTITY.quaternion);
    }

    public static Pose makeTranslation(float[] fArr) {
        return makeTranslation(fArr[0], fArr[1], fArr[2]);
    }

    public Pose compose(Pose pose) {
        float[] fArr = new float[3];
        Quaternion.m8147e(this.quaternion, pose.translation, 0, fArr, 0);
        float f = fArr[0];
        float[] fArr2 = this.translation;
        fArr[0] = f + fArr2[0];
        fArr[1] = fArr[1] + fArr2[1];
        fArr[2] = fArr[2] + fArr2[2];
        return new Pose(fArr, this.quaternion.mo15128b(pose.quaternion));
    }

    public Pose extractRotation() {
        return new Pose(IDENTITY.translation, this.quaternion);
    }

    public Pose extractTranslation() {
        return new Pose(this.translation, IDENTITY.quaternion);
    }

    /* access modifiers changed from: package-private */
    public Quaternion getQuaternion() {
        return this.quaternion;
    }

    public void getRotationQuaternion(float[] fArr, int i) {
        this.quaternion.mo15129f(fArr, i);
    }

    public float[] getRotationQuaternion() {
        float[] fArr = new float[4];
        getRotationQuaternion(fArr, 0);
        return fArr;
    }

    public void getTransformedAxis(int i, float f, float[] fArr, int i2) {
        Quaternion quaternion2 = this.quaternion;
        float[] fArr2 = {0.0f, 0.0f, 0.0f};
        fArr2[i] = f;
        Quaternion.m8147e(quaternion2, fArr2, 0, fArr, i2);
    }

    public float[] getTransformedAxis(int i, float f) {
        float[] fArr = new float[3];
        getTransformedAxis(i, f, fArr, 0);
        return fArr;
    }

    public void getTranslation(float[] fArr, int i) {
        System.arraycopy(this.translation, 0, fArr, i, 3);
    }

    public float[] getTranslation() {
        float[] fArr = new float[3];
        getTranslation(fArr, 0);
        return fArr;
    }

    public float[] getXAxis() {
        return getTransformedAxis(0, 1.0f);
    }

    public float[] getYAxis() {
        return getTransformedAxis(1, 1.0f);
    }

    public float[] getZAxis() {
        return getTransformedAxis(2, 1.0f);
    }

    public Pose inverse() {
        float[] fArr = new float[3];
        Quaternion k = this.quaternion.mo15134k();
        Quaternion.m8147e(k, this.translation, 0, fArr, 0);
        fArr[0] = -fArr[0];
        fArr[1] = -fArr[1];
        fArr[2] = -fArr[2];
        return new Pose(fArr, k);
    }

    /* renamed from: qw */
    public float mo15114qw() {
        return this.quaternion.mo15133j();
    }

    /* renamed from: qx */
    public float mo15115qx() {
        return this.quaternion.mo15127a();
    }

    /* renamed from: qy */
    public float mo15116qy() {
        return this.quaternion.mo15131h();
    }

    /* renamed from: qz */
    public float mo15117qz() {
        return this.quaternion.mo15132i();
    }

    public void rotateVector(float[] fArr, int i, float[] fArr2, int i2) {
        Quaternion.m8147e(this.quaternion, fArr, i, fArr2, i2);
    }

    public float[] rotateVector(float[] fArr) {
        float[] fArr2 = new float[3];
        rotateVector(fArr, 0, fArr2, 0);
        return fArr2;
    }

    public void toMatrix(float[] fArr, int i) {
        this.quaternion.mo15130g(fArr, i, 4);
        float[] fArr2 = this.translation;
        fArr[i + 12] = fArr2[0];
        fArr[i + 1 + 12] = fArr2[1];
        fArr[i + 2 + 12] = fArr2[2];
        fArr[i + 3] = 0.0f;
        fArr[i + 7] = 0.0f;
        fArr[i + 11] = 0.0f;
        fArr[i + 15] = 1.0f;
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "t:[x:%.3f, y:%.3f, z:%.3f], q:[x:%.2f, y:%.2f, z:%.2f, w:%.2f]", new Object[]{Float.valueOf(this.translation[0]), Float.valueOf(this.translation[1]), Float.valueOf(this.translation[2]), Float.valueOf(this.quaternion.mo15127a()), Float.valueOf(this.quaternion.mo15131h()), Float.valueOf(this.quaternion.mo15132i()), Float.valueOf(this.quaternion.mo15133j())});
    }

    public void transformPoint(float[] fArr, int i, float[] fArr2, int i2) {
        rotateVector(fArr, i, fArr2, i2);
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = i3 + i2;
            fArr2[i4] = fArr2[i4] + this.translation[i3];
        }
    }

    public float[] transformPoint(float[] fArr) {
        float[] fArr2 = new float[3];
        transformPoint(fArr, 0, fArr2, 0);
        return fArr2;
    }

    /* renamed from: tx */
    public float mo15124tx() {
        return this.translation[0];
    }

    /* renamed from: ty */
    public float mo15125ty() {
        return this.translation[1];
    }

    /* renamed from: tz */
    public float mo15126tz() {
        return this.translation[2];
    }
}
