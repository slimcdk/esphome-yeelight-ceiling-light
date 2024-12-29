package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;

/* renamed from: com.google.android.gms.internal.measurement.e6 */
public final class C1076e6 {

    /* renamed from: a */
    static volatile zzid f1298a = zzid.zzc();

    /* renamed from: b */
    private static final Object f1299b = new Object();

    /* renamed from: a */
    public static boolean m1893a(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            return false;
        }
        if (!f1298a.zzb()) {
            synchronized (f1299b) {
                if (f1298a.zzb()) {
                    boolean booleanValue = ((Boolean) f1298a.zza()).booleanValue();
                    return booleanValue;
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                    if (resolveContentProvider != null) {
                        if (!"com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        }
                    }
                    f1298a = zzid.zzd(Boolean.valueOf(z));
                }
                try {
                    if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                        z = true;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                f1298a = zzid.zzd(Boolean.valueOf(z));
            }
        }
        return ((Boolean) f1298a.zza()).booleanValue();
    }
}
