package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.utils.Easing;
import java.util.Arrays;
import java.util.HashMap;
import p223w3.C11819x;
import p223w3.C11864y;

public class MotionPaths implements Comparable<MotionPaths> {
    public static final int CARTESIAN = 0;
    public static final boolean DEBUG = false;
    static final int OFF_HEIGHT = 4;
    static final int OFF_PATH_ROTATE = 5;
    static final int OFF_POSITION = 0;
    static final int OFF_WIDTH = 3;
    static final int OFF_X = 1;
    static final int OFF_Y = 2;
    public static final boolean OLD_WAY = false;
    public static final int PERPENDICULAR = 1;
    public static final int SCREEN = 2;
    public static final String TAG = "MotionPaths";
    static String[] names = {"position", C11819x.f21648C, C11864y.f21710C, "width", "height", "pathRotate"};
    HashMap<String, CustomVariable> customAttributes = new HashMap<>();
    float height;
    int mAnimateCircleAngleTo;
    int mAnimateRelativeTo = -1;
    int mDrawPath = 0;
    Easing mKeyFrameEasing;
    int mMode = 0;
    int mPathMotionArc = -1;
    float mPathRotate = Float.NaN;
    float mProgress = Float.NaN;
    float mRelativeAngle = Float.NaN;
    Motion mRelativeToController = null;
    double[] mTempDelta = new double[18];
    double[] mTempValue = new double[18];
    float position;
    float time;
    float width;

    /* renamed from: x */
    float f22x;

    /* renamed from: y */
    float f23y;

    public MotionPaths() {
    }

    public MotionPaths(int i, int i2, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        if (motionPaths.mAnimateRelativeTo != -1) {
            initPolar(i, i2, motionKeyPosition, motionPaths, motionPaths2);
            return;
        }
        int i3 = motionKeyPosition.mPositionType;
        if (i3 == 1) {
            initPath(motionKeyPosition, motionPaths, motionPaths2);
        } else if (i3 != 2) {
            initCartesian(motionKeyPosition, motionPaths, motionPaths2);
        } else {
            initScreen(i, i2, motionKeyPosition, motionPaths, motionPaths2);
        }
    }

    private boolean diff(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    private static final float xRotate(float f, float f2, float f3, float f4, float f5, float f6) {
        return (((f5 - f3) * f2) - ((f6 - f4) * f)) + f3;
    }

    private static final float yRotate(float f, float f2, float f3, float f4, float f5, float f6) {
        return ((f5 - f3) * f) + ((f6 - f4) * f2) + f4;
    }

    public void applyParameters(MotionWidget motionWidget) {
        this.mKeyFrameEasing = Easing.getInterpolator(motionWidget.motion.mTransitionEasing);
        MotionWidget.Motion motion = motionWidget.motion;
        this.mPathMotionArc = motion.mPathMotionArc;
        this.mAnimateRelativeTo = motion.mAnimateRelativeTo;
        this.mPathRotate = motion.mPathRotate;
        this.mDrawPath = motion.mDrawPath;
        this.mAnimateCircleAngleTo = motion.mAnimateCircleAngleTo;
        this.mProgress = motionWidget.propertySet.mProgress;
        this.mRelativeAngle = 0.0f;
        for (String next : motionWidget.getCustomAttributeNames()) {
            CustomVariable customAttribute = motionWidget.getCustomAttribute(next);
            if (customAttribute != null && customAttribute.isContinuous()) {
                this.customAttributes.put(next, customAttribute);
            }
        }
    }

    public int compareTo(MotionPaths motionPaths) {
        return Float.compare(this.position, motionPaths.position);
    }

    public void configureRelativeTo(Motion motion) {
        motion.getPos((double) this.mProgress);
    }

    /* access modifiers changed from: package-private */
    public void different(MotionPaths motionPaths, boolean[] zArr, String[] strArr, boolean z) {
        boolean diff = diff(this.f22x, motionPaths.f22x);
        boolean diff2 = diff(this.f23y, motionPaths.f23y);
        zArr[0] = zArr[0] | diff(this.position, motionPaths.position);
        boolean z2 = diff | diff2 | z;
        zArr[1] = zArr[1] | z2;
        zArr[2] = z2 | zArr[2];
        zArr[3] = zArr[3] | diff(this.width, motionPaths.width);
        zArr[4] = diff(this.height, motionPaths.height) | zArr[4];
    }

    /* access modifiers changed from: package-private */
    public void fillStandard(double[] dArr, int[] iArr) {
        float[] fArr = {this.position, this.f22x, this.f23y, this.width, this.height, this.mPathRotate};
        int i = 0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] < 6) {
                dArr[i] = (double) fArr[iArr[i2]];
                i++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void getBounds(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.width;
        float f2 = this.height;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f3 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 3) {
                f = f3;
            } else if (i3 == 4) {
                f2 = f3;
            }
        }
        fArr[i] = f;
        fArr[i + 1] = f2;
    }

    /* access modifiers changed from: package-private */
    public void getCenter(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        int[] iArr2 = iArr;
        float f = this.f22x;
        float f2 = this.f23y;
        float f3 = this.width;
        float f4 = this.height;
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr2[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr2 = new float[2];
            motion.getCenter(d, fArr2, new float[2]);
            float f6 = fArr2[0];
            float f7 = fArr2[1];
            double d2 = (double) f6;
            double d3 = (double) f;
            double d4 = (double) f2;
            double sin = Math.sin(d4);
            Double.isNaN(d3);
            Double.isNaN(d2);
            double d5 = d2 + (sin * d3);
            double d6 = (double) (f3 / 2.0f);
            Double.isNaN(d6);
            float f8 = (float) (d5 - d6);
            double d7 = (double) f7;
            double cos = Math.cos(d4);
            Double.isNaN(d3);
            Double.isNaN(d7);
            double d8 = d7 - (d3 * cos);
            double d9 = (double) (f4 / 2.0f);
            Double.isNaN(d9);
            f = f8;
            f2 = (float) (d8 - d9);
        }
        fArr[i] = f + (f3 / 2.0f) + 0.0f;
        fArr[i + 1] = f2 + (f4 / 2.0f) + 0.0f;
    }

    /* access modifiers changed from: package-private */
    public void getCenter(double d, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f;
        int[] iArr2 = iArr;
        float f2 = this.f22x;
        float f3 = this.f23y;
        float f4 = this.width;
        float f5 = this.height;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        for (int i = 0; i < iArr2.length; i++) {
            float f10 = (float) dArr[i];
            float f11 = (float) dArr2[i];
            int i2 = iArr2[i];
            if (i2 == 1) {
                f2 = f10;
                f6 = f11;
            } else if (i2 == 2) {
                f3 = f10;
                f8 = f11;
            } else if (i2 == 3) {
                f4 = f10;
                f7 = f11;
            } else if (i2 == 4) {
                f5 = f10;
                f9 = f11;
            }
        }
        float f12 = 2.0f;
        float f13 = (f7 / 2.0f) + f6;
        float f14 = (f9 / 2.0f) + f8;
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            motion.getCenter(d, fArr3, fArr4);
            float f15 = fArr3[0];
            float f16 = fArr3[1];
            float f17 = fArr4[0];
            double d2 = (double) f15;
            double d3 = (double) f2;
            float f18 = fArr4[1];
            double d4 = (double) f3;
            double sin = Math.sin(d4);
            Double.isNaN(d3);
            Double.isNaN(d2);
            double d5 = d2 + (sin * d3);
            f = f4;
            double d6 = (double) (f4 / 2.0f);
            Double.isNaN(d6);
            float f19 = (float) (d5 - d6);
            double d7 = (double) f16;
            double cos = Math.cos(d4);
            Double.isNaN(d3);
            Double.isNaN(d7);
            double d8 = d7 - (d3 * cos);
            double d9 = (double) (f5 / 2.0f);
            Double.isNaN(d9);
            double d10 = (double) f17;
            double d11 = (double) f6;
            double sin2 = Math.sin(d4);
            Double.isNaN(d11);
            Double.isNaN(d10);
            double d12 = d10 + (sin2 * d11);
            double cos2 = Math.cos(d4);
            double d13 = (double) f8;
            Double.isNaN(d13);
            float f20 = (float) (d12 + (cos2 * d13));
            double d14 = (double) f18;
            double cos3 = Math.cos(d4);
            Double.isNaN(d11);
            Double.isNaN(d14);
            double sin3 = Math.sin(d4);
            Double.isNaN(d13);
            f14 = (float) ((d14 - (d11 * cos3)) + (sin3 * d13));
            f13 = f20;
            f2 = f19;
            f3 = (float) (d8 - d9);
            f12 = 2.0f;
        } else {
            f = f4;
        }
        fArr[0] = f2 + (f / f12) + 0.0f;
        fArr[1] = f3 + (f5 / f12) + 0.0f;
        fArr2[0] = f13;
        fArr2[1] = f14;
    }

    /* access modifiers changed from: package-private */
    public void getCenterVelocity(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        int[] iArr2 = iArr;
        float f = this.f22x;
        float f2 = this.f23y;
        float f3 = this.width;
        float f4 = this.height;
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr2[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr2 = new float[2];
            motion.getCenter(d, fArr2, new float[2]);
            float f6 = fArr2[0];
            float f7 = fArr2[1];
            double d2 = (double) f6;
            double d3 = (double) f;
            double d4 = (double) f2;
            double sin = Math.sin(d4);
            Double.isNaN(d3);
            Double.isNaN(d2);
            double d5 = d2 + (sin * d3);
            double d6 = (double) (f3 / 2.0f);
            Double.isNaN(d6);
            float f8 = (float) (d5 - d6);
            double d7 = (double) f7;
            double cos = Math.cos(d4);
            Double.isNaN(d3);
            Double.isNaN(d7);
            double d8 = d7 - (d3 * cos);
            double d9 = (double) (f4 / 2.0f);
            Double.isNaN(d9);
            f = f8;
            f2 = (float) (d8 - d9);
        }
        fArr[i] = f + (f3 / 2.0f) + 0.0f;
        fArr[i + 1] = f2 + (f4 / 2.0f) + 0.0f;
    }

    /* access modifiers changed from: package-private */
    public int getCustomData(String str, double[] dArr, int i) {
        CustomVariable customVariable = this.customAttributes.get(str);
        int i2 = 0;
        if (customVariable == null) {
            return 0;
        }
        if (customVariable.numberOfInterpolatedValues() == 1) {
            dArr[i] = (double) customVariable.getValueToInterpolate();
            return 1;
        }
        int numberOfInterpolatedValues = customVariable.numberOfInterpolatedValues();
        float[] fArr = new float[numberOfInterpolatedValues];
        customVariable.getValuesToInterpolate(fArr);
        while (i2 < numberOfInterpolatedValues) {
            dArr[i] = (double) fArr[i2];
            i2++;
            i++;
        }
        return numberOfInterpolatedValues;
    }

    /* access modifiers changed from: package-private */
    public int getCustomDataCount(String str) {
        CustomVariable customVariable = this.customAttributes.get(str);
        if (customVariable == null) {
            return 0;
        }
        return customVariable.numberOfInterpolatedValues();
    }

    /* access modifiers changed from: package-private */
    public void getRect(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f22x;
        float f2 = this.f23y;
        float f3 = this.width;
        float f4 = this.height;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float centerX = motion.getCenterX();
            float centerY = this.mRelativeToController.getCenterY();
            double d = (double) centerX;
            double d2 = (double) f;
            double d3 = (double) f2;
            double sin = Math.sin(d3);
            Double.isNaN(d2);
            Double.isNaN(d);
            double d4 = d + (sin * d2);
            double d5 = (double) (f3 / 2.0f);
            Double.isNaN(d5);
            double d6 = (double) centerY;
            double cos = Math.cos(d3);
            Double.isNaN(d2);
            Double.isNaN(d6);
            double d7 = (double) (f4 / 2.0f);
            Double.isNaN(d7);
            f2 = (float) ((d6 - (d2 * cos)) - d7);
            f = (float) (d4 - d5);
        }
        float f6 = f3 + f;
        float f7 = f4 + f2;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        int i4 = i + 1;
        fArr[i] = f + 0.0f;
        int i5 = i4 + 1;
        fArr[i4] = f2 + 0.0f;
        int i6 = i5 + 1;
        fArr[i5] = f6 + 0.0f;
        int i7 = i6 + 1;
        fArr[i6] = f2 + 0.0f;
        int i8 = i7 + 1;
        fArr[i7] = f6 + 0.0f;
        int i9 = i8 + 1;
        fArr[i8] = f7 + 0.0f;
        fArr[i9] = f + 0.0f;
        fArr[i9 + 1] = f7 + 0.0f;
    }

    /* access modifiers changed from: package-private */
    public boolean hasCustomData(String str) {
        return this.customAttributes.containsKey(str);
    }

    /* access modifiers changed from: package-private */
    public void initCartesian(MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        MotionKeyPosition motionKeyPosition2 = motionKeyPosition;
        MotionPaths motionPaths3 = motionPaths;
        MotionPaths motionPaths4 = motionPaths2;
        float f = ((float) motionKeyPosition2.mFramePosition) / 100.0f;
        this.time = f;
        this.mDrawPath = motionKeyPosition2.mDrawPath;
        float f2 = Float.isNaN(motionKeyPosition2.mPercentWidth) ? f : motionKeyPosition2.mPercentWidth;
        float f3 = Float.isNaN(motionKeyPosition2.mPercentHeight) ? f : motionKeyPosition2.mPercentHeight;
        float f4 = motionPaths4.width;
        float f5 = motionPaths3.width;
        float f6 = motionPaths4.height;
        float f7 = motionPaths3.height;
        this.position = this.time;
        float f8 = motionPaths3.f22x;
        float f9 = motionPaths3.f23y;
        float f10 = (motionPaths4.f22x + (f4 / 2.0f)) - ((f5 / 2.0f) + f8);
        float f11 = (motionPaths4.f23y + (f6 / 2.0f)) - (f9 + (f7 / 2.0f));
        float f12 = (f4 - f5) * f2;
        float f13 = f12 / 2.0f;
        this.f22x = (float) ((int) ((f8 + (f10 * f)) - f13));
        float f14 = (f6 - f7) * f3;
        float f15 = f14 / 2.0f;
        this.f23y = (float) ((int) ((f9 + (f11 * f)) - f15));
        this.width = (float) ((int) (f5 + f12));
        this.height = (float) ((int) (f7 + f14));
        MotionKeyPosition motionKeyPosition3 = motionKeyPosition;
        float f16 = Float.isNaN(motionKeyPosition3.mPercentX) ? f : motionKeyPosition3.mPercentX;
        float f17 = 0.0f;
        float f18 = Float.isNaN(motionKeyPosition3.mAltPercentY) ? 0.0f : motionKeyPosition3.mAltPercentY;
        if (!Float.isNaN(motionKeyPosition3.mPercentY)) {
            f = motionKeyPosition3.mPercentY;
        }
        if (!Float.isNaN(motionKeyPosition3.mAltPercentX)) {
            f17 = motionKeyPosition3.mAltPercentX;
        }
        this.mMode = 0;
        MotionPaths motionPaths5 = motionPaths;
        this.f22x = (float) ((int) (((motionPaths5.f22x + (f16 * f10)) + (f17 * f11)) - f13));
        this.f23y = (float) ((int) (((motionPaths5.f23y + (f10 * f18)) + (f11 * f)) - f15));
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition3.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition3.mPathMotionArc;
    }

    /* access modifiers changed from: package-private */
    public void initPath(MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        MotionKeyPosition motionKeyPosition2 = motionKeyPosition;
        MotionPaths motionPaths3 = motionPaths;
        MotionPaths motionPaths4 = motionPaths2;
        float f = ((float) motionKeyPosition2.mFramePosition) / 100.0f;
        this.time = f;
        this.mDrawPath = motionKeyPosition2.mDrawPath;
        float f2 = Float.isNaN(motionKeyPosition2.mPercentWidth) ? f : motionKeyPosition2.mPercentWidth;
        float f3 = Float.isNaN(motionKeyPosition2.mPercentHeight) ? f : motionKeyPosition2.mPercentHeight;
        float f4 = motionPaths4.width - motionPaths3.width;
        float f5 = motionPaths4.height - motionPaths3.height;
        this.position = this.time;
        if (!Float.isNaN(motionKeyPosition2.mPercentX)) {
            f = motionKeyPosition2.mPercentX;
        }
        float f6 = motionPaths3.f22x;
        float f7 = motionPaths3.width;
        float f8 = motionPaths3.f23y;
        float f9 = motionPaths3.height;
        float f10 = (motionPaths4.f22x + (motionPaths4.width / 2.0f)) - ((f7 / 2.0f) + f6);
        float f11 = (motionPaths4.f23y + (motionPaths4.height / 2.0f)) - ((f9 / 2.0f) + f8);
        float f12 = f10 * f;
        float f13 = f4 * f2;
        float f14 = f13 / 2.0f;
        this.f22x = (float) ((int) ((f6 + f12) - f14));
        float f15 = f * f11;
        float f16 = f5 * f3;
        float f17 = f16 / 2.0f;
        this.f23y = (float) ((int) ((f8 + f15) - f17));
        this.width = (float) ((int) (f7 + f13));
        this.height = (float) ((int) (f9 + f16));
        MotionKeyPosition motionKeyPosition3 = motionKeyPosition;
        float f18 = Float.isNaN(motionKeyPosition3.mPercentY) ? 0.0f : motionKeyPosition3.mPercentY;
        float f19 = (-f11) * f18;
        float f20 = f10 * f18;
        this.mMode = 1;
        MotionPaths motionPaths5 = motionPaths;
        float f21 = (float) ((int) ((motionPaths5.f22x + f12) - f14));
        this.f22x = f21;
        float f22 = (float) ((int) ((motionPaths5.f23y + f15) - f17));
        this.f23y = f22;
        this.f22x = f21 + f19;
        this.f23y = f22 + f20;
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition3.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition3.mPathMotionArc;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        if (java.lang.Float.isNaN(r9.mPercentY) != false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bb, code lost:
        if (java.lang.Float.isNaN(r9.mPercentY) != false) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initPolar(int r7, int r8, androidx.constraintlayout.core.motion.key.MotionKeyPosition r9, androidx.constraintlayout.core.motion.MotionPaths r10, androidx.constraintlayout.core.motion.MotionPaths r11) {
        /*
            r6 = this;
            int r7 = r9.mFramePosition
            float r7 = (float) r7
            r8 = 1120403456(0x42c80000, float:100.0)
            float r7 = r7 / r8
            r6.time = r7
            int r8 = r9.mDrawPath
            r6.mDrawPath = r8
            int r8 = r9.mPositionType
            r6.mMode = r8
            float r8 = r9.mPercentWidth
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 == 0) goto L_0x001a
            r8 = r7
            goto L_0x001c
        L_0x001a:
            float r8 = r9.mPercentWidth
        L_0x001c:
            float r0 = r9.mPercentHeight
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L_0x0026
            r0 = r7
            goto L_0x0028
        L_0x0026:
            float r0 = r9.mPercentHeight
        L_0x0028:
            float r1 = r11.width
            float r2 = r10.width
            float r1 = r1 - r2
            float r3 = r11.height
            float r4 = r10.height
            float r3 = r3 - r4
            float r5 = r6.time
            r6.position = r5
            float r1 = r1 * r8
            float r2 = r2 + r1
            int r1 = (int) r2
            float r1 = (float) r1
            r6.width = r1
            float r3 = r3 * r0
            float r4 = r4 + r3
            int r1 = (int) r4
            float r1 = (float) r1
            r6.height = r1
            int r1 = r9.mPositionType
            r2 = 1
            if (r1 == r2) goto L_0x009f
            r2 = 2
            if (r1 == r2) goto L_0x0078
            float r8 = r9.mPercentX
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 == 0) goto L_0x0056
            r8 = r7
            goto L_0x0058
        L_0x0056:
            float r8 = r9.mPercentX
        L_0x0058:
            float r0 = r11.f22x
            float r1 = r10.f22x
            float r0 = r0 - r1
            float r8 = r8 * r0
            float r8 = r8 + r1
            r6.f22x = r8
            float r8 = r9.mPercentY
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 == 0) goto L_0x006b
            goto L_0x006d
        L_0x006b:
            float r7 = r9.mPercentY
        L_0x006d:
            float r8 = r11.f23y
            float r11 = r10.f23y
            float r8 = r8 - r11
            float r7 = r7 * r8
            float r7 = r7 + r11
        L_0x0075:
            r6.f23y = r7
            goto L_0x00be
        L_0x0078:
            float r1 = r9.mPercentX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0089
            float r8 = r11.f22x
            float r0 = r10.f22x
            float r8 = r8 - r0
            float r8 = r8 * r7
            float r8 = r8 + r0
            goto L_0x0091
        L_0x0089:
            float r1 = r9.mPercentX
            float r8 = java.lang.Math.min(r0, r8)
            float r8 = r8 * r1
        L_0x0091:
            r6.f22x = r8
            float r8 = r9.mPercentY
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 == 0) goto L_0x009c
            goto L_0x006d
        L_0x009c:
            float r7 = r9.mPercentY
            goto L_0x0075
        L_0x009f:
            float r8 = r9.mPercentX
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 == 0) goto L_0x00a9
            r8 = r7
            goto L_0x00ab
        L_0x00a9:
            float r8 = r9.mPercentX
        L_0x00ab:
            float r0 = r11.f22x
            float r1 = r10.f22x
            float r0 = r0 - r1
            float r8 = r8 * r0
            float r8 = r8 + r1
            r6.f22x = r8
            float r8 = r9.mPercentY
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 == 0) goto L_0x006b
            goto L_0x006d
        L_0x00be:
            int r7 = r10.mAnimateRelativeTo
            r6.mAnimateRelativeTo = r7
            java.lang.String r7 = r9.mTransitionEasing
            androidx.constraintlayout.core.motion.utils.Easing r7 = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(r7)
            r6.mKeyFrameEasing = r7
            int r7 = r9.mPathMotionArc
            r6.mPathMotionArc = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.MotionPaths.initPolar(int, int, androidx.constraintlayout.core.motion.key.MotionKeyPosition, androidx.constraintlayout.core.motion.MotionPaths, androidx.constraintlayout.core.motion.MotionPaths):void");
    }

    /* access modifiers changed from: package-private */
    public void initScreen(int i, int i2, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        MotionKeyPosition motionKeyPosition2 = motionKeyPosition;
        MotionPaths motionPaths3 = motionPaths;
        MotionPaths motionPaths4 = motionPaths2;
        float f = ((float) motionKeyPosition2.mFramePosition) / 100.0f;
        this.time = f;
        this.mDrawPath = motionKeyPosition2.mDrawPath;
        float f2 = Float.isNaN(motionKeyPosition2.mPercentWidth) ? f : motionKeyPosition2.mPercentWidth;
        float f3 = Float.isNaN(motionKeyPosition2.mPercentHeight) ? f : motionKeyPosition2.mPercentHeight;
        float f4 = motionPaths4.width;
        float f5 = motionPaths3.width;
        float f6 = motionPaths4.height;
        float f7 = motionPaths3.height;
        this.position = this.time;
        float f8 = motionPaths3.f22x;
        float f9 = motionPaths3.f23y;
        float f10 = motionPaths4.f22x + (f4 / 2.0f);
        float f11 = motionPaths4.f23y + (f6 / 2.0f);
        float f12 = (f4 - f5) * f2;
        this.f22x = (float) ((int) ((f8 + ((f10 - ((f5 / 2.0f) + f8)) * f)) - (f12 / 2.0f)));
        float f13 = (f6 - f7) * f3;
        this.f23y = (float) ((int) ((f9 + ((f11 - (f9 + (f7 / 2.0f))) * f)) - (f13 / 2.0f)));
        this.width = (float) ((int) (f5 + f12));
        this.height = (float) ((int) (f7 + f13));
        this.mMode = 2;
        MotionKeyPosition motionKeyPosition3 = motionKeyPosition;
        if (!Float.isNaN(motionKeyPosition3.mPercentX)) {
            this.f22x = (float) ((int) (motionKeyPosition3.mPercentX * ((float) ((int) (((float) i) - this.width)))));
        }
        if (!Float.isNaN(motionKeyPosition3.mPercentY)) {
            this.f23y = (float) ((int) (motionKeyPosition3.mPercentY * ((float) ((int) (((float) i2) - this.height)))));
        }
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition3.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition3.mPathMotionArc;
    }

    /* access modifiers changed from: package-private */
    public void setBounds(float f, float f2, float f3, float f4) {
        this.f22x = f;
        this.f23y = f2;
        this.width = f3;
        this.height = f4;
    }

    /* access modifiers changed from: package-private */
    public void setDpDt(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        int[] iArr2 = iArr;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr2.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr2[i];
            if (i2 == 1) {
                f3 = f7;
            } else if (i2 == 2) {
                f5 = f7;
            } else if (i2 == 3) {
                f4 = f7;
            } else if (i2 == 4) {
                f6 = f7;
            }
        }
        float f8 = f3 - ((0.0f * f4) / 2.0f);
        float f9 = f5 - ((0.0f * f6) / 2.0f);
        fArr[0] = (f8 * (1.0f - f)) + (((f4 * 1.0f) + f8) * f) + 0.0f;
        fArr[1] = (f9 * (1.0f - f2)) + (((f6 * 1.0f) + f9) * f2) + 0.0f;
    }

    /* access modifiers changed from: package-private */
    public void setView(float f, MotionWidget motionWidget, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f2;
        float f3;
        MotionWidget motionWidget2 = motionWidget;
        int[] iArr2 = iArr;
        double[] dArr4 = dArr2;
        float f4 = this.f22x;
        float f5 = this.f23y;
        float f6 = this.width;
        float f7 = this.height;
        if (iArr2.length != 0 && this.mTempValue.length <= iArr2[iArr2.length - 1]) {
            int i = iArr2[iArr2.length - 1] + 1;
            this.mTempValue = new double[i];
            this.mTempDelta = new double[i];
        }
        Arrays.fill(this.mTempValue, Double.NaN);
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            this.mTempValue[iArr2[i2]] = dArr[i2];
            this.mTempDelta[iArr2[i2]] = dArr4[i2];
        }
        float f8 = Float.NaN;
        int i3 = 0;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (true) {
            double[] dArr5 = this.mTempValue;
            if (i3 >= dArr5.length) {
                break;
            }
            double d = 0.0d;
            if (!Double.isNaN(dArr5[i3]) || !(dArr3 == null || dArr3[i3] == 0.0d)) {
                if (dArr3 != null) {
                    d = dArr3[i3];
                }
                if (!Double.isNaN(this.mTempValue[i3])) {
                    d = this.mTempValue[i3] + d;
                }
                f3 = f8;
                float f13 = (float) d;
                float f14 = (float) this.mTempDelta[i3];
                if (i3 == 1) {
                    f8 = f3;
                    f9 = f14;
                    f4 = f13;
                } else if (i3 == 2) {
                    f8 = f3;
                    f10 = f14;
                    f5 = f13;
                } else if (i3 == 3) {
                    f8 = f3;
                    f11 = f14;
                    f6 = f13;
                } else if (i3 == 4) {
                    f8 = f3;
                    f12 = f14;
                    f7 = f13;
                } else if (i3 == 5) {
                    f8 = f13;
                }
                i3++;
                double[] dArr6 = dArr2;
            } else {
                f3 = f8;
            }
            f8 = f3;
            i3++;
            double[] dArr62 = dArr2;
        }
        float f15 = f8;
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            motion.getCenter((double) f, fArr, fArr2);
            float f16 = fArr[0];
            float f17 = fArr[1];
            float f18 = fArr2[0];
            float f19 = fArr2[1];
            double d2 = (double) f16;
            double d3 = (double) f4;
            double d4 = (double) f5;
            double sin = Math.sin(d4);
            Double.isNaN(d3);
            Double.isNaN(d2);
            double d5 = d2 + (sin * d3);
            double d6 = (double) (f6 / 2.0f);
            Double.isNaN(d6);
            double d7 = (double) f17;
            double cos = Math.cos(d4);
            Double.isNaN(d3);
            Double.isNaN(d7);
            double d8 = d7 - (cos * d3);
            f2 = f7;
            float f20 = (float) (d5 - d6);
            double d9 = (double) (f7 / 2.0f);
            Double.isNaN(d9);
            float f21 = (float) (d8 - d9);
            double d10 = (double) f18;
            double d11 = (double) f9;
            double sin2 = Math.sin(d4);
            Double.isNaN(d11);
            Double.isNaN(d10);
            double d12 = d10 + (sin2 * d11);
            double cos2 = Math.cos(d4);
            Double.isNaN(d3);
            double d13 = (double) f10;
            Double.isNaN(d13);
            float f22 = (float) (d12 + (cos2 * d3 * d13));
            float f23 = f20;
            double d14 = (double) f19;
            double cos3 = Math.cos(d4);
            Double.isNaN(d11);
            Double.isNaN(d14);
            double sin3 = Math.sin(d4);
            Double.isNaN(d3);
            Double.isNaN(d13);
            float f24 = (float) ((d14 - (d11 * cos3)) + (d3 * sin3 * d13));
            double[] dArr7 = dArr2;
            if (dArr7.length >= 2) {
                dArr7[0] = (double) f22;
                dArr7[1] = (double) f24;
            }
            if (!Float.isNaN(f15)) {
                double d15 = (double) f15;
                double degrees = Math.toDegrees(Math.atan2((double) f24, (double) f22));
                Double.isNaN(d15);
                motionWidget2.setRotationZ((float) (d15 + degrees));
            }
            f4 = f23;
            f5 = f21;
        } else {
            float f25 = f15;
            f2 = f7;
            if (!Float.isNaN(f25)) {
                double d16 = (double) 0.0f;
                double d17 = (double) f25;
                double degrees2 = Math.toDegrees(Math.atan2((double) (f10 + (f12 / 2.0f)), (double) (f9 + (f11 / 2.0f))));
                Double.isNaN(d17);
                Double.isNaN(d16);
                motionWidget2.setRotationZ((float) (d16 + d17 + degrees2));
            }
        }
        float f26 = f4 + 0.5f;
        float f27 = f5 + 0.5f;
        motionWidget2.layout((int) f26, (int) f27, (int) (f26 + f6), (int) (f27 + f2));
    }

    public void setupRelative(Motion motion, MotionPaths motionPaths) {
        double d = (double) (((this.f22x + (this.width / 2.0f)) - motionPaths.f22x) - (motionPaths.width / 2.0f));
        double d2 = (double) (((this.f23y + (this.height / 2.0f)) - motionPaths.f23y) - (motionPaths.height / 2.0f));
        this.mRelativeToController = motion;
        this.f22x = (float) Math.hypot(d2, d);
        this.f23y = (float) (Float.isNaN(this.mRelativeAngle) ? Math.atan2(d2, d) + 1.5707963267948966d : Math.toRadians((double) this.mRelativeAngle));
    }
}