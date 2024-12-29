package p173j;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import javax.annotation.Nullable;
import p156f.C4318a0;
import p156f.C4322b0;
import p156f.C4385q;
import p156f.C4388s;
import p156f.C4390t;
import p156f.C4392v;
import p156f.C4393w;
import p163g.C4406c;
import p163g.C4409d;

/* renamed from: j.k */
final class C4474k {

    /* renamed from: k */
    private static final char[] f8056k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    private final String f8057a;

    /* renamed from: b */
    private final C4390t f8058b;
    @Nullable

    /* renamed from: c */
    private String f8059c;
    @Nullable

    /* renamed from: d */
    private C4390t.C4391a f8060d;

    /* renamed from: e */
    private final C4318a0.C4319a f8061e;
    @Nullable

    /* renamed from: f */
    private C4392v f8062f;

    /* renamed from: g */
    private final boolean f8063g;
    @Nullable

    /* renamed from: h */
    private C4393w.C4394a f8064h;
    @Nullable

    /* renamed from: i */
    private C4385q.C4386a f8065i;
    @Nullable

    /* renamed from: j */
    private C4322b0 f8066j;

    /* renamed from: j.k$a */
    private static class C4475a extends C4322b0 {

        /* renamed from: a */
        private final C4322b0 f8067a;

        /* renamed from: b */
        private final C4392v f8068b;

        C4475a(C4322b0 b0Var, C4392v vVar) {
            this.f8067a = b0Var;
            this.f8068b = vVar;
        }

        /* renamed from: a */
        public long mo23827a() {
            return this.f8067a.mo23827a();
        }

        /* renamed from: b */
        public C4392v mo23828b() {
            return this.f8068b;
        }

        /* renamed from: g */
        public void mo23829g(C4409d dVar) {
            this.f8067a.mo23829g(dVar);
        }
    }

    C4474k(String str, C4390t tVar, @Nullable String str2, @Nullable C4388s sVar, @Nullable C4392v vVar, boolean z, boolean z2, boolean z3) {
        this.f8057a = str;
        this.f8058b = tVar;
        this.f8059c = str2;
        C4318a0.C4319a aVar = new C4318a0.C4319a();
        this.f8061e = aVar;
        this.f8062f = vVar;
        this.f8063g = z;
        if (sVar != null) {
            aVar.mo23821e(sVar);
        }
        if (z2) {
            this.f8065i = new C4385q.C4386a();
        } else if (z3) {
            C4393w.C4394a aVar2 = new C4393w.C4394a();
            this.f8064h = aVar2;
            aVar2.mo24145f(C4393w.f7856f);
        }
    }

    /* renamed from: h */
    private static String m13174h(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                C4406c cVar = new C4406c();
                cVar.mo24271v1(str, 0, i);
                m13175i(cVar, str, i, length, z);
                return cVar.mo24228d0();
            }
            i += Character.charCount(codePointAt);
        }
        return str;
    }

    /* renamed from: i */
    private static void m13175i(C4406c cVar, String str, int i, int i2, boolean z) {
        C4406c cVar2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                    if (cVar2 == null) {
                        cVar2 = new C4406c();
                    }
                    cVar2.mo24272w1(codePointAt);
                    while (!cVar2.mo24274x()) {
                        byte readByte = cVar2.readByte() & 255;
                        cVar.mo24247n1(37);
                        cVar.mo24247n1(f8056k[(readByte >> 4) & 15]);
                        cVar.mo24247n1(f8056k[readByte & ParameterInitDefType.CubemapSamplerInit]);
                    }
                } else {
                    cVar.mo24272w1(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo24553a(String str, String str2, boolean z) {
        if (z) {
            this.f8065i.mo24077b(str, str2);
        } else {
            this.f8065i.mo24076a(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo24554b(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            C4392v d = C4392v.m12671d(str2);
            if (d != null) {
                this.f8062f = d;
                return;
            }
            throw new IllegalArgumentException("Malformed content type: " + str2);
        }
        this.f8061e.mo23817a(str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo24555c(C4388s sVar, C4322b0 b0Var) {
        this.f8064h.mo24142c(sVar, b0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo24556d(C4393w.C4395b bVar) {
        this.f8064h.mo24143d(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo24557e(String str, String str2, boolean z) {
        String str3 = this.f8059c;
        if (str3 != null) {
            this.f8059c = str3.replace("{" + str + "}", m13174h(str2, z));
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo24558f(String str, @Nullable String str2, boolean z) {
        String str3 = this.f8059c;
        if (str3 != null) {
            C4390t.C4391a q = this.f8058b.mo24117q(str3);
            this.f8060d = q;
            if (q != null) {
                this.f8059c = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f8058b + ", Relative: " + this.f8059c);
            }
        }
        if (z) {
            this.f8060d.mo24121a(str, str2);
        } else {
            this.f8060d.mo24122b(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C4318a0 mo24559g() {
        C4390t tVar;
        C4390t.C4391a aVar = this.f8060d;
        if (aVar != null) {
            tVar = aVar.mo24123c();
        } else {
            tVar = this.f8058b.mo24103D(this.f8059c);
            if (tVar == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f8058b + ", Relative: " + this.f8059c);
            }
        }
        C4475a aVar2 = this.f8066j;
        if (aVar2 == null) {
            C4385q.C4386a aVar3 = this.f8065i;
            if (aVar3 != null) {
                aVar2 = aVar3.mo24078c();
            } else {
                C4393w.C4394a aVar4 = this.f8064h;
                if (aVar4 != null) {
                    aVar2 = aVar4.mo24144e();
                } else if (this.f8063g) {
                    aVar2 = C4322b0.m12220e((C4392v) null, new byte[0]);
                }
            }
        }
        C4392v vVar = this.f8062f;
        if (vVar != null) {
            if (aVar2 != null) {
                aVar2 = new C4475a(aVar2, vVar);
            } else {
                this.f8061e.mo23817a("Content-Type", vVar.toString());
            }
        }
        C4318a0.C4319a aVar5 = this.f8061e;
        aVar5.mo23825i(tVar);
        aVar5.mo23822f(this.f8057a, aVar2);
        return aVar5.mo23818b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo24560j(C4322b0 b0Var) {
        this.f8066j = b0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo24561k(Object obj) {
        this.f8059c = obj.toString();
    }
}
