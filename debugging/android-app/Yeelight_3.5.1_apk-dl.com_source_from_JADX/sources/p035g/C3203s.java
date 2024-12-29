package p035g;

import android.content.Context;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import java.util.Collections;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import p031f.C3150a;
import p031f.C3153d;
import p031f.C3154e;
import p064m.C3328e;
import p068n.C3350p;
import p068n.C3352t;
import p083q.C3604a;

@Singleton
/* renamed from: g.s */
public class C3203s implements C3202r {

    /* renamed from: e */
    private static volatile C3204t f5167e;

    /* renamed from: a */
    private final C3604a f5168a;

    /* renamed from: b */
    private final C3604a f5169b;

    /* renamed from: c */
    private final C3328e f5170c;

    /* renamed from: d */
    private final C3350p f5171d;

    @Inject
    C3203s(@WallTime C3604a aVar, @Monotonic C3604a aVar2, C3328e eVar, C3350p pVar, C3352t tVar) {
        this.f5168a = aVar;
        this.f5169b = aVar2;
        this.f5170c = eVar;
        this.f5171d = pVar;
        tVar.mo24102c();
    }

    /* renamed from: b */
    private C3188i m8622b(C3196n nVar) {
        return C3188i.m8566a().mo23714i(this.f5168a.mo25913a()).mo23716k(this.f5169b.mo25913a()).mo23715j(nVar.mo23722g()).mo23713h(new C3187h(nVar.mo23717b(), nVar.mo23762d())).mo23712g(nVar.mo23718c().mo11090a()).mo23709d();
    }

    /* renamed from: c */
    public static C3203s m8623c() {
        C3204t tVar = f5167e;
        if (tVar != null) {
            return tVar.mo23741c();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: d */
    private static Set<C3150a> m8624d(C3185f fVar) {
        return fVar instanceof C3186g ? Collections.unmodifiableSet(((C3186g) fVar).mo11097a()) : Collections.singleton(C3150a.m8421b("proto"));
    }

    /* renamed from: f */
    public static void m8625f(Context context) {
        if (f5167e == null) {
            synchronized (C3203s.class) {
                if (f5167e == null) {
                    f5167e = C3182e.m8557d().mo23742a(context).build();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo23766a(C3196n nVar, C3154e eVar) {
        this.f5170c.mo24062a(nVar.mo23721f().mo23764f(nVar.mo23718c().mo11092c()), m8622b(nVar), eVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: e */
    public C3350p mo23767e() {
        return this.f5171d;
    }

    /* renamed from: g */
    public C3153d mo23768g(C3185f fVar) {
        return new C3200p(m8624d(fVar), C3198o.m8609a().mo23737b(fVar.getName()).mo23738c(fVar.getExtras()).mo23736a(), this);
    }
}
