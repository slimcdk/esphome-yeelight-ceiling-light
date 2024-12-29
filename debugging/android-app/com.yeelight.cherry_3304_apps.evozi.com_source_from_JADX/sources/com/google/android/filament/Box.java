package com.google.android.filament;

import androidx.annotation.NonNull;
import androidx.annotation.Size;

public class Box {
    private final float[] mCenter;
    private final float[] mHalfExtent;

    public Box() {
        this.mCenter = new float[3];
        this.mHalfExtent = new float[3];
    }

    public Box(float f, float f2, float f3, float f4, float f5, float f6) {
        float[] fArr = new float[3];
        this.mCenter = fArr;
        float[] fArr2 = new float[3];
        this.mHalfExtent = fArr2;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr2[0] = f4;
        fArr2[1] = f5;
        fArr2[2] = f6;
    }

    public Box(@Size(min = 3) @NonNull float[] fArr, @Size(min = 3) @NonNull float[] fArr2) {
        float[] fArr3 = new float[3];
        this.mCenter = fArr3;
        float[] fArr4 = new float[3];
        this.mHalfExtent = fArr4;
        fArr3[0] = fArr[0];
        fArr3[1] = fArr[1];
        fArr3[2] = fArr[2];
        fArr4[0] = fArr2[0];
        fArr4[1] = fArr2[1];
        fArr4[2] = fArr2[2];
    }

    @Size(min = 3)
    @NonNull
    public float[] getCenter() {
        return this.mCenter;
    }

    @Size(min = 3)
    @NonNull
    public float[] getHalfExtent() {
        return this.mHalfExtent;
    }

    public void setCenter(float f, float f2, float f3) {
        float[] fArr = this.mCenter;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
    }

    public void setHalfExtent(float f, float f2, float f3) {
        float[] fArr = this.mHalfExtent;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
    }
}
