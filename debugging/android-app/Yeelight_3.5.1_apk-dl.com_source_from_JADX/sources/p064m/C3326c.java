package p064m;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import javax.inject.Inject;
import p031f.C3154e;
import p035g.C3188i;
import p035g.C3198o;
import p035g.C3203s;
import p039h.C3222b;
import p039h.C3229h;
import p068n.C3354v;
import p075o.C3388d;
import p079p.C3590a;

/* renamed from: m.c */
public class C3326c implements C3328e {

    /* renamed from: f */
    private static final Logger f5416f = Logger.getLogger(C3203s.class.getName());

    /* renamed from: a */
    private final C3354v f5417a;

    /* renamed from: b */
    private final Executor f5418b;

    /* renamed from: c */
    private final C3222b f5419c;

    /* renamed from: d */
    private final C3388d f5420d;

    /* renamed from: e */
    private final C3590a f5421e;

    @Inject
    public C3326c(Executor executor, C3222b bVar, C3354v vVar, C3388d dVar, C3590a aVar) {
        this.f5418b = executor;
        this.f5419c = bVar;
        this.f5417a = vVar;
        this.f5420d = dVar;
        this.f5421e = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m9057d(C3198o oVar, C3188i iVar) {
        this.f5420d.mo24181F0(oVar, iVar);
        this.f5417a.mo24093a(oVar, 1);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m9058e(C3198o oVar, C3154e eVar, C3188i iVar) {
        try {
            C3229h hVar = this.f5419c.get(oVar.mo23731b());
            if (hVar == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{oVar.mo23731b()});
                f5416f.warning(format);
                eVar.mo23646a(new IllegalArgumentException(format));
                return;
            }
            this.f5421e.mo24194a(new C9544b(this, oVar, hVar.mo11106b(iVar)));
            eVar.mo23646a((Exception) null);
        } catch (Exception e) {
            Logger logger = f5416f;
            logger.warning("Error scheduling event " + e.getMessage());
            eVar.mo23646a(e);
        }
    }

    /* renamed from: a */
    public void mo24062a(C3198o oVar, C3188i iVar, C3154e eVar) {
        this.f5418b.execute(new C9543a(this, oVar, eVar, iVar));
    }
}
