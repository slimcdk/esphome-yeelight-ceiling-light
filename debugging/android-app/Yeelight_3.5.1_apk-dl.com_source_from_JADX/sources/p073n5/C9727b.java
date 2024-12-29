package p073n5;

import java.net.ProtocolException;
import okhttp3.C3509b0;
import okhttp3.C3518c0;
import okhttp3.C3558z;
import okhttp3.C9834u;
import okhttp3.internal.connection.C3526a;
import okio.C3564c;
import okio.C9837d;
import okio.C9840g;
import okio.C9845l;
import okio.C9852q;
import p056k5.C3300c;
import p186m5.C9554e;

/* renamed from: n5.b */
public final class C9727b implements C9834u {

    /* renamed from: a */
    private final boolean f17544a;

    /* renamed from: n5.b$a */
    static final class C9728a extends C9840g {

        /* renamed from: b */
        long f17545b;

        C9728a(C9852q qVar) {
            super(qVar);
        }

        /* renamed from: q0 */
        public void mo24476q0(C3564c cVar, long j) {
            super.mo24476q0(cVar, j);
            this.f17545b += j;
        }
    }

    public C9727b(boolean z) {
        this.f17544a = z;
    }

    /* renamed from: a */
    public C3509b0 mo35530a(C9834u.C9835a aVar) {
        C3509b0.C3510a aVar2;
        C3518c0 c0Var;
        C9734g gVar = (C9734g) aVar;
        C9729c i = gVar.mo38909i();
        C9554e k = gVar.mo38911k();
        C3526a aVar3 = (C3526a) gVar.mo38907g();
        C3558z a = gVar.mo38901a();
        long currentTimeMillis = System.currentTimeMillis();
        gVar.mo38908h().mo24527o(gVar.mo38906f());
        i.mo38893b(a);
        gVar.mo38908h().mo24526n(gVar.mo38906f(), a);
        C3509b0.C3510a aVar4 = null;
        if (C9733f.m23371b(a.mo24658g()) && a.mo24652a() != null) {
            if ("100-continue".equalsIgnoreCase(a.mo24654c("Expect"))) {
                i.mo38897e();
                gVar.mo38908h().mo24531s(gVar.mo38906f());
                aVar4 = i.mo38896d(true);
            }
            if (aVar4 == null) {
                gVar.mo38908h().mo24525m(gVar.mo38906f());
                C9728a aVar5 = new C9728a(i.mo38898f(a, a.mo24652a().mo24351a()));
                C9837d c = C9845l.m23737c(aVar5);
                a.mo24652a().mo24353f(c);
                c.close();
                gVar.mo38908h().mo24524l(gVar.mo38906f(), aVar5.f17545b);
            } else if (!aVar3.mo24450n()) {
                k.mo38527j();
            }
        }
        i.mo38892a();
        if (aVar4 == null) {
            gVar.mo38908h().mo24531s(gVar.mo38906f());
            aVar4 = i.mo38896d(false);
        }
        C3509b0 c2 = aVar4.mo24386p(a).mo24378h(k.mo38524d().mo24447k()).mo24387q(currentTimeMillis).mo24385o(System.currentTimeMillis()).mo24375c();
        int d = c2.mo24359d();
        if (d == 100) {
            c2 = i.mo38896d(false).mo24386p(a).mo24378h(k.mo38524d().mo24447k()).mo24387q(currentTimeMillis).mo24385o(System.currentTimeMillis()).mo24375c();
            d = c2.mo24359d();
        }
        gVar.mo38908h().mo24530r(gVar.mo38906f(), c2);
        if (!this.f17544a || d != 101) {
            aVar2 = c2.mo24367p();
            c0Var = i.mo38894c(c2);
        } else {
            aVar2 = c2.mo24367p();
            c0Var = C3300c.f5334c;
        }
        C3509b0 c3 = aVar2.mo24374b(c0Var).mo24375c();
        if ("close".equalsIgnoreCase(c3.mo24372z().mo24654c("Connection")) || "close".equalsIgnoreCase(c3.mo24361h("Connection"))) {
            k.mo38527j();
        }
        if ((d != 204 && d != 205) || c3.mo24356a().mo24148d() <= 0) {
            return c3;
        }
        throw new ProtocolException("HTTP " + d + " had non-zero Content-Length: " + c3.mo24356a().mo24148d());
    }
}
