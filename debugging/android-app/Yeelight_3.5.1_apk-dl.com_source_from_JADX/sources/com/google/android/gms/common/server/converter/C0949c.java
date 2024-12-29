package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.server.converter.c */
public final class C0949c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        int i = 0;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 1) {
                i = SafeParcelReader.m1457E(parcel, C);
            } else if (u == 2) {
                str = SafeParcelReader.m1479o(parcel, C);
            } else if (u != 3) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                i2 = SafeParcelReader.m1457E(parcel, C);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new zac(i, str, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zac[i];
    }
}
