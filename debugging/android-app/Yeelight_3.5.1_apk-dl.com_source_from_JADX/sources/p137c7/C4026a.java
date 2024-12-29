package p137c7;

import java.util.concurrent.ExecutorService;
import java.util.logging.Logger;
import org.eclipse.jetty.servlet.C9965c;
import org.eclipse.jetty.servlet.ServletHolder;
import p126a6.C3980a;
import p148d7.C8959i;
import p172i6.C9121a;
import p208s4.C10357i;
import p239z5.C12187r;

/* renamed from: c7.a */
public class C4026a implements C8959i {

    /* renamed from: b */
    private static final Logger f6853b = Logger.getLogger(C4026a.class.getName());

    /* renamed from: c */
    public static final C4026a f6854c = new C4026a();

    /* renamed from: a */
    protected C12187r f6855a;

    /* renamed from: c7.a$a */
    class C4027a extends C9121a {
        C4027a(C4026a aVar, ExecutorService executorService) {
            super(executorService);
        }

        /* access modifiers changed from: protected */
        /* renamed from: v0 */
        public void mo26548v0() {
        }
    }

    private C4026a() {
        mo26722f();
    }

    /* renamed from: a */
    public synchronized void mo26717a(ExecutorService executorService) {
        C4026a aVar = f6854c;
        if (aVar.f6855a.mo43174a1() == null) {
            aVar.f6855a.mo43184k1(new C4027a(this, executorService));
        }
    }

    /* renamed from: b */
    public synchronized void mo26718b() {
        if (!this.f6855a.mo36748n0() && !this.f6855a.mo36745M()) {
            f6853b.info("Starting Jetty server... ");
            try {
                this.f6855a.start();
            } catch (Exception e) {
                Logger logger = f6853b;
                logger.severe("Couldn't start Jetty server: " + e);
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: c */
    public synchronized void mo26719c(String str, C10357i iVar) {
        if (this.f6855a.mo39983R0() == null) {
            Logger logger = f6853b;
            logger.info("Registering UPnP servlet under context path: " + str);
            C9965c cVar = new C9965c(0);
            if (str != null && str.length() > 0) {
                cVar.mo39929E1(str);
            }
            cVar.mo40068J1(new ServletHolder(iVar), "/*");
            this.f6855a.mo39984S0(cVar);
        }
    }

    /* renamed from: d */
    public synchronized int mo26720d(String str, int i) {
        C3980a aVar;
        aVar = new C3980a();
        aVar.mo42955k1(str);
        aVar.mo42956l1(i);
        aVar.open();
        this.f6855a.mo43167T0(aVar);
        if (this.f6855a.mo36748n0()) {
            try {
                aVar.start();
            } catch (Exception e) {
                Logger logger = f6853b;
                logger.severe("Couldn't start connector: " + aVar + " " + e);
                throw new RuntimeException(e);
            }
        }
        return aVar.mo26540e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r3.mo36745M() == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r3.stop();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r5.f6855a.mo43180g1(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        if (r0.length != 1) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        f6853b.info("No more connectors, stopping Jetty server");
        mo26723g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        r7 = f6853b;
        r7.severe("Couldn't stop connector: " + r3 + " " + r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0064, code lost:
        throw new java.lang.RuntimeException(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r3.mo36748n0() != false) goto L_0x0029;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo26721e(java.lang.String r6, int r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            z5.r r0 = r5.f6855a     // Catch:{ all -> 0x006a }
            z5.f[] r0 = r0.mo43168U0()     // Catch:{ all -> 0x006a }
            int r1 = r0.length     // Catch:{ all -> 0x006a }
            r2 = 0
        L_0x0009:
            if (r2 >= r1) goto L_0x0068
            r3 = r0[r2]     // Catch:{ all -> 0x006a }
            java.lang.String r4 = r3.mo42932W()     // Catch:{ all -> 0x006a }
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x006a }
            if (r4 == 0) goto L_0x0065
            int r4 = r3.mo26540e()     // Catch:{ all -> 0x006a }
            if (r4 != r7) goto L_0x0065
            boolean r6 = r3.mo36748n0()     // Catch:{ all -> 0x006a }
            if (r6 != 0) goto L_0x0029
            boolean r6 = r3.mo36745M()     // Catch:{ all -> 0x006a }
            if (r6 == 0) goto L_0x002c
        L_0x0029:
            r3.stop()     // Catch:{ Exception -> 0x0040 }
        L_0x002c:
            z5.r r6 = r5.f6855a     // Catch:{ all -> 0x006a }
            r6.mo43180g1(r3)     // Catch:{ all -> 0x006a }
            int r6 = r0.length     // Catch:{ all -> 0x006a }
            r7 = 1
            if (r6 != r7) goto L_0x0068
            java.util.logging.Logger r6 = f6853b     // Catch:{ all -> 0x006a }
            java.lang.String r7 = "No more connectors, stopping Jetty server"
            r6.info(r7)     // Catch:{ all -> 0x006a }
            r5.mo26723g()     // Catch:{ all -> 0x006a }
            goto L_0x0068
        L_0x0040:
            r6 = move-exception
            java.util.logging.Logger r7 = f6853b     // Catch:{ all -> 0x006a }
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
        throw new UnsupportedOperationException("Method not decompiled: p137c7.C4026a.mo26721e(java.lang.String, int):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo26722f() {
        C12187r rVar = new C12187r();
        this.f6855a = rVar;
        rVar.mo43182i1(1000);
    }

    /* renamed from: g */
    public synchronized void mo26723g() {
        if (!this.f6855a.isStopped() && !this.f6855a.mo36751w()) {
            f6853b.info("Stopping Jetty server...");
            try {
                this.f6855a.stop();
                mo26722f();
            } catch (Exception e) {
                Logger logger = f6853b;
                logger.severe("Couldn't stop Jetty server: " + e);
                throw new RuntimeException(e);
            } catch (Throwable th) {
                mo26722f();
                throw th;
            }
        }
    }
}
