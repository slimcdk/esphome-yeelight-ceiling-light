package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.RestrictedInheritance;
import javax.annotation.Nullable;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
@ShowFirstParty
@KeepForSdk
@CheckReturnValue
/* renamed from: com.google.android.gms.common.e */
public class C0884e {
    @Nullable

    /* renamed from: c */
    private static C0884e f906c;

    /* renamed from: a */
    private final Context f907a;

    /* renamed from: b */
    private volatile String f908b;

    public C0884e(@NonNull Context context) {
        this.f907a = context.getApplicationContext();
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static C0884e m1246a(@NonNull Context context) {
        C0917i.m1419j(context);
        synchronized (C0884e.class) {
            if (f906c == null) {
                C0945r.m1535d(context);
                f906c = new C0884e(context);
            }
        }
        return f906c;
    }

    @Nullable
    /* renamed from: d */
    static final C0941n m1247d(PackageInfo packageInfo, C0941n... nVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        C0942o oVar = new C0942o(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < nVarArr.length; i++) {
            if (nVarArr[i].equals(oVar)) {
                return nVarArr[i];
            }
        }
        return null;
    }

    /* renamed from: e */
    public static final boolean m1248e(@NonNull PackageInfo packageInfo, boolean z) {
        if (z && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if ((z ? m1247d(packageInfo, C0944q.f1110a) : m1247d(packageInfo, C0944q.f1110a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    /* renamed from: f */
    private final C0964w m1249f(String str, boolean z, boolean z2) {
        C0964w wVar;
        ApplicationInfo applicationInfo;
        String str2 = "null pkg";
        if (str == null) {
            return C0964w.m1593c(str2);
        }
        if (str.equals(this.f908b)) {
            return C0964w.m1592b();
        }
        if (C0945r.m1536e()) {
            wVar = C0945r.m1533b(str, C0879d.m1230e(this.f907a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.f907a.getPackageManager().getPackageInfo(str, 64);
                boolean e = C0879d.m1230e(this.f907a);
                if (packageInfo != null) {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        str2 = "single cert required";
                    } else {
                        C0942o oVar = new C0942o(packageInfo.signatures[0].toByteArray());
                        String str3 = packageInfo.packageName;
                        C0964w a = C0945r.m1532a(str3, oVar, e, false);
                        if (!a.f1177a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !C0945r.m1532a(str3, oVar, false, true).f1177a) {
                            wVar = a;
                        } else {
                            str2 = "debuggable release cert app rejected";
                        }
                    }
                }
                wVar = C0964w.m1593c(str2);
            } catch (PackageManager.NameNotFoundException e2) {
                return C0964w.m1594d("no pkg ".concat(str), e2);
            }
        }
        if (wVar.f1177a) {
            this.f908b = str;
        }
        return wVar;
    }

    @KeepForSdk
    /* renamed from: b */
    public boolean mo12141b(@NonNull PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m1248e(packageInfo, false)) {
            return true;
        }
        return m1248e(packageInfo, true) && C0879d.m1230e(this.f907a);
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: c */
    public boolean mo12142c(int i) {
        C0964w wVar;
        int length;
        String[] packagesForUid = this.f907a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            wVar = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    C0917i.m1419j(wVar);
                    break;
                }
                wVar = m1249f(packagesForUid[i2], false, false);
                if (wVar.f1177a) {
                    break;
                }
                i2++;
            }
        } else {
            wVar = C0964w.m1593c("no pkgs");
        }
        wVar.mo12433e();
        return wVar.f1177a;
    }
}
