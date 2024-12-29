package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.p105j.C1619b;
import com.google.android.gms.common.p105j.C1620c;
import com.google.android.gms.common.stats.C1640a;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C1778f2;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.s4 */
public final class C2318s4 {

    /* renamed from: a */
    final C2111a5 f4578a;

    C2318s4(C2111a5 a5Var) {
        this.f4578a = a5Var;
    }

    @VisibleForTesting
    /* renamed from: c */
    private final boolean m7547c() {
        try {
            C1619b a = C1620c.m4502a(this.f4578a.mo12428c());
            if (a != null) {
                return a.mo11303e("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f4578a.mo12427b().mo13104O().mo13130a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            this.f4578a.mo12427b().mo13104O().mo13131b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @Nullable
    @VisibleForTesting
    /* renamed from: a */
    public final Bundle mo12938a(String str, C1778f2 f2Var) {
        this.f4578a.mo12426a().mo12567h();
        if (f2Var == null) {
            this.f4578a.mo12427b().mo13099J().mo13130a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString(Constants.PACKAGE_NAME, str);
        try {
            Bundle b = f2Var.mo11577b(bundle);
            if (b != null) {
                return b;
            }
            this.f4578a.mo12427b().mo13096F().mo13130a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e) {
            this.f4578a.mo12427b().mo13096F().mo13131b("Exception occurred while retrieving the Install Referrer", e.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: b */
    public final void mo12939b(String str) {
        if (str == null || str.isEmpty()) {
            this.f4578a.mo12427b().mo13100K().mo13130a("Install Referrer Reporter was called with invalid app package name");
            return;
        }
        this.f4578a.mo12426a().mo12567h();
        if (!m7547c()) {
            this.f4578a.mo12427b().mo13102M().mo13130a("Install Referrer Reporter is not available");
            return;
        }
        C2307r4 r4Var = new C2307r4(this, str);
        this.f4578a.mo12426a().mo12567h();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.f4578a.mo12428c().getPackageManager();
        if (packageManager == null) {
            this.f4578a.mo12427b().mo13100K().mo13130a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
            return;
        }
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            this.f4578a.mo12427b().mo13102M().mo13130a("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
        if (serviceInfo != null) {
            String str2 = serviceInfo.packageName;
            if (serviceInfo.name == null || !"com.android.vending".equals(str2) || !m7547c()) {
                this.f4578a.mo12427b().mo13099J().mo13130a("Play Store version 8.3.73 or higher required for Install Referrer");
                return;
            }
            try {
                this.f4578a.mo12427b().mo13104O().mo13131b("Install Referrer Service is", C1640a.m4551b().mo11370a(this.f4578a.mo12428c(), new Intent(intent), r4Var, 1) ? "available" : "not available");
            } catch (Exception e) {
                this.f4578a.mo12427b().mo13096F().mo13131b("Exception occurred while binding to Install Referrer Service", e.getMessage());
            }
        }
    }
}
