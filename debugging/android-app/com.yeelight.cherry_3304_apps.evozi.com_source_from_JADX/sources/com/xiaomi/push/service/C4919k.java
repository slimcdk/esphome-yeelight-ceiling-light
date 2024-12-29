package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.C4689g;
import com.xiaomi.push.C4937t;
import com.xiaomi.push.service.C4860ap;
import java.util.Locale;

/* renamed from: com.xiaomi.push.service.k */
public class C4919k {

    /* renamed from: a */
    public final int f10157a;

    /* renamed from: a */
    public final String f10158a;

    /* renamed from: b */
    public final String f10159b;

    /* renamed from: c */
    public final String f10160c;

    /* renamed from: d */
    public final String f10161d;

    /* renamed from: e */
    public final String f10162e;

    /* renamed from: f */
    public final String f10163f;

    public C4919k(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this.f10158a = str;
        this.f10159b = str2;
        this.f10160c = str3;
        this.f10161d = str4;
        this.f10162e = str5;
        this.f10163f = str6;
        this.f10157a = i;
    }

    /* renamed from: a */
    public static boolean m15784a() {
        try {
            return C4937t.m15867a((Context) null, "miui.os.Build").getField("IS_ALPHA_BUILD").getBoolean((Object) null);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m15785a(Context context) {
        return "com.xiaomi.xmsf".equals(context.getPackageName()) && m15784a();
    }

    /* renamed from: b */
    private static boolean m15786b(Context context) {
        return context.getPackageName().equals("com.xiaomi.xmsf");
    }

    /* renamed from: a */
    public C4860ap.C4862b mo25990a(XMPushService xMPushService) {
        C4860ap.C4862b bVar = new C4860ap.C4862b(xMPushService);
        mo25991a(bVar, xMPushService, xMPushService.mo25880b(), "c");
        return bVar;
    }

    /* renamed from: a */
    public C4860ap.C4862b mo25991a(C4860ap.C4862b bVar, Context context, C4907d dVar, String str) {
        bVar.f9988a = context.getPackageName();
        bVar.f9992b = this.f10158a;
        bVar.f9999h = this.f10160c;
        bVar.f9994c = this.f10159b;
        bVar.f9998g = "5";
        bVar.f9995d = "XMPUSH-PASS";
        bVar.f9990a = false;
        bVar.f9996e = String.format("%1$s:%2$s,%3$s:%4$s,%5$s:%6$s:%7$s:%8$s,%9$s:%10$s,%11$s:%12$s", new Object[]{"sdk_ver", 39, "cpvn", "3_7_5", "cpvc", 30705, "aapn", m15786b(context) ? C4689g.m14356b(context) : "", "country_code", C4836a.m15481a(context).mo25896b(), "region", C4836a.m15481a(context).mo25894a()});
        bVar.f9997f = String.format("%1$s:%2$s,%3$s:%4$s,%5$s:%6$s,sync:1", new Object[]{"appid", m15786b(context) ? "1000271" : this.f10161d, "locale", Locale.getDefault().toString(), Constants.EXTRA_KEY_MIID, C4937t.m15869a(context)});
        if (m15785a(context)) {
            bVar.f9997f += String.format(",%1$s:%2$s", new Object[]{"ab", str});
        }
        bVar.f9987a = dVar;
        return bVar;
    }
}
