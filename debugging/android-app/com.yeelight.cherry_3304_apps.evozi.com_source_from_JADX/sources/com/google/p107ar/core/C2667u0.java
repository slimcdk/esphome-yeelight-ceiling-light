package com.google.p107ar.core;

import android.os.Bundle;
import com.google.p107ar.core.exceptions.FatalException;
import java.util.concurrent.atomic.AtomicBoolean;
import p011c.p012a.p013a.p015b.p016a.p017a.p018a.C0457e;

/* renamed from: com.google.ar.core.u0 */
final class C2667u0 extends C0457e {

    /* renamed from: a */
    private final /* synthetic */ AtomicBoolean f5160a;

    /* renamed from: b */
    private final /* synthetic */ C2661r0 f5161b;

    C2667u0(C2661r0 r0Var, AtomicBoolean atomicBoolean) {
        this.f5161b = r0Var;
        this.f5160a = atomicBoolean;
    }

    /* renamed from: a */
    public final void mo8388a() {
    }

    /* renamed from: b0 */
    public final void mo8389b0(Bundle bundle) {
    }

    /* renamed from: q */
    public final void mo8390q(Bundle bundle) {
        if (!this.f5160a.getAndSet(true)) {
            int i = bundle.getInt("error.code", -100);
            int i2 = bundle.getInt("install.status", 0);
            if (i2 == 4) {
                this.f5161b.f5147b.mo15207a(C2650l0.COMPLETED);
            } else if (i != 0) {
                StringBuilder sb = new StringBuilder(51);
                sb.append("requestInstall = ");
                sb.append(i);
                sb.append(", launching fullscreen.");
                sb.toString();
                C2661r0 r0Var = this.f5161b;
                C2652m0.m8197n(r0Var.f5146a, r0Var.f5147b);
            } else if (bundle.containsKey("resolution.intent")) {
                C2661r0 r0Var2 = this.f5161b;
                C2652m0.m8188b(r0Var2.f5146a, bundle, r0Var2.f5147b);
            } else if (i2 != 10) {
                C2656o0 o0Var = this.f5161b.f5147b;
                switch (i2) {
                    case 1:
                    case 2:
                    case 3:
                        o0Var.mo15207a(C2650l0.ACCEPTED);
                        return;
                    case 4:
                        o0Var.mo15207a(C2650l0.COMPLETED);
                        return;
                    case 5:
                        o0Var.mo15208b(new FatalException("Unexpected FAILED install status without error."));
                        return;
                    case 6:
                        o0Var.mo15207a(C2650l0.CANCELLED);
                        return;
                    default:
                        StringBuilder sb2 = new StringBuilder(38);
                        sb2.append("Unexpected install status: ");
                        sb2.append(i2);
                        o0Var.mo15208b(new FatalException(sb2.toString()));
                        return;
                }
            } else {
                this.f5161b.f5147b.mo15208b(new FatalException("Unexpected REQUIRES_UI_INTENT install status without an intent."));
            }
        }
    }
}
