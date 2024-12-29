package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.vc */
public abstract class C2039vc extends C1762e1 implements C1992sc {
    public C2039vc() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo11594a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo11948b((Bundle) C1978s.m5920a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
