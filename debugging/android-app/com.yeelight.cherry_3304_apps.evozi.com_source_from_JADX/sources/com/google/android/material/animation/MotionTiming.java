package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MotionTiming {
    private long delay = 0;
    private long duration = 300;
    @Nullable
    private TimeInterpolator interpolator = null;
    private int repeatCount = 0;
    private int repeatMode = 1;

    public MotionTiming(long j, long j2) {
        this.delay = j;
        this.duration = j2;
    }

    public MotionTiming(long j, long j2, @NonNull TimeInterpolator timeInterpolator) {
        this.delay = j;
        this.duration = j2;
        this.interpolator = timeInterpolator;
    }

    static MotionTiming createFromAnimator(ValueAnimator valueAnimator) {
        MotionTiming motionTiming = new MotionTiming(valueAnimator.getStartDelay(), valueAnimator.getDuration(), getInterpolatorCompat(valueAnimator));
        motionTiming.repeatCount = valueAnimator.getRepeatCount();
        motionTiming.repeatMode = valueAnimator.getRepeatMode();
        return motionTiming;
    }

    private static TimeInterpolator getInterpolatorCompat(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator2 = valueAnimator.getInterpolator();
        return ((interpolator2 instanceof AccelerateDecelerateInterpolator) || interpolator2 == null) ? AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR : interpolator2 instanceof AccelerateInterpolator ? AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR : interpolator2 instanceof DecelerateInterpolator ? AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR : interpolator2;
    }

    public void apply(Animator animator) {
        animator.setStartDelay(getDelay());
        animator.setDuration(getDuration());
        animator.setInterpolator(getInterpolator());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(getRepeatCount());
            valueAnimator.setRepeatMode(getRepeatMode());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MotionTiming.class != obj.getClass()) {
            return false;
        }
        MotionTiming motionTiming = (MotionTiming) obj;
        if (getDelay() == motionTiming.getDelay() && getDuration() == motionTiming.getDuration() && getRepeatCount() == motionTiming.getRepeatCount() && getRepeatMode() == motionTiming.getRepeatMode()) {
            return getInterpolator().getClass().equals(motionTiming.getInterpolator().getClass());
        }
        return false;
    }

    public long getDelay() {
        return this.delay;
    }

    public long getDuration() {
        return this.duration;
    }

    public TimeInterpolator getInterpolator() {
        TimeInterpolator timeInterpolator = this.interpolator;
        return timeInterpolator != null ? timeInterpolator : AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    }

    public int getRepeatCount() {
        return this.repeatCount;
    }

    public int getRepeatMode() {
        return this.repeatMode;
    }

    public int hashCode() {
        return (((((((((int) (getDelay() ^ (getDelay() >>> 32))) * 31) + ((int) (getDuration() ^ (getDuration() >>> 32)))) * 31) + getInterpolator().getClass().hashCode()) * 31) + getRepeatCount()) * 31) + getRepeatMode();
    }

    public String toString() {
        return 10 + MotionTiming.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + getDelay() + " duration: " + getDuration() + " interpolator: " + getInterpolator().getClass() + " repeatCount: " + getRepeatCount() + " repeatMode: " + getRepeatMode() + "}\n";
    }
}
