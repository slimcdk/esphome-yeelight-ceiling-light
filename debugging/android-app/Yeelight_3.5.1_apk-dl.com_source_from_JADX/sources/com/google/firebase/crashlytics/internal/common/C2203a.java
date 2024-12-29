package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import p118y0.C3913e;

/* renamed from: com.google.firebase.crashlytics.internal.common.a */
public class C2203a {

    /* renamed from: a */
    public final String f3514a;

    /* renamed from: b */
    public final String f3515b;

    /* renamed from: c */
    public final String f3516c;

    /* renamed from: d */
    public final String f3517d;

    /* renamed from: e */
    public final String f3518e;

    /* renamed from: f */
    public final String f3519f;

    /* renamed from: g */
    public final C3913e f3520g;

    public C2203a(String str, String str2, String str3, String str4, String str5, String str6, C3913e eVar) {
        this.f3514a = str;
        this.f3515b = str2;
        this.f3516c = str3;
        this.f3517d = str4;
        this.f3518e = str5;
        this.f3519f = str6;
        this.f3520g = eVar;
    }

    /* renamed from: a */
    public static C2203a m5558a(Context context, C2254t tVar, String str, String str2, C3913e eVar) {
        String packageName = context.getPackageName();
        String g = tVar.mo18613g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String num = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C2203a(str, str2, g, packageName, num, str3, eVar);
    }
}
