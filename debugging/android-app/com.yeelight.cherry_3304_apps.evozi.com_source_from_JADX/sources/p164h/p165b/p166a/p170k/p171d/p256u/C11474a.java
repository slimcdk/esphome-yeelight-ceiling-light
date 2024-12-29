package p164h.p165b.p166a.p170k.p171d.p256u;

import java.util.concurrent.ExecutorService;
import java.util.logging.Logger;
import p154d.p155b.C10725k;
import p164h.p165b.p166a.p170k.p172e.C11489k;
import p164h.p211a.p212a.p222f.C11040p;
import p164h.p211a.p212a.p222f.p223v.C11048a;
import p164h.p211a.p212a.p227g.C11082d;
import p164h.p211a.p212a.p227g.C11088f;
import p164h.p211a.p212a.p228h.p232d0.C11108a;

/* renamed from: h.b.a.k.d.u.a */
public class C11474a implements C11489k {

    /* renamed from: b */
    private static final Logger f22830b = Logger.getLogger(C11474a.class.getName());

    /* renamed from: c */
    public static final C11474a f22831c = new C11474a();

    /* renamed from: a */
    protected C11040p f22832a;

    /* renamed from: h.b.a.k.d.u.a$a */
    class C11475a extends C11108a {
        C11475a(C11474a aVar, ExecutorService executorService) {
            super(executorService);
        }

        /* access modifiers changed from: protected */
        /* renamed from: q0 */
        public void mo34263q0() {
        }
    }

    private C11474a() {
        mo36350f();
    }

    /* renamed from: a */
    public synchronized void mo36345a(ExecutorService executorService) {
        if (f22831c.f22832a.mo35008V0() == null) {
            f22831c.f22832a.mo35018f1(new C11475a(this, executorService));
        }
    }

    /* renamed from: b */
    public synchronized void mo36346b() {
        if (!this.f22832a.mo35452j0() && !this.f22832a.mo35449K()) {
            f22830b.info("Starting Jetty server... ");
            try {
                this.f22832a.start();
            } catch (Exception e) {
                Logger logger = f22830b;
                logger.severe("Couldn't start Jetty server: " + e);
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: c */
    public synchronized void mo36347c(String str, C10725k kVar) {
        if (this.f22832a.mo35097M0() == null) {
            Logger logger = f22830b;
            logger.info("Registering UPnP servlet under context path: " + str);
            C11082d dVar = new C11082d(0);
            if (str != null && str.length() > 0) {
                dVar.mo35073s1(str);
            }
            dVar.mo35198x1(new C11088f(kVar), "/*");
            this.f22832a.mo35098N0(dVar);
        }
    }

    /* renamed from: d */
    public synchronized int mo36348d(String str, int i) {
        C11048a aVar;
        aVar = new C11048a();
        aVar.mo34813g1(str);
        aVar.mo34815h1(i);
        aVar.open();
        this.f22832a.mo35001O0(aVar);
        if (this.f22832a.mo35452j0()) {
            try {
                aVar.start();
            } catch (Exception e) {
                Logger logger = f22830b;
                logger.severe("Couldn't start connector: " + aVar + " " + e);
                throw new RuntimeException(e);
            }
        }
        return aVar.mo34891f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r3.mo35449K() == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r3.stop();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r5.f22832a.mo35014b1(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        if (r0.length != 1) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        f22830b.info("No more connectors, stopping Jetty server");
        mo36351g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        r7 = f22830b;
        r7.severe("Couldn't stop connector: " + r3 + " " + r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0064, code lost:
        throw new java.lang.RuntimeException(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r3.mo35452j0() != false) goto L_0x0029;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo36349e(java.lang.String r6, int r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            h.a.a.f.p r0 = r5.f22832a     // Catch:{ all -> 0x006a }
            h.a.a.f.f[] r0 = r0.mo35002P0()     // Catch:{ all -> 0x006a }
            int r1 = r0.length     // Catch:{ all -> 0x006a }
            r2 = 0
        L_0x0009:
            if (r2 >= r1) goto L_0x0068
            r3 = r0[r2]     // Catch:{ all -> 0x006a }
            java.lang.String r4 = r3.mo34797V()     // Catch:{ all -> 0x006a }
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x006a }
            if (r4 == 0) goto L_0x0065
            int r4 = r3.mo34891f()     // Catch:{ all -> 0x006a }
            if (r4 != r7) goto L_0x0065
            boolean r6 = r3.mo35452j0()     // Catch:{ all -> 0x006a }
            if (r6 != 0) goto L_0x0029
            boolean r6 = r3.mo35449K()     // Catch:{ all -> 0x006a }
            if (r6 == 0) goto L_0x002c
        L_0x0029:
            r3.stop()     // Catch:{ Exception -> 0x0040 }
        L_0x002c:
            h.a.a.f.p r6 = r5.f22832a     // Catch:{ all -> 0x006a }
            r6.mo35014b1(r3)     // Catch:{ all -> 0x006a }
            int r6 = r0.length     // Catch:{ all -> 0x006a }
            r7 = 1
            if (r6 != r7) goto L_0x0068
            java.util.logging.Logger r6 = f22830b     // Catch:{ all -> 0x006a }
            java.lang.String r7 = "No more connectors, stopping Jetty server"
            r6.info(r7)     // Catch:{ all -> 0x006a }
            r5.mo36351g()     // Catch:{ all -> 0x006a }
            goto L_0x0068
        L_0x0040:
            r6 = move-exception
            java.util.logging.Logger r7 = f22830b     // Catch:{ all -> 0x006a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x006a }
            r0.<init>()     // Catch:{ all -> 0x006a }
            java.lang.String r1 = "Couldn't stop connector: "
            r0.append(r1)     // Catch:{ all -> 0x006a }
            r0.append(r3)     // Catch:{ all -> 0x006a }
            java.lang.String r1 = " "
            r0.append(r1)     // Catch:{ all -> 0x006a }
            r0.append(r6)     // Catch:{ all -> 0x006a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x006a }
            r7.severe(r0)     // Catch:{ all -> 0x006a }
            java.lang.RuntimeException r7 = new java.lang.RuntimeException     // Catch:{ all -> 0x006a }
            r7.<init>(r6)     // Catch:{ all -> 0x006a }
            throw r7     // Catch:{ all -> 0x006a }
        L_0x0065:
            int r2 = r2 + 1
            goto L_0x0009
        L_0x0068:
            monitor-exit(r5)
            return
        L_0x006a:
            r6 = move-exception
            monitor-exit(r5)
            goto L_0x006e
        L_0x006d:
            throw r6
        L_0x006e:
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p165b.p166a.p170k.p171d.p256u.C11474a.mo36349e(java.lang.String, int):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo36350f() {
        C11040p pVar = new C11040p();
        this.f22832a = pVar;
        pVar.mo35016d1(1000);
    }

    /* renamed from: g */
    public synchronized void mo36351g() {
        if (!this.f22832a.mo35450Q() && !this.f22832a.mo35456u()) {
            f22830b.info("Stopping Jetty server...");
            try {
                this.f22832a.stop();
                mo36350f();
            } catch (Exception e) {
                Logger logger = f22830b;
                logger.severe("Couldn't stop Jetty server: " + e);
                throw new RuntimeException(e);
            } catch (Throwable th) {
                mo36350f();
                throw th;
            }
        }
    }
}
