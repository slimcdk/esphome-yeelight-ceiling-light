package com.google.p017ar.core;

import android.os.Bundle;
import com.google.p017ar.core.exceptions.FatalException;
import java.util.concurrent.atomic.AtomicBoolean;
import p027e.C3141e;

/* renamed from: com.google.ar.core.n0 */
final class C2046n0 extends C3141e {

    /* renamed from: a */
    private final /* synthetic */ AtomicBoolean f3205a;

    /* renamed from: b */
    private final /* synthetic */ C2040k0 f3206b;

    C2046n0(C2040k0 k0Var, AtomicBoolean atomicBoolean) {
        this.f3206b = k0Var;
        this.f3205a = atomicBoolean;
    }

    /* renamed from: R */
    public final void mo16649R(Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo16650a() {
    }

    /* renamed from: m */
    public final void mo16651m(Bundle bundle) {
        if (!this.f3205a.getAndSet(true)) {
            int i = bundle.getInt("error.code", -100);
            int i2 = bundle.getInt("install.status", 0);
            if (i2 == 4) {
                this.f3206b.f3193b.mo16646a(C2047o.COMPLETED);
            } else if (i != 0) {
                StringBuilder sb = new StringBuilder(51);
                sb.append("requestInstall = ");
                sb.append(i);
                sb.append(", launching fullscreen.");
                C2040k0 k0Var = this.f3206b;
                C2030f0.m5134n(k0Var.f3192a, k0Var.f3193b);
            } else if (bundle.containsKey("resolution.intent")) {
                C2040k0 k0Var2 = this.f3206b;
                C2030f0.m5125b(k0Var2.f3192a, bundle, k0Var2.f3193b);
            } else if (i2 != 10) {
                C2034h0 h0Var = this.f3206b.f3193b;
                switch (i2) {
                    case 1:
                    case 2:
                    case 3:
                        h0Var.mo16646a(C2047o.ACCEPTED);
                        return;
                    case 4:
                        h0Var.mo16646a(C2047o.COMPLETED);
                        return;
                    case 5:
                        h0Var.mo16647b(new FatalException("Unexpected FAILED install status without error."));
                        return;
                    case 6:
                        h0Var.mo16646a(C2047o.CANCELLED);
                        return;
                    default:
                        StringBuilder sb2 = new StringBuilder(38);
                        sb2.append("Unexpected install status: ");
                        sb2.append(i2);
                        h0Var.mo16647b(new FatalException(sb2.toString()));
                        return;
                }
            } else {
                this.f3206b.f3193b.mo16647b(new FatalException("Unexpected REQUIRES_UI_INTENT install status without an intent."));
            }
        }
    }
}
