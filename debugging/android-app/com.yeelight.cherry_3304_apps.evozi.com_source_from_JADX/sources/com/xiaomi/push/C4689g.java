package com.xiaomi.push;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.xiaomi.push.g */
public class C4689g {

    /* renamed from: com.xiaomi.push.g$a */
    public enum C4690a {
        UNKNOWN(0),
        ALLOWED(1),
        NOT_ALLOWED(2);
        

        /* renamed from: a */
        private final int f8798a;

        private C4690a(int i) {
            this.f8798a = i;
        }

        /* renamed from: a */
        public int mo25171a() {
            return this.f8798a;
        }
    }

    /* renamed from: a */
    public static int m14350a(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (Exception e) {
            C3989b.m10678a((Throwable) e);
            packageInfo = null;
        }
        if (packageInfo != null) {
            return packageInfo.versionCode;
        }
        return 0;
    }

    @TargetApi(19)
    /* renamed from: a */
    public static C4690a m14351a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str) || Build.VERSION.SDK_INT < 19) {
            return C4690a.UNKNOWN;
        }
        try {
            Integer num = (Integer) C4525ba.m13400a((Class<? extends Object>) AppOpsManager.class, "OP_POST_NOTIFICATION");
            if (num == null) {
                return C4690a.UNKNOWN;
            }
            Integer num2 = (Integer) C4525ba.m13403a((Object) (AppOpsManager) context.getSystemService("appops"), "checkOpNoThrow", num, Integer.valueOf(context.getPackageManager().getApplicationInfo(str, 0).uid), str);
            return (num2 == null || num2.intValue() != 0) ? C4690a.NOT_ALLOWED : C4690a.ALLOWED;
        } catch (Throwable unused) {
            return C4690a.UNKNOWN;
        }
    }

    /* renamed from: a */
    public static String m14352a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null || (runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) == null) {
            return null;
        }
        int myPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.pid == myPid) {
                return next.processName;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m14353a(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (Exception e) {
            C3989b.m10678a((Throwable) e);
            packageInfo = null;
        }
        return packageInfo != null ? packageInfo.versionName : "1.0";
    }

    /* renamed from: a */
    public static boolean m14354a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null && runningAppProcesses.size() >= 1) {
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.pid == Process.myPid() && next.processName.equals(context.getPackageName())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m14355a(Context context, String str) {
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
    public static String m14356b(Context context) {
        String str;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        if (runningAppProcesses != null && runningAppProcesses.size() > 0) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                String[] strArr = runningAppProcessInfo.pkgList;
                int i = 0;
                while (strArr != null && i < strArr.length) {
                    if (!arrayList.contains(strArr[i])) {
                        arrayList.add(strArr[i]);
                        if (arrayList.size() == 1) {
                            str = (String) arrayList.get(0);
                        } else {
                            sb.append("#");
                            str = strArr[i];
                        }
                        sb.append(str.hashCode() % 100000);
                    }
                    i++;
                }
            }
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        r0 = r0.applicationInfo;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m14357b(android.content.Context r1, java.lang.String r2) {
        /*
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0019 }
            r0 = 0
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r0 == 0) goto L_0x001d
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r0 == 0) goto L_0x001d
            java.lang.CharSequence r1 = r1.getApplicationLabel(r0)     // Catch:{ NameNotFoundException -> 0x0019 }
            java.lang.String r1 = r1.toString()     // Catch:{ NameNotFoundException -> 0x0019 }
            r2 = r1
            goto L_0x001d
        L_0x0019:
            r1 = move-exception
            com.xiaomi.channel.commonutils.logger.C3989b.m10678a((java.lang.Throwable) r1)
        L_0x001d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4689g.m14357b(android.content.Context, java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public static boolean m14358b(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        return packageInfo != null;
    }

    /* renamed from: c */
    public static boolean m14359c(Context context, String str) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }
}
