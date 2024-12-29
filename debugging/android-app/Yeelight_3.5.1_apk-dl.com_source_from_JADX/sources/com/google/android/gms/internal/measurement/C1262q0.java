package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.q0 */
public final class C1262q0 extends C1214n0 implements C1294s0 {
    C1262q0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    /* renamed from: a */
    public final Bundle mo13075a(Bundle bundle) {
        Parcel c = mo13002c();
        C1246p0.m2432e(c, bundle);
        Parcel e = mo13003e(1, c);
        Bundle bundle2 = (Bundle) C1246p0.m2428a(e, Bundle.CREATOR);
        e.recycle();
        return bundle2;
    }
}
