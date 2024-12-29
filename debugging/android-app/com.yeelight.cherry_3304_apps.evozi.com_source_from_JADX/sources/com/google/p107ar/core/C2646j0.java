package com.google.p107ar.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.ar.core.j0 */
final class C2646j0 extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final /* synthetic */ InstallActivity f5108a;

    C2646j0(InstallActivity installActivity) {
        this.f5108a = installActivity;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f5108a.showSpinner();
    }
}
