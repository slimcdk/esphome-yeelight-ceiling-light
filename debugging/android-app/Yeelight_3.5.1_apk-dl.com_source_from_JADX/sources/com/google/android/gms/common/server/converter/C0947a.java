package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.server.converter.a */
public final class C0947a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        int i = 0;
        StringToIntConverter stringToIntConverter = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 1) {
                i = SafeParcelReader.m1457E(parcel, C);
            } else if (u != 2) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                stringToIntConverter = (StringToIntConverter) SafeParcelReader.m1478n(parcel, C, StringToIntConverter.CREATOR);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new zaa(i, stringToIntConverter);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zaa[i];
    }
}
