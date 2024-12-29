package p011c.p083d.p084a.p085d0;

import java.util.LinkedHashSet;
import java.util.Set;
import p011c.p083d.p084a.C0991b0;

/* renamed from: c.d.a.d0.j */
public final class C1023j {

    /* renamed from: a */
    private final Set<C0991b0> f1342a = new LinkedHashSet();

    /* renamed from: a */
    public synchronized void mo9482a(C0991b0 b0Var) {
        this.f1342a.remove(b0Var);
    }

    /* renamed from: b */
    public synchronized void mo9483b(C0991b0 b0Var) {
        this.f1342a.add(b0Var);
    }

    /* renamed from: c */
    public synchronized boolean mo9484c(C0991b0 b0Var) {
        return this.f1342a.contains(b0Var);
    }
}
