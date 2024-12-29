package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.internal.p */
public final class C0925p implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        IBinder iBinder = null;
        ConnectionResult connectionResult = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 1) {
                i = SafeParcelReader.m1457E(parcel, C);
            } else if (u == 2) {
                iBinder = SafeParcelReader.m1456D(parcel, C);
            } else if (u == 3) {
                connectionResult = (ConnectionResult) SafeParcelReader.m1478n(parcel, C, ConnectionResult.CREATOR);
            } else if (u == 4) {
                z = SafeParcelReader.m1486v(parcel, C);
            } else if (u != 5) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                z2 = SafeParcelReader.m1486v(parcel, C);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new zav(i, iBinder, connectionResult, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zav[i];
    }
}
