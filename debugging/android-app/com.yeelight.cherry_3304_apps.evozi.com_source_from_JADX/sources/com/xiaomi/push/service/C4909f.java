package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import com.xiaomi.channel.commonutils.logger.C3989b;
import java.util.List;

/* renamed from: com.xiaomi.push.service.f */
public class C4909f {
    /* renamed from: a */
    public static boolean m15741a(Context context, String str) {
        try {
            ServiceInfo[] serviceInfoArr = context.getPackageManager().getPackageInfo(str, 4).services;
            if (serviceInfoArr == null) {
                return false;
            }
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                if (serviceInfo.exported && serviceInfo.enabled && "com.xiaomi.mipush.sdk.PushMessageHandler".equals(serviceInfo.name) && !context.getPackageName().equals(serviceInfo.packageName)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            C3989b.m10678a((Throwable) e);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m15742a(Context context, String str, String str2) {
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent(str2);
            intent.setPackage(str);
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 32);
            return queryIntentServices != null && !queryIntentServices.isEmpty();
        } catch (Exception e) {
            C3989b.m10678a((Throwable) e);
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m15743b(Context context, String str) {
        boolean z = false;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (Build.VERSION.SDK_INT < 19) {
                return true;
            }
            List<ProviderInfo> queryContentProviders = packageManager.queryContentProviders((String) null, 0, 8);
            if (queryContentProviders != null && !queryContentProviders.isEmpty()) {
                for (ProviderInfo next : queryContentProviders) {
                    if (next.enabled && next.exported && next.authority.equals(str)) {
                        z = true;
                    }
                }
            }
            return z;
        } catch (Exception e) {
            C3989b.m10678a((Throwable) e);
        }
    }

    /* renamed from: b */
    public static boolean m15744b(Context context, String str, String str2) {
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent(str2);
            intent.setPackage(str);
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 32);
            return queryIntentActivities != null && !queryIntentActivities.isEmpty();
        } catch (Exception e) {
            C3989b.m10678a((Throwable) e);
            return false;
        }
    }
}
