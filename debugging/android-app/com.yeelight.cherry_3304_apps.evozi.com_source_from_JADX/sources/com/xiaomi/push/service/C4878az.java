package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4728he;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.az */
class C4878az {

    /* renamed from: d */
    private static int f10064d = 300000;

    /* renamed from: a */
    private int f10065a;

    /* renamed from: a */
    private long f10066a;

    /* renamed from: a */
    private XMPushService f10067a;

    /* renamed from: b */
    private int f10068b = 0;

    /* renamed from: c */
    private int f10069c = 0;

    public C4878az(XMPushService xMPushService) {
        this.f10067a = xMPushService;
        this.f10065a = 500;
        this.f10066a = 0;
    }

    /* renamed from: a */
    private int mo25940a() {
        if (this.f10068b > 8) {
            return 300000;
        }
        double random = (Math.random() * 2.0d) + 1.0d;
        int i = this.f10068b;
        if (i > 4) {
            return (int) (random * 60000.0d);
        }
        if (i > 1) {
            return (int) (random * 10000.0d);
        }
        if (this.f10066a == 0) {
            return 0;
        }
        if (System.currentTimeMillis() - this.f10066a < 310000) {
            int i2 = this.f10065a;
            int i3 = f10064d;
            if (i2 >= i3) {
                return i2;
            }
            int i4 = this.f10069c + 1;
            this.f10069c = i4;
            if (i4 >= 4) {
                return i3;
            }
            double d = (double) i2;
            Double.isNaN(d);
            this.f10065a = (int) (d * 1.5d);
            return i2;
        }
        this.f10065a = 1000;
        this.f10069c = 0;
        return 0;
    }

    /* renamed from: a */
    public void m15658a() {
        this.f10066a = System.currentTimeMillis();
        this.f10067a.mo25868a(1);
        this.f10068b = 0;
    }

    /* renamed from: a */
    public void mo25941a(boolean z) {
        if (!this.f10067a.mo25867a()) {
            C3989b.m10680c("should not reconnect as no client or network.");
        } else if (z) {
            if (!this.f10067a.mo25868a(1)) {
                this.f10068b++;
            }
            this.f10067a.mo25868a(1);
            XMPushService xMPushService = this.f10067a;
            xMPushService.getClass();
            xMPushService.mo25871a((XMPushService.C4827i) new XMPushService.C4822d());
        } else if (!this.f10067a.mo25868a(1)) {
            int a = mo25940a();
            this.f10068b++;
            C3989b.m10669a("schedule reconnect in " + a + "ms");
            XMPushService xMPushService2 = this.f10067a;
            xMPushService2.getClass();
            xMPushService2.mo25872a((XMPushService.C4827i) new XMPushService.C4822d(), (long) a);
            if (this.f10068b == 2 && C4728he.mo25240a().mo25240a()) {
                C4843ad.m15536b();
            }
            if (this.f10068b == 3) {
                C4843ad.m15533a();
            }
        }
    }
}
