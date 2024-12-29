package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.b2 */
final class C2120b2 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f3961a;

    /* renamed from: b */
    private final /* synthetic */ long f3962b;

    /* renamed from: c */
    private final /* synthetic */ C2390z f3963c;

    C2120b2(C2390z zVar, String str, long j) {
        this.f3963c = zVar;
        this.f3961a = str;
        this.f3962b = j;
    }

    public final void run() {
        this.f3963c.m7788F(this.f3961a, this.f3962b);
    }
}
