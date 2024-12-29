package p164h.p211a.p212a.p220e.p221o;

import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.mistatistic.sdk.MiStatInterface;
import java.security.SecureRandom;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import p154d.p155b.C10734t;
import p154d.p155b.C10740z;
import p164h.p211a.p212a.p220e.C10975a;
import p164h.p211a.p212a.p222f.C11018d;
import p164h.p211a.p212a.p222f.C11037n;
import p164h.p211a.p212a.p228h.C11107d;
import p164h.p211a.p212a.p228h.p229a0.C11098d;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.e.o.d */
public class C10998d extends C11005f {

    /* renamed from: h */
    private static final C11158c f21489h = C11156b.m29015a(C10998d.class);

    /* renamed from: d */
    SecureRandom f21490d = new SecureRandom();

    /* renamed from: e */
    private long f21491e = MiStatInterface.MIN_UPLOAD_INTERVAL;

    /* renamed from: f */
    private ConcurrentMap<String, C11000b> f21492f = new ConcurrentHashMap();

    /* renamed from: g */
    private Queue<C11000b> f21493g = new ConcurrentLinkedQueue();

    /* renamed from: h.a.a.e.o.d$a */
    private static class C10999a extends C11098d {

        /* renamed from: a */
        String f21494a = "";

        /* renamed from: b */
        String f21495b = "";

        /* renamed from: c */
        String f21496c = "";

        /* renamed from: d */
        String f21497d = "";

        C10999a(String str) {
        }

        public String toString() {
            return this.f21494a + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f21497d;
        }
    }

    /* renamed from: h.a.a.e.o.d$b */
    private static class C11000b {

        /* renamed from: a */
        final String f21498a;

        /* renamed from: b */
        final long f21499b;

        /* renamed from: c */
        AtomicInteger f21500c = new AtomicInteger();

        public C11000b(String str, long j) {
            this.f21498a = str;
            this.f21499b = j;
        }
    }

    /* renamed from: h */
    private int m28031h(C10999a aVar, C11037n nVar) {
        long V;
        int i;
        synchronized (this) {
            V = nVar.mo34950V() - this.f21491e;
        }
        while (true) {
            C11000b peek = this.f21493g.peek();
            if (peek != null && peek.f21499b < V) {
                this.f21493g.remove(peek);
                this.f21492f.remove(peek.f21498a);
            }
        }
        try {
            C11000b bVar = (C11000b) this.f21492f.get(aVar.f21495b);
            if (bVar == null) {
                return 0;
            }
            long parseLong = Long.parseLong(aVar.f21496c, 16);
            if (parseLong > 2147483647L) {
                return 0;
            }
            AtomicInteger atomicInteger = bVar.f21500c;
            while (true) {
                i = atomicInteger.get();
                if (bVar.f21500c.compareAndSet(i, (int) parseLong)) {
                    break;
                }
                atomicInteger = bVar.f21500c;
            }
            return parseLong <= ((long) i) ? -1 : 1;
        } catch (Exception e) {
            f21489h.mo35488d(e);
            return -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e9 A[Catch:{ IOException -> 0x013b }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0138 A[Catch:{ IOException -> 0x013b }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p164h.p211a.p212a.p222f.C11018d mo34712a(p154d.p155b.C10734t r11, p154d.p155b.C10740z r12, boolean r13) {
        /*
            r10 = this;
            if (r13 != 0) goto L_0x0008
            h.a.a.e.o.c r11 = new h.a.a.e.o.c
            r11.<init>(r10)
            return r11
        L_0x0008:
            r13 = r11
            d.b.f0.c r13 = (p154d.p155b.p204f0.C10709c) r13
            d.b.f0.e r12 = (p154d.p155b.p204f0.C10711e) r12
            java.lang.String r0 = "Authorization"
            java.lang.String r0 = r13.mo33926r(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x00e2
            h.a.a.h.y.c r3 = f21489h     // Catch:{ IOException -> 0x013b }
            boolean r3 = r3.mo35485a()     // Catch:{ IOException -> 0x013b }
            if (r3 == 0) goto L_0x0037
            h.a.a.h.y.c r3 = f21489h     // Catch:{ IOException -> 0x013b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x013b }
            r4.<init>()     // Catch:{ IOException -> 0x013b }
            java.lang.String r5 = "Credentials: "
            r4.append(r5)     // Catch:{ IOException -> 0x013b }
            r4.append(r0)     // Catch:{ IOException -> 0x013b }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x013b }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x013b }
            r3.mo35489e(r4, r5)     // Catch:{ IOException -> 0x013b }
        L_0x0037:
            h.a.a.h.o r3 = new h.a.a.h.o     // Catch:{ IOException -> 0x013b }
            java.lang.String r4 = "=, "
            r3.<init>(r0, r4, r1, r2)     // Catch:{ IOException -> 0x013b }
            h.a.a.e.o.d$a r0 = new h.a.a.e.o.d$a     // Catch:{ IOException -> 0x013b }
            java.lang.String r4 = r13.mo33923m()     // Catch:{ IOException -> 0x013b }
            r0.<init>(r4)     // Catch:{ IOException -> 0x013b }
            r4 = 0
            r5 = r4
            r6 = r5
        L_0x004a:
            boolean r7 = r3.hasMoreTokens()     // Catch:{ IOException -> 0x013b }
            if (r7 == 0) goto L_0x00c4
            java.lang.String r7 = r3.nextToken()     // Catch:{ IOException -> 0x013b }
            int r8 = r7.length()     // Catch:{ IOException -> 0x013b }
            if (r8 != r1) goto L_0x005f
            char r8 = r7.charAt(r2)     // Catch:{ IOException -> 0x013b }
            goto L_0x0060
        L_0x005f:
            r8 = 0
        L_0x0060:
            r9 = 32
            if (r8 == r9) goto L_0x004a
            r9 = 44
            if (r8 == r9) goto L_0x00c2
            r9 = 61
            if (r8 == r9) goto L_0x00bf
            if (r6 == 0) goto L_0x00c0
            java.lang.String r5 = "username"
            boolean r5 = r5.equalsIgnoreCase(r6)     // Catch:{ IOException -> 0x013b }
            if (r5 == 0) goto L_0x0079
            r0.f21494a = r7     // Catch:{ IOException -> 0x013b }
            goto L_0x00bd
        L_0x0079:
            java.lang.String r5 = "realm"
            boolean r5 = r5.equalsIgnoreCase(r6)     // Catch:{ IOException -> 0x013b }
            if (r5 == 0) goto L_0x0082
            goto L_0x00bd
        L_0x0082:
            java.lang.String r5 = "nonce"
            boolean r5 = r5.equalsIgnoreCase(r6)     // Catch:{ IOException -> 0x013b }
            if (r5 == 0) goto L_0x008d
            r0.f21495b = r7     // Catch:{ IOException -> 0x013b }
            goto L_0x00bd
        L_0x008d:
            java.lang.String r5 = "nc"
            boolean r5 = r5.equalsIgnoreCase(r6)     // Catch:{ IOException -> 0x013b }
            if (r5 == 0) goto L_0x0098
            r0.f21496c = r7     // Catch:{ IOException -> 0x013b }
            goto L_0x00bd
        L_0x0098:
            java.lang.String r5 = "cnonce"
            boolean r5 = r5.equalsIgnoreCase(r6)     // Catch:{ IOException -> 0x013b }
            if (r5 == 0) goto L_0x00a1
            goto L_0x00bd
        L_0x00a1:
            java.lang.String r5 = "qop"
            boolean r5 = r5.equalsIgnoreCase(r6)     // Catch:{ IOException -> 0x013b }
            if (r5 == 0) goto L_0x00aa
            goto L_0x00bd
        L_0x00aa:
            java.lang.String r5 = "uri"
            boolean r5 = r5.equalsIgnoreCase(r6)     // Catch:{ IOException -> 0x013b }
            if (r5 == 0) goto L_0x00b3
            goto L_0x00bd
        L_0x00b3:
            java.lang.String r5 = "response"
            boolean r5 = r5.equalsIgnoreCase(r6)     // Catch:{ IOException -> 0x013b }
            if (r5 == 0) goto L_0x00bd
            r0.f21497d = r7     // Catch:{ IOException -> 0x013b }
        L_0x00bd:
            r6 = r4
            goto L_0x00c0
        L_0x00bf:
            r6 = r5
        L_0x00c0:
            r5 = r7
            goto L_0x004a
        L_0x00c2:
            r6 = r4
            goto L_0x004a
        L_0x00c4:
            r3 = r13
            h.a.a.f.n r3 = (p164h.p211a.p212a.p222f.C11037n) r3     // Catch:{ IOException -> 0x013b }
            int r3 = r10.m28031h(r0, r3)     // Catch:{ IOException -> 0x013b }
            if (r3 <= 0) goto L_0x00df
            java.lang.String r1 = r0.f21494a     // Catch:{ IOException -> 0x013b }
            h.a.a.f.u r11 = r10.mo34776f(r1, r0, r11)     // Catch:{ IOException -> 0x013b }
            if (r11 == 0) goto L_0x00e2
            h.a.a.e.m r12 = new h.a.a.e.m     // Catch:{ IOException -> 0x013b }
            java.lang.String r13 = r10.mo34714c()     // Catch:{ IOException -> 0x013b }
            r12.<init>(r13, r11)     // Catch:{ IOException -> 0x013b }
            return r12
        L_0x00df:
            if (r3 != 0) goto L_0x00e2
            goto L_0x00e3
        L_0x00e2:
            r1 = 0
        L_0x00e3:
            boolean r11 = p164h.p211a.p212a.p220e.p221o.C10995c.m28014e(r12)     // Catch:{ IOException -> 0x013b }
            if (r11 != 0) goto L_0x0138
            java.lang.String r11 = r13.mo33917e()     // Catch:{ IOException -> 0x013b }
            if (r11 != 0) goto L_0x00f1
            java.lang.String r11 = "/"
        L_0x00f1:
            java.lang.String r0 = "WWW-Authenticate"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x013b }
            r2.<init>()     // Catch:{ IOException -> 0x013b }
            java.lang.String r3 = "Digest realm=\""
            r2.append(r3)     // Catch:{ IOException -> 0x013b }
            h.a.a.e.g r3 = r10.f21508a     // Catch:{ IOException -> 0x013b }
            java.lang.String r3 = r3.getName()     // Catch:{ IOException -> 0x013b }
            r2.append(r3)     // Catch:{ IOException -> 0x013b }
            java.lang.String r3 = "\", domain=\""
            r2.append(r3)     // Catch:{ IOException -> 0x013b }
            r2.append(r11)     // Catch:{ IOException -> 0x013b }
            java.lang.String r11 = "\", nonce=\""
            r2.append(r11)     // Catch:{ IOException -> 0x013b }
            h.a.a.f.n r13 = (p164h.p211a.p212a.p222f.C11037n) r13     // Catch:{ IOException -> 0x013b }
            java.lang.String r11 = r10.mo34774i(r13)     // Catch:{ IOException -> 0x013b }
            r2.append(r11)     // Catch:{ IOException -> 0x013b }
            java.lang.String r11 = "\", algorithm=MD5, qop=\"auth\","
            r2.append(r11)     // Catch:{ IOException -> 0x013b }
            java.lang.String r11 = " stale="
            r2.append(r11)     // Catch:{ IOException -> 0x013b }
            r2.append(r1)     // Catch:{ IOException -> 0x013b }
            java.lang.String r11 = r2.toString()     // Catch:{ IOException -> 0x013b }
            r12.mo33935l(r0, r11)     // Catch:{ IOException -> 0x013b }
            r11 = 401(0x191, float:5.62E-43)
            r12.mo33933e(r11)     // Catch:{ IOException -> 0x013b }
            h.a.a.f.d r11 = p164h.p211a.p212a.p222f.C11018d.f21601E     // Catch:{ IOException -> 0x013b }
            return r11
        L_0x0138:
            h.a.a.f.d r11 = p164h.p211a.p212a.p222f.C11018d.f21599C     // Catch:{ IOException -> 0x013b }
            return r11
        L_0x013b:
            r11 = move-exception
            h.a.a.e.l r12 = new h.a.a.e.l
            r12.<init>((java.lang.Throwable) r11)
            goto L_0x0143
        L_0x0142:
            throw r12
        L_0x0143:
            goto L_0x0142
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p220e.p221o.C10998d.mo34712a(d.b.t, d.b.z, boolean):h.a.a.f.d");
    }

    /* renamed from: b */
    public void mo34713b(C10975a.C10976a aVar) {
        super.mo34713b(aVar);
        String I = aVar.mo34717I("maxNonceAge");
        if (I != null) {
            synchronized (this) {
                this.f21491e = Long.valueOf(I).longValue();
            }
        }
    }

    /* renamed from: c */
    public String mo34714c() {
        return "DIGEST";
    }

    /* renamed from: d */
    public boolean mo34715d(C10734t tVar, C10740z zVar, boolean z, C11018d.C11025g gVar) {
        return true;
    }

    /* renamed from: i */
    public String mo34774i(C11037n nVar) {
        C11000b bVar;
        do {
            byte[] bArr = new byte[24];
            this.f21490d.nextBytes(bArr);
            bVar = new C11000b(new String(C11107d.m28798d(bArr)), nVar.mo34950V());
        } while (this.f21492f.putIfAbsent(bVar.f21498a, bVar) != null);
        this.f21493g.add(bVar);
        return bVar.f21498a;
    }
}
