package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4689fh;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.bq */
class C4924bq {

    /* renamed from: d */
    private static int f9617d = 300000;

    /* renamed from: a */
    private int f9618a;

    /* renamed from: a */
    private long f9619a;

    /* renamed from: a */
    private XMPushService f9620a;

    /* renamed from: b */
    private int f9621b = 0;

    /* renamed from: c */
    private int f9622c = 0;

    public C4924bq(XMPushService xMPushService) {
        this.f9620a = xMPushService;
        this.f9618a = 500;
        this.f9619a = 0;
    }

    /* renamed from: a */
    private int mo30025a() {
        if (this.f9621b > 8) {
            return 300000;
        }
        double random = (Math.random() * 2.0d) + 1.0d;
        int i = this.f9621b;
        if (i > 4) {
            return (int) (random * 60000.0d);
        }
        if (i > 1) {
            return (int) (random * 10000.0d);
        }
        if (this.f9619a == 0) {
            return 0;
        }
        if (System.currentTimeMillis() - this.f9619a < 310000) {
            int i2 = this.f9618a;
            int i3 = f9617d;
            if (i2 >= i3) {
                return i2;
            }
            int i4 = this.f9622c + 1;
            this.f9622c = i4;
            if (i4 >= 4) {
                return i3;
            }
            double d = (double) i2;
            Double.isNaN(d);
            this.f9618a = (int) (d * 1.5d);
            return i2;
        }
        this.f9618a = 1000;
        this.f9622c = 0;
        return 0;
    }

    /* renamed from: a */
    public void m15456a() {
        this.f9619a = System.currentTimeMillis();
        this.f9620a.mo29928a(1);
        this.f9621b = 0;
    }

    /* renamed from: a */
    public void mo30026a(boolean z) {
        if (!this.f9620a.mo29927a()) {
            C4408b.m12482c("should not reconnect as no client or network.");
        } else if (z) {
            if (!this.f9620a.mo29928a(1)) {
                this.f9621b++;
            }
            this.f9620a.mo29928a(1);
            XMPushService xMPushService = this.f9620a;
            xMPushService.getClass();
            xMPushService.mo29931a((XMPushService.C4849j) new XMPushService.C4844e());
        } else if (!this.f9620a.mo29928a(1)) {
            int a = mo30025a();
            this.f9621b++;
            C4408b.m12464a("schedule reconnect in " + a + "ms");
            XMPushService xMPushService2 = this.f9620a;
            xMPushService2.getClass();
            xMPushService2.mo29932a((XMPushService.C4849j) new XMPushService.C4844e(), (long) a);
            if (this.f9621b == 2 && C4689fh.mo29139a().mo29139a()) {
                C4881ap.m15267b();
            }
            if (this.f9621b == 3) {
                C4881ap.m15264a();
            }
        }
    }
}
