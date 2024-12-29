package p156f.p157g0.p160g;

import java.util.List;
import p156f.C10829m;
import p156f.C10833u;
import p156f.C4318a0;
import p156f.C4322b0;
import p156f.C4332c0;
import p156f.C4379l;
import p156f.C4388s;
import p156f.C4392v;
import p156f.p157g0.C10751d;
import p156f.p157g0.C4345c;
import p163g.C10841k;
import p163g.C10843m;

/* renamed from: f.g0.g.a */
public final class C10765a implements C10833u {

    /* renamed from: a */
    private final C10829m f20669a;

    public C10765a(C10829m mVar) {
        this.f20669a = mVar;
    }

    /* renamed from: b */
    private String m26672b(List<C4379l> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            C4379l lVar = list.get(i);
            sb.append(lVar.mo24043c());
            sb.append('=');
            sb.append(lVar.mo24047k());
        }
        return sb.toString();
    }

    /* renamed from: a */
    public C4332c0 mo31916a(C10833u.C10834a aVar) {
        C4318a0 a = aVar.mo34023a();
        C4318a0.C4319a h = a.mo23814h();
        C4322b0 a2 = a.mo23807a();
        if (a2 != null) {
            C4392v b = a2.mo23828b();
            if (b != null) {
                h.mo23820d("Content-Type", b.toString());
            }
            long a3 = a2.mo23827a();
            if (a3 != -1) {
                h.mo23820d("Content-Length", Long.toString(a3));
                h.mo23823g("Transfer-Encoding");
            } else {
                h.mo23820d("Transfer-Encoding", "chunked");
                h.mo23823g("Content-Length");
            }
        }
        boolean z = false;
        if (a.mo23809c("Host") == null) {
            h.mo23820d("Host", C4345c.m12372s(a.mo23815i(), false));
        }
        if (a.mo23809c("Connection") == null) {
            h.mo23820d("Connection", "Keep-Alive");
        }
        if (a.mo23809c("Accept-Encoding") == null && a.mo23809c("Range") == null) {
            z = true;
            h.mo23820d("Accept-Encoding", "gzip");
        }
        List<C4379l> b2 = this.f20669a.mo34158b(a.mo23815i());
        if (!b2.isEmpty()) {
            h.mo23820d("Cookie", m26672b(b2));
        }
        if (a.mo23809c("User-Agent") == null) {
            h.mo23820d("User-Agent", C10751d.m26614a());
        }
        C4332c0 d = aVar.mo34026d(h.mo23818b());
        C10771e.m26691g(this.f20669a, a.mo23815i(), d.mo23864n());
        C4332c0.C4333a u = d.mo23869u();
        u.mo23883p(a);
        if (z && "gzip".equalsIgnoreCase(d.mo23862i("Content-Encoding")) && C10771e.m26687c(d)) {
            C10841k kVar = new C10841k(d.mo23857a().mo23840o());
            C4388s.C4389a f = d.mo23864n().mo24088f();
            f.mo24099f("Content-Encoding");
            f.mo24099f("Content-Length");
            u.mo23877j(f.mo24097d());
            u.mo23871b(new C4358h(d.mo23862i("Content-Type"), -1, C10843m.m27009d(kVar)));
        }
        return u.mo23872c();
    }
}
