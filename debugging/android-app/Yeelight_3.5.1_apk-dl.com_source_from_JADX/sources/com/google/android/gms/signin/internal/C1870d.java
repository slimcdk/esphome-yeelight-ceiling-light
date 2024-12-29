package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zat;

/* renamed from: com.google.android.gms.signin.internal.d */
public final class C1870d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        int i = 0;
        zat zat = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 1) {
                i = SafeParcelReader.m1457E(parcel, C);
            } else if (u != 2) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                zat = (zat) SafeParcelReader.m1478n(parcel, C, zat.CREATOR);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new zai(i, zat);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zai[i];
    }
}
