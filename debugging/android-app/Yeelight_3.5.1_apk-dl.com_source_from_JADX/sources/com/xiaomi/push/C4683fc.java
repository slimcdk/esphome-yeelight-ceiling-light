package com.xiaomi.push;

import com.xiaomi.push.service.C4906bg;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.fc */
class C4683fc implements C4906bg.C4908b.C4909a {

    /* renamed from: a */
    private int f8133a;

    /* renamed from: a */
    private C4711fw f8134a;

    /* renamed from: a */
    private XMPushService f8135a;

    /* renamed from: a */
    private C4906bg.C4908b f8136a;

    /* renamed from: a */
    private C4906bg.C4912c f8137a;

    /* renamed from: a */
    private boolean f8138a = false;

    C4683fc(XMPushService xMPushService, C4906bg.C4908b bVar) {
        this.f8135a = xMPushService;
        this.f8137a = C4906bg.C4912c.binding;
        this.f8136a = bVar;
    }

    /* renamed from: b */
    private void m13816b() {
        this.f8136a.mo30019b(this);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m13817c() {
        /*
            r4 = this;
            r4.m13816b()
            boolean r0 = r4.f8138a
            if (r0 != 0) goto L_0x0008
            return
        L_0x0008:
            int r0 = r4.f8133a
            r1 = 11
            if (r0 != r1) goto L_0x000f
            return
        L_0x000f:
            com.xiaomi.push.fh r0 = com.xiaomi.push.C4689fh.mo29139a()
            com.xiaomi.push.fa r0 = r0.mo29139a()
            int[] r1 = com.xiaomi.push.C4685fe.f8140a
            com.xiaomi.push.service.bg$c r2 = r4.f8137a
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L_0x0031
            r3 = 3
            if (r1 == r3) goto L_0x0028
            goto L_0x005c
        L_0x0028:
            com.xiaomi.push.ez r1 = com.xiaomi.push.C4679ez.BIND_SUCCESS
        L_0x002a:
            int r1 = r1.mo29089a()
            r0.f8116a = r1
            goto L_0x005c
        L_0x0031:
            int r1 = r4.f8133a
            r3 = 17
            if (r1 != r3) goto L_0x003a
            com.xiaomi.push.ez r1 = com.xiaomi.push.C4679ez.BIND_TCP_READ_TIMEOUT
            goto L_0x002a
        L_0x003a:
            r3 = 21
            if (r1 != r3) goto L_0x0041
            com.xiaomi.push.ez r1 = com.xiaomi.push.C4679ez.BIND_TIMEOUT
            goto L_0x002a
        L_0x0041:
            com.xiaomi.push.fg r1 = com.xiaomi.push.C4689fh.mo29139a()     // Catch:{ NullPointerException -> 0x005b }
            java.lang.Exception r1 = r1.mo29134a()     // Catch:{ NullPointerException -> 0x005b }
            com.xiaomi.push.ff$a r1 = com.xiaomi.push.C4686ff.m13825c(r1)     // Catch:{ NullPointerException -> 0x005b }
            com.xiaomi.push.ez r3 = r1.f8141a     // Catch:{ NullPointerException -> 0x005b }
            int r3 = r3.mo29089a()     // Catch:{ NullPointerException -> 0x005b }
            r0.f8116a = r3     // Catch:{ NullPointerException -> 0x005b }
            java.lang.String r1 = r1.f8142a     // Catch:{ NullPointerException -> 0x005b }
            r0.mo29103c((java.lang.String) r1)     // Catch:{ NullPointerException -> 0x005b }
            goto L_0x005c
        L_0x005b:
            r0 = 0
        L_0x005c:
            if (r0 == 0) goto L_0x0083
            com.xiaomi.push.fw r1 = r4.f8134a
            java.lang.String r1 = r1.mo29170a()
            r0.mo29098b((java.lang.String) r1)
            com.xiaomi.push.service.bg$b r1 = r4.f8136a
            java.lang.String r1 = r1.f9541b
            r0.mo29108d((java.lang.String) r1)
            r0.f8119b = r2
            com.xiaomi.push.service.bg$b r1 = r4.f8136a     // Catch:{ NumberFormatException -> 0x007c }
            java.lang.String r1 = r1.f9547g     // Catch:{ NumberFormatException -> 0x007c }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x007c }
            byte r1 = (byte) r1     // Catch:{ NumberFormatException -> 0x007c }
            r0.mo29091a((byte) r1)     // Catch:{ NumberFormatException -> 0x007c }
        L_0x007c:
            com.xiaomi.push.fh r1 = com.xiaomi.push.C4689fh.mo29139a()
            r1.mo29141a((com.xiaomi.push.C4681fa) r0)
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4683fc.m13817c():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo29131a() {
        this.f8136a.mo30017a((C4906bg.C4908b.C4909a) this);
        this.f8134a = this.f8135a.mo29927a();
    }

    /* renamed from: a */
    public void mo29132a(C4906bg.C4912c cVar, C4906bg.C4912c cVar2, int i) {
        if (!this.f8138a && cVar == C4906bg.C4912c.binding) {
            this.f8137a = cVar2;
            this.f8133a = i;
            this.f8138a = true;
        }
        this.f8135a.mo29931a((XMPushService.C4849j) new C4684fd(this, 4));
    }
}
