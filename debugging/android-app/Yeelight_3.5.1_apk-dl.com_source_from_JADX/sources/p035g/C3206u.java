package p035g;

import com.google.android.datatransport.runtime.dagger.internal.C0689b;
import p064m.C3328e;
import p068n.C3350p;
import p068n.C3352t;
import p083q.C3604a;
import p191o4.C9779a;

/* renamed from: g.u */
public final class C3206u implements C0689b<C3203s> {

    /* renamed from: a */
    private final C9779a<C3604a> f5172a;

    /* renamed from: b */
    private final C9779a<C3604a> f5173b;

    /* renamed from: c */
    private final C9779a<C3328e> f5174c;

    /* renamed from: d */
    private final C9779a<C3350p> f5175d;

    /* renamed from: e */
    private final C9779a<C3352t> f5176e;

    public C3206u(C9779a<C3604a> aVar, C9779a<C3604a> aVar2, C9779a<C3328e> aVar3, C9779a<C3350p> aVar4, C9779a<C3352t> aVar5) {
        this.f5172a = aVar;
        this.f5173b = aVar2;
        this.f5174c = aVar3;
        this.f5175d = aVar4;
        this.f5176e = aVar5;
    }

    /* renamed from: a */
    public static C3206u m8632a(C9779a<C3604a> aVar, C9779a<C3604a> aVar2, C9779a<C3328e> aVar3, C9779a<C3350p> aVar4, C9779a<C3352t> aVar5) {
        return new C3206u(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    /* renamed from: c */
    public static C3203s m8633c(C3604a aVar, C3604a aVar2, C3328e eVar, C3350p pVar, C3352t tVar) {
        return new C3203s(aVar, aVar2, eVar, pVar, tVar);
    }

    /* renamed from: b */
    public C3203s get() {
        return m8633c(this.f5172a.get(), this.f5173b.get(), this.f5174c.get(), this.f5175d.get(), this.f5176e.get());
    }
}
