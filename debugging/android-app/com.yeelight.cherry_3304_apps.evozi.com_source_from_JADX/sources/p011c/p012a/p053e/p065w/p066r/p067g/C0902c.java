package p011c.p012a.p053e.p065w.p066r.p067g;

import java.util.ArrayList;
import java.util.List;

/* renamed from: c.a.e.w.r.g.c */
final class C0902c {

    /* renamed from: a */
    private final List<C0901b> f984a;

    /* renamed from: b */
    private final int f985b;

    /* renamed from: c */
    private final boolean f986c;

    C0902c(List<C0901b> list, int i, boolean z) {
        this.f984a = new ArrayList(list);
        this.f985b = i;
        this.f986c = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C0901b> mo9185a() {
        return this.f984a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo9186b() {
        return this.f985b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo9187c(List<C0901b> list) {
        return this.f984a.equals(list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0902c)) {
            return false;
        }
        C0902c cVar = (C0902c) obj;
        return this.f984a.equals(cVar.mo9185a()) && this.f986c == cVar.f986c;
    }

    public int hashCode() {
        return this.f984a.hashCode() ^ Boolean.valueOf(this.f986c).hashCode();
    }

    public String toString() {
        return "{ " + this.f984a + " }";
    }
}
