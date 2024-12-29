package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.util.C1651e;

/* renamed from: com.google.android.gms.measurement.internal.d9 */
final class C2151d9 {

    /* renamed from: a */
    private final C1651e f4069a;

    /* renamed from: b */
    private long f4070b;

    public C2151d9(C1651e eVar) {
        C1609u.m4475k(eVar);
        this.f4069a = eVar;
    }

    /* renamed from: a */
    public final void mo12643a() {
        this.f4070b = this.f4069a.mo11379b();
    }

    /* renamed from: b */
    public final boolean mo12644b(long j) {
        return this.f4070b == 0 || this.f4069a.mo11379b() - this.f4070b >= 3600000;
    }

    /* renamed from: c */
    public final void mo12645c() {
        this.f4070b = 0;
    }
}
