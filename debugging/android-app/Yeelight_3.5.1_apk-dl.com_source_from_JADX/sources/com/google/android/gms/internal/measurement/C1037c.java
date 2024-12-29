package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.c */
public final class C1037c {

    /* renamed from: a */
    private C1021b f1256a;

    /* renamed from: b */
    private C1021b f1257b;

    /* renamed from: c */
    private final List f1258c;

    public C1037c() {
        this.f1256a = new C1021b("", 0, (Map) null);
        this.f1257b = new C1021b("", 0, (Map) null);
        this.f1258c = new ArrayList();
    }

    public C1037c(C1021b bVar) {
        this.f1256a = bVar;
        this.f1257b = bVar.clone();
        this.f1258c = new ArrayList();
    }

    /* renamed from: a */
    public final C1021b mo12592a() {
        return this.f1256a;
    }

    /* renamed from: b */
    public final C1021b mo12593b() {
        return this.f1257b;
    }

    /* renamed from: c */
    public final List mo12594c() {
        return this.f1258c;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C1037c cVar = new C1037c(this.f1256a.clone());
        for (C1021b b : this.f1258c) {
            cVar.f1258c.add(b.clone());
        }
        return cVar;
    }

    /* renamed from: d */
    public final void mo12596d(C1021b bVar) {
        this.f1256a = bVar;
        this.f1257b = bVar.clone();
        this.f1258c.clear();
    }

    /* renamed from: e */
    public final void mo12597e(String str, long j, Map map) {
        this.f1258c.add(new C1021b(str, j, map));
    }

    /* renamed from: f */
    public final void mo12598f(C1021b bVar) {
        this.f1257b = bVar;
    }
}
