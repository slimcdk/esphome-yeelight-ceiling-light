package p011c.p012a.p019b.p020a.p021i.p024u;

import com.google.android.datatransport.runtime.backends.C1316e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1353s;
import dagger.internal.C10742b;
import java.util.concurrent.Executor;
import javax.inject.C11584a;
import p011c.p012a.p019b.p020a.p021i.p024u.p025j.C0519c;
import p011c.p012a.p019b.p020a.p021i.p026v.C0553b;

/* renamed from: c.a.b.a.i.u.d */
public final class C0503d implements C10742b<C0502c> {

    /* renamed from: a */
    private final C11584a<Executor> f130a;

    /* renamed from: b */
    private final C11584a<C1316e> f131b;

    /* renamed from: c */
    private final C11584a<C1353s> f132c;

    /* renamed from: d */
    private final C11584a<C0519c> f133d;

    /* renamed from: e */
    private final C11584a<C0553b> f134e;

    public C0503d(C11584a<Executor> aVar, C11584a<C1316e> aVar2, C11584a<C1353s> aVar3, C11584a<C0519c> aVar4, C11584a<C0553b> aVar5) {
        this.f130a = aVar;
        this.f131b = aVar2;
        this.f132c = aVar3;
        this.f133d = aVar4;
        this.f134e = aVar5;
    }

    /* renamed from: a */
    public static C0503d m169a(C11584a<Executor> aVar, C11584a<C1316e> aVar2, C11584a<C1353s> aVar3, C11584a<C0519c> aVar4, C11584a<C0553b> aVar5) {
        return new C0503d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    /* renamed from: b */
    public C0502c get() {
        return new C0502c(this.f130a.get(), this.f131b.get(), this.f132c.get(), this.f133d.get(), this.f134e.get());
    }
}
