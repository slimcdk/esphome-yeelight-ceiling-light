package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.util.VisibleForTesting;
import p028e0.C3143b;
import p028e0.C3144c;

/* renamed from: com.google.android.gms.measurement.internal.u4 */
public final class C1800u4 {

    /* renamed from: a */
    final C1717n5 f2703a;

    C1800u4(C1770ra raVar) {
        this.f2703a = raVar.mo14471b0();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: a */
    public final boolean mo14602a() {
        try {
            C3143b a = C3144c.m8403a(this.f2703a.mo14231f());
            if (a != null) {
                return a.mo23629d("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f2703a.mo14228b().mo14039v().mo14693a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            this.f2703a.mo14228b().mo14039v().mo14694b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
