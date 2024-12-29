package com.google.android.gms.common.p105j;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.C1660n;

@KeepForSdk
/* renamed from: com.google.android.gms.common.j.b */
public class C1619b {

    /* renamed from: a */
    private final Context f3097a;

    public C1619b(Context context) {
        this.f3097a = context;
    }

    @KeepForSdk
    /* renamed from: a */
    public int mo11299a(String str) {
        return this.f3097a.checkCallingOrSelfPermission(str);
    }

    @KeepForSdk
    /* renamed from: b */
    public int mo11300b(String str, String str2) {
        return this.f3097a.getPackageManager().checkPermission(str, str2);
    }

    @KeepForSdk
    /* renamed from: c */
    public ApplicationInfo mo11301c(String str, int i) {
        return this.f3097a.getPackageManager().getApplicationInfo(str, i);
    }

    @KeepForSdk
    /* renamed from: d */
    public CharSequence mo11302d(String str) {
        return this.f3097a.getPackageManager().getApplicationLabel(this.f3097a.getPackageManager().getApplicationInfo(str, 0));
    }

    @KeepForSdk
    /* renamed from: e */
    public PackageInfo mo11303e(String str, int i) {
        return this.f3097a.getPackageManager().getPackageInfo(str, i);
    }

    /* renamed from: f */
    public final String[] mo11304f(int i) {
        return this.f3097a.getPackageManager().getPackagesForUid(i);
    }

    @KeepForSdk
    /* renamed from: g */
    public boolean mo11305g() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return C1618a.m4492a(this.f3097a);
        }
        if (!C1660n.m4609i() || (nameForUid = this.f3097a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f3097a.getPackageManager().isInstantApp(nameForUid);
    }

    /* renamed from: h */
    public final PackageInfo mo11306h(String str, int i, int i2) {
        return this.f3097a.getPackageManager().getPackageInfo(str, 64);
    }

    @TargetApi(19)
    /* renamed from: i */
    public final boolean mo11307i(int i, String str) {
        if (C1660n.m4605e()) {
            try {
                ((AppOpsManager) this.f3097a.getSystemService("appops")).checkPackage(i, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.f3097a.getPackageManager().getPackagesForUid(i);
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
