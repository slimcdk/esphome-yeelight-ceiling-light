package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.wearable.d */
public final class C1907d implements Parcelable.Creator<ConnectionConfiguration> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            switch (SafeParcelReader.m1485u(C)) {
                case 2:
                    str = SafeParcelReader.m1479o(parcel, C);
                    break;
                case 3:
                    str2 = SafeParcelReader.m1479o(parcel, C);
                    break;
                case 4:
                    i = SafeParcelReader.m1457E(parcel, C);
                    break;
                case 5:
                    i2 = SafeParcelReader.m1457E(parcel, C);
                    break;
                case 6:
                    z = SafeParcelReader.m1486v(parcel, C);
                    break;
                case 7:
                    z2 = SafeParcelReader.m1486v(parcel, C);
                    break;
                case 8:
                    str3 = SafeParcelReader.m1479o(parcel, C);
                    break;
                case 9:
                    z3 = SafeParcelReader.m1486v(parcel, C);
                    break;
                case 10:
                    str4 = SafeParcelReader.m1479o(parcel, C);
                    break;
                case 11:
                    str5 = SafeParcelReader.m1479o(parcel, C);
                    break;
                default:
                    SafeParcelReader.m1461I(parcel, C);
                    break;
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new ConnectionConfiguration(str, str2, i, i2, z, z2, str3, z3, str4, str5);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ConnectionConfiguration[i];
    }
}
