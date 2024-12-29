package com.google.p107ar.core;

import com.google.p107ar.core.exceptions.UnavailableException;
import com.google.p107ar.core.exceptions.UnavailableUserDeclinedInstallationException;

/* renamed from: com.google.ar.core.o0 */
class C2656o0 {

    /* renamed from: a */
    boolean f5135a = false;

    /* renamed from: b */
    final /* synthetic */ InstallActivity f5136b;

    C2656o0(InstallActivity installActivity) {
        this.f5136b = installActivity;
    }

    /* renamed from: a */
    public void mo15207a(C2650l0 l0Var) {
        synchronized (this.f5136b) {
            if (!this.f5135a) {
                C2650l0 unused = this.f5136b.lastEvent = l0Var;
                int ordinal = l0Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        this.f5136b.finishWithFailure(new UnavailableUserDeclinedInstallationException());
                    } else if (ordinal == 2) {
                        if (!this.f5136b.waitingForCompletion) {
                            this.f5136b.closeInstaller();
                        }
                        this.f5136b.finishWithFailure((Exception) null);
                    }
                    this.f5135a = true;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo15208b(Exception exc) {
        synchronized (this.f5136b) {
            if (!this.f5135a) {
                this.f5135a = true;
                C2650l0 unused = this.f5136b.lastEvent = C2650l0.CANCELLED;
                boolean z = exc instanceof UnavailableException;
                this.f5136b.finishWithFailure(exc);
            }
        }
    }
}
