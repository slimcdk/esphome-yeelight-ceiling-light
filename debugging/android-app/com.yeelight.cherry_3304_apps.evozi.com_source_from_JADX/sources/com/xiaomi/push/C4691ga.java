package com.xiaomi.push;

import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.ga */
class C4691ga extends XMPushService.C4827i {

    /* renamed from: a */
    final /* synthetic */ long f8799a;

    /* renamed from: a */
    final /* synthetic */ C4688fz f8800a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4691ga(C4688fz fzVar, int i, long j) {
        super(i);
        this.f8800a = fzVar;
        this.f8799a = j;
    }

    /* renamed from: a */
    public String mo25172a() {
        return "check the ping-pong." + this.f8799a;
    }

    /* renamed from: a */
    public void m14362a() {
        Thread.yield();
        if (this.f8800a.mo25155c() && !this.f8800a.mo25149a(this.f8799a)) {
            this.f8800a.f8787b.mo25869a(22, (Exception) null);
        }
    }
}
