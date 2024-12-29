package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.internal.C1610u0;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.p105j.C1620c;
import com.google.android.gms.common.util.C1655i;
import com.google.android.gms.common.util.C1660n;
import com.google.android.gms.common.util.C1663q;
import com.google.android.gms.common.util.C1670u;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.atomic.AtomicBoolean;

@ShowFirstParty
@KeepForSdk
/* renamed from: com.google.android.gms.common.g */
public class C1533g {
    @KeepForSdk
    @Deprecated

    /* renamed from: a */
    public static final int f2900a = 12451000;

    /* renamed from: b */
    private static boolean f2901b = false;
    @VisibleForTesting

    /* renamed from: c */
    private static boolean f2902c = false;
    @KeepForSdk
    @VisibleForTesting

    /* renamed from: d */
    static final AtomicBoolean f2903d = new AtomicBoolean();

    /* renamed from: e */
    private static final AtomicBoolean f2904e = new AtomicBoolean();

    @KeepForSdk
    @Deprecated
    /* renamed from: a */
    public static void m4148a(Context context) {
        if (!f2903d.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException unused) {
            }
        }
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    /* renamed from: b */
    public static int m4149b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    @KeepForSdk
    @Deprecated
    @VisibleForTesting
    /* renamed from: c */
    public static String m4150c(int i) {
        return ConnectionResult.m3599W(i);
    }

    @KeepForSdk
    /* renamed from: d */
    public static Context m4151d(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @KeepForSdk
    /* renamed from: e */
    public static Resources m4152e(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: f */
    public static boolean m4153f(Context context) {
        if (!f2902c) {
            try {
                PackageInfo e = C1620c.m4502a(context).mo11303e("com.google.android.gms", 64);
                C1534h.m4161a(context);
                if (e == null || C1534h.m4164f(e, false) || !C1534h.m4164f(e, true)) {
                    f2901b = false;
                } else {
                    f2901b = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Throwable th) {
                f2902c = true;
                throw th;
            }
            f2902c = true;
        }
        return f2901b || !C1655i.m4592b();
    }

    @KeepForSdk
    @Deprecated
    /* renamed from: g */
    public static int m4154g(Context context, int i) {
        try {
            context.getResources().getString(R$string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f2904e.get()) {
            int b = C1610u0.m4482b(context);
            if (b == 0) {
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            } else if (b != f2900a) {
                int i2 = f2900a;
                StringBuilder sb = new StringBuilder(320);
                sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                sb.append(i2);
                sb.append(" but found ");
                sb.append(b);
                sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new IllegalStateException(sb.toString());
            }
        }
        return m4160m(context, !C1655i.m4594d(context) && !C1655i.m4595e(context), i);
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    /* renamed from: h */
    public static boolean m4155h(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return m4157j(context, "com.google.android.gms");
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = ((android.os.UserManager) r1.getSystemService("user")).getApplicationRestrictions(r1.getPackageName());
     */
    @android.annotation.TargetApi(18)
    @com.google.android.gms.common.annotation.KeepForSdk
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m4156i(android.content.Context r1) {
        /*
            boolean r0 = com.google.android.gms.common.util.C1660n.m4604d()
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "user"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.os.UserManager r0 = (android.os.UserManager) r0
            java.lang.String r1 = r1.getPackageName()
            android.os.Bundle r1 = r0.getApplicationRestrictions(r1)
            if (r1 == 0) goto L_0x0028
            java.lang.String r0 = "restricted_profile"
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "true"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0028
            r1 = 1
            return r1
        L_0x0028:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.C1533g.m4156i(android.content.Context):boolean");
    }

    @TargetApi(21)
    /* renamed from: j */
    static boolean m4157j(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (C1660n.m4607g()) {
            try {
                for (PackageInstaller.SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(appPackageName.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            return equals ? applicationInfo.enabled : applicationInfo.enabled && !m4156i(context);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }

    @KeepForSdk
    @Deprecated
    /* renamed from: k */
    public static boolean m4158k(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    @TargetApi(19)
    @KeepForSdk
    @Deprecated
    /* renamed from: l */
    public static boolean m4159l(Context context, int i, String str) {
        return C1663q.m4616b(context, i, str);
    }

    @VisibleForTesting
    /* renamed from: m */
    private static int m4160m(Context context, boolean z, int i) {
        C1609u.m4465a(i >= 0);
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = null;
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused) {
                return 9;
            }
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            C1534h.m4161a(context);
            if (!C1534h.m4164f(packageInfo2, true)) {
                return 9;
            }
            if (z && (!C1534h.m4164f(packageInfo, true) || !packageInfo.signatures[0].equals(packageInfo2.signatures[0]))) {
                return 9;
            }
            if (C1670u.m4633a(packageInfo2.versionCode) < C1670u.m4633a(i)) {
                int i2 = packageInfo2.versionCode;
                StringBuilder sb = new StringBuilder(77);
                sb.append("Google Play services out of date.  Requires ");
                sb.append(i);
                sb.append(" but found ");
                sb.append(i2);
                sb.toString();
                return 2;
            }
            ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
            if (applicationInfo == null) {
                try {
                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", e);
                    return 1;
                }
            }
            return !applicationInfo.enabled ? 3 : 0;
        } catch (PackageManager.NameNotFoundException unused2) {
            return 1;
        }
    }
}
