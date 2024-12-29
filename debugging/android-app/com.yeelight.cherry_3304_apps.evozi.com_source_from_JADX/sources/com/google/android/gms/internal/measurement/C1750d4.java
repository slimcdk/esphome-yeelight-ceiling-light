package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.d4 */
public final class C1750d4 extends C1698a implements C1778f2 {
    C1750d4(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    /* renamed from: b */
    public final Bundle mo11577b(Bundle bundle) {
        Parcel c = mo11409c();
        C1978s.m5922c(c, bundle);
        Parcel e = mo11410e(1, c);
        Bundle bundle2 = (Bundle) C1978s.m5920a(e, Bundle.CREATOR);
        e.recycle();
        return bundle2;
    }
}
