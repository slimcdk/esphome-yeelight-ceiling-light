package androidx.constraintlayout.core.motion.utils;

import com.xiaomi.mipush.sdk.Constants;
import java.io.PrintStream;

public class SpringStopEngine implements StopEngine {
    private static final double UNSET = Double.MAX_VALUE;
    private int mBoundaryMode = 0;
    double mDamping = 0.5d;
    private boolean mInitialized = false;
    private float mLastTime;
    private double mLastVelocity;
    private float mMass;
    private float mPos;
    private double mStiffness;
    private float mStopThreshold;
    private double mTargetPos;

    /* renamed from: mV */
    private float f40mV;

    private void compute(double d) {
        double d2 = this.mStiffness;
        double d3 = this.mDamping;
        double d4 = (double) this.mMass;
        Double.isNaN(d4);
        int sqrt = (int) ((9.0d / ((Math.sqrt(d2 / d4) * d) * 4.0d)) + 1.0d);
        double d5 = (double) sqrt;
        Double.isNaN(d5);
        double d6 = d / d5;
        int i = 0;
        while (i < sqrt) {
            float f = this.mPos;
            double d7 = (double) f;
            double d8 = this.mTargetPos;
            Double.isNaN(d7);
            double d9 = (-d2) * (d7 - d8);
            float f2 = this.f40mV;
            double d10 = d2;
            double d11 = (double) f2;
            Double.isNaN(d11);
            double d12 = d9 - (d11 * d3);
            float f3 = this.mMass;
            double d13 = d3;
            double d14 = (double) f3;
            Double.isNaN(d14);
            double d15 = d12 / d14;
            double d16 = (double) f2;
            Double.isNaN(d16);
            double d17 = d16 + ((d15 * d6) / 2.0d);
            double d18 = (double) f;
            Double.isNaN(d18);
            double d19 = (double) f3;
            Double.isNaN(d19);
            double d20 = ((((-((d18 + ((d6 * d17) / 2.0d)) - d8)) * d10) - (d17 * d13)) / d19) * d6;
            double d21 = (double) f2;
            Double.isNaN(d21);
            double d22 = (double) f2;
            Double.isNaN(d22);
            float f4 = (float) (d22 + d20);
            this.f40mV = f4;
            double d23 = (double) f;
            Double.isNaN(d23);
            float f5 = (float) (d23 + ((d21 + (d20 / 2.0d)) * d6));
            this.mPos = f5;
            int i2 = this.mBoundaryMode;
            if (i2 > 0) {
                if (f5 < 0.0f && (i2 & 1) == 1) {
                    this.mPos = -f5;
                    this.f40mV = -f4;
                }
                float f6 = this.mPos;
                if (f6 > 1.0f && (i2 & 2) == 2) {
                    this.mPos = 2.0f - f6;
                    this.f40mV = -this.f40mV;
                }
            }
            i++;
            d2 = d10;
            d3 = d13;
        }
    }

    public String debug(String str, float f) {
        return null;
    }

    public float getAcceleration() {
        double d = this.mStiffness;
        double d2 = this.mDamping;
        double d3 = (double) this.mPos;
        double d4 = this.mTargetPos;
        Double.isNaN(d3);
        double d5 = (-d) * (d3 - d4);
        double d6 = (double) this.f40mV;
        Double.isNaN(d6);
        return ((float) (d5 - (d2 * d6))) / this.mMass;
    }

    public float getInterpolation(float f) {
        compute((double) (f - this.mLastTime));
        this.mLastTime = f;
        return this.mPos;
    }

    public float getVelocity() {
        return 0.0f;
    }

    public float getVelocity(float f) {
        return this.f40mV;
    }

    public boolean isStopped() {
        double d = (double) this.mPos;
        double d2 = this.mTargetPos;
        Double.isNaN(d);
        double d3 = d - d2;
        double d4 = this.mStiffness;
        double d5 = (double) this.f40mV;
        double d6 = (double) this.mMass;
        Double.isNaN(d5);
        Double.isNaN(d5);
        Double.isNaN(d6);
        return Math.sqrt((((d5 * d5) * d6) + ((d4 * d3) * d3)) / d4) <= ((double) this.mStopThreshold);
    }

    /* access modifiers changed from: package-private */
    public void log(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        PrintStream printStream = System.out;
        printStream.println((".(" + stackTraceElement.getFileName() + Constants.COLON_SEPARATOR + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "() ") + str);
    }

    public void springConfig(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        this.mTargetPos = (double) f2;
        this.mDamping = (double) f6;
        this.mInitialized = false;
        this.mPos = f;
        this.mLastVelocity = (double) f3;
        this.mStiffness = (double) f5;
        this.mMass = f4;
        this.mStopThreshold = f7;
        this.mBoundaryMode = i;
        this.mLastTime = 0.0f;
    }
}
