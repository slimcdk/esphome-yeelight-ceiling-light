package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.x6 */
final class C1838x6 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f2764a;

    /* renamed from: b */
    final /* synthetic */ C1791t7 f2765b;

    C1838x6(C1791t7 t7Var, long j) {
        this.f2765b = t7Var;
        this.f2764a = j;
    }

    public final void run() {
        this.f2765b.f2143a.mo14375F().f2569k.mo14369b(this.f2764a);
        this.f2765b.f2143a.mo14228b().mo14034q().mo14694b("Session timeout duration set", Long.valueOf(this.f2764a));
    }
}
