package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.h */
public final class C1117h implements C1261q {

    /* renamed from: a */
    private final C1261q f1357a;

    /* renamed from: b */
    private final String f1358b;

    public C1117h() {
        throw null;
    }

    public C1117h(String str) {
        this.f1357a = C1261q.f1536D;
        this.f1358b = str;
    }

    public C1117h(String str, C1261q qVar) {
        this.f1357a = qVar;
        this.f1358b = str;
    }

    /* renamed from: a */
    public final C1261q mo12847a() {
        return this.f1357a;
    }

    /* renamed from: b */
    public final C1261q mo12760b() {
        return new C1117h(this.f1358b, this.f1357a.mo12760b());
    }

    /* renamed from: c */
    public final Double mo12761c() {
        throw new IllegalStateException("Control is not a double");
    }

    /* renamed from: d */
    public final String mo12762d() {
        throw new IllegalStateException("Control is not a String");
    }

    /* renamed from: e */
    public final Boolean mo12763e() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1117h)) {
            return false;
        }
        C1117h hVar = (C1117h) obj;
        return this.f1358b.equals(hVar.f1358b) && this.f1357a.equals(hVar.f1357a);
    }

    /* renamed from: f */
    public final String mo12849f() {
        return this.f1358b;
    }

    /* renamed from: g */
    public final Iterator mo12765g() {
        return null;
    }

    public final int hashCode() {
        return (this.f1358b.hashCode() * 31) + this.f1357a.hashCode();
    }

    /* renamed from: l */
    public final C1261q mo12637l(String str, C1250p4 p4Var, List list) {
        throw new IllegalStateException("Control does not have functions");
    }
}
