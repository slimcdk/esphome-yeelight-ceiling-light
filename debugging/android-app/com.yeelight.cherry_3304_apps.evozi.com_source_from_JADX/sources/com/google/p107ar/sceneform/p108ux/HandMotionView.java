package com.google.p107ar.sceneform.p108ux;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;

/* renamed from: com.google.ar.sceneform.ux.HandMotionView */
public class HandMotionView extends AppCompatImageView {
    private static final long ANIMATION_SPEED_MS = 2500;
    private HandMotionAnimation animation;

    public HandMotionView(Context context) {
        super(context);
    }

    public HandMotionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        clearAnimation();
        HandMotionAnimation handMotionAnimation = new HandMotionAnimation((FrameLayout) ((Activity) getContext()).findViewById(C2792R.C2794id.sceneform_hand_layout), this);
        this.animation = handMotionAnimation;
        handMotionAnimation.setRepeatCount(-1);
        this.animation.setDuration(ANIMATION_SPEED_MS);
        this.animation.setStartOffset(1000);
        startAnimation(this.animation);
    }
}
