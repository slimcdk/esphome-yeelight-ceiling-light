package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.g */
public final class C1101g implements C1261q {

    /* renamed from: a */
    private final boolean f1330a;

    public C1101g(Boolean bool) {
        this.f1330a = bool == null ? false : bool.booleanValue();
    }

    /* renamed from: b */
    public final C1261q mo12760b() {
        return new C1101g(Boolean.valueOf(this.f1330a));
    }

    /* renamed from: c */
    public final Double mo12761c() {
        return Double.valueOf(true != this.f1330a ? 0.0d : 1.0d);
    }

    /* renamed from: d */
    public final String mo12762d() {
        return Boolean.toString(this.f1330a);
    }

    /* renamed from: e */
    public final Boolean mo12763e() {
        return Boolean.valueOf(this.f1330a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1101g) && this.f1330a == ((C1101g) obj).f1330a;
    }

    /* renamed from: g */
    public final Iterator mo12765g() {
        return null;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f1330a).hashCode();
    }

    /* renamed from: l */
    public final C1261q mo12637l(String str, C1250p4 p4Var, List list) {
        if ("toString".equals(str)) {
            return new C1324u(Boolean.toString(this.f1330a));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{Boolean.toString(this.f1330a), str}));
    }

    public final String toString() {
        return String.valueOf(this.f1330a);
    }
}
