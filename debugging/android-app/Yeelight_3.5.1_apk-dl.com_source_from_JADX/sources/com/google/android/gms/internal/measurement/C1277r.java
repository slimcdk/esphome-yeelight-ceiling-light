package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.r */
public final class C1277r implements C1261q {

    /* renamed from: a */
    private final String f1563a;

    /* renamed from: b */
    private final ArrayList f1564b;

    public C1277r(String str, List list) {
        this.f1563a = str;
        ArrayList arrayList = new ArrayList();
        this.f1564b = arrayList;
        arrayList.addAll(list);
    }

    /* renamed from: a */
    public final String mo13117a() {
        return this.f1563a;
    }

    /* renamed from: b */
    public final C1261q mo12760b() {
        return this;
    }

    /* renamed from: c */
    public final Double mo12761c() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    /* renamed from: d */
    public final String mo12762d() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    /* renamed from: e */
    public final Boolean mo12763e() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1277r)) {
            return false;
        }
        C1277r rVar = (C1277r) obj;
        String str = this.f1563a;
        if (str == null ? rVar.f1563a == null : str.equals(rVar.f1563a)) {
            return this.f1564b.equals(rVar.f1564b);
        }
        return false;
    }

    /* renamed from: f */
    public final ArrayList mo13119f() {
        return this.f1564b;
    }

    /* renamed from: g */
    public final Iterator mo12765g() {
        return null;
    }

    public final int hashCode() {
        String str = this.f1563a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f1564b.hashCode();
    }

    /* renamed from: l */
    public final C1261q mo12637l(String str, C1250p4 p4Var, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
}
