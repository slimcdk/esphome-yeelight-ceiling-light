package com.xiaomi.push.service;

import android.content.Context;
import android.os.Messenger;
import android.text.TextUtils;
import com.miot.api.Constants;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.mipush.sdk.ErrorCode;
import com.xiaomi.push.C4610db;
import com.xiaomi.push.C4695fl;
import com.xiaomi.push.C4711fw;
import com.xiaomi.push.C4724gh;
import com.xiaomi.push.C4731gn;
import com.xiaomi.push.C4760hj;
import com.xiaomi.push.C4770ht;
import com.xiaomi.push.C4773hw;
import com.xiaomi.push.C4775hy;
import com.xiaomi.push.C4783if;
import com.xiaomi.push.C4786ii;
import com.xiaomi.push.C4797it;
import com.xiaomi.push.C4798iu;
import com.xiaomi.push.C4804iz;
import com.xiaomi.push.service.C4906bg;
import com.xiaomi.push.service.C4932bx;
import java.nio.ByteBuffer;
import java.util.Map;

/* renamed from: com.xiaomi.push.service.ah */
final class C4870ah {
    /* renamed from: a */
    static C4695fl m15190a(XMPushService xMPushService, byte[] bArr) {
        C4783if ifVar = new C4783if();
        try {
            C4797it.m14833a(ifVar, bArr);
            return m15191a(C4985u.m15674a((Context) xMPushService), (Context) xMPushService, ifVar);
        } catch (C4804iz e) {
            C4408b.m12478a((Throwable) e);
            return null;
        }
    }

    /* renamed from: a */
    static C4695fl m15191a(C4984t tVar, Context context, C4783if ifVar) {
        try {
            C4695fl flVar = new C4695fl();
            flVar.mo29147a(5);
            flVar.mo29157c(tVar.f9741a);
            flVar.mo29155b(m15195a(ifVar));
            flVar.mo29150a("SECMSG", Constants.EXTRA_PUSH_MESSAGE);
            String str = tVar.f9741a;
            ifVar.f8949a.f8814a = str.substring(0, str.indexOf("@"));
            ifVar.f8949a.f8818c = str.substring(str.indexOf(MiotCloudImpl.COOKIE_PATH) + 1);
            flVar.mo29152a(C4797it.m14834a(ifVar), tVar.f9743c);
            flVar.mo29151a(1);
            C4408b.m12464a("try send mi push message. packagename:" + ifVar.f8954b + " action:" + ifVar.f8947a);
            return flVar;
        } catch (NullPointerException e) {
            C4408b.m12478a((Throwable) e);
            return null;
        }
    }

    /* renamed from: a */
    static C4783if m15192a(String str, String str2) {
        C4786ii iiVar = new C4786ii();
        iiVar.mo29599b(str2);
        iiVar.mo29602c("package uninstalled");
        iiVar.mo29593a(C4731gn.m14061i());
        iiVar.mo29596a(false);
        return m15193a(str, str2, iiVar, C4760hj.Notification);
    }

    /* renamed from: a */
    static <T extends C4798iu<T, ?>> C4783if m15193a(String str, String str2, T t, C4760hj hjVar) {
        return m15194a(str, str2, t, hjVar, true);
    }

    /* renamed from: a */
    private static <T extends C4798iu<T, ?>> C4783if m15194a(String str, String str2, T t, C4760hj hjVar, boolean z) {
        byte[] a = C4797it.m14834a(t);
        C4783if ifVar = new C4783if();
        C4775hy hyVar = new C4775hy();
        hyVar.f8813a = 5;
        hyVar.f8814a = "fakeid";
        ifVar.mo29561a(hyVar);
        ifVar.mo29563a(ByteBuffer.wrap(a));
        ifVar.mo29559a(hjVar);
        ifVar.mo29566b(z);
        ifVar.mo29565b(str);
        ifVar.mo29564a(false);
        ifVar.mo29562a(str2);
        return ifVar;
    }

    /* renamed from: a */
    private static String m15195a(C4783if ifVar) {
        Map<String, String> map;
        C4773hw hwVar = ifVar.f8948a;
        if (!(hwVar == null || (map = hwVar.f8795b) == null)) {
            String str = map.get("ext_traffic_source_pkg");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return ifVar.f8954b;
    }

    /* renamed from: a */
    static String m15196a(String str) {
        return str + ".permission.MIPUSH_RECEIVE";
    }

    /* renamed from: a */
    static void m15197a(XMPushService xMPushService) {
        C4984t a = C4985u.m15674a(xMPushService.getApplicationContext());
        if (a != null) {
            C4906bg.C4908b a2 = C4985u.m15674a(xMPushService.getApplicationContext()).mo30083a(xMPushService);
            C4408b.m12464a("prepare account. " + a2.f9537a);
            m15199a(xMPushService, a2);
            C4906bg.mo30005a().mo30011a(a2);
            C4932bx.m15485a((Context) xMPushService).mo30033a((C4932bx.C4933a) new C4871ai("GAID", 172800, xMPushService, a));
            m15200a(xMPushService, a, 172800);
        }
    }

    /* renamed from: a */
    static void m15198a(XMPushService xMPushService, C4783if ifVar) {
        C4610db.m13286a(ifVar.mo29567b(), xMPushService.getApplicationContext(), ifVar, -1);
        C4711fw a = xMPushService.mo29927a();
        if (a == null) {
            throw new C4724gh("try send msg while connection is null.");
        } else if (a.mo29170a()) {
            C4695fl a2 = m15191a(C4985u.m15674a((Context) xMPushService), (Context) xMPushService, ifVar);
            if (a2 != null) {
                a.mo29178b(a2);
            }
        } else {
            throw new C4724gh("Don't support XMPP connection.");
        }
    }

    /* renamed from: a */
    static void m15199a(XMPushService xMPushService, C4906bg.C4908b bVar) {
        bVar.mo30016a((Messenger) null);
        bVar.mo30017a((C4906bg.C4908b.C4909a) new C4873ak(xMPushService));
    }

    /* renamed from: a */
    private static void m15200a(XMPushService xMPushService, C4984t tVar, int i) {
        C4932bx.m15485a((Context) xMPushService).mo30033a((C4932bx.C4933a) new C4872aj("MSAID", (long) i, xMPushService, tVar));
    }

    /* renamed from: a */
    static void m15201a(XMPushService xMPushService, String str, byte[] bArr) {
        C4610db.m13288a(str, xMPushService.getApplicationContext(), bArr);
        C4711fw a = xMPushService.mo29927a();
        if (a == null) {
            throw new C4724gh("try send msg while connection is null.");
        } else if (a.mo29170a()) {
            C4695fl a2 = m15190a(xMPushService, bArr);
            if (a2 != null) {
                a.mo29178b(a2);
            } else {
                C4989x.m15699a(xMPushService, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, "not a valid message");
            }
        } else {
            throw new C4724gh("Don't support XMPP connection.");
        }
    }

    /* renamed from: b */
    static C4783if m15202b(String str, String str2) {
        C4786ii iiVar = new C4786ii();
        iiVar.mo29599b(str2);
        iiVar.mo29602c(C4770ht.AppDataCleared.f8718a);
        iiVar.mo29593a(C4902bd.m15380a());
        iiVar.mo29596a(false);
        return m15193a(str, str2, iiVar, C4760hj.Notification);
    }

    /* renamed from: b */
    static <T extends C4798iu<T, ?>> C4783if m15203b(String str, String str2, T t, C4760hj hjVar) {
        return m15194a(str, str2, t, hjVar, false);
    }
}
