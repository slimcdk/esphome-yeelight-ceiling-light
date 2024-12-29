package com.google.android.filament;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;

public class Camera {
    private long mNativeObject;

    public enum Fov {
        VERTICAL,
        HORIZONTAL
    }

    public enum Projection {
        PERSPECTIVE,
        ORTHO
    }

    Camera(long j) {
        this.mNativeObject = j;
    }

    @Size(min = 3)
    @NonNull
    private static float[] assertFloat3(@Nullable float[] fArr) {
        if (fArr == null) {
            return new float[3];
        }
        if (fArr.length >= 3) {
            return fArr;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 3");
    }

    @Size(min = 16)
    @NonNull
    private static double[] assertMat4d(@Nullable double[] dArr) {
        if (dArr == null) {
            return new double[16];
        }
        if (dArr.length >= 16) {
            return dArr;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 16");
    }

    private static void assertMat4dIn(@Size(min = 16) @NonNull double[] dArr) {
        if (dArr.length < 16) {
            throw new ArrayIndexOutOfBoundsException("Array length must be at least 16");
        }
    }

    @Size(min = 16)
    @NonNull
    private static float[] assertMat4f(@Nullable float[] fArr) {
        if (fArr == null) {
            return new float[16];
        }
        if (fArr.length >= 16) {
            return fArr;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 16");
    }

    private static void assertMat4fIn(@Size(min = 16) @NonNull float[] fArr) {
        if (fArr.length < 16) {
            throw new ArrayIndexOutOfBoundsException("Array length must be at least 16");
        }
    }

    private static native float nGetAperture(long j);

    private static native float nGetCullingFar(long j);

    private static native void nGetForwardVector(long j, float[] fArr);

    private static native void nGetLeftVector(long j, float[] fArr);

    private static native void nGetModelMatrix(long j, float[] fArr);

    private static native float nGetNear(long j);

    private static native void nGetPosition(long j, float[] fArr);

    private static native void nGetProjectionMatrix(long j, double[] dArr);

    private static native float nGetSensitivity(long j);

    private static native float nGetShutterSpeed(long j);

    private static native void nGetUpVector(long j, float[] fArr);

    private static native void nGetViewMatrix(long j, float[] fArr);

    private static native void nLookAt(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9);

    private static native void nSetCustomProjection(long j, double[] dArr, double d, double d2);

    private static native void nSetExposure(long j, float f, float f2, float f3);

    private static native void nSetLensProjection(long j, double d, double d2, double d3);

    private static native void nSetModelMatrix(long j, float[] fArr);

    private static native void nSetProjection(long j, int i, double d, double d2, double d3, double d4, double d5, double d6);

    private static native void nSetProjectionFov(long j, double d, double d2, double d3, double d4, int i);

    /* access modifiers changed from: package-private */
    public void clearNativeObject() {
        this.mNativeObject = 0;
    }

    public float getAperture() {
        return nGetAperture(getNativeObject());
    }

    public float getCullingFar() {
        return nGetCullingFar(getNativeObject());
    }

    @Size(min = 3)
    @NonNull
    public float[] getForwardVector(@Size(min = 3) @Nullable float[] fArr) {
        float[] assertFloat3 = assertFloat3(fArr);
        nGetForwardVector(getNativeObject(), assertFloat3);
        return assertFloat3;
    }

    @Size(min = 3)
    @NonNull
    public float[] getLeftVector(@Size(min = 3) @Nullable float[] fArr) {
        float[] assertFloat3 = assertFloat3(fArr);
        nGetLeftVector(getNativeObject(), assertFloat3);
        return assertFloat3;
    }

    @Size(min = 16)
    @NonNull
    public float[] getModelMatrix(@Size(min = 16) @Nullable float[] fArr) {
        float[] assertMat4f = assertMat4f(fArr);
        nGetModelMatrix(getNativeObject(), assertMat4f);
        return assertMat4f;
    }

    /* access modifiers changed from: package-private */
    public long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Calling method on destroyed Camera");
    }

    public float getNear() {
        return nGetNear(getNativeObject());
    }

    @Size(min = 3)
    @NonNull
    public float[] getPosition(@Size(min = 3) @Nullable float[] fArr) {
        float[] assertFloat3 = assertFloat3(fArr);
        nGetPosition(getNativeObject(), assertFloat3);
        return assertFloat3;
    }

    @Size(min = 16)
    @NonNull
    public double[] getProjectionMatrix(@Size(min = 16) @Nullable double[] dArr) {
        double[] assertMat4d = assertMat4d(dArr);
        nGetProjectionMatrix(getNativeObject(), assertMat4d);
        return assertMat4d;
    }

    public float getSensitivity() {
        return nGetSensitivity(getNativeObject());
    }

    public float getShutterSpeed() {
        return nGetShutterSpeed(getNativeObject());
    }

    @Size(min = 3)
    @NonNull
    public float[] getUpVector(@Size(min = 3) @Nullable float[] fArr) {
        float[] assertFloat3 = assertFloat3(fArr);
        nGetUpVector(getNativeObject(), assertFloat3);
        return assertFloat3;
    }

    @Size(min = 16)
    @NonNull
    public float[] getViewMatrix(@Size(min = 16) @Nullable float[] fArr) {
        float[] assertMat4f = assertMat4f(fArr);
        nGetViewMatrix(getNativeObject(), assertMat4f);
        return assertMat4f;
    }

    public void lookAt(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        nLookAt(getNativeObject(), d, d2, d3, d4, d5, d6, d7, d8, d9);
    }

    public void setCustomProjection(@Size(min = 16) @NonNull double[] dArr, double d, double d2) {
        assertMat4dIn(dArr);
        nSetCustomProjection(getNativeObject(), dArr, d, d2);
    }

    public void setExposure(float f, float f2, float f3) {
        nSetExposure(getNativeObject(), f, f2, f3);
    }

    public void setLensProjection(double d, double d2, double d3) {
        nSetLensProjection(getNativeObject(), d, d2, d3);
    }

    public void setModelMatrix(@Size(min = 16) @NonNull float[] fArr) {
        assertMat4fIn(fArr);
        nSetModelMatrix(getNativeObject(), fArr);
    }

    public void setProjection(double d, double d2, double d3, double d4, @NonNull Fov fov) {
        nSetProjectionFov(getNativeObject(), d, d2, d3, d4, fov.ordinal());
    }

    public void setProjection(@NonNull Projection projection, double d, double d2, double d3, double d4, double d5, double d6) {
        nSetProjection(getNativeObject(), projection.ordinal(), d, d2, d3, d4, d5, d6);
    }
}
