package com.xiaomi.push.service;

import android.content.Context;
import android.os.Messenger;
import android.text.TextUtils;
import com.miot.api.Constants;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.mipush.sdk.ErrorCode;
import com.xiaomi.push.C4596df;
import com.xiaomi.push.C4673fl;
import com.xiaomi.push.C4680fs;
import com.xiaomi.push.C4694gd;
import com.xiaomi.push.C4701gj;
import com.xiaomi.push.C4739hm;
import com.xiaomi.push.C4752hz;
import com.xiaomi.push.C4755ib;
import com.xiaomi.push.C4762ii;
import com.xiaomi.push.C4765il;
import com.xiaomi.push.C4776iw;
import com.xiaomi.push.C4777ix;
import com.xiaomi.push.C4787jc;
import com.xiaomi.push.service.C4860ap;
import com.xiaomi.push.service.C4887bg;
import java.nio.ByteBuffer;
import java.util.Map;

/* renamed from: com.xiaomi.push.service.w */
final class C4933w {
    /* renamed from: a */
    static C4673fl m15851a(XMPushService xMPushService, byte[] bArr) {
        C4762ii iiVar = new C4762ii();
        try {
            C4776iw.m15224a(iiVar, bArr);
            return m15852a(C4920l.m15789a((Context) xMPushService), (Context) xMPushService, iiVar);
        } catch (C4787jc e) {
            C3989b.m10678a((Throwable) e);
            return null;
        }
    }

    /* renamed from: a */
    static C4673fl m15852a(C4919k kVar, Context context, C4762ii iiVar) {
        try {
            C4673fl flVar = new C4673fl();
            flVar.mo25114a(5);
            flVar.mo25123c(kVar.f10158a);
            flVar.mo25121b(m15855a(iiVar));
            flVar.mo25117a("SECMSG", Constants.EXTRA_PUSH_MESSAGE);
            String str = kVar.f10158a;
            iiVar.f9490a.f9356a = str.substring(0, str.indexOf("@"));
            iiVar.f9490a.f9360c = str.substring(str.indexOf(MiotCloudImpl.COOKIE_PATH) + 1);
            flVar.mo25119a(C4776iw.m15225a(iiVar), kVar.f10160c);
            flVar.mo25118a(1);
            C3989b.m10669a("try send mi push message. packagename:" + iiVar.f9495b + " action:" + iiVar.f9488a);
            return flVar;
        } catch (NullPointerException e) {
            C3989b.m10678a((Throwable) e);
            return null;
        }
    }

    /* renamed from: a */
    static C4762ii m15853a(String str, String str2) {
        C4765il ilVar = new C4765il();
        ilVar.mo25562b(str2);
        ilVar.mo25565c("package uninstalled");
        ilVar.mo25555a(C4701gj.m14407i());
        ilVar.mo25558a(false);
        return m15854a(str, str2, ilVar, C4739hm.Notification);
    }

    /* renamed from: a */
    static <T extends C4777ix<T, ?>> C4762ii m15854a(String str, String str2, T t, C4739hm hmVar) {
        byte[] a = C4776iw.m15225a(t);
        C4762ii iiVar = new C4762ii();
        C4755ib ibVar = new C4755ib();
        ibVar.f9355a = 5;
        ibVar.f9356a = "fakeid";
        iiVar.mo25524a(ibVar);
        iiVar.mo25526a(ByteBuffer.wrap(a));
        iiVar.mo25522a(hmVar);
        iiVar.mo25529b(true);
        iiVar.mo25528b(str);
        iiVar.mo25527a(false);
        iiVar.mo25525a(str2);
        return iiVar;
    }

    /* renamed from: a */
    private static String m15855a(C4762ii iiVar) {
        Map<String, String> map;
        C4752hz hzVar = iiVar.f9489a;
        if (!(hzVar == null || (map = hzVar.f9329b) == null)) {
            String str = map.get("ext_traffic_source_pkg");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return iiVar.f9495b;
    }

    /* renamed from: a */
    static String m15856a(String str) {
        return str + ".permission.MIPUSH_RECEIVE";
    }

    /* renamed from: a */
    static void m15857a(XMPushService xMPushService) {
        C4919k a = C4920l.m15789a(xMPushService.getApplicationContext());
        if (a != null) {
            C4860ap.C4862b a2 = C4920l.m15789a(xMPushService.getApplicationContext()).mo25990a(xMPushService);
            m15859a(xMPushService, a2);
            C4860ap.mo25920a().mo25926a(a2);
            C4887bg.m15694a((Context) xMPushService).mo25951a((C4887bg.C4888a) new C4934x("GAID", 172800, xMPushService, a));
            m15860a(xMPushService, a, 172800);
        }
    }

    /* renamed from: a */
    static void m15858a(XMPushService xMPushService, C4762ii iiVar) {
        C4596df.m13711a(iiVar.mo25530b(), xMPushService.getApplicationContext(), iiVar, -1);
        C4680fs a = xMPushService.mo25867a();
        if (a == null) {
            throw new C4694gd("try send msg while connection is null.");
        } else if (a.mo25134a()) {
            C4673fl a2 = m15852a(C4920l.m15789a((Context) xMPushService), (Context) xMPushService, iiVar);
            if (a2 != null) {
                a.mo25142b(a2);
            }
        } else {
            throw new C4694gd("Don't support XMPP connection.");
        }
    }

    /* renamed from: a */
    static void m15859a(XMPushService xMPushService, C4860ap.C4862b bVar) {
        bVar.mo25931a((Messenger) null);
        bVar.mo25932a((C4860ap.C4862b.C4863a) new C4936z(xMPushService));
    }

    /* renamed from: a */
    private static void m15860a(XMPushService xMPushService, C4919k kVar, int i) {
        C4887bg.m15694a((Context) xMPushService).mo25951a((C4887bg.C4888a) new C4935y("MSAID", (long) i, xMPushService, kVar));
    }

    /* renamed from: a */
    static void m15861a(XMPushService xMPushService, String str, byte[] bArr) {
        C4596df.m13713a(str, xMPushService.getApplicationContext(), bArr);
        C4680fs a = xMPushService.mo25867a();
        if (a == null) {
            throw new C4694gd("try send msg while connection is null.");
        } else if (a.mo25134a()) {
            C4673fl a2 = m15851a(xMPushService, bArr);
            if (a2 != null) {
                a.mo25142b(a2);
            } else {
                C4924o.m15811a(xMPushService, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, "not a valid message");
            }
        } else {
            throw new C4694gd("Don't support XMPP connection.");
        }
    }
}
