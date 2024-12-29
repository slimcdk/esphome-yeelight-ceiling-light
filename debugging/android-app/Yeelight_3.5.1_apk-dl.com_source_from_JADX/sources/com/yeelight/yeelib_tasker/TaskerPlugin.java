package com.yeelight.yeelib_tasker;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

public class TaskerPlugin {

    public enum Encoding {
        JSON
    }

    /* renamed from: com.yeelight.yeelib_tasker.TaskerPlugin$a */
    public static class C8900a {
        /* renamed from: a */
        public static boolean m21267a(Activity activity) {
            ComponentName callingActivity;
            boolean b = m21268b(activity.getIntent().getExtras());
            if (b || (callingActivity = activity.getCallingActivity()) == null) {
                return b;
            }
            String packageName = callingActivity.getPackageName();
            return packageName.startsWith("net.dinglisch.android.tasker") && TaskerPlugin.m21264f(activity.getPackageManager(), packageName) > 80;
        }

        /* renamed from: b */
        public static boolean m21268b(Bundle bundle) {
            return TaskerPlugin.m21265g(bundle, 8);
        }

        /* renamed from: c */
        public static void m21269c(Bundle bundle, String[] strArr) {
            TaskerPlugin.m21262d(strArr, bundle, "net.dinglisch.android.tasker.extras.VARIABLE_REPLACE_KEYS", "setVariableReplaceKeys");
        }
    }

    /* renamed from: c */
    public static void m21261c(Intent intent, String[] strArr) {
        intent.putExtra("net.dinglisch.android.tasker.RELEVANT_VARIABLES", strArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m21262d(String[] strArr, Bundle bundle, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (strArr != null) {
            for (String str3 : strArr) {
                if (str3.contains(" ")) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(": ignoring bad keyName containing space: ");
                    sb2.append(str3);
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
    private static Object m21263e(Bundle bundle, String str, Class<?> cls, String str2) {
        if (bundle != null && bundle.containsKey(str)) {
            Object obj = bundle.get(str);
            if (obj == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(": ");
                sb.append(str);
                sb.append(": null value");
            } else if (obj.getClass() == cls) {
                return obj;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(": ");
                sb2.append(str);
                sb2.append(": expected ");
                sb2.append(cls.getClass().getName());
                sb2.append(", got ");
                sb2.append(obj.getClass().getName());
            }
        }
        return null;
    }

    /* renamed from: f */
    public static int m21264f(PackageManager packageManager, String str) {
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
    public static boolean m21265g(Bundle bundle, int i) {
        Integer num = (Integer) m21263e(bundle, "net.dinglisch.android.tasker.extras.HOST_CAPABILITIES", Integer.class, "hostSupports");
        return num != null && (num.intValue() & i) > 0;
    }

    /* renamed from: h */
    public static boolean m21266h(Bundle bundle) {
        return m21265g(bundle, 16);
    }
}
