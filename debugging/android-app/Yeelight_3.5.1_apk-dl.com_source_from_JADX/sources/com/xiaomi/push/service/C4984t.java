package com.xiaomi.push.service;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.xiaomi.push.C4747h;
import com.xiaomi.push.C4830m;
import com.xiaomi.push.C4994v;
import com.xiaomi.push.C4995w;
import com.xiaomi.push.service.C4906bg;
import java.util.Locale;
import p129b4.C3989c;

/* renamed from: com.xiaomi.push.service.t */
public class C4984t {

    /* renamed from: a */
    public final int f9740a;

    /* renamed from: a */
    public final String f9741a;

    /* renamed from: b */
    public final String f9742b;

    /* renamed from: c */
    public final String f9743c;

    /* renamed from: d */
    public final String f9744d;

    /* renamed from: e */
    public final String f9745e;

    /* renamed from: f */
    public final String f9746f;

    public C4984t(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this.f9741a = str;
        this.f9742b = str2;
        this.f9743c = str3;
        this.f9744d = str4;
        this.f9745e = str5;
        this.f9746f = str6;
        this.f9740a = i;
    }

    /* renamed from: a */
    private static String m15668a(Context context) {
        if (!"com.xiaomi.xmsf".equals(context)) {
            return C4830m.m15010b();
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            return null;
        }
        String a = C4830m.m14999a("ro.miui.region");
        return TextUtils.isEmpty(a) ? C4830m.m14999a("ro.product.locale.region") : a;
    }

    /* renamed from: a */
    public static boolean m15669a() {
        try {
            return C4994v.m15735a((Context) null, "miui.os.Build").getField("IS_ALPHA_BUILD").getBoolean((Object) null);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m15670a(Context context) {
        return "com.xiaomi.xmsf".equals(context.getPackageName()) && m15669a();
    }

    /* renamed from: b */
    private static boolean m15671b(Context context) {
        return context.getPackageName().equals("com.xiaomi.xmsf");
    }

    /* renamed from: a */
    public C4906bg.C4908b mo30083a(XMPushService xMPushService) {
        C4906bg.C4908b bVar = new C4906bg.C4908b(xMPushService);
        mo30084a(bVar, xMPushService, xMPushService.mo29940b(), C3989c.f6735c);
        return bVar;
    }

    /* renamed from: a */
    public C4906bg.C4908b mo30084a(C4906bg.C4908b bVar, Context context, C4967j jVar, String str) {
        bVar.f9537a = context.getPackageName();
        bVar.f9541b = this.f9741a;
        bVar.f9548h = this.f9743c;
        bVar.f9543c = this.f9742b;
        bVar.f9547g = "5";
        bVar.f9544d = "XMPUSH-PASS";
        bVar.f9539a = false;
        C4995w.C4996a aVar = new C4995w.C4996a();
        aVar.mo30094a("sdk_ver", 48).mo30094a("cpvn", "4_9_1").mo30094a("cpvc", 40091).mo30094a("country_code", C4860a.m15159a(context).mo29959b()).mo30094a("region", C4860a.m15159a(context).mo29957a()).mo30094a("miui_vn", C4830m.m15013c()).mo30094a("miui_vc", Integer.valueOf(C4830m.m14998a(context))).mo30094a("xmsf_vc", Integer.valueOf(C4747h.m14123a(context, "com.xiaomi.xmsf"))).mo30094a("android_ver", Integer.valueOf(Build.VERSION.SDK_INT)).mo30094a("n_belong_to_app", Boolean.valueOf(C4893ax.m15320a(context))).mo30094a("systemui_vc", Integer.valueOf(C4747h.m14122a(context)));
        String a = m15668a(context);
        if (!TextUtils.isEmpty(a)) {
            aVar.mo30094a("latest_country_code", a);
        }
        String d = C4830m.m15015d();
        if (!TextUtils.isEmpty(d)) {
            aVar.mo30094a("device_ch", d);
        }
        String e = C4830m.m15017e();
        if (!TextUtils.isEmpty(e)) {
            aVar.mo30094a("device_mfr", e);
        }
        bVar.f9545e = aVar.toString();
        String str2 = m15671b(context) ? "1000271" : this.f9744d;
        C4995w.C4996a aVar2 = new C4995w.C4996a();
        aVar2.mo30094a("appid", str2).mo30094a("locale", Locale.getDefault().toString()).mo30094a("sync", 1);
        if (m15668a(context)) {
            aVar2.mo30094a("ab", str);
        }
        bVar.f9546f = aVar2.toString();
        bVar.f9536a = jVar;
        return bVar;
    }
}
