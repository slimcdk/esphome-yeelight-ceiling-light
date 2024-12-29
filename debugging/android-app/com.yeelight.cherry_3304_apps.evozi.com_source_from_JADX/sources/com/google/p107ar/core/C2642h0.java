package com.google.p107ar.core;

import android.view.View;

/* renamed from: com.google.ar.core.h0 */
final class C2642h0 implements View.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ InstallActivity f5106a;

    C2642h0(InstallActivity installActivity) {
        this.f5106a = installActivity;
    }

    public final void onClick(View view) {
        this.f5106a.animateToSpinner();
        this.f5106a.startInstaller();
    }
}
