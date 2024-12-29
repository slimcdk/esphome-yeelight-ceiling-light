package com.google.p017ar.sceneform.p018ux;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: com.google.ar.sceneform.ux.HandMotionAnimation */
public class HandMotionAnimation extends Animation {
    private static final float HALF_PI = 1.5707964f;
    private static final float TWO_PI = 6.2831855f;
    private final View containerView;
    private final View handImageView;

    public HandMotionAnimation(View view, View view2) {
        this.handImageView = view2;
        this.containerView = view;
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        float f2 = (f * TWO_PI) + HALF_PI;
        float f3 = this.handImageView.getResources().getDisplayMetrics().density * 25.0f;
        double d = (double) f2;
        float cos = f3 * 2.0f * ((float) Math.cos(d));
        float sin = f3 * ((float) Math.sin(d));
        float width = cos + (((float) this.containerView.getWidth()) / 2.0f);
        float height = (sin + (((float) this.containerView.getHeight()) / 2.0f)) - (((float) this.handImageView.getHeight()) / 2.0f);
        this.handImageView.setX(width - (((float) this.handImageView.getWidth()) / 2.0f));
        this.handImageView.setY(height);
        this.handImageView.invalidate();
    }
}
