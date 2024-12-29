package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.google.android.gms.measurement.internal.i4 */
public final class C1652i4 extends C1606ea {
    public C1652i4(C1770ra raVar) {
        super(raVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo14018l() {
        return false;
    }

    /* renamed from: m */
    public final boolean mo14237m() {
        mo14128i();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f2143a.mo14231f().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }
}
