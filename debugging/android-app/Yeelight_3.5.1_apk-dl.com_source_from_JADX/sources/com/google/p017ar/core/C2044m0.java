package com.google.p017ar.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.ar.core.m0 */
final class C2044m0 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicBoolean f3201a;

    /* renamed from: b */
    private final /* synthetic */ C2040k0 f3202b;

    C2044m0(C2040k0 k0Var, AtomicBoolean atomicBoolean) {
        this.f3202b = k0Var;
        this.f3201a = atomicBoolean;
    }

    public final void run() {
        if (!this.f3201a.getAndSet(true)) {
            C2040k0 k0Var = this.f3202b;
            C2030f0.m5134n(k0Var.f3192a, k0Var.f3193b);
        }
    }
}
