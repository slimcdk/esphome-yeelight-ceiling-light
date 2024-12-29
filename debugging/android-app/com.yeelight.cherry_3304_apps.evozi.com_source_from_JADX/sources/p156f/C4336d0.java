package p156f;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import p156f.p157g0.C4345c;
import p163g.C4406c;
import p163g.C4410e;

/* renamed from: f.d0 */
public abstract class C4336d0 implements Closeable {

    /* renamed from: f.d0$a */
    class C4337a extends C4336d0 {

        /* renamed from: a */
        final /* synthetic */ C4392v f7625a;

        /* renamed from: b */
        final /* synthetic */ long f7626b;

        /* renamed from: c */
        final /* synthetic */ C4410e f7627c;

        C4337a(C4392v vVar, long j, C4410e eVar) {
            this.f7625a = vVar;
            this.f7626b = j;
            this.f7627c = eVar;
        }

        /* renamed from: h */
        public long mo23838h() {
            return this.f7626b;
        }

        @Nullable
        /* renamed from: i */
        public C4392v mo23839i() {
            return this.f7625a;
        }

        /* renamed from: o */
        public C4410e mo23840o() {
            return this.f7627c;
        }
    }

    /* renamed from: g */
    private Charset m12305g() {
        C4392v i = mo23839i();
        return i != null ? i.mo24135b(C4345c.f7648i) : C4345c.f7648i;
    }

    /* renamed from: j */
    public static C4336d0 m12306j(@Nullable C4392v vVar, long j, C4410e eVar) {
        if (eVar != null) {
            return new C4337a(vVar, j, eVar);
        }
        throw new NullPointerException("source == null");
    }

    /* renamed from: n */
    public static C4336d0 m12307n(@Nullable C4392v vVar, byte[] bArr) {
        C4406c cVar = new C4406c();
        cVar.mo24245l1(bArr);
        return m12306j(vVar, (long) bArr.length, cVar);
    }

    /* renamed from: a */
    public final InputStream mo23899a() {
        return mo23840o().mo24229d1();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final byte[] mo23900b() {
        long h = mo23838h();
        if (h <= 2147483647L) {
            C4410e o = mo23840o();
            try {
                byte[] v = o.mo24270v();
                C4345c.m12360g(o);
                if (h == -1 || h == ((long) v.length)) {
                    return v;
                }
                throw new IOException("Content-Length (" + h + ") and stream length (" + v.length + ") disagree");
            } catch (Throwable th) {
                C4345c.m12360g(o);
                throw th;
            }
        } else {
            throw new IOException("Cannot buffer entire body for content length: " + h);
        }
    }

    public void close() {
        C4345c.m12360g(mo23840o());
    }

    /* renamed from: h */
    public abstract long mo23838h();

    @Nullable
    /* renamed from: i */
    public abstract C4392v mo23839i();

    /* renamed from: o */
    public abstract C4410e mo23840o();

    /* renamed from: s */
    public final String mo23902s() {
        C4410e o = mo23840o();
        try {
            return o.mo24237i0(C4345c.m12356c(o, m12305g()));
        } finally {
            C4345c.m12360g(o);
        }
    }
}
