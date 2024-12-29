package p055k2;

import p050j2.C3273b;
import p050j2.C3274c;

/* renamed from: k2.b */
final class C3296b {

    /* renamed from: a */
    private final C3273b f5315a;

    /* renamed from: b */
    private final C3273b f5316b;

    /* renamed from: c */
    private final C3274c f5317c;

    C3296b(C3273b bVar, C3273b bVar2, C3274c cVar, boolean z) {
        this.f5315a = bVar;
        this.f5316b = bVar2;
        this.f5317c = cVar;
    }

    /* renamed from: a */
    private static boolean m8869a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: e */
    private static int m8870e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C3274c mo23908b() {
        return this.f5317c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C3273b mo23909c() {
        return this.f5315a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C3273b mo23910d() {
        return this.f5316b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3296b)) {
            return false;
        }
        C3296b bVar = (C3296b) obj;
        return m8869a(this.f5315a, bVar.f5315a) && m8869a(this.f5316b, bVar.f5316b) && m8869a(this.f5317c, bVar.f5317c);
    }

    /* renamed from: f */
    public boolean mo23912f() {
        return this.f5316b == null;
    }

    public int hashCode() {
        return (m8870e(this.f5315a) ^ m8870e(this.f5316b)) ^ m8870e(this.f5317c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.f5315a);
        sb.append(" , ");
        sb.append(this.f5316b);
        sb.append(" : ");
        C3274c cVar = this.f5317c;
        sb.append(cVar == null ? "null" : Integer.valueOf(cVar.mo23850c()));
        sb.append(" ]");
        return sb.toString();
    }
}
