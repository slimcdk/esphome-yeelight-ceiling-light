package com.google.p017ar.core;

import android.view.View;
import com.google.p017ar.core.exceptions.UnavailableUserDeclinedInstallationException;

/* renamed from: com.google.ar.core.c0 */
final class C2024c0 implements View.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ InstallActivity f3166a;

    C2024c0(InstallActivity installActivity) {
        this.f3166a = installActivity;
    }

    public final void onClick(View view) {
        this.f3166a.finishWithFailure(new UnavailableUserDeclinedInstallationException());
    }
}
