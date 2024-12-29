package p068n;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.C0689b;
import java.util.concurrent.Executor;
import p039h.C3222b;
import p075o.C3387c;
import p075o.C3388d;
import p079p.C3590a;
import p083q.C3604a;
import p191o4.C9779a;

/* renamed from: n.q */
public final class C3351q implements C0689b<C3350p> {

    /* renamed from: a */
    private final C9779a<Context> f5460a;

    /* renamed from: b */
    private final C9779a<C3222b> f5461b;

    /* renamed from: c */
    private final C9779a<C3388d> f5462c;

    /* renamed from: d */
    private final C9779a<C3354v> f5463d;

    /* renamed from: e */
    private final C9779a<Executor> f5464e;

    /* renamed from: f */
    private final C9779a<C3590a> f5465f;

    /* renamed from: g */
    private final C9779a<C3604a> f5466g;

    /* renamed from: h */
    private final C9779a<C3604a> f5467h;

    /* renamed from: i */
    private final C9779a<C3387c> f5468i;

    public C3351q(C9779a<Context> aVar, C9779a<C3222b> aVar2, C9779a<C3388d> aVar3, C9779a<C3354v> aVar4, C9779a<Executor> aVar5, C9779a<C3590a> aVar6, C9779a<C3604a> aVar7, C9779a<C3604a> aVar8, C9779a<C3387c> aVar9) {
        this.f5460a = aVar;
        this.f5461b = aVar2;
        this.f5462c = aVar3;
        this.f5463d = aVar4;
        this.f5464e = aVar5;
        this.f5465f = aVar6;
        this.f5466g = aVar7;
        this.f5467h = aVar8;
        this.f5468i = aVar9;
    }

    /* renamed from: a */
    public static C3351q m9151a(C9779a<Context> aVar, C9779a<C3222b> aVar2, C9779a<C3388d> aVar3, C9779a<C3354v> aVar4, C9779a<Executor> aVar5, C9779a<C3590a> aVar6, C9779a<C3604a> aVar7, C9779a<C3604a> aVar8, C9779a<C3387c> aVar9) {
        return new C3351q(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    /* renamed from: c */
    public static C3350p m9152c(Context context, C3222b bVar, C3388d dVar, C3354v vVar, Executor executor, C3590a aVar, C3604a aVar2, C3604a aVar3, C3387c cVar) {
        return new C3350p(context, bVar, dVar, vVar, executor, aVar, aVar2, aVar3, cVar);
    }

    /* renamed from: b */
    public C3350p get() {
        return m9152c(this.f5460a.get(), this.f5461b.get(), this.f5462c.get(), this.f5463d.get(), this.f5464e.get(), this.f5465f.get(), this.f5466g.get(), this.f5467h.get(), this.f5468i.get());
    }
}
