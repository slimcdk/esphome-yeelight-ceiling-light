package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.a */
final class C2105a implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f3898a;

    /* renamed from: b */
    private final /* synthetic */ long f3899b;

    /* renamed from: c */
    private final /* synthetic */ C2390z f3900c;

    C2105a(C2390z zVar, String str, long j) {
        this.f3900c = zVar;
        this.f3898a = str;
        this.f3899b = j;
    }

    public final void run() {
        this.f3900c.m7787E(this.f3898a, this.f3899b);
    }
}
