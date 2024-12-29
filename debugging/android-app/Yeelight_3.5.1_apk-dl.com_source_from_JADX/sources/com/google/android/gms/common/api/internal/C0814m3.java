package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.m3 */
final class C0814m3 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ LifecycleCallback f704a;

    /* renamed from: b */
    final /* synthetic */ String f705b;

    /* renamed from: c */
    final /* synthetic */ C0819n3 f706c;

    C0814m3(C0819n3 n3Var, LifecycleCallback lifecycleCallback, String str) {
        this.f706c = n3Var;
        this.f704a = lifecycleCallback;
        this.f705b = str;
    }

    public final void run() {
        C0819n3 n3Var = this.f706c;
        if (n3Var.f715b > 0) {
            this.f704a.mo11894f(n3Var.f716c != null ? n3Var.f716c.getBundle(this.f705b) : null);
        }
        if (this.f706c.f715b >= 2) {
            this.f704a.mo11898j();
        }
        if (this.f706c.f715b >= 3) {
            this.f704a.mo11896h();
        }
        if (this.f706c.f715b >= 4) {
            this.f704a.mo11899k();
        }
        if (this.f706c.f715b >= 5) {
            this.f704a.mo11895g();
        }
    }
}
