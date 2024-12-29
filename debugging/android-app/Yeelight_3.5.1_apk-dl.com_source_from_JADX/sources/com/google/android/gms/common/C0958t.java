package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.t */
public final class C0958t implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        boolean z = false;
        String str = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 1) {
                z = SafeParcelReader.m1486v(parcel, C);
            } else if (u == 2) {
                str = SafeParcelReader.m1479o(parcel, C);
            } else if (u == 3) {
                i = SafeParcelReader.m1457E(parcel, C);
            } else if (u != 4) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                i2 = SafeParcelReader.m1457E(parcel, C);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new zzq(z, str, i, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzq[i];
    }
}
