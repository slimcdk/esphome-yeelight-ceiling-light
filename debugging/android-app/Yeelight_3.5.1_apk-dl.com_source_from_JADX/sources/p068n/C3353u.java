package p068n;

import com.google.android.datatransport.runtime.dagger.internal.C0689b;
import java.util.concurrent.Executor;
import p075o.C3388d;
import p079p.C3590a;
import p191o4.C9779a;

/* renamed from: n.u */
public final class C3353u implements C0689b<C3352t> {

    /* renamed from: a */
    private final C9779a<Executor> f5473a;

    /* renamed from: b */
    private final C9779a<C3388d> f5474b;

    /* renamed from: c */
    private final C9779a<C3354v> f5475c;

    /* renamed from: d */
    private final C9779a<C3590a> f5476d;

    public C3353u(C9779a<Executor> aVar, C9779a<C3388d> aVar2, C9779a<C3354v> aVar3, C9779a<C3590a> aVar4) {
        this.f5473a = aVar;
        this.f5474b = aVar2;
        this.f5475c = aVar3;
        this.f5476d = aVar4;
    }

    /* renamed from: a */
    public static C3353u m9159a(C9779a<Executor> aVar, C9779a<C3388d> aVar2, C9779a<C3354v> aVar3, C9779a<C3590a> aVar4) {
        return new C3353u(aVar, aVar2, aVar3, aVar4);
    }

    /* renamed from: c */
    public static C3352t m9160c(Executor executor, C3388d dVar, C3354v vVar, C3590a aVar) {
        return new C3352t(executor, dVar, vVar, aVar);
    }

    /* renamed from: b */
    public C3352t get() {
        return m9160c(this.f5473a.get(), this.f5474b.get(), this.f5475c.get(), this.f5476d.get());
    }
}
