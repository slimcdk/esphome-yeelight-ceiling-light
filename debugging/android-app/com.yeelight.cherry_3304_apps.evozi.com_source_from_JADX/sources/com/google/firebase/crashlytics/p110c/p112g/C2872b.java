package com.google.firebase.crashlytics.p110c.p112g;

import android.content.Context;
import android.content.pm.PackageInfo;

/* renamed from: com.google.firebase.crashlytics.c.g.b */
class C2872b {

    /* renamed from: a */
    public final String f5532a;

    /* renamed from: b */
    public final String f5533b;

    /* renamed from: c */
    public final String f5534c;

    /* renamed from: d */
    public final String f5535d;

    /* renamed from: e */
    public final String f5536e;

    /* renamed from: f */
    public final String f5537f;

    public C2872b(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f5532a = str;
        this.f5533b = str2;
        this.f5534c = str3;
        this.f5535d = str4;
        this.f5536e = str5;
        this.f5537f = str6;
    }

    /* renamed from: a */
    public static C2872b m8749a(Context context, C2955v vVar, String str, String str2) {
        String packageName = context.getPackageName();
        String e = vVar.mo17296e();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String num = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C2872b(str, str2, e, packageName, num, str3);
    }
}
