package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.mipush.sdk.ErrorCode;
import com.xiaomi.push.C4694gd;
import com.xiaomi.push.service.C4860ap;
import com.xiaomi.push.service.XMPushService;
import java.io.IOException;
import java.util.Collection;
import org.json.JSONException;

/* renamed from: com.xiaomi.push.service.n */
public class C4923n extends XMPushService.C4827i {

    /* renamed from: a */
    private XMPushService f10171a;

    /* renamed from: a */
    private String f10172a;

    /* renamed from: a */
    private byte[] f10173a;

    /* renamed from: b */
    private String f10174b;

    /* renamed from: c */
    private String f10175c;

    public C4923n(XMPushService xMPushService, String str, String str2, String str3, byte[] bArr) {
        super(9);
        this.f10171a = xMPushService;
        this.f10172a = str;
        this.f10173a = bArr;
        this.f10174b = str2;
        this.f10175c = str3;
    }

    /* renamed from: a */
    public String mo25172a() {
        return "register app";
    }

    /* renamed from: a */
    public void m15809a() {
        C4860ap.C4862b bVar;
        C4919k a = C4920l.m15789a((Context) this.f10171a);
        if (a == null) {
            try {
                a = C4920l.m15790a(this.f10171a, this.f10172a, this.f10174b, this.f10175c);
            } catch (IOException | JSONException e) {
                C3989b.m10678a(e);
            }
        }
        if (a == null) {
            C3989b.m10681d("no account for mipush");
            C4924o.m15810a(this.f10171a, ErrorCode.ERROR_AUTHERICATION_ERROR, "no account.");
            return;
        }
        Collection a2 = C4860ap.mo25920a().mo25922a("5");
        if (a2.isEmpty()) {
            bVar = a.mo25990a(this.f10171a);
            C4933w.m15859a(this.f10171a, bVar);
            C4860ap.mo25920a().mo25926a(bVar);
        } else {
            bVar = (C4860ap.C4862b) a2.iterator().next();
        }
        if (this.f10171a.mo25882c()) {
            try {
                if (bVar.f9986a == C4860ap.C4866c.binded) {
                    C4933w.m15861a(this.f10171a, this.f10172a, this.f10173a);
                } else if (bVar.f9986a == C4860ap.C4866c.unbind) {
                    XMPushService xMPushService = this.f10171a;
                    XMPushService xMPushService2 = this.f10171a;
                    xMPushService2.getClass();
                    xMPushService.mo25871a((XMPushService.C4827i) new XMPushService.C4819a(bVar));
                }
            } catch (C4694gd e2) {
                C3989b.m10678a((Throwable) e2);
                this.f10171a.mo25869a(10, (Exception) e2);
            }
        } else {
            this.f10171a.mo25877a(true);
        }
    }
}
