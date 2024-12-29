package com.yeelight.yeelib_tasker;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* renamed from: com.yeelight.yeelib_tasker.b */
public class C10569b {

    /* renamed from: com.yeelight.yeelib_tasker.b$a */
    public static class C10570a {
        /* renamed from: a */
        public static boolean m25873a(Activity activity) {
            ComponentName callingActivity;
            boolean b = m25874b(activity.getIntent().getExtras());
            if (b || (callingActivity = activity.getCallingActivity()) == null) {
                return b;
            }
            String packageName = callingActivity.getPackageName();
            return packageName.startsWith("net.dinglisch.android.tasker") && C10569b.m25870f(activity.getPackageManager(), packageName) > 80;
        }

        /* renamed from: b */
        public static boolean m25874b(Bundle bundle) {
            return C10569b.m25871g(bundle, 8);
        }

        /* renamed from: c */
        public static void m25875c(Bundle bundle, String[] strArr) {
            C10569b.m25868d(strArr, bundle, "net.dinglisch.android.tasker.extras.VARIABLE_REPLACE_KEYS", "setVariableReplaceKeys");
        }
    }

    /* renamed from: c */
    public static void m25867c(Intent intent, String[] strArr) {
        intent.putExtra("net.dinglisch.android.tasker.RELEVANT_VARIABLES", strArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m25868d(String[] strArr, Bundle bundle, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (strArr != null) {
            for (String str3 : strArr) {
                if (str3.contains(" ")) {
                    str2 + ": ignoring bad keyName containing space: " + str3;
                } else {
                    if (sb.length() > 0) {
                        sb.append(' ');
                    }
                    sb.append(str3);
                }
                if (sb.length() > 0) {
                    bundle.putString(str, sb.toString());
                }
            }
        }
    }

    /* renamed from: e */
    private static Object m25869e(Bundle bundle, String str, Class<?> cls, String str2) {
        if (bundle != null && bundle.containsKey(str)) {
            Object obj = bundle.get(str);
            if (obj == null) {
                str2 + ": " + str + ": null value";
            } else if (obj.getClass() == cls) {
                return obj;
            } else {
                str2 + ": " + str + ": expected " + cls.getClass().getName() + ", got " + obj.getClass().getName();
            }
        }
        return null;
    }

    /* renamed from: f */
    public static int m25870f(PackageManager packageManager, String str) {
        if (packageManager == null) {
            return -1;
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static boolean m25871g(Bundle bundle, int i) {
        Integer num = (Integer) m25869e(bundle, "net.dinglisch.android.tasker.extras.HOST_CAPABILITIES", Integer.class, "hostSupports");
        return num != null && (num.intValue() & i) > 0;
    }

    /* renamed from: h */
    public static boolean m25872h(Bundle bundle) {
        return m25871g(bundle, 16);
    }
}
