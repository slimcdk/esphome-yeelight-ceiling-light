package p164h.p211a.p212a.p222f;

import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicLong;
import p164h.p211a.p212a.p216c.C10892d;
import p164h.p211a.p212a.p216c.C10893e;
import p164h.p211a.p212a.p216c.C10897i;
import p164h.p211a.p212a.p217d.C10935i;
import p164h.p211a.p212a.p217d.C10941m;
import p164h.p211a.p212a.p217d.C10942n;
import p164h.p211a.p212a.p228h.p231c0.C11105a;
import p164h.p211a.p212a.p228h.p231c0.C11106b;
import p164h.p211a.p212a.p228h.p232d0.C11114d;
import p164h.p211a.p212a.p228h.p233x.C11146b;
import p164h.p211a.p212a.p228h.p233x.C11152d;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.f.a */
public abstract class C11008a extends C11146b implements C10892d, C11028f, C11152d {
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public static final C11158c f21517Q = C11156b.m29015a(C11008a.class);

    /* renamed from: A */
    private String f21518A;

    /* renamed from: B */
    private String f21519B;

    /* renamed from: G */
    private boolean f21520G = true;

    /* renamed from: H */
    protected int f21521H = 200000;

    /* renamed from: I */
    protected int f21522I = -1;

    /* renamed from: J */
    protected int f21523J = -1;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public transient Thread[] f21524K;

    /* renamed from: L */
    private final AtomicLong f21525L = new AtomicLong(-1);

    /* renamed from: M */
    private final C11105a f21526M = new C11105a();

    /* renamed from: N */
    private final C11106b f21527N = new C11106b();

    /* renamed from: O */
    private final C11106b f21528O = new C11106b();

    /* renamed from: P */
    protected final C10893e f21529P;

    /* renamed from: h */
    private String f21530h;

    /* renamed from: i */
    private C11040p f21531i;

    /* renamed from: j */
    private C11114d f21532j;

    /* renamed from: k */
    private String f21533k;

    /* renamed from: l */
    private int f21534l = 0;

    /* renamed from: m */
    private String f21535m = "https";

    /* renamed from: n */
    private int f21536n = 0;

    /* renamed from: o */
    private String f21537o = "https";

    /* renamed from: p */
    private int f21538p = 0;

    /* renamed from: q */
    private int f21539q = 0;

    /* renamed from: r */
    private int f21540r = 1;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f21541s = 0;

    /* renamed from: t */
    private boolean f21542t;

    /* renamed from: u */
    private boolean f21543u;

    /* renamed from: v */
    private String f21544v;

    /* renamed from: w */
    private String f21545w = "X-Forwarded-Host";

    /* renamed from: x */
    private String f21546x = "X-Forwarded-Server";

    /* renamed from: y */
    private String f21547y = "X-Forwarded-For";

    /* renamed from: z */
    private String f21548z = "X-Forwarded-Proto";

    /* renamed from: h.a.a.f.a$a */
    private class C11009a implements Runnable {

        /* renamed from: a */
        int f21549a = 0;

        C11009a(int i) {
            this.f21549a = i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r0.setPriority(r1 - p164h.p211a.p212a.p222f.C11008a.m28068L0(r6.f21550b));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0063, code lost:
            if (r6.f21550b.isRunning() == false) goto L_0x0093;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x006b, code lost:
            if (r6.f21550b.mo34892h() == null) goto L_0x0093;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            r6.f21550b.mo34785J0(r6.f21549a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0075, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            p164h.p211a.p212a.p222f.C11008a.m28069M0().mo35495k(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x007e, code lost:
            r4 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x007f, code lost:
            r5 = p164h.p211a.p212a.p222f.C11008a.m28069M0();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0087, code lost:
            r4 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0088, code lost:
            r5 = p164h.p211a.p212a.p222f.C11008a.m28069M0();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x008d, code lost:
            r4 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x008e, code lost:
            r5 = p164h.p211a.p212a.p222f.C11008a.m28069M0();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0093, code lost:
            r0.setPriority(r1);
            r0.setName(r2);
            r4 = r6.f21550b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x009b, code lost:
            monitor-enter(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a2, code lost:
            if (p164h.p211a.p212a.p222f.C11008a.m28067K0(r6.f21550b) == null) goto L_0x00ae;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a4, code lost:
            p164h.p211a.p212a.p222f.C11008a.m28067K0(r6.f21550b)[r6.f21549a] = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ae, code lost:
            monitor-exit(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00af, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b3, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b4, code lost:
            r0.setPriority(r1);
            r0.setName(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bc, code lost:
            monitor-enter(r6.f21550b);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c3, code lost:
            if (p164h.p211a.p212a.p222f.C11008a.m28067K0(r6.f21550b) != null) goto L_0x00c5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c5, code lost:
            p164h.p211a.p212a.p222f.C11008a.m28067K0(r6.f21550b)[r6.f21549a] = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d0, code lost:
            throw r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x004d, code lost:
            r1 = r0.getPriority();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                h.a.a.f.a r1 = p164h.p211a.p212a.p222f.C11008a.this
                monitor-enter(r1)
                h.a.a.f.a r2 = p164h.p211a.p212a.p222f.C11008a.this     // Catch:{ all -> 0x00d4 }
                java.lang.Thread[] r2 = r2.f21524K     // Catch:{ all -> 0x00d4 }
                if (r2 != 0) goto L_0x0011
                monitor-exit(r1)     // Catch:{ all -> 0x00d4 }
                return
            L_0x0011:
                h.a.a.f.a r2 = p164h.p211a.p212a.p222f.C11008a.this     // Catch:{ all -> 0x00d4 }
                java.lang.Thread[] r2 = r2.f21524K     // Catch:{ all -> 0x00d4 }
                int r3 = r6.f21549a     // Catch:{ all -> 0x00d4 }
                r2[r3] = r0     // Catch:{ all -> 0x00d4 }
                h.a.a.f.a r2 = p164h.p211a.p212a.p222f.C11008a.this     // Catch:{ all -> 0x00d4 }
                java.lang.Thread[] r2 = r2.f21524K     // Catch:{ all -> 0x00d4 }
                int r3 = r6.f21549a     // Catch:{ all -> 0x00d4 }
                r2 = r2[r3]     // Catch:{ all -> 0x00d4 }
                java.lang.String r2 = r2.getName()     // Catch:{ all -> 0x00d4 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d4 }
                r3.<init>()     // Catch:{ all -> 0x00d4 }
                r3.append(r2)     // Catch:{ all -> 0x00d4 }
                java.lang.String r4 = " Acceptor"
                r3.append(r4)     // Catch:{ all -> 0x00d4 }
                int r4 = r6.f21549a     // Catch:{ all -> 0x00d4 }
                r3.append(r4)     // Catch:{ all -> 0x00d4 }
                java.lang.String r4 = " "
                r3.append(r4)     // Catch:{ all -> 0x00d4 }
                h.a.a.f.a r4 = p164h.p211a.p212a.p222f.C11008a.this     // Catch:{ all -> 0x00d4 }
                r3.append(r4)     // Catch:{ all -> 0x00d4 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00d4 }
                r0.setName(r3)     // Catch:{ all -> 0x00d4 }
                monitor-exit(r1)     // Catch:{ all -> 0x00d4 }
                int r1 = r0.getPriority()
                r3 = 0
                h.a.a.f.a r4 = p164h.p211a.p212a.p222f.C11008a.this     // Catch:{ all -> 0x00b3 }
                int r4 = r4.f21541s     // Catch:{ all -> 0x00b3 }
                int r4 = r1 - r4
                r0.setPriority(r4)     // Catch:{ all -> 0x00b3 }
            L_0x005d:
                h.a.a.f.a r4 = p164h.p211a.p212a.p222f.C11008a.this     // Catch:{ all -> 0x00b3 }
                boolean r4 = r4.isRunning()     // Catch:{ all -> 0x00b3 }
                if (r4 == 0) goto L_0x0093
                h.a.a.f.a r4 = p164h.p211a.p212a.p222f.C11008a.this     // Catch:{ all -> 0x00b3 }
                java.lang.Object r4 = r4.mo34892h()     // Catch:{ all -> 0x00b3 }
                if (r4 == 0) goto L_0x0093
                h.a.a.f.a r4 = p164h.p211a.p212a.p222f.C11008a.this     // Catch:{ o -> 0x008d, IOException -> 0x0087, InterruptedException -> 0x007e, all -> 0x0075 }
                int r5 = r6.f21549a     // Catch:{ o -> 0x008d, IOException -> 0x0087, InterruptedException -> 0x007e, all -> 0x0075 }
                r4.mo34785J0(r5)     // Catch:{ o -> 0x008d, IOException -> 0x0087, InterruptedException -> 0x007e, all -> 0x0075 }
                goto L_0x005d
            L_0x0075:
                r4 = move-exception
                h.a.a.h.y.c r5 = p164h.p211a.p212a.p222f.C11008a.f21517Q     // Catch:{ all -> 0x00b3 }
                r5.mo35495k(r4)     // Catch:{ all -> 0x00b3 }
                goto L_0x005d
            L_0x007e:
                r4 = move-exception
                h.a.a.h.y.c r5 = p164h.p211a.p212a.p222f.C11008a.f21517Q     // Catch:{ all -> 0x00b3 }
            L_0x0083:
                r5.mo35488d(r4)     // Catch:{ all -> 0x00b3 }
                goto L_0x005d
            L_0x0087:
                r4 = move-exception
                h.a.a.h.y.c r5 = p164h.p211a.p212a.p222f.C11008a.f21517Q     // Catch:{ all -> 0x00b3 }
                goto L_0x0083
            L_0x008d:
                r4 = move-exception
                h.a.a.h.y.c r5 = p164h.p211a.p212a.p222f.C11008a.f21517Q     // Catch:{ all -> 0x00b3 }
                goto L_0x0083
            L_0x0093:
                r0.setPriority(r1)
                r0.setName(r2)
                h.a.a.f.a r4 = p164h.p211a.p212a.p222f.C11008a.this
                monitor-enter(r4)
                h.a.a.f.a r0 = p164h.p211a.p212a.p222f.C11008a.this     // Catch:{ all -> 0x00b0 }
                java.lang.Thread[] r0 = r0.f21524K     // Catch:{ all -> 0x00b0 }
                if (r0 == 0) goto L_0x00ae
                h.a.a.f.a r0 = p164h.p211a.p212a.p222f.C11008a.this     // Catch:{ all -> 0x00b0 }
                java.lang.Thread[] r0 = r0.f21524K     // Catch:{ all -> 0x00b0 }
                int r1 = r6.f21549a     // Catch:{ all -> 0x00b0 }
                r0[r1] = r3     // Catch:{ all -> 0x00b0 }
            L_0x00ae:
                monitor-exit(r4)     // Catch:{ all -> 0x00b0 }
                return
            L_0x00b0:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x00b0 }
                throw r0
            L_0x00b3:
                r4 = move-exception
                r0.setPriority(r1)
                r0.setName(r2)
                h.a.a.f.a r0 = p164h.p211a.p212a.p222f.C11008a.this
                monitor-enter(r0)
                h.a.a.f.a r1 = p164h.p211a.p212a.p222f.C11008a.this     // Catch:{ all -> 0x00d1 }
                java.lang.Thread[] r1 = r1.f21524K     // Catch:{ all -> 0x00d1 }
                if (r1 == 0) goto L_0x00cf
                h.a.a.f.a r1 = p164h.p211a.p212a.p222f.C11008a.this     // Catch:{ all -> 0x00d1 }
                java.lang.Thread[] r1 = r1.f21524K     // Catch:{ all -> 0x00d1 }
                int r2 = r6.f21549a     // Catch:{ all -> 0x00d1 }
                r1[r2] = r3     // Catch:{ all -> 0x00d1 }
            L_0x00cf:
                monitor-exit(r0)     // Catch:{ all -> 0x00d1 }
                throw r4
            L_0x00d1:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00d1 }
                throw r1
            L_0x00d4:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x00d4 }
                goto L_0x00d8
            L_0x00d7:
                throw r0
            L_0x00d8:
                goto L_0x00d7
            */
            throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p222f.C11008a.C11009a.run():void");
        }
    }

    public C11008a() {
        C10893e eVar = new C10893e();
        this.f21529P = eVar;
        mo35020y0(eVar);
    }

    /* renamed from: B */
    public boolean mo34782B(C11037n nVar) {
        return this.f21543u && nVar.mo34944P().equalsIgnoreCase("https");
    }

    /* renamed from: H */
    public void mo34783H(C10942n nVar, C11037n nVar2) {
        if (mo34810f1()) {
            mo34787N0(nVar, nVar2);
        }
    }

    /* renamed from: J */
    public boolean mo34784J(C11037n nVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J0 */
    public abstract void mo34785J0(int i);

    /* renamed from: M */
    public boolean mo34786M() {
        C11114d dVar = this.f21532j;
        return dVar != null ? dVar.mo35292v() : this.f21531i.mo35008V0().mo35292v();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* renamed from: N0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34787N0(p164h.p211a.p212a.p217d.C10942n r8, p164h.p211a.p212a.p222f.C11037n r9) {
        /*
            r7 = this;
            h.a.a.f.b r8 = r9.mo34925D()
            h.a.a.c.i r8 = r8.mo34850w()
            java.lang.String r0 = r7.mo34796U0()
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r7.mo34796U0()
            java.lang.String r0 = r8.mo34479u(r0)
            if (r0 == 0) goto L_0x001d
            java.lang.String r1 = "javax.servlet.request.cipher_suite"
            r9.mo33965b(r1, r0)
        L_0x001d:
            java.lang.String r0 = r7.mo34803Z0()
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = r7.mo34803Z0()
            java.lang.String r0 = r8.mo34479u(r0)
            if (r0 == 0) goto L_0x0037
            java.lang.String r1 = "javax.servlet.request.ssl_session_id"
            r9.mo33965b(r1, r0)
            java.lang.String r0 = "https"
            r9.mo34920A0(r0)
        L_0x0037:
            java.lang.String r0 = r7.mo34799W0()
            java.lang.String r0 = r7.mo34804a1(r8, r0)
            java.lang.String r1 = r7.mo34802Y0()
            java.lang.String r1 = r7.mo34804a1(r8, r1)
            java.lang.String r2 = r7.mo34798V0()
            java.lang.String r2 = r7.mo34804a1(r8, r2)
            java.lang.String r3 = r7.mo34801X0()
            java.lang.String r3 = r7.mo34804a1(r8, r3)
            java.lang.String r4 = r7.f21544v
            r5 = -1
            r6 = 0
            if (r4 == 0) goto L_0x006c
            h.a.a.d.e r0 = p164h.p211a.p212a.p216c.C10910l.f21153e
            r8.mo34458A(r0, r4)
        L_0x0062:
            r9.mo34922B0(r6)
            r9.mo34924C0(r5)
            r9.mo33972q()
            goto L_0x0079
        L_0x006c:
            if (r0 == 0) goto L_0x0074
            h.a.a.d.e r1 = p164h.p211a.p212a.p216c.C10910l.f21153e
            r8.mo34458A(r1, r0)
            goto L_0x0062
        L_0x0074:
            if (r1 == 0) goto L_0x0079
            r9.mo34922B0(r1)
        L_0x0079:
            if (r2 == 0) goto L_0x0097
            r9.mo34977v0(r2)
            boolean r8 = r7.f21542t
            if (r8 == 0) goto L_0x008d
            java.net.InetAddress r6 = java.net.InetAddress.getByName(r2)     // Catch:{ UnknownHostException -> 0x0087 }
            goto L_0x008d
        L_0x0087:
            r8 = move-exception
            h.a.a.h.y.c r0 = f21517Q
            r0.mo35488d(r8)
        L_0x008d:
            if (r6 != 0) goto L_0x0090
            goto L_0x0094
        L_0x0090:
            java.lang.String r2 = r6.getHostName()
        L_0x0094:
            r9.mo34979w0(r2)
        L_0x0097:
            if (r3 == 0) goto L_0x009c
            r9.mo34920A0(r3)
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p222f.C11008a.mo34787N0(h.a.a.d.n, h.a.a.f.n):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: O0 */
    public void mo34788O0(Socket socket) {
        try {
            socket.setTcpNoDelay(true);
            if (this.f21523J >= 0) {
                socket.setSoLinger(true, this.f21523J / 1000);
            } else {
                socket.setSoLinger(false, 0);
            }
        } catch (Exception e) {
            f21517Q.mo35488d(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public void mo34789P0(C10941m mVar) {
        mVar.onClose();
        if (this.f21525L.get() != -1) {
            long currentTimeMillis = System.currentTimeMillis() - mVar.mo34603b();
            this.f21527N.mo35290a((long) (mVar instanceof C11010b ? ((C11010b) mVar).mo34851x() : 0));
            this.f21526M.mo35288b();
            this.f21528O.mo35290a(currentTimeMillis);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q0 */
    public void mo34790Q0(C10941m mVar) {
        if (this.f21525L.get() != -1) {
            this.f21526M.mo35289c();
        }
    }

    /* renamed from: R */
    public String mo34791R() {
        return this.f21537o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo34792R0(C10941m mVar, C10941m mVar2) {
        this.f21527N.mo35290a(mVar instanceof C11010b ? (long) ((C11010b) mVar).mo34851x() : 0);
    }

    /* renamed from: S */
    public int mo34793S() {
        return this.f21536n;
    }

    /* renamed from: S0 */
    public int mo34794S0() {
        return this.f21539q;
    }

    /* renamed from: T0 */
    public int mo34795T0() {
        return this.f21540r;
    }

    /* renamed from: U0 */
    public String mo34796U0() {
        return this.f21518A;
    }

    /* renamed from: V */
    public String mo34797V() {
        return this.f21533k;
    }

    /* renamed from: V0 */
    public String mo34798V0() {
        return this.f21547y;
    }

    /* renamed from: W */
    public C10935i mo34245W() {
        return this.f21529P.mo34245W();
    }

    /* renamed from: W0 */
    public String mo34799W0() {
        return this.f21545w;
    }

    /* renamed from: X */
    public void mo34800X(C10942n nVar) {
    }

    /* renamed from: X0 */
    public String mo34801X0() {
        return this.f21548z;
    }

    /* renamed from: Y0 */
    public String mo34802Y0() {
        return this.f21546x;
    }

    /* renamed from: Z0 */
    public String mo34803Z0() {
        return this.f21519B;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a1 */
    public String mo34804a1(C10897i iVar, String str) {
        String u;
        if (str == null || (u = iVar.mo34479u(str)) == null) {
            return null;
        }
        int indexOf = u.indexOf(44);
        return indexOf == -1 ? u : u.substring(0, indexOf);
    }

    /* renamed from: b1 */
    public int mo34805b1() {
        return this.f21522I;
    }

    /* renamed from: c1 */
    public int mo34806c1() {
        return this.f21534l;
    }

    /* renamed from: d */
    public C11040p mo34807d() {
        return this.f21531i;
    }

    /* renamed from: d1 */
    public boolean mo34808d1() {
        return this.f21520G;
    }

    /* renamed from: e1 */
    public C11114d mo34809e1() {
        return this.f21532j;
    }

    /* renamed from: f1 */
    public boolean mo34810f1() {
        return this.f21543u;
    }

    /* renamed from: g */
    public int mo34811g() {
        return this.f21521H;
    }

    /* renamed from: g0 */
    public String mo34812g0() {
        return this.f21535m;
    }

    /* renamed from: g1 */
    public void mo34813g1(String str) {
        this.f21533k = str;
    }

    public String getName() {
        if (this.f21530h == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(mo34797V() == null ? "0.0.0.0" : mo34797V());
            sb.append(Constants.COLON_SEPARATOR);
            sb.append(mo34891f() <= 0 ? mo34806c1() : mo34891f());
            this.f21530h = sb.toString();
        }
        return this.f21530h;
    }

    /* renamed from: h1 */
    public void mo34815h1(int i) {
        this.f21534l = i;
    }

    /* renamed from: i */
    public void mo34816i(C11040p pVar) {
        this.f21531i = pVar;
    }

    /* renamed from: m0 */
    public C10935i mo34261m0() {
        return this.f21529P.mo34261m0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public void mo34262p0() {
        if (this.f21531i != null) {
            open();
            if (this.f21532j == null) {
                C11114d V0 = this.f21531i.mo35008V0();
                this.f21532j = V0;
                mo35462z0(V0, false);
            }
            super.mo34262p0();
            synchronized (this) {
                this.f21524K = new Thread[mo34795T0()];
                int i = 0;
                while (i < this.f21524K.length) {
                    if (this.f21532j.mo35291e0(new C11009a(i))) {
                        i++;
                    } else {
                        throw new IllegalStateException("!accepting");
                    }
                }
                if (this.f21532j.mo35292v()) {
                    f21517Q.mo35486b("insufficient threads configured for {}", this);
                }
            }
            f21517Q.mo35494j("Started {}", this);
            return;
        }
        throw new IllegalStateException("No server");
    }

    @Deprecated
    /* renamed from: q */
    public final int mo34817q() {
        return mo34805b1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public void mo34263q0() {
        Thread[] threadArr;
        try {
            close();
        } catch (IOException e) {
            f21517Q.mo35495k(e);
        }
        super.mo34263q0();
        synchronized (this) {
            threadArr = this.f21524K;
            this.f21524K = null;
        }
        if (threadArr != null) {
            for (Thread thread : threadArr) {
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
    }

    /* renamed from: r */
    public boolean mo34818r() {
        return this.f21542t;
    }

    public String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = getClass().getSimpleName();
        objArr[1] = mo34797V() == null ? "0.0.0.0" : mo34797V();
        objArr[2] = Integer.valueOf(mo34891f() <= 0 ? mo34806c1() : mo34891f());
        return String.format("%s@%s:%d", objArr);
    }

    /* renamed from: y */
    public int mo34820y() {
        return this.f21538p;
    }
}
