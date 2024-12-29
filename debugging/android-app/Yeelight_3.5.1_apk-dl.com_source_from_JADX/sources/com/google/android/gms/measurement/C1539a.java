package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.measurement.internal.C1717n5;
import com.google.android.gms.measurement.internal.C1791t7;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.a */
final class C1539a extends C1542d {

    /* renamed from: a */
    private final C1717n5 f1905a;

    /* renamed from: b */
    private final C1791t7 f1906b;

    public C1539a(@NonNull C1717n5 n5Var) {
        super((C1541c) null);
        C0917i.m1419j(n5Var);
        this.f1905a = n5Var;
        this.f1906b = n5Var.mo14377I();
    }

    /* renamed from: D */
    public final long mo13994D() {
        return this.f1905a.mo14382N().mo14679r0();
    }

    /* renamed from: a */
    public final int mo13995a(String str) {
        this.f1906b.mo14551T(str);
        return 25;
    }

    /* renamed from: b */
    public final List mo13996b(String str, String str2) {
        return this.f1906b.mo14560c0(str, str2);
    }

    /* renamed from: c */
    public final String mo13997c() {
        return this.f1906b.mo14556Y();
    }

    /* renamed from: d */
    public final String mo13998d() {
        return this.f1906b.mo14557Z();
    }

    /* renamed from: e */
    public final Map mo13999e(String str, String str2, boolean z) {
        return this.f1906b.mo14561d0(str, str2, z);
    }

    /* renamed from: f */
    public final void mo14000f(Bundle bundle) {
        this.f1906b.mo14539E(bundle);
    }

    /* renamed from: g */
    public final void mo14001g(String str, String str2, Bundle bundle) {
        this.f1906b.mo14567s(str, str2, bundle);
    }

    /* renamed from: h */
    public final String mo14002h() {
        return this.f1906b.mo14558a0();
    }

    /* renamed from: i */
    public final String mo14003i() {
        return this.f1906b.mo14556Y();
    }

    /* renamed from: j */
    public final void mo14004j(String str) {
        this.f1905a.mo14401y().mo14690l(str, this.f1905a.mo14229c().mo11030b());
    }

    /* renamed from: k */
    public final void mo14005k(String str, String str2, Bundle bundle) {
        this.f1905a.mo14377I().mo14563o(str, str2, bundle);
    }

    /* renamed from: l */
    public final void mo14006l(String str) {
        this.f1905a.mo14401y().mo14691m(str, this.f1905a.mo14229c().mo11030b());
    }
}
