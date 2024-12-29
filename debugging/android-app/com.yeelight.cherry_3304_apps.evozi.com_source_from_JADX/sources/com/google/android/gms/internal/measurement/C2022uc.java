package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.uc */
public final class C2022uc extends C1698a implements C1992sc {
    C2022uc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* renamed from: b */
    public final void mo11948b(Bundle bundle) {
        Parcel c = mo11409c();
        C1978s.m5922c(c, bundle);
        mo11411f(1, c);
    }
}
