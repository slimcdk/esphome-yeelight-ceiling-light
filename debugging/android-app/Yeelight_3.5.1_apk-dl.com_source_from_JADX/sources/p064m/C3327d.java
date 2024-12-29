package p064m;

import com.google.android.datatransport.runtime.dagger.internal.C0689b;
import java.util.concurrent.Executor;
import p039h.C3222b;
import p068n.C3354v;
import p075o.C3388d;
import p079p.C3590a;
import p191o4.C9779a;

/* renamed from: m.d */
public final class C3327d implements C0689b<C3326c> {

    /* renamed from: a */
    private final C9779a<Executor> f5422a;

    /* renamed from: b */
    private final C9779a<C3222b> f5423b;

    /* renamed from: c */
    private final C9779a<C3354v> f5424c;

    /* renamed from: d */
    private final C9779a<C3388d> f5425d;

    /* renamed from: e */
    private final C9779a<C3590a> f5426e;

    public C3327d(C9779a<Executor> aVar, C9779a<C3222b> aVar2, C9779a<C3354v> aVar3, C9779a<C3388d> aVar4, C9779a<C3590a> aVar5) {
        this.f5422a = aVar;
        this.f5423b = aVar2;
        this.f5424c = aVar3;
        this.f5425d = aVar4;
        this.f5426e = aVar5;
    }

    /* renamed from: a */
    public static C3327d m9060a(C9779a<Executor> aVar, C9779a<C3222b> aVar2, C9779a<C3354v> aVar3, C9779a<C3388d> aVar4, C9779a<C3590a> aVar5) {
        return new C3327d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    /* renamed from: c */
    public static C3326c m9061c(Executor executor, C3222b bVar, C3354v vVar, C3388d dVar, C3590a aVar) {
        return new C3326c(executor, bVar, vVar, dVar, aVar);
    }

    /* renamed from: b */
    public C3326c get() {
        return m9061c(this.f5422a.get(), this.f5423b.get(), this.f5424c.get(), this.f5425d.get(), this.f5426e.get());
    }
}
