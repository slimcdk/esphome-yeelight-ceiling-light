package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.measurement.internal.t */
public final class C1783t implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            if (SafeParcelReader.m1485u(C) != 2) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                bundle = SafeParcelReader.m1470f(parcel, C);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new zzau(bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzau[i];
    }
}
