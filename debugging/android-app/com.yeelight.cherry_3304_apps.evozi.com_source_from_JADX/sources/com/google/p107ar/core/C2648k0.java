package com.google.p107ar.core;

import android.animation.ValueAnimator;

/* renamed from: com.google.ar.core.k0 */
final class C2648k0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final /* synthetic */ int f5110a;

    /* renamed from: b */
    private final /* synthetic */ int f5111b;

    /* renamed from: c */
    private final /* synthetic */ int f5112c;

    /* renamed from: d */
    private final /* synthetic */ InstallActivity f5113d;

    C2648k0(InstallActivity installActivity, int i, int i2, int i3) {
        this.f5113d = installActivity;
        this.f5110a = i;
        this.f5111b = i2;
        this.f5112c = i3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
        float animatedFraction2 = valueAnimator.getAnimatedFraction();
        int i = this.f5111b;
        this.f5113d.getWindow().setLayout((int) ((((float) this.f5110a) * animatedFraction) + (((float) i) * animatedFraction2)), (int) ((((float) this.f5112c) * animatedFraction) + (((float) i) * animatedFraction2)));
        this.f5113d.getWindow().getDecorView().refreshDrawableState();
    }
}
