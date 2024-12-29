package com.xiaomi.push;

import android.content.Context;
import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.fg */
public class C4688fg implements C4715fz {

    /* renamed from: a */
    private int f8143a;

    /* renamed from: a */
    private long f8144a = 0;

    /* renamed from: a */
    C4711fw f8145a;

    /* renamed from: a */
    XMPushService f8146a;

    /* renamed from: a */
    private Exception f8147a;

    /* renamed from: a */
    private String f8148a;

    /* renamed from: b */
    private long f8149b = 0;

    /* renamed from: c */
    private long f8150c = 0;

    /* renamed from: d */
    private long f8151d = 0;

    /* renamed from: e */
    private long f8152e = 0;

    /* renamed from: f */
    private long f8153f = 0;

    C4688fg(XMPushService xMPushService) {
        this.f8146a = xMPushService;
        this.f8148a = "";
        m13827b();
        int myUid = Process.myUid();
        try {
            this.f8153f = TrafficStats.getUidRxBytes(myUid);
            this.f8152e = TrafficStats.getUidTxBytes(myUid);
        } catch (Exception e) {
            C4408b.m12464a("Failed to obtain traffic data during initialization: " + e);
            this.f8153f = -1;
            this.f8152e = -1;
        }
    }

    /* renamed from: b */
    private void m13827b() {
        this.f8149b = 0;
        this.f8151d = 0;
        this.f8144a = 0;
        this.f8150c = 0;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (C4551bj.m13000b(this.f8146a)) {
            this.f8144a = elapsedRealtime;
        }
        if (this.f8146a.mo29942c()) {
            this.f8150c = elapsedRealtime;
        }
    }

    /* renamed from: c */
    private synchronized void m13828c() {
        C4408b.m12482c("stat connpt = " + this.f8148a + " netDuration = " + this.f8149b + " ChannelDuration = " + this.f8151d + " channelConnectedTime = " + this.f8150c);
        C4681fa faVar = new C4681fa();
        faVar.f8115a = 0;
        faVar.mo29092a(C4679ez.CHANNEL_ONLINE_RATE.mo29089a());
        faVar.mo29093a(this.f8148a);
        faVar.mo29107d((int) (System.currentTimeMillis() / 1000));
        faVar.mo29097b((int) (this.f8149b / 1000));
        faVar.mo29102c((int) (this.f8151d / 1000));
        C4689fh.mo29139a().mo29141a(faVar);
        m13827b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Exception mo29134a() {
        return this.f8147a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0068, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m13830a() {
        /*
            r10 = this;
            monitor-enter(r10)
            com.xiaomi.push.service.XMPushService r0 = r10.f8146a     // Catch:{ all -> 0x0069 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r10)
            return
        L_0x0007:
            java.lang.String r0 = com.xiaomi.push.C4551bj.m12985a((android.content.Context) r0)     // Catch:{ all -> 0x0069 }
            com.xiaomi.push.service.XMPushService r1 = r10.f8146a     // Catch:{ all -> 0x0069 }
            boolean r1 = com.xiaomi.push.C4551bj.m13001c(r1)     // Catch:{ all -> 0x0069 }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0069 }
            long r4 = r10.f8144a     // Catch:{ all -> 0x0069 }
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0026
            long r8 = r10.f8149b     // Catch:{ all -> 0x0069 }
            long r4 = r2 - r4
            long r8 = r8 + r4
            r10.f8149b = r8     // Catch:{ all -> 0x0069 }
            r10.f8144a = r6     // Catch:{ all -> 0x0069 }
        L_0x0026:
            long r4 = r10.f8150c     // Catch:{ all -> 0x0069 }
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0035
            long r8 = r10.f8151d     // Catch:{ all -> 0x0069 }
            long r4 = r2 - r4
            long r8 = r8 + r4
            r10.f8151d = r8     // Catch:{ all -> 0x0069 }
            r10.f8150c = r6     // Catch:{ all -> 0x0069 }
        L_0x0035:
            if (r1 == 0) goto L_0x0067
            java.lang.String r1 = r10.f8148a     // Catch:{ all -> 0x0069 }
            boolean r1 = android.text.TextUtils.equals(r1, r0)     // Catch:{ all -> 0x0069 }
            if (r1 != 0) goto L_0x0047
            long r4 = r10.f8149b     // Catch:{ all -> 0x0069 }
            r8 = 30000(0x7530, double:1.4822E-319)
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 > 0) goto L_0x0050
        L_0x0047:
            long r4 = r10.f8149b     // Catch:{ all -> 0x0069 }
            r8 = 5400000(0x5265c0, double:2.6679545E-317)
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x0053
        L_0x0050:
            r10.m13828c()     // Catch:{ all -> 0x0069 }
        L_0x0053:
            r10.f8148a = r0     // Catch:{ all -> 0x0069 }
            long r0 = r10.f8144a     // Catch:{ all -> 0x0069 }
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x005d
            r10.f8144a = r2     // Catch:{ all -> 0x0069 }
        L_0x005d:
            com.xiaomi.push.service.XMPushService r0 = r10.f8146a     // Catch:{ all -> 0x0069 }
            boolean r0 = r0.mo29942c()     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0067
            r10.f8150c = r2     // Catch:{ all -> 0x0069 }
        L_0x0067:
            monitor-exit(r10)
            return
        L_0x0069:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4688fg.m13830a():void");
    }

    /* renamed from: a */
    public void mo29135a(C4711fw fwVar) {
        this.f8143a = 0;
        this.f8147a = null;
        this.f8145a = fwVar;
        this.f8148a = C4551bj.m12985a((Context) this.f8146a);
        C4692fj.m13850a(0, C4679ez.CONN_SUCCESS.mo29089a());
    }

    /* renamed from: a */
    public void mo29136a(C4711fw fwVar, int i, Exception exc) {
        long j;
        if (this.f8143a == 0 && this.f8147a == null) {
            this.f8143a = i;
            this.f8147a = exc;
            C4692fj.m13858b(fwVar.mo29170a(), exc);
        }
        if (i == 22 && this.f8150c != 0) {
            long a = fwVar.mo29170a() - this.f8150c;
            if (a < 0) {
                a = 0;
            }
            this.f8151d += a + ((long) (C4719gc.m13995b() / 2));
            this.f8150c = 0;
        }
        mo29134a();
        int myUid = Process.myUid();
        long j2 = -1;
        try {
            j2 = TrafficStats.getUidRxBytes(myUid);
            j = TrafficStats.getUidTxBytes(myUid);
        } catch (Exception e) {
            C4408b.m12464a("Failed to obtain traffic data: " + e);
            j = -1;
        }
        C4408b.m12482c("Stats rx=" + (j2 - this.f8153f) + ", tx=" + (j - this.f8152e));
        this.f8153f = j2;
        this.f8152e = j;
    }

    /* renamed from: a */
    public void mo29137a(C4711fw fwVar, Exception exc) {
        C4692fj.m13851a(0, C4679ez.CHANNEL_CON_FAIL.mo29089a(), 1, fwVar.mo29170a(), C4551bj.m13001c(this.f8146a) ? 1 : 0);
        mo29134a();
    }

    /* renamed from: b */
    public void mo29138b(C4711fw fwVar) {
        mo29134a();
        this.f8150c = SystemClock.elapsedRealtime();
        C4692fj.m13852a(0, C4679ez.CONN_SUCCESS.mo29089a(), fwVar.mo29170a(), fwVar.mo29170a());
    }
}
