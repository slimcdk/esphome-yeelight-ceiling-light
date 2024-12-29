package com.google.p017ar.core;

import android.view.View;

/* renamed from: com.google.ar.core.b0 */
final class C2022b0 implements View.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ InstallActivity f3165a;

    C2022b0(InstallActivity installActivity) {
        this.f3165a = installActivity;
    }

    public final void onClick(View view) {
        this.f3165a.animateToSpinner();
        this.f3165a.startInstaller();
    }
}
