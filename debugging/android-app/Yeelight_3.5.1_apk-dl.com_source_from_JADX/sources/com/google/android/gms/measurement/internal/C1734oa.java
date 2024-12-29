package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.internal.measurement.C1122h4;
import com.google.android.gms.internal.measurement.C1298s4;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.oa */
final class C1734oa {

    /* renamed from: a */
    C1298s4 f2495a;

    /* renamed from: b */
    List f2496b;

    /* renamed from: c */
    List f2497c;

    /* renamed from: d */
    long f2498d;

    /* renamed from: e */
    final /* synthetic */ C1770ra f2499e;

    /* synthetic */ C1734oa(C1770ra raVar, C1722na naVar) {
        this.f2499e = raVar;
    }

    /* renamed from: b */
    private static final long m4539b(C1122h4 h4Var) {
        return ((h4Var.mo12852A() / 1000) / 60) / 60;
    }

    /* renamed from: a */
    public final boolean mo14413a(long j, C1122h4 h4Var) {
        C0917i.m1419j(h4Var);
        if (this.f2497c == null) {
            this.f2497c = new ArrayList();
        }
        if (this.f2496b == null) {
            this.f2496b = new ArrayList();
        }
        if (!this.f2497c.isEmpty() && m4539b((C1122h4) this.f2497c.get(0)) != m4539b(h4Var)) {
            return false;
        }
        long c = this.f2498d + ((long) h4Var.mo12908c());
        this.f2499e.mo14464T();
        if (c >= ((long) Math.max(0, ((Integer) C1727o3.f2445i.mo14366a((Object) null)).intValue()))) {
            return false;
        }
        this.f2498d = c;
        this.f2497c.add(h4Var);
        this.f2496b.add(Long.valueOf(j));
        int size = this.f2497c.size();
        this.f2499e.mo14464T();
        return size < Math.max(1, ((Integer) C1727o3.f2447j.mo14366a((Object) null)).intValue());
    }
}
