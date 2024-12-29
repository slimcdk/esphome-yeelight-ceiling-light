package p156f.p157g0.p161i;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p156f.C10833u;
import p156f.C10835y;
import p156f.C4318a0;
import p156f.C4332c0;
import p156f.C4336d0;
import p156f.C4388s;
import p156f.C4396x;
import p156f.p157g0.C4344a;
import p156f.p157g0.C4345c;
import p156f.p157g0.p159f.C10763g;
import p156f.p157g0.p160g.C10768c;
import p156f.p157g0.p160g.C10771e;
import p156f.p157g0.p160g.C10774i;
import p156f.p157g0.p160g.C10776k;
import p156f.p157g0.p160g.C4358h;
import p163g.C10839i;
import p163g.C10843m;
import p163g.C4406c;
import p163g.C4411f;
import p163g.C4415s;
import p163g.C4416t;

/* renamed from: f.g0.i.f */
public final class C10793f implements C10768c {

    /* renamed from: f */
    private static final List<String> f20762f = C4345c.m12374u("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: g */
    private static final List<String> f20763g = C4345c.m12374u("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a */
    private final C10833u.C10834a f20764a;

    /* renamed from: b */
    final C10763g f20765b;

    /* renamed from: c */
    private final C10795g f20766c;

    /* renamed from: d */
    private C4361i f20767d;

    /* renamed from: e */
    private final C10835y f20768e;

    /* renamed from: f.g0.i.f$a */
    class C10794a extends C10839i {

        /* renamed from: b */
        boolean f20769b = false;

        /* renamed from: c */
        long f20770c = 0;

        C10794a(C4416t tVar) {
            super(tVar);
        }

        /* renamed from: b */
        private void m26797b(IOException iOException) {
            if (!this.f20769b) {
                this.f20769b = true;
                C10793f fVar = C10793f.this;
                fVar.f20765b.mo34012r(false, fVar, this.f20770c, iOException);
            }
        }

        /* renamed from: P0 */
        public long mo9541P0(C4406c cVar, long j) {
            try {
                long P0 = mo34164a().mo9541P0(cVar, j);
                if (P0 > 0) {
                    this.f20770c += P0;
                }
                return P0;
            } catch (IOException e) {
                m26797b(e);
                throw e;
            }
        }

        public void close() {
            super.close();
            m26797b((IOException) null);
        }
    }

    public C10793f(C4396x xVar, C10833u.C10834a aVar, C10763g gVar, C10795g gVar2) {
        this.f20764a = aVar;
        this.f20765b = gVar;
        this.f20766c = gVar2;
        this.f20768e = xVar.mo24171y().contains(C10835y.H2_PRIOR_KNOWLEDGE) ? C10835y.H2_PRIOR_KNOWLEDGE : C10835y.HTTP_2;
    }

    /* renamed from: g */
    public static List<C10787c> m26789g(C4318a0 a0Var) {
        C4388s e = a0Var.mo23811e();
        ArrayList arrayList = new ArrayList(e.mo24089h() + 4);
        arrayList.add(new C10787c(C10787c.f20732f, a0Var.mo23813g()));
        arrayList.add(new C10787c(C10787c.f20733g, C10774i.m26718c(a0Var.mo23815i())));
        String c = a0Var.mo23809c("Host");
        if (c != null) {
            arrayList.add(new C10787c(C10787c.f20735i, c));
        }
        arrayList.add(new C10787c(C10787c.f20734h, a0Var.mo23815i().mo24104E()));
        int h = e.mo24089h();
        for (int i = 0; i < h; i++) {
            C4411f h2 = C4411f.m12868h(e.mo24086e(i).toLowerCase(Locale.US));
            if (!f20762f.contains(h2.mo24303v())) {
                arrayList.add(new C10787c(h2, e.mo24091i(i)));
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public static C4332c0.C4333a m26790h(C4388s sVar, C10835y yVar) {
        C4388s.C4389a aVar = new C4388s.C4389a();
        int h = sVar.mo24089h();
        C10776k kVar = null;
        for (int i = 0; i < h; i++) {
            String e = sVar.mo24086e(i);
            String i2 = sVar.mo24091i(i);
            if (e.equals(":status")) {
                kVar = C10776k.m26729a("HTTP/1.1 " + i2);
            } else if (!f20763g.contains(e)) {
                C4344a.f7639a.mo23926b(aVar, e, i2);
            }
        }
        if (kVar != null) {
            C4332c0.C4333a aVar2 = new C4332c0.C4333a();
            aVar2.mo23881n(yVar);
            aVar2.mo23874g(kVar.f20692b);
            aVar2.mo23878k(kVar.f20693c);
            aVar2.mo23877j(aVar.mo24097d());
            return aVar2;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    /* renamed from: a */
    public void mo34014a() {
        this.f20767d.mo23985j().close();
    }

    /* renamed from: b */
    public void mo34015b(C4318a0 a0Var) {
        if (this.f20767d == null) {
            C4361i u = this.f20766c.mo34080u(m26789g(a0Var), a0Var.mo23807a() != null);
            this.f20767d = u;
            u.mo23989n().mo24317g((long) this.f20764a.mo34024b(), TimeUnit.MILLISECONDS);
            this.f20767d.mo23996u().mo24317g((long) this.f20764a.mo34025c(), TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: c */
    public C4336d0 mo34016c(C4332c0 c0Var) {
        C10763g gVar = this.f20765b;
        gVar.f20659f.mo24070q(gVar.f20658e);
        return new C4358h(c0Var.mo23862i("Content-Type"), C10771e.m26686b(c0Var), C10843m.m27009d(new C10794a(this.f20767d.mo23986k())));
    }

    public void cancel() {
        C4361i iVar = this.f20767d;
        if (iVar != null) {
            iVar.mo23983h(C10786b.CANCEL);
        }
    }

    /* renamed from: d */
    public C4332c0.C4333a mo34018d(boolean z) {
        C4332c0.C4333a h = m26790h(this.f20767d.mo23994s(), this.f20768e);
        if (!z || C4344a.f7639a.mo23928d(h) != 100) {
            return h;
        }
        return null;
    }

    /* renamed from: e */
    public void mo34019e() {
        this.f20766c.flush();
    }

    /* renamed from: f */
    public C4415s mo34020f(C4318a0 a0Var, long j) {
        return this.f20767d.mo23985j();
    }
}
