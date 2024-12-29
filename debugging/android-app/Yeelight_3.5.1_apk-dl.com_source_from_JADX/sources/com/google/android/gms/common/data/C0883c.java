package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.data.c */
public final class C0883c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 1) {
                strArr = SafeParcelReader.m1480p(parcel, C);
            } else if (u == 2) {
                cursorWindowArr = (CursorWindow[]) SafeParcelReader.m1482r(parcel, C, CursorWindow.CREATOR);
            } else if (u == 3) {
                i2 = SafeParcelReader.m1457E(parcel, C);
            } else if (u == 4) {
                bundle = SafeParcelReader.m1470f(parcel, C);
            } else if (u != 1000) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                i = SafeParcelReader.m1457E(parcel, C);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        DataHolder dataHolder = new DataHolder(i, strArr, cursorWindowArr, i2, bundle);
        dataHolder.mo12134h0();
        return dataHolder;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DataHolder[i];
    }
}
