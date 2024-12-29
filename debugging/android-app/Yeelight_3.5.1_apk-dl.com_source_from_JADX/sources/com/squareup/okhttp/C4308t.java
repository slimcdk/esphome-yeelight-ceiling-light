package com.squareup.okhttp;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import okio.ByteString;
import okio.C9837d;
import p231y2.C12033k;

/* renamed from: com.squareup.okhttp.t */
public final class C4308t {

    /* renamed from: e */
    public static final C4307s f7021e = C4307s.m12062c("multipart/mixed");

    /* renamed from: f */
    public static final C4307s f7022f = C4307s.m12062c("multipart/form-data");
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final byte[] f7023g = {58, 32};
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final byte[] f7024h = {ParameterInitDefType.IntVec3Init, 10};
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final byte[] f7025i = {45, 45};

    /* renamed from: a */
    private final ByteString f7026a;

    /* renamed from: b */
    private C4307s f7027b;

    /* renamed from: c */
    private final List<C4299p> f7028c;

    /* renamed from: d */
    private final List<C4315w> f7029d;

    /* renamed from: com.squareup.okhttp.t$a */
    private static final class C4309a extends C4315w {

        /* renamed from: a */
        private final ByteString f7030a;

        /* renamed from: b */
        private final C4307s f7031b;

        /* renamed from: c */
        private final List<C4299p> f7032c;

        /* renamed from: d */
        private final List<C4315w> f7033d;

        /* renamed from: e */
        private long f7034e = -1;

        public C4309a(C4307s sVar, ByteString byteString, List<C4299p> list, List<C4315w> list2) {
            Objects.requireNonNull(sVar, "type == null");
            this.f7030a = byteString;
            this.f7031b = C4307s.m12062c(sVar + "; boundary=" + byteString.utf8());
            this.f7032c = C12033k.m31048h(list);
            this.f7033d = C12033k.m31048h(list2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: okio.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: okio.c} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: okio.c} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: okio.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: okio.c} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private long m12072h(okio.C9837d r13, boolean r14) {
            /*
                r12 = this;
                if (r14 == 0) goto L_0x0009
                okio.c r13 = new okio.c
                r13.<init>()
                r0 = r13
                goto L_0x000a
            L_0x0009:
                r0 = 0
            L_0x000a:
                java.util.List<com.squareup.okhttp.p> r1 = r12.f7032c
                int r1 = r1.size()
                r2 = 0
                r3 = 0
                r5 = 0
            L_0x0014:
                if (r5 >= r1) goto L_0x00c2
                java.util.List<com.squareup.okhttp.p> r6 = r12.f7032c
                java.lang.Object r6 = r6.get(r5)
                com.squareup.okhttp.p r6 = (com.squareup.okhttp.C4299p) r6
                java.util.List<com.squareup.okhttp.w> r7 = r12.f7033d
                java.lang.Object r7 = r7.get(r5)
                com.squareup.okhttp.w r7 = (com.squareup.okhttp.C4315w) r7
                byte[] r8 = com.squareup.okhttp.C4308t.f7025i
                r13.mo24732O0(r8)
                okio.ByteString r8 = r12.f7030a
                r13.mo24733P0(r8)
                byte[] r8 = com.squareup.okhttp.C4308t.f7024h
                r13.mo24732O0(r8)
                if (r6 == 0) goto L_0x0064
                int r8 = r6.mo27935g()
                r9 = 0
            L_0x0040:
                if (r9 >= r8) goto L_0x0064
                java.lang.String r10 = r6.mo27933d(r9)
                okio.d r10 = r13.mo24757i0(r10)
                byte[] r11 = com.squareup.okhttp.C4308t.f7023g
                okio.d r10 = r10.mo24732O0(r11)
                java.lang.String r11 = r6.mo27936h(r9)
                okio.d r10 = r10.mo24757i0(r11)
                byte[] r11 = com.squareup.okhttp.C4308t.f7024h
                r10.mo24732O0(r11)
                int r9 = r9 + 1
                goto L_0x0040
            L_0x0064:
                com.squareup.okhttp.s r6 = r7.mo27983b()
                if (r6 == 0) goto L_0x007f
                java.lang.String r8 = "Content-Type: "
                okio.d r8 = r13.mo24757i0(r8)
                java.lang.String r6 = r6.toString()
                okio.d r6 = r8.mo24757i0(r6)
                byte[] r8 = com.squareup.okhttp.C4308t.f7024h
                r6.mo24732O0(r8)
            L_0x007f:
                long r6 = r7.mo27982a()
                r8 = -1
                int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r10 == 0) goto L_0x009b
                java.lang.String r8 = "Content-Length: "
                okio.d r8 = r13.mo24757i0(r8)
                okio.d r8 = r8.mo24744c1(r6)
                byte[] r9 = com.squareup.okhttp.C4308t.f7024h
                r8.mo24732O0(r9)
                goto L_0x00a1
            L_0x009b:
                if (r14 == 0) goto L_0x00a1
                r0.clear()
                return r8
            L_0x00a1:
                byte[] r8 = com.squareup.okhttp.C4308t.f7024h
                r13.mo24732O0(r8)
                if (r14 == 0) goto L_0x00ac
                long r3 = r3 + r6
                goto L_0x00b7
            L_0x00ac:
                java.util.List<com.squareup.okhttp.w> r6 = r12.f7033d
                java.lang.Object r6 = r6.get(r5)
                com.squareup.okhttp.w r6 = (com.squareup.okhttp.C4315w) r6
                r6.mo27984g(r13)
            L_0x00b7:
                byte[] r6 = com.squareup.okhttp.C4308t.f7024h
                r13.mo24732O0(r6)
                int r5 = r5 + 1
                goto L_0x0014
            L_0x00c2:
                byte[] r1 = com.squareup.okhttp.C4308t.f7025i
                r13.mo24732O0(r1)
                okio.ByteString r1 = r12.f7030a
                r13.mo24733P0(r1)
                byte[] r1 = com.squareup.okhttp.C4308t.f7025i
                r13.mo24732O0(r1)
                byte[] r1 = com.squareup.okhttp.C4308t.f7024h
                r13.mo24732O0(r1)
                if (r14 == 0) goto L_0x00e6
                long r13 = r0.mo24758i1()
                long r3 = r3 + r13
                r0.clear()
            L_0x00e6:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.C4308t.C4309a.m12072h(okio.d, boolean):long");
        }

        /* renamed from: a */
        public long mo27982a() {
            long j = this.f7034e;
            if (j != -1) {
                return j;
            }
            long h = m12072h((C9837d) null, true);
            this.f7034e = h;
            return h;
        }

        /* renamed from: b */
        public C4307s mo27983b() {
            return this.f7031b;
        }

        /* renamed from: g */
        public void mo27984g(C9837d dVar) {
            m12072h(dVar, false);
        }
    }

    static {
        C4307s.m12062c("multipart/alternative");
        C4307s.m12062c("multipart/digest");
        C4307s.m12062c("multipart/parallel");
    }

    public C4308t() {
        this(UUID.randomUUID().toString());
    }

    public C4308t(String str) {
        this.f7027b = f7021e;
        this.f7028c = new ArrayList();
        this.f7029d = new ArrayList();
        this.f7026a = ByteString.encodeUtf8(str);
    }

    /* renamed from: d */
    public C4308t mo27979d(C4299p pVar, C4315w wVar) {
        Objects.requireNonNull(wVar, "body == null");
        if (pVar != null && pVar.mo27931a("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        } else if (pVar == null || pVar.mo27931a("Content-Length") == null) {
            this.f7028c.add(pVar);
            this.f7029d.add(wVar);
            return this;
        } else {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
    }

    /* renamed from: e */
    public C4315w mo27980e() {
        if (!this.f7028c.isEmpty()) {
            return new C4309a(this.f7027b, this.f7026a, this.f7028c, this.f7029d);
        }
        throw new IllegalStateException("Multipart body must have at least one part.");
    }

    /* renamed from: f */
    public C4308t mo27981f(C4307s sVar) {
        Objects.requireNonNull(sVar, "type == null");
        if (sVar.mo27975d().equals("multipart")) {
            this.f7027b = sVar;
            return this;
        }
        throw new IllegalArgumentException("multipart != " + sVar);
    }
}
