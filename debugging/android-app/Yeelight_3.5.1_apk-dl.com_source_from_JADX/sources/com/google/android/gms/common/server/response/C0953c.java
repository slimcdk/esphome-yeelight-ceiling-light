package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.server.response.c */
public final class C0953c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        ArrayList<zal> arrayList = null;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 1) {
                i = SafeParcelReader.m1457E(parcel, C);
            } else if (u == 2) {
                arrayList = SafeParcelReader.m1483s(parcel, C, zal.CREATOR);
            } else if (u != 3) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                str = SafeParcelReader.m1479o(parcel, C);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new zan(i, arrayList, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zan[i];
    }
}
