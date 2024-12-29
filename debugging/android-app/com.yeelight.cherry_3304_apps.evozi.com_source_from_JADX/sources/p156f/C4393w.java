package p156f;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import p156f.p157g0.C4345c;
import p163g.C4409d;
import p163g.C4411f;

/* renamed from: f.w */
public final class C4393w extends C4322b0 {

    /* renamed from: e */
    public static final C4392v f7855e = C4392v.m12670c("multipart/mixed");

    /* renamed from: f */
    public static final C4392v f7856f = C4392v.m12670c("multipart/form-data");

    /* renamed from: g */
    private static final byte[] f7857g = {58, 32};

    /* renamed from: h */
    private static final byte[] f7858h = {ParameterInitDefType.IntVec3Init, 10};

    /* renamed from: i */
    private static final byte[] f7859i = {45, 45};

    /* renamed from: a */
    private final C4411f f7860a;

    /* renamed from: b */
    private final C4392v f7861b;

    /* renamed from: c */
    private final List<C4395b> f7862c;

    /* renamed from: d */
    private long f7863d = -1;

    /* renamed from: f.w$a */
    public static final class C4394a {

        /* renamed from: a */
        private final C4411f f7864a;

        /* renamed from: b */
        private C4392v f7865b;

        /* renamed from: c */
        private final List<C4395b> f7866c;

        public C4394a() {
            this(UUID.randomUUID().toString());
        }

        public C4394a(String str) {
            this.f7865b = C4393w.f7855e;
            this.f7866c = new ArrayList();
            this.f7864a = C4411f.m12868h(str);
        }

        /* renamed from: a */
        public C4394a mo24140a(String str, String str2) {
            mo24143d(C4395b.m12687b(str, str2));
            return this;
        }

        /* renamed from: b */
        public C4394a mo24141b(String str, @Nullable String str2, C4322b0 b0Var) {
            mo24143d(C4395b.m12688c(str, str2, b0Var));
            return this;
        }

        /* renamed from: c */
        public C4394a mo24142c(@Nullable C4388s sVar, C4322b0 b0Var) {
            mo24143d(C4395b.m12686a(sVar, b0Var));
            return this;
        }

        /* renamed from: d */
        public C4394a mo24143d(C4395b bVar) {
            if (bVar != null) {
                this.f7866c.add(bVar);
                return this;
            }
            throw new NullPointerException("part == null");
        }

        /* renamed from: e */
        public C4393w mo24144e() {
            if (!this.f7866c.isEmpty()) {
                return new C4393w(this.f7864a, this.f7865b, this.f7866c);
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }

        /* renamed from: f */
        public C4394a mo24145f(C4392v vVar) {
            if (vVar == null) {
                throw new NullPointerException("type == null");
            } else if (vVar.mo24136e().equals("multipart")) {
                this.f7865b = vVar;
                return this;
            } else {
                throw new IllegalArgumentException("multipart != " + vVar);
            }
        }
    }

    /* renamed from: f.w$b */
    public static final class C4395b {
        @Nullable

        /* renamed from: a */
        final C4388s f7867a;

        /* renamed from: b */
        final C4322b0 f7868b;

        private C4395b(@Nullable C4388s sVar, C4322b0 b0Var) {
            this.f7867a = sVar;
            this.f7868b = b0Var;
        }

        /* renamed from: a */
        public static C4395b m12686a(@Nullable C4388s sVar, C4322b0 b0Var) {
            if (b0Var == null) {
                throw new NullPointerException("body == null");
            } else if (sVar != null && sVar.mo24085c("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            } else if (sVar == null || sVar.mo24085c("Content-Length") == null) {
                return new C4395b(sVar, b0Var);
            } else {
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
        }

        /* renamed from: b */
        public static C4395b m12687b(String str, String str2) {
            return m12688c(str, (String) null, C4322b0.m12219d((C4392v) null, str2));
        }

        /* renamed from: c */
        public static C4395b m12688c(String str, @Nullable String str2, C4322b0 b0Var) {
            if (str != null) {
                StringBuilder sb = new StringBuilder("form-data; name=");
                C4393w.m12675h(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    C4393w.m12675h(sb, str2);
                }
                return m12686a(C4388s.m12602g("Content-Disposition", sb.toString()), b0Var);
            }
            throw new NullPointerException("name == null");
        }
    }

    static {
        C4392v.m12670c("multipart/alternative");
        C4392v.m12670c("multipart/digest");
        C4392v.m12670c("multipart/parallel");
    }

    C4393w(C4411f fVar, C4392v vVar, List<C4395b> list) {
        this.f7860a = fVar;
        this.f7861b = C4392v.m12670c(vVar + "; boundary=" + fVar.mo24303v());
        this.f7862c = C4345c.m12373t(list);
    }

    /* renamed from: h */
    static StringBuilder m12675h(StringBuilder sb, String str) {
        String str2;
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == 10) {
                str2 = "%0A";
            } else if (charAt == 13) {
                str2 = "%0D";
            } else if (charAt != '\"') {
                sb.append(charAt);
            } else {
                str2 = "%22";
            }
            sb.append(str2);
        }
        sb.append('\"');
        return sb;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: g.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: g.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: g.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: g.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: g.c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long m12676i(@javax.annotation.Nullable p163g.C4409d r13, boolean r14) {
        /*
            r12 = this;
            if (r14 == 0) goto L_0x0009
            g.c r13 = new g.c
            r13.<init>()
            r0 = r13
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.util.List<f.w$b> r1 = r12.f7862c
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r5 = 0
        L_0x0014:
            if (r5 >= r1) goto L_0x00a6
            java.util.List<f.w$b> r6 = r12.f7862c
            java.lang.Object r6 = r6.get(r5)
            f.w$b r6 = (p156f.C4393w.C4395b) r6
            f.s r7 = r6.f7867a
            f.b0 r6 = r6.f7868b
            byte[] r8 = f7859i
            r13.mo24210L0(r8)
            g.f r8 = r12.f7860a
            r13.mo24211M0(r8)
            byte[] r8 = f7858h
            r13.mo24210L0(r8)
            if (r7 == 0) goto L_0x0058
            int r8 = r7.mo24089h()
            r9 = 0
        L_0x0038:
            if (r9 >= r8) goto L_0x0058
            java.lang.String r10 = r7.mo24086e(r9)
            g.d r10 = r13.mo24232g0(r10)
            byte[] r11 = f7857g
            g.d r10 = r10.mo24210L0(r11)
            java.lang.String r11 = r7.mo24091i(r9)
            g.d r10 = r10.mo24232g0(r11)
            byte[] r11 = f7858h
            r10.mo24210L0(r11)
            int r9 = r9 + 1
            goto L_0x0038
        L_0x0058:
            f.v r7 = r6.mo23828b()
            if (r7 == 0) goto L_0x0071
            java.lang.String r8 = "Content-Type: "
            g.d r8 = r13.mo24232g0(r8)
            java.lang.String r7 = r7.toString()
            g.d r7 = r8.mo24232g0(r7)
            byte[] r8 = f7858h
            r7.mo24210L0(r8)
        L_0x0071:
            long r7 = r6.mo23827a()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x008b
            java.lang.String r9 = "Content-Length: "
            g.d r9 = r13.mo24232g0(r9)
            g.d r9 = r9.mo24220Z0(r7)
            byte[] r10 = f7858h
            r9.mo24210L0(r10)
            goto L_0x0091
        L_0x008b:
            if (r14 == 0) goto L_0x0091
            r0.clear()
            return r9
        L_0x0091:
            byte[] r9 = f7858h
            r13.mo24210L0(r9)
            if (r14 == 0) goto L_0x009a
            long r3 = r3 + r7
            goto L_0x009d
        L_0x009a:
            r6.mo23829g(r13)
        L_0x009d:
            byte[] r6 = f7858h
            r13.mo24210L0(r6)
            int r5 = r5 + 1
            goto L_0x0014
        L_0x00a6:
            byte[] r1 = f7859i
            r13.mo24210L0(r1)
            g.f r1 = r12.f7860a
            r13.mo24211M0(r1)
            byte[] r1 = f7859i
            r13.mo24210L0(r1)
            byte[] r1 = f7858h
            r13.mo24210L0(r1)
            if (r14 == 0) goto L_0x00c4
            long r13 = r0.mo24233g1()
            long r3 = r3 + r13
            r0.clear()
        L_0x00c4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p156f.C4393w.m12676i(g.d, boolean):long");
    }

    /* renamed from: a */
    public long mo23827a() {
        long j = this.f7863d;
        if (j != -1) {
            return j;
        }
        long i = m12676i((C4409d) null, true);
        this.f7863d = i;
        return i;
    }

    /* renamed from: b */
    public C4392v mo23828b() {
        return this.f7861b;
    }

    /* renamed from: g */
    public void mo23829g(C4409d dVar) {
        m12676i(dVar, false);
    }
}
