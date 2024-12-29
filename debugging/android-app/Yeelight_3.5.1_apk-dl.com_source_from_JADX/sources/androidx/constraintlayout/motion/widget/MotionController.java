package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.VelocityMatrix;
import androidx.constraintlayout.motion.utils.ViewOscillator;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.motion.utils.ViewState;
import androidx.constraintlayout.motion.utils.ViewTimeCycle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class MotionController {
    static final int BOUNCE = 4;
    private static final boolean DEBUG = false;
    public static final int DRAW_PATH_AS_CONFIGURED = 4;
    public static final int DRAW_PATH_BASIC = 1;
    public static final int DRAW_PATH_CARTESIAN = 3;
    public static final int DRAW_PATH_NONE = 0;
    public static final int DRAW_PATH_RECTANGLE = 5;
    public static final int DRAW_PATH_RELATIVE = 2;
    public static final int DRAW_PATH_SCREEN = 6;
    static final int EASE_IN = 1;
    static final int EASE_IN_OUT = 0;
    static final int EASE_OUT = 2;
    private static final boolean FAVOR_FIXED_SIZE_VIEWS = false;
    public static final int HORIZONTAL_PATH_X = 2;
    public static final int HORIZONTAL_PATH_Y = 3;
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    private static final int INTERPOLATOR_UNDEFINED = -3;
    static final int LINEAR = 3;
    static final int OVERSHOOT = 5;
    public static final int PATH_PERCENT = 0;
    public static final int PATH_PERPENDICULAR = 1;
    public static final int ROTATION_LEFT = 2;
    public static final int ROTATION_RIGHT = 1;
    private static final int SPLINE_STRING = -1;
    private static final String TAG = "MotionController";
    public static final int VERTICAL_PATH_X = 4;
    public static final int VERTICAL_PATH_Y = 5;
    private int MAX_DIMENSION = 4;
    String[] attributeTable;
    private CurveFit mArcSpline;
    private int[] mAttributeInterpolatorCount;
    private String[] mAttributeNames;
    private HashMap<String, ViewSpline> mAttributesMap;
    String mConstraintTag;
    float mCurrentCenterX;
    float mCurrentCenterY;
    private int mCurveFitType = -1;
    private HashMap<String, ViewOscillator> mCycleMap;
    private MotionPaths mEndMotionPath = new MotionPaths();
    private MotionConstrainedPoint mEndPoint = new MotionConstrainedPoint();
    boolean mForceMeasure = false;
    int mId;
    private double[] mInterpolateData;
    private int[] mInterpolateVariables;
    private double[] mInterpolateVelocity;
    private ArrayList<Key> mKeyList = new ArrayList<>();
    private KeyTrigger[] mKeyTriggers;
    private ArrayList<MotionPaths> mMotionPaths = new ArrayList<>();
    float mMotionStagger = Float.NaN;
    private boolean mNoMovement;
    private int mPathMotionArc;
    private Interpolator mQuantizeMotionInterpolator;
    private float mQuantizeMotionPhase;
    private int mQuantizeMotionSteps;
    private CurveFit[] mSpline;
    float mStaggerOffset = 0.0f;
    float mStaggerScale = 1.0f;
    private MotionPaths mStartMotionPath = new MotionPaths();
    private MotionConstrainedPoint mStartPoint = new MotionConstrainedPoint();
    Rect mTempRect = new Rect();
    private HashMap<String, ViewTimeCycle> mTimeCycleAttributesMap;
    private int mTransformPivotTarget;
    private View mTransformPivotView;
    private float[] mValuesBuff = new float[4];
    private float[] mVelocity = new float[1];
    View mView;

    MotionController(View view) {
        int i = Key.UNSET;
        this.mPathMotionArc = i;
        this.mTransformPivotTarget = i;
        this.mTransformPivotView = null;
        this.mQuantizeMotionSteps = i;
        this.mQuantizeMotionPhase = Float.NaN;
        this.mQuantizeMotionInterpolator = null;
        this.mNoMovement = false;
        setView(view);
    }

    private float getAdjustedPosition(float f, float[] fArr) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f4 = this.mStaggerScale;
            if (((double) f4) != 1.0d) {
                float f5 = this.mStaggerOffset;
                if (f < f5) {
                    f = 0.0f;
                }
                if (f > f5 && ((double) f) < 1.0d) {
                    f = Math.min((f - f5) * f4, 1.0f);
                }
            }
        }
        Easing easing = this.mStartMotionPath.mKeyFrameEasing;
        float f6 = Float.NaN;
        Iterator<MotionPaths> it = this.mMotionPaths.iterator();
        while (it.hasNext()) {
            MotionPaths next = it.next();
            Easing easing2 = next.mKeyFrameEasing;
            if (easing2 != null) {
                float f7 = next.time;
                if (f7 < f) {
                    easing = easing2;
                    f2 = f7;
                } else if (Float.isNaN(f6)) {
                    f6 = next.time;
                }
            }
        }
        if (easing != null) {
            if (!Float.isNaN(f6)) {
                f3 = f6;
            }
            float f8 = f3 - f2;
            double d = (double) ((f - f2) / f8);
            f = (((float) easing.get(d)) * f8) + f2;
            if (fArr != null) {
                fArr[0] = (float) easing.getDiff(d);
            }
        }
        return f;
    }

    private static Interpolator getInterpolator(Context context, int i, String str, int i2) {
        if (i == -2) {
            return AnimationUtils.loadInterpolator(context, i2);
        }
        if (i == -1) {
            final Easing interpolator = Easing.getInterpolator(str);
            return new Interpolator() {
                public float getInterpolation(float f) {
                    return (float) Easing.this.get((double) f);
                }
            };
        } else if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        } else {
            if (i == 1) {
                return new AccelerateInterpolator();
            }
            if (i == 2) {
                return new DecelerateInterpolator();
            }
            if (i == 4) {
                return new BounceInterpolator();
            }
            if (i != 5) {
                return null;
            }
            return new OvershootInterpolator();
        }
    }

    private float getPreCycleDistance() {
        char c;
        float f;
        float[] fArr = new float[2];
        float f2 = 1.0f / ((float) 99);
        double d = 0.0d;
        double d2 = 0.0d;
        float f3 = 0.0f;
        int i = 0;
        while (i < 100) {
            float f4 = ((float) i) * f2;
            double d3 = (double) f4;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            float f5 = Float.NaN;
            float f6 = 0.0f;
            while (it.hasNext()) {
                MotionPaths next = it.next();
                Easing easing2 = next.mKeyFrameEasing;
                if (easing2 != null) {
                    float f7 = next.time;
                    if (f7 < f4) {
                        easing = easing2;
                        f6 = f7;
                    } else if (Float.isNaN(f5)) {
                        f5 = next.time;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f5)) {
                    f5 = 1.0f;
                }
                float f8 = f5 - f6;
                d3 = (double) ((((float) easing.get((double) ((f4 - f6) / f8))) * f8) + f6);
            }
            this.mSpline[0].getPos(d3, this.mInterpolateData);
            float f9 = f3;
            int i2 = i;
            this.mStartMotionPath.getCenter(d3, this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
            if (i2 > 0) {
                double d4 = (double) f9;
                double d5 = (double) fArr[1];
                Double.isNaN(d5);
                c = 0;
                double d6 = (double) fArr[0];
                Double.isNaN(d6);
                double hypot = Math.hypot(d2 - d5, d - d6);
                Double.isNaN(d4);
                f = (float) (d4 + hypot);
            } else {
                c = 0;
                f = f9;
            }
            d = (double) fArr[c];
            i = i2 + 1;
            f3 = f;
            d2 = (double) fArr[1];
        }
        return f3;
    }

    private void insertKey(MotionPaths motionPaths) {
        int binarySearch = Collections.binarySearch(this.mMotionPaths, motionPaths);
        if (binarySearch == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(" KeyPath position \"");
            sb.append(motionPaths.position);
            sb.append("\" outside of range");
        }
        this.mMotionPaths.add((-binarySearch) - 1, motionPaths);
    }

    private void readView(MotionPaths motionPaths) {
        motionPaths.setBounds((float) ((int) this.mView.getX()), (float) ((int) this.mView.getY()), (float) this.mView.getWidth(), (float) this.mView.getHeight());
    }

    public void addKey(Key key) {
        this.mKeyList.add(key);
    }

    /* access modifiers changed from: package-private */
    public void addKeys(ArrayList<Key> arrayList) {
        this.mKeyList.addAll(arrayList);
    }

    /* access modifiers changed from: package-private */
    public void buildBounds(float[] fArr, int i) {
        int i2 = i;
        float f = 1.0f / ((float) (i2 - 1));
        HashMap<String, ViewSpline> hashMap = this.mAttributesMap;
        if (hashMap != null) {
            SplineSet splineSet = hashMap.get("translationX");
        }
        HashMap<String, ViewSpline> hashMap2 = this.mAttributesMap;
        if (hashMap2 != null) {
            SplineSet splineSet2 = hashMap2.get("translationY");
        }
        HashMap<String, ViewOscillator> hashMap3 = this.mCycleMap;
        if (hashMap3 != null) {
            ViewOscillator viewOscillator = hashMap3.get("translationX");
        }
        HashMap<String, ViewOscillator> hashMap4 = this.mCycleMap;
        if (hashMap4 != null) {
            ViewOscillator viewOscillator2 = hashMap4.get("translationY");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            float f2 = ((float) i3) * f;
            float f3 = this.mStaggerScale;
            float f4 = 0.0f;
            if (f3 != 1.0f) {
                float f5 = this.mStaggerOffset;
                if (f2 < f5) {
                    f2 = 0.0f;
                }
                if (f2 > f5 && ((double) f2) < 1.0d) {
                    f2 = Math.min((f2 - f5) * f3, 1.0f);
                }
            }
            double d = (double) f2;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            float f6 = Float.NaN;
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            while (it.hasNext()) {
                MotionPaths next = it.next();
                Easing easing2 = next.mKeyFrameEasing;
                if (easing2 != null) {
                    float f7 = next.time;
                    if (f7 < f2) {
                        easing = easing2;
                        f4 = f7;
                    } else if (Float.isNaN(f6)) {
                        f6 = next.time;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f6)) {
                    f6 = 1.0f;
                }
                float f8 = f6 - f4;
                d = (double) ((((float) easing.get((double) ((f2 - f4) / f8))) * f8) + f4);
            }
            this.mSpline[0].getPos(d, this.mInterpolateData);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d, dArr);
                }
            }
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, fArr, i3 * 2);
        }
    }

    /* access modifiers changed from: package-private */
    public int buildKeyBounds(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.mSpline[0].getTimePoints();
        if (iArr != null) {
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().mMode;
                i++;
            }
        }
        int i2 = 0;
        for (double pos : timePoints) {
            this.mSpline[0].getPos(pos, this.mInterpolateData);
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    /* access modifiers changed from: package-private */
    public int buildKeyFrames(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.mSpline[0].getTimePoints();
        if (iArr != null) {
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().mMode;
                i++;
            }
        }
        int i2 = 0;
        for (int i3 = 0; i3 < timePoints.length; i3++) {
            this.mSpline[0].getPos(timePoints[i3], this.mInterpolateData);
            this.mStartMotionPath.getCenter(timePoints[i3], this.mInterpolateVariables, this.mInterpolateData, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    /* access modifiers changed from: package-private */
    public void buildPath(float[] fArr, int i) {
        double d;
        int i2 = i;
        float f = 1.0f;
        float f2 = 1.0f / ((float) (i2 - 1));
        HashMap<String, ViewSpline> hashMap = this.mAttributesMap;
        ViewOscillator viewOscillator = null;
        SplineSet splineSet = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, ViewSpline> hashMap2 = this.mAttributesMap;
        SplineSet splineSet2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, ViewOscillator> hashMap3 = this.mCycleMap;
        ViewOscillator viewOscillator2 = hashMap3 == null ? null : hashMap3.get("translationX");
        HashMap<String, ViewOscillator> hashMap4 = this.mCycleMap;
        if (hashMap4 != null) {
            viewOscillator = hashMap4.get("translationY");
        }
        ViewOscillator viewOscillator3 = viewOscillator;
        int i3 = 0;
        while (i3 < i2) {
            float f3 = ((float) i3) * f2;
            float f4 = this.mStaggerScale;
            if (f4 != f) {
                float f5 = this.mStaggerOffset;
                if (f3 < f5) {
                    f3 = 0.0f;
                }
                if (f3 > f5 && ((double) f3) < 1.0d) {
                    f3 = Math.min((f3 - f5) * f4, f);
                }
            }
            float f6 = f3;
            double d2 = (double) f6;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            float f7 = Float.NaN;
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            float f8 = 0.0f;
            while (it.hasNext()) {
                MotionPaths next = it.next();
                Easing easing2 = next.mKeyFrameEasing;
                double d3 = d2;
                if (easing2 != null) {
                    float f9 = next.time;
                    if (f9 < f6) {
                        f8 = f9;
                        easing = easing2;
                    } else if (Float.isNaN(f7)) {
                        f7 = next.time;
                    }
                }
                d2 = d3;
            }
            double d4 = d2;
            if (easing != null) {
                if (Float.isNaN(f7)) {
                    f7 = 1.0f;
                }
                float f10 = f7 - f8;
                d = (double) ((((float) easing.get((double) ((f6 - f8) / f10))) * f10) + f8);
            } else {
                d = d4;
            }
            this.mSpline[0].getPos(d, this.mInterpolateData);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d, dArr);
                }
            }
            int i4 = i3 * 2;
            float f11 = f6;
            int i5 = i3;
            this.mStartMotionPath.getCenter(d, this.mInterpolateVariables, this.mInterpolateData, fArr, i4);
            if (viewOscillator2 != null) {
                fArr[i4] = fArr[i4] + viewOscillator2.get(f11);
            } else if (splineSet != null) {
                fArr[i4] = fArr[i4] + splineSet.get(f11);
            }
            if (viewOscillator3 != null) {
                int i6 = i4 + 1;
                fArr[i6] = fArr[i6] + viewOscillator3.get(f11);
            } else if (splineSet2 != null) {
                int i7 = i4 + 1;
                fArr[i7] = fArr[i7] + splineSet2.get(f11);
            }
            i3 = i5 + 1;
            f = 1.0f;
        }
    }

    /* access modifiers changed from: package-private */
    public void buildRect(float f, float[] fArr, int i) {
        this.mSpline[0].getPos((double) getAdjustedPosition(f, (float[]) null), this.mInterpolateData);
        this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i);
    }

    /* access modifiers changed from: package-private */
    public void buildRectangles(float[] fArr, int i) {
        float f = 1.0f / ((float) (i - 1));
        for (int i2 = 0; i2 < i; i2++) {
            this.mSpline[0].getPos((double) getAdjustedPosition(((float) i2) * f, (float[]) null), this.mInterpolateData);
            this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i2 * 8);
        }
    }

    /* access modifiers changed from: package-private */
    public void endTrigger(boolean z) {
        if ("button".equals(Debug.getName(this.mView)) && this.mKeyTriggers != null) {
            int i = 0;
            while (true) {
                KeyTrigger[] keyTriggerArr = this.mKeyTriggers;
                if (i < keyTriggerArr.length) {
                    keyTriggerArr[i].conditionallyFire(z ? -100.0f : 100.0f, this.mView);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public int getAnimateRelativeTo() {
        return this.mStartMotionPath.mAnimateRelativeTo;
    }

    /* access modifiers changed from: package-private */
    public int getAttributeValues(String str, float[] fArr, int i) {
        SplineSet splineSet = this.mAttributesMap.get(str);
        if (splineSet == null) {
            return -1;
        }
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr[i2] = splineSet.get((float) (i2 / (fArr.length - 1)));
        }
        return fArr.length;
    }

    public void getCenter(double d, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.mSpline[0].getPos(d, dArr);
        this.mSpline[0].getSlope(d, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.mStartMotionPath.getCenter(d, this.mInterpolateVariables, dArr, fArr, dArr2, fArr2);
    }

    public float getCenterX() {
        return this.mCurrentCenterX;
    }

    public float getCenterY() {
        return this.mCurrentCenterY;
    }

    /* access modifiers changed from: package-private */
    public void getDpDt(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float adjustedPosition = getAdjustedPosition(f, this.mVelocity);
        CurveFit[] curveFitArr = this.mSpline;
        int i = 0;
        if (curveFitArr != null) {
            double d = (double) adjustedPosition;
            curveFitArr[0].getSlope(d, this.mInterpolateVelocity);
            this.mSpline[0].getPos(d, this.mInterpolateData);
            float f4 = this.mVelocity[0];
            while (true) {
                dArr = this.mInterpolateVelocity;
                if (i >= dArr.length) {
                    break;
                }
                double d2 = dArr[i];
                double d3 = (double) f4;
                Double.isNaN(d3);
                dArr[i] = d2 * d3;
                i++;
            }
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr2 = this.mInterpolateData;
                if (dArr2.length > 0) {
                    curveFit.getPos(d, dArr2);
                    this.mArcSpline.getSlope(d, this.mInterpolateVelocity);
                    this.mStartMotionPath.setDpDt(f2, f3, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
                    return;
                }
                return;
            }
            this.mStartMotionPath.setDpDt(f2, f3, fArr, this.mInterpolateVariables, dArr, this.mInterpolateData);
            return;
        }
        MotionPaths motionPaths = this.mEndMotionPath;
        float f5 = motionPaths.f69x;
        MotionPaths motionPaths2 = this.mStartMotionPath;
        float f6 = f5 - motionPaths2.f69x;
        float f7 = motionPaths.f70y - motionPaths2.f70y;
        float f8 = (motionPaths.width - motionPaths2.width) + f6;
        float f9 = (motionPaths.height - motionPaths2.height) + f7;
        fArr[0] = (f6 * (1.0f - f2)) + (f8 * f2);
        fArr[1] = (f7 * (1.0f - f3)) + (f9 * f3);
    }

    public int getDrawPath() {
        int i = this.mStartMotionPath.mDrawPath;
        Iterator<MotionPaths> it = this.mMotionPaths.iterator();
        while (it.hasNext()) {
            i = Math.max(i, it.next().mDrawPath);
        }
        return Math.max(i, this.mEndMotionPath.mDrawPath);
    }

    public float getFinalHeight() {
        return this.mEndMotionPath.height;
    }

    public float getFinalWidth() {
        return this.mEndMotionPath.width;
    }

    public float getFinalX() {
        return this.mEndMotionPath.f69x;
    }

    public float getFinalY() {
        return this.mEndMotionPath.f70y;
    }

    /* access modifiers changed from: package-private */
    public MotionPaths getKeyFrame(int i) {
        return this.mMotionPaths.get(i);
    }

    public int getKeyFrameInfo(int i, int[] iArr) {
        int i2 = i;
        float[] fArr = new float[2];
        Iterator<Key> it = this.mKeyList.iterator();
        int i3 = 0;
        int i4 = 0;
        while (it.hasNext()) {
            Key next = it.next();
            int i5 = next.mType;
            if (i5 == i2 || i2 != -1) {
                iArr[i4] = 0;
                int i6 = i4 + 1;
                iArr[i6] = i5;
                int i7 = i6 + 1;
                int i8 = next.mFramePosition;
                iArr[i7] = i8;
                double d = (double) (((float) i8) / 100.0f);
                this.mSpline[0].getPos(d, this.mInterpolateData);
                this.mStartMotionPath.getCenter(d, this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
                int i9 = i7 + 1;
                iArr[i9] = Float.floatToIntBits(fArr[0]);
                int i10 = i9 + 1;
                iArr[i10] = Float.floatToIntBits(fArr[1]);
                if (next instanceof KeyPosition) {
                    KeyPosition keyPosition = (KeyPosition) next;
                    int i11 = i10 + 1;
                    iArr[i11] = keyPosition.mPositionType;
                    int i12 = i11 + 1;
                    iArr[i12] = Float.floatToIntBits(keyPosition.mPercentX);
                    i10 = i12 + 1;
                    iArr[i10] = Float.floatToIntBits(keyPosition.mPercentY);
                }
                int i13 = i10 + 1;
                iArr[i4] = i13 - i4;
                i3++;
                i4 = i13;
            }
        }
        return i3;
    }

    /* access modifiers changed from: package-private */
    public float getKeyFrameParameter(int i, float f, float f2) {
        MotionPaths motionPaths = this.mEndMotionPath;
        float f3 = motionPaths.f69x;
        MotionPaths motionPaths2 = this.mStartMotionPath;
        float f4 = motionPaths2.f69x;
        float f5 = f3 - f4;
        float f6 = motionPaths.f70y;
        float f7 = motionPaths2.f70y;
        float f8 = f6 - f7;
        float f9 = f4 + (motionPaths2.width / 2.0f);
        float f10 = f7 + (motionPaths2.height / 2.0f);
        float hypot = (float) Math.hypot((double) f5, (double) f8);
        if (((double) hypot) < 1.0E-7d) {
            return Float.NaN;
        }
        float f11 = f - f9;
        float f12 = f2 - f10;
        if (((float) Math.hypot((double) f11, (double) f12)) == 0.0f) {
            return 0.0f;
        }
        float f13 = (f11 * f5) + (f12 * f8);
        if (i == 0) {
            return f13 / hypot;
        }
        if (i == 1) {
            return (float) Math.sqrt((double) ((hypot * hypot) - (f13 * f13)));
        }
        if (i == 2) {
            return f11 / f5;
        }
        if (i == 3) {
            return f12 / f5;
        }
        if (i == 4) {
            return f11 / f8;
        }
        if (i != 5) {
            return 0.0f;
        }
        return f12 / f8;
    }

    public int getKeyFramePositions(int[] iArr, float[] fArr) {
        Iterator<Key> it = this.mKeyList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            Key next = it.next();
            int i3 = next.mFramePosition;
            iArr[i] = (next.mType * 1000) + i3;
            double d = (double) (((float) i3) / 100.0f);
            this.mSpline[0].getPos(d, this.mInterpolateData);
            this.mStartMotionPath.getCenter(d, this.mInterpolateVariables, this.mInterpolateData, fArr, i2);
            i2 += 2;
            i++;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public double[] getPos(double d) {
        this.mSpline[0].getPos(d, this.mInterpolateData);
        CurveFit curveFit = this.mArcSpline;
        if (curveFit != null) {
            double[] dArr = this.mInterpolateData;
            if (dArr.length > 0) {
                curveFit.getPos(d, dArr);
            }
        }
        return this.mInterpolateData;
    }

    /* access modifiers changed from: package-private */
    public KeyPositionBase getPositionKeyframe(int i, int i2, float f, float f2) {
        RectF rectF = new RectF();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f3 = motionPaths.f69x;
        rectF.left = f3;
        float f4 = motionPaths.f70y;
        rectF.top = f4;
        rectF.right = f3 + motionPaths.width;
        rectF.bottom = f4 + motionPaths.height;
        RectF rectF2 = new RectF();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f5 = motionPaths2.f69x;
        rectF2.left = f5;
        float f6 = motionPaths2.f70y;
        rectF2.top = f6;
        rectF2.right = f5 + motionPaths2.width;
        rectF2.bottom = f6 + motionPaths2.height;
        Iterator<Key> it = this.mKeyList.iterator();
        while (it.hasNext()) {
            Key next = it.next();
            if (next instanceof KeyPositionBase) {
                KeyPositionBase keyPositionBase = (KeyPositionBase) next;
                if (keyPositionBase.intersects(i, i2, rectF, rectF2, f, f2)) {
                    return keyPositionBase;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void getPostLayoutDvDp(float f, int i, int i2, float f2, float f3, float[] fArr) {
        float adjustedPosition = getAdjustedPosition(f, this.mVelocity);
        HashMap<String, ViewSpline> hashMap = this.mAttributesMap;
        ViewOscillator viewOscillator = null;
        SplineSet splineSet = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, ViewSpline> hashMap2 = this.mAttributesMap;
        SplineSet splineSet2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, ViewSpline> hashMap3 = this.mAttributesMap;
        SplineSet splineSet3 = hashMap3 == null ? null : hashMap3.get(Key.ROTATION);
        HashMap<String, ViewSpline> hashMap4 = this.mAttributesMap;
        SplineSet splineSet4 = hashMap4 == null ? null : hashMap4.get("scaleX");
        HashMap<String, ViewSpline> hashMap5 = this.mAttributesMap;
        SplineSet splineSet5 = hashMap5 == null ? null : hashMap5.get("scaleY");
        HashMap<String, ViewOscillator> hashMap6 = this.mCycleMap;
        ViewOscillator viewOscillator2 = hashMap6 == null ? null : hashMap6.get("translationX");
        HashMap<String, ViewOscillator> hashMap7 = this.mCycleMap;
        ViewOscillator viewOscillator3 = hashMap7 == null ? null : hashMap7.get("translationY");
        HashMap<String, ViewOscillator> hashMap8 = this.mCycleMap;
        ViewOscillator viewOscillator4 = hashMap8 == null ? null : hashMap8.get(Key.ROTATION);
        HashMap<String, ViewOscillator> hashMap9 = this.mCycleMap;
        ViewOscillator viewOscillator5 = hashMap9 == null ? null : hashMap9.get("scaleX");
        HashMap<String, ViewOscillator> hashMap10 = this.mCycleMap;
        if (hashMap10 != null) {
            viewOscillator = hashMap10.get("scaleY");
        }
        VelocityMatrix velocityMatrix = new VelocityMatrix();
        velocityMatrix.clear();
        velocityMatrix.setRotationVelocity(splineSet3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(splineSet, splineSet2, adjustedPosition);
        velocityMatrix.setScaleVelocity(splineSet4, splineSet5, adjustedPosition);
        velocityMatrix.setRotationVelocity((KeyCycleOscillator) viewOscillator4, adjustedPosition);
        velocityMatrix.setTranslationVelocity((KeyCycleOscillator) viewOscillator2, (KeyCycleOscillator) viewOscillator3, adjustedPosition);
        velocityMatrix.setScaleVelocity((KeyCycleOscillator) viewOscillator5, (KeyCycleOscillator) viewOscillator, adjustedPosition);
        CurveFit curveFit = this.mArcSpline;
        if (curveFit != null) {
            double[] dArr = this.mInterpolateData;
            if (dArr.length > 0) {
                double d = (double) adjustedPosition;
                curveFit.getPos(d, dArr);
                this.mArcSpline.getSlope(d, this.mInterpolateVelocity);
                this.mStartMotionPath.setDpDt(f2, f3, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
            }
            velocityMatrix.applyTransform(f2, f3, i, i2, fArr);
            return;
        }
        int i3 = 0;
        if (this.mSpline != null) {
            double adjustedPosition2 = (double) getAdjustedPosition(adjustedPosition, this.mVelocity);
            this.mSpline[0].getSlope(adjustedPosition2, this.mInterpolateVelocity);
            this.mSpline[0].getPos(adjustedPosition2, this.mInterpolateData);
            float f4 = this.mVelocity[0];
            while (true) {
                double[] dArr2 = this.mInterpolateVelocity;
                if (i3 < dArr2.length) {
                    double d2 = dArr2[i3];
                    double d3 = (double) f4;
                    Double.isNaN(d3);
                    dArr2[i3] = d2 * d3;
                    i3++;
                } else {
                    float f5 = f2;
                    float f6 = f3;
                    this.mStartMotionPath.setDpDt(f5, f6, fArr, this.mInterpolateVariables, dArr2, this.mInterpolateData);
                    velocityMatrix.applyTransform(f5, f6, i, i2, fArr);
                    return;
                }
            }
        } else {
            MotionPaths motionPaths = this.mEndMotionPath;
            float f7 = motionPaths.f69x;
            MotionPaths motionPaths2 = this.mStartMotionPath;
            float f8 = f7 - motionPaths2.f69x;
            float f9 = motionPaths.f70y - motionPaths2.f70y;
            ViewOscillator viewOscillator6 = viewOscillator5;
            float f10 = (motionPaths.height - motionPaths2.height) + f9;
            fArr[0] = (f8 * (1.0f - f2)) + (((motionPaths.width - motionPaths2.width) + f8) * f2);
            fArr[1] = (f9 * (1.0f - f3)) + (f10 * f3);
            velocityMatrix.clear();
            velocityMatrix.setRotationVelocity(splineSet3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(splineSet, splineSet2, adjustedPosition);
            velocityMatrix.setScaleVelocity(splineSet4, splineSet5, adjustedPosition);
            velocityMatrix.setRotationVelocity((KeyCycleOscillator) viewOscillator4, adjustedPosition);
            velocityMatrix.setTranslationVelocity((KeyCycleOscillator) viewOscillator2, (KeyCycleOscillator) viewOscillator3, adjustedPosition);
            velocityMatrix.setScaleVelocity((KeyCycleOscillator) viewOscillator6, (KeyCycleOscillator) viewOscillator, adjustedPosition);
            velocityMatrix.applyTransform(f2, f3, i, i2, fArr);
        }
    }

    public float getStartHeight() {
        return this.mStartMotionPath.height;
    }

    public float getStartWidth() {
        return this.mStartMotionPath.width;
    }

    public float getStartX() {
        return this.mStartMotionPath.f69x;
    }

    public float getStartY() {
        return this.mStartMotionPath.f70y;
    }

    public int getTransformPivotTarget() {
        return this.mTransformPivotTarget;
    }

    public View getView() {
        return this.mView;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v59, resolved type: androidx.constraintlayout.motion.utils.ViewTimeCycle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: androidx.constraintlayout.motion.utils.ViewTimeCycle$PathRotate} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean interpolate(android.view.View r21, float r22, long r23, androidx.constraintlayout.core.motion.utils.KeyCache r25) {
        /*
            r20 = this;
            r0 = r20
            r11 = r21
            r1 = 0
            r2 = r22
            float r2 = r0.getAdjustedPosition(r2, r1)
            int r3 = r0.mQuantizeMotionSteps
            int r4 = androidx.constraintlayout.motion.widget.Key.UNSET
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r3 == r4) goto L_0x0045
            float r3 = (float) r3
            float r3 = r13 / r3
            float r4 = r2 / r3
            double r4 = (double) r4
            double r4 = java.lang.Math.floor(r4)
            float r4 = (float) r4
            float r4 = r4 * r3
            float r2 = r2 % r3
            float r2 = r2 / r3
            float r5 = r0.mQuantizeMotionPhase
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L_0x002e
            float r5 = r0.mQuantizeMotionPhase
            float r2 = r2 + r5
            float r2 = r2 % r13
        L_0x002e:
            android.view.animation.Interpolator r5 = r0.mQuantizeMotionInterpolator
            if (r5 == 0) goto L_0x0037
            float r2 = r5.getInterpolation(r2)
            goto L_0x0042
        L_0x0037:
            double r5 = (double) r2
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0041
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0042
        L_0x0041:
            r2 = 0
        L_0x0042:
            float r2 = r2 * r3
            float r2 = r2 + r4
        L_0x0045:
            r14 = r2
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r2 = r0.mAttributesMap
            if (r2 == 0) goto L_0x0062
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0052:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0062
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.motion.utils.ViewSpline r3 = (androidx.constraintlayout.motion.utils.ViewSpline) r3
            r3.setProperty(r11, r14)
            goto L_0x0052
        L_0x0062:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewTimeCycle> r2 = r0.mTimeCycleAttributesMap
            r15 = 0
            if (r2 == 0) goto L_0x0096
            java.util.Collection r2 = r2.values()
            java.util.Iterator r7 = r2.iterator()
            r8 = r1
            r9 = 0
        L_0x0071:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0092
            java.lang.Object r1 = r7.next()
            androidx.constraintlayout.motion.utils.ViewTimeCycle r1 = (androidx.constraintlayout.motion.utils.ViewTimeCycle) r1
            boolean r2 = r1 instanceof androidx.constraintlayout.motion.utils.ViewTimeCycle.PathRotate
            if (r2 == 0) goto L_0x0085
            r8 = r1
            androidx.constraintlayout.motion.utils.ViewTimeCycle$PathRotate r8 = (androidx.constraintlayout.motion.utils.ViewTimeCycle.PathRotate) r8
            goto L_0x0071
        L_0x0085:
            r2 = r21
            r3 = r14
            r4 = r23
            r6 = r25
            boolean r1 = r1.setProperty(r2, r3, r4, r6)
            r9 = r9 | r1
            goto L_0x0071
        L_0x0092:
            r16 = r9
            r9 = r8
            goto L_0x0099
        L_0x0096:
            r9 = r1
            r16 = 0
        L_0x0099:
            androidx.constraintlayout.core.motion.utils.CurveFit[] r1 = r0.mSpline
            r10 = 1
            if (r1 == 0) goto L_0x01ee
            r1 = r1[r15]
            double r7 = (double) r14
            double[] r2 = r0.mInterpolateData
            r1.getPos((double) r7, (double[]) r2)
            androidx.constraintlayout.core.motion.utils.CurveFit[] r1 = r0.mSpline
            r1 = r1[r15]
            double[] r2 = r0.mInterpolateVelocity
            r1.getSlope((double) r7, (double[]) r2)
            androidx.constraintlayout.core.motion.utils.CurveFit r1 = r0.mArcSpline
            if (r1 == 0) goto L_0x00c2
            double[] r2 = r0.mInterpolateData
            int r3 = r2.length
            if (r3 <= 0) goto L_0x00c2
            r1.getPos((double) r7, (double[]) r2)
            androidx.constraintlayout.core.motion.utils.CurveFit r1 = r0.mArcSpline
            double[] r2 = r0.mInterpolateVelocity
            r1.getSlope((double) r7, (double[]) r2)
        L_0x00c2:
            boolean r1 = r0.mNoMovement
            if (r1 != 0) goto L_0x00e2
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r0.mStartMotionPath
            int[] r4 = r0.mInterpolateVariables
            double[] r5 = r0.mInterpolateData
            double[] r6 = r0.mInterpolateVelocity
            r17 = 0
            boolean r3 = r0.mForceMeasure
            r2 = r14
            r18 = r3
            r3 = r21
            r12 = r7
            r7 = r17
            r8 = r18
            r1.setView(r2, r3, r4, r5, r6, r7, r8)
            r0.mForceMeasure = r15
            goto L_0x00e3
        L_0x00e2:
            r12 = r7
        L_0x00e3:
            int r1 = r0.mTransformPivotTarget
            int r2 = androidx.constraintlayout.motion.widget.Key.UNSET
            if (r1 == r2) goto L_0x0145
            android.view.View r1 = r0.mTransformPivotView
            if (r1 != 0) goto L_0x00fb
            android.view.ViewParent r1 = r21.getParent()
            android.view.View r1 = (android.view.View) r1
            int r2 = r0.mTransformPivotTarget
            android.view.View r1 = r1.findViewById(r2)
            r0.mTransformPivotView = r1
        L_0x00fb:
            android.view.View r1 = r0.mTransformPivotView
            if (r1 == 0) goto L_0x0145
            int r1 = r1.getTop()
            android.view.View r2 = r0.mTransformPivotView
            int r2 = r2.getBottom()
            int r1 = r1 + r2
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            android.view.View r3 = r0.mTransformPivotView
            int r3 = r3.getLeft()
            android.view.View r4 = r0.mTransformPivotView
            int r4 = r4.getRight()
            int r3 = r3 + r4
            float r3 = (float) r3
            float r3 = r3 / r2
            int r2 = r21.getRight()
            int r4 = r21.getLeft()
            int r2 = r2 - r4
            if (r2 <= 0) goto L_0x0145
            int r2 = r21.getBottom()
            int r4 = r21.getTop()
            int r2 = r2 - r4
            if (r2 <= 0) goto L_0x0145
            int r2 = r21.getLeft()
            float r2 = (float) r2
            float r3 = r3 - r2
            int r2 = r21.getTop()
            float r2 = (float) r2
            float r1 = r1 - r2
            r11.setPivotX(r3)
            r11.setPivotY(r1)
        L_0x0145:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r1 = r0.mAttributesMap
            if (r1 == 0) goto L_0x0173
            java.util.Collection r1 = r1.values()
            java.util.Iterator r8 = r1.iterator()
        L_0x0151:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0173
            java.lang.Object r1 = r8.next()
            androidx.constraintlayout.core.motion.utils.SplineSet r1 = (androidx.constraintlayout.core.motion.utils.SplineSet) r1
            boolean r2 = r1 instanceof androidx.constraintlayout.motion.utils.ViewSpline.PathRotate
            if (r2 == 0) goto L_0x0151
            double[] r2 = r0.mInterpolateVelocity
            int r3 = r2.length
            if (r3 <= r10) goto L_0x0151
            androidx.constraintlayout.motion.utils.ViewSpline$PathRotate r1 = (androidx.constraintlayout.motion.utils.ViewSpline.PathRotate) r1
            r4 = r2[r15]
            r6 = r2[r10]
            r2 = r21
            r3 = r14
            r1.setPathRotate(r2, r3, r4, r6)
            goto L_0x0151
        L_0x0173:
            if (r9 == 0) goto L_0x0190
            double[] r1 = r0.mInterpolateVelocity
            r7 = r1[r15]
            r17 = r1[r10]
            r1 = r9
            r2 = r21
            r3 = r25
            r4 = r14
            r5 = r23
            r19 = 1
            r9 = r17
            boolean r1 = r1.setPathRotate(r2, r3, r4, r5, r7, r9)
            r1 = r16 | r1
            r16 = r1
            goto L_0x0192
        L_0x0190:
            r19 = 1
        L_0x0192:
            r10 = 1
        L_0x0193:
            androidx.constraintlayout.core.motion.utils.CurveFit[] r1 = r0.mSpline
            int r2 = r1.length
            if (r10 >= r2) goto L_0x01b7
            r1 = r1[r10]
            float[] r2 = r0.mValuesBuff
            r1.getPos((double) r12, (float[]) r2)
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r0.mStartMotionPath
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r1 = r1.attributes
            java.lang.String[] r2 = r0.mAttributeNames
            int r3 = r10 + -1
            r2 = r2[r3]
            java.lang.Object r1 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintAttribute r1 = (androidx.constraintlayout.widget.ConstraintAttribute) r1
            float[] r2 = r0.mValuesBuff
            androidx.constraintlayout.motion.utils.CustomSupport.setInterpolatedValue(r1, r11, r2)
            int r10 = r10 + 1
            goto L_0x0193
        L_0x01b7:
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r1 = r0.mStartPoint
            int r2 = r1.mVisibilityMode
            if (r2 != 0) goto L_0x01dc
            r2 = 0
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x01c8
        L_0x01c2:
            int r1 = r1.visibility
            r11.setVisibility(r1)
            goto L_0x01dc
        L_0x01c8:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x01d1
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r1 = r0.mEndPoint
            goto L_0x01c2
        L_0x01d1:
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r2 = r0.mEndPoint
            int r2 = r2.visibility
            int r1 = r1.visibility
            if (r2 == r1) goto L_0x01dc
            r11.setVisibility(r15)
        L_0x01dc:
            androidx.constraintlayout.motion.widget.KeyTrigger[] r1 = r0.mKeyTriggers
            if (r1 == 0) goto L_0x0242
            r1 = 0
        L_0x01e1:
            androidx.constraintlayout.motion.widget.KeyTrigger[] r2 = r0.mKeyTriggers
            int r3 = r2.length
            if (r1 >= r3) goto L_0x0242
            r2 = r2[r1]
            r2.conditionallyFire(r14, r11)
            int r1 = r1 + 1
            goto L_0x01e1
        L_0x01ee:
            r19 = 1
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r0.mStartMotionPath
            float r2 = r1.f69x
            androidx.constraintlayout.motion.widget.MotionPaths r3 = r0.mEndMotionPath
            float r4 = r3.f69x
            float r4 = r4 - r2
            float r4 = r4 * r14
            float r2 = r2 + r4
            float r4 = r1.f70y
            float r5 = r3.f70y
            float r5 = r5 - r4
            float r5 = r5 * r14
            float r4 = r4 + r5
            float r5 = r1.width
            float r6 = r3.width
            float r7 = r6 - r5
            float r7 = r7 * r14
            float r7 = r7 + r5
            float r1 = r1.height
            float r3 = r3.height
            float r8 = r3 - r1
            float r8 = r8 * r14
            float r8 = r8 + r1
            r9 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r9
            int r10 = (int) r2
            float r4 = r4 + r9
            int r9 = (int) r4
            float r2 = r2 + r7
            int r2 = (int) r2
            float r4 = r4 + r8
            int r4 = (int) r4
            int r7 = r2 - r10
            int r8 = r4 - r9
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x0230
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0230
            boolean r1 = r0.mForceMeasure
            if (r1 == 0) goto L_0x023f
        L_0x0230:
            r1 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r1)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r1)
            r11.measure(r3, r1)
            r0.mForceMeasure = r15
        L_0x023f:
            r11.layout(r10, r9, r2, r4)
        L_0x0242:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> r1 = r0.mCycleMap
            if (r1 == 0) goto L_0x0271
            java.util.Collection r1 = r1.values()
            java.util.Iterator r8 = r1.iterator()
        L_0x024e:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0271
            java.lang.Object r1 = r8.next()
            androidx.constraintlayout.motion.utils.ViewOscillator r1 = (androidx.constraintlayout.motion.utils.ViewOscillator) r1
            boolean r2 = r1 instanceof androidx.constraintlayout.motion.utils.ViewOscillator.PathRotateSet
            if (r2 == 0) goto L_0x026d
            androidx.constraintlayout.motion.utils.ViewOscillator$PathRotateSet r1 = (androidx.constraintlayout.motion.utils.ViewOscillator.PathRotateSet) r1
            double[] r2 = r0.mInterpolateVelocity
            r4 = r2[r15]
            r6 = r2[r19]
            r2 = r21
            r3 = r14
            r1.setPathRotate(r2, r3, r4, r6)
            goto L_0x024e
        L_0x026d:
            r1.setProperty(r11, r14)
            goto L_0x024e
        L_0x0271:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionController.interpolate(android.view.View, float, long, androidx.constraintlayout.core.motion.utils.KeyCache):boolean");
    }

    /* access modifiers changed from: package-private */
    public String name() {
        return this.mView.getContext().getResources().getResourceEntryName(this.mView.getId());
    }

    /* access modifiers changed from: package-private */
    public void positionKeyframe(View view, KeyPositionBase keyPositionBase, float f, float f2, String[] strArr, float[] fArr) {
        RectF rectF = new RectF();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f3 = motionPaths.f69x;
        rectF.left = f3;
        float f4 = motionPaths.f70y;
        rectF.top = f4;
        rectF.right = f3 + motionPaths.width;
        rectF.bottom = f4 + motionPaths.height;
        RectF rectF2 = new RectF();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f5 = motionPaths2.f69x;
        rectF2.left = f5;
        float f6 = motionPaths2.f70y;
        rectF2.top = f6;
        rectF2.right = f5 + motionPaths2.width;
        rectF2.bottom = f6 + motionPaths2.height;
        keyPositionBase.positionAttributes(view, rectF, rectF2, f, f2, strArr, fArr);
    }

    public void remeasure() {
        this.mForceMeasure = true;
    }

    /* access modifiers changed from: package-private */
    public void rotate(Rect rect, Rect rect2, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (i != 1) {
            if (i == 2) {
                i7 = rect.left + rect.right;
                i6 = rect.top;
                i8 = rect.bottom;
            } else if (i == 3) {
                i5 = rect.left + rect.right;
                i4 = ((rect.height() / 2) + rect.top) - (i5 / 2);
            } else if (i == 4) {
                i7 = rect.left + rect.right;
                i6 = rect.bottom;
                i8 = rect.top;
            } else {
                return;
            }
            rect2.left = i2 - (((i6 + i8) + rect.width()) / 2);
            rect2.top = (i7 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        }
        i5 = rect.left + rect.right;
        i4 = ((rect.top + rect.bottom) - rect.width()) / 2;
        rect2.left = i4;
        rect2.top = i3 - ((i5 + rect.height()) / 2);
        rect2.right = rect2.left + rect.width();
        rect2.bottom = rect2.top + rect.height();
    }

    /* access modifiers changed from: package-private */
    public void setBothStates(View view) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.time = 0.0f;
        motionPaths.position = 0.0f;
        this.mNoMovement = true;
        motionPaths.setBounds(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        this.mEndMotionPath.setBounds(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        this.mStartPoint.setState(view);
        this.mEndPoint.setState(view);
    }

    public void setDrawPath(int i) {
        this.mStartMotionPath.mDrawPath = i;
    }

    /* access modifiers changed from: package-private */
    public void setEndState(Rect rect, ConstraintSet constraintSet, int i, int i2) {
        int i3 = constraintSet.mRotate;
        if (i3 != 0) {
            rotate(rect, this.mTempRect, i3, i, i2);
            rect = this.mTempRect;
        }
        MotionPaths motionPaths = this.mEndMotionPath;
        motionPaths.time = 1.0f;
        motionPaths.position = 1.0f;
        readView(motionPaths);
        this.mEndMotionPath.setBounds((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
        this.mEndMotionPath.applyParameters(constraintSet.getParameters(this.mId));
        this.mEndPoint.setState(rect, constraintSet, i3, this.mId);
    }

    public void setPathMotionArc(int i) {
        this.mPathMotionArc = i;
    }

    /* access modifiers changed from: package-private */
    public void setStartCurrentState(View view) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.time = 0.0f;
        motionPaths.position = 0.0f;
        motionPaths.setBounds(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        this.mStartPoint.setState(view);
    }

    /* access modifiers changed from: package-private */
    public void setStartState(Rect rect, ConstraintSet constraintSet, int i, int i2) {
        int i3 = constraintSet.mRotate;
        if (i3 != 0) {
            rotate(rect, this.mTempRect, i3, i, i2);
        }
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.time = 0.0f;
        motionPaths.position = 0.0f;
        readView(motionPaths);
        this.mStartMotionPath.setBounds((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
        ConstraintSet.Constraint parameters = constraintSet.getParameters(this.mId);
        this.mStartMotionPath.applyParameters(parameters);
        this.mMotionStagger = parameters.motion.mMotionStagger;
        this.mStartPoint.setState(rect, constraintSet, i3, this.mId);
        this.mTransformPivotTarget = parameters.transform.transformPivotTarget;
        ConstraintSet.Motion motion = parameters.motion;
        this.mQuantizeMotionSteps = motion.mQuantizeMotionSteps;
        this.mQuantizeMotionPhase = motion.mQuantizeMotionPhase;
        Context context = this.mView.getContext();
        ConstraintSet.Motion motion2 = parameters.motion;
        this.mQuantizeMotionInterpolator = getInterpolator(context, motion2.mQuantizeInterpolatorType, motion2.mQuantizeInterpolatorString, motion2.mQuantizeInterpolatorID);
    }

    public void setStartState(ViewState viewState, View view, int i, int i2, int i3) {
        int i4;
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.time = 0.0f;
        motionPaths.position = 0.0f;
        Rect rect = new Rect();
        if (i != 1) {
            if (i == 2) {
                int i5 = viewState.left + viewState.right;
                rect.left = i3 - (((viewState.top + viewState.bottom) + viewState.width()) / 2);
                i4 = (i5 - viewState.height()) / 2;
            }
            this.mStartMotionPath.setBounds((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
            this.mStartPoint.setState(rect, view, i, viewState.rotation);
        }
        int i6 = viewState.left + viewState.right;
        rect.left = ((viewState.top + viewState.bottom) - viewState.width()) / 2;
        i4 = i2 - ((i6 + viewState.height()) / 2);
        rect.top = i4;
        rect.right = rect.left + viewState.width();
        rect.bottom = rect.top + viewState.height();
        this.mStartMotionPath.setBounds((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
        this.mStartPoint.setState(rect, view, i, viewState.rotation);
    }

    public void setTransformPivotTarget(int i) {
        this.mTransformPivotTarget = i;
        this.mTransformPivotView = null;
    }

    public void setView(View view) {
        this.mView = view;
        this.mId = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            this.mConstraintTag = ((ConstraintLayout.LayoutParams) layoutParams).getConstraintTag();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0157, code lost:
        r11 = (java.lang.Integer) r5.get(r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setup(int r18, int r19, float r20, long r21) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Class<double> r1 = double.class
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            int r6 = r0.mPathMotionArc
            int r7 = androidx.constraintlayout.motion.widget.Key.UNSET
            if (r6 == r7) goto L_0x0027
            androidx.constraintlayout.motion.widget.MotionPaths r7 = r0.mStartMotionPath
            r7.mPathMotionArc = r6
        L_0x0027:
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r6 = r0.mStartPoint
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r7 = r0.mEndPoint
            r6.different(r7, r3)
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r6 = r0.mKeyList
            if (r6 == 0) goto L_0x008e
            java.util.Iterator r6 = r6.iterator()
            r8 = 0
        L_0x0037:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x008f
            java.lang.Object r9 = r6.next()
            androidx.constraintlayout.motion.widget.Key r9 = (androidx.constraintlayout.motion.widget.Key) r9
            boolean r10 = r9 instanceof androidx.constraintlayout.motion.widget.KeyPosition
            if (r10 == 0) goto L_0x0066
            androidx.constraintlayout.motion.widget.KeyPosition r9 = (androidx.constraintlayout.motion.widget.KeyPosition) r9
            androidx.constraintlayout.motion.widget.MotionPaths r10 = new androidx.constraintlayout.motion.widget.MotionPaths
            androidx.constraintlayout.motion.widget.MotionPaths r15 = r0.mStartMotionPath
            androidx.constraintlayout.motion.widget.MotionPaths r14 = r0.mEndMotionPath
            r11 = r10
            r12 = r18
            r13 = r19
            r16 = r14
            r14 = r9
            r11.<init>(r12, r13, r14, r15, r16)
            r0.insertKey(r10)
            int r9 = r9.mCurveFit
            int r10 = androidx.constraintlayout.motion.widget.Key.UNSET
            if (r9 == r10) goto L_0x0037
            r0.mCurveFitType = r9
            goto L_0x0037
        L_0x0066:
            boolean r10 = r9 instanceof androidx.constraintlayout.motion.widget.KeyCycle
            if (r10 == 0) goto L_0x006e
            r9.getAttributeNames(r4)
            goto L_0x0037
        L_0x006e:
            boolean r10 = r9 instanceof androidx.constraintlayout.motion.widget.KeyTimeCycle
            if (r10 == 0) goto L_0x0076
            r9.getAttributeNames(r2)
            goto L_0x0037
        L_0x0076:
            boolean r10 = r9 instanceof androidx.constraintlayout.motion.widget.KeyTrigger
            if (r10 == 0) goto L_0x0087
            if (r8 != 0) goto L_0x0081
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x0081:
            androidx.constraintlayout.motion.widget.KeyTrigger r9 = (androidx.constraintlayout.motion.widget.KeyTrigger) r9
            r8.add(r9)
            goto L_0x0037
        L_0x0087:
            r9.setInterpolation(r5)
            r9.getAttributeNames(r3)
            goto L_0x0037
        L_0x008e:
            r8 = 0
        L_0x008f:
            r6 = 0
            if (r8 == 0) goto L_0x009c
            androidx.constraintlayout.motion.widget.KeyTrigger[] r9 = new androidx.constraintlayout.motion.widget.KeyTrigger[r6]
            java.lang.Object[] r8 = r8.toArray(r9)
            androidx.constraintlayout.motion.widget.KeyTrigger[] r8 = (androidx.constraintlayout.motion.widget.KeyTrigger[]) r8
            r0.mKeyTriggers = r8
        L_0x009c:
            boolean r8 = r3.isEmpty()
            java.lang.String r9 = ","
            java.lang.String r10 = "CUSTOM,"
            r11 = 1
            if (r8 != 0) goto L_0x0173
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            r0.mAttributesMap = r8
            java.util.Iterator r8 = r3.iterator()
        L_0x00b2:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L_0x010d
            java.lang.Object r12 = r8.next()
            java.lang.String r12 = (java.lang.String) r12
            boolean r13 = r12.startsWith(r10)
            if (r13 == 0) goto L_0x00fc
            android.util.SparseArray r13 = new android.util.SparseArray
            r13.<init>()
            java.lang.String[] r14 = r12.split(r9)
            r14 = r14[r11]
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r15 = r0.mKeyList
            java.util.Iterator r15 = r15.iterator()
        L_0x00d5:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x00f7
            java.lang.Object r16 = r15.next()
            r7 = r16
            androidx.constraintlayout.motion.widget.Key r7 = (androidx.constraintlayout.motion.widget.Key) r7
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r11 = r7.mCustomConstraints
            if (r11 != 0) goto L_0x00e9
        L_0x00e7:
            r11 = 1
            goto L_0x00d5
        L_0x00e9:
            java.lang.Object r11 = r11.get(r14)
            androidx.constraintlayout.widget.ConstraintAttribute r11 = (androidx.constraintlayout.widget.ConstraintAttribute) r11
            if (r11 == 0) goto L_0x00e7
            int r7 = r7.mFramePosition
            r13.append(r7, r11)
            goto L_0x00e7
        L_0x00f7:
            androidx.constraintlayout.motion.utils.ViewSpline r7 = androidx.constraintlayout.motion.utils.ViewSpline.makeCustomSpline(r12, r13)
            goto L_0x0100
        L_0x00fc:
            androidx.constraintlayout.motion.utils.ViewSpline r7 = androidx.constraintlayout.motion.utils.ViewSpline.makeSpline(r12)
        L_0x0100:
            if (r7 != 0) goto L_0x0103
            goto L_0x010b
        L_0x0103:
            r7.setType(r12)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r11 = r0.mAttributesMap
            r11.put(r12, r7)
        L_0x010b:
            r11 = 1
            goto L_0x00b2
        L_0x010d:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r7 = r0.mKeyList
            if (r7 == 0) goto L_0x012b
            java.util.Iterator r7 = r7.iterator()
        L_0x0115:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x012b
            java.lang.Object r8 = r7.next()
            androidx.constraintlayout.motion.widget.Key r8 = (androidx.constraintlayout.motion.widget.Key) r8
            boolean r11 = r8 instanceof androidx.constraintlayout.motion.widget.KeyAttributes
            if (r11 == 0) goto L_0x0115
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r11 = r0.mAttributesMap
            r8.addValues(r11)
            goto L_0x0115
        L_0x012b:
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r7 = r0.mStartPoint
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r8 = r0.mAttributesMap
            r7.addValues(r8, r6)
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r7 = r0.mEndPoint
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r8 = r0.mAttributesMap
            r11 = 100
            r7.addValues(r8, r11)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r7 = r0.mAttributesMap
            java.util.Set r7 = r7.keySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x0145:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0173
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            boolean r11 = r5.containsKey(r8)
            if (r11 == 0) goto L_0x0164
            java.lang.Object r11 = r5.get(r8)
            java.lang.Integer r11 = (java.lang.Integer) r11
            if (r11 == 0) goto L_0x0164
            int r11 = r11.intValue()
            goto L_0x0165
        L_0x0164:
            r11 = 0
        L_0x0165:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r12 = r0.mAttributesMap
            java.lang.Object r8 = r12.get(r8)
            androidx.constraintlayout.core.motion.utils.SplineSet r8 = (androidx.constraintlayout.core.motion.utils.SplineSet) r8
            if (r8 == 0) goto L_0x0145
            r8.setup(r11)
            goto L_0x0145
        L_0x0173:
            boolean r7 = r2.isEmpty()
            if (r7 != 0) goto L_0x0241
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewTimeCycle> r7 = r0.mTimeCycleAttributesMap
            if (r7 != 0) goto L_0x0184
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r0.mTimeCycleAttributesMap = r7
        L_0x0184:
            java.util.Iterator r2 = r2.iterator()
        L_0x0188:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x01ed
            java.lang.Object r7 = r2.next()
            java.lang.String r7 = (java.lang.String) r7
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewTimeCycle> r8 = r0.mTimeCycleAttributesMap
            boolean r8 = r8.containsKey(r7)
            if (r8 == 0) goto L_0x019d
            goto L_0x0188
        L_0x019d:
            boolean r8 = r7.startsWith(r10)
            if (r8 == 0) goto L_0x01db
            android.util.SparseArray r8 = new android.util.SparseArray
            r8.<init>()
            java.lang.String[] r11 = r7.split(r9)
            r12 = 1
            r11 = r11[r12]
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r12 = r0.mKeyList
            java.util.Iterator r12 = r12.iterator()
        L_0x01b5:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x01d4
            java.lang.Object r13 = r12.next()
            androidx.constraintlayout.motion.widget.Key r13 = (androidx.constraintlayout.motion.widget.Key) r13
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r14 = r13.mCustomConstraints
            if (r14 != 0) goto L_0x01c6
            goto L_0x01b5
        L_0x01c6:
            java.lang.Object r14 = r14.get(r11)
            androidx.constraintlayout.widget.ConstraintAttribute r14 = (androidx.constraintlayout.widget.ConstraintAttribute) r14
            if (r14 == 0) goto L_0x01b5
            int r13 = r13.mFramePosition
            r8.append(r13, r14)
            goto L_0x01b5
        L_0x01d4:
            androidx.constraintlayout.motion.utils.ViewTimeCycle r8 = androidx.constraintlayout.motion.utils.ViewTimeCycle.makeCustomSpline(r7, r8)
            r11 = r21
            goto L_0x01e1
        L_0x01db:
            r11 = r21
            androidx.constraintlayout.motion.utils.ViewTimeCycle r8 = androidx.constraintlayout.motion.utils.ViewTimeCycle.makeSpline(r7, r11)
        L_0x01e1:
            if (r8 != 0) goto L_0x01e4
            goto L_0x0188
        L_0x01e4:
            r8.setType(r7)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewTimeCycle> r13 = r0.mTimeCycleAttributesMap
            r13.put(r7, r8)
            goto L_0x0188
        L_0x01ed:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r2 = r0.mKeyList
            if (r2 == 0) goto L_0x020d
            java.util.Iterator r2 = r2.iterator()
        L_0x01f5:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x020d
            java.lang.Object r7 = r2.next()
            androidx.constraintlayout.motion.widget.Key r7 = (androidx.constraintlayout.motion.widget.Key) r7
            boolean r8 = r7 instanceof androidx.constraintlayout.motion.widget.KeyTimeCycle
            if (r8 == 0) goto L_0x01f5
            androidx.constraintlayout.motion.widget.KeyTimeCycle r7 = (androidx.constraintlayout.motion.widget.KeyTimeCycle) r7
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewTimeCycle> r8 = r0.mTimeCycleAttributesMap
            r7.addTimeValues(r8)
            goto L_0x01f5
        L_0x020d:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewTimeCycle> r2 = r0.mTimeCycleAttributesMap
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0217:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0241
            java.lang.Object r7 = r2.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r8 = r5.containsKey(r7)
            if (r8 == 0) goto L_0x0234
            java.lang.Object r8 = r5.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            goto L_0x0235
        L_0x0234:
            r8 = 0
        L_0x0235:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewTimeCycle> r9 = r0.mTimeCycleAttributesMap
            java.lang.Object r7 = r9.get(r7)
            androidx.constraintlayout.motion.utils.ViewTimeCycle r7 = (androidx.constraintlayout.motion.utils.ViewTimeCycle) r7
            r7.setup(r8)
            goto L_0x0217
        L_0x0241:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r2 = r0.mMotionPaths
            int r2 = r2.size()
            r5 = 2
            int r2 = r2 + r5
            androidx.constraintlayout.motion.widget.MotionPaths[] r7 = new androidx.constraintlayout.motion.widget.MotionPaths[r2]
            androidx.constraintlayout.motion.widget.MotionPaths r8 = r0.mStartMotionPath
            r7[r6] = r8
            int r8 = r2 + -1
            androidx.constraintlayout.motion.widget.MotionPaths r9 = r0.mEndMotionPath
            r7[r8] = r9
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r8 = r0.mMotionPaths
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x0264
            int r8 = r0.mCurveFitType
            r9 = -1
            if (r8 != r9) goto L_0x0264
            r0.mCurveFitType = r6
        L_0x0264:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r8 = r0.mMotionPaths
            java.util.Iterator r8 = r8.iterator()
            r9 = 1
        L_0x026b:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x027d
            java.lang.Object r11 = r8.next()
            androidx.constraintlayout.motion.widget.MotionPaths r11 = (androidx.constraintlayout.motion.widget.MotionPaths) r11
            int r12 = r9 + 1
            r7[r9] = r11
            r9 = r12
            goto L_0x026b
        L_0x027d:
            r8 = 18
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            androidx.constraintlayout.motion.widget.MotionPaths r11 = r0.mEndMotionPath
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r11 = r11.attributes
            java.util.Set r11 = r11.keySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x0290:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x02bf
            java.lang.Object r12 = r11.next()
            java.lang.String r12 = (java.lang.String) r12
            androidx.constraintlayout.motion.widget.MotionPaths r13 = r0.mStartMotionPath
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r13 = r13.attributes
            boolean r13 = r13.containsKey(r12)
            if (r13 == 0) goto L_0x0290
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r10)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            boolean r13 = r3.contains(r13)
            if (r13 != 0) goto L_0x0290
            r9.add(r12)
            goto L_0x0290
        L_0x02bf:
            java.lang.String[] r3 = new java.lang.String[r6]
            java.lang.Object[] r3 = r9.toArray(r3)
            java.lang.String[] r3 = (java.lang.String[]) r3
            r0.mAttributeNames = r3
            int r3 = r3.length
            int[] r3 = new int[r3]
            r0.mAttributeInterpolatorCount = r3
            r3 = 0
        L_0x02cf:
            java.lang.String[] r9 = r0.mAttributeNames
            int r10 = r9.length
            if (r3 >= r10) goto L_0x0305
            r9 = r9[r3]
            int[] r10 = r0.mAttributeInterpolatorCount
            r10[r3] = r6
            r10 = 0
        L_0x02db:
            if (r10 >= r2) goto L_0x0302
            r11 = r7[r10]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r11 = r11.attributes
            boolean r11 = r11.containsKey(r9)
            if (r11 == 0) goto L_0x02ff
            r11 = r7[r10]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r11 = r11.attributes
            java.lang.Object r11 = r11.get(r9)
            androidx.constraintlayout.widget.ConstraintAttribute r11 = (androidx.constraintlayout.widget.ConstraintAttribute) r11
            if (r11 == 0) goto L_0x02ff
            int[] r9 = r0.mAttributeInterpolatorCount
            r10 = r9[r3]
            int r11 = r11.numberOfInterpolatedValues()
            int r10 = r10 + r11
            r9[r3] = r10
            goto L_0x0302
        L_0x02ff:
            int r10 = r10 + 1
            goto L_0x02db
        L_0x0302:
            int r3 = r3 + 1
            goto L_0x02cf
        L_0x0305:
            r3 = r7[r6]
            int r3 = r3.mPathMotionArc
            int r10 = androidx.constraintlayout.motion.widget.Key.UNSET
            if (r3 == r10) goto L_0x030f
            r3 = 1
            goto L_0x0310
        L_0x030f:
            r3 = 0
        L_0x0310:
            int r9 = r9.length
            int r8 = r8 + r9
            boolean[] r9 = new boolean[r8]
            r10 = 1
        L_0x0315:
            if (r10 >= r2) goto L_0x0325
            r11 = r7[r10]
            int r12 = r10 + -1
            r12 = r7[r12]
            java.lang.String[] r13 = r0.mAttributeNames
            r11.different(r12, r9, r13, r3)
            int r10 = r10 + 1
            goto L_0x0315
        L_0x0325:
            r3 = 1
            r10 = 0
        L_0x0327:
            if (r3 >= r8) goto L_0x0332
            boolean r11 = r9[r3]
            if (r11 == 0) goto L_0x032f
            int r10 = r10 + 1
        L_0x032f:
            int r3 = r3 + 1
            goto L_0x0327
        L_0x0332:
            int[] r3 = new int[r10]
            r0.mInterpolateVariables = r3
            int r3 = java.lang.Math.max(r5, r10)
            double[] r10 = new double[r3]
            r0.mInterpolateData = r10
            double[] r3 = new double[r3]
            r0.mInterpolateVelocity = r3
            r3 = 1
            r10 = 0
        L_0x0344:
            if (r3 >= r8) goto L_0x0354
            boolean r11 = r9[r3]
            if (r11 == 0) goto L_0x0351
            int[] r11 = r0.mInterpolateVariables
            int r12 = r10 + 1
            r11[r10] = r3
            r10 = r12
        L_0x0351:
            int r3 = r3 + 1
            goto L_0x0344
        L_0x0354:
            int[] r3 = r0.mInterpolateVariables
            int r3 = r3.length
            int[] r8 = new int[r5]
            r9 = 1
            r8[r9] = r3
            r8[r6] = r2
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r1, r8)
            double[][] r3 = (double[][]) r3
            double[] r8 = new double[r2]
            r9 = 0
        L_0x0367:
            if (r9 >= r2) goto L_0x037c
            r10 = r7[r9]
            r11 = r3[r9]
            int[] r12 = r0.mInterpolateVariables
            r10.fillStandard(r11, r12)
            r10 = r7[r9]
            float r10 = r10.time
            double r10 = (double) r10
            r8[r9] = r10
            int r9 = r9 + 1
            goto L_0x0367
        L_0x037c:
            r9 = 0
        L_0x037d:
            int[] r10 = r0.mInterpolateVariables
            int r11 = r10.length
            if (r9 >= r11) goto L_0x03be
            r10 = r10[r9]
            java.lang.String[] r11 = androidx.constraintlayout.motion.widget.MotionPaths.names
            int r11 = r11.length
            if (r10 >= r11) goto L_0x03bb
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String[] r11 = androidx.constraintlayout.motion.widget.MotionPaths.names
            int[] r12 = r0.mInterpolateVariables
            r12 = r12[r9]
            r11 = r11[r12]
            r10.append(r11)
            java.lang.String r11 = " ["
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r11 = 0
        L_0x03a3:
            if (r11 >= r2) goto L_0x03bb
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r10)
            r10 = r3[r11]
            r13 = r10[r9]
            r12.append(r13)
            java.lang.String r10 = r12.toString()
            int r11 = r11 + 1
            goto L_0x03a3
        L_0x03bb:
            int r9 = r9 + 1
            goto L_0x037d
        L_0x03be:
            java.lang.String[] r9 = r0.mAttributeNames
            int r9 = r9.length
            r10 = 1
            int r9 = r9 + r10
            androidx.constraintlayout.core.motion.utils.CurveFit[] r9 = new androidx.constraintlayout.core.motion.utils.CurveFit[r9]
            r0.mSpline = r9
            r9 = 0
        L_0x03c8:
            java.lang.String[] r10 = r0.mAttributeNames
            int r11 = r10.length
            if (r9 >= r11) goto L_0x0424
            r10 = r10[r9]
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x03d3:
            if (r11 >= r2) goto L_0x040b
            r15 = r7[r11]
            boolean r15 = r15.hasCustomData(r10)
            if (r15 == 0) goto L_0x0406
            if (r14 != 0) goto L_0x03f5
            double[] r12 = new double[r2]
            r14 = r7[r11]
            int r14 = r14.getCustomDataCount(r10)
            int[] r15 = new int[r5]
            r16 = 1
            r15[r16] = r14
            r15[r6] = r2
            java.lang.Object r14 = java.lang.reflect.Array.newInstance(r1, r15)
            double[][] r14 = (double[][]) r14
        L_0x03f5:
            r15 = r7[r11]
            float r15 = r15.time
            double r5 = (double) r15
            r12[r13] = r5
            r5 = r7[r11]
            r6 = r14[r13]
            r15 = 0
            r5.getCustomData(r10, r6, r15)
            int r13 = r13 + 1
        L_0x0406:
            int r11 = r11 + 1
            r5 = 2
            r6 = 0
            goto L_0x03d3
        L_0x040b:
            double[] r5 = java.util.Arrays.copyOf(r12, r13)
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r14, r13)
            double[][] r6 = (double[][]) r6
            androidx.constraintlayout.core.motion.utils.CurveFit[] r10 = r0.mSpline
            int r9 = r9 + 1
            int r11 = r0.mCurveFitType
            androidx.constraintlayout.core.motion.utils.CurveFit r5 = androidx.constraintlayout.core.motion.utils.CurveFit.get(r11, r5, r6)
            r10[r9] = r5
            r5 = 2
            r6 = 0
            goto L_0x03c8
        L_0x0424:
            androidx.constraintlayout.core.motion.utils.CurveFit[] r5 = r0.mSpline
            int r6 = r0.mCurveFitType
            androidx.constraintlayout.core.motion.utils.CurveFit r3 = androidx.constraintlayout.core.motion.utils.CurveFit.get(r6, r8, r3)
            r6 = 0
            r5[r6] = r3
            r3 = r7[r6]
            int r3 = r3.mPathMotionArc
            int r5 = androidx.constraintlayout.motion.widget.Key.UNSET
            if (r3 == r5) goto L_0x0476
            int[] r3 = new int[r2]
            double[] r5 = new double[r2]
            r8 = 2
            int[] r9 = new int[r8]
            r10 = 1
            r9[r10] = r8
            r9[r6] = r2
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r9)
            double[][] r1 = (double[][]) r1
            r15 = 0
        L_0x044a:
            if (r15 >= r2) goto L_0x0470
            r6 = r7[r15]
            int r6 = r6.mPathMotionArc
            r3[r15] = r6
            r6 = r7[r15]
            float r6 = r6.time
            double r8 = (double) r6
            r5[r15] = r8
            r6 = r1[r15]
            r8 = r7[r15]
            float r8 = r8.f69x
            double r8 = (double) r8
            r10 = 0
            r6[r10] = r8
            r6 = r1[r15]
            r8 = r7[r15]
            float r8 = r8.f70y
            double r8 = (double) r8
            r11 = 1
            r6[r11] = r8
            int r15 = r15 + 1
            goto L_0x044a
        L_0x0470:
            androidx.constraintlayout.core.motion.utils.CurveFit r1 = androidx.constraintlayout.core.motion.utils.CurveFit.getArc(r3, r5, r1)
            r0.mArcSpline = r1
        L_0x0476:
            r1 = 2143289344(0x7fc00000, float:NaN)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r0.mCycleMap = r2
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r2 = r0.mKeyList
            if (r2 == 0) goto L_0x04eb
            java.util.Iterator r2 = r4.iterator()
        L_0x0487:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04b3
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            androidx.constraintlayout.motion.utils.ViewOscillator r4 = androidx.constraintlayout.motion.utils.ViewOscillator.makeSpline(r3)
            if (r4 != 0) goto L_0x049a
            goto L_0x0487
        L_0x049a:
            boolean r5 = r4.variesByPath()
            if (r5 == 0) goto L_0x04aa
            boolean r5 = java.lang.Float.isNaN(r1)
            if (r5 == 0) goto L_0x04aa
            float r1 = r17.getPreCycleDistance()
        L_0x04aa:
            r4.setType(r3)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> r5 = r0.mCycleMap
            r5.put(r3, r4)
            goto L_0x0487
        L_0x04b3:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r2 = r0.mKeyList
            java.util.Iterator r2 = r2.iterator()
        L_0x04b9:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04d1
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.motion.widget.Key r3 = (androidx.constraintlayout.motion.widget.Key) r3
            boolean r4 = r3 instanceof androidx.constraintlayout.motion.widget.KeyCycle
            if (r4 == 0) goto L_0x04b9
            androidx.constraintlayout.motion.widget.KeyCycle r3 = (androidx.constraintlayout.motion.widget.KeyCycle) r3
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> r4 = r0.mCycleMap
            r3.addCycleValues(r4)
            goto L_0x04b9
        L_0x04d1:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> r2 = r0.mCycleMap
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x04db:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04eb
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.motion.utils.ViewOscillator r3 = (androidx.constraintlayout.motion.utils.ViewOscillator) r3
            r3.setup(r1)
            goto L_0x04db
        L_0x04eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionController.setup(int, int, float, long):void");
    }

    public void setupRelative(MotionController motionController) {
        this.mStartMotionPath.setupRelative(motionController, motionController.mStartMotionPath);
        this.mEndMotionPath.setupRelative(motionController, motionController.mEndMotionPath);
    }

    public String toString() {
        return " start: x: " + this.mStartMotionPath.f69x + " y: " + this.mStartMotionPath.f70y + " end: x: " + this.mEndMotionPath.f69x + " y: " + this.mEndMotionPath.f70y;
    }
}
