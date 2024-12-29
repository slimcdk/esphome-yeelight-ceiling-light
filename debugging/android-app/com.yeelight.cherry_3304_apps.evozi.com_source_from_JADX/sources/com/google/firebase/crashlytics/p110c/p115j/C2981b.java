package com.google.firebase.crashlytics.p110c.p115j;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p156f.C4318a0;
import p156f.C4322b0;
import p156f.C4334d;
import p156f.C4390t;
import p156f.C4392v;
import p156f.C4393w;
import p156f.C4396x;

/* renamed from: com.google.firebase.crashlytics.c.j.b */
public class C2981b {

    /* renamed from: f */
    private static final C4396x f5795f;

    /* renamed from: a */
    private final C2980a f5796a;

    /* renamed from: b */
    private final String f5797b;

    /* renamed from: c */
    private final Map<String, String> f5798c;

    /* renamed from: d */
    private final Map<String, String> f5799d;

    /* renamed from: e */
    private C4393w.C4394a f5800e = null;

    static {
        C4396x.C4398b v = new C4396x().mo24169v();
        v.mo24176d(10000, TimeUnit.MILLISECONDS);
        f5795f = v.mo24174b();
    }

    public C2981b(C2980a aVar, String str, Map<String, String> map) {
        this.f5796a = aVar;
        this.f5797b = str;
        this.f5798c = map;
        this.f5799d = new HashMap();
    }

    /* renamed from: a */
    private C4318a0 m9150a() {
        C4318a0.C4319a aVar = new C4318a0.C4319a();
        C4334d.C4335a aVar2 = new C4334d.C4335a();
        aVar2.mo23897c();
        aVar.mo23819c(aVar2.mo23895a());
        C4390t.C4391a p = C4390t.m12624r(this.f5797b).mo24116p();
        for (Map.Entry next : this.f5798c.entrySet()) {
            p.mo24121a((String) next.getKey(), (String) next.getValue());
        }
        aVar.mo23825i(p.mo24123c());
        for (Map.Entry next2 : this.f5799d.entrySet()) {
            aVar.mo23820d((String) next2.getKey(), (String) next2.getValue());
        }
        C4393w.C4394a aVar3 = this.f5800e;
        aVar.mo23822f(this.f5796a.name(), aVar3 == null ? null : aVar3.mo24144e());
        return aVar.mo23818b();
    }

    /* renamed from: c */
    private C4393w.C4394a m9151c() {
        if (this.f5800e == null) {
            C4393w.C4394a aVar = new C4393w.C4394a();
            aVar.mo24145f(C4393w.f7856f);
            this.f5800e = aVar;
        }
        return this.f5800e;
    }

    /* renamed from: b */
    public C2983d mo17333b() {
        return C2983d.m9159c(f5795f.mo23907a(m9150a()).mo23903J());
    }

    /* renamed from: d */
    public C2981b mo17334d(String str, String str2) {
        this.f5799d.put(str, str2);
        return this;
    }

    /* renamed from: e */
    public C2981b mo17335e(Map.Entry<String, String> entry) {
        mo17334d(entry.getKey(), entry.getValue());
        return this;
    }

    /* renamed from: f */
    public String mo17336f() {
        return this.f5796a.name();
    }

    /* renamed from: g */
    public C2981b mo17337g(String str, String str2) {
        C4393w.C4394a c = m9151c();
        c.mo24140a(str, str2);
        this.f5800e = c;
        return this;
    }

    /* renamed from: h */
    public C2981b mo17338h(String str, String str2, String str3, File file) {
        C4322b0 c = C4322b0.m12218c(C4392v.m12671d(str3), file);
        C4393w.C4394a c2 = m9151c();
        c2.mo24141b(str, str2, c);
        this.f5800e = c2;
        return this;
    }
}
