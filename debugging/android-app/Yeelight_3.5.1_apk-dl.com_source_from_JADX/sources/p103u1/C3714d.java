package p103u1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: u1.d */
public class C3714d {

    /* renamed from: b */
    private static volatile C3714d f6238b;

    /* renamed from: a */
    private final Set<C3716f> f6239a = new HashSet();

    C3714d() {
    }

    /* renamed from: a */
    public static C3714d m10595a() {
        C3714d dVar = f6238b;
        if (dVar == null) {
            synchronized (C3714d.class) {
                dVar = f6238b;
                if (dVar == null) {
                    dVar = new C3714d();
                    f6238b = dVar;
                }
            }
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Set<C3716f> mo26134b() {
        Set<C3716f> unmodifiableSet;
        synchronized (this.f6239a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f6239a);
        }
        return unmodifiableSet;
    }
}
