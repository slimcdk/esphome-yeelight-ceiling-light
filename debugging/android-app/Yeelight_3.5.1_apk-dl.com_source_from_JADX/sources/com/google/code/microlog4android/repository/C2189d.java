package com.google.code.microlog4android.repository;

import com.google.code.microlog4android.Level;
import java.util.Hashtable;
import p080p0.C3592a;

/* renamed from: com.google.code.microlog4android.repository.d */
public class C2189d extends C2186a {

    /* renamed from: b */
    private C2189d f3481b = null;

    /* renamed from: c */
    private Hashtable<String, C2189d> f3482c = new Hashtable<>(17);

    /* renamed from: d */
    private C3592a f3483d;

    public C2189d(String str, C2189d dVar) {
        this.f3480a = str;
        this.f3481b = dVar;
        C3592a aVar = new C3592a(str);
        this.f3483d = aVar;
        aVar.mo25883s(DefaultLoggerRepository.INSTANCE);
    }

    public C2189d(String str, C3592a aVar) {
        this.f3480a = str;
        this.f3483d = aVar;
    }

    public C2189d(String str, C3592a aVar, C2189d dVar) {
        this.f3480a = str;
        this.f3483d = aVar;
        this.f3481b = dVar;
    }

    /* renamed from: b */
    public void mo18490b(C2189d dVar) {
        this.f3482c.put(dVar.mo18489a(), dVar);
    }

    /* renamed from: c */
    public C2189d mo18491c(String str) {
        return this.f3482c.get(str);
    }

    /* renamed from: d */
    public C3592a mo18492d() {
        return this.f3483d;
    }

    /* renamed from: e */
    public C2189d mo18493e() {
        return this.f3481b;
    }

    /* renamed from: f */
    public void mo18494f() {
        this.f3482c.clear();
        this.f3483d.mo25881q();
        this.f3483d.mo25884t(Level.DEBUG);
    }
}
