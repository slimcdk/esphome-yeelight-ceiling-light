package p055k2;

import java.util.ArrayList;
import java.util.List;

/* renamed from: k2.c */
final class C3297c {

    /* renamed from: a */
    private final List<C3296b> f5318a;

    /* renamed from: b */
    private final int f5319b;

    /* renamed from: c */
    private final boolean f5320c;

    C3297c(List<C3296b> list, int i, boolean z) {
        this.f5318a = new ArrayList(list);
        this.f5319b = i;
        this.f5320c = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C3296b> mo23915a() {
        return this.f5318a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo23916b() {
        return this.f5319b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo23917c(List<C3296b> list) {
        return this.f5318a.equals(list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3297c)) {
            return false;
        }
        C3297c cVar = (C3297c) obj;
        return this.f5318a.equals(cVar.mo23915a()) && this.f5320c == cVar.f5320c;
    }

    public int hashCode() {
        return this.f5318a.hashCode() ^ Boolean.valueOf(this.f5320c).hashCode();
    }

    public String toString() {
        return "{ " + this.f5318a + " }";
    }
}
