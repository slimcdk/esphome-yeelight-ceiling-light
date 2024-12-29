package okhttp3;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;
import okio.ByteString;
import okio.C9837d;
import p056k5.C3300c;

/* renamed from: okhttp3.w */
public final class C3549w extends C3505a0 {

    /* renamed from: e */
    public static final C3548v f5828e = C3548v.m9871c("multipart/mixed");

    /* renamed from: f */
    public static final C3548v f5829f = C3548v.m9871c("multipart/form-data");

    /* renamed from: g */
    private static final byte[] f5830g = {58, 32};

    /* renamed from: h */
    private static final byte[] f5831h = {ParameterInitDefType.IntVec3Init, 10};

    /* renamed from: i */
    private static final byte[] f5832i = {45, 45};

    /* renamed from: a */
    private final ByteString f5833a;

    /* renamed from: b */
    private final C3548v f5834b;

    /* renamed from: c */
    private final List<C3551b> f5835c;

    /* renamed from: d */
    private long f5836d = -1;

    /* renamed from: okhttp3.w$a */
    public static final class C3550a {

        /* renamed from: a */
        private final ByteString f5837a;

        /* renamed from: b */
        private C3548v f5838b;

        /* renamed from: c */
        private final List<C3551b> f5839c;

        public C3550a() {
            this(UUID.randomUUID().toString());
        }

        public C3550a(String str) {
            this.f5838b = C3549w.f5828e;
            this.f5839c = new ArrayList();
            this.f5837a = ByteString.encodeUtf8(str);
        }

        /* renamed from: a */
        public C3550a mo24599a(@Nullable C3544s sVar, C3505a0 a0Var) {
            return mo24600b(C3551b.m9884a(sVar, a0Var));
        }

        /* renamed from: b */
        public C3550a mo24600b(C3551b bVar) {
            Objects.requireNonNull(bVar, "part == null");
            this.f5839c.add(bVar);
            return this;
        }

        /* renamed from: c */
        public C3549w mo24601c() {
            if (!this.f5839c.isEmpty()) {
                return new C3549w(this.f5837a, this.f5838b, this.f5839c);
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }

        /* renamed from: d */
        public C3550a mo24602d(C3548v vVar) {
            Objects.requireNonNull(vVar, "type == null");
            if (vVar.mo24595e().equals("multipart")) {
                this.f5838b = vVar;
                return this;
            }
            throw new IllegalArgumentException("multipart != " + vVar);
        }
    }

    /* renamed from: okhttp3.w$b */
    public static final class C3551b {
        @Nullable

        /* renamed from: a */
        final C3544s f5840a;

        /* renamed from: b */
        final C3505a0 f5841b;

        private C3551b(@Nullable C3544s sVar, C3505a0 a0Var) {
            this.f5840a = sVar;
            this.f5841b = a0Var;
        }

        /* renamed from: a */
        public static C3551b m9884a(@Nullable C3544s sVar, C3505a0 a0Var) {
            Objects.requireNonNull(a0Var, "body == null");
            if (sVar != null && sVar.mo24544c("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            } else if (sVar == null || sVar.mo24544c("Content-Length") == null) {
                return new C3551b(sVar, a0Var);
            } else {
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
        }
    }

    static {
        C3548v.m9871c("multipart/alternative");
        C3548v.m9871c("multipart/digest");
        C3548v.m9871c("multipart/parallel");
    }

    C3549w(ByteString byteString, C3548v vVar, List<C3551b> list) {
        this.f5833a = byteString;
        this.f5834b = C3548v.m9871c(vVar + "; boundary=" + byteString.utf8());
        this.f5835c = C3300c.m8934s(list);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: okio.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: okio.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: okio.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: okio.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: okio.c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long m9876g(@javax.annotation.Nullable okio.C9837d r13, boolean r14) {
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
            java.util.List<okhttp3.w$b> r1 = r12.f5835c
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r5 = 0
        L_0x0014:
            if (r5 >= r1) goto L_0x00a4
            java.util.List<okhttp3.w$b> r6 = r12.f5835c
            java.lang.Object r6 = r6.get(r5)
            okhttp3.w$b r6 = (okhttp3.C3549w.C3551b) r6
            okhttp3.s r7 = r6.f5840a
            okhttp3.a0 r6 = r6.f5841b
            byte[] r8 = f5832i
            r13.mo24732O0(r8)
            okio.ByteString r8 = r12.f5833a
            r13.mo24733P0(r8)
            byte[] r8 = f5831h
            r13.mo24732O0(r8)
            if (r7 == 0) goto L_0x0058
            int r8 = r7.mo24548h()
            r9 = 0
        L_0x0038:
            if (r9 >= r8) goto L_0x0058
            java.lang.String r10 = r7.mo24545e(r9)
            okio.d r10 = r13.mo24757i0(r10)
            byte[] r11 = f5830g
            okio.d r10 = r10.mo24732O0(r11)
            java.lang.String r11 = r7.mo24550i(r9)
            okio.d r10 = r10.mo24757i0(r11)
            byte[] r11 = f5831h
            r10.mo24732O0(r11)
            int r9 = r9 + 1
            goto L_0x0038
        L_0x0058:
            okhttp3.v r7 = r6.mo24352b()
            if (r7 == 0) goto L_0x0071
            java.lang.String r8 = "Content-Type: "
            okio.d r8 = r13.mo24757i0(r8)
            java.lang.String r7 = r7.toString()
            okio.d r7 = r8.mo24757i0(r7)
            byte[] r8 = f5831h
            r7.mo24732O0(r8)
        L_0x0071:
            long r7 = r6.mo24351a()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x008b
            java.lang.String r9 = "Content-Length: "
            okio.d r9 = r13.mo24757i0(r9)
            okio.d r9 = r9.mo24744c1(r7)
            byte[] r10 = f5831h
            r9.mo24732O0(r10)
            goto L_0x0091
        L_0x008b:
            if (r14 == 0) goto L_0x0091
            r0.clear()
            return r9
        L_0x0091:
            byte[] r9 = f5831h
            r13.mo24732O0(r9)
            if (r14 == 0) goto L_0x009a
            long r3 = r3 + r7
            goto L_0x009d
        L_0x009a:
            r6.mo24353f(r13)
        L_0x009d:
            r13.mo24732O0(r9)
            int r5 = r5 + 1
            goto L_0x0014
        L_0x00a4:
            byte[] r1 = f5832i
            r13.mo24732O0(r1)
            okio.ByteString r2 = r12.f5833a
            r13.mo24733P0(r2)
            r13.mo24732O0(r1)
            byte[] r1 = f5831h
            r13.mo24732O0(r1)
            if (r14 == 0) goto L_0x00c0
            long r13 = r0.mo24758i1()
            long r3 = r3 + r13
            r0.clear()
        L_0x00c0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.C3549w.m9876g(okio.d, boolean):long");
    }

    /* renamed from: a */
    public long mo24351a() {
        long j = this.f5836d;
        if (j != -1) {
            return j;
        }
        long g = m9876g((C9837d) null, true);
        this.f5836d = g;
        return g;
    }

    /* renamed from: b */
    public C3548v mo24352b() {
        return this.f5834b;
    }

    /* renamed from: f */
    public void mo24353f(C9837d dVar) {
        m9876g(dVar, false);
    }
}
