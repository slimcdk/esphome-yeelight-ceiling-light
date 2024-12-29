package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zav;

/* renamed from: com.google.android.gms.signin.internal.e */
public final class C1871e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        ConnectionResult connectionResult = null;
        zav zav = null;
        int i = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 1) {
                i = SafeParcelReader.m1457E(parcel, C);
            } else if (u == 2) {
                connectionResult = (ConnectionResult) SafeParcelReader.m1478n(parcel, C, ConnectionResult.CREATOR);
            } else if (u != 3) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                zav = (zav) SafeParcelReader.m1478n(parcel, C, zav.CREATOR);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new zak(i, connectionResult, zav);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zak[i];
    }
}
