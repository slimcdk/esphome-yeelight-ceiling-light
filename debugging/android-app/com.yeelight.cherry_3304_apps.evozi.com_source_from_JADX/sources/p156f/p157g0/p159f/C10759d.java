package p156f.p157g0.p159f;

import java.util.LinkedHashSet;
import java.util.Set;
import p156f.C4340e0;

/* renamed from: f.g0.f.d */
public final class C10759d {

    /* renamed from: a */
    private final Set<C4340e0> f20641a = new LinkedHashSet();

    /* renamed from: a */
    public synchronized void mo33989a(C4340e0 e0Var) {
        this.f20641a.remove(e0Var);
    }

    /* renamed from: b */
    public synchronized void mo33990b(C4340e0 e0Var) {
        this.f20641a.add(e0Var);
    }

    /* renamed from: c */
    public synchronized boolean mo33991c(C4340e0 e0Var) {
        return this.f20641a.contains(e0Var);
    }
}
