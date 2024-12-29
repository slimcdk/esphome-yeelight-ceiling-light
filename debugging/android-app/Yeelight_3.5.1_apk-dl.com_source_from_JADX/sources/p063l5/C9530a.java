package p063l5;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.miot.service.manager.timer.TimerCodec;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.C3509b0;
import okhttp3.C3518c0;
import okhttp3.C3544s;
import okhttp3.C3558z;
import okhttp3.C9834u;
import okhttp3.Protocol;
import okio.C3564c;
import okio.C9837d;
import okio.C9838e;
import okio.C9845l;
import okio.C9852q;
import okio.C9853r;
import okio.C9854s;
import p056k5.C3299a;
import p056k5.C3300c;
import p063l5.C3317c;
import p073n5.C3381h;
import p073n5.C9732e;
import p073n5.C9733f;

/* renamed from: l5.a */
public final class C9530a implements C9834u {

    /* renamed from: a */
    final C9534f f17363a;

    /* renamed from: l5.a$a */
    class C9531a implements C9853r {

        /* renamed from: a */
        boolean f17364a;

        /* renamed from: b */
        final /* synthetic */ C9838e f17365b;

        /* renamed from: c */
        final /* synthetic */ C9532b f17366c;

        /* renamed from: d */
        final /* synthetic */ C9837d f17367d;

        C9531a(C9530a aVar, C9838e eVar, C9532b bVar, C9837d dVar) {
            this.f17365b = eVar;
            this.f17366c = bVar;
            this.f17367d = dVar;
        }

        /* renamed from: R0 */
        public long mo24477R0(C3564c cVar, long j) {
            try {
                long R0 = this.f17365b.mo24477R0(cVar, j);
                if (R0 == -1) {
                    if (!this.f17364a) {
                        this.f17364a = true;
                        this.f17367d.close();
                    }
                    return -1;
                }
                cVar.mo24747d(this.f17367d.mo24724F(), cVar.mo24758i1() - R0, R0);
                this.f17367d.mo24738Y();
                return R0;
            } catch (IOException e) {
                if (!this.f17364a) {
                    this.f17364a = true;
                    this.f17366c.mo24406a();
                }
                throw e;
            }
        }

        public void close() {
            if (!this.f17364a && !C3300c.m8930o(this, 100, TimeUnit.MILLISECONDS)) {
                this.f17364a = true;
                this.f17366c.mo24406a();
            }
            this.f17365b.close();
        }

        /* renamed from: j */
        public C9854s mo24479j() {
            return this.f17365b.mo24479j();
        }
    }

    public C9530a(C9534f fVar) {
        this.f17363a = fVar;
    }

    /* renamed from: b */
    private C3509b0 m23179b(C9532b bVar, C3509b0 b0Var) {
        C9852q b;
        if (bVar == null || (b = bVar.mo24407b()) == null) {
            return b0Var;
        }
        C9531a aVar = new C9531a(this, b0Var.mo24356a().mo24150k(), bVar, C9845l.m23737c(b));
        return b0Var.mo24367p().mo24374b(new C3381h(b0Var.mo24361h("Content-Type"), b0Var.mo24356a().mo24148d(), C9845l.m23738d(aVar))).mo24375c();
    }

    /* renamed from: c */
    private static C3544s m23180c(C3544s sVar, C3544s sVar2) {
        C3544s.C3545a aVar = new C3544s.C3545a();
        int h = sVar.mo24548h();
        for (int i = 0; i < h; i++) {
            String e = sVar.mo24545e(i);
            String i2 = sVar.mo24550i(i);
            if ((!"Warning".equalsIgnoreCase(e) || !i2.startsWith(TimerCodec.ENABLE)) && (m23181d(e) || !m23182e(e) || sVar2.mo24544c(e) == null)) {
                C3299a.f5331a.mo23925b(aVar, e, i2);
            }
        }
        int h2 = sVar2.mo24548h();
        for (int i3 = 0; i3 < h2; i3++) {
            String e2 = sVar2.mo24545e(i3);
            if (!m23181d(e2) && m23182e(e2)) {
                C3299a.f5331a.mo23925b(aVar, e2, sVar2.mo24550i(i3));
            }
        }
        return aVar.mo24556d();
    }

    /* renamed from: d */
    static boolean m23181d(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    /* renamed from: e */
    static boolean m23182e(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    /* renamed from: f */
    private static C3509b0 m23183f(C3509b0 b0Var) {
        return (b0Var == null || b0Var.mo24356a() == null) ? b0Var : b0Var.mo24367p().mo24374b((C3518c0) null).mo24375c();
    }

    /* renamed from: a */
    public C3509b0 mo35530a(C9834u.C9835a aVar) {
        C9534f fVar = this.f17363a;
        C3509b0 d = fVar != null ? fVar.mo24403d(aVar.mo38901a()) : null;
        C3317c c = new C3317c.C3318a(System.currentTimeMillis(), aVar.mo38901a(), d).mo24035c();
        C3558z zVar = c.f5362a;
        C3509b0 b0Var = c.f5363b;
        C9534f fVar2 = this.f17363a;
        if (fVar2 != null) {
            fVar2.mo24404e(c);
        }
        if (d != null && b0Var == null) {
            C3300c.m8921f(d.mo24356a());
        }
        if (zVar == null && b0Var == null) {
            return new C3509b0.C3510a().mo24386p(aVar.mo38901a()).mo24384n(Protocol.HTTP_1_1).mo24377g(TypedValues.PositionType.TYPE_PERCENT_HEIGHT).mo24381k("Unsatisfiable Request (only-if-cached)").mo24374b(C3300c.f5334c).mo24387q(-1).mo24385o(System.currentTimeMillis()).mo24375c();
        }
        if (zVar == null) {
            return b0Var.mo24367p().mo24376d(m23183f(b0Var)).mo24375c();
        }
        try {
            C3509b0 d2 = aVar.mo38904d(zVar);
            if (d2 == null && d != null) {
            }
            if (b0Var != null) {
                if (d2.mo24359d() == 304) {
                    C3509b0 c2 = b0Var.mo24367p().mo24380j(m23180c(b0Var.mo24363k(), d2.mo24363k())).mo24387q(d2.mo24355A()).mo24385o(d2.mo24371v()).mo24376d(m23183f(b0Var)).mo24382l(m23183f(d2)).mo24375c();
                    d2.mo24356a().close();
                    this.f17363a.mo24400a();
                    this.f17363a.mo24405f(b0Var, c2);
                    return c2;
                }
                C3300c.m8921f(b0Var.mo24356a());
            }
            C3509b0 c3 = d2.mo24367p().mo24376d(m23183f(b0Var)).mo24382l(m23183f(d2)).mo24375c();
            if (this.f17363a != null) {
                if (C9732e.m23357c(c3) && C3317c.m9018a(c3, zVar)) {
                    return m23179b(this.f17363a.mo24402c(c3), c3);
                }
                if (C9733f.m23370a(zVar.mo24658g())) {
                    try {
                        this.f17363a.mo24401b(zVar);
                    } catch (IOException unused) {
                    }
                }
            }
            return c3;
        } finally {
            if (d != null) {
                C3300c.m8921f(d.mo24356a());
            }
        }
    }
}
