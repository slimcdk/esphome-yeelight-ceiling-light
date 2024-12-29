package p011c.p083d.p084a.p085d0.p086m;

import p163g.C4411f;

/* renamed from: c.d.a.d0.m.f */
public final class C1048f {

    /* renamed from: d */
    public static final C4411f f1452d = C4411f.m12868h(":status");

    /* renamed from: e */
    public static final C4411f f1453e = C4411f.m12868h(":method");

    /* renamed from: f */
    public static final C4411f f1454f = C4411f.m12868h(":path");

    /* renamed from: g */
    public static final C4411f f1455g = C4411f.m12868h(":scheme");

    /* renamed from: h */
    public static final C4411f f1456h = C4411f.m12868h(":authority");

    /* renamed from: i */
    public static final C4411f f1457i = C4411f.m12868h(":host");

    /* renamed from: j */
    public static final C4411f f1458j = C4411f.m12868h(":version");

    /* renamed from: a */
    public final C4411f f1459a;

    /* renamed from: b */
    public final C4411f f1460b;

    /* renamed from: c */
    final int f1461c;

    public C1048f(C4411f fVar, C4411f fVar2) {
        this.f1459a = fVar;
        this.f1460b = fVar2;
        this.f1461c = fVar.mo24297q() + 32 + fVar2.mo24297q();
    }

    public C1048f(C4411f fVar, String str) {
        this(fVar, C4411f.m12868h(str));
    }

    public C1048f(String str, String str2) {
        this(C4411f.m12868h(str), C4411f.m12868h(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1048f)) {
            return false;
        }
        C1048f fVar = (C1048f) obj;
        return this.f1459a.equals(fVar.f1459a) && this.f1460b.equals(fVar.f1460b);
    }

    public int hashCode() {
        return ((527 + this.f1459a.hashCode()) * 31) + this.f1460b.hashCode();
    }

    public String toString() {
        return String.format("%s: %s", new Object[]{this.f1459a.mo24303v(), this.f1460b.mo24303v()});
    }
}
