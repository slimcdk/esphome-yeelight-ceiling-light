package com.squareup.okhttp;

import okio.C3564c;

/* renamed from: com.squareup.okhttp.n */
public final class C4297n {

    /* renamed from: b */
    private static final C4307s f6991b = C4307s.m12062c("application/x-www-form-urlencoded");

    /* renamed from: a */
    private final C3564c f6992a = new C3564c();

    /* renamed from: a */
    public C4297n mo27923a(String str, String str2) {
        if (this.f6992a.mo24758i1() > 0) {
            this.f6992a.mo24736R(38);
        }
        C4302q.m12009g(this.f6992a, str, 0, str.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, true);
        this.f6992a.mo24736R(61);
        C4302q.m12009g(this.f6992a, str2, 0, str2.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, true);
        return this;
    }

    /* renamed from: b */
    public C4297n mo27924b(String str, String str2) {
        if (this.f6992a.mo24758i1() > 0) {
            this.f6992a.mo24736R(38);
        }
        C4302q.m12009g(this.f6992a, str, 0, str.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, true);
        this.f6992a.mo24736R(61);
        C4302q.m12009g(this.f6992a, str2, 0, str2.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, true);
        return this;
    }

    /* renamed from: c */
    public C4315w mo27925c() {
        return C4315w.m12158d(f6991b, this.f6992a.mo24761j1());
    }
}
