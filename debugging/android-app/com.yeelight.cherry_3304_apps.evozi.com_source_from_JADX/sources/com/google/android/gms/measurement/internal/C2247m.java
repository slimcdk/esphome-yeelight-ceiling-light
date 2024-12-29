package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1609u;

/* renamed from: com.google.android.gms.measurement.internal.m */
final class C2247m {

    /* renamed from: a */
    final String f4343a;

    /* renamed from: b */
    final String f4344b;

    /* renamed from: c */
    final long f4345c;

    /* renamed from: d */
    final long f4346d;

    /* renamed from: e */
    final long f4347e;

    /* renamed from: f */
    final long f4348f;

    /* renamed from: g */
    final long f4349g;

    /* renamed from: h */
    final Long f4350h;

    /* renamed from: i */
    final Long f4351i;

    /* renamed from: j */
    final Long f4352j;

    /* renamed from: k */
    final Boolean f4353k;

    C2247m(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        long j6 = j;
        long j7 = j2;
        long j8 = j3;
        long j9 = j5;
        C1609u.m4471g(str);
        C1609u.m4471g(str2);
        boolean z = true;
        C1609u.m4465a(j6 >= 0);
        C1609u.m4465a(j7 >= 0);
        C1609u.m4465a(j8 >= 0);
        C1609u.m4465a(j9 < 0 ? false : z);
        this.f4343a = str;
        this.f4344b = str2;
        this.f4345c = j6;
        this.f4346d = j7;
        this.f4347e = j8;
        this.f4348f = j4;
        this.f4349g = j9;
        this.f4350h = l;
        this.f4351i = l2;
        this.f4352j = l3;
        this.f4353k = bool;
    }

    C2247m(String str, String str2, long j, long j2, long j3, long j4, Long l, Long l2, Long l3, Boolean bool) {
        this(str, str2, 0, 0, 0, j3, 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C2247m mo12841a(long j) {
        return new C2247m(this.f4343a, this.f4344b, this.f4345c, this.f4346d, this.f4347e, j, this.f4349g, this.f4350h, this.f4351i, this.f4352j, this.f4353k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C2247m mo12842b(long j, long j2) {
        return new C2247m(this.f4343a, this.f4344b, this.f4345c, this.f4346d, this.f4347e, this.f4348f, j, Long.valueOf(j2), this.f4351i, this.f4352j, this.f4353k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C2247m mo12843c(Long l, Long l2, Boolean bool) {
        return new C2247m(this.f4343a, this.f4344b, this.f4345c, this.f4346d, this.f4347e, this.f4348f, this.f4349g, this.f4350h, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }
}
