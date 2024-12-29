package com.google.p017ar.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.ar.core.d0 */
final class C2026d0 extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final /* synthetic */ InstallActivity f3167a;

    C2026d0(InstallActivity installActivity) {
        this.f3167a = installActivity;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f3167a.showSpinner();
    }
}
