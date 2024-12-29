package p011c.p012a.p046d;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: c.a.d.i */
public final class C0673i extends C0676l implements Iterable<C0676l> {

    /* renamed from: a */
    private final List<C0676l> f413a = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C0673i) && ((C0673i) obj).f413a.equals(this.f413a));
    }

    public int hashCode() {
        return this.f413a.hashCode();
    }

    public Iterator<C0676l> iterator() {
        return this.f413a.iterator();
    }

    /* renamed from: j */
    public void mo8737j(C0676l lVar) {
        if (lVar == null) {
            lVar = C0678n.f414a;
        }
        this.f413a.add(lVar);
    }
}
