package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.db */
public final class C1594db implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int J = SafeParcelReader.m1462J(parcel);
        String str = "";
        String str2 = str;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str10 = null;
        String str11 = null;
        long j6 = -2147483648L;
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        boolean z3 = true;
        boolean z4 = false;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            switch (SafeParcelReader.m1485u(C)) {
                case 2:
                    str3 = SafeParcelReader.m1479o(parcel2, C);
                    break;
                case 3:
                    str4 = SafeParcelReader.m1479o(parcel2, C);
                    break;
                case 4:
                    str5 = SafeParcelReader.m1479o(parcel2, C);
                    break;
                case 5:
                    str6 = SafeParcelReader.m1479o(parcel2, C);
                    break;
                case 6:
                    j = SafeParcelReader.m1458F(parcel2, C);
                    break;
                case 7:
                    j2 = SafeParcelReader.m1458F(parcel2, C);
                    break;
                case 8:
                    str7 = SafeParcelReader.m1479o(parcel2, C);
                    break;
                case 9:
                    z = SafeParcelReader.m1486v(parcel2, C);
                    break;
                case 10:
                    z2 = SafeParcelReader.m1486v(parcel2, C);
                    break;
                case 11:
                    j6 = SafeParcelReader.m1458F(parcel2, C);
                    break;
                case 12:
                    str8 = SafeParcelReader.m1479o(parcel2, C);
                    break;
                case 13:
                    j3 = SafeParcelReader.m1458F(parcel2, C);
                    break;
                case 14:
                    j4 = SafeParcelReader.m1458F(parcel2, C);
                    break;
                case 15:
                    i = SafeParcelReader.m1457E(parcel2, C);
                    break;
                case 16:
                    z3 = SafeParcelReader.m1486v(parcel2, C);
                    break;
                case 18:
                    z4 = SafeParcelReader.m1486v(parcel2, C);
                    break;
                case 19:
                    str9 = SafeParcelReader.m1479o(parcel2, C);
                    break;
                case 21:
                    bool = SafeParcelReader.m1487w(parcel2, C);
                    break;
                case 22:
                    j5 = SafeParcelReader.m1458F(parcel2, C);
                    break;
                case 23:
                    arrayList = SafeParcelReader.m1481q(parcel2, C);
                    break;
                case 24:
                    str10 = SafeParcelReader.m1479o(parcel2, C);
                    break;
                case 25:
                    str = SafeParcelReader.m1479o(parcel2, C);
                    break;
                case 26:
                    str2 = SafeParcelReader.m1479o(parcel2, C);
                    break;
                case 27:
                    str11 = SafeParcelReader.m1479o(parcel2, C);
                    break;
                default:
                    SafeParcelReader.m1461I(parcel2, C);
                    break;
            }
        }
        SafeParcelReader.m1484t(parcel2, J);
        return new zzq(str3, str4, str5, str6, j, j2, str7, z, z2, j6, str8, j3, j4, i, z3, z4, str9, bool, j5, (List) arrayList, str10, str, str2, str11);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzq[i];
    }
}
