package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.mipush.sdk.ErrorCode;
import com.xiaomi.push.C4724gh;
import com.xiaomi.push.service.C4906bg;
import com.xiaomi.push.service.XMPushService;
import java.util.Collection;

/* renamed from: com.xiaomi.push.service.w */
public class C4988w extends XMPushService.C4849j {

    /* renamed from: a */
    private XMPushService f9754a;

    /* renamed from: a */
    private String f9755a;

    /* renamed from: a */
    private byte[] f9756a;

    /* renamed from: b */
    private String f9757b;

    /* renamed from: c */
    private String f9758c;

    public C4988w(XMPushService xMPushService, String str, String str2, String str3, byte[] bArr) {
        super(9);
        this.f9754a = xMPushService;
        this.f9755a = str;
        this.f9756a = bArr;
        this.f9757b = str2;
        this.f9758c = str3;
    }

    /* renamed from: a */
    public String mo29133a() {
        return "register app";
    }

    /* renamed from: a */
    public void m15697a() {
        C4906bg.C4908b bVar;
        C4984t a = C4985u.m15674a((Context) this.f9754a);
        if (a == null) {
            try {
                a = C4985u.m15676a(this.f9754a, this.f9755a, this.f9757b, this.f9758c);
            } catch (Exception e) {
                C4408b.m12483d("fail to register push account. " + e);
            }
        }
        if (a == null) {
            C4408b.m12483d("no account for registration.");
            C4989x.m15698a(this.f9754a, ErrorCode.ERROR_AUTHERICATION_ERROR, "no account.");
            return;
        }
        C4408b.m12464a("do registration now.");
        Collection a2 = C4906bg.mo30005a().mo30007a("5");
        if (a2.isEmpty()) {
            bVar = a.mo30083a(this.f9754a);
            C4870ah.m15199a(this.f9754a, bVar);
            C4906bg.mo30005a().mo30011a(bVar);
        } else {
            bVar = (C4906bg.C4908b) a2.iterator().next();
        }
        if (this.f9754a.mo29942c()) {
            try {
                C4906bg.C4912c cVar = bVar.f9535a;
                if (cVar == C4906bg.C4912c.binded) {
                    C4870ah.m15201a(this.f9754a, this.f9755a, this.f9756a);
                } else if (cVar == C4906bg.C4912c.unbind) {
                    C4989x.m15702a(this.f9755a, this.f9756a);
                    XMPushService xMPushService = this.f9754a;
                    xMPushService.getClass();
                    xMPushService.mo29931a((XMPushService.C4849j) new XMPushService.C4841b(bVar));
                }
            } catch (C4724gh e2) {
                C4408b.m12483d("meet error, disconnect connection. " + e2);
                this.f9754a.mo29929a(10, (Exception) e2);
            }
        } else {
            C4989x.m15702a(this.f9755a, this.f9756a);
            this.f9754a.mo29937a(true);
        }
    }
}
