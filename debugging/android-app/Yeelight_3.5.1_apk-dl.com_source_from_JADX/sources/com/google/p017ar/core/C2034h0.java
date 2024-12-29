package com.google.p017ar.core;

import com.google.p017ar.core.exceptions.UnavailableException;
import com.google.p017ar.core.exceptions.UnavailableUserDeclinedInstallationException;

/* renamed from: com.google.ar.core.h0 */
class C2034h0 {

    /* renamed from: a */
    boolean f3184a = false;

    /* renamed from: b */
    final /* synthetic */ InstallActivity f3185b;

    C2034h0(InstallActivity installActivity) {
        this.f3185b = installActivity;
    }

    /* renamed from: a */
    public void mo16646a(C2047o oVar) {
        synchronized (this.f3185b) {
            if (!this.f3184a) {
                C2047o unused = this.f3185b.lastEvent = oVar;
                int ordinal = oVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        this.f3185b.finishWithFailure(new UnavailableUserDeclinedInstallationException());
                    } else if (ordinal == 2) {
                        if (!this.f3185b.waitingForCompletion) {
                            this.f3185b.closeInstaller();
                        }
                        this.f3185b.finishWithFailure((Exception) null);
                    }
                    this.f3184a = true;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo16647b(Exception exc) {
        synchronized (this.f3185b) {
            if (!this.f3184a) {
                this.f3184a = true;
                C2047o unused = this.f3185b.lastEvent = C2047o.CANCELLED;
                boolean z = exc instanceof UnavailableException;
                this.f3185b.finishWithFailure(exc);
            }
        }
    }
}
