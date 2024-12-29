package p011c.p012a.p053e.p065w.p066r.p067g;

import p011c.p012a.p053e.p065w.p066r.C0895b;
import p011c.p012a.p053e.p065w.p066r.C0896c;

/* renamed from: c.a.e.w.r.g.b */
final class C0901b {

    /* renamed from: a */
    private final C0895b f981a;

    /* renamed from: b */
    private final C0895b f982b;

    /* renamed from: c */
    private final C0896c f983c;

    C0901b(C0895b bVar, C0895b bVar2, C0896c cVar, boolean z) {
        this.f981a = bVar;
        this.f982b = bVar2;
        this.f983c = cVar;
    }

    /* renamed from: a */
    private static boolean m1468a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: e */
    private static int m1469e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0896c mo9178b() {
        return this.f983c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0895b mo9179c() {
        return this.f981a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0895b mo9180d() {
        return this.f982b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0901b)) {
            return false;
        }
        C0901b bVar = (C0901b) obj;
        return m1468a(this.f981a, bVar.f981a) && m1468a(this.f982b, bVar.f982b) && m1468a(this.f983c, bVar.f983c);
    }

    /* renamed from: f */
    public boolean mo9182f() {
        return this.f982b == null;
    }

    public int hashCode() {
        return (m1469e(this.f981a) ^ m1469e(this.f982b)) ^ m1469e(this.f983c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.f981a);
        sb.append(" , ");
        sb.append(this.f982b);
        sb.append(" : ");
        C0896c cVar = this.f983c;
        sb.append(cVar == null ? "null" : Integer.valueOf(cVar.mo9172c()));
        sb.append(" ]");
        return sb.toString();
    }
}
