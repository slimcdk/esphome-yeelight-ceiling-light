package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* renamed from: com.google.android.gms.common.server.response.b */
public final class C0952b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        String str = null;
        FastJsonResponse.Field field = null;
        int i = 0;
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
                field = (FastJsonResponse.Field) SafeParcelReader.m1478n(parcel, C, FastJsonResponse.Field.CREATOR);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new zam(i, str, field);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zam[i];
    }
}
