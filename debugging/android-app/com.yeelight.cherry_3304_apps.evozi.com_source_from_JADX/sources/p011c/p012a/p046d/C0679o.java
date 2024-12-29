package p011c.p012a.p046d;

import java.util.Map;
import java.util.Set;
import p011c.p012a.p046d.p047x.C0716h;

/* renamed from: c.a.d.o */
public final class C0679o extends C0676l {

    /* renamed from: a */
    private final C0716h<String, C0676l> f415a = new C0716h<>();

    /* renamed from: m */
    private C0676l m674m(Object obj) {
        return obj == null ? C0678n.f414a : new C0681q(obj);
    }

    public Set<Map.Entry<String, C0676l>> entrySet() {
        return this.f415a.entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C0679o) && ((C0679o) obj).f415a.equals(this.f415a));
    }

    public int hashCode() {
        return this.f415a.hashCode();
    }

    /* renamed from: j */
    public void mo8752j(String str, C0676l lVar) {
        if (lVar == null) {
            lVar = C0678n.f414a;
        }
        this.f415a.put(str, lVar);
    }

    /* renamed from: k */
    public void mo8753k(String str, Number number) {
        mo8752j(str, m674m(number));
    }

    /* renamed from: l */
    public void mo8754l(String str, String str2) {
        mo8752j(str, m674m(str2));
    }
}
