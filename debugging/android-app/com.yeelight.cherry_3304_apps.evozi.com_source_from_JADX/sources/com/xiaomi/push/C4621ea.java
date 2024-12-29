package com.xiaomi.push;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.xiaomi.push.ea */
public class C4621ea extends C4624ed {

    /* renamed from: a */
    private String f8434a;

    public C4621ea(Context context, int i, String str) {
        super(context, i);
        this.f8434a = str;
    }

    /* renamed from: a */
    private String[] mo22734a() {
        if (TextUtils.isEmpty(this.f8434a)) {
            return null;
        }
        String b = C4529bc.m13424b(this.f8434a);
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        if (b.contains(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            return b.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        }
        return new String[]{b};
    }

    /* renamed from: a */
    public int m13786a() {
        return 24;
    }

    /* renamed from: a */
    public C4741ho m13787a() {
        return C4741ho.AppIsInstalled;
    }

    /* renamed from: a */
    public String m13788a() {
        String[] a = mo22734a();
        if (a == null || a.length <= 0) {
            return null;
        }
        PackageManager packageManager = this.f8438a.getPackageManager();
        StringBuilder sb = new StringBuilder();
        for (String packageInfo : a) {
            try {
                PackageInfo packageInfo2 = packageManager.getPackageInfo(packageInfo, 16384);
                if (packageInfo2 != null) {
                    if (sb.length() > 0) {
                        sb.append(";");
                    }
                    sb.append(packageInfo2.applicationInfo.loadLabel(packageManager).toString());
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    sb.append(packageInfo2.packageName);
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    sb.append(packageInfo2.versionName);
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    sb.append(packageInfo2.versionCode);
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    sb.append(packageInfo2.firstInstallTime);
                }
            } catch (Exception unused) {
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }
}
