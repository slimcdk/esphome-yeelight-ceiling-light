package p073n5;

import java.util.List;
import okhttp3.C3505a0;
import okhttp3.C3509b0;
import okhttp3.C3535l;
import okhttp3.C3548v;
import okhttp3.C3558z;
import okhttp3.C9830m;
import okhttp3.C9834u;
import okio.C9843j;
import okio.C9845l;
import p056k5.C3300c;
import p056k5.C9297d;

/* renamed from: n5.a */
public final class C9726a implements C9834u {

    /* renamed from: a */
    private final C9830m f17543a;

    public C9726a(C9830m mVar) {
        this.f17543a = mVar;
    }

    /* renamed from: b */
    private String m23342b(List<C3535l> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            C3535l lVar = list.get(i);
            sb.append(lVar.mo24504c());
            sb.append('=');
            sb.append(lVar.mo24508k());
        }
        return sb.toString();
    }

    /* renamed from: a */
    public C3509b0 mo35530a(C9834u.C9835a aVar) {
        C3558z a = aVar.mo38901a();
        C3558z.C3559a h = a.mo24659h();
        C3505a0 a2 = a.mo24652a();
        if (a2 != null) {
            C3548v b = a2.mo24352b();
            if (b != null) {
                h.mo24664c("Content-Type", b.toString());
            }
            long a3 = a2.mo24351a();
            if (a3 != -1) {
                h.mo24664c("Content-Length", Long.toString(a3));
                h.mo24667f("Transfer-Encoding");
            } else {
                h.mo24664c("Transfer-Encoding", "chunked");
                h.mo24667f("Content-Length");
            }
        }
        boolean z = false;
        if (a.mo24654c("Host") == null) {
            h.mo24664c("Host", C3300c.m8933r(a.mo24660i(), false));
        }
        if (a.mo24654c("Connection") == null) {
            h.mo24664c("Connection", "Keep-Alive");
        }
        if (a.mo24654c("Accept-Encoding") == null && a.mo24654c("Range") == null) {
            z = true;
            h.mo24664c("Accept-Encoding", "gzip");
        }
        List<C3535l> b2 = this.f17543a.mo39078b(a.mo24660i());
        if (!b2.isEmpty()) {
            h.mo24664c("Cookie", m23342b(b2));
        }
        if (a.mo24654c("User-Agent") == null) {
            h.mo24664c("User-Agent", C9297d.m22767a());
        }
        C3509b0 d = aVar.mo38904d(h.mo24663b());
        C9732e.m23361g(this.f17543a, a.mo24660i(), d.mo24363k());
        C3509b0.C3510a p = d.mo24367p().mo24386p(a);
        if (z && "gzip".equalsIgnoreCase(d.mo24361h("Content-Encoding")) && C9732e.m23357c(d)) {
            C9843j jVar = new C9843j(d.mo24356a().mo24150k());
            p.mo24380j(d.mo24363k().mo24547f().mo24558f("Content-Encoding").mo24558f("Content-Length").mo24556d());
            p.mo24374b(new C3381h(d.mo24361h("Content-Type"), -1, C9845l.m23738d(jVar)));
        }
        return p.mo24375c();
    }
}
