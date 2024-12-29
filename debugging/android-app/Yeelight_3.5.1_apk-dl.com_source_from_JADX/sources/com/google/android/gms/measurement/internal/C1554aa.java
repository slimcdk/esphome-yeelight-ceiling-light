package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C0917i;
import p014c0.C0616e;

/* renamed from: com.google.android.gms.measurement.internal.aa */
final class C1554aa {

    /* renamed from: a */
    private final C0616e f1934a;

    /* renamed from: b */
    private long f1935b;

    public C1554aa(C0616e eVar) {
        C0917i.m1419j(eVar);
        this.f1934a = eVar;
    }

    /* renamed from: a */
    public final void mo14014a() {
        this.f1935b = 0;
    }

    /* renamed from: b */
    public final void mo14015b() {
        this.f1935b = this.f1934a.mo11030b();
    }

    /* renamed from: c */
    public final boolean mo14016c(long j) {
        return this.f1935b == 0 || this.f1934a.mo11030b() - this.f1935b >= 3600000;
    }
}
