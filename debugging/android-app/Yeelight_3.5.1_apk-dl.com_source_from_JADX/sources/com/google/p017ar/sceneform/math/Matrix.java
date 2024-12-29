package com.google.p017ar.sceneform.math;

import com.google.p017ar.sceneform.utilities.Preconditions;

/* renamed from: com.google.ar.sceneform.math.Matrix */
public class Matrix {
    public static final float[] IDENTITY_DATA = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private static final String TAG = "Matrix";
    public float[] data = new float[16];

    public Matrix() {
        set(IDENTITY_DATA);
    }

    public Matrix(float[] fArr) {
        set(fArr);
    }

    public static boolean equals(Matrix matrix, Matrix matrix2) {
        Preconditions.checkNotNull(matrix, "Parameter \"lhs\" was null.");
        Preconditions.checkNotNull(matrix2, "Parameter \"rhs\" was null.");
        boolean z = true;
        for (int i = 0; i < 16; i++) {
            z &= MathHelper.almostEqualRelativeAndAbs(matrix.data[i], matrix2.data[i]);
        }
        return z;
    }

    public static boolean invert(Matrix matrix, Matrix matrix2) {
        Matrix matrix3 = matrix;
        Matrix matrix4 = matrix2;
        Preconditions.checkNotNull(matrix3, "Parameter \"matrix\" was null.");
        Preconditions.checkNotNull(matrix4, "Parameter \"dest\" was null.");
        float[] fArr = matrix3.data;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float[] fArr2 = matrix4.data;
        fArr2[0] = ((((((f6 * f11) * f16) - ((f6 * f12) * f15)) - ((f10 * f7) * f16)) + ((f10 * f8) * f15)) + ((f14 * f7) * f12)) - ((f14 * f8) * f11);
        float f17 = -f5;
        float f18 = f5 * f12;
        float f19 = f9 * f7;
        float f20 = f9 * f8;
        float f21 = f13 * f7;
        float f22 = f13 * f8;
        fArr2[4] = ((((((f17 * f11) * f16) + (f18 * f15)) + (f19 * f16)) - (f20 * f15)) - (f21 * f12)) + (f22 * f11);
        float f23 = ((f5 * f10) * f16) - (f18 * f14);
        float f24 = f9 * f6;
        float f25 = (f23 - (f24 * f16)) + (f20 * f14);
        float f26 = f13 * f6;
        fArr2[8] = (f25 + (f26 * f12)) - (f22 * f10);
        fArr2[12] = ((((((f17 * f10) * f15) + ((f5 * f11) * f14)) + (f24 * f15)) - (f19 * f14)) - (f26 * f11)) + (f21 * f10);
        float f27 = -f2;
        float f28 = f10 * f3;
        float f29 = f10 * f4;
        float f30 = f14 * f3;
        float f31 = f14 * f4;
        fArr2[1] = ((((((f27 * f11) * f16) + ((f2 * f12) * f15)) + (f28 * f16)) - (f29 * f15)) - (f30 * f12)) + (f31 * f11);
        float f32 = f * f11;
        float f33 = f * f12;
        float f34 = f9 * f3;
        float f35 = f9 * f4;
        float f36 = f13 * f3;
        float f37 = f13 * f4;
        fArr2[5] = (((((f32 * f16) - (f33 * f15)) - (f34 * f16)) + (f35 * f15)) + (f36 * f12)) - (f37 * f11);
        float f38 = -f;
        float f39 = f9 * f2;
        float f40 = f13 * f2;
        fArr2[9] = ((((((f38 * f10) * f16) + (f33 * f14)) + (f39 * f16)) - (f35 * f14)) - (f40 * f12)) + (f37 * f10);
        fArr2[13] = ((((((f * f10) * f15) - (f32 * f14)) - (f39 * f15)) + (f34 * f14)) + (f40 * f11)) - (f36 * f10);
        float f41 = f2 * f8;
        float f42 = f6 * f3;
        float f43 = f6 * f4;
        fArr2[2] = ((((((f2 * f7) * f16) - (f41 * f15)) - (f42 * f16)) + (f43 * f15)) + (f30 * f8)) - (f31 * f7);
        float f44 = f * f8;
        float f45 = f5 * f3;
        float f46 = f5 * f4;
        fArr2[6] = ((((((f38 * f7) * f16) + (f44 * f15)) + (f45 * f16)) - (f46 * f15)) - (f36 * f8)) + (f37 * f7);
        float f47 = f * f6;
        float f48 = f5 * f2;
        fArr2[10] = (((((f47 * f16) - (f44 * f14)) - (f16 * f48)) + (f46 * f14)) + (f40 * f8)) - (f37 * f6);
        float f49 = f38 * f6;
        float f50 = f * f7;
        fArr2[14] = (((((f49 * f15) + (f50 * f14)) + (f15 * f48)) - (f14 * f45)) - (f40 * f7)) + (f36 * f6);
        fArr2[3] = ((((((f27 * f7) * f12) + (f41 * f11)) + (f42 * f12)) - (f43 * f11)) - (f28 * f8)) + (f29 * f7);
        fArr2[7] = (((((f50 * f12) - (f44 * f11)) - (f45 * f12)) + (f46 * f11)) + (f34 * f8)) - (f35 * f7);
        fArr2[11] = (((((f49 * f12) + (f44 * f10)) + (f12 * f48)) - (f46 * f10)) - (f8 * f39)) + (f35 * f6);
        fArr2[15] = (((((f47 * f11) - (f50 * f10)) - (f48 * f11)) + (f45 * f10)) + (f39 * f7)) - (f34 * f6);
        float f51 = (f * fArr2[0]) + (f2 * fArr2[4]) + (f3 * fArr2[8]) + (f4 * fArr2[12]);
        if (f51 == 0.0f) {
            return false;
        }
        float f52 = 1.0f / f51;
        for (int i = 0; i < 16; i++) {
            float[] fArr3 = matrix4.data;
            fArr3[i] = fArr3[i] * f52;
        }
        return true;
    }

    public static void multiply(Matrix matrix, Matrix matrix2, Matrix matrix3) {
        Matrix matrix4 = matrix;
        Matrix matrix5 = matrix2;
        Preconditions.checkNotNull(matrix4, "Parameter \"lhs\" was null.");
        Preconditions.checkNotNull(matrix5, "Parameter \"rhs\" was null.");
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        while (true) {
            float f17 = f13;
            if (i < 4) {
                float[] fArr = matrix4.data;
                int i2 = i << 2;
                float f18 = fArr[i2 + 0];
                float f19 = fArr[i2 + 1];
                float f20 = fArr[i2 + 2];
                float f21 = fArr[i2 + 3];
                float[] fArr2 = matrix5.data;
                float f22 = fArr2[i + 0];
                float f23 = fArr2[i + 4];
                float f24 = fArr2[i + 8];
                float f25 = fArr2[i + 12];
                f += f18 * f22;
                f2 += f19 * f22;
                f3 += f20 * f22;
                f4 += f22 * f21;
                f5 += f18 * f23;
                f6 += f19 * f23;
                f7 += f20 * f23;
                f8 += f23 * f21;
                f9 += f18 * f24;
                f10 += f19 * f24;
                f11 += f20 * f24;
                f12 += f24 * f21;
                f14 += f19 * f25;
                f15 += f20 * f25;
                f16 += f21 * f25;
                i++;
                matrix4 = matrix;
                f13 = f17 + (f18 * f25);
            } else {
                float[] fArr3 = matrix3.data;
                fArr3[0] = f;
                fArr3[1] = f2;
                fArr3[2] = f3;
                fArr3[3] = f4;
                fArr3[4] = f5;
                fArr3[5] = f6;
                fArr3[6] = f7;
                fArr3[7] = f8;
                fArr3[8] = f9;
                fArr3[9] = f10;
                fArr3[10] = f11;
                fArr3[11] = f12;
                fArr3[12] = f17;
                fArr3[13] = f14;
                fArr3[14] = f15;
                fArr3[15] = f16;
                return;
            }
        }
    }

    public void decomposeRotation(Vector3 vector3, Matrix matrix) {
        if (vector3.f3277x != 0.0f) {
            for (int i = 0; i < 3; i++) {
                matrix.data[i] = this.data[i] / vector3.f3277x;
            }
        }
        matrix.data[3] = 0.0f;
        if (vector3.f3278y != 0.0f) {
            for (int i2 = 4; i2 < 7; i2++) {
                matrix.data[i2] = this.data[i2] / vector3.f3278y;
            }
        }
        matrix.data[7] = 0.0f;
        if (vector3.f3279z != 0.0f) {
            for (int i3 = 8; i3 < 11; i3++) {
                matrix.data[i3] = this.data[i3] / vector3.f3279z;
            }
        }
        float[] fArr = matrix.data;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public void decomposeRotation(Vector3 vector3, Quaternion quaternion) {
        float[] fArr = this.data;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        decomposeRotation(vector3, this);
        extractQuaternion(quaternion);
        float[] fArr2 = this.data;
        fArr2[0] = f;
        fArr2[1] = f2;
        fArr2[2] = f3;
        fArr2[3] = f4;
        fArr2[4] = f5;
        fArr2[5] = f6;
        fArr2[6] = f7;
        fArr2[7] = f8;
        fArr2[8] = f9;
        fArr2[9] = f10;
        fArr2[10] = f11;
        fArr2[11] = f12;
        fArr2[12] = f13;
        fArr2[13] = f14;
        fArr2[14] = f15;
        fArr2[15] = f16;
    }

    public void decomposeScale(Vector3 vector3) {
        float[] fArr = this.data;
        Vector3 vector32 = new Vector3(fArr[0], fArr[1], fArr[2]);
        vector3.f3277x = vector32.length();
        float[] fArr2 = this.data;
        vector32.set(fArr2[4], fArr2[5], fArr2[6]);
        vector3.f3278y = vector32.length();
        float[] fArr3 = this.data;
        vector32.set(fArr3[8], fArr3[9], fArr3[10]);
        vector3.f3279z = vector32.length();
    }

    public void decomposeTranslation(Vector3 vector3) {
        float[] fArr = this.data;
        vector3.f3277x = fArr[12];
        vector3.f3278y = fArr[13];
        vector3.f3279z = fArr[14];
    }

    public void extractQuaternion(Quaternion quaternion) {
        float f;
        float f2;
        float f3;
        float f4;
        Quaternion quaternion2 = quaternion;
        float[] fArr = this.data;
        float f5 = fArr[0] + fArr[5] + fArr[10];
        if (f5 > 0.0f) {
            double d = (double) f5;
            Double.isNaN(d);
            f3 = ((float) Math.sqrt(d + 1.0d)) * 2.0f;
            quaternion2.f3273w = 0.25f * f3;
            float[] fArr2 = this.data;
            quaternion2.f3274x = (fArr2[6] - fArr2[9]) / f3;
            quaternion2.f3275y = (fArr2[8] - fArr2[2]) / f3;
            f4 = fArr2[1] - fArr2[4];
        } else {
            if (fArr[0] > fArr[5] && fArr[0] > fArr[10]) {
                f3 = ((float) Math.sqrt((double) (((fArr[0] + 1.0f) - fArr[5]) - fArr[10]))) * 2.0f;
                float[] fArr3 = this.data;
                quaternion2.f3273w = (fArr3[6] - fArr3[9]) / f3;
                quaternion2.f3274x = 0.25f * f3;
                quaternion2.f3275y = (fArr3[4] + fArr3[1]) / f3;
                f = fArr3[8];
                f2 = fArr3[2];
            } else if (fArr[5] > fArr[10]) {
                f3 = ((float) Math.sqrt((double) (((fArr[5] + 1.0f) - fArr[0]) - fArr[10]))) * 2.0f;
                float[] fArr4 = this.data;
                quaternion2.f3273w = (fArr4[8] - fArr4[2]) / f3;
                quaternion2.f3274x = (fArr4[4] + fArr4[1]) / f3;
                quaternion2.f3275y = 0.25f * f3;
                f = fArr4[9];
                f2 = fArr4[6];
            } else {
                float sqrt = ((float) Math.sqrt((double) (((fArr[10] + 1.0f) - fArr[0]) - fArr[5]))) * 2.0f;
                float[] fArr5 = this.data;
                quaternion2.f3273w = (fArr5[1] - fArr5[4]) / sqrt;
                quaternion2.f3274x = (fArr5[8] + fArr5[2]) / sqrt;
                quaternion2.f3275y = (fArr5[9] + fArr5[6]) / sqrt;
                quaternion2.f3276z = sqrt * 0.25f;
                quaternion.normalize();
            }
            f4 = f + f2;
        }
        quaternion2.f3276z = f4 / f3;
        quaternion.normalize();
    }

    public void makeRotation(Quaternion quaternion) {
        Preconditions.checkNotNull(quaternion, "Parameter \"rotation\" was null.");
        set(IDENTITY_DATA);
        quaternion.normalize();
        float f = quaternion.f3274x;
        float f2 = f * f;
        float f3 = quaternion.f3275y;
        float f4 = f * f3;
        float f5 = quaternion.f3276z;
        float f6 = f * f5;
        float f7 = quaternion.f3273w;
        float f8 = f * f7;
        float f9 = f3 * f3;
        float f10 = f3 * f5;
        float f11 = f3 * f7;
        float f12 = f5 * f5;
        float f13 = f5 * f7;
        float[] fArr = this.data;
        fArr[0] = 1.0f - ((f9 + f12) * 2.0f);
        fArr[4] = (f4 - f13) * 2.0f;
        fArr[8] = (f6 + f11) * 2.0f;
        fArr[1] = (f4 + f13) * 2.0f;
        fArr[5] = 1.0f - ((f12 + f2) * 2.0f);
        fArr[9] = (f10 - f8) * 2.0f;
        fArr[2] = (f6 - f11) * 2.0f;
        fArr[6] = (f10 + f8) * 2.0f;
        fArr[10] = 1.0f - ((f2 + f9) * 2.0f);
    }

    public void makeScale(float f) {
        Preconditions.checkNotNull(Float.valueOf(f), "Parameter \"scale\" was null.");
        set(IDENTITY_DATA);
        float[] fArr = this.data;
        fArr[0] = f;
        fArr[5] = f;
        fArr[10] = f;
    }

    public void makeScale(Vector3 vector3) {
        Preconditions.checkNotNull(vector3, "Parameter \"scale\" was null.");
        set(IDENTITY_DATA);
        float[] fArr = this.data;
        fArr[0] = vector3.f3277x;
        fArr[5] = vector3.f3278y;
        fArr[10] = vector3.f3279z;
    }

    public void makeTranslation(Vector3 vector3) {
        Preconditions.checkNotNull(vector3, "Parameter \"translation\" was null.");
        set(IDENTITY_DATA);
        setTranslation(vector3);
    }

    public void makeTrs(Vector3 vector3, Quaternion quaternion, Vector3 vector32) {
        Vector3 vector33 = vector3;
        Quaternion quaternion2 = quaternion;
        Vector3 vector34 = vector32;
        float f = quaternion2.f3274x;
        float f2 = 1.0f - ((f * 2.0f) * f);
        float f3 = quaternion2.f3275y;
        float f4 = f3 * f3;
        float f5 = quaternion2.f3276z;
        float f6 = f5 * 2.0f * f5;
        float f7 = f * 2.0f * f5;
        float f8 = quaternion2.f3273w;
        float f9 = f3 * 2.0f * f8;
        float f10 = f * 2.0f * f3;
        float f11 = f5 * 2.0f * f8;
        float f12 = f * 2.0f * f8;
        float f13 = f3 * 2.0f * f5;
        float[] fArr = this.data;
        float f14 = f4 * 2.0f;
        float f15 = vector34.f3277x;
        fArr[0] = ((1.0f - f14) - f6) * f15;
        float f16 = vector34.f3278y;
        fArr[4] = (f10 - f11) * f16;
        float f17 = vector34.f3279z;
        fArr[8] = (f7 + f9) * f17;
        fArr[1] = (f10 + f11) * f15;
        fArr[5] = (f2 - f6) * f16;
        fArr[9] = (f13 - f12) * f17;
        fArr[2] = (f7 - f9) * f15;
        fArr[6] = (f13 + f12) * f16;
        fArr[10] = (f2 - f14) * f17;
        fArr[12] = vector33.f3277x;
        fArr[13] = vector33.f3278y;
        fArr[14] = vector33.f3279z;
        fArr[15] = 1.0f;
    }

    public void set(Matrix matrix) {
        Preconditions.checkNotNull(matrix, "Parameter \"m\" was null.");
        set(matrix.data);
    }

    public void set(float[] fArr) {
        if (fArr != null && fArr.length == 16) {
            for (int i = 0; i < fArr.length; i++) {
                this.data[i] = fArr[i];
            }
        }
    }

    public void setTranslation(Vector3 vector3) {
        float[] fArr = this.data;
        fArr[12] = vector3.f3277x;
        fArr[13] = vector3.f3278y;
        fArr[14] = vector3.f3279z;
    }

    public Vector3 transformDirection(Vector3 vector3) {
        Preconditions.checkNotNull(vector3, "Parameter \"vector\" was null.");
        Vector3 vector32 = new Vector3();
        float f = vector3.f3277x;
        float f2 = vector3.f3278y;
        float f3 = vector3.f3279z;
        float[] fArr = this.data;
        float f4 = fArr[0] * f;
        vector32.f3277x = f4;
        float f5 = f4 + (fArr[4] * f2);
        vector32.f3277x = f5;
        vector32.f3277x = f5 + (fArr[8] * f3);
        float f6 = fArr[1] * f;
        vector32.f3278y = f6;
        float f7 = f6 + (fArr[5] * f2);
        vector32.f3278y = f7;
        vector32.f3278y = f7 + (fArr[9] * f3);
        float f8 = fArr[2] * f;
        vector32.f3279z = f8;
        float f9 = f8 + (fArr[6] * f2);
        vector32.f3279z = f9;
        vector32.f3279z = f9 + (fArr[10] * f3);
        return vector32;
    }

    public Vector3 transformPoint(Vector3 vector3) {
        Preconditions.checkNotNull(vector3, "Parameter \"vector\" was null.");
        Vector3 vector32 = new Vector3();
        float f = vector3.f3277x;
        float f2 = vector3.f3278y;
        float f3 = vector3.f3279z;
        float[] fArr = this.data;
        float f4 = fArr[0] * f;
        vector32.f3277x = f4;
        float f5 = f4 + (fArr[4] * f2);
        vector32.f3277x = f5;
        float f6 = f5 + (fArr[8] * f3);
        vector32.f3277x = f6;
        vector32.f3277x = f6 + fArr[12];
        float f7 = fArr[1] * f;
        vector32.f3278y = f7;
        float f8 = f7 + (fArr[5] * f2);
        vector32.f3278y = f8;
        float f9 = f8 + (fArr[9] * f3);
        vector32.f3278y = f9;
        vector32.f3278y = f9 + fArr[13];
        float f10 = fArr[2] * f;
        vector32.f3279z = f10;
        float f11 = f10 + (fArr[6] * f2);
        vector32.f3279z = f11;
        float f12 = f11 + (fArr[10] * f3);
        vector32.f3279z = f12;
        vector32.f3279z = f12 + fArr[14];
        return vector32;
    }
}
