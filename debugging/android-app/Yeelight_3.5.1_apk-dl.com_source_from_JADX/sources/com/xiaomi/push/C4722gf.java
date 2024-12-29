package com.xiaomi.push;

import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.gf */
class C4722gf extends XMPushService.C4849j {

    /* renamed from: a */
    final /* synthetic */ C4720gd f8266a;

    /* renamed from: a */
    final /* synthetic */ Exception f8267a;

    /* renamed from: b */
    final /* synthetic */ int f8268b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4722gf(C4720gd gdVar, int i, int i2, Exception exc) {
        super(i);
        this.f8266a = gdVar;
        this.f8268b = i2;
        this.f8267a = exc;
    }

    /* renamed from: a */
    public String mo29133a() {
        return "shutdown the connection. " + this.f8268b + ", " + this.f8267a;
    }

    /* renamed from: a */
    public void m14017a() {
        this.f8266a.f8255b.mo29929a(this.f8268b, this.f8267a);
    }
}
