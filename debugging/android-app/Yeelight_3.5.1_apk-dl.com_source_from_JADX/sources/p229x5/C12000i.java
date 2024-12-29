package p229x5;

import androidx.core.location.LocationRequestCompat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import p152e6.C9001b;
import p152e6.C9003c;
import p172i6.C9128e;
import p225w5.C11938b;
import p225w5.C11939c;
import p225w5.C11940d;
import p225w5.C11949j;
import p225w5.C11950k;

/* renamed from: x5.i */
public class C12000i extends C11938b implements C11983a {

    /* renamed from: t */
    private static final C11987e f21954t = new C11986d(0);

    /* renamed from: u */
    private static final ThreadLocal<C12002b> f21955u = new ThreadLocal<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C9003c f21956d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final SSLEngine f21957e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final SSLSession f21958f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C11983a f21959g;

    /* renamed from: h */
    private final C12003c f21960h;

    /* renamed from: i */
    private int f21961i;

    /* renamed from: j */
    private C12002b f21962j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C11987e f21963k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C11987e f21964l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C11987e f21965m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C11939c f21966n;

    /* renamed from: o */
    private boolean f21967o;

    /* renamed from: p */
    private boolean f21968p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f21969q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f21970r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final AtomicBoolean f21971s;

    /* renamed from: x5.i$a */
    static /* synthetic */ class C12001a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21972a;

        /* renamed from: b */
        static final /* synthetic */ int[] f21973b;

        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        static {
            /*
                javax.net.ssl.SSLEngineResult$Status[] r0 = javax.net.ssl.SSLEngineResult.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21973b = r0
                r1 = 1
                javax.net.ssl.SSLEngineResult$Status r2 = javax.net.ssl.SSLEngineResult.Status.BUFFER_UNDERFLOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f21973b     // Catch:{ NoSuchFieldError -> 0x001d }
                javax.net.ssl.SSLEngineResult$Status r3 = javax.net.ssl.SSLEngineResult.Status.BUFFER_OVERFLOW     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f21973b     // Catch:{ NoSuchFieldError -> 0x0028 }
                javax.net.ssl.SSLEngineResult$Status r4 = javax.net.ssl.SSLEngineResult.Status.OK     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f21973b     // Catch:{ NoSuchFieldError -> 0x0033 }
                javax.net.ssl.SSLEngineResult$Status r5 = javax.net.ssl.SSLEngineResult.Status.CLOSED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                javax.net.ssl.SSLEngineResult$HandshakeStatus[] r4 = javax.net.ssl.SSLEngineResult.HandshakeStatus.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f21972a = r4
                javax.net.ssl.SSLEngineResult$HandshakeStatus r5 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f21972a     // Catch:{ NoSuchFieldError -> 0x004e }
                javax.net.ssl.SSLEngineResult$HandshakeStatus r4 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f21972a     // Catch:{ NoSuchFieldError -> 0x0058 }
                javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f21972a     // Catch:{ NoSuchFieldError -> 0x0062 }
                javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f21972a     // Catch:{ NoSuchFieldError -> 0x006d }
                javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_UNWRAP     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p229x5.C12000i.C12001a.<clinit>():void");
        }
    }

    /* renamed from: x5.i$b */
    private static class C12002b {

        /* renamed from: a */
        final C11987e f21974a;

        /* renamed from: b */
        final C11987e f21975b;

        /* renamed from: c */
        final C11987e f21976c;

        C12002b(int i, int i2) {
            this.f21974a = new C11986d(i);
            this.f21975b = new C11986d(i);
            this.f21976c = new C11986d(i2);
        }
    }

    /* renamed from: x5.i$c */
    public class C12003c implements C11939c {
        public C12003c() {
        }

        /* renamed from: A */
        public void mo39649A() {
            C12000i.this.f21966n.mo39649A();
        }

        /* renamed from: b */
        public void mo39651b(C9128e.C9129a aVar, long j) {
            C12000i.this.f21966n.mo39651b(aVar, j);
        }

        /* renamed from: c */
        public void mo39652c() {
            C12000i.this.f21966n.mo39652c();
        }

        public void close() {
            C12000i.this.f21956d.mo36850e("{} ssl endp.close", C12000i.this.f21958f);
            C12000i.this.f21821b.close();
        }

        /* renamed from: d */
        public boolean mo39653d() {
            return C12000i.this.f21971s.getAndSet(false);
        }

        /* renamed from: e */
        public int mo39654e() {
            return C12000i.this.f21966n.mo39654e();
        }

        /* renamed from: f */
        public int mo39655f() {
            return C12000i.this.f21966n.mo39655f();
        }

        public void flush() {
            boolean unused = C12000i.this.m30835E((C11940d) null, (C11940d) null);
        }

        /* renamed from: g */
        public C11949j mo39657g() {
            return C12000i.this.f21959g;
        }

        /* renamed from: h */
        public String mo39658h() {
            return C12000i.this.f21966n.mo39658h();
        }

        /* renamed from: i */
        public void mo39659i(int i) {
            C12000i.this.f21966n.mo39659i(i);
        }

        public boolean isOpen() {
            return C12000i.this.f21821b.isOpen();
        }

        /* renamed from: j */
        public void mo39661j(C11949j jVar) {
            C11983a unused = C12000i.this.f21959g = (C11983a) jVar;
        }

        /* renamed from: k */
        public int mo39662k(C11940d dVar, C11940d dVar2, C11940d dVar3) {
            if (dVar != null && dVar.mo42408J0()) {
                return mo39674x(dVar);
            }
            if (dVar2 != null && dVar2.mo42408J0()) {
                return mo39674x(dVar2);
            }
            if (dVar3 == null || !dVar3.mo42408J0()) {
                return 0;
            }
            return mo39674x(dVar3);
        }

        /* renamed from: l */
        public void mo39663l() {
            C12000i.this.f21956d.mo36850e("{} ssl endp.ishut!", C12000i.this.f21958f);
        }

        /* renamed from: m */
        public String mo39664m() {
            return C12000i.this.f21966n.mo39664m();
        }

        /* renamed from: n */
        public boolean mo39665n(long j) {
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = j > 0 ? j + currentTimeMillis : LocationRequestCompat.PASSIVE_INTERVAL;
            while (currentTimeMillis < j2 && !C12000i.this.m30835E((C11940d) null, (C11940d) null)) {
                C12000i.this.f21821b.mo39665n(j2 - currentTimeMillis);
                currentTimeMillis = System.currentTimeMillis();
            }
            return currentTimeMillis < j2;
        }

        /* renamed from: o */
        public boolean mo39666o() {
            return false;
        }

        /* renamed from: q */
        public String mo39667q() {
            return C12000i.this.f21966n.mo39667q();
        }

        /* renamed from: r */
        public boolean mo39668r() {
            boolean z;
            synchronized (C12000i.this) {
                if (!C12000i.this.f21970r && isOpen()) {
                    if (!C12000i.this.f21957e.isOutboundDone()) {
                        z = false;
                    }
                }
                z = true;
            }
            return z;
        }

        /* renamed from: s */
        public boolean mo39669s() {
            boolean z;
            synchronized (C12000i.this) {
                z = C12000i.this.f21821b.mo39669s() && (C12000i.this.f21964l == null || !C12000i.this.f21964l.mo42408J0()) && (C12000i.this.f21963k == null || !C12000i.this.f21963k.mo42408J0());
            }
            return z;
        }

        /* renamed from: t */
        public void mo39670t() {
            synchronized (C12000i.this) {
                C12000i.this.f21956d.mo36850e("{} ssl endp.oshut {}", C12000i.this.f21958f, this);
                C12000i.this.f21957e.closeOutbound();
                boolean unused = C12000i.this.f21970r = true;
            }
            flush();
        }

        public String toString() {
            C11987e x = C12000i.this.f21963k;
            C11987e p = C12000i.this.f21965m;
            C11987e w = C12000i.this.f21964l;
            int i = -1;
            int length = x == null ? -1 : x.length();
            int length2 = p == null ? -1 : p.length();
            if (w != null) {
                i = w.length();
            }
            return String.format("SSL %s i/o/u=%d/%d/%d ishut=%b oshut=%b {%s}", new Object[]{C12000i.this.f21957e.getHandshakeStatus(), Integer.valueOf(length), Integer.valueOf(length2), Integer.valueOf(i), Boolean.valueOf(C12000i.this.f21969q), Boolean.valueOf(C12000i.this.f21970r), C12000i.this.f21959g});
        }

        /* renamed from: u */
        public boolean mo39672u(long j) {
            return C12000i.this.f21821b.mo39672u(j);
        }

        /* renamed from: v */
        public void mo39673v(C9128e.C9129a aVar) {
            C12000i.this.f21966n.mo39673v(aVar);
        }

        /* renamed from: x */
        public int mo39674x(C11940d dVar) {
            int length = dVar.length();
            boolean unused = C12000i.this.m30835E((C11940d) null, dVar);
            return length - dVar.length();
        }

        /* renamed from: y */
        public int mo39675y() {
            return C12000i.this.f21966n.mo39675y();
        }

        /* renamed from: z */
        public int mo26552z(C11940d dVar) {
            int length = dVar.length();
            boolean unused = C12000i.this.m30835E(dVar, (C11940d) null);
            int length2 = dVar.length() - length;
            if (length2 != 0 || !mo39669s()) {
                return length2;
            }
            return -1;
        }
    }

    public C12000i(SSLEngine sSLEngine, C11950k kVar) {
        this(sSLEngine, kVar, System.currentTimeMillis());
    }

    public C12000i(SSLEngine sSLEngine, C11950k kVar, long j) {
        super(kVar, j);
        this.f21956d = C9001b.m21451b("org.eclipse.jetty.io.nio.ssl");
        this.f21967o = true;
        this.f21971s = new AtomicBoolean();
        this.f21957e = sSLEngine;
        this.f21958f = sSLEngine.getSession();
        this.f21966n = (C11939c) kVar;
        this.f21960h = mo42596D();
    }

    /* renamed from: A */
    private void m30833A() {
        synchronized (this) {
            int i = this.f21961i;
            this.f21961i = i + 1;
            if (i == 0 && this.f21962j == null) {
                ThreadLocal<C12002b> threadLocal = f21955u;
                C12002b bVar = threadLocal.get();
                this.f21962j = bVar;
                if (bVar == null) {
                    this.f21962j = new C12002b(this.f21958f.getPacketBufferSize() * 2, this.f21958f.getApplicationBufferSize() * 2);
                }
                C12002b bVar2 = this.f21962j;
                this.f21963k = bVar2.f21974a;
                this.f21965m = bVar2.f21975b;
                this.f21964l = bVar2.f21976c;
                threadLocal.set((Object) null);
            }
        }
    }

    /* renamed from: B */
    private ByteBuffer m30834B(C11940d dVar) {
        return dVar.mo42406F() instanceof C11987e ? ((C11987e) dVar.mo42406F()).mo42558A0() : ByteBuffer.wrap(dVar.mo42451g0());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x020d, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x011f, code lost:
        if (m30838H(r2) != false) goto L_0x0121;
     */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0199 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0086 A[Catch:{ IOException -> 0x019f }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e0 A[Catch:{ all -> 0x020e }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:138:0x0202=Splitter:B:138:0x0202, B:147:0x0212=Splitter:B:147:0x0212, B:18:0x003f=Splitter:B:18:0x003f} */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean m30835E(p225w5.C11940d r17, p225w5.C11940d r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            monitor-enter(r16)
            r3 = 0
            r4 = 1
            r16.m30833A()     // Catch:{ all -> 0x0211 }
            if (r0 != 0) goto L_0x0016
            x5.e r0 = r1.f21964l     // Catch:{ all -> 0x0211 }
            r0.mo42407H0()     // Catch:{ all -> 0x0211 }
            x5.e r0 = r1.f21964l     // Catch:{ all -> 0x0211 }
            goto L_0x005c
        L_0x0016:
            int r5 = r17.capacity()     // Catch:{ all -> 0x0211 }
            javax.net.ssl.SSLSession r6 = r1.f21958f     // Catch:{ all -> 0x0211 }
            int r6 = r6.getApplicationBufferSize()     // Catch:{ all -> 0x0211 }
            if (r5 >= r6) goto L_0x0044
            r5 = 0
            boolean r2 = r1.m30835E(r5, r2)     // Catch:{ all -> 0x0211 }
            x5.e r5 = r1.f21964l     // Catch:{ all -> 0x0211 }
            if (r5 == 0) goto L_0x003f
            boolean r5 = r5.mo42408J0()     // Catch:{ all -> 0x0211 }
            if (r5 == 0) goto L_0x003f
            x5.e r2 = r1.f21964l     // Catch:{ all -> 0x0211 }
            int r0 = r0.mo42405E0(r2)     // Catch:{ all -> 0x0211 }
            r2.mo42441u0(r0)     // Catch:{ all -> 0x0211 }
            r16.m30836F()     // Catch:{ all -> 0x021d }
            monitor-exit(r16)
            return r4
        L_0x003f:
            r16.m30836F()     // Catch:{ all -> 0x021d }
            monitor-exit(r16)
            return r2
        L_0x0044:
            x5.e r5 = r1.f21964l     // Catch:{ all -> 0x0211 }
            if (r5 == 0) goto L_0x005c
            boolean r5 = r5.mo42408J0()     // Catch:{ all -> 0x0211 }
            if (r5 == 0) goto L_0x005c
            x5.e r2 = r1.f21964l     // Catch:{ all -> 0x0211 }
            int r0 = r0.mo42405E0(r2)     // Catch:{ all -> 0x0211 }
            r2.mo42441u0(r0)     // Catch:{ all -> 0x0211 }
            r16.m30836F()     // Catch:{ all -> 0x021d }
            monitor-exit(r16)
            return r4
        L_0x005c:
            if (r2 != 0) goto L_0x0060
            x5.e r2 = f21954t     // Catch:{ all -> 0x0211 }
        L_0x0060:
            r5 = 1
            r6 = 0
        L_0x0062:
            if (r5 == 0) goto L_0x01eb
            r7 = 7
            r9 = 4
            r10 = 3
            r11 = 2
            x5.e r12 = r1.f21963k     // Catch:{ IOException -> 0x01a4, all -> 0x01a1 }
            int r12 = r12.mo42410M0()     // Catch:{ IOException -> 0x01a4, all -> 0x01a1 }
            if (r12 <= 0) goto L_0x007c
            w5.k r12 = r1.f21821b     // Catch:{ IOException -> 0x01a4, all -> 0x01a1 }
            x5.e r13 = r1.f21963k     // Catch:{ IOException -> 0x01a4, all -> 0x01a1 }
            int r12 = r12.mo26552z(r13)     // Catch:{ IOException -> 0x01a4, all -> 0x01a1 }
            if (r12 <= 0) goto L_0x007d
            r13 = 1
            goto L_0x007e
        L_0x007c:
            r12 = 0
        L_0x007d:
            r13 = 0
        L_0x007e:
            x5.e r14 = r1.f21965m     // Catch:{ IOException -> 0x019f }
            boolean r14 = r14.mo42408J0()     // Catch:{ IOException -> 0x019f }
            if (r14 == 0) goto L_0x0092
            w5.k r14 = r1.f21821b     // Catch:{ IOException -> 0x019f }
            x5.e r15 = r1.f21965m     // Catch:{ IOException -> 0x019f }
            int r14 = r14.mo39674x(r15)     // Catch:{ IOException -> 0x019f }
            if (r14 <= 0) goto L_0x0093
            r13 = 1
            goto L_0x0093
        L_0x0092:
            r14 = 0
        L_0x0093:
            e6.c r15 = r1.f21956d     // Catch:{ all -> 0x020e }
            java.lang.String r5 = "{} {} {} filled={}/{} flushed={}/{}"
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x020e }
            javax.net.ssl.SSLSession r8 = r1.f21958f     // Catch:{ all -> 0x020e }
            r7[r3] = r8     // Catch:{ all -> 0x020e }
            r7[r4] = r1     // Catch:{ all -> 0x020e }
            javax.net.ssl.SSLEngine r8 = r1.f21957e     // Catch:{ all -> 0x020e }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r8 = r8.getHandshakeStatus()     // Catch:{ all -> 0x020e }
            r7[r11] = r8     // Catch:{ all -> 0x020e }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x020e }
            r7[r10] = r8     // Catch:{ all -> 0x020e }
            x5.e r8 = r1.f21963k     // Catch:{ all -> 0x020e }
            int r8 = r8.length()     // Catch:{ all -> 0x020e }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x020e }
            r7[r9] = r8     // Catch:{ all -> 0x020e }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x020e }
            r14 = 5
            r7[r14] = r8     // Catch:{ all -> 0x020e }
            x5.e r8 = r1.f21965m     // Catch:{ all -> 0x020e }
            int r8 = r8.length()     // Catch:{ all -> 0x020e }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x020e }
            r14 = 6
            r7[r14] = r8     // Catch:{ all -> 0x020e }
            r15.mo36850e(r5, r7)     // Catch:{ all -> 0x020e }
            int[] r5 = p229x5.C12000i.C12001a.f21972a     // Catch:{ all -> 0x020e }
            javax.net.ssl.SSLEngine r7 = r1.f21957e     // Catch:{ all -> 0x020e }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r7 = r7.getHandshakeStatus()     // Catch:{ all -> 0x020e }
            int r7 = r7.ordinal()     // Catch:{ all -> 0x020e }
            r5 = r5[r7]     // Catch:{ all -> 0x020e }
            if (r5 == r4) goto L_0x0199
            if (r5 == r11) goto L_0x0132
            if (r5 == r10) goto L_0x0125
            if (r5 == r9) goto L_0x0110
            r7 = 5
            if (r5 == r7) goto L_0x00ea
            goto L_0x0123
        L_0x00ea:
            boolean r5 = r1.f21968p     // Catch:{ all -> 0x020e }
            if (r5 == 0) goto L_0x00f8
            boolean r5 = r1.f21967o     // Catch:{ all -> 0x020e }
            if (r5 != 0) goto L_0x00f8
            w5.k r5 = r1.f21821b     // Catch:{ all -> 0x020e }
        L_0x00f4:
            r5.close()     // Catch:{ all -> 0x020e }
            goto L_0x0123
        L_0x00f8:
            x5.e r5 = r1.f21963k     // Catch:{ all -> 0x020e }
            boolean r5 = r5.mo42408J0()     // Catch:{ all -> 0x020e }
            if (r5 != 0) goto L_0x0109
            r5 = -1
            if (r12 != r5) goto L_0x0109
            w5.k r5 = r1.f21821b     // Catch:{ all -> 0x020e }
            r5.mo39663l()     // Catch:{ all -> 0x020e }
            goto L_0x0123
        L_0x0109:
            boolean r5 = r1.m30837G(r0)     // Catch:{ all -> 0x020e }
            if (r5 == 0) goto L_0x0123
            goto L_0x0121
        L_0x0110:
            boolean r5 = r1.f21968p     // Catch:{ all -> 0x020e }
            if (r5 == 0) goto L_0x011b
            boolean r5 = r1.f21967o     // Catch:{ all -> 0x020e }
            if (r5 != 0) goto L_0x011b
            w5.k r5 = r1.f21821b     // Catch:{ all -> 0x020e }
            goto L_0x00f4
        L_0x011b:
            boolean r5 = r1.m30838H(r2)     // Catch:{ all -> 0x020e }
            if (r5 == 0) goto L_0x0123
        L_0x0121:
            r5 = 1
            goto L_0x015c
        L_0x0123:
            r5 = r13
            goto L_0x015c
        L_0x0125:
            javax.net.ssl.SSLEngine r5 = r1.f21957e     // Catch:{ all -> 0x020e }
            java.lang.Runnable r5 = r5.getDelegatedTask()     // Catch:{ all -> 0x020e }
            if (r5 == 0) goto L_0x0123
            r5.run()     // Catch:{ all -> 0x020e }
            r13 = 1
            goto L_0x0125
        L_0x0132:
            int r5 = r0.mo42410M0()     // Catch:{ all -> 0x020e }
            if (r5 <= 0) goto L_0x0147
            x5.e r5 = r1.f21963k     // Catch:{ all -> 0x020e }
            boolean r5 = r5.mo42408J0()     // Catch:{ all -> 0x020e }
            if (r5 == 0) goto L_0x0147
            boolean r5 = r1.m30837G(r0)     // Catch:{ all -> 0x020e }
            if (r5 == 0) goto L_0x0147
            r13 = 1
        L_0x0147:
            boolean r5 = r2.mo42408J0()     // Catch:{ all -> 0x020e }
            if (r5 == 0) goto L_0x0123
            x5.e r5 = r1.f21965m     // Catch:{ all -> 0x020e }
            int r5 = r5.mo42410M0()     // Catch:{ all -> 0x020e }
            if (r5 <= 0) goto L_0x0123
            boolean r5 = r1.m30838H(r2)     // Catch:{ all -> 0x020e }
            if (r5 == 0) goto L_0x0123
            goto L_0x0121
        L_0x015c:
            w5.k r7 = r1.f21821b     // Catch:{ all -> 0x020e }
            boolean r7 = r7.isOpen()     // Catch:{ all -> 0x020e }
            if (r7 == 0) goto L_0x0179
            w5.k r7 = r1.f21821b     // Catch:{ all -> 0x020e }
            boolean r7 = r7.mo39669s()     // Catch:{ all -> 0x020e }
            if (r7 == 0) goto L_0x0179
            x5.e r7 = r1.f21963k     // Catch:{ all -> 0x020e }
            boolean r7 = r7.mo42408J0()     // Catch:{ all -> 0x020e }
            if (r7 != 0) goto L_0x0179
            javax.net.ssl.SSLEngine r7 = r1.f21957e     // Catch:{ all -> 0x020e }
            r7.closeInbound()     // Catch:{ all -> 0x020e }
        L_0x0179:
            w5.k r7 = r1.f21821b     // Catch:{ all -> 0x020e }
            boolean r7 = r7.isOpen()     // Catch:{ all -> 0x020e }
            if (r7 == 0) goto L_0x0196
            javax.net.ssl.SSLEngine r7 = r1.f21957e     // Catch:{ all -> 0x020e }
            boolean r7 = r7.isOutboundDone()     // Catch:{ all -> 0x020e }
            if (r7 == 0) goto L_0x0196
            x5.e r7 = r1.f21965m     // Catch:{ all -> 0x020e }
            boolean r7 = r7.mo42408J0()     // Catch:{ all -> 0x020e }
            if (r7 != 0) goto L_0x0196
            w5.k r7 = r1.f21821b     // Catch:{ all -> 0x020e }
            r7.mo39670t()     // Catch:{ all -> 0x020e }
        L_0x0196:
            r6 = r6 | r5
            goto L_0x0062
        L_0x0199:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x020e }
            r0.<init>()     // Catch:{ all -> 0x020e }
            throw r0     // Catch:{ all -> 0x020e }
        L_0x019f:
            r0 = move-exception
            goto L_0x01a6
        L_0x01a1:
            r0 = move-exception
            r12 = 0
            goto L_0x01ad
        L_0x01a4:
            r0 = move-exception
            r12 = 0
        L_0x01a6:
            w5.k r2 = r1.f21821b     // Catch:{ all -> 0x01ac }
            r2.close()     // Catch:{ all -> 0x01ac }
            throw r0     // Catch:{ all -> 0x01ac }
        L_0x01ac:
            r0 = move-exception
        L_0x01ad:
            e6.c r2 = r1.f21956d     // Catch:{ all -> 0x020e }
            java.lang.String r5 = "{} {} {} filled={}/{} flushed={}/{}"
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x020e }
            javax.net.ssl.SSLSession r8 = r1.f21958f     // Catch:{ all -> 0x020e }
            r7[r3] = r8     // Catch:{ all -> 0x020e }
            r7[r4] = r1     // Catch:{ all -> 0x020e }
            javax.net.ssl.SSLEngine r8 = r1.f21957e     // Catch:{ all -> 0x020e }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r8 = r8.getHandshakeStatus()     // Catch:{ all -> 0x020e }
            r7[r11] = r8     // Catch:{ all -> 0x020e }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x020e }
            r7[r10] = r8     // Catch:{ all -> 0x020e }
            x5.e r8 = r1.f21963k     // Catch:{ all -> 0x020e }
            int r8 = r8.length()     // Catch:{ all -> 0x020e }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x020e }
            r7[r9] = r8     // Catch:{ all -> 0x020e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x020e }
            r8 = 5
            r7[r8] = r3     // Catch:{ all -> 0x020e }
            x5.e r3 = r1.f21965m     // Catch:{ all -> 0x020e }
            int r3 = r3.length()     // Catch:{ all -> 0x020e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x020e }
            r8 = 6
            r7[r8] = r3     // Catch:{ all -> 0x020e }
            r2.mo36850e(r5, r7)     // Catch:{ all -> 0x020e }
            throw r0     // Catch:{ all -> 0x020e }
        L_0x01eb:
            x5.e r2 = r1.f21964l     // Catch:{ all -> 0x020e }
            if (r0 != r2) goto L_0x0202
            boolean r0 = r2.mo42408J0()     // Catch:{ all -> 0x020e }
            if (r0 == 0) goto L_0x0202
            x5.a r0 = r1.f21959g     // Catch:{ all -> 0x020e }
            boolean r0 = r0.mo39519d()     // Catch:{ all -> 0x020e }
            if (r0 != 0) goto L_0x0202
            w5.c r0 = r1.f21966n     // Catch:{ all -> 0x020e }
            r0.mo39652c()     // Catch:{ all -> 0x020e }
        L_0x0202:
            r16.m30836F()     // Catch:{ all -> 0x021d }
            if (r6 == 0) goto L_0x020c
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f21971s     // Catch:{ all -> 0x021d }
            r0.set(r4)     // Catch:{ all -> 0x021d }
        L_0x020c:
            monitor-exit(r16)
            return r6
        L_0x020e:
            r0 = move-exception
            r3 = r6
            goto L_0x0212
        L_0x0211:
            r0 = move-exception
        L_0x0212:
            r16.m30836F()     // Catch:{ all -> 0x021d }
            if (r3 == 0) goto L_0x021c
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.f21971s     // Catch:{ all -> 0x021d }
            r2.set(r4)     // Catch:{ all -> 0x021d }
        L_0x021c:
            throw r0     // Catch:{ all -> 0x021d }
        L_0x021d:
            r0 = move-exception
            monitor-exit(r16)
            goto L_0x0221
        L_0x0220:
            throw r0
        L_0x0221:
            goto L_0x0220
        */
        throw new UnsupportedOperationException("Method not decompiled: p229x5.C12000i.m30835E(w5.d, w5.d):boolean");
    }

    /* renamed from: F */
    private void m30836F() {
        synchronized (this) {
            int i = this.f21961i - 1;
            this.f21961i = i;
            if (i == 0 && this.f21962j != null && this.f21963k.length() == 0 && this.f21965m.length() == 0 && this.f21964l.length() == 0) {
                this.f21963k = null;
                this.f21965m = null;
                this.f21964l = null;
                f21955u.set(this.f21962j);
                this.f21962j = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0140, code lost:
        return r1;
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m30837G(p225w5.C11940d r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            x5.e r0 = r12.f21963k     // Catch:{ all -> 0x0170 }
            boolean r0 = r0.mo42408J0()     // Catch:{ all -> 0x0170 }
            r1 = 0
            if (r0 != 0) goto L_0x000c
            monitor-exit(r12)
            return r1
        L_0x000c:
            java.nio.ByteBuffer r0 = r12.m30834B(r13)     // Catch:{ all -> 0x0170 }
            monitor-enter(r0)     // Catch:{ all -> 0x0170 }
            x5.e r2 = r12.f21963k     // Catch:{ all -> 0x016d }
            java.nio.ByteBuffer r2 = r2.mo42558A0()     // Catch:{ all -> 0x016d }
            monitor-enter(r2)     // Catch:{ all -> 0x016d }
            int r3 = r13.mo42416U0()     // Catch:{ SSLException -> 0x0143 }
            r0.position(r3)     // Catch:{ SSLException -> 0x0143 }
            int r3 = r13.capacity()     // Catch:{ SSLException -> 0x0143 }
            r0.limit(r3)     // Catch:{ SSLException -> 0x0143 }
            x5.e r3 = r12.f21963k     // Catch:{ SSLException -> 0x0143 }
            int r3 = r3.mo42409L0()     // Catch:{ SSLException -> 0x0143 }
            r2.position(r3)     // Catch:{ SSLException -> 0x0143 }
            x5.e r3 = r12.f21963k     // Catch:{ SSLException -> 0x0143 }
            int r3 = r3.mo42416U0()     // Catch:{ SSLException -> 0x0143 }
            r2.limit(r3)     // Catch:{ SSLException -> 0x0143 }
            javax.net.ssl.SSLEngine r3 = r12.f21957e     // Catch:{ SSLException -> 0x0143 }
            javax.net.ssl.SSLEngineResult r3 = r3.unwrap(r2, r0)     // Catch:{ SSLException -> 0x0143 }
            e6.c r4 = r12.f21956d     // Catch:{ SSLException -> 0x0143 }
            boolean r4 = r4.mo36846a()     // Catch:{ SSLException -> 0x0143 }
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L_0x0078
            e6.c r4 = r12.f21956d     // Catch:{ SSLException -> 0x0143 }
            java.lang.String r9 = "{} unwrap {} {} consumed={} produced={}"
            r10 = 5
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ SSLException -> 0x0143 }
            javax.net.ssl.SSLSession r11 = r12.f21958f     // Catch:{ SSLException -> 0x0143 }
            r10[r1] = r11     // Catch:{ SSLException -> 0x0143 }
            javax.net.ssl.SSLEngineResult$Status r11 = r3.getStatus()     // Catch:{ SSLException -> 0x0143 }
            r10[r8] = r11     // Catch:{ SSLException -> 0x0143 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r11 = r3.getHandshakeStatus()     // Catch:{ SSLException -> 0x0143 }
            r10[r7] = r11     // Catch:{ SSLException -> 0x0143 }
            int r11 = r3.bytesConsumed()     // Catch:{ SSLException -> 0x0143 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ SSLException -> 0x0143 }
            r10[r6] = r11     // Catch:{ SSLException -> 0x0143 }
            int r11 = r3.bytesProduced()     // Catch:{ SSLException -> 0x0143 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ SSLException -> 0x0143 }
            r10[r5] = r11     // Catch:{ SSLException -> 0x0143 }
            r4.mo36850e(r9, r10)     // Catch:{ SSLException -> 0x0143 }
        L_0x0078:
            x5.e r4 = r12.f21963k     // Catch:{ SSLException -> 0x0143 }
            int r9 = r3.bytesConsumed()     // Catch:{ SSLException -> 0x0143 }
            r4.mo42441u0(r9)     // Catch:{ SSLException -> 0x0143 }
            x5.e r4 = r12.f21963k     // Catch:{ SSLException -> 0x0143 }
            r4.mo42407H0()     // Catch:{ SSLException -> 0x0143 }
            int r4 = r13.mo42416U0()     // Catch:{ SSLException -> 0x0143 }
            int r9 = r3.bytesProduced()     // Catch:{ SSLException -> 0x0143 }
            int r4 = r4 + r9
            r13.mo42430h0(r4)     // Catch:{ SSLException -> 0x0143 }
            r2.position(r1)     // Catch:{ all -> 0x016a }
            int r4 = r2.capacity()     // Catch:{ all -> 0x016a }
            r2.limit(r4)     // Catch:{ all -> 0x016a }
            r0.position(r1)     // Catch:{ all -> 0x016a }
            int r4 = r0.capacity()     // Catch:{ all -> 0x016a }
            r0.limit(r4)     // Catch:{ all -> 0x016a }
            monitor-exit(r2)     // Catch:{ all -> 0x016a }
            monitor-exit(r0)     // Catch:{ all -> 0x016d }
            int[] r0 = p229x5.C12000i.C12001a.f21973b     // Catch:{ all -> 0x0170 }
            javax.net.ssl.SSLEngineResult$Status r2 = r3.getStatus()     // Catch:{ all -> 0x0170 }
            int r2 = r2.ordinal()     // Catch:{ all -> 0x0170 }
            r0 = r0[r2]     // Catch:{ all -> 0x0170 }
            if (r0 == r8) goto L_0x0125
            if (r0 == r7) goto L_0x00fb
            if (r0 == r6) goto L_0x00f0
            if (r0 != r5) goto L_0x00d7
            e6.c r13 = r12.f21956d     // Catch:{ all -> 0x0170 }
            java.lang.String r0 = "unwrap CLOSE {} {}"
            java.lang.Object[] r2 = new java.lang.Object[r7]     // Catch:{ all -> 0x0170 }
            r2[r1] = r12     // Catch:{ all -> 0x0170 }
            r2[r8] = r3     // Catch:{ all -> 0x0170 }
            r13.mo36850e(r0, r2)     // Catch:{ all -> 0x0170 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r13 = r3.getHandshakeStatus()     // Catch:{ all -> 0x0170 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED     // Catch:{ all -> 0x0170 }
            if (r13 != r0) goto L_0x0132
            w5.k r13 = r12.f21821b     // Catch:{ all -> 0x0170 }
            r13.close()     // Catch:{ all -> 0x0170 }
            goto L_0x0132
        L_0x00d7:
            e6.c r13 = r12.f21956d     // Catch:{ all -> 0x0170 }
            java.lang.String r0 = "{} wrap default {}"
            java.lang.Object[] r2 = new java.lang.Object[r7]     // Catch:{ all -> 0x0170 }
            javax.net.ssl.SSLSession r4 = r12.f21958f     // Catch:{ all -> 0x0170 }
            r2[r1] = r4     // Catch:{ all -> 0x0170 }
            r2[r8] = r3     // Catch:{ all -> 0x0170 }
            r13.mo36850e(r0, r2)     // Catch:{ all -> 0x0170 }
            java.io.IOException r13 = new java.io.IOException     // Catch:{ all -> 0x0170 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0170 }
            r13.<init>(r0)     // Catch:{ all -> 0x0170 }
            throw r13     // Catch:{ all -> 0x0170 }
        L_0x00f0:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r13 = r3.getHandshakeStatus()     // Catch:{ all -> 0x0170 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED     // Catch:{ all -> 0x0170 }
            if (r13 != r0) goto L_0x0132
            r12.f21968p = r8     // Catch:{ all -> 0x0170 }
            goto L_0x0132
        L_0x00fb:
            e6.c r0 = r12.f21956d     // Catch:{ all -> 0x0170 }
            boolean r0 = r0.mo36846a()     // Catch:{ all -> 0x0170 }
            if (r0 == 0) goto L_0x0132
            e6.c r0 = r12.f21956d     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = "{} unwrap {} {}->{}"
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ all -> 0x0170 }
            javax.net.ssl.SSLSession r5 = r12.f21958f     // Catch:{ all -> 0x0170 }
            r4[r1] = r5     // Catch:{ all -> 0x0170 }
            javax.net.ssl.SSLEngineResult$Status r5 = r3.getStatus()     // Catch:{ all -> 0x0170 }
            r4[r8] = r5     // Catch:{ all -> 0x0170 }
            x5.e r5 = r12.f21963k     // Catch:{ all -> 0x0170 }
            java.lang.String r5 = r5.mo42413P()     // Catch:{ all -> 0x0170 }
            r4[r7] = r5     // Catch:{ all -> 0x0170 }
            java.lang.String r13 = r13.mo42413P()     // Catch:{ all -> 0x0170 }
            r4[r6] = r13     // Catch:{ all -> 0x0170 }
            r0.mo36850e(r2, r4)     // Catch:{ all -> 0x0170 }
            goto L_0x0132
        L_0x0125:
            w5.k r13 = r12.f21821b     // Catch:{ all -> 0x0170 }
            boolean r13 = r13.mo39669s()     // Catch:{ all -> 0x0170 }
            if (r13 == 0) goto L_0x0132
            x5.e r13 = r12.f21963k     // Catch:{ all -> 0x0170 }
            r13.clear()     // Catch:{ all -> 0x0170 }
        L_0x0132:
            int r13 = r3.bytesConsumed()     // Catch:{ all -> 0x0170 }
            if (r13 > 0) goto L_0x013e
            int r13 = r3.bytesProduced()     // Catch:{ all -> 0x0170 }
            if (r13 <= 0) goto L_0x013f
        L_0x013e:
            r1 = 1
        L_0x013f:
            monitor-exit(r12)
            return r1
        L_0x0141:
            r13 = move-exception
            goto L_0x0155
        L_0x0143:
            r13 = move-exception
            e6.c r3 = r12.f21956d     // Catch:{ all -> 0x0141 }
            w5.k r4 = r12.f21821b     // Catch:{ all -> 0x0141 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0141 }
            r3.mo36854h(r4, r13)     // Catch:{ all -> 0x0141 }
            w5.k r3 = r12.f21821b     // Catch:{ all -> 0x0141 }
            r3.close()     // Catch:{ all -> 0x0141 }
            throw r13     // Catch:{ all -> 0x0141 }
        L_0x0155:
            r2.position(r1)     // Catch:{ all -> 0x016a }
            int r3 = r2.capacity()     // Catch:{ all -> 0x016a }
            r2.limit(r3)     // Catch:{ all -> 0x016a }
            r0.position(r1)     // Catch:{ all -> 0x016a }
            int r1 = r0.capacity()     // Catch:{ all -> 0x016a }
            r0.limit(r1)     // Catch:{ all -> 0x016a }
            throw r13     // Catch:{ all -> 0x016a }
        L_0x016a:
            r13 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x016a }
            throw r13     // Catch:{ all -> 0x016d }
        L_0x016d:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x016d }
            throw r13     // Catch:{ all -> 0x0170 }
        L_0x0170:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p229x5.C12000i.m30837G(w5.d):boolean");
    }

    /* renamed from: H */
    private synchronized boolean m30838H(C11940d dVar) {
        boolean z;
        SSLEngineResult wrap;
        ByteBuffer B = m30834B(dVar);
        synchronized (B) {
            this.f21965m.mo42407H0();
            ByteBuffer A0 = this.f21965m.mo42558A0();
            synchronized (A0) {
                z = false;
                try {
                    B.position(dVar.mo42409L0());
                    B.limit(dVar.mo42416U0());
                    A0.position(this.f21965m.mo42416U0());
                    A0.limit(A0.capacity());
                    wrap = this.f21957e.wrap(B, A0);
                    if (this.f21956d.mo36846a()) {
                        this.f21956d.mo36850e("{} wrap {} {} consumed={} produced={}", this.f21958f, wrap.getStatus(), wrap.getHandshakeStatus(), Integer.valueOf(wrap.bytesConsumed()), Integer.valueOf(wrap.bytesProduced()));
                    }
                    dVar.mo42441u0(wrap.bytesConsumed());
                    C11987e eVar = this.f21965m;
                    eVar.mo42430h0(eVar.mo42416U0() + wrap.bytesProduced());
                    A0.position(0);
                    A0.limit(A0.capacity());
                    B.position(0);
                    B.limit(B.capacity());
                } catch (SSLException e) {
                    this.f21956d.mo36854h(String.valueOf(this.f21821b), e);
                    this.f21821b.close();
                    throw e;
                } catch (Throwable th) {
                    A0.position(0);
                    A0.limit(A0.capacity());
                    B.position(0);
                    B.limit(B.capacity());
                    throw th;
                }
            }
        }
        int i = C12001a.f21973b[wrap.getStatus().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        this.f21956d.mo36850e("wrap CLOSE {} {}", this, wrap);
                        if (wrap.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                            this.f21821b.close();
                        }
                    } else {
                        this.f21956d.mo36850e("{} wrap default {}", this.f21958f, wrap);
                        throw new IOException(wrap.toString());
                    }
                } else if (wrap.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                    this.f21968p = true;
                }
            }
            if (wrap.bytesConsumed() > 0 || wrap.bytesProduced() > 0) {
                z = true;
            }
        } else {
            throw new IllegalStateException();
        }
        return z;
    }

    /* renamed from: C */
    public C11939c mo42595C() {
        return this.f21960h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public C12003c mo42596D() {
        return new C12003c();
    }

    /* renamed from: a */
    public boolean mo39518a() {
        return false;
    }

    /* renamed from: c */
    public C11949j mo39556c() {
        try {
            m30833A();
            boolean z = true;
            while (z) {
                z = this.f21957e.getHandshakeStatus() != SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING ? m30835E((C11940d) null, (C11940d) null) : false;
                C11983a aVar = (C11983a) this.f21959g.mo39556c();
                if (!(aVar == this.f21959g || aVar == null)) {
                    this.f21959g = aVar;
                    z = true;
                }
                this.f21956d.mo36850e("{} handle {} progress={}", this.f21958f, this, Boolean.valueOf(z));
            }
            m30836F();
            if (!this.f21969q && this.f21960h.mo39669s() && this.f21960h.isOpen()) {
                this.f21969q = true;
                try {
                    this.f21959g.mo39557e();
                } catch (Throwable th) {
                    this.f21956d.mo36852g("onInputShutdown failed", th);
                    try {
                        this.f21960h.close();
                    } catch (IOException e) {
                        this.f21956d.mo36849d(e);
                    }
                }
            }
            return this;
        } catch (Throwable th2) {
            this.f21956d.mo36852g("onInputShutdown failed", th2);
            try {
                this.f21960h.close();
            } catch (IOException e2) {
                this.f21956d.mo36849d(e2);
            }
        }
        throw th;
    }

    /* renamed from: d */
    public boolean mo39519d() {
        return false;
    }

    /* renamed from: e */
    public void mo39557e() {
    }

    /* renamed from: f */
    public void mo42447f(long j) {
        try {
            this.f21956d.mo36850e("onIdleExpired {}ms on {}", Long.valueOf(j), this);
            if (this.f21821b.mo39668r()) {
                this.f21960h.close();
            } else {
                this.f21960h.mo39670t();
            }
        } catch (IOException e) {
            this.f21956d.mo36856j(e);
            super.mo42447f(j);
        }
    }

    public void onClose() {
        C11949j g = this.f21960h.mo39657g();
        if (g != null && g != this) {
            g.onClose();
        }
    }

    public String toString() {
        return String.format("%s %s", new Object[]{super.toString(), this.f21960h});
    }
}
