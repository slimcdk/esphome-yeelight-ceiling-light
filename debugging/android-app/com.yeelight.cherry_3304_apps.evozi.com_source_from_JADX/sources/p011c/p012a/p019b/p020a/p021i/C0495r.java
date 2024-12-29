package p011c.p012a.p019b.p020a.p021i;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1347m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1351q;
import com.google.android.datatransport.runtime.time.C1354a;
import dagger.internal.C10742b;
import javax.inject.C11584a;
import p011c.p012a.p019b.p020a.p021i.p024u.C0504e;

/* renamed from: c.a.b.a.i.r */
public final class C0495r implements C10742b<C0492p> {

    /* renamed from: a */
    private final C11584a<C1354a> f112a;

    /* renamed from: b */
    private final C11584a<C1354a> f113b;

    /* renamed from: c */
    private final C11584a<C0504e> f114c;

    /* renamed from: d */
    private final C11584a<C1347m> f115d;

    /* renamed from: e */
    private final C11584a<C1351q> f116e;

    public C0495r(C11584a<C1354a> aVar, C11584a<C1354a> aVar2, C11584a<C0504e> aVar3, C11584a<C1347m> aVar4, C11584a<C1351q> aVar5) {
        this.f112a = aVar;
        this.f113b = aVar2;
        this.f114c = aVar3;
        this.f115d = aVar4;
        this.f116e = aVar5;
    }

    /* renamed from: a */
    public static C0495r m153a(C11584a<C1354a> aVar, C11584a<C1354a> aVar2, C11584a<C0504e> aVar3, C11584a<C1347m> aVar4, C11584a<C1351q> aVar5) {
        return new C0495r(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    /* renamed from: b */
    public C0492p get() {
        return new C0492p(this.f112a.get(), this.f113b.get(), this.f114c.get(), this.f115d.get(), this.f116e.get());
    }
}
