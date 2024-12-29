package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.api.o */
public final class C0876o implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        ConnectionResult connectionResult = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 1) {
                i2 = SafeParcelReader.m1457E(parcel, C);
            } else if (u == 2) {
                str = SafeParcelReader.m1479o(parcel, C);
            } else if (u == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.m1478n(parcel, C, PendingIntent.CREATOR);
            } else if (u == 4) {
                connectionResult = (ConnectionResult) SafeParcelReader.m1478n(parcel, C, ConnectionResult.CREATOR);
            } else if (u != 1000) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                i = SafeParcelReader.m1457E(parcel, C);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new Status(i, i2, str, pendingIntent, connectionResult);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
