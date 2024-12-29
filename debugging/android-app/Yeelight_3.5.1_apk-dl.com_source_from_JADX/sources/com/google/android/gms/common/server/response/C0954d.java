package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.server.response.d */
public final class C0954d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        String str = null;
        ArrayList<zam> arrayList = null;
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
                arrayList = SafeParcelReader.m1483s(parcel, C, zam.CREATOR);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new zal(i, str, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zal[i];
    }
}
