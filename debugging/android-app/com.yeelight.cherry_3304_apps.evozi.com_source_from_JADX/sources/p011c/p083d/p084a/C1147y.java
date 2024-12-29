package p011c.p083d.p084a;

import java.nio.charset.Charset;
import p011c.p083d.p084a.p085d0.C1024k;
import p163g.C4409d;
import p163g.C4411f;

/* renamed from: c.d.a.y */
public abstract class C1147y {

    /* renamed from: c.d.a.y$a */
    static class C1148a extends C1147y {

        /* renamed from: a */
        final /* synthetic */ C1138t f1885a;

        /* renamed from: b */
        final /* synthetic */ C4411f f1886b;

        C1148a(C1138t tVar, C4411f fVar) {
            this.f1885a = tVar;
            this.f1886b = fVar;
        }

        /* renamed from: a */
        public long mo9796a() {
            return (long) this.f1886b.mo24297q();
        }

        /* renamed from: b */
        public C1138t mo9797b() {
            return this.f1885a;
        }

        /* renamed from: g */
        public void mo9798g(C4409d dVar) {
            dVar.mo24211M0(this.f1886b);
        }
    }

    /* renamed from: c.d.a.y$b */
    static class C1149b extends C1147y {

        /* renamed from: a */
        final /* synthetic */ C1138t f1887a;

        /* renamed from: b */
        final /* synthetic */ int f1888b;

        /* renamed from: c */
        final /* synthetic */ byte[] f1889c;

        /* renamed from: d */
        final /* synthetic */ int f1890d;

        C1149b(C1138t tVar, int i, byte[] bArr, int i2) {
            this.f1887a = tVar;
            this.f1888b = i;
            this.f1889c = bArr;
            this.f1890d = i2;
        }

        /* renamed from: a */
        public long mo9796a() {
            return (long) this.f1888b;
        }

        /* renamed from: b */
        public C1138t mo9797b() {
            return this.f1887a;
        }

        /* renamed from: g */
        public void mo9798g(C4409d dVar) {
            dVar.mo24244l0(this.f1889c, this.f1890d, this.f1888b);
        }
    }

    /* renamed from: c */
    public static C1147y m2878c(C1138t tVar, String str) {
        Charset charset = C1024k.f1345c;
        if (tVar != null && (charset = tVar.mo9787a()) == null) {
            charset = C1024k.f1345c;
            tVar = C1138t.m2782c(tVar + "; charset=utf-8");
        }
        return m2880e(tVar, str.getBytes(charset));
    }

    /* renamed from: d */
    public static C1147y m2879d(C1138t tVar, C4411f fVar) {
        return new C1148a(tVar, fVar);
    }

    /* renamed from: e */
    public static C1147y m2880e(C1138t tVar, byte[] bArr) {
        return m2881f(tVar, bArr, 0, bArr.length);
    }

    /* renamed from: f */
    public static C1147y m2881f(C1138t tVar, byte[] bArr, int i, int i2) {
        if (bArr != null) {
            C1024k.m2090a((long) bArr.length, (long) i, (long) i2);
            return new C1149b(tVar, i2, bArr, i);
        }
        throw new NullPointerException("content == null");
    }

    /* renamed from: a */
    public long mo9796a() {
        return -1;
    }

    /* renamed from: b */
    public abstract C1138t mo9797b();

    /* renamed from: g */
    public abstract void mo9798g(C4409d dVar);
}
