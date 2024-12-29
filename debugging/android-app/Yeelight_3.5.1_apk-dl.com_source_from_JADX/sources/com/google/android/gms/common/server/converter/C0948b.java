package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.server.converter.b */
public final class C0948b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        int i = 0;
        ArrayList<zac> arrayList = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 1) {
                i = SafeParcelReader.m1457E(parcel, C);
            } else if (u != 2) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                arrayList = SafeParcelReader.m1483s(parcel, C, zac.CREATOR);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new StringToIntConverter(i, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new StringToIntConverter[i];
    }
}
