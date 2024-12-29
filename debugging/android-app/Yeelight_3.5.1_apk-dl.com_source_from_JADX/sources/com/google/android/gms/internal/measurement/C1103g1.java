package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.g1 */
public abstract class C1103g1 extends C1230o0 implements C1119h1 {
    public C1103g1() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo12641c(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        C1246p0.m2430c(parcel);
        mo12512a((Bundle) C1246p0.m2428a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
