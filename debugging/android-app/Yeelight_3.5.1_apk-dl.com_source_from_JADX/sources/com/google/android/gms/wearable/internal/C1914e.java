package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.wearable.internal.e */
public final class C1914e implements Parcelable.Creator<zzgg> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        int i = 0;
        IBinder iBinder = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 1) {
                i = SafeParcelReader.m1457E(parcel, C);
            } else if (u != 2) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                iBinder = SafeParcelReader.m1456D(parcel, C);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new zzgg(i, iBinder);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzgg[i];
    }
}
