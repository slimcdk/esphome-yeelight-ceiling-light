package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.f1 */
final class C0775f1 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0780g1 f610a;

    C0775f1(C0780g1 g1Var) {
        this.f610a = g1Var;
    }

    public final void run() {
        C0785h1 h1Var = this.f610a.f636a;
        h1Var.f645b.disconnect(h1Var.f645b.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
