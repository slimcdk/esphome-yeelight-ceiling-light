package com.google.firebase.p137j;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.core.content.ContextCompat;
import com.google.firebase.p131g.C3194c;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.firebase.j.a */
public class C3309a {

    /* renamed from: a */
    private final Context f6411a;

    /* renamed from: b */
    private final SharedPreferences f6412b;

    /* renamed from: c */
    private final AtomicBoolean f6413c = new AtomicBoolean(m10296c());

    public C3309a(Context context, String str, C3194c cVar) {
        this.f6411a = m10295a(context);
        this.f6412b = context.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
    }

    /* renamed from: a */
    private static Context m10295a(Context context) {
        return (Build.VERSION.SDK_INT < 24 || ContextCompat.isDeviceProtectedStorage(context)) ? context : ContextCompat.createDeviceProtectedStorageContext(context);
    }

    /* renamed from: c */
    private boolean m10296c() {
        ApplicationInfo applicationInfo;
        if (this.f6412b.contains("firebase_data_collection_default_enabled")) {
            return this.f6412b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        try {
            PackageManager packageManager = this.f6411a.getPackageManager();
            if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f6411a.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled"))) {
                return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo17965b() {
        return this.f6413c.get();
    }
}
