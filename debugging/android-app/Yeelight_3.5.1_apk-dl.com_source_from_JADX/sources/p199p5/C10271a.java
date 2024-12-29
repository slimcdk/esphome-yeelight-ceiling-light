package p199p5;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.C3509b0;
import okhttp3.C3518c0;
import okhttp3.C3544s;
import okhttp3.C3552x;
import okhttp3.C3558z;
import okhttp3.C9834u;
import okhttp3.Protocol;
import okhttp3.internal.http2.C3527f;
import okhttp3.internal.http2.C9802a;
import okhttp3.internal.http2.C9808d;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;
import okio.C3564c;
import okio.C9841h;
import okio.C9845l;
import okio.C9852q;
import okio.C9853r;
import p056k5.C3299a;
import p056k5.C3300c;
import p073n5.C3381h;
import p073n5.C9729c;
import p073n5.C9732e;
import p073n5.C9735i;
import p073n5.C9737k;
import p186m5.C9554e;

/* renamed from: p5.a */
public final class C10271a implements C9729c {

    /* renamed from: f */
    private static final List<String> f19340f = C3300c.m8935t("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: g */
    private static final List<String> f19341g = C3300c.m8935t("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a */
    private final C9834u.C9835a f19342a;

    /* renamed from: b */
    final C9554e f19343b;

    /* renamed from: c */
    private final C9808d f19344c;

    /* renamed from: d */
    private C3527f f19345d;

    /* renamed from: e */
    private final Protocol f19346e;

    /* renamed from: p5.a$a */
    class C10272a extends C9841h {

        /* renamed from: b */
        boolean f19347b = false;

        /* renamed from: c */
        long f19348c = 0;

        C10272a(C9853r rVar) {
            super(rVar);
        }

        /* renamed from: c */
        private void m25840c(IOException iOException) {
            if (!this.f19347b) {
                this.f19347b = true;
                C10271a aVar = C10271a.this;
                aVar.f19343b.mo38532r(false, aVar, this.f19348c, iOException);
            }
        }

        /* renamed from: R0 */
        public long mo24477R0(C3564c cVar, long j) {
            try {
                long R0 = mo39083a().mo24477R0(cVar, j);
                if (R0 > 0) {
                    this.f19348c += R0;
                }
                return R0;
            } catch (IOException e) {
                m25840c(e);
                throw e;
            }
        }

        public void close() {
            super.close();
            m25840c((IOException) null);
        }
    }

    public C10271a(C3552x xVar, C9834u.C9835a aVar, C9554e eVar, C9808d dVar) {
        this.f19342a = aVar;
        this.f19343b = eVar;
        this.f19344c = dVar;
        List<Protocol> x = xVar.mo24628x();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f19346e = !x.contains(protocol) ? Protocol.HTTP_2 : protocol;
    }

    /* renamed from: g */
    public static List<C9802a> m25832g(C3558z zVar) {
        C3544s e = zVar.mo24656e();
        ArrayList arrayList = new ArrayList(e.mo24548h() + 4);
        arrayList.add(new C9802a(C9802a.f17695f, zVar.mo24658g()));
        arrayList.add(new C9802a(C9802a.f17696g, C9735i.m23388c(zVar.mo24660i())));
        String c = zVar.mo24654c("Host");
        if (c != null) {
            arrayList.add(new C9802a(C9802a.f17698i, c));
        }
        arrayList.add(new C9802a(C9802a.f17697h, zVar.mo24660i().mo24563E()));
        int h = e.mo24548h();
        for (int i = 0; i < h; i++) {
            ByteString encodeUtf8 = ByteString.encodeUtf8(e.mo24545e(i).toLowerCase(Locale.US));
            if (!f19340f.contains(encodeUtf8.utf8())) {
                arrayList.add(new C9802a(encodeUtf8, e.mo24550i(i)));
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public static C3509b0.C3510a m25833h(C3544s sVar, Protocol protocol) {
        C3544s.C3545a aVar = new C3544s.C3545a();
        int h = sVar.mo24548h();
        C9737k kVar = null;
        for (int i = 0; i < h; i++) {
            String e = sVar.mo24545e(i);
            String i2 = sVar.mo24550i(i);
            if (e.equals(":status")) {
                kVar = C9737k.m23399a("HTTP/1.1 " + i2);
            } else if (!f19341g.contains(e)) {
                C3299a.f5331a.mo23925b(aVar, e, i2);
            }
        }
        if (kVar != null) {
            return new C3509b0.C3510a().mo24384n(protocol).mo24377g(kVar.f17566b).mo24381k(kVar.f17567c).mo24380j(aVar.mo24556d());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    /* renamed from: a */
    public void mo38892a() {
        this.f19345d.mo24462j().close();
    }

    /* renamed from: b */
    public void mo38893b(C3558z zVar) {
        if (this.f19345d == null) {
            C3527f p = this.f19344c.mo39026p(m25832g(zVar), zVar.mo24652a() != null);
            this.f19345d = p;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            p.mo24466n().mo39091g((long) this.f19342a.mo38902b(), timeUnit);
            this.f19345d.mo24473u().mo39091g((long) this.f19342a.mo38903c(), timeUnit);
        }
    }

    /* renamed from: c */
    public C3518c0 mo38894c(C3509b0 b0Var) {
        C9554e eVar = this.f19343b;
        eVar.f17446f.mo24529q(eVar.f17445e);
        return new C3381h(b0Var.mo24361h("Content-Type"), C9732e.m23356b(b0Var), C9845l.m23738d(new C10272a(this.f19345d.mo24463k())));
    }

    public void cancel() {
        C3527f fVar = this.f19345d;
        if (fVar != null) {
            fVar.mo24460h(ErrorCode.CANCEL);
        }
    }

    /* renamed from: d */
    public C3509b0.C3510a mo38896d(boolean z) {
        C3509b0.C3510a h = m25833h(this.f19345d.mo24471s(), this.f19346e);
        if (!z || C3299a.f5331a.mo23927d(h) != 100) {
            return h;
        }
        return null;
    }

    /* renamed from: e */
    public void mo38897e() {
        this.f19344c.flush();
    }

    /* renamed from: f */
    public C9852q mo38898f(C3558z zVar, long j) {
        return this.f19345d.mo24462j();
    }
}
