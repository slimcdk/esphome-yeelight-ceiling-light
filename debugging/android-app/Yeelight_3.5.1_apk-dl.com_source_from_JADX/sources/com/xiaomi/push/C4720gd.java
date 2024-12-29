package com.xiaomi.push;

import android.content.Context;
import android.os.SystemClock;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.service.C4972o;
import com.xiaomi.push.service.XMPushService;
import java.io.IOException;
import java.net.Socket;

/* renamed from: com.xiaomi.push.gd */
public abstract class C4720gd extends C4711fw {

    /* renamed from: a */
    protected Exception f8253a = null;

    /* renamed from: a */
    protected Socket f8254a;

    /* renamed from: b */
    protected XMPushService f8255b;

    /* renamed from: c */
    private int f8256c;

    /* renamed from: c */
    String f8257c = null;

    /* renamed from: d */
    private String f8258d;

    /* renamed from: e */
    protected volatile long f8259e = 0;

    /* renamed from: f */
    protected volatile long f8260f = 0;

    /* renamed from: g */
    protected volatile long f8261g = 0;

    /* renamed from: h */
    private long f8262h = 0;

    public C4720gd(XMPushService xMPushService, C4713fx fxVar) {
        super(xMPushService, fxVar);
        this.f8255b = xMPushService;
    }

    /* renamed from: a */
    private void m13996a(C4713fx fxVar) {
        m13997a(fxVar.mo29201c(), fxVar.mo29197a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x033b  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0260 A[EDGE_INSN: B:92:0x0260->B:60:0x0260 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0260 A[EDGE_INSN: B:94:0x0260->B:60:0x0260 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0264 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m13997a(java.lang.String r32, int r33) {
        /*
            r31 = this;
            r1 = r31
            r0 = r32
            r2 = r33
            java.lang.String r3 = "|"
            java.lang.String r4 = "\n"
            java.lang.String r5 = " err:"
            java.lang.String r6 = " port:"
            java.lang.String r7 = "SMACK: Could not connect to "
            java.lang.String r8 = "SMACK: Could not connect to:"
            r9 = 0
            r1.f8253a = r9
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "get bucket for host : "
            r10.append(r11)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            java.lang.Integer r10 = com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r10)
            int r10 = r10.intValue()
            com.xiaomi.push.cr r15 = r31.mo29186a((java.lang.String) r32)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            com.xiaomi.channel.commonutils.logger.C4408b.m12474a((java.lang.Integer) r10)
            r10 = 1
            if (r15 == 0) goto L_0x0045
            java.util.ArrayList r9 = r15.mo28854a((boolean) r10)
        L_0x0045:
            com.xiaomi.push.cv r11 = com.xiaomi.push.C4600cv.mo28881a()
            com.xiaomi.push.cr r11 = r11.mo28887d(r0)
            if (r11 == 0) goto L_0x006e
            java.util.ArrayList r11 = r11.mo28854a((boolean) r10)
            java.util.Iterator r11 = r11.iterator()
        L_0x0057:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x006e
            java.lang.Object r12 = r11.next()
            java.lang.String r12 = (java.lang.String) r12
            int r13 = r9.indexOf(r12)
            r14 = -1
            if (r13 != r14) goto L_0x0057
            r9.add(r12)
            goto L_0x0057
        L_0x006e:
            boolean r11 = r9.isEmpty()
            if (r11 == 0) goto L_0x0077
            r9.add(r0)
        L_0x0077:
            r13 = 0
            r1.f8261g = r13
            long r18 = android.os.SystemClock.elapsedRealtime()
            com.xiaomi.push.service.XMPushService r0 = r1.f8255b
            java.lang.String r12 = com.xiaomi.push.C4551bj.m12985a((android.content.Context) r0)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.util.Iterator r9 = r9.iterator()
            java.lang.String r0 = ""
            r32 = r0
            r0 = 0
        L_0x0093:
            boolean r16 = r9.hasNext()
            if (r16 == 0) goto L_0x02eb
            java.lang.Object r16 = r9.next()
            r10 = r16
            java.lang.String r10 = (java.lang.String) r10
            long r21 = java.lang.System.currentTimeMillis()
            int r13 = r1.f8218a
            r14 = 1
            int r13 = r13 + r14
            r1.f8218a = r13
            int r23 = r0 + 1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01da, all -> 0x0142 }
            r0.<init>()     // Catch:{ Exception -> 0x01da, all -> 0x0142 }
            java.lang.String r13 = "begin to connect to "
            r0.append(r13)     // Catch:{ Exception -> 0x01da, all -> 0x0142 }
            r0.append(r10)     // Catch:{ Exception -> 0x01da, all -> 0x0142 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01da, all -> 0x0142 }
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r0)     // Catch:{ Exception -> 0x01da, all -> 0x0142 }
            java.net.Socket r0 = r31.mo29170a()     // Catch:{ Exception -> 0x01da, all -> 0x0142 }
            r1.f8254a = r0     // Catch:{ Exception -> 0x01da, all -> 0x0142 }
            java.net.InetSocketAddress r0 = com.xiaomi.push.C4598ct.m13220a((java.lang.String) r10, (int) r2)     // Catch:{ Exception -> 0x01da, all -> 0x0142 }
            java.net.Socket r13 = r1.f8254a     // Catch:{ Exception -> 0x01da, all -> 0x0142 }
            r14 = 8000(0x1f40, float:1.121E-41)
            r13.connect(r0, r14)     // Catch:{ Exception -> 0x01da, all -> 0x0142 }
            java.lang.String r0 = "tcp connected"
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r0)     // Catch:{ Exception -> 0x01da, all -> 0x0142 }
            java.net.Socket r0 = r1.f8254a     // Catch:{ Exception -> 0x01da, all -> 0x0142 }
            r13 = 1
            r0.setTcpNoDelay(r13)     // Catch:{ Exception -> 0x01da, all -> 0x0142 }
            r1.f8258d = r10     // Catch:{ Exception -> 0x01da, all -> 0x0142 }
            r31.mo29170a()     // Catch:{ Exception -> 0x01da, all -> 0x0142 }
            long r24 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01da, all -> 0x0142 }
            long r13 = r24 - r21
            r1.f8219a = r13     // Catch:{ Exception -> 0x01da, all -> 0x0142 }
            r1.f8229b = r12     // Catch:{ Exception -> 0x01da, all -> 0x0142 }
            if (r15 == 0) goto L_0x0103
            r24 = 0
            r26 = r9
            r9 = r11
            r11 = r15
            r27 = r12
            r12 = r10
            r20 = 1
            r28 = 0
            r30 = r15
            r15 = r24
            r11.mo28865b(r12, r13, r15)     // Catch:{ Exception -> 0x013b, all -> 0x0139 }
            goto L_0x010e
        L_0x0103:
            r26 = r9
            r9 = r11
            r27 = r12
            r30 = r15
            r20 = 1
            r28 = 0
        L_0x010e:
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x013b, all -> 0x0139 }
            r1.f8261g = r11     // Catch:{ Exception -> 0x013b, all -> 0x0139 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x013b, all -> 0x0139 }
            r0.<init>()     // Catch:{ Exception -> 0x013b, all -> 0x0139 }
            java.lang.String r11 = "connected to "
            r0.append(r11)     // Catch:{ Exception -> 0x013b, all -> 0x0139 }
            r0.append(r10)     // Catch:{ Exception -> 0x013b, all -> 0x0139 }
            java.lang.String r11 = " in "
            r0.append(r11)     // Catch:{ Exception -> 0x013b, all -> 0x0139 }
            long r11 = r1.f8219a     // Catch:{ Exception -> 0x013b, all -> 0x0139 }
            r0.append(r11)     // Catch:{ Exception -> 0x013b, all -> 0x0139 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x013b, all -> 0x0139 }
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r0)     // Catch:{ Exception -> 0x013b, all -> 0x0139 }
            r0 = r32
            r2 = r23
            r10 = 1
            goto L_0x02f3
        L_0x0139:
            r0 = move-exception
            goto L_0x014e
        L_0x013b:
            r0 = move-exception
            r11 = r32
            r15 = r27
            goto L_0x01e7
        L_0x0142:
            r0 = move-exception
            r26 = r9
            r9 = r11
            r27 = r12
            r30 = r15
            r20 = 1
            r28 = 0
        L_0x014e:
            java.lang.Exception r11 = new java.lang.Exception     // Catch:{ all -> 0x01d3 }
            java.lang.String r12 = "abnormal exception"
            r11.<init>(r12, r0)     // Catch:{ all -> 0x01d3 }
            r1.f8253a = r11     // Catch:{ all -> 0x01d3 }
            com.xiaomi.channel.commonutils.logger.C4408b.m12478a((java.lang.Throwable) r0)     // Catch:{ all -> 0x01d3 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12483d(r0)
            r9.append(r7)
            r9.append(r10)
            r9.append(r6)
            r9.append(r2)
            r9.append(r5)
            java.lang.Exception r0 = r1.f8253a
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r9.append(r0)
            r9.append(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r32)
            if (r0 == 0) goto L_0x0193
            r0 = r10
            goto L_0x01a7
        L_0x0193:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r11 = r32
            r0.append(r11)
            r0.append(r3)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
        L_0x01a7:
            java.lang.Exception r11 = r1.f8253a
            com.xiaomi.push.C4692fj.m13855a((java.lang.String) r10, (java.lang.Exception) r11)
            if (r30 == 0) goto L_0x01c0
            long r11 = java.lang.System.currentTimeMillis()
            long r13 = r11 - r21
            r15 = 0
            java.lang.Exception r12 = r1.f8253a
            r11 = r30
            r17 = r12
            r12 = r10
            r11.mo28866b(r12, r13, r15, r17)
        L_0x01c0:
            com.xiaomi.push.service.XMPushService r10 = r1.f8255b
            java.lang.String r10 = com.xiaomi.push.C4551bj.m12985a((android.content.Context) r10)
            r15 = r27
            boolean r10 = android.text.TextUtils.equals(r15, r10)
            if (r10 != 0) goto L_0x01d0
            goto L_0x0260
        L_0x01d0:
            r10 = r15
            goto L_0x0264
        L_0x01d3:
            r0 = move-exception
            r11 = r32
            r15 = r27
            goto L_0x0273
        L_0x01da:
            r0 = move-exception
            r26 = r9
            r9 = r11
            r30 = r15
            r20 = 1
            r28 = 0
            r11 = r32
            r15 = r12
        L_0x01e7:
            r1.f8253a = r0     // Catch:{ all -> 0x0272 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12483d(r0)
            r9.append(r7)
            r9.append(r10)
            r9.append(r6)
            r9.append(r2)
            r9.append(r5)
            java.lang.Exception r0 = r1.f8253a
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r9.append(r0)
            r9.append(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto L_0x0222
            r0 = r10
            goto L_0x0234
        L_0x0222:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r0.append(r3)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
        L_0x0234:
            java.lang.Exception r11 = r1.f8253a
            com.xiaomi.push.C4692fj.m13855a((java.lang.String) r10, (java.lang.Exception) r11)
            if (r30 == 0) goto L_0x0253
            long r11 = java.lang.System.currentTimeMillis()
            long r13 = r11 - r21
            r16 = 0
            java.lang.Exception r12 = r1.f8253a
            r11 = r30
            r21 = r12
            r12 = r10
            r10 = r15
            r15 = r16
            r17 = r21
            r11.mo28866b(r12, r13, r15, r17)
            goto L_0x0254
        L_0x0253:
            r10 = r15
        L_0x0254:
            com.xiaomi.push.service.XMPushService r11 = r1.f8255b
            java.lang.String r11 = com.xiaomi.push.C4551bj.m12985a((android.content.Context) r11)
            boolean r11 = android.text.TextUtils.equals(r10, r11)
            if (r11 != 0) goto L_0x0264
        L_0x0260:
            r2 = r23
            goto L_0x02f2
        L_0x0264:
            r32 = r0
            r11 = r9
            r12 = r10
            r0 = r23
            r9 = r26
            r13 = r28
            r15 = r30
            goto L_0x0093
        L_0x0272:
            r0 = move-exception
        L_0x0273:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r8)
            r12.append(r10)
            java.lang.String r8 = r12.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12483d(r8)
            r9.append(r7)
            r9.append(r10)
            r9.append(r6)
            r9.append(r2)
            r9.append(r5)
            java.lang.Exception r2 = r1.f8253a
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r9.append(r2)
            r9.append(r4)
            boolean r2 = android.text.TextUtils.isEmpty(r11)
            if (r2 == 0) goto L_0x02ac
            r2 = r10
            goto L_0x02be
        L_0x02ac:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            r2.append(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
        L_0x02be:
            java.lang.Exception r3 = r1.f8253a
            com.xiaomi.push.C4692fj.m13855a((java.lang.String) r10, (java.lang.Exception) r3)
            if (r30 == 0) goto L_0x02da
            long r3 = java.lang.System.currentTimeMillis()
            long r13 = r3 - r21
            r3 = 0
            java.lang.Exception r5 = r1.f8253a
            r11 = r30
            r12 = r10
            r6 = r15
            r15 = r3
            r17 = r5
            r11.mo28866b(r12, r13, r15, r17)
            goto L_0x02db
        L_0x02da:
            r6 = r15
        L_0x02db:
            com.xiaomi.push.service.XMPushService r3 = r1.f8255b
            java.lang.String r3 = com.xiaomi.push.C4551bj.m12985a((android.content.Context) r3)
            boolean r3 = android.text.TextUtils.equals(r6, r3)
            if (r3 != 0) goto L_0x02ea
            r0 = r2
            goto L_0x0260
        L_0x02ea:
            throw r0
        L_0x02eb:
            r9 = r11
            r28 = r13
            r11 = r32
            r2 = r0
            r0 = r11
        L_0x02f2:
            r10 = 0
        L_0x02f3:
            com.xiaomi.push.cv r3 = com.xiaomi.push.C4600cv.mo28881a()
            r3.mo28886c()
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r18
            int r4 = (int) r3
            if (r10 != 0) goto L_0x033b
            long r2 = r1.f8262h
            int r5 = (r2 > r28 ? 1 : (r2 == r28 ? 0 : -1))
            if (r5 == 0) goto L_0x0317
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r5 = r1.f8262h
            long r2 = r2 - r5
            r5 = 480000(0x75300, double:2.371515E-318)
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0331
        L_0x0317:
            long r2 = android.os.SystemClock.elapsedRealtime()
            r1.f8262h = r2
            com.xiaomi.push.service.XMPushService r2 = r1.f8255b
            android.content.Context r2 = r2.getApplicationContext()
            boolean r2 = com.xiaomi.push.C4551bj.m13001c(r2)
            com.xiaomi.push.ez r3 = com.xiaomi.push.C4679ez.BATCH_TCP_CONN_FAIL
            int r3 = r3.mo29089a()
            r5 = 0
            com.xiaomi.push.C4692fj.m13851a(r5, r3, r4, r0, r2)
        L_0x0331:
            com.xiaomi.push.gh r0 = new com.xiaomi.push.gh
            java.lang.String r2 = r9.toString()
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x033b:
            r5 = 0
            com.xiaomi.push.ez r3 = com.xiaomi.push.C4679ez.BATCH_TCP_CONN_SUCCESS
            int r3 = r3.mo29089a()
            com.xiaomi.push.C4692fj.m13851a(r5, r3, r4, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4720gd.m13997a(java.lang.String, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C4596cr mo29186a(String str) {
        C4596cr a = C4600cv.mo28881a().mo28879a(str, false);
        if (!a.mo28867b()) {
            C4746gz.m14121a((Runnable) new C4723gg(this, str));
        }
        return a;
    }

    /* renamed from: a */
    public String mo29170a() {
        return this.f8258d;
    }

    /* renamed from: a */
    public Socket m14000a() {
        return new Socket();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void m14001a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo29171a(int i, Exception exc) {
        if (mo29188b() != 2) {
            mo29183a(2, i, exc);
            this.f8223a = "";
            try {
                this.f8254a.close();
            } catch (Throwable unused) {
            }
            this.f8259e = 0;
            this.f8260f = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29203a(Exception exc) {
        if (SystemClock.elapsedRealtime() - this.f8261g < Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL) {
            if (C4551bj.m13000b(this.f8255b)) {
                int i = this.f8256c + 1;
                this.f8256c = i;
                if (i >= 2) {
                    String a = mo29170a();
                    C4408b.m12464a("max short conn time reached, sink down current host:" + a);
                    mo29204a(a, 0, exc);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.f8256c = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29204a(String str, long j, Exception exc) {
        C4596cr a = C4600cv.mo28881a().mo28879a(C4713fx.mo29197a(), false);
        if (a != null) {
            a.mo28866b(str, j, 0, exc);
            C4600cv.mo28881a().mo28886c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo29176a(boolean z);

    /* renamed from: a */
    public void mo29177a(C4695fl[] flVarArr) {
        throw new C4724gh("Don't support send Blob");
    }

    /* renamed from: b */
    public void mo29189b(int i, Exception exc) {
        mo29171a(i, exc);
        if ((exc != null || i == 18) && this.f8261g != 0) {
            mo29203a(exc);
        }
    }

    /* renamed from: b */
    public void mo29192b(boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long currentTimeMillis = System.currentTimeMillis();
        mo29176a(z);
        C4972o.m15587a((Context) this.f8255b).mo30061c();
        if (!z) {
            this.f8255b.mo29932a((XMPushService.C4849j) new C4721ge(this, 13, elapsedRealtime, currentTimeMillis), 10000);
        }
    }

    /* renamed from: c */
    public String mo29193c() {
        return this.f8223a;
    }

    /* renamed from: c */
    public void mo29205c(int i, Exception exc) {
        this.f8255b.mo29931a((XMPushService.C4849j) new C4722gf(this, 2, i, exc));
    }

    /* renamed from: e */
    public synchronized void mo29206e() {
        try {
            if (!mo29193c()) {
                if (!mo29188b()) {
                    mo29183a(0, 0, (Exception) null);
                    m13996a(this.f8220a);
                    return;
                }
            }
            C4408b.m12464a("WARNING: current xmpp has connected");
        } catch (IOException e) {
            throw new C4724gh((Throwable) e);
        }
    }

    /* renamed from: f */
    public void mo29207f() {
        this.f8259e = SystemClock.elapsedRealtime();
    }

    /* renamed from: g */
    public void mo29208g() {
        this.f8260f = SystemClock.elapsedRealtime();
    }
}
