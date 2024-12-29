package p075o;

import com.google.android.datatransport.runtime.dagger.internal.C0688a;
import com.google.android.datatransport.runtime.dagger.internal.C0689b;
import p043i.C3246a;
import p083q.C3604a;
import p191o4.C9779a;

/* renamed from: o.n0 */
public final class C3405n0 implements C0689b<C3400m0> {

    /* renamed from: a */
    private final C9779a<C3604a> f5527a;

    /* renamed from: b */
    private final C9779a<C3604a> f5528b;

    /* renamed from: c */
    private final C9779a<C3389e> f5529c;

    /* renamed from: d */
    private final C9779a<C3406t0> f5530d;

    /* renamed from: e */
    private final C9779a<String> f5531e;

    public C3405n0(C9779a<C3604a> aVar, C9779a<C3604a> aVar2, C9779a<C3389e> aVar3, C9779a<C3406t0> aVar4, C9779a<String> aVar5) {
        this.f5527a = aVar;
        this.f5528b = aVar2;
        this.f5529c = aVar3;
        this.f5530d = aVar4;
        this.f5531e = aVar5;
    }

    /* renamed from: a */
    public static C3405n0 m9379a(C9779a<C3604a> aVar, C9779a<C3604a> aVar2, C9779a<C3389e> aVar3, C9779a<C3406t0> aVar4, C9779a<String> aVar5) {
        return new C3405n0(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    /* renamed from: c */
    public static C3400m0 m9380c(C3604a aVar, C3604a aVar2, Object obj, Object obj2, C3246a<String> aVar3) {
        return new C3400m0(aVar, aVar2, (C3389e) obj, (C3406t0) obj2, aVar3);
    }

    /* renamed from: b */
    public C3400m0 get() {
        return m9380c(this.f5527a.get(), this.f5528b.get(), this.f5529c.get(), this.f5530d.get(), C0688a.m531a(this.f5531e));
    }
}
