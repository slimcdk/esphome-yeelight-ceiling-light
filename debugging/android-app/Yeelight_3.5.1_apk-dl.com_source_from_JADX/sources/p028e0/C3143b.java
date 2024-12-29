package p028e0;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import p014c0.C0624m;

@KeepForSdk
/* renamed from: e0.b */
public class C3143b {
    @NonNull

    /* renamed from: a */
    protected final Context f5038a;

    public C3143b(@NonNull Context context) {
        this.f5038a = context;
    }

    @KeepForSdk
    /* renamed from: a */
    public int mo23626a(@NonNull String str) {
        return this.f5038a.checkCallingOrSelfPermission(str);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public ApplicationInfo mo23627b(@NonNull String str, int i) {
        return this.f5038a.getPackageManager().getApplicationInfo(str, i);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: c */
    public CharSequence mo23628c(@NonNull String str) {
        return this.f5038a.getPackageManager().getApplicationLabel(this.f5038a.getPackageManager().getApplicationInfo(str, 0));
    }

    @NonNull
    @KeepForSdk
    /* renamed from: d */
    public PackageInfo mo23629d(@NonNull String str, int i) {
        return this.f5038a.getPackageManager().getPackageInfo(str, i);
    }

    @KeepForSdk
    /* renamed from: e */
    public boolean mo23630e() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return C3142a.m8396a(this.f5038a);
        }
        if (!C0624m.m229h() || (nameForUid = this.f5038a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f5038a.getPackageManager().isInstantApp(nameForUid);
    }

    @TargetApi(19)
    /* renamed from: f */
    public final boolean mo23631f(int i, @NonNull String str) {
        if (C0624m.m225d()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f5038a.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(i, str);
                    return true;
                }
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.f5038a.getPackageManager().getPackagesForUid(i);
            if (!(str == null || packagesForUid == null)) {
                for (String equals : packagesForUid) {
                    if (str.equals(equals)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
