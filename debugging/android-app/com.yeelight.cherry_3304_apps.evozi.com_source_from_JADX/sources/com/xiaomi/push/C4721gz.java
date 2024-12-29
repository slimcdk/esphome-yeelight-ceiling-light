package com.xiaomi.push;

import com.xiaomi.push.service.C4860ap;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.gz */
class C4721gz implements C4860ap.C4862b.C4863a {

    /* renamed from: a */
    private int f8928a;

    /* renamed from: a */
    private C4680fs f8929a;

    /* renamed from: a */
    private XMPushService f8930a;

    /* renamed from: a */
    private C4860ap.C4862b f8931a;

    /* renamed from: a */
    private C4860ap.C4866c f8932a;

    /* renamed from: a */
    private boolean f8933a = false;

    C4721gz(XMPushService xMPushService, C4860ap.C4862b bVar) {
        this.f8930a = xMPushService;
        this.f8932a = C4860ap.C4866c.binding;
        this.f8931a = bVar;
    }

    /* renamed from: b */
    private void m14487b() {
        this.f8931a.mo25934b(this);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m14488c() {
        /*
            r4 = this;
            r4.m14487b()
            boolean r0 = r4.f8933a
            if (r0 != 0) goto L_0x0008
            return
        L_0x0008:
            int r0 = r4.f8928a
            r1 = 11
            if (r0 != r1) goto L_0x000f
            return
        L_0x000f:
            com.xiaomi.push.he r0 = com.xiaomi.push.C4728he.mo25240a()
            com.xiaomi.push.fi r0 = r0.mo25240a()
            int[] r1 = com.xiaomi.push.C4724hb.f8936a
            com.xiaomi.push.service.ap$c r2 = r4.f8932a
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L_0x0031
            r3 = 3
            if (r1 == r3) goto L_0x0028
            goto L_0x005c
        L_0x0028:
            com.xiaomi.push.fh r1 = com.xiaomi.push.C4669fh.BIND_SUCCESS
        L_0x002a:
            int r1 = r1.mo25070a()
            r0.f8703a = r1
            goto L_0x005c
        L_0x0031:
            int r1 = r4.f8928a
            r3 = 17
            if (r1 != r3) goto L_0x003a
            com.xiaomi.push.fh r1 = com.xiaomi.push.C4669fh.BIND_TCP_READ_TIMEOUT
            goto L_0x002a
        L_0x003a:
            r3 = 21
            if (r1 != r3) goto L_0x0041
            com.xiaomi.push.fh r1 = com.xiaomi.push.C4669fh.BIND_TIMEOUT
            goto L_0x002a
        L_0x0041:
            com.xiaomi.push.hd r1 = com.xiaomi.push.C4728he.mo25240a()     // Catch:{ NullPointerException -> 0x005b }
            java.lang.Exception r1 = r1.mo25239a()     // Catch:{ NullPointerException -> 0x005b }
            com.xiaomi.push.hc$a r1 = com.xiaomi.push.C4725hc.m14499c(r1)     // Catch:{ NullPointerException -> 0x005b }
            com.xiaomi.push.fh r3 = r1.f8937a     // Catch:{ NullPointerException -> 0x005b }
            int r3 = r3.mo25070a()     // Catch:{ NullPointerException -> 0x005b }
            r0.f8703a = r3     // Catch:{ NullPointerException -> 0x005b }
            java.lang.String r1 = r1.f8938a     // Catch:{ NullPointerException -> 0x005b }
            r0.mo25084c((java.lang.String) r1)     // Catch:{ NullPointerException -> 0x005b }
            goto L_0x005c
        L_0x005b:
            r0 = 0
        L_0x005c:
            if (r0 == 0) goto L_0x0083
            com.xiaomi.push.fs r1 = r4.f8929a
            java.lang.String r1 = r1.mo25134a()
            r0.mo25079b((java.lang.String) r1)
            com.xiaomi.push.service.ap$b r1 = r4.f8931a
            java.lang.String r1 = r1.f9992b
            r0.mo25089d((java.lang.String) r1)
            r0.f8706b = r2
            com.xiaomi.push.service.ap$b r1 = r4.f8931a     // Catch:{ NumberFormatException -> 0x007c }
            java.lang.String r1 = r1.f9998g     // Catch:{ NumberFormatException -> 0x007c }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x007c }
            byte r1 = (byte) r1     // Catch:{ NumberFormatException -> 0x007c }
            r0.mo25072a((byte) r1)     // Catch:{ NumberFormatException -> 0x007c }
        L_0x007c:
            com.xiaomi.push.he r1 = com.xiaomi.push.C4728he.mo25240a()
            r1.mo25242a((com.xiaomi.push.C4670fi) r0)
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4721gz.m14488c():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo25237a() {
        this.f8931a.mo25932a((C4860ap.C4862b.C4863a) this);
        this.f8929a = this.f8930a.mo25867a();
    }

    /* renamed from: a */
    public void mo25238a(C4860ap.C4866c cVar, C4860ap.C4866c cVar2, int i) {
        if (!this.f8933a && cVar == C4860ap.C4866c.binding) {
            this.f8932a = cVar2;
            this.f8928a = i;
            this.f8933a = true;
        }
        this.f8930a.mo25871a((XMPushService.C4827i) new C4723ha(this, 4));
    }
}
