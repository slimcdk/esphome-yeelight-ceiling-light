package com.google.p107ar.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.ar.core.t0 */
final class C2665t0 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicBoolean f5156a;

    /* renamed from: b */
    private final /* synthetic */ C2661r0 f5157b;

    C2665t0(C2661r0 r0Var, AtomicBoolean atomicBoolean) {
        this.f5157b = r0Var;
        this.f5156a = atomicBoolean;
    }

    public final void run() {
        if (!this.f5156a.getAndSet(true)) {
            C2661r0 r0Var = this.f5157b;
            C2652m0.m8197n(r0Var.f5146a, r0Var.f5147b);
        }
    }
}
