package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.h2 */
abstract class C1120h2 implements Runnable {

    /* renamed from: a */
    final long f1359a;

    /* renamed from: b */
    final long f1360b;

    /* renamed from: c */
    final boolean f1361c;

    /* renamed from: d */
    final /* synthetic */ C1296s2 f1362d;

    C1120h2(C1296s2 s2Var, boolean z) {
        this.f1362d = s2Var;
        this.f1359a = s2Var.f1588b.mo11029a();
        this.f1360b = s2Var.f1588b.mo11030b();
        this.f1361c = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo12515b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo12516c() {
    }

    public final void run() {
        if (this.f1362d.f1593g) {
            mo12516c();
            return;
        }
        try {
            mo12515b();
        } catch (Exception e) {
            this.f1362d.m2737i(e, false, this.f1361c);
            mo12516c();
        }
    }
}
