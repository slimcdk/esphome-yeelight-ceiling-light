package p173i7;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import com.squareup.okhttp.C4297n;
import com.squareup.okhttp.C4299p;
import com.squareup.okhttp.C4302q;
import com.squareup.okhttp.C4307s;
import com.squareup.okhttp.C4308t;
import com.squareup.okhttp.C4312v;
import com.squareup.okhttp.C4315w;
import okio.C3564c;
import okio.C9837d;

/* renamed from: i7.n */
final class C9157n {

    /* renamed from: k */
    private static final char[] f16933k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    private final String f16934a;

    /* renamed from: b */
    private final C4302q f16935b;

    /* renamed from: c */
    private String f16936c;

    /* renamed from: d */
    private C4302q.C4304b f16937d;

    /* renamed from: e */
    private final C4312v.C4314b f16938e;

    /* renamed from: f */
    private C4307s f16939f;

    /* renamed from: g */
    private final boolean f16940g;

    /* renamed from: h */
    private C4308t f16941h;

    /* renamed from: i */
    private C4297n f16942i;

    /* renamed from: j */
    private C4315w f16943j;

    /* renamed from: i7.n$a */
    private static class C9158a extends C4315w {

        /* renamed from: a */
        private final C4315w f16944a;

        /* renamed from: b */
        private final C4307s f16945b;

        C9158a(C4315w wVar, C4307s sVar) {
            this.f16944a = wVar;
            this.f16945b = sVar;
        }

        /* renamed from: a */
        public long mo27982a() {
            return this.f16944a.mo27982a();
        }

        /* renamed from: b */
        public C4307s mo27983b() {
            return this.f16945b;
        }

        /* renamed from: g */
        public void mo27984g(C9837d dVar) {
            this.f16944a.mo27984g(dVar);
        }
    }

    C9157n(String str, C4302q qVar, String str2, C4299p pVar, C4307s sVar, boolean z, boolean z2, boolean z3) {
        this.f16934a = str;
        this.f16935b = qVar;
        this.f16936c = str2;
        C4312v.C4314b bVar = new C4312v.C4314b();
        this.f16938e = bVar;
        this.f16939f = sVar;
        this.f16940g = z;
        if (pVar != null) {
            bVar.mo28050j(pVar);
        }
        if (z2) {
            this.f16942i = new C4297n();
        } else if (z3) {
            C4308t tVar = new C4308t();
            this.f16941h = tVar;
            tVar.mo27981f(C4308t.f7022f);
        }
    }

    /* renamed from: g */
    static String m22001g(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|/\\?#".indexOf(codePointAt) != -1 || (codePointAt == 37 && !z)) {
                C3564c cVar = new C3564c();
                cVar.mo24792x1(str, 0, i);
                m22002h(cVar, str, i, length, z);
                return cVar.mo24722D();
            }
            i += Character.charCount(codePointAt);
        }
        return str;
    }

    /* renamed from: h */
    static void m22002h(C3564c cVar, String str, int i, int i2, boolean z) {
        C3564c cVar2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|/\\?#".indexOf(codePointAt) != -1 || (codePointAt == 37 && !z)) {
                    if (cVar2 == null) {
                        cVar2 = new C3564c();
                    }
                    cVar2.mo24793y1(codePointAt);
                    while (!cVar2.mo24734Q()) {
                        byte readByte = cVar2.readByte() & 255;
                        cVar.mo24736R(37);
                        char[] cArr = f16933k;
                        cVar.mo24736R(cArr[(readByte >> 4) & 15]);
                        cVar.mo24736R(cArr[readByte & ParameterInitDefType.CubemapSamplerInit]);
                    }
                } else {
                    cVar.mo24793y1(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo37237a(String str, String str2, boolean z) {
        if (z) {
            this.f16942i.mo27924b(str, str2);
        } else {
            this.f16942i.mo27923a(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo37238b(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            this.f16939f = C4307s.m12062c(str2);
        } else {
            this.f16938e.mo28046f(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo37239c(C4299p pVar, C4315w wVar) {
        this.f16941h.mo27979d(pVar, wVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo37240d(String str, String str2, boolean z) {
        String str3 = this.f16936c;
        if (str3 != null) {
            this.f16936c = str3.replace("{" + str + "}", m22001g(str2, z));
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo37241e(String str, String str2, boolean z) {
        String str3 = this.f16936c;
        if (str3 != null) {
            this.f16937d = this.f16935b.mo27947D(str3).mo27961t();
            this.f16936c = null;
        }
        if (z) {
            this.f16937d.mo27963a(str, str2);
        } else {
            this.f16937d.mo27964b(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C4312v mo37242f() {
        C4302q.C4304b bVar = this.f16937d;
        C4302q c = bVar != null ? bVar.mo27965c() : this.f16935b.mo27947D(this.f16936c);
        C9158a aVar = this.f16943j;
        if (aVar == null) {
            C4297n nVar = this.f16942i;
            if (nVar != null) {
                aVar = nVar.mo27925c();
            } else {
                C4308t tVar = this.f16941h;
                if (tVar != null) {
                    aVar = tVar.mo27980e();
                } else if (this.f16940g) {
                    aVar = C4315w.m12159e((C4307s) null, new byte[0]);
                }
            }
        }
        C4307s sVar = this.f16939f;
        if (sVar != null) {
            if (aVar != null) {
                aVar = new C9158a(aVar, sVar);
            } else {
                this.f16938e.mo28046f("Content-Type", sVar.toString());
            }
        }
        return this.f16938e.mo28054n(c).mo28051k(this.f16934a, aVar).mo28047g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo37243i(C4315w wVar) {
        this.f16943j = wVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo37244j(String str) {
        this.f16936c = str;
    }
}
