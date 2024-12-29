package com.xiaomi.push;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.xiaomi.push.h */
public class C4747h {

    /* renamed from: com.xiaomi.push.h$a */
    public enum C4748a {
        UNKNOWN(0),
        ALLOWED(1),
        NOT_ALLOWED(2);
        

        /* renamed from: a */
        private final int f8382a;

        private C4748a(int i) {
            this.f8382a = i;
        }

        /* renamed from: a */
        public int mo29273a() {
            return this.f8382a;
        }
    }

    /* renamed from: a */
    public static int m14122a(Context context) {
        Bundle bundle;
        if (context == null) {
            return 0;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.android.systemui", 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                return 0;
            }
            return bundle.getInt("SupportForPushVersionCode");
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static int m14123a(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (Exception unused) {
            packageInfo = null;
        }
        if (packageInfo != null) {
            return packageInfo.versionCode;
        }
        return 0;
    }

    /* renamed from: a */
    private static ApplicationInfo m14124a(Context context, String str) {
        if (str.equals(context.getPackageName())) {
            return context.getApplicationInfo();
        }
        try {
            return context.getPackageManager().getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            C4408b.m12464a("not found app info " + str);
            return null;
        }
    }

    /* renamed from: a */
    public static Drawable m14125a(Context context, String str) {
        ApplicationInfo a = m14123a(context, str);
        Drawable drawable = null;
        if (a != null) {
            try {
                drawable = a.loadIcon(context.getPackageManager());
                if (drawable == null) {
                    drawable = a.loadLogo(context.getPackageManager());
                }
            } catch (Exception e) {
                C4408b.m12464a("get app icon drawable failed, " + e);
            }
        }
        return drawable != null ? drawable : new ColorDrawable(0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.xiaomi.push.C4747h.C4748a m14126a(android.content.Context r5, android.content.pm.ApplicationInfo r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r6 == 0) goto L_0x0081
            r1 = 24
            if (r0 >= r1) goto L_0x000a
            goto L_0x0081
        L_0x000a:
            r1 = 0
            java.lang.String r2 = r6.packageName     // Catch:{ Exception -> 0x0069 }
            java.lang.String r3 = r5.getPackageName()     // Catch:{ Exception -> 0x0069 }
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x0069 }
            java.lang.String r3 = "notification"
            if (r2 == 0) goto L_0x0028
            java.lang.Object r5 = r5.getSystemService(r3)     // Catch:{ Exception -> 0x0069 }
            android.app.NotificationManager r5 = (android.app.NotificationManager) r5     // Catch:{ Exception -> 0x0069 }
            boolean r5 = r5.areNotificationsEnabled()     // Catch:{ Exception -> 0x0069 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)     // Catch:{ Exception -> 0x0069 }
            goto L_0x005b
        L_0x0028:
            r2 = 29
            r4 = 0
            if (r0 < r2) goto L_0x003a
            java.lang.Object r5 = r5.getSystemService(r3)     // Catch:{ Exception -> 0x0069 }
            java.lang.String r0 = "getService"
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0069 }
            java.lang.Object r5 = com.xiaomi.push.C4554bk.m13012a((java.lang.Object) r5, (java.lang.String) r0, (java.lang.Object[]) r2)     // Catch:{ Exception -> 0x0069 }
            goto L_0x0040
        L_0x003a:
            java.lang.String r0 = "security"
            java.lang.Object r5 = r5.getSystemService(r0)     // Catch:{ Exception -> 0x0069 }
        L_0x0040:
            if (r5 == 0) goto L_0x005b
            java.lang.String r0 = "areNotificationsEnabledForPackage"
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0069 }
            java.lang.String r2 = r6.packageName     // Catch:{ Exception -> 0x0069 }
            r1[r4] = r2     // Catch:{ Exception -> 0x0069 }
            r2 = 1
            int r6 = r6.uid     // Catch:{ Exception -> 0x0069 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0069 }
            r1[r2] = r6     // Catch:{ Exception -> 0x0069 }
            java.lang.Object r5 = com.xiaomi.push.C4554bk.m13021b((java.lang.Object) r5, (java.lang.String) r0, (java.lang.Object[]) r1)     // Catch:{ Exception -> 0x0069 }
            r1 = r5
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ Exception -> 0x0069 }
        L_0x005b:
            if (r1 == 0) goto L_0x007e
            boolean r5 = r1.booleanValue()     // Catch:{ Exception -> 0x0069 }
            if (r5 == 0) goto L_0x0066
            com.xiaomi.push.h$a r5 = com.xiaomi.push.C4747h.C4748a.ALLOWED     // Catch:{ Exception -> 0x0069 }
            goto L_0x0068
        L_0x0066:
            com.xiaomi.push.h$a r5 = com.xiaomi.push.C4747h.C4748a.NOT_ALLOWED     // Catch:{ Exception -> 0x0069 }
        L_0x0068:
            return r5
        L_0x0069:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "are notifications enabled error "
            r6.append(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r5)
        L_0x007e:
            com.xiaomi.push.h$a r5 = com.xiaomi.push.C4747h.C4748a.UNKNOWN
            return r5
        L_0x0081:
            com.xiaomi.push.h$a r5 = com.xiaomi.push.C4747h.C4748a.UNKNOWN
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4747h.m14126a(android.content.Context, android.content.pm.ApplicationInfo):com.xiaomi.push.h$a");
    }

    @TargetApi(19)
    /* renamed from: a */
    public static C4748a m14127a(Context context, String str, boolean z) {
        if (context == null || TextUtils.isEmpty(str)) {
            return C4748a.UNKNOWN;
        }
        try {
            ApplicationInfo applicationInfo = str.equals(context.getPackageName()) ? context.getApplicationInfo() : context.getPackageManager().getApplicationInfo(str, 0);
            C4748a a = m14126a(context, applicationInfo);
            C4748a aVar = C4748a.UNKNOWN;
            if (a != aVar) {
                return a;
            }
            Integer num = (Integer) C4554bk.m13009a((Class<? extends Object>) AppOpsManager.class, "OP_POST_NOTIFICATION");
            if (num == null) {
                return aVar;
            }
            Integer num2 = (Integer) C4554bk.m13012a((Object) (AppOpsManager) context.getSystemService("appops"), "checkOpNoThrow", num, Integer.valueOf(applicationInfo.uid), str);
            int i = (Integer) C4554bk.m13009a((Class<? extends Object>) AppOpsManager.class, "MODE_ALLOWED");
            int i2 = (Integer) C4554bk.m13009a((Class<? extends Object>) AppOpsManager.class, "MODE_IGNORED");
            C4408b.m12481b(String.format("get app mode %s|%s|%s", new Object[]{num2, i, i2}));
            if (i == null) {
                i = 0;
            }
            if (i2 == null) {
                i2 = 1;
            }
            if (num2 != null) {
                return z ? !num2.equals(i2) ? C4748a.ALLOWED : C4748a.NOT_ALLOWED : num2.equals(i) ? C4748a.ALLOWED : C4748a.NOT_ALLOWED;
            }
            return C4748a.UNKNOWN;
        } catch (Throwable th) {
            C4408b.m12464a("get app op error " + th);
        }
    }

    /* renamed from: a */
    public static String m14128a(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (Exception unused) {
            packageInfo = null;
        }
        return packageInfo != null ? packageInfo.versionName : "1.0";
    }

    /* renamed from: a */
    public static boolean m14129a(Context context) {
        String str = (String) C4554bk.m13014a("android.app.ActivityThread", "currentProcessName", new Object[0]);
        if (TextUtils.isEmpty(str) || context == null) {
            return false;
        }
        return str.equals(context.getPackageName());
    }

    /* renamed from: a */
    public static boolean m14130a(Context context, String str) {
        if (!C4830m.m14997a()) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (Arrays.asList(runningAppProcessInfo.pkgList).contains(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static int m14131b(Context context, String str) {
        ApplicationInfo a = m14123a(context, str);
        if (a == null) {
            return 0;
        }
        int i = a.icon;
        return i == 0 ? a.logo : i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        r0 = r0.applicationInfo;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m14132b(android.content.Context r1, java.lang.String r2) {
        /*
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0018 }
            r0 = 0
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x0018 }
            if (r0 == 0) goto L_0x0018
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo     // Catch:{ NameNotFoundException -> 0x0018 }
            if (r0 == 0) goto L_0x0018
            java.lang.CharSequence r1 = r1.getApplicationLabel(r0)     // Catch:{ NameNotFoundException -> 0x0018 }
            java.lang.String r1 = r1.toString()     // Catch:{ NameNotFoundException -> 0x0018 }
            r2 = r1
        L_0x0018:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4747h.m14132b(android.content.Context, java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public static boolean m14133b(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        return packageInfo != null;
    }

    /* renamed from: c */
    public static boolean m14134c(Context context, String str) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    /* renamed from: d */
    public static boolean m14135d(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (Settings.Secure.getInt(context.getContentResolver(), "freeform_window_state", -1) >= 0) {
                return str.equals(Settings.Secure.getString(context.getContentResolver(), "freeform_package_name"));
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
