package com.xiaomi.push.service;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4525ba;
import java.util.List;

/* renamed from: com.xiaomi.push.service.aj */
class C4853aj {

    /* renamed from: a */
    private static String f9966a;

    /* renamed from: a */
    private static final String[] f9967a = {"com.mi.globalbrowser", "com.android.browser"};

    /* renamed from: a */
    static int m15564a(Context context, String str) {
        ApplicationInfo applicationInfo;
        if (str.equals(context.getPackageName())) {
            applicationInfo = context.getApplicationInfo();
        } else {
            try {
                applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
            } catch (PackageManager.NameNotFoundException unused) {
                C3989b.m10669a("not found app info " + str);
                applicationInfo = null;
            }
        }
        if (applicationInfo == null) {
            return 0;
        }
        int i = applicationInfo.icon;
        return (i != 0 || Build.VERSION.SDK_INT < 9) ? i : applicationInfo.logo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        r3 = com.xiaomi.push.C4525ba.m13402a((java.lang.Object) r3, "extraNotification");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String m15565a(android.app.Notification r3) {
        /*
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x002d }
            r2 = 19
            if (r1 < r2) goto L_0x0013
            android.os.Bundle r1 = r3.extras     // Catch:{ Exception -> 0x002d }
            if (r1 == 0) goto L_0x0013
            android.os.Bundle r1 = r3.extras     // Catch:{ Exception -> 0x002d }
            java.lang.String r2 = "target_package"
            java.lang.String r0 = r1.getString(r2)     // Catch:{ Exception -> 0x002d }
        L_0x0013:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x002d }
            if (r1 == 0) goto L_0x002d
            java.lang.String r1 = "extraNotification"
            java.lang.Object r3 = com.xiaomi.push.C4525ba.m13402a((java.lang.Object) r3, (java.lang.String) r1)     // Catch:{ Exception -> 0x002d }
            if (r3 == 0) goto L_0x002d
            java.lang.String r1 = "getTargetPkg"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x002d }
            java.lang.Object r3 = com.xiaomi.push.C4525ba.m13403a((java.lang.Object) r3, (java.lang.String) r1, (java.lang.Object[]) r2)     // Catch:{ Exception -> 0x002d }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x002d }
            r0 = r3
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4853aj.m15565a(android.app.Notification):java.lang.String");
    }

    /* renamed from: a */
    static void m15566a(Notification notification, String str) {
        try {
            if (Build.VERSION.SDK_INT >= 19 && notification.extras != null) {
                notification.extras.putString("target_package", str);
            }
            Object a = C4525ba.m13402a((Object) notification, "extraNotification");
            if (a != null) {
                C4525ba.m13403a(a, "setTargetPkg", str);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    static void m15567a(Context context, Intent intent) {
        String str;
        int i = -1;
        while (true) {
            str = i < 0 ? f9966a : f9967a[i];
            if (!TextUtils.isEmpty(str)) {
                intent.setPackage(str);
                try {
                    List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
                    if (queryIntentActivities != null && queryIntentActivities.size() > 0) {
                        break;
                    }
                } catch (Exception e) {
                    C3989b.m10669a("not found xm browser:" + e);
                }
            }
            i++;
            if (i >= f9967a.length) {
                str = null;
                break;
            }
        }
        intent.setPackage(str);
        f9966a = str;
    }
}
