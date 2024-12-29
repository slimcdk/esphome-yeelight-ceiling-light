package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.internal.q */
public final class C0926q implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        int i = 0;
        Scope[] scopeArr = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 1) {
                i = SafeParcelReader.m1457E(parcel, C);
            } else if (u == 2) {
                i2 = SafeParcelReader.m1457E(parcel, C);
            } else if (u == 3) {
                i3 = SafeParcelReader.m1457E(parcel, C);
            } else if (u != 4) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                scopeArr = (Scope[]) SafeParcelReader.m1482r(parcel, C, Scope.CREATOR);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new zax(i, i2, i3, scopeArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zax[i];
    }
}
