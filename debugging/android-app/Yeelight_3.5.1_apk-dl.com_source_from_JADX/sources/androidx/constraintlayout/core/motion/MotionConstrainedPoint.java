package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.Rect;
import java.util.HashSet;
import java.util.LinkedHashMap;
import p223w3.C11819x;
import p223w3.C11864y;

class MotionConstrainedPoint implements Comparable<MotionConstrainedPoint> {
    static final int CARTESIAN = 2;
    public static final boolean DEBUG = false;
    static final int PERPENDICULAR = 1;
    public static final String TAG = "MotionPaths";
    static String[] names = {"position", C11819x.f21648C, C11864y.f21710C, "width", "height", "pathRotate"};
    private float alpha = 1.0f;
    private boolean applyElevation = false;
    private float elevation = 0.0f;
    private float height;
    private int mAnimateRelativeTo = -1;
    LinkedHashMap<String, CustomVariable> mCustomVariable = new LinkedHashMap<>();
    private int mDrawPath = 0;
    private Easing mKeyFrameEasing;
    int mMode = 0;
    private float mPathRotate = Float.NaN;
    private float mPivotX = Float.NaN;
    private float mPivotY = Float.NaN;
    private float mProgress = Float.NaN;
    double[] mTempDelta = new double[18];
    double[] mTempValue = new double[18];
    int mVisibilityMode = 0;
    private float position;
    private float rotation = 0.0f;
    private float rotationX = 0.0f;
    public float rotationY = 0.0f;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float translationX = 0.0f;
    private float translationY = 0.0f;
    private float translationZ = 0.0f;
    int visibility;
    private float width;

    /* renamed from: x */
    private float f20x;

    /* renamed from: y */
    private float f21y;

    private boolean diff(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x014b, code lost:
        r2.setPoint(r9, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01bb, code lost:
        r2.setPoint(r9, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r8, int r9) {
        /*
            r7 = this;
            java.util.Set r0 = r8.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01d8
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r8.get(r1)
            androidx.constraintlayout.core.motion.utils.SplineSet r2 = (androidx.constraintlayout.core.motion.utils.SplineSet) r2
            r1.hashCode()
            r3 = -1
            int r4 = r1.hashCode()
            r5 = 1
            switch(r4) {
                case -1249320806: goto L_0x00bb;
                case -1249320805: goto L_0x00b0;
                case -1249320804: goto L_0x00a5;
                case -1225497657: goto L_0x009a;
                case -1225497656: goto L_0x008f;
                case -1225497655: goto L_0x0084;
                case -1001078227: goto L_0x0079;
                case -987906986: goto L_0x006e;
                case -987906985: goto L_0x0060;
                case -908189618: goto L_0x0052;
                case -908189617: goto L_0x0044;
                case 92909918: goto L_0x0036;
                case 803192288: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x00c5
        L_0x0028:
            java.lang.String r4 = "pathRotate"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0032
            goto L_0x00c5
        L_0x0032:
            r3 = 12
            goto L_0x00c5
        L_0x0036:
            java.lang.String r4 = "alpha"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0040
            goto L_0x00c5
        L_0x0040:
            r3 = 11
            goto L_0x00c5
        L_0x0044:
            java.lang.String r4 = "scaleY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x004e
            goto L_0x00c5
        L_0x004e:
            r3 = 10
            goto L_0x00c5
        L_0x0052:
            java.lang.String r4 = "scaleX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x005c
            goto L_0x00c5
        L_0x005c:
            r3 = 9
            goto L_0x00c5
        L_0x0060:
            java.lang.String r4 = "pivotY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x006a
            goto L_0x00c5
        L_0x006a:
            r3 = 8
            goto L_0x00c5
        L_0x006e:
            java.lang.String r4 = "pivotX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0077
            goto L_0x00c5
        L_0x0077:
            r3 = 7
            goto L_0x00c5
        L_0x0079:
            java.lang.String r4 = "progress"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0082
            goto L_0x00c5
        L_0x0082:
            r3 = 6
            goto L_0x00c5
        L_0x0084:
            java.lang.String r4 = "translationZ"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x008d
            goto L_0x00c5
        L_0x008d:
            r3 = 5
            goto L_0x00c5
        L_0x008f:
            java.lang.String r4 = "translationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0098
            goto L_0x00c5
        L_0x0098:
            r3 = 4
            goto L_0x00c5
        L_0x009a:
            java.lang.String r4 = "translationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00a3
            goto L_0x00c5
        L_0x00a3:
            r3 = 3
            goto L_0x00c5
        L_0x00a5:
            java.lang.String r4 = "rotationZ"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00ae
            goto L_0x00c5
        L_0x00ae:
            r3 = 2
            goto L_0x00c5
        L_0x00b0:
            java.lang.String r4 = "rotationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00b9
            goto L_0x00c5
        L_0x00b9:
            r3 = 1
            goto L_0x00c5
        L_0x00bb:
            java.lang.String r4 = "rotationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00c4
            goto L_0x00c5
        L_0x00c4:
            r3 = 0
        L_0x00c5:
            r4 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            switch(r3) {
                case 0: goto L_0x01cc;
                case 1: goto L_0x01c0;
                case 2: goto L_0x01b0;
                case 3: goto L_0x01a4;
                case 4: goto L_0x0198;
                case 5: goto L_0x018c;
                case 6: goto L_0x0180;
                case 7: goto L_0x0174;
                case 8: goto L_0x0168;
                case 9: goto L_0x015c;
                case 10: goto L_0x0150;
                case 11: goto L_0x0140;
                case 12: goto L_0x0132;
                default: goto L_0x00cb;
            }
        L_0x00cb:
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            java.lang.String r4 = "MotionPaths"
            if (r3 == 0) goto L_0x0120
            java.lang.String r3 = ","
            java.lang.String[] r3 = r1.split(r3)
            r3 = r3[r5]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r5 = r7.mCustomVariable
            boolean r5 = r5.containsKey(r3)
            if (r5 == 0) goto L_0x0008
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r5 = r7.mCustomVariable
            java.lang.Object r3 = r5.get(r3)
            androidx.constraintlayout.core.motion.CustomVariable r3 = (androidx.constraintlayout.core.motion.CustomVariable) r3
            boolean r5 = r2 instanceof androidx.constraintlayout.core.motion.utils.SplineSet.CustomSpline
            if (r5 == 0) goto L_0x00f8
            androidx.constraintlayout.core.motion.utils.SplineSet$CustomSpline r2 = (androidx.constraintlayout.core.motion.utils.SplineSet.CustomSpline) r2
            r2.setPoint((int) r9, (androidx.constraintlayout.core.motion.CustomVariable) r3)
            goto L_0x0008
        L_0x00f8:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r1 = " ViewSpline not a CustomSet frame = "
            r5.append(r1)
            r5.append(r9)
            java.lang.String r1 = ", value"
            r5.append(r1)
            float r1 = r3.getValueToInterpolate()
            r5.append(r1)
            r5.append(r2)
            java.lang.String r1 = r5.toString()
        L_0x011b:
            androidx.constraintlayout.core.motion.utils.Utils.loge(r4, r1)
            goto L_0x0008
        L_0x0120:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UNKNOWN spline "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L_0x011b
        L_0x0132:
            float r1 = r7.mPathRotate
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x013c
            goto L_0x01bb
        L_0x013c:
            float r6 = r7.mPathRotate
            goto L_0x01bb
        L_0x0140:
            float r1 = r7.alpha
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0149
            goto L_0x014b
        L_0x0149:
            float r4 = r7.alpha
        L_0x014b:
            r2.setPoint(r9, r4)
            goto L_0x0008
        L_0x0150:
            float r1 = r7.scaleY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0159
            goto L_0x014b
        L_0x0159:
            float r4 = r7.scaleY
            goto L_0x014b
        L_0x015c:
            float r1 = r7.scaleX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0165
            goto L_0x014b
        L_0x0165:
            float r4 = r7.scaleX
            goto L_0x014b
        L_0x0168:
            float r1 = r7.mPivotY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0171
            goto L_0x01bb
        L_0x0171:
            float r6 = r7.mPivotY
            goto L_0x01bb
        L_0x0174:
            float r1 = r7.mPivotX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x017d
            goto L_0x01bb
        L_0x017d:
            float r6 = r7.mPivotX
            goto L_0x01bb
        L_0x0180:
            float r1 = r7.mProgress
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0189
            goto L_0x01bb
        L_0x0189:
            float r6 = r7.mProgress
            goto L_0x01bb
        L_0x018c:
            float r1 = r7.translationZ
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0195
            goto L_0x01bb
        L_0x0195:
            float r6 = r7.translationZ
            goto L_0x01bb
        L_0x0198:
            float r1 = r7.translationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01a1
            goto L_0x01bb
        L_0x01a1:
            float r6 = r7.translationY
            goto L_0x01bb
        L_0x01a4:
            float r1 = r7.translationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01ad
            goto L_0x01bb
        L_0x01ad:
            float r6 = r7.translationX
            goto L_0x01bb
        L_0x01b0:
            float r1 = r7.rotation
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01b9
            goto L_0x01bb
        L_0x01b9:
            float r6 = r7.rotation
        L_0x01bb:
            r2.setPoint(r9, r6)
            goto L_0x0008
        L_0x01c0:
            float r1 = r7.rotationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01c9
            goto L_0x01bb
        L_0x01c9:
            float r6 = r7.rotationY
            goto L_0x01bb
        L_0x01cc:
            float r1 = r7.rotationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01d5
            goto L_0x01bb
        L_0x01d5:
            float r6 = r7.rotationX
            goto L_0x01bb
        L_0x01d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.MotionConstrainedPoint.addValues(java.util.HashMap, int):void");
    }

    public void applyParameters(MotionWidget motionWidget) {
        this.visibility = motionWidget.getVisibility();
        this.alpha = motionWidget.getVisibility() != 4 ? 0.0f : motionWidget.getAlpha();
        this.applyElevation = false;
        this.rotation = motionWidget.getRotationZ();
        this.rotationX = motionWidget.getRotationX();
        this.rotationY = motionWidget.getRotationY();
        this.scaleX = motionWidget.getScaleX();
        this.scaleY = motionWidget.getScaleY();
        this.mPivotX = motionWidget.getPivotX();
        this.mPivotY = motionWidget.getPivotY();
        this.translationX = motionWidget.getTranslationX();
        this.translationY = motionWidget.getTranslationY();
        this.translationZ = motionWidget.getTranslationZ();
        for (String next : motionWidget.getCustomAttributeNames()) {
            CustomVariable customAttribute = motionWidget.getCustomAttribute(next);
            if (customAttribute != null && customAttribute.isContinuous()) {
                this.mCustomVariable.put(next, customAttribute);
            }
        }
    }

    public int compareTo(MotionConstrainedPoint motionConstrainedPoint) {
        return Float.compare(this.position, motionConstrainedPoint.position);
    }

    /* access modifiers changed from: package-private */
    public void different(MotionConstrainedPoint motionConstrainedPoint, HashSet<String> hashSet) {
        if (diff(this.alpha, motionConstrainedPoint.alpha)) {
            hashSet.add("alpha");
        }
        if (diff(this.elevation, motionConstrainedPoint.elevation)) {
            hashSet.add("translationZ");
        }
        int i = this.visibility;
        int i2 = motionConstrainedPoint.visibility;
        if (i != i2 && this.mVisibilityMode == 0 && (i == 4 || i2 == 4)) {
            hashSet.add("alpha");
        }
        if (diff(this.rotation, motionConstrainedPoint.rotation)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.mPathRotate) || !Float.isNaN(motionConstrainedPoint.mPathRotate)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.mProgress) || !Float.isNaN(motionConstrainedPoint.mProgress)) {
            hashSet.add("progress");
        }
        if (diff(this.rotationX, motionConstrainedPoint.rotationX)) {
            hashSet.add("rotationX");
        }
        if (diff(this.rotationY, motionConstrainedPoint.rotationY)) {
            hashSet.add("rotationY");
        }
        if (diff(this.mPivotX, motionConstrainedPoint.mPivotX)) {
            hashSet.add("pivotX");
        }
        if (diff(this.mPivotY, motionConstrainedPoint.mPivotY)) {
            hashSet.add("pivotY");
        }
        if (diff(this.scaleX, motionConstrainedPoint.scaleX)) {
            hashSet.add("scaleX");
        }
        if (diff(this.scaleY, motionConstrainedPoint.scaleY)) {
            hashSet.add("scaleY");
        }
        if (diff(this.translationX, motionConstrainedPoint.translationX)) {
            hashSet.add("translationX");
        }
        if (diff(this.translationY, motionConstrainedPoint.translationY)) {
            hashSet.add("translationY");
        }
        if (diff(this.translationZ, motionConstrainedPoint.translationZ)) {
            hashSet.add("translationZ");
        }
        if (diff(this.elevation, motionConstrainedPoint.elevation)) {
            hashSet.add("elevation");
        }
    }

    /* access modifiers changed from: package-private */
    public void different(MotionConstrainedPoint motionConstrainedPoint, boolean[] zArr, String[] strArr) {
        zArr[0] = zArr[0] | diff(this.position, motionConstrainedPoint.position);
        zArr[1] = zArr[1] | diff(this.f20x, motionConstrainedPoint.f20x);
        zArr[2] = zArr[2] | diff(this.f21y, motionConstrainedPoint.f21y);
        zArr[3] = zArr[3] | diff(this.width, motionConstrainedPoint.width);
        zArr[4] = diff(this.height, motionConstrainedPoint.height) | zArr[4];
    }

    /* access modifiers changed from: package-private */
    public void fillStandard(double[] dArr, int[] iArr) {
        float[] fArr = {this.position, this.f20x, this.f21y, this.width, this.height, this.alpha, this.elevation, this.rotation, this.rotationX, this.rotationY, this.scaleX, this.scaleY, this.mPivotX, this.mPivotY, this.translationX, this.translationY, this.translationZ, this.mPathRotate};
        int i = 0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] < 18) {
                dArr[i] = (double) fArr[iArr[i2]];
                i++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int getCustomData(String str, double[] dArr, int i) {
        CustomVariable customVariable = this.mCustomVariable.get(str);
        if (customVariable.numberOfInterpolatedValues() == 1) {
            dArr[i] = (double) customVariable.getValueToInterpolate();
            return 1;
        }
        int numberOfInterpolatedValues = customVariable.numberOfInterpolatedValues();
        float[] fArr = new float[numberOfInterpolatedValues];
        customVariable.getValuesToInterpolate(fArr);
        int i2 = 0;
        while (i2 < numberOfInterpolatedValues) {
            dArr[i] = (double) fArr[i2];
            i2++;
            i++;
        }
        return numberOfInterpolatedValues;
    }

    /* access modifiers changed from: package-private */
    public int getCustomDataCount(String str) {
        return this.mCustomVariable.get(str).numberOfInterpolatedValues();
    }

    /* access modifiers changed from: package-private */
    public boolean hasCustomData(String str) {
        return this.mCustomVariable.containsKey(str);
    }

    /* access modifiers changed from: package-private */
    public void setBounds(float f, float f2, float f3, float f4) {
        this.f20x = f;
        this.f21y = f2;
        this.width = f3;
        this.height = f4;
    }

    public void setState(MotionWidget motionWidget) {
        setBounds((float) motionWidget.getX(), (float) motionWidget.getY(), (float) motionWidget.getWidth(), (float) motionWidget.getHeight());
        applyParameters(motionWidget);
    }

    public void setState(Rect rect, MotionWidget motionWidget, int i, float f) {
        float f2;
        setBounds((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
        applyParameters(motionWidget);
        this.mPivotX = Float.NaN;
        this.mPivotY = Float.NaN;
        if (i == 1) {
            f2 = f - 90.0f;
        } else if (i == 2) {
            f2 = f + 90.0f;
        } else {
            return;
        }
        this.rotation = f2;
    }
}
