package com.xiaomi.mistatistic.sdk;

import android.content.ContentResolver;
import android.content.Context;
import com.xiaomi.mistatistic.sdk.controller.C4113c;
import com.xiaomi.mistatistic.sdk.controller.C4130h;
import com.xiaomi.mistatistic.sdk.controller.C4162q;
import java.lang.reflect.Method;

public class BuildSetting {

    /* renamed from: a */
    private static boolean f6971a = false;

    /* renamed from: b */
    private static boolean f6972b = false;

    /* renamed from: c */
    private static Boolean f6973c = null;

    /* renamed from: d */
    private static boolean f6974d = true;

    /* renamed from: e */
    private static long f6975e = 60000;

    /* renamed from: f */
    private static long f6976f;

    /* renamed from: a */
    private static boolean m11009a() {
        try {
            if (!C4162q.m11300d(C4113c.m11105a())) {
                return false;
            }
            Object obj = Class.forName("miui.os.Build").getField("IS_ALPHA_BUILD").get((Object) null);
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m11010b() {
        try {
            if (!C4162q.m11300d(C4113c.m11105a())) {
                return false;
            }
            Object obj = Class.forName("miui.os.Build").getField("IS_DEVELOPMENT_VERSION").get((Object) null);
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static boolean m11011c() {
        try {
            if (!C4162q.m11300d(C4113c.m11105a())) {
                return false;
            }
            Object obj = Class.forName("miui.os.Build").getField("IS_STABLE_VERSION").get((Object) null);
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void disableUEPChecking() {
        f6974d = false;
    }

    public static void enableSelfStats() {
        f6972b = true;
    }

    public static String getMiuiBuildCode() {
        return m11011c() ? "S" : m11010b() ? "D" : m11009a() ? "A" : "";
    }

    public static boolean isCTABuild() {
        try {
            if (C4162q.m11300d(C4113c.m11105a())) {
                return ((Boolean) Class.forName("miui.os.Build").getField("IS_CTA_BUILD").get((Object) null)).booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isDisabled(Context context) {
        if (!f6974d) {
            C4130h.m11177b("isDisabled false, sRespectUEP " + f6974d);
            return false;
        }
        if (f6973c == null || C4162q.m11291a(f6976f, f6975e)) {
            if (!C4162q.m11300d(context) || !C4162q.m11301e(context)) {
                f6973c = Boolean.FALSE;
                C4130h.m11177b("isDisabled false, not miui app or OS ");
            } else {
                f6973c = Boolean.valueOf(!isUserExperienceProgramEnabled(context));
            }
            f6976f = System.currentTimeMillis();
        }
        return f6973c.booleanValue();
    }

    public static boolean isInternationalBuild() {
        try {
            return ((Boolean) Class.forName("miui.os.Build").getField("IS_INTERNATIONAL_BUILD").get((Object) null)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isSelfStats() {
        return f6972b;
    }

    public static boolean isTest() {
        return f6971a;
    }

    public static boolean isUploadDebugLogEnable(Context context) {
        boolean z = true;
        try {
            Method declaredMethod = Class.forName("android.provider.MiuiSettings$Secure").getDeclaredMethod("isUploadDebugLogEnable", new Class[]{ContentResolver.class});
            declaredMethod.setAccessible(true);
            z = ((Boolean) declaredMethod.invoke((Object) null, new Object[]{context.getContentResolver()})).booleanValue();
            C4130h.m11172a("isUploadDebugLogEnable: " + z);
            return z;
        } catch (Exception e) {
            C4130h.m11179b("BS", "isUploadDebugLogEnable exception:", (Throwable) e);
            return z;
        }
    }

    public static boolean isUserExperienceProgramEnabled(Context context) {
        boolean z = true;
        try {
            Method declaredMethod = Class.forName("android.provider.MiuiSettings$Secure").getDeclaredMethod("isUserExperienceProgramEnable", new Class[]{ContentResolver.class});
            declaredMethod.setAccessible(true);
            z = ((Boolean) declaredMethod.invoke((Object) null, new Object[]{context.getContentResolver()})).booleanValue();
        } catch (Exception e) {
            C4130h.m11179b("BS", "isUserExperienceProgramEnable exception:", (Throwable) e);
        }
        C4130h.m11177b("UEP " + z);
        return z;
    }

    public static void setTest(boolean z) {
        f6971a = z;
    }
}
