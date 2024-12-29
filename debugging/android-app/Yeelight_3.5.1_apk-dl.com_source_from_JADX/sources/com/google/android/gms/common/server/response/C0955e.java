package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.server.response.e */
public final class C0955e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        Parcel parcel2 = null;
        zan zan = null;
        int i = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 1) {
                i = SafeParcelReader.m1457E(parcel, C);
            } else if (u == 2) {
                parcel2 = SafeParcelReader.m1476l(parcel, C);
            } else if (u != 3) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                zan = (zan) SafeParcelReader.m1478n(parcel, C, zan.CREATOR);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new SafeParcelResponse(i, parcel2, zan);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SafeParcelResponse[i];
    }
}
