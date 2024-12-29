package com.xiaomi.push.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.xiaomi.channel.commonutils.logger.C4408b;
import java.util.List;

/* renamed from: com.xiaomi.push.service.l */
public class C4969l {
    /* renamed from: a */
    public static ComponentName m15573a(Context context, Intent intent) {
        if (intent == null) {
            return null;
        }
        try {
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (resolveActivity == null) {
                return null;
            }
            ActivityInfo activityInfo = resolveActivity.activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m15574a(Context context, ComponentName componentName) {
        try {
            new Intent().setComponent(componentName);
            context.getPackageManager().getActivityInfo(componentName, 128);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m15575a(Context context, String str) {
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
            C4408b.m12464a("checkService " + e);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m15576a(Context context, String str, String str2) {
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent(str2);
            intent.setPackage(str);
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 32);
            return queryIntentServices != null && !queryIntentServices.isEmpty();
        } catch (Exception e) {
            C4408b.m12464a("checkService action: " + str2 + ", " + e);
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m15577b(Context context, String str) {
        boolean z = false;
        try {
            List<ProviderInfo> queryContentProviders = context.getPackageManager().queryContentProviders((String) null, 0, 8);
            if (queryContentProviders != null && !queryContentProviders.isEmpty()) {
                for (ProviderInfo next : queryContentProviders) {
                    if (next.enabled && next.exported && next.authority.equals(str)) {
                        z = true;
                    }
                }
            }
        } catch (Exception e) {
            C4408b.m12464a("checkProvider " + e);
        }
        return z;
    }

    /* renamed from: b */
    public static boolean m15578b(Context context, String str, String str2) {
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent(str2);
            intent.setPackage(str);
            return packageManager.resolveActivity(intent, 65536) != null;
        } catch (Exception e) {
            C4408b.m12464a("checkActivity action: " + str2 + ", " + e);
            return false;
        }
    }
}
