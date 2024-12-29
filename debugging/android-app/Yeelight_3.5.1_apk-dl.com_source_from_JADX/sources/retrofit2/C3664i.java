package retrofit2;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import javax.annotation.Nullable;
import okhttp3.C3505a0;
import okhttp3.C3541q;
import okhttp3.C3544s;
import okhttp3.C3546t;
import okhttp3.C3548v;
import okhttp3.C3549w;
import okhttp3.C3558z;
import okio.C3564c;
import okio.C9837d;

/* renamed from: retrofit2.i */
final class C3664i {

    /* renamed from: k */
    private static final char[] f6116k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    private final String f6117a;

    /* renamed from: b */
    private final C3546t f6118b;
    @Nullable

    /* renamed from: c */
    private String f6119c;
    @Nullable

    /* renamed from: d */
    private C3546t.C3547a f6120d;

    /* renamed from: e */
    private final C3558z.C3559a f6121e;
    @Nullable

    /* renamed from: f */
    private C3548v f6122f;

    /* renamed from: g */
    private final boolean f6123g;
    @Nullable

    /* renamed from: h */
    private C3549w.C3550a f6124h;
    @Nullable

    /* renamed from: i */
    private C3541q.C3542a f6125i;
    @Nullable

    /* renamed from: j */
    private C3505a0 f6126j;

    /* renamed from: retrofit2.i$a */
    private static class C3665a extends C3505a0 {

        /* renamed from: a */
        private final C3505a0 f6127a;

        /* renamed from: b */
        private final C3548v f6128b;

        C3665a(C3505a0 a0Var, C3548v vVar) {
            this.f6127a = a0Var;
            this.f6128b = vVar;
        }

        /* renamed from: a */
        public long mo24351a() {
            return this.f6127a.mo24351a();
        }

        /* renamed from: b */
        public C3548v mo24352b() {
            return this.f6128b;
        }

        /* renamed from: f */
        public void mo24353f(C9837d dVar) {
            this.f6127a.mo24353f(dVar);
        }
    }

    C3664i(String str, C3546t tVar, @Nullable String str2, @Nullable C3544s sVar, @Nullable C3548v vVar, boolean z, boolean z2, boolean z3) {
        this.f6117a = str;
        this.f6118b = tVar;
        this.f6119c = str2;
        C3558z.C3559a aVar = new C3558z.C3559a();
        this.f6121e = aVar;
        this.f6122f = vVar;
        this.f6123g = z;
        if (sVar != null) {
            aVar.mo24665d(sVar);
        }
        if (z2) {
            this.f6125i = new C3541q.C3542a();
        } else if (z3) {
            C3549w.C3550a aVar2 = new C3549w.C3550a();
            this.f6124h = aVar2;
            aVar2.mo24602d(C3549w.f5829f);
        }
    }

    /* renamed from: h */
    private static String m10439h(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                C3564c cVar = new C3564c();
                cVar.mo24792x1(str, 0, i);
                m10440i(cVar, str, i, length, z);
                return cVar.mo24722D();
            }
            i += Character.charCount(codePointAt);
        }
        return str;
    }

    /* renamed from: i */
    private static void m10440i(C3564c cVar, String str, int i, int i2, boolean z) {
        C3564c cVar2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                    if (cVar2 == null) {
                        cVar2 = new C3564c();
                    }
                    cVar2.mo24793y1(codePointAt);
                    while (!cVar2.mo24734Q()) {
                        byte readByte = cVar2.readByte() & 255;
                        cVar.mo24736R(37);
                        char[] cArr = f6116k;
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
    public void mo26031a(String str, String str2, boolean z) {
        if (z) {
            this.f6125i.mo24536b(str, str2);
        } else {
            this.f6125i.mo24535a(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo26032b(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            C3548v d = C3548v.m9872d(str2);
            if (d != null) {
                this.f6122f = d;
                return;
            }
            throw new IllegalArgumentException("Malformed content type: " + str2);
        }
        this.f6121e.mo24662a(str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo26033c(C3544s sVar, C3505a0 a0Var) {
        this.f6124h.mo24599a(sVar, a0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo26034d(C3549w.C3551b bVar) {
        this.f6124h.mo24600b(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo26035e(String str, String str2, boolean z) {
        String str3 = this.f6119c;
        if (str3 != null) {
            this.f6119c = str3.replace("{" + str + "}", m10439h(str2, z));
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo26036f(String str, @Nullable String str2, boolean z) {
        String str3 = this.f6119c;
        if (str3 != null) {
            C3546t.C3547a q = this.f6118b.mo24576q(str3);
            this.f6120d = q;
            if (q != null) {
                this.f6119c = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f6118b + ", Relative: " + this.f6119c);
            }
        }
        if (z) {
            this.f6120d.mo24580a(str, str2);
        } else {
            this.f6120d.mo24581b(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C3558z mo26037g() {
        C3546t tVar;
        C3546t.C3547a aVar = this.f6120d;
        if (aVar != null) {
            tVar = aVar.mo24582c();
        } else {
            tVar = this.f6118b.mo24562D(this.f6119c);
            if (tVar == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f6118b + ", Relative: " + this.f6119c);
            }
        }
        C3665a aVar2 = this.f6126j;
        if (aVar2 == null) {
            C3541q.C3542a aVar3 = this.f6125i;
            if (aVar3 != null) {
                aVar2 = aVar3.mo24537c();
            } else {
                C3549w.C3550a aVar4 = this.f6124h;
                if (aVar4 != null) {
                    aVar2 = aVar4.mo24601c();
                } else if (this.f6123g) {
                    aVar2 = C3505a0.m9571d((C3548v) null, new byte[0]);
                }
            }
        }
        C3548v vVar = this.f6122f;
        if (vVar != null) {
            if (aVar2 != null) {
                aVar2 = new C3665a(aVar2, vVar);
            } else {
                this.f6121e.mo24662a("Content-Type", vVar.toString());
            }
        }
        return this.f6121e.mo24669h(tVar).mo24666e(this.f6117a, aVar2).mo24663b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo26038j(C3505a0 a0Var) {
        this.f6126j = a0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo26039k(Object obj) {
        this.f6119c = obj.toString();
    }
}
