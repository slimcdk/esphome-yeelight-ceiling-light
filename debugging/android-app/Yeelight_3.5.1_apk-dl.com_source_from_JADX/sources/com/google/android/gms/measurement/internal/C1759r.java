package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C0917i;

/* renamed from: com.google.android.gms.measurement.internal.r */
final class C1759r {

    /* renamed from: a */
    final String f2546a;

    /* renamed from: b */
    final String f2547b;

    /* renamed from: c */
    final long f2548c;

    /* renamed from: d */
    final long f2549d;

    /* renamed from: e */
    final long f2550e;

    /* renamed from: f */
    final long f2551f;

    /* renamed from: g */
    final long f2552g;

    /* renamed from: h */
    final Long f2553h;

    /* renamed from: i */
    final Long f2554i;

    /* renamed from: j */
    final Long f2555j;

    /* renamed from: k */
    final Boolean f2556k;

    C1759r(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        long j6 = j;
        long j7 = j2;
        long j8 = j3;
        long j9 = j5;
        C0917i.m1415f(str);
        C0917i.m1415f(str2);
        boolean z = true;
        C0917i.m1410a(j6 >= 0);
        C0917i.m1410a(j7 >= 0);
        C0917i.m1410a(j8 >= 0);
        C0917i.m1410a(j9 < 0 ? false : z);
        this.f2546a = str;
        this.f2547b = str2;
        this.f2548c = j6;
        this.f2549d = j7;
        this.f2550e = j8;
        this.f2551f = j4;
        this.f2552g = j9;
        this.f2553h = l;
        this.f2554i = l2;
        this.f2555j = l3;
        this.f2556k = bool;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C1759r mo14442a(Long l, Long l2, Boolean bool) {
        return new C1759r(this.f2546a, this.f2547b, this.f2548c, this.f2549d, this.f2550e, this.f2551f, this.f2552g, this.f2553h, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C1759r mo14443b(long j, long j2) {
        return new C1759r(this.f2546a, this.f2547b, this.f2548c, this.f2549d, this.f2550e, this.f2551f, j, Long.valueOf(j2), this.f2554i, this.f2555j, this.f2556k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C1759r mo14444c(long j) {
        return new C1759r(this.f2546a, this.f2547b, this.f2548c, this.f2549d, this.f2550e, j, this.f2552g, this.f2553h, this.f2554i, this.f2555j, this.f2556k);
    }
}
