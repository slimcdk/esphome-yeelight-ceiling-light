package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.j1 */
public abstract class C1151j1 extends C1230o0 implements C1167k1 {
    public C1151j1() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo12641c(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            long readLong = parcel.readLong();
            C1246p0.m2430c(parcel);
            mo12872g(parcel.readString(), parcel.readString(), (Bundle) C1246p0.m2428a(parcel, Bundle.CREATOR), readLong);
            parcel2.writeNoException();
        } else if (i != 2) {
            return false;
        } else {
            int b = mo12871b();
            parcel2.writeNoException();
            parcel2.writeInt(b);
        }
        return true;
    }
}
