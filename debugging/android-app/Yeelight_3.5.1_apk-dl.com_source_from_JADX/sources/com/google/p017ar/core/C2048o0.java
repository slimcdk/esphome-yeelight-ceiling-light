package com.google.p017ar.core;

import android.content.Context;

/* renamed from: com.google.ar.core.o0 */
final class C2048o0 extends Thread {

    /* renamed from: a */
    private final Context f3211a;

    /* renamed from: b */
    private final C2034h0 f3212b;

    /* renamed from: c */
    private volatile boolean f3213c;

    C2048o0(Context context, C2034h0 h0Var) {
        this.f3211a = context;
        this.f3212b = h0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo16662b() {
        this.f3213c = true;
    }

    public final void run() {
        while (!this.f3213c) {
            if (C2058z.m5159c().mo16679g(this.f3211a)) {
                this.f3212b.mo16646a(C2047o.COMPLETED);
                return;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException unused) {
            }
        }
    }
}
