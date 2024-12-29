package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
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
    LinkedHashMap<String, ConstraintAttribute> attributes = new LinkedHashMap<>();
    private float elevation = 0.0f;
    private float height;
    private int mAnimateRelativeTo = -1;
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
    private float f65x;

    /* renamed from: y */
    private float f66y;

    private boolean diff(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x013f, code lost:
        r2.setPoint(r9, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x015b, code lost:
        r2.setPoint(r9, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r8, int r9) {
        /*
            r7 = this;
            java.util.Set r0 = r8.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01e6
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r8.get(r1)
            androidx.constraintlayout.motion.utils.ViewSpline r2 = (androidx.constraintlayout.motion.utils.ViewSpline) r2
            r1.hashCode()
            r3 = -1
            int r4 = r1.hashCode()
            r5 = 1
            switch(r4) {
                case -1249320806: goto L_0x00c9;
                case -1249320805: goto L_0x00be;
                case -1225497657: goto L_0x00b3;
                case -1225497656: goto L_0x00a8;
                case -1225497655: goto L_0x009d;
                case -1001078227: goto L_0x0092;
                case -908189618: goto L_0x0087;
                case -908189617: goto L_0x007c;
                case -760884510: goto L_0x006e;
                case -760884509: goto L_0x0060;
                case -40300674: goto L_0x0052;
                case -4379043: goto L_0x0044;
                case 37232917: goto L_0x0036;
                case 92909918: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x00d3
        L_0x0028:
            java.lang.String r4 = "alpha"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0032
            goto L_0x00d3
        L_0x0032:
            r3 = 13
            goto L_0x00d3
        L_0x0036:
            java.lang.String r4 = "transitionPathRotate"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0040
            goto L_0x00d3
        L_0x0040:
            r3 = 12
            goto L_0x00d3
        L_0x0044:
            java.lang.String r4 = "elevation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x004e
            goto L_0x00d3
        L_0x004e:
            r3 = 11
            goto L_0x00d3
        L_0x0052:
            java.lang.String r4 = "rotation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x005c
            goto L_0x00d3
        L_0x005c:
            r3 = 10
            goto L_0x00d3
        L_0x0060:
            java.lang.String r4 = "transformPivotY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x006a
            goto L_0x00d3
        L_0x006a:
            r3 = 9
            goto L_0x00d3
        L_0x006e:
            java.lang.String r4 = "transformPivotX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0078
            goto L_0x00d3
        L_0x0078:
            r3 = 8
            goto L_0x00d3
        L_0x007c:
            java.lang.String r4 = "scaleY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0085
            goto L_0x00d3
        L_0x0085:
            r3 = 7
            goto L_0x00d3
        L_0x0087:
            java.lang.String r4 = "scaleX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0090
            goto L_0x00d3
        L_0x0090:
            r3 = 6
            goto L_0x00d3
        L_0x0092:
            java.lang.String r4 = "progress"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x009b
            goto L_0x00d3
        L_0x009b:
            r3 = 5
            goto L_0x00d3
        L_0x009d:
            java.lang.String r4 = "translationZ"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00a6
            goto L_0x00d3
        L_0x00a6:
            r3 = 4
            goto L_0x00d3
        L_0x00a8:
            java.lang.String r4 = "translationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00b1
            goto L_0x00d3
        L_0x00b1:
            r3 = 3
            goto L_0x00d3
        L_0x00b3:
            java.lang.String r4 = "translationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00bc
            goto L_0x00d3
        L_0x00bc:
            r3 = 2
            goto L_0x00d3
        L_0x00be:
            java.lang.String r4 = "rotationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00c7
            goto L_0x00d3
        L_0x00c7:
            r3 = 1
            goto L_0x00d3
        L_0x00c9:
            java.lang.String r4 = "rotationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00d2
            goto L_0x00d3
        L_0x00d2:
            r3 = 0
        L_0x00d3:
            r4 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            switch(r3) {
                case 0: goto L_0x01d8;
                case 1: goto L_0x01cc;
                case 2: goto L_0x01c0;
                case 3: goto L_0x01b4;
                case 4: goto L_0x01a8;
                case 5: goto L_0x019c;
                case 6: goto L_0x0190;
                case 7: goto L_0x0184;
                case 8: goto L_0x0178;
                case 9: goto L_0x016c;
                case 10: goto L_0x0160;
                case 11: goto L_0x0150;
                case 12: goto L_0x0144;
                case 13: goto L_0x0134;
                default: goto L_0x00d9;
            }
        L_0x00d9:
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L_0x0125
            java.lang.String r3 = ","
            java.lang.String[] r3 = r1.split(r3)
            r3 = r3[r5]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r4 = r7.attributes
            boolean r4 = r4.containsKey(r3)
            if (r4 == 0) goto L_0x0008
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r4 = r7.attributes
            java.lang.Object r3 = r4.get(r3)
            androidx.constraintlayout.widget.ConstraintAttribute r3 = (androidx.constraintlayout.widget.ConstraintAttribute) r3
            boolean r4 = r2 instanceof androidx.constraintlayout.motion.utils.ViewSpline.CustomSet
            if (r4 == 0) goto L_0x0104
            androidx.constraintlayout.motion.utils.ViewSpline$CustomSet r2 = (androidx.constraintlayout.motion.utils.ViewSpline.CustomSet) r2
            r2.setPoint((int) r9, (androidx.constraintlayout.widget.ConstraintAttribute) r3)
            goto L_0x0008
        L_0x0104:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = " ViewSpline not a CustomSet frame = "
            r4.append(r1)
            r4.append(r9)
            java.lang.String r1 = ", value"
            r4.append(r1)
            float r1 = r3.getValueToInterpolate()
            r4.append(r1)
            r4.append(r2)
            goto L_0x0008
        L_0x0125:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UNKNOWN spline "
            r2.append(r3)
            r2.append(r1)
            goto L_0x0008
        L_0x0134:
            float r1 = r7.alpha
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x013d
            goto L_0x013f
        L_0x013d:
            float r4 = r7.alpha
        L_0x013f:
            r2.setPoint(r9, r4)
            goto L_0x0008
        L_0x0144:
            float r1 = r7.mPathRotate
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x014d
            goto L_0x015b
        L_0x014d:
            float r6 = r7.mPathRotate
            goto L_0x015b
        L_0x0150:
            float r1 = r7.elevation
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0159
            goto L_0x015b
        L_0x0159:
            float r6 = r7.elevation
        L_0x015b:
            r2.setPoint(r9, r6)
            goto L_0x0008
        L_0x0160:
            float r1 = r7.rotation
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0169
            goto L_0x015b
        L_0x0169:
            float r6 = r7.rotation
            goto L_0x015b
        L_0x016c:
            float r1 = r7.mPivotY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0175
            goto L_0x015b
        L_0x0175:
            float r6 = r7.mPivotY
            goto L_0x015b
        L_0x0178:
            float r1 = r7.mPivotX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0181
            goto L_0x015b
        L_0x0181:
            float r6 = r7.mPivotX
            goto L_0x015b
        L_0x0184:
            float r1 = r7.scaleY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x018d
            goto L_0x013f
        L_0x018d:
            float r4 = r7.scaleY
            goto L_0x013f
        L_0x0190:
            float r1 = r7.scaleX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0199
            goto L_0x013f
        L_0x0199:
            float r4 = r7.scaleX
            goto L_0x013f
        L_0x019c:
            float r1 = r7.mProgress
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01a5
            goto L_0x015b
        L_0x01a5:
            float r6 = r7.mProgress
            goto L_0x015b
        L_0x01a8:
            float r1 = r7.translationZ
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01b1
            goto L_0x015b
        L_0x01b1:
            float r6 = r7.translationZ
            goto L_0x015b
        L_0x01b4:
            float r1 = r7.translationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01bd
            goto L_0x015b
        L_0x01bd:
            float r6 = r7.translationY
            goto L_0x015b
        L_0x01c0:
            float r1 = r7.translationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01c9
            goto L_0x015b
        L_0x01c9:
            float r6 = r7.translationX
            goto L_0x015b
        L_0x01cc:
            float r1 = r7.rotationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01d5
            goto L_0x015b
        L_0x01d5:
            float r6 = r7.rotationY
            goto L_0x015b
        L_0x01d8:
            float r1 = r7.rotationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01e2
            goto L_0x015b
        L_0x01e2:
            float r6 = r7.rotationX
            goto L_0x015b
        L_0x01e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionConstrainedPoint.addValues(java.util.HashMap, int):void");
    }

    public void applyParameters(View view) {
        this.visibility = view.getVisibility();
        this.alpha = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.applyElevation = false;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            this.elevation = view.getElevation();
        }
        this.rotation = view.getRotation();
        this.rotationX = view.getRotationX();
        this.rotationY = view.getRotationY();
        this.scaleX = view.getScaleX();
        this.scaleY = view.getScaleY();
        this.mPivotX = view.getPivotX();
        this.mPivotY = view.getPivotY();
        this.translationX = view.getTranslationX();
        this.translationY = view.getTranslationY();
        if (i >= 21) {
            this.translationZ = view.getTranslationZ();
        }
    }

    public void applyParameters(ConstraintSet.Constraint constraint) {
        ConstraintSet.PropertySet propertySet = constraint.propertySet;
        int i = propertySet.mVisibilityMode;
        this.mVisibilityMode = i;
        int i2 = propertySet.visibility;
        this.visibility = i2;
        this.alpha = (i2 == 0 || i != 0) ? propertySet.alpha : 0.0f;
        ConstraintSet.Transform transform = constraint.transform;
        this.applyElevation = transform.applyElevation;
        this.elevation = transform.elevation;
        this.rotation = transform.rotation;
        this.rotationX = transform.rotationX;
        this.rotationY = transform.rotationY;
        this.scaleX = transform.scaleX;
        this.scaleY = transform.scaleY;
        this.mPivotX = transform.transformPivotX;
        this.mPivotY = transform.transformPivotY;
        this.translationX = transform.translationX;
        this.translationY = transform.translationY;
        this.translationZ = transform.translationZ;
        this.mKeyFrameEasing = Easing.getInterpolator(constraint.motion.mTransitionEasing);
        ConstraintSet.Motion motion = constraint.motion;
        this.mPathRotate = motion.mPathRotate;
        this.mDrawPath = motion.mDrawPath;
        this.mAnimateRelativeTo = motion.mAnimateRelativeTo;
        this.mProgress = constraint.propertySet.mProgress;
        for (String next : constraint.mCustomConstraints.keySet()) {
            ConstraintAttribute constraintAttribute = constraint.mCustomConstraints.get(next);
            if (constraintAttribute.isContinuous()) {
                this.attributes.put(next, constraintAttribute);
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
            hashSet.add("elevation");
        }
        int i = this.visibility;
        int i2 = motionConstrainedPoint.visibility;
        if (i != i2 && this.mVisibilityMode == 0 && (i == 0 || i2 == 0)) {
            hashSet.add("alpha");
        }
        if (diff(this.rotation, motionConstrainedPoint.rotation)) {
            hashSet.add(Key.ROTATION);
        }
        if (!Float.isNaN(this.mPathRotate) || !Float.isNaN(motionConstrainedPoint.mPathRotate)) {
            hashSet.add("transitionPathRotate");
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
            hashSet.add(Key.PIVOT_X);
        }
        if (diff(this.mPivotY, motionConstrainedPoint.mPivotY)) {
            hashSet.add(Key.PIVOT_Y);
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
    }

    /* access modifiers changed from: package-private */
    public void different(MotionConstrainedPoint motionConstrainedPoint, boolean[] zArr, String[] strArr) {
        zArr[0] = zArr[0] | diff(this.position, motionConstrainedPoint.position);
        zArr[1] = zArr[1] | diff(this.f65x, motionConstrainedPoint.f65x);
        zArr[2] = zArr[2] | diff(this.f66y, motionConstrainedPoint.f66y);
        zArr[3] = zArr[3] | diff(this.width, motionConstrainedPoint.width);
        zArr[4] = diff(this.height, motionConstrainedPoint.height) | zArr[4];
    }

    /* access modifiers changed from: package-private */
    public void fillStandard(double[] dArr, int[] iArr) {
        float[] fArr = {this.position, this.f65x, this.f66y, this.width, this.height, this.alpha, this.elevation, this.rotation, this.rotationX, this.rotationY, this.scaleX, this.scaleY, this.mPivotX, this.mPivotY, this.translationX, this.translationY, this.translationZ, this.mPathRotate};
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
        ConstraintAttribute constraintAttribute = this.attributes.get(str);
        if (constraintAttribute.numberOfInterpolatedValues() == 1) {
            dArr[i] = (double) constraintAttribute.getValueToInterpolate();
            return 1;
        }
        int numberOfInterpolatedValues = constraintAttribute.numberOfInterpolatedValues();
        float[] fArr = new float[numberOfInterpolatedValues];
        constraintAttribute.getValuesToInterpolate(fArr);
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
        return this.attributes.get(str).numberOfInterpolatedValues();
    }

    /* access modifiers changed from: package-private */
    public boolean hasCustomData(String str) {
        return this.attributes.containsKey(str);
    }

    /* access modifiers changed from: package-private */
    public void setBounds(float f, float f2, float f3, float f4) {
        this.f65x = f;
        this.f66y = f2;
        this.width = f3;
        this.height = f4;
    }

    public void setState(Rect rect, View view, int i, float f) {
        float f2;
        setBounds((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
        applyParameters(view);
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

    public void setState(Rect rect, ConstraintSet constraintSet, int i, int i2) {
        float f;
        setBounds((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
        applyParameters(constraintSet.getParameters(i2));
        float f2 = 90.0f;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            f = this.rotation + 90.0f;
            this.rotation = f;
            if (f > 180.0f) {
                f2 = 360.0f;
                this.rotation = f - f2;
            }
            return;
        }
        f = this.rotation;
        this.rotation = f - f2;
    }

    public void setState(View view) {
        setBounds(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        applyParameters(view);
    }
}
