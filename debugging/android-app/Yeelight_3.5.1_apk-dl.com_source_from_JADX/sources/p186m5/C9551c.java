package p186m5;

import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.C3522d0;

/* renamed from: m5.c */
public final class C9551c {

    /* renamed from: a */
    private final Set<C3522d0> f17430a = new LinkedHashSet();

    /* renamed from: a */
    public synchronized void mo38512a(C3522d0 d0Var) {
        this.f17430a.remove(d0Var);
    }

    /* renamed from: b */
    public synchronized void mo38513b(C3522d0 d0Var) {
        this.f17430a.add(d0Var);
    }

    /* renamed from: c */
    public synchronized boolean mo38514c(C3522d0 d0Var) {
        return this.f17430a.contains(d0Var);
    }
}
