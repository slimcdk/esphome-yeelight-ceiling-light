package com.google.p107ar.core;

import android.content.Context;

/* renamed from: com.google.ar.core.v0 */
final class C2669v0 extends Thread {

    /* renamed from: a */
    private final Context f5164a;

    /* renamed from: b */
    private final C2656o0 f5165b;

    /* renamed from: c */
    private volatile boolean f5166c;

    C2669v0(Context context, C2656o0 o0Var) {
        this.f5164a = context;
        this.f5165b = o0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo15223b() {
        this.f5166c = true;
    }

    public final void run() {
        while (!this.f5166c) {
            if (C2636e0.m8169c().mo15187g(this.f5164a)) {
                this.f5165b.mo15207a(C2650l0.COMPLETED);
                return;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException unused) {
            }
        }
    }
}
