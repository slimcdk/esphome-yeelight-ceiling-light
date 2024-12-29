package p231y2;

import com.squareup.okhttp.C4323z;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: y2.j */
public final class C12032j {

    /* renamed from: a */
    private final Set<C4323z> f22064a = new LinkedHashSet();

    /* renamed from: a */
    public synchronized void mo42658a(C4323z zVar) {
        this.f22064a.remove(zVar);
    }

    /* renamed from: b */
    public synchronized void mo42659b(C4323z zVar) {
        this.f22064a.add(zVar);
    }

    /* renamed from: c */
    public synchronized boolean mo42660c(C4323z zVar) {
        return this.f22064a.contains(zVar);
    }
}
