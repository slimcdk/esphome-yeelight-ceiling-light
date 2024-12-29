package androidx.core.content.res;

import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.ColorUtils;

class CamColor {
    private static final float CHROMA_SEARCH_ENDPOINT = 0.4f;
    private static final float DE_MAX = 1.0f;
    private static final float DL_MAX = 0.2f;
    private static final float LIGHTNESS_SEARCH_ENDPOINT = 0.01f;
    private final float mAstar;
    private final float mBstar;
    private final float mChroma;
    private final float mHue;

    /* renamed from: mJ */
    private final float f85mJ;
    private final float mJstar;

    /* renamed from: mM */
    private final float f86mM;

    /* renamed from: mQ */
    private final float f87mQ;

    /* renamed from: mS */
    private final float f88mS;

    CamColor(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.mHue = f;
        this.mChroma = f2;
        this.f85mJ = f3;
        this.f87mQ = f4;
        this.f86mM = f5;
        this.f88mS = f6;
        this.mJstar = f7;
        this.mAstar = f8;
        this.mBstar = f9;
    }

    @Nullable
    private static CamColor findCamByJ(@FloatRange(from = 0.0d, mo642to = 360.0d) float f, @FloatRange(from = 0.0d, mo642to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @FloatRange(from = 0.0d, mo642to = 100.0d) float f3) {
        float f4 = 1000.0f;
        CamColor camColor = null;
        float f5 = 1000.0f;
        float f6 = 100.0f;
        float f7 = 0.0f;
        while (Math.abs(f7 - f6) > LIGHTNESS_SEARCH_ENDPOINT) {
            float f8 = ((f6 - f7) / 2.0f) + f7;
            int viewedInSrgb = fromJch(f8, f2, f).viewedInSrgb();
            float lStarFromInt = CamUtils.lStarFromInt(viewedInSrgb);
            float abs = Math.abs(f3 - lStarFromInt);
            if (abs < DL_MAX) {
                CamColor fromColor = fromColor(viewedInSrgb);
                float distance = fromColor.distance(fromJch(fromColor.getJ(), fromColor.getChroma(), f));
                if (distance <= DE_MAX) {
                    camColor = fromColor;
                    f4 = abs;
                    f5 = distance;
                }
            }
            if (f4 == 0.0f && f5 == 0.0f) {
                break;
            } else if (lStarFromInt < f3) {
                f7 = f8;
            } else {
                f6 = f8;
            }
        }
        return camColor;
    }

    @NonNull
    static CamColor fromColor(@ColorInt int i) {
        return fromColorInViewingConditions(i, ViewingConditions.DEFAULT);
    }

    @NonNull
    static CamColor fromColorInViewingConditions(@ColorInt int i, @NonNull ViewingConditions viewingConditions) {
        float[] xyzFromInt = CamUtils.xyzFromInt(i);
        float[][] fArr = CamUtils.XYZ_TO_CAM16RGB;
        float f = (xyzFromInt[0] * fArr[0][0]) + (xyzFromInt[1] * fArr[0][1]) + (xyzFromInt[2] * fArr[0][2]);
        float f2 = (xyzFromInt[0] * fArr[1][0]) + (xyzFromInt[1] * fArr[1][1]) + (xyzFromInt[2] * fArr[1][2]);
        float f3 = (xyzFromInt[0] * fArr[2][0]) + (xyzFromInt[1] * fArr[2][1]) + (xyzFromInt[2] * fArr[2][2]);
        float f4 = viewingConditions.getRgbD()[0] * f;
        float f5 = viewingConditions.getRgbD()[1] * f2;
        float f6 = viewingConditions.getRgbD()[2] * f3;
        double fl = (double) (viewingConditions.getFl() * Math.abs(f4));
        Double.isNaN(fl);
        float pow = (float) Math.pow(fl / 100.0d, 0.42d);
        double fl2 = (double) (viewingConditions.getFl() * Math.abs(f5));
        Double.isNaN(fl2);
        float pow2 = (float) Math.pow(fl2 / 100.0d, 0.42d);
        double fl3 = (double) (viewingConditions.getFl() * Math.abs(f6));
        Double.isNaN(fl3);
        float pow3 = (float) Math.pow(fl3 / 100.0d, 0.42d);
        float signum = ((Math.signum(f4) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f5) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f6) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = (double) signum;
        Double.isNaN(d);
        double d2 = (double) signum2;
        Double.isNaN(d2);
        double d3 = (d * 11.0d) + (d2 * -12.0d);
        double d4 = (double) signum3;
        Double.isNaN(d4);
        float f7 = ((float) (d3 + d4)) / 11.0f;
        double d5 = (double) (signum + signum2);
        Double.isNaN(d4);
        Double.isNaN(d5);
        float f8 = ((float) (d5 - (d4 * 2.0d))) / 9.0f;
        float f9 = signum2 * 20.0f;
        float f10 = (((signum * 20.0f) + f9) + (21.0f * signum3)) / 20.0f;
        float f11 = (((signum * 40.0f) + f9) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f8, (double) f7)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f12 = atan2;
        float f13 = (3.1415927f * f12) / 180.0f;
        float pow4 = ((float) Math.pow((double) ((f11 * viewingConditions.getNbb()) / viewingConditions.getAw()), (double) (viewingConditions.getC() * viewingConditions.getZ()))) * 100.0f;
        float flRoot = viewingConditions.getFlRoot() * (4.0f / viewingConditions.getC()) * ((float) Math.sqrt((double) (pow4 / 100.0f))) * (viewingConditions.getAw() + 4.0f);
        double d6 = (double) (((double) f12) < 20.14d ? 360.0f + f12 : f12);
        Double.isNaN(d6);
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) viewingConditions.getN()), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(((d6 * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * viewingConditions.getNc()) * viewingConditions.getNcb()) * ((float) Math.sqrt((double) ((f7 * f7) + (f8 * f8))))) / (f10 + 0.305f)), 0.9d));
        double d7 = (double) pow4;
        Double.isNaN(d7);
        float sqrt = pow5 * ((float) Math.sqrt(d7 / 100.0d));
        float flRoot2 = sqrt * viewingConditions.getFlRoot();
        float sqrt2 = ((float) Math.sqrt((double) ((pow5 * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f)))) * 50.0f;
        float f14 = (1.7f * pow4) / ((0.007f * pow4) + DE_MAX);
        float log = ((float) Math.log((double) ((0.0228f * flRoot2) + DE_MAX))) * 43.85965f;
        double d8 = (double) f13;
        return new CamColor(f12, sqrt, pow4, flRoot, flRoot2, sqrt2, f14, log * ((float) Math.cos(d8)), log * ((float) Math.sin(d8)));
    }

    @NonNull
    private static CamColor fromJch(@FloatRange(from = 0.0d, mo642to = 100.0d) float f, @FloatRange(from = 0.0d, mo642to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @FloatRange(from = 0.0d, mo642to = 360.0d) float f3) {
        return fromJchInFrame(f, f2, f3, ViewingConditions.DEFAULT);
    }

    @NonNull
    private static CamColor fromJchInFrame(@FloatRange(from = 0.0d, mo642to = 100.0d) float f, @FloatRange(from = 0.0d, mo642to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @FloatRange(from = 0.0d, mo642to = 360.0d) float f3, ViewingConditions viewingConditions) {
        float f4 = f;
        double d = (double) f4;
        Double.isNaN(d);
        double d2 = d / 100.0d;
        float c = (4.0f / viewingConditions.getC()) * ((float) Math.sqrt(d2)) * (viewingConditions.getAw() + 4.0f) * viewingConditions.getFlRoot();
        float flRoot = f2 * viewingConditions.getFlRoot();
        float sqrt = ((float) Math.sqrt((double) (((f2 / ((float) Math.sqrt(d2))) * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f)))) * 50.0f;
        float f5 = (1.7f * f4) / ((0.007f * f4) + DE_MAX);
        double d3 = (double) flRoot;
        Double.isNaN(d3);
        float log = ((float) Math.log((d3 * 0.0228d) + 1.0d)) * 43.85965f;
        double d4 = (double) ((3.1415927f * f3) / 180.0f);
        return new CamColor(f3, f2, f4, c, flRoot, sqrt, f5, log * ((float) Math.cos(d4)), log * ((float) Math.sin(d4)));
    }

    static int toColor(@FloatRange(from = 0.0d, mo642to = 360.0d) float f, @FloatRange(from = 0.0d, mo642to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @FloatRange(from = 0.0d, mo642to = 100.0d) float f3) {
        return toColor(f, f2, f3, ViewingConditions.DEFAULT);
    }

    @ColorInt
    static int toColor(@FloatRange(from = 0.0d, mo642to = 360.0d) float f, @FloatRange(from = 0.0d, mo642to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @FloatRange(from = 0.0d, mo642to = 100.0d) float f3, @NonNull ViewingConditions viewingConditions) {
        if (((double) f2) < 1.0d || ((double) Math.round(f3)) <= 0.0d || ((double) Math.round(f3)) >= 100.0d) {
            return CamUtils.intFromLStar(f3);
        }
        float min = f < 0.0f ? 0.0f : Math.min(360.0f, f);
        float f4 = f2;
        CamColor camColor = null;
        float f5 = 0.0f;
        boolean z = true;
        while (Math.abs(f5 - f2) >= CHROMA_SEARCH_ENDPOINT) {
            CamColor findCamByJ = findCamByJ(min, f4, f3);
            if (z) {
                if (findCamByJ != null) {
                    return findCamByJ.viewed(viewingConditions);
                }
                z = false;
            } else if (findCamByJ == null) {
                f2 = f4;
            } else {
                f5 = f4;
                camColor = findCamByJ;
            }
            f4 = ((f2 - f5) / 2.0f) + f5;
        }
        return camColor == null ? CamUtils.intFromLStar(f3) : camColor.viewed(viewingConditions);
    }

    /* access modifiers changed from: package-private */
    public float distance(@NonNull CamColor camColor) {
        float jStar = getJStar() - camColor.getJStar();
        float aStar = getAStar() - camColor.getAStar();
        float bStar = getBStar() - camColor.getBStar();
        return (float) (Math.pow(Math.sqrt((double) ((jStar * jStar) + (aStar * aStar) + (bStar * bStar))), 0.63d) * 1.41d);
    }

    /* access modifiers changed from: package-private */
    @FloatRange(from = Double.NEGATIVE_INFINITY, fromInclusive = false, mo642to = Double.POSITIVE_INFINITY, toInclusive = false)
    public float getAStar() {
        return this.mAstar;
    }

    /* access modifiers changed from: package-private */
    @FloatRange(from = Double.NEGATIVE_INFINITY, fromInclusive = false, mo642to = Double.POSITIVE_INFINITY, toInclusive = false)
    public float getBStar() {
        return this.mBstar;
    }

    /* access modifiers changed from: package-private */
    @FloatRange(from = 0.0d, mo642to = Double.POSITIVE_INFINITY, toInclusive = false)
    public float getChroma() {
        return this.mChroma;
    }

    /* access modifiers changed from: package-private */
    @FloatRange(from = 0.0d, mo642to = 360.0d, toInclusive = false)
    public float getHue() {
        return this.mHue;
    }

    /* access modifiers changed from: package-private */
    @FloatRange(from = 0.0d, mo642to = 100.0d)
    public float getJ() {
        return this.f85mJ;
    }

    /* access modifiers changed from: package-private */
    @FloatRange(from = 0.0d, mo642to = 100.0d)
    public float getJStar() {
        return this.mJstar;
    }

    /* access modifiers changed from: package-private */
    @FloatRange(from = 0.0d, mo642to = Double.POSITIVE_INFINITY, toInclusive = false)
    public float getM() {
        return this.f86mM;
    }

    /* access modifiers changed from: package-private */
    @FloatRange(from = 0.0d, mo642to = Double.POSITIVE_INFINITY, toInclusive = false)
    public float getQ() {
        return this.f87mQ;
    }

    /* access modifiers changed from: package-private */
    @FloatRange(from = 0.0d, mo642to = Double.POSITIVE_INFINITY, toInclusive = false)
    public float getS() {
        return this.f88mS;
    }

    /* access modifiers changed from: package-private */
    @ColorInt
    public int viewed(@NonNull ViewingConditions viewingConditions) {
        float f;
        if (((double) getChroma()) == 0.0d || ((double) getJ()) == 0.0d) {
            f = 0.0f;
        } else {
            float chroma = getChroma();
            double j = (double) getJ();
            Double.isNaN(j);
            f = chroma / ((float) Math.sqrt(j / 100.0d));
        }
        double d = (double) f;
        double pow = Math.pow(1.64d - Math.pow(0.29d, (double) viewingConditions.getN()), 0.73d);
        Double.isNaN(d);
        float pow2 = (float) Math.pow(d / pow, 1.1111111111111112d);
        double hue = (double) ((getHue() * 3.1415927f) / 180.0f);
        Double.isNaN(hue);
        float aw = viewingConditions.getAw();
        double j2 = (double) getJ();
        Double.isNaN(j2);
        double c = (double) viewingConditions.getC();
        Double.isNaN(c);
        double d2 = 1.0d / c;
        double z = (double) viewingConditions.getZ();
        Double.isNaN(z);
        float pow3 = aw * ((float) Math.pow(j2 / 100.0d, d2 / z));
        float cos = ((float) (Math.cos(2.0d + hue) + 3.8d)) * 0.25f * 3846.1538f * viewingConditions.getNc() * viewingConditions.getNcb();
        float nbb = pow3 / viewingConditions.getNbb();
        float sin = (float) Math.sin(hue);
        float cos2 = (float) Math.cos(hue);
        float f2 = (((0.305f + nbb) * 23.0f) * pow2) / (((cos * 23.0f) + ((11.0f * pow2) * cos2)) + ((pow2 * 108.0f) * sin));
        float f3 = cos2 * f2;
        float f4 = f2 * sin;
        float f5 = nbb * 460.0f;
        float f6 = (((451.0f * f3) + f5) + (288.0f * f4)) / 1403.0f;
        float f7 = ((f5 - (891.0f * f3)) - (261.0f * f4)) / 1403.0f;
        float f8 = ((f5 - (f3 * 220.0f)) - (f4 * 6300.0f)) / 1403.0f;
        double abs = (double) Math.abs(f6);
        Double.isNaN(abs);
        double abs2 = (double) Math.abs(f6);
        Double.isNaN(abs2);
        float signum = Math.signum(f6) * (100.0f / viewingConditions.getFl()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (abs * 27.13d) / (400.0d - abs2))), 2.380952380952381d));
        double abs3 = (double) Math.abs(f7);
        Double.isNaN(abs3);
        double abs4 = (double) Math.abs(f7);
        Double.isNaN(abs4);
        float signum2 = Math.signum(f7) * (100.0f / viewingConditions.getFl()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (abs3 * 27.13d) / (400.0d - abs4))), 2.380952380952381d));
        double abs5 = (double) Math.abs(f8);
        Double.isNaN(abs5);
        double abs6 = (double) Math.abs(f8);
        Double.isNaN(abs6);
        float signum3 = Math.signum(f8) * (100.0f / viewingConditions.getFl()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (abs5 * 27.13d) / (400.0d - abs6))), 2.380952380952381d));
        float f9 = signum / viewingConditions.getRgbD()[0];
        float f10 = signum2 / viewingConditions.getRgbD()[1];
        float f11 = signum3 / viewingConditions.getRgbD()[2];
        float[][] fArr = CamUtils.CAM16RGB_TO_XYZ;
        return ColorUtils.XYZToColor((double) ((fArr[0][0] * f9) + (fArr[0][1] * f10) + (fArr[0][2] * f11)), (double) ((fArr[1][0] * f9) + (fArr[1][1] * f10) + (fArr[1][2] * f11)), (double) ((f9 * fArr[2][0]) + (f10 * fArr[2][1]) + (f11 * fArr[2][2])));
    }

    /* access modifiers changed from: package-private */
    @ColorInt
    public int viewedInSrgb() {
        return viewed(ViewingConditions.DEFAULT);
    }
}
