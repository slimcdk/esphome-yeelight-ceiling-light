package p164h.p211a.p212a.p217d.p219v;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import p164h.p211a.p212a.p217d.C10927c;
import p164h.p211a.p212a.p217d.C10928d;
import p164h.p211a.p212a.p217d.C10929e;
import p164h.p211a.p212a.p217d.C10941m;
import p164h.p211a.p212a.p217d.C10942n;
import p164h.p211a.p212a.p228h.p232d0.C11115e;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.d.v.i */
public class C10971i extends C10927c implements C10954a {

    /* renamed from: t */
    private static final C10958e f21422t = new C10957d(0);

    /* renamed from: u */
    private static final ThreadLocal<C10973b> f21423u = new ThreadLocal<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C11158c f21424d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final SSLEngine f21425e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final SSLSession f21426f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C10954a f21427g;

    /* renamed from: h */
    private final C10974c f21428h;

    /* renamed from: i */
    private int f21429i;

    /* renamed from: j */
    private C10973b f21430j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C10958e f21431k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C10958e f21432l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C10958e f21433m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C10928d f21434n;

    /* renamed from: o */
    private boolean f21435o;

    /* renamed from: p */
    private boolean f21436p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f21437q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f21438r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final AtomicBoolean f21439s;

    /* renamed from: h.a.a.d.v.i$a */
    static /* synthetic */ class C10972a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21440a;

        /* renamed from: b */
        static final /* synthetic */ int[] f21441b;

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
                f21441b = r0
                r1 = 1
                javax.net.ssl.SSLEngineResult$Status r2 = javax.net.ssl.SSLEngineResult.Status.BUFFER_UNDERFLOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f21441b     // Catch:{ NoSuchFieldError -> 0x001d }
                javax.net.ssl.SSLEngineResult$Status r3 = javax.net.ssl.SSLEngineResult.Status.BUFFER_OVERFLOW     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f21441b     // Catch:{ NoSuchFieldError -> 0x0028 }
                javax.net.ssl.SSLEngineResult$Status r4 = javax.net.ssl.SSLEngineResult.Status.OK     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f21441b     // Catch:{ NoSuchFieldError -> 0x0033 }
                javax.net.ssl.SSLEngineResult$Status r5 = javax.net.ssl.SSLEngineResult.Status.CLOSED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                javax.net.ssl.SSLEngineResult$HandshakeStatus[] r4 = javax.net.ssl.SSLEngineResult.HandshakeStatus.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f21440a = r4
                javax.net.ssl.SSLEngineResult$HandshakeStatus r5 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f21440a     // Catch:{ NoSuchFieldError -> 0x004e }
                javax.net.ssl.SSLEngineResult$HandshakeStatus r4 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f21440a     // Catch:{ NoSuchFieldError -> 0x0058 }
                javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f21440a     // Catch:{ NoSuchFieldError -> 0x0062 }
                javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f21440a     // Catch:{ NoSuchFieldError -> 0x006d }
                javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_UNWRAP     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p217d.p219v.C10971i.C10972a.<clinit>():void");
        }
    }

    /* renamed from: h.a.a.d.v.i$b */
    private static class C10973b {

        /* renamed from: a */
        final C10958e f21442a;

        /* renamed from: b */
        final C10958e f21443b;

        /* renamed from: c */
        final C10958e f21444c;

        C10973b(int i, int i2) {
            this.f21442a = new C10957d(i);
            this.f21443b = new C10957d(i);
            this.f21444c = new C10957d(i2);
        }
    }

    /* renamed from: h.a.a.d.v.i$c */
    public class C10974c implements C10928d {
        public C10974c() {
        }

        /* renamed from: b */
        public void mo34349b(C11115e.C11116a aVar, long j) {
            C10971i.this.f21434n.mo34349b(aVar, j);
        }

        /* renamed from: c */
        public void mo34350c() {
            C10971i.this.f21434n.mo34350c();
        }

        public void close() {
            C10971i.this.f21424d.mo35489e("{} ssl endp.close", C10971i.this.f21426f);
            C10971i.this.f21308b.close();
        }

        /* renamed from: d */
        public boolean mo34352d() {
            return C10971i.this.f21439s.getAndSet(false);
        }

        /* renamed from: e */
        public void mo34353e(C11115e.C11116a aVar) {
            C10971i.this.f21434n.mo34353e(aVar);
        }

        /* renamed from: f */
        public int mo34354f() {
            return C10971i.this.f21434n.mo34354f();
        }

        public void flush() {
            boolean unused = C10971i.this.m27874E((C10929e) null, (C10929e) null);
        }

        /* renamed from: g */
        public int mo34356g() {
            return C10971i.this.f21434n.mo34356g();
        }

        /* renamed from: h */
        public C10941m mo34357h() {
            return C10971i.this.f21427g;
        }

        /* renamed from: i */
        public String mo34358i() {
            return C10971i.this.f21434n.mo34358i();
        }

        public boolean isOpen() {
            return C10971i.this.f21308b.isOpen();
        }

        /* renamed from: j */
        public void mo34360j(int i) {
            C10971i.this.f21434n.mo34360j(i);
        }

        /* renamed from: k */
        public void mo34361k(C10941m mVar) {
            C10954a unused = C10971i.this.f21427g = (C10954a) mVar;
        }

        /* renamed from: l */
        public void mo34362l() {
            C10971i.this.f21424d.mo35489e("{} ssl endp.ishut!", C10971i.this.f21426f);
        }

        /* renamed from: m */
        public String mo34363m() {
            return C10971i.this.f21434n.mo34363m();
        }

        /* renamed from: n */
        public boolean mo34364n(long j) {
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = j > 0 ? j + currentTimeMillis : Long.MAX_VALUE;
            while (currentTimeMillis < j2 && !C10971i.this.m27874E((C10929e) null, (C10929e) null)) {
                C10971i.this.f21308b.mo34364n(j2 - currentTimeMillis);
                currentTimeMillis = System.currentTimeMillis();
            }
            return currentTimeMillis < j2;
        }

        /* renamed from: o */
        public boolean mo34365o() {
            return false;
        }

        /* renamed from: p */
        public int mo34366p(C10929e eVar, C10929e eVar2, C10929e eVar3) {
            if (eVar != null && eVar.mo34556F0()) {
                return mo34372u(eVar);
            }
            if (eVar2 != null && eVar2.mo34556F0()) {
                return mo34372u(eVar2);
            }
            if (eVar3 == null || !eVar3.mo34556F0()) {
                return 0;
            }
            return mo34372u(eVar3);
        }

        /* renamed from: q */
        public String mo34367q() {
            return C10971i.this.f21434n.mo34367q();
        }

        /* renamed from: r */
        public boolean mo34368r() {
            boolean z;
            synchronized (C10971i.this) {
                if (!C10971i.this.f21438r && isOpen()) {
                    if (!C10971i.this.f21425e.isOutboundDone()) {
                        z = false;
                    }
                }
                z = true;
            }
            return z;
        }

        /* renamed from: s */
        public boolean mo34369s() {
            boolean z;
            synchronized (C10971i.this) {
                z = C10971i.this.f21308b.mo34369s() && (C10971i.this.f21432l == null || !C10971i.this.f21432l.mo34556F0()) && (C10971i.this.f21431k == null || !C10971i.this.f21431k.mo34556F0());
            }
            return z;
        }

        /* renamed from: t */
        public void mo34370t() {
            synchronized (C10971i.this) {
                C10971i.this.f21424d.mo35489e("{} ssl endp.oshut {}", C10971i.this.f21426f, this);
                C10971i.this.f21425e.closeOutbound();
                boolean unused = C10971i.this.f21438r = true;
            }
            flush();
        }

        public String toString() {
            C10958e x = C10971i.this.f21431k;
            C10958e p = C10971i.this.f21433m;
            C10958e w = C10971i.this.f21432l;
            int i = -1;
            int length = x == null ? -1 : x.length();
            int length2 = p == null ? -1 : p.length();
            if (w != null) {
                i = w.length();
            }
            return String.format("SSL %s i/o/u=%d/%d/%d ishut=%b oshut=%b {%s}", new Object[]{C10971i.this.f21425e.getHandshakeStatus(), Integer.valueOf(length), Integer.valueOf(length2), Integer.valueOf(i), Boolean.valueOf(C10971i.this.f21437q), Boolean.valueOf(C10971i.this.f21438r), C10971i.this.f21427g});
        }

        /* renamed from: u */
        public int mo34372u(C10929e eVar) {
            int length = eVar.length();
            boolean unused = C10971i.this.m27874E((C10929e) null, eVar);
            return length - eVar.length();
        }

        /* renamed from: v */
        public boolean mo34373v(long j) {
            return C10971i.this.f21308b.mo34373v(j);
        }

        /* renamed from: w */
        public int mo34374w(C10929e eVar) {
            int length = eVar.length();
            boolean unused = C10971i.this.m27874E(eVar, (C10929e) null);
            int length2 = eVar.length() - length;
            if (length2 != 0 || !mo34369s()) {
                return length2;
            }
            return -1;
        }

        /* renamed from: x */
        public int mo34375x() {
            return C10971i.this.f21434n.mo34375x();
        }

        /* renamed from: y */
        public void mo34376y() {
            C10971i.this.f21434n.mo34376y();
        }
    }

    public C10971i(SSLEngine sSLEngine, C10942n nVar) {
        this(sSLEngine, nVar, System.currentTimeMillis());
    }

    public C10971i(SSLEngine sSLEngine, C10942n nVar, long j) {
        super(nVar, j);
        this.f21424d = C11156b.m29016b("org.eclipse.jetty.io.nio.ssl");
        this.f21435o = true;
        this.f21439s = new AtomicBoolean();
        this.f21425e = sSLEngine;
        this.f21426f = sSLEngine.getSession();
        this.f21434n = (C10928d) nVar;
        this.f21428h = mo34710D();
    }

    /* renamed from: A */
    private void m27872A() {
        synchronized (this) {
            int i = this.f21429i;
            this.f21429i = i + 1;
            if (i == 0 && this.f21430j == null) {
                C10973b bVar = f21423u.get();
                this.f21430j = bVar;
                if (bVar == null) {
                    this.f21430j = new C10973b(this.f21426f.getPacketBufferSize() * 2, this.f21426f.getApplicationBufferSize() * 2);
                }
                this.f21431k = this.f21430j.f21442a;
                this.f21433m = this.f21430j.f21443b;
                this.f21432l = this.f21430j.f21444c;
                f21423u.set((Object) null);
            }
        }
    }

    /* renamed from: B */
    private ByteBuffer m27873B(C10929e eVar) {
        return eVar.mo34557H() instanceof C10958e ? ((C10958e) eVar.mo34557H()).mo34672z0() : ByteBuffer.wrap(eVar.mo34608e0());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0217, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0127, code lost:
        if (m27877H(r2) != false) goto L_0x0129;
     */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x01a1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008e A[Catch:{ IOException -> 0x01a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e8 A[Catch:{ all -> 0x0218 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0043=Splitter:B:18:0x0043, B:138:0x020c=Splitter:B:138:0x020c, B:147:0x021c=Splitter:B:147:0x021c} */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean m27874E(p164h.p211a.p212a.p217d.C10929e r17, p164h.p211a.p212a.p217d.C10929e r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            monitor-enter(r16)
            r3 = 0
            r4 = 1
            r16.m27872A()     // Catch:{ all -> 0x021b }
            if (r0 != 0) goto L_0x0016
            h.a.a.d.v.e r0 = r1.f21432l     // Catch:{ all -> 0x021b }
            r0.mo34555D0()     // Catch:{ all -> 0x021b }
            h.a.a.d.v.e r0 = r1.f21432l     // Catch:{ all -> 0x021b }
            goto L_0x0064
        L_0x0016:
            int r5 = r17.capacity()     // Catch:{ all -> 0x021b }
            javax.net.ssl.SSLSession r6 = r1.f21426f     // Catch:{ all -> 0x021b }
            int r6 = r6.getApplicationBufferSize()     // Catch:{ all -> 0x021b }
            if (r5 >= r6) goto L_0x0048
            r5 = 0
            boolean r2 = r1.m27874E(r5, r2)     // Catch:{ all -> 0x021b }
            h.a.a.d.v.e r5 = r1.f21432l     // Catch:{ all -> 0x021b }
            if (r5 == 0) goto L_0x0043
            h.a.a.d.v.e r5 = r1.f21432l     // Catch:{ all -> 0x021b }
            boolean r5 = r5.mo34556F0()     // Catch:{ all -> 0x021b }
            if (r5 == 0) goto L_0x0043
            h.a.a.d.v.e r2 = r1.f21432l     // Catch:{ all -> 0x021b }
            h.a.a.d.v.e r5 = r1.f21432l     // Catch:{ all -> 0x021b }
            int r0 = r0.mo34567Z(r5)     // Catch:{ all -> 0x021b }
            r2.mo34591u0(r0)     // Catch:{ all -> 0x021b }
            r16.m27875F()     // Catch:{ all -> 0x0227 }
            monitor-exit(r16)
            return r4
        L_0x0043:
            r16.m27875F()     // Catch:{ all -> 0x0227 }
            monitor-exit(r16)
            return r2
        L_0x0048:
            h.a.a.d.v.e r5 = r1.f21432l     // Catch:{ all -> 0x021b }
            if (r5 == 0) goto L_0x0064
            h.a.a.d.v.e r5 = r1.f21432l     // Catch:{ all -> 0x021b }
            boolean r5 = r5.mo34556F0()     // Catch:{ all -> 0x021b }
            if (r5 == 0) goto L_0x0064
            h.a.a.d.v.e r2 = r1.f21432l     // Catch:{ all -> 0x021b }
            h.a.a.d.v.e r5 = r1.f21432l     // Catch:{ all -> 0x021b }
            int r0 = r0.mo34567Z(r5)     // Catch:{ all -> 0x021b }
            r2.mo34591u0(r0)     // Catch:{ all -> 0x021b }
            r16.m27875F()     // Catch:{ all -> 0x0227 }
            monitor-exit(r16)
            return r4
        L_0x0064:
            if (r2 != 0) goto L_0x0068
            h.a.a.d.v.e r2 = f21422t     // Catch:{ all -> 0x021b }
        L_0x0068:
            r5 = 1
            r6 = 0
        L_0x006a:
            if (r5 == 0) goto L_0x01f3
            r7 = 7
            r9 = 4
            r10 = 3
            r11 = 2
            h.a.a.d.v.e r12 = r1.f21431k     // Catch:{ IOException -> 0x01ac, all -> 0x01a9 }
            int r12 = r12.mo34558I0()     // Catch:{ IOException -> 0x01ac, all -> 0x01a9 }
            if (r12 <= 0) goto L_0x0084
            h.a.a.d.n r12 = r1.f21308b     // Catch:{ IOException -> 0x01ac, all -> 0x01a9 }
            h.a.a.d.v.e r13 = r1.f21431k     // Catch:{ IOException -> 0x01ac, all -> 0x01a9 }
            int r12 = r12.mo34374w(r13)     // Catch:{ IOException -> 0x01ac, all -> 0x01a9 }
            if (r12 <= 0) goto L_0x0085
            r13 = 1
            goto L_0x0086
        L_0x0084:
            r12 = 0
        L_0x0085:
            r13 = 0
        L_0x0086:
            h.a.a.d.v.e r14 = r1.f21433m     // Catch:{ IOException -> 0x01a7 }
            boolean r14 = r14.mo34556F0()     // Catch:{ IOException -> 0x01a7 }
            if (r14 == 0) goto L_0x009a
            h.a.a.d.n r14 = r1.f21308b     // Catch:{ IOException -> 0x01a7 }
            h.a.a.d.v.e r15 = r1.f21433m     // Catch:{ IOException -> 0x01a7 }
            int r14 = r14.mo34372u(r15)     // Catch:{ IOException -> 0x01a7 }
            if (r14 <= 0) goto L_0x009b
            r13 = 1
            goto L_0x009b
        L_0x009a:
            r14 = 0
        L_0x009b:
            h.a.a.h.y.c r15 = r1.f21424d     // Catch:{ all -> 0x0218 }
            java.lang.String r5 = "{} {} {} filled={}/{} flushed={}/{}"
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0218 }
            javax.net.ssl.SSLSession r8 = r1.f21426f     // Catch:{ all -> 0x0218 }
            r7[r3] = r8     // Catch:{ all -> 0x0218 }
            r7[r4] = r1     // Catch:{ all -> 0x0218 }
            javax.net.ssl.SSLEngine r8 = r1.f21425e     // Catch:{ all -> 0x0218 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r8 = r8.getHandshakeStatus()     // Catch:{ all -> 0x0218 }
            r7[r11] = r8     // Catch:{ all -> 0x0218 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0218 }
            r7[r10] = r8     // Catch:{ all -> 0x0218 }
            h.a.a.d.v.e r8 = r1.f21431k     // Catch:{ all -> 0x0218 }
            int r8 = r8.length()     // Catch:{ all -> 0x0218 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0218 }
            r7[r9] = r8     // Catch:{ all -> 0x0218 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x0218 }
            r14 = 5
            r7[r14] = r8     // Catch:{ all -> 0x0218 }
            h.a.a.d.v.e r8 = r1.f21433m     // Catch:{ all -> 0x0218 }
            int r8 = r8.length()     // Catch:{ all -> 0x0218 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0218 }
            r14 = 6
            r7[r14] = r8     // Catch:{ all -> 0x0218 }
            r15.mo35489e(r5, r7)     // Catch:{ all -> 0x0218 }
            int[] r5 = p164h.p211a.p212a.p217d.p219v.C10971i.C10972a.f21440a     // Catch:{ all -> 0x0218 }
            javax.net.ssl.SSLEngine r7 = r1.f21425e     // Catch:{ all -> 0x0218 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r7 = r7.getHandshakeStatus()     // Catch:{ all -> 0x0218 }
            int r7 = r7.ordinal()     // Catch:{ all -> 0x0218 }
            r5 = r5[r7]     // Catch:{ all -> 0x0218 }
            if (r5 == r4) goto L_0x01a1
            if (r5 == r11) goto L_0x013a
            if (r5 == r10) goto L_0x012d
            if (r5 == r9) goto L_0x0118
            r7 = 5
            if (r5 == r7) goto L_0x00f2
            goto L_0x012b
        L_0x00f2:
            boolean r5 = r1.f21436p     // Catch:{ all -> 0x0218 }
            if (r5 == 0) goto L_0x0100
            boolean r5 = r1.f21435o     // Catch:{ all -> 0x0218 }
            if (r5 != 0) goto L_0x0100
            h.a.a.d.n r5 = r1.f21308b     // Catch:{ all -> 0x0218 }
        L_0x00fc:
            r5.close()     // Catch:{ all -> 0x0218 }
            goto L_0x012b
        L_0x0100:
            h.a.a.d.v.e r5 = r1.f21431k     // Catch:{ all -> 0x0218 }
            boolean r5 = r5.mo34556F0()     // Catch:{ all -> 0x0218 }
            if (r5 != 0) goto L_0x0111
            r5 = -1
            if (r12 != r5) goto L_0x0111
            h.a.a.d.n r5 = r1.f21308b     // Catch:{ all -> 0x0218 }
            r5.mo34362l()     // Catch:{ all -> 0x0218 }
            goto L_0x012b
        L_0x0111:
            boolean r5 = r1.m27876G(r0)     // Catch:{ all -> 0x0218 }
            if (r5 == 0) goto L_0x012b
            goto L_0x0129
        L_0x0118:
            boolean r5 = r1.f21436p     // Catch:{ all -> 0x0218 }
            if (r5 == 0) goto L_0x0123
            boolean r5 = r1.f21435o     // Catch:{ all -> 0x0218 }
            if (r5 != 0) goto L_0x0123
            h.a.a.d.n r5 = r1.f21308b     // Catch:{ all -> 0x0218 }
            goto L_0x00fc
        L_0x0123:
            boolean r5 = r1.m27877H(r2)     // Catch:{ all -> 0x0218 }
            if (r5 == 0) goto L_0x012b
        L_0x0129:
            r5 = 1
            goto L_0x0164
        L_0x012b:
            r5 = r13
            goto L_0x0164
        L_0x012d:
            javax.net.ssl.SSLEngine r5 = r1.f21425e     // Catch:{ all -> 0x0218 }
            java.lang.Runnable r5 = r5.getDelegatedTask()     // Catch:{ all -> 0x0218 }
            if (r5 == 0) goto L_0x012b
            r5.run()     // Catch:{ all -> 0x0218 }
            r13 = 1
            goto L_0x012d
        L_0x013a:
            int r5 = r0.mo34558I0()     // Catch:{ all -> 0x0218 }
            if (r5 <= 0) goto L_0x014f
            h.a.a.d.v.e r5 = r1.f21431k     // Catch:{ all -> 0x0218 }
            boolean r5 = r5.mo34556F0()     // Catch:{ all -> 0x0218 }
            if (r5 == 0) goto L_0x014f
            boolean r5 = r1.m27876G(r0)     // Catch:{ all -> 0x0218 }
            if (r5 == 0) goto L_0x014f
            r13 = 1
        L_0x014f:
            boolean r5 = r2.mo34556F0()     // Catch:{ all -> 0x0218 }
            if (r5 == 0) goto L_0x012b
            h.a.a.d.v.e r5 = r1.f21433m     // Catch:{ all -> 0x0218 }
            int r5 = r5.mo34558I0()     // Catch:{ all -> 0x0218 }
            if (r5 <= 0) goto L_0x012b
            boolean r5 = r1.m27877H(r2)     // Catch:{ all -> 0x0218 }
            if (r5 == 0) goto L_0x012b
            goto L_0x0129
        L_0x0164:
            h.a.a.d.n r7 = r1.f21308b     // Catch:{ all -> 0x0218 }
            boolean r7 = r7.isOpen()     // Catch:{ all -> 0x0218 }
            if (r7 == 0) goto L_0x0181
            h.a.a.d.n r7 = r1.f21308b     // Catch:{ all -> 0x0218 }
            boolean r7 = r7.mo34369s()     // Catch:{ all -> 0x0218 }
            if (r7 == 0) goto L_0x0181
            h.a.a.d.v.e r7 = r1.f21431k     // Catch:{ all -> 0x0218 }
            boolean r7 = r7.mo34556F0()     // Catch:{ all -> 0x0218 }
            if (r7 != 0) goto L_0x0181
            javax.net.ssl.SSLEngine r7 = r1.f21425e     // Catch:{ all -> 0x0218 }
            r7.closeInbound()     // Catch:{ all -> 0x0218 }
        L_0x0181:
            h.a.a.d.n r7 = r1.f21308b     // Catch:{ all -> 0x0218 }
            boolean r7 = r7.isOpen()     // Catch:{ all -> 0x0218 }
            if (r7 == 0) goto L_0x019e
            javax.net.ssl.SSLEngine r7 = r1.f21425e     // Catch:{ all -> 0x0218 }
            boolean r7 = r7.isOutboundDone()     // Catch:{ all -> 0x0218 }
            if (r7 == 0) goto L_0x019e
            h.a.a.d.v.e r7 = r1.f21433m     // Catch:{ all -> 0x0218 }
            boolean r7 = r7.mo34556F0()     // Catch:{ all -> 0x0218 }
            if (r7 != 0) goto L_0x019e
            h.a.a.d.n r7 = r1.f21308b     // Catch:{ all -> 0x0218 }
            r7.mo34370t()     // Catch:{ all -> 0x0218 }
        L_0x019e:
            r6 = r6 | r5
            goto L_0x006a
        L_0x01a1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0218 }
            r0.<init>()     // Catch:{ all -> 0x0218 }
            throw r0     // Catch:{ all -> 0x0218 }
        L_0x01a7:
            r0 = move-exception
            goto L_0x01ae
        L_0x01a9:
            r0 = move-exception
            r12 = 0
            goto L_0x01b5
        L_0x01ac:
            r0 = move-exception
            r12 = 0
        L_0x01ae:
            h.a.a.d.n r2 = r1.f21308b     // Catch:{ all -> 0x01b4 }
            r2.close()     // Catch:{ all -> 0x01b4 }
            throw r0     // Catch:{ all -> 0x01b4 }
        L_0x01b4:
            r0 = move-exception
        L_0x01b5:
            h.a.a.h.y.c r2 = r1.f21424d     // Catch:{ all -> 0x0218 }
            java.lang.String r5 = "{} {} {} filled={}/{} flushed={}/{}"
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0218 }
            javax.net.ssl.SSLSession r8 = r1.f21426f     // Catch:{ all -> 0x0218 }
            r7[r3] = r8     // Catch:{ all -> 0x0218 }
            r7[r4] = r1     // Catch:{ all -> 0x0218 }
            javax.net.ssl.SSLEngine r8 = r1.f21425e     // Catch:{ all -> 0x0218 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r8 = r8.getHandshakeStatus()     // Catch:{ all -> 0x0218 }
            r7[r11] = r8     // Catch:{ all -> 0x0218 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0218 }
            r7[r10] = r8     // Catch:{ all -> 0x0218 }
            h.a.a.d.v.e r8 = r1.f21431k     // Catch:{ all -> 0x0218 }
            int r8 = r8.length()     // Catch:{ all -> 0x0218 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0218 }
            r7[r9] = r8     // Catch:{ all -> 0x0218 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0218 }
            r8 = 5
            r7[r8] = r3     // Catch:{ all -> 0x0218 }
            h.a.a.d.v.e r3 = r1.f21433m     // Catch:{ all -> 0x0218 }
            int r3 = r3.length()     // Catch:{ all -> 0x0218 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0218 }
            r8 = 6
            r7[r8] = r3     // Catch:{ all -> 0x0218 }
            r2.mo35489e(r5, r7)     // Catch:{ all -> 0x0218 }
            throw r0     // Catch:{ all -> 0x0218 }
        L_0x01f3:
            h.a.a.d.v.e r2 = r1.f21432l     // Catch:{ all -> 0x0218 }
            if (r0 != r2) goto L_0x020c
            h.a.a.d.v.e r0 = r1.f21432l     // Catch:{ all -> 0x0218 }
            boolean r0 = r0.mo34556F0()     // Catch:{ all -> 0x0218 }
            if (r0 == 0) goto L_0x020c
            h.a.a.d.v.a r0 = r1.f21427g     // Catch:{ all -> 0x0218 }
            boolean r0 = r0.mo34186d()     // Catch:{ all -> 0x0218 }
            if (r0 != 0) goto L_0x020c
            h.a.a.d.d r0 = r1.f21434n     // Catch:{ all -> 0x0218 }
            r0.mo34350c()     // Catch:{ all -> 0x0218 }
        L_0x020c:
            r16.m27875F()     // Catch:{ all -> 0x0227 }
            if (r6 == 0) goto L_0x0216
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f21439s     // Catch:{ all -> 0x0227 }
            r0.set(r4)     // Catch:{ all -> 0x0227 }
        L_0x0216:
            monitor-exit(r16)
            return r6
        L_0x0218:
            r0 = move-exception
            r3 = r6
            goto L_0x021c
        L_0x021b:
            r0 = move-exception
        L_0x021c:
            r16.m27875F()     // Catch:{ all -> 0x0227 }
            if (r3 == 0) goto L_0x0226
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.f21439s     // Catch:{ all -> 0x0227 }
            r2.set(r4)     // Catch:{ all -> 0x0227 }
        L_0x0226:
            throw r0     // Catch:{ all -> 0x0227 }
        L_0x0227:
            r0 = move-exception
            monitor-exit(r16)
            goto L_0x022b
        L_0x022a:
            throw r0
        L_0x022b:
            goto L_0x022a
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p217d.p219v.C10971i.m27874E(h.a.a.d.e, h.a.a.d.e):boolean");
    }

    /* renamed from: F */
    private void m27875F() {
        synchronized (this) {
            int i = this.f21429i - 1;
            this.f21429i = i;
            if (i == 0 && this.f21430j != null && this.f21431k.length() == 0 && this.f21433m.length() == 0 && this.f21432l.length() == 0) {
                this.f21431k = null;
                this.f21433m = null;
                this.f21432l = null;
                f21423u.set(this.f21430j);
                this.f21430j = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0140, code lost:
        return r1;
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m27876G(p164h.p211a.p212a.p217d.C10929e r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            h.a.a.d.v.e r0 = r12.f21431k     // Catch:{ all -> 0x0170 }
            boolean r0 = r0.mo34556F0()     // Catch:{ all -> 0x0170 }
            r1 = 0
            if (r0 != 0) goto L_0x000c
            monitor-exit(r12)
            return r1
        L_0x000c:
            java.nio.ByteBuffer r0 = r12.m27873B(r13)     // Catch:{ all -> 0x0170 }
            monitor-enter(r0)     // Catch:{ all -> 0x0170 }
            h.a.a.d.v.e r2 = r12.f21431k     // Catch:{ all -> 0x016d }
            java.nio.ByteBuffer r2 = r2.mo34672z0()     // Catch:{ all -> 0x016d }
            monitor-enter(r2)     // Catch:{ all -> 0x016d }
            int r3 = r13.mo34562S0()     // Catch:{ SSLException -> 0x0143 }
            r0.position(r3)     // Catch:{ SSLException -> 0x0143 }
            int r3 = r13.capacity()     // Catch:{ SSLException -> 0x0143 }
            r0.limit(r3)     // Catch:{ SSLException -> 0x0143 }
            h.a.a.d.v.e r3 = r12.f21431k     // Catch:{ SSLException -> 0x0143 }
            int r3 = r3.getIndex()     // Catch:{ SSLException -> 0x0143 }
            r2.position(r3)     // Catch:{ SSLException -> 0x0143 }
            h.a.a.d.v.e r3 = r12.f21431k     // Catch:{ SSLException -> 0x0143 }
            int r3 = r3.mo34562S0()     // Catch:{ SSLException -> 0x0143 }
            r2.limit(r3)     // Catch:{ SSLException -> 0x0143 }
            javax.net.ssl.SSLEngine r3 = r12.f21425e     // Catch:{ SSLException -> 0x0143 }
            javax.net.ssl.SSLEngineResult r3 = r3.unwrap(r2, r0)     // Catch:{ SSLException -> 0x0143 }
            h.a.a.h.y.c r4 = r12.f21424d     // Catch:{ SSLException -> 0x0143 }
            boolean r4 = r4.mo35485a()     // Catch:{ SSLException -> 0x0143 }
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L_0x0078
            h.a.a.h.y.c r4 = r12.f21424d     // Catch:{ SSLException -> 0x0143 }
            java.lang.String r9 = "{} unwrap {} {} consumed={} produced={}"
            r10 = 5
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ SSLException -> 0x0143 }
            javax.net.ssl.SSLSession r11 = r12.f21426f     // Catch:{ SSLException -> 0x0143 }
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
            r4.mo35489e(r9, r10)     // Catch:{ SSLException -> 0x0143 }
        L_0x0078:
            h.a.a.d.v.e r4 = r12.f21431k     // Catch:{ SSLException -> 0x0143 }
            int r9 = r3.bytesConsumed()     // Catch:{ SSLException -> 0x0143 }
            r4.mo34591u0(r9)     // Catch:{ SSLException -> 0x0143 }
            h.a.a.d.v.e r4 = r12.f21431k     // Catch:{ SSLException -> 0x0143 }
            r4.mo34555D0()     // Catch:{ SSLException -> 0x0143 }
            int r4 = r13.mo34562S0()     // Catch:{ SSLException -> 0x0143 }
            int r9 = r3.bytesProduced()     // Catch:{ SSLException -> 0x0143 }
            int r4 = r4 + r9
            r13.mo34575f0(r4)     // Catch:{ SSLException -> 0x0143 }
            r2.position(r1)     // Catch:{ all -> 0x016a }
            int r4 = r2.capacity()     // Catch:{ all -> 0x016a }
            r2.limit(r4)     // Catch:{ all -> 0x016a }
            r0.position(r1)     // Catch:{ all -> 0x016a }
            int r4 = r0.capacity()     // Catch:{ all -> 0x016a }
            r0.limit(r4)     // Catch:{ all -> 0x016a }
            monitor-exit(r2)     // Catch:{ all -> 0x016a }
            monitor-exit(r0)     // Catch:{ all -> 0x016d }
            int[] r0 = p164h.p211a.p212a.p217d.p219v.C10971i.C10972a.f21441b     // Catch:{ all -> 0x0170 }
            javax.net.ssl.SSLEngineResult$Status r2 = r3.getStatus()     // Catch:{ all -> 0x0170 }
            int r2 = r2.ordinal()     // Catch:{ all -> 0x0170 }
            r0 = r0[r2]     // Catch:{ all -> 0x0170 }
            if (r0 == r8) goto L_0x0125
            if (r0 == r7) goto L_0x00fb
            if (r0 == r6) goto L_0x00f0
            if (r0 != r5) goto L_0x00d7
            h.a.a.h.y.c r13 = r12.f21424d     // Catch:{ all -> 0x0170 }
            java.lang.String r0 = "unwrap CLOSE {} {}"
            java.lang.Object[] r2 = new java.lang.Object[r7]     // Catch:{ all -> 0x0170 }
            r2[r1] = r12     // Catch:{ all -> 0x0170 }
            r2[r8] = r3     // Catch:{ all -> 0x0170 }
            r13.mo35489e(r0, r2)     // Catch:{ all -> 0x0170 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r13 = r3.getHandshakeStatus()     // Catch:{ all -> 0x0170 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED     // Catch:{ all -> 0x0170 }
            if (r13 != r0) goto L_0x0132
            h.a.a.d.n r13 = r12.f21308b     // Catch:{ all -> 0x0170 }
            r13.close()     // Catch:{ all -> 0x0170 }
            goto L_0x0132
        L_0x00d7:
            h.a.a.h.y.c r13 = r12.f21424d     // Catch:{ all -> 0x0170 }
            java.lang.String r0 = "{} wrap default {}"
            java.lang.Object[] r2 = new java.lang.Object[r7]     // Catch:{ all -> 0x0170 }
            javax.net.ssl.SSLSession r4 = r12.f21426f     // Catch:{ all -> 0x0170 }
            r2[r1] = r4     // Catch:{ all -> 0x0170 }
            r2[r8] = r3     // Catch:{ all -> 0x0170 }
            r13.mo35489e(r0, r2)     // Catch:{ all -> 0x0170 }
            java.io.IOException r13 = new java.io.IOException     // Catch:{ all -> 0x0170 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0170 }
            r13.<init>(r0)     // Catch:{ all -> 0x0170 }
            throw r13     // Catch:{ all -> 0x0170 }
        L_0x00f0:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r13 = r3.getHandshakeStatus()     // Catch:{ all -> 0x0170 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED     // Catch:{ all -> 0x0170 }
            if (r13 != r0) goto L_0x0132
            r12.f21436p = r8     // Catch:{ all -> 0x0170 }
            goto L_0x0132
        L_0x00fb:
            h.a.a.h.y.c r0 = r12.f21424d     // Catch:{ all -> 0x0170 }
            boolean r0 = r0.mo35485a()     // Catch:{ all -> 0x0170 }
            if (r0 == 0) goto L_0x0132
            h.a.a.h.y.c r0 = r12.f21424d     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = "{} unwrap {} {}->{}"
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ all -> 0x0170 }
            javax.net.ssl.SSLSession r5 = r12.f21426f     // Catch:{ all -> 0x0170 }
            r4[r1] = r5     // Catch:{ all -> 0x0170 }
            javax.net.ssl.SSLEngineResult$Status r5 = r3.getStatus()     // Catch:{ all -> 0x0170 }
            r4[r8] = r5     // Catch:{ all -> 0x0170 }
            h.a.a.d.v.e r5 = r12.f21431k     // Catch:{ all -> 0x0170 }
            java.lang.String r5 = r5.mo34563T()     // Catch:{ all -> 0x0170 }
            r4[r7] = r5     // Catch:{ all -> 0x0170 }
            java.lang.String r13 = r13.mo34563T()     // Catch:{ all -> 0x0170 }
            r4[r6] = r13     // Catch:{ all -> 0x0170 }
            r0.mo35489e(r2, r4)     // Catch:{ all -> 0x0170 }
            goto L_0x0132
        L_0x0125:
            h.a.a.d.n r13 = r12.f21308b     // Catch:{ all -> 0x0170 }
            boolean r13 = r13.mo34369s()     // Catch:{ all -> 0x0170 }
            if (r13 == 0) goto L_0x0132
            h.a.a.d.v.e r13 = r12.f21431k     // Catch:{ all -> 0x0170 }
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
            h.a.a.h.y.c r3 = r12.f21424d     // Catch:{ all -> 0x0141 }
            h.a.a.d.n r4 = r12.f21308b     // Catch:{ all -> 0x0141 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0141 }
            r3.mo35493i(r4, r13)     // Catch:{ all -> 0x0141 }
            h.a.a.d.n r3 = r12.f21308b     // Catch:{ all -> 0x0141 }
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
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p217d.p219v.C10971i.m27876G(h.a.a.d.e):boolean");
    }

    /* renamed from: H */
    private synchronized boolean m27877H(C10929e eVar) {
        boolean z;
        SSLEngineResult wrap;
        ByteBuffer B = m27873B(eVar);
        synchronized (B) {
            this.f21433m.mo34555D0();
            ByteBuffer z0 = this.f21433m.mo34672z0();
            synchronized (z0) {
                z = false;
                try {
                    B.position(eVar.getIndex());
                    B.limit(eVar.mo34562S0());
                    z0.position(this.f21433m.mo34562S0());
                    z0.limit(z0.capacity());
                    wrap = this.f21425e.wrap(B, z0);
                    if (this.f21424d.mo35485a()) {
                        this.f21424d.mo35489e("{} wrap {} {} consumed={} produced={}", this.f21426f, wrap.getStatus(), wrap.getHandshakeStatus(), Integer.valueOf(wrap.bytesConsumed()), Integer.valueOf(wrap.bytesProduced()));
                    }
                    eVar.mo34591u0(wrap.bytesConsumed());
                    this.f21433m.mo34575f0(this.f21433m.mo34562S0() + wrap.bytesProduced());
                    z0.position(0);
                    z0.limit(z0.capacity());
                    B.position(0);
                    B.limit(B.capacity());
                } catch (SSLException e) {
                    this.f21424d.mo35493i(String.valueOf(this.f21308b), e);
                    this.f21308b.close();
                    throw e;
                } catch (Throwable th) {
                    z0.position(0);
                    z0.limit(z0.capacity());
                    B.position(0);
                    B.limit(B.capacity());
                    throw th;
                }
            }
        }
        int i = C10972a.f21441b[wrap.getStatus().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        this.f21424d.mo35489e("wrap CLOSE {} {}", this, wrap);
                        if (wrap.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                            this.f21308b.close();
                        }
                    } else {
                        this.f21424d.mo35489e("{} wrap default {}", this.f21426f, wrap);
                        throw new IOException(wrap.toString());
                    }
                } else if (wrap.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                    this.f21436p = true;
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
    public C10928d mo34709C() {
        return this.f21428h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public C10974c mo34710D() {
        return new C10974c();
    }

    /* renamed from: a */
    public boolean mo34185a() {
        return false;
    }

    /* renamed from: c */
    public C10941m mo34225c() {
        try {
            m27872A();
            boolean z = true;
            while (z) {
                z = this.f21425e.getHandshakeStatus() != SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING ? m27874E((C10929e) null, (C10929e) null) : false;
                C10954a aVar = (C10954a) this.f21427g.mo34225c();
                if (!(aVar == this.f21427g || aVar == null)) {
                    this.f21427g = aVar;
                    z = true;
                }
                this.f21424d.mo35489e("{} handle {} progress={}", this.f21426f, this, Boolean.valueOf(z));
            }
            m27875F();
            if (!this.f21437q && this.f21428h.mo34369s() && this.f21428h.isOpen()) {
                this.f21437q = true;
                try {
                    this.f21427g.mo34226e();
                } catch (Throwable th) {
                    this.f21424d.mo35492h("onInputShutdown failed", th);
                    try {
                        this.f21428h.close();
                    } catch (IOException e) {
                        this.f21424d.mo35488d(e);
                    }
                }
            }
            return this;
        } catch (Throwable th2) {
            this.f21424d.mo35492h("onInputShutdown failed", th2);
            try {
                this.f21428h.close();
            } catch (IOException e2) {
                this.f21424d.mo35488d(e2);
            }
        }
        throw th;
    }

    /* renamed from: d */
    public boolean mo34186d() {
        return false;
    }

    /* renamed from: e */
    public void mo34226e() {
    }

    /* renamed from: f */
    public void mo34604f(long j) {
        try {
            this.f21424d.mo35489e("onIdleExpired {}ms on {}", Long.valueOf(j), this);
            if (this.f21308b.mo34368r()) {
                this.f21428h.close();
            } else {
                this.f21428h.mo34370t();
            }
        } catch (IOException e) {
            this.f21424d.mo35495k(e);
            super.mo34604f(j);
        }
    }

    public void onClose() {
        C10941m h = this.f21428h.mo34357h();
        if (h != null && h != this) {
            h.onClose();
        }
    }

    public String toString() {
        return String.format("%s %s", new Object[]{super.toString(), this.f21428h});
    }
}
