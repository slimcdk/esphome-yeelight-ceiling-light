package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.j */
public abstract class C1149j implements C1261q, C1197m {

    /* renamed from: a */
    protected final String f1380a;

    /* renamed from: b */
    protected final Map f1381b = new HashMap();

    public C1149j(String str) {
        this.f1380a = str;
    }

    /* renamed from: a */
    public abstract C1261q mo12586a(C1250p4 p4Var, List list);

    /* renamed from: b */
    public C1261q mo12760b() {
        return this;
    }

    /* renamed from: c */
    public final Double mo12761c() {
        return Double.valueOf(Double.NaN);
    }

    /* renamed from: d */
    public final String mo12762d() {
        return this.f1380a;
    }

    /* renamed from: e */
    public final Boolean mo12763e() {
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1149j)) {
            return false;
        }
        C1149j jVar = (C1149j) obj;
        String str = this.f1380a;
        if (str != null) {
            return str.equals(jVar.f1380a);
        }
        return false;
    }

    /* renamed from: f */
    public final String mo12891f() {
        return this.f1380a;
    }

    /* renamed from: g */
    public final Iterator mo12765g() {
        return C1165k.m2127b(this.f1381b);
    }

    public final int hashCode() {
        String str = this.f1380a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    /* renamed from: j */
    public final boolean mo12768j(String str) {
        return this.f1381b.containsKey(str);
    }

    /* renamed from: l */
    public final C1261q mo12637l(String str, C1250p4 p4Var, List list) {
        return "toString".equals(str) ? new C1324u(this.f1380a) : C1165k.m2126a(this, new C1324u(str), p4Var, list);
    }

    /* renamed from: m */
    public final void mo12769m(String str, C1261q qVar) {
        if (qVar == null) {
            this.f1381b.remove(str);
        } else {
            this.f1381b.put(str, qVar);
        }
    }

    /* renamed from: n */
    public final C1261q mo12770n(String str) {
        return this.f1381b.containsKey(str) ? (C1261q) this.f1381b.get(str) : C1261q.f1536D;
    }
}
