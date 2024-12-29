package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4525ba;

/* renamed from: com.xiaomi.mipush.sdk.m */
public class C4069m {

    /* renamed from: a */
    private static int f6947a = -1;

    /* renamed from: a */
    public static C4038ah m10965a(Context context) {
        try {
            return (context.getPackageManager().getServiceInfo(new ComponentName("com.huawei.hwid", "com.huawei.hms.core.service.HMSCoreService"), 128) == null || !m10966a()) ? C4038ah.OTHER : C4038ah.HUAWEI;
        } catch (Exception unused) {
            return C4038ah.OTHER;
        }
    }

    /* renamed from: a */
    private static boolean m10966a() {
        try {
            String str = (String) C4525ba.m13405a("android.os.SystemProperties", "get", "ro.build.hw_emui_api_level", "");
            return !TextUtils.isEmpty(str) && Integer.parseInt(str) >= 9;
        } catch (Exception e) {
            C3989b.m10678a((Throwable) e);
        }
    }

    /* renamed from: a */
    public static boolean m10967a(Context context) {
        Class<Integer> cls = Integer.class;
        Object a = C4525ba.m13403a(C4525ba.m13405a("com.google.android.gms.common.GoogleApiAvailability", "getInstance", new Object[0]), "isGooglePlayServicesAvailable", context);
        Object a2 = C4525ba.m13404a("com.google.android.gms.common.ConnectionResult", "SUCCESS");
        if (a2 == null || !(a2 instanceof Integer)) {
            C3989b.m10680c("google service is not avaliable");
            f6947a = 0;
            return false;
        }
        int intValue = cls.cast(a2).intValue();
        if (a != null) {
            if (a instanceof Integer) {
                f6947a = cls.cast(a).intValue() == intValue ? 1 : 0;
            } else {
                f6947a = 0;
                C3989b.m10680c("google service is not avaliable");
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("is google service can be used");
        sb.append(f6947a > 0);
        C3989b.m10680c(sb.toString());
        return f6947a > 0;
    }

    /* renamed from: b */
    public static boolean m10968b(Context context) {
        boolean z = false;
        Object a = C4525ba.m13405a("com.xiaomi.assemble.control.COSPushManager", "isSupportPush", context);
        if (a != null && (a instanceof Boolean)) {
            z = Boolean.class.cast(a).booleanValue();
        }
        C3989b.m10680c("color os push  is avaliable ? :" + z);
        return z;
    }

    /* renamed from: c */
    public static boolean m10969c(Context context) {
        boolean z = false;
        Object a = C4525ba.m13405a("com.xiaomi.assemble.control.FTOSPushManager", "isSupportPush", context);
        if (a != null && (a instanceof Boolean)) {
            z = Boolean.class.cast(a).booleanValue();
        }
        C3989b.m10680c("fun touch os push  is avaliable ? :" + z);
        return z;
    }
}
