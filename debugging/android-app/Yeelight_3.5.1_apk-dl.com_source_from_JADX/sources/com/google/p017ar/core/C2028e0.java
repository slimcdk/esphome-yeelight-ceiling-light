package com.google.p017ar.core;

import android.animation.ValueAnimator;

/* renamed from: com.google.ar.core.e0 */
final class C2028e0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final /* synthetic */ int f3168a;

    /* renamed from: b */
    private final /* synthetic */ int f3169b;

    /* renamed from: c */
    private final /* synthetic */ int f3170c;

    /* renamed from: d */
    private final /* synthetic */ InstallActivity f3171d;

    C2028e0(InstallActivity installActivity, int i, int i2, int i3) {
        this.f3171d = installActivity;
        this.f3168a = i;
        this.f3169b = i2;
        this.f3170c = i3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
        float animatedFraction2 = valueAnimator.getAnimatedFraction();
        int i = this.f3169b;
        this.f3171d.getWindow().setLayout((int) ((((float) this.f3168a) * animatedFraction) + (((float) i) * animatedFraction2)), (int) ((((float) this.f3170c) * animatedFraction) + (((float) i) * animatedFraction2)));
        this.f3171d.getWindow().getDecorView().refreshDrawableState();
    }
}
