package p011c.p083d.p084a;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p011c.p083d.p084a.p085d0.C1024k;
import p163g.C4409d;
import p163g.C4411f;

/* renamed from: c.d.a.u */
public final class C1139u {

    /* renamed from: e */
    public static final C1138t f1825e = C1138t.m2782c("multipart/mixed");

    /* renamed from: f */
    public static final C1138t f1826f = C1138t.m2782c("multipart/form-data");
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final byte[] f1827g = {58, 32};
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final byte[] f1828h = {ParameterInitDefType.IntVec3Init, 10};
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final byte[] f1829i = {45, 45};

    /* renamed from: a */
    private final C4411f f1830a;

    /* renamed from: b */
    private C1138t f1831b;

    /* renamed from: c */
    private final List<C1130q> f1832c;

    /* renamed from: d */
    private final List<C1147y> f1833d;

    /* renamed from: c.d.a.u$a */
    private static final class C1140a extends C1147y {

        /* renamed from: a */
        private final C4411f f1834a;

        /* renamed from: b */
        private final C1138t f1835b;

        /* renamed from: c */
        private final List<C1130q> f1836c;

        /* renamed from: d */
        private final List<C1147y> f1837d;

        /* renamed from: e */
        private long f1838e = -1;

        public C1140a(C1138t tVar, C4411f fVar, List<C1130q> list, List<C1147y> list2) {
            if (tVar != null) {
                this.f1834a = fVar;
                this.f1835b = C1138t.m2782c(tVar + "; boundary=" + fVar.mo24303v());
                this.f1836c = C1024k.m2097h(list);
                this.f1837d = C1024k.m2097h(list2);
                return;
            }
            throw new NullPointerException("type == null");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: g.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: g.c} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: g.c} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: g.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: g.c} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private long m2792h(p163g.C4409d r13, boolean r14) {
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
                java.util.List<c.d.a.q> r1 = r12.f1836c
                int r1 = r1.size()
                r2 = 0
                r3 = 0
                r5 = 0
            L_0x0014:
                if (r5 >= r1) goto L_0x00c2
                java.util.List<c.d.a.q> r6 = r12.f1836c
                java.lang.Object r6 = r6.get(r5)
                c.d.a.q r6 = (p011c.p083d.p084a.C1130q) r6
                java.util.List<c.d.a.y> r7 = r12.f1837d
                java.lang.Object r7 = r7.get(r5)
                c.d.a.y r7 = (p011c.p083d.p084a.C1147y) r7
                byte[] r8 = p011c.p083d.p084a.C1139u.f1829i
                r13.mo24210L0(r8)
                g.f r8 = r12.f1834a
                r13.mo24211M0(r8)
                byte[] r8 = p011c.p083d.p084a.C1139u.f1828h
                r13.mo24210L0(r8)
                if (r6 == 0) goto L_0x0064
                int r8 = r6.mo9748g()
                r9 = 0
            L_0x0040:
                if (r9 >= r8) goto L_0x0064
                java.lang.String r10 = r6.mo9746d(r9)
                g.d r10 = r13.mo24232g0(r10)
                byte[] r11 = p011c.p083d.p084a.C1139u.f1827g
                g.d r10 = r10.mo24210L0(r11)
                java.lang.String r11 = r6.mo9749h(r9)
                g.d r10 = r10.mo24232g0(r11)
                byte[] r11 = p011c.p083d.p084a.C1139u.f1828h
                r10.mo24210L0(r11)
                int r9 = r9 + 1
                goto L_0x0040
            L_0x0064:
                c.d.a.t r6 = r7.mo9797b()
                if (r6 == 0) goto L_0x007f
                java.lang.String r8 = "Content-Type: "
                g.d r8 = r13.mo24232g0(r8)
                java.lang.String r6 = r6.toString()
                g.d r6 = r8.mo24232g0(r6)
                byte[] r8 = p011c.p083d.p084a.C1139u.f1828h
                r6.mo24210L0(r8)
            L_0x007f:
                long r6 = r7.mo9796a()
                r8 = -1
                int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r10 == 0) goto L_0x009b
                java.lang.String r8 = "Content-Length: "
                g.d r8 = r13.mo24232g0(r8)
                g.d r8 = r8.mo24220Z0(r6)
                byte[] r9 = p011c.p083d.p084a.C1139u.f1828h
                r8.mo24210L0(r9)
                goto L_0x00a1
            L_0x009b:
                if (r14 == 0) goto L_0x00a1
                r0.clear()
                return r8
            L_0x00a1:
                byte[] r8 = p011c.p083d.p084a.C1139u.f1828h
                r13.mo24210L0(r8)
                if (r14 == 0) goto L_0x00ac
                long r3 = r3 + r6
                goto L_0x00b7
            L_0x00ac:
                java.util.List<c.d.a.y> r6 = r12.f1837d
                java.lang.Object r6 = r6.get(r5)
                c.d.a.y r6 = (p011c.p083d.p084a.C1147y) r6
                r6.mo9798g(r13)
            L_0x00b7:
                byte[] r6 = p011c.p083d.p084a.C1139u.f1828h
                r13.mo24210L0(r6)
                int r5 = r5 + 1
                goto L_0x0014
            L_0x00c2:
                byte[] r1 = p011c.p083d.p084a.C1139u.f1829i
                r13.mo24210L0(r1)
                g.f r1 = r12.f1834a
                r13.mo24211M0(r1)
                byte[] r1 = p011c.p083d.p084a.C1139u.f1829i
                r13.mo24210L0(r1)
                byte[] r1 = p011c.p083d.p084a.C1139u.f1828h
                r13.mo24210L0(r1)
                if (r14 == 0) goto L_0x00e6
                long r13 = r0.mo24233g1()
                long r3 = r3 + r13
                r0.clear()
            L_0x00e6:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p011c.p083d.p084a.C1139u.C1140a.m2792h(g.d, boolean):long");
        }

        /* renamed from: a */
        public long mo9796a() {
            long j = this.f1838e;
            if (j != -1) {
                return j;
            }
            long h = m2792h((C4409d) null, true);
            this.f1838e = h;
            return h;
        }

        /* renamed from: b */
        public C1138t mo9797b() {
            return this.f1835b;
        }

        /* renamed from: g */
        public void mo9798g(C4409d dVar) {
            m2792h(dVar, false);
        }
    }

    static {
        C1138t.m2782c("multipart/alternative");
        C1138t.m2782c("multipart/digest");
        C1138t.m2782c("multipart/parallel");
    }

    public C1139u() {
        this(UUID.randomUUID().toString());
    }

    public C1139u(String str) {
        this.f1831b = f1825e;
        this.f1832c = new ArrayList();
        this.f1833d = new ArrayList();
        this.f1830a = C4411f.m12868h(str);
    }

    /* renamed from: d */
    public C1139u mo9793d(C1130q qVar, C1147y yVar) {
        if (yVar == null) {
            throw new NullPointerException("body == null");
        } else if (qVar != null && qVar.mo9744a("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        } else if (qVar == null || qVar.mo9744a("Content-Length") == null) {
            this.f1832c.add(qVar);
            this.f1833d.add(yVar);
            return this;
        } else {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
    }

    /* renamed from: e */
    public C1147y mo9794e() {
        if (!this.f1832c.isEmpty()) {
            return new C1140a(this.f1831b, this.f1830a, this.f1832c, this.f1833d);
        }
        throw new IllegalStateException("Multipart body must have at least one part.");
    }

    /* renamed from: f */
    public C1139u mo9795f(C1138t tVar) {
        if (tVar == null) {
            throw new NullPointerException("type == null");
        } else if (tVar.mo9789d().equals("multipart")) {
            this.f1831b = tVar;
            return this;
        } else {
            throw new IllegalArgumentException("multipart != " + tVar);
        }
    }
}
