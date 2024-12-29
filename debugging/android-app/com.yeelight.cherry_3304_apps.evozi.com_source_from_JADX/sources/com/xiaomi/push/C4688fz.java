package com.xiaomi.push;

import android.os.SystemClock;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.service.XMPushService;
import java.io.IOException;
import java.net.Socket;

/* renamed from: com.xiaomi.push.fz */
public abstract class C4688fz extends C4680fs {

    /* renamed from: a */
    protected Exception f8785a = null;

    /* renamed from: a */
    protected Socket f8786a;

    /* renamed from: b */
    protected XMPushService f8787b;

    /* renamed from: c */
    private int f8788c;

    /* renamed from: c */
    String f8789c = null;

    /* renamed from: d */
    private String f8790d;

    /* renamed from: e */
    protected volatile long f8791e = 0;

    /* renamed from: f */
    protected volatile long f8792f = 0;

    /* renamed from: g */
    protected volatile long f8793g = 0;

    public C4688fz(XMPushService xMPushService, C4682ft ftVar) {
        super(xMPushService, ftVar);
        this.f8787b = xMPushService;
    }

    /* renamed from: a */
    private void m14332a(C4682ft ftVar) {
        m14333a(ftVar.mo25164c(), ftVar.mo25160a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d6, code lost:
        r1.f8793g = android.os.SystemClock.elapsedRealtime();
        com.xiaomi.channel.commonutils.logger.C3989b.m10669a("connected to " + r8 + " in " + r1.f8752a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00fa, code lost:
        r18 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x011c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x011d, code lost:
        r22 = r8;
        r9 = r12;
        r8 = r13;
        r20 = r14;
        r18 = r10;
        r14 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0128, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0129, code lost:
        r22 = r8;
        r9 = r12;
        r8 = r13;
        r20 = r14;
        r23 = r15;
        r18 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0275, code lost:
        if (android.text.TextUtils.equals(r5, com.xiaomi.push.C4521az.m13351a((android.content.Context) r1.f8787b)) == false) goto L_0x027c;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0128 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:10:0x0077] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0285 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0286  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m14333a(java.lang.String r25, int r26) {
        /*
            r24 = this;
            r1 = r24
            r0 = r25
            r2 = r26
            java.lang.String r3 = "\n"
            java.lang.String r4 = " err:"
            java.lang.String r5 = " port:"
            java.lang.String r6 = "SMACK: Could not connect to "
            java.lang.String r7 = "SMACK: Could not connect to:"
            r8 = 0
            r1.f8785a = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "get bucket for host : "
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            java.lang.Integer r9 = com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r9)
            int r9 = r9.intValue()
            com.xiaomi.push.cv r14 = r24.mo25148a((java.lang.String) r25)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            com.xiaomi.channel.commonutils.logger.C3989b.m10675a((java.lang.Integer) r9)
            r9 = 1
            if (r14 == 0) goto L_0x0043
            java.util.ArrayList r8 = r14.mo24865a((boolean) r9)
        L_0x0043:
            boolean r10 = r8.isEmpty()
            if (r10 == 0) goto L_0x004c
            r8.add(r0)
        L_0x004c:
            r10 = 0
            r1.f8793g = r10
            com.xiaomi.push.service.XMPushService r0 = r1.f8787b
            java.lang.String r15 = com.xiaomi.push.C4521az.m13351a((android.content.Context) r0)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.util.Iterator r8 = r8.iterator()
            r0 = 0
            r10 = 0
        L_0x0061:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0279
            java.lang.Object r0 = r8.next()
            r13 = r0
            java.lang.String r13 = (java.lang.String) r13
            long r16 = java.lang.System.currentTimeMillis()
            int r0 = r1.f8751a
            int r0 = r0 + r9
            r1.f8751a = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01a5, all -> 0x0128 }
            r0.<init>()     // Catch:{ Exception -> 0x011c, all -> 0x0128 }
            java.lang.String r11 = "begin to connect to "
            r0.append(r11)     // Catch:{ Exception -> 0x011c, all -> 0x0128 }
            r0.append(r13)     // Catch:{ Exception -> 0x011c, all -> 0x0128 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x011c, all -> 0x0128 }
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r0)     // Catch:{ Exception -> 0x011c, all -> 0x0128 }
            java.net.Socket r0 = r24.mo25134a()     // Catch:{ Exception -> 0x011c, all -> 0x0128 }
            r1.f8786a = r0     // Catch:{ Exception -> 0x011c, all -> 0x0128 }
            java.net.InetSocketAddress r0 = com.xiaomi.push.C4584cx.m13646a((java.lang.String) r13, (int) r2)     // Catch:{ Exception -> 0x011c, all -> 0x0128 }
            java.net.Socket r11 = r1.f8786a     // Catch:{ Exception -> 0x011c, all -> 0x0128 }
            r9 = 8000(0x1f40, float:1.121E-41)
            r11.connect(r0, r9)     // Catch:{ Exception -> 0x011c, all -> 0x0128 }
            java.lang.String r0 = "tcp connected"
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r0)     // Catch:{ Exception -> 0x011c, all -> 0x0128 }
            java.net.Socket r0 = r1.f8786a     // Catch:{ Exception -> 0x011c, all -> 0x0128 }
            r9 = 1
            r0.setTcpNoDelay(r9)     // Catch:{ Exception -> 0x011c, all -> 0x0128 }
            r1.f8790d = r13     // Catch:{ Exception -> 0x011c, all -> 0x0128 }
            r24.mo25134a()     // Catch:{ Exception -> 0x011c, all -> 0x0128 }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0110, all -> 0x0104 }
            long r10 = r10 - r16
            r1.f8752a = r10     // Catch:{ Exception -> 0x0110, all -> 0x0104 }
            r1.f8762b = r15     // Catch:{ Exception -> 0x0110, all -> 0x0104 }
            if (r14 == 0) goto L_0x00ce
            r18 = 0
            r20 = r10
            r10 = r14
            r11 = r13
            r22 = r8
            r9 = r12
            r8 = r13
            r12 = r20
            r20 = r14
            r23 = r15
            r14 = r18
            r10.mo24876b(r11, r12, r14)     // Catch:{ Exception -> 0x0100, all -> 0x00fe }
            goto L_0x00d6
        L_0x00ce:
            r22 = r8
            r9 = r12
            r8 = r13
            r20 = r14
            r23 = r15
        L_0x00d6:
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0100, all -> 0x00fe }
            r1.f8793g = r10     // Catch:{ Exception -> 0x0100, all -> 0x00fe }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0100, all -> 0x00fe }
            r0.<init>()     // Catch:{ Exception -> 0x0100, all -> 0x00fe }
            java.lang.String r10 = "connected to "
            r0.append(r10)     // Catch:{ Exception -> 0x0100, all -> 0x00fe }
            r0.append(r8)     // Catch:{ Exception -> 0x0100, all -> 0x00fe }
            java.lang.String r10 = " in "
            r0.append(r10)     // Catch:{ Exception -> 0x0100, all -> 0x00fe }
            long r10 = r1.f8752a     // Catch:{ Exception -> 0x0100, all -> 0x00fe }
            r0.append(r10)     // Catch:{ Exception -> 0x0100, all -> 0x00fe }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0100, all -> 0x00fe }
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r0)     // Catch:{ Exception -> 0x0100, all -> 0x00fe }
            r18 = 1
            goto L_0x027c
        L_0x00fe:
            r0 = move-exception
            goto L_0x010d
        L_0x0100:
            r0 = move-exception
            r14 = r23
            goto L_0x0118
        L_0x0104:
            r0 = move-exception
            r22 = r8
            r9 = r12
            r8 = r13
            r20 = r14
            r23 = r15
        L_0x010d:
            r18 = 1
            goto L_0x0133
        L_0x0110:
            r0 = move-exception
            r22 = r8
            r9 = r12
            r8 = r13
            r20 = r14
            r14 = r15
        L_0x0118:
            r18 = 1
            goto L_0x01af
        L_0x011c:
            r0 = move-exception
            r22 = r8
            r9 = r12
            r8 = r13
            r20 = r14
            r18 = r10
            r14 = r15
            goto L_0x01af
        L_0x0128:
            r0 = move-exception
            r22 = r8
            r9 = r12
            r8 = r13
            r20 = r14
            r23 = r15
            r18 = r10
        L_0x0133:
            java.lang.Exception r10 = new java.lang.Exception     // Catch:{ all -> 0x01a0 }
            java.lang.String r11 = "abnormal exception"
            r10.<init>(r11, r0)     // Catch:{ all -> 0x01a0 }
            r1.f8785a = r10     // Catch:{ all -> 0x01a0 }
            com.xiaomi.channel.commonutils.logger.C3989b.m10678a((java.lang.Throwable) r0)     // Catch:{ all -> 0x01a0 }
            if (r18 != 0) goto L_0x019b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.xiaomi.channel.commonutils.logger.C3989b.m10681d(r0)
            r9.append(r6)
            r9.append(r8)
            r9.append(r5)
            r9.append(r2)
            r9.append(r4)
            java.lang.Exception r0 = r1.f8785a
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r9.append(r0)
            r9.append(r3)
            java.lang.Exception r0 = r1.f8785a
            com.xiaomi.push.C4731hg.m14529a((java.lang.String) r8, (java.lang.Exception) r0)
            if (r20 == 0) goto L_0x018b
            long r10 = java.lang.System.currentTimeMillis()
            long r12 = r10 - r16
            r14 = 0
            java.lang.Exception r0 = r1.f8785a
            r10 = r20
            r11 = r8
            r16 = r0
            r10.mo24877b(r11, r12, r14, r16)
        L_0x018b:
            com.xiaomi.push.service.XMPushService r0 = r1.f8787b
            java.lang.String r0 = com.xiaomi.push.C4521az.m13351a((android.content.Context) r0)
            r14 = r23
            boolean r0 = android.text.TextUtils.equals(r14, r0)
            if (r0 != 0) goto L_0x019d
            goto L_0x027c
        L_0x019b:
            r14 = r23
        L_0x019d:
            r8 = r14
            goto L_0x020f
        L_0x01a0:
            r0 = move-exception
            r14 = r23
            goto L_0x021b
        L_0x01a5:
            r0 = move-exception
            r22 = r8
            r9 = r12
            r8 = r13
            r20 = r14
            r14 = r15
            r18 = r10
        L_0x01af:
            r1.f8785a = r0     // Catch:{ all -> 0x021a }
            if (r18 != 0) goto L_0x019d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.xiaomi.channel.commonutils.logger.C3989b.m10681d(r0)
            r9.append(r6)
            r9.append(r8)
            r9.append(r5)
            r9.append(r2)
            r9.append(r4)
            java.lang.Exception r0 = r1.f8785a
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r9.append(r0)
            r9.append(r3)
            java.lang.Exception r0 = r1.f8785a
            com.xiaomi.push.C4731hg.m14529a((java.lang.String) r8, (java.lang.Exception) r0)
            if (r20 == 0) goto L_0x0200
            long r10 = java.lang.System.currentTimeMillis()
            long r12 = r10 - r16
            r15 = 0
            java.lang.Exception r0 = r1.f8785a
            r10 = r20
            r11 = r8
            r8 = r14
            r14 = r15
            r16 = r0
            r10.mo24877b(r11, r12, r14, r16)
            goto L_0x0201
        L_0x0200:
            r8 = r14
        L_0x0201:
            com.xiaomi.push.service.XMPushService r0 = r1.f8787b
            java.lang.String r0 = com.xiaomi.push.C4521az.m13351a((android.content.Context) r0)
            boolean r0 = android.text.TextUtils.equals(r8, r0)
            if (r0 != 0) goto L_0x020f
            goto L_0x027c
        L_0x020f:
            r10 = r18
            r15 = r8
            r12 = r9
            r14 = r20
            r8 = r22
            r9 = 1
            goto L_0x0061
        L_0x021a:
            r0 = move-exception
        L_0x021b:
            if (r18 != 0) goto L_0x0278
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r7)
            r10.append(r8)
            java.lang.String r7 = r10.toString()
            com.xiaomi.channel.commonutils.logger.C3989b.m10681d(r7)
            r9.append(r6)
            r9.append(r8)
            r9.append(r5)
            r9.append(r2)
            r9.append(r4)
            java.lang.Exception r2 = r1.f8785a
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r9.append(r2)
            r9.append(r3)
            java.lang.Exception r2 = r1.f8785a
            com.xiaomi.push.C4731hg.m14529a((java.lang.String) r8, (java.lang.Exception) r2)
            if (r20 == 0) goto L_0x026a
            long r2 = java.lang.System.currentTimeMillis()
            long r12 = r2 - r16
            r2 = 0
            java.lang.Exception r4 = r1.f8785a
            r10 = r20
            r11 = r8
            r5 = r14
            r14 = r2
            r16 = r4
            r10.mo24877b(r11, r12, r14, r16)
            goto L_0x026b
        L_0x026a:
            r5 = r14
        L_0x026b:
            com.xiaomi.push.service.XMPushService r2 = r1.f8787b
            java.lang.String r2 = com.xiaomi.push.C4521az.m13351a((android.content.Context) r2)
            boolean r2 = android.text.TextUtils.equals(r5, r2)
            if (r2 != 0) goto L_0x0278
            goto L_0x027c
        L_0x0278:
            throw r0
        L_0x0279:
            r9 = r12
            r18 = r10
        L_0x027c:
            com.xiaomi.push.cz r0 = com.xiaomi.push.C4586cz.mo24892a()
            r0.mo24897c()
            if (r18 == 0) goto L_0x0286
            return
        L_0x0286:
            com.xiaomi.push.gd r0 = new com.xiaomi.push.gd
            java.lang.String r2 = r9.toString()
            r0.<init>((java.lang.String) r2)
            goto L_0x0291
        L_0x0290:
            throw r0
        L_0x0291:
            goto L_0x0290
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4688fz.m14333a(java.lang.String, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C4582cv mo25148a(String str) {
        C4582cv a = C4586cz.mo24892a().mo24890a(str, false);
        if (!a.mo24878b()) {
            C4716gv.m14467a((Runnable) new C4693gc(this, str));
        }
        return a;
    }

    /* renamed from: a */
    public String mo25134a() {
        return this.f8790d;
    }

    /* renamed from: a */
    public Socket m14336a() {
        return new Socket();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void m14337a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo25135a(int i, Exception exc) {
        if (mo25150b() != 2) {
            mo25145a(2, i, exc);
            this.f8756a = "";
            try {
                this.f8786a.close();
            } catch (Throwable unused) {
            }
            this.f8791e = 0;
            this.f8792f = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25166a(Exception exc) {
        if (SystemClock.elapsedRealtime() - this.f8793g < Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL) {
            if (C4521az.m13366b(this.f8787b)) {
                int i = this.f8788c + 1;
                this.f8788c = i;
                if (i >= 2) {
                    String a = mo25134a();
                    C3989b.m10669a("max short conn time reached, sink down current host:" + a);
                    mo25167a(a, 0, exc);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.f8788c = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25167a(String str, long j, Exception exc) {
        C4582cv a = C4586cz.mo24892a().mo24890a(C4682ft.mo25160a(), false);
        if (a != null) {
            a.mo24877b(str, j, 0, exc);
            C4586cz.mo24892a().mo24897c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo25140a(boolean z);

    /* renamed from: a */
    public void mo25141a(C4673fl[] flVarArr) {
        throw new C4694gd("Don't support send Blob");
    }

    /* renamed from: b */
    public void mo25151b(int i, Exception exc) {
        mo25135a(i, exc);
        if ((exc != null || i == 18) && this.f8793g != 0) {
            mo25166a(exc);
        }
    }

    /* renamed from: b */
    public void mo25154b(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        mo25140a(z);
        if (!z) {
            this.f8787b.mo25872a((XMPushService.C4827i) new C4691ga(this, 13, currentTimeMillis), 10000);
        }
    }

    /* renamed from: c */
    public String mo25155c() {
        return this.f8756a;
    }

    /* renamed from: c */
    public void mo25168c(int i, Exception exc) {
        this.f8787b.mo25871a((XMPushService.C4827i) new C4692gb(this, 2, i, exc));
    }

    /* renamed from: e */
    public synchronized void mo25157e() {
        try {
            if (!mo25155c()) {
                if (!mo25150b()) {
                    mo25145a(0, 0, (Exception) null);
                    m14332a(this.f8753a);
                    return;
                }
            }
            C3989b.m10669a("WARNING: current xmpp has connected");
        } catch (IOException e) {
            throw new C4694gd((Throwable) e);
        }
    }

    /* renamed from: f */
    public void mo25169f() {
        this.f8791e = SystemClock.elapsedRealtime();
    }

    /* renamed from: g */
    public void mo25170g() {
        this.f8792f = SystemClock.elapsedRealtime();
    }
}
