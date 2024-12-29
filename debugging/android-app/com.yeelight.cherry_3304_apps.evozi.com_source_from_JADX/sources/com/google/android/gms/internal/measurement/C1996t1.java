package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;

/* renamed from: com.google.android.gms.internal.measurement.t1 */
public final class C1996t1 {

    /* renamed from: a */
    private static volatile C1840j2<Boolean> f3724a = C1840j2.m5277d();

    /* renamed from: b */
    private static final Object f3725b = new Object();

    /* renamed from: a */
    private static boolean m6005a(Context context) {
        try {
            return (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: b */
    public static boolean m6006b(Context context, Uri uri) {
        boolean z;
        String authority = uri.getAuthority();
        boolean z2 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            StringBuilder sb = new StringBuilder(String.valueOf(authority).length() + 91);
            sb.append(authority);
            sb.append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            sb.toString();
            return false;
        }
        if (!f3724a.mo11699b()) {
            synchronized (f3725b) {
                if (f3724a.mo11699b()) {
                    boolean booleanValue = f3724a.mo11700c().booleanValue();
                    return booleanValue;
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 0);
                    if (resolveContentProvider == null || !"com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        z = false;
                        if (z && m6005a(context)) {
                            z2 = true;
                        }
                        f3724a = C1840j2.m5276a(Boolean.valueOf(z2));
                    }
                }
                z = true;
                z2 = true;
                f3724a = C1840j2.m5276a(Boolean.valueOf(z2));
            }
        }
        return f3724a.mo11700c().booleanValue();
    }
}
