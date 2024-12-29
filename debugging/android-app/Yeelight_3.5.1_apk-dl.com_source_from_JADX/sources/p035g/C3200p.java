package p035g;

import java.util.Set;
import p031f.C3150a;
import p031f.C3151b;
import p031f.C3152c;
import p031f.C3153d;

/* renamed from: g.p */
final class C3200p implements C3153d {

    /* renamed from: a */
    private final Set<C3150a> f5159a;

    /* renamed from: b */
    private final C3198o f5160b;

    /* renamed from: c */
    private final C3202r f5161c;

    C3200p(Set<C3150a> set, C3198o oVar, C3202r rVar) {
        this.f5159a = set;
        this.f5160b = oVar;
        this.f5161c = rVar;
    }

    /* renamed from: a */
    public <T> C3152c<T> mo23645a(String str, Class<T> cls, C3150a aVar, C3151b<T, byte[]> bVar) {
        if (this.f5159a.contains(aVar)) {
            return new C3201q(this.f5160b, str, aVar, bVar, this.f5161c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{aVar, this.f5159a}));
    }
}
