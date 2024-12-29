package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4554bk;

/* renamed from: com.xiaomi.mipush.sdk.n */
public class C4489n {

    /* renamed from: a */
    private static int f7514a = -1;

    /* renamed from: a */
    public static C4457ag m12791a(Context context) {
        try {
            return (context.getPackageManager().getServiceInfo(new ComponentName("com.huawei.hwid", "com.huawei.hms.core.service.HMSCoreService"), 128) == null || !m12792a()) ? C4457ag.OTHER : C4457ag.HUAWEI;
        } catch (Exception unused) {
            return C4457ag.OTHER;
        }
    }

    /* renamed from: a */
    private static boolean m12792a() {
        try {
            String str = (String) C4554bk.m13014a("android.os.SystemProperties", "get", "ro.build.hw_emui_api_level", "");
            return !TextUtils.isEmpty(str) && Integer.parseInt(str) >= 9;
        } catch (Exception e) {
            C4408b.m12478a((Throwable) e);
        }
    }

    /* renamed from: a */
    public static boolean m12793a(Context context) {
        Class<Integer> cls = Integer.class;
        Object a = C4554bk.m13012a(C4554bk.m13014a("com.google.android.gms.common.GoogleApiAvailability", "getInstance", new Object[0]), "isGooglePlayServicesAvailable", context);
        Object a2 = C4554bk.m13013a("com.google.android.gms.common.ConnectionResult", "SUCCESS");
        if (a2 == null || !(a2 instanceof Integer)) {
            C4408b.m12482c("google service is not avaliable");
            f7514a = 0;
            return false;
        }
        int intValue = cls.cast(a2).intValue();
        if (a != null) {
            if (a instanceof Integer) {
                f7514a = cls.cast(a).intValue() == intValue ? 1 : 0;
            } else {
                f7514a = 0;
                C4408b.m12482c("google service is not avaliable");
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("is google service can be used");
        sb.append(f7514a > 0);
        C4408b.m12482c(sb.toString());
        return f7514a > 0;
    }

    /* renamed from: b */
    public static boolean m12794b(Context context) {
        boolean z = false;
        Object a = C4554bk.m13014a("com.xiaomi.assemble.control.COSPushManager", "isSupportPush", context);
        if (a != null && (a instanceof Boolean)) {
            z = Boolean.class.cast(a).booleanValue();
        }
        C4408b.m12482c("color os push  is avaliable ? :" + z);
        return z;
    }

    /* renamed from: c */
    public static boolean m12795c(Context context) {
        boolean z = false;
        Object a = C4554bk.m13014a("com.xiaomi.assemble.control.FTOSPushManager", "isSupportPush", context);
        if (a != null && (a instanceof Boolean)) {
            z = Boolean.class.cast(a).booleanValue();
        }
        C4408b.m12482c("fun touch os push  is avaliable ? :" + z);
        return z;
    }
}
