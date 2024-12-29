package p156f;

import java.io.File;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import p156f.p157g0.C4345c;
import p163g.C10843m;
import p163g.C4409d;
import p163g.C4416t;

/* renamed from: f.b0 */
public abstract class C4322b0 {

    /* renamed from: f.b0$a */
    class C4323a extends C4322b0 {

        /* renamed from: a */
        final /* synthetic */ C4392v f7539a;

        /* renamed from: b */
        final /* synthetic */ int f7540b;

        /* renamed from: c */
        final /* synthetic */ byte[] f7541c;

        /* renamed from: d */
        final /* synthetic */ int f7542d;

        C4323a(C4392v vVar, int i, byte[] bArr, int i2) {
            this.f7539a = vVar;
            this.f7540b = i;
            this.f7541c = bArr;
            this.f7542d = i2;
        }

        /* renamed from: a */
        public long mo23827a() {
            return (long) this.f7540b;
        }

        @Nullable
        /* renamed from: b */
        public C4392v mo23828b() {
            return this.f7539a;
        }

        /* renamed from: g */
        public void mo23829g(C4409d dVar) {
            dVar.mo24244l0(this.f7541c, this.f7542d, this.f7540b);
        }
    }

    /* renamed from: f.b0$b */
    class C4324b extends C4322b0 {

        /* renamed from: a */
        final /* synthetic */ C4392v f7543a;

        /* renamed from: b */
        final /* synthetic */ File f7544b;

        C4324b(C4392v vVar, File file) {
            this.f7543a = vVar;
            this.f7544b = file;
        }

        /* renamed from: a */
        public long mo23827a() {
            return this.f7544b.length();
        }

        @Nullable
        /* renamed from: b */
        public C4392v mo23828b() {
            return this.f7543a;
        }

        /* renamed from: g */
        public void mo23829g(C4409d dVar) {
            C4416t tVar = null;
            try {
                tVar = C10843m.m27015j(this.f7544b);
                dVar.mo24261s0(tVar);
            } finally {
                C4345c.m12360g(tVar);
            }
        }
    }

    /* renamed from: c */
    public static C4322b0 m12218c(@Nullable C4392v vVar, File file) {
        if (file != null) {
            return new C4324b(vVar, file);
        }
        throw new NullPointerException("file == null");
    }

    /* renamed from: d */
    public static C4322b0 m12219d(@Nullable C4392v vVar, String str) {
        Charset charset = C4345c.f7648i;
        if (vVar != null && (charset = vVar.mo24134a()) == null) {
            charset = C4345c.f7648i;
            vVar = C4392v.m12671d(vVar + "; charset=utf-8");
        }
        return m12220e(vVar, str.getBytes(charset));
    }

    /* renamed from: e */
    public static C4322b0 m12220e(@Nullable C4392v vVar, byte[] bArr) {
        return m12221f(vVar, bArr, 0, bArr.length);
    }

    /* renamed from: f */
    public static C4322b0 m12221f(@Nullable C4392v vVar, byte[] bArr, int i, int i2) {
        if (bArr != null) {
            C4345c.m12359f((long) bArr.length, (long) i, (long) i2);
            return new C4323a(vVar, i2, bArr, i);
        }
        throw new NullPointerException("content == null");
    }

    /* renamed from: a */
    public long mo23827a() {
        return -1;
    }

    @Nullable
    /* renamed from: b */
    public abstract C4392v mo23828b();

    /* renamed from: g */
    public abstract void mo23829g(C4409d dVar);
}
