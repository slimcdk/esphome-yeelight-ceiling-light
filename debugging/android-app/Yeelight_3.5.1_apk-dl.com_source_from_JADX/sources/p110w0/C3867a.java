package p110w0;

import java.util.Set;
import p077o1.C3502b;

/* renamed from: w0.a */
abstract class C3867a implements C3873e {
    C3867a() {
    }

    /* renamed from: a */
    public <T> T mo26333a(Class<T> cls) {
        C3502b<T> b = mo26335b(cls);
        if (b == null) {
            return null;
        }
        return b.get();
    }

    /* renamed from: d */
    public <T> Set<T> mo26334d(Class<T> cls) {
        return mo26336c(cls).get();
    }
}
