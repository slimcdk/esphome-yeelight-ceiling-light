package p011c.p012a.p019b.p020a.p021i.p024u;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1337g;
import com.google.android.datatransport.runtime.time.C1354a;
import dagger.internal.C10742b;
import dagger.internal.C10744d;
import javax.inject.C11584a;

/* renamed from: c.a.b.a.i.u.g */
public final class C0506g implements C10742b<C1337g> {

    /* renamed from: a */
    private final C11584a<C1354a> f135a;

    public C0506g(C11584a<C1354a> aVar) {
        this.f135a = aVar;
    }

    /* renamed from: a */
    public static C1337g m173a(C1354a aVar) {
        C1337g a = C0505f.m172a(aVar);
        C10744d.m26606c(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    /* renamed from: b */
    public static C0506g m174b(C11584a<C1354a> aVar) {
        return new C0506g(aVar);
    }

    /* renamed from: c */
    public C1337g get() {
        return m173a(this.f135a.get());
    }
}
