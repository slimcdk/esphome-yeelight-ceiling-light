package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.p105j.C1620c;
import javax.annotation.CheckReturnValue;

@ShowFirstParty
@CheckReturnValue
@KeepForSdk
/* renamed from: com.google.android.gms.common.h */
public class C1534h {

    /* renamed from: b */
    private static C1534h f2905b;

    /* renamed from: a */
    private final Context f2906a;

    private C1534h(Context context) {
        this.f2906a = context.getApplicationContext();
    }

    @KeepForSdk
    /* renamed from: a */
    public static C1534h m4161a(Context context) {
        C1609u.m4475k(context);
        synchronized (C1534h.class) {
            if (f2905b == null) {
                C1623m.m4506c(context);
                f2905b = new C1534h(context);
            }
        }
        return f2905b;
    }

    /* renamed from: d */
    private static C1625o m4162d(PackageInfo packageInfo, C1625o... oVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        C1626p pVar = new C1626p(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < oVarArr.length; i++) {
            if (oVarArr[i].equals(pVar)) {
                return oVarArr[i];
            }
        }
        return null;
    }

    /* renamed from: e */
    private final C1672v m4163e(String str, int i) {
        try {
            PackageInfo h = C1620c.m4502a(this.f2906a).mo11306h(str, 64, i);
            boolean f = C1533g.m4153f(this.f2906a);
            if (h == null) {
                return C1672v.m4637d("null pkg");
            }
            if (h.signatures.length != 1) {
                return C1672v.m4637d("single cert required");
            }
            C1626p pVar = new C1626p(h.signatures[0].toByteArray());
            String str2 = h.packageName;
            C1672v a = C1623m.m4504a(str2, pVar, f, false);
            return (!a.f3195a || h.applicationInfo == null || (h.applicationInfo.flags & 2) == 0 || !C1623m.m4504a(str2, pVar, false, true).f3195a) ? a : C1672v.m4637d("debuggable release cert app rejected");
        } catch (PackageManager.NameNotFoundException unused) {
            String valueOf = String.valueOf(str);
            return C1672v.m4637d(valueOf.length() != 0 ? "no pkg ".concat(valueOf) : new String("no pkg "));
        }
    }

    /* renamed from: f */
    public static boolean m4164f(PackageInfo packageInfo, boolean z) {
        C1625o oVar;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                oVar = m4162d(packageInfo, C1628r.f3110a);
            } else {
                oVar = m4162d(packageInfo, C1628r.f3110a[0]);
            }
            if (oVar != null) {
                return true;
            }
        }
        return false;
    }

    @KeepForSdk
    /* renamed from: b */
    public boolean mo11094b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m4164f(packageInfo, false)) {
            return true;
        }
        return m4164f(packageInfo, true) && C1533g.m4153f(this.f2906a);
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: c */
    public boolean mo11095c(int i) {
        C1672v vVar;
        String[] f = C1620c.m4502a(this.f2906a).mo11304f(i);
        if (f != null && f.length != 0) {
            vVar = null;
            for (String e : f) {
                vVar = m4163e(e, i);
                if (vVar.f3195a) {
                    break;
                }
            }
        } else {
            vVar = C1672v.m4637d("no pkgs");
        }
        vVar.mo11386g();
        return vVar.f3195a;
    }
}
