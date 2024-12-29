package androidx.core.content.res;

import androidx.annotation.NonNull;

final class ViewingConditions {
    static final ViewingConditions DEFAULT;
    private final float mAw;

    /* renamed from: mC */
    private final float f89mC;
    private final float mFl;
    private final float mFlRoot;

    /* renamed from: mN */
    private final float f90mN;
    private final float mNbb;
    private final float mNc;
    private final float mNcb;
    private final float[] mRgbD;

    /* renamed from: mZ */
    private final float f91mZ;

    static {
        float[] fArr = CamUtils.WHITE_POINT_D65;
        double yFromLStar = (double) CamUtils.yFromLStar(50.0f);
        Double.isNaN(yFromLStar);
        DEFAULT = make(fArr, (float) ((yFromLStar * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    }

    private ViewingConditions(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f90mN = f;
        this.mAw = f2;
        this.mNbb = f3;
        this.mNcb = f4;
        this.f89mC = f5;
        this.mNc = f6;
        this.mRgbD = fArr;
        this.mFl = f7;
        this.mFlRoot = f8;
        this.f91mZ = f9;
    }

    @NonNull
    static ViewingConditions make(@NonNull float[] fArr, float f, float f2, float f3, boolean z) {
        float f4 = f;
        float[][] fArr2 = CamUtils.XYZ_TO_CAM16RGB;
        float f5 = (fArr[0] * fArr2[0][0]) + (fArr[1] * fArr2[0][1]) + (fArr[2] * fArr2[0][2]);
        float f6 = (fArr[0] * fArr2[1][0]) + (fArr[1] * fArr2[1][1]) + (fArr[2] * fArr2[1][2]);
        float f7 = (fArr[0] * fArr2[2][0]) + (fArr[1] * fArr2[2][1]) + (fArr[2] * fArr2[2][2]);
        float f8 = (f3 / 10.0f) + 0.8f;
        float lerp = ((double) f8) >= 0.9d ? CamUtils.lerp(0.59f, 0.69f, (f8 - 0.9f) * 10.0f) : CamUtils.lerp(0.525f, 0.59f, (f8 - 0.8f) * 10.0f);
        float exp = z ? 1.0f : (1.0f - (((float) Math.exp((double) (((-f4) - 42.0f) / 92.0f))) * 0.2777778f)) * f8;
        double d = (double) exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f5) * exp) + 1.0f) - exp, (((100.0f / f6) * exp) + 1.0f) - exp, (((100.0f / f7) * exp) + 1.0f) - exp};
        float f9 = 1.0f / ((5.0f * f4) + 1.0f);
        float f10 = f9 * f9 * f9 * f9;
        float f11 = 1.0f - f10;
        float f12 = f10 * f4;
        double d2 = (double) f4;
        Double.isNaN(d2);
        float cbrt = f12 + (0.1f * f11 * f11 * ((float) Math.cbrt(d2 * 5.0d)));
        float yFromLStar = CamUtils.yFromLStar(f2) / fArr[1];
        double d3 = (double) yFromLStar;
        float sqrt = ((float) Math.sqrt(d3)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d3, 0.2d));
        double d4 = (double) (fArr3[0] * cbrt * f5);
        Double.isNaN(d4);
        double d5 = (double) (fArr3[1] * cbrt * f6);
        Double.isNaN(d5);
        double d6 = (double) (fArr3[2] * cbrt * f7);
        Double.isNaN(d6);
        float[] fArr4 = {(float) Math.pow(d4 / 100.0d, 0.42d), (float) Math.pow(d5 / 100.0d, 0.42d), (float) Math.pow(d6 / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        return new ViewingConditions(yFromLStar, ((fArr5[0] * 2.0f) + fArr5[1] + (fArr5[2] * 0.05f)) * pow, pow, pow, lerp, f8, fArr3, cbrt, (float) Math.pow((double) cbrt, 0.25d), sqrt);
    }

    /* access modifiers changed from: package-private */
    public float getAw() {
        return this.mAw;
    }

    /* access modifiers changed from: package-private */
    public float getC() {
        return this.f89mC;
    }

    /* access modifiers changed from: package-private */
    public float getFl() {
        return this.mFl;
    }

    /* access modifiers changed from: package-private */
    public float getFlRoot() {
        return this.mFlRoot;
    }

    /* access modifiers changed from: package-private */
    public float getN() {
        return this.f90mN;
    }

    /* access modifiers changed from: package-private */
    public float getNbb() {
        return this.mNbb;
    }

    /* access modifiers changed from: package-private */
    public float getNc() {
        return this.mNc;
    }

    /* access modifiers changed from: package-private */
    public float getNcb() {
        return this.mNcb;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public float[] getRgbD() {
        return this.mRgbD;
    }

    /* access modifiers changed from: package-private */
    public float getZ() {
        return this.f91mZ;
    }
}
