package p011c.p012a.p019b.p020a.p021i.p024u;

import com.google.android.datatransport.runtime.backends.C1316e;
import com.google.android.datatransport.runtime.backends.C1328n;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1353s;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import javax.inject.Inject;
import p011c.p012a.p019b.p020a.C0465h;
import p011c.p012a.p019b.p020a.p021i.C0481h;
import p011c.p012a.p019b.p020a.p021i.C0487l;
import p011c.p012a.p019b.p020a.p021i.C0492p;
import p011c.p012a.p019b.p020a.p021i.p024u.p025j.C0519c;
import p011c.p012a.p019b.p020a.p021i.p026v.C0553b;

/* renamed from: c.a.b.a.i.u.c */
public class C0502c implements C0504e {

    /* renamed from: f */
    private static final Logger f124f = Logger.getLogger(C0492p.class.getName());

    /* renamed from: a */
    private final C1353s f125a;

    /* renamed from: b */
    private final Executor f126b;

    /* renamed from: c */
    private final C1316e f127c;

    /* renamed from: d */
    private final C0519c f128d;

    /* renamed from: e */
    private final C0553b f129e;

    @Inject
    public C0502c(Executor executor, C1316e eVar, C1353s sVar, C0519c cVar, C0553b bVar) {
        this.f126b = executor;
        this.f127c = eVar;
        this.f125a = sVar;
        this.f128d = cVar;
        this.f129e = bVar;
    }

    /* renamed from: b */
    static /* synthetic */ Object m166b(C0502c cVar, C0487l lVar, C0481h hVar) {
        cVar.f128d.mo8505K0(lVar, hVar);
        cVar.f125a.mo10234a(lVar, 1);
        return null;
    }

    /* renamed from: c */
    static /* synthetic */ void m167c(C0502c cVar, C0487l lVar, C0465h hVar, C0481h hVar2) {
        try {
            C1328n a = cVar.f127c.mo10226a(lVar.mo8436b());
            if (a == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{lVar.mo8436b()});
                f124f.warning(format);
                hVar.mo8404a(new IllegalArgumentException(format));
                return;
            }
            cVar.f129e.mo8509a(C0501b.m164a(cVar, lVar, a.mo10203b(hVar2)));
            hVar.mo8404a((Exception) null);
        } catch (Exception e) {
            Logger logger = f124f;
            logger.warning("Error scheduling event " + e.getMessage());
            hVar.mo8404a(e);
        }
    }

    /* renamed from: a */
    public void mo8480a(C0487l lVar, C0481h hVar, C0465h hVar2) {
        this.f126b.execute(C0500a.m163b(this, lVar, hVar2, hVar));
    }
}
