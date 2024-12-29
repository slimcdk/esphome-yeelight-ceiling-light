package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.s */
public final class C0946s implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 1) {
                str = SafeParcelReader.m1479o(parcel, C);
            } else if (u == 2) {
                z = SafeParcelReader.m1486v(parcel, C);
            } else if (u == 3) {
                z2 = SafeParcelReader.m1486v(parcel, C);
            } else if (u == 4) {
                iBinder = SafeParcelReader.m1456D(parcel, C);
            } else if (u != 5) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                z3 = SafeParcelReader.m1486v(parcel, C);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new zzo(str, z, z2, iBinder, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
