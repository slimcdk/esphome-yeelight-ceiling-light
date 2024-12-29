package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.measurement.internal.d */
public final class C1582d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int J = SafeParcelReader.m1462J(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        zzlo zzlo = null;
        String str3 = null;
        zzaw zzaw = null;
        zzaw zzaw2 = null;
        zzaw zzaw3 = null;
        boolean z = false;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            switch (SafeParcelReader.m1485u(C)) {
                case 2:
                    str = SafeParcelReader.m1479o(parcel2, C);
                    break;
                case 3:
                    str2 = SafeParcelReader.m1479o(parcel2, C);
                    break;
                case 4:
                    zzlo = (zzlo) SafeParcelReader.m1478n(parcel2, C, zzlo.CREATOR);
                    break;
                case 5:
                    j = SafeParcelReader.m1458F(parcel2, C);
                    break;
                case 6:
                    z = SafeParcelReader.m1486v(parcel2, C);
                    break;
                case 7:
                    str3 = SafeParcelReader.m1479o(parcel2, C);
                    break;
                case 8:
                    zzaw = (zzaw) SafeParcelReader.m1478n(parcel2, C, zzaw.CREATOR);
                    break;
                case 9:
                    j2 = SafeParcelReader.m1458F(parcel2, C);
                    break;
                case 10:
                    zzaw2 = (zzaw) SafeParcelReader.m1478n(parcel2, C, zzaw.CREATOR);
                    break;
                case 11:
                    j3 = SafeParcelReader.m1458F(parcel2, C);
                    break;
                case 12:
                    zzaw3 = (zzaw) SafeParcelReader.m1478n(parcel2, C, zzaw.CREATOR);
                    break;
                default:
                    SafeParcelReader.m1461I(parcel2, C);
                    break;
            }
        }
        SafeParcelReader.m1484t(parcel2, J);
        return new zzac(str, str2, zzlo, j, z, str3, zzaw, j2, zzaw2, j3, zzaw3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzac[i];
    }
}
