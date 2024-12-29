package p011c.p012a.p019b.p020a.p021i;

import java.util.Set;
import p011c.p012a.p019b.p020a.C0459b;
import p011c.p012a.p019b.p020a.C0462e;
import p011c.p012a.p019b.p020a.C0463f;
import p011c.p012a.p019b.p020a.C0464g;

/* renamed from: c.a.b.a.i.m */
final class C0489m implements C0464g {

    /* renamed from: a */
    private final Set<C0459b> f99a;

    /* renamed from: b */
    private final C0487l f100b;

    /* renamed from: c */
    private final C0491o f101c;

    C0489m(Set<C0459b> set, C0487l lVar, C0491o oVar) {
        this.f99a = set;
        this.f100b = lVar;
        this.f101c = oVar;
    }

    /* renamed from: a */
    public <T> C0463f<T> mo8403a(String str, Class<T> cls, C0459b bVar, C0462e<T, byte[]> eVar) {
        if (this.f99a.contains(bVar)) {
            return new C0490n(this.f100b, str, bVar, eVar, this.f101c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{bVar, this.f99a}));
    }
}
