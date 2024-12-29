package p011c.p012a.p019b.p020a.p021i;

import android.content.Context;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1347m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1351q;
import com.google.android.datatransport.runtime.time.C1354a;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import java.util.Collections;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import p011c.p012a.p019b.p020a.C0459b;
import p011c.p012a.p019b.p020a.C0464g;
import p011c.p012a.p019b.p020a.C0465h;
import p011c.p012a.p019b.p020a.p021i.C0481h;
import p011c.p012a.p019b.p020a.p021i.C0487l;
import p011c.p012a.p019b.p020a.p021i.C0493q;
import p011c.p012a.p019b.p020a.p021i.p024u.C0504e;

@Singleton
/* renamed from: c.a.b.a.i.p */
public class C0492p implements C0491o {

    /* renamed from: e */
    private static volatile C0493q f107e;

    /* renamed from: a */
    private final C1354a f108a;

    /* renamed from: b */
    private final C1354a f109b;

    /* renamed from: c */
    private final C0504e f110c;

    /* renamed from: d */
    private final C1347m f111d;

    @Inject
    C0492p(@WallTime C1354a aVar, @Monotonic C1354a aVar2, C0504e eVar, C1347m mVar, C1351q qVar) {
        this.f108a = aVar;
        this.f109b = aVar2;
        this.f110c = eVar;
        this.f111d = mVar;
        qVar.mo10265a();
    }

    /* renamed from: b */
    private C0481h m143b(C0485k kVar) {
        C0481h.C0482a a = C0481h.m91a();
        a.mo8419i(this.f108a.mo10267a());
        a.mo8421k(this.f109b.mo10267a());
        a.mo8420j(kVar.mo8427g());
        a.mo8418h(new C0480g(kVar.mo8422b(), kVar.mo8468d()));
        a.mo8417g(kVar.mo8423c().mo8391a());
        return a.mo8414d();
    }

    /* renamed from: c */
    public static C0492p m144c() {
        C0493q qVar = f107e;
        if (qVar != null) {
            return qVar.mo8446b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: d */
    private static Set<C0459b> m145d(C0478e eVar) {
        return eVar instanceof C0479f ? Collections.unmodifiableSet(((C0479f) eVar).mo8452a()) : Collections.singleton(C0459b.m41b("proto"));
    }

    /* renamed from: f */
    public static void m146f(Context context) {
        if (f107e == null) {
            synchronized (C0492p.class) {
                if (f107e == null) {
                    C0493q.C0494a g = C0475d.m82g();
                    g.mo8447a(context);
                    f107e = g.build();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo8471a(C0485k kVar, C0465h hVar) {
        this.f110c.mo8480a(kVar.mo8426f().mo8469e(kVar.mo8423c().mo8393c()), m143b(kVar), hVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: e */
    public C1347m mo8472e() {
        return this.f111d;
    }

    /* renamed from: g */
    public C0464g mo8473g(C0478e eVar) {
        Set<C0459b> d = m145d(eVar);
        C0487l.C0488a a = C0487l.m131a();
        a.mo8442b(eVar.getName());
        a.mo8443c(eVar.getExtras());
        return new C0489m(d, a.mo8441a(), this);
    }
}
