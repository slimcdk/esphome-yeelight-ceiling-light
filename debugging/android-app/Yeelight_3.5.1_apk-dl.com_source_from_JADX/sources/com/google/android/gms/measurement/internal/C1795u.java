package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import p113x.C3897a;

/* renamed from: com.google.android.gms.measurement.internal.u */
public final class C1795u implements Parcelable.Creator {
    /* renamed from: a */
    static void m4773a(zzaw zzaw, Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11122r(parcel, 2, zzaw.f2855a, false);
        C3897a.m11121q(parcel, 3, zzaw.f2856b, i, false);
        C3897a.m11122r(parcel, 4, zzaw.f2857c, false);
        C3897a.m11118n(parcel, 5, zzaw.f2858d);
        C3897a.m11106b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        String str = null;
        zzau zzau = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            int u = SafeParcelReader.m1485u(C);
            if (u == 2) {
                str = SafeParcelReader.m1479o(parcel, C);
            } else if (u == 3) {
                zzau = (zzau) SafeParcelReader.m1478n(parcel, C, zzau.CREATOR);
            } else if (u == 4) {
                str2 = SafeParcelReader.m1479o(parcel, C);
            } else if (u != 5) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                j = SafeParcelReader.m1458F(parcel, C);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new zzaw(str, zzau, str2, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaw[i];
    }
}
