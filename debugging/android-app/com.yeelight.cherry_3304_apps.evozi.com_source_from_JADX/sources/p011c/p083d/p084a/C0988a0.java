package p011c.p083d.p084a;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import p011c.p083d.p084a.p085d0.C1024k;
import p163g.C4406c;
import p163g.C4410e;

/* renamed from: c.d.a.a0 */
public abstract class C0988a0 implements Closeable {

    /* renamed from: a */
    private Reader f1214a;

    /* renamed from: c.d.a.a0$a */
    static class C0989a extends C0988a0 {

        /* renamed from: b */
        final /* synthetic */ C1138t f1215b;

        /* renamed from: c */
        final /* synthetic */ long f1216c;

        /* renamed from: d */
        final /* synthetic */ C4410e f1217d;

        C0989a(C1138t tVar, long j, C4410e eVar) {
            this.f1215b = tVar;
            this.f1216c = j;
            this.f1217d = eVar;
        }

        /* renamed from: i */
        public long mo9388i() {
            return this.f1216c;
        }

        /* renamed from: j */
        public C1138t mo9389j() {
            return this.f1215b;
        }

        /* renamed from: s */
        public C4410e mo9390s() {
            return this.f1217d;
        }
    }

    /* renamed from: h */
    private Charset m1899h() {
        C1138t j = mo9389j();
        return j != null ? j.mo9788b(C1024k.f1345c) : C1024k.f1345c;
    }

    /* renamed from: n */
    public static C0988a0 m1900n(C1138t tVar, long j, C4410e eVar) {
        if (eVar != null) {
            return new C0989a(tVar, j, eVar);
        }
        throw new NullPointerException("source == null");
    }

    /* renamed from: o */
    public static C0988a0 m1901o(C1138t tVar, String str) {
        Charset charset = C1024k.f1345c;
        if (tVar != null && (charset = tVar.mo9787a()) == null) {
            charset = C1024k.f1345c;
            tVar = C1138t.m2782c(tVar + "; charset=utf-8");
        }
        C4406c cVar = new C4406c();
        cVar.mo24266t1(str, charset);
        return m1900n(tVar, cVar.mo24233g1(), cVar);
    }

    /* renamed from: a */
    public final InputStream mo9384a() {
        return mo9390s().mo24229d1();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final byte[] mo9385b() {
        long i = mo9388i();
        if (i <= 2147483647L) {
            C4410e s = mo9390s();
            try {
                byte[] v = s.mo24270v();
                C1024k.m2092c(s);
                if (i == -1 || i == ((long) v.length)) {
                    return v;
                }
                throw new IOException("Content-Length and stream length disagree");
            } catch (Throwable th) {
                C1024k.m2092c(s);
                throw th;
            }
        } else {
            throw new IOException("Cannot buffer entire body for content length: " + i);
        }
    }

    public void close() {
        mo9390s().close();
    }

    /* renamed from: g */
    public final Reader mo9387g() {
        Reader reader = this.f1214a;
        if (reader != null) {
            return reader;
        }
        InputStreamReader inputStreamReader = new InputStreamReader(mo9384a(), m1899h());
        this.f1214a = inputStreamReader;
        return inputStreamReader;
    }

    /* renamed from: i */
    public abstract long mo9388i();

    /* renamed from: j */
    public abstract C1138t mo9389j();

    /* renamed from: s */
    public abstract C4410e mo9390s();

    /* renamed from: t */
    public final String mo9391t() {
        return new String(mo9385b(), m1899h().name());
    }
}
