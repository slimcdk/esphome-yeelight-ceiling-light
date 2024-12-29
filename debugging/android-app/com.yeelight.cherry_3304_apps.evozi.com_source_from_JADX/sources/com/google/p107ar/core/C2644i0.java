package com.google.p107ar.core;

import android.view.View;
import com.google.p107ar.core.exceptions.UnavailableUserDeclinedInstallationException;

/* renamed from: com.google.ar.core.i0 */
final class C2644i0 implements View.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ InstallActivity f5107a;

    C2644i0(InstallActivity installActivity) {
        this.f5107a = installActivity;
    }

    public final void onClick(View view) {
        this.f5107a.finishWithFailure(new UnavailableUserDeclinedInstallationException());
    }
}
