package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.C4491ab;
import com.xiaomi.push.C4682ft;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.bx */
class C4905bx extends XMPushService.C4827i {

    /* renamed from: a */
    final /* synthetic */ XMPushService f10122a;

    /* renamed from: a */
    final /* synthetic */ String f10123a;

    /* renamed from: a */
    final /* synthetic */ byte[] f10124a;

    /* renamed from: b */
    final /* synthetic */ int f10125b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4905bx(XMPushService xMPushService, int i, int i2, byte[] bArr, String str) {
        super(i);
        this.f10122a = xMPushService;
        this.f10125b = i2;
        this.f10124a = bArr;
        this.f10123a = str;
    }

    /* renamed from: a */
    public String mo25172a() {
        return "clear account cache.";
    }

    /* renamed from: a */
    public void m15725a() {
        C4920l.m15789a((Context) this.f10122a);
        C4860ap.mo25920a().mo25922a("5");
        C4491ab.m13257a(this.f10125b);
        XMPushService.m15384a(this.f10122a).mo25165c(C4682ft.mo25160a());
        this.f10122a.mo25878a(this.f10124a, this.f10123a);
    }
}
