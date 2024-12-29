package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C1382a;
import com.google.android.gms.common.api.C1382a.C1386d;
import com.google.android.gms.common.internal.C1599s;

/* renamed from: com.google.android.gms.common.api.internal.y1 */
public final class C1503y1<O extends C1382a.C1386d> {

    /* renamed from: a */
    private final boolean f2854a = true;

    /* renamed from: b */
    private final int f2855b;

    /* renamed from: c */
    private final C1382a<O> f2856c;

    /* renamed from: d */
    private final O f2857d;

    private C1503y1(C1382a<O> aVar) {
        this.f2856c = aVar;
        this.f2857d = null;
        this.f2855b = System.identityHashCode(this);
    }

    private C1503y1(C1382a<O> aVar, O o) {
        this.f2856c = aVar;
        this.f2857d = o;
        this.f2855b = C1599s.m4389b(aVar, o);
    }

    /* renamed from: a */
    public static <O extends C1382a.C1386d> C1503y1<O> m4081a(C1382a<O> aVar) {
        return new C1503y1<>(aVar);
    }

    /* renamed from: b */
    public static <O extends C1382a.C1386d> C1503y1<O> m4082b(C1382a<O> aVar, O o) {
        return new C1503y1<>(aVar, o);
    }

    /* renamed from: c */
    public final String mo11024c() {
        return this.f2856c.mo10783b();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1503y1)) {
            return false;
        }
        C1503y1 y1Var = (C1503y1) obj;
        return !this.f2854a && !y1Var.f2854a && C1599s.m4388a(this.f2856c, y1Var.f2856c) && C1599s.m4388a(this.f2857d, y1Var.f2857d);
    }

    public final int hashCode() {
        return this.f2855b;
    }
}
