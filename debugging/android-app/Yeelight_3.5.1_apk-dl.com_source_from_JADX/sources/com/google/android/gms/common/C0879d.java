package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.atomic.AtomicBoolean;
import p014c0.C0620i;
import p014c0.C0624m;
import p014c0.C0625n;
import p028e0.C3144c;

@ShowFirstParty
@KeepForSdk
/* renamed from: com.google.android.gms.common.d */
public class C0879d {
    @KeepForSdk
    @Deprecated

    /* renamed from: a */
    public static final int f886a = 12451000;
    @KeepForSdk
    @VisibleForTesting

    /* renamed from: b */
    static final AtomicBoolean f887b = new AtomicBoolean();

    /* renamed from: c */
    private static boolean f888c = false;
    @VisibleForTesting

    /* renamed from: d */
    static boolean f889d = false;

    /* renamed from: e */
    private static final AtomicBoolean f890e = new AtomicBoolean();

    @KeepForSdk
    @Deprecated
    /* renamed from: a */
    public static void m1226a(@NonNull Context context) {
        if (!f887b.getAndSet(true)) {
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
    public static int m1227b(@NonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    @VisibleForTesting
    /* renamed from: c */
    public static String m1228c(int i) {
        return ConnectionResult.m609g0(i);
    }

    @KeepForSdk
    @Nullable
    /* renamed from: d */
    public static Resources m1229d(@NonNull Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: e */
    public static boolean m1230e(@NonNull Context context) {
        if (!f889d) {
            try {
                PackageInfo d = C3144c.m8403a(context).mo23629d("com.google.android.gms", 64);
                C0884e.m1246a(context);
                if (d == null || C0884e.m1248e(d, false) || !C0884e.m1248e(d, true)) {
                    f888c = false;
                } else {
                    f888c = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Throwable th) {
                f889d = true;
                throw th;
            }
            f889d = true;
        }
        return f888c || !C0620i.m213b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089  */
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m1231f(@androidx.annotation.NonNull android.content.Context r9, int r10) {
        /*
            android.content.res.Resources r0 = r9.getResources()     // Catch:{ all -> 0x000a }
            int r1 = com.google.android.gms.common.R$string.common_google_play_services_unknown_issue     // Catch:{ all -> 0x000a }
            r0.getString(r1)     // Catch:{ all -> 0x000a }
            goto L_0x000b
        L_0x000a:
        L_0x000b:
            java.lang.String r0 = r9.getPackageName()
            java.lang.String r1 = "com.google.android.gms"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0037
            java.util.concurrent.atomic.AtomicBoolean r0 = f890e
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x0020
            goto L_0x0037
        L_0x0020:
            int r0 = com.google.android.gms.common.internal.C0929t.m1495a(r9)
            if (r0 == 0) goto L_0x0031
            int r2 = f886a
            if (r0 != r2) goto L_0x002b
            goto L_0x0037
        L_0x002b:
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r9 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            r9.<init>(r0)
            throw r9
        L_0x0031:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r9 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r9.<init>()
            throw r9
        L_0x0037:
            boolean r0 = p014c0.C0620i.m215d(r9)
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0047
            boolean r0 = p014c0.C0620i.m217f(r9)
            if (r0 != 0) goto L_0x0047
            r0 = 1
            goto L_0x0048
        L_0x0047:
            r0 = 0
        L_0x0048:
            if (r10 < 0) goto L_0x004c
            r4 = 1
            goto L_0x004d
        L_0x004c:
            r4 = 0
        L_0x004d:
            com.google.android.gms.common.internal.C0917i.m1410a(r4)
            java.lang.String r4 = r9.getPackageName()
            android.content.pm.PackageManager r5 = r9.getPackageManager()
            r6 = 9
            if (r0 == 0) goto L_0x0072
            java.lang.String r7 = "com.android.vending"
            r8 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r7 = r5.getPackageInfo(r7, r8)     // Catch:{ NameNotFoundException -> 0x0065 }
            goto L_0x0073
        L_0x0065:
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String r10 = " requires the Google Play Store, but it is missing."
        L_0x006b:
            r9.concat(r10)
            r2 = 9
            goto L_0x010b
        L_0x0072:
            r7 = 0
        L_0x0073:
            r8 = 64
            android.content.pm.PackageInfo r8 = r5.getPackageInfo(r1, r8)     // Catch:{ NameNotFoundException -> 0x0102 }
            com.google.android.gms.common.C0884e.m1246a(r9)
            boolean r9 = com.google.android.gms.common.C0884e.m1248e(r8, r2)
            if (r9 != 0) goto L_0x0089
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String r10 = " requires Google Play services, but their signature is invalid."
            goto L_0x006b
        L_0x0089:
            if (r0 == 0) goto L_0x009b
            com.google.android.gms.common.internal.C0917i.m1419j(r7)
            boolean r9 = com.google.android.gms.common.C0884e.m1248e(r7, r2)
            if (r9 != 0) goto L_0x009b
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String r10 = " requires Google Play Store, but its signature is invalid."
            goto L_0x006b
        L_0x009b:
            if (r0 == 0) goto L_0x00b4
            if (r7 == 0) goto L_0x00b4
            android.content.pm.Signature[] r9 = r7.signatures
            r9 = r9[r3]
            android.content.pm.Signature[] r0 = r8.signatures
            r0 = r0[r3]
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x00b4
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String r10 = " requires Google Play Store, but its signature doesn't match that of Google Play services."
            goto L_0x006b
        L_0x00b4:
            int r9 = r8.versionCode
            int r9 = p014c0.C0626o.m235a(r9)
            int r0 = p014c0.C0626o.m235a(r10)
            if (r9 >= r0) goto L_0x00e1
            int r9 = r8.versionCode
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Google Play services out of date for "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = ".  Requires "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = " but found "
            r0.append(r10)
            r0.append(r9)
            r2 = 2
            goto L_0x010b
        L_0x00e1:
            android.content.pm.ApplicationInfo r9 = r8.applicationInfo
            if (r9 != 0) goto L_0x00fb
            android.content.pm.ApplicationInfo r9 = r5.getApplicationInfo(r1, r3)     // Catch:{ NameNotFoundException -> 0x00ea }
            goto L_0x00fb
        L_0x00ea:
            r9 = move-exception
            java.lang.String r10 = java.lang.String.valueOf(r4)
            java.lang.String r0 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r10 = r10.concat(r0)
            java.lang.String r0 = "GooglePlayServicesUtil"
            android.util.Log.wtf(r0, r10, r9)
            goto L_0x010b
        L_0x00fb:
            boolean r9 = r9.enabled
            if (r9 != 0) goto L_0x0101
            r2 = 3
            goto L_0x010b
        L_0x0101:
            return r3
        L_0x0102:
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String r10 = " requires Google Play services, but they are missing."
            r9.concat(r10)
        L_0x010b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.C0879d.m1231f(android.content.Context, int):int");
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    /* renamed from: g */
    public static boolean m1232g(@NonNull Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return m1236k(context, "com.google.android.gms");
        }
        return false;
    }

    @TargetApi(18)
    @KeepForSdk
    /* renamed from: h */
    public static boolean m1233h(@NonNull Context context) {
        if (!C0624m.m224c()) {
            return false;
        }
        Object systemService = context.getSystemService("user");
        C0917i.m1419j(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @KeepForSdk
    @Deprecated
    /* renamed from: i */
    public static boolean m1234i(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    @TargetApi(19)
    @KeepForSdk
    @Deprecated
    /* renamed from: j */
    public static boolean m1235j(@NonNull Context context, int i, @NonNull String str) {
        return C0625n.m234b(context, i, str);
    }

    @TargetApi(21)
    /* renamed from: k */
    static boolean m1236k(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (C0624m.m227f()) {
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
            return equals ? applicationInfo.enabled : applicationInfo.enabled && !m1233h(context);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }
}
