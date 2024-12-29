package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.stats.b */
public final class C0957b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int J = SafeParcelReader.m1462J(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        ArrayList<String> arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        boolean z = false;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            switch (SafeParcelReader.m1485u(C)) {
                case 1:
                    i = SafeParcelReader.m1457E(parcel2, C);
                    break;
                case 2:
                    j = SafeParcelReader.m1458F(parcel2, C);
                    break;
                case 4:
                    str = SafeParcelReader.m1479o(parcel2, C);
                    break;
                case 5:
                    i3 = SafeParcelReader.m1457E(parcel2, C);
                    break;
                case 6:
                    arrayList = SafeParcelReader.m1481q(parcel2, C);
                    break;
                case 8:
                    j2 = SafeParcelReader.m1458F(parcel2, C);
                    break;
                case 10:
                    str3 = SafeParcelReader.m1479o(parcel2, C);
                    break;
                case 11:
                    i2 = SafeParcelReader.m1457E(parcel2, C);
                    break;
                case 12:
                    str2 = SafeParcelReader.m1479o(parcel2, C);
                    break;
                case 13:
                    str4 = SafeParcelReader.m1479o(parcel2, C);
                    break;
                case 14:
                    i4 = SafeParcelReader.m1457E(parcel2, C);
                    break;
                case 15:
                    f = SafeParcelReader.m1453A(parcel2, C);
                    break;
                case 16:
                    j3 = SafeParcelReader.m1458F(parcel2, C);
                    break;
                case 17:
                    str5 = SafeParcelReader.m1479o(parcel2, C);
                    break;
                case 18:
                    z = SafeParcelReader.m1486v(parcel2, C);
                    break;
                default:
                    SafeParcelReader.m1461I(parcel2, C);
                    break;
            }
        }
        SafeParcelReader.m1484t(parcel2, J);
        return new WakeLockEvent(i, j, i2, str, i3, arrayList, str2, j2, i4, str3, str4, f, j3, str5, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WakeLockEvent[i];
    }
}
