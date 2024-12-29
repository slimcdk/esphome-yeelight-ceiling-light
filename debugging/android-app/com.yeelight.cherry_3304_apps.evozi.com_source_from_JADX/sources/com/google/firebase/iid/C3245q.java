package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.android.gms.common.util.C1660n;
import com.google.firebase.C2816c;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.firebase.iid.q */
public final class C3245q {

    /* renamed from: a */
    private final Context f6277a;
    @GuardedBy("this")

    /* renamed from: b */
    private String f6278b;
    @GuardedBy("this")

    /* renamed from: c */
    private String f6279c;
    @GuardedBy("this")

    /* renamed from: d */
    private int f6280d;
    @GuardedBy("this")

    /* renamed from: e */
    private int f6281e = 0;

    public C3245q(Context context) {
        this.f6277a = context;
    }

    /* renamed from: a */
    private final PackageInfo m10094a(String str) {
        try {
            return this.f6277a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            sb.toString();
            return null;
        }
    }

    /* renamed from: b */
    public static String m10095b(C2816c cVar) {
        String d = cVar.mo17064j().mo17743d();
        if (d != null) {
            return d;
        }
        String c = cVar.mo17064j().mo17742c();
        if (!c.startsWith("1:")) {
            return c;
        }
        String[] split = c.split(Constants.COLON_SEPARATOR);
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: h */
    private final synchronized void m10096h() {
        PackageInfo a = m10094a(this.f6277a.getPackageName());
        if (a != null) {
            this.f6278b = Integer.toString(a.versionCode);
            this.f6279c = a.versionName;
        }
    }

    /* renamed from: c */
    public final boolean mo17855c() {
        return mo17856d() != 0;
    }

    /* renamed from: d */
    public final synchronized int mo17856d() {
        if (this.f6281e != 0) {
            return this.f6281e;
        }
        PackageManager packageManager = this.f6277a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        if (!C1660n.m4609i()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f6281e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            if (C1660n.m4609i()) {
                this.f6281e = 2;
            } else {
                this.f6281e = 1;
            }
            return this.f6281e;
        }
        this.f6281e = 2;
        return 2;
    }

    /* renamed from: e */
    public final synchronized String mo17857e() {
        if (this.f6278b == null) {
            m10096h();
        }
        return this.f6278b;
    }

    /* renamed from: f */
    public final synchronized String mo17858f() {
        if (this.f6279c == null) {
            m10096h();
        }
        return this.f6279c;
    }

    /* renamed from: g */
    public final synchronized int mo17859g() {
        PackageInfo a;
        if (this.f6280d == 0 && (a = m10094a("com.google.android.gms")) != null) {
            this.f6280d = a.versionCode;
        }
        return this.f6280d;
    }
}
