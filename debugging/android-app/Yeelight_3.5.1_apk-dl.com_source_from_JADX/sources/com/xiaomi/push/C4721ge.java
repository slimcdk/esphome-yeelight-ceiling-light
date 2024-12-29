package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.service.C4972o;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.ge */
class C4721ge extends XMPushService.C4849j {

    /* renamed from: a */
    final /* synthetic */ long f8263a;

    /* renamed from: a */
    final /* synthetic */ C4720gd f8264a;

    /* renamed from: b */
    final /* synthetic */ long f8265b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4721ge(C4720gd gdVar, int i, long j, long j2) {
        super(i);
        this.f8264a = gdVar;
        this.f8263a = j;
        this.f8265b = j2;
    }

    /* renamed from: a */
    public String mo29133a() {
        return "check the ping-pong." + this.f8265b;
    }

    /* renamed from: a */
    public void m14015a() {
        Thread.yield();
        if (this.f8264a.mo29193c() && !this.f8264a.mo29187a(this.f8263a)) {
            C4972o.m15587a((Context) this.f8264a.f8255b).mo30060b();
            this.f8264a.f8255b.mo29929a(22, (Exception) null);
        }
    }
}
