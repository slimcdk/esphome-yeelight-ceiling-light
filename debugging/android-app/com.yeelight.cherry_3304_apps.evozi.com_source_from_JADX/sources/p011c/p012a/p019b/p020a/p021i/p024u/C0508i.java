package p011c.p012a.p019b.p020a.p021i.p024u;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1337g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1353s;
import com.google.android.datatransport.runtime.time.C1354a;
import dagger.internal.C10742b;
import dagger.internal.C10744d;
import javax.inject.C11584a;
import p011c.p012a.p019b.p020a.p021i.p024u.p025j.C0519c;

/* renamed from: c.a.b.a.i.u.i */
public final class C0508i implements C10742b<C1353s> {

    /* renamed from: a */
    private final C11584a<Context> f136a;

    /* renamed from: b */
    private final C11584a<C0519c> f137b;

    /* renamed from: c */
    private final C11584a<C1337g> f138c;

    /* renamed from: d */
    private final C11584a<C1354a> f139d;

    public C0508i(C11584a<Context> aVar, C11584a<C0519c> aVar2, C11584a<C1337g> aVar3, C11584a<C1354a> aVar4) {
        this.f136a = aVar;
        this.f137b = aVar2;
        this.f138c = aVar3;
        this.f139d = aVar4;
    }

    /* renamed from: a */
    public static C0508i m177a(C11584a<Context> aVar, C11584a<C0519c> aVar2, C11584a<C1337g> aVar3, C11584a<C1354a> aVar4) {
        return new C0508i(aVar, aVar2, aVar3, aVar4);
    }

    /* renamed from: c */
    public static C1353s m178c(Context context, C0519c cVar, C1337g gVar, C1354a aVar) {
        C1353s a = C0507h.m176a(context, cVar, gVar, aVar);
        C10744d.m26606c(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    /* renamed from: b */
    public C1353s get() {
        return m178c(this.f136a.get(), this.f137b.get(), this.f138c.get(), this.f139d.get());
    }
}
