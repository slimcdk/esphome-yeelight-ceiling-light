package p099t1;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import p066m1.C3343c;

/* renamed from: t1.a */
public class C3703a {

    /* renamed from: a */
    private final Context f6216a;

    /* renamed from: b */
    private final SharedPreferences f6217b;

    /* renamed from: c */
    private final C3343c f6218c;

    /* renamed from: d */
    private boolean f6219d = m10575c();

    public C3703a(Context context, String str, C3343c cVar) {
        Context a = m10574a(context);
        this.f6216a = a;
        this.f6217b = a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f6218c = cVar;
    }

    /* renamed from: a */
    private static Context m10574a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : ContextCompat.createDeviceProtectedStorageContext(context);
    }

    /* renamed from: c */
    private boolean m10575c() {
        return this.f6217b.contains("firebase_data_collection_default_enabled") ? this.f6217b.getBoolean("firebase_data_collection_default_enabled", true) : m10576d();
    }

    /* renamed from: d */
    private boolean m10576d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f6216a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f6216a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    /* renamed from: b */
    public synchronized boolean mo26111b() {
        return this.f6219d;
    }
}
