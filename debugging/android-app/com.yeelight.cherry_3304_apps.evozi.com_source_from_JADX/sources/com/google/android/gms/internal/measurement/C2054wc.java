package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.wc */
public abstract class C2054wc extends C1762e1 implements C2069xc {
    public C2054wc() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo11594a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo11541p0(parcel.readString(), parcel.readString(), (Bundle) C1978s.m5920a(parcel, Bundle.CREATOR), parcel.readLong());
            parcel2.writeNoException();
        } else if (i != 2) {
            return false;
        } else {
            int C = mo11540C();
            parcel2.writeNoException();
            parcel2.writeInt(C);
        }
        return true;
    }
}
