package com.xiaomi.push;

import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.gb */
class C4692gb extends XMPushService.C4827i {

    /* renamed from: a */
    final /* synthetic */ C4688fz f8801a;

    /* renamed from: a */
    final /* synthetic */ Exception f8802a;

    /* renamed from: b */
    final /* synthetic */ int f8803b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4692gb(C4688fz fzVar, int i, int i2, Exception exc) {
        super(i);
        this.f8801a = fzVar;
        this.f8803b = i2;
        this.f8802a = exc;
    }

    /* renamed from: a */
    public String mo25172a() {
        return "shutdown the connection. " + this.f8803b + ", " + this.f8802a;
    }

    /* renamed from: a */
    public void m14364a() {
        this.f8801a.f8787b.mo25869a(this.f8803b, this.f8802a);
    }
}
