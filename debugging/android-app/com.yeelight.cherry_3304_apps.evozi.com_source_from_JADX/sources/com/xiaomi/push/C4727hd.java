package com.xiaomi.push;

import android.content.Context;
import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.hd */
public class C4727hd implements C4684fv {

    /* renamed from: a */
    private int f8939a;

    /* renamed from: a */
    private long f8940a = 0;

    /* renamed from: a */
    C4680fs f8941a;

    /* renamed from: a */
    XMPushService f8942a;

    /* renamed from: a */
    private Exception f8943a;

    /* renamed from: a */
    private String f8944a;

    /* renamed from: b */
    private long f8945b = 0;

    /* renamed from: c */
    private long f8946c = 0;

    /* renamed from: d */
    private long f8947d = 0;

    /* renamed from: e */
    private long f8948e = 0;

    /* renamed from: f */
    private long f8949f = 0;

    C4727hd(XMPushService xMPushService) {
        this.f8942a = xMPushService;
        this.f8944a = "";
        m14501b();
        int myUid = Process.myUid();
        try {
            this.f8949f = TrafficStats.getUidRxBytes(myUid);
            this.f8948e = TrafficStats.getUidTxBytes(myUid);
        } catch (Exception e) {
            C3989b.m10669a("Failed to obtain traffic data during initialization: " + e);
            this.f8949f = -1;
            this.f8948e = -1;
        }
    }

    /* renamed from: b */
    private void m14501b() {
        this.f8945b = 0;
        this.f8947d = 0;
        this.f8940a = 0;
        this.f8946c = 0;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (C4521az.m13366b(this.f8942a)) {
            this.f8940a = elapsedRealtime;
        }
        if (this.f8942a.mo25882c()) {
            this.f8946c = elapsedRealtime;
        }
    }

    /* renamed from: c */
    private synchronized void m14502c() {
        C3989b.m10680c("stat connpt = " + this.f8944a + " netDuration = " + this.f8945b + " ChannelDuration = " + this.f8947d + " channelConnectedTime = " + this.f8946c);
        C4670fi fiVar = new C4670fi();
        fiVar.f8702a = 0;
        fiVar.mo25073a(C4669fh.CHANNEL_ONLINE_RATE.mo25070a());
        fiVar.mo25074a(this.f8944a);
        fiVar.mo25088d((int) (System.currentTimeMillis() / 1000));
        fiVar.mo25078b((int) (this.f8945b / 1000));
        fiVar.mo25083c((int) (this.f8947d / 1000));
        C4728he.mo25240a().mo25242a(fiVar);
        m14501b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Exception mo25239a() {
        return this.f8943a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m14504a() {
        /*
            r10 = this;
            monitor-enter(r10)
            com.xiaomi.push.service.XMPushService r0 = r10.f8942a     // Catch:{ all -> 0x006f }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r10)
            return
        L_0x0007:
            com.xiaomi.push.service.XMPushService r0 = r10.f8942a     // Catch:{ all -> 0x006f }
            java.lang.String r0 = com.xiaomi.push.C4521az.m13351a((android.content.Context) r0)     // Catch:{ all -> 0x006f }
            com.xiaomi.push.service.XMPushService r1 = r10.f8942a     // Catch:{ all -> 0x006f }
            boolean r1 = com.xiaomi.push.C4521az.m13366b(r1)     // Catch:{ all -> 0x006f }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x006f }
            long r4 = r10.f8940a     // Catch:{ all -> 0x006f }
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x002a
            long r4 = r10.f8945b     // Catch:{ all -> 0x006f }
            long r8 = r10.f8940a     // Catch:{ all -> 0x006f }
            long r8 = r2 - r8
            long r4 = r4 + r8
            r10.f8945b = r4     // Catch:{ all -> 0x006f }
            r10.f8940a = r6     // Catch:{ all -> 0x006f }
        L_0x002a:
            long r4 = r10.f8946c     // Catch:{ all -> 0x006f }
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x003b
            long r4 = r10.f8947d     // Catch:{ all -> 0x006f }
            long r8 = r10.f8946c     // Catch:{ all -> 0x006f }
            long r8 = r2 - r8
            long r4 = r4 + r8
            r10.f8947d = r4     // Catch:{ all -> 0x006f }
            r10.f8946c = r6     // Catch:{ all -> 0x006f }
        L_0x003b:
            if (r1 == 0) goto L_0x006d
            java.lang.String r1 = r10.f8944a     // Catch:{ all -> 0x006f }
            boolean r1 = android.text.TextUtils.equals(r1, r0)     // Catch:{ all -> 0x006f }
            if (r1 != 0) goto L_0x004d
            long r4 = r10.f8945b     // Catch:{ all -> 0x006f }
            r8 = 30000(0x7530, double:1.4822E-319)
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 > 0) goto L_0x0056
        L_0x004d:
            long r4 = r10.f8945b     // Catch:{ all -> 0x006f }
            r8 = 5400000(0x5265c0, double:2.6679545E-317)
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x0059
        L_0x0056:
            r10.m14502c()     // Catch:{ all -> 0x006f }
        L_0x0059:
            r10.f8944a = r0     // Catch:{ all -> 0x006f }
            long r0 = r10.f8940a     // Catch:{ all -> 0x006f }
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0063
            r10.f8940a = r2     // Catch:{ all -> 0x006f }
        L_0x0063:
            com.xiaomi.push.service.XMPushService r0 = r10.f8942a     // Catch:{ all -> 0x006f }
            boolean r0 = r0.mo25882c()     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x006d
            r10.f8946c = r2     // Catch:{ all -> 0x006f }
        L_0x006d:
            monitor-exit(r10)
            return
        L_0x006f:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4727hd.m14504a():void");
    }

    /* renamed from: a */
    public void mo24779a(C4680fs fsVar) {
        mo25239a();
        this.f8946c = SystemClock.elapsedRealtime();
        C4731hg.m14526a(0, C4669fh.CONN_SUCCESS.mo25070a(), fsVar.mo25134a(), fsVar.mo25134a());
    }

    /* renamed from: a */
    public void mo24780a(C4680fs fsVar, int i, Exception exc) {
        long j;
        if (this.f8939a == 0 && this.f8943a == null) {
            this.f8939a = i;
            this.f8943a = exc;
            C4731hg.m14532b(fsVar.mo25134a(), exc);
        }
        if (i == 22 && this.f8946c != 0) {
            long a = fsVar.mo25134a() - this.f8946c;
            if (a < 0) {
                a = 0;
            }
            this.f8947d += a + ((long) (C4687fy.m14331b() / 2));
            this.f8946c = 0;
        }
        mo25239a();
        int myUid = Process.myUid();
        long j2 = -1;
        try {
            j2 = TrafficStats.getUidRxBytes(myUid);
            j = TrafficStats.getUidTxBytes(myUid);
        } catch (Exception e) {
            C3989b.m10669a("Failed to obtain traffic data: " + e);
            j = -1;
        }
        C3989b.m10680c("Stats rx=" + (j2 - this.f8949f) + ", tx=" + (j - this.f8948e));
        this.f8949f = j2;
        this.f8948e = j;
    }

    /* renamed from: a */
    public void mo24781a(C4680fs fsVar, Exception exc) {
        C4731hg.m14525a(0, C4669fh.CHANNEL_CON_FAIL.mo25070a(), 1, fsVar.mo25134a(), C4521az.m13366b(this.f8942a) ? 1 : 0);
        mo25239a();
    }

    /* renamed from: b */
    public void mo24782b(C4680fs fsVar) {
        this.f8939a = 0;
        this.f8943a = null;
        this.f8941a = fsVar;
        this.f8944a = C4521az.m13351a((Context) this.f8942a);
        C4731hg.m14524a(0, C4669fh.CONN_SUCCESS.mo25070a());
    }
}
